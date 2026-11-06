package o;

import android.content.Intent;
import android.view.KeyEvent;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q21 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ y21 n;

    public /* synthetic */ q21(y21 y21Var, byte b) {
        this.m = b;
        this.n = y21Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        y21 y21Var = this.n;
        switch (b) {
            case 0:
                y31 y31Var = y21Var.q0;
                if (y31Var != null) {
                    y31Var.W0();
                }
                break;
            case 1:
                y31 y31Var2 = y21Var.q0;
                if (y31Var2 != null) {
                    y31Var2.W0();
                }
                break;
            case 2:
                int i = InAppPurchaseActivity.S;
                Intent intentJ = ct1.J(y21Var.C());
                if (intentJ != null) {
                    KeyEvent.Callback callbackC = y21Var.C();
                    bb3 bb3Var = callbackC instanceof bb3 ? (bb3) callbackC : null;
                    if (bb3Var != null) {
                        bb3Var.i(intentJ);
                    }
                }
                break;
            case 3:
                y31 y31Var3 = y21Var.q0;
                if (y31Var3 != null) {
                    y31Var3.W0();
                }
                break;
            case 4:
                y31 y31Var4 = y21Var.q0;
                if (y31Var4 != null) {
                    y31Var4.W0();
                }
                break;
            case 5:
                y31 y31Var5 = y21Var.q0;
                if (y31Var5 != null) {
                    y31Var5.W0();
                }
                break;
            default:
                y31 y31Var6 = y21Var.q0;
                if (y31Var6 != null) {
                    y31Var6.W0();
                }
                break;
        }
        return f88Var;
    }
}
