package o;

/* JADX INFO: loaded from: classes.dex */
public final class e57 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f684o;
    public final /* synthetic */ hw2 p;
    public final /* synthetic */ px4 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e57(hw2 hw2Var, px4 px4Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = hw2Var;
        this.q = px4Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                e57 e57Var = new e57(this.p, this.q, hc1Var, (byte) 0);
                e57Var.f684o = obj;
                return e57Var;
            case 1:
                e57 e57Var2 = new e57(this.p, this.q, hc1Var, (byte) 1);
                e57Var2.f684o = obj;
                return e57Var2;
            case 2:
                e57 e57Var3 = new e57(this.p, this.q, hc1Var, (byte) 2);
                e57Var3.f684o = obj;
                return e57Var3;
            default:
                e57 e57Var4 = new e57(this.p, this.q, hc1Var, (byte) 3);
                e57Var4.f684o = obj;
                return e57Var4;
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
        return ((e57) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.q;
        hw2 hw2Var = this.p;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    ft5 ft5Var = new ft5(px4Var, ((me1) this.f684o).getCoroutineContext());
                    this.n = true;
                    return hw2Var.invoke(ft5Var, this) == ne1Var ? ne1Var : f88Var;
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
                    ft5 ft5Var2 = new ft5(px4Var, ((me1) this.f684o).getCoroutineContext());
                    this.n = true;
                    return hw2Var.invoke(ft5Var2, this) == ne1Var ? ne1Var : f88Var;
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
                    ft5 ft5Var3 = new ft5(px4Var, ((me1) this.f684o).getCoroutineContext());
                    this.n = true;
                    return hw2Var.invoke(ft5Var3, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z3) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z4 = this.n;
                if (!z4) {
                    ct1.a0(obj);
                    ft5 ft5Var4 = new ft5(px4Var, ((me1) this.f684o).getCoroutineContext());
                    this.n = true;
                    return hw2Var.invoke(ft5Var4, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z4) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
