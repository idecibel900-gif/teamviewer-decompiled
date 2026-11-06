package o;

/* JADX INFO: loaded from: classes.dex */
public final class pk6 extends jc1 {
    public long m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ qk6 f1742o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk6(qk6 qk6Var, jc1 jc1Var) {
        super(jc1Var);
        this.f1742o = qk6Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1742o.e(0L, 0L, this);
    }
}
