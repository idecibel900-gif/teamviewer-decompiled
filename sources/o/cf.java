package o;

/* JADX INFO: loaded from: classes.dex */
public final class cf extends jc1 {
    public h76 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ gf f520o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(gf gfVar, jc1 jc1Var) {
        super(jc1Var);
        this.f520o = gfVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f520o.p1(0.0f, this);
    }
}
