package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eg4 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ zp7 n;

    public /* synthetic */ eg4(zp7 zp7Var, byte b) {
        this.m = b;
        this.n = zp7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        zp7 zp7Var = this.n;
        switch (b) {
            case 0:
                zp7Var.a(((t65) obj).a, jk0.K);
                break;
            case 1:
                in5 in5Var = (in5) obj;
                zp7Var.d(qs1.T(in5Var, false));
                in5Var.a();
                break;
            default:
                in5 in5Var2 = (in5) obj;
                zp7Var.d(qs1.T(in5Var2, false));
                in5Var2.a();
                break;
        }
        return f88Var;
    }
}
