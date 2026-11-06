package o;

/* JADX INFO: loaded from: classes2.dex */
public final class lm1 extends xm1 implements ag1 {
    public final g07 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1379o;

    public lm1(g07 g07Var, boolean z) {
        this.n = g07Var;
        this.f1379o = z;
    }

    @Override // o.ag1
    public final boolean e0() {
        g07 g07Var = this.n;
        g07Var.o0();
        return g07Var.o0().a() instanceof d58;
    }

    @Override // o.ag1
    public final m98 i0(oz3 oz3Var) {
        oz3Var.getClass();
        m98 m98VarR0 = oz3Var.r0();
        lm1 lm1VarL = cr.l(m98VarR0, this.f1379o);
        if (lm1VarL != null) {
            return lm1VarL;
        }
        g07 g07VarR = x37.r(m98VarR0);
        return g07VarR != null ? g07VarR : m98VarR0.s0(false);
    }

    @Override // o.xm1, o.oz3
    public final boolean p0() {
        return false;
    }

    @Override // o.g07
    public final String toString() {
        return this.n + " & Any";
    }

    @Override // o.g07
    /* JADX INFO: renamed from: v0 */
    public final g07 s0(boolean z) {
        return z ? this.n.s0(z) : this;
    }

    @Override // o.m98
    /* JADX INFO: renamed from: w0 */
    public final g07 u0(g48 g48Var) {
        g48Var.getClass();
        return new lm1(this.n.u0(g48Var), this.f1379o);
    }

    @Override // o.xm1
    public final g07 x0() {
        return this.n;
    }

    @Override // o.xm1
    public final xm1 z0(g07 g07Var) {
        return new lm1(g07Var, this.f1379o);
    }
}
