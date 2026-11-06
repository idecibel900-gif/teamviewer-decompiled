package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public abstract class yn2 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public boolean a;
    public float b;
    public float c;
    public final /* synthetic */ bo2 d;

    public yn2(bo2 bo2Var) {
        this.d = bo2Var;
    }

    public float a() {
        return 0.0f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = (int) this.c;
        ao2 ao2Var = this.d.b;
        if (ao2Var != null) {
            ao2Var.k(f);
        }
        this.a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z = this.a;
        bo2 bo2Var = this.d;
        if (!z) {
            ao2 ao2Var = bo2Var.b;
            this.b = ao2Var == null ? 0.0f : ao2Var.m.m;
            this.c = a();
            this.a = true;
        }
        float f = this.b;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.c - f)) + f);
        ao2 ao2Var2 = bo2Var.b;
        if (ao2Var2 != null) {
            ao2Var2.k(animatedFraction);
        }
    }
}
