package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h20 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ j20 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ oq0 f943o;

    public /* synthetic */ h20(j20 j20Var, oq0 oq0Var, byte b) {
        this.m = b;
        this.n = j20Var;
        this.f943o = oq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        oq0 oq0Var = this.f943o;
        j20 j20Var = this.n;
        switch (b) {
            case 0:
                j20Var.R(oq0Var);
                break;
            default:
                bb5 bb5VarO = j20Var.O(oq0Var.a());
                if (bb5VarO != null) {
                    bb5VarO.I0(oq0Var, true);
                }
                break;
        }
    }
}
