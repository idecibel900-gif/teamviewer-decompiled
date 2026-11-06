package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rk6 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ sk6 n;

    public /* synthetic */ rk6(sk6 sk6Var, byte b) {
        this.m = b;
        this.n = sk6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        sk6 sk6Var = this.n;
        switch (b) {
            case 0:
                return Boolean.valueOf(sk6Var.z);
            default:
                br2 br2Var = sk6Var.f0;
                if (!br2Var.m.z) {
                    return null;
                }
                wq2 wq2VarZ0 = br2Var.Z0();
                if (!wq2VarZ0.a()) {
                    return null;
                }
                if (wq2VarZ0.b()) {
                    return br2Var.X0(null);
                }
                br2 br2VarG = ((lq2) vn4.q0(br2Var).getFocusOwner()).g();
                if (br2VarG != null) {
                    return br2VarG.X0(vn4.o0(br2Var));
                }
                return null;
        }
    }
}
