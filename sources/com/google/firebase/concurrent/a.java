package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f47o;

    public /* synthetic */ a(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f47o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        Object obj = this.f47o;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                ((CustomThreadFactory) obj2).lambda$newThread$0((Runnable) obj);
                break;
            default:
                DelegatingScheduledExecutorService.lambda$schedule$3((Callable) obj2, (DelegatingScheduledFuture.Completer) obj);
                break;
        }
    }
}
