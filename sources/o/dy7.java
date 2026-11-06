package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum dy7 extends cz7 {
    public dy7() {
        super("CommentEnd", 49);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cU = tn0Var.u();
        ay7 ay7Var = cz7.h0;
        if (cU == 0) {
            kw7Var.l(this);
            aw7 aw7Var = kw7Var.n;
            aw7Var.d.g("--");
            aw7Var.g((char) 65533);
            kw7Var.m(ay7Var);
            return;
        }
        if (cU == '!') {
            kw7Var.m(cz7.k0);
            return;
        }
        if (cU == '-') {
            kw7Var.n.g('-');
            return;
        }
        vw7 vw7Var = cz7.m;
        if (cU == '>') {
            kw7Var.h();
            kw7Var.m(vw7Var);
        } else if (cU == 65535) {
            kw7Var.k(this);
            kw7Var.h();
            kw7Var.m(vw7Var);
        } else {
            aw7 aw7Var2 = kw7Var.n;
            aw7Var2.d.g("--");
            aw7Var2.g(cU);
            kw7Var.m(ay7Var);
        }
    }
}
