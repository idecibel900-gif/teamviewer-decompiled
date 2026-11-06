package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ka5 extends hm2 {
    public static final ka5 d = new ka5(0, 1, 1);

    @Override // o.hm2
    public final void c(rr0 rr0Var, jv jvVar, k17 k17Var, au2 au2Var, sa5 sa5Var) {
        j56 j56Var = (j56) rr0Var.h(0);
        jx4 jx4Var = (jx4) au2Var.j;
        zh5 zh5Var = jx4Var != null ? (zh5) jx4Var.g(j56Var) : null;
        if (zh5Var != null) {
            ArrayList arrayList = (ArrayList) au2Var.k;
            if (arrayList == null) {
                arrayList = new ArrayList();
                au2Var.k = arrayList;
            }
            arrayList.add((xx4) au2Var.f);
            au2Var.f = zh5Var.n;
        }
    }
}
