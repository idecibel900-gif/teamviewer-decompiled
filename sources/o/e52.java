package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class e52 extends vm1 implements ln5, mh3, v01, l52 {
    public gb5 C;
    public Function1 D;
    public boolean E;
    public mw4 F;
    public kf0 G;
    public g52 H;
    public boolean I;
    public boolean J;
    public j42 K;
    public long L = 0;
    public az2 M;
    public az2 N;
    public m42 O;
    public l42 P;
    public k42 Q;
    public xo1 R;
    public l07 S;
    public je0 T;
    public lh3 U;

    public e52(Function1 function1, boolean z, mw4 mw4Var, gb5 gb5Var) {
        this.C = gb5Var;
        this.D = function1;
        this.E = z;
        this.F = mw4Var;
    }

    public static void b1(e52 e52Var, in5 in5Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        l42 l42Var = e52Var.P;
        if (l42Var == null) {
            l42Var = new l42();
            l42Var.f = null;
            l42Var.g = Long.MAX_VALUE;
            l42Var.h = false;
            e52Var.P = l42Var;
        }
        l42Var.f = in5Var;
        l42Var.g = j;
        je0 je0Var = e52Var.T;
        gb5 gb5Var = e52Var.C;
        if (je0Var == null) {
            e52Var.T = new je0(gb5Var);
        } else {
            je0Var.f1154o = gb5Var;
            je0Var.n = j2;
        }
        l42Var.h = false;
        e52Var.R = l42Var;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01a7  */
    @Override // o.ln5
    public void D0(bn5 bn5Var, cn5 cn5Var, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        Object obj4;
        Object obj5;
        j42 j42Var;
        boolean z2 = true;
        this.J = true;
        if (this.E) {
            if (this.M == null) {
                az2 az2Var = new az2(this);
                U0(az2Var);
                this.M = az2Var;
            }
            xo1 xo1Var = this.R;
            Object obj6 = xo1Var;
            if (xo1Var == null) {
                j42 j42Var2 = this.K;
                if (j42Var2 == null) {
                    j42Var = j42Var2;
                    j42 j42Var3 = new j42();
                    j42Var3.f = i42.f1034o;
                    j42Var3.g = false;
                    j42Var3.h = false;
                    this.K = j42Var3;
                    j42Var = j42Var3;
                }
                j42Var = j42Var2;
                this.R = j42Var;
                obj6 = j42Var;
            }
            boolean z3 = obj6 instanceof j42;
            cn5 cn5Var2 = cn5.m;
            cn5 cn5Var3 = cn5.n;
            if (z3) {
                j42 j42Var4 = (j42) obj6;
                if (!bn5Var.a.isEmpty() && un7.e(bn5Var, false)) {
                    in5 in5Var = (in5) lv0.m0(bn5Var.a);
                    int i = a52.a[j42Var4.f.ordinal()];
                    i42 i42Var = i42.n;
                    i42 i42Var2 = i42.m;
                    i42 i42Var3 = i == 1 ? !m1() ? i42Var2 : i42Var : j42Var4.f;
                    j42Var4.f = i42Var3;
                    if (cn5Var == cn5Var2) {
                        if (i42Var3 == i42Var) {
                            in5Var.a();
                            j42Var4.g = true;
                        }
                        j42Var4.h = true;
                    }
                    if (cn5Var == cn5Var3) {
                        if (i42Var3 == i42Var2) {
                            b1(this, in5Var, in5Var.a, 0L, 12);
                            return;
                        }
                        if (j42Var4.g) {
                            l1(in5Var, in5Var, 0L);
                            k1(0L, in5Var);
                            long j2 = in5Var.a;
                            m42 m42Var = this.O;
                            if (m42Var == null) {
                                m42Var = new m42();
                                m42Var.f = Long.MAX_VALUE;
                                this.O = m42Var;
                            }
                            m42Var.f = j2;
                            this.R = m42Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z4 = obj6 instanceof l42;
            cn5 cn5Var4 = cn5.f544o;
            if (!z4) {
                if (obj6 instanceof k42) {
                    k42 k42Var = (k42) obj6;
                    if (cn5Var != cn5Var4) {
                        return;
                    }
                    List list = bn5Var.a;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((in5) list.get(i2)).c()) {
                            z2 = false;
                            break;
                        }
                    }
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (((in5) list.get(i3)).d) {
                            if (list.isEmpty()) {
                                break;
                            }
                            if (z2) {
                                long j3 = ((in5) lv0.m0(list)).c;
                                in5 in5Var2 = k42Var.f;
                                in5Var2.getClass();
                                long jD = t65.d(j3, in5Var2.c);
                                in5 in5Var3 = k42Var.f;
                                if (in5Var3 != null) {
                                    b1(this, in5Var3, k42Var.g, jD, 8);
                                    return;
                                } else {
                                    hk0.g("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    Z0();
                    return;
                }
                if (!(obj6 instanceof m42)) {
                    gk0.s();
                    return;
                }
                m42 m42Var2 = (m42) obj6;
                if (cn5Var != cn5Var3) {
                    return;
                }
                long j4 = m42Var2.f;
                List list2 = bn5Var.a;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list2.get(i4);
                    if (vs1.o(((in5) obj).a, j4)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                in5 in5Var4 = (in5) obj;
                if (in5Var4 == null) {
                    return;
                }
                boolean zF = qs1.F(in5Var4);
                Object obj7 = n42.a;
                if (!zF) {
                    if (in5Var4.c()) {
                        i1().b(obj7);
                        return;
                    } else {
                        if (t65.c(qs1.T(in5Var4, true)) == 0.0f) {
                            return;
                        }
                        k1(qs1.T(in5Var4, false), in5Var4);
                        in5Var4.a();
                        return;
                    }
                }
                List list3 = bn5Var.a;
                int size4 = list3.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list3.get(i5);
                    if (((in5) obj2).d) {
                        break;
                    } else {
                        i5++;
                    }
                }
                in5 in5Var5 = (in5) obj2;
                if (in5Var5 != null) {
                    m42Var2.f = in5Var5.a;
                    return;
                }
                if (in5Var4.c() || !qs1.F(in5Var4)) {
                    i1().b(obj7);
                } else {
                    float fE = ((ee8) xk0.q(this, b11.t)).e();
                    m77.n(j1(), in5Var4);
                    long jZ = j1().z(g77.c(fE, fE));
                    io.sentry.util.network.b bVar = (io.sentry.util.network.b) j1().n;
                    pc8 pc8Var = (pc8) bVar.c;
                    yg1[] yg1VarArr = pc8Var.d;
                    cx.N0(0, yg1VarArr.length, null, yg1VarArr);
                    pc8Var.e = 0;
                    pc8 pc8Var2 = (pc8) bVar.d;
                    yg1[] yg1VarArr2 = pc8Var2.d;
                    cx.N0(0, yg1VarArr2.length, null, yg1VarArr2);
                    pc8Var2.e = 0;
                    bVar.b = 0L;
                    i1().b(new q42(n52.a(jZ), false));
                    this.J = false;
                }
                Z0();
                return;
            }
            l42 l42Var = (l42) obj6;
            if (cn5Var == cn5Var2) {
                return;
            }
            List list4 = bn5Var.a;
            int size5 = list4.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    obj3 = null;
                    break;
                }
                obj3 = list4.get(i6);
                if (vs1.o(((in5) obj3).a, l42Var.g)) {
                    break;
                } else {
                    i6++;
                }
            }
            in5 in5Var6 = (in5) obj3;
            if (in5Var6 == null) {
                int size6 = list4.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list4.get(i7);
                    if (((in5) obj5).d) {
                        break;
                    } else {
                        i7++;
                    }
                }
                in5Var6 = (in5) obj5;
                if (in5Var6 == null) {
                    Z0();
                    return;
                }
                l42Var.g = in5Var6.a;
            }
            if (cn5Var == cn5Var3) {
                if (in5Var6.c()) {
                    in5 in5Var7 = l42Var.f;
                    if (in5Var7 == null) {
                        hk0.g("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = l42Var.g;
                    je0 je0Var = this.T;
                    if (je0Var == null) {
                        hk0.g("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    a1(in5Var7, j5, je0Var);
                } else if (qs1.F(in5Var6)) {
                    int size7 = list4.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size7) {
                            obj4 = null;
                            break;
                        }
                        Object obj8 = list4.get(i8);
                        if (((in5) obj8).d) {
                            obj4 = obj8;
                            break;
                        }
                        i8++;
                    }
                    in5 in5Var8 = (in5) obj4;
                    if (in5Var8 == null) {
                        Z0();
                    } else {
                        l42Var.g = in5Var8.a;
                    }
                } else {
                    float f = z42.f((ee8) xk0.q(this, b11.t), in5Var6.i);
                    je0 je0Var2 = this.T;
                    if (je0Var2 == null) {
                        hk0.g("Touch slop detector not initialized.");
                        return;
                    }
                    long jE = je0.e(je0Var2, qs1.T(in5Var6, true), f);
                    if ((9223372034707292159L & jE) != 9205357640488583168L) {
                        long jE2 = t65.e(this.L, qs1.T(in5Var6, false));
                        this.L = jE2;
                        float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.L & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jE2 >> 32))))) * 57.29578f;
                        gb5 gb5Var = this.C;
                        if (gb5Var == null) {
                            z = true;
                        } else {
                            int i9 = n52.a;
                            if (gb5Var != gb5.n ? fAtan2 <= 30.0f || fAtan2 > 90.0f : fAtan2 > 30.0f) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        g76 g76Var = new g76();
                        z90 z90Var = new z90(fAtan2, g76Var);
                        int i10 = n52.a;
                        g57.p(this, az2.B, new jb(new a81(z90Var, (byte) 14), (byte) 2));
                        if (z || !g76Var.m) {
                            in5Var6.a();
                            in5 in5Var9 = l42Var.f;
                            in5Var9.getClass();
                            l1(in5Var9, in5Var6, jE);
                            k1(jE, in5Var6);
                            long j6 = in5Var6.a;
                            m42 m42Var3 = this.O;
                            if (m42Var3 == null) {
                                m42Var3 = new m42();
                                m42Var3.f = Long.MAX_VALUE;
                                this.O = m42Var3;
                            }
                            m42Var3.f = j6;
                            this.R = m42Var3;
                        } else {
                            l42Var.h = true;
                        }
                    } else {
                        l42Var.h = true;
                        this.L = t65.e(this.L, qs1.T(in5Var6, true));
                    }
                }
            }
            if (cn5Var == cn5Var4 && l42Var.h) {
                if (!in5Var6.c()) {
                    l42Var.h = false;
                    return;
                }
                in5 in5Var10 = l42Var.f;
                if (in5Var10 == null) {
                    hk0.g("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j7 = l42Var.g;
                je0 je0Var3 = this.T;
                if (je0Var3 != null) {
                    a1(in5Var10, j7, je0Var3);
                } else {
                    hk0.g("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    @Override // o.ln5
    public final void E() {
        if (this.J) {
            Z0();
            if (this.I) {
                i1().b(n42.a);
            }
            this.S = null;
        }
        this.J = false;
    }

    @Override // o.zy2
    public final String N() {
        if (!this.E) {
            return "idle";
        }
        xo1 xo1Var = this.R;
        if (xo1Var instanceof j42) {
            return ((j42) xo1Var).h ? "waiting" : "idle";
        }
        if ((xo1Var instanceof l42) || (xo1Var instanceof k42)) {
            return "waiting";
        }
        return xo1Var instanceof m42 ? "recognized" : "idle";
    }

    @Override // o.es4
    public final void N0() {
        this.I = false;
        X0();
        az2 az2Var = this.N;
        if (az2Var != null) {
            V0(az2Var);
        }
        az2 az2Var2 = this.M;
        if (az2Var2 != null) {
            V0(az2Var2);
        }
        this.N = null;
        this.M = null;
    }

    @Override // o.l52
    public final gb5 W() {
        return this.C;
    }

    public final void X0() {
        g52 g52Var = this.H;
        if (g52Var != null) {
            mw4 mw4Var = this.F;
            if (mw4Var != null) {
                mw4Var.b(new f52(g52Var));
            }
            this.H = null;
        }
    }

    public abstract Object Y0(bj bjVar, tb tbVar);

    public final void Z0() {
        this.L = 0L;
        j42 j42Var = this.K;
        i42 i42Var = i42.f1034o;
        if (j42Var == null) {
            j42Var = new j42();
            j42Var.f = i42Var;
            j42Var.g = false;
            j42Var.h = false;
            this.K = j42Var;
        }
        j42Var.f = i42Var;
        j42Var.g = false;
        j42Var.h = false;
        this.R = j42Var;
    }

    public final void a1(in5 in5Var, long j, je0 je0Var) {
        k42 k42Var = this.Q;
        if (k42Var == null) {
            k42Var = new k42();
            k42Var.f = null;
            k42Var.g = Long.MAX_VALUE;
            this.Q = k42Var;
        }
        k42Var.f = in5Var;
        k42Var.g = j;
        je0Var.n = 0L;
        this.R = k42Var;
    }

    public final void c1(r42 r42Var) {
        if ((r42Var instanceof p42) && !this.I) {
            this.I = true;
            n1();
        }
        i1().b(r42Var);
    }

    public void d1(long j) {
    }

    @Override // o.mh3
    public final void e0() {
        lh3 lh3Var = this.U;
        if (lh3Var != null) {
            lh3Var.a();
            e52 e52Var = lh3Var.m;
            if (e52Var.I) {
                e52Var.c1(n42.a);
            }
            lh3Var.s = null;
            nd ndVar = lh3Var.v;
            ndVar.n = 0;
            ((ow4) ndVar.f1562o).b = 0;
        }
    }

    public void e1(q42 q42Var) {
        if (this.z) {
            im3.R(I0(), null, null, new ff(this, q42Var, null, (byte) 0), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f1(jc1 jc1Var) throws Throwable {
        b52 b52Var;
        if (jc1Var instanceof b52) {
            b52Var = (b52) jc1Var;
            int i = b52Var.f395o;
            if ((i & Integer.MIN_VALUE) != 0) {
                b52Var.f395o = i - Integer.MIN_VALUE;
            } else {
                b52Var = new b52(this, jc1Var);
            }
        } else {
            b52Var = new b52(this, jc1Var);
        }
        Object obj = b52Var.m;
        int i2 = b52Var.f395o;
        if (i2 == 0) {
            ct1.a0(obj);
            g52 g52Var = this.H;
            if (g52Var != null) {
                mw4 mw4Var = this.F;
                if (mw4Var != null) {
                    f52 f52Var = new f52(g52Var);
                    b52Var.f395o = 1;
                    Object objA = mw4Var.a(f52Var, b52Var);
                    ne1 ne1Var = ne1.m;
                    if (objA == ne1Var) {
                        return ne1Var;
                    }
                }
            }
            e1(new q42(0L, false));
            return f88.a;
        }
        if (i2 != 1) {
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ct1.a0(obj);
        this.H = null;
        e1(new q42(0L, false));
        return f88.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g1(p42 p42Var, jc1 jc1Var) {
        c52 c52Var;
        mw4 mw4Var;
        g52 g52Var;
        p42 p42Var2;
        g52 g52Var2;
        if (jc1Var instanceof c52) {
            c52Var = (c52) jc1Var;
            int i = c52Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                c52Var.q = i - Integer.MIN_VALUE;
            } else {
                c52Var = new c52(this, jc1Var);
            }
        } else {
            c52Var = new c52(this, jc1Var);
        }
        Object obj = c52Var.f490o;
        int i2 = c52Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(obj);
            g52 g52Var3 = this.H;
            if (g52Var3 != null && (mw4Var = this.F) != null) {
                f52 f52Var = new f52(g52Var3);
                c52Var.m = p42Var;
                c52Var.q = 1;
                if (mw4Var.a(f52Var, c52Var) != ne1Var) {
                }
                return ne1Var;
            }
            this.H = g52Var;
            d1(p42Var.a);
            return f88.a;
        }
        if (i2 == 1) {
            p42Var = c52Var.m;
            ct1.a0(obj);
        } else {
            if (i2 != 2) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g52Var2 = c52Var.n;
            p42Var2 = c52Var.m;
            ct1.a0(obj);
        }
        g52Var = g52Var2;
        p42Var = p42Var2;
        this.H = g52Var;
        d1(p42Var.a);
        return f88.a;
        g52Var = new g52();
        mw4 mw4Var2 = this.F;
        if (mw4Var2 != null) {
            c52Var.m = p42Var;
            c52Var.n = g52Var;
            c52Var.q = 2;
            if (mw4Var2.a(g52Var, c52Var) != ne1Var) {
                p42Var2 = p42Var;
                g52Var2 = g52Var;
                g52Var = g52Var2;
                p42Var = p42Var2;
            }
            return ne1Var;
        }
        this.H = g52Var;
        d1(p42Var.a);
        return f88.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h1(q42 q42Var, jc1 jc1Var) throws Throwable {
        d52 d52Var;
        if (jc1Var instanceof d52) {
            d52Var = (d52) jc1Var;
            int i = d52Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                d52Var.p = i - Integer.MIN_VALUE;
            } else {
                d52Var = new d52(this, jc1Var);
            }
        } else {
            d52Var = new d52(this, jc1Var);
        }
        Object obj = d52Var.n;
        int i2 = d52Var.p;
        if (i2 == 0) {
            ct1.a0(obj);
            g52 g52Var = this.H;
            if (g52Var != null) {
                mw4 mw4Var = this.F;
                if (mw4Var != null) {
                    h52 h52Var = new h52(g52Var);
                    d52Var.m = q42Var;
                    d52Var.p = 1;
                    Object objA = mw4Var.a(h52Var, d52Var);
                    ne1 ne1Var = ne1.m;
                    if (objA == ne1Var) {
                        return ne1Var;
                    }
                }
            }
            e1(q42Var);
            return f88.a;
        }
        if (i2 != 1) {
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        q42Var = d52Var.m;
        ct1.a0(obj);
        this.H = null;
        e1(q42Var);
        return f88.a;
    }

    public final wm0 i1() {
        kf0 kf0Var = this.G;
        if (kf0Var != null) {
            return kf0Var;
        }
        hk0.g("Events channel not initialized.");
        return null;
    }

    @Override // o.mh3
    public final void j0(ae aeVar, cn5 cn5Var) {
        Object obj;
        Object obj2;
        Object obj3;
        char c;
        float f;
        float fIntBitsToFloat;
        boolean z;
        cn5 cn5Var2;
        Object obj4;
        Object obj5;
        Object obj6;
        gh3 gh3Var;
        int i = aeVar.b;
        ArrayList arrayList = (ArrayList) aeVar.c;
        if (this.E) {
            lh3 lh3Var = this.U;
            if (lh3Var == null) {
                lh3Var = new lh3(this);
                this.U = lh3Var;
            }
            if (this.N == null) {
                az2 az2Var = new az2(lh3Var);
                U0(az2Var);
                this.N = az2Var;
            }
            lh3 lh3Var2 = this.U;
            if (lh3Var2 != null) {
                e52 e52Var = lh3Var2.m;
                vt1 vt1Var = lh3Var2.r;
                byte b = 8;
                if (vt1Var == null) {
                    gh3 gh3Var2 = lh3Var2.n;
                    if (gh3Var2 == null) {
                        obj = vt1Var;
                        gh3Var = gh3Var2;
                        gh3 gh3Var3 = new gh3(b);
                        gh3Var3.e = fh3.f798o;
                        gh3Var3.f = false;
                        gh3Var3.g = false;
                        lh3Var2.n = gh3Var3;
                        gh3Var = gh3Var3;
                    }
                    obj = vt1Var;
                    gh3Var = gh3Var2;
                    lh3Var2.r = gh3Var;
                    obj = gh3Var;
                }
                obj = vt1Var;
                boolean z2 = obj instanceof gh3;
                cn5 cn5Var3 = cn5.m;
                cn5 cn5Var4 = cn5.n;
                if (z2) {
                    gh3 gh3Var4 = (gh3) obj;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!zu1.n((eh3) arrayList.get(i2))) {
                            return;
                        }
                    }
                    eh3 eh3Var = (eh3) lv0.m0(arrayList);
                    int i3 = kh3.a[gh3Var4.e.ordinal()];
                    fh3 fh3Var = fh3.n;
                    fh3 fh3Var2 = fh3.m;
                    fh3 fh3Var3 = i3 == 1 ? !e52Var.m1() ? fh3Var2 : fh3Var : gh3Var4.e;
                    gh3Var4.e = fh3Var3;
                    if (cn5Var == cn5Var3) {
                        if (fh3Var3 == fh3Var) {
                            eh3Var.i = true;
                            gh3Var4.f = true;
                        }
                        gh3Var4.g = true;
                    }
                    if (cn5Var == cn5Var4) {
                        if (fh3Var3 == fh3Var2) {
                            lh3.c(lh3Var2, eh3Var, eh3Var.a, 0L, 12);
                            return;
                        }
                        if (gh3Var4.f) {
                            lh3Var2.f(eh3Var, eh3Var, new dh3(i), 0L);
                            lh3Var2.e(eh3Var, new dh3(i), 0L);
                            long j = eh3Var.a;
                            jh3 jh3Var = lh3Var2.f1361o;
                            if (jh3Var == null) {
                                jh3Var = new jh3(b);
                                jh3Var.e = Long.MAX_VALUE;
                                lh3Var2.f1361o = jh3Var;
                            }
                            jh3Var.e = j;
                            lh3Var2.r = jh3Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = obj instanceof ih3;
                cn5 cn5Var5 = cn5.f544o;
                if (z3) {
                    ih3 ih3Var = (ih3) obj;
                    if (cn5Var == cn5Var3) {
                        return;
                    }
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            cn5Var2 = cn5Var5;
                            obj4 = null;
                            break;
                        }
                        obj4 = arrayList.get(i4);
                        cn5Var2 = cn5Var5;
                        if (vs1.o(((eh3) obj4).a, ih3Var.f)) {
                            break;
                        }
                        i4++;
                        cn5Var5 = cn5Var2;
                    }
                    eh3 eh3Var2 = (eh3) obj4;
                    if (eh3Var2 == null) {
                        int size3 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                obj6 = null;
                                break;
                            }
                            obj6 = arrayList.get(i5);
                            if (((eh3) obj6).d) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        eh3Var2 = (eh3) obj6;
                        if (eh3Var2 == null) {
                            lh3Var2.a();
                            return;
                        }
                        ih3Var.f = eh3Var2.a;
                    }
                    eh3 eh3Var3 = eh3Var2;
                    if (cn5Var == cn5Var4) {
                        if (eh3Var3.i) {
                            eh3 eh3Var4 = ih3Var.e;
                            if (eh3Var4 == null) {
                                hk0.g("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            long j2 = ih3Var.f;
                            je0 je0Var = lh3Var2.t;
                            if (je0Var == null) {
                                hk0.g("AwaitTouchSlop.touchSlopDetector was not initialized");
                                return;
                            }
                            lh3Var2.b(eh3Var4, j2, je0Var);
                        } else if (zu1.o(eh3Var3)) {
                            int size4 = arrayList.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size4) {
                                    obj5 = null;
                                    break;
                                }
                                Object obj7 = arrayList.get(i6);
                                if (((eh3) obj7).d) {
                                    obj5 = obj7;
                                    break;
                                }
                                i6++;
                            }
                            eh3 eh3Var5 = (eh3) obj5;
                            if (eh3Var5 == null) {
                                lh3Var2.a();
                            } else {
                                ih3Var.f = eh3Var5.a;
                            }
                        } else {
                            ee8 ee8Var = (ee8) xk0.q(e52Var, b11.t);
                            float f2 = z42.a;
                            float f3 = ee8Var.f();
                            je0 je0Var2 = lh3Var2.t;
                            if (je0Var2 == null) {
                                hk0.g("Touch slop detector not initialized.");
                                return;
                            }
                            long jE = je0.e(je0Var2, zu1.I(eh3Var3, e52Var.C, new dh3(i), true), f3);
                            if ((9223372034707292159L & jE) != 9205357640488583168L) {
                                eh3Var3.i = true;
                                eh3 eh3Var6 = ih3Var.e;
                                eh3Var6.getClass();
                                lh3Var2.f(eh3Var6, eh3Var3, new dh3(i), jE);
                                lh3Var2.e(eh3Var3, new dh3(i), jE);
                                long j3 = eh3Var3.a;
                                jh3 jh3Var2 = lh3Var2.f1361o;
                                if (jh3Var2 == null) {
                                    jh3Var2 = new jh3(b);
                                    jh3Var2.e = Long.MAX_VALUE;
                                    lh3Var2.f1361o = jh3Var2;
                                }
                                jh3Var2.e = j3;
                                lh3Var2.r = jh3Var2;
                            } else {
                                ih3Var.g = true;
                            }
                        }
                    }
                    if (cn5Var == cn5Var2 && ih3Var.g) {
                        if (!eh3Var3.i) {
                            ih3Var.g = false;
                            return;
                        }
                        eh3 eh3Var7 = ih3Var.e;
                        if (eh3Var7 == null) {
                            hk0.g("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j4 = ih3Var.f;
                        je0 je0Var3 = lh3Var2.t;
                        if (je0Var3 != null) {
                            lh3Var2.b(eh3Var7, j4, je0Var3);
                            return;
                        } else {
                            hk0.g("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof hh3) {
                    hh3 hh3Var = (hh3) obj;
                    if (cn5Var != cn5Var5) {
                        return;
                    }
                    int size5 = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            z = true;
                            break;
                        } else {
                            if (((eh3) arrayList.get(i7)).i) {
                                z = false;
                                break;
                            }
                            i7++;
                        }
                    }
                    int size6 = arrayList.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        if (((eh3) arrayList.get(i8)).d) {
                            if (arrayList.isEmpty()) {
                                break;
                            }
                            if (z) {
                                long J = zu1.J((eh3) lv0.m0(arrayList), e52Var.C, new dh3(i));
                                eh3 eh3Var8 = hh3Var.e;
                                eh3Var8.getClass();
                                long jD = t65.d(J, zu1.J(eh3Var8, e52Var.C, new dh3(i)));
                                eh3 eh3Var9 = hh3Var.e;
                                if (eh3Var9 != null) {
                                    lh3.c(lh3Var2, eh3Var9, hh3Var.f, jD, 8);
                                    return;
                                } else {
                                    hk0.g("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    lh3Var2.a();
                    return;
                }
                if (!(obj instanceof jh3)) {
                    gk0.s();
                    return;
                }
                jh3 jh3Var3 = (jh3) obj;
                if (cn5Var != cn5Var4) {
                    return;
                }
                long j5 = jh3Var3.e;
                int size7 = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i9);
                    if (vs1.o(((eh3) obj2).a, j5)) {
                        break;
                    } else {
                        i9++;
                    }
                }
                eh3 eh3Var10 = (eh3) obj2;
                if (eh3Var10 == null) {
                    return;
                }
                long j6 = eh3Var10.c;
                boolean zO = zu1.o(eh3Var10);
                n42 n42Var = n42.a;
                if (!zO) {
                    if (eh3Var10.i) {
                        e52Var.c1(n42Var);
                        return;
                    } else {
                        if (t65.c(zu1.I(eh3Var10, e52Var.C, new dh3(i), true)) == 0.0f) {
                            return;
                        }
                        lh3Var2.e(eh3Var10, new dh3(i), zu1.I(eh3Var10, e52Var.C, new dh3(i), false));
                        eh3Var10.i = true;
                        return;
                    }
                }
                int size8 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList.get(i10);
                    if (((eh3) obj3).d) {
                        break;
                    } else {
                        i10++;
                    }
                }
                eh3 eh3Var11 = (eh3) obj3;
                if (eh3Var11 != null) {
                    jh3Var3.e = eh3Var11.a;
                    return;
                }
                if (eh3Var10.i || !zu1.o(eh3Var10)) {
                    e52Var.c1(n42Var);
                } else {
                    l07 l07VarD = lh3Var2.d();
                    gb5 gb5Var = e52Var.C;
                    nd ndVar = lh3Var2.u;
                    zw4 zw4Var = (zw4) ndVar.f1562o;
                    char c2 = ' ';
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 >> 32));
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                    if (zu1.n(eh3Var10)) {
                        ndVar.n = 0;
                        zw4Var.d();
                    }
                    if (zu1.o(eh3Var10) || zu1.n(eh3Var10)) {
                        c = ' ';
                        f = 0.0f;
                    } else {
                        if (zw4Var.b == 3) {
                            int i11 = ndVar.n;
                            ndVar.n = i11 + 1;
                            zw4Var.n(i11, eh3Var10);
                        } else {
                            zw4Var.a(eh3Var10);
                        }
                        if (ndVar.n == 3) {
                            ndVar.n = 0;
                        }
                        Object[] objArr = zw4Var.a;
                        int i12 = zw4Var.b;
                        int i13 = 0;
                        float fIntBitsToFloat4 = 0.0f;
                        while (i13 < i12) {
                            char c3 = c2;
                            fIntBitsToFloat4 += Float.intBitsToFloat((int) (((eh3) objArr[i13]).c >> c3));
                            i13++;
                            c2 = c3;
                        }
                        c = c2;
                        f = 0.0f;
                        int i14 = zw4Var.b;
                        fIntBitsToFloat2 = fIntBitsToFloat4 / i14;
                        Object[] objArr2 = zw4Var.a;
                        float fIntBitsToFloat5 = 0.0f;
                        for (int i15 = 0; i15 < i14; i15++) {
                            fIntBitsToFloat5 += Float.intBitsToFloat((int) (((eh3) objArr2[i15]).c & 4294967295L));
                        }
                        fIntBitsToFloat3 = fIntBitsToFloat5 / zw4Var.b;
                    }
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
                    if (gb5Var != null) {
                        if (i == 1) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
                        } else if (i == 2) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                        }
                        jFloatToRawIntBits = gb5Var == gb5.n ? (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) : (((long) Float.floatToRawIntBits(f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                    }
                    ((io.sentry.util.network.b) l07VarD.n).a(eh3Var10.b, jFloatToRawIntBits);
                    float fE = ((ee8) xk0.q(e52Var, b11.t)).e();
                    long jZ = lh3Var2.d().z(g77.c(fE, fE));
                    io.sentry.util.network.b bVar = (io.sentry.util.network.b) lh3Var2.d().n;
                    pc8 pc8Var = (pc8) bVar.c;
                    yg1[] yg1VarArr = pc8Var.d;
                    cx.N0(0, yg1VarArr.length, null, yg1VarArr);
                    pc8Var.e = 0;
                    pc8 pc8Var2 = (pc8) bVar.d;
                    yg1[] yg1VarArr2 = pc8Var2.d;
                    cx.N0(0, yg1VarArr2.length, null, yg1VarArr2);
                    pc8Var2.e = 0;
                    bVar.b = 0L;
                    e52Var.c1(new q42(n52.a(jZ), true));
                }
                lh3Var2.a();
            }
        }
    }

    public final l07 j1() {
        l07 l07Var = this.S;
        if (l07Var != null) {
            return l07Var;
        }
        hk0.g("Velocity Tracker not initialized.");
        return null;
    }

    public final void k1(long j, in5 in5Var) {
        this.L = t65.e(this.L, j);
        m77.n(j1(), in5Var);
        i1().b(new o42(j, false));
    }

    public final void l1(in5 in5Var, in5 in5Var2, long j) {
        if (this.S == null) {
            this.S = new l07((byte) 21);
        }
        m77.n(j1(), in5Var);
        long jD = t65.d(in5Var2.c, j);
        if (((Boolean) this.D.invoke(new sn5(in5Var.i))).booleanValue()) {
            if (!this.I) {
                if (this.G == null) {
                    this.G = ka0.d(Integer.MAX_VALUE, 6, null);
                }
                n1();
            }
            i1().b(new p42(jD));
        }
    }

    public boolean m1() {
        yk6 yk6Var = ((sk6) this).d0;
        if (yk6Var.a.a()) {
            return true;
        }
        li liVar = yk6Var.b;
        return liVar != null ? liVar.e() : false;
    }

    public final void n1() {
        this.I = true;
        hc1 hc1Var = null;
        if (this.G == null) {
            this.G = ka0.d(Integer.MAX_VALUE, 6, null);
        }
        im3.R(I0(), null, null, new tb(this, hc1Var, (byte) 2), 3);
    }

    public final void o1(Function1 function1, boolean z, mw4 mw4Var, gb5 gb5Var, boolean z2) {
        this.D = function1;
        boolean z3 = true;
        if (this.E != z) {
            this.E = z;
            if (!z) {
                az2 az2Var = this.N;
                if (az2Var != null) {
                    V0(az2Var);
                }
                az2 az2Var2 = this.M;
                if (az2Var2 != null) {
                    V0(az2Var2);
                }
                this.N = null;
                this.M = null;
                X0();
                this.U = null;
            }
            z2 = true;
        }
        if (!im3.n(this.F, mw4Var)) {
            X0();
            this.F = mw4Var;
        }
        if (this.C != gb5Var) {
            this.C = gb5Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.J;
            n42 n42Var = n42.a;
            if (z4) {
                Z0();
                if (this.I) {
                    i1().b(n42Var);
                }
                this.S = null;
            }
            lh3 lh3Var = this.U;
            if (lh3Var != null) {
                lh3Var.a();
                e52 e52Var = lh3Var.m;
                if (e52Var.I) {
                    e52Var.c1(n42Var);
                }
                lh3Var.s = null;
                nd ndVar = lh3Var.v;
                ndVar.n = 0;
                ((ow4) ndVar.f1562o).b = 0;
            }
        }
    }
}
