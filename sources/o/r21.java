package o;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.TransactionTooLargeException;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r21 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ y31 n;

    public /* synthetic */ r21(y31 y31Var, byte b) {
        this.m = b;
        this.n = y31Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        p31 p31Var;
        Object value2;
        p31 p31Var2;
        Object value3;
        p31 p31Var3;
        boolean z;
        byte b = this.m;
        PackageInfo packageInfoG = null;
        Object[] objArr = 0;
        f88 f88Var = f88.a;
        y31 y31Var = this.n;
        switch (b) {
            case 0:
                z31 z31Var = (z31) obj;
                z31Var.getClass();
                String str = z31Var.d;
                hs1 hs1Var = z31Var.m;
                boolean z2 = z31Var.j == b41.m;
                str.getClass();
                y31 y31Var2 = this.n;
                gu0 gu0VarN = e8.n(y31Var2);
                tk1 tk1Var = g22.a;
                im3.R(gu0VarN, gk1.f901o, null, new j0(y31Var2, str, hs1Var, z2, (hc1) null), 2);
                return f88Var;
            case 1:
                z31 z31Var2 = (z31) obj;
                z31Var2.getClass();
                gu0 gu0VarN2 = e8.n(y31Var);
                tk1 tk1Var2 = g22.a;
                im3.R(gu0VarN2, gk1.f901o, null, new i9(y31Var, z31Var2, objArr == true ? 1 : 0, (byte) 3), 2);
                return f88Var;
            case 2:
                SupportSession supportSession = (SupportSession) obj;
                supportSession.getClass();
                y31Var.i1(supportSession);
                l97 l97Var = y31Var.P;
                do {
                    value = l97Var.getValue();
                    p31Var = (p31) value;
                    p31Var.getClass();
                } while (!l97Var.j(value, p31.a(p31Var, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, true, false, 6291455)));
                return f88Var;
            case 3:
                SupportSession supportSession2 = (SupportSession) obj;
                supportSession2.getClass();
                y31Var.i1(supportSession2);
                y31Var.o1();
                return f88Var;
            case 4:
                q20 q20Var = (q20) obj;
                q20Var.getClass();
                y31Var.A = q20Var;
                l97 l97Var2 = y31Var.P;
                do {
                    value2 = l97Var2.getValue();
                    p31Var2 = (p31) value2;
                    p31Var2.getClass();
                } while (!l97Var2.j(value2, p31.a(p31Var2, false, false, true, false, false, false, false, false, false, false, false, false, null, null, null, false, false, 8388603)));
                return f88Var;
            default:
                p31 p31Var4 = (p31) obj;
                p31Var4.getClass();
                SharedPreferences sharedPreferences = y31Var.s;
                if (sharedPreferences.getBoolean("KEY_SHOW_QS_APP_CARD", true)) {
                    yc4 yc4Var = y31Var.B;
                    if (yc4Var == null) {
                        im3.e0("qsPromotionHelper");
                        throw null;
                    }
                    t60 t60Var = (t60) yc4Var.p;
                    String str2 = (String) yc4Var.n;
                    t60Var.getClass();
                    str2.getClass();
                    PackageManager packageManager = t60Var.a.getPackageManager();
                    packageManager.getClass();
                    try {
                        packageInfoG = it1.G(packageManager, str2, 0);
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    } catch (RuntimeException e) {
                        boolean z3 = e.getCause() instanceof TransactionTooLargeException;
                        ye4 ye4Var = ye4.a;
                        if (z3) {
                            ye4Var.g("AppIntegrationHelper", "PackageInfo query result was over the IPC transaction limit! (1MB)");
                        } else {
                            ye4Var.g("AppIntegrationHelper", "PackageInfo query failed");
                        }
                    }
                    boolean z4 = packageInfoG != null;
                    l97 l97Var3 = y31Var.P;
                    do {
                        value3 = l97Var3.getValue();
                        p31Var3 = (p31) value3;
                        p31Var3.getClass();
                    } while (!l97Var3.j(value3, p31.a(p31Var3, false, false, false, false, false, false, false, false, false, false, false, z4, null, null, null, false, false, 8384511)));
                    if (z4) {
                        fx3.q(sharedPreferences, "KEY_SHOW_QS_APP_CARD", false);
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                return p31.a(p31Var4, false, false, false, false, false, false, false, false, false, false, z, false, null, null, null, false, false, 8386559);
        }
    }
}
