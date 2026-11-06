package o;

/* JADX INFO: loaded from: classes.dex */
public final class n53 extends es4 implements v01, r04, o65 {
    public ot7 A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public ot7 G;
    public c68 H;

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.es4
    public final void M0() {
        mr2 mr2Var = (mr2) xk0.q(this, b11.k);
        this.G = y57.C(this.A, vn4.p0(this).M);
        nr2 nr2Var = W0().a.f;
        ms2 ms2Var = W0().a.c;
        if (ms2Var == null) {
            ms2Var = ms2.f1503o;
        }
        ks2 ks2Var = W0().a.d;
        int i = ks2Var != null ? ks2Var.a : 0;
        ls2 ls2Var = W0().a.e;
        this.H = ((or2) mr2Var).b(nr2Var, ms2Var, i, ls2Var != null ? ls2Var.a : 65535);
        bt1.J(this, new m53(this, (byte) 0));
        this.D = true;
    }

    @Override // o.es4
    public final void N0() {
        this.G = null;
        this.H = null;
        this.D = false;
    }

    @Override // o.um1
    public final void Q() {
        this.G = y57.C(this.A, vn4.p0(this).M);
        this.D = true;
        vn4.p0(this).S();
    }

    public final void U0(fo4 fo4Var, ot7 ot7Var, mr2 mr2Var) {
        ts7 ts7Var = fq7.b(ot7Var, fo4Var, mr2Var, 3, true).d;
        float fG = ts7Var.g(0);
        float fG2 = ts7Var.g(1);
        float fG3 = ts7Var.g(2);
        this.E = vs1.m(fG, fG2, fG3, this.B, 1);
        this.F = vs1.m(fG, fG2, fG3, this.C, Integer.MAX_VALUE);
    }

    public final void V0(rg4 rg4Var) {
        if (this.D) {
            U0(rg4Var, W0(), (mr2) xk0.q(this, b11.k));
            this.D = false;
        }
        int i = this.E;
        this.E = i >= 0 ? i : 0;
        int i2 = this.F;
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        this.F = i2;
    }

    public final ot7 W0() {
        ot7 ot7Var = this.G;
        if (ot7Var != null) {
            return ot7Var;
        }
        throw fx3.l("Resolved style is not set.");
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        if (this.D) {
            U0(fo4Var, W0(), (mr2) xk0.q(this, b11.k));
            this.D = false;
        }
        int i = this.E;
        int iV = i != -1 ? ct1.v(i, r61.j(j), r61.h(j)) : r61.j(j);
        int i2 = this.F;
        jl5 jl5VarC = zn4Var.C(r61.b(j, 0, 0, iV, i2 != -1 ? ct1.v(i2, r61.j(j), r61.h(j)) : r61.h(j), 3));
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new v0(jl5VarC, (byte) 6));
    }

    @Override // o.um1, o.ln5
    public final void c() {
        this.D = true;
        vn4.p0(this).S();
    }

    @Override // o.r04
    public final int g(rg4 rg4Var, zn4 zn4Var, int i) {
        V0(rg4Var);
        int i2 = this.E;
        int i3 = this.F;
        if (i2 == i3) {
            return i3;
        }
        int iA = zn4Var.a(i);
        int i4 = this.E;
        int i5 = this.F;
        if (iA < i4) {
            iA = i4;
        }
        return iA > i5 ? i5 : iA;
    }

    @Override // o.o65
    public final void n0() {
        if (this.H != null) {
            bt1.J(this, new m53(this, (byte) 1));
        }
        this.D = true;
        vn4.p0(this).S();
    }

    @Override // o.r04
    public final int r0(rg4 rg4Var, zn4 zn4Var, int i) {
        V0(rg4Var);
        int i2 = this.E;
        if (i2 == this.F) {
            return i2;
        }
        int iV = zn4Var.V(i);
        int i3 = this.E;
        int i4 = this.F;
        if (iV < i3) {
            iV = i3;
        }
        return iV > i4 ? i4 : iV;
    }
}
