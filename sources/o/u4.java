package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u4 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2166o;

    public /* synthetic */ u4(pr7 pr7Var, boolean z, int i) {
        this.m = (byte) 2;
        this.f2166o = pr7Var;
        this.n = z;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        byte b = this.m;
        f88 f88Var = f88.a;
        boolean z = this.n;
        Object obj3 = this.f2166o;
        switch (b) {
            case 0:
                ga0 ga0Var = (ga0) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ux2Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ux2Var.U(-110209862, ga0Var.o());
                    hi7 hi7Var = hi7.Size40dp;
                    String strP = z ? ga0Var.p() : null;
                    String strO = z ? ga0Var.o() : null;
                    h72 h72Var = un4.a;
                    b77.d(hi7Var, null, false, null, 0L, 0L, strP, strO, ((rn4) ux2Var.j(h72Var)).a.i, new rv0(((rn4) ux2Var.j(h72Var)).a.h), ux2Var, 6, 126);
                    ux2Var.p(false);
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            case 1:
                ((Integer) obj2).getClass();
                ga0.e(z, (hw2) obj3, (ux2) obj, yo1.Y(1));
                return f88Var;
            case 2:
                ((Integer) obj2).getClass();
                ka0.l((pr7) obj3, z, (ux2) obj, yo1.Y(1));
                return f88Var;
            default:
                ov1 ov1Var = (ov1) obj3;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int iOrdinal = ov1Var.ordinal();
                    if (iOrdinal == 0) {
                        i = R.drawable.ic_groups_chip;
                    } else if (iOrdinal == 1) {
                        i = R.drawable.ic_contacts_chip;
                    } else if (iOrdinal == 2) {
                        i = R.drawable.ic_monitoring_overview_chip;
                    } else {
                        if (iOrdinal != 3) {
                            gk0.s();
                            return null;
                        }
                        i = R.drawable.ic_service_queue_chip;
                    }
                    ud5 ud5VarT = lv1.T(i, ux2Var2, 0);
                    float f = cl2.b;
                    cs4 cs4Var = cs4.b;
                    td3.b(ud5VarT, null, androidx.compose.foundation.layout.b.l(cs4Var, f), 0L, ux2Var2, 56, 8);
                    if (z) {
                        ux2Var2.W(-609954637);
                        fs4 fs4VarF = ka0.F(cs4Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                        int iOrdinal2 = ov1Var.ordinal();
                        if (iOrdinal2 == 0) {
                            i2 = R.string.device_tab_chip_groups;
                        } else if (iOrdinal2 == 1) {
                            i2 = R.string.device_tab_chip_contacts;
                        } else if (iOrdinal2 == 2) {
                            i2 = R.string.device_tab_chip_monitoring_overview;
                        } else {
                            if (iOrdinal2 != 3) {
                                gk0.s();
                                return null;
                            }
                            i2 = R.string.device_tab_chip_service_queue;
                        }
                        qs7.b(m77.z(i2, ux2Var2), fs4VarF, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var2, 48, 0, 262140);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-609764638);
                        ux2Var2.p(false);
                    }
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
        }
    }

    public /* synthetic */ u4(byte b, Object obj, boolean z) {
        this.m = b;
        this.f2166o = obj;
        this.n = z;
    }

    public /* synthetic */ u4(boolean z, hw2 hw2Var, int i) {
        this.m = (byte) 1;
        this.n = z;
        this.f2166o = hw2Var;
    }
}
