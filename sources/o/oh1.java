package o;

/* JADX INFO: loaded from: classes.dex */
public final class oh1 extends jc1 {
    public vh1 m;
    public g97 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1653o;
    public /* synthetic */ Object p;
    public final /* synthetic */ vh1 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh1(vh1 vh1Var, hc1 hc1Var) {
        super(hc1Var);
        this.q = vh1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.g(false, this);
    }
}
