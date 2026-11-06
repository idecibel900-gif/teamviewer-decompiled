package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class zy3 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ qi0 n;

    public /* synthetic */ zy3(qi0 qi0Var, byte b) {
        this.m = b;
        this.n = qi0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        qi0 qi0Var = this.n;
        switch (b) {
            case 0:
                qi0Var.cancel();
                break;
            case 1:
                qi0Var.cancel();
                break;
            default:
                qi0Var.cancel();
                break;
        }
        return f88Var;
    }
}
