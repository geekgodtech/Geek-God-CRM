B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.4
@EndOfDesignText@
'//<START-CreateClientPage-S01>
Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private rp As RuntimePermissions

	' *** CONFIGURATION ***
	Private const PLACES_API_KEY As String = "AIzaSyAVOMjr8iK5af4oj2xjZntrKH6ec2lpvR4"

	' Container
	Private sv As B4XView
	Private svPanel As B4XView

	' --- UI ELEMENTS ---
	Private lblTitle As B4XView
	Private btnHome As B4XView
	
	Private lblName As B4XView
	Private lblSecondName As B4XView ' [NEW]
	Private lblPhone As B4XView
	Private lblHousePhone As B4XView
	Private lblAddr As B4XView
	Private lblNotes As B4XView
	Private lblGroup As B4XView

	' Inputs
	Private txtName As EditText
	Private txtSecondName As EditText ' [FIXED] DECLARED HERE
	Private txtPhone As EditText
	Private txtHousePhone As EditText
	
	' Address Smoke & Mirrors
	Private txtAddress As EditText ' Real (Hidden during display)
	Private txtAddressDisplay As EditText ' Fake (Visible to user)
	
	Private txtNotes As EditText
	Private spnGroup As Spinner

	' Suggestions
	Private clvSuggestions As CustomListView
	Private pnlSuggestions As B4XView
	Private SuggestionPanelHeight As Int = 0

	' --- BUTTONS ---
	Private btnSave As B4XView
	Private btnCancel As B4XView
	Private btnGetNumber As B4XView

	' --- DIALOGS ---
	Private Dialog As B4XDialog

	' --- TOOLS ---
	Private ime As IME
	Private ResizeTimer As Timer
	Private SearchTimer As Timer
	Private IsPageReady As Boolean = False

	' --- DATA HOLDER ---
	Private PendingClientMap As Map
	Private BufferedScrapeData As Map
	Private DuplicateCheckStep As Int = 0
	Private FoundDuplicateName As String = ""
	Private IsSaving As Boolean = False
	Public IsScrapeMode As Boolean = False
	
	' Holds the complete Google Address while the UI displays the short version
	Private FullSelectedAddress As String = ""

	' --- FONTS ---
	Private fontTitle As Typeface
	Private fontLabels As Typeface
	Private fontInputs As Typeface

	' --- WATCHDOG ---
	Private LastWidth As Int = 0
	Private LastHeight As Int = 0
End Sub

Public Sub Initialize
	ime.Initialize("ime")
	ResizeTimer.Initialize("ResizeTimer", 500)
	ResizeTimer.Enabled = False
	SearchTimer.Initialize("SearchTimer", 600)
	SearchTimer.Enabled = False
	PendingClientMap.Initialize
	BufferedScrapeData.Initialize
End Sub

Private Sub ResizeTimer_Tick
	If IsPageReady = False Then Return
	If Root.IsInitialized = False Then Return
	Dim ScreenW As Int = GetDeviceLayoutValues.Width
	Dim ScreenH As Int = GetDeviceLayoutValues.Height
	If Abs(ScreenW - LastWidth) > 10dip Or Abs(ScreenH - LastHeight) > 10dip Then
		B4XPage_Resize(ScreenW, ScreenH)
	End If
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.Color = xui.Color_White
	IsPageReady = False

	Dialog.Initialize(Root)
	Dialog.Title = "Call Client"

	' Load Fonts SAFELY
	LoadLocalFonts

	Dim nSV As ScrollView : nSV.Initialize(0)
	sv = nSV
	Root.AddView(sv, 0, 0, Root.Width, Root.Height)
	svPanel = sv.GetView(0)
	
	Dim lT As Label : lT.Initialize("")
	lT.Text = "Add New Client"
	lT.TextSize = 33 : lT.Typeface = fontTitle : lT.TextColor = xui.Color_Black
	lT.Gravity = Gravity.CENTER
	svPanel.AddView(lT, 0, 0, 0, 0)
	lblTitle = lT
	
	Dim bH As Button : bH.Initialize("btnHome")
	bH.Text = Chr(0xF015)
	bH.Typeface = Typeface.FONTAWESOME
	bH.TextSize = 24
	bH.Color = xui.Color_Transparent
	bH.TextColor = xui.Color_Black
	bH.Gravity = Gravity.CENTER
	btnHome = bH
	svPanel.AddView(btnHome, 0, 0, 0, 0)
	
	' TextSize bumped to 24 for all Labels
	Dim lN As Label : lN.Initialize("") : lN.Text = "First Name:" : lN.TextSize = 24 : lN.TextColor = xui.Color_DarkGray : lN.Typeface = fontLabels
	svPanel.AddView(lN, 0, 0, 0, 0)
	lblName = lN
	
	txtName.Initialize("txtInput") : txtName.TextSize = 14 : txtName.Color = 0xFFF0F0F0 : txtName.TextColor = xui.Color_Black : txtName.Typeface = fontInputs
	txtName.Gravity = Gravity.CENTER_VERTICAL
	svPanel.AddView(txtName, 0, 0, 0, 0)
	
	' Second Name Label & Input
	Dim lN2 As Label : lN2.Initialize("") : lN2.Text = "Second Name:" : lN2.TextSize = 24 : lN2.TextColor = xui.Color_DarkGray : lN2.Typeface = fontLabels
	svPanel.AddView(lN2, 0, 0, 0, 0)
	lblSecondName = lN2
	
	txtSecondName.Initialize("txtInput") : txtSecondName.Hint = "Optional" : txtSecondName.TextSize = 14 : txtSecondName.Color = 0xFFF0F0F0 : txtSecondName.TextColor = xui.Color_Black : txtSecondName.Typeface = fontInputs
	txtSecondName.Gravity = Gravity.CENTER_VERTICAL
	svPanel.AddView(txtSecondName, 0, 0, 0, 0)
	
	Dim lP As Label : lP.Initialize("") : lP.Text = "Cell Number:" : lP.TextSize = 24 : lP.TextColor = xui.Color_DarkGray : lP.Typeface = fontLabels
	svPanel.AddView(lP, 0, 0, 0, 0)
	lblPhone = lP
	
	txtPhone.Initialize("txtPhone")
	txtPhone.TextSize = 14
	txtPhone.Color = 0xFFF0F0F0
	txtPhone.TextColor = xui.Color_Black
	txtPhone.InputType = txtPhone.INPUT_TYPE_PHONE
	txtPhone.Typeface = fontInputs
	txtPhone.Gravity = Gravity.CENTER_VERTICAL
	svPanel.AddView(txtPhone, 0, 0, 0, 0)
	
	Dim bPhone As Button : bPhone.Initialize("btnGetNumber")
	bPhone.Text = "📞"
	bPhone.TextSize = 14
	bPhone.Enabled = True
	bPhone.Typeface = fontInputs
	btnGetNumber = bPhone
	svPanel.AddView(btnGetNumber, 0, 0, 0, 0)
	
	Dim lHP As Label : lHP.Initialize("") : lHP.Text = "Alt Number:" : lHP.TextSize = 24 : lHP.TextColor = xui.Color_DarkGray : lHP.Typeface = fontLabels
	svPanel.AddView(lHP, 0, 0, 0, 0)
	lblHousePhone = lHP
	
	txtHousePhone.Initialize("txtHousePhone")
	txtHousePhone.Hint = "Optional"
	txtHousePhone.TextSize = 14
	txtHousePhone.Color = 0xFFF0F0F0
	txtHousePhone.TextColor = xui.Color_Black
	txtHousePhone.InputType = txtHousePhone.INPUT_TYPE_PHONE
	txtHousePhone.Typeface = fontInputs
	txtHousePhone.Gravity = Gravity.CENTER_VERTICAL
	svPanel.AddView(txtHousePhone, 0, 0, 0, 0)
	
	Dim lA As Label : lA.Initialize("") : lA.Text = "Address:" : lA.TextSize = 24 : lA.TextColor = xui.Color_DarkGray : lA.Typeface = fontLabels
	svPanel.AddView(lA, 0, 0, 0, 0)
	lblAddr = lA
	
	txtAddress.Initialize("txtAddress") : txtAddress.TextSize = 14 : txtAddress.Color = 0xFFF0F0F0 : txtAddress.TextColor = xui.Color_Black : txtAddress.Typeface = fontInputs
	txtAddress.Gravity = Gravity.CENTER_VERTICAL
	svPanel.AddView(txtAddress, 0, 0, 0, 0)
	
	txtAddressDisplay.Initialize("txtAddressDisplay") : txtAddressDisplay.TextSize = 14 : txtAddressDisplay.Color = 0xFFF0F0F0 : txtAddressDisplay.TextColor = xui.Color_Black : txtAddressDisplay.Typeface = fontInputs
	txtAddressDisplay.Gravity = Gravity.CENTER_VERTICAL
	svPanel.AddView(txtAddressDisplay, 0, 0, 0, 0)
	
	pnlSuggestions = xui.CreatePanel("")
	pnlSuggestions.Color = xui.Color_White
	pnlSuggestions.Visible = False
	
	clvSuggestions.Initialize(Me, "clvSuggestions")
	Dim lblStub As Label : lblStub.Initialize("")
	Dim props As Map = CreateMap("DividerColor": 0xFFD9D9D9, "DividerHeight": 1dip, "PressedColor": 0xFF7EB4FA, "InsertAnimationDuration": 0, "ListOrientation": "Vertical")
	clvSuggestions.DesignerCreateView(pnlSuggestions, lblStub, props)
	svPanel.AddView(pnlSuggestions, 0, 0, 0, 0)
	
	' Changed Text to just "Notes:"
	Dim lNo As Label : lNo.Initialize("") : lNo.Text = "Notes:" : lNo.TextSize = 24 : lNo.TextColor = xui.Color_DarkGray : lNo.Typeface = fontLabels
	svPanel.AddView(lNo, 0, 0, 0, 0)
	lblNotes = lNo
	
	txtNotes.Initialize("txtInput") : txtNotes.TextSize = 14 : txtNotes.Color = 0xFFF0F0F0 : txtNotes.TextColor = xui.Color_Black : txtNotes.Typeface = fontInputs
	txtNotes.SingleLine = False
	txtNotes.Wrap = True
	txtNotes.Gravity = Gravity.TOP + Gravity.LEFT
	svPanel.AddView(txtNotes, 0, 0, 0, 0)
	
	Dim lG As Label : lG.Initialize("") : lG.Text = "Group:" : lG.TextSize = 24 : lG.TextColor = xui.Color_DarkGray : lG.Typeface = fontLabels
	svPanel.AddView(lG, 0, 0, 0, 0)
	lblGroup = lG
	
	spnGroup.Initialize("spnGroup")
	Dim cs1 As CSBuilder : cs1.Initialize.Typeface(fontInputs).Append("Standard Client").PopAll
	Dim cs2 As CSBuilder : cs2.Initialize.Typeface(fontInputs).Append("Preferred Client").PopAll
	Dim cs3 As CSBuilder : cs3.Initialize.Typeface(fontInputs).Append("Blacklisted Client").PopAll
	spnGroup.AddAll(Array(cs1, cs2, cs3))
	svPanel.AddView(spnGroup, 0, 0, 0, 0)
	
	Dim bS As Button : bS.Initialize("btnSave") : bS.Text = "Save" : bS.Color = 0xFF2E7D32 : bS.TextColor = xui.Color_White : bS.TextSize = 16 : bS.Typeface = fontInputs
	svPanel.AddView(bS, 0, 0, 0, 0)
	btnSave = bS
	
	Dim bC As Button : bC.Initialize("btnCancel") : bC.Text = "Cancel" : bC.Color = xui.Color_Red : bC.TextColor = xui.Color_White : bC.TextSize = 16 : bC.Typeface = fontInputs
	svPanel.AddView(bC, 0, 0, 0, 0)
	btnCancel = bC
	
	IsPageReady = True
	B4XPage_Resize(Root.Width, Root.Height)
End Sub

Private Sub LoadLocalFonts
	Dim FontDir As String = rp.GetSafeDirDefaultExternal("Fonts")
	
	fontTitle = SafeLoadFont(FontDir, "addnewclient - title label.ttf")
	If fontTitle = Typeface.DEFAULT Then fontTitle = Typeface.DEFAULT_BOLD
	
	fontLabels = SafeLoadFont(FontDir, "addnewclient - labels.ttf")
	If fontLabels = Typeface.DEFAULT Then fontLabels = Typeface.DEFAULT_BOLD
	
	fontInputs = SafeLoadFont(FontDir, "addnewclient - buttons.ttf")
	If fontInputs = Typeface.DEFAULT Then Log(">>> [FONTS] Button font failed to load! Check file name.")
End Sub

Private Sub SafeLoadFont(DirPath As String, FileName As String) As Typeface
	Try
		If File.Exists(DirPath, FileName) Then
			Dim jo As JavaObject
			jo.InitializeStatic("android.graphics.Typeface")
			Dim Path As String = File.Combine(DirPath, FileName)
			Dim NativeFont As Object = jo.RunMethod("createFromFile", Array(Path))
			If NativeFont <> Null Then Return NativeFont
		End If
	Catch
		Log("Error loading font: " & LastException.Message)
	End Try
	If File.Exists(File.DirAssets, FileName) Then Return Typeface.LoadFromAssets(FileName)
	Return Typeface.DEFAULT
End Sub

' =========================================================
' ===            MASTER RESIZE RECEIVER                 ===
' =========================================================

Public Sub RedrawUI(CurrentW As Int)
	If Root.IsInitialized = False Then Return
	B4XPage_Resize(CurrentW, Root.Height)
End Sub

Private Sub B4XPage_Resize (Width As Int, Height As Int)
	If IsPageReady = False Then Return
	If Width < 50 Or Height < 50 Then Return

	LastWidth = Width
	LastHeight = Height

	sv.SetLayoutAnimated(0, 0, 0, Width, Height)
	svPanel.Width = Width

	Dim Margin As Int = 20dip
	Dim FieldWidth As Int = Width - (Margin * 2)
	If FieldWidth < 50dip Then FieldWidth = 50dip
	Dim TopY As Int = 20dip

	Dim HomeSize As Int = 60dip

	btnHome.SetLayoutAnimated(0, Margin, TopY, HomeSize, 50dip)
	lblTitle.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 50dip)
	lblTitle.SetTextAlignment("CENTER", "CENTER")
	btnHome.BringToFront
	TopY = TopY + 55dip

	' [FOLDABLE LOGIC UPGRADE]
	' If Device is HALF_OPENED (Tabletop), force Stacked Layout (Compact Mode)
	Dim UseStackedMode As Boolean = False
	If Width < 1300 Then UseStackedMode = True
	If B4XPages.MainPage.LastFoldState = "HALF_OPENED" Then UseStackedMode = True
	
	If UseStackedMode = False Then
		' --- BIG SCREEN LAYOUT: Side-by-Side Grid ---
		Dim Gap As Int = 20dip
		Dim ColW As Int = (FieldWidth - Gap) / 2
		Dim Col2Start As Int = Margin + ColW + Gap
		
		' ROW 1: Names
		lblName.SetLayoutAnimated(0, Margin, TopY, ColW, 30dip)
		lblSecondName.SetLayoutAnimated(0, Col2Start, TopY, ColW, 30dip)
		TopY = TopY + 30dip
		
		txtName.SetLayoutAnimated(0, Margin, TopY, ColW, 40dip)
		txtSecondName.SetLayoutAnimated(0, Col2Start, TopY, ColW, 40dip)
		TopY = TopY + 50dip
		
		' ROW 2: Phones
		lblPhone.SetLayoutAnimated(0, Margin, TopY, ColW, 30dip)
		lblHousePhone.SetLayoutAnimated(0, Col2Start, TopY, ColW, 30dip)
		TopY = TopY + 30dip
		
		Dim ButtonSize As Int = 45dip
		Dim PhoneFieldWidth As Int = ColW - ButtonSize - 10dip
		txtPhone.SetLayoutAnimated(0, Margin, TopY, PhoneFieldWidth, 40dip)
		btnGetNumber.SetLayoutAnimated(0, Margin + PhoneFieldWidth + 10dip, TopY, ButtonSize, 40dip)
		
		txtHousePhone.SetLayoutAnimated(0, Col2Start, TopY, ColW, 40dip)
		TopY = TopY + 50dip
	Else
		' --- SMALL SCREEN / FOLDED LAYOUT: Vertical Stack ---
		lblName.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 30dip) : TopY = TopY + 30dip
		txtName.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 40dip) : TopY = TopY + 50dip
		
		lblSecondName.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 30dip) : TopY = TopY + 30dip
		txtSecondName.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 40dip) : TopY = TopY + 50dip
		
		lblPhone.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 30dip) : TopY = TopY + 30dip
		Dim ButtonSize As Int = 45dip
		Dim PhoneFieldWidth As Int = FieldWidth - ButtonSize - 10dip
		txtPhone.SetLayoutAnimated(0, Margin, TopY, PhoneFieldWidth, 40dip)
		btnGetNumber.SetLayoutAnimated(0, Margin + PhoneFieldWidth + 10dip, TopY, ButtonSize, 40dip)
		TopY = TopY + 50dip
		
		lblHousePhone.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 30dip) : TopY = TopY + 30dip
		txtHousePhone.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 40dip) : TopY = TopY + 50dip
	End If
	
	' --- ADDRESS & DOWNWARD (Full Width regardless of screen size) ---
	lblAddr.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 30dip) : TopY = TopY + 30dip
	txtAddress.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 40dip)
	txtAddressDisplay.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 40dip)
	txtAddress.As(B4XView).BringToFront
	Dim AddressBottomY As Int = TopY + 40dip
	
	TopY = AddressBottomY + 10dip
	lblNotes.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 30dip) : TopY = TopY + 30dip
	txtNotes.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 90dip) : TopY = TopY + 100dip
	
	lblGroup.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 30dip) : TopY = TopY + 30dip
	Dim vSpin As View = spnGroup
	vSpin.SetLayoutAnimated(0, Margin, TopY, FieldWidth, 40dip)
	TopY = TopY + 60dip
	
	Dim BtnGap As Int = 10dip
	Dim BtnWidth As Int = (FieldWidth - BtnGap) / 2
	btnCancel.SetLayoutAnimated(0, Margin, TopY, BtnWidth, 50dip)
	btnSave.SetLayoutAnimated(0, Margin + BtnWidth + BtnGap, TopY, BtnWidth, 50dip)
	
	' Removed empty bottom space. Hugs just beneath the buttons.
	TopY = TopY + 70dip
	svPanel.Height = TopY
	
	If SuggestionPanelHeight > 0 Then
		pnlSuggestions.Visible = True
		pnlSuggestions.SetLayoutAnimated(0, Margin, AddressBottomY, FieldWidth, SuggestionPanelHeight)
		If clvSuggestions.IsInitialized And clvSuggestions.AsView.IsInitialized Then
			clvSuggestions.AsView.SetLayoutAnimated(0, 0, 0, FieldWidth, SuggestionPanelHeight)
			clvSuggestions.Base_Resize(FieldWidth, SuggestionPanelHeight)
		End If
		pnlSuggestions.BringToFront
	Else
		pnlSuggestions.Visible = False
	End If
End Sub
'//<END-CreateClientPage-S01>





'//<START-CreateClientPage-S02>
' =========================================================
' ===                INTERACTION LOGIC                  ===
' =========================================================

Private Sub B4XPage_Appear
	IsPageReady = False
	IsSaving = False
	
	If IsScrapeMode = False Then
		ClearForm
	End If
	
	SuggestionPanelHeight = 0
	sv.As(ScrollView).ScrollPosition = 0
	txtAddress.SingleLine = True
	txtAddressDisplay.SingleLine = True
	
	txtName.RequestFocus
	Sleep(100)
	
	IsPageReady = True
	ime.ShowKeyboard(txtName)
	
	If GetDeviceLayoutValues.Width > 50 Then
		B4XPage_Resize(GetDeviceLayoutValues.Width, GetDeviceLayoutValues.Height)
	End If
	
	ResizeTimer.Enabled = True
End Sub

Sub txtInput_EnterPressed
	ime.HideKeyboard
End Sub

' Long Click on the Cell Number Field itself triggers the Call Log Autofill
Sub txtPhone_LongClick
	Log(">>> [Phone Input] Long Click Detected.")
	rp.CheckAndRequest(rp.PERMISSION_READ_CALL_LOG)
	Wait For B4XPage_PermissionResult (Permission As String, Result As Boolean)
	
	If Result Then
		GetLastCallLogEntry
	Else
		xui.MsgboxAsync("Permission Denied. Cannot read Call Log.", "Error")
	End If
End Sub

' The Phone Button triggers an IMMEDIATE direct dial via ACTION_CALL
Sub btnGetNumber_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	Dim CleanPhone As String = txtPhone.Text.Replace("(", "").Replace(")", "").Replace("-", "").Replace(" ", "")
	If CleanPhone = "" Then Return
	
	rp.CheckAndRequest(rp.PERMISSION_CALL_PHONE)
	Wait For B4XPage_PermissionResult (Permission As String, Result As Boolean)
	If Result Then
		Dim i As Intent
		i.Initialize(i.ACTION_CALL, "tel:" & CleanPhone)
		StartActivity(i)
	Else
		xui.MsgboxAsync("Permission to make calls was denied.", "Error")
	End If
End Sub

Private Sub GetLastCallLogEntry
	Try
		Dim Calls As List
		Dim CallLog As CallLog
		Calls = CallLog.GetAll(1) ' Get 1 most recent call
		
		If Calls.Size > 0 Then
			Dim c As CallItem = Calls.Get(0)
			Dim RawNum As String = c.Number
			' Sanitize
			Dim CleanNum As String = RawNum.Replace("-", "").Replace(" ", "").Replace("(", "").Replace(")", "").Replace("+", "")
			If CleanNum.Length > 10 And CleanNum.StartsWith("1") Then CleanNum = CleanNum.SubString(1)
			
			' Formatting (###) ###-####
			If CleanNum.Length = 10 Then
				txtPhone.Text = "(" & CleanNum.SubString2(0,3) & ") " & CleanNum.SubString2(3,6) & "-" & CleanNum.SubString2(6,10)
			Else
				txtPhone.Text = RawNum
			End If
			
			ToastMessageShow("Last caller autofilled!", False)
		Else
			xui.MsgboxAsync("No calls found in log.", "Empty")
		End If
	Catch
		Log("Error accessing Call Log: " & LastException)
		xui.MsgboxAsync("Error reading Call Log.", "Error")
	End Try
End Sub

' =========================================================
' ===          ADDRESS AUTOCOMPLETE UI TRIGGERS         ===
' =========================================================

' Z-Order Trick: Clicking the Fake display box brings the Real box forward to capture typing.
Sub txtAddressDisplay_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		Log(">>> [Z-ORDER] Display Clicked. Bringing Real Address input to front.")
		txtAddress.Text = txtAddressDisplay.Text
		txtAddress.As(B4XView).BringToFront
		txtAddress.RequestFocus
		ime.ShowKeyboard(txtAddress)
	End If
End Sub

' This only fires when the REAL box is on top and being typed into
Sub txtAddress_TextChanged (Old As String, New As String)
	If New.Length < 3 Then
		SuggestionPanelHeight = 0
		B4XPage_Resize(Root.Width, Root.Height)
		Return
	End If
	SearchTimer.Enabled = False
	SearchTimer.Enabled = True
End Sub

Sub clvSuggestions_ItemClick (Index As Int, Value As Object)
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	Dim DataMap As Map = Value
	Dim PlaceID As String = DataMap.Get("PlaceID")
	
	SearchTimer.Enabled = False
	SuggestionPanelHeight = 0
	B4XPage_Resize(Root.Width, Root.Height)
	
	FetchPlaceDetails(PlaceID)
End Sub

' =========================================================
' ===              SCRAPER & SAVE UI LOGIC              ===
' =========================================================

Public Sub PopulateScrapeData(Data As Map)
	IsScrapeMode = True
	BufferedScrapeData = Data
	
	txtName.Text = Data.GetDefault("Name", "")
	
	' Autofill Second Name from Scraper
	txtSecondName.Text = Data.GetDefault("Name2", "")
	
	txtPhone.Text = Data.GetDefault("Phone", "")
	
	Dim ScrapedAddr As String = Data.GetDefault("Address", "")
	
	' Populate both the real and fake boxes with the initial scrape data
	txtAddress.Text = ScrapedAddr
	txtAddressDisplay.Text = ScrapedAddr
	FullSelectedAddress = ScrapedAddr
	
	txtNotes.Text = Data.GetDefault("Notes", "")
	txtHousePhone.Text = ""
	
	' Put the Fake box on top initially
	txtAddressDisplay.As(B4XView).BringToFront
End Sub

Sub btnSave_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	If IsSaving Then Return
	
	Dim Name As String = txtName.Text.Trim
	Dim SecondName As String = txtSecondName.Text.Trim
	Dim Phone As String = txtPhone.Text.Trim
	Dim HousePhone As String = txtHousePhone.Text.Trim ' The "Alt Number"
	Dim UserNotes As String = txtNotes.Text.Trim
	
	' Use the background/high-def address for saving, ignoring the display string
	Dim FinalAddress As String = FullSelectedAddress
	If FinalAddress = "" Then FinalAddress = txtAddress.Text.Trim
	
	' Enforce Name, Cell Phone, AND Address.
	If Name = "" Or Phone = "" Or FinalAddress = "" Then
		xui.MsgboxAsync("First Name, Cell Number, and Address are required.", "Missing Info")
		Return
	End If
	
	ime.HideKeyboard
	IsSaving = True
	ProgressDialogShow("Checking for duplicates...")
	
	' Combine Names for the single Google Contact entry
	Dim CombinedName As String = Name
	If SecondName <> "" Then CombinedName = Name & " & " & SecondName
	
	' [FIXED] Removed the auto-generated "Created via GeekGod App" header.
	' It now strictly passes only what the user typed.
	Dim FinalNotes As String = UserNotes
	
	PendingClientMap.Clear
	PendingClientMap.Put("Name", CombinedName)
	PendingClientMap.Put("Phone", Phone)
	
	' Pass Alt Phone to API (Logic in B4XMainPage will assign this as "Home" type)
	PendingClientMap.Put("HousePhone", HousePhone)
	
	PendingClientMap.Put("Address", FinalAddress)
	PendingClientMap.Put("Notes", FinalNotes)
	PendingClientMap.Put("ResourceName", "")
	PendingClientMap.Put("Etag", "")
	PendingClientMap.Put("IsScrapeWorkflow", IsScrapeMode)
	
	If UserNotes <> "" Then
		PendingClientMap.Put("ScrapedIssue", UserNotes)
	End If
	
	Dim SelGroup As String = "Standard Client" ' Default
	' Extract the text value from the CSBuilder item
	Dim SpinVal As String = spnGroup.SelectedItem
	If SpinVal.Contains("Blacklisted") Then SelGroup = "Blacklisted"
	If SpinVal.Contains("Preferred") Then SelGroup = "Preferred"
	PendingClientMap.Put("GroupLabel", SelGroup)
	
	CheckDuplicates(Name) ' Search by the primary First Name
End Sub

Public Sub ClearForm
	If txtName.IsInitialized Then txtName.Text = ""
	If txtSecondName.IsInitialized Then txtSecondName.Text = ""
	If txtPhone.IsInitialized Then txtPhone.Text = ""
	If txtHousePhone.IsInitialized Then txtHousePhone.Text = ""
	If txtAddress.IsInitialized Then txtAddress.Text = ""
	If txtAddressDisplay.IsInitialized Then txtAddressDisplay.Text = ""
	If txtNotes.IsInitialized Then txtNotes.Text = ""
	If spnGroup.IsInitialized Then spnGroup.SelectedIndex = 0
	SuggestionPanelHeight = 0
	FullSelectedAddress = ""
	IsScrapeMode = False
	
	' Reset Z-Order
	If txtAddressDisplay.IsInitialized Then txtAddressDisplay.As(B4XView).BringToFront
End Sub

' =========================================================
' ===                  NAVIGATION                       ===
' =========================================================

Sub btnHome_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	IsScrapeMode = False
	BufferedScrapeData.Clear
	B4XPages.ShowPage("MainPage")
	ClearForm
End Sub

Sub btnCancel_Click
	CallSub(B4XPages.MainPage, "PlayRandomSound")
	If IsScrapeMode Then
		B4XPages.ShowPage("MainPage")
		CallSub(B4XPages.MainPage, "ProcessNextScrapeItem")
	Else
		B4XPages.ShowPage("MainPage")
	End If
	ClearForm
End Sub
'Total Subroutines in Section S02 recorded last edit: 13
'Total Subroutines in Section S02 recorded after this edit - 13 
'Total Subroutines added in this edit - 0
'Total Subroutines removed in this edit - 0
'Difference between edits - 0
'Total Discrepancies - 0
'//<END-CreateClientPage-S02>




'//<START-CreateClientPage-S03>
' =========================================================
' ===          DATA, API & FILE LOGIC                   ===
' =========================================================

Sub JobDone (Job As HttpJob)
	If Job.Success Then
		Select Job.JobName
			Case "CheckDuplicates": HandleDuplicateCheck(Job)
			Case "Places": HandlePlacesResult(Job)
			Case "PlaceDetails": HandlePlaceDetails(Job)
		End Select
	Else
		Log(">>> [API ERROR] " & Job.JobName & ": " & Job.ErrorMessage)
		If Job.JobName = "CheckDuplicates" Then FinalizeSave
	End If
	Job.Release
End Sub

' --- API 1: SUGGESTIONS ---
Sub SearchTimer_Tick
	SearchTimer.Enabled = False
	Dim query As String = txtAddress.Text.Trim
	If query.Length < 3 Then Return
	
	Dim j As HttpJob : j.Initialize("Places", Me)
	Dim url As String = "https://maps.googleapis.com/maps/api/place/autocomplete/json?input=" & _
	query.Replace(" ", "%20") & "&types=address&sessiontoken=1234567890&key=" & PLACES_API_KEY
	j.Download(url)
End Sub

Sub HandlePlacesResult(Job As HttpJob)
	Dim parser As JSONParser : parser.Initialize(Job.GetString)
	Dim rootMap As Map = parser.NextObject
	
	If rootMap.GetDefault("status", "") = "OK" Then
		Dim predictions As List = rootMap.Get("predictions")
		
		clvSuggestions.Clear
		Dim RowHeight As Int = 45dip
		
		For Each pred As Map In predictions
			Dim desc As String = pred.Get("description")
			Dim pId As String = pred.Get("place_id")
			
			Dim p As B4XView = xui.CreatePanel("")
			p.SetLayoutAnimated(0, 0, 0, clvSuggestions.AsView.Width, RowHeight)
			p.Color = xui.Color_White
			
			Dim lbl As Label : lbl.Initialize("")
			Dim xLbl As B4XView = lbl
			xLbl.Text = "  " & desc
			xLbl.TextColor = xui.Color_Black
			xLbl.TextSize = 14
			xLbl.SetTextAlignment("CENTER", "LEFT")
			p.AddView(xLbl, 0, 0, p.Width, RowHeight)
			
			Dim DataMap As Map = CreateMap("Desc": desc, "PlaceID": pId)
			clvSuggestions.Add(p, DataMap)
		Next
		
		SuggestionPanelHeight = Min(predictions.Size * RowHeight, 200dip)
		pnlSuggestions.BringToFront
		B4XPage_Resize(Root.Width, Root.Height)
	End If
End Sub

' --- API 2: PLACE DETAILS (CUSTOM PARSING) ---
Private Sub FetchPlaceDetails(PlaceID As String)
	ProgressDialogShow("Fetching Address Details...")
	Dim j As HttpJob : j.Initialize("PlaceDetails", Me)
	Dim url As String = "https://maps.googleapis.com/maps/api/place/details/json?place_id=" & PlaceID & "&fields=address_components&sessiontoken=1234567890&key=" & PLACES_API_KEY
	j.Download(url)
End Sub

Sub HandlePlaceDetails(Job As HttpJob)
	ProgressDialogHide
	Dim parser As JSONParser : parser.Initialize(Job.GetString)
	Dim rootMap As Map = parser.NextObject
	
	If rootMap.GetDefault("status", "") = "OK" Then
		Dim result As Map = rootMap.Get("result")
		Dim components As List = result.Get("address_components")
		
		Dim HouseNum As String = ""
		Dim Street As String = ""
		Dim City As String = ""
		Dim State As String = ""
		Dim Zip As String = ""
		
		' Extract Exact Components (Ignoring Country/USA)
		For Each comp As Map In components
			Dim types As List = comp.Get("types")
			Dim LName As String = comp.Get("long_name")
			Dim SName As String = comp.Get("short_name")
			
			If types.IndexOf("street_number") > -1 Then HouseNum = LName
			If types.IndexOf("route") > -1 Then Street = LName
			If types.IndexOf("locality") > -1 Then City = LName
			If types.IndexOf("administrative_area_level_1") > -1 Then State = SName ' (FL)
			If types.IndexOf("postal_code") > -1 Then Zip = LName
		Next
		
		' 1. Formulate Short Address for UI display: [House Num] [Street], [Zip]
		Dim ShortAddr As String = HouseNum & " " & Street
		If Zip <> "" Then ShortAddr = ShortAddr & ", " & Zip
		
		' 2. Formulate Full Address for Google: [House Num] [Street], [City] [State], [Zip]
		Dim FullAddr As String = HouseNum & " " & Street & ", " & City & " " & State & ", " & Zip
		
		' Clean up any double spaces if fields were missing
		ShortAddr = ShortAddr.Replace("  ", " ").Trim
		FullAddr = FullAddr.Replace("  ", " ").Replace(" ,", ",").Trim
		
		FullSelectedAddress = FullAddr
		SearchTimer.Enabled = False
		txtAddress.Text = ShortAddr
	End If
End Sub

' --- DUPLICATE CHECKER ---
Sub CheckDuplicates(QueryName As String)
	Log("Checking duplicates for: " & QueryName)
	FoundDuplicateName = ""
	DuplicateCheckStep = 0
	RunDuplicateCheckChain
End Sub

Sub RunDuplicateCheckChain
	Dim Query As String = ""
	If PendingClientMap.IsInitialized = False Then
		FinalizeSave
		Return
	End If

	Select DuplicateCheckStep
		Case 0 : Query = PendingClientMap.Get("Name")
		Case 1 : Query = PendingClientMap.Get("Phone")
		Case Else
			FinalizeSave
			Return
	End Select
	
	If Query.Length < 3 Then
		DuplicateCheckStep = DuplicateCheckStep + 1
		RunDuplicateCheckChain
		Return
	End If
	
	Dim j As HttpJob
	j.Initialize("CheckDuplicates", Me)
	Dim url As String = "https://people.googleapis.com/v1/people:searchContacts?query=" & Query.Replace(" ", "%20") & "&readMask=names,phoneNumbers"
	j.Download(url)
	j.GetRequest.SetHeader("Authorization", "Bearer " & B4XPages.MainPage.OAuth2.access_token)
End Sub

Sub HandleDuplicateCheck(Job As HttpJob)
	Dim dupParser As JSONParser
	Dim dupRoot As Map
	Dim dupResults As List
	Dim dupItem As Map
	Dim dupPerson As Map
	Dim dupNames As List
	Dim dupNameMap As Map
	
	dupParser.Initialize(Job.GetString)
	dupRoot = dupParser.NextObject
	
	If dupRoot.ContainsKey("results") Then
		dupResults = dupRoot.Get("results")
		If dupResults.Size > 0 Then
			dupItem = dupResults.Get(0)
			
			If dupItem.ContainsKey("person") Then
				dupPerson = dupItem.Get("person")
				
				If dupPerson.ContainsKey("names") Then
					dupNames = dupPerson.Get("names")
					
					If dupNames.Size > 0 Then
						dupNameMap = dupNames.Get(0)
						FoundDuplicateName = dupNameMap.GetDefault("displayName", "Unknown")
					End If
				End If
			End If
		End If
	End If
	
	If FoundDuplicateName <> "" Then
		ProgressDialogHide
		Dim Answ As Object = xui.Msgbox2Async("A contact named '" & FoundDuplicateName & "' already exists. Create anyway?", "Duplicate Warning", "Yes", "Cancel", "", Null)
		Wait For (Answ) Msgbox_Result (Result As Int)
		If Result = xui.DialogResponse_Positive Then
			ProgressDialogShow("Saving...")
			FinalizeSave
		Else
			IsSaving = False
		End If
	Else
		DuplicateCheckStep = DuplicateCheckStep + 1
		RunDuplicateCheckChain
	End If
End Sub

Sub FinalizeSave
	ProgressDialogShow("Saving to Google Contacts...")
	CallSub2(B4XPages.MainPage, "CreateNewContact", PendingClientMap)
	ProceedAfterSave
End Sub

' =========================================================
' ===           THE POST-SAVE WORKFLOW LOOP             ===
' =========================================================
Sub ProceedAfterSave
	ProgressDialogHide
	IsSaving = False

	If IsScrapeMode Then
		' STEP 1: PROMPT FOR FILE CLEANUP
		Wait For (xui.Msgbox2Async("Client Saved! What should we do with the raw voicemail files?", "Voicemail Cleanup", "Archive", "Keep", "Delete", Null)) Msgbox_Result (FileRes As Int)
		If FileRes = xui.DialogResponse_Positive Then ' Archive
			CallSub2(B4XPages.MainPage, "ArchiveVoicemail", BufferedScrapeData)
		Else If FileRes = xui.DialogResponse_Negative Then ' Delete
			CallSub2(B4XPages.MainPage, "DeleteVoicemail", BufferedScrapeData)
		End If
		
		' STEP 2: PROMPT FOR APPOINTMENT
		Wait For (xui.Msgbox2Async("Book an appointment for this client now?", "Next Step", "Yes", "No", "", Null)) Msgbox_Result (ApptRes As Int)
		If ApptRes = xui.DialogResponse_Positive Then
			PendingClientMap.Put("IsScrapeWorkflow", True)
			B4XPages.ShowPage("AppointmentPage")
			CallSub2(B4XPages.MainPage.appointmentScreen, "LoadClientForAppt", PendingClientMap)
		Else
			B4XPages.ShowPage("MainPage")
			CallSub(B4XPages.MainPage, "ProcessNextScrapeItem")
		End If
		
		ClearForm
	Else
		xui.MsgboxAsync("Client Saved Successfully!", "Success")
		B4XPages.ShowPage("MainPage")
		ClearForm
	End If
End Sub
'//<END-CreateClientPage-S03>