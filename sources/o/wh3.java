package o;

import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wh3 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f2414o;

    public /* synthetic */ wh3(String str, Function0 function0, byte b) {
        this.m = b;
        this.f2414o = str;
        this.n = function0;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        String str = this.f2414o;
        f88 f88Var = f88.a;
        cs4 cs4Var = cs4.b;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    String str2 = this.f2414o;
                    v67.d(this.n, androidx.compose.ui.platform.a.a(cs4Var, str2), null, false, str2, db8.l, ux2Var, 196608, 12);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    au8.p(this.n, androidx.compose.ui.platform.a.a(cs4Var, str.concat("-confirm")), false, null, null, null, pm8.g, ux2Var2, 805306368, 508);
                }
                break;
            case 2:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    au8.p(this.n, androidx.compose.ui.platform.a.a(cs4Var, str.concat("-cancel")), false, null, null, null, pm8.h, ux2Var3, 805306368, 508);
                }
                break;
            default:
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                } else if (str.length() <= 0) {
                    ux2Var4.W(-112057274);
                    ux2Var4.p(false);
                } else {
                    ux2Var4.W(-112636354);
                    td3.b(lv1.T(R.drawable.ic_close, ux2Var4, 0), m77.z(R.string.close_content_description, ux2Var4), androidx.compose.foundation.layout.b.l(ka0.B(androidx.compose.foundation.b.b(iq8.j(androidx.compose.ui.platform.a.a(cs4Var, "TVTA-searchScreen-input-clear"), sf6.a), false, null, null, this.n, 15), 8.0f), 24.0f), ((rn4) ux2Var4.j(un4.a)).a.s, ux2Var4, 8, 0);
                    ux2Var4.p(false);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ wh3(Function0 function0, String str, byte b) {
        this.m = b;
        this.n = function0;
        this.f2414o = str;
    }
}
