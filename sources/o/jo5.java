package o;

/* JADX INFO: loaded from: classes.dex */
public final class jo5 extends jc1 {
    public ko5 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ko5 f1186o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo5(ko5 ko5Var, jc1 jc1Var) {
        super(jc1Var);
        this.f1186o = ko5Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1186o.a(this);
    }
}
