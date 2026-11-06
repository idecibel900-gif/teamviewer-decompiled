package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Comparable {
    public final long m;
    public final long n;

    public r(long j, long j2) {
        this.m = j;
        this.n = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        int iCompare = Long.compare(this.n, rVar.n);
        return iCompare != 0 ? iCompare : Long.compare(this.m, rVar.m);
    }
}
