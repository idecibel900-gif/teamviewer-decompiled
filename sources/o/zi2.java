package o;

/* JADX INFO: loaded from: classes2.dex */
public final class zi2 implements rg2 {
    @Override // o.rg2
    public final int a() {
        return 3;
    }

    @Override // o.rg2
    public final int b(xi0 xi0Var, xi0 xi0Var2, ns4 ns4Var) {
        xi0Var.getClass();
        xi0Var2.getClass();
        if (!(xi0Var2 instanceof bu5) || !(xi0Var instanceof bu5)) {
            return 3;
        }
        bu5 bu5Var = (bu5) xi0Var2;
        bu5 bu5Var2 = (bu5) xi0Var;
        if (!im3.n(bu5Var.getName(), bu5Var2.getName())) {
            return 3;
        }
        if (xo1.S(bu5Var) && xo1.S(bu5Var2)) {
            return 1;
        }
        return (xo1.S(bu5Var) || xo1.S(bu5Var2)) ? 2 : 3;
    }
}
