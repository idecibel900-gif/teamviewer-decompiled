package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class wb2 {
    public static final yn1 a = new yn1(zm.u, zm.v);
    public static final e87 b = db8.A0(0.0f, 400.0f, null, 5);
    public static final e87 c = db8.A0(0.0f, 400.0f, null, 5);
    public static final e87 d;
    public static final e87 e;

    static {
        Map map = sg8.a;
        d = db8.A0(0.0f, 400.0f, new vk3(4294967297L), 1);
        e = db8.A0(0.0f, 400.0f, new dl3(4294967297L), 1);
    }

    public static final void a(u18 u18Var, Function0 function0, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-1186853286);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(u18Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(function0) ? 32 : 16;
        }
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            bg5 bg5Var = u18Var.e;
            bg5 bg5Var2 = u18Var.d;
            boolean z = bg5Var.getValue() != null;
            if (im3.n(u18Var.a.p0(), bg5Var2.getValue()) && !z) {
                function0.a();
            }
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            Object obj = objK;
            if (objK == awVar) {
                boolean[] zArr = {z};
                ux2Var.g0(zArr);
                obj = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj;
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = new Object[1];
                ux2Var.g0(objK2);
            }
            Object[] objArr = (Object[]) objK2;
            if (!im3.n(objArr[0], bg5Var2.getValue())) {
                if (!z && !zArr2[0]) {
                    function0.a();
                }
                objArr[0] = bg5Var2.getValue();
            }
            zArr2[0] = z;
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pb2(u18Var, function0, i);
        }
    }

    public static bc2 b(rl2 rl2Var, w50 w50Var, int i) {
        y50 y50Var;
        w50 w50Var2 = xz2.C;
        if ((i & 1) != 0) {
            Map map = sg8.a;
            rl2Var = db8.A0(0.0f, 400.0f, new dl3(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            w50Var = w50Var2;
        }
        if (im3.n(w50Var, xz2.A)) {
            y50Var = xz2.r;
        } else {
            y50Var = im3.n(w50Var, w50Var2) ? xz2.t : xz2.s;
        }
        return c(rl2Var, y50Var, new zm(1, (byte) 16));
    }

    public static final bc2 c(rl2 rl2Var, y50 y50Var, Function1 function1) {
        return new bc2(new t18((ih2) null, (f17) null, new um0(y50Var, function1, rl2Var, true), (pi6) null, (LinkedHashMap) null, 123));
    }

    public static bc2 d(rl2 rl2Var, int i) {
        y50 y50Var;
        x50 x50Var = xz2.z;
        x50 x50Var2 = xz2.x;
        if ((i & 1) != 0) {
            Map map = sg8.a;
            rl2Var = db8.A0(0.0f, 400.0f, new dl3(4294967297L), 1);
        }
        x50 x50Var3 = (i & 2) != 0 ? x50Var : x50Var2;
        if (im3.n(x50Var3, x50Var2)) {
            y50Var = xz2.p;
        } else {
            y50Var = im3.n(x50Var3, x50Var) ? xz2.v : xz2.s;
        }
        return c(rl2Var, y50Var, new zm(1, (byte) 17));
    }

    public static bc2 e(rl2 rl2Var, int i) {
        if ((i & 1) != 0) {
            rl2Var = db8.A0(0.0f, 400.0f, null, 5);
        }
        return new bc2(new t18(new ih2(0.0f, rl2Var), (f17) null, (um0) null, (pi6) null, (LinkedHashMap) null, 126));
    }

    public static hf2 f(rl2 rl2Var, int i) {
        if ((i & 1) != 0) {
            rl2Var = db8.A0(0.0f, 400.0f, null, 5);
        }
        return new hf2(new t18(new ih2(0.0f, rl2Var), (f17) null, (um0) null, (pi6) null, (LinkedHashMap) null, 126));
    }

    public static bc2 g(z38 z38Var, float f, int i) {
        rl2 rl2VarA0 = z38Var;
        if ((i & 1) != 0) {
            rl2VarA0 = db8.A0(0.0f, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new bc2(new t18((ih2) null, (f17) null, (um0) null, new pi6(f, d18.b, rl2VarA0), (LinkedHashMap) null, 119));
    }

    public static hf2 h(rl2 rl2Var, w50 w50Var, int i) {
        y50 y50Var;
        w50 w50Var2 = xz2.C;
        if ((i & 1) != 0) {
            Map map = sg8.a;
            rl2Var = db8.A0(0.0f, 400.0f, new dl3(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            w50Var = w50Var2;
        }
        if (im3.n(w50Var, xz2.A)) {
            y50Var = xz2.r;
        } else {
            y50Var = im3.n(w50Var, w50Var2) ? xz2.t : xz2.s;
        }
        return i(rl2Var, y50Var, new zm(1, (byte) 18));
    }

    public static final hf2 i(rl2 rl2Var, y50 y50Var, Function1 function1) {
        return new hf2(new t18((ih2) null, (f17) null, new um0(y50Var, function1, rl2Var, true), (pi6) null, (LinkedHashMap) null, 123));
    }

    public static hf2 j(e87 e87Var, int i) {
        y50 y50Var;
        x50 x50Var = xz2.z;
        x50 x50Var2 = xz2.x;
        if ((i & 1) != 0) {
            Map map = sg8.a;
            e87Var = db8.A0(0.0f, 400.0f, new dl3(4294967297L), 1);
        }
        x50 x50Var3 = (i & 2) != 0 ? x50Var : x50Var2;
        if (im3.n(x50Var3, x50Var2)) {
            y50Var = xz2.p;
        } else {
            y50Var = im3.n(x50Var3, x50Var) ? xz2.v : xz2.s;
        }
        return i(e87Var, y50Var, new zm(1, (byte) 19));
    }

    public static final bc2 k(Function1 function1, rl2 rl2Var) {
        return new bc2(new t18((ih2) null, new f17(new vb2(function1, (byte) 0), rl2Var), (um0) null, (pi6) null, (LinkedHashMap) null, 125));
    }

    public static final hf2 l(Function1 function1, rl2 rl2Var) {
        return new hf2(new t18((ih2) null, new f17(new vb2(function1, (byte) 1), rl2Var), (um0) null, (pi6) null, (LinkedHashMap) null, 125));
    }
}
