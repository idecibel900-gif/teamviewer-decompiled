package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class kw3 implements Function0 {
    public final /* synthetic */ byte m;
    public final lw3 n;

    public /* synthetic */ kw3(lw3 lw3Var, byte b) {
        this.m = b;
        this.n = lw3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        lw3 lw3Var = this.n;
        switch (b) {
            case 0:
                ju5 ju5VarB = lw3Var.B().w().b();
                return ju5VarB == null ? io1.K(lw3Var.B().w(), yl7.p) : ju5VarB;
            default:
                return io1.B(lw3Var, false);
        }
    }
}
