package o;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class sr0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ tr0 a;
    public final /* synthetic */ ur0 b;

    public sr0(ur0 ur0Var, tr0 tr0Var) {
        this.b = ur0Var;
        this.a = tr0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        tr0 tr0Var = this.a;
        ur0.d(fFloatValue, tr0Var);
        ur0 ur0Var = this.b;
        ur0Var.a(fFloatValue, tr0Var, false);
        ur0Var.invalidateSelf();
    }
}
