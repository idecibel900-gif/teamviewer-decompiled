package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum yw7 extends cz7 {
    public yw7() {
        super("ScriptDataEscaped", 21);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        if (tn0Var.c0()) {
            kw7Var.k(this);
            kw7Var.m(cz7.m);
            return;
        }
        char cB0 = tn0Var.b0();
        if (cB0 == 0) {
            kw7Var.l(this);
            tn0Var.e();
            kw7Var.e((char) 65533);
        } else if (cB0 == '-') {
            kw7Var.e('-');
            kw7Var.a(cz7.I);
        } else if (cB0 != '<') {
            kw7Var.f(tn0Var.J('-', '<', (char) 0));
        } else {
            kw7Var.a(cz7.K);
        }
    }
}
