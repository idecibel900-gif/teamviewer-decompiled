package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pb extends jc1 {
    public /* synthetic */ Object m;
    public final /* synthetic */ vb n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1721o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(vb vbVar, jc1 jc1Var) {
        super(jc1Var);
        this.n = vbVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.f1721o |= Integer.MIN_VALUE;
        List list = vb.D;
        return this.n.V0(null, this);
    }
}
