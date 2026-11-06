package o;

import android.animation.Animator;
import com.teamviewer.libs.materialtoolbar.fab.ToolbarItemViewFab;

/* JADX INFO: loaded from: classes.dex */
public final class nz7 implements Animator.AnimatorListener {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nz7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                animator.getClass();
                break;
            case 1:
                animator.getClass();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                animator.getClass();
                oz7 oz7Var = ((ToolbarItemViewFab) obj).C;
                if (oz7Var == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                if (oz7Var.a()) {
                    ((ToolbarItemViewFab) this.b).setVisibility(8);
                    return;
                }
                return;
            case 1:
                animator.getClass();
                ((ToolbarItemViewFab) obj).requestLayout();
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                animator.getClass();
                break;
            case 1:
                animator.getClass();
                break;
            default:
                ur0 ur0Var = (ur0) this.c;
                tr0 tr0Var = (tr0) this.b;
                ur0Var.a(1.0f, tr0Var, true);
                tr0Var.k = tr0Var.e;
                tr0Var.l = tr0Var.f;
                tr0Var.m = tr0Var.g;
                tr0Var.a((tr0Var.j + 1) % tr0Var.i.length);
                if (!ur0Var.r) {
                    ur0Var.q += 1.0f;
                } else {
                    ur0Var.r = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    if (tr0Var.n) {
                        tr0Var.n = false;
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                animator.getClass();
                return;
            case 1:
                animator.getClass();
                oz7 oz7Var = ((ToolbarItemViewFab) obj).C;
                if (oz7Var == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                if (oz7Var.a()) {
                    ((ToolbarItemViewFab) this.b).setVisibility(0);
                    return;
                }
                return;
            default:
                ((ur0) obj).q = 0.0f;
                return;
        }
    }
}
