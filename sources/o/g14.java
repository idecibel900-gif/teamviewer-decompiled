package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g14 implements md7, fo4 {
    public final /* synthetic */ j14 m;
    public final /* synthetic */ p14 n;

    public g14(p14 p14Var) {
        this.n = p14Var;
        this.m = p14Var.t;
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
        return this.m.f1121o;
    }

    @Override // o.bm3
    public final boolean b0() {
        return this.m.b0();
    }

    @Override // o.in1
    public final float d0(float f) {
        return this.m.getDensity() * f;
    }

    @Override // o.in1
    public final float getDensity() {
        return this.m.n;
    }

    @Override // o.bm3
    public final j04 getLayoutDirection() {
        return this.m.m;
    }

    @Override // o.in1
    public final int l0(long j) {
        return this.m.l0(j);
    }

    @Override // o.md7
    public final List m0(Object obj, hw2 hw2Var) {
        p14 p14Var = this.n;
        LayoutNode layoutNode = p14Var.m;
        jx4 jx4Var = p14Var.s;
        LayoutNode layoutNode2 = (LayoutNode) jx4Var.g(obj);
        if (layoutNode2 != null && ((xx4) ((xw4) layoutNode.q()).n).i(layoutNode2) < p14Var.p) {
            return layoutNode2.p();
        }
        jx4 jx4Var2 = p14Var.x;
        jx4 jx4Var3 = p14Var.v;
        xx4 xx4Var = p14Var.y;
        if (xx4Var.f2559o < p14Var.q) {
            ki3.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        LayoutNode layoutNode3 = (LayoutNode) jx4Var.g(obj);
        int i = xx4Var.f2559o;
        int i2 = p14Var.q;
        if (i == i2) {
            xx4Var.b(obj);
        } else {
            Object[] objArr = xx4Var.m;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        p14Var.q++;
        boolean zB = jx4Var3.b(obj);
        if (zB || layoutNode3 != null) {
            if (!zB && layoutNode3 != null) {
                p14Var.j(((xx4) ((xw4) layoutNode.q()).n).i(layoutNode3), ((xx4) ((xw4) layoutNode.q()).n).f2559o);
                p14Var.A++;
                jx4Var.k(obj);
                jx4Var3.m(obj, layoutNode3);
                jx4Var2.m(obj, p14Var.e(obj));
                if (layoutNode.W()) {
                    p14Var.h();
                }
            }
            LayoutNode layoutNode4 = (LayoutNode) jx4Var3.g(obj);
            h14 h14Var = layoutNode4 != null ? (h14) p14Var.r.g(layoutNode4) : null;
            if (h14Var != null && h14Var.d) {
                p14Var.m(layoutNode4, obj, false, hw2Var);
            }
            if ((h14Var != null ? h14Var.f : null) != null) {
                p14Var.c(h14Var, true);
            }
        } else {
            p14Var.k(obj, hw2Var, false);
            jx4Var2.m(obj, p14Var.e(obj));
        }
        LayoutNode layoutNode5 = (LayoutNode) jx4Var3.g(obj);
        if (layoutNode5 == null) {
            return ea2.m;
        }
        List listN0 = layoutNode5.z().n0();
        xw4 xw4Var = (xw4) listN0;
        int i3 = ((xx4) xw4Var.n).f2559o;
        for (int i4 = 0; i4 < i3; i4++) {
            ((co4) xw4Var.get(i4)).r.b = true;
        }
        return listN0;
    }

    @Override // o.fo4
    public final eo4 o0(int i, int i2, Map map, Function1 function1, Function1 function2) {
        return this.m.o0(i, i2, map, function1, function2);
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
