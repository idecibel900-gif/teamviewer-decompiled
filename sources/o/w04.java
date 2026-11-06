package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w04 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ LayoutNode n;

    public /* synthetic */ w04(LayoutNode layoutNode, byte b) {
        this.m = b;
        this.n = layoutNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        LayoutNode layoutNode = this.n;
        switch (b) {
            case 0:
                LayoutNode.c(layoutNode);
                return f88.a;
            default:
                LayoutNode layoutNodeF = layoutNode.F();
                layoutNodeF.getClass();
                return (ti3) layoutNodeF.S.d;
        }
    }
}
