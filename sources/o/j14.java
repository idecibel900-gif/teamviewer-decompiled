package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j14 implements md7 {
    public j04 m = j04.n;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1121o;
    public final /* synthetic */ p14 p;

    public j14(p14 p14Var) {
        this.p = p14Var;
    }

    @Override // o.in1
    public final float Z() {
        return this.f1121o;
    }

    @Override // o.bm3
    public final boolean b0() {
        LayoutNode layoutNode = this.p.m;
        return layoutNode.v() == y04.p || layoutNode.v() == y04.n;
    }

    @Override // o.in1
    public final float getDensity() {
        return this.n;
    }

    @Override // o.bm3
    public final j04 getLayoutDirection() {
        return this.m;
    }

    @Override // o.md7
    public final List m0(Object obj, hw2 hw2Var) {
        p14 p14Var = this.p;
        p14Var.h();
        LayoutNode layoutNode = p14Var.m;
        y04 y04VarV = layoutNode.v();
        y04 y04Var = y04.f2568o;
        y04 y04Var2 = y04.m;
        if (y04VarV != y04Var2 && y04VarV != y04Var && y04VarV != y04.n && y04VarV != y04.p) {
            ki3.c("subcompose can only be used inside the measure or layout blocks");
        }
        jx4 jx4Var = p14Var.s;
        Object objG = jx4Var.g(obj);
        if (objG == null) {
            objG = (LayoutNode) p14Var.v.k(obj);
            if (objG != null) {
                if (p14Var.A <= 0) {
                    ki3.c("Check failed.");
                }
                p14Var.A--;
            } else {
                objG = p14Var.n(obj);
                if (objG == null) {
                    int i = p14Var.p;
                    LayoutNode layoutNode2 = new LayoutNode(2);
                    layoutNode.D = true;
                    layoutNode.N(i, layoutNode2);
                    layoutNode.D = false;
                    objG = layoutNode2;
                }
            }
            jx4Var.m(obj, objG);
        }
        LayoutNode layoutNode3 = (LayoutNode) objG;
        if (lv0.p0(p14Var.p, layoutNode.q()) != layoutNode3) {
            int i2 = ((xx4) ((xw4) layoutNode.q()).n).i(layoutNode3);
            if (i2 < p14Var.p) {
                ki3.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = p14Var.p;
            if (i3 != i2) {
                p14Var.j(i2, i3);
            }
        }
        p14Var.p++;
        p14Var.m(layoutNode3, obj, false, hw2Var);
        return (y04VarV == y04Var2 || y04VarV == y04Var) ? layoutNode3.p() : layoutNode3.o();
    }

    @Override // o.fo4
    public final eo4 o0(int i, int i2, Map map, Function1 function1, Function1 function2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ki3.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new i14(i, i2, map, function1, this, this.p, function2);
    }
}
