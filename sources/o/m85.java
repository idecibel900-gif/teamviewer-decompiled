package o;

/* JADX INFO: loaded from: classes.dex */
public final class m85 extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ n85 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1447o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m85(n85 n85Var, jc1 jc1Var) {
        super(jc1Var);
        this.n = n85Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1447o |= Integer.MIN_VALUE;
        return this.n.a(0L, this);
    }
}
