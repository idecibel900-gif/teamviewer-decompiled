package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v95 extends hm2 {
    public static final v95 d = new v95(0, 1, 1);

    @Override // o.hm2
    public final void c(rr0 rr0Var, jv jvVar, k17 k17Var, au2 au2Var, sa5 sa5Var) {
        xx4 xx4Var;
        j56 j56Var = (j56) rr0Var.h(0);
        jx4 jx4Var = (jx4) au2Var.j;
        if (jx4Var == null || ((zh5) jx4Var.g(j56Var)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) au2Var.k;
        if (arrayList != null && (xx4Var = (xx4) arrayList.remove(arrayList.size() - 1)) != null) {
            au2Var.f = xx4Var;
        }
        jx4Var.k(j56Var);
    }
}
