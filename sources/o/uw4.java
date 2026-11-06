package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uw4 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ex4 n;

    public /* synthetic */ uw4(ex4 ex4Var) {
        this.m = (byte) 0;
        this.n = ex4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        ex4 ex4Var = this.n;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                ex4Var.c();
                return f88.a;
            case 1:
                ((r22) obj).getClass();
                return new fc(ex4Var, (byte) 4);
            default:
                ((r22) obj).getClass();
                return new fc(ex4Var, (byte) 5);
        }
    }

    public /* synthetic */ uw4(ex4 ex4Var, qk4 qk4Var, byte b) {
        this.m = b;
        this.n = ex4Var;
    }
}
