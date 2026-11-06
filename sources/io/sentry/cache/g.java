package io.sentry.cache;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.f6;
import io.sentry.g7;
import io.sentry.h4;
import io.sentry.p4;
import io.sentry.p7;
import io.sentry.protocol.w;
import io.sentry.s4;
import io.sentry.util.h;
import io.sentry.w7;
import io.sentry.y7;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class g extends s4 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final Object g = new Object();
    public static final Object h = new Object();
    public final SentryAndroidOptions a;
    public final h b = new h(new p7(this, 13));
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    public final AtomicBoolean e = new AtomicBoolean(false);

    public g(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    public final void a(String str) {
        a.a(this.a, ".scope-cache", str);
    }

    public final void b(Object obj, String str) {
        if (this.a.isEnableScopePersistence()) {
            if (obj == null) {
                obj = g;
            }
            this.c.put(str, obj);
            d();
        }
    }

    public final Object c(g7 g7Var, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return a.c(g7Var, ".scope-cache", str, cls);
        }
        try {
            return cls.cast(((io.sentry.cache.tape.g) this.b.a()).b0());
        } catch (IOException unused) {
            g7Var.getLogger().g(f6.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public final void d() {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        AtomicBoolean atomicBoolean = this.e;
        byte b = 0;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                if (sentryAndroidOptions.getExecutorService().submit(new f(this, b)).isCancelled()) {
                    atomicBoolean.set(false);
                }
            } catch (Throwable th) {
                atomicBoolean.set(false);
                sentryAndroidOptions.getLogger().d(f6.ERROR, "Scope persistence flush could not be submitted", th);
            }
        }
    }

    @Override // io.sentry.m1
    public final void j(io.sentry.h hVar) {
        if (this.a.isEnableScopePersistence()) {
            this.d.offer(hVar);
            d();
        }
    }

    @Override // io.sentry.s4, io.sentry.m1
    public final void k(w wVar) {
        b(wVar, "replay.json");
    }

    @Override // io.sentry.s4, io.sentry.m1
    public final void l(Collection collection) {
        if (collection.isEmpty() && this.a.isEnableScopePersistence()) {
            this.d.offer(h);
            d();
        }
    }

    @Override // io.sentry.m1
    public final void n(w7 w7Var, p4 p4Var) {
        if (w7Var == null) {
            h4 h4Var = p4Var.s;
            w7 w7Var2 = new w7((w) h4Var.b, (y7) h4Var.c, "default", null);
            w7Var2.u = "auto";
            w7Var = w7Var2;
        }
        b(w7Var, "trace.json");
    }

    @Override // io.sentry.s4, io.sentry.m1
    public final void o(io.sentry.protocol.e eVar) {
        b(eVar, "contexts.json");
    }

    @Override // io.sentry.s4, io.sentry.m1
    public final void p(String str) {
        b(str, "transaction.json");
    }
}
