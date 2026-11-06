package o;

/* JADX INFO: loaded from: classes.dex */
public final class a13 extends jc1 {
    public Object m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d11 f281o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a13(d11 d11Var, jc1 jc1Var) {
        super(jc1Var);
        this.f281o = d11Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f281o.q(this);
    }
}
