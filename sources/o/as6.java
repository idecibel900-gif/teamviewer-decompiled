package o;

/* JADX INFO: loaded from: classes.dex */
public final class as6 extends jc1 {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ cj3 f356o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as6(cj3 cj3Var, jc1 jc1Var) {
        super(jc1Var);
        this.f356o = cj3Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        Object objN = this.f356o.n(0, this);
        return objN == ne1.m ? objN : new tc6(objN);
    }
}
