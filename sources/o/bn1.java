package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bn1 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    public /* synthetic */ bn1(su6 su6Var, boolean z) {
        this.m = (byte) 3;
        this.n = z;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        long jB;
        byte b = this.m;
        cs4 cs4Var = cs4.b;
        f88 f88Var = f88.a;
        boolean z = this.n;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qs7.b(m77.z(z ? R.string.group_delete_dialog_message : R.string.group_delete_not_empty_dialog_message, ux2Var), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 0, 0, 262142);
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (ux2Var2.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    td3.b(lv1.T(R.drawable.ic_drop_down_menu, ux2Var2, 0), m77.z(R.string.options_menu_content_description, ux2Var2), ka0.D(cs4Var, 8.0f, 0.0f, 2), rv0.b(z ? 1.0f : 0.38f, ((rn4) ux2Var2.j(un4.a)).a.s), ux2Var2, 392, 0);
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
            case 2:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ud5 ud5VarT = lv1.T(R.drawable.ic_connect, ux2Var3, 0);
                    String strZ = m77.z(R.string.connect_content_description, ux2Var3);
                    if (z) {
                        ux2Var3.W(-1628148501);
                        jB = ((rn4) ux2Var3.j(un4.a)).a.a;
                        ux2Var3.p(false);
                    } else {
                        ux2Var3.W(-1628061577);
                        jB = rv0.b(0.38f, ((rn4) ux2Var3.j(un4.a)).a.a);
                        ux2Var3.p(false);
                    }
                    td3.b(ud5VarT, strZ, androidx.compose.foundation.layout.b.l(cs4Var, 24.0f), jB, ux2Var3, 392, 0);
                } else {
                    ux2Var3.Q();
                }
                return f88Var;
            default:
                it6 it6Var = (it6) obj;
                SupportSession supportSession = (SupportSession) obj2;
                it6Var.getClass();
                supportSession.getClass();
                boolean zA1 = su6.a1(supportSession, it6Var.a);
                String str = it6Var.c;
                if (!zA1) {
                    str = null;
                }
                return it6.a(it6Var, supportSession, false, str, null, null, null, null, false, false, false, z && it6Var.k, z && it6Var.l, z && it6Var.m, z && it6Var.n, z && it6Var.f1101o, 1018);
        }
    }

    public /* synthetic */ bn1(byte b, boolean z) {
        this.m = b;
        this.n = z;
    }
}
