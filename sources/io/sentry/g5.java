package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class g5 implements m5 {
    public final m5 a;

    public g5() {
        if (io.sentry.util.l.a || !io.sentry.util.l.b) {
            this.a = new c6((byte) 1);
        } else {
            this.a = new c6((byte) 0);
        }
    }

    @Override // io.sentry.m5
    public final l5 a() {
        return this.a.a();
    }
}
