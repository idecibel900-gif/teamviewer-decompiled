package o;

/* JADX INFO: loaded from: classes.dex */
public final class gy extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xy6 f931o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gy(xy6 xy6Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f931o = xy6Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        xy6 xy6Var = this.f931o;
        switch (b) {
            case 0:
                return new gy(xy6Var, hc1Var, (byte) 0);
            case 1:
                return new gy(xy6Var, hc1Var, (byte) 1);
            case 2:
                return new gy(xy6Var, hc1Var, (byte) 2);
            case 3:
                return new gy(xy6Var, hc1Var, (byte) 3);
            case 4:
                return new gy(xy6Var, hc1Var, (byte) 4);
            case 5:
                return new gy(xy6Var, hc1Var, (byte) 5);
            case 6:
                return new gy(xy6Var, hc1Var, (byte) 6);
            case 7:
                return new gy(xy6Var, hc1Var, (byte) 7);
            case 8:
                return new gy(xy6Var, hc1Var, (byte) 8);
            case ep1.b /* 9 */:
                return new gy(xy6Var, hc1Var, (byte) 9);
            case ep1.c /* 10 */:
                return new gy(xy6Var, hc1Var, (byte) 10);
            case 11:
                return new gy(xy6Var, hc1Var, (byte) 11);
            case ep1.d /* 12 */:
                return new gy(xy6Var, hc1Var, (byte) 12);
            case 13:
                return new gy(xy6Var, hc1Var, (byte) 13);
            default:
                return new gy(xy6Var, hc1Var, (byte) 14);
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
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case ep1.b /* 9 */:
                break;
            case ep1.c /* 10 */:
                break;
            case 11:
                break;
            case ep1.d /* 12 */:
                break;
            case 13:
                break;
        }
        return ((gy) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objB2;
        byte b = this.m;
        yy6 yy6Var = yy6.n;
        f88 f88Var = f88.a;
        xy6 xy6Var = this.f931o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    this.n = true;
                    return xy6Var.d(this) == ne1Var ? ne1Var : f88Var;
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
                    return xy6Var.d(this) == ne1Var ? ne1Var : f88Var;
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
                    this.n = true;
                    return xy6Var.d(this) == ne1Var ? ne1Var : f88Var;
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
                    this.n = true;
                    return xy6Var.f(this) == ne1Var ? ne1Var : f88Var;
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
                    this.n = true;
                    return xy6Var.d(this) == ne1Var ? ne1Var : f88Var;
                }
                if (z5) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z6 = this.n;
                if (z6) {
                    if (z6) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                this.n = true;
                if (!((Boolean) xy6Var.d.invoke(yy6Var)).booleanValue() || (objB = xy6Var.b(yy6Var, xy6Var.h, this)) != ne1Var) {
                    objB = f88Var;
                }
                return objB == ne1Var ? ne1Var : f88Var;
            case 6:
                boolean z7 = this.n;
                if (!z7) {
                    ct1.a0(obj);
                    this.n = true;
                    return xy6Var.g(this) == ne1Var ? ne1Var : f88Var;
                }
                if (z7) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z8 = this.n;
                if (z8) {
                    if (z8) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                this.n = true;
                if (!((Boolean) xy6Var.d.invoke(yy6Var)).booleanValue() || (objB2 = xy6Var.b(yy6Var, xy6Var.h, this)) != ne1Var) {
                    objB2 = f88Var;
                }
                return objB2 == ne1Var ? ne1Var : f88Var;
            case 8:
                boolean z9 = this.n;
                if (!z9) {
                    ct1.a0(obj);
                    this.n = true;
                    return xy6Var.f(this) == ne1Var ? ne1Var : f88Var;
                }
                if (z9) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ep1.b /* 9 */:
                boolean z10 = this.n;
                if (!z10) {
                    ct1.a0(obj);
                    this.n = true;
                    return xy6Var.d(this) == ne1Var ? ne1Var : f88Var;
                }
                if (z10) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ep1.c /* 10 */:
                boolean z11 = this.n;
                if (!z11) {
                    ct1.a0(obj);
                    this.n = true;
                    return xy6Var.d(this) == ne1Var ? ne1Var : f88Var;
                }
                if (z11) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                boolean z12 = this.n;
                if (!z12) {
                    ct1.a0(obj);
                    this.n = true;
                    return xy6Var.g(this) == ne1Var ? ne1Var : f88Var;
                }
                if (z12) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ep1.d /* 12 */:
                boolean z13 = this.n;
                if (!z13) {
                    ct1.a0(obj);
                    this.n = true;
                    return xy6Var.d(this) == ne1Var ? ne1Var : f88Var;
                }
                if (z13) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                boolean z14 = this.n;
                if (!z14) {
                    ct1.a0(obj);
                    this.n = true;
                    return xy6Var.f(this) == ne1Var ? ne1Var : f88Var;
                }
                if (z14) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z15 = this.n;
                if (!z15) {
                    ct1.a0(obj);
                    this.n = true;
                    return xy6Var.d(this) == ne1Var ? ne1Var : f88Var;
                }
                if (z15) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
