package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ey implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f750o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ ey(int i, Function1 function1, h71 h71Var, r81 r81Var, fs4 fs4Var, boolean z, boolean z2) {
        this.r = h71Var;
        this.s = r81Var;
        this.n = z;
        this.t = function1;
        this.f750o = fs4Var;
        this.p = z2;
        this.q = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.q;
        Object obj3 = this.t;
        Object obj4 = this.s;
        Object obj5 = this.r;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                db8.a(this.n, this.p, (Function0) obj5, this.f750o, (iy) obj4, (xy6) obj3, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                xk0.e(iY2, (Function1) obj3, (h71) obj5, (r81) obj4, (ux2) obj, this.f750o, this.n, this.p);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(i | 1);
                hh7.b(this.f750o, this.n, this.p, (fh7) obj5, (mw4) obj4, (pw6) obj3, (ux2) obj, iY3);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ ey(fs4 fs4Var, boolean z, boolean z2, fh7 fh7Var, mw4 mw4Var, pw6 pw6Var, int i) {
        this.f750o = fs4Var;
        this.n = z;
        this.p = z2;
        this.r = fh7Var;
        this.s = mw4Var;
        this.t = pw6Var;
        this.q = i;
    }

    public /* synthetic */ ey(boolean z, boolean z2, Function0 function0, fs4 fs4Var, iy iyVar, xy6 xy6Var, int i) {
        this.n = z;
        this.p = z2;
        this.r = function0;
        this.f750o = fs4Var;
        this.s = iyVar;
        this.t = xy6Var;
        this.q = i;
    }
}
