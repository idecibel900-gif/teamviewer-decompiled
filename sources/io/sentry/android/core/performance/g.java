package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.k6;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {
    public String m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f123o;
    public long p;

    public final long a() {
        if (e()) {
            return this.p - this.f123o;
        }
        return 0L;
    }

    public final k6 b() {
        if (d()) {
            return new k6(this.n * 1000000);
        }
        return null;
    }

    public final boolean c() {
        return this.p == 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.n, ((g) obj).n);
    }

    public final boolean d() {
        return this.f123o != 0;
    }

    public final boolean e() {
        return this.p != 0;
    }

    public final void f(long j) {
        this.f123o = j;
        this.n = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f123o);
    }
}
