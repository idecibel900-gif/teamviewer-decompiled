package o;

/* JADX INFO: loaded from: classes.dex */
public final class bf extends og7 implements iw2 {
    public boolean m;
    public /* synthetic */ mf n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ bj f420o;
    public final /* synthetic */ gf p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bj bjVar, gf gfVar, hc1 hc1Var) {
        super(3, hc1Var);
        this.f420o = bjVar;
        this.p = gfVar;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        bf bfVar = new bf(this.f420o, this.p, (hc1) obj3);
        bfVar.n = (mf) obj;
        return bfVar.invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.m;
        if (!z) {
            ct1.a0(obj);
            g0 g0Var = new g0(this.p, this.n, (byte) 6);
            this.m = true;
            Object objInvoke = this.f420o.invoke(g0Var, this);
            ne1 ne1Var = ne1.m;
            if (objInvoke == ne1Var) {
                return ne1Var;
            }
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
        }
        return f88.a;
    }
}
