package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class mr3 extends jc1 {
    public ij1 m;
    public nd n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashMap f1500o;
    public String p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ nd s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr3(nd ndVar, i30 i30Var) {
        super(i30Var);
        this.s = ndVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.n(null, this);
    }
}
