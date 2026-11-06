package o;

/* JADX INFO: loaded from: classes.dex */
public final class rr4 extends jc1 {
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1942o;
    public final /* synthetic */ cr p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr4(cr crVar, jc1 jc1Var) {
        super(jc1Var);
        this.p = crVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1942o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objN = this.p.n(null, this);
        return objN == ne1.m ? objN : new tc6(objN);
    }
}
