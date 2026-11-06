package o;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class qt1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ru1 f1864o;
    public final /* synthetic */ ns1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qt1(ru1 ru1Var, ns1 ns1Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1864o = ru1Var;
        this.p = ns1Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        ns1 ns1Var = this.p;
        ru1 ru1Var = this.f1864o;
        switch (b) {
            case 0:
                return new qt1(ru1Var, ns1Var, hc1Var, (byte) 0);
            default:
                return new qt1(ru1Var, ns1Var, hc1Var, (byte) 1);
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
        return ((qt1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objK1;
        Object value;
        byte b = this.m;
        ns1 ns1Var = this.p;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    long j = ns1Var.a;
                    this.n = true;
                    if (this.f1864o.f1(j, this) == ne1Var) {
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
            default:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    UUID uuid = ns1Var.v;
                    this.n = true;
                    ru1 ru1Var = this.f1864o;
                    if (uuid == null) {
                        l97 l97Var = ru1Var.z;
                        do {
                            value = l97Var.getValue();
                        } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, false, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16777183)));
                    } else {
                        objK1 = ru1Var.k1(uuid, true, true, false, this);
                        if (objK1 != ne1Var) {
                        }
                        if (objK1 == ne1Var) {
                            return ne1Var;
                        }
                    }
                    objK1 = f88Var;
                    if (objK1 == ne1Var) {
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
        }
    }
}
