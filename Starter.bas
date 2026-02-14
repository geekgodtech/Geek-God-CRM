B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=9.85
@EndOfDesignText@
'//<START-Starter-S01>
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region
 	
	 
	Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Public RTP As RuntimePermissions
	Public GPS1 As GPS
    
	'Sound Management
	Public SP As SoundPool
	Public SoundMap As Map
	
	'--- Contact Group IDs (Restored) ---
	Public GroupID_Client As Long
	Public GroupID_Blacklisted As Long
	Public GroupID_Preferred As Long
End Sub

Sub Service_Create
	'This is the program entry point.
	'We must initialize essential services here, but we CANNOT block this sub
	'with heavy loading loops (like loading 150 wav files) or the app will crash
	'with a SocketException during debugging.
    
	SP.Initialize(5) 'Max 5 simultaneous streams
	SoundMap.Initialize
	
	'Initialize GPS if used
	Try
		GPS1.Initialize("GPS")
	Catch
		Log("GPS Init Failed: " & LastException)
	End Try

	'FIX: Move heavy loading to a delayed sub to prevent "Connection Reset" crash
	CallSubDelayed(Me, "LoadSounds")
End Sub

Sub LoadSounds
	'This runs after the Service has successfully created, preventing the timeout crash.
	Try
		For i = 1 To 150
			Dim FileName As String
			'Format numbers to match 01.wav, 02.wav... 150.wav
			If i < 10 Then
				FileName = "0" & i & ".wav"
			Else
				FileName = i & ".wav"
			End If
            
			If File.Exists(File.DirAssets, FileName) Then
				Dim LoadID As Int = SP.Load(File.DirAssets, FileName)
				SoundMap.Put(i, LoadID)
			End If
		Next
		Log("Success: Loaded " & SoundMap.Size & " sound files.")
	Catch
		Log("Error Loading Sounds: " & LastException)
	End Try
End Sub

Sub Service_Start (StartingIntent As Intent)
	Service.StopAutomaticForeground 'Starter service should not be sticky
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy

End Sub

'Total Subroutines in Section S01 recorded last edit: 0
'Total Subroutines in Section S01 recorded after this edit - 7
'Total Subroutines added in this edit - 7
'Total Subroutines removed in this edit - 0
'Difference between edits- +7
'Total Discrepancies - 0
'Total lines of code in this section prior to edit - 0
'Total lines of code in this section now - 78
'Lines added / Subtracted in this edit - +78
'//<END-Starter-S01>