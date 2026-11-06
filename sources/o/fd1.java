package o;

import com.teamviewer.remotecontrolviewlib.activity.CopyrightActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fd1 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ CopyrightActivity n;

    public /* synthetic */ fd1(CopyrightActivity copyrightActivity, byte b) {
        this.m = b;
        this.n = copyrightActivity;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        CopyrightActivity copyrightActivity = this.n;
        byte b2 = 2;
        byte b3 = 1;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int[] iArr = CopyrightActivity.H;
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    ut7.a(au8.O(-1965329508, new fd1(copyrightActivity, b3), ux2Var), ux2Var, 48);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int[] iArr2 = CopyrightActivity.H;
                if (!ux2Var2.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    nv1.g(null, au8.O(-420119712, new fd1(copyrightActivity, b2), ux2Var2), null, null, null, 0, 0L, 0L, null, mo8.d, ux2Var2, 805306416, 509);
                }
                break;
            default:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int[] iArr3 = CopyrightActivity.H;
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    String strZ = m77.z(R.string.tv_options_Copyright, ux2Var3);
                    ud5 ud5VarT = lv1.T(R.drawable.ic_arrow_back, ux2Var3, 0);
                    boolean zH = ux2Var3.h(copyrightActivity);
                    Object objK = ux2Var3.K();
                    if (zH || objK == e01.a) {
                        objK = new zz0(copyrightActivity, (byte) 5);
                        ux2Var3.g0(objK);
                    }
                    x67.c(strZ, (Function0) objK, null, ud5VarT, null, null, null, ux2Var3, 4096, 500);
                }
                break;
        }
        return f88Var;
    }
}
