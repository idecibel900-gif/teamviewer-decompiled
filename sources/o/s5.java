package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class s5 extends og7 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j6 f1985o;
    public final /* synthetic */ iv6 p;
    public final /* synthetic */ px4 q;
    public final /* synthetic */ Context r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(j6 j6Var, Context context, iv6 iv6Var, px4 px4Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.f1985o = j6Var;
        this.r = context;
        this.p = iv6Var;
        this.q = px4Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new s5(this.f1985o, this.r, this.p, this.q, hc1Var);
            default:
                return new s5(this.f1985o, this.p, this.q, this.r, hc1Var);
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
                return ((s5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            default:
                ((s5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return ne1.m;
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        Context context = this.r;
        px4 px4Var = this.q;
        iv6 iv6Var = this.p;
        j6 j6Var = this.f1985o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    go2 go2VarK = ga0.k(j6Var.x);
                    r5 r5Var = new r5(context, iv6Var, px4Var);
                    this.n = true;
                    if (go2VarK.b(r5Var, this) == ne1Var) {
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
                r36 r36Var = j6Var.z;
                r5 r5Var2 = new r5(iv6Var, px4Var, context);
                this.n = true;
                if (r36Var.m.b(r5Var2, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(j6 j6Var, iv6 iv6Var, px4 px4Var, Context context, hc1 hc1Var) {
        super(2, hc1Var);
        this.f1985o = j6Var;
        this.p = iv6Var;
        this.q = px4Var;
        this.r = context;
    }
}
