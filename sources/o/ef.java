package o;

/* JADX INFO: loaded from: classes.dex */
public final class ef extends og7 implements iw2 {
    public boolean m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ gf f706o;
    public final /* synthetic */ h76 p;
    public final /* synthetic */ float q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(gf gfVar, h76 h76Var, float f, hc1 hc1Var) {
        super(3, hc1Var);
        this.f706o = gfVar;
        this.p = h76Var;
        this.q = f;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        h76 h76Var = this.p;
        float f = this.q;
        ef efVar = new ef(this.f706o, h76Var, f, (hc1) obj3);
        efVar.n = (mf) obj;
        return efVar.invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        h76 h76Var;
        boolean z = this.m;
        if (!z) {
            ct1.a0(obj);
            gf gfVar = this.f706o;
            df dfVar = new df(gfVar, (mf) this.n, (byte) 0);
            ym2 ym2Var = gfVar.X;
            if (ym2Var == null) {
                im3.e0("resolvedFlingBehavior");
                throw null;
            }
            h76 h76Var2 = this.p;
            this.n = h76Var2;
            this.m = true;
            obj = ym2Var.a(dfVar, this.q, this);
            ne1 ne1Var = ne1.m;
            if (obj == ne1Var) {
                return ne1Var;
            }
            h76Var = h76Var2;
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h76Var = (h76) this.n;
            ct1.a0(obj);
        }
        h76Var.m = ((Number) obj).floatValue();
        return f88.a;
    }
}
