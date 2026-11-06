package o;

import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wc7 extends vm1 implements r04, t52, l28, v01, o65, u01 {
    public tc7 C;
    public nc7 D;
    public final pb6 E;
    public xc7 F;
    public xc7 G;
    public l03 H;
    public y26 I;
    public final yc4 J;
    public ux4 K;
    public mw4 L;
    public y46 M;
    public long N;
    public j04 O;
    public pw6 P;
    public vs1 Q;
    public kw6[] R;
    public InnerShadowPainter[] S;
    public kw6[] T;
    public DropShadowPainter[] U;
    public n87 V;

    public wc7(ux4 ux4Var, nc7 nc7Var) {
        this.D = nc7Var;
        pb6 pb6Var = new pb6();
        pb6Var.m = 1.0f;
        j98 j98Var = j98.a;
        pb6Var.x = j98Var;
        pb6Var.y = j98Var;
        this.E = pb6Var;
        this.F = new xc7();
        this.J = new yc4();
        this.K = ux4Var == null ? new ux4(null) : ux4Var;
        this.N = 9205357640488583168L;
    }

    public static xc7 Z0(wc7 wc7Var, int i) {
        xc7 xc7Var = wc7Var.F;
        pb6 pb6Var = wc7Var.E;
        if ((pb6Var.c() & i) == 0) {
            return xc7Var;
        }
        xc7 xc7Var2 = new xc7();
        pb6Var.g(i, xc7Var2);
        return xc7Var2;
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.es4
    public final void N0() {
        l03 l03Var = this.H;
        if (l03Var != null) {
            vn4.q0(this).getGraphicsContext().a(l03Var);
            this.H = null;
        }
        this.I = null;
    }

    @Override // o.u01
    public final Object T(zw5 zw5Var) {
        return xk0.q(this, zw5Var);
    }

    public final void X0(d14 d14Var, int i, pw6 pw6Var, kw6 kw6Var) {
        kw6[] kw6VarArr = this.T;
        kw6 kw6Var2 = kw6VarArr != null ? (kw6) cx.V0(i, kw6VarArr) : null;
        DropShadowPainter[] dropShadowPainterArr = this.U;
        DropShadowPainter dropShadowPainter = dropShadowPainterArr != null ? (DropShadowPainter) cx.V0(i, dropShadowPainterArr) : null;
        if (!im3.n(kw6Var2, kw6Var) || dropShadowPainter == null) {
            cj3 cj3VarB = vn4.q0(this).getGraphicsContext().b();
            cj3VarB.getClass();
            dropShadowPainter = new DropShadowPainter(pw6Var, kw6Var, cj3VarB);
        }
        kw6[] kw6VarArr2 = this.T;
        if (kw6VarArr2 != null) {
            kw6VarArr2[i] = kw6Var;
        }
        DropShadowPainter[] dropShadowPainterArr2 = this.U;
        if (dropShadowPainterArr2 != null) {
            dropShadowPainterArr2[i] = dropShadowPainter;
        }
        dropShadowPainter.g(d14Var, d14Var.m.d(), 1.0f, null);
    }

    public final void Y0(d14 d14Var, int i, pw6 pw6Var, kw6 kw6Var) {
        kw6[] kw6VarArr = this.R;
        kw6 kw6Var2 = kw6VarArr != null ? (kw6) cx.V0(i, kw6VarArr) : null;
        InnerShadowPainter[] innerShadowPainterArr = this.S;
        InnerShadowPainter innerShadowPainter = innerShadowPainterArr != null ? (InnerShadowPainter) cx.V0(i, innerShadowPainterArr) : null;
        if (!im3.n(kw6Var2, kw6Var) || innerShadowPainter == null) {
            cj3 cj3VarB = vn4.q0(this).getGraphicsContext().b();
            cj3VarB.getClass();
            innerShadowPainter = new InnerShadowPainter(pw6Var, kw6Var, cj3VarB);
        }
        kw6[] kw6VarArr2 = this.R;
        if (kw6VarArr2 != null) {
            kw6VarArr2[i] = kw6Var;
        }
        InnerShadowPainter[] innerShadowPainterArr2 = this.S;
        if (innerShadowPainterArr2 != null) {
            innerShadowPainterArr2[i] = innerShadowPainter;
        }
        innerShadowPainter.g(d14Var, d14Var.m.d(), 1.0f, null);
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, final long j) {
        int iRound;
        int iRound2;
        int iRound3;
        int iRound4;
        xc7 xc7VarZ0 = Z0(this, 12);
        float f = xc7VarZ0.v((byte) 4) ? xc7VarZ0.g : 0.0f;
        float f2 = xc7VarZ0.v((byte) 13) ? xc7VarZ0.p : 0.0f;
        if (!Float.isNaN(f2)) {
            f += f2;
        }
        final float f3 = f;
        float f4 = xc7VarZ0.v((byte) 5) ? xc7VarZ0.h : 0.0f;
        float f5 = xc7VarZ0.v((byte) 15) ? xc7VarZ0.r : 0.0f;
        if (!Float.isNaN(f5)) {
            f4 += f5;
        }
        float f6 = xc7VarZ0.v((byte) 6) ? xc7VarZ0.i : 0.0f;
        float f7 = xc7VarZ0.v((byte) 14) ? xc7VarZ0.q : 0.0f;
        if (!Float.isNaN(f7)) {
            f6 += f7;
        }
        float f8 = xc7VarZ0.v((byte) 7) ? xc7VarZ0.j : 0.0f;
        float f9 = xc7VarZ0.v((byte) 16) ? xc7VarZ0.s : 0.0f;
        if (!Float.isNaN(f9)) {
            f8 += f9;
        }
        int iRound5 = Math.round(f3 + f4);
        int iRound6 = Math.round(f6 + f8);
        int iK = r61.k(j) - iRound5;
        if (iK < 0) {
            iK = 0;
        }
        int i = r61.i(j);
        if (i != Integer.MAX_VALUE && (i = i + iRound5) < 0) {
            i = 0;
        }
        int iJ = r61.j(j) - iRound6;
        int i2 = iJ < 0 ? 0 : iJ;
        int iH = r61.h(j);
        if (iH != Integer.MAX_VALUE && (iH = iH + iRound6) < 0) {
            iH = 0;
        }
        if (xc7VarZ0.v((byte) 19)) {
            iRound = Math.round(xc7VarZ0.w);
            if (iRound < 0) {
                iRound = 0;
            }
        } else {
            iRound = Integer.MAX_VALUE;
        }
        if (xc7VarZ0.v((byte) 17)) {
            iRound2 = Math.round(xc7VarZ0.v);
            if (iRound2 < 0) {
                iRound2 = 0;
            }
            if (iRound2 > iRound) {
                iRound2 = iRound;
            }
        } else {
            iRound2 = 0;
        }
        if (xc7VarZ0.v((byte) 9)) {
            int iRound7 = Math.round(xc7VarZ0.l);
            if (iRound7 >= iRound2) {
                iRound2 = iRound7;
            }
            if (iRound2 <= iRound) {
                iRound = iRound2;
            }
            iRound2 = iRound;
        }
        if (iRound2 != 0) {
            if (iRound2 >= iK) {
                iK = iRound2;
            }
            if (iK > i) {
                iK = i;
            }
        }
        if (iRound != Integer.MAX_VALUE) {
            if (iRound < iK) {
                iRound = iK;
            }
            if (iRound <= i) {
                i = iRound;
            }
        }
        if (!xc7VarZ0.v((byte) 9)) {
            if (xc7VarZ0.v((byte) 11) && r61.e(j)) {
                int iRound8 = Math.round(i * xc7VarZ0.n);
                if (iRound8 >= iK) {
                    iK = iRound8;
                }
                if (iK > i) {
                    iK = i;
                }
                i = iK;
            } else if (xc7VarZ0.v((byte) 13) && xc7VarZ0.v((byte) 15)) {
                iK = i;
            }
        }
        if (xc7VarZ0.v((byte) 20)) {
            iRound3 = Math.round(xc7VarZ0.u);
            if (iRound3 < 0) {
                iRound3 = 0;
            }
        } else {
            iRound3 = Integer.MAX_VALUE;
        }
        if (xc7VarZ0.v((byte) 18)) {
            iRound4 = Math.round(xc7VarZ0.t);
            if (iRound4 < 0) {
                iRound4 = 0;
            }
            if (iRound4 > iRound3) {
                iRound4 = iRound3;
            }
        } else {
            iRound4 = 0;
        }
        if (xc7VarZ0.v((byte) 10)) {
            int iRound9 = Math.round(xc7VarZ0.m);
            if (iRound9 >= iRound4) {
                iRound4 = iRound9;
            }
            if (iRound4 <= iRound3) {
                iRound3 = iRound4;
            }
            iRound4 = iRound3;
        }
        if (iRound4 != 0) {
            if (iRound4 >= i2) {
                i2 = iRound4;
            }
            if (i2 > iH) {
                i2 = iH;
            }
        }
        if (iRound3 != Integer.MAX_VALUE) {
            if (iRound3 < i2) {
                iRound3 = i2;
            }
            if (iRound3 <= iH) {
                iH = iRound3;
            }
        }
        if (!xc7VarZ0.v((byte) 10)) {
            if (xc7VarZ0.v((byte) 12) && r61.d(j)) {
                int iRound10 = Math.round(iH * xc7VarZ0.f2506o);
                if (iRound10 >= i2) {
                    i2 = iRound10;
                }
                if (i2 > iH) {
                    i2 = iH;
                }
                iH = i2;
            } else if (xc7VarZ0.v((byte) 14) && xc7VarZ0.v((byte) 16)) {
                i2 = iH;
            }
        }
        final jl5 jl5VarC = zn4Var.C(t61.a(iK, i, i2, iH));
        final float f10 = f4;
        final float f11 = f6;
        final float f12 = f8;
        return fo4Var.u(jl5VarC.m + iRound5, jl5VarC.n + iRound6, fa2.m, new Function1() { // from class: o.vc7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                il5 il5Var = (il5) obj;
                wc7 wc7Var = this.m;
                xc7 xc7VarZ1 = wc7.Z0(wc7Var, 12);
                boolean zV = xc7VarZ1.v((byte) 13);
                long j2 = j;
                jl5 jl5Var = jl5VarC;
                int iRound11 = (zV || !xc7VarZ1.v((byte) 15)) ? Math.round(f3) : (r61.i(j2) - jl5Var.m) - Math.round(f10);
                int iRound12 = (!xc7VarZ1.v((byte) 16) || xc7VarZ1.v((byte) 14)) ? Math.round(f11) : (r61.h(j2) - jl5Var.n) - Math.round(f12);
                if ((xc7VarZ1.r() & 4) != 0) {
                    y46 y46Var = wc7Var.M;
                    if (y46Var == null) {
                        y46Var = new y46(wc7Var, (byte) 25);
                        wc7Var.M = y46Var;
                    }
                    il5.m(il5Var, jl5Var, iRound11, iRound12, y46Var);
                } else {
                    il5Var.g(jl5Var, iRound11, iRound12, 0.0f);
                }
                return f88.a;
            }
        });
    }

    public final void a1(boolean z) {
        xc7 xc7Var;
        int iR;
        xc7 xc7Var2;
        if (this.z) {
            hc1 hc1Var = null;
            xc7 xc7Var3 = z ? null : this.F;
            if (z) {
                xc7Var = this.F;
            } else {
                xc7Var = this.G;
                if (xc7Var == null) {
                    xc7Var = new xc7();
                    this.G = xc7Var;
                }
            }
            xc7 xc7Var4 = xc7Var;
            in1 in1Var = vn4.p0(this).L;
            i76 i76Var = new i76();
            pb6 pb6Var = this.E;
            a65 a65Var = pb6Var.z;
            xc7 xc7Var5 = pb6Var.f1723o;
            if (a65Var == null || xc7Var5 == null) {
                pb6Var.q = null;
            } else {
                long jF0 = a65Var.F0();
                if (jF0 != 0) {
                    long j = jF0 & 2251799813685247L;
                    int i = (int) (jF0 >> 50);
                    xc7 xc7Var6 = new xc7();
                    a65 a65Var2 = pb6Var.z;
                    if (a65Var2 != null && ((xc7Var2 = pb6Var.r) != null || (xc7Var2 = pb6Var.p) != null)) {
                        xc7 xc7Var7 = xc7Var2;
                        xc7 xc7Var8 = pb6Var.f1723o;
                        if (xc7Var8 != null) {
                            yc7.a(xc7Var7, xc7Var8, a65Var2, j, i, xc7Var6);
                        }
                    }
                    pb6Var.q = xc7Var6;
                } else {
                    pb6Var.q = null;
                }
            }
            bt1.J(this, new bk(this, in1Var, xc7Var4, xc7Var3, i76Var, (byte) 6));
            int i2 = i76Var.m;
            if (xc7Var3 != null) {
                long j2 = yc7.b | yc7.c | yc7.d;
                long j3 = yc7.e;
                long j4 = j2 | j3 | yc7.f | yc7.g;
                int i3 = yc7.h | yc7.i | yc7.j;
                int i4 = yc7.k;
                int i5 = i3 | i4 | yc7.l | yc7.m;
                long jI = xc7Var3.i(xc7Var4, j4);
                int iH = xc7Var3.h(i5, xc7Var4);
                iR = yc7.g(jI) | yc7.e(iH);
                if ((iH & 8) != 0 && ((xc7Var3.a & j3) != 0 || (xc7Var3.b & i4) != 0 || (j3 & xc7Var4.a) != 0 || (xc7Var4.b & i4) != 0)) {
                    iR |= 4;
                }
            } else {
                iR = xc7Var4.r();
            }
            int i6 = i2 | iR;
            byte b = 25;
            if (!im3.n(this.K.a, this.L)) {
                n87 n87Var = this.V;
                if (n87Var != null) {
                    n87Var.j(null);
                }
                mw4 mw4Var = this.K.a;
                this.L = mw4Var;
                if (mw4Var != null) {
                    this.V = im3.R(I0(), null, null, new vt4(this, mw4Var, hc1Var, b), 3);
                }
            }
            if (z) {
                return;
            }
            if ((i6 & 1) != 0) {
                tc7 tc7Var = this.C;
                if (tc7Var == null) {
                    hk0.l("StyleOuterNode with no corresponding StyleInnerNode");
                    return;
                }
                vn4.p0(tc7Var).S();
            }
            if ((i6 & 8) != 0) {
                vn4.p0(this).S();
            }
            if ((i6 & 2) != 0) {
                yo1.H(this);
                tc7 tc7Var2 = this.C;
                if (tc7Var2 == null) {
                    hk0.l("StyleOuterNode with no corresponding StyleInnerNode");
                    return;
                }
                vn4.n0(tc7Var2, 2).i1();
            }
            if ((i6 & 4) != 0) {
                y46 y46Var = this.M;
                if (y46Var == null) {
                    y46Var = new y46(this, b);
                    this.M = y46Var;
                }
                nv1.N(this, y46Var);
            }
            if ((i6 & 16) != 0 && this.m.z) {
                vn4.p0(this).R();
            }
            if ((i6 & 32) == 0 || !this.m.z) {
                return;
            }
            vn4.p0(this).O(true);
        }
    }

    @Override // o.t52
    public final void j(d14 d14Var) {
        sb0 sb0Var;
        sb0 sb0Var2;
        sb0 sb0Var3;
        Object obj;
        sb0 sb0Var4;
        xc7 xc7Var;
        nl0 nl0Var;
        float f;
        long j;
        DropShadowPainter[] dropShadowPainterArr;
        vs1 vs1VarA;
        float f2;
        Object obj2;
        InnerShadowPainter[] innerShadowPainterArr;
        yc4 yc4Var;
        Function1 m5Var;
        Function1 w80Var;
        nl0 nl0Var2 = d14Var.m;
        pr0 pr0Var = kh.V;
        xc7 xc7VarZ0 = Z0(this, 2);
        long j2 = rv0.h;
        long j3 = xc7VarZ0.v((byte) 34) ? xc7VarZ0.z : j2;
        if (xc7VarZ0.w(51)) {
            sb0Var = xc7VarZ0.A;
            sb0Var.getClass();
        } else {
            sb0Var = null;
        }
        if (xc7VarZ0.v((byte) 36)) {
            j2 = xc7VarZ0.B;
        }
        if (xc7VarZ0.w(52)) {
            sb0Var2 = xc7VarZ0.C;
            sb0Var2.getClass();
        } else {
            sb0Var2 = null;
        }
        long j4 = rv0.b;
        if (xc7VarZ0.v((byte) 35)) {
            j4 = xc7VarZ0.x;
        }
        if (xc7VarZ0.w(50)) {
            sb0Var3 = xc7VarZ0.y;
            sb0Var3.getClass();
        } else {
            sb0Var3 = null;
        }
        float f3 = xc7VarZ0.v((byte) 8) ? xc7VarZ0.k : 0.0f;
        float f4 = f3 / 2.0f;
        pw6 pw6Var = xc7VarZ0.E;
        boolean z = f4 > 0.0f;
        boolean z2 = (j3 == 16 && sb0Var == null) ? false : true;
        boolean z3 = (j2 == 16 && sb0Var2 == null) ? false : true;
        if (xc7VarZ0.w(55) && (obj = xc7VarZ0.F) != null) {
            sb0Var4 = sb0Var3;
            pw6 pw6Var2 = xc7VarZ0.w(53) ? xc7VarZ0.E : pr0Var;
            xc7Var = xc7VarZ0;
            kw6[] kw6VarArr = this.T;
            nl0Var = nl0Var2;
            DropShadowPainter[] dropShadowPainterArr2 = this.U;
            f = f3;
            boolean z4 = obj instanceof Object[];
            int length = z4 ? ((Object[]) obj).length : 1;
            j = j4;
            if (kw6VarArr == null || !im3.n(this.P, pw6Var2)) {
                kw6[] kw6VarArr2 = new kw6[length];
                for (int i = 0; i < length; i++) {
                    kw6VarArr2[i] = null;
                }
                this.T = kw6VarArr2;
                DropShadowPainter[] dropShadowPainterArr3 = new DropShadowPainter[length];
                for (int i2 = 0; i2 < length; i2++) {
                    dropShadowPainterArr3[i2] = null;
                }
                this.U = dropShadowPainterArr3;
            } else if (kw6VarArr.length != length) {
                this.T = (kw6[]) Arrays.copyOf(kw6VarArr, length);
                if (dropShadowPainterArr2 != null) {
                    dropShadowPainterArr = (DropShadowPainter[]) Arrays.copyOf(dropShadowPainterArr2, length);
                } else {
                    dropShadowPainterArr = new DropShadowPainter[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        dropShadowPainterArr[i3] = null;
                    }
                }
                this.U = dropShadowPainterArr;
            }
            if (z4) {
                Object[] objArr = (Object[]) obj;
                int length2 = objArr.length;
                for (int i4 = 0; i4 < length2; i4++) {
                    Object obj3 = objArr[i4];
                    if (obj3 instanceof kw6) {
                        X0(d14Var, i4, pw6Var2, (kw6) obj3);
                    }
                }
            } else if (obj instanceof kw6) {
                X0(d14Var, 0, pw6Var2, (kw6) obj);
            }
        } else {
            nl0Var = nl0Var2;
            xc7Var = xc7VarZ0;
            j = j4;
            sb0Var4 = sb0Var3;
            f = f3;
        }
        long jD = nl0Var.d();
        if (y07.a(this.N, jD) && this.O == d14Var.getLayoutDirection() && im3.n(this.P, pw6Var)) {
            vs1VarA = this.Q;
            vs1VarA.getClass();
        } else {
            vs1VarA = pw6Var.a(jD, d14Var.getLayoutDirection(), d14Var);
        }
        this.Q = vs1VarA;
        this.N = jD;
        this.O = d14Var.getLayoutDirection();
        if (!z2) {
            f2 = 0.0f;
        } else if (sb0Var != null) {
            f2 = 0.0f;
            xs1.D(d14Var, vs1VarA, sb0Var, 0.0f, 60);
        } else {
            f2 = 0.0f;
            xs1.E(d14Var, vs1VarA, j3);
        }
        d14Var.a();
        if (z3) {
            if (sb0Var2 != null) {
                xs1.D(d14Var, vs1VarA, sb0Var2, f2, 60);
            } else {
                xs1.E(d14Var, vs1VarA, j2);
            }
        }
        if (z) {
            sb0 t57Var = sb0Var4 == null ? new t57(j) : sb0Var4;
            uc7 uc7Var = new uc7(f);
            y26 y26Var = this.I;
            if (y26Var == null) {
                y26Var = new y26(this, (byte) 20);
                this.I = y26Var;
            }
            final y26 y26Var2 = y26Var;
            final yc4 yc4Var2 = this.J;
            yc4Var2.n = uc7Var;
            if (t57Var.equals((sb0) yc4Var2.f2598o) && im3.n(vs1VarA, (vs1) yc4Var2.p) && ((Function1) yc4Var2.q) != null) {
                yc4Var = yc4Var2;
            } else {
                yc4Var2.f2598o = t57Var;
                yc4Var2.p = vs1VarA;
                if (vs1VarA instanceof nb5) {
                    final nb5 nb5Var = (nb5) vs1VarA;
                    rj rjVar = nb5Var.e;
                    final v56 v56VarD = rjVar.d();
                    float f5 = v56VarD.b;
                    float f6 = v56VarD.d;
                    float f7 = v56VarD.a;
                    float f8 = v56VarD.c;
                    final float fMin = Math.min(Math.abs(f8 - f7), Math.abs(f6 - f5));
                    rj rjVarA = (rj) yc4Var2.m;
                    if (rjVarA == null) {
                        rjVarA = tj.a();
                        yc4Var2.m = rjVarA;
                    }
                    rjVarA.g();
                    rj.b(rjVarA, v56VarD);
                    rjVarA.f(rjVarA, rjVar, 0);
                    final long jCeil = (((long) ((int) Math.ceil(f8 - f7))) << 32) | (((long) ((int) Math.ceil(f6 - f5))) & 4294967295L);
                    final rj rjVar2 = rjVarA;
                    final sb0 sb0Var5 = t57Var;
                    m5Var = new Function1() { // from class: o.x80
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            long j5 = jCeil;
                            rj rjVar3 = rjVar2;
                            u52 u52Var = (u52) obj4;
                            uc7 uc7Var2 = (uc7) yc4Var2.n;
                            uc7Var2.getClass();
                            float fFloatValue = Float.valueOf(uc7Var2.m).floatValue();
                            float f9 = fFloatValue < 0.0f ? 0.0f : fFloatValue;
                            float f10 = 2.0f * f9;
                            float f11 = fMin;
                            nb5 nb5Var2 = nb5Var;
                            sb0 sb0Var6 = sb0Var5;
                            if (f10 > f11) {
                                u52.H0(u52Var, nb5Var2.e, sb0Var6, 0.0f, null, null, 60);
                            } else {
                                l03 l03Var = (l03) y26Var2.a();
                                n03 n03Var = l03Var.a;
                                if (n03Var.j() != 1) {
                                    n03Var.E(1);
                                }
                                v56 v56Var = v56VarD;
                                float f12 = v56Var.a;
                                float f13 = v56Var.b;
                                ((xc0) u52Var.h0().f1103o).V(f12, f13);
                                try {
                                    u52Var.g0(j5, new y80(v56Var, nb5Var2, sb0Var6, f9, rjVar3), l03Var);
                                    qs1.J(u52Var, l03Var);
                                } finally {
                                    ((xc0) u52Var.h0().f1103o).V(-f12, -f13);
                                }
                            }
                            return f88.a;
                        }
                    };
                    yc4Var = yc4Var2;
                } else {
                    yc4Var = yc4Var2;
                    if (vs1VarA instanceof pb5) {
                        lf6 lf6Var = ((pb5) vs1VarA).e;
                        if (xo1.T(lf6Var)) {
                            w80Var = new m5((Object) yc4Var, (Object) lf6Var, (Object) t57Var, (byte) 6);
                        } else {
                            rj rjVarA2 = (rj) yc4Var.m;
                            if (rjVarA2 == null) {
                                rjVarA2 = tj.a();
                                yc4Var.m = rjVarA2;
                            }
                            rj rjVar3 = rjVarA2;
                            h76 h76Var = new h76();
                            h76Var.m = Float.NaN;
                            w80Var = new w80(yc4Var, lf6Var, h76Var, new k76(), rjVar3, t57Var, (byte) 0);
                        }
                        m5Var = w80Var;
                    } else {
                        if (!(vs1VarA instanceof ob5)) {
                            gk0.s();
                            return;
                        }
                        m5Var = new m5((Object) yc4Var, (Object) ((ob5) vs1VarA).e, (Object) t57Var, (byte) 7);
                    }
                }
                yc4Var.q = m5Var;
            }
            if (t65.b(0L, 0L)) {
                Function1 function1 = (Function1) yc4Var.q;
                function1.getClass();
                function1.invoke(d14Var);
            } else {
                float fIntBitsToFloat = Float.intBitsToFloat(0);
                float fIntBitsToFloat2 = Float.intBitsToFloat(0);
                nl0 nl0Var3 = nl0Var;
                ((xc0) nl0Var3.n.f1103o).V(fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    Function1 function2 = (Function1) yc4Var.q;
                    function2.getClass();
                    function2.invoke(d14Var);
                    ((xc0) nl0Var3.n.f1103o).V(-fIntBitsToFloat, -fIntBitsToFloat2);
                } catch (Throwable th) {
                    ((xc0) nl0Var3.n.f1103o).V(-fIntBitsToFloat, -fIntBitsToFloat2);
                    throw th;
                }
            }
        }
        xc7 xc7Var2 = xc7Var;
        if (xc7Var2.w(56) && (obj2 = xc7Var2.G) != null) {
            pw6 pw6Var3 = xc7Var2.w(53) ? xc7Var2.E : pr0Var;
            kw6[] kw6VarArr3 = this.R;
            InnerShadowPainter[] innerShadowPainterArr2 = this.S;
            boolean z5 = obj2 instanceof Object[];
            int length3 = z5 ? ((Object[]) obj2).length : 1;
            if (kw6VarArr3 == null || !im3.n(this.P, pw6Var3)) {
                kw6[] kw6VarArr4 = new kw6[length3];
                for (int i5 = 0; i5 < length3; i5++) {
                    kw6VarArr4[i5] = null;
                }
                this.R = kw6VarArr4;
                InnerShadowPainter[] innerShadowPainterArr3 = new InnerShadowPainter[length3];
                for (int i6 = 0; i6 < length3; i6++) {
                    innerShadowPainterArr3[i6] = null;
                }
                this.S = innerShadowPainterArr3;
            } else if (kw6VarArr3.length != length3) {
                this.R = (kw6[]) Arrays.copyOf(kw6VarArr3, length3);
                if (innerShadowPainterArr2 != null) {
                    innerShadowPainterArr = (InnerShadowPainter[]) Arrays.copyOf(innerShadowPainterArr2, length3);
                } else {
                    innerShadowPainterArr = new InnerShadowPainter[length3];
                    for (int i7 = 0; i7 < length3; i7++) {
                        innerShadowPainterArr[i7] = null;
                    }
                }
                this.S = innerShadowPainterArr;
            }
            if (z5) {
                Object[] objArr2 = (Object[]) obj2;
                int length4 = objArr2.length;
                for (int i8 = 0; i8 < length4; i8++) {
                    Object obj4 = objArr2[i8];
                    if (obj4 instanceof kw6) {
                        Y0(d14Var, i8, pw6Var3, (kw6) obj4);
                    }
                }
            } else if (obj2 instanceof kw6) {
                Y0(d14Var, 0, pw6Var3, (kw6) obj2);
            }
        }
        this.P = pw6Var;
    }

    @Override // o.l28
    public final Object k() {
        return "StyleOuterNode";
    }

    @Override // o.o65
    public final void n0() {
        a1(false);
    }
}
