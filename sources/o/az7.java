package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum az7 extends cz7 {
    public az7() {
        super("TagOpen", 7);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cB0 = tn0Var.b0();
        if (cB0 == '!') {
            kw7Var.a(cz7.d0);
            return;
        }
        if (cB0 == '/') {
            kw7Var.a(cz7.u);
            return;
        }
        if (cB0 == '?') {
            if (kw7Var.h == 2) {
                kw7Var.a(cz7.e0);
                return;
            } else {
                kw7Var.n.f();
                kw7Var.m(cz7.c0);
                return;
            }
        }
        if (tn0Var.H0()) {
            kw7Var.d(true);
            kw7Var.m(cz7.v);
        } else {
            kw7Var.l(this);
            kw7Var.e('<');
            kw7Var.m(cz7.m);
        }
    }
}
