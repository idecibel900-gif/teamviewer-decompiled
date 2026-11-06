package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class yd {
    public static final pd5 a;
    public static final h72 b;

    static {
        ka0.j(0.0f, 0.0f, 0.0f, 16.0f, 7);
        a = ka0.j(0.0f, 0.0f, 0.0f, 16.0f, 7);
        b = new h72(new e5((byte) 7), (byte) 0);
    }

    public static final void a(final yy0 yy0Var, fs4 fs4Var, final hw2 hw2Var, final hw2 hw2Var2, final pw6 pw6Var, final long j, final long j2, final long j3, final long j4, final long j5, ux2 ux2Var, final int i) {
        final fs4 fs4Var2;
        ux2Var.Y(1378716401);
        int i2 = i | 48 | (ux2Var.h(null) ? 256 : 128) | (ux2Var.h(hw2Var) ? 2048 : 1024) | (ux2Var.h(hw2Var2) ? 16384 : 8192) | (ux2Var.f(pw6Var) ? 131072 : 65536) | (ux2Var.e(j) ? 1048576 : 524288) | (ux2Var.c(0.0f) ? 8388608 : 4194304) | (ux2Var.e(j2) ? 67108864 : 33554432) | (ux2Var.e(j3) ? 536870912 : 268435456);
        if (ux2Var.N(i2 & 1, ((306783379 & i2) == 306783378 && (((ux2Var.e(j5) ? ' ' : (char) 16) | (ux2Var.e(j4) ? (char) 4 : (char) 2)) & 19) == 18) ? false : true)) {
            yy0 yy0VarO = au8.O(-652798794, new hw2(hw2Var2, j3, j4, j5, j2, yy0Var) { // from class: o.vd
                public final /* synthetic */ hw2 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ long f2302o;
                public final /* synthetic */ long p;
                public final /* synthetic */ long q;
                public final /* synthetic */ yy0 r;

                {
                    this.f2302o = j4;
                    this.p = j5;
                    this.q = j2;
                    this.r = yy0Var;
                }

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ot7 ot7VarA;
                    ux2 ux2Var2 = (ux2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    byte b2 = 1;
                    byte b3 = 0;
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        bg5 bg5Var = qp5.a;
                        float f = ((Boolean) bg5Var.getValue()).booleanValue() ? 20.0f : 24.0f;
                        fs4 fs4VarA = ka0.A(cs4.b, new pd5(f, f, f, f));
                        kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
                        int iHashCode = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL = ux2Var2.l();
                        fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA);
                        yz0.c.getClass();
                        ux2Var2.a0();
                        boolean z = ux2Var2.S;
                        tg3 tg3Var = LayoutNode.e0;
                        if (z) {
                            ux2Var2.k(tg3Var);
                        } else {
                            ux2Var2.j0();
                        }
                        iz0 iz0Var = d82.v;
                        o67.n(kw0VarA, iz0Var, ux2Var2);
                        iz0 iz0Var2 = d82.u;
                        o67.n(yj5VarL, iz0Var2, ux2Var2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        iz0 iz0Var3 = d82.w;
                        o67.n(numValueOf, iz0Var3, ux2Var2);
                        o67.l(ux2Var2);
                        iz0 iz0Var4 = d82.t;
                        o67.n(fs4VarS, iz0Var4, ux2Var2);
                        ux2Var2.W(346092326);
                        ux2Var2.p(false);
                        hw2 hw2Var3 = this.m;
                        if (hw2Var3 == null) {
                            ux2Var2.W(346408309);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(346408310);
                            if (((Boolean) bg5Var.getValue()).booleanValue()) {
                                ux2Var2.W(1812109189);
                                ot7VarA = ot7.a(((rn4) ux2Var2.j(un4.a)).b.f, 0L, h67.k(20), null, null, 0L, h67.k(26), null, 16646141);
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(1812321322);
                                ot7VarA = k68.a(au8.p, ux2Var2);
                                ux2Var2.p(false);
                            }
                            lv1.x(this.f2302o, ot7VarA, au8.O(71284337, new xd(hw2Var3, b3), ux2Var2), ux2Var2, 384);
                            ux2Var2.p(false);
                        }
                        hw2 hw2Var4 = this.n;
                        if (hw2Var4 == null) {
                            ux2Var2.W(347551589);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(347551590);
                            lv1.x(this.p, k68.a(au8.r, ux2Var2), au8.O(705583346, new xd(hw2Var4, b2), ux2Var2), ux2Var2, 384);
                            ux2Var2.p(false);
                        }
                        z53 z53Var = new z53(xz2.C);
                        do4 do4VarC = ua0.c(xz2.f2564o, false);
                        int iHashCode2 = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL2 = ux2Var2.l();
                        fs4 fs4VarS2 = uf0.s(ux2Var2, z53Var);
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
                        lv1.x(this.q, k68.a(au8.l, ux2Var2), this.r, ux2Var2, 0);
                        ux2Var2.p(true);
                        ux2Var2.p(true);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & 112) | 12582918 | ((i2 >> 9) & 57344);
            cs4 cs4Var = cs4.b;
            ig7.a(cs4Var, pw6Var, j, 0L, 0.0f, 0.0f, yy0VarO, ux2Var, i4, 104);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(fs4Var2, hw2Var, hw2Var2, pw6Var, j, j2, j3, j4, j5, i) { // from class: o.wd
                public final /* synthetic */ fs4 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ hw2 f2398o;
                public final /* synthetic */ hw2 p;
                public final /* synthetic */ pw6 q;
                public final /* synthetic */ long r;
                public final /* synthetic */ long s;
                public final /* synthetic */ long t;
                public final /* synthetic */ long u;
                public final /* synthetic */ long v;

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(7);
                    yd.a(this.m, this.n, this.f2398o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void b(final float f, final yy0 yy0Var, ux2 ux2Var, int i) {
        j04 j04Var;
        ux2Var.Y(-917637668);
        int i2 = (ux2Var.c(f) ? 32 : 16) | i;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            h72 h72Var = b11.n;
            final j04 j04Var2 = (j04) ux2Var.j(h72Var);
            int iOrdinal = j04Var2.ordinal();
            if (iOrdinal == 0) {
                j04Var = j04.n;
            } else {
                if (iOrdinal != 1) {
                    gk0.s();
                    return;
                }
                j04Var = j04.m;
            }
            j51.l(h72Var.a(j04Var), au8.O(-1986402020, new hw2() { // from class: o.qd
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ux2 ux2Var2 = (ux2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    byte b2 = 0;
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        lq1.c(null, new ew(8.0f, new hk0((byte) 2)), new ew(f, new hk0((byte) 2)), null, 0, 0, au8.O(879927511, new sd(j04Var2, yy0Var, b2), ux2Var2), ux2Var2, 1572864);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, 56);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new rd(f, yy0Var, i);
        }
    }

    public static final void c(final Function0 function0, final yy0 yy0Var, final fs4 fs4Var, final hw2 hw2Var, final hw2 hw2Var2, final hw2 hw2Var3, final pw6 pw6Var, final long j, final long j2, final long j3, final long j4, final a12 a12Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        yy0 yy0Var2;
        hw2 hw2Var4;
        int i4;
        ux2Var.Y(-867616355);
        if ((i & 6) == 0) {
            i3 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            yy0Var2 = yy0Var;
            i3 |= ux2Var.h(yy0Var2) ? 32 : 16;
        } else {
            yy0Var2 = yy0Var;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            hw2Var4 = hw2Var;
            i3 |= ux2Var.h(hw2Var4) ? 2048 : 1024;
        } else {
            hw2Var4 = hw2Var;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ux2Var.h(hw2Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ux2Var.h(hw2Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ux2Var.f(pw6Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ux2Var.e(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ux2Var.e(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ux2Var.e(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.e(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ux2Var.c(0.0f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ux2Var.f(a12Var) ? 2048 : 1024;
        }
        int i5 = i4;
        if (ux2Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            final yy0 yy0Var3 = yy0Var2;
            final hw2 hw2Var5 = hw2Var4;
            d(function0, fs4Var, a12Var, au8.O(527420759, new hw2() { // from class: o.pd
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ux2 ux2Var2 = (ux2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    byte b2 = 0;
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        yd.a(au8.O(1367541877, new ud(yy0Var3, hw2Var5, b2), ux2Var2), null, hw2Var2, hw2Var3, pw6Var, j, bw0.c(au8.k, ux2Var2), j2, j3, j4, ux2Var2, 6);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.td
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    yd.c(function0, yy0Var, fs4Var, hw2Var, hw2Var2, hw2Var3, pw6Var, j, j2, j3, j4, a12Var, (ux2) obj, iY, iY2);
                    return f88.a;
                }
            };
        }
    }

    public static final void d(Function0 function0, fs4 fs4Var, a12 a12Var, yy0 yy0Var, ux2 ux2Var, int i) {
        int i2;
        yy0 yy0Var2;
        a12 a12Var2;
        fs4 fs4Var2;
        Function0 function1;
        ux2Var.Y(24925658);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(a12Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            nj1 nj1Var = (nj1) ux2Var.j(b);
            yy0Var2 = yy0Var;
            j93 j93Var = new j93(function0, fs4Var, a12Var, yy0Var2, (byte) 5);
            function1 = function0;
            fs4Var2 = fs4Var;
            a12Var2 = a12Var;
            nj1Var.a(j93Var, ux2Var, 0);
        } else {
            yy0Var2 = yy0Var;
            a12Var2 = a12Var;
            fs4Var2 = fs4Var;
            function1 = function0;
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new p5(function1, fs4Var2, a12Var2, yy0Var2, i);
        }
    }
}
