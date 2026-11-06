package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum xy7 extends cz7 {
    public xy7() {
        super("CdataSection", 68);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        int i;
        String strY;
        tn0Var.j();
        char cCharAt = "]]>".charAt(0);
        int i2 = tn0Var.p;
        while (true) {
            int i3 = tn0Var.q;
            if (i2 >= i3) {
                i = -1;
                break;
            }
            if (cCharAt != tn0Var.f2125o[i2]) {
                do {
                    i2++;
                    i3 = tn0Var.q;
                    if (i2 >= i3) {
                        break;
                    }
                } while (cCharAt != tn0Var.f2125o[i2]);
            }
            int i4 = i2 + 1;
            int i5 = i2 + 3;
            if (i2 < i3 && i5 <= i3) {
                int i6 = i4;
                for (int i7 = 1; i6 < i5 && "]]>".charAt(i7) == tn0Var.f2125o[i6]; i7++) {
                    i6++;
                }
                if (i6 == i5) {
                    i = i2 - tn0Var.p;
                    break;
                }
            }
            i2 = i4;
        }
        if (i != -1) {
            strY = tn0.q(tn0Var.f2125o, tn0Var.m, tn0Var.p, i);
            tn0Var.p += i;
        } else {
            int i8 = tn0Var.q;
            int i9 = tn0Var.p;
            if (i8 - i9 < 3) {
                strY = tn0Var.Y();
            } else {
                int i10 = i8 - 2;
                String strQ = tn0.q(tn0Var.f2125o, tn0Var.m, i9, i10 - i9);
                tn0Var.p = i10;
                strY = strQ;
            }
        }
        kw7Var.g.g(strY);
        if (tn0Var.k0("]]>") || tn0Var.c0()) {
            String strF = kw7Var.g.F();
            yv7 yv7Var = new yv7();
            lh7 lh7Var = yv7Var.d;
            lh7Var.A();
            lh7Var.n = strF;
            kw7Var.g(yv7Var);
            kw7Var.m(cz7.m);
        }
    }
}
