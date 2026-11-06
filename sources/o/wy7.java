package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum wy7 extends cz7 {
    public wy7() {
        super("DoctypeInternalSubset", 67);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char c;
        lh7 lh7Var = kw7Var.m.h;
        while (true) {
            char c2 = 0;
            while (true) {
                char cU = tn0Var.u();
                if (cU == 0) {
                    kw7Var.l(this);
                    lh7Var.f((char) 65533);
                } else if (cU == '\"') {
                    lh7Var.f(cU);
                    c = 2;
                    if (c2 == 0) {
                        c2 = c;
                    } else if (c2 == 2) {
                        break;
                    }
                } else if (cU == '\'') {
                    lh7Var.f(cU);
                    c = 1;
                    if (c2 == 0) {
                        c2 = c;
                    } else if (c2 == 1) {
                        break;
                    }
                } else if (cU == '-') {
                    lh7Var.f(cU);
                    if (c2 == 3 && tn0Var.k0("->")) {
                        lh7Var.g("->");
                        break;
                    }
                } else if (cU == '<') {
                    lh7Var.f(cU);
                    if (c2 == 0) {
                        if (tn0Var.k0("!--")) {
                            lh7Var.g("!--");
                            c2 = 3;
                        } else if (tn0Var.k0("?")) {
                            lh7Var.f('?');
                            c2 = 4;
                        }
                    }
                } else if (cU == '?') {
                    lh7Var.f(cU);
                    if (c2 == 4 && tn0Var.o0('>')) {
                        tn0Var.e();
                        lh7Var.f('>');
                        break;
                    }
                } else {
                    vw7 vw7Var = cz7.m;
                    if (cU != ']') {
                        if (cU == 65535) {
                            kw7Var.k(this);
                            kw7Var.i();
                            kw7Var.m(vw7Var);
                            return;
                        }
                        lh7Var.f(cU);
                    } else if (c2 == 0) {
                        tn0Var.j();
                        int i = tn0Var.p;
                        int i2 = tn0Var.q;
                        char[] cArr = tn0Var.f2125o;
                        int i3 = i;
                        while (i3 < i2 && lb7.i(cArr[i3])) {
                            i3++;
                        }
                        tn0Var.p = i3;
                        String strQ = i3 > i ? tn0.q(tn0Var.f2125o, tn0Var.m, i, i3 - i) : "";
                        if (tn0Var.o0('>')) {
                            tn0Var.e();
                            kw7Var.i();
                            kw7Var.m(vw7Var);
                            return;
                        }
                        lh7Var.f(cU);
                        lh7Var.g(strQ);
                    } else {
                        lh7Var.f(cU);
                    }
                }
            }
        }
    }
}
