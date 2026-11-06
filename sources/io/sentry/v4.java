package io.sentry;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public final class v4 implements n1 {
    public final l1 a;
    public final l1 b;
    public final l1 c;
    public final v4 d;
    public final p e;
    public final o f;
    public final m0 g;
    public final m0 h;

    public v4(l1 l1Var, l1 l1Var2, l1 l1Var3, v4 v4Var) {
        this.f = new o(l1Var3, l1Var2, l1Var, (byte) 0);
        this.a = l1Var;
        this.b = l1Var2;
        this.c = l1Var3;
        this.d = v4Var;
        g7 g7VarL = l();
        io.sentry.util.b.v(g7VarL, "SentryOptions is required.");
        if (g7VarL.getDsn() == null || g7VarL.getDsn().isEmpty()) {
            hk0.g("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
            throw null;
        }
        this.e = g7VarL.getCompositePerformanceCollector();
        this.g = new m0(this);
        this.h = new m0(this);
    }

    @Override // io.sentry.n1
    public final boolean A(n1 n1Var) {
        if (n1Var == null) {
            return false;
        }
        if (this == n1Var) {
            return true;
        }
        if (n1Var.q() != null) {
            return A(n1Var.q());
        }
        return false;
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w B(v5 v5Var, p0 p0Var) {
        l1 l1Var = this.f;
        io.sentry.protocol.w wVarL = io.sentry.protocol.w.n;
        if (!isEnabled()) {
            l().getLogger().g(f6.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            p0Var.d(Boolean.TRUE, "sentry:captureFailed");
            return wVarL;
        }
        try {
            l1Var.C(v5Var);
            wVarL = l1Var.y().l(v5Var, l1Var, p0Var);
            l1Var.I(wVarL);
            return wVarL;
        } catch (Throwable th) {
            l().getLogger().d(f6.ERROR, "Error while capturing event with id: " + v5Var.m, th);
            p0Var.d(Boolean.TRUE, "sentry:captureFailed");
            return wVarL;
        }
    }

    @Override // io.sentry.n1
    public final void a(boolean z) {
        byte b = 0;
        if (!isEnabled()) {
            l().getLogger().g(f6.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (d2 d2Var : l().getIntegrations()) {
                if (d2Var instanceof Closeable) {
                    try {
                        ((Closeable) d2Var).close();
                    } catch (Throwable th) {
                        l().getLogger().g(f6.WARNING, "Failed to close the integration {}.", d2Var, th);
                    }
                }
            }
            for (j0 j0Var : l().getEventProcessors()) {
                if (j0Var instanceof Closeable) {
                    try {
                        ((Closeable) j0Var).close();
                    } catch (Throwable th2) {
                        l().getLogger().g(f6.WARNING, "Failed to close the event processor {}.", j0Var, th2);
                    }
                }
            }
            boolean zIsEnabled = isEnabled();
            o oVar = this.f;
            if (zIsEnabled) {
                try {
                    oVar.Q(null).clear();
                } catch (Throwable th3) {
                    l().getLogger().d(f6.ERROR, "Error in the 'configureScope' callback.", th3);
                }
            } else {
                l().getLogger().g(f6.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            t4 t4Var = t4.ISOLATION;
            if (isEnabled()) {
                try {
                    oVar.Q(t4Var).clear();
                } catch (Throwable th4) {
                    l().getLogger().d(f6.ERROR, "Error in the 'configureScope' callback.", th4);
                }
            } else {
                l().getLogger().g(f6.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            l().getBackpressureMonitor().close();
            l().getTransactionProfiler().close();
            l().getContinuousProfiler().a(true);
            l().getCompositePerformanceCollector().close();
            l().getConnectionStatusProvider().close();
            if (!z) {
                l().getTimerExecutorService().a(l().getShutdownTimeoutMillis());
            }
            r1 executorService = l().getExecutorService();
            if (z) {
                try {
                    executorService.submit(new u4(this, executorService, b));
                } catch (RejectedExecutionException e) {
                    l().getLogger().d(f6.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e);
                    executorService.a(l().getShutdownTimeoutMillis());
                }
            } else {
                executorService.a(l().getShutdownTimeoutMillis());
            }
            t4 t4Var2 = t4.CURRENT;
            if (isEnabled()) {
                try {
                    oVar.Q(t4Var2).y().a(z);
                } catch (Throwable th5) {
                    l().getLogger().d(f6.ERROR, "Error in the 'configureScope' callback.", th5);
                }
            } else {
                l().getLogger().g(f6.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            t4 t4Var3 = t4.ISOLATION;
            if (isEnabled()) {
                try {
                    oVar.Q(t4Var3).y().a(z);
                } catch (Throwable th6) {
                    l().getLogger().d(f6.ERROR, "Error in the 'configureScope' callback.", th6);
                }
            } else {
                l().getLogger().g(f6.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            t4 t4Var4 = t4.GLOBAL;
            if (!isEnabled()) {
                l().getLogger().g(f6.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                return;
            }
            try {
                oVar.Q(t4Var4).y().a(z);
            } catch (Throwable th7) {
                l().getLogger().d(f6.ERROR, "Error in the 'configureScope' callback.", th7);
            }
        } catch (Throwable th8) {
            l().getLogger().d(f6.ERROR, "Error while closing the Scopes.", th8);
        }
    }

    @Override // io.sentry.n1
    public final void b(long j) {
        if (!isEnabled()) {
            l().getLogger().g(f6.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f.y().b(j);
        } catch (Throwable th) {
            l().getLogger().d(f6.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.n1
    public final io.sentry.transport.p c() {
        return this.f.y().c();
    }

    @Override // io.sentry.n1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final f1 m30clone() {
        if (!isEnabled()) {
            l().getLogger().g(f6.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new w0((v4) z("scopes clone"));
    }

    @Override // io.sentry.n1
    public final boolean d() {
        return this.f.y().d();
    }

    @Override // io.sentry.n1
    public final void e(Throwable th, v7 v7Var, String str) {
        this.f.e(th, v7Var, str);
    }

    @Override // io.sentry.n1
    public final void f(h hVar, p0 p0Var) {
        if (!isEnabled()) {
            l().getLogger().g(f6.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (hVar == null) {
            l().getLogger().g(f6.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.f.f(hVar, p0Var);
        }
    }

    @Override // io.sentry.n1
    public final v1 g() {
        if (isEnabled()) {
            return this.f.g();
        }
        l().getLogger().g(f6.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w h(io.sentry.internal.debugmeta.c cVar, p0 p0Var) {
        io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
        if (!isEnabled()) {
            l().getLogger().g(f6.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return wVar;
        }
        try {
            io.sentry.protocol.w wVarH = this.f.y().h(cVar, p0Var);
            return wVarH != null ? wVarH : wVar;
        } catch (Throwable th) {
            l().getLogger().d(f6.ERROR, "Error while capturing envelope.", th);
            return wVar;
        }
    }

    @Override // io.sentry.n1
    public final boolean isEnabled() {
        return this.f.y().isEnabled();
    }

    @Override // io.sentry.n1
    public final void j(h hVar) {
        f(hVar, new p0());
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w k(c4 c4Var) {
        io.sentry.util.b.v(c4Var, "profilingContinuousData is required");
        io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
        if (!isEnabled()) {
            l().getLogger().g(f6.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return wVar;
        }
        try {
            return this.f.y().k(c4Var);
        } catch (Throwable th) {
            l().getLogger().d(f6.ERROR, "Error while capturing profile chunk with id: " + c4Var.f183o, th);
            return wVar;
        }
    }

    @Override // io.sentry.n1
    public final g7 l() {
        return ((l1) this.f.b).l();
    }

    @Override // io.sentry.n1
    public final x1 m() {
        if (isEnabled()) {
            return this.f.m();
        }
        l().getLogger().g(f6.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.n1
    public final void n() {
        if (!isEnabled()) {
            l().getLogger().g(f6.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        o oVar = this.f;
        u7 u7VarN = oVar.n();
        if (u7VarN != null) {
            oVar.y().e(u7VarN, io.sentry.util.b.g(new io.sentry.hints.j()));
        }
    }

    @Override // io.sentry.n1
    public final void o() {
        if (!isEnabled()) {
            l().getLogger().g(f6.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        o oVar = this.f;
        io.sentry.internal.debugmeta.c cVarO = oVar.o();
        if (cVarO == null) {
            l().getLogger().g(f6.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        u7 u7Var = (u7) cVarO.n;
        if (u7Var != null) {
            oVar.y().e(u7Var, io.sentry.util.b.g(new io.sentry.hints.j()));
        }
        oVar.y().e((u7) cVarO.f205o, io.sentry.util.b.g(new io.sentry.hints.j()));
    }

    @Override // io.sentry.n1
    public final x1 p(e8 e8Var, f8 f8Var) {
        Double dValueOf;
        e8Var.u = (String) f8Var.d;
        boolean zIsEnabled = isEnabled();
        x1 x1VarA = t3.a;
        if (!zIsEnabled) {
            l().getLogger().g(f6.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        } else if (io.sentry.util.q.a(e8Var.u, l().getIgnoredSpanOrigins())) {
            l().getLogger().g(f6.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", e8Var.u);
        } else if (!l().getInstrumenter().equals(e8Var.x)) {
            l().getLogger().g(f6.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", e8Var.x, l().getInstrumenter());
        } else if (l().isTracingEnabled()) {
            d dVar = e8Var.y;
            if (dVar == null || (dValueOf = dVar.d) == null) {
                Double d = ((d) this.f.v().e).d;
                dValueOf = Double.valueOf(d == null ? 0.0d : d.doubleValue());
            }
            h4 h4VarA = l().getInternalTracesSampler().a(new o(e8Var, dValueOf));
            Boolean bool = (Boolean) h4VarA.a;
            e8Var.a(h4VarA);
            w1 spanFactory = l().getSpanFactory();
            if (bool.booleanValue() && l().isContinuousProfilingEnabled()) {
                e4 profileLifecycle = l().getProfileLifecycle();
                e4 e4Var = e4.TRACE;
                if (profileLifecycle == e4Var && e8Var.A.equals(io.sentry.protocol.w.n)) {
                    l().getContinuousProfiler().d(e4Var, l().getInternalTracesSampler());
                }
            }
            x1VarA = spanFactory.a(e8Var, this, f8Var, this.e);
            if (bool.booleanValue() && ((Boolean) h4VarA.d).booleanValue()) {
                y1 transactionProfiler = l().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.a(x1VarA);
                } else if (f8Var.e) {
                    transactionProfiler.a(x1VarA);
                }
            }
        } else {
            l().getLogger().g(f6.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        }
        if (q4.ON == ((q4) f8Var.c)) {
            x1VarA.n();
        }
        return x1VarA;
    }

    @Override // io.sentry.n1
    public final n1 q() {
        return this.d;
    }

    @Override // io.sentry.n1
    public final void r(r4 r4Var) {
        if (!isEnabled()) {
            l().getLogger().g(f6.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            r4Var.i(this.f.Q(null));
        } catch (Throwable th) {
            l().getLogger().d(f6.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.n1
    public final io.sentry.logger.a s() {
        return this.g;
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w t(i7 i7Var, p0 p0Var) {
        l1 l1Var = this.f;
        io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
        if (!isEnabled()) {
            l().getLogger().g(f6.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return wVar;
        }
        try {
            return l1Var.y().g(i7Var, l1Var, p0Var);
        } catch (Throwable th) {
            l().getLogger().d(f6.ERROR, "Error while capturing replay", th);
            return wVar;
        }
    }

    @Override // io.sentry.n1
    public final l1 u() {
        return this.c;
    }

    @Override // io.sentry.n1
    public final l1 v() {
        return this.a;
    }

    @Override // io.sentry.n1
    public final e1 w() {
        return this.h;
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w x(Exception exc, p0 p0Var) {
        io.sentry.protocol.w wVarL = io.sentry.protocol.w.n;
        boolean zIsEnabled = isEnabled();
        l1 l1Var = this.f;
        if (zIsEnabled) {
            try {
                v5 v5Var = new v5(exc);
                l1Var.C(v5Var);
                wVarL = l1Var.y().l(v5Var, l1Var, p0Var);
            } catch (Throwable th) {
                l().getLogger().d(f6.ERROR, "Error while capturing exception: " + exc.getMessage(), th);
            }
        } else {
            l().getLogger().g(f6.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        }
        l1Var.I(wVarL);
        return wVarL;
    }

    @Override // io.sentry.n1
    public final io.sentry.protocol.w y(io.sentry.protocol.f0 f0Var, c8 c8Var, p0 p0Var, f4 f4Var) {
        io.sentry.protocol.f0 f0Var2;
        l1 l1Var = this.f;
        ArrayList arrayList = f0Var.E;
        io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
        if (!isEnabled()) {
            l().getLogger().g(f6.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return wVar;
        }
        if (f0Var.D == null) {
            l().getLogger().g(f6.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", f0Var.m);
            return wVar;
        }
        Boolean bool = Boolean.TRUE;
        w7 w7VarJ = f0Var.n.j();
        h4 h4Var = w7VarJ == null ? null : w7VarJ.p;
        if (!bool.equals(Boolean.valueOf(h4Var != null ? ((Boolean) h4Var.a).booleanValue() : false))) {
            l().getLogger().g(f6.DEBUG, "Transaction %s was dropped due to sampling decision.", f0Var.m);
            if (l().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.f clientReportRecorder = l().getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.BACKPRESSURE;
                clientReportRecorder.a(dVar, q.Transaction);
                l().getClientReportRecorder().e(dVar, q.Span, arrayList.size() + 1);
                return wVar;
            }
            io.sentry.clientreport.f clientReportRecorder2 = l().getClientReportRecorder();
            io.sentry.clientreport.d dVar2 = io.sentry.clientreport.d.SAMPLE_RATE;
            clientReportRecorder2.a(dVar2, q.Transaction);
            l().getClientReportRecorder().e(dVar2, q.Span, arrayList.size() + 1);
            return wVar;
        }
        try {
            f0Var2 = f0Var;
            try {
                return l1Var.y().j(f0Var2, c8Var, l1Var, p0Var, f4Var);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                l().getLogger().d(f6.ERROR, "Error while capturing transaction with id: " + f0Var2.m, th2);
                return wVar;
            }
        } catch (Throwable th3) {
            th = th3;
            f0Var2 = f0Var;
        }
    }

    @Override // io.sentry.n1
    public final n1 z(String str) {
        return new v4(this.a.clone(), this.b.clone(), this.c, this);
    }
}
