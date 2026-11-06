package o;

/* JADX INFO: loaded from: classes2.dex */
public final class xm2 extends um2 implements r58 {
    public final um2 p;
    public final oz3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm2(um2 um2Var, oz3 oz3Var) {
        super(um2Var.n, um2Var.f2226o);
        oz3Var.getClass();
        this.p = um2Var;
        this.q = oz3Var;
    }

    @Override // o.r58
    public final m98 j0() {
        return this.p;
    }

    @Override // o.oz3
    public final oz3 q0(uz3 uz3Var) {
        oz3 oz3Var = this.q;
        oz3Var.getClass();
        return new xm2(this.p, oz3Var);
    }

    @Override // o.m98
    public final m98 s0(boolean z) {
        return x37.u(this.p.s0(z), this.q.r0().s0(z));
    }

    @Override // o.m98
    /* JADX INFO: renamed from: t0 */
    public final m98 q0(uz3 uz3Var) {
        oz3 oz3Var = this.q;
        oz3Var.getClass();
        return new xm2(this.p, oz3Var);
    }

    @Override // o.um2
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.q + ")] " + this.p;
    }

    @Override // o.m98
    public final m98 u0(g48 g48Var) {
        g48Var.getClass();
        return x37.u(this.p.u0(g48Var), this.q);
    }

    @Override // o.um2
    public final g07 v0() {
        return this.p.v0();
    }

    @Override // o.um2
    public final String w0(qo1 qo1Var, qo1 qo1Var2) {
        to1 to1Var = qo1Var2.a.m;
        fw3 fw3Var = uo1.Y[11];
        to1Var.getClass();
        fw3Var.getClass();
        return ((Boolean) to1Var.m).booleanValue() ? qo1Var.X(this.q) : this.p.w0(qo1Var, qo1Var2);
    }

    @Override // o.r58
    public final oz3 z() {
        return this.q;
    }
}
