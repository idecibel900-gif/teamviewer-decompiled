package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final enum mx7 extends cz7 {
    public mx7() {
        super("AttributeName", 34);
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
            if (Arrays.binarySearch(cz7.D0, cArr[i3]) >= 0) {
                break;
            } else {
                i3++;
            }
        }
        String strF = tn0Var.F(i, i3);
        fw7 fw7Var = kw7Var.k;
        fw7Var.h.g(strF.replace((char) 0, (char) 65533));
        char cU = tn0Var.u();
        nx7 nx7Var = cz7.V;
        if (cU == '\t' || cU == '\n' || cU == '\f' || cU == '\r' || cU == ' ') {
            kw7Var.m(nx7Var);
            return;
        }
        if (cU != '\"' && cU != '\'') {
            if (cU == '/') {
                kw7Var.m(cz7.b0);
                return;
            }
            vw7 vw7Var = cz7.m;
            if (cU == 65535) {
                kw7Var.k(this);
                kw7Var.m(vw7Var);
                return;
            }
            switch (cU) {
                case '=':
                    kw7Var.m(cz7.W);
                    return;
                case '>':
                    kw7Var.j();
                    kw7Var.m(vw7Var);
                    return;
                case '?':
                    if (kw7Var.h == 2 && (kw7Var.k instanceof gw7)) {
                        kw7Var.m(nx7Var);
                        return;
                    }
                    break;
            }
            kw7Var.k.h.f(cU);
            return;
        }
        kw7Var.l(this);
        kw7Var.k.h.f(cU);
    }
}
