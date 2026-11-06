package o;

/* JADX INFO: loaded from: classes.dex */
public final class a56 extends jc1 {
    public byte m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f300o;
    public final /* synthetic */ g95 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a56(g95 g95Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = g95Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f300o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objK = this.p.K(0, this);
        return objK == ne1.m ? objK : new tc6(objK);
    }
}
