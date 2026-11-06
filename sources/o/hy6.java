package o;

/* JADX INFO: loaded from: classes.dex */
public final class hy6 extends jc1 {
    public iy6 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ iy6 f1017o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy6(iy6 iy6Var, jc1 jc1Var) {
        super(jc1Var);
        this.f1017o = iy6Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1017o.a(null, this);
    }
}
