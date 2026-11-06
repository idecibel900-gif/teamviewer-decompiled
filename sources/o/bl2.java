package o;

/* JADX INFO: loaded from: classes.dex */
public final class bl2 extends es4 implements r04 {
    public r12 A;
    public float B;

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        int iK;
        int i;
        int iH;
        int i2;
        if (!r61.e(j) || this.A == r12.m) {
            iK = r61.k(j);
            i = r61.i(j);
        } else {
            int iRound = Math.round(r61.i(j) * this.B);
            int iK2 = r61.k(j);
            iK = r61.i(j);
            if (iRound < iK2) {
                iRound = iK2;
            }
            if (iRound <= iK) {
                iK = iRound;
            }
            i = iK;
        }
        if (!r61.d(j) || this.A == r12.n) {
            int iJ = r61.j(j);
            int iH2 = r61.h(j);
            iH = iJ;
            i2 = iH2;
        } else {
            int iRound2 = Math.round(r61.h(j) * this.B);
            int iJ2 = r61.j(j);
            iH = r61.h(j);
            if (iRound2 < iJ2) {
                iRound2 = iJ2;
            }
            if (iRound2 <= iH) {
                iH = iRound2;
            }
            i2 = iH;
        }
        jl5 jl5VarC = zn4Var.C(t61.a(iK, i, iH, i2));
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new v0(jl5VarC, (byte) 5));
    }
}
