package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ym1 extends xm1 {
    public final g07 n;

    public ym1(g07 g07Var) {
        this.n = g07Var;
    }

    @Override // o.g07
    /* JADX INFO: renamed from: v0 */
    public final g07 s0(boolean z) {
        return z == p0() ? this : this.n.s0(z).u0(n0());
    }

    @Override // o.m98
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final g07 u0(g48 g48Var) {
        g48Var.getClass();
        return g48Var != n0() ? new j07(this, g48Var) : this;
    }

    @Override // o.xm1
    public final g07 x0() {
        return this.n;
    }
}
