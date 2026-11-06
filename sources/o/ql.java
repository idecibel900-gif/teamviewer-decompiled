package o;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ql implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ge8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f1841o;

    public /* synthetic */ ql(ge8 ge8Var, LayoutNode layoutNode, byte b) {
        this.m = b;
        this.n = ge8Var;
        this.f1841o = layoutNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsF;
        byte b = this.m;
        f88 f88Var = f88.a;
        LayoutNode layoutNode = this.f1841o;
        ge8 ge8Var = this.n;
        switch (b) {
            case 0:
                j51.J(ge8Var, layoutNode);
                ((AndroidComposeView) ge8Var.f2529o).P = true;
                int[] iArr = ge8Var.z;
                int i = iArr[0];
                int i2 = iArr[1];
                View view = ge8Var.n;
                view.getLocationOnScreen(iArr);
                long j = ge8Var.A;
                long j2 = ((i04) obj).j();
                ge8Var.A = j2;
                sk8 sk8Var = ge8Var.B;
                if (sk8Var != null && ((i != iArr[0] || i2 != iArr[1] || !dl3.b(j, j2)) && (windowInsetsF = ge8Var.j(sk8Var).f()) != null)) {
                    view.dispatchApplyWindowInsets(windowInsetsF);
                }
                break;
            case 1:
                View view2 = ge8Var.n;
                Owner owner = (Owner) obj;
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(ge8Var, layoutNode);
                    androidComposeView.getAndroidViewsHandler$ui().addView(ge8Var);
                    androidComposeView.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(layoutNode, ge8Var);
                    ge8Var.setImportantForAccessibility(1);
                    be8.m(ge8Var, new qg(androidComposeView, layoutNode, androidComposeView));
                }
                if (view2.getParent() != ge8Var) {
                    ge8Var.addView(view2);
                }
                break;
            default:
                j51.J(ge8Var, layoutNode);
                break;
        }
        return f88Var;
    }
}
