package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class he0 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ie0 n;

    public /* synthetic */ he0(ie0 ie0Var, byte b) {
        this.m = b;
        this.n = ie0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        ie0 ie0Var = this.n;
        switch (b) {
            case 0:
                int i = ie0.H0;
                ie0Var.H0();
                ie0Var.I0();
                break;
            default:
                int i2 = ie0.H0;
                bb5 bb5Var = ie0Var.r0;
                if (bb5Var != null) {
                    bb5Var.D0();
                }
                break;
        }
        return f88Var;
    }
}
