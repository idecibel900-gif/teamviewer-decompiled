package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gi0 extends es4 implements o65, sf0, t52 {
    public final hi0 A;
    public boolean B;
    public Function1 C;

    public gi0(hi0 hi0Var, Function1 function1) {
        this.A = hi0Var;
        this.C = function1;
        hi0Var.m = this;
    }

    @Override // o.t52
    public final void K() {
        U0();
    }

    @Override // o.es4
    public final void N0() {
    }

    @Override // o.es4
    public final void O0() {
        U0();
    }

    @Override // o.um1
    public final void Q() {
        U0();
    }

    public final void U0() {
        this.B = false;
        this.A.n = null;
        yo1.H(this);
    }

    @Override // o.um1, o.ln5
    public final void c() {
        U0();
    }

    @Override // o.sf0
    public final long d() {
        return xs1.a0(vn4.n0(this, 4).f1179o);
    }

    @Override // o.sf0
    public final in1 getDensity() {
        return vn4.p0(this).L;
    }

    @Override // o.sf0
    public final j04 getLayoutDirection() {
        return vn4.p0(this).M;
    }

    @Override // o.t52
    public final void j(d14 d14Var) {
        boolean z = this.B;
        hi0 hi0Var = this.A;
        if (!z) {
            hi0Var.n = null;
            bt1.J(this, new x8(this, hi0Var, (byte) 15));
            if (hi0Var.n == null) {
                throw ua5.r("DrawResult not defined, did you forget to call onDraw?");
            }
            this.B = true;
        }
        xk1 xk1Var = hi0Var.n;
        xk1Var.getClass();
        ((Function1) xk1Var.n).invoke(d14Var);
    }

    @Override // o.o65
    public final void n0() {
        U0();
    }
}
