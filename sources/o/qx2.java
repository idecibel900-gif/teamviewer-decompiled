package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qx2 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ux2 n;

    public /* synthetic */ qx2(ux2 ux2Var, pu4 pu4Var) {
        this.m = (byte) 0;
        this.n = ux2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        ux2 ux2Var = this.n;
        switch (b) {
            case 0:
                ux2Var.B(null, null);
                return f88.a;
            case 1:
                return ux2Var.m();
            default:
                return ux2Var.m();
        }
    }

    public /* synthetic */ qx2(ux2 ux2Var, byte b) {
        this.m = b;
        this.n = ux2Var;
    }
}
