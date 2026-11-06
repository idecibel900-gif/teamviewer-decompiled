package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class b08 {
    public static final float a;

    static {
        nv1.a(16.0f, 8.0f);
        a = 200.0f;
    }

    public static h08 a(ux2 ux2Var) {
        pd5 pd5Var = g08.a;
        int iQ0 = ((in1) ux2Var.j(b11.h)).q0(4.0f);
        long jA = ((n54) ((mj8) ux2Var.j(b11.u))).a();
        boolean zD = ux2Var.d(iQ0) | ux2Var.e(jA);
        Object objK = ux2Var.K();
        if (zD || objK == e01.a) {
            objK = new h08(iQ0, jA);
            ux2Var.g0(objK);
        }
        return (h08) objK;
    }
}
