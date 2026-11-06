package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class f24 implements Function1 {
    public final /* synthetic */ byte m;
    public final g24 n;

    public /* synthetic */ f24(g24 g24Var, byte b) {
        this.m = b;
        this.n = g24Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        g24 g24Var = this.n;
        sy4 sy4Var = (sy4) obj;
        switch (b) {
            case 0:
                sy4Var.getClass();
                return g24Var.N(sy4Var);
            default:
                sy4Var.getClass();
                return g24Var.O(sy4Var);
        }
    }
}
