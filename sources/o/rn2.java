package o;

/* JADX INFO: loaded from: classes.dex */
public final class rn2 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ sn2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1932o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn2(sn2 sn2Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = sn2Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1932o |= Integer.MIN_VALUE;
        return this.n.b(this);
    }
}
