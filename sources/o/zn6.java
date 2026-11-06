package o;

/* JADX INFO: loaded from: classes2.dex */
public final class zn6 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ ao6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2722o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn6(ao6 ao6Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = ao6Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2722o |= Integer.MIN_VALUE;
        return this.n.d(this);
    }
}
