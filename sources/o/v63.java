package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum v63 extends r73 {
    public v63() {
        super("InColumnGroup", 10);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        if (r73.b(sj5Var)) {
            t63Var.I((zv7) sj5Var, false);
            return true;
        }
        int iB = ua5.B(sj5Var.a);
        if (iB == 0) {
            t63Var.C(this);
            return true;
        }
        l73 l73Var = r73.p;
        if (iB != 1) {
            if (iB != 2) {
                if (iB == 3) {
                    t63Var.K((aw7) sj5Var);
                    return true;
                }
                if (iB == 6 && t63Var.d("html", "http://www.w3.org/1999/xhtml")) {
                    return true;
                }
                return e(sj5Var, t63Var);
            }
            String strM = ((dw7) sj5Var).m();
            strM.getClass();
            if (strM.equals("template")) {
                l73Var.d(sj5Var, t63Var);
                return true;
            }
            if (!strM.equals("colgroup")) {
                return e(sj5Var, t63Var);
            }
            if (!t63Var.d(strM, "http://www.w3.org/1999/xhtml")) {
                t63Var.C(this);
                return false;
            }
            t63Var.m();
            t63Var.m = r73.t;
            return true;
        }
        ew7 ew7Var = (ew7) sj5Var;
        String strM2 = ew7Var.m();
        strM2.getClass();
        switch (strM2) {
            case "template":
                l73Var.d(sj5Var, t63Var);
                return true;
            case "col":
                t63Var.N(ew7Var);
                return true;
            case "html":
                return r73.r.d(sj5Var, t63Var);
            default:
                return e(sj5Var, t63Var);
        }
    }

    public final boolean e(sj5 sj5Var, t63 t63Var) {
        if (!t63Var.d("colgroup", "http://www.w3.org/1999/xhtml")) {
            t63Var.C(this);
            return false;
        }
        t63Var.m();
        t63Var.m = r73.t;
        t63Var.n(sj5Var);
        return true;
    }
}
