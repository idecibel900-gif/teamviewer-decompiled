package o;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class zg7 extends Animation {
    public final /* synthetic */ byte m;
    public final /* synthetic */ SwipeRefreshLayout n;

    public /* synthetic */ zg7(SwipeRefreshLayout swipeRefreshLayout, byte b) {
        this.m = b;
        this.n = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.m;
        SwipeRefreshLayout swipeRefreshLayout = this.n;
        switch (b) {
            case 0:
                swipeRefreshLayout.setAnimationProgress(f);
                break;
            case 1:
                swipeRefreshLayout.setAnimationProgress(1.0f - f);
                break;
            case 2:
                int iAbs = swipeRefreshLayout.J - Math.abs(swipeRefreshLayout.I);
                int i = swipeRefreshLayout.H;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((i + ((int) ((iAbs - i) * f))) - swipeRefreshLayout.F.getTop());
                ur0 ur0Var = swipeRefreshLayout.L;
                float f2 = 1.0f - f;
                tr0 tr0Var = ur0Var.m;
                if (f2 != tr0Var.p) {
                    tr0Var.p = f2;
                }
                ur0Var.invalidateSelf();
                break;
            default:
                swipeRefreshLayout.k(f);
                break;
        }
    }
}
