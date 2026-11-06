package o;

/* JADX INFO: loaded from: classes.dex */
public final class sy6 extends jc1 {
    public long m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ty6 f2066o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy6(ty6 ty6Var, jc1 jc1Var) {
        super(jc1Var);
        this.f2066o = ty6Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f2066o.C(0L, this);
    }
}
