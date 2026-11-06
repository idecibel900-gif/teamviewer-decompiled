package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kz2 implements Function1 {
    public final /* synthetic */ byte m;
    public final Function1 n;

    public /* synthetic */ kz2(Function1 function1, byte b) {
        this.m = b;
        this.n = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.m) {
            case 0:
                t47 t47Var = (t47) obj;
                synchronized (v47.c) {
                    j = v47.e;
                    v47.e = 1 + j;
                }
                return new s36(j, t47Var, this.n);
            case 1:
                Function1 function1 = this.n;
                oz3 oz3Var = (oz3) obj;
                oz3Var.getClass();
                return function1.invoke(oz3Var).toString();
            default:
                return this.n.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
