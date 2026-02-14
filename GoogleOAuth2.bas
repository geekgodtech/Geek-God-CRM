B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.4
@EndOfDesignText@
'//<START-GoogleOAuth2-S01>
'Class module: GoogleOAuth2
Sub Class_Globals
	Private mTarget As Object
	Private mEventName As String
	Private mClientId As String
	Private mClientSecret As String
	Private mScope As String
	Private hc As OkHttpClient
	Public access_token As String
	Private refresh_token As String
	Public token_type As String
	Private expires_in As Long
	Private expire_time As Long
	Private const AUTH_URL As String = "https://accounts.google.com/o/oauth2/v2/auth"
	Private const TOKEN_URL As String = "https://oauth2.googleapis.com/token"
	Private const CLIENT_SECRET As String = "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"

End Sub

'Initializes the object.
Public Sub Initialize (Target As Object, EventName As String, ClientId As String, Scope As String)
	mTarget = Target
	mEventName = EventName
	mClientId = ClientId
	mClientSecret = CLIENT_SECRET
	mScope = Scope
	hc.Initialize("hc")
	'Try to load previously saved token
	LoadToken
End Sub

'Starts the login process.
Public Sub GetAccessToken
	If IsTokenValid Then
		CallSubDelayed3(mTarget, mEventName & "_AccessTokenAvailable", True, access_token)
		Return
	End If
    
	If refresh_token <> "" Then
		'We have a refresh token, try to refresh instead of asking user
		RefreshToken
		Return
	End If
    
	'No valid token, start fresh flow
	Dim link As String = BuildLink(AUTH_URL, CreateMap( _
        "client_id": mClientId, _
        "redirect_uri": GetRedirectUri, _
        "response_type": "code", _
        "scope": mScope, _
        "access_type": "offline", _
        "prompt": "consent"))
        
	Dim pi As PhoneIntents
	StartActivity(pi.OpenBrowser(link))
End Sub

Public Sub CallFromResume(Intent As Intent)
	If Intent.IsInitialized = False Then Return
	If Intent.Action <> Intent.ACTION_VIEW Then Return
	Dim url As String = Intent.GetData
	If url = Null Or url = "" Then Return
	If url.StartsWith("com.googleusercontent.apps.") = False Then Return
	
	Log(">>> [OAuth] Redirect URL received: " & url.SubString2(0, Min(80, url.Length)) & "...")
	
	Dim code As String = ParseCode(url)
	If code <> "" Then
		Log(">>> [OAuth] Authorization code received, exchanging for token...")
		GetTokenFromCode(code)
	Else
		Log(">>> [OAuth] Error parsing code from URL: " & url)
		CallSubDelayed3(mTarget, mEventName & "_AccessTokenAvailable", False, "")
	End If
End Sub

Private Sub GetTokenFromCode(Code As String)
	Dim j As HttpJob
	j.Initialize("", Me)
	Dim params As Map = CreateMap( _
        "code": Code, _
        "client_id": mClientId, _
        "client_secret": mClientSecret, _
        "redirect_uri": GetRedirectUri, _
        "grant_type": "authorization_code")
        
	Log(">>> [OAuth] Sending token request with client_secret...")
	j.PostString(TOKEN_URL, MapToQueryString(params))
    
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		Log(">>> [OAuth] Token exchange successful!")
		ParseTokenResponse(j.GetString)
		CallSubDelayed3(mTarget, mEventName & "_AccessTokenAvailable", True, access_token)
	Else
		Log(">>> [OAuth] Error getting token: " & j.ErrorMessage)
		CallSubDelayed3(mTarget, mEventName & "_AccessTokenAvailable", False, "")
	End If
	j.Release
End Sub

Private Sub RefreshToken
	Dim j As HttpJob
	j.Initialize("", Me)
	Dim params As Map = CreateMap( _
        "refresh_token": refresh_token, _
        "client_id": mClientId, _
        "client_secret": mClientSecret, _
        "grant_type": "refresh_token")
        
	Log(">>> [OAuth] Refreshing token...")
	j.PostString(TOKEN_URL, MapToQueryString(params))
    
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		Log(">>> [OAuth] Token refresh successful!")
		ParseTokenResponse(j.GetString)
		CallSubDelayed3(mTarget, mEventName & "_AccessTokenAvailable", True, access_token)
	Else
		Log(">>> [OAuth] Error refreshing token: " & j.ErrorMessage)
		ResetToken
		CallSubDelayed3(mTarget, mEventName & "_AccessTokenAvailable", False, "")
	End If
	j.Release
End Sub

Public Sub ResetToken
	access_token = ""
	refresh_token = ""
	expire_time = 0
	File.Delete(File.DirInternal, "google_oauth2_token.txt")
End Sub

Private Sub ParseTokenResponse(Response As String)
	Dim jp As JSONParser
	jp.Initialize(Response)
	Dim map As Map = jp.NextObject
	access_token = map.Get("access_token")
	token_type = map.Get("token_type")
	expires_in = map.Get("expires_in")
	expire_time = DateTime.Now + (expires_in * 1000)
    
	If map.ContainsKey("refresh_token") Then
		refresh_token = map.Get("refresh_token")
	End If
    
	SaveToken
	Log(">>> [OAuth] Token saved. Expires in: " & expires_in & " seconds")
End Sub

Private Sub SaveToken
	Dim map As Map = CreateMap("access_token": access_token, "refresh_token": refresh_token, "expire_time": expire_time)
	Dim jg As JSONGenerator
	jg.Initialize(map)
	File.WriteString(File.DirInternal, "google_oauth2_token.txt", jg.ToString)
End Sub

Private Sub LoadToken
	If File.Exists(File.DirInternal, "google_oauth2_token.txt") Then
		Try
			Dim jp As JSONParser
			jp.Initialize(File.ReadString(File.DirInternal, "google_oauth2_token.txt"))
			Dim map As Map = jp.NextObject
			access_token = map.Get("access_token")
			refresh_token = map.Get("refresh_token")
			expire_time = map.Get("expire_time")
			Log(">>> [OAuth] Loaded saved token. Valid: " & IsTokenValid)
		Catch
			Log(">>> [OAuth] Error loading token: " & LastException)
		End Try
	End If
End Sub

Private Sub IsTokenValid As Boolean
	Return access_token <> "" And DateTime.Now < expire_time - 60000
End Sub

Private Sub GetRedirectUri As String
	' Reverse Client ID format - automatically allowed by Google for Desktop clients
	Return "com.googleusercontent.apps.1077575612876-0lgv0dhcu1956b75n80gfs9t0djn2a5c:/oauth2redirect"
End Sub

Private Sub BuildLink(Url As String, Params As Map) As String
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append(Url)
	If Params.Size > 0 Then
		sb.Append("?")
		sb.Append(MapToQueryString(Params))
	End If
	Return sb.ToString
End Sub

Private Sub MapToQueryString(Params As Map) As String
	Dim sb As StringBuilder
	sb.Initialize
	For Each Key As String In Params.Keys
		If sb.Length > 0 Then sb.Append("&")
		Dim su As StringUtils
		sb.Append(Key).Append("=").Append(su.EncodeUrl(Params.Get(Key), "UTF8"))
	Next
	Return sb.ToString
End Sub

Private Sub ParseCode(Url As String) As String
	Dim i As Int = Url.IndexOf("code=")
	If i > -1 Then
		Dim s As String = Url.SubString(i + 5)
		Dim i2 As Int = s.IndexOf("&")
		If i2 > -1 Then
			Return s.SubString2(0, i2)
		Else
			Return s
		End If
	End If
	Return ""
End Sub

Public Sub IsInitialized As Boolean
	Return mClientId <> ""
End Sub
'//<END-GoogleOAuth2-S01>