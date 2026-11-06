package io.sentry.cache;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.f6;
import io.sentry.h;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ g n;

    public /* synthetic */ f(g gVar, byte b) {
        this.m = b;
        this.n = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        byte b2 = 1;
        boolean z = false;
        g gVar = this.n;
        switch (b) {
            case 0:
                ConcurrentLinkedQueue concurrentLinkedQueue = gVar.d;
                ConcurrentHashMap concurrentHashMap = gVar.c;
                AtomicBoolean atomicBoolean = gVar.e;
                try {
                    try {
                        new f(gVar, b2).run();
                        break;
                    } catch (Throwable th) {
                        gVar.a.getLogger().d(f6.ERROR, "Serialization task failed", th);
                        break;
                    }
                    atomicBoolean.set(false);
                    if (concurrentHashMap.isEmpty() && concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    gVar.d();
                    return;
                } catch (Throwable th2) {
                    atomicBoolean.set(false);
                    if (!concurrentHashMap.isEmpty() || !concurrentLinkedQueue.isEmpty()) {
                        gVar.d();
                    }
                    throw th2;
                }
            default:
                SentryAndroidOptions sentryAndroidOptions = gVar.a;
                ConcurrentHashMap concurrentHashMap2 = gVar.c;
                for (String str : concurrentHashMap2.keySet()) {
                    Object objRemove = concurrentHashMap2.remove(str);
                    if (objRemove != null) {
                        if (objRemove == g.g) {
                            gVar.a(str);
                        } else {
                            a.d(sentryAndroidOptions, objRemove, ".scope-cache", str);
                        }
                    }
                }
                io.sentry.cache.tape.g gVar2 = (io.sentry.cache.tape.g) gVar.b.a();
                while (true) {
                    Object objPoll = gVar.d.poll();
                    if (objPoll == null) {
                        if (z) {
                            try {
                                gVar2.H0();
                                return;
                            } catch (IOException e) {
                                sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to sync breadcrumbs file queue", e);
                                return;
                            }
                        }
                        return;
                    }
                    try {
                        if (objPoll == g.h) {
                            gVar2.clear();
                        } else {
                            gVar2.G((h) objPoll);
                        }
                        z = true;
                    } catch (IOException e2) {
                        sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to apply breadcrumb change to file queue", e2);
                    }
                }
                break;
        }
    }
}
