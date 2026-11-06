package o;

/* JADX INFO: loaded from: classes.dex */
public final class w31 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ y31 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2370o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w31(y31 y31Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = y31Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2370o |= Integer.MIN_VALUE;
        return this.n.d1(this);
    }
}
