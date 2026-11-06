package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class be7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f419o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ Function0 q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ fs4 u;
    public final /* synthetic */ Object v;

    public /* synthetic */ be7(boolean z, l33 l33Var, ArrayList arrayList, List list, Function0 function0, Function0 function1, Function1 function2, fs4 fs4Var, xy6 xy6Var, int i) {
        this.m = (byte) 2;
        this.n = z;
        this.f419o = l33Var;
        this.t = arrayList;
        this.s = list;
        this.p = function0;
        this.q = function1;
        this.r = function2;
        this.u = fs4Var;
        this.v = xy6Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.v;
        Object obj4 = this.s;
        Object obj5 = this.t;
        Object obj6 = this.f419o;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(1572865);
                u47.a(this.n, (ce7) obj6, this.p, this.q, this.r, (Function1) obj4, (Function0) obj5, this.u, (jf3) obj3, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(1572865);
                u47.a(this.n, (ce7) obj6, this.p, this.q, this.r, (Function1) obj4, (Function0) obj5, this.u, (jf3) obj3, (ux2) obj, iY2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(1);
                lv1.i(this.n, (l33) obj6, (ArrayList) obj5, (List) obj4, this.p, this.q, this.r, this.u, (xy6) obj3, (ux2) obj, iY3);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ be7(boolean z, ce7 ce7Var, Function0 function0, Function0 function1, Function1 function2, Function1 function3, Function0 function4, fs4 fs4Var, jf3 jf3Var, int i, byte b) {
        this.m = b;
        this.n = z;
        this.f419o = ce7Var;
        this.p = function0;
        this.q = function1;
        this.r = function2;
        this.s = function3;
        this.t = function4;
        this.u = fs4Var;
        this.v = jf3Var;
    }
}
