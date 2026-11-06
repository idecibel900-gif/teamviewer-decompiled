package o;

import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvconfigadapter.AppType;
import com.teamviewer.teamviewerlib.swig.tvconfigadapter.CrashReportingConfigurationAdapter;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.io.Closeable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ye1 implements Closeable {
    public final wk0 m;
    public final AppType n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final EventHub f2601o;
    public final y46 p;
    public final vq3 q;
    public final mu r;
    public final kh7 s;
    public String t;
    public final VoidSignalCallback u;

    public ye1(wk0 wk0Var, AppType appType, EventHub eventHub, y46 y46Var) {
        appType.getClass();
        eventHub.getClass();
        this.m = wk0Var;
        this.n = appType;
        this.f2601o = eventHub;
        this.p = y46Var;
        this.q = xs1.i(new h31((byte) 13));
        mu muVar = new mu(this, (byte) 3);
        this.r = muVar;
        final byte b = 0;
        kh7 kh7Var = new kh7(new Function0(this) { // from class: o.xe1
            public final /* synthetic */ ye1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                ye1 ye1Var = this.n;
                switch (b2) {
                    case 0:
                        return CrashReportingConfigurationAdapter.Create(ye1Var.n);
                    default:
                        String strGetConfigurationString = ((CrashReportingConfigurationAdapter) ye1Var.s.getValue()).GetConfigurationString();
                        if (!im3.n(ye1Var.t, strGetConfigurationString)) {
                            strGetConfigurationString.getClass();
                            ye1Var.t = strGetConfigurationString;
                            wk0 wk0Var2 = ye1Var.m;
                            byte[] bytes = strGetConfigurationString.getBytes(vn0.a);
                            bytes.getClass();
                            wk0Var2.D("CRASH_REPORTING_CONFIGURATION", bytes);
                            we1 we1VarE = ye1Var.e(strGetConfigurationString);
                            if (we1VarE != null) {
                                ye1Var.p.invoke(we1VarE);
                            }
                        }
                        return f88.a;
                }
            }
        });
        this.s = kh7Var;
        this.t = "";
        final byte b2 = 1;
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new Function0(this) { // from class: o.xe1
            public final /* synthetic */ ye1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                ye1 ye1Var = this.n;
                switch (b3) {
                    case 0:
                        return CrashReportingConfigurationAdapter.Create(ye1Var.n);
                    default:
                        String strGetConfigurationString = ((CrashReportingConfigurationAdapter) ye1Var.s.getValue()).GetConfigurationString();
                        if (!im3.n(ye1Var.t, strGetConfigurationString)) {
                            strGetConfigurationString.getClass();
                            ye1Var.t = strGetConfigurationString;
                            wk0 wk0Var2 = ye1Var.m;
                            byte[] bytes = strGetConfigurationString.getBytes(vn0.a);
                            bytes.getClass();
                            wk0Var2.D("CRASH_REPORTING_CONFIGURATION", bytes);
                            we1 we1VarE = ye1Var.e(strGetConfigurationString);
                            if (we1VarE != null) {
                                ye1Var.p.invoke(we1VarE);
                            }
                        }
                        return f88.a;
                }
            }
        });
        this.u = voidSignalCallback;
        if (l25.b()) {
            eventHub.f(muVar);
            if (((CrashReportingConfigurationAdapter) kh7Var.getValue()) != null) {
                ((CrashReportingConfigurationAdapter) kh7Var.getValue()).RegisterForConfig();
                ((CrashReportingConfigurationAdapter) kh7Var.getValue()).AddSettingsChangeCallback(voidSignalCallback);
            }
        } else if (!eventHub.c(EventType.EVENT_KEEP_ALIVE_STATE_CHANGED, muVar)) {
            ye4.c("CrashReportingInitializationManager", "register KeepAlive state change listener failed");
        }
        byte[] bArrP = wk0Var.p("CRASH_REPORTING_CONFIGURATION", new byte[0]);
        String string = bArrP.length == 0 ? null : ub7.x0(new String(bArrP, vn0.a)).toString();
        if (string == null || string.length() == 0) {
            return;
        }
        this.t = string;
        we1 we1VarE = e(string);
        if (we1VarE != null) {
            y46Var.invoke(we1VarE);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        VoidSignalCallback voidSignalCallback = this.u;
        voidSignalCallback.Disconnect();
        voidSignalCallback.delete();
        ((CrashReportingConfigurationAdapter) this.s.getValue()).delete();
        this.f2601o.f(this.r);
    }

    public final we1 e(String str) {
        try {
            if (ub7.Q(str, "\"url\": https", false)) {
                str = bc7.L(str, "\"url\": https", "\"url\": \"https");
            }
            vq3 vq3Var = this.q;
            vq3Var.getClass();
            return (we1) vq3Var.a(str, we1.Companion.serializer());
        } catch (nq6 unused) {
            ye4.c("CrashReportingInitializationManager", "Invalid json object for crash reporting configuration.");
            return null;
        }
    }
}
