package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qb extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ vb n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1817o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(vb vbVar, jc1 jc1Var) {
        super(jc1Var);
        this.n = vbVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1817o |= Integer.MIN_VALUE;
        List list = vb.D;
        return this.n.W0(null, this);
    }
}
