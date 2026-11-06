package o;

/* JADX INFO: loaded from: classes2.dex */
public final class t36 implements j97, go2, nx2 {
    private final bp3 job;
    public final /* synthetic */ j97 m;

    public t36(sx4 sx4Var, n87 n87Var) {
        this.m = sx4Var;
        this.job = n87Var;
    }

    @Override // o.nx2
    public final go2 a(de1 de1Var, int i, df0 df0Var) {
        return (((i < 0 || i >= 2) && i != -2) || df0Var != df0.n) ? au8.A(this, de1Var, i, df0Var) : this;
    }

    @Override // o.go2
    public final Object b(ho2 ho2Var, hc1 hc1Var) {
        return this.m.b(ho2Var, hc1Var);
    }

    @Override // o.j97
    public final Object getValue() {
        return this.m.getValue();
    }
}
