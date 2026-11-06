package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class v70 extends es4 implements r04, dp6 {
    public Function1 A;

    public v70(Function1 function1) {
        this.A = function1;
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        jl5 jl5VarC = zn4Var.C(j);
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new g0(jl5VarC, this, (byte) 15));
    }

    @Override // o.dp6
    public final boolean f() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.A + ")";
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        pw6 pw6Var;
        boolean z;
        e45 e45VarN0 = vn4.n0(this, 2);
        if (e45VarN0.b0) {
            pw6Var = e45VarN0.X;
            z = e45VarN0.a0;
        } else {
            jd6 jd6Var = di1.r;
            if (jd6Var == null) {
                di1.r = new jd6();
            } else {
                jd6Var.a();
            }
            jd6 jd6Var2 = di1.r;
            jd6Var2.getClass();
            jd6Var2.E = e45VarN0.G.L;
            jd6Var2.C = xs1.a0(e45VarN0.f1179o);
            n47 n47VarC = el5.c();
            Function1 function1E = n47VarC != null ? n47VarC.e() : null;
            n47 n47VarF = el5.f(n47VarC);
            try {
                this.A.invoke(jd6Var2);
                el5.h(n47VarC, n47VarF, function1E);
                pw6Var = jd6Var2.A;
                z = jd6Var2.B;
            } catch (Throwable th) {
                el5.h(n47VarC, n47VarF, function1E);
                throw th;
            }
        }
        if (z) {
            lp6.j(op6Var, pw6Var);
        }
    }
}
