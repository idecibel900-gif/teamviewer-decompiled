package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w81 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    public /* synthetic */ w81(int i, byte b) {
        this.m = b;
        this.n = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.n;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    String strZ = m77.z(i, ux2Var);
                    h72 h72Var = un4.a;
                    qs7.b(strZ, null, ((rn4) ux2Var.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var.j(h72Var)).b.j, ux2Var, 0, 24960, 110586);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    td3.b(lv1.T(i, ux2Var2, 0), null, null, ((rn4) ux2Var2.j(un4.a)).a.s, ux2Var2, 56, 4);
                }
                break;
            default:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    td3.b(lv1.T(i, ux2Var3, 0), m77.z(R.string.device_tab_fab_content_description, ux2Var3), androidx.compose.ui.platform.a.a(cs4.b, "TVTA-devices-fab-icon"), 0L, ux2Var3, 392, 8);
                }
                break;
        }
        return f88Var;
    }
}
