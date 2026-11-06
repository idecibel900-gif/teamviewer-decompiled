package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qv implements ov, fo4, yg4 {
    public final u04 m;
    public xm n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1869o;

    public qv(u04 u04Var, xm xmVar) {
        this.m = u04Var;
        this.n = xmVar;
    }

    @Override // o.in1
    public final float A0(long j) {
        return this.m.A0(j);
    }

    @Override // o.in1
    public final long I(float f) {
        return this.m.I(f);
    }

    @Override // o.in1
    public final float O(int i) {
        return this.m.O(i);
    }

    @Override // o.in1
    public final float R(float f) {
        return f / this.m.getDensity();
    }

    @Override // o.in1
    public final float Z() {
        return this.m.Z();
    }

    @Override // o.bm3
    public final boolean b0() {
        return false;
    }

    @Override // o.in1
    public final float d0(float f) {
        return this.m.getDensity() * f;
    }

    @Override // o.yg4
    public final i04 e(il5 il5Var) {
        LayoutNode layoutNode = this.m.G.u;
        if (layoutNode == null) {
            ki3.b("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            hk0.b();
            return null;
        }
        if (!layoutNode.t) {
            return layoutNode.getOuterCoordinator$ui();
        }
        LayoutNode layoutNodeF = layoutNode.F();
        return layoutNodeF != null ? (ti3) layoutNodeF.S.d : layoutNode.getChildren$ui().get(0).getOuterCoordinator$ui();
    }

    @Override // o.in1
    public final float getDensity() {
        return this.m.getDensity();
    }

    @Override // o.bm3
    public final j04 getLayoutDirection() {
        return this.m.G.M;
    }

    @Override // o.yg4
    public final i04 h(i04 i04Var) {
        ug4 ug4Var;
        if (i04Var instanceof ug4) {
            return i04Var;
        }
        if (i04Var instanceof e45) {
            tg4 tg4VarY0 = ((e45) i04Var).Y0();
            return (tg4VarY0 == null || (ug4Var = tg4VarY0.J) == null) ? i04Var : ug4Var;
        }
        ki3.b("Unsupported LayoutCoordinates");
        hk0.b();
        return null;
    }

    @Override // o.in1
    public final int l0(long j) {
        return this.m.l0(j);
    }

    @Override // o.fo4
    public final eo4 o0(int i, int i2, Map map, Function1 function1, Function1 function2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ki3.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new pv(i, i2, map, function1, function2, this, (byte) 0);
    }

    @Override // o.in1
    public final long q(float f) {
        return this.m.q(f);
    }

    @Override // o.in1
    public final int q0(float f) {
        return this.m.q0(f);
    }

    @Override // o.in1
    public final long r(long j) {
        return this.m.r(j);
    }

    @Override // o.fo4
    public final eo4 u(int i, int i2, Map map, Function1 function1) {
        return this.m.o0(i, i2, map, null, function1);
    }

    @Override // o.in1
    public final float v(long j) {
        return this.m.v(j);
    }

    @Override // o.in1
    public final long w0(long j) {
        return this.m.w0(j);
    }
}
