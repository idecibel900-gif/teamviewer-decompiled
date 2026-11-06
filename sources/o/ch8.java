package o;

/* JADX INFO: loaded from: classes.dex */
public final class ch8 extends jc1 {
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f527o;
    public final /* synthetic */ wj5 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch8(wj5 wj5Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = wj5Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f527o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objM = this.p.m(null, this);
        return objM == ne1.m ? objM : new tc6(objM);
    }
}
