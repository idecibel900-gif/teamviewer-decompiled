package o;

import com.teamviewer.remotecontrolviewlib.activity.FileTransferActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dk2 implements Runnable {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ ik2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ FileTransferActivity f631o;

    public /* synthetic */ dk2(FileTransferActivity fileTransferActivity, ik2 ik2Var) {
        this.f631o = fileTransferActivity;
        this.n = ik2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        boolean z = false;
        FileTransferActivity fileTransferActivity = this.f631o;
        ik2 ik2Var = this.n;
        switch (b) {
            case 0:
                wk2 wk2Var = ik2Var.F0;
                fileTransferActivity.L(wk2Var != null ? wk2Var.l1() : false);
                break;
            default:
                wk2 wk2Var2 = ik2Var.F0;
                if (wk2Var2 != null && (!wk2Var2.X0().isEmpty())) {
                    z = true;
                }
                fileTransferActivity.L(z);
                break;
        }
    }

    public /* synthetic */ dk2(ik2 ik2Var, FileTransferActivity fileTransferActivity) {
        this.n = ik2Var;
        this.f631o = fileTransferActivity;
    }
}
