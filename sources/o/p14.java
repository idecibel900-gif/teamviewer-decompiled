package o;

import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class p14 implements mz0 {
    public int A;
    public final String B;
    public final LayoutNode m;
    public n01 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public od7 f1693o;
    public int p;
    public int q;
    public final jx4 r;
    public final jx4 s;
    public final j14 t;
    public final g14 u;
    public final jx4 v;
    public final nd7 w;
    public final jx4 x;
    public final xx4 y;
    public int z;

    public p14(LayoutNode layoutNode, od7 od7Var) {
        this.m = layoutNode;
        this.f1693o = od7Var;
        long[] jArr = ti6.a;
        this.r = new jx4();
        this.s = new jx4();
        this.t = new j14(this);
        this.u = new g14(this);
        this.v = new jx4();
        this.w = new nd7();
        this.x = new jx4();
        this.y = new xx4(new Object[16]);
        this.B = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void d(h14 h14Var) {
        kx4 kx4Var;
        yh5 yh5Var = h14Var.f;
        if (yh5Var != null) {
            yh5Var.h.set(ai5.n);
            au2 au2Var = yh5Var.k;
            if (((kx4) au2Var.e).h()) {
                kx4Var = (kx4) au2Var.e;
                kx4 kx4Var2 = ui6.a;
                au2Var.e = new kx4();
                ((xx4) au2Var.d).g();
            } else {
                kx4Var = null;
            }
            au2Var.c();
            s01 s01Var = yh5Var.a;
            s01Var.C = null;
            if (kx4Var != null) {
                s01Var.G.a = kx4Var;
                s01Var.I = (byte) 2;
            }
            h14Var.f = null;
            s01 s01Var2 = h14Var.c;
            if (s01Var2 != null) {
                s01Var2.m();
            }
            h14Var.c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // o.mz0
    public final void a() {
        s01 s01Var;
        LayoutNode layoutNode = this.m;
        layoutNode.D = true;
        jx4 jx4Var = this.r;
        Object[] objArr = jx4Var.c;
        long[] jArr = jx4Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (s01Var = ((h14) objArr[(i << 3) + i3]).c) != null) {
                            s01Var.m();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        layoutNode.o0();
        layoutNode.D = false;
        jx4Var.a();
        this.s.a();
        this.A = 0;
        this.z = 0;
        this.v.a();
        h();
    }

    @Override // o.mz0
    public final void b() {
        i(true);
    }

    public final void c(h14 h14Var, boolean z) {
        yh5 yh5Var = h14Var.f;
        if (yh5Var != null) {
            n47 n47VarC = el5.c();
            Function1 function1E = n47VarC != null ? n47VarC.e() : null;
            n47 n47VarF = el5.f(n47VarC);
            try {
                LayoutNode layoutNode = this.m;
                layoutNode.D = true;
                if (z) {
                    while (!yh5Var.c()) {
                        try {
                            yh5Var.e(new gk0((byte) 27));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                yh5Var.a();
                h14Var.f = null;
                layoutNode.D = false;
                el5.h(n47VarC, n47VarF, function1E);
            } catch (Throwable th2) {
                el5.h(n47VarC, n47VarF, function1E);
                throw th2;
            }
        }
    }

    public final kd7 e(Object obj) {
        return !this.m.W() ? new m14() : new n14(this, obj);
    }

    public final void f(int i) {
        boolean z;
        boolean z2 = false;
        this.z = 0;
        List listQ = this.m.q();
        xw4 xw4Var = (xw4) listQ;
        int i2 = (((xx4) xw4Var.n).f2559o - this.A) - 1;
        if (i <= i2) {
            this.w.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.r.g((LayoutNode) xw4Var.get(i3));
                    objG.getClass();
                    ((bx4) this.w.n).a(((h14) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f1693o.k(this.w);
            n47 n47VarC = el5.c();
            Function1 function1E = n47VarC != null ? n47VarC.e() : null;
            n47 n47VarF = el5.f(n47VarC);
            z = false;
            while (i2 >= i) {
                try {
                    LayoutNode layoutNode = (LayoutNode) ((xw4) listQ).get(i2);
                    Object objG2 = this.r.g(layoutNode);
                    objG2.getClass();
                    h14 h14Var = (h14) objG2;
                    Object obj = h14Var.a;
                    if (((bx4) this.w.n).c(obj)) {
                        this.z++;
                        if (((Boolean) h14Var.g.getValue()).booleanValue()) {
                            co4 co4VarZ = layoutNode.z();
                            a14 a14Var = a14.f282o;
                            co4VarZ.x = a14Var;
                            xg4 xg4VarY = layoutNode.y();
                            if (xg4VarY != null) {
                                xg4VarY.v = a14Var;
                            }
                            l(h14Var, false);
                            if (h14Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        LayoutNode layoutNode2 = this.m;
                        layoutNode2.D = true;
                        this.r.k(layoutNode);
                        s01 s01Var = h14Var.c;
                        if (s01Var != null) {
                            s01Var.m();
                        }
                        this.m.p0(i2, 1);
                        layoutNode2.D = false;
                    }
                    this.s.k(obj);
                    i2--;
                } catch (Throwable th) {
                    el5.h(n47VarC, n47VarF, function1E);
                    throw th;
                }
            }
            el5.h(n47VarC, n47VarF, function1E);
        } else {
            z = false;
        }
        if (z) {
            synchronized (v47.c) {
                kx4 kx4Var = v47.j.h;
                if (kx4Var != null && kx4Var.h()) {
                    z2 = true;
                }
            }
            if (z2) {
                v47.c();
            }
        }
        h();
    }

    public final void g(Object obj) {
        h();
        LayoutNode layoutNode = (LayoutNode) this.v.k(obj);
        LayoutNode layoutNode2 = this.m;
        if (layoutNode != null) {
            if (this.A <= 0) {
                ki3.c("No pre-composed items to dispose");
            }
            int i = ((xx4) ((xw4) layoutNode2.q()).n).i(layoutNode);
            if (i < ((xx4) ((xw4) layoutNode2.q()).n).f2559o - this.A) {
                ki3.c("Item is not in pre-composed item range");
            }
            this.z++;
            this.A--;
            h14 h14Var = (h14) this.r.g(layoutNode);
            if (h14Var != null) {
                d(h14Var);
            }
            int i2 = (((xx4) ((xw4) layoutNode2.q()).n).f2559o - this.A) - this.z;
            j(i, i2);
            f(i2);
        }
        if (this.y.h(obj)) {
            LayoutNode.u0(layoutNode2, true, 6);
        }
    }

    public final void h() {
        int i = ((xx4) ((xw4) this.m.q()).n).f2559o;
        int i2 = this.r.e;
        if (i2 != i) {
            ki3.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.z;
        int i4 = this.A;
        if ((i - i3) - i4 < 0) {
            StringBuilder sbJ = fx3.j(i, i3, "Incorrect state. Total children ", ". Reusable children ", ". Precomposed children ");
            sbJ.append(i4);
            ki3.a(sbJ.toString());
        }
        int i5 = this.v.e;
        int i6 = this.A;
        if (i5 == i6) {
            return;
        }
        ki3.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    public final void i(boolean z) {
        this.A = 0;
        this.v.a();
        List listQ = this.m.q();
        int i = ((xx4) ((xw4) listQ).n).f2559o;
        if (this.z != i) {
            this.z = i;
            n47 n47VarC = el5.c();
            Function1 function1E = n47VarC != null ? n47VarC.e() : null;
            n47 n47VarF = el5.f(n47VarC);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    LayoutNode layoutNode = (LayoutNode) ((xw4) listQ).get(i2);
                    h14 h14Var = (h14) this.r.g(layoutNode);
                    if (h14Var != null && ((Boolean) h14Var.g.getValue()).booleanValue()) {
                        co4 co4VarZ = layoutNode.z();
                        a14 a14Var = a14.f282o;
                        co4VarZ.x = a14Var;
                        xg4 xg4VarY = layoutNode.y();
                        if (xg4VarY != null) {
                            xg4VarY.v = a14Var;
                        }
                        l(h14Var, z);
                        h14Var.a = g68.x;
                    }
                } catch (Throwable th) {
                    el5.h(n47VarC, n47VarF, function1E);
                    throw th;
                }
            }
            el5.h(n47VarC, n47VarF, function1E);
            this.s.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        LayoutNode layoutNode = this.m;
        layoutNode.D = true;
        layoutNode.h0(i, i2, 1);
        layoutNode.D = false;
    }

    public final void k(Object obj, hw2 hw2Var, boolean z) {
        LayoutNode layoutNode = this.m;
        if (layoutNode.W()) {
            h();
            if (this.s.c(obj)) {
                return;
            }
            this.x.k(obj);
            jx4 jx4Var = this.v;
            Object objG = jx4Var.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((xx4) ((xw4) layoutNode.q()).n).i(objG), ((xx4) ((xw4) layoutNode.q()).n).f2559o);
                    this.A++;
                } else {
                    int i = ((xx4) ((xw4) layoutNode.q()).n).f2559o;
                    LayoutNode layoutNode2 = new LayoutNode(2);
                    layoutNode.D = true;
                    layoutNode.N(i, layoutNode2);
                    layoutNode.D = false;
                    this.A++;
                    objG = layoutNode2;
                }
                jx4Var.m(obj, objG);
            }
            m((LayoutNode) objG, obj, z, hw2Var);
        }
    }

    public final void l(h14 h14Var, boolean z) {
        s01 s01Var;
        if (z || !h14Var.h) {
            h14Var.g = h57.p(Boolean.FALSE);
        } else {
            h14Var.g.setValue(Boolean.FALSE);
        }
        if (h14Var.f != null) {
            d(h14Var);
            return;
        }
        if (z) {
            s01 s01Var2 = h14Var.c;
            if (s01Var2 != null) {
                s01Var2.l();
                return;
            }
            return;
        }
        ib5 outOfFrameExecutor = e14.a(this.m).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            ((AndroidComposeView) outOfFrameExecutor).E(new vm3((Object) h14Var, (byte) 1));
        } else {
            if (h14Var.h || (s01Var = h14Var.c) == null) {
                return;
            }
            s01Var.l();
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bd, B:64:0x00d3, B:66:0x00d7, B:78:0x011b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:72:0x0108, B:76:0x0112, B:75:0x010d, B:77:0x0118, B:62:0x00c0, B:56:0x0092, B:58:0x00a0, B:81:0x0125, B:82:0x012f), top: B:85:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bd, B:64:0x00d3, B:66:0x00d7, B:78:0x011b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:72:0x0108, B:76:0x0112, B:75:0x010d, B:77:0x0118, B:62:0x00c0, B:56:0x0092, B:58:0x00a0, B:81:0x0125, B:82:0x012f), top: B:85:0x0076 }] */
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
    public final void m(LayoutNode layoutNode, Object obj, boolean z, hw2 hw2Var) {
        boolean z2;
        s01 s01Var;
        jx4 jx4Var = this.r;
        Object objG = jx4Var.g(layoutNode);
        Object obj2 = objG;
        if (objG == null) {
            yy0 yy0Var = vn4.f2331o;
            h14 h14Var = new h14();
            h14Var.a = obj;
            h14Var.b = yy0Var;
            h14Var.c = null;
            h14Var.g = h57.p(Boolean.TRUE);
            jx4Var.m(layoutNode, h14Var);
            obj2 = h14Var;
        }
        h14 h14Var2 = (h14) obj2;
        boolean z3 = h14Var2.b != hw2Var;
        if (h14Var2.f != null) {
            if (z3) {
                d(h14Var2);
            } else if (z) {
                return;
            } else {
                c(h14Var2, true);
            }
        }
        s01 s01Var2 = h14Var2.c;
        if (s01Var2 != null) {
            synchronized (s01Var2.p) {
                z2 = s01Var2.z.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || h14Var2.d) {
            h14Var2.b = hw2Var;
            if (h14Var2.f != null) {
                ki3.a("new subcompose call while paused composition is still active");
            }
            n47 n47VarC = el5.c();
            Function1 function1E = n47VarC != null ? n47VarC.e() : null;
            n47 n47VarF = el5.f(n47VarC);
            try {
                LayoutNode layoutNode2 = this.m;
                layoutNode2.D = true;
                s01 s01Var3 = h14Var2.c;
                n01 n01Var = this.n;
                if (n01Var == null) {
                    ki3.d("parent composition reference not set");
                    throw new iz3();
                }
                if (s01Var3 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = wn8.a;
                        s01Var = new s01(n01Var, new l78(layoutNode));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = wn8.a;
                        s01Var = new s01(n01Var, new l78(layoutNode));
                    }
                    s01Var3 = s01Var;
                } else {
                    if (s01Var3.I == 3) {
                        if (z) {
                            ViewGroup.LayoutParams layoutParams3 = wn8.a;
                            s01Var = new s01(n01Var, new l78(layoutNode));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = wn8.a;
                            s01Var = new s01(n01Var, new l78(layoutNode));
                        }
                        s01Var3 = s01Var;
                    }
                }
                h14Var2.c = s01Var3;
                hw2 yy0Var2 = h14Var2.b;
                if (e14.a(this.m).getOutOfFrameExecutor() != null) {
                    h14Var2.h = false;
                } else {
                    h14Var2.h = true;
                    yy0Var2 = new yy0(1524156494, true, new c9((Object) h14Var2, (Object) yy0Var2, (byte) 26));
                }
                if (z) {
                    if (h14Var2.e) {
                        s01Var3.i();
                        s01Var3.q();
                        h14Var2.f = s01Var3.k(true, yy0Var2);
                    } else {
                        h14Var2.f = s01Var3.k(s01Var3.i(), yy0Var2);
                    }
                } else if (h14Var2.e) {
                    s01Var3.i();
                    s01Var3.q();
                    ux2 ux2Var = s01Var3.H;
                    ux2Var.z = 0;
                    ux2Var.y = true;
                    s01Var3.m.a(s01Var3, yy0Var2);
                    if (ux2Var.F || ux2Var.z != 0) {
                        up5.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    ux2Var.z = -1;
                    ux2Var.y = false;
                } else {
                    s01Var3.A(yy0Var2);
                }
                h14Var2.e = false;
                layoutNode2.D = false;
                el5.h(n47VarC, n47VarF, function1E);
                h14Var2.d = false;
            } catch (Throwable th) {
                el5.h(n47VarC, n47VarF, function1E);
                throw th;
            }
        }
    }

    public final LayoutNode n(Object obj) {
        jx4 jx4Var;
        int i;
        if (this.z == 0) {
            return null;
        }
        xw4 xw4Var = (xw4) this.m.q();
        int i2 = ((xx4) xw4Var.n).f2559o - this.A;
        int i3 = i2 - this.z;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            jx4Var = this.r;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = jx4Var.g((LayoutNode) xw4Var.get(i5));
            objG.getClass();
            if (((h14) objG).a.equals(obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object objG2 = jx4Var.g((LayoutNode) xw4Var.get(i4));
                objG2.getClass();
                h14 h14Var = (h14) objG2;
                Object obj2 = h14Var.a;
                if (obj2 == g68.x || this.f1693o.g(obj, obj2)) {
                    h14Var.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.z--;
        LayoutNode layoutNode = (LayoutNode) xw4Var.get(i3);
        Object objG3 = jx4Var.g(layoutNode);
        objG3.getClass();
        h14 h14Var2 = (h14) objG3;
        h14Var2.g = h57.p(Boolean.TRUE);
        h14Var2.e = true;
        h14Var2.d = true;
        return layoutNode;
    }
}
