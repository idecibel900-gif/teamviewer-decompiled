package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final char a;
    public final int c;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicLong d = new AtomicLong(0);

    /* JADX WARN: Type inference failed for: r5v1, types: [char, int] */
    public i(int i, long j) {
        this.a = (int) j;
        this.c = i <= 0 ? 1 : i;
    }

    public final boolean a() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        AtomicInteger atomicInteger = this.b;
        if (j == 0 || atomicLong.get() + ((long) this.a) <= jUptimeMillis) {
            atomicInteger.set(0);
            atomicLong.set(jUptimeMillis);
            return false;
        }
        if (atomicInteger.incrementAndGet() < this.c) {
            return false;
        }
        atomicInteger.set(0);
        return true;
    }
}
