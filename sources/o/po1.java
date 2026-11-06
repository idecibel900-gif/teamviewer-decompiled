package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class po1 implements Function1 {
    public final /* synthetic */ byte m;
    public final qo1 n;

    public /* synthetic */ po1(qo1 qo1Var, byte b) {
        this.m = b;
        this.n = qo1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        qo1 qo1Var = this.n;
        switch (b) {
            case 0:
                h58 h58Var = (h58) obj;
                h58Var.getClass();
                if (h58Var.c()) {
                    return "*";
                }
                oz3 oz3VarB = h58Var.b();
                oz3VarB.getClass();
                String strX = qo1Var.X(oz3VarB);
                if (h58Var.a() == ub8.f2197o) {
                    return strX;
                }
                return h58Var.a() + ' ' + strX;
            default:
                oz3 oz3Var = (oz3) obj;
                oz3Var.getClass();
                return qo1Var.X(oz3Var);
        }
    }
}
