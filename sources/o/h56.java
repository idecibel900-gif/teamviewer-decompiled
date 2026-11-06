package o;

/* JADX INFO: loaded from: classes2.dex */
public final class h56 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ a65 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f951o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h56(a65 a65Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = a65Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f951o |= Integer.MIN_VALUE;
        return this.n.T0(null, this);
    }
}
