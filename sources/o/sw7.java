package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum sw7 extends cz7 {
    public sw7() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cU = tn0Var.u();
        if (cU == '!') {
            kw7Var.f("<!");
            kw7Var.m(cz7.F);
            return;
        }
        if (cU == '/') {
            kw7Var.m(cz7.D);
            return;
        }
        if (cU != 65535) {
            kw7Var.e('<');
            tn0Var.O0();
            kw7Var.m(cz7.r);
        } else {
            kw7Var.e('<');
            kw7Var.k(this);
            kw7Var.m(cz7.m);
        }
    }
}
