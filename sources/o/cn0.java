package o;

/* JADX INFO: loaded from: classes2.dex */
public final class cn0 extends og7 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f542o;
    public final /* synthetic */ fn0 p;
    public final /* synthetic */ ho2 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(fn0 fn0Var, ho2 ho2Var, Object obj, hc1 hc1Var) {
        super(2, hc1Var);
        this.p = fn0Var;
        this.q = ho2Var;
        this.f542o = obj;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        ho2 ho2Var = this.q;
        fn0 fn0Var = this.p;
        switch (b) {
            case 0:
                return new cn0(fn0Var, ho2Var, this.f542o, hc1Var);
            default:
                cn0 cn0Var = new cn0(fn0Var, ho2Var, hc1Var);
                cn0Var.f542o = obj;
                return cn0Var;
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
        return ((cn0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
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
                iw2 iw2Var = this.p.q;
                Object obj2 = this.f542o;
                this.n = true;
                return iw2Var.d(this.q, obj2, this) == ne1Var ? ne1Var : f88Var;
            default:
                me1 me1Var = (me1) this.f542o;
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
                k76 k76Var = new k76();
                fn0 fn0Var = this.p;
                go2 go2Var = fn0Var.p;
                en0 en0Var = new en0(k76Var, me1Var, fn0Var, this.q, (byte) 0);
                this.f542o = null;
                this.n = true;
                return go2Var.b(en0Var, this) == ne1Var ? ne1Var : f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(fn0 fn0Var, ho2 ho2Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.p = fn0Var;
        this.q = ho2Var;
    }
}
