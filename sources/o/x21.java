package o;

/* JADX INFO: loaded from: classes.dex */
public final class x21 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q37 f2470o;
    public final /* synthetic */ ul7 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x21(q37 q37Var, ul7 ul7Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2470o = q37Var;
        this.p = ul7Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        ul7 ul7Var = this.p;
        q37 q37Var = this.f2470o;
        switch (b) {
            case 0:
                return new x21(q37Var, ul7Var, hc1Var, (byte) 0);
            case 1:
                return new x21(q37Var, ul7Var, hc1Var, (byte) 1);
            case 2:
                return new x21(q37Var, ul7Var, hc1Var, (byte) 2);
            case 3:
                return new x21(q37Var, ul7Var, hc1Var, (byte) 3);
            case 4:
                return new x21(q37Var, ul7Var, hc1Var, (byte) 4);
            case 5:
                return new x21(q37Var, ul7Var, hc1Var, (byte) 5);
            case 6:
                return new x21(q37Var, ul7Var, hc1Var, (byte) 6);
            default:
                return new x21(q37Var, ul7Var, hc1Var, (byte) 7);
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
        }
        return ((x21) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        ul7 ul7Var = this.p;
        q37 q37Var = this.f2470o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    this.n = true;
                    return q37Var.b(ul7Var, this) == ne1Var ? ne1Var : f88Var;
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
                    return q37Var.b(ul7Var, this) == ne1Var ? ne1Var : f88Var;
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
                    return q37Var.b(ul7Var, this) == ne1Var ? ne1Var : f88Var;
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
                    return q37Var.b(ul7Var, this) == ne1Var ? ne1Var : f88Var;
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
                    return q37Var.b(ul7Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z5) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z6 = this.n;
                if (!z6) {
                    ct1.a0(obj);
                    this.n = true;
                    return q37Var.b(ul7Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z6) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z7 = this.n;
                if (!z7) {
                    ct1.a0(obj);
                    this.n = true;
                    return q37Var.b(ul7Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z7) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z8 = this.n;
                if (!z8) {
                    ct1.a0(obj);
                    this.n = true;
                    return q37Var.b(ul7Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z8) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
