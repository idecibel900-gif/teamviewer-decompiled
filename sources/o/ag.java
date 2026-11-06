package o;

/* JADX INFO: loaded from: classes.dex */
public final class ag extends jc1 {
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ bg f319o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(bg bgVar, jc1 jc1Var) {
        super(jc1Var);
        this.f319o = bgVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f319o.b(null, this);
    }
}
