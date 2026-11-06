package io.sentry.android.replay;

import android.os.Handler;
import io.sentry.m7;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import o.f88;
import o.k76;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class p extends yz3 implements Function1 {
    public final /* synthetic */ ReplayIntegration n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f161o;
    public final /* synthetic */ io.sentry.protocol.w p;
    public final /* synthetic */ k76 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ReplayIntegration replayIntegration, long j, io.sentry.protocol.w wVar, k76 k76Var) {
        super(1);
        this.n = replayIntegration;
        this.f161o = j;
        this.p = wVar;
        this.q = k76Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Date date = (Date) obj;
        date.getClass();
        ReplayIntegration replayIntegration = this.n;
        m7 m7Var = replayIntegration.z;
        o oVar = new o(replayIntegration, this.f161o, this.p, this.q, date);
        m7Var.getClass();
        ((Handler) m7Var.n).post(oVar);
        return f88.a;
    }
}
