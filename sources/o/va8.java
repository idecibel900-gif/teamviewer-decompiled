package o;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class va8 {
    public static final long a = t61.b(0, 0, 0, 0, 5);
    public static final /* synthetic */ int b = 0;

    public static final vx a(ux2 ux2Var) {
        if (!((Boolean) ux2Var.j(xj3.a)).booleanValue()) {
            ux2Var.W(2019088453);
            ux2Var.p(false);
            return null;
        }
        ux2Var.W(2019030948);
        vx vxVar = (vx) ux2Var.j(wc4.a);
        ux2Var.p(false);
        return vxVar;
    }

    public static final a17 b(sb1 sb1Var, ux2 ux2Var) {
        Object obj;
        Object obj2;
        boolean zN = im3.n(sb1Var, rb1.d);
        boolean zG = ux2Var.g(zN);
        Object objK = ux2Var.K();
        if (zG || objK == e01.a) {
            if (zN) {
                obj = a17.a;
            } else {
                v61 v61Var = new v61();
                v61Var.b = a;
                v61Var.c = new ArrayList();
                obj = v61Var;
            }
            Object obj3 = obj;
            ux2Var.g0(obj3);
            obj2 = obj3;
        }
        obj2 = objK;
        return (a17) obj2;
    }

    public static final ke3 c(Object obj, ux2 ux2Var) {
        ux2Var.W(1319639034);
        if (obj instanceof ke3) {
            ux2Var.W(1530875884);
            ke3 ke3Var = (ke3) obj;
            ux2Var.p(false);
            ux2Var.p(false);
            return ke3Var;
        }
        ux2Var.W(1530915130);
        Context context = (Context) ux2Var.j(lh.b);
        boolean zF = ux2Var.f(context) | ux2Var.f(obj);
        Object objK = ux2Var.K();
        if (zF || objK == e01.a) {
            ge3 ge3Var = new ge3(context);
            ge3Var.c = obj;
            objK = ge3Var.a();
            ux2Var.g0(objK);
        }
        ke3 ke3Var2 = (ke3) objK;
        ux2Var.p(false);
        ux2Var.p(false);
        return ke3Var2;
    }

    public static final ke3 d(Object obj, sb1 sb1Var, ux2 ux2Var, int i) {
        ux2Var.W(-329318062);
        boolean z = obj instanceof ke3;
        Object obj2 = e01.a;
        if (!z) {
            ux2Var.W(-1008595950);
            Context context = (Context) ux2Var.j(lh.b);
            a17 a17VarB = b(sb1Var, ux2Var);
            boolean zF = ux2Var.f(context) | ux2Var.f(obj) | ux2Var.f(a17VarB);
            Object objK = ux2Var.K();
            if (zF || objK == obj2) {
                ge3 ge3Var = new ge3(context);
                ge3Var.c = obj;
                ge3Var.p = a17VarB;
                objK = ge3Var.a();
                ux2Var.g0(objK);
            }
            ke3 ke3Var = (ke3) objK;
            ux2Var.p(false);
            ux2Var.p(false);
            return ke3Var;
        }
        ux2Var.W(-1008942344);
        ke3 ke3Var2 = (ke3) obj;
        if (ke3Var2.t.j != null) {
            ux2Var.W(-1008902292);
            ux2Var.p(false);
            ux2Var.p(false);
            ux2Var.p(false);
            return ke3Var2;
        }
        ux2Var.W(-1008854118);
        a17 a17VarB2 = b(sb1Var, ux2Var);
        boolean zF2 = ((((i & 14) ^ 6) > 4 && ux2Var.f(obj)) || (i & 6) == 4) | ux2Var.f(a17VarB2);
        Object objK2 = ux2Var.K();
        if (zF2 || objK2 == obj2) {
            ge3 ge3VarA = ke3.a(ke3Var2);
            ge3VarA.p = a17VarB2;
            objK2 = ge3VarA.a();
            ux2Var.g0(objK2);
        }
        ke3 ke3Var3 = (ke3) objK2;
        ux2Var.p(false);
        ux2Var.p(false);
        ux2Var.p(false);
        return ke3Var3;
    }

    public static final long e(long j) {
        int iS0 = vn4.s0(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) vn4.s0(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iS0) << 32);
    }

    public static void f(String str) {
        throw new IllegalArgumentException(to7.k("Unsupported type: ", str, ". ", fx3.g("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void g(ke3 ke3Var) {
        Object obj = ke3Var.b;
        if (obj instanceof ge3) {
            hk0.g("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof vi) {
            f("ImageBitmap");
            throw null;
        }
        if (obj instanceof we3) {
            f("ImageVector");
            throw null;
        }
        if (obj instanceof ud5) {
            f("Painter");
            throw null;
        }
        if (ke3Var.c != null) {
            hk0.g("request.target must be null.");
        } else {
            if (((x84) nv1.w(ke3Var, ne3.e)) == null) {
                return;
            }
            hk0.g("request.lifecycle must be null.");
        }
    }
}
