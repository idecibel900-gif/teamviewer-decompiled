package o;

import android.content.res.Resources;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ey5 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ tx5 f752o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ Resources q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ Function0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey5(tx5 tx5Var, Function0 function0, Resources resources, Function1 function1, Function0 function2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f752o = tx5Var;
        this.p = function0;
        this.q = resources;
        this.r = function1;
        this.s = function2;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new ey5(this.f752o, this.p, this.q, this.r, this.s, hc1Var, (byte) 0);
            default:
                return new ey5(this.f752o, this.p, this.q, this.r, this.s, hc1Var, (byte) 1);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((ey5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((ey5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return ne1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        tx5 tx5Var = this.f752o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (z) {
                        throw ua5.q(obj);
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var = tx5Var.A;
                dy5 dy5Var = new dy5(this.p, this.q, this.r, this.s, (byte) 0);
                this.n = true;
                yx6Var.b(dy5Var, this);
                return ne1Var;
            default:
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        throw ua5.q(obj);
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var2 = tx5Var.B;
                dy5 dy5Var2 = new dy5(this.p, this.q, this.r, this.s, (byte) 1);
                this.n = true;
                yx6Var2.b(dy5Var2, this);
                return ne1Var;
        }
    }
}
