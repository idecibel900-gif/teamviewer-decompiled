package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum bz7 extends cz7 {
    public bz7() {
        super("EndTagOpen", 8);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        boolean zC0 = tn0Var.c0();
        vw7 vw7Var = cz7.m;
        if (zC0) {
            kw7Var.k(this);
            kw7Var.f("</");
            kw7Var.m(vw7Var);
        } else if (tn0Var.H0()) {
            kw7Var.d(false);
            kw7Var.m(cz7.v);
        } else {
            if (tn0Var.o0('>')) {
                kw7Var.l(this);
                kw7Var.a(vw7Var);
                return;
            }
            kw7Var.l(this);
            aw7 aw7Var = kw7Var.n;
            aw7Var.f();
            aw7Var.g('/');
            kw7Var.m(cz7.c0);
        }
    }
}
