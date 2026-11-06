package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum q73 extends r73 {
    public q73() {
        super("InTableText", 8);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        if (sj5Var.a == 5) {
            t63Var.v.add(new zv7((zv7) sj5Var));
            return true;
        }
        if (t63Var.v.size() > 0) {
            sj5 sj5Var2 = t63Var.f;
            for (zv7 zv7Var : t63Var.v) {
                t63Var.f = zv7Var;
                if (r73.b(zv7Var)) {
                    t63Var.I(zv7Var, false);
                } else {
                    t63Var.C(this);
                    boolean zD = lb7.d(t63Var.c().p.f993o, vn4.U);
                    n73 n73Var = r73.r;
                    if (zD) {
                        t63Var.y = true;
                        n73Var.d(zv7Var, t63Var);
                        t63Var.y = false;
                    } else {
                        n73Var.d(zv7Var, t63Var);
                    }
                }
            }
            t63Var.f = sj5Var2;
            t63Var.v.clear();
        }
        t63Var.m = t63Var.n;
        return t63Var.n(sj5Var);
    }
}
