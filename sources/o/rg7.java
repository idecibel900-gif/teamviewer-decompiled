package o;

/* JADX INFO: loaded from: classes.dex */
public final class rg7 extends jc1 {
    public n87 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ug7 f1921o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg7(ug7 ug7Var, i30 i30Var) {
        super(i30Var);
        this.f1921o = ug7Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1921o.e(0L, null, this);
    }
}
