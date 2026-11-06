package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum lw7 extends cz7 {
    public lw7() {
        super("TagName", 9);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        String strF;
        tn0Var.j();
        int i = tn0Var.p;
        int i2 = tn0Var.q;
        char[] cArr = tn0Var.f2125o;
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                strF = tn0Var.F(i, i3);
                break;
            }
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '>') {
                strF = tn0Var.F(i, i3);
                break;
            }
            i3++;
        }
        kw7Var.k.i(strF);
        char cU = tn0Var.u();
        if (cU == 0) {
            kw7Var.k.i(cz7.F0);
            return;
        }
        if (cU != ' ') {
            if (cU == '/') {
                kw7Var.m(cz7.b0);
                return;
            }
            vw7 vw7Var = cz7.m;
            if (cU == '>') {
                kw7Var.j();
                kw7Var.m(vw7Var);
                return;
            } else if (cU == 65535) {
                kw7Var.k(this);
                kw7Var.m(vw7Var);
                return;
            } else if (cU != '\t' && cU != '\n' && cU != '\f' && cU != '\r') {
                kw7Var.k.i(String.valueOf(cU));
                return;
            }
        }
        kw7Var.m(cz7.T);
    }
}
