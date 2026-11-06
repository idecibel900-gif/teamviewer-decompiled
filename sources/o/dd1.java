package o;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public final class dd1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout m;

    public dd1(CoordinatorLayout coordinatorLayout) {
        this.m = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.m.p(0);
        return true;
    }
}
