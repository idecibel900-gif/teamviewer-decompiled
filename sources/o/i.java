package o;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends xm1 {
    public final g07 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g07 f1021o;

    public i(g07 g07Var, g07 g07Var2) {
        g07Var.getClass();
        g07Var2.getClass();
        this.n = g07Var;
        this.f1021o = g07Var2;
    }

    @Override // o.g07
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public final i s0(boolean z) {
        return new i(this.n.s0(z), this.f1021o.s0(z));
    }

    @Override // o.xm1
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final i q0(uz3 uz3Var) {
        g07 g07Var = this.n;
        g07Var.getClass();
        g07 g07Var2 = this.f1021o;
        g07Var2.getClass();
        return new i(g07Var, g07Var2);
    }

    @Override // o.m98
    /* JADX INFO: renamed from: w0 */
    public final g07 u0(g48 g48Var) {
        g48Var.getClass();
        return new i(this.n.u0(g48Var), this.f1021o);
    }

    @Override // o.xm1
    public final g07 x0() {
        return this.n;
    }

    @Override // o.xm1
    public final xm1 z0(g07 g07Var) {
        return new i(g07Var, this.f1021o);
    }
}
