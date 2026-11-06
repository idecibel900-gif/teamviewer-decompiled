package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jr6 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1196o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ Function0 q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ jr6(boolean z, boolean z2, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fs4 fs4Var, xy6 xy6Var, int i) {
        this.n = z;
        this.f1196o = z2;
        this.p = function0;
        this.q = function1;
        this.r = function2;
        this.s = function3;
        this.t = fs4Var;
        this.u = xy6Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.u;
        Object obj4 = this.t;
        Object obj5 = this.s;
        Object obj6 = this.r;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(1);
                yo1.r(this.n, this.f1196o, this.p, this.q, (Function0) obj6, (Function0) obj5, (fs4) obj4, (xy6) obj3, (ux2) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(1);
                wo1.t(this.n, this.f1196o, (a06) obj6, (dw6) obj5, (iv6) obj4, (String) obj3, this.p, this.q, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ jr6(boolean z, boolean z2, a06 a06Var, dw6 dw6Var, iv6 iv6Var, String str, Function0 function0, Function0 function1, int i) {
        this.n = z;
        this.f1196o = z2;
        this.r = a06Var;
        this.s = dw6Var;
        this.t = iv6Var;
        this.u = str;
        this.p = function0;
        this.q = function1;
    }
}
