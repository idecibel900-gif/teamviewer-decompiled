package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ DelegatingScheduledExecutorService n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Runnable f49o;
    public final /* synthetic */ DelegatingScheduledFuture.Completer p;

    public /* synthetic */ e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer, byte b) {
        this.m = b;
        this.n = delegatingScheduledExecutorService;
        this.f49o = runnable;
        this.p = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        DelegatingScheduledFuture.Completer completer = this.p;
        Runnable runnable = this.f49o;
        DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.n;
        switch (b) {
            case 0:
                delegatingScheduledExecutorService.lambda$scheduleAtFixedRate$7(runnable, completer);
                break;
            case 1:
                delegatingScheduledExecutorService.lambda$schedule$1(runnable, completer);
                break;
            default:
                delegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$10(runnable, completer);
                break;
        }
    }
}
