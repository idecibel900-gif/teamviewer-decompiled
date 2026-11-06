package o;

/* JADX INFO: loaded from: classes.dex */
public final class gb2 extends jc1 {
    public l46 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hb2 f879o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb2(hb2 hb2Var, jc1 jc1Var) {
        super(jc1Var);
        this.f879o = hb2Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f879o.d(null, this);
    }
}
