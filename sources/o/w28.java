package o;

/* JADX INFO: loaded from: classes.dex */
public final class w28 extends jc1 {
    public Object m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e38 f2369o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w28(e38 e38Var, jc1 jc1Var) {
        super(jc1Var);
        this.f2369o = e38Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f2369o.a(null, this);
    }
}
