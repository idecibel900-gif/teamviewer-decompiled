package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lr6 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ px4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yr6 f1398o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr6(px4 px4Var, yr6 yr6Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = px4Var;
        this.f1398o = yr6Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        yr6 yr6Var = this.f1398o;
        px4 px4Var = this.n;
        switch (b) {
            case 0:
                return new lr6(px4Var, yr6Var, hc1Var, (byte) 0);
            default:
                return new lr6(px4Var, yr6Var, hc1Var, (byte) 1);
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
                ((lr6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((lr6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        yr6 yr6Var = this.f1398o;
        px4 px4Var = this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                ((Function1) px4Var.getValue()).invoke(yr6Var);
                break;
            default:
                ct1.a0(obj);
                ((Function1) px4Var.getValue()).invoke(yr6Var);
                break;
        }
        return f88Var;
    }
}
