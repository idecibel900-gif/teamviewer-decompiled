package o;

/* JADX INFO: loaded from: classes.dex */
public final class f20 extends es4 implements t52, o65, dp6 {
    public long A;
    public sb0 B;
    public float C;
    public pw6 D;
    public long E;
    public j04 F;
    public vs1 G;
    public pw6 H;
    public vs1 I;

    @Override // o.dp6
    public final boolean f() {
        return false;
    }

    @Override // o.t52
    public final void j(d14 d14Var) {
        vs1 vs1Var;
        nl0 nl0Var = d14Var.m;
        if (this.D == kh.V) {
            if (!z68.a(this.A, rv0.h)) {
                u52.k0(d14Var, this.A, 0L, 0.0f, 126);
            }
            sb0 sb0Var = this.B;
            if (sb0Var != null) {
                u52.x(d14Var, sb0Var, 0L, 0L, this.C, null, null, 118);
            }
        } else {
            if (y07.a(nl0Var.d(), this.E) && d14Var.getLayoutDirection() == this.F && im3.n(this.H, this.D)) {
                vs1Var = this.G;
                vs1Var.getClass();
            } else {
                bt1.J(this, new x8(this, d14Var, (byte) 7));
                vs1Var = this.I;
                this.I = null;
            }
            this.G = vs1Var;
            this.E = nl0Var.d();
            this.F = d14Var.getLayoutDirection();
            this.H = this.D;
            vs1Var.getClass();
            if (!z68.a(this.A, rv0.h)) {
                xs1.E(d14Var, vs1Var, this.A);
            }
            sb0 sb0Var2 = this.B;
            if (sb0Var2 != null) {
                xs1.D(d14Var, vs1Var, sb0Var2, this.C, 56);
            }
        }
        d14Var.a();
    }

    @Override // o.o65
    public final void n0() {
        this.E = 9205357640488583168L;
        this.F = null;
        this.G = null;
        this.H = null;
        yo1.H(this);
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        lp6.j(op6Var, this.D);
    }
}
