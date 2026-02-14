package Geek.God.CRM.App;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class createclientpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "Geek.God.CRM.App.createclientpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", Geek.God.CRM.App.createclientpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public String _places_api_key = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _sv = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _svpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnhome = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblname = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblsecondname = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblphone = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblhousephone = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbladdr = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblnotes = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblgroup = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsecondname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtphone = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txthousephone = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtaddress = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtaddressdisplay = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnotes = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spngroup = null;
public b4a.example3.customlistview _clvsuggestions = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlsuggestions = null;
public int _suggestionpanelheight = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsave = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btncancel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btngetnumber = null;
public Geek.God.CRM.App.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.IME _ime = null;
public anywheresoftware.b4a.objects.Timer _resizetimer = null;
public anywheresoftware.b4a.objects.Timer _searchtimer = null;
public boolean _ispageready = false;
public anywheresoftware.b4a.objects.collections.Map _pendingclientmap = null;
public anywheresoftware.b4a.objects.collections.Map _bufferedscrapedata = null;
public int _duplicatecheckstep = 0;
public String _foundduplicatename = "";
public boolean _issaving = false;
public boolean _isscrapemode = false;
public String _fullselectedaddress = "";
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _fonttitle = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _fontlabels = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _fontinputs = null;
public int _lastwidth = 0;
public int _lastheight = 0;
public b4a.example.dateutils _dateutils = null;
public Geek.God.CRM.App.main _main = null;
public Geek.God.CRM.App.starter _starter = null;
public Geek.God.CRM.App.b4xpages _b4xpages = null;
public Geek.God.CRM.App.b4xcollections _b4xcollections = null;
public Geek.God.CRM.App.httputils2service _httputils2service = null;
public Geek.God.CRM.App.xuiviewsutils _xuiviewsutils = null;
public void  _b4xpage_appear() throws Exception{
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(Geek.God.CRM.App.createclientpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.createclientpage parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 403;BA.debugLine="IsPageReady = False";
parent._ispageready = parent.__c.False;
 //BA.debugLineNum = 404;BA.debugLine="IsSaving = False";
parent._issaving = parent.__c.False;
 //BA.debugLineNum = 406;BA.debugLine="If IsScrapeMode = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._isscrapemode==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 407;BA.debugLine="ClearForm";
parent._clearform();
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 410;BA.debugLine="SuggestionPanelHeight = 0";
parent._suggestionpanelheight = (int) (0);
 //BA.debugLineNum = 411;BA.debugLine="sv.As(ScrollView).ScrollPosition = 0";
((anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(parent._sv.getObject()))).setScrollPosition((int) (0));
 //BA.debugLineNum = 412;BA.debugLine="txtAddress.SingleLine = True";
parent._txtaddress.setSingleLine(parent.__c.True);
 //BA.debugLineNum = 413;BA.debugLine="txtAddressDisplay.SingleLine = True";
parent._txtaddressdisplay.setSingleLine(parent.__c.True);
 //BA.debugLineNum = 415;BA.debugLine="txtName.RequestFocus";
parent._txtname.RequestFocus();
 //BA.debugLineNum = 416;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,this,(int) (100));
this.state = 9;
return;
case 9:
//C
this.state = 5;
;
 //BA.debugLineNum = 418;BA.debugLine="IsPageReady = True";
parent._ispageready = parent.__c.True;
 //BA.debugLineNum = 419;BA.debugLine="ime.ShowKeyboard(txtName)";
parent._ime.ShowKeyboard((android.view.View)(parent._txtname.getObject()));
 //BA.debugLineNum = 421;BA.debugLine="If GetDeviceLayoutValues.Width > 50 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.GetDeviceLayoutValues(ba).Width>50) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 422;BA.debugLine="B4XPage_Resize(GetDeviceLayoutValues.Width, GetD";
parent._b4xpage_resize(parent.__c.GetDeviceLayoutValues(ba).Width,parent.__c.GetDeviceLayoutValues(ba).Height);
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 425;BA.debugLine="ResizeTimer.Enabled = True";
parent._resizetimer.setEnabled(parent.__c.True);
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
anywheresoftware.b4a.objects.ScrollViewWrapper _nsv = null;
anywheresoftware.b4a.objects.LabelWrapper _lt = null;
anywheresoftware.b4a.objects.ButtonWrapper _bh = null;
anywheresoftware.b4a.objects.LabelWrapper _ln = null;
anywheresoftware.b4a.objects.LabelWrapper _ln2 = null;
anywheresoftware.b4a.objects.LabelWrapper _lp = null;
anywheresoftware.b4a.objects.ButtonWrapper _bphone = null;
anywheresoftware.b4a.objects.LabelWrapper _lhp = null;
anywheresoftware.b4a.objects.LabelWrapper _la = null;
anywheresoftware.b4a.objects.LabelWrapper _lblstub = null;
anywheresoftware.b4a.objects.collections.Map _props = null;
anywheresoftware.b4a.objects.LabelWrapper _lno = null;
anywheresoftware.b4a.objects.LabelWrapper _lg = null;
anywheresoftware.b4a.objects.CSBuilder _cs1 = null;
anywheresoftware.b4a.objects.CSBuilder _cs2 = null;
anywheresoftware.b4a.objects.CSBuilder _cs3 = null;
anywheresoftware.b4a.objects.ButtonWrapper _bs = null;
anywheresoftware.b4a.objects.ButtonWrapper _bc = null;
 //BA.debugLineNum = 99;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 100;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 101;BA.debugLine="Root.Color = xui.Color_White";
_root.setColor(_xui.Color_White);
 //BA.debugLineNum = 102;BA.debugLine="IsPageReady = False";
_ispageready = __c.False;
 //BA.debugLineNum = 104;BA.debugLine="Dialog.Initialize(Root)";
_dialog._initialize /*String*/ (ba,_root);
 //BA.debugLineNum = 105;BA.debugLine="Dialog.Title = \"Call Client\"";
_dialog._title /*Object*/  = (Object)("Call Client");
 //BA.debugLineNum = 108;BA.debugLine="LoadLocalFonts";
_loadlocalfonts();
 //BA.debugLineNum = 110;BA.debugLine="Dim nSV As ScrollView : nSV.Initialize(0)";
_nsv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 110;BA.debugLine="Dim nSV As ScrollView : nSV.Initialize(0)";
_nsv.Initialize(ba,(int) (0));
 //BA.debugLineNum = 111;BA.debugLine="sv = nSV";
_sv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_nsv.getObject()));
 //BA.debugLineNum = 112;BA.debugLine="Root.AddView(sv, 0, 0, Root.Width, Root.Height)";
_root.AddView((android.view.View)(_sv.getObject()),(int) (0),(int) (0),_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 113;BA.debugLine="svPanel = sv.GetView(0)";
_svpanel = _sv.GetView((int) (0));
 //BA.debugLineNum = 115;BA.debugLine="Dim lT As Label : lT.Initialize(\"\")";
_lt = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 115;BA.debugLine="Dim lT As Label : lT.Initialize(\"\")";
_lt.Initialize(ba,"");
 //BA.debugLineNum = 116;BA.debugLine="lT.Text = \"Add New Client\"";
_lt.setText(BA.ObjectToCharSequence("Add New Client"));
 //BA.debugLineNum = 117;BA.debugLine="lT.TextSize = 33 : lT.Typeface = fontTitle : lT.T";
_lt.setTextSize((float) (33));
 //BA.debugLineNum = 117;BA.debugLine="lT.TextSize = 33 : lT.Typeface = fontTitle : lT.T";
_lt.setTypeface((android.graphics.Typeface)(_fonttitle.getObject()));
 //BA.debugLineNum = 117;BA.debugLine="lT.TextSize = 33 : lT.Typeface = fontTitle : lT.T";
_lt.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 118;BA.debugLine="lT.Gravity = Gravity.CENTER";
_lt.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 119;BA.debugLine="svPanel.AddView(lT, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_lt.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 120;BA.debugLine="lblTitle = lT";
_lbltitle = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lt.getObject()));
 //BA.debugLineNum = 122;BA.debugLine="Dim bH As Button : bH.Initialize(\"btnHome\")";
_bh = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 122;BA.debugLine="Dim bH As Button : bH.Initialize(\"btnHome\")";
_bh.Initialize(ba,"btnHome");
 //BA.debugLineNum = 123;BA.debugLine="bH.Text = Chr(0xF015)";
_bh.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf015))));
 //BA.debugLineNum = 124;BA.debugLine="bH.Typeface = Typeface.FONTAWESOME";
_bh.setTypeface(__c.Typeface.getFONTAWESOME());
 //BA.debugLineNum = 125;BA.debugLine="bH.TextSize = 24";
_bh.setTextSize((float) (24));
 //BA.debugLineNum = 126;BA.debugLine="bH.Color = xui.Color_Transparent";
_bh.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 127;BA.debugLine="bH.TextColor = xui.Color_Black";
_bh.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 128;BA.debugLine="bH.Gravity = Gravity.CENTER";
_bh.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 129;BA.debugLine="btnHome = bH";
_btnhome = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_bh.getObject()));
 //BA.debugLineNum = 130;BA.debugLine="svPanel.AddView(btnHome, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_btnhome.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 133;BA.debugLine="Dim lN As Label : lN.Initialize(\"\") : lN.Text = \"";
_ln = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 133;BA.debugLine="Dim lN As Label : lN.Initialize(\"\") : lN.Text = \"";
_ln.Initialize(ba,"");
 //BA.debugLineNum = 133;BA.debugLine="Dim lN As Label : lN.Initialize(\"\") : lN.Text = \"";
_ln.setText(BA.ObjectToCharSequence("First Name:"));
 //BA.debugLineNum = 133;BA.debugLine="Dim lN As Label : lN.Initialize(\"\") : lN.Text = \"";
_ln.setTextSize((float) (24));
 //BA.debugLineNum = 133;BA.debugLine="Dim lN As Label : lN.Initialize(\"\") : lN.Text = \"";
_ln.setTextColor(_xui.Color_DarkGray);
 //BA.debugLineNum = 133;BA.debugLine="Dim lN As Label : lN.Initialize(\"\") : lN.Text = \"";
_ln.setTypeface((android.graphics.Typeface)(_fontlabels.getObject()));
 //BA.debugLineNum = 134;BA.debugLine="svPanel.AddView(lN, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_ln.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 135;BA.debugLine="lblName = lN";
_lblname = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ln.getObject()));
 //BA.debugLineNum = 137;BA.debugLine="txtName.Initialize(\"txtInput\") : txtName.TextSize";
_txtname.Initialize(ba,"txtInput");
 //BA.debugLineNum = 137;BA.debugLine="txtName.Initialize(\"txtInput\") : txtName.TextSize";
_txtname.setTextSize((float) (14));
 //BA.debugLineNum = 137;BA.debugLine="txtName.Initialize(\"txtInput\") : txtName.TextSize";
_txtname.setColor(((int)0xfff0f0f0));
 //BA.debugLineNum = 137;BA.debugLine="txtName.Initialize(\"txtInput\") : txtName.TextSize";
_txtname.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 137;BA.debugLine="txtName.Initialize(\"txtInput\") : txtName.TextSize";
_txtname.setTypeface((android.graphics.Typeface)(_fontinputs.getObject()));
 //BA.debugLineNum = 138;BA.debugLine="txtName.Gravity = Gravity.CENTER_VERTICAL";
_txtname.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 139;BA.debugLine="svPanel.AddView(txtName, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_txtname.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 142;BA.debugLine="Dim lN2 As Label : lN2.Initialize(\"\") : lN2.Text";
_ln2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 142;BA.debugLine="Dim lN2 As Label : lN2.Initialize(\"\") : lN2.Text";
_ln2.Initialize(ba,"");
 //BA.debugLineNum = 142;BA.debugLine="Dim lN2 As Label : lN2.Initialize(\"\") : lN2.Text";
_ln2.setText(BA.ObjectToCharSequence("Second Name:"));
 //BA.debugLineNum = 142;BA.debugLine="Dim lN2 As Label : lN2.Initialize(\"\") : lN2.Text";
_ln2.setTextSize((float) (24));
 //BA.debugLineNum = 142;BA.debugLine="Dim lN2 As Label : lN2.Initialize(\"\") : lN2.Text";
_ln2.setTextColor(_xui.Color_DarkGray);
 //BA.debugLineNum = 142;BA.debugLine="Dim lN2 As Label : lN2.Initialize(\"\") : lN2.Text";
_ln2.setTypeface((android.graphics.Typeface)(_fontlabels.getObject()));
 //BA.debugLineNum = 143;BA.debugLine="svPanel.AddView(lN2, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_ln2.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 144;BA.debugLine="lblSecondName = lN2";
_lblsecondname = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ln2.getObject()));
 //BA.debugLineNum = 146;BA.debugLine="txtSecondName.Initialize(\"txtInput\") : txtSecondN";
_txtsecondname.Initialize(ba,"txtInput");
 //BA.debugLineNum = 146;BA.debugLine="txtSecondName.Initialize(\"txtInput\") : txtSecondN";
_txtsecondname.setHint("Optional");
 //BA.debugLineNum = 146;BA.debugLine="txtSecondName.Initialize(\"txtInput\") : txtSecondN";
_txtsecondname.setTextSize((float) (14));
 //BA.debugLineNum = 146;BA.debugLine="txtSecondName.Initialize(\"txtInput\") : txtSecondN";
_txtsecondname.setColor(((int)0xfff0f0f0));
 //BA.debugLineNum = 146;BA.debugLine="txtSecondName.Initialize(\"txtInput\") : txtSecondN";
_txtsecondname.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 146;BA.debugLine="txtSecondName.Initialize(\"txtInput\") : txtSecondN";
_txtsecondname.setTypeface((android.graphics.Typeface)(_fontinputs.getObject()));
 //BA.debugLineNum = 147;BA.debugLine="txtSecondName.Gravity = Gravity.CENTER_VERTICAL";
_txtsecondname.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 148;BA.debugLine="svPanel.AddView(txtSecondName, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_txtsecondname.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 150;BA.debugLine="Dim lP As Label : lP.Initialize(\"\") : lP.Text = \"";
_lp = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 150;BA.debugLine="Dim lP As Label : lP.Initialize(\"\") : lP.Text = \"";
_lp.Initialize(ba,"");
 //BA.debugLineNum = 150;BA.debugLine="Dim lP As Label : lP.Initialize(\"\") : lP.Text = \"";
_lp.setText(BA.ObjectToCharSequence("Cell Number:"));
 //BA.debugLineNum = 150;BA.debugLine="Dim lP As Label : lP.Initialize(\"\") : lP.Text = \"";
_lp.setTextSize((float) (24));
 //BA.debugLineNum = 150;BA.debugLine="Dim lP As Label : lP.Initialize(\"\") : lP.Text = \"";
_lp.setTextColor(_xui.Color_DarkGray);
 //BA.debugLineNum = 150;BA.debugLine="Dim lP As Label : lP.Initialize(\"\") : lP.Text = \"";
_lp.setTypeface((android.graphics.Typeface)(_fontlabels.getObject()));
 //BA.debugLineNum = 151;BA.debugLine="svPanel.AddView(lP, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_lp.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 152;BA.debugLine="lblPhone = lP";
_lblphone = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lp.getObject()));
 //BA.debugLineNum = 154;BA.debugLine="txtPhone.Initialize(\"txtPhone\")";
_txtphone.Initialize(ba,"txtPhone");
 //BA.debugLineNum = 155;BA.debugLine="txtPhone.TextSize = 14";
_txtphone.setTextSize((float) (14));
 //BA.debugLineNum = 156;BA.debugLine="txtPhone.Color = 0xFFF0F0F0";
_txtphone.setColor(((int)0xfff0f0f0));
 //BA.debugLineNum = 157;BA.debugLine="txtPhone.TextColor = xui.Color_Black";
_txtphone.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 158;BA.debugLine="txtPhone.InputType = txtPhone.INPUT_TYPE_PHONE";
_txtphone.setInputType(_txtphone.INPUT_TYPE_PHONE);
 //BA.debugLineNum = 159;BA.debugLine="txtPhone.Typeface = fontInputs";
_txtphone.setTypeface((android.graphics.Typeface)(_fontinputs.getObject()));
 //BA.debugLineNum = 160;BA.debugLine="txtPhone.Gravity = Gravity.CENTER_VERTICAL";
_txtphone.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 161;BA.debugLine="svPanel.AddView(txtPhone, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_txtphone.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 163;BA.debugLine="Dim bPhone As Button : bPhone.Initialize(\"btnGetN";
_bphone = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 163;BA.debugLine="Dim bPhone As Button : bPhone.Initialize(\"btnGetN";
_bphone.Initialize(ba,"btnGetNumber");
 //BA.debugLineNum = 164;BA.debugLine="bPhone.Text = \"📞\"";
_bphone.setText(BA.ObjectToCharSequence("📞"));
 //BA.debugLineNum = 165;BA.debugLine="bPhone.TextSize = 14";
_bphone.setTextSize((float) (14));
 //BA.debugLineNum = 166;BA.debugLine="bPhone.Enabled = True";
_bphone.setEnabled(__c.True);
 //BA.debugLineNum = 167;BA.debugLine="bPhone.Typeface = fontInputs";
_bphone.setTypeface((android.graphics.Typeface)(_fontinputs.getObject()));
 //BA.debugLineNum = 168;BA.debugLine="btnGetNumber = bPhone";
_btngetnumber = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_bphone.getObject()));
 //BA.debugLineNum = 169;BA.debugLine="svPanel.AddView(btnGetNumber, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_btngetnumber.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 171;BA.debugLine="Dim lHP As Label : lHP.Initialize(\"\") : lHP.Text";
_lhp = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 171;BA.debugLine="Dim lHP As Label : lHP.Initialize(\"\") : lHP.Text";
_lhp.Initialize(ba,"");
 //BA.debugLineNum = 171;BA.debugLine="Dim lHP As Label : lHP.Initialize(\"\") : lHP.Text";
_lhp.setText(BA.ObjectToCharSequence("Alt Number:"));
 //BA.debugLineNum = 171;BA.debugLine="Dim lHP As Label : lHP.Initialize(\"\") : lHP.Text";
_lhp.setTextSize((float) (24));
 //BA.debugLineNum = 171;BA.debugLine="Dim lHP As Label : lHP.Initialize(\"\") : lHP.Text";
_lhp.setTextColor(_xui.Color_DarkGray);
 //BA.debugLineNum = 171;BA.debugLine="Dim lHP As Label : lHP.Initialize(\"\") : lHP.Text";
_lhp.setTypeface((android.graphics.Typeface)(_fontlabels.getObject()));
 //BA.debugLineNum = 172;BA.debugLine="svPanel.AddView(lHP, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_lhp.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 173;BA.debugLine="lblHousePhone = lHP";
_lblhousephone = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lhp.getObject()));
 //BA.debugLineNum = 175;BA.debugLine="txtHousePhone.Initialize(\"txtHousePhone\")";
_txthousephone.Initialize(ba,"txtHousePhone");
 //BA.debugLineNum = 176;BA.debugLine="txtHousePhone.Hint = \"Optional\"";
_txthousephone.setHint("Optional");
 //BA.debugLineNum = 177;BA.debugLine="txtHousePhone.TextSize = 14";
_txthousephone.setTextSize((float) (14));
 //BA.debugLineNum = 178;BA.debugLine="txtHousePhone.Color = 0xFFF0F0F0";
_txthousephone.setColor(((int)0xfff0f0f0));
 //BA.debugLineNum = 179;BA.debugLine="txtHousePhone.TextColor = xui.Color_Black";
_txthousephone.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 180;BA.debugLine="txtHousePhone.InputType = txtHousePhone.INPUT_TYP";
_txthousephone.setInputType(_txthousephone.INPUT_TYPE_PHONE);
 //BA.debugLineNum = 181;BA.debugLine="txtHousePhone.Typeface = fontInputs";
_txthousephone.setTypeface((android.graphics.Typeface)(_fontinputs.getObject()));
 //BA.debugLineNum = 182;BA.debugLine="txtHousePhone.Gravity = Gravity.CENTER_VERTICAL";
_txthousephone.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 183;BA.debugLine="svPanel.AddView(txtHousePhone, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_txthousephone.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 185;BA.debugLine="Dim lA As Label : lA.Initialize(\"\") : lA.Text = \"";
_la = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 185;BA.debugLine="Dim lA As Label : lA.Initialize(\"\") : lA.Text = \"";
_la.Initialize(ba,"");
 //BA.debugLineNum = 185;BA.debugLine="Dim lA As Label : lA.Initialize(\"\") : lA.Text = \"";
_la.setText(BA.ObjectToCharSequence("Address:"));
 //BA.debugLineNum = 185;BA.debugLine="Dim lA As Label : lA.Initialize(\"\") : lA.Text = \"";
_la.setTextSize((float) (24));
 //BA.debugLineNum = 185;BA.debugLine="Dim lA As Label : lA.Initialize(\"\") : lA.Text = \"";
_la.setTextColor(_xui.Color_DarkGray);
 //BA.debugLineNum = 185;BA.debugLine="Dim lA As Label : lA.Initialize(\"\") : lA.Text = \"";
_la.setTypeface((android.graphics.Typeface)(_fontlabels.getObject()));
 //BA.debugLineNum = 186;BA.debugLine="svPanel.AddView(lA, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_la.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 187;BA.debugLine="lblAddr = lA";
_lbladdr = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_la.getObject()));
 //BA.debugLineNum = 189;BA.debugLine="txtAddress.Initialize(\"txtAddress\") : txtAddress.";
_txtaddress.Initialize(ba,"txtAddress");
 //BA.debugLineNum = 189;BA.debugLine="txtAddress.Initialize(\"txtAddress\") : txtAddress.";
_txtaddress.setTextSize((float) (14));
 //BA.debugLineNum = 189;BA.debugLine="txtAddress.Initialize(\"txtAddress\") : txtAddress.";
_txtaddress.setColor(((int)0xfff0f0f0));
 //BA.debugLineNum = 189;BA.debugLine="txtAddress.Initialize(\"txtAddress\") : txtAddress.";
_txtaddress.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 189;BA.debugLine="txtAddress.Initialize(\"txtAddress\") : txtAddress.";
_txtaddress.setTypeface((android.graphics.Typeface)(_fontinputs.getObject()));
 //BA.debugLineNum = 190;BA.debugLine="txtAddress.Gravity = Gravity.CENTER_VERTICAL";
_txtaddress.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 191;BA.debugLine="svPanel.AddView(txtAddress, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_txtaddress.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 193;BA.debugLine="txtAddressDisplay.Initialize(\"txtAddressDisplay\")";
_txtaddressdisplay.Initialize(ba,"txtAddressDisplay");
 //BA.debugLineNum = 193;BA.debugLine="txtAddressDisplay.Initialize(\"txtAddressDisplay\")";
_txtaddressdisplay.setTextSize((float) (14));
 //BA.debugLineNum = 193;BA.debugLine="txtAddressDisplay.Initialize(\"txtAddressDisplay\")";
_txtaddressdisplay.setColor(((int)0xfff0f0f0));
 //BA.debugLineNum = 193;BA.debugLine="txtAddressDisplay.Initialize(\"txtAddressDisplay\")";
_txtaddressdisplay.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 193;BA.debugLine="txtAddressDisplay.Initialize(\"txtAddressDisplay\")";
_txtaddressdisplay.setTypeface((android.graphics.Typeface)(_fontinputs.getObject()));
 //BA.debugLineNum = 194;BA.debugLine="txtAddressDisplay.Gravity = Gravity.CENTER_VERTIC";
_txtaddressdisplay.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 195;BA.debugLine="svPanel.AddView(txtAddressDisplay, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_txtaddressdisplay.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 197;BA.debugLine="pnlSuggestions = xui.CreatePanel(\"\")";
_pnlsuggestions = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 198;BA.debugLine="pnlSuggestions.Color = xui.Color_White";
_pnlsuggestions.setColor(_xui.Color_White);
 //BA.debugLineNum = 199;BA.debugLine="pnlSuggestions.Visible = False";
_pnlsuggestions.setVisible(__c.False);
 //BA.debugLineNum = 201;BA.debugLine="clvSuggestions.Initialize(Me, \"clvSuggestions\")";
_clvsuggestions._initialize(ba,this,"clvSuggestions");
 //BA.debugLineNum = 202;BA.debugLine="Dim lblStub As Label : lblStub.Initialize(\"\")";
_lblstub = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 202;BA.debugLine="Dim lblStub As Label : lblStub.Initialize(\"\")";
_lblstub.Initialize(ba,"");
 //BA.debugLineNum = 203;BA.debugLine="Dim props As Map = CreateMap(\"DividerColor\": 0xFF";
_props = new anywheresoftware.b4a.objects.collections.Map();
_props = __c.createMap(new Object[] {(Object)("DividerColor"),(Object)(((int)0xffd9d9d9)),(Object)("DividerHeight"),(Object)(__c.DipToCurrent((int) (1))),(Object)("PressedColor"),(Object)(((int)0xff7eb4fa)),(Object)("InsertAnimationDuration"),(Object)(0),(Object)("ListOrientation"),(Object)("Vertical")});
 //BA.debugLineNum = 204;BA.debugLine="clvSuggestions.DesignerCreateView(pnlSuggestions,";
_clvsuggestions._designercreateview((Object)(_pnlsuggestions.getObject()),_lblstub,_props);
 //BA.debugLineNum = 205;BA.debugLine="svPanel.AddView(pnlSuggestions, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_pnlsuggestions.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 208;BA.debugLine="Dim lNo As Label : lNo.Initialize(\"\") : lNo.Text";
_lno = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 208;BA.debugLine="Dim lNo As Label : lNo.Initialize(\"\") : lNo.Text";
_lno.Initialize(ba,"");
 //BA.debugLineNum = 208;BA.debugLine="Dim lNo As Label : lNo.Initialize(\"\") : lNo.Text";
_lno.setText(BA.ObjectToCharSequence("Notes:"));
 //BA.debugLineNum = 208;BA.debugLine="Dim lNo As Label : lNo.Initialize(\"\") : lNo.Text";
_lno.setTextSize((float) (24));
 //BA.debugLineNum = 208;BA.debugLine="Dim lNo As Label : lNo.Initialize(\"\") : lNo.Text";
_lno.setTextColor(_xui.Color_DarkGray);
 //BA.debugLineNum = 208;BA.debugLine="Dim lNo As Label : lNo.Initialize(\"\") : lNo.Text";
_lno.setTypeface((android.graphics.Typeface)(_fontlabels.getObject()));
 //BA.debugLineNum = 209;BA.debugLine="svPanel.AddView(lNo, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_lno.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 210;BA.debugLine="lblNotes = lNo";
_lblnotes = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lno.getObject()));
 //BA.debugLineNum = 212;BA.debugLine="txtNotes.Initialize(\"txtInput\") : txtNotes.TextSi";
_txtnotes.Initialize(ba,"txtInput");
 //BA.debugLineNum = 212;BA.debugLine="txtNotes.Initialize(\"txtInput\") : txtNotes.TextSi";
_txtnotes.setTextSize((float) (14));
 //BA.debugLineNum = 212;BA.debugLine="txtNotes.Initialize(\"txtInput\") : txtNotes.TextSi";
_txtnotes.setColor(((int)0xfff0f0f0));
 //BA.debugLineNum = 212;BA.debugLine="txtNotes.Initialize(\"txtInput\") : txtNotes.TextSi";
_txtnotes.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 212;BA.debugLine="txtNotes.Initialize(\"txtInput\") : txtNotes.TextSi";
_txtnotes.setTypeface((android.graphics.Typeface)(_fontinputs.getObject()));
 //BA.debugLineNum = 213;BA.debugLine="txtNotes.SingleLine = False";
_txtnotes.setSingleLine(__c.False);
 //BA.debugLineNum = 214;BA.debugLine="txtNotes.Wrap = True";
_txtnotes.setWrap(__c.True);
 //BA.debugLineNum = 215;BA.debugLine="txtNotes.Gravity = Gravity.TOP + Gravity.LEFT";
_txtnotes.setGravity((int) (__c.Gravity.TOP+__c.Gravity.LEFT));
 //BA.debugLineNum = 216;BA.debugLine="svPanel.AddView(txtNotes, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_txtnotes.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 218;BA.debugLine="Dim lG As Label : lG.Initialize(\"\") : lG.Text = \"";
_lg = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 218;BA.debugLine="Dim lG As Label : lG.Initialize(\"\") : lG.Text = \"";
_lg.Initialize(ba,"");
 //BA.debugLineNum = 218;BA.debugLine="Dim lG As Label : lG.Initialize(\"\") : lG.Text = \"";
_lg.setText(BA.ObjectToCharSequence("Group:"));
 //BA.debugLineNum = 218;BA.debugLine="Dim lG As Label : lG.Initialize(\"\") : lG.Text = \"";
_lg.setTextSize((float) (24));
 //BA.debugLineNum = 218;BA.debugLine="Dim lG As Label : lG.Initialize(\"\") : lG.Text = \"";
_lg.setTextColor(_xui.Color_DarkGray);
 //BA.debugLineNum = 218;BA.debugLine="Dim lG As Label : lG.Initialize(\"\") : lG.Text = \"";
_lg.setTypeface((android.graphics.Typeface)(_fontlabels.getObject()));
 //BA.debugLineNum = 219;BA.debugLine="svPanel.AddView(lG, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_lg.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 220;BA.debugLine="lblGroup = lG";
_lblgroup = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lg.getObject()));
 //BA.debugLineNum = 222;BA.debugLine="spnGroup.Initialize(\"spnGroup\")";
_spngroup.Initialize(ba,"spnGroup");
 //BA.debugLineNum = 223;BA.debugLine="Dim cs1 As CSBuilder : cs1.Initialize.Typeface(fo";
_cs1 = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 223;BA.debugLine="Dim cs1 As CSBuilder : cs1.Initialize.Typeface(fo";
_cs1.Initialize().Typeface((android.graphics.Typeface)(_fontinputs.getObject())).Append(BA.ObjectToCharSequence("Standard Client")).PopAll();
 //BA.debugLineNum = 224;BA.debugLine="Dim cs2 As CSBuilder : cs2.Initialize.Typeface(fo";
_cs2 = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 224;BA.debugLine="Dim cs2 As CSBuilder : cs2.Initialize.Typeface(fo";
_cs2.Initialize().Typeface((android.graphics.Typeface)(_fontinputs.getObject())).Append(BA.ObjectToCharSequence("Preferred Client")).PopAll();
 //BA.debugLineNum = 225;BA.debugLine="Dim cs3 As CSBuilder : cs3.Initialize.Typeface(fo";
_cs3 = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 225;BA.debugLine="Dim cs3 As CSBuilder : cs3.Initialize.Typeface(fo";
_cs3.Initialize().Typeface((android.graphics.Typeface)(_fontinputs.getObject())).Append(BA.ObjectToCharSequence("Blacklisted Client")).PopAll();
 //BA.debugLineNum = 226;BA.debugLine="spnGroup.AddAll(Array(cs1, cs2, cs3))";
_spngroup.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cs1.getObject()),(Object)(_cs2.getObject()),(Object)(_cs3.getObject())}));
 //BA.debugLineNum = 227;BA.debugLine="svPanel.AddView(spnGroup, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_spngroup.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 229;BA.debugLine="Dim bS As Button : bS.Initialize(\"btnSave\") : bS.";
_bs = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 229;BA.debugLine="Dim bS As Button : bS.Initialize(\"btnSave\") : bS.";
_bs.Initialize(ba,"btnSave");
 //BA.debugLineNum = 229;BA.debugLine="Dim bS As Button : bS.Initialize(\"btnSave\") : bS.";
_bs.setText(BA.ObjectToCharSequence("Save"));
 //BA.debugLineNum = 229;BA.debugLine="Dim bS As Button : bS.Initialize(\"btnSave\") : bS.";
_bs.setColor(((int)0xff2e7d32));
 //BA.debugLineNum = 229;BA.debugLine="Dim bS As Button : bS.Initialize(\"btnSave\") : bS.";
_bs.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 229;BA.debugLine="Dim bS As Button : bS.Initialize(\"btnSave\") : bS.";
_bs.setTextSize((float) (16));
 //BA.debugLineNum = 229;BA.debugLine="Dim bS As Button : bS.Initialize(\"btnSave\") : bS.";
_bs.setTypeface((android.graphics.Typeface)(_fontinputs.getObject()));
 //BA.debugLineNum = 230;BA.debugLine="svPanel.AddView(bS, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_bs.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 231;BA.debugLine="btnSave = bS";
_btnsave = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_bs.getObject()));
 //BA.debugLineNum = 233;BA.debugLine="Dim bC As Button : bC.Initialize(\"btnCancel\") : b";
_bc = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 233;BA.debugLine="Dim bC As Button : bC.Initialize(\"btnCancel\") : b";
_bc.Initialize(ba,"btnCancel");
 //BA.debugLineNum = 233;BA.debugLine="Dim bC As Button : bC.Initialize(\"btnCancel\") : b";
_bc.setText(BA.ObjectToCharSequence("Cancel"));
 //BA.debugLineNum = 233;BA.debugLine="Dim bC As Button : bC.Initialize(\"btnCancel\") : b";
_bc.setColor(_xui.Color_Red);
 //BA.debugLineNum = 233;BA.debugLine="Dim bC As Button : bC.Initialize(\"btnCancel\") : b";
_bc.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 233;BA.debugLine="Dim bC As Button : bC.Initialize(\"btnCancel\") : b";
_bc.setTextSize((float) (16));
 //BA.debugLineNum = 233;BA.debugLine="Dim bC As Button : bC.Initialize(\"btnCancel\") : b";
_bc.setTypeface((android.graphics.Typeface)(_fontinputs.getObject()));
 //BA.debugLineNum = 234;BA.debugLine="svPanel.AddView(bC, 0, 0, 0, 0)";
_svpanel.AddView((android.view.View)(_bc.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 235;BA.debugLine="btnCancel = bC";
_btncancel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_bc.getObject()));
 //BA.debugLineNum = 237;BA.debugLine="IsPageReady = True";
_ispageready = __c.True;
 //BA.debugLineNum = 238;BA.debugLine="B4XPage_Resize(Root.Width, Root.Height)";
_b4xpage_resize(_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(int _width,int _height) throws Exception{
int _margin = 0;
int _fieldwidth = 0;
int _topy = 0;
int _homesize = 0;
boolean _usestackedmode = false;
int _gap = 0;
int _colw = 0;
int _col2start = 0;
int _buttonsize = 0;
int _phonefieldwidth = 0;
int _addressbottomy = 0;
anywheresoftware.b4a.objects.ConcreteViewWrapper _vspin = null;
int _btngap = 0;
int _btnwidth = 0;
 //BA.debugLineNum = 279;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
 //BA.debugLineNum = 280;BA.debugLine="If IsPageReady = False Then Return";
if (_ispageready==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 281;BA.debugLine="If Width < 50 Or Height < 50 Then Return";
if (_width<50 || _height<50) { 
if (true) return "";};
 //BA.debugLineNum = 283;BA.debugLine="LastWidth = Width";
_lastwidth = _width;
 //BA.debugLineNum = 284;BA.debugLine="LastHeight = Height";
_lastheight = _height;
 //BA.debugLineNum = 286;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
_sv.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
 //BA.debugLineNum = 287;BA.debugLine="svPanel.Width = Width";
_svpanel.setWidth(_width);
 //BA.debugLineNum = 289;BA.debugLine="Dim Margin As Int = 20dip";
_margin = __c.DipToCurrent((int) (20));
 //BA.debugLineNum = 290;BA.debugLine="Dim FieldWidth As Int = Width - (Margin * 2)";
_fieldwidth = (int) (_width-(_margin*2));
 //BA.debugLineNum = 291;BA.debugLine="If FieldWidth < 50dip Then FieldWidth = 50dip";
if (_fieldwidth<__c.DipToCurrent((int) (50))) { 
_fieldwidth = __c.DipToCurrent((int) (50));};
 //BA.debugLineNum = 292;BA.debugLine="Dim TopY As Int = 20dip";
_topy = __c.DipToCurrent((int) (20));
 //BA.debugLineNum = 294;BA.debugLine="Dim HomeSize As Int = 60dip";
_homesize = __c.DipToCurrent((int) (60));
 //BA.debugLineNum = 296;BA.debugLine="btnHome.SetLayoutAnimated(0, Margin, TopY, HomeSi";
_btnhome.SetLayoutAnimated((int) (0),_margin,_topy,_homesize,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 297;BA.debugLine="lblTitle.SetLayoutAnimated(0, Margin, TopY, Field";
_lbltitle.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 298;BA.debugLine="lblTitle.SetTextAlignment(\"CENTER\", \"CENTER\")";
_lbltitle.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 299;BA.debugLine="btnHome.BringToFront";
_btnhome.BringToFront();
 //BA.debugLineNum = 300;BA.debugLine="TopY = TopY + 55dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (55)));
 //BA.debugLineNum = 304;BA.debugLine="Dim UseStackedMode As Boolean = False";
_usestackedmode = __c.False;
 //BA.debugLineNum = 305;BA.debugLine="If Width < 1300 Then UseStackedMode = True";
if (_width<1300) { 
_usestackedmode = __c.True;};
 //BA.debugLineNum = 306;BA.debugLine="If B4XPages.MainPage.LastFoldState = \"HALF_OPENED";
if ((_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)._lastfoldstate /*String*/ ).equals("HALF_OPENED")) { 
_usestackedmode = __c.True;};
 //BA.debugLineNum = 308;BA.debugLine="If UseStackedMode = False Then";
if (_usestackedmode==__c.False) { 
 //BA.debugLineNum = 310;BA.debugLine="Dim Gap As Int = 20dip";
_gap = __c.DipToCurrent((int) (20));
 //BA.debugLineNum = 311;BA.debugLine="Dim ColW As Int = (FieldWidth - Gap) / 2";
_colw = (int) ((_fieldwidth-_gap)/(double)2);
 //BA.debugLineNum = 312;BA.debugLine="Dim Col2Start As Int = Margin + ColW + Gap";
_col2start = (int) (_margin+_colw+_gap);
 //BA.debugLineNum = 315;BA.debugLine="lblName.SetLayoutAnimated(0, Margin, TopY, ColW,";
_lblname.SetLayoutAnimated((int) (0),_margin,_topy,_colw,__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 316;BA.debugLine="lblSecondName.SetLayoutAnimated(0, Col2Start, To";
_lblsecondname.SetLayoutAnimated((int) (0),_col2start,_topy,_colw,__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 317;BA.debugLine="TopY = TopY + 30dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 319;BA.debugLine="txtName.SetLayoutAnimated(0, Margin, TopY, ColW,";
_txtname.SetLayoutAnimated((int) (0),_margin,_topy,_colw,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 320;BA.debugLine="txtSecondName.SetLayoutAnimated(0, Col2Start, To";
_txtsecondname.SetLayoutAnimated((int) (0),_col2start,_topy,_colw,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 321;BA.debugLine="TopY = TopY + 50dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 324;BA.debugLine="lblPhone.SetLayoutAnimated(0, Margin, TopY, ColW";
_lblphone.SetLayoutAnimated((int) (0),_margin,_topy,_colw,__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 325;BA.debugLine="lblHousePhone.SetLayoutAnimated(0, Col2Start, To";
_lblhousephone.SetLayoutAnimated((int) (0),_col2start,_topy,_colw,__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 326;BA.debugLine="TopY = TopY + 30dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 328;BA.debugLine="Dim ButtonSize As Int = 45dip";
_buttonsize = __c.DipToCurrent((int) (45));
 //BA.debugLineNum = 329;BA.debugLine="Dim PhoneFieldWidth As Int = ColW - ButtonSize -";
_phonefieldwidth = (int) (_colw-_buttonsize-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 330;BA.debugLine="txtPhone.SetLayoutAnimated(0, Margin, TopY, Phon";
_txtphone.SetLayoutAnimated((int) (0),_margin,_topy,_phonefieldwidth,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 331;BA.debugLine="btnGetNumber.SetLayoutAnimated(0, Margin + Phone";
_btngetnumber.SetLayoutAnimated((int) (0),(int) (_margin+_phonefieldwidth+__c.DipToCurrent((int) (10))),_topy,_buttonsize,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 333;BA.debugLine="txtHousePhone.SetLayoutAnimated(0, Col2Start, To";
_txthousephone.SetLayoutAnimated((int) (0),_col2start,_topy,_colw,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 334;BA.debugLine="TopY = TopY + 50dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (50)));
 }else {
 //BA.debugLineNum = 337;BA.debugLine="lblName.SetLayoutAnimated(0, Margin, TopY, Field";
_lblname.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 337;BA.debugLine="lblName.SetLayoutAnimated(0, Margin, TopY, Field";
_topy = (int) (_topy+__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 338;BA.debugLine="txtName.SetLayoutAnimated(0, Margin, TopY, Field";
_txtname.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 338;BA.debugLine="txtName.SetLayoutAnimated(0, Margin, TopY, Field";
_topy = (int) (_topy+__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 340;BA.debugLine="lblSecondName.SetLayoutAnimated(0, Margin, TopY,";
_lblsecondname.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 340;BA.debugLine="lblSecondName.SetLayoutAnimated(0, Margin, TopY,";
_topy = (int) (_topy+__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 341;BA.debugLine="txtSecondName.SetLayoutAnimated(0, Margin, TopY,";
_txtsecondname.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 341;BA.debugLine="txtSecondName.SetLayoutAnimated(0, Margin, TopY,";
_topy = (int) (_topy+__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 343;BA.debugLine="lblPhone.SetLayoutAnimated(0, Margin, TopY, Fiel";
_lblphone.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 343;BA.debugLine="lblPhone.SetLayoutAnimated(0, Margin, TopY, Fiel";
_topy = (int) (_topy+__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 344;BA.debugLine="Dim ButtonSize As Int = 45dip";
_buttonsize = __c.DipToCurrent((int) (45));
 //BA.debugLineNum = 345;BA.debugLine="Dim PhoneFieldWidth As Int = FieldWidth - Button";
_phonefieldwidth = (int) (_fieldwidth-_buttonsize-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 346;BA.debugLine="txtPhone.SetLayoutAnimated(0, Margin, TopY, Phon";
_txtphone.SetLayoutAnimated((int) (0),_margin,_topy,_phonefieldwidth,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 347;BA.debugLine="btnGetNumber.SetLayoutAnimated(0, Margin + Phone";
_btngetnumber.SetLayoutAnimated((int) (0),(int) (_margin+_phonefieldwidth+__c.DipToCurrent((int) (10))),_topy,_buttonsize,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 348;BA.debugLine="TopY = TopY + 50dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 350;BA.debugLine="lblHousePhone.SetLayoutAnimated(0, Margin, TopY,";
_lblhousephone.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 350;BA.debugLine="lblHousePhone.SetLayoutAnimated(0, Margin, TopY,";
_topy = (int) (_topy+__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 351;BA.debugLine="txtHousePhone.SetLayoutAnimated(0, Margin, TopY,";
_txthousephone.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 351;BA.debugLine="txtHousePhone.SetLayoutAnimated(0, Margin, TopY,";
_topy = (int) (_topy+__c.DipToCurrent((int) (50)));
 };
 //BA.debugLineNum = 355;BA.debugLine="lblAddr.SetLayoutAnimated(0, Margin, TopY, FieldW";
_lbladdr.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 355;BA.debugLine="lblAddr.SetLayoutAnimated(0, Margin, TopY, FieldW";
_topy = (int) (_topy+__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 356;BA.debugLine="txtAddress.SetLayoutAnimated(0, Margin, TopY, Fie";
_txtaddress.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 357;BA.debugLine="txtAddressDisplay.SetLayoutAnimated(0, Margin, To";
_txtaddressdisplay.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 358;BA.debugLine="txtAddress.As(B4XView).BringToFront";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_txtaddress.getObject()))).BringToFront();
 //BA.debugLineNum = 359;BA.debugLine="Dim AddressBottomY As Int = TopY + 40dip";
_addressbottomy = (int) (_topy+__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 361;BA.debugLine="TopY = AddressBottomY + 10dip";
_topy = (int) (_addressbottomy+__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 362;BA.debugLine="lblNotes.SetLayoutAnimated(0, Margin, TopY, Field";
_lblnotes.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 362;BA.debugLine="lblNotes.SetLayoutAnimated(0, Margin, TopY, Field";
_topy = (int) (_topy+__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 363;BA.debugLine="txtNotes.SetLayoutAnimated(0, Margin, TopY, Field";
_txtnotes.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (90)));
 //BA.debugLineNum = 363;BA.debugLine="txtNotes.SetLayoutAnimated(0, Margin, TopY, Field";
_topy = (int) (_topy+__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 365;BA.debugLine="lblGroup.SetLayoutAnimated(0, Margin, TopY, Field";
_lblgroup.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 365;BA.debugLine="lblGroup.SetLayoutAnimated(0, Margin, TopY, Field";
_topy = (int) (_topy+__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 366;BA.debugLine="Dim vSpin As View = spnGroup";
_vspin = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
_vspin = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_spngroup.getObject()));
 //BA.debugLineNum = 367;BA.debugLine="vSpin.SetLayoutAnimated(0, Margin, TopY, FieldWid";
_vspin.SetLayoutAnimated((int) (0),_margin,_topy,_fieldwidth,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 368;BA.debugLine="TopY = TopY + 60dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 370;BA.debugLine="Dim BtnGap As Int = 10dip";
_btngap = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 371;BA.debugLine="Dim BtnWidth As Int = (FieldWidth - BtnGap) / 2";
_btnwidth = (int) ((_fieldwidth-_btngap)/(double)2);
 //BA.debugLineNum = 372;BA.debugLine="btnCancel.SetLayoutAnimated(0, Margin, TopY, BtnW";
_btncancel.SetLayoutAnimated((int) (0),_margin,_topy,_btnwidth,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 373;BA.debugLine="btnSave.SetLayoutAnimated(0, Margin + BtnWidth +";
_btnsave.SetLayoutAnimated((int) (0),(int) (_margin+_btnwidth+_btngap),_topy,_btnwidth,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 376;BA.debugLine="TopY = TopY + 70dip";
_topy = (int) (_topy+__c.DipToCurrent((int) (70)));
 //BA.debugLineNum = 377;BA.debugLine="svPanel.Height = TopY";
_svpanel.setHeight(_topy);
 //BA.debugLineNum = 379;BA.debugLine="If SuggestionPanelHeight > 0 Then";
if (_suggestionpanelheight>0) { 
 //BA.debugLineNum = 380;BA.debugLine="pnlSuggestions.Visible = True";
_pnlsuggestions.setVisible(__c.True);
 //BA.debugLineNum = 381;BA.debugLine="pnlSuggestions.SetLayoutAnimated(0, Margin, Addr";
_pnlsuggestions.SetLayoutAnimated((int) (0),_margin,_addressbottomy,_fieldwidth,_suggestionpanelheight);
 //BA.debugLineNum = 382;BA.debugLine="If clvSuggestions.IsInitialized And clvSuggestio";
if (_clvsuggestions.IsInitialized() && _clvsuggestions._asview().IsInitialized()) { 
 //BA.debugLineNum = 383;BA.debugLine="clvSuggestions.AsView.SetLayoutAnimated(0, 0, 0";
_clvsuggestions._asview().SetLayoutAnimated((int) (0),(int) (0),(int) (0),_fieldwidth,_suggestionpanelheight);
 //BA.debugLineNum = 384;BA.debugLine="clvSuggestions.Base_Resize(FieldWidth, Suggesti";
_clvsuggestions._base_resize(_fieldwidth,_suggestionpanelheight);
 };
 //BA.debugLineNum = 386;BA.debugLine="pnlSuggestions.BringToFront";
_pnlsuggestions.BringToFront();
 }else {
 //BA.debugLineNum = 388;BA.debugLine="pnlSuggestions.Visible = False";
_pnlsuggestions.setVisible(__c.False);
 };
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return "";
}
public String  _btncancel_click() throws Exception{
 //BA.debugLineNum = 647;BA.debugLine="Sub btnCancel_Click";
 //BA.debugLineNum = 648;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 649;BA.debugLine="If IsScrapeMode Then";
if (_isscrapemode) { 
 //BA.debugLineNum = 650;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 //BA.debugLineNum = 651;BA.debugLine="CallSub(B4XPages.MainPage, \"ProcessNextScrapeIte";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"ProcessNextScrapeItem");
 }else {
 //BA.debugLineNum = 653;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 };
 //BA.debugLineNum = 655;BA.debugLine="ClearForm";
_clearform();
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return "";
}
public void  _btngetnumber_click() throws Exception{
ResumableSub_btnGetNumber_Click rsub = new ResumableSub_btnGetNumber_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnGetNumber_Click extends BA.ResumableSub {
public ResumableSub_btnGetNumber_Click(Geek.God.CRM.App.createclientpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.createclientpage parent;
String _cleanphone = "";
String _permission = "";
boolean _result = false;
anywheresoftware.b4a.objects.IntentWrapper _i = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 447;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
parent.__c.CallSubNew(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 448;BA.debugLine="Dim CleanPhone As String = txtPhone.Text.Replace(";
_cleanphone = parent._txtphone.getText().replace("(","").replace(")","").replace("-","").replace(" ","");
 //BA.debugLineNum = 449;BA.debugLine="If CleanPhone = \"\" Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if ((_cleanphone).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 451;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CALL_PHONE)";
parent._rp.CheckAndRequest(ba,parent._rp.PERMISSION_CALL_PHONE);
 //BA.debugLineNum = 452;BA.debugLine="Wait For B4XPage_PermissionResult (Permission As";
parent.__c.WaitFor("b4xpage_permissionresult", ba, this, null);
this.state = 13;
return;
case 13:
//C
this.state = 7;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 453;BA.debugLine="If Result Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_result) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 454;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 455;BA.debugLine="i.Initialize(i.ACTION_CALL, \"tel:\" & CleanPhone)";
_i.Initialize(_i.ACTION_CALL,"tel:"+_cleanphone);
 //BA.debugLineNum = 456;BA.debugLine="StartActivity(i)";
parent.__c.StartActivity(ba,(Object)(_i.getObject()));
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 458;BA.debugLine="xui.MsgboxAsync(\"Permission to make calls was de";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Permission to make calls was denied."),BA.ObjectToCharSequence("Error"));
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 460;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _b4xpage_permissionresult(String _permission,boolean _result) throws Exception{
}
public String  _btnhome_click() throws Exception{
 //BA.debugLineNum = 639;BA.debugLine="Sub btnHome_Click";
 //BA.debugLineNum = 640;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 641;BA.debugLine="IsScrapeMode = False";
_isscrapemode = __c.False;
 //BA.debugLineNum = 642;BA.debugLine="BufferedScrapeData.Clear";
_bufferedscrapedata.Clear();
 //BA.debugLineNum = 643;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 //BA.debugLineNum = 644;BA.debugLine="ClearForm";
_clearform();
 //BA.debugLineNum = 645;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click() throws Exception{
String _name = "";
String _secondname = "";
String _phone = "";
String _housephone = "";
String _usernotes = "";
String _finaladdress = "";
String _combinedname = "";
String _finalnotes = "";
String _selgroup = "";
String _spinval = "";
 //BA.debugLineNum = 559;BA.debugLine="Sub btnSave_Click";
 //BA.debugLineNum = 560;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 561;BA.debugLine="If IsSaving Then Return";
if (_issaving) { 
if (true) return "";};
 //BA.debugLineNum = 563;BA.debugLine="Dim Name As String = txtName.Text.Trim";
_name = _txtname.getText().trim();
 //BA.debugLineNum = 564;BA.debugLine="Dim SecondName As String = txtSecondName.Text.Tri";
_secondname = _txtsecondname.getText().trim();
 //BA.debugLineNum = 565;BA.debugLine="Dim Phone As String = txtPhone.Text.Trim";
_phone = _txtphone.getText().trim();
 //BA.debugLineNum = 566;BA.debugLine="Dim HousePhone As String = txtHousePhone.Text.Tri";
_housephone = _txthousephone.getText().trim();
 //BA.debugLineNum = 567;BA.debugLine="Dim UserNotes As String = txtNotes.Text.Trim";
_usernotes = _txtnotes.getText().trim();
 //BA.debugLineNum = 570;BA.debugLine="Dim FinalAddress As String = FullSelectedAddress";
_finaladdress = _fullselectedaddress;
 //BA.debugLineNum = 571;BA.debugLine="If FinalAddress = \"\" Then FinalAddress = txtAddre";
if ((_finaladdress).equals("")) { 
_finaladdress = _txtaddress.getText().trim();};
 //BA.debugLineNum = 574;BA.debugLine="If Name = \"\" Or Phone = \"\" Or FinalAddress = \"\" T";
if ((_name).equals("") || (_phone).equals("") || (_finaladdress).equals("")) { 
 //BA.debugLineNum = 575;BA.debugLine="xui.MsgboxAsync(\"First Name, Cell Number, and Ad";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("First Name, Cell Number, and Address are required."),BA.ObjectToCharSequence("Missing Info"));
 //BA.debugLineNum = 576;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 579;BA.debugLine="ime.HideKeyboard";
_ime.HideKeyboard(ba);
 //BA.debugLineNum = 580;BA.debugLine="IsSaving = True";
_issaving = __c.True;
 //BA.debugLineNum = 581;BA.debugLine="ProgressDialogShow(\"Checking for duplicates...\")";
__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Checking for duplicates..."));
 //BA.debugLineNum = 584;BA.debugLine="Dim CombinedName As String = Name";
_combinedname = _name;
 //BA.debugLineNum = 585;BA.debugLine="If SecondName <> \"\" Then CombinedName = Name & \"";
if ((_secondname).equals("") == false) { 
_combinedname = _name+" & "+_secondname;};
 //BA.debugLineNum = 589;BA.debugLine="Dim FinalNotes As String = UserNotes";
_finalnotes = _usernotes;
 //BA.debugLineNum = 591;BA.debugLine="PendingClientMap.Clear";
_pendingclientmap.Clear();
 //BA.debugLineNum = 592;BA.debugLine="PendingClientMap.Put(\"Name\", CombinedName)";
_pendingclientmap.Put((Object)("Name"),(Object)(_combinedname));
 //BA.debugLineNum = 593;BA.debugLine="PendingClientMap.Put(\"Phone\", Phone)";
_pendingclientmap.Put((Object)("Phone"),(Object)(_phone));
 //BA.debugLineNum = 596;BA.debugLine="PendingClientMap.Put(\"HousePhone\", HousePhone)";
_pendingclientmap.Put((Object)("HousePhone"),(Object)(_housephone));
 //BA.debugLineNum = 598;BA.debugLine="PendingClientMap.Put(\"Address\", FinalAddress)";
_pendingclientmap.Put((Object)("Address"),(Object)(_finaladdress));
 //BA.debugLineNum = 599;BA.debugLine="PendingClientMap.Put(\"Notes\", FinalNotes)";
_pendingclientmap.Put((Object)("Notes"),(Object)(_finalnotes));
 //BA.debugLineNum = 600;BA.debugLine="PendingClientMap.Put(\"ResourceName\", \"\")";
_pendingclientmap.Put((Object)("ResourceName"),(Object)(""));
 //BA.debugLineNum = 601;BA.debugLine="PendingClientMap.Put(\"Etag\", \"\")";
_pendingclientmap.Put((Object)("Etag"),(Object)(""));
 //BA.debugLineNum = 602;BA.debugLine="PendingClientMap.Put(\"IsScrapeWorkflow\", IsScrape";
_pendingclientmap.Put((Object)("IsScrapeWorkflow"),(Object)(_isscrapemode));
 //BA.debugLineNum = 604;BA.debugLine="If UserNotes <> \"\" Then";
if ((_usernotes).equals("") == false) { 
 //BA.debugLineNum = 605;BA.debugLine="PendingClientMap.Put(\"ScrapedIssue\", UserNotes)";
_pendingclientmap.Put((Object)("ScrapedIssue"),(Object)(_usernotes));
 };
 //BA.debugLineNum = 608;BA.debugLine="Dim SelGroup As String = \"Standard Client\" ' Defa";
_selgroup = "Standard Client";
 //BA.debugLineNum = 610;BA.debugLine="Dim SpinVal As String = spnGroup.SelectedItem";
_spinval = _spngroup.getSelectedItem();
 //BA.debugLineNum = 611;BA.debugLine="If SpinVal.Contains(\"Blacklisted\") Then SelGroup";
if (_spinval.contains("Blacklisted")) { 
_selgroup = "Blacklisted";};
 //BA.debugLineNum = 612;BA.debugLine="If SpinVal.Contains(\"Preferred\") Then SelGroup =";
if (_spinval.contains("Preferred")) { 
_selgroup = "Preferred";};
 //BA.debugLineNum = 613;BA.debugLine="PendingClientMap.Put(\"GroupLabel\", SelGroup)";
_pendingclientmap.Put((Object)("GroupLabel"),(Object)(_selgroup));
 //BA.debugLineNum = 615;BA.debugLine="CheckDuplicates(Name) ' Search by the primary Fir";
_checkduplicates(_name);
 //BA.debugLineNum = 616;BA.debugLine="End Sub";
return "";
}
public String  _checkduplicates(String _queryname) throws Exception{
 //BA.debugLineNum = 789;BA.debugLine="Sub CheckDuplicates(QueryName As String)";
 //BA.debugLineNum = 790;BA.debugLine="Log(\"Checking duplicates for: \" & QueryName)";
__c.LogImpl("08978433","Checking duplicates for: "+_queryname,0);
 //BA.debugLineNum = 791;BA.debugLine="FoundDuplicateName = \"\"";
_foundduplicatename = "";
 //BA.debugLineNum = 792;BA.debugLine="DuplicateCheckStep = 0";
_duplicatecheckstep = (int) (0);
 //BA.debugLineNum = 793;BA.debugLine="RunDuplicateCheckChain";
_runduplicatecheckchain();
 //BA.debugLineNum = 794;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 8;BA.debugLine="Private const PLACES_API_KEY As String = \"AIzaSyA";
_places_api_key = "AIzaSyAVOMjr8iK5af4oj2xjZntrKH6ec2lpvR4";
 //BA.debugLineNum = 11;BA.debugLine="Private sv As B4XView";
_sv = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private svPanel As B4XView";
_svpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private lblTitle As B4XView";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private btnHome As B4XView";
_btnhome = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private lblName As B4XView";
_lblname = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private lblSecondName As B4XView ' [NEW]";
_lblsecondname = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private lblPhone As B4XView";
_lblphone = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private lblHousePhone As B4XView";
_lblhousephone = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private lblAddr As B4XView";
_lbladdr = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private lblNotes As B4XView";
_lblnotes = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private lblGroup As B4XView";
_lblgroup = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private txtName As EditText";
_txtname = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private txtSecondName As EditText ' [FIXED] DECLA";
_txtsecondname = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private txtPhone As EditText";
_txtphone = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private txtHousePhone As EditText";
_txthousephone = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private txtAddress As EditText ' Real (Hidden dur";
_txtaddress = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private txtAddressDisplay As EditText ' Fake (Vis";
_txtaddressdisplay = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private txtNotes As EditText";
_txtnotes = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private spnGroup As Spinner";
_spngroup = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private clvSuggestions As CustomListView";
_clvsuggestions = new b4a.example3.customlistview();
 //BA.debugLineNum = 41;BA.debugLine="Private pnlSuggestions As B4XView";
_pnlsuggestions = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private SuggestionPanelHeight As Int = 0";
_suggestionpanelheight = (int) (0);
 //BA.debugLineNum = 45;BA.debugLine="Private btnSave As B4XView";
_btnsave = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private btnCancel As B4XView";
_btncancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private btnGetNumber As B4XView";
_btngetnumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new Geek.God.CRM.App.b4xdialog();
 //BA.debugLineNum = 53;BA.debugLine="Private ime As IME";
_ime = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 54;BA.debugLine="Private ResizeTimer As Timer";
_resizetimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 55;BA.debugLine="Private SearchTimer As Timer";
_searchtimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 56;BA.debugLine="Private IsPageReady As Boolean = False";
_ispageready = __c.False;
 //BA.debugLineNum = 59;BA.debugLine="Private PendingClientMap As Map";
_pendingclientmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 60;BA.debugLine="Private BufferedScrapeData As Map";
_bufferedscrapedata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 61;BA.debugLine="Private DuplicateCheckStep As Int = 0";
_duplicatecheckstep = (int) (0);
 //BA.debugLineNum = 62;BA.debugLine="Private FoundDuplicateName As String = \"\"";
_foundduplicatename = "";
 //BA.debugLineNum = 63;BA.debugLine="Private IsSaving As Boolean = False";
_issaving = __c.False;
 //BA.debugLineNum = 64;BA.debugLine="Public IsScrapeMode As Boolean = False";
_isscrapemode = __c.False;
 //BA.debugLineNum = 67;BA.debugLine="Private FullSelectedAddress As String = \"\"";
_fullselectedaddress = "";
 //BA.debugLineNum = 70;BA.debugLine="Private fontTitle As Typeface";
_fonttitle = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
 //BA.debugLineNum = 71;BA.debugLine="Private fontLabels As Typeface";
_fontlabels = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
 //BA.debugLineNum = 72;BA.debugLine="Private fontInputs As Typeface";
_fontinputs = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
 //BA.debugLineNum = 75;BA.debugLine="Private LastWidth As Int = 0";
_lastwidth = (int) (0);
 //BA.debugLineNum = 76;BA.debugLine="Private LastHeight As Int = 0";
_lastheight = (int) (0);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _clearform() throws Exception{
 //BA.debugLineNum = 618;BA.debugLine="Public Sub ClearForm";
 //BA.debugLineNum = 619;BA.debugLine="If txtName.IsInitialized Then txtName.Text = \"\"";
if (_txtname.IsInitialized()) { 
_txtname.setText(BA.ObjectToCharSequence(""));};
 //BA.debugLineNum = 620;BA.debugLine="If txtSecondName.IsInitialized Then txtSecondName";
if (_txtsecondname.IsInitialized()) { 
_txtsecondname.setText(BA.ObjectToCharSequence(""));};
 //BA.debugLineNum = 621;BA.debugLine="If txtPhone.IsInitialized Then txtPhone.Text = \"\"";
if (_txtphone.IsInitialized()) { 
_txtphone.setText(BA.ObjectToCharSequence(""));};
 //BA.debugLineNum = 622;BA.debugLine="If txtHousePhone.IsInitialized Then txtHousePhone";
if (_txthousephone.IsInitialized()) { 
_txthousephone.setText(BA.ObjectToCharSequence(""));};
 //BA.debugLineNum = 623;BA.debugLine="If txtAddress.IsInitialized Then txtAddress.Text";
if (_txtaddress.IsInitialized()) { 
_txtaddress.setText(BA.ObjectToCharSequence(""));};
 //BA.debugLineNum = 624;BA.debugLine="If txtAddressDisplay.IsInitialized Then txtAddres";
if (_txtaddressdisplay.IsInitialized()) { 
_txtaddressdisplay.setText(BA.ObjectToCharSequence(""));};
 //BA.debugLineNum = 625;BA.debugLine="If txtNotes.IsInitialized Then txtNotes.Text = \"\"";
if (_txtnotes.IsInitialized()) { 
_txtnotes.setText(BA.ObjectToCharSequence(""));};
 //BA.debugLineNum = 626;BA.debugLine="If spnGroup.IsInitialized Then spnGroup.SelectedI";
if (_spngroup.IsInitialized()) { 
_spngroup.setSelectedIndex((int) (0));};
 //BA.debugLineNum = 627;BA.debugLine="SuggestionPanelHeight = 0";
_suggestionpanelheight = (int) (0);
 //BA.debugLineNum = 628;BA.debugLine="FullSelectedAddress = \"\"";
_fullselectedaddress = "";
 //BA.debugLineNum = 629;BA.debugLine="IsScrapeMode = False";
_isscrapemode = __c.False;
 //BA.debugLineNum = 632;BA.debugLine="If txtAddressDisplay.IsInitialized Then txtAddres";
if (_txtaddressdisplay.IsInitialized()) { 
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_txtaddressdisplay.getObject()))).BringToFront();};
 //BA.debugLineNum = 633;BA.debugLine="End Sub";
return "";
}
public String  _clvsuggestions_itemclick(int _index,Object _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _datamap = null;
String _placeid = "";
 //BA.debugLineNum = 518;BA.debugLine="Sub clvSuggestions_ItemClick (Index As Int, Value";
 //BA.debugLineNum = 519;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 520;BA.debugLine="Dim DataMap As Map = Value";
_datamap = new anywheresoftware.b4a.objects.collections.Map();
_datamap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value));
 //BA.debugLineNum = 521;BA.debugLine="Dim PlaceID As String = DataMap.Get(\"PlaceID\")";
_placeid = BA.ObjectToString(_datamap.Get((Object)("PlaceID")));
 //BA.debugLineNum = 523;BA.debugLine="SearchTimer.Enabled = False";
_searchtimer.setEnabled(__c.False);
 //BA.debugLineNum = 524;BA.debugLine="SuggestionPanelHeight = 0";
_suggestionpanelheight = (int) (0);
 //BA.debugLineNum = 525;BA.debugLine="B4XPage_Resize(Root.Width, Root.Height)";
_b4xpage_resize(_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 527;BA.debugLine="FetchPlaceDetails(PlaceID)";
_fetchplacedetails(_placeid);
 //BA.debugLineNum = 528;BA.debugLine="End Sub";
return "";
}
public String  _fetchplacedetails(String _placeid) throws Exception{
Geek.God.CRM.App.httpjob _j = null;
String _url = "";
 //BA.debugLineNum = 736;BA.debugLine="Private Sub FetchPlaceDetails(PlaceID As String)";
 //BA.debugLineNum = 737;BA.debugLine="ProgressDialogShow(\"Fetching Address Details...\")";
__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Fetching Address Details..."));
 //BA.debugLineNum = 738;BA.debugLine="Dim j As HttpJob : j.Initialize(\"PlaceDetails\", M";
_j = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 738;BA.debugLine="Dim j As HttpJob : j.Initialize(\"PlaceDetails\", M";
_j._initialize /*String*/ (ba,"PlaceDetails",this);
 //BA.debugLineNum = 739;BA.debugLine="Dim url As String = \"https://maps.googleapis.com/";
_url = "https://maps.googleapis.com/maps/api/place/details/json?place_id="+_placeid+"&fields=address_components&sessiontoken=1234567890&key="+_places_api_key;
 //BA.debugLineNum = 740;BA.debugLine="j.Download(url)";
_j._download /*String*/ (_url);
 //BA.debugLineNum = 741;BA.debugLine="End Sub";
return "";
}
public String  _finalizesave() throws Exception{
 //BA.debugLineNum = 872;BA.debugLine="Sub FinalizeSave";
 //BA.debugLineNum = 873;BA.debugLine="ProgressDialogShow(\"Saving to Google Contacts...\"";
__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Saving to Google Contacts..."));
 //BA.debugLineNum = 874;BA.debugLine="CallSub2(B4XPages.MainPage, \"CreateNewContact\", P";
__c.CallSubNew2(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"CreateNewContact",(Object)(_pendingclientmap));
 //BA.debugLineNum = 875;BA.debugLine="ProceedAfterSave";
_proceedaftersave();
 //BA.debugLineNum = 876;BA.debugLine="End Sub";
return "";
}
public String  _getlastcalllogentry() throws Exception{
anywheresoftware.b4a.objects.collections.List _calls = null;
anywheresoftware.b4a.phone.CallLogWrapper _calllog = null;
anywheresoftware.b4a.phone.CallLogWrapper.CallItem _c = null;
String _rawnum = "";
String _cleannum = "";
 //BA.debugLineNum = 462;BA.debugLine="Private Sub GetLastCallLogEntry";
 //BA.debugLineNum = 463;BA.debugLine="Try";
try { //BA.debugLineNum = 464;BA.debugLine="Dim Calls As List";
_calls = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 465;BA.debugLine="Dim CallLog As CallLog";
_calllog = new anywheresoftware.b4a.phone.CallLogWrapper();
 //BA.debugLineNum = 466;BA.debugLine="Calls = CallLog.GetAll(1) ' Get 1 most recent ca";
_calls = _calllog.GetAll((int) (1));
 //BA.debugLineNum = 468;BA.debugLine="If Calls.Size > 0 Then";
if (_calls.getSize()>0) { 
 //BA.debugLineNum = 469;BA.debugLine="Dim c As CallItem = Calls.Get(0)";
_c = (anywheresoftware.b4a.phone.CallLogWrapper.CallItem)(_calls.Get((int) (0)));
 //BA.debugLineNum = 470;BA.debugLine="Dim RawNum As String = c.Number";
_rawnum = _c.Number;
 //BA.debugLineNum = 472;BA.debugLine="Dim CleanNum As String = RawNum.Replace(\"-\", \"\"";
_cleannum = _rawnum.replace("-","").replace(" ","").replace("(","").replace(")","").replace("+","");
 //BA.debugLineNum = 473;BA.debugLine="If CleanNum.Length > 10 And CleanNum.StartsWith";
if (_cleannum.length()>10 && _cleannum.startsWith("1")) { 
_cleannum = _cleannum.substring((int) (1));};
 //BA.debugLineNum = 476;BA.debugLine="If CleanNum.Length = 10 Then";
if (_cleannum.length()==10) { 
 //BA.debugLineNum = 477;BA.debugLine="txtPhone.Text = \"(\" & CleanNum.SubString2(0,3)";
_txtphone.setText(BA.ObjectToCharSequence("("+_cleannum.substring((int) (0),(int) (3))+") "+_cleannum.substring((int) (3),(int) (6))+"-"+_cleannum.substring((int) (6),(int) (10))));
 }else {
 //BA.debugLineNum = 479;BA.debugLine="txtPhone.Text = RawNum";
_txtphone.setText(BA.ObjectToCharSequence(_rawnum));
 };
 //BA.debugLineNum = 482;BA.debugLine="ToastMessageShow(\"Last caller autofilled!\", Fal";
__c.ToastMessageShow(BA.ObjectToCharSequence("Last caller autofilled!"),__c.False);
 }else {
 //BA.debugLineNum = 484;BA.debugLine="xui.MsgboxAsync(\"No calls found in log.\", \"Empt";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("No calls found in log."),BA.ObjectToCharSequence("Empty"));
 };
 } 
       catch (Exception e20) {
			ba.setLastException(e20); //BA.debugLineNum = 487;BA.debugLine="Log(\"Error accessing Call Log: \" & LastException";
__c.LogImpl("08060953","Error accessing Call Log: "+BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 488;BA.debugLine="xui.MsgboxAsync(\"Error reading Call Log.\", \"Erro";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error reading Call Log."),BA.ObjectToCharSequence("Error"));
 };
 //BA.debugLineNum = 490;BA.debugLine="End Sub";
return "";
}
public void  _handleduplicatecheck(Geek.God.CRM.App.httpjob _job) throws Exception{
ResumableSub_HandleDuplicateCheck rsub = new ResumableSub_HandleDuplicateCheck(this,_job);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleDuplicateCheck extends BA.ResumableSub {
public ResumableSub_HandleDuplicateCheck(Geek.God.CRM.App.createclientpage parent,Geek.God.CRM.App.httpjob _job) {
this.parent = parent;
this._job = _job;
}
Geek.God.CRM.App.createclientpage parent;
Geek.God.CRM.App.httpjob _job;
anywheresoftware.b4a.objects.collections.JSONParser _dupparser = null;
anywheresoftware.b4a.objects.collections.Map _duproot = null;
anywheresoftware.b4a.objects.collections.List _dupresults = null;
anywheresoftware.b4a.objects.collections.Map _dupitem = null;
anywheresoftware.b4a.objects.collections.Map _dupperson = null;
anywheresoftware.b4a.objects.collections.List _dupnames = null;
anywheresoftware.b4a.objects.collections.Map _dupnamemap = null;
Object _answ = null;
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
 //BA.debugLineNum = 825;BA.debugLine="Dim dupParser As JSONParser";
_dupparser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 826;BA.debugLine="Dim dupRoot As Map";
_duproot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 827;BA.debugLine="Dim dupResults As List";
_dupresults = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 828;BA.debugLine="Dim dupItem As Map";
_dupitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 829;BA.debugLine="Dim dupPerson As Map";
_dupperson = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 830;BA.debugLine="Dim dupNames As List";
_dupnames = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 831;BA.debugLine="Dim dupNameMap As Map";
_dupnamemap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 833;BA.debugLine="dupParser.Initialize(Job.GetString)";
_dupparser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 834;BA.debugLine="dupRoot = dupParser.NextObject";
_duproot = _dupparser.NextObject();
 //BA.debugLineNum = 836;BA.debugLine="If dupRoot.ContainsKey(\"results\") Then";
if (true) break;

case 1:
//if
this.state = 20;
if (_duproot.ContainsKey((Object)("results"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 837;BA.debugLine="dupResults = dupRoot.Get(\"results\")";
_dupresults = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_duproot.Get((Object)("results"))));
 //BA.debugLineNum = 838;BA.debugLine="If dupResults.Size > 0 Then";
if (true) break;

case 4:
//if
this.state = 19;
if (_dupresults.getSize()>0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 839;BA.debugLine="dupItem = dupResults.Get(0)";
_dupitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_dupresults.Get((int) (0))));
 //BA.debugLineNum = 841;BA.debugLine="If dupItem.ContainsKey(\"person\") Then";
if (true) break;

case 7:
//if
this.state = 18;
if (_dupitem.ContainsKey((Object)("person"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 842;BA.debugLine="dupPerson = dupItem.Get(\"person\")";
_dupperson = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_dupitem.Get((Object)("person"))));
 //BA.debugLineNum = 844;BA.debugLine="If dupPerson.ContainsKey(\"names\") Then";
if (true) break;

case 10:
//if
this.state = 17;
if (_dupperson.ContainsKey((Object)("names"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 845;BA.debugLine="dupNames = dupPerson.Get(\"names\")";
_dupnames = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_dupperson.Get((Object)("names"))));
 //BA.debugLineNum = 847;BA.debugLine="If dupNames.Size > 0 Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_dupnames.getSize()>0) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 848;BA.debugLine="dupNameMap = dupNames.Get(0)";
_dupnamemap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_dupnames.Get((int) (0))));
 //BA.debugLineNum = 849;BA.debugLine="FoundDuplicateName = dupNameMap.GetDefault(\"";
parent._foundduplicatename = BA.ObjectToString(_dupnamemap.GetDefault((Object)("displayName"),(Object)("Unknown")));
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 18;
;
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
;
 //BA.debugLineNum = 856;BA.debugLine="If FoundDuplicateName <> \"\" Then";

case 20:
//if
this.state = 31;
if ((parent._foundduplicatename).equals("") == false) { 
this.state = 22;
}else {
this.state = 30;
}if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 857;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 858;BA.debugLine="Dim Answ As Object = xui.Msgbox2Async(\"A contact";
_answ = parent._xui.Msgbox2Async(ba,BA.ObjectToCharSequence("A contact named '"+parent._foundduplicatename+"' already exists. Create anyway?"),BA.ObjectToCharSequence("Duplicate Warning"),"Yes","Cancel","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)));
 //BA.debugLineNum = 859;BA.debugLine="Wait For (Answ) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, _answ);
this.state = 32;
return;
case 32:
//C
this.state = 23;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 860;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 23:
//if
this.state = 28;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 28;
 //BA.debugLineNum = 861;BA.debugLine="ProgressDialogShow(\"Saving...\")";
parent.__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Saving..."));
 //BA.debugLineNum = 862;BA.debugLine="FinalizeSave";
parent._finalizesave();
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 864;BA.debugLine="IsSaving = False";
parent._issaving = parent.__c.False;
 if (true) break;

case 28:
//C
this.state = 31;
;
 if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 867;BA.debugLine="DuplicateCheckStep = DuplicateCheckStep + 1";
parent._duplicatecheckstep = (int) (parent._duplicatecheckstep+1);
 //BA.debugLineNum = 868;BA.debugLine="RunDuplicateCheckChain";
parent._runduplicatecheckchain();
 if (true) break;

case 31:
//C
this.state = -1;
;
 //BA.debugLineNum = 870;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _msgbox_result(int _result) throws Exception{
}
public String  _handleplacedetails(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
anywheresoftware.b4a.objects.collections.Map _result = null;
anywheresoftware.b4a.objects.collections.List _components = null;
String _housenum = "";
String _street = "";
String _city = "";
String _state = "";
String _zip = "";
anywheresoftware.b4a.objects.collections.Map _comp = null;
anywheresoftware.b4a.objects.collections.List _types = null;
String _lname = "";
String _sname = "";
String _shortaddr = "";
String _fulladdr = "";
 //BA.debugLineNum = 743;BA.debugLine="Sub HandlePlaceDetails(Job As HttpJob)";
 //BA.debugLineNum = 744;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 745;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 745;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 746;BA.debugLine="Dim rootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 748;BA.debugLine="If rootMap.GetDefault(\"status\", \"\") = \"OK\" Then";
if ((_rootmap.GetDefault((Object)("status"),(Object)(""))).equals((Object)("OK"))) { 
 //BA.debugLineNum = 749;BA.debugLine="Dim result As Map = rootMap.Get(\"result\")";
_result = new anywheresoftware.b4a.objects.collections.Map();
_result = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rootmap.Get((Object)("result"))));
 //BA.debugLineNum = 750;BA.debugLine="Dim components As List = result.Get(\"address_com";
_components = new anywheresoftware.b4a.objects.collections.List();
_components = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_result.Get((Object)("address_components"))));
 //BA.debugLineNum = 752;BA.debugLine="Dim HouseNum As String = \"\"";
_housenum = "";
 //BA.debugLineNum = 753;BA.debugLine="Dim Street As String = \"\"";
_street = "";
 //BA.debugLineNum = 754;BA.debugLine="Dim City As String = \"\"";
_city = "";
 //BA.debugLineNum = 755;BA.debugLine="Dim State As String = \"\"";
_state = "";
 //BA.debugLineNum = 756;BA.debugLine="Dim Zip As String = \"\"";
_zip = "";
 //BA.debugLineNum = 759;BA.debugLine="For Each comp As Map In components";
_comp = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group13 = _components;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_comp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group13.Get(index13)));
 //BA.debugLineNum = 760;BA.debugLine="Dim types As List = comp.Get(\"types\")";
_types = new anywheresoftware.b4a.objects.collections.List();
_types = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_comp.Get((Object)("types"))));
 //BA.debugLineNum = 761;BA.debugLine="Dim LName As String = comp.Get(\"long_name\")";
_lname = BA.ObjectToString(_comp.Get((Object)("long_name")));
 //BA.debugLineNum = 762;BA.debugLine="Dim SName As String = comp.Get(\"short_name\")";
_sname = BA.ObjectToString(_comp.Get((Object)("short_name")));
 //BA.debugLineNum = 764;BA.debugLine="If types.IndexOf(\"street_number\") > -1 Then Hou";
if (_types.IndexOf((Object)("street_number"))>-1) { 
_housenum = _lname;};
 //BA.debugLineNum = 765;BA.debugLine="If types.IndexOf(\"route\") > -1 Then Street = LN";
if (_types.IndexOf((Object)("route"))>-1) { 
_street = _lname;};
 //BA.debugLineNum = 766;BA.debugLine="If types.IndexOf(\"locality\") > -1 Then City = L";
if (_types.IndexOf((Object)("locality"))>-1) { 
_city = _lname;};
 //BA.debugLineNum = 767;BA.debugLine="If types.IndexOf(\"administrative_area_level_1\")";
if (_types.IndexOf((Object)("administrative_area_level_1"))>-1) { 
_state = _sname;};
 //BA.debugLineNum = 768;BA.debugLine="If types.IndexOf(\"postal_code\") > -1 Then Zip =";
if (_types.IndexOf((Object)("postal_code"))>-1) { 
_zip = _lname;};
 }
};
 //BA.debugLineNum = 772;BA.debugLine="Dim ShortAddr As String = HouseNum & \" \" & Stree";
_shortaddr = _housenum+" "+_street;
 //BA.debugLineNum = 773;BA.debugLine="If Zip <> \"\" Then ShortAddr = ShortAddr & \", \" &";
if ((_zip).equals("") == false) { 
_shortaddr = _shortaddr+", "+_zip;};
 //BA.debugLineNum = 776;BA.debugLine="Dim FullAddr As String = HouseNum & \" \" & Street";
_fulladdr = _housenum+" "+_street+", "+_city+" "+_state+", "+_zip;
 //BA.debugLineNum = 779;BA.debugLine="ShortAddr = ShortAddr.Replace(\"  \", \" \").Trim";
_shortaddr = _shortaddr.replace("  "," ").trim();
 //BA.debugLineNum = 780;BA.debugLine="FullAddr = FullAddr.Replace(\"  \", \" \").Replace(\"";
_fulladdr = _fulladdr.replace("  "," ").replace(" ,",",").trim();
 //BA.debugLineNum = 782;BA.debugLine="FullSelectedAddress = FullAddr";
_fullselectedaddress = _fulladdr;
 //BA.debugLineNum = 783;BA.debugLine="SearchTimer.Enabled = False";
_searchtimer.setEnabled(__c.False);
 //BA.debugLineNum = 784;BA.debugLine="txtAddress.Text = ShortAddr";
_txtaddress.setText(BA.ObjectToCharSequence(_shortaddr));
 };
 //BA.debugLineNum = 786;BA.debugLine="End Sub";
return "";
}
public String  _handleplacesresult(Geek.God.CRM.App.httpjob _job) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
anywheresoftware.b4a.objects.collections.List _predictions = null;
int _rowheight = 0;
anywheresoftware.b4a.objects.collections.Map _pred = null;
String _desc = "";
String _pid = "";
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
anywheresoftware.b4a.objects.collections.Map _datamap = null;
 //BA.debugLineNum = 699;BA.debugLine="Sub HandlePlacesResult(Job As HttpJob)";
 //BA.debugLineNum = 700;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 700;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job.";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 701;BA.debugLine="Dim rootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 703;BA.debugLine="If rootMap.GetDefault(\"status\", \"\") = \"OK\" Then";
if ((_rootmap.GetDefault((Object)("status"),(Object)(""))).equals((Object)("OK"))) { 
 //BA.debugLineNum = 704;BA.debugLine="Dim predictions As List = rootMap.Get(\"predictio";
_predictions = new anywheresoftware.b4a.objects.collections.List();
_predictions = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_rootmap.Get((Object)("predictions"))));
 //BA.debugLineNum = 706;BA.debugLine="clvSuggestions.Clear";
_clvsuggestions._clear();
 //BA.debugLineNum = 707;BA.debugLine="Dim RowHeight As Int = 45dip";
_rowheight = __c.DipToCurrent((int) (45));
 //BA.debugLineNum = 709;BA.debugLine="For Each pred As Map In predictions";
_pred = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group8 = _predictions;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_pred = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group8.Get(index8)));
 //BA.debugLineNum = 710;BA.debugLine="Dim desc As String = pred.Get(\"description\")";
_desc = BA.ObjectToString(_pred.Get((Object)("description")));
 //BA.debugLineNum = 711;BA.debugLine="Dim pId As String = pred.Get(\"place_id\")";
_pid = BA.ObjectToString(_pred.Get((Object)("place_id")));
 //BA.debugLineNum = 713;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 714;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, clvSuggestions.AsV";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_clvsuggestions._asview().getWidth(),_rowheight);
 //BA.debugLineNum = 715;BA.debugLine="p.Color = xui.Color_White";
_p.setColor(_xui.Color_White);
 //BA.debugLineNum = 717;BA.debugLine="Dim lbl As Label : lbl.Initialize(\"\")";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 717;BA.debugLine="Dim lbl As Label : lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 718;BA.debugLine="Dim xLbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 719;BA.debugLine="xLbl.Text = \"  \" & desc";
_xlbl.setText(BA.ObjectToCharSequence("  "+_desc));
 //BA.debugLineNum = 720;BA.debugLine="xLbl.TextColor = xui.Color_Black";
_xlbl.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 721;BA.debugLine="xLbl.TextSize = 14";
_xlbl.setTextSize((float) (14));
 //BA.debugLineNum = 722;BA.debugLine="xLbl.SetTextAlignment(\"CENTER\", \"LEFT\")";
_xlbl.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 723;BA.debugLine="p.AddView(xLbl, 0, 0, p.Width, RowHeight)";
_p.AddView((android.view.View)(_xlbl.getObject()),(int) (0),(int) (0),_p.getWidth(),_rowheight);
 //BA.debugLineNum = 725;BA.debugLine="Dim DataMap As Map = CreateMap(\"Desc\": desc, \"P";
_datamap = new anywheresoftware.b4a.objects.collections.Map();
_datamap = __c.createMap(new Object[] {(Object)("Desc"),(Object)(_desc),(Object)("PlaceID"),(Object)(_pid)});
 //BA.debugLineNum = 726;BA.debugLine="clvSuggestions.Add(p, DataMap)";
_clvsuggestions._add(_p,(Object)(_datamap.getObject()));
 }
};
 //BA.debugLineNum = 729;BA.debugLine="SuggestionPanelHeight = Min(predictions.Size * R";
_suggestionpanelheight = (int) (__c.Min(_predictions.getSize()*_rowheight,__c.DipToCurrent((int) (200))));
 //BA.debugLineNum = 730;BA.debugLine="pnlSuggestions.BringToFront";
_pnlsuggestions.BringToFront();
 //BA.debugLineNum = 731;BA.debugLine="B4XPage_Resize(Root.Width, Root.Height)";
_b4xpage_resize(_root.getWidth(),_root.getHeight());
 };
 //BA.debugLineNum = 733;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 79;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 80;BA.debugLine="ime.Initialize(\"ime\")";
_ime.Initialize("ime");
 //BA.debugLineNum = 81;BA.debugLine="ResizeTimer.Initialize(\"ResizeTimer\", 500)";
_resizetimer.Initialize(ba,"ResizeTimer",(long) (500));
 //BA.debugLineNum = 82;BA.debugLine="ResizeTimer.Enabled = False";
_resizetimer.setEnabled(__c.False);
 //BA.debugLineNum = 83;BA.debugLine="SearchTimer.Initialize(\"SearchTimer\", 600)";
_searchtimer.Initialize(ba,"SearchTimer",(long) (600));
 //BA.debugLineNum = 84;BA.debugLine="SearchTimer.Enabled = False";
_searchtimer.setEnabled(__c.False);
 //BA.debugLineNum = 85;BA.debugLine="PendingClientMap.Initialize";
_pendingclientmap.Initialize();
 //BA.debugLineNum = 86;BA.debugLine="BufferedScrapeData.Initialize";
_bufferedscrapedata.Initialize();
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(Geek.God.CRM.App.httpjob _job) throws Exception{
 //BA.debugLineNum = 673;BA.debugLine="Sub JobDone (Job As HttpJob)";
 //BA.debugLineNum = 674;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 675;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"CheckDuplicates","Places","PlaceDetails")) {
case 0: {
 //BA.debugLineNum = 676;BA.debugLine="Case \"CheckDuplicates\": HandleDuplicateCheck(Jo";
_handleduplicatecheck(_job);
 break; }
case 1: {
 //BA.debugLineNum = 677;BA.debugLine="Case \"Places\": HandlePlacesResult(Job)";
_handleplacesresult(_job);
 break; }
case 2: {
 //BA.debugLineNum = 678;BA.debugLine="Case \"PlaceDetails\": HandlePlaceDetails(Job)";
_handleplacedetails(_job);
 break; }
}
;
 }else {
 //BA.debugLineNum = 681;BA.debugLine="Log(\">>> [API ERROR] \" & Job.JobName & \": \" & Jo";
__c.LogImpl("08650760",">>> [API ERROR] "+_job._jobname /*String*/ +": "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 682;BA.debugLine="If Job.JobName = \"CheckDuplicates\" Then Finalize";
if ((_job._jobname /*String*/ ).equals("CheckDuplicates")) { 
_finalizesave();};
 };
 //BA.debugLineNum = 684;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 685;BA.debugLine="End Sub";
return "";
}
public String  _loadlocalfonts() throws Exception{
String _fontdir = "";
 //BA.debugLineNum = 241;BA.debugLine="Private Sub LoadLocalFonts";
 //BA.debugLineNum = 242;BA.debugLine="Dim FontDir As String = rp.GetSafeDirDefaultExter";
_fontdir = _rp.GetSafeDirDefaultExternal("Fonts");
 //BA.debugLineNum = 244;BA.debugLine="fontTitle = SafeLoadFont(FontDir, \"addnewclient -";
_fonttitle = _safeloadfont(_fontdir,"addnewclient - title label.ttf");
 //BA.debugLineNum = 245;BA.debugLine="If fontTitle = Typeface.DEFAULT Then fontTitle =";
if ((_fonttitle).equals((android.graphics.Typeface)(__c.Typeface.DEFAULT))) { 
_fonttitle = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT_BOLD));};
 //BA.debugLineNum = 247;BA.debugLine="fontLabels = SafeLoadFont(FontDir, \"addnewclient";
_fontlabels = _safeloadfont(_fontdir,"addnewclient - labels.ttf");
 //BA.debugLineNum = 248;BA.debugLine="If fontLabels = Typeface.DEFAULT Then fontLabels";
if ((_fontlabels).equals((android.graphics.Typeface)(__c.Typeface.DEFAULT))) { 
_fontlabels = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT_BOLD));};
 //BA.debugLineNum = 250;BA.debugLine="fontInputs = SafeLoadFont(FontDir, \"addnewclient";
_fontinputs = _safeloadfont(_fontdir,"addnewclient - buttons.ttf");
 //BA.debugLineNum = 251;BA.debugLine="If fontInputs = Typeface.DEFAULT Then Log(\">>> [F";
if ((_fontinputs).equals((android.graphics.Typeface)(__c.Typeface.DEFAULT))) { 
__c.LogImpl("07536650",">>> [FONTS] Button font failed to load! Check file name.",0);};
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return "";
}
public String  _populatescrapedata(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
String _scrapedaddr = "";
 //BA.debugLineNum = 534;BA.debugLine="Public Sub PopulateScrapeData(Data As Map)";
 //BA.debugLineNum = 535;BA.debugLine="IsScrapeMode = True";
_isscrapemode = __c.True;
 //BA.debugLineNum = 536;BA.debugLine="BufferedScrapeData = Data";
_bufferedscrapedata = _data;
 //BA.debugLineNum = 538;BA.debugLine="txtName.Text = Data.GetDefault(\"Name\", \"\")";
_txtname.setText(BA.ObjectToCharSequence(_data.GetDefault((Object)("Name"),(Object)(""))));
 //BA.debugLineNum = 541;BA.debugLine="txtSecondName.Text = Data.GetDefault(\"Name2\", \"\")";
_txtsecondname.setText(BA.ObjectToCharSequence(_data.GetDefault((Object)("Name2"),(Object)(""))));
 //BA.debugLineNum = 543;BA.debugLine="txtPhone.Text = Data.GetDefault(\"Phone\", \"\")";
_txtphone.setText(BA.ObjectToCharSequence(_data.GetDefault((Object)("Phone"),(Object)(""))));
 //BA.debugLineNum = 545;BA.debugLine="Dim ScrapedAddr As String = Data.GetDefault(\"Addr";
_scrapedaddr = BA.ObjectToString(_data.GetDefault((Object)("Address"),(Object)("")));
 //BA.debugLineNum = 548;BA.debugLine="txtAddress.Text = ScrapedAddr";
_txtaddress.setText(BA.ObjectToCharSequence(_scrapedaddr));
 //BA.debugLineNum = 549;BA.debugLine="txtAddressDisplay.Text = ScrapedAddr";
_txtaddressdisplay.setText(BA.ObjectToCharSequence(_scrapedaddr));
 //BA.debugLineNum = 550;BA.debugLine="FullSelectedAddress = ScrapedAddr";
_fullselectedaddress = _scrapedaddr;
 //BA.debugLineNum = 552;BA.debugLine="txtNotes.Text = Data.GetDefault(\"Notes\", \"\")";
_txtnotes.setText(BA.ObjectToCharSequence(_data.GetDefault((Object)("Notes"),(Object)(""))));
 //BA.debugLineNum = 553;BA.debugLine="txtHousePhone.Text = \"\"";
_txthousephone.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 556;BA.debugLine="txtAddressDisplay.As(B4XView).BringToFront";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_txtaddressdisplay.getObject()))).BringToFront();
 //BA.debugLineNum = 557;BA.debugLine="End Sub";
return "";
}
public void  _proceedaftersave() throws Exception{
ResumableSub_ProceedAfterSave rsub = new ResumableSub_ProceedAfterSave(this);
rsub.resume(ba, null);
}
public static class ResumableSub_ProceedAfterSave extends BA.ResumableSub {
public ResumableSub_ProceedAfterSave(Geek.God.CRM.App.createclientpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.createclientpage parent;
int _fileres = 0;
int _apptres = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 882;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 883;BA.debugLine="IsSaving = False";
parent._issaving = parent.__c.False;
 //BA.debugLineNum = 885;BA.debugLine="If IsScrapeMode Then";
if (true) break;

case 1:
//if
this.state = 18;
if (parent._isscrapemode) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 887;BA.debugLine="Wait For (xui.Msgbox2Async(\"Client Saved! What s";
parent.__c.WaitFor("msgbox_result", ba, this, parent._xui.Msgbox2Async(ba,BA.ObjectToCharSequence("Client Saved! What should we do with the raw voicemail files?"),BA.ObjectToCharSequence("Voicemail Cleanup"),"Archive","Keep","Delete",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null))));
this.state = 19;
return;
case 19:
//C
this.state = 4;
_fileres = (Integer) result[0];
;
 //BA.debugLineNum = 888;BA.debugLine="If FileRes = xui.DialogResponse_Positive Then '";
if (true) break;

case 4:
//if
this.state = 9;
if (_fileres==parent._xui.DialogResponse_Positive) { 
this.state = 6;
}else if(_fileres==parent._xui.DialogResponse_Negative) { 
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 889;BA.debugLine="CallSub2(B4XPages.MainPage, \"ArchiveVoicemail\",";
parent.__c.CallSubNew2(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"ArchiveVoicemail",(Object)(parent._bufferedscrapedata));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 891;BA.debugLine="CallSub2(B4XPages.MainPage, \"DeleteVoicemail\",";
parent.__c.CallSubNew2(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"DeleteVoicemail",(Object)(parent._bufferedscrapedata));
 if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 895;BA.debugLine="Wait For (xui.Msgbox2Async(\"Book an appointment";
parent.__c.WaitFor("msgbox_result", ba, this, parent._xui.Msgbox2Async(ba,BA.ObjectToCharSequence("Book an appointment for this client now?"),BA.ObjectToCharSequence("Next Step"),"Yes","No","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null))));
this.state = 20;
return;
case 20:
//C
this.state = 10;
_apptres = (Integer) result[0];
;
 //BA.debugLineNum = 896;BA.debugLine="If ApptRes = xui.DialogResponse_Positive Then";
if (true) break;

case 10:
//if
this.state = 15;
if (_apptres==parent._xui.DialogResponse_Positive) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 //BA.debugLineNum = 897;BA.debugLine="PendingClientMap.Put(\"IsScrapeWorkflow\", True)";
parent._pendingclientmap.Put((Object)("IsScrapeWorkflow"),(Object)(parent.__c.True));
 //BA.debugLineNum = 898;BA.debugLine="B4XPages.ShowPage(\"AppointmentPage\")";
parent._b4xpages._showpage /*String*/ (ba,"AppointmentPage");
 //BA.debugLineNum = 899;BA.debugLine="CallSub2(B4XPages.MainPage.appointmentScreen, \"";
parent.__c.CallSubNew2(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)._appointmentscreen /*Geek.God.CRM.App.appointmentpage*/ ),"LoadClientForAppt",(Object)(parent._pendingclientmap));
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 901;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
parent._b4xpages._showpage /*String*/ (ba,"MainPage");
 //BA.debugLineNum = 902;BA.debugLine="CallSub(B4XPages.MainPage, \"ProcessNextScrapeIt";
parent.__c.CallSubNew(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"ProcessNextScrapeItem");
 if (true) break;

case 15:
//C
this.state = 18;
;
 //BA.debugLineNum = 905;BA.debugLine="ClearForm";
parent._clearform();
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 907;BA.debugLine="xui.MsgboxAsync(\"Client Saved Successfully!\", \"S";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Client Saved Successfully!"),BA.ObjectToCharSequence("Success"));
 //BA.debugLineNum = 908;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
parent._b4xpages._showpage /*String*/ (ba,"MainPage");
 //BA.debugLineNum = 909;BA.debugLine="ClearForm";
parent._clearform();
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 911;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _redrawui(int _currentw) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Public Sub RedrawUI(CurrentW As Int)";
 //BA.debugLineNum = 275;BA.debugLine="If Root.IsInitialized = False Then Return";
if (_root.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 276;BA.debugLine="B4XPage_Resize(CurrentW, Root.Height)";
_b4xpage_resize(_currentw,_root.getHeight());
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return "";
}
public String  _resizetimer_tick() throws Exception{
int _screenw = 0;
int _screenh = 0;
 //BA.debugLineNum = 89;BA.debugLine="Private Sub ResizeTimer_Tick";
 //BA.debugLineNum = 90;BA.debugLine="If IsPageReady = False Then Return";
if (_ispageready==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 91;BA.debugLine="If Root.IsInitialized = False Then Return";
if (_root.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 92;BA.debugLine="Dim ScreenW As Int = GetDeviceLayoutValues.Width";
_screenw = __c.GetDeviceLayoutValues(ba).Width;
 //BA.debugLineNum = 93;BA.debugLine="Dim ScreenH As Int = GetDeviceLayoutValues.Height";
_screenh = __c.GetDeviceLayoutValues(ba).Height;
 //BA.debugLineNum = 94;BA.debugLine="If Abs(ScreenW - LastWidth) > 10dip Or Abs(Screen";
if (__c.Abs(_screenw-_lastwidth)>__c.DipToCurrent((int) (10)) || __c.Abs(_screenh-_lastheight)>__c.DipToCurrent((int) (10))) { 
 //BA.debugLineNum = 95;BA.debugLine="B4XPage_Resize(ScreenW, ScreenH)";
_b4xpage_resize(_screenw,_screenh);
 };
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _runduplicatecheckchain() throws Exception{
String _query = "";
Geek.God.CRM.App.httpjob _j = null;
String _url = "";
 //BA.debugLineNum = 796;BA.debugLine="Sub RunDuplicateCheckChain";
 //BA.debugLineNum = 797;BA.debugLine="Dim Query As String = \"\"";
_query = "";
 //BA.debugLineNum = 798;BA.debugLine="If PendingClientMap.IsInitialized = False Then";
if (_pendingclientmap.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 799;BA.debugLine="FinalizeSave";
_finalizesave();
 //BA.debugLineNum = 800;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 803;BA.debugLine="Select DuplicateCheckStep";
switch (_duplicatecheckstep) {
case 0: {
 //BA.debugLineNum = 804;BA.debugLine="Case 0 : Query = PendingClientMap.Get(\"Name\")";
_query = BA.ObjectToString(_pendingclientmap.Get((Object)("Name")));
 break; }
case 1: {
 //BA.debugLineNum = 805;BA.debugLine="Case 1 : Query = PendingClientMap.Get(\"Phone\")";
_query = BA.ObjectToString(_pendingclientmap.Get((Object)("Phone")));
 break; }
default: {
 //BA.debugLineNum = 807;BA.debugLine="FinalizeSave";
_finalizesave();
 //BA.debugLineNum = 808;BA.debugLine="Return";
if (true) return "";
 break; }
}
;
 //BA.debugLineNum = 811;BA.debugLine="If Query.Length < 3 Then";
if (_query.length()<3) { 
 //BA.debugLineNum = 812;BA.debugLine="DuplicateCheckStep = DuplicateCheckStep + 1";
_duplicatecheckstep = (int) (_duplicatecheckstep+1);
 //BA.debugLineNum = 813;BA.debugLine="RunDuplicateCheckChain";
_runduplicatecheckchain();
 //BA.debugLineNum = 814;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 817;BA.debugLine="Dim j As HttpJob";
_j = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 818;BA.debugLine="j.Initialize(\"CheckDuplicates\", Me)";
_j._initialize /*String*/ (ba,"CheckDuplicates",this);
 //BA.debugLineNum = 819;BA.debugLine="Dim url As String = \"https://people.googleapis.co";
_url = "https://people.googleapis.com/v1/people:searchContacts?query="+_query.replace(" ","%20")+"&readMask=names,phoneNumbers";
 //BA.debugLineNum = 820;BA.debugLine="j.Download(url)";
_j._download /*String*/ (_url);
 //BA.debugLineNum = 821;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", \"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)._oauth2 /*Geek.God.CRM.App.googleoauth2*/ ._access_token /*String*/ );
 //BA.debugLineNum = 822;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper  _safeloadfont(String _dirpath,String _filename) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
String _path = "";
Object _nativefont = null;
 //BA.debugLineNum = 254;BA.debugLine="Private Sub SafeLoadFont(DirPath As String, FileNa";
 //BA.debugLineNum = 255;BA.debugLine="Try";
try { //BA.debugLineNum = 256;BA.debugLine="If File.Exists(DirPath, FileName) Then";
if (__c.File.Exists(_dirpath,_filename)) { 
 //BA.debugLineNum = 257;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 258;BA.debugLine="jo.InitializeStatic(\"android.graphics.Typeface\"";
_jo.InitializeStatic("android.graphics.Typeface");
 //BA.debugLineNum = 259;BA.debugLine="Dim Path As String = File.Combine(DirPath, File";
_path = __c.File.Combine(_dirpath,_filename);
 //BA.debugLineNum = 260;BA.debugLine="Dim NativeFont As Object = jo.RunMethod(\"create";
_nativefont = _jo.RunMethod("createFromFile",new Object[]{(Object)(_path)});
 //BA.debugLineNum = 261;BA.debugLine="If NativeFont <> Null Then Return NativeFont";
if (_nativefont!= null) { 
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(_nativefont));};
 };
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 264;BA.debugLine="Log(\"Error loading font: \" & LastException.Messa";
__c.LogImpl("07602186","Error loading font: "+__c.LastException(ba).getMessage(),0);
 };
 //BA.debugLineNum = 266;BA.debugLine="If File.Exists(File.DirAssets, FileName) Then Ret";
if (__c.File.Exists(__c.File.getDirAssets(),_filename)) { 
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.LoadFromAssets(_filename)));};
 //BA.debugLineNum = 267;BA.debugLine="Return Typeface.DEFAULT";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public String  _searchtimer_tick() throws Exception{
String _query = "";
Geek.God.CRM.App.httpjob _j = null;
String _url = "";
 //BA.debugLineNum = 688;BA.debugLine="Sub SearchTimer_Tick";
 //BA.debugLineNum = 689;BA.debugLine="SearchTimer.Enabled = False";
_searchtimer.setEnabled(__c.False);
 //BA.debugLineNum = 690;BA.debugLine="Dim query As String = txtAddress.Text.Trim";
_query = _txtaddress.getText().trim();
 //BA.debugLineNum = 691;BA.debugLine="If query.Length < 3 Then Return";
if (_query.length()<3) { 
if (true) return "";};
 //BA.debugLineNum = 693;BA.debugLine="Dim j As HttpJob : j.Initialize(\"Places\", Me)";
_j = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 693;BA.debugLine="Dim j As HttpJob : j.Initialize(\"Places\", Me)";
_j._initialize /*String*/ (ba,"Places",this);
 //BA.debugLineNum = 694;BA.debugLine="Dim url As String = \"https://maps.googleapis.com/";
_url = "https://maps.googleapis.com/maps/api/place/autocomplete/json?input="+_query.replace(" ","%20")+"&types=address&sessiontoken=1234567890&key="+_places_api_key;
 //BA.debugLineNum = 696;BA.debugLine="j.Download(url)";
_j._download /*String*/ (_url);
 //BA.debugLineNum = 697;BA.debugLine="End Sub";
return "";
}
public String  _txtaddress_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 508;BA.debugLine="Sub txtAddress_TextChanged (Old As String, New As";
 //BA.debugLineNum = 509;BA.debugLine="If New.Length < 3 Then";
if (_new.length()<3) { 
 //BA.debugLineNum = 510;BA.debugLine="SuggestionPanelHeight = 0";
_suggestionpanelheight = (int) (0);
 //BA.debugLineNum = 511;BA.debugLine="B4XPage_Resize(Root.Width, Root.Height)";
_b4xpage_resize(_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 512;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 514;BA.debugLine="SearchTimer.Enabled = False";
_searchtimer.setEnabled(__c.False);
 //BA.debugLineNum = 515;BA.debugLine="SearchTimer.Enabled = True";
_searchtimer.setEnabled(__c.True);
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return "";
}
public String  _txtaddressdisplay_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 497;BA.debugLine="Sub txtAddressDisplay_FocusChanged (HasFocus As Bo";
 //BA.debugLineNum = 498;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
 //BA.debugLineNum = 499;BA.debugLine="Log(\">>> [Z-ORDER] Display Clicked. Bringing Rea";
__c.LogImpl("08126466",">>> [Z-ORDER] Display Clicked. Bringing Real Address input to front.",0);
 //BA.debugLineNum = 500;BA.debugLine="txtAddress.Text = txtAddressDisplay.Text";
_txtaddress.setText(BA.ObjectToCharSequence(_txtaddressdisplay.getText()));
 //BA.debugLineNum = 501;BA.debugLine="txtAddress.As(B4XView).BringToFront";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_txtaddress.getObject()))).BringToFront();
 //BA.debugLineNum = 502;BA.debugLine="txtAddress.RequestFocus";
_txtaddress.RequestFocus();
 //BA.debugLineNum = 503;BA.debugLine="ime.ShowKeyboard(txtAddress)";
_ime.ShowKeyboard((android.view.View)(_txtaddress.getObject()));
 };
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return "";
}
public String  _txtinput_enterpressed() throws Exception{
 //BA.debugLineNum = 428;BA.debugLine="Sub txtInput_EnterPressed";
 //BA.debugLineNum = 429;BA.debugLine="ime.HideKeyboard";
_ime.HideKeyboard(ba);
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return "";
}
public void  _txtphone_longclick() throws Exception{
ResumableSub_txtPhone_LongClick rsub = new ResumableSub_txtPhone_LongClick(this);
rsub.resume(ba, null);
}
public static class ResumableSub_txtPhone_LongClick extends BA.ResumableSub {
public ResumableSub_txtPhone_LongClick(Geek.God.CRM.App.createclientpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.createclientpage parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 434;BA.debugLine="Log(\">>> [Phone Input] Long Click Detected.\")";
parent.__c.LogImpl("07929857",">>> [Phone Input] Long Click Detected.",0);
 //BA.debugLineNum = 435;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_READ_CALL_LOG)";
parent._rp.CheckAndRequest(ba,parent._rp.PERMISSION_READ_CALL_LOG);
 //BA.debugLineNum = 436;BA.debugLine="Wait For B4XPage_PermissionResult (Permission As";
parent.__c.WaitFor("b4xpage_permissionresult", ba, this, null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 438;BA.debugLine="If Result Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 439;BA.debugLine="GetLastCallLogEntry";
parent._getlastcalllogentry();
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 441;BA.debugLine="xui.MsgboxAsync(\"Permission Denied. Cannot read";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Permission Denied. Cannot read Call Log."),BA.ObjectToCharSequence("Error"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
if (BA.fastSubCompare(sub, "JOBDONE"))
	return _jobdone((Geek.God.CRM.App.httpjob) args[0]);
if (BA.fastSubCompare(sub, "POPULATESCRAPEDATA"))
	return _populatescrapedata((anywheresoftware.b4a.objects.collections.Map) args[0]);
if (BA.fastSubCompare(sub, "REDRAWUI"))
	return _redrawui(((Number)args[0]).intValue());
return BA.SubDelegator.SubNotFound;
}
}
