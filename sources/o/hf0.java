package o;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hf0 extends cx2 implements iw2 {
    public static final hf0 n = new hf0(3, kf0.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        kf0 kf0Var = (kf0) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = kf0.n;
        kf0Var.getClass();
        if (obj3 == mf0.l) {
            obj3 = new hn0(kf0Var.q());
        }
        return new jn0(obj3);
    }
}
