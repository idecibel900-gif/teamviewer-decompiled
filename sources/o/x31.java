package o;

/* JADX INFO: loaded from: classes.dex */
public final class x31 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ y31 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2475o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x31(y31 y31Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = y31Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2475o |= Integer.MIN_VALUE;
        return this.n.e1(this);
    }
}
