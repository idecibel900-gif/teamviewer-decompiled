package o;

/* JADX INFO: loaded from: classes.dex */
public final class ep2 extends jc1 {
    public /* synthetic */ Object m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q5 f732o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep2(q5 q5Var, hc1 hc1Var) {
        super(hc1Var);
        this.f732o = q5Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.n |= Integer.MIN_VALUE;
        return this.f732o.c(null, this);
    }
}
