package o;

/* JADX INFO: loaded from: classes.dex */
public final class bp2 extends jc1 {
    public /* synthetic */ Object m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q5 f445o;
    public Object p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp2(q5 q5Var, hc1 hc1Var) {
        super(hc1Var);
        this.f445o = q5Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.n |= Integer.MIN_VALUE;
        return this.f445o.c(null, this);
    }
}
