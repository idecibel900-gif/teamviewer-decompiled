package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum hx7 extends cz7 {
    public hx7() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cU = tn0Var.u();
        fx7 fx7Var = cz7.O;
        if (cU == 0) {
            kw7Var.l(this);
            kw7Var.e((char) 65533);
            kw7Var.m(fx7Var);
        } else if (cU == '-') {
            kw7Var.e(cU);
            kw7Var.m(cz7.Q);
        } else if (cU == '<') {
            kw7Var.e(cU);
            kw7Var.m(cz7.R);
        } else if (cU != 65535) {
            kw7Var.e(cU);
            kw7Var.m(fx7Var);
        } else {
            kw7Var.k(this);
            kw7Var.m(cz7.m);
        }
    }
}
