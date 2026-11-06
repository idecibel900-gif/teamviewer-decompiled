package o;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class za4 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2685o;
    public final /* synthetic */ short p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ za4(String str, Function0 function0, fs4 fs4Var, ud5 ud5Var, List list, String str2, qj8 qj8Var, int i, int i2) {
        this.q = str;
        this.r = function0;
        this.n = fs4Var;
        this.s = ud5Var;
        this.t = list;
        this.u = str2;
        this.v = qj8Var;
        this.f2685o = i;
        this.p = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.f2685o;
        Object obj3 = this.v;
        Object obj4 = this.u;
        Object obj5 = this.t;
        Object obj6 = this.s;
        Object obj7 = this.r;
        Object obj8 = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                et1.f((ye5) obj8, (cv7) obj7, (yy0) obj6, (yy0) obj5, this.n, (iw2) obj4, (he5) obj3, (ux2) obj, iY, this.p);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                x67.c((String) obj8, (Function0) obj7, this.n, (ud5) obj6, (List) obj5, (String) obj4, (qj8) obj3, (ux2) obj, iY2, this.p);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ za4(ye5 ye5Var, cv7 cv7Var, yy0 yy0Var, yy0 yy0Var2, fs4 fs4Var, iw2 iw2Var, he5 he5Var, int i, int i2) {
        this.q = ye5Var;
        this.r = cv7Var;
        this.s = yy0Var;
        this.t = yy0Var2;
        this.n = fs4Var;
        this.u = iw2Var;
        this.v = he5Var;
        this.f2685o = i;
        this.p = i2;
    }
}
