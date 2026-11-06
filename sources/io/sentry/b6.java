package io.sentry;

import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final class b6 extends l5 {
    public final Instant m = Instant.now();

    @Override // io.sentry.l5
    public final long d() {
        Instant instant = this.m;
        return (instant.getEpochSecond() * 1000000000) + ((long) instant.getNano());
    }
}
