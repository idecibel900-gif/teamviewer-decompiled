package o;

/* JADX INFO: loaded from: classes.dex */
public final class gb0 extends jc1 {
    public v56 m;
    public Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f878o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ hb0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(hb0 hb0Var, jc1 jc1Var) {
        super(jc1Var);
        this.r = hb0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, this);
    }
}
