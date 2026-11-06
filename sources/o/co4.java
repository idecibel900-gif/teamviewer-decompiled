package o;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class co4 extends jl5 implements zn4, me, bu4 {
    public Function1 A;
    public l03 B;
    public float C;
    public Object E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean N;
    public final bo4 P;
    public final bo4 Q;
    public float R;
    public boolean S;
    public Function1 T;
    public l03 U;
    public float W;
    public final bo4 X;
    public boolean Y;
    public final f14 r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean y;
    public int t = Integer.MAX_VALUE;
    public int u = Integer.MAX_VALUE;
    public a14 x = a14.f282o;
    public long z = 0;
    public boolean D = true;
    public final c14 K = new c14(this, (byte) 0);
    public final xx4 L = new xx4(new co4[16]);
    public boolean M = true;
    public long O = t61.b(0, 0, 0, 0, 15);
    public long V = 0;

    /* JADX WARN: Type inference failed for: r2v3, types: [o.bo4] */
    /* JADX WARN: Type inference failed for: r2v4, types: [o.bo4] */
    /* JADX WARN: Type inference failed for: r7v4, types: [o.bo4] */
    public co4(f14 f14Var) {
        this.r = f14Var;
        final byte b = 1;
        final byte b2 = 0;
        this.P = new Function0(this) { // from class: o.bo4
            public final /* synthetic */ co4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                f88 f88Var = f88.a;
                co4 co4Var = this.n;
                switch (b3) {
                    case 0:
                        co4Var.r.a().C(co4Var.O);
                        break;
                    case 1:
                        f14 f14Var2 = co4Var.r;
                        f14Var2.i = 0;
                        LayoutNode layoutNode = f14Var2.a;
                        xx4 xx4VarL = layoutNode.L();
                        Object[] objArr = xx4VarL.m;
                        int i = xx4VarL.f2559o;
                        for (int i2 = 0; i2 < i; i2++) {
                            co4 co4VarZ = ((LayoutNode) objArr[i2]).z();
                            co4VarZ.t = co4VarZ.u;
                            co4VarZ.u = Integer.MAX_VALUE;
                            co4VarZ.G = false;
                            if (co4VarZ.x == a14.n) {
                                co4VarZ.x = a14.f282o;
                            }
                        }
                        xx4 xx4VarL2 = layoutNode.L();
                        Object[] objArr2 = xx4VarL2.m;
                        int i3 = xx4VarL2.f2559o;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((LayoutNode) objArr2[i4]).getLayoutDelegate().p.K.d = false;
                        }
                        if (co4Var.f().A) {
                            List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                            int size = children$ui.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                children$ui.get(i5).getOuterCoordinator$ui().A = true;
                            }
                        }
                        co4Var.f().F0().d();
                        if (co4Var.f().A) {
                            List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                            int size2 = children$ui2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                children$ui2.get(i6).getOuterCoordinator$ui().A = false;
                            }
                        }
                        xx4 xx4VarL3 = layoutNode.L();
                        Object[] objArr3 = xx4VarL3.m;
                        int i7 = xx4VarL3.f2559o;
                        for (int i8 = 0; i8 < i7; i8++) {
                            LayoutNode layoutNode2 = (LayoutNode) objArr3[i8];
                            if (layoutNode2.z().t != layoutNode2.G()) {
                                layoutNode.k0();
                                layoutNode.P();
                                if (layoutNode2.G() == Integer.MAX_VALUE) {
                                    if (layoutNode2.getLayoutDelegate().c || io1.X(layoutNode2)) {
                                        xg4 xg4VarY = layoutNode2.y();
                                        xg4VarY.getClass();
                                        xg4VarY.p0(false);
                                    }
                                    layoutNode2.z().r0();
                                }
                            }
                        }
                        xx4 xx4VarL4 = layoutNode.L();
                        Object[] objArr4 = xx4VarL4.m;
                        int i9 = xx4VarL4.f2559o;
                        for (int i10 = 0; i10 < i9; i10++) {
                            c14 c14Var = ((LayoutNode) objArr4[i10]).getLayoutDelegate().p.K;
                            c14Var.e = c14Var.d;
                        }
                        break;
                    default:
                        f14 f14Var3 = co4Var.r;
                        e45 e45Var = f14Var3.a().K;
                        il5 placementScope = e45Var != null ? e45Var.B : e14.a(f14Var3.a).getPlacementScope();
                        Function1 function1 = co4Var.T;
                        l03 l03Var = co4Var.U;
                        if (l03Var != null) {
                            e45 e45VarA = f14Var3.a();
                            long j = co4Var.V;
                            float f = co4Var.W;
                            placementScope.f(e45VarA);
                            e45VarA.e0(vk3.c(j, e45VarA.q), f, l03Var);
                        } else if (function1 == null) {
                            e45 e45VarA2 = f14Var3.a();
                            long j2 = co4Var.V;
                            float f2 = co4Var.W;
                            placementScope.f(e45VarA2);
                            e45VarA2.c0(vk3.c(j2, e45VarA2.q), f2, null);
                        } else {
                            e45 e45VarA3 = f14Var3.a();
                            long j3 = co4Var.V;
                            float f3 = co4Var.W;
                            placementScope.f(e45VarA3);
                            e45VarA3.c0(vk3.c(j3, e45VarA3.q), f3, function1);
                        }
                        break;
                }
                return f88Var;
            }
        };
        this.Q = new Function0(this) { // from class: o.bo4
            public final /* synthetic */ co4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b;
                f88 f88Var = f88.a;
                co4 co4Var = this.n;
                switch (b3) {
                    case 0:
                        co4Var.r.a().C(co4Var.O);
                        break;
                    case 1:
                        f14 f14Var2 = co4Var.r;
                        f14Var2.i = 0;
                        LayoutNode layoutNode = f14Var2.a;
                        xx4 xx4VarL = layoutNode.L();
                        Object[] objArr = xx4VarL.m;
                        int i = xx4VarL.f2559o;
                        for (int i2 = 0; i2 < i; i2++) {
                            co4 co4VarZ = ((LayoutNode) objArr[i2]).z();
                            co4VarZ.t = co4VarZ.u;
                            co4VarZ.u = Integer.MAX_VALUE;
                            co4VarZ.G = false;
                            if (co4VarZ.x == a14.n) {
                                co4VarZ.x = a14.f282o;
                            }
                        }
                        xx4 xx4VarL2 = layoutNode.L();
                        Object[] objArr2 = xx4VarL2.m;
                        int i3 = xx4VarL2.f2559o;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((LayoutNode) objArr2[i4]).getLayoutDelegate().p.K.d = false;
                        }
                        if (co4Var.f().A) {
                            List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                            int size = children$ui.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                children$ui.get(i5).getOuterCoordinator$ui().A = true;
                            }
                        }
                        co4Var.f().F0().d();
                        if (co4Var.f().A) {
                            List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                            int size2 = children$ui2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                children$ui2.get(i6).getOuterCoordinator$ui().A = false;
                            }
                        }
                        xx4 xx4VarL3 = layoutNode.L();
                        Object[] objArr3 = xx4VarL3.m;
                        int i7 = xx4VarL3.f2559o;
                        for (int i8 = 0; i8 < i7; i8++) {
                            LayoutNode layoutNode2 = (LayoutNode) objArr3[i8];
                            if (layoutNode2.z().t != layoutNode2.G()) {
                                layoutNode.k0();
                                layoutNode.P();
                                if (layoutNode2.G() == Integer.MAX_VALUE) {
                                    if (layoutNode2.getLayoutDelegate().c || io1.X(layoutNode2)) {
                                        xg4 xg4VarY = layoutNode2.y();
                                        xg4VarY.getClass();
                                        xg4VarY.p0(false);
                                    }
                                    layoutNode2.z().r0();
                                }
                            }
                        }
                        xx4 xx4VarL4 = layoutNode.L();
                        Object[] objArr4 = xx4VarL4.m;
                        int i9 = xx4VarL4.f2559o;
                        for (int i10 = 0; i10 < i9; i10++) {
                            c14 c14Var = ((LayoutNode) objArr4[i10]).getLayoutDelegate().p.K;
                            c14Var.e = c14Var.d;
                        }
                        break;
                    default:
                        f14 f14Var3 = co4Var.r;
                        e45 e45Var = f14Var3.a().K;
                        il5 placementScope = e45Var != null ? e45Var.B : e14.a(f14Var3.a).getPlacementScope();
                        Function1 function1 = co4Var.T;
                        l03 l03Var = co4Var.U;
                        if (l03Var != null) {
                            e45 e45VarA = f14Var3.a();
                            long j = co4Var.V;
                            float f = co4Var.W;
                            placementScope.f(e45VarA);
                            e45VarA.e0(vk3.c(j, e45VarA.q), f, l03Var);
                        } else if (function1 == null) {
                            e45 e45VarA2 = f14Var3.a();
                            long j2 = co4Var.V;
                            float f2 = co4Var.W;
                            placementScope.f(e45VarA2);
                            e45VarA2.c0(vk3.c(j2, e45VarA2.q), f2, null);
                        } else {
                            e45 e45VarA3 = f14Var3.a();
                            long j3 = co4Var.V;
                            float f3 = co4Var.W;
                            placementScope.f(e45VarA3);
                            e45VarA3.c0(vk3.c(j3, e45VarA3.q), f3, function1);
                        }
                        break;
                }
                return f88Var;
            }
        };
        final byte b3 = 2;
        this.X = new Function0(this) { // from class: o.bo4
            public final /* synthetic */ co4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b4 = b3;
                f88 f88Var = f88.a;
                co4 co4Var = this.n;
                switch (b4) {
                    case 0:
                        co4Var.r.a().C(co4Var.O);
                        break;
                    case 1:
                        f14 f14Var2 = co4Var.r;
                        f14Var2.i = 0;
                        LayoutNode layoutNode = f14Var2.a;
                        xx4 xx4VarL = layoutNode.L();
                        Object[] objArr = xx4VarL.m;
                        int i = xx4VarL.f2559o;
                        for (int i2 = 0; i2 < i; i2++) {
                            co4 co4VarZ = ((LayoutNode) objArr[i2]).z();
                            co4VarZ.t = co4VarZ.u;
                            co4VarZ.u = Integer.MAX_VALUE;
                            co4VarZ.G = false;
                            if (co4VarZ.x == a14.n) {
                                co4VarZ.x = a14.f282o;
                            }
                        }
                        xx4 xx4VarL2 = layoutNode.L();
                        Object[] objArr2 = xx4VarL2.m;
                        int i3 = xx4VarL2.f2559o;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((LayoutNode) objArr2[i4]).getLayoutDelegate().p.K.d = false;
                        }
                        if (co4Var.f().A) {
                            List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                            int size = children$ui.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                children$ui.get(i5).getOuterCoordinator$ui().A = true;
                            }
                        }
                        co4Var.f().F0().d();
                        if (co4Var.f().A) {
                            List<LayoutNode> children$ui2 = layoutNode.getChildren$ui();
                            int size2 = children$ui2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                children$ui2.get(i6).getOuterCoordinator$ui().A = false;
                            }
                        }
                        xx4 xx4VarL3 = layoutNode.L();
                        Object[] objArr3 = xx4VarL3.m;
                        int i7 = xx4VarL3.f2559o;
                        for (int i8 = 0; i8 < i7; i8++) {
                            LayoutNode layoutNode2 = (LayoutNode) objArr3[i8];
                            if (layoutNode2.z().t != layoutNode2.G()) {
                                layoutNode.k0();
                                layoutNode.P();
                                if (layoutNode2.G() == Integer.MAX_VALUE) {
                                    if (layoutNode2.getLayoutDelegate().c || io1.X(layoutNode2)) {
                                        xg4 xg4VarY = layoutNode2.y();
                                        xg4VarY.getClass();
                                        xg4VarY.p0(false);
                                    }
                                    layoutNode2.z().r0();
                                }
                            }
                        }
                        xx4 xx4VarL4 = layoutNode.L();
                        Object[] objArr4 = xx4VarL4.m;
                        int i9 = xx4VarL4.f2559o;
                        for (int i10 = 0; i10 < i9; i10++) {
                            c14 c14Var = ((LayoutNode) objArr4[i10]).getLayoutDelegate().p.K;
                            c14Var.e = c14Var.d;
                        }
                        break;
                    default:
                        f14 f14Var3 = co4Var.r;
                        e45 e45Var = f14Var3.a().K;
                        il5 placementScope = e45Var != null ? e45Var.B : e14.a(f14Var3.a).getPlacementScope();
                        Function1 function1 = co4Var.T;
                        l03 l03Var = co4Var.U;
                        if (l03Var != null) {
                            e45 e45VarA = f14Var3.a();
                            long j = co4Var.V;
                            float f = co4Var.W;
                            placementScope.f(e45VarA);
                            e45VarA.e0(vk3.c(j, e45VarA.q), f, l03Var);
                        } else if (function1 == null) {
                            e45 e45VarA2 = f14Var3.a();
                            long j2 = co4Var.V;
                            float f2 = co4Var.W;
                            placementScope.f(e45VarA2);
                            e45VarA2.c0(vk3.c(j2, e45VarA2.q), f2, null);
                        } else {
                            e45 e45VarA3 = f14Var3.a();
                            long j3 = co4Var.V;
                            float f3 = co4Var.W;
                            placementScope.f(e45VarA3);
                            e45VarA3.c0(vk3.c(j3, e45VarA3.q), f3, function1);
                        }
                        break;
                }
                return f88Var;
            }
        };
    }

    @Override // o.zn4
    public final jl5 C(long j) {
        a14 a14Var;
        f14 f14Var = this.r;
        LayoutNode layoutNode = f14Var.a;
        LayoutNode layoutNode2 = f14Var.a;
        a14 a14Var2 = layoutNode.P;
        a14 a14Var3 = a14.f282o;
        if (a14Var2 == a14Var3) {
            layoutNode.f();
        }
        if (io1.X(layoutNode2)) {
            xg4 xg4Var = f14Var.q;
            xg4Var.getClass();
            xg4Var.v = a14Var3;
            xg4Var.C(j);
        }
        LayoutNode layoutNodeF = layoutNode2.F();
        if (layoutNodeF != null) {
            if (this.x != a14Var3 && !layoutNode2.R) {
                ki3.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = layoutNodeF.v().ordinal();
            if (iOrdinal == 0) {
                a14Var = a14.m;
            } else {
                if (iOrdinal != 2) {
                    hk0.n(layoutNodeF.v(), "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                a14Var = a14.n;
            }
            this.x = a14Var;
        } else {
            this.x = a14Var3;
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
            Owner ownerA = e14.a(layoutNode2);
            LayoutNode layoutNodeF = layoutNode2.F();
            boolean z = true;
            layoutNode2.R = layoutNode2.R || (layoutNodeF != null && layoutNodeF.R);
            if (!layoutNode2.A() && r61.c(this.p, j)) {
                ((AndroidComposeView) ownerA).h(layoutNode2, false);
                layoutNode2.w0();
                return false;
            }
            this.K.f = false;
            xx4 xx4VarL = layoutNode2.L();
            Object[] objArr = xx4VarL.m;
            int i = xx4VarL.f2559o;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).getLayoutDelegate().p.K.c = false;
            }
            this.v = true;
            long j2 = f14Var.a().f1179o;
            j0(j);
            y04 y04Var = f14Var.d;
            y04 y04Var2 = y04.q;
            if (y04Var != y04Var2) {
                ki3.c("layout state is not idle before measure starts");
            }
            this.O = j;
            y04 y04Var3 = y04.m;
            f14Var.d = y04Var3;
            this.H = false;
            pc5 snapshotObserver = e14.a(layoutNode2).getSnapshotObserver();
            snapshotObserver.a.f(layoutNode2, snapshotObserver.c, this.P);
            if (f14Var.d == y04Var3) {
                this.I = true;
                this.J = true;
                f14Var.d = y04Var2;
            }
            if (dl3.b(f14Var.a().f1179o, j2) && f14Var.a().m == this.m && f14Var.a().n == this.n) {
                z = false;
            }
            f0((((long) f14Var.a().n) & 4294967295L) | (((long) f14Var.a().m) << 32));
            return z;
        } catch (Throwable th) {
            layoutNode.x0(th);
            throw null;
        }
    }

    @Override // o.jl5, o.zn4
    public final Object E() {
        return this.E;
    }

    public final void F0() {
        f14 f14Var = this.r;
        LayoutNode layoutNode = f14Var.a;
        LayoutNode layoutNode2 = f14Var.a;
        if (!layoutNode.X() || f14Var.l <= 0) {
            return;
        }
        f14 layoutDelegate = layoutNode2.getLayoutDelegate();
        if ((layoutDelegate.j || layoutDelegate.k) && !layoutDelegate.p.I) {
            layoutNode2.t0(false);
        }
        xx4 xx4VarL = layoutNode2.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).z().F0();
        }
    }

    @Override // o.bu4
    public final void H(boolean z) {
        f14 f14Var = this.r;
        if (z != f14Var.a().x) {
            f14Var.a().x = z;
            this.Y = true;
        }
    }

    @Override // o.me
    public final void J(q0 q0Var) throws JSONException {
        xx4 xx4VarL = this.r.a.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            q0Var.invoke(((LayoutNode) objArr[i2]).getLayoutDelegate().p);
        }
    }

    @Override // o.me
    public final void M() {
        this.N = true;
        c14 c14Var = this.K;
        c14Var.h();
        boolean z = this.I;
        f14 f14Var = this.r;
        if (z) {
            xx4 xx4VarL = f14Var.a.L();
            Object[] objArr = xx4VarL.m;
            int i = xx4VarL.f2559o;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                if (layoutNode.A() && layoutNode.B() == a14.m && LayoutNode.n0(layoutNode)) {
                    LayoutNode.u0(f14Var.a, false, 7);
                }
            }
        }
        if (this.J || (!this.y && !f().A && this.I)) {
            this.I = false;
            y04 y04Var = f14Var.d;
            f14Var.d = y04.f2568o;
            f14Var.g(false);
            LayoutNode layoutNode2 = f14Var.a;
            pc5 snapshotObserver = e14.a(layoutNode2).getSnapshotObserver();
            snapshotObserver.a.f(layoutNode2, snapshotObserver.e, this.Q);
            f14Var.d = y04Var;
            this.J = false;
        }
        if (c14Var.d) {
            c14Var.e = true;
        }
        if (c14Var.b && c14Var.e()) {
            c14Var.g();
        }
        this.N = false;
    }

    @Override // o.me
    public final void Q() {
        LayoutNode.u0(this.r.a, false, 7);
    }

    @Override // o.zn4
    public final int V(int i) {
        f14 f14Var = this.r;
        if (!io1.X(f14Var.a)) {
            u0();
            return f14Var.a().V(i);
        }
        xg4 xg4Var = f14Var.q;
        xg4Var.getClass();
        return xg4Var.V(i);
    }

    @Override // o.jl5
    public final int W(ie ieVar) {
        f14 f14Var = this.r;
        LayoutNode layoutNodeF = f14Var.a.F();
        y04 y04VarV = layoutNodeF != null ? layoutNodeF.v() : null;
        y04 y04Var = y04.m;
        c14 c14Var = this.K;
        if (y04VarV == y04Var) {
            c14Var.c = true;
        } else {
            LayoutNode layoutNodeF2 = f14Var.a.F();
            if ((layoutNodeF2 != null ? layoutNodeF2.v() : null) == y04.f2568o) {
                c14Var.d = true;
            }
        }
        this.y = true;
        int iW = f14Var.a().W(ieVar);
        this.y = false;
        return iW;
    }

    @Override // o.jl5
    public final int X() {
        return this.r.a().X();
    }

    @Override // o.jl5
    public final int Y() {
        return this.r.a().Y();
    }

    @Override // o.zn4
    public final int a(int i) {
        f14 f14Var = this.r;
        if (!io1.X(f14Var.a)) {
            u0();
            return f14Var.a().a(i);
        }
        xg4 xg4Var = f14Var.q;
        xg4Var.getClass();
        return xg4Var.a(i);
    }

    @Override // o.me
    public final c14 c() {
        return this.K;
    }

    @Override // o.jl5
    public final void c0(long j, float f, Function1 function1) {
        z0(j, f, function1, null);
    }

    @Override // o.jl5
    public final void e0(long j, float f, l03 l03Var) {
        z0(j, f, null, l03Var);
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
        return layoutDelegate.p;
    }

    @Override // o.zn4
    public final int k(int i) {
        f14 f14Var = this.r;
        if (!io1.X(f14Var.a)) {
            u0();
            return f14Var.a().k(i);
        }
        xg4 xg4Var = f14Var.q;
        xg4Var.getClass();
        return xg4Var.k(i);
    }

    @Override // o.me
    public final int l() {
        return this.u;
    }

    public final List n0() {
        f14 f14Var = this.r;
        f14Var.a.E0();
        boolean z = this.M;
        xx4 xx4Var = this.L;
        if (!z) {
            return xx4Var.f();
        }
        LayoutNode layoutNode = f14Var.a;
        xx4 xx4VarL = layoutNode.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (xx4Var.f2559o <= i2) {
                xx4Var.b(layoutNode2.getLayoutDelegate().p);
            } else {
                co4 co4Var = layoutNode2.getLayoutDelegate().p;
                Object[] objArr2 = xx4Var.m;
                Object obj = objArr2[i2];
                objArr2[i2] = co4Var;
            }
        }
        xx4Var.l(layoutNode.getChildren$ui().size(), xx4Var.f2559o);
        this.M = false;
        return xx4Var.f();
    }

    @Override // o.zn4
    public final int o(int i) {
        f14 f14Var = this.r;
        if (!io1.X(f14Var.a)) {
            u0();
            return f14Var.a().o(i);
        }
        xg4 xg4Var = f14Var.q;
        xg4Var.getClass();
        return xg4Var.o(i);
    }

    public final void p0() {
        boolean z = this.F;
        this.F = true;
        f14 f14Var = this.r;
        LayoutNode layoutNode = f14Var.a;
        nf nfVar = layoutNode.S;
        if (!z) {
            ((ti3) nfVar.d).m1();
            e14.a(layoutNode).getRectManager().g(f14Var.a);
            if (layoutNode.A()) {
                LayoutNode.u0(layoutNode, true, 6);
            } else if (layoutNode.x()) {
                LayoutNode.s0(layoutNode, true, 6);
            }
        }
        e45 e45Var = ((ti3) nfVar.d).J;
        for (e45 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui(); !im3.n(outerCoordinator$ui, e45Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.J) {
            if (outerCoordinator$ui.g0) {
                outerCoordinator$ui.i1();
            }
        }
        xx4 xx4VarL = layoutNode.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.G() != Integer.MAX_VALUE) {
                layoutNode2.z().p0();
                LayoutNode.v0(layoutNode2);
            }
        }
    }

    public final void r0() {
        if (this.F) {
            this.F = false;
            f14 f14Var = this.r;
            LayoutNode layoutNode = f14Var.a;
            LayoutNode layoutNode2 = f14Var.a;
            e14.a(layoutNode).getRectManager().h(layoutNode2);
            e45 e45Var = ((ti3) layoutNode2.S.d).J;
            for (e45 outerCoordinator$ui = layoutNode2.getOuterCoordinator$ui(); !im3.n(outerCoordinator$ui, e45Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.J) {
                outerCoordinator$ui.o1();
                outerCoordinator$ui.t1();
            }
            xx4 xx4VarL = layoutNode2.L();
            Object[] objArr = xx4VarL.m;
            int i = xx4VarL.f2559o;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).z().r0();
            }
        }
    }

    @Override // o.me
    public final void requestLayout() {
        this.r.a.t0(false);
    }

    public final void u0() {
        a14 a14Var;
        f14 f14Var = this.r;
        LayoutNode.u0(f14Var.a, false, 7);
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

    public final void v0() {
        this.S = true;
        f14 f14Var = this.r;
        LayoutNode layoutNodeF = f14Var.a.F();
        float f = f().U;
        LayoutNode layoutNode = f14Var.a;
        e45 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        ti3 ti3Var = (ti3) layoutNode.S.d;
        while (outerCoordinator$ui != ti3Var) {
            outerCoordinator$ui.getClass();
            u04 u04Var = (u04) outerCoordinator$ui;
            f += u04Var.U;
            outerCoordinator$ui = u04Var.J;
        }
        if (f != this.R) {
            this.R = f;
            if (layoutNodeF != null) {
                layoutNodeF.k0();
            }
            if (layoutNodeF != null) {
                layoutNodeF.P();
            }
        }
        if (!f().A) {
            boolean z = this.F;
            if (!z || this.K.d()) {
                p0();
            }
            if (z) {
                ((ti3) layoutNode.S.d).m1();
            } else {
                if (layoutNodeF != null) {
                    layoutNodeF.P();
                }
                if (this.s && layoutNodeF != null) {
                    layoutNodeF.t0(false);
                }
            }
        }
        if (layoutNodeF == null) {
            this.u = 0;
        } else if (!this.s && layoutNodeF.v() == y04.f2568o) {
            if (this.u != Integer.MAX_VALUE) {
                ki3.c("Place was called on a node which was placed already");
            }
            this.u = layoutNodeF.getLayoutDelegate().i;
            layoutNodeF.getLayoutDelegate().i++;
        }
        M();
    }

    public final void x0(long j, float f, Function1 function1, l03 l03Var) {
        f14 f14Var = this.r;
        LayoutNode layoutNode = f14Var.a;
        LayoutNode layoutNode2 = f14Var.a;
        if (layoutNode.c0) {
            ki3.a("place is called on a deactivated node");
        }
        f14Var.d = y04.f2568o;
        this.z = j;
        this.C = f;
        this.A = function1;
        this.B = l03Var;
        this.S = false;
        Owner ownerA = e14.a(layoutNode2);
        if (this.I || !this.F) {
            this.K.g = false;
            f14Var.f(false);
            this.T = function1;
            this.V = j;
            this.W = f;
            this.U = l03Var;
            pc5 snapshotObserver = ownerA.getSnapshotObserver();
            snapshotObserver.a.f(layoutNode2, snapshotObserver.f, this.X);
        } else {
            e45 e45VarA = f14Var.a();
            e45VarA.r1(vk3.c(j, e45VarA.q), f, function1, l03Var);
            v0();
        }
        f14Var.d = y04.q;
        if (f14Var.a().A && (f14Var.k || f14Var.j)) {
            requestLayout();
        }
        this.w = true;
    }

    public final void z0(long j, float f, Function1 function1, l03 l03Var) {
        f14 f14Var = this.r;
        LayoutNode layoutNode = f14Var.a;
        LayoutNode layoutNode2 = f14Var.a;
        try {
            this.G = true;
            if (!vk3.a(j, this.z) || function1 != this.A || this.Y) {
                if (f14Var.k || f14Var.j || this.Y) {
                    this.I = true;
                    this.Y = false;
                }
            }
            xg4 xg4Var = f14Var.q;
            if (xg4Var != null) {
                f14 f14Var2 = xg4Var.r;
                if (xg4Var.D == wg4.f2410o && !io1.X(f14Var2.a)) {
                    f14Var2.c = true;
                }
            }
            xg4 xg4Var2 = f14Var.q;
            if (xg4Var2 != null && xg4Var2.n0()) {
                e45 e45Var = f14Var.a().K;
                il5 placementScope = e45Var != null ? e45Var.B : e14.a(layoutNode2).getPlacementScope();
                xg4 xg4Var3 = f14Var.q;
                xg4Var3.getClass();
                LayoutNode layoutNodeF = layoutNode2.F();
                if (layoutNodeF != null) {
                    layoutNodeF.getLayoutDelegate().h = 0;
                }
                xg4Var3.u = Integer.MAX_VALUE;
                placementScope.g(xg4Var3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            xg4 xg4Var4 = f14Var.q;
            if (xg4Var4 != null && !xg4Var4.x) {
                ki3.c("Error: Placement happened before lookahead.");
            }
            x0(j, f, function1, l03Var);
        } catch (Throwable th) {
            layoutNode.x0(th);
            throw null;
        }
    }
}
