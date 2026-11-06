package o;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pm6 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f1748o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ fs4 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ short t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pm6(List list, String str, Function1 function1, Function0 function0, fs4 fs4Var, boolean z, String str2, xy6 xy6Var, int i, int i2) {
        this.u = list;
        this.n = str;
        this.f1748o = function1;
        this.p = function0;
        this.q = fs4Var;
        this.r = z;
        this.v = str2;
        this.w = xy6Var;
        this.s = i;
        this.t = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.s;
        Object obj3 = this.w;
        Object obj4 = this.v;
        Object obj5 = this.u;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                et1.k((ql6) obj5, this.n, this.r, this.q, this.f1748o, this.p, (Function0) obj4, (Function0) obj3, (ux2) obj, iY, this.t);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                io1.r((List) obj5, this.n, this.f1748o, this.p, this.q, this.r, (String) obj4, (xy6) obj3, (ux2) obj, iY2, this.t);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pm6(ql6 ql6Var, String str, boolean z, fs4 fs4Var, Function1 function1, Function0 function0, Function0 function2, Function0 function3, int i, int i2) {
        this.u = ql6Var;
        this.n = str;
        this.r = z;
        this.q = fs4Var;
        this.f1748o = function1;
        this.p = function0;
        this.v = function2;
        this.w = function3;
        this.s = i;
        this.t = i2;
    }
}
