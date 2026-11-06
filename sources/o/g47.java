package o;

/* JADX INFO: loaded from: classes.dex */
public final class g47 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ h47 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f857o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g47(h47 h47Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = h47Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f857o |= Integer.MIN_VALUE;
        return this.n.d(null, 0.0f, 0.0f, null, this);
    }
}
