package io.sentry.android.replay;

import io.sentry.f6;
import io.sentry.g7;
import io.sentry.z2;
import java.util.Date;
import o.fw3;
import o.im3;
import o.k76;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {
    public final /* synthetic */ ReplayIntegration m;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ io.sentry.protocol.w f160o;
    public final /* synthetic */ k76 p;
    public final /* synthetic */ Date q;

    public o(ReplayIntegration replayIntegration, long j, io.sentry.protocol.w wVar, k76 k76Var, Date date) {
        this.m = replayIntegration;
        this.n = j;
        this.f160o = wVar;
        this.p = k76Var;
        this.q = date;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = (n) this.m.A.get();
        nVar.getClass();
        io.sentry.protocol.w wVar = this.f160o;
        wVar.getClass();
        if (nVar.b() && nVar.a == this.n && im3.n(nVar.c, wVar)) {
            io.sentry.android.replay.capture.d dVar = nVar.d;
            k76 k76Var = this.p;
            Object obj = k76Var.m;
            if (dVar == obj) {
                io.sentry.android.replay.capture.d dVar2 = (io.sentry.android.replay.capture.d) obj;
                dVar2.k(dVar2.e() + 1);
                ((io.sentry.android.replay.capture.d) k76Var.m).m(this.q);
                io.sentry.android.replay.capture.b bVar = ((io.sentry.android.replay.capture.d) k76Var.m).p;
                fw3 fw3Var = io.sentry.android.replay.capture.d.u[6];
                Boolean bool = Boolean.TRUE;
                bVar.getClass();
                fw3Var.getClass();
                Object andSet = bVar.n.getAndSet(bool);
                if (im3.n(andSet, bool)) {
                    return;
                }
                io.sentry.android.replay.capture.a aVar = new io.sentry.android.replay.capture.a(andSet, bool, bVar.p, (byte) 3);
                io.sentry.android.replay.capture.d dVar3 = bVar.f142o;
                g7 g7Var = dVar3.a;
                if (g7Var.getThreadChecker().c()) {
                    dVar3.e.submit(new io.sentry.android.replay.util.g(new z2(aVar, (byte) 4), "CaptureStrategy.runInBackground"));
                    return;
                }
                try {
                    aVar.a();
                } catch (Throwable th) {
                    g7Var.getLogger().d(f6.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }
        }
    }
}
