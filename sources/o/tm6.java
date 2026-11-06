package o;

/* JADX INFO: loaded from: classes.dex */
public final class tm6 extends jc1 {
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ bn6 f2124o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm6(bn6 bn6Var, jc1 jc1Var) {
        super(jc1Var);
        this.f2124o = bn6Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f2124o.X0(null, this);
    }
}
