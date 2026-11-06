package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g53 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f861o;
    public final /* synthetic */ int p;

    public /* synthetic */ g53(Function0 function0, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = function0;
        this.f861o = fs4Var;
        this.p = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.p;
        fs4 fs4Var = this.f861o;
        Function0 function0 = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qs1.k(yo1.Y(i | 1), function0, ux2Var, fs4Var);
                break;
            case 1:
                v67.c(yo1.Y(i | 1), function0, ux2Var, fs4Var);
                break;
            default:
                v67.b(yo1.Y(i | 1), function0, ux2Var, fs4Var);
                break;
        }
        return f88Var;
    }
}
