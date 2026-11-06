package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vg0 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f2308o;
    public final /* synthetic */ fs4 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ pw2 v;

    public /* synthetic */ vg0(Function0 function0, fs4 fs4Var, boolean z, pw6 pw6Var, ng0 ng0Var, d90 d90Var, nd5 nd5Var, yy0 yy0Var, int i) {
        this.f2308o = function0;
        this.p = fs4Var;
        this.n = z;
        this.r = pw6Var;
        this.s = ng0Var;
        this.t = d90Var;
        this.u = nd5Var;
        this.v = yy0Var;
        this.q = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.q;
        pw2 pw2Var = this.v;
        Object obj3 = this.u;
        Object obj4 = this.t;
        Object obj5 = this.s;
        Object obj6 = this.r;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                au8.m(this.f2308o, this.p, this.n, (pw6) obj6, (ng0) obj5, (d90) obj4, (nd5) obj3, (yy0) pw2Var, (ux2) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                yo1.h(this.n, (String) obj6, (String) obj5, (oi2) obj4, (ci2) obj3, (Function1) pw2Var, this.f2308o, this.p, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ vg0(boolean z, String str, String str2, oi2 oi2Var, ci2 ci2Var, Function1 function1, Function0 function0, fs4 fs4Var, int i) {
        this.n = z;
        this.r = str;
        this.s = str2;
        this.t = oi2Var;
        this.u = ci2Var;
        this.v = function1;
        this.f2308o = function0;
        this.p = fs4Var;
        this.q = i;
    }
}
