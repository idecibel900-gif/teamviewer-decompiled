package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class cn extends yz3 implements hw2 {
    public final /* synthetic */ u18 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f541o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ yy0 s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(u18 u18Var, fs4 fs4Var, Function1 function1, Function1 function2, Function1 function3, yy0 yy0Var, int i) {
        super(2);
        this.n = u18Var;
        this.f541o = fs4Var;
        this.p = function1;
        this.q = function2;
        this.r = function3;
        this.s = yy0Var;
        this.t = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        im3.c(this.n, this.f541o, this.p, this.q, this.r, this.s, (ux2) obj, yo1.Y(this.t | 1));
        return f88.a;
    }
}
