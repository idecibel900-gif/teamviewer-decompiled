package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i5 implements hw2 {
    public final /* synthetic */ byte m = 3;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f1037o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ i5(hw2 hw2Var, Function0 function0, fs4 fs4Var, hw2 hw2Var2, boolean z, np4 np4Var, nd5 nd5Var, int i) {
        this.r = hw2Var;
        this.n = function0;
        this.f1037o = fs4Var;
        this.s = hw2Var2;
        this.p = z;
        this.t = np4Var;
        this.u = nd5Var;
        this.q = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.q;
        Object obj3 = this.u;
        Object obj4 = this.t;
        Object obj5 = this.s;
        Object obj6 = this.n;
        Object obj7 = this.r;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                uf0.a(this.p, (Function0) obj6, (Function0) obj7, (Function0) obj5, this.f1037o, (String) obj4, (xy6) obj3, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                di1.k((xv7) obj7, (Function0) obj6, (cc7) obj5, (cc7) obj4, this.f1037o, this.p, (eq0) obj3, (ux2) obj, iY2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(i | 1);
                im3.g(this.p, (ka1) obj6, (ja1) obj7, (h71) obj5, (Function1) obj4, this.f1037o, (r81) obj3, (ux2) obj, iY3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY4 = yo1.Y(i | 1);
                vp4.b((hw2) obj7, (Function0) obj6, this.f1037o, (hw2) obj5, this.p, (np4) obj4, (nd5) obj3, (ux2) obj, iY4);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ i5(xv7 xv7Var, Function0 function0, cc7 cc7Var, cc7 cc7Var2, fs4 fs4Var, boolean z, eq0 eq0Var, int i) {
        this.r = xv7Var;
        this.n = function0;
        this.s = cc7Var;
        this.t = cc7Var2;
        this.f1037o = fs4Var;
        this.p = z;
        this.u = eq0Var;
        this.q = i;
    }

    public /* synthetic */ i5(boolean z, Function0 function0, Function0 function1, Function0 function2, fs4 fs4Var, String str, xy6 xy6Var, int i) {
        this.p = z;
        this.n = function0;
        this.r = function1;
        this.s = function2;
        this.f1037o = fs4Var;
        this.t = str;
        this.u = xy6Var;
        this.q = i;
    }

    public /* synthetic */ i5(boolean z, ka1 ka1Var, ja1 ja1Var, h71 h71Var, Function1 function1, fs4 fs4Var, r81 r81Var, int i) {
        this.p = z;
        this.n = ka1Var;
        this.r = ja1Var;
        this.s = h71Var;
        this.t = function1;
        this.f1037o = fs4Var;
        this.u = r81Var;
        this.q = i;
    }
}
