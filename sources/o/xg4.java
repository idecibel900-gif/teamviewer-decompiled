package o;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class xg4 extends jl5 implements zn4, me, bu4 {
    public Function1 B;
    public l03 C;
    public boolean H;
    public final vg4 I;
    public Object K;
    public final vg4 M;
    public final vg4 N;
    public boolean O;
    public final f14 r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;
    public r61 z;
    public int t = Integer.MAX_VALUE;
    public int u = Integer.MAX_VALUE;
    public a14 v = a14.f282o;
    public long A = 0;
    public wg4 D = wg4.f2410o;
    public final c14 E = new c14(this, (byte) 1);
    public final xx4 F = new xx4(new xg4[16]);
    public boolean G = true;
    public boolean J = true;
    public long L = t61.b(0, 0, 0, 0, 15);

    /* JADX WARN: Type inference failed for: r0v6, types: [o.vg4] */
    /* JADX WARN: Type inference failed for: r5v4, types: [o.vg4] */
    /* JADX WARN: Type inference failed for: r5v5, types: [o.vg4] */
    public xg4(f14 f14Var) {
        this.r = f14Var;
        final byte b = 1;
        final byte b2 = 0;
        this.I = new Function0(this) { // from class: o.vg4
            public final /* synthetic */ xg4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                tg4 tg4VarY0;
                byte b3 = b2;
                f88 f88Var = f88.a;
                zw4 zw4Var = null;
                placementScope = null;
                placementScope = null;
                il5 placementScope = null;
                xg4 xg4Var = this.n;
                switch (b3) {
                    case 0:
                        f14 f14Var2 = xg4Var.r;
                        f14Var2.h = 0;
                        LayoutNode layoutNode = f14Var2.a;
                        xx4 xx4VarL = layoutNode.L();
                        Object[] objArr = xx4VarL.m;
                        int i = xx4VarL.f2559o;
                        for (int i2 = 0; i2 < i; i2++) {
                            xg4 xg4Var2 = ((LayoutNode) objArr[i2]).getLayoutDelegate().q;
                            xg4Var2.getClass();
                            xg4Var2.t = xg4Var2.u;
                            xg4Var2.u = Integer.MAX_VALUE;
                            if (xg4Var2.v == a14.n) {
                                xg4Var2.v = a14.f282o;
                            }
                        }
                        xx4 xx4VarL2 = layoutNode.L();
                        Object[] objArr2 = xx4VarL2.m;
                        int i3 = xx4VarL2.f2559o;
                        for (int i4 = 0; i4 < i3; i4++) {
                            xg4 xg4Var3 = ((LayoutNode) objArr2[i4]).getLayoutDelegate().q;
                            xg4Var3.getClass();
                            xg4Var3.E.d = false;
                        }
                        si3 si3Var = xg4Var.f().r0;
                        if (si3Var == null) {
                            hk0.l("Expected lookahead delegate");
                            return null;
                        }
                        List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                        int size = children$ui.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            LayoutNode layoutNode2 = children$ui.get(i5);
                            tg4 tg4VarY1 = layoutNode2.getOuterCoordinator$ui().Y0();
                            if (tg4VarY1 != null) {
                                if (tg4VarY1.A) {
                                    if (zw4Var == null) {
                                        zw4Var = new zw4();
                                    }
                                    zw4Var.a(layoutNode2);
                                }
                                tg4VarY1.A = si3Var.A;
                            }
                        }
                        si3Var.F0().d();
                        List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                        int size2 = children$ui2.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                xx4 xx4VarL3 = layoutNode.L();
                                Object[] objArr3 = xx4VarL3.m;
                                int i7 = xx4VarL3.f2559o;
                                for (int i8 = 0; i8 < i7; i8++) {
                                    xg4 xg4Var4 = ((LayoutNode) objArr3[i8]).getLayoutDelegate().q;
                                    xg4Var4.getClass();
                                    int i9 = xg4Var4.t;
                                    int i10 = xg4Var4.u;
                                    if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                                        xg4Var4.p0(true);
                                    }
                                }
                                xx4 xx4VarL4 = layoutNode.L();
                                Object[] objArr4 = xx4VarL4.m;
                                int i11 = xx4VarL4.f2559o;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    xg4 xg4Var5 = ((LayoutNode) objArr4[i12]).getLayoutDelegate().q;
                                    xg4Var5.getClass();
                                    c14 c14Var = xg4Var5.E;
                                    c14Var.e = c14Var.d;
                                }
                                return f88Var;
                            }
                            LayoutNode layoutNode3 = children$ui2.get(i6);
                            boolean z = zw4Var != null && zw4Var.g(layoutNode3) >= 0;
                            tg4 tg4VarY2 = layoutNode3.getOuterCoordinator$ui().Y0();
                            if (tg4VarY2 != null) {
                                tg4VarY2.A = z;
                            }
                            i6++;
                        }
                        break;
                    case 1:
                        tg4 tg4VarY3 = xg4Var.r.a().Y0();
                        tg4VarY3.getClass();
                        tg4VarY3.C(xg4Var.L);
                        return f88Var;
                    default:
                        f14 f14Var3 = xg4Var.r;
                        if (io1.X(f14Var3.a) || f14Var3.c) {
                            e45 e45Var = f14Var3.a().K;
                            if (e45Var != null) {
                                placementScope = e45Var.B;
                            }
                        } else {
                            e45 e45Var2 = f14Var3.a().K;
                            if (e45Var2 != null && (tg4VarY0 = e45Var2.Y0()) != null) {
                                placementScope = tg4VarY0.B;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = e14.a(f14Var3.a).getPlacementScope();
                        }
                        tg4 tg4VarY4 = f14Var3.a().Y0();
                        tg4VarY4.getClass();
                        il5.j(placementScope, tg4VarY4, xg4Var.A);
                        return f88Var;
                }
            }
        };
        this.K = f14Var.p.E;
        this.M = new Function0(this) { // from class: o.vg4
            public final /* synthetic */ xg4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                tg4 tg4VarY0;
                byte b3 = b;
                f88 f88Var = f88.a;
                zw4 zw4Var = null;
                placementScope = null;
                placementScope = null;
                il5 placementScope = null;
                xg4 xg4Var = this.n;
                switch (b3) {
                    case 0:
                        f14 f14Var2 = xg4Var.r;
                        f14Var2.h = 0;
                        LayoutNode layoutNode = f14Var2.a;
                        xx4 xx4VarL = layoutNode.L();
                        Object[] objArr = xx4VarL.m;
                        int i = xx4VarL.f2559o;
                        for (int i2 = 0; i2 < i; i2++) {
                            xg4 xg4Var2 = ((LayoutNode) objArr[i2]).getLayoutDelegate().q;
                            xg4Var2.getClass();
                            xg4Var2.t = xg4Var2.u;
                            xg4Var2.u = Integer.MAX_VALUE;
                            if (xg4Var2.v == a14.n) {
                                xg4Var2.v = a14.f282o;
                            }
                        }
                        xx4 xx4VarL2 = layoutNode.L();
                        Object[] objArr2 = xx4VarL2.m;
                        int i3 = xx4VarL2.f2559o;
                        for (int i4 = 0; i4 < i3; i4++) {
                            xg4 xg4Var3 = ((LayoutNode) objArr2[i4]).getLayoutDelegate().q;
                            xg4Var3.getClass();
                            xg4Var3.E.d = false;
                        }
                        si3 si3Var = xg4Var.f().r0;
                        if (si3Var == null) {
                            hk0.l("Expected lookahead delegate");
                            return null;
                        }
                        List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                        int size = children$ui.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            LayoutNode layoutNode2 = children$ui.get(i5);
                            tg4 tg4VarY1 = layoutNode2.getOuterCoordinator$ui().Y0();
                            if (tg4VarY1 != null) {
                                if (tg4VarY1.A) {
                                    if (zw4Var == null) {
                                        zw4Var = new zw4();
                                    }
                                    zw4Var.a(layoutNode2);
                                }
                                tg4VarY1.A = si3Var.A;
                            }
                        }
                        si3Var.F0().d();
                        List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                        int size2 = children$ui2.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                xx4 xx4VarL3 = layoutNode.L();
                                Object[] objArr3 = xx4VarL3.m;
                                int i7 = xx4VarL3.f2559o;
                                for (int i8 = 0; i8 < i7; i8++) {
                                    xg4 xg4Var4 = ((LayoutNode) objArr3[i8]).getLayoutDelegate().q;
                                    xg4Var4.getClass();
                                    int i9 = xg4Var4.t;
                                    int i10 = xg4Var4.u;
                                    if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                                        xg4Var4.p0(true);
                                    }
                                }
                                xx4 xx4VarL4 = layoutNode.L();
                                Object[] objArr4 = xx4VarL4.m;
                                int i11 = xx4VarL4.f2559o;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    xg4 xg4Var5 = ((LayoutNode) objArr4[i12]).getLayoutDelegate().q;
                                    xg4Var5.getClass();
                                    c14 c14Var = xg4Var5.E;
                                    c14Var.e = c14Var.d;
                                }
                                return f88Var;
                            }
                            LayoutNode layoutNode3 = children$ui2.get(i6);
                            boolean z = zw4Var != null && zw4Var.g(layoutNode3) >= 0;
                            tg4 tg4VarY2 = layoutNode3.getOuterCoordinator$ui().Y0();
                            if (tg4VarY2 != null) {
                                tg4VarY2.A = z;
                            }
                            i6++;
                        }
                        break;
                    case 1:
                        tg4 tg4VarY3 = xg4Var.r.a().Y0();
                        tg4VarY3.getClass();
                        tg4VarY3.C(xg4Var.L);
                        return f88Var;
                    default:
                        f14 f14Var3 = xg4Var.r;
                        if (io1.X(f14Var3.a) || f14Var3.c) {
                            e45 e45Var = f14Var3.a().K;
                            if (e45Var != null) {
                                placementScope = e45Var.B;
                            }
                        } else {
                            e45 e45Var2 = f14Var3.a().K;
                            if (e45Var2 != null && (tg4VarY0 = e45Var2.Y0()) != null) {
                                placementScope = tg4VarY0.B;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = e14.a(f14Var3.a).getPlacementScope();
                        }
                        tg4 tg4VarY4 = f14Var3.a().Y0();
                        tg4VarY4.getClass();
                        il5.j(placementScope, tg4VarY4, xg4Var.A);
                        return f88Var;
                }
            }
        };
        final byte b3 = 2;
        this.N = new Function0(this) { // from class: o.vg4
            public final /* synthetic */ xg4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                tg4 tg4VarY0;
                byte b4 = b3;
                f88 f88Var = f88.a;
                zw4 zw4Var = null;
                placementScope = null;
                placementScope = null;
                il5 placementScope = null;
                xg4 xg4Var = this.n;
                switch (b4) {
                    case 0:
                        f14 f14Var2 = xg4Var.r;
                        f14Var2.h = 0;
                        LayoutNode layoutNode = f14Var2.a;
                        xx4 xx4VarL = layoutNode.L();
                        Object[] objArr = xx4VarL.m;
                        int i = xx4VarL.f2559o;
                        for (int i2 = 0; i2 < i; i2++) {
                            xg4 xg4Var2 = ((LayoutNode) objArr[i2]).getLayoutDelegate().q;
                            xg4Var2.getClass();
                            xg4Var2.t = xg4Var2.u;
                            xg4Var2.u = Integer.MAX_VALUE;
                            if (xg4Var2.v == a14.n) {
                                xg4Var2.v = a14.f282o;
                            }
                        }
                        xx4 xx4VarL2 = layoutNode.L();
                        Object[] objArr2 = xx4VarL2.m;
                        int i3 = xx4VarL2.f2559o;
                        for (int i4 = 0; i4 < i3; i4++) {
                            xg4 xg4Var3 = ((LayoutNode) objArr2[i4]).getLayoutDelegate().q;
                            xg4Var3.getClass();
                            xg4Var3.E.d = false;
                        }
                        si3 si3Var = xg4Var.f().r0;
                        if (si3Var == null) {
                            hk0.l("Expected lookahead delegate");
                            return null;
                        }
                        List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                        int size = children$ui.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            LayoutNode layoutNode2 = children$ui.get(i5);
                            tg4 tg4VarY1 = layoutNode2.getOuterCoordinator$ui().Y0();
                            if (tg4VarY1 != null) {
                                if (tg4VarY1.A) {
                                    if (zw4Var == null) {
                                        zw4Var = new zw4();
                                    }
                                    zw4Var.a(layoutNode2);
                                }
                                tg4VarY1.A = si3Var.A;
                            }
                        }
                        si3Var.F0().d();
                        List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                        int size2 = children$ui2.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                xx4 xx4VarL3 = layoutNode.L();
                                Object[] objArr3 = xx4VarL3.m;
                                int i7 = xx4VarL3.f2559o;
                                for (int i8 = 0; i8 < i7; i8++) {
                                    xg4 xg4Var4 = ((LayoutNode) objArr3[i8]).getLayoutDelegate().q;
                                    xg4Var4.getClass();
                                    int i9 = xg4Var4.t;
                                    int i10 = xg4Var4.u;
                                    if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                                        xg4Var4.p0(true);
                                    }
                                }
                                xx4 xx4VarL4 = layoutNode.L();
                                Object[] objArr4 = xx4VarL4.m;
                                int i11 = xx4VarL4.f2559o;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    xg4 xg4Var5 = ((LayoutNode) objArr4[i12]).getLayoutDelegate().q;
                                    xg4Var5.getClass();
                                    c14 c14Var = xg4Var5.E;
                                    c14Var.e = c14Var.d;
                                }
                                return f88Var;
                            }
                            LayoutNode layoutNode3 = children$ui2.get(i6);
                            boolean z = zw4Var != null && zw4Var.g(layoutNode3) >= 0;
                            tg4 tg4VarY2 = layoutNode3.getOuterCoordinator$ui().Y0();
                            if (tg4VarY2 != null) {
                                tg4VarY2.A = z;
                            }
                            i6++;
                        }
                        break;
                    case 1:
                        tg4 tg4VarY3 = xg4Var.r.a().Y0();
                        tg4VarY3.getClass();
                        tg4VarY3.C(xg4Var.L);
                        return f88Var;
                    default:
                        f14 f14Var3 = xg4Var.r;
                        if (io1.X(f14Var3.a) || f14Var3.c) {
                            e45 e45Var = f14Var3.a().K;
                            if (e45Var != null) {
                                placementScope = e45Var.B;
                            }
                        } else {
                            e45 e45Var2 = f14Var3.a().K;
                            if (e45Var2 != null && (tg4VarY0 = e45Var2.Y0()) != null) {
                                placementScope = tg4VarY0.B;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = e14.a(f14Var3.a).getPlacementScope();
                        }
                        tg4 tg4VarY4 = f14Var3.a().Y0();
                        tg4VarY4.getClass();
                        il5.j(placementScope, tg4VarY4, xg4Var.A);
                        return f88Var;
                }
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    @Override // o.zn4
    public final jl5 C(long j) {
        a14 a14Var;
        f14 f14Var = this.r;
        LayoutNode layoutNode = f14Var.a;
        LayoutNode layoutNode2 = f14Var.a;
        LayoutNode layoutNodeF = layoutNode.F();
        if ((layoutNodeF != null ? layoutNodeF.v() : null) == y04.n) {
            f14Var.b = false;
        } else {
            LayoutNode layoutNodeF2 = layoutNode2.F();
            if ((layoutNodeF2 != null ? layoutNodeF2.v() : null) == y04.p) {
                f14Var.b = false;
            }
        }
        LayoutNode layoutNodeF3 = layoutNode2.F();
        a14 a14Var2 = a14.f282o;
        if (layoutNodeF3 != null) {
            if (this.v != a14Var2 && !layoutNode2.R) {
                ki3.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = layoutNodeF3.v().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                a14Var = a14.m;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    hk0.n(layoutNodeF3.v(), "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                a14Var = a14.n;
            }
            this.v = a14Var;
        } else {
            this.v = a14Var2;
        }
        if (layoutNode2.P == a14Var2) {
            layoutNode2.f();
        }
        D0(j);
        return this;
    }

    public final boolean D0(long j) {
        f14 f14Var = this.r;
        LayoutNode layoutNode = f14Var.a;
        LayoutNode layoutNode2 = f14Var.a;
        try {
            if (layoutNode.c0) {
                ki3.a("measure is called on a deactivated node");
            }
            LayoutNode layoutNodeF = layoutNode2.F();
            layoutNode2.R = layoutNode2.R || (layoutNodeF != null && layoutNodeF.R);
            if (!layoutNode2.x()) {
                r61 r61Var = this.z;
                if (r61Var == null ? false : r61.c(r61Var.a, j)) {
                    Owner owner = layoutNode2.A;
                    if (owner != null) {
                        ((AndroidComposeView) owner).h(layoutNode2, true);
                    }
                    layoutNode2.w0();
                    return false;
                }
            }
            this.z = new r61(j);
            j0(j);
            this.E.f = false;
            xx4 xx4VarL = layoutNode2.L();
            Object[] objArr = xx4VarL.m;
            int i = xx4VarL.f2559o;
            for (int i2 = 0; i2 < i; i2++) {
                xg4 xg4Var = ((LayoutNode) objArr[i2]).getLayoutDelegate().q;
                xg4Var.getClass();
                xg4Var.E.c = false;
            }
            long j2 = this.y ? this.f1179o : -9223372034707292160L;
            this.y = true;
            tg4 tg4VarY0 = f14Var.a().Y0();
            if (tg4VarY0 == null) {
                ki3.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            f14Var.c(j);
            f0((((long) tg4VarY0.m) << 32) | (((long) tg4VarY0.n) & 4294967295L));
            return (((int) (j2 >> 32)) == tg4VarY0.m && ((int) (j2 & 4294967295L)) == tg4VarY0.n) ? false : true;
        } catch (Throwable th) {
            layoutNode.x0(th);
            throw null;
        }
    }

    @Override // o.jl5, o.zn4
    public final Object E() {
        return this.K;
    }

    @Override // o.bu4
    public final void H(boolean z) {
        tg4 tg4VarY0;
        f14 f14Var = this.r;
        tg4 tg4VarY1 = f14Var.a().Y0();
        if (Boolean.valueOf(z).equals(tg4VarY1 != null ? Boolean.valueOf(tg4VarY1.x) : null) || (tg4VarY0 = f14Var.a().Y0()) == null) {
            return;
        }
        tg4VarY0.x = z;
    }

    @Override // o.me
    public final void J(q0 q0Var) throws JSONException {
        xx4 xx4VarL = this.r.a.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            xg4 xg4Var = ((LayoutNode) objArr[i2]).getLayoutDelegate().q;
            xg4Var.getClass();
            q0Var.invoke(xg4Var);
        }
    }

    @Override // o.me
    public final void M() {
        this.H = true;
        c14 c14Var = this.E;
        c14Var.h();
        f14 f14Var = this.r;
        boolean z = f14Var.f;
        LayoutNode layoutNode = f14Var.a;
        if (z) {
            xx4 xx4VarL = layoutNode.L();
            Object[] objArr = xx4VarL.m;
            int i = xx4VarL.f2559o;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
                if (layoutNode2.x() && layoutNode2.C() == a14.m) {
                    xg4 xg4Var = layoutNode2.getLayoutDelegate().q;
                    xg4Var.getClass();
                    xg4 xg4Var2 = layoutNode2.getLayoutDelegate().q;
                    r61 r61Var = xg4Var2 != null ? xg4Var2.z : null;
                    r61Var.getClass();
                    if (xg4Var.D0(r61Var.a)) {
                        LayoutNode.s0(layoutNode, false, 7);
                    }
                }
            }
        }
        si3 si3Var = f().r0;
        si3Var.getClass();
        if (f14Var.g || (!this.w && !si3Var.A && f14Var.f)) {
            f14Var.f = false;
            y04 y04Var = f14Var.d;
            f14Var.d = y04.p;
            f14Var.i(false);
            pc5 snapshotObserver = e14.a(layoutNode).getSnapshotObserver();
            snapshotObserver.a.f(layoutNode, snapshotObserver.h, this.I);
            f14Var.d = y04Var;
            if (f14Var.m && si3Var.A) {
                requestLayout();
            }
            f14Var.g = false;
        }
        if (c14Var.d) {
            c14Var.e = true;
        }
        if (c14Var.b && c14Var.e()) {
            c14Var.g();
        }
        this.H = false;
    }

    @Override // o.me
    public final void Q() {
        LayoutNode.s0(this.r.a, false, 7);
    }

    @Override // o.zn4
    public final int V(int i) {
        v0();
        tg4 tg4VarY0 = this.r.a().Y0();
        tg4VarY0.getClass();
        return tg4VarY0.V(i);
    }

    @Override // o.jl5
    public final int W(ie ieVar) {
        f14 f14Var = this.r;
        LayoutNode layoutNodeF = f14Var.a.F();
        y04 y04VarV = layoutNodeF != null ? layoutNodeF.v() : null;
        y04 y04Var = y04.n;
        c14 c14Var = this.E;
        if (y04VarV == y04Var) {
            c14Var.c = true;
        } else {
            LayoutNode layoutNodeF2 = f14Var.a.F();
            if ((layoutNodeF2 != null ? layoutNodeF2.v() : null) == y04.p) {
                c14Var.d = true;
            }
        }
        this.w = true;
        tg4 tg4VarY0 = f14Var.a().Y0();
        tg4VarY0.getClass();
        int iW = tg4VarY0.W(ieVar);
        this.w = false;
        return iW;
    }

    @Override // o.jl5
    public final int X() {
        tg4 tg4VarY0 = this.r.a().Y0();
        tg4VarY0.getClass();
        return tg4VarY0.X();
    }

    @Override // o.jl5
    public final int Y() {
        tg4 tg4VarY0 = this.r.a().Y0();
        tg4VarY0.getClass();
        return tg4VarY0.Y();
    }

    @Override // o.zn4
    public final int a(int i) {
        v0();
        tg4 tg4VarY0 = this.r.a().Y0();
        tg4VarY0.getClass();
        return tg4VarY0.a(i);
    }

    @Override // o.me
    public final c14 c() {
        return this.E;
    }

    @Override // o.jl5
    public final void c0(long j, float f, Function1 function1) {
        z0(j, function1, null);
    }

    @Override // o.jl5
    public final void e0(long j, float f, l03 l03Var) {
        z0(j, null, l03Var);
    }

    @Override // o.me
    public final ti3 f() {
        return (ti3) this.r.a.S.d;
    }

    @Override // o.me
    public final me g() {
        f14 layoutDelegate;
        LayoutNode layoutNodeF = this.r.a.F();
        if (layoutNodeF == null || (layoutDelegate = layoutNodeF.getLayoutDelegate()) == null) {
            return null;
        }
        return layoutDelegate.q;
    }

    @Override // o.zn4
    public final int k(int i) {
        v0();
        tg4 tg4VarY0 = this.r.a().Y0();
        tg4VarY0.getClass();
        return tg4VarY0.k(i);
    }

    @Override // o.me
    public final int l() {
        return this.u;
    }

    public final boolean n0() {
        f14 f14Var = this.r;
        return io1.X(f14Var.a) || f14Var.c;
    }

    @Override // o.zn4
    public final int o(int i) {
        v0();
        tg4 tg4VarY0 = this.r.a().Y0();
        tg4VarY0.getClass();
        return tg4VarY0.o(i);
    }

    public final void p0(boolean z) {
        if (z && n0()) {
            return;
        }
        if (z || n0()) {
            this.D = wg4.f2410o;
            xx4 xx4VarL = this.r.a.L();
            Object[] objArr = xx4VarL.m;
            int i = xx4VarL.f2559o;
            for (int i2 = 0; i2 < i; i2++) {
                xg4 xg4Var = ((LayoutNode) objArr[i2]).getLayoutDelegate().q;
                xg4Var.getClass();
                xg4Var.p0(true);
            }
        }
    }

    public final void r0() {
        wg4 wg4Var = this.D;
        f14 f14Var = this.r;
        boolean z = f14Var.c;
        LayoutNode layoutNode = f14Var.a;
        wg4 wg4Var2 = wg4.m;
        if (z) {
            this.D = wg4.n;
        } else {
            this.D = wg4Var2;
        }
        if (wg4Var != wg4Var2 && f14Var.e) {
            LayoutNode.s0(layoutNode, true, 6);
        }
        xx4 xx4VarL = layoutNode.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            xg4 xg4VarY = layoutNode2.y();
            if (xg4VarY == null) {
                hk0.g("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (xg4VarY.u != Integer.MAX_VALUE) {
                xg4VarY.r0();
                LayoutNode.v0(layoutNode2);
            }
        }
    }

    @Override // o.me
    public final void requestLayout() {
        this.r.a.r0(false);
    }

    public final void u0() {
        f14 f14Var = this.r;
        if (f14Var.f760o > 0) {
            xx4 xx4VarL = f14Var.a.L();
            Object[] objArr = xx4VarL.m;
            int i = xx4VarL.f2559o;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                f14 layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.m || layoutDelegate.n) && !layoutDelegate.f) {
                    layoutNode.r0(false);
                }
                xg4 xg4Var = layoutDelegate.q;
                if (xg4Var != null) {
                    xg4Var.u0();
                }
            }
        }
    }

    public final void v0() {
        a14 a14Var;
        f14 f14Var = this.r;
        LayoutNode.s0(f14Var.a, false, 7);
        LayoutNode layoutNode = f14Var.a;
        LayoutNode layoutNodeF = layoutNode.F();
        if (layoutNodeF == null || layoutNode.P != a14.f282o) {
            return;
        }
        int iOrdinal = layoutNodeF.v().ordinal();
        if (iOrdinal != 0) {
            a14Var = iOrdinal != 2 ? layoutNodeF.P : a14.n;
        } else {
            a14Var = a14.m;
        }
        layoutNode.P = a14Var;
    }

    public final void x0() {
        this.O = true;
        f14 f14Var = this.r;
        LayoutNode layoutNodeF = f14Var.a.F();
        wg4 wg4Var = this.D;
        if ((wg4Var != wg4.m && !f14Var.c) || (wg4Var != wg4.n && f14Var.c)) {
            r0();
            if (this.s && layoutNodeF != null) {
                layoutNodeF.r0(false);
            }
        }
        if (layoutNodeF == null) {
            this.u = 0;
        } else if (!this.s && (layoutNodeF.v() == y04.f2568o || layoutNodeF.v() == y04.p)) {
            if (this.u != Integer.MAX_VALUE) {
                ki3.c("Place was called on a node which was placed already");
            }
            this.u = layoutNodeF.getLayoutDelegate().h;
            layoutNodeF.getLayoutDelegate().h++;
        }
        M();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006e A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0007, B:5:0x000d, B:9:0x0016, B:11:0x001b, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0082, B:31:0x006e), top: B:36:0x0007 }] */
    public final void z0(long j, Function1 function1, l03 l03Var) {
        f14 f14Var = this.r;
        LayoutNode layoutNode = f14Var.a;
        LayoutNode layoutNode2 = f14Var.a;
        try {
            LayoutNode layoutNodeF = layoutNode.F();
            y04 y04VarV = layoutNodeF != null ? layoutNodeF.v() : null;
            y04 y04Var = y04.p;
            if (y04VarV == y04Var) {
                f14Var.c = false;
            }
            if (layoutNode2.c0) {
                ki3.a("place is called on a deactivated node");
            }
            f14Var.d = y04Var;
            boolean z = true;
            this.x = true;
            this.O = false;
            if (!vk3.a(j, this.A)) {
                if (f14Var.n || f14Var.m) {
                    f14Var.f = true;
                }
                u0();
            }
            Owner ownerA = e14.a(layoutNode2);
            this.A = j;
            if (f14Var.f) {
                f14Var.h(false);
                this.E.g = false;
                pc5 snapshotObserver = ownerA.getSnapshotObserver();
                snapshotObserver.a.f(layoutNode2, snapshotObserver.g, this.N);
            } else {
                if (this.D == wg4.f2410o) {
                    z = false;
                }
                if (z) {
                    tg4 tg4VarY0 = f14Var.a().Y0();
                    tg4VarY0.getClass();
                    tg4VarY0.R0(vk3.c(j, tg4VarY0.q));
                    x0();
                } else {
                    f14Var.h(false);
                    this.E.g = false;
                    pc5 snapshotObserver2 = ownerA.getSnapshotObserver();
                    snapshotObserver2.a.f(layoutNode2, snapshotObserver2.g, this.N);
                }
            }
            this.B = function1;
            this.C = l03Var;
            f14Var.d = y04.q;
        } catch (Throwable th) {
            layoutNode.x0(th);
            throw null;
        }
    }
}
