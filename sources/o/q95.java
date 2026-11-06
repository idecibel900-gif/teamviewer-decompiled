package o;

/* JADX INFO: loaded from: classes.dex */
public final class q95 extends hm2 {
    public static final q95 d = new q95(0, 2, 1);

    @Override // o.hm2
    public final void c(rr0 rr0Var, jv jvVar, k17 k17Var, au2 au2Var, sa5 sa5Var) {
        int i;
        al3 al3Var = (al3) rr0Var.h(0);
        int iC = k17Var.c((px2) rr0Var.h(1));
        if (k17Var.t >= iC) {
            i01.a("Check failed");
        }
        ep1.B(k17Var, jvVar, iC);
        int i2 = k17Var.t;
        int iD = k17Var.v;
        while (iD >= 0 && !k17Var.x(iD)) {
            iD = k17Var.D(k17Var.b, iD);
        }
        int iT = iD + 1;
        int iK = 0;
        while (iT < i2) {
            if (k17Var.u(i2, iT)) {
                if (k17Var.x(iT)) {
                    iK = 0;
                }
                iT++;
            } else {
                iK += k17Var.x(iT) ? 1 : k17Var.b[(k17Var.q(iT) * 5) + 1] & 67108863;
                iT += k17Var.t(iT);
            }
        }
        while (true) {
            i = k17Var.t;
            if (i >= iC) {
                break;
            }
            if (k17Var.u(iC, i)) {
                int i3 = k17Var.t;
                if (i3 < k17Var.u && (k17Var.b[(k17Var.q(i3) * 5) + 1] & 1073741824) != 0) {
                    jvVar.d(k17Var.C(k17Var.t));
                    iK = 0;
                }
                k17Var.O();
            } else {
                iK += k17Var.K();
            }
        }
        if (i != iC) {
            i01.a("Check failed");
        }
        al3Var.a = iK;
    }
}
