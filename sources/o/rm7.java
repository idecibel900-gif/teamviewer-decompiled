package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class rm7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm7 b;

    public rm7(sm7 sm7Var, int i) {
        this.b = sm7Var;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.n = this.a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.n = this.a;
    }
}
