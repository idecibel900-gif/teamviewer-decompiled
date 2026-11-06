package o;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class d6 extends u2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // o.u2
    public void a(ff4 ff4Var) {
        switch (this.a) {
            case 0:
                ff4Var.b((io.sentry.p7) ((j93) this.b).n);
                break;
        }
    }

    @Override // o.u2
    public void b(qf4 qf4Var) {
        switch (this.a) {
            case 0:
                qf4Var.b(null);
                break;
        }
    }

    @Override // o.u2
    public void d(mo7 mo7Var) {
        Activity activity;
        switch (this.a) {
            case 1:
                if ((mo7Var instanceof et6) && (activity = (Activity) ((xj2) this.b).q.get()) != null) {
                    activity.finish();
                    break;
                }
                break;
        }
    }

    @Override // o.u2
    public void e(et6 et6Var) {
        switch (this.a) {
            case 2:
                tk2 tk2Var = (tk2) this.b;
                ye4.a("FileTransferViewManager", "Connect (filetransfer) to partner successful");
                bu7 bu7Var = bu7.MAIN;
                bu7Var.a(new ed((byte) 6));
                bu7Var.a(new rk2(tk2Var, (byte) 0));
                break;
        }
    }
}
