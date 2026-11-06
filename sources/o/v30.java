package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: loaded from: classes.dex */
public final class v30 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ v30(f40 f40Var, byte b) {
        this.a = b;
        this.b = f40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        f40 f40Var = this.b;
        switch (b) {
            case 0:
                f40Var.c();
                break;
            case 1:
                f40Var.b();
                break;
            case 2:
                f40Var.c();
                break;
            default:
                f40Var.b();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        byte b = this.a;
        f40 f40Var = this.b;
        switch (b) {
            case 2:
                SnackbarContentLayout snackbarContentLayout = f40Var.d;
                snackbarContentLayout.m.setAlpha(0.0f);
                snackbarContentLayout.m.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
                if (snackbarContentLayout.n.getVisibility() == 0) {
                    snackbarContentLayout.n.setAlpha(0.0f);
                    snackbarContentLayout.n.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
                }
                break;
            case 3:
                SnackbarContentLayout snackbarContentLayout2 = f40Var.d;
                snackbarContentLayout2.m.setAlpha(1.0f);
                snackbarContentLayout2.m.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
                if (snackbarContentLayout2.n.getVisibility() == 0) {
                    snackbarContentLayout2.n.setAlpha(1.0f);
                    snackbarContentLayout2.n.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ v30(f40 f40Var, int i, byte b) {
        this.a = b;
        this.b = f40Var;
    }
}
