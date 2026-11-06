package o;

import android.animation.Animator;
import com.teamviewer.remotecontrollib.gui.view.M2MControlView;

/* JADX INFO: loaded from: classes.dex */
public final class ej4 implements Animator.AnimatorListener {
    public final /* synthetic */ M2MControlView a;

    public ej4(M2MControlView m2MControlView) {
        this.a = m2MControlView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        M2MControlView m2MControlView = this.a;
        if (m2MControlView.I == lb3.n) {
            m2MControlView.G = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i;
        int i2;
        animator.getClass();
        M2MControlView m2MControlView = this.a;
        m2MControlView.G = true;
        ku5 ku5Var = m2MControlView.H;
        int i3 = m2MControlView.p;
        int i4 = m2MControlView.f65o;
        int i5 = m2MControlView.n;
        if (m2MControlView.I == lb3.n) {
            i = i5 - i4;
            i2 = i5 - i3;
        } else {
            i = i5 - i3;
            i2 = i5 - i4;
            i4 = i3;
            i3 = i4;
        }
        ku5Var.a = (vn4.s0(i3 + (ku5Var.a * (i2 - i3))) - i4) / (i - i4);
    }
}
