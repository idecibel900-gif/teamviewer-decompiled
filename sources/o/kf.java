package o;

/* JADX INFO: loaded from: classes.dex */
public final class kf extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ nf n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1257o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(nf nfVar, hc1 hc1Var) {
        super(hc1Var);
        this.n = nfVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1257o |= Integer.MIN_VALUE;
        return this.n.a(null, null, null, this);
    }
}
