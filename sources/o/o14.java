package o;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes.dex */
public final class o14 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p14 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o14(p14 p14Var, Object obj, byte b) {
        this.a = b;
        this.b = p14Var;
        this.c = obj;
    }

    private final void a() {
    }

    public h14 b() {
        p14 p14Var = this.b;
        LayoutNode layoutNode = (LayoutNode) p14Var.v.g(this.c);
        if (layoutNode != null) {
            return (h14) p14Var.r.g(layoutNode);
        }
        return null;
    }

    public final boolean c() {
        yh5 yh5Var;
        switch (this.a) {
            case 0:
                return true;
            default:
                h14 h14VarB = b();
                if (h14VarB == null || (yh5Var = h14VarB.f) == null) {
                    return true;
                }
                return yh5Var.c();
        }
    }
}
