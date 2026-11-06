package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum o73 extends r73 {
    public o73() {
        super("Text", 6);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        if (sj5Var.a == 5) {
            t63Var.I((zv7) sj5Var, false);
            return true;
        }
        if (!sj5Var.c()) {
            if (!sj5Var.d()) {
                return true;
            }
            t63Var.m();
            t63Var.m = t63Var.n;
            return true;
        }
        t63Var.C(this);
        t63Var.m();
        r73 r73Var = t63Var.n;
        t63Var.m = r73Var;
        if (r73Var == r73.s) {
            t63Var.m = r73.r;
        }
        return t63Var.n(sj5Var);
    }
}
