package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2110o;

    public /* synthetic */ th(long j, Function0 function0, int i) {
        this.n = j;
        this.f2110o = function0;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        long j = this.n;
        f88 f88Var = f88.a;
        Object obj3 = this.f2110o;
        switch (b) {
            case 0:
                fs4 fs4Var = (fs4) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else if (j == 9205357640488583168L) {
                    ux2Var.W(-1243644858);
                    yh.b(fs4Var, ux2Var, 0, 0);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-1244013944);
                    fs4 fs4VarJ = androidx.compose.foundation.layout.b.j(fs4Var, a42.b(j), a42.a(j), 0.0f, 0.0f, 12);
                    do4 do4VarC = ua0.c(xz2.p, false);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarJ);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var);
                    o67.n(yj5VarL, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS, d82.t, ux2Var);
                    yh.b(null, ux2Var, 0, 1);
                    ux2Var.p(true);
                    ux2Var.p(false);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                us1.a(j, (Function0) obj3, (ux2) obj, yo1.Y(1));
                break;
            default:
                String str = (String) obj3;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    td3.b(re3.a((f62) b62.e.getValue(), ux2Var2), str, null, this.n, ux2Var2, 8, 4);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ th(long j, fs4 fs4Var) {
        this.n = j;
        this.f2110o = fs4Var;
    }

    public /* synthetic */ th(String str, long j) {
        this.f2110o = str;
        this.n = j;
    }
}
