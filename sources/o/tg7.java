package o;

/* JADX INFO: loaded from: classes.dex */
public final class tg7 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ ug7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2109o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg7(ug7 ug7Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = ug7Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2109o |= Integer.MIN_VALUE;
        return this.n.h(0L, null, this);
    }
}
