package Geek.God.CRM.App;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import java.util.Calendar;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class viewschedulepage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "Geek.God.CRM.App.viewschedulepage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", Geek.God.CRM.App.viewschedulepage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlheader = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmonthyear = null;
public anywheresoftware.b4a.objects.LabelWrapper _btncalendar = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spnuserfilter = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlgrid = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _slotcontainer = null;
public long _selecteddate = 0L;
public String _selecteduser = "";
public anywheresoftware.b4a.objects.collections.Map _existingevents = null;
public boolean _ispageready = false;
public int _lastwidth = 0;
public b4a.example.dateutils _dateutils = null;
public Geek.God.CRM.App.main _main = null;
public Geek.God.CRM.App.starter _starter = null;
public Geek.God.CRM.App.b4xpages _b4xpages = null;
public Geek.God.CRM.App.b4xcollections _b4xcollections = null;
public Geek.God.CRM.App.httputils2service _httputils2service = null;
public Geek.God.CRM.App.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 111;BA.debugLine="Try";
try { //BA.debugLineNum = 112;BA.debugLine="Log(\">>> [ViewSchedule] Appear Triggered\")";
__c.LogImpl("04849666",">>> [ViewSchedule] Appear Triggered",0);
 //BA.debugLineNum = 114;BA.debugLine="CallSubDelayed(Me, \"BuildUI\")";
__c.CallSubDelayed(ba,this,"BuildUI");
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 116;BA.debugLine="Log(\"Error in Appear: \" & LastException)";
__c.LogImpl("04849670","Error in Appear: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
int _headerheight = 0;
anywheresoftware.b4a.objects.LabelWrapper _btnhome = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xhome = null;
anywheresoftware.b4a.objects.LabelWrapper _btncal = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xcal = null;
int _gridtop = 0;
int _listtop = 0;
 //BA.debugLineNum = 48;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 49;BA.debugLine="Log(\">>> [ViewSchedule] Created Started\")";
__c.LogImpl("04784129",">>> [ViewSchedule] Created Started",0);
 //BA.debugLineNum = 50;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 51;BA.debugLine="Root.Color = xui.Color_White";
_root.setColor(_xui.Color_White);
 //BA.debugLineNum = 54;BA.debugLine="Dim HeaderHeight As Int = 60dip";
_headerheight = __c.DipToCurrent((int) (60));
 //BA.debugLineNum = 55;BA.debugLine="PnlHeader = xui.CreatePanel(\"\")";
_pnlheader = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 56;BA.debugLine="PnlHeader.Color = 0xFFEEEEEE";
_pnlheader.setColor(((int)0xffeeeeee));
 //BA.debugLineNum = 57;BA.debugLine="Root.AddView(PnlHeader, 0, 0, Root.Width, HeaderH";
_root.AddView((android.view.View)(_pnlheader.getObject()),(int) (0),(int) (0),_root.getWidth(),_headerheight);
 //BA.debugLineNum = 60;BA.debugLine="Dim btnHome As Label : btnHome.Initialize(\"btnHom";
_btnhome = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Dim btnHome As Label : btnHome.Initialize(\"btnHom";
_btnhome.Initialize(ba,"btnHome");
 //BA.debugLineNum = 61;BA.debugLine="Dim xHome As B4XView = btnHome";
_xhome = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xhome = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btnhome.getObject()));
 //BA.debugLineNum = 62;BA.debugLine="xHome.Text = Chr(0xF015)";
_xhome.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf015))));
 //BA.debugLineNum = 63;BA.debugLine="btnHome.Typeface = Typeface.FONTAWESOME";
_btnhome.setTypeface(__c.Typeface.getFONTAWESOME());
 //BA.debugLineNum = 64;BA.debugLine="xHome.TextSize = 24";
_xhome.setTextSize((float) (24));
 //BA.debugLineNum = 65;BA.debugLine="xHome.TextColor = xui.Color_Black";
_xhome.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 66;BA.debugLine="xHome.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xhome.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 67;BA.debugLine="PnlHeader.AddView(xHome, 5dip, 0, 50dip, HeaderHe";
_pnlheader.AddView((android.view.View)(_xhome.getObject()),__c.DipToCurrent((int) (5)),(int) (0),__c.DipToCurrent((int) (50)),_headerheight);
 //BA.debugLineNum = 70;BA.debugLine="spnUserFilter.Initialize(\"spnUserFilter\")";
_spnuserfilter.Initialize(ba,"spnUserFilter");
 //BA.debugLineNum = 71;BA.debugLine="spnUserFilter.AddAll(Array As String(\"God (Mike)\"";
_spnuserfilter.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"God (Mike)","Goddess (Erin)"}));
 //BA.debugLineNum = 72;BA.debugLine="PnlHeader.AddView(spnUserFilter, 60dip, 7dip, 180";
_pnlheader.AddView((android.view.View)(_spnuserfilter.getObject()),__c.DipToCurrent((int) (60)),__c.DipToCurrent((int) (7)),__c.DipToCurrent((int) (180)),__c.DipToCurrent((int) (45)));
 //BA.debugLineNum = 75;BA.debugLine="lblMonthYear.Initialize(\"\")";
_lblmonthyear.Initialize(ba,"");
 //BA.debugLineNum = 76;BA.debugLine="lblMonthYear.TextSize = 22";
_lblmonthyear.setTextSize((float) (22));
 //BA.debugLineNum = 77;BA.debugLine="lblMonthYear.Typeface = Typeface.DEFAULT_BOLD";
_lblmonthyear.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 78;BA.debugLine="lblMonthYear.TextColor = xui.Color_Black";
_lblmonthyear.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 79;BA.debugLine="lblMonthYear.Gravity = Gravity.CENTER_VERTICAL +";
_lblmonthyear.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.RIGHT));
 //BA.debugLineNum = 80;BA.debugLine="PnlHeader.AddView(lblMonthYear, 215dip, 0, Root.W";
_pnlheader.AddView((android.view.View)(_lblmonthyear.getObject()),__c.DipToCurrent((int) (215)),(int) (0),(int) (_root.getWidth()-__c.DipToCurrent((int) (270))),_headerheight);
 //BA.debugLineNum = 83;BA.debugLine="Dim btnCal As Label : btnCal.Initialize(\"btnCalen";
_btncal = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 83;BA.debugLine="Dim btnCal As Label : btnCal.Initialize(\"btnCalen";
_btncal.Initialize(ba,"btnCalendar");
 //BA.debugLineNum = 84;BA.debugLine="btnCalendar = btnCal";
_btncalendar = _btncal;
 //BA.debugLineNum = 85;BA.debugLine="Dim xCal As B4XView = btnCal";
_xcal = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xcal = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btncal.getObject()));
 //BA.debugLineNum = 86;BA.debugLine="xCal.Text = Chr(0xF073)";
_xcal.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf073))));
 //BA.debugLineNum = 87;BA.debugLine="btnCalendar.Typeface = Typeface.FONTAWESOME";
_btncalendar.setTypeface(__c.Typeface.getFONTAWESOME());
 //BA.debugLineNum = 88;BA.debugLine="xCal.TextSize = 26";
_xcal.setTextSize((float) (26));
 //BA.debugLineNum = 89;BA.debugLine="xCal.TextColor = xui.Color_Blue";
_xcal.setTextColor(_xui.Color_Blue);
 //BA.debugLineNum = 90;BA.debugLine="xCal.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xcal.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 91;BA.debugLine="PnlHeader.AddView(xCal, Root.Width - 55dip, 0, 50";
_pnlheader.AddView((android.view.View)(_xcal.getObject()),(int) (_root.getWidth()-__c.DipToCurrent((int) (55))),(int) (0),__c.DipToCurrent((int) (50)),_headerheight);
 //BA.debugLineNum = 94;BA.debugLine="Dim GridTop As Int = HeaderHeight + 5dip";
_gridtop = (int) (_headerheight+__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 95;BA.debugLine="PnlGrid = xui.CreatePanel(\"\")";
_pnlgrid = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 96;BA.debugLine="Root.AddView(PnlGrid, 0, GridTop, Root.Width, 220";
_root.AddView((android.view.View)(_pnlgrid.getObject()),(int) (0),_gridtop,_root.getWidth(),__c.DipToCurrent((int) (220)));
 //BA.debugLineNum = 99;BA.debugLine="Dim ListTop As Int = GridTop + 225dip";
_listtop = (int) (_gridtop+__c.DipToCurrent((int) (225)));
 //BA.debugLineNum = 100;BA.debugLine="SlotContainer.Initialize(1000dip)";
_slotcontainer.Initialize(ba,__c.DipToCurrent((int) (1000)));
 //BA.debugLineNum = 101;BA.debugLine="Root.AddView(SlotContainer, 0, ListTop, Root.Widt";
_root.AddView((android.view.View)(_slotcontainer.getObject()),(int) (0),_listtop,_root.getWidth(),(int) (_root.getHeight()-_listtop));
 //BA.debugLineNum = 103;BA.debugLine="Log(\">>> [ViewSchedule] Created Finished.\")";
__c.LogImpl("04784183",">>> [ViewSchedule] Created Finished.",0);
 //BA.debugLineNum = 107;BA.debugLine="CallSubDelayed(Me, \"BuildUI\")";
__c.CallSubDelayed(ba,this,"BuildUI");
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_disappear() throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Private Sub B4XPage_Disappear";
 //BA.debugLineNum = 192;BA.debugLine="Log(\">>> [ViewSchedule] Disappear\")";
__c.LogImpl("05046273",">>> [ViewSchedule] Disappear",0);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(int _width,int _height) throws Exception{
int _headerheight = 0;
int _gridtop = 0;
int _listtop = 0;
 //BA.debugLineNum = 157;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
 //BA.debugLineNum = 158;BA.debugLine="Log(\">>> [ViewSchedule] Resize Event: \" & Width)";
__c.LogImpl("04980737",">>> [ViewSchedule] Resize Event: "+BA.NumberToString(_width),0);
 //BA.debugLineNum = 161;BA.debugLine="If IsPageReady = False And Width > 0 Then";
if (_ispageready==__c.False && _width>0) { 
 //BA.debugLineNum = 162;BA.debugLine="Log(\">>> [ViewSchedule] Force Building UI from R";
__c.LogImpl("04980741",">>> [ViewSchedule] Force Building UI from Resize...",0);
 //BA.debugLineNum = 163;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 164;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 167;BA.debugLine="If IsPageReady = False Then Return";
if (_ispageready==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 168;BA.debugLine="If Abs(Width - LastWidth) < 20dip Then Return";
if (__c.Abs(_width-_lastwidth)<__c.DipToCurrent((int) (20))) { 
if (true) return "";};
 //BA.debugLineNum = 170;BA.debugLine="Log(\">>> [ViewSchedule] Resize Logic: \" & Width)";
__c.LogImpl("04980749",">>> [ViewSchedule] Resize Logic: "+BA.NumberToString(_width),0);
 //BA.debugLineNum = 171;BA.debugLine="LastWidth = Width";
_lastwidth = _width;
 //BA.debugLineNum = 173;BA.debugLine="Dim HeaderHeight As Int = 60dip";
_headerheight = __c.DipToCurrent((int) (60));
 //BA.debugLineNum = 174;BA.debugLine="PnlHeader.Width = Width";
_pnlheader.setWidth(_width);
 //BA.debugLineNum = 175;BA.debugLine="PnlHeader.GetView(3).Left = Width - 55dip";
_pnlheader.GetView((int) (3)).setLeft((int) (_width-__c.DipToCurrent((int) (55))));
 //BA.debugLineNum = 176;BA.debugLine="PnlHeader.GetView(2).Width = Width - 270dip";
_pnlheader.GetView((int) (2)).setWidth((int) (_width-__c.DipToCurrent((int) (270))));
 //BA.debugLineNum = 178;BA.debugLine="Dim GridTop As Int = HeaderHeight + 5dip";
_gridtop = (int) (_headerheight+__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 179;BA.debugLine="PnlGrid.Width = Width";
_pnlgrid.setWidth(_width);
 //BA.debugLineNum = 181;BA.debugLine="Dim ListTop As Int = GridTop + 225dip";
_listtop = (int) (_gridtop+__c.DipToCurrent((int) (225)));
 //BA.debugLineNum = 182;BA.debugLine="SlotContainer.Left = 0";
_slotcontainer.setLeft((int) (0));
 //BA.debugLineNum = 183;BA.debugLine="SlotContainer.Top = ListTop";
_slotcontainer.setTop(_listtop);
 //BA.debugLineNum = 184;BA.debugLine="SlotContainer.Width = Width";
_slotcontainer.setWidth(_width);
 //BA.debugLineNum = 185;BA.debugLine="SlotContainer.Height = Height - ListTop";
_slotcontainer.setHeight((int) (_height-_listtop));
 //BA.debugLineNum = 187;BA.debugLine="BuildGrid";
_buildgrid();
 //BA.debugLineNum = 188;BA.debugLine="BuildTimeList";
_buildtimelist();
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public String  _btncalendar_click() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 219;BA.debugLine="Sub btnCalendar_Click";
 //BA.debugLineNum = 220;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 221;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 222;BA.debugLine="jo.RunMethod(\"showDatePicker\", Null)";
_jo.RunMethod("showDatePicker",(Object[])(__c.Null));
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public String  _btngridday_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _nativebtn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
 //BA.debugLineNum = 282;BA.debugLine="Sub btnGridDay_Click";
 //BA.debugLineNum = 285;BA.debugLine="Dim NativeBtn As Button = Sender";
_nativebtn = new anywheresoftware.b4a.objects.ButtonWrapper();
_nativebtn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 286;BA.debugLine="Dim btn As B4XView = NativeBtn";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_nativebtn.getObject()));
 //BA.debugLineNum = 288;BA.debugLine="Try";
try { //BA.debugLineNum = 289;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 291;BA.debugLine="Log(\">>> [ViewSchedule] Date Clicked. Tag: \" & b";
__c.LogImpl("05505033",">>> [ViewSchedule] Date Clicked. Tag: "+BA.ObjectToString(_btn.getTag()),0);
 //BA.debugLineNum = 292;BA.debugLine="SelectedDate = btn.Tag";
_selecteddate = BA.ObjectToLongNumber(_btn.getTag());
 //BA.debugLineNum = 293;BA.debugLine="UpdateMonthDisplay";
_updatemonthdisplay();
 //BA.debugLineNum = 294;BA.debugLine="BuildGrid";
_buildgrid();
 //BA.debugLineNum = 295;BA.debugLine="RefreshSchedule";
_refreshschedule();
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 297;BA.debugLine="Log(\"!!! Error in btnGridDay_Click: \" & LastExce";
__c.LogImpl("05505039","!!! Error in btnGridDay_Click: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public String  _btnhome_click() throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub btnHome_Click";
 //BA.debugLineNum = 209;BA.debugLine="CallSub(B4XPages.MainPage, \"PlayRandomSound\")";
__c.CallSubNew(ba,(Object)(_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)),"PlayRandomSound");
 //BA.debugLineNum = 210;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return "";
}
public String  _buildgrid() throws Exception{
int _year = 0;
int _month = 0;
int _daysinmonth = 0;
int _btnw = 0;
int _btnh = 0;
int _day = 0;
int _row = 0;
int _col = 0;
long _d = 0L;
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbtn = null;
String _dayname = "";
 //BA.debugLineNum = 240;BA.debugLine="Private Sub BuildGrid";
 //BA.debugLineNum = 241;BA.debugLine="Log(\">>> [ViewSchedule] Building Grid... Width=\"";
__c.LogImpl("05439489",">>> [ViewSchedule] Building Grid... Width="+BA.NumberToString(_root.getWidth()),0);
 //BA.debugLineNum = 242;BA.debugLine="PnlGrid.RemoveAllViews";
_pnlgrid.RemoveAllViews();
 //BA.debugLineNum = 244;BA.debugLine="Dim Year As Int = DateTime.GetYear(SelectedDate)";
_year = __c.DateTime.GetYear(_selecteddate);
 //BA.debugLineNum = 245;BA.debugLine="Dim Month As Int = DateTime.GetMonth(SelectedDate";
_month = __c.DateTime.GetMonth(_selecteddate);
 //BA.debugLineNum = 246;BA.debugLine="Dim DaysInMonth As Int = DateUtils.NumberOfDaysIn";
_daysinmonth = _dateutils._numberofdaysinmonth(ba,_month,_year);
 //BA.debugLineNum = 249;BA.debugLine="Dim btnW As Int = Root.Width / 10";
_btnw = (int) (_root.getWidth()/(double)10);
 //BA.debugLineNum = 250;BA.debugLine="Dim btnH As Int = 50dip";
_btnh = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 252;BA.debugLine="For day = 1 To DaysInMonth";
{
final int step8 = 1;
final int limit8 = _daysinmonth;
_day = (int) (1) ;
for (;_day <= limit8 ;_day = _day + step8 ) {
 //BA.debugLineNum = 253;BA.debugLine="Dim row As Int = (day - 1) / 10";
_row = (int) ((_day-1)/(double)10);
 //BA.debugLineNum = 254;BA.debugLine="Dim col As Int = (day - 1) Mod 10";
_col = (int) ((_day-1)%10);
 //BA.debugLineNum = 256;BA.debugLine="Dim d As Long = DateUtils.SetDate(Year, Month, d";
_d = _dateutils._setdate(ba,_year,_month,_day);
 //BA.debugLineNum = 258;BA.debugLine="Dim btn As Button : btn.Initialize(\"btnGridDay\")";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 258;BA.debugLine="Dim btn As Button : btn.Initialize(\"btnGridDay\")";
_btn.Initialize(ba,"btnGridDay");
 //BA.debugLineNum = 259;BA.debugLine="Dim xBtn As B4XView = btn";
_xbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()));
 //BA.debugLineNum = 261;BA.debugLine="DateTime.DateFormat = \"EEE\"";
__c.DateTime.setDateFormat("EEE");
 //BA.debugLineNum = 262;BA.debugLine="Dim dayName As String = DateTime.Date(d)";
_dayname = __c.DateTime.Date(_d);
 //BA.debugLineNum = 263;BA.debugLine="xBtn.Text = dayName & CRLF & day";
_xbtn.setText(BA.ObjectToCharSequence(_dayname+__c.CRLF+BA.NumberToString(_day)));
 //BA.debugLineNum = 264;BA.debugLine="xBtn.TextSize = 10";
_xbtn.setTextSize((float) (10));
 //BA.debugLineNum = 265;BA.debugLine="xBtn.Tag = d";
_xbtn.setTag((Object)(_d));
 //BA.debugLineNum = 268;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
__c.DateTime.setDateFormat("yyyyMMdd");
 //BA.debugLineNum = 269;BA.debugLine="If DateTime.Date(d) = DateTime.Date(SelectedDate";
if ((__c.DateTime.Date(_d)).equals(__c.DateTime.Date(_selecteddate))) { 
 //BA.debugLineNum = 270;BA.debugLine="xBtn.Color = xui.Color_Blue";
_xbtn.setColor(_xui.Color_Blue);
 //BA.debugLineNum = 271;BA.debugLine="xBtn.TextColor = xui.Color_White";
_xbtn.setTextColor(_xui.Color_White);
 }else {
 //BA.debugLineNum = 273;BA.debugLine="xBtn.Color = xui.Color_LightGray";
_xbtn.setColor(_xui.Color_LightGray);
 //BA.debugLineNum = 274;BA.debugLine="xBtn.TextColor = xui.Color_Black";
_xbtn.setTextColor(_xui.Color_Black);
 };
 //BA.debugLineNum = 277;BA.debugLine="PnlGrid.AddView(xBtn, col * btnW, row * btnH, bt";
_pnlgrid.AddView((android.view.View)(_xbtn.getObject()),(int) (_col*_btnw),(int) (_row*_btnh),_btnw,_btnh);
 }
};
 //BA.debugLineNum = 279;BA.debugLine="Log(\">>> [ViewSchedule] Grid Built. Days: \" & Day";
__c.LogImpl("05439527",">>> [ViewSchedule] Grid Built. Days: "+BA.NumberToString(_daysinmonth),0);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return "";
}
public String  _buildtimelist() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _pnlin = null;
int _toppos = 0;
int _rowh = 0;
int _hr = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _displaytime = "";
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xt = null;
anywheresoftware.b4a.objects.collections.Map _evdata = null;
String _cname = "";
String _cphone = "";
String _caddr = "";
String _cissue = "";
anywheresoftware.b4a.objects.LabelWrapper _lblline1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xline1 = null;
anywheresoftware.b4a.objects.CSBuilder _cs1 = null;
anywheresoftware.b4a.objects.LabelWrapper _lblline2 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xline2 = null;
anywheresoftware.b4a.objects.CSBuilder _cs2 = null;
anywheresoftware.b4a.objects.LabelWrapper _lblfree = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xfree = null;
 //BA.debugLineNum = 370;BA.debugLine="Private Sub BuildTimeList";
 //BA.debugLineNum = 371;BA.debugLine="Log(\">>> [ViewSchedule] Building Time List... Wid";
__c.LogImpl("05701633",">>> [ViewSchedule] Building Time List... Width="+BA.NumberToString(_root.getWidth()),0);
 //BA.debugLineNum = 372;BA.debugLine="Dim PnlIn As B4XView = SlotContainer.Panel";
_pnlin = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlin = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_slotcontainer.getPanel().getObject()));
 //BA.debugLineNum = 373;BA.debugLine="PnlIn.RemoveAllViews";
_pnlin.RemoveAllViews();
 //BA.debugLineNum = 374;BA.debugLine="Dim topPos As Int = 10dip";
_toppos = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 375;BA.debugLine="Dim rowH As Int = 100dip";
_rowh = __c.DipToCurrent((int) (100));
 //BA.debugLineNum = 377;BA.debugLine="For hr = 10 To 20";
{
final int step6 = 1;
final int limit6 = (int) (20);
_hr = (int) (10) ;
for (;_hr <= limit6 ;_hr = _hr + step6 ) {
 //BA.debugLineNum = 378;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 379;BA.debugLine="p.SetColorAndBorder(xui.Color_White, 1dip, 0xFFE";
_p.SetColorAndBorder(_xui.Color_White,__c.DipToCurrent((int) (1)),((int)0xffeeeeee),(int) (0));
 //BA.debugLineNum = 381;BA.debugLine="Dim displayTime As String";
_displaytime = "";
 //BA.debugLineNum = 382;BA.debugLine="If hr > 12 Then";
if (_hr>12) { 
 //BA.debugLineNum = 383;BA.debugLine="displayTime = (hr - 12) & \":00 PM\"";
_displaytime = BA.NumberToString((_hr-12))+":00 PM";
 }else if(_hr==12) { 
 //BA.debugLineNum = 385;BA.debugLine="displayTime = \"12:00 PM\"";
_displaytime = "12:00 PM";
 }else {
 //BA.debugLineNum = 387;BA.debugLine="displayTime = hr & \":00 AM\"";
_displaytime = BA.NumberToString(_hr)+":00 AM";
 };
 //BA.debugLineNum = 390;BA.debugLine="Dim lblT As Label : lblT.Initialize(\"\") : Dim xT";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 390;BA.debugLine="Dim lblT As Label : lblT.Initialize(\"\") : Dim xT";
_lblt.Initialize(ba,"");
 //BA.debugLineNum = 390;BA.debugLine="Dim lblT As Label : lblT.Initialize(\"\") : Dim xT";
_xt = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xt = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblt.getObject()));
 //BA.debugLineNum = 391;BA.debugLine="xT.Text = displayTime : xT.TextColor = xui.Color";
_xt.setText(BA.ObjectToCharSequence(_displaytime));
 //BA.debugLineNum = 391;BA.debugLine="xT.Text = displayTime : xT.TextColor = xui.Color";
_xt.setTextColor(_xui.Color_Black);
 //BA.debugLineNum = 391;BA.debugLine="xT.Text = displayTime : xT.TextColor = xui.Color";
_xt.setTextSize((float) (16));
 //BA.debugLineNum = 392;BA.debugLine="lblT.Typeface = Typeface.DEFAULT_BOLD";
_lblt.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 393;BA.debugLine="p.AddView(xT, 10dip, 0, 85dip, rowH)";
_p.AddView((android.view.View)(_xt.getObject()),__c.DipToCurrent((int) (10)),(int) (0),__c.DipToCurrent((int) (85)),_rowh);
 //BA.debugLineNum = 395;BA.debugLine="If ExistingEvents.ContainsKey(hr) Then";
if (_existingevents.ContainsKey((Object)(_hr))) { 
 //BA.debugLineNum = 396;BA.debugLine="Dim EvData As Map = ExistingEvents.Get(hr)";
_evdata = new anywheresoftware.b4a.objects.collections.Map();
_evdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_existingevents.Get((Object)(_hr))));
 //BA.debugLineNum = 397;BA.debugLine="Dim cName As String = EvData.Get(\"Name\")";
_cname = BA.ObjectToString(_evdata.Get((Object)("Name")));
 //BA.debugLineNum = 398;BA.debugLine="Dim cPhone As String = EvData.Get(\"Phone\")";
_cphone = BA.ObjectToString(_evdata.Get((Object)("Phone")));
 //BA.debugLineNum = 399;BA.debugLine="Dim cAddr As String = EvData.Get(\"Addr\")";
_caddr = BA.ObjectToString(_evdata.Get((Object)("Addr")));
 //BA.debugLineNum = 400;BA.debugLine="Dim cIssue As String = EvData.Get(\"Issue\")";
_cissue = BA.ObjectToString(_evdata.Get((Object)("Issue")));
 //BA.debugLineNum = 403;BA.debugLine="Dim lblLine1 As Label : lblLine1.Initialize(\"\")";
_lblline1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 403;BA.debugLine="Dim lblLine1 As Label : lblLine1.Initialize(\"\")";
_lblline1.Initialize(ba,"");
 //BA.debugLineNum = 403;BA.debugLine="Dim lblLine1 As Label : lblLine1.Initialize(\"\")";
_xline1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xline1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblline1.getObject()));
 //BA.debugLineNum = 404;BA.debugLine="Dim cs1 As CSBuilder";
_cs1 = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 405;BA.debugLine="cs1.Initialize.Typeface(Typeface.DEFAULT_BOLD).";
_cs1.Initialize().Typeface(__c.Typeface.DEFAULT_BOLD).Color(_xui.Color_Blue).Append(BA.ObjectToCharSequence("Name: "+_cname)).Pop().Pop();
 //BA.debugLineNum = 406;BA.debugLine="cs1.Append(\"     \").Color(xui.Color_Blue).Bold.";
_cs1.Append(BA.ObjectToCharSequence("     ")).Color(_xui.Color_Blue).Bold().Append(BA.ObjectToCharSequence("Address: "+_caddr)).Pop().Pop();
 //BA.debugLineNum = 407;BA.debugLine="xLine1.Text = cs1";
_xline1.setText(BA.ObjectToCharSequence(_cs1.getObject()));
 //BA.debugLineNum = 408;BA.debugLine="xLine1.TextSize = 13";
_xline1.setTextSize((float) (13));
 //BA.debugLineNum = 409;BA.debugLine="xLine1.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xline1.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 410;BA.debugLine="p.AddView(xLine1, 100dip, 10dip, Root.Width - 1";
_p.AddView((android.view.View)(_xline1.getObject()),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (10)),(int) (_root.getWidth()-__c.DipToCurrent((int) (110))),__c.DipToCurrent((int) (35)));
 //BA.debugLineNum = 413;BA.debugLine="Dim lblLine2 As Label : lblLine2.Initialize(\"\")";
_lblline2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 413;BA.debugLine="Dim lblLine2 As Label : lblLine2.Initialize(\"\")";
_lblline2.Initialize(ba,"");
 //BA.debugLineNum = 413;BA.debugLine="Dim lblLine2 As Label : lblLine2.Initialize(\"\")";
_xline2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xline2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblline2.getObject()));
 //BA.debugLineNum = 414;BA.debugLine="Dim cs2 As CSBuilder";
_cs2 = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 415;BA.debugLine="cs2.Initialize.Typeface(Typeface.DEFAULT_BOLD).";
_cs2.Initialize().Typeface(__c.Typeface.DEFAULT_BOLD).Color(_xui.Color_Blue).Append(BA.ObjectToCharSequence("Phone: "+_cphone)).Pop().Pop();
 //BA.debugLineNum = 416;BA.debugLine="cs2.Append(\"     \").Color(xui.Color_Black).Bold";
_cs2.Append(BA.ObjectToCharSequence("     ")).Color(_xui.Color_Black).Bold().Append(BA.ObjectToCharSequence("Issue: "+_cissue)).Pop().Pop();
 //BA.debugLineNum = 417;BA.debugLine="xLine2.Text = cs2";
_xline2.setText(BA.ObjectToCharSequence(_cs2.getObject()));
 //BA.debugLineNum = 418;BA.debugLine="xLine2.TextSize = 13";
_xline2.setTextSize((float) (13));
 //BA.debugLineNum = 419;BA.debugLine="xLine2.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xline2.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 420;BA.debugLine="p.AddView(xLine2, 100dip, 45dip, Root.Width - 1";
_p.AddView((android.view.View)(_xline2.getObject()),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (45)),(int) (_root.getWidth()-__c.DipToCurrent((int) (110))),__c.DipToCurrent((int) (35)));
 }else {
 //BA.debugLineNum = 423;BA.debugLine="Dim lblFree As Label : lblFree.Initialize(\"\") :";
_lblfree = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 423;BA.debugLine="Dim lblFree As Label : lblFree.Initialize(\"\") :";
_lblfree.Initialize(ba,"");
 //BA.debugLineNum = 423;BA.debugLine="Dim lblFree As Label : lblFree.Initialize(\"\") :";
_xfree = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xfree = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblfree.getObject()));
 //BA.debugLineNum = 424;BA.debugLine="xFree.Text = \"Available\"";
_xfree.setText(BA.ObjectToCharSequence("Available"));
 //BA.debugLineNum = 425;BA.debugLine="xFree.TextColor = xui.Color_LightGray";
_xfree.setTextColor(_xui.Color_LightGray);
 //BA.debugLineNum = 426;BA.debugLine="xFree.TextSize = 14";
_xfree.setTextSize((float) (14));
 //BA.debugLineNum = 427;BA.debugLine="p.AddView(xFree, 100dip, 30dip, Root.Width - 11";
_p.AddView((android.view.View)(_xfree.getObject()),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (30)),(int) (_root.getWidth()-__c.DipToCurrent((int) (110))),__c.DipToCurrent((int) (40)));
 };
 //BA.debugLineNum = 430;BA.debugLine="PnlIn.AddView(p, 0, topPos, Root.Width, rowH)";
_pnlin.AddView((android.view.View)(_p.getObject()),(int) (0),_toppos,_root.getWidth(),_rowh);
 //BA.debugLineNum = 431;BA.debugLine="topPos = topPos + rowH + 2dip";
_toppos = (int) (_toppos+_rowh+__c.DipToCurrent((int) (2)));
 }
};
 //BA.debugLineNum = 433;BA.debugLine="PnlIn.Height = topPos";
_pnlin.setHeight(_toppos);
 //BA.debugLineNum = 434;BA.debugLine="Log(\">>> [ViewSchedule] Time List Built.\")";
__c.LogImpl("05701696",">>> [ViewSchedule] Time List Built.",0);
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return "";
}
public void  _buildui() throws Exception{
ResumableSub_BuildUI rsub = new ResumableSub_BuildUI(this);
rsub.resume(ba, null);
}
public static class ResumableSub_BuildUI extends BA.ResumableSub {
public ResumableSub_BuildUI(Geek.God.CRM.App.viewschedulepage parent) {
this.parent = parent;
}
Geek.God.CRM.App.viewschedulepage parent;
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
 //BA.debugLineNum = 122;BA.debugLine="Log(\">>> [ViewSchedule] BuildUI Running. Width: \"";
parent.__c.LogImpl("04915201",">>> [ViewSchedule] BuildUI Running. Width: "+BA.NumberToString(parent._root.getWidth()),0);
 //BA.debugLineNum = 125;BA.debugLine="If File.Exists(File.DirInternal, \"settings.map\")";
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
 //BA.debugLineNum = 126;BA.debugLine="Dim settings As Map = File.ReadMap(File.DirInter";
_settings = new anywheresoftware.b4a.objects.collections.Map();
_settings = parent.__c.File.ReadMap(parent.__c.File.getDirInternal(),"settings.map");
 //BA.debugLineNum = 127;BA.debugLine="SelectedUser = settings.GetDefault(\"CurrentUser\"";
parent._selecteduser = BA.ObjectToString(_settings.GetDefault((Object)("CurrentUser"),(Object)("Mike")));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 129;BA.debugLine="SelectedUser = \"Mike\"";
parent._selecteduser = "Mike";
 if (true) break;
;
 //BA.debugLineNum = 131;BA.debugLine="If SelectedUser = \"Mike\" Then spnUserFilter.Selec";

case 6:
//if
this.state = 13;
if ((parent._selecteduser).equals("Mike")) { 
this.state = 8;
;}
else {
this.state = 10;
;}if (true) break;

case 8:
//C
this.state = 13;
parent._spnuserfilter.setSelectedIndex((int) (0));
if (true) break;

case 10:
//C
this.state = 13;
parent._spnuserfilter.setSelectedIndex((int) (1));
if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 135;BA.debugLine="If Root.Width = 0 Then";
if (true) break;

case 14:
//if
this.state = 17;
if (parent._root.getWidth()==0) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 136;BA.debugLine="Log(\"... Root Width is 0. Waiting 50ms...\")";
parent.__c.LogImpl("04915215","... Root Width is 0. Waiting 50ms...",0);
 //BA.debugLineNum = 137;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,this,(int) (50));
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 //BA.debugLineNum = 138;BA.debugLine="CallSubDelayed(Me, \"BuildUI\")";
parent.__c.CallSubDelayed(ba,parent,"BuildUI");
 //BA.debugLineNum = 139;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
 //BA.debugLineNum = 143;BA.debugLine="If IsPageReady = True And Abs(Root.Width - LastWi";

case 17:
//if
this.state = 20;
if (parent._ispageready==parent.__c.True && parent.__c.Abs(parent._root.getWidth()-parent._lastwidth)<parent.__c.DipToCurrent((int) (5))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 144;BA.debugLine="Log(\"... UI already built. Skipping.\")";
parent.__c.LogImpl("04915223","... UI already built. Skipping.",0);
 //BA.debugLineNum = 145;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 148;BA.debugLine="UpdateMonthDisplay";
parent._updatemonthdisplay();
 //BA.debugLineNum = 149;BA.debugLine="BuildGrid";
parent._buildgrid();
 //BA.debugLineNum = 150;BA.debugLine="RefreshSchedule";
parent._refreshschedule();
 //BA.debugLineNum = 152;BA.debugLine="IsPageReady = True";
parent._ispageready = parent.__c.True;
 //BA.debugLineNum = 153;BA.debugLine="LastWidth = Root.Width";
parent._lastwidth = parent._root.getWidth();
 //BA.debugLineNum = 154;BA.debugLine="Log(\">>> [ViewSchedule] Page Ready & Built.\")";
parent.__c.LogImpl("04915233",">>> [ViewSchedule] Page Ready & Built.",0);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 7;BA.debugLine="Private PnlHeader As B4XView";
_pnlheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private lblMonthYear As Label ' Native Label for";
_lblmonthyear = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private btnCalendar As Label";
_btncalendar = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private spnUserFilter As Spinner";
_spnuserfilter = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private PnlGrid As B4XView";
_pnlgrid = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private SlotContainer As ScrollView";
_slotcontainer = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private SelectedDate As Long";
_selecteddate = 0L;
 //BA.debugLineNum = 20;BA.debugLine="Private SelectedUser As String";
_selecteduser = "";
 //BA.debugLineNum = 21;BA.debugLine="Private ExistingEvents As Map";
_existingevents = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 24;BA.debugLine="Private IsPageReady As Boolean = False";
_ispageready = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="Private LastWidth As Int = 0";
_lastwidth = (int) (0);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _createrfc3339(long _datems,int _hour) throws Exception{
 //BA.debugLineNum = 450;BA.debugLine="Private Sub CreateRFC3339(DateMs As Long, Hour As";
 //BA.debugLineNum = 451;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 452;BA.debugLine="Return DateTime.Date(DateMs) & \"T\" & NumberFormat";
if (true) return __c.DateTime.Date(_datems)+"T"+__c.NumberFormat(_hour,(int) (2),(int) (0))+":00:00-05:00";
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 29;BA.debugLine="SelectedDate = DateTime.Now";
_selecteddate = __c.DateTime.getNow();
 //BA.debugLineNum = 30;BA.debugLine="ExistingEvents.Initialize";
_existingevents.Initialize();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(Geek.God.CRM.App.httpjob _job) throws Exception{
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
 //BA.debugLineNum = 312;BA.debugLine="Sub JobDone(Job As HttpJob)";
 //BA.debugLineNum = 313;BA.debugLine="Log(\">>> [ViewSchedule] JobDone: \" & Job.JobName";
__c.LogImpl("05636097",">>> [ViewSchedule] JobDone: "+_job._jobname /*String*/ +" Success: "+BA.ObjectToString(_job._success /*boolean*/ ),0);
 //BA.debugLineNum = 314;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 315;BA.debugLine="Try";
try { //BA.debugLineNum = 316;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Jo";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 316;BA.debugLine="Dim parser As JSONParser : parser.Initialize(Jo";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 317;BA.debugLine="Dim RootMap As Map = parser.NextObject";
_rootmap = new anywheresoftware.b4a.objects.collections.Map();
_rootmap = _parser.NextObject();
 //BA.debugLineNum = 318;BA.debugLine="Dim items As List = RootMap.Get(\"items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_rootmap.Get((Object)("items"))));
 //BA.debugLineNum = 319;BA.debugLine="Log(\">>> [ViewSchedule] Events Found: \" & items";
__c.LogImpl("05636103",">>> [ViewSchedule] Events Found: "+BA.NumberToString(_items.getSize()),0);
 //BA.debugLineNum = 321;BA.debugLine="For Each ev As Map In items";
_ev = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group9 = _items;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_ev = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group9.Get(index9)));
 //BA.debugLineNum = 322;BA.debugLine="Dim cId As String = ev.GetDefault(\"colorId\", \"";
_cid = BA.ObjectToString(_ev.GetDefault((Object)("colorId"),(Object)("1")));
 //BA.debugLineNum = 323;BA.debugLine="Dim targetId As String = \"1\" : If SelectedUser";
_targetid = "1";
 //BA.debugLineNum = 323;BA.debugLine="Dim targetId As String = \"1\" : If SelectedUser";
if ((_selecteduser).equals("Erin")) { 
_targetid = "11";};
 //BA.debugLineNum = 325;BA.debugLine="If cId = targetId Then";
if ((_cid).equals(_targetid)) { 
 //BA.debugLineNum = 326;BA.debugLine="Dim startMap As Map = ev.Get(\"start\")";
_startmap = new anywheresoftware.b4a.objects.collections.Map();
_startmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ev.Get((Object)("start"))));
 //BA.debugLineNum = 327;BA.debugLine="Dim endMap As Map = ev.Get(\"end\")";
_endmap = new anywheresoftware.b4a.objects.collections.Map();
_endmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_ev.Get((Object)("end"))));
 //BA.debugLineNum = 328;BA.debugLine="Dim dtStart As String = startMap.GetDefault(\"";
_dtstart = BA.ObjectToString(_startmap.GetDefault((Object)("dateTime"),(Object)("")));
 //BA.debugLineNum = 329;BA.debugLine="Dim dtEnd As String = endMap.GetDefault(\"date";
_dtend = BA.ObjectToString(_endmap.GetDefault((Object)("dateTime"),(Object)("")));
 //BA.debugLineNum = 331;BA.debugLine="Dim summary As String = ev.GetDefault(\"summar";
_summary = BA.ObjectToString(_ev.GetDefault((Object)("summary"),(Object)("Unknown")));
 //BA.debugLineNum = 332;BA.debugLine="If summary.Contains(\" - \") Then summary = sum";
if (_summary.contains(" - ")) { 
_summary = _summary.substring((int) (0),_summary.indexOf(" - "));};
 //BA.debugLineNum = 333;BA.debugLine="Dim desc As String = ev.GetDefault(\"descripti";
_desc = BA.ObjectToString(_ev.GetDefault((Object)("description"),(Object)("")));
 //BA.debugLineNum = 334;BA.debugLine="Dim cPhone As String = \"No Phone\" : Dim cIssu";
_cphone = "No Phone";
 //BA.debugLineNum = 334;BA.debugLine="Dim cPhone As String = \"No Phone\" : Dim cIssu";
_cissue = "No Issue";
 //BA.debugLineNum = 336;BA.debugLine="If desc.Contains(\"Phone: \") Then";
if (_desc.contains("Phone: ")) { 
 //BA.debugLineNum = 337;BA.debugLine="Dim i As Int = desc.IndexOf(\"Phone: \") + 7";
_i = (int) (_desc.indexOf("Phone: ")+7);
 //BA.debugLineNum = 338;BA.debugLine="Dim i2 As Int = desc.IndexOf2(Chr(10), i) :";
_i2 = _desc.indexOf(BA.ObjectToString(__c.Chr((int) (10))),_i);
 //BA.debugLineNum = 338;BA.debugLine="Dim i2 As Int = desc.IndexOf2(Chr(10), i) :";
if (_i2==-1) { 
_i2 = _desc.length();};
 //BA.debugLineNum = 339;BA.debugLine="cPhone = desc.SubString2(i, i2).Trim";
_cphone = _desc.substring(_i,_i2).trim();
 };
 //BA.debugLineNum = 341;BA.debugLine="If desc.Contains(\"Issue: \") Then";
if (_desc.contains("Issue: ")) { 
 //BA.debugLineNum = 342;BA.debugLine="Dim i As Int = desc.IndexOf(\"Issue: \") + 7";
_i = (int) (_desc.indexOf("Issue: ")+7);
 //BA.debugLineNum = 343;BA.debugLine="Dim i2 As Int = desc.IndexOf2(Chr(10), i) :";
_i2 = _desc.indexOf(BA.ObjectToString(__c.Chr((int) (10))),_i);
 //BA.debugLineNum = 343;BA.debugLine="Dim i2 As Int = desc.IndexOf2(Chr(10), i) :";
if (_i2==-1) { 
_i2 = _desc.length();};
 //BA.debugLineNum = 344;BA.debugLine="cIssue = desc.SubString2(i, i2).Trim";
_cissue = _desc.substring(_i,_i2).trim();
 }else {
 //BA.debugLineNum = 346;BA.debugLine="cIssue = desc";
_cissue = _desc;
 };
 //BA.debugLineNum = 349;BA.debugLine="Dim StartHour As Int = ParseIsoToLocalHour(dt";
_starthour = _parseisotolocalhour(_dtstart);
 //BA.debugLineNum = 350;BA.debugLine="Dim EndHour As Int = ParseIsoToLocalHour(dtEn";
_endhour = _parseisotolocalhour(_dtend);
 //BA.debugLineNum = 352;BA.debugLine="If StartHour > -1 And EndHour > -1 Then";
if (_starthour>-1 && _endhour>-1) { 
 //BA.debugLineNum = 353;BA.debugLine="For h = StartHour To EndHour - 1";
{
final int step40 = 1;
final int limit40 = (int) (_endhour-1);
_h = _starthour ;
for (;_h <= limit40 ;_h = _h + step40 ) {
 //BA.debugLineNum = 354;BA.debugLine="Dim EvData As Map = CreateMap(\"Name\": summa";
_evdata = new anywheresoftware.b4a.objects.collections.Map();
_evdata = __c.createMap(new Object[] {(Object)("Name"),(Object)(_summary),(Object)("Phone"),(Object)(_cphone),(Object)("Addr"),_ev.GetDefault((Object)("location"),(Object)("No Address")),(Object)("Issue"),(Object)(_cissue)});
 //BA.debugLineNum = 355;BA.debugLine="ExistingEvents.Put(h, EvData)";
_existingevents.Put((Object)(_h),(Object)(_evdata.getObject()));
 }
};
 };
 };
 }
};
 //BA.debugLineNum = 360;BA.debugLine="BuildTimeList";
_buildtimelist();
 } 
       catch (Exception e49) {
			ba.setLastException(e49); //BA.debugLineNum = 362;BA.debugLine="Log(\"!!! Error Parsing Schedule: \" & LastExcept";
__c.LogImpl("05636146","!!! Error Parsing Schedule: "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 }else {
 //BA.debugLineNum = 365;BA.debugLine="Log(\"!!! Job Error: \" & Job.ErrorMessage)";
__c.LogImpl("05636149","!!! Job Error: "+_job._errormessage /*String*/ ,0);
 };
 //BA.debugLineNum = 367;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return "";
}
public String  _ondateselected(int _year,int _month,int _day) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub OnDateSelected(year As Int, month As Int, day";
 //BA.debugLineNum = 226;BA.debugLine="Log(\">>> [ViewSchedule] Date Selected via Picker:";
__c.LogImpl("05308417",">>> [ViewSchedule] Date Selected via Picker: "+BA.NumberToString(_year)+"-"+BA.NumberToString((_month+1))+"-"+BA.NumberToString(_day),0);
 //BA.debugLineNum = 228;BA.debugLine="SelectedDate = DateUtils.SetDate(year, month + 1,";
_selecteddate = _dateutils._setdate(ba,_year,(int) (_month+1),_day);
 //BA.debugLineNum = 229;BA.debugLine="UpdateMonthDisplay";
_updatemonthdisplay();
 //BA.debugLineNum = 230;BA.debugLine="BuildGrid";
_buildgrid();
 //BA.debugLineNum = 231;BA.debugLine="RefreshSchedule";
_refreshschedule();
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
public int  _parseisotolocalhour(String _iso) throws Exception{
int _h = 0;
 //BA.debugLineNum = 438;BA.debugLine="Private Sub ParseIsoToLocalHour(iso As String) As";
 //BA.debugLineNum = 439;BA.debugLine="Try";
try { //BA.debugLineNum = 440;BA.debugLine="Dim H As Int = iso.SubString2(11,13)";
_h = (int)(Double.parseDouble(_iso.substring((int) (11),(int) (13))));
 //BA.debugLineNum = 441;BA.debugLine="If iso.EndsWith(\"Z\") Then H = H + DateTime.TimeZ";
if (_iso.endsWith("Z")) { 
_h = (int) (_h+__c.DateTime.getTimeZoneOffset());};
 //BA.debugLineNum = 442;BA.debugLine="If H < 0 Then H = H + 24";
if (_h<0) { 
_h = (int) (_h+24);};
 //BA.debugLineNum = 443;BA.debugLine="If H > 23 Then H = H - 24";
if (_h>23) { 
_h = (int) (_h-24);};
 //BA.debugLineNum = 444;BA.debugLine="Return H";
if (true) return _h;
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 446;BA.debugLine="Return -1";
if (true) return (int) (-1);
 };
 //BA.debugLineNum = 448;BA.debugLine="End Sub";
return 0;
}
public String  _refreshschedule() throws Exception{
String _timemin = "";
String _timemax = "";
Geek.God.CRM.App.httpjob _job = null;
 //BA.debugLineNum = 302;BA.debugLine="Public Sub RefreshSchedule";
 //BA.debugLineNum = 303;BA.debugLine="Log(\">>> [ViewSchedule] Refreshing Schedule for:";
__c.LogImpl("05570561",">>> [ViewSchedule] Refreshing Schedule for: "+BA.NumberToString(_selecteddate),0);
 //BA.debugLineNum = 304;BA.debugLine="ExistingEvents.Clear";
_existingevents.Clear();
 //BA.debugLineNum = 305;BA.debugLine="Dim TimeMin As String = CreateRFC3339(SelectedDat";
_timemin = _createrfc3339(_selecteddate,(int) (0));
 //BA.debugLineNum = 306;BA.debugLine="Dim TimeMax As String = CreateRFC3339(SelectedDat";
_timemax = _createrfc3339(_selecteddate,(int) (23));
 //BA.debugLineNum = 307;BA.debugLine="Dim job As HttpJob : job.Initialize(\"FetchViewSch";
_job = new Geek.God.CRM.App.httpjob();
 //BA.debugLineNum = 307;BA.debugLine="Dim job As HttpJob : job.Initialize(\"FetchViewSch";
_job._initialize /*String*/ (ba,"FetchViewSchedule",this);
 //BA.debugLineNum = 308;BA.debugLine="job.Download(\"https://www.googleapis.com/calendar";
_job._download /*String*/ ("https://www.googleapis.com/calendar/v3/calendars/primary/events?timeMin="+_timemin.replace("+","%2B")+"&timeMax="+_timemax.replace("+","%2B")+"&singleEvents=true");
 //BA.debugLineNum = 309;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_b4xpages._mainpage /*Geek.God.CRM.App.b4xmainpage*/ (ba)._oauth2 /*Geek.God.CRM.App.googleoauth2*/ ._access_token /*String*/ );
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return "";
}
public String  _spnuserfilter_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub spnUserFilter_ItemClick (Index As Int, Value A";
 //BA.debugLineNum = 214;BA.debugLine="Log(\">>> [ViewSchedule] User Filter Changed: \" &";
__c.LogImpl("05177345",">>> [ViewSchedule] User Filter Changed: "+BA.NumberToString(_index),0);
 //BA.debugLineNum = 215;BA.debugLine="If Index = 0 Then SelectedUser = \"Mike\" Else Sele";
if (_index==0) { 
_selecteduser = "Mike";}
else {
_selecteduser = "Erin";};
 //BA.debugLineNum = 216;BA.debugLine="RefreshSchedule";
_refreshschedule();
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return "";
}
public String  _updatemonthdisplay() throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Private Sub UpdateMonthDisplay";
 //BA.debugLineNum = 235;BA.debugLine="DateTime.DateFormat = \"MMMM yyyy\"";
__c.DateTime.setDateFormat("MMMM yyyy");
 //BA.debugLineNum = 236;BA.debugLine="lblMonthYear.Text = DateTime.Date(SelectedDate)";
_lblmonthyear.setText(BA.ObjectToCharSequence(__c.DateTime.Date(_selecteddate)));
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
if (BA.fastSubCompare(sub, "JOBDONE"))
	return _jobdone((Geek.God.CRM.App.httpjob) args[0]);
if (BA.fastSubCompare(sub, "ONDATESELECTED"))
	return _ondateselected(((Number)args[0]).intValue(), ((Number)args[1]).intValue(), ((Number)args[2]).intValue());
if (BA.fastSubCompare(sub, "REFRESHSCHEDULE"))
	return _refreshschedule();
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
