package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrollib.manager.LockManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k41 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k41(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Object value;
        Object value2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                l41 l41Var = (l41) obj;
                if (!im3.n(str, "REMEMBER_HISTORY_PASSWORD") || sharedPreferences.getBoolean("REMEMBER_HISTORY_PASSWORD", false)) {
                    return;
                }
                synchronized (l41Var.b) {
                    for (h41 h41Var : l41Var.b) {
                        if (h41Var != null) {
                            h41Var.a = "";
                        }
                    }
                }
                return;
            case 1:
                LockManager lockManager = (LockManager) obj;
                if (im3.n(str, "lock_enabled") && sharedPreferences.getBoolean("lock_enabled", false)) {
                    lockManager.c = Long.MAX_VALUE;
                    return;
                }
                return;
            case 2:
                l97 l97Var = ((hw6) obj).x;
                if (str != null && str.hashCode() == 1807457325 && str.equals("lock_enabled")) {
                    do {
                        value2 = l97Var.getValue();
                    } while (!l97Var.j(value2, dw6.a((dw6) value2, false, false, false, false, false, false, sharedPreferences.getBoolean("lock_enabled", false), false, false, null, false, false, false, 32703)));
                }
                if (str != null && str.hashCode() == -387603201 && str.equals("lock_timeout_value")) {
                    do {
                        value = l97Var.getValue();
                    } while (!l97Var.j(value, dw6.a((dw6) value, false, false, false, false, false, false, false, false, false, sharedPreferences.getString("lock_timeout_value", "0"), false, false, false, 30719)));
                    return;
                }
                return;
            default:
                fy6.c((fy6) obj, str);
                return;
        }
    }
}
