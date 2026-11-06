package o;

/* JADX INFO: loaded from: classes.dex */
public final class ip2 extends jc1 {
    public /* synthetic */ Object m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q5 f1087o;
    public Object p;
    public ho2 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip2(q5 q5Var, hc1 hc1Var) {
        super(hc1Var);
        this.f1087o = q5Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.n |= Integer.MIN_VALUE;
        return this.f1087o.c(null, this);
    }
}
