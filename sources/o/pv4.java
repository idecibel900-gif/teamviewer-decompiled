package o;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class pv4 extends TimerTask {
    public final /* synthetic */ byte m;
    public final /* synthetic */ qv4 n;

    public /* synthetic */ pv4(qv4 qv4Var, byte b) {
        this.m = b;
        this.n = qv4Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        byte b = this.m;
        final qv4 qv4Var = this.n;
        switch (b) {
            case 0:
                final byte b2 = 0;
                bu7.MAIN.a(new Runnable() { // from class: o.ov4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        yb3 yb3Var = yb3.m;
                        qv4 qv4Var2 = qv4Var;
                        switch (b3) {
                            case 0:
                                c1 c1Var = qv4Var2.s;
                                if (c1Var != null) {
                                    c1Var.e(0);
                                    c1Var.d(1);
                                }
                                qv4Var2.y = yb3Var;
                                break;
                            default:
                                pv4 pv4Var = qv4Var2.L;
                                if (pv4Var != null) {
                                    pv4Var.cancel();
                                }
                                c1 c1Var2 = qv4Var2.s;
                                if (c1Var2 != null) {
                                    c1Var2.e(0);
                                    c1Var2.d(2);
                                }
                                qv4Var2.y = yb3Var;
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 1;
                bu7.MAIN.a(new Runnable() { // from class: o.ov4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        yb3 yb3Var = yb3.m;
                        qv4 qv4Var2 = qv4Var;
                        switch (b4) {
                            case 0:
                                c1 c1Var = qv4Var2.s;
                                if (c1Var != null) {
                                    c1Var.e(0);
                                    c1Var.d(1);
                                }
                                qv4Var2.y = yb3Var;
                                break;
                            default:
                                pv4 pv4Var = qv4Var2.L;
                                if (pv4Var != null) {
                                    pv4Var.cancel();
                                }
                                c1 c1Var2 = qv4Var2.s;
                                if (c1Var2 != null) {
                                    c1Var2.e(0);
                                    c1Var2.d(2);
                                }
                                qv4Var2.y = yb3Var;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
