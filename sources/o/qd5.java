package o;

/* JADX INFO: loaded from: classes.dex */
public final class qd5 extends es4 implements r04 {
    public nd5 A;

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        float fA = this.A.a(fo4Var.getLayoutDirection());
        float fD = this.A.d();
        float fB = this.A.b(fo4Var.getLayoutDirection());
        float fC = this.A.c();
        if (!((w32.a(fA, 0.0f) >= 0) & (w32.a(fD, 0.0f) >= 0) & (w32.a(fB, 0.0f) >= 0) & (w32.a(fC, 0.0f) >= 0))) {
            ii3.a("Padding must be non-negative");
        }
        int iQ0 = fo4Var.q0(fA);
        int iQ1 = fo4Var.q0(fB) + iQ0;
        int iQ2 = fo4Var.q0(fD);
        int iQ3 = fo4Var.q0(fC) + iQ2;
        jl5 jl5VarC = zn4Var.C(t61.i(-iQ1, -iQ3, j));
        return fo4Var.u(t61.g(jl5VarC.m + iQ1, j), t61.f(jl5VarC.n + iQ3, j), fa2.m, new tj3(jl5VarC, iQ0, iQ2, (byte) 2));
    }
}
