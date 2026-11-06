package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u71 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f2178o;
    public final /* synthetic */ fs4 p;

    public /* synthetic */ u71(fs4 fs4Var, Function0 function0, Function0 function1, int i) {
        this.m = (byte) 0;
        this.p = fs4Var;
        this.n = function0;
        this.f2178o = function1;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        fs4 fs4Var = this.p;
        Function0 function0 = this.f2178o;
        Function0 function1 = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qf0.e(yo1.Y(7), function1, function0, ux2Var, fs4Var);
                break;
            case 1:
                im3.h(yo1.Y(1), function1, function0, ux2Var, fs4Var);
                break;
            case 2:
                et1.b(yo1.Y(1), function1, function0, ux2Var, fs4Var);
                break;
            case 3:
                o67.b(yo1.Y(1), function1, function0, ux2Var, fs4Var);
                break;
            default:
                x67.a(yo1.Y(1), function1, function0, ux2Var, fs4Var);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ u71(Function0 function0, Function0 function1, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = function0;
        this.f2178o = function1;
        this.p = fs4Var;
    }
}
