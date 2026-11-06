package o;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class d95 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View m;
    public ViewTreeObserver n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f600o;

    public d95(View view, Runnable runnable) {
        this.m = view;
        this.n = view.getViewTreeObserver();
        this.f600o = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            yq4.l("view == null");
            return;
        }
        d95 d95Var = new d95(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(d95Var);
        view.addOnAttachStateChangeListener(d95Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.n.isAlive();
        View view = this.m;
        if (zIsAlive) {
            this.n.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f600o.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.n = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.n.isAlive();
        View view2 = this.m;
        if (zIsAlive) {
            this.n.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
