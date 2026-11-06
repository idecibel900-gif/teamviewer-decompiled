package o;

/* JADX INFO: loaded from: classes.dex */
public final class l95 extends hm2 {
    public static final l95 d = new l95(0, 2, 1);

    @Override // o.hm2
    public final void c(rr0 rr0Var, jv jvVar, k17 k17Var, au2 au2Var, sa5 sa5Var) {
        px2 px2Var = (px2) rr0Var.h(0);
        Object objH = rr0Var.h(1);
        if (objH instanceof yx2) {
            yx2 yx2Var = (yx2) objH;
            ((xx4) au2Var.f).b(yx2Var);
            ((kx4) au2Var.e).a(yx2Var);
        }
        if (k17Var.n != 0) {
            i01.a("Can only append a slot if not current inserting");
        }
        int i = k17Var.i;
        int i2 = k17Var.j;
        int iC = k17Var.c(px2Var);
        int iF = k17Var.f(k17Var.b, k17Var.q(iC + 1));
        k17Var.i = iF;
        k17Var.j = iF;
        k17Var.w(1, iC);
        if (i >= iF) {
            i++;
            i2++;
        }
        k17Var.c[iF] = objH;
        k17Var.i = i;
        k17Var.j = i2;
    }
}
