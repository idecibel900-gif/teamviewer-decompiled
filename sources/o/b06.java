package o;

import android.content.Intent;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b06 implements hk7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RCClientActivity b;

    public /* synthetic */ b06(RCClientActivity rCClientActivity, byte b) {
        this.a = b;
        this.b = rCClientActivity;
    }

    @Override // o.hk7
    public final void a(gk7 gk7Var) {
        byte b = this.a;
        RCClientActivity rCClientActivity = this.b;
        switch (b) {
            case 0:
                int i = RCClientActivity.c0;
                rCClientActivity.X();
                break;
            case 1:
                lc3 lc3Var = rCClientActivity.P;
                if (lc3Var != null) {
                    lc3Var.a0();
                }
                break;
            case 2:
                lc3 lc3Var2 = rCClientActivity.P;
                if (lc3Var2 != null) {
                    lc3Var2.m();
                }
                break;
            case 3:
                lc3 lc3Var3 = rCClientActivity.P;
                if (lc3Var3 != null) {
                    lc3Var3.j();
                }
                break;
            default:
                int i2 = RCClientActivity.c0;
                rCClientActivity.X.a(new Intent(rCClientActivity, (Class<?>) InAppPurchaseActivity.class), null);
                break;
        }
    }
}
