package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrollib.manager.LockManager;
import com.teamviewer.remotecontrollib.swig.IBiometricsStatisticsViewModel;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;

/* JADX INFO: loaded from: classes.dex */
public final class hw6 extends oe8 {
    public final yf5 A;
    public final bg5 B;
    public final eo1 C;
    public final LogoutViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LicenseViewModel f1014o;
    public final SharedPreferences p;
    public final Settings q;
    public final LockManager r;
    public final IBiometricsStatisticsViewModel s;
    public final wf3 t;
    public final xt6 u;
    public final l97 v;
    public final t36 w;
    public final l97 x;
    public final k41 y;
    public final t36 z;

    public hw6(LogoutViewModel logoutViewModel, LicenseViewModel licenseViewModel, SharedPreferences sharedPreferences, Settings settings, LockManager lockManager, IBiometricsStatisticsViewModel iBiometricsStatisticsViewModel, wf3 wf3Var, xt6 xt6Var) {
        sharedPreferences.getClass();
        settings.getClass();
        lockManager.getClass();
        this.n = logoutViewModel;
        this.f1014o = licenseViewModel;
        this.p = sharedPreferences;
        this.q = settings;
        this.r = lockManager;
        this.s = iBiometricsStatisticsViewModel;
        this.t = wf3Var;
        this.u = xt6Var;
        eg3 eg3Var = eg3.m;
        l97 l97VarK = im3.k(eg3Var);
        this.v = l97VarK;
        this.w = yo1.u(l97VarK);
        boolean z = logoutViewModel != null && LogoutViewModelSWIGJNI.LogoutViewModel_IsEnabled(logoutViewModel.c, logoutViewModel);
        ca8 ca8Var = ca8.P_REMOTE_REMOTECURSOR;
        gv6 gv6Var = gv6.USER;
        boolean zA = Settings.a(gv6Var, ca8Var);
        boolean zA2 = Settings.a(gv6Var, ca8.P_REMOTE_REMOVEWALLPAPER);
        boolean z2 = sharedPreferences.getBoolean("useUDP", true);
        boolean z3 = sharedPreferences.getBoolean("REMEMBER_HISTORY_PASSWORD", false);
        boolean zA3 = Settings.a(gv6Var, ca8.P_REMOTEAUDIO_RECEIVE_ENABLED);
        boolean z4 = sharedPreferences.getBoolean("lock_enabled", false);
        boolean z5 = sharedPreferences.getBoolean("VERBOSE_LOGGING", false);
        boolean z6 = !lockManager.a();
        boolean z7 = !(new iu(new t60(lockManager.a)).g() == 12);
        String string = lockManager.b.getString("lock_timeout_value", "0");
        l97 l97VarK2 = im3.k(new dw6(z, zA, z3, z2, zA2, zA3, z4, "", z5, z6, z7, string == null ? "0" : string, sharedPreferences.getBoolean("KEY_FORCE_NATIVE_SESSION_RC", false), sharedPreferences.getBoolean("KEY_FORCE_NATIVE_SESSION_FT", false), sharedPreferences.getBoolean("KEY_ENABLE_RC_REDESIGNED_DEVICE_TAB", true)));
        this.x = l97VarK2;
        this.y = new k41(this, (byte) 2);
        this.z = yo1.u(l97VarK2);
        this.A = new yf5(0);
        this.B = h57.p(Boolean.FALSE);
        this.C = d57.b(new y26(this, (byte) 17));
        V0();
        zv6 zv6Var = new zv6(this, (byte) 7);
        wf3Var.f = zv6Var;
        cg3 cg3Var = wf3Var.a;
        if ((cg3Var != null ? (c60) cg3Var.g : null) == null) {
            zv6Var.invoke(eg3Var);
            return;
        }
        IInAppPurchaseViewModel iInAppPurchaseViewModel = wf3Var.b;
        wf3Var.g = IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_IsAccountLoggedIn(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel);
        wf3Var.h = IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_DoesAccountNeedALicense(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel);
        wf3Var.f();
        if (!wf3Var.c.c(EventType.EVENT_IN_APP_PURCHASE_COMPLETED, wf3Var.k)) {
            ye4.c("InAppPurchaseFeatureStateProvider", "Could not register in-app purchase complete listener!");
        }
        VoidSignalCallback voidSignalCallback = wf3Var.i;
        IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_RegisterForLoginChanges(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        VoidSignalCallback voidSignalCallback2 = wf3Var.j;
        IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_RegisterLicenseStateChanges(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
    }

    @Override // o.oe8
    public final void U0() {
        LogoutViewModel logoutViewModel = this.n;
        if (logoutViewModel != null) {
            logoutViewModel.c();
        }
        LicenseViewModel licenseViewModel = this.f1014o;
        if (licenseViewModel != null) {
            licenseViewModel.a();
        }
        this.t.a();
        this.s.a();
        this.p.unregisterOnSharedPreferenceChangeListener(this.y);
    }

    public final void V0() {
        l97 l97Var;
        Object value;
        k41 k41Var = this.y;
        SharedPreferences sharedPreferences = this.p;
        sharedPreferences.registerOnSharedPreferenceChangeListener(k41Var);
        do {
            l97Var = this.x;
            value = l97Var.getValue();
        } while (!l97Var.j(value, dw6.a((dw6) value, false, false, false, false, false, false, sharedPreferences.getBoolean("lock_enabled", false), false, false, sharedPreferences.getString("lock_timeout_value", "0"), false, false, false, 30655)));
    }
}
