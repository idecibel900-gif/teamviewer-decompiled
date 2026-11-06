package o;

import android.os.Build;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class e45 extends rg4 implements zn4, i04 {
    public static final at4 j0 = new at4(7);
    public static final at4 k0 = new at4(8);
    public static final jd6 l0 = new jd6();
    public static final f04 m0 = new f04();
    public static final float[] n0 = wn4.a();
    public static final c45 o0 = new c45();
    public static final ju p0 = new ju(28);
    public final LayoutNode G;
    public boolean H;
    public boolean I;
    public e45 J;
    public e45 K;
    public boolean L;
    public boolean M;
    public Function1 N;
    public in1 O;
    public j04 P;
    public eo4 R;
    public vw4 S;
    public float U;
    public ix4 V;
    public f04 W;
    public v56 Y;
    public v56 Z;
    public boolean a0;
    public boolean b0;
    public l03 c0;
    public ll0 d0;
    public l64 e0;
    public final b45 f0;
    public boolean g0;
    public nc5 h0;
    public l03 i0;
    public float Q = 0.8f;
    public long T = 0;
    public pw6 X = kh.V;

    public e45(LayoutNode layoutNode) {
        this.G = layoutNode;
        this.O = layoutNode.L;
        this.P = layoutNode.M;
        v56 v56Var = v56.e;
        this.Y = v56Var;
        this.Z = v56Var;
        this.f0 = new b45(this, (byte) 1);
    }

    public static e45 w1(i04 i04Var) {
        e45 e45Var;
        ug4 ug4Var = i04Var instanceof ug4 ? (ug4) i04Var : null;
        if (ug4Var != null && (e45Var = ug4Var.m.G) != null) {
            return e45Var;
        }
        i04Var.getClass();
        return (e45) i04Var;
    }

    @Override // o.i04
    public final long A(long j) {
        if (!a1().z) {
            ki3.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((AndroidComposeView) e14.a(this.G)).q(P(j));
    }

    public final void A1(Function1 function1, boolean z) {
        Owner owner;
        xx4 xx4Var;
        Reference referencePoll;
        if (function1 != null && this.i0 != null) {
            ki3.a("layerBlock can't be provided when explicitLayer is provided");
        }
        byte b = 0;
        LayoutNode layoutNode = this.G;
        boolean z2 = (!z && this.N == function1 && im3.n(this.O, layoutNode.L) && this.P == layoutNode.M) ? false : true;
        this.O = layoutNode.L;
        this.P = layoutNode.M;
        boolean zW = layoutNode.W();
        b45 b45Var = this.f0;
        if (zW && function1 != null) {
            this.N = function1;
            if (this.h0 != null) {
                if (z2) {
                    B1(true);
                    return;
                }
                return;
            }
            Owner ownerA = e14.a(layoutNode);
            l64 l64Var = this.e0;
            if (l64Var == null) {
                l64 l64Var2 = new l64(this, new b45(this, b), (byte) 6);
                this.e0 = l64Var2;
                l64Var = l64Var2;
            }
            nc5 nc5VarF = ((AndroidComposeView) ownerA).f(l64Var, b45Var, null);
            o03 o03Var = (o03) nc5VarF;
            o03Var.e(this.f1179o);
            o03Var.d(this.T);
            this.h0 = nc5VarF;
            B1(true);
            layoutNode.V = true;
            b45Var.a();
            return;
        }
        this.N = null;
        nc5 nc5Var = this.h0;
        if (nc5Var != null) {
            o03 o03Var2 = (o03) nc5Var;
            if (!ct1.L(o03Var2.b())) {
                layoutNode.j0(this);
            }
            o03Var2.p = null;
            o03Var2.q = null;
            o03Var2.s = true;
            o03Var2.f(false);
            k03 k03Var = o03Var2.n;
            if (k03Var != null) {
                k03Var.a(o03Var2.m);
                AndroidComposeView androidComposeView = o03Var2.f1617o;
                lh7 lh7Var = androidComposeView.B0;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) lh7Var.f1364o;
                    xx4Var = (xx4) lh7Var.n;
                    referencePoll = referenceQueue.poll();
                    if (referencePoll != null) {
                        xx4Var.j(referencePoll);
                    }
                } while (referencePoll != null);
                xx4Var.b(new WeakReference(o03Var2, (ReferenceQueue) lh7Var.f1364o));
                androidComposeView.M.j(o03Var2);
            }
            this.h0 = null;
            layoutNode.V = true;
            b45Var.a();
            if (a1().z && layoutNode.X() && (owner = layoutNode.A) != null) {
                ((AndroidComposeView) owner).v(layoutNode);
            }
        }
        this.g0 = false;
    }

    public final void B1(boolean z) {
        char c;
        boolean z2;
        LayoutNode layoutNode;
        Function0 function0;
        Function0 function1;
        if (this.i0 != null) {
            return;
        }
        nc5 nc5Var = this.h0;
        Function1 function2 = this.N;
        if (nc5Var == null) {
            if (function2 == null) {
                return;
            }
            ki3.c("null layer with a non-null layerBlock");
            return;
        }
        if (function2 == null) {
            throw ua5.r("updateLayerParameters requires a non-null layerBlock");
        }
        jd6 jd6Var = l0;
        jd6Var.a();
        LayoutNode layoutNode2 = this.G;
        jd6Var.E = layoutNode2.L;
        jd6Var.F = layoutNode2.M;
        jd6Var.C = xs1.a0(this.f1179o);
        g76 g76Var = new g76();
        e14.a(layoutNode2).getSnapshotObserver().a.f(this, j0, new n5((Object) function2, (Object) this, (Object) g76Var, (byte) 22));
        f04 f04Var = this.W;
        if (f04Var == null) {
            f04Var = new f04();
            this.W = f04Var;
        }
        f04 f04Var2 = m0;
        f04Var2.getClass();
        f04Var2.a = f04Var.a;
        f04Var2.b = f04Var.b;
        f04Var2.c = f04Var.c;
        f04Var2.d = f04Var.d;
        f04Var2.e = f04Var.e;
        f04Var2.f = f04Var.f;
        f04Var2.g = f04Var.g;
        f04Var2.h = f04Var.h;
        f04Var2.i = f04Var.i;
        f04Var.a = jd6Var.n;
        f04Var.b = jd6Var.f1153o;
        f04Var.c = jd6Var.q;
        f04Var.d = jd6Var.r;
        f04Var.e = jd6Var.v;
        f04Var.f = jd6Var.w;
        f04Var.g = jd6Var.x;
        f04Var.h = jd6Var.y;
        f04Var.i = jd6Var.z;
        o03 o03Var = (o03) nc5Var;
        AndroidComposeView androidComposeView = o03Var.f1617o;
        int i = jd6Var.m | o03Var.z;
        o03Var.x = jd6Var.F;
        in1 in1Var = jd6Var.E;
        o03Var.w = in1Var;
        if ((1048576 & i) != 0) {
            l03 l03Var = o03Var.m;
            jd6Var.D.getClass();
            int iQ0 = in1Var.q0(0.0f);
            jd6Var.D.getClass();
            int iQ1 = in1Var.q0(0.0f);
            jd6Var.D.getClass();
            int iQ2 = in1Var.q0(0.0f);
            jd6Var.D.getClass();
            int iQ3 = in1Var.q0(0.0f);
            l03Var.v = iQ0;
            l03Var.w = iQ1;
            l03Var.x = iQ2;
            l03Var.y = iQ3;
            l03Var.a.u(iQ0, iQ1, iQ2, iQ3);
            o03Var.c();
        }
        int i2 = i & 4096;
        if (i2 != 0) {
            o03Var.A = jd6Var.z;
        }
        if ((i & 1) != 0) {
            l03 l03Var2 = o03Var.m;
            float f = jd6Var.n;
            n03 n03Var = l03Var2.a;
            if (n03Var.c() != f) {
                n03Var.y(f);
            }
        }
        if ((i & 2) != 0) {
            l03 l03Var3 = o03Var.m;
            float f2 = jd6Var.f1153o;
            n03 n03Var2 = l03Var3.a;
            if (n03Var2.L() != f2) {
                n03Var2.l(f2);
            }
        }
        if ((i & 4) != 0) {
            o03Var.m.f(jd6Var.p);
        }
        if ((i & 8) != 0) {
            l03 l03Var4 = o03Var.m;
            float f3 = jd6Var.q;
            n03 n03Var3 = l03Var4.a;
            if (n03Var3.A() != f3) {
                n03Var3.F(f3);
            }
        }
        if ((i & 16) != 0) {
            l03 l03Var5 = o03Var.m;
            float f4 = jd6Var.r;
            n03 n03Var4 = l03Var5.a;
            if (n03Var4.v() != f4) {
                n03Var4.f(f4);
            }
        }
        if ((i & 32) != 0) {
            l03 l03Var6 = o03Var.m;
            float f5 = jd6Var.s;
            n03 n03Var5 = l03Var6.a;
            if (n03Var5.K() != f5) {
                n03Var5.d(f5);
                l03Var6.g = true;
                l03Var6.a();
            }
            if (jd6Var.s > 0.0f && !o03Var.F && (function1 = o03Var.q) != null) {
                function1.a();
            }
        }
        if ((i & 64) != 0) {
            l03 l03Var7 = o03Var.m;
            long j = jd6Var.t;
            n03 n03Var6 = l03Var7.a;
            long jR = n03Var6.r();
            int i3 = rv0.i;
            if (!z68.a(j, jR)) {
                n03Var6.x(j);
            }
        }
        if ((i & 128) != 0) {
            l03 l03Var8 = o03Var.m;
            long j2 = jd6Var.u;
            n03 n03Var7 = l03Var8.a;
            long jW = n03Var7.w();
            int i4 = rv0.i;
            if (!z68.a(j2, jW)) {
                n03Var7.G(j2);
            }
        }
        if ((i & 1024) != 0) {
            l03 l03Var9 = o03Var.m;
            float f6 = jd6Var.x;
            n03 n03Var8 = l03Var9.a;
            if (n03Var8.p() != f6) {
                n03Var8.e(f6);
            }
        }
        if ((i & 256) != 0) {
            l03 l03Var10 = o03Var.m;
            float f7 = jd6Var.v;
            n03 n03Var9 = l03Var10.a;
            if (n03Var9.D() != f7) {
                n03Var9.M(f7);
            }
        }
        if ((i & 512) != 0) {
            l03 l03Var11 = o03Var.m;
            float f8 = jd6Var.w;
            n03 n03Var10 = l03Var11.a;
            if (n03Var10.n() != f8) {
                n03Var10.b(f8);
            }
        }
        if ((i & 2048) != 0) {
            l03 l03Var12 = o03Var.m;
            float f9 = jd6Var.y;
            n03 n03Var11 = l03Var12.a;
            if (n03Var11.z() != f9) {
                n03Var11.J(f9);
            }
        }
        if (i2 != 0) {
            c = ' ';
            boolean zA = d18.a(o03Var.A, d18.b);
            l03 l03Var13 = o03Var.m;
            if (!zA) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(d18.b(o03Var.A) * ((int) (o03Var.r >> 32)))) << 32) | (((long) Float.floatToRawIntBits(d18.c(o03Var.A) * ((int) (o03Var.r & 4294967295L)))) & 4294967295L);
                if (!t65.b(l03Var13.z, jFloatToRawIntBits)) {
                    l03Var13.z = jFloatToRawIntBits;
                    l03Var13.a.q(jFloatToRawIntBits);
                }
            } else if (!t65.b(l03Var13.z, 9205357640488583168L)) {
                l03Var13.z = 9205357640488583168L;
                l03Var13.a.q(9205357640488583168L);
            }
        } else {
            c = ' ';
        }
        if ((i & 16384) != 0) {
            l03 l03Var14 = o03Var.m;
            boolean z3 = jd6Var.B;
            if (l03Var14.A != z3) {
                l03Var14.A = z3;
                l03Var14.g = true;
                l03Var14.a();
            }
        }
        if ((131072 & i) != 0) {
            n03 n03Var12 = o03Var.m.a;
        }
        if ((262144 & i) != 0) {
            l03 l03Var15 = o03Var.m;
            tv0 tv0Var = jd6Var.G;
            n03 n03Var13 = l03Var15.a;
            if (!im3.n(n03Var13.k(), tv0Var)) {
                n03Var13.t(tv0Var);
            }
        }
        if ((524288 & i) != 0) {
            l03 l03Var16 = o03Var.m;
            byte b = jd6Var.H;
            n03 n03Var14 = l03Var16.a;
            if (n03Var14.N() != b) {
                n03Var14.h(b);
            }
        }
        if ((32768 & i) != 0) {
            n03 n03Var15 = o03Var.m.a;
            if (n03Var15.j() != 0) {
                n03Var15.E(0);
            }
        }
        if ((i & 7963) != 0) {
            o03Var.C = true;
            o03Var.D = true;
        }
        if (im3.n(o03Var.B, jd6Var.I)) {
            layoutNode2 = layoutNode2;
            g76Var = g76Var;
            z2 = false;
        } else {
            vs1 vs1Var = jd6Var.I;
            o03Var.B = vs1Var;
            if (vs1Var == null) {
                layoutNode2 = layoutNode2;
                g76Var = g76Var;
            } else {
                l03 l03Var17 = o03Var.m;
                if (vs1Var instanceof ob5) {
                    v56 v56Var = ((ob5) vs1Var).e;
                    float f10 = v56Var.a;
                    float f11 = v56Var.b;
                    l03Var17.g((((long) Float.floatToRawIntBits(f10)) << c) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), (((long) Float.floatToRawIntBits(v56Var.c - f10)) << c) | (((long) Float.floatToRawIntBits(v56Var.d - f11)) & 4294967295L), 0.0f);
                } else {
                    if (vs1Var instanceof nb5) {
                        rj rjVar = ((nb5) vs1Var).e;
                        l03Var17.k = null;
                        l03Var17.i = 9205357640488583168L;
                        l03Var17.h = 0L;
                        l03Var17.j = 0.0f;
                        l03Var17.g = true;
                        l03Var17.n = false;
                        l03Var17.l = rjVar;
                        l03Var17.a();
                    } else {
                        if (!(vs1Var instanceof pb5)) {
                            gk0.s();
                            return;
                        }
                        pb5 pb5Var = (pb5) vs1Var;
                        rj rjVar2 = pb5Var.f;
                        if (rjVar2 != null) {
                            l03Var17.k = null;
                            l03Var17.i = 9205357640488583168L;
                            l03Var17.h = 0L;
                            l03Var17.j = 0.0f;
                            l03Var17.g = true;
                            l03Var17.n = false;
                            l03Var17.l = rjVar2;
                            l03Var17.a();
                        } else {
                            lf6 lf6Var = pb5Var.e;
                            l03Var17.g((((long) Float.floatToRawIntBits(lf6Var.a)) << c) | (((long) Float.floatToRawIntBits(lf6Var.b)) & 4294967295L), (((long) Float.floatToRawIntBits(lf6Var.b())) << c) | (((long) Float.floatToRawIntBits(lf6Var.a())) & 4294967295L), Float.intBitsToFloat((int) (lf6Var.h >> c)));
                        }
                    }
                    if (Build.VERSION.SDK_INT < 33 && (((vs1Var instanceof nb5) || ((vs1Var instanceof pb5) && !xo1.T(((pb5) vs1Var).e))) && (function0 = o03Var.q) != null)) {
                        function0.a();
                    }
                }
                if (Build.VERSION.SDK_INT < 33) {
                    function0.a();
                }
            }
            z2 = true;
        }
        o03Var.z = jd6Var.m;
        if (i != 0 || z2) {
            ViewParent parent = androidComposeView.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(androidComposeView, androidComposeView);
            }
            if (AndroidComposeView.l()) {
                androidComposeView.M(0.0f);
            }
        }
        boolean z4 = this.M;
        this.M = jd6Var.B;
        this.Q = jd6Var.p;
        boolean z5 = f04Var2.a == f04Var.a && f04Var2.b == f04Var.b && f04Var2.c == f04Var.c && f04Var2.d == f04Var.d && f04Var2.e == f04Var.e && f04Var2.f == f04Var.f && f04Var2.g == f04Var.g && f04Var2.h == f04Var.h && d18.a(f04Var2.i, f04Var.i);
        if (!z || (z5 && z4 == this.M && !g76Var.m)) {
            layoutNode = layoutNode2;
        } else {
            layoutNode = layoutNode2;
            Owner owner = layoutNode.A;
            if (owner != null) {
                ((AndroidComposeView) owner).v(layoutNode);
            }
        }
        if (z5) {
            return;
        }
        layoutNode.j0(this);
        if (layoutNode.b0 > 0) {
            AndroidComposeView androidComposeView2 = (AndroidComposeView) e14.a(layoutNode);
            a65 a65Var = (a65) androidComposeView2.f0.f;
            if (layoutNode.b0 > 0) {
                ((xx4) a65Var.n).b(layoutNode);
                layoutNode.a0 = true;
            }
            androidComposeView2.F(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    public final boolean C1(long j) {
        boolean z;
        boolean z2;
        boolean zV;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        nc5 nc5Var = this.h0;
        if (nc5Var == null || !this.M) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        l03 l03Var = ((o03) nc5Var).m;
        if (l03Var.A) {
            vs1 vs1VarD = l03Var.d();
            if (vs1VarD instanceof ob5) {
                v56 v56Var = ((ob5) vs1VarD).e;
                if (v56Var.a > fIntBitsToFloat || fIntBitsToFloat >= v56Var.c || v56Var.b > fIntBitsToFloat2 || fIntBitsToFloat2 >= v56Var.d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (vs1VarD instanceof pb5) {
                lf6 lf6Var = ((pb5) vs1VarD).e;
                float f = lf6Var.a;
                long j2 = lf6Var.f;
                long j3 = lf6Var.h;
                long j4 = lf6Var.g;
                float f2 = lf6Var.d;
                float f3 = lf6Var.b;
                z = false;
                float f4 = lf6Var.c;
                z2 = true;
                long j5 = lf6Var.e;
                if (fIntBitsToFloat >= f && fIntBitsToFloat < f4 && fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f2) {
                    int i = (int) (j5 >> 32);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= lf6Var.b()) {
                        int i3 = (int) (j3 >> 32);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= lf6Var.b()) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= lf6Var.a()) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= lf6Var.a()) {
                                    float fIntBitsToFloat3 = Float.intBitsToFloat(i) + f;
                                    float fIntBitsToFloat4 = Float.intBitsToFloat(i5) + f3;
                                    float fIntBitsToFloat5 = f4 - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i7) + f3;
                                    float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat8 = f2 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat9 = f2 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat10 = Float.intBitsToFloat(i3) + f;
                                    if (fIntBitsToFloat < fIntBitsToFloat3 && fIntBitsToFloat2 < fIntBitsToFloat4) {
                                        zV = lq1.v(fIntBitsToFloat, fIntBitsToFloat2, lf6Var.e, fIntBitsToFloat3, fIntBitsToFloat4);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat10 && fIntBitsToFloat2 > fIntBitsToFloat9) {
                                        zV = lq1.v(fIntBitsToFloat, fIntBitsToFloat2, lf6Var.h, fIntBitsToFloat10, fIntBitsToFloat9);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) {
                                        zV = (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 <= fIntBitsToFloat8) ? z2 : lq1.v(fIntBitsToFloat, fIntBitsToFloat2, lf6Var.g, fIntBitsToFloat7, fIntBitsToFloat8);
                                    } else {
                                        zV = lq1.v(fIntBitsToFloat, fIntBitsToFloat2, lf6Var.f, fIntBitsToFloat5, fIntBitsToFloat6);
                                    }
                                } else {
                                    rj rjVarA = tj.a();
                                    rj.c(rjVarA, lf6Var);
                                    zV = lq1.u(fIntBitsToFloat, fIntBitsToFloat2, rjVarA);
                                }
                            } else {
                                rj rjVarA2 = tj.a();
                                rj.c(rjVarA2, lf6Var);
                                zV = lq1.u(fIntBitsToFloat, fIntBitsToFloat2, rjVarA2);
                            }
                        } else {
                            rj rjVarA3 = tj.a();
                            rj.c(rjVarA3, lf6Var);
                            zV = lq1.u(fIntBitsToFloat, fIntBitsToFloat2, rjVarA3);
                        }
                    } else {
                        rj rjVarA4 = tj.a();
                        rj.c(rjVarA4, lf6Var);
                        zV = lq1.u(fIntBitsToFloat, fIntBitsToFloat2, rjVarA4);
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(vs1VarD instanceof nb5)) {
                    gk0.s();
                    return false;
                }
                zV = lq1.u(fIntBitsToFloat, fIntBitsToFloat2, ((nb5) vs1VarD).e);
            }
            zV = z;
        } else {
            z = false;
            z2 = true;
        }
        return zV ? z2 : z;
    }

    @Override // o.i04
    public final long D(long j) {
        if (!a1().z) {
            ki3.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        i04 i04VarS = vt1.s(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) e14.a(this.G);
        androidComposeView.A();
        return z(i04VarS, t65.d(wn4.b(j, androidComposeView.l0), i04VarS.P(0L)));
    }

    @Override // o.rg4
    public final LayoutNode D0() {
        return this.G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // o.jl5, o.zn4
    public final Object E() {
        LayoutNode layoutNode = this.G;
        if (!layoutNode.S.f(64)) {
            return null;
        }
        a1();
        Object objL = null;
        for (es4 es4Var = (kn7) layoutNode.S.f; es4Var != null; es4Var = es4Var.q) {
            if ((es4Var.f737o & 64) != 0) {
                ?? L0 = es4Var;
                ?? xx4Var = 0;
                while (L0 != 0) {
                    if (L0 instanceof eg5) {
                        objL = ((eg5) L0).l(layoutNode.L, objL);
                    } else if ((L0.f737o & 64) != 0 && (L0 instanceof vm1)) {
                        es4 es4Var2 = ((vm1) L0).B;
                        int i = 0;
                        L0 = L0;
                        xx4Var = xx4Var;
                        while (es4Var2 != null) {
                            if ((es4Var2.f737o & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    xx4Var = xx4Var;
                                    L0 = es4Var2;
                                } else {
                                    if (xx4Var == 0) {
                                        xx4Var = new xx4(new es4[16]);
                                    }
                                    if (L0 != 0) {
                                        xx4Var.b(L0);
                                        L0 = 0;
                                    }
                                    xx4Var.b(es4Var2);
                                }
                            }
                            es4Var2 = es4Var2.r;
                            L0 = L0;
                            xx4Var = xx4Var;
                        }
                        if (i == 1) {
                        }
                    }
                    L0 = vn4.l0(xx4Var);
                }
            }
        }
        return objL;
    }

    @Override // o.i04
    public final i04 F() {
        boolean z = a1().z;
        LayoutNode layoutNode = this.G;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (LayoutNode layoutNodeF = layoutNode; layoutNodeF != null; layoutNodeF = layoutNodeF.F()) {
                sb.append("\n|");
                sb.append(layoutNodeF);
                sb.append(" isAttached=");
                sb.append(layoutNodeF.W());
                sb.append(" modifier=");
                sb.append(layoutNodeF.W);
                sb.append(" tail=");
                sb.append(a1());
            }
            ki3.c(sb.toString());
        }
        k1();
        return layoutNode.getOuterCoordinator$ui().K;
    }

    @Override // o.rg4
    public final eo4 F0() {
        eo4 eo4Var = this.R;
        if (eo4Var != null) {
            return eo4Var;
        }
        hk0.l("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // o.rg4
    public final rg4 I0() {
        return this.K;
    }

    @Override // o.rg4
    public final long J0() {
        return this.T;
    }

    @Override // o.i04
    public final long K(i04 i04Var, long j) {
        return z(i04Var, j);
    }

    @Override // o.i04
    public final long N(long j) {
        if (!a1().z) {
            ki3.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return z(vt1.s(this), ((AndroidComposeView) e14.a(this.G)).G(j));
    }

    @Override // o.rg4
    public final void N0() {
        l03 l03Var = this.i0;
        long j = this.T;
        if (l03Var != null) {
            e0(j, this.U, l03Var);
        } else {
            c0(j, this.U, this.N);
        }
    }

    @Override // o.i04
    public final long P(long j) {
        if (!a1().z) {
            ki3.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        k1();
        while (this != null) {
            LayoutNode layoutNode = this.G;
            if (this == layoutNode.getOuterCoordinator$ui() && !layoutNode.f13o) {
                long jB = e14.a(layoutNode).getRectManager().b(layoutNode);
                if (!vk3.a(jB, 9223372034707292159L)) {
                    return us1.L(j, jB);
                }
            }
            nc5 nc5Var = this.h0;
            if (nc5Var != null) {
                o03 o03Var = (o03) nc5Var;
                float[] fArrB = o03Var.b();
                if (!o03Var.E) {
                    j = wn4.b(j, fArrB);
                }
            }
            j = us1.L(j, this.T);
            this = this.K;
        }
        return j;
    }

    public final void P0(e45 e45Var, ix4 ix4Var, boolean z) {
        if (e45Var == this) {
            return;
        }
        e45 e45Var2 = this.K;
        if (e45Var2 != null) {
            e45Var2.P0(e45Var, ix4Var, z);
        }
        long j = this.T;
        float f = (int) (j >> 32);
        ix4Var.a -= f;
        ix4Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        ix4Var.b -= f2;
        ix4Var.d -= f2;
        nc5 nc5Var = this.h0;
        if (nc5Var != null) {
            o03 o03Var = (o03) nc5Var;
            float[] fArrA = o03Var.a();
            if (!o03Var.E) {
                if (fArrA == null) {
                    ix4Var.a = 0.0f;
                    ix4Var.b = 0.0f;
                    ix4Var.c = 0.0f;
                    ix4Var.d = 0.0f;
                } else {
                    wn4.c(fArrA, ix4Var);
                }
            }
            if (this.M && z) {
                long j2 = this.f1179o;
                ix4Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long Q0(e45 e45Var, long j) {
        if (e45Var == this) {
            return j;
        }
        e45 e45Var2 = this.K;
        return (e45Var2 == null || im3.n(e45Var, e45Var2)) ? X0(j) : X0(e45Var2.Q0(e45Var, j));
    }

    public final long R0(long j) {
        float fY;
        float fX;
        if (b1()) {
            v56 v56Var = this.Y;
            fY = v56Var.c - v56Var.a;
        } else {
            fY = Y();
        }
        if (b1()) {
            v56 v56Var2 = this.Y;
            fX = v56Var2.d - v56Var2.b;
        } else {
            fX = X();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - fY;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - fX;
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float S0(long j, long j2) {
        if (Y() >= Float.intBitsToFloat((int) (j2 >> 32)) && X() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jR0 = R0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jR0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - Y());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - X()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // o.i04
    public final void T(i04 i04Var, float[] fArr) {
        e45 e45VarW1 = w1(i04Var);
        e45VarW1.k1();
        e45 e45VarW0 = W0(e45VarW1);
        wn4.d(fArr);
        e45VarW1.z1(e45VarW0, fArr);
        y1(e45VarW0, fArr);
    }

    public final void T0(ll0 ll0Var, l03 l03Var) {
        nc5 nc5Var = this.h0;
        if (nc5Var == null) {
            long j = this.T;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            ll0Var.o(f, f2);
            U0(ll0Var, l03Var);
            ll0Var.o(-f, -f2);
            return;
        }
        o03 o03Var = (o03) nc5Var;
        nl0 nl0Var = o03Var.y;
        o03Var.g();
        o03Var.F = o03Var.m.a.K() > 0.0f;
        iu iuVar = nl0Var.n;
        iuVar.P(ll0Var);
        iuVar.p = l03Var;
        qs1.J(nl0Var, o03Var.m);
    }

    public final void U0(ll0 ll0Var, l03 l03Var) {
        e45 e45Var;
        ll0 ll0Var2;
        l03 l03Var2;
        es4 es4VarC1 = c1(4);
        if (es4VarC1 == null) {
            q1(ll0Var, l03Var);
            return;
        }
        LayoutNode layoutNode = this.G;
        layoutNode.getClass();
        d14 sharedDrawScope = e14.a(layoutNode).getSharedDrawScope();
        long jA0 = xs1.a0(this.f1179o);
        sharedDrawScope.getClass();
        xx4 xx4Var = null;
        while (es4VarC1 != null) {
            if (es4VarC1 instanceof t52) {
                e45Var = this;
                ll0Var2 = ll0Var;
                l03Var2 = l03Var;
                sharedDrawScope.b(ll0Var2, jA0, e45Var, (t52) es4VarC1, l03Var2);
            } else {
                e45Var = this;
                ll0Var2 = ll0Var;
                l03Var2 = l03Var;
                if ((es4VarC1.f737o & 4) != 0 && (es4VarC1 instanceof vm1)) {
                    int i = 0;
                    for (es4 es4Var = ((vm1) es4VarC1).B; es4Var != null; es4Var = es4Var.r) {
                        if ((es4Var.f737o & 4) != 0) {
                            i++;
                            if (i == 1) {
                                es4VarC1 = es4Var;
                            } else {
                                if (xx4Var == null) {
                                    xx4Var = new xx4(new es4[16]);
                                }
                                if (es4VarC1 != null) {
                                    xx4Var.b(es4VarC1);
                                    es4VarC1 = null;
                                }
                                xx4Var.b(es4Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                ll0Var = ll0Var2;
                this = e45Var;
                l03Var = l03Var2;
            }
            es4VarC1 = vn4.l0(xx4Var);
            ll0Var = ll0Var2;
            this = e45Var;
            l03Var = l03Var2;
        }
    }

    public abstract void V0();

    public final e45 W0(e45 e45Var) {
        LayoutNode layoutNodeF = e45Var.G;
        LayoutNode layoutNode = this.G;
        if (layoutNodeF == layoutNode) {
            es4 es4VarA1 = e45Var.a1();
            es4 es4VarA2 = a1();
            if (!es4VarA2.m.z) {
                ki3.c("visitLocalAncestors called on an unattached node");
            }
            for (es4 es4Var = es4VarA2.m.q; es4Var != null; es4Var = es4Var.q) {
                if ((es4Var.f737o & 2) != 0 && es4Var == es4VarA1) {
                    return e45Var;
                }
            }
            return this;
        }
        while (layoutNodeF.C > layoutNode.C) {
            layoutNodeF = layoutNodeF.F();
            layoutNodeF.getClass();
        }
        LayoutNode layoutNodeF2 = layoutNode;
        while (layoutNodeF2.C > layoutNodeF.C) {
            layoutNodeF2 = layoutNodeF2.F();
            layoutNodeF2.getClass();
        }
        while (layoutNodeF != layoutNodeF2) {
            layoutNodeF = layoutNodeF.F();
            layoutNodeF2 = layoutNodeF2.F();
            if (layoutNodeF == null || layoutNodeF2 == null) {
                hk0.g("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (layoutNodeF2 != layoutNode) {
            if (layoutNodeF != e45Var.G) {
                return (ti3) layoutNodeF.S.d;
            }
            return e45Var;
        }
        return this;
    }

    public final long X0(long j) {
        long j2 = this.T;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        nc5 nc5Var = this.h0;
        if (nc5Var != null) {
            o03 o03Var = (o03) nc5Var;
            float[] fArrA = o03Var.a();
            if (fArrA == null) {
                return 9187343241974906880L;
            }
            if (!o03Var.E) {
                return wn4.b(jFloatToRawIntBits, fArrA);
            }
        }
        return jFloatToRawIntBits;
    }

    public abstract tg4 Y0();

    @Override // o.in1
    public final float Z() {
        return this.G.L.Z();
    }

    public final long Z0() {
        return this.O.w0(this.G.N.d());
    }

    public abstract es4 a1();

    @Override // o.i04
    public final v56 b(i04 i04Var, boolean z) {
        if (!a1().z) {
            ki3.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!i04Var.m()) {
            ki3.c("LayoutCoordinates " + i04Var + " is not attached!");
        }
        e45 e45VarW1 = w1(i04Var);
        e45VarW1.k1();
        e45 e45VarW0 = W0(e45VarW1);
        ix4 ix4Var = this.V;
        if (ix4Var == null) {
            ix4Var = new ix4();
            this.V = ix4Var;
        }
        ix4Var.a = 0.0f;
        ix4Var.b = 0.0f;
        ix4Var.c = (int) (i04Var.j() >> 32);
        ix4Var.d = (int) (i04Var.j() & 4294967295L);
        while (e45VarW1 != e45VarW0) {
            e45VarW1.s1(ix4Var, z, false);
            if (ix4Var.b()) {
                return v56.e;
            }
            e45VarW1 = e45VarW1.K;
            e45VarW1.getClass();
        }
        P0(e45VarW0, ix4Var, z);
        return new v56(ix4Var.a, ix4Var.b, ix4Var.c, ix4Var.d);
    }

    public final boolean b1() {
        return this.a0 && !this.Y.f();
    }

    public final es4 c1(int i) {
        boolean zG = k45.g(i);
        es4 es4VarA1 = a1();
        if (!zG && (es4VarA1 = es4VarA1.q) == null) {
            return null;
        }
        for (es4 es4VarD1 = d1(zG); es4VarD1 != null && (es4VarD1.p & i) != 0; es4VarD1 = es4VarD1.r) {
            if ((es4VarD1.f737o & i) != 0) {
                return es4VarD1;
            }
            if (es4VarD1 == es4VarA1) {
                return null;
            }
        }
        return null;
    }

    public final es4 d1(boolean z) {
        es4 es4VarA1;
        LayoutNode layoutNode = this.G;
        if (layoutNode.getOuterCoordinator$ui() == this) {
            return (es4) layoutNode.S.g;
        }
        e45 e45Var = this.K;
        if (!z) {
            if (e45Var != null) {
                return e45Var.a1();
            }
            return null;
        }
        if (e45Var == null || (es4VarA1 = e45Var.a1()) == null) {
            return null;
        }
        return es4VarA1.r;
    }

    @Override // o.i04
    public final long e(long j) {
        long jP = P(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) e14.a(this.G);
        androidComposeView.A();
        return wn4.b(jP, androidComposeView.k0);
    }

    @Override // o.jl5
    public abstract void e0(long j, float f, l03 l03Var);

    public final void e1(es4 es4Var, d45 d45Var, long j, x53 x53Var, int i, boolean z) {
        if (es4Var == null) {
            h1(d45Var, j, x53Var, i, z);
            return;
        }
        if (!d45Var.q(es4Var)) {
            e1(ep1.y(es4Var, d45Var.d()), d45Var, j, x53Var, i, z);
            return;
        }
        int i2 = x53Var.f2482o;
        zw4 zw4Var = x53Var.m;
        x53Var.b(i2 + 1, zw4Var.b);
        x53Var.f2482o++;
        zw4Var.a(es4Var);
        x53Var.n.a(bt1.b(-1.0f, z, false));
        e1(ep1.y(es4Var, d45Var.d()), d45Var, j, x53Var, i, z);
        x53Var.f2482o = i2;
    }

    public final void f1(es4 es4Var, d45 d45Var, long j, x53 x53Var, int i, boolean z, float f) {
        if (es4Var == null) {
            h1(d45Var, j, x53Var, i, z);
            return;
        }
        if (!d45Var.q(es4Var)) {
            f1(ep1.y(es4Var, d45Var.d()), d45Var, j, x53Var, i, z, f);
            return;
        }
        int i2 = x53Var.f2482o;
        zw4 zw4Var = x53Var.m;
        x53Var.b(i2 + 1, zw4Var.b);
        x53Var.f2482o++;
        zw4Var.a(es4Var);
        x53Var.n.a(bt1.b(f, z, false));
        p1(ep1.y(es4Var, d45Var.d()), d45Var, j, x53Var, i, z, f, true);
        x53Var.f2482o = i2;
    }

    public final void g1(d45 d45Var, long j, x53 x53Var, int i, boolean z) {
        boolean z2;
        zw4 zw4Var = x53Var.m;
        es4 es4VarC1 = c1(d45Var.d());
        boolean z3 = false;
        if (!C1(j)) {
            if (i == 1) {
                float fS0 = S0(j, Z0());
                if ((Float.floatToRawIntBits(fS0) & Integer.MAX_VALUE) < 2139095040) {
                    if (x53Var.f2482o != zw4Var.b - 1) {
                        if (zu1.r(x53Var.a(), bt1.b(fS0, false, false)) <= 0) {
                            return;
                        }
                    }
                    f1(es4VarC1, d45Var, j, x53Var, i, false, fS0);
                    return;
                }
                return;
            }
            return;
        }
        if (es4VarC1 == null) {
            h1(d45Var, j, x53Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < Y() && fIntBitsToFloat2 < X()) {
            e1(es4VarC1, d45Var, j, x53Var, i, z);
            return;
        }
        float fS1 = i == 1 ? S0(j, Z0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fS1) & Integer.MAX_VALUE) < 2139095040) {
            if (x53Var.f2482o == zw4Var.b - 1) {
                z2 = z;
            } else {
                z2 = z;
                if (zu1.r(x53Var.a(), bt1.b(fS1, z2, false)) > 0) {
                }
            }
            z3 = true;
        } else {
            z2 = z;
        }
        p1(es4VarC1, d45Var, j, x53Var, i, z2, fS1, z3);
    }

    @Override // o.in1
    public final float getDensity() {
        return this.G.L.getDensity();
    }

    @Override // o.bm3
    public final j04 getLayoutDirection() {
        return this.G.M;
    }

    @Override // o.i04
    public final void h(float[] fArr) {
        Owner ownerA = e14.a(this.G);
        e45 e45VarW1 = w1(vt1.s(this));
        z1(e45VarW1, fArr);
        if (ownerA instanceof AndroidComposeView) {
            ((AndroidComposeView) ownerA).p(fArr);
            return;
        }
        long jA = e45VarW1.A(0L);
        if ((9223372034707292159L & jA) != 9205357640488583168L) {
            wn4.g(fArr, Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
        }
    }

    public void h1(d45 d45Var, long j, x53 x53Var, int i, boolean z) {
        e45 e45Var = this.J;
        if (e45Var != null) {
            e45Var.g1(d45Var, e45Var.X0(j), x53Var, i, z);
        }
    }

    public final void i1() {
        nc5 nc5Var = this.h0;
        if (nc5Var != null) {
            ((o03) nc5Var).c();
            return;
        }
        e45 e45Var = this.K;
        if (e45Var != null) {
            e45Var.i1();
        }
    }

    @Override // o.i04
    public final long j() {
        return this.f1179o;
    }

    public final boolean j1() {
        if (this.h0 != null && this.Q <= 0.0f) {
            return true;
        }
        e45 e45Var = this.K;
        if (e45Var != null) {
            return e45Var.j1();
        }
        return false;
    }

    public final void k1() {
        this.G.getLayoutDelegate().b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r7v7, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void l1() {
        es4 es4VarA1;
        boolean zG = k45.g(128);
        es4 es4VarD1 = d1(zG);
        if (es4VarD1 == null || (es4VarD1.m.p & 128) == 0) {
            return;
        }
        n47 n47VarC = el5.c();
        Function1 function1E = n47VarC != null ? n47VarC.e() : null;
        n47 n47VarF = el5.f(n47VarC);
        try {
            if (!zG) {
                es4VarA1 = a1().q;
                if (es4VarA1 == null) {
                }
                el5.h(n47VarC, n47VarF, function1E);
            }
            es4VarA1 = a1();
            for (es4 es4VarD2 = d1(zG); es4VarD2 != null && (es4VarD2.p & 128) != 0; es4VarD2 = es4VarD2.r) {
                if ((es4VarD2.f737o & 128) != 0) {
                    ?? L0 = es4VarD2;
                    ?? xx4Var = 0;
                    while (L0 != 0) {
                        if (L0 instanceof go4) {
                            ((go4) L0).b(this.f1179o);
                        } else if ((L0.f737o & 128) != 0 && (L0 instanceof vm1)) {
                            es4 es4Var = ((vm1) L0).B;
                            int i = 0;
                            L0 = L0;
                            xx4Var = xx4Var;
                            while (es4Var != null) {
                                if ((es4Var.f737o & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        xx4Var = xx4Var;
                                        L0 = es4Var;
                                    } else {
                                        if (xx4Var == 0) {
                                            xx4Var = new xx4(new es4[16]);
                                        }
                                        if (L0 != 0) {
                                            xx4Var.b(L0);
                                            L0 = 0;
                                        }
                                        xx4Var.b(es4Var);
                                    }
                                }
                                es4Var = es4Var.r;
                                L0 = L0;
                                xx4Var = xx4Var;
                            }
                            if (i == 1) {
                            }
                        }
                        L0 = vn4.l0(xx4Var);
                    }
                }
                if (es4VarD2 == es4VarA1) {
                    break;
                }
            }
            el5.h(n47VarC, n47VarF, function1E);
        } catch (Throwable th) {
            el5.h(n47VarC, n47VarF, function1E);
            throw th;
        }
    }

    @Override // o.i04
    public final boolean m() {
        return a1().z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void m1() {
        boolean zG = k45.g(4194304);
        es4 es4VarA1 = a1();
        if (!zG && (es4VarA1 = es4VarA1.q) == null) {
            return;
        }
        for (es4 es4VarD1 = d1(zG); es4VarD1 != null && (es4VarD1.p & 4194304) != 0; es4VarD1 = es4VarD1.r) {
            if ((es4VarD1.f737o & 4194304) != 0) {
                ?? L0 = es4VarD1;
                ?? xx4Var = 0;
                while (L0 != 0) {
                    if (L0 instanceof g04) {
                        ((g04) L0).Y(this);
                    } else if ((L0.f737o & 4194304) != 0 && (L0 instanceof vm1)) {
                        es4 es4Var = ((vm1) L0).B;
                        int i = 0;
                        L0 = L0;
                        xx4Var = xx4Var;
                        while (es4Var != null) {
                            if ((es4Var.f737o & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    xx4Var = xx4Var;
                                    L0 = es4Var;
                                } else {
                                    if (xx4Var == 0) {
                                        xx4Var = new xx4(new es4[16]);
                                    }
                                    if (L0 != 0) {
                                        xx4Var.b(L0);
                                        L0 = 0;
                                    }
                                    xx4Var.b(es4Var);
                                }
                            }
                            es4Var = es4Var.r;
                            L0 = L0;
                            xx4Var = xx4Var;
                        }
                        if (i == 1) {
                        }
                    }
                    L0 = vn4.l0(xx4Var);
                }
            }
            if (es4VarD1 == es4VarA1) {
                return;
            }
        }
    }

    public final void n1() {
        this.L = true;
        this.f0.a();
        t1();
        if (vk3.a(this.T, 0L)) {
            return;
        }
        this.G.j0(this);
    }

    public final void o1() {
        boolean zG = k45.g(1048576);
        es4 es4VarD1 = d1(zG);
        if (es4VarD1 == null || (es4VarD1.m.p & 1048576) == 0) {
            return;
        }
        es4 es4VarA1 = a1();
        if (!zG && (es4VarA1 = es4VarA1.q) == null) {
            return;
        }
        for (es4 es4VarD2 = d1(zG); es4VarD2 != null && (es4VarD2.p & 1048576) != 0; es4VarD2 = es4VarD2.r) {
            if ((es4VarD2.f737o & 1048576) != 0) {
                es4 es4VarL0 = es4VarD2;
                xx4 xx4Var = null;
                while (es4VarL0 != null) {
                    if (es4VarL0 instanceof br2) {
                    } else if ((es4VarL0.f737o & 1048576) != 0 && (es4VarL0 instanceof vm1)) {
                        int i = 0;
                        for (es4 es4Var = ((vm1) es4VarL0).B; es4Var != null; es4Var = es4Var.r) {
                            if ((es4Var.f737o & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    es4VarL0 = es4Var;
                                } else {
                                    if (xx4Var == null) {
                                        xx4Var = new xx4(new es4[16]);
                                    }
                                    if (es4VarL0 != null) {
                                        xx4Var.b(es4VarL0);
                                        es4VarL0 = null;
                                    }
                                    xx4Var.b(es4Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    es4VarL0 = vn4.l0(xx4Var);
                }
            }
            if (es4VarD2 == es4VarA1) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01d7 A[PHI: r3
      0x01d7: PHI (r3v18 ??) = (r3v1 ??), (r3v1 ??), (r3v20 ??) binds: [B:58:0x01a1, B:60:0x01a5, B:74:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r2v22, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r4v13 */
    public final void p1(es4 es4Var, d45 d45Var, long j, x53 x53Var, int i, boolean z, float f, boolean z2) {
        char c;
        int i2;
        ?? L0;
        zw4 zw4Var = x53Var.m;
        if (es4Var == null) {
            h1(d45Var, j, x53Var, i, z);
            return;
        }
        if (!d45Var.q(es4Var)) {
            p1(ep1.y(es4Var, d45Var.d()), d45Var, j, x53Var, i, z, f, z2);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            ?? r2 = es4Var;
            ?? xx4Var = 0;
            while (r2 != 0) {
                if (r2 instanceof ln5) {
                    long jM = ((ln5) r2).m();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    LayoutNode layoutNode = this.G;
                    j04 j04Var = layoutNode.M;
                    int i5 = q08.b;
                    long j2 = Long.MIN_VALUE & jM;
                    j04 j04Var2 = j04.m;
                    if (j2 == 0 || j04Var == j04Var2) {
                        c = 30;
                        i2 = (int) jM;
                    } else {
                        c = 30;
                        i2 = (int) (jM >> 30);
                    }
                    if (fIntBitsToFloat < (-(i2 & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= Y() + (((j2 == 0 || layoutNode.M == j04Var2) ? (int) (jM >> c) : (int) jM) & 32767)) {
                        break;
                    }
                    int i6 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i6) < (-(((int) (jM >> 15)) & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i6) >= (((int) (jM >> 45)) & 32767) + X()) {
                        break;
                    }
                    ow4 ow4Var = x53Var.n;
                    int i7 = x53Var.f2482o;
                    int i8 = zw4Var.b;
                    if (i7 == i8 - 1) {
                        x53Var.b(i7 + 1, i8);
                        x53Var.f2482o++;
                        zw4Var.a(es4Var);
                        ow4Var.a(bt1.b(0.0f, z, true));
                        p1(ep1.y(es4Var, d45Var.d()), d45Var, j, x53Var, i3, z, f, z2);
                        x53Var.f2482o = i7;
                        return;
                    }
                    long jA = x53Var.a();
                    int i9 = x53Var.f2482o;
                    if (!zu1.z(jA)) {
                        if (zu1.w(jA) > 0.0f) {
                            int i10 = x53Var.f2482o;
                            x53Var.b(i10 + 1, zw4Var.b);
                            x53Var.f2482o++;
                            zw4Var.a(es4Var);
                            ow4Var.a(bt1.b(0.0f, z, true));
                            p1(ep1.y(es4Var, d45Var.d()), d45Var, j, x53Var, i, z, f, z2);
                            x53Var.f2482o = i10;
                            return;
                        }
                        return;
                    }
                    int i11 = zw4Var.b;
                    int i12 = i11 - 1;
                    x53Var.f2482o = i12;
                    x53Var.b(i11, zw4Var.b);
                    x53Var.f2482o++;
                    zw4Var.a(es4Var);
                    ow4Var.a(bt1.b(0.0f, z, true));
                    p1(ep1.y(es4Var, d45Var.d()), d45Var, j, x53Var, i, z, f, z2);
                    x53Var.f2482o = i12;
                    if (zu1.w(x53Var.a()) < 0.0f) {
                        x53Var.b(i9 + 1, x53Var.f2482o + 1);
                    }
                    x53Var.f2482o = i9;
                    return;
                }
                if ((r2.f737o & 16) == 0 || !(r2 instanceof vm1)) {
                    L0 = r2;
                    xx4Var = xx4Var;
                    L0 = vn4.l0(xx4Var);
                } else {
                    es4 es4Var2 = ((vm1) r2).B;
                    int i13 = 0;
                    while (es4Var2 != null) {
                        if ((es4Var2.f737o & 16) != 0) {
                            i13++;
                            if (i13 == 1) {
                                L0 = r2;
                                xx4Var = xx4Var;
                                xx4Var = xx4Var;
                                L0 = es4Var2;
                            } else {
                                if (xx4Var == 0) {
                                    xx4Var = new xx4(new es4[16]);
                                }
                                if (L0 != 0) {
                                    xx4Var.b(L0);
                                    L0 = 0;
                                }
                                xx4Var.b(es4Var2);
                            }
                        } else {
                            L0 = r2;
                            xx4Var = xx4Var;
                        }
                        es4Var2 = es4Var2.r;
                        L0 = L0;
                        xx4Var = xx4Var;
                    }
                    if (i13 == 1) {
                        L0 = r2;
                        xx4Var = xx4Var;
                    } else {
                        L0 = r2;
                        xx4Var = xx4Var;
                        L0 = vn4.l0(xx4Var);
                    }
                }
                i3 = i;
                r2 = L0;
                xx4Var = xx4Var;
            }
        }
        if (z2) {
            f1(es4Var, d45Var, j, x53Var, i, z, f);
        } else {
            v1(es4Var, d45Var, j, x53Var, i, z, f);
        }
    }

    public void q1(ll0 ll0Var, l03 l03Var) {
        LayoutNode layoutNode = this.G;
        Owner ownerA = e14.a(layoutNode);
        xx4 xx4VarK = layoutNode.K();
        Object[] objArr = xx4VarK.m;
        int i = xx4VarK.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.X()) {
                layoutNode2.k(ll0Var, l03Var);
            }
        }
        if (ownerA.getShowLayoutBounds()) {
            gy8 gy8Var = ti3.s0;
            long j = this.f1179o;
            ll0Var.q(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, gy8Var);
        }
    }

    public final void r1(long j, float f, Function1 function1, l03 l03Var) {
        byte b = 0;
        LayoutNode layoutNode = this.G;
        if (l03Var != null) {
            if (function1 != null) {
                ki3.a("both ways to create layers shouldn't be used together");
            }
            if (this.i0 != l03Var) {
                this.i0 = null;
                A1(null, false);
                this.i0 = l03Var;
            }
            if (this.h0 == null) {
                Owner ownerA = e14.a(layoutNode);
                l64 l64Var = this.e0;
                if (l64Var == null) {
                    l64 l64Var2 = new l64(this, new b45(this, b), (byte) 6);
                    this.e0 = l64Var2;
                    l64Var = l64Var2;
                }
                b45 b45Var = this.f0;
                nc5 nc5VarF = ((AndroidComposeView) ownerA).f(l64Var, b45Var, l03Var);
                o03 o03Var = (o03) nc5VarF;
                o03Var.e(this.f1179o);
                o03Var.d(j);
                this.h0 = nc5VarF;
                layoutNode.V = true;
                b45Var.a();
            }
        } else {
            if (this.i0 != null) {
                this.i0 = null;
                A1(null, false);
            }
            A1(function1, false);
        }
        if (!vk3.a(this.T, j)) {
            ((AndroidComposeView) e14.a(layoutNode)).M(-4.0f);
            this.T = j;
            nc5 nc5Var = this.h0;
            if (nc5Var != null) {
                ((o03) nc5Var).d(j);
            } else {
                e45 e45Var = this.K;
                if (e45Var != null) {
                    e45Var.i1();
                }
            }
            layoutNode.j0(this);
            rg4.L0(this);
            Owner owner = layoutNode.A;
            if (owner != null) {
                ((AndroidComposeView) owner).v(layoutNode);
            }
        }
        this.U = f;
        if (this == layoutNode.getOuterCoordinator$ui()) {
            e14.a(layoutNode).getRectManager().g(layoutNode);
        }
        if (this.A) {
            return;
        }
        u0(F0());
    }

    @Override // o.rg4, o.oc5
    public final boolean s() {
        return (this.h0 == null || this.L || !this.G.W()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    public final void s1(ix4 ix4Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        nc5 nc5Var = this.h0;
        if (nc5Var != null) {
            if (this.M) {
                if (z2) {
                    long jZ0 = Z0();
                    float f = ix4Var.a;
                    float f2 = ix4Var.b;
                    if (ix4Var.c >= 0.0f) {
                        long j = this.f1179o;
                        if (f > ((int) (j >> 32)) || ix4Var.d < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jZ0 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jZ0 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (ix4Var.c - ix4Var.a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (ix4Var.d - ix4Var.b)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.f1179o;
                    float f7 = (int) (j2 >> 32);
                    int i = (int) (jZ0 >> 32);
                    float f8 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jZ0 & 4294967295L);
                    ix4Var.a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.f1179o;
                    ix4Var.a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (ix4Var.b()) {
                    return;
                }
            }
            o03 o03Var = (o03) nc5Var;
            float[] fArrB = o03Var.b();
            if (!o03Var.E) {
                if (fArrB == null) {
                    ix4Var.a = 0.0f;
                    ix4Var.b = 0.0f;
                    ix4Var.c = 0.0f;
                    ix4Var.d = 0.0f;
                } else {
                    wn4.c(fArrB, ix4Var);
                }
            }
        }
        long j4 = this.T;
        float f9 = (int) (j4 >> 32);
        ix4Var.a += f9;
        ix4Var.c += f9;
        float f10 = (int) (j4 & 4294967295L);
        ix4Var.b += f10;
        ix4Var.d += f10;
    }

    public final void t1() {
        if (this.h0 != null) {
            if (this.i0 != null) {
                this.i0 = null;
            }
            A1(null, false);
            this.G.t0(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [o.xx4] */
    public final void u1(eo4 eo4Var) {
        e45 e45Var;
        eo4 eo4Var2 = this.R;
        if (eo4Var != eo4Var2) {
            this.R = eo4Var;
            LayoutNode layoutNode = this.G;
            int i = 0;
            if (eo4Var2 == null || eo4Var.b() != eo4Var2.b() || eo4Var.a() != eo4Var2.a()) {
                int iB = eo4Var.b();
                int iA = eo4Var.a();
                nc5 nc5Var = this.h0;
                if (nc5Var != null) {
                    ((o03) nc5Var).e((((long) iB) << 32) | (((long) iA) & 4294967295L));
                } else if (layoutNode.X() && (e45Var = this.K) != null) {
                    e45Var.i1();
                }
                f0((((long) iA) & 4294967295L) | (((long) iB) << 32));
                if (this.N != null) {
                    B1(false);
                }
                boolean zG = k45.g(4);
                es4 es4VarA1 = a1();
                if (zG || (es4VarA1 = es4VarA1.q) != null) {
                    for (es4 es4VarD1 = d1(zG); es4VarD1 != null && (es4VarD1.p & 4) != 0; es4VarD1 = es4VarD1.r) {
                        if ((es4VarD1.f737o & 4) != 0) {
                            ?? L0 = es4VarD1;
                            ?? xx4Var = 0;
                            while (L0 != 0) {
                                if (L0 instanceof t52) {
                                    ((t52) L0).K();
                                } else if ((L0.f737o & 4) != 0 && (L0 instanceof vm1)) {
                                    es4 es4Var = ((vm1) L0).B;
                                    int i2 = 0;
                                    L0 = L0;
                                    xx4Var = xx4Var;
                                    while (es4Var != null) {
                                        if ((es4Var.f737o & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                xx4Var = xx4Var;
                                                L0 = es4Var;
                                            } else {
                                                if (xx4Var == 0) {
                                                    xx4Var = new xx4(new es4[16]);
                                                }
                                                if (L0 != 0) {
                                                    xx4Var.b(L0);
                                                    L0 = 0;
                                                }
                                                xx4Var.b(es4Var);
                                            }
                                        }
                                        es4Var = es4Var.r;
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                L0 = vn4.l0(xx4Var);
                            }
                        }
                        if (es4VarD1 == es4VarA1) {
                            break;
                        }
                    }
                }
                Owner owner = layoutNode.A;
                if (owner != null) {
                    ((AndroidComposeView) owner).v(layoutNode);
                }
                layoutNode.j0(this);
            }
            vw4 vw4Var = this.S;
            if ((vw4Var == null || vw4Var.e == 0) && eo4Var.c().isEmpty()) {
                return;
            }
            vw4 vw4Var2 = this.S;
            Map mapC = eo4Var.c();
            if (vw4Var2 != null && vw4Var2.e == mapC.size()) {
                Object[] objArr = vw4Var2.b;
                int[] iArr = vw4Var2.c;
                long[] jArr = vw4Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapC.get((ie) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            layoutNode.getLayoutDelegate().p.K.f();
            vw4 vw4Var3 = this.S;
            if (vw4Var3 == null) {
                vw4 vw4Var4 = h65.a;
                vw4Var3 = new vw4();
                this.S = vw4Var3;
            }
            vw4Var3.a();
            for (Map.Entry entry : eo4Var.c().entrySet()) {
                vw4Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // o.rg4
    public final rg4 v0() {
        return this.J;
    }

    public final void v1(es4 es4Var, d45 d45Var, long j, x53 x53Var, int i, boolean z, float f) {
        int i2;
        zw4 zw4Var = x53Var.m;
        if (es4Var == null) {
            h1(d45Var, j, x53Var, i, z);
            return;
        }
        if (!d45Var.q(es4Var)) {
            v1(ep1.y(es4Var, d45Var.d()), d45Var, j, x53Var, i, z, f);
            return;
        }
        if (!d45Var.c(es4Var)) {
            p1(ep1.y(es4Var, d45Var.d()), d45Var, j, x53Var, i, z, f, false);
            return;
        }
        ow4 ow4Var = x53Var.n;
        int i3 = x53Var.f2482o;
        int i4 = zw4Var.b;
        if (i3 != i4 - 1) {
            long jA = x53Var.a();
            int i5 = x53Var.f2482o;
            int i6 = zw4Var.b;
            int i7 = i6 - 1;
            x53Var.f2482o = i7;
            x53Var.b(i6, zw4Var.b);
            x53Var.f2482o++;
            zw4Var.a(es4Var);
            ow4Var.a(bt1.b(f, z, false));
            p1(ep1.y(es4Var, d45Var.d()), d45Var, j, x53Var, i, z, f, false);
            x53Var.f2482o = i7;
            long jA2 = x53Var.a();
            if (x53Var.f2482o + 1 >= zw4Var.b - 1 || zu1.r(jA, jA2) <= 0) {
                x53Var.b(x53Var.f2482o + 1, zw4Var.b);
            } else {
                int i8 = i5 + 1;
                boolean z2 = zu1.z(jA2);
                int i9 = x53Var.f2482o;
                x53Var.b(i8, z2 ? i9 + 2 : i9 + 1);
            }
            x53Var.f2482o = i5;
            return;
        }
        int i10 = i3 + 1;
        x53Var.b(i10, i4);
        x53Var.f2482o++;
        zw4Var.a(es4Var);
        ow4Var.a(bt1.b(f, z, false));
        p1(ep1.y(es4Var, d45Var.d()), d45Var, j, x53Var, i, z, f, false);
        x53Var.f2482o = i3;
        if (i10 == zw4Var.b - 1 || zu1.z(x53Var.a())) {
            int i11 = x53Var.f2482o;
            int i12 = i11 + 1;
            zw4Var.k(i12);
            if (i12 < 0 || i12 >= (i2 = ow4Var.b)) {
                hk0.r("Index must be between 0 and size");
                return;
            }
            long[] jArr = ow4Var.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                cx.H0(jArr, jArr, i12, i11 + 2, i2);
            }
            ow4Var.b--;
        }
    }

    @Override // o.rg4
    public final i04 x0() {
        return this;
    }

    public final v56 x1() {
        if (a1().z) {
            i04 i04VarS = vt1.s(this);
            ix4 ix4Var = this.V;
            if (ix4Var == null) {
                ix4Var = new ix4();
                this.V = ix4Var;
            }
            long jR0 = R0(Z0());
            float f = b1() ? this.Y.a : 0.0f;
            float f2 = b1() ? this.Y.b : 0.0f;
            float fY = b1() ? this.Y.c : Y();
            float fX = b1() ? this.Y.d : X();
            int i = (int) (jR0 >> 32);
            ix4Var.a = f - Float.intBitsToFloat(i);
            int i2 = (int) (jR0 & 4294967295L);
            ix4Var.b = f2 - Float.intBitsToFloat(i2);
            ix4Var.c = Float.intBitsToFloat(i) + fY;
            ix4Var.d = Float.intBitsToFloat(i2) + fX;
            while (this != i04VarS) {
                this.s1(ix4Var, false, true);
                if (!ix4Var.b()) {
                    this = this.K;
                    this.getClass();
                }
            }
            return new v56(ix4Var.a, ix4Var.b, ix4Var.c, ix4Var.d);
        }
        return v56.e;
    }

    public final void y1(e45 e45Var, float[] fArr) {
        float[] fArrA;
        if (im3.n(e45Var, this)) {
            return;
        }
        e45 e45Var2 = this.K;
        e45Var2.getClass();
        e45Var2.y1(e45Var, fArr);
        if (!vk3.a(this.T, 0L)) {
            float[] fArr2 = n0;
            wn4.d(fArr2);
            long j = this.T;
            wn4.g(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            wn4.f(fArr, fArr2);
        }
        nc5 nc5Var = this.h0;
        if (nc5Var == null || (fArrA = ((o03) nc5Var).a()) == null) {
            return;
        }
        wn4.f(fArr, fArrA);
    }

    @Override // o.i04
    public final long z(i04 i04Var, long j) {
        if (i04Var instanceof ug4) {
            ug4 ug4Var = (ug4) i04Var;
            ug4Var.m.G.k1();
            return ug4Var.z(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        e45 e45VarW1 = w1(i04Var);
        e45VarW1.k1();
        e45 e45VarW0 = W0(e45VarW1);
        while (e45VarW1 != e45VarW0) {
            nc5 nc5Var = e45VarW1.h0;
            if (nc5Var != null) {
                o03 o03Var = (o03) nc5Var;
                float[] fArrB = o03Var.b();
                if (!o03Var.E) {
                    j = wn4.b(j, fArrB);
                }
            }
            j = us1.L(j, e45VarW1.T);
            e45VarW1 = e45VarW1.K;
            e45VarW1.getClass();
        }
        return Q0(e45VarW0, j);
    }

    @Override // o.rg4
    public final boolean z0() {
        return this.R != null;
    }

    public final void z1(e45 e45Var, float[] fArr) {
        while (!this.equals(e45Var)) {
            nc5 nc5Var = this.h0;
            if (nc5Var != null) {
                wn4.f(fArr, ((o03) nc5Var).b());
            }
            long j = this.T;
            if (!vk3.a(j, 0L)) {
                float[] fArr2 = n0;
                wn4.d(fArr2);
                wn4.g(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                wn4.f(fArr, fArr2);
            }
            this = this.K;
            this.getClass();
        }
    }
}
