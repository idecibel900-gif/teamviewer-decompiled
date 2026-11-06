package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum h73 extends r73 {
    public h73() {
        super("AfterAfterFrameset", 21);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        if (sj5Var.a()) {
            t63Var.L((aw7) sj5Var, t63Var.d);
            return true;
        }
        if (sj5Var.b() || r73.b(sj5Var) || (sj5Var.e() && ((ew7) sj5Var).m().equals("html"))) {
            return r73.r.d(sj5Var, t63Var);
        }
        if (sj5Var.c()) {
            return true;
        }
        if (sj5Var.e() && ((ew7) sj5Var).m().equals("noframes")) {
            return r73.p.d(sj5Var, t63Var);
        }
        t63Var.C(this);
        return false;
    }
}
