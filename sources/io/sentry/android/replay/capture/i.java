package io.sentry.android.replay.capture;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((io.sentry.rrweb.b) obj).n).compareTo(Long.valueOf(((io.sentry.rrweb.b) obj2).n));
    }
}
