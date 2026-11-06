package o;

/* JADX INFO: loaded from: classes2.dex */
public final class co8 extends q54 {
    public final boolean q;

    public co8(String str, boolean z) {
        super(str);
        this.q = z;
    }

    @Override // o.x35
    public final void D(lq1 lq1Var, h32 h32Var) {
        lq1 lq1VarK = lq1Var.k("<");
        boolean z = this.q;
        lq1VarK.k(z ? "!" : "?").k(Q());
        ly lyVarG = g();
        lyVarG.getClass();
        ky kyVar = new ky(lyVarG);
        while (kyVar.hasNext()) {
            jy jyVar = (jy) kyVar.next();
            String str = jyVar.m;
            String strC = ly.c(jyVar.n);
            if (!str.equals("#declaration")) {
                lq1Var.j(' ');
                lq1Var.k(str);
                if (!strC.isEmpty()) {
                    lq1Var.k("=\"");
                    dc2.c(lq1Var, strC, h32Var, 2);
                    lq1Var.j('\"');
                }
            }
        }
        lq1Var.k(z ? "" : "?").k(">");
    }

    @Override // o.x35
    /* JADX INFO: renamed from: clone */
    public final Object m() {
        return (co8) super.m();
    }

    @Override // o.x35
    public final x35 m() {
        return (co8) super.m();
    }

    @Override // o.x35
    public final String toString() {
        return B();
    }

    @Override // o.x35
    public final String x() {
        return "#declaration";
    }
}
