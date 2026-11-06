package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class kr0 {
    public static final zq0 a;
    public static final float b;

    static {
        float f = ne7.a;
        a = new zq0(ne7.a);
        b = 1000.0f;
    }

    public static final void a(final yy0 yy0Var, final ot7 ot7Var, final long j, final long j2, final long j3, final float f, final dw dwVar, final nd5 nd5Var, final e87 e87Var, final e87 e87Var2, final e87 e87Var3, final e87 e87Var4, ux2 ux2Var, final int i) {
        ux2Var.Y(-1255048750);
        int i2 = i | (ux2Var.h(yy0Var) ? 4 : 2) | (ux2Var.f(ot7Var) ? 32 : 16) | (ux2Var.e(j) ? 256 : 128) | (ux2Var.h(null) ? 2048 : 1024) | (ux2Var.h(null) ? 16384 : 8192) | (ux2Var.h(null) ? 131072 : 65536) | (ux2Var.e(j2) ? 1048576 : 524288) | (ux2Var.e(j3) ? 8388608 : 4194304) | (ux2Var.c(f) ? 67108864 : 33554432) | (ux2Var.f(dwVar) ? 536870912 : 268435456);
        if (ux2Var.N(i2 & 1, ((i2 & 306783379) == 306783378 && ((((((ux2Var.f(nd5Var) ? (char) 4 : (char) 2) | (ux2Var.h(e87Var) ? ' ' : (char) 16)) | (ux2Var.h(e87Var2) ? 256 : 128)) | (ux2Var.h(e87Var3) ? 2048 : 1024)) | (ux2Var.h(e87Var4) ? (char) 16384 : (char) 8192)) & 9363) == 9362) ? false : true)) {
            j51.m(new dx5[]{wa1.a.a(new rv0(j)), qs7.a.a(ot7Var)}, au8.O(-881676654, new hw2() { // from class: o.ir0
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ux2 ux2Var2 = (ux2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        float f2 = kr0.b;
                        cs4 cs4Var = cs4.b;
                        fs4 fs4VarA = ka0.A(androidx.compose.foundation.layout.b.b(androidx.compose.foundation.layout.b.q(cs4Var, f2, 1), 0.0f, f, 1), nd5Var);
                        x50 x50Var = xz2.y;
                        dg6 dg6VarA = cg6.a(dwVar, x50Var, ux2Var2, 48);
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
                        o67.n(dg6VarA, iz0Var, ux2Var2);
                        iz0 iz0Var2 = d82.u;
                        o67.n(yj5VarL, iz0Var2, ux2Var2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        iz0 iz0Var3 = d82.w;
                        o67.n(numValueOf, iz0Var3, ux2Var2);
                        o67.l(ux2Var2);
                        iz0 iz0Var4 = d82.t;
                        o67.n(fs4VarS, iz0Var4, ux2Var2);
                        y50 y50Var = xz2.f2564o;
                        do4 do4VarC = ua0.c(y50Var, false);
                        int iHashCode2 = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL2 = ux2Var2.l();
                        fs4 fs4VarS2 = uf0.s(ux2Var2, cs4Var);
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
                        w50 w50Var = xz2.A;
                        e87 e87Var5 = e87Var3;
                        bc2 bc2VarB = wb2.b(e87Var5, w50Var, 12);
                        e87 e87Var6 = e87Var;
                        bc2 bc2VarA = bc2VarB.a(wb2.e(e87Var6, 2));
                        e87 e87Var7 = e87Var4;
                        hf2 hf2VarH = wb2.h(e87Var7, w50Var, 12);
                        e87 e87Var8 = e87Var2;
                        vn4.I(false, null, bc2VarA, hf2VarH.a(wb2.f(e87Var8, 2)), null, au8.O(-181659180, new p20(j2, (byte) 1), ux2Var2), ux2Var2, 1572870);
                        ux2Var2.W(-37113233);
                        b77.a(ux2Var2, androidx.compose.foundation.layout.b.p(cs4Var, 0.0f));
                        ux2Var2.p(false);
                        ux2Var2.p(true);
                        if (1.0f <= 0.0d) {
                            ii3.a("invalid weight; must be greater than zero");
                        }
                        s14 s14Var = new s14(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                        dg6 dg6VarA2 = cg6.a(iq8.a, x50Var, ux2Var2, 54);
                        int iHashCode3 = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL3 = ux2Var2.l();
                        fs4 fs4VarS3 = uf0.s(ux2Var2, s14Var);
                        ux2Var2.a0();
                        if (ux2Var2.S) {
                            ux2Var2.k(tg3Var);
                        } else {
                            ux2Var2.j0();
                        }
                        o67.n(dg6VarA2, iz0Var, ux2Var2);
                        o67.n(yj5VarL3, iz0Var2, ux2Var2);
                        e41.r(iHashCode3, ux2Var2, iz0Var3, ux2Var2);
                        o67.n(fs4VarS3, iz0Var4, ux2Var2);
                        yy0Var.invoke(ux2Var2, 0);
                        ux2Var2.p(true);
                        do4 do4VarC2 = ua0.c(y50Var, false);
                        int iHashCode4 = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL4 = ux2Var2.l();
                        fs4 fs4VarS4 = uf0.s(ux2Var2, cs4Var);
                        ux2Var2.a0();
                        if (ux2Var2.S) {
                            ux2Var2.k(tg3Var);
                        } else {
                            ux2Var2.j0();
                        }
                        o67.n(do4VarC2, iz0Var, ux2Var2);
                        o67.n(yj5VarL4, iz0Var2, ux2Var2);
                        e41.r(iHashCode4, ux2Var2, iz0Var3, ux2Var2);
                        o67.n(fs4VarS4, iz0Var4, ux2Var2);
                        w50 w50Var2 = xz2.C;
                        vn4.I(false, null, wb2.b(e87Var5, w50Var2, 12).a(wb2.e(e87Var6, 2)), wb2.h(e87Var7, w50Var2, 12).a(wb2.f(e87Var8, 2)), null, au8.O(-1090690805, new p20(j3, (byte) 2), ux2Var2), ux2Var2, 1572870);
                        ux2Var2.W(-1514776840);
                        b77.a(ux2Var2, androidx.compose.foundation.layout.b.p(cs4Var, 0.0f));
                        ux2Var2.p(false);
                        ux2Var2.p(true);
                        ux2Var2.p(true);
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
            j56VarR.d = new hw2(ot7Var, j, j2, j3, f, dwVar, nd5Var, e87Var, e87Var2, e87Var3, e87Var4, i) { // from class: o.jr0
                public final /* synthetic */ ot7 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ long f1195o;
                public final /* synthetic */ long p;
                public final /* synthetic */ long q;
                public final /* synthetic */ float r;
                public final /* synthetic */ dw s;
                public final /* synthetic */ nd5 t;
                public final /* synthetic */ e87 u;
                public final /* synthetic */ e87 v;
                public final /* synthetic */ e87 w;
                public final /* synthetic */ e87 x;

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(1);
                    kr0.a(this.m, this.n, this.f1195o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final Function0 function0, final yy0 yy0Var, final fs4 fs4Var, final boolean z2, final pw6 pw6Var, final bo6 bo6Var, final co6 co6Var, final d90 d90Var, dw dwVar, final nd5 nd5Var, ux2 ux2Var, final int i, final int i2) {
        boolean z3;
        int i3;
        Function0 function1;
        yy0 yy0Var2;
        boolean z4;
        int i4;
        nd5 nd5Var2;
        final dw dwVar2;
        int i5;
        dw dwVar3;
        ux2Var.Y(1511159815);
        if ((i & 6) == 0) {
            z3 = z;
            i3 = (ux2Var.g(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i3 |= ux2Var.h(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i & 384) == 0) {
            yy0Var2 = yy0Var;
            i3 |= ux2Var.h(yy0Var2) ? 256 : 128;
        } else {
            yy0Var2 = yy0Var;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z4 = z2;
            i3 |= ux2Var.g(z4) ? 16384 : 8192;
        } else {
            z4 = z2;
        }
        if ((196608 & i) == 0) {
            i3 |= ux2Var.h(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= ux2Var.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ux2Var.f(pw6Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ux2Var.f(bo6Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ux2Var.f(co6Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ux2Var.f(d90Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= 16;
        }
        if ((i2 & 384) == 0) {
            nd5Var2 = nd5Var;
            i4 |= ux2Var.f(nd5Var2) ? 256 : 128;
        } else {
            nd5Var2 = nd5Var;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ux2Var.f(null) ? 2048 : 1024;
        }
        int i6 = i4;
        if (ux2Var.N(i3 & 1, ((306783379 & i3) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                float f = cl2.a;
                i5 = i6 & (-113);
                dwVar3 = a;
            } else {
                ux2Var.Q();
                i5 = i6 & (-113);
                dwVar3 = dwVar;
            }
            ux2Var.q();
            ot7 ot7VarA = k68.a(kh.D, ux2Var);
            float f2 = cl2.a;
            int i7 = i5;
            int i8 = i3 << 3;
            int i9 = i3 << 6;
            int i10 = ((i3 >> 3) & 7168) | (i3 & 14) | 12582912 | ((i3 >> 6) & 112) | (i8 & 896) | (i9 & 57344) | (i8 & 3670016) | (i9 & 234881024) | (i9 & 1879048192);
            int i11 = i3 >> 24;
            int i12 = i7 << 9;
            boolean z5 = z3;
            Function0 function2 = function1;
            dw dwVar4 = dwVar3;
            d(z5, fs4Var, function2, z4, yy0Var2, ot7VarA, pw6Var, bo6Var, co6Var, d90Var, 32.0f, dwVar4, nd5Var2, ux2Var, i10, (i11 & 112) | (i11 & 14) | 3072 | ((i7 << 6) & 896) | (i12 & 458752) | (i12 & 3670016));
            dwVar2 = dwVar4;
        } else {
            ux2Var.Q();
            dwVar2 = dwVar;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.fr0
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    kr0.b(z, function0, yy0Var, fs4Var, z2, pw6Var, bo6Var, co6Var, d90Var, dwVar2, nd5Var, (ux2) obj, iY, iY2);
                    return f88.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final Function0 function0, final yy0 yy0Var, final fs4 fs4Var, boolean z2, final pw6 pw6Var, bo6 bo6Var, co6 co6Var, d90 d90Var, ux2 ux2Var, final int i) {
        final boolean z3;
        final bo6 bo6Var2;
        final co6 co6Var2;
        final d90 d90Var2;
        int i2;
        bo6 bo6Var3;
        boolean z4;
        co6 co6Var3;
        d90 d90Var3;
        ux2Var.Y(-1385473344);
        int i3 = i | (ux2Var.g(z) ? 4 : 2) | (ux2Var.h(function0) ? 32 : 16) | (ux2Var.f(fs4Var) ? 2048 : 1024) | 1794048 | (ux2Var.f(pw6Var) ? 8388608 : 4194304) | 301989888;
        if (ux2Var.N(i3 & 1, (306783379 & i3) != 306783378)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                bo6 bo6VarA = cl2.a(ux2Var);
                co6 co6Var4 = new co6(kh.A, kh.u);
                i2 = i3 & (-2113929217);
                long jC = bw0.c(kh.B, ux2Var);
                long j = rv0.g;
                rv0.b(kh.y, bw0.c(kh.x, ux2Var));
                float f = kh.C;
                if (z) {
                    jC = j;
                }
                if (z) {
                    f = 0.0f;
                }
                d90 d90Var4 = new d90(f, new t57(jC));
                bo6Var3 = bo6VarA;
                z4 = true;
                co6Var3 = co6Var4;
                d90Var3 = d90Var4;
            } else {
                ux2Var.Q();
                i2 = i3 & (-2113929217);
                z4 = z2;
                bo6Var3 = bo6Var;
                co6Var3 = co6Var;
                d90Var3 = d90Var;
            }
            ux2Var.q();
            b(z, function0, yy0Var, fs4Var, z4, pw6Var, bo6Var3, co6Var3, d90Var3, null, cl2.c, ux2Var, i2 & 2147483646, 3456);
            z3 = z4;
            d90Var2 = d90Var3;
            co6Var2 = co6Var3;
            bo6Var2 = bo6Var3;
        } else {
            ux2Var.Q();
            z3 = z2;
            bo6Var2 = bo6Var;
            co6Var2 = co6Var;
            d90Var2 = d90Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(z, function0, yy0Var, fs4Var, z3, pw6Var, bo6Var2, co6Var2, d90Var2, i) { // from class: o.er0
                public final /* synthetic */ boolean m;
                public final /* synthetic */ Function0 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ yy0 f734o;
                public final /* synthetic */ fs4 p;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ pw6 r;
                public final /* synthetic */ bo6 s;
                public final /* synthetic */ co6 t;
                public final /* synthetic */ d90 u;

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(385);
                    kr0.c(this.m, this.n, this.f734o, this.p, this.q, this.r, this.s, this.t, this.u, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x024f  */
    public static final void d(final boolean z, final fs4 fs4Var, final Function0 function0, final boolean z2, final yy0 yy0Var, final ot7 ot7Var, final pw6 pw6Var, final bo6 bo6Var, final co6 co6Var, final d90 d90Var, final float f, final dw dwVar, final nd5 nd5Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        int i4;
        long j;
        float f2;
        km kmVar;
        Object obj;
        boolean z3;
        ko koVar;
        ux2Var.Y(400616238);
        if ((i & 6) == 0) {
            i3 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ux2Var.f(ot7Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ux2Var.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ux2Var.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ux2Var.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ux2Var.f(pw6Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ux2Var.f(bo6Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.f(co6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ux2Var.f(d90Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ux2Var.c(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ux2Var.f(dwVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= ux2Var.f(nd5Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= ux2Var.f(null) ? 1048576 : 524288;
        }
        int i5 = i3;
        if (ux2Var.N(i5 & 1, ((306783379 & i3) == 306783378 && (i4 & 599187) == 599186) ? false : true)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            ux2Var.W(-955061811);
            Object objK = ux2Var.K();
            Object obj2 = e01.a;
            if (objK == obj2) {
                objK = ua5.s(ux2Var);
            }
            mw4 mw4Var = (mw4) objK;
            ux2Var.p(false);
            Object objK2 = ux2Var.K();
            if (objK2 == obj2) {
                objK2 = new px((byte) 15);
                ux2Var.g0(objK2);
            }
            final fs4 fs4VarA = cp6.a(fs4Var, false, (Function1) objK2);
            if (z2) {
                j = !z ? bo6Var.a : bo6Var.i;
            } else {
                j = z ? bo6Var.j : bo6Var.e;
            }
            if (co6Var == null) {
                ux2Var.W(-954746232);
                ux2Var.p(false);
                mw4Var = mw4Var;
                obj = obj2;
                j = j;
                z3 = false;
                koVar = null;
            } else {
                ux2Var.W(-1554818919);
                int i6 = ((i4 << 3) & 896) | ((i5 >> 9) & 14);
                Object objK3 = ux2Var.K();
                if (objK3 == obj2) {
                    objK3 = new j57();
                    ux2Var.g0(objK3);
                }
                j57 j57Var = (j57) objK3;
                Object objK4 = ux2Var.K();
                if (objK4 == obj2) {
                    objK4 = h57.p(null);
                    ux2Var.g0(objK4);
                }
                px4 px4Var = (px4) objK4;
                boolean zF = ux2Var.f(mw4Var);
                Object objK5 = ux2Var.K();
                if (zF || objK5 == obj2) {
                    objK5 = new qg0(mw4Var, j57Var, null, (byte) 1);
                    ux2Var.g0(objK5);
                }
                ck3.i(mw4Var, (hw2) objK5, ux2Var);
                jl3 jl3Var = (jl3) lv0.w0(j57Var);
                if (!z2 || (jl3Var instanceof yr5)) {
                    f2 = 0.0f;
                } else if (jl3Var instanceof j63) {
                    f2 = co6Var.a;
                } else if (!(jl3Var instanceof dq2) && (jl3Var instanceof g52)) {
                    f2 = co6Var.b;
                } else {
                    f2 = 0.0f;
                }
                Object objK6 = ux2Var.K();
                if (objK6 == obj2) {
                    objK6 = new km(new w32(f2), vn4.l0, null, 12);
                    ux2Var.g0(objK6);
                }
                km kmVar2 = (km) objK6;
                w32 w32Var = new w32(f2);
                boolean zH = ux2Var.h(kmVar2) | ux2Var.c(f2) | ((((i6 & 14) ^ 6) > 4 && ux2Var.g(z2)) || (i6 & 6) == 4) | ux2Var.h(jl3Var);
                Object objK7 = ux2Var.K();
                if (zH || objK7 == obj2) {
                    kmVar = kmVar2;
                    obj = obj2;
                    z3 = false;
                    Object rg0Var = new rg0(kmVar, f2, z2, jl3Var, px4Var, (hc1) null);
                    ux2Var.g0(rg0Var);
                    objK7 = rg0Var;
                } else {
                    obj = obj2;
                    kmVar = kmVar2;
                    z3 = false;
                }
                ck3.i(w32Var, (hw2) objK7, ux2Var);
                koVar = kmVar.c;
                ux2Var.p(z3);
            }
            boolean z4 = z3;
            final float f3 = koVar != null ? ((w32) koVar.n.getValue()).m : 0.0f;
            final yy0 yy0VarO = au8.O(-1320468520, new hw2() { // from class: o.gr0
                @Override // o.hw2
                public final Object invoke(Object obj3, Object obj4) {
                    long j2;
                    long j3;
                    long j4;
                    ux2 ux2Var2 = (ux2) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        bo6 bo6Var2 = bo6Var;
                        boolean z5 = z2;
                        boolean z6 = z;
                        if (z5) {
                            j2 = !z6 ? bo6Var2.b : bo6Var2.k;
                        } else {
                            j2 = bo6Var2.f;
                        }
                        if (z5) {
                            j3 = !z6 ? bo6Var2.c : bo6Var2.l;
                        } else {
                            j3 = bo6Var2.g;
                        }
                        if (z5) {
                            j4 = !z6 ? bo6Var2.d : bo6Var2.m;
                        } else {
                            j4 = bo6Var2.h;
                        }
                        long j5 = j3;
                        long j6 = j4;
                        kr0.a(yy0Var, ot7Var, j2, j5, j6, f, dwVar, nd5Var, xs1.c0(du4.q, ux2Var2), xs1.c0(du4.p, ux2Var2), xs1.c0(du4.n, ux2Var2), xs1.c0(du4.f656o, ux2Var2), ux2Var2, 0);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var);
            h72 h72Var = ig7.a;
            long jA = bw0.a(j, ux2Var);
            if (mw4Var == null) {
                ux2Var.W(1528105640);
                Object objK8 = ux2Var.K();
                if (objK8 == obj) {
                    objK8 = ua5.s(ux2Var);
                }
                ux2Var.p(z4);
                mw4Var = (mw4) objK8;
            } else {
                ux2Var.W(-227801585);
                ux2Var.p(z4);
            }
            zw5 zw5Var = ig7.a;
            final float f4 = ((w32) ux2Var.j(zw5Var)).m + 0.0f;
            final long j2 = j;
            final mw4 mw4Var2 = mw4Var;
            j51.m(new dx5[]{wa1.a.a(new rv0(jA)), zw5Var.a(new w32(f4))}, au8.O(1508735219, new hw2() { // from class: o.fg7
                @Override // o.hw2
                public final Object invoke(Object obj3, Object obj4) {
                    ux2 ux2Var2 = (ux2) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        b63 b63Var = ml3.a;
                        fs4 fs4VarF = fs4VarA.f(jr4.b);
                        h72 h72Var2 = zd6.a;
                        me6 me6Var = ((ne6) ux2Var2.j(h72Var2)).a;
                        fs4 fs4VarF2 = fs4VarF.f(cs4.b);
                        long jD = ig7.d(j2, f4, ux2Var2);
                        float fD0 = ((in1) ux2Var2.j(b11.h)).d0(f3);
                        pw6 pw6Var2 = pw6Var;
                        fs4 fs4VarC = ig7.c(fs4VarF2, pw6Var2, jD, d90Var, fD0);
                        me6 me6Var2 = ((ne6) ux2Var2.j(h72Var2)).a;
                        fs4 fs4VarQ = ck3.q(g68.z(fs4VarC, z, mw4Var2, zd6.a(false, 0.0f, 0L, pw6Var2, 215), z2, null, function0));
                        do4 do4VarC = ua0.c(xz2.f2564o, true);
                        int iHashCode = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL = ux2Var2.l();
                        fs4 fs4VarS = uf0.s(ux2Var2, fs4VarQ);
                        yz0.c.getClass();
                        ux2Var2.a0();
                        if (ux2Var2.S) {
                            ux2Var2.k(LayoutNode.e0);
                        } else {
                            ux2Var2.j0();
                        }
                        o67.n(do4VarC, d82.v, ux2Var2);
                        o67.n(yj5VarL, d82.u, ux2Var2);
                        o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                        o67.l(ux2Var2);
                        o67.n(fs4VarS, d82.t, ux2Var2);
                        yy0VarO.invoke(ux2Var2, 0);
                        ux2Var2.p(true);
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
            j56VarR.d = new hw2() { // from class: o.hr0
                @Override // o.hw2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    kr0.d(z, fs4Var, function0, z2, yy0Var, ot7Var, pw6Var, bo6Var, co6Var, d90Var, f, dwVar, nd5Var, (ux2) obj3, iY, iY2);
                    return f88.a;
                }
            };
        }
    }
}
