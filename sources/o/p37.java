package o;

/* JADX INFO: loaded from: classes.dex */
public final class p37 extends jc1 {
    public ul7 m;
    public ky4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1702o;
    public final /* synthetic */ q37 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p37(q37 q37Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = q37Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1702o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(null, this);
    }
}
