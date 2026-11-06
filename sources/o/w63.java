package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum w63 extends r73 {
    public w63() {
        super("InTableBody", 11);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        int iB = ua5.B(sj5Var.a);
        p73 p73Var = r73.t;
        if (iB == 1) {
            ew7 ew7Var = (ew7) sj5Var;
            String strM = ew7Var.m();
            if (strM.equals("tr")) {
                t63Var.v("tbody", "tfoot", "thead", "template");
                t63Var.M(ew7Var);
                t63Var.m = r73.y;
                return true;
            }
            if (!lb7.d(strM, vn4.P)) {
                return lb7.d(strM, vn4.V) ? e(sj5Var, t63Var) : p73Var.d(sj5Var, t63Var);
            }
            t63Var.C(this);
            t63Var.p("tr");
            return t63Var.n(ew7Var);
        }
        if (iB != 2) {
            return p73Var.d(sj5Var, t63Var);
        }
        String strM2 = ((dw7) sj5Var).m();
        if (!lb7.d(strM2, vn4.b0)) {
            if (strM2.equals("table")) {
                return e(sj5Var, t63Var);
            }
            if (!lb7.d(strM2, vn4.W)) {
                return p73Var.d(sj5Var, t63Var);
            }
            t63Var.C(this);
            return false;
        }
        if (!t63Var.H(8, strM2)) {
            t63Var.C(this);
            return false;
        }
        t63Var.v("tbody", "tfoot", "thead", "template");
        t63Var.m();
        t63Var.m = p73Var;
        return true;
    }

    public final boolean e(sj5 sj5Var, t63 t63Var) {
        if (!t63Var.H(8, "tbody") && !t63Var.H(8, "thead") && !t63Var.H(8, "tfoot")) {
            t63Var.C(this);
            return false;
        }
        t63Var.v("tbody", "tfoot", "thead", "template");
        t63Var.o(t63Var.c().p.f993o);
        return t63Var.n(sj5Var);
    }
}
