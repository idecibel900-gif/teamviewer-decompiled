package o;

/* JADX INFO: loaded from: classes.dex */
public final class an6 extends jc1 {
    public /* synthetic */ Object m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q5 f341o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an6(q5 q5Var, hc1 hc1Var) {
        super(hc1Var);
        this.f341o = q5Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.n |= Integer.MIN_VALUE;
        return this.f341o.c(null, this);
    }
}
