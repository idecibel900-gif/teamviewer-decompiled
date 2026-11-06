package o;

import androidx.compose.ui.graphics.painter.BitmapPainter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class re3 {
    public static final kh7 a = new kh7(new uf2(20));
    public static final kh7 b = new kh7(new uf2(21));
    public static final kh7 c = new kh7(new uf2(22));
    public static final iu d = new iu((byte) 6);

    public static final ud5 a(f62 f62Var, ux2 ux2Var) {
        ud5 ud5VarT;
        f62Var.getClass();
        ux2Var.W(-1508925367);
        zw5 zw5Var = wb6.b;
        ((ub6) ux2Var.j(zw5Var)).getClass();
        tb6 tb6VarA = ub6.a(ux2Var);
        boolean zF = ux2Var.f(f62Var) | ux2Var.f(tb6VarA);
        Object objK = ux2Var.K();
        Object obj = e01.a;
        if (zF || objK == obj) {
            objK = wb6.b(f62Var, tb6VarA).b;
            ux2Var.g0(objK);
        }
        String str = (String) objK;
        boolean zG = bc7.G(true, str, ".xml");
        hc1 hc1Var = null;
        if (zG) {
            ux2Var.W(-1267601485);
            zw5 zw5Var2 = dc6.a;
            zw5Var2.getClass();
            sh.a(0, ux2Var);
            jj1 jj1Var = (jj1) ux2Var.j(zw5Var2);
            in1 in1Var = (in1) ux2Var.j(b11.h);
            Object objK2 = ux2Var.K();
            if (objK2 == obj) {
                objK2 = new uf2((byte) 24);
                ux2Var.g0(objK2);
            }
            Function0 function0 = (Function0) objK2;
            boolean zF2 = ux2Var.f(f62Var) | ux2Var.h(jj1Var) | ux2Var.f(in1Var);
            Object objK3 = ux2Var.K();
            if (zF2 || objK3 == obj) {
                Object qe3Var = new qe3(f62Var, jj1Var, in1Var, hc1Var, (byte) 1);
                jj1Var = jj1Var;
                in1Var = in1Var;
                ux2Var.g0(qe3Var);
                objK3 = qe3Var;
            }
            ud5VarT = x67.t((we3) vs1.R(f62Var, jj1Var, in1Var, function0, (hw2) objK3, ux2Var).getValue(), ux2Var);
            ux2Var.p(false);
        } else {
            if (!bc7.G(true, str, ".svg")) {
                ux2Var.W(-1267441060);
                zw5 zw5Var3 = dc6.a;
                zw5Var3.getClass();
                sh.a(0, ux2Var);
                jj1 jj1Var2 = (jj1) ux2Var.j(zw5Var3);
                ((ub6) ux2Var.j(zw5Var)).getClass();
                Object objA = ub6.a(ux2Var);
                Object objK4 = ux2Var.K();
                if (objK4 == obj) {
                    objK4 = new uf2((byte) 19);
                    ux2Var.g0(objK4);
                }
                Function0 function1 = (Function0) objK4;
                boolean zF3 = ux2Var.f(f62Var) | ux2Var.f(objA) | ux2Var.h(jj1Var2);
                Object objK5 = ux2Var.K();
                if (zF3 || objK5 == obj) {
                    Object bjVar = new bj((Object) f62Var, objA, (Object) jj1Var2, hc1Var, (byte) 13);
                    ux2Var.g0(bjVar);
                    objK5 = bjVar;
                }
                BitmapPainter bitmapPainter = new BitmapPainter((vi) vs1.R(f62Var, jj1Var2, objA, function1, (hw2) objK5, ux2Var).getValue());
                ux2Var.p(false);
                ux2Var.p(false);
                return bitmapPainter;
            }
            ux2Var.W(-1267490226);
            zw5 zw5Var4 = dc6.a;
            zw5Var4.getClass();
            sh.a(0, ux2Var);
            jj1 jj1Var3 = (jj1) ux2Var.j(zw5Var4);
            in1 in1Var2 = (in1) ux2Var.j(b11.h);
            Object objK6 = ux2Var.K();
            if (objK6 == obj) {
                objK6 = new uf2((byte) 23);
                ux2Var.g0(objK6);
            }
            Function0 function2 = (Function0) objK6;
            boolean zF4 = ux2Var.f(f62Var) | ux2Var.h(jj1Var3) | ux2Var.f(in1Var2);
            Object objK7 = ux2Var.K();
            if (zF4 || objK7 == obj) {
                Object qe3Var2 = new qe3(f62Var, jj1Var3, in1Var2, hc1Var, (byte) 0);
                jj1Var3 = jj1Var3;
                in1Var2 = in1Var2;
                ux2Var.g0(qe3Var2);
                objK7 = qe3Var2;
            }
            ud5VarT = (ud5) vs1.R(f62Var, jj1Var3, in1Var2, function2, (hw2) objK7, ux2Var).getValue();
            ux2Var.p(false);
        }
        ux2Var.p(false);
        return ud5VarT;
    }
}
