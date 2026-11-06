package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum ox7 extends cz7 {
    public ox7() {
        super("BeforeAttributeValue", 36);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cU = tn0Var.u();
        sx7 sx7Var = cz7.Z;
        if (cU == 0) {
            kw7Var.l(this);
            kw7Var.k.g((char) 65533, tn0Var.L0() - 1, tn0Var.L0());
            kw7Var.m(sx7Var);
            return;
        }
        if (cU != ' ') {
            if (cU == '\"') {
                kw7Var.m(cz7.X);
                return;
            }
            if (cU != '`') {
                vw7 vw7Var = cz7.m;
                if (cU == 65535) {
                    kw7Var.k(this);
                    kw7Var.j();
                    kw7Var.m(vw7Var);
                    return;
                }
                if (cU == '\t' || cU == '\n' || cU == '\f' || cU == '\r') {
                    return;
                }
                if (cU == '&') {
                    tn0Var.O0();
                    kw7Var.m(sx7Var);
                    return;
                }
                if (cU == '\'') {
                    kw7Var.m(cz7.Y);
                    return;
                }
                switch (cU) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        kw7Var.l(this);
                        kw7Var.j();
                        kw7Var.m(vw7Var);
                        break;
                    default:
                        tn0Var.O0();
                        kw7Var.m(sx7Var);
                        break;
                }
                return;
            }
            kw7Var.l(this);
            kw7Var.k.g(cU, tn0Var.L0() - 1, tn0Var.L0());
            kw7Var.m(sx7Var);
        }
    }
}
