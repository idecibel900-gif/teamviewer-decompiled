package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum x63 extends r73 {
    public x63() {
        super("InRow", 12);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        boolean zE = sj5Var.e();
        p73 p73Var = r73.t;
        w63 w63Var = r73.x;
        if (zE) {
            ew7 ew7Var = (ew7) sj5Var;
            String strM = ew7Var.m();
            if (lb7.d(strM, vn4.P)) {
                t63Var.x();
                t63Var.M(ew7Var);
                t63Var.m = r73.z;
                t63Var.s.add(null);
                return true;
            }
            if (!lb7.d(strM, vn4.X)) {
                return p73Var.d(sj5Var, t63Var);
            }
            if (!t63Var.H(8, "tr")) {
                t63Var.C(this);
                return false;
            }
            t63Var.x();
            t63Var.m();
            t63Var.m = w63Var;
            return t63Var.n(sj5Var);
        }
        if (!sj5Var.d()) {
            return p73Var.d(sj5Var, t63Var);
        }
        String strM2 = ((dw7) sj5Var).m();
        if (strM2.equals("tr")) {
            if (!t63Var.H(8, strM2)) {
                t63Var.C(this);
                return false;
            }
            t63Var.x();
            t63Var.m();
            t63Var.m = w63Var;
            return true;
        }
        if (strM2.equals("table")) {
            if (!t63Var.H(8, "tr")) {
                t63Var.C(this);
                return false;
            }
            t63Var.x();
            t63Var.m();
            t63Var.m = w63Var;
            return t63Var.n(sj5Var);
        }
        if (!lb7.d(strM2, vn4.M)) {
            if (!lb7.d(strM2, vn4.Y)) {
                return p73Var.d(sj5Var, t63Var);
            }
            t63Var.C(this);
            return false;
        }
        if (!t63Var.H(8, strM2)) {
            t63Var.C(this);
            return false;
        }
        if (!t63Var.H(8, "tr")) {
            return false;
        }
        t63Var.x();
        t63Var.m();
        t63Var.m = w63Var;
        return t63Var.n(sj5Var);
    }
}
