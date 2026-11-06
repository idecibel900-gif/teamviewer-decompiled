package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class uh2 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    public uh2(zn2 zn2Var, boolean z) {
        this.a = (byte) 1;
        this.c = zn2Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                vh2 vh2Var = (vh2) obj;
                if (this.b) {
                    this.b = false;
                } else if (((Float) vh2Var.z.getAnimatedValue()).floatValue() != 0.0f) {
                    vh2Var.A = (byte) 2;
                    vh2Var.s.invalidate();
                } else {
                    vh2Var.A = (byte) 0;
                    vh2Var.j(0);
                }
                break;
            default:
                zn2 zn2Var = (zn2) obj;
                zn2Var.s = (byte) 0;
                zn2Var.n = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                zn2 zn2Var = (zn2) this.c;
                zn2Var.t.c(0, this.b);
                zn2Var.s = (byte) 2;
                zn2Var.n = animator;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public uh2(vh2 vh2Var) {
        this.a = (byte) 0;
        this.c = vh2Var;
        this.b = false;
    }
}
