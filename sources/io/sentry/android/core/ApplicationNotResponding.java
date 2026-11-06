package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
final class ApplicationNotResponding extends RuntimeException {
    public final Thread m;

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        io.sentry.util.b.v(thread, "Thread must be provided.");
        this.m = thread;
        setStackTrace(thread.getStackTrace());
    }

    public ApplicationNotResponding(String str) {
        super(str);
        this.m = null;
    }
}
