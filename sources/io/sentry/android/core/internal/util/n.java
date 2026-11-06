package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.a0;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.k7;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((AtomicInteger) obj2).set(i);
                ((CountDownLatch) obj).countDown();
                break;
            default:
                final io.sentry.android.replay.screenshot.k kVar = (io.sentry.android.replay.screenshot.k) obj2;
                final View view = (View) obj;
                AtomicBoolean atomicBoolean = (AtomicBoolean) kVar.m;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) kVar.k;
                AtomicInteger atomicInteger = (AtomicInteger) kVar.p;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) kVar.b;
                if (atomicBoolean.get()) {
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
                    kVar.h();
                } else if (i == 0) {
                    final boolean z = ((AtomicBoolean) kVar.l).get();
                    if (z && atomicInteger.incrementAndGet() <= 1) {
                        sentryAndroidOptions.getLogger().g(f6.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
                        atomicBoolean2.set(false);
                        kVar.h();
                    } else {
                        try {
                            k7 sessionReplay = sentryAndroidOptions.getSessionReplay();
                            sessionReplay.getClass();
                            final io.sentry.android.replay.viewhierarchy.g gVarM = io.sentry.config.a.m(view, null, sessionReplay);
                            ArrayList arrayList = sentryAndroidOptions.getSessionReplay().f208o ? new ArrayList() : null;
                            k7 sessionReplay2 = sentryAndroidOptions.getSessionReplay();
                            sessionReplay2.getClass();
                            g1 logger = sentryAndroidOptions.getLogger();
                            logger.getClass();
                            io.sentry.config.a.F(view, gVarM, sessionReplay2, logger, arrayList);
                            if (arrayList != null && !arrayList.isEmpty()) {
                                ((a0) kVar.d).a();
                                kVar.e(view, arrayList, gVarM, !z);
                            }
                            if (((ScheduledExecutorService) kVar.e).submit(new io.sentry.android.replay.util.g(new Runnable() { // from class: io.sentry.android.replay.screenshot.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    k kVar2 = kVar;
                                    try {
                                        kVar2.d(view, gVarM, !z);
                                    } finally {
                                        kVar2.h();
                                    }
                                }
                            }, "screenshot_recorder.mask")) == null) {
                                kVar.h();
                            }
                        } catch (RuntimeException e) {
                            sentryAndroidOptions.getLogger().d(f6.WARNING, "Failed to process replay frame", e);
                            kVar.h();
                        }
                    }
                } else {
                    sentryAndroidOptions.getLogger().g(f6.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i));
                    atomicInteger.set(0);
                    atomicBoolean2.set(false);
                    kVar.h();
                }
                break;
        }
    }
}
