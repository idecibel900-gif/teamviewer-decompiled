package o;

/* JADX INFO: loaded from: classes.dex */
public final class na5 extends hm2 {
    public static final na5 d = new na5(1, 0, 2);

    @Override // o.hm2
    public final void c(rr0 rr0Var, jv jvVar, k17 k17Var, au2 au2Var, sa5 sa5Var) {
        int iG = rr0Var.g(0);
        int i = k17Var.v;
        int iM = k17Var.M(k17Var.b, k17Var.q(i));
        int iF = k17Var.f(k17Var.b, k17Var.q(i + 1));
        for (int iMax = Math.max(iM, iF - iG); iMax < iF; iMax++) {
            Object obj = k17Var.c[k17Var.g(iMax)];
            if (obj instanceof yx2) {
                au2Var.f((yx2) obj);
            } else if (obj instanceof j56) {
                ((j56) obj).c();
            }
        }
        if (iG <= 0) {
            i01.a("Check failed");
        }
        int i2 = k17Var.v;
        int iM2 = k17Var.M(k17Var.b, k17Var.q(i2));
        int iF2 = k17Var.f(k17Var.b, k17Var.q(i2 + 1)) - iG;
        if (iF2 < iM2) {
            i01.a("Check failed");
        }
        k17Var.I(iF2, iG, i2);
        int i3 = k17Var.i;
        if (i3 >= iM2) {
            k17Var.i = i3 - iG;
        }
    }
}
