package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.f0;
import io.sentry.android.replay.c0;
import io.sentry.android.replay.u;
import io.sentry.f6;
import io.sentry.g7;
import io.sentry.h7;
import io.sentry.n1;
import io.sentry.protocol.w;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.functions.Function1;
import o.iq8;
import o.lv0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d {
    public final g7 v;
    public final n1 w;
    public final io.sentry.transport.f x;
    public final ArrayList y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SentryAndroidOptions sentryAndroidOptions, n1 n1Var, io.sentry.transport.d dVar, io.sentry.android.replay.util.f fVar, io.sentry.android.replay.util.f fVar2) {
        super(sentryAndroidOptions, n1Var, dVar, fVar, fVar2);
        sentryAndroidOptions.getClass();
        dVar.getClass();
        fVar.getClass();
        fVar2.getClass();
        this.v = sentryAndroidOptions;
        this.w = n1Var;
        this.x = dVar;
        this.y = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.d
    public final void a(Function1 function1, boolean z) {
        io.sentry.transport.p pVarC;
        byte b = 0;
        g7 g7Var = this.v;
        if (z) {
            this.g.set(true);
            g7Var.getLogger().g(f6.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
            return;
        }
        n1 n1Var = this.w;
        if (n1Var == null || (pVarC = n1Var.c()) == null || !(pVarC.j(io.sentry.q.All) || pVarC.j(io.sentry.q.Replay))) {
            p("capture_replay", new f(this, function1, b));
        } else {
            g7Var.getLogger().g(f6.INFO, "Replay is rate-limited, not capturing for event", new Object[0]);
            g7Var.getClientReportRecorder().a(io.sentry.clientreport.d.RATELIMIT_BACKOFF, io.sentry.q.Replay);
        }
    }

    @Override // io.sentry.android.replay.capture.d
    public final d b() {
        io.sentry.transport.p pVarC;
        if (this.g.get()) {
            this.v.getLogger().g(f6.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        n1 n1Var = this.w;
        boolean z = (n1Var == null || (pVarC = n1Var.c()) == null || (!pVarC.j(io.sentry.q.All) && !pVarC.j(io.sentry.q.Replay))) ? false : true;
        g7 g7Var = this.v;
        if (z) {
            g7Var.getLogger().g(f6.DEBUG, "Not converting to session mode, because replay is rate-limited", new Object[0]);
            return this;
        }
        q qVar = new q(g7Var, this.w, this.x, this.d, this.e);
        qVar.l(f());
        qVar.n(e(), d(), h7.BUFFER);
        return qVar;
    }

    @Override // io.sentry.android.replay.capture.d
    public final void g(c0 c0Var) {
        p("configuration_changed", new g(this, (byte) 0));
        l(c0Var);
    }

    @Override // io.sentry.android.replay.capture.d
    public final void h(u uVar) {
        this.d.submit(new io.sentry.android.replay.util.g(new f0(this, uVar, this.x.c()), "BufferCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.d
    public final void i(MotionEvent motionEvent) {
        super.i(motionEvent);
        long jC = this.x.c() - ((long) this.v.getSessionReplay().h);
        ConcurrentLinkedDeque concurrentLinkedDeque = this.q;
        concurrentLinkedDeque.getClass();
        Iterator it = concurrentLinkedDeque.iterator();
        it.getClass();
        while (it.hasNext()) {
            if (((io.sentry.rrweb.b) it.next()).n < jC) {
                it.remove();
            }
        }
    }

    @Override // io.sentry.android.replay.capture.d
    public final void j() {
        p("pause", new g(this, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    public final void p(String str, final Function1 function1) {
        final Date date;
        final c0 c0VarF = f();
        g7 g7Var = this.v;
        if (c0VarF == null) {
            g7Var.getLogger().g(f6.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long j = g7Var.getSessionReplay().h;
        long jC = this.x.c();
        io.sentry.android.replay.k kVar = this.h;
        if (kVar != null) {
            io.sentry.util.a aVar = kVar.q;
            aVar.e();
            try {
                io.sentry.android.replay.l lVar = (io.sentry.android.replay.l) lv0.o0(kVar.t);
                Long lValueOf = lVar != null ? Long.valueOf(lVar.b) : null;
                iq8.l(aVar, null);
                if (lValueOf != null) {
                    date = new Date(lValueOf.longValue());
                } else {
                    date = new Date(jC - j);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    iq8.l(aVar, th);
                    throw th2;
                }
            }
        } else {
            date = new Date(jC - j);
        }
        final long time = jC - date.getTime();
        final w wVarD = d();
        this.d.submit(new io.sentry.android.replay.util.g(new Runnable() { // from class: io.sentry.android.replay.capture.e
            @Override // java.lang.Runnable
            public final void run() {
                h hVar = this.m;
                int iE = hVar.e();
                c0 c0Var = c0VarF;
                function1.invoke(d.c(hVar, time, date, wVarD, iE, c0Var.b, c0Var.a, c0Var.e, c0Var.f));
            }
        }, "BufferCaptureStrategy.".concat(str)));
    }
}
