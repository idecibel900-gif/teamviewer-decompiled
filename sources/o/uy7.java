package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum uy7 extends cz7 {
    public uy7() {
        super("AfterDoctypeSystemIdentifier", 65);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cU = tn0Var.u();
        if (cU == '\t' || cU == '\n' || cU == '\f' || cU == '\r' || cU == ' ') {
            return;
        }
        vw7 vw7Var = cz7.m;
        if (cU == '>') {
            kw7Var.i();
            kw7Var.m(vw7Var);
            return;
        }
        vy7 vy7Var = cz7.A0;
        if (cU == '[') {
            if (kw7Var.h == 2) {
                kw7Var.m.i = true;
                kw7Var.m(cz7.B0);
                return;
            } else {
                kw7Var.l(this);
                kw7Var.m(vy7Var);
                return;
            }
        }
        if (cU != 65535) {
            kw7Var.l(this);
            kw7Var.m(vy7Var);
        } else {
            kw7Var.k(this);
            kw7Var.m.j = true;
            kw7Var.i();
            kw7Var.m(vw7Var);
        }
    }
}
