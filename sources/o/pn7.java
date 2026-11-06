package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pn7 extends rc6 implements hw2 {
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1754o;
    public final /* synthetic */ me1 p;
    public final /* synthetic */ wr5 q;
    public final /* synthetic */ iw2 r;
    public final /* synthetic */ Function1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn7(me1 me1Var, wr5 wr5Var, iw2 iw2Var, Function1 function1, hc1 hc1Var) {
        super(2, hc1Var);
        this.p = me1Var;
        this.q = wr5Var;
        this.r = iw2Var;
        this.s = function1;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        pn7 pn7Var = new pn7(this.p, this.q, this.r, this.s, hc1Var);
        pn7Var.f1754o = obj;
        return pn7Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((pn7) create((ug7) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.n;
        if (!z) {
            ct1.a0(obj);
            ug7 ug7Var = (ug7) this.f1754o;
            this.n = true;
            Object objG = un7.g(ug7Var, this.p, this.q, this.r, this.s, this);
            ne1 ne1Var = ne1.m;
            if (objG == ne1Var) {
                return ne1Var;
            }
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
        }
        return f88.a;
    }
}
