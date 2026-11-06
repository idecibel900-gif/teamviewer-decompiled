package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum zw7 extends cz7 {
    public zw7() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        if (tn0Var.c0()) {
            kw7Var.k(this);
            kw7Var.m(cz7.m);
            return;
        }
        char cU = tn0Var.u();
        yw7 yw7Var = cz7.H;
        if (cU == 0) {
            kw7Var.l(this);
            kw7Var.e((char) 65533);
            kw7Var.m(yw7Var);
        } else if (cU == '-') {
            kw7Var.e(cU);
            kw7Var.m(cz7.J);
        } else if (cU == '<') {
            kw7Var.m(cz7.K);
        } else {
            kw7Var.e(cU);
            kw7Var.m(yw7Var);
        }
    }
}
