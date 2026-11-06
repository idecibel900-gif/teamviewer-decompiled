package o;

import com.teamviewer.swigcallbacklib.VoidResultCallbackImpl;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class e6 extends VoidResultCallbackImpl {
    public final /* synthetic */ j93 a;

    public e6(j93 j93Var) {
        this.a = j93Var;
    }

    @Override // com.teamviewer.swigcallbacklib.VoidResultCallback
    public final void OnError() {
        s7 s7Var = u7.g;
        my0 my0Var = vn4.g0().b;
        if (!(my0Var instanceof xt2)) {
            ye4.c("AccountTrialViewManager", "Trial activation failed, no activity");
            return;
        }
        xt2 xt2Var = (xt2) my0Var;
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.a1 = true;
        gk7Var.F0 = R.string.tv_m2m_trial_activation_failed_header;
        gk7Var.H0 = R.string.tv_m2m_trial_activation_failed;
        gk7Var.O0 = R.string.tv_cancel;
        gk7Var.K0 = R.string.tv_try_again;
        xk1 xk1Var = ct1.a;
        j93 j93Var = this.a;
        if (xk1Var != null) {
            xk1.M((c6) j93Var.q, new r02(gk7Var, p02.Negative));
        }
        if (ct1.a != null) {
            xk1.M((b6) j93Var.p, new r02(gk7Var, p02.Positive));
        }
        gk7.O0(gk7Var, xt2Var);
    }

    @Override // com.teamviewer.swigcallbacklib.VoidResultCallback
    public final void OnSuccess() {
        s7 s7Var = u7.g;
        my0 my0Var = vn4.g0().b;
        if (my0Var == null) {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            return;
        }
        String string = my0Var.getString(R.string.tv_m2m_trial_activation_success);
        string.getClass();
        bu7.MAIN.a(new jy0((byte) 2, 0, string, my0Var));
    }
}
