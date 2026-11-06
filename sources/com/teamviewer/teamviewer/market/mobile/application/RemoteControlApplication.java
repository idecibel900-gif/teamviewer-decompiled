package com.teamviewer.teamviewer.market.mobile.application;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import com.teamviewer.activereviews.InAppReviewLauncher;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IStorageManagerUIModel;
import com.teamviewer.fcm.swig.NotificationType;
import com.teamviewer.inappreviews.swig.IInAppReviewStatisticsViewModel;
import com.teamviewer.inappreviews.swig.InAppReviewStatisticsViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.manager.LockManager;
import com.teamviewer.remotecontrollib.mru.ConnectionHistoryManager;
import com.teamviewer.remotecontrollib.swig.AccountViewModelBase;
import com.teamviewer.remotecontrollib.swig.AccountViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.AutoLoginViewModel;
import com.teamviewer.remotecontrollib.swig.AutoLoginViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.NSDDiscoveryWrapper;
import com.teamviewer.remotecontrollib.swig.NSDDiscoveryWrapperSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.CopyrightActivity;
import com.teamviewer.swigcallbacklib.StringSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.helper.StringCompareHelper;
import com.teamviewer.teamviewerlib.network.NativeNetwork;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvdiscovery.NSDDiscovery;
import com.teamviewer.teamviewerlib.swig.tvnetwork.INetworkControl;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import io.sentry.android.core.n1;
import io.sentry.android.core.performance.f;
import io.sentry.android.core.performance.g;
import java.util.ArrayList;
import java.util.Locale;
import o.a65;
import o.ae;
import o.af0;
import o.ai2;
import o.ar;
import o.ar5;
import o.au2;
import o.au6;
import o.au8;
import o.aw;
import o.b60;
import o.bt1;
import o.c36;
import o.c60;
import o.ca8;
import o.cg3;
import o.ct1;
import o.d11;
import o.d31;
import o.df6;
import o.di1;
import o.e41;
import o.el5;
import o.el7;
import o.ep1;
import o.ep3;
import o.et4;
import o.f84;
import o.fc1;
import o.fi7;
import o.fj3;
import o.ft8;
import o.fz4;
import o.g22;
import o.g57;
import o.gs;
import o.gv6;
import o.gz0;
import o.h57;
import o.hk0;
import o.hm3;
import o.hs;
import o.ia6;
import o.ik7;
import o.im3;
import o.io1;
import o.ir;
import o.it1;
import o.iu;
import o.j25;
import o.j41;
import o.j93;
import o.jk0;
import o.k6;
import o.ka6;
import o.kh;
import o.kh7;
import o.l25;
import o.l41;
import o.le5;
import o.ll2;
import o.lq1;
import o.m10;
import o.mu;
import o.n38;
import o.na7;
import o.nd8;
import o.nf;
import o.nv1;
import o.nx3;
import o.ok4;
import o.ol5;
import o.p12;
import o.pm8;
import o.pn5;
import o.q12;
import o.qi7;
import o.s7;
import o.se7;
import o.t11;
import o.tk1;
import o.tk2;
import o.tr1;
import o.u7;
import o.uf0;
import o.ve6;
import o.vl2;
import o.vn4;
import o.vp0;
import o.vs1;
import o.vt1;
import o.w26;
import o.wj5;
import o.wo1;
import o.wq6;
import o.xh2;
import o.xk0;
import o.xk1;
import o.xo1;
import o.xt6;
import o.y57;
import o.ye1;
import o.ye4;
import o.yh2;
import o.yi5;
import o.yq5;
import o.yt2;
import o.z60;
import o.zb8;
import o.zh2;
import o.zq5;
import o.zt6;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteControlApplication extends fi7 {
    public static final /* synthetic */ int G = 0;
    public z60 A;
    public nf B;
    public ye1 C;
    public NSDDiscovery D;
    public NSDDiscoveryWrapper E;
    public final fc1 F;
    public ep3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final kh7 f80o;
    public final kh7 p;
    public Settings q;
    public n1 r;
    public SharedPreferences s;
    public final kh7 t;
    public yi5 u;
    public s7 v;
    public u7 w;
    public ll2 x;
    public LockManager y;
    public ae z;

    public RemoteControlApplication() {
        this.m = Locale.getDefault();
        this.f80o = new kh7(new w26((byte) 7));
        this.p = new kh7(new w26((byte) 8));
        this.t = new kh7(new m10(this, (byte) 1));
        se7 se7VarA = g57.a();
        tk1 tk1Var = g22.a;
        this.F = hm3.c(xk0.G(se7VarA, ok4.a.r));
    }

    public static AudioAttributes e() {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setContentType(4);
        builder.setUsage(10);
        return builder.build();
    }

    public static xt6 f() {
        au6 au6Var = bt1.b;
        if (au6Var != null) {
            return au6Var;
        }
        im3.e0("instance");
        throw null;
    }

    @Override // o.fi7
    public final void b() {
        Object wq6Var;
        AutoLoginViewModel autoLoginViewModel;
        boolean z = false;
        xk1 xk1Var = new xk1((byte) 5, false);
        new n1(this, new pn5(d()), new ep3(d(), (byte) 22), new ep3(d(), (byte) 26), f());
        zh2 zh2Var = zh2.a;
        zh2.a(NotificationType.ChatMessageV1);
        zh2.a(NotificationType.DeviceConnectionAuthentication);
        zh2.a(NotificationType.MonitoringAlert);
        zh2.a(NotificationType.ConditionalAccessConnectionAuthentication);
        zh2.a(NotificationType.TrustedDeviceAuthentication);
        zh2.a(NotificationType.RemoveConditionalAccessConnectionAuthentication);
        ArrayList arrayList = yh2.a;
        vp0 vp0Var = new vp0(this);
        ArrayList arrayList2 = yh2.a;
        arrayList2.add(vp0Var);
        arrayList2.add(new tr1(this, xk1Var));
        arrayList2.add(new et4(this));
        arrayList2.add(new t11(this));
        arrayList2.add(new n38(this));
        arrayList2.add(new ka6(this));
        try {
            xh2.a(this);
        } catch (Exception e) {
            e41.s("could not initialize fcm lib: ", e.getMessage(), "FcmAvailabilityHelper");
        }
        if (xh2.a) {
            q12 q12Var = new q12(this);
            Object systemService = getSystemService("power");
            systemService.getClass();
            p12 p12Var = new p12((PowerManager) systemService, q12Var);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            registerReceiver(p12Var, intentFilter);
            wq6Var = q12Var;
        } else {
            wq6Var = new wq6(this);
        }
        SharedPreferences sharedPreferences = this.s;
        NSDDiscoveryWrapper nSDDiscoveryWrapper = null;
        if (sharedPreferences == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        boolean z2 = !sharedPreferences.getBoolean("KEY_EULA_ACCEPTED", false);
        u7 u7Var = this.w;
        if (u7Var == null) {
            im3.e0("activityManager");
            throw null;
        }
        pn5 pn5Var = new pn5(d());
        ep3 ep3Var = new ep3(d(), (byte) 22);
        iu iuVar = new iu(d());
        ep3 ep3Var2 = new ep3(d(), (byte) 26);
        NativeLibTvExt nativeLibTvExt = NativeLibTvExt.a;
        INetworkControl iNetworkControlB = nativeLibTvExt.b();
        nd8 nd8Var = new nd8();
        u7Var.getClass();
        ll2 ll2Var = new ll2();
        ll2Var.n = u7Var;
        ll2Var.f1375o = wq6Var;
        ll2Var.m = z2;
        k6 k6Var = new k6((Object) new fj3((Object) ll2Var, (byte) 16), (byte) (z ? 1 : 0));
        ll2Var.q = k6Var;
        kh7 kh7Var = l25.a;
        ye4 ye4Var = ye4.a;
        ye4Var.b("Network", "Initialize network");
        l25.d = nd8Var;
        l25.c = new ve6((j25) l25.b.getValue(), this);
        NativeNetwork.b = iNetworkControlB;
        pn5Var.q(ll2Var);
        ep3Var.f733o = ll2Var;
        if (!((EventHub) ep3Var.n).c(EventType.EVENT_SESSION_SHUTDOWN, (mu) ep3Var.p)) {
            ye4.c("SessionShutdownWatcher", "Could not register session shutdown listener!");
        }
        iuVar.p = ll2Var;
        if (!((EventHub) iuVar.f1103o).c(EventType.EVENT_TEAMVIEWER_APP_STARTED, (mu) iuVar.n)) {
            ye4.c("AppStartedWatcher", "Could not register application start listener!");
        }
        ep3Var2.f733o = ll2Var;
        if (!((EventHub) ep3Var2.n).c(EventType.EVENT_APP_TASK_REMOVED, (mu) ep3Var2.p)) {
            ye4.c("TaskRemovedWatcher", "Could not register task removed listener!");
        }
        xk1Var.n = ll2Var;
        long jAccountViewModelFactory_GetAutoLoginViewModel = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetAutoLoginViewModel();
        if (jAccountViewModelFactory_GetAutoLoginViewModel == 0) {
            autoLoginViewModel = null;
        } else {
            autoLoginViewModel = new AutoLoginViewModel();
            autoLoginViewModel.b = true;
            autoLoginViewModel.a = jAccountViewModelFactory_GetAutoLoginViewModel;
        }
        autoLoginViewModel.getClass();
        AutoLoginViewModelSWIGJNI.AutoLoginViewModel_StartAutoLogin(autoLoginViewModel.a, autoLoginViewModel);
        AccountViewModelBase accountViewModelBaseG = di1.g();
        accountViewModelBaseG.getClass();
        ll2Var.p = accountViewModelBaseG;
        accountViewModelBaseG.b(k6Var);
        this.x = ll2Var;
        u7 u7Var2 = this.w;
        if (u7Var2 == null) {
            im3.e0("activityManager");
            throw null;
        }
        ye4Var.b("ActivityManager", "TV app started");
        EventHub.e(u7Var2.a, EventType.EVENT_TEAMVIEWER_APP_STARTED);
        NSDDiscovery nSDDiscoveryA = nativeLibTvExt.a();
        this.D = nSDDiscoveryA;
        long jNSDDiscoveryWrapper_CreateInstance = NSDDiscoveryWrapperSWIGJNI.NSDDiscoveryWrapper_CreateInstance(NSDDiscovery.getCPtr(nSDDiscoveryA), nSDDiscoveryA);
        if (jNSDDiscoveryWrapper_CreateInstance != 0) {
            nSDDiscoveryWrapper = new NSDDiscoveryWrapper();
            nSDDiscoveryWrapper.b = true;
            nSDDiscoveryWrapper.a = jNSDDiscoveryWrapper_CreateInstance;
        }
        nSDDiscoveryWrapper.getClass();
        this.E = nSDDiscoveryWrapper;
        this.B = new nf(nSDDiscoveryWrapper, this);
        lq1.a = new nx3((Object) new d31(this), (byte) 13);
    }

    @Override // o.fi7
    public final void c() {
        byte b;
        bt1.a = new ir((byte) 13);
        nv1.d = new yi5((byte) 5);
        ct1.a = new xk1((byte) 8);
        SharedPreferences sharedPreferences = h57.a;
        if (sharedPreferences == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        this.s = sharedPreferences;
        synchronized (el7.H0) {
            b = 1;
            if (!el7.I0) {
                el7.I0 = true;
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("dialogId", ik7.a());
                el7 el7Var = new el7();
                el7Var.u0(bundle);
                y57.a = el7Var;
            }
        }
        d31 d31Var = new d31(this);
        bt1.b = new au6(this, d(), d31Var);
        this.q = Settings.i.n();
        n1 n1Var = n1.q;
        if (n1Var == null) {
            im3.e0("instance");
            throw null;
        }
        this.r = n1Var;
        yi5 yi5Var = nv1.d;
        if (yi5Var == null) {
            im3.e0("dialogFactory");
            throw null;
        }
        this.u = yi5Var;
        this.v = new s7();
        s7 s7Var = u7.g;
        this.w = vn4.g0();
        this.z = new ae(this);
        StringCompareHelper.a.a();
        xt6 xt6VarF = f();
        EventHub eventHubD = d();
        SharedPreferences sharedPreferences2 = h57.a;
        if (sharedPreferences2 == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        l41 l41Var = (l41) this.t.getValue();
        eventHubD.getClass();
        l41Var.getClass();
        new a65(this, xt6VarF, eventHubD, sharedPreferences2);
        new wj5(xt6VarF);
        ((zt6) xt6VarF).d(new ia6(new el5((byte) 7), b));
        new j93(xt6VarF);
        fz4 fz4Var = new fz4(this, l41Var, sharedPreferences2);
        long jAccountViewModelFactory_GetAccountViewModel = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetAccountViewModel();
        AccountViewModelBase accountViewModelBase = jAccountViewModelFactory_GetAccountViewModel == 0 ? null : new AccountViewModelBase(jAccountViewModelFactory_GetAccountViewModel);
        accountViewModelBase.getClass();
        new ConnectionHistoryManager(xt6VarF, eventHubD, l41Var, accountViewModelBase);
        xt6 xt6VarF2 = f();
        qi7 qi7Var = (qi7) this.f80o.getValue();
        EventHub eventHubD2 = d();
        Settings settings = this.q;
        if (settings == null) {
            im3.e0("settings");
            throw null;
        }
        SharedPreferences sharedPreferences3 = this.s;
        if (sharedPreferences3 == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        n1 n1Var2 = this.r;
        if (n1Var2 == null) {
            im3.e0("memoryUseManager");
            throw null;
        }
        vs1.d = new nf(fz4Var, xt6VarF2, qi7Var, eventHubD2, settings, this, sharedPreferences3, n1Var2, new j93(this), d31Var);
        ae aeVar = this.z;
        if (aeVar == null) {
            im3.e0("activityManagerNew");
            throw null;
        }
        SharedPreferences sharedPreferences4 = this.s;
        if (sharedPreferences4 == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        LockManager lockManager = new LockManager(aeVar, this, sharedPreferences4);
        this.y = lockManager;
        SharedPreferences sharedPreferences5 = this.s;
        if (sharedPreferences5 != null) {
            this.A = new z60(lockManager, this, sharedPreferences5);
        } else {
            im3.e0("sharedPreferences");
            throw null;
        }
    }

    public final EventHub d() {
        return (EventHub) this.p.getValue();
    }

    @Override // o.fi7, android.app.Application
    public final void onCreate() {
        Context applicationContext;
        IInAppReviewStatisticsViewModel iInAppReviewStatisticsViewModel;
        cg3 cg3Var;
        c60 ft8Var;
        f fVar = f.L;
        long jUptimeMillis = SystemClock.uptimeMillis();
        f fVarC = f.c();
        g gVar = fVarC.r;
        if (gVar.f123o == 0) {
            gVar.f(jUptimeMillis);
            fVarC.h(this);
        }
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        jk0 jk0Var = jk0.s;
        Context applicationContext3 = applicationContext2.getApplicationContext();
        synchronized (jk0Var) {
            if (applicationContext3 != null) {
                try {
                    applicationContext = applicationContext3.getApplicationContext();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                applicationContext = null;
            }
            jk0.t = applicationContext;
        }
        super.onCreate();
        gs gsVar = hs.m;
        int i = zb8.a;
        IStorageManagerUIModel iStorageManagerUIModelGetStorageManagerUIModel = ChatUIModelLocatorAndroid.GetStorageManagerUIModel();
        iStorageManagerUIModelGetStorageManagerUIModel.getClass();
        new na7(this, iStorageManagerUIModelGetStorageManagerUIModel);
        if (this.q == null) {
            im3.e0("settings");
            throw null;
        }
        gv6 gv6Var = gv6.USER;
        ca8 ca8Var = ca8.P_BUDDY_LOGINFLAGS;
        int iB = Settings.b(gv6Var, ca8Var);
        int i2 = af0.n.m;
        if ((iB & i2) == 0) {
            int i3 = iB | i2;
            if (this.q == null) {
                im3.e0("settings");
                throw null;
            }
            Settings.j(gv6Var, ca8Var, i3);
        }
        xt6 xt6VarF = f();
        EventHub eventHubD = d();
        u7 u7Var = this.w;
        if (u7Var == null) {
            im3.e0("activityManager");
            throw null;
        }
        SharedPreferences sharedPreferences = h57.a;
        if (sharedPreferences == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        LockManager lockManager = this.y;
        if (lockManager == null) {
            im3.e0("lockManager");
            throw null;
        }
        yt2 yt2Var = new yt2(lockManager, this);
        z60 z60Var = this.A;
        if (z60Var == null) {
            im3.e0("biometricProtectionPromotionViewManager");
            throw null;
        }
        long jInAppReviewStatisticsViewModelFactory_GetInAppReviewStatisticsViewModel = InAppReviewStatisticsViewModelFactorySWIGJNI.InAppReviewStatisticsViewModelFactory_GetInAppReviewStatisticsViewModel();
        byte b = 1;
        if (jInAppReviewStatisticsViewModelFactory_GetInAppReviewStatisticsViewModel == 0) {
            iInAppReviewStatisticsViewModel = null;
        } else {
            IInAppReviewStatisticsViewModel iInAppReviewStatisticsViewModel2 = new IInAppReviewStatisticsViewModel();
            iInAppReviewStatisticsViewModel2.b = true;
            iInAppReviewStatisticsViewModel2.a = jInAppReviewStatisticsViewModelFactory_GetInAppReviewStatisticsViewModel;
            iInAppReviewStatisticsViewModel = iInAppReviewStatisticsViewModel2;
        }
        iInAppReviewStatisticsViewModel.getClass();
        eventHubD.getClass();
        f84 f84Var = new f84(this);
        LicenseViewModel licenseViewModelH = di1.h();
        LicenseViewModelSWIGJNI.LicenseViewModel_RegisterForAccountLicenseActivatedInfo(licenseViewModelH.a, licenseViewModelH, StringSignalCallback.getCPtr((StringSignalCallback) f84Var), f84Var);
        nx3 nx3Var = new nx3(u7Var);
        tk2 tk2Var = new tk2(this, xt6VarF, eventHubD);
        sharedPreferences.getClass();
        pn5 pn5Var = new pn5();
        pn5Var.m = eventHubD;
        ((zt6) xt6VarF).m.add(new j41(pn5Var, (byte) 0));
        pn5Var.n = eventHubD;
        pn5Var.f1752o = this;
        pn5Var.p = sharedPreferences;
        ((zt6) xt6VarF).m.add(new j41(pn5Var, b));
        this.n = new ep3(nx3Var, tk2Var, pn5Var, new InAppReviewLauncher(xt6VarF, eventHubD, u7Var, this, sharedPreferences, iInAppReviewStatisticsViewModel), yt2Var, z60Var, licenseViewModelH, f84Var);
        kh.f0 = new df6((Object) au8.l(0, 7, null), (byte) 26);
        SharedPreferences sharedPreferences2 = this.s;
        if (sharedPreferences2 == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        Settings settings = this.q;
        if (settings == null) {
            im3.e0("settings");
            throw null;
        }
        EventHub eventHubD2 = d();
        yi5 yi5Var = this.u;
        if (yi5Var == null) {
            im3.e0("dialogUtilsInterface");
            throw null;
        }
        xt6 xt6VarF2 = f();
        l41 l41Var = (l41) this.t.getValue();
        l41 l41Var2 = (l41) this.t.getValue();
        s7 s7Var = this.v;
        if (s7Var == null) {
            im3.e0("rcLocalConstraints");
            throw null;
        }
        ep3 ep3Var = this.n;
        ep3Var.getClass();
        n1 n1Var = n1.q;
        if (n1Var == null) {
            im3.e0("instance");
            throw null;
        }
        LockManager lockManager2 = this.y;
        if (lockManager2 == null) {
            im3.e0("lockManager");
            throw null;
        }
        z60 z60Var2 = this.A;
        if (z60Var2 == null) {
            im3.e0("biometricProtectionPromotionViewManager");
            throw null;
        }
        qi7 qi7Var = (qi7) this.f80o.getValue();
        NSDDiscoveryWrapper nSDDiscoveryWrapper = this.E;
        if (nSDDiscoveryWrapper == null) {
            im3.e0("discoveryWrapper");
            throw null;
        }
        nf nfVar = this.B;
        if (nfVar == null) {
            im3.e0("nsdDiscoveryAPI");
            throw null;
        }
        c36 c36Var = new c36(this, sharedPreferences2, settings, eventHubD2, yi5Var, xt6VarF2, l41Var, l41Var2, s7Var, ep3Var, n1Var, lockManager2, z60Var2, qi7Var, nSDDiscoveryWrapper, nfVar);
        zu1.c = c36Var;
        vt1.c = new au2(this, sharedPreferences2, eventHubD2, c36Var.p, xt6VarF2, s7Var, ep3Var, n1Var, l41Var2, qi7Var);
        byte b2 = 0;
        io1.c = new el5(b2);
        SharedPreferences sharedPreferences3 = this.s;
        if (sharedPreferences3 == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        ll2 ll2Var = this.x;
        if (ll2Var == null) {
            im3.e0("networkController");
            throw null;
        }
        yt2 yt2Var2 = new yt2(sharedPreferences3, ll2Var);
        byte b3 = 17;
        nv1.b = new yt2(this, yt2Var2, b3);
        nv1.c = new wj5(b2);
        xo1.a = new aw(b3);
        pm8.w = new aw((byte) 1);
        it1.c = new ep3((l41) this.t.getValue(), f(), this);
        wo1.f = new wj5((byte) 6);
        EventHub eventHubD3 = d();
        m10 m10Var = new m10(this, (byte) 2);
        le5 le5Var = new le5((byte) 12);
        eventHubD3.getClass();
        d11 d11Var = new d11();
        d11Var.m = this;
        d11Var.n = eventHubD3;
        d11Var.f578o = m10Var;
        d11Var.p = le5Var;
        byte b4 = 4;
        mu muVar = new mu(d11Var, b4);
        d11Var.q = muVar;
        d11Var.r = new vl2(d11Var);
        if (l25.b()) {
            d11Var.D();
        } else if (!eventHubD3.c(EventType.EVENT_KEEP_ALIVE_STATE_CHANGED, muVar)) {
            ye4.c("FirebaseInitManager", "register KeepAlive state change listener failed");
        }
        uf0.G = new ol5(b4);
        CopyrightActivity.H = new int[]{R.raw.aboutlibraries, R.raw.conanlibs};
        if (cg3.i != null) {
            cg3Var = cg3.i;
            cg3Var.getClass();
        } else {
            synchronized (cg3.class) {
                try {
                    if (cg3.i == null) {
                        cg3.i = new cg3(this);
                    }
                    cg3Var = cg3.i;
                    cg3Var.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (((c60) cg3Var.g) != null) {
            hk0.l("Billing client is already initialised");
            return;
        }
        RemoteControlApplication remoteControlApplication = (RemoteControlApplication) cg3Var.a;
        b60 b60Var = new b60(remoteControlApplication);
        b60Var.c = new ar(cg3Var, (byte) 11);
        b60Var.a = new aw((byte) 29);
        b60Var.d = true;
        b60Var.e = true;
        if (b60Var.c == null) {
            if (!b60Var.d) {
                hk0.g("Please provide a valid listener for purchases updates.");
                return;
            }
            ft8Var = b60Var.a() ? new ft8(remoteControlApplication, b60Var) : new c60(remoteControlApplication, b60Var);
        } else {
            if (b60Var.a == null) {
                hk0.g("Pending purchases for one-time products must be supported.");
                return;
            }
            b60Var.a.getClass();
            ar arVar = b60Var.c;
            aw awVar = b60Var.a;
            if (arVar != null) {
                ar arVar2 = b60Var.c;
                ft8Var = b60Var.a() ? new ft8(awVar, remoteControlApplication, arVar2, b60Var) : new c60(awVar, remoteControlApplication, arVar2, b60Var);
            } else {
                ft8Var = b60Var.a() ? new ft8(awVar, remoteControlApplication, b60Var) : new c60(awVar, remoteControlApplication, b60Var);
            }
        }
        cg3Var.g = ft8Var;
        ft8Var.e((xk1) cg3Var.h);
        SharedPreferences sharedPreferences4 = this.s;
        if (sharedPreferences4 == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        wj5 wj5Var = new wj5((byte) 9);
        ep1.m(sharedPreferences4, "KEY_SHOW_CAMERA_PERMISSION_SNACKBAR", false);
        ep1.m(sharedPreferences4, "KEY_SHOW_AUDIO_PERMISSION_SNACKBAR", false);
        ep1.m(sharedPreferences4, "KEY_IS_SESSION_MINIMIZE_SCREEN_MODE_ENABLED", false);
        ep1.m(sharedPreferences4, "CRASH_OCCURED", false);
        ep1.m(sharedPreferences4, "KEY_PLANE_AND_FEATURE_POINTS_VISIBILITY", false);
        ep1.m(sharedPreferences4, "KEY_SHOULD_SHOW_INTRO_THIS_TIME", true);
        ep1.m(sharedPreferences4, "KEY_SHOULD_SHOW_MESSAGE_WHEN_MARKING_FAILED", true);
        ep1.m(sharedPreferences4, "KEY_ARCORE_SUPPORTED", false);
        byte b5 = 27;
        gz0 gz0Var = new gz0(b5);
        ar5 ar5Var = ar5.n;
        new pn5(sharedPreferences4, "KEY_SERVICE_TERMS_REVISION", "", gz0Var, ar5Var);
        new pn5(sharedPreferences4, "KEY_SERVICE_TERMS_CONFIG_ID", "", new gz0(b5), ar5Var);
        ep1.m(sharedPreferences4, "KEY_SERVICE_TERMS_AVAILABLE", false);
        ep1.m(sharedPreferences4, "KEY_EULA_ACCEPTED", false);
        ep1.m(sharedPreferences4, "KEY_CRASH_REPORT", true);
        ep1.m(sharedPreferences4, "KEY_SHOULD_READ_CLIPBOARD", true);
        ep1.m(sharedPreferences4, "KEY_SHOULD_SHOW_TEXT_RECOGNITION_PRIVACY_POPUP", true);
        ep1.m(sharedPreferences4, "KEY_MICROPHONE_DEFAULT_STATE", true);
        ep1.m(sharedPreferences4, "KEY_SHOW_CHAT_PREVIEW", true);
        ep1.m(sharedPreferences4, "KEY_SHOW_ARROW_MARKING_INTRO", true);
        ep1.m(sharedPreferences4, "KEY_SHOW_DRAWING_SHAPE_MARKING_INTRO", true);
        ep1.m(sharedPreferences4, "KEY_SHOW_POINTER_MARKING_INTRO", true);
        ep1.m(sharedPreferences4, "KEY_SHOW_ADVANCED_SETTINGS", false);
        ep1.m(sharedPreferences4, "KEY_ADVANCED_SHOW_IN_SESSION_STATS", false);
        ep1.m(sharedPreferences4, "KEY_ADVANCED_FORCE_COMPATIBLITY_MODE", false);
        ep1.m(sharedPreferences4, "KEY_ADVANCED_ENABLE_SHAPE_DETECTION", false);
        ep1.m(sharedPreferences4, "KEY_ADVANCED_ENABLE_INSTANT_PLACEMENT", false);
        ep1.m(sharedPreferences4, "KEY_ADVANCED_ENABLE_EIS", false);
        ep1.m(sharedPreferences4, "KEY_ADVANCED_USE_SIMULCAST", true);
        new pn5(sharedPreferences4, "KEY_PRESELECTED_MARKING_ACTION", 2, yq5.n, zq5.n);
        ep1.m(sharedPreferences4, "KEY_CHAT_TRANSLATION_DIALOG_NEVER_AGAIN", false);
        wj5.n = wj5Var;
        new nx3(this.F);
        f.d(this);
    }

    @Override // o.fi7, android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        cg3 cg3Var = cg3.i;
        if (cg3Var != null) {
            hm3.f((fc1) cg3Var.b, null);
            c60 c60Var = (c60) cg3Var.g;
            if (c60Var != null) {
                c60Var.a();
            }
            cg3Var.g = null;
        }
        cg3.i = null;
        ye1 ye1Var = this.C;
        if (ye1Var != null) {
            ye1Var.close();
        }
        u7 u7Var = u7.h;
        if (u7Var != null) {
            u7Var.a.f(u7Var.f);
            u7Var.c = null;
            u7Var.d = null;
            u7Var.b = null;
            u7.h = null;
            ye4.a("ActivityManager", "destroyed");
        }
        hm3.f(ai2.a, null);
    }
}
