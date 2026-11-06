package o;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes.dex */
public abstract class ny0 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(my0 my0Var, yy0 yy0Var) {
        View childAt = ((ViewGroup) my0Var.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(yy0Var);
            return;
        }
        ComposeView composeView2 = new ComposeView(my0Var, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(yy0Var);
        View decorView = my0Var.getWindow().getDecorView();
        if (n67.l(decorView) == null) {
            decorView.setTag(com.teamviewer.teamviewer.market.mobile.R.id.view_tree_lifecycle_owner, my0Var);
        }
        if (v67.i(decorView) == null) {
            decorView.setTag(com.teamviewer.teamviewer.market.mobile.R.id.view_tree_view_model_store_owner, my0Var);
        }
        if (o67.j(decorView) == null) {
            decorView.setTag(com.teamviewer.teamviewer.market.mobile.R.id.view_tree_saved_state_registry_owner, my0Var);
        }
        my0Var.setContentView(composeView2, a);
    }
}
