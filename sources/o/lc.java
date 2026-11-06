package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lc implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f1349o;
    public final /* synthetic */ fs4 p;

    public /* synthetic */ lc(boolean z, Function1 function1, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = z;
        this.f1349o = function1;
        this.p = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        fs4 fs4Var = this.p;
        Function1 function1 = this.f1349o;
        boolean z = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qf0.b(z, function1, fs4Var, ux2Var, yo1.Y(1));
                break;
            case 1:
                io1.g(z, function1, fs4Var, ux2Var, yo1.Y(1));
                break;
            case 2:
                us1.i(z, function1, fs4Var, ux2Var, yo1.Y(1));
                break;
            case 3:
                wo1.o(z, function1, fs4Var, ux2Var, yo1.Y(1));
                break;
            case 4:
                o67.a(z, function1, fs4Var, ux2Var, yo1.Y(1));
                break;
            case 5:
                g57.c(z, function1, fs4Var, ux2Var, yo1.Y(1));
                break;
            default:
                n37.f(z, function1, fs4Var, ux2Var, yo1.Y(1));
                break;
        }
        return f88Var;
    }
}
