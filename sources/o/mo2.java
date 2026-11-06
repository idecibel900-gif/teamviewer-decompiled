package o;

/* JADX INFO: loaded from: classes.dex */
public final class mo2 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ go2 f1491o;
    public final /* synthetic */ ft5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo2(go2 go2Var, ft5 ft5Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1491o = go2Var;
        this.p = ft5Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new mo2(this.f1491o, this.p, hc1Var, (byte) 0);
            default:
                return new mo2(this.f1491o, this.p, hc1Var, (byte) 1);
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
        return ((mo2) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        ft5 ft5Var = this.p;
        go2 go2Var = this.f1491o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    lo2 lo2Var = new lo2(ft5Var, (byte) 1);
                    this.n = true;
                    return go2Var.b(lo2Var, this) == ne1Var ? ne1Var : f88Var;
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
                    lo2 lo2Var2 = new lo2(ft5Var, (byte) 3);
                    this.n = true;
                    return go2Var.b(lo2Var2, this) == ne1Var ? ne1Var : f88Var;
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
