package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j18 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ u18 n;

    public /* synthetic */ j18(u18 u18Var, byte b) {
        this.m = b;
        this.n = u18Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        u18 u18Var = this.n;
        switch (b) {
            case 0:
                return Boolean.valueOf((im3.n(u18Var.d.getValue(), u18Var.a.p0()) && u18Var.h.z() == Long.MIN_VALUE && !((Boolean) u18Var.i.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(u18Var.b());
        }
    }
}
