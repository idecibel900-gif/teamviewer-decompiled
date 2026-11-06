package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class bh3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ ch3 e;

    /* JADX WARN: Multi-variable type inference failed */
    public bh3(ch3 ch3Var, int i, TextView textView, int i2, TextView textView2) {
        this.e = ch3Var;
        this.a = i;
        this.b = textView;
        this.c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yt ytVar;
        byte b = this.a;
        ch3 ch3Var = this.e;
        ch3Var.h = b;
        ch3Var.f = null;
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.c == 1 && (ytVar = ch3Var.l) != null) {
                ytVar.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
