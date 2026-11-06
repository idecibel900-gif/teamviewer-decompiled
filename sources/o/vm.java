package o;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class vm {
    public static final e87 a = db8.A0(0.0f, 0.0f, null, 7);

    static {
        Map map = sg8.a;
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final i97 a(float f, rl2 rl2Var, String str, ux2 ux2Var, int i, int i2) {
        int i3 = i2 & 2;
        e87 e87Var = a;
        if (i3 != 0) {
            rl2Var = e87Var;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (rl2Var == e87Var) {
            ux2Var.W(1144115775);
            boolean zC = ux2Var.c(0.01f);
            Object objK = ux2Var.K();
            if (zC || objK == e01.a) {
                objK = db8.A0(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                ux2Var.g0(objK);
            }
            rl2Var = (e87) objK;
            ux2Var.p(false);
        } else {
            ux2Var.W(1144225701);
            ux2Var.p(false);
        }
        return b(Float.valueOf(f), vn4.j0, rl2Var, null, str2, ux2Var, (i << 3) & 57344, 0);
    }

    public static final i97 b(Object obj, yn1 yn1Var, jo joVar, Float f, String str, ux2 ux2Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object objK = ux2Var.K();
        Object obj2 = e01.a;
        if (objK == obj2) {
            objK = h57.p(null);
            ux2Var.g0(objK);
        }
        px4 px4Var = (px4) objK;
        Object objK2 = ux2Var.K();
        if (objK2 == obj2) {
            objK2 = new km(obj, yn1Var, f);
            ux2Var.g0(objK2);
        }
        km kmVar = (km) objK2;
        Object objT = h57.t(null, ux2Var);
        if (f != null && (joVar instanceof e87)) {
            e87 e87Var = (e87) joVar;
            if (!im3.n(e87Var.c, f)) {
                joVar = new e87(e87Var.a, e87Var.b, f);
            }
        }
        Object objT2 = h57.t(joVar, ux2Var);
        Object objK3 = ux2Var.K();
        if (objK3 == obj2) {
            objK3 = ka0.d(-1, 6, null);
            ux2Var.g0(objK3);
        }
        Object obj3 = (wm0) objK3;
        boolean zH = ux2Var.h(obj3) | ux2Var.h(obj);
        Object objK4 = ux2Var.K();
        if (zH || objK4 == obj2) {
            objK4 = new x8(obj3, obj, (byte) 4);
            ux2Var.g0(objK4);
        }
        ck3.k((Function0) objK4, ux2Var);
        boolean zH2 = ux2Var.h(obj3) | ux2Var.h(kmVar) | ux2Var.f(objT2) | ux2Var.f(objT);
        Object objK5 = ux2Var.K();
        if (zH2 || objK5 == obj2) {
            Object umVar = new um(obj3, kmVar, objT2, objT, null, (byte) 0);
            ux2Var.g0(umVar);
            objK5 = umVar;
        }
        ck3.i(obj3, (hw2) objK5, ux2Var);
        i97 i97Var = (i97) px4Var.getValue();
        return i97Var == null ? kmVar.c : i97Var;
    }
}
