package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r9 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1903o;

    public /* synthetic */ r9(boolean z, Function0 function0) {
        this.m = (byte) 0;
        this.f1903o = z;
        this.n = function0;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        cs4 cs4Var = cs4.b;
        boolean z = this.f1903o;
        f88 f88Var = f88.a;
        byte b2 = 1;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    v67.d(this.n, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-addGroupAlertDialog-dismiss"), null, !z, null, e8.c, ux2Var, 196656, 20);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    au8.p(this.n, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-deleteGroup-delete"), false, null, null, null, au8.O(-644766698, new v9(b2, z), ux2Var2), ux2Var2, 805306416, 508);
                }
                break;
            default:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    Function0 function0 = this.n;
                    boolean zF = ux2Var3.f(function0);
                    Object objK = ux2Var3.K();
                    if (zF || objK == e01.a) {
                        objK = new yv1(function0, (byte) 23);
                        ux2Var3.g0(objK);
                    }
                    au8.p((Function0) objK, null, this.f1903o, null, null, null, mo8.f, ux2Var3, 805306368, 506);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ r9(byte b, Function0 function0, boolean z) {
        this.m = b;
        this.n = function0;
        this.f1903o = z;
    }
}
