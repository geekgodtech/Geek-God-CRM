B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.4
@EndOfDesignText@
'//<START-AppointmentPage-S01>
Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	
	' UI Elements (Created Programmatically)
	Private Panel1 As B4XView
	Private lblClientName As B4XView
	Private lblClientPhone As B4XView
	Private lblClientAddr As B4XView
	Private txtIssue As B4XView
	
	' Dynamic UI Elements
	Private TopNavBar As B4XView
	Private SlotContainer As ScrollView
	Private spnUserFilter As Spinner
	
	' Data Holders
	Private CurrentClient As Map
	Private SelectedDate As Long
	Private SelectedUser As String
	
	' --- FIX: Anchor Date for the Top Bar (Prevents sliding/cycling) ---
	Private DateBarAnchor As Long
	
	' Map to store Event Details (Key=Hour, Value=Map of Info)
	Private ExistingEvents As Map
	
	' Booking State
	Public PendingSlotHour As Int = -1
	
	' Alarm Logic
	Private AlarmTimer As Timer
	Private CurrentAppointmentCompleted As Boolean = False
	
	' --- DIALOGS ---
	Private Dialog As B4XDialog
	
	' --- RESIZE TOOLS ---
	Private ResizeTimer As Timer
	Private IsPageReady As Boolean = False
	Private LastWidth As Int = 0
End Sub

Public Sub Initialize
	SelectedDate = DateTime.Now
	DateBarAnchor = DateTime.Now ' Initialize Anchor to Today
	
	ExistingEvents.Initialize
	CurrentClient.Initialize
	CurrentClient.Put("Name", "")
	CurrentClient.Put("Phone", "")
	CurrentClient.Put("Address", "")
	CurrentClient.Put("Notes", "")
	
	AlarmTimer.Initialize("AlarmTimer", 30000)
	AlarmTimer.Enabled = True
	
	ResizeTimer.Initialize("ResizeTimer", 400)
	ResizeTimer.Enabled = False
End Sub

Private Sub ResizeTimer_Tick
	If IsPageReady = False Then Return
	If Root.IsInitialized = False Then Return
	
	Dim ScreenW As Int = GetDeviceLayoutValues.Width
	Dim ScreenH As Int = GetDeviceLayoutValues.Height
	
	If Abs(ScreenW - LastWidth) > 20 Then
		B4XPage_Resize(ScreenW, ScreenH)
	End If
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	
	' 1. INITIALIZE MAIN PANEL
	Panel1 = xui.CreatePanel("Panel1")
	Panel1.Color = xui.Color_White
	Root.AddView(Panel1, 0, 0, Root.Width, Root.Height)
	
	Dialog.Initialize(Root)
	
	IsPageReady = False
	
	' --- FIX: Start the Build Loop Immediately ---
	CallSubDelayed(Me, "BuildUI")
End Sub

Private Sub B4XPage_Appear
	Try
		' Redundant trigger to ensure UI is built if Created loop missed it
		CallSubDelayed(Me, "BuildUI")
		ResizeTimer.Enabled = True
	Catch
		Log("Error in Appear: " & LastException)
	End Try
End Sub

' --- FIX: The Persistence Loop (Copies logic from ViewSchedulePage) ---
Public Sub BuildUI
	' 1. Determine User
	If File.Exists(File.DirInternal, "settings.map") Then
		Dim settings As Map = File.ReadMap(File.DirInternal, "settings.map")
		SelectedUser = settings.GetDefault("CurrentUser", "Mike")
	Else
		SelectedUser = "Mike"
	End If
	
	' 2. Wait for Layout
	If Root.Width = 0 Then
		Sleep(50)
		CallSubDelayed(Me, "BuildUI")
		Return
	End If
	
	' 3. Build Interface if not ready
	If IsPageReady = False Or Abs(Root.Width - LastWidth) > 20dip Then
		BuildInterface
		
		' Set Spinner Selection
		If spnUserFilter.IsInitialized Then
			If SelectedUser = "Mike" Then spnUserFilter.SelectedIndex = 0 Else spnUserFilter.SelectedIndex = 1
		End If
		
		' [FIX] If data was passed via SetClient before UI was ready, apply it now.
		If CurrentClient.Get("Name") <> "" Then
			' This will populate labels, BuildDateBar, and RefreshSchedule
			LoadClientForAppt(CurrentClient)
		Else
			RefreshSchedule
		End If
		
		IsPageReady = True
		LastWidth = Root.Width
		B4XPage_Resize(Root.Width, Root.Height)
	End If
End Sub

Private Sub B4XPage_Disappear
	ResizeTimer.Enabled = False
End Sub
'Total Subroutines in Section S01 recorded last edit: 7
'Total Subroutines in Section S01 recorded after this edit - 7
'Total Subroutines added in this edit - 0
'Total Subroutines removed in this edit - 0
'Difference between edits- 0
'Total Discrepancies - 0
'//<END-AppointmentPage-S01>





'//<START-AppointmentPage-S02>
' =========================================================
' ===           UI CONSTRUCTION & GRID LOGIC            ===
' =========================================================

Private Sub BuildInterface
	Panel1.RemoveAllViews
	
	' 1. HEADER ROW (0 - 50dip)
	Dim pnlHeader As B4XView = xui.CreatePanel("")
	pnlHeader.Color = 0xFFF5F5F5
	Panel1.AddView(pnlHeader, 0, 0, Root.Width, 50dip)
	
	Dim btnHome As Label : btnHome.Initialize("btnHome")
	Dim xHome As B4XView = btnHome
	xHome.Text = Chr(0xF015)
	btnHome.Typeface = Typeface.FONTAWESOME
	xHome.TextSize = 24
	xHome.TextColor = xui.Color_Black
	xHome.SetTextAlignment("CENTER", "CENTER")
	pnlHeader.AddView(xHome, 5dip, 0, 50dip, 50dip)
	
	spnUserFilter.Initialize("spnUserFilter")
	spnUserFilter.AddAll(Array As String("God (Mike)", "Goddess (Erin)"))
	pnlHeader.AddView(spnUserFilter, 60dip, 2dip, 200dip, 45dip)
	
	' 2. CLIENT INFO CARD (50dip - 130dip)
	Dim pnlClient As B4XView = xui.CreatePanel("")
	pnlClient.SetColorAndBorder(xui.Color_White, 0, 0, 0)
	Panel1.AddView(pnlClient, 0, 50dip, Root.Width, 80dip)
	
	' [UPDATED] Using Custom Fonts
	lblClientName = CreateLabel("lblClientName", "Client Name", 20, xui.Color_Black, "appointmentpage - name.ttf")
	pnlClient.AddView(lblClientName, 15dip, 5dip, Root.Width - 30dip, 30dip)
	
	lblClientPhone = CreateLabel("lblClientPhone", "Phone Number", 14, 0xFF555555, "appointmentpage - labels.ttf")
	pnlClient.AddView(lblClientPhone, 15dip, 35dip, Root.Width - 30dip, 20dip)
	
	lblClientAddr = CreateLabel("lblClientAddr", "Address", 14, 0xFF777777, "appointmentpage - labels.ttf")
	pnlClient.AddView(lblClientAddr, 15dip, 55dip, Root.Width - 30dip, 25dip)

	' 3. DATE BAR (130dip - 190dip)
	TopNavBar = xui.CreatePanel("")
	Panel1.AddView(TopNavBar, 0, 130dip, Root.Width, 60dip)
	
	' 4. SLOTS SCROLLVIEW (190dip - Bottom)
	SlotContainer.Initialize(800dip)
	Panel1.AddView(SlotContainer, 0, 190dip, Root.Width, Root.Height - 190dip)
	
	BuildDateBar(Root.Width)
End Sub

Private Sub CreateLabel(EventName As String, Text As String, Size As Int, Color As Int, FontName As String) As B4XView
	Dim lbl As Label
	lbl.Initialize(EventName)
	Dim xlbl As B4XView = lbl
	xlbl.Text = Text
	xlbl.TextSize = Size
	xlbl.TextColor = Color
	' [UPDATED] Now uses LoadSafeFont
	lbl.Typeface = LoadSafeFont(FontName)
	Return xlbl
End Sub

' [NEW] Points to Internal Storage / Geek God CRM / Fonts
Private Sub LoadSafeFont(FontName As String) As Typeface
	Dim BaseDir As String = File.DirRootExternal & "/Geek God CRM/Fonts"
	If File.Exists(BaseDir, FontName) Then
		Try
			Dim jo As JavaObject
			jo.InitializeStatic("android.graphics.Typeface")
			Return jo.RunMethod("createFromFile", Array(File.Combine(BaseDir, FontName)))
		Catch
			Log("Error loading external font: " & FontName)
		End Try
	End If
	If File.Exists(File.DirAssets, FontName) Then
		Return Typeface.LoadFromAssets(FontName)
	End If
	Return Typeface.DEFAULT_BOLD
End Sub

' =========================================================
' ===            MASTER RESIZE RECEIVER                 ===
' =========================================================

Public Sub RedrawUI(CurrentW As Int)
	If Root.IsInitialized = False Then Return
	
	' --- FIX: Clamp Width to Hardware Reality ---
	Dim HardwareW As Int = GetDeviceLayoutValues.Width
	If CurrentW > HardwareW Then CurrentW = HardwareW

	' Standardized layout routing based on Main Page Engine
	If CurrentW > 1300 Then
		Log(">>> [AppointmentPage] RedrawUI: Mike Open Big / Unfolded (" & CurrentW & ")")
	Else If CurrentW > 850 Then
		Log(">>> [AppointmentPage] RedrawUI: Mike Closed Small / Tall Phone (" & CurrentW & ")")
	Else
		Log(">>> [AppointmentPage] RedrawUI: Erin's Phone (" & CurrentW & ")")
	End If
	
	' Route to standard resize
	B4XPage_Resize(CurrentW, Root.Height)
End Sub

Private Sub B4XPage_Resize (Width As Int, Height As Int)
	If Root.IsInitialized = False Then Return
	If Width <= 0 Then Return
	
	' --- FIX: Hardware Clamp ---
	Dim HardwareW As Int = GetDeviceLayoutValues.Width
	If Width > HardwareW Then Width = HardwareW
	
	LastWidth = Width
	
	If Panel1.IsInitialized Then Panel1.SetLayoutAnimated(0, 0, 0, Width, Height)
	
	' Layout Logic for Sections
	If TopNavBar.IsInitialized Then
		TopNavBar.SetLayoutAnimated(0, 0, 130dip, Width, 60dip)
	End If
	
	If SlotContainer.IsInitialized Then
		SlotContainer.SetLayoutAnimated(0, 0, 190dip, Width, Height - 190dip)
		SlotContainer.Panel.Width = Width
		BuildTimeGrid(Width)
	End If
	
	BuildDateBar(Width)
End Sub
'//<END-AppointmentPage-S02>





'//<START-AppointmentPage-S03>
Private Sub BuildDateBar(CurrentWidth As Int)
	' [FIXED] Failsafe: If layout engine is lagging, use screen width
	Dim HardwareW As Int = GetDeviceLayoutValues.Width
	If CurrentWidth <= 0 Or CurrentWidth > HardwareW Then CurrentWidth = HardwareW

	TopNavBar.RemoveAllViews
	
	Dim ArrowWidth As Int = 50dip
	Dim DaysAreaWidth As Int = CurrentWidth - ArrowWidth - 5dip
	Dim itemW As Int = DaysAreaWidth / 7
	Dim currentX As Int = 2dip
	
	Dim tfDate As Typeface = LoadSafeFont("appointmentpage - labels.ttf")
	
	For i = 0 To 6
		' Use DateBarAnchor (Static)
		Dim d As Long = DateTime.Add(DateBarAnchor, 0, 0, i)
		
		Dim p As B4XView = xui.CreatePanel("DateLink")
		p.Tag = d
		
		Dim lblDay As Label : lblDay.Initialize("")
		Dim xDay As B4XView = lblDay
		DateTime.DateFormat = "EEE"
		Dim dayName As String = DateTime.Date(d)
		DateTime.DateFormat = "MM/dd"
		Dim dayDate As String = DateTime.Date(d)
		xDay.Text = dayName & CRLF & dayDate
		xDay.TextSize = 10
		xDay.SetTextAlignment("CENTER", "CENTER")
		lblDay.Typeface = tfDate
		
		' Highlight Logic
		If IsSameDay(d, SelectedDate) Then
			p.SetColorAndBorder(xui.Color_Blue, 0, 0, 5dip)
			xDay.TextColor = xui.Color_White
		Else
			p.SetColorAndBorder(xui.Color_LightGray, 1dip, xui.Color_Gray, 5dip)
			xDay.TextColor = xui.Color_Black
		End If
		
		p.AddView(xDay, 0, 0, itemW, 50dip)
		TopNavBar.AddView(p, currentX, 5dip, itemW, 50dip)
		currentX = currentX + itemW + 2dip
	Next
	
	Dim pArrow As B4XView = xui.CreatePanel("btnDatePicker")
	Dim lblArrow As Label : lblArrow.Initialize("")
	Dim xArrow As B4XView = lblArrow
	xArrow.Text = "➔"
	xArrow.TextColor = xui.Color_Blue
	xArrow.SetTextAlignment("CENTER", "CENTER")
	xArrow.TextSize = 24
	pArrow.AddView(xArrow, 0, 0, ArrowWidth, 50dip)
	
	TopNavBar.AddView(pArrow, CurrentWidth - ArrowWidth, 5dip, ArrowWidth, 50dip)
End Sub

Private Sub IsSameDay(d1 As Long, d2 As Long) As Boolean
	Return DateTime.Date(d1) = DateTime.Date(d2)
End Sub

Private Sub BuildTimeGrid(CurrentWidth As Int)
	' --- FIX: Strict Hardware Clamp ---
	Dim HardwareW As Int = GetDeviceLayoutValues.Width
	If CurrentWidth <= 0 Or CurrentWidth > HardwareW Then CurrentWidth = HardwareW

	Dim PnlIn As B4XView = SlotContainer.Panel
	PnlIn.RemoveAllViews
	Dim topPos As Int = 10dip
	
	' [FOLDABLE UPGRADE] Force Compact Mode if Width is small OR if device is in Tabletop Mode
	Dim IsSmallScreen As Boolean = (CurrentWidth < 1300 Or B4XPages.MainPage.LastFoldState = "HALF_OPENED")
	
	Dim rowH As Int = 90dip
	If IsSmallScreen Then rowH = 120dip
	
	Dim NowTicks As Long = DateTime.Now
	DateTime.DateFormat = "yyyyMMdd"
	Dim TodayStr As String = DateTime.Date(NowTicks)
	Dim SelStr As String = DateTime.Date(SelectedDate)
	Dim CurHour As Int = DateTime.GetHour(NowTicks)
	Dim IsPastDate As Boolean = (SelectedDate < DateUtils.SetDate(DateTime.GetYear(NowTicks), DateTime.GetMonth(NowTicks), DateTime.GetDayOfMonth(NowTicks)))
	Dim IsToday As Boolean = (TodayStr = SelStr)
	
	Dim tfLabels As Typeface = LoadSafeFont("appointmentpage - labels.ttf")
	Dim tfButtons As Typeface = LoadSafeFont("appointmentpage - buttons.ttf")
	
	For hr = 10 To 20
		Dim p As B4XView = xui.CreatePanel("")
		p.SetColorAndBorder(xui.Color_White, 1dip, 0xFFEEEEEE, 0)
		
		' --- COL 1: TIME ---
		Dim displayTime As String
		If hr > 12 Then : displayTime = (hr - 12) & ":00 PM" : Else If hr = 12 Then : displayTime = "12:00 PM" : Else : displayTime = hr & ":00 AM" : End If
			
			Dim TimeWidth As Int = 75dip
			Dim lblT As Label : lblT.Initialize("") : Dim xT As B4XView = lblT
			xT.Text = displayTime : xT.TextColor = xui.Color_Black : xT.TextSize = 14
			xT.SetTextAlignment("CENTER", "LEFT")
			lblT.Typeface = tfLabels
			p.AddView(xT, 5dip, 0, TimeWidth, rowH)
			
			' --- COL 2: CENTER INFO ---
			Dim ButtonWidth As Int = 110dip
			Dim StartX As Int = TimeWidth + 5dip
			Dim CenterWidth As Int = CurrentWidth - StartX - ButtonWidth - 10dip
			
			If ExistingEvents.ContainsKey(hr) Then
				Dim EvData As Map = ExistingEvents.Get(hr)
				Dim cName As String = EvData.Get("Name")
				Dim cPhone As String = EvData.Get("Phone")
				Dim cAddr As String = CleanAddress(EvData.Get("Addr"))
				Dim cIssue As String = EvData.Get("Issue")
				Dim cEventId As String = EvData.Get("EventId")
				Dim IsPrimary As Boolean = EvData.Get("IsPrimary")
				
				If IsSmallScreen Then
					' --- STACKED LAYOUT ---
					Dim l1 As Label : l1.Initialize("lblBookedName") : Dim x1 As B4XView = l1
					x1.Text = cName : x1.TextColor = xui.Color_Blue : x1.TextSize = 14
					l1.Typeface = tfLabels : x1.Tag = cName
					p.AddView(x1, StartX, 10dip, CenterWidth, 20dip)
					
					Dim l2 As Label : l2.Initialize("lblBookedPhone") : Dim x2 As B4XView = l2
					x2.Text = cPhone : x2.TextColor = xui.Color_Blue : x2.TextSize = 13 : x2.Tag = cPhone
					l2.Typeface = tfLabels
					p.AddView(x2, StartX, 32dip, CenterWidth, 20dip)
					
					Dim l3 As Label : l3.Initialize("lblBookedAddr") : Dim x3 As B4XView = l3
					x3.Text = cAddr : x3.TextColor = xui.Color_Blue : x3.TextSize = 12 : x3.Tag = cAddr
					l3.Typeface = tfLabels
					p.AddView(x3, StartX, 54dip, CenterWidth, 20dip)
					
					Dim l4 As Label : l4.Initialize("") : Dim x4 As B4XView = l4
					x4.Text = cIssue : x4.TextColor = xui.Color_Black : x4.TextSize = 12
					l4.Typeface = tfLabels
					p.AddView(x4, StartX, 76dip, CenterWidth, 40dip)
				Else
					' --- WIDE LAYOUT ---
					Dim SplitW As Int = CenterWidth / 2
					Dim lN As Label : lN.Initialize("lblBookedName") : Dim xN As B4XView = lN
					xN.Text = cName : xN.TextColor = xui.Color_Blue : xN.TextSize = 14 : lN.Typeface = tfLabels : xN.Tag = cName
					xN.SetTextAlignment("CENTER", "RIGHT")
					p.AddView(xN, StartX, 15dip, SplitW - 5dip, 25dip)
					
					Dim lP As Label : lP.Initialize("lblBookedPhone") : Dim xP As B4XView = lP
					xP.Text = cPhone : xP.TextColor = xui.Color_Blue : xP.TextSize = 13 : xP.Tag = cPhone
					lP.Typeface = tfLabels
					xP.SetTextAlignment("CENTER", "RIGHT")
					p.AddView(xP, StartX, 45dip, SplitW - 5dip, 25dip)
					
					Dim lA As Label : lA.Initialize("lblBookedAddr") : Dim xA As B4XView = lA
					xA.Text = cAddr : xA.TextColor = xui.Color_Blue : xA.TextSize = 13 : xA.Tag = cAddr
					lA.Typeface = tfLabels
					xA.SetTextAlignment("CENTER", "LEFT")
					p.AddView(xA, StartX + SplitW + 5dip, 15dip, SplitW - 5dip, 25dip)
					
					Dim lI As Label : lI.Initialize("") : Dim xI As B4XView = lI
					xI.Text = cIssue : xI.TextColor = xui.Color_Black : xI.TextSize = 13
					lI.Typeface = tfLabels
					xI.SetTextAlignment("CENTER", "LEFT")
					p.AddView(xI, StartX + SplitW + 5dip, 45dip, SplitW - 5dip, 25dip)
				End If
				
				' --- COL 3: BUTTON & DELETE ICON ---
				If IsPrimary Then
					Dim btn As Button : btn.Initialize("btnBookSlot")
					Dim xBtn As B4XView = btn
					xBtn.Text = "BOOKED" : xBtn.TextSize = 11 : xBtn.Enabled = False
					xBtn.SetColorAndBorder(xui.Color_Gray, 0, 0, 5dip) : xBtn.TextColor = xui.Color_White
					btn.Typeface = tfButtons
					
					Dim BtnRight As Int = CurrentWidth - 5dip
					Dim BtnLeft As Int = BtnRight - ButtonWidth
					p.AddView(xBtn, BtnLeft, 22dip, ButtonWidth, 45dip)
					
					Dim IconSize As Int = 30dip
					Dim IconLeft As Int = BtnLeft - IconSize - 10dip
					
					Dim lblDel As Label : lblDel.Initialize("lblDelete") : Dim xDel As B4XView = lblDel
					xDel.Text = "🚫" : xDel.TextSize = 22 : xDel.Tag = cEventId
					xDel.SetTextAlignment("CENTER", "CENTER")
					p.AddView(xDel, IconLeft, 27dip, IconSize, IconSize)
				End If
			Else
				' EMPTY SLOT
				Dim IsPassedTime As Boolean = False
				If IsPastDate Then IsPassedTime = True
				If IsToday And hr <= CurHour Then IsPassedTime = True
				
				Dim btn As Button : btn.Initialize("btnBookSlot")
				Dim xBtn As B4XView = btn : xBtn.Tag = hr
				btn.Typeface = tfButtons
				
				If IsPassedTime Then
					xBtn.Text = "PASSED" : xBtn.SetColorAndBorder(xui.Color_LightGray, 0, 0, 5dip) : xBtn.Enabled = False
				Else
					xBtn.Text = "BOOK" : xBtn.SetColorAndBorder(0xFF2E7D32, 0, 0, 5dip) : xBtn.Enabled = True
				End If
				xBtn.TextColor = xui.Color_White : xBtn.TextSize = 13
				p.AddView(xBtn, CurrentWidth - ButtonWidth - 5dip, 22dip, ButtonWidth, 45dip)
			End If
			
			PnlIn.AddView(p, 0, topPos, CurrentWidth, rowH)
			topPos = topPos + rowH + 2dip
		Next
		PnlIn.Height = topPos
End Sub

Private Sub CleanAddress(Addr As String) As String
	Dim temp As String = Addr.Replace(Chr(10), " ").Replace(Chr(13), " ")
	Dim Zip As String = ""
	Dim m As Matcher = Regex.Matcher("\b\d{5}(?:-\d{4})?\b", temp)
	If m.Find Then Zip = m.Match
	Dim StreetPart As String = temp
	If temp.Contains(",") Then StreetPart = temp.SubString2(0, temp.IndexOf(",")).Trim
	If Zip <> "" Then Return StreetPart & " " & Zip Else Return StreetPart
End Sub
'//<END-AppointmentPage-S03>





'//<START-AppointmentPage-S04>
' =========================================================
' ===           DATA LOGIC & INTERACTIONS               ===
' =========================================================

' [NEW] Bridge Sub to receive Client Data from SearchPage
Public Sub SetClient(Profile As Map)
	Log(">>> [AppointmentPage] SetClient Received: " & Profile.GetDefault("Name", "Unknown"))
	LoadClientForAppt(Profile)
End Sub

Public Sub LoadClientForAppt(Profile As Map)
	Log(">>> [CRITICAL_DEBUG] LoadClientForAppt: " & Profile.GetDefault("Name", "Unknown"))
	CurrentClient = Profile
	
	' --- FIX: Crash Guard - If page isn't built, just save data and exit ---
	If Root.IsInitialized = False Then
		Log(">>> [AppointmentPage] Root not initialized. Data saved. UI will update on creation.")
		Return
	End If
	
	' Set Text Safely
	If lblClientName.IsInitialized Then lblClientName.Text = Profile.GetDefault("Name", "New Client")
	If lblClientPhone.IsInitialized Then lblClientPhone.Text = Profile.GetDefault("Phone", "")
	If lblClientAddr.IsInitialized Then lblClientAddr.Text = CleanAddress(Profile.GetDefault("Address", ""))
	
	' Default to Today
	SelectedDate = DateTime.Now
	DateBarAnchor = DateTime.Now ' Reset anchor when loading new client
	
	' [FIXED] GHOST WIDTH CLAMP - Force screen width to hardware limits
	Dim TargetW As Int = Root.Width
	Dim DeviceW As Int = GetDeviceLayoutValues.Width
	If TargetW > DeviceW Or TargetW <= 0 Then
		Log(">>> [CRITICAL_DEBUG] Clamping Width: " & TargetW & " -> " & DeviceW)
		TargetW = DeviceW
	End If
	
	BuildDateBar(TargetW)
	RefreshSchedule
End Sub

Public Sub RefreshSchedule
	If B4XPages.MainPage.OAuth2.access_token = "" Then Return
	
	' Set time range for the current selected date
	Dim StartTicks As Long = DateUtils.SetDate(DateTime.GetYear(SelectedDate), DateTime.GetMonth(SelectedDate), DateTime.GetDayOfMonth(SelectedDate))
	
	' Calls CreateRFC3339 with Integers (0 and 23)
	Dim TimeMin As String = CreateRFC3339(StartTicks, 0)   ' 0  = 12:00 AM
	Dim TimeMax As String = CreateRFC3339(StartTicks, 23)  ' 23 = 11:00 PM
	
	Dim job As HttpJob : job.Initialize("FetchCalendar", Me)
	job.Download("https://www.googleapis.com/calendar/v3/calendars/primary/events?timeMin=" & TimeMin.Replace("+", "%2B") & "&timeMax=" & TimeMax.Replace("+", "%2B") & "&singleEvents=true")
	job.GetRequest.SetHeader("Authorization", "Bearer " & B4XPages.MainPage.OAuth2.access_token)
End Sub

Sub JobDone(Job As HttpJob)
	If Job.Success Then
		If Job.JobName = "DeleteEvent" Then
			xui.MsgboxAsync("Appointment Deleted", "Success")
			RefreshSchedule
			Job.Release
			Return
		End If
		
		If Job.JobName = "CreateCalendarEvent" Then
			Dim IsScrape As Boolean = False
			If CurrentClient.ContainsKey("IsScrapeWorkflow") Then
				IsScrape = CurrentClient.Get("IsScrapeWorkflow")
			End If
			
			If IsScrape Then
				' --- THE SCRAPER LOOP EXIT ---
				B4XPages.ClosePage(Me)
				CallSub(B4XPages.MainPage, "ProcessNextScrapeItem")
			Else
				' --- STANDARD EXIT ---
				xui.MsgboxAsync("Appointment Saved to Google Calendar!", "Success")
				RefreshSchedule
				CallSub(B4XPages.MainPage, "RefreshDashboard")
			End If
			Job.Release
			Return
		End If
		
		Dim parser As JSONParser : parser.Initialize(Job.GetString)
		Dim RootMap As Map = parser.NextObject
		If Job.JobName = "FetchCalendar" Then
			Dim items As List = RootMap.Get("items")
			ExistingEvents.Clear
			For Each ev As Map In items
				Dim cId As String = ev.GetDefault("colorId", "1")
				Dim targetId As String = "1"
				If SelectedUser = "Erin" Then targetId = "11"
				
				If cId = targetId Then
					Dim startMap As Map = ev.Get("start")
					Dim endMap As Map = ev.Get("end")
					Dim dtStart As String = startMap.GetDefault("dateTime", "")
					Dim dtEnd As String = endMap.GetDefault("dateTime", "")
					Dim eId As String = ev.Get("id")
					
					Dim summary As String = ev.GetDefault("summary", "Unknown")
					If summary.Contains(" - ") Then summary = summary.SubString2(0, summary.IndexOf(" - "))
					
					Dim desc As String = ev.GetDefault("description", "")
					Dim cPhone As String = "No Phone" : Dim cIssue As String = "No Issue"
					
					If desc.Contains("Phone: ") Then
						Dim i As Int = desc.IndexOf("Phone: ") + 7
						Dim i2 As Int = desc.IndexOf2(Chr(10), i) : If i2 = -1 Then i2 = desc.Length
						cPhone = desc.SubString2(i, i2).Trim
					End If
					If desc.Contains("Issue: ") Then
						Dim i As Int = desc.IndexOf("Issue: ") + 7
						Dim i2 As Int = desc.IndexOf2(Chr(10), i) : If i2 = -1 Then i2 = desc.Length
						cIssue = desc.SubString2(i, i2).Trim
					Else
						cIssue = desc
					End If
					
					If dtStart <> "" And dtEnd <> "" Then
						Dim StartHour As Int = ParseIsoToLocalHour(dtStart)
						Dim EndHour As Int = ParseIsoToLocalHour(dtEnd)
						If StartHour > -1 And EndHour > -1 Then
							For h = StartHour To EndHour - 1
								Dim EvData As Map = CreateMap("Name": summary, "Phone": cPhone, "Addr": ev.GetDefault("location", "No Address"), "Issue": cIssue, "EventId": eId)
								If h = StartHour Then EvData.Put("IsPrimary", True) Else EvData.Put("IsPrimary", False)
								ExistingEvents.Put(h, EvData)
							Next
						End If
					End If
				End If
			Next
			
			' [FIXED] Force screen width logic here too
			Dim TargetW As Int = Root.Width
			Dim DeviceW As Int = GetDeviceLayoutValues.Width
			If TargetW > DeviceW Or TargetW <= 0 Then TargetW = DeviceW
			
			BuildTimeGrid(TargetW)
		End If
	End If
	Job.Release
End Sub

Sub lblBookedName_Click
	' FIX: Capture Sender before CallSub
	Dim NativeBtn As B4XView = Sender
	Dim cName As String = NativeBtn.Tag
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	
	B4XPages.ShowPage("SearchPage")
	CallSub2(B4XPages.MainPage, "SearchContact", cName)
End Sub

Sub lblBookedPhone_Click
	' FIX: Capture Sender before CallSub
	Dim NativeBtn As B4XView = Sender
	Dim cPhone As String = NativeBtn.Tag
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	
	Msgbox2Async("Contact client?", "Contact", "Call", "Cancel", "Text", Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		CallSub2(B4XPages.MainPage, "DirectCall", cPhone)
	Else If Result = DialogResponse.NEGATIVE Then
		CallSub2(B4XPages.MainPage, "LaunchSMS", cPhone)
	End If
End Sub

Sub lblBookedAddr_Click
	' FIX: Capture Sender before CallSub
	Dim NativeBtn As B4XView = Sender
	Dim cAddr As String = NativeBtn.Tag
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	
	CallSub2(B4XPages.MainPage, "LaunchMaps", cAddr)
End Sub

Sub lblDelete_Click
	' FIX: Capture Sender before CallSub
	Dim NativeBtn As B4XView = Sender
	Dim eId As String = NativeBtn.Tag
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	
	Msgbox2Async("Delete appointment?", "Confirm", "Yes", "Cancel", "", Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then DeleteCalendarEvent(eId)
End Sub

Sub DeleteCalendarEvent(EventId As String)
	Dim job As HttpJob
	job.Initialize("DeleteEvent", Me)
	job.Delete("https://www.googleapis.com/calendar/v3/calendars/primary/events/" & EventId)
	job.GetRequest.SetHeader("Authorization", "Bearer " & B4XPages.MainPage.OAuth2.access_token)
End Sub

Private Sub ParseIsoToLocalHour(iso As String) As Int
	Try
		If iso.EndsWith("Z") Then
			Dim hour As Int = iso.SubString2(11,13)
			Dim LocalH As Int = hour + DateTime.TimeZoneOffset
			If LocalH < 0 Then LocalH = LocalH + 24
			If LocalH > 23 Then LocalH = LocalH - 24
			Return LocalH
		Else
			Return iso.SubString2(11,13)
		End If
	Catch
		Return -1
	End Try
End Sub

' Alarm Timer correctly pulls phone number dynamically
Sub AlarmTimer_Tick
	Dim curHr As Int = DateTime.GetHour(DateTime.Now)
	Dim curMin As Int = DateTime.GetMinute(DateTime.Now)
	If curHr >= 10 And curHr <= 20 And curMin = 57 Then
		If ExistingEvents.ContainsKey(curHr + 1) And Not(CurrentAppointmentCompleted) Then
			Dim TargetEvent As Map = ExistingEvents.Get(curHr + 1)
			Dim PhoneToCall As String = TargetEvent.Get("Phone")
			
			xui.Msgbox2Async("3 mins to next appt!", "LATE ALARM", "Call", "Snooze", "", Null)
			Wait For Msgbox_Result (Result As Int)
			If Result = xui.DialogResponse_Positive Then
				CallSub2(B4XPages.MainPage, "DirectCall", PhoneToCall)
			End If
		End If
	End If
End Sub

Sub DateLink_Click
	' FIX: Capture Sender before CallSub
	Dim NativeBtn As B4XView = Sender
	Dim Val As Object = NativeBtn.Tag
	
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	SelectedDate = Val
	
	' NOTE: We do NOT update DateBarAnchor here.
	' Clicking a day keeps the current week visible (Static View).
	
	Dim TargetW As Int = Root.Width
	Dim DeviceW As Int = GetDeviceLayoutValues.Width
	If TargetW > DeviceW Or TargetW <= 0 Then TargetW = DeviceW
	
	BuildDateBar(TargetW)
	RefreshSchedule
End Sub

Sub btnHome_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	B4XPages.ShowPage("MainPage")
End Sub

Sub btnDatePicker_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	Dim jo As JavaObject = Me
	jo.RunMethod("showDatePicker", Null)
End Sub

Sub OnDateSelected(year As Int, month As Int, day As Int)
	SelectedDate = DateUtils.SetDate(year, month + 1, day)
	
	' FIX: Update Anchor so the view JUMPS to the selected date
	DateBarAnchor = SelectedDate
	
	Dim TargetW As Int = Root.Width
	Dim DeviceW As Int = GetDeviceLayoutValues.Width
	If TargetW > DeviceW Or TargetW <= 0 Then TargetW = DeviceW
	
	BuildDateBar(TargetW)
	RefreshSchedule
End Sub

Sub spnUserFilter_ItemClick (Index As Int, Value As Object)
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	If Index = 0 Then SelectedUser = "Mike" Else SelectedUser = "Erin"
	RefreshSchedule
End Sub

#If JAVA
import android.app.DatePickerDialog;
import android.widget.DatePicker;
import java.util.Calendar;
public void showDatePicker() {
    final Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH);
    int day = c.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog datePickerDialog = new DatePickerDialog(ba.context,
            new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    ba.raiseEventFromUI(null, "ondateselected", year, monthOfYear, dayOfMonth);
       
         }
            }, year, month, day);
    datePickerDialog.show();
}
#End If
'Total Subroutines in Section S04 recorded last edit: 16
'Total Subroutines in Section S04 recorded after this edit - 16
'Total Subroutines added in this edit - 0
'Total Subroutines removed in this edit - 0
'Difference between edits- 0
'Total Discrepancies - 0
'//<END-AppointmentPage-S04>





'//<START-AppointmentPage-S05>
' =========================================================
' ===           BOOKING LOGIC & DIALOGS                 ===
' =========================================================

' Entry Point 1: Called from "Traffic Cop" in Main Page
Public Sub BookAppointment(SlotData As Map, ClientProfile As Map)
	Log(">>> [APP_DEBUG] BookAppointment EXECUTED.")
	Log(">>> [APP_DEBUG] Client: " & ClientProfile.GetDefault("Name", "Unknown"))
	Log(">>> [APP_DEBUG] Slot Data: " & SlotData)
	
	' --- FIX: Ensure we are visible and stabilized before popping up ---
	B4XPages.ShowPage("AppointmentPage")
	Sleep(100)
	
	' 1. Load the client into the UI
	LoadClientForAppt(ClientProfile)
	
	' 2. Parse Time
	Dim SlotTimeStr As String = SlotData.GetDefault("Time", "10:00 AM")
	Dim h As Int = 10
	If SlotTimeStr.Contains(":") Then
		Dim parts() As String = Regex.Split(":", SlotTimeStr)
		h = parts(0)
		If SlotTimeStr.Contains("PM") And h <> 12 Then h = h + 12
	End If
	
	PendingSlotHour = h
	Log(">>> [APP_DEBUG] PendingSlotHour set locally to: " & PendingSlotHour)
	
	' 3. Trigger Popup (Now that the page is definitely visible)
	PromptForDetailsAndBook
End Sub

Sub btnBookSlot_Click
	' --- FIX: Capture Sender IMMEDIATELY to prevent ClassCastException ---
	Dim NativeBtn As Button = Sender
	Dim btn As B4XView = NativeBtn
	
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	
	Dim SelectedHour As Int = btn.Tag
	
	' 1. Set Local Variable
	PendingSlotHour = SelectedHour
	Log(">>> [APP_DEBUG] btnBookSlot_Click: Local PendingSlotHour = " & PendingSlotHour)
	
	' 2. FORCE PUSH to MainPage (Traffic Cop)
	' The Traffic Cop likely ignores the Public variable and needs this push!
	Dim SlotInfo As Map = CreateMap("Time": SelectedHour & ":00")
	
	If SubExists(B4XPages.MainPage, "SetPendingSlot") Then
		CallSub2(B4XPages.MainPage, "SetPendingSlot", SlotInfo)
		Log(">>> [APP_DEBUG] SUCCESS: Pushed Slot " & SelectedHour & " to MainPage.SetPendingSlot")
	Else
		Log(">>> [APP_DEBUG] WARNING: MainPage.SetPendingSlot NOT FOUND. Traffic Cop may fail.")
	End If

	' SMART CHECK: If client is pre-loaded (from Scrape or Search), SKIP DIALOG
	If CurrentClient.Get("Name") <> "" Then
		Log(">>> [APP_DEBUG] Client pre-loaded (" & CurrentClient.Get("Name") & "). Skipping dialog.")
		PromptForDetailsAndBook
		Return
	End If

	Msgbox2Async("Is this for an existing client found in the Ledger/Contacts, or a brand new client?", "Booking Type", "Search Client List", "Cancel", "New Client", Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		Log(">>> [APP_DEBUG] User selected: Search Client List")
		B4XPages.ShowPage("SearchPage")
	Else If Result = DialogResponse.NEGATIVE Then
		Log(">>> [APP_DEBUG] User selected: New Client")
		B4XPages.ShowPage("CreateClientPage")
	Else
		PendingSlotHour = -1
		Log(">>> [APP_DEBUG] User Cancelled Booking.")
	End If
End Sub

Private Sub PromptForDetailsAndBook
	Log(">>> [APP_DEBUG] PromptForDetailsAndBook: Opening Dialog...")
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 300dip, 250dip)
	p.Color = xui.Color_White
	
	Dim lblD As Label : lblD.Initialize("") : lblD.Text = "Duration (Hours):"
	lblD.TextColor = xui.Color_Black : lblD.TextSize = 14
	p.AddView(lblD, 10dip, 10dip, 280dip, 30dip)
	
	Dim spnDur As Spinner : spnDur.Initialize("")
	spnDur.AddAll(Array As String("1 Hr", "2 Hrs", "3 Hrs", "4 Hrs", "5 Hrs", "6 Hrs"))
	p.AddView(spnDur, 10dip, 45dip, 280dip, 50dip)
	
	Dim lblI As Label : lblI.Initialize("") : lblI.Text = "Reason for Visit / Issue:"
	lblI.TextColor = xui.Color_Black : lblI.TextSize = 14
	p.AddView(lblI, 10dip, 105dip, 280dip, 30dip)
	
	Dim et As EditText : et.Initialize("")
	et.Hint = "e.g. Printer broken" : et.TextColor = xui.Color_Black : et.TextSize = 14
	
	' [FIXED] Inject the scraped Voicemail Issue directly into the Form!
	Dim PreFilledIssue As String = CurrentClient.GetDefault("Issue", "")
	If PreFilledIssue <> "" Then et.Text = PreFilledIssue
	
	txtIssue = et
	p.AddView(txtIssue, 10dip, 140dip, 280dip, 50dip)
	
	Wait For (Dialog.ShowCustom(p, "BOOK IT", "", "CANCEL")) Complete (Result As Int)
	
	If Result = xui.DialogResponse_Positive Then
		Dim Dur As Int = spnDur.SelectedIndex + 1
		Dim Issue As String = txtIssue.Text.Trim
		If Issue = "" Then Issue = "General Service"
		
		CurrentClient.Put("Notes", Issue)
		CurrentClient.Put("Duration", Dur)
		
		If CheckAvailability(PendingSlotHour, Dur) Then
			BookSlot(PendingSlotHour, Dur)
		Else
			xui.MsgboxAsync("Cannot book! Slots overlap with an existing appointment.", "Time Conflict")
			PendingSlotHour = -1
		End If
	Else
		PendingSlotHour = -1
	End If
End Sub

Private Sub CheckAvailability(StartHour As Int, Duration As Int) As Boolean
	For h = StartHour To StartHour + Duration - 1
		If ExistingEvents.ContainsKey(h) Then Return False
	Next
	Return True
End Sub

Sub BookSlot(SelectedHour As Int, Duration As Int)
	If CurrentClient.ContainsKey("ResourceName") = False Or CurrentClient.Get("ResourceName") = "" Then
		xui.MsgboxAsync("Saving new client to Google Contacts...", "Please Wait")
		CurrentClient.Put("TargetSlot", SelectedHour)
		CurrentClient.Put("Duration", Duration)
		CallSub2(B4XPages.MainPage, "CreateNewContact", CurrentClient)
		Return
	End If
	FinalizeCalendarEvent(SelectedHour, Duration)
End Sub

Public Sub FinishBookingAfterContactCreation(UpdatedClientMap As Map)
	CurrentClient = UpdatedClientMap
	Dim targetSlot As Int = CurrentClient.Get("TargetSlot")
	Dim dur As Int = CurrentClient.GetDefault("Duration", 1)
	FinalizeCalendarEvent(targetSlot, dur)
End Sub

Private Sub FinalizeCalendarEvent(SelectedHour As Int, Duration As Int)
	Dim StartTime As String = CreateRFC3339(SelectedDate, SelectedHour)
	Dim EndTime As String = CreateRFC3339(SelectedDate, SelectedHour + Duration)
	Dim colorId As String = "1" : If SelectedUser = "Erin" Then colorId = "11"
	
	Dim Description As String = "Phone: " & CurrentClient.Get("Phone") & CRLF & "Issue: " & CurrentClient.Get("Notes") & CRLF & "Address: " & CurrentClient.Get("Address")
	
	Dim eventMap As Map = CreateMap( _
		"summary": CurrentClient.Get("Name") & " - Service", _
		"location": CurrentClient.Get("Address"), _
		"description": Description, _
		"colorId": colorId, _
		"start": CreateMap("dateTime": StartTime, "timeZone": "America/New_York"), _
		"end": CreateMap("dateTime": EndTime, "timeZone": "America/New_York") _
	)
	
	Dim json As JSONGenerator : json.Initialize(eventMap)
	Dim job As HttpJob
	job.Initialize("CreateCalendarEvent", Me)
	job.PostString("https://www.googleapis.com/calendar/v3/calendars/primary/events", json.ToString)
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & B4XPages.MainPage.OAuth2.access_token)
	PendingSlotHour = -1
End Sub

Private Sub CreateRFC3339(DateMs As Long, Hour As Int) As String
	DateTime.DateFormat = "yyyy-MM-dd"
	Return DateTime.Date(DateMs) & "T" & NumberFormat(Hour, 2, 0) & ":00:00-05:00"
End Sub

'Total Subroutines in Section S05 recorded last edit: 9
'Total Subroutines in Section S05 recorded after this edit - 9
'Total Subroutines added in this edit - 0
'Total Subroutines removed in this edit - 0
'Difference between edits - 0
'Total Discrepancies - 0
'//<END-AppointmentPage-S05>