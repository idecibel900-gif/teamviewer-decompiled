package io.sentry.android.replay.capture;

import io.sentry.h7;
import io.sentry.protocol.w;
import kotlin.jvm.functions.Function0;
import o.f88;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends yz3 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f141o;
    public final /* synthetic */ d p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, d dVar, byte b) {
        super(0);
        this.n = b;
        this.f141o = obj;
        this.q = obj2;
        this.p = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.n;
        f88 f88Var = f88.a;
        d dVar = this.p;
        Object obj = this.q;
        switch (b) {
            case 0:
                w wVar = (w) obj;
                io.sentry.android.replay.k kVar = dVar.h;
                if (kVar != null) {
                    kVar.u("replay.id", String.valueOf(wVar));
                }
                break;
            case 1:
                Integer num = (Integer) obj;
                io.sentry.android.replay.k kVar2 = dVar.h;
                if (kVar2 != null) {
                    kVar2.u("segment.id", String.valueOf(num));
                }
                break;
            case 2:
                h7 h7Var = (h7) obj;
                io.sentry.android.replay.k kVar3 = dVar.h;
                if (kVar3 != null) {
                    kVar3.u("replay.type", String.valueOf(h7Var));
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                io.sentry.android.replay.k kVar4 = dVar.h;
                if (kVar4 != null) {
                    kVar4.u("replay.flushed", String.valueOf(bool));
                }
                break;
        }
        return f88Var;
    }
}
