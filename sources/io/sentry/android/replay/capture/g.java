package io.sentry.android.replay.capture;

import kotlin.jvm.functions.Function1;
import o.f88;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class g extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f147o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, byte b) {
        super(1);
        this.n = b;
        this.f147o = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        f88 f88Var = f88.a;
        h hVar = this.f147o;
        switch (b) {
            case 0:
                m mVar = (m) obj;
                mVar.getClass();
                if (mVar instanceof k) {
                    hVar.y.add(mVar);
                    hVar.k(hVar.e() + 1);
                }
                break;
            default:
                m mVar2 = (m) obj;
                mVar2.getClass();
                if (mVar2 instanceof k) {
                    hVar.y.add(mVar2);
                    hVar.k(hVar.e() + 1);
                }
                break;
        }
        return f88Var;
    }
}
