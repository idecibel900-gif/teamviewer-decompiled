package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class bn extends yz3 implements hw2 {
    public final /* synthetic */ u18 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f442o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ yy0 q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(u18 u18Var, Function1 function1, Function1 function2, yy0 yy0Var, int i) {
        super(2);
        this.n = u18Var;
        this.f442o = function1;
        this.p = function2;
        this.q = yy0Var;
        this.r = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        im3.b(this.n, this.f442o, this.p, this.q, (ux2) obj, yo1.Y(this.r | 1));
        return f88.a;
    }
}
