package o;

/* JADX INFO: loaded from: classes.dex */
public final class z07 extends es4 implements r04 {
    public float A;
    public float B;
    public float C;
    public float D;
    public boolean E;

    @Override // o.r04
    public final int H(rg4 rg4Var, zn4 zn4Var, int i) {
        long jU0 = U0(rg4Var);
        if (r61.g(jU0)) {
            return r61.i(jU0);
        }
        if (!this.E) {
            i = t61.f(i, jU0);
        }
        return t61.g(zn4Var.k(i), jU0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long U0(fo4 fo4Var) {
        int iQ0;
        int iQ1;
        int iQ2;
        int i = 0;
        if (Float.isNaN(this.C)) {
            iQ0 = Integer.MAX_VALUE;
        } else {
            iQ0 = fo4Var.q0(this.C);
            if (iQ0 < 0) {
                iQ0 = 0;
            }
        }
        if (Float.isNaN(this.D)) {
            iQ1 = Integer.MAX_VALUE;
        } else {
            iQ1 = fo4Var.q0(this.D);
            if (iQ1 < 0) {
                iQ1 = 0;
            }
        }
        if (Float.isNaN(this.A)) {
            iQ2 = 0;
        } else {
            iQ2 = fo4Var.q0(this.A);
            if (iQ2 < 0) {
                iQ2 = 0;
            }
            if (iQ2 > iQ0) {
                iQ2 = iQ0;
            }
            if (iQ2 == Integer.MAX_VALUE) {
                iQ2 = 0;
            }
        }
        if (!Float.isNaN(this.B)) {
            int iQ3 = fo4Var.q0(this.B);
            if (iQ3 < 0) {
                iQ3 = 0;
            }
            if (iQ3 > iQ1) {
                iQ3 = iQ1;
            }
            if (iQ3 != Integer.MAX_VALUE) {
                i = iQ3;
            }
        }
        return t61.a(iQ2, iQ0, i, iQ1);
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        int iK;
        int i;
        int iJ;
        int iH;
        long jA;
        long jU0 = U0(fo4Var);
        if (this.E) {
            jA = t61.e(j, jU0);
        } else {
            if (Float.isNaN(this.A)) {
                iK = r61.k(j);
                int i2 = r61.i(jU0);
                if (iK > i2) {
                    iK = i2;
                }
            } else {
                iK = r61.k(jU0);
            }
            if (Float.isNaN(this.C)) {
                i = r61.i(j);
                int iK2 = r61.k(jU0);
                if (i < iK2) {
                    i = iK2;
                }
            } else {
                i = r61.i(jU0);
            }
            if (Float.isNaN(this.B)) {
                iJ = r61.j(j);
                int iH2 = r61.h(jU0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = r61.j(jU0);
            }
            if (Float.isNaN(this.D)) {
                iH = r61.h(j);
                int iJ2 = r61.j(jU0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = r61.h(jU0);
            }
            jA = t61.a(iK, i, iJ, iH);
        }
        jl5 jl5VarC = zn4Var.C(jA);
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new v0(jl5VarC, (byte) 11));
    }

    @Override // o.r04
    public final int a0(rg4 rg4Var, zn4 zn4Var, int i) {
        long jU0 = U0(rg4Var);
        if (r61.g(jU0)) {
            return r61.i(jU0);
        }
        if (!this.E) {
            i = t61.f(i, jU0);
        }
        return t61.g(zn4Var.o(i), jU0);
    }

    @Override // o.r04
    public final int g(rg4 rg4Var, zn4 zn4Var, int i) {
        long jU0 = U0(rg4Var);
        if (r61.f(jU0)) {
            return r61.h(jU0);
        }
        if (!this.E) {
            i = t61.g(i, jU0);
        }
        return t61.f(zn4Var.a(i), jU0);
    }

    @Override // o.r04
    public final int r0(rg4 rg4Var, zn4 zn4Var, int i) {
        long jU0 = U0(rg4Var);
        if (r61.f(jU0)) {
            return r61.h(jU0);
        }
        if (!this.E) {
            i = t61.g(i, jU0);
        }
        return t61.f(zn4Var.V(i), jU0);
    }
}
