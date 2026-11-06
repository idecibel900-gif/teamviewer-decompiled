package io.sentry.android.core.internal.util;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View m;
    public final /* synthetic */ l n;

    public k(l lVar, View view) {
        this.n = lVar;
        this.m = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.m;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        view.getViewTreeObserver().removeOnDrawListener(this.n);
    }
}
