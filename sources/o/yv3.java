package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class yv3 implements Function0 {
    public final /* synthetic */ byte m;
    public final aw3 n;

    public /* synthetic */ yv3(aw3 aw3Var, byte b) {
        this.m = b;
        this.n = aw3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        aw3 aw3Var = this.n;
        switch (b) {
            case 0:
                return new zv3(aw3Var);
            default:
                return aw3Var.A();
        }
    }
}
