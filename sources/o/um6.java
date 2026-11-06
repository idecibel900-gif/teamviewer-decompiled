package o;

/* JADX INFO: loaded from: classes.dex */
public final class um6 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ bn6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2228o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um6(bn6 bn6Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = bn6Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2228o |= Integer.MIN_VALUE;
        return this.n.Y0(null, this);
    }
}
