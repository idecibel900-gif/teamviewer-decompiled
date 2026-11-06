package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kr7 extends og7 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kr7(Object obj, hc1 hc1Var, byte b) {
        super(1, hc1Var);
        this.m = b;
        this.n = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.n;
        hc1 hc1Var = (hc1) obj;
        switch (b) {
            case 0:
                new kr7((pr7) obj2, hc1Var, (byte) 0).invokeSuspend(f88Var);
                break;
            case 1:
                new kr7((pr7) obj2, hc1Var, (byte) 1).invokeSuspend(f88Var);
                break;
            case 2:
                new kr7((pr7) obj2, hc1Var, (byte) 2).invokeSuspend(f88Var);
                break;
            case 3:
                new kr7((pr7) obj2, hc1Var, (byte) 3).invokeSuspend(f88Var);
                break;
            default:
                new kr7((km) obj2, hc1Var, (byte) 4).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                ((pr7) obj2).B = false;
                break;
            case 1:
                ct1.a0(obj);
                ((pr7) obj2).c();
                break;
            case 2:
                ct1.a0(obj);
                pr7 pr7Var = (pr7) obj2;
                pr7Var.a(pr7Var.B);
                break;
            case 3:
                ct1.a0(obj);
                ((pr7) obj2).o();
                break;
            default:
                ct1.a0(obj);
                ((km) obj2).c();
                break;
        }
        return f88Var;
    }
}
