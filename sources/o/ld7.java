package o;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes.dex */
public final class ld7 {
    public final od7 a;
    public p14 b;
    public final jd7 c;
    public final jd7 d;
    public final jd7 e;

    /* JADX WARN: Type inference failed for: r2v1, types: [o.jd7] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.jd7] */
    /* JADX WARN: Type inference failed for: r2v3, types: [o.jd7] */
    public ld7(od7 od7Var) {
        this.a = od7Var;
        final byte b = 0;
        this.c = new hw2(this) { // from class: o.jd7
            public final /* synthetic */ ld7 n;

            {
                this.n = this;
            }

            @Override // o.hw2
            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                f88 f88Var = f88.a;
                ld7 ld7Var = this.n;
                switch (b2) {
                    case 0:
                        od7 od7Var2 = ld7Var.a;
                        LayoutNode layoutNode = (LayoutNode) obj;
                        p14 p14Var = layoutNode.T;
                        if (p14Var == null) {
                            p14Var = new p14(layoutNode, od7Var2);
                            layoutNode.T = p14Var;
                        }
                        ld7Var.b = p14Var;
                        ld7Var.a().h();
                        p14 p14VarA = ld7Var.a();
                        if (p14VarA.f1693o != od7Var2) {
                            p14VarA.f1693o = od7Var2;
                            p14VarA.i(false);
                            LayoutNode.u0(p14VarA.m, false, 7);
                        }
                        break;
                    case 1:
                        ld7Var.a().n = (n01) obj2;
                        break;
                    default:
                        p14 p14VarA2 = ld7Var.a();
                        ((LayoutNode) obj).B0(new l14(p14VarA2, (hw2) obj2, p14VarA2.B));
                        break;
                }
                return f88Var;
            }
        };
        final byte b2 = 1;
        this.d = new hw2(this) { // from class: o.jd7
            public final /* synthetic */ ld7 n;

            {
                this.n = this;
            }

            @Override // o.hw2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                f88 f88Var = f88.a;
                ld7 ld7Var = this.n;
                switch (b3) {
                    case 0:
                        od7 od7Var2 = ld7Var.a;
                        LayoutNode layoutNode = (LayoutNode) obj;
                        p14 p14Var = layoutNode.T;
                        if (p14Var == null) {
                            p14Var = new p14(layoutNode, od7Var2);
                            layoutNode.T = p14Var;
                        }
                        ld7Var.b = p14Var;
                        ld7Var.a().h();
                        p14 p14VarA = ld7Var.a();
                        if (p14VarA.f1693o != od7Var2) {
                            p14VarA.f1693o = od7Var2;
                            p14VarA.i(false);
                            LayoutNode.u0(p14VarA.m, false, 7);
                        }
                        break;
                    case 1:
                        ld7Var.a().n = (n01) obj2;
                        break;
                    default:
                        p14 p14VarA2 = ld7Var.a();
                        ((LayoutNode) obj).B0(new l14(p14VarA2, (hw2) obj2, p14VarA2.B));
                        break;
                }
                return f88Var;
            }
        };
        final byte b3 = 2;
        this.e = new hw2(this) { // from class: o.jd7
            public final /* synthetic */ ld7 n;

            {
                this.n = this;
            }

            @Override // o.hw2
            public final Object invoke(Object obj, Object obj2) {
                byte b4 = b3;
                f88 f88Var = f88.a;
                ld7 ld7Var = this.n;
                switch (b4) {
                    case 0:
                        od7 od7Var2 = ld7Var.a;
                        LayoutNode layoutNode = (LayoutNode) obj;
                        p14 p14Var = layoutNode.T;
                        if (p14Var == null) {
                            p14Var = new p14(layoutNode, od7Var2);
                            layoutNode.T = p14Var;
                        }
                        ld7Var.b = p14Var;
                        ld7Var.a().h();
                        p14 p14VarA = ld7Var.a();
                        if (p14VarA.f1693o != od7Var2) {
                            p14VarA.f1693o = od7Var2;
                            p14VarA.i(false);
                            LayoutNode.u0(p14VarA.m, false, 7);
                        }
                        break;
                    case 1:
                        ld7Var.a().n = (n01) obj2;
                        break;
                    default:
                        p14 p14VarA2 = ld7Var.a();
                        ((LayoutNode) obj).B0(new l14(p14VarA2, (hw2) obj2, p14VarA2.B));
                        break;
                }
                return f88Var;
            }
        };
    }

    public final p14 a() {
        p14 p14Var = this.b;
        if (p14Var != null) {
            return p14Var;
        }
        hk0.g("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
