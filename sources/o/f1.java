package o;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 extends jc1 {
    public vg6 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ih1 f759o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(ih1 ih1Var, hc1 hc1Var) {
        super(hc1Var);
        this.f759o = ih1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f759o.b(null, this);
    }
}
