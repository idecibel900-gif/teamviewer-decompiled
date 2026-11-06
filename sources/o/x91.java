package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x91 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f2495o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ oe8 w;

    public /* synthetic */ x91(boolean z, h71 h71Var, Function1 function1, fs4 fs4Var, Function1 function2, Function1 function3, Function1 function4, Function1 function5, qa1 qa1Var, int i) {
        this.n = z;
        this.v = h71Var;
        this.p = function1;
        this.f2495o = fs4Var;
        this.q = function2;
        this.r = function3;
        this.s = function4;
        this.t = function5;
        this.w = qa1Var;
        this.u = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.u;
        oe8 oe8Var = this.w;
        Object obj3 = this.v;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                im3.f(this.n, (h71) obj3, this.p, this.f2495o, this.q, this.r, this.s, this.t, (qa1) oe8Var, (ux2) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                ep1.k(this.n, this.f2495o, (SupportSession) obj3, this.p, this.q, this.r, this.s, this.t, (xr6) oe8Var, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ x91(boolean z, fs4 fs4Var, SupportSession supportSession, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, xr6 xr6Var, int i) {
        this.n = z;
        this.f2495o = fs4Var;
        this.v = supportSession;
        this.p = function1;
        this.q = function2;
        this.r = function3;
        this.s = function4;
        this.t = function5;
        this.w = xr6Var;
        this.u = i;
    }
}
