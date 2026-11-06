package o;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class jl1 extends p77 {
    public final hl1 c;
    public AnimatorSet d;

    public jl1(hl1 hl1Var) {
        this.c = hl1Var;
    }

    @Override // o.p77
    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        AnimatorSet animatorSet = this.d;
        q77 q77Var = (q77) this.c.m;
        if (animatorSet == null) {
            q77Var.c(this);
            return;
        }
        if (q77Var.g) {
            animatorSet.reverse();
        } else {
            animatorSet.end();
        }
        if (su2.M(2)) {
            Log.v("FragmentManager", "Animator from operation " + q77Var + " has been canceled" + (q77Var.g ? " with seeking." : ".") + " ");
        }
    }

    @Override // o.p77
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        q77 q77Var = (q77) this.c.m;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            q77Var.c(this);
            return;
        }
        animatorSet.start();
        if (su2.M(2)) {
            Log.v("FragmentManager", "Animator from operation " + q77Var + " has started.");
        }
    }

    @Override // o.p77
    public final void c(p10 p10Var, ViewGroup viewGroup) {
        viewGroup.getClass();
        q77 q77Var = (q77) this.c.m;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            q77Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !q77Var.c.y) {
            return;
        }
        if (su2.M(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + q77Var);
        }
        long totalDuration = animatorSet.getTotalDuration();
        long j = (long) (p10Var.c * totalDuration);
        if (j == 0) {
            j = 1;
        }
        if (j == totalDuration) {
            j = totalDuration - 1;
        }
        if (su2.M(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + q77Var);
        }
        animatorSet.setCurrentPlayTime(j);
    }

    @Override // o.p77
    public final void d(ViewGroup viewGroup) {
        jl1 jl1Var;
        viewGroup.getClass();
        hl1 hl1Var = this.c;
        if (hl1Var.v0()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        yt2 yt2VarB0 = hl1Var.B0(context);
        this.d = yt2VarB0 != null ? (AnimatorSet) yt2VarB0.f2642o : null;
        q77 q77Var = (q77) hl1Var.m;
        ut2 ut2Var = q77Var.c;
        boolean z = q77Var.a == s77.p;
        View view = ut2Var.U;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            jl1Var = this;
            animatorSet.addListener(new il1(viewGroup, view, z, q77Var, jl1Var));
        } else {
            jl1Var = this;
        }
        AnimatorSet animatorSet2 = jl1Var.d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
