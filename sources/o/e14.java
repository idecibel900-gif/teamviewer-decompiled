package o;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;

/* JADX INFO: loaded from: classes.dex */
public abstract class e14 {
    public static final ln1 a = mo8.b();

    public static final Owner a(LayoutNode layoutNode) {
        Owner owner = layoutNode.A;
        if (owner != null) {
            return owner;
        }
        throw ua5.r("LayoutNode should be attached to an owner");
    }
}
