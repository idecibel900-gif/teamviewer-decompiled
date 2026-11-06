package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ic implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1048o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ fs4 s;
    public final /* synthetic */ String t;

    public /* synthetic */ ic(boolean z, boolean z2, Function1 function1, int i, Function0 function0, fs4 fs4Var, String str, int i2, byte b) {
        this.m = b;
        this.n = z;
        this.f1048o = z2;
        this.p = function1;
        this.q = i;
        this.r = function0;
        this.s = fs4Var;
        this.t = str;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(1);
                ka0.b(this.n, this.f1048o, this.p, this.q, this.r, this.s, this.t, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(1);
                xo1.f(this.n, this.f1048o, this.p, this.q, this.r, this.s, this.t, (ux2) obj, iY2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(1);
                io1.q(this.n, this.f1048o, this.p, this.q, this.r, this.s, this.t, (ux2) obj, iY3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iY4 = yo1.Y(1);
                it1.f(this.n, this.f1048o, this.p, this.q, this.r, this.s, this.t, (ux2) obj, iY4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iY5 = yo1.Y(1);
                n67.e(this.n, this.f1048o, this.p, this.q, this.r, this.s, this.t, (ux2) obj, iY5);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY6 = yo1.Y(1);
                o77.d(this.n, this.f1048o, this.p, this.q, this.r, this.s, this.t, (ux2) obj, iY6);
                break;
        }
        return f88Var;
    }
}
