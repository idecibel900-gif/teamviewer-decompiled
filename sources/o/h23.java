package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;

/* JADX INFO: loaded from: classes.dex */
public final class h23 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h23(boolean z, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 5;
        this.n = z;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = 2;
        switch (this.m) {
            case 0:
                h23 h23Var = new h23(b, hc1Var, (byte) 0);
                h23Var.n = ((Boolean) obj).booleanValue();
                return h23Var;
            case 1:
                h23 h23Var2 = new h23(b, hc1Var, (byte) 1);
                h23Var2.n = ((Boolean) obj).booleanValue();
                return h23Var2;
            case 2:
                h23 h23Var3 = new h23(b, hc1Var, b);
                h23Var3.n = ((Boolean) obj).booleanValue();
                return h23Var3;
            case 3:
                h23 h23Var4 = new h23(b, hc1Var, (byte) 3);
                h23Var4.n = ((Boolean) obj).booleanValue();
                return h23Var4;
            case 4:
                return new h23(b, hc1Var, (byte) 4);
            default:
                return new h23(this.n, hc1Var);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((h23) create(bool, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((h23) create(bool2, (hc1) obj2)).invokeSuspend(f88Var);
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((h23) create(bool3, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((h23) create(bool4, (hc1) obj2)).invokeSuspend(f88Var);
            case 4:
                return ((h23) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                ((h23) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        switch (this.m) {
            case 0:
                boolean z = this.n;
                ct1.a0(obj);
                return Boolean.valueOf(!z);
            case 1:
                boolean z2 = this.n;
                ct1.a0(obj);
                return Boolean.valueOf(!z2);
            case 2:
                boolean z3 = this.n;
                ct1.a0(obj);
                return Boolean.valueOf(!z3);
            case 3:
                boolean z4 = this.n;
                ct1.a0(obj);
                return Boolean.valueOf(z4);
            case 4:
                boolean z5 = this.n;
                if (z5 && !z5) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                while (!n85.b.get()) {
                    this.n = true;
                    Object objA = im3.A(50L, this);
                    ne1 ne1Var = ne1.m;
                    if (objA == ne1Var) {
                        return ne1Var;
                    }
                }
                return Boolean.TRUE;
            default:
                ct1.a0(obj);
                if (this.n) {
                    IStatisticsHandler iStatisticsHandler = ga7.a;
                    ga7.a(px5.z);
                }
                return f88.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h23(int i, hc1 hc1Var, byte b) {
        super(i, hc1Var);
        this.m = b;
    }
}
