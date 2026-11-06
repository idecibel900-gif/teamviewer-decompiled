package io.sentry.android.replay;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.s0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;
import o.im3;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class r extends yz3 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ReplayIntegration f163o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(ReplayIntegration replayIntegration, byte b) {
        super(0);
        this.n = b;
        this.f163o = replayIntegration;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.n;
        ReplayIntegration replayIntegration = this.f163o;
        switch (b) {
            case 0:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new s0((byte) 3));
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
                SentryAndroidOptions sentryAndroidOptions = replayIntegration.p;
                if (sentryAndroidOptions != null) {
                    return new io.sentry.android.replay.util.f(scheduledExecutorServiceNewSingleThreadScheduledExecutor, sentryAndroidOptions);
                }
                im3.e0("options");
                throw null;
            default:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor2 = Executors.newSingleThreadScheduledExecutor(new s0((byte) 2));
                scheduledExecutorServiceNewSingleThreadScheduledExecutor2.getClass();
                SentryAndroidOptions sentryAndroidOptions2 = replayIntegration.p;
                if (sentryAndroidOptions2 != null) {
                    return new io.sentry.android.replay.util.f(scheduledExecutorServiceNewSingleThreadScheduledExecutor2, sentryAndroidOptions2);
                }
                im3.e0("options");
                throw null;
        }
    }
}
