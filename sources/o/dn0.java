package o;

/* JADX INFO: loaded from: classes2.dex */
public final class dn0 extends jc1 {
    public Object m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ en0 f637o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn0(en0 en0Var, hc1 hc1Var) {
        super(hc1Var);
        this.f637o = en0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f637o.c(null, this);
    }
}
