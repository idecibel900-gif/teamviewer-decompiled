package o;

/* JADX INFO: loaded from: classes.dex */
public final class po5 extends jc1 {
    public to5 m;
    public x08 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f51 f1758o;
    public /* synthetic */ Object p;
    public final /* synthetic */ to5 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po5(to5 to5Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = to5Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.e(null, this);
    }
}
