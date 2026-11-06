package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rc2 implements rg2 {
    @Override // o.rg2
    public final int a() {
        return 2;
    }

    @Override // o.rg2
    public final int b(xi0 xi0Var, xi0 xi0Var2, ns4 ns4Var) {
        xi0Var.getClass();
        xi0Var2.getClass();
        if (!(xi0Var2 instanceof eo3)) {
            return 3;
        }
        eo3 eo3Var = (eo3) xi0Var2;
        if (!eo3Var.getTypeParameters().isEmpty()) {
            return 3;
        }
        gc5 gc5VarI = hc5.i(xi0Var, xi0Var2);
        if ((gc5VarI != null ? gc5VarI.b() : 0) != 0) {
            return 3;
        }
        List listJ = eo3Var.J();
        listJ.getClass();
        h18 h18Var = new h18(new fx(listJ, (byte) 1), ek.G);
        oz3 oz3Var = eo3Var.s;
        oz3Var.getClass();
        km2 km2VarG0 = bq6.g0(cx.A0(new zp6[]{h18Var, new fx(oz3Var, (byte) 5)}));
        v14 v14Var = eo3Var.u;
        jm2 jm2Var = new jm2(bq6.g0(cx.A0(new zp6[]{km2VarG0, new fx(qf0.M(v14Var != null ? v14Var.getType() : null), (byte) 1)})));
        while (jm2Var.hasNext()) {
            oz3 oz3Var2 = (oz3) jm2Var.next();
            if (!oz3Var2.m0().isEmpty() && !(oz3Var2.r0() instanceof y06)) {
                return 3;
            }
        }
        xi0 xi0VarBuild = (xi0) xi0Var.d(new m58(new x06()));
        if (xi0VarBuild == null) {
            return 3;
        }
        if (xi0VarBuild instanceof c07) {
            c07 c07Var = (c07) xi0VarBuild;
            if (!c07Var.getTypeParameters().isEmpty()) {
                xi0VarBuild = c07Var.g0().A().build();
                xi0VarBuild.getClass();
            }
        }
        int iB = hc5.c.n(xi0VarBuild, xi0Var2, false).b();
        if (iB != 0) {
            return qc2.a[ua5.B(iB)] == 1 ? 1 : 3;
        }
        throw null;
    }
}
