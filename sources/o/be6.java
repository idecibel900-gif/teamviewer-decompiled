package o;

import androidx.compose.material3.internal.ripple.RippleNode;

/* JADX INFO: loaded from: classes.dex */
public final class be6 extends og7 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f418o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be6(RippleNode rippleNode, float f, jo joVar, hc1 hc1Var) {
        super(2, hc1Var);
        this.p = rippleNode;
        this.n = f;
        this.q = joVar;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                return new be6((RippleNode) this.p, this.n, (jo) obj2, hc1Var);
            default:
                be6 be6Var = new be6((u18) obj2, hc1Var);
                be6Var.p = obj;
                return be6Var;
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
        }
        return ((be6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        float fP;
        me1 me1Var;
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.q;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.f418o;
                if (!z) {
                    ct1.a0(obj);
                    this.f418o = true;
                    return km.a(((RippleNode) this.p).I, new Float(this.n), (jo) obj2, null, null, this, 12) == ne1Var ? ne1Var : f88Var;
                }
                if (z) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.f418o;
                if (!z2) {
                    ct1.a0(obj);
                    me1 me1Var2 = (me1) this.p;
                    fP = i67.p(me1Var2.getCoroutineContext());
                    me1Var = me1Var2;
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fP = this.n;
                    me1Var = (me1) this.p;
                    ct1.a0(obj);
                }
                while (hm3.u(me1Var)) {
                    z90 z90Var = new z90((u18) obj2, fP, (byte) 3);
                    this.p = me1Var;
                    this.n = fP;
                    this.f418o = true;
                    if (qs1.O(getContext()).a(z90Var, this) == ne1Var) {
                        return ne1Var;
                    }
                }
                return f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be6(u18 u18Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.q = u18Var;
    }
}
