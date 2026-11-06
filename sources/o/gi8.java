package o;

/* JADX INFO: loaded from: classes.dex */
public final class gi8 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hi8 f897o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gi8(hi8 hi8Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f897o = hi8Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        hi8 hi8Var = this.f897o;
        switch (b) {
            case 0:
                return new gi8(hi8Var, hc1Var, (byte) 0);
            case 1:
                return new gi8(hi8Var, hc1Var, (byte) 1);
            case 2:
                return new gi8(hi8Var, hc1Var, (byte) 2);
            case 3:
                return new gi8(hi8Var, hc1Var, (byte) 3);
            case 4:
                return new gi8(hi8Var, hc1Var, (byte) 4);
            default:
                return new gi8(hi8Var, hc1Var, (byte) 5);
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
            case 3:
                break;
            case 4:
                break;
        }
        return ((gi8) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        ei8 ei8Var = ei8.n;
        f88 f88Var = f88.a;
        hi8 hi8Var = this.f897o;
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
                if (!((Boolean) hi8Var.u.getValue()).booleanValue()) {
                    return f88Var;
                }
                ye4.a("WebLoginViewModel", "login successful callback, should update UI");
                yx6 yx6Var = hi8Var.q;
                this.n = true;
                return yx6Var.c(ei8.m, this) == ne1Var ? ne1Var : f88Var;
            case 1:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    yx6 yx6Var2 = hi8Var.q;
                    this.n = true;
                    return yx6Var2.c(ei8Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z2) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    yx6 yx6Var3 = hi8Var.q;
                    this.n = true;
                    return yx6Var3.c(ei8Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z3) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.n;
                if (!z4) {
                    ct1.a0(obj);
                    yx6 yx6Var4 = hi8Var.q;
                    this.n = true;
                    return yx6Var4.c(ei8.f717o, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z4) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.n;
                if (!z5) {
                    ct1.a0(obj);
                    yx6 yx6Var5 = hi8Var.q;
                    this.n = true;
                    return yx6Var5.c(ei8.p, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z5) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z6 = this.n;
                if (!z6) {
                    ct1.a0(obj);
                    yx6 yx6Var6 = hi8Var.q;
                    this.n = true;
                    return yx6Var6.c(ei8.q, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z6) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
