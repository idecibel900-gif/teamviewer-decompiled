package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v9 implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    public /* synthetic */ v9(byte b, boolean z) {
        this.m = b;
        this.n = z;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j;
        byte b = this.m;
        f88 f88Var = f88.a;
        boolean z = this.n;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ux2Var.Q();
                } else if (!z) {
                    ux2Var.W(-1644123451);
                    qs7.b(m77.z(R.string.group_dialog_confirm, ux2Var), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 0, 0, 262142);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-1644425546);
                    st5.a(androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(cs4.b, 16.0f), "TVTA-devicesScreen-addGroupAlertDialog-loading"), 0L, 2.0f, 0L, 0, 0.0f, ux2Var, 390, 58);
                    ux2Var.p(false);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ux2Var2.Q();
                } else {
                    String strZ = m77.z(z ? R.string.group_delete_dialog_confirm : R.string.group_delete_not_empty_dialog_confirm, ux2Var2);
                    if (z) {
                        ux2Var2.W(-1150572995);
                        j = ((rn4) ux2Var2.j(un4.a)).a.w;
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1150488613);
                        j = ((rn4) ux2Var2.j(un4.a)).a.a;
                        ux2Var2.p(false);
                    }
                    qs7.b(strZ, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var2, 0, 0, 262138);
                }
                break;
            default:
                ux2 ux2Var3 = (ux2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ux2Var3.Q();
                } else {
                    w64 w64Var = new w64(z);
                    ux2Var3.W(-1159464242);
                    qs7.b(m77.z(w64Var.a.intValue(), ux2Var3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262142);
                    ux2Var3.p(false);
                }
                break;
        }
        return f88Var;
    }
}
