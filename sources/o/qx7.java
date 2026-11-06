package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum qx7 extends cz7 {
    public qx7() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        tn0Var.L0();
        String strJ = tn0Var.J((char) 0, '&', '\'');
        if (strJ.length() > 0) {
            kw7Var.k.i.g(strJ);
        } else {
            kw7Var.k.j = true;
        }
        int iL0 = tn0Var.L0();
        char cU = tn0Var.u();
        if (cU == 0) {
            kw7Var.l(this);
            kw7Var.k.g((char) 65533, iL0, tn0Var.L0());
            return;
        }
        if (cU == 65535) {
            kw7Var.k(this);
            kw7Var.m(cz7.m);
            return;
        }
        if (cU != '&') {
            if (cU != '\'') {
                kw7Var.k.g(cU, iL0, tn0Var.L0());
                return;
            } else {
                kw7Var.m(cz7.a0);
                return;
            }
        }
        int[] iArrC = kw7Var.c('\'', true);
        fw7 fw7Var = kw7Var.k;
        if (iArrC != null) {
            fw7Var.h(iL0, tn0Var.L0(), iArrC);
        } else {
            fw7Var.g('&', iL0, tn0Var.L0());
        }
    }
}
