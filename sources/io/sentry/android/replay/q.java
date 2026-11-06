package io.sentry.android.replay;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.f6;
import io.sentry.n1;
import io.sentry.p7;
import io.sentry.y0;
import java.util.concurrent.atomic.AtomicReference;
import o.im3;
import o.k76;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ReplayIntegration n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f162o;

    public /* synthetic */ q(ReplayIntegration replayIntegration, Object obj, byte b) {
        this.m = b;
        this.n = replayIntegration;
        this.f162o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        ReplayIntegration replayIntegration = this.n;
        Object obj = this.f162o;
        switch (b) {
            case 0:
                n nVar = (n) obj;
                long j = nVar.a;
                io.sentry.protocol.w wVar = nVar.c;
                int i = ReplayIntegration.B;
                ReplayIntegration replayIntegration2 = this.n;
                AtomicReference atomicReference = replayIntegration2.A;
                n nVar2 = (n) atomicReference.get();
                io.sentry.android.replay.capture.d dVar = nVar2.d;
                wVar.getClass();
                if (!nVar2.b() || nVar2.a != j || !im3.n(nVar2.c, wVar) || dVar == null) {
                    n1 n1Var = replayIntegration2.q;
                    if (n1Var != null) {
                        n1Var.r(new p7(wVar, (byte) 10));
                    }
                    SentryAndroidOptions sentryAndroidOptions = replayIntegration2.p;
                    if (sentryAndroidOptions != null) {
                        sentryAndroidOptions.getLogger().g(f6.INFO, "Replay was stopped or restarted before capture could run, not capturing replay", new Object[0]);
                        return;
                    } else {
                        im3.e0("options");
                        throw null;
                    }
                }
                k76 k76Var = new k76();
                k76Var.m = dVar;
                dVar.a(new p(replayIntegration2, j, wVar, k76Var), false);
                io.sentry.android.replay.capture.d dVarB = dVar.b();
                k76Var.m = dVarB;
                io.sentry.protocol.w wVarD = dVarB.d();
                if (wVarD == null) {
                    wVarD = io.sentry.protocol.w.n;
                }
                wVarD.getClass();
                atomicReference.set(n.a(nVar2, null, wVarD, (io.sentry.android.replay.capture.d) k76Var.m, 3));
                return;
            case 1:
                y0 y0Var = (y0) obj;
                replayIntegration.f136o = y0Var;
                if (((n) replayIntegration.A.get()).d instanceof io.sentry.android.replay.capture.q) {
                    if (y0Var == y0.DISCONNECTED) {
                        replayIntegration.K0();
                        return;
                    } else {
                        replayIntegration.L0();
                        return;
                    }
                }
                return;
            default:
                io.sentry.transport.p pVar = (io.sentry.transport.p) obj;
                if (((n) replayIntegration.A.get()).d instanceof io.sentry.android.replay.capture.q) {
                    if (pVar.j(io.sentry.q.All) || pVar.j(io.sentry.q.Replay)) {
                        replayIntegration.K0();
                        return;
                    } else {
                        replayIntegration.L0();
                        return;
                    }
                }
                return;
        }
    }
}
