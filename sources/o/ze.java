package o;

/* JADX INFO: loaded from: classes.dex */
public final class ze extends jc1 {
    public Object m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ af f2692o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze(af afVar, hc1 hc1Var) {
        super(hc1Var);
        this.f2692o = afVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f2692o.c(null, this);
    }
}
