package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o7 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ s7 n;

    public /* synthetic */ o7(s7 s7Var, byte b) {
        this.m = b;
        this.n = s7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        s7 s7Var = this.n;
        switch (b) {
            case 0:
                a8 status = s7Var.getStatus();
                if (status == null) {
                    status = a8.OK;
                }
                s7Var.x(status, null);
                s7Var.l.set(false);
                break;
            default:
                a8 status2 = s7Var.getStatus();
                if (status2 == null) {
                    status2 = a8.DEADLINE_EXCEEDED;
                }
                s7Var.e(status2, s7Var.r.g != null, null);
                s7Var.m.set(false);
                break;
        }
    }
}
