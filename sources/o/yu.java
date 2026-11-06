package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class yu extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yu(Function0 function0, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = function0;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Function0 function0 = this.n;
        switch (b) {
            case 0:
                return new yu(function0, hc1Var, (byte) 0);
            default:
                return new yu(function0, hc1Var, (byte) 1);
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
                ((yu) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((yu) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Function0 function0 = this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                function0.a();
                break;
            default:
                ct1.a0(obj);
                function0.a();
                break;
        }
        return f88Var;
    }
}
