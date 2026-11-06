package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum bx7 extends cz7 {
    public bx7() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        if (tn0Var.H0()) {
            kw7Var.g.A();
            kw7Var.g.f(tn0Var.b0());
            kw7Var.e('<');
            kw7Var.e(tn0Var.b0());
            kw7Var.a(cz7.N);
            return;
        }
        if (tn0Var.o0('/')) {
            kw7Var.a(cz7.L);
        } else {
            kw7Var.e('<');
            kw7Var.m(cz7.H);
        }
    }
}
