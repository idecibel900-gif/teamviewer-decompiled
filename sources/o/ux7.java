package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum ux7 extends cz7 {
    public ux7() {
        super("SelfClosingStartTag", 41);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cU = tn0Var.u();
        vw7 vw7Var = cz7.m;
        if (cU == '>') {
            kw7Var.k.f = true;
            kw7Var.j();
            kw7Var.m(vw7Var);
        } else if (cU == 65535) {
            kw7Var.k(this);
            kw7Var.m(vw7Var);
        } else {
            tn0Var.O0();
            kw7Var.l(this);
            kw7Var.m(cz7.T);
        }
    }
}
