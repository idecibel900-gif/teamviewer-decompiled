package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ij implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f1066o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ nd5 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ short s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ij(Function0 function0, fs4 fs4Var, boolean z, pw6 pw6Var, ng0 ng0Var, nd5 nd5Var, iw2 iw2Var, int i, int i2) {
        this.n = function0;
        this.f1066o = fs4Var;
        this.p = z;
        this.t = pw6Var;
        this.u = ng0Var;
        this.q = nd5Var;
        this.v = iw2Var;
        this.r = i;
        this.s = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.r;
        Object obj3 = this.v;
        Object obj4 = this.u;
        Object obj5 = this.t;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                jj.b((hw2) obj5, this.n, this.f1066o, (hw2) obj4, this.p, (np4) obj3, this.q, (ux2) obj, iY, this.s);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                au8.p(this.n, this.f1066o, this.p, (pw6) obj5, (ng0) obj4, this.q, (iw2) obj3, (ux2) obj, iY2, this.s);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ij(hw2 hw2Var, Function0 function0, fs4 fs4Var, hw2 hw2Var2, boolean z, np4 np4Var, nd5 nd5Var, int i, int i2) {
        this.t = hw2Var;
        this.n = function0;
        this.f1066o = fs4Var;
        this.u = hw2Var2;
        this.p = z;
        this.v = np4Var;
        this.q = nd5Var;
        this.r = i;
        this.s = i2;
    }
}
