package o;

/* JADX INFO: loaded from: classes.dex */
public final class y28 extends jc1 {
    public e38 m;
    public wk0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2572o;
    public final /* synthetic */ e38 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y28(e38 e38Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = e38Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2572o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(this);
    }
}
