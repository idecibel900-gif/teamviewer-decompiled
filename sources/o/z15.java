package o;

/* JADX INFO: loaded from: classes.dex */
public final class z15 extends jc1 {
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2663o;
    public final /* synthetic */ b25 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z15(b25 b25Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = b25Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2663o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.e(0L, 0L, this);
    }
}
