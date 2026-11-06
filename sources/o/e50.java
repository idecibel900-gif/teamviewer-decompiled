package o;

/* JADX INFO: loaded from: classes.dex */
public final class e50 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f680o;
    public final /* synthetic */ nn5 p;
    public final /* synthetic */ k08 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e50(nn5 nn5Var, k08 k08Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = nn5Var;
        this.q = k08Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                e50 e50Var = new e50(this.p, this.q, hc1Var, (byte) 0);
                e50Var.f680o = obj;
                return e50Var;
            default:
                e50 e50Var2 = new e50(this.p, this.q, hc1Var, (byte) 1);
                e50Var2.f680o = obj;
                return e50Var2;
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
                break;
        }
        return ((e50) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        k08 k08Var = this.q;
        nn5 nn5Var = this.p;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    d50 d50Var = new d50((me1) this.f680o, k08Var, null);
                    this.n = true;
                    return it1.n(nn5Var, d50Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    g50 g50Var = new g50((me1) this.f680o, k08Var, null);
                    this.n = true;
                    return ((vg7) nn5Var).U0(g50Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z2) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
