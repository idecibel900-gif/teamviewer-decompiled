package o;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ea5 extends hm2 {
    public static final ea5 d = new ea5(0, 1, 1);

    @Override // o.hm2
    public final void c(rr0 rr0Var, jv jvVar, k17 k17Var, au2 au2Var, sa5 sa5Var) {
        j56 j56Var = (j56) rr0Var.h(0);
        Set set = (Set) au2Var.b;
        if (set == null) {
            return;
        }
        zh5 zh5Var = new zh5(set);
        jx4 jx4Var = (jx4) au2Var.j;
        if (jx4Var == null) {
            long[] jArr = ti6.a;
            jx4Var = new jx4();
            au2Var.j = jx4Var;
        }
        jx4Var.m(j56Var, zh5Var);
        ((xx4) au2Var.f).b(new yx2(zh5Var, -1));
    }
}
