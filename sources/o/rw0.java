package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class rw0 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ sw0 f1960o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rw0(sw0 sw0Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1960o = sw0Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        sw0 sw0Var = this.f1960o;
        switch (b) {
            case 0:
                return new rw0(sw0Var, hc1Var, (byte) 0);
            case 1:
                return new rw0(sw0Var, hc1Var, (byte) 1);
            default:
                return new rw0(sw0Var, hc1Var, (byte) 2);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((rw0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        sw0 sw0Var = this.f1960o;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    long jB = ((ee8) xk0.q(sw0Var, b11.t)).b();
                    this.n = true;
                    if (im3.A(jB, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                Function0 function0 = sw0Var.W;
                if (function0 != null) {
                    function0.a();
                }
                if (sw0Var.X) {
                    ((tl5) ((v43) xk0.q(sw0Var, b11.l))).a(0);
                }
                sw0Var.e0 = true;
                n87 n87Var = sw0Var.c0;
                if (n87Var != null) {
                    n87Var.j(null);
                }
                sw0Var.c0 = null;
                sw0Var.b0 = null;
                return f88Var;
            case 1:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    long jB2 = ((ee8) xk0.q(sw0Var, b11.t)).b();
                    this.n = true;
                    if (im3.A(jB2, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                Function0 function1 = sw0Var.W;
                if (function1 != null) {
                    function1.a();
                }
                if (sw0Var.X) {
                    ((tl5) ((v43) xk0.q(sw0Var, b11.l))).a(0);
                }
                sw0Var.l0 = true;
                n87 n87Var2 = sw0Var.j0;
                if (n87Var2 != null) {
                    n87Var2.j(null);
                }
                sw0Var.j0 = null;
                sw0Var.i0 = null;
                return f88Var;
            default:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    long jB3 = ((ee8) xk0.q(sw0Var, b11.t)).b();
                    this.n = true;
                    if (im3.A(jB3, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                Function0 function2 = sw0Var.W;
                if (function2 == null) {
                    return f88Var;
                }
                function2.a();
                return f88Var;
        }
    }
}
