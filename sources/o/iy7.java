package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum iy7 extends cz7 {
    public iy7() {
        super("AfterDoctypeName", 54);
    }

    @Override // o.cz7
    public final void c(kw7 kw7Var, tn0 tn0Var) {
        boolean zC0 = tn0Var.c0();
        vw7 vw7Var = cz7.m;
        if (zC0) {
            kw7Var.k(this);
            kw7Var.m.j = true;
            kw7Var.i();
            kw7Var.m(vw7Var);
            return;
        }
        if (tn0Var.x0('\t', '\n', '\r', '\f', ' ')) {
            tn0Var.e();
            return;
        }
        if (tn0Var.o0('>')) {
            kw7Var.i();
            kw7Var.a(vw7Var);
            return;
        }
        int i = kw7Var.h;
        bw7 bw7Var = kw7Var.m;
        if (i == 2 && tn0Var.o0('[')) {
            bw7Var.i = true;
            kw7Var.a(cz7.B0);
            return;
        }
        if (tn0Var.l0("PUBLIC")) {
            bw7Var.e = "PUBLIC";
            kw7Var.m(cz7.p0);
        } else if (tn0Var.l0("SYSTEM")) {
            bw7Var.e = "SYSTEM";
            kw7Var.m(cz7.v0);
        } else {
            kw7Var.l(this);
            bw7Var.j = true;
            kw7Var.a(cz7.A0);
        }
    }
}
