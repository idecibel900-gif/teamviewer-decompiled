package o;

/* JADX INFO: loaded from: classes.dex */
public final class ux extends jc1 {
    public ke3 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vx f2256o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(vx vxVar, jc1 jc1Var) {
        super(jc1Var);
        this.f2256o = vxVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f2256o.a(null, null, this);
    }
}
