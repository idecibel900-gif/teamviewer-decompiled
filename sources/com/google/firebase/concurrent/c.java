package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Runnable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f48o;

    public /* synthetic */ c(Runnable runnable, DelegatingScheduledFuture.Completer completer, byte b) {
        this.m = b;
        this.n = runnable;
        this.f48o = completer;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.m) {
            case 0:
                DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(this.n, this.f48o);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(this.n, this.f48o);
                break;
            default:
                DelegatingScheduledExecutorService.lambda$schedule$0(this.n, this.f48o);
                break;
        }
    }
}
