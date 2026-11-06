package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum gy7 extends cz7 {
    public gy7() {
        super("BeforeDoctypeName", 52);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        boolean zH0 = tn0Var.H0();
        hy7 hy7Var = cz7.n0;
        if (zH0) {
            kw7Var.m.f();
            kw7Var.m(hy7Var);
            return;
        }
        char cU = tn0Var.u();
        if (cU == 0) {
            kw7Var.l(this);
            bw7 bw7Var = kw7Var.m;
            bw7Var.f();
            bw7Var.d.f((char) 65533);
            kw7Var.m(hy7Var);
            return;
        }
        if (cU != ' ') {
            if (cU == 65535) {
                kw7Var.k(this);
                bw7 bw7Var2 = kw7Var.m;
                bw7Var2.f();
                bw7Var2.j = true;
                kw7Var.i();
                kw7Var.m(cz7.m);
                return;
            }
            if (cU == '\t' || cU == '\n' || cU == '\f' || cU == '\r') {
                return;
            }
            kw7Var.m.f();
            kw7Var.m.d.f(cU);
            kw7Var.m(hy7Var);
        }
    }
}
