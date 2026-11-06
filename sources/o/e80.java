package o;

/* JADX INFO: loaded from: classes.dex */
public final class e80 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g80 f691o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e80(g80 g80Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f691o = g80Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        g80 g80Var = this.f691o;
        switch (b) {
            case 0:
                return new e80(g80Var, hc1Var, (byte) 0);
            default:
                return new e80(g80Var, hc1Var, (byte) 1);
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
        return ((e80) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        g80 g80Var = this.f691o;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    kf0 kf0Var = g80Var.r;
                    this.n = true;
                    if (kf0Var.a(f88Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            default:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    kf0 kf0Var2 = g80Var.r;
                    this.n = true;
                    if (kf0Var2.a(f88Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
        }
    }
}
