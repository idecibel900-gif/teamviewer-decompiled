package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum ay7 extends cz7 {
    public ay7() {
        super("Comment", 47);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        char cB0 = tn0Var.b0();
        if (cB0 == 0) {
            kw7Var.l(this);
            tn0Var.e();
            kw7Var.n.g((char) 65533);
            return;
        }
        if (cB0 == '-') {
            kw7Var.a(cz7.i0);
            return;
        }
        if (cB0 == 65535) {
            kw7Var.k(this);
            kw7Var.h();
            kw7Var.m(cz7.m);
            return;
        }
        aw7 aw7Var = kw7Var.n;
        tn0Var.j();
        int i = tn0Var.p;
        int i2 = tn0Var.q;
        char[] cArr = tn0Var.f2125o;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == '-' || c == 0) {
                break;
            } else {
                i3++;
            }
        }
        aw7Var.d.g(tn0Var.F(i, i3));
    }
}
