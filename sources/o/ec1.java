package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ec1 {
    public static final zb1 a;

    static {
        h72 h72Var = gk.a;
        long j = rv0.d;
        long j2 = rv0.b;
        a = new zb1(j, j2, j2, rv0.b(0.38f, j2), rv0.b(0.38f, j2));
    }

    public static final void a(zb1 zb1Var, fs4 fs4Var, yy0 yy0Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-527864079);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(zb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            x50 x50Var = bc1.a;
            qf6 qf6VarA = sf6.a(4.0f);
            boolean z = w32.a(3.0f, 0.0f) > 0;
            long j = p03.a;
            fs4 fs4VarZ = im3.Z(ka0.D(kh.J(au8.s((w32.a(3.0f, 0.0f) > 0 || z) ? fs4Var.f(new mw6(qf6VarA, z, j, j)) : fs4Var, zb1Var.a, kh.V)), 0.0f, bc1.d, 1), im3.W(ux2Var), true);
            int i3 = (i2 << 3) & 7168;
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarZ);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            yy0Var.d(lw0.a, ux2Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) zb1Var, (Object) fs4Var, (Object) yy0Var, i, (byte) 5);
        }
    }

    public static final void b(fs4 fs4Var, zb1 zb1Var, Function1 function1, ux2 ux2Var, int i, int i2) {
        int i3;
        int i4;
        ux2Var.Y(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (ux2Var.f(fs4Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (ux2Var.f(zb1Var) ? 32 : 16);
        }
        int i7 = i4 | (ux2Var.h(function1) ? 256 : 128);
        if (ux2Var.N(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                fs4Var = cs4.b;
            }
            if (i6 != 0) {
                zb1Var = a;
            }
            a(zb1Var, fs4Var, au8.O(-250345048, new sd(function1, zb1Var, (byte) 3), ux2Var), ux2Var, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            ux2Var.Q();
        }
        fs4 fs4Var2 = fs4Var;
        zb1 zb1Var2 = zb1Var;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new cc1(fs4Var2, zb1Var2, function1, i, i2);
        }
    }

    public static final void c(String str, boolean z, zb1 zb1Var, fs4 fs4Var, iw2 iw2Var, Function0 function0, ux2 ux2Var, int i) {
        int i2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-2001167027);
        if ((i & 6) == 0) {
            i2 = (ux2Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var2.f(zb1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var2.f(fs4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var2.h(iw2Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var2.h(function0) ? 131072 : 65536;
        }
        int i3 = i2;
        if (ux2Var2.N(i3 & 1, (74899 & i3) != 74898)) {
            x50 x50Var = bc1.a;
            float f = bc1.c;
            ew ewVar = new ew(f, new hk0((byte) 2));
            boolean z2 = ((i3 & 112) == 32) | ((458752 & i3) == 131072);
            Object objK = ux2Var2.K();
            if (z2 || objK == e01.a) {
                objK = new dc1((byte) 0, function0, z);
                ux2Var2.g0(objK);
            }
            fs4 fs4VarD = ka0.D(androidx.compose.foundation.layout.b.n(androidx.compose.foundation.layout.b.c(androidx.compose.foundation.b.b(fs4Var, z, str, null, (Function0) objK, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            dg6 dg6VarA = cg6.a(ewVar, x50Var, ux2Var2, 54);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarD);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z3 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z3) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(dg6VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            if (iw2Var == null) {
                ux2Var2.W(-1597947094);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-1597947093);
                float f2 = bc1.e;
                fs4 fs4VarJ = androidx.compose.foundation.layout.b.j(cs4.b, f2, 0.0f, f2, f2, 2);
                do4 do4VarC = ua0.c(xz2.f2564o, false);
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarJ);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC, iz0Var, ux2Var2);
                o67.n(yj5VarL2, iz0Var2, ux2Var2);
                e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS2, iz0Var4, ux2Var2);
                iw2Var.d(new rv0(z ? zb1Var.c : zb1Var.e), ux2Var2, 0);
                ux2Var2.p(true);
                ux2Var2.p(false);
            }
            long j = z ? zb1Var.b : zb1Var.d;
            j51.e(str, new s14(1.0f, true), new ot7(j, bc1.h, bc1.i, bc1.k, bc1.b, bc1.j, 16613240), null, 0, false, 1, 0, ux2Var2, (i3 & 14) | 1572864, 952);
            ux2Var2 = ux2Var2;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new fb(str, z, zb1Var, fs4Var, iw2Var, function0, i);
        }
    }
}
