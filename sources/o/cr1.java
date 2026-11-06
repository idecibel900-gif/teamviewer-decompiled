package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cr1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ dr1 n;

    public /* synthetic */ cr1(dr1 dr1Var, byte b) {
        this.m = b;
        this.n = dr1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        dr1 dr1Var = this.n;
        switch (b) {
            case 0:
                dr1Var.y0 = true;
                dr1Var.B0();
                break;
            case 1:
                dr1Var.x0 = true;
                break;
            default:
                dr1Var.x0 = false;
                dr1Var.B0();
                break;
        }
        return f88Var;
    }
}
