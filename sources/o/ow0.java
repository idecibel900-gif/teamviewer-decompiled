package o;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ow0 extends og7 implements hw2 {
    public boolean m;
    public final /* synthetic */ go2[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1684o;
    public final /* synthetic */ AtomicInteger p;
    public final /* synthetic */ kf0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow0(go2[] go2VarArr, int i, AtomicInteger atomicInteger, kf0 kf0Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.n = go2VarArr;
        this.f1684o = i;
        this.p = atomicInteger;
        this.q = kf0Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new ow0(this.n, this.f1684o, this.p, this.q, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((ow0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.m;
        AtomicInteger atomicInteger = this.p;
        kf0 kf0Var = this.q;
        try {
            if (!z) {
                ct1.a0(obj);
                go2[] go2VarArr = this.n;
                int i = this.f1684o;
                go2 go2Var = go2VarArr[i];
                nw0 nw0Var = new nw0(kf0Var, i);
                this.m = true;
                Object objB = go2Var.b(nw0Var, this);
                ne1 ne1Var = ne1.m;
                if (objB == ne1Var) {
                    return ne1Var;
                }
            } else {
                if (!z) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                kf0Var.d(null);
            }
            return f88.a;
        } catch (Throwable th) {
            if (atomicInteger.decrementAndGet() == 0) {
                kf0Var.d(null);
            }
            throw th;
        }
    }
}
