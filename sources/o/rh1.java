package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class rh1 extends jc1 {
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Serializable f1922o;
    public k76 p;
    public boolean q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ vh1 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh1(vh1 vh1Var, jc1 jc1Var) {
        super(jc1Var);
        this.t = vh1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.h(false, this);
    }
}
