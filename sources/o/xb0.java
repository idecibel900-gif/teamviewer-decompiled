package o;

import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xb0 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ yb0 n;

    public /* synthetic */ xb0(yb0 yb0Var, byte b) {
        this.m = b;
        this.n = yb0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        yb0 yb0Var = this.n;
        switch (b) {
            case 0:
                int i = yb0.z0;
                bb5 bb5Var = yb0Var.r0;
                if (bb5Var != null) {
                    bb5Var.G0();
                }
                break;
            case 1:
                int i2 = yb0.z0;
                bb5 bb5Var2 = yb0Var.r0;
                if (bb5Var2 != null) {
                    bb5Var2.G0();
                }
                break;
            default:
                int i3 = yb0.z0;
                d82.t(yb0Var.E(), R.string.tv_toastDeletingFailedItemNotEditable);
                break;
        }
        return f88Var;
    }
}
