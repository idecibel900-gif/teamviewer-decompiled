package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sc2 extends cs0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public sc2(sy4 sy4Var) {
        hd2 hd2Var = hd2.a;
        yc2 yc2Var = hd2.b;
        pd4 pd4Var = xd4.e;
        as4 as4Var = as4.p;
        ms0 ms0Var = ms0.m;
        List list = ea2.m;
        super(yc2Var, sy4Var, as4Var, ms0Var, list, pd4Var);
        wr0 wr0Var = new wr0(this, null, yl7.p, true, 1, s67.h);
        wr0Var.P0(list, dp1.d);
        cd2 cd2VarB = hd2.b(dd2.SCOPE_FOR_ERROR_CLASS, wr0Var.getName().m, "");
        gd2 gd2Var = gd2.H;
        wr0Var.s = new ed2(hd2.d(gd2Var, new String[0]), cd2VarB, gd2Var, list, false, new String[0]);
        C0(cd2VarB, lv1.V(wr0Var), wr0Var);
    }

    @Override // o.d0
    /* JADX INFO: renamed from: B0 */
    public final ns4 d(m58 m58Var) {
        m58Var.getClass();
        return this;
    }

    @Override // o.d0, o.ie7
    public final hi1 d(m58 m58Var) {
        m58Var.getClass();
        return this;
    }

    @Override // o.ns4
    public final zo4 m0(k58 k58Var, uz3 uz3Var) {
        return hd2.b(dd2.SCOPE_FOR_ERROR_CLASS, getName().m, k58Var.toString());
    }

    @Override // o.cs0
    public final String toString() {
        String strB = getName().b();
        strB.getClass();
        return strB;
    }
}
