package o;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pv1 implements hw2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xv1 f1779o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ Function0 q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ vx6 u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ Function0 w;
    public final /* synthetic */ Function1 x;
    public final /* synthetic */ Function1 y;
    public final /* synthetic */ int z;

    public /* synthetic */ pv1(h71 h71Var, xv1 xv1Var, gw1 gw1Var, boolean z, Function0 function0, Function1 function1, Function1 function2, Function1 function3, vx6 vx6Var, Function1 function4, Function1 function5, Function0 function6, Function1 function7, Function0 function8, int i, int i2) {
        this.B = h71Var;
        this.f1779o = xv1Var;
        this.C = gw1Var;
        this.n = z;
        this.p = function0;
        this.r = function1;
        this.s = function2;
        this.t = function3;
        this.u = vx6Var;
        this.v = function4;
        this.x = function5;
        this.q = function6;
        this.y = function7;
        this.w = function8;
        this.z = i;
        this.A = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.A;
        int i2 = this.z;
        Object obj3 = this.C;
        Object obj4 = this.B;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i2 | 1);
                int iY2 = yo1.Y(i);
                io1.c((h71) obj4, this.f1779o, (gw1) obj3, this.n, this.p, this.r, this.s, this.t, this.u, this.v, this.x, this.q, this.y, this.w, (ux2) obj, iY, iY2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(i2 | 1);
                int iY4 = yo1.Y(i);
                io1.d(this.n, (ns1) obj4, this.f1779o, (List) obj3, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, (ux2) obj, iY3, iY4);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ pv1(boolean z, ns1 ns1Var, xv1 xv1Var, List list, Function0 function0, Function0 function1, Function1 function2, Function1 function3, Function1 function4, vx6 vx6Var, Function1 function5, Function0 function6, Function1 function7, Function1 function8, int i, int i2) {
        this.n = z;
        this.B = ns1Var;
        this.f1779o = xv1Var;
        this.C = list;
        this.p = function0;
        this.q = function1;
        this.r = function2;
        this.s = function3;
        this.t = function4;
        this.u = vx6Var;
        this.v = function5;
        this.w = function6;
        this.x = function7;
        this.y = function8;
        this.z = i;
        this.A = i2;
    }
}
