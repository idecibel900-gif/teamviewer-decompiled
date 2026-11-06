package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class ik1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ c76 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ nk1 e;

    public ik1(nk1 nk1Var, c76 c76Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = nk1Var;
        this.b = c76Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        c76 c76Var = this.b;
        nk1 nk1Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                nk1Var.c(c76Var);
                nk1Var.q.remove(c76Var);
                nk1Var.i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                nk1Var.c(c76Var);
                nk1Var.f1572o.remove(c76Var);
                nk1Var.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public ik1(nk1 nk1Var, c76 c76Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = nk1Var;
        this.b = c76Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
