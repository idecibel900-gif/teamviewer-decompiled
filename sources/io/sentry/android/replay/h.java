package io.sentry.android.replay;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparator {
    public final /* synthetic */ byte m;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return Long.valueOf(((l) obj).b).compareTo(Long.valueOf(((l) obj2).b));
            default:
                return Long.valueOf(((io.sentry.rrweb.b) obj).n).compareTo(Long.valueOf(((io.sentry.rrweb.b) obj2).n));
        }
    }
}
