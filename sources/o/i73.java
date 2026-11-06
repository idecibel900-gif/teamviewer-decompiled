package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final enum i73 extends r73 {
    public i73() {
        super("ForeignContent", 22);
    }

    public static boolean e(sj5 sj5Var, t63 t63Var) {
        while (!t63Var.e.isEmpty()) {
            o82 o82VarC = t63Var.c();
            if (!"http://www.w3.org/1999/xhtml".equals(o82VarC.p.m)) {
                hn7 hn7Var = o82VarC.p;
                if (("http://www.w3.org/1998/Math/MathML".equals(hn7Var.m) && lb7.d(hn7Var.f993o, t63.A)) || t63.Q(o82VarC)) {
                    break;
                }
                t63Var.m();
            } else {
                break;
            }
        }
        return t63Var.m.d(sj5Var, t63Var);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        ly lyVar;
        ly lyVar2;
        ly lyVar3;
        ArrayList arrayList = t63Var.e;
        int iB = ua5.B(sj5Var.a);
        if (iB == 0) {
            t63Var.C(this);
            return true;
        }
        if (iB == 1) {
            ew7 ew7Var = (ew7) sj5Var;
            if (lb7.c(ew7Var.e, vn4.f0)) {
                return e(sj5Var, t63Var);
            }
            if (ew7Var.e.equals("font") && (((lyVar = ew7Var.g) != null && lyVar.m("color") != -1) || (((lyVar2 = ew7Var.g) != null && lyVar2.m("face") != -1) || ((lyVar3 = ew7Var.g) != null && lyVar3.m("size") != -1)))) {
                return e(sj5Var, t63Var);
            }
            String str = t63Var.c().p.m;
            t63Var.O(ew7Var, str);
            cz7 cz7VarI = t63Var.h.d(ew7Var.d.F(), ew7Var.e, str, t63Var.g.a).i();
            if (cz7VarI != null) {
                boolean zEquals = ew7Var.e.equals("script");
                kw7 kw7Var = t63Var.c;
                if (zEquals) {
                    kw7Var.m(cz7.r);
                    return true;
                }
                kw7Var.m(cz7VarI);
            }
        } else if (iB == 2) {
            dw7 dw7Var = (dw7) sj5Var;
            if (dw7Var.e.equals("br") || dw7Var.e.equals("p")) {
                return e(sj5Var, t63Var);
            }
            if (dw7Var.e.equals("script") && t63Var.d("script", "http://www.w3.org/2000/svg")) {
                t63Var.m();
                return true;
            }
            if (arrayList.isEmpty()) {
                hk0.l("Stack unexpectedly empty");
                return false;
            }
            int size = arrayList.size() - 1;
            o82 o82Var = (o82) arrayList.get(size);
            if (!o82Var.t(dw7Var.e)) {
                t63Var.C(this);
            }
            while (size != 0) {
                if (o82Var.t(dw7Var.e)) {
                    String str2 = o82Var.p.f993o;
                    for (int size2 = arrayList.size() - 1; size2 >= 0 && !t63Var.m().t(str2); size2--) {
                    }
                    break;
                }
                size--;
                o82Var = (o82) arrayList.get(size);
                if (o82Var.p.m.equals("http://www.w3.org/1999/xhtml")) {
                    return t63Var.m.d(sj5Var, t63Var);
                }
            }
        } else {
            if (iB == 3) {
                t63Var.K((aw7) sj5Var);
                return true;
            }
            if (iB == 4) {
                zv7 zv7Var = (zv7) sj5Var;
                if (r73.b(zv7Var)) {
                    t63Var.I(zv7Var, false);
                    return true;
                }
                t63Var.I(zv7Var, true);
                t63Var.x = false;
                return true;
            }
            if (iB != 6) {
                hk0.l("Unexpected state: ".concat(to7.r(sj5Var.a)));
                return false;
            }
        }
        return true;
    }
}
