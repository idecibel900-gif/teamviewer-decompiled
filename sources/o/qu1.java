package o;

/* JADX INFO: loaded from: classes.dex */
public final class qu1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f1866o;
    public final /* synthetic */ long p;
    public final /* synthetic */ oe8 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qu1(long j, oe8 oe8Var, long j2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1866o = j;
        this.q = oe8Var;
        this.p = j2;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        oe8 oe8Var = this.q;
        switch (b) {
            case 0:
                return new qu1(this.f1866o, (ru1) oe8Var, this.p, hc1Var, (byte) 0);
            default:
                return new qu1(this.f1866o, (f33) oe8Var, this.p, hc1Var, (byte) 1);
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
        return ((qu1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        g72 g72Var = g72.MILLISECONDS;
        long j = this.f1866o;
        ne1 ne1Var = ne1.m;
        long j2 = this.p;
        oe8 oe8Var = this.q;
        switch (b) {
            case 0:
                ru1 ru1Var = (ru1) oe8Var;
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    aw awVar = c72.n;
                    long jL = lq1.L(j, g72Var);
                    this.n = true;
                    if (im3.B(jL, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                Long l = (Long) ru1Var.J.getValue();
                if (l == null || l.longValue() != j2) {
                    return f88Var;
                }
                ye4.a("DeviceInfoScreenViewModel", "wake timeout for " + j2);
                ru1Var.W0(j2);
                return f88Var;
            default:
                f33 f33Var = (f33) oe8Var;
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    aw awVar2 = c72.n;
                    long jL2 = lq1.L(j, g72Var);
                    this.n = true;
                    if (im3.B(jL2, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                Long l2 = (Long) f33Var.x.getValue();
                if (l2 == null || l2.longValue() != j2) {
                    return f88Var;
                }
                ye4.a("GroupDevicesScreenViewModel", "wake timeout for " + j2);
                f33Var.X0(j2);
                return f88Var;
        }
    }
}
