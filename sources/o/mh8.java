package o;

import com.teamviewer.remotecontrolviewlib.activity.WebLoginActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh8 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ WebLoginActivity n;

    public /* synthetic */ mh8(WebLoginActivity webLoginActivity, byte b) {
        this.m = b;
        this.n = webLoginActivity;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        WebLoginActivity webLoginActivity;
        byte b = this.m;
        f88 f88Var = f88.a;
        byte b2 = 1;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = WebLoginActivity.S;
                if (ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ut7.a(au8.O(-492693673, new mh8(this.n, b2), ux2Var), ux2Var, 48);
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            default:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i2 = WebLoginActivity.S;
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    WebLoginActivity webLoginActivity2 = this.n;
                    hi8 hi8Var = webLoginActivity2.N;
                    if (hi8Var == null) {
                        im3.e0("viewModel");
                        throw null;
                    }
                    if (((Boolean) g57.g(hi8Var.v, ux2Var2).getValue()).booleanValue()) {
                        ux2Var2.W(-1933894298);
                        ig7.a(null, null, 0L, 0L, 0.0f, 0.0f, ka0.k, ux2Var2, 12582912, 127);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1933827989);
                        ux2Var2.p(false);
                    }
                    hi8 hi8Var2 = webLoginActivity2.N;
                    if (hi8Var2 == null) {
                        im3.e0("viewModel");
                        throw null;
                    }
                    if (((Boolean) g57.g(hi8Var2.x, ux2Var2).getValue()).booleanValue()) {
                        ux2Var2.W(-1933740073);
                        boolean zH = ux2Var2.h(webLoginActivity2);
                        Object objK = ux2Var2.K();
                        aw awVar = e01.a;
                        if (zH || objK == awVar) {
                            webLoginActivity = webLoginActivity2;
                            objK = new mr6(0, webLoginActivity, WebLoginActivity.class, "onSignInIncompleteDismiss", "onSignInIncompleteDismiss()V", 0, (byte) 17);
                            ux2Var2.g0(objK);
                        } else {
                            webLoginActivity = webLoginActivity2;
                        }
                        Function0 function0 = (Function0) ((pu3) objK);
                        boolean zH2 = ux2Var2.h(webLoginActivity);
                        Object objK2 = ux2Var2.K();
                        if (zH2 || objK2 == awVar) {
                            objK2 = new mr6(0, webLoginActivity, WebLoginActivity.class, "onSignInIncompleteRetry", "onSignInIncompleteRetry()V", 0, (byte) 18);
                            ux2Var2.g0(objK2);
                        }
                        bt1.n(0, function0, (Function0) ((pu3) objK2), ux2Var2, null);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1933536341);
                        ux2Var2.p(false);
                    }
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
        }
    }
}
