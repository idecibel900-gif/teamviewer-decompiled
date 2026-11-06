package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum f73 extends r73 {
    public f73() {
        super("AfterFrameset", 19);
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
        if (sj5Var.d() && ((dw7) sj5Var).m().equals("html")) {
            t63Var.m = r73.H;
            return true;
        }
        if (sj5Var.e() && ((ew7) sj5Var).m().equals("noframes")) {
            return r73.p.d(sj5Var, t63Var);
        }
        if (sj5Var.c()) {
            return true;
        }
        t63Var.C(this);
        return false;
    }
}
