package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eq5 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ vx4 n;

    public /* synthetic */ eq5(vx4 vx4Var, byte b) {
        this.m = b;
        this.n = vx4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        vx4 vx4Var = this.n;
        switch (b) {
            case 0:
                return Float.valueOf(vx4Var.a.u.z());
            default:
                return vx4Var.b();
        }
    }
}
