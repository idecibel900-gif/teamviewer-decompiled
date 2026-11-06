package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oj3 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ pj3 n;

    public /* synthetic */ oj3(pj3 pj3Var, byte b) {
        this.m = b;
        this.n = pj3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        pj3 pj3Var = this.n;
        l28 l28Var = (l28) obj;
        switch (b) {
            case 0:
                l28Var.getClass();
                pj3 pj3Var2 = (pj3) l28Var;
                qj8 qj8Var = pj3Var.B;
                if (!im3.n(pj3Var2.A, qj8Var)) {
                    pj3Var2.A = qj8Var;
                    pj3Var2.V0();
                }
                return k28.n;
            default:
                l28Var.getClass();
                pj3Var.A = ((pj3) l28Var).B;
                return Boolean.FALSE;
        }
    }
}
