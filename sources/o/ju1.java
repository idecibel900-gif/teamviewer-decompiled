package o;

/* JADX INFO: loaded from: classes.dex */
public final class ju1 extends jc1 {
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1200o;
    public final /* synthetic */ ru1 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju1(ru1 ru1Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = ru1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1200o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.f1(0L, this);
    }
}
