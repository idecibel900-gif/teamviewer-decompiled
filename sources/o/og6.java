package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class og6 {
    public static final js0 a;

    static {
        ht2 ht2Var = new ht2("java.lang.Void");
        ht2 ht2VarE = ht2Var.e();
        sy4 sy4VarF = ht2Var.f();
        sy4VarF.getClass();
        a = new js0(ht2VarE, sy4VarF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ms3 a(xw2 xw2Var) {
        String strM = o77.m(xw2Var);
        if (strM == null) {
            if (xw2Var instanceof eu5) {
                String strB = bp1.i(xw2Var).getName().b();
                strB.getClass();
                strM = sr3.a(strB);
            } else if (xw2Var instanceof ju5) {
                String strB2 = bp1.i(xw2Var).getName().b();
                strB2.getClass();
                strM = "set".concat(sr3.b(strB2) ? strB2.substring(2) : g68.i(strB2));
            } else {
                strM = ((gi1) xw2Var).getName().b();
                strM.getClass();
            }
        }
        return new ms3(new os3(strM, io1.E(xw2Var, 1)));
    }

    public static zu1 b(bu5 bu5Var) {
        bu5Var.getClass();
        bu5 bu5VarA = ((bu5) zo1.t(bu5Var)).a();
        bu5VarA.getClass();
        if (bu5VarA instanceof cq1) {
            cq1 cq1Var = (cq1) bu5VarA;
            qv5 qv5Var = cq1Var.M;
            my2 my2Var = jt3.d;
            my2Var.getClass();
            dt3 dt3Var = (dt3) it1.C(qv5Var, my2Var);
            if (dt3Var != null) {
                return new ws3(bu5VarA, qv5Var, dt3Var, cq1Var.N, cq1Var.O);
            }
        } else if (bu5VarA instanceof ho3) {
            ho3 ho3Var = (ho3) bu5VarA;
            s67 s67VarC = ho3Var.c();
            ng6 ng6Var = s67VarC instanceof ng6 ? (ng6) s67VarC : null;
            e86 e86Var = ng6Var != null ? ng6Var.m : null;
            if (e86Var instanceof g86) {
                return new us3(((g86) e86Var).a);
            }
            if (!(e86Var instanceof j86)) {
                yq4.n("Incorrect resolution sequence for Java field ", bu5VarA, " (source = ", e86Var);
                return null;
            }
            Method method = ((j86) e86Var).a;
            ju5 ju5Var = ho3Var.J;
            s67 s67VarC2 = ju5Var != null ? ju5Var.c() : null;
            ng6 ng6Var2 = s67VarC2 instanceof ng6 ? (ng6) s67VarC2 : null;
            e86 e86Var2 = ng6Var2 != null ? ng6Var2.m : null;
            j86 j86Var = e86Var2 instanceof j86 ? (j86) e86Var2 : null;
            return new vs3(method, j86Var != null ? j86Var.a : null);
        }
        eu5 getter = bu5VarA.getGetter();
        getter.getClass();
        ms3 ms3VarA = a(getter);
        ju5 ju5VarB = bu5VarA.b();
        return new xs3(ms3VarA, ju5VarB != null ? a(ju5VarB) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static it1 c(xw2 xw2Var) {
        xw2Var.getClass();
        xw2 xw2VarA = ((xw2) zo1.t(xw2Var)).a();
        xw2VarA.getClass();
        if (!(xw2VarA instanceof hp1)) {
            if (xw2VarA instanceof eo3) {
                s67 s67VarC = ((eo3) xw2VarA).c();
                ng6 ng6Var = s67VarC instanceof ng6 ? (ng6) s67VarC : null;
                e86 e86Var = ng6Var != null ? ng6Var.m : null;
                j86 j86Var = e86Var instanceof j86 ? (j86) e86Var : null;
                if (j86Var != null) {
                    return new ks3(j86Var.a);
                }
                hk0.q(xw2VarA, "Incorrect resolution sequence for Java method ");
                return null;
            }
            if (xw2VarA instanceof un3) {
                s67 s67VarC2 = ((un3) xw2VarA).c();
                ng6 ng6Var2 = s67VarC2 instanceof ng6 ? (ng6) s67VarC2 : null;
                e86 e86Var2 = ng6Var2 != null ? ng6Var2.m : null;
                if (e86Var2 instanceof d86) {
                    return new js3(((d86) e86Var2).a);
                }
                if (e86Var2 instanceof a86) {
                    Class cls = ((a86) e86Var2).a;
                    if (cls.isAnnotation()) {
                        return new is3(cls);
                    }
                }
                yq4.n("Incorrect resolution sequence for Java constructor ", xw2VarA, " (", e86Var2);
                return null;
            }
            gi1 gi1Var = (gi1) xw2VarA;
            if ((gi1Var.getName().equals(t87.c) && io1.W(xw2VarA)) || ((gi1Var.getName().equals(t87.a) && io1.W(xw2VarA)) || (im3.n(gi1Var.getName(), eu0.e) && xw2VarA.J().isEmpty()))) {
                return a(xw2VarA);
            }
            StringBuilder sb = new StringBuilder("Unknown origin of ");
            sb.append(xw2VarA);
            Object obj = xw2VarA.getClass();
            sb.append(" (");
            sb.append(obj);
            sb.append(')');
            throw new kz3(sb.toString());
        }
        up1 up1Var = (up1) xw2VarA;
        t1 t1VarV = up1Var.v();
        if (t1VarV instanceof iv5) {
            dg2 dg2Var = kt3.a;
            os3 os3VarC = kt3.c((iv5) t1VarV, up1Var.K(), up1Var.G());
            if (os3VarC != null) {
                return new ms3(os3VarC);
            }
        }
        if (t1VarV instanceof vu5) {
            dg2 dg2Var2 = kt3.a;
            os3 os3VarA = kt3.a((vu5) t1VarV, up1Var.K(), up1Var.G());
            if (os3VarA != null) {
                String str = os3VarA.e;
                String str2 = os3VarA.f;
                fi1 fi1VarI = xw2Var.i();
                fi1VarI.getClass();
                if (pi3.b(fi1VarI)) {
                    return new ms3(os3VarA);
                }
                fi1 fi1VarI2 = xw2Var.i();
                fi1VarI2.getClass();
                if (!pi3.c(fi1VarI2)) {
                    return new ls3(os3VarA);
                }
                z61 z61Var = (z61) xw2Var;
                if (z61Var.t()) {
                    if (!im3.n(str, "constructor-impl") || !bc7.G(false, str2, ")V")) {
                        yq4.q(os3VarA, "Invalid signature: ");
                        return null;
                    }
                } else {
                    if (!im3.n(str, "constructor-impl")) {
                        yq4.q(os3VarA, "Invalid signature: ");
                        return null;
                    }
                    ns4 ns4VarU = z61Var.u();
                    ns4VarU.getClass();
                    js0 js0VarF = bp1.f(ns4VarU);
                    js0VarF.getClass();
                    String strB = os0.b(js0VarF.b());
                    if (bc7.G(false, str2, ")V")) {
                        String strConcat = ub7.j0(str2, "V").concat(strB);
                        str.getClass();
                        os3VarA = new os3(str, strConcat);
                    } else if (!bc7.G(false, str2, strB)) {
                        yq4.q(os3VarA, "Invalid signature: ");
                        return null;
                    }
                }
                return new ms3(os3VarA);
            }
        }
        return a(xw2VarA);
    }
}
