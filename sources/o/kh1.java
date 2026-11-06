package o;

/* JADX INFO: loaded from: classes.dex */
public final class kh1 extends jc1 {
    public Object m;
    public vh1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public qx0 f1265o;
    public /* synthetic */ Object p;
    public final /* synthetic */ vh1 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh1(vh1 vh1Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = vh1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d(null, this);
    }
}
