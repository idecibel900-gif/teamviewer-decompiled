package o;

/* JADX INFO: loaded from: classes.dex */
public final class u25 extends jc1 {
    public d46 m;
    public c35 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c35 f2160o;
    public g95 p;
    public /* synthetic */ Object q;
    public final /* synthetic */ v25 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u25(v25 v25Var, jc1 jc1Var) {
        super(jc1Var);
        this.r = v25Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.j(null, null, null, this);
    }
}
