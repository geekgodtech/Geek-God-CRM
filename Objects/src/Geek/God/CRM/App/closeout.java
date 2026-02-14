package Geek.God.CRM.App;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class closeout extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "Geek.God.CRM.App.closeout");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", Geek.God.CRM.App.closeout.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _sv = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlscroll = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spnuser = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltimein = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltimeout = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltimetotal = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtphone = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtaddress = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spngroup = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtissue = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _radresolvedyes = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _radresolvedno = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chktag = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttagqty = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkacc = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtaccqty = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkgate = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtgateqty = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtfee = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnotes = null;
public anywheresoftware.b4a.objects.collections.Map _currentjobdata = null;
public long _starttime = 0L;
public long _endtime = 0L;
public boolean _ispageready = false;
public anywheresoftware.b4a.objects.collections.Map _tempstate = null;
public b4a.example.dateutils _dateutils = null;
public Geek.God.CRM.App.main _main = null;
public Geek.God.CRM.App.starter _starter = null;
public Geek.God.CRM.App.b4xpages _b4xpages = null;
public Geek.God.CRM.App.b4xcollections _b4xcollections = null;
public Geek.God.CRM.App.httputils2service _httputils2service = null;
public Geek.God.CRM.App.xuiviewsutils _xuiviewsutils = null;
public int  _addinventoryrow(int _topy,int _width,anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chk,anywheresoftware.b4a.objects.EditTextWrapper _qtytxt) throws Exception{
int _rowh = 0;
int _margin = 0;
int _pickerw = 0;
int _chkw = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _ppicker = null;
String _id = "";
anywheresoftware.b4a.objects.ButtonWrapper _btndown = null;
anywheresoftware.b4a.objects.ButtonWrapper _btnup = null;
 //BA.debugLineNum = 252;BA.debugLine="Private Sub AddInventoryRow(TopY As Int, Width As";
 //BA.debugLineNum = 253;BA.debugLine="Dim RowH As Int = 50dip";
_rowh = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 254;BA.debugLine="Dim Margin As Int = 10dip";
_margin = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 255;BA.debugLine="Dim PickerW As Int = 130dip";
_pickerw = __c.DipToCurrent((int) (130));
 //BA.debugLineNum = 256;BA.debugLine="Dim ChkW As Int = Width - PickerW - 10dip";
_chkw = (int) (_width-_pickerw-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 258;BA.debugLine="pnlScroll.AddView(Chk, Margin, TopY, ChkW, RowH)";
_pnlscroll.AddView((android.view.View)(_chk.getObject()),_margin,_topy,_chkw,_rowh);
 //BA.debugLineNum = 261;BA.debugLine="Dim pPicker As B4XView = xui.CreatePanel(\"\")";
_ppicker = new anywheresoftware.b4a.objects.B4XViewWrapper();
_ppicker = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 262;BA.debugLine="pPicker.SetColorAndBorder(xui.Color_White, 1dip,";
_ppicker.SetColorAndBorder(_xui.Color_White,__c.DipToCurrent((int) (1)),_xui.Color_LightGray,__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 263;BA.debugLine="pnlScroll.AddView(pPicker, Margin + ChkW + 5dip,";
_pnlscroll.AddView((android.view.View)(_ppicker.getObject()),(int) (_margin+_chkw+__c.DipToCurrent((int) (5))),_topy,_pickerw,_rowh);
 //BA.debugLineNum = 266;BA.debugLine="Dim ID As String = QtyTxt.Tag";
_id = BA.ObjectToString(_qtytxt.getTag());
 //BA.debugLineNum = 268;BA.debugLine="Dim btnDown As Button : btnDown.Initialize(\"btnQt";
_btndown = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 268;BA.debugLine="Dim btnDown As Button : btnDown.Initialize(\"btnQt";
_btndown.Initialize(ba,"btnQty");
 //BA.debugLineNum = 269;BA.debugLine="btnDown.Text = \"▼\" : btnDown.TextSize = 14 : btnD";
_btndown.setText(BA.ObjectToCharSequence("▼"));
 //BA.debugLineNum = 269;BA.debugLine="btnDown.Text = \"▼\" : btnDown.TextSize = 14 : btnD";
_btndown.setTextSize((float) (14));
 //BA.debugLineNum = 269;BA.debugLine="btnDown.Text = \"▼\" : btnDown.TextSize = 14 : btnD";
_btndown.setTag((Object)(_id+"|-1"));
 //BA.debugLineNum = 270;BA.debugLine="pPicker.AddView(btnDown, 0, 0, 40dip, RowH)";
_ppicker.AddView((android.view.View)(_btndown.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (40)),_rowh);
 //BA.debugLineNum = 272;BA.debugLine="QtyTxt.Text = \"0\"";
_qtytxt.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 273;BA.debugLine="pPicker.AddView(QtyTxt, 40dip, 0, 50dip, RowH)";
_ppicker.AddView((android.view.View)(_qtytxt.getObject()),__c.DipToCurrent((int) (40)),(int) (0),__c.DipToCurrent((int) (50)),_rowh);
 //BA.debugLineNum = 275;BA.debugLine="Dim btnUp As Button : btnUp.Initialize(\"btnQty\")";
_btnup = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 275;BA.debugLine="Dim btnUp As Button : btnUp.Initialize(\"btnQty\")";
_btnup.Initialize(ba,"btnQty");
 //BA.debugLineNum = 276;BA.debugLine="btnUp.Text = \"▲\" : btnUp.TextSize = 14 : btnUp.Ta";
_btnup.setText(BA.ObjectToCharSequence("▲"));
 //BA.debugLineNum = 276;BA.debugLine="btnUp.Text = \"▲\" : btnUp.TextSize = 14 : btnUp.Ta";
_btnup.setTextSize((float) (14));
 //BA.debugLineNum = 276;BA.debugLine="btnUp.Text = \"▲\" : btnUp.TextSize = 14 : btnUp.Ta";
_btnup.setTag((Object)(_id+"|1"));
 //BA.debugLineNum = 277;BA.debugLine="pPicker.AddView(btnUp, 90dip, 0, 40dip, RowH)";
_ppicker.AddView((android.view.View)(_btnup.getObject()),__c.DipToCurrent((int) (90)),(int) (0),__c.DipToCurrent((int) (40)),_rowh);
 //BA.debugLineNum = 279;BA.debugLine="Return TopY + RowH + 10dip";
if (true) return (int) (_topy+_rowh+__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return 0;
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 57;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 58;BA.debugLine="Root.Color = xui.Color_White";
_root.setColor(_xui.Color_White);
 //BA.debugLineNum = 61;BA.debugLine="sv.Initialize(0)";
_sv.Initialize(ba,(int) (0));
 //BA.debugLineNum = 62;BA.debugLine="Root.AddView(sv, 0, 0, Root.Width, Root.Height)";
_root.AddView((android.view.View)(_sv.getObject()),(int) (0),(int) (0),_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 63;BA.debugLine="pnlScroll = sv.Panel";
_pnlscroll = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sv.getPanel().getObject()));
 //BA.debugLineNum = 64;BA.debugLine="pnlScroll.Color = xui.Color_White";
_pnlscroll.setColor(_xui.Color_White);
 //BA.debugLineNum = 66;BA.debugLine="IsPageReady = True";
_ispageready = __c.True;
 //BA.debugLineNum = 67;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(int _width,int _height) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
 //BA.debugLineNum = 91;BA.debugLine="If IsPageReady = False Then Return";
if (_ispageready==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 92;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
_sv.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
 //BA.debugLineNum = 95;BA.debugLine="If txtNotes.IsInitialized Then SaveTempState";
if (_txtnotes.IsInitialized()) { 
_savetempstate();};
 //BA.debugLineNum = 98;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 101;BA.debugLine="If TempState.Size > 0 Then";
if (_tempstate.getSize()>0) { 
 //BA.debugLineNum = 102;BA.debugLine="RestoreTempState";
_restoretempstate();
 }else if(_currentjobdata.IsInitialized() && _currentjobdata.getSize()>0) { 
 //BA.debugLineNum = 104;BA.debugLine="LoadJob(Array(CurrentJobData, StartTime, EndTime";
_loadjob(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_currentjobdata.getObject()),(Object)(_starttime),(Object)(_endtime)}));
 };
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _btnqty_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
String _data = "";
String[] _parts = null;
String _tag = "";
int _delta = 0;
anywheresoftware.b4a.objects.EditTextWrapper _targettxt = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _targetchk = null;
int _curval = 0;
int _newval = 0;
 //BA.debugLineNum = 474;BA.debugLine="Sub btnQty_Click";
 //BA.debugLineNum = 475;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 476;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 477;BA.debugLine="Dim Data As String = b.Tag ' e.g. \"Tag|1\" or \"Tag";
_data = BA.ObjectToString(_b.getTag());
 //BA.debugLineNum = 478;BA.debugLine="Dim Parts() As String = Regex.Split(\"\\|\", Data)";
_parts = __c.Regex.Split("\\|",_data);
 //BA.debugLineNum = 479;BA.debugLine="Dim Tag As String = Parts(0)";
_tag = _parts[(int) (0)];
 //BA.debugLineNum = 480;BA.debugLine="Dim Delta As Int = Parts(1)";
_delta = (int)(Double.parseDouble(_parts[(int) (1)]));
 //BA.debugLineNum = 482;BA.debugLine="Dim TargetTxt As EditText";
_targettxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 483;BA.debugLine="Dim TargetChk As CheckBox";
_targetchk = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 485;BA.debugLine="If Tag = \"Tag\" Then";
if ((_tag).equals("Tag")) { 
 //BA.debugLineNum = 486;BA.debugLine="TargetTxt = txtTagQty : TargetChk = chkTag";
_targettxt = _txttagqty;
 //BA.debugLineNum = 486;BA.debugLine="TargetTxt = txtTagQty : TargetChk = chkTag";
_targetchk = _chktag;
 }else if((_tag).equals("Acc")) { 
 //BA.debugLineNum = 488;BA.debugLine="TargetTxt = txtAccQty : TargetChk = chkAcc";
_targettxt = _txtaccqty;
 //BA.debugLineNum = 488;BA.debugLine="TargetTxt = txtAccQty : TargetChk = chkAcc";
_targetchk = _chkacc;
 }else if((_tag).equals("Gate")) { 
 //BA.debugLineNum = 490;BA.debugLine="TargetTxt = txtGateQty : TargetChk = chkGate";
_targettxt = _txtgateqty;
 //BA.debugLineNum = 490;BA.debugLine="TargetTxt = txtGateQty : TargetChk = chkGate";
_targetchk = _chkgate;
 };
 //BA.debugLineNum = 493;BA.debugLine="Dim CurVal As Int = 0";
_curval = (int) (0);
 //BA.debugLineNum = 494;BA.debugLine="If IsNumber(TargetTxt.Text) Then CurVal = TargetT";
if (__c.IsNumber(_targettxt.getText())) { 
_curval = (int)(Double.parseDouble(_targettxt.getText()));};
 //BA.debugLineNum = 496;BA.debugLine="Dim NewVal As Int = CurVal + Delta";
_newval = (int) (_curval+_delta);
 //BA.debugLineNum = 497;BA.debugLine="If NewVal < 0 Then NewVal = 0";
if (_newval<0) { 
_newval = (int) (0);};
 //BA.debugLineNum = 499;BA.debugLine="TargetTxt.Text = NewVal";
_targettxt.setText(BA.ObjectToCharSequence(_newval));
 //BA.debugLineNum = 502;BA.debugLine="If NewVal > 0 And TargetChk.Checked = False Then";
if (_newval>0 && _targetchk.getChecked()==__c.False) { 
_targetchk.setChecked(__c.True);};
 //BA.debugLineNum = 503;BA.debugLine="If NewVal = 0 And TargetChk.Checked = True Then T";
if (_newval==0 && _targetchk.getChecked()==__c.True) { 
_targetchk.setChecked(__c.False);};
 //BA.debugLineNum = 504;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click() throws Exception{
String _datestr = "";
String _resstr = "";
String _cleanaddr = "";
anywheresoftware.b4a.objects.collections.List _ledgerrow = null;
anywheresoftware.b4a.objects.collections.List _container = null;
 //BA.debugLineNum = 514;BA.debugLine="Sub btnSave_Click";
 //BA.debugLineNum = 515;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 516;BA.debugLine="If txtFee.Text = \"\" Then txtFee.Text = \"0.00\"";
if ((_txtfee.getText()).equals("")) { 
_txtfee.setText(BA.ObjectToCharSequence("0.00"));};
 //BA.debugLineNum = 518;BA.debugLine="DateTime.DateFormat = \"MM/dd/yyyy\"";
__c.DateTime.setDateFormat("MM/dd/yyyy");
 //BA.debugLineNum = 519;BA.debugLine="Dim DateStr As String = DateTime.Date(EndTime)";
_datestr = __c.DateTime.Date(_endtime);
 //BA.debugLineNum = 520;BA.debugLine="Dim ResStr As String = \"No\" : If radResolvedYes.C";
_resstr = "No";
 //BA.debugLineNum = 520;BA.debugLine="Dim ResStr As String = \"No\" : If radResolvedYes.C";
if (_radresolvedyes.getChecked()) { 
_resstr = "Yes";};
 //BA.debugLineNum = 522;BA.debugLine="Dim CleanAddr As String = CleanAddress(txtAddress";
_cleanaddr = _cleanaddress(_txtaddress.getText());
 //BA.debugLineNum = 525;BA.debugLine="Dim LedgerRow As List : LedgerRow.Initialize";
_ledgerrow = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 525;BA.debugLine="Dim LedgerRow As List : LedgerRow.Initialize";
_ledgerrow.Initialize();
 //BA.debugLineNum = 526;BA.debugLine="LedgerRow.Add(spnUser.SelectedItem)";
_ledgerrow.Add((Object)(_spnuser.getSelectedItem()));
 //BA.debugLineNum = 527;BA.debugLine="LedgerRow.Add(DateStr)";
_ledgerrow.Add((Object)(_datestr));
 //BA.debugLineNum = 528;BA.debugLine="LedgerRow.Add(txtName.Text)";
_ledgerrow.Add((Object)(_txtname.getText()));
 //BA.debugLineNum = 529;BA.debugLine="LedgerRow.Add(CleanAddr)";
_ledgerrow.Add((Object)(_cleanaddr));
 //BA.debugLineNum = 530;BA.debugLine="LedgerRow.Add(txtPhone.Text)";
_ledgerrow.Add((Object)(_txtphone.getText()));
 //BA.debugLineNum = 531;BA.debugLine="LedgerRow.Add(txtIssue.Text)";
_ledgerrow.Add((Object)(_txtissue.getText()));
 //BA.debugLineNum = 532;BA.debugLine="LedgerRow.Add(ResStr)";
_ledgerrow.Add((Object)(_resstr));
 //BA.debugLineNum = 533;BA.debugLine="LedgerRow.Add(\"$\" & txtFee.Text)";
_ledgerrow.Add((Object)("$"+_txtfee.getText()));
 //BA.debugLineNum = 534;BA.debugLine="LedgerRow.Add(lblTimeTotal.Text)";
_ledgerrow.Add((Object)(_lbltimetotal.getText()));
 //BA.debugLineNum = 537;BA.debugLine="LedgerRow.Add(txtTagQty.Text)";
_ledgerrow.Add((Object)(_txttagqty.getText()));
 //BA.debugLineNum = 538;BA.debugLine="LedgerRow.Add(txtAccQty.Text)";
_ledgerrow.Add((Object)(_txtaccqty.getText()));
 //BA.debugLineNum = 539;BA.debugLine="LedgerRow.Add(txtGateQty.Text)";
_ledgerrow.Add((Object)(_txtgateqty.getText()));
 //BA.debugLineNum = 541;BA.debugLine="Dim Container As List : Container.Initialize";
_container = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 541;BA.debugLine="Dim Container As List : Container.Initialize";
_container.Initialize();
 //BA.debugLineNum = 542;BA.debugLine="Container.Add(LedgerRow)";
_container.Add((Object)(_ledgerrow.getObject()));
 //BA.debugLineNum = 543;BA.debugLine="Container.Add(txtNotes.Text)";
_container.Add((Object)(_txtnotes.getText()));
 //BA.debugLineNum = 544;BA.debugLine="Container.Add(CurrentJobData.Get(\"ID\"))";
_container.Add(_currentjobdata.Get((Object)("ID")));
 //BA.debugLineNum = 545;BA.debugLine="Container.Add(spnGroup.SelectedItem)";
_container.Add((Object)(_spngroup.getSelectedItem()));
 //BA.debugLineNum = 548;BA.debugLine="CallSub2(B4XPages.MainPage, \"SubmitCloseOut\", Con";
__c.CallSubNew2(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"SubmitCloseOut",(Object)(_container));
 //BA.debugLineNum = 549;BA.debugLine="End Sub";
return "";
}
public String  _buildui() throws Exception{
int _top = 0;
int _left = 0;
int _w = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
anywheresoftware.b4a.objects.LabelWrapper _lblgrp = null;
anywheresoftware.b4a.objects.LabelWrapper _lblres = null;
anywheresoftware.b4a.objects.LabelWrapper _lblinv = null;
anywheresoftware.b4a.objects.LabelWrapper _lblfee = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
anywheresoftware.b4a.objects.LabelWrapper _lblnotes = null;
anywheresoftware.b4a.objects.ButtonWrapper _btnsave = null;
 //BA.debugLineNum = 108;BA.debugLine="Private Sub BuildUI";
 //BA.debugLineNum = 109;BA.debugLine="pnlScroll.RemoveAllViews";
_pnlscroll.RemoveAllViews();
 //BA.debugLineNum = 111;BA.debugLine="Dim top As Int = 10dip";
_top = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 112;BA.debugLine="Dim left As Int = 10dip";
_left = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 113;BA.debugLine="Dim w As Int = Root.Width - 20dip";
_w = (int) (_root.getWidth()-__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 116;BA.debugLine="Dim lblTitle As Label : lblTitle.Initialize(\"\")";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 116;BA.debugLine="Dim lblTitle As Label : lblTitle.Initialize(\"\")";
_lbltitle.Initialize(ba,"");
 //BA.debugLineNum = 117;BA.debugLine="lblTitle.Text = \"JOB CLOSEOUT\"";
_lbltitle.setText(BA.ObjectToCharSequence("JOB CLOSEOUT"));
 //BA.debugLineNum = 118;BA.debugLine="lblTitle.TextSize = 24";
_lbltitle.setTextSize((float) (24));
 //BA.debugLineNum = 119;BA.debugLine="lblTitle.Typeface = LoadSafeFont(\"closeout - labe";
_lbltitle.setTypeface((android.graphics.Typeface)(_loadsafefont("closeout - labels.ttf").getObject()));
 //BA.debugLineNum = 120;BA.debugLine="lblTitle.Gravity = Gravity.CENTER";
_lbltitle.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 121;BA.debugLine="pnlScroll.AddView(lblTitle, 0, top, Root.Width, 4";
_pnlscroll.AddView((android.view.View)(_lbltitle.getObject()),(int) (0),_top,_root.getWidth(),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 122;BA.debugLine="top = top + 50dip";
_top = (int) (_top+__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 124;BA.debugLine="spnUser.Initialize(\"spnUser\")";
_spnuser.Initialize(ba,"spnUser");
 //BA.debugLineNum = 125;BA.debugLine="spnUser.AddAll(Array As String(\"Mike\", \"Erin\"))";
_spnuser.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Mike","Erin"}));
 //BA.debugLineNum = 126;BA.debugLine="pnlScroll.AddView(spnUser, left, top, w, 50dip)";
_pnlscroll.AddView((android.view.View)(_spnuser.getObject()),_left,_top,_w,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 127;BA.debugLine="top = top + 60dip";
_top = (int) (_top+__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 130;BA.debugLine="lblTimeIn = CreateLabel(\"In: --:--\")";
_lbltimein = _createlabel("In: --:--");
 //BA.debugLineNum = 131;BA.debugLine="pnlScroll.AddView(lblTimeIn, left, top, w/3, 30di";
_pnlscroll.AddView((android.view.View)(_lbltimein.getObject()),_left,_top,(int) (_w/(double)3),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 133;BA.debugLine="lblTimeOut = CreateLabel(\"Out: --:--\")";
_lbltimeout = _createlabel("Out: --:--");
 //BA.debugLineNum = 134;BA.debugLine="pnlScroll.AddView(lblTimeOut, left + w/3, top, w/";
_pnlscroll.AddView((android.view.View)(_lbltimeout.getObject()),(int) (_left+_w/(double)3),_top,(int) (_w/(double)3),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 136;BA.debugLine="lblTimeTotal = CreateLabel(\"Total: 0m\")";
_lbltimetotal = _createlabel("Total: 0m");
 //BA.debugLineNum = 137;BA.debugLine="lblTimeTotal.Typeface = Typeface.DEFAULT_BOLD";
_lbltimetotal.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 138;BA.debugLine="pnlScroll.AddView(lblTimeTotal, left + (w/3)*2, t";
_pnlscroll.AddView((android.view.View)(_lbltimetotal.getObject()),(int) (_left+(_w/(double)3)*2),_top,(int) (_w/(double)3),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 139;BA.debugLine="top = top + 40dip";
_top = (int) (_top+__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 142;BA.debugLine="txtName = CreateInput(False, \"Client Name\")";
_txtname = _createinput(__c.False,"Client Name");
 //BA.debugLineNum = 143;BA.debugLine="pnlScroll.AddView(txtName, left, top, w, 50dip)";
_pnlscroll.AddView((android.view.View)(_txtname.getObject()),_left,_top,_w,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 144;BA.debugLine="top = top + 60dip";
_top = (int) (_top+__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 146;BA.debugLine="txtAddress = CreateInput(False, \"Address\")";
_txtaddress = _createinput(__c.False,"Address");
 //BA.debugLineNum = 147;BA.debugLine="pnlScroll.AddView(txtAddress, left, top, w, 50dip";
_pnlscroll.AddView((android.view.View)(_txtaddress.getObject()),_left,_top,_w,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 148;BA.debugLine="top = top + 60dip";
_top = (int) (_top+__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 150;BA.debugLine="txtPhone = CreateInput(False, \"Phone\")";
_txtphone = _createinput(__c.False,"Phone");
 //BA.debugLineNum = 151;BA.debugLine="pnlScroll.AddView(txtPhone, left, top, w, 50dip)";
_pnlscroll.AddView((android.view.View)(_txtphone.getObject()),_left,_top,_w,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 152;BA.debugLine="top = top + 60dip";
_top = (int) (_top+__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 154;BA.debugLine="Dim lblGrp As Label : lblGrp.Initialize(\"\")";
_lblgrp = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 154;BA.debugLine="Dim lblGrp As Label : lblGrp.Initialize(\"\")";
_lblgrp.Initialize(ba,"");
 //BA.debugLineNum = 155;BA.debugLine="lblGrp.Text = \"Client Group:\"";
_lblgrp.setText(BA.ObjectToCharSequence("Client Group:"));
 //BA.debugLineNum = 156;BA.debugLine="lblGrp.Typeface = LoadSafeFont(\"closeout - labels";
_lblgrp.setTypeface((android.graphics.Typeface)(_loadsafefont("closeout - labels.ttf").getObject()));
 //BA.debugLineNum = 157;BA.debugLine="pnlScroll.AddView(lblGrp, left, top, w, 20dip)";
_pnlscroll.AddView((android.view.View)(_lblgrp.getObject()),_left,_top,_w,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 158;BA.debugLine="top = top + 25dip";
_top = (int) (_top+__c.DipToCurrent((int) (25)));
 //BA.debugLineNum = 160;BA.debugLine="spnGroup.Initialize(\"spnGroup\")";
_spngroup.Initialize(ba,"spnGroup");
 //BA.debugLineNum = 161;BA.debugLine="spnGroup.AddAll(Array As String(\"Client\", \"Prefer";
_spngroup.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Client","Preferred","Blacklisted"}));
 //BA.debugLineNum = 162;BA.debugLine="pnlScroll.AddView(spnGroup, left, top, w, 50dip)";
_pnlscroll.AddView((android.view.View)(_spngroup.getObject()),_left,_top,_w,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 163;BA.debugLine="top = top + 60dip";
_top = (int) (_top+__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 166;BA.debugLine="txtIssue = CreateInput(True, \"Primary Issue (e.g.";
_txtissue = _createinput(__c.True,"Primary Issue (e.g. Printer, WiFi)");
 //BA.debugLineNum = 167;BA.debugLine="pnlScroll.AddView(txtIssue, left, top, w, 50dip)";
_pnlscroll.AddView((android.view.View)(_txtissue.getObject()),_left,_top,_w,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 168;BA.debugLine="top = top + 60dip";
_top = (int) (_top+__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 170;BA.debugLine="Dim lblRes As Label : lblRes.Initialize(\"\")";
_lblres = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 170;BA.debugLine="Dim lblRes As Label : lblRes.Initialize(\"\")";
_lblres.Initialize(ba,"");
 //BA.debugLineNum = 171;BA.debugLine="lblRes.Text = \"Resolved?\"";
_lblres.setText(BA.ObjectToCharSequence("Resolved?"));
 //BA.debugLineNum = 172;BA.debugLine="lblRes.Typeface = LoadSafeFont(\"closeout - labels";
_lblres.setTypeface((android.graphics.Typeface)(_loadsafefont("closeout - labels.ttf").getObject()));
 //BA.debugLineNum = 173;BA.debugLine="pnlScroll.AddView(lblRes, left, top, 100dip, 30di";
_pnlscroll.AddView((android.view.View)(_lblres.getObject()),_left,_top,__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 175;BA.debugLine="radResolvedYes = CreateRadio(\"Yes\", True)";
_radresolvedyes = _createradio("Yes",__c.True);
 //BA.debugLineNum = 176;BA.debugLine="pnlScroll.AddView(radResolvedYes, left + 100dip,";
_pnlscroll.AddView((android.view.View)(_radresolvedyes.getObject()),(int) (_left+__c.DipToCurrent((int) (100))),_top,__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 178;BA.debugLine="radResolvedNo = CreateRadio(\"No\", False)";
_radresolvedno = _createradio("No",__c.False);
 //BA.debugLineNum = 179;BA.debugLine="pnlScroll.AddView(radResolvedNo, left + 190dip, t";
_pnlscroll.AddView((android.view.View)(_radresolvedno.getObject()),(int) (_left+__c.DipToCurrent((int) (190))),_top,__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 180;BA.debugLine="top = top + 40dip";
_top = (int) (_top+__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 183;BA.debugLine="Dim lblInv As Label : lblInv.Initialize(\"\")";
_lblinv = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 183;BA.debugLine="Dim lblInv As Label : lblInv.Initialize(\"\")";
_lblinv.Initialize(ba,"");
 //BA.debugLineNum = 184;BA.debugLine="lblInv.Text = \"Inventory / Parts Used:\"";
_lblinv.setText(BA.ObjectToCharSequence("Inventory / Parts Used:"));
 //BA.debugLineNum = 185;BA.debugLine="lblInv.Typeface = LoadSafeFont(\"closeout - labels";
_lblinv.setTypeface((android.graphics.Typeface)(_loadsafefont("closeout - labels.ttf").getObject()));
 //BA.debugLineNum = 186;BA.debugLine="pnlScroll.AddView(lblInv, left, top, w, 20dip)";
_pnlscroll.AddView((android.view.View)(_lblinv.getObject()),_left,_top,_w,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 187;BA.debugLine="top = top + 25dip";
_top = (int) (_top+__c.DipToCurrent((int) (25)));
 //BA.debugLineNum = 190;BA.debugLine="chkTag = CreateCheck(\"Tag Used\", \"Tag\")";
_chktag = _createcheck("Tag Used","Tag");
 //BA.debugLineNum = 191;BA.debugLine="txtTagQty = CreateQtyInput(\"Tag\")";
_txttagqty = _createqtyinput("Tag");
 //BA.debugLineNum = 192;BA.debugLine="top = AddInventoryRow(top, w, chkTag, txtTagQty)";
_top = _addinventoryrow(_top,_w,_chktag,_txttagqty);
 //BA.debugLineNum = 195;BA.debugLine="chkAcc = CreateCheck(\"Accessory Sold\", \"Acc\")";
_chkacc = _createcheck("Accessory Sold","Acc");
 //BA.debugLineNum = 196;BA.debugLine="txtAccQty = CreateQtyInput(\"Acc\")";
_txtaccqty = _createqtyinput("Acc");
 //BA.debugLineNum = 197;BA.debugLine="top = AddInventoryRow(top, w, chkAcc, txtAccQty)";
_top = _addinventoryrow(_top,_w,_chkacc,_txtaccqty);
 //BA.debugLineNum = 200;BA.debugLine="chkGate = CreateCheck(\"Gate Remote\", \"Gate\")";
_chkgate = _createcheck("Gate Remote","Gate");
 //BA.debugLineNum = 201;BA.debugLine="txtGateQty = CreateQtyInput(\"Gate\")";
_txtgateqty = _createqtyinput("Gate");
 //BA.debugLineNum = 202;BA.debugLine="top = AddInventoryRow(top, w, chkGate, txtGateQty";
_top = _addinventoryrow(_top,_w,_chkgate,_txtgateqty);
 //BA.debugLineNum = 204;BA.debugLine="top = top + 20dip";
_top = (int) (_top+__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 207;BA.debugLine="Dim lblFee As Label : lblFee.Initialize(\"\")";
_lblfee = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 207;BA.debugLine="Dim lblFee As Label : lblFee.Initialize(\"\")";
_lblfee.Initialize(ba,"");
 //BA.debugLineNum = 208;BA.debugLine="lblFee.Text = \"Total Collected ($):\"";
_lblfee.setText(BA.ObjectToCharSequence("Total Collected ($):"));
 //BA.debugLineNum = 209;BA.debugLine="lblFee.Typeface = LoadSafeFont(\"closeout - labels";
_lblfee.setTypeface((android.graphics.Typeface)(_loadsafefont("closeout - labels.ttf").getObject()));
 //BA.debugLineNum = 210;BA.debugLine="pnlScroll.AddView(lblFee, left, top, w, 20dip)";
_pnlscroll.AddView((android.view.View)(_lblfee.getObject()),_left,_top,_w,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 211;BA.debugLine="top = top + 25dip";
_top = (int) (_top+__c.DipToCurrent((int) (25)));
 //BA.debugLineNum = 213;BA.debugLine="txtFee.Initialize(\"txtFee\")";
_txtfee.Initialize(ba,"txtFee");
 //BA.debugLineNum = 214;BA.debugLine="txtFee.Hint = \"0.00\"";
_txtfee.setHint("0.00");
 //BA.debugLineNum = 215;BA.debugLine="txtFee.TextSize = 14";
_txtfee.setTextSize((float) (14));
 //BA.debugLineNum = 216;BA.debugLine="txtFee.TextColor = xui.Color_Black";
_txtfee.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 217;BA.debugLine="txtFee.Color = xui.Color_Transparent";
_txtfee.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 218;BA.debugLine="Dim cd As ColorDrawable : cd.Initialize2(xui.Colo";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 218;BA.debugLine="Dim cd As ColorDrawable : cd.Initialize2(xui.Colo";
_cd.Initialize2(_xui.Color_Transparent,(int) (0),__c.DipToCurrent((int) (1)),_xui.Color_LightGray);
 //BA.debugLineNum = 219;BA.debugLine="txtFee.Background = cd";
_txtfee.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
 //BA.debugLineNum = 220;BA.debugLine="txtFee.InputType = txtFee.INPUT_TYPE_DECIMAL_NUMB";
_txtfee.setInputType(_txtfee.INPUT_TYPE_DECIMAL_NUMBERS);
 //BA.debugLineNum = 222;BA.debugLine="pnlScroll.AddView(txtFee, left, top, w, 50dip)";
_pnlscroll.AddView((android.view.View)(_txtfee.getObject()),_left,_top,_w,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 223;BA.debugLine="top = top + 60dip";
_top = (int) (_top+__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 226;BA.debugLine="Dim lblNotes As Label : lblNotes.Initialize(\"\")";
_lblnotes = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 226;BA.debugLine="Dim lblNotes As Label : lblNotes.Initialize(\"\")";
_lblnotes.Initialize(ba,"");
 //BA.debugLineNum = 227;BA.debugLine="lblNotes.Text = \"Client Notes (Saved to Google Co";
_lblnotes.setText(BA.ObjectToCharSequence("Client Notes (Saved to Google Contacts):"));
 //BA.debugLineNum = 228;BA.debugLine="lblNotes.Typeface = LoadSafeFont(\"closeout - labe";
_lblnotes.setTypeface((android.graphics.Typeface)(_loadsafefont("closeout - labels.ttf").getObject()));
 //BA.debugLineNum = 229;BA.debugLine="pnlScroll.AddView(lblNotes, left, top, w, 20dip)";
_pnlscroll.AddView((android.view.View)(_lblnotes.getObject()),_left,_top,_w,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 230;BA.debugLine="top = top + 25dip";
_top = (int) (_top+__c.DipToCurrent((int) (25)));
 //BA.debugLineNum = 232;BA.debugLine="txtNotes = CreateInput(True, \"Add visit notes her";
_txtnotes = _createinput(__c.True,"Add visit notes here...");
 //BA.debugLineNum = 233;BA.debugLine="txtNotes.SingleLine = False";
_txtnotes.setSingleLine(__c.False);
 //BA.debugLineNum = 234;BA.debugLine="txtNotes.Gravity = Gravity.TOP + Gravity.LEFT";
_txtnotes.setGravity((int) (__c.Gravity.TOP+__c.Gravity.LEFT));
 //BA.debugLineNum = 235;BA.debugLine="pnlScroll.AddView(txtNotes, left, top, w, 100dip)";
_pnlscroll.AddView((android.view.View)(_txtnotes.getObject()),_left,_top,_w,__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 236;BA.debugLine="top = top + 110dip";
_top = (int) (_top+__c.DipToCurrent((int) (110)));
 //BA.debugLineNum = 239;BA.debugLine="Dim btnSave As Button : btnSave.Initialize(\"btnSa";
_btnsave = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 239;BA.debugLine="Dim btnSave As Button : btnSave.Initialize(\"btnSa";
_btnsave.Initialize(ba,"btnSave");
 //BA.debugLineNum = 240;BA.debugLine="btnSave.Text = \"CLOSE JOB & SAVE\"";
_btnsave.setText(BA.ObjectToCharSequence("CLOSE JOB & SAVE"));
 //BA.debugLineNum = 241;BA.debugLine="btnSave.Color = 0xFF2E7D32";
_btnsave.setColor(((int)0xff2e7d32));
 //BA.debugLineNum = 242;BA.debugLine="btnSave.TextColor = xui.Color_White";
_btnsave.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 243;BA.debugLine="btnSave.Typeface = LoadSafeFont(\"closeout - butto";
_btnsave.setTypeface((android.graphics.Typeface)(_loadsafefont("closeout - buttons.ttf").getObject()));
 //BA.debugLineNum = 244;BA.debugLine="pnlScroll.AddView(btnSave, left, top, w, 60dip)";
_pnlscroll.AddView((android.view.View)(_btnsave.getObject()),_left,_top,_w,__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 245;BA.debugLine="top = top + 70dip";
_top = (int) (_top+__c.DipToCurrent((int) (70)));
 //BA.debugLineNum = 247;BA.debugLine="pnlScroll.Height = top";
_pnlscroll.setHeight(_top);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return "";
}
public String  _chkinv_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _c = null;
String _tag = "";
anywheresoftware.b4a.objects.EditTextWrapper _targettxt = null;
 //BA.debugLineNum = 457;BA.debugLine="Sub chkInv_CheckedChange(Checked As Boolean)";
 //BA.debugLineNum = 458;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 459;BA.debugLine="Dim c As CheckBox = Sender";
_c = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_c = (anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 460;BA.debugLine="Dim Tag As String = c.Tag ' \"Tag\", \"Acc\", or \"Gat";
_tag = BA.ObjectToString(_c.getTag());
 //BA.debugLineNum = 461;BA.debugLine="Dim TargetTxt As EditText";
_targettxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 463;BA.debugLine="If Tag = \"Tag\" Then TargetTxt = txtTagQty";
if ((_tag).equals("Tag")) { 
_targettxt = _txttagqty;};
 //BA.debugLineNum = 464;BA.debugLine="If Tag = \"Acc\" Then TargetTxt = txtAccQty";
if ((_tag).equals("Acc")) { 
_targettxt = _txtaccqty;};
 //BA.debugLineNum = 465;BA.debugLine="If Tag = \"Gate\" Then TargetTxt = txtGateQty";
if ((_tag).equals("Gate")) { 
_targettxt = _txtgateqty;};
 //BA.debugLineNum = 467;BA.debugLine="If Checked Then";
if (_checked) { 
 //BA.debugLineNum = 468;BA.debugLine="If TargetTxt.Text = \"0\" Then TargetTxt.Text = \"1";
if ((_targettxt.getText()).equals("0")) { 
_targettxt.setText(BA.ObjectToCharSequence("1"));};
 }else {
 //BA.debugLineNum = 470;BA.debugLine="TargetTxt.Text = \"0\"";
_targettxt.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Private sv As ScrollView";
_sv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private pnlScroll As B4XView";
_pnlscroll = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private spnUser As Spinner";
_spnuser = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private lblTimeIn As Label";
_lbltimein = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private lblTimeOut As Label";
_lbltimeout = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private lblTimeTotal As Label";
_lbltimetotal = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private txtName As EditText";
_txtname = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private txtPhone As EditText";
_txtphone = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private txtAddress As EditText";
_txtaddress = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private spnGroup As Spinner";
_spngroup = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private txtIssue As EditText";
_txtissue = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private radResolvedYes As RadioButton";
_radresolvedyes = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private radResolvedNo As RadioButton";
_radresolvedno = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private chkTag As CheckBox";
_chktag = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private txtTagQty As EditText";
_txttagqty = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private chkAcc As CheckBox";
_chkacc = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private txtAccQty As EditText";
_txtaccqty = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private chkGate As CheckBox";
_chkgate = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private txtGateQty As EditText";
_txtgateqty = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private txtFee As EditText";
_txtfee = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private txtNotes As EditText";
_txtnotes = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private CurrentJobData As Map";
_currentjobdata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 45;BA.debugLine="Private StartTime As Long";
_starttime = 0L;
 //BA.debugLineNum = 46;BA.debugLine="Private EndTime As Long";
_endtime = 0L;
 //BA.debugLineNum = 47;BA.debugLine="Private IsPageReady As Boolean = False";
_ispageready = __c.False;
 //BA.debugLineNum = 48;BA.debugLine="Private TempState As Map";
_tempstate = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _cleanaddress(String _addr) throws Exception{
String _temp = "";
String _zip = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
String _streetpart = "";
 //BA.debugLineNum = 551;BA.debugLine="Private Sub CleanAddress(Addr As String) As String";
 //BA.debugLineNum = 552;BA.debugLine="Dim temp As String = Addr.Replace(Chr(10), \" \").R";
_temp = _addr.replace(BA.ObjectToString(__c.Chr((int) (10)))," ").replace(BA.ObjectToString(__c.Chr((int) (13)))," ");
 //BA.debugLineNum = 555;BA.debugLine="Dim Zip As String = \"\"";
_zip = "";
 //BA.debugLineNum = 556;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"\\b\\d{5}(?:-\\d{4";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = __c.Regex.Matcher("\\b\\d{5}(?:-\\d{4})?\\b",_temp);
 //BA.debugLineNum = 557;BA.debugLine="If m.Find Then Zip = m.Match";
if (_m.Find()) { 
_zip = _m.getMatch();};
 //BA.debugLineNum = 560;BA.debugLine="Dim StreetPart As String = temp";
_streetpart = _temp;
 //BA.debugLineNum = 561;BA.debugLine="If temp.Contains(\",\") Then";
if (_temp.contains(",")) { 
 //BA.debugLineNum = 562;BA.debugLine="StreetPart = temp.SubString2(0, temp.IndexOf(\",\"";
_streetpart = _temp.substring((int) (0),_temp.indexOf(",")).trim();
 };
 //BA.debugLineNum = 565;BA.debugLine="If Zip <> \"\" Then";
if ((_zip).equals("") == false) { 
 //BA.debugLineNum = 566;BA.debugLine="Return StreetPart & \" \" & Zip";
if (true) return _streetpart+" "+_zip;
 }else {
 //BA.debugLineNum = 568;BA.debugLine="Return StreetPart";
if (true) return _streetpart;
 };
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper  _createcheck(String _txt,String _tag) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _c = null;
 //BA.debugLineNum = 314;BA.debugLine="Private Sub CreateCheck(Txt As String, Tag As Stri";
 //BA.debugLineNum = 315;BA.debugLine="Dim c As CheckBox : c.Initialize(\"chkInv\")";
_c = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 315;BA.debugLine="Dim c As CheckBox : c.Initialize(\"chkInv\")";
_c.Initialize(ba,"chkInv");
 //BA.debugLineNum = 316;BA.debugLine="c.Text = Txt";
_c.setText(BA.ObjectToCharSequence(_txt));
 //BA.debugLineNum = 317;BA.debugLine="c.TextColor = xui.Color_Black";
_c.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 318;BA.debugLine="c.Tag = Tag";
_c.setTag((Object)(_tag));
 //BA.debugLineNum = 319;BA.debugLine="c.Typeface = LoadSafeFont(\"closeout - labels.ttf\"";
_c.setTypeface((android.graphics.Typeface)(_loadsafefont("closeout - labels.ttf").getObject()));
 //BA.debugLineNum = 320;BA.debugLine="Return c";
if (true) return _c;
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.EditTextWrapper  _createinput(boolean _enabled,String _hint) throws Exception{
anywheresoftware.b4a.objects.EditTextWrapper _e = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
 //BA.debugLineNum = 291;BA.debugLine="Private Sub CreateInput(Enabled As Boolean, Hint A";
 //BA.debugLineNum = 292;BA.debugLine="Dim e As EditText : e.Initialize(\"txtInput\")";
_e = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 292;BA.debugLine="Dim e As EditText : e.Initialize(\"txtInput\")";
_e.Initialize(ba,"txtInput");
 //BA.debugLineNum = 293;BA.debugLine="e.Hint = Hint";
_e.setHint(_hint);
 //BA.debugLineNum = 294;BA.debugLine="e.TextSize = 14";
_e.setTextSize((float) (14));
 //BA.debugLineNum = 295;BA.debugLine="e.Enabled = Enabled";
_e.setEnabled(_enabled);
 //BA.debugLineNum = 296;BA.debugLine="e.TextColor = xui.Color_Black";
_e.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 297;BA.debugLine="e.Color = xui.Color_Transparent";
_e.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 298;BA.debugLine="Dim cd As ColorDrawable : cd.Initialize2(xui.Colo";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 298;BA.debugLine="Dim cd As ColorDrawable : cd.Initialize2(xui.Colo";
_cd.Initialize2(_xui.Color_Transparent,(int) (0),__c.DipToCurrent((int) (1)),_xui.Color_LightGray);
 //BA.debugLineNum = 299;BA.debugLine="e.Background = cd";
_e.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
 //BA.debugLineNum = 300;BA.debugLine="Return e";
if (true) return _e;
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.LabelWrapper  _createlabel(String _txt) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _l = null;
 //BA.debugLineNum = 282;BA.debugLine="Private Sub CreateLabel(Txt As String) As Label";
 //BA.debugLineNum = 283;BA.debugLine="Dim l As Label : l.Initialize(\"\")";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 283;BA.debugLine="Dim l As Label : l.Initialize(\"\")";
_l.Initialize(ba,"");
 //BA.debugLineNum = 284;BA.debugLine="l.Text = Txt";
_l.setText(BA.ObjectToCharSequence(_txt));
 //BA.debugLineNum = 285;BA.debugLine="l.TextColor = xui.Color_Black";
_l.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 286;BA.debugLine="l.TextSize = 14";
_l.setTextSize((float) (14));
 //BA.debugLineNum = 287;BA.debugLine="l.Typeface = LoadSafeFont(\"closeout - labels.ttf\"";
_l.setTypeface((android.graphics.Typeface)(_loadsafefont("closeout - labels.ttf").getObject()));
 //BA.debugLineNum = 288;BA.debugLine="Return l";
if (true) return _l;
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.EditTextWrapper  _createqtyinput(String _tag) throws Exception{
anywheresoftware.b4a.objects.EditTextWrapper _e = null;
 //BA.debugLineNum = 303;BA.debugLine="Private Sub CreateQtyInput(Tag As String) As EditT";
 //BA.debugLineNum = 304;BA.debugLine="Dim e As EditText : e.Initialize(\"\")";
_e = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 304;BA.debugLine="Dim e As EditText : e.Initialize(\"\")";
_e.Initialize(ba,"");
 //BA.debugLineNum = 305;BA.debugLine="e.TextSize = 16";
_e.setTextSize((float) (16));
 //BA.debugLineNum = 306;BA.debugLine="e.TextColor = xui.Color_Black";
_e.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 307;BA.debugLine="e.Gravity = Gravity.CENTER";
_e.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 308;BA.debugLine="e.InputType = e.INPUT_TYPE_NUMBERS";
_e.setInputType(_e.INPUT_TYPE_NUMBERS);
 //BA.debugLineNum = 309;BA.debugLine="e.Tag = Tag";
_e.setTag((Object)(_tag));
 //BA.debugLineNum = 310;BA.debugLine="e.Enabled = False";
_e.setEnabled(__c.False);
 //BA.debugLineNum = 311;BA.debugLine="Return e";
if (true) return _e;
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper  _createradio(String _txt,boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _r = null;
 //BA.debugLineNum = 323;BA.debugLine="Private Sub CreateRadio(Txt As String, Checked As";
 //BA.debugLineNum = 324;BA.debugLine="Dim r As RadioButton : r.Initialize(\"\")";
_r = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 324;BA.debugLine="Dim r As RadioButton : r.Initialize(\"\")";
_r.Initialize(ba,"");
 //BA.debugLineNum = 325;BA.debugLine="r.Text = Txt";
_r.setText(BA.ObjectToCharSequence(_txt));
 //BA.debugLineNum = 326;BA.debugLine="r.Checked = Checked";
_r.setChecked(_checked);
 //BA.debugLineNum = 327;BA.debugLine="r.TextColor = xui.Color_Black";
_r.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 328;BA.debugLine="r.Typeface = LoadSafeFont(\"closeout - labels.ttf\"";
_r.setTypeface((android.graphics.Typeface)(_loadsafefont("closeout - labels.ttf").getObject()));
 //BA.debugLineNum = 329;BA.debugLine="Return r";
if (true) return _r;
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 51;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 52;BA.debugLine="CurrentJobData.Initialize";
_currentjobdata.Initialize();
 //BA.debugLineNum = 53;BA.debugLine="TempState.Initialize";
_tempstate.Initialize();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _loadjob(anywheresoftware.b4a.objects.collections.List _params) throws Exception{
String _rawaddr = "";
String _grp = "";
long _diff = 0L;
int _mins = 0;
 //BA.debugLineNum = 365;BA.debugLine="Public Sub LoadJob(Params As List)";
 //BA.debugLineNum = 366;BA.debugLine="CurrentJobData = Params.Get(0)";
_currentjobdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_params.Get((int) (0))));
 //BA.debugLineNum = 367;BA.debugLine="StartTime = Params.Get(1)";
_starttime = BA.ObjectToLongNumber(_params.Get((int) (1)));
 //BA.debugLineNum = 368;BA.debugLine="EndTime = Params.Get(2)";
_endtime = BA.ObjectToLongNumber(_params.Get((int) (2)));
 //BA.debugLineNum = 370;BA.debugLine="TempState.Clear";
_tempstate.Clear();
 //BA.debugLineNum = 372;BA.debugLine="If txtName.IsInitialized = False Then Return";
if (_txtname.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 374;BA.debugLine="txtName.Text = CurrentJobData.GetDefault(\"Name\",";
_txtname.setText(BA.ObjectToCharSequence(_currentjobdata.GetDefault((Object)("Name"),(Object)(""))));
 //BA.debugLineNum = 375;BA.debugLine="txtPhone.Text = CurrentJobData.GetDefault(\"Phone\"";
_txtphone.setText(BA.ObjectToCharSequence(_currentjobdata.GetDefault((Object)("Phone"),(Object)(""))));
 //BA.debugLineNum = 376;BA.debugLine="Dim rawAddr As String = CurrentJobData.GetDefault";
_rawaddr = BA.ObjectToString(_currentjobdata.GetDefault((Object)("Addr"),(Object)("")));
 //BA.debugLineNum = 377;BA.debugLine="txtAddress.Text = CleanAddress(rawAddr)";
_txtaddress.setText(BA.ObjectToCharSequence(_cleanaddress(_rawaddr)));
 //BA.debugLineNum = 379;BA.debugLine="txtIssue.Text = CurrentJobData.GetDefault(\"Issue\"";
_txtissue.setText(BA.ObjectToCharSequence(_currentjobdata.GetDefault((Object)("Issue"),(Object)(""))));
 //BA.debugLineNum = 381;BA.debugLine="Dim grp As String = CurrentJobData.GetDefault(\"Gr";
_grp = BA.ObjectToString(_currentjobdata.GetDefault((Object)("GroupLabel"),(Object)("Client")));
 //BA.debugLineNum = 382;BA.debugLine="If grp.Contains(\"Preferred\") Then spnGroup.Select";
if (_grp.contains("Preferred")) { 
_spngroup.setSelectedIndex((int) (1));};
 //BA.debugLineNum = 383;BA.debugLine="If grp.Contains(\"Blacklisted\") Then spnGroup.Sele";
if (_grp.contains("Blacklisted")) { 
_spngroup.setSelectedIndex((int) (2));};
 //BA.debugLineNum = 384;BA.debugLine="If grp.Contains(\"Client\") Or grp = \"\" Then spnGro";
if (_grp.contains("Client") || (_grp).equals("")) { 
_spngroup.setSelectedIndex((int) (0));};
 //BA.debugLineNum = 386;BA.debugLine="DateTime.DateFormat = \"h:mm a\"";
__c.DateTime.setDateFormat("h:mm a");
 //BA.debugLineNum = 387;BA.debugLine="lblTimeIn.Text = \"In: \" & DateTime.Time(StartTime";
_lbltimein.setText(BA.ObjectToCharSequence("In: "+__c.DateTime.Time(_starttime)));
 //BA.debugLineNum = 388;BA.debugLine="lblTimeOut.Text = \"Out: \" & DateTime.Time(EndTime";
_lbltimeout.setText(BA.ObjectToCharSequence("Out: "+__c.DateTime.Time(_endtime)));
 //BA.debugLineNum = 390;BA.debugLine="Dim Diff As Long = EndTime - StartTime";
_diff = (long) (_endtime-_starttime);
 //BA.debugLineNum = 391;BA.debugLine="Dim Mins As Int = Diff / 60000";
_mins = (int) (_diff/(double)60000);
 //BA.debugLineNum = 392;BA.debugLine="lblTimeTotal.Text = \"Total: \" & Mins & \"m\"";
_lbltimetotal.setText(BA.ObjectToCharSequence("Total: "+BA.NumberToString(_mins)+"m"));
 //BA.debugLineNum = 394;BA.debugLine="txtFee.Text = \"0.00\"";
_txtfee.setText(BA.ObjectToCharSequence("0.00"));
 //BA.debugLineNum = 395;BA.debugLine="txtNotes.Text = \"\"";
_txtnotes.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 398;BA.debugLine="chkTag.Checked = False : txtTagQty.Text = \"0\"";
_chktag.setChecked(__c.False);
 //BA.debugLineNum = 398;BA.debugLine="chkTag.Checked = False : txtTagQty.Text = \"0\"";
_txttagqty.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 399;BA.debugLine="chkAcc.Checked = False : txtAccQty.Text = \"0\"";
_chkacc.setChecked(__c.False);
 //BA.debugLineNum = 399;BA.debugLine="chkAcc.Checked = False : txtAccQty.Text = \"0\"";
_txtaccqty.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 400;BA.debugLine="chkGate.Checked = False : txtGateQty.Text = \"0\"";
_chkgate.setChecked(__c.False);
 //BA.debugLineNum = 400;BA.debugLine="chkGate.Checked = False : txtGateQty.Text = \"0\"";
_txtgateqty.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 402;BA.debugLine="radResolvedYes.Checked = True";
_radresolvedyes.setChecked(__c.True);
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper  _loadsafefont(String _fontname) throws Exception{
String _basedir = "";
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 333;BA.debugLine="Private Sub LoadSafeFont(FontName As String) As Ty";
 //BA.debugLineNum = 334;BA.debugLine="Dim BaseDir As String = File.DirRootExternal & \"/";
_basedir = __c.File.getDirRootExternal()+"/Geek God CRM/Fonts";
 //BA.debugLineNum = 335;BA.debugLine="If File.Exists(BaseDir, FontName) Then";
if (__c.File.Exists(_basedir,_fontname)) { 
 //BA.debugLineNum = 336;BA.debugLine="Try";
try { //BA.debugLineNum = 337;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 338;BA.debugLine="jo.InitializeStatic(\"android.graphics.Typeface\"";
_jo.InitializeStatic("android.graphics.Typeface");
 //BA.debugLineNum = 339;BA.debugLine="Return jo.RunMethod(\"createFromFile\", Array(Fil";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(_jo.RunMethod("createFromFile",new Object[]{(Object)(__c.File.Combine(_basedir,_fontname))})));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 341;BA.debugLine="Log(\"Error loading external font: \" & FontName)";
__c.LogImpl("06684680","Error loading external font: "+_fontname,0);
 };
 };
 //BA.debugLineNum = 344;BA.debugLine="If File.Exists(File.DirAssets, FontName) Then";
if (__c.File.Exists(__c.File.getDirAssets(),_fontname)) { 
 //BA.debugLineNum = 345;BA.debugLine="Return Typeface.LoadFromAssets(FontName)";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.LoadFromAssets(_fontname)));
 };
 //BA.debugLineNum = 347;BA.debugLine="Return Typeface.DEFAULT_BOLD";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT_BOLD));
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public String  _redrawui(int _currentw) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub RedrawUI(CurrentW As Int)";
 //BA.debugLineNum = 75;BA.debugLine="If Root.IsInitialized = False Then Return";
if (_root.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 78;BA.debugLine="If CurrentW > 1300 Then";
if (_currentw>1300) { 
 //BA.debugLineNum = 79;BA.debugLine="Log(\">>> [CloseOut] RedrawUI: Mike Open Big / Un";
__c.LogImpl("06094853",">>> [CloseOut] RedrawUI: Mike Open Big / Unfolded ("+BA.NumberToString(_currentw)+")",0);
 }else if(_currentw>850) { 
 //BA.debugLineNum = 81;BA.debugLine="Log(\">>> [CloseOut] RedrawUI: Mike Closed Small";
__c.LogImpl("06094855",">>> [CloseOut] RedrawUI: Mike Closed Small / Tall Phone ("+BA.NumberToString(_currentw)+")",0);
 }else {
 //BA.debugLineNum = 83;BA.debugLine="Log(\">>> [CloseOut] RedrawUI: Erin's Phone (\" &";
__c.LogImpl("06094857",">>> [CloseOut] RedrawUI: Erin's Phone ("+BA.NumberToString(_currentw)+")",0);
 };
 //BA.debugLineNum = 87;BA.debugLine="B4XPage_Resize(CurrentW, Root.Height)";
_b4xpage_resize(_currentw,_root.getHeight());
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _restoretempstate() throws Exception{
 //BA.debugLineNum = 428;BA.debugLine="Sub RestoreTempState";
 //BA.debugLineNum = 429;BA.debugLine="spnUser.SelectedIndex = TempState.Get(\"User\")";
_spnuser.setSelectedIndex((int)(BA.ObjectToNumber(_tempstate.Get((Object)("User")))));
 //BA.debugLineNum = 430;BA.debugLine="spnGroup.SelectedIndex = TempState.Get(\"Group\")";
_spngroup.setSelectedIndex((int)(BA.ObjectToNumber(_tempstate.Get((Object)("Group")))));
 //BA.debugLineNum = 431;BA.debugLine="txtIssue.Text = TempState.Get(\"Issue\")";
_txtissue.setText(BA.ObjectToCharSequence(_tempstate.Get((Object)("Issue"))));
 //BA.debugLineNum = 432;BA.debugLine="radResolvedYes.Checked = TempState.Get(\"Resolved\"";
_radresolvedyes.setChecked(BA.ObjectToBoolean(_tempstate.Get((Object)("Resolved"))));
 //BA.debugLineNum = 433;BA.debugLine="radResolvedNo.Checked = Not(radResolvedYes.Checke";
_radresolvedno.setChecked(__c.Not(_radresolvedyes.getChecked()));
 //BA.debugLineNum = 435;BA.debugLine="txtTagQty.Text = TempState.GetDefault(\"TagQty\", \"";
_txttagqty.setText(BA.ObjectToCharSequence(_tempstate.GetDefault((Object)("TagQty"),(Object)("0"))));
 //BA.debugLineNum = 436;BA.debugLine="txtAccQty.Text = TempState.GetDefault(\"AccQty\", \"";
_txtaccqty.setText(BA.ObjectToCharSequence(_tempstate.GetDefault((Object)("AccQty"),(Object)("0"))));
 //BA.debugLineNum = 437;BA.debugLine="txtGateQty.Text = TempState.GetDefault(\"GateQty\",";
_txtgateqty.setText(BA.ObjectToCharSequence(_tempstate.GetDefault((Object)("GateQty"),(Object)("0"))));
 //BA.debugLineNum = 440;BA.debugLine="If txtTagQty.Text <> \"0\" Then chkTag.Checked = Tr";
if ((_txttagqty.getText()).equals("0") == false) { 
_chktag.setChecked(__c.True);};
 //BA.debugLineNum = 441;BA.debugLine="If txtAccQty.Text <> \"0\" Then chkAcc.Checked = Tr";
if ((_txtaccqty.getText()).equals("0") == false) { 
_chkacc.setChecked(__c.True);};
 //BA.debugLineNum = 442;BA.debugLine="If txtGateQty.Text <> \"0\" Then chkGate.Checked =";
if ((_txtgateqty.getText()).equals("0") == false) { 
_chkgate.setChecked(__c.True);};
 //BA.debugLineNum = 444;BA.debugLine="txtFee.Text = TempState.Get(\"Fee\")";
_txtfee.setText(BA.ObjectToCharSequence(_tempstate.Get((Object)("Fee"))));
 //BA.debugLineNum = 445;BA.debugLine="txtNotes.Text = TempState.Get(\"Notes\")";
_txtnotes.setText(BA.ObjectToCharSequence(_tempstate.Get((Object)("Notes"))));
 //BA.debugLineNum = 447;BA.debugLine="lblTimeIn.Text = TempState.Get(\"L_In\")";
_lbltimein.setText(BA.ObjectToCharSequence(_tempstate.Get((Object)("L_In"))));
 //BA.debugLineNum = 448;BA.debugLine="lblTimeOut.Text = TempState.Get(\"L_Out\")";
_lbltimeout.setText(BA.ObjectToCharSequence(_tempstate.Get((Object)("L_Out"))));
 //BA.debugLineNum = 449;BA.debugLine="lblTimeTotal.Text = TempState.Get(\"L_Tot\")";
_lbltimetotal.setText(BA.ObjectToCharSequence(_tempstate.Get((Object)("L_Tot"))));
 //BA.debugLineNum = 450;BA.debugLine="txtName.Text = TempState.Get(\"L_Name\")";
_txtname.setText(BA.ObjectToCharSequence(_tempstate.Get((Object)("L_Name"))));
 //BA.debugLineNum = 451;BA.debugLine="txtAddress.Text = TempState.Get(\"L_Addr\")";
_txtaddress.setText(BA.ObjectToCharSequence(_tempstate.Get((Object)("L_Addr"))));
 //BA.debugLineNum = 452;BA.debugLine="txtPhone.Text = TempState.Get(\"L_Phone\")";
_txtphone.setText(BA.ObjectToCharSequence(_tempstate.Get((Object)("L_Phone"))));
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return "";
}
public String  _savetempstate() throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub SaveTempState";
 //BA.debugLineNum = 406;BA.debugLine="TempState.Clear";
_tempstate.Clear();
 //BA.debugLineNum = 407;BA.debugLine="TempState.Put(\"User\", spnUser.SelectedIndex)";
_tempstate.Put((Object)("User"),(Object)(_spnuser.getSelectedIndex()));
 //BA.debugLineNum = 408;BA.debugLine="TempState.Put(\"Group\", spnGroup.SelectedIndex)";
_tempstate.Put((Object)("Group"),(Object)(_spngroup.getSelectedIndex()));
 //BA.debugLineNum = 409;BA.debugLine="TempState.Put(\"Issue\", txtIssue.Text)";
_tempstate.Put((Object)("Issue"),(Object)(_txtissue.getText()));
 //BA.debugLineNum = 410;BA.debugLine="TempState.Put(\"Resolved\", radResolvedYes.Checked)";
_tempstate.Put((Object)("Resolved"),(Object)(_radresolvedyes.getChecked()));
 //BA.debugLineNum = 413;BA.debugLine="TempState.Put(\"TagQty\", txtTagQty.Text)";
_tempstate.Put((Object)("TagQty"),(Object)(_txttagqty.getText()));
 //BA.debugLineNum = 414;BA.debugLine="TempState.Put(\"AccQty\", txtAccQty.Text)";
_tempstate.Put((Object)("AccQty"),(Object)(_txtaccqty.getText()));
 //BA.debugLineNum = 415;BA.debugLine="TempState.Put(\"GateQty\", txtGateQty.Text)";
_tempstate.Put((Object)("GateQty"),(Object)(_txtgateqty.getText()));
 //BA.debugLineNum = 417;BA.debugLine="TempState.Put(\"Fee\", txtFee.Text)";
_tempstate.Put((Object)("Fee"),(Object)(_txtfee.getText()));
 //BA.debugLineNum = 418;BA.debugLine="TempState.Put(\"Notes\", txtNotes.Text)";
_tempstate.Put((Object)("Notes"),(Object)(_txtnotes.getText()));
 //BA.debugLineNum = 420;BA.debugLine="TempState.Put(\"L_In\", lblTimeIn.Text)";
_tempstate.Put((Object)("L_In"),(Object)(_lbltimein.getText()));
 //BA.debugLineNum = 421;BA.debugLine="TempState.Put(\"L_Out\", lblTimeOut.Text)";
_tempstate.Put((Object)("L_Out"),(Object)(_lbltimeout.getText()));
 //BA.debugLineNum = 422;BA.debugLine="TempState.Put(\"L_Tot\", lblTimeTotal.Text)";
_tempstate.Put((Object)("L_Tot"),(Object)(_lbltimetotal.getText()));
 //BA.debugLineNum = 423;BA.debugLine="TempState.Put(\"L_Name\", txtName.Text)";
_tempstate.Put((Object)("L_Name"),(Object)(_txtname.getText()));
 //BA.debugLineNum = 424;BA.debugLine="TempState.Put(\"L_Addr\", txtAddress.Text)";
_tempstate.Put((Object)("L_Addr"),(Object)(_txtaddress.getText()));
 //BA.debugLineNum = 425;BA.debugLine="TempState.Put(\"L_Phone\", txtPhone.Text)";
_tempstate.Put((Object)("L_Phone"),(Object)(_txtphone.getText()));
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return "";
}
public String  _txtfee_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 508;BA.debugLine="Sub txtFee_FocusChanged (HasFocus As Boolean)";
 //BA.debugLineNum = 509;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
 //BA.debugLineNum = 510;BA.debugLine="If txtFee.Text = \"0.00\" Then txtFee.Text = \"\"";
if ((_txtfee.getText()).equals("0.00")) { 
_txtfee.setText(BA.ObjectToCharSequence(""));};
 };
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
if (BA.fastSubCompare(sub, "BUILDUI"))
	return _buildui();
if (BA.fastSubCompare(sub, "LOADJOB"))
	return _loadjob((anywheresoftware.b4a.objects.collections.List) args[0]);
if (BA.fastSubCompare(sub, "REDRAWUI"))
	return _redrawui(((Number)args[0]).intValue());
return BA.SubDelegator.SubNotFound;
}
}
