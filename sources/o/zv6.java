package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrollib.manager.LockManager;
import com.teamviewer.remotecontrollib.swig.IBiometricsStatisticsViewModel;
import com.teamviewer.remotecontrollib.swig.IBiometricsStatisticsViewModelSWIGJNI;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zv6 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ hw6 n;

    public /* synthetic */ zv6(hw6 hw6Var, byte b) {
        this.m = b;
        this.n = hw6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        gv6 gv6Var = gv6.USER;
        f88 f88Var = f88.a;
        hw6 hw6Var = this.n;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    IStatisticsHandler iStatisticsHandler = ga7.a;
                    ga7.a(ew6.OnEnableAdvancedLogging);
                } else {
                    IStatisticsHandler iStatisticsHandler2 = ga7.a;
                    ga7.a(ew6.OnDisableAdvancedLogging);
                }
                fx3.q(hw6Var.p, "VERBOSE_LOGGING", zBooleanValue);
                ye4.a.h(zBooleanValue);
                l97 l97Var = hw6Var.x;
                dw6 dw6Var = (dw6) l97Var.getValue();
                dw6Var.getClass();
                l97Var.l(null, dw6.a(dw6Var, false, false, false, false, false, false, false, zBooleanValue, false, null, false, false, false, 32511));
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (zBooleanValue2) {
                    IStatisticsHandler iStatisticsHandler3 = ga7.a;
                    ga7.a(ew6.OnEnableRemoteCursor);
                } else {
                    IStatisticsHandler iStatisticsHandler4 = ga7.a;
                    ga7.a(ew6.OnDisableRemoteCursor);
                }
                Settings settings = hw6Var.q;
                ca8 ca8Var = ca8.P_REMOTE_REMOTECURSOR;
                settings.getClass();
                Settings.k(gv6Var, ca8Var, zBooleanValue2);
                l97 l97Var2 = hw6Var.x;
                dw6 dw6Var2 = (dw6) l97Var2.getValue();
                dw6Var2.getClass();
                l97Var2.l(null, dw6.a(dw6Var2, false, zBooleanValue2, false, false, false, false, false, false, false, null, false, false, false, 32765));
                break;
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                if (zBooleanValue3) {
                    IStatisticsHandler iStatisticsHandler5 = ga7.a;
                    ga7.a(ew6.OnEnableHideWallpaper);
                } else {
                    IStatisticsHandler iStatisticsHandler6 = ga7.a;
                    ga7.a(ew6.OnDisableHideWallpaper);
                }
                Settings settings2 = hw6Var.q;
                ca8 ca8Var2 = ca8.P_REMOTE_REMOVEWALLPAPER;
                settings2.getClass();
                Settings.k(gv6Var, ca8Var2, zBooleanValue3);
                l97 l97Var3 = hw6Var.x;
                dw6 dw6Var3 = (dw6) l97Var3.getValue();
                dw6Var3.getClass();
                l97Var3.l(null, dw6.a(dw6Var3, false, false, false, false, zBooleanValue3, false, false, false, false, null, false, false, false, 32751));
                mo7 mo7Var = ((zt6) hw6Var.u).f;
                ec3 ec3Var = mo7Var instanceof ec3 ? (ec3) mo7Var : null;
                if (ec3Var != null) {
                    ha6 ha6Var = ((a2) ec3Var).f283o;
                    ry5 ry5Var = ha6Var.j;
                    if (ry5Var.d != zBooleanValue3) {
                        ry5Var.d = zBooleanValue3;
                        ha6Var.a.b();
                    }
                } else {
                    ye4.c("SettingsViewModel", "setWallpaperSwitchState: Session is null");
                }
                break;
            case 3:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                if (zBooleanValue4) {
                    IStatisticsHandler iStatisticsHandler7 = ga7.a;
                    ga7.a(ew6.OnEnableUDP);
                } else {
                    IStatisticsHandler iStatisticsHandler8 = ga7.a;
                    ga7.a(ew6.OnDisableUDP);
                }
                fx3.q(hw6Var.p, "useUDP", zBooleanValue4);
                l97 l97Var4 = hw6Var.x;
                dw6 dw6Var4 = (dw6) l97Var4.getValue();
                dw6Var4.getClass();
                l97Var4.l(null, dw6.a(dw6Var4, false, false, false, zBooleanValue4, false, false, false, false, false, null, false, false, false, 32759));
                break;
            case 4:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                if (zBooleanValue5) {
                    IStatisticsHandler iStatisticsHandler9 = ga7.a;
                    ga7.a(ew6.OnEnableAudio);
                } else {
                    IStatisticsHandler iStatisticsHandler10 = ga7.a;
                    ga7.a(ew6.OnDisableAudio);
                }
                Settings settings3 = hw6Var.q;
                ca8 ca8Var3 = ca8.P_REMOTEAUDIO_RECEIVE_ENABLED;
                settings3.getClass();
                Settings.k(gv6Var, ca8Var3, zBooleanValue5);
                l97 l97Var5 = hw6Var.x;
                dw6 dw6Var5 = (dw6) l97Var5.getValue();
                dw6Var5.getClass();
                l97Var5.l(null, dw6.a(dw6Var5, false, false, false, false, false, zBooleanValue5, false, false, false, null, false, false, false, 32735));
                break;
            case 5:
                LockManager lockManager = hw6Var.r;
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                if (zBooleanValue6) {
                    IStatisticsHandler iStatisticsHandler11 = ga7.a;
                    ga7.a(ew6.OnEnableBiometrics);
                } else {
                    IStatisticsHandler iStatisticsHandler12 = ga7.a;
                    ga7.a(ew6.OnDisableBiometrics);
                }
                l97 l97Var6 = hw6Var.x;
                if (!zBooleanValue6 || lockManager.a()) {
                    SharedPreferences sharedPreferences = hw6Var.p;
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.getClass();
                    editorEdit.putBoolean("lock_enabled", zBooleanValue6);
                    editorEdit.apply();
                    dw6 dw6Var6 = (dw6) l97Var6.getValue();
                    dw6Var6.getClass();
                    l97Var6.l(null, dw6.a(dw6Var6, false, false, false, false, false, false, zBooleanValue6, false, false, null, false, false, false, 32703));
                    String string = sharedPreferences.getString("lock_timeout_value", "0");
                    if (string != null) {
                        int i = Integer.parseInt(string);
                        IBiometricsStatisticsViewModel iBiometricsStatisticsViewModel = hw6Var.s;
                        IBiometricsStatisticsViewModelSWIGJNI.IBiometricsStatisticsViewModel_ReportEvent(iBiometricsStatisticsViewModel.a, iBiometricsStatisticsViewModel, zBooleanValue6, i);
                    }
                    hw6Var.V0();
                } else if (!lockManager.a()) {
                    lockManager.e = true;
                }
                dw6 dw6Var7 = (dw6) l97Var6.getValue();
                dw6Var7.getClass();
                l97Var6.l(null, dw6.a(dw6Var7, false, false, false, false, false, false, false, false, !lockManager.a(), null, false, false, false, 32255));
                break;
            case 6:
                boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                if (zBooleanValue7) {
                    IStatisticsHandler iStatisticsHandler13 = ga7.a;
                    ga7.a(ew6.OnEnableSavePasswords);
                } else {
                    IStatisticsHandler iStatisticsHandler14 = ga7.a;
                    ga7.a(ew6.OnDisableSavePasswords);
                }
                fx3.q(hw6Var.p, "REMEMBER_HISTORY_PASSWORD", zBooleanValue7);
                l97 l97Var7 = hw6Var.x;
                dw6 dw6Var8 = (dw6) l97Var7.getValue();
                dw6Var8.getClass();
                l97Var7.l(null, dw6.a(dw6Var8, false, false, zBooleanValue7, false, false, false, false, false, false, null, false, false, false, 32763));
                break;
            default:
                eg3 eg3Var = (eg3) obj;
                eg3Var.getClass();
                l97 l97Var8 = hw6Var.v;
                l97Var8.getClass();
                l97Var8.l(null, eg3Var);
                break;
        }
        return f88Var;
    }
}
