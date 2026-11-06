package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gj implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ wx4 f898o;
    public final /* synthetic */ hk6 p;
    public final /* synthetic */ pw6 q;
    public final /* synthetic */ long r;
    public final /* synthetic */ float s;
    public final /* synthetic */ yy0 t;
    public final /* synthetic */ Object u;

    public /* synthetic */ gj(fs4 fs4Var, wx4 wx4Var, Function0 function0, hk6 hk6Var, pw6 pw6Var, long j, float f, yy0 yy0Var, int i) {
        this.n = fs4Var;
        this.f898o = wx4Var;
        this.u = function0;
        this.p = hk6Var;
        this.q = pw6Var;
        this.r = j;
        this.s = f;
        this.t = yy0Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.u;
        switch (b) {
            case 0:
                a72 a72Var = (a72) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    boolean zF = ux2Var.f(a72Var);
                    Object objK = ux2Var.K();
                    if (zF || objK == e01.a) {
                        objK = new y(a72Var, (byte) 5);
                        ux2Var.g0(objK);
                    }
                    vp4.a(this.n, this.f898o, (Function0) objK, this.p, this.q, this.r, this.s, this.t, ux2Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                vp4.a(this.n, this.f898o, (Function0) obj3, this.p, this.q, this.r, this.s, this.t, (ux2) obj, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ gj(fs4 fs4Var, wx4 wx4Var, a72 a72Var, hk6 hk6Var, pw6 pw6Var, long j, float f, yy0 yy0Var) {
        this.n = fs4Var;
        this.f898o = wx4Var;
        this.u = a72Var;
        this.p = hk6Var;
        this.q = pw6Var;
        this.r = j;
        this.s = f;
        this.t = yy0Var;
    }
}
