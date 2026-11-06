package o;

/* JADX INFO: loaded from: classes2.dex */
public final class wm2 extends um2 implements ag1 {
    @Override // o.ag1
    public final boolean e0() {
        g07 g07Var = this.n;
        return (g07Var.o0().a() instanceof d58) && im3.n(g07Var.o0(), this.f2226o.o0());
    }

    @Override // o.ag1
    public final m98 i0(oz3 oz3Var) {
        m98 m98VarV;
        oz3Var.getClass();
        m98 m98VarR0 = oz3Var.r0();
        if (m98VarR0 instanceof um2) {
            m98VarV = m98VarR0;
        } else {
            if (!(m98VarR0 instanceof g07)) {
                gk0.s();
                return null;
            }
            g07 g07Var = (g07) m98VarR0;
            m98VarV = bt1.v(g07Var, g07Var.s0(true));
        }
        return x37.m(m98VarV, m98VarR0);
    }

    @Override // o.oz3
    public final oz3 q0(uz3 uz3Var) {
        g07 g07Var = this.n;
        g07Var.getClass();
        g07 g07Var2 = this.f2226o;
        g07Var2.getClass();
        return new wm2(g07Var, g07Var2);
    }

    @Override // o.m98
    public final m98 s0(boolean z) {
        return bt1.v(this.n.s0(z), this.f2226o.s0(z));
    }

    @Override // o.m98
    /* JADX INFO: renamed from: t0 */
    public final m98 q0(uz3 uz3Var) {
        g07 g07Var = this.n;
        g07Var.getClass();
        g07 g07Var2 = this.f2226o;
        g07Var2.getClass();
        return new wm2(g07Var, g07Var2);
    }

    @Override // o.um2
    public final String toString() {
        return "(" + this.n + ".." + this.f2226o + ')';
    }

    @Override // o.m98
    public final m98 u0(g48 g48Var) {
        g48Var.getClass();
        return bt1.v(this.n.u0(g48Var), this.f2226o.u0(g48Var));
    }
}
