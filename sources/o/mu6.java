package o;

/* JADX INFO: loaded from: classes.dex */
public final class mu6 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ su6 f1510o;
    public final /* synthetic */ px4 p;
    public final /* synthetic */ px4 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mu6(su6 su6Var, px4 px4Var, px4 px4Var2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1510o = su6Var;
        this.p = px4Var;
        this.q = px4Var2;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                mu6 mu6Var = new mu6(this.f1510o, this.p, this.q, hc1Var, (byte) 0);
                mu6Var.n = obj;
                return mu6Var;
            default:
                mu6 mu6Var2 = new mu6(this.f1510o, this.p, this.q, hc1Var, (byte) 1);
                mu6Var2.n = obj;
                return mu6Var2;
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
                ((mu6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((mu6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                me1 me1Var = (me1) this.n;
                ct1.a0(obj);
                im3.R(me1Var, null, null, new lu6(this.f1510o, this.p, this.q, null, (byte) 0), 3);
                break;
            default:
                me1 me1Var2 = (me1) this.n;
                ct1.a0(obj);
                im3.R(me1Var2, null, null, new lu6(this.f1510o, this.p, this.q, null, (byte) 1), 3);
                break;
        }
        return f88Var;
    }
}
