package o;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes.dex */
public final class si3 extends tg4 {
    @Override // o.zn4
    public final jl5 C(long j) {
        j0(j);
        e45 e45Var = this.G;
        xx4 xx4VarL = e45Var.G.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            xg4 xg4VarY = ((LayoutNode) objArr[i2]).y();
            xg4VarY.getClass();
            xg4VarY.v = a14.f282o;
        }
        LayoutNode layoutNode = e45Var.G;
        T0(layoutNode.J.c(this, layoutNode.o(), j));
        return this;
    }

    @Override // o.tg4
    public final void Q0() {
        xg4 xg4VarY = this.G.G.y();
        xg4VarY.getClass();
        xg4VarY.x0();
    }

    @Override // o.zn4
    public final int V(int i) {
        yt2 yt2VarE = this.G.G.E();
        do4 do4VarD = yt2VarE.D();
        LayoutNode layoutNode = (LayoutNode) yt2VarE.n;
        return do4VarD.e(layoutNode.getOuterCoordinator$ui(), layoutNode.o(), i);
    }

    @Override // o.zn4
    public final int a(int i) {
        yt2 yt2VarE = this.G.G.E();
        do4 do4VarD = yt2VarE.D();
        LayoutNode layoutNode = (LayoutNode) yt2VarE.n;
        return do4VarD.d(layoutNode.getOuterCoordinator$ui(), layoutNode.o(), i);
    }

    @Override // o.zn4
    public final int k(int i) {
        yt2 yt2VarE = this.G.G.E();
        do4 do4VarD = yt2VarE.D();
        LayoutNode layoutNode = (LayoutNode) yt2VarE.n;
        return do4VarD.a(layoutNode.getOuterCoordinator$ui(), layoutNode.o(), i);
    }

    @Override // o.zn4
    public final int o(int i) {
        yt2 yt2VarE = this.G.G.E();
        do4 do4VarD = yt2VarE.D();
        LayoutNode layoutNode = (LayoutNode) yt2VarE.n;
        return do4VarD.b(layoutNode.getOuterCoordinator$ui(), layoutNode.o(), i);
    }

    @Override // o.rg4
    public final int p0(ie ieVar) {
        xg4 xg4Var = this.G.G.getLayoutDelegate().q;
        xg4Var.getClass();
        c14 c14Var = xg4Var.E;
        if (!xg4Var.w) {
            f14 f14Var = xg4Var.r;
            if (f14Var.d == y04.n) {
                c14Var.f = true;
                if (c14Var.b) {
                    f14Var.f = true;
                    f14Var.g = true;
                }
            } else {
                c14Var.g = true;
            }
        }
        si3 si3Var = xg4Var.f().r0;
        Boolean boolValueOf = si3Var != null ? Boolean.valueOf(si3Var.A) : null;
        si3 si3Var2 = xg4Var.f().r0;
        if (si3Var2 != null) {
            si3Var2.A = true;
        }
        xg4Var.M();
        si3 si3Var3 = xg4Var.f().r0;
        if (si3Var3 != null) {
            si3Var3.A = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) c14Var.i.get(ieVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.L.g(iIntValue, ieVar);
        return iIntValue;
    }
}
