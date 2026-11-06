package o;

/* JADX INFO: loaded from: classes.dex */
public final class vn5 extends jc1 {
    public /* synthetic */ Object m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ em f2332o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn5(em emVar, hc1 hc1Var) {
        super(hc1Var);
        this.f2332o = emVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.n |= Integer.MIN_VALUE;
        return this.f2332o.c(null, this);
    }
}
