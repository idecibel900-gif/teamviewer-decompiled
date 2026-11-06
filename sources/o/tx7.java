package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum tx7 extends cz7 {
    public tx7() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cU = tn0Var.u();
        lx7 lx7Var = cz7.T;
        if (cU == '\t' || cU == '\n' || cU == '\f' || cU == '\r' || cU == ' ') {
            kw7Var.m(lx7Var);
            return;
        }
        if (cU == '/') {
            kw7Var.m(cz7.b0);
            return;
        }
        vw7 vw7Var = cz7.m;
        if (cU == 65535) {
            kw7Var.k(this);
            kw7Var.m(vw7Var);
        } else if (cU == '>') {
            kw7Var.j();
            kw7Var.m(vw7Var);
        } else {
            if (cU == '?' && (kw7Var.k instanceof gw7)) {
                return;
            }
            tn0Var.O0();
            kw7Var.l(this);
            kw7Var.m(lx7Var);
        }
    }
}
