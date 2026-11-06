package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yk1 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ i97 n;

    public /* synthetic */ yk1(i97 i97Var, byte b) {
        this.m = b;
        this.n = i97Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        i97 i97Var = this.n;
        switch (b) {
            case 0:
                u52 u52Var = (u52) obj;
                long j = ((rv0) i97Var.getValue()).a;
                if (!z68.a(j, rv0.h)) {
                    u52.k0(u52Var, j, 0L, 0.0f, 126);
                }
                break;
            case 1:
                u52 u52Var2 = (u52) obj;
                u52Var2.getClass();
                u52.k0(u52Var2, ((rv0) i97Var.getValue()).a, 0L, 0.0f, 126);
                break;
            default:
                u52 u52Var3 = (u52) obj;
                u52Var3.getClass();
                u52.k0(u52Var3, ((rv0) i97Var.getValue()).a, 0L, 0.0f, 126);
                break;
        }
        return f88Var;
    }
}
