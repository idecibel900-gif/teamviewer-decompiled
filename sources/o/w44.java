package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class w44 implements tk6 {
    public static final a65 y = vt1.B(new qo2(5), new ek3(7));
    public final pk1 a;
    public boolean b;
    public o44 c;
    public boolean d;
    public final ll2 e;
    public final bg5 f;
    public final mw4 g;
    public float h;
    public boolean i;
    public final wk1 j;
    public final boolean k;
    public LayoutNode l;
    public final s44 m;
    public final d10 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m34 f2378o;
    public final eb0 p;
    public final x34 q;
    public final nx3 r;
    public final u34 s;
    public final px4 t;
    public final bg5 u;
    public final bg5 v;
    public final px4 w;
    public final yt2 x;

    public w44(int i, int i2) {
        pk1 pk1Var = new pk1();
        pk1Var.a = -1;
        pk1Var.d = -1;
        this.a = pk1Var;
        ll2 ll2Var = new ll2();
        ll2Var.n = new yf5(i);
        ll2Var.f1375o = new yf5(i2);
        ll2Var.q = new s34(i);
        this.e = ll2Var;
        o44 o44Var = z44.a;
        xz2 xz2Var = xz2.P;
        this.f = new bg5(o44Var, xz2Var);
        this.g = new mw4();
        this.j = new wk1(new fj3((Object) this, (byte) 4));
        this.k = true;
        this.m = new s44(this);
        this.n = new d10();
        this.f2378o = new m34();
        this.p = new eb0((byte) 1);
        this.q = new x34(new mg(this, i));
        this.r = new nx3((Object) this, (byte) 8);
        this.s = new u34();
        f88 f88Var = f88.a;
        this.t = new bg5(f88Var, xz2Var);
        Boolean bool = Boolean.FALSE;
        this.u = h57.p(bool);
        this.v = h57.p(bool);
        this.w = new bg5(f88Var, xz2Var);
        yt2 yt2Var = new yt2((byte) 15);
        yn1 yn1Var = vn4.j0;
        Float fValueOf = Float.valueOf(0.0f);
        yt2Var.f2642o = new ko(yn1Var, fValueOf, (qo) yn1Var.b.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.x = yt2Var;
    }

    public static Object l(w44 w44Var, int i, og7 og7Var) throws Throwable {
        w44Var.getClass();
        Object objE = w44Var.e(ay4.m, new v44(w44Var, i, null), og7Var);
        return objE == ne1.m ? objE : f88.a;
    }

    @Override // o.tk6
    public final boolean a() {
        return this.j.a();
    }

    @Override // o.tk6
    public final boolean b() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    @Override // o.tk6
    public final boolean c() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // o.tk6
    public final float d(float f) {
        return this.j.d(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r2 == r7) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.tk6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(o.ay4 r15, o.hw2 r16, o.jc1 r17) throws java.lang.Throwable {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof o.u44
            if (r1 == 0) goto L15
            r1 = r0
            o.u44 r1 = (o.u44) r1
            int r2 = r1.q
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.q = r2
            goto L1a
        L15:
            o.u44 r1 = new o.u44
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.f2170o
            int r2 = r1.q
            o.f88 r3 = o.f88.a
            r4 = 2
            r5 = 0
            r6 = 1
            o.ne1 r7 = o.ne1.m
            if (r2 == 0) goto L40
            if (r2 == r6) goto L35
            if (r2 != r4) goto L2f
            o.ct1.a0(r0)
            return r3
        L2f:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r14)
            return r5
        L35:
            o.og7 r2 = r1.n
            o.hw2 r2 = (o.hw2) r2
            o.ay4 r6 = r1.m
            o.ct1.a0(r0)
            r0 = r6
            goto L8c
        L40:
            o.ct1.a0(r0)
            o.bg5 r0 = r14.f
            java.lang.Object r0 = r0.getValue()
            o.o44 r2 = o.z44.a
            if (r0 != r2) goto L89
            r1.m = r15
            r2 = r16
            o.og7 r2 = (o.og7) r2
            r1.n = r2
            r1.q = r6
            o.d10 r2 = r14.n
            o.qx0 r6 = r2.c
            if (r6 != 0) goto L7e
            o.qx0 r6 = o.pm8.e()
            r2.c = r6
            o.c10 r8 = r2.b
            if (r8 == 0) goto L7e
            boolean r2 = r8.z
            if (r2 == 0) goto L7e
            o.d10 r2 = r8.B
            o.g0 r13 = new o.g0
            r9 = 11
            r13.<init>(r8, r2, r9)
            r9 = 0
            r11 = 0
            o.dv7 r2 = o.zu1.K(r8, r9, r11, r13)
            r8.A = r2
        L7e:
            java.lang.Object r2 = r6.h(r1)
            if (r2 != r7) goto L85
            goto L86
        L85:
            r2 = r3
        L86:
            if (r2 != r7) goto L89
            goto L9a
        L89:
            r0 = r15
            r2 = r16
        L8c:
            r1.m = r5
            r1.n = r5
            r1.q = r4
            o.wk1 r14 = r14.j
            java.lang.Object r14 = r14.e(r0, r2, r1)
            if (r14 != r7) goto L9b
        L9a:
            return r7
        L9b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.w44.e(o.ay4, o.hw2, o.jc1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, o.f88] */
    public final Object f(int i, jc1 jc1Var) {
        q44 q44Var;
        if (jc1Var instanceof q44) {
            q44Var = (q44) jc1Var;
            int i2 = q44Var.f1803o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q44Var.f1803o = i2 - Integer.MIN_VALUE;
            } else {
                q44Var = new q44(this, jc1Var);
            }
        } else {
            q44Var = new q44(this, jc1Var);
        }
        Object obj = q44Var.m;
        int i3 = q44Var.f1803o;
        try {
            if (i3 == 0) {
                ct1.a0(obj);
                this.i = true;
                r44 r44Var = new r44(this, i, null);
                q44Var.f1803o = 1;
                Object objE = e(ay4.m, r44Var, q44Var);
                ne1 ne1Var = ne1.m;
                if (objE == ne1Var) {
                    return ne1Var;
                }
            } else {
                if (i3 != 1) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
            }
            this.i = false;
            this = f88.a;
            return this;
        } catch (Throwable th) {
            this.i = false;
            throw th;
        }
    }

    public final void g(o44 o44Var, boolean z, boolean z2) {
        yn1 yn1Var = vn4.j0;
        List list = o44Var.l;
        int i = o44Var.f1627o;
        int i2 = o44Var.b;
        p44 p44Var = o44Var.a;
        this.q.e = list.size();
        yt2 yt2Var = this.x;
        ll2 ll2Var = this.e;
        hc1 hc1Var = null;
        if (!z && this.b) {
            this.c = o44Var;
            n47 n47VarC = el5.c();
            Function1 function1E = n47VarC != null ? n47VarC.e() : null;
            n47 n47VarF = el5.f(n47VarC);
            try {
                if (((Number) ((ko) yt2Var.f2642o).n.getValue()).floatValue() != 0.0f && p44Var != null && p44Var.a == ((yf5) ll2Var.n).z() && i2 == ((yf5) ll2Var.f1375o).z()) {
                    n87 n87Var = (n87) yt2Var.n;
                    if (n87Var != null) {
                        n87Var.j(null);
                    }
                    yt2Var.f2642o = new ko(yn1Var, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                el5.h(n47VarC, n47VarF, function1E);
            }
        }
        if (z) {
            this.b = true;
        }
        this.v.setValue(Boolean.valueOf(((p44Var != null ? p44Var.a : 0) == 0 && i2 == 0) ? false : true));
        this.u.setValue(Boolean.valueOf(o44Var.c));
        this.h -= o44Var.d;
        this.f.setValue(o44Var);
        if (z2) {
            ll2Var.getClass();
            if (i2 < 0.0f) {
                ni3.c("scrollOffset should be non-negative");
            }
            ((yf5) ll2Var.f1375o).A(i2);
            yt2Var = yt2Var;
        } else {
            p44 p44Var2 = (p44) lv0.o0(list);
            p44 p44Var3 = (p44) lv0.w0(list);
            hm3.F("firstVisibleItem:index", p44Var2 != null ? p44Var2.a : -1L);
            hm3.F("lastVisibleItem:index", p44Var3 != null ? p44Var3.a : -1L);
            ll2Var.getClass();
            ll2Var.p = p44Var != null ? p44Var.i : null;
            if (ll2Var.m || i > 0) {
                ll2Var.m = true;
                if (i2 < 0.0f) {
                    ni3.c("scrollOffset should be non-negative");
                }
                ll2Var.r(p44Var != null ? p44Var.a : 0, i2);
            }
            if (this.k) {
                pk1 pk1Var = this.a;
                int i3 = pk1Var.a;
                boolean z3 = pk1Var.c;
                if (i3 != -1 && !list.isEmpty() && i3 != pk1.a(o44Var, z3)) {
                    pk1Var.a = -1;
                    w34 w34Var = pk1Var.b;
                    if (w34Var != null) {
                        w34Var.cancel();
                    }
                    pk1Var.b = null;
                }
                int i4 = pk1Var.d;
                if (i4 != -1 && pk1Var.e != 0.0f && i4 != i && !list.isEmpty()) {
                    int iA = pk1.a(o44Var, pk1Var.e < 0.0f);
                    if (iA >= 0 && iA < i) {
                        pk1Var.a = iA;
                        pk1Var.b = nx3.K(this.r, iA);
                    }
                }
                pk1Var.d = i;
            }
        }
        if (z) {
            float f = o44Var.f;
            in1 in1Var = o44Var.i;
            me1 me1Var = o44Var.h;
            yt2Var.getClass();
            if (f <= in1Var.d0(1.0f)) {
                return;
            }
            n47 n47VarC2 = el5.c();
            Function1 function1E2 = n47VarC2 != null ? n47VarC2.e() : null;
            n47 n47VarF2 = el5.f(n47VarC2);
            yt2 yt2Var2 = yt2Var;
            try {
                float fFloatValue = ((Number) ((ko) yt2Var2.f2642o).n.getValue()).floatValue();
                n87 n87Var2 = (n87) yt2Var2.n;
                if (n87Var2 != null) {
                    n87Var2.j(null);
                }
                ko koVar = (ko) yt2Var2.f2642o;
                if (koVar.r) {
                    yt2Var2.f2642o = pm8.n(koVar, fFloatValue - f, 0.0f, 30);
                } else {
                    yt2Var2.f2642o = new ko(yn1Var, Float.valueOf(-f), null, 60);
                }
                yt2Var2.n = im3.R(me1Var, null, null, new y0(yt2Var2, hc1Var, (byte) 20), 3);
            } finally {
                el5.h(n47VarC2, n47VarF2, function1E2);
            }
        }
    }

    public final int h() {
        return ((yf5) this.e.n).z();
    }

    public final int i() {
        return ((yf5) this.e.f1375o).z();
    }

    public final o44 j() {
        return (o44) this.f.getValue();
    }

    public final void k(float f, o44 o44Var) {
        w34 w34Var;
        w34 w34Var2;
        if (this.k) {
            boolean zIsEmpty = o44Var.l.isEmpty();
            pk1 pk1Var = this.a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iA = pk1.a(o44Var, z);
                if (iA >= 0 && iA < o44Var.f1627o) {
                    if (iA != pk1Var.a) {
                        if (pk1Var.c != z) {
                            pk1Var.a = -1;
                            w34 w34Var3 = pk1Var.b;
                            if (w34Var3 != null) {
                                w34Var3.cancel();
                            }
                            pk1Var.b = null;
                        }
                        pk1Var.c = z;
                        pk1Var.a = iA;
                        pk1Var.b = nx3.K(this.r, iA);
                    }
                    List list = o44Var.l;
                    if (z) {
                        p44 p44Var = (p44) lv0.v0(list);
                        if (((p44Var.m + p44Var.n) + o44Var.r) - o44Var.n < (-f) && (w34Var2 = pk1Var.b) != null) {
                            w34Var2.I();
                        }
                    } else if (o44Var.m - ((p44) lv0.m0(list)).m < f && (w34Var = pk1Var.b) != null) {
                        w34Var.I();
                    }
                }
            }
            pk1Var.e = f;
        }
    }

    public final void m(int i, boolean z) {
        ll2 ll2Var = this.e;
        if (((yf5) ll2Var.n).z() != i || ((yf5) ll2Var.f1375o).z() != 0) {
            m34 m34Var = this.f2378o;
            m34Var.d();
            m34Var.b = null;
            m34Var.c = -1;
        }
        ll2Var.r(i, 0);
        ll2Var.p = null;
        if (!z) {
            this.t.setValue(f88.a);
            return;
        }
        LayoutNode layoutNode = this.l;
        if (layoutNode != null) {
            layoutNode.m();
        }
    }
}
