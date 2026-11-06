package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class cg6 {
    public static final dg6 a = new dg6(iq8.a, xz2.x);

    public static final dg6 a(dw dwVar, x50 x50Var, ux2 ux2Var, int i) {
        if (im3.n(dwVar, iq8.a) && im3.n(x50Var, xz2.x)) {
            ux2Var.W(-1073830487);
            ux2Var.p(false);
            return a;
        }
        ux2Var.W(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && ux2Var.f(dwVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !ux2Var.f(x50Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objK = ux2Var.K();
        if (z3 || objK == e01.a) {
            objK = new dg6(dwVar, x50Var);
            ux2Var.g0(objK);
        }
        dg6 dg6Var = (dg6) objK;
        ux2Var.p(false);
        return dg6Var;
    }
}
