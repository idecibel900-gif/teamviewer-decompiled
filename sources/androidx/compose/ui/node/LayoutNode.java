package androidx.compose.ui.node;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import o.a14;
import o.a45;
import o.a65;
import o.ap6;
import o.at4;
import o.b14;
import o.bg5;
import o.c14;
import o.cf6;
import o.co4;
import o.cp6;
import o.cs4;
import o.ct1;
import o.di1;
import o.do4;
import o.e14;
import o.e45;
import o.ea2;
import o.ee8;
import o.es4;
import o.f14;
import o.fs4;
import o.ge8;
import o.gs4;
import o.gz2;
import o.h72;
import o.hk;
import o.hk0;
import o.il5;
import o.im3;
import o.in1;
import o.iu;
import o.j04;
import o.k76;
import o.ka0;
import o.ki3;
import o.kn7;
import o.kp6;
import o.l03;
import o.ll0;
import o.ln5;
import o.mz0;
import o.nc5;
import o.nf;
import o.o03;
import o.oc5;
import o.p14;
import o.pc5;
import o.q01;
import o.ql;
import o.ql1;
import o.r01;
import o.r04;
import o.r61;
import o.rl;
import o.sn1;
import o.tg3;
import o.ti3;
import o.u04;
import o.ua5;
import o.vm1;
import o.vn4;
import o.w01;
import o.w04;
import o.wg4;
import o.x01;
import o.x04;
import o.x53;
import o.x56;
import o.x8;
import o.xg4;
import o.xk1;
import o.xw4;
import o.xx4;
import o.y04;
import o.yf;
import o.yj5;
import o.yt2;
import o.yz0;
import o.zw4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0003:\u0003\u0018\u0019\u001aJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lo/mz0;", "Lo/oc5;", "", "Lo/yz0;", "instance", "", "l", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", "Lo/f14;", "layoutDelegate", "Lo/f14;", "t", "()Lo/f14;", "", "getChildren$ui", "()Ljava/util/List;", "children", "Lo/e45;", "getOuterCoordinator$ui", "()Lo/e45;", "outerCoordinator", "getChildrenInfo", "childrenInfo", "o/z04", "o/y04", "o/a14", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LayoutNode implements mz0, oc5, yz0 {
    public static final cf6 d0 = new cf6("Undefined intrinsics block and it is required", 1);
    public static final tg3 e0 = new tg3(12);
    public static final x04 f0 = new x04();
    public static final hk g0 = new hk(5);
    public Owner A;
    public ge8 B;
    public int C;
    public boolean D;
    public boolean E;
    public ap6 F;
    public boolean G;
    public final xx4 H;
    public boolean I;
    public do4 J;
    public yt2 K;
    public in1 L;
    public j04 M;
    public ee8 N;
    public x01 O;
    public a14 P;
    public a14 Q;
    public boolean R;
    public final nf S;
    public p14 T;
    public e45 U;
    public boolean V;
    public fs4 W;
    public fs4 X;
    public ql Y;
    public rl Z;
    public boolean a0;
    public int b0;
    public boolean c0;
    private final f14 layoutDelegate;
    public final boolean m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13o;
    public long p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean t;
    public LayoutNode u;
    public int v;
    public final yt2 w;
    public xx4 x;
    public boolean y;
    public LayoutNode z;

    public LayoutNode(int i, boolean z) {
        this.m = z;
        this.n = i;
        this.p = 9223372034707292159L;
        this.q = true;
        this.r = true;
        this.s = -4;
        this.w = new yt2((Object) new xx4(new LayoutNode[16]), (Object) new w04(this, (byte) 0), (byte) 27);
        this.H = new xx4(new LayoutNode[16]);
        this.I = true;
        this.J = d0;
        this.L = e14.a;
        this.M = j04.m;
        this.N = f0;
        x01.d.getClass();
        this.O = w01.b;
        a14 a14Var = a14.f282o;
        this.P = a14Var;
        this.Q = a14Var;
        this.S = new nf(this);
        this.layoutDelegate = new f14(this);
        this.V = true;
        this.W = cs4.b;
    }

    public static boolean b0(LayoutNode layoutNode) {
        xg4 xg4Var = layoutNode.layoutDelegate.q;
        return layoutNode.a0(xg4Var != null ? xg4Var.z : null);
    }

    public static final void c(LayoutNode layoutNode) {
        f14 f14Var = layoutNode.layoutDelegate;
        f14Var.p.M = true;
        xg4 xg4Var = f14Var.q;
        if (xg4Var != null) {
            xg4Var.G = true;
        }
    }

    private final String l(LayoutNode instance) {
        String strH = h(0);
        LayoutNode layoutNode = instance.z;
        return "Cannot insert " + instance + " because it already has a parent or an owner. This tree: " + strH + " Other tree: " + (layoutNode != null ? layoutNode.h(0) : null);
    }

    public static boolean n0(LayoutNode layoutNode) {
        co4 co4Var = layoutNode.layoutDelegate.p;
        return layoutNode.m0(co4Var.v ? new r61(co4Var.p) : null);
    }

    public static void s0(LayoutNode layoutNode, boolean z, int i) {
        LayoutNode layoutNodeF;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (layoutNode.u == null) {
            ki3.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        Owner owner = layoutNode.A;
        if (owner == null || layoutNode.D || layoutNode.m) {
            return;
        }
        ((AndroidComposeView) owner).w(layoutNode, true, z, z2);
        if (z3) {
            xg4 xg4Var = layoutNode.layoutDelegate.q;
            xg4Var.getClass();
            f14 f14Var = xg4Var.r;
            LayoutNode layoutNodeF2 = f14Var.a.F();
            a14 a14Var = f14Var.a.P;
            if (layoutNodeF2 == null || a14Var == a14.f282o) {
                return;
            }
            while (layoutNodeF2.P == a14Var && (layoutNodeF = layoutNodeF2.F()) != null) {
                layoutNodeF2 = layoutNodeF;
            }
            int iOrdinal = a14Var.ordinal();
            if (iOrdinal == 0) {
                if (layoutNodeF2.u != null) {
                    s0(layoutNodeF2, z, 6);
                    return;
                } else {
                    u0(layoutNodeF2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                hk0.l("Intrinsics isn't used by the parent");
            } else if (layoutNodeF2.u != null) {
                layoutNodeF2.r0(z);
            } else {
                layoutNodeF2.t0(z);
            }
        }
    }

    public static void u0(LayoutNode layoutNode, boolean z, int i) {
        Owner owner;
        LayoutNode layoutNodeF;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (layoutNode.D || layoutNode.m || (owner = layoutNode.A) == null) {
            return;
        }
        ((AndroidComposeView) owner).w(layoutNode, false, z, z2);
        if (z3) {
            f14 f14Var = layoutNode.layoutDelegate.p.r;
            LayoutNode layoutNodeF2 = f14Var.a.F();
            a14 a14Var = f14Var.a.P;
            if (layoutNodeF2 == null || a14Var == a14.f282o) {
                return;
            }
            while (layoutNodeF2.P == a14Var && (layoutNodeF = layoutNodeF2.F()) != null) {
                layoutNodeF2 = layoutNodeF;
            }
            int iOrdinal = a14Var.ordinal();
            if (iOrdinal == 0) {
                u0(layoutNodeF2, z, 6);
            } else if (iOrdinal == 1) {
                layoutNodeF2.t0(z);
            } else {
                hk0.l("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void v0(LayoutNode layoutNode) {
        int i = b14.a[layoutNode.layoutDelegate.d.ordinal()];
        f14 f14Var = layoutNode.layoutDelegate;
        if (i != 1) {
            hk0.n(f14Var.d, "Unexpected state ");
            return;
        }
        if (f14Var.e) {
            s0(layoutNode, true, 6);
            return;
        }
        if (f14Var.f) {
            layoutNode.r0(true);
        }
        if (layoutNode.A()) {
            u0(layoutNode, true, 6);
        } else if (layoutNode.u()) {
            layoutNode.t0(true);
        }
    }

    public final boolean A() {
        return this.layoutDelegate.p.H;
    }

    public final void A0(LayoutNode layoutNode) {
        if (im3.n(layoutNode, this.u)) {
            return;
        }
        this.u = layoutNode;
        f14 f14Var = this.layoutDelegate;
        if (layoutNode != null) {
            if (f14Var.q == null) {
                f14Var.q = new xg4(f14Var);
            }
            e45 e45Var = ((ti3) this.S.d).J;
            for (e45 outerCoordinator$ui = getOuterCoordinator$ui(); !im3.n(outerCoordinator$ui, e45Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.J) {
                outerCoordinator$ui.V0();
            }
        } else {
            f14Var.q = null;
            f14Var.f = false;
            f14Var.e = false;
        }
        S();
    }

    public final a14 B() {
        return this.layoutDelegate.p.x;
    }

    public final void B0(do4 do4Var) {
        if (im3.n(this.J, do4Var)) {
            return;
        }
        this.J = do4Var;
        yt2 yt2Var = this.K;
        if (yt2Var != null) {
            ((bg5) yt2Var.f2642o).setValue(do4Var);
        }
        S();
    }

    public final a14 C() {
        a14 a14Var;
        xg4 xg4Var = this.layoutDelegate.q;
        return (xg4Var == null || (a14Var = xg4Var.v) == null) ? a14.f282o : a14Var;
    }

    public final void C0(fs4 fs4Var) {
        if (this.m && this.W != cs4.b) {
            ki3.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.c0) {
            ki3.a("modifier is updated when deactivated");
        }
        if (!W()) {
            this.X = fs4Var;
            return;
        }
        d(fs4Var);
        if (this.E) {
            U();
        }
    }

    public final List D() {
        nf nfVar = this.S;
        zw4 zw4Var = (zw4) nfVar.h;
        if (zw4Var.h()) {
            return ea2.m;
        }
        zw4 zw4Var2 = new zw4(zw4Var.b);
        es4 es4Var = (es4) nfVar.g;
        byte b = 0;
        int i = 0;
        while (es4Var != null) {
            kn7 kn7Var = (kn7) nfVar.f;
            if (es4Var == kn7Var) {
                break;
            }
            e45 e45Var = es4Var.t;
            nc5 nc5Var = null;
            if (e45Var == null) {
                hk0.g("getModifierInfo called on node with no coordinator");
                return null;
            }
            nc5 nc5Var2 = e45Var.h0;
            nc5 nc5Var3 = ((ti3) nfVar.d).h0;
            es4 es4Var2 = es4Var.r;
            if (es4Var2 == kn7Var && e45Var != es4Var2.t) {
                nc5Var = nc5Var3;
            }
            if (nc5Var2 == null) {
                nc5Var2 = nc5Var;
            }
            zw4Var2.a(new gs4((fs4) zw4Var.f(i), e45Var, nc5Var2));
            es4Var = es4Var.r;
            i++;
        }
        xw4 xw4Var = zw4Var2.c;
        if (xw4Var != null) {
            return xw4Var;
        }
        xw4 xw4Var2 = new xw4(zw4Var2, b);
        zw4Var2.c = xw4Var2;
        return xw4Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void D0(ee8 ee8Var) {
        if (im3.n(this.N, ee8Var)) {
            return;
        }
        this.N = ee8Var;
        es4 es4Var = (es4) this.S.g;
        if ((es4Var.p & 16) != 0) {
            while (es4Var != null) {
                if ((es4Var.f737o & 16) != 0) {
                    ?? L0 = es4Var;
                    ?? xx4Var = 0;
                    while (L0 != 0) {
                        if (L0 instanceof ln5) {
                            ((ln5) L0).z0();
                        } else if ((L0.f737o & 16) != 0 && (L0 instanceof vm1)) {
                            es4 es4Var2 = ((vm1) L0).B;
                            int i = 0;
                            L0 = L0;
                            xx4Var = xx4Var;
                            while (es4Var2 != null) {
                                if ((es4Var2.f737o & 16) != 0) {
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
                if ((es4Var.p & 16) == 0) {
                    return;
                } else {
                    es4Var = es4Var.r;
                }
            }
        }
    }

    public final yt2 E() {
        yt2 yt2Var = this.K;
        if (yt2Var != null) {
            return yt2Var;
        }
        yt2 yt2Var2 = new yt2(this, this.J);
        this.K = yt2Var2;
        return yt2Var2;
    }

    public final void E0() {
        if (this.v <= 0 || !this.y) {
            return;
        }
        this.y = false;
        xx4 xx4Var = this.x;
        if (xx4Var == null) {
            xx4Var = new xx4(new LayoutNode[16]);
            this.x = xx4Var;
        }
        xx4Var.g();
        xx4 xx4Var2 = (xx4) this.w.n;
        Object[] objArr = xx4Var2.m;
        int i = xx4Var2.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.m) {
                xx4Var.d(xx4Var.f2559o, layoutNode.L());
            } else {
                xx4Var.b(layoutNode);
            }
        }
        f14 f14Var = this.layoutDelegate;
        f14Var.p.M = true;
        xg4 xg4Var = f14Var.q;
        if (xg4Var != null) {
            xg4Var.G = true;
        }
    }

    public final LayoutNode F() {
        LayoutNode layoutNode = this.z;
        while (layoutNode != null && layoutNode.m) {
            layoutNode = layoutNode.z;
        }
        return layoutNode;
    }

    public final int G() {
        return this.layoutDelegate.p.u;
    }

    public final ap6 H() {
        if (W() && !this.c0 && this.S.f(8)) {
            return this.F;
        }
        return null;
    }

    public final int I() {
        return this.layoutDelegate.p.m;
    }

    public final float J() {
        return this.layoutDelegate.p.R;
    }

    public final xx4 K() {
        boolean z = this.I;
        xx4 xx4Var = this.H;
        if (z) {
            xx4Var.g();
            xx4Var.d(xx4Var.f2559o, L());
            Arrays.sort(xx4Var.m, 0, xx4Var.f2559o, g0);
            this.I = false;
        }
        return xx4Var;
    }

    public final xx4 L() {
        E0();
        if (this.v == 0) {
            return (xx4) this.w.n;
        }
        xx4 xx4Var = this.x;
        xx4Var.getClass();
        return xx4Var;
    }

    public final void M(long j, x53 x53Var, int i, boolean z) {
        e45 outerCoordinator$ui = getOuterCoordinator$ui();
        at4 at4Var = e45.j0;
        getOuterCoordinator$ui().g1(e45.o0, outerCoordinator$ui.X0(j), x53Var, i, z);
    }

    public final void N(int i, LayoutNode layoutNode) {
        if (layoutNode.z != null && layoutNode.A != null) {
            ki3.c(l(layoutNode));
        }
        layoutNode.z = this;
        yt2 yt2Var = this.w;
        ((xx4) yt2Var.n).a(i, layoutNode);
        ((w04) yt2Var.f2642o).a();
        k0();
        if (layoutNode.m) {
            this.v++;
        }
        V();
        Owner owner = this.A;
        if (owner != null) {
            layoutNode.e(owner);
        }
        if (layoutNode.layoutDelegate.l > 0) {
            f14 f14Var = this.layoutDelegate;
            f14Var.d(f14Var.l + 1);
        }
        if (layoutNode.b0 > 0) {
            z0(this.b0 + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final void O(boolean z) {
        if (z) {
            LayoutNode layoutNodeF = F();
            if (layoutNodeF != null) {
                layoutNodeF.P();
            } else {
                Owner owner = this.A;
                if (owner != null) {
                    ((AndroidComposeView) owner).invalidate();
                }
            }
        }
        es4 es4Var = (es4) this.S.g;
        if ((es4Var.p & 2) != 0) {
            while (es4Var != null) {
                if ((es4Var.f737o & 2) != 0) {
                    ?? L0 = es4Var;
                    ?? xx4Var = 0;
                    while (L0 != 0) {
                        if (L0 instanceof r04) {
                            nc5 nc5Var = vn4.n0((r04) L0, 2).h0;
                            if (nc5Var != null) {
                                ((o03) nc5Var).c();
                            }
                        } else if ((L0.f737o & 2) != 0 && (L0 instanceof vm1)) {
                            es4 es4Var2 = ((vm1) L0).B;
                            int i = 0;
                            L0 = L0;
                            xx4Var = xx4Var;
                            while (es4Var2 != null) {
                                if ((es4Var2.f737o & 2) != 0) {
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
                if ((es4Var.p & 2) == 0) {
                    break;
                } else {
                    es4Var = es4Var.r;
                }
            }
        }
        xx4 xx4VarL = L();
        Object[] objArr = xx4VarL.m;
        int i2 = xx4VarL.f2559o;
        for (int i3 = 0; i3 < i2; i3++) {
            ((LayoutNode) objArr[i3]).O(false);
        }
    }

    public final void P() {
        if (this.V) {
            e45 e45Var = (ti3) this.S.d;
            e45 e45Var2 = getOuterCoordinator$ui().K;
            this.U = null;
            while (!im3.n(e45Var, e45Var2)) {
                if ((e45Var != null ? e45Var.h0 : null) != null) {
                    this.U = e45Var;
                    break;
                }
                e45Var = e45Var != null ? e45Var.K : null;
            }
            this.V = false;
        }
        e45 e45Var3 = this.U;
        if (e45Var3 != null && e45Var3.h0 == null) {
            throw ua5.r("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (e45Var3 != null) {
            e45Var3.i1();
            return;
        }
        LayoutNode layoutNodeF = F();
        if (layoutNodeF != null) {
            layoutNodeF.P();
            return;
        }
        Owner owner = this.A;
        if (owner != null) {
            ((AndroidComposeView) owner).invalidate();
        }
    }

    public final void Q() {
        e45 outerCoordinator$ui = getOuterCoordinator$ui();
        nf nfVar = this.S;
        ti3 ti3Var = (ti3) nfVar.d;
        while (outerCoordinator$ui != ti3Var) {
            outerCoordinator$ui.getClass();
            u04 u04Var = (u04) outerCoordinator$ui;
            nc5 nc5Var = u04Var.h0;
            if (nc5Var != null) {
                ((o03) nc5Var).c();
            }
            outerCoordinator$ui = u04Var.J;
        }
        nc5 nc5Var2 = ((ti3) nfVar.d).h0;
        if (nc5Var2 != null) {
            ((o03) nc5Var2).c();
        }
    }

    public final void R() {
        u0(this, false, 7);
        xx4 xx4VarL = L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).R();
        }
    }

    public final void S() {
        if (this.m) {
            LayoutNode layoutNodeF = F();
            if (layoutNodeF != null) {
                layoutNodeF.S();
                return;
            }
            return;
        }
        if (this.u != null) {
            s0(this, false, 7);
        } else {
            u0(this, false, 7);
        }
    }

    public final void T() {
        f14 f14Var = this.layoutDelegate;
        f14Var.p.D = true;
        xg4 xg4Var = f14Var.q;
        if (xg4Var != null) {
            xg4Var.J = true;
        }
    }

    public final void U() {
        if (this.G) {
            return;
        }
        if (((a45) this.S.c).r != null || this.X != null) {
            this.E = true;
            return;
        }
        ap6 ap6Var = this.F;
        this.G = true;
        k76 k76Var = new k76();
        k76Var.m = new ap6();
        pc5 snapshotObserver = e14.a(this).getSnapshotObserver();
        ql1 ql1Var = new ql1(this, k76Var, (byte) 17);
        snapshotObserver.a.f(this, snapshotObserver.d, ql1Var);
        this.G = false;
        this.F = (ap6) k76Var.m;
        this.E = false;
        Owner ownerA = e14.a(this);
        ownerA.getSemanticsOwner().b(this, ap6Var);
        ((AndroidComposeView) ownerA).y();
    }

    public final void V() {
        LayoutNode layoutNode;
        if (this.v > 0) {
            this.y = true;
        }
        if (!this.m || (layoutNode = this.z) == null) {
            return;
        }
        layoutNode.V();
    }

    public final boolean W() {
        return this.A != null;
    }

    public final boolean X() {
        return this.layoutDelegate.p.F;
    }

    public final boolean Y() {
        return this.layoutDelegate.p.G;
    }

    public final Boolean Z() {
        xg4 xg4Var = this.layoutDelegate.q;
        if (xg4Var != null) {
            return Boolean.valueOf(xg4Var.D != wg4.f2410o);
        }
        return null;
    }

    @Override // o.mz0
    public final void a() {
        ge8 ge8Var = this.B;
        if (ge8Var != null) {
            ge8Var.a();
        }
        p14 p14Var = this.T;
        if (p14Var != null) {
            p14Var.a();
        }
        e45 e45Var = ((ti3) this.S.d).J;
        for (e45 outerCoordinator$ui = getOuterCoordinator$ui(); !im3.n(outerCoordinator$ui, e45Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.J) {
            outerCoordinator$ui.n1();
        }
    }

    public final boolean a0(r61 r61Var) {
        if (r61Var == null || this.u == null) {
            return false;
        }
        xg4 xg4Var = this.layoutDelegate.q;
        xg4Var.getClass();
        return xg4Var.D0(r61Var.a);
    }

    @Override // o.mz0
    public final void b() {
        yf autofillManager;
        ge8 ge8Var = this.B;
        if (ge8Var != null) {
            ge8Var.b();
        }
        p14 p14Var = this.T;
        if (p14Var != null) {
            p14Var.i(true);
        }
        this.c0 = true;
        es4 es4Var = (kn7) this.S.f;
        for (es4 es4Var2 = es4Var; es4Var2 != null; es4Var2 = es4Var2.q) {
            if (es4Var2.z) {
                es4Var2.P0();
            }
        }
        for (es4 es4Var3 = es4Var; es4Var3 != null; es4Var3 = es4Var3.q) {
            if (es4Var3.z) {
                es4Var3.R0();
            }
        }
        while (es4Var != null) {
            if (es4Var.z) {
                es4Var.L0();
            }
            es4Var = es4Var.q;
        }
        if (W()) {
            this.F = null;
            this.E = false;
        }
        Owner owner = this.A;
        if (owner == null || (autofillManager = ((AndroidComposeView) owner).getAutofillManager()) == null || !autofillManager.t.e(this.n)) {
            return;
        }
        autofillManager.m.J0(autofillManager.f2603o, this.n, false);
    }

    public final void c0() {
        LayoutNode layoutNodeF;
        if (this.P == a14.f282o) {
            g();
        }
        xg4 xg4Var = this.layoutDelegate.q;
        xg4Var.getClass();
        boolean z = true;
        try {
            xg4Var.s = true;
            if (!xg4Var.x) {
                ki3.c("replace() called on item that was not placed");
            }
            xg4Var.O = false;
            if (xg4Var.D == wg4.f2410o) {
                z = false;
            }
            xg4Var.z0(xg4Var.A, xg4Var.B, xg4Var.C);
            if (z && !xg4Var.O && (layoutNodeF = xg4Var.r.a.F()) != null) {
                layoutNodeF.r0(false);
            }
        } finally {
            xg4Var.s = false;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6011. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void d(o.fs4 r24) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.d(o.fs4):void");
    }

    public final void d0() {
        co4 co4Var = this.layoutDelegate.p;
        co4Var.I = true;
        co4Var.J = true;
    }

    public final void e(Owner owner) {
        LayoutNode layoutNode;
        ap6 ap6VarH;
        if (this.A != null) {
            ki3.c("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
        }
        LayoutNode layoutNode2 = this.z;
        if (layoutNode2 != null && !im3.n(layoutNode2.A, owner)) {
            LayoutNode layoutNodeF = F();
            Owner owner2 = layoutNodeF != null ? layoutNodeF.A : null;
            String strH = h(0);
            LayoutNode layoutNode3 = this.z;
            ki3.c("Attaching to a different owner(" + owner + ") than the parent's owner(" + owner2 + "). This tree: " + strH + " Parent tree: " + (layoutNode3 != null ? layoutNode3.h(0) : null));
        }
        LayoutNode layoutNodeF2 = F();
        if (layoutNodeF2 == null) {
            this.layoutDelegate.p.F = true;
            owner.getRectManager().g(this);
            xg4 xg4Var = this.layoutDelegate.q;
            if (xg4Var != null) {
                xg4Var.D = wg4.m;
            }
        }
        getOuterCoordinator$ui().K = layoutNodeF2 != null ? (ti3) layoutNodeF2.S.d : null;
        this.A = owner;
        this.C = (layoutNodeF2 != null ? layoutNodeF2.C : -1) + 1;
        fs4 fs4Var = this.X;
        if (fs4Var != null) {
            d(fs4Var);
        }
        this.X = null;
        ((AndroidComposeView) owner).m3getLayoutNodes().i(this.n, this);
        boolean z = this.t;
        nf nfVar = this.S;
        if (z) {
            A0(this);
        } else {
            LayoutNode layoutNode4 = this.z;
            if (layoutNode4 == null || (layoutNode = layoutNode4.u) == null) {
                layoutNode = this.u;
            }
            A0(layoutNode);
            if (this.u == null && nfVar.f(512)) {
                A0(this);
            }
        }
        if (!this.c0) {
            for (es4 es4Var = (es4) nfVar.g; es4Var != null; es4Var = es4Var.r) {
                es4Var.K0();
            }
        }
        xx4 xx4Var = (xx4) this.w.n;
        Object[] objArr = xx4Var.m;
        int i = xx4Var.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).e(owner);
        }
        if (!this.c0) {
            nfVar.k();
        }
        S();
        if (layoutNodeF2 != null) {
            layoutNodeF2.S();
        }
        ql qlVar = this.Y;
        if (qlVar != null) {
            qlVar.invoke(owner);
        }
        this.layoutDelegate.j();
        if (!this.c0 && nfVar.f(8)) {
            U();
        }
        yf autofillManager = ((AndroidComposeView) owner).getAutofillManager();
        if (autofillManager == null || (ap6VarH = H()) == null || !ap6VarH.m.b(kp6.r)) {
            return;
        }
        autofillManager.t.a(this.n);
        autofillManager.m.J0(autofillManager.f2603o, this.n, true);
    }

    public final void e0() {
        f14 f14Var = this.layoutDelegate;
        f14Var.f = true;
        f14Var.g = true;
    }

    public final void f() {
        this.Q = this.P;
        a14 a14Var = a14.f282o;
        this.P = a14Var;
        xx4 xx4VarL = L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.P != a14Var) {
                layoutNode.f();
            }
        }
    }

    public final void f0() {
        this.layoutDelegate.e = true;
    }

    public final void g() {
        this.Q = this.P;
        this.P = a14.f282o;
        xx4 xx4VarL = L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.P == a14.n) {
                layoutNode.g();
            }
        }
    }

    public final void g0() {
        this.layoutDelegate.p.H = true;
    }

    public final List<LayoutNode> getChildren$ui() {
        return L().f();
    }

    public List<LayoutNode> getChildrenInfo() {
        return getChildren$ui();
    }

    public final e45 getOuterCoordinator$ui() {
        return (e45) this.S.e;
    }

    public final String h(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        xx4 xx4VarL = L();
        Object[] objArr = xx4VarL.m;
        int i3 = xx4VarL.f2559o;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((LayoutNode) objArr[i4]).h(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? string.substring(0, string.length() - 1) : string;
    }

    public final void h0(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            yt2 yt2Var = this.w;
            xx4 xx4Var = (xx4) yt2Var.n;
            w04 w04Var = (w04) yt2Var.f2642o;
            Object objK = xx4Var.k(i5);
            w04Var.a();
            ((xx4) yt2Var.n).a(i6, (LayoutNode) objK);
            w04Var.a();
        }
        k0();
        V();
        S();
    }

    public final void i() {
        c14 c14Var;
        Owner owner = this.A;
        if (owner == null) {
            LayoutNode layoutNodeF = F();
            ki3.d("Cannot detach node that is already detached!  Tree: " + (layoutNodeF != null ? layoutNodeF.h(0) : null));
            hk0.b();
            return;
        }
        LayoutNode layoutNodeF2 = F();
        if (layoutNodeF2 != null) {
            layoutNodeF2.P();
            layoutNodeF2.S();
            f14 f14Var = this.layoutDelegate;
            co4 co4Var = f14Var.p;
            a14 a14Var = a14.f282o;
            co4Var.x = a14Var;
            xg4 xg4Var = f14Var.q;
            if (xg4Var != null) {
                xg4Var.v = a14Var;
            }
        }
        f14 f14Var2 = this.layoutDelegate;
        c14 c14Var2 = f14Var2.p.K;
        c14Var2.b = true;
        c14Var2.c = false;
        c14Var2.e = false;
        c14Var2.d = false;
        c14Var2.f = false;
        c14Var2.g = false;
        c14Var2.h = null;
        xg4 xg4Var2 = f14Var2.q;
        if (xg4Var2 != null && (c14Var = xg4Var2.E) != null) {
            c14Var.b = true;
            c14Var.c = false;
            c14Var.e = false;
            c14Var.d = false;
            c14Var.f = false;
            c14Var.g = false;
            c14Var.h = null;
        }
        nf nfVar = this.S;
        ti3 ti3Var = (ti3) nfVar.d;
        es4 es4Var = (kn7) nfVar.f;
        e45 e45Var = ti3Var.J;
        for (e45 outerCoordinator$ui = getOuterCoordinator$ui(); !im3.n(outerCoordinator$ui, e45Var) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.J) {
            outerCoordinator$ui.t1();
            if (outerCoordinator$ui.G.X()) {
                outerCoordinator$ui.o1();
            }
        }
        rl rlVar = this.Z;
        if (rlVar != null) {
            rlVar.invoke(owner);
        }
        for (es4 es4Var2 = es4Var; es4Var2 != null; es4Var2 = es4Var2.q) {
            if (es4Var2.z) {
                es4Var2.R0();
            }
        }
        this.D = true;
        xx4 xx4Var = (xx4) this.w.n;
        Object[] objArr = xx4Var.m;
        int i = xx4Var.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).i();
        }
        this.D = false;
        while (es4Var != null) {
            if (es4Var.z) {
                es4Var.L0();
            }
            es4Var = es4Var.q;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) owner;
        androidComposeView.m3getLayoutNodes().g(this.n);
        sn1 sn1Var = androidComposeView.f0;
        iu iuVar = (iu) sn1Var.e;
        ((xk1) iuVar.f1103o).S(this);
        ((xk1) iuVar.p).S(this);
        ((xk1) iuVar.n).S(this);
        ((xx4) ((a65) sn1Var.f).n).j(this);
        androidComposeView.W = true;
        yf autofillManager = androidComposeView.getAutofillManager();
        if (autofillManager != null && autofillManager.t.e(this.n)) {
            autofillManager.m.J0(autofillManager.f2603o, this.n, false);
        }
        owner.getRectManager().h(this);
        this.A = null;
        A0(null);
        this.C = 0;
        f14 f14Var3 = this.layoutDelegate;
        co4 co4Var2 = f14Var3.p;
        co4Var2.u = Integer.MAX_VALUE;
        co4Var2.t = Integer.MAX_VALUE;
        co4Var2.F = false;
        xg4 xg4Var3 = f14Var3.q;
        if (xg4Var3 != null) {
            xg4Var3.u = Integer.MAX_VALUE;
            xg4Var3.t = Integer.MAX_VALUE;
            xg4Var3.D = wg4.f2410o;
        }
        if (nfVar.f(8)) {
            ap6 ap6Var = this.F;
            this.F = null;
            this.E = false;
            owner.getSemanticsOwner().b(this, ap6Var);
            androidComposeView.y();
        }
    }

    public final void i0(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.l > 0) {
            f14 f14Var = this.layoutDelegate;
            f14Var.d(f14Var.l - 1);
        }
        if (this.A != null) {
            layoutNode.i();
        }
        layoutNode.z = null;
        if (layoutNode.b0 > 0) {
            z0(this.b0 - 1);
        }
        layoutNode.getOuterCoordinator$ui().K = null;
        if (layoutNode.m) {
            this.v--;
            xx4 xx4Var = (xx4) layoutNode.w.n;
            Object[] objArr = xx4Var.m;
            int i = xx4Var.f2559o;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).getOuterCoordinator$ui().K = null;
            }
        }
        V();
        k0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public final void j() {
        if (this.layoutDelegate.d != y04.q || u() || A() || this.c0 || !X()) {
            return;
        }
        es4 es4Var = (es4) this.S.g;
        if ((es4Var.p & 256) != 0) {
            while (es4Var != null) {
                if ((es4Var.f737o & 256) != 0) {
                    ?? L0 = es4Var;
                    ?? xx4Var = 0;
                    while (L0 != 0) {
                        if (L0 instanceof gz2) {
                            gz2 gz2Var = (gz2) L0;
                            gz2Var.x0(vn4.n0(gz2Var, 256));
                        } else if ((L0.f737o & 256) != 0 && (L0 instanceof vm1)) {
                            es4 es4Var2 = ((vm1) L0).B;
                            int i = 0;
                            L0 = L0;
                            xx4Var = xx4Var;
                            while (es4Var2 != null) {
                                if ((es4Var2.f737o & 256) != 0) {
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
                if ((es4Var.p & 256) == 0) {
                    return;
                } else {
                    es4Var = es4Var.r;
                }
            }
        }
    }

    public final void j0(e45 e45Var) {
        Owner owner = this.A;
        x56 rectManager = owner != null ? owner.getRectManager() : null;
        boolean z = this.layoutDelegate.d != y04.q || A() || u();
        if (this.s != -4 && rectManager != null) {
            if (e45Var == getOuterCoordinator$ui()) {
                this.r = true;
                if (!z) {
                    rectManager.g(this);
                }
            } else {
                this.q = true;
                xx4 xx4VarL = L();
                Object[] objArr = xx4VarL.m;
                int i = xx4VarL.f2559o;
                for (int i2 = 0; i2 < i; i2++) {
                    LayoutNode layoutNode = (LayoutNode) objArr[i2];
                    layoutNode.r = true;
                    if (!z) {
                        rectManager.g(layoutNode);
                    }
                }
                if (this.s != -4) {
                    rectManager.f = true;
                    int iD = rectManager.d(this);
                    long[] jArr = (long[]) rectManager.c.c;
                    int i3 = iD + 2;
                    long j = jArr[i3];
                    jArr[i3] = j | (((j >> 63) & 1) << 60);
                }
                rectManager.j();
            }
        }
        this.layoutDelegate.p.F0();
    }

    public final void k(ll0 ll0Var, l03 l03Var) {
        try {
            getOuterCoordinator$ui().T0(ll0Var, l03Var);
        } catch (Throwable th) {
            x0(th);
            throw null;
        }
    }

    public final void k0() {
        if (!this.m) {
            this.I = true;
            return;
        }
        LayoutNode layoutNodeF = F();
        if (layoutNodeF != null) {
            layoutNodeF.k0();
        }
    }

    public final void l0() {
        if (this.P == a14.f282o) {
            g();
        }
        LayoutNode layoutNodeF = F();
        il5.k(layoutNodeF != null ? ((ti3) layoutNodeF.S.d).B : e14.a(this).getPlacementScope(), this.layoutDelegate.p, 0, 0);
    }

    public final void m() {
        if (this.u != null) {
            s0(this, false, 5);
        } else {
            u0(this, false, 5);
        }
        co4 co4Var = this.layoutDelegate.p;
        r61 r61Var = co4Var.v ? new r61(co4Var.p) : null;
        Owner owner = this.A;
        if (r61Var != null) {
            if (owner != null) {
                ((AndroidComposeView) owner).s(this, r61Var.a);
            }
        } else if (owner != null) {
            ((AndroidComposeView) owner).r(true);
        }
    }

    public final boolean m0(r61 r61Var) {
        if (r61Var == null) {
            return false;
        }
        if (this.P == a14.f282o) {
            f();
        }
        return this.layoutDelegate.p.D0(r61Var.a);
    }

    public final boolean n() {
        xg4 xg4Var;
        c14 c14Var;
        f14 f14Var = this.layoutDelegate;
        return f14Var.p.K.e() || !((xg4Var = f14Var.q) == null || (c14Var = xg4Var.E) == null || !c14Var.e());
    }

    public final List o() {
        xg4 xg4Var = this.layoutDelegate.q;
        xg4Var.getClass();
        xx4 xx4Var = xg4Var.F;
        f14 f14Var = xg4Var.r;
        f14Var.a.getChildren$ui();
        if (!xg4Var.G) {
            return xx4Var.f();
        }
        LayoutNode layoutNode = f14Var.a;
        xx4 xx4VarL = layoutNode.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (xx4Var.f2559o <= i2) {
                xg4 xg4Var2 = layoutNode2.layoutDelegate.q;
                xg4Var2.getClass();
                xx4Var.b(xg4Var2);
            } else {
                xg4 xg4Var3 = layoutNode2.layoutDelegate.q;
                xg4Var3.getClass();
                Object[] objArr2 = xx4Var.m;
                Object obj = objArr2[i2];
                objArr2[i2] = xg4Var3;
            }
        }
        xx4Var.l(layoutNode.getChildren$ui().size(), xx4Var.f2559o);
        xg4Var.G = false;
        return xx4Var.f();
    }

    public final void o0() {
        yt2 yt2Var = this.w;
        int i = ((xx4) yt2Var.n).f2559o;
        while (true) {
            i--;
            xx4 xx4Var = (xx4) yt2Var.n;
            if (-1 >= i) {
                xx4Var.g();
                ((w04) yt2Var.f2642o).a();
                return;
            }
            i0((LayoutNode) xx4Var.m[i]);
        }
    }

    public final List p() {
        return this.layoutDelegate.p.n0();
    }

    public final void p0(int i, int i2) {
        if (i2 < 0) {
            ki3.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            yt2 yt2Var = this.w;
            i0((LayoutNode) ((xx4) yt2Var.n).m[i3]);
            Object objK = ((xx4) yt2Var.n).k(i3);
            ((w04) yt2Var.f2642o).a();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final List q() {
        return ((xx4) this.w.n).f();
    }

    public final void q0() {
        LayoutNode layoutNodeF;
        if (this.P == a14.f282o) {
            g();
        }
        co4 co4Var = this.layoutDelegate.p;
        f14 f14Var = co4Var.r;
        try {
            co4Var.s = true;
            if (!co4Var.w) {
                ki3.c("replace called on unplaced item");
            }
            boolean z = co4Var.F;
            co4Var.x0(co4Var.z, co4Var.C, co4Var.A, co4Var.B);
            if (z && !co4Var.S && (layoutNodeF = f14Var.a.F()) != null) {
                layoutNodeF.t0(false);
            }
            co4Var.s = false;
        } catch (Throwable th) {
            try {
                f14Var.a.x0(th);
                throw null;
            } catch (Throwable th2) {
                co4Var.s = false;
                throw th2;
            }
        }
    }

    public final int r() {
        return this.layoutDelegate.p.n;
    }

    public final void r0(boolean z) {
        Owner owner;
        if (this.m || (owner = this.A) == null) {
            return;
        }
        ((AndroidComposeView) owner).x(this, true, z);
    }

    @Override // o.oc5
    public final boolean s() {
        return W();
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final f14 getLayoutDelegate() {
        return this.layoutDelegate;
    }

    public final void t0(boolean z) {
        Owner owner;
        if (this.m || (owner = this.A) == null) {
            return;
        }
        ((AndroidComposeView) owner).x(this, false, z);
    }

    public final String toString() {
        return ct1.U(this) + " children: " + getChildren$ui().size() + " measurePolicy: " + this.J + " deactivated: " + this.c0 + " isVirtual: " + this.m + " isPlaced: " + X();
    }

    public final boolean u() {
        return this.layoutDelegate.p.I;
    }

    public final y04 v() {
        return this.layoutDelegate.d;
    }

    public final boolean w() {
        return this.layoutDelegate.f;
    }

    public final void w0() {
        xx4 xx4VarL = L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            a14 a14Var = layoutNode.Q;
            layoutNode.P = a14Var;
            if (a14Var != a14.f282o) {
                layoutNode.w0();
            }
        }
    }

    public final boolean x() {
        return this.layoutDelegate.e;
    }

    public final void x0(Throwable th) {
        x01 x01Var = this.O;
        h72 h72Var = r01.a;
        yj5 yj5Var = (yj5) x01Var;
        yj5Var.getClass();
        q01 q01Var = (q01) di1.z(yj5Var, h72Var);
        if (q01Var == null) {
            throw th;
        }
        ka0.H(th, new x8(q01Var, this, (byte) 19));
        throw th;
    }

    public final xg4 y() {
        return this.layoutDelegate.q;
    }

    public final void y0(in1 in1Var) {
        if (im3.n(this.L, in1Var)) {
            return;
        }
        this.L = in1Var;
        S();
        LayoutNode layoutNodeF = F();
        if (layoutNodeF != null) {
            layoutNodeF.P();
        } else {
            Owner owner = this.A;
            if (owner != null) {
                ((AndroidComposeView) owner).invalidate();
            }
        }
        Q();
        for (es4 es4Var = (es4) this.S.g; es4Var != null; es4Var = es4Var.r) {
            es4Var.c();
        }
    }

    public final co4 z() {
        return this.layoutDelegate.p;
    }

    public final void z0(int i) {
        LayoutNode layoutNodeF;
        LayoutNode layoutNodeF2;
        int i2 = this.b0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (layoutNodeF2 = F()) != null) {
                layoutNodeF2.z0(layoutNodeF2.b0 + 1);
            }
            if (i == 0 && this.b0 > 0 && (layoutNodeF = F()) != null) {
                layoutNodeF.z0(layoutNodeF.b0 - 1);
            }
            this.b0 = i;
        }
    }

    public LayoutNode(int i) {
        this(cp6.a.addAndGet(1), (i & 1) == 0);
    }
}
