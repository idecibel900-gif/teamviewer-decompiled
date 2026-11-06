package o;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.NavigationMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class e15 extends e76 {
    public final /* synthetic */ h15 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e15(h15 h15Var, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.r = h15Var;
    }

    @Override // o.e76, o.p3
    public final void d(View view, g4 g4Var) {
        super.d(view, g4Var);
        h15 h15Var = this.r.q.f;
        int i = h15Var.n.getChildCount() == 0 ? 0 : 1;
        for (int i2 = 0; i2 < h15Var.q.c.size(); i2++) {
            if (h15Var.q.c(i2) == 0) {
                i++;
            }
        }
        g4Var.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, 0, false));
    }
}
