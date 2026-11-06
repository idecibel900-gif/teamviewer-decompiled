package io.sentry.android.replay;

import o.ic2;
import o.qs1;

/* JADX INFO: loaded from: classes.dex */
public enum w {
    INITIAL,
    STARTED,
    RESUMED,
    PAUSED,
    STOPPED,
    CLOSED;

    private static final /* synthetic */ ic2 $ENTRIES = qs1.K(values());

    public static ic2 getEntries() {
        return $ENTRIES;
    }
}
