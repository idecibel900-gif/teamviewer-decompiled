package o;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class mv4 extends TimerTask {
    public final /* synthetic */ byte m;
    public final /* synthetic */ nv4 n;

    public /* synthetic */ mv4(nv4 nv4Var, byte b) {
        this.m = b;
        this.n = nv4Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        byte b = this.m;
        final nv4 nv4Var = this.n;
        switch (b) {
            case 0:
                final byte b2 = 0;
                bu7.MAIN.a(new Runnable() { // from class: o.lv4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        nv4 nv4Var2 = nv4Var;
                        switch (b3) {
                            case 0:
                                c1 c1Var = nv4Var2.n;
                                if (c1Var != null) {
                                    c1Var.e(0);
                                    c1Var.d(1);
                                }
                                nv4Var2.x = yb3.m;
                                break;
                            default:
                                mv4 mv4Var = nv4Var2.F;
                                if (mv4Var != null) {
                                    mv4Var.cancel();
                                }
                                nv4Var2.x = yb3.f2595o;
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 1;
                bu7.MAIN.a(new Runnable() { // from class: o.lv4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        nv4 nv4Var2 = nv4Var;
                        switch (b4) {
                            case 0:
                                c1 c1Var = nv4Var2.n;
                                if (c1Var != null) {
                                    c1Var.e(0);
                                    c1Var.d(1);
                                }
                                nv4Var2.x = yb3.m;
                                break;
                            default:
                                mv4 mv4Var = nv4Var2.F;
                                if (mv4Var != null) {
                                    mv4Var.cancel();
                                }
                                nv4Var2.x = yb3.f2595o;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
