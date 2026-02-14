package Geek.God.CRM.App;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class searchpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "Geek.God.CRM.App.searchpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", Geek.God.CRM.App.searchpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtsearch = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsearch = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlresults = null;
public b4a.example3.customlistview _clvschedule = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _genericpopuppanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtpopupnotes = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblservicenotes = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblgrouppicker = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblhistorypicker = null;
public anywheresoftware.b4a.objects.IME _kb = null;
public anywheresoftware.b4a.objects.collections.Map _currentprofile = null;
public b4a.example.dateutils _dateutils = null;
public Geek.God.CRM.App.main _main = null;
public Geek.God.CRM.App.starter _starter = null;
public Geek.God.CRM.App.b4xpages _b4xpages = null;
public Geek.God.CRM.App.b4xcollections _b4xcollections = null;
public Geek.God.CRM.App.httputils2service _httputils2service = null;
public Geek.God.CRM.App.xuiviewsutils _xuiviewsutils = null;
public String  _adjustforkeyboard(int _newheight,int _fullheight) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Public Sub AdjustForKeyboard(NewHeight As Int, Ful";
 //BA.debugLineNum = 138;BA.debugLine="If Root.IsInitialized Then";
if (_root.IsInitialized()) { 
 //BA.debugLineNum = 139;BA.debugLine="Root.SetLayoutAnimated(0, 0, 0, Root.Width, NewH";
_root.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_root.getWidth(),_newheight);
 };
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _pnltop = null;
anywheresoftware.b4a.objects.LabelWrapper _btnhome = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xhome = null;
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pclv = null;
anywheresoftware.b4a.objects.LabelWrapper _lblstub = null;
anywheresoftware.b4a.objects.collections.Map _props = null;
 //BA.debugLineNum = 36;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 37;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 38;BA.debugLine="Root.Color = xui.Color_White";
_root.setColor(_xui.Color_White);
 //BA.debugLineNum = 41;BA.debugLine="Dim pnlTop As Panel : pnlTop.Initialize(\"\") : pnl";
_pnltop = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Dim pnlTop As Panel : pnlTop.Initialize(\"\") : pnl";
_pnltop.Initialize(ba,"");
 //BA.debugLineNum = 41;BA.debugLine="Dim pnlTop As Panel : pnlTop.Initialize(\"\") : pnl";
_pnltop.setColor(((int)0xfff5f5f5));
 //BA.debugLineNum = 42;BA.debugLine="Root.AddView(pnlTop, 0, 0, Root.Width, 60dip)";
_root.AddView((android.view.View)(_pnltop.getObject()),(int) (0),(int) (0),_root.getWidth(),__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 44;BA.debugLine="Dim btnHome As Label : btnHome.Initialize(\"btnHom";
_btnhome = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Dim btnHome As Label : btnHome.Initialize(\"btnHom";
_btnhome.Initialize(ba,"btnHome");
 //BA.debugLineNum = 45;BA.debugLine="Dim xHome As B4XView = btnHome";
_xhome = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xhome = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btnhome.getObject()));
 //BA.debugLineNum = 46;BA.debugLine="xHome.Text = Chr(0xF015)";
_xhome.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf015))));
 //BA.debugLineNum = 47;BA.debugLine="btnHome.Typeface = Typeface.FONTAWESOME";
_btnhome.setTypeface(__c.Typeface.getFONTAWESOME());
 //BA.debugLineNum = 48;BA.debugLine="xHome.TextSize = 24";
_xhome.setTextSize((float) (24));
 //BA.debugLineNum = 49;BA.debugLine="xHome.TextColor = xui.Color_Black";
_xhome.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 50;BA.debugLine="xHome.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xhome.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 51;BA.debugLine="pnlTop.AddView(xHome, 5dip, 0, 50dip, 60dip)";
_pnltop.AddView((android.view.View)(_xhome.getObject()),__c.DipToCurrent((int) (5)),(int) (0),__c.DipToCurrent((int) (50)),__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 54;BA.debugLine="Dim et As EditText : et.Initialize(\"txtSearch\")";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Dim et As EditText : et.Initialize(\"txtSearch\")";
_et.Initialize(ba,"txtSearch");
 //BA.debugLineNum = 55;BA.debugLine="et.Hint = \"Name or Date (MM/DD/YYYY)...\"";
_et.setHint("Name or Date (MM/DD/YYYY)...");
 //BA.debugLineNum = 56;BA.debugLine="et.TextSize = 14";
_et.setTextSize((float) (14));
 //BA.debugLineNum = 57;BA.debugLine="et.TextColor = xui.Color_Black";
_et.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 58;BA.debugLine="et.SingleLine = True";
_et.setSingleLine(__c.True);
 //BA.debugLineNum = 59;BA.debugLine="et.ForceDoneButton = True";
_et.setForceDoneButton(__c.True);
 //BA.debugLineNum = 60;BA.debugLine="txtSearch = et";
_txtsearch = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_et.getObject()));
 //BA.debugLineNum = 61;BA.debugLine="txtSearch.Color = xui.Color_White";
_txtsearch.setColor(_xui.Color_White);
 //BA.debugLineNum = 62;BA.debugLine="pnlTop.AddView(txtSearch, 60dip, 10dip, Root.Widt";
_pnltop.AddView((android.view.View)(_txtsearch.getObject()),__c.DipToCurrent((int) (60)),__c.DipToCurrent((int) (10)),(int) (_root.getWidth()-__c.DipToCurrent((int) (160))),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 65;BA.debugLine="Dim b As Button : b.Initialize(\"btnSearch\")";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 65;BA.debugLine="Dim b As Button : b.Initialize(\"btnSearch\")";
_b.Initialize(ba,"btnSearch");
 //BA.debugLineNum = 66;BA.debugLine="b.Text = \"Search\"";
_b.setText(BA.ObjectToCharSequence("Search"));
 //BA.debugLineNum = 67;BA.debugLine="btnSearch = b";
_btnsearch = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_b.getObject()));
 //BA.debugLineNum = 68;BA.debugLine="pnlTop.AddView(btnSearch, Root.Width - 90dip, 10d";
_pnltop.AddView((android.view.View)(_btnsearch.getObject()),(int) (_root.getWidth()-__c.DipToCurrent((int) (90))),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 71;BA.debugLine="PnlResults = xui.CreatePanel(\"\")";
_pnlresults = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 72;BA.debugLine="PnlResults.Color = xui.Color_Transparent";
_pnlresults.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 73;BA.debugLine="Root.AddView(PnlResults, 0, 65dip, Root.Width, Ro";
_root.AddView((android.view.View)(_pnlresults.getObject()),(int) (0),__c.DipToCurrent((int) (65)),_root.getWidth(),(int) (_root.getHeight()-__c.DipToCurrent((int) (65))));
 //BA.debugLineNum = 76;BA.debugLine="Dim pCLV As B4XView = xui.CreatePanel(\"\")";
_pclv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pclv = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 77;BA.debugLine="Root.AddView(pCLV, 0, 65dip, Root.Width, Root.Hei";
_root.AddView((android.view.View)(_pclv.getObject()),(int) (0),__c.DipToCurrent((int) (65)),_root.getWidth(),(int) (_root.getHeight()-__c.DipToCurrent((int) (65))));
 //BA.debugLineNum = 79;BA.debugLine="Dim lblStub As Label : lblStub.Initialize(\"\")";
_lblstub = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 79;BA.debugLine="Dim lblStub As Label : lblStub.Initialize(\"\")";
_lblstub.Initialize(ba,"");
 //BA.debugLineNum = 80;BA.debugLine="Dim props As Map = CreateMap(\"DividerColor\": 0xFF";
_props = new anywheresoftware.b4a.objects.collections.Map();
_props = __c.createMap(new Object[] {(Object)("DividerColor"),(Object)(((int)0xffd9d9d9)),(Object)("DividerHeight"),(Object)(__c.DipToCurrent((int) (1))),(Object)("PressedColor"),(Object)(((int)0xff7eb4fa)),(Object)("InsertAnimationDuration"),(Object)(0),(Object)("ListOrientation"),(Object)("Vertical")});
 //BA.debugLineNum = 82;BA.debugLine="clvSchedule.Initialize(Me, \"clvSchedule\")";
_clvschedule._initialize(ba,this,"clvSchedule");
 //BA.debugLineNum = 83;BA.debugLine="clvSchedule.DesignerCreateView(pCLV, lblStub, pro";
_clvschedule._designercreateview((Object)(_pclv.getObject()),_lblstub,_props);
 //BA.debugLineNum = 84;BA.debugLine="clvSchedule.AsView.Visible = False";
_clvschedule._asview().setVisible(__c.False);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_disappear() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Private Sub B4XPage_Disappear";
 //BA.debugLineNum = 130;BA.debugLine="If txtSearch.IsInitialized Then txtSearch.Text =";
if (_txtsearch.IsInitialized()) { 
_txtsearch.setText(BA.ObjectToCharSequence(""));};
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(int _width,int _height) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _pnltop = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pclv = null;
 //BA.debugLineNum = 107;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
 //BA.debugLineNum = 108;BA.debugLine="If Root.IsInitialized = False Then Return";
if (_root.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 109;BA.debugLine="If Width < 50 Or Height < 50 Then Return";
if (_width<50 || _height<50) { 
if (true) return "";};
 //BA.debugLineNum = 112;BA.debugLine="Dim pnlTop As B4XView = Root.GetView(0)";
_pnltop = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnltop = _root.GetView((int) (0));
 //BA.debugLineNum = 113;BA.debugLine="pnlTop.SetLayoutAnimated(0, 0, 0, Width, 60dip)";
_pnltop.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 114;BA.debugLine="txtSearch.SetLayoutAnimated(0, 60dip, 10dip, Widt";
_txtsearch.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (60)),__c.DipToCurrent((int) (10)),(int) (_width-__c.DipToCurrent((int) (160))),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 115;BA.debugLine="btnSearch.SetLayoutAnimated(0, Width - 90dip, 10d";
_btnsearch.SetLayoutAnimated((int) (0),(int) (_width-__c.DipToCurrent((int) (90))),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 118;BA.debugLine="PnlResults.SetLayoutAnimated(0, 0, 65dip, Width,";
_pnlresults.SetLayoutAnimated((int) (0),(int) (0),__c.DipToCurrent((int) (65)),_width,(int) (_height-__c.DipToCurrent((int) (65))));
 //BA.debugLineNum = 121;BA.debugLine="Dim pCLV As B4XView = Root.GetView(2)";
_pclv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pclv = _root.GetView((int) (2));
 //BA.debugLineNum = 122;BA.debugLine="pCLV.SetLayoutAnimated(0, 0, 65dip, Width, Height";
_pclv.SetLayoutAnimated((int) (0),(int) (0),__c.DipToCurrent((int) (65)),_width,(int) (_height-__c.DipToCurrent((int) (65))));
 //BA.debugLineNum = 123;BA.debugLine="If clvSchedule.IsInitialized And clvSchedule.AsVi";
if (_clvschedule.IsInitialized() && _clvschedule._asview().IsInitialized()) { 
 //BA.debugLineNum = 124;BA.debugLine="clvSchedule.AsView.SetLayoutAnimated(0, 0, 0, Wi";
_clvschedule._asview().SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,(int) (_height-__c.DipToCurrent((int) (65))));
 //BA.debugLineNum = 125;BA.debugLine="clvSchedule.Base_Resize(Width, Height - 65dip)";
_clvschedule._base_resize(_width,_height-__c.DipToCurrent((int) (65)));
 };
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _btncreateappt_click() throws Exception{
Object _destpage = null;
 //BA.debugLineNum = 764;BA.debugLine="Sub btnCreateAppt_Click";
 //BA.debugLineNum = 765;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 768;BA.debugLine="Dim DestPage As Object = B4XPages.GetPage(\"Appoin";
_destpage = _b4xpages._getpage /*Object*/ (ba,"AppointmentPage");
 //BA.debugLineNum = 769;BA.debugLine="CallSub2(DestPage, \"SetClient\", CurrentProfile)";
__c.CallSubNew2(ba,_destpage,"SetClient",(Object)(_currentprofile));
 //BA.debugLineNum = 771;BA.debugLine="B4XPages.ShowPage(\"AppointmentPage\")";
_b4xpages._showpage /*String*/ (ba,"AppointmentPage");
 //BA.debugLineNum = 772;BA.debugLine="End Sub";
return "";
}
public String  _btndismiss_click() throws Exception{
String _rname = "";
String _etag = "";
String _finalnote = "";
String _newlabel = "";
anywheresoftware.b4a.objects.collections.Map _updatemap = null;
 //BA.debugLineNum = 731;BA.debugLine="Sub btnDismiss_Click";
 //BA.debugLineNum = 732;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 733;BA.debugLine="Dim rName As String = CurrentProfile.Get(\"Resourc";
_rname = BA.ObjectToString(_currentprofile.Get((Object)("ResourceName")));
 //BA.debugLineNum = 734;BA.debugLine="Dim etag As String = CurrentProfile.Get(\"Etag\")";
_etag = BA.ObjectToString(_currentprofile.Get((Object)("Etag")));
 //BA.debugLineNum = 735;BA.debugLine="Dim finalNote As String = lblServiceNotes.Text";
_finalnote = _lblservicenotes.getText();
 //BA.debugLineNum = 736;BA.debugLine="Dim newLabel As String = lblGroupPicker.Tag";
_newlabel = BA.ObjectToString(_lblgrouppicker.getTag());
 //BA.debugLineNum = 738;BA.debugLine="Dim updateMap As Map : updateMap.Initialize";
_updatemap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 738;BA.debugLine="Dim updateMap As Map : updateMap.Initialize";
_updatemap.Initialize();
 //BA.debugLineNum = 739;BA.debugLine="updateMap.Put(\"ResourceName\", rName)";
_updatemap.Put((Object)("ResourceName"),(Object)(_rname));
 //BA.debugLineNum = 740;BA.debugLine="updateMap.Put(\"Etag\", etag)";
_updatemap.Put((Object)("Etag"),(Object)(_etag));
 //BA.debugLineNum = 741;BA.debugLine="updateMap.Put(\"Notes\", finalNote)";
_updatemap.Put((Object)("Notes"),(Object)(_finalnote));
 //BA.debugLineNum = 743;BA.debugLine="If newLabel = \"Blacklisted\" Then";
if ((_newlabel).equals("Blacklisted")) { 
 //BA.debugLineNum = 744;BA.debugLine="updateMap.Put(\"IsBlacklisted\", True)";
_updatemap.Put((Object)("IsBlacklisted"),(Object)(__c.True));
 //BA.debugLineNum = 745;BA.debugLine="updateMap.Put(\"IsPreferred\", False)";
_updatemap.Put((Object)("IsPreferred"),(Object)(__c.False));
 }else if((_newlabel).equals("Preferred")) { 
 //BA.debugLineNum = 747;BA.debugLine="updateMap.Put(\"IsPreferred\", True)";
_updatemap.Put((Object)("IsPreferred"),(Object)(__c.True));
 //BA.debugLineNum = 748;BA.debugLine="updateMap.Put(\"IsBlacklisted\", False)";
_updatemap.Put((Object)("IsBlacklisted"),(Object)(__c.False));
 }else {
 //BA.debugLineNum = 750;BA.debugLine="updateMap.Put(\"IsPreferred\", False)";
_updatemap.Put((Object)("IsPreferred"),(Object)(__c.False));
 //BA.debugLineNum = 751;BA.debugLine="updateMap.Put(\"IsBlacklisted\", False)";
_updatemap.Put((Object)("IsBlacklisted"),(Object)(__c.False));
 };
 //BA.debugLineNum = 754;BA.debugLine="CallSub2(B4XPages.MainPage, \"UpdateContact\", upda";
__c.CallSubNew2(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"UpdateContact",(Object)(_updatemap));
 //BA.debugLineNum = 755;BA.debugLine="End Sub";
return "";
}
public String  _btnhome_click() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub btnHome_Click";
 //BA.debugLineNum = 134;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _btnsavenotes_click() throws Exception{
 //BA.debugLineNum = 698;BA.debugLine="Sub btnSaveNotes_Click";
 //BA.debugLineNum = 699;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 700;BA.debugLine="lblServiceNotes.Text = txtPopupNotes.Text";
_lblservicenotes.setText(BA.ObjectToCharSequence(_txtpopupnotes.getText()));
 //BA.debugLineNum = 701;BA.debugLine="CurrentProfile.Put(\"Notes\", txtPopupNotes.Text)";
_currentprofile.Put((Object)("Notes"),(Object)(_txtpopupnotes.getText()));
 //BA.debugLineNum = 702;BA.debugLine="GenericPopupPanel.RemoveViewFromParent";
_genericpopuppanel.RemoveViewFromParent();
 //BA.debugLineNum = 703;BA.debugLine="kb.HideKeyboard";
_kb.HideKeyboard(ba);
 //BA.debugLineNum = 704;BA.debugLine="End Sub";
return "";
}
public String  _btnsearch_click() throws Exception{
String _q = "";
 //BA.debugLineNum = 168;BA.debugLine="Sub btnSearch_Click";
 //BA.debugLineNum = 169;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 170;BA.debugLine="kb.HideKeyboard";
_kb.HideKeyboard(ba);
 //BA.debugLineNum = 171;BA.debugLine="Dim q As String = txtSearch.Text.Trim";
_q = _txtsearch.getText().trim();
 //BA.debugLineNum = 172;BA.debugLine="Log(\">>> [SearchPage] Search Button Clicked. Quer";
__c.LogImpl("09961476",">>> [SearchPage] Search Button Clicked. Query: "+_q,0);
 //BA.debugLineNum = 174;BA.debugLine="If q.Length > 0 Then";
if (_q.length()>0) { 
 //BA.debugLineNum = 175;BA.debugLine="PnlResults.RemoveAllViews";
_pnlresults.RemoveAllViews();
 //BA.debugLineNum = 176;BA.debugLine="clvSchedule.Clear";
_clvschedule._clear();
 //BA.debugLineNum = 177;BA.debugLine="CallSub2(B4XPages.MainPage, \"PerformSearch\", q)";
__c.CallSubNew2(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PerformSearch",(Object)(_q));
 }else {
 //BA.debugLineNum = 179;BA.debugLine="xui.MsgboxAsync(\"Enter Name or Date\", \"Error\")";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Enter Name or Date"),BA.ObjectToCharSequence("Error"));
 };
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 8;BA.debugLine="Private txtSearch As B4XView";
_txtsearch = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private btnSearch As B4XView";
_btnsearch = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private PnlResults As B4XView";
_pnlresults = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private clvSchedule As CustomListView";
_clvschedule = new b4a.example3.customlistview();
 //BA.debugLineNum = 14;BA.debugLine="Private GenericPopupPanel As B4XView";
_genericpopuppanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private txtPopupNotes As B4XView";
_txtpopupnotes = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private lblServiceNotes As B4XView";
_lblservicenotes = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private lblGroupPicker As B4XView";
_lblgrouppicker = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private lblHistoryPicker As B4XView";
_lblhistorypicker = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private kb As IME";
_kb = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 22;BA.debugLine="Private CurrentProfile As Map";
_currentprofile = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _cleanaddress(String _addr) throws Exception{
String _temp = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
 //BA.debugLineNum = 544;BA.debugLine="Private Sub CleanAddress(Addr As String) As String";
 //BA.debugLineNum = 545;BA.debugLine="Dim temp As String = Addr.Replace(\", USA\", \"\").Re";
_temp = _addr.replace(", USA","").replace(", US","").replace(" USA","").replace(" US","").trim();
 //BA.debugLineNum = 546;BA.debugLine="temp = temp.Replace(\"United States\", \"\")";
_temp = _temp.replace("United States","");
 //BA.debugLineNum = 547;BA.debugLine="temp = temp.Replace(CRLF, \" \").Replace(Chr(10), \"";
_temp = _temp.replace(__c.CRLF," ").replace(BA.ObjectToString(__c.Chr((int) (10)))," ").replace(BA.ObjectToString(__c.Chr((int) (13)))," ");
 //BA.debugLineNum = 549;BA.debugLine="Try";
try { //BA.debugLineNum = 550;BA.debugLine="Dim m As Matcher : m = Regex.Matcher(\"(\\d+.*?\\d{";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
 //BA.debugLineNum = 550;BA.debugLine="Dim m As Matcher : m = Regex.Matcher(\"(\\d+.*?\\d{";
_m = __c.Regex.Matcher("(\\d+.*?\\d{5})",_temp);
 //BA.debugLineNum = 551;BA.debugLine="If m.Find Then temp = m.Group(1).Trim";
if (_m.Find()) { 
_temp = _m.Group((int) (1)).trim();};
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 553;BA.debugLine="Log(\"Address Parse Error\")";
__c.LogImpl("010420233","Address Parse Error",0);
 };
 //BA.debugLineNum = 556;BA.debugLine="temp = temp.Replace(\"  \", \" \").Replace(\" ,\", \",\")";
_temp = _temp.replace("  "," ").replace(" ,",",").trim();
 //BA.debugLineNum = 557;BA.debugLine="If temp.EndsWith(\",\") Then temp = temp.SubString2";
if (_temp.endsWith(",")) { 
_temp = _temp.substring((int) (0),(int) (_temp.length()-1));};
 //BA.debugLineNum = 558;BA.debugLine="Return temp";
if (true) return _temp;
 //BA.debugLineNum = 559;BA.debugLine="End Sub";
return "";
}
public String  _clvschedule_itemclick(int _index,Object _value) throws Exception{
String _cname = "";
 //BA.debugLineNum = 234;BA.debugLine="Sub clvSchedule_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 235;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 236;BA.debugLine="Dim cName As String = Value";
_cname = BA.ObjectToString(_value);
 //BA.debugLineNum = 237;BA.debugLine="SearchContact(cName)";
_searchcontact(_cname);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabelheader(String _txt,int _color) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _l = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xl = null;
 //BA.debugLineNum = 520;BA.debugLine="Private Sub CreateLabelHeader(Txt As String, Color";
 //BA.debugLineNum = 521;BA.debugLine="Dim l As Label : l.Initialize(\"\")";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 521;BA.debugLine="Dim l As Label : l.Initialize(\"\")";
_l.Initialize(ba,"");
 //BA.debugLineNum = 522;BA.debugLine="l.Typeface = LoadSafeFont(\"search - control label";
_l.setTypeface((android.graphics.Typeface)(_loadsafefont("search - control labels.ttf").getObject()));
 //BA.debugLineNum = 523;BA.debugLine="Dim xl As B4XView = l";
_xl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_l.getObject()));
 //BA.debugLineNum = 524;BA.debugLine="xl.Text = Txt";
_xl.setText(BA.ObjectToCharSequence(_txt));
 //BA.debugLineNum = 525;BA.debugLine="xl.TextColor = Color";
_xl.setTextColor(_color);
 //BA.debugLineNum = 526;BA.debugLine="xl.TextSize = 30 ' TRIPLE SIZE";
_xl.setTextSize((float) (30));
 //BA.debugLineNum = 527;BA.debugLine="Return xl";
if (true) return _xl;
 //BA.debugLineNum = 528;BA.debugLine="End Sub";
return null;
}
public String  _formatphone(String _raw) throws Exception{
String _cleaned = "";
 //BA.debugLineNum = 532;BA.debugLine="Private Sub FormatPhone(Raw As String) As String";
 //BA.debugLineNum = 533;BA.debugLine="Dim cleaned As String = Raw.Replace(\"+\", \"\").Repl";
_cleaned = _raw.replace("+","").replace("-","").replace(" ","").replace("(","").replace(")","");
 //BA.debugLineNum = 534;BA.debugLine="If cleaned.Length > 10 And cleaned.StartsWith(\"1\"";
if (_cleaned.length()>10 && _cleaned.startsWith("1")) { 
 //BA.debugLineNum = 535;BA.debugLine="cleaned = cleaned.SubString(1)";
_cleaned = _cleaned.substring((int) (1));
 };
 //BA.debugLineNum = 537;BA.debugLine="If cleaned.Length = 10 Then";
if (_cleaned.length()==10) { 
 //BA.debugLineNum = 538;BA.debugLine="Return \"(\" & cleaned.SubString2(0, 3) & \") \" & c";
if (true) return "("+_cleaned.substring((int) (0),(int) (3))+") "+_cleaned.substring((int) (3),(int) (6))+"-"+_cleaned.substring((int) (6));
 }else {
 //BA.debugLineNum = 540;BA.debugLine="Return Raw";
if (true) return _raw;
 };
 //BA.debugLineNum = 542;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 26;BA.debugLine="kb.Initialize(\"kb\")";
_kb.Initialize("kb");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _lbladdr_click() throws Exception{
 //BA.debugLineNum = 726;BA.debugLine="Sub lblAddr_Click";
 //BA.debugLineNum = 727;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 728;BA.debugLine="CallSub2(B4XPages.MainPage, \"LaunchMaps\", Current";
__c.CallSubNew2(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"LaunchMaps",_currentprofile.Get((Object)("Address")));
 //BA.debugLineNum = 729;BA.debugLine="End Sub";
return "";
}
public String  _lblgrouppicker_click() throws Exception{
anywheresoftware.b4a.objects.collections.List _items = null;
 //BA.debugLineNum = 587;BA.debugLine="Sub lblGroupPicker_Click";
 //BA.debugLineNum = 588;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 589;BA.debugLine="Dim Items As List : Items.Initialize";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 589;BA.debugLine="Dim Items As List : Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 590;BA.debugLine="Items.AddAll(Array As String(\"Client\", \"Preferred";
_items.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Client","Preferred","Blacklisted"}));
 //BA.debugLineNum = 591;BA.debugLine="ShowCustomList(\"Select Client Group\", Items, \"Gro";
_showcustomlist("Select Client Group",_items,"Group");
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return "";
}
public String  _lblhistorypicker_click() throws Exception{
anywheresoftware.b4a.objects.collections.List _issues = null;
 //BA.debugLineNum = 594;BA.debugLine="Sub lblHistoryPicker_Click";
 //BA.debugLineNum = 595;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 596;BA.debugLine="Dim issues As List = CurrentProfile.Get(\"IssuesLi";
_issues = new anywheresoftware.b4a.objects.collections.List();
_issues = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentprofile.Get((Object)("IssuesList"))));
 //BA.debugLineNum = 597;BA.debugLine="If issues.Size = 0 Then";
if (_issues.getSize()==0) { 
 //BA.debugLineNum = 598;BA.debugLine="xui.MsgboxAsync(\"No history.\", \"History\")";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("No history."),BA.ObjectToCharSequence("History"));
 //BA.debugLineNum = 599;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 601;BA.debugLine="ShowCustomList(\"Visit History\", issues, \"History\"";
_showcustomlist("Visit History",_issues,"History");
 //BA.debugLineNum = 602;BA.debugLine="End Sub";
return "";
}
public void  _lblphone_click() throws Exception{
ResumableSub_lblPhone_Click rsub = new ResumableSub_lblPhone_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_lblPhone_Click extends BA.ResumableSub {
public ResumableSub_lblPhone_Click(Geek.God.CRM.App.searchpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.searchpage parent;
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
 //BA.debugLineNum = 707;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
parent.__c.CallSubNew(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 708;BA.debugLine="Dim cPhone As String = CurrentProfile.Get(\"Phone\"";
_cphone = BA.ObjectToString(parent._currentprofile.Get((Object)("Phone")));
 //BA.debugLineNum = 709;BA.debugLine="Msgbox2Async(\"Contact client?\", \"Contact\", \"Call\"";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Contact client?"),BA.ObjectToCharSequence("Contact"),"Call","Cancel","Text",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
 //BA.debugLineNum = 710;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 711;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 713;BA.debugLine="CallSub2(B4XPages.MainPage, \"DirectCall\", cPhone";
parent.__c.CallSubNew2(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"DirectCall",(Object)(_cphone));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 715;BA.debugLine="CallSub2(B4XPages.MainPage, \"LaunchSMS\", cPhone)";
parent.__c.CallSubNew2(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"LaunchSMS",(Object)(_cphone));
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 717;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _msgbox_result(int _result) throws Exception{
}
public String  _lblphone2_click() throws Exception{
String _cphone2 = "";
 //BA.debugLineNum = 720;BA.debugLine="Sub lblPhone2_Click";
 //BA.debugLineNum = 721;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 722;BA.debugLine="Dim cPhone2 As String = CurrentProfile.Get(\"Phone";
_cphone2 = BA.ObjectToString(_currentprofile.Get((Object)("Phone2")));
 //BA.debugLineNum = 723;BA.debugLine="CallSub2(B4XPages.MainPage, \"DirectCall\", cPhone2";
__c.CallSubNew2(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"DirectCall",(Object)(_cphone2));
 //BA.debugLineNum = 724;BA.debugLine="End Sub";
return "";
}
public void  _lblservicenotes_click() throws Exception{
ResumableSub_lblServiceNotes_Click rsub = new ResumableSub_lblServiceNotes_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_lblServiceNotes_Click extends BA.ResumableSub {
public ResumableSub_lblServiceNotes_Click(Geek.God.CRM.App.searchpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.searchpage parent;
anywheresoftware.b4a.objects.LabelWrapper _lblhead = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xhead = null;
anywheresoftware.b4a.objects.EditTextWrapper _txtedit = null;
anywheresoftware.b4a.objects.ButtonWrapper _btnok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xok = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 660;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
parent.__c.CallSubNew(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 661;BA.debugLine="If GenericPopupPanel.IsInitialized And GenericPop";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._genericpopuppanel.IsInitialized() && parent._genericpopuppanel.getParent().IsInitialized()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent._genericpopuppanel.RemoveViewFromParent();
if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 662;BA.debugLine="GenericPopupPanel = xui.CreatePanel(\"\")";
parent._genericpopuppanel = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 663;BA.debugLine="GenericPopupPanel.SetColorAndBorder(xui.Color_Whi";
parent._genericpopuppanel.SetColorAndBorder(parent._xui.Color_White,parent.__c.DipToCurrent((int) (2)),parent._xui.Color_Black,parent.__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 664;BA.debugLine="Root.AddView(GenericPopupPanel, 10dip, 50dip, Roo";
parent._root.AddView((android.view.View)(parent._genericpopuppanel.getObject()),parent.__c.DipToCurrent((int) (10)),parent.__c.DipToCurrent((int) (50)),(int) (parent._root.getWidth()-parent.__c.DipToCurrent((int) (20))),(int) (parent._root.getHeight()-parent.__c.DipToCurrent((int) (100))));
 //BA.debugLineNum = 666;BA.debugLine="Dim lblHead As Label : lblHead.Initialize(\"\")";
_lblhead = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 666;BA.debugLine="Dim lblHead As Label : lblHead.Initialize(\"\")";
_lblhead.Initialize(ba,"");
 //BA.debugLineNum = 667;BA.debugLine="Dim xHead As B4XView = lblHead";
_xhead = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xhead = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblhead.getObject()));
 //BA.debugLineNum = 668;BA.debugLine="xHead.Text = \"Edit Visit & Client Notes\"";
_xhead.setText(BA.ObjectToCharSequence("Edit Visit & Client Notes"));
 //BA.debugLineNum = 669;BA.debugLine="xHead.TextColor = xui.Color_Black";
_xhead.setTextColor(parent._xui.Color_Black);
 //BA.debugLineNum = 670;BA.debugLine="xHead.TextSize = 14";
_xhead.setTextSize((float) (14));
 //BA.debugLineNum = 671;BA.debugLine="lblHead.Typeface = Typeface.DEFAULT_BOLD";
_lblhead.setTypeface(parent.__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 672;BA.debugLine="xHead.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xhead.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 673;BA.debugLine="GenericPopupPanel.AddView(xHead, 0, 0, GenericPop";
parent._genericpopuppanel.AddView((android.view.View)(_xhead.getObject()),(int) (0),(int) (0),parent._genericpopuppanel.getWidth(),parent.__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 675;BA.debugLine="Dim txtEdit As EditText : txtEdit.Initialize(\"\")";
_txtedit = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 675;BA.debugLine="Dim txtEdit As EditText : txtEdit.Initialize(\"\")";
_txtedit.Initialize(ba,"");
 //BA.debugLineNum = 676;BA.debugLine="txtPopupNotes = txtEdit";
parent._txtpopupnotes = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_txtedit.getObject()));
 //BA.debugLineNum = 677;BA.debugLine="txtPopupNotes.Text = lblServiceNotes.Text";
parent._txtpopupnotes.setText(BA.ObjectToCharSequence(parent._lblservicenotes.getText()));
 //BA.debugLineNum = 678;BA.debugLine="txtPopupNotes.TextColor = xui.Color_Black";
parent._txtpopupnotes.setTextColor(parent._xui.Color_Black);
 //BA.debugLineNum = 679;BA.debugLine="txtPopupNotes.Color = 0xFFF0F0F0";
parent._txtpopupnotes.setColor(((int)0xfff0f0f0));
 //BA.debugLineNum = 680;BA.debugLine="txtPopupNotes.TextSize = 14";
parent._txtpopupnotes.setTextSize((float) (14));
 //BA.debugLineNum = 681;BA.debugLine="txtEdit.SingleLine = False";
_txtedit.setSingleLine(parent.__c.False);
 //BA.debugLineNum = 682;BA.debugLine="txtEdit.Wrap = True";
_txtedit.setWrap(parent.__c.True);
 //BA.debugLineNum = 683;BA.debugLine="txtEdit.Gravity = Gravity.TOP + Gravity.LEFT";
_txtedit.setGravity((int) (parent.__c.Gravity.TOP+parent.__c.Gravity.LEFT));
 //BA.debugLineNum = 684;BA.debugLine="GenericPopupPanel.AddView(txtPopupNotes, 10dip, 4";
parent._genericpopuppanel.AddView((android.view.View)(parent._txtpopupnotes.getObject()),parent.__c.DipToCurrent((int) (10)),parent.__c.DipToCurrent((int) (45)),(int) (parent._genericpopuppanel.getWidth()-parent.__c.DipToCurrent((int) (20))),(int) (parent._genericpopuppanel.getHeight()-parent.__c.DipToCurrent((int) (100))));
 //BA.debugLineNum = 686;BA.debugLine="Dim btnOk As Button : btnOk.Initialize(\"btnSaveNo";
_btnok = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 686;BA.debugLine="Dim btnOk As Button : btnOk.Initialize(\"btnSaveNo";
_btnok.Initialize(ba,"btnSaveNotes");
 //BA.debugLineNum = 687;BA.debugLine="Dim xOk As B4XView = btnOk";
_xok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xok = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btnok.getObject()));
 //BA.debugLineNum = 688;BA.debugLine="xOk.Text = \"SAVE NOTES\"";
_xok.setText(BA.ObjectToCharSequence("SAVE NOTES"));
 //BA.debugLineNum = 689;BA.debugLine="xOk.Color = 0xFF2E7D32";
_xok.setColor(((int)0xff2e7d32));
 //BA.debugLineNum = 690;BA.debugLine="xOk.TextColor = xui.Color_White";
_xok.setTextColor(parent._xui.Color_White);
 //BA.debugLineNum = 691;BA.debugLine="GenericPopupPanel.AddView(xOk, 10dip, GenericPopu";
parent._genericpopuppanel.AddView((android.view.View)(_xok.getObject()),parent.__c.DipToCurrent((int) (10)),(int) (parent._genericpopuppanel.getHeight()-parent.__c.DipToCurrent((int) (50))),(int) (parent._genericpopuppanel.getWidth()-parent.__c.DipToCurrent((int) (20))),parent.__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 693;BA.debugLine="txtPopupNotes.RequestFocus";
parent._txtpopupnotes.RequestFocus();
 //BA.debugLineNum = 694;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,this,(int) (100));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 //BA.debugLineNum = 695;BA.debugLine="kb.ShowKeyboard(txtPopupNotes)";
parent._kb.ShowKeyboard((android.view.View)(parent._txtpopupnotes.getObject()));
 //BA.debugLineNum = 696;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper  _loadsafefont(String _fontname) throws Exception{
String _basedir = "";
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 561;BA.debugLine="Private Sub LoadSafeFont(FontName As String) As Ty";
 //BA.debugLineNum = 562;BA.debugLine="Dim BaseDir As String = File.DirRootExternal & \"/";
_basedir = __c.File.getDirRootExternal()+"/Geek God CRM/Fonts";
 //BA.debugLineNum = 564;BA.debugLine="If File.Exists(BaseDir, \"\") = False Then";
if (__c.File.Exists(_basedir,"")==__c.False) { 
 //BA.debugLineNum = 565;BA.debugLine="File.MakeDir(File.DirRootExternal, \"Geek God CRM";
__c.File.MakeDir(__c.File.getDirRootExternal(),"Geek God CRM/Fonts");
 };
 //BA.debugLineNum = 568;BA.debugLine="If File.Exists(BaseDir, FontName) Then";
if (__c.File.Exists(_basedir,_fontname)) { 
 //BA.debugLineNum = 569;BA.debugLine="Try";
try { //BA.debugLineNum = 570;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 571;BA.debugLine="jo.InitializeStatic(\"android.graphics.Typeface\"";
_jo.InitializeStatic("android.graphics.Typeface");
 //BA.debugLineNum = 572;BA.debugLine="Return jo.RunMethod(\"createFromFile\", Array(Fil";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(_jo.RunMethod("createFromFile",new Object[]{(Object)(__c.File.Combine(_basedir,_fontname))})));
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 574;BA.debugLine="Log(\"Error loading external font: \" & FontName)";
__c.LogImpl("010485773","Error loading external font: "+_fontname,0);
 };
 };
 //BA.debugLineNum = 578;BA.debugLine="If File.Exists(File.DirAssets, FontName) Then";
if (__c.File.Exists(__c.File.getDirAssets(),_fontname)) { 
 //BA.debugLineNum = 579;BA.debugLine="Return Typeface.LoadFromAssets(FontName)";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.LoadFromAssets(_fontname)));
 };
 //BA.debugLineNum = 582;BA.debugLine="Return Typeface.DEFAULT_BOLD";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT_BOLD));
 //BA.debugLineNum = 583;BA.debugLine="End Sub";
return null;
}
public String  _redrawui(int _currentw) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub RedrawUI(CurrentW As Int)";
 //BA.debugLineNum = 92;BA.debugLine="If Root.IsInitialized = False Then Return";
if (_root.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 95;BA.debugLine="If CurrentW > 1300 Then";
if (_currentw>1300) { 
 //BA.debugLineNum = 96;BA.debugLine="Log(\">>> [SearchPage] RedrawUI: Mike Open Big /";
__c.LogImpl("09502725",">>> [SearchPage] RedrawUI: Mike Open Big / Unfolded ("+BA.NumberToString(_currentw)+")",0);
 }else if(_currentw>850) { 
 //BA.debugLineNum = 98;BA.debugLine="Log(\">>> [SearchPage] RedrawUI: Mike Closed Smal";
__c.LogImpl("09502727",">>> [SearchPage] RedrawUI: Mike Closed Small / Tall Phone ("+BA.NumberToString(_currentw)+")",0);
 }else {
 //BA.debugLineNum = 100;BA.debugLine="Log(\">>> [SearchPage] RedrawUI: Erin's Phone (\"";
__c.LogImpl("09502729",">>> [SearchPage] RedrawUI: Erin's Phone ("+BA.NumberToString(_currentw)+")",0);
 };
 //BA.debugLineNum = 104;BA.debugLine="B4XPage_Resize(CurrentW, Root.Height)";
_b4xpage_resize(_currentw,_root.getHeight());
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _searchcontact(String _query) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Public Sub SearchContact(Query As String)";
 //BA.debugLineNum = 156;BA.debugLine="If Root.IsInitialized = False Then Return";
if (_root.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 158;BA.debugLine="Log(\">>> [SearchPage] SearchContact called with:";
__c.LogImpl("09830403",">>> [SearchPage] SearchContact called with: "+_query,0);
 //BA.debugLineNum = 159;BA.debugLine="If txtSearch.Text <> Query Then txtSearch.Text =";
if ((_txtsearch.getText()).equals(_query) == false) { 
_txtsearch.setText(BA.ObjectToCharSequence(_query));};
 //BA.debugLineNum = 160;BA.debugLine="PnlResults.RemoveAllViews";
_pnlresults.RemoveAllViews();
 //BA.debugLineNum = 161;BA.debugLine="CallSub2(B4XPages.MainPage, \"PerformSearch\", Quer";
__c.CallSubNew2(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PerformSearch",(Object)(_query));
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public String  _selectionitem_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 648;BA.debugLine="Sub SelectionItem_Click";
 //BA.debugLineNum = 649;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 650;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 651;BA.debugLine="Dim m As Map = btn.Tag";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_btn.getTag()));
 //BA.debugLineNum = 652;BA.debugLine="If m.Get(\"Type\") = \"Group\" Then";
if ((_m.Get((Object)("Type"))).equals((Object)("Group"))) { 
 //BA.debugLineNum = 653;BA.debugLine="lblGroupPicker.Text = \" Group: \" & m.Get(\"Val\")";
_lblgrouppicker.setText(BA.ObjectToCharSequence(" Group: "+BA.ObjectToString(_m.Get((Object)("Val")))));
 //BA.debugLineNum = 654;BA.debugLine="lblGroupPicker.Tag = m.Get(\"Val\")";
_lblgrouppicker.setTag(_m.Get((Object)("Val")));
 };
 //BA.debugLineNum = 656;BA.debugLine="GenericPopupPanel.RemoveViewFromParent";
_genericpopuppanel.RemoveViewFromParent();
 //BA.debugLineNum = 657;BA.debugLine="End Sub";
return "";
}
public String  _showcustomlist(String _title,anywheresoftware.b4a.objects.collections.List _items,String _requesttype) throws Exception{
int _itemh = 0;
int _headerh = 0;
int _contentheight = 0;
int _maxh = 0;
int _ph = 0;
int _pw = 0;
int _toppos = 0;
int _leftpos = 0;
anywheresoftware.b4a.objects.LabelWrapper _lblhead = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xhead = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _clv = null;
int _top = 0;
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lblitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xitem = null;
 //BA.debugLineNum = 604;BA.debugLine="Sub ShowCustomList(Title As String, Items As List,";
 //BA.debugLineNum = 605;BA.debugLine="If GenericPopupPanel.IsInitialized And GenericPop";
if (_genericpopuppanel.IsInitialized() && _genericpopuppanel.getParent().IsInitialized()) { 
_genericpopuppanel.RemoveViewFromParent();};
 //BA.debugLineNum = 606;BA.debugLine="GenericPopupPanel = xui.CreatePanel(\"\")";
_genericpopuppanel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 607;BA.debugLine="GenericPopupPanel.SetColorAndBorder(xui.Color_Whi";
_genericpopuppanel.SetColorAndBorder(_xui.Color_White,__c.DipToCurrent((int) (2)),_xui.Color_Black,__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 609;BA.debugLine="Dim itemH As Int = 38dip";
_itemh = __c.DipToCurrent((int) (38));
 //BA.debugLineNum = 610;BA.debugLine="Dim headerH As Int = 35dip";
_headerh = __c.DipToCurrent((int) (35));
 //BA.debugLineNum = 611;BA.debugLine="Dim contentHeight As Int = (Items.Size * itemH) +";
_contentheight = (int) ((_items.getSize()*_itemh)+_headerh+__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 612;BA.debugLine="Dim MaxH As Int = Root.Height * 0.35";
_maxh = (int) (_root.getHeight()*0.35);
 //BA.debugLineNum = 613;BA.debugLine="Dim pH As Int = Min(contentHeight, MaxH)";
_ph = (int) (__c.Min(_contentheight,_maxh));
 //BA.debugLineNum = 614;BA.debugLine="Dim pW As Int = Min(200dip, Root.Width * 0.8)";
_pw = (int) (__c.Min(__c.DipToCurrent((int) (200)),_root.getWidth()*0.8));
 //BA.debugLineNum = 615;BA.debugLine="Dim TopPos As Int = (Root.Height - pH) / 2";
_toppos = (int) ((_root.getHeight()-_ph)/(double)2);
 //BA.debugLineNum = 616;BA.debugLine="Dim LeftPos As Int = (Root.Width - pW) / 2";
_leftpos = (int) ((_root.getWidth()-_pw)/(double)2);
 //BA.debugLineNum = 618;BA.debugLine="Root.AddView(GenericPopupPanel, LeftPos, TopPos,";
_root.AddView((android.view.View)(_genericpopuppanel.getObject()),_leftpos,_toppos,_pw,_ph);
 //BA.debugLineNum = 620;BA.debugLine="Dim lblHead As Label : lblHead.Initialize(\"\")";
_lblhead = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 620;BA.debugLine="Dim lblHead As Label : lblHead.Initialize(\"\")";
_lblhead.Initialize(ba,"");
 //BA.debugLineNum = 621;BA.debugLine="Dim xHead As B4XView = lblHead";
_xhead = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xhead = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblhead.getObject()));
 //BA.debugLineNum = 622;BA.debugLine="xHead.Text = Title";
_xhead.setText(BA.ObjectToCharSequence(_title));
 //BA.debugLineNum = 623;BA.debugLine="xHead.TextColor = xui.Color_Black";
_xhead.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 624;BA.debugLine="xHead.TextSize = 14";
_xhead.setTextSize((float) (14));
 //BA.debugLineNum = 625;BA.debugLine="lblHead.Typeface = Typeface.DEFAULT_BOLD";
_lblhead.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 626;BA.debugLine="xHead.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xhead.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 627;BA.debugLine="GenericPopupPanel.AddView(xHead, 0, 0, pW, header";
_genericpopuppanel.AddView((android.view.View)(_xhead.getObject()),(int) (0),(int) (0),_pw,_headerh);
 //BA.debugLineNum = 629;BA.debugLine="Dim clv As ScrollView : clv.Initialize(0)";
_clv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 629;BA.debugLine="Dim clv As ScrollView : clv.Initialize(0)";
_clv.Initialize(ba,(int) (0));
 //BA.debugLineNum = 630;BA.debugLine="GenericPopupPanel.AddView(clv, 5dip, headerH + 5d";
_genericpopuppanel.AddView((android.view.View)(_clv.getObject()),__c.DipToCurrent((int) (5)),(int) (_headerh+__c.DipToCurrent((int) (5))),(int) (_pw-__c.DipToCurrent((int) (10))),(int) (_ph-_headerh-__c.DipToCurrent((int) (10))));
 //BA.debugLineNum = 631;BA.debugLine="Dim top As Int = 0";
_top = (int) (0);
 //BA.debugLineNum = 633;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step26 = 1;
final int limit26 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit26 ;_i = _i + step26 ) {
 //BA.debugLineNum = 634;BA.debugLine="Dim lblItem As Label : lblItem.Initialize(\"Selec";
_lblitem = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 634;BA.debugLine="Dim lblItem As Label : lblItem.Initialize(\"Selec";
_lblitem.Initialize(ba,"SelectionItem");
 //BA.debugLineNum = 635;BA.debugLine="Dim xItem As B4XView = lblItem";
_xitem = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xitem = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblitem.getObject()));
 //BA.debugLineNum = 636;BA.debugLine="xItem.Text = Items.Get(i)";
_xitem.setText(BA.ObjectToCharSequence(_items.Get(_i)));
 //BA.debugLineNum = 637;BA.debugLine="xItem.TextColor = xui.Color_Black";
_xitem.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 638;BA.debugLine="xItem.TextSize = 13";
_xitem.setTextSize((float) (13));
 //BA.debugLineNum = 639;BA.debugLine="xItem.Tag = CreateMap(\"Val\": Items.Get(i), \"Type";
_xitem.setTag((Object)(__c.createMap(new Object[] {(Object)("Val"),_items.Get(_i),(Object)("Type"),(Object)(_requesttype)}).getObject()));
 //BA.debugLineNum = 640;BA.debugLine="lblItem.Gravity = Gravity.CENTER";
_lblitem.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 641;BA.debugLine="xItem.SetColorAndBorder(xui.Color_White, 1dip, 0";
_xitem.SetColorAndBorder(_xui.Color_White,__c.DipToCurrent((int) (1)),((int)0xffe0e0e0),(int) (0));
 //BA.debugLineNum = 642;BA.debugLine="clv.Panel.AddView(xItem, 0, top, clv.Width, item";
_clv.getPanel().AddView((android.view.View)(_xitem.getObject()),(int) (0),_top,_clv.getWidth(),_itemh);
 //BA.debugLineNum = 643;BA.debugLine="top = top + itemH";
_top = (int) (_top+_itemh);
 }
};
 //BA.debugLineNum = 645;BA.debugLine="clv.Panel.Height = top";
_clv.getPanel().setHeight(_top);
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return "";
}
public String  _showdailyschedule(anywheresoftware.b4a.objects.collections.List _appts) throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
String _time = "";
String _name = "";
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xt = null;
anywheresoftware.b4a.objects.LabelWrapper _lbln = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xn = null;
 //BA.debugLineNum = 194;BA.debugLine="Public Sub ShowDailySchedule(Appts As List)";
 //BA.debugLineNum = 195;BA.debugLine="If Root.IsInitialized = False Then Return";
if (_root.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 197;BA.debugLine="Log(\">>> [SearchPage] Showing Daily Schedule. Ite";
__c.LogImpl("010092547",">>> [SearchPage] Showing Daily Schedule. Items: "+BA.NumberToString(_appts.getSize()),0);
 //BA.debugLineNum = 198;BA.debugLine="PnlResults.Visible = False";
_pnlresults.setVisible(__c.False);
 //BA.debugLineNum = 199;BA.debugLine="clvSchedule.AsView.Visible = True";
_clvschedule._asview().setVisible(__c.True);
 //BA.debugLineNum = 200;BA.debugLine="clvSchedule.Clear";
_clvschedule._clear();
 //BA.debugLineNum = 202;BA.debugLine="If Appts.Size = 0 Then";
if (_appts.getSize()==0) { 
 //BA.debugLineNum = 203;BA.debugLine="xui.MsgboxAsync(\"No appointments found for this";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("No appointments found for this date."),BA.ObjectToCharSequence("Schedule"));
 //BA.debugLineNum = 204;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 207;BA.debugLine="For Each item As Map In Appts";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group10 = _appts;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group10.Get(index10)));
 //BA.debugLineNum = 208;BA.debugLine="Dim time As String = item.Get(\"Time\")";
_time = BA.ObjectToString(_item.Get((Object)("Time")));
 //BA.debugLineNum = 209;BA.debugLine="Dim name As String = item.Get(\"Name\")";
_name = BA.ObjectToString(_item.Get((Object)("Name")));
 //BA.debugLineNum = 211;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 212;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, clvSchedule.AsView.";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_clvschedule._asview().getWidth(),__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 213;BA.debugLine="p.Color = xui.Color_White";
_p.setColor(_xui.Color_White);
 //BA.debugLineNum = 215;BA.debugLine="Dim lblT As Label : lblT.Initialize(\"\")";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 215;BA.debugLine="Dim lblT As Label : lblT.Initialize(\"\")";
_lblt.Initialize(ba,"");
 //BA.debugLineNum = 216;BA.debugLine="Dim xT As B4XView = lblT";
_xt = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xt = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getObject()));
 //BA.debugLineNum = 217;BA.debugLine="xT.Text = time";
_xt.setText(BA.ObjectToCharSequence(_time));
 //BA.debugLineNum = 218;BA.debugLine="xT.TextSize = 14";
_xt.setTextSize((float) (14));
 //BA.debugLineNum = 219;BA.debugLine="xT.TextColor = xui.Color_DarkGray";
_xt.setTextColor(_xui.Color_DarkGray);
 //BA.debugLineNum = 220;BA.debugLine="p.AddView(xT, 10dip, 0, 80dip, 60dip)";
_p.AddView((android.view.View)(_xt.getObject()),__c.DipToCurrent((int) (10)),(int) (0),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 222;BA.debugLine="Dim lblN As Label : lblN.Initialize(\"\")";
_lbln = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 222;BA.debugLine="Dim lblN As Label : lblN.Initialize(\"\")";
_lbln.Initialize(ba,"");
 //BA.debugLineNum = 223;BA.debugLine="Dim xN As B4XView = lblN";
_xn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbln.getObject()));
 //BA.debugLineNum = 224;BA.debugLine="xN.Text = name";
_xn.setText(BA.ObjectToCharSequence(_name));
 //BA.debugLineNum = 225;BA.debugLine="xN.TextSize = 16";
_xn.setTextSize((float) (16));
 //BA.debugLineNum = 226;BA.debugLine="xN.TextColor = xui.Color_Blue";
_xn.setTextColor(_xui.Color_Blue);
 //BA.debugLineNum = 227;BA.debugLine="lblN.Typeface = Typeface.DEFAULT_BOLD";
_lbln.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 228;BA.debugLine="p.AddView(xN, 100dip, 0, p.Width - 110dip, 60dip";
_p.AddView((android.view.View)(_xn.getObject()),__c.DipToCurrent((int) (100)),(int) (0),(int) (_p.getWidth()-__c.DipToCurrent((int) (110))),__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 230;BA.debugLine="clvSchedule.Add(p, name)";
_clvschedule._add(_p,(Object)(_name));
 }
};
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
public String  _showprofile(anywheresoftware.b4a.objects.collections.Map _profile) throws Exception{
int _bgcolor = 0;
int _txtcolor = 0;
boolean _isblack = false;
boolean _ispref = false;
int _notesbgcolor = 0;
int _notestxtcolor = 0;
int _controlbgcolor = 0;
String _grouplabeltext = "";
int _grouplabelcolor = 0;
int _grouplabelsize = 0;
anywheresoftware.b4a.objects.ScrollViewWrapper _sv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnlin = null;
int _top = 0;
int _contentw = 0;
int _leftmargin = 0;
int _btnsize = 0;
int _btnleft = 0;
int _namewidth = 0;
int _badgewidth = 0;
int _gapstart = 0;
int _gapwidth = 0;
int _badgeleft = 0;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bdpressed = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bdenabled = null;
anywheresoftware.b4a.objects.drawable.StateListDrawable _sld = null;
anywheresoftware.b4a.objects.ButtonWrapper _btnappt = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xapptbtn = null;
anywheresoftware.b4j.object.JavaObject _jobtn = null;
float _zerofloat = 0f;
anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xname = null;
String _name1 = "";
String _name2 = "";
anywheresoftware.b4a.objects.LabelWrapper _lblgrp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xgrp = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
boolean _hasphone2 = false;
anywheresoftware.b4a.objects.LabelWrapper _lblphone = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xphone = null;
String _maskedphone = "";
anywheresoftware.b4a.objects.CSBuilder _csph = null;
anywheresoftware.b4a.objects.LabelWrapper _lblphone2 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xphone2 = null;
String _maskedphone2 = "";
anywheresoftware.b4a.objects.CSBuilder _csph2 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbladdr = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xaddr = null;
String _rawaddr = "";
String _cleanaddr = "";
anywheresoftware.b4a.objects.CSBuilder _csad = null;
anywheresoftware.b4a.objects.LabelWrapper _lblstats = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xstats = null;
String _tspend = "";
String _tvisits = "";
String _lastv = "";
String _line1 = "";
String _line2 = "";
anywheresoftware.b4a.objects.LabelWrapper _lhp = null;
anywheresoftware.b4a.objects.LabelWrapper _lgp = null;
String _currentgrp = "";
int _availableh = 0;
anywheresoftware.b4a.objects.LabelWrapper _templbl = null;
String _rawnotes = "";
anywheresoftware.b4a.objects.ButtonWrapper _btndismiss = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbtn = null;
 //BA.debugLineNum = 244;BA.debugLine="Public Sub ShowProfile(Profile As Map)";
 //BA.debugLineNum = 245;BA.debugLine="If Root.IsInitialized = False Then Return";
if (_root.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 247;BA.debugLine="Log(\">>> [SearchPage] ShowProfile called for: \" &";
__c.LogImpl("010223619",">>> [SearchPage] ShowProfile called for: "+BA.ObjectToString(_profile.GetDefault((Object)("Name"),(Object)("Unknown"))),0);
 //BA.debugLineNum = 248;BA.debugLine="CurrentProfile = Profile";
_currentprofile = _profile;
 //BA.debugLineNum = 249;BA.debugLine="clvSchedule.AsView.Visible = False";
_clvschedule._asview().setVisible(__c.False);
 //BA.debugLineNum = 250;BA.debugLine="PnlResults.Visible = True";
_pnlresults.setVisible(__c.True);
 //BA.debugLineNum = 251;BA.debugLine="PnlResults.RemoveAllViews";
_pnlresults.RemoveAllViews();
 //BA.debugLineNum = 254;BA.debugLine="Dim bgColor, txtColor As Int";
_bgcolor = 0;
_txtcolor = 0;
 //BA.debugLineNum = 255;BA.debugLine="Dim isBlack As Boolean = Profile.Get(\"IsBlacklist";
_isblack = BA.ObjectToBoolean(_profile.Get((Object)("IsBlacklisted")));
 //BA.debugLineNum = 256;BA.debugLine="Dim isPref As Boolean = Profile.Get(\"IsPreferred\"";
_ispref = BA.ObjectToBoolean(_profile.Get((Object)("IsPreferred")));
 //BA.debugLineNum = 257;BA.debugLine="Dim notesBgColor As Int = xui.Color_LightGray";
_notesbgcolor = _xui.Color_LightGray;
 //BA.debugLineNum = 258;BA.debugLine="Dim notesTxtColor As Int = xui.Color_Black";
_notestxtcolor = _xui.Color_Black;
 //BA.debugLineNum = 259;BA.debugLine="Dim controlBgColor As Int = xui.Color_LightGray";
_controlbgcolor = _xui.Color_LightGray;
 //BA.debugLineNum = 262;BA.debugLine="Dim GroupLabelText As String = \"Standard\" & CRLF";
_grouplabeltext = "Standard"+__c.CRLF+"Client";
 //BA.debugLineNum = 263;BA.debugLine="Dim GroupLabelColor As Int = xui.Color_DarkGray";
_grouplabelcolor = _xui.Color_DarkGray;
 //BA.debugLineNum = 264;BA.debugLine="Dim GroupLabelSize As Int = 24";
_grouplabelsize = (int) (24);
 //BA.debugLineNum = 266;BA.debugLine="If isBlack Then";
if (_isblack) { 
 //BA.debugLineNum = 267;BA.debugLine="bgColor = xui.Color_Red : txtColor = xui.Color_W";
_bgcolor = _xui.Color_Red;
 //BA.debugLineNum = 267;BA.debugLine="bgColor = xui.Color_Red : txtColor = xui.Color_W";
_txtcolor = _xui.Color_White;
 //BA.debugLineNum = 268;BA.debugLine="notesBgColor = xui.Color_Black : notesTxtColor =";
_notesbgcolor = _xui.Color_Black;
 //BA.debugLineNum = 268;BA.debugLine="notesBgColor = xui.Color_Black : notesTxtColor =";
_notestxtcolor = _xui.Color_White;
 //BA.debugLineNum = 269;BA.debugLine="controlBgColor = xui.Color_Red";
_controlbgcolor = _xui.Color_Red;
 //BA.debugLineNum = 270;BA.debugLine="GroupLabelText = \"Blacklisted\" & CRLF & \"Client\"";
_grouplabeltext = "Blacklisted"+__c.CRLF+"Client";
 //BA.debugLineNum = 271;BA.debugLine="GroupLabelColor = xui.Color_Black";
_grouplabelcolor = _xui.Color_Black;
 }else if(_ispref) { 
 //BA.debugLineNum = 273;BA.debugLine="bgColor = 0xFFF9E076 : txtColor = xui.Color_Blac";
_bgcolor = ((int)0xfff9e076);
 //BA.debugLineNum = 273;BA.debugLine="bgColor = 0xFFF9E076 : txtColor = xui.Color_Blac";
_txtcolor = _xui.Color_Black;
 //BA.debugLineNum = 274;BA.debugLine="GroupLabelText = \"Preferred\" & CRLF & \"Client\"";
_grouplabeltext = "Preferred"+__c.CRLF+"Client";
 //BA.debugLineNum = 275;BA.debugLine="GroupLabelColor = xui.Color_Black";
_grouplabelcolor = _xui.Color_Black;
 }else {
 //BA.debugLineNum = 277;BA.debugLine="bgColor = xui.Color_White : txtColor = xui.Color";
_bgcolor = _xui.Color_White;
 //BA.debugLineNum = 277;BA.debugLine="bgColor = xui.Color_White : txtColor = xui.Color";
_txtcolor = _xui.Color_Black;
 //BA.debugLineNum = 278;BA.debugLine="GroupLabelText = \"Standard\" & CRLF & \"Client\"";
_grouplabeltext = "Standard"+__c.CRLF+"Client";
 //BA.debugLineNum = 279;BA.debugLine="GroupLabelColor = 0xFF444444";
_grouplabelcolor = ((int)0xff444444);
 };
 //BA.debugLineNum = 282;BA.debugLine="If Root.Width < 450dip Then GroupLabelSize = 18";
if (_root.getWidth()<__c.DipToCurrent((int) (450))) { 
_grouplabelsize = (int) (18);};
 //BA.debugLineNum = 285;BA.debugLine="Dim sv As ScrollView : sv.Initialize(0)";
_sv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 285;BA.debugLine="Dim sv As ScrollView : sv.Initialize(0)";
_sv.Initialize(ba,(int) (0));
 //BA.debugLineNum = 286;BA.debugLine="Dim PnlIn As B4XView = sv.Panel";
_pnlin = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlin = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sv.getPanel().getObject()));
 //BA.debugLineNum = 287;BA.debugLine="PnlIn.Color = bgColor";
_pnlin.setColor(_bgcolor);
 //BA.debugLineNum = 288;BA.debugLine="PnlResults.AddView(sv, 0, 0, PnlResults.Width, Pn";
_pnlresults.AddView((android.view.View)(_sv.getObject()),(int) (0),(int) (0),_pnlresults.getWidth(),_pnlresults.getHeight());
 //BA.debugLineNum = 290;BA.debugLine="Dim top As Int = 0dip";
_top = __c.DipToCurrent((int) (0));
 //BA.debugLineNum = 291;BA.debugLine="Dim contentW As Int = PnlResults.Width - 20dip";
_contentw = (int) (_pnlresults.getWidth()-__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 292;BA.debugLine="Dim leftMargin As Int = 10dip";
_leftmargin = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 295;BA.debugLine="Dim btnSize As Int = 135dip";
_btnsize = __c.DipToCurrent((int) (135));
 //BA.debugLineNum = 296;BA.debugLine="Dim BtnLeft As Int = PnlResults.Width - btnSize -";
_btnleft = (int) (_pnlresults.getWidth()-_btnsize-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 299;BA.debugLine="Dim NameWidth As Int = Root.Width * 0.50";
_namewidth = (int) (_root.getWidth()*0.50);
 //BA.debugLineNum = 302;BA.debugLine="Dim BadgeWidth As Int = 140dip";
_badgewidth = __c.DipToCurrent((int) (140));
 //BA.debugLineNum = 305;BA.debugLine="Dim GapStart As Int = leftMargin + NameWidth";
_gapstart = (int) (_leftmargin+_namewidth);
 //BA.debugLineNum = 306;BA.debugLine="Dim GapWidth As Int = BtnLeft - GapStart";
_gapwidth = (int) (_btnleft-_gapstart);
 //BA.debugLineNum = 309;BA.debugLine="Dim BadgeLeft As Int = GapStart + (GapWidth / 2)";
_badgeleft = (int) (_gapstart+(_gapwidth/(double)2)-(_badgewidth/(double)2)-__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 312;BA.debugLine="Dim bdPressed As BitmapDrawable";
_bdpressed = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
 //BA.debugLineNum = 313;BA.debugLine="bdPressed.Initialize(LoadBitmap(File.DirAssets, \"";
_bdpressed.Initialize((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"Schedule Button down position.png").getObject()));
 //BA.debugLineNum = 315;BA.debugLine="Dim bdEnabled As BitmapDrawable";
_bdenabled = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
 //BA.debugLineNum = 316;BA.debugLine="bdEnabled.Initialize(LoadBitmap(File.DirAssets, \"";
_bdenabled.Initialize((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"Schedule Button up position.png").getObject()));
 //BA.debugLineNum = 318;BA.debugLine="Dim sld As StateListDrawable";
_sld = new anywheresoftware.b4a.objects.drawable.StateListDrawable();
 //BA.debugLineNum = 319;BA.debugLine="sld.Initialize";
_sld.Initialize();
 //BA.debugLineNum = 320;BA.debugLine="sld.AddState(sld.State_Pressed, bdPressed)";
_sld.AddState(_sld.State_Pressed,(android.graphics.drawable.Drawable)(_bdpressed.getObject()));
 //BA.debugLineNum = 321;BA.debugLine="sld.AddState(sld.State_Enabled, bdEnabled)";
_sld.AddState(_sld.State_Enabled,(android.graphics.drawable.Drawable)(_bdenabled.getObject()));
 //BA.debugLineNum = 323;BA.debugLine="Dim btnAppt As Button : btnAppt.Initialize(\"btnCr";
_btnappt = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 323;BA.debugLine="Dim btnAppt As Button : btnAppt.Initialize(\"btnCr";
_btnappt.Initialize(ba,"btnCreateAppt");
 //BA.debugLineNum = 324;BA.debugLine="Dim xApptBtn As B4XView = btnAppt";
_xapptbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xapptbtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btnappt.getObject()));
 //BA.debugLineNum = 325;BA.debugLine="xApptBtn.Color = xui.Color_Transparent";
_xapptbtn.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 326;BA.debugLine="btnAppt.Background = sld";
_btnappt.setBackground((android.graphics.drawable.Drawable)(_sld.getObject()));
 //BA.debugLineNum = 329;BA.debugLine="Dim joBtn As JavaObject = btnAppt";
_jobtn = new anywheresoftware.b4j.object.JavaObject();
_jobtn = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_btnappt.getObject()));
 //BA.debugLineNum = 330;BA.debugLine="Dim ZeroFloat As Float = 0";
_zerofloat = (float) (0);
 //BA.debugLineNum = 331;BA.debugLine="joBtn.RunMethod(\"setElevation\", Array(ZeroFloat))";
_jobtn.RunMethod("setElevation",new Object[]{(Object)(_zerofloat)});
 //BA.debugLineNum = 332;BA.debugLine="joBtn.RunMethod(\"setStateListAnimator\", Array(Nul";
_jobtn.RunMethod("setStateListAnimator",new Object[]{__c.Null});
 //BA.debugLineNum = 335;BA.debugLine="PnlIn.AddView(btnAppt, BtnLeft, top, btnSize, btn";
_pnlin.AddView((android.view.View)(_btnappt.getObject()),_btnleft,_top,_btnsize,_btnsize);
 //BA.debugLineNum = 338;BA.debugLine="Dim lblName As Label : lblName.Initialize(\"\")";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 338;BA.debugLine="Dim lblName As Label : lblName.Initialize(\"\")";
_lblname.Initialize(ba,"");
 //BA.debugLineNum = 339;BA.debugLine="Dim xName As B4XView = lblName";
_xname = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xname = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblname.getObject()));
 //BA.debugLineNum = 340;BA.debugLine="lblName.Typeface = LoadSafeFont(\"search - name.tt";
_lblname.setTypeface((android.graphics.Typeface)(_loadsafefont("search - name.ttf").getObject()));
 //BA.debugLineNum = 341;BA.debugLine="xName.TextColor = txtColor";
_xname.setTextColor(_txtcolor);
 //BA.debugLineNum = 343;BA.debugLine="Dim name1 As String = Profile.GetDefault(\"Name\",";
_name1 = (BA.ObjectToString(_profile.GetDefault((Object)("Name"),(Object)("")))).toUpperCase();
 //BA.debugLineNum = 344;BA.debugLine="Dim name2 As String = Profile.GetDefault(\"Name2\",";
_name2 = (BA.ObjectToString(_profile.GetDefault((Object)("Name2"),(Object)("")))).toUpperCase();
 //BA.debugLineNum = 346;BA.debugLine="If name2 <> \"\" Then";
if ((_name2).equals("") == false) { 
 //BA.debugLineNum = 347;BA.debugLine="xName.Text = name1 & CRLF & name2";
_xname.setText(BA.ObjectToCharSequence(_name1+__c.CRLF+_name2));
 //BA.debugLineNum = 348;BA.debugLine="xName.TextSize = 22.5 ' Half of 45";
_xname.setTextSize((float) (22.5));
 //BA.debugLineNum = 349;BA.debugLine="lblName.SingleLine = False";
_lblname.setSingleLine(__c.False);
 }else {
 //BA.debugLineNum = 351;BA.debugLine="xName.Text = name1";
_xname.setText(BA.ObjectToCharSequence(_name1));
 //BA.debugLineNum = 352;BA.debugLine="xName.TextSize = 45";
_xname.setTextSize((float) (45));
 //BA.debugLineNum = 353;BA.debugLine="lblName.SingleLine = True";
_lblname.setSingleLine(__c.True);
 };
 //BA.debugLineNum = 356;BA.debugLine="PnlIn.AddView(xName, leftMargin, top + 10dip, Nam";
_pnlin.AddView((android.view.View)(_xname.getObject()),_leftmargin,(int) (_top+__c.DipToCurrent((int) (10))),_namewidth,__c.DipToCurrent((int) (120)));
 //BA.debugLineNum = 357;BA.debugLine="xName.SendToBack";
_xname.SendToBack();
 //BA.debugLineNum = 360;BA.debugLine="Dim lblGrp As Label : lblGrp.Initialize(\"\")";
_lblgrp = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 360;BA.debugLine="Dim lblGrp As Label : lblGrp.Initialize(\"\")";
_lblgrp.Initialize(ba,"");
 //BA.debugLineNum = 361;BA.debugLine="Dim xGrp As B4XView = lblGrp";
_xgrp = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xgrp = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblgrp.getObject()));
 //BA.debugLineNum = 362;BA.debugLine="xGrp.Text = GroupLabelText";
_xgrp.setText(BA.ObjectToCharSequence(_grouplabeltext));
 //BA.debugLineNum = 363;BA.debugLine="xGrp.TextSize = GroupLabelSize";
_xgrp.setTextSize((float) (_grouplabelsize));
 //BA.debugLineNum = 364;BA.debugLine="lblGrp.Typeface = LoadSafeFont(\"search - client g";
_lblgrp.setTypeface((android.graphics.Typeface)(_loadsafefont("search - client group.ttf").getObject()));
 //BA.debugLineNum = 365;BA.debugLine="xGrp.TextColor = GroupLabelColor";
_xgrp.setTextColor(_grouplabelcolor);
 //BA.debugLineNum = 367;BA.debugLine="Dim jo As JavaObject = lblGrp";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_lblgrp.getObject()));
 //BA.debugLineNum = 368;BA.debugLine="jo.RunMethod(\"setShadowLayer\", Array(10.0f, 0.0f,";
_jo.RunMethod("setShadowLayer",new Object[]{(Object)(10.0f),(Object)(0.0f),(Object)(0.0f),(Object)(_xui.Color_White)});
 //BA.debugLineNum = 370;BA.debugLine="xGrp.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xgrp.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 371;BA.debugLine="PnlIn.AddView(xGrp, BadgeLeft, top + 10dip, Badge";
_pnlin.AddView((android.view.View)(_xgrp.getObject()),_badgeleft,(int) (_top+__c.DipToCurrent((int) (10))),_badgewidth,__c.DipToCurrent((int) (80)));
 //BA.debugLineNum = 372;BA.debugLine="xGrp.BringToFront";
_xgrp.BringToFront();
 //BA.debugLineNum = 374;BA.debugLine="top = top + 130dip";
_top = (int) (_top+__c.DipToCurrent((int) (130)));
 //BA.debugLineNum = 377;BA.debugLine="Dim hasPhone2 As Boolean = Profile.ContainsKey(\"P";
_hasphone2 = _profile.ContainsKey((Object)("Phone2")) && (_profile.GetDefault((Object)("Phone2"),(Object)(""))).equals((Object)("")) == false;
 //BA.debugLineNum = 379;BA.debugLine="Dim lblPhone As Label : lblPhone.Initialize(\"lblP";
_lblphone = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 379;BA.debugLine="Dim lblPhone As Label : lblPhone.Initialize(\"lblP";
_lblphone.Initialize(ba,"lblPhone");
 //BA.debugLineNum = 380;BA.debugLine="Dim xPhone As B4XView = lblPhone";
_xphone = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xphone = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblphone.getObject()));
 //BA.debugLineNum = 381;BA.debugLine="Dim MaskedPhone As String = FormatPhone(Profile.G";
_maskedphone = _formatphone(BA.ObjectToString(_profile.Get((Object)("Phone"))));
 //BA.debugLineNum = 382;BA.debugLine="Dim csPh As CSBuilder";
_csph = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 383;BA.debugLine="csPh.Initialize.Typeface(Typeface.FONTAWESOME).Ap";
_csph.Initialize().Typeface(__c.Typeface.getFONTAWESOME()).Append(BA.ObjectToCharSequence(BA.ObjectToString(__c.Chr(((int)0xf095)))+"  ")).Typeface(__c.Typeface.DEFAULT).Append(BA.ObjectToCharSequence(_maskedphone)).PopAll();
 //BA.debugLineNum = 384;BA.debugLine="xPhone.Text = csPh";
_xphone.setText(BA.ObjectToCharSequence(_csph.getObject()));
 //BA.debugLineNum = 385;BA.debugLine="xPhone.TextSize = 18";
_xphone.setTextSize((float) (18));
 //BA.debugLineNum = 386;BA.debugLine="If isBlack Then xPhone.TextColor = xui.Color_Yell";
if (_isblack) { 
_xphone.setTextColor(_xui.Color_Yellow);}
else {
_xphone.setTextColor(((int)0xff0000ff));};
 //BA.debugLineNum = 388;BA.debugLine="If hasPhone2 Then";
if (_hasphone2) { 
 //BA.debugLineNum = 389;BA.debugLine="Dim lblPhone2 As Label : lblPhone2.Initialize(\"l";
_lblphone2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 389;BA.debugLine="Dim lblPhone2 As Label : lblPhone2.Initialize(\"l";
_lblphone2.Initialize(ba,"lblPhone2");
 //BA.debugLineNum = 390;BA.debugLine="Dim xPhone2 As B4XView = lblPhone2";
_xphone2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xphone2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblphone2.getObject()));
 //BA.debugLineNum = 391;BA.debugLine="Dim MaskedPhone2 As String = FormatPhone(Profile";
_maskedphone2 = _formatphone(BA.ObjectToString(_profile.Get((Object)("Phone2"))));
 //BA.debugLineNum = 392;BA.debugLine="Dim csPh2 As CSBuilder";
_csph2 = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 394;BA.debugLine="csPh2.Initialize.Color(xui.Color_Blue).Typeface(";
_csph2.Initialize().Color(_xui.Color_Blue).Typeface(__c.Typeface.getFONTAWESOME()).Append(BA.ObjectToCharSequence(BA.ObjectToString(__c.Chr(((int)0xf015)))+"  ")).Pop().Typeface(__c.Typeface.DEFAULT).Append(BA.ObjectToCharSequence(_maskedphone2)).PopAll();
 //BA.debugLineNum = 395;BA.debugLine="xPhone2.Text = csPh2";
_xphone2.setText(BA.ObjectToCharSequence(_csph2.getObject()));
 //BA.debugLineNum = 396;BA.debugLine="xPhone2.TextSize = 18";
_xphone2.setTextSize((float) (18));
 //BA.debugLineNum = 397;BA.debugLine="If isBlack Then xPhone2.TextColor = xui.Color_Ye";
if (_isblack) { 
_xphone2.setTextColor(_xui.Color_Yellow);}
else {
_xphone2.setTextColor(((int)0xff0000ff));};
 //BA.debugLineNum = 401;BA.debugLine="If Root.Width < 850dip Or B4XPages.MainPage.Last";
if (_root.getWidth()<__c.DipToCurrent((int) (850)) || (_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)._lastfoldstate /*String*/ ).equals("HALF_OPENED")) { 
 //BA.debugLineNum = 403;BA.debugLine="PnlIn.AddView(xPhone, leftMargin, top, contentW";
_pnlin.AddView((android.view.View)(_xphone.getObject()),_leftmargin,_top,_contentw,__c.DipToCurrent((int) (35)));
 //BA.debugLineNum = 404;BA.debugLine="top = top + 35dip";
_top = (int) (_top+__c.DipToCurrent((int) (35)));
 //BA.debugLineNum = 405;BA.debugLine="PnlIn.AddView(xPhone2, leftMargin, top, content";
_pnlin.AddView((android.view.View)(_xphone2.getObject()),_leftmargin,_top,_contentw,__c.DipToCurrent((int) (35)));
 //BA.debugLineNum = 406;BA.debugLine="top = top + 40dip";
_top = (int) (_top+__c.DipToCurrent((int) (40)));
 }else {
 //BA.debugLineNum = 409;BA.debugLine="PnlIn.AddView(xPhone, leftMargin, top, contentW";
_pnlin.AddView((android.view.View)(_xphone.getObject()),_leftmargin,_top,(int) (_contentw/(double)2),__c.DipToCurrent((int) (35)));
 //BA.debugLineNum = 410;BA.debugLine="PnlIn.AddView(xPhone2, leftMargin + (contentW /";
_pnlin.AddView((android.view.View)(_xphone2.getObject()),(int) (_leftmargin+(_contentw/(double)2)),_top,(int) (_contentw/(double)2),__c.DipToCurrent((int) (35)));
 //BA.debugLineNum = 411;BA.debugLine="top = top + 40dip";
_top = (int) (_top+__c.DipToCurrent((int) (40)));
 };
 }else {
 //BA.debugLineNum = 415;BA.debugLine="PnlIn.AddView(xPhone, leftMargin, top, contentW,";
_pnlin.AddView((android.view.View)(_xphone.getObject()),_leftmargin,_top,_contentw,__c.DipToCurrent((int) (35)));
 //BA.debugLineNum = 416;BA.debugLine="top = top + 40dip";
_top = (int) (_top+__c.DipToCurrent((int) (40)));
 };
 //BA.debugLineNum = 420;BA.debugLine="Dim lblAddr As Label : lblAddr.Initialize(\"lblAdd";
_lbladdr = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 420;BA.debugLine="Dim lblAddr As Label : lblAddr.Initialize(\"lblAdd";
_lbladdr.Initialize(ba,"lblAddr");
 //BA.debugLineNum = 421;BA.debugLine="Dim xAddr As B4XView = lblAddr";
_xaddr = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xaddr = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbladdr.getObject()));
 //BA.debugLineNum = 422;BA.debugLine="Dim rawAddr As String = Profile.Get(\"Address\")";
_rawaddr = BA.ObjectToString(_profile.Get((Object)("Address")));
 //BA.debugLineNum = 423;BA.debugLine="Dim cleanAddr As String = CleanAddress(rawAddr)";
_cleanaddr = _cleanaddress(_rawaddr);
 //BA.debugLineNum = 424;BA.debugLine="Dim csAd As CSBuilder";
_csad = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 425;BA.debugLine="csAd.Initialize.Typeface(Typeface.FONTAWESOME).Ap";
_csad.Initialize().Typeface(__c.Typeface.getFONTAWESOME()).Append(BA.ObjectToCharSequence(BA.ObjectToString(__c.Chr(((int)0xf041)))+"  ")).Typeface(__c.Typeface.DEFAULT).Append(BA.ObjectToCharSequence(_cleanaddr)).PopAll();
 //BA.debugLineNum = 426;BA.debugLine="xAddr.Text = csAd";
_xaddr.setText(BA.ObjectToCharSequence(_csad.getObject()));
 //BA.debugLineNum = 427;BA.debugLine="xAddr.TextSize = 18";
_xaddr.setTextSize((float) (18));
 //BA.debugLineNum = 428;BA.debugLine="lblAddr.SingleLine = True";
_lbladdr.setSingleLine(__c.True);
 //BA.debugLineNum = 429;BA.debugLine="lblAddr.Ellipsize = \"END\"";
_lbladdr.setEllipsize("END");
 //BA.debugLineNum = 430;BA.debugLine="If isBlack Then xAddr.TextColor = xui.Color_Yello";
if (_isblack) { 
_xaddr.setTextColor(_xui.Color_Yellow);}
else {
_xaddr.setTextColor(((int)0xff0000ff));};
 //BA.debugLineNum = 431;BA.debugLine="PnlIn.AddView(xAddr, leftMargin, top, contentW, 3";
_pnlin.AddView((android.view.View)(_xaddr.getObject()),_leftmargin,_top,_contentw,__c.DipToCurrent((int) (35)));
 //BA.debugLineNum = 432;BA.debugLine="top = top + 45dip";
_top = (int) (_top+__c.DipToCurrent((int) (45)));
 //BA.debugLineNum = 435;BA.debugLine="Dim lblStats As Label : lblStats.Initialize(\"\")";
_lblstats = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 435;BA.debugLine="Dim lblStats As Label : lblStats.Initialize(\"\")";
_lblstats.Initialize(ba,"");
 //BA.debugLineNum = 436;BA.debugLine="Dim xStats As B4XView = lblStats";
_xstats = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xstats = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblstats.getObject()));
 //BA.debugLineNum = 437;BA.debugLine="Dim tSpend As String = Profile.Get(\"TotalSpend\")";
_tspend = BA.ObjectToString(_profile.Get((Object)("TotalSpend")));
 //BA.debugLineNum = 438;BA.debugLine="Dim tVisits As String = Profile.Get(\"VisitCount\")";
_tvisits = BA.ObjectToString(_profile.Get((Object)("VisitCount")));
 //BA.debugLineNum = 439;BA.debugLine="Dim lastV As String = Profile.Get(\"LastVisit\")";
_lastv = BA.ObjectToString(_profile.Get((Object)("LastVisit")));
 //BA.debugLineNum = 441;BA.debugLine="Dim line1 As String = \"Total Spent: $\" & tSpend &";
_line1 = "Total Spent: $"+_tspend+" | Time: 0:00hrs | Avg: $0.00/Hr";
 //BA.debugLineNum = 442;BA.debugLine="Dim line2 As String = \"Total Visits: \" & tVisits";
_line2 = "Total Visits: "+_tvisits+" | Last Visit: "+_lastv;
 //BA.debugLineNum = 443;BA.debugLine="xStats.Text = line1 & CRLF & line2";
_xstats.setText(BA.ObjectToCharSequence(_line1+__c.CRLF+_line2));
 //BA.debugLineNum = 444;BA.debugLine="xStats.TextSize = 21 ' [CHANGED] Reduced from 23";
_xstats.setTextSize((float) (21));
 //BA.debugLineNum = 446;BA.debugLine="lblStats.Typeface = LoadSafeFont(\"search - stats.";
_lblstats.setTypeface((android.graphics.Typeface)(_loadsafefont("search - stats.ttf").getObject()));
 //BA.debugLineNum = 447;BA.debugLine="xStats.TextColor = txtColor";
_xstats.setTextColor(_txtcolor);
 //BA.debugLineNum = 448;BA.debugLine="PnlIn.AddView(xStats, leftMargin, top, contentW,";
_pnlin.AddView((android.view.View)(_xstats.getObject()),_leftmargin,_top,_contentw,__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 449;BA.debugLine="top = top + 110dip";
_top = (int) (_top+__c.DipToCurrent((int) (110)));
 //BA.debugLineNum = 452;BA.debugLine="PnlIn.AddView(CreateLabelHeader(\"History:\", txtCo";
_pnlin.AddView((android.view.View)(_createlabelheader("History:",_txtcolor).getObject()),_leftmargin,_top,_contentw,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 453;BA.debugLine="top = top + 40dip";
_top = (int) (_top+__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 455;BA.debugLine="Dim lhp As Label : lhp.Initialize(\"lblHistoryPick";
_lhp = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 455;BA.debugLine="Dim lhp As Label : lhp.Initialize(\"lblHistoryPick";
_lhp.Initialize(ba,"lblHistoryPicker");
 //BA.debugLineNum = 456;BA.debugLine="lblHistoryPicker = lhp";
_lblhistorypicker = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lhp.getObject()));
 //BA.debugLineNum = 457;BA.debugLine="lblHistoryPicker.Text = \" View History...\"";
_lblhistorypicker.setText(BA.ObjectToCharSequence(" View History..."));
 //BA.debugLineNum = 458;BA.debugLine="lblHistoryPicker.TextSize = 14";
_lblhistorypicker.setTextSize((float) (14));
 //BA.debugLineNum = 459;BA.debugLine="lblHistoryPicker.TextColor = txtColor";
_lblhistorypicker.setTextColor(_txtcolor);
 //BA.debugLineNum = 460;BA.debugLine="lblHistoryPicker.SetColorAndBorder(controlBgColor";
_lblhistorypicker.SetColorAndBorder(_controlbgcolor,__c.DipToCurrent((int) (2)),_xui.Color_DarkGray,__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 461;BA.debugLine="PnlIn.AddView(lblHistoryPicker, leftMargin, top,";
_pnlin.AddView((android.view.View)(_lblhistorypicker.getObject()),_leftmargin,_top,_contentw,__c.DipToCurrent((int) (45)));
 //BA.debugLineNum = 462;BA.debugLine="top = top + 55dip";
_top = (int) (_top+__c.DipToCurrent((int) (55)));
 //BA.debugLineNum = 465;BA.debugLine="PnlIn.AddView(CreateLabelHeader(\"Member of Group:";
_pnlin.AddView((android.view.View)(_createlabelheader("Member of Group:",_txtcolor).getObject()),_leftmargin,_top,_contentw,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 466;BA.debugLine="top = top + 40dip";
_top = (int) (_top+__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 468;BA.debugLine="Dim lgp As Label : lgp.Initialize(\"lblGroupPicker";
_lgp = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 468;BA.debugLine="Dim lgp As Label : lgp.Initialize(\"lblGroupPicker";
_lgp.Initialize(ba,"lblGroupPicker");
 //BA.debugLineNum = 469;BA.debugLine="lblGroupPicker = lgp";
_lblgrouppicker = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lgp.getObject()));
 //BA.debugLineNum = 470;BA.debugLine="Dim currentGrp As String = \"Client\"";
_currentgrp = "Client";
 //BA.debugLineNum = 471;BA.debugLine="If isBlack Then";
if (_isblack) { 
 //BA.debugLineNum = 472;BA.debugLine="currentGrp = \"Blacklisted\"";
_currentgrp = "Blacklisted";
 }else if(_ispref) { 
 //BA.debugLineNum = 474;BA.debugLine="currentGrp = \"Preferred\"";
_currentgrp = "Preferred";
 }else {
 //BA.debugLineNum = 476;BA.debugLine="currentGrp = \"Client\"";
_currentgrp = "Client";
 };
 //BA.debugLineNum = 478;BA.debugLine="lblGroupPicker.Tag = currentGrp";
_lblgrouppicker.setTag((Object)(_currentgrp));
 //BA.debugLineNum = 479;BA.debugLine="lblGroupPicker.Text = \" Group: \" & currentGrp";
_lblgrouppicker.setText(BA.ObjectToCharSequence(" Group: "+_currentgrp));
 //BA.debugLineNum = 480;BA.debugLine="lblGroupPicker.TextSize = 14";
_lblgrouppicker.setTextSize((float) (14));
 //BA.debugLineNum = 481;BA.debugLine="lblGroupPicker.TextColor = txtColor";
_lblgrouppicker.setTextColor(_txtcolor);
 //BA.debugLineNum = 482;BA.debugLine="lblGroupPicker.SetColorAndBorder(controlBgColor,";
_lblgrouppicker.SetColorAndBorder(_controlbgcolor,__c.DipToCurrent((int) (2)),_xui.Color_DarkGray,__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 483;BA.debugLine="PnlIn.AddView(lblGroupPicker, leftMargin, top, co";
_pnlin.AddView((android.view.View)(_lblgrouppicker.getObject()),_leftmargin,_top,_contentw,__c.DipToCurrent((int) (45)));
 //BA.debugLineNum = 484;BA.debugLine="top = top + 55dip";
_top = (int) (_top+__c.DipToCurrent((int) (55)));
 //BA.debugLineNum = 487;BA.debugLine="PnlIn.AddView(CreateLabelHeader(\"Visit & Client N";
_pnlin.AddView((android.view.View)(_createlabelheader("Visit & Client Notes:",_txtcolor).getObject()),_leftmargin,_top,_contentw,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 488;BA.debugLine="top = top + 40dip";
_top = (int) (_top+__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 490;BA.debugLine="Dim AvailableH As Int = PnlResults.Height - top -";
_availableh = (int) (_pnlresults.getHeight()-_top-__c.DipToCurrent((int) (70)));
 //BA.debugLineNum = 491;BA.debugLine="If AvailableH < 150dip Then AvailableH = 150dip";
if (_availableh<__c.DipToCurrent((int) (150))) { 
_availableh = __c.DipToCurrent((int) (150));};
 //BA.debugLineNum = 493;BA.debugLine="Dim tempLbl As Label : tempLbl.Initialize(\"lblSer";
_templbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 493;BA.debugLine="Dim tempLbl As Label : tempLbl.Initialize(\"lblSer";
_templbl.Initialize(ba,"lblServiceNotes");
 //BA.debugLineNum = 494;BA.debugLine="lblServiceNotes = tempLbl";
_lblservicenotes = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_templbl.getObject()));
 //BA.debugLineNum = 496;BA.debugLine="Dim RawNotes As String = Profile.Get(\"Notes\")";
_rawnotes = BA.ObjectToString(_profile.Get((Object)("Notes")));
 //BA.debugLineNum = 497;BA.debugLine="RawNotes = Regex.Replace(\"(?i)Created via GeekGod";
_rawnotes = __c.Regex.Replace("(?i)Created via GeekGod App[^\\n\\r]*",_rawnotes,"");
 //BA.debugLineNum = 498;BA.debugLine="RawNotes = RawNotes.Trim";
_rawnotes = _rawnotes.trim();
 //BA.debugLineNum = 500;BA.debugLine="lblServiceNotes.Text = RawNotes";
_lblservicenotes.setText(BA.ObjectToCharSequence(_rawnotes));
 //BA.debugLineNum = 501;BA.debugLine="lblServiceNotes.TextSize = 14";
_lblservicenotes.setTextSize((float) (14));
 //BA.debugLineNum = 502;BA.debugLine="lblServiceNotes.TextColor = notesTxtColor";
_lblservicenotes.setTextColor(_notestxtcolor);
 //BA.debugLineNum = 503;BA.debugLine="tempLbl.Typeface = Typeface.MONOSPACE";
_templbl.setTypeface(__c.Typeface.MONOSPACE);
 //BA.debugLineNum = 504;BA.debugLine="lblServiceNotes.SetColorAndBorder(notesBgColor, 2";
_lblservicenotes.SetColorAndBorder(_notesbgcolor,__c.DipToCurrent((int) (2)),_xui.Color_DarkGray,__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 505;BA.debugLine="PnlIn.AddView(lblServiceNotes, leftMargin, top, c";
_pnlin.AddView((android.view.View)(_lblservicenotes.getObject()),_leftmargin,_top,_contentw,_availableh);
 //BA.debugLineNum = 506;BA.debugLine="top = top + 10dip + AvailableH";
_top = (int) (_top+__c.DipToCurrent((int) (10))+_availableh);
 //BA.debugLineNum = 509;BA.debugLine="Dim btnDismiss As Button : btnDismiss.Initialize(";
_btndismiss = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 509;BA.debugLine="Dim btnDismiss As Button : btnDismiss.Initialize(";
_btndismiss.Initialize(ba,"btnDismiss");
 //BA.debugLineNum = 510;BA.debugLine="Dim xbtn As B4XView = btnDismiss";
_xbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btndismiss.getObject()));
 //BA.debugLineNum = 511;BA.debugLine="xbtn.Text = \"SAVE & CLOSE\"";
_xbtn.setText(BA.ObjectToCharSequence("SAVE & CLOSE"));
 //BA.debugLineNum = 512;BA.debugLine="xbtn.Color = xui.Color_DarkGray";
_xbtn.setColor(_xui.Color_DarkGray);
 //BA.debugLineNum = 513;BA.debugLine="xbtn.TextColor = xui.Color_White";
_xbtn.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 514;BA.debugLine="PnlIn.AddView(xbtn, leftMargin, top, contentW, 50";
_pnlin.AddView((android.view.View)(_xbtn.getObject()),_leftmargin,_top,_contentw,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 515;BA.debugLine="top = top + 60dip";
_top = (int) (_top+__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 517;BA.debugLine="PnlIn.Height = top";
_pnlin.setHeight(_top);
 //BA.debugLineNum = 518;BA.debugLine="End Sub";
return "";
}
public String  _showprofilenotfound() throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Public Sub ShowProfileNotFound";
 //BA.debugLineNum = 184;BA.debugLine="Log(\">>> [SearchPage] No Profile Found.\")";
__c.LogImpl("010027009",">>> [SearchPage] No Profile Found.",0);
 //BA.debugLineNum = 185;BA.debugLine="PnlResults.RemoveAllViews";
_pnlresults.RemoveAllViews();
 //BA.debugLineNum = 186;BA.debugLine="clvSchedule.AsView.Visible = False";
_clvschedule._asview().setVisible(__c.False);
 //BA.debugLineNum = 187;BA.debugLine="xui.MsgboxAsync(\"No match found.\", \"Search Result";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("No match found."),BA.ObjectToCharSequence("Search Result"));
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public String  _showupdatesuccess() throws Exception{
 //BA.debugLineNum = 757;BA.debugLine="Public Sub ShowUpdateSuccess";
 //BA.debugLineNum = 758;BA.debugLine="xui.MsgboxAsync(\"Contact Updated\", \"Success\")";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Contact Updated"),BA.ObjectToCharSequence("Success"));
 //BA.debugLineNum = 759;BA.debugLine="PnlResults.Visible = False";
_pnlresults.setVisible(__c.False);
 //BA.debugLineNum = 760;BA.debugLine="txtSearch.Text = \"\"";
_txtsearch.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 761;BA.debugLine="CallSub(B4XPages.MainPage, \"RefreshDashboard\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"RefreshDashboard");
 //BA.debugLineNum = 762;BA.debugLine="End Sub";
return "";
}
public String  _txtsearch_enterpressed() throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub txtSearch_EnterPressed";
 //BA.debugLineNum = 165;BA.debugLine="btnSearch_Click";
_btnsearch_click();
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
if (BA.fastSubCompare(sub, "REDRAWUI"))
	return _redrawui(((Number)args[0]).intValue());
if (BA.fastSubCompare(sub, "SEARCHCONTACT"))
	return _searchcontact((String) args[0]);
if (BA.fastSubCompare(sub, "SHOWPROFILE"))
	return _showprofile((anywheresoftware.b4a.objects.collections.Map) args[0]);
if (BA.fastSubCompare(sub, "SHOWPROFILENOTFOUND"))
	return _showprofilenotfound();
if (BA.fastSubCompare(sub, "SHOWUPDATESUCCESS"))
	return _showupdatesuccess();
return BA.SubDelegator.SubNotFound;
}
}
