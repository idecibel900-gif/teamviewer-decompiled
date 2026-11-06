package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r23 implements hw2 {
    public final /* synthetic */ byte m = 2;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1884o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ r23(Function0 function0, Function0 function1, boolean z, v64 v64Var, hw2 hw2Var, boolean z2, fs4 fs4Var, int i) {
        this.p = function0;
        this.r = function1;
        this.n = z;
        this.s = v64Var;
        this.t = hw2Var;
        this.f1884o = z2;
        this.q = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.s;
        Object obj4 = this.t;
        Object obj5 = this.q;
        Object obj6 = this.p;
        Object obj7 = this.r;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(1);
                t23.a((ns1) obj7, this.n, this.f1884o, (Function1) obj3, (Function0) obj6, (fs4) obj5, (String) obj4, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(1);
                nv1.b(this.n, (l33) obj7, this.f1884o, (Function0) obj6, (Function0) obj3, (Function0) obj4, (fs4) obj5, (ux2) obj, iY2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(1);
                zu1.g((Function0) obj6, (Function0) obj7, this.n, (v64) obj3, (hw2) obj4, this.f1884o, (fs4) obj5, (ux2) obj, iY3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iY4 = yo1.Y(1575937);
                yo1.s(this.n, (String) obj4, this.f1884o, (Function0) obj6, (Function0) obj7, (fs4) obj5, (dm7) obj3, (ux2) obj, iY4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY5 = yo1.Y(1);
                wo1.u((eg3) obj7, this.n, (a06) obj6, (dw6) obj5, (iv6) obj4, this.f1884o, (Function1) obj3, (ux2) obj, iY5);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ r23(ns1 ns1Var, boolean z, boolean z2, Function1 function1, Function0 function0, fs4 fs4Var, String str, int i) {
        this.r = ns1Var;
        this.n = z;
        this.f1884o = z2;
        this.s = function1;
        this.p = function0;
        this.q = fs4Var;
        this.t = str;
    }

    public /* synthetic */ r23(eg3 eg3Var, boolean z, a06 a06Var, dw6 dw6Var, iv6 iv6Var, boolean z2, Function1 function1, int i) {
        this.r = eg3Var;
        this.n = z;
        this.p = a06Var;
        this.q = dw6Var;
        this.t = iv6Var;
        this.f1884o = z2;
        this.s = function1;
    }

    public /* synthetic */ r23(boolean z, String str, boolean z2, Function0 function0, Function0 function1, fs4 fs4Var, dm7 dm7Var, int i) {
        this.n = z;
        this.t = str;
        this.f1884o = z2;
        this.p = function0;
        this.r = function1;
        this.q = fs4Var;
        this.s = dm7Var;
    }

    public /* synthetic */ r23(boolean z, l33 l33Var, boolean z2, Function0 function0, Function0 function1, Function0 function2, fs4 fs4Var, int i) {
        this.n = z;
        this.r = l33Var;
        this.f1884o = z2;
        this.p = function0;
        this.s = function1;
        this.t = function2;
        this.q = fs4Var;
    }
}
