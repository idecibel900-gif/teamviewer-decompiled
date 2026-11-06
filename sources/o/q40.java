package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class q40 {
    static {
        nv1.a(40.0f, 40.0f);
    }

    public static final void a(final String str, final Function1 function1, final fs4 fs4Var, final boolean z, final boolean z2, final ot7 ot7Var, final yx3 yx3Var, final xx3 xx3Var, final boolean z3, final int i, final int i2, final tg8 tg8Var, Function1 function2, final mw4 mw4Var, final t57 t57Var, final yy0 yy0Var, ux2 ux2Var, final int i3) {
        final Function1 function3;
        Function1 function4;
        ux2Var.Y(2026950908);
        int i4 = i3 | (ux2Var.f(str) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | (ux2Var.f(fs4Var) ? 256 : 128) | (ux2Var.g(z) ? 2048 : 1024) | (ux2Var.g(z2) ? 16384 : 8192) | (ux2Var.f(ot7Var) ? 131072 : 65536) | (ux2Var.f(yx3Var) ? 1048576 : 524288) | (ux2Var.f(xx3Var) ? 8388608 : 4194304) | (ux2Var.g(z3) ? 67108864 : 33554432) | (ux2Var.d(i) ? 536870912 : 268435456);
        int i5 = 196608 | (ux2Var.d(i2) ? 4 : 2) | (ux2Var.f(tg8Var) ? 32 : 16) | 384 | (ux2Var.f(mw4Var) ? 2048 : 1024) | (ux2Var.f(t57Var) ? 16384 : 8192);
        if (ux2Var.N(i4 & 1, ((i4 & 306783379) == 306783378 && (74899 & i5) == 74898) ? false : true)) {
            ux2Var.S();
            int i6 = i3 & 1;
            Object obj = e01.a;
            if (i6 == 0 || ux2Var.x()) {
                Object objK = ux2Var.K();
                if (objK == obj) {
                    objK = new px((byte) 6);
                    ux2Var.g0(objK);
                }
                function4 = (Function1) objK;
            } else {
                ux2Var.Q();
                function4 = function2;
            }
            ux2Var.q();
            Object objK2 = ux2Var.K();
            if (objK2 == obj) {
                objK2 = h57.p(new zr7(6, 0L, str));
                ux2Var.g0(objK2);
            }
            px4 px4Var = (px4) objK2;
            zr7 zr7Var = (zr7) px4Var.getValue();
            zr7 zr7Var2 = new zr7(new xo(str), zr7Var.b, zr7Var.c);
            boolean zF = ux2Var.f(zr7Var2);
            Object objK3 = ux2Var.K();
            if (zF || objK3 == obj) {
                objK3 = new x8(zr7Var2, px4Var, (byte) 9);
                ux2Var.g0(objK3);
            }
            ck3.k((Function0) objK3, ux2Var);
            boolean z4 = (i4 & 14) == 4;
            Object objK4 = ux2Var.K();
            if (z4 || objK4 == obj) {
                objK4 = h57.p(str);
                ux2Var.g0(objK4);
            }
            Object obj2 = (px4) objK4;
            bf3 bf3VarA = yx3Var.a(z3);
            boolean z5 = !z3;
            int i7 = z3 ? 1 : i2;
            int i8 = z3 ? 1 : i;
            boolean zF2 = ux2Var.f(obj2) | ((i4 & 112) == 32);
            Object objK5 = ux2Var.K();
            if (zF2 || objK5 == obj) {
                objK5 = new m5(function1, px4Var, obj2, (byte) 3);
                ux2Var.g0(objK5);
            }
            int i9 = i5 << 9;
            Function1 function5 = function4;
            ka0.f(zr7Var2, (Function1) objK5, fs4Var, ot7Var, tg8Var, function5, mw4Var, t57Var, z5, i8, i7, bf3VarA, xx3Var, z, z2, yy0Var, ux2Var, (i4 & 896) | ((i4 >> 6) & 7168) | (i9 & 57344) | 196608 | (3670016 & i9) | (i9 & 29360128), (i4 & 57344) | ((i4 >> 15) & 896) | (i4 & 7168) | 196608);
            function3 = function5;
        } else {
            ux2Var.Q();
            function3 = function2;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(str, function1, fs4Var, z, z2, ot7Var, yx3Var, xx3Var, z3, i, i2, tg8Var, function3, mw4Var, t57Var, yy0Var, i3) { // from class: o.p40
                public final /* synthetic */ t57 A;
                public final /* synthetic */ yy0 B;
                public final /* synthetic */ String m;
                public final /* synthetic */ Function1 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ fs4 f1703o;
                public final /* synthetic */ boolean p;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ ot7 r;
                public final /* synthetic */ yx3 s;
                public final /* synthetic */ xx3 t;
                public final /* synthetic */ boolean u;
                public final /* synthetic */ int v;
                public final /* synthetic */ int w;
                public final /* synthetic */ tg8 x;
                public final /* synthetic */ Function1 y;
                public final /* synthetic */ mw4 z;

                @Override // o.hw2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iY = yo1.Y(1);
                    q40.a(this.m, this.n, this.f1703o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, (ux2) obj3, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void b(final zr7 zr7Var, final Function1 function1, final fs4 fs4Var, boolean z, boolean z2, ot7 ot7Var, final yx3 yx3Var, xx3 xx3Var, boolean z3, int i, int i2, tg8 tg8Var, Function1 function2, final mw4 mw4Var, sb0 sb0Var, final yy0 yy0Var, ux2 ux2Var, final int i3, final int i4, final int i5) {
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        ot7 ot7Var2;
        int i8;
        xx3 xx3Var2;
        int i9;
        boolean z6;
        int i10;
        int i11;
        int i12;
        int i13;
        final int i14;
        final tg8 tg8Var2;
        final Function1 function3;
        final boolean z7;
        final boolean z8;
        final ot7 ot7Var3;
        final xx3 xx3Var3;
        final boolean z9;
        final int i15;
        final sb0 sb0Var2;
        int i16;
        boolean z10;
        int i17;
        int i18;
        tg8 tg8Var3;
        sb0 t57Var;
        xx3 xx3Var4;
        boolean z11;
        int i19;
        boolean z12;
        Function1 function4;
        ux2Var.Y(-971111025);
        int i20 = i3 | (ux2Var.f(zr7Var) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | (ux2Var.f(fs4Var) ? 256 : 128);
        int i21 = i5 & 8;
        if (i21 != 0) {
            i6 = i20 | 3072;
            z4 = z;
        } else {
            z4 = z;
            i6 = i20 | (ux2Var.g(z4) ? 2048 : 1024);
        }
        int i22 = i5 & 16;
        if (i22 != 0) {
            i7 = i6 | 24576;
            z5 = z2;
        } else {
            z5 = z2;
            i7 = i6 | (ux2Var.g(z5) ? 16384 : 8192);
        }
        int i23 = i5 & 32;
        if (i23 != 0) {
            i8 = i7 | 196608;
            ot7Var2 = ot7Var;
        } else {
            ot7Var2 = ot7Var;
            i8 = i7 | (ux2Var.f(ot7Var2) ? 131072 : 65536);
        }
        if ((i3 & 1572864) == 0) {
            i8 |= ux2Var.f(yx3Var) ? 1048576 : 524288;
        }
        int i24 = i5 & 128;
        if (i24 != 0) {
            i9 = i8 | 12582912;
            xx3Var2 = xx3Var;
        } else {
            xx3Var2 = xx3Var;
            i9 = i8 | (ux2Var.f(xx3Var2) ? 8388608 : 4194304);
        }
        int i25 = i5 & 256;
        if (i25 != 0) {
            i10 = i9 | 100663296;
            z6 = z3;
        } else {
            z6 = z3;
            i10 = i9 | (ux2Var.g(z6) ? 67108864 : 33554432);
        }
        int i26 = i10 | (((i5 & 512) == 0 && ux2Var.d(i)) ? 536870912 : 268435456);
        int i27 = i5 & 1024;
        if (i27 != 0) {
            i11 = i4 | 6;
        } else {
            i11 = i4 | (ux2Var.d(i2) ? 4 : 2);
        }
        int i28 = i5 & 2048;
        if (i28 != 0) {
            i12 = i11 | 48;
        } else {
            i12 = i11 | (ux2Var.f(tg8Var) ? 32 : 16);
        }
        int i29 = i12 | 384;
        if ((i4 & 3072) == 0) {
            i29 |= ux2Var.f(mw4Var) ? 2048 : 1024;
        }
        int i30 = i29;
        int i31 = i5 & 16384;
        if (i31 != 0) {
            i13 = i30 | 24576;
        } else {
            i13 = i30 | (ux2Var.f(sb0Var) ? 16384 : 8192);
        }
        if (ux2Var.N(i26 & 1, ((i26 & 306783379) == 306783378 && (i13 & 74899) == 74898) ? false : true)) {
            ux2Var.S();
            int i32 = i3 & 1;
            aw awVar = e01.a;
            if (i32 == 0 || ux2Var.x()) {
                if (i21 != 0) {
                    z4 = true;
                }
                if (i22 != 0) {
                    z5 = false;
                }
                ot7 ot7Var4 = i23 != 0 ? ot7.d : ot7Var2;
                if (i24 != 0) {
                    xx3Var2 = xx3.b;
                }
                if (i25 != 0) {
                    z6 = false;
                }
                if ((i5 & 512) != 0) {
                    i16 = z6 ? 1 : Integer.MAX_VALUE;
                    i26 &= -1879048193;
                } else {
                    i16 = i;
                }
                int i33 = i27 != 0 ? 1 : i2;
                tg8 tg8Var4 = i28 != 0 ? xz2.Z : tg8Var;
                Object objK = ux2Var.K();
                if (objK == awVar) {
                    objK = new px((byte) 5);
                    ux2Var.g0(objK);
                }
                Function1 function5 = (Function1) objK;
                z10 = z6;
                i17 = i16;
                i18 = i33;
                tg8Var3 = tg8Var4;
                t57Var = i31 != 0 ? new t57(rv0.b) : sb0Var;
                xx3Var4 = xx3Var2;
                z11 = z4;
                i19 = i26;
                ot7Var2 = ot7Var4;
                z12 = z5;
                function4 = function5;
            } else {
                ux2Var.Q();
                if ((i5 & 512) != 0) {
                    i26 &= -1879048193;
                }
                i17 = i;
                i18 = i2;
                tg8Var3 = tg8Var;
                z10 = z6;
                xx3Var4 = xx3Var2;
                z11 = z4;
                i19 = i26;
                t57Var = sb0Var;
                z12 = z5;
                function4 = function2;
            }
            ux2Var.q();
            bf3 bf3VarA = yx3Var.a(z10);
            boolean z13 = z10;
            tg8 tg8Var5 = tg8Var3;
            Function1 function6 = function4;
            sb0 sb0Var3 = t57Var;
            boolean z14 = !z13;
            ot7 ot7Var5 = ot7Var2;
            int i34 = z13 ? 1 : i18;
            int i35 = z13 ? 1 : i17;
            boolean z15 = ((i19 & 14) == 4) | ((i19 & 112) == 32);
            Object objK2 = ux2Var.K();
            if (z15 || objK2 == awVar) {
                objK2 = new g0(zr7Var, function1, (byte) 13);
                ux2Var.g0(objK2);
            }
            int i36 = i13 << 9;
            ka0.f(zr7Var, (Function1) objK2, fs4Var, ot7Var5, tg8Var5, function6, mw4Var, sb0Var3, z14, i35, i34, bf3VarA, xx3Var4, z11, z12, yy0Var, ux2Var, (i19 & 910) | ((i19 >> 6) & 7168) | (i36 & 57344) | 196608 | (i36 & 3670016) | (i36 & 29360128), (i19 & 7168) | ((i19 >> 15) & 896) | (i19 & 57344) | 196608);
            sb0Var2 = sb0Var3;
            xx3Var3 = xx3Var4;
            ot7Var3 = ot7Var5;
            z8 = z13;
            i15 = i17;
            i14 = i18;
            tg8Var2 = tg8Var5;
            z9 = z11;
            function3 = function6;
            z7 = z12;
        } else {
            ux2Var.Q();
            i14 = i2;
            tg8Var2 = tg8Var;
            function3 = function2;
            z7 = z5;
            z8 = z6;
            ot7Var3 = ot7Var2;
            xx3Var3 = xx3Var2;
            z9 = z4;
            i15 = i;
            sb0Var2 = sb0Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.o40
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i3 | 1);
                    int iY2 = yo1.Y(i4);
                    zr7 zr7Var2 = zr7Var;
                    Function1 function7 = function1;
                    fs4 fs4Var2 = fs4Var;
                    boolean z16 = z9;
                    boolean z17 = z7;
                    ot7 ot7Var6 = ot7Var3;
                    yx3 yx3Var2 = yx3Var;
                    xx3 xx3Var5 = xx3Var3;
                    boolean z18 = z8;
                    int i37 = i15;
                    boolean z19 = i14;
                    tg8 tg8Var6 = tg8Var2;
                    Function1 function8 = function3;
                    mw4 mw4Var2 = mw4Var;
                    sb0 sb0Var4 = sb0Var2;
                    yy0 yy0Var2 = yy0Var;
                    short s = i5;
                    q40.b(zr7Var2, function7, fs4Var2, z16, z17, ot7Var6, yx3Var2, xx3Var5, z18, i37, z19 ? 1 : 0, tg8Var6, function8, mw4Var2, sb0Var4, yy0Var2, (ux2) obj, iY, iY2, s);
                    return f88.a;
                }
            };
        }
    }
}
