package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zj implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ yo5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ px4 f2709o;

    public /* synthetic */ zj(yo5 yo5Var, px4 px4Var, byte b) {
        this.m = b;
        this.n = yo5Var;
        this.f2709o = px4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.f2709o;
        yo5 yo5Var = this.n;
        byte b2 = 0;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    Object objK = ux2Var.K();
                    aw awVar = e01.a;
                    if (objK == awVar) {
                        objK = new t2((byte) 21);
                        ux2Var.g0(objK);
                    }
                    fs4 fs4VarA = cp6.a(cs4.b, false, (Function1) objK);
                    boolean zH = ux2Var.h(yo5Var);
                    Object objK2 = ux2Var.K();
                    if (zH || objK2 == awVar) {
                        objK2 = new ak(yo5Var, (byte) 0);
                        ux2Var.g0(objK2);
                    }
                    fs4 fs4VarB = pm8.B(fs4VarA, (Function1) objK2);
                    float f = yo5Var.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f != 1.0f) {
                        fs4VarB = di1.u(fs4VarB, 0.0f, 0.0f, f, 0.0f, 0.0f, null, true, 1044475);
                    }
                    hw2 hw2Var = (hw2) px4Var.getValue();
                    Object objK3 = ux2Var.K();
                    if (objK3 == awVar) {
                        objK3 = ei.c;
                        ux2Var.g0(objK3);
                    }
                    do4 do4Var = (do4) objK3;
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarB);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4Var, d82.v, ux2Var);
                    o67.n(yj5VarL, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS, d82.t, ux2Var);
                    hw2Var.invoke(ux2Var, 0);
                    ux2Var.p(true);
                }
                break;
            default:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    j51.l(gk.b.a(Boolean.TRUE), au8.O(1022273628, new zj(yo5Var, px4Var, b2), ux2Var2), ux2Var2, 56);
                }
                break;
        }
        return f88Var;
    }
}
