package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fb implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f782o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ fb(String str, boolean z, zb1 zb1Var, fs4 fs4Var, iw2 iw2Var, Function0 function0, int i) {
        this.m = (byte) 3;
        this.p = str;
        this.n = z;
        this.q = zb1Var;
        this.t = fs4Var;
        this.r = iw2Var;
        this.s = function0;
        this.f782o = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.f782o;
        Object obj3 = this.r;
        Object obj4 = this.t;
        Object obj5 = this.s;
        Object obj6 = this.q;
        Object obj7 = this.p;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                au8.j((ib) obj7, (hb) obj6, (l33) obj3, this.n, (Function0) obj5, (fs4) obj4, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                di1.j((bp5) obj7, (k08) obj6, (me1) obj3, this.n, (px4) obj5, (yy0) obj4, (ux2) obj, iY2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(i | 1);
                di1.f(this.n, (xv7) obj7, (fs4) obj4, (eq0) obj6, (cc7) obj3, (cc7) obj5, (ux2) obj, iY3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iY4 = yo1.Y(i | 1);
                ec1.c((String) obj7, this.n, (zb1) obj6, (fs4) obj4, (iw2) obj3, (Function0) obj5, (ux2) obj, iY4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iY5 = yo1.Y(i | 1);
                xo1.l((fs4) obj4, (Function0) obj5, this.n, (pw6) obj7, (pd3) obj6, (hw2) obj3, (ux2) obj, iY5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iY6 = yo1.Y(i | 1);
                xo1.t(this.n, (Function1) obj7, (Function0) obj5, (Function0) obj6, (fs4) obj4, (yr1) obj3, (ux2) obj, iY6);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY7 = yo1.Y(i | 1);
                h57.b(this.n, (iv6) obj7, (a06) obj6, (Function0) obj5, (fs4) obj4, (vh8) obj3, (ux2) obj, iY7);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ fb(Object obj, Object obj2, Object obj3, boolean z, Object obj4, Object obj5, int i, byte b) {
        this.m = b;
        this.p = obj;
        this.q = obj2;
        this.r = obj3;
        this.n = z;
        this.s = obj4;
        this.t = obj5;
        this.f782o = i;
    }

    public /* synthetic */ fb(fs4 fs4Var, Function0 function0, boolean z, pw6 pw6Var, pd3 pd3Var, hw2 hw2Var, int i) {
        this.m = (byte) 4;
        this.t = fs4Var;
        this.s = function0;
        this.n = z;
        this.p = pw6Var;
        this.q = pd3Var;
        this.r = hw2Var;
        this.f782o = i;
    }

    public /* synthetic */ fb(boolean z, Function1 function1, Function0 function0, Function0 function2, fs4 fs4Var, yr1 yr1Var, int i) {
        this.m = (byte) 5;
        this.n = z;
        this.p = function1;
        this.s = function0;
        this.q = function2;
        this.t = fs4Var;
        this.r = yr1Var;
        this.f782o = i;
    }

    public /* synthetic */ fb(boolean z, iv6 iv6Var, a06 a06Var, Function0 function0, fs4 fs4Var, vh8 vh8Var, int i) {
        this.m = (byte) 6;
        this.n = z;
        this.p = iv6Var;
        this.q = a06Var;
        this.s = function0;
        this.t = fs4Var;
        this.r = vh8Var;
        this.f782o = i;
    }

    public /* synthetic */ fb(boolean z, xv7 xv7Var, fs4 fs4Var, eq0 eq0Var, cc7 cc7Var, cc7 cc7Var2, int i) {
        this.m = (byte) 2;
        this.n = z;
        this.p = xv7Var;
        this.t = fs4Var;
        this.q = eq0Var;
        this.r = cc7Var;
        this.s = cc7Var2;
        this.f782o = i;
    }
}
