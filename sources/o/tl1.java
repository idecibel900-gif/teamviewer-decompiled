package o;

/* JADX INFO: loaded from: classes.dex */
public final class tl1 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ ul1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2121o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl1(ul1 ul1Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = ul1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2121o |= Integer.MIN_VALUE;
        return this.n.h(null, this);
    }
}
