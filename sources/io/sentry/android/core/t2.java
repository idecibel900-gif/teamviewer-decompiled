package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
public final class t2 implements Comparable {
    public final long m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f126o;
    public final long p;
    public final boolean q;
    public final boolean r;
    public final long s;

    public t2(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5) {
        this.m = j;
        this.n = j2;
        this.f126o = j3;
        this.p = j4;
        this.q = z;
        this.r = z2;
        this.s = j5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.n, ((t2) obj).n);
    }

    public t2(long j) {
        this(j, j, 0L, 0L, false, false, 0L);
    }
}
