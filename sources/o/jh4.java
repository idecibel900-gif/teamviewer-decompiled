package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jh4 extends og7 implements Function1 {
    public final /* synthetic */ kh4 m;
    public final /* synthetic */ qh4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f1165o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh4(kh4 kh4Var, qh4 qh4Var, float f, boolean z, hc1 hc1Var) {
        super(1, hc1Var);
        this.m = kh4Var;
        this.n = qh4Var;
        this.f1165o = f;
        this.p = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f = this.f1165o;
        boolean z = this.p;
        jh4 jh4Var = new jh4(this.m, this.n, f, z, (hc1) obj);
        f88 f88Var = f88.a;
        jh4Var.invokeSuspend(f88Var);
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        ct1.a0(obj);
        qh4 qh4Var = this.n;
        kh4 kh4Var = this.m;
        kh4Var.u.setValue(qh4Var);
        kh4Var.g(this.f1165o);
        kh4Var.d(1);
        kh4Var.f(false);
        if (this.p) {
            kh4Var.x.setValue(Long.MIN_VALUE);
        }
        return f88.a;
    }
}
