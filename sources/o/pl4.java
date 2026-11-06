package o;

import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class pl4 extends jc1 {
    public UUID m;
    public List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1746o;
    public /* synthetic */ Object p;
    public final /* synthetic */ xl4 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl4(xl4 xl4Var, jc1 jc1Var) {
        super(jc1Var);
        this.q = xl4Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        Object objH = this.q.h(null, null, this);
        return objH == ne1.m ? objH : new tc6(objH);
    }
}
