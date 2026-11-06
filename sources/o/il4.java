package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class il4 extends jc1 {
    public List m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1073o;
    public final /* synthetic */ xl4 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il4(xl4 xl4Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = xl4Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1073o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objA = this.p.a(null, this);
        return objA == ne1.m ? objA : new tc6(objA);
    }
}
