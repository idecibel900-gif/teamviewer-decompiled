package io.sentry.android.replay;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.f6;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.im3;
import o.kh7;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Runnable {
    public final /* synthetic */ ReplayIntegration m;
    public final /* synthetic */ boolean n;

    public t(ReplayIntegration replayIntegration, boolean z) {
        this.m = replayIntegration;
        this.n = z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:52:0x0115  */
    /* JADX WARN: Code duplicated, block: B:54:0x0133  */
    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        n nVar;
        w wVar;
        w wVar2;
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.android.replay.capture.d hVar;
        k0 k0Var;
        io.sentry.protocol.w wVarD;
        SentryAndroidOptions sentryAndroidOptions2;
        SentryAndroidOptions sentryAndroidOptions3;
        ReplayIntegration replayIntegration = this.m;
        kh7 kh7Var = replayIntegration.u;
        kh7 kh7Var2 = replayIntegration.w;
        kh7 kh7Var3 = replayIntegration.v;
        AtomicBoolean atomicBoolean = replayIntegration.x;
        if (atomicBoolean.get()) {
            if (this.n) {
                replayIntegration.O0(true);
                SentryAndroidOptions sentryAndroidOptions4 = replayIntegration.p;
                if (sentryAndroidOptions4 == null) {
                    im3.e0("options");
                    throw null;
                }
                boolean zM0 = replayIntegration.M0(sentryAndroidOptions4.getSessionReplay().d);
                if (zM0) {
                    atomicReference = replayIntegration.A;
                    if (atomicBoolean.get()) {
                        nVar = (n) atomicReference.get();
                        wVar = nVar.b;
                        wVar2 = w.STARTED;
                        if (io.sentry.config.a.x(wVar, wVar2)) {
                            if (zM0) {
                                sentryAndroidOptions2 = replayIntegration.p;
                                if (sentryAndroidOptions2 != null) {
                                    im3.e0("options");
                                    throw null;
                                }
                                hVar = new io.sentry.android.replay.capture.q(sentryAndroidOptions2, replayIntegration.q, replayIntegration.n, (io.sentry.android.replay.util.f) kh7Var3.getValue(), (io.sentry.android.replay.util.f) kh7Var2.getValue());
                            } else {
                                sentryAndroidOptions = replayIntegration.p;
                                if (sentryAndroidOptions != null) {
                                    im3.e0("options");
                                    throw null;
                                }
                                hVar = new io.sentry.android.replay.capture.h(sentryAndroidOptions, replayIntegration.q, replayIntegration.n, (io.sentry.android.replay.util.f) kh7Var3.getValue(), (io.sentry.android.replay.util.f) kh7Var2.getValue());
                            }
                            k0Var = replayIntegration.r;
                            if (k0Var != null) {
                                k0Var.r.getAndSet(true);
                            }
                            hVar.n(0, new io.sentry.protocol.w(), null);
                            wVarD = hVar.d();
                            long j = nVar.a + 1;
                            if (wVarD == null) {
                                wVarD = io.sentry.protocol.w.n;
                            }
                            io.sentry.protocol.w wVar3 = wVarD;
                            wVar3.getClass();
                            atomicReference.set(new n(j, wVar2, wVar3, hVar));
                            if (replayIntegration.r != null) {
                                io.sentry.android.core.i0 i0Var = ((y) kh7Var.getValue()).f173o;
                                k0 k0Var2 = replayIntegration.r;
                                k0Var2.getClass();
                                i0Var.add(k0Var2);
                            }
                            ((y) kh7Var.getValue()).f173o.add(replayIntegration.s);
                        } else {
                            sentryAndroidOptions3 = replayIntegration.p;
                            if (sentryAndroidOptions3 != null) {
                                im3.e0("options");
                                throw null;
                            }
                            sentryAndroidOptions3.getLogger().g(f6.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                        }
                    }
                } else {
                    SentryAndroidOptions sentryAndroidOptions5 = replayIntegration.p;
                    if (sentryAndroidOptions5 == null) {
                        im3.e0("options");
                        throw null;
                    }
                    Double d = sentryAndroidOptions5.getSessionReplay().e;
                    if (d == null || d.doubleValue() <= 0.0d) {
                        SentryAndroidOptions sentryAndroidOptions6 = replayIntegration.p;
                        if (sentryAndroidOptions6 == null) {
                            im3.e0("options");
                            throw null;
                        }
                        sentryAndroidOptions6.getLogger().g(f6.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    } else {
                        atomicReference = replayIntegration.A;
                        if (atomicBoolean.get()) {
                            nVar = (n) atomicReference.get();
                            wVar = nVar.b;
                            wVar2 = w.STARTED;
                            if (io.sentry.config.a.x(wVar, wVar2)) {
                                sentryAndroidOptions3 = replayIntegration.p;
                                if (sentryAndroidOptions3 != null) {
                                    im3.e0("options");
                                    throw null;
                                }
                                sentryAndroidOptions3.getLogger().g(f6.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                            } else {
                                if (zM0) {
                                    sentryAndroidOptions2 = replayIntegration.p;
                                    if (sentryAndroidOptions2 != null) {
                                        im3.e0("options");
                                        throw null;
                                    }
                                    hVar = new io.sentry.android.replay.capture.q(sentryAndroidOptions2, replayIntegration.q, replayIntegration.n, (io.sentry.android.replay.util.f) kh7Var3.getValue(), (io.sentry.android.replay.util.f) kh7Var2.getValue());
                                } else {
                                    sentryAndroidOptions = replayIntegration.p;
                                    if (sentryAndroidOptions != null) {
                                        im3.e0("options");
                                        throw null;
                                    }
                                    hVar = new io.sentry.android.replay.capture.h(sentryAndroidOptions, replayIntegration.q, replayIntegration.n, (io.sentry.android.replay.util.f) kh7Var3.getValue(), (io.sentry.android.replay.util.f) kh7Var2.getValue());
                                }
                                k0Var = replayIntegration.r;
                                if (k0Var != null) {
                                    k0Var.r.getAndSet(true);
                                }
                                hVar.n(0, new io.sentry.protocol.w(), null);
                                wVarD = hVar.d();
                                long j2 = nVar.a + 1;
                                if (wVarD == null) {
                                    wVarD = io.sentry.protocol.w.n;
                                }
                                io.sentry.protocol.w wVar4 = wVarD;
                                wVar4.getClass();
                                atomicReference.set(new n(j2, wVar2, wVar4, hVar));
                                if (replayIntegration.r != null) {
                                    io.sentry.android.core.i0 i0Var2 = ((y) kh7Var.getValue()).f173o;
                                    k0 k0Var3 = replayIntegration.r;
                                    k0Var3.getClass();
                                    i0Var2.add(k0Var3);
                                }
                                ((y) kh7Var.getValue()).f173o.add(replayIntegration.s);
                            }
                        }
                    }
                }
            }
            replayIntegration.L0();
        }
    }
}
