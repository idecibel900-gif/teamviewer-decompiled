package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class j01 implements Function1 {
    public final /* synthetic */ byte m;
    public final ht2 n;

    public /* synthetic */ j01(ht2 ht2Var, byte b) {
        this.m = b;
        this.n = ht2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        ht2 ht2Var = this.n;
        switch (b) {
            case 0:
                up upVar = (up) obj;
                upVar.getClass();
                return upVar.u(ht2Var);
            default:
                ht2 ht2Var2 = (ht2) obj;
                ht2Var2.getClass();
                return Boolean.valueOf(!ht2Var2.d() && ht2Var2.e().equals(ht2Var));
        }
    }
}
