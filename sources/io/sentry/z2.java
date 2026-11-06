package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class z2 implements Runnable {
    public final /* synthetic */ byte m;
    public final Object n;

    public /* synthetic */ z2(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) obj;
                String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
                if (cacheDirPath != null) {
                    io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
                    if (envelopeDiskCache instanceof io.sentry.cache.c) {
                        Charset charset = io.sentry.cache.c.u;
                        io.sentry.cache.c cVar = (io.sentry.cache.c) envelopeDiskCache;
                        cVar.c(new File(cacheDirPath, "session.json"), new File(cacheDirPath, "previous_session.json"));
                        cVar.q.countDown();
                    }
                } else {
                    sentryAndroidOptions.getLogger().g(f6.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
                }
                break;
            case 1:
                ((io.sentry.android.replay.capture.a) obj).a();
                break;
            case 2:
                ((io.sentry.android.replay.capture.a) obj).a();
                break;
            case 3:
                ((io.sentry.android.replay.capture.a) obj).a();
                break;
            case 4:
                ((io.sentry.android.replay.capture.a) obj).a();
                break;
            case 5:
                ((io.sentry.android.replay.capture.c) obj).a();
                break;
            case 6:
                ((io.sentry.android.replay.capture.c) obj).a();
                break;
            case 7:
                ((io.sentry.android.replay.capture.c) obj).a();
                break;
            case 8:
                io.sentry.logger.d dVar = (io.sentry.logger.d) obj;
                ConcurrentLinkedQueue concurrentLinkedQueue = dVar.f211o;
                do {
                    dVar.c();
                } while (concurrentLinkedQueue.size() >= 100);
                dVar.q.set(false);
                if (!concurrentLinkedQueue.isEmpty()) {
                    dVar.f(false);
                }
                break;
            default:
                io.sentry.metrics.c cVar2 = (io.sentry.metrics.c) obj;
                ConcurrentLinkedQueue concurrentLinkedQueue2 = cVar2.f214o;
                do {
                    cVar2.c();
                } while (concurrentLinkedQueue2.size() >= 1000);
                cVar2.q.set(false);
                if (!concurrentLinkedQueue2.isEmpty()) {
                    cVar2.d(false);
                }
                break;
        }
    }
}
