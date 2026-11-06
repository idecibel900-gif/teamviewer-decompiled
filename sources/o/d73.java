package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum d73 extends r73 {
    public d73() {
        super("InFrameset", 18);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        if (r73.b(sj5Var)) {
            t63Var.I((zv7) sj5Var, false);
            return true;
        }
        if (sj5Var.a()) {
            t63Var.K((aw7) sj5Var);
            return true;
        }
        if (sj5Var.b()) {
            t63Var.C(this);
            return false;
        }
        if (!sj5Var.e()) {
            if (sj5Var.d() && ((dw7) sj5Var).m().equals("frameset")) {
                if (!t63Var.d("frameset", "http://www.w3.org/1999/xhtml")) {
                    t63Var.C(this);
                    return false;
                }
                t63Var.m();
                if (!t63Var.z && !t63Var.d("frameset", "http://www.w3.org/1999/xhtml")) {
                    t63Var.m = r73.F;
                    return true;
                }
            } else {
                if (!sj5Var.c()) {
                    t63Var.C(this);
                    return false;
                }
                if (!t63Var.d("html", "http://www.w3.org/1999/xhtml")) {
                    t63Var.C(this);
                }
            }
            return true;
        }
        ew7 ew7Var = (ew7) sj5Var;
        String strM = ew7Var.m();
        strM.getClass();
        switch (strM) {
            case "frameset":
                t63Var.M(ew7Var);
                return true;
            case "html":
                return r73.r.d(ew7Var, t63Var);
            case "frame":
                t63Var.N(ew7Var);
                return true;
            case "noframes":
                return r73.p.d(ew7Var, t63Var);
            default:
                t63Var.C(this);
                return false;
        }
    }
}
