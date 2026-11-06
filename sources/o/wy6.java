package o;

/* JADX INFO: loaded from: classes.dex */
public final class wy6 extends og7 implements iw2 {
    public boolean m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h76 f2461o;
    public final /* synthetic */ ym2 p;
    public final /* synthetic */ xy6 q;
    public final /* synthetic */ float r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy6(h76 h76Var, ym2 ym2Var, xy6 xy6Var, float f, hc1 hc1Var) {
        super(3, hc1Var);
        this.f2461o = h76Var;
        this.p = ym2Var;
        this.q = xy6Var;
        this.r = f;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        xy6 xy6Var = this.q;
        float f = this.r;
        wy6 wy6Var = new wy6(this.f2461o, this.p, xy6Var, f, (hc1) obj3);
        wy6Var.n = (mf) obj;
        return wy6Var.invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        h76 h76Var;
        boolean z = this.m;
        if (!z) {
            ct1.a0(obj);
            df dfVar = new df(this.q, (mf) this.n, (byte) 3);
            h76 h76Var2 = this.f2461o;
            this.n = h76Var2;
            this.m = true;
            Object objA = this.p.a(dfVar, this.r, this);
            ne1 ne1Var = ne1.m;
            if (objA == ne1Var) {
                return ne1Var;
            }
            obj = objA;
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
