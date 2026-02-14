B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.4
@EndOfDesignText@
'//<START-ViewSchedulePage-S01>
Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	
	' --- UI ELEMENTS (Restored from .old) ---
	Private PnlHeader As B4XView
	Private lblMonthYear As Label ' Native Label for better text control
	Private btnCalendar As Label
	Private spnUserFilter As Spinner
	
	' Grid Container
	Private PnlGrid As B4XView
	
	' List Container
	Private SlotContainer As ScrollView
	
	' --- DATA ---
	Private SelectedDate As Long
	Private SelectedUser As String
	Private ExistingEvents As Map
	
	' --- RESIZE/STATE FLAGS (The Fix) ---
	Private IsPageReady As Boolean = False
	Private LastWidth As Int = 0
End Sub

Public Sub Initialize
	SelectedDate = DateTime.Now
	ExistingEvents.Initialize
End Sub

'Total Subroutines in Section S01 recorded last edit: 2
'Total Subroutines in Section S01 recorded after this edit - 2
'Total Subroutines added in this edit - 0
'Total Subroutines removed in this edit - 0
'Difference between edits- 0
'Total Discrepancies - 0
'//<END-ViewSchedulePage-S01>







'//<START-ViewSchedulePage-S02>
Private Sub B4XPage_Created (Root1 As B4XView)
	Log(">>> [ViewSchedule] Created Started")
	Root = Root1
	Root.Color = xui.Color_White
	
	' 1. HEADER (Restored from .old)
	Dim HeaderHeight As Int = 60dip
	PnlHeader = xui.CreatePanel("")
	PnlHeader.Color = 0xFFEEEEEE
	Root.AddView(PnlHeader, 0, 0, Root.Width, HeaderHeight)
	
	' Home Icon
	Dim btnHome As Label : btnHome.Initialize("btnHome")
	Dim xHome As B4XView = btnHome
	xHome.Text = Chr(0xF015)
	btnHome.Typeface = Typeface.FONTAWESOME
	xHome.TextSize = 24
	xHome.TextColor = xui.Color_Black
	xHome.SetTextAlignment("CENTER", "CENTER")
	PnlHeader.AddView(xHome, 5dip, 0, 50dip, HeaderHeight)
	
	' User Spinner
	spnUserFilter.Initialize("spnUserFilter")
	spnUserFilter.AddAll(Array As String("God (Mike)", "Goddess (Erin)"))
	PnlHeader.AddView(spnUserFilter, 60dip, 7dip, 180dip, 45dip)
	
	' Month/Year Label
	lblMonthYear.Initialize("")
	lblMonthYear.TextSize = 22
	lblMonthYear.Typeface = Typeface.DEFAULT_BOLD
	lblMonthYear.TextColor = xui.Color_Black
	lblMonthYear.Gravity = Gravity.CENTER_VERTICAL + Gravity.RIGHT
	PnlHeader.AddView(lblMonthYear, 215dip, 0, Root.Width - 270dip, HeaderHeight)
	
	' Calendar Icon
	Dim btnCal As Label : btnCal.Initialize("btnCalendar")
	btnCalendar = btnCal
	Dim xCal As B4XView = btnCal
	xCal.Text = Chr(0xF073)
	btnCalendar.Typeface = Typeface.FONTAWESOME
	xCal.TextSize = 26
	xCal.TextColor = xui.Color_Blue
	xCal.SetTextAlignment("CENTER", "CENTER")
	PnlHeader.AddView(xCal, Root.Width - 55dip, 0, 50dip, HeaderHeight)
	
	' 2. GRID CONTAINER
	Dim GridTop As Int = HeaderHeight + 5dip
	PnlGrid = xui.CreatePanel("")
	Root.AddView(PnlGrid, 0, GridTop, Root.Width, 220dip)
	
	' 3. SCHEDULE LIST
	Dim ListTop As Int = GridTop + 225dip
	SlotContainer.Initialize(1000dip)
	Root.AddView(SlotContainer, 0, ListTop, Root.Width, Root.Height - ListTop)
	
	Log(">>> [ViewSchedule] Created Finished.")
	
	' --- FIX: Force UI Build immediately after creation ---
	' Since Appear is not firing, we trigger the build loop here.
	CallSubDelayed(Me, "BuildUI")
End Sub

Private Sub B4XPage_Appear
	Try
		Log(">>> [ViewSchedule] Appear Triggered")
		' Redundant trigger, just in case
		CallSubDelayed(Me, "BuildUI")
	Catch
		Log("Error in Appear: " & LastException)
	End Try
End Sub

' Helper Sub to safely build the UI once the page is fully ready
Public Sub BuildUI
	Log(">>> [ViewSchedule] BuildUI Running. Width: " & Root.Width)
	
	' Determine User
	If File.Exists(File.DirInternal, "settings.map") Then
		Dim settings As Map = File.ReadMap(File.DirInternal, "settings.map")
		SelectedUser = settings.GetDefault("CurrentUser", "Mike")
	Else
		SelectedUser = "Mike"
	End If
	If SelectedUser = "Mike" Then spnUserFilter.SelectedIndex = 0 Else spnUserFilter.SelectedIndex = 1

	' --- The Persistence Loop ---
	' If layout isn't ready (Width=0), wait 50ms and try again.
	If Root.Width = 0 Then
		Log("... Root Width is 0. Waiting 50ms...")
		Sleep(50)
		CallSubDelayed(Me, "BuildUI")
		Return
	End If
	
	' Prevent double-building if already done
	If IsPageReady = True And Abs(Root.Width - LastWidth) < 5dip Then
		Log("... UI already built. Skipping.")
		Return
	End If
	
	UpdateMonthDisplay
	BuildGrid
	RefreshSchedule
	
	IsPageReady = True
	LastWidth = Root.Width
	Log(">>> [ViewSchedule] Page Ready & Built.")
End Sub

Private Sub B4XPage_Resize (Width As Int, Height As Int)
	Log(">>> [ViewSchedule] Resize Event: " & Width)

	' --- FIX: Force Build if we missed it ---
	If IsPageReady = False And Width > 0 Then
		Log(">>> [ViewSchedule] Force Building UI from Resize...")
		BuildUI
		Return
	End If
	
	If IsPageReady = False Then Return
	If Abs(Width - LastWidth) < 20dip Then Return
	
	Log(">>> [ViewSchedule] Resize Logic: " & Width)
	LastWidth = Width
	
	Dim HeaderHeight As Int = 60dip
	PnlHeader.Width = Width
	PnlHeader.GetView(3).Left = Width - 55dip
	PnlHeader.GetView(2).Width = Width - 270dip
	
	Dim GridTop As Int = HeaderHeight + 5dip
	PnlGrid.Width = Width
	
	Dim ListTop As Int = GridTop + 225dip
	SlotContainer.Left = 0
	SlotContainer.Top = ListTop
	SlotContainer.Width = Width
	SlotContainer.Height = Height - ListTop
	
	BuildGrid
	BuildTimeList
End Sub

Private Sub B4XPage_Disappear
	Log(">>> [ViewSchedule] Disappear")
End Sub

'Total Subroutines in Section S02 recorded last edit: 5
'Total Subroutines in Section S02 recorded after this edit - 5
'Total Subroutines added in this edit - 0
'Total Subroutines removed in this edit - 0
'Difference between edits- 0
'Total Discrepancies - 0
'//<END-ViewSchedulePage-S02>





'//<START-ViewSchedulePage-S03>
Sub btnHome_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	B4XPages.ShowPage("MainPage")
End Sub

Sub spnUserFilter_ItemClick (Index As Int, Value As Object)
	Log(">>> [ViewSchedule] User Filter Changed: " & Index)
	If Index = 0 Then SelectedUser = "Mike" Else SelectedUser = "Erin"
	RefreshSchedule
End Sub

Sub btnCalendar_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	Dim jo As JavaObject = Me
	jo.RunMethod("showDatePicker", Null)
End Sub

Sub OnDateSelected(year As Int, month As Int, day As Int)
	Log(">>> [ViewSchedule] Date Selected via Picker: " & year & "-" & (month+1) & "-" & day)
	' Adjust month from 0-based (Java) to 1-based (B4A DateUtils)
	SelectedDate = DateUtils.SetDate(year, month + 1, day)
	UpdateMonthDisplay
	BuildGrid
	RefreshSchedule
End Sub

Private Sub UpdateMonthDisplay
	DateTime.DateFormat = "MMMM yyyy"
	lblMonthYear.Text = DateTime.Date(SelectedDate)
End Sub

' --- GRID BUILDER (Restored 10-Column Logic) ---
Private Sub BuildGrid
	Log(">>> [ViewSchedule] Building Grid... Width=" & Root.Width)
	PnlGrid.RemoveAllViews
	
	Dim Year As Int = DateTime.GetYear(SelectedDate)
	Dim Month As Int = DateTime.GetMonth(SelectedDate)
	Dim DaysInMonth As Int = DateUtils.NumberOfDaysInMonth(Month, Year)
	
	' 10 Columns as per original design
	Dim btnW As Int = Root.Width / 10
	Dim btnH As Int = 50dip
	
	For day = 1 To DaysInMonth
		Dim row As Int = (day - 1) / 10
		Dim col As Int = (day - 1) Mod 10
		
		Dim d As Long = DateUtils.SetDate(Year, Month, day)
		
		Dim btn As Button : btn.Initialize("btnGridDay")
		Dim xBtn As B4XView = btn
		
		DateTime.DateFormat = "EEE"
		Dim dayName As String = DateTime.Date(d)
		xBtn.Text = dayName & CRLF & day
		xBtn.TextSize = 10
		xBtn.Tag = d
		
		' STRICT DATE CHECK
		DateTime.DateFormat = "yyyyMMdd"
		If DateTime.Date(d) = DateTime.Date(SelectedDate) Then
			xBtn.Color = xui.Color_Blue
			xBtn.TextColor = xui.Color_White
		Else
			xBtn.Color = xui.Color_LightGray
			xBtn.TextColor = xui.Color_Black
		End If
		
		PnlGrid.AddView(xBtn, col * btnW, row * btnH, btnW, btnH)
	Next
	Log(">>> [ViewSchedule] Grid Built. Days: " & DaysInMonth)
End Sub

Sub btnGridDay_Click
	' --- FIX: Capture Sender IMMEDIATELY before calling any other subs ---
	' This prevents the ClassCastException where Sender becomes the Page object after a CallSub
	Dim NativeBtn As Button = Sender
	Dim btn As B4XView = NativeBtn
	
	Try
		CallSub(B4XPages.MainPage, "PlayRandomSound")
		
		Log(">>> [ViewSchedule] Date Clicked. Tag: " & btn.Tag)
		SelectedDate = btn.Tag
		UpdateMonthDisplay
		BuildGrid
		RefreshSchedule
	Catch
		Log("!!! Error in btnGridDay_Click: " & LastException)
	End Try
End Sub

' --- SCHEDULE LIST ---
Public Sub RefreshSchedule
	Log(">>> [ViewSchedule] Refreshing Schedule for: " & SelectedDate)
	ExistingEvents.Clear
	Dim TimeMin As String = CreateRFC3339(SelectedDate, 0)
	Dim TimeMax As String = CreateRFC3339(SelectedDate, 23)
	Dim job As HttpJob : job.Initialize("FetchViewSchedule", Me)
	job.Download("https://www.googleapis.com/calendar/v3/calendars/primary/events?timeMin=" & TimeMin.Replace("+", "%2B") & "&timeMax=" & TimeMax.Replace("+", "%2B") & "&singleEvents=true")
	job.GetRequest.SetHeader("Authorization", "Bearer " & B4XPages.MainPage.OAuth2.access_token)
End Sub

Sub JobDone(Job As HttpJob)
	Log(">>> [ViewSchedule] JobDone: " & Job.JobName & " Success: " & Job.Success)
	If Job.Success Then
		Try
			Dim parser As JSONParser : parser.Initialize(Job.GetString)
			Dim RootMap As Map = parser.NextObject
			Dim items As List = RootMap.Get("items")
			Log(">>> [ViewSchedule] Events Found: " & items.Size)
			
			For Each ev As Map In items
				Dim cId As String = ev.GetDefault("colorId", "1")
				Dim targetId As String = "1" : If SelectedUser = "Erin" Then targetId = "11"
				
				If cId = targetId Then
					Dim startMap As Map = ev.Get("start")
					Dim endMap As Map = ev.Get("end")
					Dim dtStart As String = startMap.GetDefault("dateTime", "")
					Dim dtEnd As String = endMap.GetDefault("dateTime", "")
					
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
					
					Dim StartHour As Int = ParseIsoToLocalHour(dtStart)
					Dim EndHour As Int = ParseIsoToLocalHour(dtEnd)
					
					If StartHour > -1 And EndHour > -1 Then
						For h = StartHour To EndHour - 1
							Dim EvData As Map = CreateMap("Name": summary, "Phone": cPhone, "Addr": ev.GetDefault("location", "No Address"), "Issue": cIssue)
							ExistingEvents.Put(h, EvData)
						Next
					End If
				End If
			Next
			BuildTimeList
		Catch
			Log("!!! Error Parsing Schedule: " & LastException)
		End Try
	Else
		Log("!!! Job Error: " & Job.ErrorMessage)
	End If
	Job.Release
End Sub

Private Sub BuildTimeList
	Log(">>> [ViewSchedule] Building Time List... Width=" & Root.Width)
	Dim PnlIn As B4XView = SlotContainer.Panel
	PnlIn.RemoveAllViews
	Dim topPos As Int = 10dip
	Dim rowH As Int = 100dip
	
	For hr = 10 To 20
		Dim p As B4XView = xui.CreatePanel("")
		p.SetColorAndBorder(xui.Color_White, 1dip, 0xFFEEEEEE, 0)
		
		Dim displayTime As String
		If hr > 12 Then
			displayTime = (hr - 12) & ":00 PM"
		Else If hr = 12 Then
			displayTime = "12:00 PM"
		Else
			displayTime = hr & ":00 AM"
		End If
		
		Dim lblT As Label : lblT.Initialize("") : Dim xT As B4XView = lblT
		xT.Text = displayTime : xT.TextColor = xui.Color_Black : xT.TextSize = 16
		lblT.Typeface = Typeface.DEFAULT_BOLD
		p.AddView(xT, 10dip, 0, 85dip, rowH)
		
		If ExistingEvents.ContainsKey(hr) Then
			Dim EvData As Map = ExistingEvents.Get(hr)
			Dim cName As String = EvData.Get("Name")
			Dim cPhone As String = EvData.Get("Phone")
			Dim cAddr As String = EvData.Get("Addr")
			Dim cIssue As String = EvData.Get("Issue")
			
			' LINE 1
			Dim lblLine1 As Label : lblLine1.Initialize("") : Dim xLine1 As B4XView = lblLine1
			Dim cs1 As CSBuilder
			cs1.Initialize.Typeface(Typeface.DEFAULT_BOLD).Color(xui.Color_Blue).Append("Name: " & cName).Pop.Pop
			cs1.Append("     ").Color(xui.Color_Blue).Bold.Append("Address: " & cAddr).Pop.Pop
			xLine1.Text = cs1
			xLine1.TextSize = 13
			xLine1.SetTextAlignment("CENTER", "CENTER")
			p.AddView(xLine1, 100dip, 10dip, Root.Width - 110dip, 35dip)
			
			' LINE 2
			Dim lblLine2 As Label : lblLine2.Initialize("") : Dim xLine2 As B4XView = lblLine2
			Dim cs2 As CSBuilder
			cs2.Initialize.Typeface(Typeface.DEFAULT_BOLD).Color(xui.Color_Blue).Append("Phone: " & cPhone).Pop.Pop
			cs2.Append("     ").Color(xui.Color_Black).Bold.Append("Issue: " & cIssue).Pop.Pop
			xLine2.Text = cs2
			xLine2.TextSize = 13
			xLine2.SetTextAlignment("CENTER", "CENTER")
			p.AddView(xLine2, 100dip, 45dip, Root.Width - 110dip, 35dip)
			
		Else
			Dim lblFree As Label : lblFree.Initialize("") : Dim xFree As B4XView = lblFree
			xFree.Text = "Available"
			xFree.TextColor = xui.Color_LightGray
			xFree.TextSize = 14
			p.AddView(xFree, 100dip, 30dip, Root.Width - 110dip, 40dip)
		End If
		
		PnlIn.AddView(p, 0, topPos, Root.Width, rowH)
		topPos = topPos + rowH + 2dip
	Next
	PnlIn.Height = topPos
	Log(">>> [ViewSchedule] Time List Built.")
End Sub

' --- UTILS ---
Private Sub ParseIsoToLocalHour(iso As String) As Int
	Try
		Dim H As Int = iso.SubString2(11,13)
		If iso.EndsWith("Z") Then H = H + DateTime.TimeZoneOffset
		If H < 0 Then H = H + 24
		If H > 23 Then H = H - 24
		Return H
	Catch
		Return -1
	End Try
End Sub

Private Sub CreateRFC3339(DateMs As Long, Hour As Int) As String
	DateTime.DateFormat = "yyyy-MM-dd"
	Return DateTime.Date(DateMs) & "T" & NumberFormat(Hour, 2, 0) & ":00:00-05:00"
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

'Total Subroutines in Section S03 recorded last edit: 12
'Total Subroutines in Section S03 recorded after this edit - 12
'Total Subroutines added in this edit - 0
'Total Subroutines removed in this edit - 0
'Difference between edits- 0
'Total Discrepancies - 0
'//<END-ViewSchedulePage-S03>