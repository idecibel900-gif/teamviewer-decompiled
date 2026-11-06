package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dg1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f619o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dg1(byte b, Function1 function1, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = b;
        this.f619o = function1;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Function1 function1 = this.f619o;
        switch (b) {
            case 0:
                dg1 dg1Var = new dg1((byte) 0, function1, hc1Var);
                dg1Var.n = obj;
                return dg1Var;
            default:
                dg1 dg1Var2 = new dg1((byte) 1, function1, hc1Var);
                dg1Var2.n = obj;
                return dg1Var2;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        no5 no5Var = (no5) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((dg1) create(no5Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        Function1 function1 = this.f619o;
        ct1.a0(obj);
        no5 no5Var = (no5) this.n;
        switch (b) {
            case 0:
                no5Var.getClass();
                break;
            default:
                no5Var.getClass();
                break;
        }
        return function1.invoke(no5Var.c());
    }
}
