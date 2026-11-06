package o;

import android.content.res.Resources;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class cy5 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ tx5 f567o;
    public final /* synthetic */ Resources p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ Function0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy5(tx5 tx5Var, Resources resources, Function1 function1, Function0 function0, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f567o = tx5Var;
        this.p = resources;
        this.q = function1;
        this.r = function0;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new cy5(this.f567o, this.p, this.q, this.r, hc1Var, (byte) 0);
            case 1:
                return new cy5(this.f567o, this.p, this.q, this.r, hc1Var, (byte) 1);
            default:
                return new cy5(this.f567o, this.p, this.q, this.r, hc1Var, (byte) 2);
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
                ((cy5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 1:
                ((cy5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((cy5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return ne1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        Function0 function0 = this.r;
        Function1 function1 = this.q;
        Resources resources = this.p;
        tx5 tx5Var = this.f567o;
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
                yx6 yx6Var = tx5Var.x;
                by5 by5Var = new by5(resources, function1, function0, (byte) 0);
                this.n = true;
                yx6Var.b(by5Var, this);
                return ne1Var;
            case 1:
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        throw ua5.q(obj);
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var2 = tx5Var.y;
                by5 by5Var2 = new by5(resources, function1, function0, (byte) 1);
                this.n = true;
                yx6Var2.b(by5Var2, this);
                return ne1Var;
            default:
                boolean z3 = this.n;
                if (z3) {
                    if (z3) {
                        throw ua5.q(obj);
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var3 = tx5Var.z;
                by5 by5Var3 = new by5(resources, function1, function0, (byte) 2);
                this.n = true;
                yx6Var3.b(by5Var3, this);
                return ne1Var;
        }
    }
}
