package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mb implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f1455o;

    public /* synthetic */ mb(String str, boolean z, byte b) {
        this.m = b;
        this.f1455o = str;
        this.n = z;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        String string;
        byte b = this.m;
        cs4 cs4Var = cs4.b;
        f88 f88Var = f88.a;
        boolean z = this.n;
        String str = this.f1455o;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    ux2Var.W(2094247851);
                    StringBuilder sb = new StringBuilder(str.length() + "/500");
                    if (z) {
                        ux2Var.W(820278132);
                        sb.append(" " + m77.z(R.string.character_limit_reached_text_error, ux2Var));
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(820394413);
                        ux2Var.p(false);
                    }
                    String string2 = sb.toString();
                    ux2Var.p(false);
                    qs7.b(string2, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devices-add-remote-device-via-id-bottom-sheet-description-hint"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 48, 0, 262140);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    if (!z || str.length() >= 3) {
                        ux2Var2.W(-1100055918);
                        StringBuilder sb2 = new StringBuilder(str.length() + "/50");
                        if (z) {
                            ux2Var2.W(1652376811);
                            sb2.append(" " + m77.z(R.string.character_limit_reached_text_error, ux2Var2));
                        } else {
                            ux2Var2.W(-315856256);
                        }
                        ux2Var2.p(false);
                        string = sb2.toString();
                        ux2Var2.p(false);
                    } else {
                        string = to7.m(ux2Var2, -1100171517, R.string.device_name_error_text_least_3_characters, ux2Var2, false);
                    }
                    qs7.b(string, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devices-add-remote-device-via-id-bottom-sheet-device-name-hint"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var2, 48, 0, 262140);
                }
                break;
            case 2:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    ki2 ki2Var = new ki2(z);
                    ux2Var3.W(1316139262);
                    qs7.b(m77.A(ki2Var.a.intValue(), new Object[]{str}, ux2Var3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262142);
                    ux2Var3.p(false);
                }
                break;
            default:
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                } else {
                    String strA = m77.A(R.string.group_dialog_support_text_count, new Object[]{str}, ux2Var4);
                    if (z) {
                        ux2Var4.W(-1418268922);
                        strA = strA + " " + m77.z(R.string.character_limit_reached_text_error, ux2Var4);
                        ux2Var4.p(false);
                    } else {
                        ux2Var4.W(-1418174744);
                        ux2Var4.p(false);
                    }
                    qs7.b(strA, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var4, 0, 0, 262142);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ mb(boolean z, String str, byte b) {
        this.m = b;
        this.n = z;
        this.f1455o = str;
    }
}
