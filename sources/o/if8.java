package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class if8 implements View.OnAttachStateChangeListener {
    public final View m;
    public io.sentry.android.core.util.a n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n87 f1057o;
    public hf8 p;
    public boolean q;

    public if8(View view) {
        this.m = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        hf8 hf8Var = this.p;
        if (hf8Var == null) {
            return;
        }
        this.q = true;
        hf8Var.m.a(hf8Var.n);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        hf8 hf8Var = this.p;
        if (hf8Var != null) {
            x84 x84Var = hf8Var.p;
            hf8Var.q.j(null);
            yy2 yy2Var = hf8Var.f969o;
            if (yy2Var != null && x84Var != null) {
                x84Var.f(yy2Var);
            }
            if (x84Var != null) {
                x84Var.f(hf8Var);
            }
        }
    }
}
