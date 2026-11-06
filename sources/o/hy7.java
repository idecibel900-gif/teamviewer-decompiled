package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum hy7 extends cz7 {
    public hy7() {
        super("DoctypeName", 53);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        if (tn0Var.H0()) {
            kw7Var.m.d.g(tn0Var.z());
            return;
        }
        char cU = tn0Var.u();
        if (cU == 0) {
            kw7Var.l(this);
            kw7Var.m.d.f((char) 65533);
            return;
        }
        if (cU != ' ') {
            vw7 vw7Var = cz7.m;
            if (cU == '>') {
                kw7Var.i();
                kw7Var.m(vw7Var);
                return;
            }
            if (cU == 65535) {
                kw7Var.k(this);
                kw7Var.m.j = true;
                kw7Var.i();
                kw7Var.m(vw7Var);
                return;
            }
            if (cU != '\t' && cU != '\n' && cU != '\f' && cU != '\r') {
                kw7Var.m.d.f(cU);
                return;
            }
        }
        kw7Var.m(cz7.o0);
    }
}
