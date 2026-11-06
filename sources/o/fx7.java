package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum fx7 extends cz7 {
    public fx7() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cB0 = tn0Var.b0();
        if (cB0 == 0) {
            kw7Var.l(this);
            tn0Var.e();
            kw7Var.e((char) 65533);
        } else if (cB0 == '-') {
            kw7Var.e(cB0);
            kw7Var.a(cz7.P);
        } else if (cB0 == '<') {
            kw7Var.e(cB0);
            kw7Var.a(cz7.R);
        } else if (cB0 != 65535) {
            kw7Var.f(tn0Var.J('-', '<', (char) 0));
        } else {
            kw7Var.k(this);
            kw7Var.m(cz7.m);
        }
    }
}
