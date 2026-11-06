package o;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dx0 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f661o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ dx0(String str, fs4 fs4Var, Function0 function0, Function0 function1, long j, int i) {
        this.p = str;
        this.n = fs4Var;
        this.q = function0;
        this.r = function1;
        this.f661o = j;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(1);
                jx0.d((List) obj5, (l33) obj4, (Function1) obj3, this.n, this.f661o, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(1);
                ep1.j((String) obj5, this.n, (Function0) obj4, (Function0) obj3, this.f661o, (ux2) obj, iY2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(1);
                n67.c((Function0) obj5, this.f661o, this.n, (String) obj4, (String) obj3, (ux2) obj, iY3);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ dx0(List list, l33 l33Var, Function1 function1, fs4 fs4Var, long j, int i) {
        this.p = list;
        this.q = l33Var;
        this.r = function1;
        this.n = fs4Var;
        this.f661o = j;
    }

    public /* synthetic */ dx0(Function0 function0, long j, fs4 fs4Var, String str, String str2, int i) {
        this.p = function0;
        this.f661o = j;
        this.n = fs4Var;
        this.q = str;
        this.r = str2;
    }
}
