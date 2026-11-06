package o;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xv6 implements iw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ iv6 f2553o;
    public final /* synthetic */ me1 p;
    public final /* synthetic */ ul1 q;

    public /* synthetic */ xv6(ul1 ul1Var, boolean z, iv6 iv6Var, me1 me1Var) {
        this.q = ul1Var;
        this.n = z;
        this.f2553o = iv6Var;
        this.p = me1Var;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        Object obj4;
        byte b = this.m;
        f88 f88Var = f88.a;
        ul1 ul1Var = this.q;
        me1 me1Var = this.p;
        iv6 iv6Var = this.f2553o;
        switch (b) {
            case 0:
                xu7 xu7Var = (xu7) obj;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                xu7Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ux2Var.f(xu7Var) : ux2Var.h(xu7Var) ? 4 : 2;
                }
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ux2Var.Q();
                } else {
                    qu7 qu7VarD = ul1Var.d();
                    if (!im3.n((qu7VarD == null || (obj4 = qu7VarD.b) == null) ? null : obj4.toString(), "SCAN_QR")) {
                        ux2Var.W(-690651472);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(-691305913);
                        ne5.a(xu7Var, null, null, null, null, au8.O(1581748421, new xv6(this.n, iv6Var, me1Var, ul1Var), ux2Var), ux2Var, (iIntValue & 14) | 1572864);
                        ux2Var.p(false);
                    }
                }
                break;
            default:
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((tn) obj).getClass();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ux2Var2.Q();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.b.c;
                    kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
                    int iHashCode = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL = ux2Var2.l();
                    fs4 fs4VarS = uf0.s(ux2Var2, fillElement);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(LayoutNode.e0);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(kw0VarA, d82.v, ux2Var2);
                    o67.n(yj5VarL, d82.u, ux2Var2);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                    o67.l(ux2Var2);
                    o67.n(fs4VarS, d82.t, ux2Var2);
                    Function1 function1 = iv6Var.j;
                    Function0 function0 = iv6Var.k;
                    boolean zH = ux2Var2.h(me1Var) | ux2Var2.f(ul1Var);
                    Object objK = ux2Var2.K();
                    if (zH || objK == e01.a) {
                        objK = new rw1(me1Var, ul1Var, (byte) 2);
                        ux2Var2.g0(objK);
                    }
                    xo1.t(this.n, function1, function0, (Function0) objK, null, null, ux2Var2, 0);
                    ux2Var2.p(true);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ xv6(boolean z, iv6 iv6Var, me1 me1Var, ul1 ul1Var) {
        this.n = z;
        this.f2553o = iv6Var;
        this.p = me1Var;
        this.q = ul1Var;
    }
}
