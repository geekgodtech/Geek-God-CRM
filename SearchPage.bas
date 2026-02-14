B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.4
@EndOfDesignText@
'//<START-SearchPage-S01>
Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	' [FIXED] RuntimePermissions (rp) removed. No longer needed for standard root storage.
	
	' --- UI ELEMENTS ---
	Private txtSearch As B4XView
	Private btnSearch As B4XView
	Private PnlResults As B4XView
	Private clvSchedule As CustomListView
	
	' --- POPUP ELEMENTS ---
	Private GenericPopupPanel As B4XView
	Private txtPopupNotes As B4XView
	Private lblServiceNotes As B4XView
	Private lblGroupPicker As B4XView
	Private lblHistoryPicker As B4XView
	
	' --- UTILS ---
	Private kb As IME
	Private CurrentProfile As Map
End Sub

Public Sub Initialize
	kb.Initialize("kb")
End Sub
'//<END-SearchPage-S01>






'//<START-SearchPage-S02>
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.Color = xui.Color_White
	
	' 1. TOP BAR
	Dim pnlTop As Panel : pnlTop.Initialize("") : pnlTop.Color = 0xFFF5F5F5
	Root.AddView(pnlTop, 0, 0, Root.Width, 60dip)
	
	Dim btnHome As Label : btnHome.Initialize("btnHome")
	Dim xHome As B4XView = btnHome
	xHome.Text = Chr(0xF015)
	btnHome.Typeface = Typeface.FONTAWESOME
	xHome.TextSize = 24
	xHome.TextColor = xui.Color_Black
	xHome.SetTextAlignment("CENTER", "CENTER")
	pnlTop.AddView(xHome, 5dip, 0, 50dip, 60dip)
	
	' Initialize Native EditText first
	Dim et As EditText : et.Initialize("txtSearch")
	et.Hint = "Name or Date (MM/DD/YYYY)..."
	et.TextSize = 14
	et.TextColor = xui.Color_Black
	et.SingleLine = True
	et.ForceDoneButton = True
	txtSearch = et
	txtSearch.Color = xui.Color_White
	pnlTop.AddView(txtSearch, 60dip, 10dip, Root.Width - 160dip, 40dip)
	
	' Initialize Native Button first
	Dim b As Button : b.Initialize("btnSearch")
	b.Text = "Search"
	btnSearch = b
	pnlTop.AddView(btnSearch, Root.Width - 90dip, 10dip, 80dip, 40dip)
	
	' 2. INLINE RESULTS CONTAINER
	PnlResults = xui.CreatePanel("")
	PnlResults.Color = xui.Color_Transparent
	Root.AddView(PnlResults, 0, 65dip, Root.Width, Root.Height - 65dip)
	
	' 3. SCHEDULE LIST
	Dim pCLV As B4XView = xui.CreatePanel("")
	Root.AddView(pCLV, 0, 65dip, Root.Width, Root.Height - 65dip)
	
	Dim lblStub As Label : lblStub.Initialize("")
	Dim props As Map = CreateMap("DividerColor": 0xFFD9D9D9, "DividerHeight": 1dip, "PressedColor": 0xFF7EB4FA, "InsertAnimationDuration": 0, "ListOrientation": "Vertical")
	
	clvSchedule.Initialize(Me, "clvSchedule")
	clvSchedule.DesignerCreateView(pCLV, lblStub, props)
	clvSchedule.AsView.Visible = False
End Sub

' =========================================================
' ===            MASTER RESIZE RECEIVER                 ===
' =========================================================

Public Sub RedrawUI(CurrentW As Int)
	If Root.IsInitialized = False Then Return

	' Standardized layout routing based on Main Page Engine
	If CurrentW > 1300 Then
		Log(">>> [SearchPage] RedrawUI: Mike Open Big / Unfolded (" & CurrentW & ")")
	Else If CurrentW > 850 Then
		Log(">>> [SearchPage] RedrawUI: Mike Closed Small / Tall Phone (" & CurrentW & ")")
	Else
		Log(">>> [SearchPage] RedrawUI: Erin's Phone (" & CurrentW & ")")
	End If

	' Route to standard resize
	B4XPage_Resize(CurrentW, Root.Height)
End Sub

Private Sub B4XPage_Resize (Width As Int, Height As Int)
	If Root.IsInitialized = False Then Return
	If Width < 50 Or Height < 50 Then Return

	' Resize Top Panel Elements
	Dim pnlTop As B4XView = Root.GetView(0)
	pnlTop.SetLayoutAnimated(0, 0, 0, Width, 60dip)
	txtSearch.SetLayoutAnimated(0, 60dip, 10dip, Width - 160dip, 40dip)
	btnSearch.SetLayoutAnimated(0, Width - 90dip, 10dip, 80dip, 40dip)

	' Resize Results Containers
	PnlResults.SetLayoutAnimated(0, 0, 65dip, Width, Height - 65dip)

	' Resize The CustomListView wrapper
	Dim pCLV As B4XView = Root.GetView(2)
	pCLV.SetLayoutAnimated(0, 0, 65dip, Width, Height - 65dip)
	If clvSchedule.IsInitialized And clvSchedule.AsView.IsInitialized Then
		clvSchedule.AsView.SetLayoutAnimated(0, 0, 0, Width, Height - 65dip)
		clvSchedule.Base_Resize(Width, Height - 65dip)
	End If
End Sub

Private Sub B4XPage_Disappear
	If txtSearch.IsInitialized Then txtSearch.Text = ""
End Sub

Sub btnHome_Click
	B4XPages.ShowPage("MainPage")
End Sub

Public Sub AdjustForKeyboard(NewHeight As Int, FullHeight As Int)
	If Root.IsInitialized Then
		Root.SetLayoutAnimated(0, 0, 0, Root.Width, NewHeight)
	End If
End Sub
'Total Subroutines in Section S02 - 6
'//<END-SearchPage-S02>






'//<START-SearchPage-S03>
' =========================================================
' ===           SEARCH & PROFILE LOGIC                  ===
' =========================================================

Public Sub SearchContact(Query As String)
	If Root.IsInitialized = False Then Return
	
	Log(">>> [SearchPage] SearchContact called with: " & Query)
	If txtSearch.Text <> Query Then txtSearch.Text = Query
	PnlResults.RemoveAllViews
	CallSub2(B4XPages.MainPage, "PerformSearch", Query)
End Sub

Sub txtSearch_EnterPressed
	btnSearch_Click
End Sub

Sub btnSearch_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	kb.HideKeyboard
	Dim q As String = txtSearch.Text.Trim
	Log(">>> [SearchPage] Search Button Clicked. Query: " & q)
	
	If q.Length > 0 Then
		PnlResults.RemoveAllViews
		clvSchedule.Clear
		CallSub2(B4XPages.MainPage, "PerformSearch", q)
	Else
		xui.MsgboxAsync("Enter Name or Date", "Error")
	End If
End Sub

Public Sub ShowProfileNotFound
	Log(">>> [SearchPage] No Profile Found.")
	PnlResults.RemoveAllViews
	clvSchedule.AsView.Visible = False
	xui.MsgboxAsync("No match found.", "Search Result")
End Sub

' =========================================================
' ===      SHOW DAILY SCHEDULE (Date Search Result)     ===
' =========================================================

Public Sub ShowDailySchedule(Appts As List)
	If Root.IsInitialized = False Then Return
	
	Log(">>> [SearchPage] Showing Daily Schedule. Items: " & Appts.Size)
	PnlResults.Visible = False
	clvSchedule.AsView.Visible = True
	clvSchedule.Clear
	
	If Appts.Size = 0 Then
		xui.MsgboxAsync("No appointments found for this date.", "Schedule")
		Return
	End If
	
	For Each item As Map In Appts
		Dim time As String = item.Get("Time")
		Dim name As String = item.Get("Name")
		
		Dim p As B4XView = xui.CreatePanel("")
		p.SetLayoutAnimated(0, 0, 0, clvSchedule.AsView.Width, 60dip)
		p.Color = xui.Color_White
		
		Dim lblT As Label : lblT.Initialize("")
		Dim xT As B4XView = lblT
		xT.Text = time
		xT.TextSize = 14
		xT.TextColor = xui.Color_DarkGray
		p.AddView(xT, 10dip, 0, 80dip, 60dip)
		
		Dim lblN As Label : lblN.Initialize("")
		Dim xN As B4XView = lblN
		xN.Text = name
		xN.TextSize = 16
		xN.TextColor = xui.Color_Blue
		lblN.Typeface = Typeface.DEFAULT_BOLD
		p.AddView(xN, 100dip, 0, p.Width - 110dip, 60dip)
		
		clvSchedule.Add(p, name)
	Next
End Sub

Sub clvSchedule_ItemClick (Index As Int, Value As Object)
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	Dim cName As String = Value
	SearchContact(cName)
End Sub

' =========================================================
' ===      DYNAMIC CARD GENERATOR (Profile Result)      ===
' =========================================================

Public Sub ShowProfile(Profile As Map)
	If Root.IsInitialized = False Then Return

	Log(">>> [SearchPage] ShowProfile called for: " & Profile.GetDefault("Name", "Unknown"))
	CurrentProfile = Profile
	clvSchedule.AsView.Visible = False
	PnlResults.Visible = True
	PnlResults.RemoveAllViews
	
	' 1. STYLING & GROUP LABEL TEXT
	Dim bgColor, txtColor As Int
	Dim isBlack As Boolean = Profile.Get("IsBlacklisted")
	Dim isPref As Boolean = Profile.Get("IsPreferred")
	Dim notesBgColor As Int = xui.Color_LightGray
	Dim notesTxtColor As Int = xui.Color_Black
	Dim controlBgColor As Int = xui.Color_LightGray
	
	' DYNAMIC GROUP LABEL CONFIG
	Dim GroupLabelText As String = "Standard" & CRLF & "Client"
	Dim GroupLabelColor As Int = xui.Color_DarkGray
	Dim GroupLabelSize As Int = 24
	
	If isBlack Then
		bgColor = xui.Color_Red : txtColor = xui.Color_White
		notesBgColor = xui.Color_Black : notesTxtColor = xui.Color_White
		controlBgColor = xui.Color_Red
		GroupLabelText = "Blacklisted" & CRLF & "Client"
		GroupLabelColor = xui.Color_Black
	Else If isPref Then
		bgColor = 0xFFF9E076 : txtColor = xui.Color_Black
		GroupLabelText = "Preferred" & CRLF & "Client"
		GroupLabelColor = xui.Color_Black
	Else
		bgColor = xui.Color_White : txtColor = xui.Color_Black
		GroupLabelText = "Standard" & CRLF & "Client"
		GroupLabelColor = 0xFF444444
	End If
	
	If Root.Width < 450dip Then GroupLabelSize = 18
	
	' 2. SCROLLVIEW
	Dim sv As ScrollView : sv.Initialize(0)
	Dim PnlIn As B4XView = sv.Panel
	PnlIn.Color = bgColor
	PnlResults.AddView(sv, 0, 0, PnlResults.Width, PnlResults.Height)
	
	Dim top As Int = 0dip
	Dim contentW As Int = PnlResults.Width - 20dip
	Dim leftMargin As Int = 10dip
	
	' --- COMPONENT SIZING MATH (CENTERING FIX) ---
	Dim btnSize As Int = 135dip
	Dim BtnLeft As Int = PnlResults.Width - btnSize - 10dip
	
	' Lock the Name to exactly 50% of the screen
	Dim NameWidth As Int = Root.Width * 0.50
	
	' Widen Badge so text NEVER wraps
	Dim BadgeWidth As Int = 140dip
	
	' Find the Gap between Name and Button
	Dim GapStart As Int = leftMargin + NameWidth
	Dim GapWidth As Int = BtnLeft - GapStart
	
	' Shifted left explicitly by 60dip per your request
	Dim BadgeLeft As Int = GapStart + (GapWidth / 2) - (BadgeWidth / 2) - 60dip

	' 3. MAKE APPT BUTTON (3D IMAGE STATE LIST with TRANSPARENCY FIX)
	Dim bdPressed As BitmapDrawable
	bdPressed.Initialize(LoadBitmap(File.DirAssets, "Schedule Button down position.png"))
	
	Dim bdEnabled As BitmapDrawable
	bdEnabled.Initialize(LoadBitmap(File.DirAssets, "Schedule Button up position.png"))

	Dim sld As StateListDrawable
	sld.Initialize
	sld.AddState(sld.State_Pressed, bdPressed)
	sld.AddState(sld.State_Enabled, bdEnabled)

	Dim btnAppt As Button : btnAppt.Initialize("btnCreateAppt")
	Dim xApptBtn As B4XView = btnAppt
	xApptBtn.Color = xui.Color_Transparent
	btnAppt.Background = sld
	
	#If B4A
	Dim joBtn As JavaObject = btnAppt
	Dim ZeroFloat As Float = 0
	joBtn.RunMethod("setElevation", Array(ZeroFloat))
	joBtn.RunMethod("setStateListAnimator", Array(Null))
	#End If
	
	PnlIn.AddView(btnAppt, BtnLeft, top, btnSize, btnSize)
	
	' 4. NAME (WITH DUAL NAME LOGIC)
	Dim lblName As Label : lblName.Initialize("")
	Dim xName As B4XView = lblName
	lblName.Typeface = LoadSafeFont("search - name.ttf")
	xName.TextColor = txtColor
	
	Dim name1 As String = Profile.GetDefault("Name", "").As(String).ToUpperCase
	Dim name2 As String = Profile.GetDefault("Name2", "").As(String).ToUpperCase
	
	If name2 <> "" Then
		xName.Text = name1 & CRLF & name2
		xName.TextSize = 22.5 ' Half of 45
		lblName.SingleLine = False
	Else
		xName.Text = name1
		xName.TextSize = 45
		lblName.SingleLine = True
	End If
	
	PnlIn.AddView(xName, leftMargin, top + 10dip, NameWidth, 120dip)
	xName.SendToBack
	
	' 5. GROUP BADGE (SHIFTED LEFT 60px)
	Dim lblGrp As Label : lblGrp.Initialize("")
	Dim xGrp As B4XView = lblGrp
	xGrp.Text = GroupLabelText
	xGrp.TextSize = GroupLabelSize
	lblGrp.Typeface = LoadSafeFont("search - client group.ttf")
	xGrp.TextColor = GroupLabelColor
	
	Dim jo As JavaObject = lblGrp
	jo.RunMethod("setShadowLayer", Array(10.0f, 0.0f, 0.0f, xui.Color_White))
	
	xGrp.SetTextAlignment("CENTER", "CENTER")
	PnlIn.AddView(xGrp, BadgeLeft, top + 10dip, BadgeWidth, 80dip)
	xGrp.BringToFront
	
	top = top + 130dip
	
	' 6. PHONES (WITH RESPONSIVE DUAL-PHONE SUPPORT)
	Dim hasPhone2 As Boolean = Profile.ContainsKey("Phone2") And Profile.GetDefault("Phone2", "") <> ""
	
	Dim lblPhone As Label : lblPhone.Initialize("lblPhone")
	Dim xPhone As B4XView = lblPhone
	Dim MaskedPhone As String = FormatPhone(Profile.Get("Phone"))
	Dim csPh As CSBuilder
	csPh.Initialize.Typeface(Typeface.FONTAWESOME).Append(Chr(0xF095) & "  ").Typeface(Typeface.DEFAULT).Append(MaskedPhone).PopAll
	xPhone.Text = csPh
	xPhone.TextSize = 18
	If isBlack Then xPhone.TextColor = xui.Color_Yellow Else xPhone.TextColor = 0xFF0000FF
	
	If hasPhone2 Then
		Dim lblPhone2 As Label : lblPhone2.Initialize("lblPhone2")
		Dim xPhone2 As B4XView = lblPhone2
		Dim MaskedPhone2 As String = FormatPhone(Profile.Get("Phone2"))
		Dim csPh2 As CSBuilder
		' Chr(0xF015) is the FontAwesome House Icon. Applying Blue explicitly to icon.
		csPh2.Initialize.Color(xui.Color_Blue).Typeface(Typeface.FONTAWESOME).Append(Chr(0xF015) & "  ").Pop.Typeface(Typeface.DEFAULT).Append(MaskedPhone2).PopAll
		xPhone2.Text = csPh2
		xPhone2.TextSize = 18
		If isBlack Then xPhone2.TextColor = xui.Color_Yellow Else xPhone2.TextColor = 0xFF0000FF
		
		' --- RESPONSIVE LAYOUT ENGINE FOR PHONES ---
		' [UPDATED] Checks for Fold State (Tabletop) OR Small Screen
		If Root.Width < 850dip Or B4XPages.MainPage.LastFoldState = "HALF_OPENED" Then
			' SMALL SCREEN / TABLETOP: Stack Vertically
			PnlIn.AddView(xPhone, leftMargin, top, contentW, 35dip)
			top = top + 35dip
			PnlIn.AddView(xPhone2, leftMargin, top, contentW, 35dip)
			top = top + 40dip
		Else
			' LARGE SCREEN: Side by Side
			PnlIn.AddView(xPhone, leftMargin, top, contentW / 2, 35dip)
			PnlIn.AddView(xPhone2, leftMargin + (contentW / 2), top, contentW / 2, 35dip)
			top = top + 40dip
		End If
	Else
		' SINGLE PHONE: Normal Layout
		PnlIn.AddView(xPhone, leftMargin, top, contentW, 35dip)
		top = top + 40dip
	End If
	
	' 7. ADDRESS
	Dim lblAddr As Label : lblAddr.Initialize("lblAddr")
	Dim xAddr As B4XView = lblAddr
	Dim rawAddr As String = Profile.Get("Address")
	Dim cleanAddr As String = CleanAddress(rawAddr)
	Dim csAd As CSBuilder
	csAd.Initialize.Typeface(Typeface.FONTAWESOME).Append(Chr(0xF041) & "  ").Typeface(Typeface.DEFAULT).Append(cleanAddr).PopAll
	xAddr.Text = csAd
	xAddr.TextSize = 18
	lblAddr.SingleLine = True
	lblAddr.Ellipsize = "END"
	If isBlack Then xAddr.TextColor = xui.Color_Yellow Else xAddr.TextColor = 0xFF0000FF
	PnlIn.AddView(xAddr, leftMargin, top, contentW, 35dip)
	top = top + 45dip
	
	' 8. STATS (REDUCED TEXT SIZE BY ANOTHER 10% -> Now 21)
	Dim lblStats As Label : lblStats.Initialize("")
	Dim xStats As B4XView = lblStats
	Dim tSpend As String = Profile.Get("TotalSpend")
	Dim tVisits As String = Profile.Get("VisitCount")
	Dim lastV As String = Profile.Get("LastVisit")
	
	Dim line1 As String = "Total Spent: $" & tSpend & " | Time: 0:00hrs | Avg: $0.00/Hr"
	Dim line2 As String = "Total Visits: " & tVisits & " | Last Visit: " & lastV
	xStats.Text = line1 & CRLF & line2
	xStats.TextSize = 21 ' [CHANGED] Reduced from 23 to 21
	
	lblStats.Typeface = LoadSafeFont("search - stats.ttf")
	xStats.TextColor = txtColor
	PnlIn.AddView(xStats, leftMargin, top, contentW, 100dip)
	top = top + 110dip
	
	' 9. HISTORY SECTION
	PnlIn.AddView(CreateLabelHeader("History:", txtColor), leftMargin, top, contentW, 40dip)
	top = top + 40dip
	
	Dim lhp As Label : lhp.Initialize("lblHistoryPicker")
	lblHistoryPicker = lhp
	lblHistoryPicker.Text = " View History..."
	lblHistoryPicker.TextSize = 14
	lblHistoryPicker.TextColor = txtColor
	lblHistoryPicker.SetColorAndBorder(controlBgColor, 2dip, xui.Color_DarkGray, 5dip)
	PnlIn.AddView(lblHistoryPicker, leftMargin, top, contentW, 45dip)
	top = top + 55dip
	
	' 10. GROUP SECTION
	PnlIn.AddView(CreateLabelHeader("Member of Group:", txtColor), leftMargin, top, contentW, 40dip)
	top = top + 40dip
	
	Dim lgp As Label : lgp.Initialize("lblGroupPicker")
	lblGroupPicker = lgp
	Dim currentGrp As String = "Client"
	If isBlack Then
		currentGrp = "Blacklisted"
	Else If isPref Then
		currentGrp = "Preferred"
	Else
		currentGrp = "Client"
	End If
	lblGroupPicker.Tag = currentGrp
	lblGroupPicker.Text = " Group: " & currentGrp
	lblGroupPicker.TextSize = 14
	lblGroupPicker.TextColor = txtColor
	lblGroupPicker.SetColorAndBorder(controlBgColor, 2dip, xui.Color_DarkGray, 5dip)
	PnlIn.AddView(lblGroupPicker, leftMargin, top, contentW, 45dip)
	top = top + 55dip
	
	' 11. NOTES SECTION
	PnlIn.AddView(CreateLabelHeader("Visit & Client Notes:", txtColor), leftMargin, top, contentW, 40dip)
	top = top + 40dip
	
	Dim AvailableH As Int = PnlResults.Height - top - 70dip
	If AvailableH < 150dip Then AvailableH = 150dip
	
	Dim tempLbl As Label : tempLbl.Initialize("lblServiceNotes")
	lblServiceNotes = tempLbl
	
	Dim RawNotes As String = Profile.Get("Notes")
	RawNotes = Regex.Replace("(?i)Created via GeekGod App[^\n\r]*", RawNotes, "")
	RawNotes = RawNotes.Trim
	
	lblServiceNotes.Text = RawNotes
	lblServiceNotes.TextSize = 14
	lblServiceNotes.TextColor = notesTxtColor
	tempLbl.Typeface = Typeface.MONOSPACE
	lblServiceNotes.SetColorAndBorder(notesBgColor, 2dip, xui.Color_DarkGray, 5dip)
	PnlIn.AddView(lblServiceNotes, leftMargin, top, contentW, AvailableH)
	top = top + 10dip + AvailableH
	
	' 12. SAVE BUTTON
	Dim btnDismiss As Button : btnDismiss.Initialize("btnDismiss")
	Dim xbtn As B4XView = btnDismiss
	xbtn.Text = "SAVE & CLOSE"
	xbtn.Color = xui.Color_DarkGray
	xbtn.TextColor = xui.Color_White
	PnlIn.AddView(xbtn, leftMargin, top, contentW, 50dip)
	top = top + 60dip
	
	PnlIn.Height = top
End Sub

Private Sub CreateLabelHeader(Txt As String, Color As Int) As B4XView
	Dim l As Label : l.Initialize("")
	l.Typeface = LoadSafeFont("search - control labels.ttf")
	Dim xl As B4XView = l
	xl.Text = Txt
	xl.TextColor = Color
	xl.TextSize = 30 ' TRIPLE SIZE
	Return xl
End Sub

' --- HELPERS ---

Private Sub FormatPhone(Raw As String) As String
	Dim cleaned As String = Raw.Replace("+", "").Replace("-", "").Replace(" ", "").Replace("(", "").Replace(")", "")
	If cleaned.Length > 10 And cleaned.StartsWith("1") Then
		cleaned = cleaned.SubString(1)
	End If
	If cleaned.Length = 10 Then
		Return "(" & cleaned.SubString2(0, 3) & ") " & cleaned.SubString2(3, 6) & "-" & cleaned.SubString(6)
	Else
		Return Raw
	End If
End Sub

Private Sub CleanAddress(Addr As String) As String
	Dim temp As String = Addr.Replace(", USA", "").Replace(", US", "").Replace(" USA", "").Replace(" US", "").Trim
	temp = temp.Replace("United States", "")
	temp = temp.Replace(CRLF, " ").Replace(Chr(10), " ").Replace(Chr(13), " ")
	
	Try
		Dim m As Matcher : m = Regex.Matcher("(\d+.*?\d{5})", temp)
		If m.Find Then temp = m.Group(1).Trim
	Catch
		Log("Address Parse Error")
	End Try
	
	temp = temp.Replace("  ", " ").Replace(" ,", ",").Trim
	If temp.EndsWith(",") Then temp = temp.SubString2(0, temp.Length - 1)
	Return temp
End Sub

Private Sub LoadSafeFont(FontName As String) As Typeface
	Dim BaseDir As String = File.DirRootExternal & "/Geek God CRM/Fonts"
	
	If File.Exists(BaseDir, "") = False Then
		File.MakeDir(File.DirRootExternal, "Geek God CRM/Fonts")
	End If
	
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

' --- UPDATED INTERACTIONS ---

Sub lblGroupPicker_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	Dim Items As List : Items.Initialize
	Items.AddAll(Array As String("Client", "Preferred", "Blacklisted"))
	ShowCustomList("Select Client Group", Items, "Group")
End Sub

Sub lblHistoryPicker_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	Dim issues As List = CurrentProfile.Get("IssuesList")
	If issues.Size = 0 Then
		xui.MsgboxAsync("No history.", "History")
		Return
	End If
	ShowCustomList("Visit History", issues, "History")
End Sub

Sub ShowCustomList(Title As String, Items As List, RequestType As String)
	If GenericPopupPanel.IsInitialized And GenericPopupPanel.Parent.IsInitialized Then GenericPopupPanel.RemoveViewFromParent
	GenericPopupPanel = xui.CreatePanel("")
	GenericPopupPanel.SetColorAndBorder(xui.Color_White, 2dip, xui.Color_Black, 10dip)
	
	Dim itemH As Int = 38dip
	Dim headerH As Int = 35dip
	Dim contentHeight As Int = (Items.Size * itemH) + headerH + 10dip
	Dim MaxH As Int = Root.Height * 0.35
	Dim pH As Int = Min(contentHeight, MaxH)
	Dim pW As Int = Min(200dip, Root.Width * 0.8)
	Dim TopPos As Int = (Root.Height - pH) / 2
	Dim LeftPos As Int = (Root.Width - pW) / 2
	
	Root.AddView(GenericPopupPanel, LeftPos, TopPos, pW, pH)
	
	Dim lblHead As Label : lblHead.Initialize("")
	Dim xHead As B4XView = lblHead
	xHead.Text = Title
	xHead.TextColor = xui.Color_Black
	xHead.TextSize = 14
	lblHead.Typeface = Typeface.DEFAULT_BOLD
	xHead.SetTextAlignment("CENTER", "CENTER")
	GenericPopupPanel.AddView(xHead, 0, 0, pW, headerH)
	
	Dim clv As ScrollView : clv.Initialize(0)
	GenericPopupPanel.AddView(clv, 5dip, headerH + 5dip, pW - 10dip, pH - headerH - 10dip)
	Dim top As Int = 0
	
	For i = 0 To Items.Size - 1
		Dim lblItem As Label : lblItem.Initialize("SelectionItem")
		Dim xItem As B4XView = lblItem
		xItem.Text = Items.Get(i)
		xItem.TextColor = xui.Color_Black
		xItem.TextSize = 13
		xItem.Tag = CreateMap("Val": Items.Get(i), "Type": RequestType)
		lblItem.Gravity = Gravity.CENTER
		xItem.SetColorAndBorder(xui.Color_White, 1dip, 0xFFE0E0E0, 0)
		clv.Panel.AddView(xItem, 0, top, clv.Width, itemH)
		top = top + itemH
	Next
	clv.Panel.Height = top
End Sub

Sub SelectionItem_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	Dim btn As B4XView = Sender
	Dim m As Map = btn.Tag
	If m.Get("Type") = "Group" Then
		lblGroupPicker.Text = " Group: " & m.Get("Val")
		lblGroupPicker.Tag = m.Get("Val")
	End If
	GenericPopupPanel.RemoveViewFromParent
End Sub

Sub lblServiceNotes_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	If GenericPopupPanel.IsInitialized And GenericPopupPanel.Parent.IsInitialized Then GenericPopupPanel.RemoveViewFromParent
	GenericPopupPanel = xui.CreatePanel("")
	GenericPopupPanel.SetColorAndBorder(xui.Color_White, 2dip, xui.Color_Black, 5dip)
	Root.AddView(GenericPopupPanel, 10dip, 50dip, Root.Width - 20dip, Root.Height - 100dip)
	
	Dim lblHead As Label : lblHead.Initialize("")
	Dim xHead As B4XView = lblHead
	xHead.Text = "Edit Visit & Client Notes"
	xHead.TextColor = xui.Color_Black
	xHead.TextSize = 14
	lblHead.Typeface = Typeface.DEFAULT_BOLD
	xHead.SetTextAlignment("CENTER", "CENTER")
	GenericPopupPanel.AddView(xHead, 0, 0, GenericPopupPanel.Width, 40dip)
	
	Dim txtEdit As EditText : txtEdit.Initialize("")
	txtPopupNotes = txtEdit
	txtPopupNotes.Text = lblServiceNotes.Text
	txtPopupNotes.TextColor = xui.Color_Black
	txtPopupNotes.Color = 0xFFF0F0F0
	txtPopupNotes.TextSize = 14
	txtEdit.SingleLine = False
	txtEdit.Wrap = True
	txtEdit.Gravity = Gravity.TOP + Gravity.LEFT
	GenericPopupPanel.AddView(txtPopupNotes, 10dip, 45dip, GenericPopupPanel.Width - 20dip, GenericPopupPanel.Height - 100dip)
	
	Dim btnOk As Button : btnOk.Initialize("btnSaveNotes")
	Dim xOk As B4XView = btnOk
	xOk.Text = "SAVE NOTES"
	xOk.Color = 0xFF2E7D32
	xOk.TextColor = xui.Color_White
	GenericPopupPanel.AddView(xOk, 10dip, GenericPopupPanel.Height - 50dip, GenericPopupPanel.Width - 20dip, 40dip)
	
	txtPopupNotes.RequestFocus
	Sleep(100)
	kb.ShowKeyboard(txtPopupNotes)
End Sub

Sub btnSaveNotes_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	lblServiceNotes.Text = txtPopupNotes.Text
	CurrentProfile.Put("Notes", txtPopupNotes.Text)
	GenericPopupPanel.RemoveViewFromParent
	kb.HideKeyboard
End Sub

Sub lblPhone_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	Dim cPhone As String = CurrentProfile.Get("Phone")
	Msgbox2Async("Contact client?", "Contact", "Call", "Cancel", "Text", Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		' [CHANGED] Bypassing Dialer, triggering Direct Call
		CallSub2(B4XPages.MainPage, "DirectCall", cPhone)
	Else If Result = DialogResponse.NEGATIVE Then
		CallSub2(B4XPages.MainPage, "LaunchSMS", cPhone)
	End If
End Sub

' [NEW] Home Phone Click Event (Instant Direct Call)
Sub lblPhone2_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	Dim cPhone2 As String = CurrentProfile.Get("Phone2")
	CallSub2(B4XPages.MainPage, "DirectCall", cPhone2)
End Sub

Sub lblAddr_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	CallSub2(B4XPages.MainPage, "LaunchMaps", CurrentProfile.Get("Address"))
End Sub

Sub btnDismiss_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	Dim rName As String = CurrentProfile.Get("ResourceName")
	Dim etag As String = CurrentProfile.Get("Etag")
	Dim finalNote As String = lblServiceNotes.Text
	Dim newLabel As String = lblGroupPicker.Tag
	
	Dim updateMap As Map : updateMap.Initialize
	updateMap.Put("ResourceName", rName)
	updateMap.Put("Etag", etag)
	updateMap.Put("Notes", finalNote)
	
	If newLabel = "Blacklisted" Then
		updateMap.Put("IsBlacklisted", True)
		updateMap.Put("IsPreferred", False)
	Else If newLabel = "Preferred" Then
		updateMap.Put("IsPreferred", True)
		updateMap.Put("IsBlacklisted", False)
	Else
		updateMap.Put("IsPreferred", False)
		updateMap.Put("IsBlacklisted", False)
	End If
	
	CallSub2(B4XPages.MainPage, "UpdateContact", updateMap)
End Sub

Public Sub ShowUpdateSuccess
	xui.MsgboxAsync("Contact Updated", "Success")
	PnlResults.Visible = False
	txtSearch.Text = ""
	CallSub(B4XPages.MainPage, "RefreshDashboard")
End Sub

Sub btnCreateAppt_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	
	'Navigate to Appointment Page using CallSub to avoid member access errors
	Dim DestPage As Object = B4XPages.GetPage("AppointmentPage")
	CallSub2(DestPage, "SetClient", CurrentProfile)
	
	B4XPages.ShowPage("AppointmentPage")
End Sub
'Total Subroutines in Section S03 recorded last edit: 23
'Total Subroutines in Section S03 recorded after this edit - 23
'Total Subroutines added in this edit - 0
'Total Subroutines removed in this edit - 0
'Difference between edits - 0
'Total lines of code in this section before last edit - 617
'Total lines of code in this section after last edit - 621
'Total Line Difference - 4
'Total Discrepancies - 0
'//<END-SearchPage-S03>