package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum y63 extends r73 {
    public y63() {
        super("InCell", 13);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        boolean zD = sj5Var.d();
        n73 n73Var = r73.r;
        if (!zD) {
            if (!sj5Var.e() || !lb7.d(((ew7) sj5Var).m(), vn4.S)) {
                return n73Var.d(sj5Var, t63Var);
            }
            if (!t63Var.H(8, "td") && !t63Var.H(8, "th")) {
                t63Var.C(this);
                return false;
            }
            if (t63Var.H(8, "td")) {
                t63Var.o("td");
            } else {
                t63Var.o("th");
            }
            return t63Var.n(sj5Var);
        }
        String strM = ((dw7) sj5Var).m();
        if (!lb7.d(strM, vn4.P)) {
            if (lb7.d(strM, vn4.Q)) {
                t63Var.C(this);
                return false;
            }
            if (!lb7.d(strM, vn4.R)) {
                return n73Var.d(sj5Var, t63Var);
            }
            if (!t63Var.H(8, strM)) {
                t63Var.C(this);
                return false;
            }
            if (t63Var.H(8, "td")) {
                t63Var.o("td");
            } else {
                t63Var.o("th");
            }
            return t63Var.n(sj5Var);
        }
        boolean zH = t63Var.H(8, strM);
        x63 x63Var = r73.y;
        if (!zH) {
            t63Var.C(this);
            t63Var.m = x63Var;
            return false;
        }
        t63Var.E(false);
        if (!t63Var.d(strM, "http://www.w3.org/1999/xhtml")) {
            t63Var.C(this);
        }
        t63Var.T(strM);
        t63Var.u();
        t63Var.m = x63Var;
        return true;
    }
}
