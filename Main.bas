'//<START-Main-S01>
#Region  Project Attributes 
	#ApplicationLabel: Geek God CRM
	#VersionCode: 1
	#VersionName: 1.00
	'SupportedOrientations possible values: unspecified, landscape or portrait.
	#SupportedOrientations: unspecified
	#CanInstallToExternalStorage: False
	
	'DEPENDENCY CONFIGURATION FOR FOLDABLE SUPPORT
	'Use "+" to accept any installed version
	#AdditionalJar: androidx.window:window-java
	#AdditionalJar: androidx.window:window
	
	'Core Android Infrastructure
	#AdditionalJar: androidx.core:core
	#AdditionalJar: androidx.collection:collection
	#AdditionalJar: androidx.annotation:annotation
	#AdditionalJar: androidx.lifecycle:lifecycle-runtime
	
	'Kotlin Runtime Environment
	#AdditionalJar: org.jetbrains.kotlin:kotlin-stdlib
	#AdditionalJar: org.jetbrains.kotlin:kotlin-stdlib-jdk8
	#AdditionalJar: org.jetbrains.kotlinx:kotlinx-coroutines-android
	#AdditionalJar: org.jetbrains.kotlinx:kotlinx-coroutines-core
#End Region

#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
	#BridgeLogger: True
#End Region

Sub Process_Globals
	Public ActionBarHomeClicked As Boolean
End Sub

Sub Globals
	'Fix: pm must be declared here to persist across lifecycle events
	Private pm As B4XPagesManager
End Sub

Sub Activity_Create(FirstTime As Boolean)
	pm.Initialize(Activity)
End Sub

Sub Activity_Resume
	pm.Activity_Resume
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	pm.Activity_Pause
End Sub

Sub Activity_PermissionResult (Permission As String, Result As Boolean)
	B4XPages.Delegate.Activity_PermissionResult(Permission, Result)
End Sub

Sub Create_Menu (Menu As Object)
	pm.Create_Menu(Menu)
End Sub

Sub Activity_ActionBarHomeClick
	ActionBarHomeClicked = True
	B4XPages.Delegate.Activity_ActionBarHomeClick
	ActionBarHomeClicked = False
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	Return B4XPages.Delegate.Activity_KeyPress(KeyCode)
End Sub

'Total Subroutines in Section S01 recorded last edit: 8
'Total Subroutines in Section S01 recorded after this edit - 9
'Total Subroutines added in this edit - 1
'Total Subroutines removed in this edit - 0
'Difference between edits- +1
'Total Discrepancies - 0
'Total lines of code in this section prior to edit - 65
'Total lines of code in this section now - 66
'Lines added / Subtracted in this edit - +1
'//<END-Main-S01>