package o;

/* JADX INFO: loaded from: classes.dex */
public final class gm3 extends es4 implements r04 {
    public dm3 A;
    public boolean B;

    @Override // o.r04
    public final int H(rg4 rg4Var, zn4 zn4Var, int i) {
        return this.A == dm3.m ? zn4Var.k(i) : zn4Var.o(i);
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        int iK = this.A == dm3.m ? zn4Var.k(r61.h(j)) : zn4Var.o(r61.h(j));
        if (iK < 0) {
            iK = 0;
        }
        if (iK < 0) {
            mi3.a("width must be >= 0");
        }
        long jH = t61.h(iK, iK, 0, Integer.MAX_VALUE);
        if (this.B) {
            jH = t61.e(j, jH);
        }
        jl5 jl5VarC = zn4Var.C(jH);
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new v0(jl5VarC, (byte) 7));
    }

    @Override // o.r04
    public final int a0(rg4 rg4Var, zn4 zn4Var, int i) {
        return this.A == dm3.m ? zn4Var.k(i) : zn4Var.o(i);
    }

    @Override // o.r04
    public final int g(rg4 rg4Var, zn4 zn4Var, int i) {
        return zn4Var.a(i);
    }

    @Override // o.r04
    public final int r0(rg4 rg4Var, zn4 zn4Var, int i) {
        return zn4Var.V(i);
    }
}
