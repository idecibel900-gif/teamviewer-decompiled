package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ta implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2094o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ta(l33 l33Var, ArrayList arrayList, List list, Function0 function0, Function1 function1, fs4 fs4Var, int i, vb vbVar, int i2) {
        this.m = (byte) 0;
        this.f2094o = l33Var;
        this.p = arrayList;
        this.q = list;
        this.r = function0;
        this.s = function1;
        this.t = fs4Var;
        this.n = i;
        this.u = vbVar;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        int i = this.n;
        Object obj3 = this.u;
        Object obj4 = this.t;
        Object obj5 = this.s;
        Object obj6 = this.r;
        Object obj7 = this.q;
        Object obj8 = this.p;
        f88 f88Var = f88.a;
        Object obj9 = this.f2094o;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(1);
                iq8.a((l33) obj9, (ArrayList) obj8, (List) obj7, (Function0) obj6, (Function1) obj5, (fs4) obj4, this.n, (vb) obj3, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i) | 1;
                ((yy0) obj9).f(this.p, this.q, this.r, this.s, this.t, this.u, (ux2) obj, iY2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ct1.l((yl6) obj9, (zl6) obj8, (el6) obj7, (w44) obj6, (Function1) obj5, (Function1) obj3, (fs4) obj4, (ux2) obj, yo1.Y(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                n67.h((ul7) obj9, (ol7) obj8, (nl7) obj7, (Function0) obj6, (String) obj5, (fs4) obj4, (String) obj3, (ux2) obj, yo1.Y(i | 1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ ta(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, byte b) {
        this.m = b;
        this.f2094o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
        this.s = obj5;
        this.t = obj6;
        this.u = obj7;
        this.n = i;
    }

    public /* synthetic */ ta(yl6 yl6Var, zl6 zl6Var, el6 el6Var, w44 w44Var, Function1 function1, Function1 function2, fs4 fs4Var, int i) {
        this.m = (byte) 2;
        this.f2094o = yl6Var;
        this.p = zl6Var;
        this.q = el6Var;
        this.r = w44Var;
        this.s = function1;
        this.u = function2;
        this.t = fs4Var;
        this.n = i;
    }
}
