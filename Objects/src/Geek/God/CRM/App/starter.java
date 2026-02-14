package Geek.God.CRM.App;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, BA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new BA(this, null, null, "Geek.God.CRM.App", "Geek.God.CRM.App.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "Geek.God.CRM.App.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			if (ServiceHelper.StarterHelper.runWaitForLayouts() == false) {
                BA.LogInfo("stopping spontaneous created service");
                stopSelf();
            }
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }

	public void onTimeout(int startId) {
        BA.LogInfo("** Service (starter) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (true) {
            BA.LogInfo("** Service (starter) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (starter) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.RuntimePermissions _rtp = null;
public static anywheresoftware.b4a.gps.GPS _gps1 = null;
public static anywheresoftware.b4a.audio.SoundPoolWrapper _sp = null;
public static anywheresoftware.b4a.objects.collections.Map _soundmap = null;
public static long _groupid_client = 0L;
public static long _groupid_blacklisted = 0L;
public static long _groupid_preferred = 0L;
public b4a.example.dateutils _dateutils = null;
public Geek.God.CRM.App.main _main = null;
public Geek.God.CRM.App.b4xpages _b4xpages = null;
public Geek.God.CRM.App.b4xcollections _b4xcollections = null;
public Geek.God.CRM.App.httputils2service _httputils2service = null;
public Geek.God.CRM.App.xuiviewsutils _xuiviewsutils = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 77;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return false;
}
public static String  _loadsounds() throws Exception{
int _i = 0;
String _filename = "";
int _loadid = 0;
 //BA.debugLineNum = 44;BA.debugLine="Sub LoadSounds";
 //BA.debugLineNum = 46;BA.debugLine="Try";
try { //BA.debugLineNum = 47;BA.debugLine="For i = 1 To 150";
{
final int step2 = 1;
final int limit2 = (int) (150);
_i = (int) (1) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 48;BA.debugLine="Dim FileName As String";
_filename = "";
 //BA.debugLineNum = 50;BA.debugLine="If i < 10 Then";
if (_i<10) { 
 //BA.debugLineNum = 51;BA.debugLine="FileName = \"0\" & i & \".wav\"";
_filename = "0"+BA.NumberToString(_i)+".wav";
 }else {
 //BA.debugLineNum = 53;BA.debugLine="FileName = i & \".wav\"";
_filename = BA.NumberToString(_i)+".wav";
 };
 //BA.debugLineNum = 56;BA.debugLine="If File.Exists(File.DirAssets, FileName) Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename)) { 
 //BA.debugLineNum = 57;BA.debugLine="Dim LoadID As Int = SP.Load(File.DirAssets, Fi";
_loadid = _sp.Load(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename);
 //BA.debugLineNum = 58;BA.debugLine="SoundMap.Put(i, LoadID)";
_soundmap.Put((Object)(_i),(Object)(_loadid));
 };
 }
};
 //BA.debugLineNum = 61;BA.debugLine="Log(\"Success: Loaded \" & SoundMap.Size & \" sound";
anywheresoftware.b4a.keywords.Common.LogImpl("01703953","Success: Loaded "+BA.NumberToString(_soundmap.getSize())+" sound files.",0);
 } 
       catch (Exception e16) {
			processBA.setLastException(e16); //BA.debugLineNum = 63;BA.debugLine="Log(\"Error Loading Sounds: \" & LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("01703955","Error Loading Sounds: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Public RTP As RuntimePermissions";
_rtp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 12;BA.debugLine="Public GPS1 As GPS";
_gps1 = new anywheresoftware.b4a.gps.GPS();
 //BA.debugLineNum = 15;BA.debugLine="Public SP As SoundPool";
_sp = new anywheresoftware.b4a.audio.SoundPoolWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Public SoundMap As Map";
_soundmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 19;BA.debugLine="Public GroupID_Client As Long";
_groupid_client = 0L;
 //BA.debugLineNum = 20;BA.debugLine="Public GroupID_Blacklisted As Long";
_groupid_blacklisted = 0L;
 //BA.debugLineNum = 21;BA.debugLine="Public GroupID_Preferred As Long";
_groupid_preferred = 0L;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 30;BA.debugLine="SP.Initialize(5) 'Max 5 simultaneous streams";
_sp.Initialize((int) (5));
 //BA.debugLineNum = 31;BA.debugLine="SoundMap.Initialize";
_soundmap.Initialize();
 //BA.debugLineNum = 34;BA.debugLine="Try";
try { //BA.debugLineNum = 35;BA.debugLine="GPS1.Initialize(\"GPS\")";
_gps1.Initialize("GPS");
 } 
       catch (Exception e6) {
			processBA.setLastException(e6); //BA.debugLineNum = 37;BA.debugLine="Log(\"GPS Init Failed: \" & LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("01638413","GPS Init Failed: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
 //BA.debugLineNum = 41;BA.debugLine="CallSubDelayed(Me, \"LoadSounds\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,starter.getObject(),"LoadSounds");
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
 //BA.debugLineNum = 68;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
mostCurrent._service.StopAutomaticForeground();
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub Service_TaskRemoved";
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
}
