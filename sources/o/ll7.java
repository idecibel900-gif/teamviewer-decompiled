package o;

import com.teamviewer.remotecontrolviewlib.preferences.TVSessionQualityPreference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ll7 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ TVSessionQualityPreference n;

    public /* synthetic */ ll7(TVSessionQualityPreference tVSessionQualityPreference, byte b) {
        this.m = b;
        this.n = tVSessionQualityPreference;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        TVSessionQualityPreference tVSessionQualityPreference = this.n;
        switch (b) {
            case 0:
                gk7 gk7Var = (gk7) obj;
                gk7Var.getClass();
                xk1 xk1Var = ct1.a;
                if (xk1Var != null) {
                    xk1.M(tVSessionQualityPreference.a0, new r02(gk7Var, p02.Positive));
                }
                if (xk1Var != null) {
                    xk1Var.L(gk7Var);
                }
                gk7Var.M0(String.valueOf(tVSessionQualityPreference.s));
                break;
            default:
                tVSessionQualityPreference.v(tVSessionQualityPreference.m.getString(((Integer) obj).intValue()));
                break;
        }
        return f88Var;
    }
}
