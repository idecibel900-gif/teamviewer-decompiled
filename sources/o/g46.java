package o;

/* JADX INFO: loaded from: classes.dex */
public final class g46 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i46 f856o;
    public final /* synthetic */ ke3 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g46(i46 i46Var, ke3 ke3Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f856o = i46Var;
        this.p = ke3Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        ke3 ke3Var = this.p;
        i46 i46Var = this.f856o;
        switch (b) {
            case 0:
                return new g46(i46Var, ke3Var, hc1Var, (byte) 0);
            default:
                return new g46(i46Var, ke3Var, hc1Var, (byte) 1);
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
        return ((g46) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        ke3 ke3Var = this.p;
        i46 i46Var = this.f856o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (z) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                this.n = true;
                int i = i46.f;
                Object objB = i46Var.b(ke3Var, 0, this);
                return objB == ne1Var ? ne1Var : objB;
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
                int i2 = i46.f;
                Object objB2 = i46Var.b(ke3Var, 1, this);
                return objB2 == ne1Var ? ne1Var : objB2;
        }
    }
}
