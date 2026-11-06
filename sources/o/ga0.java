package o;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDeviceViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ga0 {
    public static final aw0 A;
    public static final float B;
    public static final aw0 C;
    public static final float D;
    public static final aw0 E;
    public static final float F;
    public static final aw0 G;
    public static final float H;
    public static final aw0 I;
    public static final i68 J;
    public static final aw0 K;
    public static final float L;
    public static final float M;
    public static final float N;
    public static final aw0 O;
    public static final aw0 P;
    public static final aw0 Q;
    public static final aw0 R;
    public static final aw0 S;
    public static final aw0 T;
    public static final aw0 U;
    public static final aw0 V;
    public static final i68 W;
    public static final float X;
    public static final float Y;
    public static final aw0 Z;
    public static final float a0;
    public static final i68 b0;
    public static final float c0;
    public static final String[] d0;
    public static final char[] e0;
    public static String f0 = null;
    public static final aw0 g0;
    public static final aw0 h0;
    public static final yy0 i;
    public static final aw0 i0;
    public static final yy0 j;
    public static final aw0 j0;
    public static final yy0 k;
    public static final aw0 k0;
    public static final yy0 l;
    public static final aw0 l0;
    public static final yy0 m;
    public static final long[] m0;
    public static final yy0 n;
    public static final Object n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yy0 f875o;
    public static final Object o0;
    public static final yy0 p;
    public static final Object p0;
    public static final yy0 q;
    public static final Object q0;
    public static final yy0 r;
    public static final Object r0;
    public static final hr2 s;
    public static final Object s0;
    public static final hr2 t;
    public static boolean t0 = false;
    public static final hr2 u;
    public static int u0 = 0;
    public static final float v = 10.0f;
    public static final aw0 w;
    public static final ax6 x;
    public static final aw0 y;
    public static final float z;
    public static final v50 a = new v50(-1.0f);
    public static final v50 b = new v50(1.0f);
    public static final u50 c = new u50(-1.0f);
    public static final u50 d = new u50(1.0f);
    public static final e63 e = new e63(null, (byte) 0);
    public static final e63 f = new e63(null, (byte) 1);
    public static final yy0 g = new yy0(1912092171, false, new p20(18));
    public static final yy0 h = new yy0(1222260681, false, new p20(19));

    static {
        byte b2 = 9;
        i = new yy0(-117071326, false, new zy0(b2));
        byte b3 = 10;
        j = new yy0(-461987071, false, new zy0(b3));
        byte b4 = 11;
        new yy0(1854236580, false, new zy0(b4));
        k = new yy0(1739970620, false, new az0(b2));
        l = new yy0(1128701562, false, new az0(b3));
        m = new yy0(-121884267, false, new bz0((byte) 8));
        n = new yy0(-427518796, false, new bz0(b2));
        new yy0(-1134032968, false, new bz0(b3));
        f875o = new yy0(135896409, false, new fz0((byte) 13));
        p = new yy0(1444003429, false, new hz0((byte) 6));
        q = new yy0(-842488122, false, new hz0((byte) 7));
        r = new yy0(1262084966, false, new gz0((byte) 26));
        byte b5 = 14;
        s = new hr2("UNDEFINED", b5);
        t = new hr2("REUSABLE_CLAIMED", b5);
        u = new hr2("InvalidModuleNotifier", b4);
        w = aw0.D;
        x = ax6.s;
        aw0 aw0Var = aw0.t;
        y = aw0Var;
        z = 0.38f;
        A = aw0Var;
        B = 0.38f;
        C = aw0Var;
        D = 0.38f;
        E = aw0Var;
        F = 0.38f;
        G = aw0Var;
        H = 0.38f;
        I = aw0Var;
        J = i68.m;
        aw0 aw0Var2 = aw0.u;
        K = aw0Var2;
        L = 24.0f;
        M = 16.0f;
        N = 56.0f;
        O = aw0Var2;
        P = aw0.C;
        aw0 aw0Var3 = aw0.s;
        Q = aw0Var3;
        R = aw0Var3;
        S = aw0Var3;
        T = aw0Var3;
        U = aw0Var3;
        V = aw0Var2;
        W = i68.n;
        X = 88.0f;
        Y = 10.0f;
        Z = aw0Var2;
        a0 = 16.0f;
        b0 = i68.r;
        c0 = 72.0f;
        d0 = new String[]{"com.android.settings", "com.android.tv.settings", "com.android.car.settings"};
        e0 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        g0 = aw0.I;
        aw0 aw0Var4 = aw0.v;
        h0 = aw0Var4;
        i0 = aw0Var4;
        j0 = aw0Var4;
        k0 = aw0Var4;
        l0 = aw0Var4;
        m0 = new long[0];
        n0 = new Object();
        o0 = new Object();
        p0 = new Object();
        q0 = new Object();
        r0 = new Object();
        s0 = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i2, ux2 ux2Var, boolean z2) {
        int i3;
        j56 j56VarR;
        ec ecVar;
        ux2Var.Y(320823601);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (ux2Var.N(i3 & 1, (i3 & 3) != 2)) {
            Activity activity = (Activity) ux2Var.j(tc4.a);
            if (activity == null) {
                j56VarR = ux2Var.r();
                if (j56VarR == null) {
                    return;
                } else {
                    ecVar = new ec(z2, i2, b2);
                }
            } else {
                Boolean boolValueOf = Boolean.valueOf(z2);
                boolean z3 = (ux2Var.h(activity) ? 1 : 0) | ((i3 & 14) == 4 ? (byte) 1 : (byte) 0);
                Object objK = ux2Var.K();
                if (z3 != 0 || objK == e01.a) {
                    objK = new x9(b3, activity, z2);
                    ux2Var.g0(objK);
                }
                ck3.d(activity, boolValueOf, (Function1) objK, ux2Var);
            }
            j56VarR.d = ecVar;
        }
        ux2Var.Q();
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            ecVar = new ec(z2, i2, b3);
            j56VarR.d = ecVar;
        }
    }

    public static final void b(Function0 function0, fs4 fs4Var, xy6 xy6Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        xy6 xy6Var2;
        fs4 fs4Var3;
        int i3;
        xy6 xy6Var3;
        function0.getClass();
        ux2Var.Y(532171420);
        int i4 = i2 | (ux2Var.h(function0) ? 4 : 2) | 176;
        byte b2 = 0;
        if (ux2Var.N(i4 & 1, (i4 & 147) != 146)) {
            ux2Var.S();
            if ((i2 & 1) == 0 || ux2Var.x()) {
                xy6 xy6VarR = yo1.R(null, ux2Var, 6, 2);
                fs4Var3 = cs4.b;
                i3 = i4 & (-897);
                xy6Var3 = xy6VarR;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var;
                i3 = i4 & (-897);
                xy6Var3 = xy6Var;
            }
            ux2Var.q();
            fs4 fs4Var4 = fs4Var3;
            yo1.k(function0, fs4Var4, xy6Var3, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-1833346946, new k80(function0, b2), ux2Var), ux2Var, i3 & 1022, 3072, 8184);
            xy6Var2 = xy6Var3;
            fs4Var2 = fs4Var4;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6Var2 = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new l80(function0, fs4Var2, xy6Var2, i2, (byte) 0);
        }
    }

    public static final void c(int i2, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i3;
        fs4 fs4Var2;
        ux2Var.Y(-1372476819);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        byte b2 = 1;
        if (ux2Var.N(i4 & 1, (i4 & 19) != 18)) {
            fs4Var2 = cs4.b;
            fs4 fs4VarC = ka0.C(androidx.compose.foundation.layout.b.c(fs4Var2, 1.0f), 16.0f, 16.0f);
            boolean z2 = (i4 & 14) == 4;
            Object objK = ux2Var.K();
            if (z2 || objK == e01.a) {
                objK = new or(function0, b2);
                ux2Var.g0(objK);
            }
            yo1.i(0, 510, (Function1) objK, null, null, null, null, ux2Var, null, fs4VarC, null, false);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a20(function0, fs4Var2, i2, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x011d  */
    /* JADX WARN: Code duplicated, block: B:56:0x019b  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void d(int[] iArr, fs4 fs4Var, nd5 nd5Var, ux2 ux2Var, int i2, int i3) {
        nd5 nd5Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        nd5 nd5Var3;
        j56 j56VarR;
        nd5 pd5Var;
        Context context;
        boolean zH;
        Object objK;
        hc1 hc1Var;
        hw2 hw2Var;
        Context context2;
        boolean zH2;
        Object objK2;
        vv vvVarG;
        int i8;
        ux2Var.Y(-1765975966);
        int i9 = (i2 & 48) == 0 ? (ux2Var.f(fs4Var) ? 32 : 16) | i2 : i2;
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 384) == 0) {
                nd5Var2 = nd5Var;
                i9 |= ux2Var.f(nd5Var2) ? 256 : 128;
            }
            ux2Var.U(-590820570, Integer.valueOf(iArr.length));
            if (ux2Var.d(iArr.length)) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            i5 = i9 | i4;
            for (int i11 : iArr) {
                if (ux2Var.d(i11)) {
                    i8 = 4;
                } else {
                    i8 = 0;
                }
                i5 |= i8;
            }
            ux2Var.p(false);
            if ((i5 & 14) == 0) {
                i5 |= 2;
            }
            i7 = i5;
            if ((i7 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ux2Var.N(i7 & 1, z2)) {
                if (i10 != 0) {
                    pd5Var = new pd5(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    pd5Var = nd5Var2;
                }
                h72 h72Var = lh.b;
                context = (Context) ux2Var.j(h72Var);
                zH = ux2Var.h(iArr) | ux2Var.h(context);
                objK = ux2Var.K();
                hc1Var = null;
                aw awVar = e01.a;
                if (zH || objK == awVar) {
                    objK = new i9(iArr, context, hc1Var, (byte) 5);
                    ux2Var.g0(objK);
                }
                hw2Var = (hw2) objK;
                context2 = (Context) ux2Var.j(h72Var);
                zH2 = ux2Var.h(hw2Var) | ux2Var.h(context2);
                objK2 = ux2Var.K();
                if (zH2 || objK2 == awVar) {
                    objK2 = new bj((Object) hw2Var, (Object) context2, hc1Var, (byte) 9);
                    ux2Var.g0(objK2);
                }
                b84 b84Var = (b84) f57.o(null, (hw2) objK2, ux2Var).getValue();
                p74 p74Var = new p74();
                h72 h72Var2 = un4.a;
                long j2 = ((rn4) ux2Var.j(h72Var2)).a.a;
                long j3 = ((rn4) ux2Var.j(h72Var2)).a.b;
                vvVarG = qs1.G(j2, ux2Var, 0);
                h72 h72Var3 = un4.a;
                long j4 = ((rn4) ux2Var.j(h72Var3)).a.n;
                bw0.a(j4, ux2Var);
                vv vvVarG2 = qs1.G(j4, ux2Var, 2);
                if ((247 & 8) != 0) {
                    vvVarG = qs1.G(0L, ux2Var, 3);
                }
                long j5 = ((rn4) ux2Var.j(h72Var3)).a.f;
                bw0.a(((rn4) ux2Var.j(h72Var3)).a.f, ux2Var);
                nd5 nd5Var4 = pd5Var;
                qs1.o(b84Var, fs4Var, null, nd5Var4, p74Var, null, new qk1(j4, vvVarG2, vvVarG, qs1.G(j5, ux2Var, 0), j4, bw0.a(j4, ux2Var), ((rn4) ux2Var.j(h72Var3)).a.a), null, r74.n, mj4.a(((rn4) ux2Var.j(h72Var2)).a.a, ((rn4) ux2Var.j(h72Var2)).a.b, ux2Var, 134214655), null, null, null, null, ux2Var, (i7 & 112) | 817913856 | ((i7 << 3) & 7168));
                nd5Var3 = nd5Var4;
            } else {
                ux2Var.Q();
                nd5Var3 = nd5Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new am((Object) iArr, fs4Var, (Object) nd5Var3, i2, i3, (byte) 1);
            }
        }
        i9 |= 384;
        nd5Var2 = nd5Var;
        ux2Var.U(-590820570, Integer.valueOf(iArr.length));
        if (ux2Var.d(iArr.length)) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        i5 = i9 | i4;
        while (i6 < r5) {
            if (ux2Var.d(i11)) {
                i8 = 4;
            } else {
                i8 = 0;
            }
            i5 |= i8;
        }
        ux2Var.p(false);
        if ((i5 & 14) == 0) {
            i5 |= 2;
        }
        i7 = i5;
        if ((i7 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ux2Var.N(i7 & 1, z2)) {
            if (i10 != 0) {
                pd5Var = new pd5(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                pd5Var = nd5Var2;
            }
            h72 h72Var4 = lh.b;
            context = (Context) ux2Var.j(h72Var4);
            zH = ux2Var.h(iArr) | ux2Var.h(context);
            objK = ux2Var.K();
            hc1Var = null;
            aw awVar2 = e01.a;
            if (zH) {
                objK = new i9(iArr, context, hc1Var, (byte) 5);
                ux2Var.g0(objK);
            } else {
                objK = new i9(iArr, context, hc1Var, (byte) 5);
                ux2Var.g0(objK);
            }
            hw2Var = (hw2) objK;
            context2 = (Context) ux2Var.j(h72Var4);
            zH2 = ux2Var.h(hw2Var) | ux2Var.h(context2);
            objK2 = ux2Var.K();
            if (zH2) {
                objK2 = new bj((Object) hw2Var, (Object) context2, hc1Var, (byte) 9);
                ux2Var.g0(objK2);
            } else {
                objK2 = new bj((Object) hw2Var, (Object) context2, hc1Var, (byte) 9);
                ux2Var.g0(objK2);
            }
            b84 b84Var2 = (b84) f57.o(null, (hw2) objK2, ux2Var).getValue();
            p74 p74Var2 = new p74();
            h72 h72Var5 = un4.a;
            long j6 = ((rn4) ux2Var.j(h72Var5)).a.a;
            long j7 = ((rn4) ux2Var.j(h72Var5)).a.b;
            vvVarG = qs1.G(j6, ux2Var, 0);
            h72 h72Var6 = un4.a;
            long j8 = ((rn4) ux2Var.j(h72Var6)).a.n;
            bw0.a(j8, ux2Var);
            vv vvVarG3 = qs1.G(j8, ux2Var, 2);
            if ((247 & 8) != 0) {
                vvVarG = qs1.G(0L, ux2Var, 3);
            }
            long j9 = ((rn4) ux2Var.j(h72Var6)).a.f;
            bw0.a(((rn4) ux2Var.j(h72Var6)).a.f, ux2Var);
            nd5 nd5Var5 = pd5Var;
            qs1.o(b84Var2, fs4Var, null, nd5Var5, p74Var2, null, new qk1(j8, vvVarG3, vvVarG, qs1.G(j9, ux2Var, 0), j8, bw0.a(j8, ux2Var), ((rn4) ux2Var.j(h72Var6)).a.a), null, r74.n, mj4.a(((rn4) ux2Var.j(h72Var5)).a.a, ((rn4) ux2Var.j(h72Var5)).a.b, ux2Var, 134214655), null, null, null, null, ux2Var, (i7 & 112) | 817913856 | ((i7 << 3) & 7168));
            nd5Var3 = nd5Var5;
        } else {
            ux2Var.Q();
            nd5Var3 = nd5Var2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new am((Object) iArr, fs4Var, (Object) nd5Var3, i2, i3, (byte) 1);
        }
    }

    public static final void e(boolean z2, hw2 hw2Var, ux2 ux2Var, int i2) {
        ux2Var.Y(-1437916225);
        int i3 = (ux2Var.g(z2) ? 4 : 2) | i2 | (ux2Var.h(hw2Var) ? 32 : 16);
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            xo1.s(z2, hw2Var, ux2Var, i3 & 126);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new u4(z2, hw2Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.q36, o.wz0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [o.px2] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List h(k17 k17Var, Integer num, int i2, Integer num2) {
        int iD;
        int iR;
        zw4 zw4Var;
        if (k17Var.w || k17Var.o() == 0) {
            return ea2.m;
        }
        ?? q36Var = new q36(k17Var);
        if (num2 != null) {
            iD = num2.intValue();
        } else {
            iD = k17Var.v;
            if (iD < 0) {
                iD = k17Var.D(k17Var.b, i2);
            }
        }
        if (num == 0) {
            int iM = k17Var.i - k17Var.M(k17Var.b, k17Var.q(i2));
            kw4 kw4Var = k17Var.s;
            num = Integer.valueOf(iM + ((kw4Var == null || (zw4Var = (zw4) kw4Var.b(i2)) == null) ? 0 : zw4Var.b));
        }
        int iQ = k17Var.q(i2) * 5;
        int[] iArr = k17Var.b;
        if (iQ < iArr.length) {
            iR = k17Var.r(i2);
        } else {
            int iD2 = iD >= 0 ? k17Var.D(iArr, iD) : iD;
            iR = k17Var.r(iD);
            int i3 = iD;
            iD = iD2;
            i2 = i3;
        }
        while (i2 >= 0) {
            q36Var.e(iR, (k17Var.b[(k17Var.q(i2) * 5) + 1] & 536870912) != 0 ? k17Var.s(i2) : e01.a, k17Var.N(i2), num);
            num = k17Var.b(i2);
            if (iD >= 0) {
                int iD3 = k17Var.D(k17Var.b, iD);
                iR = k17Var.r(iD);
                int i4 = iD;
                iD = iD3;
                i2 = i4;
            } else {
                i2 = iD;
            }
        }
        return q36Var.m;
    }

    public static final boolean i(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = ea2.m;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    fp6 fp6Var = (fp6) obj2;
                    fp6 fp6Var2 = (fp6) obj;
                    arrayList2.add(new t65((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (fp6Var2.g().b() >> 32)) - Float.intBitsToFloat((int) (fp6Var.g().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (fp6Var2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (fp6Var.g().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((t65) lv0.m0(list)).a;
            } else {
                if (list.isEmpty()) {
                    gc4.c("Empty collection can't be reduced.");
                }
                Object objM0 = lv0.m0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        objM0 = new t65(t65.e(((t65) objM0).a, ((t65) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((t65) objM0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static Object j(List list, lg1 lg1Var, kh khVar) {
        mg1 mg1Var = new mg1((byte) 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l(it.next(), lg1Var, mg1Var, khVar);
        }
        return khVar.z();
    }

    public static final go2 k(go2 go2Var) {
        return ((go2Var instanceof j97) || (go2Var instanceof y22)) ? go2Var : new y22(go2Var);
    }

    public static void l(Object obj, lg1 lg1Var, mg1 mg1Var, kh khVar) {
        if (obj != null) {
            if (mg1Var.a.add(obj) && khVar.l(obj)) {
                Iterator it = lg1Var.d(obj).iterator();
                while (it.hasNext()) {
                    l(it.next(), lg1Var, mg1Var, khVar);
                }
                khVar.j(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case ep1.d /* 12 */:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case ep1.b /* 9 */:
                objArr[0] = "predicate";
                break;
            case ep1.c /* 10 */:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case ep1.b /* 9 */:
                objArr[2] = "ifAny";
                break;
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void m(xu4 xu4Var, ll0 ll0Var, sb0 sb0Var, float f2, lw6 lw6Var, vp7 vp7Var, v52 v52Var) {
        ArrayList arrayList = xu4Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cf5 cf5Var = (cf5) arrayList.get(i2);
            cf5Var.a.f(ll0Var, sb0Var, f2, lw6Var, vp7Var, v52Var);
            ll0Var.o(0.0f, cf5Var.a.f);
        }
    }

    public static final Integer n(g17 g17Var, n01 n01Var, int i2, int i3) {
        Integer numN;
        int[] iArr = g17Var.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (g17Var.j(i2) && g17Var.i(i2) == 206 && im3.n(g17Var.p(iArr, i2), i01.e)) {
                Object objH = g17Var.h(i2, 0);
                yx2 yx2Var = objH instanceof yx2 ? (yx2) objH : null;
                t96 t96Var = yx2Var != null ? yx2Var.a : null;
                rx2 rx2Var = t96Var instanceof rx2 ? (rx2) t96Var : null;
                if (rx2Var != null && rx2Var.m == n01Var) {
                    return Integer.valueOf(i2);
                }
            }
            if (g17Var.d(i2) && (numN = n(g17Var, n01Var, i2 + 1, i4)) != null) {
                return Integer.valueOf(numN.intValue());
            }
            i2 = i4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean q(List list, lg1 lg1Var, Function1 function1) {
        return (Boolean) j(list, lg1Var, new kg1(function1, new boolean[1], (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0067 A[EDGE_INSN: B:109:0x0067->B:22:0x0067 BREAK  A[LOOP:2: B:16:0x0049->B:20:0x005a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a A[LOOP:2: B:16:0x0049->B:20:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x0138  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    /* JADX WARN: Code duplicated, block: B:71:0x014e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0154  */
    /* JADX WARN: Code duplicated, block: B:74:0x015c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0180  */
    /* JADX WARN: Code duplicated, block: B:83:0x0189  */
    /* JADX WARN: Code duplicated, block: B:84:0x0190  */
    /* JADX WARN: Code duplicated, block: B:86:0x0198  */
    /* JADX WARN: Code duplicated, block: B:87:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a7  */
    public static fi0 r(k53 k53Var) {
        int i2;
        int length;
        int length2;
        int i3;
        String string;
        String string2;
        k53 k53Var2 = k53Var;
        int size = k53Var2.size();
        int i4 = 0;
        boolean z2 = true;
        String str = null;
        boolean z3 = false;
        boolean z4 = false;
        int iM = -1;
        int iM2 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int iM3 = -1;
        int iM4 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i4 < size) {
            String strJ = i67.j(k53Var2, i4);
            String strL = i67.l(k53Var2, i4);
            if (strJ.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strL;
                }
                i2 = 0;
                while (i2 < strL.length()) {
                    length = strL.length();
                    length2 = i2;
                    while (true) {
                        if (length2 < length) {
                            i3 = size;
                            length2 = strL.length();
                            break;
                        }
                        i3 = size;
                        if (ub7.R("=,;", strL.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i3;
                    }
                    string = ub7.x0(strL.substring(i2, length2)).toString();
                    if (length2 != strL.length() || strL.charAt(length2) == ',' || strL.charAt(length2) == ';') {
                        i2 = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = po8.a;
                        int length4 = strL.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strL.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            } else {
                                length3 = strL.length();
                                break;
                            }
                        }
                        if (length3 >= strL.length() || strL.charAt(length3) != '\"') {
                            int length5 = strL.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strL.length();
                                    break;
                                }
                                int i5 = length5;
                                if (ub7.R(",;", strL.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i5;
                            }
                            int i6 = length6;
                            string2 = ub7.x0(strL.substring(length3, length6)).toString();
                            i2 = i6;
                        } else {
                            int i7 = length3 + 1;
                            int iY = ub7.Y(strL, '\"', i7, 4);
                            string2 = strL.substring(i7, iY);
                            i2 = iY + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iM = po8.m(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iM2 = po8.m(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iM3 = po8.m(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iM4 = po8.m(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z9 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z10 = true;
                    }
                    size = i3;
                }
                i4++;
                k53Var2 = k53Var;
                size = size;
            } else {
                if (strJ.equalsIgnoreCase("Pragma")) {
                }
                i4++;
                k53Var2 = k53Var;
                size = size;
            }
            z2 = false;
            i2 = 0;
            while (i2 < strL.length()) {
                length = strL.length();
                length2 = i2;
                while (true) {
                    if (length2 < length) {
                        i3 = size;
                        length2 = strL.length();
                        break;
                    }
                    i3 = size;
                    if (ub7.R("=,;", strL.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i3;
                }
                string = ub7.x0(strL.substring(i2, length2)).toString();
                if (length2 != strL.length()) {
                    i2 = length2 + 1;
                    string2 = null;
                } else {
                    i2 = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z3 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z4 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iM = po8.m(-1, string2);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iM2 = po8.m(-1, string2);
                } else if ("private".equalsIgnoreCase(string)) {
                    z5 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z6 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z7 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iM3 = po8.m(Integer.MAX_VALUE, string2);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    iM4 = po8.m(-1, string2);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z8 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z9 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z10 = true;
                }
                size = i3;
            }
            i4++;
            k53Var2 = k53Var;
            size = size;
        }
        return new fi0(z3, z4, iM, iM2, z5, z6, z7, iM3, iM4, z8, z9, z10, !z2 ? null : str);
    }

    public static void s(MachineId machineId, boolean z2, ja3 ja3Var) {
        wt6 wt6VarC;
        String strB;
        if (z2) {
            int i2 = wt6.k;
            PListDyngateID pListDyngateIDA = machineId.a();
            String strPListDyngateID_GetAsString = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateIDA.a, pListDyngateIDA);
            strPListDyngateID_GetAsString.getClass();
            wt6VarC = vt6.c(strPListDyngateID_GetAsString);
        } else {
            MachineListElementViewModel machineListElementViewModelN = ds1.n(machineId);
            if (machineListElementViewModelN != null) {
                if (ja3Var != null) {
                    PListDyngateID pListDyngateID = new PListDyngateID(MachineListElementViewModelSWIGJNI.MachineListElementViewModel_GetDyngateID(machineListElementViewModelN.a, machineListElementViewModelN), true);
                    String strPListDyngateID_GetAsString2 = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateID.a, pListDyngateID);
                    strPListDyngateID_GetAsString2.getClass();
                    strB = ((l41) ja3Var).b(strPListDyngateID_GetAsString2);
                } else {
                    strB = null;
                }
                String strMachineListElementViewModel_GetPassword = "";
                if (strB == null) {
                    strB = "";
                }
                if (strB.length() == 0) {
                    if (MachineListElementViewModelSWIGJNI.MachineListElementViewModel_HasPasswordSet(machineListElementViewModelN.a, machineListElementViewModelN)) {
                        strMachineListElementViewModel_GetPassword = MachineListElementViewModelSWIGJNI.MachineListElementViewModel_GetPassword(machineListElementViewModelN.a, machineListElementViewModelN);
                        strMachineListElementViewModel_GetPassword.getClass();
                    }
                    strB = strMachineListElementViewModel_GetPassword;
                }
                int i3 = wt6.k;
                PListDyngateID pListDyngateID2 = new PListDyngateID(MachineListElementViewModelSWIGJNI.MachineListElementViewModel_GetDyngateID(machineListElementViewModelN.a, machineListElementViewModelN), true);
                String strPListDyngateID_GetAsString3 = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateID2.a, pListDyngateID2);
                strPListDyngateID_GetAsString3.getClass();
                wt6VarC = vt6.a(60, strPListDyngateID_GetAsString3, strB, null);
            } else {
                int i4 = wt6.k;
                PListDyngateID pListDyngateIDA2 = machineId.a();
                String strPListDyngateID_GetAsString4 = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateIDA2.a, pListDyngateIDA2);
                strPListDyngateID_GetAsString4.getClass();
                wt6VarC = vt6.a(60, strPListDyngateID_GetAsString4, null, null);
            }
        }
        if (wt6VarC == null) {
            ye4.c("ContactComputerConnector", "creating session failed");
            return;
        }
        long jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_1 = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_1(machineId.a, machineId);
        ManagedDeviceViewModel managedDeviceViewModel = jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_1 == 0 ? null : new ManagedDeviceViewModel(jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_1);
        if (managedDeviceViewModel != null) {
            xs1.b0(managedDeviceViewModel, wt6VarC);
        } else {
            ye4.a.b("EasyAccessHelper", "Machine is not a managed device");
        }
        if (!wt6VarC.c()) {
            ye4.c("Connector", "Invalid login data!");
            return;
        }
        if (wt6VarC.f) {
            bu7.MAIN.a(new jq(R.string.tv_connectingWaitForAccept, new Object[0]));
        } else {
            bu7.MAIN.a(new jq(R.string.tv_connectingPleaseWait, new Object[0]));
        }
        au6 au6Var = bt1.b;
        if (au6Var != null) {
            au6Var.h(wt6VarC);
        } else {
            im3.e0("instance");
            throw null;
        }
    }

    public static final void t(Object obj, hc1 hc1Var) {
        if (!(hc1Var instanceof a22)) {
            hc1Var.resumeWith(obj);
            return;
        }
        a22 a22Var = (a22) hc1Var;
        fe1 fe1Var = a22Var.p;
        jc1 jc1Var = a22Var.q;
        Throwable thA = tc6.a(obj);
        Object xx0Var = thA == null ? obj : new xx0(thA, false);
        if (v(fe1Var, jc1Var.getContext())) {
            a22Var.r = xx0Var;
            a22Var.f478o = 1;
            u(fe1Var, jc1Var.getContext(), a22Var);
            return;
        }
        be2 be2VarA = du7.a();
        if (be2VarA.f416o >= 4294967296L) {
            a22Var.r = xx0Var;
            a22Var.f478o = 1;
            be2VarA.P0(a22Var);
            return;
        }
        be2VarA.Q0(true);
        try {
            bp3 bp3Var = (bp3) jc1Var.getContext().l0(z06.z);
            if (bp3Var == null || bp3Var.e()) {
                Object obj2 = a22Var.s;
                de1 context = jc1Var.getContext();
                Object objY = j51.Y(context, obj2);
                t78 t78VarZ = objY != j51.y ? j51.Z(jc1Var, context, objY) : null;
                try {
                    jc1Var.resumeWith(obj);
                    if (t78VarZ == null || t78VarZ.g0()) {
                        j51.Q(context, objY);
                    }
                } catch (Throwable th) {
                    if (t78VarZ == null || t78VarZ.g0()) {
                        j51.Q(context, objY);
                    }
                    throw th;
                }
            } else {
                a22Var.resumeWith(ct1.A(bp3Var.z()));
            }
            while (be2VarA.S0()) {
            }
        } catch (Throwable th2) {
            try {
                a22Var.h(th2);
            } finally {
                be2VarA.O0(true);
            }
        }
    }

    public static final void u(fe1 fe1Var, de1 de1Var, Runnable runnable) {
        try {
            fe1Var.K0(de1Var, runnable);
        } catch (Throwable th) {
            throw new z12(th, fe1Var, de1Var);
        }
    }

    public static final boolean v(fe1 fe1Var, de1 de1Var) throws z12 {
        try {
            return fe1Var.M0(de1Var);
        } catch (Throwable th) {
            throw new z12(th, fe1Var, de1Var);
        }
    }

    public static final void w(g4 g4Var, fp6 fp6Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
        Object objG = fp6Var.k().m.g(kp6.f);
        if (objG == null) {
            objG = null;
        }
        iv0 iv0Var = (iv0) objG;
        if (iv0Var != null) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f4.b(iv0Var.a, iv0Var.b, 0).m);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = fp6Var.k().m.g(kp6.e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listI = fp6Var.i((4 & 1) != 0 ? !fp6Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i2 = 0; i2 < size; i2++) {
                fp6 fp6Var2 = (fp6) listI.get(i2);
                if (fp6Var2.k().m.c(kp6.K)) {
                    arrayList.add(fp6Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zI = i(arrayList);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f4.b(zI ? 1 : arrayList.size(), zI ? arrayList.size() : 1, 0).m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o.q36, o.wz0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList x(g17 g17Var, int i2, Integer num) {
        ?? q36Var = new q36(g17Var);
        i2 = g17Var.q(i2);
        px2 px2VarA = g17Var.a(i2);
        while (i2 >= 0) {
            q36Var.e(g17Var.i(i2), g17Var.k(i2) ? g17Var.p(g17Var.b, i2) : e01.a, g17Var.a.g(i2), num);
            if (i2 >= 0) {
                px2 px2Var = px2VarA;
                px2VarA = g17Var.a(i2);
                i2 = g17Var.q(i2);
                num = px2Var;
            } else {
                num = px2VarA;
            }
        }
        return q36Var.m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object y(de1 de1Var, Object obj, Object obj2, hw2 hw2Var, hc1 hc1Var) throws Throwable {
        zm0 zm0Var;
        Object objY;
        Object objInvoke;
        if (hc1Var instanceof zm0) {
            zm0Var = (zm0) hc1Var;
            int i2 = zm0Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zm0Var.q = i2 - Integer.MIN_VALUE;
            } else {
                zm0Var = new zm0(hc1Var);
            }
        } else {
            zm0Var = new zm0(hc1Var);
        }
        Object obj3 = zm0Var.p;
        int i3 = zm0Var.q;
        if (i3 != 0) {
            if (i3 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj4 = zm0Var.f2718o;
            de1 de1Var2 = zm0Var.n;
            try {
                ct1.a0(obj3);
                objY = obj4;
                de1Var = de1Var2;
                j51.Q(de1Var, objY);
                return obj3;
            } catch (Throwable th) {
                objY = obj4;
                de1Var = de1Var2;
                th = th;
                j51.Q(de1Var, objY);
                throw th;
            }
        }
        ct1.a0(obj3);
        objY = j51.Y(de1Var, obj2);
        try {
            zm0Var.m = obj;
            zm0Var.n = de1Var;
            zm0Var.f2718o = objY;
            zm0Var.q = 1;
            f87 f87Var = new f87(zm0Var, de1Var);
            if (hw2Var == null) {
                objInvoke = vt1.O(hw2Var, obj, f87Var);
            } else {
                e8.i(2, hw2Var);
                objInvoke = hw2Var.invoke(obj, f87Var);
            }
            obj3 = objInvoke;
            Object obj5 = ne1.m;
            if (obj3 == obj5) {
                return obj5;
            }
            j51.Q(de1Var, objY);
            return obj3;
        } catch (Throwable th2) {
            th = th2;
            j51.Q(de1Var, objY);
            throw th;
        }
    }

    public com.google.android.gms.common.internal.a f(Context context, Looper looper, io.sentry.android.core.d dVar, Object obj, tz2 tz2Var, uz2 uz2Var) {
        return g(context, looper, dVar, obj, (ap8) tz2Var, (ap8) uz2Var);
    }

    public com.google.android.gms.common.internal.a g(Context context, Looper looper, io.sentry.android.core.d dVar, Object obj, ap8 ap8Var, ap8 ap8Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract String o();

    public abstract String p();
}
