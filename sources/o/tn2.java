package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class tn2 extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zn2 c;

    public tn2(zn2 zn2Var, boolean z) {
        this.c = zn2Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zn2 zn2Var = this.c;
        zn2Var.s = (byte) 0;
        zn2Var.n = null;
        if (this.a) {
            return;
        }
        FloatingActionButton floatingActionButton = zn2Var.t;
        boolean z = this.b;
        floatingActionButton.c(z ? 8 : 4, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zn2 zn2Var = this.c;
        zn2Var.t.c(0, this.b);
        zn2Var.s = (byte) 1;
        zn2Var.n = animator;
        this.a = false;
    }
}
