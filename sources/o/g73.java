package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum g73 extends r73 {
    public g73() {
        super("AfterAfterBody", 20);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        if (sj5Var.a()) {
            t63Var.L((aw7) sj5Var, t63Var.d);
            return true;
        }
        if (sj5Var.b() || (sj5Var.e() && ((ew7) sj5Var).m().equals("html"))) {
            return r73.r.d(sj5Var, t63Var);
        }
        if (r73.b(sj5Var)) {
            t63Var.J((zv7) sj5Var, t63Var.d);
            return true;
        }
        if (sj5Var.c()) {
            return true;
        }
        t63Var.C(this);
        t63Var.a0();
        return t63Var.n(sj5Var);
    }
}
