package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum b73 extends r73 {
    public b73() {
        super("InTemplate", 16);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        int iB = ua5.B(sj5Var.a);
        n73 n73Var = r73.r;
        if (iB != 0) {
            l73 l73Var = r73.p;
            if (iB == 1) {
                String strM = ((ew7) sj5Var).m();
                if (lb7.d(strM, vn4.d0)) {
                    t63Var.getClass();
                    l73Var.d(sj5Var, t63Var);
                    return true;
                }
                if (lb7.d(strM, vn4.e0)) {
                    t63Var.U();
                    p73 p73Var = r73.t;
                    t63Var.V(p73Var);
                    t63Var.m = p73Var;
                    return t63Var.n(sj5Var);
                }
                if (strM.equals("col")) {
                    t63Var.U();
                    v63 v63Var = r73.w;
                    t63Var.V(v63Var);
                    t63Var.m = v63Var;
                    return t63Var.n(sj5Var);
                }
                if (strM.equals("tr")) {
                    t63Var.U();
                    w63 w63Var = r73.x;
                    t63Var.V(w63Var);
                    t63Var.m = w63Var;
                    return t63Var.n(sj5Var);
                }
                if (!strM.equals("td") && !strM.equals("th")) {
                    t63Var.U();
                    t63Var.V(n73Var);
                    t63Var.m = n73Var;
                    return t63Var.n(sj5Var);
                }
                t63Var.U();
                x63 x63Var = r73.y;
                t63Var.V(x63Var);
                t63Var.m = x63Var;
                return t63Var.n(sj5Var);
            }
            if (iB == 2) {
                if (!((dw7) sj5Var).m().equals("template")) {
                    t63Var.C(this);
                    return false;
                }
                t63Var.getClass();
                l73Var.d(sj5Var, t63Var);
                return true;
            }
            if (iB != 3 && iB != 4) {
                if (iB != 6) {
                    hk0.l("Unexpected state: ".concat(to7.r(sj5Var.a)));
                    return false;
                }
                o82 o82VarF = t63Var.F("template");
                if (o82VarF != null && o82VarF != t63Var.r) {
                    t63Var.C(this);
                    t63Var.T("template");
                    t63Var.u();
                    t63Var.U();
                    t63Var.b0();
                    if (t63Var.m != r73.C && t63Var.t.size() < 12) {
                        return t63Var.n(sj5Var);
                    }
                }
                return true;
            }
        }
        t63Var.getClass();
        n73Var.d(sj5Var, t63Var);
        return true;
    }
}
