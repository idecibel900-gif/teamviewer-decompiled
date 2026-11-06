package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qd3 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f1821o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ pw6 q;
    public final /* synthetic */ pd3 r;
    public final /* synthetic */ yy0 s;
    public final /* synthetic */ int t;

    public /* synthetic */ qd3(Function0 function0, fs4 fs4Var, boolean z, pw6 pw6Var, pd3 pd3Var, yy0 yy0Var, int i, byte b) {
        this.m = b;
        this.n = function0;
        this.f1821o = fs4Var;
        this.p = z;
        this.q = pw6Var;
        this.r = pd3Var;
        this.s = yy0Var;
        this.t = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.t;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                xo1.A(this.n, this.f1821o, this.p, this.q, this.r, this.s, (ux2) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                xo1.g(this.n, this.f1821o, this.p, this.q, this.r, this.s, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }
}
