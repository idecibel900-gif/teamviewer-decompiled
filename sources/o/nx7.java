package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum nx7 extends cz7 {
    public nx7() {
        super("AfterAttributeName", 35);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cU = tn0Var.u();
        mx7 mx7Var = cz7.U;
        if (cU == 0) {
            kw7Var.l(this);
            kw7Var.k.h.f((char) 65533);
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
                    case '<':
                        break;
                    case '=':
                        kw7Var.m(cz7.W);
                        break;
                    case '>':
                        kw7Var.j();
                        kw7Var.m(vw7Var);
                        break;
                    default:
                        kw7Var.k.l();
                        tn0Var.O0();
                        kw7Var.m(mx7Var);
                        break;
                }
                return;
            }
            kw7Var.l(this);
            kw7Var.k.l();
            kw7Var.k.h.f(cU);
            kw7Var.m(mx7Var);
        }
    }
}
