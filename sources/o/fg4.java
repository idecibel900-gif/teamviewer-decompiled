package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg4 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ zp7 n;

    public /* synthetic */ fg4(zp7 zp7Var, byte b) {
        this.m = b;
        this.n = zp7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        zp7 zp7Var = this.n;
        switch (b) {
            case 0:
                zp7Var.f();
                break;
            default:
                zp7Var.onCancel();
                break;
        }
        return f88Var;
    }
}
