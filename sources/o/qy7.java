package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum qy7 extends cz7 {
    public qy7() {
        super("AfterDoctypeSystemKeyword", 61);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cU = tn0Var.u();
        if (cU == '\t' || cU == '\n' || cU == '\f' || cU == '\r' || cU == ' ') {
            kw7Var.m(cz7.w0);
            return;
        }
        if (cU == '\"') {
            kw7Var.l(this);
            kw7Var.m(cz7.x0);
            return;
        }
        if (cU == '\'') {
            kw7Var.l(this);
            kw7Var.m(cz7.y0);
            return;
        }
        vw7 vw7Var = cz7.m;
        if (cU == '>') {
            kw7Var.l(this);
            kw7Var.m.j = true;
            kw7Var.i();
            kw7Var.m(vw7Var);
            return;
        }
        if (cU != 65535) {
            kw7Var.l(this);
            kw7Var.m.j = true;
            kw7Var.i();
        } else {
            kw7Var.k(this);
            kw7Var.m.j = true;
            kw7Var.i();
            kw7Var.m(vw7Var);
        }
    }
}
