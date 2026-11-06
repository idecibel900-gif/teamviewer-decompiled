package o;

import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ex1 {
    public static final List a;
    public static final List b;
    public static final List c;

    static {
        bh2 bh2Var = bh2.m;
        bh2 bh2Var2 = bh2.n;
        bh2 bh2Var3 = bh2.f425o;
        a = qf0.L(bh2Var, bh2Var2, bh2Var3);
        b = qf0.L(bh2Var, bh2Var3);
        c = qf0.K(bh2Var3);
    }

    public static final void a(ul1 ul1Var, boolean z, Function0 function0, Function0 function1, ux2 ux2Var, int i) {
        int i2;
        Object obj;
        Object obj2;
        ux2Var.Y(-2090429078);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(ul1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = function0;
            i2 |= ux2Var.h(obj) ? 256 : 128;
        } else {
            obj = function0;
        }
        if ((i & 3072) == 0) {
            obj2 = function1;
            i2 |= ux2Var.h(obj2) ? 2048 : 1024;
        } else {
            obj2 = function1;
        }
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = ul1.c(ul1Var) || z;
            boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objK = ux2Var.K();
            if (z3 || objK == e01.a) {
                nw1 nw1Var = new nw1(z, ul1Var, obj, obj2, (byte) 0);
                ux2Var.g0(nw1Var);
                objK = nw1Var;
            }
            kh.c(z2, (Function0) objK, ux2Var, 0, 0);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new uu((byte) 1, i, (Object) ul1Var, (Object) function0, (Object) function1, z);
        }
    }

    public static final void b(final gl4 gl4Var, final boolean z, final boolean z2, final Function0 function0, final Function1 function1, final Function0 function2, final Function0 function3, final gw1 gw1Var, final Function1 function4, final Function1 function5, final bl6 bl6Var, final boolean z3, final lr0 lr0Var, final List list, final l33 l33Var, final Function1 function6, final Function0 function7, final Function0 function8, final Function1 function9, final Function1 function10, final Function1 function11, final Function1 function12, final Function1 function13, final ul1 ul1Var, final Function1 function14, final Function1 function15, final Function1 function16, ux2 ux2Var, final int i) {
        boolean z4;
        int i2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(1067686267);
        int i3 = i | (ux2Var2.h(gl4Var) ? 4 : 2) | (ux2Var2.g(z) ? 32 : 16) | (ux2Var2.g(z2) ? 256 : 128) | (ux2Var2.h(function0) ? 2048 : 1024) | (ux2Var2.h(function1) ? 16384 : 8192) | (ux2Var2.h(function2) ? 131072 : 65536) | (ux2Var2.h(function3) ? 1048576 : 524288) | (ux2Var2.h(gw1Var) ? 8388608 : 4194304) | (ux2Var2.h(function4) ? 67108864 : 33554432);
        int i4 = (ux2Var2.f(bl6Var) ? 4 : 2) | (ux2Var2.g(z3) ? 32 : 16) | (ux2Var2.h(lr0Var) ? 256 : 128) | (ux2Var2.f(list) ? 2048 : 1024) | (ux2Var2.h(l33Var) ? 16384 : 8192) | (ux2Var2.h(function6) ? 131072 : 65536) | (ux2Var2.h(function7) ? 1048576 : 524288) | (ux2Var2.h(function8) ? 8388608 : 4194304) | (ux2Var2.h(function9) ? 67108864 : 33554432) | (ux2Var2.h(function10) ? 536870912 : 268435456);
        int i5 = (ux2Var2.h(function11) ? 4 : 2) | (ux2Var2.h(function12) ? 32 : 16) | (ux2Var2.h(function13) ? 256 : 128) | (ux2Var2.f(ul1Var) ? 2048 : 1024) | (ux2Var2.h(function14) ? 16384 : 8192) | (ux2Var2.h(function15) ? 131072 : 65536) | (ux2Var2.h(function16) ? 1048576 : 524288);
        if (ux2Var2.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 306783379) == 306783378 && (599187 & i5) == 599186) ? false : true)) {
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ck3.w(ux2Var2);
                ux2Var2.g0(objK);
            }
            me1 me1Var = (me1) objK;
            if (z) {
                ux2Var2.W(-1084966196);
                int i6 = i4 << 24;
                ep1.a(z2, function0, function1, function2, function3, gw1Var.d, function4, function5, bl6Var, z3, null, gl4Var, ux2Var2, ((i3 >> 6) & 33095678) | (i6 & 234881024) | (i6 & 1879048192), (i3 << 3) & 112);
                ux2Var2 = ux2Var2;
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-1084335470);
                k33 k33Var = l33Var != null ? l33Var.a : null;
                int i7 = i3 & 234881024;
                boolean zH = ux2Var2.h(lr0Var) | (i7 == 67108864) | ((i4 & 458752) == 131072);
                Object objK2 = ux2Var2.K();
                if (zH || objK2 == awVar) {
                    objK2 = new m5((Object) lr0Var, (Object) function4, (Object) function6, (byte) 18);
                    ux2Var2.g0(objK2);
                }
                Function1 function17 = (Function1) objK2;
                boolean z5 = ((i4 & 234881024) == 67108864) | (i7 == 67108864);
                Object objK3 = ux2Var2.K();
                if (z5 || objK3 == awVar) {
                    objK3 = new tw1(function4, function9, (byte) 0);
                    ux2Var2.g0(objK3);
                }
                Function1 function18 = (Function1) objK3;
                boolean z6 = (i7 == 67108864) | ((i4 & 1879048192) == 536870912);
                Object objK4 = ux2Var2.K();
                if (z6 || objK4 == awVar) {
                    z4 = true;
                    objK4 = new tw1(function4, function10, (byte) 1);
                    ux2Var2.g0(objK4);
                } else {
                    z4 = true;
                }
                Function1 function19 = (Function1) objK4;
                boolean z7 = ((i5 & 14) == 4) | (i7 == 67108864 ? z4 : false);
                Object objK5 = ux2Var2.K();
                if (z7 || objK5 == awVar) {
                    objK5 = new tw1(function4, function11, (byte) 2);
                    ux2Var2.g0(objK5);
                }
                Function1 function20 = (Function1) objK5;
                boolean z8 = ((i5 & 112) == 32) | (i7 == 67108864);
                Object objK6 = ux2Var2.K();
                if (z8 || objK6 == awVar) {
                    objK6 = new tw1(function4, function12, (byte) 3);
                    ux2Var2.g0(objK6);
                }
                Function1 function21 = (Function1) objK6;
                boolean z9 = ((i5 & 896) == 256) | (i7 == 67108864);
                Object objK7 = ux2Var2.K();
                if (z9 || objK7 == awVar) {
                    objK7 = new tw1(function4, function13, (byte) 4);
                    ux2Var2.g0(objK7);
                }
                Function1 function22 = (Function1) objK7;
                boolean z10 = ((i4 & 3670016) == 1048576) | (i7 == 67108864);
                Object objK8 = ux2Var2.K();
                if (z10 || objK8 == awVar) {
                    objK8 = new j5((byte) 2, function7, function4);
                    ux2Var2.g0(objK8);
                }
                Function0 function23 = (Function0) objK8;
                boolean zH2 = (i7 == 67108864) | ux2Var2.h(me1Var) | ((i4 & 29360128) == 8388608) | ((i5 & 7168) == 2048);
                Object objK9 = ux2Var2.K();
                if (zH2 || objK9 == awVar) {
                    i2 = i5;
                    eb ebVar = new eb((Object) function4, (Object) me1Var, (Object) function8, (Object) ul1Var, (byte) 7);
                    ux2Var2.g0(ebVar);
                    objK9 = ebVar;
                } else {
                    i2 = i5;
                }
                int i8 = i2 << 3;
                yo1.d(gw1Var, z3, lr0Var, function17, list, k33Var, function18, function19, function20, function21, function22, function23, (Function0) objK9, null, function4, function14, function15, function16, ux2Var2, ((i3 >> 21) & 14) | (i4 & 112) | (i4 & 896) | ((i4 << 3) & 57344), ((i3 >> 12) & 57344) | (i8 & 458752) | (i8 & 3670016) | (i8 & 29360128));
                ux2Var2 = ux2Var2;
                ux2Var2.p(false);
            }
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(z, z2, function0, function1, function2, function3, gw1Var, function4, function5, bl6Var, z3, lr0Var, list, l33Var, function6, function7, function8, function9, function10, function11, function12, function13, ul1Var, function14, function15, function16, i) { // from class: o.vw1
                public final /* synthetic */ l33 A;
                public final /* synthetic */ Function1 B;
                public final /* synthetic */ Function0 C;
                public final /* synthetic */ Function0 D;
                public final /* synthetic */ Function1 E;
                public final /* synthetic */ Function1 F;
                public final /* synthetic */ Function1 G;
                public final /* synthetic */ Function1 H;
                public final /* synthetic */ Function1 I;
                public final /* synthetic */ ul1 J;
                public final /* synthetic */ Function1 K;
                public final /* synthetic */ Function1 L;
                public final /* synthetic */ Function1 M;
                public final /* synthetic */ boolean n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ boolean f2354o;
                public final /* synthetic */ Function0 p;
                public final /* synthetic */ Function1 q;
                public final /* synthetic */ Function0 r;
                public final /* synthetic */ Function0 s;
                public final /* synthetic */ gw1 t;
                public final /* synthetic */ Function1 u;
                public final /* synthetic */ Function1 v;
                public final /* synthetic */ bl6 w;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ lr0 y;
                public final /* synthetic */ List z;

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(805306369);
                    ex1.b(this.m, this.n, this.f2354o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0317 A[PHI: r19
      0x0317: PHI (r19v8 o.px4) = (r19v3 o.px4), (r19v3 o.px4), (r19v9 o.px4), (r19v9 o.px4), (r19v9 o.px4) binds: [B:153:0x0339, B:154:0x033b, B:138:0x0315, B:143:0x0321, B:144:0x0323] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x032f  */
    public static final void c(final lr0 lr0Var, final Function1 function1, final List list, final l33 l33Var, final Function1 function2, final Function1 function3, final Function0 function0, final Function0 function4, final Function0 function5, final boolean z, final bl6 bl6Var, final boolean z2, final Function1 function6, final Function0 function7, final Function1 function8, final Function1 function9, final fs4 fs4Var, final gl4 gl4Var, final Function0 function10, final Function1 function11, fx1 fx1Var, ux2 ux2Var, final int i) {
        final fx1 fx1Var2;
        int i2;
        int i3;
        fx1 fx1Var3;
        px4 px4Var;
        Object obj;
        boolean z3;
        Function0 function12;
        fx1 fx1Var4;
        px4 px4Var2;
        ul1 ul1Var;
        hc1 hc1Var;
        boolean z4;
        px4 px4Var3;
        px4 px4Var4;
        yu7 yu7Var = kh.Q;
        yu7 yu7Var2 = kh.P;
        lr0Var.getClass();
        function1.getClass();
        list.getClass();
        function2.getClass();
        function3.getClass();
        function0.getClass();
        function4.getClass();
        function5.getClass();
        function7.getClass();
        function8.getClass();
        function9.getClass();
        ux2Var.Y(-1742790275);
        int i4 = i | (ux2Var.h(lr0Var) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | (ux2Var.f(list) ? 256 : 128) | (ux2Var.h(l33Var) ? 2048 : 1024) | (ux2Var.h(function2) ? 16384 : 8192) | (ux2Var.h(function3) ? 131072 : 65536) | (ux2Var.h(function0) ? 1048576 : 524288) | (ux2Var.h(function4) ? 8388608 : 4194304) | (ux2Var.h(function5) ? 67108864 : 33554432) | (ux2Var.g(z) ? 536870912 : 268435456);
        if (ux2Var.N(i4 & 1, ((i4 & 306783379) == 306783378 && ((((((((3072 | (ux2Var.f(bl6Var) ? (char) 4 : (char) 2)) | (ux2Var.g(z2) ? ' ' : (char) 16)) | (ux2Var.h(function6) ? (char) 256 : (char) 128)) | (ux2Var.h(function8) ? (char) 16384 : (char) 8192)) | (ux2Var.h(function9) ? (char) 0 : (char) 0)) | (ux2Var.h(gl4Var) ? (char) 0 : (char) 0)) | (ux2Var.h(function10) ? (char) 0 : (char) 0)) & 306783379) == 306783378) ? false : true)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                dl5 dl5Var = new dl5(new vr1((byte) 14), (byte) 1);
                we8 we8VarA = id4.a(ux2Var);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i4;
                    i3 = 2;
                    fx1Var3 = (fx1) g57.t(w86.a.b(fx1.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var);
                }
            } else {
                ux2Var.Q();
                i2 = i4;
                i3 = 2;
                fx1Var3 = fx1Var;
            }
            ux2Var.q();
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ck3.w(ux2Var);
                ux2Var.g0(objK);
            }
            Object obj2 = (me1) objK;
            ye5 ye5VarZ = io1.z(i67.m(ux2Var));
            int i5 = ye5VarZ.a;
            ul1 ul1VarA = wu7.a(new ye5(i5 > i3 ? i3 : i5, ye5VarZ.b, ye5VarZ.c, ye5VarZ.d, ye5VarZ.e, 420.0f, ye5VarZ.g), ux2Var, 14);
            he5 he5VarI = nv1.I(null, null, null, null, null, ux2Var, 63);
            boolean z5 = ul1VarA.f().a >= 2;
            qu7 qu7VarD = ul1VarA.d();
            final boolean z6 = z5;
            yu7 yu7Var3 = qu7VarD != null ? qu7VarD.a : null;
            yu7 yu7Var4 = kh.R;
            boolean z7 = yu7Var3 == yu7Var4;
            final px4 px4VarG = g57.g(fx1Var3.f837o, ux2Var);
            px4 px4VarG2 = g57.g(fx1Var3.q, ux2Var);
            final px4 px4VarT = h57.t(function1, ux2Var);
            px4 px4VarT2 = h57.t(function2, ux2Var);
            Object objT = h57.t(function3, ux2Var);
            final px4 px4VarT3 = h57.t(function0, ux2Var);
            final px4 px4VarT4 = h57.t(function4, ux2Var);
            int i6 = i2;
            int i7 = i6 >> 24;
            Object objT2 = h57.t(function5, ux2Var);
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = h57.p(null);
                ux2Var.g0(objK2);
            }
            px4 px4Var5 = (px4) objK2;
            boolean zF = ux2Var.f(px4VarG2);
            Object objK3 = ux2Var.K();
            if (zF || objK3 == awVar) {
                objK3 = new b5(px4VarG2, (byte) 1);
                ux2Var.g0(objK3);
            }
            Function0 function13 = (Function0) objK3;
            boolean zF2 = ux2Var.f(px4VarG2);
            Object objK4 = ux2Var.K();
            if (zF2 || objK4 == awVar) {
                objK4 = new b5(px4VarG2, (byte) 2);
                ux2Var.g0(objK4);
            }
            Function0 function14 = (Function0) objK4;
            boolean zH = ux2Var.h(fx1Var3);
            fx1 fx1Var5 = fx1Var3;
            Object objK5 = ux2Var.K();
            if (zH || objK5 == awVar) {
                objK5 = new ax1(0, fx1Var5, fx1.class, "leaveEditMode", "leaveEditMode()V", 0, (byte) 2);
                ux2Var.g0(objK5);
            }
            Object objH = nv1.H(function13, function14, (Function0) ((pu3) objK5), ux2Var);
            boolean zF3 = ux2Var.f(px4VarG2) | ux2Var.h(objH);
            Object objK6 = ux2Var.K();
            if (zF3 || objK6 == awVar) {
                objK6 = new g0(objH, px4VarG2, (byte) 26);
                ux2Var.g0(objK6);
            }
            final Function1 function15 = (Function1) objK6;
            boolean zF4 = ux2Var.f(function15) | ux2Var.h(fx1Var5);
            Object objK7 = ux2Var.K();
            if (zF4 || objK7 == awVar) {
                objK7 = new n5((Object) function15, (Object) fx1Var5, (Object) px4Var5, (byte) 15);
                ux2Var.g0(objK7);
            }
            final Function0 function16 = (Function0) objK7;
            ov1 ov1Var = lr0Var.b;
            qu7 qu7VarD2 = ul1VarA.d();
            yu7 yu7Var5 = qu7VarD2 != null ? qu7VarD2.a : null;
            int iOrdinal = ov1Var.ordinal();
            Object obj3 = ea2.m;
            if (iOrdinal != 0) {
                px4Var = px4VarG2;
                if (iOrdinal != 1) {
                    obj = obj3;
                } else {
                    obj = c;
                    if (yu7Var5 != yu7Var2 && (yu7Var5 != yu7Var || !z6)) {
                        obj = obj3;
                    }
                }
            } else {
                px4Var = px4VarG2;
                Object obj4 = a;
                if (yu7Var5 == yu7Var2) {
                    obj = obj4;
                } else {
                    obj = b;
                    if (yu7Var5 == yu7Var) {
                        if (z6) {
                            obj = obj4;
                        }
                    } else if (yu7Var5 != yu7Var4 || !z6) {
                        obj = obj3;
                    }
                }
            }
            boolean zC = ul1.c(ul1VarA);
            Boolean boolValueOf = Boolean.valueOf(zC);
            if (!zC) {
                boolValueOf = null;
            }
            if (boolValueOf == null) {
                ux2Var.W(-1897115284);
                z3 = false;
                ux2Var.p(false);
                function12 = null;
            } else {
                z3 = false;
                ux2Var.W(-1897115283);
                boolean zF5 = ux2Var.f(function15) | ux2Var.h(obj2) | ux2Var.f(ul1VarA);
                Object objK8 = ux2Var.K();
                if (zF5 || objK8 == awVar) {
                    objK8 = new n5((Object) function15, obj2, (Object) ul1VarA, (byte) 16);
                    ux2Var.g0(objK8);
                }
                ux2Var.p(false);
                function12 = (Function0) objK8;
            }
            boolean zF6 = ux2Var.f(function15) | ux2Var.f(objT2) | ux2Var.h(fx1Var5) | ux2Var.f(px4VarT2) | ux2Var.h(obj2) | ux2Var.f(ul1VarA);
            Object objK9 = ux2Var.K();
            if (zF6 || objK9 == awVar) {
                objK9 = new zw1(function15, fx1Var5, obj2, objT2, px4VarT2, ul1VarA, (byte) 0);
                fx1Var4 = fx1Var5;
                px4Var2 = px4VarT2;
                ul1Var = ul1VarA;
                ux2Var.g0(objK9);
            } else {
                fx1Var4 = fx1Var5;
                px4Var2 = px4VarT2;
                ul1Var = ul1VarA;
            }
            final Function0 function17 = (Function0) objK9;
            boolean zF7 = ux2Var.f(he5VarI);
            Object objK10 = ux2Var.K();
            if (zF7 || objK10 == awVar) {
                objK10 = new zz0(he5VarI, (byte) 14);
                ux2Var.g0(objK10);
            }
            ck3.k((Function0) objK10, ux2Var);
            boolean zF8 = ux2Var.f(objT) | ux2Var.h(obj);
            Object objK11 = ux2Var.K();
            if (zF8 || objK11 == awVar) {
                hc1Var = null;
                objK11 = new i9(obj, objT, hc1Var, (byte) 9);
                ux2Var.g0(objK11);
            } else {
                hc1Var = null;
            }
            ck3.i(obj, (hw2) objK11, ux2Var);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean zH2 = ((i6 & 1879048192) == 536870912 ? true : z3) | ux2Var.h(fx1Var4) | ux2Var.h(l33Var);
            Object objK12 = ux2Var.K();
            if (zH2 || objK12 == awVar) {
                fx1 fx1Var6 = fx1Var4;
                z4 = true;
                Object oa1Var = new oa1(z, fx1Var6, l33Var, hc1Var, (byte) 12);
                fx1Var4 = fx1Var6;
                ux2Var.g0(oa1Var);
                objK12 = oa1Var;
            } else {
                z4 = true;
            }
            ck3.i(boolValueOf2, (hw2) objK12, ux2Var);
            z31 z31Var = (z31) px4Var5.getValue();
            if ((i6 & 896) != 256) {
                z4 = false;
            }
            boolean zF9 = z4 | ux2Var.f(function15) | ux2Var.f(px4Var2) | ux2Var.h(fx1Var4);
            Object objK13 = ux2Var.K();
            if (zF9 || objK13 == awVar) {
                px4 px4Var6 = px4Var2;
                px4Var3 = px4Var5;
                objK13 = new t5(px4Var3, list, function15, fx1Var4, px4Var6, (hc1) null);
                px4Var4 = px4Var6;
                ux2Var.g0(objK13);
            } else {
                px4Var4 = px4Var2;
                px4Var3 = px4Var5;
            }
            ck3.i(z31Var, (hw2) objK13, ux2Var);
            d(fx1Var4.s, ul1Var, ux2Var, 0);
            fs4 fs4VarF = fs4Var.f(androidx.compose.foundation.layout.b.c);
            ye5 ye5VarF = ul1Var.f();
            cv7 cv7VarG = ul1Var.g();
            final ul1 ul1Var2 = ul1Var;
            final px4 px4Var7 = px4Var3;
            final px4 px4Var8 = px4Var4;
            final fx1 fx1Var7 = fx1Var4;
            yy0 yy0VarO = au8.O(911067011, new iw2() { // from class: o.mw1
                @Override // o.iw2
                public final Object d(Object obj5, Object obj6, Object obj7) {
                    fx1 fx1Var8;
                    ux2 ux2Var2 = (ux2) obj6;
                    int iIntValue = ((Integer) obj7).intValue();
                    ((xu7) obj5).getClass();
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        gw1 gw1Var = (gw1) px4VarG.getValue();
                        Object objK14 = ux2Var2.K();
                        aw awVar2 = e01.a;
                        if (objK14 == awVar2) {
                            objK14 = new va(px4Var7, (byte) 13);
                            ux2Var2.g0(objK14);
                        }
                        Function1 function18 = (Function1) objK14;
                        Function1 function19 = (Function1) px4VarT.getValue();
                        Function0 function20 = (Function0) px4VarT3.getValue();
                        Function0 function21 = (Function0) px4VarT4.getValue();
                        px4 px4Var9 = px4Var8;
                        boolean zF10 = ux2Var2.f(px4Var9);
                        fx1 fx1Var9 = fx1Var7;
                        boolean zH3 = zF10 | ux2Var2.h(fx1Var9);
                        Object objK15 = ux2Var2.K();
                        if (zH3 || objK15 == awVar2) {
                            objK15 = new g0(fx1Var9, px4Var9, (byte) 25);
                            ux2Var2.g0(objK15);
                        }
                        Function1 function22 = (Function1) objK15;
                        boolean zH4 = ux2Var2.h(fx1Var9);
                        Object objK16 = ux2Var2.K();
                        if (zH4 || objK16 == awVar2) {
                            objK16 = new ew1(1, fx1Var9, fx1.class, "onContactSelect", "onContactSelect(Lcom/teamviewer/remotecontrolviewmodellib/devicetab/contacts/data/Contact;)V", 0, (byte) 1);
                            fx1Var8 = fx1Var9;
                            ux2Var2.g0(objK16);
                        } else {
                            fx1Var8 = fx1Var9;
                        }
                        Function1 function23 = (Function1) ((pu3) objK16);
                        boolean zH5 = ux2Var2.h(fx1Var8);
                        Object objK17 = ux2Var2.K();
                        if (zH5 || objK17 == awVar2) {
                            objK17 = new ew1(1, fx1Var8, fx1.class, "onEditContactSelect", "onEditContactSelect(Lcom/teamviewer/remotecontrolviewmodellib/devicetab/contacts/data/Contact;)V", 0, (byte) 2);
                            ux2Var2.g0(objK17);
                        }
                        Function1 function24 = (Function1) ((pu3) objK17);
                        boolean zH6 = ux2Var2.h(fx1Var8);
                        Object objK18 = ux2Var2.K();
                        if (zH6 || objK18 == awVar2) {
                            objK18 = new ew1(1, fx1Var8, fx1.class, "onSessionSelect", "onSessionSelect(Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSession;)V", 0, (byte) 3);
                            ux2Var2.g0(objK18);
                        }
                        Function1 function25 = (Function1) ((pu3) objK18);
                        boolean zH7 = ux2Var2.h(fx1Var8);
                        Object objK19 = ux2Var2.K();
                        if (zH7 || objK19 == awVar2) {
                            objK19 = new ew1(1, fx1Var8, fx1.class, "onEditSessionSelect", "onEditSessionSelect(Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSession;)V", 0, (byte) 4);
                            ux2Var2.g0(objK19);
                        }
                        ex1.b(gl4Var, z, z2, function17, function6, function7, function16, gw1Var, function15, function18, bl6Var, z6, lr0Var, list, l33Var, function19, function20, function21, function22, function23, function24, function25, (Function1) ((pu3) objK19), ul1Var2, function9, function8, function11, ux2Var2, 805306368);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var);
            final boolean z8 = z7;
            final Function0 function18 = function12;
            final px4 px4Var9 = px4Var;
            et1.f(ye5VarF, cv7VarG, yy0VarO, au8.O(-2002739998, new iw2() { // from class: o.lw1
                @Override // o.iw2
                public final Object d(Object obj5, Object obj6, Object obj7) {
                    Object next;
                    String strM;
                    xu7 xu7Var = (xu7) obj5;
                    ux2 ux2Var2 = (ux2) obj6;
                    int iIntValue = ((Integer) obj7).intValue();
                    xu7Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? ux2Var2.f(xu7Var) : ux2Var2.h(xu7Var) ? 4 : 2;
                    }
                    boolean zN = ux2Var2.N(iIntValue & 1, (iIntValue & 19) != 18);
                    f88 f88Var = f88.a;
                    if (!zN) {
                        ux2Var2.Q();
                        return f88Var;
                    }
                    final lr0 lr0Var2 = lr0Var;
                    ov1 ov1Var2 = lr0Var2.b;
                    ov1 ov1Var3 = ov1.n;
                    boolean z9 = z;
                    if (ov1Var2 == ov1Var3 || ov1Var2 == ov1.m || ov1Var2 == ov1.p || z9) {
                        final i97 i97Var = px4VarG;
                        if (!z9 || ((gw1) i97Var.getValue()).d != null) {
                            final l33 l33Var2 = l33Var;
                            boolean z10 = (l33Var2 != null ? l33Var2.a : null) instanceof h33;
                            final List list2 = list;
                            if (z10) {
                                strM = to7.m(ux2Var2, 2058893104, R.string.all_managed_group_label, ux2Var2, false);
                            } else {
                                ux2Var2.W(2058978943);
                                ux2Var2.p(false);
                                Iterator it = list2.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!im3.n(((l33) next).a, l33Var2 != null ? l33Var2.a : null));
                                l33 l33Var3 = (l33) next;
                                strM = l33Var3 != null ? l33Var3.b : null;
                                if (strM == null) {
                                    strM = "";
                                }
                            }
                            final String str = strM;
                            final fx1 fx1Var8 = fx1Var7;
                            final boolean z11 = z6;
                            final boolean z12 = z8;
                            final Function1 function19 = function15;
                            final Function1 function20 = function2;
                            final Function1 function21 = function8;
                            final Function0 function22 = function18;
                            final Function0 function23 = function10;
                            final Function0 function24 = function16;
                            final Function1 function25 = function9;
                            final Function1 function26 = function11;
                            final gl4 gl4Var2 = gl4Var;
                            final i97 i97Var2 = px4Var9;
                            ne5.a(xu7Var, null, null, null, null, au8.O(-1634597382, new iw2() { // from class: o.qw1
                                @Override // o.iw2
                                public final Object d(Object obj8, Object obj9, Object obj10) {
                                    ux2 ux2Var3 = (ux2) obj9;
                                    int iIntValue2 = ((Integer) obj10).intValue();
                                    ((tn) obj8).getClass();
                                    if (ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        gw1 gw1Var = (gw1) i97Var.getValue();
                                        xv1 xv1Var = (xv1) i97Var2.getValue();
                                        fx1 fx1Var9 = fx1Var8;
                                        boolean zH3 = ux2Var3.h(fx1Var9);
                                        Object objK14 = ux2Var3.K();
                                        aw awVar2 = e01.a;
                                        if (zH3 || objK14 == awVar2) {
                                            m9 m9Var = new m9(0, fx1Var9, fx1.class, "toggleEdit", "toggleEdit()V", 0, (byte) 28);
                                            ux2Var3.g0(m9Var);
                                            objK14 = m9Var;
                                        }
                                        pu3 pu3Var = (pu3) objK14;
                                        boolean zH4 = ux2Var3.h(fx1Var9);
                                        Object objK15 = ux2Var3.K();
                                        if (zH4 || objK15 == awVar2) {
                                            objK15 = new ew1(1, fx1Var9, fx1.class, "updateIsSaveEnable", "updateIsSaveEnable(Z)V", 0, (byte) 5);
                                            ux2Var3.g0(objK15);
                                        }
                                        pu3 pu3Var2 = (pu3) objK15;
                                        boolean zH5 = ux2Var3.h(fx1Var9);
                                        Object objK16 = ux2Var3.K();
                                        if (zH5 || objK16 == awVar2) {
                                            ew1 ew1Var = new ew1(1, fx1Var9, fx1.class, "updateIsSaving", "updateIsSaving(Z)V", 0, (byte) 6);
                                            ux2Var3.g0(ew1Var);
                                            objK16 = ew1Var;
                                        }
                                        pu3 pu3Var3 = (pu3) objK16;
                                        boolean zH6 = ux2Var3.h(fx1Var9);
                                        Object objK17 = ux2Var3.K();
                                        if (zH6 || objK17 == awVar2) {
                                            ew1 ew1Var2 = new ew1(1, fx1Var9, fx1.class, "updateIsErrorStateActive", "updateIsErrorStateActive(Z)V", 0, (byte) 7);
                                            ux2Var3.g0(ew1Var2);
                                            objK17 = ew1Var2;
                                        }
                                        pu3 pu3Var4 = (pu3) objK17;
                                        boolean zH7 = ux2Var3.h(fx1Var9);
                                        Object objK18 = ux2Var3.K();
                                        if (zH7 || objK18 == awVar2) {
                                            m9 m9Var2 = new m9(0, fx1Var9, fx1.class, "clearSelectedContact", "clearSelectedContact()V", 0, (byte) 29);
                                            ux2Var3.g0(m9Var2);
                                            objK18 = m9Var2;
                                        }
                                        pu3 pu3Var5 = (pu3) objK18;
                                        boolean zH8 = ux2Var3.h(fx1Var9);
                                        Object objK19 = ux2Var3.K();
                                        if (zH8 || objK19 == awVar2) {
                                            ax1 ax1Var = new ax1(0, fx1Var9, fx1.class, "clearSelectedSupportSession", "clearSelectedSupportSession()V", 0, (byte) 0);
                                            ux2Var3.g0(ax1Var);
                                            objK19 = ax1Var;
                                        }
                                        pu3 pu3Var6 = (pu3) objK19;
                                        ArrayList arrayList = new ArrayList();
                                        List list3 = list2;
                                        for (Object obj11 : list3) {
                                            if (!((l33) obj11).c) {
                                                arrayList.add(obj11);
                                            }
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            k33 k33Var = ((l33) it2.next()).a;
                                            j33 j33Var = k33Var instanceof j33 ? (j33) k33Var : null;
                                            UUID uuid = j33Var != null ? j33Var.m : null;
                                            if (uuid != null) {
                                                arrayList2.add(uuid);
                                            }
                                        }
                                        Function1 function27 = function19;
                                        boolean zF10 = ux2Var3.f(function27);
                                        l33 l33Var4 = l33Var2;
                                        boolean zH9 = zF10 | ux2Var3.h(l33Var4);
                                        Function1 function28 = function20;
                                        boolean zF11 = zH9 | ux2Var3.f(function28) | ux2Var3.h(fx1Var9);
                                        Object objK20 = ux2Var3.K();
                                        if (zF11 || objK20 == awVar2) {
                                            objK20 = new hm(function27, l33Var4, function28, fx1Var9);
                                            ux2Var3.g0(objK20);
                                        }
                                        Function1 function29 = (Function1) objK20;
                                        Function0 function30 = function23;
                                        boolean zF12 = ux2Var3.f(function30);
                                        boolean z13 = z11;
                                        boolean zG = zF12 | ux2Var3.g(z13) | ux2Var3.f(function28);
                                        Object objK21 = ux2Var3.K();
                                        if (zG || objK21 == awVar2) {
                                            objK21 = new ww1(function30, z13, function28);
                                            ux2Var3.g0(objK21);
                                        }
                                        io1.e(gw1Var, lr0Var2, l33Var4, xv1Var, z13, str, z12, function29, function21, function22, (Function0) objK21, (Function0) pu3Var5, (Function0) pu3Var6, function24, (Function0) pu3Var, (Function1) pu3Var2, (Function1) pu3Var3, (Function1) pu3Var4, function25, function26, list3, cs4.b, function27, arrayList2, gl4Var2, ux2Var3, 0);
                                    } else {
                                        ux2Var3.Q();
                                    }
                                    return f88.a;
                                }
                            }, ux2Var2), ux2Var2, (iIntValue & 14) | 1572864);
                            return f88Var;
                        }
                    }
                    return f88Var;
                }
            }, ux2Var), fs4VarF, au8.O(759580576, new sw1(lr0Var, list, z6, function18, function8, function9, fx1Var7, px4VarG, px4Var9), ux2Var), he5VarI, ux2Var, 200064, 64);
            a(ul1Var2, z, function18, function17, ux2Var, i7 & 112);
            fx1Var2 = fx1Var7;
        } else {
            ux2Var.Q();
            fx1Var2 = fx1Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(function1, list, l33Var, function2, function3, function0, function4, function5, z, bl6Var, z2, function6, function7, function8, function9, fs4Var, gl4Var, function10, function11, fx1Var2, i) { // from class: o.uw1
                public final /* synthetic */ Function1 A;
                public final /* synthetic */ Function1 B;
                public final /* synthetic */ fs4 C;
                public final /* synthetic */ gl4 D;
                public final /* synthetic */ Function0 E;
                public final /* synthetic */ Function1 F;
                public final /* synthetic */ fx1 G;
                public final /* synthetic */ Function1 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ List f2255o;
                public final /* synthetic */ l33 p;
                public final /* synthetic */ Function1 q;
                public final /* synthetic */ Function1 r;
                public final /* synthetic */ Function0 s;
                public final /* synthetic */ Function0 t;
                public final /* synthetic */ Function0 u;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ bl6 w;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ Function1 y;
                public final /* synthetic */ Function0 z;

                @Override // o.hw2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iY = yo1.Y(1);
                    ex1.c(this.m, this.n, this.f2255o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (ux2) obj5, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void d(vx6 vx6Var, ul1 ul1Var, ux2 ux2Var, int i) {
        ux2Var.Y(126742007);
        int i2 = (ux2Var.f(vx6Var) ? 4 : 2) | i | (ux2Var.f(ul1Var) ? 32 : 16);
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                objK = new oa1((Object) vx6Var, (Object) ul1Var, (hc1) null, (byte) 13);
                ux2Var.g0(objK);
            }
            ck3.i(vx6Var, (hw2) objK, ux2Var);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new c9((byte) 19, i, (Object) vx6Var, (Object) ul1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(ul1 ul1Var, jc1 jc1Var) {
        dx1 dx1Var;
        ne1 ne1Var;
        if (jc1Var instanceof dx1) {
            dx1Var = (dx1) jc1Var;
            int i = dx1Var.f662o;
            if ((i & Integer.MIN_VALUE) != 0) {
                dx1Var.f662o = i - Integer.MIN_VALUE;
            } else {
                dx1Var = new dx1(jc1Var);
            }
        } else {
            dx1Var = new dx1(jc1Var);
        }
        Object obj = dx1Var.n;
        int i2 = dx1Var.f662o;
        f88 f88Var = f88.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ul1Var = dx1Var.m;
        }
        ct1.a0(obj);
        do {
            int iE = ul1Var.e("PopLatest");
            ne1Var = ne1.m;
            if (iE < 0) {
                qu7 qu7VarD = ul1Var.d();
                yu7 yu7Var = qu7VarD != null ? qu7VarD.a : null;
                yu7 yu7Var2 = kh.P;
                if (yu7Var != yu7Var2) {
                    dx1Var.m = null;
                    dx1Var.f662o = 2;
                    if (ul1Var.i(yu7Var2, null, dx1Var) == ne1Var) {
                        break;
                    }
                }
                return f88Var;
            }
            dx1Var.m = ul1Var;
            dx1Var.f662o = 1;
        } while (ul1Var.h("PopLatest", dx1Var) != ne1Var);
        return ne1Var;
    }
}
