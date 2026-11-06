package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fr2 extends vm1 implements dp6, gz2, v01, o65, l28 {
    public static final ju I = new ju((byte) 18);
    public mw4 C;
    public final Function1 D;
    public dq2 E;
    public t34 F;
    public e45 G;
    public final br2 H;

    public fr2(mw4 mw4Var, int i, i0 i0Var) {
        this.C = mw4Var;
        this.D = i0Var;
        br2 br2Var = new br2(i, new ea1(2, this, fr2.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 2), 10);
        U0(br2Var);
        this.H = br2Var;
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.es4
    public final void O0() {
        t34 t34Var = this.F;
        if (t34Var != null) {
            t34Var.b();
        }
        this.F = null;
    }

    public final void X0(mw4 mw4Var, jl3 jl3Var) {
        if (!this.z) {
            mw4Var.b(jl3Var);
            return;
        }
        bp3 bp3Var = (bp3) ((fc1) I0()).m.l0(z06.z);
        im3.R(I0(), null, null, new ko2((Object) mw4Var, (Object) jl3Var, (Object) (bp3Var != null ? bp3Var.o0(new g0(mw4Var, jl3Var, (byte) 27)) : null), (hc1) null, (byte) 1), 3);
    }

    public final void Y0(mw4 mw4Var) {
        dq2 dq2Var;
        if (im3.n(this.C, mw4Var)) {
            return;
        }
        mw4 mw4Var2 = this.C;
        if (mw4Var2 != null && (dq2Var = this.E) != null) {
            mw4Var2.b(new eq2(dq2Var));
        }
        this.E = null;
        this.C = mw4Var;
    }

    @Override // o.l28
    public final Object k() {
        return I;
    }

    @Override // o.o65
    public final void n0() {
        k76 k76Var = new k76();
        bt1.J(this, new ql1(k76Var, this, (byte) 6));
        t34 t34Var = (t34) k76Var.m;
        if (this.H.Z0().b()) {
            t34 t34Var2 = this.F;
            if (t34Var2 != null) {
                t34Var2.b();
            }
            if (t34Var != null) {
                t34Var.a();
            } else {
                t34Var = null;
            }
            this.F = t34Var;
        }
    }

    @Override // o.gz2
    public final void x0(e45 e45Var) {
        this.G = e45Var;
        if (this.H.Z0().b()) {
            boolean z = e45Var.a1().z;
            vv vvVar = gr2.A;
            if (!z) {
                if (this.z) {
                    g57.i(this, vvVar);
                }
            } else {
                e45 e45Var2 = this.G;
                if (e45Var2 != null && e45Var2.a1().z && this.z) {
                    g57.i(this, vvVar);
                }
            }
        }
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        boolean zB = this.H.Z0().b();
        fw3[] fw3VarArr = lp6.a;
        np6 np6Var = kp6.l;
        fw3 fw3Var = lp6.a[4];
        Boolean boolValueOf = Boolean.valueOf(zB);
        np6Var.getClass();
        op6Var.d(np6Var, boolValueOf);
        op6Var.d(zo6.w, new m3(null, new ax1(0, this, fr2.class, "requestFocus", "requestFocus()Z", 0, (byte) 5)));
    }
}
