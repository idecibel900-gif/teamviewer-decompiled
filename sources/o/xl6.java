package o;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class xl6 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ bn6 f2531o;
    public final /* synthetic */ Resources p;
    public final /* synthetic */ px4 q;
    public final /* synthetic */ px4 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xl6(bn6 bn6Var, Resources resources, px4 px4Var, px4 px4Var2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2531o = bn6Var;
        this.p = resources;
        this.q = px4Var;
        this.r = px4Var2;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new xl6(this.f2531o, this.p, this.q, this.r, hc1Var, (byte) 0);
            default:
                return new xl6(this.f2531o, this.p, this.q, this.r, hc1Var, (byte) 1);
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
                ((xl6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((xl6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return ne1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        px4 px4Var = this.r;
        px4 px4Var2 = this.q;
        Resources resources = this.p;
        bn6 bn6Var = this.f2531o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                r36 r36Var = bn6Var.x;
                k85 k85Var = new k85(resources, px4Var2, px4Var, (byte) 1);
                this.n = true;
                if (r36Var.m.b(k85Var, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
            default:
                boolean z2 = this.n;
                if (z2) {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                r36 r36Var2 = bn6Var.z;
                k85 k85Var2 = new k85(resources, px4Var2, px4Var, (byte) 2);
                this.n = true;
                if (r36Var2.m.b(k85Var2, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
        }
    }
}
