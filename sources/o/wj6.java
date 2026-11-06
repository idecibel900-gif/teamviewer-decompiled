package o;

/* JADX INFO: loaded from: classes.dex */
public final class wj6 extends og7 implements hw2 {
    public /* synthetic */ Object m;
    public final /* synthetic */ h76 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f2419o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj6(h76 h76Var, float f, hc1 hc1Var) {
        super(2, hc1Var);
        this.n = h76Var;
        this.f2419o = f;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        wj6 wj6Var = new wj6(this.n, this.f2419o, hc1Var);
        wj6Var.m = obj;
        return wj6Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        wj6 wj6Var = (wj6) create((dk6) obj, (hc1) obj2);
        f88 f88Var = f88.a;
        wj6Var.invokeSuspend(f88Var);
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        ct1.a0(obj);
        this.n.m = ((dk6) this.m).a(this.f2419o);
        return f88.a;
    }
}
