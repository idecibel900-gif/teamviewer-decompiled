package o;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ug0 implements hw2 {
    public final /* synthetic */ byte m = 2;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f2210o;
    public final /* synthetic */ int p;
    public final /* synthetic */ short q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ug0(int i, int i2, Function1 function1, ge geVar, li liVar, gw gwVar, ym2 ym2Var, w44 w44Var, fs4 fs4Var, nd5 nd5Var, boolean z) {
        this.f2210o = fs4Var;
        this.r = w44Var;
        this.w = nd5Var;
        this.s = gwVar;
        this.t = geVar;
        this.u = ym2Var;
        this.n = z;
        this.v = liVar;
        this.x = function1;
        this.p = i;
        this.q = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.p;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.v;
        Object obj6 = this.u;
        Object obj7 = this.t;
        Object obj8 = this.s;
        Object obj9 = this.r;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                au8.d((Function0) obj9, this.f2210o, this.n, (pw6) obj8, (ng0) obj7, (sg0) obj6, (d90) obj5, (nd5) obj4, (iw2) obj3, (ux2) obj, iY, this.q);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                t23.c((gl4) obj9, (v23) obj8, (u23) obj7, this.n, (Function1) obj6, this.f2210o, (k33) obj5, (List) obj4, (ns1) obj3, (ux2) obj, iY2, this.q);
                break;
            case 2:
                ge geVar = (ge) obj7;
                li liVar = (li) obj5;
                Function1 function1 = (Function1) obj3;
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(i | 1);
                short s = this.q;
                yo1.i(iY3, s, function1, geVar, liVar, (gw) obj8, (ym2) obj6, (ux2) obj, (w44) obj9, this.f2210o, (nd5) obj4, this.n);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY4 = yo1.Y(i | 1);
                bt1.k(this.n, (Function0) obj9, (Function1) obj8, (Function0) obj7, (ql6) obj6, this.f2210o, (bl6) obj5, (gl4) obj4, (bn6) obj3, (ux2) obj, iY4, this.q);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ug0(Function0 function0, fs4 fs4Var, boolean z, pw6 pw6Var, ng0 ng0Var, sg0 sg0Var, d90 d90Var, nd5 nd5Var, iw2 iw2Var, int i, int i2) {
        this.r = function0;
        this.f2210o = fs4Var;
        this.n = z;
        this.s = pw6Var;
        this.t = ng0Var;
        this.u = sg0Var;
        this.v = d90Var;
        this.w = nd5Var;
        this.x = iw2Var;
        this.p = i;
        this.q = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ug0(gl4 gl4Var, v23 v23Var, u23 u23Var, boolean z, Function1 function1, fs4 fs4Var, k33 k33Var, List list, ns1 ns1Var, int i, int i2) {
        this.r = gl4Var;
        this.s = v23Var;
        this.t = u23Var;
        this.n = z;
        this.u = function1;
        this.f2210o = fs4Var;
        this.v = k33Var;
        this.w = list;
        this.x = ns1Var;
        this.p = i;
        this.q = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ug0(boolean z, Function0 function0, Function1 function1, Function0 function2, ql6 ql6Var, fs4 fs4Var, bl6 bl6Var, gl4 gl4Var, bn6 bn6Var, int i, int i2) {
        this.n = z;
        this.r = function0;
        this.s = function1;
        this.t = function2;
        this.u = ql6Var;
        this.f2210o = fs4Var;
        this.v = bl6Var;
        this.w = gl4Var;
        this.x = bn6Var;
        this.p = i;
        this.q = i2;
    }
}
