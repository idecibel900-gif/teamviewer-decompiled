package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class r07 {
    static {
        db8.A0(0.0f, 0.0f, null, 7);
    }

    public static final i97 a(long j, rl2 rl2Var, ux2 ux2Var, int i, int i2) {
        String str = (i2 & 4) != 0 ? "ColorAnimation" : "rowBackground";
        boolean zF = ux2Var.f(rv0.e(j));
        Object objK = ux2Var.K();
        if (zF || objK == e01.a) {
            yn1 yn1Var = new yn1(zm.t, new io.sentry.okhttp.b(rv0.e(j), (byte) 5));
            ux2Var.g0(yn1Var);
            objK = yn1Var;
        }
        return vm.b(new rv0(j), (yn1) objK, rl2Var, null, str, ux2Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
