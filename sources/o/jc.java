package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jc implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f1147o;
    public final /* synthetic */ fs4 p;
    public final /* synthetic */ int q;

    public /* synthetic */ jc(int i, Function0 function0, fs4 fs4Var, int i2, byte b) {
        this.m = b;
        this.n = i;
        this.f1147o = function0;
        this.p = fs4Var;
        this.q = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.q;
        fs4 fs4Var = this.p;
        Function0 function0 = this.f1147o;
        int i2 = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ka0.m(i2, yo1.Y(i | 1), function0, ux2Var, fs4Var);
                break;
            case 1:
                xo1.z(i2, yo1.Y(i | 1), function0, ux2Var, fs4Var);
                break;
            case 2:
                io1.x(i2, yo1.Y(i | 1), function0, ux2Var, fs4Var);
                break;
            case 3:
                it1.k(i2, yo1.Y(i | 1), function0, ux2Var, fs4Var);
                break;
            case 4:
                n67.f(i2, yo1.Y(i | 1), function0, ux2Var, fs4Var);
                break;
            default:
                o77.b(i2, yo1.Y(i | 1), function0, ux2Var, fs4Var);
                break;
        }
        return f88Var;
    }
}
