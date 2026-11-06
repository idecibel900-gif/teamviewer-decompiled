package o;

/* JADX INFO: loaded from: classes.dex */
public final class cr7 extends og7 implements iw2 {
    public boolean m;
    public /* synthetic */ wr5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ long f552o;
    public final /* synthetic */ me1 p;
    public final /* synthetic */ px4 q;
    public final /* synthetic */ mw4 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr7(me1 me1Var, px4 px4Var, mw4 mw4Var, hc1 hc1Var) {
        super(3, hc1Var);
        this.p = me1Var;
        this.q = px4Var;
        this.r = mw4Var;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j = ((t65) obj2).a;
        px4 px4Var = this.q;
        mw4 mw4Var = this.r;
        cr7 cr7Var = new cr7(this.p, px4Var, mw4Var, (hc1) obj3);
        cr7Var.n = (wr5) obj;
        cr7Var.f552o = j;
        return cr7Var.invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.m;
        me1 me1Var = this.p;
        if (!z) {
            ct1.a0(obj);
            wr5 wr5Var = this.n;
            im3.R(me1Var, null, null, new k0((Object) this.q, this.f552o, this.r, (hc1) null, (byte) 3), 3);
            this.m = true;
            obj = wr5Var.e(this);
            ne1 ne1Var = ne1.m;
            if (obj == ne1Var) {
                return ne1Var;
            }
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
        }
        im3.R(me1Var, null, null, new m37(this.q, ((Boolean) obj).booleanValue(), this.r, null), 3);
        return f88.a;
    }
}
