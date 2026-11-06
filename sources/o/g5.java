package o;

/* JADX INFO: loaded from: classes.dex */
public final class g5 extends jc1 {
    public long m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ jk0 f859o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(jk0 jk0Var, jc1 jc1Var) {
        super(jc1Var);
        this.f859o = jk0Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        Object objH = this.f859o.h(this);
        return objH == ne1.m ? objH : new tc6(objH);
    }
}
