package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ph1 extends og7 implements Function1 {
    public Throwable m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vh1 f1734o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph1(vh1 vh1Var, hc1 hc1Var) {
        super(1, hc1Var);
        this.f1734o = vh1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new ph1(this.f1734o, (hc1) obj).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        g97 h36Var;
        byte b = this.n;
        vh1 vh1Var = this.f1734o;
        ne1 ne1Var = ne1.m;
        try {
            if (b == 0) {
                ct1.a0(obj);
                this.n = (byte) 1;
                obj = vh1Var.h(true, this);
                if (obj == ne1Var) {
                    return ne1Var;
                }
            } else {
                if (b != 1) {
                    if (b != 2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = this.m;
                    ct1.a0(obj);
                    h36Var = new h36(th, ((Number) obj).intValue());
                    return new vd5(h36Var, Boolean.TRUE);
                }
                ct1.a0(obj);
            }
            h36Var = (g97) obj;
        } catch (Throwable th2) {
            o07 o07VarC = vh1Var.c();
            this.m = th2;
            this.n = (byte) 2;
            Integer numA = o07VarC.a();
            if (numA != ne1Var) {
                obj = numA;
                th = th2;
            }
            return ne1Var;
        }
        return new vd5(h36Var, Boolean.TRUE);
    }
}
