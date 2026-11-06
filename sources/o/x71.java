package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x71 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f2486o;

    public /* synthetic */ x71(Function0 function0, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.f2486o = function0;
        this.n = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        fs4 fs4Var = this.n;
        Function0 function0 = this.f2486o;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qf0.d(yo1.Y(7), function0, ux2Var, fs4Var);
                break;
            case 1:
                qf0.l(yo1.Y(7), function0, ux2Var, fs4Var);
                break;
            case 2:
                xo1.b(yo1.Y(49), function0, ux2Var, fs4Var);
                break;
            case 3:
                zu1.l(yo1.Y(1), function0, ux2Var, fs4Var);
                break;
            default:
                xs1.r(yo1.Y(1), function0, ux2Var, fs4Var);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ x71(fs4 fs4Var, Function0 function0, int i, byte b) {
        this.m = b;
        this.n = fs4Var;
        this.f2486o = function0;
    }
}
