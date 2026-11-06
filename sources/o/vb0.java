package o;

import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vb0 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ wb0 n;

    public /* synthetic */ vb0(wb0 wb0Var, byte b) {
        this.m = b;
        this.n = wb0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        wb0 wb0Var = this.n;
        switch (b) {
            case 0:
                int i = wb0.B0;
                bb5 bb5Var = wb0Var.r0;
                if (bb5Var != null) {
                    bb5Var.G0();
                }
                break;
            case 1:
                int i2 = wb0.B0;
                bb5 bb5Var2 = wb0Var.r0;
                if (bb5Var2 != null) {
                    bb5Var2.G0();
                }
                break;
            default:
                int i3 = wb0.B0;
                d82.t(wb0Var.E(), R.string.tv_toastDeletingFailedItemNotEditable);
                break;
        }
        return f88Var;
    }
}
