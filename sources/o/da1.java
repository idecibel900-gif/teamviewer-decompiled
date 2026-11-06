package o;

/* JADX INFO: loaded from: classes.dex */
public final class da1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ qa1 f602o;
    public final /* synthetic */ px4 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da1(qa1 qa1Var, px4 px4Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f602o = qa1Var;
        this.p = px4Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        px4 px4Var = this.p;
        qa1 qa1Var = this.f602o;
        switch (b) {
            case 0:
                return new da1(qa1Var, px4Var, hc1Var, (byte) 0);
            default:
                return new da1(qa1Var, px4Var, hc1Var, (byte) 1);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((da1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((da1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return ne1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        px4 px4Var = this.p;
        qa1 qa1Var = this.f602o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                r36 r36Var = qa1Var.y;
                c5 c5Var = new c5(px4Var, (byte) 5);
                this.n = true;
                if (r36Var.m.b(c5Var, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
            default:
                boolean z2 = this.n;
                if (z2) {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                r36 r36Var2 = qa1Var.A;
                c5 c5Var2 = new c5(px4Var, (byte) 6);
                this.n = true;
                if (r36Var2.m.b(c5Var2, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
        }
    }
}
