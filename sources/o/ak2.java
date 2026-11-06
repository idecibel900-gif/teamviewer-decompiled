package o;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.teamviewer.remotecontrolviewlib.activity.FileTransferActivity;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ak2 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ik2 n;

    public /* synthetic */ ak2(ik2 ik2Var, byte b) {
        this.m = b;
        this.n = ik2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        byte b2 = 0;
        ik2 ik2Var = this.n;
        switch (b) {
            case 0:
                ik2Var.R0(ik2Var.F0 != null && wk2.Y0() == 0);
                break;
            case 1:
                int i = ik2.W0;
                if (ik2Var.E() != null) {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(ik2Var.r0(), R.anim.fade_out_slow);
                    animationLoadAnimation.setAnimationListener(new hk2(ik2Var, b2));
                    View view = ik2Var.x0;
                    if (view != null) {
                        view.startAnimation(animationLoadAnimation);
                    }
                }
                break;
            case 2:
                wk2 wk2Var = ik2Var.F0;
                if (wk2Var != null) {
                    wk2Var.m1();
                }
                ik2Var.R0(false);
                break;
            case 3:
                xt2 xt2VarC = ik2Var.C();
                FileTransferActivity fileTransferActivity = xt2VarC instanceof FileTransferActivity ? (FileTransferActivity) xt2VarC : null;
                if (fileTransferActivity != null) {
                    ut2 ut2VarF = fileTransferActivity.D().F("file_transfer_fragment_tag");
                    ik2 ik2Var2 = ut2VarF instanceof ik2 ? (ik2) ut2VarF : null;
                    if (ik2Var2 != null) {
                        wk2 wk2Var2 = ik2Var2.F0;
                        if (wk2Var2 != null) {
                            wk2Var2.i1(true);
                        }
                        bu7.MAIN.a(new ak2(ik2Var2, (byte) 2));
                    }
                }
                break;
            case 4:
                FileTransferActivity fileTransferActivity2 = (FileTransferActivity) ik2Var.C();
                zg2 zg2Var = zg2.H0;
                if (zg2Var == null) {
                    zg2Var = new zg2();
                    zg2.H0 = zg2Var;
                }
                if (fileTransferActivity2 != null) {
                    fileTransferActivity2.runOnUiThread(new io.sentry.u4((Object) zg2Var, (Object) fileTransferActivity2, (byte) 24));
                } else {
                    ye4.c("FTProgressDialogFragment", "show: activity is null");
                }
                break;
            default:
                gk7 gk7Var = ik2Var.u0;
                if (gk7Var != null) {
                    gk7Var.A0();
                }
                break;
        }
    }
}
