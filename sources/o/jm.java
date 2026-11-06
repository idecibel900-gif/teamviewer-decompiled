package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jm extends og7 implements Function1 {
    public final /* synthetic */ km m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(km kmVar, Object obj, hc1 hc1Var) {
        super(1, hc1Var);
        this.m = kmVar;
        this.n = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jm jmVar = new jm(this.m, this.n, (hc1) obj);
        f88 f88Var = f88.a;
        jmVar.invokeSuspend(f88Var);
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        ct1.a0(obj);
        km kmVar = this.m;
        kmVar.c();
        Object objB = kmVar.b(this.n);
        kmVar.c.n.setValue(objB);
        kmVar.e.setValue(objB);
        return f88.a;
    }
}
