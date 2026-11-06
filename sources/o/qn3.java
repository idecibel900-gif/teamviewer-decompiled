package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qn3 {
    public static final sy4 a = sy4.e("message");
    public static final sy4 b = sy4.e("allowedTargets");
    public static final sy4 c = sy4.e("value");
    public static final Map d = xm4.R(new vd5(s87.t, tr3.c), new vd5(s87.w, tr3.d), new vd5(s87.x, tr3.f));

    public static dp5 a(ht2 ht2Var, rn3 rn3Var, yc4 yc4Var) {
        q76 q76VarA;
        ht2Var.getClass();
        rn3Var.getClass();
        yc4Var.getClass();
        if (ht2Var.equals(s87.m)) {
            ht2 ht2Var2 = tr3.e;
            ht2Var2.getClass();
            q76 q76VarA2 = rn3Var.a(ht2Var2);
            if (q76VarA2 != null) {
                return new zn3(q76VarA2, yc4Var);
            }
        }
        ht2 ht2Var3 = (ht2) d.get(ht2Var);
        if (ht2Var3 == null || (q76VarA = rn3Var.a(ht2Var3)) == null) {
            return null;
        }
        return b(yc4Var, q76VarA, false);
    }

    public static dp5 b(yc4 yc4Var, q76 q76Var, boolean z) {
        yc4Var.getClass();
        js0 js0VarA = p76.a(et1.z(et1.x(q76Var.a)));
        ht2 ht2Var = tr3.c;
        ht2Var.getClass();
        if (js0VarA.equals(im3.h0(ht2Var))) {
            return new ko3(q76Var, yc4Var);
        }
        ht2 ht2Var2 = tr3.d;
        ht2Var2.getClass();
        if (js0VarA.equals(im3.h0(ht2Var2))) {
            return new jo3(q76Var, yc4Var);
        }
        ht2 ht2Var3 = tr3.f;
        ht2Var3.getClass();
        if (js0VarA.equals(im3.h0(ht2Var3))) {
            return new pn3(yc4Var, q76Var, s87.x);
        }
        ht2 ht2Var4 = tr3.e;
        ht2Var4.getClass();
        if (js0VarA.equals(im3.h0(ht2Var4))) {
            return null;
        }
        return new y14(yc4Var, q76Var, z);
    }
}
