package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w4 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2374o;
    public final /* synthetic */ fs4 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ byte r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ w4(Function0 function0, Function0 function1, boolean z, Function1 function2, fs4 fs4Var, d13 d13Var, int i, int i2) {
        this.n = function0;
        this.s = function1;
        this.f2374o = z;
        this.t = function2;
        this.p = fs4Var;
        this.u = d13Var;
        this.q = i;
        this.r = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.q;
        Object obj3 = this.t;
        Object obj4 = this.u;
        Object obj5 = this.s;
        Object obj6 = this.n;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                ka0.a((ga0) obj5, this.f2374o, this.p, (jb4) obj3, (Function0) obj6, (String) obj4, (ux2) obj, iY, this.r);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                vs1.d((Function0) obj6, (Function0) obj5, this.f2374o, (Function1) obj3, this.p, (d13) obj4, (ux2) obj, iY2, this.r);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(i | 1);
                xo1.k((Function0) obj6, this.p, this.f2374o, (pd3) obj5, (pw6) obj3, (hw2) obj4, (ux2) obj, iY3, this.r);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iY4 = yo1.Y(i | 1);
                l47.d((sk7) obj5, this.f2374o, (Function1) obj3, this.p, (String) obj4, (String) obj6, (ux2) obj, iY4, this.r);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY5 = yo1.Y(i | 1);
                v67.d((Function0) obj6, this.p, (pw6) obj5, this.f2374o, (String) obj4, (iw2) obj3, (ux2) obj, iY5, this.r);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ w4(Function0 function0, fs4 fs4Var, pw6 pw6Var, boolean z, String str, iw2 iw2Var, int i, int i2) {
        this.n = function0;
        this.p = fs4Var;
        this.s = pw6Var;
        this.f2374o = z;
        this.u = str;
        this.t = iw2Var;
        this.q = i;
        this.r = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ w4(Function0 function0, fs4 fs4Var, boolean z, pd3 pd3Var, pw6 pw6Var, hw2 hw2Var, int i, int i2) {
        this.n = function0;
        this.p = fs4Var;
        this.f2374o = z;
        this.s = pd3Var;
        this.t = pw6Var;
        this.u = hw2Var;
        this.q = i;
        this.r = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ w4(ga0 ga0Var, boolean z, fs4 fs4Var, jb4 jb4Var, Function0 function0, String str, int i, int i2) {
        this.s = ga0Var;
        this.f2374o = z;
        this.p = fs4Var;
        this.t = jb4Var;
        this.n = function0;
        this.u = str;
        this.q = i;
        this.r = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ w4(sk7 sk7Var, boolean z, Function1 function1, fs4 fs4Var, String str, String str2, int i, int i2) {
        this.s = sk7Var;
        this.f2374o = z;
        this.t = function1;
        this.p = fs4Var;
        this.u = str;
        this.n = str2;
        this.q = i;
        this.r = i2;
    }
}
