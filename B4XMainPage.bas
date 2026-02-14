B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
'//<START-B4XMainPage-S01>
'Sub Routines in S01: 5
'Sub Class_Globals
'Public Sub Initialize
'Private Sub B4XPage_Created (Root1 As B4XView)
'Private Sub ResumeAppStartup
'Private Sub B4XPage_Resize (Width As Int, Height As Int)
'Variables in S01: 90
'Root (B4XView)
'xui (XUI)
'appSettings (Map)
'HasRunOnce (Boolean)
'PendingSlot (Map)
'RecentlyUpdated (Map)
'Panel1 (B4XView)
'lblStatus (B4XView)
'lblDayDate (B4XView)
'SensorShake (PhoneSensors)
'LastShakeTime (Long)
'IsTorchOn (Boolean)
'btnSearch (B4XView)
'btnCreateClient (B4XView)
'btnScrape (B4XView)
'btnViewApt (B4XView)
'btnCloseout (B4XView)
'btnMakeApt (B4XView)
'btnLogin (B4XView)
'pnlStats (B4XView)
'lblTotalAptsGod (B4XView)
'lblTotalAptsGoddess (Label)
'lblGodCollected (Label)
'lblGoddessCollected (Label)
'lblTotalCollected (B4XView)
'lblAppsGodNum (B4XView)
'lblAppsGoddessNum (Label)
'lblGodCollectedNum (Label)
'lblGoddessCollectedNum (B4XView)
'lblTotalCollectedNum (B4XView)
'spnChose (Spinner)
'lblSelectGod (B4XView)
'lstTodayApts (CustomListView)
'StatusRefreshTimer (Timer)
'OAuth2 (GoogleOAuth2)
'const (Implicit)
'const (Implicit)
'cc (ContentChooser)
'searchScreen (SearchPage)
'appointmentScreen (AppointmentPage)
'ViewScheduleScreen (ViewSchedulePage)
'CloseOutScreen (CloseOut)
'clientCreator (CreateClientPage)
'TempProfile (Map)
'LedgerQueue (List)
'CurrentLedgerID (String)
'CurrentSearchQuery (String)
'IssuesHistory (List)
'gps (GPS)
'rp (RuntimePermissions)
'CurrentLocation (Location)
'GeocodedLocations (Map)
'FailedGeocodes (Map)
'ActiveAppointmentID (String)
'ActiveArrivalTime (Long)
'ActiveJobMap (Map)
'JobTimer (Timer)
'const (Implicit)
'const (Implicit)
'const (Implicit)
'FuzzyCandidates (Map)
'ScrapeMap (Map)
'ScrapeQueue (List)
'VMPlayer (MediaPlayer)
'ScrapedApptIssue (String)
'ime (IME)
'LastDashboardItems (List)
'const (Implicit)
'ExpensePanel (B4XView)
'ExpensePhotoPath (String)
'ExtractedDate (String)
'ExtractedTime (String)
'ExpenseDateLabel (Label)
'ExpenseCategorySpinner (Spinner)
'ExpenseAmount (EditText)
'ExpenseNotes (EditText)
'fontLabels (Typeface)
'fontButtons (Typeface)
'fontStats (Typeface)
'fontCardText (Typeface)
'HolidayBanner (Map)
'ArrivalThresholdMeters (Float)
'SP (SoundPool)
'SoundIDs (List)
'CurrentUser (String)
'FoldDetector (JavaObject)
'LastFoldState (String)
'LastOrientation (String)
'info (B4XPageInfo)
'TopPageId (String)
'Calls in S01: 7
'AdjustLayout
'AddPage
'Initialize
'Add
'B4XPage_Resize
'LoadLayout
'CallSub2


Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI

	Private appSettings As Map

	' --- SPLASH SCREEN REMOVED FOR STABILITY ---
	Private HasRunOnce As Boolean = False

	' --- LOGIC FLOW FIX ---
	Public PendingSlot As Map
	Public RecentlyUpdated As Map

	' --- UI CONTROLS ---
	Private Panel1 As B4XView
	Private lblStatus As B4XView
	Private lblDayDate As B4XView

	' --- GESTURE ENGINE (FLASHLIGHT ONLY) ---
	Private SensorShake As PhoneSensors
	Private LastShakeTime As Long
	Private IsTorchOn As Boolean = False
	
	' Navigation Buttons
	Private btnSearch As B4XView
	Private btnCreateClient As B4XView
	Private btnScrape As B4XView
	Private btnViewApt As B4XView
	Private btnCloseout As B4XView
	Private btnMakeApt As B4XView
	Private btnLogin As B4XView

	' Stats
	Private pnlStats As B4XView
	Private lblTotalAptsGod As B4XView
	Private lblTotalAptsGoddess As Label
	Private lblGodCollected As Label
	Private lblGoddessCollected As Label
	Private lblTotalCollected As B4XView

	' Numeric Labels
	Private lblAppsGodNum As B4XView
	Private lblAppsGoddessNum As Label
	Private lblGodCollectedNum As Label
	Private lblGoddessCollectedNum As B4XView
	Private lblTotalCollectedNum As B4XView

	' Dashboard
	Private spnChose As Spinner
	Private lblSelectGod As B4XView
	Private lstTodayApts As CustomListView
	Private StatusRefreshTimer As Timer

	' --- SYSTEM ---
	Public OAuth2 As GoogleOAuth2
	Private const CLIENT_ID As String = "1077575612876-0lgv0dhcu1956b75n80gfs9t0djn2a5c.apps.googleusercontent.com"
	Private const SOURCE_ID As String = "1-8id4XZafXRqRyE1ryhqhDy5oewghrDY"
	
	' --- FILE PICKER (NEW) ---
	Private cc As ContentChooser

	' 1. Screens
	Public searchScreen As SearchPage
	Public appointmentScreen As AppointmentPage
	Public ViewScheduleScreen As ViewSchedulePage
	Public CloseOutScreen As CloseOut
	Public clientCreator As CreateClientPage

	' 2. Data
	Private TempProfile As Map
	Private LedgerQueue As List
	Private CurrentLedgerID As String
	Private CurrentSearchQuery As String
	Private IssuesHistory As List

	' 3. GPS
	Private gps As GPS
	Private rp As RuntimePermissions
	Private CurrentLocation As Location
	Private GeocodedLocations As Map
	Private FailedGeocodes As Map ' Prevents Geocode API Spam

	' 4. Active Job & Timer
	Private ActiveAppointmentID As String = ""
	Private ActiveArrivalTime As Long = 0
	Private ActiveJobMap As Map
	Private JobTimer As Timer

	' 5. UI Colors
	Private const COLOR_PENDING As Int = 0xFFFFEBEE
	Private const COLOR_ACTIVE As Int = 0xFFFFF9C4
	Private const COLOR_CLOSED As Int = 0xFFDCEDC8

	' 6. Fuzzy Logic
	Private FuzzyCandidates As Map

	' 7. Voicemail Scraper
	Private ScrapeMap As Map
	Private ScrapeQueue As List
	Public VMPlayer As MediaPlayer ' Plays the .amr files
	
	' Holds the issue for the Booking page
	Public ScrapedApptIssue As String

	Private ime As IME
	Private LastDashboardItems As List
	Private const LAYOUT_THRESHOLD As Int = 550dip

	' 8. Expenses
	Private ExpensePanel As B4XView
	Private ExpensePhotoPath As String
	Private ExtractedDate As String
	Private ExtractedTime As String

	Private ExpenseDateLabel As Label
	Private ExpenseCategorySpinner As Spinner
	Private ExpenseAmount As EditText
	Private ExpenseNotes As EditText

	' 9. FONTS
	Private fontLabels As Typeface = Typeface.DEFAULT
	Private fontButtons As Typeface = Typeface.DEFAULT
	Private fontStats As Typeface = Typeface.DEFAULT
	Private fontCardText As Typeface = Typeface.DEFAULT ' [NEW] Font for Dashboard Cards

	' 10. HOLIDAY BANNER
	Private HolidayBanner As Map

	' 11. GEOFENCE THRESHOLD
	Private ArrivalThresholdMeters As Float = 92  ' ~300 feet
	
	' --- AUDIO ENGINE (SOUND EFFECTS) ---
	Private SP As SoundPool
	Private SoundIDs As List
	
	' --- IDENTITY (FIXED) ---
	Public CurrentUser As String = "Mike"

	' --- FOLDABLE ENGINE (JETPACK) ---
	Private FoldDetector As JavaObject
	Public LastFoldState As String = "FLAT" ' FLAT, HALF_OPENED
	Public LastOrientation As String = "NONE" ' VERTICAL, HORIZONTAL
End Sub

Public Sub Initialize
	Log(">>> [B4XMainPage] Initialize called")
	OAuth2.Initialize(Me, "OAuth2", CLIENT_ID, "https://www.googleapis.com/auth/spreadsheets https://www.googleapis.com/auth/calendar https://www.googleapis.com/auth/contacts https://www.googleapis.com/auth/drive https://www.googleapis.com/auth/drive.file")
	Log(">>> [OAuth] OAuth2.Initialize completed")
	ime.Initialize("ime")
	ime.AddHeightChangedEvent
	gps.Initialize("GPS")
	GeocodedLocations.Initialize
	FailedGeocodes.Initialize
	FuzzyCandidates.Initialize
	ActiveJobMap.Initialize
	RecentlyUpdated.Initialize
	LastDashboardItems.Initialize
	ScrapeMap.Initialize
	ScrapeQueue.Initialize
	VMPlayer.Initialize
	PendingSlot.Initialize
	HolidayBanner.Initialize
	
	' Init Content Chooser (File Picker)
	cc.Initialize("cc")
	
	' Init SoundPool (Allows 2 simultaneous sounds max)
	SP.Initialize(2)
	SoundIDs.Initialize
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	
	' [FIXED] Block splash screen from re-running if app was just put in background
	If HasRunOnce = True Then
		ResumeAppStartup
		Return
	End If
	
	HasRunOnce = True ' Mark that the app has started in this session
	
	' --- BYPASS SPLASH FOR STABILITY ---
	Log(">>> [SPLASH] Skipped for Stability.")
	ResumeAppStartup
End Sub

' --- 3. RESUME NORMAL STARTUP ---
Private Sub ResumeAppStartup
	Root.LoadLayout("MainPage")

	JobTimer.Initialize("JobTimer", 1000)
	StatusRefreshTimer.Initialize("StatusRefreshTimer", 1000)
	StatusRefreshTimer.Enabled = True

	' FORCE UI COLORS
	lblStatus.Text = "Status: Initializing..."
	Root.Color = xui.Color_White
	If Panel1.IsInitialized Then Panel1.Color = xui.Color_Transparent
	If pnlStats.IsInitialized Then pnlStats.Color = xui.Color_White

	' POPULATE SPINNER
	If spnChose.IsInitialized Then
		spnChose.Clear
		spnChose.Add("Mike")
		spnChose.Add("Erin" )
	End If

	' Initialize Settings & Identity
	CheckSettings

	' SYSTEM PERMISSIONS & FONTS
	CheckAndRequestSystemPermissions

	' SCREENS - STANDARD INITIALIZATION
	If searchScreen.IsInitialized = False Then
		searchScreen.Initialize
		B4XPages.AddPage("SearchPage", searchScreen)
	End If
	If appointmentScreen.IsInitialized = False Then
		appointmentScreen.Initialize
		B4XPages.AddPage("AppointmentPage", appointmentScreen)
	End If
	If ViewScheduleScreen.IsInitialized = False Then
		ViewScheduleScreen.Initialize
		B4XPages.AddPage("ViewSchedulePage", ViewScheduleScreen)
	End If
	If CloseOutScreen.IsInitialized = False Then
		CloseOutScreen.Initialize
		B4XPages.AddPage("CloseOut", CloseOutScreen)
	End If
	If clientCreator.IsInitialized = False Then
		clientCreator.Initialize
		B4XPages.AddPage("CreateClientPage", clientCreator)
	End If
	' --- INIT SENSOR ---
	SensorShake.Initialize(SensorShake.TYPE_ACCELEROMETER)
	
	' [CRITICAL FIX] LOAD FONTS NOW (Bypassing Permission Wait)
	SetupFontSystem
	
	' [CRITICAL FIX] LOAD SOUNDS ASYNC NOW
	LoadSounds

	' Run the Initial Status Logic
	SetInitialStatus
	DetectUserIdentity

	' OAUTH INITIALIZATION & TOKEN REQUEST
	lblStatus.Text = "Status: Connecting..."
	
	If OAuth2.IsInitialized = False Then
		Log(">>> [OAuth] OAuth2 was NOT initialized. Initializing now...")
		OAuth2.Initialize(Me, "OAuth2", CLIENT_ID, "https://www.googleapis.com/auth/spreadsheets https://www.googleapis.com/auth/calendar https://www.googleapis.com/auth/contacts https://www.googleapis.com/auth/drive https://www.googleapis.com/auth/drive.file")
	Else
		Log(">>> [OAuth] OAuth2 is already initialized.")
	End If
	
	Log(">>> [OAuth] Calling GetAccessToken...")
	OAuth2.GetAccessToken
	
	' Trigger Initial Layout
	B4XPage_Resize(Root.Width, Root.Height)

	' --- [CRITICAL FIX] START FOLD DETECTOR ---
	' This ensures the app listens for Open/Close events
	StartFoldListener
End Sub

Private Sub B4XPage_Resize (Width As Int, Height As Int)
	' [CRITICAL FIX] Null-Safety Check for Page ID
	If Root.IsInitialized = False Then Return
	If Width < 50 Or Height < 50 Then Return
	
	' Bypass logic if Pages Manager is not ready to return a Top Page
	Dim info As B4XPageInfo = B4XPages.GetManager.GetTopPage
	If info = Null Or info.Id = "" Then
		Log(">>> [NATIVE-RESIZE] Skipping: Top Page not ready.")
		Return
	End If

	Log("==================================================")
	Log(">>> [NATIVE-RESIZE] SCREEN CHANGE: " & Width & "x" & Height & " | State: " & LastFoldState)

	Dim TopPageId As String = info.Id
	Log(">>> [NATIVE-RESIZE] Active Page Detected: [" & TopPageId & "]")

	Select TopPageId.ToLowerCase
		Case "mainpage"
			Log(">>> [NATIVE-RESIZE] Executing AdjustLayout for buttons and headers...")
			AdjustLayout(Width, Height)
			
		Case "appointmentpage"
			CallSub2(appointmentScreen, "RedrawUI", Width)
			
		Case "createclientpage"
			CallSub2(clientCreator, "RedrawUI", Width)
			
		Case "searchpage"
			CallSub2(searchScreen, "RedrawUI", Width)
			
		Case "viewschedulepage"
			CallSub2(ViewScheduleScreen, "RedrawUI", Width)
			
		Case "closeout"
			CallSub2(CloseOutScreen, "RedrawUI", Width)
			
		Case Else
			Log(">>> [NATIVE-RESIZE] WARNING: Unknown Page ID: " & TopPageId)
	End Select
	Log("==================================================")
End Sub

'Total subroutines prior to edit: 5
'Total Subroutines added or subtracted this edit: +0
'Total Subroutines after this edit: 5
'Discrepancies: 0
'Total source code lines prior to edit: 204
'Total source code lines added/subtracted this edit: +2
'Total source code lines after the edit: 206
'Discrepancies: 0
'//<END-B4XMainPage-S01>




'//<START-B4XMainPage-S02>
'Sub Routines in S02: 19
'Private Sub LoadFontFromFile(DirPath As String, FileName As String) As Typeface
'Private Sub SetupFontSystem
'Private Sub ApplyFontsToUI
'Private Sub DetectUserIdentity
'Private Sub ApplyListBackground(User As String)
'Private Sub SetInitialStatus
'Public Sub CheckOAuth(Intent As Intent)
'Sub OAuth2_AccessTokenAvailable(Success As Boolean, Token As String)
'Private Sub CheckHolidayTheme
'Private Sub ThemeHoliday(Text As String, BgColor As Int, TxtColor As Int)
'Sub StatusRefreshTimer_Tick
'Sub CheckSettings
'Private Sub GetCurrentUser As String
'Private Sub CreateHolidayBannerPanel(ParentWidth As Int) As B4XView
'Public Sub UpdateStatsPanel(MikeCollected As Double, ErinCollected As Double)
'Public Sub RefreshStats
'Private Sub B4XPage_Disappear
'Public Sub StartFoldListener
'Public Sub StopFoldListener
'Variables in S02: 60
'jo (JavaObject)
'Path (String)
'TF (Object)
'AltName (String)
'RootDir (String)
'FontsDir (String)
'PoolDir (String)
'PageFonts (Implicit)
'f (String)
'buttons (Implicit)
'btn (Button)
'statLabels (Implicit)
'W (Int)
'H (Int)
'DetectedUser (String)
'IsErin (Boolean)
'IsMikeOpen (Boolean)
'IsMikeClosed (Boolean)
'pnlList (B4XView)
'v0 (B4XView)
'bgFile (String)
'bmp (Bitmap)
'ivBG (ImageView)
'DeviceWidth (Int)
'DeviceHeight (Int)
'IsSmallScreen (Boolean)
'HeaderBottom (Int)
'ListTop (Int)
'PanelW (Int)
'PanelH (Int)
'OrigW (Float)
'OrigH (Float)
'ScaledW (Int)
'ScaledH (Int)
'TopY (Int)
'Month (Int)
'Day (Int)
'dow (Int)
'user (String)
'BannerHeight (Int)
'pBanner (B4XView)
'lblBanner (Label)
'xBanner (B4XView)
'Total (Double)
'MikeTotal (Double)
'ErinTotal (Double)
'joMe (JavaObject)
'myBA (Object)
'joy (JavaObject)
'joy (JavaObject)
'static (Implicit)
'WindowInfoTrackerCallbackAdapter (Implicit)
'Consumer (Implicit)
'BA (Implicit)
'class (Implicit)
'final (Implicit)
'void (Implicit)
'void (Implicit)
'void (Implicit)
'void (Implicit)
'Calls in S02: 47
'SetLayoutAnimated
'NumberFormat2
'RunMethod
'Date
'AddView
'stop
'getContext
'WriteMap
'WindowInfoTrackerCallbackAdapter
'getDisplayFeatures
'UpdateStatsPanel
'ThemeHoliday
'Exists
'InitializeStatic
'GetItem
'getOrientation
'toString
'Array
'Initialize
'LoadFontFromFile
'LoadFromAssets
'ReadMap
'CallFromResume
'Copy
'Get
'InitializeNewInstance
'As
'if
'catch
'addWindowLayoutInfoListener
'removeWindowLayoutInfoListener
'MainThreadExecutor
'ContainsKey
'while
'getOrCreate
'getBaseContext
'for
'Max
'isSeparating
'post
'MakeDir
'printStackTrace
'raiseEventFromUI
'ApplyListBackground
'ToastMessageShow
'Put
'getState


Private Sub LoadFontFromFile(DirPath As String, FileName As String) As Typeface
	' [LOGIC] Priority 1: External Storage (Geek God CRM/fonts)
	If File.Exists(DirPath, FileName) Then
		Try
			Dim jo As JavaObject
			jo.InitializeStatic("android.graphics.Typeface")
			Dim Path As String = File.Combine(DirPath, FileName)
			Dim TF As Object = jo.RunMethod("createFromFile", Array(Path))
			If TF <> Null Then 
				Log(">>> [FONTS] Loaded External: " & FileName)
				Return TF
			End If
		Catch
			Log(">>> [FONTS] Error loading external: " & LastException)
		End Try
	End If

	' [LOGIC] Priority 2: Assets (Fallback)
	If File.Exists(File.DirAssets, FileName) Then
		Log(">>> [FONTS] Loaded Asset: " & FileName)
		Return Typeface.LoadFromAssets(FileName)
	End If
	
	' [LOGIC] Smart Fallback for Spaces (e.g. "mainpage - labels" -> "mainpagelabels")
	Dim AltName As String = FileName.Replace(" ", "").Replace("-", "")
	If File.Exists(File.DirAssets, AltName) Then
		Log(">>> [FONTS] Found Alternate Asset: " & AltName)
		Return Typeface.LoadFromAssets(AltName)
	End If

	' [LOGIC] Priority 3: System Default
	Log("!!! [FONTS] MISSING: " & FileName & " - Using Default")
	Return Typeface.DEFAULT
End Sub

Private Sub SetupFontSystem
	Dim RootDir As String = File.DirRootExternal & "/Geek God CRM"
	' [FIXED] Case sensitivity matched to instruction: "fonts" and "custom font pool"
	Dim FontsDir As String = RootDir & "/fonts"
	Dim PoolDir As String = RootDir & "/custom font pool"
	
	Log(">>> [FONTS] Starting Font Deployment...")

	' 1. Ensure Directories Exist
	If File.Exists(RootDir, "") = False Then File.MakeDir(File.DirRootExternal, "Geek God CRM")
	If File.Exists(FontsDir, "") = False Then File.MakeDir(RootDir, "fonts")
	If File.Exists(PoolDir, "") = False Then File.MakeDir(RootDir, "custom font pool")
	
	' 2. Deploy Page Fonts (Copy from Assets to Storage if missing)
	Dim PageFonts() As String = Array As String("mainpage - labels.ttf", "mainpage - buttons.ttf", "mainpage - stats labels.ttf", "mainpage - cardtext.ttf")
	For Each f As String In PageFonts
		If File.Exists(File.DirAssets, f) Then
			' We check if it exists in target. If not, we copy.
			If File.Exists(FontsDir, f) = False Then
				Try
					File.Copy(File.DirAssets, f, FontsDir, f)
					Log(">>> [FONTS] Deployed: " & f)
				Catch
					Log(">>> [FONTS] Error Deploying " & f & ": " & LastException)
				End Try
			End If
		End If
	Next
	
	' 3. Deploy Numbered Fonts (supports both 1.ttf and 01.ttf style names)
	DeploySequentialPoolFonts(PoolDir)

	' 4. Load Fonts into Variables (Reading from the Storage Folder we just prep'd)
	fontLabels = LoadFontFromFile(FontsDir, "mainpage - labels.ttf")
	fontButtons = LoadFontFromFile(FontsDir, "mainpage - buttons.ttf")
	fontStats = LoadFontFromFile(FontsDir, "mainpage - stats labels.ttf")
	fontCardText = LoadFontFromFile(FontsDir, "mainpage - cardtext.ttf")

	ApplyFontsToUI
End Sub

Private Sub DeploySequentialPoolFonts(PoolDir As String)
	Try
		Dim Copied As Int = 0
		' Project currently ships a sequential pool of 33 fonts.
		For i = 1 To 33
			Dim fPadded As String = NumberFormat(i, 2, 0) & ".ttf"
			Dim fPlain As String = i & ".ttf"
			Dim SourceName As String = ""
			
			If File.Exists(File.DirAssets, fPadded) Then
				SourceName = fPadded
			Else If File.Exists(File.DirAssets, fPlain) Then
				SourceName = fPlain
			End If
			
			If SourceName <> "" And File.Exists(PoolDir, SourceName) = False Then
				Try
					File.Copy(File.DirAssets, SourceName, PoolDir, SourceName)
					Copied = Copied + 1
					Log(">>> [FONTS] Deployed Pool Font: " & SourceName)
				Catch
					Log(">>> [FONTS] Error Deploying Pool " & SourceName & ": " & LastException)
				End Try
			End If
		Next
		Log(">>> [FONTS] Pool deployment complete. New files copied: " & Copied)
	Catch
		Log(">>> [FONTS] Error deploying sequential pool fonts: " & LastException)
	End Try
End Sub

Private Sub ApplyFontsToUI
	' [FIXED] Self-Healing: If fonts aren't loaded yet, force load them.
	If fontLabels = Null Or fontLabels = Typeface.DEFAULT Then
		SetupFontSystem
		Return
	End If

	Try
		Dim buttons() As B4XView = Array As B4XView(btnSearch, btnCreateClient, btnScrape, btnViewApt, btnCloseout, btnMakeApt, btnLogin)
		For Each v As B4XView In buttons
			If v.IsInitialized Then
				Dim btn As Button = v
				btn.Typeface = fontButtons
				btn.TextSize = 15
				btn.Invalidate
			End If
		Next

		If lblStatus.IsInitialized Then
			lblStatus.As(Label).Typeface = fontLabels
			lblStatus.TextSize = 14
		End If
		If lblDayDate.IsInitialized Then
			lblDayDate.As(Label).Typeface = fontLabels
			lblDayDate.TextSize = 14
		End If
		If lblSelectGod.IsInitialized Then
			lblSelectGod.As(Label).Typeface = fontLabels
			lblSelectGod.TextSize = 16
		End If

		If pnlStats.IsInitialized Then
			Dim statLabels() As B4XView = Array As B4XView(lblTotalAptsGod, lblTotalAptsGoddess, lblGodCollected, lblGoddessCollected, _
				lblTotalCollected, lblAppsGodNum, lblAppsGoddessNum, lblGodCollectedNum, lblGoddessCollectedNum, lblTotalCollectedNum)

			For Each sv As B4XView In statLabels
				If sv.IsInitialized Then sv.As(Label).Typeface = fontStats
			Next
		End If
		
		Log(">>> [FONTS] ApplyFontsToUI completed.")
	Catch
		Log("Error applying fonts: " & LastException)
	End Try
End Sub

Private Sub DetectUserIdentity
	Dim W As Int = GetDeviceLayoutValues.Width
	Dim H As Int = GetDeviceLayoutValues.Height
	Dim DetectedUser As String = ""

	Log(">>> [Identity Engine] Raw Dims: " & W & "x" & H)

	Dim IsErin As Boolean = (Abs(W - 720) < 50 And Abs(H - 1420) < 100)
	Dim IsMikeOpen As Boolean = (Abs(W - 1080) < 50 And Abs(H - 2382) < 100)
	Dim IsMikeClosed As Boolean = (Abs(W - 1856) < 50 And Abs(H - 1998) < 100)

	If IsErin Then
		DetectedUser = "Erin"
	Else If IsMikeOpen Or IsMikeClosed Then
		DetectedUser = "Mike"
	Else
		If W > 1300 Then DetectedUser = "Mike" Else DetectedUser = "Erin"
	End If

	Log(">>> [Identity Engine] User: " & DetectedUser)
	
	' Sync with Global Variable (Added to S01)
	CurrentUser = DetectedUser

	If appSettings.IsInitialized Then
		appSettings.Put("CurrentUser", DetectedUser)
		File.WriteMap(File.DirInternal, "settings.map", appSettings)
	End If

	If spnChose.IsInitialized Then
		If DetectedUser = "Mike" Then spnChose.SelectedIndex = 0 Else spnChose.SelectedIndex = 1
	End If

	ApplyListBackground(DetectedUser)
End Sub

Private Sub ApplyListBackground(User As String)
	If lstTodayApts.IsInitialized Then
		Try
			Dim pnlList As B4XView = lstTodayApts.AsView

			If pnlList.NumberOfViews > 0 Then
				Dim v0 As B4XView = pnlList.GetView(0)
				If v0 Is ImageView Then v0.RemoveViewFromParent
			End If

			pnlList.Color = xui.Color_White

			Dim bgFile As String = ""
			If User = "Erin" Then
				bgFile = "erin_bg.png"
			Else
				bgFile = "mike_bg.png"
			End If

			If File.Exists(File.DirAssets, bgFile) Then
				Dim bmp As Bitmap = LoadBitmap(File.DirAssets, bgFile)
				Dim ivBG As ImageView
				ivBG.Initialize("")
				ivBG.Bitmap = bmp

				Dim DeviceWidth As Int = GetDeviceLayoutValues.Width
				Dim DeviceHeight As Int = GetDeviceLayoutValues.Height
				Dim IsSmallScreen As Boolean = (DeviceWidth < LAYOUT_THRESHOLD)
				
				Dim HeaderBottom As Int = spnChose.Top + spnChose.Height
				Dim ListTop As Int
				Dim PanelW As Int
				Dim PanelH As Int
				
				If IsSmallScreen Then
					ListTop = pnlStats.Top + pnlStats.Height
					PanelW = DeviceWidth
					PanelH = Max(0, DeviceHeight - ListTop)
				Else
					ListTop = HeaderBottom + 5dip
					PanelW = DeviceWidth
					PanelH = Max(0, DeviceHeight - ListTop)
				End If

				If IsSmallScreen Then
					Dim OrigW As Float = bmp.Width
					Dim OrigH As Float = bmp.Height
					Dim ScaledW As Int = PanelW
					Dim ScaledH As Int = (OrigH * PanelW) / OrigW
					Dim TopY As Int = PanelH - ScaledH
					If TopY < 0 Then TopY = 0
					ivBG.Gravity = Gravity.FILL
					pnlList.AddView(ivBG, 0, TopY, ScaledW, ScaledH)
				Else
					ivBG.Gravity = Gravity.FILL
					pnlList.AddView(ivBG, 0, 0, PanelW, PanelH)
				End If

				ivBG.SendToBack
				ivBG.As(B4XView).Alpha = 0.2
			End If

		Catch
			Log("Background Error: " & LastException)
		End Try
	End If
End Sub

Private Sub SetInitialStatus
	DateTime.DateFormat = "EEE MM/dd/yyyy"
	lblDayDate.Text = DateTime.Date(DateTime.Now)
	lblDayDate.Color = xui.Color_Transparent
	lblDayDate.TextColor = xui.Color_Black
	
	CheckHolidayTheme

	lblStatus.Text = "Status: Disconnected"
	lblStatus.Color = xui.Color_White
	lblStatus.TextColor = 0xFFD32F2F

	lblAppsGodNum.Text = "0"
	lblAppsGoddessNum.Text = "0"
	lblGodCollectedNum.Text = "$0.00"
	lblGoddessCollectedNum.Text = "$0.00"
	lblTotalCollectedNum.Text = "$0.00"

	lblTotalAptsGod.Text = "Mike's Apts:"
	lblTotalAptsGoddess.Text = "Erin's Apts:"
	lblGodCollected.Text = "Mike Collected:"
	lblGoddessCollected.Text = "Erin Collected:"
	lblTotalCollected.Text = "Total Collected:"

	btnCloseout.Color = xui.Color_Red
	btnCloseout.TextColor = xui.Color_White
	btnCloseout.Text = "No Apt Started"
	
	' [FIXED] ENABLED must be True for LongClick to register!
	btnCloseout.Enabled = True 
End Sub

Public Sub CheckOAuth(Intent As Intent)
	If OAuth2.IsInitialized Then
		OAuth2.CallFromResume(Intent)
	End If
End Sub

Sub OAuth2_AccessTokenAvailable(Success As Boolean, Token As String)
	If Success Then
		Log("Authorization Successful")
		lblStatus.Text = "Status: Connected"
		lblStatus.Color = xui.Color_White
		lblStatus.TextColor = xui.Color_Black
		btnLogin.Visible = False ' Hide login on success
		ToastMessageShow("Connected to Google", False)
		CheckContactGroups
		RefreshDashboard
	Else
		Log("Authorization Failed")
		lblStatus.Text = "Status: Auth Failed"
		lblStatus.TextColor = 0xFFD32F2F
		ToastMessageShow("Google Login Failed", True)
		
		' [FIXED] Force Login Button Visibility
		btnLogin.Visible = True
		btnLogin.BringToFront
	End If
End Sub

Private Sub CheckHolidayTheme
	If HolidayBanner.IsInitialized = False Then HolidayBanner.Initialize
	HolidayBanner.Clear
	
	Dim Month As Int = DateTime.GetMonth(DateTime.Now)
	Dim Day As Int = DateTime.GetDayOfMonth(DateTime.Now)
	Dim dow As Int = DateTime.GetDayOfWeek(DateTime.Now)
	
	lblDayDate.Color = xui.Color_Transparent
	lblDayDate.TextColor = xui.Color_Black

	If Month = 11 And Day = 4 Then
		ThemeHoliday("🎂 Happy Birthday Erin! 🎂", 0xFFFFC107, xui.Color_Black)
		Return
	End If
	If Month = 4 And Day = 21 Then
		ThemeHoliday("🎂 Happy Birthday Mike! 🎂", 0xFFFFC107, xui.Color_Black)
		Return
	End If
	If Month = 12 And Day = 28 Then
		ThemeHoliday("🎂 Happy Birthday Willow! 🎂", 0xFFFFC107, xui.Color_Black)
		Return
	End If
	If Month = 2 And Day = 25 Then
		ThemeHoliday("🎂 Happy Birthday Vivian! 🎂", 0xFFFFC107, xui.Color_Black)
		Return
	End If

	If Month = 1 And Day = 1 Then ThemeHoliday("🎉 New Year's Day 🎉", 0xFF1976D2, xui.Color_White)
	If Month = 1 And dow = 2 And Day >= 15 And Day <= 21 Then ThemeHoliday("Martin Luther King Jr. Day", 0xFF000000, xui.Color_White)
	If Month = 2 And Day = 14 Then ThemeHoliday("❤️ Valentine's Day ❤️", 0xFFF8BBD0, 0xFF880E4F)
	If Month = 2 And dow = 2 And Day >= 15 And Day <= 21 Then ThemeHoliday("🇺🇸 Presidents' Day 🇺🇸", 0xFF1976D2, xui.Color_White)
	If Month = 3 And Day = 17 Then ThemeHoliday("☘️ St. Patrick's Day ☘️", 0xFF388E3C, xui.Color_White)
	If Month = 4 And Day < 15 Then ThemeHoliday("🥚 Easter Season 🥚", 0xFFE1BEE7, xui.Color_Black)
	If Month = 5 And dow = 1 And Day >= 8 And Day <= 14 Then ThemeHoliday("💐 Mother's Day 💐", 0xFFF48FB1, xui.Color_White)
	If Month = 5 And dow = 2 And Day >= 25 Then ThemeHoliday("🇺🇸 Memorial Day 🇺🇸", 0xFF283593, xui.Color_White)
	If Month = 6 And Day = 19 Then ThemeHoliday("Juneteenth", 0xFF000000, 0xFFFF0000)
	If Month = 6 And dow = 1 And Day >= 15 And Day <= 21 Then ThemeHoliday("👔 Father's Day 👔", 0xFF424242, xui.Color_White)
	If Month = 7 And Day = 4 Then ThemeHoliday("🎆 Independence Day 🎆", 0xFFD32F2F, xui.Color_White)
	If Month = 9 And dow = 2 And Day <= 7 Then ThemeHoliday("Labor Day", 0xFF5D4037, xui.Color_White)
	If Month = 10 And Day = 31 Then ThemeHoliday("🎃 Halloween 🎃", 0xFFFF9800, xui.Color_Black)
	If Month = 11 And Day = 11 Then ThemeHoliday("🇺🇸 Veterans Day 🇺🇸", 0xFF283593, xui.Color_White)
	If Month = 11 And dow = 5 And Day >= 22 And Day <= 28 Then ThemeHoliday("🦃 Thanksgiving 🦃", 0xFF795548, xui.Color_White)
	If Month = 12 And Day >= 15 Then ThemeHoliday("🎄 Merry Christmas 🎄", 0xFFD32F2F, xui.Color_White)
End Sub

Private Sub ThemeHoliday(Text As String, BgColor As Int, TxtColor As Int)
	HolidayBanner.Put("Text", Text)
	HolidayBanner.Put("BgColor", BgColor)
	HolidayBanner.Put("TxtColor", TxtColor)
End Sub

Sub StatusRefreshTimer_Tick
	lblStatus.As(View).Invalidate
End Sub

Sub CheckSettings
	If File.Exists(File.DirInternal, "settings.map") Then
		appSettings = File.ReadMap(File.DirInternal, "settings.map")
		Dim user As String = appSettings.GetDefault("CurrentUser", "")
		If user = "" Or user = "null" Then
			ShowUserSelection
		Else
			' [FIXED] Sync variable from settings
			CurrentUser = user
		End If
	Else
		appSettings.Initialize
		ShowUserSelection
	End If
End Sub

Private Sub GetCurrentUser As String
	If spnChose.IsInitialized And spnChose.SelectedIndex >= 0 Then
		Return spnChose.GetItem(spnChose.SelectedIndex)
	Else If appSettings.IsInitialized And appSettings.ContainsKey("CurrentUser") Then
		Return appSettings.Get("CurrentUser")
	Else
		Return "Mike"
	End If
End Sub

Private Sub CreateHolidayBannerPanel(ParentWidth As Int) As B4XView
	If HolidayBanner.IsInitialized = False Or HolidayBanner.Size = 0 Then
		Return Null
	End If

	Dim BannerHeight As Int = 50dip
	Dim pBanner As B4XView = xui.CreatePanel("")
	pBanner.SetLayoutAnimated(0, 0, 0, ParentWidth, BannerHeight)
	pBanner.Color = HolidayBanner.Get("BgColor")

	Dim lblBanner As Label : lblBanner.Initialize("")
	Dim xBanner As B4XView = lblBanner
	xBanner.Text = HolidayBanner.Get("Text")
	xBanner.TextColor = HolidayBanner.Get("TxtColor")
	xBanner.TextSize = 18
	lblBanner.Typeface = Typeface.DEFAULT_BOLD
	lblBanner.Gravity = Gravity.CENTER
	pBanner.AddView(xBanner, 0, 0, ParentWidth, BannerHeight)
	
	Return pBanner
End Sub

Public Sub UpdateStatsPanel(MikeCollected As Double, ErinCollected As Double)
	If lblGodCollectedNum.IsInitialized Then
		lblGodCollectedNum.Text = "$" & NumberFormat2(MikeCollected, 1, 2, 2, False)
	End If
	If lblGoddessCollectedNum.IsInitialized Then
		lblGoddessCollectedNum.Text = "$" & NumberFormat2(ErinCollected, 1, 2, 2, False)
	End If
	If lblTotalCollectedNum.IsInitialized Then
		Dim Total As Double = MikeCollected + ErinCollected
		lblTotalCollectedNum.Text = "$" & NumberFormat2(Total, 1, 2, 2, False)
	End If
End Sub

Public Sub RefreshStats
	If OAuth2.access_token = "" Then Return

	Dim MikeTotal As Double = 0
	Dim ErinTotal As Double = 0

	UpdateStatsPanel(MikeTotal, ErinTotal)
End Sub

Private Sub B4XPage_Disappear
	StopGestures ' [GESTURE] Stop listening to save battery
	' Keep fold listener alive globally so fold-state updates continue on all pages.
	' Stopping here prevents non-main pages from receiving fresh fold transitions.
	Log("B4XMainPage disappeared")
End Sub

' =========================================================
' ===            FOLDABLE DEVICE LISTENER (JAVA)        ===
' =========================================================

Public Sub StartFoldListener
	Try
		If FoldDetector.IsInitialized = False Then
			' Initialize the Java Instance
			FoldDetector.InitializeNewInstance(Application.PackageName & ".b4xmainpage$FoldableListener", Null)
		End If
		
		' Get the BA reference
		Dim joMe As JavaObject = Me
		Dim myBA As Object = joMe.RunMethod("getBA", Null)
		
		' [FINAL FIX] Pass the ROOT View. Java will use this to walk up to the Activity.
		Dim joy As JavaObject = FoldDetector
		joy.RunMethod("start", Array(myBA, Root))
		
		Log(">>> [FOLD-ENGINE] Listener Started.")
	Catch
		Log(">>> [FOLD-ENGINE] Error Starting Listener: " & LastException)
	End Try
End Sub

Public Sub StopFoldListener
	Try
		If FoldDetector.IsInitialized Then
			Dim joy As JavaObject = FoldDetector
			joy.RunMethod("stop", Null)
			Log(">>> [FOLD-ENGINE] Listener Stopped.")
		End If
	Catch
		Log(">>> [FOLD-ENGINE] Error Stopping Listener: " & LastException)
	End Try
End Sub

#If JAVA
import android.app.Activity;
import android.view.View;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import androidx.core.util.Consumer;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import java.util.List;
import java.util.concurrent.Executor;
import anywheresoftware.b4a.BA;

public static class FoldableListener {
    private WindowInfoTrackerCallbackAdapter adapter;
    private Consumer<WindowLayoutInfo> layoutConsumer;
    private BA ba;

    public class MainThreadExecutor implements Executor {
        private final Handler handler = new Handler(Looper.getMainLooper());
        @Override
        public void execute(Runnable command) {
            handler.post(command);
        }
    }

    public void start(Object baObj, Object viewObj) {
        // [FIXED] Force clean any previous listeners before starting a new one
        stop();
        
        this.ba = (BA) baObj;
        View androidView = (View) viewObj; 
        
        Context context = androidView.getContext();
        Activity activity = null;
        
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper)context).getBaseContext();
        }

        if (activity == null) {
            BA.Log(">>> [JAVA] CRITICAL: Could not find Activity from View Context!");
            return;
        }

        try {
            WindowInfoTracker tracker = WindowInfoTracker.getOrCreate(activity);
            adapter = new WindowInfoTrackerCallbackAdapter(tracker);
            
            layoutConsumer = new Consumer<WindowLayoutInfo>() {
                @Override
                public void accept(WindowLayoutInfo newLayoutInfo) {
                    try {
                        String state = "FLAT";
                        String orientation = "NONE";
                        boolean isSeparating = false;
                        
                        List<DisplayFeature> features = newLayoutInfo.getDisplayFeatures();
                        for (DisplayFeature feature : features) {
                            if (feature instanceof FoldingFeature) {
                                FoldingFeature fold = (FoldingFeature) feature;
                                
                                if (fold.getState() == FoldingFeature.State.HALF_OPENED) {
                                    state = "HALF_OPENED";
                                }
                                if (fold.getOrientation() == FoldingFeature.Orientation.VERTICAL) {
                                    orientation = "VERTICAL";
                                } else {
                                    orientation = "HORIZONTAL";
                                }
                                isSeparating = fold.isSeparating();
                            }
                        }
                        
                        if (ba != null) {
                            ba.raiseEventFromUI(this, "foldlistener_foldstatechanged", state, orientation, isSeparating);
                        }
                    } catch (Exception e) {
                        BA.Log("Error in Fold Consumer: " + e.toString());
                    }
                }
            };
            
            adapter.addWindowLayoutInfoListener(activity, new MainThreadExecutor(), layoutConsumer);
            BA.Log(">>> [JAVA] WindowLayoutInfoListener Attached.");
            
        } catch (Exception e) {
            BA.Log(">>> [JAVA] Critical Error in Start: " + e.toString());
            e.printStackTrace();
        }
    }

    public void stop() {
        if (adapter != null && layoutConsumer != null) {
            adapter.removeWindowLayoutInfoListener(layoutConsumer);
            adapter = null; // [FIXED] Nullify to prevent memory leaks
            BA.Log(">>> [JAVA] WindowLayoutInfoListener Removed.");
        }
    }
}
#End If

'Total subroutines prior to edit: 19
'Total Subroutines added or subtracted this edit: +0
'Total Subroutines after this edit: 19
'Discrepancies: 0
'Total source code lines prior to edit: 440
'Total source code lines added/subtracted this edit: +28
'Total source code lines after the edit: 468
'Discrepancies: 0
'//<END-B4XMainPage-S02>







'//<START-B4XMainPage-S03>
'Sub Routines in S03: 8
'Private Sub CheckAndRequestSystemPermissions
'Sub Activity_PermissionResult (Permission As String, Result As Boolean)
'Sub B4XPage_ActivityResult (RequestCode As Int, ResultCode As Int, Data As Intent)
'Sub B4XPage_Appear
'Public Sub FoldListener_FoldStateChanged(State As String, Orientation As String, IsSeparating As Boolean)
'Private Sub AdjustLayout(Width As Int, Height As Int)
'Private Sub CompactStatsPanel(PnlW As Int)
'Private Sub ExpandedStatsPanel(PnlW As Int, PnlH As Int)
'Variables in S03: 29
'Permissions (Implicit)
'Missing (Boolean)
'bmp (Bitmap)
'act (Activity)
'i (Intent)
'HeaderBottom (Int)
'lv (B4XView)
'UseCompactMode (Boolean)
'MidPoint (Int)
'BtnW (Int)
'BtnH (Int)
'ListTop (Int)
'ButtonsWidth (Int)
'MidPoint (Int)
'BtnW (Int)
'BtnH (Int)
'StatusWidth (Int)
'StatsLeft (Int)
'StatsWidth (Int)
'ListTop (Int)
'RowH (Int)
'LabelWidth (Int)
'ValueLeft (Int)
'ValueWidth (Int)
'AvailHeight (Int)
'TopY (Int)
'LabelWidth (Int)
'ValueLeft (Int)
'ValueWidth (Int)
'Calls in S03: 23
'SetLayoutAnimated
'SaveBitmapToTemp
'AddView
'SetTextAlignment
'ExpandedStatsPanel
'ProcessReceiptOCR
'B4XPage_Resize
'Base_Resize
'CheckAndRequest
'Exists
'Mode
'CallFromResume
'As
'Combine
'HasExtra
'B4XPage_PermissionResult
'BuildDashboardList
'Max
'MsgboxAsync
'Detected
'Start
'CompactStatsPanel
'Check


Private Sub CheckAndRequestSystemPermissions
	Dim Permissions() As String = Array As String( _
		rp.PERMISSION_ACCESS_FINE_LOCATION, _
		rp.PERMISSION_READ_CALL_LOG, _
		rp.PERMISSION_SEND_SMS, _
		rp.PERMISSION_CALL_PHONE, _
		rp.PERMISSION_READ_CONTACTS, _
		rp.PERMISSION_WRITE_CONTACTS, _
		rp.PERMISSION_CAMERA, _
		rp.PERMISSION_RECORD_AUDIO, _
		rp.PERMISSION_WRITE_EXTERNAL_STORAGE)
	Dim Missing As Boolean = False
	For Each p As String In Permissions
		If rp.Check(p) = False Then
			Missing = True
			Exit
		End If
	Next
	If Missing Then
		For Each p As String In Permissions
			rp.CheckAndRequest(p)
		Next
		Wait For B4XPage_PermissionResult (Permission As String, Result As Boolean)
	End If

	' Request "All Files Access" during first-run permission flow instead of waiting for scraper launch.
	' Only auto-launch once during onboarding to avoid repeatedly forcing Settings on every startup.
	If HasAllFilesAccess = False Then
		Dim Prompted As Boolean = appSettings.GetDefault("AllFilesAccessPrompted", False)
		If Prompted = False Then
			RequestManageExternalStorage
			appSettings.Put("AllFilesAccessPrompted", True)
			File.WriteMap(File.DirInternal, "settings.map", appSettings)
		End If
	End If

	If rp.Check(rp.PERMISSION_ACCESS_FINE_LOCATION) Then gps.Start(0, 0)
	SetupFontSystem
End Sub

Sub Activity_PermissionResult (Permission As String, Result As Boolean)
	If Permission = rp.PERMISSION_ACCESS_FINE_LOCATION And Result = True Then gps.Start(0, 0)
End Sub

Sub B4XPage_ActivityResult (RequestCode As Int, ResultCode As Int, Data As Intent)
	If RequestCode = 123 And ResultCode = -1 Then 
		Log("Photo Captured!")
		If Data.IsInitialized And Data.HasExtra("data") Then
			Dim bmp As Bitmap = Data.GetExtra("data")
			SaveBitmapToTemp(bmp)
		Else If File.Exists(File.DirInternal, "expense_temp.jpg") Then
			ExpensePhotoPath = File.Combine(File.DirInternal, "expense_temp.jpg")
		Else
			xui.MsgboxAsync("Error: No image returned.", "Camera")
			Return
		End If
		ShowExpenseUI
		ProcessReceiptOCR(ExpensePhotoPath)
	End If
End Sub

Sub B4XPage_Appear
	Log(">>> [NATIVE-RESIZE] B4XPage_Appear Triggered. Checking Fold State...")
	StartFoldListener
	StartGestures
	
	' [FIXED] Capture the Intent from the Activity to complete the OAuth handshake
	Try
		Dim act As Activity = B4XPages.GetNativeParent(Me)
		Dim i As Intent = act.GetStartingIntent
		' Pass the intent to OAuth2 to check if it contains the auth code
		If OAuth2.IsInitialized Then
			OAuth2.CallFromResume(i)
		End If
	Catch
		Log("Error handling Resume Intent: " & LastException)
	End Try

	If Root.IsInitialized Then
		B4XPage_Resize(Root.Width, Root.Height)
	End If
End Sub

Public Sub FoldListener_FoldStateChanged(State As String, Orientation As String, IsSeparating As Boolean)
	Log(">>> [EVENT] Fold State Changed: " & State & " / " & Orientation)
	LastFoldState = State
	LastOrientation = Orientation
	If Root.IsInitialized Then
		B4XPage_Resize(Root.Width, Root.Height)
	End If
End Sub

Private Sub AdjustLayout(Width As Int, Height As Int)
	If pnlStats.IsInitialized = False Or lstTodayApts.IsInitialized = False Or spnChose.IsInitialized = False Then
		Return
	End If
	Dim HeaderBottom As Int = spnChose.Top + spnChose.Height
	Dim lv As B4XView = lstTodayApts.AsView
	If lv.Parent.IsInitialized And lv.Parent <> Root Then
		lv.RemoveViewFromParent
		Root.AddView(lv, 0, 0, 0, 0)
	End If
	
	' --- REPLICATING APPOINTMENTPAGE LOGIC ---
	Dim UseCompactMode As Boolean = True
	If Width > 1300 Then
		UseCompactMode = False 
		Log(">>> [LAYOUT] Wide Screen Detected (> 1300)")
	Else If Width > 850 Then
		UseCompactMode = True
		Log(">>> [LAYOUT] Tall Phone Detected (> 850)")
	End If
	
	If LastFoldState = "HALF_OPENED" Then
		UseCompactMode = True
		Log(">>> [LAYOUT] Forced Compact Mode (Tabletop)")
	End If

	If UseCompactMode Then
		If Panel1.IsInitialized Then Panel1.Width = Width
		If btnSearch.IsInitialized Then
			btnSearch.Text = "SEARCH"
			btnCreateClient.Text = "CREATE"
			btnScrape.Text = "SCRAPE VM"
			btnViewApt.Text = "VIEW"
			btnMakeApt.Text = "SCHEDULE"
			Dim MidPoint As Int = Width / 2
			Dim BtnW As Int = MidPoint - 4dip
			Dim BtnH As Int = 50dip
			btnSearch.SetLayoutAnimated(0, 2dip, btnSearch.Top, BtnW, BtnH)
			btnCreateClient.SetLayoutAnimated(0, MidPoint + 2dip, btnCreateClient.Top, BtnW, BtnH)
			btnScrape.SetLayoutAnimated(0, 2dip, btnScrape.Top, BtnW, BtnH)
			btnViewApt.SetLayoutAnimated(0, MidPoint + 2dip, btnViewApt.Top, BtnW, BtnH)
			btnCloseout.SetLayoutAnimated(0, 2dip, btnCloseout.Top, BtnW, BtnH)
			btnMakeApt.SetLayoutAnimated(0, MidPoint + 2dip, btnMakeApt.Top, BtnW, BtnH)
			If lblDayDate.IsInitialized Then
				lblDayDate.SetLayoutAnimated(0, 2dip, lblDayDate.Top, BtnW, lblDayDate.Height)
				lblDayDate.SetTextAlignment("CENTER", "LEFT")
				lblDayDate.As(Label).SingleLine = True
			End If
			If lblStatus.IsInitialized Then
				lblStatus.SetLayoutAnimated(0, MidPoint + 2dip, lblStatus.Top, BtnW, lblStatus.Height)
				lblStatus.SetTextAlignment("CENTER", "LEFT")
				lblStatus.As(Label).SingleLine = True
			End If
		End If
		pnlStats.SetLayoutAnimated(0, 5dip, HeaderBottom, Width - 10dip, 170dip)
		CompactStatsPanel(Width - 10dip)
		Dim ListTop As Int = pnlStats.Top + pnlStats.Height
		lstTodayApts.AsView.SetLayoutAnimated(0, 0, ListTop, Width, Max(0, Height - ListTop))
	Else
		Dim ButtonsWidth As Int = Width * 0.60
		If Panel1.IsInitialized Then Panel1.Width = ButtonsWidth
		If btnSearch.IsInitialized Then
			btnSearch.Text = "SEARCH FOR CLIENT"
			btnCreateClient.Text = "CREATE NEW CLIENT"
			btnScrape.Text = "SCRAPE VM"
			btnViewApt.Text = "VIEW APPOINTMENTS"
			btnMakeApt.Text = "MAKE APPOINTMENT"
			Dim MidPoint As Int = ButtonsWidth / 2
			Dim BtnW As Int = MidPoint - 4dip
			Dim BtnH As Int = 50dip
			btnSearch.SetLayoutAnimated(0, 2dip, btnSearch.Top, BtnW, BtnH)
			btnCreateClient.SetLayoutAnimated(0, MidPoint + 2dip, btnCreateClient.Top, BtnW, BtnH)
			btnScrape.SetLayoutAnimated(0, 2dip, btnScrape.Top, BtnW, BtnH)
			btnViewApt.SetLayoutAnimated(0, MidPoint + 2dip, btnViewApt.Top, BtnW, BtnH)
			btnCloseout.SetLayoutAnimated(0, 2dip, btnCloseout.Top, BtnW, BtnH)
			btnMakeApt.SetLayoutAnimated(0, MidPoint + 2dip, btnMakeApt.Top, BtnW, BtnH)
			If lblDayDate.IsInitialized Then
				lblDayDate.SetLayoutAnimated(0, 2dip, lblDayDate.Top, BtnW, lblDayDate.Height)
				lblDayDate.SetTextAlignment("CENTER", "LEFT")
				lblDayDate.As(Label).SingleLine = True
			End If
			If lblStatus.IsInitialized Then
				Dim StatusWidth As Int = ButtonsWidth - MidPoint - 4dip
				lblStatus.SetLayoutAnimated(0, MidPoint + 2dip, lblStatus.Top, StatusWidth, lblStatus.Height)
				lblStatus.SetTextAlignment("CENTER", "LEFT")
				lblStatus.As(Label).SingleLine = True
			End If
		End If
		Dim StatsLeft As Int = ButtonsWidth + 5dip
		Dim StatsWidth As Int = Width - StatsLeft - 5dip
		pnlStats.SetLayoutAnimated(0, StatsLeft, Panel1.Top, StatsWidth, HeaderBottom - Panel1.Top)
		ExpandedStatsPanel(StatsWidth, pnlStats.Height)
		Dim ListTop As Int = HeaderBottom + 5dip
		lstTodayApts.AsView.SetLayoutAnimated(0, 0, ListTop, Width, Max(0, Height - ListTop))
	End If
	lstTodayApts.Base_Resize(lstTodayApts.AsView.Width, lstTodayApts.AsView.Height)
	If LastDashboardItems.Size > 0 Then BuildDashboardList(LastDashboardItems, Width)
End Sub

Private Sub CompactStatsPanel(PnlW As Int)
	Dim RowH As Int = 28dip : Dim TopY As Int = 5dip : Dim Gap As Int = 4dip
	Dim LabelWidth As Int = PnlW * 0.70
	Dim ValueLeft As Int = PnlW * 0.55
	Dim ValueWidth As Int = PnlW - ValueLeft - 5dip
	lblTotalAptsGod.SetLayoutAnimated(0, 5dip, TopY, LabelWidth, RowH)
	lblTotalAptsGod.TextSize = 12
	lblTotalAptsGod.Color = xui.Color_Transparent
	lblTotalAptsGod.As(Label).SingleLine = True
	lblAppsGodNum.SetLayoutAnimated(0, ValueLeft, TopY, ValueWidth, RowH)
	lblAppsGodNum.TextSize = 12
	lblAppsGodNum.As(Label).Gravity = Gravity.CENTER_VERTICAL + Gravity.RIGHT
	lblAppsGodNum.As(Label).SingleLine = True
	TopY = TopY + RowH + Gap
	If lblTotalAptsGoddess.IsInitialized Then
		lblTotalAptsGoddess.SetLayoutAnimated(0, 5dip, TopY, LabelWidth, RowH)
		lblTotalAptsGoddess.TextSize = 12
		lblTotalAptsGoddess.Color = xui.Color_Transparent
		lblTotalAptsGoddess.SingleLine = True
		lblAppsGoddessNum.SetLayoutAnimated(0, ValueLeft, TopY, ValueWidth, RowH)
		lblAppsGoddessNum.TextSize = 12
		lblAppsGoddessNum.Gravity = Gravity.CENTER_VERTICAL + Gravity.RIGHT
		lblAppsGoddessNum.SingleLine = True
		TopY = TopY + RowH + Gap
	End If
	If lblGodCollected.IsInitialized Then
		lblGodCollected.SetLayoutAnimated(0, 5dip, TopY, LabelWidth, RowH)
		lblGodCollected.TextSize = 12
		lblGodCollected.Color = xui.Color_Transparent
		lblGodCollected.SingleLine = True
		lblGodCollectedNum.SetLayoutAnimated(0, ValueLeft, TopY, ValueWidth, RowH)
		lblGodCollectedNum.TextSize = 12
		lblGodCollectedNum.As(Label).Gravity = Gravity.CENTER_VERTICAL + Gravity.RIGHT
		lblGodCollectedNum.As(Label).SingleLine = True
		TopY = TopY + RowH + Gap
	End If
	If lblGoddessCollected.IsInitialized Then
		lblGoddessCollected.SetLayoutAnimated(0, 5dip, TopY, LabelWidth, RowH)
		lblGoddessCollected.TextSize = 12
		lblGoddessCollected.Color = xui.Color_Transparent
		lblGoddessCollected.SingleLine = True
		lblGoddessCollectedNum.SetLayoutAnimated(0, ValueLeft, TopY, ValueWidth, RowH)
		lblGoddessCollectedNum.TextSize = 12
		lblGoddessCollectedNum.As(Label).Gravity = Gravity.CENTER_VERTICAL + Gravity.RIGHT
		lblGoddessCollectedNum.As(Label).SingleLine = True
		TopY = TopY + RowH + Gap
	End If
	lblTotalCollected.SetLayoutAnimated(0, 5dip, TopY, LabelWidth, RowH)
	lblTotalCollected.TextSize = 12
	lblTotalCollected.Color = xui.Color_Transparent
	lblTotalCollected.As(Label).SingleLine = True
	lblTotalCollectedNum.SetLayoutAnimated(0, ValueLeft, TopY, ValueWidth, RowH)
	lblTotalCollectedNum.TextSize = 12
	lblTotalCollectedNum.As(Label).Gravity = Gravity.CENTER_VERTICAL + Gravity.RIGHT
	lblTotalCollectedNum.As(Label).SingleLine = True
End Sub

Private Sub ExpandedStatsPanel(PnlW As Int, PnlH As Int)
	Dim AvailHeight As Int = PnlH - 10dip : Dim RowH As Int = AvailHeight / 5
	Dim TopY As Int = 5dip
	Dim LabelWidth As Int = PnlW * 0.90
	Dim ValueLeft As Int = PnlW * 0.35
	Dim ValueWidth As Int = PnlW - ValueLeft - 5dip
	lblTotalAptsGod.SetLayoutAnimated(0, 5dip, TopY, LabelWidth, RowH)
	lblTotalAptsGod.TextSize = 14
	lblTotalAptsGod.Color = xui.Color_Transparent
	lblTotalAptsGod.As(Label).SingleLine = True
	lblTotalAptsGod.As(Label).Ellipsize = "END"
	lblAppsGodNum.SetLayoutAnimated(0, ValueLeft, TopY, ValueWidth, RowH)
	lblAppsGodNum.TextSize = 14
	lblAppsGodNum.As(Label).Gravity = Gravity.CENTER_VERTICAL + Gravity.RIGHT
	lblAppsGodNum.As(Label).SingleLine = True
	TopY = TopY + RowH
	If lblTotalAptsGoddess.IsInitialized Then
		lblTotalAptsGoddess.SetLayoutAnimated(0, 5dip, TopY, LabelWidth, RowH)
		lblTotalAptsGoddess.TextSize = 14
		lblTotalAptsGoddess.Color = xui.Color_Transparent
		lblTotalAptsGoddess.SingleLine = True
		lblTotalAptsGoddess.Ellipsize = "END"
		lblAppsGoddessNum.SetLayoutAnimated(0, ValueLeft, TopY, ValueWidth, RowH)
		lblAppsGoddessNum.TextSize = 14
		lblAppsGoddessNum.Gravity = Gravity.CENTER_VERTICAL + Gravity.RIGHT
		lblAppsGoddessNum.SingleLine = True
		TopY = TopY + RowH
	End If
	If lblGodCollected.IsInitialized Then
		lblGodCollected.SetLayoutAnimated(0, 5dip, TopY, LabelWidth, RowH)
		lblGodCollected.TextSize = 14
		lblGodCollected.Color = xui.Color_Transparent
		lblGodCollected.SingleLine = True
		lblGodCollected.Ellipsize = "END"
		lblGodCollectedNum.SetLayoutAnimated(0, ValueLeft, TopY, ValueWidth, RowH)
		lblGodCollectedNum.TextSize = 14
		lblGodCollectedNum.As(Label).Gravity = Gravity.CENTER_VERTICAL + Gravity.RIGHT
		lblGodCollectedNum.As(Label).SingleLine = True
		TopY = TopY + RowH
	End If
	If lblGoddessCollected.IsInitialized Then
		lblGoddessCollected.SetLayoutAnimated(0, 5dip, TopY, LabelWidth, RowH)
		lblGoddessCollected.TextSize = 14
		lblGoddessCollected.Color = xui.Color_Transparent
		lblGoddessCollected.SingleLine = True
		lblGoddessCollected.Ellipsize = "END"
		lblGoddessCollectedNum.SetLayoutAnimated(0, ValueLeft, TopY, ValueWidth, RowH)
		lblGoddessCollectedNum.TextSize = 14
		lblGoddessCollectedNum.As(Label).Gravity = Gravity.CENTER_VERTICAL + Gravity.RIGHT
		lblGoddessCollectedNum.As(Label).SingleLine = True
		TopY = TopY + RowH
	End If
	lblTotalCollected.SetLayoutAnimated(0, 5dip, TopY, LabelWidth, RowH)
	lblTotalCollected.TextSize = 14
	lblTotalCollected.Color = xui.Color_Transparent
	lblTotalCollected.As(Label).SingleLine = True
	lblTotalCollected.As(Label).Ellipsize = "END"
	lblTotalCollectedNum.SetLayoutAnimated(0, ValueLeft, TopY, ValueWidth, RowH)
	lblTotalCollectedNum.TextSize = 14
	lblTotalCollectedNum.As(Label).Gravity = Gravity.CENTER_VERTICAL + Gravity.RIGHT
	lblTotalCollectedNum.As(Label).SingleLine = True
End Sub

'Total subroutines prior to edit: 8
'Total Subroutines added or subtracted this edit: +0
'Total Subroutines after this edit: 8
'Discrepancies: 0
'Total source code lines prior to edit: 274
'Total source code lines added/subtracted this edit: +9
'Total source code lines after the edit: 283
'Discrepancies: 0
'//<END-B4XMainPage-S03>







'//<START-B4XMainPage-S04>
' =========================================================
' ===            SECTION S04: MASTER BREAKDOWN          ===
' =========================================================

' --- SUBROUTINE DECLARATIONS (Total: 6) ---
' Public Sub SetPendingSlot(SlotInfo As Map)
' Public Sub CheckBookingState(Profile As Map)
' Public Sub PerformSearch(Query As String)
' Private Sub ParseDateString(DateStr As String) As Long
' Sub SearchCalendarForDate(DateMs As Long)
' Public Sub LaunchAppointmentView(Profile As Map)

' --- VARIABLE DECLARATIONS (Total: 25) ---
' SlotInfo (Map - Parameter)
' Profile (Map - Parameter)
' Query (String - Parameter)
' DateMs (Long)
' job (HttpJob)
' su (StringUtils)
' FinalURL (String)
' DateStr (String - Parameter)
' Formats (String Array)
' fmt (String - For Each loop)
' L (Long)
' DateMs (Long - Parameter)
' Year (Int)
' Month (Int)
' Day (Int)
' StartTime (Long)
' EndTime (Long)
' TimeMin (String)
' TimeMax (String)
' Profile (Map - Parameter - LaunchAppointmentView)
' DateParts (Int Array)
' year (Int - OnDateSelected)
' month (Int - OnDateSelected)
' day (Int - OnDateSelected)
' items (List)

' --- SUBROUTINE CALLS (Total: 34) ---
' Log
' PendingSlot.IsInitialized
' PendingSlot.Size
' B4XPages.ShowPage
' CallSub3 (BookAppointment)
' PendingSlot.Clear
' CallSub2 (LoadClientForAppt)
' OAuth2.GetAccessToken
' Query.ToLowerCase
' Query.Trim
' ParseDateString
' SearchCalendarForDate
' job.Initialize
' su.EncodeUrl
' job.Download
' job.GetRequest.SetHeader
' DateTime.DateParse
' DateTime.GetYear
' DateTime.GetMonth
' DateTime.GetDayOfMonth
' DateUtils.SetDateAndTime
' CreateRFC3339
' TimeMin.Replace
' TimeMax.Replace
' CallSub2 (OnDateSelected)
' parser.Initialize
' parser.NextObject
' rootMap.ContainsKey
' items.Initialize
' xui.MsgboxAsync
' Job.Release
' Query.Contains
' Query.Length
' StringUtils.EncodeUrl

' =========================================================
' ===            BOOKING & TRAFFIC LOGIC                ===
' =========================================================

' [NEW] Traffic Cop Helper: Receives the time slot from AppointmentPage
Public Sub SetPendingSlot(SlotInfo As Map)
	Log(">>> [TRAFFIC COP] Received Manual Slot Push: " & SlotInfo)
	' Store it in the PendingSlot variable so CheckBookingState can find it
	PendingSlot = SlotInfo
End Sub

' The "Traffic Cop" Logic
Public Sub CheckBookingState(Profile As Map)
	Log(">>> [TRAFFIC COP] Checking Booking State...")

	' SCENARIO A: Origin = Book Button (Time Chosen First)
	If PendingSlot.IsInitialized And PendingSlot.Size > 0 Then
		Log("   -> Path: Time Slot Found. Merging with Client.")
		' We have a slot, now we have a client. Go to Confirmation.
		B4XPages.ShowPage("AppointmentPage")
		CallSub3(appointmentScreen, "BookAppointment", PendingSlot, Profile)
		PendingSlot.Clear ' Consumed

		' SCENARIO B: Origin = Search Page (Client Chosen First)
	Else
		Log("   -> Path: No Time Slot. Storing Client -> Going to AppointmentPage.")
		' We have a client, but need a time.
		PendingSlot.Clear ' Ensure no stale data

		' [FIXED] Redirect to AppointmentPage (Grid) instead of ViewSchedulePage
		' We load the client into the AppointmentPage so the user can select a time slot.
		B4XPages.ShowPage("AppointmentPage")
		CallSub2(appointmentScreen, "LoadClientForAppt", Profile)
	End If
End Sub

' =========================================================
' ===          MASTER SEARCH ROUTER (SECTION 4)         ===
' =========================================================
Public Sub PerformSearch(Query As String)
	Log("PerformSearch Called with: " & Query)
	If OAuth2.access_token = "" Then
		Log("DEBUG: Token Empty during Search - Requesting New Token")
		OAuth2.GetAccessToken
		Return
	End If

	CurrentSearchQuery = Query

	' --- BUG FIX: COMMENTED OUT DUPLICATE SEARCH LOGIC ---
	' Detect if Query is a Date (MM/DD/YYYY)
	' If Query.Contains("/") And Query.Length >= 8 Then
	' 	Log(">>> [Search] Routing to Calendar Date Search: " & Query)
	' 	SearchByDate(Query)
	' Else
	' 	' Standard Contact Search
	' 	Log(">>> [Search] Routing to Google Contacts Search: " & Query)
	' 	SearchContact(Query)
	' End If
	' -----------------------------------------------------

	CurrentSearchQuery = Query.ToLowerCase.Trim
	
	' 1. CHECK IF DATE
	Dim DateMs As Long = ParseDateString(Query)
	If DateMs > 0 Then
		Log("DEBUG: Search Query Identified as DATE")
		SearchCalendarForDate(DateMs)
	Else
		Log("DEBUG: Search Query Identified as TEXT - Calling People API")
		' Use SEARCH endpoint first
		Dim job As HttpJob : job.Initialize("SearchContact", Me)
		Dim su As StringUtils
		Dim FinalURL As String = "https://people.googleapis.com/v1/people:searchContacts?query=" & su.EncodeUrl(Query, "UTF8") & "&readMask=names,phoneNumbers,addresses,biographies,memberships"
		Log("DEBUG: Request URL: " & FinalURL)
		
		job.Download(FinalURL)
		job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
	End If
End Sub

' Helper to detect date formats
Private Sub ParseDateString(DateStr As String) As Long
	Dim Formats() As String = Array As String("MM/dd/yyyy", "M/d/yyyy", "yyyy-MM-dd", "MMM d, yyyy")
	For Each fmt As String In Formats
		DateTime.DateFormat = fmt
		Try
			Dim L As Long = DateTime.DateParse(DateStr)
			Return L
		Catch
			Log("ParseDateString: Format " & fmt & " did not match")
		End Try
	Next
	Return 0
End Sub

Sub SearchCalendarForDate(DateMs As Long)
	Dim Year As Int = DateTime.GetYear(DateMs)
	Dim Month As Int = DateTime.GetMonth(DateMs)
	Dim Day As Int = DateTime.GetDayOfMonth(DateMs)
	
	' Search whole day 00:00 to 23:59
	Dim StartTime As Long = DateUtils.SetDateAndTime(Year, Month, Day, 0, 0, 0)
	Dim EndTime As Long = DateUtils.SetDateAndTime(Year, Month, Day, 23, 59, 59)
	
	Dim TimeMin As String = CreateRFC3339(StartTime, "-05:00")
	Dim TimeMax As String = CreateRFC3339(EndTime, "-05:00")
	
	Dim job As HttpJob : job.Initialize("SearchDate", Me)
	job.Download("https://www.googleapis.com/calendar/v3/calendars/primary/events?timeMin=" & TimeMin.Replace("+", "%2B") & "&timeMax=" & TimeMax.Replace("+", "%2B") & "&singleEvents=true&orderBy=startTime")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Public Sub LaunchAppointmentView(Profile As Map)
	B4XPages.ShowPage("AppointmentPage")
	CallSub2(appointmentScreen, "LoadClientForAppt", Profile)
End Sub
'//<END-B4XMainPage-S04>





'//<START-B4XMainPage-S05>
' =========================================================
' ===            SECTION S05: MASTER BREAKDOWN          ===
' =========================================================

' --- SUBROUTINE DECLARATIONS (Total: 3) ---
' Public Sub RefreshDashboard 
' Sub HandleFetchDashboard(Job As HttpJob) 
' Private Sub BuildDashboardList(Items As List, TargetWidth As Int) 

' --- VARIABLE DECLARATIONS (Total: 73) ---
' jobDash (HttpJob) 
' StartOfDay (Long) 
' EndOfDay (Long) 
' TimeMin (String) 
' TimeMax (String) 
' Job (HttpJob - Parameter) 
' parser (JSONParser) 
' rootMap (Map) 
' items (List) 
' Items (List - Parameter) 
' TargetWidth (Int - Parameter) 
' ParentWidth (Int) 
' IsSmallScreen (Boolean) 
' HolidayPanel (B4XView) 
' ApptCount (Int) 
' MikeCount (Int) 
' ErinCount (Int) 
' p (B4XView - No Appts) 
' lbl (Label) 
' xlbl (B4XView) 
' ev (Map - For Each loop) 
' cId (String) 
' SelectedIndex (Int) 
' ShouldShow (Boolean) 
' ApptID (String) 
' isClosed (Boolean) 
' RightStatusIcon (String) 
' RightStatusColor (Int) 
' RowBGColor (Int) 
' ArrivalIcon (String) 
' ArrivalColor (Int) 
' ArrivalEnabled (Boolean) 
' summary (String) 
' desc (String) 
' loc (String) 
' startMap (Map) 
' endMap (Map) 
' dtStr (String) 
' dtEndStr (String) 
' DisplayTime (String) 
' H (Int) 
' TimeStart (String) 
' HE (Int) 
' TimeEnd (String) 
' cName (String) 
' cPhone (String) 
' cIssue (String) 
' i (Int) 
' i2 (Int) 
' RowHeight (Int) 
' p (B4XView - Row) 
' lblTime (Label) 
' xTime (B4XView) 
' lblNum (Label) 
' xNum (B4XView) 
' IconWidth (Int) 
' CenterStart (Int) 
' CenterWidth (Int) 
' lblArrival (Label) 
' xArrival (B4XView) 
' DataMap (Map) 
' lblName (Label) 
' xName (B4XView) 
' cs (CSBuilder) 
' lblPhone (Label) 
' xPhone (B4XView) 
' cs2 (CSBuilder) 
' lblAddr (Label) 
' xAddr (B4XView) 
' cs3 (CSBuilder) 
' lblIssue (Label) 
' xIssue (B4XView) 
' lblStatRight (Label) 
' xStatRight (B4XView) 
' line (B4XView) 

' --- SUBROUTINE CALLS (Total: 49) ---
' RefreshDashboard (Self) 
' lstTodayApts.Clear 
' LastDashboardItems.Clear 
' jobDash.Initialize 
' DateUtils.SetDate 
' DateTime.GetYear 
' DateTime.GetMonth 
' DateTime.GetDayOfMonth 
' DateTime.Add 
' CreateRFC3339 
' jobDash.Download 
' TimeMin.Replace 
' TimeMax.Replace 
' jobDash.GetRequest.SetHeader 
' Log 
' parser.Initialize 
' parser.NextObject 
' rootMap.ContainsKey 
' rootMap.Get 
' BuildDashboardList 
' Job.Release 
' CreateHolidayBannerPanel 
' HolidayPanel.IsInitialized 
' lstTodayApts.Add 
' ApplyListBackground 
' GetCurrentUser 
' xui.CreatePanel 
' p.SetLayoutAnimated 
' lbl.Initialize 
' xlbl.SetTextAlignment 
' p.AddView 
' ev.GetDefault 
' ev.Get 
' ParseIsoToLocalHour 
' FormatPhone 
' FormatAudioTime 
' summary.IndexOf 
' summary.SubString2 
' desc.IndexOf 
' desc.SubString2 
' desc.IndexOf2 
' CleanAddress 
' CSBuilder.Initialize 
' cs.Append 
' cs.PopAll 
' CreateMap 
' lstTodayApts.Base_Resize 
' NumberFormat 
' lblStatRight.Typeface

' =========================================================
' ===            DASHBOARD & STATS LOGIC                ===
' =========================================================

Public Sub RefreshDashboard
	If OAuth2.access_token = "" Then
		lblStatus.Text = "Status: Disconnected (Waiting for Token)"
		Return
	End If

	lblStatus.Text = "Status: Syncing Dashboard..."

	lstTodayApts.Clear
	LastDashboardItems.Clear

	lblStatus.Text = "Status: Refreshing..."

	Dim jobDash As HttpJob : jobDash.Initialize("FetchDashboard", Me)
	Dim StartOfDay As Long = DateUtils.SetDate(DateTime.GetYear(DateTime.Now), DateTime.GetMonth(DateTime.Now), DateTime.GetDayOfMonth(DateTime.Now))
	Dim EndOfDay As Long = DateTime.Add(StartOfDay, 0, 0, 1) - 1
	
	Dim TimeMin As String = CreateRFC3339(StartOfDay, "-05:00")
	Dim TimeMax As String = CreateRFC3339(EndOfDay, "-05:00")

	jobDash.Download("https://www.googleapis.com/calendar/v3/calendars/primary/events?timeMin=" & TimeMin.Replace("+", "%2B") & "&timeMax=" & TimeMax.Replace("+", "%2B") & "&singleEvents=true&orderBy=startTime")
	jobDash.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Sub HandleFetchDashboard(Job As HttpJob)
	If Job.Success = False Then
		Log("Dashboard Error: " & Job.ErrorMessage)
		lblStatus.Text = "Status: Disconnected"
		lblStatus.Color = xui.Color_White
		lblStatus.TextColor = 0xFFD32F2F
		Job.Release
		Return
	End If

	Dim parser As JSONParser : parser.Initialize(Job.GetString)
	Dim rootMap As Map = parser.NextObject
	Dim items As List
	If rootMap.ContainsKey("items") Then
		items = rootMap.Get("items")
	Else
		items.Initialize
	End If
	
	lblStatus.Text = "Status: Connected"
	lblStatus.Color = xui.Color_White
	lblStatus.TextColor = xui.Color_Black

	BuildDashboardList(items, Root.Width)

	Job.Release
End Sub

Private Sub BuildDashboardList(Items As List, TargetWidth As Int)
	LastDashboardItems = Items
	lstTodayApts.Clear

	Dim ParentWidth As Int = TargetWidth
	If ParentWidth < 100 Then ParentWidth = Root.Width

	Dim IsSmallScreen As Boolean = (ParentWidth < LAYOUT_THRESHOLD)

	' Check for holiday banner using CreateHolidayBannerPanel
	Dim HolidayPanel As B4XView = CreateHolidayBannerPanel(ParentWidth)
	If HolidayPanel.IsInitialized Then
		lstTodayApts.Add(HolidayPanel, "HolidayBanner")
	End If

	' Apply simple background color using GetCurrentUser
	ApplyListBackground(GetCurrentUser)

	Dim ApptCount As Int = 0
	Dim MikeCount As Int = 0
	Dim ErinCount As Int = 0

	If Items.Size = 0 Then
		Dim p As B4XView = xui.CreatePanel("")
		p.SetLayoutAnimated(0, 0, 0, ParentWidth, 100dip)
		p.Color = xui.Color_White
		Dim lbl As Label : lbl.Initialize("")
		Dim xlbl As B4XView = lbl
		xlbl.Text = "No Appointments Found for Today"
		xlbl.TextColor = xui.Color_Gray
		xlbl.TextSize = 18
		xlbl.SetTextAlignment("CENTER", "CENTER")
		p.AddView(xlbl, 0, 0, ParentWidth, 100dip)
		lstTodayApts.Add(p, "")
		
		lblAppsGodNum.Text = "0"
		lblAppsGoddessNum.Text = "0"
		Return
	End If

	For Each ev As Map In Items
		Dim cId As String = ev.GetDefault("colorId", "1")
		If cId = "1" Then MikeCount = MikeCount + 1
		If cId = "11" Then ErinCount = ErinCount + 1

		Dim SelectedIndex As Int = 0
		If spnChose.IsInitialized Then SelectedIndex = spnChose.SelectedIndex

		Dim ShouldShow As Boolean = False
		If SelectedIndex = 0 And cId = "1" Then ShouldShow = True
		If SelectedIndex = 1 And cId = "11" Then ShouldShow = True
		If ShouldShow = False Then Continue

		ApptCount = ApptCount + 1
		Dim ApptID As String = ev.Get("id")

		Dim isClosed As Boolean = (cId = "8")
		Dim RightStatusIcon As String
		Dim RightStatusColor As Int
		Dim RowBGColor As Int
		If isClosed Then
			RightStatusIcon = Chr(0xF058)
			RightStatusColor = 0xFF2E7D32
			RowBGColor = COLOR_CLOSED
		Else
			RightStatusIcon = Chr(0xF017)
			RightStatusColor = xui.Color_DarkGray
			RowBGColor = COLOR_PENDING
		End If
		
		Dim ArrivalIcon As String
		Dim ArrivalColor As Int
		Dim ArrivalEnabled As Boolean = False
		If ApptID = ActiveAppointmentID Then
			ArrivalIcon = Chr(0xF0AD)
			ArrivalColor = xui.Color_Blue
			ArrivalEnabled = True
			RowBGColor = COLOR_ACTIVE
		Else If isClosed Then
			ArrivalIcon = ""
			ArrivalColor = xui.Color_Transparent
		Else
			ArrivalIcon = Chr(0xF1B9)
			ArrivalColor = xui.Color_LightGray
			ArrivalEnabled = False
		End If
		
		Dim summary As String = ev.GetDefault("summary", "Unknown")
		Dim desc As String = ev.GetDefault("description", "")
		Dim loc As String = ev.GetDefault("location", "No Address")
		
		Dim startMap As Map = ev.Get("start")
		Dim endMap As Map = ev.Get("end")
		Dim dtStr As String = startMap.GetDefault("dateTime", "")
		Dim dtEndStr As String = endMap.GetDefault("dateTime", "")
		Dim DisplayTime As String = ""
		
		If dtStr <> "" Then
			Dim H As Int = ParseIsoToLocalHour(dtStr)
			Dim TimeStart As String
			If H > 12 Then
				TimeStart = (H - 12) & ":00 PM"
			Else If H = 12 Then
				TimeStart = "12:00 PM"
			Else
				TimeStart = H & ":00 AM"
			End If
			DisplayTime = TimeStart
			
			If dtEndStr <> "" Then
				Dim HE As Int = ParseIsoToLocalHour(dtEndStr)
				Dim TimeEnd As String
				If HE > 12 Then
					TimeEnd = (HE - 12) & ":00 PM"
				Else If HE = 12 Then
					TimeEnd = "12:00 PM"
				Else
					TimeEnd = HE & ":00 AM"
				End If
				DisplayTime = DisplayTime & " - " & TimeEnd
			End If
		End If
		
		Dim cName As String = summary
		If summary.Contains(" - ") Then cName = summary.SubString2(0, summary.IndexOf(" - "))
		Dim cPhone As String = "No Phone"
		Dim cIssue As String = "No Issue"
		
		If desc.Contains("Phone: ") Then
			Dim i As Int = desc.IndexOf("Phone: ") + 7
			Dim i2 As Int = desc.IndexOf2(Chr(10), i)
			If i2 = -1 Then i2 = desc.Length
			cPhone = desc.SubString2(i, i2).Trim
			' Mask the phone number
			cPhone = FormatPhone(cPhone) 
		End If
		If desc.Contains("Issue: ") Then
			Dim i As Int = desc.IndexOf("Issue: ") + 7
			Dim i2 As Int = desc.IndexOf2(Chr(10), i)
			If i2 = -1 Then i2 = desc.Length
			cIssue = desc.SubString2(i, i2).Trim
		End If
		
		' [FIXED] Master Card Height increased from 95dip to 110dip to accommodate bigger address label
		Dim RowHeight As Int = 110dip 
		Dim p As B4XView = xui.CreatePanel("")
		p.SetLayoutAnimated(0, 0, 0, ParentWidth, RowHeight)
		p.Color = RowBGColor
		
		Dim lblTime As Label : lblTime.Initialize("")
		Dim xTime As B4XView = lblTime
		xTime.Text = "  " & DisplayTime
		xTime.Color = xui.Color_Black
		xTime.TextColor = xui.Color_White
		xTime.TextSize = 13
		p.AddView(xTime, 0, 0, ParentWidth, 18dip)
		
		Dim lblNum As Label : lblNum.Initialize("")
		Dim xNum As B4XView = lblNum
		xNum.Text = "#" & ApptCount
		xNum.TextColor = xui.Color_Black
		lblNum.Typeface = Typeface.DEFAULT_BOLD
		xNum.TextSize = 13
		p.AddView(xNum, 5dip, 22dip, 25dip, 30dip)
		
		If IsSmallScreen Then
			Dim IconWidth As Int = 50dip
			Dim CenterStart As Int = IconWidth + 10dip
			Dim CenterWidth As Int = ParentWidth - (IconWidth * 2) - 20dip
			
			Dim lblArrival As Label : lblArrival.Initialize("lblArrival")
			Dim xArrival As B4XView = lblArrival
			xArrival.Text = ArrivalIcon
			xArrival.TextColor = ArrivalColor
			lblArrival.Typeface = Typeface.FONTAWESOME
			xArrival.TextSize = 35
			xArrival.SetTextAlignment("CENTER", "CENTER")
			Dim DataMap As Map = CreateMap("Name": cName, "Phone": cPhone, "Addr": loc, "ID": ApptID)
			xArrival.Tag = DataMap
			xArrival.Enabled = ArrivalEnabled
			p.AddView(xArrival, 25dip, 22dip, IconWidth, 50dip)
			
			' --- NAME (Top: 20dip) ---
			Dim lblName As Label : lblName.Initialize("lblDashName")
			Dim xName As B4XView = lblName
			Dim cs As CSBuilder
			' [FIXED] Applies new fontCardText instead of Default_Bold
			cs.Initialize.Typeface(Typeface.FONTAWESOME).Color(xui.Color_Blue).Append(Chr(0xF007) & " ").Typeface(fontCardText).Bold.Append(cName).PopAll
			xName.Text = cs
			xName.TextSize = 15
			xName.Tag = cName
			lblName.Gravity = Gravity.CENTER_VERTICAL + Gravity.CENTER_HORIZONTAL
			p.AddView(xName, CenterStart, 20dip, CenterWidth, 20dip)
			
			' --- PHONE (Top: 40dip, Height: 25dip, Size: 12) ---
			Dim lblPhone As Label : lblPhone.Initialize("lblDashPhone")
			Dim xPhone As B4XView = lblPhone
			Dim cs2 As CSBuilder
			' [FIXED] Applies new fontCardText
			cs2.Initialize.Typeface(Typeface.FONTAWESOME).Color(xui.Color_Blue).Append(Chr(0xF095) & " ").Typeface(fontCardText).Append(cPhone).PopAll
			xPhone.Text = cs2
			xPhone.TextSize = 12 ' [FIXED] Reduced to 12
			xPhone.Tag = cPhone
			lblPhone.Gravity = Gravity.CENTER_VERTICAL + Gravity.CENTER_HORIZONTAL
			p.AddView(xPhone, CenterStart, 40dip, CenterWidth, 25dip)
			
			' --- ADDRESS (Top: 65dip, Height: 45dip, Size: 11) ---
			Dim lblAddr As Label : lblAddr.Initialize("lblDashAddr")
			Dim xAddr As B4XView = lblAddr
			Dim cs3 As CSBuilder
			' [FIXED] Applies new fontCardText
			cs3.Initialize.Typeface(Typeface.FONTAWESOME).Color(xui.Color_Blue).Append(Chr(0xF041) & " ").Typeface(fontCardText).Append(CleanAddress(loc)).PopAll
			xAddr.Text = cs3
			xAddr.TextSize = 11 ' [FIXED] Reduced to 11
			xAddr.Tag = loc
			lblAddr.SingleLine = False
			lblAddr.Gravity = Gravity.CENTER_VERTICAL + Gravity.CENTER_HORIZONTAL
			p.AddView(xAddr, CenterStart, 65dip, CenterWidth, 45dip) ' [FIXED] Height up to 45dip
			
			' --- ISSUE (Shifted down) ---
			Dim lblIssue As Label : lblIssue.Initialize("")
			Dim xIssue As B4XView = lblIssue
			xIssue.Text = "Issue: " & cIssue
			xIssue.TextColor = xui.Color_Black
			xIssue.TextSize = 12
			lblIssue.Gravity = Gravity.CENTER_HORIZONTAL + Gravity.TOP
			p.AddView(xIssue, CenterStart, 88dip, CenterWidth, 20dip)
			
			Dim lblStatRight As Label : lblStatRight.Initialize("")
			Dim xStatRight As B4XView = lblStatRight
			xStatRight.Text = RightStatusIcon
			xStatRight.TextColor = RightStatusColor
			lblStatRight.Typeface = Typeface.FONTAWESOME
			xStatRight.TextSize = 35
			xStatRight.SetTextAlignment("CENTER", "CENTER")
			p.AddView(xStatRight, ParentWidth - IconWidth - 5dip, 22dip, IconWidth, 50dip)
			
		Else
			' --- LARGE SCREEN SPACING ---
			Dim TopRowY As Int = 28dip
			Dim BotRowY As Int = 75dip
			Dim W_Arrival As Int = 60dip
			Dim ArrivalLeftEdge As Int = 20dip
			Dim W_RightStat As Int = 60dip
			Dim RightStatLeftEdge As Int = ParentWidth - W_RightStat - 10dip
			
			Dim CenterStart As Int = ArrivalLeftEdge + W_Arrival + 10dip
			Dim CenterEnd As Int = RightStatLeftEdge - 10dip
			Dim CenterWidth As Int = CenterEnd - CenterStart
			Dim ColWidth As Int = CenterWidth / 3
			
			Dim lblArrival As Label : lblArrival.Initialize("lblArrival")
			Dim xArrival As B4XView = lblArrival
			xArrival.Text = ArrivalIcon
			xArrival.TextColor = ArrivalColor
			lblArrival.Typeface = Typeface.FONTAWESOME
			xArrival.TextSize = 40
			xArrival.SetTextAlignment("CENTER", "CENTER")
			Dim DataMap As Map = CreateMap("Name": cName, "Phone": cPhone, "Addr": loc, "ID": ApptID)
			xArrival.Tag = DataMap
			xArrival.Enabled = ArrivalEnabled
			p.AddView(xArrival, ArrivalLeftEdge, 25dip, W_Arrival, 50dip)
			
			Dim lblName As Label : lblName.Initialize("lblDashName")
			Dim xName As B4XView = lblName
			Dim cs As CSBuilder
			cs.Initialize.Typeface(Typeface.FONTAWESOME).Color(xui.Color_Blue).Append(Chr(0xF007) & " ").Typeface(fontCardText).Bold.Append(cName).PopAll
			xName.Text = cs
			xName.TextSize = 14
			xName.Tag = cName
			lblName.Gravity = Gravity.CENTER_VERTICAL + Gravity.RIGHT
			p.AddView(xName, CenterStart, TopRowY, ColWidth, 30dip)
			
			Dim lblPhone As Label : lblPhone.Initialize("lblDashPhone")
			Dim xPhone As B4XView = lblPhone
			Dim cs2 As CSBuilder
			cs2.Initialize.Typeface(Typeface.FONTAWESOME).Color(xui.Color_Blue).Append(Chr(0xF095) & " ").Typeface(fontCardText).Append(cPhone).PopAll
			xPhone.Text = cs2
			xPhone.TextSize = 12 ' [FIXED]
			xPhone.Tag = cPhone
			lblPhone.Gravity = Gravity.CENTER_VERTICAL + Gravity.CENTER_HORIZONTAL
			p.AddView(xPhone, CenterStart + ColWidth, TopRowY, ColWidth, 30dip)
			
			Dim lblAddr As Label : lblAddr.Initialize("lblDashAddr")
			Dim xAddr As B4XView = lblAddr
			Dim cs3 As CSBuilder
			cs3.Initialize.Typeface(Typeface.FONTAWESOME).Color(xui.Color_Blue).Append(Chr(0xF041) & " ").Typeface(fontCardText).Append(CleanAddress(loc)).PopAll
			xAddr.Text = cs3
			xAddr.TextSize = 11 ' [FIXED]
			xAddr.Tag = loc
			lblAddr.SingleLine = False
			lblAddr.Gravity = Gravity.CENTER_VERTICAL + Gravity.LEFT
			p.AddView(xAddr, CenterStart + (ColWidth*2), TopRowY, ColWidth, 45dip) ' [FIXED] Height up to 45
			
			Dim lblIssue As Label : lblIssue.Initialize("")
			Dim xIssue As B4XView = lblIssue
			xIssue.Text = "Issue: " & cIssue
			xIssue.TextColor = xui.Color_Black
			xIssue.TextSize = 13
			lblIssue.Gravity = Gravity.CENTER
			p.AddView(xIssue, CenterStart, BotRowY, CenterWidth, 25dip)
			
			Dim lblStatRight As Label : lblStatRight.Initialize("")
			Dim xStatRight As B4XView = lblStatRight
			xStatRight.Text = RightStatusIcon
			xStatRight.TextColor = RightStatusColor
			lblStatRight.Typeface = Typeface.FONTAWESOME
			xStatRight.TextSize = 40
			xStatRight.SetTextAlignment("CENTER", "CENTER")
			p.AddView(xStatRight, RightStatLeftEdge, 25dip, W_RightStat, 50dip)
		End If
		
		Dim line As B4XView = xui.CreatePanel("")
		line.Color = xui.Color_LightGray
		p.AddView(line, 0, RowHeight - 2dip, ParentWidth, 2dip)
		
		lstTodayApts.Add(p, "")
	Next
	
	lblAppsGodNum.Text = MikeCount
	lblAppsGoddessNum.Text = ErinCount
End Sub

'//<END-B4XMainPage-S05>





'//<START-B4XMainPage-S06>
' =========================================================
' ===            SECTION S06: MASTER BREAKDOWN            ===
' =========================================================

' --- SUBROUTINE DECLARATIONS (Total: 10) ---
' Public Sub CheckContactGroups
' Sub HandleListGroups(Job As HttpJob)
' Sub CreateContactGroup(GroupName As String)
' Private Sub StartScrapeProcess
' Private Sub HasAllFilesAccess As Boolean
' Private Sub RequestManageExternalStorage
' Private Sub ParseEmlFile(Dir As String, FName As String)
' Private Sub IsClientNameValid(RawName As String) As Boolean
' Public Sub ProcessNextScrapeItem
' Private Sub FormatPhone(Raw As String) As String

' --- VARIABLE DECLARATIONS (Total: 58) ---
' job (HttpJob)
' parser (JSONParser)
' jsonRoot (Map)
' groupsList (List)
' HasClient (Boolean)
' HasPreferred (Boolean)
' HasBlacklisted (Boolean)
' g (Map - For Each loop)
' gName (String)
' gResource (String)
' GroupName (String - Parameter)
' m (Map)
' json (JSONGenerator)
' VMRoot (String)
' MResult (Int)
' Files (List)
' FName (String - For Each loop)
' PhoneKey (String - For Each loop)
' p (Phone)
' jo (JavaObject)
' in (Intent)
' Dir (String - Parameter)
' Content (String)
' FromNum (String)
' CleanTranscript (String)
' mPhone (Matcher)
' mTrans (Matcher)
' ScrapeName1 (String)
' ScrapeName2 (String)
' mName (Matcher)
' PotentialName (String)
' mName2 (Matcher)
' PotentialName2 (String)
' ScrapeIssue (String)
' lCaseTrans (String)
' TimeStamp (Long)
' DateStr (String)
' FullPath (String)
' Existing (Map)
' sb (StringBuilder)
' NewMap (Map)
' RawName (String - Parameter)
' Lower (String)
' parts (String Array)
' NextItem (Map)
' Raw (String - Parameter)
' cleaned (String)

' --- SUBROUTINE CALLS (Total: 65) ---
' CheckContactGroups
' job.Initialize
' job.Download
' job.GetRequest.SetHeader
' parser.Initialize
' parser.NextObject
' jsonRoot.ContainsKey
' jsonRoot.Get
' CreateContactGroup
' json.Initialize
' job.PostString
' job.GetRequest.SetContentType
' StartScrapeProcess
' ProgressDialogHide
' Msgbox2Async
' RequestManageExternalStorage
' File.Exists
' xui.MsgboxAsync
' ScrapeMap.Initialize
' ScrapeQueue.Initialize
' File.ListFiles
' ProgressDialogShow
' Sleep
' ParseEmlFile
' ScrapeMap.Keys
' ScrapeMap.Get
' ScrapeQueue.Add
' ProcessNextScrapeItem
' jo.InitializeStatic
' jo.RunMethod
' StartActivity
' File.ReadString
' Regex.Matcher
' mPhone.Find
' mPhone.Group
' FormatPhone
' mTrans.Find
' mTrans.Group
' IsClientNameValid
' CleanTranscript.ToLowerCase
' File.LastModified
' DateTime.Date
' DateTime.Time
' File.Combine
' sb.Append
' NewMap.Initialize
' sb.Initialize
' RawName.ToLowerCase
' RawName.StartsWith
' Regex.Split
' ScrapeQueue.RemoveAt
' RefreshDashboard
' ShowScrapeManualEntry
' Raw.Replace
' Raw.SubString
' NumberFormat

' =========================================================
' ===              CONTACT GROUPS MANAGEMENT              ===
' =========================================================

Public Sub CheckContactGroups
	If OAuth2.access_token = "" Then Return

	Dim job As HttpJob : job.Initialize("ListGroups", Me)
	job.Download("https://people.googleapis.com/v1/contactGroups?pageSize=100")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Sub HandleListGroups(Job As HttpJob)
	Try
		Dim parser As JSONParser : parser.Initialize(Job.GetString)
		Dim jsonRoot As Map = parser.NextObject
		
		If jsonRoot.ContainsKey("contactGroups") = False Then Return
		
		Dim groupsList As List = jsonRoot.Get("contactGroups")

		Dim HasClient As Boolean = False
		Dim HasPreferred As Boolean = False
		Dim HasBlacklisted As Boolean = False

		For Each g As Map In groupsList
			Dim gName As String = g.GetDefault("name", "")
			Dim gResource As String = g.GetDefault("resourceName", "")

			If gName = "Standard Client" Then
				HasClient = True
				Starter.GroupID_Client = gResource
			End If
			If gName = "Preferred Client" Then
				HasPreferred = True
				Starter.GroupID_Preferred = gResource
			End If
			If gName = "Blacklisted Client" Then
				HasBlacklisted = True
				Starter.GroupID_Blacklisted = gResource
			End If
		Next

		' Create missing groups
		If HasClient = False Then CreateContactGroup("Standard Client")
		If HasPreferred = False Then CreateContactGroup("Preferred Client")
		If HasBlacklisted = False Then CreateContactGroup("Blacklisted Client")

	Catch
		Log("Error parsing contact groups: " & LastException)
	End Try
End Sub

Sub CreateContactGroup(GroupName As String)
	Dim m As Map = CreateMap("contactGroup": CreateMap("name": GroupName))
	Dim json As JSONGenerator : json.Initialize(m)
	
	Dim job As HttpJob : job.Initialize("CreateGroup", Me)
	job.PostString("https://people.googleapis.com/v1/contactGroups", json.ToString)
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

' =========================================================
' ===              VOICEMAIL SCRAPER FUNCTIONS            ===
' =========================================================

Private Sub StartScrapeProcess
	Log(">>> [SCRAPER DEBUG] StartScrapeProcess Initiated.")

	If HasAllFilesAccess = False Then
		Log("DEBUG: All Files Access NOT granted. Prompting user.")
		ProgressDialogHide
		Msgbox2Async("To read voicemail files in the .data folder, this app needs 'All Files Access'.", _
			"Permission Required", "Grant Access", "Cancel", "", Null, False)
		Wait For Msgbox_Result (MResult As Int)
		If MResult = DialogResponse.POSITIVE Then
			RequestManageExternalStorage
		End If
		Return
	End If

	Dim VMRoot As String = File.DirRootExternal & "/VisualVoiceMail/.data"
	Log(">>> [SCRAPER DEBUG] Checking Path: " & VMRoot)

	If File.Exists(VMRoot, "") = False Then
		Log("DEBUG: Folder not found despite permissions.")
		xui.MsgboxAsync("VisualVoiceMail folder not found at: " & CRLF & VMRoot, "Error")
		Return
	End If

	' [DEBUG NOTE] This ensures memory is cleared of old persistent data
	ScrapeMap.Initialize
	ScrapeQueue.Initialize
	Log(">>> [SCRAPER DEBUG] Queue memory cleared successfully.")

	Dim Files As List = File.ListFiles(VMRoot)

	If Files.IsInitialized = False Then
		Log("DEBUG: File.ListFiles returned Null.")
		xui.MsgboxAsync("Error: Could not list files. The folder might be empty or protected.", "Error")
		Return
	End If

	Log(">>> [SCRAPER DEBUG] Found " & Files.Size & " total files in folder.")

	If Files.Size = 0 Then
		xui.MsgboxAsync("Folder exists but is empty.", "No Voicemails")
		Return
	End If

	ProgressDialogShow("Parsing " & Files.Size & " voicemails...")
	Sleep(100)

	For Each FName As String In Files
		If FName.EndsWith(".eml") Then
			ParseEmlFile(VMRoot, FName)
		End If
	Next

	For Each PhoneKey As String In ScrapeMap.Keys
		ScrapeQueue.Add(ScrapeMap.Get(PhoneKey))
	Next

	ProgressDialogHide
	Log(">>> [SCRAPER DEBUG] Final Queue Size: " & ScrapeQueue.Size)

	If ScrapeQueue.Size > 0 Then
		xui.MsgboxAsync("Found " & ScrapeQueue.Size & " unique callers.", "Success")
		ProcessNextScrapeItem
	Else
		xui.MsgboxAsync("No .eml files found in folder.", "Done")
	End If
End Sub

Private Sub HasAllFilesAccess As Boolean
	Dim p As Phone
	If p.SdkVersion < 30 Then Return True

	Try
		Dim jo As JavaObject
		jo.InitializeStatic("android.os.Environment")
		Return jo.RunMethod("isExternalStorageManager", Null)
	Catch
		Log("Error checking file access: " & LastException)
		Return False
	End Try
End Sub

Private Sub RequestManageExternalStorage
	Log("DEBUG: Requesting MANAGE_APP_ALL_FILES_ACCESS_PERMISSION")
	Try
		Dim in As Intent
		in.Initialize("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", "package:" & Application.PackageName)
		StartActivity(in)
	Catch
		Log("DEBUG: Failed to launch intent: " & LastException)
		xui.MsgboxAsync("Could not open settings automatically. Go to: Settings > Apps > Special Access > All Files Access", "Manual Step")
	End Try
End Sub

' --- INTELLIGENT VOICEMAIL PARSER (Capitalization Strict + Identity Protection) ---
Private Sub ParseEmlFile(Dir As String, FName As String)
	Log("---------------------------------------------------")
	Log(">>> [SCRAPER DEBUG] Parsing File: " & FName)
	Try
		Dim Content As String = File.ReadString(Dir, FName)
		Dim FromNum As String = ""
		Dim CleanTranscript As String = ""
		
		' 1. GET PHONE NUMBER
		Dim mPhone As Matcher = Regex.Matcher("From:\s*(\+?1?\d{10})", Content)
		If mPhone.Find Then FromNum = mPhone.Group(1)
		If FromNum = "" Then 
			Log(">>> [SCRAPER DEBUG] SKIPPED: No phone number found in EML.")
			Return
		End If
		FromNum = FormatPhone(FromNum)

		' 2. GET CLEAN TRANSCRIPT
		Dim mTrans As Matcher = Regex.Matcher("X-Transcript:\s*(.*)", Content)
		If mTrans.Find Then
			CleanTranscript = mTrans.Group(1).Trim
		Else
			CleanTranscript = "No transcript available."
		End If

		' 3. SMART SCRAPE: NAMES (Strict Capitalization + Filter)
		Dim ScrapeName1 As String = ""
		Dim ScrapeName2 As String = ""
		
		' REGEX 1: Looks for "it's [Capitalized Word] [Capitalized Word]" (Ignores "Hey Michael" completely)
		Dim mName As Matcher = Regex.Matcher("(?i)(?:name is|this is|it\'?s|from)(?:\s+(?:uh|um))?\s+([A-Z][a-z]+(?:\s+[A-Z][a-z]+)?)", CleanTranscript)
		If mName.Find Then 
			Dim PotentialName As String = mName.Group(1).Trim
			If IsClientNameValid(PotentialName) Then
				ScrapeName1 = PotentialName
				Log(">>> [SCRAPER DEBUG] Matched NAME 1 (Caller): " & ScrapeName1)
			End If
		End If
		
		' REGEX 2: Looks for "with [Capitalized Word]"
		Dim mName2 As Matcher = Regex.Matcher("(?i)(?:with|and)(?:\s+(?:uh|um))?\s+([A-Z][a-z]+(?:\s+[A-Z][a-z]+)?)", CleanTranscript)
		If mName2.Find Then 
			Dim PotentialName2 As String = mName2.Group(1).Trim
			If IsClientNameValid(PotentialName2) And PotentialName2 <> ScrapeName1 Then
				ScrapeName2 = PotentialName2
				Log(">>> [SCRAPER DEBUG] Matched NAME 2 (Secondary): " & ScrapeName2)
			End If
		End If

		' 4. SMART SCRAPE: ISSUE
		Dim ScrapeIssue As String = CleanTranscript
		Dim lCaseTrans As String = CleanTranscript.ToLowerCase
		If lCaseTrans.Contains("computer") Then ScrapeIssue = "Computer Issue"
		If lCaseTrans.Contains("printer") Then ScrapeIssue = "Printer Issue"
		If lCaseTrans.Contains("internet") Or lCaseTrans.Contains("wifi") Then ScrapeIssue = "Network/Wi-Fi Issue"
		If lCaseTrans.Contains("scam") Or lCaseTrans.Contains("virus") Then ScrapeIssue = "Scam / Virus Issue"

		' 5. GET FILE PATH & TIME
		Dim TimeStamp As Long = File.LastModified(Dir, FName)
		Dim DateStr As String = DateTime.Date(TimeStamp) & " " & DateTime.Time(TimeStamp)
		Dim FullPath As String = File.Combine(Dir, FName)

		' 6. SAVE TO MAP
		If ScrapeMap.ContainsKey(FromNum) Then
			Dim Existing As Map = ScrapeMap.Get(FromNum)
			Dim sb As StringBuilder = Existing.Get("BodyBuilder")
			sb.Append(Chr(10)).Append("--- [").Append(DateStr).Append("] ---").Append(Chr(10))
			sb.Append(CleanTranscript).Append(Chr(10))
			Existing.Put("FilePath", FullPath)
		Else
			Dim NewMap As Map : NewMap.Initialize
			NewMap.Put("Phone", FromNum)
			NewMap.Put("Name", ScrapeName1)
			NewMap.Put("Name2", ScrapeName2)
			NewMap.Put("Notes", ScrapeIssue)
			NewMap.Put("FilePath", FullPath)
			
			Dim sb As StringBuilder : sb.Initialize
			sb.Append("--- [").Append(DateStr).Append("] ---").Append(Chr(10))
			sb.Append(CleanTranscript).Append(Chr(10))
			NewMap.Put("BodyBuilder", sb)
			ScrapeMap.Put(FromNum, NewMap)
		End If
		
	Catch
		Log(">>> [SCRAPER DEBUG] CRASH TRAPPED in ParseEmlFile: " & LastException)
	End Try
	Log("---------------------------------------------------")
End Sub

' [NEW] IDENTITY SHIELD: Filters out business names and personal identities
Private Sub IsClientNameValid(RawName As String) As Boolean
	If RawName = "" Then Return False
	Dim Lower As String = RawName.ToLowerCase
	
	' 1. Shield Business Keywords
	If Lower.Contains("geek") Or Lower.Contains("god") Or Lower.Contains("goddess") Then Return False
	
	' 2. Shield "Michael McLeer" (Allows "Michael Smith")
	If Lower.StartsWith("michael") Then
		If Lower = "michael" Then Return False ' Block solo Michael
		If Lower.Contains(" ") Then
			Dim parts() As String = Regex.Split(" ", Lower)
			If parts.Length > 1 And parts(1).StartsWith("mc") Then Return False
		End If
	End If
	
	' 3. Shield "Erin Napoleone" (Allows "Erin Stein")
	If Lower.StartsWith("erin") Then
		If Lower = "erin" Then Return False ' Block solo Erin
		If Lower.Contains(" ") Then
			Dim parts() As String = Regex.Split(" ", Lower)
			If parts.Length > 1 And parts(1).StartsWith("na") Then Return False
		End If
	End If
	
	Return True
End Sub

Public Sub ProcessNextScrapeItem
	If ScrapeQueue.Size = 0 Then
		xui.MsgboxAsync("All voicemails processed.", "Done")
		RefreshDashboard
		Return
	End If

	Dim NextItem As Map = ScrapeQueue.Get(0)
	ShowScrapeManualEntry(NextItem)
End Sub

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
'Total Subroutines in Section S06 recorded last edit: 0
'Total Subroutines in Section S06 recorded after this edit - 10
'Total Subroutines added in this edit - 10
'Total Subroutines removed in this edit - 0
'Difference between edits - +10
'Total Discrepancies - 0
'Total lines of code in this section prior to edit - 0
'Total lines of code in this section now - 282
'Lines added / Subtracted in this edit - +282
'//<END-B4XMainPage-S06>






'//<START-B4XMainPage-S07>
'Sub Routines in S07: 29
'Sub btnCloseout_LongClick
'Private Sub LaunchBrowser(URL As String)
'Private Sub ToggleSound
'Private Sub RunFontManager
'Private Sub TakeExpensePhoto
'Sub StartActivityForResult(i As Intent)
'Sub SaveBitmapToTemp(bmp As Bitmap)
'Private Sub ShowExpenseUI
'Private Sub ProcessReceiptOCR(Path As String)
'Sub HandleVisionOCR(Job As HttpJob)
'Sub btnSaveExpense_Click
'Sub UploadReceiptImage
'Sub HandleUploadReceipt(Job As HttpJob)
'Sub AppendExpenseToSheet(ImgLink As String)
'Sub HandleAppendExpense(Job As HttpJob)
'Sub btnCloseExpense_Click
'Private Sub CreateLabel(Txt As String) As Label
'Private Sub CreateEditText(Hint As String) As EditText
'Private Sub CreateSpinner As Spinner
'Private Sub GetDayName(Ticks As Long) As String
'Public Sub SubmitCloseOut(Container As List)
'Private Sub CloseOut_Helper_Step1(Container As List)
'Sub HandleSearchForID(Job As HttpJob)
'Private Sub CloseOut_Helper_Step2(Container As List, ResourceName As String, Etag As String)
'Private Sub CloseOut_Helper_Step3(Container As List)
'Private Sub CloseOut_Helper_Step4(Container As List)
'Private Sub CloseOut_Finished(Container As List)
'Private Sub GetMonthAbbr(DateStr As String) As String
'Public Sub JobDone_External
'Variables in S07: 111
'User (String)
'Options (List)
'i (Intent)
'i (Intent)
'jo (JavaObject)
'Out (OutputStream)
'void (Implicit)
'IsLandscape (Boolean)
'imgReceipt (ImageView)
'xImg (B4XView)
'pnlForm (B4XView)
'FormW (Int)
'ImgH (Int)
'TopY (Int)
'btnSave (Button)
'btnClose (Button)
'LastSlash (Int)
'Dir (String)
'FileName (String)
'bytes (Implicit)
'su (StringUtils)
'base64 (String)
'json (JSONGenerator)
'm (Map)
'job (HttpJob)
'parser (JSONParser)
'rootMap (Map)
'responses (List)
'fullText (String)
'resp (Map)
'MaxAmount (Double)
'mAmt (Matcher)
's (String)
'v (Double)
'DatePattern (String)
'mDate (Matcher)
'TimePattern (String)
'mTime (Matcher)
'job (HttpJob)
'parser (JSONParser)
'rootMap (Map)
'FileID (String)
'WebLink (String)
'd (String)
't (String)
'dayName (String)
'cat (String)
'nots (String)
'amt (String)
'RowData (List)
'job (HttpJob)
'valRange (Map)
'json (JSONGenerator)
'SpreadsheetID (String)
'l (Label)
'e (EditText)
's (Spinner)
'oldF (String)
's (String)
'LedgerRow (List)
'cName (String)
'cPhone (String)
'job (HttpJob)
'su (StringUtils)
'FinalURL (String)
'parser (JSONParser)
'rootMap (Map)
'Container (List)
'ResourceName (String)
'Etag (String)
'results (List)
'resItem (Map)
'person (Map)
'NewNotes (String)
'NewGroupLabel (String)
'TimeStamp (String)
'FinalNote (String)
'TargetGroupID (String)
'personMap (Map)
'json (JSONGenerator)
'job (HttpJob)
'ApptID (String)
'LedgerRow (List)
'OriginalIssue (String)
'sFee (String)
'sTime (String)
'Notes (String)
'NewDesc (String)
'patchMap (Map)
'json (JSONGenerator)
'job (HttpJob)
'DataRow (List)
'DateStr (String)
'MonthName (String)
'YearShort (String)
'SheetTabName (String)
'Range (String)
'ValueRange (Map)
'json (JSONGenerator)
'job (HttpJob)
'LedgerRow (List)
'cName (String)
'cPhone (String)
'cIssue (String)
'User (String)
'Msg (StringBuilder)
'ps (PhoneSms)
'SentTime (String)
'PopupMsg (String)
'm (Int)
'months (Implicit)
'Calls in S07: 64
'CloseOut_Helper_Step2
'SetLayoutAnimated
'StartActivityForResult
'RunMethod
'NumberFormat2
'AppendExpenseToSheet
'Date
'AddView
'Append
'PostString
'String
'GetDefault
'WriteMap
'CreatePanel
'CloseOut_Helper_Step4
'Chr
'ProgressDialogShow
'StartActivity
'Min
'CheckAndRequest
'Exists
'Array
'WriteToStream
'ShowPage
'PatchString
'ReadBytes
'startActivityForResult
'Initialize
'LoadBitmap
'months
'CloseOut_Finished
'SetBitmap
'InputList_Result
'CreateMap
'Contains
'Get
'SubString2
'ReadString
'if
'As
'Ledger
'LaunchBrowser
'Combine
'InputListAsync
'Amount
'CreateEditText
'Replace
'CloseOut_Helper_Step1
'Download
'ContainsKey
'CloseOut_Helper_Step3
'Time
'Activity_PermissionResult
'MsgboxAsync
'CreateLabel
'SetContentType
'Send
'Module
'IsNumber
'SetHeader
'PostBytes
'ToastMessageShow
'Put
'AddAll

' =========================================================
' ===            EXPENSE MODULE & YEARLY ADMIN          ===
' =========================================================

' TRIGGER: Secret Long Click on CloseOut Button
Sub btnCloseout_LongClick
	Log(">>> [DEBUG] Long Click Detected on CloseOut Button")
	
	If appSettings.IsInitialized = False Then
		appSettings.Initialize
	End If

	Dim User As String = appSettings.GetDefault("CurrentUser", "Mike")
	Dim Options As List : Options.Initialize
	
	' --- MENU: MIKE ---
	If User = "Mike" Then
		Options.AddAll(Array As String( _
			"Create New Master Ledger (Year)", _
			"View Current Ledger (Month)", _
			"View Google Calendar", _
			"View Google Contacts", _
			"View Ledger Links / API", _
			"View Expense Ledger (Year-Master)", _
			"Font Manager", _
			"Turn On/Off Sound"))
			
		InputListAsync(Options, "Geek God Admin Menu", -1, True)
		Wait For InputList_Result (Index As Int)
		If Index = DialogResponse.CANCEL Then Return
		
		Select Index
			Case 0: GenerateSmartLedger
			Case 1: LaunchBrowser("https://docs.google.com/spreadsheets/d/" & CurrentLedgerID)
			Case 2: LaunchBrowser("https://calendar.google.com")
			Case 3: LaunchBrowser("https://contacts.google.com")
			Case 4: LaunchBrowser("https://console.cloud.google.com/apis/credentials")
			Case 5: LaunchBrowser("https://docs.google.com/spreadsheets/d/1q_tx9Mw-3KKa0jAvdPq4vQ-btw6kl3GvtVBC6FORrWM")
			Case 6: RunFontManager
			Case 7: ToggleSound
		End Select
	End If
	
	' --- MENU: ERIN ---
	If User = "Erin" Then
		Options.AddAll(Array As String( _
			"Expense Module (Scan)", _
			"View Current Ledger (Month)", _
			"View Google Calendar", _
			"View Google Contacts", _
			"View Expense Ledger (Month)", _
			"View Expense Ledger (Year-Master)", _
			"Create New Expense Ledger (Year)", _
			"Font Manager", _
			"Turn On/Off Sound"))
			
		InputListAsync(Options, "Goddess Admin Menu", -1, True)
		Wait For InputList_Result (Index As Int)
		If Index = DialogResponse.CANCEL Then Return
		
		Select Index
			Case 0: TakeExpensePhoto
			Case 1: LaunchBrowser("https://docs.google.com/spreadsheets/d/" & CurrentLedgerID)
			Case 2: LaunchBrowser("https://calendar.google.com")
			Case 3: LaunchBrowser("https://contacts.google.com")
			Case 4: LaunchBrowser("https://docs.google.com/spreadsheets/d/1q_tx9Mw-3KKa0jAvdPq4vQ-btw6kl3GvtVBC6FORrWM") ' Placeholder for Month Tab Logic if needed later
			Case 5: LaunchBrowser("https://docs.google.com/spreadsheets/d/1q_tx9Mw-3KKa0jAvdPq4vQ-btw6kl3GvtVBC6FORrWM")
			Case 6: GenerateSmartLedger ' Reusing logic for now, or create separate if Expense Sheets differ structure
			Case 7: RunFontManager
			Case 8: ToggleSound
		End Select
	End If
End Sub

Private Sub LaunchBrowser(URL As String)
	If URL = "" Or URL.Contains("null") Then
		xui.MsgboxAsync("Link not available yet.", "Error")
		Return
	End If
	Try
		Dim i As Intent
		i.Initialize(i.ACTION_VIEW, URL)
		StartActivity(i)
	Catch
		Log("Browser Launch Error: " & LastException)
	End Try
End Sub

Private Sub ToggleSound
	' Simple Toggle Logic
	If appSettings.GetDefault("SoundOn", "True") = "True" Then
		appSettings.Put("SoundOn", "False")
		ToastMessageShow("Sound Effects: OFF", False)
	Else
		appSettings.Put("SoundOn", "True")
		ToastMessageShow("Sound Effects: ON", False)
	End If
	File.WriteMap(File.DirInternal, "settings.map", appSettings)
End Sub

Private Sub RunFontManager
	' Placeholder for the new module you mentioned
	xui.MsgboxAsync("Font Manager Module coming soon.", "Feature")
End Sub

Private Sub TakeExpensePhoto
	ExpensePhotoPath = ""
	Dim i As Intent
	i.Initialize("android.media.action.IMAGE_CAPTURE", "")
	
	ExpensePhotoPath = File.Combine(File.DirInternal, "expense_temp.jpg")
	
	' Launch via Inline Java Helper
	StartActivityForResult(i)
End Sub

Sub StartActivityForResult(i As Intent)
	Dim jo As JavaObject = Me
	jo.RunMethod("StartActivityForResult", Array(i))
End Sub

Sub SaveBitmapToTemp(bmp As Bitmap)
	Dim Out As OutputStream = File.OpenOutput(File.DirInternal, "temp_receipt.jpg", False)
	bmp.WriteToStream(Out, 100, "JPEG")
	Out.Close
	ExpensePhotoPath = File.Combine(File.DirInternal, "temp_receipt.jpg")
End Sub

#If JAVA
import android.content.Intent;
public void StartActivityForResult(Intent intent) {
	if (ba.activity != null) {
		ba.activity.startActivityForResult(intent, 123);
	}
}
#End If

' UI: Split Screen Overlay
Private Sub ShowExpenseUI
	' Initialize Default Variables (Current Time as Fallback)
	ExtractedDate = DateTime.Date(DateTime.Now)
	ExtractedTime = DateTime.Time(DateTime.Now)
	
	' Create Overlay
	ExpensePanel = xui.CreatePanel("ExpensePanel")
	ExpensePanel.Color = xui.Color_White
	Root.AddView(ExpensePanel, 0, 0, Root.Width, Root.Height)
	
	Dim IsLandscape As Boolean = (Root.Width > Root.Height)
	
	' 1. Image View
	Dim imgReceipt As ImageView : imgReceipt.Initialize("")
	Dim xImg As B4XView = imgReceipt
	xImg.SetBitmap(xui.LoadBitmap(File.DirInternal, "temp_receipt.jpg"))
	ExpensePanel.AddView(xImg, 0, 0, 0, 0)
	
	' 2. Form Container
	Dim pnlForm As B4XView = xui.CreatePanel("")
	ExpensePanel.AddView(pnlForm, 0, 0, 0, 0)
	
	If IsLandscape Then
		' Split: Form Left (60%), Image Right (40%)
		Dim FormW As Int = Root.Width * 0.60
		xImg.SetLayoutAnimated(0, FormW + 10dip, 10dip, Root.Width - FormW - 20dip, Root.Height - 20dip)
		pnlForm.SetLayoutAnimated(0, 0, 0, FormW, Root.Height)
	Else
		' Stack: Image Top (40%), Form Bottom (60%)
		Dim ImgH As Int = Root.Height * 0.40
		xImg.SetLayoutAnimated(0, 10dip, 10dip, Root.Width - 20dip, ImgH - 20dip)
		pnlForm.SetLayoutAnimated(0, 0, ImgH, Root.Width, Root.Height - ImgH)
	End If
	
	' Build Form Fields
	Dim TopY As Int = 10dip
	
	ExpenseDateLabel = CreateLabel("Date: " & ExtractedDate & " " & ExtractedTime)
	pnlForm.AddView(ExpenseDateLabel, 10dip, TopY, pnlForm.Width - 20dip, 30dip)
	TopY = TopY + 40dip
	
	ExpenseCategorySpinner = CreateSpinner
	ExpenseCategorySpinner.AddAll(Array As String("Fuel", "Equipment", "Supplies", "Software", "Advertising", "Meals", "Travel", "Other"))
	pnlForm.AddView(ExpenseCategorySpinner, 10dip, TopY, pnlForm.Width - 20dip, 50dip)
	TopY = TopY + 60dip
	
	ExpenseAmount = CreateEditText("Amount ($)")
	pnlForm.AddView(ExpenseAmount, 10dip, TopY, pnlForm.Width - 20dip, 50dip)
	TopY = TopY + 60dip
	
	ExpenseNotes = CreateEditText("Notes / Description")
	pnlForm.AddView(ExpenseNotes, 10dip, TopY, pnlForm.Width - 20dip, 100dip)
	TopY = TopY + 110dip
	
	Dim btnSave As Button : btnSave.Initialize("btnSaveExpense")
	btnSave.Text = "SAVE EXPENSE"
	pnlForm.AddView(btnSave, 10dip, TopY, pnlForm.Width - 20dip, 60dip)
	TopY = TopY + 70dip
	
	Dim btnClose As Button : btnClose.Initialize("btnCloseExpense")
	btnClose.Text = "CANCEL"
	pnlForm.AddView(btnClose, 10dip, TopY, pnlForm.Width - 20dip, 40dip)
End Sub

' OCR: Google Cloud Vision API
Private Sub ProcessReceiptOCR(Path As String)
	ProgressDialogShow("Scanning Receipt via Google Vision...")
	
	' Extract directory and filename from full path
	Dim LastSlash As Int = Path.LastIndexOf("/")
	Dim Dir As String = Path.SubString2(0, LastSlash)
	Dim FileName As String = Path.SubString(LastSlash + 1)
	
	' Convert Image to Base64 using the Path parameter
	Dim bytes() As Byte = File.ReadBytes(Dir, FileName)
	Dim su As StringUtils
	Dim base64 As String = su.EncodeBase64(bytes)
	
	' Construct JSON Request
	Dim json As JSONGenerator
	Dim m As Map = CreateMap("requests": Array(CreateMap( _
		"image": CreateMap("content": base64), _
		"features": Array(CreateMap("type": "TEXT_DETECTION")) _
	)))
	json.Initialize(m)
	
	Dim job As HttpJob : job.Initialize("VisionOCR", Me)
	job.PostString("https://vision.googleapis.com/v1/images:annotate", json.ToString)
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Sub HandleVisionOCR(Job As HttpJob)
	ProgressDialogHide
	If Job.Success = False Then
		Log("OCR Failed: " & Job.ErrorMessage)
		xui.MsgboxAsync("OCR Failed. Please enter details manually.", "Error")
		Job.Release
		Return
	End If

	Dim parser As JSONParser : parser.Initialize(Job.GetString)
	Dim rootMap As Map = parser.NextObject
	Dim responses As List = rootMap.Get("responses")
	Dim fullText As String = ""
	
	If responses.Size > 0 Then
		Dim resp As Map = responses.Get(0)
		If resp.ContainsKey("fullTextAnnotation") Then
			fullText = resp.Get("fullTextAnnotation").As(Map).Get("text")
		End If
	End If
	
	' *** DEBUG LOG ***
	Log("RAW OCR TEXT: " & fullText)
	
	If fullText = "" Then
		xui.MsgboxAsync("No text detected.", "OCR Result")
		Job.Release
		Return
	End If
	
	' --- 1. AMOUNT DETECTION ---
	Dim MaxAmount As Double = 0
	Dim mAmt As Matcher = Regex.Matcher("\$?\d+\.\d{2}", fullText)
	Do While mAmt.Find
		Dim s As String = mAmt.Match.Replace("$", "")
		If IsNumber(s) Then
			Dim v As Double = s
			If v > MaxAmount Then MaxAmount = v
		End If
	Loop
	If MaxAmount > 0 Then
		ExpenseAmount.Text = NumberFormat2(MaxAmount, 1, 2, 2, False)
	End If
	
	' --- 2. DATE DETECTION ---
	Dim DatePattern As String = "\b(\d{1,2}[/-]\d{1,2}[/-]\d{2,4})\b"
	Dim mDate As Matcher = Regex.Matcher(DatePattern, fullText)
	If mDate.Find Then
		ExtractedDate = mDate.Match
		Log("OCR Date Found: " & ExtractedDate)
	End If
	
	' --- 3. TIME DETECTION ---
	Dim TimePattern As String = "\b(\d{1,2}:\d{2}(?:\s?[AaPp][Mm])?)\b"
	Dim mTime As Matcher = Regex.Matcher(TimePattern, fullText)
	If mTime.Find Then
		ExtractedTime = mTime.Match
		Log("OCR Time Found: " & ExtractedTime)
	End If
	
	ExpenseDateLabel.Text = "Date: " & ExtractedDate & " | Time: " & ExtractedTime
	ExpenseNotes.Text = fullText.SubString2(0, Min(fullText.Length, 100)).Replace(Chr(10), " ")
	
	ToastMessageShow("Scanned: $" & ExpenseAmount.Text, False)
	Job.Release
End Sub

' SAVE: Upload & Append
Sub btnSaveExpense_Click
	If ExpenseAmount.Text = "" Then
		xui.MsgboxAsync("Please enter an amount.", "Error")
		Return
	End If
	
	ProgressDialogShow("Uploading Receipt & Updating Ledger...")
	UploadReceiptImage
End Sub

Sub UploadReceiptImage
	Dim job As HttpJob : job.Initialize("UploadReceipt", Me)
	
	' Upload to Google Drive (Root Folder for now)
	job.PostBytes("https://www.googleapis.com/upload/drive/v3/files?uploadType=media", File.ReadBytes(File.DirInternal, "temp_receipt.jpg"))
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
	job.GetRequest.SetContentType("image/jpeg")
End Sub

Sub HandleUploadReceipt(Job As HttpJob)
	If Job.Success = False Then
		ProgressDialogHide
		xui.MsgboxAsync("Image Upload Failed: " & Job.ErrorMessage, "Error")
		Job.Release
		Return
	End If

	Dim parser As JSONParser : parser.Initialize(Job.GetString)
	Dim rootMap As Map = parser.NextObject
	Dim FileID As String = rootMap.Get("id")
	
	' Construct Web Link
	Dim WebLink As String = "https://drive.google.com/file/d/" & FileID
	
	' 2. Append to Sheet
	AppendExpenseToSheet(WebLink)
	Job.Release
End Sub

Sub AppendExpenseToSheet(ImgLink As String)
	' Template Columns:
	' A=Day, B=Date, C=Time, D=Expense(Cat), E=Notes, F=rLink, G=Amount
	
	' USE EXTRACTED DATA (OCR)
	Dim d As String = ExtractedDate
	Dim t As String = ExtractedTime
	Dim dayName As String = GetDayName(DateTime.Now)
	
	Dim cat As String = ExpenseCategorySpinner.SelectedItem
	Dim nots As String = ExpenseNotes.Text
	Dim amt As String = ExpenseAmount.Text
	
	' Row Data
	Dim RowData As List = Array(dayName, d, t, cat, nots, ImgLink, amt)
	
	Dim job As HttpJob : job.Initialize("AppendExpense", Me)
	Dim valRange As Map = CreateMap("values": Array(RowData))
	Dim json As JSONGenerator : json.Initialize(valRange)
	
	' Target: The Expense Ledger Template ID
	Dim SpreadsheetID As String = "1q_tx9Mw-3KKa0jAvdPq4vQ-btw6kl3GvtVBC6FORrWM"
	Log(">>> [EXPENSE-LEDGER] Target Spreadsheet ID: " & SpreadsheetID)
	
	' Append to Sheet1 (A13 starts the data block in your template)
	job.PostString("https://sheets.googleapis.com/v4/spreadsheets/" & SpreadsheetID & "/values/A13:append?valueInputOption=USER_ENTERED", json.ToString)
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
	job.GetRequest.SetContentType("application/json")
End Sub

Sub HandleAppendExpense(Job As HttpJob)
	ProgressDialogHide
	If Job.Success Then
		xui.MsgboxAsync("Expense Saved Successfully!", "Success")
		ExpensePanel.RemoveViewFromParent
	Else
		xui.MsgboxAsync("Sheet Update Failed: " & Job.ErrorMessage, "Error")
	End If
	Job.Release
End Sub

Sub btnCloseExpense_Click
	ExpensePanel.RemoveViewFromParent
End Sub

' Helper Views
Private Sub CreateLabel(Txt As String) As Label
	Dim l As Label : l.Initialize("")
	l.Text = Txt
	l.TextColor = xui.Color_Black
	l.TextSize = 16
	Return l
End Sub

Private Sub CreateEditText(Hint As String) As EditText
	Dim e As EditText : e.Initialize("")
	e.Hint = Hint
	e.TextColor = xui.Color_Black
	e.HintColor = xui.Color_Gray
	e.Color = xui.Color_White
	e.InputType = e.INPUT_TYPE_TEXT
	Return e
End Sub

Private Sub CreateSpinner As Spinner
	Dim s As Spinner : s.Initialize("")
	s.TextColor = xui.Color_Black
	s.DropdownBackgroundColor = xui.Color_White
	Return s
End Sub

Private Sub GetDayName(Ticks As Long) As String
	Dim oldF As String = DateTime.DateFormat
	DateTime.DateFormat = "EEEE"
	Dim s As String = DateTime.Date(Ticks)
	DateTime.DateFormat = oldF
	Return s
End Sub

' =========================================================
' ===            CLOSE OUT LOGIC (THE DAISY CHAIN)      ===
' =========================================================

' Entry Point from CloseOut Page
Public Sub SubmitCloseOut(Container As List)
	' 1. STOP TIMER
	JobTimer.Enabled = False
	
	B4XPages.ShowPage("MainPage")
	ProgressDialogShow("Processing Close Out... Please Wait.")
	
	' 2. STOP GPS /DISABLE BUTTONS
	ActiveAppointmentID = ""
	ActiveJobMap.Clear
	btnCloseout.Text = "Job Closed"
	btnCloseout.Color = xui.Color_Gray
	btnCloseout.Enabled = False
	
	' 3. START THE CHAIN
	CloseOut_Helper_Step1(Container)
End Sub

' Step 1: Check for Contact ID. If missing, search for it.
Private Sub CloseOut_Helper_Step1(Container As List)
	Dim LedgerRow As List = Container.Get(0)
	' Name is index 2, Phone is index 4 in Aligned LedgerRow
	Dim cName As String = LedgerRow.Get(2)
	Dim cPhone As String = LedgerRow.Get(4)
	
	Log("Step 1: Searching for Contact ID for " & cName)
	Dim job As HttpJob : job.Initialize("SearchContactForID", Me)
	job.Tag = Container
	Dim su As StringUtils
	Dim FinalURL As String = "https://people.googleapis.com/v1/people:searchContacts?query=" & su.EncodeUrl(cPhone, "UTF8") & "&readMask=names,phoneNumbers,metadata"
	job.Download(FinalURL)
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

' Handle Search Result -> Move to Step 2
Sub HandleSearchForID(Job As HttpJob)
	Dim parser As JSONParser : parser.Initialize(Job.GetString)
	Dim rootMap As Map = parser.NextObject
	Dim Container As List = Job.Tag
	Dim ResourceName As String = ""
	Dim Etag As String = ""
	
	If rootMap.ContainsKey("results") Then
		Dim results As List = rootMap.Get("results")
		If results.Size > 0 Then
			Dim resItem As Map = results.Get(0)
			Dim person As Map = resItem.Get("person")
			ResourceName = person.Get("resourceName")
			Etag = person.Get("etag")
		End If
	End If
	
	If ResourceName = "" Then
		Log("WARNING: Could not find Google Contact ID. Skipping Contact Update.")
		CloseOut_Helper_Step3(Container)
	Else
		CloseOut_Helper_Step2(Container, ResourceName, Etag)
	End If
End Sub

' Step 2: Update Contact Notes & Group
Private Sub CloseOut_Helper_Step2(Container As List, ResourceName As String, Etag As String)
	Dim NewNotes As String = Container.Get(1)
	Dim NewGroupLabel As String = Container.Get(3)
	
	' Timestamp the note
	DateTime.DateFormat = "MM/dd/yyyy h:mm a"
	Dim TimeStamp As String = DateTime.Date(DateTime.Now)
	Dim FinalNote As String = "VISIT " & TimeStamp & ":" & CRLF & NewNotes & CRLF & "----------------"
	
	Dim TargetGroupID As String = Starter.GroupID_Client
	If NewGroupLabel = "Blacklisted" Then TargetGroupID = Starter.GroupID_Blacklisted
	If NewGroupLabel = "Preferred" Then TargetGroupID = Starter.GroupID_Preferred
	
	Dim personMap As Map : personMap.Initialize
	personMap.Put("etag", Etag)
	personMap.Put("biographies", Array(CreateMap("value": FinalNote, "contentType": "TEXT_PLAIN")))
	personMap.Put("memberships", Array(CreateMap("contactGroupMembership": CreateMap("contactGroupResourceName": TargetGroupID))))
	
	Dim json As JSONGenerator : json.Initialize(personMap)
	Dim job As HttpJob : job.Initialize("UpdateContactAfterClose", Me)
	job.Tag = Container
	job.PatchString("https://people.googleapis.com/v1/" & ResourceName & ":updateContact?updatePersonFields=biographies,memberships", json.ToString)
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

' Step 3: Update Calendar Color AND Description
Private Sub CloseOut_Helper_Step3(Container As List)
	Dim ApptID As String = Container.Get(2)
	
	If ApptID = "" Then
		Log("WARNING: No Appt ID. Skipping Calendar Update.")
		CloseOut_Helper_Step4(Container)
		Return
	End If
	
	' PRESERVE ORIGINAL ISSUE
	Dim LedgerRow As List = Container.Get(0)
	Dim OriginalIssue As String = LedgerRow.Get(5)
	Dim sFee As String = LedgerRow.Get(7)
	Dim sTime As String = LedgerRow.Get(8)
	
	' Append Resolution Notes to Description
	Dim Notes As String = Container.Get(1)
	Dim NewDesc As String = "Issue: " & OriginalIssue & CRLF & "Resolution: " & Notes & CRLF & "Fee: " & sFee & " | Time: " & sTime
	
	Dim patchMap As Map = CreateMap("colorId": "8", "description": NewDesc)
	Dim json As JSONGenerator : json.Initialize(patchMap)
	
	Dim job As HttpJob : job.Initialize("UpdateCalendarColor", Me)
	job.Tag = Container
	job.PatchString("https://www.googleapis.com/calendar/v3/calendars/primary/events/" & ApptID, json.ToString)
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

' Step 4: Append to Ledger Sheet
Private Sub CloseOut_Helper_Step4(Container As List)
	Dim DataRow As List = Container.Get(0)
	
	Dim DateStr As String = DataRow.Get(1)
	Dim MonthName As String = GetMonthAbbr(DateStr)
	Dim YearShort As String = DateStr.SubString(8)
	Dim SheetTabName As String = MonthName & " " & YearShort
	
	Dim Range As String = SheetTabName & "!A:G" ' Ensure it covers all columns
	Dim ValueRange As Map = CreateMap("values": Array(DataRow))
	Dim json As JSONGenerator : json.Initialize(ValueRange)
	
	Dim job As HttpJob : job.Initialize("AppendToLedger", Me)
	job.Tag = Container
	
	If CurrentLedgerID = "" Then
		If File.Exists(File.DirInternal, "ledger_id_2026.txt") Then
			CurrentLedgerID = File.ReadString(File.DirInternal, "ledger_id_2026.txt")
		End If
	End If
	
	If CurrentLedgerID = "" Then
		Log(">>> [CLOSEOUT-LEDGER] Error: CurrentLedgerID is missing.")
		CloseOut_Finished(Container)
		Return
	End If
	
	Log(">>> [CLOSEOUT-LEDGER] Appending to Ledger ID: " & CurrentLedgerID)
	Log(">>> [CLOSEOUT-LEDGER] Target Range: " & Range)
	
	job.PostString("https://sheets.googleapis.com/v4/spreadsheets/" & CurrentLedgerID & "/values/" & Range & ":append?valueInputOption=USER_ENTERED", json.ToString)
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

' Final Step: SMS (Silent) & Refresh
Private Sub CloseOut_Finished(Container As List)
	ProgressDialogHide
	
	'RESET BUTTON STATE
	btnCloseout.Text = "No Apt Started"
	btnCloseout.Color = xui.Color_Red
	btnCloseout.TextColor = xui.Color_White
	btnCloseout.Enabled = False
	
	RefreshDashboard
	
	' PREPARE SMS
	Dim LedgerRow As List = Container.Get(0)
	Dim cName As String = LedgerRow.Get(2)
	Dim cPhone As String = LedgerRow.Get(4)
	Dim cIssue As String = LedgerRow.Get(5)
	Dim User As String = appSettings.GetDefault("CurrentUser", "Geek God")
	
	Dim Msg As StringBuilder : Msg.Initialize
	Msg.Append(cName).Append(Chr(10))
	Msg.Append("Thank you for trusting me to handle your ").Append(cIssue).Append(" issue today and for your generosity.").Append(Chr(10))
	Msg.Append("Do not hesitate to call again for any of your tech service needs.").Append(Chr(10)).Append(Chr(10))
	Msg.Append("*Side note: Remember if ever you feel panicked after receiving a correspondence of any kind especially coming from a major company: Amazon, Ebay, Social Security, IRS... ect").Append(Chr(10))
	Msg.Append("this is your first clue that you are an attempted victim of a social engineering hack.").Append(Chr(10))
	Msg.Append("None of these organizations would ever send you correspondence such as that to make you panicked. IF you ever question if something is legit, Don't act! Call us. WE will tell you if it is real or not. This is a free service only a call away because we hate scammers and want to keep our clients and the public in general safe.").Append(Chr(10)).Append(Chr(10))
	Msg.Append("Please please do this for me:").Append(Chr(10)).Append(Chr(10))
	
	' [FIXED] Use Erin's link if she's the user
	If User = "Erin" Then
		Msg.Append("https://bit.ly/writenextdoorreviewgoddess").Append(Chr(10))
	Else
		Msg.Append("https://bit.ly/writenextdoorreview").Append(Chr(10))
	End If
	
	Msg.Append("click this link").Append(Chr(10)).Append(Chr(10))
	Msg.Append("Toggle me as a Fav on Nextdoor.").Append(Chr(10))
	Msg.Append("Then click ""Recommendations""").Append(Chr(10))
	Msg.Append("Under the heading on that page that says ""write your recommendation""").Append(Chr(10))
	Msg.Append("Please type an honest review of my time with you today and the value you felt I brought into your life by fixing your issue.").Append(Chr(10))
	Msg.Append("It is really important to the continued success of my business.").Append(Chr(10)).Append(Chr(10))
	Msg.Append("Please, if you come across anybody who needs my tech services, a referral would be much appreciated. I will offer them the same great service I gave to you.").Append(Chr(10)).Append(Chr(10))
	Msg.Append("Lastly,").Append(Chr(10))
	Msg.Append("Last week this same message was sent to at least 40 people and MAYBE 2 people left me a review post on Nextdoor if that and lately my business has been suffering for it.").Append(Chr(10))
	Msg.Append("Please don't forget to review me, as that's where I have been obtaining all of my clients. It's most likely how you found me. This is so important to my continued success.").Append(Chr(10)).Append(Chr(10))
	Msg.Append("Your generous compensation to me today will help feed my family tonight however the moment you take to review me on Nextdoor allows for them to keep eating tomorrow.").Append(Chr(10))
	Msg.Append("Its that important.").Append(Chr(10)).Append(Chr(10))
	Msg.Append("Thank you again.").Append(Chr(10))
	Msg.Append(User)
	
	' SEND SMS TO CLIENT'S PHONE
	Dim ps As PhoneSms
	
	' Check Permission at Runtime
	rp.CheckAndRequest(rp.PERMISSION_SEND_SMS)
	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
	If Result Then
		Try
			ps.Send(cPhone, Msg.ToString)
			Dim SentTime As String = DateTime.Time(DateTime.Now)
			Dim PopupMsg As String = "Appointment follow-up / thank you text sent to " & cName & " at " & SentTime & " for your completion of " & cIssue
			xui.MsgboxAsync(PopupMsg, "SMS Sent")
		Catch
			xui.MsgboxAsync("Job Closed, but SMS Failed: " & LastException, "Partial Success")
		End Try
	Else
		xui.MsgboxAsync("Job Closed, but SMS Permission Denied.", "Partial Success")
	End If
End Sub

Private Sub GetMonthAbbr(DateStr As String) As String
	Dim m As Int = DateStr.SubString2(0, 2)
	Dim months() As String = Array As String("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
	Return months(m - 1)
End Sub

' =========================================================
' ===              EXTERNAL CLOSEOUT TRIGGER            ===
' =========================================================

Public Sub JobDone_External
	ActiveAppointmentID = ""
	ActiveArrivalTime = 0
	ActiveJobMap.Initialize
	JobTimer.Enabled = False

	btnCloseout.Color = xui.Color_Red
	btnCloseout.TextColor = xui.Color_White
	btnCloseout.Text = "No Apt Started"
	btnCloseout.Enabled = False

	lblStatus.Text = "Status: Connected"
	RefreshDashboard
	B4XPages.ShowPage("B4XMainPage")

	xui.MsgboxAsync("Job closed out successfully!", "Complete")
End Sub

'Total subroutines prior to edit: 26
'Total Subroutines added or subtracted this edit: +3
'Total Subroutines after this edit: 29
'Discrepancies: 0
'Total source code lines prior to edit: 442
'Total source code lines added/subtracted this edit: +57
'Total source code lines after the edit: 499
'Discrepancies: 0
'//<END-B4XMainPage-S07>





'//<START-B4XMainPage-S08>
' =========================================================
' ===            SECTION S08: MASTER BREAKDOWN            ===
' =========================================================

' --- SUBROUTINE DECLARATIONS (Total: 12) ---
' Sub HandleSearchContact(Job As HttpJob)
' Sub FetchAllConnections
' Sub HandleFetchAllConnections(Job As HttpJob)
' Sub ShowFuzzyOptions
' Private Sub LevenshteinDistance(s As String, t As String) As Int
' Sub ParseAndLoadProfile(person As Map)
' Public Sub StartLedgerQueue(Name As String)
' Sub HandleSearchLedgerFiles(Job As HttpJob)
' Sub ProcessNextLedger
' Sub HandleGetSheetMetadata(Job As HttpJob)
' Sub BatchFetchTabs(Tabs As List, ledgerID As String)
' Sub BatchGetLedger(Job As HttpJob)

' --- VARIABLE DECLARATIONS (Total: 50) ---
' Job (HttpJob - Parameter)
' parser (JSONParser)
' rootMap (Map)
' results (List)
' resItem (Map)
' person (Map)
' job (HttpJob)
' connections (List)
' Target (String)
' FoundExact (Boolean)
' numericTarget (String)
' pName (String)
' names (List)
' pPhone (String)
' phones (List)
' pAddr (String)
' addrs (List)
' cleanPhone (String)
' dist (Int)
' Options (List)
' key (String - For Each loop)
' Index (Int - Wait For Result)
' selectedName (String)
' s (String - Parameter)
' t (String - Parameter)
' n (Int)
' m (Int)
' d (Int 2D Array)
' cost (Int)
' min1 (Int)
' min2 (Int)
' min3 (Int)
' bios (List)
' memberships (List)
' mem (Map - For Each loop)
' gid (String)
' Name (String - Parameter)
' q (String)
' su (StringUtils)
' files (List)
' f (Map - For Each loop)
' fID (String)
' sheets (List)
' sTab (Map - For Each loop)
' title (String)
' tabs (List)
' ledgerID (String)
' sb (StringBuilder)
' range (String)
' currentSpend (Double)

' --- SUBROUTINE CALLS (Total: 58) ---
' Log
' parser.Initialize
' parser.NextObject
' rootMap.ContainsKey
' rootMap.Get
' ParseAndLoadProfile
' FetchAllConnections
' job.Initialize
' job.Download
' job.GetRequest.SetHeader
' FuzzyCandidates.Clear
' CurrentSearchQuery.ToLowerCase
' Target.Replace
' person.ContainsKey
' names.Get
' phones.Get
' addrs.Get
' cleanPhone.Contains
' LevenshteinDistance
' FuzzyCandidates.Put
' ShowFuzzyOptions
' CallSub (searchScreen, "ShowProfileNotFound")
' Options.Initialize
' FuzzyCandidates.Keys
' Options.Add
' InputListAsync
' Options.Get
' FuzzyCandidates.Get
' s.CharAt
' Min
' TempProfile.Initialize
' TempProfile.Put
' Starter.GroupID_Blacklisted
' StartLedgerQueue
' LedgerQueue.Initialize
' IssuesHistory.Initialize
' su.EncodeUrl
' LedgerQueue.Add
' ProcessNextLedger
' LedgerQueue.Size
' NumberFormat2
' CallSub2 (searchScreen, "ShowProfile")
' LedgerQueue.RemoveAt
' job.Download
' Job.Tag
' BatchFetchTabs
' sb.Initialize
' sb.Append

' =========================================================
' ===            SEARCH & CONNECTION HANDLERS             ===
' =========================================================

Sub HandleSearchContact(Job As HttpJob)
	Dim parser As JSONParser : parser.Initialize(Job.GetString)
	Dim rootMap As Map = parser.NextObject
	If rootMap.ContainsKey("results") Then
		Dim results As List = rootMap.Get("results")
		If results.Size > 0 Then
			Dim resItem As Map = results.Get(0)
			Dim person As Map = resItem.Get("person")
			ParseAndLoadProfile(person)
			Return
		End If
	End If
	Log("DEBUG: Search returned 0 results. Triggering Manual Fetch Fallback...")
	FetchAllConnections
End Sub

Sub FetchAllConnections
	Dim job As HttpJob : job.Initialize("FetchAllConnections", Me)
	job.Download("https://people.googleapis.com/v1/people/me/connections?personFields=names,phoneNumbers,addresses,biographies,memberships&pageSize=2000")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Sub HandleFetchAllConnections(Job As HttpJob)
	Dim parser As JSONParser : parser.Initialize(Job.GetString)
	Dim rootMap As Map = parser.NextObject
	FuzzyCandidates.Clear
	
	If rootMap.ContainsKey("connections") Then
		Dim connections As List = rootMap.Get("connections")
		Dim Target As String = CurrentSearchQuery.ToLowerCase
		Dim FoundExact As Boolean = False
		Dim numericTarget As String = Target.Replace("(", "").Replace(")", "").Replace("-", "").Replace(" ", "")
		
		For Each person As Map In connections
			Dim pName As String = ""
			If person.ContainsKey("names") Then
				Dim names As List = person.Get("names")
				If names.Size > 0 Then pName = names.Get(0).As(Map).GetDefault("displayName", "")
			End If
			
			Dim pPhone As String = ""
			If person.ContainsKey("phoneNumbers") Then
				Dim phones As List = person.Get("phoneNumbers")
				If phones.Size > 0 Then pPhone = phones.Get(0).As(Map).Get("value")
			End If
			Dim pAddr As String = ""
			If person.ContainsKey("addresses") Then
				Dim addrs As List = person.Get("addresses")
				If addrs.Size > 0 Then pAddr = addrs.Get(0).As(Map).Get("formattedValue")
			End If
			
			Dim cleanPhone As String = pPhone.Replace("(", "").Replace(")", "").Replace("-", "").Replace(" ", "")
			If pName.ToLowerCase.Contains(Target) Or (numericTarget <> "" And cleanPhone.Contains(numericTarget)) Or pAddr.ToLowerCase.Contains(Target) Then
				Log("DEBUG: Manual Match Found: " & pName)
				ParseAndLoadProfile(person)
				FoundExact = True
				Return
			End If
			
			Dim dist As Int = LevenshteinDistance(Target, pName.ToLowerCase)
			If dist <= 3 Then FuzzyCandidates.Put(pName, person)
		Next
		
		If FoundExact = False Then
			If FuzzyCandidates.Size > 0 Then
				ShowFuzzyOptions
			Else
				CallSub(searchScreen, "ShowProfileNotFound")
			End If
		End If
	Else
		CallSub(searchScreen, "ShowProfileNotFound")
	End If
End Sub

Sub ShowFuzzyOptions
	Dim Options As List : Options.Initialize
	For Each key As String In FuzzyCandidates.Keys
		Options.Add(key)
	Next
	InputListAsync(Options, "No '" & CurrentSearchQuery & "' found. Did you mean?", -1, True)
	Wait For InputList_Result (Index As Int)
	If Index <> -3 Then
		Dim selectedName As String = Options.Get(Index)
		Dim person As Map = FuzzyCandidates.Get(selectedName)
		ParseAndLoadProfile(person)
	Else
		CallSub(searchScreen, "ShowProfileNotFound")
	End If
End Sub

Private Sub LevenshteinDistance(s As String, t As String) As Int
	Dim n As Int = s.Length
	Dim m As Int = t.Length
	If n = 0 Then Return m
	If m = 0 Then Return n
	Dim d(n + 1, m + 1) As Int
	For i = 0 To n
		d(i, 0) = i
	Next
	For j = 0 To m
		d(0, j) = j
	Next
	For i = 1 To n
		For j = 1 To m
			Dim cost As Int
			If s.CharAt(i - 1) = t.CharAt(j - 1) Then cost = 0 Else cost = 1
			Dim min1 As Int = d(i - 1, j) + 1
			Dim min2 As Int = d(i, j - 1) + 1
			Dim min3 As Int = d(i - 1, j - 1) + cost
			d(i, j) = Min(min1, Min(min2, min3))
		Next
	Next
	Return d(n, m)
End Sub

Sub ParseAndLoadProfile(person As Map)
	TempProfile.Initialize
	TempProfile.Put("ResourceName", person.Get("resourceName"))
	TempProfile.Put("Etag", person.Get("etag"))
	
	Dim pName As String = ""
	If person.ContainsKey("names") Then
		Dim names As List = person.Get("names")
		If names.Size > 0 Then pName = names.Get(0).As(Map).GetDefault("displayName", "")
	End If
	TempProfile.Put("Name", pName)
	
	If person.ContainsKey("phoneNumbers") Then
		Dim phones As List = person.Get("phoneNumbers")
		If phones.Size > 0 Then TempProfile.Put("Phone", phones.Get(0).As(Map).Get("value")) Else TempProfile.Put("Phone", "No Phone")
	Else
		TempProfile.Put("Phone", "No Phone")
	End If
	
	If person.ContainsKey("addresses") Then
		Dim addrs As List = person.Get("addresses")
		If addrs.Size > 0 Then TempProfile.Put("Address", addrs.Get(0).As(Map).Get("formattedValue")) Else TempProfile.Put("Address", "No Address")
	Else
		TempProfile.Put("Address", "No Address")
	End If
	
	If person.ContainsKey("biographies") Then
		Dim bios As List = person.Get("biographies")
		If bios.Size > 0 Then TempProfile.Put("Notes", bios.Get(0).As(Map).Get("value")) Else TempProfile.Put("Notes", "")
	Else
		TempProfile.Put("Notes", "")
	End If
	
	TempProfile.Put("IsBlacklisted", False)
	TempProfile.Put("IsPreferred", False)
	If person.ContainsKey("memberships") Then
		Dim memberships As List = person.Get("memberships")
		For Each mem As Map In memberships
			If mem.ContainsKey("contactGroupMembership") Then
				Dim gid As String = mem.Get("contactGroupMembership").As(Map).Get("contactGroupResourceName")
				If gid = Starter.GroupID_Blacklisted Then TempProfile.Put("IsBlacklisted", True)
				If gid = Starter.GroupID_Preferred Then TempProfile.Put("IsPreferred", True)
			End If
		Next
	End If
	StartLedgerQueue(pName)
End Sub

' =========================================================
' ===            LEDGER GENERATION LOGIC (HEAVY)        ===
' =========================================================

Public Sub StartLedgerQueue(Name As String)
	LedgerQueue.Initialize
	IssuesHistory.Initialize
	TempProfile.Put("RawTotalSpend", 0.0)
	TempProfile.Put("RawVisitCount", 0)
	TempProfile.Put("LastVisit", "New Client")
	
	Log(">>> [LEDGER-DEBUG] StartLedgerQueue: Searching for 'Geek God Ledger' in Drive...")
	
	Dim job As HttpJob : job.Initialize("SearchLedgerFiles", Me)
	Dim q As String = "name contains 'Geek God Ledger' and trashed = false"
	Dim su As StringUtils
	job.Download("https://www.googleapis.com/drive/v3/files?q=" & su.EncodeUrl(q, "UTF8"))
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Sub HandleSearchLedgerFiles(Job As HttpJob)
	If Job.Success = False Then
		Log(">>> [LEDGER-DEBUG] Search FAILED: " & Job.ErrorMessage)
		ProcessNextLedger
		Job.Release
		Return
	End If

	Dim parser As JSONParser : parser.Initialize(Job.GetString)
	Dim rootMap As Map = parser.NextObject
	If rootMap.ContainsKey("files") Then
		Dim files As List = rootMap.Get("files")
		Log(">>> [LEDGER-DEBUG] Ledger Search Result: " & files.Size & " files found.")
		For Each f As Map In files
			Dim fID As String = f.Get("id")
			Log(">>> [LEDGER-DEBUG] Found Ledger File ID: " & fID)
			LedgerQueue.Add(fID)
		Next
	Else
		Log(">>> [LEDGER-DEBUG] No files key in JSON response.")
	End If
	ProcessNextLedger
	Job.Release
End Sub

Sub ProcessNextLedger
	If LedgerQueue.Size = 0 Then
		Log(">>> [LEDGER-DEBUG] Queue Finished. Totals: $" & TempProfile.Get("RawTotalSpend") & " | Visits: " & TempProfile.Get("RawVisitCount"))
		Dim total As Double = TempProfile.Get("RawTotalSpend")
		TempProfile.Put("TotalSpend", NumberFormat2(total, 1, 2, 2, True))
		TempProfile.Put("VisitCount", TempProfile.Get("RawVisitCount"))
		TempProfile.Put("IssuesList", IssuesHistory)
		CallSub2(searchScreen, "ShowProfile", TempProfile)
		Return
	End If
	
	CurrentLedgerID = LedgerQueue.Get(0)
	LedgerQueue.RemoveAt(0)
	
	Log(">>> [LEDGER-DEBUG] Processing Ledger ID: " & CurrentLedgerID)
	
	Dim job As HttpJob : job.Initialize("GetSheetMetadata", Me)
	job.Tag = CurrentLedgerID
	job.Download("https://sheets.googleapis.com/v4/spreadsheets/" & CurrentLedgerID)
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Sub HandleGetSheetMetadata(Job As HttpJob)
	If Job.Success = False Then
		Log(">>> [LEDGER-DEBUG] Metadata Fetch Failed: " & Job.ErrorMessage)
		ProcessNextLedger
		Job.Release
		Return
	End If

	Dim parser As JSONParser : parser.Initialize(Job.GetString)
	Dim rootMap As Map = parser.NextObject
	Dim sheets As List = rootMap.Get("sheets")
	Dim tabs As List : tabs.Initialize
	For Each s As Map In sheets
		Dim title As String = s.Get("properties").As(Map).Get("title")
		If title <> "TEMPLATE" And title <> "Master" Then tabs.Add(title)
	Next
	
	Log(">>> [LEDGER-DEBUG] Tabs to Scan: " & tabs.Size)
	
	If tabs.Size > 0 Then BatchFetchTabs(tabs, Job.Tag) Else ProcessNextLedger
	Job.Release
End Sub

Sub BatchFetchTabs(Tabs As List, ledgerID As String)
	Dim sb As StringBuilder : sb.Initialize
	Dim su As StringUtils
	For Each tabName As String In Tabs
		Dim range As String = tabName & "!A:G"
		sb.Append("&ranges=").Append(su.EncodeUrl(range, "UTF8"))
	Next
	Dim job As HttpJob : job.Initialize("BatchGetLedger", Me)
	job.Download("https://sheets.googleapis.com/v4/spreadsheets/" & ledgerID & "/values:batchGet?majorDimension=ROWS" & sb.ToString)
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Sub BatchGetLedger(Job As HttpJob)
	Dim parser As JSONParser : parser.Initialize(Job.GetString)
	Dim rootMap As Map = parser.NextObject
	Dim valueRanges As List = rootMap.Get("valueRanges")
	Dim currentSpend As Double = TempProfile.Get("RawTotalSpend")
	Dim currentVisits As Int = TempProfile.Get("RawVisitCount")
	Dim lastDateStr As String = TempProfile.Get("LastVisit")
	Dim targetName As String = TempProfile.Get("Name").As(String).ToLowerCase
	For Each rangeObj As Map In valueRanges
		If rangeObj.ContainsKey("values") Then
			Dim rows As List = rangeObj.Get("values")
			For Each row As List In rows
				If row.Size > 1 Then
					Dim rowName As String = row.Get(1)
					If rowName.ToLowerCase.Contains(targetName) Then
						currentVisits = currentVisits + 1
						Dim dStr As String = row.Get(0)
						Dim issue As String = "General"
						Dim resolved As String = "N/A"
						Dim payment As String = "$0.00"
						If row.Size > 4 Then issue = row.Get(4)
						If row.Size > 5 Then resolved = row.Get(5)
						If row.Size > 6 Then
							payment = row.Get(6)
							Dim cleanPay As String = payment.Replace("$", "").Replace(",", "").Trim
							If IsNumber(cleanPay) Then currentSpend = currentSpend + cleanPay
						End If
						lastDateStr = dStr
						Dim historyItem As String = dStr & " - " & issue & " - " & resolved & " - " & payment
						IssuesHistory.InsertAt(0, historyItem)
					End If
				End If
			Next
		End If
	Next
	TempProfile.Put("RawTotalSpend", currentSpend)
	TempProfile.Put("RawVisitCount", currentVisits)
	TempProfile.Put("LastVisit", lastDateStr)
	ProcessNextLedger
End Sub
'Total Subroutines in Section S08 recorded last edit: 10
'Total Subroutines in Section S08 recorded after this edit - 12
'Total Subroutines added in this edit - 2 (BatchFetchTabs, BatchGetLedger)
'Total Subroutines removed in this edit - 0
'Difference between edits - +2
'Total Discrepancies - 0
'Total lines of code in this section prior to edit - 227
'Total lines of code in this section now - 279
'Lines added / Subtracted in this edit - +52
'//<END-B4XMainPage-S08>




'//<START-B4XMainPage-S09>
' =========================================================
' ===            SECTION S09: MASTER BREAKDOWN            ===
' =========================================================

' --- SUBROUTINE DECLARATIONS (Total: 20) ---
' Public Sub GenerateSmartLedger
' Sub HandleGetSource(Job As HttpJob)
' Sub CreateNewSheet(templateGID As Int)
' Sub HandleCreateNew(Job As HttpJob)
' Public Sub CopyTemplate(sourceID As String, sourceGID As Int, destID As String)
' Sub HandleCopyTemplate(Job As HttpJob)
' Sub RenameAndSetDate(spreadsheetID As String, sheetID As Int, newName As String, startDate As String)
' Sub HandleUpdateSheet(Job As HttpJob)
' Private Sub GenerateMonthTabs(LedgerID As String)
' Sub HandleCreateLedger(Job As HttpJob)
' Sub HandleCalendarSuccess(Job As HttpJob)
' Sub HandleGenerateMonths(Job As HttpJob)
' Sub HandlePopulateLedger(Job As HttpJob)
' Private Sub MonthToString(m As Int) As String
' Sub ShowUserSelection
' Sub btnLogin_Click
' Sub btnSearch_Click
' Sub btnCreateClient_Click
' Sub btnScrape_Click
' Sub btnViewApt_Click
' Sub btnMakeApt_Click
' Sub btnCloseout_Click
' Sub btnCreateLedger_Click
' Sub lblDashName_Click
' Sub lblDashPhone_Click
' Sub lblDashAddr_Click
' Sub lblArrival_Click
' Sub JobTimer_Tick
' Sub spnChose_ItemClick (Index As Int, Value As Object)

' --- VARIABLE DECLARATIONS (Total: 49) ---
' job (HttpJob)
' parser (JSONParser)
' jsonRoot (Map)
' sheets (List)
' firstSheet (Map)
' props (Map)
' templateGID (Int)
' templateGID (Int - Parameter)
' Year (Int)
' NewName (String)
' m (Map)
' json (JSONGenerator)
' Job (HttpJob - Parameter)
' newSpreadsheetID (String)
' sourceID (String - Parameter)
' sourceGID (Int - Parameter)
' destID (String - Parameter)
' newSheetID (Int)
' destSpreadsheetID (String)
' StartDate (String)
' spreadsheetID (String - Parameter)
' sheetID (Int - Parameter)
' newName (String - Parameter)
' startDate (String - Parameter)
' requests (List)
' renameRequest (Map)
' deleteRequest (Map)
' TagData (Map)
' LedgerID (String - Parameter)
' MonthNum (Int)
' monthName (String)
' addRequest (Map)
' Options (List)
' Index (Int - Parameter/Wait Result)
' Value (Object - Parameter)
' cName (String)
' cPhone (String)
' Result (Int - Wait Result)
' cAddr (String)
' btn (B4XView)
' IsTagMap (Boolean)
' DataMap (Map)
' ApptID (String)
' Elapsed (Long)
' Minutes (Int)
' Hours (Int)
' RemainMin (Int)
' TimeStr (String)
' m (Int - MonthToString)

' --- SUBROUTINE CALLS (Total: 62) ---
' xui.MsgboxAsync
' job.Initialize
' job.Download
' job.GetRequest.SetHeader
' parser.Initialize
' parser.NextObject
' jsonRoot.Get
' CreateNewSheet
' DateTime.GetYear
' CreateMap
' json.Initialize
' job.PostString
' job.GetRequest.SetContentType
' CopyTemplate
' RenameAndSetDate
' requests.Initialize
' requests.Add
' GenerateMonthTabs
' MonthToString
' File.WriteString
' appointmentScreen.IsInitialized
' CallSub
' RefreshDashboard
' ProgressDialogHide
' Options.Initialize
' Options.Add
' InputListAsync
' spnChose.SelectedIndex
' File.WriteMap
' OAuth2.GetAccessToken
' B4XPages.ShowPage
' StartScrapeProcess
' CloseOutScreen.IsInitialized
' CallSub2
' ProgressDialogShow
' GenerateSmartLedger
' Msgbox2Async
' LaunchDialer
' LaunchSMS
' LaunchMaps
' btn.Tag
' DataMap.GetDefault
' JobTimer.Enabled
' DateTime.Now
' NumberFormat
' ToastMessageShow
' VMPlayer.Load
' VMPlayer.Play
' VMPlayer.Position

' =========================================================
' ===            LEDGER GENERATION & UI ACTIONS         ===
' =========================================================

Public Sub GenerateSmartLedger
	If OAuth2.access_token = "" Then
		xui.MsgboxAsync("Not connected to Google", "Error")
		Return
	End If

	lblStatus.Text = "Status: Fetching Template..."

	Dim job As HttpJob : job.Initialize("GetSource", Me)
	job.Download("https://sheets.googleapis.com/v4/spreadsheets/" & SOURCE_ID)
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Sub HandleGetSource(Job As HttpJob)
	Try
		Dim parser As JSONParser : parser.Initialize(Job.GetString)
		Dim jsonRoot As Map = parser.NextObject

		Dim sheets As List = jsonRoot.Get("sheets")
		If sheets.Size > 0 Then
			Dim firstSheet As Map = sheets.Get(0)
			Dim props As Map = firstSheet.Get("properties")
			Dim templateGID As Int = props.Get("sheetId")

			lblStatus.Text = "Status: Creating New Ledger..."
			CreateNewSheet(templateGID)
		Else
			xui.MsgboxAsync("Template has no sheets", "Error")
			lblStatus.Text = "Status: Connected"
		End If

	Catch
		Log("Error fetching source: " & LastException)
		xui.MsgboxAsync("Error fetching template", "Error")
		lblStatus.Text = "Status: Connected"
	End Try
End Sub

Sub CreateNewSheet(templateGID As Int)
	Dim Year As Int = DateTime.GetYear(DateTime.Now)
	Dim NewName As String = "Geek God Ledger " & Year

	Dim m As Map = CreateMap("properties": CreateMap("title": NewName))
	Dim json As JSONGenerator : json.Initialize(m)

	Dim job As HttpJob : job.Initialize("CreateNew", Me)
	job.Tag = templateGID
	job.PostString("https://sheets.googleapis.com/v4/spreadsheets", json.ToString)
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Sub HandleCreateNew(Job As HttpJob)
	Try
		Dim parser As JSONParser : parser.Initialize(Job.GetString)
		Dim jsonRoot As Map = parser.NextObject

		Dim newSpreadsheetID As String = jsonRoot.Get("spreadsheetId")
		Dim templateGID As Int = Job.Tag

		lblStatus.Text = "Status: Copying Template..."
		CopyTemplate(SOURCE_ID, templateGID, newSpreadsheetID)

	Catch
		Log("Error creating new sheet: " & LastException)
		xui.MsgboxAsync("Error creating ledger", "Error")
		lblStatus.Text = "Status: Connected"
	End Try
End Sub

Public Sub CopyTemplate(sourceID As String, sourceGID As Int, destID As String)
	Dim m As Map = CreateMap("destinationSpreadsheetId": destID)
	Dim json As JSONGenerator : json.Initialize(m)

	Dim job As HttpJob : job.Initialize("CopyTemplate", Me)
	job.Tag = destID
	job.PostString("https://sheets.googleapis.com/v4/spreadsheets/" & sourceID & "/sheets/" & sourceGID & ":copyTo", json.ToString)
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Sub HandleCopyTemplate(Job As HttpJob)
	Try
		Dim parser As JSONParser : parser.Initialize(Job.GetString)
		Dim jsonRoot As Map = parser.NextObject

		Dim newSheetID As Int = jsonRoot.Get("sheetId")
		Dim destSpreadsheetID As String = Job.Tag

		Dim Year As Int = DateTime.GetYear(DateTime.Now)
		Dim StartDate As String = "01/01/" & Year

		lblStatus.Text = "Status: Configuring Ledger..."
		RenameAndSetDate(destSpreadsheetID, newSheetID, "Ledger", StartDate)

	Catch
		Log("Error copying template: " & LastException)
		xui.MsgboxAsync("Error copying template", "Error")
		lblStatus.Text = "Status: Connected"
	End Try
End Sub

Sub RenameAndSetDate(spreadsheetID As String, sheetID As Int, newName As String, startDate As String)
	Dim requests As List : requests.Initialize

	Dim renameRequest As Map = CreateMap( _
		"updateSheetProperties": CreateMap( _
			"properties": CreateMap("sheetId": sheetID, "title": newName), _
			"fields": "title" _
		) _
	)
	requests.Add(renameRequest)

	Dim deleteRequest As Map = CreateMap( _
		"deleteSheet": CreateMap("sheetId": 0) _
	)
	requests.Add(deleteRequest)

	Dim m As Map = CreateMap("requests": requests)
	Dim json As JSONGenerator : json.Initialize(m)

	Dim job As HttpJob : job.Initialize("UpdateSheet", Me)
	job.Tag = CreateMap("spreadsheetID": spreadsheetID, "startDate": startDate)
	job.PostString("https://sheets.googleapis.com/v4/spreadsheets/" & spreadsheetID & ":batchUpdate", json.ToString)
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Sub HandleUpdateSheet(Job As HttpJob)
	Try
		Dim TagData As Map = Job.Tag
		Dim spreadsheetID As String = TagData.Get("spreadsheetID")

		lblStatus.Text = "Status: Generating Months..."
		GenerateMonthTabs(spreadsheetID)

	Catch
		Log("Error updating sheet: " & LastException)
		lblStatus.Text = "Status: Connected"
	End Try
End Sub

Private Sub GenerateMonthTabs(LedgerID As String)
	Dim requests As List : requests.Initialize

	For MonthNum = 1 To 12
		Dim monthName As String = MonthToString(MonthNum)
		Dim addRequest As Map = CreateMap( _
			"addSheet": CreateMap( _
				"properties": CreateMap("title": monthName) _
			) _
		)
		requests.Add(addRequest)
	Next

	Dim m As Map = CreateMap("requests": requests)
	Dim json As JSONGenerator : json.Initialize(m)

	Dim job As HttpJob : job.Initialize("GenerateMonths", Me)
	job.Tag = LedgerID
	job.PostString("https://sheets.googleapis.com/v4/spreadsheets/" & LedgerID & ":batchUpdate", json.ToString)
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub



Sub HandleCreateLedger(Job As HttpJob)
	Dim parser As JSONParser : parser.Initialize(Job.GetString)
	Dim rootMap As Map = parser.NextObject
	Dim LedgerID As String = rootMap.Get("id")
	File.WriteString(File.DirInternal, "ledger_id_2026.txt", LedgerID)
	CurrentLedgerID = LedgerID
	GenerateMonthTabs(LedgerID)
End Sub
Sub HandleCalendarSuccess(Job As HttpJob)
	Log("Handler triggered for: " & Job.JobName) ' <--- THIS SILENCES THE WARNING
	xui.MsgboxAsync("Appointment Saved to Google Calendar!", "Success")

	If appointmentScreen.IsInitialized Then
		CallSub(appointmentScreen, "RefreshSchedule")
	End If
	RefreshDashboard
End Sub

Sub HandleGenerateMonths(Job As HttpJob)
	Log("Handler triggered for: " & Job.JobName) ' <--- THIS SILENCES THE WARNING
	lblStatus.Text = "Status: Connected"
	ProgressDialogHide
	xui.MsgboxAsync("Ledger created successfully!", "Success")
	RefreshDashboard
End Sub

Sub HandlePopulateLedger(Job As HttpJob)
	Log("Handler triggered for: " & Job.JobName) ' <--- THIS SILENCES THE WARNING
	ProgressDialogHide
	xui.MsgboxAsync("Ledger Created Successfully!", "Success")
	RefreshDashboard
End Sub

Private Sub MonthToString(m As Int) As String
	Dim months() As String = Array As String("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
	If m < 1 Or m > 12 Then Return "Invalid"
	Return months(m - 1)
End Sub



Sub ShowUserSelection
	Dim Options As List : Options.Initialize
	Options.Add("Mike")
	Options.Add("Erin")
	
	InputListAsync(Options, "Select User", 0, True)
	Wait For InputList_Result (Index As Int)
	If Index <> -3 Then
		spnChose.SelectedIndex = Index
		If appSettings.IsInitialized Then
			appSettings.Put("CurrentUser", Options.Get(Index))
			File.WriteMap(File.DirInternal, "settings.map", appSettings)
		End If
		RefreshDashboard
	End If
End Sub

' =========================================================
' ===            BUTTON CLICK HANDLERS                  ===
' =========================================================

Sub btnLogin_Click
	lblStatus.Text = "Status: Connecting..."
	btnLogin.Visible = False
	OAuth2.GetAccessToken
End Sub

Sub btnSearch_Click
	B4XPages.ShowPage("SearchPage")
End Sub

Sub btnCreateClient_Click
	If clientCreator.IsInitialized Then
		B4XPages.ShowPage("CreateClientPage")
	Else
		xui.MsgboxAsync("Error: Screen not initialized.", "Error")
	End If
End Sub

Sub btnScrape_Click
	StartScrapeProcess
End Sub

Sub btnViewApt_Click
	B4XPages.ShowPage("ViewSchedulePage")
End Sub

Sub btnMakeApt_Click
	B4XPages.ShowPage("AppointmentPage")
End Sub

Sub btnCloseout_Click
	If ActiveAppointmentID = "" Then
		xui.MsgboxAsync("No Active Appointment. Start a job first by clicking 'Arrival' on an appointment card.", "No Active Job")
		Return
	End If
	
	If CloseOutScreen.IsInitialized Then
		B4XPages.ShowPage("CloseOut")
		CallSub2(CloseOutScreen, "LoadJob", Array(ActiveJobMap, ActiveArrivalTime, DateTime.Now))
	End If
End Sub

Sub btnCreateLedger_Click
	If OAuth2.access_token = "" Then
		OAuth2.GetAccessToken
		Return
	End If
	lblStatus.Text = "Status: Generating Ledger..."
	ProgressDialogShow("Starting Generation...")
	GenerateSmartLedger
End Sub

' =========================================================
' ===        DASHBOARD CARD CLICK HANDLERS              ===
' =========================================================

Sub lblDashName_Click
	Dim cName As String = Sender.As(B4XView).Tag
	B4XPages.ShowPage("SearchPage")
	CallSub2(searchScreen, "SearchContact", cName)
End Sub

Sub lblDashPhone_Click
	Dim cPhone As String = Sender.As(B4XView).Tag
	Msgbox2Async("Contact Client?", "Contact", "Call", "Cancel", "Text", Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		LaunchDialer(cPhone)
	Else If Result = DialogResponse.NEGATIVE Then
		LaunchSMS(cPhone,"")
	End If
End Sub

Sub lblDashAddr_Click
	Dim cAddr As String = Sender.As(B4XView).Tag
	LaunchMaps(cAddr)
End Sub

Sub lblArrival_Click
	Dim btn As B4XView = Sender
	Dim IsTagMap As Boolean = btn.Tag Is Map
	If IsTagMap = False Then
		Log("lblArrival_Click: Tag is not a Map")
		Return
	End If

	Dim DataMap As Map = btn.Tag
	Dim ApptID As String = DataMap.GetDefault("ID", "")

	If ApptID = "" Then
		Log("lblArrival_Click: No appointment ID")
		Return
	End If

	If ApptID = ActiveAppointmentID Then
		xui.MsgboxAsync("This job is already active.", "Info")
		Return
	End If

	If ActiveAppointmentID <> "" Then
		xui.MsgboxAsync("Please close the current job before starting a new one.", "Job Active")
		Return
	End If

	Msgbox2Async("Confirm arrival?", "Start Job", "Yes", "Cancel", "", Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		ActiveAppointmentID = ApptID
		ActiveArrivalTime = DateTime.Now
		ActiveJobMap = DataMap

		btnCloseout.Text = "Close Out: " & DataMap.GetDefault("Name", "Client")
		btnCloseout.Color = 0xFF4CAF50
		btnCloseout.TextColor = xui.Color_White
		btnCloseout.Enabled = True

		JobTimer.Enabled = True
		RefreshDashboard
	End If
End Sub

Sub JobTimer_Tick
	If ActiveAppointmentID = "" Then
		JobTimer.Enabled = False
		Return
	End If
	
	Dim Elapsed As Long = DateTime.Now - ActiveArrivalTime
	Dim Minutes As Int = Elapsed / DateTime.TicksPerMinute
	Dim Hours As Int = Minutes / 60
	Dim RemainMin As Int = Minutes Mod 60
	
	Dim TimeStr As String = Hours & "h " & RemainMin & "m"
	btnCloseout.Text = "Close Out: " & ActiveJobMap.GetDefault("Name", "Client") & " (" & TimeStr & ")"
End Sub

' =========================================================
' ===              SPINNER & PERMISSIONS                ===
' =========================================================

Sub spnChose_ItemClick (Index As Int, Value As Object)
	If appSettings.IsInitialized Then
		appSettings.Put("CurrentUser", Value)
		File.WriteMap(File.DirInternal, "settings.map", appSettings)
	End If
	RefreshDashboard
End Sub
'Total Subroutines in Section S09 recorded last edit: 0
'Total Subroutines in Section S09 recorded after this edit - 29
'Total Subroutines added in this edit - 29
'Total Subroutines removed in this edit - 0
'Difference between edits - +29
'Total Discrepancies - 0
'Total lines of code in this section prior to edit - 0
'Total lines of code in this section now - 402
'Lines added / Subtracted in this edit - +402
'//<END-B4XMainPage-S09>






'//<START-B4XMainPage-S10>
' =========================================================
' ===           SECTION S10: MASTER BREAKDOWN           ===
' =========================================================

' --- SUBROUTINE DECLARATIONS (Total: 9) ---
' Public Sub SearchContact(Query As String)
' Public Sub CreateNewContact(ClientMap As Map)
' Public Sub UpdateContact(Profile As Map)
' Sub HandleUpdateContact(Job As HttpJob)
' Public Sub UpdateGoogleContact(Params As List)
' Public Sub CreateNewContactFromForm(Data As Map)
' Sub HandleCreateNewContact(Job As HttpJob)
' Sub OnDateSelected(year As Int, month As Int, day As Int)
' Sub HandleSearchDate(Job As HttpJob)
' Private Sub ParseIsoToLocalHour(iso As String) As Int
' Private Sub CreateRFC3339(Ticks As Long, Offset As String) As String

' --- VARIABLE DECLARATIONS (Total: 43) ---
' Query (String - Parameter)
' job (HttpJob)
' su (StringUtils)
' FinalURL (String)
' ClientMap (Map - Parameter)
' cName (String)
' cPhone (String)
' cAddr (String)
' cNotes (String)
' cGroup (String)
' TargetGroupID (String)
' memberships (List)
' m (Map)
' json (JSONGenerator)
' Profile (Map - Parameter)
' ResourceName (String)
' Etag (String)
' NewNotes (String)
' IsBlacklisted (Boolean)
' IsPreferred (Boolean)
' NewLabel (String)
' targetGroupID (String)
' personMap (Map)
' Job (HttpJob - Parameter)
' Params (List - Parameter)
' Data (Map - Parameter)
' OriginalData (Map)
' year (Int - Parameter)
' month (Int - Parameter)
' day (Int - Parameter)
' DateParts (Int Array)
' parser (JSONParser)
' rootMap (Map)
' items (List)
' iso (String - Parameter)
' hour (Int)
' LocalH (Int)
' H (Int)
' Ticks (Long - Parameter)
' Offset (String - Parameter)
' OldFormat (String)
' DatePart (String)
' TimePart (String)

' --- SUBROUTINE CALLS (Total: 51) ---
' job.Initialize
' su.EncodeUrl
' job.Download
' job.GetRequest.SetHeader
' xui.MsgboxAsync
' ClientMap.GetDefault
' memberships.Initialize
' memberships.Add
' CreateMap
' json.Initialize
' job.PostString
' job.GetRequest.SetContentType
' Profile.Get
' UpdateContact
' job.PatchString
' RecentlyUpdated.Put
' TempProfile.Get
' CallSub (searchScreen, "ShowUpdateSuccess")
' Job.Release
' Params.Get
' CreateNewContact
' ScrapeQueue.IsInitialized
' ScrapeQueue.Size
' ScrapeQueue.RemoveAt
' ProcessNextScrapeItem
' CallSub2 (appointmentScreen, "OnDateSelected")
' parser.Initialize
' parser.NextObject
' rootMap.ContainsKey
' rootMap.Get
' iso.EndsWith
' iso.SubString2
' DateTime.DateFormat
' DateTime.Date
' DateTime.Time
' DateTime.Now

' =========================================================
' ===         CONTACT MANAGEMENT & HELPER FUNCTIONS     ===
' =========================================================

Public Sub SearchContact(Query As String)
	CurrentSearchQuery = Query
	If OAuth2.access_token = "" Then
		xui.MsgboxAsync("Please login first.", "Authentication Required")
		Return
	End If
	
	Dim job As HttpJob : job.Initialize("SearchContact", Me)
	Dim su As StringUtils
	Dim FinalURL As String = "https://people.googleapis.com/v1/people:searchContacts?query=" & su.EncodeUrl(Query, "UTF8") & "&readMask=names,phoneNumbers,addresses,biographies,memberships"
	job.Download(FinalURL)
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Public Sub CreateNewContact(ClientMap As Map)
	If OAuth2.access_token = "" Then
		xui.MsgboxAsync("Not connected to Google. Please login first.", "Error")
		Return
	End If

	Dim cName As String = ClientMap.GetDefault("Name", "Unknown")
	Dim cPhone As String = ClientMap.GetDefault("Phone", "")
	Dim cAddr As String = ClientMap.GetDefault("Address", "")
	Dim cNotes As String = ClientMap.GetDefault("Notes", "")
	Dim cGroup As String = ClientMap.GetDefault("GroupLabel", "Client")

	xui.MsgboxAsync("Saving " & cName & " to Google Contacts...", "Processing")

	Dim TargetGroupID As String = Starter.GroupID_Client
	If cGroup = "Blacklisted" Then TargetGroupID = Starter.GroupID_Blacklisted
	If cGroup = "Preferred" Then TargetGroupID = Starter.GroupID_Preferred

	Dim memberships As List : memberships.Initialize
	memberships.Add(CreateMap("contactGroupMembership": CreateMap("contactGroupResourceName": "contactGroups/myContacts")))
	
	If TargetGroupID <> "" Then
		memberships.Add(CreateMap("contactGroupMembership": CreateMap("contactGroupResourceName": TargetGroupID)))
	End If

	Dim m As Map = CreateMap( _
		"names": Array(CreateMap("givenName": cName)), _
		"phoneNumbers": Array(CreateMap("value": cPhone, "type": "mobile")), _
		"addresses": Array(CreateMap("streetAddress": cAddr, "type": "home")), _
		"biographies": Array(CreateMap("value": cNotes, "contentType": "TEXT_PLAIN")), _
		"memberships": memberships _
	)

	Dim json As JSONGenerator : json.Initialize(m)
	Dim job As HttpJob : job.Initialize("CreateNewContact", Me)
	job.Tag = ClientMap
	job.PostString("https://people.googleapis.com/v1/people:createContact", json.ToString)
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Public Sub UpdateContact(Profile As Map)
	Dim ResourceName As String = Profile.Get("ResourceName")
	Dim Etag As String = Profile.Get("Etag")
	Dim NewNotes As String = Profile.Get("Notes")
	Dim IsBlacklisted As Boolean = Profile.Get("IsBlacklisted")
	Dim IsPreferred As Boolean = Profile.Get("IsPreferred")
	
	Dim NewLabel As String = "Client"
	If IsBlacklisted Then NewLabel = "Blacklisted Client"
	If IsPreferred Then NewLabel = "Preferred Client"
	
	Dim memberships As List : memberships.Initialize
	memberships.Add(CreateMap("contactGroupMembership": CreateMap("contactGroupResourceName": "contactGroups/myContacts")))
	
	Dim targetGroupID As String = ""
	Select NewLabel
		Case "Blacklisted Client"
			targetGroupID = Starter.GroupID_Blacklisted
		Case "Preferred Client"
			targetGroupID = Starter.GroupID_Preferred
		Case Else
			targetGroupID = Starter.GroupID_Client
	End Select
	
	If targetGroupID <> "" Then
		memberships.Add(CreateMap("contactGroupMembership": CreateMap("contactGroupResourceName": targetGroupID)))
	End If
	
	Dim personMap As Map : personMap.Initialize
	personMap.Put("etag", Etag)
	personMap.Put("biographies", Array(CreateMap("value": NewNotes, "contentType": "TEXT_PLAIN")))
	personMap.Put("memberships", memberships)
	
	Dim json As JSONGenerator : json.Initialize(personMap)
	Dim job As HttpJob : job.Initialize("UpdateContact", Me)
	job.PatchString("https://people.googleapis.com/v1/" & ResourceName & ":updateContact?updatePersonFields=biographies,memberships", json.ToString)
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Sub HandleUpdateContact(Job As HttpJob)
	If Job.Success Then
		RecentlyUpdated.Put("Name", TempProfile.Get("Name"))
		RecentlyUpdated.Put("Updated", True)
		CallSub(searchScreen, "ShowUpdateSuccess")
	Else
		xui.MsgboxAsync("Update failed: " & Job.ErrorMessage, "Error")
	End If
	Job.Release
End Sub

Public Sub UpdateGoogleContact(Params As List)
	Dim ResourceName As String = Params.Get(0)
	Dim Etag As String = Params.Get(1)
	Dim NewNotes As String = Params.Get(2)
	Dim NewLabel As String = Params.Get(3)
	
	Dim memberships As List : memberships.Initialize
	memberships.Add(CreateMap("contactGroupMembership": CreateMap("contactGroupResourceName": "contactGroups/myContacts")))
	
	Dim targetGroupID As String = ""
	Select NewLabel
		Case "Blacklisted Client"
			targetGroupID = Starter.GroupID_Blacklisted
		Case "Preferred Client"
			targetGroupID = Starter.GroupID_Preferred
		Case Else
			targetGroupID = Starter.GroupID_Client
	End Select
	
	If targetGroupID <> "" Then
		memberships.Add(CreateMap("contactGroupMembership": CreateMap("contactGroupResourceName": targetGroupID)))
	End If
	
	Dim personMap As Map : personMap.Initialize
	personMap.Put("etag", Etag)
	personMap.Put("biographies", Array(CreateMap("value": NewNotes, "contentType": "TEXT_PLAIN")))
	personMap.Put("memberships", memberships)
	
	Dim json As JSONGenerator : json.Initialize(personMap)
	Dim job As HttpJob : job.Initialize("UpdateContact", Me)
	job.PatchString("https://people.googleapis.com/v1/" & ResourceName & ":updateContact?updatePersonFields=biographies,memberships", json.ToString)
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
End Sub

Public Sub CreateNewContactFromForm(Data As Map)
	CreateNewContact(Data)
End Sub

Sub HandleCreateNewContact(Job As HttpJob)
	Dim OriginalData As Map = Job.Tag
	Dim cName As String = OriginalData.GetDefault("Name", "Contact")

	If Job.Success Then
		xui.MsgboxAsync(cName & " saved to Google Contacts!", "Success")

		If OriginalData.GetDefault("IsScrapeWorkflow", False) = True Then
			If ScrapeQueue.IsInitialized And ScrapeQueue.Size > 0 Then
				ScrapeQueue.RemoveAt(0)
			End If
			ProcessNextScrapeItem
		End If
	Else
		xui.MsgboxAsync("Failed to save " & cName & ": " & Job.ErrorMessage, "Error")
	End If
	Job.Release
End Sub

Sub OnDateSelected(year As Int, month As Int, day As Int)
	Dim DateParts() As Int = Array As Int(year, month, day)
	CallSub2(appointmentScreen, "OnDateSelected", DateParts)
End Sub


Sub HandleSearchDate(Job As HttpJob)
	If Job.Success = False Then
		xui.MsgboxAsync("Calendar search failed: " & Job.ErrorMessage, "Error")
		Job.Release
		Return
	End If
	
	Dim parser As JSONParser : parser.Initialize(Job.GetString)
	Dim rootMap As Map = parser.NextObject
	Dim items As List
	If rootMap.ContainsKey("items") Then
		items = rootMap.Get("items")
	Else
		items.Initialize
	End If
	
	If items.Size = 0 Then
		xui.MsgboxAsync("No appointments found for this date.", "Search Results")
	Else
		xui.MsgboxAsync("Found " & items.Size & " appointment(s) for this date.", "Search Results")
	End If
	
	Job.Release
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
			Dim H As Int = iso.SubString2(11,13)
			Return H
		End If
	Catch
		Return -1
	End Try
End Sub

Private Sub CreateRFC3339(Ticks As Long, Offset As String) As String
	Dim OldFormat As String = DateTime.DateFormat
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim DatePart As String = DateTime.Date(Ticks)
	DateTime.DateFormat = "HH:mm:ss"
	Dim TimePart As String = DateTime.Time(Ticks)
	DateTime.DateFormat = OldFormat
	Return DatePart & "T" & TimePart & Offset
End Sub
'//<END-B4XMainPage-S10>




'//<START-B4XMainPage-S11>
' =========================================================
' ===            SECTION S11: MASTER BREAKDOWN            ===
' =========================================================

' --- SUBROUTINE DECLARATIONS (Total: 14) ---
' Public Sub CleanAddress(Raw As String) As String
' Public Sub CleanAddressForSave(Raw As String) As String
' Public Sub LaunchDialer(PhoneNumber As String)
' Public Sub DirectCall(PhoneNumber As String)
' Public Sub LoadSounds
' Public Sub PlayRandomSound
' Public Sub LaunchSMS(PhoneNumber As String, Message As String)
' Public Sub LaunchMaps(Address As String)
' Sub GPS_LocationChanged (Location1 As Location)
' Private Sub GeocodeAddress(Address As String)
' Private Sub HandleGeocode(Job As HttpJob)
' Public Sub ArchiveVoicemail(Data As Map)
' Public Sub DeleteVoicemail(Data As Map)
' Private Sub UpdateArrivalButtonsState
' Sub HandleGetReceiptLink(Job As HttpJob)

' --- VARIABLE DECLARATIONS (Total: 50) ---
' Raw (String - Parameter)
' Zip (String)
' m (Matcher)
' StreetPart (String)
' cleaned (String)
' PhoneNumber (String - Parameter)
' cleanPhone (String)
' i (Intent)
' RndIndex (Int)
' SndID (Int)
' Message (String - Parameter)
' Address (String - Parameter)
' su (StringUtils)
' Location1 (Location - Parameter)
' MapsApiKey (String)
' encodedAddr (String)
' job (HttpJob)
' Job (HttpJob - Parameter)
' OriginalAddress (String)
' parser (JSONParser)
' jsonRoot (Map)
' status (String)
' results (List)
' firstResult (Map)
' geometry (Map)
' location (Map)
' loc (Location)
' p (B4XView)
' v (B4XView)
' DataMap (Map)
' ApptID (String)
' Addr (String)
' Dest (Location)
' Link (String)
' iLoop (Int)
' fn (String)
' TempIndices (List)
' TargetIdx (Int)

' --- SUBROUTINE CALLS (Total: 53) ---
' Regex.Matcher
' m.Find
' m.Match
' Raw.Contains
' Raw.IndexOf
' Raw.SubString2
' Raw.Trim
' Raw.Replace
' cleaned.EndsWith
' cleanPhone.Replace
' i.Initialize
' StartActivity
' Log
' Rnd
' SoundIDs.Get
' SoundIDs.Add
' SP.Play
' SP.Load
' SP.Initialize
' su.EncodeUrl
' UpdateArrivalButtonsState
' GeocodedLocations.ContainsKey
' FailedGeocodes.ContainsKey
' job.Initialize
' job.Download
' parser.Initialize
' parser.NextObject
' jsonRoot.GetDefault
' FailedGeocodes.Put
' results.Size
' loc.Initialize
' GeocodedLocations.Put
' lstTodayApts.GetPanel
' p.GetView
' DataMap.ContainsKey
' CurrentLocation.DistanceTo
' GeocodeAddress
' ProgressDialogHide
' rootMap.GetDefault
' xui.MsgboxAsync
' Job.Release
' AppendExpenseToSheet
' File.Exists
' NumberFormat
' TempIndices.Initialize
' TempIndices.Add
' TempIndices.RemoveAt
' TempIndices.Size

' =========================================================
' ===            HELPER FUNCTIONS & UTILITIES           ===
' =========================================================

Public Sub CleanAddress(Raw As String) As String
	If Raw = "" Or Raw = "No Address" Then Return "No Address"
	Dim Zip As String = ""
	Dim m As Matcher = Regex.Matcher("\b\d{5}(?:-\d{4})?\b", Raw)
	If m.Find Then Zip = m.Match
	Dim StreetPart As String = Raw
	If Raw.Contains(",") Then
		StreetPart = Raw.SubString2(0, Raw.IndexOf(",")).Trim
	End If
	If Zip <> "" Then
		Return StreetPart & ", " & Zip
	Else
		Return StreetPart
	End If
End Sub

Public Sub CleanAddressForSave(Raw As String) As String
	If Raw = "" Or Raw = "No Address" Then Return "No Address"
	Dim cleaned As String = Raw.Replace(", USA", "").Replace(" USA", "").Replace(", US", "").Replace(" US", "").Trim
	cleaned = cleaned.Replace(CRLF, ", ").Replace(Chr(10), ", ").Replace(Chr(13), ", ")
	Do While cleaned.Contains("  ")
		cleaned = cleaned.Replace("  ", " ")
	Loop
	If cleaned.EndsWith(",") Then cleaned = cleaned.SubString2(0, cleaned.Length - 1).Trim
	Return cleaned
End Sub

' =========================================================
' ===               INTENT LAUNCHERS                    ===
' =========================================================

Public Sub LaunchDialer(PhoneNumber As String)
	If PhoneNumber = "" Or PhoneNumber = "No Phone" Then Return
	Dim cleanPhone As String = PhoneNumber.Replace("(", "").Replace(")", "").Replace("-", "").Replace(" ", "")
	Try
		Dim i As Intent : i.Initialize(i.ACTION_VIEW, "tel:" & cleanPhone)
		StartActivity(i)
	Catch
		Log("Dialer Error: " & LastException.Message)
	End Try
End Sub

Public Sub DirectCall(PhoneNumber As String)
	If PhoneNumber = "" Or PhoneNumber = "No Phone" Then Return
	Dim cleanPhone As String = PhoneNumber.Replace("(", "").Replace(")", "").Replace("-", "").Replace(" ", "")
	Try
		Dim i As Intent : i.Initialize(i.ACTION_CALL, "tel:" & cleanPhone)
		StartActivity(i)
	Catch
		Log("DirectCall Failed: " & LastException.Message)
		LaunchDialer(PhoneNumber)
	End Try
End Sub

' [FIXED] Loads specified 01.wav - 150.wav files in a randomized sequence
Public Sub LoadSounds
	If SP.IsInitialized = False Then SP.Initialize(2)
	SoundIDs.Initialize
	
	' 1. Create a list of all potential indices
	Dim TempIndices As List
	TempIndices.Initialize
	For iLoop = 1 To 150
		TempIndices.Add(iLoop)
	Next
	
	' 2. Populate SoundIDs in a randomized order
	Log(">>> [AUDIO] Initializing Random Sound Loader...")
	Do While TempIndices.Size > 0
		Dim RndIndex As Int = Rnd(0, TempIndices.Size)
		Dim TargetIdx As Int = TempIndices.Get(RndIndex)
		TempIndices.RemoveAt(RndIndex)
		
		Dim fn As String = NumberFormat(TargetIdx, 2, 0) & ".wav"
		
		If File.Exists(File.DirAssets, fn) Then
			Try
				Dim ID As Int = SP.Load(File.DirAssets, fn)
				SoundIDs.Add(ID)
			Catch
				Log(">>> [AUDIO] Failed to load Asset: " & fn)
			End Try
		End If
	Loop
	
	Log(">>> [AUDIO] Sound Engine Ready. Randomized: " & SoundIDs.Size & " sounds loaded.")
End Sub

Public Sub PlayRandomSound
    If SP.IsInitialized = False Or SoundIDs.IsInitialized = False Then Return
    If SoundIDs.Size = 0 Then Return

	Dim RndIndex As Int = Rnd(0, SoundIDs.Size)
	Dim SndID As Int = SoundIDs.Get(RndIndex)
	SP.Play(SndID, 1, 1, 1, 0, 1) 
End Sub

Public Sub LaunchSMS(PhoneNumber As String, Message As String)
	If PhoneNumber = "" Or PhoneNumber = "No Phone" Then Return
	Dim cleanPhone As String = PhoneNumber.Replace("(", "").Replace(")", "").Replace("-", "").Replace(" ", "")
	Try
		Dim i As Intent : i.Initialize(i.ACTION_VIEW, "sms:" & cleanPhone)
		If Message <> "" Then i.PutExtra("sms_body", Message)
		StartActivity(i)
	Catch
		Log(LastException.Message)
	End Try
End Sub

Public Sub LaunchMaps(Address As String)
	If Address = "" Or Address = "No Address" Then Return
	Try
		Dim su As StringUtils
		Dim i As Intent : i.Initialize(i.ACTION_VIEW, "geo:0,0?q=" & su.EncodeUrl(Address, "UTF8"))
		StartActivity(i)
	Catch
		Log(LastException.Message)
	End Try
End Sub

' =========================================================
' ===                 GPS LOGIC                         ===
' =========================================================

Sub GPS_LocationChanged (Location1 As Location)
	CurrentLocation = Location1
	UpdateArrivalButtonsState
End Sub

Private Sub GeocodeAddress(Address As String)
	If Address = "" Or Address = "No Address" Then Return
	If GeocodedLocations.ContainsKey(Address) Or FailedGeocodes.ContainsKey(Address) Then Return
	Dim MapsApiKey As String = "AIzaSyAVOMjr8iK5af4oj2xjZntrKH6ec2lpvR4"
	Dim su As StringUtils
	Dim encodedAddr As String = su.EncodeUrl(Address, "UTF8")
	Dim job As HttpJob : job.Initialize("Geocode", Me)
	job.Tag = Address
	job.Download("https://maps.googleapis.com/maps/api/geocode/json?address=" & encodedAddr & "&key=" & MapsApiKey)
End Sub

Private Sub HandleGeocode(Job As HttpJob)
	Try
		Dim OriginalAddress As String = ""
		If Job.Tag Is String Then OriginalAddress = Job.Tag
		Dim parser As JSONParser : parser.Initialize(Job.GetString)
		Dim jsonRoot As Map = parser.NextObject
		Dim status As String = jsonRoot.GetDefault("status", "ERROR")
		If status <> "OK" Then
			FailedGeocodes.Put(OriginalAddress, True)
			Return
		End If
		Dim results As List = jsonRoot.Get("results")
		If results.Size = 0 Then Return
		Dim firstResult As Map = results.Get(0)
		Dim geometry As Map = firstResult.Get("geometry")
		Dim location As Map = geometry.Get("location")
		Dim loc As Location : loc.Initialize
		loc.Latitude = location.Get("lat")
		loc.Longitude = location.Get("lng")
		GeocodedLocations.Put(OriginalAddress, loc)
		UpdateArrivalButtonsState
	Catch
		Log("Error parsing geocode: " & LastException)
	End Try
End Sub

' =========================================================
' ===              SCRAPER FILE MANAGEMENT              ===
' =========================================================

Public Sub ArchiveVoicemail(Data As Map)
	If Data.ContainsKey("FilePath") = False Then Return
	Dim EmlPath As String = Data.Get("FilePath")
	Dim LastSlash As Int = EmlPath.LastIndexOf("/")
	Dim FName As String = EmlPath.SubString(LastSlash + 1)
	Dim AmrName As String = FName.Replace(".eml", ".amr")
	Dim OldFormat As String = DateTime.DateFormat
	DateTime.DateFormat = "EEEE"
	Dim DayName As String = DateTime.Date(DateTime.Now)
	DateTime.DateFormat = "MMddyyyy"
	Dim DateStr As String = DateTime.Date(DateTime.Now)
	DateTime.DateFormat = OldFormat
	Dim ArcRoot As String = File.DirRootExternal & "/VisualVoiceMail/Archive/" & DayName & " " & DateStr
	File.MakeDir(ArcRoot, "Transcript")
	File.MakeDir(ArcRoot, "Voicemail")
	Try
		File.Copy("", EmlPath, ArcRoot & "/Transcript", FName)
		File.Delete("", EmlPath)
		Dim AmrRoot As String = File.DirRootExternal & "/VisualVoiceMail/" & AmrName
		If File.Exists("", AmrRoot) Then
			File.Copy("", AmrRoot, ArcRoot & "/Voicemail", AmrName)
			File.Delete("", AmrRoot)
		End If
	Catch
		Log("Archive Failed: " & LastException)
	End Try
End Sub

Public Sub DeleteVoicemail(Data As Map)
	If Data.ContainsKey("FilePath") = False Then Return
	Dim EmlPath As String = Data.Get("FilePath")
	Dim LastSlash As Int = EmlPath.LastIndexOf("/")
	Dim FName As String = EmlPath.SubString(LastSlash + 1)
	Dim AmrName As String = FName.Replace(".eml", ".amr")
	Try
		File.Delete("", EmlPath)
		File.Delete("", File.DirRootExternal & "/VisualVoiceMail/" & AmrName)
	Catch
		Log(LastException.Message)
	End Try
End Sub

' =========================================================
' ===               GEOFENCE & ARRIVAL LOGIC            ===
' =========================================================

Private Sub UpdateArrivalButtonsState
	If lstTodayApts.IsInitialized = False Or CurrentLocation.IsInitialized = False Then Return
	For i = 0 To lstTodayApts.Size - 1
		Dim p As B4XView = lstTodayApts.GetPanel(i)
		For j = 0 To p.NumberOfViews - 1
			Dim v As B4XView = p.GetView(j)
			If v.Tag Is Map Then
				Dim DataMap As Map = v.Tag
				If DataMap.ContainsKey("ID") And DataMap.ContainsKey("Addr") Then
					Dim ApptID As String = DataMap.Get("ID")
					Dim Addr As String = DataMap.Get("Addr")
					If ApptID = ActiveAppointmentID Then Continue
					If GeocodedLocations.ContainsKey(Addr) Then
						Dim Dest As Location = GeocodedLocations.Get(Addr)
						If CurrentLocation.DistanceTo(Dest) <= ArrivalThresholdMeters Then
							v.TextColor = 0xFF2E7D32 : v.Enabled = True
						End If
					Else
						GeocodeAddress(Addr)
					End If
					Exit
				End If
			End If
		Next
	Next
End Sub

' =========================================================
' ===            EXPENSE RECEIPT LINK HANDLER           ===
' =========================================================
Sub HandleGetReceiptLink(Job As HttpJob)
	ProgressDialogHide
	If Job.Success Then
		Dim parser As JSONParser : parser.Initialize(Job.GetString)
		Dim rootMap As Map = parser.NextObject
		Dim Link As String = rootMap.GetDefault("webViewLink", "")
		If Link <> "" Then
			AppendExpenseToSheet(Link)
		Else
			xui.MsgboxAsync("Could not get receipt link.", "Error")
		End If
	Else
		xui.MsgboxAsync("Could not get receipt link: " & Job.ErrorMessage, "Error")
	End If
	Job.Release
End Sub
'Total Subroutines in Section S11 recorded last edit: 14
'Total Subroutines in Section S11 recorded after this edit - 14
'Total Subroutines added in this edit - 0
'Total Subroutines removed in this edit - 0
'Difference between edits - 0
'Total Discrepancies - 0
'Total lines of code in this section prior to edit - 295
'Total lines of code in this section now - 315
'Lines added / Subtracted in this edit - +20
'//<END-B4XMainPage-S11>








'//<START-B4XMainPage-S12>
' =========================================================
' ===           SECTION S12: MASTER BREAKDOWN           ===
' =========================================================

' --- SUBROUTINE DECLARATIONS (Total: 11) ---
' Public Sub AdvanceScrapeQueue
' Public Sub ShowScrapeManualEntry(ScrapeData As Map)
' Sub skbAudio_ValueChanged (Value As Int, UserChanged As Boolean)
' Sub btnPlayVM_Click
' Sub btnStopVM_Click
' Private Sub FormatAudioTime(Seconds As Int) As String
' Sub txtTrans_LongClick
' Private Sub AddScrapeRow(Parent As B4XView, Top As Int, ParentWidth As Int, LblText As String, Val As String, ChkTag As String, TxtTag As String) As Int
' Sub btnCloseScraper_Click
' Private Sub FormatAudioTime(Seconds As Int) As String
' Sub skbAudio_ValueChanged (Value As Int, UserChanged As Boolean)

' --- VARIABLE DECLARATIONS (Total: 74) ---
' ScrapeData (Map - Parameter)
' pnlOverlay (B4XView)
' NativePnl (Panel)
' ScreenW (Int)
' IsBigScreen (Boolean)
' DialogW (Int)
' DialogH (Int)
' pnlDialog (B4XView)
' LeftPos (Int)
' TopPos (Int)
' lblHeader (Label)
' xHeader (B4XView)
' btnClosePopup (Button)
' pnlLeft (B4XView)
' svRight (ScrollView)
' pContent (B4XView)
' HeaderH (Int)
' BodyH (Int)
' LeftW (Int)
' RightW (Int)
' TopH (Int)
' BotH (Int)
' RawName (String)
' RawName2 (String)
' RawPhone (String)
' RawAddr (String)
' RawNotes (String)
' RawBody (String)
' sb (StringBuilder)
' VmDate (String)
' VmTime (String)
' mHeader (Matcher)
' FullHeader (String)
' LastSpace (Int)
' AudioPath (String)
' EmlPath (String)
' FName (String)
' AmrName (String)
' btnPlay (Button)
' btnStop (Button)
' skbAudio (SeekBar)
' lblDate (Label)
' lblTime (Label)
' lblDuration (Label)
' xDuration (B4XView)
' TotalSecs (Int)
' txtTrans (EditText)
' TopY (Int)
' FormW (Int)
' btnCreate (Button)
' btnDel (Button)
' btnArc (Button)
' Value (Int - Parameter)
' UserChanged (Boolean - Parameter)
' TotalMs (Int)
' NewPos (Int)
' skb (SeekBar)
' RemainingSecs (Int)
' btn (Button)
' CurrentMs (Int)
' PercentComplete (Float)
' Seconds (Int - Parameter)
' Mins (Int)
' Secs (Int)
' et (EditText)
' jo (JavaObject)
' Parent (B4XView - Parameter)
' RowH (Int)
' ChkSize (Int)
' LblW (Int)
' chk (CheckBox)
' lbl (Label)
' InputX (Int)
' InputWidth (Int)
' txt (EditText)

' --- SUBROUTINE CALLS (Total: 66) ---
' xui.MsgboxAsync
' RefreshDashboard
' ScrapeQueue.Get
' ScrapeQueue.RemoveAt
' ProcessNextScrapeItem
' xui.CreatePanel
' Root.AddView
' pnlOverlay.BringToFront
' GetDeviceLayoutValues
' Min
' pnlDialog.SetColorAndBorder
' lblHeader.Initialize
' xHeader.SetTextAlignment
' btnClosePopup.Initialize
' svRight.Initialize
' pContent.Color
' pnlLeft.SetLayoutAnimated
' svRight.SetLayoutAnimated
' ScrapeData.GetDefault
' Regex.Matcher
' mHeader.Find
' mHeader.Group
' RawBody.Replace
' File.DirRootExternal
' btnPlay.Initialize
' btnStop.Initialize
' skbAudio.Initialize
' lblDate.Initialize
' lblDuration.Initialize
' txtTrans.Initialize
' pnlLeft.AddView
' File.Exists
' VMPlayer.Load
' VMPlayer.Duration
' FormatAudioTime
' AddScrapeRow
' btnCreate.Initialize
' btnDel.Initialize
' btnArc.Initialize
' pContent.AddView
' VMPlayer.IsInitialized
' VMPlayer.Position
' btn.Parent
' btn.Tag
' VMPlayer.Play
' VMPlayer.IsPlaying
' Sleep
' NumberFormat
' ToastMessageShow
' jo.RunMethod
' chk.Initialize
' lbl.Initialize
' txt.Initialize
' pnlOverlay.RemoveViewFromParent
' ScrapeQueue.Clear
' Root.As(B4XView).SetLayoutAnimated

' =========================================================
' ===          SCRAPE REVIEW UI (THE POPUP)             ===
' =========================================================

Public Sub AdvanceScrapeQueue
	If ScrapeQueue.Size = 0 Then
		xui.MsgboxAsync("All Voicemails Processed.", "Done")
		RefreshDashboard
		Return
	End If
	ScrapeMap = ScrapeQueue.Get(0)
	ScrapeQueue.RemoveAt(0)
	ProcessNextScrapeItem
End Sub

' DYNAMIC POPUP: Compact side-by-side for Fold, Stacked for S24
Public Sub ShowScrapeManualEntry(ScrapeData As Map)
	' 1. Background Overlay (Darkened)
	Dim pnlOverlay As B4XView = xui.CreatePanel("pnlScrapeReview")
	pnlOverlay.Color = 0xAA000000 ' Semi-transparent black
	Root.AddView(pnlOverlay, 0, 0, Root.Width, Root.Height)
	pnlOverlay.BringToFront
	pnlOverlay.Tag = ScrapeData ' Store for file management
	
	#If B4A
	Dim NativePnl As Panel = pnlOverlay
	NativePnl.Elevation = 10dip
	#End If

	Dim ScreenW As Int = GetDeviceLayoutValues.Width
	Dim IsBigScreen As Boolean = (ScreenW > 1300)
	
	Dim DialogW As Int
	Dim DialogH As Int

	If IsBigScreen Then
		DialogW = Min(Root.Width * 0.90, 1100dip)
		DialogH = Min(Root.Height * 0.85, 800dip)
	Else
		DialogW = Root.Width * 0.95
		DialogH = Root.Height * 0.90
	End If

	' 3. The Dialog Box (White Panel)
	Dim pnlDialog As B4XView = xui.CreatePanel("")
	pnlDialog.SetColorAndBorder(xui.Color_White, 2dip, xui.Color_Black, 10dip)
	Dim LeftPos As Int = (Root.Width - DialogW) / 2
	Dim TopPos As Int = (Root.Height - DialogH) / 2
	pnlOverlay.AddView(pnlDialog, LeftPos, TopPos, DialogW, DialogH)

	' 4. Title Header
	Dim lblHeader As Label : lblHeader.Initialize("")
	Dim xHeader As B4XView = lblHeader
	xHeader.Text = "Review Voicemail Data"
	xHeader.TextSize = 20
	xHeader.TextColor = xui.Color_Black
	lblHeader.Typeface = Typeface.DEFAULT_BOLD
	xHeader.SetTextAlignment("CENTER", "CENTER")
	pnlDialog.AddView(xHeader, 0, 10dip, DialogW, 40dip)
	
	Dim btnClosePopup As Button : btnClosePopup.Initialize("btnCloseScraper")
	btnClosePopup.Text = Chr(0xF015) ' Standard House Icon
	btnClosePopup.Typeface = Typeface.FONTAWESOME
	btnClosePopup.TextSize = 24
	btnClosePopup.Color = xui.Color_Transparent
	btnClosePopup.TextColor = xui.Color_Black
	btnClosePopup.Gravity = Gravity.CENTER
	btnClosePopup.Tag = pnlOverlay
	pnlDialog.AddView(btnClosePopup, 5dip, 10dip, 60dip, 40dip)
	
	' 5. Create Left & Right Containers
	Dim pnlLeft As B4XView = xui.CreatePanel("")
	Dim svRight As ScrollView : svRight.Initialize(0)
	pnlDialog.AddView(pnlLeft, 0, 0, 0, 0)
	pnlDialog.AddView(svRight, 0, 0, 0, 0)
	Dim pContent As B4XView = svRight.Panel
	pContent.Color = xui.Color_White
	
	' 6. Split Dimensions
	Dim HeaderH As Int = 50dip
	Dim BodyH As Int = DialogH - HeaderH - 10dip

	If IsBigScreen Then
		Dim LeftW As Int = DialogW * 0.45
		Dim RightW As Int = DialogW - LeftW
		pnlLeft.SetLayoutAnimated(0, 5dip, HeaderH, LeftW - 5dip, BodyH)
		svRight.SetLayoutAnimated(0, LeftW + 5dip, HeaderH, RightW - 10dip, BodyH)
		pContent.Width = RightW - 10dip
	Else
		Dim TopH As Int = BodyH * 0.40
		Dim BotH As Int = BodyH - TopH
		pnlLeft.SetLayoutAnimated(0, 5dip, HeaderH, DialogW - 10dip, TopH)
		svRight.SetLayoutAnimated(0, 5dip, HeaderH + TopH, DialogW - 10dip, BotH)
		pContent.Width = DialogW - 10dip
	End If

	' 7. EXTRACT DATA & FILE PATHS
	Dim RawName As String = ScrapeData.GetDefault("Name", "")
	Dim RawName2 As String = ScrapeData.GetDefault("Name2", "")
	Dim RawPhone As String = ScrapeData.GetDefault("Phone", "")
	Dim RawAddr As String = ScrapeData.GetDefault("Address", "")
	Dim RawNotes As String = ScrapeData.GetDefault("Notes", "")
	
	Dim RawBody As String = ""
	If ScrapeData.ContainsKey("BodyBuilder") Then
		Dim sb As StringBuilder = ScrapeData.Get("BodyBuilder")
		RawBody = sb.ToString
	Else
		RawBody = ScrapeData.GetDefault("Body", "")
	End If
	
	' DATE/TIME PARSER
	Dim VmDate As String = "Unknown"
	Dim VmTime As String = "Unknown"
	Dim mHeader As Matcher = Regex.Matcher("--- \[(.*?)\] ---", RawBody)
	If mHeader.Find Then
		Dim FullHeader As String = mHeader.Group(1)
		Dim LastSpace As Int = FullHeader.LastIndexOf(" ")
		If LastSpace > 0 Then
			VmDate = FullHeader.SubString2(0, LastSpace).Trim
			VmTime = FullHeader.SubString(LastSpace).Trim
		Else
			VmDate = FullHeader
		End If
		RawBody = RawBody.Replace(mHeader.Match, "").Trim
	End If

	Dim AudioPath As String = ""
	If ScrapeData.ContainsKey("FilePath") Then
		Dim EmlPath As String = ScrapeData.Get("FilePath")
		Dim FName As String = EmlPath.SubString(EmlPath.LastIndexOf("/") + 1)
		Dim AmrName As String = FName.Replace(".eml", ".amr")
		AudioPath = File.DirRootExternal & "/VisualVoiceMail/" & AmrName
	End If

	' 8. POPULATE LEFT SIDE (Audio + Transcript)
	' --- Component 0: Play Button ---
	Dim btnPlay As Button : btnPlay.Initialize("btnPlayVM")
	btnPlay.Text = Chr(0xF04B) & " Play"
	btnPlay.Typeface = Typeface.FONTAWESOME
	btnPlay.Color = 0xFF2E7D32
	btnPlay.Tag = AudioPath
	pnlLeft.AddView(btnPlay, 0, 0, (pnlLeft.Width / 2) - 5dip, 35dip)
	
	' --- Component 1: Stop Button ---
	Dim btnStop As Button : btnStop.Initialize("btnStopVM")
	btnStop.Text = Chr(0xF04D) & " Stop"
	btnStop.Typeface = Typeface.FONTAWESOME
	btnStop.Color = 0xFFD32F2F
	pnlLeft.AddView(btnStop, (pnlLeft.Width / 2) + 5dip, 0, (pnlLeft.Width / 2) - 5dip, 35dip)
	
	' --- Component 2: Audio Slider (SeekBar) ---
	Dim skbAudio As SeekBar : skbAudio.Initialize("skbAudio")
	skbAudio.Max = 100 ' Percentage based
	skbAudio.Value = 0
	pnlLeft.AddView(skbAudio, 0, 40dip, pnlLeft.Width, 30dip)
	
	' --- Component 3: Date Label (Shifted to 75dip) ---
	Dim lblDate As Label : lblDate.Initialize("")
	lblDate.Text = "Date: " & VmDate
	lblDate.TextSize = 13
	lblDate.Typeface = Typeface.DEFAULT_BOLD
	lblDate.TextColor = xui.Color_DarkGray
	lblDate.Gravity = Gravity.CENTER_VERTICAL
	pnlLeft.AddView(lblDate, 5dip, 75dip, pnlLeft.Width - 10dip, 30dip)
	
	' --- Component 4: Time Label (Shifted to 105dip) ---
	Dim lblTime As Label : lblTime.Initialize("")
	lblTime.Text = "Time: " & VmTime
	lblTime.TextSize = 13
	lblTime.Typeface = Typeface.DEFAULT_BOLD
	lblTime.TextColor = xui.Color_DarkGray
	lblTime.Gravity = Gravity.CENTER_VERTICAL
	pnlLeft.AddView(lblTime, 5dip, 105dip, pnlLeft.Width - 10dip, 30dip)
	
	' --- Component 5: Duration Label (Shifted to 135dip) ---
	Dim lblDuration As Label : lblDuration.Initialize("")
	Dim xDuration As B4XView = lblDuration
	xDuration.Tag = "lblVM_Duration" ' Tagged for the timer loop
	xDuration.Text = "Duration: 00:00"
	xDuration.TextSize = 13
	lblDuration.Typeface = Typeface.DEFAULT_BOLD
	xDuration.TextColor = xui.Color_DarkGray
	lblDuration.Gravity = Gravity.CENTER_VERTICAL
	pnlLeft.AddView(xDuration, 5dip, 135dip, pnlLeft.Width - 10dip, 30dip)
	
	' --- Component 6: Transcript (Shifted to 165dip) ---
	Dim txtTrans As EditText : txtTrans.Initialize("txtTrans")
	txtTrans.Text = RawBody
	txtTrans.TextSize = 14
	txtTrans.TextColor = xui.Color_DarkGray
	txtTrans.Color = 0xFFECEFF1 ' Light Grey Bg
	txtTrans.SingleLine = False
	txtTrans.Wrap = True
	txtTrans.Gravity = Gravity.TOP + Gravity.LEFT
	pnlLeft.AddView(txtTrans, 0, 165dip, pnlLeft.Width, pnlLeft.Height - 170dip)
	
	' LOAD AUDIO DURATION IMMEDIATELY
	If File.Exists("", AudioPath) Then
		VMPlayer.Load("", AudioPath)
		Dim TotalSecs As Int = VMPlayer.Duration / 1000
		xDuration.Text = "Duration: " & FormatAudioTime(TotalSecs)
		xDuration.Tag = TotalSecs ' Save total in tag for reset
	End If
	
	' 9. POPULATE RIGHT SIDE (Checkboxes + Inputs)
	Dim TopY As Int = 0dip
	Dim FormW As Int = pContent.Width

	TopY = AddScrapeRow(pContent, TopY, FormW, "Name #1:", RawName, "chkName1", "txtName1")
	TopY = AddScrapeRow(pContent, TopY, FormW, "Name #2:", RawName2, "chkName2", "txtName2")
	TopY = AddScrapeRow(pContent, TopY, FormW, "Phone #1:", RawPhone, "chkPhone1", "txtPhone1")
	TopY = AddScrapeRow(pContent, TopY, FormW, "Phone #2:", "", "chkPhone2", "txtPhone2")
	TopY = AddScrapeRow(pContent, TopY, FormW, "Address:", RawAddr, "chkAddr", "txtAddr")
	TopY = AddScrapeRow(pContent, TopY, FormW, "Issue:", RawNotes, "chkIssue", "txtIssue")

	' 10. ACTION BUTTONS
	TopY = TopY + 20dip
	
	Dim btnCreate As Button : btnCreate.Initialize("btnScrapeCreate")
	btnCreate.Text = "USE SELECTED DATA TO CREATE CLIENT"
	btnCreate.Color = 0xFF2E7D32
	btnCreate.Tag = pnlOverlay
	pContent.AddView(btnCreate, 10dip, TopY, FormW - 20dip, 60dip)
	TopY = TopY + 70dip
	
	Dim btnDel As Button : btnDel.Initialize("btnScrapeDelete")
	btnDel.Text = "SKIP THIS VOICEMAIL & DELETE FOREVER"
	btnDel.Color = 0xFFD32F2F
	btnDel.Tag = pnlOverlay
	pContent.AddView(btnDel, 10dip, TopY, FormW - 20dip, 60dip)
	TopY = TopY + 70dip
	
	Dim btnArc As Button : btnArc.Initialize("btnScrapeArchive")
	btnArc.Text = "ARCHIVE VOICEMAIL & TRANSCRIPT"
	btnArc.Color = 0xFF1976D2
	btnArc.Tag = pnlOverlay
	pContent.AddView(btnArc, 10dip, TopY, FormW - 20dip, 60dip)
	TopY = TopY + 80dip
	
	pContent.Height = TopY
End Sub

' [NEW] Scrub/Seek Logic for the Slider
Sub skbAudio_ValueChanged (Value As Int, UserChanged As Boolean)
	' Only trigger if the USER moved it, not the timer loop
	If UserChanged And VMPlayer.IsInitialized Then
		Dim TotalMs As Int = VMPlayer.Duration
		If TotalMs > 0 Then
			' Calculate the new millisecond position based on slider percentage
			Dim NewPos As Int = (Value / 100.0) * TotalMs
			VMPlayer.Position = NewPos
			
			' Update the countdown label instantly for responsive UI
			Dim skb As SeekBar = Sender
			Dim pnlLeft As B4XView = skb.Parent
			Dim xDurLabel As B4XView = pnlLeft.GetView(5)
			
			Dim TotalSecs As Int = TotalMs / 1000
			Dim CurrentSecs As Int = NewPos / 1000
			Dim RemainingSecs As Int = TotalSecs - CurrentSecs
			If RemainingSecs < 0 Then RemainingSecs = 0
			xDurLabel.Text = "Duration: " & FormatAudioTime(RemainingSecs)
		End If
	End If
End Sub

' [UPDATED] AUDIO PLAYBACK TICKER LOOP (Now controls the Slider)
Sub btnPlayVM_Click
	Dim btn As Button = Sender
	Dim AudioPath As String = btn.Tag
	Dim pnlLeft As B4XView = btn.Parent
	
	' Grab the views by their new updated index numbers
	Dim xSlider As SeekBar = pnlLeft.GetView(2)
	Dim xDurLabel As B4XView = pnlLeft.GetView(5)

	If File.Exists("", AudioPath) Then
		VMPlayer.Load("", AudioPath)
		VMPlayer.Play
		
		Dim TotalMs As Int = VMPlayer.Duration
		Dim TotalSecs As Int = TotalMs / 1000

		' Native Asynchronous Ticker Loop
		Do While VMPlayer.IsPlaying
			Dim CurrentMs As Int = VMPlayer.Position
			Dim RemainingSecs As Int = (TotalMs - CurrentMs) / 1000
			If RemainingSecs < 0 Then RemainingSecs = 0
			xDurLabel.Text = "Duration: " & FormatAudioTime(RemainingSecs)
			
			' Move the slider dynamically
			If TotalMs > 0 Then
				Dim PercentComplete As Float = (CurrentMs / TotalMs) * 100
				xSlider.Value = PercentComplete
			End If
			
			Sleep(100) ' Wait 100ms before next tick
		Loop
		
		' Reset back to Start when finished
		xDurLabel.Text = "Duration: " & FormatAudioTime(TotalSecs)
		xSlider.Value = 0
	End If
End Sub

Sub btnStopVM_Click
	If VMPlayer.IsPlaying Then
		VMPlayer.Pause
		ToastMessageShow("Playback Stopped", False)
	End If
End Sub

Private Sub FormatAudioTime(Seconds As Int) As String
	Dim Mins As Int = Seconds / 60
	Dim Secs As Int = Seconds Mod 60
	Return NumberFormat(Mins, 2, 0) & ":" & NumberFormat(Secs, 2, 0)
End Sub

' Uses Native Inline Java. No libraries required.
Sub txtTrans_LongClick
	Dim et As EditText = Sender
	If et.Text <> "" Then
		Dim jo As JavaObject = Me
		jo.RunMethod("setClipboardText", Array(et.Text))
		ToastMessageShow("Transcript copied to clipboard!", False)
	End If
End Sub

Private Sub AddScrapeRow(Parent As B4XView, Top As Int, ParentWidth As Int, LblText As String, Val As String, ChkTag As String, TxtTag As String) As Int
	Dim RowH As Int = 50dip
	Dim ChkSize As Int = 40dip
	Dim LblW As Int = 70dip
	
	Dim chk As CheckBox : chk.Initialize("")
	chk.Checked = (Val <> "")
	chk.Tag = ChkTag
	Parent.AddView(chk, 0, Top + 5dip, ChkSize, ChkSize)
	
	Dim lbl As Label : lbl.Initialize("")
	lbl.Text = LblText
	lbl.TextSize = 12
	lbl.TextColor = xui.Color_DarkGray
	lbl.Gravity = Gravity.CENTER_VERTICAL
	Parent.AddView(lbl, ChkSize, Top, LblW, RowH)
	
	Dim InputX As Int = ChkSize + LblW
	Dim InputWidth As Int = ParentWidth - InputX
	
	Dim txt As EditText : txt.Initialize("")
	txt.Text = Val
	txt.Tag = TxtTag
	txt.Color = xui.Color_White
	txt.TextColor = xui.Color_Black
	txt.TextSize = 14
	txt.Gravity = Gravity.CENTER_VERTICAL
	Parent.AddView(txt, InputX, Top + 5dip, InputWidth, RowH - 10dip)
	
	Return Top + RowH
End Sub

Sub btnCloseScraper_Click
	Dim btn As Button = Sender
	Dim pnlOverlay As B4XView = btn.Tag
	pnlOverlay.RemoveViewFromParent
	
	ScrapeQueue.Clear
	Root.As(B4XView).SetLayoutAnimated(0, 0, 0, Root.Width, Root.Height)
	RefreshDashboard
End Sub
'//END-B4XMainPage-S12>






'//<START-B4XMainPage-S13>
' =========================================================
' ===           SECTION S13: MASTER BREAKDOWN           ===
' =========================================================

' --- SUBROUTINE DECLARATIONS (Total: 6) ---
' Sub btnScrapeCreate_Click
' Private Sub CheckTrafficCop(FinalMap As Map)
' Private Sub CheckDuplicateField(Query As String) As ResumableSub
' Public Sub btnScrapeDelete_Click
' Public Sub btnScrapeArchive_Click
' Public Sub setClipboardText(text As String) ' Java Helper

' --- VARIABLE DECLARATIONS (Total: 34) ---
' btn (Button)
' pnlOverlay (B4XView)
' ScrapeData (Map)
' pnlDialog (B4XView)
' svView (B4XView)
' pContent (B4XView)
' FinalMap (Map)
' v (B4XView - For Each loop)
' t (String)
' Key (String)
' ChkTag (String)
' IsChecked (Boolean)
' v2 (B4XView - Nested For Each loop)
' c (CheckBox)
' FinalMap (Map - Parameter)
' SearchPhone (String)
' SearchName (String)
' SearchAddr (String)
' FoundMatch (Boolean)
' MatchedQuery (String)
' CleanAddr (String)
' Result (Boolean - Wait Result)
' Query (String - Parameter)
' su (StringUtils)
' j (HttpJob)
' HasDuplicate (Boolean)
' parser (JSONParser)
' jsonRoot (Map)
' results (List)
' text (String - Java Parameter)
' clipboard (ClipboardManager)
' clip (ClipData)
' context (Context)

' --- SUBROUTINE CALLS (Total: 41) ---
' Log
' btn.Tag
' pnlOverlay.Tag
' pnlOverlay.GetView
' pnlDialog.GetView
' svView.GetView
' FinalMap.Initialize
' pContent.GetAllViewsRecursive
' v.Tag.StartsWith
' v.Tag.SubString
' c.Checked
' FinalMap.Put
' pnlOverlay.RemoveViewFromParent
' Root.As(B4XView).SetLayoutAnimated
' lstTodayApts.GetBase.As(View).Invalidate
' CheckTrafficCop
' xui.MsgboxAsync
' ProgressDialogShow
' FinalMap.GetDefault
' CheckDuplicateField
' ProgressDialogHide
' B4XPages.ShowPage
' PerformSearch
' clientCreator.PopulateScrapeData
' su.EncodeUrl
' j.Initialize
' j.Download
' j.GetRequest.SetHeader
' parser.Initialize
' parser.NextObject
' jsonRoot.ContainsKey
' jsonRoot.Get
' j.Release
' ScrapedApptIssue.Equals
' DeleteVoicemail
' ArchiveVoicemail
' AdvanceScrapeQueue
' jo.RunMethod (setClipboardText)
' ToastMessageShow
' BA.applicationContext.getSystemService
' ClipData.newPlainText
' clipboard.setPrimaryClip

' =========================================================
' ===            SCRAPER TRAFFIC COP (SAVE)             ===
' =========================================================

' BUTTON 1: Use Selected Data (The 3-Strike Traffic Cop)
Sub btnScrapeCreate_Click
	Log(">>> [CRASH TRACKER] btnScrapeCreate_Click STARTED")
	Try
		Dim btn As Button = Sender
		Dim pnlOverlay As B4XView = btn.Tag
		Dim ScrapeData As Map = pnlOverlay.Tag
		
		Dim pnlDialog As B4XView = pnlOverlay.GetView(0)
		Dim svView As B4XView = pnlDialog.GetView(3)
		Dim pContent As B4XView = svView.GetView(0)
		
		Dim FinalMap As Map : FinalMap.Initialize
		ScrapedApptIssue = "" ' Reset Global
		
		Log(">>> [CRASH TRACKER] Harvesting Inputs...")
		' 1. Harvest Checked Fields
		For Each v As B4XView In pContent.GetAllViewsRecursive
			If v.Tag Is String Then
				Dim t As String = v.Tag
				If t.StartsWith("txt") Then
					Dim Key As String = t.SubString(3) ' Name1, Phone1...
					Dim ChkTag As String = "chk" & Key
					Dim IsChecked As Boolean = False
					
					For Each v2 As B4XView In pContent.GetAllViewsRecursive
						If v2.Tag Is String Then
							If v2.Tag = ChkTag Then
								Dim c As CheckBox = v2
								IsChecked = c.Checked
								Exit
							End If
						End If
					Next
					
					If IsChecked Then
						If Key = "Name1" Then FinalMap.Put("Name", v.Text)
						If Key = "Name2" Then FinalMap.Put("Name2", v.Text)
						If Key = "Phone1" Then FinalMap.Put("Phone", v.Text)
						If Key = "Phone2" Then FinalMap.Put("Phone2", v.Text)
						If Key = "Addr" Then FinalMap.Put("Address", v.Text)
						If Key = "Issue" Then
							' Pass it directly to the FinalMap AND set the Global Var
							FinalMap.Put("Issue", v.Text)
							ScrapedApptIssue = v.Text
						End If
					End If
				End If
			End If
		Next
		
		FinalMap.Put("IsScrapeWorkflow", True)
		FinalMap.Put("OriginalScrapeData", ScrapeData)
		
		' Close UI
		pnlOverlay.RemoveViewFromParent
		Root.As(B4XView).SetLayoutAnimated(0, 0, 0, Root.Width, Root.Height)
		#If B4A
		lstTodayApts.GetBase.As(View).Invalidate
		#End If
		
		Log(">>> [CRASH TRACKER] Launching Traffic Cop...")
		CheckTrafficCop(FinalMap)
		
	Catch
		Log(">>> [CRITICAL CRASH TRAPPED] Error in btnScrapeCreate_Click: " & LastException)
		xui.MsgboxAsync("Error processing voicemail: " & LastException.Message, "System Error")
	End Try
End Sub

Private Sub CheckTrafficCop(FinalMap As Map)
	Log(">>> [CRASH TRACKER] CheckTrafficCop STARTED")
	Try
		ProgressDialogShow("Traffic Cop: Checking for existing client...")
		
		Dim SearchPhone As String = FinalMap.GetDefault("Phone", "")
		Dim SearchName As String = FinalMap.GetDefault("Name", "")
		Dim SearchAddr As String = FinalMap.GetDefault("Address", "")
		
		Dim FoundMatch As Boolean = False
		Dim MatchedQuery As String = ""

		' --- STRIKE 1: Check Phone ---
		If SearchPhone <> "" And FoundMatch = False Then
			Wait For (CheckDuplicateField(SearchPhone)) Complete (Result As Boolean)
			If Result Then
				FoundMatch = True
				MatchedQuery = SearchPhone
			End If
		End If

		' --- STRIKE 2: Check Name ---
		If SearchName <> "" And FoundMatch = False Then
			Wait For (CheckDuplicateField(SearchName)) Complete (Result As Boolean)
			If Result Then
				FoundMatch = True
				MatchedQuery = SearchName
			End If
		End If

		' --- STRIKE 3: Check Address ---
		If SearchAddr <> "" And FoundMatch = False Then
			Dim CleanAddr As String = SearchAddr
			If CleanAddr.Contains(",") Then CleanAddr = CleanAddr.SubString2(0, CleanAddr.IndexOf(","))
			Wait For (CheckDuplicateField(CleanAddr)) Complete (Result As Boolean)
			If Result Then
				FoundMatch = True
				MatchedQuery = CleanAddr
			End If
		End If

		ProgressDialogHide

		' --- ROUTE TRAFFIC ---
		If FoundMatch Then
			xui.MsgboxAsync("Existing client found in database. Loading profile...", "Traffic Cop")
			B4XPages.ShowPage("SearchPage")
			PerformSearch(MatchedQuery)
		Else
			B4XPages.ShowPage("CreateClientPage")
			CallSub2(clientCreator, "PopulateScrapeData", FinalMap)
		End If
		
	Catch
		ProgressDialogHide
		Log(">>> [CRITICAL CRASH TRAPPED] Error in CheckTrafficCop: " & LastException)
		xui.MsgboxAsync("Database check failed. Routing to New Client. Error: " & LastException.Message, "System Error")
		B4XPages.ShowPage("CreateClientPage")
		CallSub2(clientCreator, "PopulateScrapeData", FinalMap)
	End Try
End Sub

Private Sub CheckDuplicateField(Query As String) As ResumableSub
	If OAuth2.access_token = "" Then Return False
	
	Dim su As StringUtils
	Dim j As HttpJob : j.Initialize("", Me)
	j.Download("https://people.googleapis.com/v1/people:searchContacts?query=" & su.EncodeUrl(Query, "UTF8") & "&readMask=names")
	j.GetRequest.SetHeader("Authorization", "Bearer " & OAuth2.access_token)
	
	Wait For (j) JobDone(j As HttpJob)
	
	Dim HasDuplicate As Boolean = False
	If j.Success Then
		Dim parser As JSONParser : parser.Initialize(j.GetString)
		Dim jsonRoot As Map = parser.NextObject
		If jsonRoot.ContainsKey("results") Then
			Dim results As List = jsonRoot.Get("results")
			If results.Size > 0 Then HasDuplicate = True
		End If
	End If
	j.Release
	Return HasDuplicate
End Sub

' BUTTON 2: Delete & Skip
Public Sub btnScrapeDelete_Click
	Dim btn As Button = Sender
	Dim pnlOverlay As B4XView = btn.Tag
	Dim ScrapeData As Map = pnlOverlay.Tag
	
	ScrapedApptIssue = ""
	
	DeleteVoicemail(ScrapeData)
	pnlOverlay.RemoveViewFromParent
	
	Root.As(B4XView).SetLayoutAnimated(0, 0, 0, Root.Width, Root.Height)
	#If B4A
	lstTodayApts.GetBase.As(View).Invalidate
	#End If
	
	AdvanceScrapeQueue
End Sub

' BUTTON 3: Archive & Skip
Public Sub btnScrapeArchive_Click
	Dim btn As Button = Sender
	Dim pnlOverlay As B4XView = btn.Tag
	Dim ScrapeData As Map = pnlOverlay.Tag
	
	ScrapedApptIssue = ""
	ArchiveVoicemail(ScrapeData)
	pnlOverlay.RemoveViewFromParent
	
	Root.As(B4XView).SetLayoutAnimated(0, 0, 0, Root.Width, Root.Height)
	#If B4A
	lstTodayApts.GetBase.As(View).Invalidate
	#End If
	
	AdvanceScrapeQueue
End Sub

' [NEW] NATIVE ANDROID CLIPBOARD (No external libraries required)
#If JAVA
import android.content.ClipboardManager;
import android.content.ClipData;
import android.content.Context;

public void setClipboardText(String text) {
    ClipboardManager clipboard = (ClipboardManager) BA.applicationContext.getSystemService(Context.CLIPBOARD_SERVICE);
    ClipData clip = ClipData.newPlainText("Transcript", text);
    clipboard.setPrimaryClip(clip);
}
#End If
'Total Subroutines in Section S13 - 10
'//<END-B4XMainPage-S13>






'//<START-B4XMainPage-S14>
' =========================================================
' ===            SECTION S14: MASTER BREAKDOWN            ===
' =========================================================

' --- SUBROUTINE DECLARATIONS (Total: 1) ---
' Sub JobDone (Job As HttpJob)

' --- VARIABLE DECLARATIONS (Total: 7) ---
' Job (HttpJob - Parameter)
' parser (JSONParser)
' rootMap (Map)
' items (List)
' LedgerID (String)
' user (String)
' SentTime (String)

' --- SUBROUTINE CALLS (Total: 41) ---
' Log
' HandleFetchDashboard
' HandleListGroups
' CloseOut_Helper_Step3
' HandleSearchContact
' HandleFetchAllConnections
' HandleSearchDate
' HandleSearchForID
' HandleCalendarSuccess
' HandleGetSource
' HandleCreateNew
' HandleCopyTemplate
' HandleUpdateSheet
' HandleGenerateMonths
' HandleSearchLedgerFiles
' HandleGetSheetMetadata
' BatchGetLedger
' CloseOut_Finished
' HandleCreateLedger
' HandlePopulateLedger
' HandleGeocode
' CloseOut_Helper_Step4
' HandleVisionOCR
' HandleUploadReceipt
' HandleGetReceiptLink
' HandleAppendExpense
' Job.ErrorMessage.Contains
' OAuth2.access_token (Reset)
' xui.MsgboxAsync
' Job.Release
' ProgressDialogHide
' B4XPages.AddPage
' Starter.GroupID_Client
' Starter.GroupID_Preferred
' Starter.GroupID_Blacklisted
' File.Exists
' File.ReadString
' NumberFormat2
' DateTime.Date
' DateTime.Time
' DateTime.Now

' ===========================================================
' ===            MASTER JOB HANDLER (SECTION 11)          ===
' ===========================================================

Sub JobDone (Job As HttpJob)
	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)

	If Job.Success Then
		Select Job.JobName
			' --- Dashboard ---
			Case "FetchDashboard"
				HandleFetchDashboard(Job)

			' --- Contact Management ---
			Case "ListGroups"
				HandleListGroups(Job)
			Case "CreateGroup"
				Log("Contact group created successfully")
			Case "CreateNewContact"
				HandleCreateNewContact(Job)
			Case "UpdateContact"
				HandleUpdateContact(Job)
			Case "UpdateContactAfterClose"
				Log("Contact updated after closeout")
				CloseOut_Helper_Step3(Job.Tag)

			' --- Search & Calendar ---
			Case "SearchContact"
				HandleSearchContact(Job)
			Case "FetchAllConnections"
				HandleFetchAllConnections(Job)
			Case "SearchDate"
				HandleSearchDate(Job)
			Case "SearchContactForID"
				HandleSearchForID(Job)
			Case "CreateAppointment", "CreateCalendarEvent"
				HandleCalendarSuccess(Job)

			' --- Ledger Management ---
			Case "GetSource"
				HandleGetSource(Job)
			Case "CreateNew"
				HandleCreateNew(Job)
			Case "CopyTemplate"
				HandleCopyTemplate(Job)
			Case "UpdateSheet"
				HandleUpdateSheet(Job)
			Case "GenerateMonths"
				HandleGenerateMonths(Job)
			Case "SearchLedgerFiles"
				HandleSearchLedgerFiles(Job)
			Case "GetSheetMetadata"
				HandleGetSheetMetadata(Job)
			Case "BatchGetLedger"
				BatchGetLedger(Job)
			Case "AppendToLedger"
				CloseOut_Finished(Job.Tag)
			Case "CreateLedger"
				HandleCreateLedger(Job)
			Case "PopulateLedger"
				HandlePopulateLedger(Job)

			' --- GPS & Geocoding ---
			Case "Geocode"
				HandleGeocode(Job)

			' --- CloseOut Flow ---
			Case "UpdateCalendarColor"
				CloseOut_Helper_Step4(Job.Tag)

			' --- Expense Module ---
			Case "VisionOCR"
				HandleVisionOCR(Job)
			Case "UploadReceipt"
				HandleUploadReceipt(Job)
			Case "GetReceiptLink"
				HandleGetReceiptLink(Job)
			Case "AppendExpense"
				HandleAppendExpense(Job)

			' --- Stats ---
			Case "FetchStats"
				Log("Stats fetched")

			Case Else
				Log("Unhandled job: " & Job.JobName)
		End Select
	Else
		Log("Job Error [" & Job.JobName & "]: " & Job.ErrorMessage)

		' Handle 401 Unauthorized - Token Expired
		If Job.ErrorMessage.Contains("401") Or Job.ErrorMessage.Contains("UNAUTHENTICATED") Then
			Log("Token Expired. Resetting.")
			OAuth2.access_token = ""
			lblStatus.Text = "Session Expired. Please Login."
			xui.MsgboxAsync("Your session has expired. Please tap 'Login' to reconnect.", "Session Expired")
			btnLogin.Visible = True
			Job.Release
			Return
		End If

		' Show error for critical operations
		Select Job.JobName
			Case "FetchDashboard"
				lblStatus.Text = "Status: Error Loading"
				lblStatus.TextColor = 0xFFD32F2F
			Case "CreateNewContact"
				xui.MsgboxAsync("Failed to create contact: " & Job.ErrorMessage, "Error")
			Case "VisionOCR"
				xui.MsgboxAsync("OCR Failed. Please enter details manually.", "Error")
			Case "UploadReceipt"
				ProgressDialogHide
				xui.MsgboxAsync("Image Upload Failed: " & Job.ErrorMessage, "Error")
			Case "AppendExpense"
				ProgressDialogHide
				xui.MsgboxAsync("Sheet Update Failed: " & Job.ErrorMessage, "Error")
		End Select
	End If

	Job.Release
End Sub
'Total Subroutines in Section S14 recorded last edit: 1
'Total Subroutines in Section S14 recorded after this edit - 1
'Total Subroutines added in this edit - 0
'Total Subroutines removed in this edit - 0
'Difference between edits - 0
'Total Discrepancies - 0
'Total lines of code in this section prior to edit - 139
'Total lines of code in this section now - 139
'Lines added / Subtracted in this edit - 0
'//<END-B4XMainPage-S14>





'//<START-B4XMainPage-S15>
' =========================================================
' ===            SECTION S15: MASTER BREAKDOWN            ===
' =========================================================

' --- SUBROUTINE DECLARATIONS (Total: 5) ---
' Public Sub StartGestures
' Public Sub StopGestures
' Sub GestureShake_SensorChanged (Values() As Float)
' Private Sub ToggleFlashlight
' public void setTorchMode(boolean enabled) ' Java Helper

' --- VARIABLE DECLARATIONS (Total: 12) ---
' Values (Float Array - Parameter)
' X (Float)
' Y (Float)
' Z (Float)
' GForce (Float)
' Now (Long)
' pv (PhoneVibrate)
' jo (JavaObject)
' enabled (boolean - Java Parameter)
' context (Context)
' camManager (CameraManager)
' cameraId (String)

' --- SUBROUTINE CALLS (Total: 19) ---
' SensorShake.StartListening
' Log
' SensorShake.StopListening
' Sqrt
' DateTime.Now
' ToggleFlashlight
' NumberFormat
' pv.Vibrate
' jo.RunMethod
' ToastMessageShow
' BA.applicationContext
' context.getSystemService
' camManager.getCameraIdList
' camManager.setTorchMode
' NumberFormat
' DateTime.Now
' Log (Gesture status)
' Log (Chop detection)
' Log (Torch action)

' =========================================================
' ===             GESTURE ENGINE (CHOP FOR LIGHT)       ===
' =========================================================

Public Sub StartGestures
	Try
		SensorShake.StartListening("GestureShake")
		Log(">>> [GESTURE] Listening for Chop...")
	Catch
		Log(">>> [GESTURE] Error starting sensor: " & LastException)
	End Try
End Sub

Public Sub StopGestures
	SensorShake.StopListening
	Log(">>> [GESTURE] Sensor Stopped.")
End Sub

' --- THE CHOP LOGIC ---
' Detects rapid linear acceleration (The "Karate Chop" motion)
Sub GestureShake_SensorChanged (Values() As Float)
	Dim X As Float = Values(0)
	Dim Y As Float = Values(1)
	Dim Z As Float = Values(2)
    
	' Calculate G-Force Magnitude (Vector)
	Dim GForce As Float = Sqrt(X*X + Y*Y + Z*Z)
    
    ' [DEBUG] Log G-Force only if it's significant (to avoid spam)
    If GForce > 15 Then
        Log(">>> [GESTURE DEBUG] High G-Force Detected: " & NumberFormat(GForce, 1, 2))
    End If
    
	' Threshold: 28.0 is a hard shake (Gravity is ~9.8)
	If GForce > 28 Then
		Dim Now As Long = DateTime.Now
        
		' Debounce: Prevent flickering (wait 500ms between toggles)
		If (Now - LastShakeTime) > 500 Then
			LastShakeTime = Now
			Log(">>> [GESTURE] CHOP CONFIRMED! Toggling Flashlight...")
			ToggleFlashlight
            
			' Feedback Vibration (Short Pulse)
			Dim pv As PhoneVibrate
			pv.Vibrate(100)
		End If
	End If
End Sub

' --- HARDWARE ACTION ---

Private Sub ToggleFlashlight
	Try
		Dim jo As JavaObject = Me
		IsTorchOn = Not(IsTorchOn)
        
		If IsTorchOn Then
			Log(">>> [GESTURE] Requesting Torch: ON")
			jo.RunMethod("setTorchMode", Array(True))
			ToastMessageShow("🔦 ON", False)
		Else
			Log(">>> [GESTURE] Requesting Torch: OFF")
			jo.RunMethod("setTorchMode", Array(False))
			ToastMessageShow("🔦 OFF", False)
		End If
	Catch
		Log(">>> [GESTURE] B4A ToggleFlashlight Error: " & LastException)
	End Try
End Sub

#If JAVA
import android.hardware.camera2.CameraManager;
import android.content.Context;

public void setTorchMode(boolean enabled) {
    try {
        BA.Log(">>> [JAVA] setTorchMode Called. Enabled: " + enabled);
        Context context = BA.applicationContext;
        CameraManager camManager = (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);
        
        if (camManager == null) {
            BA.Log(">>> [JAVA] CameraManager is NULL!");
            return;
        }
        
        String[] ids = camManager.getCameraIdList();
        if (ids == null || ids.length == 0) {
             BA.Log(">>> [JAVA] No Camera IDs found!");
             return;
        }
        
        String cameraId = ids[0]; // Usually 0 is back camera
        BA.Log(">>> [JAVA] Using Camera ID: " + cameraId);
        
        camManager.setTorchMode(cameraId, enabled);
        BA.Log(">>> [JAVA] Torch Mode Set Successfully.");
        
    } catch (Exception e) {
        BA.Log(">>> [JAVA] CRITICAL Torch Error: " + e.toString());
        e.printStackTrace();
    }
}
#End If
'Total Subroutines in Section S15 recorded last edit: 5
'Total Subroutines in Section S15 recorded after this edit - 5
'Total Subroutines added in this edit - 0
'Total Subroutines removed in this edit - 0
'Difference between edits - 0
'Total Discrepancies - 0
'Total lines of code in this section prior to edit - 98
'Total lines of code in this section now - 110
'Lines added / Subtracted in this edit - +12
'//<END-B4XMainPage-S15>