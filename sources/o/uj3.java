package o;

/* JADX INFO: loaded from: classes.dex */
public class uj3 extends pj3 implements r04 {
    public qj8 C;

    public uj3(qj8 qj8Var) {
        this.C = qj8Var;
    }

    @Override // o.pj3
    public final qj8 U0(qj8 qj8Var) {
        return new c88(qj8Var, this.C);
    }

    @Override // o.pj3
    public final void V0() {
        super.V0();
        vn4.p0(this).S();
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        int iC = this.B.c(fo4Var, fo4Var.getLayoutDirection()) - this.A.c(fo4Var, fo4Var.getLayoutDirection());
        int iD = this.B.d(fo4Var) - this.A.d(fo4Var);
        int iA = (this.B.a(fo4Var, fo4Var.getLayoutDirection()) - this.A.a(fo4Var, fo4Var.getLayoutDirection())) + iC;
        int iB = (this.B.b(fo4Var) - this.A.b(fo4Var)) + iD;
        jl5 jl5VarC = zn4Var.C(t61.i(-iA, -iB, j));
        return fo4Var.u(t61.g(jl5VarC.m + iA, j), t61.f(jl5VarC.n + iB, j), fa2.m, new tj3(jl5VarC, iC, iD, (byte) 0));
    }
}
