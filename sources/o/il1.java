package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class il1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ q77 d;
    public final /* synthetic */ jl1 e;

    public il1(ViewGroup viewGroup, View view, boolean z, q77 q77Var, jl1 jl1Var) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = q77Var;
        this.e = jl1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        q77 q77Var = this.d;
        if (z || q77Var.a == s77.p) {
            s77 s77Var = q77Var.a;
            view.getClass();
            s77Var.a(view, viewGroup);
        }
        jl1 jl1Var = this.e;
        ((q77) jl1Var.c.m).c(jl1Var);
        if (su2.M(2)) {
            Log.v("FragmentManager", "Animator from operation " + q77Var + " has ended.");
        }
    }
}
