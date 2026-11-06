package o;

/* JADX INFO: loaded from: classes.dex */
public final class t25 extends jc1 {
    public bf0 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v25 f2071o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t25(v25 v25Var, jc1 jc1Var) {
        super(jc1Var);
        this.f2071o = v25Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f2071o.g(null, this);
    }
}
