package o;

/* JADX INFO: loaded from: classes.dex */
public final class md5 extends es4 implements r04 {
    public float A;
    public float B;
    public float C;
    public float D;
    public boolean E;

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        int iQ0 = fo4Var.q0(this.C) + fo4Var.q0(this.A);
        int iQ1 = fo4Var.q0(this.D) + fo4Var.q0(this.B);
        jl5 jl5VarC = zn4Var.C(t61.i(-iQ0, -iQ1, j));
        return fo4Var.u(t61.g(jl5VarC.m + iQ0, j), t61.f(jl5VarC.n + iQ1, j), fa2.m, new o43(this, jl5VarC, (byte) 20));
    }
}
