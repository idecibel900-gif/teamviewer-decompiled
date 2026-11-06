package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class qj4 extends es4 implements gz2, t52, dp6, o65 {
    public or A;
    public tr7 B;
    public xl5 I;
    public View J;
    public in1 K;
    public wl5 L;
    public eo1 N;
    public dl3 P;
    public kf0 Q;
    public float C = Float.NaN;
    public boolean D = true;
    public long E = 9205357640488583168L;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public boolean H = true;
    public final bg5 M = new bg5(null, xz2.P);
    public long O = 9205357640488583168L;

    public qj4(or orVar, tr7 tr7Var, xl5 xl5Var) {
        this.A = orVar;
        this.B = tr7Var;
        this.I = xl5Var;
    }

    @Override // o.es4
    public final void M0() {
        n0();
        this.Q = ka0.d(0, 7, null);
        im3.R(I0(), null, pe1.p, new xr1(this, null, (byte) 1), 1);
    }

    @Override // o.es4
    public final void N0() {
        wl5 wl5Var = this.L;
        if (wl5Var != null) {
            ((yl5) wl5Var).b();
        }
        this.L = null;
    }

    public final long U0() {
        eo1 eo1VarB = this.N;
        if (eo1VarB == null) {
            eo1VarB = d57.b(new pj4(this, (byte) 2));
            this.N = eo1VarB;
        }
        return ((t65) eo1VarB.getValue()).a;
    }

    public final void V0() {
        wl5 wl5Var = this.L;
        if (wl5Var != null) {
            ((yl5) wl5Var).b();
        }
        View viewY = this.J;
        if (viewY == null) {
            viewY = e8.y(this);
        }
        View view = viewY;
        this.J = view;
        in1 in1Var = this.K;
        if (in1Var == null) {
            in1Var = vn4.p0(this).L;
        }
        in1 in1Var2 = in1Var;
        this.K = in1Var2;
        this.L = this.I.b(view, this.D, this.E, this.F, this.G, this.H, in1Var2, this.C);
        X0();
    }

    public final void W0() {
        in1 in1Var = this.K;
        if (in1Var == null) {
            in1Var = vn4.p0(this).L;
            this.K = in1Var;
        }
        long j = ((t65) this.A.invoke(in1Var)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & U0()) == 9205357640488583168L) {
            this.O = 9205357640488583168L;
            wl5 wl5Var = this.L;
            if (wl5Var != null) {
                ((yl5) wl5Var).b();
                return;
            }
            return;
        }
        this.O = t65.e(U0(), j);
        if (this.L == null) {
            V0();
        }
        wl5 wl5Var2 = this.L;
        if (wl5Var2 != null) {
            wl5Var2.a(this.O, 9205357640488583168L, this.C);
        }
        X0();
    }

    public final void X0() {
        in1 in1Var;
        wl5 wl5Var = this.L;
        if (wl5Var == null || (in1Var = this.K) == null) {
            return;
        }
        yl5 yl5Var = (yl5) wl5Var;
        if (dl3.a(yl5Var.c(), this.P)) {
            return;
        }
        tr7 tr7Var = this.B;
        if (tr7Var != null) {
            tr7Var.invoke(new a42(in1Var.r(xs1.a0(yl5Var.c()))));
        }
        this.P = new dl3(yl5Var.c());
    }

    @Override // o.t52
    public final void j(d14 d14Var) {
        d14Var.a();
        kf0 kf0Var = this.Q;
        if (kf0Var != null) {
            kf0Var.b(f88.a);
        }
    }

    @Override // o.o65
    public final void n0() {
        bt1.J(this, new pj4(this, (byte) 0));
    }

    @Override // o.gz2
    public final void x0(e45 e45Var) {
        this.M.setValue(e45Var);
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        op6Var.d(rj4.a, new pj4(this, (byte) 1));
    }
}
