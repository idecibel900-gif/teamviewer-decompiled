package o;

import android.content.Intent;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;

/* JADX INFO: loaded from: classes.dex */
public final class ek4 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ MainActivity n;

    public /* synthetic */ ek4(MainActivity mainActivity, byte b) {
        this.m = b;
        this.n = mainActivity;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        MainActivity mainActivity = this.n;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean z = mainActivity.m.i.compareTo(m84.q) >= 0;
                if (!mainActivity.b0 && z && zBooleanValue) {
                    ((gp5) mainActivity.f0.getValue()).a.setValue(Boolean.TRUE);
                    mainActivity.b0 = true;
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                int i = InAppPurchaseActivity.S;
                Intent intentJ = ct1.J(mainActivity);
                if (zBooleanValue2 && intentJ != null) {
                    mainActivity.g0.a(intentJ, null);
                }
                break;
        }
        return f88Var;
    }
}
