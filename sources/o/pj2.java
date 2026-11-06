package o;

/* JADX INFO: loaded from: classes.dex */
public final class pj2 extends jc1 {
    public rj2 m;
    public nj2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1738o;
    public /* synthetic */ Object p;
    public final /* synthetic */ rj2 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj2(rj2 rj2Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = rj2Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
