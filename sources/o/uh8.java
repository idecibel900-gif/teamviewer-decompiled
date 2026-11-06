package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uh8 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ vh8 n;

    public /* synthetic */ uh8(vh8 vh8Var, byte b) {
        this.m = b;
        this.n = vh8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        hc1 hc1Var = null;
        vh8 vh8Var = this.n;
        switch (b) {
            case 0:
                im3.R(e8.n(vh8Var), null, null, new ys7(vh8Var, ((Boolean) obj).booleanValue(), (hc1) null), 3);
                break;
            default:
                h37 h37Var = (h37) obj;
                h37Var.getClass();
                im3.R(e8.n(vh8Var), null, null, new mf7(vh8Var, h37Var, hc1Var, (byte) 9), 3);
                break;
        }
        return f88Var;
    }
}
