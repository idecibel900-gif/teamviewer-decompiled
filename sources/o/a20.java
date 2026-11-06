package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a20 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f284o;
    public final /* synthetic */ byte p;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a20(Function0 function0, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = function0;
        this.f284o = fs4Var;
        this.p = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        byte b2 = this.p;
        fs4 fs4Var = this.f284o;
        Function0 function0 = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ka0.c(yo1.Y(b2 | 1), function0, ux2Var, fs4Var);
                break;
            case 1:
                ga0.c(yo1.Y(b2 | 1), function0, ux2Var, fs4Var);
                break;
            case 2:
                g68.b(yo1.Y(b2 | 1), function0, ux2Var, fs4Var);
                break;
            case 3:
                vs1.g(yo1.Y(b2 | 1), function0, ux2Var, fs4Var);
                break;
            case 4:
                qs1.r(yo1.Y(b2 | 1), function0, ux2Var, fs4Var);
                break;
            default:
                ct1.o(yo1.Y(b2 | 1), function0, ux2Var, fs4Var);
                break;
        }
        return f88Var;
    }
}
