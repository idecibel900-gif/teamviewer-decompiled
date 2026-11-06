package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ti3 extends e45 {
    public static final gy8 s0;
    public final kn7 q0;
    public si3 r0;

    static {
        gy8 gy8VarK = ka0.k();
        int i = rv0.i;
        gy8VarK.l(rv0.e);
        gy8VarK.r(1.0f);
        gy8VarK.s(1);
        s0 = gy8VarK;
    }

    public ti3(LayoutNode layoutNode) {
        super(layoutNode);
        kn7 kn7Var = new kn7();
        kn7Var.p = 0;
        this.q0 = kn7Var;
        kn7Var.t = this;
        this.r0 = layoutNode.u != null ? new si3(this) : null;
    }

    @Override // o.zn4
    public final jl5 C(long j) {
        if (this.I) {
            si3 si3Var = this.r0;
            si3Var.getClass();
            j = si3Var.p;
        }
        j0(j);
        LayoutNode layoutNode = this.G;
        xx4 xx4VarL = layoutNode.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).z().x = a14.f282o;
        }
        u1(layoutNode.J.c(this, layoutNode.p(), j));
        l1();
        return this;
    }

    @Override // o.zn4
    public final int V(int i) {
        yt2 yt2VarE = this.G.E();
        do4 do4VarD = yt2VarE.D();
        LayoutNode layoutNode = (LayoutNode) yt2VarE.n;
        return do4VarD.e(layoutNode.getOuterCoordinator$ui(), layoutNode.p(), i);
    }

    @Override // o.e45
    public final void V0() {
        if (this.r0 == null) {
            this.r0 = new si3(this);
        }
    }

    @Override // o.e45
    public final tg4 Y0() {
        return this.r0;
    }

    @Override // o.zn4
    public final int a(int i) {
        yt2 yt2VarE = this.G.E();
        do4 do4VarD = yt2VarE.D();
        LayoutNode layoutNode = (LayoutNode) yt2VarE.n;
        return do4VarD.d(layoutNode.getOuterCoordinator$ui(), layoutNode.p(), i);
    }

    @Override // o.e45
    public final es4 a1() {
        return this.q0;
    }

    @Override // o.jl5
    public final void c0(long j, float f, Function1 function1) {
        if (this.H) {
            tg4 tg4VarY0 = Y0();
            tg4VarY0.getClass();
            r1(tg4VarY0.H, f, function1, null);
        } else {
            r1(j, f, function1, null);
        }
        if (this.z) {
            return;
        }
        this.G.z().v0();
    }

    @Override // o.e45, o.jl5
    public final void e0(long j, float f, l03 l03Var) {
        ti3 ti3Var;
        if (this.H) {
            tg4 tg4VarY0 = Y0();
            tg4VarY0.getClass();
            ti3Var = this;
            ti3Var.r1(tg4VarY0.H, f, null, l03Var);
        } else {
            ti3Var = this;
            ti3Var.r1(j, f, null, l03Var);
        }
        if (ti3Var.z) {
            return;
        }
        ti3Var.G.z().v0();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // o.e45
    public final void h1(d45 d45Var, long j, x53 x53Var, int i, boolean z) {
        int i2;
        boolean z2;
        Object[] objArr;
        int i3;
        LayoutNode layoutNode;
        long jA;
        LayoutNode layoutNode2 = this.G;
        boolean z3 = false;
        if (d45Var.o(layoutNode2)) {
            if (!C1(j)) {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(S0(j, Z0())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = x53Var.f2482o;
                    xx4 xx4VarK = layoutNode2.K();
                    objArr = xx4VarK.m;
                    i3 = xx4VarK.f2559o - 1;
                    while (i3 >= 0) {
                        layoutNode = (LayoutNode) objArr[i3];
                        if (layoutNode.X()) {
                            d45Var.f(layoutNode, j, x53Var, i2, z2);
                            jA = x53Var.a();
                            if (zu1.w(jA) >= 0.0f && zu1.A(jA) && !zu1.z(jA) && !d45Var.e(x53Var, layoutNode)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    x53Var.f2482o = i4;
                }
            }
            i2 = i;
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = x53Var.f2482o;
                xx4 xx4VarK2 = layoutNode2.K();
                objArr = xx4VarK2.m;
                i3 = xx4VarK2.f2559o - 1;
                while (i3 >= 0) {
                    layoutNode = (LayoutNode) objArr[i3];
                    if (layoutNode.X()) {
                        d45Var.f(layoutNode, j, x53Var, i2, z2);
                        jA = x53Var.a();
                        if (zu1.w(jA) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                x53Var.f2482o = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = x53Var.f2482o;
            xx4 xx4VarK3 = layoutNode2.K();
            objArr = xx4VarK3.m;
            i3 = xx4VarK3.f2559o - 1;
            while (i3 >= 0) {
                layoutNode = (LayoutNode) objArr[i3];
                if (layoutNode.X()) {
                    d45Var.f(layoutNode, j, x53Var, i2, z2);
                    jA = x53Var.a();
                    if (zu1.w(jA) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            x53Var.f2482o = i6;
        }
    }

    @Override // o.zn4
    public final int k(int i) {
        yt2 yt2VarE = this.G.E();
        do4 do4VarD = yt2VarE.D();
        LayoutNode layoutNode = (LayoutNode) yt2VarE.n;
        return do4VarD.a(layoutNode.getOuterCoordinator$ui(), layoutNode.p(), i);
    }

    @Override // o.zn4
    public final int o(int i) {
        yt2 yt2VarE = this.G.E();
        do4 do4VarD = yt2VarE.D();
        LayoutNode layoutNode = (LayoutNode) yt2VarE.n;
        return do4VarD.b(layoutNode.getOuterCoordinator$ui(), layoutNode.p(), i);
    }

    @Override // o.rg4
    public final int p0(ie ieVar) {
        si3 si3Var = this.r0;
        if (si3Var != null) {
            return si3Var.p0(ieVar);
        }
        co4 co4Var = this.G.getLayoutDelegate().p;
        c14 c14Var = co4Var.K;
        if (!co4Var.y) {
            if (co4Var.r.d == y04.m) {
                c14Var.f = true;
                if (c14Var.b) {
                    co4Var.I = true;
                    co4Var.J = true;
                }
            } else {
                c14Var.g = true;
            }
        }
        ti3 ti3VarF = co4Var.f();
        boolean z = ti3VarF.A;
        ti3VarF.A = true;
        co4Var.M();
        ti3VarF.A = z;
        Integer num = (Integer) c14Var.i.get(ieVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
