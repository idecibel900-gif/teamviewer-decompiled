package o;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kt4 implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f1302o;

    public /* synthetic */ kt4(List list, Function0 function0, byte b) {
        this.m = b;
        this.n = list;
        this.f1302o = function0;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Function0 function0 = this.f1302o;
        List<tq1> list = this.n;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    us1.h(list, function0, null, ux2Var, 0);
                } else {
                    ux2Var.Q();
                }
                break;
            default:
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((w14) obj).getClass();
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (tq1 tq1Var : list) {
                        fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4.b, 1.0f);
                        sk7 sk7Var = new sk7(y57.g(tq1Var.b), null, new yk7(tq1Var.a), null, 10);
                        boolean zH = ux2Var2.h(tq1Var) | ux2Var2.f(function0);
                        Object objK = ux2Var2.K();
                        if (zH || objK == e01.a) {
                            objK = new ql1(tq1Var, function0, (byte) 20);
                            ux2Var2.g0(objK);
                        }
                        x37.e(sk7Var, fs4VarC, null, (Function0) objK, null, ux2Var2, 48, 52);
                    }
                } else {
                    ux2Var2.Q();
                }
                break;
        }
        return f88Var;
    }
}
