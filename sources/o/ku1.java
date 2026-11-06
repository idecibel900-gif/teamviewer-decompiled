package o;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ku1 extends jc1 {
    public UUID m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ru1 f1304o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku1(ru1 ru1Var, jc1 jc1Var) {
        super(jc1Var);
        this.f1304o = ru1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1304o.g1(null, this);
    }
}
