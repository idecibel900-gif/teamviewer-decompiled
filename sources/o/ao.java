package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ao extends yz3 implements hw2 {
    public final /* synthetic */ u18 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f342o;
    public final /* synthetic */ fs4 p;
    public final /* synthetic */ bc2 q;
    public final /* synthetic */ hf2 r;
    public final /* synthetic */ yy0 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ byte u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ao(u18 u18Var, Function1 function1, fs4 fs4Var, bc2 bc2Var, hf2 hf2Var, yy0 yy0Var, int i, int i2) {
        super(2);
        this.n = u18Var;
        this.f342o = function1;
        this.p = fs4Var;
        this.q = bc2Var;
        this.r = hf2Var;
        this.s = yy0Var;
        this.t = i;
        this.u = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        vn4.J(this.n, this.f342o, this.p, this.q, this.r, this.s, (ux2) obj, yo1.Y(this.t | 1), this.u);
        return f88.a;
    }
}
