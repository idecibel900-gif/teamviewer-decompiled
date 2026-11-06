package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l80 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f1339o;
    public final /* synthetic */ xy6 p;

    public /* synthetic */ l80(Function0 function0, fs4 fs4Var, xy6 xy6Var, int i, byte b) {
        this.m = b;
        this.n = function0;
        this.f1339o = fs4Var;
        this.p = xy6Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        xy6 xy6Var = this.p;
        fs4 fs4Var = this.f1339o;
        Function0 function0 = this.n;
        ux2 ux2Var = (ux2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ga0.b(function0, fs4Var, xy6Var, ux2Var, yo1.Y(1));
                break;
            default:
                qs1.q(function0, fs4Var, xy6Var, ux2Var, yo1.Y(1));
                break;
        }
        return f88Var;
    }
}
