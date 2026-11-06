package o;

/* JADX INFO: loaded from: classes.dex */
public final class nh1 extends jc1 {
    public vh1 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1567o;
    public final /* synthetic */ vh1 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh1(vh1 vh1Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = vh1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1567o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.f(this);
    }
}
