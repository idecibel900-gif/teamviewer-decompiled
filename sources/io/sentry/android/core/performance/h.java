package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.internal.gestures.j;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {
    public final io.sentry.android.core.internal.util.j n;

    public h(Window.Callback callback, io.sentry.android.core.internal.util.j jVar) {
        super(callback);
        this.n = jVar;
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.n.run();
    }
}
