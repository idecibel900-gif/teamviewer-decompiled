package io.sentry.android.core;

import android.os.Process;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.z3;

/* JADX INFO: loaded from: classes.dex */
public final class j implements io.sentry.j1 {
    public long a;
    public long b;
    public long c;
    public boolean d;

    @Override // io.sentry.j1
    public final void a(z3 z3Var) {
        if (this.d) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = jElapsedRealtimeNanos - this.a;
            this.a = jElapsedRealtimeNanos;
            long elapsedCpuTime = Process.getElapsedCpuTime() * 1000000;
            long j2 = elapsedCpuTime - this.b;
            this.b = elapsedCpuTime;
            z3Var.a = ((j2 / j) / this.c) * 100.0d;
            z3Var.b = true;
        }
    }

    @Override // io.sentry.j1
    public final void c() {
        this.d = true;
        this.c = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.a = SystemClock.elapsedRealtimeNanos();
        this.b = Process.getElapsedCpuTime() * 1000000;
    }
}
