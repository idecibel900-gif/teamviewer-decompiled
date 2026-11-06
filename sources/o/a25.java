package o;

/* JADX INFO: loaded from: classes.dex */
public final class a25 extends jc1 {
    public long m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b25 f287o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a25(b25 b25Var, jc1 jc1Var) {
        super(jc1Var);
        this.f287o = b25Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f287o.C(0L, this);
    }
}
