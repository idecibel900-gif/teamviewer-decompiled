package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd1 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f883o;
    public final /* synthetic */ String p;

    public /* synthetic */ gd1(String str, Function0 function0, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.p = str;
        this.n = function0;
        this.f883o = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        String str = this.p;
        fs4 fs4Var = this.f883o;
        Function0 function0 = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                kh.e(yo1.Y(1), str, function0, ux2Var, fs4Var);
                break;
            case 1:
                vs1.c(yo1.Y(1), str, function0, ux2Var, fs4Var);
                break;
            case 2:
                wo1.f(yo1.Y(1), str, function0, ux2Var, fs4Var);
                break;
            case 3:
                xo1.o(yo1.Y(1), str, function0, ux2Var, fs4Var);
                break;
            case 4:
                vt1.g(yo1.Y(1), str, function0, ux2Var, fs4Var);
                break;
            case 5:
                ds1.v(yo1.Y(1), str, function0, ux2Var, fs4Var);
                break;
            case 6:
                wo1.r(yo1.Y(1), str, function0, ux2Var, fs4Var);
                break;
            case 7:
                et1.o(yo1.Y(1), str, function0, ux2Var, fs4Var);
                break;
            default:
                h67.d(yo1.Y(1), str, function0, ux2Var, fs4Var);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ gd1(Function0 function0, fs4 fs4Var, String str, int i, byte b) {
        this.m = b;
        this.n = function0;
        this.f883o = fs4Var;
        this.p = str;
    }
}
