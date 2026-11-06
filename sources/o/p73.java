package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum p73 extends r73 {
    public p73() {
        super("InTable", 7);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        if (sj5Var.a == 5 && t63Var.i() && lb7.d(t63Var.c().p.f993o, vn4.U)) {
            t63Var.v.clear();
            t63Var.n = t63Var.m;
            t63Var.m = r73.u;
            return t63Var.n(sj5Var);
        }
        if (sj5Var.a()) {
            t63Var.K((aw7) sj5Var);
            return true;
        }
        if (sj5Var.b()) {
            t63Var.C(this);
            return false;
        }
        boolean zE = sj5Var.e();
        l73 l73Var = r73.p;
        if (!zE) {
            if (!sj5Var.d()) {
                if (!sj5Var.c()) {
                    e(sj5Var, t63Var);
                    return true;
                }
                if (t63Var.d("html", "http://www.w3.org/1999/xhtml")) {
                    t63Var.C(this);
                }
                return true;
            }
            String strM = ((dw7) sj5Var).m();
            if (strM.equals("table")) {
                if (!t63Var.H(8, strM)) {
                    t63Var.C(this);
                    return false;
                }
                t63Var.T("table");
                t63Var.b0();
                return true;
            }
            if (lb7.d(strM, vn4.T)) {
                t63Var.C(this);
                return false;
            }
            if (strM.equals("template")) {
                l73Var.d(sj5Var, t63Var);
                return true;
            }
            e(sj5Var, t63Var);
            return true;
        }
        ew7 ew7Var = (ew7) sj5Var;
        String strM2 = ew7Var.m();
        if (strM2.equals("caption")) {
            t63Var.w();
            t63Var.s.add(null);
            t63Var.M(ew7Var);
            t63Var.m = r73.v;
            return true;
        }
        if (strM2.equals("colgroup")) {
            t63Var.w();
            t63Var.M(ew7Var);
            t63Var.m = r73.w;
            return true;
        }
        if (strM2.equals("col")) {
            t63Var.w();
            t63Var.p("colgroup");
            return t63Var.n(sj5Var);
        }
        if (lb7.d(strM2, vn4.M)) {
            t63Var.w();
            t63Var.M(ew7Var);
            t63Var.m = r73.x;
            return true;
        }
        if (lb7.d(strM2, vn4.N)) {
            t63Var.w();
            t63Var.p("tbody");
            return t63Var.n(sj5Var);
        }
        if (strM2.equals("table")) {
            t63Var.C(this);
            if (t63Var.H(8, strM2)) {
                t63Var.T(strM2);
                if (t63Var.b0()) {
                    return t63Var.n(sj5Var);
                }
                t63Var.M(ew7Var);
                return true;
            }
        } else {
            if (lb7.d(strM2, vn4.O)) {
                return l73Var.d(sj5Var, t63Var);
            }
            if (strM2.equals("noscript")) {
                t63Var.B(t63Var.M(ew7Var));
                return true;
            }
            if (strM2.equals("input")) {
                ly lyVar = ew7Var.g;
                if (lyVar == null || !lyVar.h("type").equalsIgnoreCase("hidden")) {
                    e(sj5Var, t63Var);
                    return true;
                }
                t63Var.N(ew7Var);
                return true;
            }
            if (!strM2.equals("form")) {
                e(sj5Var, t63Var);
                return true;
            }
            t63Var.C(this);
            if (t63Var.q == null && !t63Var.R("template")) {
                t63Var.P(ew7Var, false, false);
                return true;
            }
        }
        return false;
    }

    public final void e(sj5 sj5Var, t63 t63Var) {
        t63Var.C(this);
        t63Var.y = true;
        r73.r.d(sj5Var, t63Var);
        t63Var.y = false;
    }
}
