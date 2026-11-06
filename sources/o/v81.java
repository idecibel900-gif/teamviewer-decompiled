package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v81 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ h71 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r81 f2285o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ boolean q;

    public /* synthetic */ v81(h71 h71Var, r81 r81Var, Function0 function0, boolean z, int i, byte b) {
        this.m = b;
        this.n = h71Var;
        this.f2285o = r81Var;
        this.p = function0;
        this.q = z;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(1);
                xk0.c(this.n, this.f2285o, this.p, this.q, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(1);
                xk0.g(this.n, this.f2285o, this.p, this.q, (ux2) obj, iY2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(1);
                xk0.f(this.n, this.f2285o, this.p, this.q, (ux2) obj, iY3);
                break;
        }
        return f88Var;
    }
}
