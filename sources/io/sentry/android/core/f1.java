package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public final WeakReference a;
    public final WeakReference b;

    public f1(Activity activity, r2 r2Var) {
        this.a = new WeakReference(activity);
        this.b = new WeakReference(r2Var);
    }
}
