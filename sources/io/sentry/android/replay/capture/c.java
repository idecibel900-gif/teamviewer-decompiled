package io.sentry.android.replay.capture;

import io.sentry.android.replay.c0;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import o.f88;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends yz3 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f143o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ d q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, d dVar, byte b) {
        super(0);
        this.n = b;
        this.f143o = obj;
        this.p = obj2;
        this.q = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.n;
        Object obj = this.f143o;
        f88 f88Var = f88.a;
        d dVar = this.q;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                c0 c0Var = (c0) obj2;
                if (c0Var != null) {
                    io.sentry.android.replay.k kVar = dVar.h;
                    if (kVar != null) {
                        kVar.u("config.height", String.valueOf(c0Var.b));
                    }
                    io.sentry.android.replay.k kVar2 = dVar.h;
                    if (kVar2 != null) {
                        kVar2.u("config.width", String.valueOf(c0Var.a));
                    }
                    io.sentry.android.replay.k kVar3 = dVar.h;
                    if (kVar3 != null) {
                        kVar3.u("config.frame-rate", String.valueOf(c0Var.e));
                    }
                    io.sentry.android.replay.k kVar4 = dVar.h;
                    if (kVar4 != null) {
                        kVar4.u("config.bit-rate", String.valueOf(c0Var.f));
                    }
                }
                break;
            case 1:
                Date date = (Date) obj2;
                io.sentry.android.replay.k kVar5 = dVar.h;
                if (kVar5 != null) {
                    kVar5.u("segment.timestamp", date == null ? null : io.sentry.vendor.a.f(date.getTime()));
                }
                break;
            default:
                io.sentry.android.replay.k kVar6 = dVar.h;
                if (kVar6 != null) {
                    kVar6.u("replay.screen-at-start", String.valueOf(obj2));
                }
                break;
        }
        return f88Var;
    }
}
