package io.sentry.android.core.internal.time;

import android.os.SystemClock;
import io.sentry.time.c;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {
    public static final a a = new a();

    @Override // io.sentry.time.c
    public final long a() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
