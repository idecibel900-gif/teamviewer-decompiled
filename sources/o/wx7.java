package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum wx7 extends cz7 {
    public wx7() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        if (tn0Var.k0("--")) {
            kw7Var.n.f();
            kw7Var.m(cz7.f0);
            return;
        }
        if (tn0Var.l0("DOCTYPE")) {
            kw7Var.m(cz7.l0);
            return;
        }
        boolean zK0 = tn0Var.k0("[CDATA[");
        vx7 vx7Var = cz7.c0;
        if (!zK0) {
            if (kw7Var.h != 2 || !tn0Var.H0()) {
                kw7Var.l(this);
                kw7Var.n.f();
                kw7Var.m(vx7Var);
                return;
            } else {
                gw7 gw7Var = kw7Var.f1311o;
                gw7Var.f();
                gw7Var.m = true;
                kw7Var.k = gw7Var;
                kw7Var.m(cz7.v);
                return;
            }
        }
        o28 o28Var = kw7Var.c;
        aw7 aw7Var = kw7Var.n;
        if (kw7Var.h == 2 || (o28Var.i() && !"http://www.w3.org/1999/xhtml".equals(o28Var.c().p.m))) {
            kw7Var.g.A();
            kw7Var.m(cz7.C0);
        } else {
            kw7Var.l(this);
            aw7Var.f();
            aw7Var.d.g("[CDATA[");
            kw7Var.m(vx7Var);
        }
    }
}
