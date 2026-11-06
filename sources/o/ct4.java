package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct4 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ dt4 n;

    public /* synthetic */ ct4(dt4 dt4Var, byte b) {
        this.m = b;
        this.n = dt4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        dt4 dt4Var = this.n;
        switch (b) {
            case 0:
                dt4Var.w0 = true;
                break;
            case 1:
                dt4Var.w0 = false;
                dt4Var.B0();
                break;
            default:
                zd zdVar = dt4Var.r0;
                if (zdVar != null) {
                    zdVar.O();
                }
                dt4Var.x0 = true;
                dt4Var.B0();
                break;
        }
        return f88Var;
    }
}
