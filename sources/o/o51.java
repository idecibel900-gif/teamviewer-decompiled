package o;

/* JADX INFO: loaded from: classes.dex */
public final class o51 extends p51 {
    public final td6 e;
    public final td6 f;
    public final float[] g;

    public o51(td6 td6Var, td6 td6Var2) {
        float[] fArrZ;
        super(td6Var2, td6Var, td6Var2, null);
        this.e = td6Var;
        this.f = td6Var2;
        float[] fArr = (float[]) df6.q.n;
        wi8 wi8Var = td6Var.d;
        float[] fArr2 = td6Var.i;
        wi8 wi8Var2 = td6Var2.d;
        float[] fArr3 = td6Var2.j;
        if (ck3.v(wi8Var, wi8Var2)) {
            fArrZ = ck3.Z(fArr3, fArr2);
        } else {
            float[] fArrA = wi8Var.a();
            float[] fArrA2 = wi8Var2.a();
            wi8 wi8Var3 = db8.x;
            fArrZ = ck3.Z(ck3.v(wi8Var2, wi8Var3) ? fArr3 : ck3.V(ck3.Z(ck3.r(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), td6Var2.i)), ck3.v(wi8Var, wi8Var3) ? fArr2 : ck3.Z(ck3.r(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrZ;
    }

    @Override // o.p51
    public final long a(long j) {
        float fG = rv0.g(j);
        float f = rv0.f(j);
        float fD = rv0.d(j);
        float fC = rv0.c(j);
        pd6 pd6Var = this.e.p;
        float fE = (float) pd6Var.e(fG);
        float fE2 = (float) pd6Var.e(f);
        float fE3 = (float) pd6Var.e(fD);
        float[] fArr = this.g;
        float f2 = (fArr[6] * fE3) + (fArr[3] * fE2) + (fArr[0] * fE);
        float f3 = (fArr[7] * fE3) + (fArr[4] * fE2) + (fArr[1] * fE);
        float f4 = (fArr[8] * fE3) + (fArr[5] * fE2) + (fArr[2] * fE);
        td6 td6Var = this.f;
        pd6 pd6Var2 = td6Var.m;
        return j51.h((float) pd6Var2.e(f2), (float) pd6Var2.e(f3), (float) pd6Var2.e(f4), fC, td6Var);
    }
}
