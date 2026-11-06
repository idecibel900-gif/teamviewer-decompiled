package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cu6 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    public /* synthetic */ cu6(Function0 function0, byte b) {
        this.m = b;
        this.n = function0;
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
                    v67.d(this.n, null, null, false, "TVTA-sessionUnavailable-closeSession-close", j51.j, ux2Var, 221184, 14);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    v67.d(this.n, null, null, false, "TVTA-sessionUnavailable-closeSession-close", di1.m, ux2Var2, 221184, 14);
                }
                break;
            case 2:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    v67.d(this.n, null, null, false, null, hm3.l, ux2Var3, 196608, 30);
                }
                break;
            case 3:
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                } else {
                    v67.d(this.n, null, null, false, null, im3.i, ux2Var4, 196608, 30);
                }
                break;
            case 4:
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ux2Var5.Q();
                } else {
                    v67.d(this.n, null, null, false, null, im3.j, ux2Var5, 196608, 30);
                }
                break;
            case 5:
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ux2Var6.Q();
                } else {
                    au8.p(this.n, null, false, null, null, null, db8.q, ux2Var6, 805306368, 510);
                }
                break;
            default:
                ux2 ux2Var7 = (ux2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!ux2Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ux2Var7.Q();
                } else {
                    au8.p(this.n, null, false, null, null, null, db8.r, ux2Var7, 805306368, 510);
                }
                break;
        }
        return f88Var;
    }
}
