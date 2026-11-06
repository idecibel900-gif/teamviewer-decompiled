package o;

import android.content.Intent;
import android.os.Bundle;
import com.teamviewer.remotecontrolviewlib.activity.FileTransferActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rk2 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ tk2 n;

    public /* synthetic */ rk2(tk2 tk2Var, byte b) {
        this.m = b;
        this.n = tk2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        tk2 tk2Var = this.n;
        switch (b) {
            case 0:
                bd4 bd4Var = bd4.k;
                if (bd4Var == null) {
                    bd4Var = new bd4();
                    bd4.k = bd4Var;
                }
                bd4Var.a();
                ca6 ca6Var = ca6.g;
                if (ca6Var == null) {
                    ca6Var = new ca6();
                    ca6.g = ca6Var;
                }
                ca6Var.a();
                Bundle bundle = new Bundle();
                bundle.putBoolean("checkable", true);
                RemoteControlApplication remoteControlApplication = (RemoteControlApplication) tk2Var.a;
                if (it1.c == null) {
                    im3.e0("viewFactory");
                    throw null;
                }
                Intent intent = new Intent(remoteControlApplication, (Class<?>) FileTransferActivity.class);
                intent.addFlags(872415232);
                intent.putExtra("activity_navigation_bundle", bundle);
                remoteControlApplication.startActivity(intent);
                return;
            default:
                x02 x02VarA = ik7.a();
                gk7 gk7Var = new gk7();
                fx3.o(1, "dialogId", x02VarA, gk7Var);
                gk7Var.Z0 = x02VarA;
                gk7Var.F0 = R.string.tv_teamviewer;
                gk7Var.H0 = R.string.tv_filetransfer_errordialog_partner_cancel;
                gk7Var.O0 = android.R.string.ok;
                if (ct1.a != null) {
                    xk1.M((c6) tk2Var.b, new r02(gk7Var, p02.Negative));
                }
                gk7Var.N0();
                return;
        }
    }
}
