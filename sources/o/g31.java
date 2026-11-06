package o;

/* JADX INFO: loaded from: classes.dex */
public final class g31 extends jc1 {
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f851o;
    public final /* synthetic */ cr p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g31(cr crVar, jc1 jc1Var) {
        super(jc1Var);
        this.p = crVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f851o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objK = this.p.k(0L, this);
        return objK == ne1.m ? objK : new tc6(objK);
    }
}
