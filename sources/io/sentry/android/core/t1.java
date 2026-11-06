package io.sentry.android.core;

import android.app.Activity;
import io.sentry.b4;
import io.sentry.c4;
import io.sentry.g7;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f125o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ t1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.m = b;
        this.n = obj;
        this.f125o = obj2;
        this.p = obj3;
        this.q = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        Object obj = this.q;
        Object obj2 = this.p;
        Object obj3 = this.f125o;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                io.sentry.n1 n1Var = (io.sentry.n1) obj3;
                b4 b4Var = (b4) obj2;
                g7 g7Var = (g7) obj;
                if (((w1) obj4).x.get()) {
                    return;
                }
                c4 c4Var = new c4(b4Var.a, b4Var.b, b4Var.d, b4Var.c, Double.valueOf(b4Var.e), g7Var);
                c4Var.w = b4Var.f;
                n1Var.k(c4Var);
                return;
            default:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                try {
                    ((AtomicReference) obj3).set(((ScreenshotEventProcessor) obj4).e((Activity) obj2));
                    return;
                } finally {
                    countDownLatch.countDown();
                }
        }
    }
}
