package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tc7 extends es4 implements r04 {
    public wc7 A;

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.es4
    public final void M0() {
        l28 l28VarI = g57.i(this, "StyleOuterNode");
        l28VarI.getClass();
        wc7 wc7Var = (wc7) l28VarI;
        wc7Var.C = this;
        this.A = wc7Var;
        wc7Var.a1(true);
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        wc7 wc7Var = this.A;
        wc7Var.getClass();
        xc7 xc7VarZ0 = wc7.Z0(wc7Var, 1);
        float f = xc7VarZ0.v((byte) 8) ? xc7VarZ0.k : 0.0f;
        final float f2 = (xc7VarZ0.v((byte) 0) ? xc7VarZ0.c : 0.0f) + f;
        float f3 = (xc7VarZ0.v((byte) 1) ? xc7VarZ0.d : 0.0f) + f;
        final float f4 = (xc7VarZ0.v((byte) 2) ? xc7VarZ0.e : 0.0f) + f;
        float f5 = xc7VarZ0.v((byte) 3) ? xc7VarZ0.f : 0.0f;
        int iRound = Math.round(f3 + f2);
        int iRound2 = Math.round(f5 + f + f4);
        final jl5 jl5VarC = zn4Var.C(t61.i(-iRound, -iRound2, j));
        return fo4Var.u(t61.g(jl5VarC.m + iRound, j), t61.f(jl5VarC.n + iRound2, j), fa2.m, new Function1() { // from class: o.sc7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((il5) obj).g(jl5VarC, Math.round(f2), Math.round(f4), 0.0f);
                return f88.a;
            }
        });
    }
}
