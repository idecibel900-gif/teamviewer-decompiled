package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qk0 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f1840o;
    public final /* synthetic */ fs4 p;
    public final /* synthetic */ byte q;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qk0(Function0 function0, Function0 function1, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = function0;
        this.f1840o = function1;
        this.p = fs4Var;
        this.q = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        byte b2 = this.q;
        fs4 fs4Var = this.p;
        Function0 function0 = this.f1840o;
        Function0 function1 = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ck3.b(yo1.Y(b2 | 1), function1, function0, ux2Var, fs4Var);
                break;
            case 1:
                im3.d(yo1.Y(b2 | 1), function1, function0, ux2Var, fs4Var);
                break;
            case 2:
                bt1.n(yo1.Y(b2 | 1), function1, function0, ux2Var, fs4Var);
                break;
            default:
                b77.b(yo1.Y(b2 | 1), function1, function0, ux2Var, fs4Var);
                break;
        }
        return f88Var;
    }
}
