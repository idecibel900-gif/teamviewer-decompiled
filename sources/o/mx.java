package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mx extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f1521o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mx(byte b, Function1 function1, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = b;
        this.f1521o = function1;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Function1 function1 = this.f1521o;
        switch (b) {
            case 0:
                return new mx((byte) 0, function1, hc1Var);
            default:
                return new mx((byte) 1, function1, hc1Var);
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
        return ((mx) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        Function1 function1 = this.f1521o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    this.n = true;
                    Object objInvoke = function1.invoke(this);
                    return objInvoke == ne1Var ? ne1Var : objInvoke;
                }
                if (z) {
                    ct1.a0(obj);
                    return obj;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    this.n = true;
                    if (function1.invoke(this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
        }
    }
}
