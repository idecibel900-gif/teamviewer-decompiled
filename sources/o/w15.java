package o;

/* JADX INFO: loaded from: classes.dex */
public final class w15 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ x15 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2364o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w15(x15 x15Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = x15Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2364o |= Integer.MIN_VALUE;
        return this.n.b(0L, this);
    }
}
