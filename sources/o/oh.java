package o;

/* JADX INFO: loaded from: classes.dex */
public final class oh extends jc1 {
    public ff0 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ph f1652o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(ph phVar, jc1 jc1Var) {
        super(jc1Var);
        this.f1652o = phVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1652o.a(this);
    }
}
