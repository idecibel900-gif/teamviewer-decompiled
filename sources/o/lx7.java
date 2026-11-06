package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum lx7 extends cz7 {
    public lx7() {
        super("BeforeAttributeName", 33);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cU = tn0Var.u();
        mx7 mx7Var = cz7.U;
        if (cU == 0) {
            tn0Var.O0();
            kw7Var.l(this);
            kw7Var.k.l();
            kw7Var.m(mx7Var);
            return;
        }
        if (cU != ' ') {
            if (cU != '\"' && cU != '\'') {
                if (cU == '/') {
                    kw7Var.m(cz7.b0);
                    return;
                }
                vw7 vw7Var = cz7.m;
                if (cU == 65535) {
                    kw7Var.k(this);
                    kw7Var.m(vw7Var);
                    return;
                }
                if (cU == '\t' || cU == '\n' || cU == '\f' || cU == '\r') {
                    return;
                }
                switch (cU) {
                    case '>':
                        kw7Var.j();
                        kw7Var.m(vw7Var);
                        return;
                    case '?':
                        if (kw7Var.k instanceof gw7) {
                            return;
                        }
                        break;
                }
                kw7Var.k.l();
                tn0Var.O0();
                kw7Var.m(mx7Var);
                return;
            }
            kw7Var.l(this);
            kw7Var.k.l();
            kw7Var.k.h.f(cU);
            kw7Var.m(mx7Var);
        }
    }
}
