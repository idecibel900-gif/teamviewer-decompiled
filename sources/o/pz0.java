package o;

/* JADX INFO: loaded from: classes.dex */
public final class pz0 extends og7 implements iw2 {
    public final /* synthetic */ g76 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0(g76 g76Var, hc1 hc1Var) {
        super(3, hc1Var);
        this.m = g76Var;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        pz0 pz0Var = new pz0(this.m, (hc1) obj3);
        f88 f88Var = f88.a;
        pz0Var.invokeSuspend(f88Var);
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        ct1.a0(obj);
        this.m.m = true;
        return f88.a;
    }
}
