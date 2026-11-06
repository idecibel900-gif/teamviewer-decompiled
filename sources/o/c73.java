package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum c73 extends r73 {
    public c73() {
        super("AfterBody", 17);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        o82 o82VarF = t63Var.F("html");
        boolean zB = r73.b(sj5Var);
        n73 n73Var = r73.r;
        if (zB) {
            if (o82VarF != null) {
                t63Var.J((zv7) sj5Var, o82VarF);
                return true;
            }
            n73Var.d(sj5Var, t63Var);
            return true;
        }
        if (sj5Var.a()) {
            if (o82VarF != null) {
                t63Var.L((aw7) sj5Var, o82VarF);
                return true;
            }
            t63Var.K((aw7) sj5Var);
            return true;
        }
        if (sj5Var.b()) {
            t63Var.C(this);
            return false;
        }
        if (sj5Var.e() && ((ew7) sj5Var).m().equals("html")) {
            return n73Var.d(sj5Var, t63Var);
        }
        if (sj5Var.d() && ((dw7) sj5Var).m().equals("html")) {
            if (t63Var.z) {
                t63Var.C(this);
                return false;
            }
            t63Var.m = r73.G;
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
