package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l14 extends z04 {
    public final /* synthetic */ p14 b;
    public final /* synthetic */ hw2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l14(p14 p14Var, hw2 hw2Var, String str) {
        super(str);
        this.b = p14Var;
        this.c = hw2Var;
    }

    @Override // o.do4
    public final eo4 c(fo4 fo4Var, List list, long j) {
        p14 p14Var = this.b;
        j14 j14Var = p14Var.t;
        j14Var.m = fo4Var.getLayoutDirection();
        j14Var.n = fo4Var.getDensity();
        j14Var.f1121o = fo4Var.Z();
        boolean zB0 = fo4Var.b0();
        hw2 hw2Var = this.c;
        if (zB0 || p14Var.m.u == null) {
            p14Var.p = 0;
            eo4 eo4Var = (eo4) hw2Var.invoke(j14Var, new r61(j));
            return new k14(eo4Var, p14Var, p14Var.p, eo4Var, (byte) 1);
        }
        p14Var.q = 0;
        eo4 eo4Var2 = (eo4) hw2Var.invoke(p14Var.u, new r61(j));
        return new k14(eo4Var2, p14Var, p14Var.q, eo4Var2, (byte) 0);
    }
}
