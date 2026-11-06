package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qx5 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ tx5 n;

    public /* synthetic */ qx5(tx5 tx5Var, byte b) {
        this.m = b;
        this.n = tx5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        tx5 tx5Var = this.n;
        switch (b) {
            case 0:
                im3.R(e8.n(tx5Var), null, null, new j81(tx5Var, ((Integer) obj).intValue(), null, (byte) 3), 3);
                break;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    tx5Var.q.setValue(Boolean.TRUE);
                }
                break;
        }
        return f88Var;
    }
}
