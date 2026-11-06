package o;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ug1 extends jc1 {
    public Serializable m;
    public Iterator n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2211o;
    public final /* synthetic */ ir p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug1(ir irVar, jc1 jc1Var) {
        super(jc1Var);
        this.p = irVar;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2211o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.r(null, null, this);
    }
}
