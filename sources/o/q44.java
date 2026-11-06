package o;

/* JADX INFO: loaded from: classes.dex */
public final class q44 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ w44 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1803o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q44(w44 w44Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = w44Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1803o |= Integer.MIN_VALUE;
        return this.n.f(0, this);
    }
}
