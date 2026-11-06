package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.network.BCommandHandler;
import com.teamviewer.teamviewerlib.network.InterProcessGUIConnector;
import com.teamviewer.teamviewerlib.network.NativeNetwork;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvaccount.IAccountAndroid;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import com.teamviewer.teamviewerlib.swig.tvclientstatistics.ISessionStatisticsSender;
import com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes.ModularSessionType;
import com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes.PilotModularSessionType;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ps6 {
    public final au6 a;
    public final EventHub b;
    public final d31 c;
    public final du6 d;
    public boolean e;
    public boolean f;
    public final fa7 g;
    public final hr2 h;
    public final BCommandHandler i;
    public WifiManager.WifiLock j;
    public final PowerManager.WakeLock k;
    public final AtomicBoolean l;
    public gk7 m;
    public final nm n;

    public ps6(du6 du6Var, au6 au6Var, Context context, EventHub eventHub, d31 d31Var) {
        eventHub.getClass();
        d31Var.getClass();
        this.a = au6Var;
        this.b = eventHub;
        this.c = d31Var;
        this.d = du6Var;
        this.l = new AtomicBoolean(false);
        g95 g95Var = new g95(this);
        this.n = new nm((byte) 4);
        g(i41.r);
        byte b = 13;
        hr2 hr2Var = new hr2((byte) 13);
        hr2Var.n = "";
        this.h = hr2Var;
        int i = du6Var.c;
        BCommandHandler bCommandHandler = new BCommandHandler(i);
        this.i = bCommandHandler;
        InterProcessGUIConnector.b = g95Var;
        this.g = new fa7(i);
        ISessionStatisticsSender.SessionStatisticsInfoType sessionStatisticsInfoType = ISessionStatisticsSender.SessionStatisticsInfoType.SessionType;
        long jSwigValue = du6Var.a.swigValue();
        sessionStatisticsInfoType.getClass();
        if (NativeLibTvExt.c()) {
            InterProcessGUIConnector.a.jniSetSessionInfoLong(i, sessionStatisticsInfoType.swigValue(), jSwigValue);
        }
        el5 el5Var = ks6.n;
        mo4 mo4Var = new mo4(g10.SessionCommand, b, (byte) 2);
        mo4Var.d(l10.TeamViewerSessionID, i);
        mo4Var.b(is6.SendInfo, du6Var.s ? (byte) 1 : (byte) 0);
        NativeNetwork.a.b(mo4Var);
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        if (wifiManager != null) {
            WifiManager.WifiLock wifiLockCreateWifiLock = Build.VERSION.SDK_INT >= 29 ? wifiManager.createWifiLock(4, "TeamViewer_WifiLock") : wifiManager.createWifiLock(3, "TeamViewer_WifiLock");
            this.j = wifiLockCreateWifiLock;
            if (wifiLockCreateWifiLock != null) {
                wifiLockCreateWifiLock.acquire();
            }
        }
        ye4.a("SessionController", "Acquire partial wakelock");
        Object systemService2 = context.getSystemService("power");
        systemService2.getClass();
        byte b2 = 1;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService2).newWakeLock(1, "teamviewer:controller");
        wakeLockNewWakeLock.getClass();
        this.k = wakeLockNewWakeLock;
        wakeLockNewWakeLock.acquire();
        int i2 = ff4.q;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        df4 df4Var = lq1.a;
        ff4 ff4VarB = (df4Var == null ? new cr((byte) 24) : df4Var).b(applicationContext, this, du6Var);
        if (ff4VarB != null) {
            rl0 rl0Var = new rl0((qf4) ff4VarB, b2);
            y57.b = rl0Var;
            el7 el7Var = y57.a;
            if (el7Var != null) {
                el7Var.F0(rl0Var);
            }
            el7 el7Var2 = y57.a;
            if (el7Var2 == null || !el7Var2.G0) {
                bu7.MAIN.a(new jq(R.string.tv_connectingPleaseWait, new Object[0]));
            }
        }
        g71 g71Var = bCommandHandler.b;
        if (g71Var != null && g71Var != ff4VarB) {
            g71Var.destroy();
        }
        bCommandHandler.b = ff4VarB;
        if (bCommandHandler.a == null) {
            h10 h10Var = new h10(bCommandHandler);
            bCommandHandler.a = h10Var;
            h10Var.start();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    public final void a() {
        g71 g71Var;
        ye4.a("SessionController", "close");
        boolean z = this.e;
        this.e = true;
        if (z) {
            ye4.a.g("SessionController", "close called more than once");
            return;
        }
        PowerManager.WakeLock wakeLock = this.k;
        if (wakeLock.isHeld()) {
            ye4.a("SessionController", "Release partial wakelock");
            wakeLock.release();
        }
        WifiManager.WifiLock wifiLock = this.j;
        if (wifiLock != null) {
            if (!wifiLock.isHeld()) {
                wifiLock = null;
            }
            if (wifiLock != null) {
                wifiLock.release();
                this.j = null;
            }
        }
        boolean z2 = this.f;
        this.f = false;
        IAccountAndroid iAccountAndroidGetAccount = BackendContainerAndroid.GetInstance().GetAccount();
        EventHub eventHub = this.b;
        du6 du6Var = this.d;
        if (iAccountAndroidGetAccount != null) {
            if (iAccountAndroidGetAccount.IsLoggedIn()) {
                String str = du6Var.e;
                if (z2 && iAccountAndroidGetAccount.IsSessionCommentingEnabled()) {
                    he2 he2Var = new he2();
                    he2Var.c(EventParam.EP_COMMENT_SESSION_GUID, str);
                    he2Var.c(EventParam.EPARAM_BUDDY_ID, et1.D(du6Var));
                    eventHub.b(EventType.EVENT_COMMENT_SESSION, he2Var);
                }
            }
            BCommandHandler bCommandHandler = this.i;
            bCommandHandler.a();
            InterProcessGUIConnector.b = null;
            g71Var = bCommandHandler.b;
            if (g71Var != null) {
                g71Var.destroy();
            }
            bCommandHandler.b = null;
            NativeNetwork.a.a(du6Var.c);
            g(i41.C);
        }
        ye4.c("SessionController", "could not acquire Account");
        EventHub.e(eventHub, EventType.EVENT_COMMENT_SESSION_ENDED);
        BCommandHandler bCommandHandler2 = this.i;
        bCommandHandler2.a();
        InterProcessGUIConnector.b = null;
        g71Var = bCommandHandler2.b;
        if (g71Var != null) {
            g71Var.destroy();
        }
        bCommandHandler2.b = null;
        NativeNetwork.a.a(du6Var.c);
        g(i41.C);
    }

    public final void b() {
        ye4.c("SessionController", "negotiate failed");
        nm nmVar = this.n;
        nmVar.getClass();
        ArrayList arrayList = nmVar.a;
        for (WeakReference weakReference : lv0.P0(arrayList)) {
            Object obj = weakReference.get();
            if (obj != null) {
            } else {
                arrayList.remove(weakReference);
            }
        }
        au6 au6Var = this.a;
        au6Var.a.set(false);
        au6Var.a();
    }

    public final void c(mo7 mo7Var, ys6 ys6Var) {
        g(i41.B);
        ArrayList arrayList = this.n.a;
        for (WeakReference weakReference : lv0.P0(arrayList)) {
            Object obj = weakReference.get();
            if (obj != null) {
                ((o41) obj).a(mo7Var, ys6Var);
            } else {
                arrayList.remove(weakReference);
            }
        }
    }

    public final void d(mo7 mo7Var) {
        mo7Var.getClass();
        ye4.a("SessionController", "! connection barrier ssa passed !");
        nm nmVar = this.n;
        nmVar.getClass();
        ArrayList arrayList = nmVar.a;
        for (WeakReference weakReference : lv0.P0(arrayList)) {
            Object obj = weakReference.get();
            if (obj != null) {
                ((o41) obj).b(mo7Var);
            } else {
                arrayList.remove(weakReference);
            }
        }
    }

    public final void e(BCommandNativeImpl bCommandNativeImpl) {
        if (bCommandNativeImpl != null) {
            this.i.b(bCommandNativeImpl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, o.g71, o.mo7] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27, types: [o.u2] */
    public final void f(ze4 ze4Var) {
        du6 du6Var;
        ?? eu6Var;
        ss6 ss6Var;
        ss6 ss6Var2;
        this = this;
        du6 du6Var2 = this.d;
        int i = du6Var2.c;
        ye4.a("SessionController", "setAuthenticated " + ze4Var);
        int i2 = os6.a[ze4Var.ordinal()];
        byte b = 3;
        byte b2 = 2;
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                this.f = false;
                this.g(i41.v);
                this.a();
                return;
            } else {
                this.f = false;
                ye4.c("SessionController", "authentication error: " + ze4Var);
                this.g(i41.u);
                this.a();
                return;
            }
        }
        if (du6Var2.n) {
            BCommandNativeImpl bCommandNativeImpl = new BCommandNativeImpl(g10.ControlCommand, mc1.SwitchSecret.m);
            bCommandNativeImpl.d(l10.TeamViewerSessionID, i);
            NativeNetwork.a.b(bCommandNativeImpl);
        }
        ye4.a("SessionController", "create session");
        nf nfVar = vs1.d;
        if (nfVar != null) {
            RemoteControlApplication remoteControlApplication = (RemoteControlApplication) nfVar.g;
            d31 d31Var = (d31) nfVar.k;
            j93 j93Var = (j93) nfVar.j;
            fz4 fz4Var = (fz4) nfVar.b;
            xt6 xt6Var = (xt6) nfVar.c;
            ModularSessionType modularSessionType = du6Var2.t;
            if (im3.n(modularSessionType != null ? modularSessionType.GetUuidString() : null, PilotModularSessionType.GetModularSessionTypeUuidString())) {
                du6Var2.p = true;
                ss6Var = new ss6(yu6.ModularSessionAssistAR, fz4Var, this, xt6Var, du6Var2);
            } else {
                int i3 = lb5.a[du6Var2.a.ordinal()];
                if (i3 == 1) {
                    SharedPreferences sharedPreferences = h57.a;
                    if (sharedPreferences == null) {
                        im3.e0("sharedPreferences");
                        throw null;
                    }
                    sharedPreferences.getBoolean("KEY_FORCE_NATIVE_SESSION_RC", false);
                    du6Var = du6Var2;
                    this = this;
                    eu6Var = new eu6(this, xt6Var, (qi7) nfVar.d, (EventHub) nfVar.e, (Settings) nfVar.f, remoteControlApplication, (SharedPreferences) nfVar.h, (io.sentry.android.core.n1) nfVar.i, j93Var, d31Var);
                } else if (i3 != 2) {
                    if (i3 != 3) {
                        ss6Var2 = null;
                    } else {
                        du6Var2.p = true;
                        ss6Var = new ss6(yu6.RemoteSupport, fz4Var, this, xt6Var, du6Var2);
                    }
                    du6Var = du6Var2;
                    eu6Var = ss6Var2;
                } else {
                    SharedPreferences sharedPreferences2 = h57.a;
                    if (sharedPreferences2 == null) {
                        im3.e0("sharedPreferences");
                        throw null;
                    }
                    sharedPreferences2.getBoolean("KEY_FORCE_NATIVE_SESSION_FT", false);
                    this = this;
                    eu6Var = new et6(this, xt6Var, (EventHub) nfVar.e, (SharedPreferences) nfVar.h, (Settings) nfVar.f, j93Var, d31Var, remoteControlApplication);
                    du6Var = du6Var2;
                }
            }
            ss6Var2 = ss6Var;
            du6Var = du6Var2;
            eu6Var = ss6Var2;
        } else {
            du6Var = du6Var2;
            eu6Var = 0;
        }
        ye4 ye4Var = ye4.a;
        if (eu6Var == 0) {
            ye4.c("SessionController", "Session creation failed!");
            this.a();
        } else {
            ye4.a("SessionController", "Session " + du6Var.a + " created");
            ?? sb = new StringBuilder("dispatchSessionCreated: session=");
            sb.append(eu6Var);
            ye4Var.b("SessionController", sb.toString());
            Iterator it = this.a.b().iterator();
            while (it.hasNext()) {
                ((u2) it.next()).c(eu6Var);
            }
            BCommandHandler bCommandHandler = this.i;
            g71 g71Var = bCommandHandler.b;
            if (g71Var != null && g71Var != eu6Var) {
                g71Var.destroy();
            }
            bCommandHandler.b = eu6Var;
            if (eu6Var instanceof ss6) {
                ss6 ss6Var3 = (ss6) eu6Var;
                ss6 ss6Var4 = bCommandHandler.c;
                if (ss6Var4 != null && ss6Var4 != ss6Var3) {
                    ss6Var4.destroy();
                }
                bCommandHandler.c = ss6Var3;
            }
            el5 el5Var = ks6.n;
            mo4 mo4Var = new mo4(g10.SessionCommand, b, b2);
            mo4Var.d(l10.TeamViewerSessionID, i);
            mo4Var.d(fs6.ConnectionMode, du6Var.a.swigValue());
            ae aeVar = ae.g;
            if (aeVar == null) {
                aeVar = new ae((byte) 7);
                ae.g = aeVar;
            }
            mo4Var.d(fs6.RemoteLicense, aeVar.b);
            mo4Var.d(fs6.UsedLicense, du6Var.q);
            mo4Var.b(fs6.IsDirectLANConnection, du6Var.n ? (byte) 1 : (byte) 0);
            mo4Var.d(fs6.TimeOutSecs, du6Var.g);
            mo4Var.d(fs6.AllowToInteract, 1);
            mo4Var.f(fs6.LocalGUID, du6Var.e);
            mo4Var.d(fs6.RemoteOSType, du6Var.f657o.m);
            mo4Var.f(fs6.OwnParticipantName, this.c.b());
            NativeNetwork.a.b(mo4Var);
            if (!du6Var.p) {
                eu6Var.y();
            }
            eu6Var.start();
        }
        this.g(i41.t);
        uf0.G.k(du6Var.j);
        IAccountAndroid iAccountAndroidGetAccount = BackendContainerAndroid.GetInstance().GetAccount();
        if (iAccountAndroidGetAccount == null) {
            ye4.c("SessionController", "could not acquire Account");
        } else if (du6Var.c() && iAccountAndroidGetAccount.IsLoggedIn() && iAccountAndroidGetAccount.IsSessionLoggingEnabled()) {
            ye4Var.b("SessionController", "Creating common logs.");
            el5 el5Var2 = ks6.n;
            int i4 = du6Var.c;
            mo4 mo4Var2 = new mo4(g10.SessionCommand, (byte) 23, b2);
            mo4Var2.d(l10.TeamViewerSessionID, i4);
            mo4Var2.d(js6.AccountID, (int) iAccountAndroidGetAccount.GetAccountID());
            mo4Var2.d(js6.CompanyID, (int) iAccountAndroidGetAccount.GetCompanyID());
            dk7 dk7VarA = du6Var.a();
            if (dk7VarA != null) {
                mo4Var2.d(js6.SessionType, dk7VarA.m);
            }
            mo4Var2.f(js6.ParticipantSessionGuid, du6Var.e);
            mo4Var2.f(js6.CurrentUsername, "Android");
            mo4Var2.f(js6.PartnerBuddyName, et1.D(du6Var));
            NativeNetwork.a.b(mo4Var2);
            this.f = true;
            ye4Var.b("SessionController", "Sending logs.");
        }
        EventHub.e(this.b, EventType.EVENT_SESSION_AUTHENTICATION_SUCCESSFUL);
    }

    public final void g(i41 i41Var) {
        int iOrdinal = i41Var.ordinal();
        if (iOrdinal == 4) {
            ye4.a("SessionController", "! connection barrier mca passed !");
        } else if (iOrdinal == 6) {
            ye4.a("SessionController", "connection barrier hcc passed");
        } else if (iOrdinal == 10) {
            ye4.a("SessionController", "connection barrier abis passed");
        }
        this.a.f(this.d.c, i41Var, null);
    }
}
