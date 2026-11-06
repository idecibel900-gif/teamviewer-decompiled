package o;

/* JADX INFO: loaded from: classes.dex */
public final class d64 extends jc1 {
    public /* synthetic */ Object m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fm f590o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d64(fm fmVar, hc1 hc1Var) {
        super(hc1Var);
        this.f590o = fmVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.n |= Integer.MIN_VALUE;
        return this.f590o.b(null, this);
    }
}
