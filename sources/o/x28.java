package o;

/* JADX INFO: loaded from: classes2.dex */
public final class x28 extends jc1 {
    public en0 m;
    public int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2474o;
    public final /* synthetic */ en0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x28(en0 en0Var, hc1 hc1Var) {
        super(hc1Var);
        this.p = en0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2474o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(null, this);
    }
}
