package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class vp4 {
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        ka0.i(2, 4.0f);
        ((Boolean) qp5.a.getValue()).getClass();
        a = 8.0f;
        b = 112.0f;
        c = 280.0f;
    }

    public static final void a(fs4 fs4Var, wx4 wx4Var, Function0 function0, hk6 hk6Var, pw6 pw6Var, long j, float f, yy0 yy0Var, ux2 ux2Var, int i) {
        Object objP0;
        boolean z;
        Object objP1;
        ux2Var.Y(-1278879194);
        int i2 = i | (ux2Var.f(fs4Var) ? 4 : 2) | (ux2Var.f(wx4Var) ? 32 : 16) | (ux2Var.h(function0) ? 256 : 128) | (ux2Var.f(hk6Var) ? 2048 : 1024) | (ux2Var.f(pw6Var) ? 16384 : 8192) | (ux2Var.e(j) ? 131072 : 65536) | (ux2Var.c(0.0f) ? 1048576 : 524288) | (ux2Var.c(f) ? 8388608 : 4194304) | (ux2Var.f(null) ? 67108864 : 33554432) | (ux2Var.h(yy0Var) ? 536870912 : 268435456);
        if (ux2Var.N(i2 & 1, (i2 & 306783379) != 306783378)) {
            u18 u18VarG0 = ck3.g0(wx4Var, "DropDownMenu", ux2Var, (((i2 >> 3) & 14) | 48) & 126);
            e87 e87VarC0 = xs1.c0(du4.n, ux2Var);
            e87 e87VarC1 = xs1.c0(du4.p, ux2Var);
            yn1 yn1Var = vn4.j0;
            boolean zG = u18VarG0.g();
            g2 g2Var = u18VarG0.a;
            Object obj = e01.a;
            if (zG) {
                g2Var = g2Var;
                e87VarC1 = e87VarC1;
                ux2Var.W(1666827533);
                ux2Var.p(false);
                objP0 = g2Var.p0();
            } else {
                ux2Var.W(1666573488);
                boolean zF = ux2Var.f(u18VarG0);
                objP0 = ux2Var.K();
                if (zF || objP0 == obj) {
                    n47 n47VarC = el5.c();
                    Function1 function1E = n47VarC != null ? n47VarC.e() : null;
                    n47 n47VarF = el5.f(n47VarC);
                    try {
                        Object objP2 = g2Var.p0();
                        el5.h(n47VarC, n47VarF, function1E);
                        ux2Var.g0(objP2);
                        objP0 = objP2;
                    } catch (Throwable th) {
                        el5.h(n47VarC, n47VarF, function1E);
                        throw th;
                    }
                } else {
                    g2Var = g2Var;
                }
                ux2Var.p(false);
            }
            boolean zBooleanValue = ((Boolean) objP0).booleanValue();
            ux2Var.W(-904349302);
            float f2 = zBooleanValue ? 1.0f : 0.8f;
            ux2Var.p(false);
            Float fValueOf = Float.valueOf(f2);
            boolean zF2 = ux2Var.f(u18VarG0);
            Object objK = ux2Var.K();
            if (zF2 || objK == obj) {
                objK = d57.b(new iq0(u18VarG0, (byte) 4));
                ux2Var.g0(objK);
            }
            boolean zBooleanValue2 = ((Boolean) ((i97) objK).getValue()).booleanValue();
            ux2Var.W(-904349302);
            float f3 = zBooleanValue2 ? 1.0f : 0.8f;
            ux2Var.p(false);
            Float fValueOf2 = Float.valueOf(f3);
            boolean zF3 = ux2Var.f(u18VarG0);
            Object objK2 = ux2Var.K();
            if (zF3 || objK2 == obj) {
                objK2 = d57.b(new iq0(u18VarG0, (byte) 5));
                ux2Var.g0(objK2);
            }
            ux2Var.W(-257488561);
            ux2Var.p(false);
            q18 q18VarZ = ck3.z(u18VarG0, fValueOf, fValueOf2, e87VarC0, yn1Var, ux2Var, 0);
            if (u18VarG0.g()) {
                z = false;
                ux2Var.W(1666827533);
                ux2Var.p(false);
                objP1 = g2Var.p0();
            } else {
                ux2Var.W(1666573488);
                boolean zF4 = ux2Var.f(u18VarG0);
                objP1 = ux2Var.K();
                if (zF4 || objP1 == obj) {
                    n47 n47VarC2 = el5.c();
                    Function1 function1E2 = n47VarC2 != null ? n47VarC2.e() : null;
                    n47 n47VarF2 = el5.f(n47VarC2);
                    try {
                        Object objP3 = g2Var.p0();
                        el5.h(n47VarC2, n47VarF2, function1E2);
                        ux2Var.g0(objP3);
                        objP1 = objP3;
                    } catch (Throwable th2) {
                        el5.h(n47VarC2, n47VarF2, function1E2);
                        throw th2;
                    }
                }
                z = false;
                ux2Var.p(false);
            }
            boolean zBooleanValue3 = ((Boolean) objP1).booleanValue();
            ux2Var.W(2062693622);
            float f4 = zBooleanValue3 ? 1.0f : 0.0f;
            ux2Var.p(z);
            Float fValueOf3 = Float.valueOf(f4);
            boolean zF5 = ux2Var.f(u18VarG0);
            Object objK3 = ux2Var.K();
            if (zF5 || objK3 == obj) {
                objK3 = d57.b(new iq0(u18VarG0, (byte) 6));
                ux2Var.g0(objK3);
            }
            boolean zBooleanValue4 = ((Boolean) ((i97) objK3).getValue()).booleanValue();
            ux2Var.W(2062693622);
            float f5 = zBooleanValue4 ? 1.0f : 0.0f;
            ux2Var.p(false);
            Float fValueOf4 = Float.valueOf(f5);
            boolean zF6 = ux2Var.f(u18VarG0);
            Object objK4 = ux2Var.K();
            if (zF6 || objK4 == obj) {
                objK4 = d57.b(new iq0(u18VarG0, (byte) 7));
                ux2Var.g0(objK4);
            }
            ux2Var.W(-1585412933);
            ux2Var.p(false);
            q18 q18VarZ2 = ck3.z(u18VarG0, fValueOf3, fValueOf4, e87VarC1, yn1Var, ux2Var, 0);
            boolean zBooleanValue5 = ((Boolean) ux2Var.j(xj3.a)).booleanValue();
            boolean zG2 = ux2Var.g(zBooleanValue5) | ux2Var.f(q18VarZ) | ((i2 & 112) == 32) | ux2Var.f(q18VarZ2) | ((i2 & 896) == 256);
            Object objK5 = ux2Var.K();
            if (zG2 || objK5 == obj) {
                Object up4Var = new up4(zBooleanValue5, wx4Var, function0, q18VarZ, q18VarZ2);
                ux2Var.g0(up4Var);
                objK5 = up4Var;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            ig7.a(di1.t(cs4.b, (Function1) objK5), pw6Var, j, 0L, 0.0f, f, au8.O(-816027071, new f9(fs4Var, (Object) hk6Var, yy0Var, (byte) 17), ux2Var), ux2Var, (i3 & 896) | (i3 & 112) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gj(fs4Var, wx4Var, function0, hk6Var, pw6Var, j, f, yy0Var, i);
        }
    }

    public static final void b(hw2 hw2Var, Function0 function0, fs4 fs4Var, hw2 hw2Var2, boolean z, np4 np4Var, nd5 nd5Var, ux2 ux2Var, int i) {
        int i2;
        Function0 function1;
        ux2Var.Y(-1325192924);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(hw2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i2 |= ux2Var.h(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.h(hw2Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ux2Var.f(np4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ux2Var.f(nd5Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= ux2Var.f(null) ? 67108864 : 33554432;
        }
        if (ux2Var.N(i2 & 1, (38347923 & i2) != 38347922)) {
            fs4 fs4VarA = ka0.A(androidx.compose.foundation.layout.b.o(androidx.compose.foundation.layout.b.c(androidx.compose.foundation.b.a(fs4Var, null, zd6.a(true, 0.0f, 0L, null, 254), z, null, function1, 24), 1.0f), b, 48.0f, c, 8), nd5Var);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var, 48);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarA);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            qs7.a(((rn4) ux2Var.j(un4.a)).b.m, au8.O(865999929, new na((Object) hw2Var2, (Object) np4Var, z, (Object) hw2Var, (byte) 2), ux2Var), ux2Var, 48);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new i5(hw2Var, function0, fs4Var, hw2Var2, z, np4Var, nd5Var, i);
        }
    }
}
