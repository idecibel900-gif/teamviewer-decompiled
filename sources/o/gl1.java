package o;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class gl1 extends p77 {
    public final hl1 c;

    public gl1(hl1 hl1Var) {
        this.c = hl1Var;
    }

    @Override // o.p77
    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        q77 q77Var = (q77) this.c.m;
        View view = q77Var.c.U;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        q77Var.c(this);
        if (su2.M(2)) {
            Log.v("FragmentManager", "Animation from operation " + q77Var + " has been cancelled.");
        }
    }

    @Override // o.p77
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        hl1 hl1Var = this.c;
        q77 q77Var = (q77) hl1Var.m;
        if (hl1Var.v0()) {
            q77Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = q77Var.c.U;
        context.getClass();
        yt2 yt2VarB0 = hl1Var.B0(context);
        if (yt2VarB0 == null) {
            hk0.l("Required value was null.");
            return;
        }
        Animation animation = (Animation) yt2VarB0.n;
        if (animation == null) {
            hk0.l("Required value was null.");
            return;
        }
        if (q77Var.a != s77.n) {
            view.startAnimation(animation);
            q77Var.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        zt2 zt2Var = new zt2(animation, viewGroup, view);
        zt2Var.setAnimationListener(new fl1(q77Var, viewGroup, view, this));
        view.startAnimation(zt2Var);
        if (su2.M(2)) {
            Log.v("FragmentManager", "Animation from operation " + q77Var + " has started.");
        }
    }
}
