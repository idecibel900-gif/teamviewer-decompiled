package o;

/* JADX INFO: loaded from: classes.dex */
public final class g42 extends es4 implements l28, g04 {
    public g42 A;
    public g42 B;
    public long C;

    @Override // o.es4
    public final void N0() {
        this.B = null;
        this.A = null;
    }

    public final boolean U0() {
        g42 g42Var = this.A;
        if (g42Var != null) {
            return g42Var.U0();
        }
        g42 g42Var2 = this.B;
        if (g42Var2 != null) {
            return g42Var2.U0();
        }
        return false;
    }

    public final void V0() {
        g42 g42Var = this.B;
        if (g42Var != null) {
            g42Var.V0();
            return;
        }
        g42 g42Var2 = this.A;
        if (g42Var2 != null) {
            g42Var2.V0();
        }
    }

    public final void W0() {
        g42 g42Var = this.B;
        if (g42Var != null) {
            g42Var.W0();
        }
        g42 g42Var2 = this.A;
        if (g42Var2 != null) {
            g42Var2.W0();
        }
        this.A = null;
    }

    public final void X0(xk1 xk1Var) {
        l28 l28Var;
        g42 g42Var;
        g42 g42Var2 = this.A;
        if (g42Var2 == null || !io1.G(g42Var2, wo1.M(xk1Var))) {
            if (this.m.z) {
                k76 k76Var = new k76();
                g57.s(this, new h50(k76Var, this, xk1Var, (byte) 1));
                l28Var = (l28) k76Var.m;
            } else {
                l28Var = null;
            }
            g42Var = (g42) l28Var;
        } else {
            g42Var = g42Var2;
        }
        if (g42Var != null && g42Var2 == null) {
            g42Var.V0();
            g42Var.X0(xk1Var);
            g42 g42Var3 = this.B;
            if (g42Var3 != null) {
                g42Var3.W0();
            }
        } else if (g42Var == null && g42Var2 != null) {
            g42 g42Var4 = this.B;
            if (g42Var4 != null) {
                g42Var4.V0();
                g42Var4.X0(xk1Var);
            }
            g42Var2.W0();
        } else if (!im3.n(g42Var, g42Var2)) {
            if (g42Var != null) {
                g42Var.V0();
                g42Var.X0(xk1Var);
            }
            if (g42Var2 != null) {
                g42Var2.W0();
            }
        } else if (g42Var != null) {
            g42Var.X0(xk1Var);
        } else {
            g42 g42Var5 = this.B;
            if (g42Var5 != null) {
                g42Var5.X0(xk1Var);
            }
        }
        this.A = g42Var;
    }

    public final void Y0() {
        g42 g42Var = this.B;
        if (g42Var != null) {
            g42Var.Y0();
            return;
        }
        g42 g42Var2 = this.A;
        if (g42Var2 != null) {
            g42Var2.Y0();
        }
    }

    @Override // o.g04, o.go4
    public final void b(long j) {
        this.C = j;
    }

    @Override // o.l28
    public final Object k() {
        return d82.A;
    }
}
