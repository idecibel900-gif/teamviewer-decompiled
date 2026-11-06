package o;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class lq5 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1393o;
    public final /* synthetic */ hw2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq5(hw2 hw2Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = hw2Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        hw2 hw2Var = this.p;
        switch (b) {
            case 0:
                lq5 lq5Var = new lq5(hw2Var, hc1Var, (byte) 0);
                lq5Var.f1393o = obj;
                return lq5Var;
            case 1:
                lq5 lq5Var2 = new lq5(hw2Var, hc1Var, (byte) 1);
                lq5Var2.f1393o = obj;
                return lq5Var2;
            default:
                lq5 lq5Var3 = new lq5(hw2Var, hc1Var, (byte) 2);
                lq5Var3.f1393o = obj;
                return lq5Var3;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((lq5) create((gr5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                return ((lq5) create((gr5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((lq5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        hw2 hw2Var = this.p;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    gr5 gr5Var = (gr5) this.f1393o;
                    this.n = true;
                    obj = hw2Var.invoke(gr5Var, this);
                    if (obj == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                gr5 gr5Var2 = (gr5) obj;
                gr5Var2.getClass();
                ((AtomicBoolean) ((fx4) gr5Var2).b.n).set(true);
                return gr5Var2;
            case 1:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    fx4 fx4Var = new fx4(new LinkedHashMap(((gr5) this.f1393o).a()), false);
                    this.f1393o = fx4Var;
                    this.n = true;
                    return hw2Var.invoke(fx4Var, this) == ne1Var ? ne1Var : fx4Var;
                }
                if (!z2) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fx4 fx4Var2 = (fx4) this.f1393o;
                ct1.a0(obj);
                return fx4Var2;
            default:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    me1 me1Var = (me1) this.f1393o;
                    this.n = true;
                    if (hw2Var.invoke(me1Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
        }
    }
}
