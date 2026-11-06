package o;

/* JADX INFO: loaded from: classes.dex */
public final class lm5 extends jc1 {
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public my4 f1381o;
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ om5 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm5(om5 om5Var, jc1 jc1Var) {
        super(jc1Var);
        this.r = om5Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, 0L, null, this);
    }
}
