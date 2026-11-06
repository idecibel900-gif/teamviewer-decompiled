package o;

import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.remotecontrolviewlib.view.session.RcSessionBottomToolbarView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b16 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ d16 n;

    public /* synthetic */ b16(d16 d16Var, byte b) {
        this.m = b;
        this.n = d16Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RCClientActivity rCClientActivity;
        RCClientActivity rCClientActivity2;
        WeakReference weakReference;
        RCClientActivity rCClientActivity3;
        RCClientActivity rCClientActivity4;
        RcSessionBottomToolbarView rcSessionBottomToolbarView;
        byte b = this.m;
        boolean zM = false;
        d16 d16Var = this.n;
        switch (b) {
            case 0:
                WeakReference weakReference2 = d16Var.z;
                if (weakReference2 != null && (rCClientActivity = (RCClientActivity) weakReference2.get()) != null) {
                    zM = rCClientActivity.M();
                }
                if (!zM) {
                    ye4.c("RcClientActivityViewModel", "reinitView(): initClientView failed!");
                }
                break;
            case 1:
                WeakReference weakReference3 = d16Var.z;
                if (weakReference3 != null && (rCClientActivity2 = (RCClientActivity) weakReference3.get()) != null) {
                    zM = rCClientActivity2.M();
                }
                if (!zM) {
                    ye4.c("RcClientActivityViewModel", "onFirstStart: client not found/initClientView failed!");
                    d16Var.Z0();
                }
                break;
            case 2:
                if (!im3.n(d16Var.M.getValue(), Boolean.TRUE) && !d16Var.A && (weakReference = d16Var.z) != null && (rCClientActivity3 = (RCClientActivity) weakReference.get()) != null) {
                    rCClientActivity3.I(d16Var.p.a());
                    break;
                }
                break;
            default:
                WeakReference weakReference4 = d16Var.z;
                if (weakReference4 != null && (rCClientActivity4 = (RCClientActivity) weakReference4.get()) != null) {
                    if (rCClientActivity4.isFinishing() || (rcSessionBottomToolbarView = rCClientActivity4.Q) == null || rcSessionBottomToolbarView.getVisibility() != 0) {
                        ye4.c("RCClientActivity", "skip show low memory warning - GUI not visible");
                    } else {
                        x02 x02VarA = ik7.a();
                        gk7 gk7Var = new gk7();
                        fx3.o(1, "dialogId", x02VarA, gk7Var);
                        gk7Var.Z0 = x02VarA;
                        gk7Var.a1 = true;
                        gk7Var.F0 = R.string.tv_warningMessage_LowOnCaption;
                        gk7Var.H0 = R.string.tv_warningMessage_LowOnMemoryInRemoteControlSession;
                        gk7Var.K0 = R.string.tv_ok;
                        gk7Var.O0 = R.string.tv_cancel;
                        xk1 xk1Var = ct1.a;
                        if (xk1Var != null) {
                            xk1.M(rCClientActivity4.b0, new r02(gk7Var, p02.Positive));
                        }
                        if (xk1Var != null) {
                            xk1Var.L(gk7Var);
                        }
                        gk7.O0(gk7Var, rCClientActivity4);
                    }
                    break;
                }
                break;
        }
    }
}
