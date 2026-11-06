package o;

/* JADX INFO: loaded from: classes2.dex */
public final class xx6 extends jc1 {
    public yx6 m;
    public ho2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public zx6 f2560o;
    public bp3 p;
    public /* synthetic */ Object q;
    public final /* synthetic */ yx6 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx6(yx6 yx6Var, hc1 hc1Var) {
        super(hc1Var);
        this.r = yx6Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        yx6.l(this.r, null, this);
        return ne1.m;
    }
}
