package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum fy7 extends cz7 {
    public fy7() {
        super("Doctype", 51);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cU = tn0Var.u();
        gy7 gy7Var = cz7.m0;
        if (cU == '\t' || cU == '\n' || cU == '\f' || cU == '\r' || cU == ' ') {
            kw7Var.m(gy7Var);
            return;
        }
        if (cU != '>') {
            if (cU != 65535) {
                kw7Var.l(this);
                kw7Var.m(gy7Var);
                return;
            }
            kw7Var.k(this);
        }
        kw7Var.l(this);
        bw7 bw7Var = kw7Var.m;
        bw7Var.f();
        bw7Var.j = true;
        kw7Var.i();
        kw7Var.m(cz7.m);
    }
}
