package o;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xl7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2532o;
    public final /* synthetic */ Object p;

    public /* synthetic */ xl7(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.n = obj;
        this.f2532o = obj2;
        this.p = obj3;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        cs4 cs4Var = cs4.b;
        aw awVar = e01.a;
        f88 f88Var = f88.a;
        Object obj3 = this.p;
        Object obj4 = this.f2532o;
        Object obj5 = this.n;
        byte b2 = 0;
        byte b3 = 1;
        switch (b) {
            case 0:
                ud5 ud5Var = (ud5) obj5;
                Function0 function0 = (Function0) obj4;
                String str = (String) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else if (ud5Var != null) {
                    ux2Var.W(272412766);
                    xo1.k(function0, androidx.compose.ui.platform.a.a(cs4Var, str + "-TVTopAppBarNavigationIcon"), false, null, null, au8.O(-475136024, new uz1(ud5Var, b3), ux2Var), ux2Var, 1572864, 60);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(272412765);
                    ux2Var.p(false);
                }
                break;
            case 1:
                yy0 yy0Var = (yy0) obj5;
                hw2 hw2Var = (hw2) obj4;
                iw2 iw2Var = (iw2) obj3;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    e87 e87VarC0 = xs1.c0(du4.m, ux2Var2);
                    Object objK = ux2Var2.K();
                    if (objK == awVar) {
                        objK = new bn7(e87VarC0);
                        ux2Var2.g0(objK);
                    }
                    bn7 bn7Var = (bn7) objK;
                    fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    List listL = qf0.L(yy0Var, hw2Var, au8.O(-1333331860, new l64(iw2Var, bn7Var, (byte) 27), ux2Var2));
                    Object objK2 = ux2Var2.K();
                    if (objK2 == awVar) {
                        objK2 = new an7(bn7Var);
                        ux2Var2.g0(objK2);
                    }
                    qu4 qu4Var = (qu4) objK2;
                    yy0 yy0VarQ = zu1.q(listL);
                    Object objK3 = ux2Var2.K();
                    if (objK3 == awVar) {
                        objK3 = new ru4(qu4Var);
                        ux2Var2.g0(objK3);
                    }
                    do4 do4Var = (do4) objK3;
                    int iHashCode = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL = ux2Var2.l();
                    fs4 fs4VarS = uf0.s(ux2Var2, fs4VarC);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(LayoutNode.e0);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(do4Var, d82.v, ux2Var2);
                    o67.n(yj5VarL, d82.u, ux2Var2);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                    o67.l(ux2Var2);
                    o67.n(fs4VarS, d82.t, ux2Var2);
                    yy0VarQ.invoke(ux2Var2, 0);
                    ux2Var2.p(true);
                }
                break;
            default:
                sn8 sn8Var = (sn8) obj5;
                c01 c01Var = (c01) obj4;
                yy0 yy0Var2 = (yy0) obj3;
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    AndroidComposeView androidComposeView = sn8Var.m;
                    boolean zH = ux2Var3.h(sn8Var);
                    Object objK4 = ux2Var3.K();
                    hc1 hc1Var = null;
                    if (zH || objK4 == awVar) {
                        objK4 = new rn8(sn8Var, hc1Var, b2);
                        ux2Var3.g0(objK4);
                    }
                    ck3.i(androidComposeView, (hw2) objK4, ux2Var3);
                    boolean zH2 = ux2Var3.h(sn8Var);
                    Object objK5 = ux2Var3.K();
                    if (zH2 || objK5 == awVar) {
                        objK5 = new rn8(sn8Var, hc1Var, b3);
                        ux2Var3.g0(objK5);
                    }
                    ck3.i(androidComposeView, (hw2) objK5, ux2Var3);
                    c01Var.a(androidComposeView, yy0Var2, ux2Var3, 0);
                }
                break;
        }
        return f88Var;
    }
}
