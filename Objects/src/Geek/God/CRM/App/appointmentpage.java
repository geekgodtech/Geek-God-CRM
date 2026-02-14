package Geek.God.CRM.App;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import java.util.Calendar;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class appointmentpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "Geek.God.CRM.App.appointmentpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", Geek.God.CRM.App.appointmentpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panel1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblclientname = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblclientphone = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblclientaddr = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtissue = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _topnavbar = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _slotcontainer = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spnuserfilter = null;
public anywheresoftware.b4a.objects.collections.Map _currentclient = null;
public long _selecteddate = 0L;
public String _selecteduser = "";
public long _datebaranchor = 0L;
public anywheresoftware.b4a.objects.collections.Map _existingevents = null;
public int _pendingslothour = 0;
public anywheresoftware.b4a.objects.Timer _alarmtimer = null;
public boolean _currentappointmentcompleted = false;
public Geek.God.CRM.App.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.Timer _resizetimer = null;
public boolean _ispageready = false;
public int _lastwidth = 0;
public b4a.example.dateutils _dateutils = null;
public Geek.God.CRM.App.main _main = null;
public Geek.God.CRM.App.starter _starter = null;
public Geek.God.CRM.App.b4xpages _b4xpages = null;
public Geek.God.CRM.App.b4xcollections _b4xcollections = null;
public Geek.God.CRM.App.httputils2service _httputils2service = null;
public Geek.God.CRM.App.xuiviewsutils _xuiviewsutils = null;
public void  _alarmtimer_tick() throws Exception{
ResumableSub_AlarmTimer_Tick rsub = new ResumableSub_AlarmTimer_Tick(this);
rsub.resume(ba, null);
}
public static class ResumableSub_AlarmTimer_Tick extends BA.ResumableSub {
public ResumableSub_AlarmTimer_Tick(Geek.God.CRM.App.appointmentpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.appointmentpage parent;
int _curhr = 0;
int _curmin = 0;
anywheresoftware.b4a.objects.collections.Map _targetevent = null;
String _phonetocall = "";
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
 //BA.debugLineNum = 736;BA.debugLine="Dim curHr As Int = DateTime.GetHour(DateTime.Now)";
_curhr = parent.__c.DateTime.GetHour(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 737;BA.debugLine="Dim curMin As Int = DateTime.GetMinute(DateTime.N";
_curmin = parent.__c.DateTime.GetMinute(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 738;BA.debugLine="If curHr >= 10 And curHr <= 20 And curMin = 57 Th";
if (true) break;

case 1:
//if
this.state = 12;
if (_curhr>=10 && _curhr<=20 && _curmin==57) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 739;BA.debugLine="If ExistingEvents.ContainsKey(curHr + 1) And Not";
if (true) break;

case 4:
//if
this.state = 11;
if (parent._existingevents.ContainsKey((Object)(_curhr+1)) && parent.__c.Not(parent._currentappointmentcompleted)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 740;BA.debugLine="Dim TargetEvent As Map = ExistingEvents.Get(cur";
_targetevent = new anywheresoftware.b4a.objects.collections.Map();
_targetevent = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent._existingevents.Get((Object)(_curhr+1))));
 //BA.debugLineNum = 741;BA.debugLine="Dim PhoneToCall As String = TargetEvent.Get(\"Ph";
_phonetocall = BA.ObjectToString(_targetevent.Get((Object)("Phone")));
 //BA.debugLineNum = 743;BA.debugLine="xui.Msgbox2Async(\"3 mins to next appt!\", \"LATE";
parent._xui.Msgbox2Async(ba,BA.ObjectToCharSequence("3 mins to next appt!"),BA.ObjectToCharSequence("LATE ALARM"),"Call","Snooze","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)));
 //BA.debugLineNum = 744;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 13;
return;
case 13:
//C
this.state = 7;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 745;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 746;BA.debugLine="CallSub2(B4XPages.MainPage, \"DirectCall\", Phon";
parent.__c.CallSubNew2(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"DirectCall",(Object)(_phonetocall));
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 750;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _msgbox_result(int _result) throws Exception{
}
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 92;BA.debugLine="Try";
try { //BA.debugLineNum = 94;BA.debugLine="CallSubDelayed(Me, \"BuildUI\")";
__c.CallSubDelayed(ba,this,"BuildUI");
 //BA.debugLineNum = 95;BA.debugLine="ResizeTimer.Enabled = True";
_resizetimer.setEnabled(__c.True);
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 97;BA.debugLine="Log(\"Error in Appear: \" & LastException)";
__c.LogImpl("02293766","Error in Appear: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 76;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 79;BA.debugLine="Panel1 = xui.CreatePanel(\"Panel1\")";
_panel1 = _xui.CreatePanel(ba,"Panel1");
 //BA.debugLineNum = 80;BA.debugLine="Panel1.Color = xui.Color_White";
_panel1.setColor(_xui.Color_White);
 //BA.debugLineNum = 81;BA.debugLine="Root.AddView(Panel1, 0, 0, Root.Width, Root.Heigh";
_root.AddView((android.view.View)(_panel1.getObject()),(int) (0),(int) (0),_root.getWidth(),_root.getHeight());
 //BA.debugLineNum = 83;BA.debugLine="Dialog.Initialize(Root)";
_dialog._initialize /*String*/ (ba,_root);
 //BA.debugLineNum = 85;BA.debugLine="IsPageReady = False";
_ispageready = __c.False;
 //BA.debugLineNum = 88;BA.debugLine="CallSubDelayed(Me, \"BuildUI\")";
__c.CallSubDelayed(ba,this,"BuildUI");
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_disappear() throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Private Sub B4XPage_Disappear";
 //BA.debugLineNum = 142;BA.debugLine="ResizeTimer.Enabled = False";
_resizetimer.setEnabled(__c.False);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(int _width,int _height) throws Exception{
int _hardwarew = 0;
 //BA.debugLineNum = 262;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
 //BA.debugLineNum = 263;BA.debugLine="If Root.IsInitialized = False Then Return";
if (_root.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 264;BA.debugLine="If Width <= 0 Then Return";
if (_width<=0) { 
if (true) return "";};
 //BA.debugLineNum = 267;BA.debugLine="Dim HardwareW As Int = GetDeviceLayoutValues.Widt";
_hardwarew = __c.GetDeviceLayoutValues(ba).Width;
 //BA.debugLineNum = 268;BA.debugLine="If Width > HardwareW Then Width = HardwareW";
if (_width>_hardwarew) { 
_width = _hardwarew;};
 //BA.debugLineNum = 270;BA.debugLine="LastWidth = Width";
_lastwidth = _width;
 //BA.debugLineNum = 272;BA.debugLine="If Panel1.IsInitialized Then Panel1.SetLayoutAnim";
if (_panel1.IsInitialized()) { 
_panel1.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);};
 //BA.debugLineNum = 275;BA.debugLine="If TopNavBar.IsInitialized Then";
if (_topnavbar.IsInitialized()) { 
 //BA.debugLineNum = 276;BA.debugLine="TopNavBar.SetLayoutAnimated(0, 0, 130dip, Width,";
_topnavbar.SetLayoutAnimated((int) (0),(int) (0),__c.DipToCurrent((int) (130)),_width,__c.DipToCurrent((int) (60)));
 };
 //BA.debugLineNum = 279;BA.debugLine="If SlotContainer.IsInitialized Then";
if (_slotcontainer.IsInitialized()) { 
 //BA.debugLineNum = 280;BA.debugLine="SlotContainer.SetLayoutAnimated(0, 0, 190dip, Wi";
_slotcontainer.SetLayoutAnimated((int) (0),(int) (0),__c.DipToCurrent((int) (190)),_width,(int) (_height-__c.DipToCurrent((int) (190))));
 //BA.debugLineNum = 281;BA.debugLine="SlotContainer.Panel.Width = Width";
_slotcontainer.getPanel().setWidth(_width);
 //BA.debugLineNum = 282;BA.debugLine="BuildTimeGrid(Width)";
_buildtimegrid(_width);
 };
 //BA.debugLineNum = 285;BA.debugLine="BuildDateBar(Width)";
_builddatebar(_width);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return "";
}
public void  _bookappointment(anywheresoftware.b4a.objects.collections.Map _slotdata,anywheresoftware.b4a.objects.collections.Map _clientprofile) throws Exception{
ResumableSub_BookAppointment rsub = new ResumableSub_BookAppointment(this,_slotdata,_clientprofile);
rsub.resume(ba, null);
}
public static class ResumableSub_BookAppointment extends BA.ResumableSub {
public ResumableSub_BookAppointment(Geek.God.CRM.App.appointmentpage parent,anywheresoftware.b4a.objects.collections.Map _slotdata,anywheresoftware.b4a.objects.collections.Map _clientprofile) {
this.parent = parent;
this._slotdata = _slotdata;
this._clientprofile = _clientprofile;
}
Geek.God.CRM.App.appointmentpage parent;
anywheresoftware.b4a.objects.collections.Map _slotdata;
anywheresoftware.b4a.objects.collections.Map _clientprofile;
String _slottimestr = "";
int _h = 0;
String[] _parts = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 841;BA.debugLine="Log(\">>> [APP_DEBUG] BookAppointment EXECUTED.\")";
parent.__c.LogImpl("04128769",">>> [APP_DEBUG] BookAppointment EXECUTED.",0);
 //BA.debugLineNum = 842;BA.debugLine="Log(\">>> [APP_DEBUG] Client: \" & ClientProfile.Ge";
parent.__c.LogImpl("04128770",">>> [APP_DEBUG] Client: "+BA.ObjectToString(_clientprofile.GetDefault((Object)("Name"),(Object)("Unknown"))),0);
 //BA.debugLineNum = 843;BA.debugLine="Log(\">>> [APP_DEBUG] Slot Data: \" & SlotData)";
parent.__c.LogImpl("04128771",">>> [APP_DEBUG] Slot Data: "+BA.ObjectToString(_slotdata),0);
 //BA.debugLineNum = 846;BA.debugLine="B4XPages.ShowPage(\"AppointmentPage\")";
parent._b4xpages._showpage /*String*/ (ba,"AppointmentPage");
 //BA.debugLineNum = 847;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,this,(int) (100));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 //BA.debugLineNum = 850;BA.debugLine="LoadClientForAppt(ClientProfile)";
parent._loadclientforappt(_clientprofile);
 //BA.debugLineNum = 853;BA.debugLine="Dim SlotTimeStr As String = SlotData.GetDefault(\"";
_slottimestr = BA.ObjectToString(_slotdata.GetDefault((Object)("Time"),(Object)("10:00 AM")));
 //BA.debugLineNum = 854;BA.debugLine="Dim h As Int = 10";
_h = (int) (10);
 //BA.debugLineNum = 855;BA.debugLine="If SlotTimeStr.Contains(\":\") Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_slottimestr.contains(":")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 856;BA.debugLine="Dim parts() As String = Regex.Split(\":\", SlotTim";
_parts = parent.__c.Regex.Split(":",_slottimestr);
 //BA.debugLineNum = 857;BA.debugLine="h = parts(0)";
_h = (int)(Double.parseDouble(_parts[(int) (0)]));
 //BA.debugLineNum = 858;BA.debugLine="If SlotTimeStr.Contains(\"PM\") And h <> 12 Then h";
if (true) break;

case 4:
//if
this.state = 9;
if (_slottimestr.contains("PM") && _h!=12) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_h = (int) (_h+12);
if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 861;BA.debugLine="PendingSlotHour = h";
parent._pendingslothour = _h;
 //BA.debugLineNum = 862;BA.debugLine="Log(\">>> [APP_DEBUG] PendingSlotHour set locally";
parent.__c.LogImpl("04128790",">>> [APP_DEBUG] PendingSlotHour set locally to: "+BA.NumberToString(parent._pendingslothour),0);
 //BA.debugLineNum = 865;BA.debugLine="PromptForDetailsAndBook";
parent._promptfordetailsandbook();
 //BA.debugLineNum = 866;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _bookslot(int _selectedhour,int _duration) throws Exception{
 //BA.debugLineNum = 969;BA.debugLine="Sub BookSlot(SelectedHour As Int, Duration As Int)";
 //BA.debugLineNum = 970;BA.debugLine="If CurrentClient.ContainsKey(\"ResourceName\") = Fa";
if (_currentclient.ContainsKey((Object)("ResourceName"))==__c.False || (_currentclient.Get((Object)("ResourceName"))).equals((Object)(""))) { 
 //BA.debugLineNum = 971;BA.debugLine="xui.MsgboxAsync(\"Saving new client to Google Con";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Saving new client to Google Contacts..."),BA.ObjectToCharSequence("Please Wait"));
 //BA.debugLineNum = 972;BA.debugLine="CurrentClient.Put(\"TargetSlot\", SelectedHour)";
_currentclient.Put((Object)("TargetSlot"),(Object)(_selectedhour));
 //BA.debugLineNum = 973;BA.debugLine="CurrentClient.Put(\"Duration\", Duration)";
_currentclient.Put((Object)("Duration"),(Object)(_duration));
 //BA.debugLineNum = 974;BA.debugLine="CallSub2(B4XPages.MainPage, \"CreateNewContact\",";
__c.CallSubNew2(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"CreateNewContact",(Object)(_currentclient));
 //BA.debugLineNum = 975;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 977;BA.debugLine="FinalizeCalendarEvent(SelectedHour, Duration)";
_finalizecalendarevent(_selectedhour,_duration);
 //BA.debugLineNum = 978;BA.debugLine="End Sub";
return "";
}
public void  _btnbookslot_click() throws Exception{
ResumableSub_btnBookSlot_Click rsub = new ResumableSub_btnBookSlot_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnBookSlot_Click extends BA.ResumableSub {
public ResumableSub_btnBookSlot_Click(Geek.God.CRM.App.appointmentpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.appointmentpage parent;
anywheresoftware.b4a.objects.ButtonWrapper _nativebtn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
int _selectedhour = 0;
anywheresoftware.b4a.objects.collections.Map _slotinfo = null;
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
 //BA.debugLineNum = 870;BA.debugLine="Dim NativeBtn As Button = Sender";
_nativebtn = new anywheresoftware.b4a.objects.ButtonWrapper();
_nativebtn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(parent.__c.Sender(ba)));
 //BA.debugLineNum = 871;BA.debugLine="Dim btn As B4XView = NativeBtn";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_nativebtn.getObject()));
 //BA.debugLineNum = 873;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
parent.__c.CallSubNew(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 875;BA.debugLine="Dim SelectedHour As Int = btn.Tag";
_selectedhour = (int)(BA.ObjectToNumber(_btn.getTag()));
 //BA.debugLineNum = 878;BA.debugLine="PendingSlotHour = SelectedHour";
parent._pendingslothour = _selectedhour;
 //BA.debugLineNum = 879;BA.debugLine="Log(\">>> [APP_DEBUG] btnBookSlot_Click: Local Pen";
parent.__c.LogImpl("04194315",">>> [APP_DEBUG] btnBookSlot_Click: Local PendingSlotHour = "+BA.NumberToString(parent._pendingslothour),0);
 //BA.debugLineNum = 883;BA.debugLine="Dim SlotInfo As Map = CreateMap(\"Time\": SelectedH";
_slotinfo = new anywheresoftware.b4a.objects.collections.Map();
_slotinfo = parent.__c.createMap(new Object[] {(Object)("Time"),(Object)(BA.NumberToString(_selectedhour)+":00")});
 //BA.debugLineNum = 885;BA.debugLine="If SubExists(B4XPages.MainPage, \"SetPendingSlot\")";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.SubExists(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"SetPendingSlot")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 886;BA.debugLine="CallSub2(B4XPages.MainPage, \"SetPendingSlot\", Sl";
parent.__c.CallSubNew2(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"SetPendingSlot",(Object)(_slotinfo));
 //BA.debugLineNum = 887;BA.debugLine="Log(\">>> [APP_DEBUG] SUCCESS: Pushed Slot \" & Se";
parent.__c.LogImpl("04194323",">>> [APP_DEBUG] SUCCESS: Pushed Slot "+BA.NumberToString(_selectedhour)+" to MainPage.SetPendingSlot",0);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 889;BA.debugLine="Log(\">>> [APP_DEBUG] WARNING: MainPage.SetPendin";
parent.__c.LogImpl("04194325",">>> [APP_DEBUG] WARNING: MainPage.SetPendingSlot NOT FOUND. Traffic Cop may fail.",0);
 if (true) break;
;
 //BA.debugLineNum = 893;BA.debugLine="If CurrentClient.Get(\"Name\") <> \"\" Then";

case 6:
//if
this.state = 9;
if ((parent._currentclient.Get((Object)("Name"))).equals((Object)("")) == false) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 894;BA.debugLine="Log(\">>> [APP_DEBUG] Client pre-loaded (\" & Curr";
parent.__c.LogImpl("04194330",">>> [APP_DEBUG] Client pre-loaded ("+BA.ObjectToString(parent._currentclient.Get((Object)("Name")))+"). Skipping dialog.",0);
 //BA.debugLineNum = 895;BA.debugLine="PromptForDetailsAndBook";
parent._promptfordetailsandbook();
 //BA.debugLineNum = 896;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 899;BA.debugLine="Msgbox2Async(\"Is this for an existing client foun";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Is this for an existing client found in the Ledger/Contacts, or a brand new client?"),BA.ObjectToCharSequence("Booking Type"),"Search Client List","Cancel","New Client",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
 //BA.debugLineNum = 900;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 18;
return;
case 18:
//C
this.state = 10;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 901;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 10:
//if
this.state = 17;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 12;
}else if(_result==parent.__c.DialogResponse.NEGATIVE) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 12:
//C
this.state = 17;
 //BA.debugLineNum = 902;BA.debugLine="Log(\">>> [APP_DEBUG] User selected: Search Clien";
parent.__c.LogImpl("04194338",">>> [APP_DEBUG] User selected: Search Client List",0);
 //BA.debugLineNum = 903;BA.debugLine="B4XPages.ShowPage(\"SearchPage\")";
parent._b4xpages._showpage /*String*/ (ba,"SearchPage");
 if (true) break;

case 14:
//C
this.state = 17;
 //BA.debugLineNum = 905;BA.debugLine="Log(\">>> [APP_DEBUG] User selected: New Client\")";
parent.__c.LogImpl("04194341",">>> [APP_DEBUG] User selected: New Client",0);
 //BA.debugLineNum = 906;BA.debugLine="B4XPages.ShowPage(\"CreateClientPage\")";
parent._b4xpages._showpage /*String*/ (ba,"CreateClientPage");
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 908;BA.debugLine="PendingSlotHour = -1";
parent._pendingslothour = (int) (-1);
 //BA.debugLineNum = 909;BA.debugLine="Log(\">>> [APP_DEBUG] User Cancelled Booking.\")";
parent.__c.LogImpl("04194345",">>> [APP_DEBUG] User Cancelled Booking.",0);
 if (true) break;

case 17:
//C
this.state = -1;
;
 //BA.debugLineNum = 911;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btndatepicker_click() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 776;BA.debugLine="Sub btnDatePicker_Click";
 //BA.debugLineNum = 777;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 778;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 779;BA.debugLine="jo.RunMethod(\"showDatePicker\", Null)";
_jo.RunMethod("showDatePicker",(Object[])(__c.Null));
 //BA.debugLineNum = 780;BA.debugLine="End Sub";
return "";
}
public String  _btnhome_click() throws Exception{
 //BA.debugLineNum = 771;BA.debugLine="Sub btnHome_Click";
 //BA.debugLineNum = 772;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 773;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 //BA.debugLineNum = 774;BA.debugLine="End Sub";
return "";
}
public String  _builddatebar(int _currentwidth) throws Exception{
int _hardwarew = 0;
int _arrowwidth = 0;
int _daysareawidth = 0;
int _itemw = 0;
int _currentx = 0;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _tfdate = null;
int _i = 0;
long _d = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lblday = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xday = null;
String _dayname = "";
String _daydate = "";
anywheresoftware.b4a.objects.B4XViewWrapper _parrow = null;
anywheresoftware.b4a.objects.LabelWrapper _lblarrow = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xarrow = null;
 //BA.debugLineNum = 294;BA.debugLine="Private Sub BuildDateBar(CurrentWidth As Int)";
 //BA.debugLineNum = 296;BA.debugLine="Dim HardwareW As Int = GetDeviceLayoutValues.Widt";
_hardwarew = __c.GetDeviceLayoutValues(ba).Width;
 //BA.debugLineNum = 297;BA.debugLine="If CurrentWidth <= 0 Or CurrentWidth > HardwareW";
if (_currentwidth<=0 || _currentwidth>_hardwarew) { 
_currentwidth = _hardwarew;};
 //BA.debugLineNum = 299;BA.debugLine="TopNavBar.RemoveAllViews";
_topnavbar.RemoveAllViews();
 //BA.debugLineNum = 301;BA.debugLine="Dim ArrowWidth As Int = 50dip";
_arrowwidth = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 302;BA.debugLine="Dim DaysAreaWidth As Int = CurrentWidth - ArrowWi";
_daysareawidth = (int) (_currentwidth-_arrowwidth-__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 303;BA.debugLine="Dim itemW As Int = DaysAreaWidth / 7";
_itemw = (int) (_daysareawidth/(double)7);
 //BA.debugLineNum = 304;BA.debugLine="Dim currentX As Int = 2dip";
_currentx = __c.DipToCurrent((int) (2));
 //BA.debugLineNum = 306;BA.debugLine="Dim tfDate As Typeface = LoadSafeFont(\"appointmen";
_tfdate = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_tfdate = _loadsafefont("appointmentpage - labels.ttf");
 //BA.debugLineNum = 308;BA.debugLine="For i = 0 To 6";
{
final int step9 = 1;
final int limit9 = (int) (6);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 310;BA.debugLine="Dim d As Long = DateTime.Add(DateBarAnchor, 0, 0";
_d = __c.DateTime.Add(_datebaranchor,(int) (0),(int) (0),_i);
 //BA.debugLineNum = 312;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"DateLink\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"DateLink");
 //BA.debugLineNum = 313;BA.debugLine="p.Tag = d";
_p.setTag((Object)(_d));
 //BA.debugLineNum = 315;BA.debugLine="Dim lblDay As Label : lblDay.Initialize(\"\")";
_lblday = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 315;BA.debugLine="Dim lblDay As Label : lblDay.Initialize(\"\")";
_lblday.Initialize(ba,"");
 //BA.debugLineNum = 316;BA.debugLine="Dim xDay As B4XView = lblDay";
_xday = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xday = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblday.getObject()));
 //BA.debugLineNum = 317;BA.debugLine="DateTime.DateFormat = \"EEE\"";
__c.DateTime.setDateFormat("EEE");
 //BA.debugLineNum = 318;BA.debugLine="Dim dayName As String = DateTime.Date(d)";
_dayname = __c.DateTime.Date(_d);
 //BA.debugLineNum = 319;BA.debugLine="DateTime.DateFormat = \"MM/dd\"";
__c.DateTime.setDateFormat("MM/dd");
 //BA.debugLineNum = 320;BA.debugLine="Dim dayDate As String = DateTime.Date(d)";
_daydate = __c.DateTime.Date(_d);
 //BA.debugLineNum = 321;BA.debugLine="xDay.Text = dayName & CRLF & dayDate";
_xday.setText(BA.ObjectToCharSequence(_dayname+__c.CRLF+_daydate));
 //BA.debugLineNum = 322;BA.debugLine="xDay.TextSize = 10";
_xday.setTextSize((float) (10));
 //BA.debugLineNum = 323;BA.debugLine="xDay.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xday.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 324;BA.debugLine="lblDay.Typeface = tfDate";
_lblday.setTypeface((android.graphics.Typeface)(_tfdate.getObject()));
 //BA.debugLineNum = 327;BA.debugLine="If IsSameDay(d, SelectedDate) Then";
if (_issameday(_d,_selecteddate)) { 
 //BA.debugLineNum = 328;BA.debugLine="p.SetColorAndBorder(xui.Color_Blue, 0, 0, 5dip)";
_p.SetColorAndBorder(_xui.Color_Blue,(int) (0),(int) (0),__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 329;BA.debugLine="xDay.TextColor = xui.Color_White";
_xday.setTextColor(_xui.Color_White);
 }else {
 //BA.debugLineNum = 331;BA.debugLine="p.SetColorAndBorder(xui.Color_LightGray, 1dip,";
_p.SetColorAndBorder(_xui.Color_LightGray,__c.DipToCurrent((int) (1)),_xui.Color_Gray,__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 332;BA.debugLine="xDay.TextColor = xui.Color_Black";
_xday.setTextColor(_xui.Color_Black);
 };
 //BA.debugLineNum = 335;BA.debugLine="p.AddView(xDay, 0, 0, itemW, 50dip)";
_p.AddView((android.view.View)(_xday.getObject()),(int) (0),(int) (0),_itemw,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 336;BA.debugLine="TopNavBar.AddView(p, currentX, 5dip, itemW, 50di";
_topnavbar.AddView((android.view.View)(_p.getObject()),_currentx,__c.DipToCurrent((int) (5)),_itemw,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 337;BA.debugLine="currentX = currentX + itemW + 2dip";
_currentx = (int) (_currentx+_itemw+__c.DipToCurrent((int) (2)));
 }
};
 //BA.debugLineNum = 340;BA.debugLine="Dim pArrow As B4XView = xui.CreatePanel(\"btnDateP";
_parrow = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parrow = _xui.CreatePanel(ba,"btnDatePicker");
 //BA.debugLineNum = 341;BA.debugLine="Dim lblArrow As Label : lblArrow.Initialize(\"\")";
_lblarrow = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 341;BA.debugLine="Dim lblArrow As Label : lblArrow.Initialize(\"\")";
_lblarrow.Initialize(ba,"");
 //BA.debugLineNum = 342;BA.debugLine="Dim xArrow As B4XView = lblArrow";
_xarrow = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xarrow = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblarrow.getObject()));
 //BA.debugLineNum = 343;BA.debugLine="xArrow.Text = \"➔\"";
_xarrow.setText(BA.ObjectToCharSequence("➔"));
 //BA.debugLineNum = 344;BA.debugLine="xArrow.TextColor = xui.Color_Blue";
_xarrow.setTextColor(_xui.Color_Blue);
 //BA.debugLineNum = 345;BA.debugLine="xArrow.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xarrow.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 346;BA.debugLine="xArrow.TextSize = 24";
_xarrow.setTextSize((float) (24));
 //BA.debugLineNum = 347;BA.debugLine="pArrow.AddView(xArrow, 0, 0, ArrowWidth, 50dip)";
_parrow.AddView((android.view.View)(_xarrow.getObject()),(int) (0),(int) (0),_arrowwidth,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 349;BA.debugLine="TopNavBar.AddView(pArrow, CurrentWidth - ArrowWid";
_topnavbar.AddView((android.view.View)(_parrow.getObject()),(int) (_currentwidth-_arrowwidth),__c.DipToCurrent((int) (5)),_arrowwidth,__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return "";
}
public String  _buildinterface() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _pnlheader = null;
anywheresoftware.b4a.objects.LabelWrapper _btnhome = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xhome = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnlclient = null;
 //BA.debugLineNum = 161;BA.debugLine="Private Sub BuildInterface";
 //BA.debugLineNum = 162;BA.debugLine="Panel1.RemoveAllViews";
_panel1.RemoveAllViews();
 //BA.debugLineNum = 165;BA.debugLine="Dim pnlHeader As B4XView = xui.CreatePanel(\"\")";
_pnlheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlheader = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 166;BA.debugLine="pnlHeader.Color = 0xFFF5F5F5";
_pnlheader.setColor(((int)0xfff5f5f5));
 //BA.debugLineNum = 167;BA.debugLine="Panel1.AddView(pnlHeader, 0, 0, Root.Width, 50dip";
_panel1.AddView((android.view.View)(_pnlheader.getObject()),(int) (0),(int) (0),_root.getWidth(),__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 169;BA.debugLine="Dim btnHome As Label : btnHome.Initialize(\"btnHom";
_btnhome = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 169;BA.debugLine="Dim btnHome As Label : btnHome.Initialize(\"btnHom";
_btnhome.Initialize(ba,"btnHome");
 //BA.debugLineNum = 170;BA.debugLine="Dim xHome As B4XView = btnHome";
_xhome = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xhome = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btnhome.getObject()));
 //BA.debugLineNum = 171;BA.debugLine="xHome.Text = Chr(0xF015)";
_xhome.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf015))));
 //BA.debugLineNum = 172;BA.debugLine="btnHome.Typeface = Typeface.FONTAWESOME";
_btnhome.setTypeface(__c.Typeface.getFONTAWESOME());
 //BA.debugLineNum = 173;BA.debugLine="xHome.TextSize = 24";
_xhome.setTextSize((float) (24));
 //BA.debugLineNum = 174;BA.debugLine="xHome.TextColor = xui.Color_Black";
_xhome.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 175;BA.debugLine="xHome.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xhome.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 176;BA.debugLine="pnlHeader.AddView(xHome, 5dip, 0, 50dip, 50dip)";
_pnlheader.AddView((android.view.View)(_xhome.getObject()),__c.DipToCurrent((int) (5)),(int) (0),__c.DipToCurrent((int) (50)),__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 178;BA.debugLine="spnUserFilter.Initialize(\"spnUserFilter\")";
_spnuserfilter.Initialize(ba,"spnUserFilter");
 //BA.debugLineNum = 179;BA.debugLine="spnUserFilter.AddAll(Array As String(\"God (Mike)\"";
_spnuserfilter.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"God (Mike)","Goddess (Erin)"}));
 //BA.debugLineNum = 180;BA.debugLine="pnlHeader.AddView(spnUserFilter, 60dip, 2dip, 200";
_pnlheader.AddView((android.view.View)(_spnuserfilter.getObject()),__c.DipToCurrent((int) (60)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (200)),__c.DipToCurrent((int) (45)));
 //BA.debugLineNum = 183;BA.debugLine="Dim pnlClient As B4XView = xui.CreatePanel(\"\")";
_pnlclient = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlclient = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 184;BA.debugLine="pnlClient.SetColorAndBorder(xui.Color_White, 0, 0";
_pnlclient.SetColorAndBorder(_xui.Color_White,(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 185;BA.debugLine="Panel1.AddView(pnlClient, 0, 50dip, Root.Width, 8";
_panel1.AddView((android.view.View)(_pnlclient.getObject()),(int) (0),__c.DipToCurrent((int) (50)),_root.getWidth(),__c.DipToCurrent((int) (80)));
 //BA.debugLineNum = 188;BA.debugLine="lblClientName = CreateLabel(\"lblClientName\", \"Cli";
_lblclientname = _createlabel("lblClientName","Client Name",(int) (20),_xui.Color_Black,"appointmentpage - name.ttf");
 //BA.debugLineNum = 189;BA.debugLine="pnlClient.AddView(lblClientName, 15dip, 5dip, Roo";
_pnlclient.AddView((android.view.View)(_lblclientname.getObject()),__c.DipToCurrent((int) (15)),__c.DipToCurrent((int) (5)),(int) (_root.getWidth()-__c.DipToCurrent((int) (30))),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 191;BA.debugLine="lblClientPhone = CreateLabel(\"lblClientPhone\", \"P";
_lblclientphone = _createlabel("lblClientPhone","Phone Number",(int) (14),((int)0xff555555),"appointmentpage - labels.ttf");
 //BA.debugLineNum = 192;BA.debugLine="pnlClient.AddView(lblClientPhone, 15dip, 35dip, R";
_pnlclient.AddView((android.view.View)(_lblclientphone.getObject()),__c.DipToCurrent((int) (15)),__c.DipToCurrent((int) (35)),(int) (_root.getWidth()-__c.DipToCurrent((int) (30))),__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 194;BA.debugLine="lblClientAddr = CreateLabel(\"lblClientAddr\", \"Add";
_lblclientaddr = _createlabel("lblClientAddr","Address",(int) (14),((int)0xff777777),"appointmentpage - labels.ttf");
 //BA.debugLineNum = 195;BA.debugLine="pnlClient.AddView(lblClientAddr, 15dip, 55dip, Ro";
_pnlclient.AddView((android.view.View)(_lblclientaddr.getObject()),__c.DipToCurrent((int) (15)),__c.DipToCurrent((int) (55)),(int) (_root.getWidth()-__c.DipToCurrent((int) (30))),__c.DipToCurrent((int) (25)));
 //BA.debugLineNum = 198;BA.debugLine="TopNavBar = xui.CreatePanel(\"\")";
_topnavbar = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 199;BA.debugLine="Panel1.AddView(TopNavBar, 0, 130dip, Root.Width,";
_panel1.AddView((android.view.View)(_topnavbar.getObject()),(int) (0),__c.DipToCurrent((int) (130)),_root.getWidth(),__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 202;BA.debugLine="SlotContainer.Initialize(800dip)";
_slotcontainer.Initialize(ba,__c.DipToCurrent((int) (800)));
 //BA.debugLineNum = 203;BA.debugLine="Panel1.AddView(SlotContainer, 0, 190dip, Root.Wid";
_panel1.AddView((android.view.View)(_slotcontainer.getObject()),(int) (0),__c.DipToCurrent((int) (190)),_root.getWidth(),(int) (_root.getHeight()-__c.DipToCurrent((int) (190))));
 //BA.debugLineNum = 205;BA.debugLine="BuildDateBar(Root.Width)";
_builddatebar(_root.getWidth());
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return "";
}
public String  _buildtimegrid(int _currentwidth) throws Exception{
int _hardwarew = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnlin = null;
int _toppos = 0;
boolean _issmallscreen = false;
int _rowh = 0;
long _nowticks = 0L;
String _todaystr = "";
String _selstr = "";
int _curhour = 0;
boolean _ispastdate = false;
boolean _istoday = false;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _tflabels = null;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _tfbuttons = null;
int _hr = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _displaytime = "";
int _timewidth = 0;
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xt = null;
int _buttonwidth = 0;
int _startx = 0;
int _centerwidth = 0;
anywheresoftware.b4a.objects.collections.Map _evdata = null;
String _cname = "";
String _cphone = "";
String _caddr = "";
String _cissue = "";
String _ceventid = "";
boolean _isprimary = false;
anywheresoftware.b4a.objects.LabelWrapper _l1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _x1 = null;
anywheresoftware.b4a.objects.LabelWrapper _l2 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _x2 = null;
anywheresoftware.b4a.objects.LabelWrapper _l3 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _x3 = null;
anywheresoftware.b4a.objects.LabelWrapper _l4 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _x4 = null;
int _splitw = 0;
anywheresoftware.b4a.objects.LabelWrapper _ln = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xn = null;
anywheresoftware.b4a.objects.LabelWrapper _lp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xp = null;
anywheresoftware.b4a.objects.LabelWrapper _la = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xa = null;
anywheresoftware.b4a.objects.LabelWrapper _li = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xi = null;
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbtn = null;
int _btnright = 0;
int _btnleft = 0;
int _iconsize = 0;
int _iconleft = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbldel = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xdel = null;
boolean _ispassedtime = false;
 //BA.debugLineNum = 356;BA.debugLine="Private Sub BuildTimeGrid(CurrentWidth As Int)";
 //BA.debugLineNum = 358;BA.debugLine="Dim HardwareW As Int = GetDeviceLayoutValues.Widt";
_hardwarew = __c.GetDeviceLayoutValues(ba).Width;
 //BA.debugLineNum = 359;BA.debugLine="If CurrentWidth <= 0 Or CurrentWidth > HardwareW";
if (_currentwidth<=0 || _currentwidth>_hardwarew) { 
_currentwidth = _hardwarew;};
 //BA.debugLineNum = 361;BA.debugLine="Dim PnlIn As B4XView = SlotContainer.Panel";
_pnlin = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlin = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_slotcontainer.getPanel().getObject()));
 //BA.debugLineNum = 362;BA.debugLine="PnlIn.RemoveAllViews";
_pnlin.RemoveAllViews();
 //BA.debugLineNum = 363;BA.debugLine="Dim topPos As Int = 10dip";
_toppos = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 366;BA.debugLine="Dim IsSmallScreen As Boolean = (CurrentWidth < 13";
_issmallscreen = (_currentwidth<1300 || (_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)._lastfoldstate /*String*/ ).equals("HALF_OPENED"));
 //BA.debugLineNum = 368;BA.debugLine="Dim rowH As Int = 90dip";
_rowh = __c.DipToCurrent((int) (90));
 //BA.debugLineNum = 369;BA.debugLine="If IsSmallScreen Then rowH = 120dip";
if (_issmallscreen) { 
_rowh = __c.DipToCurrent((int) (120));};
 //BA.debugLineNum = 371;BA.debugLine="Dim NowTicks As Long = DateTime.Now";
_nowticks = __c.DateTime.getNow();
 //BA.debugLineNum = 372;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
__c.DateTime.setDateFormat("yyyyMMdd");
 //BA.debugLineNum = 373;BA.debugLine="Dim TodayStr As String = DateTime.Date(NowTicks)";
_todaystr = __c.DateTime.Date(_nowticks);
 //BA.debugLineNum = 374;BA.debugLine="Dim SelStr As String = DateTime.Date(SelectedDate";
_selstr = __c.DateTime.Date(_selecteddate);
 //BA.debugLineNum = 375;BA.debugLine="Dim CurHour As Int = DateTime.GetHour(NowTicks)";
_curhour = __c.DateTime.GetHour(_nowticks);
 //BA.debugLineNum = 376;BA.debugLine="Dim IsPastDate As Boolean = (SelectedDate < DateU";
_ispastdate = (_selecteddate<_dateutils._setdate(ba,__c.DateTime.GetYear(_nowticks),__c.DateTime.GetMonth(_nowticks),__c.DateTime.GetDayOfMonth(_nowticks)));
 //BA.debugLineNum = 377;BA.debugLine="Dim IsToday As Boolean = (TodayStr = SelStr)";
_istoday = ((_todaystr).equals(_selstr));
 //BA.debugLineNum = 379;BA.debugLine="Dim tfLabels As Typeface = LoadSafeFont(\"appointm";
_tflabels = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_tflabels = _loadsafefont("appointmentpage - labels.ttf");
 //BA.debugLineNum = 380;BA.debugLine="Dim tfButtons As Typeface = LoadSafeFont(\"appoint";
_tfbuttons = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_tfbuttons = _loadsafefont("appointmentpage - buttons.ttf");
 //BA.debugLineNum = 382;BA.debugLine="For hr = 10 To 20";
{
final int step18 = 1;
final int limit18 = (int) (20);
_hr = (int) (10) ;
for (;_hr <= limit18 ;_hr = _hr + step18 ) {
 //BA.debugLineNum = 383;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 384;BA.debugLine="p.SetColorAndBorder(xui.Color_White, 1dip, 0xFFE";
_p.SetColorAndBorder(_xui.Color_White,__c.DipToCurrent((int) (1)),((int)0xffeeeeee),(int) (0));
 //BA.debugLineNum = 387;BA.debugLine="Dim displayTime As String";
_displaytime = "";
 //BA.debugLineNum = 388;BA.debugLine="If hr > 12 Then : displayTime = (hr - 12) & \":00";
if (_hr>12) { 
 //BA.debugLineNum = 388;BA.debugLine="If hr > 12 Then : displayTime = (hr - 12) & \":00";
_displaytime = BA.NumberToString((_hr-12))+":00 PM";
 }else if(_hr==12) { 
 //BA.debugLineNum = 388;BA.debugLine="If hr > 12 Then : displayTime = (hr - 12) & \":00";
_displaytime = "12:00 PM";
 }else {
 //BA.debugLineNum = 388;BA.debugLine="If hr > 12 Then : displayTime = (hr - 12) & \":00";
_displaytime = BA.NumberToString(_hr)+":00 AM";
 };
 //BA.debugLineNum = 390;BA.debugLine="Dim TimeWidth As Int = 75dip";
_timewidth = __c.DipToCurrent((int) (75));
 //BA.debugLineNum = 391;BA.debugLine="Dim lblT As Label : lblT.Initialize(\"\") : Dim x";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 391;BA.debugLine="Dim lblT As Label : lblT.Initialize(\"\") : Dim x";
_lblt.Initialize(ba,"");
 //BA.debugLineNum = 391;BA.debugLine="Dim lblT As Label : lblT.Initialize(\"\") : Dim x";
_xt = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xt = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getObject()));
 //BA.debugLineNum = 392;BA.debugLine="xT.Text = displayTime : xT.TextColor = xui.Colo";
_xt.setText(BA.ObjectToCharSequence(_displaytime));
 //BA.debugLineNum = 392;BA.debugLine="xT.Text = displayTime : xT.TextColor = xui.Colo";
_xt.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 392;BA.debugLine="xT.Text = displayTime : xT.TextColor = xui.Colo";
_xt.setTextSize((float) (14));
 //BA.debugLineNum = 393;BA.debugLine="xT.SetTextAlignment(\"CENTER\", \"LEFT\")";
_xt.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 394;BA.debugLine="lblT.Typeface = tfLabels";
_lblt.setTypeface((android.graphics.Typeface)(_tflabels.getObject()));
 //BA.debugLineNum = 395;BA.debugLine="p.AddView(xT, 5dip, 0, TimeWidth, rowH)";
_p.AddView((android.view.View)(_xt.getObject()),__c.DipToCurrent((int) (5)),(int) (0),_timewidth,_rowh);
 //BA.debugLineNum = 398;BA.debugLine="Dim ButtonWidth As Int = 110dip";
_buttonwidth = __c.DipToCurrent((int) (110));
 //BA.debugLineNum = 399;BA.debugLine="Dim StartX As Int = TimeWidth + 5dip";
_startx = (int) (_timewidth+__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 400;BA.debugLine="Dim CenterWidth As Int = CurrentWidth - StartX";
_centerwidth = (int) (_currentwidth-_startx-_buttonwidth-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 402;BA.debugLine="If ExistingEvents.ContainsKey(hr) Then";
if (_existingevents.ContainsKey((Object)(_hr))) { 
 //BA.debugLineNum = 403;BA.debugLine="Dim EvData As Map = ExistingEvents.Get(hr)";
_evdata = new anywheresoftware.b4a.objects.collections.Map();
_evdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_existingevents.Get((Object)(_hr))));
 //BA.debugLineNum = 404;BA.debugLine="Dim cName As String = EvData.Get(\"Name\")";
_cname = BA.ObjectToString(_evdata.Get((Object)("Name")));
 //BA.debugLineNum = 405;BA.debugLine="Dim cPhone As String = EvData.Get(\"Phone\")";
_cphone = BA.ObjectToString(_evdata.Get((Object)("Phone")));
 //BA.debugLineNum = 406;BA.debugLine="Dim cAddr As String = CleanAddress(EvData.Get(";
_caddr = _cleanaddress(BA.ObjectToString(_evdata.Get((Object)("Addr"))));
 //BA.debugLineNum = 407;BA.debugLine="Dim cIssue As String = EvData.Get(\"Issue\")";
_cissue = BA.ObjectToString(_evdata.Get((Object)("Issue")));
 //BA.debugLineNum = 408;BA.debugLine="Dim cEventId As String = EvData.Get(\"EventId\")";
_ceventid = BA.ObjectToString(_evdata.Get((Object)("EventId")));
 //BA.debugLineNum = 409;BA.debugLine="Dim IsPrimary As Boolean = EvData.Get(\"IsPrima";
_isprimary = BA.ObjectToBoolean(_evdata.Get((Object)("IsPrimary")));
 //BA.debugLineNum = 411;BA.debugLine="If IsSmallScreen Then";
if (_issmallscreen) { 
 //BA.debugLineNum = 413;BA.debugLine="Dim l1 As Label : l1.Initialize(\"lblBookedNam";
_l1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 413;BA.debugLine="Dim l1 As Label : l1.Initialize(\"lblBookedNam";
_l1.Initialize(ba,"lblBookedName");
 //BA.debugLineNum = 413;BA.debugLine="Dim l1 As Label : l1.Initialize(\"lblBookedNam";
_x1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_x1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_l1.getObject()));
 //BA.debugLineNum = 414;BA.debugLine="x1.Text = cName : x1.TextColor = xui.Color_Bl";
_x1.setText(BA.ObjectToCharSequence(_cname));
 //BA.debugLineNum = 414;BA.debugLine="x1.Text = cName : x1.TextColor = xui.Color_Bl";
_x1.setTextColor(_xui.Color_Blue);
 //BA.debugLineNum = 414;BA.debugLine="x1.Text = cName : x1.TextColor = xui.Color_Bl";
_x1.setTextSize((float) (14));
 //BA.debugLineNum = 415;BA.debugLine="l1.Typeface = tfLabels : x1.Tag = cName";
_l1.setTypeface((android.graphics.Typeface)(_tflabels.getObject()));
 //BA.debugLineNum = 415;BA.debugLine="l1.Typeface = tfLabels : x1.Tag = cName";
_x1.setTag((Object)(_cname));
 //BA.debugLineNum = 416;BA.debugLine="p.AddView(x1, StartX, 10dip, CenterWidth, 20d";
_p.AddView((android.view.View)(_x1.getObject()),_startx,__c.DipToCurrent((int) (10)),_centerwidth,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 418;BA.debugLine="Dim l2 As Label : l2.Initialize(\"lblBookedPho";
_l2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 418;BA.debugLine="Dim l2 As Label : l2.Initialize(\"lblBookedPho";
_l2.Initialize(ba,"lblBookedPhone");
 //BA.debugLineNum = 418;BA.debugLine="Dim l2 As Label : l2.Initialize(\"lblBookedPho";
_x2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_x2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_l2.getObject()));
 //BA.debugLineNum = 419;BA.debugLine="x2.Text = cPhone : x2.TextColor = xui.Color_B";
_x2.setText(BA.ObjectToCharSequence(_cphone));
 //BA.debugLineNum = 419;BA.debugLine="x2.Text = cPhone : x2.TextColor = xui.Color_B";
_x2.setTextColor(_xui.Color_Blue);
 //BA.debugLineNum = 419;BA.debugLine="x2.Text = cPhone : x2.TextColor = xui.Color_B";
_x2.setTextSize((float) (13));
 //BA.debugLineNum = 419;BA.debugLine="x2.Text = cPhone : x2.TextColor = xui.Color_B";
_x2.setTag((Object)(_cphone));
 //BA.debugLineNum = 420;BA.debugLine="l2.Typeface = tfLabels";
_l2.setTypeface((android.graphics.Typeface)(_tflabels.getObject()));
 //BA.debugLineNum = 421;BA.debugLine="p.AddView(x2, StartX, 32dip, CenterWidth, 20d";
_p.AddView((android.view.View)(_x2.getObject()),_startx,__c.DipToCurrent((int) (32)),_centerwidth,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 423;BA.debugLine="Dim l3 As Label : l3.Initialize(\"lblBookedAdd";
_l3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 423;BA.debugLine="Dim l3 As Label : l3.Initialize(\"lblBookedAdd";
_l3.Initialize(ba,"lblBookedAddr");
 //BA.debugLineNum = 423;BA.debugLine="Dim l3 As Label : l3.Initialize(\"lblBookedAdd";
_x3 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_x3 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_l3.getObject()));
 //BA.debugLineNum = 424;BA.debugLine="x3.Text = cAddr : x3.TextColor = xui.Color_Bl";
_x3.setText(BA.ObjectToCharSequence(_caddr));
 //BA.debugLineNum = 424;BA.debugLine="x3.Text = cAddr : x3.TextColor = xui.Color_Bl";
_x3.setTextColor(_xui.Color_Blue);
 //BA.debugLineNum = 424;BA.debugLine="x3.Text = cAddr : x3.TextColor = xui.Color_Bl";
_x3.setTextSize((float) (12));
 //BA.debugLineNum = 424;BA.debugLine="x3.Text = cAddr : x3.TextColor = xui.Color_Bl";
_x3.setTag((Object)(_caddr));
 //BA.debugLineNum = 425;BA.debugLine="l3.Typeface = tfLabels";
_l3.setTypeface((android.graphics.Typeface)(_tflabels.getObject()));
 //BA.debugLineNum = 426;BA.debugLine="p.AddView(x3, StartX, 54dip, CenterWidth, 20d";
_p.AddView((android.view.View)(_x3.getObject()),_startx,__c.DipToCurrent((int) (54)),_centerwidth,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 428;BA.debugLine="Dim l4 As Label : l4.Initialize(\"\") : Dim x4";
_l4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 428;BA.debugLine="Dim l4 As Label : l4.Initialize(\"\") : Dim x4";
_l4.Initialize(ba,"");
 //BA.debugLineNum = 428;BA.debugLine="Dim l4 As Label : l4.Initialize(\"\") : Dim x4";
_x4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_x4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_l4.getObject()));
 //BA.debugLineNum = 429;BA.debugLine="x4.Text = cIssue : x4.TextColor = xui.Color_B";
_x4.setText(BA.ObjectToCharSequence(_cissue));
 //BA.debugLineNum = 429;BA.debugLine="x4.Text = cIssue : x4.TextColor = xui.Color_B";
_x4.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 429;BA.debugLine="x4.Text = cIssue : x4.TextColor = xui.Color_B";
_x4.setTextSize((float) (12));
 //BA.debugLineNum = 430;BA.debugLine="l4.Typeface = tfLabels";
_l4.setTypeface((android.graphics.Typeface)(_tflabels.getObject()));
 //BA.debugLineNum = 431;BA.debugLine="p.AddView(x4, StartX, 76dip, CenterWidth, 40d";
_p.AddView((android.view.View)(_x4.getObject()),_startx,__c.DipToCurrent((int) (76)),_centerwidth,__c.DipToCurrent((int) (40)));
 }else {
 //BA.debugLineNum = 434;BA.debugLine="Dim SplitW As Int = CenterWidth / 2";
_splitw = (int) (_centerwidth/(double)2);
 //BA.debugLineNum = 435;BA.debugLine="Dim lN As Label : lN.Initialize(\"lblBookedNam";
_ln = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 435;BA.debugLine="Dim lN As Label : lN.Initialize(\"lblBookedNam";
_ln.Initialize(ba,"lblBookedName");
 //BA.debugLineNum = 435;BA.debugLine="Dim lN As Label : lN.Initialize(\"lblBookedNam";
_xn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ln.getObject()));
 //BA.debugLineNum = 436;BA.debugLine="xN.Text = cName : xN.TextColor = xui.Color_Bl";
_xn.setText(BA.ObjectToCharSequence(_cname));
 //BA.debugLineNum = 436;BA.debugLine="xN.Text = cName : xN.TextColor = xui.Color_Bl";
_xn.setTextColor(_xui.Color_Blue);
 //BA.debugLineNum = 436;BA.debugLine="xN.Text = cName : xN.TextColor = xui.Color_Bl";
_xn.setTextSize((float) (14));
 //BA.debugLineNum = 436;BA.debugLine="xN.Text = cName : xN.TextColor = xui.Color_Bl";
_ln.setTypeface((android.graphics.Typeface)(_tflabels.getObject()));
 //BA.debugLineNum = 436;BA.debugLine="xN.Text = cName : xN.TextColor = xui.Color_Bl";
_xn.setTag((Object)(_cname));
 //BA.debugLineNum = 437;BA.debugLine="xN.SetTextAlignment(\"CENTER\", \"RIGHT\")";
_xn.SetTextAlignment("CENTER","RIGHT");
 //BA.debugLineNum = 438;BA.debugLine="p.AddView(xN, StartX, 15dip, SplitW - 5dip, 2";
_p.AddView((android.view.View)(_xn.getObject()),_startx,__c.DipToCurrent((int) (15)),(int) (_splitw-__c.DipToCurrent((int) (5))),__c.DipToCurrent((int) (25)));
 //BA.debugLineNum = 440;BA.debugLine="Dim lP As Label : lP.Initialize(\"lblBookedPho";
_lp = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 440;BA.debugLine="Dim lP As Label : lP.Initialize(\"lblBookedPho";
_lp.Initialize(ba,"lblBookedPhone");
 //BA.debugLineNum = 440;BA.debugLine="Dim lP As Label : lP.Initialize(\"lblBookedPho";
_xp = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xp = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lp.getObject()));
 //BA.debugLineNum = 441;BA.debugLine="xP.Text = cPhone : xP.TextColor = xui.Color_B";
_xp.setText(BA.ObjectToCharSequence(_cphone));
 //BA.debugLineNum = 441;BA.debugLine="xP.Text = cPhone : xP.TextColor = xui.Color_B";
_xp.setTextColor(_xui.Color_Blue);
 //BA.debugLineNum = 441;BA.debugLine="xP.Text = cPhone : xP.TextColor = xui.Color_B";
_xp.setTextSize((float) (13));
 //BA.debugLineNum = 441;BA.debugLine="xP.Text = cPhone : xP.TextColor = xui.Color_B";
_xp.setTag((Object)(_cphone));
 //BA.debugLineNum = 442;BA.debugLine="lP.Typeface = tfLabels";
_lp.setTypeface((android.graphics.Typeface)(_tflabels.getObject()));
 //BA.debugLineNum = 443;BA.debugLine="xP.SetTextAlignment(\"CENTER\", \"RIGHT\")";
_xp.SetTextAlignment("CENTER","RIGHT");
 //BA.debugLineNum = 444;BA.debugLine="p.AddView(xP, StartX, 45dip, SplitW - 5dip, 2";
_p.AddView((android.view.View)(_xp.getObject()),_startx,__c.DipToCurrent((int) (45)),(int) (_splitw-__c.DipToCurrent((int) (5))),__c.DipToCurrent((int) (25)));
 //BA.debugLineNum = 446;BA.debugLine="Dim lA As Label : lA.Initialize(\"lblBookedAdd";
_la = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 446;BA.debugLine="Dim lA As Label : lA.Initialize(\"lblBookedAdd";
_la.Initialize(ba,"lblBookedAddr");
 //BA.debugLineNum = 446;BA.debugLine="Dim lA As Label : lA.Initialize(\"lblBookedAdd";
_xa = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xa = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_la.getObject()));
 //BA.debugLineNum = 447;BA.debugLine="xA.Text = cAddr : xA.TextColor = xui.Color_Bl";
_xa.setText(BA.ObjectToCharSequence(_caddr));
 //BA.debugLineNum = 447;BA.debugLine="xA.Text = cAddr : xA.TextColor = xui.Color_Bl";
_xa.setTextColor(_xui.Color_Blue);
 //BA.debugLineNum = 447;BA.debugLine="xA.Text = cAddr : xA.TextColor = xui.Color_Bl";
_xa.setTextSize((float) (13));
 //BA.debugLineNum = 447;BA.debugLine="xA.Text = cAddr : xA.TextColor = xui.Color_Bl";
_xa.setTag((Object)(_caddr));
 //BA.debugLineNum = 448;BA.debugLine="lA.Typeface = tfLabels";
_la.setTypeface((android.graphics.Typeface)(_tflabels.getObject()));
 //BA.debugLineNum = 449;BA.debugLine="xA.SetTextAlignment(\"CENTER\", \"LEFT\")";
_xa.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 450;BA.debugLine="p.AddView(xA, StartX + SplitW + 5dip, 15dip,";
_p.AddView((android.view.View)(_xa.getObject()),(int) (_startx+_splitw+__c.DipToCurrent((int) (5))),__c.DipToCurrent((int) (15)),(int) (_splitw-__c.DipToCurrent((int) (5))),__c.DipToCurrent((int) (25)));
 //BA.debugLineNum = 452;BA.debugLine="Dim lI As Label : lI.Initialize(\"\") : Dim xI";
_li = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 452;BA.debugLine="Dim lI As Label : lI.Initialize(\"\") : Dim xI";
_li.Initialize(ba,"");
 //BA.debugLineNum = 452;BA.debugLine="Dim lI As Label : lI.Initialize(\"\") : Dim xI";
_xi = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xi = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_li.getObject()));
 //BA.debugLineNum = 453;BA.debugLine="xI.Text = cIssue : xI.TextColor = xui.Color_B";
_xi.setText(BA.ObjectToCharSequence(_cissue));
 //BA.debugLineNum = 453;BA.debugLine="xI.Text = cIssue : xI.TextColor = xui.Color_B";
_xi.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 453;BA.debugLine="xI.Text = cIssue : xI.TextColor = xui.Color_B";
_xi.setTextSize((float) (13));
 //BA.debugLineNum = 454;BA.debugLine="lI.Typeface = tfLabels";
_li.setTypeface((android.graphics.Typeface)(_tflabels.getObject()));
 //BA.debugLineNum = 455;BA.debugLine="xI.SetTextAlignment(\"CENTER\", \"LEFT\")";
_xi.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 456;BA.debugLine="p.AddView(xI, StartX + SplitW + 5dip, 45dip,";
_p.AddView((android.view.View)(_xi.getObject()),(int) (_startx+_splitw+__c.DipToCurrent((int) (5))),__c.DipToCurrent((int) (45)),(int) (_splitw-__c.DipToCurrent((int) (5))),__c.DipToCurrent((int) (25)));
 };
 //BA.debugLineNum = 460;BA.debugLine="If IsPrimary Then";
if (_isprimary) { 
 //BA.debugLineNum = 461;BA.debugLine="Dim btn As Button : btn.Initialize(\"btnBookSl";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 461;BA.debugLine="Dim btn As Button : btn.Initialize(\"btnBookSl";
_btn.Initialize(ba,"btnBookSlot");
 //BA.debugLineNum = 462;BA.debugLine="Dim xBtn As B4XView = btn";
_xbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()));
 //BA.debugLineNum = 463;BA.debugLine="xBtn.Text = \"BOOKED\" : xBtn.TextSize = 11 : x";
_xbtn.setText(BA.ObjectToCharSequence("BOOKED"));
 //BA.debugLineNum = 463;BA.debugLine="xBtn.Text = \"BOOKED\" : xBtn.TextSize = 11 : x";
_xbtn.setTextSize((float) (11));
 //BA.debugLineNum = 463;BA.debugLine="xBtn.Text = \"BOOKED\" : xBtn.TextSize = 11 : x";
_xbtn.setEnabled(__c.False);
 //BA.debugLineNum = 464;BA.debugLine="xBtn.SetColorAndBorder(xui.Color_Gray, 0, 0,";
_xbtn.SetColorAndBorder(_xui.Color_Gray,(int) (0),(int) (0),__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 464;BA.debugLine="xBtn.SetColorAndBorder(xui.Color_Gray, 0, 0,";
_xbtn.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 465;BA.debugLine="btn.Typeface = tfButtons";
_btn.setTypeface((android.graphics.Typeface)(_tfbuttons.getObject()));
 //BA.debugLineNum = 467;BA.debugLine="Dim BtnRight As Int = CurrentWidth - 5dip";
_btnright = (int) (_currentwidth-__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 468;BA.debugLine="Dim BtnLeft As Int = BtnRight - ButtonWidth";
_btnleft = (int) (_btnright-_buttonwidth);
 //BA.debugLineNum = 469;BA.debugLine="p.AddView(xBtn, BtnLeft, 22dip, ButtonWidth,";
_p.AddView((android.view.View)(_xbtn.getObject()),_btnleft,__c.DipToCurrent((int) (22)),_buttonwidth,__c.DipToCurrent((int) (45)));
 //BA.debugLineNum = 471;BA.debugLine="Dim IconSize As Int = 30dip";
_iconsize = __c.DipToCurrent((int) (30));
 //BA.debugLineNum = 472;BA.debugLine="Dim IconLeft As Int = BtnLeft - IconSize - 10";
_iconleft = (int) (_btnleft-_iconsize-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 474;BA.debugLine="Dim lblDel As Label : lblDel.Initialize(\"lblD";
_lbldel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 474;BA.debugLine="Dim lblDel As Label : lblDel.Initialize(\"lblD";
_lbldel.Initialize(ba,"lblDelete");
 //BA.debugLineNum = 474;BA.debugLine="Dim lblDel As Label : lblDel.Initialize(\"lblD";
_xdel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xdel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbldel.getObject()));
 //BA.debugLineNum = 475;BA.debugLine="xDel.Text = \"🚫\" : xDel.TextSize = 22 : xDel.";
_xdel.setText(BA.ObjectToCharSequence("🚫"));
 //BA.debugLineNum = 475;BA.debugLine="xDel.Text = \"🚫\" : xDel.TextSize = 22 : xDel.";
_xdel.setTextSize((float) (22));
 //BA.debugLineNum = 475;BA.debugLine="xDel.Text = \"🚫\" : xDel.TextSize = 22 : xDel.";
_xdel.setTag((Object)(_ceventid));
 //BA.debugLineNum = 476;BA.debugLine="xDel.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xdel.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 477;BA.debugLine="p.AddView(xDel, IconLeft, 27dip, IconSize, Ic";
_p.AddView((android.view.View)(_xdel.getObject()),_iconleft,__c.DipToCurrent((int) (27)),_iconsize,_iconsize);
 };
 }else {
 //BA.debugLineNum = 481;BA.debugLine="Dim IsPassedTime As Boolean = False";
_ispassedtime = __c.False;
 //BA.debugLineNum = 482;BA.debugLine="If IsPastDate Then IsPassedTime = True";
if (_ispastdate) { 
_ispassedtime = __c.True;};
 //BA.debugLineNum = 483;BA.debugLine="If IsToday And hr <= CurHour Then IsPassedTime";
if (_istoday && _hr<=_curhour) { 
_ispassedtime = __c.True;};
 //BA.debugLineNum = 485;BA.debugLine="Dim btn As Button : btn.Initialize(\"btnBookSlo";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 485;BA.debugLine="Dim btn As Button : btn.Initialize(\"btnBookSlo";
_btn.Initialize(ba,"btnBookSlot");
 //BA.debugLineNum = 486;BA.debugLine="Dim xBtn As B4XView = btn : xBtn.Tag = hr";
_xbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()));
 //BA.debugLineNum = 486;BA.debugLine="Dim xBtn As B4XView = btn : xBtn.Tag = hr";
_xbtn.setTag((Object)(_hr));
 //BA.debugLineNum = 487;BA.debugLine="btn.Typeface = tfButtons";
_btn.setTypeface((android.graphics.Typeface)(_tfbuttons.getObject()));
 //BA.debugLineNum = 489;BA.debugLine="If IsPassedTime Then";
if (_ispassedtime) { 
 //BA.debugLineNum = 490;BA.debugLine="xBtn.Text = \"PASSED\" : xBtn.SetColorAndBorder";
_xbtn.setText(BA.ObjectToCharSequence("PASSED"));
 //BA.debugLineNum = 490;BA.debugLine="xBtn.Text = \"PASSED\" : xBtn.SetColorAndBorder";
_xbtn.SetColorAndBorder(_xui.Color_LightGray,(int) (0),(int) (0),__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 490;BA.debugLine="xBtn.Text = \"PASSED\" : xBtn.SetColorAndBorder";
_xbtn.setEnabled(__c.False);
 }else {
 //BA.debugLineNum = 492;BA.debugLine="xBtn.Text = \"BOOK\" : xBtn.SetColorAndBorder(0";
_xbtn.setText(BA.ObjectToCharSequence("BOOK"));
 //BA.debugLineNum = 492;BA.debugLine="xBtn.Text = \"BOOK\" : xBtn.SetColorAndBorder(0";
_xbtn.SetColorAndBorder(((int)0xff2e7d32),(int) (0),(int) (0),__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 492;BA.debugLine="xBtn.Text = \"BOOK\" : xBtn.SetColorAndBorder(0";
_xbtn.setEnabled(__c.True);
 };
 //BA.debugLineNum = 494;BA.debugLine="xBtn.TextColor = xui.Color_White : xBtn.TextSi";
_xbtn.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 494;BA.debugLine="xBtn.TextColor = xui.Color_White : xBtn.TextSi";
_xbtn.setTextSize((float) (13));
 //BA.debugLineNum = 495;BA.debugLine="p.AddView(xBtn, CurrentWidth - ButtonWidth - 5";
_p.AddView((android.view.View)(_xbtn.getObject()),(int) (_currentwidth-_buttonwidth-__c.DipToCurrent((int) (5))),__c.DipToCurrent((int) (22)),_buttonwidth,__c.DipToCurrent((int) (45)));
 };
 //BA.debugLineNum = 498;BA.debugLine="PnlIn.AddView(p, 0, topPos, CurrentWidth, rowH)";
_pnlin.AddView((android.view.View)(_p.getObject()),(int) (0),_toppos,_currentwidth,_rowh);
 //BA.debugLineNum = 499;BA.debugLine="topPos = topPos + rowH + 2dip";
_toppos = (int) (_toppos+_rowh+__c.DipToCurrent((int) (2)));
 }
};
 //BA.debugLineNum = 501;BA.debugLine="PnlIn.Height = topPos";
_pnlin.setHeight(_toppos);
 //BA.debugLineNum = 502;BA.debugLine="End Sub";
return "";
}
public void  _buildui() throws Exception{
ResumableSub_BuildUI rsub = new ResumableSub_BuildUI(this);
rsub.resume(ba, null);
}
public static class ResumableSub_BuildUI extends BA.ResumableSub {
public ResumableSub_BuildUI(Geek.God.CRM.App.appointmentpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.appointmentpage parent;
anywheresoftware.b4a.objects.collections.Map _settings = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 104;BA.debugLine="If File.Exists(File.DirInternal, \"settings.map\")";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.File.Exists(parent.__c.File.getDirInternal(),"settings.map")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 105;BA.debugLine="Dim settings As Map = File.ReadMap(File.DirInter";
_settings = new anywheresoftware.b4a.objects.collections.Map();
_settings = parent.__c.File.ReadMap(parent.__c.File.getDirInternal(),"settings.map");
 //BA.debugLineNum = 106;BA.debugLine="SelectedUser = settings.GetDefault(\"CurrentUser\"";
parent._selecteduser = BA.ObjectToString(_settings.GetDefault((Object)("CurrentUser"),(Object)("Mike")));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 108;BA.debugLine="SelectedUser = \"Mike\"";
parent._selecteduser = "Mike";
 if (true) break;
;
 //BA.debugLineNum = 112;BA.debugLine="If Root.Width = 0 Then";

case 6:
//if
this.state = 9;
if (parent._root.getWidth()==0) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 113;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,this,(int) (50));
this.state = 30;
return;
case 30:
//C
this.state = 9;
;
 //BA.debugLineNum = 114;BA.debugLine="CallSubDelayed(Me, \"BuildUI\")";
parent.__c.CallSubDelayed(ba,parent,"BuildUI");
 //BA.debugLineNum = 115;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
 //BA.debugLineNum = 119;BA.debugLine="If IsPageReady = False Or Abs(Root.Width - LastWi";

case 9:
//if
this.state = 29;
if (parent._ispageready==parent.__c.False || parent.__c.Abs(parent._root.getWidth()-parent._lastwidth)>parent.__c.DipToCurrent((int) (20))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 120;BA.debugLine="BuildInterface";
parent._buildinterface();
 //BA.debugLineNum = 123;BA.debugLine="If spnUserFilter.IsInitialized Then";
if (true) break;

case 12:
//if
this.state = 23;
if (parent._spnuserfilter.IsInitialized()) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 124;BA.debugLine="If SelectedUser = \"Mike\" Then spnUserFilter.Sel";
if (true) break;

case 15:
//if
this.state = 22;
if ((parent._selecteduser).equals("Mike")) { 
this.state = 17;
;}
else {
this.state = 19;
;}if (true) break;

case 17:
//C
this.state = 22;
parent._spnuserfilter.setSelectedIndex((int) (0));
if (true) break;

case 19:
//C
this.state = 22;
parent._spnuserfilter.setSelectedIndex((int) (1));
if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;
;
 //BA.debugLineNum = 128;BA.debugLine="If CurrentClient.Get(\"Name\") <> \"\" Then";

case 23:
//if
this.state = 28;
if ((parent._currentclient.Get((Object)("Name"))).equals((Object)("")) == false) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 28;
 //BA.debugLineNum = 130;BA.debugLine="LoadClientForAppt(CurrentClient)";
parent._loadclientforappt(parent._currentclient);
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 132;BA.debugLine="RefreshSchedule";
parent._refreshschedule();
 if (true) break;

case 28:
//C
this.state = 29;
;
 //BA.debugLineNum = 135;BA.debugLine="IsPageReady = True";
parent._ispageready = parent.__c.True;
 //BA.debugLineNum = 136;BA.debugLine="LastWidth = Root.Width";
parent._lastwidth = parent._root.getWidth();
 //BA.debugLineNum = 137;BA.debugLine="B4XPage_Resize(Root.Width, Root.Height)";
parent._b4xpage_resize(parent._root.getWidth(),parent._root.getHeight());
 if (true) break;

case 29:
//C
this.state = -1;
;
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _checkavailability(int _starthour,int _duration) throws Exception{
int _h = 0;
 //BA.debugLineNum = 962;BA.debugLine="Private Sub CheckAvailability(StartHour As Int, Du";
 //BA.debugLineNum = 963;BA.debugLine="For h = StartHour To StartHour + Duration - 1";
{
final int step1 = 1;
final int limit1 = (int) (_starthour+_duration-1);
_h = _starthour ;
for (;_h <= limit1 ;_h = _h + step1 ) {
 //BA.debugLineNum = 964;BA.debugLine="If ExistingEvents.ContainsKey(h) Then Return Fal";
if (_existingevents.ContainsKey((Object)(_h))) { 
if (true) return __c.False;};
 }
};
 //BA.debugLineNum = 966;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 967;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 7;BA.debugLine="Private Panel1 As B4XView";
_panel1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private lblClientName As B4XView";
_lblclientname = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private lblClientPhone As B4XView";
_lblclientphone = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private lblClientAddr As B4XView";
_lblclientaddr = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private txtIssue As B4XView";
_txtissue = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private TopNavBar As B4XView";
_topnavbar = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private SlotContainer As ScrollView";
_slotcontainer = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private spnUserFilter As Spinner";
_spnuserfilter = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private CurrentClient As Map";
_currentclient = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 20;BA.debugLine="Private SelectedDate As Long";
_selecteddate = 0L;
 //BA.debugLineNum = 21;BA.debugLine="Private SelectedUser As String";
_selecteduser = "";
 //BA.debugLineNum = 24;BA.debugLine="Private DateBarAnchor As Long";
_datebaranchor = 0L;
 //BA.debugLineNum = 27;BA.debugLine="Private ExistingEvents As Map";
_existingevents = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 30;BA.debugLine="Public PendingSlotHour As Int = -1";
_pendingslothour = (int) (-1);
 //BA.debugLineNum = 33;BA.debugLine="Private AlarmTimer As Timer";
_alarmtimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 34;BA.debugLine="Private CurrentAppointmentCompleted As Boolean =";
_currentappointmentcompleted = __c.False;
 //BA.debugLineNum = 37;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new Geek.God.CRM.App.b4xdialog();
 //BA.debugLineNum = 40;BA.debugLine="Private ResizeTimer As Timer";
_resizetimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 41;BA.debugLine="Private IsPageReady As Boolean = False";
_ispageready = __c.False;
 //BA.debugLineNum = 42;BA.debugLine="Private LastWidth As Int = 0";
_lastwidth = (int) (0);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _cleanaddress(String _addr) throws Exception{
String _temp = "";
String _zip = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
String _streetpart = "";
 //BA.debugLineNum = 504;BA.debugLine="Private Sub CleanAddress(Addr As String) As String";
 //BA.debugLineNum = 505;BA.debugLine="Dim temp As String = Addr.Replace(Chr(10), \" \").R";
_temp = _addr.replace(BA.ObjectToString(__c.Chr((int) (10)))," ").replace(BA.ObjectToString(__c.Chr((int) (13)))," ");
 //BA.debugLineNum = 506;BA.debugLine="Dim Zip As String = \"\"";
_zip = "";
 //BA.debugLineNum = 507;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"\\b\\d{5}(?:-\\d{4";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = __c.Regex.Matcher("\\b\\d{5}(?:-\\d{4})?\\b",_temp);
 //BA.debugLineNum = 508;BA.debugLine="If m.Find Then Zip = m.Match";
if (_m.Find()) { 
_zip = _m.getMatch();};
 //BA.debugLineNum = 509;BA.debugLine="Dim StreetPart As String = temp";
_streetpart = _temp;
 //BA.debugLineNum = 510;BA.debugLine="If temp.Contains(\",\") Then StreetPart = temp.SubS";
if (_temp.contains(",")) { 
_streetpart = _temp.substring((int) (0),_temp.indexOf(",")).trim();};
 //BA.debugLineNum = 511;BA.debugLine="If Zip <> \"\" Then Return StreetPart & \" \" & Zip E";
if ((_zip).equals("") == false) { 
if (true) return _streetpart+" "+_zip;}
else {
if (true) return _streetpart;};
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(String _eventname,String _text,int _size,int _color,String _fontname) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
 //BA.debugLineNum = 208;BA.debugLine="Private Sub CreateLabel(EventName As String, Text";
 //BA.debugLineNum = 209;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 210;BA.debugLine="lbl.Initialize(EventName)";
_lbl.Initialize(ba,_eventname);
 //BA.debugLineNum = 211;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 212;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 213;BA.debugLine="xlbl.TextSize = Size";
_xlbl.setTextSize((float) (_size));
 //BA.debugLineNum = 214;BA.debugLine="xlbl.TextColor = Color";
_xlbl.setTextColor(_color);
 //BA.debugLineNum = 216;BA.debugLine="lbl.Typeface = LoadSafeFont(FontName)";
_lbl.setTypeface((android.graphics.Typeface)(_loadsafefont(_fontname).getObject()));
 //BA.debugLineNum = 217;BA.debugLine="Return xlbl";
if (true) return _xlbl;
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public String  _createrfc3339(long _datems,int _hour) throws Exception{
 //BA.debugLineNum = 1012;BA.debugLine="Private Sub CreateRFC3339(DateMs As Long, Hour As";
 //BA.debugLineNum = 1013;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 1014;BA.debugLine="Return DateTime.Date(DateMs) & \"T\" & NumberFormat";
if (true) return __c.DateTime.Date(_datems)+"T"+__c.NumberFormat(_hour,(int) (2),(int) (0))+":00:00-05:00";
 //BA.debugLineNum = 1015;BA.debugLine="End Sub";
return "";
}
public String  _datelink_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _nativebtn = null;
Object _val = null;
int _targetw = 0;
int _devicew = 0;
 //BA.debugLineNum = 752;BA.debugLine="Sub DateLink_Click";
 //BA.debugLineNum = 754;BA.debugLine="Dim NativeBtn As B4XView = Sender";
_nativebtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_nativebtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 755;BA.debugLine="Dim Val As Object = NativeBtn.Tag";
_val = _nativebtn.getTag();
 //BA.debugLineNum = 757;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 758;BA.debugLine="SelectedDate = Val";
_selecteddate = BA.ObjectToLongNumber(_val);
 //BA.debugLineNum = 763;BA.debugLine="Dim TargetW As Int = Root.Width";
_targetw = _root.getWidth();
 //BA.debugLineNum = 764;BA.debugLine="Dim DeviceW As Int = GetDeviceLayoutValues.Width";
_devicew = __c.GetDeviceLayoutValues(ba).Width;
 //BA.debugLineNum = 765;BA.debugLine="If TargetW > DeviceW Or TargetW <= 0 Then TargetW";
if (_targetw>_devicew || _targetw<=0) { 
_targetw = _devicew;};
 //BA.debugLineNum = 767;BA.debugLine="BuildDateBar(TargetW)";
_builddatebar(_targetw);
 //BA.debugLineNum = 768;BA.debugLine="RefreshSchedule";
_refreshschedule();
 //BA.debugLineNum = 769;BA.debugLine="End Sub";
return "";
}
public String  _deletecalendarevent(String _eventid) throws Exception{
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 711;BA.debugLine="Sub DeleteCalendarEvent(EventId As String)";
 //BA.debugLineNum = 712;BA.debugLine="Dim job As HttpJob";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 713;BA.debugLine="job.Initialize(\"DeleteEvent\", Me)";
_job._initialize /*String*/ (ba,"DeleteEvent",this);
 //BA.debugLineNum = 714;BA.debugLine="job.Delete(\"https://www.googleapis.com/calendar/v";
_job._delete /*String*/ ("https://www.googleapis.com/calendar/v3/calendars/primary/events/"+_eventid);
 //BA.debugLineNum = 715;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)._oauth2 /*Geek.God.CRM.App.googleoauth2*/ ._access_token /*String*/ );
 //BA.debugLineNum = 716;BA.debugLine="End Sub";
return "";
}
public String  _finalizecalendarevent(int _selectedhour,int _duration) throws Exception{
String _starttime = "";
String _endtime = "";
String _colorid = "";
String _description = "";
anywheresoftware.b4a.objects.collections.Map _eventmap = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 987;BA.debugLine="Private Sub FinalizeCalendarEvent(SelectedHour As";
 //BA.debugLineNum = 988;BA.debugLine="Dim StartTime As String = CreateRFC3339(SelectedD";
_starttime = _createrfc3339(_selecteddate,_selectedhour);
 //BA.debugLineNum = 989;BA.debugLine="Dim EndTime As String = CreateRFC3339(SelectedDat";
_endtime = _createrfc3339(_selecteddate,(int) (_selectedhour+_duration));
 //BA.debugLineNum = 990;BA.debugLine="Dim colorId As String = \"1\" : If SelectedUser = \"";
_colorid = "1";
 //BA.debugLineNum = 990;BA.debugLine="Dim colorId As String = \"1\" : If SelectedUser = \"";
if ((_selecteduser).equals("Erin")) { 
_colorid = "11";};
 //BA.debugLineNum = 992;BA.debugLine="Dim Description As String = \"Phone: \" & CurrentCl";
_description = "Phone: "+BA.ObjectToString(_currentclient.Get((Object)("Phone")))+__c.CRLF+"Issue: "+BA.ObjectToString(_currentclient.Get((Object)("Notes")))+__c.CRLF+"Address: "+BA.ObjectToString(_currentclient.Get((Object)("Address")));
 //BA.debugLineNum = 994;BA.debugLine="Dim eventMap As Map = CreateMap( _ 		\"summary\": C";
_eventmap = new anywheresoftware.b4a.objects.collections.Map();
_eventmap = __c.createMap(new Object[] {(Object)("summary"),(Object)(BA.ObjectToString(_currentclient.Get((Object)("Name")))+" - Service"),(Object)("location"),_currentclient.Get((Object)("Address")),(Object)("description"),(Object)(_description),(Object)("colorId"),(Object)(_colorid),(Object)("start"),(Object)(__c.createMap(new Object[] {(Object)("dateTime"),(Object)(_starttime),(Object)("timeZone"),(Object)("America/New_York")}).getObject()),(Object)("end"),(Object)(__c.createMap(new Object[] {(Object)("dateTime"),(Object)(_endtime),(Object)("timeZone"),(Object)("America/New_York")}).getObject())});
 //BA.debugLineNum = 1003;BA.debugLine="Dim json As JSONGenerator : json.Initialize(event";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 1003;BA.debugLine="Dim json As JSONGenerator : json.Initialize(event";
_json.Initialize(_eventmap);
 //BA.debugLineNum = 1004;BA.debugLine="Dim job As HttpJob";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 1005;BA.debugLine="job.Initialize(\"CreateCalendarEvent\", Me)";
_job._initialize /*String*/ (ba,"CreateCalendarEvent",this);
 //BA.debugLineNum = 1006;BA.debugLine="job.PostString(\"https://www.googleapis.com/calend";
_job._poststring /*String*/ ("https://www.googleapis.com/calendar/v3/calendars/primary/events",_json.ToString());
 //BA.debugLineNum = 1007;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 1008;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)._oauth2 /*Geek.God.CRM.App.googleoauth2*/ ._access_token /*String*/ );
 //BA.debugLineNum = 1009;BA.debugLine="PendingSlotHour = -1";
_pendingslothour = (int) (-1);
 //BA.debugLineNum = 1010;BA.debugLine="End Sub";
return "";
}
public String  _finishbookingaftercontactcreation(anywheresoftware.b4a.objects.collections.Map _updatedclientmap) throws Exception{
int _targetslot = 0;
int _dur = 0;
 //BA.debugLineNum = 980;BA.debugLine="Public Sub FinishBookingAfterContactCreation(Updat";
 //BA.debugLineNum = 981;BA.debugLine="CurrentClient = UpdatedClientMap";
_currentclient = _updatedclientmap;
 //BA.debugLineNum = 982;BA.debugLine="Dim targetSlot As Int = CurrentClient.Get(\"Target";
_targetslot = (int)(BA.ObjectToNumber(_currentclient.Get((Object)("TargetSlot"))));
 //BA.debugLineNum = 983;BA.debugLine="Dim dur As Int = CurrentClient.GetDefault(\"Durati";
_dur = (int)(BA.ObjectToNumber(_currentclient.GetDefault((Object)("Duration"),(Object)(1))));
 //BA.debugLineNum = 984;BA.debugLine="FinalizeCalendarEvent(targetSlot, dur)";
_finalizecalendarevent(_targetslot,_dur);
 //BA.debugLineNum = 985;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 45;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 46;BA.debugLine="SelectedDate = DateTime.Now";
_selecteddate = __c.DateTime.getNow();
 //BA.debugLineNum = 47;BA.debugLine="DateBarAnchor = DateTime.Now ' Initialize Anchor";
_datebaranchor = __c.DateTime.getNow();
 //BA.debugLineNum = 49;BA.debugLine="ExistingEvents.Initialize";
_existingevents.Initialize();
 //BA.debugLineNum = 50;BA.debugLine="CurrentClient.Initialize";
_currentclient.Initialize();
 //BA.debugLineNum = 51;BA.debugLine="CurrentClient.Put(\"Name\", \"\")";
_currentclient.Put((Object)("Name"),(Object)(""));
 //BA.debugLineNum = 52;BA.debugLine="CurrentClient.Put(\"Phone\", \"\")";
_currentclient.Put((Object)("Phone"),(Object)(""));
 //BA.debugLineNum = 53;BA.debugLine="CurrentClient.Put(\"Address\", \"\")";
_currentclient.Put((Object)("Address"),(Object)(""));
 //BA.debugLineNum = 54;BA.debugLine="CurrentClient.Put(\"Notes\", \"\")";
_currentclient.Put((Object)("Notes"),(Object)(""));
 //BA.debugLineNum = 56;BA.debugLine="AlarmTimer.Initialize(\"AlarmTimer\", 30000)";
_alarmtimer.Initialize(ba,"AlarmTimer",(long) (30000));
 //BA.debugLineNum = 57;BA.debugLine="AlarmTimer.Enabled = True";
_alarmtimer.setEnabled(__c.True);
 //BA.debugLineNum = 59;BA.debugLine="ResizeTimer.Initialize(\"ResizeTimer\", 400)";
_resizetimer.Initialize(ba,"ResizeTimer",(long) (400));
 //BA.debugLineNum = 60;BA.debugLine="ResizeTimer.Enabled = False";
_resizetimer.setEnabled(__c.False);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public boolean  _issameday(long _d1,long _d2) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Private Sub IsSameDay(d1 As Long, d2 As Long) As B";
 //BA.debugLineNum = 353;BA.debugLine="Return DateTime.Date(d1) = DateTime.Date(d2)";
if (true) return (__c.DateTime.Date(_d1)).equals(__c.DateTime.Date(_d2));
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return false;
}
public String  _jobdone(Geek.God.CRM.App.httpjob _job) throws Exception{
boolean _isscrape = false;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _rootmap = null;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _ev = null;
String _cid = "";
String _targetid = "";
anywheresoftware.b4a.objects.collections.Map _startmap = null;
anywheresoftware.b4a.objects.collections.Map _endmap = null;
String _dtstart = "";
String _dtend = "";
String _eid = "";
String _summary = "";
String _desc = "";
String _cphone = "";
String _cissue = "";
int _i = 0;
int _i2 = 0;
int _starthour = 0;
int _endhour = 0;
int _h = 0;
anywheresoftware.b4a.objects.collections.Map _evdata = null;
int _targetw = 0;
int _devicew = 0;
 //BA.debugLineNum = 576;BA.debugLine="Sub JobDone(Job As HttpJob)";
 //BA.debugLineNum = 577;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 578;BA.debugLine="If Job.JobName = \"DeleteEvent\" Then";
if ((_job._jobname /*String*/ ).equals("DeleteEvent")) { 
 //BA.debugLineNum = 579;BA.debugLine="xui.MsgboxAsync(\"Appointment Deleted\", \"Success";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Appointment Deleted"),BA.ObjectToCharSequence("Success"));
 //BA.debugLineNum = 580;BA.debugLine="RefreshSchedule";
_refreshschedule();
 //BA.debugLineNum = 581;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 582;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 585;BA.debugLine="If Job.JobName = \"CreateCalendarEvent\" Then";
if ((_job._jobname /*String*/ ).equals("CreateCalendarEvent")) { 
 //BA.debugLineNum = 586;BA.debugLine="Dim IsScrape As Boolean = False";
_isscrape = __c.False;
 //BA.debugLineNum = 587;BA.debugLine="If CurrentClient.ContainsKey(\"IsScrapeWorkflow\"";
if (_currentclient.ContainsKey((Object)("IsScrapeWorkflow"))) { 
 //BA.debugLineNum = 588;BA.debugLine="IsScrape = CurrentClient.Get(\"IsScrapeWorkflow";
_isscrape = BA.ObjectToBoolean(_currentclient.Get((Object)("IsScrapeWorkflow")));
 };
 //BA.debugLineNum = 591;BA.debugLine="If IsScrape Then";
if (_isscrape) { 
 //BA.debugLineNum = 593;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 594;BA.debugLine="CallSub(B4XPages.MainPage, \"ProcessNextScrapeI";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"ProcessNextScrapeItem");
 }else {
 //BA.debugLineNum = 597;BA.debugLine="xui.MsgboxAsync(\"Appointment Saved to Google C";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Appointment Saved to Google Calendar!"),BA.ObjectToCharSequence("Success"));
 //BA.debugLineNum = 598;BA.debugLine="RefreshSchedule";
_refreshschedule();
 //BA.debugLineNum = 599;BA.debugLine="CallSub(B4XPages.MainPage, \"RefreshDashboard\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"RefreshDashboard");
 };
 //BA.debugLineNum = 601;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 602;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 605;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 605;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Job";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 606;BA.debugLine="Dim RootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 607;BA.debugLine="If Job.JobName = \"FetchCalendar\" Then";
if ((_job._jobname /*String*/ ).equals("FetchCalendar")) { 
 //BA.debugLineNum = 608;BA.debugLine="Dim items As List = RootMap.Get(\"items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_rootmap.Get((Object)("items"))));
 //BA.debugLineNum = 609;BA.debugLine="ExistingEvents.Clear";
_existingevents.Clear();
 //BA.debugLineNum = 610;BA.debugLine="For Each ev As Map In items";
_ev = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group30 = _items;
final int groupLen30 = group30.getSize()
;int index30 = 0;
;
for (; index30 < groupLen30;index30++){
_ev = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group30.Get(index30)));
 //BA.debugLineNum = 611;BA.debugLine="Dim cId As String = ev.GetDefault(\"colorId\", \"";
_cid = BA.ObjectToString(_ev.GetDefault((Object)("colorId"),(Object)("1")));
 //BA.debugLineNum = 612;BA.debugLine="Dim targetId As String = \"1\"";
_targetid = "1";
 //BA.debugLineNum = 613;BA.debugLine="If SelectedUser = \"Erin\" Then targetId = \"11\"";
if ((_selecteduser).equals("Erin")) { 
_targetid = "11";};
 //BA.debugLineNum = 615;BA.debugLine="If cId = targetId Then";
if ((_cid).equals(_targetid)) { 
 //BA.debugLineNum = 616;BA.debugLine="Dim startMap As Map = ev.Get(\"start\")";
_startmap = new anywheresoftware.b4a.objects.collections.Map();
_startmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ev.Get((Object)("start"))));
 //BA.debugLineNum = 617;BA.debugLine="Dim endMap As Map = ev.Get(\"end\")";
_endmap = new anywheresoftware.b4a.objects.collections.Map();
_endmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ev.Get((Object)("end"))));
 //BA.debugLineNum = 618;BA.debugLine="Dim dtStart As String = startMap.GetDefault(\"";
_dtstart = BA.ObjectToString(_startmap.GetDefault((Object)("dateTime"),(Object)("")));
 //BA.debugLineNum = 619;BA.debugLine="Dim dtEnd As String = endMap.GetDefault(\"date";
_dtend = BA.ObjectToString(_endmap.GetDefault((Object)("dateTime"),(Object)("")));
 //BA.debugLineNum = 620;BA.debugLine="Dim eId As String = ev.Get(\"id\")";
_eid = BA.ObjectToString(_ev.Get((Object)("id")));
 //BA.debugLineNum = 622;BA.debugLine="Dim summary As String = ev.GetDefault(\"summar";
_summary = BA.ObjectToString(_ev.GetDefault((Object)("summary"),(Object)("Unknown")));
 //BA.debugLineNum = 623;BA.debugLine="If summary.Contains(\" - \") Then summary = sum";
if (_summary.contains(" - ")) { 
_summary = _summary.substring((int) (0),_summary.indexOf(" - "));};
 //BA.debugLineNum = 625;BA.debugLine="Dim desc As String = ev.GetDefault(\"descripti";
_desc = BA.ObjectToString(_ev.GetDefault((Object)("description"),(Object)("")));
 //BA.debugLineNum = 626;BA.debugLine="Dim cPhone As String = \"No Phone\" : Dim cIssu";
_cphone = "No Phone";
 //BA.debugLineNum = 626;BA.debugLine="Dim cPhone As String = \"No Phone\" : Dim cIssu";
_cissue = "No Issue";
 //BA.debugLineNum = 628;BA.debugLine="If desc.Contains(\"Phone: \") Then";
if (_desc.contains("Phone: ")) { 
 //BA.debugLineNum = 629;BA.debugLine="Dim i As Int = desc.IndexOf(\"Phone: \") + 7";
_i = (int) (_desc.indexOf("Phone: ")+7);
 //BA.debugLineNum = 630;BA.debugLine="Dim i2 As Int = desc.IndexOf2(Chr(10), i) :";
_i2 = _desc.indexOf(BA.ObjectToString(__c.Chr((int) (10))),_i);
 //BA.debugLineNum = 630;BA.debugLine="Dim i2 As Int = desc.IndexOf2(Chr(10), i) :";
if (_i2==-1) { 
_i2 = _desc.length();};
 //BA.debugLineNum = 631;BA.debugLine="cPhone = desc.SubString2(i, i2).Trim";
_cphone = _desc.substring(_i,_i2).trim();
 };
 //BA.debugLineNum = 633;BA.debugLine="If desc.Contains(\"Issue: \") Then";
if (_desc.contains("Issue: ")) { 
 //BA.debugLineNum = 634;BA.debugLine="Dim i As Int = desc.IndexOf(\"Issue: \") + 7";
_i = (int) (_desc.indexOf("Issue: ")+7);
 //BA.debugLineNum = 635;BA.debugLine="Dim i2 As Int = desc.IndexOf2(Chr(10), i) :";
_i2 = _desc.indexOf(BA.ObjectToString(__c.Chr((int) (10))),_i);
 //BA.debugLineNum = 635;BA.debugLine="Dim i2 As Int = desc.IndexOf2(Chr(10), i) :";
if (_i2==-1) { 
_i2 = _desc.length();};
 //BA.debugLineNum = 636;BA.debugLine="cIssue = desc.SubString2(i, i2).Trim";
_cissue = _desc.substring(_i,_i2).trim();
 }else {
 //BA.debugLineNum = 638;BA.debugLine="cIssue = desc";
_cissue = _desc;
 };
 //BA.debugLineNum = 641;BA.debugLine="If dtStart <> \"\" And dtEnd <> \"\" Then";
if ((_dtstart).equals("") == false && (_dtend).equals("") == false) { 
 //BA.debugLineNum = 642;BA.debugLine="Dim StartHour As Int = ParseIsoToLocalHour(d";
_starthour = _parseisotolocalhour(_dtstart);
 //BA.debugLineNum = 643;BA.debugLine="Dim EndHour As Int = ParseIsoToLocalHour(dtE";
_endhour = _parseisotolocalhour(_dtend);
 //BA.debugLineNum = 644;BA.debugLine="If StartHour > -1 And EndHour > -1 Then";
if (_starthour>-1 && _endhour>-1) { 
 //BA.debugLineNum = 645;BA.debugLine="For h = StartHour To EndHour - 1";
{
final int step63 = 1;
final int limit63 = (int) (_endhour-1);
_h = _starthour ;
for (;_h <= limit63 ;_h = _h + step63 ) {
 //BA.debugLineNum = 646;BA.debugLine="Dim EvData As Map = CreateMap(\"Name\": summ";
_evdata = new anywheresoftware.b4a.objects.collections.Map();
_evdata = __c.createMap(new Object[] {(Object)("Name"),(Object)(_summary),(Object)("Phone"),(Object)(_cphone),(Object)("Addr"),_ev.GetDefault((Object)("location"),(Object)("No Address")),(Object)("Issue"),(Object)(_cissue),(Object)("EventId"),(Object)(_eid)});
 //BA.debugLineNum = 647;BA.debugLine="If h = StartHour Then EvData.Put(\"IsPrimar";
if (_h==_starthour) { 
_evdata.Put((Object)("IsPrimary"),(Object)(__c.True));}
else {
_evdata.Put((Object)("IsPrimary"),(Object)(__c.False));};
 //BA.debugLineNum = 648;BA.debugLine="ExistingEvents.Put(h, EvData)";
_existingevents.Put((Object)(_h),(Object)(_evdata.getObject()));
 }
};
 };
 };
 };
 }
};
 //BA.debugLineNum = 656;BA.debugLine="Dim TargetW As Int = Root.Width";
_targetw = _root.getWidth();
 //BA.debugLineNum = 657;BA.debugLine="Dim DeviceW As Int = GetDeviceLayoutValues.Widt";
_devicew = __c.GetDeviceLayoutValues(ba).Width;
 //BA.debugLineNum = 658;BA.debugLine="If TargetW > DeviceW Or TargetW <= 0 Then Targe";
if (_targetw>_devicew || _targetw<=0) { 
_targetw = _devicew;};
 //BA.debugLineNum = 660;BA.debugLine="BuildTimeGrid(TargetW)";
_buildtimegrid(_targetw);
 };
 };
 //BA.debugLineNum = 663;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 664;BA.debugLine="End Sub";
return "";
}
public String  _lblbookedaddr_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _nativebtn = null;
String _caddr = "";
 //BA.debugLineNum = 691;BA.debugLine="Sub lblBookedAddr_Click";
 //BA.debugLineNum = 693;BA.debugLine="Dim NativeBtn As B4XView = Sender";
_nativebtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_nativebtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 694;BA.debugLine="Dim cAddr As String = NativeBtn.Tag";
_caddr = BA.ObjectToString(_nativebtn.getTag());
 //BA.debugLineNum = 695;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 697;BA.debugLine="CallSub2(B4XPages.MainPage, \"LaunchMaps\", cAddr)";
__c.CallSubNew2(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"LaunchMaps",(Object)(_caddr));
 //BA.debugLineNum = 698;BA.debugLine="End Sub";
return "";
}
public String  _lblbookedname_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _nativebtn = null;
String _cname = "";
 //BA.debugLineNum = 666;BA.debugLine="Sub lblBookedName_Click";
 //BA.debugLineNum = 668;BA.debugLine="Dim NativeBtn As B4XView = Sender";
_nativebtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_nativebtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 669;BA.debugLine="Dim cName As String = NativeBtn.Tag";
_cname = BA.ObjectToString(_nativebtn.getTag());
 //BA.debugLineNum = 670;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 672;BA.debugLine="B4XPages.ShowPage(\"SearchPage\")";
_b4xpages._showpage /*String*/ (ba,"SearchPage");
 //BA.debugLineNum = 673;BA.debugLine="CallSub2(B4XPages.MainPage, \"SearchContact\", cNam";
__c.CallSubNew2(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"SearchContact",(Object)(_cname));
 //BA.debugLineNum = 674;BA.debugLine="End Sub";
return "";
}
public void  _lblbookedphone_click() throws Exception{
ResumableSub_lblBookedPhone_Click rsub = new ResumableSub_lblBookedPhone_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_lblBookedPhone_Click extends BA.ResumableSub {
public ResumableSub_lblBookedPhone_Click(Geek.God.CRM.App.appointmentpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.appointmentpage parent;
anywheresoftware.b4a.objects.B4XViewWrapper _nativebtn = null;
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
 //BA.debugLineNum = 678;BA.debugLine="Dim NativeBtn As B4XView = Sender";
_nativebtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_nativebtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.Sender(ba)));
 //BA.debugLineNum = 679;BA.debugLine="Dim cPhone As String = NativeBtn.Tag";
_cphone = BA.ObjectToString(_nativebtn.getTag());
 //BA.debugLineNum = 680;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
parent.__c.CallSubNew(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 682;BA.debugLine="Msgbox2Async(\"Contact client?\", \"Contact\", \"Call\"";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Contact client?"),BA.ObjectToCharSequence("Contact"),"Call","Cancel","Text",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
 //BA.debugLineNum = 683;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 684;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 685;BA.debugLine="CallSub2(B4XPages.MainPage, \"DirectCall\", cPhone";
parent.__c.CallSubNew2(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"DirectCall",(Object)(_cphone));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 687;BA.debugLine="CallSub2(B4XPages.MainPage, \"LaunchSMS\", cPhone)";
parent.__c.CallSubNew2(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"LaunchSMS",(Object)(_cphone));
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 689;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _lbldelete_click() throws Exception{
ResumableSub_lblDelete_Click rsub = new ResumableSub_lblDelete_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_lblDelete_Click extends BA.ResumableSub {
public ResumableSub_lblDelete_Click(Geek.God.CRM.App.appointmentpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.appointmentpage parent;
anywheresoftware.b4a.objects.B4XViewWrapper _nativebtn = null;
String _eid = "";
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
 //BA.debugLineNum = 702;BA.debugLine="Dim NativeBtn As B4XView = Sender";
_nativebtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_nativebtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.Sender(ba)));
 //BA.debugLineNum = 703;BA.debugLine="Dim eId As String = NativeBtn.Tag";
_eid = BA.ObjectToString(_nativebtn.getTag());
 //BA.debugLineNum = 704;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
parent.__c.CallSubNew(ba,(Object)(parent._b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 706;BA.debugLine="Msgbox2Async(\"Delete appointment?\", \"Confirm\", \"Y";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Delete appointment?"),BA.ObjectToCharSequence("Confirm"),"Yes","Cancel","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
 //BA.debugLineNum = 707;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 708;BA.debugLine="If Result = DialogResponse.POSITIVE Then DeleteCa";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent._deletecalendarevent(_eid);
if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 709;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _loadclientforappt(anywheresoftware.b4a.objects.collections.Map _profile) throws Exception{
int _targetw = 0;
int _devicew = 0;
 //BA.debugLineNum = 530;BA.debugLine="Public Sub LoadClientForAppt(Profile As Map)";
 //BA.debugLineNum = 531;BA.debugLine="Log(\">>> [CRITICAL_DEBUG] LoadClientForAppt: \" &";
__c.LogImpl("03145729",">>> [CRITICAL_DEBUG] LoadClientForAppt: "+BA.ObjectToString(_profile.GetDefault((Object)("Name"),(Object)("Unknown"))),0);
 //BA.debugLineNum = 532;BA.debugLine="CurrentClient = Profile";
_currentclient = _profile;
 //BA.debugLineNum = 535;BA.debugLine="If Root.IsInitialized = False Then";
if (_root.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 536;BA.debugLine="Log(\">>> [AppointmentPage] Root not initialized.";
__c.LogImpl("03145734",">>> [AppointmentPage] Root not initialized. Data saved. UI will update on creation.",0);
 //BA.debugLineNum = 537;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 541;BA.debugLine="If lblClientName.IsInitialized Then lblClientName";
if (_lblclientname.IsInitialized()) { 
_lblclientname.setText(BA.ObjectToCharSequence(_profile.GetDefault((Object)("Name"),(Object)("New Client"))));};
 //BA.debugLineNum = 542;BA.debugLine="If lblClientPhone.IsInitialized Then lblClientPho";
if (_lblclientphone.IsInitialized()) { 
_lblclientphone.setText(BA.ObjectToCharSequence(_profile.GetDefault((Object)("Phone"),(Object)(""))));};
 //BA.debugLineNum = 543;BA.debugLine="If lblClientAddr.IsInitialized Then lblClientAddr";
if (_lblclientaddr.IsInitialized()) { 
_lblclientaddr.setText(BA.ObjectToCharSequence(_cleanaddress(BA.ObjectToString(_profile.GetDefault((Object)("Address"),(Object)(""))))));};
 //BA.debugLineNum = 546;BA.debugLine="SelectedDate = DateTime.Now";
_selecteddate = __c.DateTime.getNow();
 //BA.debugLineNum = 547;BA.debugLine="DateBarAnchor = DateTime.Now ' Reset anchor when";
_datebaranchor = __c.DateTime.getNow();
 //BA.debugLineNum = 550;BA.debugLine="Dim TargetW As Int = Root.Width";
_targetw = _root.getWidth();
 //BA.debugLineNum = 551;BA.debugLine="Dim DeviceW As Int = GetDeviceLayoutValues.Width";
_devicew = __c.GetDeviceLayoutValues(ba).Width;
 //BA.debugLineNum = 552;BA.debugLine="If TargetW > DeviceW Or TargetW <= 0 Then";
if (_targetw>_devicew || _targetw<=0) { 
 //BA.debugLineNum = 553;BA.debugLine="Log(\">>> [CRITICAL_DEBUG] Clamping Width: \" & Ta";
__c.LogImpl("03145751",">>> [CRITICAL_DEBUG] Clamping Width: "+BA.NumberToString(_targetw)+" -> "+BA.NumberToString(_devicew),0);
 //BA.debugLineNum = 554;BA.debugLine="TargetW = DeviceW";
_targetw = _devicew;
 };
 //BA.debugLineNum = 557;BA.debugLine="BuildDateBar(TargetW)";
_builddatebar(_targetw);
 //BA.debugLineNum = 558;BA.debugLine="RefreshSchedule";
_refreshschedule();
 //BA.debugLineNum = 559;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper  _loadsafefont(String _fontname) throws Exception{
String _basedir = "";
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 221;BA.debugLine="Private Sub LoadSafeFont(FontName As String) As Ty";
 //BA.debugLineNum = 222;BA.debugLine="Dim BaseDir As String = File.DirRootExternal & \"/";
_basedir = __c.File.getDirRootExternal()+"/Geek God CRM/Fonts";
 //BA.debugLineNum = 223;BA.debugLine="If File.Exists(BaseDir, FontName) Then";
if (__c.File.Exists(_basedir,_fontname)) { 
 //BA.debugLineNum = 224;BA.debugLine="Try";
try { //BA.debugLineNum = 225;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 226;BA.debugLine="jo.InitializeStatic(\"android.graphics.Typeface\"";
_jo.InitializeStatic("android.graphics.Typeface");
 //BA.debugLineNum = 227;BA.debugLine="Return jo.RunMethod(\"createFromFile\", Array(Fil";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(_jo.RunMethod("createFromFile",new Object[]{(Object)(__c.File.Combine(_basedir,_fontname))})));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 229;BA.debugLine="Log(\"Error loading external font: \" & FontName)";
__c.LogImpl("02621448","Error loading external font: "+_fontname,0);
 };
 };
 //BA.debugLineNum = 232;BA.debugLine="If File.Exists(File.DirAssets, FontName) Then";
if (__c.File.Exists(__c.File.getDirAssets(),_fontname)) { 
 //BA.debugLineNum = 233;BA.debugLine="Return Typeface.LoadFromAssets(FontName)";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.LoadFromAssets(_fontname)));
 };
 //BA.debugLineNum = 235;BA.debugLine="Return Typeface.DEFAULT_BOLD";
if (true) return (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT_BOLD));
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public String  _ondateselected(int _year,int _month,int _day) throws Exception{
int _targetw = 0;
int _devicew = 0;
 //BA.debugLineNum = 782;BA.debugLine="Sub OnDateSelected(year As Int, month As Int, day";
 //BA.debugLineNum = 783;BA.debugLine="SelectedDate = DateUtils.SetDate(year, month + 1,";
_selecteddate = _dateutils._setdate(ba,_year,(int) (_month+1),_day);
 //BA.debugLineNum = 786;BA.debugLine="DateBarAnchor = SelectedDate";
_datebaranchor = _selecteddate;
 //BA.debugLineNum = 788;BA.debugLine="Dim TargetW As Int = Root.Width";
_targetw = _root.getWidth();
 //BA.debugLineNum = 789;BA.debugLine="Dim DeviceW As Int = GetDeviceLayoutValues.Width";
_devicew = __c.GetDeviceLayoutValues(ba).Width;
 //BA.debugLineNum = 790;BA.debugLine="If TargetW > DeviceW Or TargetW <= 0 Then TargetW";
if (_targetw>_devicew || _targetw<=0) { 
_targetw = _devicew;};
 //BA.debugLineNum = 792;BA.debugLine="BuildDateBar(TargetW)";
_builddatebar(_targetw);
 //BA.debugLineNum = 793;BA.debugLine="RefreshSchedule";
_refreshschedule();
 //BA.debugLineNum = 794;BA.debugLine="End Sub";
return "";
}
public int  _parseisotolocalhour(String _iso) throws Exception{
int _hour = 0;
int _localh = 0;
 //BA.debugLineNum = 718;BA.debugLine="Private Sub ParseIsoToLocalHour(iso As String) As";
 //BA.debugLineNum = 719;BA.debugLine="Try";
try { //BA.debugLineNum = 720;BA.debugLine="If iso.EndsWith(\"Z\") Then";
if (_iso.endsWith("Z")) { 
 //BA.debugLineNum = 721;BA.debugLine="Dim hour As Int = iso.SubString2(11,13)";
_hour = (int)(Double.parseDouble(_iso.substring((int) (11),(int) (13))));
 //BA.debugLineNum = 722;BA.debugLine="Dim LocalH As Int = hour + DateTime.TimeZoneOff";
_localh = (int) (_hour+__c.DateTime.getTimeZoneOffset());
 //BA.debugLineNum = 723;BA.debugLine="If LocalH < 0 Then LocalH = LocalH + 24";
if (_localh<0) { 
_localh = (int) (_localh+24);};
 //BA.debugLineNum = 724;BA.debugLine="If LocalH > 23 Then LocalH = LocalH - 24";
if (_localh>23) { 
_localh = (int) (_localh-24);};
 //BA.debugLineNum = 725;BA.debugLine="Return LocalH";
if (true) return _localh;
 }else {
 //BA.debugLineNum = 727;BA.debugLine="Return iso.SubString2(11,13)";
if (true) return (int)(Double.parseDouble(_iso.substring((int) (11),(int) (13))));
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 730;BA.debugLine="Return -1";
if (true) return (int) (-1);
 };
 //BA.debugLineNum = 732;BA.debugLine="End Sub";
return 0;
}
public void  _promptfordetailsandbook() throws Exception{
ResumableSub_PromptForDetailsAndBook rsub = new ResumableSub_PromptForDetailsAndBook(this);
rsub.resume(ba, null);
}
public static class ResumableSub_PromptForDetailsAndBook extends BA.ResumableSub {
public ResumableSub_PromptForDetailsAndBook(Geek.God.CRM.App.appointmentpage parent) {
this.parent = parent;
}
Geek.God.CRM.App.appointmentpage parent;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lbld = null;
anywheresoftware.b4a.objects.SpinnerWrapper _spndur = null;
anywheresoftware.b4a.objects.LabelWrapper _lbli = null;
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
String _prefilledissue = "";
int _result = 0;
int _dur = 0;
String _issue = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 914;BA.debugLine="Log(\">>> [APP_DEBUG] PromptForDetailsAndBook: Ope";
parent.__c.LogImpl("04259841",">>> [APP_DEBUG] PromptForDetailsAndBook: Opening Dialog...",0);
 //BA.debugLineNum = 915;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 916;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 300dip, 250dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent.__c.DipToCurrent((int) (300)),parent.__c.DipToCurrent((int) (250)));
 //BA.debugLineNum = 917;BA.debugLine="p.Color = xui.Color_White";
_p.setColor(parent._xui.Color_White);
 //BA.debugLineNum = 919;BA.debugLine="Dim lblD As Label : lblD.Initialize(\"\") : lblD.Te";
_lbld = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 919;BA.debugLine="Dim lblD As Label : lblD.Initialize(\"\") : lblD.Te";
_lbld.Initialize(ba,"");
 //BA.debugLineNum = 919;BA.debugLine="Dim lblD As Label : lblD.Initialize(\"\") : lblD.Te";
_lbld.setText(BA.ObjectToCharSequence("Duration (Hours):"));
 //BA.debugLineNum = 920;BA.debugLine="lblD.TextColor = xui.Color_Black : lblD.TextSize";
_lbld.setTextColor(parent._xui.Color_Black);
 //BA.debugLineNum = 920;BA.debugLine="lblD.TextColor = xui.Color_Black : lblD.TextSize";
_lbld.setTextSize((float) (14));
 //BA.debugLineNum = 921;BA.debugLine="p.AddView(lblD, 10dip, 10dip, 280dip, 30dip)";
_p.AddView((android.view.View)(_lbld.getObject()),parent.__c.DipToCurrent((int) (10)),parent.__c.DipToCurrent((int) (10)),parent.__c.DipToCurrent((int) (280)),parent.__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 923;BA.debugLine="Dim spnDur As Spinner : spnDur.Initialize(\"\")";
_spndur = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 923;BA.debugLine="Dim spnDur As Spinner : spnDur.Initialize(\"\")";
_spndur.Initialize(ba,"");
 //BA.debugLineNum = 924;BA.debugLine="spnDur.AddAll(Array As String(\"1 Hr\", \"2 Hrs\", \"3";
_spndur.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"1 Hr","2 Hrs","3 Hrs","4 Hrs","5 Hrs","6 Hrs"}));
 //BA.debugLineNum = 925;BA.debugLine="p.AddView(spnDur, 10dip, 45dip, 280dip, 50dip)";
_p.AddView((android.view.View)(_spndur.getObject()),parent.__c.DipToCurrent((int) (10)),parent.__c.DipToCurrent((int) (45)),parent.__c.DipToCurrent((int) (280)),parent.__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 927;BA.debugLine="Dim lblI As Label : lblI.Initialize(\"\") : lblI.Te";
_lbli = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 927;BA.debugLine="Dim lblI As Label : lblI.Initialize(\"\") : lblI.Te";
_lbli.Initialize(ba,"");
 //BA.debugLineNum = 927;BA.debugLine="Dim lblI As Label : lblI.Initialize(\"\") : lblI.Te";
_lbli.setText(BA.ObjectToCharSequence("Reason for Visit / Issue:"));
 //BA.debugLineNum = 928;BA.debugLine="lblI.TextColor = xui.Color_Black : lblI.TextSize";
_lbli.setTextColor(parent._xui.Color_Black);
 //BA.debugLineNum = 928;BA.debugLine="lblI.TextColor = xui.Color_Black : lblI.TextSize";
_lbli.setTextSize((float) (14));
 //BA.debugLineNum = 929;BA.debugLine="p.AddView(lblI, 10dip, 105dip, 280dip, 30dip)";
_p.AddView((android.view.View)(_lbli.getObject()),parent.__c.DipToCurrent((int) (10)),parent.__c.DipToCurrent((int) (105)),parent.__c.DipToCurrent((int) (280)),parent.__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 931;BA.debugLine="Dim et As EditText : et.Initialize(\"\")";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 931;BA.debugLine="Dim et As EditText : et.Initialize(\"\")";
_et.Initialize(ba,"");
 //BA.debugLineNum = 932;BA.debugLine="et.Hint = \"e.g. Printer broken\" : et.TextColor =";
_et.setHint("e.g. Printer broken");
 //BA.debugLineNum = 932;BA.debugLine="et.Hint = \"e.g. Printer broken\" : et.TextColor =";
_et.setTextColor(parent._xui.Color_Black);
 //BA.debugLineNum = 932;BA.debugLine="et.Hint = \"e.g. Printer broken\" : et.TextColor =";
_et.setTextSize((float) (14));
 //BA.debugLineNum = 935;BA.debugLine="Dim PreFilledIssue As String = CurrentClient.GetD";
_prefilledissue = BA.ObjectToString(parent._currentclient.GetDefault((Object)("Issue"),(Object)("")));
 //BA.debugLineNum = 936;BA.debugLine="If PreFilledIssue <> \"\" Then et.Text = PreFilledI";
if (true) break;

case 1:
//if
this.state = 6;
if ((_prefilledissue).equals("") == false) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_et.setText(BA.ObjectToCharSequence(_prefilledissue));
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 938;BA.debugLine="txtIssue = et";
parent._txtissue = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_et.getObject()));
 //BA.debugLineNum = 939;BA.debugLine="p.AddView(txtIssue, 10dip, 140dip, 280dip, 50dip)";
_p.AddView((android.view.View)(parent._txtissue.getObject()),parent.__c.DipToCurrent((int) (10)),parent.__c.DipToCurrent((int) (140)),parent.__c.DipToCurrent((int) (280)),parent.__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 941;BA.debugLine="Wait For (Dialog.ShowCustom(p, \"BOOK IT\", \"\", \"CA";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_p,(Object)("BOOK IT"),(Object)(""),(Object)("CANCEL")));
this.state = 25;
return;
case 25:
//C
this.state = 7;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 943;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 7:
//if
this.state = 24;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 9;
}else {
this.state = 23;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 944;BA.debugLine="Dim Dur As Int = spnDur.SelectedIndex + 1";
_dur = (int) (_spndur.getSelectedIndex()+1);
 //BA.debugLineNum = 945;BA.debugLine="Dim Issue As String = txtIssue.Text.Trim";
_issue = parent._txtissue.getText().trim();
 //BA.debugLineNum = 946;BA.debugLine="If Issue = \"\" Then Issue = \"General Service\"";
if (true) break;

case 10:
//if
this.state = 15;
if ((_issue).equals("")) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
_issue = "General Service";
if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 948;BA.debugLine="CurrentClient.Put(\"Notes\", Issue)";
parent._currentclient.Put((Object)("Notes"),(Object)(_issue));
 //BA.debugLineNum = 949;BA.debugLine="CurrentClient.Put(\"Duration\", Dur)";
parent._currentclient.Put((Object)("Duration"),(Object)(_dur));
 //BA.debugLineNum = 951;BA.debugLine="If CheckAvailability(PendingSlotHour, Dur) Then";
if (true) break;

case 16:
//if
this.state = 21;
if (parent._checkavailability(parent._pendingslothour,_dur)) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 //BA.debugLineNum = 952;BA.debugLine="BookSlot(PendingSlotHour, Dur)";
parent._bookslot(parent._pendingslothour,_dur);
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 954;BA.debugLine="xui.MsgboxAsync(\"Cannot book! Slots overlap wit";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Cannot book! Slots overlap with an existing appointment."),BA.ObjectToCharSequence("Time Conflict"));
 //BA.debugLineNum = 955;BA.debugLine="PendingSlotHour = -1";
parent._pendingslothour = (int) (-1);
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 958;BA.debugLine="PendingSlotHour = -1";
parent._pendingslothour = (int) (-1);
 if (true) break;

case 24:
//C
this.state = -1;
;
 //BA.debugLineNum = 960;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public String  _redrawui(int _currentw) throws Exception{
int _hardwarew = 0;
 //BA.debugLineNum = 242;BA.debugLine="Public Sub RedrawUI(CurrentW As Int)";
 //BA.debugLineNum = 243;BA.debugLine="If Root.IsInitialized = False Then Return";
if (_root.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 246;BA.debugLine="Dim HardwareW As Int = GetDeviceLayoutValues.Widt";
_hardwarew = __c.GetDeviceLayoutValues(ba).Width;
 //BA.debugLineNum = 247;BA.debugLine="If CurrentW > HardwareW Then CurrentW = HardwareW";
if (_currentw>_hardwarew) { 
_currentw = _hardwarew;};
 //BA.debugLineNum = 250;BA.debugLine="If CurrentW > 1300 Then";
if (_currentw>1300) { 
 //BA.debugLineNum = 251;BA.debugLine="Log(\">>> [AppointmentPage] RedrawUI: Mike Open B";
__c.LogImpl("02686985",">>> [AppointmentPage] RedrawUI: Mike Open Big / Unfolded ("+BA.NumberToString(_currentw)+")",0);
 }else if(_currentw>850) { 
 //BA.debugLineNum = 253;BA.debugLine="Log(\">>> [AppointmentPage] RedrawUI: Mike Closed";
__c.LogImpl("02686987",">>> [AppointmentPage] RedrawUI: Mike Closed Small / Tall Phone ("+BA.NumberToString(_currentw)+")",0);
 }else {
 //BA.debugLineNum = 255;BA.debugLine="Log(\">>> [AppointmentPage] RedrawUI: Erin's Phon";
__c.LogImpl("02686989",">>> [AppointmentPage] RedrawUI: Erin's Phone ("+BA.NumberToString(_currentw)+")",0);
 };
 //BA.debugLineNum = 259;BA.debugLine="B4XPage_Resize(CurrentW, Root.Height)";
_b4xpage_resize(_currentw,_root.getHeight());
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public String  _refreshschedule() throws Exception{
long _startticks = 0L;
String _timemin = "";
String _timemax = "";
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 561;BA.debugLine="Public Sub RefreshSchedule";
 //BA.debugLineNum = 562;BA.debugLine="If B4XPages.MainPage.OAuth2.access_token = \"\" The";
if ((_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)._oauth2 /*Geek.God.CRM.App.googleoauth2*/ ._access_token /*String*/ ).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 565;BA.debugLine="Dim StartTicks As Long = DateUtils.SetDate(DateTi";
_startticks = _dateutils._setdate(ba,__c.DateTime.GetYear(_selecteddate),__c.DateTime.GetMonth(_selecteddate),__c.DateTime.GetDayOfMonth(_selecteddate));
 //BA.debugLineNum = 568;BA.debugLine="Dim TimeMin As String = CreateRFC3339(StartTicks,";
_timemin = _createrfc3339(_startticks,(int) (0));
 //BA.debugLineNum = 569;BA.debugLine="Dim TimeMax As String = CreateRFC3339(StartTicks,";
_timemax = _createrfc3339(_startticks,(int) (23));
 //BA.debugLineNum = 571;BA.debugLine="Dim job As HttpJob : job.Initialize(\"FetchCalenda";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 571;BA.debugLine="Dim job As HttpJob : job.Initialize(\"FetchCalenda";
_job._initialize /*String*/ (ba,"FetchCalendar",this);
 //BA.debugLineNum = 572;BA.debugLine="job.Download(\"https://www.googleapis.com/calendar";
_job._download /*String*/ ("https://www.googleapis.com/calendar/v3/calendars/primary/events?timeMin="+_timemin.replace("+","%2B")+"&timeMax="+_timemax.replace("+","%2B")+"&singleEvents=true");
 //BA.debugLineNum = 573;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)._oauth2 /*Geek.God.CRM.App.googleoauth2*/ ._access_token /*String*/ );
 //BA.debugLineNum = 574;BA.debugLine="End Sub";
return "";
}
public String  _resizetimer_tick() throws Exception{
int _screenw = 0;
int _screenh = 0;
 //BA.debugLineNum = 63;BA.debugLine="Private Sub ResizeTimer_Tick";
 //BA.debugLineNum = 64;BA.debugLine="If IsPageReady = False Then Return";
if (_ispageready==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 65;BA.debugLine="If Root.IsInitialized = False Then Return";
if (_root.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 67;BA.debugLine="Dim ScreenW As Int = GetDeviceLayoutValues.Width";
_screenw = __c.GetDeviceLayoutValues(ba).Width;
 //BA.debugLineNum = 68;BA.debugLine="Dim ScreenH As Int = GetDeviceLayoutValues.Height";
_screenh = __c.GetDeviceLayoutValues(ba).Height;
 //BA.debugLineNum = 70;BA.debugLine="If Abs(ScreenW - LastWidth) > 20 Then";
if (__c.Abs(_screenw-_lastwidth)>20) { 
 //BA.debugLineNum = 71;BA.debugLine="B4XPage_Resize(ScreenW, ScreenH)";
_b4xpage_resize(_screenw,_screenh);
 };
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _setclient(anywheresoftware.b4a.objects.collections.Map _profile) throws Exception{
 //BA.debugLineNum = 525;BA.debugLine="Public Sub SetClient(Profile As Map)";
 //BA.debugLineNum = 526;BA.debugLine="Log(\">>> [AppointmentPage] SetClient Received: \"";
__c.LogImpl("03080193",">>> [AppointmentPage] SetClient Received: "+BA.ObjectToString(_profile.GetDefault((Object)("Name"),(Object)("Unknown"))),0);
 //BA.debugLineNum = 527;BA.debugLine="LoadClientForAppt(Profile)";
_loadclientforappt(_profile);
 //BA.debugLineNum = 528;BA.debugLine="End Sub";
return "";
}
public String  _spnuserfilter_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 796;BA.debugLine="Sub spnUserFilter_ItemClick (Index As Int, Value A";
 //BA.debugLineNum = 797;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 798;BA.debugLine="If Index = 0 Then SelectedUser = \"Mike\" Else Sele";
if (_index==0) { 
_selecteduser = "Mike";}
else {
_selecteduser = "Erin";};
 //BA.debugLineNum = 799;BA.debugLine="RefreshSchedule";
_refreshschedule();
 //BA.debugLineNum = 800;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
if (BA.fastSubCompare(sub, "JOBDONE"))
	return _jobdone((Geek.God.CRM.App.httpjob) args[0]);
if (BA.fastSubCompare(sub, "LOADCLIENTFORAPPT"))
	return _loadclientforappt((anywheresoftware.b4a.objects.collections.Map) args[0]);
if (BA.fastSubCompare(sub, "ONDATESELECTED"))
	return _ondateselected(((Number)args[0]).intValue(), ((Number)args[1]).intValue(), ((Number)args[2]).intValue());
if (BA.fastSubCompare(sub, "REDRAWUI"))
	return _redrawui(((Number)args[0]).intValue());
if (BA.fastSubCompare(sub, "REFRESHSCHEDULE"))
	return _refreshschedule();
if (BA.fastSubCompare(sub, "SETCLIENT"))
	return _setclient((anywheresoftware.b4a.objects.collections.Map) args[0]);
return BA.SubDelegator.SubNotFound;
}
public void showDatePicker() {
    final Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH);
    int day = c.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog datePickerDialog = new DatePickerDialog(ba.context,
            new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    ba.raiseEventFromUI(null, "ondateselected", year, monthOfYear, dayOfMonth);
       
         }
            }, year, month, day);
    datePickerDialog.show();
}
}
