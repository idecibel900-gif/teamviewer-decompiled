package com.google.firebase.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements DelegatingScheduledFuture.Resolver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DelegatingScheduledExecutorService b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TimeUnit d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j, TimeUnit timeUnit, byte b) {
        this.a = b;
        this.b = delegatingScheduledExecutorService;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                long j = this.c;
                TimeUnit timeUnit = this.d;
                return this.b.lambda$schedule$2((Runnable) obj, j, timeUnit, completer);
            default:
                long j2 = this.c;
                TimeUnit timeUnit2 = this.d;
                return this.b.lambda$schedule$5((Callable) obj, j2, timeUnit2, completer);
        }
    }
}
