package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum l73 extends r73 {
    public l73() {
        super("InHead", 3);
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
            return false;
        }
        if (iB != 1) {
            if (iB != 2) {
                if (iB != 3) {
                    t63Var.o("head");
                    return t63Var.n(sj5Var);
                }
                t63Var.K((aw7) sj5Var);
                return true;
            }
            String strM = ((dw7) sj5Var).m();
            if (strM.equals("head")) {
                t63Var.m();
                t63Var.m = r73.q;
                return true;
            }
            if (lb7.d(strM, vn4.y)) {
                t63Var.o("head");
                return t63Var.n(sj5Var);
            }
            if (!strM.equals("template")) {
                t63Var.C(this);
                return false;
            }
            o82 o82VarF = t63Var.F(strM);
            if (o82VarF == null || o82VarF == t63Var.r) {
                t63Var.C(this);
                return true;
            }
            t63Var.E(true);
            if (!t63Var.d(strM, "http://www.w3.org/1999/xhtml")) {
                t63Var.C(this);
            }
            t63Var.T(strM);
            t63Var.u();
            t63Var.U();
            t63Var.b0();
            return true;
        }
        ew7 ew7Var = (ew7) sj5Var;
        String strM2 = ew7Var.m();
        if (strM2.equals("html")) {
            return r73.r.d(sj5Var, t63Var);
        }
        if (lb7.d(strM2, vn4.w)) {
            o82 o82VarN = t63Var.N(ew7Var);
            if (strM2.equals("base") && o82VarN.r("href") && !t63Var.f2085o) {
                String strA = o82VarN.a("href");
                if (strA.length() != 0) {
                    t63Var.f2085o = true;
                    i32 i32Var = t63Var.d;
                    i32Var.getClass();
                    i32Var.W(strA);
                }
            }
            return true;
        }
        if (strM2.equals("meta")) {
            t63Var.N(ew7Var);
            return true;
        }
        if (strM2.equals("title")) {
            r73.a(ew7Var, t63Var, t63Var.r(ew7Var).i());
            return true;
        }
        if (lb7.d(strM2, vn4.x)) {
            r73.a(ew7Var, t63Var, t63Var.r(ew7Var).i());
            return true;
        }
        if (strM2.equals("noscript")) {
            t63Var.B(t63Var.M(ew7Var));
            return true;
        }
        if (strM2.equals("script")) {
            r73.a(ew7Var, t63Var, cz7.r);
            return true;
        }
        if (strM2.equals("head")) {
            t63Var.C(this);
            return false;
        }
        if (!strM2.equals("template")) {
            t63Var.o("head");
            return t63Var.n(sj5Var);
        }
        t63Var.M(ew7Var);
        t63Var.s.add(null);
        t63Var.x = false;
        b73 b73Var = r73.C;
        t63Var.m = b73Var;
        t63Var.V(b73Var);
        return true;
    }
}
