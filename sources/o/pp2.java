package o;

/* JADX INFO: loaded from: classes.dex */
public final class pp2 {
    public final void a(zn4 zn4Var, zn4 zn4Var2, long j) {
        long jV = us1.v(j, q14.m);
        if (zn4Var != null) {
            int iK = zn4Var.k(r61.h(jV));
            new rk3(rk3.a(iK, zn4Var.V(iK)));
        }
        if (zn4Var2 != null) {
            int iK2 = zn4Var2.k(r61.h(jV));
            new rk3(rk3.a(iK2, zn4Var2.V(iK2)));
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pp2);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + fx3.a(0, op2.m.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + op2.m + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
