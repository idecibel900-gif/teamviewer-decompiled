package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rx5 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ tx5 n;

    public /* synthetic */ rx5(tx5 tx5Var, byte b) {
        this.m = b;
        this.n = tx5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        hc1 hc1Var = null;
        tx5 tx5Var = this.n;
        byte b2 = 3;
        switch (b) {
            case 0:
                im3.R(e8.n(tx5Var), null, null, new ac(tx5Var, hc1Var, (byte) 12), 3);
                break;
            case 1:
                im3.R(e8.n(tx5Var), null, null, new sx5(tx5Var, hc1Var, (byte) 4), 3);
                break;
            case 2:
                im3.R(e8.n(tx5Var), null, null, new sx5(tx5Var, hc1Var, b2), 3);
                break;
            case 3:
                im3.R(e8.n(tx5Var), null, null, new sx5(tx5Var, hc1Var, (byte) 2), 3);
                break;
            case 4:
                im3.R(e8.n(tx5Var), null, null, new sx5(tx5Var, hc1Var, (byte) 1), 3);
                break;
            default:
                im3.R(e8.n(tx5Var), null, null, new sx5(tx5Var, hc1Var, (byte) 0), 3);
                break;
        }
        return f88Var;
    }
}
