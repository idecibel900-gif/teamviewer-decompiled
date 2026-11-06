package o;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma2 implements iw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1453o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ma2(int i, String str, String str2) {
        this.f1453o = i;
        this.n = str;
        this.p = str2;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.f1453o;
        Object obj4 = this.p;
        switch (b) {
            case 0:
                String str = (String) obj4;
                ab0 ab0Var = (ab0) obj;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ab0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ux2Var.f(ab0Var) ? 4 : 2;
                }
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ux2Var.Q();
                } else {
                    cs4 cs4Var = cs4.b;
                    fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    in1 in1Var = ab0Var.a;
                    long j = ab0Var.b;
                    fs4 fs4VarC2 = ka0.C(im3.Z(androidx.compose.foundation.layout.b.f(fs4VarC, r61.d(j) ? in1Var.O(r61.h(j)) : Float.POSITIVE_INFINITY, 0.0f, 2), im3.W(ux2Var), true), 24.0f, 16.0f);
                    kw0 kw0VarA = iw0.a(iq8.e, xz2.B, ux2Var, 54);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarC2);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(kw0VarA, d82.v, ux2Var);
                    o67.n(yj5VarL, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS, d82.t, ux2Var);
                    qs1.l(lv1.T(i, ux2Var, 0), null, null, null, null, 0.0f, null, ux2Var, 56, 124);
                    h72 h72Var = un4.a;
                    ot7 ot7Var = ((rn4) ux2Var.j(h72Var)).b.h;
                    qs7.b(this.n, ka0.F(cs4Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), ((rn4) ux2Var.j(h72Var)).a.q, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ot7Var, ux2Var, 48, 0, 130040);
                    qs7.b(str, ka0.F(cs4Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), ((rn4) ux2Var.j(h72Var)).a.q, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.k, ux2Var, 48, 0, 130040);
                    ux2Var.p(true);
                }
                break;
            default:
                fs4 fs4Var = (fs4) obj4;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((w14) obj).getClass();
                if (!ux2Var2.N(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    ux2Var2.Q();
                } else {
                    yo1.l(this.n, fs4Var, i, ux2Var2, 0);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ ma2(int i, String str, fs4 fs4Var) {
        this.n = str;
        this.p = fs4Var;
        this.f1453o = i;
    }
}
