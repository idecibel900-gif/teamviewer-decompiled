package o;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gf0 extends cx2 implements iw2 {
    public static final gf0 n = new gf0(3, kf0.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        kn0 kn0Var;
        kf0 kf0Var = (kf0) obj;
        ao6 ao6Var = (ao6) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = kf0.n;
        kf0Var.getClass();
        kn0 kn0Var2 = (kn0) defpackage.a.a.getObjectVolatile(kf0Var, kf0.y);
        while (!kf0Var.y()) {
            long andIncrement = kf0.f1258o.getAndIncrement(kf0Var);
            long j = mf0.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (kn0Var2.p != j2) {
                kn0 kn0VarI = kf0Var.i(j2, kn0Var2);
                if (kn0VarI == null) {
                    continue;
                } else {
                    kn0Var = kn0VarI;
                }
            } else {
                kn0Var = kn0Var2;
            }
            Object objK = kf0Var.K(kn0Var, i, andIncrement, ao6Var);
            kn0 kn0Var3 = kn0Var;
            if (objK == mf0.m) {
                if (ao6Var == null) {
                    ao6Var = null;
                }
                if (ao6Var != null) {
                    ao6Var.f344o = kn0Var3;
                    ao6Var.p = i;
                }
            } else if (objK == mf0.f1464o) {
                if (andIncrement < kf0Var.u()) {
                    kn0Var3.a();
                }
                kn0Var2 = kn0Var3;
            } else {
                if (objK == mf0.n) {
                    hk0.l("unexpected");
                    return null;
                }
                kn0Var3.a();
                ao6Var.q = objK;
            }
            return f88.a;
        }
        ao6Var.q = mf0.l;
        return f88.a;
    }
}
