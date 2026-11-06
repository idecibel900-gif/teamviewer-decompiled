package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class bb1 extends og7 implements hw2 {
    public boolean m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ cb1 f413o;
    public final /* synthetic */ o98 p;
    public final /* synthetic */ nb0 q;
    public final /* synthetic */ long r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb1(cb1 cb1Var, o98 o98Var, nb0 nb0Var, long j, hc1 hc1Var) {
        super(2, hc1Var);
        this.f413o = cb1Var;
        this.p = o98Var;
        this.q = nb0Var;
        this.r = j;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        bb1 bb1Var = new bb1(this.f413o, this.p, this.q, this.r, hc1Var);
        bb1Var.n = obj;
        return bb1Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((bb1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        cb1 cb1Var = this.f413o;
        eb0 eb0Var = cb1Var.F;
        boolean z = this.m;
        try {
            try {
                if (!z) {
                    ct1.a0(obj);
                    bp3 bp3VarJ = ds1.J(((me1) this.n).getCoroutineContext());
                    cb1Var.I = true;
                    yk6 yk6Var = cb1Var.B;
                    ay4 ay4Var = ay4.m;
                    ab1 ab1Var = new ab1(this.p, cb1Var, this.q, this.r, bp3VarJ, null);
                    this.m = true;
                    Object objG = yk6Var.g(ay4Var, ab1Var, this);
                    ne1 ne1Var = ne1.m;
                    if (objG == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                eb0Var.b();
                cb1Var.I = false;
                eb0Var.a(null);
                cb1Var.G = false;
                return f88.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            cb1Var.I = false;
            eb0Var.a(null);
            cb1Var.G = false;
            throw th;
        }
    }
}
