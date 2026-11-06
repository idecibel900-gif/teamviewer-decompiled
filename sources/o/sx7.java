package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final enum sx7 extends cz7 {
    public sx7() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        tn0Var.L0();
        tn0Var.j();
        int i = tn0Var.p;
        int i2 = tn0Var.q;
        char[] cArr = tn0Var.f2125o;
        int i3 = i;
        while (i3 < i2) {
            if (Arrays.binarySearch(cz7.E0, cArr[i3]) >= 0) {
                break;
            } else {
                i3++;
            }
        }
        String strF = tn0Var.F(i, i3);
        if (strF.length() > 0) {
            kw7Var.k.i.g(strF);
        }
        int iL0 = tn0Var.L0();
        char cU = tn0Var.u();
        if (cU == 0) {
            kw7Var.l(this);
            kw7Var.k.g((char) 65533, iL0, tn0Var.L0());
            return;
        }
        if (cU != ' ') {
            if (cU != '\"' && cU != '`') {
                vw7 vw7Var = cz7.m;
                if (cU == 65535) {
                    kw7Var.k(this);
                    kw7Var.m(vw7Var);
                    return;
                }
                if (cU != '\t' && cU != '\n' && cU != '\f' && cU != '\r') {
                    if (cU == '&') {
                        int[] iArrC = kw7Var.c('>', true);
                        fw7 fw7Var = kw7Var.k;
                        if (iArrC != null) {
                            fw7Var.h(iL0, tn0Var.L0(), iArrC);
                            return;
                        } else {
                            fw7Var.g('&', iL0, tn0Var.L0());
                            return;
                        }
                    }
                    if (cU != '\'') {
                        switch (cU) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                kw7Var.j();
                                kw7Var.m(vw7Var);
                                break;
                            default:
                                kw7Var.k.g(cU, iL0, tn0Var.L0());
                                break;
                        }
                        return;
                    }
                }
            }
            kw7Var.l(this);
            kw7Var.k.g(cU, iL0, tn0Var.L0());
            return;
        }
        kw7Var.m(cz7.T);
    }
}
