package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class xm6 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ bn6 f2533o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xm6(bn6 bn6Var, String str, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2533o = bn6Var;
        this.p = str;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        String str = this.p;
        bn6 bn6Var = this.f2533o;
        switch (b) {
            case 0:
                return new xm6(bn6Var, str, hc1Var, (byte) 0);
            case 1:
                return new xm6(bn6Var, str, hc1Var, (byte) 1);
            default:
                return new xm6(bn6Var, str, hc1Var, (byte) 2);
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
        return ((xm6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        String str = this.p;
        bn6 bn6Var = this.f2533o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    this.n = true;
                    Serializable serializableX0 = bn6Var.X0(str, this);
                    return serializableX0 == ne1Var ? ne1Var : serializableX0;
                }
                if (z) {
                    ct1.a0(obj);
                    return obj;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    this.n = true;
                    Serializable serializableZ0 = bn6Var.Z0(str, this);
                    return serializableZ0 == ne1Var ? ne1Var : serializableZ0;
                }
                if (z2) {
                    ct1.a0(obj);
                    return obj;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    this.n = true;
                    Serializable serializableA1 = bn6Var.a1(str, this);
                    return serializableA1 == ne1Var ? ne1Var : serializableA1;
                }
                if (z3) {
                    ct1.a0(obj);
                    return obj;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
