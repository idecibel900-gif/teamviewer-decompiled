package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ah3 extends vm1 implements v01 {
    public boolean C;
    public mw4 D;
    public float E = 2.0f;
    public float F = 1.0f;
    public boolean G;
    public n87 H;
    public cq7 I;
    public km J;
    public pw6 K;
    public final km L;
    public final gi0 M;

    public ah3(boolean z, mw4 mw4Var, cq7 cq7Var, pw6 pw6Var) {
        this.C = z;
        this.D = mw4Var;
        this.I = cq7Var;
        this.K = pw6Var;
        this.L = new km(new w32((this.G && z) ? 2.0f : 1.0f), vn4.l0, null, 12);
        gi0 gi0Var = new gi0(new hi0(), new a81(this, (byte) 29));
        U0(gi0Var);
        this.M = gi0Var;
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.es4
    public final void M0() {
        this.H = im3.R(I0(), null, null, new zg3(this, null, (byte) 2), 3);
        if (this.J == null) {
            cq7 cq7VarE = this.I;
            if (cq7VarE == null) {
                cq7VarE = jk0.e(((rn4) xk0.q(this, un4.a)).a, (jt7) xk0.q(this, kt7.a));
            }
            long jD = cq7VarE.d(this.C, false, this.G);
            this.J = new km(new rv0(jD), new yn1(zm.t, new io.sentry.okhttp.b(rv0.e(jD), (byte) 5)), null, 12);
        }
    }

    public final void X0() {
        im3.R(I0(), null, null, new zg3(this, null, (byte) 0), 3);
        im3.R(I0(), null, null, new zg3(this, null, (byte) 1), 3);
    }

    public final void Y0(og7 og7Var) {
        this.G = false;
        yx6.l(this.D.a, new q5(new ArrayList(), this, (byte) 5), og7Var);
    }
}
