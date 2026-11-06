package o;

/* JADX INFO: loaded from: classes2.dex */
public final class h55 extends xm1 implements ag1 {
    public final g07 n;

    public h55(g07 g07Var) {
        g07Var.getClass();
        this.n = g07Var;
    }

    @Override // o.ag1
    public final boolean e0() {
        return true;
    }

    @Override // o.ag1
    public final m98 i0(oz3 oz3Var) {
        oz3Var.getClass();
        m98 m98VarR0 = oz3Var.r0();
        if (!p58.f(m98VarR0) && !p58.e(m98VarR0)) {
            return m98VarR0;
        }
        if (m98VarR0 instanceof g07) {
            g07 g07Var = (g07) m98VarR0;
            g07 g07VarS0 = g07Var.s0(false);
            return !p58.f(g07Var) ? g07VarS0 : new h55(g07VarS0);
        }
        if (!(m98VarR0 instanceof um2)) {
            hk0.f(m98VarR0, "Incorrect type: ");
            return null;
        }
        um2 um2Var = (um2) m98VarR0;
        g07 g07Var2 = um2Var.n;
        g07 g07VarS1 = g07Var2.s0(false);
        if (p58.f(g07Var2)) {
            g07VarS1 = new h55(g07VarS1);
        }
        g07 g07Var3 = um2Var.f2226o;
        g07 g07VarS2 = g07Var3.s0(false);
        if (p58.f(g07Var3)) {
            g07VarS2 = new h55(g07VarS2);
        }
        return x37.u(bt1.v(g07VarS1, g07VarS2), x37.j(m98VarR0));
    }

    @Override // o.xm1, o.oz3
    public final boolean p0() {
        return false;
    }

    @Override // o.m98
    public final m98 u0(g48 g48Var) {
        g48Var.getClass();
        return new h55(this.n.u0(g48Var));
    }

    @Override // o.g07
    /* JADX INFO: renamed from: v0 */
    public final g07 s0(boolean z) {
        return z ? this.n.s0(true) : this;
    }

    @Override // o.g07
    /* JADX INFO: renamed from: w0 */
    public final g07 u0(g48 g48Var) {
        g48Var.getClass();
        return new h55(this.n.u0(g48Var));
    }

    @Override // o.xm1
    public final g07 x0() {
        return this.n;
    }
}
