package o;

/* JADX INFO: loaded from: classes.dex */
public final class xr7 extends es4 implements v01, r04 {
    public final ot7 A;
    public c68 B;
    public vr7 C;

    public xr7(ot7 ot7Var) {
        this.A = ot7Var;
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.es4
    public final void M0() {
        ot7 ot7VarC = y57.C(this.A, vn4.p0(this).M);
        mr2 mr2Var = (mr2) xk0.q(this, b11.k);
        U0(ot7VarC, mr2Var);
        j04 j04Var = vn4.p0(this).M;
        in1 in1Var = vn4.p0(this).L;
        c68 c68Var = this.B;
        if (c68Var == null) {
            throw fx3.l("Font resolution state is not set.");
        }
        this.C = new vr7(j04Var, in1Var, mr2Var, ot7VarC, c68Var.m);
    }

    @Override // o.es4
    public final void N0() {
        this.B = null;
        this.C = null;
    }

    @Override // o.um1
    public final void Q() {
        vr7 vr7Var = this.C;
        if (vr7Var != null) {
            vr7.a(vr7Var, vn4.p0(this).M, null, null, 30);
        }
        vn4.p0(this).S();
    }

    public final void U0(ot7 ot7Var, mr2 mr2Var) {
        c77 c77Var = ot7Var.a;
        nr2 nr2Var = c77Var.f;
        ms2 ms2Var = c77Var.c;
        if (ms2Var == null) {
            ms2Var = ms2.f1503o;
        }
        ks2 ks2Var = c77Var.d;
        int i = ks2Var != null ? ks2Var.a : 0;
        ls2 ls2Var = c77Var.e;
        this.B = ((or2) mr2Var).b(nr2Var, ms2Var, i, ls2Var != null ? ls2Var.a : 65535);
        vn4.p0(this).S();
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        vr7 vr7Var = this.C;
        if (vr7Var == null) {
            throw fx3.l("Min size state is not set.");
        }
        bg5 bg5Var = vr7Var.f;
        c68 c68Var = this.B;
        if (c68Var == null) {
            throw fx3.l("Font resolution state is not set.");
        }
        Object obj = c68Var.m;
        if (!im3.n(obj, vr7Var.e)) {
            vr7Var.e = obj;
            bg5Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) bg5Var.getValue()).booleanValue()) {
            vr7Var.g = fq7.a(vr7Var.d, vr7Var.b, vr7Var.c);
            bg5Var.setValue(Boolean.FALSE);
        }
        long j2 = vr7Var.g;
        jl5 jl5VarC = zn4Var.C(t61.e(j, t61.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new v0(jl5VarC, (byte) 14));
    }

    @Override // o.um1, o.ln5
    public final void c() {
        vr7 vr7Var = this.C;
        if (vr7Var != null) {
            vr7.a(vr7Var, null, vn4.p0(this).L, null, 29);
        }
        vn4.p0(this).S();
    }
}
