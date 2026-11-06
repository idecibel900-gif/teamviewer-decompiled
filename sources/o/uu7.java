package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uu7 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ vu7 n;

    public /* synthetic */ uu7(vu7 vu7Var, byte b) {
        this.m = b;
        this.n = vu7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        vu7 vu7Var = this.n;
        switch (b) {
            case 0:
                return new dl3(vu7Var.g);
            default:
                vx4 vx4Var = vu7Var.e;
                return Boolean.valueOf(vx4Var != null ? ((Boolean) vx4Var.b.getValue()).booleanValue() : false);
        }
    }
}
