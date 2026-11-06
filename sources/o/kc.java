package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kc implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f1250o;
    public final /* synthetic */ fs4 p;
    public final /* synthetic */ int q;

    public /* synthetic */ kc(boolean z, Function1 function1, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = z;
        this.f1250o = function1;
        this.p = fs4Var;
        this.q = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.q;
        fs4 fs4Var = this.p;
        Function1 function1 = this.f1250o;
        boolean z = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ka0.h(z, function1, fs4Var, ux2Var, yo1.Y(i | 1));
                break;
            case 1:
                xo1.q(z, function1, fs4Var, ux2Var, yo1.Y(i | 1));
                break;
            case 2:
                io1.m(z, function1, fs4Var, ux2Var, yo1.Y(i | 1));
                break;
            case 3:
                it1.c(z, function1, fs4Var, ux2Var, yo1.Y(i | 1));
                break;
            case 4:
                n67.d(z, function1, fs4Var, ux2Var, yo1.Y(i | 1));
                break;
            default:
                o77.a(z, function1, fs4Var, ux2Var, yo1.Y(i | 1));
                break;
        }
        return f88Var;
    }
}
