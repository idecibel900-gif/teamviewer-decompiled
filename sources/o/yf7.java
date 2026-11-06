package o;

/* JADX INFO: loaded from: classes2.dex */
public final class yf7 extends jc1 {
    public int m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2604o;
    public final /* synthetic */ l07 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf7(l07 l07Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = l07Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2604o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objB = this.p.B(0, this);
        return objB == ne1.m ? objB : new tc6(objB);
    }
}
