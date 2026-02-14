package Geek.God.CRM.App;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class googleoauth2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "Geek.God.CRM.App.googleoauth2");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", Geek.God.CRM.App.googleoauth2.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public Object _mtarget = null;
public String _meventname = "";
public String _mclientid = "";
public String _mclientsecret = "";
public String _mscope = "";
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper _hc = null;
public String _access_token = "";
public String _refresh_token = "";
public String _token_type = "";
public long _expires_in = 0L;
public long _expire_time = 0L;
public String _auth_url = "";
public String _token_url = "";
public String _client_secret = "";
public b4a.example.dateutils _dateutils = null;
public Geek.God.CRM.App.main _main = null;
public Geek.God.CRM.App.starter _starter = null;
public Geek.God.CRM.App.b4xpages _b4xpages = null;
public Geek.God.CRM.App.b4xcollections _b4xcollections = null;
public Geek.God.CRM.App.httputils2service _httputils2service = null;
public Geek.God.CRM.App.xuiviewsutils _xuiviewsutils = null;
public String  _buildlink(String _url,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 184;BA.debugLine="Private Sub BuildLink(Url As String, Params As Map";
 //BA.debugLineNum = 185;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 186;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 187;BA.debugLine="sb.Append(Url)";
_sb.Append(_url);
 //BA.debugLineNum = 188;BA.debugLine="If Params.Size > 0 Then";
if (_params.getSize()>0) { 
 //BA.debugLineNum = 189;BA.debugLine="sb.Append(\"?\")";
_sb.Append("?");
 //BA.debugLineNum = 190;BA.debugLine="sb.Append(MapToQueryString(Params))";
_sb.Append(_maptoquerystring(_params));
 };
 //BA.debugLineNum = 192;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public String  _callfromresume(anywheresoftware.b4a.objects.IntentWrapper _intent) throws Exception{
String _url = "";
String _code = "";
 //BA.debugLineNum = 59;BA.debugLine="Public Sub CallFromResume(Intent As Intent)";
 //BA.debugLineNum = 60;BA.debugLine="If Intent.IsInitialized = False Then Return";
if (_intent.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 61;BA.debugLine="If Intent.Action <> Intent.ACTION_VIEW Then Retur";
if ((_intent.getAction()).equals(_intent.ACTION_VIEW) == false) { 
if (true) return "";};
 //BA.debugLineNum = 62;BA.debugLine="Dim url As String = Intent.GetData";
_url = _intent.GetData();
 //BA.debugLineNum = 63;BA.debugLine="If url = Null Or url = \"\" Then Return";
if (_url== null || (_url).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 64;BA.debugLine="If url.StartsWith(\"com.googleusercontent.apps.\")";
if (_url.startsWith("com.googleusercontent.apps.")==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 66;BA.debugLine="Log(\">>> [OAuth] Redirect URL received: \" & url.S";
__c.LogImpl("0720903",">>> [OAuth] Redirect URL received: "+_url.substring((int) (0),(int) (__c.Min(80,_url.length())))+"...",0);
 //BA.debugLineNum = 68;BA.debugLine="Dim code As String = ParseCode(url)";
_code = _parsecode(_url);
 //BA.debugLineNum = 69;BA.debugLine="If code <> \"\" Then";
if ((_code).equals("") == false) { 
 //BA.debugLineNum = 70;BA.debugLine="Log(\">>> [OAuth] Authorization code received, ex";
__c.LogImpl("0720907",">>> [OAuth] Authorization code received, exchanging for token...",0);
 //BA.debugLineNum = 71;BA.debugLine="GetTokenFromCode(code)";
_gettokenfromcode(_code);
 }else {
 //BA.debugLineNum = 73;BA.debugLine="Log(\">>> [OAuth] Error parsing code from URL: \"";
__c.LogImpl("0720910",">>> [OAuth] Error parsing code from URL: "+_url,0);
 //BA.debugLineNum = 74;BA.debugLine="CallSubDelayed3(mTarget, mEventName & \"_AccessTo";
__c.CallSubDelayed3(ba,_mtarget,_meventname+"_AccessTokenAvailable",(Object)(__c.False),(Object)(""));
 };
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private mTarget As Object";
_mtarget = new Object();
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String";
_meventname = "";
 //BA.debugLineNum = 6;BA.debugLine="Private mClientId As String";
_mclientid = "";
 //BA.debugLineNum = 7;BA.debugLine="Private mClientSecret As String";
_mclientsecret = "";
 //BA.debugLineNum = 8;BA.debugLine="Private mScope As String";
_mscope = "";
 //BA.debugLineNum = 9;BA.debugLine="Private hc As OkHttpClient";
_hc = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Public access_token As String";
_access_token = "";
 //BA.debugLineNum = 11;BA.debugLine="Private refresh_token As String";
_refresh_token = "";
 //BA.debugLineNum = 12;BA.debugLine="Public token_type As String";
_token_type = "";
 //BA.debugLineNum = 13;BA.debugLine="Private expires_in As Long";
_expires_in = 0L;
 //BA.debugLineNum = 14;BA.debugLine="Private expire_time As Long";
_expire_time = 0L;
 //BA.debugLineNum = 15;BA.debugLine="Private const AUTH_URL As String = \"https://accou";
_auth_url = "https://accounts.google.com/o/oauth2/v2/auth";
 //BA.debugLineNum = 16;BA.debugLine="Private const TOKEN_URL As String = \"https://oaut";
_token_url = "https://oauth2.googleapis.com/token";
 //BA.debugLineNum = 17;BA.debugLine="Private const CLIENT_SECRET As String = \"GOCSPX-i";
_client_secret = "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";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _getaccesstoken() throws Exception{
String _link = "";
anywheresoftware.b4a.phone.Phone.PhoneIntents _pi = null;
 //BA.debugLineNum = 34;BA.debugLine="Public Sub GetAccessToken";
 //BA.debugLineNum = 35;BA.debugLine="If IsTokenValid Then";
if (_istokenvalid()) { 
 //BA.debugLineNum = 36;BA.debugLine="CallSubDelayed3(mTarget, mEventName & \"_AccessTo";
__c.CallSubDelayed3(ba,_mtarget,_meventname+"_AccessTokenAvailable",(Object)(__c.True),(Object)(_access_token));
 //BA.debugLineNum = 37;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 40;BA.debugLine="If refresh_token <> \"\" Then";
if ((_refresh_token).equals("") == false) { 
 //BA.debugLineNum = 42;BA.debugLine="RefreshToken";
_refreshtoken();
 //BA.debugLineNum = 43;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 47;BA.debugLine="Dim link As String = BuildLink(AUTH_URL, CreateMa";
_link = _buildlink(_auth_url,__c.createMap(new Object[] {(Object)("client_id"),(Object)(_mclientid),(Object)("redirect_uri"),(Object)(_getredirecturi()),(Object)("response_type"),(Object)("code"),(Object)("scope"),(Object)(_mscope),(Object)("access_type"),(Object)("offline"),(Object)("prompt"),(Object)("consent")}));
 //BA.debugLineNum = 55;BA.debugLine="Dim pi As PhoneIntents";
_pi = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
 //BA.debugLineNum = 56;BA.debugLine="StartActivity(pi.OpenBrowser(link))";
__c.StartActivity(ba,(Object)(_pi.OpenBrowser(_link)));
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _getredirecturi() throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Private Sub GetRedirectUri As String";
 //BA.debugLineNum = 181;BA.debugLine="Return \"com.googleusercontent.apps.1077575612876-";
if (true) return "com.googleusercontent.apps.1077575612876-0lgv0dhcu1956b75n80gfs9t0djn2a5c:/oauth2redirect";
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public void  _gettokenfromcode(String _code) throws Exception{
ResumableSub_GetTokenFromCode rsub = new ResumableSub_GetTokenFromCode(this,_code);
rsub.resume(ba, null);
}
public static class ResumableSub_GetTokenFromCode extends BA.ResumableSub {
public ResumableSub_GetTokenFromCode(Geek.God.CRM.App.googleoauth2 parent,String _code) {
this.parent = parent;
this._code = _code;
}
Geek.God.CRM.App.googleoauth2 parent;
String _code;
Geek.God.CRM.App.httpjob _j = null;
anywheresoftware.b4a.objects.collections.Map _params = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 79;BA.debugLine="Dim j As HttpJob";
_j = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 80;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 81;BA.debugLine="Dim params As Map = CreateMap( _         \"code\":";
_params = new anywheresoftware.b4a.objects.collections.Map();
_params = parent.__c.createMap(new Object[] {(Object)("code"),(Object)(_code),(Object)("client_id"),(Object)(parent._mclientid),(Object)("client_secret"),(Object)(parent._mclientsecret),(Object)("redirect_uri"),(Object)(parent._getredirecturi()),(Object)("grant_type"),(Object)("authorization_code")});
 //BA.debugLineNum = 88;BA.debugLine="Log(\">>> [OAuth] Sending token request with clien";
parent.__c.LogImpl("0786442",">>> [OAuth] Sending token request with client_secret...",0);
 //BA.debugLineNum = 89;BA.debugLine="j.PostString(TOKEN_URL, MapToQueryString(params))";
_j._poststring /*String*/ (parent._token_url,parent._maptoquerystring(_params));
 //BA.debugLineNum = 91;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (Geek.God.CRM.App.httpjob) result[0];
;
 //BA.debugLineNum = 92;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 93;BA.debugLine="Log(\">>> [OAuth] Token exchange successful!\")";
parent.__c.LogImpl("0786447",">>> [OAuth] Token exchange successful!",0);
 //BA.debugLineNum = 94;BA.debugLine="ParseTokenResponse(j.GetString)";
parent._parsetokenresponse(_j._getstring /*String*/ ());
 //BA.debugLineNum = 95;BA.debugLine="CallSubDelayed3(mTarget, mEventName & \"_AccessTo";
parent.__c.CallSubDelayed3(ba,parent._mtarget,parent._meventname+"_AccessTokenAvailable",(Object)(parent.__c.True),(Object)(parent._access_token));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 97;BA.debugLine="Log(\">>> [OAuth] Error getting token: \" & j.Erro";
parent.__c.LogImpl("0786451",">>> [OAuth] Error getting token: "+_j._errormessage /*String*/ ,0);
 //BA.debugLineNum = 98;BA.debugLine="CallSubDelayed3(mTarget, mEventName & \"_AccessTo";
parent.__c.CallSubDelayed3(ba,parent._mtarget,parent._meventname+"_AccessTokenAvailable",(Object)(parent.__c.False),(Object)(""));
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 100;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(Geek.God.CRM.App.httpjob _j) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _target,String _eventname,String _clientid,String _scope) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize (Target As Object, EventName";
 //BA.debugLineNum = 23;BA.debugLine="mTarget = Target";
_mtarget = _target;
 //BA.debugLineNum = 24;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 25;BA.debugLine="mClientId = ClientId";
_mclientid = _clientid;
 //BA.debugLineNum = 26;BA.debugLine="mClientSecret = CLIENT_SECRET";
_mclientsecret = _client_secret;
 //BA.debugLineNum = 27;BA.debugLine="mScope = Scope";
_mscope = _scope;
 //BA.debugLineNum = 28;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
 //BA.debugLineNum = 30;BA.debugLine="LoadToken";
_loadtoken();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public boolean  _isinitialized() throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Public Sub IsInitialized As Boolean";
 //BA.debugLineNum = 221;BA.debugLine="Return mClientId <> \"\"";
if (true) return (_mclientid).equals("") == false;
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return false;
}
public boolean  _istokenvalid() throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Private Sub IsTokenValid As Boolean";
 //BA.debugLineNum = 176;BA.debugLine="Return access_token <> \"\" And DateTime.Now < expi";
if (true) return (_access_token).equals("") == false && __c.DateTime.getNow()<_expire_time-60000;
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return false;
}
public String  _loadtoken() throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
 //BA.debugLineNum = 159;BA.debugLine="Private Sub LoadToken";
 //BA.debugLineNum = 160;BA.debugLine="If File.Exists(File.DirInternal, \"google_oauth2_t";
if (__c.File.Exists(__c.File.getDirInternal(),"google_oauth2_token.txt")) { 
 //BA.debugLineNum = 161;BA.debugLine="Try";
try { //BA.debugLineNum = 162;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 163;BA.debugLine="jp.Initialize(File.ReadString(File.DirInternal,";
_jp.Initialize(__c.File.ReadString(__c.File.getDirInternal(),"google_oauth2_token.txt"));
 //BA.debugLineNum = 164;BA.debugLine="Dim map As Map = jp.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jp.NextObject();
 //BA.debugLineNum = 165;BA.debugLine="access_token = map.Get(\"access_token\")";
_access_token = BA.ObjectToString(_map.Get((Object)("access_token")));
 //BA.debugLineNum = 166;BA.debugLine="refresh_token = map.Get(\"refresh_token\")";
_refresh_token = BA.ObjectToString(_map.Get((Object)("refresh_token")));
 //BA.debugLineNum = 167;BA.debugLine="expire_time = map.Get(\"expire_time\")";
_expire_time = BA.ObjectToLongNumber(_map.Get((Object)("expire_time")));
 //BA.debugLineNum = 168;BA.debugLine="Log(\">>> [OAuth] Loaded saved token. Valid: \" &";
__c.LogImpl("01114121",">>> [OAuth] Loaded saved token. Valid: "+BA.ObjectToString(_istokenvalid()),0);
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 170;BA.debugLine="Log(\">>> [OAuth] Error loading token: \" & LastE";
__c.LogImpl("01114123",">>> [OAuth] Error loading token: "+BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
 };
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _maptoquerystring(anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _key = "";
anywheresoftware.b4a.objects.StringUtils _su = null;
 //BA.debugLineNum = 195;BA.debugLine="Private Sub MapToQueryString(Params As Map) As Str";
 //BA.debugLineNum = 196;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 197;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 198;BA.debugLine="For Each Key As String In Params.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _params.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 199;BA.debugLine="If sb.Length > 0 Then sb.Append(\"&\")";
if (_sb.getLength()>0) { 
_sb.Append("&");};
 //BA.debugLineNum = 200;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 201;BA.debugLine="sb.Append(Key).Append(\"=\").Append(su.EncodeUrl(P";
_sb.Append(_key).Append("=").Append(_su.EncodeUrl(BA.ObjectToString(_params.Get((Object)(_key))),"UTF8"));
 }
};
 //BA.debugLineNum = 203;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public String  _parsecode(String _url) throws Exception{
int _i = 0;
String _s = "";
int _i2 = 0;
 //BA.debugLineNum = 206;BA.debugLine="Private Sub ParseCode(Url As String) As String";
 //BA.debugLineNum = 207;BA.debugLine="Dim i As Int = Url.IndexOf(\"code=\")";
_i = _url.indexOf("code=");
 //BA.debugLineNum = 208;BA.debugLine="If i > -1 Then";
if (_i>-1) { 
 //BA.debugLineNum = 209;BA.debugLine="Dim s As String = Url.SubString(i + 5)";
_s = _url.substring((int) (_i+5));
 //BA.debugLineNum = 210;BA.debugLine="Dim i2 As Int = s.IndexOf(\"&\")";
_i2 = _s.indexOf("&");
 //BA.debugLineNum = 211;BA.debugLine="If i2 > -1 Then";
if (_i2>-1) { 
 //BA.debugLineNum = 212;BA.debugLine="Return s.SubString2(0, i2)";
if (true) return _s.substring((int) (0),_i2);
 }else {
 //BA.debugLineNum = 214;BA.debugLine="Return s";
if (true) return _s;
 };
 };
 //BA.debugLineNum = 217;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public String  _parsetokenresponse(String _response) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
 //BA.debugLineNum = 135;BA.debugLine="Private Sub ParseTokenResponse(Response As String)";
 //BA.debugLineNum = 136;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 137;BA.debugLine="jp.Initialize(Response)";
_jp.Initialize(_response);
 //BA.debugLineNum = 138;BA.debugLine="Dim map As Map = jp.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jp.NextObject();
 //BA.debugLineNum = 139;BA.debugLine="access_token = map.Get(\"access_token\")";
_access_token = BA.ObjectToString(_map.Get((Object)("access_token")));
 //BA.debugLineNum = 140;BA.debugLine="token_type = map.Get(\"token_type\")";
_token_type = BA.ObjectToString(_map.Get((Object)("token_type")));
 //BA.debugLineNum = 141;BA.debugLine="expires_in = map.Get(\"expires_in\")";
_expires_in = BA.ObjectToLongNumber(_map.Get((Object)("expires_in")));
 //BA.debugLineNum = 142;BA.debugLine="expire_time = DateTime.Now + (expires_in * 1000)";
_expire_time = (long) (__c.DateTime.getNow()+(_expires_in*1000));
 //BA.debugLineNum = 144;BA.debugLine="If map.ContainsKey(\"refresh_token\") Then";
if (_map.ContainsKey((Object)("refresh_token"))) { 
 //BA.debugLineNum = 145;BA.debugLine="refresh_token = map.Get(\"refresh_token\")";
_refresh_token = BA.ObjectToString(_map.Get((Object)("refresh_token")));
 };
 //BA.debugLineNum = 148;BA.debugLine="SaveToken";
_savetoken();
 //BA.debugLineNum = 149;BA.debugLine="Log(\">>> [OAuth] Token saved. Expires in: \" & exp";
__c.LogImpl("0983054",">>> [OAuth] Token saved. Expires in: "+BA.NumberToString(_expires_in)+" seconds",0);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public void  _refreshtoken() throws Exception{
ResumableSub_RefreshToken rsub = new ResumableSub_RefreshToken(this);
rsub.resume(ba, null);
}
public static class ResumableSub_RefreshToken extends BA.ResumableSub {
public ResumableSub_RefreshToken(Geek.God.CRM.App.googleoauth2 parent) {
this.parent = parent;
}
Geek.God.CRM.App.googleoauth2 parent;
Geek.God.CRM.App.httpjob _j = null;
anywheresoftware.b4a.objects.collections.Map _params = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 104;BA.debugLine="Dim j As HttpJob";
_j = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 105;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 106;BA.debugLine="Dim params As Map = CreateMap( _         \"refresh";
_params = new anywheresoftware.b4a.objects.collections.Map();
_params = parent.__c.createMap(new Object[] {(Object)("refresh_token"),(Object)(parent._refresh_token),(Object)("client_id"),(Object)(parent._mclientid),(Object)("client_secret"),(Object)(parent._mclientsecret),(Object)("grant_type"),(Object)("refresh_token")});
 //BA.debugLineNum = 112;BA.debugLine="Log(\">>> [OAuth] Refreshing token...\")";
parent.__c.LogImpl("0851977",">>> [OAuth] Refreshing token...",0);
 //BA.debugLineNum = 113;BA.debugLine="j.PostString(TOKEN_URL, MapToQueryString(params))";
_j._poststring /*String*/ (parent._token_url,parent._maptoquerystring(_params));
 //BA.debugLineNum = 115;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (Geek.God.CRM.App.httpjob) result[0];
;
 //BA.debugLineNum = 116;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 117;BA.debugLine="Log(\">>> [OAuth] Token refresh successful!\")";
parent.__c.LogImpl("0851982",">>> [OAuth] Token refresh successful!",0);
 //BA.debugLineNum = 118;BA.debugLine="ParseTokenResponse(j.GetString)";
parent._parsetokenresponse(_j._getstring /*String*/ ());
 //BA.debugLineNum = 119;BA.debugLine="CallSubDelayed3(mTarget, mEventName & \"_AccessTo";
parent.__c.CallSubDelayed3(ba,parent._mtarget,parent._meventname+"_AccessTokenAvailable",(Object)(parent.__c.True),(Object)(parent._access_token));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 121;BA.debugLine="Log(\">>> [OAuth] Error refreshing token: \" & j.E";
parent.__c.LogImpl("0851986",">>> [OAuth] Error refreshing token: "+_j._errormessage /*String*/ ,0);
 //BA.debugLineNum = 122;BA.debugLine="ResetToken";
parent._resettoken();
 //BA.debugLineNum = 123;BA.debugLine="CallSubDelayed3(mTarget, mEventName & \"_AccessTo";
parent.__c.CallSubDelayed3(ba,parent._mtarget,parent._meventname+"_AccessTokenAvailable",(Object)(parent.__c.False),(Object)(""));
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 125;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _resettoken() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Public Sub ResetToken";
 //BA.debugLineNum = 129;BA.debugLine="access_token = \"\"";
_access_token = "";
 //BA.debugLineNum = 130;BA.debugLine="refresh_token = \"\"";
_refresh_token = "";
 //BA.debugLineNum = 131;BA.debugLine="expire_time = 0";
_expire_time = (long) (0);
 //BA.debugLineNum = 132;BA.debugLine="File.Delete(File.DirInternal, \"google_oauth2_toke";
__c.File.Delete(__c.File.getDirInternal(),"google_oauth2_token.txt");
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _savetoken() throws Exception{
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
 //BA.debugLineNum = 152;BA.debugLine="Private Sub SaveToken";
 //BA.debugLineNum = 153;BA.debugLine="Dim map As Map = CreateMap(\"access_token\": access";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __c.createMap(new Object[] {(Object)("access_token"),(Object)(_access_token),(Object)("refresh_token"),(Object)(_refresh_token),(Object)("expire_time"),(Object)(_expire_time)});
 //BA.debugLineNum = 154;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 155;BA.debugLine="jg.Initialize(map)";
_jg.Initialize(_map);
 //BA.debugLineNum = 156;BA.debugLine="File.WriteString(File.DirInternal, \"google_oauth2";
__c.File.WriteString(__c.File.getDirInternal(),"google_oauth2_token.txt",_jg.ToString());
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
