package o;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class ub6 {
    public static tb6 a(ux2 ux2Var) {
        mn1 mn1Var;
        ux2Var.W(1808039825);
        jd4 jd4Var = (jd4) vl5.a.y().m.get(0);
        boolean zX = ka0.x(ux2Var);
        in1 in1Var = (in1) ux2Var.j(b11.h);
        boolean zF = ux2Var.f(jd4Var) | ux2Var.g(zX) | ux2Var.f(in1Var);
        Object objK = ux2Var.K();
        if (zF || objK == e01.a) {
            Locale locale = jd4Var.a;
            zz3 zz3Var = new zz3(locale.getLanguage());
            qj6 qj6Var = new qj6(locale.getScript());
            f96 f96Var = new f96(locale.getCountry());
            vt7.m.getClass();
            vt7 vt7Var = zX ? vt7.f2345o : vt7.n;
            float density = in1Var.getDensity();
            mn1.n.getClass();
            double d = density;
            if (d <= 0.75d) {
                mn1Var = mn1.LDPI;
            } else if (d <= 1.0d) {
                mn1Var = mn1.MDPI;
            } else if (d <= 1.5d) {
                mn1Var = mn1.HDPI;
            } else if (d <= 2.0d) {
                mn1Var = mn1.XHDPI;
            } else {
                mn1Var = d <= 3.0d ? mn1.XXHDPI : mn1.XXXHDPI;
            }
            Object tb6Var = new tb6(zz3Var, qj6Var, f96Var, vt7Var, mn1Var);
            ux2Var.g0(tb6Var);
            objK = tb6Var;
        }
        tb6 tb6Var2 = (tb6) objK;
        ux2Var.p(false);
        return tb6Var2;
    }
}
