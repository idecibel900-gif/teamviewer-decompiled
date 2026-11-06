package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class in3 implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final c76 e;
    public final byte f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c76 f1080o;
    public final /* synthetic */ ln3 p;

    /* JADX WARN: Multi-variable type inference failed */
    public in3(ln3 ln3Var, c76 c76Var, int i, float f, float f2, float f3, float f4, int i2, c76 c76Var2) {
        this.p = ln3Var;
        this.n = i2;
        this.f1080o = c76Var2;
        this.f = i;
        this.e = c76Var;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new rr(this, (byte) 5));
        valueAnimatorOfFloat.setTarget(c76Var.m);
        valueAnimatorOfFloat.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.e.o(true);
        }
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.k) {
            return;
        }
        int i = this.n;
        c76 c76Var = this.f1080o;
        ln3 ln3Var = this.p;
        if (i <= 0) {
            ln3Var.m.c(ln3Var.r, c76Var);
        } else {
            ln3Var.a.add(c76Var.m);
            this.h = true;
            if (i > 0) {
                ln3Var.r.post(new qt((byte) 3, i, ln3Var, this));
            }
        }
        View view = ln3Var.w;
        View view2 = c76Var.m;
        if (view == view2 && view2 == view) {
            ln3Var.w = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
