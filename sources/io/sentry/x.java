package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public final class x implements p {
    public final boolean f;
    public final SentryAndroidOptions g;
    public final io.sentry.util.a a = new io.sentry.util.a();
    public volatile Timer b = null;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    public x(SentryAndroidOptions sentryAndroidOptions) {
        boolean z = false;
        this.g = sentryAndroidOptions;
        for (i1 i1Var : sentryAndroidOptions.getPerformanceCollectors()) {
            if (i1Var instanceof j1) {
                this.d.add((j1) i1Var);
            }
            if (i1Var instanceof io.sentry.android.core.u2) {
                this.e.add((io.sentry.android.core.u2) i1Var);
            }
        }
        if (this.d.isEmpty() && this.e.isEmpty()) {
            z = true;
        }
        this.f = z;
    }

    @Override // io.sentry.p
    public final void a(String str) {
        byte b = 0;
        if (this.f) {
            this.g.getLogger().g(f6.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.c.containsKey(str)) {
            this.c.put(str, new w(this, null));
        }
        if (this.h.getAndSet(true)) {
            return;
        }
        io.sentry.util.a aVar = this.a;
        aVar.e();
        try {
            if (this.b == null) {
                this.b = new Timer(true);
            }
            this.b.schedule(new u(this, b), 0L);
            this.b.schedule(new v(this, new ArrayList()), 100L, 100L);
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // io.sentry.p
    public final void b(v7 v7Var) throws Throwable {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.u2) it.next()).e(v7Var);
        }
    }

    @Override // io.sentry.p
    public final List c(String str) {
        ConcurrentHashMap concurrentHashMap = this.c;
        w wVar = (w) concurrentHashMap.remove(str);
        this.g.getLogger().g(f6.DEBUG, ua5.m("stop collecting performance info for ", str), new Object[0]);
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        if (wVar != null) {
            return wVar.a;
        }
        return null;
    }

    @Override // io.sentry.p
    public final void close() {
        this.g.getLogger().g(f6.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.c.clear();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.u2) it.next()).d();
        }
        if (this.h.getAndSet(false)) {
            io.sentry.util.a aVar = this.a;
            aVar.e();
            try {
                if (this.b != null) {
                    this.b.cancel();
                    this.b = null;
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // io.sentry.p
    public final void d(v7 v7Var) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.u2) it.next()).f(v7Var);
        }
    }

    @Override // io.sentry.p
    public final void e(s7 s7Var) {
        if (this.f) {
            this.g.getLogger().g(f6.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.u2) it.next()).f(s7Var);
        }
        String strA = s7Var.a.a();
        ConcurrentHashMap concurrentHashMap = this.c;
        if (!concurrentHashMap.containsKey(strA)) {
            concurrentHashMap.put(strA, new w(this, s7Var));
        }
        a(strA);
    }

    @Override // io.sentry.p
    public final List f(x1 x1Var) {
        this.g.getLogger().g(f6.DEBUG, "stop collecting performance info for transactions %s (%s)", x1Var.getName(), x1Var.v().m.a());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.u2) it.next()).e(x1Var);
        }
        return c(x1Var.r().a());
    }
}
