package o;

/* JADX INFO: loaded from: classes2.dex */
public final class k07 extends xm1 implements r58 {
    public final g07 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final oz3 f1219o;

    public k07(g07 g07Var, oz3 oz3Var) {
        oz3Var.getClass();
        this.n = g07Var;
        this.f1219o = oz3Var;
    }

    @Override // o.xm1
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public final k07 q0(uz3 uz3Var) {
        oz3 oz3Var = this.f1219o;
        oz3Var.getClass();
        return new k07(this.n, oz3Var);
    }

    @Override // o.r58
    public final m98 j0() {
        return this.n;
    }

    @Override // o.g07
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f1219o + ")] " + this.n;
    }

    @Override // o.g07
    /* JADX INFO: renamed from: v0 */
    public final g07 s0(boolean z) {
        m98 m98VarU = x37.u(this.n.s0(z), this.f1219o.r0().s0(z));
        m98VarU.getClass();
        return (g07) m98VarU;
    }

    @Override // o.m98
    /* JADX INFO: renamed from: w0 */
    public final g07 u0(g48 g48Var) {
        g48Var.getClass();
        m98 m98VarU = x37.u(this.n.u0(g48Var), this.f1219o);
        m98VarU.getClass();
        return (g07) m98VarU;
    }

    @Override // o.xm1
    public final g07 x0() {
        return this.n;
    }

    @Override // o.r58
    public final oz3 z() {
        return this.f1219o;
    }

    @Override // o.xm1
    public final xm1 z0(g07 g07Var) {
        return new k07(g07Var, this.f1219o);
    }
}
