package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class e81 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ px4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f692o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e81(px4 px4Var, boolean z, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = px4Var;
        this.f692o = z;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        boolean z = this.f692o;
        px4 px4Var = this.n;
        switch (b) {
            case 0:
                return new e81(px4Var, z, hc1Var, (byte) 0);
            case 1:
                return new e81(px4Var, z, hc1Var, (byte) 1);
            case 2:
                return new e81(px4Var, z, hc1Var, (byte) 2);
            case 3:
                return new e81(px4Var, z, hc1Var, (byte) 3);
            case 4:
                return new e81(px4Var, z, hc1Var, (byte) 4);
            default:
                return new e81(px4Var, z, hc1Var, (byte) 5);
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
                ((e81) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 1:
                ((e81) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 2:
                ((e81) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 3:
                ((e81) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 4:
                ((e81) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((e81) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        boolean z = this.f692o;
        px4 px4Var = this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                ((Function1) px4Var.getValue()).invoke(Boolean.valueOf(z));
                break;
            case 1:
                ct1.a0(obj);
                ((Function1) px4Var.getValue()).invoke(Boolean.valueOf(z));
                break;
            case 2:
                ct1.a0(obj);
                ((Function1) px4Var.getValue()).invoke(Boolean.valueOf(z));
                break;
            case 3:
                ct1.a0(obj);
                ((Function1) px4Var.getValue()).invoke(Boolean.valueOf(z));
                break;
            case 4:
                ct1.a0(obj);
                ((Function1) px4Var.getValue()).invoke(Boolean.valueOf(z));
                break;
            default:
                ct1.a0(obj);
                ((Function1) px4Var.getValue()).invoke(Boolean.valueOf(z));
                break;
        }
        return f88Var;
    }
}
