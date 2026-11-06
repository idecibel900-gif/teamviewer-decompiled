package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ub extends jc1 {
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vb f2194o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(vb vbVar, jc1 jc1Var) {
        super(jc1Var);
        this.f2194o = vbVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        List list = vb.D;
        return this.f2194o.c1(null, this);
    }
}
