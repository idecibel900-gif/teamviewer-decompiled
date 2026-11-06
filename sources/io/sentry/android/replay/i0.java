package io.sentry.android.replay;

import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import o.im3;
import o.lv0;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ k0 m;
    public final /* synthetic */ View n;

    public i0(k0 k0Var, View view) {
        this.m = k0Var;
        this.n = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        k0 k0Var = this.m;
        Point point = k0Var.t;
        WeakReference weakReference = (WeakReference) lv0.w0(k0Var.s);
        View view = weakReference != null ? (View) weakReference.get() : null;
        View view2 = this.n;
        if (im3.n(view2, view)) {
            view2.getClass();
            if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                if (view2.getViewTreeObserver() != null && view2.getViewTreeObserver().isAlive()) {
                    try {
                        view2.getViewTreeObserver().removeOnPreDrawListener(this);
                    } catch (IllegalStateException unused) {
                    }
                }
                if (view2.getWidth() != point.x || view2.getHeight() != point.y) {
                    point.set(view2.getWidth(), view2.getHeight());
                    k0Var.f159o.H0(view2.getWidth(), view2.getHeight());
                }
            }
        } else if (view2 != null && view2.getViewTreeObserver() != null && view2.getViewTreeObserver().isAlive()) {
            try {
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            } catch (IllegalStateException unused2) {
            }
        }
        return true;
    }
}
