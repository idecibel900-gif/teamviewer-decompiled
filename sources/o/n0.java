package o;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p0 f1528o;
    public final /* synthetic */ yr5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(p0 p0Var, yr5 yr5Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1528o = p0Var;
        this.p = yr5Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        yr5 yr5Var = this.p;
        p0 p0Var = this.f1528o;
        switch (b) {
            case 0:
                return new n0(p0Var, yr5Var, hc1Var, (byte) 0);
            case 1:
                return new n0(p0Var, yr5Var, hc1Var, (byte) 1);
            case 2:
                return new n0(p0Var, yr5Var, hc1Var, (byte) 2);
            default:
                return new n0(p0Var, yr5Var, hc1Var, (byte) 3);
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
            case 2:
                break;
        }
        return ((n0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        yr5 yr5Var = this.p;
        p0 p0Var = this.f1528o;
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
                mw4 mw4Var = p0Var.C;
                if (mw4Var == null) {
                    return f88Var;
                }
                xr5 xr5Var = new xr5(yr5Var);
                this.n = true;
                return mw4Var.a(xr5Var, this) == ne1Var ? ne1Var : f88Var;
            case 1:
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
                mw4 mw4Var2 = p0Var.C;
                if (mw4Var2 == null) {
                    return f88Var;
                }
                xr5 xr5Var2 = new xr5(yr5Var);
                this.n = true;
                return mw4Var2.a(xr5Var2, this) == ne1Var ? ne1Var : f88Var;
            case 2:
                boolean z3 = this.n;
                if (z3) {
                    if (z3) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                mw4 mw4Var3 = p0Var.C;
                if (mw4Var3 == null) {
                    return f88Var;
                }
                this.n = true;
                return mw4Var3.a(yr5Var, this) == ne1Var ? ne1Var : f88Var;
            default:
                boolean z4 = this.n;
                if (z4) {
                    if (z4) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                mw4 mw4Var4 = p0Var.C;
                if (mw4Var4 == null) {
                    return f88Var;
                }
                zr5 zr5Var = new zr5(yr5Var);
                this.n = true;
                return mw4Var4.a(zr5Var, this) == ne1Var ? ne1Var : f88Var;
        }
    }
}
