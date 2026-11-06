package o;

/* JADX INFO: loaded from: classes.dex */
public final class y97 extends jc1 {
    public tp6 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p70 f2591o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y97(p70 p70Var, jc1 jc1Var) {
        super(jc1Var);
        this.f2591o = p70Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f2591o.a(this);
    }
}
