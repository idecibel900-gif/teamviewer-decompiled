package o;

/* JADX INFO: loaded from: classes.dex */
public final class xe extends og7 implements jw2 {
    public boolean m;
    public /* synthetic */ mf n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ uj1 f2509o;
    public /* synthetic */ Object p;
    public final /* synthetic */ nf q;
    public final /* synthetic */ jo r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe(nf nfVar, jo joVar, hc1 hc1Var) {
        super(4, hc1Var);
        this.q = nfVar;
        this.r = joVar;
    }

    @Override // o.jw2
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        xe xeVar = new xe(this.q, this.r, (hc1) obj4);
        xeVar.n = (mf) obj;
        xeVar.f2509o = (uj1) obj2;
        xeVar.p = obj3;
        return xeVar.invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.m;
        if (!z) {
            ct1.a0(obj);
            mf mfVar = this.n;
            uj1 uj1Var = this.f2509o;
            Object obj2 = this.p;
            nf nfVar = this.q;
            float fZ = ((wf5) nfVar.j).z();
            this.n = null;
            this.f2509o = null;
            this.m = true;
            Object objH = uf0.h(nfVar, fZ, mfVar, uj1Var, obj2, this.r, this);
            ne1 ne1Var = ne1.m;
            if (objH == ne1Var) {
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
