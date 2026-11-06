package o;

/* JADX INFO: loaded from: classes.dex */
public final class lu6 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ su6 f1406o;
    public final /* synthetic */ px4 p;
    public final /* synthetic */ px4 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu6(su6 su6Var, px4 px4Var, px4 px4Var2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1406o = su6Var;
        this.p = px4Var;
        this.q = px4Var2;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new lu6(this.f1406o, this.p, this.q, hc1Var, (byte) 0);
            default:
                return new lu6(this.f1406o, this.p, this.q, hc1Var, (byte) 1);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((lu6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((lu6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return ne1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        px4 px4Var = this.q;
        px4 px4Var2 = this.p;
        su6 su6Var = this.f1406o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                r36 r36Var = su6Var.A;
                wa waVar = new wa(px4Var2, px4Var, (byte) 4);
                this.n = true;
                if (r36Var.m.b(waVar, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
            default:
                boolean z2 = this.n;
                if (z2) {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                r36 r36Var2 = su6Var.y;
                wa waVar2 = new wa(px4Var2, px4Var, (byte) 5);
                this.n = true;
                if (r36Var2.m.b(waVar2, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
        }
    }
}
