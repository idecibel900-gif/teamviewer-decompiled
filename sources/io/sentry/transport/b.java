package io.sentry.transport;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.f6;
import io.sentry.n5;
import io.sentry.p0;
import java.io.IOException;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {
    public final io.sentry.internal.debugmeta.c m;
    public final p0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final io.sentry.cache.d f263o;
    public final r p = new r(-1);
    public final /* synthetic */ c q;

    public b(c cVar, io.sentry.internal.debugmeta.c cVar2, p0 p0Var, io.sentry.cache.d dVar) {
        this.q = cVar;
        io.sentry.util.b.v(cVar2, "Envelope is required.");
        this.m = cVar2;
        this.n = p0Var;
        io.sentry.util.b.v(dVar, "EnvelopeCache is required.");
        this.f263o = dVar;
    }

    public final io.sentry.config.a a() {
        io.sentry.internal.debugmeta.c cVar = this.m;
        ((n5) cVar.n).p = null;
        io.sentry.cache.d dVar = this.f263o;
        p0 p0Var = this.n;
        boolean zF = dVar.F(cVar, p0Var);
        Object objB = p0Var.b("sentry:typeCheckHint");
        boolean zIsInstance = io.sentry.hints.c.class.isInstance(p0Var.b("sentry:typeCheckHint"));
        c cVar2 = this.q;
        if (zIsInstance && objB != null) {
            io.sentry.hints.c cVar3 = (io.sentry.hints.c) objB;
            SentryAndroidOptions sentryAndroidOptions = cVar2.f264o;
            if (cVar3.f(((n5) cVar.n).m)) {
                cVar3.m.countDown();
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Disk flush envelope fired", new Object[0]);
            } else {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = cVar2.f264o;
        if (!cVar2.q.e()) {
            Object objB2 = p0Var.b("sentry:typeCheckHint");
            boolean zIsInstance2 = io.sentry.hints.h.class.isInstance(p0Var.b("sentry:typeCheckHint"));
            r rVar = this.p;
            if (zIsInstance2 && objB2 != null) {
                ((io.sentry.hints.h) objB2).c(true);
                return rVar;
            }
            if (!zF) {
                io.sentry.util.b.q(io.sentry.hints.h.class, objB2, sentryAndroidOptions2.getLogger());
                sentryAndroidOptions2.getClientReportRecorder().c(io.sentry.clientreport.d.NETWORK_ERROR, cVar);
            }
            return rVar;
        }
        io.sentry.internal.debugmeta.c cVarJ = sentryAndroidOptions2.getClientReportRecorder().j(cVar);
        try {
            ((n5) cVarJ.n).p = new Date((long) (sentryAndroidOptions2.getDateProvider().a().d() / 1000000.0d));
            io.sentry.config.a aVarD = cVar2.r.d(cVarJ);
            if (aVarD.y()) {
                dVar.x0(cVar);
                return aVarD;
            }
            String str = "The transport failed to send the envelope with response code " + aVarD.v();
            sentryAndroidOptions2.getLogger().g(f6.ERROR, str, new Object[0]);
            if (aVarD.v() >= 400) {
                dVar.x0(cVar);
                if (aVarD.v() != 429) {
                    sentryAndroidOptions2.getClientReportRecorder().c(io.sentry.clientreport.d.SEND_ERROR, cVarJ);
                }
            }
            throw new IllegalStateException(str);
        } catch (IOException e) {
            Object objB3 = p0Var.b("sentry:typeCheckHint");
            if (io.sentry.hints.h.class.isInstance(p0Var.b("sentry:typeCheckHint")) && objB3 != null) {
                ((io.sentry.hints.h) objB3).c(true);
            } else if (!zF) {
                io.sentry.util.b.q(io.sentry.hints.h.class, objB3, sentryAndroidOptions2.getLogger());
                sentryAndroidOptions2.getClientReportRecorder().c(io.sentry.clientreport.d.NETWORK_ERROR, cVarJ);
            }
            throw new IllegalStateException("Sending the event failed.", e);
        }
    }

    public final /* synthetic */ void b(io.sentry.config.a aVar, io.sentry.hints.k kVar) {
        this.q.f264o.getLogger().g(f6.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(aVar.y()));
        kVar.b(aVar.y());
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.s = this;
        io.sentry.config.a aVarA = this.p;
        try {
            aVarA = a();
            this.q.f264o.getLogger().g(f6.DEBUG, "Envelope flushed", new Object[0]);
            p0 p0Var = this.n;
            Object objB = p0Var.b("sentry:typeCheckHint");
            if (io.sentry.hints.k.class.isInstance(p0Var.b("sentry:typeCheckHint")) && objB != null) {
                b(aVarA, (io.sentry.hints.k) objB);
            }
            this.q.s = null;
        } catch (Throwable th) {
            try {
                this.q.f264o.getLogger().b(f6.ERROR, th, "Envelope submission failed", new Object[0]);
                throw th;
            } catch (Throwable th2) {
                p0 p0Var2 = this.n;
                Object objB2 = p0Var2.b("sentry:typeCheckHint");
                if (io.sentry.hints.k.class.isInstance(p0Var2.b("sentry:typeCheckHint")) && objB2 != null) {
                    b(aVarA, (io.sentry.hints.k) objB2);
                }
                this.q.s = null;
                throw th2;
            }
        }
    }
}
