package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ay6 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ hk6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ qk1 f376o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ jw2 q;
    public final /* synthetic */ j74 r;
    public final /* synthetic */ f74 s;
    public final /* synthetic */ String t;

    public /* synthetic */ ay6(qk1 qk1Var, f74 f74Var, hk6 hk6Var, Function0 function0, jw2 jw2Var, j74 j74Var, String str) {
        this.f376o = qk1Var;
        this.s = f74Var;
        this.n = hk6Var;
        this.p = function0;
        this.q = jw2Var;
        this.r = j74Var;
        this.t = str;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        cs4 cs4Var = cs4.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    qf6 qf6Var = ((rn4) ux2Var.j(un4.a)).c.c;
                    qk1 qk1Var = this.f376o;
                    long j = qk1Var.b;
                    long j2 = qk1Var.c;
                    f74 f74Var = this.s;
                    f74Var.c.getClass();
                    ig7.a(ka0.C(androidx.compose.foundation.layout.b.c(androidx.compose.foundation.layout.b.q(cs4Var, 560.0f, 1), 1.0f), 16.0f, 8.0f), qf6Var, j, j2, 0.0f, 0.0f, au8.O(-56224833, new ay6(this.n, qk1Var, this.p, this.q, this.r, f74Var, this.t), ux2Var), ux2Var, 12582912, 112);
                }
                break;
            default:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
                    int iHashCode = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL = ux2Var2.l();
                    fs4 fs4VarS = uf0.s(ux2Var2, cs4Var);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    boolean z = ux2Var2.S;
                    tg3 tg3Var = LayoutNode.e0;
                    if (z) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    iz0 iz0Var = d82.v;
                    o67.n(kw0VarA, iz0Var, ux2Var2);
                    iz0 iz0Var2 = d82.u;
                    o67.n(yj5VarL, iz0Var2, ux2Var2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    iz0 iz0Var3 = d82.w;
                    o67.n(numValueOf, iz0Var3, ux2Var2);
                    o67.l(ux2Var2);
                    iz0 iz0Var4 = d82.t;
                    o67.n(fs4VarS, iz0Var4, ux2Var2);
                    Object objK = ux2Var2.K();
                    if (objK == e01.a) {
                        objK = ua5.s(ux2Var2);
                    }
                    mw4 mw4Var = (mw4) objK;
                    fs4 fs4VarZ = im3.Z(xk0.u(ug3.a(cs4Var, mw4Var, (xg3) ux2Var2.j(ug3.a)), true, mw4Var).f(new s14(1.0f, false)), this.n, true);
                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                    int iHashCode2 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL2 = ux2Var2.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarZ);
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(do4VarC, iz0Var, ux2Var2);
                    o67.n(yj5VarL2, iz0Var2, ux2Var2);
                    e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
                    o67.n(fs4VarS2, iz0Var4, ux2Var2);
                    this.q.i(this.r, ka0.A(cs4Var, this.s.b.f), ux2Var2, 0);
                    ux2Var2.p(true);
                    fs4 fs4VarC = ka0.C(new z53(xz2.C), 8.0f, 4.0f);
                    pd5 pd5Var = og0.a;
                    au8.p(this.p, fs4VarC, false, null, og0.f(this.f376o.d, ux2Var2), null, au8.O(-472964046, new t20(this.t, b2), ux2Var2), ux2Var2, 805306368, 492);
                    ux2Var2.p(true);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ ay6(hk6 hk6Var, qk1 qk1Var, Function0 function0, jw2 jw2Var, j74 j74Var, f74 f74Var, String str) {
        this.n = hk6Var;
        this.f376o = qk1Var;
        this.p = function0;
        this.q = jw2Var;
        this.r = j74Var;
        this.s = f74Var;
        this.t = str;
    }
}
