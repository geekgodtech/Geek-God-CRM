package Geek.God.CRM.App;

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
import android.content.Intent;
import android.content.ClipboardManager;
import android.content.ClipData;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.content.Context;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "Geek.God.CRM.App.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", Geek.God.CRM.App.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.collections.Map _appsettings = null;
public boolean _hasrunonce = false;
public anywheresoftware.b4a.objects.collections.Map _pendingslot = null;
public anywheresoftware.b4a.objects.collections.Map _recentlyupdated = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panel1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblstatus = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbldaydate = null;
public anywheresoftware.b4a.phone.Phone.PhoneSensors _sensorshake = null;
public long _lastshaketime = 0L;
public boolean _istorchon = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsearch = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btncreateclient = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnscrape = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnviewapt = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btncloseout = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmakeapt = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnlogin = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlstats = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltotalaptsgod = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalaptsgoddess = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgodcollected = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgoddesscollected = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltotalcollected = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblappsgodnum = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblappsgoddessnum = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgodcollectednum = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblgoddesscollectednum = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltotalcollectednum = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spnchose = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblselectgod = null;
public b4a.example3.customlistview _lsttodayapts = null;
public anywheresoftware.b4a.objects.Timer _statusrefreshtimer = null;
public Geek.God.CRM.App.googleoauth2 _oauth2 = null;
public String _client_id = "";
public String _source_id = "";
public Geek.God.CRM.App.searchpage _searchscreen = null;
public Geek.God.CRM.App.appointmentpage _appointmentscreen = null;
public Geek.God.CRM.App.viewschedulepage _viewschedulescreen = null;
public Geek.God.CRM.App.closeout _closeoutscreen = null;
public Geek.God.CRM.App.createclientpage _clientcreator = null;
public anywheresoftware.b4a.objects.collections.Map _tempprofile = null;
public anywheresoftware.b4a.objects.collections.List _ledgerqueue = null;
public String _currentledgerid = "";
public String _currentsearchquery = "";
public anywheresoftware.b4a.objects.collections.List _issueshistory = null;
public anywheresoftware.b4a.gps.GPS _gps = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4a.gps.LocationWrapper _currentlocation = null;
public anywheresoftware.b4a.objects.collections.Map _geocodedlocations = null;
public anywheresoftware.b4a.objects.collections.Map _failedgeocodes = null;
public String _activeappointmentid = "";
public long _activearrivaltime = 0L;
public anywheresoftware.b4a.objects.collections.Map _activejobmap = null;
public anywheresoftware.b4a.objects.Timer _jobtimer = null;
public int _color_pending = 0;
public int _color_active = 0;
public int _color_closed = 0;
public anywheresoftware.b4a.objects.collections.Map _fuzzycandidates = null;
public anywheresoftware.b4a.objects.collections.Map _scrapemap = null;
public anywheresoftware.b4a.objects.collections.List _scrapequeue = null;
public anywheresoftware.b4a.objects.MediaPlayerWrapper _vmplayer = null;
public String _scrapedapptissue = "";
public anywheresoftware.b4a.objects.IME _ime = null;
public anywheresoftware.b4a.objects.collections.List _lastdashboarditems = null;
public int _layout_threshold = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _expensepanel = null;
public String _expensephotopath = "";
public String _extracteddate = "";
public String _extractedtime = "";
public anywheresoftware.b4a.objects.LabelWrapper _expensedatelabel = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _expensecategoryspinner = null;
public anywheresoftware.b4a.objects.EditTextWrapper _expenseamount = null;
public anywheresoftware.b4a.objects.EditTextWrapper _expensenotes = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _fontlabels = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _fontbuttons = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _fontstats = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _fontcardtext = null;
public anywheresoftware.b4a.objects.collections.Map _holidaybanner = null;
public float _arrivalthresholdmeters = 0f;
public anywheresoftware.b4a.audio.SoundPoolWrapper _sp = null;
public anywheresoftware.b4a.objects.collections.List _soundids = null;
public String _currentuser = "";
public anywheresoftware.b4j.object.JavaObject _folddetector = null;
public String _lastfoldstate = "";
public String _lastorientation = "";
public b4a.example.dateutils _dateutils = null;
public Geek.God.CRM.App.main _main = null;
public Geek.God.CRM.App.starter _starter = null;
public Geek.God.CRM.App.b4xpages _b4xpages = null;
public Geek.God.CRM.App.b4xcollections _b4xcollections = null;
public Geek.God.CRM.App.httputils2service _httputils2service = null;
public Geek.God.CRM.App.xuiviewsutils _xuiviewsutils = null;
public String  _activity_permissionresult(String _permission,boolean _result) throws Exception{
 //BA.debugLineNum = 1132;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
 //BA.debugLineNum = 1133;BA.debugLine="If Permission = rp.PERMISSION_ACCESS_FINE_LOCATIO";
if ((_permission).equals(_rp.PERMISSION_ACCESS_FINE_LOCATION) && _result==__c.True) { 
_gps.Start(ba,(long) (0),(float) (0));};
 //BA.debugLineNum = 1134;BA.debugLine="End Sub";
return "";
}
public int  _addscraperow(anywheresoftware.b4a.objects.B4XViewWrapper _parent,int _top,int _parentwidth,String _lbltext,String _val,String _chktag,String _txttag) throws Exception{
int _rowh = 0;
int _chksize = 0;
int _lblw = 0;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chk = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
int _inputx = 0;
int _inputwidth = 0;
anywheresoftware.b4a.objects.EditTextWrapper _txt = null;
 //BA.debugLineNum = 5667;BA.debugLine="Private Sub AddScrapeRow(Parent As B4XView, Top As";
 //BA.debugLineNum = 5668;BA.debugLine="Dim RowH As Int = 50dip";
_rowh = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 5669;BA.debugLine="Dim ChkSize As Int = 40dip";
_chksize = __c.DipToCurrent((int) (40));
 //BA.debugLineNum = 5670;BA.debugLine="Dim LblW As Int = 70dip";
_lblw = __c.DipToCurrent((int) (70));
 //BA.debugLineNum = 5672;BA.debugLine="Dim chk As CheckBox : chk.Initialize(\"\")";
_chk = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 5672;BA.debugLine="Dim chk As CheckBox : chk.Initialize(\"\")";
_chk.Initialize(ba,"");
 //BA.debugLineNum = 5673;BA.debugLine="chk.Checked = (Val <> \"\")";
_chk.setChecked(((_val).equals("") == false));
 //BA.debugLineNum = 5674;BA.debugLine="chk.Tag = ChkTag";
_chk.setTag((Object)(_chktag));
 //BA.debugLineNum = 5675;BA.debugLine="Parent.AddView(chk, 0, Top + 5dip, ChkSize, ChkSi";
_parent.AddView((android.view.View)(_chk.getObject()),(int) (0),(int) (_top+__c.DipToCurrent((int) (5))),_chksize,_chksize);
 //BA.debugLineNum = 5677;BA.debugLine="Dim lbl As Label : lbl.Initialize(\"\")";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 5677;BA.debugLine="Dim lbl As Label : lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 5678;BA.debugLine="lbl.Text = LblText";
_lbl.setText(BA.ObjectToCharSequence(_lbltext));
 //BA.debugLineNum = 5679;BA.debugLine="lbl.TextSize = 12";
_lbl.setTextSize((float) (12));
 //BA.debugLineNum = 5680;BA.debugLine="lbl.TextColor = xui.Color_DarkGray";
_lbl.setTextColor(_xui.Color_DarkGray);
 //BA.debugLineNum = 5681;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 5682;BA.debugLine="Parent.AddView(lbl, ChkSize, Top, LblW, RowH)";
_parent.AddView((android.view.View)(_lbl.getObject()),_chksize,_top,_lblw,_rowh);
 //BA.debugLineNum = 5684;BA.debugLine="Dim InputX As Int = ChkSize + LblW";
_inputx = (int) (_chksize+_lblw);
 //BA.debugLineNum = 5685;BA.debugLine="Dim InputWidth As Int = ParentWidth - InputX";
_inputwidth = (int) (_parentwidth-_inputx);
 //BA.debugLineNum = 5687;BA.debugLine="Dim txt As EditText : txt.Initialize(\"\")";
_txt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 5687;BA.debugLine="Dim txt As EditText : txt.Initialize(\"\")";
_txt.Initialize(ba,"");
 //BA.debugLineNum = 5688;BA.debugLine="txt.Text = Val";
_txt.setText(BA.ObjectToCharSequence(_val));
 //BA.debugLineNum = 5689;BA.debugLine="txt.Tag = TxtTag";
_txt.setTag((Object)(_txttag));
 //BA.debugLineNum = 5690;BA.debugLine="txt.Color = xui.Color_White";
_txt.setColor(_xui.Color_White);
 //BA.debugLineNum = 5691;BA.debugLine="txt.TextColor = xui.Color_Black";
_txt.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 5692;BA.debugLine="txt.TextSize = 14";
_txt.setTextSize((float) (14));
 //BA.debugLineNum = 5693;BA.debugLine="txt.Gravity = Gravity.CENTER_VERTICAL";
_txt.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 5694;BA.debugLine="Parent.AddView(txt, InputX, Top + 5dip, InputWidt";
_parent.AddView((android.view.View)(_txt.getObject()),_inputx,(int) (_top+__c.DipToCurrent((int) (5))),_inputwidth,(int) (_rowh-__c.DipToCurrent((int) (10))));
 //BA.debugLineNum = 5696;BA.debugLine="Return Top + RowH";
if (true) return (int) (_top+_rowh);
 //BA.debugLineNum = 5697;BA.debugLine="End Sub";
return 0;
}
public String  _adjustlayout(int _width,int _height) throws Exception{
int _headerbottom = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _lv = null;
boolean _usecompactmode = false;
int _midpoint = 0;
int _btnw = 0;
int _btnh = 0;
int _listtop = 0;
int _buttonswidth = 0;
int _statuswidth = 0;
int _statsleft = 0;
int _statswidth = 0;
 //BA.debugLineNum = 1184;BA.debugLine="Private Sub AdjustLayout(Width As Int, Height As I";
 //BA.debugLineNum = 1185;BA.debugLine="If pnlStats.IsInitialized = False Or lstTodayApts";
if (_pnlstats.IsInitialized()==__c.False || _lsttodayapts.IsInitialized()==__c.False || _spnchose.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 1186;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1188;BA.debugLine="Dim HeaderBottom As Int = spnChose.Top + spnChose";
_headerbottom = (int) (_spnchose.getTop()+_spnchose.getHeight());
 //BA.debugLineNum = 1189;BA.debugLine="Dim lv As B4XView = lstTodayApts.AsView";
_lv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lv = _lsttodayapts._asview();
 //BA.debugLineNum = 1190;BA.debugLine="If lv.Parent.IsInitialized And lv.Parent <> Root";
if (_lv.getParent().IsInitialized() && (_lv.getParent()).equals(_root) == false) { 
 //BA.debugLineNum = 1191;BA.debugLine="lv.RemoveViewFromParent";
_lv.RemoveViewFromParent();
 //BA.debugLineNum = 1192;BA.debugLine="Root.AddView(lv, 0, 0, 0, 0)";
_root.AddView((android.view.View)(_lv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 };
 //BA.debugLineNum = 1196;BA.debugLine="Dim UseCompactMode As Boolean = True";
_usecompactmode = __c.True;
 //BA.debugLineNum = 1197;BA.debugLine="If Width > 1300 Then";
if (_width>1300) { 
 //BA.debugLineNum = 1198;BA.debugLine="UseCompactMode = False";
_usecompactmode = __c.False;
 //BA.debugLineNum = 1199;BA.debugLine="Log(\">>> [LAYOUT] Wide Screen Detected (> 1300)\"";
__c.LogImpl("013238287",">>> [LAYOUT] Wide Screen Detected (> 1300)",0);
 }else if(_width>850) { 
 //BA.debugLineNum = 1201;BA.debugLine="UseCompactMode = True";
_usecompactmode = __c.True;
 //BA.debugLineNum = 1202;BA.debugLine="Log(\">>> [LAYOUT] Tall Phone Detected (> 850)\")";
__c.LogImpl("013238290",">>> [LAYOUT] Tall Phone Detected (> 850)",0);
 };
 //BA.debugLineNum = 1205;BA.debugLine="If LastFoldState = \"HALF_OPENED\" Then";
if ((_lastfoldstate).equals("HALF_OPENED")) { 
 //BA.debugLineNum = 1206;BA.debugLine="UseCompactMode = True";
_usecompactmode = __c.True;
 //BA.debugLineNum = 1207;BA.debugLine="Log(\">>> [LAYOUT] Forced Compact Mode (Tabletop)";
__c.LogImpl("013238295",">>> [LAYOUT] Forced Compact Mode (Tabletop)",0);
 };
 //BA.debugLineNum = 1210;BA.debugLine="If UseCompactMode Then";
if (_usecompactmode) { 
 //BA.debugLineNum = 1211;BA.debugLine="If Panel1.IsInitialized Then Panel1.Width = Widt";
if (_panel1.IsInitialized()) { 
_panel1.setWidth(_width);};
 //BA.debugLineNum = 1212;BA.debugLine="If btnSearch.IsInitialized Then";
if (_btnsearch.IsInitialized()) { 
 //BA.debugLineNum = 1213;BA.debugLine="btnSearch.Text = \"SEARCH\"";
_btnsearch.setText(BA.ObjectToCharSequence("SEARCH"));
 //BA.debugLineNum = 1214;BA.debugLine="btnCreateClient.Text = \"CREATE\"";
_btncreateclient.setText(BA.ObjectToCharSequence("CREATE"));
 //BA.debugLineNum = 1215;BA.debugLine="btnScrape.Text = \"SCRAPE VM\"";
_btnscrape.setText(BA.ObjectToCharSequence("SCRAPE VM"));
 //BA.debugLineNum = 1216;BA.debugLine="btnViewApt.Text = \"VIEW\"";
_btnviewapt.setText(BA.ObjectToCharSequence("VIEW"));
 //BA.debugLineNum = 1217;BA.debugLine="btnMakeApt.Text = \"SCHEDULE\"";
_btnmakeapt.setText(BA.ObjectToCharSequence("SCHEDULE"));
 //BA.debugLineNum = 1218;BA.debugLine="Dim MidPoint As Int = Width / 2";
_midpoint = (int) (_width/(double)2);
 //BA.debugLineNum = 1219;BA.debugLine="Dim BtnW As Int = MidPoint - 4dip";
_btnw = (int) (_midpoint-__c.DipToCurrent((int) (4)));
 //BA.debugLineNum = 1220;BA.debugLine="Dim BtnH As Int = 50dip";
_btnh = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 1221;BA.debugLine="btnSearch.SetLayoutAnimated(0, 2dip, btnSearch.";
_btnsearch.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (2)),_btnsearch.getTop(),_btnw,_btnh);
 //BA.debugLineNum = 1222;BA.debugLine="btnCreateClient.SetLayoutAnimated(0, MidPoint +";
_btncreateclient.SetLayoutAnimated((int) (0),(int) (_midpoint+__c.DipToCurrent((int) (2))),_btncreateclient.getTop(),_btnw,_btnh);
 //BA.debugLineNum = 1223;BA.debugLine="btnScrape.SetLayoutAnimated(0, 2dip, btnScrape.";
_btnscrape.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (2)),_btnscrape.getTop(),_btnw,_btnh);
 //BA.debugLineNum = 1224;BA.debugLine="btnViewApt.SetLayoutAnimated(0, MidPoint + 2dip";
_btnviewapt.SetLayoutAnimated((int) (0),(int) (_midpoint+__c.DipToCurrent((int) (2))),_btnviewapt.getTop(),_btnw,_btnh);
 //BA.debugLineNum = 1225;BA.debugLine="btnCloseout.SetLayoutAnimated(0, 2dip, btnClose";
_btncloseout.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (2)),_btncloseout.getTop(),_btnw,_btnh);
 //BA.debugLineNum = 1226;BA.debugLine="btnMakeApt.SetLayoutAnimated(0, MidPoint + 2dip";
_btnmakeapt.SetLayoutAnimated((int) (0),(int) (_midpoint+__c.DipToCurrent((int) (2))),_btnmakeapt.getTop(),_btnw,_btnh);
 //BA.debugLineNum = 1227;BA.debugLine="If lblDayDate.IsInitialized Then";
if (_lbldaydate.IsInitialized()) { 
 //BA.debugLineNum = 1228;BA.debugLine="lblDayDate.SetLayoutAnimated(0, 2dip, lblDayDa";
_lbldaydate.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (2)),_lbldaydate.getTop(),_btnw,_lbldaydate.getHeight());
 //BA.debugLineNum = 1229;BA.debugLine="lblDayDate.SetTextAlignment(\"CENTER\", \"LEFT\")";
_lbldaydate.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 1230;BA.debugLine="lblDayDate.As(Label).SingleLine = True";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lbldaydate.getObject()))).setSingleLine(__c.True);
 };
 //BA.debugLineNum = 1232;BA.debugLine="If lblStatus.IsInitialized Then";
if (_lblstatus.IsInitialized()) { 
 //BA.debugLineNum = 1233;BA.debugLine="lblStatus.SetLayoutAnimated(0, MidPoint + 2dip";
_lblstatus.SetLayoutAnimated((int) (0),(int) (_midpoint+__c.DipToCurrent((int) (2))),_lblstatus.getTop(),_btnw,_lblstatus.getHeight());
 //BA.debugLineNum = 1234;BA.debugLine="lblStatus.SetTextAlignment(\"CENTER\", \"LEFT\")";
_lblstatus.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 1235;BA.debugLine="lblStatus.As(Label).SingleLine = True";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lblstatus.getObject()))).setSingleLine(__c.True);
 };
 };
 //BA.debugLineNum = 1238;BA.debugLine="pnlStats.SetLayoutAnimated(0, 5dip, HeaderBottom";
_pnlstats.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),_headerbottom,(int) (_width-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (170)));
 //BA.debugLineNum = 1239;BA.debugLine="CompactStatsPanel(Width - 10dip)";
_compactstatspanel((int) (_width-__c.DipToCurrent((int) (10))));
 //BA.debugLineNum = 1240;BA.debugLine="Dim ListTop As Int = pnlStats.Top + pnlStats.Hei";
_listtop = (int) (_pnlstats.getTop()+_pnlstats.getHeight());
 //BA.debugLineNum = 1241;BA.debugLine="lstTodayApts.AsView.SetLayoutAnimated(0, 0, List";
_lsttodayapts._asview().SetLayoutAnimated((int) (0),(int) (0),_listtop,_width,(int) (__c.Max(0,_height-_listtop)));
 }else {
 //BA.debugLineNum = 1243;BA.debugLine="Dim ButtonsWidth As Int = Width * 0.60";
_buttonswidth = (int) (_width*0.60);
 //BA.debugLineNum = 1244;BA.debugLine="If Panel1.IsInitialized Then Panel1.Width = Butt";
if (_panel1.IsInitialized()) { 
_panel1.setWidth(_buttonswidth);};
 //BA.debugLineNum = 1245;BA.debugLine="If btnSearch.IsInitialized Then";
if (_btnsearch.IsInitialized()) { 
 //BA.debugLineNum = 1246;BA.debugLine="btnSearch.Text = \"SEARCH FOR CLIENT\"";
_btnsearch.setText(BA.ObjectToCharSequence("SEARCH FOR CLIENT"));
 //BA.debugLineNum = 1247;BA.debugLine="btnCreateClient.Text = \"CREATE NEW CLIENT\"";
_btncreateclient.setText(BA.ObjectToCharSequence("CREATE NEW CLIENT"));
 //BA.debugLineNum = 1248;BA.debugLine="btnScrape.Text = \"SCRAPE VM\"";
_btnscrape.setText(BA.ObjectToCharSequence("SCRAPE VM"));
 //BA.debugLineNum = 1249;BA.debugLine="btnViewApt.Text = \"VIEW APPOINTMENTS\"";
_btnviewapt.setText(BA.ObjectToCharSequence("VIEW APPOINTMENTS"));
 //BA.debugLineNum = 1250;BA.debugLine="btnMakeApt.Text = \"MAKE APPOINTMENT\"";
_btnmakeapt.setText(BA.ObjectToCharSequence("MAKE APPOINTMENT"));
 //BA.debugLineNum = 1251;BA.debugLine="Dim MidPoint As Int = ButtonsWidth / 2";
_midpoint = (int) (_buttonswidth/(double)2);
 //BA.debugLineNum = 1252;BA.debugLine="Dim BtnW As Int = MidPoint - 4dip";
_btnw = (int) (_midpoint-__c.DipToCurrent((int) (4)));
 //BA.debugLineNum = 1253;BA.debugLine="Dim BtnH As Int = 50dip";
_btnh = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 1254;BA.debugLine="btnSearch.SetLayoutAnimated(0, 2dip, btnSearch.";
_btnsearch.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (2)),_btnsearch.getTop(),_btnw,_btnh);
 //BA.debugLineNum = 1255;BA.debugLine="btnCreateClient.SetLayoutAnimated(0, MidPoint +";
_btncreateclient.SetLayoutAnimated((int) (0),(int) (_midpoint+__c.DipToCurrent((int) (2))),_btncreateclient.getTop(),_btnw,_btnh);
 //BA.debugLineNum = 1256;BA.debugLine="btnScrape.SetLayoutAnimated(0, 2dip, btnScrape.";
_btnscrape.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (2)),_btnscrape.getTop(),_btnw,_btnh);
 //BA.debugLineNum = 1257;BA.debugLine="btnViewApt.SetLayoutAnimated(0, MidPoint + 2dip";
_btnviewapt.SetLayoutAnimated((int) (0),(int) (_midpoint+__c.DipToCurrent((int) (2))),_btnviewapt.getTop(),_btnw,_btnh);
 //BA.debugLineNum = 1258;BA.debugLine="btnCloseout.SetLayoutAnimated(0, 2dip, btnClose";
_btncloseout.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (2)),_btncloseout.getTop(),_btnw,_btnh);
 //BA.debugLineNum = 1259;BA.debugLine="btnMakeApt.SetLayoutAnimated(0, MidPoint + 2dip";
_btnmakeapt.SetLayoutAnimated((int) (0),(int) (_midpoint+__c.DipToCurrent((int) (2))),_btnmakeapt.getTop(),_btnw,_btnh);
 //BA.debugLineNum = 1260;BA.debugLine="If lblDayDate.IsInitialized Then";
if (_lbldaydate.IsInitialized()) { 
 //BA.debugLineNum = 1261;BA.debugLine="lblDayDate.SetLayoutAnimated(0, 2dip, lblDayDa";
_lbldaydate.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (2)),_lbldaydate.getTop(),_btnw,_lbldaydate.getHeight());
 //BA.debugLineNum = 1262;BA.debugLine="lblDayDate.SetTextAlignment(\"CENTER\", \"LEFT\")";
_lbldaydate.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 1263;BA.debugLine="lblDayDate.As(Label).SingleLine = True";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lbldaydate.getObject()))).setSingleLine(__c.True);
 };
 //BA.debugLineNum = 1265;BA.debugLine="If lblStatus.IsInitialized Then";
if (_lblstatus.IsInitialized()) { 
 //BA.debugLineNum = 1266;BA.debugLine="Dim StatusWidth As Int = ButtonsWidth - MidPoi";
_statuswidth = (int) (_buttonswidth-_midpoint-__c.DipToCurrent((int) (4)));
 //BA.debugLineNum = 1267;BA.debugLine="lblStatus.SetLayoutAnimated(0, MidPoint + 2dip";
_lblstatus.SetLayoutAnimated((int) (0),(int) (_midpoint+__c.DipToCurrent((int) (2))),_lblstatus.getTop(),_statuswidth,_lblstatus.getHeight());
 //BA.debugLineNum = 1268;BA.debugLine="lblStatus.SetTextAlignment(\"CENTER\", \"LEFT\")";
_lblstatus.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 1269;BA.debugLine="lblStatus.As(Label).SingleLine = True";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lblstatus.getObject()))).setSingleLine(__c.True);
 };
 };
 //BA.debugLineNum = 1272;BA.debugLine="Dim StatsLeft As Int = ButtonsWidth + 5dip";
_statsleft = (int) (_buttonswidth+__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 1273;BA.debugLine="Dim StatsWidth As Int = Width - StatsLeft - 5dip";
_statswidth = (int) (_width-_statsleft-__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 1274;BA.debugLine="pnlStats.SetLayoutAnimated(0, StatsLeft, Panel1.";
_pnlstats.SetLayoutAnimated((int) (0),_statsleft,_panel1.getTop(),_statswidth,(int) (_headerbottom-_panel1.getTop()));
 //BA.debugLineNum = 1275;BA.debugLine="ExpandedStatsPanel(StatsWidth, pnlStats.Height)";
_expandedstatspanel(_statswidth,_pnlstats.getHeight());
 //BA.debugLineNum = 1276;BA.debugLine="Dim ListTop As Int = HeaderBottom + 5dip";
_listtop = (int) (_headerbottom+__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 1277;BA.debugLine="lstTodayApts.AsView.SetLayoutAnimated(0, 0, List";
_lsttodayapts._asview().SetLayoutAnimated((int) (0),(int) (0),_listtop,_width,(int) (__c.Max(0,_height-_listtop)));
 };
 //BA.debugLineNum = 1279;BA.debugLine="lstTodayApts.Base_Resize(lstTodayApts.AsView.Widt";
_lsttodayapts._base_resize(_lsttodayapts._asview().getWidth(),_lsttodayapts._asview().getHeight());
 //BA.debugLineNum = 1280;BA.debugLine="If LastDashboardItems.Size > 0 Then BuildDashboar";
if (_lastdashboarditems.getSize()>0) { 
_builddashboardlist(_lastdashboarditems,_width);};
 //BA.debugLineNum = 1281;BA.debugLine="End Sub";
return "";
}
public String  _advancescrapequeue() throws Exception{
 //BA.debugLineNum = 5342;BA.debugLine="Public Sub AdvanceScrapeQueue";
 //BA.debugLineNum = 5343;BA.debugLine="If ScrapeQueue.Size = 0 Then";
if (_scrapequeue.getSize()==0) { 
 //BA.debugLineNum = 5344;BA.debugLine="xui.MsgboxAsync(\"All Voicemails Processed.\", \"Do";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("All Voicemails Processed."),BA.ObjectToCharSequence("Done"));
 //BA.debugLineNum = 5345;BA.debugLine="RefreshDashboard";
_refreshdashboard();
 //BA.debugLineNum = 5346;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 5348;BA.debugLine="ScrapeMap = ScrapeQueue.Get(0)";
_scrapemap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scrapequeue.Get((int) (0))));
 //BA.debugLineNum = 5349;BA.debugLine="ScrapeQueue.RemoveAt(0)";
_scrapequeue.RemoveAt((int) (0));
 //BA.debugLineNum = 5350;BA.debugLine="ProcessNextScrapeItem";
_processnextscrapeitem();
 //BA.debugLineNum = 5351;BA.debugLine="End Sub";
return "";
}
public String  _appendexpensetosheet(String _imglink) throws Exception{
String _d = "";
String _t = "";
String _dayname = "";
String _cat = "";
String _nots = "";
String _amt = "";
anywheresoftware.b4a.objects.collections.List _rowdata = null;
Geek.God.CRM.App.httpjob _job = null;
anywheresoftware.b4a.objects.collections.Map _valrange = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _spreadsheetid = "";
 //BA.debugLineNum = 3130;BA.debugLine="Sub AppendExpenseToSheet(ImgLink As String)";
 //BA.debugLineNum = 3135;BA.debugLine="Dim d As String = ExtractedDate";
_d = _extracteddate;
 //BA.debugLineNum = 3136;BA.debugLine="Dim t As String = ExtractedTime";
_t = _extractedtime;
 //BA.debugLineNum = 3137;BA.debugLine="Dim dayName As String = GetDayName(DateTime.Now)";
_dayname = _getdayname(__c.DateTime.getNow());
 //BA.debugLineNum = 3139;BA.debugLine="Dim cat As String = ExpenseCategorySpinner.Select";
_cat = _expensecategoryspinner.getSelectedItem();
 //BA.debugLineNum = 3140;BA.debugLine="Dim nots As String = ExpenseNotes.Text";
_nots = _expensenotes.getText();
 //BA.debugLineNum = 3141;BA.debugLine="Dim amt As String = ExpenseAmount.Text";
_amt = _expenseamount.getText();
 //BA.debugLineNum = 3144;BA.debugLine="Dim RowData As List = Array(dayName, d, t, cat, n";
_rowdata = new anywheresoftware.b4a.objects.collections.List();
_rowdata = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_dayname),(Object)(_d),(Object)(_t),(Object)(_cat),(Object)(_nots),(Object)(_imglink),(Object)(_amt)});
 //BA.debugLineNum = 3146;BA.debugLine="Dim job As HttpJob : job.Initialize(\"AppendExpens";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 3146;BA.debugLine="Dim job As HttpJob : job.Initialize(\"AppendExpens";
_job._initialize /*String*/ (ba,"AppendExpense",this);
 //BA.debugLineNum = 3147;BA.debugLine="Dim valRange As Map = CreateMap(\"values\": Array(R";
_valrange = new anywheresoftware.b4a.objects.collections.Map();
_valrange = __c.createMap(new Object[] {(Object)("values"),(Object)(new Object[]{(Object)(_rowdata.getObject())})});
 //BA.debugLineNum = 3148;BA.debugLine="Dim json As JSONGenerator : json.Initialize(valRa";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 3148;BA.debugLine="Dim json As JSONGenerator : json.Initialize(valRa";
_json.Initialize(_valrange);
 //BA.debugLineNum = 3151;BA.debugLine="Dim SpreadsheetID As String = \"1q_tx9Mw-3KKa0jAvd";
_spreadsheetid = "1q_tx9Mw-3KKa0jAvdPq4vQ-btw6kl3GvtVBC6FORrWM";
 //BA.debugLineNum = 3152;BA.debugLine="Log(\">>> [EXPENSE-LEDGER] Target Spreadsheet ID:";
__c.LogImpl("015532054",">>> [EXPENSE-LEDGER] Target Spreadsheet ID: "+_spreadsheetid,0);
 //BA.debugLineNum = 3155;BA.debugLine="job.PostString(\"https://sheets.googleapis.com/v4/";
_job._poststring /*String*/ ("https://sheets.googleapis.com/v4/spreadsheets/"+_spreadsheetid+"/values/A13:append?valueInputOption=USER_ENTERED",_json.ToString());
 //BA.debugLineNum = 3156;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 3157;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 3158;BA.debugLine="End Sub";
return "";
}
public String  _applyfontstoui() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper[] _buttons = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper[] _statlabels = null;
anywheresoftware.b4a.objects.B4XViewWrapper _sv = null;
 //BA.debugLineNum = 533;BA.debugLine="Private Sub ApplyFontsToUI";
 //BA.debugLineNum = 535;BA.debugLine="If fontLabels = Null Or fontLabels = Typeface.DEF";
if (_fontlabels== null || (_fontlabels).equals((android.graphics.Typeface)(__c.Typeface.DEFAULT))) { 
 //BA.debugLineNum = 536;BA.debugLine="SetupFontSystem";
_setupfontsystem();
 //BA.debugLineNum = 537;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 540;BA.debugLine="Try";
try { //BA.debugLineNum = 541;BA.debugLine="Dim buttons() As B4XView = Array As B4XView(btnS";
_buttons = new anywheresoftware.b4a.objects.B4XViewWrapper[]{_btnsearch,_btncreateclient,_btnscrape,_btnviewapt,_btncloseout,_btnmakeapt,_btnlogin};
 //BA.debugLineNum = 542;BA.debugLine="For Each v As B4XView In buttons";
{
final anywheresoftware.b4a.objects.B4XViewWrapper[] group7 = _buttons;
final int groupLen7 = group7.length
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_v = group7[index7];
 //BA.debugLineNum = 543;BA.debugLine="If v.IsInitialized Then";
if (_v.IsInitialized()) { 
 //BA.debugLineNum = 544;BA.debugLine="Dim btn As Button = v";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(_v.getObject()));
 //BA.debugLineNum = 545;BA.debugLine="btn.Typeface = fontButtons";
_btn.setTypeface((android.graphics.Typeface)(_fontbuttons.getObject()));
 //BA.debugLineNum = 546;BA.debugLine="btn.TextSize = 15";
_btn.setTextSize((float) (15));
 //BA.debugLineNum = 547;BA.debugLine="btn.Invalidate";
_btn.Invalidate();
 };
 }
};
 //BA.debugLineNum = 551;BA.debugLine="If lblStatus.IsInitialized Then";
if (_lblstatus.IsInitialized()) { 
 //BA.debugLineNum = 552;BA.debugLine="lblStatus.As(Label).Typeface = fontLabels";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lblstatus.getObject()))).setTypeface((android.graphics.Typeface)(_fontlabels.getObject()));
 //BA.debugLineNum = 553;BA.debugLine="lblStatus.TextSize = 14";
_lblstatus.setTextSize((float) (14));
 };
 //BA.debugLineNum = 555;BA.debugLine="If lblDayDate.IsInitialized Then";
if (_lbldaydate.IsInitialized()) { 
 //BA.debugLineNum = 556;BA.debugLine="lblDayDate.As(Label).Typeface = fontLabels";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lbldaydate.getObject()))).setTypeface((android.graphics.Typeface)(_fontlabels.getObject()));
 //BA.debugLineNum = 557;BA.debugLine="lblDayDate.TextSize = 14";
_lbldaydate.setTextSize((float) (14));
 };
 //BA.debugLineNum = 559;BA.debugLine="If lblSelectGod.IsInitialized Then";
if (_lblselectgod.IsInitialized()) { 
 //BA.debugLineNum = 560;BA.debugLine="lblSelectGod.As(Label).Typeface = fontLabels";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lblselectgod.getObject()))).setTypeface((android.graphics.Typeface)(_fontlabels.getObject()));
 //BA.debugLineNum = 561;BA.debugLine="lblSelectGod.TextSize = 16";
_lblselectgod.setTextSize((float) (16));
 };
 //BA.debugLineNum = 564;BA.debugLine="If pnlStats.IsInitialized Then";
if (_pnlstats.IsInitialized()) { 
 //BA.debugLineNum = 565;BA.debugLine="Dim statLabels() As B4XView = Array As B4XView(";
_statlabels = new anywheresoftware.b4a.objects.B4XViewWrapper[]{_lbltotalaptsgod,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbltotalaptsgoddess.getObject())),(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblgodcollected.getObject())),(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblgoddesscollected.getObject())),_lbltotalcollected,_lblappsgodnum,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblappsgoddessnum.getObject())),(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblgodcollectednum.getObject())),_lblgoddesscollectednum,_lbltotalcollectednum};
 //BA.debugLineNum = 568;BA.debugLine="For Each sv As B4XView In statLabels";
{
final anywheresoftware.b4a.objects.B4XViewWrapper[] group29 = _statlabels;
final int groupLen29 = group29.length
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_sv = group29[index29];
 //BA.debugLineNum = 569;BA.debugLine="If sv.IsInitialized Then sv.As(Label).Typeface";
if (_sv.IsInitialized()) { 
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_sv.getObject()))).setTypeface((android.graphics.Typeface)(_fontstats.getObject()));};
 }
};
 };
 //BA.debugLineNum = 573;BA.debugLine="Log(\">>> [FONTS] ApplyFontsToUI completed.\")";
__c.LogImpl("011796520",">>> [FONTS] ApplyFontsToUI completed.",0);
 } 
       catch (Exception e35) {
			ba.setLastException(e35); //BA.debugLineNum = 575;BA.debugLine="Log(\"Error applying fonts: \" & LastException)";
__c.LogImpl("011796522","Error applying fonts: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 577;BA.debugLine="End Sub";
return "";
}
public String  _applylistbackground(String _user) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _pnllist = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v0 = null;
String _bgfile = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.ImageViewWrapper _ivbg = null;
int _devicewidth = 0;
int _deviceheight = 0;
boolean _issmallscreen = false;
int _headerbottom = 0;
int _listtop = 0;
int _panelw = 0;
int _panelh = 0;
float _origw = 0f;
float _origh = 0f;
int _scaledw = 0;
int _scaledh = 0;
int _topy = 0;
 //BA.debugLineNum = 615;BA.debugLine="Private Sub ApplyListBackground(User As String)";
 //BA.debugLineNum = 616;BA.debugLine="If lstTodayApts.IsInitialized Then";
if (_lsttodayapts.IsInitialized()) { 
 //BA.debugLineNum = 617;BA.debugLine="Try";
try { //BA.debugLineNum = 618;BA.debugLine="Dim pnlList As B4XView = lstTodayApts.AsView";
_pnllist = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnllist = _lsttodayapts._asview();
 //BA.debugLineNum = 620;BA.debugLine="If pnlList.NumberOfViews > 0 Then";
if (_pnllist.getNumberOfViews()>0) { 
 //BA.debugLineNum = 621;BA.debugLine="Dim v0 As B4XView = pnlList.GetView(0)";
_v0 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v0 = _pnllist.GetView((int) (0));
 //BA.debugLineNum = 622;BA.debugLine="If v0 Is ImageView Then v0.RemoveViewFromParen";
if (_v0.getObjectOrNull() instanceof android.widget.ImageView) { 
_v0.RemoveViewFromParent();};
 };
 //BA.debugLineNum = 625;BA.debugLine="pnlList.Color = xui.Color_White";
_pnllist.setColor(_xui.Color_White);
 //BA.debugLineNum = 627;BA.debugLine="Dim bgFile As String = \"\"";
_bgfile = "";
 //BA.debugLineNum = 628;BA.debugLine="If User = \"Erin\" Then";
if ((_user).equals("Erin")) { 
 //BA.debugLineNum = 629;BA.debugLine="bgFile = \"erin_bg.png\"";
_bgfile = "erin_bg.png";
 }else {
 //BA.debugLineNum = 631;BA.debugLine="bgFile = \"mike_bg.png\"";
_bgfile = "mike_bg.png";
 };
 //BA.debugLineNum = 634;BA.debugLine="If File.Exists(File.DirAssets, bgFile) Then";
if (__c.File.Exists(__c.File.getDirAssets(),_bgfile)) { 
 //BA.debugLineNum = 635;BA.debugLine="Dim bmp As Bitmap = LoadBitmap(File.DirAssets,";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = __c.LoadBitmap(__c.File.getDirAssets(),_bgfile);
 //BA.debugLineNum = 636;BA.debugLine="Dim ivBG As ImageView";
_ivbg = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 637;BA.debugLine="ivBG.Initialize(\"\")";
_ivbg.Initialize(ba,"");
 //BA.debugLineNum = 638;BA.debugLine="ivBG.Bitmap = bmp";
_ivbg.setBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 640;BA.debugLine="Dim DeviceWidth As Int = GetDeviceLayoutValues";
_devicewidth = __c.GetDeviceLayoutValues(ba).Width;
 //BA.debugLineNum = 641;BA.debugLine="Dim DeviceHeight As Int = GetDeviceLayoutValue";
_deviceheight = __c.GetDeviceLayoutValues(ba).Height;
 //BA.debugLineNum = 642;BA.debugLine="Dim IsSmallScreen As Boolean = (DeviceWidth <";
_issmallscreen = (_devicewidth<_layout_threshold);
 //BA.debugLineNum = 644;BA.debugLine="Dim HeaderBottom As Int = spnChose.Top + spnCh";
_headerbottom = (int) (_spnchose.getTop()+_spnchose.getHeight());
 //BA.debugLineNum = 645;BA.debugLine="Dim ListTop As Int";
_listtop = 0;
 //BA.debugLineNum = 646;BA.debugLine="Dim PanelW As Int";
_panelw = 0;
 //BA.debugLineNum = 647;BA.debugLine="Dim PanelH As Int";
_panelh = 0;
 //BA.debugLineNum = 649;BA.debugLine="If IsSmallScreen Then";
if (_issmallscreen) { 
 //BA.debugLineNum = 650;BA.debugLine="ListTop = pnlStats.Top + pnlStats.Height";
_listtop = (int) (_pnlstats.getTop()+_pnlstats.getHeight());
 //BA.debugLineNum = 651;BA.debugLine="PanelW = DeviceWidth";
_panelw = _devicewidth;
 //BA.debugLineNum = 652;BA.debugLine="PanelH = Max(0, DeviceHeight - ListTop)";
_panelh = (int) (__c.Max(0,_deviceheight-_listtop));
 }else {
 //BA.debugLineNum = 654;BA.debugLine="ListTop = HeaderBottom + 5dip";
_listtop = (int) (_headerbottom+__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 655;BA.debugLine="PanelW = DeviceWidth";
_panelw = _devicewidth;
 //BA.debugLineNum = 656;BA.debugLine="PanelH = Max(0, DeviceHeight - ListTop)";
_panelh = (int) (__c.Max(0,_deviceheight-_listtop));
 };
 //BA.debugLineNum = 659;BA.debugLine="If IsSmallScreen Then";
if (_issmallscreen) { 
 //BA.debugLineNum = 660;BA.debugLine="Dim OrigW As Float = bmp.Width";
_origw = (float) (_bmp.getWidth());
 //BA.debugLineNum = 661;BA.debugLine="Dim OrigH As Float = bmp.Height";
_origh = (float) (_bmp.getHeight());
 //BA.debugLineNum = 662;BA.debugLine="Dim ScaledW As Int = PanelW";
_scaledw = _panelw;
 //BA.debugLineNum = 663;BA.debugLine="Dim ScaledH As Int = (OrigH * PanelW) / OrigW";
_scaledh = (int) ((_origh*_panelw)/(double)_origw);
 //BA.debugLineNum = 664;BA.debugLine="Dim TopY As Int = PanelH - ScaledH";
_topy = (int) (_panelh-_scaledh);
 //BA.debugLineNum = 665;BA.debugLine="If TopY < 0 Then TopY = 0";
if (_topy<0) { 
_topy = (int) (0);};
 //BA.debugLineNum = 666;BA.debugLine="ivBG.Gravity = Gravity.FILL";
_ivbg.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 667;BA.debugLine="pnlList.AddView(ivBG, 0, TopY, ScaledW, Scale";
_pnllist.AddView((android.view.View)(_ivbg.getObject()),(int) (0),_topy,_scaledw,_scaledh);
 }else {
 //BA.debugLineNum = 669;BA.debugLine="ivBG.Gravity = Gravity.FILL";
_ivbg.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 670;BA.debugLine="pnlList.AddView(ivBG, 0, 0, PanelW, PanelH)";
_pnllist.AddView((android.view.View)(_ivbg.getObject()),(int) (0),(int) (0),_panelw,_panelh);
 };
 //BA.debugLineNum = 673;BA.debugLine="ivBG.SendToBack";
_ivbg.SendToBack();
 //BA.debugLineNum = 674;BA.debugLine="ivBG.As(B4XView).Alpha = 0.2";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ivbg.getObject()))).setAlpha((float) (0.2));
 };
 } 
       catch (Exception e53) {
			ba.setLastException(e53); //BA.debugLineNum = 678;BA.debugLine="Log(\"Background Error: \" & LastException)";
__c.LogImpl("011927615","Background Error: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
 //BA.debugLineNum = 681;BA.debugLine="End Sub";
return "";
}
public String  _archivevoicemail(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
String _emlpath = "";
int _lastslash = 0;
String _fname = "";
String _amrname = "";
String _oldformat = "";
String _dayname = "";
String _datestr = "";
String _arcroot = "";
String _amrroot = "";
 //BA.debugLineNum = 5075;BA.debugLine="Public Sub ArchiveVoicemail(Data As Map)";
 //BA.debugLineNum = 5076;BA.debugLine="If Data.ContainsKey(\"FilePath\") = False Then Retu";
if (_data.ContainsKey((Object)("FilePath"))==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 5077;BA.debugLine="Dim EmlPath As String = Data.Get(\"FilePath\")";
_emlpath = BA.ObjectToString(_data.Get((Object)("FilePath")));
 //BA.debugLineNum = 5078;BA.debugLine="Dim LastSlash As Int = EmlPath.LastIndexOf(\"/\")";
_lastslash = _emlpath.lastIndexOf("/");
 //BA.debugLineNum = 5079;BA.debugLine="Dim FName As String = EmlPath.SubString(LastSlash";
_fname = _emlpath.substring((int) (_lastslash+1));
 //BA.debugLineNum = 5080;BA.debugLine="Dim AmrName As String = FName.Replace(\".eml\", \".a";
_amrname = _fname.replace(".eml",".amr");
 //BA.debugLineNum = 5081;BA.debugLine="Dim OldFormat As String = DateTime.DateFormat";
_oldformat = __c.DateTime.getDateFormat();
 //BA.debugLineNum = 5082;BA.debugLine="DateTime.DateFormat = \"EEEE\"";
__c.DateTime.setDateFormat("EEEE");
 //BA.debugLineNum = 5083;BA.debugLine="Dim DayName As String = DateTime.Date(DateTime.No";
_dayname = __c.DateTime.Date(__c.DateTime.getNow());
 //BA.debugLineNum = 5084;BA.debugLine="DateTime.DateFormat = \"MMddyyyy\"";
__c.DateTime.setDateFormat("MMddyyyy");
 //BA.debugLineNum = 5085;BA.debugLine="Dim DateStr As String = DateTime.Date(DateTime.No";
_datestr = __c.DateTime.Date(__c.DateTime.getNow());
 //BA.debugLineNum = 5086;BA.debugLine="DateTime.DateFormat = OldFormat";
__c.DateTime.setDateFormat(_oldformat);
 //BA.debugLineNum = 5087;BA.debugLine="Dim ArcRoot As String = File.DirRootExternal & \"/";
_arcroot = __c.File.getDirRootExternal()+"/VisualVoiceMail/Archive/"+_dayname+" "+_datestr;
 //BA.debugLineNum = 5088;BA.debugLine="File.MakeDir(ArcRoot, \"Transcript\")";
__c.File.MakeDir(_arcroot,"Transcript");
 //BA.debugLineNum = 5089;BA.debugLine="File.MakeDir(ArcRoot, \"Voicemail\")";
__c.File.MakeDir(_arcroot,"Voicemail");
 //BA.debugLineNum = 5090;BA.debugLine="Try";
try { //BA.debugLineNum = 5091;BA.debugLine="File.Copy(\"\", EmlPath, ArcRoot & \"/Transcript\",";
__c.File.Copy("",_emlpath,_arcroot+"/Transcript",_fname);
 //BA.debugLineNum = 5092;BA.debugLine="File.Delete(\"\", EmlPath)";
__c.File.Delete("",_emlpath);
 //BA.debugLineNum = 5093;BA.debugLine="Dim AmrRoot As String = File.DirRootExternal & \"";
_amrroot = __c.File.getDirRootExternal()+"/VisualVoiceMail/"+_amrname;
 //BA.debugLineNum = 5094;BA.debugLine="If File.Exists(\"\", AmrRoot) Then";
if (__c.File.Exists("",_amrroot)) { 
 //BA.debugLineNum = 5095;BA.debugLine="File.Copy(\"\", AmrRoot, ArcRoot & \"/Voicemail\",";
__c.File.Copy("",_amrroot,_arcroot+"/Voicemail",_amrname);
 //BA.debugLineNum = 5096;BA.debugLine="File.Delete(\"\", AmrRoot)";
__c.File.Delete("",_amrroot);
 };
 } 
       catch (Exception e24) {
			ba.setLastException(e24); //BA.debugLineNum = 5099;BA.debugLine="Log(\"Archive Failed: \" & LastException)";
__c.LogImpl("020709400","Archive Failed: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 5101;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_activityresult(int _requestcode,int _resultcode,anywheresoftware.b4a.objects.IntentWrapper _data) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
 //BA.debugLineNum = 1136;BA.debugLine="Sub B4XPage_ActivityResult (RequestCode As Int, Re";
 //BA.debugLineNum = 1137;BA.debugLine="If RequestCode = 123 And ResultCode = -1 Then";
if (_requestcode==123 && _resultcode==-1) { 
 //BA.debugLineNum = 1138;BA.debugLine="Log(\"Photo Captured!\")";
__c.LogImpl("013041666","Photo Captured!",0);
 //BA.debugLineNum = 1139;BA.debugLine="If Data.IsInitialized And Data.HasExtra(\"data\")";
if (_data.IsInitialized() && _data.HasExtra("data")) { 
 //BA.debugLineNum = 1140;BA.debugLine="Dim bmp As Bitmap = Data.GetExtra(\"data\")";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_data.GetExtra("data")));
 //BA.debugLineNum = 1141;BA.debugLine="SaveBitmapToTemp(bmp)";
_savebitmaptotemp(_bmp);
 }else if(__c.File.Exists(__c.File.getDirInternal(),"expense_temp.jpg")) { 
 //BA.debugLineNum = 1143;BA.debugLine="ExpensePhotoPath = File.Combine(File.DirInterna";
_expensephotopath = __c.File.Combine(__c.File.getDirInternal(),"expense_temp.jpg");
 }else {
 //BA.debugLineNum = 1145;BA.debugLine="xui.MsgboxAsync(\"Error: No image returned.\", \"C";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error: No image returned."),BA.ObjectToCharSequence("Camera"));
 //BA.debugLineNum = 1146;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1148;BA.debugLine="ShowExpenseUI";
_showexpenseui();
 //BA.debugLineNum = 1149;BA.debugLine="ProcessReceiptOCR(ExpensePhotoPath)";
_processreceiptocr(_expensephotopath);
 };
 //BA.debugLineNum = 1151;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_appear() throws Exception{
anywheresoftware.b4a.objects.ActivityWrapper _act = null;
anywheresoftware.b4a.objects.IntentWrapper _i = null;
 //BA.debugLineNum = 1153;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 1154;BA.debugLine="Log(\">>> [NATIVE-RESIZE] B4XPage_Appear Triggered";
__c.LogImpl("013107201",">>> [NATIVE-RESIZE] B4XPage_Appear Triggered. Checking Fold State...",0);
 //BA.debugLineNum = 1155;BA.debugLine="StartFoldListener";
_startfoldlistener();
 //BA.debugLineNum = 1156;BA.debugLine="StartGestures";
_startgestures();
 //BA.debugLineNum = 1159;BA.debugLine="Try";
try { //BA.debugLineNum = 1160;BA.debugLine="Dim act As Activity = B4XPages.GetNativeParent(M";
_act = new anywheresoftware.b4a.objects.ActivityWrapper();
_act = _b4xpages._getnativeparent /*anywheresoftware.b4a.objects.ActivityWrapper*/ (ba,this);
 //BA.debugLineNum = 1161;BA.debugLine="Dim i As Intent = act.GetStartingIntent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
_i = _act.GetStartingIntent();
 //BA.debugLineNum = 1163;BA.debugLine="If OAuth2.IsInitialized Then";
if (_oauth2._isinitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 1164;BA.debugLine="OAuth2.CallFromResume(i)";
_oauth2._callfromresume /*String*/ (_i);
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 1167;BA.debugLine="Log(\"Error handling Resume Intent: \" & LastExcep";
__c.LogImpl("013107214","Error handling Resume Intent: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 1170;BA.debugLine="If Root.IsInitialized Then";
if (_root.IsInitialized()) { 
 //BA.debugLineNum = 1171;BA.debugLine="B4XPage_Resize(Root.Width, Root.Height)";
_b4xpage_resize(_root.getWidth(),_root.getHeight());
 };
 //BA.debugLineNum = 1173;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 168;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 171;BA.debugLine="If HasRunOnce = True Then";
if (_hasrunonce==__c.True) { 
 //BA.debugLineNum = 172;BA.debugLine="ResumeAppStartup";
_resumeappstartup();
 //BA.debugLineNum = 173;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 176;BA.debugLine="HasRunOnce = True ' Mark that the app has started";
_hasrunonce = __c.True;
 //BA.debugLineNum = 179;BA.debugLine="Log(\">>> [SPLASH] Skipped for Stability.\")";
__c.LogImpl("011468812",">>> [SPLASH] Skipped for Stability.",0);
 //BA.debugLineNum = 180;BA.debugLine="ResumeAppStartup";
_resumeappstartup();
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_disappear() throws Exception{
 //BA.debugLineNum = 869;BA.debugLine="Private Sub B4XPage_Disappear";
 //BA.debugLineNum = 870;BA.debugLine="StopGestures ' [GESTURE] Stop listening to save b";
_stopgestures();
 //BA.debugLineNum = 871;BA.debugLine="StopFoldListener ' [FOLD] Stop listening to preve";
_stopfoldlistener();
 //BA.debugLineNum = 872;BA.debugLine="Log(\"B4XMainPage disappeared\")";
__c.LogImpl("012713987","B4XMainPage disappeared",0);
 //BA.debugLineNum = 873;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(int _width,int _height) throws Exception{
Geek.God.CRM.App.b4xpagesmanager._b4xpageinfo _info = null;
String _toppageid = "";
 //BA.debugLineNum = 265;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
 //BA.debugLineNum = 267;BA.debugLine="If Root.IsInitialized = False Then Return";
if (_root.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 268;BA.debugLine="If Width < 50 Or Height < 50 Then Return";
if (_width<50 || _height<50) { 
if (true) return "";};
 //BA.debugLineNum = 271;BA.debugLine="Dim info As B4XPageInfo = B4XPages.GetManager.Get";
_info = _b4xpages._getmanager /*Geek.God.CRM.App.b4xpagesmanager*/ (ba)._gettoppage /*Geek.God.CRM.App.b4xpagesmanager._b4xpageinfo*/ ();
 //BA.debugLineNum = 272;BA.debugLine="If info = Null Or info.Id = \"\" Then";
if (_info== null || (_info.Id /*String*/ ).equals("")) { 
 //BA.debugLineNum = 273;BA.debugLine="Log(\">>> [NATIVE-RESIZE] Skipping: Top Page not";
__c.LogImpl("011599880",">>> [NATIVE-RESIZE] Skipping: Top Page not ready.",0);
 //BA.debugLineNum = 274;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 277;BA.debugLine="Log(\"============================================";
__c.LogImpl("011599884","==================================================",0);
 //BA.debugLineNum = 278;BA.debugLine="Log(\">>> [NATIVE-RESIZE] SCREEN CHANGE: \" & Width";
__c.LogImpl("011599885",">>> [NATIVE-RESIZE] SCREEN CHANGE: "+BA.NumberToString(_width)+"x"+BA.NumberToString(_height)+" | State: "+_lastfoldstate,0);
 //BA.debugLineNum = 280;BA.debugLine="Dim TopPageId As String = info.Id";
_toppageid = _info.Id /*String*/ ;
 //BA.debugLineNum = 281;BA.debugLine="Log(\">>> [NATIVE-RESIZE] Active Page Detected: [\"";
__c.LogImpl("011599888",">>> [NATIVE-RESIZE] Active Page Detected: ["+_toppageid+"]",0);
 //BA.debugLineNum = 283;BA.debugLine="Select TopPageId.ToLowerCase";
switch (BA.switchObjectToInt(_toppageid.toLowerCase(),"mainpage","appointmentpage","createclientpage","searchpage","viewschedulepage","closeout")) {
case 0: {
 //BA.debugLineNum = 285;BA.debugLine="Log(\">>> [NATIVE-RESIZE] Executing AdjustLayout";
__c.LogImpl("011599892",">>> [NATIVE-RESIZE] Executing AdjustLayout for buttons and headers...",0);
 //BA.debugLineNum = 286;BA.debugLine="AdjustLayout(Width, Height)";
_adjustlayout(_width,_height);
 break; }
case 1: {
 //BA.debugLineNum = 289;BA.debugLine="CallSub2(appointmentScreen, \"RedrawUI\", Width)";
__c.CallSubNew2(ba,(Object)(_appointmentscreen),"RedrawUI",(Object)(_width));
 break; }
case 2: {
 //BA.debugLineNum = 292;BA.debugLine="CallSub2(clientCreator, \"RedrawUI\", Width)";
__c.CallSubNew2(ba,(Object)(_clientcreator),"RedrawUI",(Object)(_width));
 break; }
case 3: {
 //BA.debugLineNum = 295;BA.debugLine="CallSub2(searchScreen, \"RedrawUI\", Width)";
__c.CallSubNew2(ba,(Object)(_searchscreen),"RedrawUI",(Object)(_width));
 break; }
case 4: {
 //BA.debugLineNum = 298;BA.debugLine="CallSub2(ViewScheduleScreen, \"RedrawUI\", Width)";
__c.CallSubNew2(ba,(Object)(_viewschedulescreen),"RedrawUI",(Object)(_width));
 break; }
case 5: {
 //BA.debugLineNum = 301;BA.debugLine="CallSub2(CloseOutScreen, \"RedrawUI\", Width)";
__c.CallSubNew2(ba,(Object)(_closeoutscreen),"RedrawUI",(Object)(_width));
 break; }
default: {
 //BA.debugLineNum = 304;BA.debugLine="Log(\">>> [NATIVE-RESIZE] WARNING: Unknown Page";
__c.LogImpl("011599911",">>> [NATIVE-RESIZE] WARNING: Unknown Page ID: "+_toppageid,0);
 break; }
}
;
 //BA.debugLineNum = 306;BA.debugLine="Log(\"============================================";
__c.LogImpl("011599913","==================================================",0);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return "";
}
public String  _batchfetchtabs(anywheresoftware.b4a.objects.collections.List _tabs,String _ledgerid) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
String _tabname = "";
String _range = "";
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 3858;BA.debugLine="Sub BatchFetchTabs(Tabs As List, ledgerID As Strin";
 //BA.debugLineNum = 3859;BA.debugLine="Dim sb As StringBuilder : sb.Initialize";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 3859;BA.debugLine="Dim sb As StringBuilder : sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 3860;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 3861;BA.debugLine="For Each tabName As String In Tabs";
{
final anywheresoftware.b4a.BA.IterableList group4 = _tabs;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_tabname = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 3862;BA.debugLine="Dim range As String = tabName & \"!A:G\"";
_range = _tabname+"!A:G";
 //BA.debugLineNum = 3863;BA.debugLine="sb.Append(\"&ranges=\").Append(su.EncodeUrl(range,";
_sb.Append("&ranges=").Append(_su.EncodeUrl(_range,"UTF8"));
 }
};
 //BA.debugLineNum = 3865;BA.debugLine="Dim job As HttpJob : job.Initialize(\"BatchGetLedg";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 3865;BA.debugLine="Dim job As HttpJob : job.Initialize(\"BatchGetLedg";
_job._initialize /*String*/ (ba,"BatchGetLedger",this);
 //BA.debugLineNum = 3866;BA.debugLine="job.Download(\"https://sheets.googleapis.com/v4/sp";
_job._download /*String*/ ("https://sheets.googleapis.com/v4/spreadsheets/"+_ledgerid+"/values:batchGet?majorDimension=ROWS"+_sb.ToString());
 //BA.debugLineNum = 3867;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 3868;BA.debugLine="End Sub";
return "";
}
public String  _batchgetledger(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
anywheresoftware.b4a.objects.collections.List _valueranges = null;
double _currentspend = 0;
int _currentvisits = 0;
String _lastdatestr = "";
String _targetname = "";
anywheresoftware.b4a.objects.collections.Map _rangeobj = null;
anywheresoftware.b4a.objects.collections.List _rows = null;
anywheresoftware.b4a.objects.collections.List _row = null;
String _rowname = "";
String _dstr = "";
String _issue = "";
String _resolved = "";
String _payment = "";
String _cleanpay = "";
String _historyitem = "";
 //BA.debugLineNum = 3870;BA.debugLine="Sub BatchGetLedger(Job As HttpJob)";
 //BA.debugLineNum = 3871;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 3871;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 3872;BA.debugLine="Dim rootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 3873;BA.debugLine="Dim valueRanges As List = rootMap.Get(\"valueRange";
_valueranges = new anywheresoftware.b4a.objects.collections.List();
_valueranges = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_rootmap.Get((Object)("valueRanges"))));
 //BA.debugLineNum = 3874;BA.debugLine="Dim currentSpend As Double = TempProfile.Get(\"Raw";
_currentspend = (double)(BA.ObjectToNumber(_tempprofile.Get((Object)("RawTotalSpend"))));
 //BA.debugLineNum = 3875;BA.debugLine="Dim currentVisits As Int = TempProfile.Get(\"RawVi";
_currentvisits = (int)(BA.ObjectToNumber(_tempprofile.Get((Object)("RawVisitCount"))));
 //BA.debugLineNum = 3876;BA.debugLine="Dim lastDateStr As String = TempProfile.Get(\"Last";
_lastdatestr = BA.ObjectToString(_tempprofile.Get((Object)("LastVisit")));
 //BA.debugLineNum = 3877;BA.debugLine="Dim targetName As String = TempProfile.Get(\"Name\"";
_targetname = (BA.ObjectToString(_tempprofile.Get((Object)("Name")))).toLowerCase();
 //BA.debugLineNum = 3878;BA.debugLine="For Each rangeObj As Map In valueRanges";
_rangeobj = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group9 = _valueranges;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_rangeobj = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group9.Get(index9)));
 //BA.debugLineNum = 3879;BA.debugLine="If rangeObj.ContainsKey(\"values\") Then";
if (_rangeobj.ContainsKey((Object)("values"))) { 
 //BA.debugLineNum = 3880;BA.debugLine="Dim rows As List = rangeObj.Get(\"values\")";
_rows = new anywheresoftware.b4a.objects.collections.List();
_rows = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_rangeobj.Get((Object)("values"))));
 //BA.debugLineNum = 3881;BA.debugLine="For Each row As List In rows";
_row = new anywheresoftware.b4a.objects.collections.List();
{
final anywheresoftware.b4a.BA.IterableList group12 = _rows;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_row = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(group12.Get(index12)));
 //BA.debugLineNum = 3882;BA.debugLine="If row.Size > 1 Then";
if (_row.getSize()>1) { 
 //BA.debugLineNum = 3883;BA.debugLine="Dim rowName As String = row.Get(1)";
_rowname = BA.ObjectToString(_row.Get((int) (1)));
 //BA.debugLineNum = 3884;BA.debugLine="If rowName.ToLowerCase.Contains(targetName) T";
if (_rowname.toLowerCase().contains(_targetname)) { 
 //BA.debugLineNum = 3885;BA.debugLine="currentVisits = currentVisits + 1";
_currentvisits = (int) (_currentvisits+1);
 //BA.debugLineNum = 3886;BA.debugLine="Dim dStr As String = row.Get(0)";
_dstr = BA.ObjectToString(_row.Get((int) (0)));
 //BA.debugLineNum = 3887;BA.debugLine="Dim issue As String = \"General\"";
_issue = "General";
 //BA.debugLineNum = 3888;BA.debugLine="Dim resolved As String = \"N/A\"";
_resolved = "N/A";
 //BA.debugLineNum = 3889;BA.debugLine="Dim payment As String = \"$0.00\"";
_payment = "$0.00";
 //BA.debugLineNum = 3890;BA.debugLine="If row.Size > 4 Then issue = row.Get(4)";
if (_row.getSize()>4) { 
_issue = BA.ObjectToString(_row.Get((int) (4)));};
 //BA.debugLineNum = 3891;BA.debugLine="If row.Size > 5 Then resolved = row.Get(5)";
if (_row.getSize()>5) { 
_resolved = BA.ObjectToString(_row.Get((int) (5)));};
 //BA.debugLineNum = 3892;BA.debugLine="If row.Size > 6 Then";
if (_row.getSize()>6) { 
 //BA.debugLineNum = 3893;BA.debugLine="payment = row.Get(6)";
_payment = BA.ObjectToString(_row.Get((int) (6)));
 //BA.debugLineNum = 3894;BA.debugLine="Dim cleanPay As String = payment.Replace(\"$";
_cleanpay = _payment.replace("$","").replace(",","").trim();
 //BA.debugLineNum = 3895;BA.debugLine="If IsNumber(cleanPay) Then currentSpend = c";
if (__c.IsNumber(_cleanpay)) { 
_currentspend = _currentspend+(double)(Double.parseDouble(_cleanpay));};
 };
 //BA.debugLineNum = 3897;BA.debugLine="lastDateStr = dStr";
_lastdatestr = _dstr;
 //BA.debugLineNum = 3898;BA.debugLine="Dim historyItem As String = dStr & \" - \" & i";
_historyitem = _dstr+" - "+_issue+" - "+_resolved+" - "+_payment;
 //BA.debugLineNum = 3899;BA.debugLine="IssuesHistory.InsertAt(0, historyItem)";
_issueshistory.InsertAt((int) (0),(Object)(_historyitem));
 };
 };
 }
};
 };
 }
};
 //BA.debugLineNum = 3905;BA.debugLine="TempProfile.Put(\"RawTotalSpend\", currentSpend)";
_tempprofile.Put((Object)("RawTotalSpend"),(Object)(_currentspend));
 //BA.debugLineNum = 3906;BA.debugLine="TempProfile.Put(\"RawVisitCount\", currentVisits)";
_tempprofile.Put((Object)("RawVisitCount"),(Object)(_currentvisits));
 //BA.debugLineNum = 3907;BA.debugLine="TempProfile.Put(\"LastVisit\", lastDateStr)";
_tempprofile.Put((Object)("LastVisit"),(Object)(_lastdatestr));
 //BA.debugLineNum = 3908;BA.debugLine="ProcessNextLedger";
_processnextledger();
 //BA.debugLineNum = 3909;BA.debugLine="End Sub";
return "";
}
public String  _btncloseexpense_click() throws Exception{
 //BA.debugLineNum = 3171;BA.debugLine="Sub btnCloseExpense_Click";
 //BA.debugLineNum = 3172;BA.debugLine="ExpensePanel.RemoveViewFromParent";
_expensepanel.RemoveViewFromParent();
 //BA.debugLineNum = 3173;BA.debugLine="End Sub";
return "";
}
public String  _btncloseout_click() throws Exception{
 //BA.debugLineNum = 4325;BA.debugLine="Sub btnCloseout_Click";
 //BA.debugLineNum = 4326;BA.debugLine="If ActiveAppointmentID = \"\" Then";
if ((_activeappointmentid).equals("")) { 
 //BA.debugLineNum = 4327;BA.debugLine="xui.MsgboxAsync(\"No Active Appointment. Start a";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("No Active Appointment. Start a job first by clicking 'Arrival' on an appointment card."),BA.ObjectToCharSequence("No Active Job"));
 //BA.debugLineNum = 4328;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4331;BA.debugLine="If CloseOutScreen.IsInitialized Then";
if (_closeoutscreen.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 4332;BA.debugLine="B4XPages.ShowPage(\"CloseOut\")";
_b4xpages._showpage /*String*/ (ba,"CloseOut");
 //BA.debugLineNum = 4333;BA.debugLine="CallSub2(CloseOutScreen, \"LoadJob\", Array(Active";
__c.CallSubNew2(ba,(Object)(_closeoutscreen),"LoadJob",(Object)(new Object[]{(Object)(_activejobmap.getObject()),(Object)(_activearrivaltime),(Object)(__c.DateTime.getNow())}));
 };
 //BA.debugLineNum = 4335;BA.debugLine="End Sub";
return "";
}
public void  _btncloseout_longclick() throws Exception{
ResumableSub_btnCloseout_LongClick rsub = new ResumableSub_btnCloseout_LongClick(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnCloseout_LongClick extends BA.ResumableSub {
public ResumableSub_btnCloseout_LongClick(Geek.God.CRM.App.b4xmainpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.b4xmainpage parent;
String _user = "";
anywheresoftware.b4a.objects.collections.List _options = null;
int _index = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2799;BA.debugLine="Log(\">>> [DEBUG] Long Click Detected on CloseOut";
parent.__c.LogImpl("014680065",">>> [DEBUG] Long Click Detected on CloseOut Button",0);
 //BA.debugLineNum = 2801;BA.debugLine="If appSettings.IsInitialized = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._appsettings.IsInitialized()==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 2802;BA.debugLine="appSettings.Initialize";
parent._appsettings.Initialize();
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 2805;BA.debugLine="Dim User As String = appSettings.GetDefault(\"Curr";
_user = BA.ObjectToString(parent._appsettings.GetDefault((Object)("CurrentUser"),(Object)("Mike")));
 //BA.debugLineNum = 2806;BA.debugLine="Dim Options As List : Options.Initialize";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2806;BA.debugLine="Dim Options As List : Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 2809;BA.debugLine="If User = \"Mike\" Then";
if (true) break;

case 5:
//if
this.state = 32;
if ((_user).equals("Mike")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 2810;BA.debugLine="Options.AddAll(Array As String( _ 			\"Create New";
_options.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Create New Master Ledger (Year)","View Current Ledger (Month)","View Google Calendar","View Google Contacts","View Ledger Links / API","View Expense Ledger (Year-Master)","Font Manager","Turn On/Off Sound"}));
 //BA.debugLineNum = 2820;BA.debugLine="InputListAsync(Options, \"Geek God Admin Menu\", -";
parent.__c.InputListAsync(_options,BA.ObjectToCharSequence("Geek God Admin Menu"),(int) (-1),ba,parent.__c.True);
 //BA.debugLineNum = 2821;BA.debugLine="Wait For InputList_Result (Index As Int)";
parent.__c.WaitFor("inputlist_result", ba, this, null);
this.state = 62;
return;
case 62:
//C
this.state = 8;
_index = (Integer) result[0];
;
 //BA.debugLineNum = 2822;BA.debugLine="If Index = DialogResponse.CANCEL Then Return";
if (true) break;

case 8:
//if
this.state = 13;
if (_index==parent.__c.DialogResponse.CANCEL) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
if (true) return ;
if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 2824;BA.debugLine="Select Index";
if (true) break;

case 14:
//select
this.state = 31;
switch (_index) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
case 2: {
this.state = 20;
if (true) break;
}
case 3: {
this.state = 22;
if (true) break;
}
case 4: {
this.state = 24;
if (true) break;
}
case 5: {
this.state = 26;
if (true) break;
}
case 6: {
this.state = 28;
if (true) break;
}
case 7: {
this.state = 30;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 31;
 //BA.debugLineNum = 2825;BA.debugLine="Case 0: GenerateSmartLedger";
parent._generatesmartledger();
 if (true) break;

case 18:
//C
this.state = 31;
 //BA.debugLineNum = 2826;BA.debugLine="Case 1: LaunchBrowser(\"https://docs.google.com/";
parent._launchbrowser("https://docs.google.com/spreadsheets/d/"+parent._currentledgerid);
 if (true) break;

case 20:
//C
this.state = 31;
 //BA.debugLineNum = 2827;BA.debugLine="Case 2: LaunchBrowser(\"https://calendar.google.";
parent._launchbrowser("https://calendar.google.com");
 if (true) break;

case 22:
//C
this.state = 31;
 //BA.debugLineNum = 2828;BA.debugLine="Case 3: LaunchBrowser(\"https://contacts.google.";
parent._launchbrowser("https://contacts.google.com");
 if (true) break;

case 24:
//C
this.state = 31;
 //BA.debugLineNum = 2829;BA.debugLine="Case 4: LaunchBrowser(\"https://console.cloud.go";
parent._launchbrowser("https://console.cloud.google.com/apis/credentials");
 if (true) break;

case 26:
//C
this.state = 31;
 //BA.debugLineNum = 2830;BA.debugLine="Case 5: LaunchBrowser(\"https://docs.google.com/";
parent._launchbrowser("https://docs.google.com/spreadsheets/d/1q_tx9Mw-3KKa0jAvdPq4vQ-btw6kl3GvtVBC6FORrWM");
 if (true) break;

case 28:
//C
this.state = 31;
 //BA.debugLineNum = 2831;BA.debugLine="Case 6: RunFontManager";
parent._runfontmanager();
 if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 2832;BA.debugLine="Case 7: ToggleSound";
parent._togglesound();
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;
;
 //BA.debugLineNum = 2837;BA.debugLine="If User = \"Erin\" Then";

case 32:
//if
this.state = 61;
if ((_user).equals("Erin")) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 2838;BA.debugLine="Options.AddAll(Array As String( _ 			\"Expense Mo";
_options.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Expense Module (Scan)","View Current Ledger (Month)","View Google Calendar","View Google Contacts","View Expense Ledger (Month)","View Expense Ledger (Year-Master)","Create New Expense Ledger (Year)","Font Manager","Turn On/Off Sound"}));
 //BA.debugLineNum = 2849;BA.debugLine="InputListAsync(Options, \"Goddess Admin Menu\", -1";
parent.__c.InputListAsync(_options,BA.ObjectToCharSequence("Goddess Admin Menu"),(int) (-1),ba,parent.__c.True);
 //BA.debugLineNum = 2850;BA.debugLine="Wait For InputList_Result (Index As Int)";
parent.__c.WaitFor("inputlist_result", ba, this, null);
this.state = 63;
return;
case 63:
//C
this.state = 35;
_index = (Integer) result[0];
;
 //BA.debugLineNum = 2851;BA.debugLine="If Index = DialogResponse.CANCEL Then Return";
if (true) break;

case 35:
//if
this.state = 40;
if (_index==parent.__c.DialogResponse.CANCEL) { 
this.state = 37;
;}if (true) break;

case 37:
//C
this.state = 40;
if (true) return ;
if (true) break;

case 40:
//C
this.state = 41;
;
 //BA.debugLineNum = 2853;BA.debugLine="Select Index";
if (true) break;

case 41:
//select
this.state = 60;
switch (_index) {
case 0: {
this.state = 43;
if (true) break;
}
case 1: {
this.state = 45;
if (true) break;
}
case 2: {
this.state = 47;
if (true) break;
}
case 3: {
this.state = 49;
if (true) break;
}
case 4: {
this.state = 51;
if (true) break;
}
case 5: {
this.state = 53;
if (true) break;
}
case 6: {
this.state = 55;
if (true) break;
}
case 7: {
this.state = 57;
if (true) break;
}
case 8: {
this.state = 59;
if (true) break;
}
}
if (true) break;

case 43:
//C
this.state = 60;
 //BA.debugLineNum = 2854;BA.debugLine="Case 0: TakeExpensePhoto";
parent._takeexpensephoto();
 if (true) break;

case 45:
//C
this.state = 60;
 //BA.debugLineNum = 2855;BA.debugLine="Case 1: LaunchBrowser(\"https://docs.google.com/";
parent._launchbrowser("https://docs.google.com/spreadsheets/d/"+parent._currentledgerid);
 if (true) break;

case 47:
//C
this.state = 60;
 //BA.debugLineNum = 2856;BA.debugLine="Case 2: LaunchBrowser(\"https://calendar.google.";
parent._launchbrowser("https://calendar.google.com");
 if (true) break;

case 49:
//C
this.state = 60;
 //BA.debugLineNum = 2857;BA.debugLine="Case 3: LaunchBrowser(\"https://contacts.google.";
parent._launchbrowser("https://contacts.google.com");
 if (true) break;

case 51:
//C
this.state = 60;
 //BA.debugLineNum = 2858;BA.debugLine="Case 4: LaunchBrowser(\"https://docs.google.com/";
parent._launchbrowser("https://docs.google.com/spreadsheets/d/1q_tx9Mw-3KKa0jAvdPq4vQ-btw6kl3GvtVBC6FORrWM");
 if (true) break;

case 53:
//C
this.state = 60;
 //BA.debugLineNum = 2859;BA.debugLine="Case 5: LaunchBrowser(\"https://docs.google.com/";
parent._launchbrowser("https://docs.google.com/spreadsheets/d/1q_tx9Mw-3KKa0jAvdPq4vQ-btw6kl3GvtVBC6FORrWM");
 if (true) break;

case 55:
//C
this.state = 60;
 //BA.debugLineNum = 2860;BA.debugLine="Case 6: GenerateSmartLedger ' Reusing logic for";
parent._generatesmartledger();
 if (true) break;

case 57:
//C
this.state = 60;
 //BA.debugLineNum = 2861;BA.debugLine="Case 7: RunFontManager";
parent._runfontmanager();
 if (true) break;

case 59:
//C
this.state = 60;
 //BA.debugLineNum = 2862;BA.debugLine="Case 8: ToggleSound";
parent._togglesound();
 if (true) break;

case 60:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = -1;
;
 //BA.debugLineNum = 2865;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _inputlist_result(int _index) throws Exception{
}
public String  _btnclosescraper_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnloverlay = null;
 //BA.debugLineNum = 5699;BA.debugLine="Sub btnCloseScraper_Click";
 //BA.debugLineNum = 5700;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 5701;BA.debugLine="Dim pnlOverlay As B4XView = btn.Tag";
_pnloverlay = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnloverlay = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getTag()));
 //BA.debugLineNum = 5702;BA.debugLine="pnlOverlay.RemoveViewFromParent";
_pnloverlay.RemoveViewFromParent();
 //BA.debugLineNum = 5704;BA.debugLine="ScrapeQueue.Clear";
_scrapequeue.Clear();
 //BA.debugLineNum = 5705;BA.debugLine="Root.As(B4XView).SetLayoutAnimated(0, 0, 0, Root.";
(_root).SetLayoutAnimated((int) (0),(int) (0),(int) (0),_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 5706;BA.debugLine="RefreshDashboard";
_refreshdashboard();
 //BA.debugLineNum = 5707;BA.debugLine="End Sub";
return "";
}
public String  _btncreateclient_click() throws Exception{
 //BA.debugLineNum = 4305;BA.debugLine="Sub btnCreateClient_Click";
 //BA.debugLineNum = 4306;BA.debugLine="If clientCreator.IsInitialized Then";
if (_clientcreator.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 4307;BA.debugLine="B4XPages.ShowPage(\"CreateClientPage\")";
_b4xpages._showpage /*String*/ (ba,"CreateClientPage");
 }else {
 //BA.debugLineNum = 4309;BA.debugLine="xui.MsgboxAsync(\"Error: Screen not initialized.\"";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error: Screen not initialized."),BA.ObjectToCharSequence("Error"));
 };
 //BA.debugLineNum = 4311;BA.debugLine="End Sub";
return "";
}
public String  _btncreateledger_click() throws Exception{
 //BA.debugLineNum = 4337;BA.debugLine="Sub btnCreateLedger_Click";
 //BA.debugLineNum = 4338;BA.debugLine="If OAuth2.access_token = \"\" Then";
if ((_oauth2._access_token /*String*/ ).equals("")) { 
 //BA.debugLineNum = 4339;BA.debugLine="OAuth2.GetAccessToken";
_oauth2._getaccesstoken /*String*/ ();
 //BA.debugLineNum = 4340;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4342;BA.debugLine="lblStatus.Text = \"Status: Generating Ledger...\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Generating Ledger..."));
 //BA.debugLineNum = 4343;BA.debugLine="ProgressDialogShow(\"Starting Generation...\")";
__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Starting Generation..."));
 //BA.debugLineNum = 4344;BA.debugLine="GenerateSmartLedger";
_generatesmartledger();
 //BA.debugLineNum = 4345;BA.debugLine="End Sub";
return "";
}
public String  _btnlogin_click() throws Exception{
 //BA.debugLineNum = 4295;BA.debugLine="Sub btnLogin_Click";
 //BA.debugLineNum = 4296;BA.debugLine="lblStatus.Text = \"Status: Connecting...\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Connecting..."));
 //BA.debugLineNum = 4297;BA.debugLine="btnLogin.Visible = False";
_btnlogin.setVisible(__c.False);
 //BA.debugLineNum = 4298;BA.debugLine="OAuth2.GetAccessToken";
_oauth2._getaccesstoken /*String*/ ();
 //BA.debugLineNum = 4299;BA.debugLine="End Sub";
return "";
}
public String  _btnmakeapt_click() throws Exception{
 //BA.debugLineNum = 4321;BA.debugLine="Sub btnMakeApt_Click";
 //BA.debugLineNum = 4322;BA.debugLine="B4XPages.ShowPage(\"AppointmentPage\")";
_b4xpages._showpage /*String*/ (ba,"AppointmentPage");
 //BA.debugLineNum = 4323;BA.debugLine="End Sub";
return "";
}
public void  _btnplayvm_click() throws Exception{
ResumableSub_btnPlayVM_Click rsub = new ResumableSub_btnPlayVM_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnPlayVM_Click extends BA.ResumableSub {
public ResumableSub_btnPlayVM_Click(Geek.God.CRM.App.b4xmainpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.b4xmainpage parent;
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
String _audiopath = "";
anywheresoftware.b4a.objects.B4XViewWrapper _pnlleft = null;
anywheresoftware.b4a.objects.SeekBarWrapper _xslider = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xdurlabel = null;
int _totalms = 0;
int _totalsecs = 0;
int _currentms = 0;
int _remainingsecs = 0;
float _percentcomplete = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 5607;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
 //BA.debugLineNum = 5608;BA.debugLine="Dim AudioPath As String = btn.Tag";
_audiopath = BA.ObjectToString(_btn.getTag());
 //BA.debugLineNum = 5609;BA.debugLine="Dim pnlLeft As B4XView = btn.Parent";
_pnlleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlleft = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getParent()));
 //BA.debugLineNum = 5612;BA.debugLine="Dim xSlider As SeekBar = pnlLeft.GetView(2)";
_xslider = new anywheresoftware.b4a.objects.SeekBarWrapper();
_xslider = (anywheresoftware.b4a.objects.SeekBarWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SeekBarWrapper(), (android.widget.SeekBar)(_pnlleft.GetView((int) (2)).getObject()));
 //BA.debugLineNum = 5613;BA.debugLine="Dim xDurLabel As B4XView = pnlLeft.GetView(5)";
_xdurlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xdurlabel = _pnlleft.GetView((int) (5));
 //BA.debugLineNum = 5615;BA.debugLine="If File.Exists(\"\", AudioPath) Then";
if (true) break;

case 1:
//if
this.state = 18;
if (parent.__c.File.Exists("",_audiopath)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 5616;BA.debugLine="VMPlayer.Load(\"\", AudioPath)";
parent._vmplayer.Load("",_audiopath);
 //BA.debugLineNum = 5617;BA.debugLine="VMPlayer.Play";
parent._vmplayer.Play();
 //BA.debugLineNum = 5619;BA.debugLine="Dim TotalMs As Int = VMPlayer.Duration";
_totalms = parent._vmplayer.getDuration();
 //BA.debugLineNum = 5620;BA.debugLine="Dim TotalSecs As Int = TotalMs / 1000";
_totalsecs = (int) (_totalms/(double)1000);
 //BA.debugLineNum = 5623;BA.debugLine="Do While VMPlayer.IsPlaying";
if (true) break;

case 4:
//do while
this.state = 17;
while (parent._vmplayer.IsPlaying()) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 5624;BA.debugLine="Dim CurrentMs As Int = VMPlayer.Position";
_currentms = parent._vmplayer.getPosition();
 //BA.debugLineNum = 5625;BA.debugLine="Dim RemainingSecs As Int = (TotalMs - CurrentMs";
_remainingsecs = (int) ((_totalms-_currentms)/(double)1000);
 //BA.debugLineNum = 5626;BA.debugLine="If RemainingSecs < 0 Then RemainingSecs = 0";
if (true) break;

case 7:
//if
this.state = 12;
if (_remainingsecs<0) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_remainingsecs = (int) (0);
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 5627;BA.debugLine="xDurLabel.Text = \"Duration: \" & FormatAudioTime";
_xdurlabel.setText(BA.ObjectToCharSequence("Duration: "+parent._formataudiotime(_remainingsecs)));
 //BA.debugLineNum = 5630;BA.debugLine="If TotalMs > 0 Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_totalms>0) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 5631;BA.debugLine="Dim PercentComplete As Float = (CurrentMs / To";
_percentcomplete = (float) ((_currentms/(double)_totalms)*100);
 //BA.debugLineNum = 5632;BA.debugLine="xSlider.Value = PercentComplete";
_xslider.setValue((int) (_percentcomplete));
 if (true) break;

case 16:
//C
this.state = 4;
;
 //BA.debugLineNum = 5635;BA.debugLine="Sleep(100) ' Wait 100ms before next tick";
parent.__c.Sleep(ba,this,(int) (100));
this.state = 19;
return;
case 19:
//C
this.state = 4;
;
 if (true) break;

case 17:
//C
this.state = 18;
;
 //BA.debugLineNum = 5639;BA.debugLine="xDurLabel.Text = \"Duration: \" & FormatAudioTime(";
_xdurlabel.setText(BA.ObjectToCharSequence("Duration: "+parent._formataudiotime(_totalsecs)));
 //BA.debugLineNum = 5640;BA.debugLine="xSlider.Value = 0";
_xslider.setValue((int) (0));
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 5642;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsaveexpense_click() throws Exception{
 //BA.debugLineNum = 3091;BA.debugLine="Sub btnSaveExpense_Click";
 //BA.debugLineNum = 3092;BA.debugLine="If ExpenseAmount.Text = \"\" Then";
if ((_expenseamount.getText()).equals("")) { 
 //BA.debugLineNum = 3093;BA.debugLine="xui.MsgboxAsync(\"Please enter an amount.\", \"Erro";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Please enter an amount."),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 3094;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3097;BA.debugLine="ProgressDialogShow(\"Uploading Receipt & Updating";
__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Uploading Receipt & Updating Ledger..."));
 //BA.debugLineNum = 3098;BA.debugLine="UploadReceiptImage";
_uploadreceiptimage();
 //BA.debugLineNum = 3099;BA.debugLine="End Sub";
return "";
}
public String  _btnscrape_click() throws Exception{
 //BA.debugLineNum = 4313;BA.debugLine="Sub btnScrape_Click";
 //BA.debugLineNum = 4314;BA.debugLine="StartScrapeProcess";
_startscrapeprocess();
 //BA.debugLineNum = 4315;BA.debugLine="End Sub";
return "";
}
public String  _btnscrapearchive_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnloverlay = null;
anywheresoftware.b4a.objects.collections.Map _scrapedata = null;
 //BA.debugLineNum = 5986;BA.debugLine="Public Sub btnScrapeArchive_Click";
 //BA.debugLineNum = 5987;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 5988;BA.debugLine="Dim pnlOverlay As B4XView = btn.Tag";
_pnloverlay = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnloverlay = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getTag()));
 //BA.debugLineNum = 5989;BA.debugLine="Dim ScrapeData As Map = pnlOverlay.Tag";
_scrapedata = new anywheresoftware.b4a.objects.collections.Map();
_scrapedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_pnloverlay.getTag()));
 //BA.debugLineNum = 5991;BA.debugLine="ScrapedApptIssue = \"\"";
_scrapedapptissue = "";
 //BA.debugLineNum = 5992;BA.debugLine="ArchiveVoicemail(ScrapeData)";
_archivevoicemail(_scrapedata);
 //BA.debugLineNum = 5993;BA.debugLine="pnlOverlay.RemoveViewFromParent";
_pnloverlay.RemoveViewFromParent();
 //BA.debugLineNum = 5995;BA.debugLine="Root.As(B4XView).SetLayoutAnimated(0, 0, 0, Root.";
(_root).SetLayoutAnimated((int) (0),(int) (0),(int) (0),_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 5997;BA.debugLine="lstTodayApts.GetBase.As(View).Invalidate";
((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lsttodayapts._getbase().getObject()))).Invalidate();
 //BA.debugLineNum = 6000;BA.debugLine="AdvanceScrapeQueue";
_advancescrapequeue();
 //BA.debugLineNum = 6001;BA.debugLine="End Sub";
return "";
}
public String  _btnscrapecreate_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnloverlay = null;
anywheresoftware.b4a.objects.collections.Map _scrapedata = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnldialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper _svview = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pcontent = null;
anywheresoftware.b4a.objects.collections.Map _finalmap = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
String _t = "";
String _key = "";
String _chktag = "";
boolean _ischecked = false;
anywheresoftware.b4a.objects.B4XViewWrapper _v2 = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _c = null;
 //BA.debugLineNum = 5812;BA.debugLine="Sub btnScrapeCreate_Click";
 //BA.debugLineNum = 5813;BA.debugLine="Log(\">>> [CRASH TRACKER] btnScrapeCreate_Click ST";
__c.LogImpl("021561345",">>> [CRASH TRACKER] btnScrapeCreate_Click STARTED",0);
 //BA.debugLineNum = 5814;BA.debugLine="Try";
try { //BA.debugLineNum = 5815;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 5816;BA.debugLine="Dim pnlOverlay As B4XView = btn.Tag";
_pnloverlay = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnloverlay = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getTag()));
 //BA.debugLineNum = 5817;BA.debugLine="Dim ScrapeData As Map = pnlOverlay.Tag";
_scrapedata = new anywheresoftware.b4a.objects.collections.Map();
_scrapedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_pnloverlay.getTag()));
 //BA.debugLineNum = 5819;BA.debugLine="Dim pnlDialog As B4XView = pnlOverlay.GetView(0)";
_pnldialog = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnldialog = _pnloverlay.GetView((int) (0));
 //BA.debugLineNum = 5820;BA.debugLine="Dim svView As B4XView = pnlDialog.GetView(3)";
_svview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_svview = _pnldialog.GetView((int) (3));
 //BA.debugLineNum = 5821;BA.debugLine="Dim pContent As B4XView = svView.GetView(0)";
_pcontent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pcontent = _svview.GetView((int) (0));
 //BA.debugLineNum = 5823;BA.debugLine="Dim FinalMap As Map : FinalMap.Initialize";
_finalmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 5823;BA.debugLine="Dim FinalMap As Map : FinalMap.Initialize";
_finalmap.Initialize();
 //BA.debugLineNum = 5824;BA.debugLine="ScrapedApptIssue = \"\" ' Reset Global";
_scrapedapptissue = "";
 //BA.debugLineNum = 5826;BA.debugLine="Log(\">>> [CRASH TRACKER] Harvesting Inputs...\")";
__c.LogImpl("021561358",">>> [CRASH TRACKER] Harvesting Inputs...",0);
 //BA.debugLineNum = 5828;BA.debugLine="For Each v As B4XView In pContent.GetAllViewsRec";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group13 = _pcontent.GetAllViewsRecursive();
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group13.Get(index13)));
 //BA.debugLineNum = 5829;BA.debugLine="If v.Tag Is String Then";
if (_v.getTag() instanceof String) { 
 //BA.debugLineNum = 5830;BA.debugLine="Dim t As String = v.Tag";
_t = BA.ObjectToString(_v.getTag());
 //BA.debugLineNum = 5831;BA.debugLine="If t.StartsWith(\"txt\") Then";
if (_t.startsWith("txt")) { 
 //BA.debugLineNum = 5832;BA.debugLine="Dim Key As String = t.SubString(3) ' Name1, P";
_key = _t.substring((int) (3));
 //BA.debugLineNum = 5833;BA.debugLine="Dim ChkTag As String = \"chk\" & Key";
_chktag = "chk"+_key;
 //BA.debugLineNum = 5834;BA.debugLine="Dim IsChecked As Boolean = False";
_ischecked = __c.False;
 //BA.debugLineNum = 5836;BA.debugLine="For Each v2 As B4XView In pContent.GetAllView";
_v2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group20 = _pcontent.GetAllViewsRecursive();
final int groupLen20 = group20.getSize()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_v2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group20.Get(index20)));
 //BA.debugLineNum = 5837;BA.debugLine="If v2.Tag Is String Then";
if (_v2.getTag() instanceof String) { 
 //BA.debugLineNum = 5838;BA.debugLine="If v2.Tag = ChkTag Then";
if ((_v2.getTag()).equals((Object)(_chktag))) { 
 //BA.debugLineNum = 5839;BA.debugLine="Dim c As CheckBox = v2";
_c = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_c = (anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox)(_v2.getObject()));
 //BA.debugLineNum = 5840;BA.debugLine="IsChecked = c.Checked";
_ischecked = _c.getChecked();
 //BA.debugLineNum = 5841;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
 //BA.debugLineNum = 5846;BA.debugLine="If IsChecked Then";
if (_ischecked) { 
 //BA.debugLineNum = 5847;BA.debugLine="If Key = \"Name1\" Then FinalMap.Put(\"Name\", v";
if ((_key).equals("Name1")) { 
_finalmap.Put((Object)("Name"),(Object)(_v.getText()));};
 //BA.debugLineNum = 5848;BA.debugLine="If Key = \"Name2\" Then FinalMap.Put(\"Name2\",";
if ((_key).equals("Name2")) { 
_finalmap.Put((Object)("Name2"),(Object)(_v.getText()));};
 //BA.debugLineNum = 5849;BA.debugLine="If Key = \"Phone1\" Then FinalMap.Put(\"Phone\",";
if ((_key).equals("Phone1")) { 
_finalmap.Put((Object)("Phone"),(Object)(_v.getText()));};
 //BA.debugLineNum = 5850;BA.debugLine="If Key = \"Phone2\" Then FinalMap.Put(\"Phone2\"";
if ((_key).equals("Phone2")) { 
_finalmap.Put((Object)("Phone2"),(Object)(_v.getText()));};
 //BA.debugLineNum = 5851;BA.debugLine="If Key = \"Addr\" Then FinalMap.Put(\"Address\",";
if ((_key).equals("Addr")) { 
_finalmap.Put((Object)("Address"),(Object)(_v.getText()));};
 //BA.debugLineNum = 5852;BA.debugLine="If Key = \"Issue\" Then";
if ((_key).equals("Issue")) { 
 //BA.debugLineNum = 5854;BA.debugLine="FinalMap.Put(\"Issue\", v.Text)";
_finalmap.Put((Object)("Issue"),(Object)(_v.getText()));
 //BA.debugLineNum = 5855;BA.debugLine="ScrapedApptIssue = v.Text";
_scrapedapptissue = _v.getText();
 };
 };
 };
 };
 }
};
 //BA.debugLineNum = 5862;BA.debugLine="FinalMap.Put(\"IsScrapeWorkflow\", True)";
_finalmap.Put((Object)("IsScrapeWorkflow"),(Object)(__c.True));
 //BA.debugLineNum = 5863;BA.debugLine="FinalMap.Put(\"OriginalScrapeData\", ScrapeData)";
_finalmap.Put((Object)("OriginalScrapeData"),(Object)(_scrapedata.getObject()));
 //BA.debugLineNum = 5866;BA.debugLine="pnlOverlay.RemoveViewFromParent";
_pnloverlay.RemoveViewFromParent();
 //BA.debugLineNum = 5867;BA.debugLine="Root.As(B4XView).SetLayoutAnimated(0, 0, 0, Root";
(_root).SetLayoutAnimated((int) (0),(int) (0),(int) (0),_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 5869;BA.debugLine="lstTodayApts.GetBase.As(View).Invalidate";
((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lsttodayapts._getbase().getObject()))).Invalidate();
 //BA.debugLineNum = 5872;BA.debugLine="Log(\">>> [CRASH TRACKER] Launching Traffic Cop..";
__c.LogImpl("021561404",">>> [CRASH TRACKER] Launching Traffic Cop...",0);
 //BA.debugLineNum = 5873;BA.debugLine="CheckTrafficCop(FinalMap)";
_checktrafficcop(_finalmap);
 } 
       catch (Exception e51) {
			ba.setLastException(e51); //BA.debugLineNum = 5876;BA.debugLine="Log(\">>> [CRITICAL CRASH TRAPPED] Error in btnSc";
__c.LogImpl("021561408",">>> [CRITICAL CRASH TRAPPED] Error in btnScrapeCreate_Click: "+BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 5877;BA.debugLine="xui.MsgboxAsync(\"Error processing voicemail: \" &";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error processing voicemail: "+__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("System Error"));
 };
 //BA.debugLineNum = 5879;BA.debugLine="End Sub";
return "";
}
public String  _btnscrapedelete_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnloverlay = null;
anywheresoftware.b4a.objects.collections.Map _scrapedata = null;
 //BA.debugLineNum = 5967;BA.debugLine="Public Sub btnScrapeDelete_Click";
 //BA.debugLineNum = 5968;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 5969;BA.debugLine="Dim pnlOverlay As B4XView = btn.Tag";
_pnloverlay = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnloverlay = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getTag()));
 //BA.debugLineNum = 5970;BA.debugLine="Dim ScrapeData As Map = pnlOverlay.Tag";
_scrapedata = new anywheresoftware.b4a.objects.collections.Map();
_scrapedata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_pnloverlay.getTag()));
 //BA.debugLineNum = 5972;BA.debugLine="ScrapedApptIssue = \"\"";
_scrapedapptissue = "";
 //BA.debugLineNum = 5974;BA.debugLine="DeleteVoicemail(ScrapeData)";
_deletevoicemail(_scrapedata);
 //BA.debugLineNum = 5975;BA.debugLine="pnlOverlay.RemoveViewFromParent";
_pnloverlay.RemoveViewFromParent();
 //BA.debugLineNum = 5977;BA.debugLine="Root.As(B4XView).SetLayoutAnimated(0, 0, 0, Root.";
(_root).SetLayoutAnimated((int) (0),(int) (0),(int) (0),_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 5979;BA.debugLine="lstTodayApts.GetBase.As(View).Invalidate";
((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lsttodayapts._getbase().getObject()))).Invalidate();
 //BA.debugLineNum = 5982;BA.debugLine="AdvanceScrapeQueue";
_advancescrapequeue();
 //BA.debugLineNum = 5983;BA.debugLine="End Sub";
return "";
}
public String  _btnsearch_click() throws Exception{
 //BA.debugLineNum = 4301;BA.debugLine="Sub btnSearch_Click";
 //BA.debugLineNum = 4302;BA.debugLine="B4XPages.ShowPage(\"SearchPage\")";
_b4xpages._showpage /*String*/ (ba,"SearchPage");
 //BA.debugLineNum = 4303;BA.debugLine="End Sub";
return "";
}
public String  _btnstopvm_click() throws Exception{
 //BA.debugLineNum = 5644;BA.debugLine="Sub btnStopVM_Click";
 //BA.debugLineNum = 5645;BA.debugLine="If VMPlayer.IsPlaying Then";
if (_vmplayer.IsPlaying()) { 
 //BA.debugLineNum = 5646;BA.debugLine="VMPlayer.Pause";
_vmplayer.Pause();
 //BA.debugLineNum = 5647;BA.debugLine="ToastMessageShow(\"Playback Stopped\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Playback Stopped"),__c.False);
 };
 //BA.debugLineNum = 5649;BA.debugLine="End Sub";
return "";
}
public String  _btnviewapt_click() throws Exception{
 //BA.debugLineNum = 4317;BA.debugLine="Sub btnViewApt_Click";
 //BA.debugLineNum = 4318;BA.debugLine="B4XPages.ShowPage(\"ViewSchedulePage\")";
_b4xpages._showpage /*String*/ (ba,"ViewSchedulePage");
 //BA.debugLineNum = 4319;BA.debugLine="End Sub";
return "";
}
public String  _builddashboardlist(anywheresoftware.b4a.objects.collections.List _items,int _targetwidth) throws Exception{
int _parentwidth = 0;
boolean _issmallscreen = false;
anywheresoftware.b4a.objects.B4XViewWrapper _holidaypanel = null;
int _apptcount = 0;
int _mikecount = 0;
int _erincount = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
anywheresoftware.b4a.objects.collections.Map _ev = null;
String _cid = "";
int _selectedindex = 0;
boolean _shouldshow = false;
String _apptid = "";
boolean _isclosed = false;
String _rightstatusicon = "";
int _rightstatuscolor = 0;
int _rowbgcolor = 0;
String _arrivalicon = "";
int _arrivalcolor = 0;
boolean _arrivalenabled = false;
String _summary = "";
String _desc = "";
String _loc = "";
anywheresoftware.b4a.objects.collections.Map _startmap = null;
anywheresoftware.b4a.objects.collections.Map _endmap = null;
String _dtstr = "";
String _dtendstr = "";
String _displaytime = "";
int _h = 0;
String _timestart = "";
int _he = 0;
String _timeend = "";
String _cname = "";
String _cphone = "";
String _cissue = "";
int _i = 0;
int _i2 = 0;
int _rowheight = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbltime = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xtime = null;
anywheresoftware.b4a.objects.LabelWrapper _lblnum = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xnum = null;
int _iconwidth = 0;
int _centerstart = 0;
int _centerwidth = 0;
anywheresoftware.b4a.objects.LabelWrapper _lblarrival = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xarrival = null;
anywheresoftware.b4a.objects.collections.Map _datamap = null;
anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xname = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
anywheresoftware.b4a.objects.LabelWrapper _lblphone = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xphone = null;
anywheresoftware.b4a.objects.CSBuilder _cs2 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbladdr = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xaddr = null;
anywheresoftware.b4a.objects.CSBuilder _cs3 = null;
anywheresoftware.b4a.objects.LabelWrapper _lblissue = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xissue = null;
anywheresoftware.b4a.objects.LabelWrapper _lblstatright = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xstatright = null;
int _toprowy = 0;
int _botrowy = 0;
int _w_arrival = 0;
int _arrivalleftedge = 0;
int _w_rightstat = 0;
int _rightstatleftedge = 0;
int _centerend = 0;
int _colwidth = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _line = null;
 //BA.debugLineNum = 1812;BA.debugLine="Private Sub BuildDashboardList(Items As List, Targ";
 //BA.debugLineNum = 1813;BA.debugLine="LastDashboardItems = Items";
_lastdashboarditems = _items;
 //BA.debugLineNum = 1814;BA.debugLine="lstTodayApts.Clear";
_lsttodayapts._clear();
 //BA.debugLineNum = 1816;BA.debugLine="Dim ParentWidth As Int = TargetWidth";
_parentwidth = _targetwidth;
 //BA.debugLineNum = 1817;BA.debugLine="If ParentWidth < 100 Then ParentWidth = Root.Widt";
if (_parentwidth<100) { 
_parentwidth = _root.getWidth();};
 //BA.debugLineNum = 1819;BA.debugLine="Dim IsSmallScreen As Boolean = (ParentWidth < LAY";
_issmallscreen = (_parentwidth<_layout_threshold);
 //BA.debugLineNum = 1822;BA.debugLine="Dim HolidayPanel As B4XView = CreateHolidayBanner";
_holidaypanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_holidaypanel = _createholidaybannerpanel(_parentwidth);
 //BA.debugLineNum = 1823;BA.debugLine="If HolidayPanel.IsInitialized Then";
if (_holidaypanel.IsInitialized()) { 
 //BA.debugLineNum = 1824;BA.debugLine="lstTodayApts.Add(HolidayPanel, \"HolidayBanner\")";
_lsttodayapts._add(_holidaypanel,(Object)("HolidayBanner"));
 };
 //BA.debugLineNum = 1828;BA.debugLine="ApplyListBackground(GetCurrentUser)";
_applylistbackground(_getcurrentuser());
 //BA.debugLineNum = 1830;BA.debugLine="Dim ApptCount As Int = 0";
_apptcount = (int) (0);
 //BA.debugLineNum = 1831;BA.debugLine="Dim MikeCount As Int = 0";
_mikecount = (int) (0);
 //BA.debugLineNum = 1832;BA.debugLine="Dim ErinCount As Int = 0";
_erincount = (int) (0);
 //BA.debugLineNum = 1834;BA.debugLine="If Items.Size = 0 Then";
if (_items.getSize()==0) { 
 //BA.debugLineNum = 1835;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 1836;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, ParentWidth, 100dip";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_parentwidth,__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 1837;BA.debugLine="p.Color = xui.Color_White";
_p.setColor(_xui.Color_White);
 //BA.debugLineNum = 1838;BA.debugLine="Dim lbl As Label : lbl.Initialize(\"\")";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 1838;BA.debugLine="Dim lbl As Label : lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 1839;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 1840;BA.debugLine="xlbl.Text = \"No Appointments Found for Today\"";
_xlbl.setText(BA.ObjectToCharSequence("No Appointments Found for Today"));
 //BA.debugLineNum = 1841;BA.debugLine="xlbl.TextColor = xui.Color_Gray";
_xlbl.setTextColor(_xui.Color_Gray);
 //BA.debugLineNum = 1842;BA.debugLine="xlbl.TextSize = 18";
_xlbl.setTextSize((float) (18));
 //BA.debugLineNum = 1843;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 1844;BA.debugLine="p.AddView(xlbl, 0, 0, ParentWidth, 100dip)";
_p.AddView((android.view.View)(_xlbl.getObject()),(int) (0),(int) (0),_parentwidth,__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 1845;BA.debugLine="lstTodayApts.Add(p, \"\")";
_lsttodayapts._add(_p,(Object)(""));
 //BA.debugLineNum = 1847;BA.debugLine="lblAppsGodNum.Text = \"0\"";
_lblappsgodnum.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 1848;BA.debugLine="lblAppsGoddessNum.Text = \"0\"";
_lblappsgoddessnum.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 1849;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1852;BA.debugLine="For Each ev As Map In Items";
_ev = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group31 = _items;
final int groupLen31 = group31.getSize()
;int index31 = 0;
;
for (; index31 < groupLen31;index31++){
_ev = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group31.Get(index31)));
 //BA.debugLineNum = 1853;BA.debugLine="Dim cId As String = ev.GetDefault(\"colorId\", \"1\"";
_cid = BA.ObjectToString(_ev.GetDefault((Object)("colorId"),(Object)("1")));
 //BA.debugLineNum = 1854;BA.debugLine="If cId = \"1\" Then MikeCount = MikeCount + 1";
if ((_cid).equals("1")) { 
_mikecount = (int) (_mikecount+1);};
 //BA.debugLineNum = 1855;BA.debugLine="If cId = \"11\" Then ErinCount = ErinCount + 1";
if ((_cid).equals("11")) { 
_erincount = (int) (_erincount+1);};
 //BA.debugLineNum = 1857;BA.debugLine="Dim SelectedIndex As Int = 0";
_selectedindex = (int) (0);
 //BA.debugLineNum = 1858;BA.debugLine="If spnChose.IsInitialized Then SelectedIndex = s";
if (_spnchose.IsInitialized()) { 
_selectedindex = _spnchose.getSelectedIndex();};
 //BA.debugLineNum = 1860;BA.debugLine="Dim ShouldShow As Boolean = False";
_shouldshow = __c.False;
 //BA.debugLineNum = 1861;BA.debugLine="If SelectedIndex = 0 And cId = \"1\" Then ShouldSh";
if (_selectedindex==0 && (_cid).equals("1")) { 
_shouldshow = __c.True;};
 //BA.debugLineNum = 1862;BA.debugLine="If SelectedIndex = 1 And cId = \"11\" Then ShouldS";
if (_selectedindex==1 && (_cid).equals("11")) { 
_shouldshow = __c.True;};
 //BA.debugLineNum = 1863;BA.debugLine="If ShouldShow = False Then Continue";
if (_shouldshow==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 1865;BA.debugLine="ApptCount = ApptCount + 1";
_apptcount = (int) (_apptcount+1);
 //BA.debugLineNum = 1866;BA.debugLine="Dim ApptID As String = ev.Get(\"id\")";
_apptid = BA.ObjectToString(_ev.Get((Object)("id")));
 //BA.debugLineNum = 1868;BA.debugLine="Dim isClosed As Boolean = (cId = \"8\")";
_isclosed = ((_cid).equals("8"));
 //BA.debugLineNum = 1869;BA.debugLine="Dim RightStatusIcon As String";
_rightstatusicon = "";
 //BA.debugLineNum = 1870;BA.debugLine="Dim RightStatusColor As Int";
_rightstatuscolor = 0;
 //BA.debugLineNum = 1871;BA.debugLine="Dim RowBGColor As Int";
_rowbgcolor = 0;
 //BA.debugLineNum = 1872;BA.debugLine="If isClosed Then";
if (_isclosed) { 
 //BA.debugLineNum = 1873;BA.debugLine="RightStatusIcon = Chr(0xF058)";
_rightstatusicon = BA.ObjectToString(__c.Chr(((int)0xf058)));
 //BA.debugLineNum = 1874;BA.debugLine="RightStatusColor = 0xFF2E7D32";
_rightstatuscolor = ((int)0xff2e7d32);
 //BA.debugLineNum = 1875;BA.debugLine="RowBGColor = COLOR_CLOSED";
_rowbgcolor = _color_closed;
 }else {
 //BA.debugLineNum = 1877;BA.debugLine="RightStatusIcon = Chr(0xF017)";
_rightstatusicon = BA.ObjectToString(__c.Chr(((int)0xf017)));
 //BA.debugLineNum = 1878;BA.debugLine="RightStatusColor = xui.Color_DarkGray";
_rightstatuscolor = _xui.Color_DarkGray;
 //BA.debugLineNum = 1879;BA.debugLine="RowBGColor = COLOR_PENDING";
_rowbgcolor = _color_pending;
 };
 //BA.debugLineNum = 1882;BA.debugLine="Dim ArrivalIcon As String";
_arrivalicon = "";
 //BA.debugLineNum = 1883;BA.debugLine="Dim ArrivalColor As Int";
_arrivalcolor = 0;
 //BA.debugLineNum = 1884;BA.debugLine="Dim ArrivalEnabled As Boolean = False";
_arrivalenabled = __c.False;
 //BA.debugLineNum = 1885;BA.debugLine="If ApptID = ActiveAppointmentID Then";
if ((_apptid).equals(_activeappointmentid)) { 
 //BA.debugLineNum = 1886;BA.debugLine="ArrivalIcon = Chr(0xF0AD)";
_arrivalicon = BA.ObjectToString(__c.Chr(((int)0xf0ad)));
 //BA.debugLineNum = 1887;BA.debugLine="ArrivalColor = xui.Color_Blue";
_arrivalcolor = _xui.Color_Blue;
 //BA.debugLineNum = 1888;BA.debugLine="ArrivalEnabled = True";
_arrivalenabled = __c.True;
 //BA.debugLineNum = 1889;BA.debugLine="RowBGColor = COLOR_ACTIVE";
_rowbgcolor = _color_active;
 }else if(_isclosed) { 
 //BA.debugLineNum = 1891;BA.debugLine="ArrivalIcon = \"\"";
_arrivalicon = "";
 //BA.debugLineNum = 1892;BA.debugLine="ArrivalColor = xui.Color_Transparent";
_arrivalcolor = _xui.Color_Transparent;
 }else {
 //BA.debugLineNum = 1894;BA.debugLine="ArrivalIcon = Chr(0xF1B9)";
_arrivalicon = BA.ObjectToString(__c.Chr(((int)0xf1b9)));
 //BA.debugLineNum = 1895;BA.debugLine="ArrivalColor = xui.Color_LightGray";
_arrivalcolor = _xui.Color_LightGray;
 //BA.debugLineNum = 1896;BA.debugLine="ArrivalEnabled = False";
_arrivalenabled = __c.False;
 };
 //BA.debugLineNum = 1899;BA.debugLine="Dim summary As String = ev.GetDefault(\"summary\",";
_summary = BA.ObjectToString(_ev.GetDefault((Object)("summary"),(Object)("Unknown")));
 //BA.debugLineNum = 1900;BA.debugLine="Dim desc As String = ev.GetDefault(\"description\"";
_desc = BA.ObjectToString(_ev.GetDefault((Object)("description"),(Object)("")));
 //BA.debugLineNum = 1901;BA.debugLine="Dim loc As String = ev.GetDefault(\"location\", \"N";
_loc = BA.ObjectToString(_ev.GetDefault((Object)("location"),(Object)("No Address")));
 //BA.debugLineNum = 1903;BA.debugLine="Dim startMap As Map = ev.Get(\"start\")";
_startmap = new anywheresoftware.b4a.objects.collections.Map();
_startmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ev.Get((Object)("start"))));
 //BA.debugLineNum = 1904;BA.debugLine="Dim endMap As Map = ev.Get(\"end\")";
_endmap = new anywheresoftware.b4a.objects.collections.Map();
_endmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ev.Get((Object)("end"))));
 //BA.debugLineNum = 1905;BA.debugLine="Dim dtStr As String = startMap.GetDefault(\"dateT";
_dtstr = BA.ObjectToString(_startmap.GetDefault((Object)("dateTime"),(Object)("")));
 //BA.debugLineNum = 1906;BA.debugLine="Dim dtEndStr As String = endMap.GetDefault(\"date";
_dtendstr = BA.ObjectToString(_endmap.GetDefault((Object)("dateTime"),(Object)("")));
 //BA.debugLineNum = 1907;BA.debugLine="Dim DisplayTime As String = \"\"";
_displaytime = "";
 //BA.debugLineNum = 1909;BA.debugLine="If dtStr <> \"\" Then";
if ((_dtstr).equals("") == false) { 
 //BA.debugLineNum = 1910;BA.debugLine="Dim H As Int = ParseIsoToLocalHour(dtStr)";
_h = _parseisotolocalhour(_dtstr);
 //BA.debugLineNum = 1911;BA.debugLine="Dim TimeStart As String";
_timestart = "";
 //BA.debugLineNum = 1912;BA.debugLine="If H > 12 Then";
if (_h>12) { 
 //BA.debugLineNum = 1913;BA.debugLine="TimeStart = (H - 12) & \":00 PM\"";
_timestart = BA.NumberToString((_h-12))+":00 PM";
 }else if(_h==12) { 
 //BA.debugLineNum = 1915;BA.debugLine="TimeStart = \"12:00 PM\"";
_timestart = "12:00 PM";
 }else {
 //BA.debugLineNum = 1917;BA.debugLine="TimeStart = H & \":00 AM\"";
_timestart = BA.NumberToString(_h)+":00 AM";
 };
 //BA.debugLineNum = 1919;BA.debugLine="DisplayTime = TimeStart";
_displaytime = _timestart;
 //BA.debugLineNum = 1921;BA.debugLine="If dtEndStr <> \"\" Then";
if ((_dtendstr).equals("") == false) { 
 //BA.debugLineNum = 1922;BA.debugLine="Dim HE As Int = ParseIsoToLocalHour(dtEndStr)";
_he = _parseisotolocalhour(_dtendstr);
 //BA.debugLineNum = 1923;BA.debugLine="Dim TimeEnd As String";
_timeend = "";
 //BA.debugLineNum = 1924;BA.debugLine="If HE > 12 Then";
if (_he>12) { 
 //BA.debugLineNum = 1925;BA.debugLine="TimeEnd = (HE - 12) & \":00 PM\"";
_timeend = BA.NumberToString((_he-12))+":00 PM";
 }else if(_he==12) { 
 //BA.debugLineNum = 1927;BA.debugLine="TimeEnd = \"12:00 PM\"";
_timeend = "12:00 PM";
 }else {
 //BA.debugLineNum = 1929;BA.debugLine="TimeEnd = HE & \":00 AM\"";
_timeend = BA.NumberToString(_he)+":00 AM";
 };
 //BA.debugLineNum = 1931;BA.debugLine="DisplayTime = DisplayTime & \" - \" & TimeEnd";
_displaytime = _displaytime+" - "+_timeend;
 };
 };
 //BA.debugLineNum = 1935;BA.debugLine="Dim cName As String = summary";
_cname = _summary;
 //BA.debugLineNum = 1936;BA.debugLine="If summary.Contains(\" - \") Then cName = summary.";
if (_summary.contains(" - ")) { 
_cname = _summary.substring((int) (0),_summary.indexOf(" - "));};
 //BA.debugLineNum = 1937;BA.debugLine="Dim cPhone As String = \"No Phone\"";
_cphone = "No Phone";
 //BA.debugLineNum = 1938;BA.debugLine="Dim cIssue As String = \"No Issue\"";
_cissue = "No Issue";
 //BA.debugLineNum = 1940;BA.debugLine="If desc.Contains(\"Phone: \") Then";
if (_desc.contains("Phone: ")) { 
 //BA.debugLineNum = 1941;BA.debugLine="Dim i As Int = desc.IndexOf(\"Phone: \") + 7";
_i = (int) (_desc.indexOf("Phone: ")+7);
 //BA.debugLineNum = 1942;BA.debugLine="Dim i2 As Int = desc.IndexOf2(Chr(10), i)";
_i2 = _desc.indexOf(BA.ObjectToString(__c.Chr((int) (10))),_i);
 //BA.debugLineNum = 1943;BA.debugLine="If i2 = -1 Then i2 = desc.Length";
if (_i2==-1) { 
_i2 = _desc.length();};
 //BA.debugLineNum = 1944;BA.debugLine="cPhone = desc.SubString2(i, i2).Trim";
_cphone = _desc.substring(_i,_i2).trim();
 //BA.debugLineNum = 1946;BA.debugLine="cPhone = FormatPhone(cPhone)";
_cphone = _formatphone(_cphone);
 };
 //BA.debugLineNum = 1948;BA.debugLine="If desc.Contains(\"Issue: \") Then";
if (_desc.contains("Issue: ")) { 
 //BA.debugLineNum = 1949;BA.debugLine="Dim i As Int = desc.IndexOf(\"Issue: \") + 7";
_i = (int) (_desc.indexOf("Issue: ")+7);
 //BA.debugLineNum = 1950;BA.debugLine="Dim i2 As Int = desc.IndexOf2(Chr(10), i)";
_i2 = _desc.indexOf(BA.ObjectToString(__c.Chr((int) (10))),_i);
 //BA.debugLineNum = 1951;BA.debugLine="If i2 = -1 Then i2 = desc.Length";
if (_i2==-1) { 
_i2 = _desc.length();};
 //BA.debugLineNum = 1952;BA.debugLine="cIssue = desc.SubString2(i, i2).Trim";
_cissue = _desc.substring(_i,_i2).trim();
 };
 //BA.debugLineNum = 1956;BA.debugLine="Dim RowHeight As Int = 110dip";
_rowheight = __c.DipToCurrent((int) (110));
 //BA.debugLineNum = 1957;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 1958;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, ParentWidth, RowHei";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_parentwidth,_rowheight);
 //BA.debugLineNum = 1959;BA.debugLine="p.Color = RowBGColor";
_p.setColor(_rowbgcolor);
 //BA.debugLineNum = 1961;BA.debugLine="Dim lblTime As Label : lblTime.Initialize(\"\")";
_lbltime = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 1961;BA.debugLine="Dim lblTime As Label : lblTime.Initialize(\"\")";
_lbltime.Initialize(ba,"");
 //BA.debugLineNum = 1962;BA.debugLine="Dim xTime As B4XView = lblTime";
_xtime = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xtime = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbltime.getObject()));
 //BA.debugLineNum = 1963;BA.debugLine="xTime.Text = \"  \" & DisplayTime";
_xtime.setText(BA.ObjectToCharSequence("  "+_displaytime));
 //BA.debugLineNum = 1964;BA.debugLine="xTime.Color = xui.Color_Black";
_xtime.setColor(_xui.Color_Black);
 //BA.debugLineNum = 1965;BA.debugLine="xTime.TextColor = xui.Color_White";
_xtime.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 1966;BA.debugLine="xTime.TextSize = 13";
_xtime.setTextSize((float) (13));
 //BA.debugLineNum = 1967;BA.debugLine="p.AddView(xTime, 0, 0, ParentWidth, 18dip)";
_p.AddView((android.view.View)(_xtime.getObject()),(int) (0),(int) (0),_parentwidth,__c.DipToCurrent((int) (18)));
 //BA.debugLineNum = 1969;BA.debugLine="Dim lblNum As Label : lblNum.Initialize(\"\")";
_lblnum = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 1969;BA.debugLine="Dim lblNum As Label : lblNum.Initialize(\"\")";
_lblnum.Initialize(ba,"");
 //BA.debugLineNum = 1970;BA.debugLine="Dim xNum As B4XView = lblNum";
_xnum = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xnum = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblnum.getObject()));
 //BA.debugLineNum = 1971;BA.debugLine="xNum.Text = \"#\" & ApptCount";
_xnum.setText(BA.ObjectToCharSequence("#"+BA.NumberToString(_apptcount)));
 //BA.debugLineNum = 1972;BA.debugLine="xNum.TextColor = xui.Color_Black";
_xnum.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 1973;BA.debugLine="lblNum.Typeface = Typeface.DEFAULT_BOLD";
_lblnum.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 1974;BA.debugLine="xNum.TextSize = 13";
_xnum.setTextSize((float) (13));
 //BA.debugLineNum = 1975;BA.debugLine="p.AddView(xNum, 5dip, 22dip, 25dip, 30dip)";
_p.AddView((android.view.View)(_xnum.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (22)),__c.DipToCurrent((int) (25)),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 1977;BA.debugLine="If IsSmallScreen Then";
if (_issmallscreen) { 
 //BA.debugLineNum = 1978;BA.debugLine="Dim IconWidth As Int = 50dip";
_iconwidth = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 1979;BA.debugLine="Dim CenterStart As Int = IconWidth + 10dip";
_centerstart = (int) (_iconwidth+__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 1980;BA.debugLine="Dim CenterWidth As Int = ParentWidth - (IconWid";
_centerwidth = (int) (_parentwidth-(_iconwidth*2)-__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 1982;BA.debugLine="Dim lblArrival As Label : lblArrival.Initialize";
_lblarrival = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 1982;BA.debugLine="Dim lblArrival As Label : lblArrival.Initialize";
_lblarrival.Initialize(ba,"lblArrival");
 //BA.debugLineNum = 1983;BA.debugLine="Dim xArrival As B4XView = lblArrival";
_xarrival = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xarrival = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblarrival.getObject()));
 //BA.debugLineNum = 1984;BA.debugLine="xArrival.Text = ArrivalIcon";
_xarrival.setText(BA.ObjectToCharSequence(_arrivalicon));
 //BA.debugLineNum = 1985;BA.debugLine="xArrival.TextColor = ArrivalColor";
_xarrival.setTextColor(_arrivalcolor);
 //BA.debugLineNum = 1986;BA.debugLine="lblArrival.Typeface = Typeface.FONTAWESOME";
_lblarrival.setTypeface(__c.Typeface.getFONTAWESOME());
 //BA.debugLineNum = 1987;BA.debugLine="xArrival.TextSize = 35";
_xarrival.setTextSize((float) (35));
 //BA.debugLineNum = 1988;BA.debugLine="xArrival.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xarrival.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 1989;BA.debugLine="Dim DataMap As Map = CreateMap(\"Name\": cName, \"";
_datamap = new anywheresoftware.b4a.objects.collections.Map();
_datamap = __c.createMap(new Object[] {(Object)("Name"),(Object)(_cname),(Object)("Phone"),(Object)(_cphone),(Object)("Addr"),(Object)(_loc),(Object)("ID"),(Object)(_apptid)});
 //BA.debugLineNum = 1990;BA.debugLine="xArrival.Tag = DataMap";
_xarrival.setTag((Object)(_datamap.getObject()));
 //BA.debugLineNum = 1991;BA.debugLine="xArrival.Enabled = ArrivalEnabled";
_xarrival.setEnabled(_arrivalenabled);
 //BA.debugLineNum = 1992;BA.debugLine="p.AddView(xArrival, 25dip, 22dip, IconWidth, 50";
_p.AddView((android.view.View)(_xarrival.getObject()),__c.DipToCurrent((int) (25)),__c.DipToCurrent((int) (22)),_iconwidth,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 1995;BA.debugLine="Dim lblName As Label : lblName.Initialize(\"lblD";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 1995;BA.debugLine="Dim lblName As Label : lblName.Initialize(\"lblD";
_lblname.Initialize(ba,"lblDashName");
 //BA.debugLineNum = 1996;BA.debugLine="Dim xName As B4XView = lblName";
_xname = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xname = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblname.getObject()));
 //BA.debugLineNum = 1997;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 1999;BA.debugLine="cs.Initialize.Typeface(Typeface.FONTAWESOME).Co";
_cs.Initialize().Typeface(__c.Typeface.getFONTAWESOME()).Color(_xui.Color_Blue).Append(BA.ObjectToCharSequence(BA.ObjectToString(__c.Chr(((int)0xf007)))+" ")).Typeface((android.graphics.Typeface)(_fontcardtext.getObject())).Bold().Append(BA.ObjectToCharSequence(_cname)).PopAll();
 //BA.debugLineNum = 2000;BA.debugLine="xName.Text = cs";
_xname.setText(BA.ObjectToCharSequence(_cs.getObject()));
 //BA.debugLineNum = 2001;BA.debugLine="xName.TextSize = 15";
_xname.setTextSize((float) (15));
 //BA.debugLineNum = 2002;BA.debugLine="xName.Tag = cName";
_xname.setTag((Object)(_cname));
 //BA.debugLineNum = 2003;BA.debugLine="lblName.Gravity = Gravity.CENTER_VERTICAL + Gra";
_lblname.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.CENTER_HORIZONTAL));
 //BA.debugLineNum = 2004;BA.debugLine="p.AddView(xName, CenterStart, 20dip, CenterWidt";
_p.AddView((android.view.View)(_xname.getObject()),_centerstart,__c.DipToCurrent((int) (20)),_centerwidth,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 2007;BA.debugLine="Dim lblPhone As Label : lblPhone.Initialize(\"lb";
_lblphone = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2007;BA.debugLine="Dim lblPhone As Label : lblPhone.Initialize(\"lb";
_lblphone.Initialize(ba,"lblDashPhone");
 //BA.debugLineNum = 2008;BA.debugLine="Dim xPhone As B4XView = lblPhone";
_xphone = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xphone = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblphone.getObject()));
 //BA.debugLineNum = 2009;BA.debugLine="Dim cs2 As CSBuilder";
_cs2 = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 2011;BA.debugLine="cs2.Initialize.Typeface(Typeface.FONTAWESOME).C";
_cs2.Initialize().Typeface(__c.Typeface.getFONTAWESOME()).Color(_xui.Color_Blue).Append(BA.ObjectToCharSequence(BA.ObjectToString(__c.Chr(((int)0xf095)))+" ")).Typeface((android.graphics.Typeface)(_fontcardtext.getObject())).Append(BA.ObjectToCharSequence(_cphone)).PopAll();
 //BA.debugLineNum = 2012;BA.debugLine="xPhone.Text = cs2";
_xphone.setText(BA.ObjectToCharSequence(_cs2.getObject()));
 //BA.debugLineNum = 2013;BA.debugLine="xPhone.TextSize = 12 ' [FIXED] Reduced to 12";
_xphone.setTextSize((float) (12));
 //BA.debugLineNum = 2014;BA.debugLine="xPhone.Tag = cPhone";
_xphone.setTag((Object)(_cphone));
 //BA.debugLineNum = 2015;BA.debugLine="lblPhone.Gravity = Gravity.CENTER_VERTICAL + Gr";
_lblphone.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.CENTER_HORIZONTAL));
 //BA.debugLineNum = 2016;BA.debugLine="p.AddView(xPhone, CenterStart, 40dip, CenterWid";
_p.AddView((android.view.View)(_xphone.getObject()),_centerstart,__c.DipToCurrent((int) (40)),_centerwidth,__c.DipToCurrent((int) (25)));
 //BA.debugLineNum = 2019;BA.debugLine="Dim lblAddr As Label : lblAddr.Initialize(\"lblD";
_lbladdr = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2019;BA.debugLine="Dim lblAddr As Label : lblAddr.Initialize(\"lblD";
_lbladdr.Initialize(ba,"lblDashAddr");
 //BA.debugLineNum = 2020;BA.debugLine="Dim xAddr As B4XView = lblAddr";
_xaddr = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xaddr = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbladdr.getObject()));
 //BA.debugLineNum = 2021;BA.debugLine="Dim cs3 As CSBuilder";
_cs3 = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 2023;BA.debugLine="cs3.Initialize.Typeface(Typeface.FONTAWESOME).C";
_cs3.Initialize().Typeface(__c.Typeface.getFONTAWESOME()).Color(_xui.Color_Blue).Append(BA.ObjectToCharSequence(BA.ObjectToString(__c.Chr(((int)0xf041)))+" ")).Typeface((android.graphics.Typeface)(_fontcardtext.getObject())).Append(BA.ObjectToCharSequence(_cleanaddress(_loc))).PopAll();
 //BA.debugLineNum = 2024;BA.debugLine="xAddr.Text = cs3";
_xaddr.setText(BA.ObjectToCharSequence(_cs3.getObject()));
 //BA.debugLineNum = 2025;BA.debugLine="xAddr.TextSize = 11 ' [FIXED] Reduced to 11";
_xaddr.setTextSize((float) (11));
 //BA.debugLineNum = 2026;BA.debugLine="xAddr.Tag = loc";
_xaddr.setTag((Object)(_loc));
 //BA.debugLineNum = 2027;BA.debugLine="lblAddr.SingleLine = False";
_lbladdr.setSingleLine(__c.False);
 //BA.debugLineNum = 2028;BA.debugLine="lblAddr.Gravity = Gravity.CENTER_VERTICAL + Gra";
_lbladdr.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.CENTER_HORIZONTAL));
 //BA.debugLineNum = 2029;BA.debugLine="p.AddView(xAddr, CenterStart, 65dip, CenterWidt";
_p.AddView((android.view.View)(_xaddr.getObject()),_centerstart,__c.DipToCurrent((int) (65)),_centerwidth,__c.DipToCurrent((int) (45)));
 //BA.debugLineNum = 2032;BA.debugLine="Dim lblIssue As Label : lblIssue.Initialize(\"\")";
_lblissue = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2032;BA.debugLine="Dim lblIssue As Label : lblIssue.Initialize(\"\")";
_lblissue.Initialize(ba,"");
 //BA.debugLineNum = 2033;BA.debugLine="Dim xIssue As B4XView = lblIssue";
_xissue = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xissue = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblissue.getObject()));
 //BA.debugLineNum = 2034;BA.debugLine="xIssue.Text = \"Issue: \" & cIssue";
_xissue.setText(BA.ObjectToCharSequence("Issue: "+_cissue));
 //BA.debugLineNum = 2035;BA.debugLine="xIssue.TextColor = xui.Color_Black";
_xissue.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 2036;BA.debugLine="xIssue.TextSize = 12";
_xissue.setTextSize((float) (12));
 //BA.debugLineNum = 2037;BA.debugLine="lblIssue.Gravity = Gravity.CENTER_HORIZONTAL +";
_lblissue.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.TOP));
 //BA.debugLineNum = 2038;BA.debugLine="p.AddView(xIssue, CenterStart, 88dip, CenterWid";
_p.AddView((android.view.View)(_xissue.getObject()),_centerstart,__c.DipToCurrent((int) (88)),_centerwidth,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 2040;BA.debugLine="Dim lblStatRight As Label : lblStatRight.Initia";
_lblstatright = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2040;BA.debugLine="Dim lblStatRight As Label : lblStatRight.Initia";
_lblstatright.Initialize(ba,"");
 //BA.debugLineNum = 2041;BA.debugLine="Dim xStatRight As B4XView = lblStatRight";
_xstatright = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xstatright = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblstatright.getObject()));
 //BA.debugLineNum = 2042;BA.debugLine="xStatRight.Text = RightStatusIcon";
_xstatright.setText(BA.ObjectToCharSequence(_rightstatusicon));
 //BA.debugLineNum = 2043;BA.debugLine="xStatRight.TextColor = RightStatusColor";
_xstatright.setTextColor(_rightstatuscolor);
 //BA.debugLineNum = 2044;BA.debugLine="lblStatRight.Typeface = Typeface.FONTAWESOME";
_lblstatright.setTypeface(__c.Typeface.getFONTAWESOME());
 //BA.debugLineNum = 2045;BA.debugLine="xStatRight.TextSize = 35";
_xstatright.setTextSize((float) (35));
 //BA.debugLineNum = 2046;BA.debugLine="xStatRight.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xstatright.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 2047;BA.debugLine="p.AddView(xStatRight, ParentWidth - IconWidth -";
_p.AddView((android.view.View)(_xstatright.getObject()),(int) (_parentwidth-_iconwidth-__c.DipToCurrent((int) (5))),__c.DipToCurrent((int) (22)),_iconwidth,__c.DipToCurrent((int) (50)));
 }else {
 //BA.debugLineNum = 2051;BA.debugLine="Dim TopRowY As Int = 28dip";
_toprowy = __c.DipToCurrent((int) (28));
 //BA.debugLineNum = 2052;BA.debugLine="Dim BotRowY As Int = 75dip";
_botrowy = __c.DipToCurrent((int) (75));
 //BA.debugLineNum = 2053;BA.debugLine="Dim W_Arrival As Int = 60dip";
_w_arrival = __c.DipToCurrent((int) (60));
 //BA.debugLineNum = 2054;BA.debugLine="Dim ArrivalLeftEdge As Int = 20dip";
_arrivalleftedge = __c.DipToCurrent((int) (20));
 //BA.debugLineNum = 2055;BA.debugLine="Dim W_RightStat As Int = 60dip";
_w_rightstat = __c.DipToCurrent((int) (60));
 //BA.debugLineNum = 2056;BA.debugLine="Dim RightStatLeftEdge As Int = ParentWidth - W_";
_rightstatleftedge = (int) (_parentwidth-_w_rightstat-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 2058;BA.debugLine="Dim CenterStart As Int = ArrivalLeftEdge + W_Ar";
_centerstart = (int) (_arrivalleftedge+_w_arrival+__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 2059;BA.debugLine="Dim CenterEnd As Int = RightStatLeftEdge - 10di";
_centerend = (int) (_rightstatleftedge-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 2060;BA.debugLine="Dim CenterWidth As Int = CenterEnd - CenterStar";
_centerwidth = (int) (_centerend-_centerstart);
 //BA.debugLineNum = 2061;BA.debugLine="Dim ColWidth As Int = CenterWidth / 3";
_colwidth = (int) (_centerwidth/(double)3);
 //BA.debugLineNum = 2063;BA.debugLine="Dim lblArrival As Label : lblArrival.Initialize";
_lblarrival = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2063;BA.debugLine="Dim lblArrival As Label : lblArrival.Initialize";
_lblarrival.Initialize(ba,"lblArrival");
 //BA.debugLineNum = 2064;BA.debugLine="Dim xArrival As B4XView = lblArrival";
_xarrival = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xarrival = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblarrival.getObject()));
 //BA.debugLineNum = 2065;BA.debugLine="xArrival.Text = ArrivalIcon";
_xarrival.setText(BA.ObjectToCharSequence(_arrivalicon));
 //BA.debugLineNum = 2066;BA.debugLine="xArrival.TextColor = ArrivalColor";
_xarrival.setTextColor(_arrivalcolor);
 //BA.debugLineNum = 2067;BA.debugLine="lblArrival.Typeface = Typeface.FONTAWESOME";
_lblarrival.setTypeface(__c.Typeface.getFONTAWESOME());
 //BA.debugLineNum = 2068;BA.debugLine="xArrival.TextSize = 40";
_xarrival.setTextSize((float) (40));
 //BA.debugLineNum = 2069;BA.debugLine="xArrival.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xarrival.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 2070;BA.debugLine="Dim DataMap As Map = CreateMap(\"Name\": cName, \"";
_datamap = new anywheresoftware.b4a.objects.collections.Map();
_datamap = __c.createMap(new Object[] {(Object)("Name"),(Object)(_cname),(Object)("Phone"),(Object)(_cphone),(Object)("Addr"),(Object)(_loc),(Object)("ID"),(Object)(_apptid)});
 //BA.debugLineNum = 2071;BA.debugLine="xArrival.Tag = DataMap";
_xarrival.setTag((Object)(_datamap.getObject()));
 //BA.debugLineNum = 2072;BA.debugLine="xArrival.Enabled = ArrivalEnabled";
_xarrival.setEnabled(_arrivalenabled);
 //BA.debugLineNum = 2073;BA.debugLine="p.AddView(xArrival, ArrivalLeftEdge, 25dip, W_A";
_p.AddView((android.view.View)(_xarrival.getObject()),_arrivalleftedge,__c.DipToCurrent((int) (25)),_w_arrival,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 2075;BA.debugLine="Dim lblName As Label : lblName.Initialize(\"lblD";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2075;BA.debugLine="Dim lblName As Label : lblName.Initialize(\"lblD";
_lblname.Initialize(ba,"lblDashName");
 //BA.debugLineNum = 2076;BA.debugLine="Dim xName As B4XView = lblName";
_xname = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xname = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblname.getObject()));
 //BA.debugLineNum = 2077;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 2078;BA.debugLine="cs.Initialize.Typeface(Typeface.FONTAWESOME).Co";
_cs.Initialize().Typeface(__c.Typeface.getFONTAWESOME()).Color(_xui.Color_Blue).Append(BA.ObjectToCharSequence(BA.ObjectToString(__c.Chr(((int)0xf007)))+" ")).Typeface((android.graphics.Typeface)(_fontcardtext.getObject())).Bold().Append(BA.ObjectToCharSequence(_cname)).PopAll();
 //BA.debugLineNum = 2079;BA.debugLine="xName.Text = cs";
_xname.setText(BA.ObjectToCharSequence(_cs.getObject()));
 //BA.debugLineNum = 2080;BA.debugLine="xName.TextSize = 14";
_xname.setTextSize((float) (14));
 //BA.debugLineNum = 2081;BA.debugLine="xName.Tag = cName";
_xname.setTag((Object)(_cname));
 //BA.debugLineNum = 2082;BA.debugLine="lblName.Gravity = Gravity.CENTER_VERTICAL + Gra";
_lblname.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.RIGHT));
 //BA.debugLineNum = 2083;BA.debugLine="p.AddView(xName, CenterStart, TopRowY, ColWidth";
_p.AddView((android.view.View)(_xname.getObject()),_centerstart,_toprowy,_colwidth,__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 2085;BA.debugLine="Dim lblPhone As Label : lblPhone.Initialize(\"lb";
_lblphone = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2085;BA.debugLine="Dim lblPhone As Label : lblPhone.Initialize(\"lb";
_lblphone.Initialize(ba,"lblDashPhone");
 //BA.debugLineNum = 2086;BA.debugLine="Dim xPhone As B4XView = lblPhone";
_xphone = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xphone = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblphone.getObject()));
 //BA.debugLineNum = 2087;BA.debugLine="Dim cs2 As CSBuilder";
_cs2 = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 2088;BA.debugLine="cs2.Initialize.Typeface(Typeface.FONTAWESOME).C";
_cs2.Initialize().Typeface(__c.Typeface.getFONTAWESOME()).Color(_xui.Color_Blue).Append(BA.ObjectToCharSequence(BA.ObjectToString(__c.Chr(((int)0xf095)))+" ")).Typeface((android.graphics.Typeface)(_fontcardtext.getObject())).Append(BA.ObjectToCharSequence(_cphone)).PopAll();
 //BA.debugLineNum = 2089;BA.debugLine="xPhone.Text = cs2";
_xphone.setText(BA.ObjectToCharSequence(_cs2.getObject()));
 //BA.debugLineNum = 2090;BA.debugLine="xPhone.TextSize = 12 ' [FIXED]";
_xphone.setTextSize((float) (12));
 //BA.debugLineNum = 2091;BA.debugLine="xPhone.Tag = cPhone";
_xphone.setTag((Object)(_cphone));
 //BA.debugLineNum = 2092;BA.debugLine="lblPhone.Gravity = Gravity.CENTER_VERTICAL + Gr";
_lblphone.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.CENTER_HORIZONTAL));
 //BA.debugLineNum = 2093;BA.debugLine="p.AddView(xPhone, CenterStart + ColWidth, TopRo";
_p.AddView((android.view.View)(_xphone.getObject()),(int) (_centerstart+_colwidth),_toprowy,_colwidth,__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 2095;BA.debugLine="Dim lblAddr As Label : lblAddr.Initialize(\"lblD";
_lbladdr = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2095;BA.debugLine="Dim lblAddr As Label : lblAddr.Initialize(\"lblD";
_lbladdr.Initialize(ba,"lblDashAddr");
 //BA.debugLineNum = 2096;BA.debugLine="Dim xAddr As B4XView = lblAddr";
_xaddr = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xaddr = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbladdr.getObject()));
 //BA.debugLineNum = 2097;BA.debugLine="Dim cs3 As CSBuilder";
_cs3 = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 2098;BA.debugLine="cs3.Initialize.Typeface(Typeface.FONTAWESOME).C";
_cs3.Initialize().Typeface(__c.Typeface.getFONTAWESOME()).Color(_xui.Color_Blue).Append(BA.ObjectToCharSequence(BA.ObjectToString(__c.Chr(((int)0xf041)))+" ")).Typeface((android.graphics.Typeface)(_fontcardtext.getObject())).Append(BA.ObjectToCharSequence(_cleanaddress(_loc))).PopAll();
 //BA.debugLineNum = 2099;BA.debugLine="xAddr.Text = cs3";
_xaddr.setText(BA.ObjectToCharSequence(_cs3.getObject()));
 //BA.debugLineNum = 2100;BA.debugLine="xAddr.TextSize = 11 ' [FIXED]";
_xaddr.setTextSize((float) (11));
 //BA.debugLineNum = 2101;BA.debugLine="xAddr.Tag = loc";
_xaddr.setTag((Object)(_loc));
 //BA.debugLineNum = 2102;BA.debugLine="lblAddr.SingleLine = False";
_lbladdr.setSingleLine(__c.False);
 //BA.debugLineNum = 2103;BA.debugLine="lblAddr.Gravity = Gravity.CENTER_VERTICAL + Gra";
_lbladdr.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.LEFT));
 //BA.debugLineNum = 2104;BA.debugLine="p.AddView(xAddr, CenterStart + (ColWidth*2), To";
_p.AddView((android.view.View)(_xaddr.getObject()),(int) (_centerstart+(_colwidth*2)),_toprowy,_colwidth,__c.DipToCurrent((int) (45)));
 //BA.debugLineNum = 2106;BA.debugLine="Dim lblIssue As Label : lblIssue.Initialize(\"\")";
_lblissue = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2106;BA.debugLine="Dim lblIssue As Label : lblIssue.Initialize(\"\")";
_lblissue.Initialize(ba,"");
 //BA.debugLineNum = 2107;BA.debugLine="Dim xIssue As B4XView = lblIssue";
_xissue = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xissue = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblissue.getObject()));
 //BA.debugLineNum = 2108;BA.debugLine="xIssue.Text = \"Issue: \" & cIssue";
_xissue.setText(BA.ObjectToCharSequence("Issue: "+_cissue));
 //BA.debugLineNum = 2109;BA.debugLine="xIssue.TextColor = xui.Color_Black";
_xissue.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 2110;BA.debugLine="xIssue.TextSize = 13";
_xissue.setTextSize((float) (13));
 //BA.debugLineNum = 2111;BA.debugLine="lblIssue.Gravity = Gravity.CENTER";
_lblissue.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 2112;BA.debugLine="p.AddView(xIssue, CenterStart, BotRowY, CenterW";
_p.AddView((android.view.View)(_xissue.getObject()),_centerstart,_botrowy,_centerwidth,__c.DipToCurrent((int) (25)));
 //BA.debugLineNum = 2114;BA.debugLine="Dim lblStatRight As Label : lblStatRight.Initia";
_lblstatright = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2114;BA.debugLine="Dim lblStatRight As Label : lblStatRight.Initia";
_lblstatright.Initialize(ba,"");
 //BA.debugLineNum = 2115;BA.debugLine="Dim xStatRight As B4XView = lblStatRight";
_xstatright = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xstatright = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblstatright.getObject()));
 //BA.debugLineNum = 2116;BA.debugLine="xStatRight.Text = RightStatusIcon";
_xstatright.setText(BA.ObjectToCharSequence(_rightstatusicon));
 //BA.debugLineNum = 2117;BA.debugLine="xStatRight.TextColor = RightStatusColor";
_xstatright.setTextColor(_rightstatuscolor);
 //BA.debugLineNum = 2118;BA.debugLine="lblStatRight.Typeface = Typeface.FONTAWESOME";
_lblstatright.setTypeface(__c.Typeface.getFONTAWESOME());
 //BA.debugLineNum = 2119;BA.debugLine="xStatRight.TextSize = 40";
_xstatright.setTextSize((float) (40));
 //BA.debugLineNum = 2120;BA.debugLine="xStatRight.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xstatright.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 2121;BA.debugLine="p.AddView(xStatRight, RightStatLeftEdge, 25dip,";
_p.AddView((android.view.View)(_xstatright.getObject()),_rightstatleftedge,__c.DipToCurrent((int) (25)),_w_rightstat,__c.DipToCurrent((int) (50)));
 };
 //BA.debugLineNum = 2124;BA.debugLine="Dim line As B4XView = xui.CreatePanel(\"\")";
_line = new anywheresoftware.b4a.objects.B4XViewWrapper();
_line = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 2125;BA.debugLine="line.Color = xui.Color_LightGray";
_line.setColor(_xui.Color_LightGray);
 //BA.debugLineNum = 2126;BA.debugLine="p.AddView(line, 0, RowHeight - 2dip, ParentWidth";
_p.AddView((android.view.View)(_line.getObject()),(int) (0),(int) (_rowheight-__c.DipToCurrent((int) (2))),_parentwidth,__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 2128;BA.debugLine="lstTodayApts.Add(p, \"\")";
_lsttodayapts._add(_p,(Object)(""));
 }
};
 //BA.debugLineNum = 2131;BA.debugLine="lblAppsGodNum.Text = MikeCount";
_lblappsgodnum.setText(BA.ObjectToCharSequence(_mikecount));
 //BA.debugLineNum = 2132;BA.debugLine="lblAppsGoddessNum.Text = ErinCount";
_lblappsgoddessnum.setText(BA.ObjectToCharSequence(_erincount));
 //BA.debugLineNum = 2133;BA.debugLine="End Sub";
return "";
}
public void  _checkandrequestsystempermissions() throws Exception{
ResumableSub_CheckAndRequestSystemPermissions rsub = new ResumableSub_CheckAndRequestSystemPermissions(this);
rsub.resume(ba, null);
}
public static class ResumableSub_CheckAndRequestSystemPermissions extends BA.ResumableSub {
public ResumableSub_CheckAndRequestSystemPermissions(Geek.God.CRM.App.b4xmainpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.b4xmainpage parent;
String[] _permissions = null;
boolean _missing = false;
String _p = "";
String _permission = "";
boolean _result = false;
String[] group3;
int index3;
int groupLen3;
String[] group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1105;BA.debugLine="Dim Permissions() As String = Array As String( _";
_permissions = new String[]{parent._rp.PERMISSION_ACCESS_FINE_LOCATION,parent._rp.PERMISSION_READ_CALL_LOG,parent._rp.PERMISSION_SEND_SMS,parent._rp.PERMISSION_CALL_PHONE,parent._rp.PERMISSION_READ_CONTACTS,parent._rp.PERMISSION_WRITE_CONTACTS,parent._rp.PERMISSION_CAMERA,parent._rp.PERMISSION_RECORD_AUDIO,parent._rp.PERMISSION_WRITE_EXTERNAL_STORAGE};
 //BA.debugLineNum = 1115;BA.debugLine="Dim Missing As Boolean = False";
_missing = parent.__c.False;
 //BA.debugLineNum = 1116;BA.debugLine="For Each p As String In Permissions";
if (true) break;

case 1:
//for
this.state = 8;
group3 = _permissions;
index3 = 0;
groupLen3 = group3.length;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 8;
if (index3 < groupLen3) {
this.state = 3;
_p = group3[index3];}
if (true) break;

case 22:
//C
this.state = 21;
index3++;
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1117;BA.debugLine="If rp.Check(p) = False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (parent._rp.Check(_p)==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 1118;BA.debugLine="Missing = True";
_missing = parent.__c.True;
 //BA.debugLineNum = 1119;BA.debugLine="Exit";
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 22;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 1122;BA.debugLine="If Missing Then";

case 8:
//if
this.state = 15;
if (_missing) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 1123;BA.debugLine="For Each p As String In Permissions";
if (true) break;

case 11:
//for
this.state = 14;
group10 = _permissions;
index10 = 0;
groupLen10 = group10.length;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 14;
if (index10 < groupLen10) {
this.state = 13;
_p = group10[index10];}
if (true) break;

case 24:
//C
this.state = 23;
index10++;
if (true) break;

case 13:
//C
this.state = 24;
 //BA.debugLineNum = 1124;BA.debugLine="rp.CheckAndRequest(p)";
parent._rp.CheckAndRequest(ba,_p);
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
;
 //BA.debugLineNum = 1126;BA.debugLine="Wait For B4XPage_PermissionResult (Permission As";
parent.__c.WaitFor("b4xpage_permissionresult", ba, this, null);
this.state = 25;
return;
case 25:
//C
this.state = 15;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 if (true) break;
;
 //BA.debugLineNum = 1128;BA.debugLine="If rp.Check(rp.PERMISSION_ACCESS_FINE_LOCATION) T";

case 15:
//if
this.state = 20;
if (parent._rp.Check(parent._rp.PERMISSION_ACCESS_FINE_LOCATION)) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
parent._gps.Start(ba,(long) (0),(float) (0));
if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 1129;BA.debugLine="SetupFontSystem";
parent._setupfontsystem();
 //BA.debugLineNum = 1130;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _b4xpage_permissionresult(String _permission,boolean _result) throws Exception{
}
public String  _checkbookingstate(anywheresoftware.b4a.objects.collections.Map _profile) throws Exception{
 //BA.debugLineNum = 1507;BA.debugLine="Public Sub CheckBookingState(Profile As Map)";
 //BA.debugLineNum = 1508;BA.debugLine="Log(\">>> [TRAFFIC COP] Checking Booking State...\"";
__c.LogImpl("013500417",">>> [TRAFFIC COP] Checking Booking State...",0);
 //BA.debugLineNum = 1511;BA.debugLine="If PendingSlot.IsInitialized And PendingSlot.Size";
if (_pendingslot.IsInitialized() && _pendingslot.getSize()>0) { 
 //BA.debugLineNum = 1512;BA.debugLine="Log(\"   -> Path: Time Slot Found. Merging with C";
__c.LogImpl("013500421","   -> Path: Time Slot Found. Merging with Client.",0);
 //BA.debugLineNum = 1514;BA.debugLine="B4XPages.ShowPage(\"AppointmentPage\")";
_b4xpages._showpage /*String*/ (ba,"AppointmentPage");
 //BA.debugLineNum = 1515;BA.debugLine="CallSub3(appointmentScreen, \"BookAppointment\", P";
__c.CallSubNew3(ba,(Object)(_appointmentscreen),"BookAppointment",(Object)(_pendingslot),(Object)(_profile));
 //BA.debugLineNum = 1516;BA.debugLine="PendingSlot.Clear ' Consumed";
_pendingslot.Clear();
 }else {
 //BA.debugLineNum = 1520;BA.debugLine="Log(\"   -> Path: No Time Slot. Storing Client ->";
__c.LogImpl("013500429","   -> Path: No Time Slot. Storing Client -> Going to AppointmentPage.",0);
 //BA.debugLineNum = 1522;BA.debugLine="PendingSlot.Clear ' Ensure no stale data";
_pendingslot.Clear();
 //BA.debugLineNum = 1526;BA.debugLine="B4XPages.ShowPage(\"AppointmentPage\")";
_b4xpages._showpage /*String*/ (ba,"AppointmentPage");
 //BA.debugLineNum = 1527;BA.debugLine="CallSub2(appointmentScreen, \"LoadClientForAppt\",";
__c.CallSubNew2(ba,(Object)(_appointmentscreen),"LoadClientForAppt",(Object)(_profile));
 };
 //BA.debugLineNum = 1529;BA.debugLine="End Sub";
return "";
}
public String  _checkcontactgroups() throws Exception{
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 2269;BA.debugLine="Public Sub CheckContactGroups";
 //BA.debugLineNum = 2270;BA.debugLine="If OAuth2.access_token = \"\" Then Return";
if ((_oauth2._access_token /*String*/ ).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 2272;BA.debugLine="Dim job As HttpJob : job.Initialize(\"ListGroups\",";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 2272;BA.debugLine="Dim job As HttpJob : job.Initialize(\"ListGroups\",";
_job._initialize /*String*/ (ba,"ListGroups",this);
 //BA.debugLineNum = 2273;BA.debugLine="job.Download(\"https://people.googleapis.com/v1/co";
_job._download /*String*/ ("https://people.googleapis.com/v1/contactGroups?pageSize=100");
 //BA.debugLineNum = 2274;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 2275;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkduplicatefield(String _query) throws Exception{
ResumableSub_CheckDuplicateField rsub = new ResumableSub_CheckDuplicateField(this,_query);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckDuplicateField extends BA.ResumableSub {
public ResumableSub_CheckDuplicateField(Geek.God.CRM.App.b4xmainpage parent,String _query) {
this.parent = parent;
this._query = _query;
}
Geek.God.CRM.App.b4xmainpage parent;
String _query;
anywheresoftware.b4a.objects.StringUtils _su = null;
Geek.God.CRM.App.httpjob _j = null;
boolean _hasduplicate = false;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _jsonroot = null;
anywheresoftware.b4a.objects.collections.List _results = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 5944;BA.debugLine="If OAuth2.access_token = \"\" Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._oauth2._access_token /*String*/ ).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 5946;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 5947;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\", Me)";
_j = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 5947;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 5948;BA.debugLine="j.Download(\"https://people.googleapis.com/v1/peop";
_j._download /*String*/ ("https://people.googleapis.com/v1/people:searchContacts?query="+_su.EncodeUrl(_query,"UTF8")+"&readMask=names");
 //BA.debugLineNum = 5949;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", \"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._oauth2._access_token /*String*/ );
 //BA.debugLineNum = 5951;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 21;
return;
case 21:
//C
this.state = 7;
_j = (Geek.God.CRM.App.httpjob) result[0];
;
 //BA.debugLineNum = 5953;BA.debugLine="Dim HasDuplicate As Boolean = False";
_hasduplicate = parent.__c.False;
 //BA.debugLineNum = 5954;BA.debugLine="If j.Success Then";
if (true) break;

case 7:
//if
this.state = 20;
if (_j._success /*boolean*/ ) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 5955;BA.debugLine="Dim parser As JSONParser : parser.Initialize(j.G";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 5955;BA.debugLine="Dim parser As JSONParser : parser.Initialize(j.G";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 5956;BA.debugLine="Dim jsonRoot As Map = parser.NextObject";
_jsonroot = new anywheresoftware.b4a.objects.collections.Map();
_jsonroot = _parser.NextObject();
 //BA.debugLineNum = 5957;BA.debugLine="If jsonRoot.ContainsKey(\"results\") Then";
if (true) break;

case 10:
//if
this.state = 19;
if (_jsonroot.ContainsKey((Object)("results"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 5958;BA.debugLine="Dim results As List = jsonRoot.Get(\"results\")";
_results = new anywheresoftware.b4a.objects.collections.List();
_results = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jsonroot.Get((Object)("results"))));
 //BA.debugLineNum = 5959;BA.debugLine="If results.Size > 0 Then HasDuplicate = True";
if (true) break;

case 13:
//if
this.state = 18;
if (_results.getSize()>0) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
_hasduplicate = parent.__c.True;
if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 5962;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 5963;BA.debugLine="Return HasDuplicate";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_hasduplicate));return;};
 //BA.debugLineNum = 5964;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _checkholidaytheme() throws Exception{
int _month = 0;
int _day = 0;
int _dow = 0;
 //BA.debugLineNum = 743;BA.debugLine="Private Sub CheckHolidayTheme";
 //BA.debugLineNum = 744;BA.debugLine="If HolidayBanner.IsInitialized = False Then Holid";
if (_holidaybanner.IsInitialized()==__c.False) { 
_holidaybanner.Initialize();};
 //BA.debugLineNum = 745;BA.debugLine="HolidayBanner.Clear";
_holidaybanner.Clear();
 //BA.debugLineNum = 747;BA.debugLine="Dim Month As Int = DateTime.GetMonth(DateTime.Now";
_month = __c.DateTime.GetMonth(__c.DateTime.getNow());
 //BA.debugLineNum = 748;BA.debugLine="Dim Day As Int = DateTime.GetDayOfMonth(DateTime.";
_day = __c.DateTime.GetDayOfMonth(__c.DateTime.getNow());
 //BA.debugLineNum = 749;BA.debugLine="Dim dow As Int = DateTime.GetDayOfWeek(DateTime.N";
_dow = __c.DateTime.GetDayOfWeek(__c.DateTime.getNow());
 //BA.debugLineNum = 751;BA.debugLine="lblDayDate.Color = xui.Color_Transparent";
_lbldaydate.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 752;BA.debugLine="lblDayDate.TextColor = xui.Color_Black";
_lbldaydate.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 754;BA.debugLine="If Month = 11 And Day = 4 Then";
if (_month==11 && _day==4) { 
 //BA.debugLineNum = 755;BA.debugLine="ThemeHoliday(\"🎂 Happy Birthday Erin! 🎂\", 0xFFF";
_themeholiday("🎂 Happy Birthday Erin! 🎂",((int)0xffffc107),_xui.Color_Black);
 //BA.debugLineNum = 756;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 758;BA.debugLine="If Month = 4 And Day = 21 Then";
if (_month==4 && _day==21) { 
 //BA.debugLineNum = 759;BA.debugLine="ThemeHoliday(\"🎂 Happy Birthday Mike! 🎂\", 0xFFF";
_themeholiday("🎂 Happy Birthday Mike! 🎂",((int)0xffffc107),_xui.Color_Black);
 //BA.debugLineNum = 760;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 762;BA.debugLine="If Month = 12 And Day = 28 Then";
if (_month==12 && _day==28) { 
 //BA.debugLineNum = 763;BA.debugLine="ThemeHoliday(\"🎂 Happy Birthday Willow! 🎂\", 0xF";
_themeholiday("🎂 Happy Birthday Willow! 🎂",((int)0xffffc107),_xui.Color_Black);
 //BA.debugLineNum = 764;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 766;BA.debugLine="If Month = 2 And Day = 25 Then";
if (_month==2 && _day==25) { 
 //BA.debugLineNum = 767;BA.debugLine="ThemeHoliday(\"🎂 Happy Birthday Vivian! 🎂\", 0xF";
_themeholiday("🎂 Happy Birthday Vivian! 🎂",((int)0xffffc107),_xui.Color_Black);
 //BA.debugLineNum = 768;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 771;BA.debugLine="If Month = 1 And Day = 1 Then ThemeHoliday(\"🎉 Ne";
if (_month==1 && _day==1) { 
_themeholiday("🎉 New Year's Day 🎉",((int)0xff1976d2),_xui.Color_White);};
 //BA.debugLineNum = 772;BA.debugLine="If Month = 1 And dow = 2 And Day >= 15 And Day <=";
if (_month==1 && _dow==2 && _day>=15 && _day<=21) { 
_themeholiday("Martin Luther King Jr. Day",((int)0xff000000),_xui.Color_White);};
 //BA.debugLineNum = 773;BA.debugLine="If Month = 2 And Day = 14 Then ThemeHoliday(\"❤️ V";
if (_month==2 && _day==14) { 
_themeholiday("❤️ Valentine's Day ❤️",((int)0xfff8bbd0),((int)0xff880e4f));};
 //BA.debugLineNum = 774;BA.debugLine="If Month = 2 And dow = 2 And Day >= 15 And Day <=";
if (_month==2 && _dow==2 && _day>=15 && _day<=21) { 
_themeholiday("🇺🇸 Presidents' Day 🇺🇸",((int)0xff1976d2),_xui.Color_White);};
 //BA.debugLineNum = 775;BA.debugLine="If Month = 3 And Day = 17 Then ThemeHoliday(\"☘️ S";
if (_month==3 && _day==17) { 
_themeholiday("☘️ St. Patrick's Day ☘️",((int)0xff388e3c),_xui.Color_White);};
 //BA.debugLineNum = 776;BA.debugLine="If Month = 4 And Day < 15 Then ThemeHoliday(\"🥚 E";
if (_month==4 && _day<15) { 
_themeholiday("🥚 Easter Season 🥚",((int)0xffe1bee7),_xui.Color_Black);};
 //BA.debugLineNum = 777;BA.debugLine="If Month = 5 And dow = 1 And Day >= 8 And Day <=";
if (_month==5 && _dow==1 && _day>=8 && _day<=14) { 
_themeholiday("💐 Mother's Day 💐",((int)0xfff48fb1),_xui.Color_White);};
 //BA.debugLineNum = 778;BA.debugLine="If Month = 5 And dow = 2 And Day >= 25 Then Theme";
if (_month==5 && _dow==2 && _day>=25) { 
_themeholiday("🇺🇸 Memorial Day 🇺🇸",((int)0xff283593),_xui.Color_White);};
 //BA.debugLineNum = 779;BA.debugLine="If Month = 6 And Day = 19 Then ThemeHoliday(\"June";
if (_month==6 && _day==19) { 
_themeholiday("Juneteenth",((int)0xff000000),((int)0xffff0000));};
 //BA.debugLineNum = 780;BA.debugLine="If Month = 6 And dow = 1 And Day >= 15 And Day <=";
if (_month==6 && _dow==1 && _day>=15 && _day<=21) { 
_themeholiday("👔 Father's Day 👔",((int)0xff424242),_xui.Color_White);};
 //BA.debugLineNum = 781;BA.debugLine="If Month = 7 And Day = 4 Then ThemeHoliday(\"🎆 In";
if (_month==7 && _day==4) { 
_themeholiday("🎆 Independence Day 🎆",((int)0xffd32f2f),_xui.Color_White);};
 //BA.debugLineNum = 782;BA.debugLine="If Month = 9 And dow = 2 And Day <= 7 Then ThemeH";
if (_month==9 && _dow==2 && _day<=7) { 
_themeholiday("Labor Day",((int)0xff5d4037),_xui.Color_White);};
 //BA.debugLineNum = 783;BA.debugLine="If Month = 10 And Day = 31 Then ThemeHoliday(\"🎃";
if (_month==10 && _day==31) { 
_themeholiday("🎃 Halloween 🎃",((int)0xffff9800),_xui.Color_Black);};
 //BA.debugLineNum = 784;BA.debugLine="If Month = 11 And Day = 11 Then ThemeHoliday(\"🇺�";
if (_month==11 && _day==11) { 
_themeholiday("🇺🇸 Veterans Day 🇺🇸",((int)0xff283593),_xui.Color_White);};
 //BA.debugLineNum = 785;BA.debugLine="If Month = 11 And dow = 5 And Day >= 22 And Day <";
if (_month==11 && _dow==5 && _day>=22 && _day<=28) { 
_themeholiday("🦃 Thanksgiving 🦃",((int)0xff795548),_xui.Color_White);};
 //BA.debugLineNum = 786;BA.debugLine="If Month = 12 And Day >= 15 Then ThemeHoliday(\"🎄";
if (_month==12 && _day>=15) { 
_themeholiday("🎄 Merry Christmas 🎄",((int)0xffd32f2f),_xui.Color_White);};
 //BA.debugLineNum = 787;BA.debugLine="End Sub";
return "";
}
public String  _checkoauth(anywheresoftware.b4a.objects.IntentWrapper _intent) throws Exception{
 //BA.debugLineNum = 715;BA.debugLine="Public Sub CheckOAuth(Intent As Intent)";
 //BA.debugLineNum = 716;BA.debugLine="If OAuth2.IsInitialized Then";
if (_oauth2._isinitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 717;BA.debugLine="OAuth2.CallFromResume(Intent)";
_oauth2._callfromresume /*String*/ (_intent);
 };
 //BA.debugLineNum = 719;BA.debugLine="End Sub";
return "";
}
public String  _checksettings() throws Exception{
String _user = "";
 //BA.debugLineNum = 799;BA.debugLine="Sub CheckSettings";
 //BA.debugLineNum = 800;BA.debugLine="If File.Exists(File.DirInternal, \"settings.map\")";
if (__c.File.Exists(__c.File.getDirInternal(),"settings.map")) { 
 //BA.debugLineNum = 801;BA.debugLine="appSettings = File.ReadMap(File.DirInternal, \"se";
_appsettings = __c.File.ReadMap(__c.File.getDirInternal(),"settings.map");
 //BA.debugLineNum = 802;BA.debugLine="Dim user As String = appSettings.GetDefault(\"Cur";
_user = BA.ObjectToString(_appsettings.GetDefault((Object)("CurrentUser"),(Object)("")));
 //BA.debugLineNum = 803;BA.debugLine="If user = \"\" Or user = \"null\" Then";
if ((_user).equals("") || (_user).equals("null")) { 
 //BA.debugLineNum = 804;BA.debugLine="ShowUserSelection";
_showuserselection();
 }else {
 //BA.debugLineNum = 807;BA.debugLine="CurrentUser = user";
_currentuser = _user;
 };
 }else {
 //BA.debugLineNum = 810;BA.debugLine="appSettings.Initialize";
_appsettings.Initialize();
 //BA.debugLineNum = 811;BA.debugLine="ShowUserSelection";
_showuserselection();
 };
 //BA.debugLineNum = 813;BA.debugLine="End Sub";
return "";
}
public void  _checktrafficcop(anywheresoftware.b4a.objects.collections.Map _finalmap) throws Exception{
ResumableSub_CheckTrafficCop rsub = new ResumableSub_CheckTrafficCop(this,_finalmap);
rsub.resume(ba, null);
}
public static class ResumableSub_CheckTrafficCop extends BA.ResumableSub {
public ResumableSub_CheckTrafficCop(Geek.God.CRM.App.b4xmainpage parent,anywheresoftware.b4a.objects.collections.Map _finalmap) {
this.parent = parent;
this._finalmap = _finalmap;
}
Geek.God.CRM.App.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _finalmap;
String _searchphone = "";
String _searchname = "";
String _searchaddr = "";
boolean _foundmatch = false;
String _matchedquery = "";
boolean _result = false;
String _cleanaddr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 5882;BA.debugLine="Log(\">>> [CRASH TRACKER] CheckTrafficCop STARTED\"";
parent.__c.LogImpl("021626881",">>> [CRASH TRACKER] CheckTrafficCop STARTED",0);
 //BA.debugLineNum = 5883;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 40;
this.catchState = 39;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 39;
 //BA.debugLineNum = 5884;BA.debugLine="ProgressDialogShow(\"Traffic Cop: Checking for ex";
parent.__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Traffic Cop: Checking for existing client..."));
 //BA.debugLineNum = 5886;BA.debugLine="Dim SearchPhone As String = FinalMap.GetDefault(";
_searchphone = BA.ObjectToString(_finalmap.GetDefault((Object)("Phone"),(Object)("")));
 //BA.debugLineNum = 5887;BA.debugLine="Dim SearchName As String = FinalMap.GetDefault(\"";
_searchname = BA.ObjectToString(_finalmap.GetDefault((Object)("Name"),(Object)("")));
 //BA.debugLineNum = 5888;BA.debugLine="Dim SearchAddr As String = FinalMap.GetDefault(\"";
_searchaddr = BA.ObjectToString(_finalmap.GetDefault((Object)("Address"),(Object)("")));
 //BA.debugLineNum = 5890;BA.debugLine="Dim FoundMatch As Boolean = False";
_foundmatch = parent.__c.False;
 //BA.debugLineNum = 5891;BA.debugLine="Dim MatchedQuery As String = \"\"";
_matchedquery = "";
 //BA.debugLineNum = 5894;BA.debugLine="If SearchPhone <> \"\" And FoundMatch = False Then";
if (true) break;

case 4:
//if
this.state = 11;
if ((_searchphone).equals("") == false && _foundmatch==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 5895;BA.debugLine="Wait For (CheckDuplicateField(SearchPhone)) Com";
parent.__c.WaitFor("complete", ba, this, parent._checkduplicatefield(_searchphone));
this.state = 41;
return;
case 41:
//C
this.state = 7;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 5896;BA.debugLine="If Result Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_result) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 5897;BA.debugLine="FoundMatch = True";
_foundmatch = parent.__c.True;
 //BA.debugLineNum = 5898;BA.debugLine="MatchedQuery = SearchPhone";
_matchedquery = _searchphone;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;
;
 //BA.debugLineNum = 5903;BA.debugLine="If SearchName <> \"\" And FoundMatch = False Then";

case 11:
//if
this.state = 18;
if ((_searchname).equals("") == false && _foundmatch==parent.__c.False) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 5904;BA.debugLine="Wait For (CheckDuplicateField(SearchName)) Comp";
parent.__c.WaitFor("complete", ba, this, parent._checkduplicatefield(_searchname));
this.state = 42;
return;
case 42:
//C
this.state = 14;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 5905;BA.debugLine="If Result Then";
if (true) break;

case 14:
//if
this.state = 17;
if (_result) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 5906;BA.debugLine="FoundMatch = True";
_foundmatch = parent.__c.True;
 //BA.debugLineNum = 5907;BA.debugLine="MatchedQuery = SearchName";
_matchedquery = _searchname;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;
;
 //BA.debugLineNum = 5912;BA.debugLine="If SearchAddr <> \"\" And FoundMatch = False Then";

case 18:
//if
this.state = 31;
if ((_searchaddr).equals("") == false && _foundmatch==parent.__c.False) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 5913;BA.debugLine="Dim CleanAddr As String = SearchAddr";
_cleanaddr = _searchaddr;
 //BA.debugLineNum = 5914;BA.debugLine="If CleanAddr.Contains(\",\") Then CleanAddr = Cle";
if (true) break;

case 21:
//if
this.state = 26;
if (_cleanaddr.contains(",")) { 
this.state = 23;
;}if (true) break;

case 23:
//C
this.state = 26;
_cleanaddr = _cleanaddr.substring((int) (0),_cleanaddr.indexOf(","));
if (true) break;

case 26:
//C
this.state = 27;
;
 //BA.debugLineNum = 5915;BA.debugLine="Wait For (CheckDuplicateField(CleanAddr)) Compl";
parent.__c.WaitFor("complete", ba, this, parent._checkduplicatefield(_cleanaddr));
this.state = 43;
return;
case 43:
//C
this.state = 27;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 5916;BA.debugLine="If Result Then";
if (true) break;

case 27:
//if
this.state = 30;
if (_result) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 5917;BA.debugLine="FoundMatch = True";
_foundmatch = parent.__c.True;
 //BA.debugLineNum = 5918;BA.debugLine="MatchedQuery = CleanAddr";
_matchedquery = _cleanaddr;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = 32;
;
 //BA.debugLineNum = 5922;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 5925;BA.debugLine="If FoundMatch Then";
if (true) break;

case 32:
//if
this.state = 37;
if (_foundmatch) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 37;
 //BA.debugLineNum = 5926;BA.debugLine="xui.MsgboxAsync(\"Existing client found in datab";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Existing client found in database. Loading profile..."),BA.ObjectToCharSequence("Traffic Cop"));
 //BA.debugLineNum = 5927;BA.debugLine="B4XPages.ShowPage(\"SearchPage\")";
parent._b4xpages._showpage /*String*/ (ba,"SearchPage");
 //BA.debugLineNum = 5928;BA.debugLine="PerformSearch(MatchedQuery)";
parent._performsearch(_matchedquery);
 if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 5930;BA.debugLine="B4XPages.ShowPage(\"CreateClientPage\")";
parent._b4xpages._showpage /*String*/ (ba,"CreateClientPage");
 //BA.debugLineNum = 5931;BA.debugLine="CallSub2(clientCreator, \"PopulateScrapeData\", F";
parent.__c.CallSubNew2(ba,(Object)(parent._clientcreator),"PopulateScrapeData",(Object)(_finalmap));
 if (true) break;

case 37:
//C
this.state = 40;
;
 if (true) break;

case 39:
//C
this.state = 40;
this.catchState = 0;
 //BA.debugLineNum = 5935;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 5936;BA.debugLine="Log(\">>> [CRITICAL CRASH TRAPPED] Error in Check";
parent.__c.LogImpl("021626935",">>> [CRITICAL CRASH TRAPPED] Error in CheckTrafficCop: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
 //BA.debugLineNum = 5937;BA.debugLine="xui.MsgboxAsync(\"Database check failed. Routing";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Database check failed. Routing to New Client. Error: "+parent.__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("System Error"));
 //BA.debugLineNum = 5938;BA.debugLine="B4XPages.ShowPage(\"CreateClientPage\")";
parent._b4xpages._showpage /*String*/ (ba,"CreateClientPage");
 //BA.debugLineNum = 5939;BA.debugLine="CallSub2(clientCreator, \"PopulateScrapeData\", Fi";
parent.__c.CallSubNew2(ba,(Object)(parent._clientcreator),"PopulateScrapeData",(Object)(_finalmap));
 if (true) break;
if (true) break;

case 40:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 5941;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _complete(boolean _result) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Private appSettings As Map";
_appsettings = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Private HasRunOnce As Boolean = False";
_hasrunonce = __c.False;
 //BA.debugLineNum = 12;BA.debugLine="Public PendingSlot As Map";
_pendingslot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Public RecentlyUpdated As Map";
_recentlyupdated = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 16;BA.debugLine="Private Panel1 As B4XView";
_panel1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private lblStatus As B4XView";
_lblstatus = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private lblDayDate As B4XView";
_lbldaydate = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private SensorShake As PhoneSensors";
_sensorshake = new anywheresoftware.b4a.phone.Phone.PhoneSensors();
 //BA.debugLineNum = 22;BA.debugLine="Private LastShakeTime As Long";
_lastshaketime = 0L;
 //BA.debugLineNum = 23;BA.debugLine="Private IsTorchOn As Boolean = False";
_istorchon = __c.False;
 //BA.debugLineNum = 26;BA.debugLine="Private btnSearch As B4XView";
_btnsearch = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private btnCreateClient As B4XView";
_btncreateclient = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private btnScrape As B4XView";
_btnscrape = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private btnViewApt As B4XView";
_btnviewapt = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private btnCloseout As B4XView";
_btncloseout = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private btnMakeApt As B4XView";
_btnmakeapt = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private btnLogin As B4XView";
_btnlogin = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private pnlStats As B4XView";
_pnlstats = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private lblTotalAptsGod As B4XView";
_lbltotalaptsgod = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private lblTotalAptsGoddess As Label";
_lbltotalaptsgoddess = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private lblGodCollected As Label";
_lblgodcollected = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private lblGoddessCollected As Label";
_lblgoddesscollected = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private lblTotalCollected As B4XView";
_lbltotalcollected = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private lblAppsGodNum As B4XView";
_lblappsgodnum = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private lblAppsGoddessNum As Label";
_lblappsgoddessnum = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private lblGodCollectedNum As Label";
_lblgodcollectednum = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private lblGoddessCollectedNum As B4XView";
_lblgoddesscollectednum = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private lblTotalCollectedNum As B4XView";
_lbltotalcollectednum = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private spnChose As Spinner";
_spnchose = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private lblSelectGod As B4XView";
_lblselectgod = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private lstTodayApts As CustomListView";
_lsttodayapts = new b4a.example3.customlistview();
 //BA.debugLineNum = 53;BA.debugLine="Private StatusRefreshTimer As Timer";
_statusrefreshtimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 56;BA.debugLine="Public OAuth2 As GoogleOAuth2";
_oauth2 = new Geek.God.CRM.App.googleoauth2();
 //BA.debugLineNum = 57;BA.debugLine="Private const CLIENT_ID As String = \"107757561287";
_client_id = "1077575612876-0lgv0dhcu1956b75n80gfs9t0djn2a5c.apps.googleusercontent.com";
 //BA.debugLineNum = 58;BA.debugLine="Private const SOURCE_ID As String = \"1-8id4XZafXR";
_source_id = "1-8id4XZafXRqRyE1ryhqhDy5oewghrDY";
 //BA.debugLineNum = 61;BA.debugLine="Public searchScreen As SearchPage";
_searchscreen = new Geek.God.CRM.App.searchpage();
 //BA.debugLineNum = 62;BA.debugLine="Public appointmentScreen As AppointmentPage";
_appointmentscreen = new Geek.God.CRM.App.appointmentpage();
 //BA.debugLineNum = 63;BA.debugLine="Public ViewScheduleScreen As ViewSchedulePage";
_viewschedulescreen = new Geek.God.CRM.App.viewschedulepage();
 //BA.debugLineNum = 64;BA.debugLine="Public CloseOutScreen As CloseOut";
_closeoutscreen = new Geek.God.CRM.App.closeout();
 //BA.debugLineNum = 65;BA.debugLine="Public clientCreator As CreateClientPage";
_clientcreator = new Geek.God.CRM.App.createclientpage();
 //BA.debugLineNum = 68;BA.debugLine="Private TempProfile As Map";
_tempprofile = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 69;BA.debugLine="Private LedgerQueue As List";
_ledgerqueue = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 70;BA.debugLine="Private CurrentLedgerID As String";
_currentledgerid = "";
 //BA.debugLineNum = 71;BA.debugLine="Private CurrentSearchQuery As String";
_currentsearchquery = "";
 //BA.debugLineNum = 72;BA.debugLine="Private IssuesHistory As List";
_issueshistory = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 75;BA.debugLine="Private gps As GPS";
_gps = new anywheresoftware.b4a.gps.GPS();
 //BA.debugLineNum = 76;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 77;BA.debugLine="Private CurrentLocation As Location";
_currentlocation = new anywheresoftware.b4a.gps.LocationWrapper();
 //BA.debugLineNum = 78;BA.debugLine="Private GeocodedLocations As Map";
_geocodedlocations = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 79;BA.debugLine="Private FailedGeocodes As Map ' Prevents Geocode";
_failedgeocodes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 82;BA.debugLine="Private ActiveAppointmentID As String = \"\"";
_activeappointmentid = "";
 //BA.debugLineNum = 83;BA.debugLine="Private ActiveArrivalTime As Long = 0";
_activearrivaltime = (long) (0);
 //BA.debugLineNum = 84;BA.debugLine="Private ActiveJobMap As Map";
_activejobmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 85;BA.debugLine="Private JobTimer As Timer";
_jobtimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 88;BA.debugLine="Private const COLOR_PENDING As Int = 0xFFFFEBEE";
_color_pending = ((int)0xffffebee);
 //BA.debugLineNum = 89;BA.debugLine="Private const COLOR_ACTIVE As Int = 0xFFFFF9C4";
_color_active = ((int)0xfffff9c4);
 //BA.debugLineNum = 90;BA.debugLine="Private const COLOR_CLOSED As Int = 0xFFDCEDC8";
_color_closed = ((int)0xffdcedc8);
 //BA.debugLineNum = 93;BA.debugLine="Private FuzzyCandidates As Map";
_fuzzycandidates = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 96;BA.debugLine="Private ScrapeMap As Map";
_scrapemap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 97;BA.debugLine="Private ScrapeQueue As List";
_scrapequeue = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 98;BA.debugLine="Public VMPlayer As MediaPlayer ' Plays the .amr f";
_vmplayer = new anywheresoftware.b4a.objects.MediaPlayerWrapper();
 //BA.debugLineNum = 101;BA.debugLine="Public ScrapedApptIssue As String";
_scrapedapptissue = "";
 //BA.debugLineNum = 103;BA.debugLine="Private ime As IME";
_ime = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 104;BA.debugLine="Private LastDashboardItems As List";
_lastdashboarditems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 105;BA.debugLine="Private const LAYOUT_THRESHOLD As Int = 550dip";
_layout_threshold = __c.DipToCurrent((int) (550));
 //BA.debugLineNum = 108;BA.debugLine="Private ExpensePanel As B4XView";
_expensepanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 109;BA.debugLine="Private ExpensePhotoPath As String";
_expensephotopath = "";
 //BA.debugLineNum = 110;BA.debugLine="Private ExtractedDate As String";
_extracteddate = "";
 //BA.debugLineNum = 111;BA.debugLine="Private ExtractedTime As String";
_extractedtime = "";
 //BA.debugLineNum = 113;BA.debugLine="Private ExpenseDateLabel As Label";
_expensedatelabel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 114;BA.debugLine="Private ExpenseCategorySpinner As Spinner";
_expensecategoryspinner = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 115;BA.debugLine="Private ExpenseAmount As EditText";
_expenseamount = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 116;BA.debugLine="Private ExpenseNotes As EditText";
_expensenotes = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 119;BA.debugLine="Private fontLabels As Typeface = Typeface.DEFAULT";
_fontlabels = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_fontlabels = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
 //BA.debugLineNum = 120;BA.debugLine="Private fontButtons As Typeface = Typeface.DEFAUL";
_fontbuttons = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_fontbuttons = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
 //BA.debugLineNum = 121;BA.debugLine="Private fontStats As Typeface = Typeface.DEFAULT";
_fontstats = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_fontstats = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
 //BA.debugLineNum = 122;BA.debugLine="Private fontCardText As Typeface = Typeface.DEFAU";
_fontcardtext = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_fontcardtext = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
 //BA.debugLineNum = 125;BA.debugLine="Private HolidayBanner As Map";
_holidaybanner = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 128;BA.debugLine="Private ArrivalThresholdMeters As Float = 92  ' ~";
_arrivalthresholdmeters = (float) (92);
 //BA.debugLineNum = 131;BA.debugLine="Private SP As SoundPool";
_sp = new anywheresoftware.b4a.audio.SoundPoolWrapper();
 //BA.debugLineNum = 132;BA.debugLine="Private SoundIDs As List";
_soundids = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 135;BA.debugLine="Public CurrentUser As String = \"Mike\"";
_currentuser = "Mike";
 //BA.debugLineNum = 138;BA.debugLine="Private FoldDetector As JavaObject";
_folddetector = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 139;BA.debugLine="Public LastFoldState As String = \"FLAT\" ' FLAT, H";
_lastfoldstate = "FLAT";
 //BA.debugLineNum = 140;BA.debugLine="Public LastOrientation As String = \"NONE\" ' VERTI";
_lastorientation = "NONE";
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _cleanaddress(String _raw) throws Exception{
String _zip = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
String _streetpart = "";
 //BA.debugLineNum = 4905;BA.debugLine="Public Sub CleanAddress(Raw As String) As String";
 //BA.debugLineNum = 4906;BA.debugLine="If Raw = \"\" Or Raw = \"No Address\" Then Return \"No";
if ((_raw).equals("") || (_raw).equals("No Address")) { 
if (true) return "No Address";};
 //BA.debugLineNum = 4907;BA.debugLine="Dim Zip As String = \"\"";
_zip = "";
 //BA.debugLineNum = 4908;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"\\b\\d{5}(?:-\\d{4";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = __c.Regex.Matcher("\\b\\d{5}(?:-\\d{4})?\\b",_raw);
 //BA.debugLineNum = 4909;BA.debugLine="If m.Find Then Zip = m.Match";
if (_m.Find()) { 
_zip = _m.getMatch();};
 //BA.debugLineNum = 4910;BA.debugLine="Dim StreetPart As String = Raw";
_streetpart = _raw;
 //BA.debugLineNum = 4911;BA.debugLine="If Raw.Contains(\",\") Then";
if (_raw.contains(",")) { 
 //BA.debugLineNum = 4912;BA.debugLine="StreetPart = Raw.SubString2(0, Raw.IndexOf(\",\"))";
_streetpart = _raw.substring((int) (0),_raw.indexOf(",")).trim();
 };
 //BA.debugLineNum = 4914;BA.debugLine="If Zip <> \"\" Then";
if ((_zip).equals("") == false) { 
 //BA.debugLineNum = 4915;BA.debugLine="Return StreetPart & \", \" & Zip";
if (true) return _streetpart+", "+_zip;
 }else {
 //BA.debugLineNum = 4917;BA.debugLine="Return StreetPart";
if (true) return _streetpart;
 };
 //BA.debugLineNum = 4919;BA.debugLine="End Sub";
return "";
}
public String  _cleanaddressforsave(String _raw) throws Exception{
String _cleaned = "";
 //BA.debugLineNum = 4921;BA.debugLine="Public Sub CleanAddressForSave(Raw As String) As S";
 //BA.debugLineNum = 4922;BA.debugLine="If Raw = \"\" Or Raw = \"No Address\" Then Return \"No";
if ((_raw).equals("") || (_raw).equals("No Address")) { 
if (true) return "No Address";};
 //BA.debugLineNum = 4923;BA.debugLine="Dim cleaned As String = Raw.Replace(\", USA\", \"\").";
_cleaned = _raw.replace(", USA","").replace(" USA","").replace(", US","").replace(" US","").trim();
 //BA.debugLineNum = 4924;BA.debugLine="cleaned = cleaned.Replace(CRLF, \", \").Replace(Chr";
_cleaned = _cleaned.replace(__c.CRLF,", ").replace(BA.ObjectToString(__c.Chr((int) (10))),", ").replace(BA.ObjectToString(__c.Chr((int) (13))),", ");
 //BA.debugLineNum = 4925;BA.debugLine="Do While cleaned.Contains(\"  \")";
while (_cleaned.contains("  ")) {
 //BA.debugLineNum = 4926;BA.debugLine="cleaned = cleaned.Replace(\"  \", \" \")";
_cleaned = _cleaned.replace("  "," ");
 }
;
 //BA.debugLineNum = 4928;BA.debugLine="If cleaned.EndsWith(\",\") Then cleaned = cleaned.S";
if (_cleaned.endsWith(",")) { 
_cleaned = _cleaned.substring((int) (0),(int) (_cleaned.length()-1)).trim();};
 //BA.debugLineNum = 4929;BA.debugLine="Return cleaned";
if (true) return _cleaned;
 //BA.debugLineNum = 4930;BA.debugLine="End Sub";
return "";
}
public void  _closeout_finished(anywheresoftware.b4a.objects.collections.List _container) throws Exception{
ResumableSub_CloseOut_Finished rsub = new ResumableSub_CloseOut_Finished(this,_container);
rsub.resume(ba, null);
}
public static class ResumableSub_CloseOut_Finished extends BA.ResumableSub {
public ResumableSub_CloseOut_Finished(Geek.God.CRM.App.b4xmainpage parent,anywheresoftware.b4a.objects.collections.List _container) {
this.parent = parent;
this._container = _container;
}
Geek.God.CRM.App.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.List _container;
anywheresoftware.b4a.objects.collections.List _ledgerrow = null;
String _cname = "";
String _cphone = "";
String _cissue = "";
String _user = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _msg = null;
anywheresoftware.b4a.phone.Phone.PhoneSms _ps = null;
String _permission = "";
boolean _result = false;
String _senttime = "";
String _popupmsg = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 3369;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 3372;BA.debugLine="btnCloseout.Text = \"No Apt Started\"";
parent._btncloseout.setText(BA.ObjectToCharSequence("No Apt Started"));
 //BA.debugLineNum = 3373;BA.debugLine="btnCloseout.Color = xui.Color_Red";
parent._btncloseout.setColor(parent._xui.Color_Red);
 //BA.debugLineNum = 3374;BA.debugLine="btnCloseout.TextColor = xui.Color_White";
parent._btncloseout.setTextColor(parent._xui.Color_White);
 //BA.debugLineNum = 3375;BA.debugLine="btnCloseout.Enabled = False";
parent._btncloseout.setEnabled(parent.__c.False);
 //BA.debugLineNum = 3377;BA.debugLine="RefreshDashboard";
parent._refreshdashboard();
 //BA.debugLineNum = 3380;BA.debugLine="Dim LedgerRow As List = Container.Get(0)";
_ledgerrow = new anywheresoftware.b4a.objects.collections.List();
_ledgerrow = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_container.Get((int) (0))));
 //BA.debugLineNum = 3381;BA.debugLine="Dim cName As String = LedgerRow.Get(2)";
_cname = BA.ObjectToString(_ledgerrow.Get((int) (2)));
 //BA.debugLineNum = 3382;BA.debugLine="Dim cPhone As String = LedgerRow.Get(4)";
_cphone = BA.ObjectToString(_ledgerrow.Get((int) (4)));
 //BA.debugLineNum = 3383;BA.debugLine="Dim cIssue As String = LedgerRow.Get(5)";
_cissue = BA.ObjectToString(_ledgerrow.Get((int) (5)));
 //BA.debugLineNum = 3384;BA.debugLine="Dim User As String = appSettings.GetDefault(\"Curr";
_user = BA.ObjectToString(parent._appsettings.GetDefault((Object)("CurrentUser"),(Object)("Geek God")));
 //BA.debugLineNum = 3386;BA.debugLine="Dim Msg As StringBuilder : Msg.Initialize";
_msg = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 3386;BA.debugLine="Dim Msg As StringBuilder : Msg.Initialize";
_msg.Initialize();
 //BA.debugLineNum = 3387;BA.debugLine="Msg.Append(cName).Append(Chr(10))";
_msg.Append(_cname).Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3388;BA.debugLine="Msg.Append(\"Thank you for trusting me to handle y";
_msg.Append("Thank you for trusting me to handle your ").Append(_cissue).Append(" issue today and for your generosity.").Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3389;BA.debugLine="Msg.Append(\"Do not hesitate to call again for any";
_msg.Append("Do not hesitate to call again for any of your tech service needs.").Append(BA.ObjectToString(parent.__c.Chr((int) (10)))).Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3390;BA.debugLine="Msg.Append(\"*Side note: Remember if ever you feel";
_msg.Append("*Side note: Remember if ever you feel panicked after receiving a correspondence of any kind especially coming from a major company: Amazon, Ebay, Social Security, IRS... ect").Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3391;BA.debugLine="Msg.Append(\"this is your first clue that you are";
_msg.Append("this is your first clue that you are an attempted victim of a social engineering hack.").Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3392;BA.debugLine="Msg.Append(\"None of these organizations would eve";
_msg.Append("None of these organizations would ever send you correspondence such as that to make you panicked. IF you ever question if something is legit, Don't act! Call us. WE will tell you if it is real or not. This is a free service only a call away because we hate scammers and want to keep our clients and the public in general safe.").Append(BA.ObjectToString(parent.__c.Chr((int) (10)))).Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3393;BA.debugLine="Msg.Append(\"Please please do this for me:\").Appen";
_msg.Append("Please please do this for me:").Append(BA.ObjectToString(parent.__c.Chr((int) (10)))).Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3396;BA.debugLine="If User = \"Erin\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_user).equals("Erin")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 3397;BA.debugLine="Msg.Append(\"https://bit.ly/writenextdoorreviewgo";
_msg.Append("https://bit.ly/writenextdoorreviewgoddess").Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 3399;BA.debugLine="Msg.Append(\"https://bit.ly/writenextdoorreview\")";
_msg.Append("https://bit.ly/writenextdoorreview").Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 3402;BA.debugLine="Msg.Append(\"click this link\").Append(Chr(10)).App";
_msg.Append("click this link").Append(BA.ObjectToString(parent.__c.Chr((int) (10)))).Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3403;BA.debugLine="Msg.Append(\"Toggle me as a Fav on Nextdoor.\").App";
_msg.Append("Toggle me as a Fav on Nextdoor.").Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3404;BA.debugLine="Msg.Append(\"Then click \"\"Recommendations\"\"\").Appe";
_msg.Append("Then click \"Recommendations\"").Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3405;BA.debugLine="Msg.Append(\"Under the heading on that page that s";
_msg.Append("Under the heading on that page that says \"write your recommendation\"").Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3406;BA.debugLine="Msg.Append(\"Please type an honest review of my ti";
_msg.Append("Please type an honest review of my time with you today and the value you felt I brought into your life by fixing your issue.").Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3407;BA.debugLine="Msg.Append(\"It is really important to the continu";
_msg.Append("It is really important to the continued success of my business.").Append(BA.ObjectToString(parent.__c.Chr((int) (10)))).Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3408;BA.debugLine="Msg.Append(\"Please, if you come across anybody wh";
_msg.Append("Please, if you come across anybody who needs my tech services, a referral would be much appreciated. I will offer them the same great service I gave to you.").Append(BA.ObjectToString(parent.__c.Chr((int) (10)))).Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3409;BA.debugLine="Msg.Append(\"Lastly,\").Append(Chr(10))";
_msg.Append("Lastly,").Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3410;BA.debugLine="Msg.Append(\"Last week this same message was sent";
_msg.Append("Last week this same message was sent to at least 40 people and MAYBE 2 people left me a review post on Nextdoor if that and lately my business has been suffering for it.").Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3411;BA.debugLine="Msg.Append(\"Please don't forget to review me, as";
_msg.Append("Please don't forget to review me, as that's where I have been obtaining all of my clients. It's most likely how you found me. This is so important to my continued success.").Append(BA.ObjectToString(parent.__c.Chr((int) (10)))).Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3412;BA.debugLine="Msg.Append(\"Your generous compensation to me toda";
_msg.Append("Your generous compensation to me today will help feed my family tonight however the moment you take to review me on Nextdoor allows for them to keep eating tomorrow.").Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3413;BA.debugLine="Msg.Append(\"Its that important.\").Append(Chr(10))";
_msg.Append("Its that important.").Append(BA.ObjectToString(parent.__c.Chr((int) (10)))).Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3414;BA.debugLine="Msg.Append(\"Thank you again.\").Append(Chr(10))";
_msg.Append("Thank you again.").Append(BA.ObjectToString(parent.__c.Chr((int) (10))));
 //BA.debugLineNum = 3415;BA.debugLine="Msg.Append(User)";
_msg.Append(_user);
 //BA.debugLineNum = 3418;BA.debugLine="Dim ps As PhoneSms";
_ps = new anywheresoftware.b4a.phone.Phone.PhoneSms();
 //BA.debugLineNum = 3421;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_SEND_SMS)";
parent._rp.CheckAndRequest(ba,parent._rp.PERMISSION_SEND_SMS);
 //BA.debugLineNum = 3422;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
parent.__c.WaitFor("activity_permissionresult", ba, this, null);
this.state = 19;
return;
case 19:
//C
this.state = 7;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 3423;BA.debugLine="If Result Then";
if (true) break;

case 7:
//if
this.state = 18;
if (_result) { 
this.state = 9;
}else {
this.state = 17;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 3424;BA.debugLine="Try";
if (true) break;

case 10:
//try
this.state = 15;
this.catchState = 14;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 15;
this.catchState = 14;
 //BA.debugLineNum = 3425;BA.debugLine="ps.Send(cPhone, Msg.ToString)";
_ps.Send(_cphone,_msg.ToString());
 //BA.debugLineNum = 3426;BA.debugLine="Dim SentTime As String = DateTime.Time(DateTime";
_senttime = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 3427;BA.debugLine="Dim PopupMsg As String = \"Appointment follow-up";
_popupmsg = "Appointment follow-up / thank you text sent to "+_cname+" at "+_senttime+" for your completion of "+_cissue;
 //BA.debugLineNum = 3428;BA.debugLine="xui.MsgboxAsync(PopupMsg, \"SMS Sent\")";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence(_popupmsg),BA.ObjectToCharSequence("SMS Sent"));
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 //BA.debugLineNum = 3430;BA.debugLine="xui.MsgboxAsync(\"Job Closed, but SMS Failed: \"";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Job Closed, but SMS Failed: "+BA.ObjectToString(parent.__c.LastException(ba))),BA.ObjectToCharSequence("Partial Success"));
 if (true) break;
if (true) break;

case 15:
//C
this.state = 18;
this.catchState = 0;
;
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 3433;BA.debugLine="xui.MsgboxAsync(\"Job Closed, but SMS Permission";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Job Closed, but SMS Permission Denied."),BA.ObjectToCharSequence("Partial Success"));
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 3435;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _closeout_helper_step1(anywheresoftware.b4a.objects.collections.List _container) throws Exception{
anywheresoftware.b4a.objects.collections.List _ledgerrow = null;
String _cname = "";
String _cphone = "";
Geek.God.CRM.App.httpjob _job = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
String _finalurl = "";
 //BA.debugLineNum = 3233;BA.debugLine="Private Sub CloseOut_Helper_Step1(Container As Lis";
 //BA.debugLineNum = 3234;BA.debugLine="Dim LedgerRow As List = Container.Get(0)";
_ledgerrow = new anywheresoftware.b4a.objects.collections.List();
_ledgerrow = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_container.Get((int) (0))));
 //BA.debugLineNum = 3236;BA.debugLine="Dim cName As String = LedgerRow.Get(2)";
_cname = BA.ObjectToString(_ledgerrow.Get((int) (2)));
 //BA.debugLineNum = 3237;BA.debugLine="Dim cPhone As String = LedgerRow.Get(4)";
_cphone = BA.ObjectToString(_ledgerrow.Get((int) (4)));
 //BA.debugLineNum = 3239;BA.debugLine="Log(\"Step 1: Searching for Contact ID for \" & cNa";
__c.LogImpl("016056326","Step 1: Searching for Contact ID for "+_cname,0);
 //BA.debugLineNum = 3240;BA.debugLine="Dim job As HttpJob : job.Initialize(\"SearchContac";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 3240;BA.debugLine="Dim job As HttpJob : job.Initialize(\"SearchContac";
_job._initialize /*String*/ (ba,"SearchContactForID",this);
 //BA.debugLineNum = 3241;BA.debugLine="job.Tag = Container";
_job._tag /*Object*/  = (Object)(_container.getObject());
 //BA.debugLineNum = 3242;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 3243;BA.debugLine="Dim FinalURL As String = \"https://people.googleap";
_finalurl = "https://people.googleapis.com/v1/people:searchContacts?query="+_su.EncodeUrl(_cphone,"UTF8")+"&readMask=names,phoneNumbers,metadata";
 //BA.debugLineNum = 3244;BA.debugLine="job.Download(FinalURL)";
_job._download /*String*/ (_finalurl);
 //BA.debugLineNum = 3245;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 3246;BA.debugLine="End Sub";
return "";
}
public String  _closeout_helper_step2(anywheresoftware.b4a.objects.collections.List _container,String _resourcename,String _etag) throws Exception{
String _newnotes = "";
String _newgrouplabel = "";
String _timestamp = "";
String _finalnote = "";
String _targetgroupid = "";
anywheresoftware.b4a.objects.collections.Map _personmap = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 3275;BA.debugLine="Private Sub CloseOut_Helper_Step2(Container As Lis";
 //BA.debugLineNum = 3276;BA.debugLine="Dim NewNotes As String = Container.Get(1)";
_newnotes = BA.ObjectToString(_container.Get((int) (1)));
 //BA.debugLineNum = 3277;BA.debugLine="Dim NewGroupLabel As String = Container.Get(3)";
_newgrouplabel = BA.ObjectToString(_container.Get((int) (3)));
 //BA.debugLineNum = 3280;BA.debugLine="DateTime.DateFormat = \"MM/dd/yyyy h:mm a\"";
__c.DateTime.setDateFormat("MM/dd/yyyy h:mm a");
 //BA.debugLineNum = 3281;BA.debugLine="Dim TimeStamp As String = DateTime.Date(DateTime.";
_timestamp = __c.DateTime.Date(__c.DateTime.getNow());
 //BA.debugLineNum = 3282;BA.debugLine="Dim FinalNote As String = \"VISIT \" & TimeStamp &";
_finalnote = "VISIT "+_timestamp+":"+__c.CRLF+_newnotes+__c.CRLF+"----------------";
 //BA.debugLineNum = 3284;BA.debugLine="Dim TargetGroupID As String = Starter.GroupID_Cli";
_targetgroupid = BA.NumberToString(_starter._groupid_client /*long*/ );
 //BA.debugLineNum = 3285;BA.debugLine="If NewGroupLabel = \"Blacklisted\" Then TargetGroup";
if ((_newgrouplabel).equals("Blacklisted")) { 
_targetgroupid = BA.NumberToString(_starter._groupid_blacklisted /*long*/ );};
 //BA.debugLineNum = 3286;BA.debugLine="If NewGroupLabel = \"Preferred\" Then TargetGroupID";
if ((_newgrouplabel).equals("Preferred")) { 
_targetgroupid = BA.NumberToString(_starter._groupid_preferred /*long*/ );};
 //BA.debugLineNum = 3288;BA.debugLine="Dim personMap As Map : personMap.Initialize";
_personmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 3288;BA.debugLine="Dim personMap As Map : personMap.Initialize";
_personmap.Initialize();
 //BA.debugLineNum = 3289;BA.debugLine="personMap.Put(\"etag\", Etag)";
_personmap.Put((Object)("etag"),(Object)(_etag));
 //BA.debugLineNum = 3290;BA.debugLine="personMap.Put(\"biographies\", Array(CreateMap(\"val";
_personmap.Put((Object)("biographies"),(Object)(new Object[]{(Object)(__c.createMap(new Object[] {(Object)("value"),(Object)(_finalnote),(Object)("contentType"),(Object)("TEXT_PLAIN")}).getObject())}));
 //BA.debugLineNum = 3291;BA.debugLine="personMap.Put(\"memberships\", Array(CreateMap(\"con";
_personmap.Put((Object)("memberships"),(Object)(new Object[]{(Object)(__c.createMap(new Object[] {(Object)("contactGroupMembership"),(Object)(__c.createMap(new Object[] {(Object)("contactGroupResourceName"),(Object)(_targetgroupid)}).getObject())}).getObject())}));
 //BA.debugLineNum = 3293;BA.debugLine="Dim json As JSONGenerator : json.Initialize(perso";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 3293;BA.debugLine="Dim json As JSONGenerator : json.Initialize(perso";
_json.Initialize(_personmap);
 //BA.debugLineNum = 3294;BA.debugLine="Dim job As HttpJob : job.Initialize(\"UpdateContac";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 3294;BA.debugLine="Dim job As HttpJob : job.Initialize(\"UpdateContac";
_job._initialize /*String*/ (ba,"UpdateContactAfterClose",this);
 //BA.debugLineNum = 3295;BA.debugLine="job.Tag = Container";
_job._tag /*Object*/  = (Object)(_container.getObject());
 //BA.debugLineNum = 3296;BA.debugLine="job.PatchString(\"https://people.googleapis.com/v1";
_job._patchstring /*String*/ ("https://people.googleapis.com/v1/"+_resourcename+":updateContact?updatePersonFields=biographies,memberships",_json.ToString());
 //BA.debugLineNum = 3297;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 3298;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 3299;BA.debugLine="End Sub";
return "";
}
public String  _closeout_helper_step3(anywheresoftware.b4a.objects.collections.List _container) throws Exception{
String _apptid = "";
anywheresoftware.b4a.objects.collections.List _ledgerrow = null;
String _originalissue = "";
String _sfee = "";
String _stime = "";
String _notes = "";
String _newdesc = "";
anywheresoftware.b4a.objects.collections.Map _patchmap = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 3302;BA.debugLine="Private Sub CloseOut_Helper_Step3(Container As Lis";
 //BA.debugLineNum = 3303;BA.debugLine="Dim ApptID As String = Container.Get(2)";
_apptid = BA.ObjectToString(_container.Get((int) (2)));
 //BA.debugLineNum = 3305;BA.debugLine="If ApptID = \"\" Then";
if ((_apptid).equals("")) { 
 //BA.debugLineNum = 3306;BA.debugLine="Log(\"WARNING: No Appt ID. Skipping Calendar Upda";
__c.LogImpl("016252932","WARNING: No Appt ID. Skipping Calendar Update.",0);
 //BA.debugLineNum = 3307;BA.debugLine="CloseOut_Helper_Step4(Container)";
_closeout_helper_step4(_container);
 //BA.debugLineNum = 3308;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3312;BA.debugLine="Dim LedgerRow As List = Container.Get(0)";
_ledgerrow = new anywheresoftware.b4a.objects.collections.List();
_ledgerrow = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_container.Get((int) (0))));
 //BA.debugLineNum = 3313;BA.debugLine="Dim OriginalIssue As String = LedgerRow.Get(5)";
_originalissue = BA.ObjectToString(_ledgerrow.Get((int) (5)));
 //BA.debugLineNum = 3314;BA.debugLine="Dim sFee As String = LedgerRow.Get(7)";
_sfee = BA.ObjectToString(_ledgerrow.Get((int) (7)));
 //BA.debugLineNum = 3315;BA.debugLine="Dim sTime As String = LedgerRow.Get(8)";
_stime = BA.ObjectToString(_ledgerrow.Get((int) (8)));
 //BA.debugLineNum = 3318;BA.debugLine="Dim Notes As String = Container.Get(1)";
_notes = BA.ObjectToString(_container.Get((int) (1)));
 //BA.debugLineNum = 3319;BA.debugLine="Dim NewDesc As String = \"Issue: \" & OriginalIssue";
_newdesc = "Issue: "+_originalissue+__c.CRLF+"Resolution: "+_notes+__c.CRLF+"Fee: "+_sfee+" | Time: "+_stime;
 //BA.debugLineNum = 3321;BA.debugLine="Dim patchMap As Map = CreateMap(\"colorId\": \"8\", \"";
_patchmap = new anywheresoftware.b4a.objects.collections.Map();
_patchmap = __c.createMap(new Object[] {(Object)("colorId"),(Object)("8"),(Object)("description"),(Object)(_newdesc)});
 //BA.debugLineNum = 3322;BA.debugLine="Dim json As JSONGenerator : json.Initialize(patch";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 3322;BA.debugLine="Dim json As JSONGenerator : json.Initialize(patch";
_json.Initialize(_patchmap);
 //BA.debugLineNum = 3324;BA.debugLine="Dim job As HttpJob : job.Initialize(\"UpdateCalend";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 3324;BA.debugLine="Dim job As HttpJob : job.Initialize(\"UpdateCalend";
_job._initialize /*String*/ (ba,"UpdateCalendarColor",this);
 //BA.debugLineNum = 3325;BA.debugLine="job.Tag = Container";
_job._tag /*Object*/  = (Object)(_container.getObject());
 //BA.debugLineNum = 3326;BA.debugLine="job.PatchString(\"https://www.googleapis.com/calen";
_job._patchstring /*String*/ ("https://www.googleapis.com/calendar/v3/calendars/primary/events/"+_apptid,_json.ToString());
 //BA.debugLineNum = 3327;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 3328;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 3329;BA.debugLine="End Sub";
return "";
}
public String  _closeout_helper_step4(anywheresoftware.b4a.objects.collections.List _container) throws Exception{
anywheresoftware.b4a.objects.collections.List _datarow = null;
String _datestr = "";
String _monthname = "";
String _yearshort = "";
String _sheettabname = "";
String _range = "";
anywheresoftware.b4a.objects.collections.Map _valuerange = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 3332;BA.debugLine="Private Sub CloseOut_Helper_Step4(Container As Lis";
 //BA.debugLineNum = 3333;BA.debugLine="Dim DataRow As List = Container.Get(0)";
_datarow = new anywheresoftware.b4a.objects.collections.List();
_datarow = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_container.Get((int) (0))));
 //BA.debugLineNum = 3335;BA.debugLine="Dim DateStr As String = DataRow.Get(1)";
_datestr = BA.ObjectToString(_datarow.Get((int) (1)));
 //BA.debugLineNum = 3336;BA.debugLine="Dim MonthName As String = GetMonthAbbr(DateStr)";
_monthname = _getmonthabbr(_datestr);
 //BA.debugLineNum = 3337;BA.debugLine="Dim YearShort As String = DateStr.SubString(8)";
_yearshort = _datestr.substring((int) (8));
 //BA.debugLineNum = 3338;BA.debugLine="Dim SheetTabName As String = MonthName & \" \" & Ye";
_sheettabname = _monthname+" "+_yearshort;
 //BA.debugLineNum = 3340;BA.debugLine="Dim Range As String = SheetTabName & \"!A:G\" ' Ens";
_range = _sheettabname+"!A:G";
 //BA.debugLineNum = 3341;BA.debugLine="Dim ValueRange As Map = CreateMap(\"values\": Array";
_valuerange = new anywheresoftware.b4a.objects.collections.Map();
_valuerange = __c.createMap(new Object[] {(Object)("values"),(Object)(new Object[]{(Object)(_datarow.getObject())})});
 //BA.debugLineNum = 3342;BA.debugLine="Dim json As JSONGenerator : json.Initialize(Value";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 3342;BA.debugLine="Dim json As JSONGenerator : json.Initialize(Value";
_json.Initialize(_valuerange);
 //BA.debugLineNum = 3344;BA.debugLine="Dim job As HttpJob : job.Initialize(\"AppendToLedg";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 3344;BA.debugLine="Dim job As HttpJob : job.Initialize(\"AppendToLedg";
_job._initialize /*String*/ (ba,"AppendToLedger",this);
 //BA.debugLineNum = 3345;BA.debugLine="job.Tag = Container";
_job._tag /*Object*/  = (Object)(_container.getObject());
 //BA.debugLineNum = 3347;BA.debugLine="If CurrentLedgerID = \"\" Then";
if ((_currentledgerid).equals("")) { 
 //BA.debugLineNum = 3348;BA.debugLine="If File.Exists(File.DirInternal, \"ledger_id_2026";
if (__c.File.Exists(__c.File.getDirInternal(),"ledger_id_2026.txt")) { 
 //BA.debugLineNum = 3349;BA.debugLine="CurrentLedgerID = File.ReadString(File.DirInter";
_currentledgerid = __c.File.ReadString(__c.File.getDirInternal(),"ledger_id_2026.txt");
 };
 };
 //BA.debugLineNum = 3353;BA.debugLine="If CurrentLedgerID = \"\" Then";
if ((_currentledgerid).equals("")) { 
 //BA.debugLineNum = 3354;BA.debugLine="Log(\">>> [CLOSEOUT-LEDGER] Error: CurrentLedgerI";
__c.LogImpl("016318486",">>> [CLOSEOUT-LEDGER] Error: CurrentLedgerID is missing.",0);
 //BA.debugLineNum = 3355;BA.debugLine="CloseOut_Finished(Container)";
_closeout_finished(_container);
 //BA.debugLineNum = 3356;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3359;BA.debugLine="Log(\">>> [CLOSEOUT-LEDGER] Appending to Ledger ID";
__c.LogImpl("016318491",">>> [CLOSEOUT-LEDGER] Appending to Ledger ID: "+_currentledgerid,0);
 //BA.debugLineNum = 3360;BA.debugLine="Log(\">>> [CLOSEOUT-LEDGER] Target Range: \" & Rang";
__c.LogImpl("016318492",">>> [CLOSEOUT-LEDGER] Target Range: "+_range,0);
 //BA.debugLineNum = 3362;BA.debugLine="job.PostString(\"https://sheets.googleapis.com/v4/";
_job._poststring /*String*/ ("https://sheets.googleapis.com/v4/spreadsheets/"+_currentledgerid+"/values/"+_range+":append?valueInputOption=USER_ENTERED",_json.ToString());
 //BA.debugLineNum = 3363;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 3364;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 3365;BA.debugLine="End Sub";
return "";
}
public String  _compactstatspanel(int _pnlw) throws Exception{
int _rowh = 0;
int _topy = 0;
int _gap = 0;
int _labelwidth = 0;
int _valueleft = 0;
int _valuewidth = 0;
 //BA.debugLineNum = 1283;BA.debugLine="Private Sub CompactStatsPanel(PnlW As Int)";
 //BA.debugLineNum = 1284;BA.debugLine="Dim RowH As Int = 28dip : Dim TopY As Int = 5dip";
_rowh = __c.DipToCurrent((int) (28));
 //BA.debugLineNum = 1284;BA.debugLine="Dim RowH As Int = 28dip : Dim TopY As Int = 5dip";
_topy = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 1284;BA.debugLine="Dim RowH As Int = 28dip : Dim TopY As Int = 5dip";
_gap = __c.DipToCurrent((int) (4));
 //BA.debugLineNum = 1285;BA.debugLine="Dim LabelWidth As Int = PnlW * 0.70";
_labelwidth = (int) (_pnlw*0.70);
 //BA.debugLineNum = 1286;BA.debugLine="Dim ValueLeft As Int = PnlW * 0.55";
_valueleft = (int) (_pnlw*0.55);
 //BA.debugLineNum = 1287;BA.debugLine="Dim ValueWidth As Int = PnlW - ValueLeft - 5dip";
_valuewidth = (int) (_pnlw-_valueleft-__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 1288;BA.debugLine="lblTotalAptsGod.SetLayoutAnimated(0, 5dip, TopY,";
_lbltotalaptsgod.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),_topy,_labelwidth,_rowh);
 //BA.debugLineNum = 1289;BA.debugLine="lblTotalAptsGod.TextSize = 12";
_lbltotalaptsgod.setTextSize((float) (12));
 //BA.debugLineNum = 1290;BA.debugLine="lblTotalAptsGod.Color = xui.Color_Transparent";
_lbltotalaptsgod.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 1291;BA.debugLine="lblTotalAptsGod.As(Label).SingleLine = True";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lbltotalaptsgod.getObject()))).setSingleLine(__c.True);
 //BA.debugLineNum = 1292;BA.debugLine="lblAppsGodNum.SetLayoutAnimated(0, ValueLeft, Top";
_lblappsgodnum.SetLayoutAnimated((int) (0),_valueleft,_topy,_valuewidth,_rowh);
 //BA.debugLineNum = 1293;BA.debugLine="lblAppsGodNum.TextSize = 12";
_lblappsgodnum.setTextSize((float) (12));
 //BA.debugLineNum = 1294;BA.debugLine="lblAppsGodNum.As(Label).Gravity = Gravity.CENTER_";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lblappsgodnum.getObject()))).setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.RIGHT));
 //BA.debugLineNum = 1295;BA.debugLine="lblAppsGodNum.As(Label).SingleLine = True";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lblappsgodnum.getObject()))).setSingleLine(__c.True);
 //BA.debugLineNum = 1296;BA.debugLine="TopY = TopY + RowH + Gap";
_topy = (int) (_topy+_rowh+_gap);
 //BA.debugLineNum = 1297;BA.debugLine="If lblTotalAptsGoddess.IsInitialized Then";
if (_lbltotalaptsgoddess.IsInitialized()) { 
 //BA.debugLineNum = 1298;BA.debugLine="lblTotalAptsGoddess.SetLayoutAnimated(0, 5dip, T";
_lbltotalaptsgoddess.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),_topy,_labelwidth,_rowh);
 //BA.debugLineNum = 1299;BA.debugLine="lblTotalAptsGoddess.TextSize = 12";
_lbltotalaptsgoddess.setTextSize((float) (12));
 //BA.debugLineNum = 1300;BA.debugLine="lblTotalAptsGoddess.Color = xui.Color_Transparen";
_lbltotalaptsgoddess.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 1301;BA.debugLine="lblTotalAptsGoddess.SingleLine = True";
_lbltotalaptsgoddess.setSingleLine(__c.True);
 //BA.debugLineNum = 1302;BA.debugLine="lblAppsGoddessNum.SetLayoutAnimated(0, ValueLeft";
_lblappsgoddessnum.SetLayoutAnimated((int) (0),_valueleft,_topy,_valuewidth,_rowh);
 //BA.debugLineNum = 1303;BA.debugLine="lblAppsGoddessNum.TextSize = 12";
_lblappsgoddessnum.setTextSize((float) (12));
 //BA.debugLineNum = 1304;BA.debugLine="lblAppsGoddessNum.Gravity = Gravity.CENTER_VERTI";
_lblappsgoddessnum.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.RIGHT));
 //BA.debugLineNum = 1305;BA.debugLine="lblAppsGoddessNum.SingleLine = True";
_lblappsgoddessnum.setSingleLine(__c.True);
 //BA.debugLineNum = 1306;BA.debugLine="TopY = TopY + RowH + Gap";
_topy = (int) (_topy+_rowh+_gap);
 };
 //BA.debugLineNum = 1308;BA.debugLine="If lblGodCollected.IsInitialized Then";
if (_lblgodcollected.IsInitialized()) { 
 //BA.debugLineNum = 1309;BA.debugLine="lblGodCollected.SetLayoutAnimated(0, 5dip, TopY,";
_lblgodcollected.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),_topy,_labelwidth,_rowh);
 //BA.debugLineNum = 1310;BA.debugLine="lblGodCollected.TextSize = 12";
_lblgodcollected.setTextSize((float) (12));
 //BA.debugLineNum = 1311;BA.debugLine="lblGodCollected.Color = xui.Color_Transparent";
_lblgodcollected.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 1312;BA.debugLine="lblGodCollected.SingleLine = True";
_lblgodcollected.setSingleLine(__c.True);
 //BA.debugLineNum = 1313;BA.debugLine="lblGodCollectedNum.SetLayoutAnimated(0, ValueLef";
_lblgodcollectednum.SetLayoutAnimated((int) (0),_valueleft,_topy,_valuewidth,_rowh);
 //BA.debugLineNum = 1314;BA.debugLine="lblGodCollectedNum.TextSize = 12";
_lblgodcollectednum.setTextSize((float) (12));
 //BA.debugLineNum = 1315;BA.debugLine="lblGodCollectedNum.As(Label).Gravity = Gravity.C";
(_lblgodcollectednum).setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.RIGHT));
 //BA.debugLineNum = 1316;BA.debugLine="lblGodCollectedNum.As(Label).SingleLine = True";
(_lblgodcollectednum).setSingleLine(__c.True);
 //BA.debugLineNum = 1317;BA.debugLine="TopY = TopY + RowH + Gap";
_topy = (int) (_topy+_rowh+_gap);
 };
 //BA.debugLineNum = 1319;BA.debugLine="If lblGoddessCollected.IsInitialized Then";
if (_lblgoddesscollected.IsInitialized()) { 
 //BA.debugLineNum = 1320;BA.debugLine="lblGoddessCollected.SetLayoutAnimated(0, 5dip, T";
_lblgoddesscollected.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),_topy,_labelwidth,_rowh);
 //BA.debugLineNum = 1321;BA.debugLine="lblGoddessCollected.TextSize = 12";
_lblgoddesscollected.setTextSize((float) (12));
 //BA.debugLineNum = 1322;BA.debugLine="lblGoddessCollected.Color = xui.Color_Transparen";
_lblgoddesscollected.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 1323;BA.debugLine="lblGoddessCollected.SingleLine = True";
_lblgoddesscollected.setSingleLine(__c.True);
 //BA.debugLineNum = 1324;BA.debugLine="lblGoddessCollectedNum.SetLayoutAnimated(0, Valu";
_lblgoddesscollectednum.SetLayoutAnimated((int) (0),_valueleft,_topy,_valuewidth,_rowh);
 //BA.debugLineNum = 1325;BA.debugLine="lblGoddessCollectedNum.TextSize = 12";
_lblgoddesscollectednum.setTextSize((float) (12));
 //BA.debugLineNum = 1326;BA.debugLine="lblGoddessCollectedNum.As(Label).Gravity = Gravi";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lblgoddesscollectednum.getObject()))).setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.RIGHT));
 //BA.debugLineNum = 1327;BA.debugLine="lblGoddessCollectedNum.As(Label).SingleLine = Tr";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lblgoddesscollectednum.getObject()))).setSingleLine(__c.True);
 //BA.debugLineNum = 1328;BA.debugLine="TopY = TopY + RowH + Gap";
_topy = (int) (_topy+_rowh+_gap);
 };
 //BA.debugLineNum = 1330;BA.debugLine="lblTotalCollected.SetLayoutAnimated(0, 5dip, TopY";
_lbltotalcollected.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),_topy,_labelwidth,_rowh);
 //BA.debugLineNum = 1331;BA.debugLine="lblTotalCollected.TextSize = 12";
_lbltotalcollected.setTextSize((float) (12));
 //BA.debugLineNum = 1332;BA.debugLine="lblTotalCollected.Color = xui.Color_Transparent";
_lbltotalcollected.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 1333;BA.debugLine="lblTotalCollected.As(Label).SingleLine = True";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lbltotalcollected.getObject()))).setSingleLine(__c.True);
 //BA.debugLineNum = 1334;BA.debugLine="lblTotalCollectedNum.SetLayoutAnimated(0, ValueLe";
_lbltotalcollectednum.SetLayoutAnimated((int) (0),_valueleft,_topy,_valuewidth,_rowh);
 //BA.debugLineNum = 1335;BA.debugLine="lblTotalCollectedNum.TextSize = 12";
_lbltotalcollectednum.setTextSize((float) (12));
 //BA.debugLineNum = 1336;BA.debugLine="lblTotalCollectedNum.As(Label).Gravity = Gravity.";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lbltotalcollectednum.getObject()))).setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.RIGHT));
 //BA.debugLineNum = 1337;BA.debugLine="lblTotalCollectedNum.As(Label).SingleLine = True";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lbltotalcollectednum.getObject()))).setSingleLine(__c.True);
 //BA.debugLineNum = 1338;BA.debugLine="End Sub";
return "";
}
public String  _copytemplate(String _sourceid,int _sourcegid,String _destid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 4136;BA.debugLine="Public Sub CopyTemplate(sourceID As String, source";
 //BA.debugLineNum = 4137;BA.debugLine="Dim m As Map = CreateMap(\"destinationSpreadsheetI";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("destinationSpreadsheetId"),(Object)(_destid)});
 //BA.debugLineNum = 4138;BA.debugLine="Dim json As JSONGenerator : json.Initialize(m)";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 4138;BA.debugLine="Dim json As JSONGenerator : json.Initialize(m)";
_json.Initialize(_m);
 //BA.debugLineNum = 4140;BA.debugLine="Dim job As HttpJob : job.Initialize(\"CopyTemplate";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 4140;BA.debugLine="Dim job As HttpJob : job.Initialize(\"CopyTemplate";
_job._initialize /*String*/ (ba,"CopyTemplate",this);
 //BA.debugLineNum = 4141;BA.debugLine="job.Tag = destID";
_job._tag /*Object*/  = (Object)(_destid);
 //BA.debugLineNum = 4142;BA.debugLine="job.PostString(\"https://sheets.googleapis.com/v4/";
_job._poststring /*String*/ ("https://sheets.googleapis.com/v4/spreadsheets/"+_sourceid+"/sheets/"+BA.NumberToString(_sourcegid)+":copyTo",_json.ToString());
 //BA.debugLineNum = 4143;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 4144;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 4145;BA.debugLine="End Sub";
return "";
}
public String  _createcontactgroup(String _groupname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 2318;BA.debugLine="Sub CreateContactGroup(GroupName As String)";
 //BA.debugLineNum = 2319;BA.debugLine="Dim m As Map = CreateMap(\"contactGroup\": CreateMa";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("contactGroup"),(Object)(__c.createMap(new Object[] {(Object)("name"),(Object)(_groupname)}).getObject())});
 //BA.debugLineNum = 2320;BA.debugLine="Dim json As JSONGenerator : json.Initialize(m)";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 2320;BA.debugLine="Dim json As JSONGenerator : json.Initialize(m)";
_json.Initialize(_m);
 //BA.debugLineNum = 2322;BA.debugLine="Dim job As HttpJob : job.Initialize(\"CreateGroup\"";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 2322;BA.debugLine="Dim job As HttpJob : job.Initialize(\"CreateGroup\"";
_job._initialize /*String*/ (ba,"CreateGroup",this);
 //BA.debugLineNum = 2323;BA.debugLine="job.PostString(\"https://people.googleapis.com/v1/";
_job._poststring /*String*/ ("https://people.googleapis.com/v1/contactGroups",_json.ToString());
 //BA.debugLineNum = 2324;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 2325;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 2326;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.EditTextWrapper  _createedittext(String _hint) throws Exception{
anywheresoftware.b4a.objects.EditTextWrapper _e = null;
 //BA.debugLineNum = 3184;BA.debugLine="Private Sub CreateEditText(Hint As String) As Edit";
 //BA.debugLineNum = 3185;BA.debugLine="Dim e As EditText : e.Initialize(\"\")";
_e = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 3185;BA.debugLine="Dim e As EditText : e.Initialize(\"\")";
_e.Initialize(ba,"");
 //BA.debugLineNum = 3186;BA.debugLine="e.Hint = Hint";
_e.setHint(_hint);
 //BA.debugLineNum = 3187;BA.debugLine="e.TextColor = xui.Color_Black";
_e.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 3188;BA.debugLine="e.HintColor = xui.Color_Gray";
_e.setHintColor(_xui.Color_Gray);
 //BA.debugLineNum = 3189;BA.debugLine="e.Color = xui.Color_White";
_e.setColor(_xui.Color_White);
 //BA.debugLineNum = 3190;BA.debugLine="e.InputType = e.INPUT_TYPE_TEXT";
_e.setInputType(_e.INPUT_TYPE_TEXT);
 //BA.debugLineNum = 3191;BA.debugLine="Return e";
if (true) return _e;
 //BA.debugLineNum = 3192;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createholidaybannerpanel(int _parentwidth) throws Exception{
int _bannerheight = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pbanner = null;
anywheresoftware.b4a.objects.LabelWrapper _lblbanner = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbanner = null;
 //BA.debugLineNum = 825;BA.debugLine="Private Sub CreateHolidayBannerPanel(ParentWidth A";
 //BA.debugLineNum = 826;BA.debugLine="If HolidayBanner.IsInitialized = False Or Holiday";
if (_holidaybanner.IsInitialized()==__c.False || _holidaybanner.getSize()==0) { 
 //BA.debugLineNum = 827;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null));
 };
 //BA.debugLineNum = 830;BA.debugLine="Dim BannerHeight As Int = 50dip";
_bannerheight = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 831;BA.debugLine="Dim pBanner As B4XView = xui.CreatePanel(\"\")";
_pbanner = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pbanner = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 832;BA.debugLine="pBanner.SetLayoutAnimated(0, 0, 0, ParentWidth, B";
_pbanner.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_parentwidth,_bannerheight);
 //BA.debugLineNum = 833;BA.debugLine="pBanner.Color = HolidayBanner.Get(\"BgColor\")";
_pbanner.setColor((int)(BA.ObjectToNumber(_holidaybanner.Get((Object)("BgColor")))));
 //BA.debugLineNum = 835;BA.debugLine="Dim lblBanner As Label : lblBanner.Initialize(\"\")";
_lblbanner = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 835;BA.debugLine="Dim lblBanner As Label : lblBanner.Initialize(\"\")";
_lblbanner.Initialize(ba,"");
 //BA.debugLineNum = 836;BA.debugLine="Dim xBanner As B4XView = lblBanner";
_xbanner = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbanner = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblbanner.getObject()));
 //BA.debugLineNum = 837;BA.debugLine="xBanner.Text = HolidayBanner.Get(\"Text\")";
_xbanner.setText(BA.ObjectToCharSequence(_holidaybanner.Get((Object)("Text"))));
 //BA.debugLineNum = 838;BA.debugLine="xBanner.TextColor = HolidayBanner.Get(\"TxtColor\")";
_xbanner.setTextColor((int)(BA.ObjectToNumber(_holidaybanner.Get((Object)("TxtColor")))));
 //BA.debugLineNum = 839;BA.debugLine="xBanner.TextSize = 18";
_xbanner.setTextSize((float) (18));
 //BA.debugLineNum = 840;BA.debugLine="lblBanner.Typeface = Typeface.DEFAULT_BOLD";
_lblbanner.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 841;BA.debugLine="lblBanner.Gravity = Gravity.CENTER";
_lblbanner.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 842;BA.debugLine="pBanner.AddView(xBanner, 0, 0, ParentWidth, Banne";
_pbanner.AddView((android.view.View)(_xbanner.getObject()),(int) (0),(int) (0),_parentwidth,_bannerheight);
 //BA.debugLineNum = 844;BA.debugLine="Return pBanner";
if (true) return _pbanner;
 //BA.debugLineNum = 845;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.LabelWrapper  _createlabel(String _txt) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _l = null;
 //BA.debugLineNum = 3176;BA.debugLine="Private Sub CreateLabel(Txt As String) As Label";
 //BA.debugLineNum = 3177;BA.debugLine="Dim l As Label : l.Initialize(\"\")";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3177;BA.debugLine="Dim l As Label : l.Initialize(\"\")";
_l.Initialize(ba,"");
 //BA.debugLineNum = 3178;BA.debugLine="l.Text = Txt";
_l.setText(BA.ObjectToCharSequence(_txt));
 //BA.debugLineNum = 3179;BA.debugLine="l.TextColor = xui.Color_Black";
_l.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 3180;BA.debugLine="l.TextSize = 16";
_l.setTextSize((float) (16));
 //BA.debugLineNum = 3181;BA.debugLine="Return l";
if (true) return _l;
 //BA.debugLineNum = 3182;BA.debugLine="End Sub";
return null;
}
public String  _createnewcontact(anywheresoftware.b4a.objects.collections.Map _clientmap) throws Exception{
String _cname = "";
String _cphone = "";
String _caddr = "";
String _cnotes = "";
String _cgroup = "";
String _targetgroupid = "";
anywheresoftware.b4a.objects.collections.List _memberships = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 4577;BA.debugLine="Public Sub CreateNewContact(ClientMap As Map)";
 //BA.debugLineNum = 4578;BA.debugLine="If OAuth2.access_token = \"\" Then";
if ((_oauth2._access_token /*String*/ ).equals("")) { 
 //BA.debugLineNum = 4579;BA.debugLine="xui.MsgboxAsync(\"Not connected to Google. Please";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Not connected to Google. Please login first."),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 4580;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4583;BA.debugLine="Dim cName As String = ClientMap.GetDefault(\"Name\"";
_cname = BA.ObjectToString(_clientmap.GetDefault((Object)("Name"),(Object)("Unknown")));
 //BA.debugLineNum = 4584;BA.debugLine="Dim cPhone As String = ClientMap.GetDefault(\"Phon";
_cphone = BA.ObjectToString(_clientmap.GetDefault((Object)("Phone"),(Object)("")));
 //BA.debugLineNum = 4585;BA.debugLine="Dim cAddr As String = ClientMap.GetDefault(\"Addre";
_caddr = BA.ObjectToString(_clientmap.GetDefault((Object)("Address"),(Object)("")));
 //BA.debugLineNum = 4586;BA.debugLine="Dim cNotes As String = ClientMap.GetDefault(\"Note";
_cnotes = BA.ObjectToString(_clientmap.GetDefault((Object)("Notes"),(Object)("")));
 //BA.debugLineNum = 4587;BA.debugLine="Dim cGroup As String = ClientMap.GetDefault(\"Grou";
_cgroup = BA.ObjectToString(_clientmap.GetDefault((Object)("GroupLabel"),(Object)("Client")));
 //BA.debugLineNum = 4589;BA.debugLine="xui.MsgboxAsync(\"Saving \" & cName & \" to Google C";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Saving "+_cname+" to Google Contacts..."),BA.ObjectToCharSequence("Processing"));
 //BA.debugLineNum = 4591;BA.debugLine="Dim TargetGroupID As String = Starter.GroupID_Cli";
_targetgroupid = BA.NumberToString(_starter._groupid_client /*long*/ );
 //BA.debugLineNum = 4592;BA.debugLine="If cGroup = \"Blacklisted\" Then TargetGroupID = St";
if ((_cgroup).equals("Blacklisted")) { 
_targetgroupid = BA.NumberToString(_starter._groupid_blacklisted /*long*/ );};
 //BA.debugLineNum = 4593;BA.debugLine="If cGroup = \"Preferred\" Then TargetGroupID = Star";
if ((_cgroup).equals("Preferred")) { 
_targetgroupid = BA.NumberToString(_starter._groupid_preferred /*long*/ );};
 //BA.debugLineNum = 4595;BA.debugLine="Dim memberships As List : memberships.Initialize";
_memberships = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4595;BA.debugLine="Dim memberships As List : memberships.Initialize";
_memberships.Initialize();
 //BA.debugLineNum = 4596;BA.debugLine="memberships.Add(CreateMap(\"contactGroupMembership";
_memberships.Add((Object)(__c.createMap(new Object[] {(Object)("contactGroupMembership"),(Object)(__c.createMap(new Object[] {(Object)("contactGroupResourceName"),(Object)("contactGroups/myContacts")}).getObject())}).getObject()));
 //BA.debugLineNum = 4598;BA.debugLine="If TargetGroupID <> \"\" Then";
if ((_targetgroupid).equals("") == false) { 
 //BA.debugLineNum = 4599;BA.debugLine="memberships.Add(CreateMap(\"contactGroupMembershi";
_memberships.Add((Object)(__c.createMap(new Object[] {(Object)("contactGroupMembership"),(Object)(__c.createMap(new Object[] {(Object)("contactGroupResourceName"),(Object)(_targetgroupid)}).getObject())}).getObject()));
 };
 //BA.debugLineNum = 4602;BA.debugLine="Dim m As Map = CreateMap( _ 		\"names\": Array(Crea";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("names"),(Object)(new Object[]{(Object)(__c.createMap(new Object[] {(Object)("givenName"),(Object)(_cname)}).getObject())}),(Object)("phoneNumbers"),(Object)(new Object[]{(Object)(__c.createMap(new Object[] {(Object)("value"),(Object)(_cphone),(Object)("type"),(Object)("mobile")}).getObject())}),(Object)("addresses"),(Object)(new Object[]{(Object)(__c.createMap(new Object[] {(Object)("streetAddress"),(Object)(_caddr),(Object)("type"),(Object)("home")}).getObject())}),(Object)("biographies"),(Object)(new Object[]{(Object)(__c.createMap(new Object[] {(Object)("value"),(Object)(_cnotes),(Object)("contentType"),(Object)("TEXT_PLAIN")}).getObject())}),(Object)("memberships"),(Object)(_memberships.getObject())});
 //BA.debugLineNum = 4610;BA.debugLine="Dim json As JSONGenerator : json.Initialize(m)";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 4610;BA.debugLine="Dim json As JSONGenerator : json.Initialize(m)";
_json.Initialize(_m);
 //BA.debugLineNum = 4611;BA.debugLine="Dim job As HttpJob : job.Initialize(\"CreateNewCon";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 4611;BA.debugLine="Dim job As HttpJob : job.Initialize(\"CreateNewCon";
_job._initialize /*String*/ (ba,"CreateNewContact",this);
 //BA.debugLineNum = 4612;BA.debugLine="job.Tag = ClientMap";
_job._tag /*Object*/  = (Object)(_clientmap.getObject());
 //BA.debugLineNum = 4613;BA.debugLine="job.PostString(\"https://people.googleapis.com/v1/";
_job._poststring /*String*/ ("https://people.googleapis.com/v1/people:createContact",_json.ToString());
 //BA.debugLineNum = 4614;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 4615;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 4616;BA.debugLine="End Sub";
return "";
}
public String  _createnewcontactfromform(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
 //BA.debugLineNum = 4704;BA.debugLine="Public Sub CreateNewContactFromForm(Data As Map)";
 //BA.debugLineNum = 4705;BA.debugLine="CreateNewContact(Data)";
_createnewcontact(_data);
 //BA.debugLineNum = 4706;BA.debugLine="End Sub";
return "";
}
public String  _createnewsheet(int _templategid) throws Exception{
int _year = 0;
String _newname = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 4104;BA.debugLine="Sub CreateNewSheet(templateGID As Int)";
 //BA.debugLineNum = 4105;BA.debugLine="Dim Year As Int = DateTime.GetYear(DateTime.Now)";
_year = __c.DateTime.GetYear(__c.DateTime.getNow());
 //BA.debugLineNum = 4106;BA.debugLine="Dim NewName As String = \"Geek God Ledger \" & Year";
_newname = "Geek God Ledger "+BA.NumberToString(_year);
 //BA.debugLineNum = 4108;BA.debugLine="Dim m As Map = CreateMap(\"properties\": CreateMap(";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("properties"),(Object)(__c.createMap(new Object[] {(Object)("title"),(Object)(_newname)}).getObject())});
 //BA.debugLineNum = 4109;BA.debugLine="Dim json As JSONGenerator : json.Initialize(m)";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 4109;BA.debugLine="Dim json As JSONGenerator : json.Initialize(m)";
_json.Initialize(_m);
 //BA.debugLineNum = 4111;BA.debugLine="Dim job As HttpJob : job.Initialize(\"CreateNew\",";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 4111;BA.debugLine="Dim job As HttpJob : job.Initialize(\"CreateNew\",";
_job._initialize /*String*/ (ba,"CreateNew",this);
 //BA.debugLineNum = 4112;BA.debugLine="job.Tag = templateGID";
_job._tag /*Object*/  = (Object)(_templategid);
 //BA.debugLineNum = 4113;BA.debugLine="job.PostString(\"https://sheets.googleapis.com/v4/";
_job._poststring /*String*/ ("https://sheets.googleapis.com/v4/spreadsheets",_json.ToString());
 //BA.debugLineNum = 4114;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 4115;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 4116;BA.debugLine="End Sub";
return "";
}
public String  _createrfc3339(long _ticks,String _offset) throws Exception{
String _oldformat = "";
String _datepart = "";
String _timepart = "";
 //BA.debugLineNum = 4775;BA.debugLine="Private Sub CreateRFC3339(Ticks As Long, Offset As";
 //BA.debugLineNum = 4776;BA.debugLine="Dim OldFormat As String = DateTime.DateFormat";
_oldformat = __c.DateTime.getDateFormat();
 //BA.debugLineNum = 4777;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 4778;BA.debugLine="Dim DatePart As String = DateTime.Date(Ticks)";
_datepart = __c.DateTime.Date(_ticks);
 //BA.debugLineNum = 4779;BA.debugLine="DateTime.DateFormat = \"HH:mm:ss\"";
__c.DateTime.setDateFormat("HH:mm:ss");
 //BA.debugLineNum = 4780;BA.debugLine="Dim TimePart As String = DateTime.Time(Ticks)";
_timepart = __c.DateTime.Time(_ticks);
 //BA.debugLineNum = 4781;BA.debugLine="DateTime.DateFormat = OldFormat";
__c.DateTime.setDateFormat(_oldformat);
 //BA.debugLineNum = 4782;BA.debugLine="Return DatePart & \"T\" & TimePart & Offset";
if (true) return _datepart+"T"+_timepart+_offset;
 //BA.debugLineNum = 4783;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.SpinnerWrapper  _createspinner() throws Exception{
anywheresoftware.b4a.objects.SpinnerWrapper _s = null;
 //BA.debugLineNum = 3194;BA.debugLine="Private Sub CreateSpinner As Spinner";
 //BA.debugLineNum = 3195;BA.debugLine="Dim s As Spinner : s.Initialize(\"\")";
_s = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 3195;BA.debugLine="Dim s As Spinner : s.Initialize(\"\")";
_s.Initialize(ba,"");
 //BA.debugLineNum = 3196;BA.debugLine="s.TextColor = xui.Color_Black";
_s.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 3197;BA.debugLine="s.DropdownBackgroundColor = xui.Color_White";
_s.setDropdownBackgroundColor(_xui.Color_White);
 //BA.debugLineNum = 3198;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 3199;BA.debugLine="End Sub";
return null;
}
public String  _deletevoicemail(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
String _emlpath = "";
int _lastslash = 0;
String _fname = "";
String _amrname = "";
 //BA.debugLineNum = 5103;BA.debugLine="Public Sub DeleteVoicemail(Data As Map)";
 //BA.debugLineNum = 5104;BA.debugLine="If Data.ContainsKey(\"FilePath\") = False Then Retu";
if (_data.ContainsKey((Object)("FilePath"))==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 5105;BA.debugLine="Dim EmlPath As String = Data.Get(\"FilePath\")";
_emlpath = BA.ObjectToString(_data.Get((Object)("FilePath")));
 //BA.debugLineNum = 5106;BA.debugLine="Dim LastSlash As Int = EmlPath.LastIndexOf(\"/\")";
_lastslash = _emlpath.lastIndexOf("/");
 //BA.debugLineNum = 5107;BA.debugLine="Dim FName As String = EmlPath.SubString(LastSlash";
_fname = _emlpath.substring((int) (_lastslash+1));
 //BA.debugLineNum = 5108;BA.debugLine="Dim AmrName As String = FName.Replace(\".eml\", \".a";
_amrname = _fname.replace(".eml",".amr");
 //BA.debugLineNum = 5109;BA.debugLine="Try";
try { //BA.debugLineNum = 5110;BA.debugLine="File.Delete(\"\", EmlPath)";
__c.File.Delete("",_emlpath);
 //BA.debugLineNum = 5111;BA.debugLine="File.Delete(\"\", File.DirRootExternal & \"/VisualV";
__c.File.Delete("",__c.File.getDirRootExternal()+"/VisualVoiceMail/"+_amrname);
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 5113;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("020774922",__c.LastException(ba).getMessage(),0);
 };
 //BA.debugLineNum = 5115;BA.debugLine="End Sub";
return "";
}
public String  _detectuseridentity() throws Exception{
int _w = 0;
int _h = 0;
String _detecteduser = "";
boolean _iserin = false;
boolean _ismikeopen = false;
boolean _ismikeclosed = false;
 //BA.debugLineNum = 579;BA.debugLine="Private Sub DetectUserIdentity";
 //BA.debugLineNum = 580;BA.debugLine="Dim W As Int = GetDeviceLayoutValues.Width";
_w = __c.GetDeviceLayoutValues(ba).Width;
 //BA.debugLineNum = 581;BA.debugLine="Dim H As Int = GetDeviceLayoutValues.Height";
_h = __c.GetDeviceLayoutValues(ba).Height;
 //BA.debugLineNum = 582;BA.debugLine="Dim DetectedUser As String = \"\"";
_detecteduser = "";
 //BA.debugLineNum = 584;BA.debugLine="Log(\">>> [Identity Engine] Raw Dims: \" & W & \"x\"";
__c.LogImpl("011862021",">>> [Identity Engine] Raw Dims: "+BA.NumberToString(_w)+"x"+BA.NumberToString(_h),0);
 //BA.debugLineNum = 586;BA.debugLine="Dim IsErin As Boolean = (Abs(W - 720) < 50 And Ab";
_iserin = (__c.Abs(_w-720)<50 && __c.Abs(_h-1420)<100);
 //BA.debugLineNum = 587;BA.debugLine="Dim IsMikeOpen As Boolean = (Abs(W - 1080) < 50 A";
_ismikeopen = (__c.Abs(_w-1080)<50 && __c.Abs(_h-2382)<100);
 //BA.debugLineNum = 588;BA.debugLine="Dim IsMikeClosed As Boolean = (Abs(W - 1856) < 50";
_ismikeclosed = (__c.Abs(_w-1856)<50 && __c.Abs(_h-1998)<100);
 //BA.debugLineNum = 590;BA.debugLine="If IsErin Then";
if (_iserin) { 
 //BA.debugLineNum = 591;BA.debugLine="DetectedUser = \"Erin\"";
_detecteduser = "Erin";
 }else if(_ismikeopen || _ismikeclosed) { 
 //BA.debugLineNum = 593;BA.debugLine="DetectedUser = \"Mike\"";
_detecteduser = "Mike";
 }else {
 //BA.debugLineNum = 595;BA.debugLine="If W > 1300 Then DetectedUser = \"Mike\" Else Dete";
if (_w>1300) { 
_detecteduser = "Mike";}
else {
_detecteduser = "Erin";};
 };
 //BA.debugLineNum = 598;BA.debugLine="Log(\">>> [Identity Engine] User: \" & DetectedUser";
__c.LogImpl("011862035",">>> [Identity Engine] User: "+_detecteduser,0);
 //BA.debugLineNum = 601;BA.debugLine="CurrentUser = DetectedUser";
_currentuser = _detecteduser;
 //BA.debugLineNum = 603;BA.debugLine="If appSettings.IsInitialized Then";
if (_appsettings.IsInitialized()) { 
 //BA.debugLineNum = 604;BA.debugLine="appSettings.Put(\"CurrentUser\", DetectedUser)";
_appsettings.Put((Object)("CurrentUser"),(Object)(_detecteduser));
 //BA.debugLineNum = 605;BA.debugLine="File.WriteMap(File.DirInternal, \"settings.map\",";
__c.File.WriteMap(__c.File.getDirInternal(),"settings.map",_appsettings);
 };
 //BA.debugLineNum = 608;BA.debugLine="If spnChose.IsInitialized Then";
if (_spnchose.IsInitialized()) { 
 //BA.debugLineNum = 609;BA.debugLine="If DetectedUser = \"Mike\" Then spnChose.SelectedI";
if ((_detecteduser).equals("Mike")) { 
_spnchose.setSelectedIndex((int) (0));}
else {
_spnchose.setSelectedIndex((int) (1));};
 };
 //BA.debugLineNum = 612;BA.debugLine="ApplyListBackground(DetectedUser)";
_applylistbackground(_detecteduser);
 //BA.debugLineNum = 613;BA.debugLine="End Sub";
return "";
}
public String  _directcall(String _phonenumber) throws Exception{
String _cleanphone = "";
anywheresoftware.b4a.objects.IntentWrapper _i = null;
 //BA.debugLineNum = 4947;BA.debugLine="Public Sub DirectCall(PhoneNumber As String)";
 //BA.debugLineNum = 4948;BA.debugLine="If PhoneNumber = \"\" Or PhoneNumber = \"No Phone\" T";
if ((_phonenumber).equals("") || (_phonenumber).equals("No Phone")) { 
if (true) return "";};
 //BA.debugLineNum = 4949;BA.debugLine="Dim cleanPhone As String = PhoneNumber.Replace(\"(";
_cleanphone = _phonenumber.replace("(","").replace(")","").replace("-","").replace(" ","");
 //BA.debugLineNum = 4950;BA.debugLine="Try";
try { //BA.debugLineNum = 4951;BA.debugLine="Dim i As Intent : i.Initialize(i.ACTION_CALL, \"t";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 4951;BA.debugLine="Dim i As Intent : i.Initialize(i.ACTION_CALL, \"t";
_i.Initialize(_i.ACTION_CALL,"tel:"+_cleanphone);
 //BA.debugLineNum = 4952;BA.debugLine="StartActivity(i)";
__c.StartActivity(ba,(Object)(_i.getObject()));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 4954;BA.debugLine="Log(\"DirectCall Failed: \" & LastException.Messag";
__c.LogImpl("020185095","DirectCall Failed: "+__c.LastException(ba).getMessage(),0);
 //BA.debugLineNum = 4955;BA.debugLine="LaunchDialer(PhoneNumber)";
_launchdialer(_phonenumber);
 };
 //BA.debugLineNum = 4957;BA.debugLine="End Sub";
return "";
}
public String  _expandedstatspanel(int _pnlw,int _pnlh) throws Exception{
int _availheight = 0;
int _rowh = 0;
int _topy = 0;
int _labelwidth = 0;
int _valueleft = 0;
int _valuewidth = 0;
 //BA.debugLineNum = 1340;BA.debugLine="Private Sub ExpandedStatsPanel(PnlW As Int, PnlH A";
 //BA.debugLineNum = 1341;BA.debugLine="Dim AvailHeight As Int = PnlH - 10dip : Dim RowH";
_availheight = (int) (_pnlh-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 1341;BA.debugLine="Dim AvailHeight As Int = PnlH - 10dip : Dim RowH";
_rowh = (int) (_availheight/(double)5);
 //BA.debugLineNum = 1342;BA.debugLine="Dim TopY As Int = 5dip";
_topy = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 1343;BA.debugLine="Dim LabelWidth As Int = PnlW * 0.90";
_labelwidth = (int) (_pnlw*0.90);
 //BA.debugLineNum = 1344;BA.debugLine="Dim ValueLeft As Int = PnlW * 0.35";
_valueleft = (int) (_pnlw*0.35);
 //BA.debugLineNum = 1345;BA.debugLine="Dim ValueWidth As Int = PnlW - ValueLeft - 5dip";
_valuewidth = (int) (_pnlw-_valueleft-__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 1346;BA.debugLine="lblTotalAptsGod.SetLayoutAnimated(0, 5dip, TopY,";
_lbltotalaptsgod.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),_topy,_labelwidth,_rowh);
 //BA.debugLineNum = 1347;BA.debugLine="lblTotalAptsGod.TextSize = 14";
_lbltotalaptsgod.setTextSize((float) (14));
 //BA.debugLineNum = 1348;BA.debugLine="lblTotalAptsGod.Color = xui.Color_Transparent";
_lbltotalaptsgod.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 1349;BA.debugLine="lblTotalAptsGod.As(Label).SingleLine = True";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lbltotalaptsgod.getObject()))).setSingleLine(__c.True);
 //BA.debugLineNum = 1350;BA.debugLine="lblTotalAptsGod.As(Label).Ellipsize = \"END\"";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lbltotalaptsgod.getObject()))).setEllipsize("END");
 //BA.debugLineNum = 1351;BA.debugLine="lblAppsGodNum.SetLayoutAnimated(0, ValueLeft, Top";
_lblappsgodnum.SetLayoutAnimated((int) (0),_valueleft,_topy,_valuewidth,_rowh);
 //BA.debugLineNum = 1352;BA.debugLine="lblAppsGodNum.TextSize = 14";
_lblappsgodnum.setTextSize((float) (14));
 //BA.debugLineNum = 1353;BA.debugLine="lblAppsGodNum.As(Label).Gravity = Gravity.CENTER_";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lblappsgodnum.getObject()))).setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.RIGHT));
 //BA.debugLineNum = 1354;BA.debugLine="lblAppsGodNum.As(Label).SingleLine = True";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lblappsgodnum.getObject()))).setSingleLine(__c.True);
 //BA.debugLineNum = 1355;BA.debugLine="TopY = TopY + RowH";
_topy = (int) (_topy+_rowh);
 //BA.debugLineNum = 1356;BA.debugLine="If lblTotalAptsGoddess.IsInitialized Then";
if (_lbltotalaptsgoddess.IsInitialized()) { 
 //BA.debugLineNum = 1357;BA.debugLine="lblTotalAptsGoddess.SetLayoutAnimated(0, 5dip, T";
_lbltotalaptsgoddess.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),_topy,_labelwidth,_rowh);
 //BA.debugLineNum = 1358;BA.debugLine="lblTotalAptsGoddess.TextSize = 14";
_lbltotalaptsgoddess.setTextSize((float) (14));
 //BA.debugLineNum = 1359;BA.debugLine="lblTotalAptsGoddess.Color = xui.Color_Transparen";
_lbltotalaptsgoddess.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 1360;BA.debugLine="lblTotalAptsGoddess.SingleLine = True";
_lbltotalaptsgoddess.setSingleLine(__c.True);
 //BA.debugLineNum = 1361;BA.debugLine="lblTotalAptsGoddess.Ellipsize = \"END\"";
_lbltotalaptsgoddess.setEllipsize("END");
 //BA.debugLineNum = 1362;BA.debugLine="lblAppsGoddessNum.SetLayoutAnimated(0, ValueLeft";
_lblappsgoddessnum.SetLayoutAnimated((int) (0),_valueleft,_topy,_valuewidth,_rowh);
 //BA.debugLineNum = 1363;BA.debugLine="lblAppsGoddessNum.TextSize = 14";
_lblappsgoddessnum.setTextSize((float) (14));
 //BA.debugLineNum = 1364;BA.debugLine="lblAppsGoddessNum.Gravity = Gravity.CENTER_VERTI";
_lblappsgoddessnum.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.RIGHT));
 //BA.debugLineNum = 1365;BA.debugLine="lblAppsGoddessNum.SingleLine = True";
_lblappsgoddessnum.setSingleLine(__c.True);
 //BA.debugLineNum = 1366;BA.debugLine="TopY = TopY + RowH";
_topy = (int) (_topy+_rowh);
 };
 //BA.debugLineNum = 1368;BA.debugLine="If lblGodCollected.IsInitialized Then";
if (_lblgodcollected.IsInitialized()) { 
 //BA.debugLineNum = 1369;BA.debugLine="lblGodCollected.SetLayoutAnimated(0, 5dip, TopY,";
_lblgodcollected.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),_topy,_labelwidth,_rowh);
 //BA.debugLineNum = 1370;BA.debugLine="lblGodCollected.TextSize = 14";
_lblgodcollected.setTextSize((float) (14));
 //BA.debugLineNum = 1371;BA.debugLine="lblGodCollected.Color = xui.Color_Transparent";
_lblgodcollected.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 1372;BA.debugLine="lblGodCollected.SingleLine = True";
_lblgodcollected.setSingleLine(__c.True);
 //BA.debugLineNum = 1373;BA.debugLine="lblGodCollected.Ellipsize = \"END\"";
_lblgodcollected.setEllipsize("END");
 //BA.debugLineNum = 1374;BA.debugLine="lblGodCollectedNum.SetLayoutAnimated(0, ValueLef";
_lblgodcollectednum.SetLayoutAnimated((int) (0),_valueleft,_topy,_valuewidth,_rowh);
 //BA.debugLineNum = 1375;BA.debugLine="lblGodCollectedNum.TextSize = 14";
_lblgodcollectednum.setTextSize((float) (14));
 //BA.debugLineNum = 1376;BA.debugLine="lblGodCollectedNum.As(Label).Gravity = Gravity.C";
(_lblgodcollectednum).setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.RIGHT));
 //BA.debugLineNum = 1377;BA.debugLine="lblGodCollectedNum.As(Label).SingleLine = True";
(_lblgodcollectednum).setSingleLine(__c.True);
 //BA.debugLineNum = 1378;BA.debugLine="TopY = TopY + RowH";
_topy = (int) (_topy+_rowh);
 };
 //BA.debugLineNum = 1380;BA.debugLine="If lblGoddessCollected.IsInitialized Then";
if (_lblgoddesscollected.IsInitialized()) { 
 //BA.debugLineNum = 1381;BA.debugLine="lblGoddessCollected.SetLayoutAnimated(0, 5dip, T";
_lblgoddesscollected.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),_topy,_labelwidth,_rowh);
 //BA.debugLineNum = 1382;BA.debugLine="lblGoddessCollected.TextSize = 14";
_lblgoddesscollected.setTextSize((float) (14));
 //BA.debugLineNum = 1383;BA.debugLine="lblGoddessCollected.Color = xui.Color_Transparen";
_lblgoddesscollected.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 1384;BA.debugLine="lblGoddessCollected.SingleLine = True";
_lblgoddesscollected.setSingleLine(__c.True);
 //BA.debugLineNum = 1385;BA.debugLine="lblGoddessCollected.Ellipsize = \"END\"";
_lblgoddesscollected.setEllipsize("END");
 //BA.debugLineNum = 1386;BA.debugLine="lblGoddessCollectedNum.SetLayoutAnimated(0, Valu";
_lblgoddesscollectednum.SetLayoutAnimated((int) (0),_valueleft,_topy,_valuewidth,_rowh);
 //BA.debugLineNum = 1387;BA.debugLine="lblGoddessCollectedNum.TextSize = 14";
_lblgoddesscollectednum.setTextSize((float) (14));
 //BA.debugLineNum = 1388;BA.debugLine="lblGoddessCollectedNum.As(Label).Gravity = Gravi";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lblgoddesscollectednum.getObject()))).setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.RIGHT));
 //BA.debugLineNum = 1389;BA.debugLine="lblGoddessCollectedNum.As(Label).SingleLine = Tr";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lblgoddesscollectednum.getObject()))).setSingleLine(__c.True);
 //BA.debugLineNum = 1390;BA.debugLine="TopY = TopY + RowH";
_topy = (int) (_topy+_rowh);
 };
 //BA.debugLineNum = 1392;BA.debugLine="lblTotalCollected.SetLayoutAnimated(0, 5dip, TopY";
_lbltotalcollected.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),_topy,_labelwidth,_rowh);
 //BA.debugLineNum = 1393;BA.debugLine="lblTotalCollected.TextSize = 14";
_lbltotalcollected.setTextSize((float) (14));
 //BA.debugLineNum = 1394;BA.debugLine="lblTotalCollected.Color = xui.Color_Transparent";
_lbltotalcollected.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 1395;BA.debugLine="lblTotalCollected.As(Label).SingleLine = True";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lbltotalcollected.getObject()))).setSingleLine(__c.True);
 //BA.debugLineNum = 1396;BA.debugLine="lblTotalCollected.As(Label).Ellipsize = \"END\"";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lbltotalcollected.getObject()))).setEllipsize("END");
 //BA.debugLineNum = 1397;BA.debugLine="lblTotalCollectedNum.SetLayoutAnimated(0, ValueLe";
_lbltotalcollectednum.SetLayoutAnimated((int) (0),_valueleft,_topy,_valuewidth,_rowh);
 //BA.debugLineNum = 1398;BA.debugLine="lblTotalCollectedNum.TextSize = 14";
_lbltotalcollectednum.setTextSize((float) (14));
 //BA.debugLineNum = 1399;BA.debugLine="lblTotalCollectedNum.As(Label).Gravity = Gravity.";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lbltotalcollectednum.getObject()))).setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.RIGHT));
 //BA.debugLineNum = 1400;BA.debugLine="lblTotalCollectedNum.As(Label).SingleLine = True";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lbltotalcollectednum.getObject()))).setSingleLine(__c.True);
 //BA.debugLineNum = 1401;BA.debugLine="End Sub";
return "";
}
public String  _fetchallconnections() throws Exception{
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 3620;BA.debugLine="Sub FetchAllConnections";
 //BA.debugLineNum = 3621;BA.debugLine="Dim job As HttpJob : job.Initialize(\"FetchAllConn";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 3621;BA.debugLine="Dim job As HttpJob : job.Initialize(\"FetchAllConn";
_job._initialize /*String*/ (ba,"FetchAllConnections",this);
 //BA.debugLineNum = 3622;BA.debugLine="job.Download(\"https://people.googleapis.com/v1/pe";
_job._download /*String*/ ("https://people.googleapis.com/v1/people/me/connections?personFields=names,phoneNumbers,addresses,biographies,memberships&pageSize=2000");
 //BA.debugLineNum = 3623;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 3624;BA.debugLine="End Sub";
return "";
}
public String  _foldlistener_foldstatechanged(String _state,String _orientation,boolean _isseparating) throws Exception{
 //BA.debugLineNum = 1175;BA.debugLine="Public Sub FoldListener_FoldStateChanged(State As";
 //BA.debugLineNum = 1176;BA.debugLine="Log(\">>> [EVENT] Fold State Changed: \" & State &";
__c.LogImpl("013172737",">>> [EVENT] Fold State Changed: "+_state+" / "+_orientation,0);
 //BA.debugLineNum = 1177;BA.debugLine="LastFoldState = State";
_lastfoldstate = _state;
 //BA.debugLineNum = 1178;BA.debugLine="LastOrientation = Orientation";
_lastorientation = _orientation;
 //BA.debugLineNum = 1179;BA.debugLine="If Root.IsInitialized Then";
if (_root.IsInitialized()) { 
 //BA.debugLineNum = 1180;BA.debugLine="B4XPage_Resize(Root.Width, Root.Height)";
_b4xpage_resize(_root.getWidth(),_root.getHeight());
 };
 //BA.debugLineNum = 1182;BA.debugLine="End Sub";
return "";
}
public String  _formataudiotime(int _seconds) throws Exception{
int _mins = 0;
int _secs = 0;
 //BA.debugLineNum = 5651;BA.debugLine="Private Sub FormatAudioTime(Seconds As Int) As Str";
 //BA.debugLineNum = 5652;BA.debugLine="Dim Mins As Int = Seconds / 60";
_mins = (int) (_seconds/(double)60);
 //BA.debugLineNum = 5653;BA.debugLine="Dim Secs As Int = Seconds Mod 60";
_secs = (int) (_seconds%60);
 //BA.debugLineNum = 5654;BA.debugLine="Return NumberFormat(Mins, 2, 0) & \":\" & NumberFor";
if (true) return __c.NumberFormat(_mins,(int) (2),(int) (0))+":"+__c.NumberFormat(_secs,(int) (2),(int) (0));
 //BA.debugLineNum = 5655;BA.debugLine="End Sub";
return "";
}
public String  _formatphone(String _raw) throws Exception{
String _cleaned = "";
 //BA.debugLineNum = 2557;BA.debugLine="Private Sub FormatPhone(Raw As String) As String";
 //BA.debugLineNum = 2558;BA.debugLine="Dim cleaned As String = Raw.Replace(\"+\", \"\").Repl";
_cleaned = _raw.replace("+","").replace("-","").replace(" ","").replace("(","").replace(")","");
 //BA.debugLineNum = 2559;BA.debugLine="If cleaned.Length > 10 And cleaned.StartsWith(\"1\"";
if (_cleaned.length()>10 && _cleaned.startsWith("1")) { 
 //BA.debugLineNum = 2560;BA.debugLine="cleaned = cleaned.SubString(1)";
_cleaned = _cleaned.substring((int) (1));
 };
 //BA.debugLineNum = 2562;BA.debugLine="If cleaned.Length = 10 Then";
if (_cleaned.length()==10) { 
 //BA.debugLineNum = 2563;BA.debugLine="Return \"(\" & cleaned.SubString2(0, 3) & \") \" & c";
if (true) return "("+_cleaned.substring((int) (0),(int) (3))+") "+_cleaned.substring((int) (3),(int) (6))+"-"+_cleaned.substring((int) (6));
 }else {
 //BA.debugLineNum = 2565;BA.debugLine="Return Raw";
if (true) return _raw;
 };
 //BA.debugLineNum = 2567;BA.debugLine="End Sub";
return "";
}
public String  _generatemonthtabs(String _ledgerid) throws Exception{
anywheresoftware.b4a.objects.collections.List _requests = null;
int _monthnum = 0;
String _monthname = "";
anywheresoftware.b4a.objects.collections.Map _addrequest = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 4208;BA.debugLine="Private Sub GenerateMonthTabs(LedgerID As String)";
 //BA.debugLineNum = 4209;BA.debugLine="Dim requests As List : requests.Initialize";
_requests = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4209;BA.debugLine="Dim requests As List : requests.Initialize";
_requests.Initialize();
 //BA.debugLineNum = 4211;BA.debugLine="For MonthNum = 1 To 12";
{
final int step3 = 1;
final int limit3 = (int) (12);
_monthnum = (int) (1) ;
for (;_monthnum <= limit3 ;_monthnum = _monthnum + step3 ) {
 //BA.debugLineNum = 4212;BA.debugLine="Dim monthName As String = MonthToString(MonthNum";
_monthname = _monthtostring(_monthnum);
 //BA.debugLineNum = 4213;BA.debugLine="Dim addRequest As Map = CreateMap( _ 			\"addShee";
_addrequest = new anywheresoftware.b4a.objects.collections.Map();
_addrequest = __c.createMap(new Object[] {(Object)("addSheet"),(Object)(__c.createMap(new Object[] {(Object)("properties"),(Object)(__c.createMap(new Object[] {(Object)("title"),(Object)(_monthname)}).getObject())}).getObject())});
 //BA.debugLineNum = 4218;BA.debugLine="requests.Add(addRequest)";
_requests.Add((Object)(_addrequest.getObject()));
 }
};
 //BA.debugLineNum = 4221;BA.debugLine="Dim m As Map = CreateMap(\"requests\": requests)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("requests"),(Object)(_requests.getObject())});
 //BA.debugLineNum = 4222;BA.debugLine="Dim json As JSONGenerator : json.Initialize(m)";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 4222;BA.debugLine="Dim json As JSONGenerator : json.Initialize(m)";
_json.Initialize(_m);
 //BA.debugLineNum = 4224;BA.debugLine="Dim job As HttpJob : job.Initialize(\"GenerateMont";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 4224;BA.debugLine="Dim job As HttpJob : job.Initialize(\"GenerateMont";
_job._initialize /*String*/ (ba,"GenerateMonths",this);
 //BA.debugLineNum = 4225;BA.debugLine="job.Tag = LedgerID";
_job._tag /*Object*/  = (Object)(_ledgerid);
 //BA.debugLineNum = 4226;BA.debugLine="job.PostString(\"https://sheets.googleapis.com/v4/";
_job._poststring /*String*/ ("https://sheets.googleapis.com/v4/spreadsheets/"+_ledgerid+":batchUpdate",_json.ToString());
 //BA.debugLineNum = 4227;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 4228;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 4229;BA.debugLine="End Sub";
return "";
}
public String  _generatesmartledger() throws Exception{
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 4066;BA.debugLine="Public Sub GenerateSmartLedger";
 //BA.debugLineNum = 4067;BA.debugLine="If OAuth2.access_token = \"\" Then";
if ((_oauth2._access_token /*String*/ ).equals("")) { 
 //BA.debugLineNum = 4068;BA.debugLine="xui.MsgboxAsync(\"Not connected to Google\", \"Erro";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Not connected to Google"),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 4069;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4072;BA.debugLine="lblStatus.Text = \"Status: Fetching Template...\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Fetching Template..."));
 //BA.debugLineNum = 4074;BA.debugLine="Dim job As HttpJob : job.Initialize(\"GetSource\",";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 4074;BA.debugLine="Dim job As HttpJob : job.Initialize(\"GetSource\",";
_job._initialize /*String*/ (ba,"GetSource",this);
 //BA.debugLineNum = 4075;BA.debugLine="job.Download(\"https://sheets.googleapis.com/v4/sp";
_job._download /*String*/ ("https://sheets.googleapis.com/v4/spreadsheets/"+_source_id);
 //BA.debugLineNum = 4076;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 4077;BA.debugLine="End Sub";
return "";
}
public String  _geocodeaddress(String _address) throws Exception{
String _mapsapikey = "";
anywheresoftware.b4a.objects.StringUtils _su = null;
String _encodedaddr = "";
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 5034;BA.debugLine="Private Sub GeocodeAddress(Address As String)";
 //BA.debugLineNum = 5035;BA.debugLine="If Address = \"\" Or Address = \"No Address\" Then Re";
if ((_address).equals("") || (_address).equals("No Address")) { 
if (true) return "";};
 //BA.debugLineNum = 5036;BA.debugLine="If GeocodedLocations.ContainsKey(Address) Or Fail";
if (_geocodedlocations.ContainsKey((Object)(_address)) || _failedgeocodes.ContainsKey((Object)(_address))) { 
if (true) return "";};
 //BA.debugLineNum = 5037;BA.debugLine="Dim MapsApiKey As String = \"AIzaSyAVOMjr8iK5af4oj";
_mapsapikey = "AIzaSyAVOMjr8iK5af4oj2xjZntrKH6ec2lpvR4";
 //BA.debugLineNum = 5038;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 5039;BA.debugLine="Dim encodedAddr As String = su.EncodeUrl(Address,";
_encodedaddr = _su.EncodeUrl(_address,"UTF8");
 //BA.debugLineNum = 5040;BA.debugLine="Dim job As HttpJob : job.Initialize(\"Geocode\", Me";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 5040;BA.debugLine="Dim job As HttpJob : job.Initialize(\"Geocode\", Me";
_job._initialize /*String*/ (ba,"Geocode",this);
 //BA.debugLineNum = 5041;BA.debugLine="job.Tag = Address";
_job._tag /*Object*/  = (Object)(_address);
 //BA.debugLineNum = 5042;BA.debugLine="job.Download(\"https://maps.googleapis.com/maps/ap";
_job._download /*String*/ ("https://maps.googleapis.com/maps/api/geocode/json?address="+_encodedaddr+"&key="+_mapsapikey);
 //BA.debugLineNum = 5043;BA.debugLine="End Sub";
return "";
}
public String  _gestureshake_sensorchanged(float[] _values) throws Exception{
float _x = 0f;
float _y = 0f;
float _z = 0f;
float _gforce = 0f;
long _now = 0L;
anywheresoftware.b4a.phone.Phone.PhoneVibrate _pv = null;
 //BA.debugLineNum = 6286;BA.debugLine="Sub GestureShake_SensorChanged (Values() As Float)";
 //BA.debugLineNum = 6287;BA.debugLine="Dim X As Float = Values(0)";
_x = _values[(int) (0)];
 //BA.debugLineNum = 6288;BA.debugLine="Dim Y As Float = Values(1)";
_y = _values[(int) (1)];
 //BA.debugLineNum = 6289;BA.debugLine="Dim Z As Float = Values(2)";
_z = _values[(int) (2)];
 //BA.debugLineNum = 6292;BA.debugLine="Dim GForce As Float = Sqrt(X*X + Y*Y + Z*Z)";
_gforce = (float) (__c.Sqrt(_x*_x+_y*_y+_z*_z));
 //BA.debugLineNum = 6295;BA.debugLine="If GForce > 15 Then";
if (_gforce>15) { 
 //BA.debugLineNum = 6296;BA.debugLine="Log(\">>> [GESTURE DEBUG] High G-Force Dete";
__c.LogImpl("022085642",">>> [GESTURE DEBUG] High G-Force Detected: "+__c.NumberFormat(_gforce,(int) (1),(int) (2)),0);
 };
 //BA.debugLineNum = 6300;BA.debugLine="If GForce > 28 Then";
if (_gforce>28) { 
 //BA.debugLineNum = 6301;BA.debugLine="Dim Now As Long = DateTime.Now";
_now = __c.DateTime.getNow();
 //BA.debugLineNum = 6304;BA.debugLine="If (Now - LastShakeTime) > 500 Then";
if ((_now-_lastshaketime)>500) { 
 //BA.debugLineNum = 6305;BA.debugLine="LastShakeTime = Now";
_lastshaketime = _now;
 //BA.debugLineNum = 6306;BA.debugLine="Log(\">>> [GESTURE] CHOP CONFIRMED! Toggling Fla";
__c.LogImpl("022085652",">>> [GESTURE] CHOP CONFIRMED! Toggling Flashlight...",0);
 //BA.debugLineNum = 6307;BA.debugLine="ToggleFlashlight";
_toggleflashlight();
 //BA.debugLineNum = 6310;BA.debugLine="Dim pv As PhoneVibrate";
_pv = new anywheresoftware.b4a.phone.Phone.PhoneVibrate();
 //BA.debugLineNum = 6311;BA.debugLine="pv.Vibrate(100)";
_pv.Vibrate(ba,(long) (100));
 };
 };
 //BA.debugLineNum = 6314;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentuser() throws Exception{
 //BA.debugLineNum = 815;BA.debugLine="Private Sub GetCurrentUser As String";
 //BA.debugLineNum = 816;BA.debugLine="If spnChose.IsInitialized And spnChose.SelectedIn";
if (_spnchose.IsInitialized() && _spnchose.getSelectedIndex()>=0) { 
 //BA.debugLineNum = 817;BA.debugLine="Return spnChose.GetItem(spnChose.SelectedIndex)";
if (true) return _spnchose.GetItem(_spnchose.getSelectedIndex());
 }else if(_appsettings.IsInitialized() && _appsettings.ContainsKey((Object)("CurrentUser"))) { 
 //BA.debugLineNum = 819;BA.debugLine="Return appSettings.Get(\"CurrentUser\")";
if (true) return BA.ObjectToString(_appsettings.Get((Object)("CurrentUser")));
 }else {
 //BA.debugLineNum = 821;BA.debugLine="Return \"Mike\"";
if (true) return "Mike";
 };
 //BA.debugLineNum = 823;BA.debugLine="End Sub";
return "";
}
public String  _getdayname(long _ticks) throws Exception{
String _oldf = "";
String _s = "";
 //BA.debugLineNum = 3201;BA.debugLine="Private Sub GetDayName(Ticks As Long) As String";
 //BA.debugLineNum = 3202;BA.debugLine="Dim oldF As String = DateTime.DateFormat";
_oldf = __c.DateTime.getDateFormat();
 //BA.debugLineNum = 3203;BA.debugLine="DateTime.DateFormat = \"EEEE\"";
__c.DateTime.setDateFormat("EEEE");
 //BA.debugLineNum = 3204;BA.debugLine="Dim s As String = DateTime.Date(Ticks)";
_s = __c.DateTime.Date(_ticks);
 //BA.debugLineNum = 3205;BA.debugLine="DateTime.DateFormat = oldF";
__c.DateTime.setDateFormat(_oldf);
 //BA.debugLineNum = 3206;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 3207;BA.debugLine="End Sub";
return "";
}
public String  _getmonthabbr(String _datestr) throws Exception{
int _m = 0;
String[] _months = null;
 //BA.debugLineNum = 3437;BA.debugLine="Private Sub GetMonthAbbr(DateStr As String) As Str";
 //BA.debugLineNum = 3438;BA.debugLine="Dim m As Int = DateStr.SubString2(0, 2)";
_m = (int)(Double.parseDouble(_datestr.substring((int) (0),(int) (2))));
 //BA.debugLineNum = 3439;BA.debugLine="Dim months() As String = Array As String(\"Jan\", \"";
_months = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
 //BA.debugLineNum = 3440;BA.debugLine="Return months(m - 1)";
if (true) return _months[(int) (_m-1)];
 //BA.debugLineNum = 3441;BA.debugLine="End Sub";
return "";
}
public String  _gps_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
 //BA.debugLineNum = 5029;BA.debugLine="Sub GPS_LocationChanged (Location1 As Location)";
 //BA.debugLineNum = 5030;BA.debugLine="CurrentLocation = Location1";
_currentlocation = _location1;
 //BA.debugLineNum = 5031;BA.debugLine="UpdateArrivalButtonsState";
_updatearrivalbuttonsstate();
 //BA.debugLineNum = 5032;BA.debugLine="End Sub";
return "";
}
public String  _handleappendexpense(Geek.God.CRM.App.httpjob _job) throws Exception{
 //BA.debugLineNum = 3160;BA.debugLine="Sub HandleAppendExpense(Job As HttpJob)";
 //BA.debugLineNum = 3161;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 3162;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 3163;BA.debugLine="xui.MsgboxAsync(\"Expense Saved Successfully!\", \"";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Expense Saved Successfully!"),BA.ObjectToCharSequence("Success"));
 //BA.debugLineNum = 3164;BA.debugLine="ExpensePanel.RemoveViewFromParent";
_expensepanel.RemoveViewFromParent();
 }else {
 //BA.debugLineNum = 3166;BA.debugLine="xui.MsgboxAsync(\"Sheet Update Failed: \" & Job.Er";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Sheet Update Failed: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"));
 };
 //BA.debugLineNum = 3168;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 3169;BA.debugLine="End Sub";
return "";
}
public String  _handlecalendarsuccess(Geek.God.CRM.App.httpjob _job) throws Exception{
 //BA.debugLineNum = 4241;BA.debugLine="Sub HandleCalendarSuccess(Job As HttpJob)";
 //BA.debugLineNum = 4242;BA.debugLine="Log(\"Handler triggered for: \" & Job.JobName) ' <-";
__c.LogImpl("018022401","Handler triggered for: "+_job._jobname /*String*/ ,0);
 //BA.debugLineNum = 4243;BA.debugLine="xui.MsgboxAsync(\"Appointment Saved to Google Cale";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Appointment Saved to Google Calendar!"),BA.ObjectToCharSequence("Success"));
 //BA.debugLineNum = 4245;BA.debugLine="If appointmentScreen.IsInitialized Then";
if (_appointmentscreen.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 4246;BA.debugLine="CallSub(appointmentScreen, \"RefreshSchedule\")";
__c.CallSubNew(ba,(Object)(_appointmentscreen),"RefreshSchedule");
 };
 //BA.debugLineNum = 4248;BA.debugLine="RefreshDashboard";
_refreshdashboard();
 //BA.debugLineNum = 4249;BA.debugLine="End Sub";
return "";
}
public String  _handlecopytemplate(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _jsonroot = null;
int _newsheetid = 0;
String _destspreadsheetid = "";
int _year = 0;
String _startdate = "";
 //BA.debugLineNum = 4147;BA.debugLine="Sub HandleCopyTemplate(Job As HttpJob)";
 //BA.debugLineNum = 4148;BA.debugLine="Try";
try { //BA.debugLineNum = 4149;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 4149;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 4150;BA.debugLine="Dim jsonRoot As Map = parser.NextObject";
_jsonroot = new anywheresoftware.b4a.objects.collections.Map();
_jsonroot = _parser.NextObject();
 //BA.debugLineNum = 4152;BA.debugLine="Dim newSheetID As Int = jsonRoot.Get(\"sheetId\")";
_newsheetid = (int)(BA.ObjectToNumber(_jsonroot.Get((Object)("sheetId"))));
 //BA.debugLineNum = 4153;BA.debugLine="Dim destSpreadsheetID As String = Job.Tag";
_destspreadsheetid = BA.ObjectToString(_job._tag /*Object*/ );
 //BA.debugLineNum = 4155;BA.debugLine="Dim Year As Int = DateTime.GetYear(DateTime.Now)";
_year = __c.DateTime.GetYear(__c.DateTime.getNow());
 //BA.debugLineNum = 4156;BA.debugLine="Dim StartDate As String = \"01/01/\" & Year";
_startdate = "01/01/"+BA.NumberToString(_year);
 //BA.debugLineNum = 4158;BA.debugLine="lblStatus.Text = \"Status: Configuring Ledger...\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Configuring Ledger..."));
 //BA.debugLineNum = 4159;BA.debugLine="RenameAndSetDate(destSpreadsheetID, newSheetID,";
_renameandsetdate(_destspreadsheetid,_newsheetid,"Ledger",_startdate);
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 4162;BA.debugLine="Log(\"Error copying template: \" & LastException)";
__c.LogImpl("017694735","Error copying template: "+BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 4163;BA.debugLine="xui.MsgboxAsync(\"Error copying template\", \"Error";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error copying template"),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 4164;BA.debugLine="lblStatus.Text = \"Status: Connected\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Connected"));
 };
 //BA.debugLineNum = 4166;BA.debugLine="End Sub";
return "";
}
public String  _handlecreateledger(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
String _ledgerid = "";
 //BA.debugLineNum = 4233;BA.debugLine="Sub HandleCreateLedger(Job As HttpJob)";
 //BA.debugLineNum = 4234;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 4234;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 4235;BA.debugLine="Dim rootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 4236;BA.debugLine="Dim LedgerID As String = rootMap.Get(\"id\")";
_ledgerid = BA.ObjectToString(_rootmap.Get((Object)("id")));
 //BA.debugLineNum = 4237;BA.debugLine="File.WriteString(File.DirInternal, \"ledger_id_202";
__c.File.WriteString(__c.File.getDirInternal(),"ledger_id_2026.txt",_ledgerid);
 //BA.debugLineNum = 4238;BA.debugLine="CurrentLedgerID = LedgerID";
_currentledgerid = _ledgerid;
 //BA.debugLineNum = 4239;BA.debugLine="GenerateMonthTabs(LedgerID)";
_generatemonthtabs(_ledgerid);
 //BA.debugLineNum = 4240;BA.debugLine="End Sub";
return "";
}
public String  _handlecreatenew(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _jsonroot = null;
String _newspreadsheetid = "";
int _templategid = 0;
 //BA.debugLineNum = 4118;BA.debugLine="Sub HandleCreateNew(Job As HttpJob)";
 //BA.debugLineNum = 4119;BA.debugLine="Try";
try { //BA.debugLineNum = 4120;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 4120;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 4121;BA.debugLine="Dim jsonRoot As Map = parser.NextObject";
_jsonroot = new anywheresoftware.b4a.objects.collections.Map();
_jsonroot = _parser.NextObject();
 //BA.debugLineNum = 4123;BA.debugLine="Dim newSpreadsheetID As String = jsonRoot.Get(\"s";
_newspreadsheetid = BA.ObjectToString(_jsonroot.Get((Object)("spreadsheetId")));
 //BA.debugLineNum = 4124;BA.debugLine="Dim templateGID As Int = Job.Tag";
_templategid = (int)(BA.ObjectToNumber(_job._tag /*Object*/ ));
 //BA.debugLineNum = 4126;BA.debugLine="lblStatus.Text = \"Status: Copying Template...\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Copying Template..."));
 //BA.debugLineNum = 4127;BA.debugLine="CopyTemplate(SOURCE_ID, templateGID, newSpreadsh";
_copytemplate(_source_id,_templategid,_newspreadsheetid);
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 4130;BA.debugLine="Log(\"Error creating new sheet: \" & LastException";
__c.LogImpl("017563660","Error creating new sheet: "+BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 4131;BA.debugLine="xui.MsgboxAsync(\"Error creating ledger\", \"Error\"";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error creating ledger"),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 4132;BA.debugLine="lblStatus.Text = \"Status: Connected\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Connected"));
 };
 //BA.debugLineNum = 4134;BA.debugLine="End Sub";
return "";
}
public String  _handlecreatenewcontact(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.Map _originaldata = null;
String _cname = "";
 //BA.debugLineNum = 4708;BA.debugLine="Sub HandleCreateNewContact(Job As HttpJob)";
 //BA.debugLineNum = 4709;BA.debugLine="Dim OriginalData As Map = Job.Tag";
_originaldata = new anywheresoftware.b4a.objects.collections.Map();
_originaldata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_job._tag /*Object*/ ));
 //BA.debugLineNum = 4710;BA.debugLine="Dim cName As String = OriginalData.GetDefault(\"Na";
_cname = BA.ObjectToString(_originaldata.GetDefault((Object)("Name"),(Object)("Contact")));
 //BA.debugLineNum = 4712;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 4713;BA.debugLine="xui.MsgboxAsync(cName & \" saved to Google Contac";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence(_cname+" saved to Google Contacts!"),BA.ObjectToCharSequence("Success"));
 //BA.debugLineNum = 4715;BA.debugLine="If OriginalData.GetDefault(\"IsScrapeWorkflow\", F";
if ((_originaldata.GetDefault((Object)("IsScrapeWorkflow"),(Object)(__c.False))).equals((Object)(__c.True))) { 
 //BA.debugLineNum = 4716;BA.debugLine="If ScrapeQueue.IsInitialized And ScrapeQueue.Si";
if (_scrapequeue.IsInitialized() && _scrapequeue.getSize()>0) { 
 //BA.debugLineNum = 4717;BA.debugLine="ScrapeQueue.RemoveAt(0)";
_scrapequeue.RemoveAt((int) (0));
 };
 //BA.debugLineNum = 4719;BA.debugLine="ProcessNextScrapeItem";
_processnextscrapeitem();
 };
 }else {
 //BA.debugLineNum = 4722;BA.debugLine="xui.MsgboxAsync(\"Failed to save \" & cName & \": \"";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Failed to save "+_cname+": "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"));
 };
 //BA.debugLineNum = 4724;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 4725;BA.debugLine="End Sub";
return "";
}
public String  _handlefetchallconnections(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
anywheresoftware.b4a.objects.collections.List _connections = null;
String _target = "";
boolean _foundexact = false;
String _numerictarget = "";
anywheresoftware.b4a.objects.collections.Map _person = null;
String _pname = "";
anywheresoftware.b4a.objects.collections.List _names = null;
String _pphone = "";
anywheresoftware.b4a.objects.collections.List _phones = null;
String _paddr = "";
anywheresoftware.b4a.objects.collections.List _addrs = null;
String _cleanphone = "";
int _dist = 0;
 //BA.debugLineNum = 3626;BA.debugLine="Sub HandleFetchAllConnections(Job As HttpJob)";
 //BA.debugLineNum = 3627;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 3627;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 3628;BA.debugLine="Dim rootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 3629;BA.debugLine="FuzzyCandidates.Clear";
_fuzzycandidates.Clear();
 //BA.debugLineNum = 3631;BA.debugLine="If rootMap.ContainsKey(\"connections\") Then";
if (_rootmap.ContainsKey((Object)("connections"))) { 
 //BA.debugLineNum = 3632;BA.debugLine="Dim connections As List = rootMap.Get(\"connectio";
_connections = new anywheresoftware.b4a.objects.collections.List();
_connections = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_rootmap.Get((Object)("connections"))));
 //BA.debugLineNum = 3633;BA.debugLine="Dim Target As String = CurrentSearchQuery.ToLowe";
_target = _currentsearchquery.toLowerCase();
 //BA.debugLineNum = 3634;BA.debugLine="Dim FoundExact As Boolean = False";
_foundexact = __c.False;
 //BA.debugLineNum = 3635;BA.debugLine="Dim numericTarget As String = Target.Replace(\"(\"";
_numerictarget = _target.replace("(","").replace(")","").replace("-","").replace(" ","");
 //BA.debugLineNum = 3637;BA.debugLine="For Each person As Map In connections";
_person = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group10 = _connections;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_person = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group10.Get(index10)));
 //BA.debugLineNum = 3638;BA.debugLine="Dim pName As String = \"\"";
_pname = "";
 //BA.debugLineNum = 3639;BA.debugLine="If person.ContainsKey(\"names\") Then";
if (_person.ContainsKey((Object)("names"))) { 
 //BA.debugLineNum = 3640;BA.debugLine="Dim names As List = person.Get(\"names\")";
_names = new anywheresoftware.b4a.objects.collections.List();
_names = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_person.Get((Object)("names"))));
 //BA.debugLineNum = 3641;BA.debugLine="If names.Size > 0 Then pName = names.Get(0).As";
if (_names.getSize()>0) { 
_pname = BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_names.Get((int) (0))))).GetDefault((Object)("displayName"),(Object)("")));};
 };
 //BA.debugLineNum = 3644;BA.debugLine="Dim pPhone As String = \"\"";
_pphone = "";
 //BA.debugLineNum = 3645;BA.debugLine="If person.ContainsKey(\"phoneNumbers\") Then";
if (_person.ContainsKey((Object)("phoneNumbers"))) { 
 //BA.debugLineNum = 3646;BA.debugLine="Dim phones As List = person.Get(\"phoneNumbers\"";
_phones = new anywheresoftware.b4a.objects.collections.List();
_phones = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_person.Get((Object)("phoneNumbers"))));
 //BA.debugLineNum = 3647;BA.debugLine="If phones.Size > 0 Then pPhone = phones.Get(0)";
if (_phones.getSize()>0) { 
_pphone = BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_phones.Get((int) (0))))).Get((Object)("value")));};
 };
 //BA.debugLineNum = 3649;BA.debugLine="Dim pAddr As String = \"\"";
_paddr = "";
 //BA.debugLineNum = 3650;BA.debugLine="If person.ContainsKey(\"addresses\") Then";
if (_person.ContainsKey((Object)("addresses"))) { 
 //BA.debugLineNum = 3651;BA.debugLine="Dim addrs As List = person.Get(\"addresses\")";
_addrs = new anywheresoftware.b4a.objects.collections.List();
_addrs = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_person.Get((Object)("addresses"))));
 //BA.debugLineNum = 3652;BA.debugLine="If addrs.Size > 0 Then pAddr = addrs.Get(0).As";
if (_addrs.getSize()>0) { 
_paddr = BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_addrs.Get((int) (0))))).Get((Object)("formattedValue")));};
 };
 //BA.debugLineNum = 3655;BA.debugLine="Dim cleanPhone As String = pPhone.Replace(\"(\",";
_cleanphone = _pphone.replace("(","").replace(")","").replace("-","").replace(" ","");
 //BA.debugLineNum = 3656;BA.debugLine="If pName.ToLowerCase.Contains(Target) Or (numer";
if (_pname.toLowerCase().contains(_target) || ((_numerictarget).equals("") == false && _cleanphone.contains(_numerictarget)) || _paddr.toLowerCase().contains(_target)) { 
 //BA.debugLineNum = 3657;BA.debugLine="Log(\"DEBUG: Manual Match Found: \" & pName)";
__c.LogImpl("016711711","DEBUG: Manual Match Found: "+_pname,0);
 //BA.debugLineNum = 3658;BA.debugLine="ParseAndLoadProfile(person)";
_parseandloadprofile(_person);
 //BA.debugLineNum = 3659;BA.debugLine="FoundExact = True";
_foundexact = __c.True;
 //BA.debugLineNum = 3660;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3663;BA.debugLine="Dim dist As Int = LevenshteinDistance(Target, p";
_dist = _levenshteindistance(_target,_pname.toLowerCase());
 //BA.debugLineNum = 3664;BA.debugLine="If dist <= 3 Then FuzzyCandidates.Put(pName, pe";
if (_dist<=3) { 
_fuzzycandidates.Put((Object)(_pname),(Object)(_person.getObject()));};
 }
};
 //BA.debugLineNum = 3667;BA.debugLine="If FoundExact = False Then";
if (_foundexact==__c.False) { 
 //BA.debugLineNum = 3668;BA.debugLine="If FuzzyCandidates.Size > 0 Then";
if (_fuzzycandidates.getSize()>0) { 
 //BA.debugLineNum = 3669;BA.debugLine="ShowFuzzyOptions";
_showfuzzyoptions();
 }else {
 //BA.debugLineNum = 3671;BA.debugLine="CallSub(searchScreen, \"ShowProfileNotFound\")";
__c.CallSubNew(ba,(Object)(_searchscreen),"ShowProfileNotFound");
 };
 };
 }else {
 //BA.debugLineNum = 3675;BA.debugLine="CallSub(searchScreen, \"ShowProfileNotFound\")";
__c.CallSubNew(ba,(Object)(_searchscreen),"ShowProfileNotFound");
 };
 //BA.debugLineNum = 3677;BA.debugLine="End Sub";
return "";
}
public String  _handlefetchdashboard(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
anywheresoftware.b4a.objects.collections.List _items = null;
 //BA.debugLineNum = 1784;BA.debugLine="Sub HandleFetchDashboard(Job As HttpJob)";
 //BA.debugLineNum = 1785;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 1786;BA.debugLine="Log(\"Dashboard Error: \" & Job.ErrorMessage)";
__c.LogImpl("013893634","Dashboard Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 1787;BA.debugLine="lblStatus.Text = \"Status: Disconnected\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Disconnected"));
 //BA.debugLineNum = 1788;BA.debugLine="lblStatus.Color = xui.Color_White";
_lblstatus.setColor(_xui.Color_White);
 //BA.debugLineNum = 1789;BA.debugLine="lblStatus.TextColor = 0xFFD32F2F";
_lblstatus.setTextColor(((int)0xffd32f2f));
 //BA.debugLineNum = 1790;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 1791;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1794;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 1794;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 1795;BA.debugLine="Dim rootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 1796;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1797;BA.debugLine="If rootMap.ContainsKey(\"items\") Then";
if (_rootmap.ContainsKey((Object)("items"))) { 
 //BA.debugLineNum = 1798;BA.debugLine="items = rootMap.Get(\"items\")";
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_rootmap.Get((Object)("items"))));
 }else {
 //BA.debugLineNum = 1800;BA.debugLine="items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 1803;BA.debugLine="lblStatus.Text = \"Status: Connected\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Connected"));
 //BA.debugLineNum = 1804;BA.debugLine="lblStatus.Color = xui.Color_White";
_lblstatus.setColor(_xui.Color_White);
 //BA.debugLineNum = 1805;BA.debugLine="lblStatus.TextColor = xui.Color_Black";
_lblstatus.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 1807;BA.debugLine="BuildDashboardList(items, Root.Width)";
_builddashboardlist(_items,_root.getWidth());
 //BA.debugLineNum = 1809;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 1810;BA.debugLine="End Sub";
return "";
}
public String  _handlegeneratemonths(Geek.God.CRM.App.httpjob _job) throws Exception{
 //BA.debugLineNum = 4251;BA.debugLine="Sub HandleGenerateMonths(Job As HttpJob)";
 //BA.debugLineNum = 4252;BA.debugLine="Log(\"Handler triggered for: \" & Job.JobName) ' <-";
__c.LogImpl("018087937","Handler triggered for: "+_job._jobname /*String*/ ,0);
 //BA.debugLineNum = 4253;BA.debugLine="lblStatus.Text = \"Status: Connected\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Connected"));
 //BA.debugLineNum = 4254;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 4255;BA.debugLine="xui.MsgboxAsync(\"Ledger created successfully!\", \"";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Ledger created successfully!"),BA.ObjectToCharSequence("Success"));
 //BA.debugLineNum = 4256;BA.debugLine="RefreshDashboard";
_refreshdashboard();
 //BA.debugLineNum = 4257;BA.debugLine="End Sub";
return "";
}
public String  _handlegeocode(Geek.God.CRM.App.httpjob _job) throws Exception{
String _originaladdress = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _jsonroot = null;
String _status = "";
anywheresoftware.b4a.objects.collections.List _results = null;
anywheresoftware.b4a.objects.collections.Map _firstresult = null;
anywheresoftware.b4a.objects.collections.Map _geometry = null;
anywheresoftware.b4a.objects.collections.Map _location = null;
anywheresoftware.b4a.gps.LocationWrapper _loc = null;
 //BA.debugLineNum = 5045;BA.debugLine="Private Sub HandleGeocode(Job As HttpJob)";
 //BA.debugLineNum = 5046;BA.debugLine="Try";
try { //BA.debugLineNum = 5047;BA.debugLine="Dim OriginalAddress As String = \"\"";
_originaladdress = "";
 //BA.debugLineNum = 5048;BA.debugLine="If Job.Tag Is String Then OriginalAddress = Job.";
if (_job._tag /*Object*/  instanceof String) { 
_originaladdress = BA.ObjectToString(_job._tag /*Object*/ );};
 //BA.debugLineNum = 5049;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 5049;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 5050;BA.debugLine="Dim jsonRoot As Map = parser.NextObject";
_jsonroot = new anywheresoftware.b4a.objects.collections.Map();
_jsonroot = _parser.NextObject();
 //BA.debugLineNum = 5051;BA.debugLine="Dim status As String = jsonRoot.GetDefault(\"stat";
_status = BA.ObjectToString(_jsonroot.GetDefault((Object)("status"),(Object)("ERROR")));
 //BA.debugLineNum = 5052;BA.debugLine="If status <> \"OK\" Then";
if ((_status).equals("OK") == false) { 
 //BA.debugLineNum = 5053;BA.debugLine="FailedGeocodes.Put(OriginalAddress, True)";
_failedgeocodes.Put((Object)(_originaladdress),(Object)(__c.True));
 //BA.debugLineNum = 5054;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 5056;BA.debugLine="Dim results As List = jsonRoot.Get(\"results\")";
_results = new anywheresoftware.b4a.objects.collections.List();
_results = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jsonroot.Get((Object)("results"))));
 //BA.debugLineNum = 5057;BA.debugLine="If results.Size = 0 Then Return";
if (_results.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 5058;BA.debugLine="Dim firstResult As Map = results.Get(0)";
_firstresult = new anywheresoftware.b4a.objects.collections.Map();
_firstresult = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_results.Get((int) (0))));
 //BA.debugLineNum = 5059;BA.debugLine="Dim geometry As Map = firstResult.Get(\"geometry\"";
_geometry = new anywheresoftware.b4a.objects.collections.Map();
_geometry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_firstresult.Get((Object)("geometry"))));
 //BA.debugLineNum = 5060;BA.debugLine="Dim location As Map = geometry.Get(\"location\")";
_location = new anywheresoftware.b4a.objects.collections.Map();
_location = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_geometry.Get((Object)("location"))));
 //BA.debugLineNum = 5061;BA.debugLine="Dim loc As Location : loc.Initialize";
_loc = new anywheresoftware.b4a.gps.LocationWrapper();
 //BA.debugLineNum = 5061;BA.debugLine="Dim loc As Location : loc.Initialize";
_loc.Initialize();
 //BA.debugLineNum = 5062;BA.debugLine="loc.Latitude = location.Get(\"lat\")";
_loc.setLatitude((double)(BA.ObjectToNumber(_location.Get((Object)("lat")))));
 //BA.debugLineNum = 5063;BA.debugLine="loc.Longitude = location.Get(\"lng\")";
_loc.setLongitude((double)(BA.ObjectToNumber(_location.Get((Object)("lng")))));
 //BA.debugLineNum = 5064;BA.debugLine="GeocodedLocations.Put(OriginalAddress, loc)";
_geocodedlocations.Put((Object)(_originaladdress),(Object)(_loc.getObject()));
 //BA.debugLineNum = 5065;BA.debugLine="UpdateArrivalButtonsState";
_updatearrivalbuttonsstate();
 } 
       catch (Exception e24) {
			ba.setLastException(e24); //BA.debugLineNum = 5067;BA.debugLine="Log(\"Error parsing geocode: \" & LastException)";
__c.LogImpl("020643862","Error parsing geocode: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 5069;BA.debugLine="End Sub";
return "";
}
public String  _handlegetreceiptlink(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
String _link = "";
 //BA.debugLineNum = 5151;BA.debugLine="Sub HandleGetReceiptLink(Job As HttpJob)";
 //BA.debugLineNum = 5152;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 5153;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 5154;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 5154;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 5155;BA.debugLine="Dim rootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 5156;BA.debugLine="Dim Link As String = rootMap.GetDefault(\"webView";
_link = BA.ObjectToString(_rootmap.GetDefault((Object)("webViewLink"),(Object)("")));
 //BA.debugLineNum = 5157;BA.debugLine="If Link <> \"\" Then";
if ((_link).equals("") == false) { 
 //BA.debugLineNum = 5158;BA.debugLine="AppendExpenseToSheet(Link)";
_appendexpensetosheet(_link);
 }else {
 //BA.debugLineNum = 5160;BA.debugLine="xui.MsgboxAsync(\"Could not get receipt link.\",";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Could not get receipt link."),BA.ObjectToCharSequence("Error"));
 };
 }else {
 //BA.debugLineNum = 5163;BA.debugLine="xui.MsgboxAsync(\"Could not get receipt link: \" &";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Could not get receipt link: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"));
 };
 //BA.debugLineNum = 5165;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 5166;BA.debugLine="End Sub";
return "";
}
public String  _handlegetsheetmetadata(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
anywheresoftware.b4a.objects.collections.List _sheets = null;
anywheresoftware.b4a.objects.collections.List _tabs = null;
anywheresoftware.b4a.objects.collections.Map _s = null;
String _title = "";
 //BA.debugLineNum = 3835;BA.debugLine="Sub HandleGetSheetMetadata(Job As HttpJob)";
 //BA.debugLineNum = 3836;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 3837;BA.debugLine="Log(\">>> [LEDGER-DEBUG] Metadata Fetch Failed: \"";
__c.LogImpl("017170434",">>> [LEDGER-DEBUG] Metadata Fetch Failed: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 3838;BA.debugLine="ProcessNextLedger";
_processnextledger();
 //BA.debugLineNum = 3839;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 3840;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3843;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 3843;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 3844;BA.debugLine="Dim rootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 3845;BA.debugLine="Dim sheets As List = rootMap.Get(\"sheets\")";
_sheets = new anywheresoftware.b4a.objects.collections.List();
_sheets = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_rootmap.Get((Object)("sheets"))));
 //BA.debugLineNum = 3846;BA.debugLine="Dim tabs As List : tabs.Initialize";
_tabs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3846;BA.debugLine="Dim tabs As List : tabs.Initialize";
_tabs.Initialize();
 //BA.debugLineNum = 3847;BA.debugLine="For Each s As Map In sheets";
_s = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group13 = _sheets;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_s = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group13.Get(index13)));
 //BA.debugLineNum = 3848;BA.debugLine="Dim title As String = s.Get(\"properties\").As(Map";
_title = BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_s.Get((Object)("properties"))))).Get((Object)("title")));
 //BA.debugLineNum = 3849;BA.debugLine="If title <> \"TEMPLATE\" And title <> \"Master\" The";
if ((_title).equals("TEMPLATE") == false && (_title).equals("Master") == false) { 
_tabs.Add((Object)(_title));};
 }
};
 //BA.debugLineNum = 3852;BA.debugLine="Log(\">>> [LEDGER-DEBUG] Tabs to Scan: \" & tabs.Si";
__c.LogImpl("017170449",">>> [LEDGER-DEBUG] Tabs to Scan: "+BA.NumberToString(_tabs.getSize()),0);
 //BA.debugLineNum = 3854;BA.debugLine="If tabs.Size > 0 Then BatchFetchTabs(tabs, Job.Ta";
if (_tabs.getSize()>0) { 
_batchfetchtabs(_tabs,BA.ObjectToString(_job._tag /*Object*/ ));}
else {
_processnextledger();};
 //BA.debugLineNum = 3855;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 3856;BA.debugLine="End Sub";
return "";
}
public String  _handlegetsource(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _jsonroot = null;
anywheresoftware.b4a.objects.collections.List _sheets = null;
anywheresoftware.b4a.objects.collections.Map _firstsheet = null;
anywheresoftware.b4a.objects.collections.Map _props = null;
int _templategid = 0;
 //BA.debugLineNum = 4079;BA.debugLine="Sub HandleGetSource(Job As HttpJob)";
 //BA.debugLineNum = 4080;BA.debugLine="Try";
try { //BA.debugLineNum = 4081;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 4081;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 4082;BA.debugLine="Dim jsonRoot As Map = parser.NextObject";
_jsonroot = new anywheresoftware.b4a.objects.collections.Map();
_jsonroot = _parser.NextObject();
 //BA.debugLineNum = 4084;BA.debugLine="Dim sheets As List = jsonRoot.Get(\"sheets\")";
_sheets = new anywheresoftware.b4a.objects.collections.List();
_sheets = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jsonroot.Get((Object)("sheets"))));
 //BA.debugLineNum = 4085;BA.debugLine="If sheets.Size > 0 Then";
if (_sheets.getSize()>0) { 
 //BA.debugLineNum = 4086;BA.debugLine="Dim firstSheet As Map = sheets.Get(0)";
_firstsheet = new anywheresoftware.b4a.objects.collections.Map();
_firstsheet = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_sheets.Get((int) (0))));
 //BA.debugLineNum = 4087;BA.debugLine="Dim props As Map = firstSheet.Get(\"properties\")";
_props = new anywheresoftware.b4a.objects.collections.Map();
_props = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_firstsheet.Get((Object)("properties"))));
 //BA.debugLineNum = 4088;BA.debugLine="Dim templateGID As Int = props.Get(\"sheetId\")";
_templategid = (int)(BA.ObjectToNumber(_props.Get((Object)("sheetId"))));
 //BA.debugLineNum = 4090;BA.debugLine="lblStatus.Text = \"Status: Creating New Ledger..";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Creating New Ledger..."));
 //BA.debugLineNum = 4091;BA.debugLine="CreateNewSheet(templateGID)";
_createnewsheet(_templategid);
 }else {
 //BA.debugLineNum = 4093;BA.debugLine="xui.MsgboxAsync(\"Template has no sheets\", \"Erro";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Template has no sheets"),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 4094;BA.debugLine="lblStatus.Text = \"Status: Connected\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Connected"));
 };
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 4098;BA.debugLine="Log(\"Error fetching source: \" & LastException)";
__c.LogImpl("017432595","Error fetching source: "+BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 4099;BA.debugLine="xui.MsgboxAsync(\"Error fetching template\", \"Erro";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error fetching template"),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 4100;BA.debugLine="lblStatus.Text = \"Status: Connected\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Connected"));
 };
 //BA.debugLineNum = 4102;BA.debugLine="End Sub";
return "";
}
public String  _handlelistgroups(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _jsonroot = null;
anywheresoftware.b4a.objects.collections.List _groupslist = null;
boolean _hasclient = false;
boolean _haspreferred = false;
boolean _hasblacklisted = false;
anywheresoftware.b4a.objects.collections.Map _g = null;
String _gname = "";
String _gresource = "";
 //BA.debugLineNum = 2277;BA.debugLine="Sub HandleListGroups(Job As HttpJob)";
 //BA.debugLineNum = 2278;BA.debugLine="Try";
try { //BA.debugLineNum = 2279;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 2279;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 2280;BA.debugLine="Dim jsonRoot As Map = parser.NextObject";
_jsonroot = new anywheresoftware.b4a.objects.collections.Map();
_jsonroot = _parser.NextObject();
 //BA.debugLineNum = 2282;BA.debugLine="If jsonRoot.ContainsKey(\"contactGroups\") = False";
if (_jsonroot.ContainsKey((Object)("contactGroups"))==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 2284;BA.debugLine="Dim groupsList As List = jsonRoot.Get(\"contactGr";
_groupslist = new anywheresoftware.b4a.objects.collections.List();
_groupslist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jsonroot.Get((Object)("contactGroups"))));
 //BA.debugLineNum = 2286;BA.debugLine="Dim HasClient As Boolean = False";
_hasclient = __c.False;
 //BA.debugLineNum = 2287;BA.debugLine="Dim HasPreferred As Boolean = False";
_haspreferred = __c.False;
 //BA.debugLineNum = 2288;BA.debugLine="Dim HasBlacklisted As Boolean = False";
_hasblacklisted = __c.False;
 //BA.debugLineNum = 2290;BA.debugLine="For Each g As Map In groupsList";
_g = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group10 = _groupslist;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_g = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group10.Get(index10)));
 //BA.debugLineNum = 2291;BA.debugLine="Dim gName As String = g.GetDefault(\"name\", \"\")";
_gname = BA.ObjectToString(_g.GetDefault((Object)("name"),(Object)("")));
 //BA.debugLineNum = 2292;BA.debugLine="Dim gResource As String = g.GetDefault(\"resourc";
_gresource = BA.ObjectToString(_g.GetDefault((Object)("resourceName"),(Object)("")));
 //BA.debugLineNum = 2294;BA.debugLine="If gName = \"Standard Client\" Then";
if ((_gname).equals("Standard Client")) { 
 //BA.debugLineNum = 2295;BA.debugLine="HasClient = True";
_hasclient = __c.True;
 //BA.debugLineNum = 2296;BA.debugLine="Starter.GroupID_Client = gResource";
_starter._groupid_client /*long*/  = (long)(Double.parseDouble(_gresource));
 };
 //BA.debugLineNum = 2298;BA.debugLine="If gName = \"Preferred Client\" Then";
if ((_gname).equals("Preferred Client")) { 
 //BA.debugLineNum = 2299;BA.debugLine="HasPreferred = True";
_haspreferred = __c.True;
 //BA.debugLineNum = 2300;BA.debugLine="Starter.GroupID_Preferred = gResource";
_starter._groupid_preferred /*long*/  = (long)(Double.parseDouble(_gresource));
 };
 //BA.debugLineNum = 2302;BA.debugLine="If gName = \"Blacklisted Client\" Then";
if ((_gname).equals("Blacklisted Client")) { 
 //BA.debugLineNum = 2303;BA.debugLine="HasBlacklisted = True";
_hasblacklisted = __c.True;
 //BA.debugLineNum = 2304;BA.debugLine="Starter.GroupID_Blacklisted = gResource";
_starter._groupid_blacklisted /*long*/  = (long)(Double.parseDouble(_gresource));
 };
 }
};
 //BA.debugLineNum = 2309;BA.debugLine="If HasClient = False Then CreateContactGroup(\"St";
if (_hasclient==__c.False) { 
_createcontactgroup("Standard Client");};
 //BA.debugLineNum = 2310;BA.debugLine="If HasPreferred = False Then CreateContactGroup(";
if (_haspreferred==__c.False) { 
_createcontactgroup("Preferred Client");};
 //BA.debugLineNum = 2311;BA.debugLine="If HasBlacklisted = False Then CreateContactGrou";
if (_hasblacklisted==__c.False) { 
_createcontactgroup("Blacklisted Client");};
 } 
       catch (Exception e30) {
			ba.setLastException(e30); //BA.debugLineNum = 2314;BA.debugLine="Log(\"Error parsing contact groups: \" & LastExcep";
__c.LogImpl("014090277","Error parsing contact groups: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 2316;BA.debugLine="End Sub";
return "";
}
public String  _handlepopulateledger(Geek.God.CRM.App.httpjob _job) throws Exception{
 //BA.debugLineNum = 4259;BA.debugLine="Sub HandlePopulateLedger(Job As HttpJob)";
 //BA.debugLineNum = 4260;BA.debugLine="Log(\"Handler triggered for: \" & Job.JobName) ' <-";
__c.LogImpl("018153473","Handler triggered for: "+_job._jobname /*String*/ ,0);
 //BA.debugLineNum = 4261;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 4262;BA.debugLine="xui.MsgboxAsync(\"Ledger Created Successfully!\", \"";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Ledger Created Successfully!"),BA.ObjectToCharSequence("Success"));
 //BA.debugLineNum = 4263;BA.debugLine="RefreshDashboard";
_refreshdashboard();
 //BA.debugLineNum = 4264;BA.debugLine="End Sub";
return "";
}
public String  _handlesearchcontact(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
anywheresoftware.b4a.objects.collections.List _results = null;
anywheresoftware.b4a.objects.collections.Map _resitem = null;
anywheresoftware.b4a.objects.collections.Map _person = null;
 //BA.debugLineNum = 3604;BA.debugLine="Sub HandleSearchContact(Job As HttpJob)";
 //BA.debugLineNum = 3605;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 3605;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 3606;BA.debugLine="Dim rootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 3607;BA.debugLine="If rootMap.ContainsKey(\"results\") Then";
if (_rootmap.ContainsKey((Object)("results"))) { 
 //BA.debugLineNum = 3608;BA.debugLine="Dim results As List = rootMap.Get(\"results\")";
_results = new anywheresoftware.b4a.objects.collections.List();
_results = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_rootmap.Get((Object)("results"))));
 //BA.debugLineNum = 3609;BA.debugLine="If results.Size > 0 Then";
if (_results.getSize()>0) { 
 //BA.debugLineNum = 3610;BA.debugLine="Dim resItem As Map = results.Get(0)";
_resitem = new anywheresoftware.b4a.objects.collections.Map();
_resitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_results.Get((int) (0))));
 //BA.debugLineNum = 3611;BA.debugLine="Dim person As Map = resItem.Get(\"person\")";
_person = new anywheresoftware.b4a.objects.collections.Map();
_person = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resitem.Get((Object)("person"))));
 //BA.debugLineNum = 3612;BA.debugLine="ParseAndLoadProfile(person)";
_parseandloadprofile(_person);
 //BA.debugLineNum = 3613;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 3616;BA.debugLine="Log(\"DEBUG: Search returned 0 results. Triggering";
__c.LogImpl("016580620","DEBUG: Search returned 0 results. Triggering Manual Fetch Fallback...",0);
 //BA.debugLineNum = 3617;BA.debugLine="FetchAllConnections";
_fetchallconnections();
 //BA.debugLineNum = 3618;BA.debugLine="End Sub";
return "";
}
public String  _handlesearchdate(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
anywheresoftware.b4a.objects.collections.List _items = null;
 //BA.debugLineNum = 4733;BA.debugLine="Sub HandleSearchDate(Job As HttpJob)";
 //BA.debugLineNum = 4734;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 4735;BA.debugLine="xui.MsgboxAsync(\"Calendar search failed: \" & Job";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Calendar search failed: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 4736;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 4737;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4740;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 4740;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 4741;BA.debugLine="Dim rootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 4742;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4743;BA.debugLine="If rootMap.ContainsKey(\"items\") Then";
if (_rootmap.ContainsKey((Object)("items"))) { 
 //BA.debugLineNum = 4744;BA.debugLine="items = rootMap.Get(\"items\")";
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_rootmap.Get((Object)("items"))));
 }else {
 //BA.debugLineNum = 4746;BA.debugLine="items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 4749;BA.debugLine="If items.Size = 0 Then";
if (_items.getSize()==0) { 
 //BA.debugLineNum = 4750;BA.debugLine="xui.MsgboxAsync(\"No appointments found for this";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("No appointments found for this date."),BA.ObjectToCharSequence("Search Results"));
 }else {
 //BA.debugLineNum = 4752;BA.debugLine="xui.MsgboxAsync(\"Found \" & items.Size & \" appoin";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Found "+BA.NumberToString(_items.getSize())+" appointment(s) for this date."),BA.ObjectToCharSequence("Search Results"));
 };
 //BA.debugLineNum = 4755;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 4756;BA.debugLine="End Sub";
return "";
}
public String  _handlesearchforid(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
anywheresoftware.b4a.objects.collections.List _container = null;
String _resourcename = "";
String _etag = "";
anywheresoftware.b4a.objects.collections.List _results = null;
anywheresoftware.b4a.objects.collections.Map _resitem = null;
anywheresoftware.b4a.objects.collections.Map _person = null;
 //BA.debugLineNum = 3249;BA.debugLine="Sub HandleSearchForID(Job As HttpJob)";
 //BA.debugLineNum = 3250;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 3250;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 3251;BA.debugLine="Dim rootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 3252;BA.debugLine="Dim Container As List = Job.Tag";
_container = new anywheresoftware.b4a.objects.collections.List();
_container = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_job._tag /*Object*/ ));
 //BA.debugLineNum = 3253;BA.debugLine="Dim ResourceName As String = \"\"";
_resourcename = "";
 //BA.debugLineNum = 3254;BA.debugLine="Dim Etag As String = \"\"";
_etag = "";
 //BA.debugLineNum = 3256;BA.debugLine="If rootMap.ContainsKey(\"results\") Then";
if (_rootmap.ContainsKey((Object)("results"))) { 
 //BA.debugLineNum = 3257;BA.debugLine="Dim results As List = rootMap.Get(\"results\")";
_results = new anywheresoftware.b4a.objects.collections.List();
_results = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_rootmap.Get((Object)("results"))));
 //BA.debugLineNum = 3258;BA.debugLine="If results.Size > 0 Then";
if (_results.getSize()>0) { 
 //BA.debugLineNum = 3259;BA.debugLine="Dim resItem As Map = results.Get(0)";
_resitem = new anywheresoftware.b4a.objects.collections.Map();
_resitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_results.Get((int) (0))));
 //BA.debugLineNum = 3260;BA.debugLine="Dim person As Map = resItem.Get(\"person\")";
_person = new anywheresoftware.b4a.objects.collections.Map();
_person = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resitem.Get((Object)("person"))));
 //BA.debugLineNum = 3261;BA.debugLine="ResourceName = person.Get(\"resourceName\")";
_resourcename = BA.ObjectToString(_person.Get((Object)("resourceName")));
 //BA.debugLineNum = 3262;BA.debugLine="Etag = person.Get(\"etag\")";
_etag = BA.ObjectToString(_person.Get((Object)("etag")));
 };
 };
 //BA.debugLineNum = 3266;BA.debugLine="If ResourceName = \"\" Then";
if ((_resourcename).equals("")) { 
 //BA.debugLineNum = 3267;BA.debugLine="Log(\"WARNING: Could not find Google Contact ID.";
__c.LogImpl("016121874","WARNING: Could not find Google Contact ID. Skipping Contact Update.",0);
 //BA.debugLineNum = 3268;BA.debugLine="CloseOut_Helper_Step3(Container)";
_closeout_helper_step3(_container);
 }else {
 //BA.debugLineNum = 3270;BA.debugLine="CloseOut_Helper_Step2(Container, ResourceName, E";
_closeout_helper_step2(_container,_resourcename,_etag);
 };
 //BA.debugLineNum = 3272;BA.debugLine="End Sub";
return "";
}
public String  _handlesearchledgerfiles(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
anywheresoftware.b4a.objects.collections.List _files = null;
anywheresoftware.b4a.objects.collections.Map _f = null;
String _fid = "";
 //BA.debugLineNum = 3788;BA.debugLine="Sub HandleSearchLedgerFiles(Job As HttpJob)";
 //BA.debugLineNum = 3789;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 3790;BA.debugLine="Log(\">>> [LEDGER-DEBUG] Search FAILED: \" & Job.E";
__c.LogImpl("017039362",">>> [LEDGER-DEBUG] Search FAILED: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 3791;BA.debugLine="ProcessNextLedger";
_processnextledger();
 //BA.debugLineNum = 3792;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 3793;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3796;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 3796;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 3797;BA.debugLine="Dim rootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 3798;BA.debugLine="If rootMap.ContainsKey(\"files\") Then";
if (_rootmap.ContainsKey((Object)("files"))) { 
 //BA.debugLineNum = 3799;BA.debugLine="Dim files As List = rootMap.Get(\"files\")";
_files = new anywheresoftware.b4a.objects.collections.List();
_files = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_rootmap.Get((Object)("files"))));
 //BA.debugLineNum = 3800;BA.debugLine="Log(\">>> [LEDGER-DEBUG] Ledger Search Result: \"";
__c.LogImpl("017039372",">>> [LEDGER-DEBUG] Ledger Search Result: "+BA.NumberToString(_files.getSize())+" files found.",0);
 //BA.debugLineNum = 3801;BA.debugLine="For Each f As Map In files";
_f = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group13 = _files;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_f = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group13.Get(index13)));
 //BA.debugLineNum = 3802;BA.debugLine="Dim fID As String = f.Get(\"id\")";
_fid = BA.ObjectToString(_f.Get((Object)("id")));
 //BA.debugLineNum = 3803;BA.debugLine="Log(\">>> [LEDGER-DEBUG] Found Ledger File ID: \"";
__c.LogImpl("017039375",">>> [LEDGER-DEBUG] Found Ledger File ID: "+_fid,0);
 //BA.debugLineNum = 3804;BA.debugLine="LedgerQueue.Add(fID)";
_ledgerqueue.Add((Object)(_fid));
 }
};
 }else {
 //BA.debugLineNum = 3807;BA.debugLine="Log(\">>> [LEDGER-DEBUG] No files key in JSON res";
__c.LogImpl("017039379",">>> [LEDGER-DEBUG] No files key in JSON response.",0);
 };
 //BA.debugLineNum = 3809;BA.debugLine="ProcessNextLedger";
_processnextledger();
 //BA.debugLineNum = 3810;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 3811;BA.debugLine="End Sub";
return "";
}
public String  _handleupdatecontact(Geek.God.CRM.App.httpjob _job) throws Exception{
 //BA.debugLineNum = 4658;BA.debugLine="Sub HandleUpdateContact(Job As HttpJob)";
 //BA.debugLineNum = 4659;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 4660;BA.debugLine="RecentlyUpdated.Put(\"Name\", TempProfile.Get(\"Nam";
_recentlyupdated.Put((Object)("Name"),_tempprofile.Get((Object)("Name")));
 //BA.debugLineNum = 4661;BA.debugLine="RecentlyUpdated.Put(\"Updated\", True)";
_recentlyupdated.Put((Object)("Updated"),(Object)(__c.True));
 //BA.debugLineNum = 4662;BA.debugLine="CallSub(searchScreen, \"ShowUpdateSuccess\")";
__c.CallSubNew(ba,(Object)(_searchscreen),"ShowUpdateSuccess");
 }else {
 //BA.debugLineNum = 4664;BA.debugLine="xui.MsgboxAsync(\"Update failed: \" & Job.ErrorMes";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Update failed: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"));
 };
 //BA.debugLineNum = 4666;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 4667;BA.debugLine="End Sub";
return "";
}
public String  _handleupdatesheet(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.Map _tagdata = null;
String _spreadsheetid = "";
 //BA.debugLineNum = 4194;BA.debugLine="Sub HandleUpdateSheet(Job As HttpJob)";
 //BA.debugLineNum = 4195;BA.debugLine="Try";
try { //BA.debugLineNum = 4196;BA.debugLine="Dim TagData As Map = Job.Tag";
_tagdata = new anywheresoftware.b4a.objects.collections.Map();
_tagdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_job._tag /*Object*/ ));
 //BA.debugLineNum = 4197;BA.debugLine="Dim spreadsheetID As String = TagData.Get(\"sprea";
_spreadsheetid = BA.ObjectToString(_tagdata.Get((Object)("spreadsheetID")));
 //BA.debugLineNum = 4199;BA.debugLine="lblStatus.Text = \"Status: Generating Months...\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Generating Months..."));
 //BA.debugLineNum = 4200;BA.debugLine="GenerateMonthTabs(spreadsheetID)";
_generatemonthtabs(_spreadsheetid);
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 4203;BA.debugLine="Log(\"Error updating sheet: \" & LastException)";
__c.LogImpl("017825801","Error updating sheet: "+BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 4204;BA.debugLine="lblStatus.Text = \"Status: Connected\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Connected"));
 };
 //BA.debugLineNum = 4206;BA.debugLine="End Sub";
return "";
}
public String  _handleuploadreceipt(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
String _fileid = "";
String _weblink = "";
 //BA.debugLineNum = 3110;BA.debugLine="Sub HandleUploadReceipt(Job As HttpJob)";
 //BA.debugLineNum = 3111;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 3112;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 3113;BA.debugLine="xui.MsgboxAsync(\"Image Upload Failed: \" & Job.Er";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Image Upload Failed: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 3114;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 3115;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3118;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 3118;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 3119;BA.debugLine="Dim rootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 3120;BA.debugLine="Dim FileID As String = rootMap.Get(\"id\")";
_fileid = BA.ObjectToString(_rootmap.Get((Object)("id")));
 //BA.debugLineNum = 3123;BA.debugLine="Dim WebLink As String = \"https://drive.google.com";
_weblink = "https://drive.google.com/file/d/"+_fileid;
 //BA.debugLineNum = 3126;BA.debugLine="AppendExpenseToSheet(WebLink)";
_appendexpensetosheet(_weblink);
 //BA.debugLineNum = 3127;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 3128;BA.debugLine="End Sub";
return "";
}
public String  _handlevisionocr(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
anywheresoftware.b4a.objects.collections.List _responses = null;
String _fulltext = "";
anywheresoftware.b4a.objects.collections.Map _resp = null;
double _maxamount = 0;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _mamt = null;
String _s = "";
double _v = 0;
String _datepattern = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _mdate = null;
String _timepattern = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _mtime = null;
 //BA.debugLineNum = 3023;BA.debugLine="Sub HandleVisionOCR(Job As HttpJob)";
 //BA.debugLineNum = 3024;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 3025;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 3026;BA.debugLine="Log(\"OCR Failed: \" & Job.ErrorMessage)";
__c.LogImpl("015269891","OCR Failed: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 3027;BA.debugLine="xui.MsgboxAsync(\"OCR Failed. Please enter detail";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("OCR Failed. Please enter details manually."),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 3028;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 3029;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3032;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 3032;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 3033;BA.debugLine="Dim rootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 3034;BA.debugLine="Dim responses As List = rootMap.Get(\"responses\")";
_responses = new anywheresoftware.b4a.objects.collections.List();
_responses = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_rootmap.Get((Object)("responses"))));
 //BA.debugLineNum = 3035;BA.debugLine="Dim fullText As String = \"\"";
_fulltext = "";
 //BA.debugLineNum = 3037;BA.debugLine="If responses.Size > 0 Then";
if (_responses.getSize()>0) { 
 //BA.debugLineNum = 3038;BA.debugLine="Dim resp As Map = responses.Get(0)";
_resp = new anywheresoftware.b4a.objects.collections.Map();
_resp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_responses.Get((int) (0))));
 //BA.debugLineNum = 3039;BA.debugLine="If resp.ContainsKey(\"fullTextAnnotation\") Then";
if (_resp.ContainsKey((Object)("fullTextAnnotation"))) { 
 //BA.debugLineNum = 3040;BA.debugLine="fullText = resp.Get(\"fullTextAnnotation\").As(Ma";
_fulltext = BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resp.Get((Object)("fullTextAnnotation"))))).Get((Object)("text")));
 };
 };
 //BA.debugLineNum = 3045;BA.debugLine="Log(\"RAW OCR TEXT: \" & fullText)";
__c.LogImpl("015269910","RAW OCR TEXT: "+_fulltext,0);
 //BA.debugLineNum = 3047;BA.debugLine="If fullText = \"\" Then";
if ((_fulltext).equals("")) { 
 //BA.debugLineNum = 3048;BA.debugLine="xui.MsgboxAsync(\"No text detected.\", \"OCR Result";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("No text detected."),BA.ObjectToCharSequence("OCR Result"));
 //BA.debugLineNum = 3049;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 3050;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3054;BA.debugLine="Dim MaxAmount As Double = 0";
_maxamount = 0;
 //BA.debugLineNum = 3055;BA.debugLine="Dim mAmt As Matcher = Regex.Matcher(\"\\$?\\d+\\.\\d{2";
_mamt = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_mamt = __c.Regex.Matcher("\\$?\\d+\\.\\d{2}",_fulltext);
 //BA.debugLineNum = 3056;BA.debugLine="Do While mAmt.Find";
while (_mamt.Find()) {
 //BA.debugLineNum = 3057;BA.debugLine="Dim s As String = mAmt.Match.Replace(\"$\", \"\")";
_s = _mamt.getMatch().replace("$","");
 //BA.debugLineNum = 3058;BA.debugLine="If IsNumber(s) Then";
if (__c.IsNumber(_s)) { 
 //BA.debugLineNum = 3059;BA.debugLine="Dim v As Double = s";
_v = (double)(Double.parseDouble(_s));
 //BA.debugLineNum = 3060;BA.debugLine="If v > MaxAmount Then MaxAmount = v";
if (_v>_maxamount) { 
_maxamount = _v;};
 };
 }
;
 //BA.debugLineNum = 3063;BA.debugLine="If MaxAmount > 0 Then";
if (_maxamount>0) { 
 //BA.debugLineNum = 3064;BA.debugLine="ExpenseAmount.Text = NumberFormat2(MaxAmount, 1,";
_expenseamount.setText(BA.ObjectToCharSequence(__c.NumberFormat2(_maxamount,(int) (1),(int) (2),(int) (2),__c.False)));
 };
 //BA.debugLineNum = 3068;BA.debugLine="Dim DatePattern As String = \"\\b(\\d{1,2}[/-]\\d{1,2";
_datepattern = "\\b(\\d{1,2}[/-]\\d{1,2}[/-]\\d{2,4})\\b";
 //BA.debugLineNum = 3069;BA.debugLine="Dim mDate As Matcher = Regex.Matcher(DatePattern,";
_mdate = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_mdate = __c.Regex.Matcher(_datepattern,_fulltext);
 //BA.debugLineNum = 3070;BA.debugLine="If mDate.Find Then";
if (_mdate.Find()) { 
 //BA.debugLineNum = 3071;BA.debugLine="ExtractedDate = mDate.Match";
_extracteddate = _mdate.getMatch();
 //BA.debugLineNum = 3072;BA.debugLine="Log(\"OCR Date Found: \" & ExtractedDate)";
__c.LogImpl("015269937","OCR Date Found: "+_extracteddate,0);
 };
 //BA.debugLineNum = 3076;BA.debugLine="Dim TimePattern As String = \"\\b(\\d{1,2}:\\d{2}(?:\\";
_timepattern = "\\b(\\d{1,2}:\\d{2}(?:\\s?[AaPp][Mm])?)\\b";
 //BA.debugLineNum = 3077;BA.debugLine="Dim mTime As Matcher = Regex.Matcher(TimePattern,";
_mtime = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_mtime = __c.Regex.Matcher(_timepattern,_fulltext);
 //BA.debugLineNum = 3078;BA.debugLine="If mTime.Find Then";
if (_mtime.Find()) { 
 //BA.debugLineNum = 3079;BA.debugLine="ExtractedTime = mTime.Match";
_extractedtime = _mtime.getMatch();
 //BA.debugLineNum = 3080;BA.debugLine="Log(\"OCR Time Found: \" & ExtractedTime)";
__c.LogImpl("015269945","OCR Time Found: "+_extractedtime,0);
 };
 //BA.debugLineNum = 3083;BA.debugLine="ExpenseDateLabel.Text = \"Date: \" & ExtractedDate";
_expensedatelabel.setText(BA.ObjectToCharSequence("Date: "+_extracteddate+" | Time: "+_extractedtime));
 //BA.debugLineNum = 3084;BA.debugLine="ExpenseNotes.Text = fullText.SubString2(0, Min(fu";
_expensenotes.setText(BA.ObjectToCharSequence(_fulltext.substring((int) (0),(int) (__c.Min(_fulltext.length(),100))).replace(BA.ObjectToString(__c.Chr((int) (10)))," ")));
 //BA.debugLineNum = 3086;BA.debugLine="ToastMessageShow(\"Scanned: $\" & ExpenseAmount.Tex";
__c.ToastMessageShow(BA.ObjectToCharSequence("Scanned: $"+_expenseamount.getText()),__c.False);
 //BA.debugLineNum = 3087;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 3088;BA.debugLine="End Sub";
return "";
}
public boolean  _hasallfilesaccess() throws Exception{
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 2400;BA.debugLine="Private Sub HasAllFilesAccess As Boolean";
 //BA.debugLineNum = 2401;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 2402;BA.debugLine="If p.SdkVersion < 30 Then Return True";
if (_p.getSdkVersion()<30) { 
if (true) return __c.True;};
 //BA.debugLineNum = 2404;BA.debugLine="Try";
try { //BA.debugLineNum = 2405;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 2406;BA.debugLine="jo.InitializeStatic(\"android.os.Environment\")";
_jo.InitializeStatic("android.os.Environment");
 //BA.debugLineNum = 2407;BA.debugLine="Return jo.RunMethod(\"isExternalStorageManager\",";
if (true) return BA.ObjectToBoolean(_jo.RunMethod("isExternalStorageManager",(Object[])(__c.Null)));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 2409;BA.debugLine="Log(\"Error checking file access: \" & LastExcepti";
__c.LogImpl("014286857","Error checking file access: "+BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 2410;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2412;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 143;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 144;BA.debugLine="Log(\">>> [B4XMainPage] Initialize called\")";
__c.LogImpl("011403265",">>> [B4XMainPage] Initialize called",0);
 //BA.debugLineNum = 145;BA.debugLine="OAuth2.Initialize(Me, \"OAuth2\", CLIENT_ID, \"https";
_oauth2._initialize /*String*/ (ba,this,"OAuth2",_client_id,"https://www.googleapis.com/auth/spreadsheets https://www.googleapis.com/auth/calendar https://www.googleapis.com/auth/contacts https://www.googleapis.com/auth/drive https://www.googleapis.com/auth/drive.file");
 //BA.debugLineNum = 146;BA.debugLine="Log(\">>> [OAuth] OAuth2.Initialize completed\")";
__c.LogImpl("011403267",">>> [OAuth] OAuth2.Initialize completed",0);
 //BA.debugLineNum = 147;BA.debugLine="ime.Initialize(\"ime\")";
_ime.Initialize("ime");
 //BA.debugLineNum = 148;BA.debugLine="ime.AddHeightChangedEvent";
_ime.AddHeightChangedEvent(ba);
 //BA.debugLineNum = 149;BA.debugLine="gps.Initialize(\"GPS\")";
_gps.Initialize("GPS");
 //BA.debugLineNum = 150;BA.debugLine="GeocodedLocations.Initialize";
_geocodedlocations.Initialize();
 //BA.debugLineNum = 151;BA.debugLine="FailedGeocodes.Initialize";
_failedgeocodes.Initialize();
 //BA.debugLineNum = 152;BA.debugLine="FuzzyCandidates.Initialize";
_fuzzycandidates.Initialize();
 //BA.debugLineNum = 153;BA.debugLine="ActiveJobMap.Initialize";
_activejobmap.Initialize();
 //BA.debugLineNum = 154;BA.debugLine="RecentlyUpdated.Initialize";
_recentlyupdated.Initialize();
 //BA.debugLineNum = 155;BA.debugLine="LastDashboardItems.Initialize";
_lastdashboarditems.Initialize();
 //BA.debugLineNum = 156;BA.debugLine="ScrapeMap.Initialize";
_scrapemap.Initialize();
 //BA.debugLineNum = 157;BA.debugLine="ScrapeQueue.Initialize";
_scrapequeue.Initialize();
 //BA.debugLineNum = 158;BA.debugLine="VMPlayer.Initialize";
_vmplayer.Initialize();
 //BA.debugLineNum = 159;BA.debugLine="PendingSlot.Initialize";
_pendingslot.Initialize();
 //BA.debugLineNum = 160;BA.debugLine="HolidayBanner.Initialize";
_holidaybanner.Initialize();
 //BA.debugLineNum = 163;BA.debugLine="SP.Initialize(2)";
_sp.Initialize((int) (2));
 //BA.debugLineNum = 164;BA.debugLine="SoundIDs.Initialize";
_soundids.Initialize();
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public boolean  _isclientnamevalid(String _rawname) throws Exception{
String _lower = "";
String[] _parts = null;
 //BA.debugLineNum = 2518;BA.debugLine="Private Sub IsClientNameValid(RawName As String) A";
 //BA.debugLineNum = 2519;BA.debugLine="If RawName = \"\" Then Return False";
if ((_rawname).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2520;BA.debugLine="Dim Lower As String = RawName.ToLowerCase";
_lower = _rawname.toLowerCase();
 //BA.debugLineNum = 2523;BA.debugLine="If Lower.Contains(\"geek\") Or Lower.Contains(\"god\"";
if (_lower.contains("geek") || _lower.contains("god") || _lower.contains("goddess")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2526;BA.debugLine="If Lower.StartsWith(\"michael\") Then";
if (_lower.startsWith("michael")) { 
 //BA.debugLineNum = 2527;BA.debugLine="If Lower = \"michael\" Then Return False ' Block s";
if ((_lower).equals("michael")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2528;BA.debugLine="If Lower.Contains(\" \") Then";
if (_lower.contains(" ")) { 
 //BA.debugLineNum = 2529;BA.debugLine="Dim parts() As String = Regex.Split(\" \", Lower)";
_parts = __c.Regex.Split(" ",_lower);
 //BA.debugLineNum = 2530;BA.debugLine="If parts.Length > 1 And parts(1).StartsWith(\"mc";
if (_parts.length>1 && _parts[(int) (1)].startsWith("mc")) { 
if (true) return __c.False;};
 };
 };
 //BA.debugLineNum = 2535;BA.debugLine="If Lower.StartsWith(\"erin\") Then";
if (_lower.startsWith("erin")) { 
 //BA.debugLineNum = 2536;BA.debugLine="If Lower = \"erin\" Then Return False ' Block solo";
if ((_lower).equals("erin")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2537;BA.debugLine="If Lower.Contains(\" \") Then";
if (_lower.contains(" ")) { 
 //BA.debugLineNum = 2538;BA.debugLine="Dim parts() As String = Regex.Split(\" \", Lower)";
_parts = __c.Regex.Split(" ",_lower);
 //BA.debugLineNum = 2539;BA.debugLine="If parts.Length > 1 And parts(1).StartsWith(\"na";
if (_parts.length>1 && _parts[(int) (1)].startsWith("na")) { 
if (true) return __c.False;};
 };
 };
 //BA.debugLineNum = 2543;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 2544;BA.debugLine="End Sub";
return false;
}
public String  _jobdone(Geek.God.CRM.App.httpjob _job) throws Exception{
 //BA.debugLineNum = 6087;BA.debugLine="Sub JobDone (Job As HttpJob)";
 //BA.debugLineNum = 6088;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
__c.LogImpl("021889025","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
 //BA.debugLineNum = 6090;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 6091;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"FetchDashboard","ListGroups","CreateGroup","CreateNewContact","UpdateContact","UpdateContactAfterClose","SearchContact","FetchAllConnections","SearchDate","SearchContactForID","CreateAppointment","CreateCalendarEvent","GetSource","CreateNew","CopyTemplate","UpdateSheet","GenerateMonths","SearchLedgerFiles","GetSheetMetadata","BatchGetLedger","AppendToLedger","CreateLedger","PopulateLedger","Geocode","UpdateCalendarColor","VisionOCR","UploadReceipt","GetReceiptLink","AppendExpense","FetchStats")) {
case 0: {
 //BA.debugLineNum = 6094;BA.debugLine="HandleFetchDashboard(Job)";
_handlefetchdashboard(_job);
 break; }
case 1: {
 //BA.debugLineNum = 6098;BA.debugLine="HandleListGroups(Job)";
_handlelistgroups(_job);
 break; }
case 2: {
 //BA.debugLineNum = 6100;BA.debugLine="Log(\"Contact group created successfully\")";
__c.LogImpl("021889037","Contact group created successfully",0);
 break; }
case 3: {
 //BA.debugLineNum = 6102;BA.debugLine="HandleCreateNewContact(Job)";
_handlecreatenewcontact(_job);
 break; }
case 4: {
 //BA.debugLineNum = 6104;BA.debugLine="HandleUpdateContact(Job)";
_handleupdatecontact(_job);
 break; }
case 5: {
 //BA.debugLineNum = 6106;BA.debugLine="Log(\"Contact updated after closeout\")";
__c.LogImpl("021889043","Contact updated after closeout",0);
 //BA.debugLineNum = 6107;BA.debugLine="CloseOut_Helper_Step3(Job.Tag)";
_closeout_helper_step3((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_job._tag /*Object*/ )));
 break; }
case 6: {
 //BA.debugLineNum = 6111;BA.debugLine="HandleSearchContact(Job)";
_handlesearchcontact(_job);
 break; }
case 7: {
 //BA.debugLineNum = 6113;BA.debugLine="HandleFetchAllConnections(Job)";
_handlefetchallconnections(_job);
 break; }
case 8: {
 //BA.debugLineNum = 6115;BA.debugLine="HandleSearchDate(Job)";
_handlesearchdate(_job);
 break; }
case 9: {
 //BA.debugLineNum = 6117;BA.debugLine="HandleSearchForID(Job)";
_handlesearchforid(_job);
 break; }
case 10: 
case 11: {
 //BA.debugLineNum = 6119;BA.debugLine="HandleCalendarSuccess(Job)";
_handlecalendarsuccess(_job);
 break; }
case 12: {
 //BA.debugLineNum = 6123;BA.debugLine="HandleGetSource(Job)";
_handlegetsource(_job);
 break; }
case 13: {
 //BA.debugLineNum = 6125;BA.debugLine="HandleCreateNew(Job)";
_handlecreatenew(_job);
 break; }
case 14: {
 //BA.debugLineNum = 6127;BA.debugLine="HandleCopyTemplate(Job)";
_handlecopytemplate(_job);
 break; }
case 15: {
 //BA.debugLineNum = 6129;BA.debugLine="HandleUpdateSheet(Job)";
_handleupdatesheet(_job);
 break; }
case 16: {
 //BA.debugLineNum = 6131;BA.debugLine="HandleGenerateMonths(Job)";
_handlegeneratemonths(_job);
 break; }
case 17: {
 //BA.debugLineNum = 6133;BA.debugLine="HandleSearchLedgerFiles(Job)";
_handlesearchledgerfiles(_job);
 break; }
case 18: {
 //BA.debugLineNum = 6135;BA.debugLine="HandleGetSheetMetadata(Job)";
_handlegetsheetmetadata(_job);
 break; }
case 19: {
 //BA.debugLineNum = 6137;BA.debugLine="BatchGetLedger(Job)";
_batchgetledger(_job);
 break; }
case 20: {
 //BA.debugLineNum = 6139;BA.debugLine="CloseOut_Finished(Job.Tag)";
_closeout_finished((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_job._tag /*Object*/ )));
 break; }
case 21: {
 //BA.debugLineNum = 6141;BA.debugLine="HandleCreateLedger(Job)";
_handlecreateledger(_job);
 break; }
case 22: {
 //BA.debugLineNum = 6143;BA.debugLine="HandlePopulateLedger(Job)";
_handlepopulateledger(_job);
 break; }
case 23: {
 //BA.debugLineNum = 6147;BA.debugLine="HandleGeocode(Job)";
_handlegeocode(_job);
 break; }
case 24: {
 //BA.debugLineNum = 6151;BA.debugLine="CloseOut_Helper_Step4(Job.Tag)";
_closeout_helper_step4((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_job._tag /*Object*/ )));
 break; }
case 25: {
 //BA.debugLineNum = 6155;BA.debugLine="HandleVisionOCR(Job)";
_handlevisionocr(_job);
 break; }
case 26: {
 //BA.debugLineNum = 6157;BA.debugLine="HandleUploadReceipt(Job)";
_handleuploadreceipt(_job);
 break; }
case 27: {
 //BA.debugLineNum = 6159;BA.debugLine="HandleGetReceiptLink(Job)";
_handlegetreceiptlink(_job);
 break; }
case 28: {
 //BA.debugLineNum = 6161;BA.debugLine="HandleAppendExpense(Job)";
_handleappendexpense(_job);
 break; }
case 29: {
 //BA.debugLineNum = 6165;BA.debugLine="Log(\"Stats fetched\")";
__c.LogImpl("021889102","Stats fetched",0);
 break; }
default: {
 //BA.debugLineNum = 6168;BA.debugLine="Log(\"Unhandled job: \" & Job.JobName)";
__c.LogImpl("021889105","Unhandled job: "+_job._jobname /*String*/ ,0);
 break; }
}
;
 }else {
 //BA.debugLineNum = 6171;BA.debugLine="Log(\"Job Error [\" & Job.JobName & \"]: \" & Job.Er";
__c.LogImpl("021889108","Job Error ["+_job._jobname /*String*/ +"]: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 6174;BA.debugLine="If Job.ErrorMessage.Contains(\"401\") Or Job.Error";
if (_job._errormessage /*String*/ .contains("401") || _job._errormessage /*String*/ .contains("UNAUTHENTICATED")) { 
 //BA.debugLineNum = 6175;BA.debugLine="Log(\"Token Expired. Resetting.\")";
__c.LogImpl("021889112","Token Expired. Resetting.",0);
 //BA.debugLineNum = 6176;BA.debugLine="OAuth2.access_token = \"\"";
_oauth2._access_token /*String*/  = "";
 //BA.debugLineNum = 6177;BA.debugLine="lblStatus.Text = \"Session Expired. Please Login";
_lblstatus.setText(BA.ObjectToCharSequence("Session Expired. Please Login."));
 //BA.debugLineNum = 6178;BA.debugLine="xui.MsgboxAsync(\"Your session has expired. Plea";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Your session has expired. Please tap 'Login' to reconnect."),BA.ObjectToCharSequence("Session Expired"));
 //BA.debugLineNum = 6179;BA.debugLine="btnLogin.Visible = True";
_btnlogin.setVisible(__c.True);
 //BA.debugLineNum = 6180;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 6181;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 6185;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"FetchDashboard","CreateNewContact","VisionOCR","UploadReceipt","AppendExpense")) {
case 0: {
 //BA.debugLineNum = 6187;BA.debugLine="lblStatus.Text = \"Status: Error Loading\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Error Loading"));
 //BA.debugLineNum = 6188;BA.debugLine="lblStatus.TextColor = 0xFFD32F2F";
_lblstatus.setTextColor(((int)0xffd32f2f));
 break; }
case 1: {
 //BA.debugLineNum = 6190;BA.debugLine="xui.MsgboxAsync(\"Failed to create contact: \" &";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Failed to create contact: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"));
 break; }
case 2: {
 //BA.debugLineNum = 6192;BA.debugLine="xui.MsgboxAsync(\"OCR Failed. Please enter deta";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("OCR Failed. Please enter details manually."),BA.ObjectToCharSequence("Error"));
 break; }
case 3: {
 //BA.debugLineNum = 6194;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 6195;BA.debugLine="xui.MsgboxAsync(\"Image Upload Failed: \" & Job.";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Image Upload Failed: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"));
 break; }
case 4: {
 //BA.debugLineNum = 6197;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 6198;BA.debugLine="xui.MsgboxAsync(\"Sheet Update Failed: \" & Job.";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Sheet Update Failed: "+_job._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"));
 break; }
}
;
 };
 //BA.debugLineNum = 6202;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 6203;BA.debugLine="End Sub";
return "";
}
public String  _jobdone_external() throws Exception{
 //BA.debugLineNum = 3447;BA.debugLine="Public Sub JobDone_External";
 //BA.debugLineNum = 3448;BA.debugLine="ActiveAppointmentID = \"\"";
_activeappointmentid = "";
 //BA.debugLineNum = 3449;BA.debugLine="ActiveArrivalTime = 0";
_activearrivaltime = (long) (0);
 //BA.debugLineNum = 3450;BA.debugLine="ActiveJobMap.Initialize";
_activejobmap.Initialize();
 //BA.debugLineNum = 3451;BA.debugLine="JobTimer.Enabled = False";
_jobtimer.setEnabled(__c.False);
 //BA.debugLineNum = 3453;BA.debugLine="btnCloseout.Color = xui.Color_Red";
_btncloseout.setColor(_xui.Color_Red);
 //BA.debugLineNum = 3454;BA.debugLine="btnCloseout.TextColor = xui.Color_White";
_btncloseout.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 3455;BA.debugLine="btnCloseout.Text = \"No Apt Started\"";
_btncloseout.setText(BA.ObjectToCharSequence("No Apt Started"));
 //BA.debugLineNum = 3456;BA.debugLine="btnCloseout.Enabled = False";
_btncloseout.setEnabled(__c.False);
 //BA.debugLineNum = 3458;BA.debugLine="lblStatus.Text = \"Status: Connected\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Connected"));
 //BA.debugLineNum = 3459;BA.debugLine="RefreshDashboard";
_refreshdashboard();
 //BA.debugLineNum = 3460;BA.debugLine="B4XPages.ShowPage(\"B4XMainPage\")";
_b4xpages._showpage /*String*/ (ba,"B4XMainPage");
 //BA.debugLineNum = 3462;BA.debugLine="xui.MsgboxAsync(\"Job closed out successfully!\", \"";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Job closed out successfully!"),BA.ObjectToCharSequence("Complete"));
 //BA.debugLineNum = 3463;BA.debugLine="End Sub";
return "";
}
public String  _jobtimer_tick() throws Exception{
long _elapsed = 0L;
int _minutes = 0;
int _hours = 0;
int _remainmin = 0;
String _timestr = "";
 //BA.debugLineNum = 4416;BA.debugLine="Sub JobTimer_Tick";
 //BA.debugLineNum = 4417;BA.debugLine="If ActiveAppointmentID = \"\" Then";
if ((_activeappointmentid).equals("")) { 
 //BA.debugLineNum = 4418;BA.debugLine="JobTimer.Enabled = False";
_jobtimer.setEnabled(__c.False);
 //BA.debugLineNum = 4419;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4422;BA.debugLine="Dim Elapsed As Long = DateTime.Now - ActiveArriva";
_elapsed = (long) (__c.DateTime.getNow()-_activearrivaltime);
 //BA.debugLineNum = 4423;BA.debugLine="Dim Minutes As Int = Elapsed / DateTime.TicksPerM";
_minutes = (int) (_elapsed/(double)__c.DateTime.TicksPerMinute);
 //BA.debugLineNum = 4424;BA.debugLine="Dim Hours As Int = Minutes / 60";
_hours = (int) (_minutes/(double)60);
 //BA.debugLineNum = 4425;BA.debugLine="Dim RemainMin As Int = Minutes Mod 60";
_remainmin = (int) (_minutes%60);
 //BA.debugLineNum = 4427;BA.debugLine="Dim TimeStr As String = Hours & \"h \" & RemainMin";
_timestr = BA.NumberToString(_hours)+"h "+BA.NumberToString(_remainmin)+"m";
 //BA.debugLineNum = 4428;BA.debugLine="btnCloseout.Text = \"Close Out: \" & ActiveJobMap.G";
_btncloseout.setText(BA.ObjectToCharSequence("Close Out: "+BA.ObjectToString(_activejobmap.GetDefault((Object)("Name"),(Object)("Client")))+" ("+_timestr+")"));
 //BA.debugLineNum = 4429;BA.debugLine="End Sub";
return "";
}
public String  _launchappointmentview(anywheresoftware.b4a.objects.collections.Map _profile) throws Exception{
 //BA.debugLineNum = 1608;BA.debugLine="Public Sub LaunchAppointmentView(Profile As Map)";
 //BA.debugLineNum = 1609;BA.debugLine="B4XPages.ShowPage(\"AppointmentPage\")";
_b4xpages._showpage /*String*/ (ba,"AppointmentPage");
 //BA.debugLineNum = 1610;BA.debugLine="CallSub2(appointmentScreen, \"LoadClientForAppt\",";
__c.CallSubNew2(ba,(Object)(_appointmentscreen),"LoadClientForAppt",(Object)(_profile));
 //BA.debugLineNum = 1611;BA.debugLine="End Sub";
return "";
}
public String  _launchbrowser(String _url) throws Exception{
anywheresoftware.b4a.objects.IntentWrapper _i = null;
 //BA.debugLineNum = 2867;BA.debugLine="Private Sub LaunchBrowser(URL As String)";
 //BA.debugLineNum = 2868;BA.debugLine="If URL = \"\" Or URL.Contains(\"null\") Then";
if ((_url).equals("") || _url.contains("null")) { 
 //BA.debugLineNum = 2869;BA.debugLine="xui.MsgboxAsync(\"Link not available yet.\", \"Erro";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Link not available yet."),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 2870;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 2872;BA.debugLine="Try";
try { //BA.debugLineNum = 2873;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 2874;BA.debugLine="i.Initialize(i.ACTION_VIEW, URL)";
_i.Initialize(_i.ACTION_VIEW,_url);
 //BA.debugLineNum = 2875;BA.debugLine="StartActivity(i)";
__c.StartActivity(ba,(Object)(_i.getObject()));
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 2877;BA.debugLine="Log(\"Browser Launch Error: \" & LastException)";
__c.LogImpl("014745610","Browser Launch Error: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 2879;BA.debugLine="End Sub";
return "";
}
public String  _launchdialer(String _phonenumber) throws Exception{
String _cleanphone = "";
anywheresoftware.b4a.objects.IntentWrapper _i = null;
 //BA.debugLineNum = 4936;BA.debugLine="Public Sub LaunchDialer(PhoneNumber As String)";
 //BA.debugLineNum = 4937;BA.debugLine="If PhoneNumber = \"\" Or PhoneNumber = \"No Phone\" T";
if ((_phonenumber).equals("") || (_phonenumber).equals("No Phone")) { 
if (true) return "";};
 //BA.debugLineNum = 4938;BA.debugLine="Dim cleanPhone As String = PhoneNumber.Replace(\"(";
_cleanphone = _phonenumber.replace("(","").replace(")","").replace("-","").replace(" ","");
 //BA.debugLineNum = 4939;BA.debugLine="Try";
try { //BA.debugLineNum = 4940;BA.debugLine="Dim i As Intent : i.Initialize(i.ACTION_VIEW, \"t";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 4940;BA.debugLine="Dim i As Intent : i.Initialize(i.ACTION_VIEW, \"t";
_i.Initialize(_i.ACTION_VIEW,"tel:"+_cleanphone);
 //BA.debugLineNum = 4941;BA.debugLine="StartActivity(i)";
__c.StartActivity(ba,(Object)(_i.getObject()));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 4943;BA.debugLine="Log(\"Dialer Error: \" & LastException.Message)";
__c.LogImpl("020119559","Dialer Error: "+__c.LastException(ba).getMessage(),0);
 };
 //BA.debugLineNum = 4945;BA.debugLine="End Sub";
return "";
}
public String  _launchmaps(String _address) throws Exception{
anywheresoftware.b4a.objects.StringUtils _su = null;
anywheresoftware.b4a.objects.IntentWrapper _i = null;
 //BA.debugLineNum = 5014;BA.debugLine="Public Sub LaunchMaps(Address As String)";
 //BA.debugLineNum = 5015;BA.debugLine="If Address = \"\" Or Address = \"No Address\" Then Re";
if ((_address).equals("") || (_address).equals("No Address")) { 
if (true) return "";};
 //BA.debugLineNum = 5016;BA.debugLine="Try";
try { //BA.debugLineNum = 5017;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 5018;BA.debugLine="Dim i As Intent : i.Initialize(i.ACTION_VIEW, \"g";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 5018;BA.debugLine="Dim i As Intent : i.Initialize(i.ACTION_VIEW, \"g";
_i.Initialize(_i.ACTION_VIEW,"geo:0,0?q="+_su.EncodeUrl(_address,"UTF8"));
 //BA.debugLineNum = 5019;BA.debugLine="StartActivity(i)";
__c.StartActivity(ba,(Object)(_i.getObject()));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 5021;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("020447239",__c.LastException(ba).getMessage(),0);
 };
 //BA.debugLineNum = 5023;BA.debugLine="End Sub";
return "";
}
public String  _launchsms(String _phonenumber,String _message) throws Exception{
String _cleanphone = "";
anywheresoftware.b4a.objects.IntentWrapper _i = null;
 //BA.debugLineNum = 5002;BA.debugLine="Public Sub LaunchSMS(PhoneNumber As String, Messag";
 //BA.debugLineNum = 5003;BA.debugLine="If PhoneNumber = \"\" Or PhoneNumber = \"No Phone\" T";
if ((_phonenumber).equals("") || (_phonenumber).equals("No Phone")) { 
if (true) return "";};
 //BA.debugLineNum = 5004;BA.debugLine="Dim cleanPhone As String = PhoneNumber.Replace(\"(";
_cleanphone = _phonenumber.replace("(","").replace(")","").replace("-","").replace(" ","");
 //BA.debugLineNum = 5005;BA.debugLine="Try";
try { //BA.debugLineNum = 5006;BA.debugLine="Dim i As Intent : i.Initialize(i.ACTION_VIEW, \"s";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 5006;BA.debugLine="Dim i As Intent : i.Initialize(i.ACTION_VIEW, \"s";
_i.Initialize(_i.ACTION_VIEW,"sms:"+_cleanphone);
 //BA.debugLineNum = 5007;BA.debugLine="If Message <> \"\" Then i.PutExtra(\"sms_body\", Mes";
if ((_message).equals("") == false) { 
_i.PutExtra("sms_body",(Object)(_message));};
 //BA.debugLineNum = 5008;BA.debugLine="StartActivity(i)";
__c.StartActivity(ba,(Object)(_i.getObject()));
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 5010;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("020381704",__c.LastException(ba).getMessage(),0);
 };
 //BA.debugLineNum = 5012;BA.debugLine="End Sub";
return "";
}
public void  _lblarrival_click() throws Exception{
ResumableSub_lblArrival_Click rsub = new ResumableSub_lblArrival_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_lblArrival_Click extends BA.ResumableSub {
public ResumableSub_lblArrival_Click(Geek.God.CRM.App.b4xmainpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.b4xmainpage parent;
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
boolean _istagmap = false;
anywheresoftware.b4a.objects.collections.Map _datamap = null;
String _apptid = "";
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 4374;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.Sender(ba)));
 //BA.debugLineNum = 4375;BA.debugLine="Dim IsTagMap As Boolean = btn.Tag Is Map";
_istagmap = _btn.getTag() instanceof java.util.Map;
 //BA.debugLineNum = 4376;BA.debugLine="If IsTagMap = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_istagmap==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 4377;BA.debugLine="Log(\"lblArrival_Click: Tag is not a Map\")";
parent.__c.LogImpl("019070980","lblArrival_Click: Tag is not a Map",0);
 //BA.debugLineNum = 4378;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 4381;BA.debugLine="Dim DataMap As Map = btn.Tag";
_datamap = new anywheresoftware.b4a.objects.collections.Map();
_datamap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_btn.getTag()));
 //BA.debugLineNum = 4382;BA.debugLine="Dim ApptID As String = DataMap.GetDefault(\"ID\", \"";
_apptid = BA.ObjectToString(_datamap.GetDefault((Object)("ID"),(Object)("")));
 //BA.debugLineNum = 4384;BA.debugLine="If ApptID = \"\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((_apptid).equals("")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 4385;BA.debugLine="Log(\"lblArrival_Click: No appointment ID\")";
parent.__c.LogImpl("019070988","lblArrival_Click: No appointment ID",0);
 //BA.debugLineNum = 4386;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
 //BA.debugLineNum = 4389;BA.debugLine="If ApptID = ActiveAppointmentID Then";

case 8:
//if
this.state = 11;
if ((_apptid).equals(parent._activeappointmentid)) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 4390;BA.debugLine="xui.MsgboxAsync(\"This job is already active.\", \"";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("This job is already active."),BA.ObjectToCharSequence("Info"));
 //BA.debugLineNum = 4391;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
 //BA.debugLineNum = 4394;BA.debugLine="If ActiveAppointmentID <> \"\" Then";

case 11:
//if
this.state = 14;
if ((parent._activeappointmentid).equals("") == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 4395;BA.debugLine="xui.MsgboxAsync(\"Please close the current job be";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Please close the current job before starting a new one."),BA.ObjectToCharSequence("Job Active"));
 //BA.debugLineNum = 4396;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
 //BA.debugLineNum = 4399;BA.debugLine="Msgbox2Async(\"Confirm arrival?\", \"Start Job\", \"Ye";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Confirm arrival?"),BA.ObjectToCharSequence("Start Job"),"Yes","Cancel","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
 //BA.debugLineNum = 4400;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 19;
return;
case 19:
//C
this.state = 15;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 4401;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 4402;BA.debugLine="ActiveAppointmentID = ApptID";
parent._activeappointmentid = _apptid;
 //BA.debugLineNum = 4403;BA.debugLine="ActiveArrivalTime = DateTime.Now";
parent._activearrivaltime = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 4404;BA.debugLine="ActiveJobMap = DataMap";
parent._activejobmap = _datamap;
 //BA.debugLineNum = 4406;BA.debugLine="btnCloseout.Text = \"Close Out: \" & DataMap.GetDe";
parent._btncloseout.setText(BA.ObjectToCharSequence("Close Out: "+BA.ObjectToString(_datamap.GetDefault((Object)("Name"),(Object)("Client")))));
 //BA.debugLineNum = 4407;BA.debugLine="btnCloseout.Color = 0xFF4CAF50";
parent._btncloseout.setColor(((int)0xff4caf50));
 //BA.debugLineNum = 4408;BA.debugLine="btnCloseout.TextColor = xui.Color_White";
parent._btncloseout.setTextColor(parent._xui.Color_White);
 //BA.debugLineNum = 4409;BA.debugLine="btnCloseout.Enabled = True";
parent._btncloseout.setEnabled(parent.__c.True);
 //BA.debugLineNum = 4411;BA.debugLine="JobTimer.Enabled = True";
parent._jobtimer.setEnabled(parent.__c.True);
 //BA.debugLineNum = 4412;BA.debugLine="RefreshDashboard";
parent._refreshdashboard();
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 4414;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _msgbox_result(int _result) throws Exception{
}
public String  _lbldashaddr_click() throws Exception{
String _caddr = "";
 //BA.debugLineNum = 4368;BA.debugLine="Sub lblDashAddr_Click";
 //BA.debugLineNum = 4369;BA.debugLine="Dim cAddr As String = Sender.As(B4XView).Tag";
_caddr = BA.ObjectToString(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)))).getTag());
 //BA.debugLineNum = 4370;BA.debugLine="LaunchMaps(cAddr)";
_launchmaps(_caddr);
 //BA.debugLineNum = 4371;BA.debugLine="End Sub";
return "";
}
public String  _lbldashname_click() throws Exception{
String _cname = "";
 //BA.debugLineNum = 4351;BA.debugLine="Sub lblDashName_Click";
 //BA.debugLineNum = 4352;BA.debugLine="Dim cName As String = Sender.As(B4XView).Tag";
_cname = BA.ObjectToString(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)))).getTag());
 //BA.debugLineNum = 4353;BA.debugLine="B4XPages.ShowPage(\"SearchPage\")";
_b4xpages._showpage /*String*/ (ba,"SearchPage");
 //BA.debugLineNum = 4354;BA.debugLine="CallSub2(searchScreen, \"SearchContact\", cName)";
__c.CallSubNew2(ba,(Object)(_searchscreen),"SearchContact",(Object)(_cname));
 //BA.debugLineNum = 4355;BA.debugLine="End Sub";
return "";
}
public void  _lbldashphone_click() throws Exception{
ResumableSub_lblDashPhone_Click rsub = new ResumableSub_lblDashPhone_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_lblDashPhone_Click extends BA.ResumableSub {
public ResumableSub_lblDashPhone_Click(Geek.God.CRM.App.b4xmainpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.b4xmainpage parent;
String _cphone = "";
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 4358;BA.debugLine="Dim cPhone As String = Sender.As(B4XView).Tag";
_cphone = BA.ObjectToString(((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.Sender(ba)))).getTag());
 //BA.debugLineNum = 4359;BA.debugLine="Msgbox2Async(\"Contact Client?\", \"Contact\", \"Call\"";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Contact Client?"),BA.ObjectToCharSequence("Contact"),"Call","Cancel","Text",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
 //BA.debugLineNum = 4360;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 4361;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}else if(_result==parent.__c.DialogResponse.NEGATIVE) { 
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 4362;BA.debugLine="LaunchDialer(cPhone)";
parent._launchdialer(_cphone);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 4364;BA.debugLine="LaunchSMS(cPhone,\"\")";
parent._launchsms(_cphone,"");
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 4366;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public int  _levenshteindistance(String _s,String _t) throws Exception{
int _n = 0;
int _m = 0;
int[][] _d = null;
int _i = 0;
int _j = 0;
int _cost = 0;
int _min1 = 0;
int _min2 = 0;
int _min3 = 0;
 //BA.debugLineNum = 3695;BA.debugLine="Private Sub LevenshteinDistance(s As String, t As";
 //BA.debugLineNum = 3696;BA.debugLine="Dim n As Int = s.Length";
_n = _s.length();
 //BA.debugLineNum = 3697;BA.debugLine="Dim m As Int = t.Length";
_m = _t.length();
 //BA.debugLineNum = 3698;BA.debugLine="If n = 0 Then Return m";
if (_n==0) { 
if (true) return _m;};
 //BA.debugLineNum = 3699;BA.debugLine="If m = 0 Then Return n";
if (_m==0) { 
if (true) return _n;};
 //BA.debugLineNum = 3700;BA.debugLine="Dim d(n + 1, m + 1) As Int";
_d = new int[(int) (_n+1)][];
{
int d0 = _d.length;
int d1 = (int) (_m+1);
for (int i0 = 0;i0 < d0;i0++) {
_d[i0] = new int[d1];
}
}
;
 //BA.debugLineNum = 3701;BA.debugLine="For i = 0 To n";
{
final int step6 = 1;
final int limit6 = _n;
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 3702;BA.debugLine="d(i, 0) = i";
_d[_i][(int) (0)] = _i;
 }
};
 //BA.debugLineNum = 3704;BA.debugLine="For j = 0 To m";
{
final int step9 = 1;
final int limit9 = _m;
_j = (int) (0) ;
for (;_j <= limit9 ;_j = _j + step9 ) {
 //BA.debugLineNum = 3705;BA.debugLine="d(0, j) = j";
_d[(int) (0)][_j] = _j;
 }
};
 //BA.debugLineNum = 3707;BA.debugLine="For i = 1 To n";
{
final int step12 = 1;
final int limit12 = _n;
_i = (int) (1) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 3708;BA.debugLine="For j = 1 To m";
{
final int step13 = 1;
final int limit13 = _m;
_j = (int) (1) ;
for (;_j <= limit13 ;_j = _j + step13 ) {
 //BA.debugLineNum = 3709;BA.debugLine="Dim cost As Int";
_cost = 0;
 //BA.debugLineNum = 3710;BA.debugLine="If s.CharAt(i - 1) = t.CharAt(j - 1) Then cost";
if (_s.charAt((int) (_i-1))==_t.charAt((int) (_j-1))) { 
_cost = (int) (0);}
else {
_cost = (int) (1);};
 //BA.debugLineNum = 3711;BA.debugLine="Dim min1 As Int = d(i - 1, j) + 1";
_min1 = (int) (_d[(int) (_i-1)][_j]+1);
 //BA.debugLineNum = 3712;BA.debugLine="Dim min2 As Int = d(i, j - 1) + 1";
_min2 = (int) (_d[_i][(int) (_j-1)]+1);
 //BA.debugLineNum = 3713;BA.debugLine="Dim min3 As Int = d(i - 1, j - 1) + cost";
_min3 = (int) (_d[(int) (_i-1)][(int) (_j-1)]+_cost);
 //BA.debugLineNum = 3714;BA.debugLine="d(i, j) = Min(min1, Min(min2, min3))";
_d[_i][_j] = (int) (__c.Min(_min1,__c.Min(_min2,_min3)));
 }
};
 }
};
 //BA.debugLineNum = 3717;BA.debugLine="Return d(n, m)";
if (true) return _d[_n][_m];
 //BA.debugLineNum = 3718;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper  _loadfontfromfile(String _dirpath,String _filename) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
String _path = "";
Object _tf = null;
String _altname = "";
 //BA.debugLineNum = 445;BA.debugLine="Private Sub LoadFontFromFile(DirPath As String, Fi";
 //BA.debugLineNum = 447;BA.debugLine="If File.Exists(DirPath, FileName) Then";
if (__c.File.Exists(_dirpath,_filename)) { 
 //BA.debugLineNum = 448;BA.debugLine="Try";
try { //BA.debugLineNum = 449;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 450;BA.debugLine="jo.InitializeStatic(\"android.graphics.Typeface\"";
_jo.InitializeStatic("android.graphics.Typeface");
 //BA.debugLineNum = 451;BA.debugLine="Dim Path As String = File.Combine(DirPath, File";
_path = __c.File.Combine(_dirpath,_filename);
 //BA.debugLineNum = 452;BA.debugLine="Dim TF As Object = jo.RunMethod(\"createFromFile";
_tf = _jo.RunMethod("createFromFile",new Object[]{(Object)(_path)});
 //BA.debugLineNum = 453;BA.debugLine="If TF <> Null Then";
if (_tf!= null) { 
 //BA.debugLineNum = 454;BA.debugLine="Log(\">>> [FONTS] Loaded External: \" & FileName";
__c.LogImpl("011665417",">>> [FONTS] Loaded External: "+_filename,0);
 //BA.debugLineNum = 455;BA.debugLine="Return TF";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(_tf));
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 458;BA.debugLine="Log(\">>> [FONTS] Error loading external: \" & La";
__c.LogImpl("011665421",">>> [FONTS] Error loading external: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
 //BA.debugLineNum = 463;BA.debugLine="If File.Exists(File.DirAssets, FileName) Then";
if (__c.File.Exists(__c.File.getDirAssets(),_filename)) { 
 //BA.debugLineNum = 464;BA.debugLine="Log(\">>> [FONTS] Loaded Asset: \" & FileName)";
__c.LogImpl("011665427",">>> [FONTS] Loaded Asset: "+_filename,0);
 //BA.debugLineNum = 465;BA.debugLine="Return Typeface.LoadFromAssets(FileName)";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.LoadFromAssets(_filename)));
 };
 //BA.debugLineNum = 469;BA.debugLine="Dim AltName As String = FileName.Replace(\" \", \"\")";
_altname = _filename.replace(" ","").replace("-","");
 //BA.debugLineNum = 470;BA.debugLine="If File.Exists(File.DirAssets, AltName) Then";
if (__c.File.Exists(__c.File.getDirAssets(),_altname)) { 
 //BA.debugLineNum = 471;BA.debugLine="Log(\">>> [FONTS] Found Alternate Asset: \" & AltN";
__c.LogImpl("011665434",">>> [FONTS] Found Alternate Asset: "+_altname,0);
 //BA.debugLineNum = 472;BA.debugLine="Return Typeface.LoadFromAssets(AltName)";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.LoadFromAssets(_altname)));
 };
 //BA.debugLineNum = 476;BA.debugLine="Log(\"!!! [FONTS] MISSING: \" & FileName & \" - Usin";
__c.LogImpl("011665439","!!! [FONTS] MISSING: "+_filename+" - Using Default",0);
 //BA.debugLineNum = 477;BA.debugLine="Return Typeface.DEFAULT";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
 //BA.debugLineNum = 478;BA.debugLine="End Sub";
return null;
}
public String  _loadsounds() throws Exception{
anywheresoftware.b4a.objects.collections.List _tempindices = null;
int _iloop = 0;
int _rndindex = 0;
int _targetidx = 0;
String _fn = "";
int _id = 0;
 //BA.debugLineNum = 4960;BA.debugLine="Public Sub LoadSounds";
 //BA.debugLineNum = 4961;BA.debugLine="If SP.IsInitialized = False Then SP.Initialize(2)";
if (_sp.IsInitialized()==__c.False) { 
_sp.Initialize((int) (2));};
 //BA.debugLineNum = 4962;BA.debugLine="SoundIDs.Initialize";
_soundids.Initialize();
 //BA.debugLineNum = 4965;BA.debugLine="Dim TempIndices As List";
_tempindices = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4966;BA.debugLine="TempIndices.Initialize";
_tempindices.Initialize();
 //BA.debugLineNum = 4967;BA.debugLine="For iLoop = 1 To 150";
{
final int step5 = 1;
final int limit5 = (int) (150);
_iloop = (int) (1) ;
for (;_iloop <= limit5 ;_iloop = _iloop + step5 ) {
 //BA.debugLineNum = 4968;BA.debugLine="TempIndices.Add(iLoop)";
_tempindices.Add((Object)(_iloop));
 }
};
 //BA.debugLineNum = 4972;BA.debugLine="Log(\">>> [AUDIO] Initializing Random Sound Loader";
__c.LogImpl("020250636",">>> [AUDIO] Initializing Random Sound Loader...",0);
 //BA.debugLineNum = 4973;BA.debugLine="Do While TempIndices.Size > 0";
while (_tempindices.getSize()>0) {
 //BA.debugLineNum = 4974;BA.debugLine="Dim RndIndex As Int = Rnd(0, TempIndices.Size)";
_rndindex = __c.Rnd((int) (0),_tempindices.getSize());
 //BA.debugLineNum = 4975;BA.debugLine="Dim TargetIdx As Int = TempIndices.Get(RndIndex)";
_targetidx = (int)(BA.ObjectToNumber(_tempindices.Get(_rndindex)));
 //BA.debugLineNum = 4976;BA.debugLine="TempIndices.RemoveAt(RndIndex)";
_tempindices.RemoveAt(_rndindex);
 //BA.debugLineNum = 4978;BA.debugLine="Dim fn As String = NumberFormat(TargetIdx, 2, 0)";
_fn = __c.NumberFormat(_targetidx,(int) (2),(int) (0))+".wav";
 //BA.debugLineNum = 4980;BA.debugLine="If File.Exists(File.DirAssets, fn) Then";
if (__c.File.Exists(__c.File.getDirAssets(),_fn)) { 
 //BA.debugLineNum = 4981;BA.debugLine="Try";
try { //BA.debugLineNum = 4982;BA.debugLine="Dim ID As Int = SP.Load(File.DirAssets, fn)";
_id = _sp.Load(__c.File.getDirAssets(),_fn);
 //BA.debugLineNum = 4983;BA.debugLine="SoundIDs.Add(ID)";
_soundids.Add((Object)(_id));
 } 
       catch (Exception e19) {
			ba.setLastException(e19); //BA.debugLineNum = 4985;BA.debugLine="Log(\">>> [AUDIO] Failed to load Asset: \" & fn)";
__c.LogImpl("020250649",">>> [AUDIO] Failed to load Asset: "+_fn,0);
 };
 };
 }
;
 //BA.debugLineNum = 4990;BA.debugLine="Log(\">>> [AUDIO] Sound Engine Ready. Randomized:";
__c.LogImpl("020250654",">>> [AUDIO] Sound Engine Ready. Randomized: "+BA.NumberToString(_soundids.getSize())+" sounds loaded.",0);
 //BA.debugLineNum = 4991;BA.debugLine="End Sub";
return "";
}
public String  _monthtostring(int _m) throws Exception{
String[] _months = null;
 //BA.debugLineNum = 4266;BA.debugLine="Private Sub MonthToString(m As Int) As String";
 //BA.debugLineNum = 4267;BA.debugLine="Dim months() As String = Array As String(\"January";
_months = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
 //BA.debugLineNum = 4268;BA.debugLine="If m < 1 Or m > 12 Then Return \"Invalid\"";
if (_m<1 || _m>12) { 
if (true) return "Invalid";};
 //BA.debugLineNum = 4269;BA.debugLine="Return months(m - 1)";
if (true) return _months[(int) (_m-1)];
 //BA.debugLineNum = 4270;BA.debugLine="End Sub";
return "";
}
public String  _oauth2_accesstokenavailable(boolean _success,String _token) throws Exception{
 //BA.debugLineNum = 721;BA.debugLine="Sub OAuth2_AccessTokenAvailable(Success As Boolean";
 //BA.debugLineNum = 722;BA.debugLine="If Success Then";
if (_success) { 
 //BA.debugLineNum = 723;BA.debugLine="Log(\"Authorization Successful\")";
__c.LogImpl("012124162","Authorization Successful",0);
 //BA.debugLineNum = 724;BA.debugLine="lblStatus.Text = \"Status: Connected\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Connected"));
 //BA.debugLineNum = 725;BA.debugLine="lblStatus.Color = xui.Color_White";
_lblstatus.setColor(_xui.Color_White);
 //BA.debugLineNum = 726;BA.debugLine="lblStatus.TextColor = xui.Color_Black";
_lblstatus.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 727;BA.debugLine="btnLogin.Visible = False ' Hide login on success";
_btnlogin.setVisible(__c.False);
 //BA.debugLineNum = 728;BA.debugLine="ToastMessageShow(\"Connected to Google\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Connected to Google"),__c.False);
 //BA.debugLineNum = 729;BA.debugLine="CheckContactGroups";
_checkcontactgroups();
 //BA.debugLineNum = 730;BA.debugLine="RefreshDashboard";
_refreshdashboard();
 }else {
 //BA.debugLineNum = 732;BA.debugLine="Log(\"Authorization Failed\")";
__c.LogImpl("012124171","Authorization Failed",0);
 //BA.debugLineNum = 733;BA.debugLine="lblStatus.Text = \"Status: Auth Failed\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Auth Failed"));
 //BA.debugLineNum = 734;BA.debugLine="lblStatus.TextColor = 0xFFD32F2F";
_lblstatus.setTextColor(((int)0xffd32f2f));
 //BA.debugLineNum = 735;BA.debugLine="ToastMessageShow(\"Google Login Failed\", True)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Google Login Failed"),__c.True);
 //BA.debugLineNum = 738;BA.debugLine="btnLogin.Visible = True";
_btnlogin.setVisible(__c.True);
 //BA.debugLineNum = 739;BA.debugLine="btnLogin.BringToFront";
_btnlogin.BringToFront();
 };
 //BA.debugLineNum = 741;BA.debugLine="End Sub";
return "";
}
public String  _ondateselected(int _year,int _month,int _day) throws Exception{
int[] _dateparts = null;
 //BA.debugLineNum = 4727;BA.debugLine="Sub OnDateSelected(year As Int, month As Int, day";
 //BA.debugLineNum = 4728;BA.debugLine="Dim DateParts() As Int = Array As Int(year, month";
_dateparts = new int[]{_year,_month,_day};
 //BA.debugLineNum = 4729;BA.debugLine="CallSub2(appointmentScreen, \"OnDateSelected\", Dat";
__c.CallSubNew2(ba,(Object)(_appointmentscreen),"OnDateSelected",(Object)(_dateparts));
 //BA.debugLineNum = 4730;BA.debugLine="End Sub";
return "";
}
public String  _parseandloadprofile(anywheresoftware.b4a.objects.collections.Map _person) throws Exception{
String _pname = "";
anywheresoftware.b4a.objects.collections.List _names = null;
anywheresoftware.b4a.objects.collections.List _phones = null;
anywheresoftware.b4a.objects.collections.List _addrs = null;
anywheresoftware.b4a.objects.collections.List _bios = null;
anywheresoftware.b4a.objects.collections.List _memberships = null;
anywheresoftware.b4a.objects.collections.Map _mem = null;
String _gid = "";
 //BA.debugLineNum = 3720;BA.debugLine="Sub ParseAndLoadProfile(person As Map)";
 //BA.debugLineNum = 3721;BA.debugLine="TempProfile.Initialize";
_tempprofile.Initialize();
 //BA.debugLineNum = 3722;BA.debugLine="TempProfile.Put(\"ResourceName\", person.Get(\"resou";
_tempprofile.Put((Object)("ResourceName"),_person.Get((Object)("resourceName")));
 //BA.debugLineNum = 3723;BA.debugLine="TempProfile.Put(\"Etag\", person.Get(\"etag\"))";
_tempprofile.Put((Object)("Etag"),_person.Get((Object)("etag")));
 //BA.debugLineNum = 3725;BA.debugLine="Dim pName As String = \"\"";
_pname = "";
 //BA.debugLineNum = 3726;BA.debugLine="If person.ContainsKey(\"names\") Then";
if (_person.ContainsKey((Object)("names"))) { 
 //BA.debugLineNum = 3727;BA.debugLine="Dim names As List = person.Get(\"names\")";
_names = new anywheresoftware.b4a.objects.collections.List();
_names = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_person.Get((Object)("names"))));
 //BA.debugLineNum = 3728;BA.debugLine="If names.Size > 0 Then pName = names.Get(0).As(M";
if (_names.getSize()>0) { 
_pname = BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_names.Get((int) (0))))).GetDefault((Object)("displayName"),(Object)("")));};
 };
 //BA.debugLineNum = 3730;BA.debugLine="TempProfile.Put(\"Name\", pName)";
_tempprofile.Put((Object)("Name"),(Object)(_pname));
 //BA.debugLineNum = 3732;BA.debugLine="If person.ContainsKey(\"phoneNumbers\") Then";
if (_person.ContainsKey((Object)("phoneNumbers"))) { 
 //BA.debugLineNum = 3733;BA.debugLine="Dim phones As List = person.Get(\"phoneNumbers\")";
_phones = new anywheresoftware.b4a.objects.collections.List();
_phones = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_person.Get((Object)("phoneNumbers"))));
 //BA.debugLineNum = 3734;BA.debugLine="If phones.Size > 0 Then TempProfile.Put(\"Phone\",";
if (_phones.getSize()>0) { 
_tempprofile.Put((Object)("Phone"),((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_phones.Get((int) (0))))).Get((Object)("value")));}
else {
_tempprofile.Put((Object)("Phone"),(Object)("No Phone"));};
 }else {
 //BA.debugLineNum = 3736;BA.debugLine="TempProfile.Put(\"Phone\", \"No Phone\")";
_tempprofile.Put((Object)("Phone"),(Object)("No Phone"));
 };
 //BA.debugLineNum = 3739;BA.debugLine="If person.ContainsKey(\"addresses\") Then";
if (_person.ContainsKey((Object)("addresses"))) { 
 //BA.debugLineNum = 3740;BA.debugLine="Dim addrs As List = person.Get(\"addresses\")";
_addrs = new anywheresoftware.b4a.objects.collections.List();
_addrs = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_person.Get((Object)("addresses"))));
 //BA.debugLineNum = 3741;BA.debugLine="If addrs.Size > 0 Then TempProfile.Put(\"Address\"";
if (_addrs.getSize()>0) { 
_tempprofile.Put((Object)("Address"),((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_addrs.Get((int) (0))))).Get((Object)("formattedValue")));}
else {
_tempprofile.Put((Object)("Address"),(Object)("No Address"));};
 }else {
 //BA.debugLineNum = 3743;BA.debugLine="TempProfile.Put(\"Address\", \"No Address\")";
_tempprofile.Put((Object)("Address"),(Object)("No Address"));
 };
 //BA.debugLineNum = 3746;BA.debugLine="If person.ContainsKey(\"biographies\") Then";
if (_person.ContainsKey((Object)("biographies"))) { 
 //BA.debugLineNum = 3747;BA.debugLine="Dim bios As List = person.Get(\"biographies\")";
_bios = new anywheresoftware.b4a.objects.collections.List();
_bios = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_person.Get((Object)("biographies"))));
 //BA.debugLineNum = 3748;BA.debugLine="If bios.Size > 0 Then TempProfile.Put(\"Notes\", b";
if (_bios.getSize()>0) { 
_tempprofile.Put((Object)("Notes"),((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_bios.Get((int) (0))))).Get((Object)("value")));}
else {
_tempprofile.Put((Object)("Notes"),(Object)(""));};
 }else {
 //BA.debugLineNum = 3750;BA.debugLine="TempProfile.Put(\"Notes\", \"\")";
_tempprofile.Put((Object)("Notes"),(Object)(""));
 };
 //BA.debugLineNum = 3753;BA.debugLine="TempProfile.Put(\"IsBlacklisted\", False)";
_tempprofile.Put((Object)("IsBlacklisted"),(Object)(__c.False));
 //BA.debugLineNum = 3754;BA.debugLine="TempProfile.Put(\"IsPreferred\", False)";
_tempprofile.Put((Object)("IsPreferred"),(Object)(__c.False));
 //BA.debugLineNum = 3755;BA.debugLine="If person.ContainsKey(\"memberships\") Then";
if (_person.ContainsKey((Object)("memberships"))) { 
 //BA.debugLineNum = 3756;BA.debugLine="Dim memberships As List = person.Get(\"membership";
_memberships = new anywheresoftware.b4a.objects.collections.List();
_memberships = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_person.Get((Object)("memberships"))));
 //BA.debugLineNum = 3757;BA.debugLine="For Each mem As Map In memberships";
_mem = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group32 = _memberships;
final int groupLen32 = group32.getSize()
;int index32 = 0;
;
for (; index32 < groupLen32;index32++){
_mem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group32.Get(index32)));
 //BA.debugLineNum = 3758;BA.debugLine="If mem.ContainsKey(\"contactGroupMembership\") Th";
if (_mem.ContainsKey((Object)("contactGroupMembership"))) { 
 //BA.debugLineNum = 3759;BA.debugLine="Dim gid As String = mem.Get(\"contactGroupMembe";
_gid = BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mem.Get((Object)("contactGroupMembership"))))).Get((Object)("contactGroupResourceName")));
 //BA.debugLineNum = 3760;BA.debugLine="If gid = Starter.GroupID_Blacklisted Then Temp";
if ((_gid).equals(BA.NumberToString(_starter._groupid_blacklisted /*long*/ ))) { 
_tempprofile.Put((Object)("IsBlacklisted"),(Object)(__c.True));};
 //BA.debugLineNum = 3761;BA.debugLine="If gid = Starter.GroupID_Preferred Then TempPr";
if ((_gid).equals(BA.NumberToString(_starter._groupid_preferred /*long*/ ))) { 
_tempprofile.Put((Object)("IsPreferred"),(Object)(__c.True));};
 };
 }
};
 };
 //BA.debugLineNum = 3765;BA.debugLine="StartLedgerQueue(pName)";
_startledgerqueue(_pname);
 //BA.debugLineNum = 3766;BA.debugLine="End Sub";
return "";
}
public long  _parsedatestring(String _datestr) throws Exception{
String[] _formats = null;
String _fmt = "";
long _l = 0L;
 //BA.debugLineNum = 1577;BA.debugLine="Private Sub ParseDateString(DateStr As String) As";
 //BA.debugLineNum = 1578;BA.debugLine="Dim Formats() As String = Array As String(\"MM/dd/";
_formats = new String[]{"MM/dd/yyyy","M/d/yyyy","yyyy-MM-dd","MMM d, yyyy"};
 //BA.debugLineNum = 1579;BA.debugLine="For Each fmt As String In Formats";
{
final String[] group2 = _formats;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_fmt = group2[index2];
 //BA.debugLineNum = 1580;BA.debugLine="DateTime.DateFormat = fmt";
__c.DateTime.setDateFormat(_fmt);
 //BA.debugLineNum = 1581;BA.debugLine="Try";
try { //BA.debugLineNum = 1582;BA.debugLine="Dim L As Long = DateTime.DateParse(DateStr)";
_l = __c.DateTime.DateParse(_datestr);
 //BA.debugLineNum = 1583;BA.debugLine="Return L";
if (true) return _l;
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 1585;BA.debugLine="Log(\"ParseDateString: Format \" & fmt & \" did no";
__c.LogImpl("013631496","ParseDateString: Format "+_fmt+" did not match",0);
 };
 }
};
 //BA.debugLineNum = 1588;BA.debugLine="Return 0";
if (true) return (long) (0);
 //BA.debugLineNum = 1589;BA.debugLine="End Sub";
return 0L;
}
public String  _parseemlfile(String _dir,String _fname) throws Exception{
String _content = "";
String _fromnum = "";
String _cleantranscript = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _mphone = null;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _mtrans = null;
String _scrapename1 = "";
String _scrapename2 = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _mname = null;
String _potentialname = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _mname2 = null;
String _potentialname2 = "";
String _scrapeissue = "";
String _lcasetrans = "";
long _timestamp = 0L;
String _datestr = "";
String _fullpath = "";
anywheresoftware.b4a.objects.collections.Map _existing = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.Map _newmap = null;
 //BA.debugLineNum = 2427;BA.debugLine="Private Sub ParseEmlFile(Dir As String, FName As S";
 //BA.debugLineNum = 2428;BA.debugLine="Log(\"--------------------------------------------";
__c.LogImpl("014417921","---------------------------------------------------",0);
 //BA.debugLineNum = 2429;BA.debugLine="Log(\">>> [SCRAPER DEBUG] Parsing File: \" & FName)";
__c.LogImpl("014417922",">>> [SCRAPER DEBUG] Parsing File: "+_fname,0);
 //BA.debugLineNum = 2430;BA.debugLine="Try";
try { //BA.debugLineNum = 2431;BA.debugLine="Dim Content As String = File.ReadString(Dir, FNa";
_content = __c.File.ReadString(_dir,_fname);
 //BA.debugLineNum = 2432;BA.debugLine="Dim FromNum As String = \"\"";
_fromnum = "";
 //BA.debugLineNum = 2433;BA.debugLine="Dim CleanTranscript As String = \"\"";
_cleantranscript = "";
 //BA.debugLineNum = 2436;BA.debugLine="Dim mPhone As Matcher = Regex.Matcher(\"From:\\s*(";
_mphone = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_mphone = __c.Regex.Matcher("From:\\s*(\\+?1?\\d{10})",_content);
 //BA.debugLineNum = 2437;BA.debugLine="If mPhone.Find Then FromNum = mPhone.Group(1)";
if (_mphone.Find()) { 
_fromnum = _mphone.Group((int) (1));};
 //BA.debugLineNum = 2438;BA.debugLine="If FromNum = \"\" Then";
if ((_fromnum).equals("")) { 
 //BA.debugLineNum = 2439;BA.debugLine="Log(\">>> [SCRAPER DEBUG] SKIPPED: No phone numb";
__c.LogImpl("014417932",">>> [SCRAPER DEBUG] SKIPPED: No phone number found in EML.",0);
 //BA.debugLineNum = 2440;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 2442;BA.debugLine="FromNum = FormatPhone(FromNum)";
_fromnum = _formatphone(_fromnum);
 //BA.debugLineNum = 2445;BA.debugLine="Dim mTrans As Matcher = Regex.Matcher(\"X-Transcr";
_mtrans = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_mtrans = __c.Regex.Matcher("X-Transcript:\\s*(.*)",_content);
 //BA.debugLineNum = 2446;BA.debugLine="If mTrans.Find Then";
if (_mtrans.Find()) { 
 //BA.debugLineNum = 2447;BA.debugLine="CleanTranscript = mTrans.Group(1).Trim";
_cleantranscript = _mtrans.Group((int) (1)).trim();
 }else {
 //BA.debugLineNum = 2449;BA.debugLine="CleanTranscript = \"No transcript available.\"";
_cleantranscript = "No transcript available.";
 };
 //BA.debugLineNum = 2453;BA.debugLine="Dim ScrapeName1 As String = \"\"";
_scrapename1 = "";
 //BA.debugLineNum = 2454;BA.debugLine="Dim ScrapeName2 As String = \"\"";
_scrapename2 = "";
 //BA.debugLineNum = 2457;BA.debugLine="Dim mName As Matcher = Regex.Matcher(\"(?i)(?:nam";
_mname = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_mname = __c.Regex.Matcher("(?i)(?:name is|this is|it\\'?s|from)(?:\\s+(?:uh|um))?\\s+([A-Z][a-z]+(?:\\s+[A-Z][a-z]+)?)",_cleantranscript);
 //BA.debugLineNum = 2458;BA.debugLine="If mName.Find Then";
if (_mname.Find()) { 
 //BA.debugLineNum = 2459;BA.debugLine="Dim PotentialName As String = mName.Group(1).Tr";
_potentialname = _mname.Group((int) (1)).trim();
 //BA.debugLineNum = 2460;BA.debugLine="If IsClientNameValid(PotentialName) Then";
if (_isclientnamevalid(_potentialname)) { 
 //BA.debugLineNum = 2461;BA.debugLine="ScrapeName1 = PotentialName";
_scrapename1 = _potentialname;
 //BA.debugLineNum = 2462;BA.debugLine="Log(\">>> [SCRAPER DEBUG] Matched NAME 1 (Calle";
__c.LogImpl("014417955",">>> [SCRAPER DEBUG] Matched NAME 1 (Caller): "+_scrapename1,0);
 };
 };
 //BA.debugLineNum = 2467;BA.debugLine="Dim mName2 As Matcher = Regex.Matcher(\"(?i)(?:wi";
_mname2 = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_mname2 = __c.Regex.Matcher("(?i)(?:with|and)(?:\\s+(?:uh|um))?\\s+([A-Z][a-z]+(?:\\s+[A-Z][a-z]+)?)",_cleantranscript);
 //BA.debugLineNum = 2468;BA.debugLine="If mName2.Find Then";
if (_mname2.Find()) { 
 //BA.debugLineNum = 2469;BA.debugLine="Dim PotentialName2 As String = mName2.Group(1).";
_potentialname2 = _mname2.Group((int) (1)).trim();
 //BA.debugLineNum = 2470;BA.debugLine="If IsClientNameValid(PotentialName2) And Potent";
if (_isclientnamevalid(_potentialname2) && (_potentialname2).equals(_scrapename1) == false) { 
 //BA.debugLineNum = 2471;BA.debugLine="ScrapeName2 = PotentialName2";
_scrapename2 = _potentialname2;
 //BA.debugLineNum = 2472;BA.debugLine="Log(\">>> [SCRAPER DEBUG] Matched NAME 2 (Secon";
__c.LogImpl("014417965",">>> [SCRAPER DEBUG] Matched NAME 2 (Secondary): "+_scrapename2,0);
 };
 };
 //BA.debugLineNum = 2477;BA.debugLine="Dim ScrapeIssue As String = CleanTranscript";
_scrapeissue = _cleantranscript;
 //BA.debugLineNum = 2478;BA.debugLine="Dim lCaseTrans As String = CleanTranscript.ToLow";
_lcasetrans = _cleantranscript.toLowerCase();
 //BA.debugLineNum = 2479;BA.debugLine="If lCaseTrans.Contains(\"computer\") Then ScrapeIs";
if (_lcasetrans.contains("computer")) { 
_scrapeissue = "Computer Issue";};
 //BA.debugLineNum = 2480;BA.debugLine="If lCaseTrans.Contains(\"printer\") Then ScrapeIss";
if (_lcasetrans.contains("printer")) { 
_scrapeissue = "Printer Issue";};
 //BA.debugLineNum = 2481;BA.debugLine="If lCaseTrans.Contains(\"internet\") Or lCaseTrans";
if (_lcasetrans.contains("internet") || _lcasetrans.contains("wifi")) { 
_scrapeissue = "Network/Wi-Fi Issue";};
 //BA.debugLineNum = 2482;BA.debugLine="If lCaseTrans.Contains(\"scam\") Or lCaseTrans.Con";
if (_lcasetrans.contains("scam") || _lcasetrans.contains("virus")) { 
_scrapeissue = "Scam / Virus Issue";};
 //BA.debugLineNum = 2485;BA.debugLine="Dim TimeStamp As Long = File.LastModified(Dir, F";
_timestamp = __c.File.LastModified(_dir,_fname);
 //BA.debugLineNum = 2486;BA.debugLine="Dim DateStr As String = DateTime.Date(TimeStamp)";
_datestr = __c.DateTime.Date(_timestamp)+" "+__c.DateTime.Time(_timestamp);
 //BA.debugLineNum = 2487;BA.debugLine="Dim FullPath As String = File.Combine(Dir, FName";
_fullpath = __c.File.Combine(_dir,_fname);
 //BA.debugLineNum = 2490;BA.debugLine="If ScrapeMap.ContainsKey(FromNum) Then";
if (_scrapemap.ContainsKey((Object)(_fromnum))) { 
 //BA.debugLineNum = 2491;BA.debugLine="Dim Existing As Map = ScrapeMap.Get(FromNum)";
_existing = new anywheresoftware.b4a.objects.collections.Map();
_existing = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scrapemap.Get((Object)(_fromnum))));
 //BA.debugLineNum = 2492;BA.debugLine="Dim sb As StringBuilder = Existing.Get(\"BodyBui";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_sb = (anywheresoftware.b4a.keywords.StringBuilderWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.StringBuilderWrapper(), (java.lang.StringBuilder)(_existing.Get((Object)("BodyBuilder"))));
 //BA.debugLineNum = 2493;BA.debugLine="sb.Append(Chr(10)).Append(\"--- [\").Append(DateS";
_sb.Append(BA.ObjectToString(__c.Chr((int) (10)))).Append("--- [").Append(_datestr).Append("] ---").Append(BA.ObjectToString(__c.Chr((int) (10))));
 //BA.debugLineNum = 2494;BA.debugLine="sb.Append(CleanTranscript).Append(Chr(10))";
_sb.Append(_cleantranscript).Append(BA.ObjectToString(__c.Chr((int) (10))));
 //BA.debugLineNum = 2495;BA.debugLine="Existing.Put(\"FilePath\", FullPath)";
_existing.Put((Object)("FilePath"),(Object)(_fullpath));
 }else {
 //BA.debugLineNum = 2497;BA.debugLine="Dim NewMap As Map : NewMap.Initialize";
_newmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2497;BA.debugLine="Dim NewMap As Map : NewMap.Initialize";
_newmap.Initialize();
 //BA.debugLineNum = 2498;BA.debugLine="NewMap.Put(\"Phone\", FromNum)";
_newmap.Put((Object)("Phone"),(Object)(_fromnum));
 //BA.debugLineNum = 2499;BA.debugLine="NewMap.Put(\"Name\", ScrapeName1)";
_newmap.Put((Object)("Name"),(Object)(_scrapename1));
 //BA.debugLineNum = 2500;BA.debugLine="NewMap.Put(\"Name2\", ScrapeName2)";
_newmap.Put((Object)("Name2"),(Object)(_scrapename2));
 //BA.debugLineNum = 2501;BA.debugLine="NewMap.Put(\"Notes\", ScrapeIssue)";
_newmap.Put((Object)("Notes"),(Object)(_scrapeissue));
 //BA.debugLineNum = 2502;BA.debugLine="NewMap.Put(\"FilePath\", FullPath)";
_newmap.Put((Object)("FilePath"),(Object)(_fullpath));
 //BA.debugLineNum = 2504;BA.debugLine="Dim sb As StringBuilder : sb.Initialize";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2504;BA.debugLine="Dim sb As StringBuilder : sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2505;BA.debugLine="sb.Append(\"--- [\").Append(DateStr).Append(\"] --";
_sb.Append("--- [").Append(_datestr).Append("] ---").Append(BA.ObjectToString(__c.Chr((int) (10))));
 //BA.debugLineNum = 2506;BA.debugLine="sb.Append(CleanTranscript).Append(Chr(10))";
_sb.Append(_cleantranscript).Append(BA.ObjectToString(__c.Chr((int) (10))));
 //BA.debugLineNum = 2507;BA.debugLine="NewMap.Put(\"BodyBuilder\", sb)";
_newmap.Put((Object)("BodyBuilder"),(Object)(_sb.getObject()));
 //BA.debugLineNum = 2508;BA.debugLine="ScrapeMap.Put(FromNum, NewMap)";
_scrapemap.Put((Object)(_fromnum),(Object)(_newmap.getObject()));
 };
 } 
       catch (Exception e69) {
			ba.setLastException(e69); //BA.debugLineNum = 2512;BA.debugLine="Log(\">>> [SCRAPER DEBUG] CRASH TRAPPED in ParseE";
__c.LogImpl("014418005",">>> [SCRAPER DEBUG] CRASH TRAPPED in ParseEmlFile: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 2514;BA.debugLine="Log(\"--------------------------------------------";
__c.LogImpl("014418007","---------------------------------------------------",0);
 //BA.debugLineNum = 2515;BA.debugLine="End Sub";
return "";
}
public int  _parseisotolocalhour(String _iso) throws Exception{
int _hour = 0;
int _localh = 0;
int _h = 0;
 //BA.debugLineNum = 4758;BA.debugLine="Private Sub ParseIsoToLocalHour(iso As String) As";
 //BA.debugLineNum = 4759;BA.debugLine="Try";
try { //BA.debugLineNum = 4760;BA.debugLine="If iso.EndsWith(\"Z\") Then";
if (_iso.endsWith("Z")) { 
 //BA.debugLineNum = 4761;BA.debugLine="Dim hour As Int = iso.SubString2(11,13)";
_hour = (int)(Double.parseDouble(_iso.substring((int) (11),(int) (13))));
 //BA.debugLineNum = 4762;BA.debugLine="Dim LocalH As Int = hour + DateTime.TimeZoneOff";
_localh = (int) (_hour+__c.DateTime.getTimeZoneOffset());
 //BA.debugLineNum = 4763;BA.debugLine="If LocalH < 0 Then LocalH = LocalH + 24";
if (_localh<0) { 
_localh = (int) (_localh+24);};
 //BA.debugLineNum = 4764;BA.debugLine="If LocalH > 23 Then LocalH = LocalH - 24";
if (_localh>23) { 
_localh = (int) (_localh-24);};
 //BA.debugLineNum = 4765;BA.debugLine="Return LocalH";
if (true) return _localh;
 }else {
 //BA.debugLineNum = 4767;BA.debugLine="Dim H As Int = iso.SubString2(11,13)";
_h = (int)(Double.parseDouble(_iso.substring((int) (11),(int) (13))));
 //BA.debugLineNum = 4768;BA.debugLine="Return H";
if (true) return _h;
 };
 } 
       catch (Exception e13) {
			ba.setLastException(e13); //BA.debugLineNum = 4771;BA.debugLine="Return -1";
if (true) return (int) (-1);
 };
 //BA.debugLineNum = 4773;BA.debugLine="End Sub";
return 0;
}
public String  _performsearch(String _query) throws Exception{
long _datems = 0L;
Geek.God.CRM.App.httpjob _job = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
String _finalurl = "";
 //BA.debugLineNum = 1534;BA.debugLine="Public Sub PerformSearch(Query As String)";
 //BA.debugLineNum = 1535;BA.debugLine="Log(\"PerformSearch Called with: \" & Query)";
__c.LogImpl("013565953","PerformSearch Called with: "+_query,0);
 //BA.debugLineNum = 1536;BA.debugLine="If OAuth2.access_token = \"\" Then";
if ((_oauth2._access_token /*String*/ ).equals("")) { 
 //BA.debugLineNum = 1537;BA.debugLine="Log(\"DEBUG: Token Empty during Search - Requesti";
__c.LogImpl("013565955","DEBUG: Token Empty during Search - Requesting New Token",0);
 //BA.debugLineNum = 1538;BA.debugLine="OAuth2.GetAccessToken";
_oauth2._getaccesstoken /*String*/ ();
 //BA.debugLineNum = 1539;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1542;BA.debugLine="CurrentSearchQuery = Query";
_currentsearchquery = _query;
 //BA.debugLineNum = 1556;BA.debugLine="CurrentSearchQuery = Query.ToLowerCase.Trim";
_currentsearchquery = _query.toLowerCase().trim();
 //BA.debugLineNum = 1559;BA.debugLine="Dim DateMs As Long = ParseDateString(Query)";
_datems = _parsedatestring(_query);
 //BA.debugLineNum = 1560;BA.debugLine="If DateMs > 0 Then";
if (_datems>0) { 
 //BA.debugLineNum = 1561;BA.debugLine="Log(\"DEBUG: Search Query Identified as DATE\")";
__c.LogImpl("013565979","DEBUG: Search Query Identified as DATE",0);
 //BA.debugLineNum = 1562;BA.debugLine="SearchCalendarForDate(DateMs)";
_searchcalendarfordate(_datems);
 }else {
 //BA.debugLineNum = 1564;BA.debugLine="Log(\"DEBUG: Search Query Identified as TEXT - Ca";
__c.LogImpl("013565982","DEBUG: Search Query Identified as TEXT - Calling People API",0);
 //BA.debugLineNum = 1566;BA.debugLine="Dim job As HttpJob : job.Initialize(\"SearchConta";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 1566;BA.debugLine="Dim job As HttpJob : job.Initialize(\"SearchConta";
_job._initialize /*String*/ (ba,"SearchContact",this);
 //BA.debugLineNum = 1567;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 1568;BA.debugLine="Dim FinalURL As String = \"https://people.googlea";
_finalurl = "https://people.googleapis.com/v1/people:searchContacts?query="+_su.EncodeUrl(_query,"UTF8")+"&readMask=names,phoneNumbers,addresses,biographies,memberships";
 //BA.debugLineNum = 1569;BA.debugLine="Log(\"DEBUG: Request URL: \" & FinalURL)";
__c.LogImpl("013565987","DEBUG: Request URL: "+_finalurl,0);
 //BA.debugLineNum = 1571;BA.debugLine="job.Download(FinalURL)";
_job._download /*String*/ (_finalurl);
 //BA.debugLineNum = 1572;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Beare";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 };
 //BA.debugLineNum = 1574;BA.debugLine="End Sub";
return "";
}
public String  _playrandomsound() throws Exception{
int _rndindex = 0;
int _sndid = 0;
 //BA.debugLineNum = 4993;BA.debugLine="Public Sub PlayRandomSound";
 //BA.debugLineNum = 4994;BA.debugLine="If SP.IsInitialized = False Or SoundIDs.IsInit";
if (_sp.IsInitialized()==__c.False || _soundids.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 4995;BA.debugLine="If SoundIDs.Size = 0 Then Return";
if (_soundids.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 4997;BA.debugLine="Dim RndIndex As Int = Rnd(0, SoundIDs.Size)";
_rndindex = __c.Rnd((int) (0),_soundids.getSize());
 //BA.debugLineNum = 4998;BA.debugLine="Dim SndID As Int = SoundIDs.Get(RndIndex)";
_sndid = (int)(BA.ObjectToNumber(_soundids.Get(_rndindex)));
 //BA.debugLineNum = 4999;BA.debugLine="SP.Play(SndID, 1, 1, 1, 0, 1)";
_sp.Play(_sndid,(float) (1),(float) (1),(int) (1),(int) (0),(float) (1));
 //BA.debugLineNum = 5000;BA.debugLine="End Sub";
return "";
}
public String  _processnextledger() throws Exception{
double _total = 0;
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 3813;BA.debugLine="Sub ProcessNextLedger";
 //BA.debugLineNum = 3814;BA.debugLine="If LedgerQueue.Size = 0 Then";
if (_ledgerqueue.getSize()==0) { 
 //BA.debugLineNum = 3815;BA.debugLine="Log(\">>> [LEDGER-DEBUG] Queue Finished. Totals:";
__c.LogImpl("017104898",">>> [LEDGER-DEBUG] Queue Finished. Totals: $"+BA.ObjectToString(_tempprofile.Get((Object)("RawTotalSpend")))+" | Visits: "+BA.ObjectToString(_tempprofile.Get((Object)("RawVisitCount"))),0);
 //BA.debugLineNum = 3816;BA.debugLine="Dim total As Double = TempProfile.Get(\"RawTotalS";
_total = (double)(BA.ObjectToNumber(_tempprofile.Get((Object)("RawTotalSpend"))));
 //BA.debugLineNum = 3817;BA.debugLine="TempProfile.Put(\"TotalSpend\", NumberFormat2(tota";
_tempprofile.Put((Object)("TotalSpend"),(Object)(__c.NumberFormat2(_total,(int) (1),(int) (2),(int) (2),__c.True)));
 //BA.debugLineNum = 3818;BA.debugLine="TempProfile.Put(\"VisitCount\", TempProfile.Get(\"R";
_tempprofile.Put((Object)("VisitCount"),_tempprofile.Get((Object)("RawVisitCount")));
 //BA.debugLineNum = 3819;BA.debugLine="TempProfile.Put(\"IssuesList\", IssuesHistory)";
_tempprofile.Put((Object)("IssuesList"),(Object)(_issueshistory.getObject()));
 //BA.debugLineNum = 3820;BA.debugLine="CallSub2(searchScreen, \"ShowProfile\", TempProfil";
__c.CallSubNew2(ba,(Object)(_searchscreen),"ShowProfile",(Object)(_tempprofile));
 //BA.debugLineNum = 3821;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3824;BA.debugLine="CurrentLedgerID = LedgerQueue.Get(0)";
_currentledgerid = BA.ObjectToString(_ledgerqueue.Get((int) (0)));
 //BA.debugLineNum = 3825;BA.debugLine="LedgerQueue.RemoveAt(0)";
_ledgerqueue.RemoveAt((int) (0));
 //BA.debugLineNum = 3827;BA.debugLine="Log(\">>> [LEDGER-DEBUG] Processing Ledger ID: \" &";
__c.LogImpl("017104910",">>> [LEDGER-DEBUG] Processing Ledger ID: "+_currentledgerid,0);
 //BA.debugLineNum = 3829;BA.debugLine="Dim job As HttpJob : job.Initialize(\"GetSheetMeta";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 3829;BA.debugLine="Dim job As HttpJob : job.Initialize(\"GetSheetMeta";
_job._initialize /*String*/ (ba,"GetSheetMetadata",this);
 //BA.debugLineNum = 3830;BA.debugLine="job.Tag = CurrentLedgerID";
_job._tag /*Object*/  = (Object)(_currentledgerid);
 //BA.debugLineNum = 3831;BA.debugLine="job.Download(\"https://sheets.googleapis.com/v4/sp";
_job._download /*String*/ ("https://sheets.googleapis.com/v4/spreadsheets/"+_currentledgerid);
 //BA.debugLineNum = 3832;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 3833;BA.debugLine="End Sub";
return "";
}
public String  _processnextscrapeitem() throws Exception{
anywheresoftware.b4a.objects.collections.Map _nextitem = null;
 //BA.debugLineNum = 2546;BA.debugLine="Public Sub ProcessNextScrapeItem";
 //BA.debugLineNum = 2547;BA.debugLine="If ScrapeQueue.Size = 0 Then";
if (_scrapequeue.getSize()==0) { 
 //BA.debugLineNum = 2548;BA.debugLine="xui.MsgboxAsync(\"All voicemails processed.\", \"Do";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("All voicemails processed."),BA.ObjectToCharSequence("Done"));
 //BA.debugLineNum = 2549;BA.debugLine="RefreshDashboard";
_refreshdashboard();
 //BA.debugLineNum = 2550;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 2553;BA.debugLine="Dim NextItem As Map = ScrapeQueue.Get(0)";
_nextitem = new anywheresoftware.b4a.objects.collections.Map();
_nextitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scrapequeue.Get((int) (0))));
 //BA.debugLineNum = 2554;BA.debugLine="ShowScrapeManualEntry(NextItem)";
_showscrapemanualentry(_nextitem);
 //BA.debugLineNum = 2555;BA.debugLine="End Sub";
return "";
}
public String  _processreceiptocr(String _path) throws Exception{
int _lastslash = 0;
String _dir = "";
String _filename = "";
byte[] _bytes = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
String _base64 = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 2996;BA.debugLine="Private Sub ProcessReceiptOCR(Path As String)";
 //BA.debugLineNum = 2997;BA.debugLine="ProgressDialogShow(\"Scanning Receipt via Google V";
__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Scanning Receipt via Google Vision..."));
 //BA.debugLineNum = 3000;BA.debugLine="Dim LastSlash As Int = Path.LastIndexOf(\"/\")";
_lastslash = _path.lastIndexOf("/");
 //BA.debugLineNum = 3001;BA.debugLine="Dim Dir As String = Path.SubString2(0, LastSlash)";
_dir = _path.substring((int) (0),_lastslash);
 //BA.debugLineNum = 3002;BA.debugLine="Dim FileName As String = Path.SubString(LastSlash";
_filename = _path.substring((int) (_lastslash+1));
 //BA.debugLineNum = 3005;BA.debugLine="Dim bytes() As Byte = File.ReadBytes(Dir, FileNam";
_bytes = __c.File.ReadBytes(_dir,_filename);
 //BA.debugLineNum = 3006;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 3007;BA.debugLine="Dim base64 As String = su.EncodeBase64(bytes)";
_base64 = _su.EncodeBase64(_bytes);
 //BA.debugLineNum = 3010;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 3011;BA.debugLine="Dim m As Map = CreateMap(\"requests\": Array(Create";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("requests"),(Object)(new Object[]{(Object)(__c.createMap(new Object[] {(Object)("image"),(Object)(__c.createMap(new Object[] {(Object)("content"),(Object)(_base64)}).getObject()),(Object)("features"),(Object)(new Object[]{(Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("TEXT_DETECTION")}).getObject())})}).getObject())})});
 //BA.debugLineNum = 3015;BA.debugLine="json.Initialize(m)";
_json.Initialize(_m);
 //BA.debugLineNum = 3017;BA.debugLine="Dim job As HttpJob : job.Initialize(\"VisionOCR\",";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 3017;BA.debugLine="Dim job As HttpJob : job.Initialize(\"VisionOCR\",";
_job._initialize /*String*/ (ba,"VisionOCR",this);
 //BA.debugLineNum = 3018;BA.debugLine="job.PostString(\"https://vision.googleapis.com/v1/";
_job._poststring /*String*/ ("https://vision.googleapis.com/v1/images:annotate",_json.ToString());
 //BA.debugLineNum = 3019;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 3020;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 3021;BA.debugLine="End Sub";
return "";
}
public String  _refreshdashboard() throws Exception{
Geek.God.CRM.App.httpjob _jobdash = null;
long _startofday = 0L;
long _endofday = 0L;
String _timemin = "";
String _timemax = "";
 //BA.debugLineNum = 1760;BA.debugLine="Public Sub RefreshDashboard";
 //BA.debugLineNum = 1761;BA.debugLine="If OAuth2.access_token = \"\" Then";
if ((_oauth2._access_token /*String*/ ).equals("")) { 
 //BA.debugLineNum = 1762;BA.debugLine="lblStatus.Text = \"Status: Disconnected (Waiting";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Disconnected (Waiting for Token)"));
 //BA.debugLineNum = 1763;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1766;BA.debugLine="lblStatus.Text = \"Status: Syncing Dashboard...\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Syncing Dashboard..."));
 //BA.debugLineNum = 1768;BA.debugLine="lstTodayApts.Clear";
_lsttodayapts._clear();
 //BA.debugLineNum = 1769;BA.debugLine="LastDashboardItems.Clear";
_lastdashboarditems.Clear();
 //BA.debugLineNum = 1771;BA.debugLine="lblStatus.Text = \"Status: Refreshing...\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Refreshing..."));
 //BA.debugLineNum = 1773;BA.debugLine="Dim jobDash As HttpJob : jobDash.Initialize(\"Fetc";
_jobdash = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 1773;BA.debugLine="Dim jobDash As HttpJob : jobDash.Initialize(\"Fetc";
_jobdash._initialize /*String*/ (ba,"FetchDashboard",this);
 //BA.debugLineNum = 1774;BA.debugLine="Dim StartOfDay As Long = DateUtils.SetDate(DateTi";
_startofday = _dateutils._setdate(ba,__c.DateTime.GetYear(__c.DateTime.getNow()),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1775;BA.debugLine="Dim EndOfDay As Long = DateTime.Add(StartOfDay, 0";
_endofday = (long) (__c.DateTime.Add(_startofday,(int) (0),(int) (0),(int) (1))-1);
 //BA.debugLineNum = 1777;BA.debugLine="Dim TimeMin As String = CreateRFC3339(StartOfDay,";
_timemin = _createrfc3339(_startofday,"-05:00");
 //BA.debugLineNum = 1778;BA.debugLine="Dim TimeMax As String = CreateRFC3339(EndOfDay, \"";
_timemax = _createrfc3339(_endofday,"-05:00");
 //BA.debugLineNum = 1780;BA.debugLine="jobDash.Download(\"https://www.googleapis.com/cale";
_jobdash._download /*String*/ ("https://www.googleapis.com/calendar/v3/calendars/primary/events?timeMin="+_timemin.replace("+","%2B")+"&timeMax="+_timemax.replace("+","%2B")+"&singleEvents=true&orderBy=startTime");
 //BA.debugLineNum = 1781;BA.debugLine="jobDash.GetRequest.SetHeader(\"Authorization\", \"Be";
_jobdash._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 1782;BA.debugLine="End Sub";
return "";
}
public String  _refreshstats() throws Exception{
double _miketotal = 0;
double _erintotal = 0;
 //BA.debugLineNum = 860;BA.debugLine="Public Sub RefreshStats";
 //BA.debugLineNum = 861;BA.debugLine="If OAuth2.access_token = \"\" Then Return";
if ((_oauth2._access_token /*String*/ ).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 863;BA.debugLine="Dim MikeTotal As Double = 0";
_miketotal = 0;
 //BA.debugLineNum = 864;BA.debugLine="Dim ErinTotal As Double = 0";
_erintotal = 0;
 //BA.debugLineNum = 866;BA.debugLine="UpdateStatsPanel(MikeTotal, ErinTotal)";
_updatestatspanel(_miketotal,_erintotal);
 //BA.debugLineNum = 867;BA.debugLine="End Sub";
return "";
}
public String  _renameandsetdate(String _spreadsheetid,int _sheetid,String _newname,String _startdate) throws Exception{
anywheresoftware.b4a.objects.collections.List _requests = null;
anywheresoftware.b4a.objects.collections.Map _renamerequest = null;
anywheresoftware.b4a.objects.collections.Map _deleterequest = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 4168;BA.debugLine="Sub RenameAndSetDate(spreadsheetID As String, shee";
 //BA.debugLineNum = 4169;BA.debugLine="Dim requests As List : requests.Initialize";
_requests = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4169;BA.debugLine="Dim requests As List : requests.Initialize";
_requests.Initialize();
 //BA.debugLineNum = 4171;BA.debugLine="Dim renameRequest As Map = CreateMap( _ 		\"update";
_renamerequest = new anywheresoftware.b4a.objects.collections.Map();
_renamerequest = __c.createMap(new Object[] {(Object)("updateSheetProperties"),(Object)(__c.createMap(new Object[] {(Object)("properties"),(Object)(__c.createMap(new Object[] {(Object)("sheetId"),(Object)(_sheetid),(Object)("title"),(Object)(_newname)}).getObject()),(Object)("fields"),(Object)("title")}).getObject())});
 //BA.debugLineNum = 4177;BA.debugLine="requests.Add(renameRequest)";
_requests.Add((Object)(_renamerequest.getObject()));
 //BA.debugLineNum = 4179;BA.debugLine="Dim deleteRequest As Map = CreateMap( _ 		\"delete";
_deleterequest = new anywheresoftware.b4a.objects.collections.Map();
_deleterequest = __c.createMap(new Object[] {(Object)("deleteSheet"),(Object)(__c.createMap(new Object[] {(Object)("sheetId"),(Object)(0)}).getObject())});
 //BA.debugLineNum = 4182;BA.debugLine="requests.Add(deleteRequest)";
_requests.Add((Object)(_deleterequest.getObject()));
 //BA.debugLineNum = 4184;BA.debugLine="Dim m As Map = CreateMap(\"requests\": requests)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("requests"),(Object)(_requests.getObject())});
 //BA.debugLineNum = 4185;BA.debugLine="Dim json As JSONGenerator : json.Initialize(m)";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 4185;BA.debugLine="Dim json As JSONGenerator : json.Initialize(m)";
_json.Initialize(_m);
 //BA.debugLineNum = 4187;BA.debugLine="Dim job As HttpJob : job.Initialize(\"UpdateSheet\"";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 4187;BA.debugLine="Dim job As HttpJob : job.Initialize(\"UpdateSheet\"";
_job._initialize /*String*/ (ba,"UpdateSheet",this);
 //BA.debugLineNum = 4188;BA.debugLine="job.Tag = CreateMap(\"spreadsheetID\": spreadsheetI";
_job._tag /*Object*/  = (Object)(__c.createMap(new Object[] {(Object)("spreadsheetID"),(Object)(_spreadsheetid),(Object)("startDate"),(Object)(_startdate)}).getObject());
 //BA.debugLineNum = 4189;BA.debugLine="job.PostString(\"https://sheets.googleapis.com/v4/";
_job._poststring /*String*/ ("https://sheets.googleapis.com/v4/spreadsheets/"+_spreadsheetid+":batchUpdate",_json.ToString());
 //BA.debugLineNum = 4190;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 4191;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 4192;BA.debugLine="End Sub";
return "";
}
public String  _requestmanageexternalstorage() throws Exception{
anywheresoftware.b4a.objects.IntentWrapper _in = null;
 //BA.debugLineNum = 2414;BA.debugLine="Private Sub RequestManageExternalStorage";
 //BA.debugLineNum = 2415;BA.debugLine="Log(\"DEBUG: Requesting MANAGE_APP_ALL_FILES_ACCES";
__c.LogImpl("014352385","DEBUG: Requesting MANAGE_APP_ALL_FILES_ACCESS_PERMISSION",0);
 //BA.debugLineNum = 2416;BA.debugLine="Try";
try { //BA.debugLineNum = 2417;BA.debugLine="Dim in As Intent";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 2418;BA.debugLine="in.Initialize(\"android.settings.MANAGE_APP_ALL_F";
_in.Initialize("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION","package:"+__c.Application.getPackageName());
 //BA.debugLineNum = 2419;BA.debugLine="StartActivity(in)";
__c.StartActivity(ba,(Object)(_in.getObject()));
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 2421;BA.debugLine="Log(\"DEBUG: Failed to launch intent: \" & LastExc";
__c.LogImpl("014352391","DEBUG: Failed to launch intent: "+BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 2422;BA.debugLine="xui.MsgboxAsync(\"Could not open settings automat";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Could not open settings automatically. Go to: Settings > Apps > Special Access > All Files Access"),BA.ObjectToCharSequence("Manual Step"));
 };
 //BA.debugLineNum = 2424;BA.debugLine="End Sub";
return "";
}
public String  _resumeappstartup() throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Private Sub ResumeAppStartup";
 //BA.debugLineNum = 185;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 187;BA.debugLine="JobTimer.Initialize(\"JobTimer\", 1000)";
_jobtimer.Initialize(ba,"JobTimer",(long) (1000));
 //BA.debugLineNum = 188;BA.debugLine="StatusRefreshTimer.Initialize(\"StatusRefreshTimer";
_statusrefreshtimer.Initialize(ba,"StatusRefreshTimer",(long) (1000));
 //BA.debugLineNum = 189;BA.debugLine="StatusRefreshTimer.Enabled = True";
_statusrefreshtimer.setEnabled(__c.True);
 //BA.debugLineNum = 192;BA.debugLine="lblStatus.Text = \"Status: Initializing...\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Initializing..."));
 //BA.debugLineNum = 193;BA.debugLine="Root.Color = xui.Color_White";
_root.setColor(_xui.Color_White);
 //BA.debugLineNum = 194;BA.debugLine="If Panel1.IsInitialized Then Panel1.Color = xui.C";
if (_panel1.IsInitialized()) { 
_panel1.setColor(_xui.Color_Transparent);};
 //BA.debugLineNum = 195;BA.debugLine="If pnlStats.IsInitialized Then pnlStats.Color = x";
if (_pnlstats.IsInitialized()) { 
_pnlstats.setColor(_xui.Color_White);};
 //BA.debugLineNum = 198;BA.debugLine="If spnChose.IsInitialized Then";
if (_spnchose.IsInitialized()) { 
 //BA.debugLineNum = 199;BA.debugLine="spnChose.Clear";
_spnchose.Clear();
 //BA.debugLineNum = 200;BA.debugLine="spnChose.Add(\"Mike\")";
_spnchose.Add("Mike");
 //BA.debugLineNum = 201;BA.debugLine="spnChose.Add(\"Erin\" )";
_spnchose.Add("Erin");
 };
 //BA.debugLineNum = 205;BA.debugLine="CheckSettings";
_checksettings();
 //BA.debugLineNum = 208;BA.debugLine="CheckAndRequestSystemPermissions";
_checkandrequestsystempermissions();
 //BA.debugLineNum = 211;BA.debugLine="If searchScreen.IsInitialized = False Then";
if (_searchscreen.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 212;BA.debugLine="searchScreen.Initialize";
_searchscreen._initialize /*String*/ (ba);
 //BA.debugLineNum = 213;BA.debugLine="B4XPages.AddPage(\"SearchPage\", searchScreen)";
_b4xpages._addpage /*String*/ (ba,"SearchPage",(Object)(_searchscreen));
 };
 //BA.debugLineNum = 215;BA.debugLine="If appointmentScreen.IsInitialized = False Then";
if (_appointmentscreen.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 216;BA.debugLine="appointmentScreen.Initialize";
_appointmentscreen._initialize /*String*/ (ba);
 //BA.debugLineNum = 217;BA.debugLine="B4XPages.AddPage(\"AppointmentPage\", appointmentS";
_b4xpages._addpage /*String*/ (ba,"AppointmentPage",(Object)(_appointmentscreen));
 };
 //BA.debugLineNum = 219;BA.debugLine="If ViewScheduleScreen.IsInitialized = False Then";
if (_viewschedulescreen.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 220;BA.debugLine="ViewScheduleScreen.Initialize";
_viewschedulescreen._initialize /*String*/ (ba);
 //BA.debugLineNum = 221;BA.debugLine="B4XPages.AddPage(\"ViewSchedulePage\", ViewSchedul";
_b4xpages._addpage /*String*/ (ba,"ViewSchedulePage",(Object)(_viewschedulescreen));
 };
 //BA.debugLineNum = 223;BA.debugLine="If CloseOutScreen.IsInitialized = False Then";
if (_closeoutscreen.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 224;BA.debugLine="CloseOutScreen.Initialize";
_closeoutscreen._initialize /*String*/ (ba);
 //BA.debugLineNum = 225;BA.debugLine="B4XPages.AddPage(\"CloseOut\", CloseOutScreen)";
_b4xpages._addpage /*String*/ (ba,"CloseOut",(Object)(_closeoutscreen));
 };
 //BA.debugLineNum = 227;BA.debugLine="If clientCreator.IsInitialized = False Then";
if (_clientcreator.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 228;BA.debugLine="clientCreator.Initialize";
_clientcreator._initialize /*String*/ (ba);
 //BA.debugLineNum = 229;BA.debugLine="B4XPages.AddPage(\"CreateClientPage\", clientCreat";
_b4xpages._addpage /*String*/ (ba,"CreateClientPage",(Object)(_clientcreator));
 };
 //BA.debugLineNum = 232;BA.debugLine="SensorShake.Initialize(SensorShake.TYPE_ACCELEROM";
_sensorshake.Initialize(_sensorshake.TYPE_ACCELEROMETER);
 //BA.debugLineNum = 235;BA.debugLine="SetupFontSystem";
_setupfontsystem();
 //BA.debugLineNum = 238;BA.debugLine="LoadSounds";
_loadsounds();
 //BA.debugLineNum = 241;BA.debugLine="SetInitialStatus";
_setinitialstatus();
 //BA.debugLineNum = 242;BA.debugLine="DetectUserIdentity";
_detectuseridentity();
 //BA.debugLineNum = 245;BA.debugLine="lblStatus.Text = \"Status: Connecting...\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Connecting..."));
 //BA.debugLineNum = 247;BA.debugLine="If OAuth2.IsInitialized = False Then";
if (_oauth2._isinitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 248;BA.debugLine="Log(\">>> [OAuth] OAuth2 was NOT initialized. Ini";
__c.LogImpl("011534400",">>> [OAuth] OAuth2 was NOT initialized. Initializing now...",0);
 //BA.debugLineNum = 249;BA.debugLine="OAuth2.Initialize(Me, \"OAuth2\", CLIENT_ID, \"http";
_oauth2._initialize /*String*/ (ba,this,"OAuth2",_client_id,"https://www.googleapis.com/auth/spreadsheets https://www.googleapis.com/auth/calendar https://www.googleapis.com/auth/contacts https://www.googleapis.com/auth/drive https://www.googleapis.com/auth/drive.file");
 }else {
 //BA.debugLineNum = 251;BA.debugLine="Log(\">>> [OAuth] OAuth2 is already initialized.\"";
__c.LogImpl("011534403",">>> [OAuth] OAuth2 is already initialized.",0);
 };
 //BA.debugLineNum = 254;BA.debugLine="Log(\">>> [OAuth] Calling GetAccessToken...\")";
__c.LogImpl("011534406",">>> [OAuth] Calling GetAccessToken...",0);
 //BA.debugLineNum = 255;BA.debugLine="OAuth2.GetAccessToken";
_oauth2._getaccesstoken /*String*/ ();
 //BA.debugLineNum = 258;BA.debugLine="B4XPage_Resize(Root.Width, Root.Height)";
_b4xpage_resize(_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 262;BA.debugLine="StartFoldListener";
_startfoldlistener();
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return "";
}
public String  _runfontmanager() throws Exception{
 //BA.debugLineNum = 2893;BA.debugLine="Private Sub RunFontManager";
 //BA.debugLineNum = 2895;BA.debugLine="xui.MsgboxAsync(\"Font Manager Module coming soon.";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Font Manager Module coming soon."),BA.ObjectToCharSequence("Feature"));
 //BA.debugLineNum = 2896;BA.debugLine="End Sub";
return "";
}
public String  _savebitmaptotemp(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 2914;BA.debugLine="Sub SaveBitmapToTemp(bmp As Bitmap)";
 //BA.debugLineNum = 2915;BA.debugLine="Dim Out As OutputStream = File.OpenOutput(File.Di";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(__c.File.getDirInternal(),"temp_receipt.jpg",__c.False);
 //BA.debugLineNum = 2916;BA.debugLine="bmp.WriteToStream(Out, 100, \"JPEG\")";
_bmp.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
 //BA.debugLineNum = 2917;BA.debugLine="Out.Close";
_out.Close();
 //BA.debugLineNum = 2918;BA.debugLine="ExpensePhotoPath = File.Combine(File.DirInternal,";
_expensephotopath = __c.File.Combine(__c.File.getDirInternal(),"temp_receipt.jpg");
 //BA.debugLineNum = 2919;BA.debugLine="End Sub";
return "";
}
public String  _searchcalendarfordate(long _datems) throws Exception{
int _year = 0;
int _month = 0;
int _day = 0;
long _starttime = 0L;
long _endtime = 0L;
String _timemin = "";
String _timemax = "";
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 1591;BA.debugLine="Sub SearchCalendarForDate(DateMs As Long)";
 //BA.debugLineNum = 1592;BA.debugLine="Dim Year As Int = DateTime.GetYear(DateMs)";
_year = __c.DateTime.GetYear(_datems);
 //BA.debugLineNum = 1593;BA.debugLine="Dim Month As Int = DateTime.GetMonth(DateMs)";
_month = __c.DateTime.GetMonth(_datems);
 //BA.debugLineNum = 1594;BA.debugLine="Dim Day As Int = DateTime.GetDayOfMonth(DateMs)";
_day = __c.DateTime.GetDayOfMonth(_datems);
 //BA.debugLineNum = 1597;BA.debugLine="Dim StartTime As Long = DateUtils.SetDateAndTime(";
_starttime = _dateutils._setdateandtime(ba,_year,_month,_day,(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 1598;BA.debugLine="Dim EndTime As Long = DateUtils.SetDateAndTime(Ye";
_endtime = _dateutils._setdateandtime(ba,_year,_month,_day,(int) (23),(int) (59),(int) (59));
 //BA.debugLineNum = 1600;BA.debugLine="Dim TimeMin As String = CreateRFC3339(StartTime,";
_timemin = _createrfc3339(_starttime,"-05:00");
 //BA.debugLineNum = 1601;BA.debugLine="Dim TimeMax As String = CreateRFC3339(EndTime, \"-";
_timemax = _createrfc3339(_endtime,"-05:00");
 //BA.debugLineNum = 1603;BA.debugLine="Dim job As HttpJob : job.Initialize(\"SearchDate\",";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 1603;BA.debugLine="Dim job As HttpJob : job.Initialize(\"SearchDate\",";
_job._initialize /*String*/ (ba,"SearchDate",this);
 //BA.debugLineNum = 1604;BA.debugLine="job.Download(\"https://www.googleapis.com/calendar";
_job._download /*String*/ ("https://www.googleapis.com/calendar/v3/calendars/primary/events?timeMin="+_timemin.replace("+","%2B")+"&timeMax="+_timemax.replace("+","%2B")+"&singleEvents=true&orderBy=startTime");
 //BA.debugLineNum = 1605;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 1606;BA.debugLine="End Sub";
return "";
}
public String  _searchcontact(String _query) throws Exception{
Geek.God.CRM.App.httpjob _job = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
String _finalurl = "";
 //BA.debugLineNum = 4563;BA.debugLine="Public Sub SearchContact(Query As String)";
 //BA.debugLineNum = 4564;BA.debugLine="CurrentSearchQuery = Query";
_currentsearchquery = _query;
 //BA.debugLineNum = 4565;BA.debugLine="If OAuth2.access_token = \"\" Then";
if ((_oauth2._access_token /*String*/ ).equals("")) { 
 //BA.debugLineNum = 4566;BA.debugLine="xui.MsgboxAsync(\"Please login first.\", \"Authenti";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Please login first."),BA.ObjectToCharSequence("Authentication Required"));
 //BA.debugLineNum = 4567;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4570;BA.debugLine="Dim job As HttpJob : job.Initialize(\"SearchContac";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 4570;BA.debugLine="Dim job As HttpJob : job.Initialize(\"SearchContac";
_job._initialize /*String*/ (ba,"SearchContact",this);
 //BA.debugLineNum = 4571;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 4572;BA.debugLine="Dim FinalURL As String = \"https://people.googleap";
_finalurl = "https://people.googleapis.com/v1/people:searchContacts?query="+_su.EncodeUrl(_query,"UTF8")+"&readMask=names,phoneNumbers,addresses,biographies,memberships";
 //BA.debugLineNum = 4573;BA.debugLine="job.Download(FinalURL)";
_job._download /*String*/ (_finalurl);
 //BA.debugLineNum = 4574;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 4575;BA.debugLine="End Sub";
return "";
}
public String  _setinitialstatus() throws Exception{
 //BA.debugLineNum = 683;BA.debugLine="Private Sub SetInitialStatus";
 //BA.debugLineNum = 684;BA.debugLine="DateTime.DateFormat = \"EEE MM/dd/yyyy\"";
__c.DateTime.setDateFormat("EEE MM/dd/yyyy");
 //BA.debugLineNum = 685;BA.debugLine="lblDayDate.Text = DateTime.Date(DateTime.Now)";
_lbldaydate.setText(BA.ObjectToCharSequence(__c.DateTime.Date(__c.DateTime.getNow())));
 //BA.debugLineNum = 686;BA.debugLine="lblDayDate.Color = xui.Color_Transparent";
_lbldaydate.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 687;BA.debugLine="lblDayDate.TextColor = xui.Color_Black";
_lbldaydate.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 689;BA.debugLine="CheckHolidayTheme";
_checkholidaytheme();
 //BA.debugLineNum = 691;BA.debugLine="lblStatus.Text = \"Status: Disconnected\"";
_lblstatus.setText(BA.ObjectToCharSequence("Status: Disconnected"));
 //BA.debugLineNum = 692;BA.debugLine="lblStatus.Color = xui.Color_White";
_lblstatus.setColor(_xui.Color_White);
 //BA.debugLineNum = 693;BA.debugLine="lblStatus.TextColor = 0xFFD32F2F";
_lblstatus.setTextColor(((int)0xffd32f2f));
 //BA.debugLineNum = 695;BA.debugLine="lblAppsGodNum.Text = \"0\"";
_lblappsgodnum.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 696;BA.debugLine="lblAppsGoddessNum.Text = \"0\"";
_lblappsgoddessnum.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 697;BA.debugLine="lblGodCollectedNum.Text = \"$0.00\"";
_lblgodcollectednum.setText(BA.ObjectToCharSequence("$0.00"));
 //BA.debugLineNum = 698;BA.debugLine="lblGoddessCollectedNum.Text = \"$0.00\"";
_lblgoddesscollectednum.setText(BA.ObjectToCharSequence("$0.00"));
 //BA.debugLineNum = 699;BA.debugLine="lblTotalCollectedNum.Text = \"$0.00\"";
_lbltotalcollectednum.setText(BA.ObjectToCharSequence("$0.00"));
 //BA.debugLineNum = 701;BA.debugLine="lblTotalAptsGod.Text = \"Mike's Apts:\"";
_lbltotalaptsgod.setText(BA.ObjectToCharSequence("Mike's Apts:"));
 //BA.debugLineNum = 702;BA.debugLine="lblTotalAptsGoddess.Text = \"Erin's Apts:\"";
_lbltotalaptsgoddess.setText(BA.ObjectToCharSequence("Erin's Apts:"));
 //BA.debugLineNum = 703;BA.debugLine="lblGodCollected.Text = \"Mike Collected:\"";
_lblgodcollected.setText(BA.ObjectToCharSequence("Mike Collected:"));
 //BA.debugLineNum = 704;BA.debugLine="lblGoddessCollected.Text = \"Erin Collected:\"";
_lblgoddesscollected.setText(BA.ObjectToCharSequence("Erin Collected:"));
 //BA.debugLineNum = 705;BA.debugLine="lblTotalCollected.Text = \"Total Collected:\"";
_lbltotalcollected.setText(BA.ObjectToCharSequence("Total Collected:"));
 //BA.debugLineNum = 707;BA.debugLine="btnCloseout.Color = xui.Color_Red";
_btncloseout.setColor(_xui.Color_Red);
 //BA.debugLineNum = 708;BA.debugLine="btnCloseout.TextColor = xui.Color_White";
_btncloseout.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 709;BA.debugLine="btnCloseout.Text = \"No Apt Started\"";
_btncloseout.setText(BA.ObjectToCharSequence("No Apt Started"));
 //BA.debugLineNum = 712;BA.debugLine="btnCloseout.Enabled = True";
_btncloseout.setEnabled(__c.True);
 //BA.debugLineNum = 713;BA.debugLine="End Sub";
return "";
}
public String  _setpendingslot(anywheresoftware.b4a.objects.collections.Map _slotinfo) throws Exception{
 //BA.debugLineNum = 1500;BA.debugLine="Public Sub SetPendingSlot(SlotInfo As Map)";
 //BA.debugLineNum = 1501;BA.debugLine="Log(\">>> [TRAFFIC COP] Received Manual Slot Push:";
__c.LogImpl("013434881",">>> [TRAFFIC COP] Received Manual Slot Push: "+BA.ObjectToString(_slotinfo),0);
 //BA.debugLineNum = 1503;BA.debugLine="PendingSlot = SlotInfo";
_pendingslot = _slotinfo;
 //BA.debugLineNum = 1504;BA.debugLine="End Sub";
return "";
}
public String  _setupfontsystem() throws Exception{
String _rootdir = "";
String _fontsdir = "";
String _pooldir = "";
String[] _pagefonts = null;
String _f = "";
int _i = 0;
 //BA.debugLineNum = 480;BA.debugLine="Private Sub SetupFontSystem";
 //BA.debugLineNum = 481;BA.debugLine="Dim RootDir As String = File.DirRootExternal & \"/";
_rootdir = __c.File.getDirRootExternal()+"/Geek God CRM";
 //BA.debugLineNum = 483;BA.debugLine="Dim FontsDir As String = RootDir & \"/fonts\"";
_fontsdir = _rootdir+"/fonts";
 //BA.debugLineNum = 484;BA.debugLine="Dim PoolDir As String = RootDir & \"/custom font p";
_pooldir = _rootdir+"/custom font pool";
 //BA.debugLineNum = 486;BA.debugLine="Log(\">>> [FONTS] Starting Font Deployment...\")";
__c.LogImpl("011730950",">>> [FONTS] Starting Font Deployment...",0);
 //BA.debugLineNum = 489;BA.debugLine="If File.Exists(RootDir, \"\") = False Then File.Mak";
if (__c.File.Exists(_rootdir,"")==__c.False) { 
__c.File.MakeDir(__c.File.getDirRootExternal(),"Geek God CRM");};
 //BA.debugLineNum = 490;BA.debugLine="If File.Exists(FontsDir, \"\") = False Then File.Ma";
if (__c.File.Exists(_fontsdir,"")==__c.False) { 
__c.File.MakeDir(_rootdir,"fonts");};
 //BA.debugLineNum = 491;BA.debugLine="If File.Exists(PoolDir, \"\") = False Then File.Mak";
if (__c.File.Exists(_pooldir,"")==__c.False) { 
__c.File.MakeDir(_rootdir,"custom font pool");};
 //BA.debugLineNum = 494;BA.debugLine="Dim PageFonts() As String = Array As String(\"main";
_pagefonts = new String[]{"mainpage - labels.ttf","mainpage - buttons.ttf","mainpage - stats labels.ttf","mainpage - cardtext.ttf"};
 //BA.debugLineNum = 495;BA.debugLine="For Each f As String In PageFonts";
{
final String[] group9 = _pagefonts;
final int groupLen9 = group9.length
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_f = group9[index9];
 //BA.debugLineNum = 496;BA.debugLine="If File.Exists(File.DirAssets, f) Then";
if (__c.File.Exists(__c.File.getDirAssets(),_f)) { 
 //BA.debugLineNum = 498;BA.debugLine="If File.Exists(FontsDir, f) = False Then";
if (__c.File.Exists(_fontsdir,_f)==__c.False) { 
 //BA.debugLineNum = 499;BA.debugLine="Try";
try { //BA.debugLineNum = 500;BA.debugLine="File.Copy(File.DirAssets, f, FontsDir, f)";
__c.File.Copy(__c.File.getDirAssets(),_f,_fontsdir,_f);
 //BA.debugLineNum = 501;BA.debugLine="Log(\">>> [FONTS] Deployed: \" & f)";
__c.LogImpl("011730965",">>> [FONTS] Deployed: "+_f,0);
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 503;BA.debugLine="Log(\">>> [FONTS] Error Deploying \" & f & \": \"";
__c.LogImpl("011730967",">>> [FONTS] Error Deploying "+_f+": "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
 };
 }
};
 //BA.debugLineNum = 510;BA.debugLine="For i = 1 To 50";
{
final int step21 = 1;
final int limit21 = (int) (50);
_i = (int) (1) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
 //BA.debugLineNum = 511;BA.debugLine="Dim f As String = i & \".ttf\"";
_f = BA.NumberToString(_i)+".ttf";
 //BA.debugLineNum = 512;BA.debugLine="If File.Exists(File.DirAssets, f) Then";
if (__c.File.Exists(__c.File.getDirAssets(),_f)) { 
 //BA.debugLineNum = 513;BA.debugLine="If File.Exists(PoolDir, f) = False Then";
if (__c.File.Exists(_pooldir,_f)==__c.False) { 
 //BA.debugLineNum = 514;BA.debugLine="Try";
try { //BA.debugLineNum = 515;BA.debugLine="File.Copy(File.DirAssets, f, PoolDir, f)";
__c.File.Copy(__c.File.getDirAssets(),_f,_pooldir,_f);
 //BA.debugLineNum = 516;BA.debugLine="Log(\">>> [FONTS] Deployed Pool Font: \" & f)";
__c.LogImpl("011730980",">>> [FONTS] Deployed Pool Font: "+_f,0);
 } 
       catch (Exception e29) {
			ba.setLastException(e29); //BA.debugLineNum = 518;BA.debugLine="Log(\">>> [FONTS] Error Deploying Pool \" & f &";
__c.LogImpl("011730982",">>> [FONTS] Error Deploying Pool "+_f+": "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
 };
 }
};
 //BA.debugLineNum = 525;BA.debugLine="fontLabels = LoadFontFromFile(FontsDir, \"mainpage";
_fontlabels = _loadfontfromfile(_fontsdir,"mainpage - labels.ttf");
 //BA.debugLineNum = 526;BA.debugLine="fontButtons = LoadFontFromFile(FontsDir, \"mainpag";
_fontbuttons = _loadfontfromfile(_fontsdir,"mainpage - buttons.ttf");
 //BA.debugLineNum = 527;BA.debugLine="fontStats = LoadFontFromFile(FontsDir, \"mainpage";
_fontstats = _loadfontfromfile(_fontsdir,"mainpage - stats labels.ttf");
 //BA.debugLineNum = 528;BA.debugLine="fontCardText = LoadFontFromFile(FontsDir, \"mainpa";
_fontcardtext = _loadfontfromfile(_fontsdir,"mainpage - cardtext.ttf");
 //BA.debugLineNum = 530;BA.debugLine="ApplyFontsToUI";
_applyfontstoui();
 //BA.debugLineNum = 531;BA.debugLine="End Sub";
return "";
}
public String  _showexpenseui() throws Exception{
boolean _islandscape = false;
anywheresoftware.b4a.objects.ImageViewWrapper _imgreceipt = null;
anywheresoftware.b4a.objects.B4XViewWrapper _ximg = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnlform = null;
int _formw = 0;
int _imgh = 0;
int _topy = 0;
anywheresoftware.b4a.objects.ButtonWrapper _btnsave = null;
anywheresoftware.b4a.objects.ButtonWrapper _btnclose = null;
 //BA.debugLineNum = 2931;BA.debugLine="Private Sub ShowExpenseUI";
 //BA.debugLineNum = 2933;BA.debugLine="ExtractedDate = DateTime.Date(DateTime.Now)";
_extracteddate = __c.DateTime.Date(__c.DateTime.getNow());
 //BA.debugLineNum = 2934;BA.debugLine="ExtractedTime = DateTime.Time(DateTime.Now)";
_extractedtime = __c.DateTime.Time(__c.DateTime.getNow());
 //BA.debugLineNum = 2937;BA.debugLine="ExpensePanel = xui.CreatePanel(\"ExpensePanel\")";
_expensepanel = _xui.CreatePanel(ba,"ExpensePanel");
 //BA.debugLineNum = 2938;BA.debugLine="ExpensePanel.Color = xui.Color_White";
_expensepanel.setColor(_xui.Color_White);
 //BA.debugLineNum = 2939;BA.debugLine="Root.AddView(ExpensePanel, 0, 0, Root.Width, Root";
_root.AddView((android.view.View)(_expensepanel.getObject()),(int) (0),(int) (0),_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 2941;BA.debugLine="Dim IsLandscape As Boolean = (Root.Width > Root.H";
_islandscape = (_root.getWidth()>_root.getHeight());
 //BA.debugLineNum = 2944;BA.debugLine="Dim imgReceipt As ImageView : imgReceipt.Initiali";
_imgreceipt = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 2944;BA.debugLine="Dim imgReceipt As ImageView : imgReceipt.Initiali";
_imgreceipt.Initialize(ba,"");
 //BA.debugLineNum = 2945;BA.debugLine="Dim xImg As B4XView = imgReceipt";
_ximg = new anywheresoftware.b4a.objects.B4XViewWrapper();
_ximg = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imgreceipt.getObject()));
 //BA.debugLineNum = 2946;BA.debugLine="xImg.SetBitmap(xui.LoadBitmap(File.DirInternal, \"";
_ximg.SetBitmap((android.graphics.Bitmap)(_xui.LoadBitmap(__c.File.getDirInternal(),"temp_receipt.jpg").getObject()));
 //BA.debugLineNum = 2947;BA.debugLine="ExpensePanel.AddView(xImg, 0, 0, 0, 0)";
_expensepanel.AddView((android.view.View)(_ximg.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 2950;BA.debugLine="Dim pnlForm As B4XView = xui.CreatePanel(\"\")";
_pnlform = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlform = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 2951;BA.debugLine="ExpensePanel.AddView(pnlForm, 0, 0, 0, 0)";
_expensepanel.AddView((android.view.View)(_pnlform.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 2953;BA.debugLine="If IsLandscape Then";
if (_islandscape) { 
 //BA.debugLineNum = 2955;BA.debugLine="Dim FormW As Int = Root.Width * 0.60";
_formw = (int) (_root.getWidth()*0.60);
 //BA.debugLineNum = 2956;BA.debugLine="xImg.SetLayoutAnimated(0, FormW + 10dip, 10dip,";
_ximg.SetLayoutAnimated((int) (0),(int) (_formw+__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (10)),(int) (_root.getWidth()-_formw-__c.DipToCurrent((int) (20))),(int) (_root.getHeight()-__c.DipToCurrent((int) (20))));
 //BA.debugLineNum = 2957;BA.debugLine="pnlForm.SetLayoutAnimated(0, 0, 0, FormW, Root.H";
_pnlform.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_formw,_root.getHeight());
 }else {
 //BA.debugLineNum = 2960;BA.debugLine="Dim ImgH As Int = Root.Height * 0.40";
_imgh = (int) (_root.getHeight()*0.40);
 //BA.debugLineNum = 2961;BA.debugLine="xImg.SetLayoutAnimated(0, 10dip, 10dip, Root.Wid";
_ximg.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),(int) (_root.getWidth()-__c.DipToCurrent((int) (20))),(int) (_imgh-__c.DipToCurrent((int) (20))));
 //BA.debugLineNum = 2962;BA.debugLine="pnlForm.SetLayoutAnimated(0, 0, ImgH, Root.Width";
_pnlform.SetLayoutAnimated((int) (0),(int) (0),_imgh,_root.getWidth(),(int) (_root.getHeight()-_imgh));
 };
 //BA.debugLineNum = 2966;BA.debugLine="Dim TopY As Int = 10dip";
_topy = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 2968;BA.debugLine="ExpenseDateLabel = CreateLabel(\"Date: \" & Extract";
_expensedatelabel = _createlabel("Date: "+_extracteddate+" "+_extractedtime);
 //BA.debugLineNum = 2969;BA.debugLine="pnlForm.AddView(ExpenseDateLabel, 10dip, TopY, pn";
_pnlform.AddView((android.view.View)(_expensedatelabel.getObject()),__c.DipToCurrent((int) (10)),_topy,(int) (_pnlform.getWidth()-__c.DipToCurrent((int) (20))),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 2970;BA.debugLine="TopY = TopY + 40dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 2972;BA.debugLine="ExpenseCategorySpinner = CreateSpinner";
_expensecategoryspinner = _createspinner();
 //BA.debugLineNum = 2973;BA.debugLine="ExpenseCategorySpinner.AddAll(Array As String(\"Fu";
_expensecategoryspinner.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Fuel","Equipment","Supplies","Software","Advertising","Meals","Travel","Other"}));
 //BA.debugLineNum = 2974;BA.debugLine="pnlForm.AddView(ExpenseCategorySpinner, 10dip, To";
_pnlform.AddView((android.view.View)(_expensecategoryspinner.getObject()),__c.DipToCurrent((int) (10)),_topy,(int) (_pnlform.getWidth()-__c.DipToCurrent((int) (20))),__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 2975;BA.debugLine="TopY = TopY + 60dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 2977;BA.debugLine="ExpenseAmount = CreateEditText(\"Amount ($)\")";
_expenseamount = _createedittext("Amount ($)");
 //BA.debugLineNum = 2978;BA.debugLine="pnlForm.AddView(ExpenseAmount, 10dip, TopY, pnlFo";
_pnlform.AddView((android.view.View)(_expenseamount.getObject()),__c.DipToCurrent((int) (10)),_topy,(int) (_pnlform.getWidth()-__c.DipToCurrent((int) (20))),__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 2979;BA.debugLine="TopY = TopY + 60dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 2981;BA.debugLine="ExpenseNotes = CreateEditText(\"Notes / Descriptio";
_expensenotes = _createedittext("Notes / Description");
 //BA.debugLineNum = 2982;BA.debugLine="pnlForm.AddView(ExpenseNotes, 10dip, TopY, pnlFor";
_pnlform.AddView((android.view.View)(_expensenotes.getObject()),__c.DipToCurrent((int) (10)),_topy,(int) (_pnlform.getWidth()-__c.DipToCurrent((int) (20))),__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 2983;BA.debugLine="TopY = TopY + 110dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (110)));
 //BA.debugLineNum = 2985;BA.debugLine="Dim btnSave As Button : btnSave.Initialize(\"btnSa";
_btnsave = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 2985;BA.debugLine="Dim btnSave As Button : btnSave.Initialize(\"btnSa";
_btnsave.Initialize(ba,"btnSaveExpense");
 //BA.debugLineNum = 2986;BA.debugLine="btnSave.Text = \"SAVE EXPENSE\"";
_btnsave.setText(BA.ObjectToCharSequence("SAVE EXPENSE"));
 //BA.debugLineNum = 2987;BA.debugLine="pnlForm.AddView(btnSave, 10dip, TopY, pnlForm.Wid";
_pnlform.AddView((android.view.View)(_btnsave.getObject()),__c.DipToCurrent((int) (10)),_topy,(int) (_pnlform.getWidth()-__c.DipToCurrent((int) (20))),__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 2988;BA.debugLine="TopY = TopY + 70dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (70)));
 //BA.debugLineNum = 2990;BA.debugLine="Dim btnClose As Button : btnClose.Initialize(\"btn";
_btnclose = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 2990;BA.debugLine="Dim btnClose As Button : btnClose.Initialize(\"btn";
_btnclose.Initialize(ba,"btnCloseExpense");
 //BA.debugLineNum = 2991;BA.debugLine="btnClose.Text = \"CANCEL\"";
_btnclose.setText(BA.ObjectToCharSequence("CANCEL"));
 //BA.debugLineNum = 2992;BA.debugLine="pnlForm.AddView(btnClose, 10dip, TopY, pnlForm.Wi";
_pnlform.AddView((android.view.View)(_btnclose.getObject()),__c.DipToCurrent((int) (10)),_topy,(int) (_pnlform.getWidth()-__c.DipToCurrent((int) (20))),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 2993;BA.debugLine="End Sub";
return "";
}
public void  _showfuzzyoptions() throws Exception{
ResumableSub_ShowFuzzyOptions rsub = new ResumableSub_ShowFuzzyOptions(this);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowFuzzyOptions extends BA.ResumableSub {
public ResumableSub_ShowFuzzyOptions(Geek.God.CRM.App.b4xmainpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.List _options = null;
String _key = "";
int _index = 0;
String _selectedname = "";
anywheresoftware.b4a.objects.collections.Map _person = null;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 3680;BA.debugLine="Dim Options As List : Options.Initialize";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3680;BA.debugLine="Dim Options As List : Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 3681;BA.debugLine="For Each key As String In FuzzyCandidates.Keys";
if (true) break;

case 1:
//for
this.state = 4;
group3 = parent._fuzzycandidates.Keys();
index3 = 0;
groupLen3 = group3.getSize();
this.state = 11;
if (true) break;

case 11:
//C
this.state = 4;
if (index3 < groupLen3) {
this.state = 3;
_key = BA.ObjectToString(group3.Get(index3));}
if (true) break;

case 12:
//C
this.state = 11;
index3++;
if (true) break;

case 3:
//C
this.state = 12;
 //BA.debugLineNum = 3682;BA.debugLine="Options.Add(key)";
_options.Add((Object)(_key));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 3684;BA.debugLine="InputListAsync(Options, \"No '\" & CurrentSearchQue";
parent.__c.InputListAsync(_options,BA.ObjectToCharSequence("No '"+parent._currentsearchquery+"' found. Did you mean?"),(int) (-1),ba,parent.__c.True);
 //BA.debugLineNum = 3685;BA.debugLine="Wait For InputList_Result (Index As Int)";
parent.__c.WaitFor("inputlist_result", ba, this, null);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_index = (Integer) result[0];
;
 //BA.debugLineNum = 3686;BA.debugLine="If Index <> -3 Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_index!=-3) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 //BA.debugLineNum = 3687;BA.debugLine="Dim selectedName As String = Options.Get(Index)";
_selectedname = BA.ObjectToString(_options.Get(_index));
 //BA.debugLineNum = 3688;BA.debugLine="Dim person As Map = FuzzyCandidates.Get(selected";
_person = new anywheresoftware.b4a.objects.collections.Map();
_person = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent._fuzzycandidates.Get((Object)(_selectedname))));
 //BA.debugLineNum = 3689;BA.debugLine="ParseAndLoadProfile(person)";
parent._parseandloadprofile(_person);
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 3691;BA.debugLine="CallSub(searchScreen, \"ShowProfileNotFound\")";
parent.__c.CallSubNew(ba,(Object)(parent._searchscreen),"ShowProfileNotFound");
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 3693;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _showscrapemanualentry(anywheresoftware.b4a.objects.collections.Map _scrapedata) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _pnloverlay = null;
anywheresoftware.b4a.objects.PanelWrapper _nativepnl = null;
int _screenw = 0;
boolean _isbigscreen = false;
int _dialogw = 0;
int _dialogh = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnldialog = null;
int _leftpos = 0;
int _toppos = 0;
anywheresoftware.b4a.objects.LabelWrapper _lblheader = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xheader = null;
anywheresoftware.b4a.objects.ButtonWrapper _btnclosepopup = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnlleft = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _svright = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pcontent = null;
int _headerh = 0;
int _bodyh = 0;
int _leftw = 0;
int _rightw = 0;
int _toph = 0;
int _both = 0;
String _rawname = "";
String _rawname2 = "";
String _rawphone = "";
String _rawaddr = "";
String _rawnotes = "";
String _rawbody = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _vmdate = "";
String _vmtime = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _mheader = null;
String _fullheader = "";
int _lastspace = 0;
String _audiopath = "";
String _emlpath = "";
String _fname = "";
String _amrname = "";
anywheresoftware.b4a.objects.ButtonWrapper _btnplay = null;
anywheresoftware.b4a.objects.ButtonWrapper _btnstop = null;
anywheresoftware.b4a.objects.SeekBarWrapper _skbaudio = null;
anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
anywheresoftware.b4a.objects.LabelWrapper _lbltime = null;
anywheresoftware.b4a.objects.LabelWrapper _lblduration = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xduration = null;
anywheresoftware.b4a.objects.EditTextWrapper _txttrans = null;
int _totalsecs = 0;
int _topy = 0;
int _formw = 0;
anywheresoftware.b4a.objects.ButtonWrapper _btncreate = null;
anywheresoftware.b4a.objects.ButtonWrapper _btndel = null;
anywheresoftware.b4a.objects.ButtonWrapper _btnarc = null;
 //BA.debugLineNum = 5354;BA.debugLine="Public Sub ShowScrapeManualEntry(ScrapeData As Map";
 //BA.debugLineNum = 5356;BA.debugLine="Dim pnlOverlay As B4XView = xui.CreatePanel(\"pnlS";
_pnloverlay = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnloverlay = _xui.CreatePanel(ba,"pnlScrapeReview");
 //BA.debugLineNum = 5357;BA.debugLine="pnlOverlay.Color = 0xAA000000 ' Semi-transparent";
_pnloverlay.setColor(((int)0xaa000000));
 //BA.debugLineNum = 5358;BA.debugLine="Root.AddView(pnlOverlay, 0, 0, Root.Width, Root.H";
_root.AddView((android.view.View)(_pnloverlay.getObject()),(int) (0),(int) (0),_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 5359;BA.debugLine="pnlOverlay.BringToFront";
_pnloverlay.BringToFront();
 //BA.debugLineNum = 5360;BA.debugLine="pnlOverlay.Tag = ScrapeData ' Store for file mana";
_pnloverlay.setTag((Object)(_scrapedata.getObject()));
 //BA.debugLineNum = 5363;BA.debugLine="Dim NativePnl As Panel = pnlOverlay";
_nativepnl = new anywheresoftware.b4a.objects.PanelWrapper();
_nativepnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_pnloverlay.getObject()));
 //BA.debugLineNum = 5364;BA.debugLine="NativePnl.Elevation = 10dip";
_nativepnl.setElevation((float) (__c.DipToCurrent((int) (10))));
 //BA.debugLineNum = 5367;BA.debugLine="Dim ScreenW As Int = GetDeviceLayoutValues.Width";
_screenw = __c.GetDeviceLayoutValues(ba).Width;
 //BA.debugLineNum = 5368;BA.debugLine="Dim IsBigScreen As Boolean = (ScreenW > 1300)";
_isbigscreen = (_screenw>1300);
 //BA.debugLineNum = 5370;BA.debugLine="Dim DialogW As Int";
_dialogw = 0;
 //BA.debugLineNum = 5371;BA.debugLine="Dim DialogH As Int";
_dialogh = 0;
 //BA.debugLineNum = 5373;BA.debugLine="If IsBigScreen Then";
if (_isbigscreen) { 
 //BA.debugLineNum = 5374;BA.debugLine="DialogW = Min(Root.Width * 0.90, 1100dip)";
_dialogw = (int) (__c.Min(_root.getWidth()*0.90,__c.DipToCurrent((int) (1100))));
 //BA.debugLineNum = 5375;BA.debugLine="DialogH = Min(Root.Height * 0.85, 800dip)";
_dialogh = (int) (__c.Min(_root.getHeight()*0.85,__c.DipToCurrent((int) (800))));
 }else {
 //BA.debugLineNum = 5377;BA.debugLine="DialogW = Root.Width * 0.95";
_dialogw = (int) (_root.getWidth()*0.95);
 //BA.debugLineNum = 5378;BA.debugLine="DialogH = Root.Height * 0.90";
_dialogh = (int) (_root.getHeight()*0.90);
 };
 //BA.debugLineNum = 5382;BA.debugLine="Dim pnlDialog As B4XView = xui.CreatePanel(\"\")";
_pnldialog = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnldialog = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 5383;BA.debugLine="pnlDialog.SetColorAndBorder(xui.Color_White, 2dip";
_pnldialog.SetColorAndBorder(_xui.Color_White,__c.DipToCurrent((int) (2)),_xui.Color_Black,__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 5384;BA.debugLine="Dim LeftPos As Int = (Root.Width - DialogW) / 2";
_leftpos = (int) ((_root.getWidth()-_dialogw)/(double)2);
 //BA.debugLineNum = 5385;BA.debugLine="Dim TopPos As Int = (Root.Height - DialogH) / 2";
_toppos = (int) ((_root.getHeight()-_dialogh)/(double)2);
 //BA.debugLineNum = 5386;BA.debugLine="pnlOverlay.AddView(pnlDialog, LeftPos, TopPos, Di";
_pnloverlay.AddView((android.view.View)(_pnldialog.getObject()),_leftpos,_toppos,_dialogw,_dialogh);
 //BA.debugLineNum = 5389;BA.debugLine="Dim lblHeader As Label : lblHeader.Initialize(\"\")";
_lblheader = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 5389;BA.debugLine="Dim lblHeader As Label : lblHeader.Initialize(\"\")";
_lblheader.Initialize(ba,"");
 //BA.debugLineNum = 5390;BA.debugLine="Dim xHeader As B4XView = lblHeader";
_xheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xheader = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblheader.getObject()));
 //BA.debugLineNum = 5391;BA.debugLine="xHeader.Text = \"Review Voicemail Data\"";
_xheader.setText(BA.ObjectToCharSequence("Review Voicemail Data"));
 //BA.debugLineNum = 5392;BA.debugLine="xHeader.TextSize = 20";
_xheader.setTextSize((float) (20));
 //BA.debugLineNum = 5393;BA.debugLine="xHeader.TextColor = xui.Color_Black";
_xheader.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 5394;BA.debugLine="lblHeader.Typeface = Typeface.DEFAULT_BOLD";
_lblheader.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 5395;BA.debugLine="xHeader.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xheader.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 5396;BA.debugLine="pnlDialog.AddView(xHeader, 0, 10dip, DialogW, 40d";
_pnldialog.AddView((android.view.View)(_xheader.getObject()),(int) (0),__c.DipToCurrent((int) (10)),_dialogw,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 5398;BA.debugLine="Dim btnClosePopup As Button : btnClosePopup.Initi";
_btnclosepopup = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5398;BA.debugLine="Dim btnClosePopup As Button : btnClosePopup.Initi";
_btnclosepopup.Initialize(ba,"btnCloseScraper");
 //BA.debugLineNum = 5399;BA.debugLine="btnClosePopup.Text = Chr(0xF015) ' Standard House";
_btnclosepopup.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf015))));
 //BA.debugLineNum = 5400;BA.debugLine="btnClosePopup.Typeface = Typeface.FONTAWESOME";
_btnclosepopup.setTypeface(__c.Typeface.getFONTAWESOME());
 //BA.debugLineNum = 5401;BA.debugLine="btnClosePopup.TextSize = 24";
_btnclosepopup.setTextSize((float) (24));
 //BA.debugLineNum = 5402;BA.debugLine="btnClosePopup.Color = xui.Color_Transparent";
_btnclosepopup.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 5403;BA.debugLine="btnClosePopup.TextColor = xui.Color_Black";
_btnclosepopup.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 5404;BA.debugLine="btnClosePopup.Gravity = Gravity.CENTER";
_btnclosepopup.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 5405;BA.debugLine="btnClosePopup.Tag = pnlOverlay";
_btnclosepopup.setTag((Object)(_pnloverlay.getObject()));
 //BA.debugLineNum = 5406;BA.debugLine="pnlDialog.AddView(btnClosePopup, 5dip, 10dip, 60d";
_pnldialog.AddView((android.view.View)(_btnclosepopup.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (60)),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 5409;BA.debugLine="Dim pnlLeft As B4XView = xui.CreatePanel(\"\")";
_pnlleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlleft = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 5410;BA.debugLine="Dim svRight As ScrollView : svRight.Initialize(0)";
_svright = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 5410;BA.debugLine="Dim svRight As ScrollView : svRight.Initialize(0)";
_svright.Initialize(ba,(int) (0));
 //BA.debugLineNum = 5411;BA.debugLine="pnlDialog.AddView(pnlLeft, 0, 0, 0, 0)";
_pnldialog.AddView((android.view.View)(_pnlleft.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 5412;BA.debugLine="pnlDialog.AddView(svRight, 0, 0, 0, 0)";
_pnldialog.AddView((android.view.View)(_svright.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 5413;BA.debugLine="Dim pContent As B4XView = svRight.Panel";
_pcontent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pcontent = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_svright.getPanel().getObject()));
 //BA.debugLineNum = 5414;BA.debugLine="pContent.Color = xui.Color_White";
_pcontent.setColor(_xui.Color_White);
 //BA.debugLineNum = 5417;BA.debugLine="Dim HeaderH As Int = 50dip";
_headerh = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 5418;BA.debugLine="Dim BodyH As Int = DialogH - HeaderH - 10dip";
_bodyh = (int) (_dialogh-_headerh-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 5420;BA.debugLine="If IsBigScreen Then";
if (_isbigscreen) { 
 //BA.debugLineNum = 5421;BA.debugLine="Dim LeftW As Int = DialogW * 0.45";
_leftw = (int) (_dialogw*0.45);
 //BA.debugLineNum = 5422;BA.debugLine="Dim RightW As Int = DialogW - LeftW";
_rightw = (int) (_dialogw-_leftw);
 //BA.debugLineNum = 5423;BA.debugLine="pnlLeft.SetLayoutAnimated(0, 5dip, HeaderH, Left";
_pnlleft.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),_headerh,(int) (_leftw-__c.DipToCurrent((int) (5))),_bodyh);
 //BA.debugLineNum = 5424;BA.debugLine="svRight.SetLayoutAnimated(0, LeftW + 5dip, Heade";
_svright.SetLayoutAnimated((int) (0),(int) (_leftw+__c.DipToCurrent((int) (5))),_headerh,(int) (_rightw-__c.DipToCurrent((int) (10))),_bodyh);
 //BA.debugLineNum = 5425;BA.debugLine="pContent.Width = RightW - 10dip";
_pcontent.setWidth((int) (_rightw-__c.DipToCurrent((int) (10))));
 }else {
 //BA.debugLineNum = 5427;BA.debugLine="Dim TopH As Int = BodyH * 0.40";
_toph = (int) (_bodyh*0.40);
 //BA.debugLineNum = 5428;BA.debugLine="Dim BotH As Int = BodyH - TopH";
_both = (int) (_bodyh-_toph);
 //BA.debugLineNum = 5429;BA.debugLine="pnlLeft.SetLayoutAnimated(0, 5dip, HeaderH, Dial";
_pnlleft.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),_headerh,(int) (_dialogw-__c.DipToCurrent((int) (10))),_toph);
 //BA.debugLineNum = 5430;BA.debugLine="svRight.SetLayoutAnimated(0, 5dip, HeaderH + Top";
_svright.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),(int) (_headerh+_toph),(int) (_dialogw-__c.DipToCurrent((int) (10))),_both);
 //BA.debugLineNum = 5431;BA.debugLine="pContent.Width = DialogW - 10dip";
_pcontent.setWidth((int) (_dialogw-__c.DipToCurrent((int) (10))));
 };
 //BA.debugLineNum = 5435;BA.debugLine="Dim RawName As String = ScrapeData.GetDefault(\"Na";
_rawname = BA.ObjectToString(_scrapedata.GetDefault((Object)("Name"),(Object)("")));
 //BA.debugLineNum = 5436;BA.debugLine="Dim RawName2 As String = ScrapeData.GetDefault(\"N";
_rawname2 = BA.ObjectToString(_scrapedata.GetDefault((Object)("Name2"),(Object)("")));
 //BA.debugLineNum = 5437;BA.debugLine="Dim RawPhone As String = ScrapeData.GetDefault(\"P";
_rawphone = BA.ObjectToString(_scrapedata.GetDefault((Object)("Phone"),(Object)("")));
 //BA.debugLineNum = 5438;BA.debugLine="Dim RawAddr As String = ScrapeData.GetDefault(\"Ad";
_rawaddr = BA.ObjectToString(_scrapedata.GetDefault((Object)("Address"),(Object)("")));
 //BA.debugLineNum = 5439;BA.debugLine="Dim RawNotes As String = ScrapeData.GetDefault(\"N";
_rawnotes = BA.ObjectToString(_scrapedata.GetDefault((Object)("Notes"),(Object)("")));
 //BA.debugLineNum = 5441;BA.debugLine="Dim RawBody As String = \"\"";
_rawbody = "";
 //BA.debugLineNum = 5442;BA.debugLine="If ScrapeData.ContainsKey(\"BodyBuilder\") Then";
if (_scrapedata.ContainsKey((Object)("BodyBuilder"))) { 
 //BA.debugLineNum = 5443;BA.debugLine="Dim sb As StringBuilder = ScrapeData.Get(\"BodyBu";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_sb = (anywheresoftware.b4a.keywords.StringBuilderWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.StringBuilderWrapper(), (java.lang.StringBuilder)(_scrapedata.Get((Object)("BodyBuilder"))));
 //BA.debugLineNum = 5444;BA.debugLine="RawBody = sb.ToString";
_rawbody = _sb.ToString();
 }else {
 //BA.debugLineNum = 5446;BA.debugLine="RawBody = ScrapeData.GetDefault(\"Body\", \"\")";
_rawbody = BA.ObjectToString(_scrapedata.GetDefault((Object)("Body"),(Object)("")));
 };
 //BA.debugLineNum = 5450;BA.debugLine="Dim VmDate As String = \"Unknown\"";
_vmdate = "Unknown";
 //BA.debugLineNum = 5451;BA.debugLine="Dim VmTime As String = \"Unknown\"";
_vmtime = "Unknown";
 //BA.debugLineNum = 5452;BA.debugLine="Dim mHeader As Matcher = Regex.Matcher(\"--- \\[(.*";
_mheader = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_mheader = __c.Regex.Matcher("--- \\[(.*?)\\] ---",_rawbody);
 //BA.debugLineNum = 5453;BA.debugLine="If mHeader.Find Then";
if (_mheader.Find()) { 
 //BA.debugLineNum = 5454;BA.debugLine="Dim FullHeader As String = mHeader.Group(1)";
_fullheader = _mheader.Group((int) (1));
 //BA.debugLineNum = 5455;BA.debugLine="Dim LastSpace As Int = FullHeader.LastIndexOf(\"";
_lastspace = _fullheader.lastIndexOf(" ");
 //BA.debugLineNum = 5456;BA.debugLine="If LastSpace > 0 Then";
if (_lastspace>0) { 
 //BA.debugLineNum = 5457;BA.debugLine="VmDate = FullHeader.SubString2(0, LastSpace).Tr";
_vmdate = _fullheader.substring((int) (0),_lastspace).trim();
 //BA.debugLineNum = 5458;BA.debugLine="VmTime = FullHeader.SubString(LastSpace).Trim";
_vmtime = _fullheader.substring(_lastspace).trim();
 }else {
 //BA.debugLineNum = 5460;BA.debugLine="VmDate = FullHeader";
_vmdate = _fullheader;
 };
 //BA.debugLineNum = 5462;BA.debugLine="RawBody = RawBody.Replace(mHeader.Match, \"\").Tri";
_rawbody = _rawbody.replace(_mheader.getMatch(),"").trim();
 };
 //BA.debugLineNum = 5465;BA.debugLine="Dim AudioPath As String = \"\"";
_audiopath = "";
 //BA.debugLineNum = 5466;BA.debugLine="If ScrapeData.ContainsKey(\"FilePath\") Then";
if (_scrapedata.ContainsKey((Object)("FilePath"))) { 
 //BA.debugLineNum = 5467;BA.debugLine="Dim EmlPath As String = ScrapeData.Get(\"FilePath";
_emlpath = BA.ObjectToString(_scrapedata.Get((Object)("FilePath")));
 //BA.debugLineNum = 5468;BA.debugLine="Dim FName As String = EmlPath.SubString(EmlPath.";
_fname = _emlpath.substring((int) (_emlpath.lastIndexOf("/")+1));
 //BA.debugLineNum = 5469;BA.debugLine="Dim AmrName As String = FName.Replace(\".eml\", \".";
_amrname = _fname.replace(".eml",".amr");
 //BA.debugLineNum = 5470;BA.debugLine="AudioPath = File.DirRootExternal & \"/VisualVoice";
_audiopath = __c.File.getDirRootExternal()+"/VisualVoiceMail/"+_amrname;
 };
 //BA.debugLineNum = 5475;BA.debugLine="Dim btnPlay As Button : btnPlay.Initialize(\"btnPl";
_btnplay = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5475;BA.debugLine="Dim btnPlay As Button : btnPlay.Initialize(\"btnPl";
_btnplay.Initialize(ba,"btnPlayVM");
 //BA.debugLineNum = 5476;BA.debugLine="btnPlay.Text = Chr(0xF04B) & \" Play\"";
_btnplay.setText(BA.ObjectToCharSequence(BA.ObjectToString(__c.Chr(((int)0xf04b)))+" Play"));
 //BA.debugLineNum = 5477;BA.debugLine="btnPlay.Typeface = Typeface.FONTAWESOME";
_btnplay.setTypeface(__c.Typeface.getFONTAWESOME());
 //BA.debugLineNum = 5478;BA.debugLine="btnPlay.Color = 0xFF2E7D32";
_btnplay.setColor(((int)0xff2e7d32));
 //BA.debugLineNum = 5479;BA.debugLine="btnPlay.Tag = AudioPath";
_btnplay.setTag((Object)(_audiopath));
 //BA.debugLineNum = 5480;BA.debugLine="pnlLeft.AddView(btnPlay, 0, 0, (pnlLeft.Width / 2";
_pnlleft.AddView((android.view.View)(_btnplay.getObject()),(int) (0),(int) (0),(int) ((_pnlleft.getWidth()/(double)2)-__c.DipToCurrent((int) (5))),__c.DipToCurrent((int) (35)));
 //BA.debugLineNum = 5483;BA.debugLine="Dim btnStop As Button : btnStop.Initialize(\"btnSt";
_btnstop = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5483;BA.debugLine="Dim btnStop As Button : btnStop.Initialize(\"btnSt";
_btnstop.Initialize(ba,"btnStopVM");
 //BA.debugLineNum = 5484;BA.debugLine="btnStop.Text = Chr(0xF04D) & \" Stop\"";
_btnstop.setText(BA.ObjectToCharSequence(BA.ObjectToString(__c.Chr(((int)0xf04d)))+" Stop"));
 //BA.debugLineNum = 5485;BA.debugLine="btnStop.Typeface = Typeface.FONTAWESOME";
_btnstop.setTypeface(__c.Typeface.getFONTAWESOME());
 //BA.debugLineNum = 5486;BA.debugLine="btnStop.Color = 0xFFD32F2F";
_btnstop.setColor(((int)0xffd32f2f));
 //BA.debugLineNum = 5487;BA.debugLine="pnlLeft.AddView(btnStop, (pnlLeft.Width / 2) + 5d";
_pnlleft.AddView((android.view.View)(_btnstop.getObject()),(int) ((_pnlleft.getWidth()/(double)2)+__c.DipToCurrent((int) (5))),(int) (0),(int) ((_pnlleft.getWidth()/(double)2)-__c.DipToCurrent((int) (5))),__c.DipToCurrent((int) (35)));
 //BA.debugLineNum = 5490;BA.debugLine="Dim skbAudio As SeekBar : skbAudio.Initialize(\"sk";
_skbaudio = new anywheresoftware.b4a.objects.SeekBarWrapper();
 //BA.debugLineNum = 5490;BA.debugLine="Dim skbAudio As SeekBar : skbAudio.Initialize(\"sk";
_skbaudio.Initialize(ba,"skbAudio");
 //BA.debugLineNum = 5491;BA.debugLine="skbAudio.Max = 100 ' Percentage based";
_skbaudio.setMax((int) (100));
 //BA.debugLineNum = 5492;BA.debugLine="skbAudio.Value = 0";
_skbaudio.setValue((int) (0));
 //BA.debugLineNum = 5493;BA.debugLine="pnlLeft.AddView(skbAudio, 0, 40dip, pnlLeft.Width";
_pnlleft.AddView((android.view.View)(_skbaudio.getObject()),(int) (0),__c.DipToCurrent((int) (40)),_pnlleft.getWidth(),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 5496;BA.debugLine="Dim lblDate As Label : lblDate.Initialize(\"\")";
_lbldate = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 5496;BA.debugLine="Dim lblDate As Label : lblDate.Initialize(\"\")";
_lbldate.Initialize(ba,"");
 //BA.debugLineNum = 5497;BA.debugLine="lblDate.Text = \"Date: \" & VmDate";
_lbldate.setText(BA.ObjectToCharSequence("Date: "+_vmdate));
 //BA.debugLineNum = 5498;BA.debugLine="lblDate.TextSize = 13";
_lbldate.setTextSize((float) (13));
 //BA.debugLineNum = 5499;BA.debugLine="lblDate.Typeface = Typeface.DEFAULT_BOLD";
_lbldate.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 5500;BA.debugLine="lblDate.TextColor = xui.Color_DarkGray";
_lbldate.setTextColor(_xui.Color_DarkGray);
 //BA.debugLineNum = 5501;BA.debugLine="lblDate.Gravity = Gravity.CENTER_VERTICAL";
_lbldate.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 5502;BA.debugLine="pnlLeft.AddView(lblDate, 5dip, 75dip, pnlLeft.Wid";
_pnlleft.AddView((android.view.View)(_lbldate.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (75)),(int) (_pnlleft.getWidth()-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 5505;BA.debugLine="Dim lblTime As Label : lblTime.Initialize(\"\")";
_lbltime = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 5505;BA.debugLine="Dim lblTime As Label : lblTime.Initialize(\"\")";
_lbltime.Initialize(ba,"");
 //BA.debugLineNum = 5506;BA.debugLine="lblTime.Text = \"Time: \" & VmTime";
_lbltime.setText(BA.ObjectToCharSequence("Time: "+_vmtime));
 //BA.debugLineNum = 5507;BA.debugLine="lblTime.TextSize = 13";
_lbltime.setTextSize((float) (13));
 //BA.debugLineNum = 5508;BA.debugLine="lblTime.Typeface = Typeface.DEFAULT_BOLD";
_lbltime.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 5509;BA.debugLine="lblTime.TextColor = xui.Color_DarkGray";
_lbltime.setTextColor(_xui.Color_DarkGray);
 //BA.debugLineNum = 5510;BA.debugLine="lblTime.Gravity = Gravity.CENTER_VERTICAL";
_lbltime.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 5511;BA.debugLine="pnlLeft.AddView(lblTime, 5dip, 105dip, pnlLeft.Wi";
_pnlleft.AddView((android.view.View)(_lbltime.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (105)),(int) (_pnlleft.getWidth()-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 5514;BA.debugLine="Dim lblDuration As Label : lblDuration.Initialize";
_lblduration = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 5514;BA.debugLine="Dim lblDuration As Label : lblDuration.Initialize";
_lblduration.Initialize(ba,"");
 //BA.debugLineNum = 5515;BA.debugLine="Dim xDuration As B4XView = lblDuration";
_xduration = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xduration = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblduration.getObject()));
 //BA.debugLineNum = 5516;BA.debugLine="xDuration.Tag = \"lblVM_Duration\" ' Tagged for the";
_xduration.setTag((Object)("lblVM_Duration"));
 //BA.debugLineNum = 5517;BA.debugLine="xDuration.Text = \"Duration: 00:00\"";
_xduration.setText(BA.ObjectToCharSequence("Duration: 00:00"));
 //BA.debugLineNum = 5518;BA.debugLine="xDuration.TextSize = 13";
_xduration.setTextSize((float) (13));
 //BA.debugLineNum = 5519;BA.debugLine="lblDuration.Typeface = Typeface.DEFAULT_BOLD";
_lblduration.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 5520;BA.debugLine="xDuration.TextColor = xui.Color_DarkGray";
_xduration.setTextColor(_xui.Color_DarkGray);
 //BA.debugLineNum = 5521;BA.debugLine="lblDuration.Gravity = Gravity.CENTER_VERTICAL";
_lblduration.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 5522;BA.debugLine="pnlLeft.AddView(xDuration, 5dip, 135dip, pnlLeft.";
_pnlleft.AddView((android.view.View)(_xduration.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (135)),(int) (_pnlleft.getWidth()-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 5525;BA.debugLine="Dim txtTrans As EditText : txtTrans.Initialize(\"t";
_txttrans = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 5525;BA.debugLine="Dim txtTrans As EditText : txtTrans.Initialize(\"t";
_txttrans.Initialize(ba,"txtTrans");
 //BA.debugLineNum = 5526;BA.debugLine="txtTrans.Text = RawBody";
_txttrans.setText(BA.ObjectToCharSequence(_rawbody));
 //BA.debugLineNum = 5527;BA.debugLine="txtTrans.TextSize = 14";
_txttrans.setTextSize((float) (14));
 //BA.debugLineNum = 5528;BA.debugLine="txtTrans.TextColor = xui.Color_DarkGray";
_txttrans.setTextColor(_xui.Color_DarkGray);
 //BA.debugLineNum = 5529;BA.debugLine="txtTrans.Color = 0xFFECEFF1 ' Light Grey Bg";
_txttrans.setColor(((int)0xffeceff1));
 //BA.debugLineNum = 5530;BA.debugLine="txtTrans.SingleLine = False";
_txttrans.setSingleLine(__c.False);
 //BA.debugLineNum = 5531;BA.debugLine="txtTrans.Wrap = True";
_txttrans.setWrap(__c.True);
 //BA.debugLineNum = 5532;BA.debugLine="txtTrans.Gravity = Gravity.TOP + Gravity.LEFT";
_txttrans.setGravity((int) (__c.Gravity.TOP+__c.Gravity.LEFT));
 //BA.debugLineNum = 5533;BA.debugLine="pnlLeft.AddView(txtTrans, 0, 165dip, pnlLeft.Widt";
_pnlleft.AddView((android.view.View)(_txttrans.getObject()),(int) (0),__c.DipToCurrent((int) (165)),_pnlleft.getWidth(),(int) (_pnlleft.getHeight()-__c.DipToCurrent((int) (170))));
 //BA.debugLineNum = 5536;BA.debugLine="If File.Exists(\"\", AudioPath) Then";
if (__c.File.Exists("",_audiopath)) { 
 //BA.debugLineNum = 5537;BA.debugLine="VMPlayer.Load(\"\", AudioPath)";
_vmplayer.Load("",_audiopath);
 //BA.debugLineNum = 5538;BA.debugLine="Dim TotalSecs As Int = VMPlayer.Duration / 1000";
_totalsecs = (int) (_vmplayer.getDuration()/(double)1000);
 //BA.debugLineNum = 5539;BA.debugLine="xDuration.Text = \"Duration: \" & FormatAudioTime(";
_xduration.setText(BA.ObjectToCharSequence("Duration: "+_formataudiotime(_totalsecs)));
 //BA.debugLineNum = 5540;BA.debugLine="xDuration.Tag = TotalSecs ' Save total in tag fo";
_xduration.setTag((Object)(_totalsecs));
 };
 //BA.debugLineNum = 5544;BA.debugLine="Dim TopY As Int = 0dip";
_topy = __c.DipToCurrent((int) (0));
 //BA.debugLineNum = 5545;BA.debugLine="Dim FormW As Int = pContent.Width";
_formw = _pcontent.getWidth();
 //BA.debugLineNum = 5547;BA.debugLine="TopY = AddScrapeRow(pContent, TopY, FormW, \"Name";
_topy = _addscraperow(_pcontent,_topy,_formw,"Name #1:",_rawname,"chkName1","txtName1");
 //BA.debugLineNum = 5548;BA.debugLine="TopY = AddScrapeRow(pContent, TopY, FormW, \"Name";
_topy = _addscraperow(_pcontent,_topy,_formw,"Name #2:",_rawname2,"chkName2","txtName2");
 //BA.debugLineNum = 5549;BA.debugLine="TopY = AddScrapeRow(pContent, TopY, FormW, \"Phone";
_topy = _addscraperow(_pcontent,_topy,_formw,"Phone #1:",_rawphone,"chkPhone1","txtPhone1");
 //BA.debugLineNum = 5550;BA.debugLine="TopY = AddScrapeRow(pContent, TopY, FormW, \"Phone";
_topy = _addscraperow(_pcontent,_topy,_formw,"Phone #2:","","chkPhone2","txtPhone2");
 //BA.debugLineNum = 5551;BA.debugLine="TopY = AddScrapeRow(pContent, TopY, FormW, \"Addre";
_topy = _addscraperow(_pcontent,_topy,_formw,"Address:",_rawaddr,"chkAddr","txtAddr");
 //BA.debugLineNum = 5552;BA.debugLine="TopY = AddScrapeRow(pContent, TopY, FormW, \"Issue";
_topy = _addscraperow(_pcontent,_topy,_formw,"Issue:",_rawnotes,"chkIssue","txtIssue");
 //BA.debugLineNum = 5555;BA.debugLine="TopY = TopY + 20dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 5557;BA.debugLine="Dim btnCreate As Button : btnCreate.Initialize(\"b";
_btncreate = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5557;BA.debugLine="Dim btnCreate As Button : btnCreate.Initialize(\"b";
_btncreate.Initialize(ba,"btnScrapeCreate");
 //BA.debugLineNum = 5558;BA.debugLine="btnCreate.Text = \"USE SELECTED DATA TO CREATE CLI";
_btncreate.setText(BA.ObjectToCharSequence("USE SELECTED DATA TO CREATE CLIENT"));
 //BA.debugLineNum = 5559;BA.debugLine="btnCreate.Color = 0xFF2E7D32";
_btncreate.setColor(((int)0xff2e7d32));
 //BA.debugLineNum = 5560;BA.debugLine="btnCreate.Tag = pnlOverlay";
_btncreate.setTag((Object)(_pnloverlay.getObject()));
 //BA.debugLineNum = 5561;BA.debugLine="pContent.AddView(btnCreate, 10dip, TopY, FormW -";
_pcontent.AddView((android.view.View)(_btncreate.getObject()),__c.DipToCurrent((int) (10)),_topy,(int) (_formw-__c.DipToCurrent((int) (20))),__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 5562;BA.debugLine="TopY = TopY + 70dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (70)));
 //BA.debugLineNum = 5564;BA.debugLine="Dim btnDel As Button : btnDel.Initialize(\"btnScra";
_btndel = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5564;BA.debugLine="Dim btnDel As Button : btnDel.Initialize(\"btnScra";
_btndel.Initialize(ba,"btnScrapeDelete");
 //BA.debugLineNum = 5565;BA.debugLine="btnDel.Text = \"SKIP THIS VOICEMAIL & DELETE FOREV";
_btndel.setText(BA.ObjectToCharSequence("SKIP THIS VOICEMAIL & DELETE FOREVER"));
 //BA.debugLineNum = 5566;BA.debugLine="btnDel.Color = 0xFFD32F2F";
_btndel.setColor(((int)0xffd32f2f));
 //BA.debugLineNum = 5567;BA.debugLine="btnDel.Tag = pnlOverlay";
_btndel.setTag((Object)(_pnloverlay.getObject()));
 //BA.debugLineNum = 5568;BA.debugLine="pContent.AddView(btnDel, 10dip, TopY, FormW - 20d";
_pcontent.AddView((android.view.View)(_btndel.getObject()),__c.DipToCurrent((int) (10)),_topy,(int) (_formw-__c.DipToCurrent((int) (20))),__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 5569;BA.debugLine="TopY = TopY + 70dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (70)));
 //BA.debugLineNum = 5571;BA.debugLine="Dim btnArc As Button : btnArc.Initialize(\"btnScra";
_btnarc = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5571;BA.debugLine="Dim btnArc As Button : btnArc.Initialize(\"btnScra";
_btnarc.Initialize(ba,"btnScrapeArchive");
 //BA.debugLineNum = 5572;BA.debugLine="btnArc.Text = \"ARCHIVE VOICEMAIL & TRANSCRIPT\"";
_btnarc.setText(BA.ObjectToCharSequence("ARCHIVE VOICEMAIL & TRANSCRIPT"));
 //BA.debugLineNum = 5573;BA.debugLine="btnArc.Color = 0xFF1976D2";
_btnarc.setColor(((int)0xff1976d2));
 //BA.debugLineNum = 5574;BA.debugLine="btnArc.Tag = pnlOverlay";
_btnarc.setTag((Object)(_pnloverlay.getObject()));
 //BA.debugLineNum = 5575;BA.debugLine="pContent.AddView(btnArc, 10dip, TopY, FormW - 20d";
_pcontent.AddView((android.view.View)(_btnarc.getObject()),__c.DipToCurrent((int) (10)),_topy,(int) (_formw-__c.DipToCurrent((int) (20))),__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 5576;BA.debugLine="TopY = TopY + 80dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (80)));
 //BA.debugLineNum = 5578;BA.debugLine="pContent.Height = TopY";
_pcontent.setHeight(_topy);
 //BA.debugLineNum = 5579;BA.debugLine="End Sub";
return "";
}
public void  _showuserselection() throws Exception{
ResumableSub_ShowUserSelection rsub = new ResumableSub_ShowUserSelection(this);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowUserSelection extends BA.ResumableSub {
public ResumableSub_ShowUserSelection(Geek.God.CRM.App.b4xmainpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.List _options = null;
int _index = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 4275;BA.debugLine="Dim Options As List : Options.Initialize";
_options = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4275;BA.debugLine="Dim Options As List : Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 4276;BA.debugLine="Options.Add(\"Mike\")";
_options.Add((Object)("Mike"));
 //BA.debugLineNum = 4277;BA.debugLine="Options.Add(\"Erin\")";
_options.Add((Object)("Erin"));
 //BA.debugLineNum = 4279;BA.debugLine="InputListAsync(Options, \"Select User\", 0, True)";
parent.__c.InputListAsync(_options,BA.ObjectToCharSequence("Select User"),(int) (0),ba,parent.__c.True);
 //BA.debugLineNum = 4280;BA.debugLine="Wait For InputList_Result (Index As Int)";
parent.__c.WaitFor("inputlist_result", ba, this, null);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_index = (Integer) result[0];
;
 //BA.debugLineNum = 4281;BA.debugLine="If Index <> -3 Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_index!=-3) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 4282;BA.debugLine="spnChose.SelectedIndex = Index";
parent._spnchose.setSelectedIndex(_index);
 //BA.debugLineNum = 4283;BA.debugLine="If appSettings.IsInitialized Then";
if (true) break;

case 4:
//if
this.state = 7;
if (parent._appsettings.IsInitialized()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 4284;BA.debugLine="appSettings.Put(\"CurrentUser\", Options.Get(Inde";
parent._appsettings.Put((Object)("CurrentUser"),_options.Get(_index));
 //BA.debugLineNum = 4285;BA.debugLine="File.WriteMap(File.DirInternal, \"settings.map\",";
parent.__c.File.WriteMap(parent.__c.File.getDirInternal(),"settings.map",parent._appsettings);
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 4287;BA.debugLine="RefreshDashboard";
parent._refreshdashboard();
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 4289;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _skbaudio_valuechanged(int _value,boolean _userchanged) throws Exception{
int _totalms = 0;
int _newpos = 0;
anywheresoftware.b4a.objects.SeekBarWrapper _skb = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnlleft = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xdurlabel = null;
int _totalsecs = 0;
int _currentsecs = 0;
int _remainingsecs = 0;
 //BA.debugLineNum = 5582;BA.debugLine="Sub skbAudio_ValueChanged (Value As Int, UserChang";
 //BA.debugLineNum = 5584;BA.debugLine="If UserChanged And VMPlayer.IsInitialized Then";
if (_userchanged && _vmplayer.IsInitialized()) { 
 //BA.debugLineNum = 5585;BA.debugLine="Dim TotalMs As Int = VMPlayer.Duration";
_totalms = _vmplayer.getDuration();
 //BA.debugLineNum = 5586;BA.debugLine="If TotalMs > 0 Then";
if (_totalms>0) { 
 //BA.debugLineNum = 5588;BA.debugLine="Dim NewPos As Int = (Value / 100.0) * TotalMs";
_newpos = (int) ((_value/(double)100.0)*_totalms);
 //BA.debugLineNum = 5589;BA.debugLine="VMPlayer.Position = NewPos";
_vmplayer.setPosition(_newpos);
 //BA.debugLineNum = 5592;BA.debugLine="Dim skb As SeekBar = Sender";
_skb = new anywheresoftware.b4a.objects.SeekBarWrapper();
_skb = (anywheresoftware.b4a.objects.SeekBarWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SeekBarWrapper(), (android.widget.SeekBar)(__c.Sender(ba)));
 //BA.debugLineNum = 5593;BA.debugLine="Dim pnlLeft As B4XView = skb.Parent";
_pnlleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlleft = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_skb.getParent()));
 //BA.debugLineNum = 5594;BA.debugLine="Dim xDurLabel As B4XView = pnlLeft.GetView(5)";
_xdurlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xdurlabel = _pnlleft.GetView((int) (5));
 //BA.debugLineNum = 5596;BA.debugLine="Dim TotalSecs As Int = TotalMs / 1000";
_totalsecs = (int) (_totalms/(double)1000);
 //BA.debugLineNum = 5597;BA.debugLine="Dim CurrentSecs As Int = NewPos / 1000";
_currentsecs = (int) (_newpos/(double)1000);
 //BA.debugLineNum = 5598;BA.debugLine="Dim RemainingSecs As Int = TotalSecs - CurrentS";
_remainingsecs = (int) (_totalsecs-_currentsecs);
 //BA.debugLineNum = 5599;BA.debugLine="If RemainingSecs < 0 Then RemainingSecs = 0";
if (_remainingsecs<0) { 
_remainingsecs = (int) (0);};
 //BA.debugLineNum = 5600;BA.debugLine="xDurLabel.Text = \"Duration: \" & FormatAudioTime";
_xdurlabel.setText(BA.ObjectToCharSequence("Duration: "+_formataudiotime(_remainingsecs)));
 };
 };
 //BA.debugLineNum = 5603;BA.debugLine="End Sub";
return "";
}
public String  _spnchose_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 4435;BA.debugLine="Sub spnChose_ItemClick (Index As Int, Value As Obj";
 //BA.debugLineNum = 4436;BA.debugLine="If appSettings.IsInitialized Then";
if (_appsettings.IsInitialized()) { 
 //BA.debugLineNum = 4437;BA.debugLine="appSettings.Put(\"CurrentUser\", Value)";
_appsettings.Put((Object)("CurrentUser"),_value);
 //BA.debugLineNum = 4438;BA.debugLine="File.WriteMap(File.DirInternal, \"settings.map\",";
__c.File.WriteMap(__c.File.getDirInternal(),"settings.map",_appsettings);
 };
 //BA.debugLineNum = 4440;BA.debugLine="RefreshDashboard";
_refreshdashboard();
 //BA.debugLineNum = 4441;BA.debugLine="End Sub";
return "";
}
public String  _startactivityforresult(anywheresoftware.b4a.objects.IntentWrapper _i) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 2909;BA.debugLine="Sub StartActivityForResult(i As Intent)";
 //BA.debugLineNum = 2910;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 2911;BA.debugLine="jo.RunMethod(\"StartActivityForResult\", Array(i))";
_jo.RunMethod("StartActivityForResult",new Object[]{(Object)(_i.getObject())});
 //BA.debugLineNum = 2912;BA.debugLine="End Sub";
return "";
}
public String  _startfoldlistener() throws Exception{
anywheresoftware.b4j.object.JavaObject _jome = null;
Object _myba = null;
anywheresoftware.b4j.object.JavaObject _joy = null;
 //BA.debugLineNum = 879;BA.debugLine="Public Sub StartFoldListener";
 //BA.debugLineNum = 880;BA.debugLine="Try";
try { //BA.debugLineNum = 881;BA.debugLine="If FoldDetector.IsInitialized = False Then";
if (_folddetector.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 883;BA.debugLine="FoldDetector.InitializeNewInstance(Application.";
_folddetector.InitializeNewInstance(__c.Application.getPackageName()+".b4xmainpage$FoldableListener",(Object[])(__c.Null));
 };
 //BA.debugLineNum = 887;BA.debugLine="Dim joMe As JavaObject = Me";
_jome = new anywheresoftware.b4j.object.JavaObject();
_jome = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 888;BA.debugLine="Dim myBA As Object = joMe.RunMethod(\"getBA\", Nul";
_myba = _jome.RunMethod("getBA",(Object[])(__c.Null));
 //BA.debugLineNum = 891;BA.debugLine="Dim joy As JavaObject = FoldDetector";
_joy = new anywheresoftware.b4j.object.JavaObject();
_joy = _folddetector;
 //BA.debugLineNum = 892;BA.debugLine="joy.RunMethod(\"start\", Array(myBA, Root))";
_joy.RunMethod("start",new Object[]{_myba,(Object)(_root.getObject())});
 //BA.debugLineNum = 894;BA.debugLine="Log(\">>> [FOLD-ENGINE] Listener Started.\")";
__c.LogImpl("012779535",">>> [FOLD-ENGINE] Listener Started.",0);
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 896;BA.debugLine="Log(\">>> [FOLD-ENGINE] Error Starting Listener:";
__c.LogImpl("012779537",">>> [FOLD-ENGINE] Error Starting Listener: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 898;BA.debugLine="End Sub";
return "";
}
public String  _startgestures() throws Exception{
 //BA.debugLineNum = 6270;BA.debugLine="Public Sub StartGestures";
 //BA.debugLineNum = 6271;BA.debugLine="Try";
try { //BA.debugLineNum = 6272;BA.debugLine="SensorShake.StartListening(\"GestureShake\")";
_sensorshake.StartListening(ba,"GestureShake");
 //BA.debugLineNum = 6273;BA.debugLine="Log(\">>> [GESTURE] Listening for Chop...\")";
__c.LogImpl("021954563",">>> [GESTURE] Listening for Chop...",0);
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 6275;BA.debugLine="Log(\">>> [GESTURE] Error starting sensor: \" & La";
__c.LogImpl("021954565",">>> [GESTURE] Error starting sensor: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 6277;BA.debugLine="End Sub";
return "";
}
public String  _startledgerqueue(String _name) throws Exception{
Geek.God.CRM.App.httpjob _job = null;
String _q = "";
anywheresoftware.b4a.objects.StringUtils _su = null;
 //BA.debugLineNum = 3772;BA.debugLine="Public Sub StartLedgerQueue(Name As String)";
 //BA.debugLineNum = 3773;BA.debugLine="LedgerQueue.Initialize";
_ledgerqueue.Initialize();
 //BA.debugLineNum = 3774;BA.debugLine="IssuesHistory.Initialize";
_issueshistory.Initialize();
 //BA.debugLineNum = 3775;BA.debugLine="TempProfile.Put(\"RawTotalSpend\", 0.0)";
_tempprofile.Put((Object)("RawTotalSpend"),(Object)(0.0));
 //BA.debugLineNum = 3776;BA.debugLine="TempProfile.Put(\"RawVisitCount\", 0)";
_tempprofile.Put((Object)("RawVisitCount"),(Object)(0));
 //BA.debugLineNum = 3777;BA.debugLine="TempProfile.Put(\"LastVisit\", \"New Client\")";
_tempprofile.Put((Object)("LastVisit"),(Object)("New Client"));
 //BA.debugLineNum = 3779;BA.debugLine="Log(\">>> [LEDGER-DEBUG] StartLedgerQueue: Searchi";
__c.LogImpl("016973831",">>> [LEDGER-DEBUG] StartLedgerQueue: Searching for 'Geek God Ledger' in Drive...",0);
 //BA.debugLineNum = 3781;BA.debugLine="Dim job As HttpJob : job.Initialize(\"SearchLedger";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 3781;BA.debugLine="Dim job As HttpJob : job.Initialize(\"SearchLedger";
_job._initialize /*String*/ (ba,"SearchLedgerFiles",this);
 //BA.debugLineNum = 3782;BA.debugLine="Dim q As String = \"name contains 'Geek God Ledger";
_q = "name contains 'Geek God Ledger' and trashed = false";
 //BA.debugLineNum = 3783;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 3784;BA.debugLine="job.Download(\"https://www.googleapis.com/drive/v3";
_job._download /*String*/ ("https://www.googleapis.com/drive/v3/files?q="+_su.EncodeUrl(_q,"UTF8"));
 //BA.debugLineNum = 3785;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 3786;BA.debugLine="End Sub";
return "";
}
public void  _startscrapeprocess() throws Exception{
ResumableSub_StartScrapeProcess rsub = new ResumableSub_StartScrapeProcess(this);
rsub.resume(ba, null);
}
public static class ResumableSub_StartScrapeProcess extends BA.ResumableSub {
public ResumableSub_StartScrapeProcess(Geek.God.CRM.App.b4xmainpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.b4xmainpage parent;
int _mresult = 0;
String _vmroot = "";
anywheresoftware.b4a.objects.collections.List _files = null;
String _fname = "";
String _phonekey = "";
anywheresoftware.b4a.BA.IterableList group35;
int index35;
int groupLen35;
anywheresoftware.b4a.BA.IterableList group40;
int index40;
int groupLen40;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2333;BA.debugLine="Log(\">>> [SCRAPER DEBUG] StartScrapeProcess Initi";
parent.__c.LogImpl("014221313",">>> [SCRAPER DEBUG] StartScrapeProcess Initiated.",0);
 //BA.debugLineNum = 2335;BA.debugLine="If HasAllFilesAccess = False Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent._hasallfilesaccess()==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 2336;BA.debugLine="Log(\"DEBUG: All Files Access NOT granted. Prompt";
parent.__c.LogImpl("014221316","DEBUG: All Files Access NOT granted. Prompting user.",0);
 //BA.debugLineNum = 2337;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 2338;BA.debugLine="Msgbox2Async(\"To read voicemail files in the .da";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("To read voicemail files in the .data folder, this app needs 'All Files Access'."),BA.ObjectToCharSequence("Permission Required"),"Grant Access","Cancel","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
 //BA.debugLineNum = 2340;BA.debugLine="Wait For Msgbox_Result (MResult As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 38;
return;
case 38:
//C
this.state = 4;
_mresult = (Integer) result[0];
;
 //BA.debugLineNum = 2341;BA.debugLine="If MResult = DialogResponse.POSITIVE Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_mresult==parent.__c.DialogResponse.POSITIVE) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 2342;BA.debugLine="RequestManageExternalStorage";
parent._requestmanageexternalstorage();
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 2344;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 2347;BA.debugLine="Dim VMRoot As String = File.DirRootExternal & \"/V";
_vmroot = parent.__c.File.getDirRootExternal()+"/VisualVoiceMail/.data";
 //BA.debugLineNum = 2348;BA.debugLine="Log(\">>> [SCRAPER DEBUG] Checking Path: \" & VMRoo";
parent.__c.LogImpl("014221328",">>> [SCRAPER DEBUG] Checking Path: "+_vmroot,0);
 //BA.debugLineNum = 2350;BA.debugLine="If File.Exists(VMRoot, \"\") = False Then";
if (true) break;

case 9:
//if
this.state = 12;
if (parent.__c.File.Exists(_vmroot,"")==parent.__c.False) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 2351;BA.debugLine="Log(\"DEBUG: Folder not found despite permissions";
parent.__c.LogImpl("014221331","DEBUG: Folder not found despite permissions.",0);
 //BA.debugLineNum = 2352;BA.debugLine="xui.MsgboxAsync(\"VisualVoiceMail folder not foun";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("VisualVoiceMail folder not found at: "+parent.__c.CRLF+_vmroot),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 2353;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 2357;BA.debugLine="ScrapeMap.Initialize";
parent._scrapemap.Initialize();
 //BA.debugLineNum = 2358;BA.debugLine="ScrapeQueue.Initialize";
parent._scrapequeue.Initialize();
 //BA.debugLineNum = 2359;BA.debugLine="Log(\">>> [SCRAPER DEBUG] Queue memory cleared suc";
parent.__c.LogImpl("014221339",">>> [SCRAPER DEBUG] Queue memory cleared successfully.",0);
 //BA.debugLineNum = 2361;BA.debugLine="Dim Files As List = File.ListFiles(VMRoot)";
_files = new anywheresoftware.b4a.objects.collections.List();
_files = parent.__c.File.ListFiles(_vmroot);
 //BA.debugLineNum = 2363;BA.debugLine="If Files.IsInitialized = False Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_files.IsInitialized()==parent.__c.False) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 2364;BA.debugLine="Log(\"DEBUG: File.ListFiles returned Null.\")";
parent.__c.LogImpl("014221344","DEBUG: File.ListFiles returned Null.",0);
 //BA.debugLineNum = 2365;BA.debugLine="xui.MsgboxAsync(\"Error: Could not list files. Th";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error: Could not list files. The folder might be empty or protected."),BA.ObjectToCharSequence("Error"));
 //BA.debugLineNum = 2366;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 2369;BA.debugLine="Log(\">>> [SCRAPER DEBUG] Found \" & Files.Size & \"";
parent.__c.LogImpl("014221349",">>> [SCRAPER DEBUG] Found "+BA.NumberToString(_files.getSize())+" total files in folder.",0);
 //BA.debugLineNum = 2371;BA.debugLine="If Files.Size = 0 Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_files.getSize()==0) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 2372;BA.debugLine="xui.MsgboxAsync(\"Folder exists but is empty.\", \"";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Folder exists but is empty."),BA.ObjectToCharSequence("No Voicemails"));
 //BA.debugLineNum = 2373;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 20:
//C
this.state = 21;
;
 //BA.debugLineNum = 2376;BA.debugLine="ProgressDialogShow(\"Parsing \" & Files.Size & \" vo";
parent.__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Parsing "+BA.NumberToString(_files.getSize())+" voicemails..."));
 //BA.debugLineNum = 2377;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,this,(int) (100));
this.state = 39;
return;
case 39:
//C
this.state = 21;
;
 //BA.debugLineNum = 2379;BA.debugLine="For Each FName As String In Files";
if (true) break;

case 21:
//for
this.state = 28;
group35 = _files;
index35 = 0;
groupLen35 = group35.getSize();
this.state = 40;
if (true) break;

case 40:
//C
this.state = 28;
if (index35 < groupLen35) {
this.state = 23;
_fname = BA.ObjectToString(group35.Get(index35));}
if (true) break;

case 41:
//C
this.state = 40;
index35++;
if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 2380;BA.debugLine="If FName.EndsWith(\".eml\") Then";
if (true) break;

case 24:
//if
this.state = 27;
if (_fname.endsWith(".eml")) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 2381;BA.debugLine="ParseEmlFile(VMRoot, FName)";
parent._parseemlfile(_vmroot,_fname);
 if (true) break;

case 27:
//C
this.state = 41;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 2385;BA.debugLine="For Each PhoneKey As String In ScrapeMap.Keys";

case 28:
//for
this.state = 31;
group40 = parent._scrapemap.Keys();
index40 = 0;
groupLen40 = group40.getSize();
this.state = 42;
if (true) break;

case 42:
//C
this.state = 31;
if (index40 < groupLen40) {
this.state = 30;
_phonekey = BA.ObjectToString(group40.Get(index40));}
if (true) break;

case 43:
//C
this.state = 42;
index40++;
if (true) break;

case 30:
//C
this.state = 43;
 //BA.debugLineNum = 2386;BA.debugLine="ScrapeQueue.Add(ScrapeMap.Get(PhoneKey))";
parent._scrapequeue.Add(parent._scrapemap.Get((Object)(_phonekey)));
 if (true) break;
if (true) break;

case 31:
//C
this.state = 32;
;
 //BA.debugLineNum = 2389;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 2390;BA.debugLine="Log(\">>> [SCRAPER DEBUG] Final Queue Size: \" & Sc";
parent.__c.LogImpl("014221370",">>> [SCRAPER DEBUG] Final Queue Size: "+BA.NumberToString(parent._scrapequeue.getSize()),0);
 //BA.debugLineNum = 2392;BA.debugLine="If ScrapeQueue.Size > 0 Then";
if (true) break;

case 32:
//if
this.state = 37;
if (parent._scrapequeue.getSize()>0) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 37;
 //BA.debugLineNum = 2393;BA.debugLine="xui.MsgboxAsync(\"Found \" & ScrapeQueue.Size & \"";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Found "+BA.NumberToString(parent._scrapequeue.getSize())+" unique callers."),BA.ObjectToCharSequence("Success"));
 //BA.debugLineNum = 2394;BA.debugLine="ProcessNextScrapeItem";
parent._processnextscrapeitem();
 if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 2396;BA.debugLine="xui.MsgboxAsync(\"No .eml files found in folder.\"";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("No .eml files found in folder."),BA.ObjectToCharSequence("Done"));
 if (true) break;

case 37:
//C
this.state = -1;
;
 //BA.debugLineNum = 2398;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _statusrefreshtimer_tick() throws Exception{
 //BA.debugLineNum = 795;BA.debugLine="Sub StatusRefreshTimer_Tick";
 //BA.debugLineNum = 796;BA.debugLine="lblStatus.As(View).Invalidate";
((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lblstatus.getObject()))).Invalidate();
 //BA.debugLineNum = 797;BA.debugLine="End Sub";
return "";
}
public String  _stopfoldlistener() throws Exception{
anywheresoftware.b4j.object.JavaObject _joy = null;
 //BA.debugLineNum = 900;BA.debugLine="Public Sub StopFoldListener";
 //BA.debugLineNum = 901;BA.debugLine="Try";
try { //BA.debugLineNum = 902;BA.debugLine="If FoldDetector.IsInitialized Then";
if (_folddetector.IsInitialized()) { 
 //BA.debugLineNum = 903;BA.debugLine="Dim joy As JavaObject = FoldDetector";
_joy = new anywheresoftware.b4j.object.JavaObject();
_joy = _folddetector;
 //BA.debugLineNum = 904;BA.debugLine="joy.RunMethod(\"stop\", Null)";
_joy.RunMethod("stop",(Object[])(__c.Null));
 //BA.debugLineNum = 905;BA.debugLine="Log(\">>> [FOLD-ENGINE] Listener Stopped.\")";
__c.LogImpl("012845061",">>> [FOLD-ENGINE] Listener Stopped.",0);
 };
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 908;BA.debugLine="Log(\">>> [FOLD-ENGINE] Error Stopping Listener:";
__c.LogImpl("012845064",">>> [FOLD-ENGINE] Error Stopping Listener: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 910;BA.debugLine="End Sub";
return "";
}
public String  _stopgestures() throws Exception{
 //BA.debugLineNum = 6279;BA.debugLine="Public Sub StopGestures";
 //BA.debugLineNum = 6280;BA.debugLine="SensorShake.StopListening";
_sensorshake.StopListening(ba);
 //BA.debugLineNum = 6281;BA.debugLine="Log(\">>> [GESTURE] Sensor Stopped.\")";
__c.LogImpl("022020098",">>> [GESTURE] Sensor Stopped.",0);
 //BA.debugLineNum = 6282;BA.debugLine="End Sub";
return "";
}
public String  _submitcloseout(anywheresoftware.b4a.objects.collections.List _container) throws Exception{
 //BA.debugLineNum = 3214;BA.debugLine="Public Sub SubmitCloseOut(Container As List)";
 //BA.debugLineNum = 3216;BA.debugLine="JobTimer.Enabled = False";
_jobtimer.setEnabled(__c.False);
 //BA.debugLineNum = 3218;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 //BA.debugLineNum = 3219;BA.debugLine="ProgressDialogShow(\"Processing Close Out... Pleas";
__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Processing Close Out... Please Wait."));
 //BA.debugLineNum = 3222;BA.debugLine="ActiveAppointmentID = \"\"";
_activeappointmentid = "";
 //BA.debugLineNum = 3223;BA.debugLine="ActiveJobMap.Clear";
_activejobmap.Clear();
 //BA.debugLineNum = 3224;BA.debugLine="btnCloseout.Text = \"Job Closed\"";
_btncloseout.setText(BA.ObjectToCharSequence("Job Closed"));
 //BA.debugLineNum = 3225;BA.debugLine="btnCloseout.Color = xui.Color_Gray";
_btncloseout.setColor(_xui.Color_Gray);
 //BA.debugLineNum = 3226;BA.debugLine="btnCloseout.Enabled = False";
_btncloseout.setEnabled(__c.False);
 //BA.debugLineNum = 3229;BA.debugLine="CloseOut_Helper_Step1(Container)";
_closeout_helper_step1(_container);
 //BA.debugLineNum = 3230;BA.debugLine="End Sub";
return "";
}
public String  _takeexpensephoto() throws Exception{
anywheresoftware.b4a.objects.IntentWrapper _i = null;
 //BA.debugLineNum = 2898;BA.debugLine="Private Sub TakeExpensePhoto";
 //BA.debugLineNum = 2899;BA.debugLine="ExpensePhotoPath = \"\"";
_expensephotopath = "";
 //BA.debugLineNum = 2900;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 2901;BA.debugLine="i.Initialize(\"android.media.action.IMAGE_CAPTURE\"";
_i.Initialize("android.media.action.IMAGE_CAPTURE","");
 //BA.debugLineNum = 2903;BA.debugLine="ExpensePhotoPath = File.Combine(File.DirInternal,";
_expensephotopath = __c.File.Combine(__c.File.getDirInternal(),"expense_temp.jpg");
 //BA.debugLineNum = 2906;BA.debugLine="StartActivityForResult(i)";
_startactivityforresult(_i);
 //BA.debugLineNum = 2907;BA.debugLine="End Sub";
return "";
}
public String  _themeholiday(String _text,int _bgcolor,int _txtcolor) throws Exception{
 //BA.debugLineNum = 789;BA.debugLine="Private Sub ThemeHoliday(Text As String, BgColor A";
 //BA.debugLineNum = 790;BA.debugLine="HolidayBanner.Put(\"Text\", Text)";
_holidaybanner.Put((Object)("Text"),(Object)(_text));
 //BA.debugLineNum = 791;BA.debugLine="HolidayBanner.Put(\"BgColor\", BgColor)";
_holidaybanner.Put((Object)("BgColor"),(Object)(_bgcolor));
 //BA.debugLineNum = 792;BA.debugLine="HolidayBanner.Put(\"TxtColor\", TxtColor)";
_holidaybanner.Put((Object)("TxtColor"),(Object)(_txtcolor));
 //BA.debugLineNum = 793;BA.debugLine="End Sub";
return "";
}
public String  _toggleflashlight() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 6318;BA.debugLine="Private Sub ToggleFlashlight";
 //BA.debugLineNum = 6319;BA.debugLine="Try";
try { //BA.debugLineNum = 6320;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 6321;BA.debugLine="IsTorchOn = Not(IsTorchOn)";
_istorchon = __c.Not(_istorchon);
 //BA.debugLineNum = 6323;BA.debugLine="If IsTorchOn Then";
if (_istorchon) { 
 //BA.debugLineNum = 6324;BA.debugLine="Log(\">>> [GESTURE] Requesting Torch: ON\")";
__c.LogImpl("022151174",">>> [GESTURE] Requesting Torch: ON",0);
 //BA.debugLineNum = 6325;BA.debugLine="jo.RunMethod(\"setTorchMode\", Array(True))";
_jo.RunMethod("setTorchMode",new Object[]{(Object)(__c.True)});
 //BA.debugLineNum = 6326;BA.debugLine="ToastMessageShow(\"🔦 ON\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("🔦 ON"),__c.False);
 }else {
 //BA.debugLineNum = 6328;BA.debugLine="Log(\">>> [GESTURE] Requesting Torch: OFF\")";
__c.LogImpl("022151178",">>> [GESTURE] Requesting Torch: OFF",0);
 //BA.debugLineNum = 6329;BA.debugLine="jo.RunMethod(\"setTorchMode\", Array(False))";
_jo.RunMethod("setTorchMode",new Object[]{(Object)(__c.False)});
 //BA.debugLineNum = 6330;BA.debugLine="ToastMessageShow(\"🔦 OFF\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("🔦 OFF"),__c.False);
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14); //BA.debugLineNum = 6333;BA.debugLine="Log(\">>> [GESTURE] B4A ToggleFlashlight Error: \"";
__c.LogImpl("022151183",">>> [GESTURE] B4A ToggleFlashlight Error: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 6335;BA.debugLine="End Sub";
return "";
}
public String  _togglesound() throws Exception{
 //BA.debugLineNum = 2881;BA.debugLine="Private Sub ToggleSound";
 //BA.debugLineNum = 2883;BA.debugLine="If appSettings.GetDefault(\"SoundOn\", \"True\") = \"T";
if ((_appsettings.GetDefault((Object)("SoundOn"),(Object)("True"))).equals((Object)("True"))) { 
 //BA.debugLineNum = 2884;BA.debugLine="appSettings.Put(\"SoundOn\", \"False\")";
_appsettings.Put((Object)("SoundOn"),(Object)("False"));
 //BA.debugLineNum = 2885;BA.debugLine="ToastMessageShow(\"Sound Effects: OFF\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Sound Effects: OFF"),__c.False);
 }else {
 //BA.debugLineNum = 2887;BA.debugLine="appSettings.Put(\"SoundOn\", \"True\")";
_appsettings.Put((Object)("SoundOn"),(Object)("True"));
 //BA.debugLineNum = 2888;BA.debugLine="ToastMessageShow(\"Sound Effects: ON\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Sound Effects: ON"),__c.False);
 };
 //BA.debugLineNum = 2890;BA.debugLine="File.WriteMap(File.DirInternal, \"settings.map\", a";
__c.File.WriteMap(__c.File.getDirInternal(),"settings.map",_appsettings);
 //BA.debugLineNum = 2891;BA.debugLine="End Sub";
return "";
}
public String  _txttrans_longclick() throws Exception{
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 5658;BA.debugLine="Sub txtTrans_LongClick";
 //BA.debugLineNum = 5659;BA.debugLine="Dim et As EditText = Sender";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__c.Sender(ba)));
 //BA.debugLineNum = 5660;BA.debugLine="If et.Text <> \"\" Then";
if ((_et.getText()).equals("") == false) { 
 //BA.debugLineNum = 5661;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 5662;BA.debugLine="jo.RunMethod(\"setClipboardText\", Array(et.Text))";
_jo.RunMethod("setClipboardText",new Object[]{(Object)(_et.getText())});
 //BA.debugLineNum = 5663;BA.debugLine="ToastMessageShow(\"Transcript copied to clipboard";
__c.ToastMessageShow(BA.ObjectToCharSequence("Transcript copied to clipboard!"),__c.False);
 };
 //BA.debugLineNum = 5665;BA.debugLine="End Sub";
return "";
}
public String  _updatearrivalbuttonsstate() throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _j = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
anywheresoftware.b4a.objects.collections.Map _datamap = null;
String _apptid = "";
String _addr = "";
anywheresoftware.b4a.gps.LocationWrapper _dest = null;
 //BA.debugLineNum = 5121;BA.debugLine="Private Sub UpdateArrivalButtonsState";
 //BA.debugLineNum = 5122;BA.debugLine="If lstTodayApts.IsInitialized = False Or CurrentL";
if (_lsttodayapts.IsInitialized()==__c.False || _currentlocation.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 5123;BA.debugLine="For i = 0 To lstTodayApts.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_lsttodayapts._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 5124;BA.debugLine="Dim p As B4XView = lstTodayApts.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _lsttodayapts._getpanel(_i);
 //BA.debugLineNum = 5125;BA.debugLine="For j = 0 To p.NumberOfViews - 1";
{
final int step4 = 1;
final int limit4 = (int) (_p.getNumberOfViews()-1);
_j = (int) (0) ;
for (;_j <= limit4 ;_j = _j + step4 ) {
 //BA.debugLineNum = 5126;BA.debugLine="Dim v As B4XView = p.GetView(j)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _p.GetView(_j);
 //BA.debugLineNum = 5127;BA.debugLine="If v.Tag Is Map Then";
if (_v.getTag() instanceof java.util.Map) { 
 //BA.debugLineNum = 5128;BA.debugLine="Dim DataMap As Map = v.Tag";
_datamap = new anywheresoftware.b4a.objects.collections.Map();
_datamap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_v.getTag()));
 //BA.debugLineNum = 5129;BA.debugLine="If DataMap.ContainsKey(\"ID\") And DataMap.Conta";
if (_datamap.ContainsKey((Object)("ID")) && _datamap.ContainsKey((Object)("Addr"))) { 
 //BA.debugLineNum = 5130;BA.debugLine="Dim ApptID As String = DataMap.Get(\"ID\")";
_apptid = BA.ObjectToString(_datamap.Get((Object)("ID")));
 //BA.debugLineNum = 5131;BA.debugLine="Dim Addr As String = DataMap.Get(\"Addr\")";
_addr = BA.ObjectToString(_datamap.Get((Object)("Addr")));
 //BA.debugLineNum = 5132;BA.debugLine="If ApptID = ActiveAppointmentID Then Continue";
if ((_apptid).equals(_activeappointmentid)) { 
if (true) continue;};
 //BA.debugLineNum = 5133;BA.debugLine="If GeocodedLocations.ContainsKey(Addr) Then";
if (_geocodedlocations.ContainsKey((Object)(_addr))) { 
 //BA.debugLineNum = 5134;BA.debugLine="Dim Dest As Location = GeocodedLocations.Get";
_dest = new anywheresoftware.b4a.gps.LocationWrapper();
_dest = (anywheresoftware.b4a.gps.LocationWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.gps.LocationWrapper(), (android.location.Location)(_geocodedlocations.Get((Object)(_addr))));
 //BA.debugLineNum = 5135;BA.debugLine="If CurrentLocation.DistanceTo(Dest) <= Arriv";
if (_currentlocation.DistanceTo((android.location.Location)(_dest.getObject()))<=_arrivalthresholdmeters) { 
 //BA.debugLineNum = 5136;BA.debugLine="v.TextColor = 0xFF2E7D32 : v.Enabled = True";
_v.setTextColor(((int)0xff2e7d32));
 //BA.debugLineNum = 5136;BA.debugLine="v.TextColor = 0xFF2E7D32 : v.Enabled = True";
_v.setEnabled(__c.True);
 };
 }else {
 //BA.debugLineNum = 5139;BA.debugLine="GeocodeAddress(Addr)";
_geocodeaddress(_addr);
 };
 //BA.debugLineNum = 5141;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
 }
};
 //BA.debugLineNum = 5146;BA.debugLine="End Sub";
return "";
}
public String  _updatecontact(anywheresoftware.b4a.objects.collections.Map _profile) throws Exception{
String _resourcename = "";
String _etag = "";
String _newnotes = "";
boolean _isblacklisted = false;
boolean _ispreferred = false;
String _newlabel = "";
anywheresoftware.b4a.objects.collections.List _memberships = null;
String _targetgroupid = "";
anywheresoftware.b4a.objects.collections.Map _personmap = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 4618;BA.debugLine="Public Sub UpdateContact(Profile As Map)";
 //BA.debugLineNum = 4619;BA.debugLine="Dim ResourceName As String = Profile.Get(\"Resourc";
_resourcename = BA.ObjectToString(_profile.Get((Object)("ResourceName")));
 //BA.debugLineNum = 4620;BA.debugLine="Dim Etag As String = Profile.Get(\"Etag\")";
_etag = BA.ObjectToString(_profile.Get((Object)("Etag")));
 //BA.debugLineNum = 4621;BA.debugLine="Dim NewNotes As String = Profile.Get(\"Notes\")";
_newnotes = BA.ObjectToString(_profile.Get((Object)("Notes")));
 //BA.debugLineNum = 4622;BA.debugLine="Dim IsBlacklisted As Boolean = Profile.Get(\"IsBla";
_isblacklisted = BA.ObjectToBoolean(_profile.Get((Object)("IsBlacklisted")));
 //BA.debugLineNum = 4623;BA.debugLine="Dim IsPreferred As Boolean = Profile.Get(\"IsPrefe";
_ispreferred = BA.ObjectToBoolean(_profile.Get((Object)("IsPreferred")));
 //BA.debugLineNum = 4625;BA.debugLine="Dim NewLabel As String = \"Client\"";
_newlabel = "Client";
 //BA.debugLineNum = 4626;BA.debugLine="If IsBlacklisted Then NewLabel = \"Blacklisted Cli";
if (_isblacklisted) { 
_newlabel = "Blacklisted Client";};
 //BA.debugLineNum = 4627;BA.debugLine="If IsPreferred Then NewLabel = \"Preferred Client\"";
if (_ispreferred) { 
_newlabel = "Preferred Client";};
 //BA.debugLineNum = 4629;BA.debugLine="Dim memberships As List : memberships.Initialize";
_memberships = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4629;BA.debugLine="Dim memberships As List : memberships.Initialize";
_memberships.Initialize();
 //BA.debugLineNum = 4630;BA.debugLine="memberships.Add(CreateMap(\"contactGroupMembership";
_memberships.Add((Object)(__c.createMap(new Object[] {(Object)("contactGroupMembership"),(Object)(__c.createMap(new Object[] {(Object)("contactGroupResourceName"),(Object)("contactGroups/myContacts")}).getObject())}).getObject()));
 //BA.debugLineNum = 4632;BA.debugLine="Dim targetGroupID As String = \"\"";
_targetgroupid = "";
 //BA.debugLineNum = 4633;BA.debugLine="Select NewLabel";
switch (BA.switchObjectToInt(_newlabel,"Blacklisted Client","Preferred Client")) {
case 0: {
 //BA.debugLineNum = 4635;BA.debugLine="targetGroupID = Starter.GroupID_Blacklisted";
_targetgroupid = BA.NumberToString(_starter._groupid_blacklisted /*long*/ );
 break; }
case 1: {
 //BA.debugLineNum = 4637;BA.debugLine="targetGroupID = Starter.GroupID_Preferred";
_targetgroupid = BA.NumberToString(_starter._groupid_preferred /*long*/ );
 break; }
default: {
 //BA.debugLineNum = 4639;BA.debugLine="targetGroupID = Starter.GroupID_Client";
_targetgroupid = BA.NumberToString(_starter._groupid_client /*long*/ );
 break; }
}
;
 //BA.debugLineNum = 4642;BA.debugLine="If targetGroupID <> \"\" Then";
if ((_targetgroupid).equals("") == false) { 
 //BA.debugLineNum = 4643;BA.debugLine="memberships.Add(CreateMap(\"contactGroupMembershi";
_memberships.Add((Object)(__c.createMap(new Object[] {(Object)("contactGroupMembership"),(Object)(__c.createMap(new Object[] {(Object)("contactGroupResourceName"),(Object)(_targetgroupid)}).getObject())}).getObject()));
 };
 //BA.debugLineNum = 4646;BA.debugLine="Dim personMap As Map : personMap.Initialize";
_personmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4646;BA.debugLine="Dim personMap As Map : personMap.Initialize";
_personmap.Initialize();
 //BA.debugLineNum = 4647;BA.debugLine="personMap.Put(\"etag\", Etag)";
_personmap.Put((Object)("etag"),(Object)(_etag));
 //BA.debugLineNum = 4648;BA.debugLine="personMap.Put(\"biographies\", Array(CreateMap(\"val";
_personmap.Put((Object)("biographies"),(Object)(new Object[]{(Object)(__c.createMap(new Object[] {(Object)("value"),(Object)(_newnotes),(Object)("contentType"),(Object)("TEXT_PLAIN")}).getObject())}));
 //BA.debugLineNum = 4649;BA.debugLine="personMap.Put(\"memberships\", memberships)";
_personmap.Put((Object)("memberships"),(Object)(_memberships.getObject()));
 //BA.debugLineNum = 4651;BA.debugLine="Dim json As JSONGenerator : json.Initialize(perso";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 4651;BA.debugLine="Dim json As JSONGenerator : json.Initialize(perso";
_json.Initialize(_personmap);
 //BA.debugLineNum = 4652;BA.debugLine="Dim job As HttpJob : job.Initialize(\"UpdateContac";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 4652;BA.debugLine="Dim job As HttpJob : job.Initialize(\"UpdateContac";
_job._initialize /*String*/ (ba,"UpdateContact",this);
 //BA.debugLineNum = 4653;BA.debugLine="job.PatchString(\"https://people.googleapis.com/v1";
_job._patchstring /*String*/ ("https://people.googleapis.com/v1/"+_resourcename+":updateContact?updatePersonFields=biographies,memberships",_json.ToString());
 //BA.debugLineNum = 4654;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 4655;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 4656;BA.debugLine="End Sub";
return "";
}
public String  _updategooglecontact(anywheresoftware.b4a.objects.collections.List _params) throws Exception{
String _resourcename = "";
String _etag = "";
String _newnotes = "";
String _newlabel = "";
anywheresoftware.b4a.objects.collections.List _memberships = null;
String _targetgroupid = "";
anywheresoftware.b4a.objects.collections.Map _personmap = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 4669;BA.debugLine="Public Sub UpdateGoogleContact(Params As List)";
 //BA.debugLineNum = 4670;BA.debugLine="Dim ResourceName As String = Params.Get(0)";
_resourcename = BA.ObjectToString(_params.Get((int) (0)));
 //BA.debugLineNum = 4671;BA.debugLine="Dim Etag As String = Params.Get(1)";
_etag = BA.ObjectToString(_params.Get((int) (1)));
 //BA.debugLineNum = 4672;BA.debugLine="Dim NewNotes As String = Params.Get(2)";
_newnotes = BA.ObjectToString(_params.Get((int) (2)));
 //BA.debugLineNum = 4673;BA.debugLine="Dim NewLabel As String = Params.Get(3)";
_newlabel = BA.ObjectToString(_params.Get((int) (3)));
 //BA.debugLineNum = 4675;BA.debugLine="Dim memberships As List : memberships.Initialize";
_memberships = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4675;BA.debugLine="Dim memberships As List : memberships.Initialize";
_memberships.Initialize();
 //BA.debugLineNum = 4676;BA.debugLine="memberships.Add(CreateMap(\"contactGroupMembership";
_memberships.Add((Object)(__c.createMap(new Object[] {(Object)("contactGroupMembership"),(Object)(__c.createMap(new Object[] {(Object)("contactGroupResourceName"),(Object)("contactGroups/myContacts")}).getObject())}).getObject()));
 //BA.debugLineNum = 4678;BA.debugLine="Dim targetGroupID As String = \"\"";
_targetgroupid = "";
 //BA.debugLineNum = 4679;BA.debugLine="Select NewLabel";
switch (BA.switchObjectToInt(_newlabel,"Blacklisted Client","Preferred Client")) {
case 0: {
 //BA.debugLineNum = 4681;BA.debugLine="targetGroupID = Starter.GroupID_Blacklisted";
_targetgroupid = BA.NumberToString(_starter._groupid_blacklisted /*long*/ );
 break; }
case 1: {
 //BA.debugLineNum = 4683;BA.debugLine="targetGroupID = Starter.GroupID_Preferred";
_targetgroupid = BA.NumberToString(_starter._groupid_preferred /*long*/ );
 break; }
default: {
 //BA.debugLineNum = 4685;BA.debugLine="targetGroupID = Starter.GroupID_Client";
_targetgroupid = BA.NumberToString(_starter._groupid_client /*long*/ );
 break; }
}
;
 //BA.debugLineNum = 4688;BA.debugLine="If targetGroupID <> \"\" Then";
if ((_targetgroupid).equals("") == false) { 
 //BA.debugLineNum = 4689;BA.debugLine="memberships.Add(CreateMap(\"contactGroupMembershi";
_memberships.Add((Object)(__c.createMap(new Object[] {(Object)("contactGroupMembership"),(Object)(__c.createMap(new Object[] {(Object)("contactGroupResourceName"),(Object)(_targetgroupid)}).getObject())}).getObject()));
 };
 //BA.debugLineNum = 4692;BA.debugLine="Dim personMap As Map : personMap.Initialize";
_personmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4692;BA.debugLine="Dim personMap As Map : personMap.Initialize";
_personmap.Initialize();
 //BA.debugLineNum = 4693;BA.debugLine="personMap.Put(\"etag\", Etag)";
_personmap.Put((Object)("etag"),(Object)(_etag));
 //BA.debugLineNum = 4694;BA.debugLine="personMap.Put(\"biographies\", Array(CreateMap(\"val";
_personmap.Put((Object)("biographies"),(Object)(new Object[]{(Object)(__c.createMap(new Object[] {(Object)("value"),(Object)(_newnotes),(Object)("contentType"),(Object)("TEXT_PLAIN")}).getObject())}));
 //BA.debugLineNum = 4695;BA.debugLine="personMap.Put(\"memberships\", memberships)";
_personmap.Put((Object)("memberships"),(Object)(_memberships.getObject()));
 //BA.debugLineNum = 4697;BA.debugLine="Dim json As JSONGenerator : json.Initialize(perso";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 4697;BA.debugLine="Dim json As JSONGenerator : json.Initialize(perso";
_json.Initialize(_personmap);
 //BA.debugLineNum = 4698;BA.debugLine="Dim job As HttpJob : job.Initialize(\"UpdateContac";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 4698;BA.debugLine="Dim job As HttpJob : job.Initialize(\"UpdateContac";
_job._initialize /*String*/ (ba,"UpdateContact",this);
 //BA.debugLineNum = 4699;BA.debugLine="job.PatchString(\"https://people.googleapis.com/v1";
_job._patchstring /*String*/ ("https://people.googleapis.com/v1/"+_resourcename+":updateContact?updatePersonFields=biographies,memberships",_json.ToString());
 //BA.debugLineNum = 4700;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 4701;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 4702;BA.debugLine="End Sub";
return "";
}
public String  _updatestatspanel(double _mikecollected,double _erincollected) throws Exception{
double _total = 0;
 //BA.debugLineNum = 847;BA.debugLine="Public Sub UpdateStatsPanel(MikeCollected As Doubl";
 //BA.debugLineNum = 848;BA.debugLine="If lblGodCollectedNum.IsInitialized Then";
if (_lblgodcollectednum.IsInitialized()) { 
 //BA.debugLineNum = 849;BA.debugLine="lblGodCollectedNum.Text = \"$\" & NumberFormat2(Mi";
_lblgodcollectednum.setText(BA.ObjectToCharSequence("$"+__c.NumberFormat2(_mikecollected,(int) (1),(int) (2),(int) (2),__c.False)));
 };
 //BA.debugLineNum = 851;BA.debugLine="If lblGoddessCollectedNum.IsInitialized Then";
if (_lblgoddesscollectednum.IsInitialized()) { 
 //BA.debugLineNum = 852;BA.debugLine="lblGoddessCollectedNum.Text = \"$\" & NumberFormat";
_lblgoddesscollectednum.setText(BA.ObjectToCharSequence("$"+__c.NumberFormat2(_erincollected,(int) (1),(int) (2),(int) (2),__c.False)));
 };
 //BA.debugLineNum = 854;BA.debugLine="If lblTotalCollectedNum.IsInitialized Then";
if (_lbltotalcollectednum.IsInitialized()) { 
 //BA.debugLineNum = 855;BA.debugLine="Dim Total As Double = MikeCollected + ErinCollec";
_total = _mikecollected+_erincollected;
 //BA.debugLineNum = 856;BA.debugLine="lblTotalCollectedNum.Text = \"$\" & NumberFormat2(";
_lbltotalcollectednum.setText(BA.ObjectToCharSequence("$"+__c.NumberFormat2(_total,(int) (1),(int) (2),(int) (2),__c.False)));
 };
 //BA.debugLineNum = 858;BA.debugLine="End Sub";
return "";
}
public String  _uploadreceiptimage() throws Exception{
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 3101;BA.debugLine="Sub UploadReceiptImage";
 //BA.debugLineNum = 3102;BA.debugLine="Dim job As HttpJob : job.Initialize(\"UploadReceip";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 3102;BA.debugLine="Dim job As HttpJob : job.Initialize(\"UploadReceip";
_job._initialize /*String*/ (ba,"UploadReceipt",this);
 //BA.debugLineNum = 3105;BA.debugLine="job.PostBytes(\"https://www.googleapis.com/upload/";
_job._postbytes /*String*/ ("https://www.googleapis.com/upload/drive/v3/files?uploadType=media",__c.File.ReadBytes(__c.File.getDirInternal(),"temp_receipt.jpg"));
 //BA.debugLineNum = 3106;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_oauth2._access_token /*String*/ );
 //BA.debugLineNum = 3107;BA.debugLine="job.GetRequest.SetContentType(\"image/jpeg\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("image/jpeg");
 //BA.debugLineNum = 3108;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "ARCHIVEVOICEMAIL"))
	return _archivevoicemail((anywheresoftware.b4a.objects.collections.Map) args[0]);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
if (BA.fastSubCompare(sub, "CREATENEWCONTACT"))
	return _createnewcontact((anywheresoftware.b4a.objects.collections.Map) args[0]);
if (BA.fastSubCompare(sub, "DELETEVOICEMAIL"))
	return _deletevoicemail((anywheresoftware.b4a.objects.collections.Map) args[0]);
if (BA.fastSubCompare(sub, "DIRECTCALL"))
	return _directcall((String) args[0]);
if (BA.fastSubCompare(sub, "JOBDONE"))
	return _jobdone((Geek.God.CRM.App.httpjob) args[0]);
if (BA.fastSubCompare(sub, "LAUNCHMAPS"))
	return _launchmaps((String) args[0]);
if (BA.fastSubCompare(sub, "LAUNCHSMS"))
	return _launchsms((String) args[0], (String) args[1]);
if (BA.fastSubCompare(sub, "LOADSOUNDS"))
	return _loadsounds();
if (BA.fastSubCompare(sub, "ONDATESELECTED"))
	return _ondateselected(((Number)args[0]).intValue(), ((Number)args[1]).intValue(), ((Number)args[2]).intValue());
if (BA.fastSubCompare(sub, "PERFORMSEARCH"))
	return _performsearch((String) args[0]);
if (BA.fastSubCompare(sub, "PLAYRANDOMSOUND"))
	return _playrandomsound();
if (BA.fastSubCompare(sub, "PROCESSNEXTSCRAPEITEM"))
	return _processnextscrapeitem();
if (BA.fastSubCompare(sub, "REFRESHDASHBOARD"))
	return _refreshdashboard();
if (BA.fastSubCompare(sub, "SEARCHCONTACT"))
	return _searchcontact((String) args[0]);
if (BA.fastSubCompare(sub, "SETPENDINGSLOT"))
	return _setpendingslot((anywheresoftware.b4a.objects.collections.Map) args[0]);
if (BA.fastSubCompare(sub, "SUBMITCLOSEOUT"))
	return _submitcloseout((anywheresoftware.b4a.objects.collections.List) args[0]);
if (BA.fastSubCompare(sub, "UPDATECONTACT"))
	return _updatecontact((anywheresoftware.b4a.objects.collections.Map) args[0]);
return BA.SubDelegator.SubNotFound;
}

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
public void StartActivityForResult(Intent intent) {
	if (ba.activity != null) {
		ba.activity.startActivityForResult(intent, 123);
	}
}

public void setClipboardText(String text) {
    ClipboardManager clipboard = (ClipboardManager) BA.applicationContext.getSystemService(Context.CLIPBOARD_SERVICE);
    ClipData clip = ClipData.newPlainText("Transcript", text);
    clipboard.setPrimaryClip(clip);
}

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
}
