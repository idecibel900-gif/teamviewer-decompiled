package o;

/* JADX INFO: loaded from: classes.dex */
public final class uk6 extends jc1 {
    public j76 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yk6 f2221o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk6(yk6 yk6Var, jc1 jc1Var) {
        super(jc1Var);
        this.f2221o = yk6Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f2221o.a(0L, this);
    }
}
