package io.sentry.exception;

import io.sentry.protocol.o;

/* JADX INFO: loaded from: classes.dex */
public final class a extends RuntimeException {
    public final o m;
    public final Throwable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Thread f192o;
    public final boolean p;

    public a(o oVar, Throwable th, Thread thread, boolean z) {
        this.m = oVar;
        io.sentry.util.b.v(th, "Throwable is required.");
        this.n = th;
        this.f192o = thread;
        this.p = z;
    }
}
