package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements io.sentry.hints.a, io.sentry.hints.l {
    public final boolean m;

    public b0(boolean z) {
        this.m = z;
    }

    @Override // io.sentry.hints.a
    public final Long b() {
        return null;
    }

    @Override // io.sentry.hints.a
    public final boolean c() {
        return true;
    }

    @Override // io.sentry.hints.a
    public final String e() {
        return this.m ? "anr_background" : "anr_foreground";
    }
}
