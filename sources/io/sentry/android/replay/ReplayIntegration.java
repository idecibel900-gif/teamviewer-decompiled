package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b5;
import io.sentry.d2;
import io.sentry.d6;
import io.sentry.f6;
import io.sentry.i3;
import io.sentry.i4;
import io.sentry.j4;
import io.sentry.j7;
import io.sentry.k7;
import io.sentry.m7;
import io.sentry.n1;
import io.sentry.p7;
import io.sentry.r1;
import io.sentry.u4;
import io.sentry.w4;
import io.sentry.y0;
import io.sentry.z0;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import o.bc7;
import o.ep1;
import o.im3;
import o.iq8;
import o.k76;
import o.kh7;
import o.lv0;
import o.ub7;
import o.vn4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u0006\u0007\u0007\b¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/d2;", "Ljava/io/Closeable;", "Lio/sentry/j4;", "Lio/sentry/z0;", "Lio/sentry/transport/o;", "io/sentry/android/replay/m", "io/sentry/s0", "io/sentry/android/replay/n", "sentry-android-replay_release"}, k = 1, mv = {1, ep1.b, 0}, xi = 48)
public final class ReplayIntegration implements d2, Closeable, j4, z0, io.sentry.transport.o {
    public static final /* synthetic */ int B = 0;
    public final AtomicReference A;
    public final Context m;
    public final io.sentry.transport.d n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y0 f136o;
    public SentryAndroidOptions p;
    public n1 q;
    public k0 r;
    public io.sentry.android.replay.gestures.b s;
    public final ThreadLocal t;
    public final kh7 u;
    public final kh7 v;
    public final kh7 w;
    public final AtomicBoolean x;
    public i4 y;
    public final m7 z;

    static {
        d6.d().b("maven:io.sentry:sentry-android-replay", "8.58.0");
    }

    public ReplayIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.m = applicationContext != null ? applicationContext : context;
        this.n = io.sentry.transport.d.m;
        this.f136o = y0.UNKNOWN;
        this.t = new ThreadLocal();
        this.u = new kh7(a.p);
        this.v = new kh7(new r(this, (byte) 1));
        this.w = new kh7(new r(this, (byte) 0));
        this.x = new AtomicBoolean(false);
        this.y = i3.a;
        this.z = new m7((byte) 4);
        w wVar = w.INITIAL;
        io.sentry.protocol.w wVar2 = io.sentry.protocol.w.n;
        wVar2.getClass();
        this.A = new AtomicReference(new n(0L, wVar, wVar2, null));
    }

    @Override // io.sentry.j4
    public final void F() {
        s sVar = new s(this, (byte) 0);
        m7 m7Var = this.z;
        m7Var.getClass();
        ((Handler) m7Var.n).post(sVar);
    }

    @Override // io.sentry.j4
    public final void G(d dVar) {
        this.y = dVar;
    }

    public final void H0(int i, int i2) {
        k0 k0Var;
        h0 h0Var;
        b0 b0Var;
        if (this.x.get() && ((n) this.A.get()).b()) {
            SentryAndroidOptions sentryAndroidOptions = this.p;
            if (sentryAndroidOptions == null) {
                im3.e0("options");
                throw null;
            }
            if (sentryAndroidOptions.getSessionReplay().k) {
                Context context = this.m;
                SentryAndroidOptions sentryAndroidOptions2 = this.p;
                if (sentryAndroidOptions2 == null) {
                    im3.e0("options");
                    throw null;
                }
                k7 sessionReplay = sentryAndroidOptions2.getSessionReplay();
                sessionReplay.getClass();
                context.getClass();
                float f = i2;
                float f2 = f / context.getResources().getDisplayMetrics().density;
                j7 j7Var = sessionReplay.f;
                int iS0 = vn4.s0(f2 * j7Var.sizeScale);
                int i3 = iS0 % 16;
                int iMax = i3 <= 8 ? Math.max(16, iS0 - i3) : iS0 + (16 - i3);
                float f3 = i;
                int iS1 = vn4.s0((f3 / context.getResources().getDisplayMetrics().density) * j7Var.sizeScale);
                int i4 = iS1 % 16;
                int iMax2 = i4 <= 8 ? Math.max(16, iS1 - i4) : iS1 + (16 - i4);
                c0 c0Var = new c0(iMax2, iMax, iMax2 / f3, iMax / f, sessionReplay.g ? 1 : 0, j7Var.bitRate);
                n nVar = (n) this.A.get();
                if (this.x.get() && nVar.b()) {
                    io.sentry.android.replay.capture.d dVar = nVar.d;
                    if (dVar != null) {
                        dVar.g(c0Var);
                    }
                    k0 k0Var2 = this.r;
                    if (k0Var2 != null && k0Var2.r.get()) {
                        if (k0Var2.y == null) {
                            io.sentry.util.a aVar = k0Var2.w;
                            aVar.e();
                            try {
                                if (k0Var2.y == null) {
                                    k0Var2.y = new h0(k0Var2.m, k0Var2.p);
                                }
                                iq8.l(aVar, null);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    iq8.l(aVar, th);
                                    throw th2;
                                }
                            }
                        }
                        h0 h0Var2 = k0Var2.y;
                        if (h0Var2 != null) {
                            h0Var2.p = c0Var;
                        }
                        h0 h0Var3 = k0Var2.y;
                        if (h0Var3 != null) {
                            h0Var3.f154o = new b0(k0Var2.m, k0Var2.n, c0Var, k0Var2);
                        }
                        WeakReference weakReference = (WeakReference) lv0.w0(k0Var2.s);
                        View view = weakReference != null ? (View) weakReference.get() : null;
                        if (view != null && (h0Var = k0Var2.y) != null && (b0Var = h0Var.f154o) != null) {
                            b0Var.a(view);
                        }
                        m7 m7Var = k0Var2.p;
                        h0 h0Var4 = k0Var2.y;
                        Handler handler = (Handler) m7Var.n;
                        if (h0Var4 != null) {
                            handler.removeCallbacks(h0Var4);
                        }
                        m7 m7Var2 = k0Var2.p;
                        h0 h0Var5 = k0Var2.y;
                        if (!(h0Var5 == null ? false : ((Handler) m7Var2.n).postDelayed(h0Var5, 100L))) {
                            k0Var2.m.getLogger().g(f6.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
                        }
                    }
                    if (nVar.b != w.PAUSED || (k0Var = this.r) == null) {
                        return;
                    }
                    k0Var.u();
                }
            }
        }
    }

    @Override // io.sentry.transport.o
    public final void J(io.sentry.transport.p pVar) {
        q qVar = new q(this, pVar, (byte) 2);
        m7 m7Var = this.z;
        m7Var.getClass();
        ((Handler) m7Var.n).post(qVar);
    }

    public final void K0() {
        AtomicReference atomicReference = this.A;
        n nVar = (n) atomicReference.get();
        if (this.x.get()) {
            w wVar = nVar.b;
            w wVar2 = w.PAUSED;
            if (io.sentry.config.a.x(wVar, wVar2)) {
                k0 k0Var = this.r;
                if (k0Var != null) {
                    k0Var.u();
                }
                io.sentry.android.replay.capture.d dVar = nVar.d;
                if (dVar != null) {
                    dVar.j();
                }
                atomicReference.set(n.a(nVar, wVar2, null, null, 13));
            }
        }
    }

    public final void L0() {
        h0 h0Var;
        View view;
        io.sentry.transport.p pVarC;
        io.sentry.transport.p pVarC2;
        n nVar = (n) this.A.get();
        if (this.x.get()) {
            w wVar = nVar.b;
            w wVar2 = w.RESUMED;
            if (io.sentry.config.a.x(wVar, wVar2) && this.f136o != y0.DISCONNECTED) {
                n1 n1Var = this.q;
                if (n1Var == null || (pVarC2 = n1Var.c()) == null || !pVarC2.j(io.sentry.q.All)) {
                    n1 n1Var2 = this.q;
                    if (n1Var2 == null || (pVarC = n1Var2.c()) == null || !pVarC.j(io.sentry.q.Replay)) {
                        io.sentry.android.replay.capture.d dVar = nVar.d;
                        if (dVar != null) {
                            dVar.d.submit(new io.sentry.android.replay.util.g(new u4((Object) dVar, (Object) new Date(), (byte) 12), "CaptureStrategy.resume"));
                        }
                        k0 k0Var = this.r;
                        if (k0Var != null && (h0Var = k0Var.y) != null) {
                            m7 m7Var = h0Var.n;
                            SentryAndroidOptions sentryAndroidOptions = h0Var.m;
                            if (sentryAndroidOptions.getSessionReplay().m) {
                                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Resuming the capture runnable.", new Object[0]);
                            }
                            b0 b0Var = h0Var.f154o;
                            if (b0Var != null) {
                                WeakReference weakReference = b0Var.n;
                                if (weakReference != null && (view = (View) weakReference.get()) != null && view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
                                    try {
                                        view.getViewTreeObserver().addOnDrawListener(b0Var);
                                    } catch (IllegalStateException unused) {
                                    }
                                }
                                b0Var.f139o.set(true);
                            }
                            h0Var.q.getAndSet(true);
                            ((Handler) m7Var.n).removeCallbacks(h0Var);
                            if (!((Handler) m7Var.n).post(h0Var)) {
                                sentryAndroidOptions.getLogger().g(f6.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
                            }
                        }
                        this.A.set(n.a(nVar, wVar2, null, null, 13));
                    }
                }
            }
        }
    }

    public final boolean M0(Double d) {
        ThreadLocal threadLocal = this.t;
        io.sentry.util.m mVar = (io.sentry.util.m) threadLocal.get();
        if (mVar == null) {
            mVar = new io.sentry.util.m();
            threadLocal.set(mVar);
        }
        return d != null && d.doubleValue() >= mVar.c();
    }

    public final void N0(boolean z) {
        if (this.v.a()) {
            kh7 kh7Var = this.v;
            if (z) {
                ((io.sentry.android.replay.util.f) kh7Var.getValue()).shutdown();
            } else {
                io.sentry.android.replay.util.f fVar = (io.sentry.android.replay.util.f) kh7Var.getValue();
                synchronized (fVar) {
                    if (!fVar.m.isShutdown()) {
                        fVar.m.shutdown();
                    }
                }
            }
        }
        if (this.w.a()) {
            kh7 kh7Var2 = this.w;
            if (z) {
                ((io.sentry.android.replay.util.f) kh7Var2.getValue()).shutdown();
                return;
            }
            io.sentry.android.replay.util.f fVar2 = (io.sentry.android.replay.util.f) kh7Var2.getValue();
            synchronized (fVar2) {
                if (!fVar2.m.isShutdown()) {
                    fVar2.m.shutdown();
                }
            }
        }
    }

    public final void O0(boolean z) {
        AtomicReference atomicReference = this.A;
        n nVar = (n) atomicReference.get();
        if (this.x.get() && io.sentry.config.a.x(nVar.b, w.STOPPED)) {
            k0 k0Var = this.r;
            kh7 kh7Var = this.u;
            if (k0Var != null) {
                io.sentry.android.core.i0 i0Var = ((y) kh7Var.getValue()).f173o;
                k0 k0Var2 = this.r;
                k0Var2.getClass();
                i0Var.remove(k0Var2);
            }
            ((y) kh7Var.getValue()).f173o.remove(this.s);
            k0 k0Var3 = this.r;
            if (k0Var3 != null) {
                k0Var3.reset();
            }
            k0 k0Var4 = this.r;
            if (k0Var4 != null) {
                k0Var4.z();
            }
            io.sentry.android.replay.gestures.b bVar = this.s;
            if (bVar != null) {
                ArrayList arrayList = bVar.f152o;
                io.sentry.util.a aVar = bVar.p;
                aVar.e();
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        View view = (View) ((WeakReference) it.next()).get();
                        if (view != null) {
                            bVar.b(view);
                        }
                    }
                    arrayList.clear();
                    iq8.l(aVar, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        iq8.l(aVar, th);
                        throw th2;
                    }
                }
            }
            io.sentry.android.replay.capture.d dVar = nVar.d;
            if (dVar != null) {
                dVar.o();
            }
            w wVar = w.STOPPED;
            io.sentry.protocol.w wVar2 = io.sentry.protocol.w.n;
            wVar2.getClass();
            atomicReference.set(n.a(nVar, wVar, wVar2, null, 1));
        }
    }

    @Override // io.sentry.d2
    public final void Y(SentryAndroidOptions sentryAndroidOptions) {
        this.p = sentryAndroidOptions;
        w4 w4Var = w4.a;
        this.q = w4Var;
        this.r = new k0(sentryAndroidOptions, this, this, this.z, (io.sentry.android.replay.util.f) this.v.getValue());
        this.s = new io.sentry.android.replay.gestures.b(sentryAndroidOptions, this);
        this.x.set(true);
        sentryAndroidOptions.getConnectionStatusProvider().j0(this);
        io.sentry.transport.p pVarC = w4Var.c();
        if (pVarC != null) {
            pVarC.p.add(this);
        }
        io.sentry.util.b.a("Replay");
        SentryAndroidOptions sentryAndroidOptions2 = this.p;
        if (sentryAndroidOptions2 == null) {
            im3.e0("options");
            throw null;
        }
        r1 executorService = sentryAndroidOptions2.getExecutorService();
        executorService.getClass();
        SentryAndroidOptions sentryAndroidOptions3 = this.p;
        if (sentryAndroidOptions3 == null) {
            im3.e0("options");
            throw null;
        }
        byte b = 14;
        try {
            executorService.submit(new u4(new b5(this, b), sentryAndroidOptions3, b));
        } catch (Throwable th) {
            sentryAndroidOptions3.getLogger().d(f6.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th);
        }
    }

    @Override // io.sentry.j4
    public final void b0() {
        s sVar = new s(this, (byte) 1);
        m7 m7Var = this.z;
        m7Var.getClass();
        ((Handler) m7Var.n).post(sVar);
    }

    @Override // io.sentry.j4
    public final void c0(String str) {
        io.sentry.android.replay.capture.d dVar;
        str.getClass();
        n nVar = (n) this.A.get();
        if (!this.x.get() || !nVar.b() || (dVar = nVar.d) == null || str.length() <= 0) {
            return;
        }
        synchronized (dVar.r) {
            if (dVar.t.size() < 100) {
                dVar.t.add(str);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.x.get()) {
            SentryAndroidOptions sentryAndroidOptions = this.p;
            if (sentryAndroidOptions == null) {
                im3.e0("options");
                throw null;
            }
            if (sentryAndroidOptions.getThreadChecker().c()) {
                o0();
                N0(false);
                return;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            u4 u4Var = new u4((Object) this, (Object) countDownLatch, (byte) 11);
            m7 m7Var = this.z;
            m7Var.getClass();
            if (((Handler) m7Var.n).post(u4Var)) {
                try {
                    SentryAndroidOptions sentryAndroidOptions2 = this.p;
                    if (sentryAndroidOptions2 == null) {
                        im3.e0("options");
                        throw null;
                    }
                    if (countDownLatch.await(sentryAndroidOptions2.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                        N0(true);
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // io.sentry.j4
    public final io.sentry.protocol.w e(Boolean bool) {
        n nVar = (n) this.A.get();
        if (this.x.get()) {
            boolean zB = nVar.b();
            io.sentry.android.replay.capture.d dVar = nVar.d;
            io.sentry.protocol.w wVar = nVar.c;
            if (zB) {
                io.sentry.protocol.w wVar2 = io.sentry.protocol.w.n;
                byte b = 0;
                if (im3.n(wVar, wVar2)) {
                    SentryAndroidOptions sentryAndroidOptions = this.p;
                    if (sentryAndroidOptions == null) {
                        im3.e0("options");
                        throw null;
                    }
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    wVar2.getClass();
                    return wVar2;
                }
                if (dVar instanceof io.sentry.android.replay.capture.h) {
                    SentryAndroidOptions sentryAndroidOptions2 = this.p;
                    if (sentryAndroidOptions2 == null) {
                        im3.e0("options");
                        throw null;
                    }
                    if (!M0(sentryAndroidOptions2.getSessionReplay().e)) {
                        SentryAndroidOptions sentryAndroidOptions3 = this.p;
                        if (sentryAndroidOptions3 == null) {
                            im3.e0("options");
                            throw null;
                        }
                        sentryAndroidOptions3.getLogger().g(f6.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
                        wVar2.getClass();
                        return wVar2;
                    }
                }
                n1 n1Var = this.q;
                if (n1Var != null) {
                    n1Var.r(new p7(nVar, (byte) 9));
                }
                if (bool.equals(Boolean.TRUE)) {
                    if (dVar != null) {
                        dVar.a(c.q, true);
                    }
                    return wVar;
                }
                q qVar = new q(this, nVar, b);
                m7 m7Var = this.z;
                m7Var.getClass();
                ((Handler) m7Var.n).post(qVar);
                return wVar;
            }
        }
        io.sentry.protocol.w wVar3 = io.sentry.protocol.w.n;
        wVar3.getClass();
        return wVar3;
    }

    @Override // io.sentry.j4
    public final io.sentry.protocol.w j() {
        return ((n) this.A.get()).c;
    }

    @Override // io.sentry.j4
    /* JADX INFO: renamed from: k0, reason: from getter */
    public final i4 getY() {
        return this.y;
    }

    public final void l0(String str) {
        File[] fileArrListFiles;
        SentryAndroidOptions sentryAndroidOptions = this.p;
        if (sentryAndroidOptions == null) {
            im3.e0("options");
            throw null;
        }
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            name.getClass();
            if (bc7.N(false, name, "replay_") && !ub7.Q(name, j().a(), false) && (ub7.b0(str) || !ub7.Q(name, str, false))) {
                io.sentry.util.b.h(file);
            }
        }
    }

    public final void o0() {
        io.sentry.transport.p pVarC;
        AtomicReference atomicReference = this.A;
        w wVar = ((n) atomicReference.get()).b;
        w wVar2 = w.CLOSED;
        if (io.sentry.config.a.x(wVar, wVar2)) {
            SentryAndroidOptions sentryAndroidOptions = this.p;
            if (sentryAndroidOptions == null) {
                im3.e0("options");
                throw null;
            }
            sentryAndroidOptions.getConnectionStatusProvider().w0(this);
            n1 n1Var = this.q;
            if (n1Var != null && (pVarC = n1Var.c()) != null) {
                pVarC.p.remove(this);
            }
            O0(true);
            k0 k0Var = this.r;
            if (k0Var != null) {
                k0Var.close();
            }
            this.r = null;
            ((y) this.u.getValue()).close();
            Object obj = atomicReference.get();
            obj.getClass();
            atomicReference.set(n.a((n) obj, wVar2, null, null, 13));
        }
    }

    @Override // io.sentry.j4
    public final void q(boolean z) {
        t tVar = new t(this, z);
        m7 m7Var = this.z;
        m7Var.getClass();
        ((Handler) m7Var.n).post(tVar);
    }

    @Override // io.sentry.j4
    public final void stop() {
        s sVar = new s(this, (byte) 3);
        m7 m7Var = this.z;
        m7Var.getClass();
        ((Handler) m7Var.n).post(sVar);
    }

    @Override // io.sentry.z0
    public final void u(y0 y0Var) {
        y0Var.getClass();
        q qVar = new q(this, y0Var, (byte) 1);
        m7 m7Var = this.z;
        m7Var.getClass();
        ((Handler) m7Var.n).post(qVar);
    }

    public final void x0(Bitmap bitmap) {
        bitmap.getClass();
        k76 k76Var = new k76();
        n1 n1Var = this.q;
        if (n1Var != null) {
            n1Var.r(new io.sentry.android.fragment.c(k76Var, (byte) 1));
        }
        io.sentry.android.replay.capture.d dVar = ((n) this.A.get()).d;
        if (dVar != null) {
            dVar.h(new u(this, bitmap, k76Var));
        }
        s sVar = new s(this, (byte) 2);
        m7 m7Var = this.z;
        m7Var.getClass();
        ((Handler) m7Var.n).post(sVar);
    }

    @Override // io.sentry.j4
    public final void z(io.sentry.protocol.w wVar) {
        io.sentry.android.replay.capture.d dVar;
        wVar.getClass();
        n nVar = (n) this.A.get();
        if (!this.x.get() || !nVar.b() || (dVar = nVar.d) == null || wVar.equals(io.sentry.protocol.w.n)) {
            return;
        }
        synchronized (dVar.r) {
            if (dVar.s.size() < 100) {
                dVar.s.add(wVar.a());
            }
        }
    }
}
