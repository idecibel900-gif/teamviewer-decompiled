package o;

/* JADX INFO: loaded from: classes.dex */
public final class cx1 extends jc1 {
    public lx1 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yi f562o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx1(yi yiVar, hc1 hc1Var) {
        super(hc1Var);
        this.f562o = yiVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f562o.a(null, this);
    }
}
