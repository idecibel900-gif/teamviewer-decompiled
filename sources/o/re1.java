package o;

import androidx.work.CoroutineWorker;

/* JADX INFO: loaded from: classes.dex */
public final class re1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f1916o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re1(CoroutineWorker coroutineWorker, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1916o = coroutineWorker;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        CoroutineWorker coroutineWorker = this.f1916o;
        switch (b) {
            case 0:
                return new re1(coroutineWorker, hc1Var, (byte) 0);
            default:
                return new re1(coroutineWorker, hc1Var, (byte) 1);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((re1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            default:
                return ((re1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        switch (this.m) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    this.n = true;
                    hk0.l("Not implemented");
                } else {
                    if (z) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                this.n = true;
                Object objC = this.f1916o.c(this);
                ne1 ne1Var = ne1.m;
                return objC == ne1Var ? ne1Var : objC;
        }
    }
}
