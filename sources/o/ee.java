package o;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ee implements Animation.AnimationListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ j93 d;
    public final /* synthetic */ r e;
    public final /* synthetic */ int f;
    public final /* synthetic */ View g;
    public final /* synthetic */ int h;

    public ee(View view, View view2, int i, j93 j93Var, r rVar, int i2, View view3, xz2 xz2Var, int i3) {
        this.a = view;
        this.b = view2;
        this.c = i;
        this.d = j93Var;
        this.e = rVar;
        this.f = i2;
        this.g = view3;
        this.h = i3;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        int i = this.e == r.n ? -1 : 1;
        View view = this.g;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, view.getWidth() * i * 0.7f, 0.0f, 0.0f);
        translateAnimation.setFillAfter(true);
        translateAnimation.setDuration(400L);
        translateAnimation.setAnimationListener(new fe(this.a, this.b, this.h, this.d, this.f));
        view.startAnimation(translateAnimation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        eh7 item;
        eh7 item2;
        animation.getClass();
        this.a.setVisibility(0);
        View view = this.b;
        view.setBackgroundColor(view.getContext().getColor(this.c));
        char c = this.e == r.m ? (char) 4 : '\b';
        j93 j93Var = this.d;
        zd zdVar = (zd) j93Var.f1141o;
        ((Function0) j93Var.p).a();
        int i = this.f;
        if (c == 4) {
            if (zdVar == null || (item = zdVar.getItem(i)) == null) {
                return;
            }
            item.p(new fd((byte) 1));
            return;
        }
        if (c != '\b' || zdVar == null || (item2 = zdVar.getItem(i)) == null) {
            return;
        }
        item2.q(new fd((byte) 0));
    }
}
