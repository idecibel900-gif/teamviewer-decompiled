package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ap2 extends jc1 {
    public /* synthetic */ Object m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ to2 f345o;
    public q5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap2(to2 to2Var, hc1 hc1Var) {
        super(hc1Var);
        this.f345o = to2Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.n |= Integer.MIN_VALUE;
        return this.f345o.b(null, this);
    }
}
