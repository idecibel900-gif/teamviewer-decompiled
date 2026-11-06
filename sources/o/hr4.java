package o;

/* JADX INFO: loaded from: classes.dex */
public final class hr4 {
    public static hr4 h;
    public final j04 a;
    public final ot7 b;
    public final ln1 c;
    public final mr2 d;
    public final ot7 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public hr4(j04 j04Var, ot7 ot7Var, ln1 ln1Var, mr2 mr2Var) {
        this.a = j04Var;
        this.b = ot7Var;
        this.c = ln1Var;
        this.d = mr2Var;
        this.e = y57.C(ot7Var, j04Var);
    }

    public final long a(int i, long j) {
        int iJ;
        float f = this.g;
        float f2 = this.f;
        int i2 = 1;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = ir4.a;
            ot7 ot7Var = this.e;
            ea2 ea2Var = ea2.m;
            mr2 mr2Var = this.d;
            ln1 ln1Var = this.c;
            mj mjVar = new mj(new qj(str, ot7Var, ea2Var, ea2Var, mr2Var, ln1Var, false), 1, 1, t61.b(0, 0, 0, 0, 15));
            i2 = 1;
            float f3 = new mj(new qj(ir4.b, ot7Var, ea2Var, ea2Var, this.d, ln1Var, true), 2, 1, t61.b(0, 0, 0, 0, 15)).f;
            float f4 = mjVar.f;
            float f5 = f3 - f4;
            this.g = f4;
            this.f = f5;
            f2 = f5;
            f = f4;
        }
        if (i != i2) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iJ = iRound >= 0 ? iRound : 0;
            int iH = r61.h(j);
            if (iJ > iH) {
                iJ = iH;
            }
        } else {
            iJ = r61.j(j);
        }
        return t61.a(r61.k(j), r61.i(j), iJ, r61.h(j));
    }
}
