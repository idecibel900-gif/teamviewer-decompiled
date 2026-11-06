package o;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ah7 extends Animation {
    public final /* synthetic */ int m;
    public final /* synthetic */ short n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f324o;

    /* JADX WARN: Multi-variable type inference failed */
    public ah7(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.f324o = swipeRefreshLayout;
        this.m = i;
        this.n = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        ur0 ur0Var = this.f324o.L;
        int i = this.m;
        ur0Var.setAlpha((int) (((this.n - i) * f) + i));
    }
}
