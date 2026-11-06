package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class ut7 {
    public static final kh7 a = new kh7(new jv6((byte) 26));
    public static final tf2 b;

    static {
        new kh7(new jv6((byte) 27));
        long j = vv0.H;
        long j2 = vv0.I;
        long j3 = vv0.J;
        long j4 = vv0.K;
        long j5 = vv0.L;
        b = new tf2(vv0.S, vv0.T, vv0.U, vv0.N, vv0.O, j2, vv0.P, vv0.Q, vv0.M, vv0.V, vv0.W, j5, j4, vv0.R, j3, j, 402657842);
        long j6 = vv0.E0;
        long j7 = vv0.F0;
        long j8 = vv0.G0;
        long j9 = vv0.H0;
        long j10 = vv0.I0;
        new tf2(vv0.P0, vv0.Q0, vv0.R0, vv0.K0, vv0.L0, j7, vv0.M0, vv0.N0, vv0.J0, vv0.S0, vv0.T0, j10, j9, vv0.O0, j8, j6, 402657842);
    }

    public static final void a(yy0 yy0Var, ux2 ux2Var, int i) {
        yy0 yy0Var2;
        ux2 ux2Var2;
        ux2Var.Y(-760503756);
        int i2 = i | 2;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                ka0.x(ux2Var);
            } else {
                ux2Var.Q();
            }
            ux2Var.q();
            yy0Var2 = yy0Var;
            ux2Var2 = ux2Var;
            n37.c(b, (zv0) a.getValue(), null, null, yy0Var2, ux2Var2, 24576);
        } else {
            yy0Var2 = yy0Var;
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new np2(yy0Var2, i, (byte) 5);
        }
    }
}
