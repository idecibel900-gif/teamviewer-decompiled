package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum py7 extends cz7 {
    public py7() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 60);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cU = tn0Var.u();
        if (cU == '\t' || cU == '\n' || cU == '\f' || cU == '\r' || cU == ' ') {
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
            kw7Var.i();
            kw7Var.m(vw7Var);
            return;
        }
        vy7 vy7Var = cz7.A0;
        if (cU != '[') {
            if (cU != 65535) {
                kw7Var.l(this);
                kw7Var.m.j = true;
                kw7Var.m(vy7Var);
                return;
            } else {
                kw7Var.k(this);
                kw7Var.m.j = true;
                kw7Var.i();
                kw7Var.m(vw7Var);
                return;
            }
        }
        int i = kw7Var.h;
        bw7 bw7Var = kw7Var.m;
        if (i == 2) {
            bw7Var.i = true;
            kw7Var.m(cz7.B0);
        } else {
            kw7Var.l(this);
            bw7Var.j = true;
            kw7Var.m(vy7Var);
        }
    }
}
