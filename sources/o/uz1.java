package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uz1 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ud5 n;

    public /* synthetic */ uz1(ud5 ud5Var, byte b) {
        this.m = b;
        this.n = ud5Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    td3.b(this.n, m77.z(R.string.navigation_back_content_description, ux2Var), null, 0L, ux2Var, 8, 12);
                }
                break;
            default:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    td3.b(this.n, null, null, 0L, ux2Var2, 8, 12);
                }
                break;
        }
        return f88Var;
    }
}
