package o;

/* JADX INFO: loaded from: classes.dex */
public final class th1 extends jc1 {
    public i76 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vh1 f2111o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th1(vh1 vh1Var, jc1 jc1Var) {
        super(jc1Var);
        this.f2111o = vh1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f2111o.i(null, false, this);
    }
}
