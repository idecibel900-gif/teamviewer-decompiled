package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class fq7 {
    public static final String a = bc7.K(10, "H");

    public static long a(ot7 ot7Var, in1 in1Var, mr2 mr2Var) {
        mj mjVarB = b(ot7Var, in1Var, mr2Var, 1, false);
        return (((long) v67.f(mjVarB.a.c())) << 32) | (((long) v67.f(mjVarB.f)) & 4294967295L);
    }

    public static final mj b(ot7 ot7Var, in1 in1Var, mr2 mr2Var, int i, boolean z) {
        String strT0 = lv0.t0(ct1.b0(0, i), "\n", null, null, new vs6((byte) 20), 30);
        ea2 ea2Var = ea2.m;
        return new mj(new qj(strT0, ot7Var, ea2Var, ea2Var, mr2Var, in1Var, z), i, 1, t61.b(0, 0, 0, 0, 15));
    }
}
