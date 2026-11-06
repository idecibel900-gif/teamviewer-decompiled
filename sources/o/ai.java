package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ai implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ px4 n;

    public /* synthetic */ ai(px4 px4Var, byte b) {
        this.m = b;
        this.n = px4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        aw awVar = e01.a;
        cs4 cs4Var = cs4.b;
        px4 px4Var = this.n;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    Object objK = ux2Var.K();
                    if (objK == awVar) {
                        objK = new t2((byte) 17);
                        ux2Var.g0(objK);
                    }
                    g68.d(cp6.a(cs4Var, false, (Function1) objK), (hw2) px4Var.getValue(), ux2Var, 0);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    boolean zF = ux2Var2.f(px4Var);
                    Object objK2 = ux2Var2.K();
                    if (zF || objK2 == awVar) {
                        objK2 = new la(px4Var, (byte) 13);
                        ux2Var2.g0(objK2);
                    }
                    xo1.k((Function0) objK2, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-deviceEditScreen-passwordWarning"), false, null, null, uf0.q, ux2Var2, 1572912, 60);
                }
                break;
            default:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    Object objK3 = ux2Var3.K();
                    if (objK3 == awVar) {
                        objK3 = new ek3((byte) 27);
                        ux2Var3.g0(objK3);
                    }
                    fs4 fs4VarA = cp6.a(cs4Var, false, (Function1) objK3);
                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                    int iHashCode = Long.hashCode(ux2Var3.T);
                    yj5 yj5VarL = ux2Var3.l();
                    fs4 fs4VarS = uf0.s(ux2Var3, fs4VarA);
                    yz0.c.getClass();
                    ux2Var3.a0();
                    if (ux2Var3.S) {
                        ux2Var3.k(LayoutNode.e0);
                    } else {
                        ux2Var3.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var3);
                    o67.n(yj5VarL, d82.u, ux2Var3);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var3);
                    o67.l(ux2Var3);
                    o67.n(fs4VarS, d82.t, ux2Var3);
                    ((hw2) px4Var.getValue()).invoke(ux2Var3, 0);
                    ux2Var3.p(true);
                }
                break;
        }
        return f88Var;
    }
}
