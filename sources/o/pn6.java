package o;

/* JADX INFO: loaded from: classes.dex */
public final class pn6 extends jc1 {
    public Object m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ rn6 f1753o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn6(rn6 rn6Var, jc1 jc1Var) {
        super(jc1Var);
        this.f1753o = rn6Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1753o.H0(this);
    }
}
