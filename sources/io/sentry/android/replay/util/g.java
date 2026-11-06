package io.sentry.android.replay.util;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {
    public final String m;
    public final /* synthetic */ Runnable n;

    public g(Runnable runnable, String str) {
        runnable.getClass();
        this.m = str;
        this.n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.run();
    }
}
