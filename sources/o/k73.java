package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum k73 extends r73 {
    public k73() {
        super("BeforeHead", 2);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        if (r73.b(sj5Var)) {
            t63Var.I((zv7) sj5Var, false);
            return true;
        }
        if (sj5Var.a()) {
            t63Var.K((aw7) sj5Var);
            return true;
        }
        if (sj5Var.b()) {
            t63Var.C(this);
            return false;
        }
        if (sj5Var.e() && ((ew7) sj5Var).m().equals("html")) {
            return r73.r.d(sj5Var, t63Var);
        }
        if (sj5Var.e()) {
            ew7 ew7Var = (ew7) sj5Var;
            if (ew7Var.m().equals("head")) {
                t63Var.p = t63Var.M(ew7Var);
                t63Var.m = r73.p;
                return true;
            }
        }
        if (sj5Var.d() && lb7.d(((dw7) sj5Var).m(), vn4.A)) {
            t63Var.p("head");
            return t63Var.n(sj5Var);
        }
        if (sj5Var.d()) {
            t63Var.C(this);
            return false;
        }
        t63Var.p("head");
        return t63Var.n(sj5Var);
    }
}
