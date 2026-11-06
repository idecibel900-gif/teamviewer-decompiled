package o;

/* JADX INFO: loaded from: classes.dex */
public final class ku4 extends jc1 {
    public yk6 m;
    public h76 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1305o;
    public /* synthetic */ Object p;
    public final /* synthetic */ nu4 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku4(nu4 nu4Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = nu4Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d(null, null, 0.0f, 0.0f, this);
    }
}
