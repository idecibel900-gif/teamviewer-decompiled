package o;

/* JADX INFO: loaded from: classes.dex */
public class p51 {
    public final cw0 a;
    public final cw0 b;
    public final cw0 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public p51(cw0 cw0Var, cw0 cw0Var2, int i) {
        cw0 cw0VarM = di1.q(cw0Var.b, 12884901888L) ? ck3.m(cw0Var) : cw0Var;
        cw0 cw0VarM2 = di1.q(cw0Var2.b, 12884901888L) ? ck3.m(cw0Var2) : cw0Var2;
        float[] fArrA = db8.A;
        float[] fArr = null;
        if (i == 3) {
            boolean zQ = di1.q(cw0Var.b, 12884901888L);
            boolean zQ2 = di1.q(cw0Var2.b, 12884901888L);
            if ((!zQ || !zQ2) && (zQ || zQ2)) {
                wi8 wi8Var = ((td6) (zQ ? cw0Var : cw0Var2)).d;
                float[] fArrA2 = zQ ? wi8Var.a() : fArrA;
                fArrA = zQ2 ? wi8Var.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            }
        }
        this(cw0Var2, cw0VarM, cw0VarM2, fArr);
    }

    public long a(long j) {
        float fG = rv0.g(j);
        float f = rv0.f(j);
        float fD = rv0.d(j);
        float fC = rv0.c(j);
        cw0 cw0Var = this.b;
        long jD = cw0Var.d(fG, f, fD);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE = cw0Var.e(fG, f, fD);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE *= fArr[2];
        }
        float f2 = fIntBitsToFloat;
        float f3 = fIntBitsToFloat2;
        return this.c.f(f2, f3, fE, fC, this.a);
    }

    public p51(cw0 cw0Var, cw0 cw0Var2, cw0 cw0Var3, float[] fArr) {
        this.a = cw0Var;
        this.b = cw0Var2;
        this.c = cw0Var3;
        this.d = fArr;
    }
}
