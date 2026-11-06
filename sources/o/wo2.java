package o;

/* JADX INFO: loaded from: classes2.dex */
public final class wo2 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ x22 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2433o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo2(x22 x22Var, hc1 hc1Var) {
        super(hc1Var);
        this.n = x22Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2433o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}
