package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ya4 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ cv7 n;

    public /* synthetic */ ya4(cv7 cv7Var, byte b) {
        this.m = b;
        this.n = cv7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        int i;
        byte b = this.m;
        cv7 cv7Var = this.n;
        switch (b) {
            case 0:
                return cv7Var;
            case 1:
                ce5 ce5Var = cv7Var.a;
                be5 be5Var = xz2.Q;
                ?? Equals = ce5Var.equals(be5Var);
                int i2 = Equals;
                if (cv7Var.b.equals(be5Var)) {
                    i2 = Equals + 1;
                }
                int i3 = i2;
                if (cv7Var.c.equals(be5Var)) {
                    i3 = i2 + 1;
                }
                return Integer.valueOf(i3);
            default:
                if (((Number) cv7Var.e.getValue()).intValue() != 2) {
                    return z06.C;
                }
                yu7[] yu7VarArr = new yu7[2];
                for (int i4 = 0; i4 < 2; i4++) {
                    yu7VarArr[i4] = null;
                }
                ce5 ce5Var2 = cv7Var.a;
                be5 be5Var2 = xz2.Q;
                if (ce5Var2.equals(be5Var2)) {
                    yu7VarArr[0] = yu7.m;
                    i = 1;
                } else {
                    i = 0;
                }
                if (cv7Var.b.equals(be5Var2)) {
                    yu7VarArr[i] = yu7.n;
                    i++;
                }
                if (cv7Var.c.equals(be5Var2)) {
                    yu7VarArr[i] = yu7.f2646o;
                }
                yu7 yu7Var = yu7VarArr[0];
                yu7Var.getClass();
                yu7 yu7Var2 = yu7VarArr[1];
                yu7Var2.getClass();
                return new b48(yu7Var, yu7Var2);
        }
    }
}
