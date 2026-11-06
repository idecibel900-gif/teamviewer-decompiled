package o;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sd7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ud7 n;

    public /* synthetic */ sd7(ud7 ud7Var, byte b) {
        this.m = b;
        this.n = ud7Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                byte b2 = 1;
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    Object[] objArr = new Object[0];
                    Object objK = ux2Var.K();
                    aw awVar = e01.a;
                    if (objK == awVar) {
                        objK = new jv6((byte) 5);
                        ux2Var.g0(objK);
                    }
                    px4 px4Var = (px4) zu1.L(objArr, (Function0) objK, ux2Var, 48);
                    Object objK2 = ux2Var.K();
                    if (objK2 == awVar) {
                        objK2 = ck3.w(ux2Var);
                        ux2Var.g0(objK2);
                    }
                    me1 me1Var = (me1) objK2;
                    Object objK3 = ux2Var.K();
                    if (objK3 == awVar) {
                        objK3 = new q37();
                        ux2Var.g0(objK3);
                    }
                    q37 q37Var = (q37) objK3;
                    boolean zH = ux2Var.h(me1Var);
                    Object objK4 = ux2Var.K();
                    if (zH || objK4 == awVar) {
                        objK4 = new a67(q37Var, me1Var, b2);
                        ux2Var.g0(objK4);
                    }
                    Function1 function1 = (Function1) objK4;
                    Object objK5 = ux2Var.K();
                    if (objK5 == awVar) {
                        objK5 = new t21(q37Var, (byte) 6);
                        ux2Var.g0(objK5);
                    }
                    ut7.a(au8.O(413581388, new o31(q37Var, this.n, px4Var, function1, (Function0) objK5), ux2Var), ux2Var, 48);
                }
                break;
            default:
                Bundle bundle = (Bundle) obj2;
                ((String) obj).getClass();
                bundle.getClass();
                if (bundle.getBoolean("iap_login_complete")) {
                    this.n.q0.setValue(Boolean.TRUE);
                }
                break;
        }
        return f88Var;
    }
}
