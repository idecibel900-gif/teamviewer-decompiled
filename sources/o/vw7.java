package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum vw7 extends cz7 {
    public vw7() {
        super("Data", 0);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cB0 = tn0Var.b0();
        if (cB0 == 0) {
            kw7Var.l(this);
            kw7Var.e(tn0Var.u());
        } else {
            if (cB0 == '&') {
                kw7Var.a(cz7.n);
                return;
            }
            if (cB0 == '<') {
                kw7Var.a(cz7.t);
            } else if (cB0 != 65535) {
                kw7Var.f(tn0Var.J('&', '<', (char) 0));
            } else {
                kw7Var.g(new cw7());
            }
        }
    }
}
