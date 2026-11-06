package o;

/* JADX INFO: loaded from: classes2.dex */
public final class xf7 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ l07 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2512o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf7(l07 l07Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = l07Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f2512o |= Integer.MIN_VALUE;
        Object objY = this.n.y(0, 0, this);
        return objY == ne1.m ? objY : new tc6(objY);
    }
}
