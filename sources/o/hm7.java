package o;

/* JADX INFO: loaded from: classes.dex */
public final class hm7 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ km f990o;
    public final /* synthetic */ float p;
    public final /* synthetic */ im7 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hm7(km kmVar, float f, im7 im7Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f990o = kmVar;
        this.p = f;
        this.q = im7Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new hm7(this.f990o, this.p, this.q, hc1Var, (byte) 0);
            default:
                return new hm7(this.f990o, this.p, this.q, hc1Var, (byte) 1);
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
        return ((hm7) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        im7 im7Var = this.q;
        float f = this.p;
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
                w32 w32Var = new w32(f);
                e87 e87Var = im7Var.D;
                this.n = true;
                return km.a(this.f990o, w32Var, e87Var, null, null, this, 12) == ne1Var ? ne1Var : f88Var;
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
                w32 w32Var2 = new w32(f);
                e87 e87Var2 = im7Var.D;
                this.n = true;
                return km.a(this.f990o, w32Var2, e87Var2, null, null, this, 12) == ne1Var ? ne1Var : f88Var;
        }
    }
}
