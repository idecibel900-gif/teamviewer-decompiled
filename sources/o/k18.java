package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class k18 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public k18(s18 s18Var, vw vwVar) {
        this.a = (byte) 0;
        this.c = s18Var;
        this.b = vwVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((ef8) this.b).a();
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
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((vw) obj2).remove(animator);
                ((s18) obj).y.remove(animator);
                break;
            case 1:
                ((ef8) obj2).c();
                break;
            default:
                xj8 xj8Var = (xj8) obj2;
                xj8Var.a.e(1.0f);
                tj8.f((View) obj, xj8Var);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((s18) this.c).y.add(animator);
                break;
            case 1:
                ((ef8) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ k18(byte b, View view, Object obj) {
        this.a = b;
        this.b = obj;
        this.c = view;
    }
}
