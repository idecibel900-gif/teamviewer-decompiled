package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;

/* JADX INFO: loaded from: classes.dex */
public final class qu6 extends jc1 {
    public SupportSession m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ su6 f1868o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu6(su6 su6Var, jc1 jc1Var) {
        super(jc1Var);
        this.f1868o = su6Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1868o.Z0(null, this);
    }
}
