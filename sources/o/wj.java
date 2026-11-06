package o;

/* JADX INFO: loaded from: classes.dex */
public final class wj extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ xj n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2416o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(xj xjVar, jc1 jc1Var) {
        super(jc1Var);
        this.n = xjVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2416o |= Integer.MIN_VALUE;
        this.n.a(null, this);
        return ne1.m;
    }
}
