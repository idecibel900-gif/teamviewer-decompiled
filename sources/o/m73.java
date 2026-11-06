package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum m73 extends r73 {
    public m73() {
        super("AfterHead", 4);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        if (r73.b(sj5Var)) {
            t63Var.I((zv7) sj5Var, false);
        } else if (sj5Var.a()) {
            t63Var.K((aw7) sj5Var);
        } else if (sj5Var.b()) {
            t63Var.C(this);
        } else {
            boolean zE = sj5Var.e();
            l73 l73Var = r73.p;
            if (zE) {
                ew7 ew7Var = (ew7) sj5Var;
                String strM = ew7Var.m();
                boolean zEquals = strM.equals("html");
                n73 n73Var = r73.r;
                if (zEquals) {
                    return n73Var.d(sj5Var, t63Var);
                }
                if (strM.equals("body")) {
                    t63Var.M(ew7Var);
                    t63Var.x = false;
                    t63Var.m = n73Var;
                } else if (strM.equals("frameset")) {
                    t63Var.M(ew7Var);
                    t63Var.m = r73.E;
                } else if (lb7.d(strM, vn4.B)) {
                    t63Var.C(this);
                    o82 o82Var = t63Var.p;
                    t63Var.e.add(o82Var);
                    l73Var.d(sj5Var, t63Var);
                    t63Var.Z(o82Var);
                } else {
                    if (strM.equals("head")) {
                        t63Var.C(this);
                        return false;
                    }
                    t63Var.p("body");
                    t63Var.x = true;
                    t63Var.n(sj5Var);
                }
            } else if (sj5Var.d()) {
                String strM2 = ((dw7) sj5Var).m();
                if (lb7.d(strM2, vn4.z)) {
                    t63Var.p("body");
                    t63Var.x = true;
                    t63Var.n(sj5Var);
                } else {
                    if (!strM2.equals("template")) {
                        t63Var.C(this);
                        return false;
                    }
                    l73Var.d(sj5Var, t63Var);
                }
            } else {
                t63Var.p("body");
                t63Var.x = true;
                t63Var.n(sj5Var);
            }
        }
        return true;
    }
}
