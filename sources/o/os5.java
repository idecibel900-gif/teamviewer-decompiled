package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class os5 implements Function0 {
    public final /* synthetic */ byte m;
    public final ps5 n;

    public /* synthetic */ os5(ps5 ps5Var, byte b) {
        this.m = b;
        this.n = ps5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        ps5 ps5Var = this.n;
        switch (b) {
            case 0:
                return t87.l.c(ps5Var.m);
            default:
                return t87.l.c(ps5Var.n);
        }
    }
}
