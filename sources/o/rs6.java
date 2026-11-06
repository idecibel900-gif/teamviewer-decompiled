package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rs6 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ss6 n;

    public /* synthetic */ rs6(ss6 ss6Var, byte b) {
        this.m = b;
        this.n = ss6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        ss6 ss6Var = this.n;
        switch (b) {
            case 0:
                x84 x84Var = ss6Var.r;
                x84Var.c("setCurrentState");
                x84Var.e(m84.m);
                break;
            default:
                x84 x84Var2 = ss6Var.r;
                x84Var2.c("setCurrentState");
                x84Var2.e(m84.q);
                break;
        }
    }
}
