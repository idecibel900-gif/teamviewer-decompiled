package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fg1 extends og7 implements hw2 {
    public boolean m;
    public final /* synthetic */ ze6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f794o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ Function1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg1(Function1 function1, hc1 hc1Var, ze6 ze6Var, boolean z, boolean z2) {
        super(2, hc1Var);
        this.n = ze6Var;
        this.f794o = z;
        this.p = z2;
        this.q = function1;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new fg1(this.q, hc1Var, this.n, this.f794o, this.p);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((fg1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.m;
        if (z) {
            if (z) {
                ct1.a0(obj);
                return obj;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ct1.a0(obj);
        Function1 function1 = this.q;
        ze6 ze6Var = this.n;
        boolean z2 = this.p;
        boolean z3 = this.f794o;
        eg1 eg1Var = new eg1(function1, null, ze6Var, z2, z3);
        this.m = true;
        Object objQ = ze6Var.q(z3, eg1Var, this);
        ne1 ne1Var = ne1.m;
        return objQ == ne1Var ? ne1Var : objQ;
    }
}
