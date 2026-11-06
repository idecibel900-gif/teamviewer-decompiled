package o;

/* JADX INFO: loaded from: classes.dex */
public final class qg0 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ mw4 f1828o;
    public final /* synthetic */ j57 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qg0(mw4 mw4Var, j57 j57Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1828o = mw4Var;
        this.p = j57Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new qg0(this.f1828o, this.p, hc1Var, (byte) 0);
            default:
                return new qg0(this.f1828o, this.p, hc1Var, (byte) 1);
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
        return ((qg0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.m;
        j57 j57Var = this.p;
        mw4 mw4Var = this.f1828o;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (z) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var = mw4Var.a;
                pg0 pg0Var = new pg0(j57Var, (byte) 0);
                this.n = true;
                yx6.l(yx6Var, pg0Var, this);
                return ne1Var;
            default:
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var2 = mw4Var.a;
                pg0 pg0Var2 = new pg0(j57Var, (byte) 1);
                this.n = true;
                yx6.l(yx6Var2, pg0Var2, this);
                return ne1Var;
        }
    }
}
