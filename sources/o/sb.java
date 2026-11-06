package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sb extends jc1 {
    public List m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vb f2001o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(vb vbVar, jc1 jc1Var) {
        super(jc1Var);
        this.f2001o = vbVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        List list = vb.D;
        return this.f2001o.Z0(null, this);
    }
}
