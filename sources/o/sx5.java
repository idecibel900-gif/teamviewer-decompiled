package o;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class sx5 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ tx5 f2064o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx5(tx5 tx5Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2064o = tx5Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        tx5 tx5Var = this.f2064o;
        switch (b) {
            case 0:
                return new sx5(tx5Var, hc1Var, (byte) 0);
            case 1:
                return new sx5(tx5Var, hc1Var, (byte) 1);
            case 2:
                return new sx5(tx5Var, hc1Var, (byte) 2);
            case 3:
                return new sx5(tx5Var, hc1Var, (byte) 3);
            default:
                return new sx5(tx5Var, hc1Var, (byte) 4);
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
            case 2:
                break;
            case 3:
                break;
        }
        return ((sx5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        tx5 tx5Var = this.f2064o;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    yx6 yx6Var = tx5Var.B;
                    this.n = true;
                    if (yx6Var.c(f88Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 1:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    yx6 yx6Var2 = tx5Var.A;
                    this.n = true;
                    if (yx6Var2.c(f88Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 2:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    tx5Var.r.setValue(Boolean.FALSE);
                    yx6 yx6Var3 = tx5Var.y;
                    this.n = true;
                    if (yx6Var3.c(f88Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 3:
                boolean z4 = this.n;
                if (!z4) {
                    ct1.a0(obj);
                    tx5Var.r.setValue(Boolean.FALSE);
                    yx6 yx6Var4 = tx5Var.x;
                    this.n = true;
                    if (yx6Var4.c(f88Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z4) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            default:
                boolean z5 = this.n;
                if (!z5) {
                    ct1.a0(obj);
                    tx5Var.u.setValue(Boolean.FALSE);
                    yx6 yx6Var5 = tx5Var.w;
                    this.n = true;
                    if (yx6Var5.c(f88Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z5) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                UUID uuid = (UUID) tx5Var.t.getValue();
                if (uuid != null) {
                    im3.R(e8.n(tx5Var), null, null, new bj(uuid, tx5Var, (hc1) null, (byte) 16), 3);
                }
                return f88Var;
        }
    }
}
