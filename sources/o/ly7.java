package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum ly7 extends cz7 {
    public ly7() {
        super("DoctypePublicIdentifier_doubleQuoted", 57);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cU = tn0Var.u();
        if (cU == 0) {
            kw7Var.l(this);
            kw7Var.m.f.f((char) 65533);
            return;
        }
        if (cU == '\"') {
            kw7Var.m(cz7.t0);
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
            kw7Var.m.f.f(cU);
            return;
        }
        kw7Var.k(this);
        kw7Var.m.j = true;
        kw7Var.i();
        kw7Var.m(vw7Var);
    }
}
