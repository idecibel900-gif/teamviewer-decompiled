package io.sentry.android.replay.capture;

import io.sentry.android.replay.c0;
import io.sentry.android.replay.u;
import io.sentry.b5;
import io.sentry.f6;
import io.sentry.g7;
import io.sentry.h2;
import io.sentry.h7;
import io.sentry.n1;
import io.sentry.p7;
import io.sentry.protocol.w;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class q extends d {
    public final g7 v;
    public final n1 w;
    public final io.sentry.transport.f x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g7 g7Var, n1 n1Var, io.sentry.transport.f fVar, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        super(g7Var, n1Var, fVar, scheduledExecutorService, scheduledExecutorService2);
        g7Var.getClass();
        fVar.getClass();
        scheduledExecutorService.getClass();
        scheduledExecutorService2.getClass();
        this.v = g7Var;
        this.w = n1Var;
        this.x = fVar;
    }

    @Override // io.sentry.android.replay.capture.d
    public final void a(Function1 function1, boolean z) {
        g7 g7Var = this.v;
        if (g7Var.getSessionReplay().m) {
            g7Var.getLogger().g(f6.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        this.g.set(z);
    }

    @Override // io.sentry.android.replay.capture.d
    public final void g(c0 c0Var) {
        p("onConfigurationChanged", new p(this, (byte) 0));
        l(c0Var);
    }

    @Override // io.sentry.android.replay.capture.d
    public final void h(final u uVar) {
        final c0 c0VarF = f();
        final long jC = this.x.c();
        this.d.submit(new io.sentry.android.replay.util.g(new Runnable() { // from class: io.sentry.android.replay.capture.o
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                q qVar = this.m;
                io.sentry.android.replay.k kVar = qVar.h;
                g7 g7Var = qVar.v;
                long j = jC;
                if (kVar != null) {
                    uVar.invoke(kVar, Long.valueOf(j));
                }
                Date date = (Date) qVar.j.a(qVar, d.u[1]);
                if (date == null) {
                    g7Var.getLogger().g(f6.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                    return;
                }
                if (qVar.g.get()) {
                    g7Var.getLogger().g(f6.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                    return;
                }
                c0 c0Var = c0VarF;
                if (c0Var == null) {
                    g7Var.getLogger().g(f6.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
                    return;
                }
                if (j - date.getTime() >= g7Var.getSessionReplay().i) {
                    m mVarC = d.c(qVar, g7Var.getSessionReplay().i, date, qVar.d(), qVar.e(), c0Var.b, c0Var.a, c0Var.e, c0Var.f);
                    if (mVarC instanceof k) {
                        k kVar2 = (k) mVarC;
                        k.a(kVar2, qVar.w);
                        qVar.k(qVar.e() + 1);
                        qVar.m(kVar2.a.G);
                    }
                }
                if (j - qVar.k.get() >= g7Var.getSessionReplay().j) {
                    g7Var.getReplayController().stop();
                    g7Var.getLogger().g(f6.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                }
            }
        }, "SessionCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.d
    public final void j() {
        p("pause", new p(this, (byte) 1));
    }

    @Override // io.sentry.android.replay.capture.d
    public final void n(int i, w wVar, h7 h7Var) {
        wVar.getClass();
        super.n(i, wVar, h7Var);
        n1 n1Var = this.w;
        if (n1Var != null) {
            n1Var.r(new p7(this, (byte) 11));
        }
    }

    @Override // io.sentry.android.replay.capture.d
    public final void o() {
        io.sentry.android.replay.k kVar = this.h;
        p("stop", new f(this, kVar != null ? kVar.q() : null, (byte) 1));
        n1 n1Var = this.w;
        if (n1Var != null) {
            n1Var.r(new h2((byte) 22));
        }
        this.d.submit(new io.sentry.android.replay.util.g(new b5((Object) this, (byte) 16), "CaptureStrategy.stop"));
    }

    public final void p(String str, final Function1 function1) {
        final c0 c0VarF = f();
        if (c0VarF == null) {
            this.v.getLogger().g(f6.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        final long jC = this.x.c();
        final w wVarD = d();
        this.d.submit(new io.sentry.android.replay.util.g(new Runnable() { // from class: io.sentry.android.replay.capture.n
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = this.m;
                Date date = (Date) qVar.j.a(qVar, d.u[1]);
                if (date == null) {
                    return;
                }
                long time = jC - date.getTime();
                int iE = qVar.e();
                c0 c0Var = c0VarF;
                function1.invoke(d.c(qVar, time, date, wVarD, iE, c0Var.b, c0Var.a, c0Var.e, c0Var.f));
            }
        }, "SessionCaptureStrategy.".concat(str)));
    }
}
