package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum j73 extends r73 {
    public j73() {
        super("BeforeHtml", 1);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        if (sj5Var.b()) {
            t63Var.C(this);
            return false;
        }
        if (sj5Var.a()) {
            t63Var.K((aw7) sj5Var);
            return true;
        }
        if (r73.b(sj5Var)) {
            t63Var.I((zv7) sj5Var, false);
            return true;
        }
        boolean zE = sj5Var.e();
        k73 k73Var = r73.f1897o;
        if (zE) {
            ew7 ew7Var = (ew7) sj5Var;
            if (ew7Var.m().equals("html")) {
                t63Var.M(ew7Var);
                t63Var.m = k73Var;
                return true;
            }
        }
        if (sj5Var.d() && lb7.d(((dw7) sj5Var).m(), vn4.A)) {
            t63Var.p("html");
            t63Var.m = k73Var;
            return t63Var.n(sj5Var);
        }
        if (sj5Var.d()) {
            t63Var.C(this);
            return false;
        }
        t63Var.p("html");
        t63Var.m = k73Var;
        return t63Var.n(sj5Var);
    }
}
