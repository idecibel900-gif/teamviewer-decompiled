package io.sentry.android.core.internal.gestures;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements io.sentry.internal.gestures.a {
    public final io.sentry.util.h a;

    public a(io.sentry.util.h hVar) {
        this.a = hVar;
    }

    @Override // io.sentry.internal.gestures.a
    public final io.sentry.internal.gestures.c a(View view, float f, float f2, io.sentry.internal.gestures.b bVar) {
        String strU;
        if (bVar == io.sentry.internal.gestures.b.CLICKABLE && view.isClickable() && view.getVisibility() == 0) {
            String strU2 = io.sentry.config.a.u(view);
            if (strU2 == null) {
                return null;
            }
            return new io.sentry.internal.gestures.c(view, io.sentry.config.a.o(view), strU2, null, "old_view_system");
        }
        if (bVar == io.sentry.internal.gestures.b.SCROLLABLE) {
            if (((!((Boolean) this.a.a()).booleanValue() ? false : ScrollingView.class.isAssignableFrom(view.getClass())) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0 && (strU = io.sentry.config.a.u(view)) != null) {
                return new io.sentry.internal.gestures.c(view, io.sentry.config.a.o(view), strU, null, "old_view_system");
            }
            return null;
        }
        return null;
    }
}
