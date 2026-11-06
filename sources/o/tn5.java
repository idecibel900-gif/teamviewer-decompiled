package o;

/* JADX INFO: loaded from: classes.dex */
public final class tn5 extends jc1 {
    public long m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g95 f2127o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn5(g95 g95Var, jc1 jc1Var) {
        super(jc1Var);
        this.f2127o = g95Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        Object objE = this.f2127o.E(this);
        return objE == ne1.m ? objE : new tc6(objE);
    }
}
