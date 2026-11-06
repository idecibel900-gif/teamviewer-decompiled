package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class cw3 implements Function0 {
    public final /* synthetic */ byte m;
    public final ew3 n;

    public /* synthetic */ cw3(ew3 ew3Var, byte b) {
        this.m = b;
        this.n = ew3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        ew3 ew3Var = this.n;
        switch (b) {
            case 0:
                return new dw3(ew3Var);
            default:
                return ew3Var.A();
        }
    }
}
