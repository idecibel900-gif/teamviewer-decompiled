package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum z63 extends r73 {
    public z63() {
        super("InSelect", 14);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        int iB = ua5.B(sj5Var.a);
        if (iB == 0) {
            t63Var.C(this);
            return false;
        }
        l73 l73Var = r73.p;
        if (iB == 1) {
            ew7 ew7Var = (ew7) sj5Var;
            String strM = ew7Var.m();
            if (strM.equals("html")) {
                return r73.r.d(ew7Var, t63Var);
            }
            if (strM.equals("option")) {
                if (t63Var.d("option", "http://www.w3.org/1999/xhtml")) {
                    t63Var.o("option");
                }
                t63Var.M(ew7Var);
                return true;
            }
            if (strM.equals("optgroup")) {
                if (t63Var.d("option", "http://www.w3.org/1999/xhtml")) {
                    t63Var.o("option");
                }
                if (t63Var.d("optgroup", "http://www.w3.org/1999/xhtml")) {
                    t63Var.o("optgroup");
                }
                t63Var.M(ew7Var);
                return true;
            }
            if (strM.equals("select")) {
                t63Var.C(this);
                return t63Var.o("select");
            }
            if (lb7.d(strM, vn4.Z)) {
                t63Var.C(this);
                if (!t63Var.G("select")) {
                    return false;
                }
                do {
                    t63Var.T("select");
                    t63Var.b0();
                } while (t63Var.G("select"));
                return t63Var.n(ew7Var);
            }
            if (strM.equals("script") || strM.equals("template")) {
                return l73Var.d(sj5Var, t63Var);
            }
            if (strM.equals("noscript")) {
                t63Var.B(t63Var.M(ew7Var));
                return true;
            }
            t63Var.C(this);
            return false;
        }
        if (iB != 2) {
            if (iB == 3) {
                t63Var.K((aw7) sj5Var);
                return true;
            }
            if (iB == 4) {
                t63Var.I((zv7) sj5Var, false);
                return true;
            }
            if (iB != 6) {
                t63Var.C(this);
                return false;
            }
            if (!t63Var.d("html", "http://www.w3.org/1999/xhtml")) {
                t63Var.C(this);
            }
            return true;
        }
        String strM2 = ((dw7) sj5Var).m();
        strM2.getClass();
        switch (strM2) {
            case "template":
                return l73Var.d(sj5Var, t63Var);
            case "option":
                if (t63Var.d("option", "http://www.w3.org/1999/xhtml")) {
                    t63Var.m();
                    return true;
                }
                t63Var.C(this);
                return true;
            case "select":
                if (!t63Var.G(strM2)) {
                    t63Var.C(this);
                    return false;
                }
                t63Var.T(strM2);
                t63Var.b0();
                return true;
            case "optgroup":
                if (t63Var.d("option", "http://www.w3.org/1999/xhtml") && t63Var.s(t63Var.c()) != null && t63Var.s(t63Var.c()).t("optgroup")) {
                    t63Var.o("option");
                }
                if (t63Var.d("optgroup", "http://www.w3.org/1999/xhtml")) {
                    t63Var.m();
                    return true;
                }
                t63Var.C(this);
                return true;
            default:
                t63Var.C(this);
                return false;
        }
    }
}
