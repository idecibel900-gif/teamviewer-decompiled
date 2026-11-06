package o;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class yg7 implements Animation.AnimationListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ yg7(SwipeRefreshLayout swipeRefreshLayout, byte b) {
        this.a = b;
        this.b = swipeRefreshLayout;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ch7 ch7Var;
        byte b = this.a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (b) {
            case 0:
                if (!swipeRefreshLayout.f26o) {
                    swipeRefreshLayout.l();
                } else {
                    swipeRefreshLayout.L.setAlpha(255);
                    swipeRefreshLayout.L.start();
                    if (swipeRefreshLayout.Q && (ch7Var = swipeRefreshLayout.n) != null) {
                        ch7Var.a();
                    }
                    swipeRefreshLayout.z = swipeRefreshLayout.F.getTop();
                }
                break;
            default:
                zg7 zg7Var = new zg7(swipeRefreshLayout, (byte) 1);
                swipeRefreshLayout.N = zg7Var;
                zg7Var.setDuration(150L);
                nr0 nr0Var = swipeRefreshLayout.F;
                nr0Var.m = null;
                nr0Var.clearAnimation();
                swipeRefreshLayout.F.startAnimation(swipeRefreshLayout.N);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        byte b = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        byte b = this.a;
    }
}
