package o;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class kl4 extends jc1 {
    public UUID m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1278o;
    public final /* synthetic */ xl4 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl4(xl4 xl4Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = xl4Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1278o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objC = this.p.c(null, this);
        return objC == ne1.m ? objC : new tc6(objC);
    }
}
