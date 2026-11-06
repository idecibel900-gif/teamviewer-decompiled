package o;

/* JADX INFO: loaded from: classes.dex */
public final class tp2 extends jc1 {
    public /* synthetic */ Object m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ho2 f2132o;
    public final /* synthetic */ af p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp2(af afVar, hc1 hc1Var) {
        super(hc1Var);
        this.p = afVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.n |= Integer.MIN_VALUE;
        return this.p.c(null, this);
    }
}
