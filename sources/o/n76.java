package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n76 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ j74 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1549o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ c74 q;
    public final /* synthetic */ p74 r;
    public final /* synthetic */ f74 s;
    public final /* synthetic */ fs4 t;
    public final /* synthetic */ int u;

    public /* synthetic */ n76(j74 j74Var, boolean z, Function0 function0, c74 c74Var, p74 p74Var, f74 f74Var, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = j74Var;
        this.f1549o = z;
        this.p = function0;
        this.q = c74Var;
        this.r = p74Var;
        this.s = f74Var;
        this.t = fs4Var;
        this.u = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.u;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                us1.k(this.n, this.f1549o, this.p, this.q, this.r, this.s, this.t, (ux2) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                l47.f(this.n, this.f1549o, this.p, this.q, this.r, this.s, this.t, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }
}
