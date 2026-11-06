package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w71 implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2383o;

    public /* synthetic */ w71(boolean z, String str) {
        this.m = (byte) 0;
        this.f2383o = z;
        this.n = str;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        ux2 ux2Var;
        byte b = this.m;
        f88 f88Var = f88.a;
        final boolean z = this.f2383o;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                pr0 pr0Var = kh.V;
                String str = (String) obj4;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((sp2) obj).getClass();
                if (ux2Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    cs4 cs4Var = cs4.b;
                    if (z) {
                        ux2Var2.W(-1739272575);
                        fs4 fs4VarJ = iq8.j(ka0.F(cs4Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), sf6.a(8.0f));
                        h72 h72Var = un4.a;
                        qs7.b(m77.z(R.string.it_is_you, ux2Var2), androidx.compose.ui.platform.a.a(ka0.C(au8.s(fs4VarJ, ((rn4) ux2Var2.j(h72Var)).a.h, pr0Var), 12.0f, 4.0f), "TVTA-devicesScreen-contactInfoScreen-chip-itIsYou"), ((rn4) ux2Var2.j(h72Var)).a.a, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var2.j(h72Var)).b.f952o, ux2Var2, 0, 24960, 110584);
                        ux2Var = ux2Var2;
                        ux2Var.p(false);
                    } else {
                        ux2Var = ux2Var2;
                        ux2Var.W(-1738553189);
                        ux2Var.p(false);
                    }
                    fs4 fs4VarJ2 = iq8.j(cs4Var, sf6.a(8.0f));
                    h72 h72Var2 = un4.a;
                    qs7.b(str, androidx.compose.ui.platform.a.a(ka0.C(au8.s(fs4VarJ2, ((rn4) ux2Var.j(h72Var2)).a.G, pr0Var), 12.0f, 4.0f), "TVTA-devicesScreen-contactInfoScreen-chip-contactType"), ((rn4) ux2Var.j(h72Var2)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var.j(h72Var2)).b.f952o, ux2Var, 0, 24960, 110584);
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
            case 1:
                String str2 = (String) obj4;
                hw2 hw2Var = (hw2) obj;
                ux2 ux2Var3 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                hw2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ux2Var3.h(hw2Var) ? 4 : 2;
                }
                if (ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    cs4 cs4Var2 = cs4.b;
                    fs4 fs4VarL = androidx.compose.foundation.layout.b.l(cs4Var2, 0.0f);
                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                    int iHashCode = Long.hashCode(ux2Var3.T);
                    yj5 yj5VarL = ux2Var3.l();
                    fs4 fs4VarS = uf0.s(ux2Var3, fs4VarL);
                    yz0.c.getClass();
                    ux2Var3.a0();
                    boolean z2 = ux2Var3.S;
                    Function0 function0 = LayoutNode.e0;
                    if (z2) {
                        ux2Var3.k(function0);
                    } else {
                        ux2Var3.j0();
                    }
                    iz0 iz0Var = d82.v;
                    o67.n(do4VarC, iz0Var, ux2Var3);
                    iz0 iz0Var2 = d82.u;
                    o67.n(yj5VarL, iz0Var2, ux2Var3);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    iz0 iz0Var3 = d82.w;
                    o67.n(numValueOf, iz0Var3, ux2Var3);
                    o67.l(ux2Var3);
                    iz0 iz0Var4 = d82.t;
                    o67.n(fs4VarS, iz0Var4, ux2Var3);
                    hw2Var.invoke(ux2Var3, Integer.valueOf(iIntValue2 & 14));
                    ux2Var3.p(true);
                    dg6 dg6VarA = cg6.a(new ew(16.0f, new ar(xz2.B, (byte) 1)), xz2.x, ux2Var3, 6);
                    int iHashCode2 = Long.hashCode(ux2Var3.T);
                    yj5 yj5VarL2 = ux2Var3.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var3, cs4Var2);
                    ux2Var3.a0();
                    if (ux2Var3.S) {
                        ux2Var3.k(function0);
                    } else {
                        ux2Var3.j0();
                    }
                    o67.n(dg6VarA, iz0Var, ux2Var3);
                    o67.n(yj5VarL2, iz0Var2, ux2Var3);
                    e41.r(iHashCode2, ux2Var3, iz0Var3, ux2Var3);
                    o67.n(fs4VarS2, iz0Var4, ux2Var3);
                    ux2Var3.W(-1270168884);
                    for (int i = 0; i < 5; i++) {
                        wo1.l(i, str2, this.f2383o, null, ux2Var3, 0);
                    }
                    ux2Var3.p(false);
                    ux2Var3.p(true);
                } else {
                    ux2Var3.Q();
                }
                return f88Var;
            default:
                final Function0 function1 = (Function0) obj4;
                fs4 fs4Var = (fs4) obj;
                ux2 ux2Var4 = (ux2) obj2;
                ((Integer) obj3).getClass();
                ux2Var4.W(-196777734);
                final long j = ((jt7) ux2Var4.j(kt7.a)).a;
                boolean zE = ux2Var4.e(j) | ux2Var4.f(function1) | ux2Var4.g(z);
                Object objK = ux2Var4.K();
                if (zE || objK == e01.a) {
                    objK = new Function1() { // from class: o.tk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            hi0 hi0Var = (hi0) obj5;
                            return hi0Var.a(new mk(function1, uf0.l(hi0Var, Float.intBitsToFloat((int) (hi0Var.m.d() >> 32)) / 2.0f), z, new t70(5, j), (byte) 0));
                        }
                    };
                    ux2Var4.g0(objK);
                }
                fs4 fs4VarC = j51.C(fs4Var, (Function1) objK);
                ux2Var4.p(false);
                return fs4VarC;
        }
    }

    public /* synthetic */ w71(byte b, Object obj, boolean z) {
        this.m = b;
        this.n = obj;
        this.f2383o = z;
    }
}
