package io.sentry.android.replay;

import io.sentry.n1;
import io.sentry.y0;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ReplayIntegration n;

    public /* synthetic */ s(ReplayIntegration replayIntegration, byte b) {
        this.m = b;
        this.n = replayIntegration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n1 n1Var;
        n1 n1Var2;
        io.sentry.transport.p pVarC;
        io.sentry.transport.p pVarC2;
        byte b = this.m;
        ReplayIntegration replayIntegration = this.n;
        switch (b) {
            case 0:
                int i = ReplayIntegration.B;
                replayIntegration.K0();
                break;
            case 1:
                int i2 = ReplayIntegration.B;
                replayIntegration.O0(false);
                break;
            case 2:
                int i3 = ReplayIntegration.B;
                if (((n) replayIntegration.A.get()).d instanceof io.sentry.android.replay.capture.q) {
                    if (replayIntegration.f136o == y0.DISCONNECTED || (((n1Var = replayIntegration.q) != null && (pVarC2 = n1Var.c()) != null && pVarC2.j(io.sentry.q.All)) || ((n1Var2 = replayIntegration.q) != null && (pVarC = n1Var2.c()) != null && pVarC.j(io.sentry.q.Replay)))) {
                        replayIntegration.K0();
                    }
                }
                break;
            default:
                int i4 = ReplayIntegration.B;
                replayIntegration.O0(true);
                break;
        }
    }
}
