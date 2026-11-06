package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q75 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f1807o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ Function0 q;
    public final /* synthetic */ fs4 r;
    public final /* synthetic */ int s;

    public /* synthetic */ q75(boolean z, Function0 function0, Function0 function1, Function0 function2, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = z;
        this.f1807o = function0;
        this.p = function1;
        this.q = function2;
        this.r = fs4Var;
        this.s = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.s;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                it1.d(this.n, this.f1807o, this.p, this.q, this.r, (ux2) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                vt1.f(this.n, this.f1807o, this.p, this.q, this.r, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }
}
