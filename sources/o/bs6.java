package o;

/* JADX INFO: loaded from: classes.dex */
public final class bs6 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ cj3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f452o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs6(cj3 cj3Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = cj3Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f452o |= Integer.MIN_VALUE;
        Object objW = this.n.w(0, this);
        return objW == ne1.m ? objW : new tc6(objW);
    }
}
