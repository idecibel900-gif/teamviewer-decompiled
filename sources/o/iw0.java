package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class iw0 {
    public static final kw0 a = new kw0(iq8.c, xz2.A);

    public static final kw0 a(gw gwVar, w50 w50Var, ux2 ux2Var, int i) {
        if (im3.n(gwVar, iq8.c) && w50Var.equals(xz2.A)) {
            ux2Var.W(-1446604504);
            ux2Var.p(false);
            return a;
        }
        ux2Var.W(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && ux2Var.f(gwVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !ux2Var.f(w50Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objK = ux2Var.K();
        if (z3 || objK == e01.a) {
            objK = new kw0(gwVar, w50Var);
            ux2Var.g0(objK);
        }
        kw0 kw0Var = (kw0) objK;
        ux2Var.p(false);
        return kw0Var;
    }
}
