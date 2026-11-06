package io.sentry.android.replay.capture;

import kotlin.jvm.functions.Function1;
import o.f88;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class p extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f150o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, byte b) {
        super(1);
        this.n = b;
        this.f150o = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        f88 f88Var = f88.a;
        q qVar = this.f150o;
        switch (b) {
            case 0:
                m mVar = (m) obj;
                mVar.getClass();
                if (mVar instanceof k) {
                    k kVar = (k) mVar;
                    k.a(kVar, qVar.w);
                    qVar.k(qVar.e() + 1);
                    qVar.m(kVar.a.G);
                }
                break;
            default:
                m mVar2 = (m) obj;
                mVar2.getClass();
                if (mVar2 instanceof k) {
                    k.a((k) mVar2, qVar.w);
                    qVar.k(qVar.e() + 1);
                }
                break;
        }
        return f88Var;
    }
}
