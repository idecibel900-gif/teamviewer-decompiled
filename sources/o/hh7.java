package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class hh7 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final m47 f;

    static {
        float f2 = mo8.L;
        a = f2;
        b = mo8.V;
        c = mo8.S;
        float f3 = mo8.P;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new m47(0);
    }

    public static final void a(boolean z, Function1 function1, fs4 fs4Var, boolean z2, fh7 fh7Var, ux2 ux2Var, int i) {
        boolean z3;
        fh7 fh7Var2;
        int i2;
        fh7 fh7Var3;
        boolean z4;
        fs4 fs4VarI;
        Function1 function2 = function1;
        ux2Var.Y(-263339167);
        int i3 = i | (ux2Var.g(z) ? 4 : 2) | (ux2Var.h(function2) ? 32 : 16) | (ux2Var.f(fs4Var) ? 256 : 128) | 1666048;
        if (ux2Var.N(i3 & 1, (599187 & i3) != 599186)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                zv0 zv0Var = ((rn4) ux2Var.j(un4.a)).a;
                fh7 fh7Var4 = zv0Var.g0;
                long j = zv0Var.p;
                if (fh7Var4 == null) {
                    long jB = bw0.b(zv0Var, mo8.K);
                    long jB2 = bw0.b(zv0Var, mo8.N);
                    long j2 = rv0.g;
                    long jB3 = bw0.b(zv0Var, mo8.M);
                    long jB4 = bw0.b(zv0Var, mo8.U);
                    long jB5 = bw0.b(zv0Var, mo8.X);
                    long jB6 = bw0.b(zv0Var, mo8.T);
                    long jB7 = bw0.b(zv0Var, mo8.W);
                    long jX = j51.x(rv0.b(mo8.x, bw0.b(zv0Var, mo8.w)), j);
                    long jB8 = bw0.b(zv0Var, mo8.A);
                    float f2 = mo8.B;
                    fh7 fh7Var5 = new fh7(jB, jB2, j2, jB3, jB4, jB5, jB6, jB7, jX, j51.x(rv0.b(f2, jB8), j), j2, j51.x(rv0.b(mo8.z, bw0.b(zv0Var, mo8.y)), j), j51.x(rv0.b(mo8.D, bw0.b(zv0Var, mo8.C)), j), j51.x(rv0.b(f2, bw0.b(zv0Var, mo8.G)), j), j51.x(rv0.b(f2, bw0.b(zv0Var, mo8.H)), j), j51.x(rv0.b(mo8.F, bw0.b(zv0Var, mo8.E)), j));
                    zv0Var.g0 = fh7Var5;
                    fh7Var4 = fh7Var5;
                }
                i2 = i3 & (-458753);
                fh7Var3 = fh7Var4;
                z4 = true;
            } else {
                ux2Var.Q();
                fh7Var3 = fh7Var;
                i2 = i3 & (-458753);
                z4 = z2;
            }
            ux2Var.q();
            ux2Var.W(1768510810);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = ua5.s(ux2Var);
            }
            mw4 mw4Var = (mw4) objK;
            ux2Var.p(false);
            if (function1 != null) {
                b63 b63Var = ml3.a;
                function2 = function1;
                fs4VarI = di1.I(z, mw4Var, z4, new pe6(2), function2);
            } else {
                function2 = function1;
                fs4VarI = cs4.b;
            }
            boolean z5 = z4;
            b(androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.b.s(fs4Var.f(fs4VarI)), c, d), z, z5, fh7Var3, mw4Var, ux6.b(mo8.I, ux2Var), ux2Var, ((i2 << 3) & 112) | 24960);
            z3 = z5;
            fh7Var2 = fh7Var3;
        } else {
            ux2Var.Q();
            z3 = z2;
            fh7Var2 = fh7Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new kb(z, function2, fs4Var, z3, fh7Var2, i);
        }
    }

    public static final void b(fs4 fs4Var, boolean z, boolean z2, fh7 fh7Var, mw4 mw4Var, pw6 pw6Var, ux2 ux2Var, int i) {
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        ux2Var.Y(-670917213);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(fs4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(fh7Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var.f(mw4Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ux2Var.f(pw6Var) ? 1048576 : 524288;
        }
        if (ux2Var.N(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                j = z ? fh7Var.b : fh7Var.f;
            } else {
                j = z ? fh7Var.j : fh7Var.n;
            }
            if (z2) {
                j2 = z ? fh7Var.a : fh7Var.e;
            } else {
                j2 = z ? fh7Var.i : fh7Var.m;
            }
            pw6 pw6VarB = ux6.b(mo8.R, ux2Var);
            h72 h72Var = zd6.a;
            me6 me6Var = ((ne6) ux2Var.j(h72Var)).a;
            float f2 = mo8.Q;
            if (z2) {
                j3 = j2;
                j4 = z ? fh7Var.c : fh7Var.g;
            } else {
                j3 = j2;
                j4 = z ? fh7Var.k : fh7Var.f800o;
            }
            fs4 fs4VarS = au8.s(uf0.i(fs4Var, f2, j4, pw6VarB), j, pw6VarB);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarF = fs4VarS.f(cs4Var);
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarF);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z3 = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z3) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(do4VarC, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS2, iz0Var4, ux2Var);
            fs4 fs4VarF2 = ya0.a.a(cs4Var, xz2.r).f(new iv7(mw4Var, z, xs1.c0(du4.n, ux2Var)));
            float f3 = mo8.O / 2.0f;
            me6 me6Var2 = ((ne6) ux2Var.j(h72Var)).a;
            fs4 fs4VarS3 = au8.s(ug3.a(fs4VarF2, mw4Var, zd6.a(false, f3, 0L, null, 220)), j3, pw6Var);
            do4 do4VarC2 = ua0.c(xz2.s, false);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS4 = uf0.s(ux2Var, fs4VarS3);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(do4VarC2, iz0Var, ux2Var);
            o67.n(yj5VarL2, iz0Var2, ux2Var);
            e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS4, iz0Var4, ux2Var);
            ux2Var.W(1236071411);
            ux2Var.p(false);
            ux2Var.p(true);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ey(fs4Var, z, z2, fh7Var, mw4Var, pw6Var, i);
        }
    }
}
