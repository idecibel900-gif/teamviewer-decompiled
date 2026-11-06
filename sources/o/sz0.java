package o;

/* JADX INFO: loaded from: classes.dex */
public final class sz0 extends jc1 {
    public Object m;
    public zk3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2067o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ tz0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(tz0 tz0Var, jc1 jc1Var) {
        super(jc1Var);
        this.r = tz0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, this);
    }
}
