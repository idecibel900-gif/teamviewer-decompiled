package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.view.session.InstructionsOverlayView;

/* JADX INFO: loaded from: classes.dex */
public final class p6 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.L = null;
                actionBarOverlayLayout.v = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.L = null;
                actionBarOverlayLayout.v = false;
                break;
            case 1:
                z62 z62Var = (z62) obj;
                z62Var.c.setChecked(z62Var.j);
                z62Var.p.start();
                break;
            case 2:
                ((ExpandableTransformationBehavior) obj).b = null;
                break;
            case 3:
                ((HideBottomViewOnScrollBehavior) obj).c = null;
                break;
            case 4:
                animator.getClass();
                super.onAnimationEnd(animator);
                M2MClientActivity m2MClientActivity = (M2MClientActivity) obj;
                InstructionsOverlayView instructionsOverlayView = m2MClientActivity.T;
                if (instructionsOverlayView != null) {
                    instructionsOverlayView.setVisibility(8);
                }
                InstructionsOverlayView instructionsOverlayView2 = m2MClientActivity.T;
                if (instructionsOverlayView2 != null) {
                    instructionsOverlayView2.setAlpha(1.0f);
                }
                break;
            default:
                ((s18) obj).m();
                animator.removeListener(this);
                break;
        }
    }
}
