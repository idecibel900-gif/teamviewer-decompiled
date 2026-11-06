package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class qp implements Function1 {
    public final /* synthetic */ byte m;
    public final wy3 n;

    public /* synthetic */ qp(wy3 wy3Var, byte b) {
        this.m = b;
        this.n = wy3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        wy3 wy3Var = this.n;
        switch (b) {
            case 0:
                ps4 ps4Var = (ps4) obj;
                ps4Var.getClass();
                return ps4Var.h().g(wy3Var.u());
            default:
                sy4 sy4Var = (sy4) obj;
                qs4 qs4VarK = wy3Var.k();
                ht2 ht2Var = t87.l;
                d54 d54Var = qs4VarK.y(ht2Var).s;
                if (d54Var == null) {
                    wy3.a(11);
                    throw null;
                }
                ys0 ys0VarG = d54Var.g(sy4Var, t35.m);
                if (ys0VarG == null) {
                    hk0.p(ht2Var.c(sy4Var), " is not found", "Built-in class ");
                    return null;
                }
                if (ys0VarG instanceof ns4) {
                    return (ns4) ys0VarG;
                }
                throw new AssertionError("Must be a class descriptor " + sy4Var + ", but was " + ys0VarG);
        }
    }
}
