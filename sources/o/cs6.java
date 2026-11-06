package o;

/* JADX INFO: loaded from: classes.dex */
public final class cs6 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ cj3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f554o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs6(cj3 cj3Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = cj3Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f554o |= Integer.MIN_VALUE;
        Object objA = this.n.A(0, 0, null, null, null, 0, this);
        return objA == ne1.m ? objA : new tc6(objA);
    }
}
