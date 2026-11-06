package o;

import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class fe implements Animation.AnimationListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ j93 d;
    public final /* synthetic */ int e;

    public fe(View view, View view2, int i, j93 j93Var, int i2) {
        this.a = view;
        this.b = view2;
        this.c = i;
        this.d = j93Var;
        this.e = i2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        this.a.setVisibility(4);
        View view = this.b;
        view.setBackgroundColor(view.getContext().getColor(this.c));
        j93 j93Var = this.d;
        de deVar = (de) j93Var.n;
        if (deVar != null) {
            deVar.a.d(this.e, 1, null);
        }
        ((Function0) j93Var.q).a();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
    }
}
