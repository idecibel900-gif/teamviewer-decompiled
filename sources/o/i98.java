package o;

/* JADX INFO: loaded from: classes.dex */
public final class i98 extends es4 implements r04 {
    public float A;
    public float B;

    @Override // o.r04
    public final int H(rg4 rg4Var, zn4 zn4Var, int i) {
        int iK = zn4Var.k(i);
        int iQ0 = !Float.isNaN(this.A) ? rg4Var.q0(this.A) : 0;
        return iK < iQ0 ? iQ0 : iK;
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        int iK;
        int iJ;
        if (Float.isNaN(this.A) || r61.k(j) != 0) {
            iK = r61.k(j);
        } else {
            int iQ0 = fo4Var.q0(this.A);
            iK = r61.i(j);
            if (iQ0 < 0) {
                iQ0 = 0;
            }
            if (iQ0 <= iK) {
                iK = iQ0;
            }
        }
        int i = r61.i(j);
        if (Float.isNaN(this.B) || r61.j(j) != 0) {
            iJ = r61.j(j);
        } else {
            int iQ1 = fo4Var.q0(this.B);
            iJ = r61.h(j);
            int i2 = iQ1 >= 0 ? iQ1 : 0;
            if (i2 <= iJ) {
                iJ = i2;
            }
        }
        jl5 jl5VarC = zn4Var.C(t61.a(iK, i, iJ, r61.h(j)));
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new v0(jl5VarC, (byte) 16));
    }

    @Override // o.r04
    public final int a0(rg4 rg4Var, zn4 zn4Var, int i) {
        int iO = zn4Var.o(i);
        int iQ0 = !Float.isNaN(this.A) ? rg4Var.q0(this.A) : 0;
        return iO < iQ0 ? iQ0 : iO;
    }

    @Override // o.r04
    public final int g(rg4 rg4Var, zn4 zn4Var, int i) {
        int iA = zn4Var.a(i);
        int iQ0 = !Float.isNaN(this.B) ? rg4Var.q0(this.B) : 0;
        return iA < iQ0 ? iQ0 : iA;
    }

    @Override // o.r04
    public final int r0(rg4 rg4Var, zn4 zn4Var, int i) {
        int iV = zn4Var.V(i);
        int iQ0 = !Float.isNaN(this.B) ? rg4Var.q0(this.B) : 0;
        return iV < iQ0 ? iQ0 : iV;
    }
}
