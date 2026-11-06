package o;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ mw4 f1315o;
    public final /* synthetic */ yr5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(yr5 yr5Var, mw4 mw4Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 0;
        this.p = yr5Var;
        this.f1315o = mw4Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        yr5 yr5Var = this.p;
        mw4 mw4Var = this.f1315o;
        switch (b) {
            case 0:
                return new l0(yr5Var, mw4Var, hc1Var);
            case 1:
                return new l0(mw4Var, yr5Var, hc1Var, (byte) 1);
            default:
                return new l0(mw4Var, yr5Var, hc1Var, (byte) 2);
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
            case 1:
                break;
        }
        return ((l0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        yr5 yr5Var = this.p;
        mw4 mw4Var = this.f1315o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    zr5 zr5Var = new zr5(yr5Var);
                    this.n = true;
                    return mw4Var.a(zr5Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    this.n = true;
                    return mw4Var.a(yr5Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z2) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    this.n = true;
                    return mw4Var.a(yr5Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z3) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(mw4 mw4Var, yr5 yr5Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1315o = mw4Var;
        this.p = yr5Var;
    }
}
