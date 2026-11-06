package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum zx7 extends cz7 {
    public zx7() {
        super("CommentStartDash", 46);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cU = tn0Var.u();
        ay7 ay7Var = cz7.h0;
        if (cU == 0) {
            kw7Var.l(this);
            kw7Var.n.g((char) 65533);
            kw7Var.m(ay7Var);
            return;
        }
        if (cU == '-') {
            kw7Var.m(cz7.j0);
            return;
        }
        vw7 vw7Var = cz7.m;
        if (cU == '>') {
            kw7Var.l(this);
            kw7Var.h();
            kw7Var.m(vw7Var);
        } else if (cU != 65535) {
            kw7Var.n.g(cU);
            kw7Var.m(ay7Var);
        } else {
            kw7Var.k(this);
            kw7Var.h();
            kw7Var.m(vw7Var);
        }
    }
}
