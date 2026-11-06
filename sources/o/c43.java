package o;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c43 extends og7 implements iw2 {
    public /* synthetic */ List m;
    public /* synthetic */ l67 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e43 f486o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c43(e43 e43Var, hc1 hc1Var) {
        super(3, hc1Var);
        this.f486o = e43Var;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        c43 c43Var = new c43(this.f486o, (hc1) obj3);
        c43Var.m = (List) obj;
        c43Var.n = (l67) obj2;
        return c43Var.invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        List list = this.m;
        l67 l67Var = this.n;
        ct1.a0(obj);
        e43 e43Var = this.f486o;
        Comparator comparatorReversed = e43Var.u;
        if (l67Var != l67.m) {
            comparatorReversed = comparatorReversed.reversed();
        }
        comparatorReversed.getClass();
        return lv0.A0(qf0.K(e43Var.v), lv0.J0(list, comparatorReversed));
    }
}
