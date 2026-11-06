package o;

/* JADX INFO: loaded from: classes.dex */
public final class u33 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ ll2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2162o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u33(ll2 ll2Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = ll2Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2162o |= Integer.MIN_VALUE;
        return this.n.h(this);
    }
}
