package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.q0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ViewTreeObserver.OnDrawListener {
    public final Handler m = new Handler(Looper.getMainLooper());
    public final AtomicReference n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f114o;

    public l(View view, Runnable runnable) {
        this.n = new AtomicReference(view);
        this.f114o = runnable;
    }

    public static void a(Activity activity, Runnable runnable, q0 q0Var) {
        Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                viewPeekDecorView.getViewTreeObserver().addOnDrawListener(new l(viewPeekDecorView, runnable));
            } else {
                Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.h(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new j(window, callback, runnable, q0Var)));
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        View view = (View) this.n.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new k(this, view));
        this.m.postAtFrontOfQueue(this.f114o);
    }
}
