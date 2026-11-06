package o;

/* JADX INFO: loaded from: classes.dex */
public final class e23 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ j23 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f671o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e23(j23 j23Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = j23Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f671o |= Integer.MIN_VALUE;
        Object objH = this.n.h(null, null, this);
        return objH == ne1.m ? objH : new tc6(objH);
    }
}
