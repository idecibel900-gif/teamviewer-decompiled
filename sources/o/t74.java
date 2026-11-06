package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t74 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2088o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ hw2 v;

    public /* synthetic */ t74(j74 j74Var, Function0 function0, f74 f74Var, fs4 fs4Var, k74 k74Var, xy6 xy6Var, hw2 hw2Var, hw2 hw2Var2, int i) {
        this.m = (byte) 0;
        this.p = j74Var;
        this.q = function0;
        this.r = f74Var;
        this.n = fs4Var;
        this.s = k74Var;
        this.t = xy6Var;
        this.u = hw2Var;
        this.v = hw2Var2;
        this.f2088o = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        hw2 hw2Var = this.v;
        f88 f88Var = f88.a;
        int i = this.f2088o;
        Object obj3 = this.u;
        Object obj4 = this.t;
        Object obj5 = this.s;
        Object obj6 = this.r;
        Object obj7 = this.q;
        Object obj8 = this.p;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                yo1.j((j74) obj8, (Function0) obj7, (f74) obj6, this.n, (k74) obj5, (xy6) obj4, (hw2) obj3, this.v, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                tu7.b(this.n, (ye5) obj8, (cv7) obj7, (ru7) obj6, (yy0) obj5, (iw2) obj4, (he5) obj3, (yy0) hw2Var, (ux2) obj, iY2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(i | 1);
                tu7.a(this.n, (ye5) obj8, (vx4) obj7, (ru7) obj6, (yy0) obj5, (iw2) obj4, (he5) obj3, (yy0) hw2Var, (ux2) obj, iY3);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ t74(fs4 fs4Var, ye5 ye5Var, Object obj, ru7 ru7Var, yy0 yy0Var, iw2 iw2Var, he5 he5Var, yy0 yy0Var2, int i, byte b) {
        this.m = b;
        this.n = fs4Var;
        this.p = ye5Var;
        this.q = obj;
        this.r = ru7Var;
        this.s = yy0Var;
        this.t = iw2Var;
        this.u = he5Var;
        this.v = yy0Var2;
        this.f2088o = i;
    }
}
