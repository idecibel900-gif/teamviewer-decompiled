package o;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ex0 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f749o;
    public final /* synthetic */ byte p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ pw2 v;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ex0(List list, String str, fs4 fs4Var, String str2, nd5 nd5Var, pd5 pd5Var, Function1 function1, int i, int i2) {
        this.q = list;
        this.r = str;
        this.n = fs4Var;
        this.s = str2;
        this.t = nd5Var;
        this.u = pd5Var;
        this.v = function1;
        this.f749o = i;
        this.p = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.f749o;
        pw2 pw2Var = this.v;
        Object obj3 = this.u;
        Object obj4 = this.t;
        Object obj5 = this.s;
        Object obj6 = this.r;
        Object obj7 = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                vn4.R((List) obj7, (String) obj6, this.n, (String) obj5, (nd5) obj4, (pd5) obj3, (Function1) pw2Var, (ux2) obj, iY, this.p);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                ct1.j((yy0) obj7, (vt5) obj6, (ut5) obj5, (tt5) obj4, this.n, (Function0) obj3, (Function0) pw2Var, (ux2) obj, iY2, this.p);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ex0(yy0 yy0Var, vt5 vt5Var, ut5 ut5Var, tt5 tt5Var, fs4 fs4Var, Function0 function0, Function0 function1, int i, int i2) {
        this.q = yy0Var;
        this.r = vt5Var;
        this.s = ut5Var;
        this.t = tt5Var;
        this.n = fs4Var;
        this.u = function0;
        this.v = function1;
        this.f749o = i;
        this.p = i2;
    }
}
