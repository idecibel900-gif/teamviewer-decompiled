package o;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n14 implements kd7 {
    public final lw4 a;
    public final /* synthetic */ p14 b;
    public final /* synthetic */ Object c;

    public n14(p14 p14Var, Object obj) {
        this.b = p14Var;
        this.c = obj;
        int[] iArr = cl3.a;
        this.a = new lw4();
    }

    @Override // o.kd7
    public final void a() {
        this.b.g(this.c);
    }

    @Override // o.kd7
    public final int b() {
        List<LayoutNode> children$ui;
        LayoutNode layoutNode = (LayoutNode) this.b.v.g(this.c);
        if (layoutNode == null || (children$ui = layoutNode.getChildren$ui()) == null) {
            return 0;
        }
        return children$ui.size();
    }

    @Override // o.kd7
    public final void c(jg jgVar) {
        nf nfVar;
        LayoutNode layoutNode = (LayoutNode) this.b.v.g(this.c);
        es4 es4Var = (layoutNode == null || (nfVar = layoutNode.S) == null) ? null : (es4) nfVar.g;
        if (es4Var == null || !es4Var.z) {
            return;
        }
        g57.r(es4Var, "o.n28", jgVar);
    }

    @Override // o.kd7
    public final void d(int i, long j) {
        p14 p14Var = this.b;
        LayoutNode layoutNode = (LayoutNode) p14Var.v.g(this.c);
        if (layoutNode == null || !layoutNode.W()) {
            return;
        }
        int size = layoutNode.getChildren$ui().size();
        if (i < 0 || i >= size) {
            ki3.e("Index (" + i + ") is out of bound of [0, " + size + ")");
        }
        if (layoutNode.X()) {
            ki3.a("Pre-measure called on node that is not placed");
        }
        LayoutNode layoutNode2 = p14Var.m;
        layoutNode2.D = true;
        ((AndroidComposeView) e14.a(layoutNode)).s(layoutNode.getChildren$ui().get(i), j);
        layoutNode2.D = false;
        this.a.a(i);
    }
}
