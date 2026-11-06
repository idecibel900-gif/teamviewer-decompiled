package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ a2 n;

    public /* synthetic */ z1(a2 a2Var, byte b) {
        this.m = b;
        this.n = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        a2 a2Var = this.n;
        switch (b) {
            case 0:
                x84 x84Var = a2Var.s;
                x84Var.c("setCurrentState");
                x84Var.e(m84.m);
                break;
            default:
                x84 x84Var2 = a2Var.s;
                x84Var2.c("setCurrentState");
                x84Var2.e(m84.q);
                break;
        }
    }
}
