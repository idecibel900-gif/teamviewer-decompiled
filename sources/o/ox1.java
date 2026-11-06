package o;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ox1 {
    public static final Set a = cx.h1(new ov1[]{ov1.m, ov1.n});

    public static final void a(boolean z, boolean z2, ov1 ov1Var, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        sb0 sb0Var;
        boolean z3;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(856351105);
        if ((i & 6) == 0) {
            i2 = (ux2Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var2.d(ov1Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var2.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var2.f(fs4Var) ? 16384 : 8192;
        }
        if (ux2Var2.N(i2 & 1, (i2 & 9363) != 9362)) {
            String strZ = m77.z(R.string.device_tab_loading_content_description, ux2Var2);
            sb0 sb0VarS = vs1.S(ux2Var2);
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            fs4 fs4VarF = fs4Var.f(fillElement);
            h72 h72Var = un4.a;
            fs4 fs4VarS = au8.s(fs4VarF, ((rn4) ux2Var2.j(h72Var)).a.p, kh.V);
            boolean zF = ux2Var2.f(strZ);
            Object objK = ux2Var2.K();
            if (zF || objK == e01.a) {
                objK = new fy(strZ, (byte) 8);
                ux2Var2.g0(objK);
            }
            fs4 fs4VarA = cp6.a(fs4VarS, false, (Function1) objK);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarA);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z4 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z4) {
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
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            int i3 = i2 >> 3;
            c(z, ov1Var, function0, ux2Var2, (i3 & 896) | (i2 & 14) | (i3 & 112));
            if (z2) {
                ux2Var2.W(1426201867);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(1426161505);
                wo1.k(null, ux2Var2, 0);
                ux2Var2.p(false);
            }
            fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(new s14(1.0f, true), 1.0f), "TVTA-devicesOfflineScreen-content");
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS3 = uf0.s(ux2Var2, fs4VarA2);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(do4VarC, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS3, iz0Var4, ux2Var2);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.x, ux2Var2, 0);
            int iHashCode3 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL3 = ux2Var2.l();
            fs4 fs4VarS4 = uf0.s(ux2Var2, fillElement);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA, iz0Var, ux2Var2);
            o67.n(yj5VarL3, iz0Var2, ux2Var2);
            e41.r(iHashCode3, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS4, iz0Var4, ux2Var2);
            cs4 cs4Var = cs4.b;
            kw1.b(ov1Var, sb0VarS, z ? eg6.a(cs4Var, 0.4f) : androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), ux2Var2, (i2 >> 6) & 14);
            if (z) {
                ux2Var2.W(-1740165406);
                lv1.B(androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.b.b, 2.0f), 0.0f, ((rn4) ux2Var2.j(h72Var)).a.B, ux2Var2, 6);
                int iOrdinal = ov1Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        ux2Var2 = ux2Var2;
                        z3 = false;
                        ux2Var2.W(-1739730011);
                        q81.b(sb0VarS, eg6.a(cs4Var, 0.6f), ux2Var2, 48);
                        ux2Var2.p(false);
                    } else if (iOrdinal != 3) {
                        ux2Var2 = ux2Var2;
                        ux2Var2.W(-1739129727);
                        b77.a(ux2Var2, eg6.a(cs4Var, 0.6f));
                        z3 = false;
                        ux2Var2.p(false);
                    } else {
                        ux2Var2 = ux2Var2;
                        z3 = false;
                        ux2Var2.W(-1739389383);
                        jt6.d(sb0VarS, eg6.a(cs4Var, 0.6f), ux2Var2, 0);
                        ux2Var2.p(false);
                    }
                    sb0Var = sb0VarS;
                } else {
                    ux2Var2 = ux2Var2;
                    z3 = false;
                    ux2Var2.W(-1739900077);
                    sb0Var = sb0VarS;
                    zu1.c(sb0Var, eg6.a(cs4Var, 0.6f), null, ux2Var2, 0, 4);
                    ux2Var2.p(false);
                }
                ux2Var2.p(z3);
            } else {
                sb0Var = sb0VarS;
                ux2Var2.W(-1738997791);
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
            if (z || !a.contains(ov1Var)) {
                ux2Var2.W(-582112571);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-582471985);
                ua0.a(androidx.compose.ui.platform.a.a(au8.r(androidx.compose.foundation.layout.b.l(ka0.B(ya0.a.a(cs4Var, xz2.w), 16.0f), 56.0f), sb0Var, sf6.a(16.0f), 4), "TVTA-devicesOfflineScreen-fabShimmer"), ux2Var2, 0);
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new pu(z, z2, ov1Var, function0, fs4Var, i);
        }
    }

    public static final void b(boolean z, boolean z2, ov1 ov1Var, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i) {
        Function0 function1;
        ux2 ux2Var2;
        ov1 ov1Var2;
        boolean z3;
        boolean z4;
        function0.getClass();
        ux2Var.Y(-1781687656);
        int i2 = (ux2Var.g(z) ? 4 : 2) | i | (ux2Var.g(z2) ? 32 : 16) | (ux2Var.d(ov1Var.ordinal()) ? 256 : 128) | (ux2Var.h(function0) ? 2048 : 1024) | (ux2Var.f(fs4Var) ? 16384 : 8192);
        if (ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            function1 = function0;
            ux2Var2 = ux2Var;
            a(z, z2, ov1Var, function1, androidx.compose.ui.platform.a.a(fs4Var, "TVTA-devicesOfflineScreen"), ux2Var2, i2 & 8190);
            z4 = z;
            z3 = z2;
            ov1Var2 = ov1Var;
        } else {
            function1 = function0;
            ux2Var2 = ux2Var;
            ov1Var2 = ov1Var;
            z3 = z2;
            z4 = z;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new kb(z4, z3, ov1Var2, function1, fs4Var, i);
        }
    }

    public static final void c(boolean z, ov1 ov1Var, Function0 function0, ux2 ux2Var, int i) {
        int i2;
        String strM;
        boolean z2;
        ux2Var.Y(-287876714);
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.d(ov1Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(function0) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.x, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z3 = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z3) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(dg6VarA, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var);
            fs4 fs4VarA = z ? eg6.a(cs4Var, 0.4f) : androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarA);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, iz0Var, ux2Var);
            o67.n(yj5VarL2, iz0Var2, ux2Var);
            e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS2, iz0Var4, ux2Var);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new vr1((byte) 15);
                ux2Var.g0(objK);
            }
            qs1.i(((i2 >> 6) & 14) | 3120, 4, function0, (Function0) objK, ux2Var, null, false);
            ux2Var.p(true);
            if (z) {
                ux2Var.W(-1463588858);
                lv1.B(androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.b.d(cs4Var, 64.0f), 2.0f), 0.0f, ((rn4) ux2Var.j(un4.a)).a.B, ux2Var, 6);
                int iOrdinal = ov1Var.ordinal();
                if (iOrdinal == 0) {
                    strM = to7.m(ux2Var, -185752438, R.string.all_managed_group_label, ux2Var, false);
                } else if (iOrdinal == 1) {
                    strM = to7.m(ux2Var, -185749389, R.string.device_tab_contact_details_title, ux2Var, false);
                } else if (iOrdinal != 3) {
                    ux2Var.W(-1463089821);
                    ux2Var.p(false);
                    strM = null;
                } else {
                    strM = to7.m(ux2Var, -185745915, R.string.session_info_title, ux2Var, false);
                }
                if (strM != null) {
                    ux2Var.W(-1463028440);
                    ur urVar = new ur(strM);
                    Object objK2 = ux2Var.K();
                    if (objK2 == awVar) {
                        objK2 = new vr1((byte) 16);
                        ux2Var.g0(objK2);
                    }
                    z2 = false;
                    xs1.c(new pz1(urVar, false, (Function0) objK2, null), eg6.a(cs4Var, 0.6f), ux2Var, 0, 0);
                    ux2Var.p(false);
                } else {
                    z2 = false;
                    ux2Var.W(-1462651232);
                    b77.a(ux2Var, eg6.a(cs4Var, 0.6f));
                    ux2Var.p(false);
                }
                ux2Var.p(z2);
            } else {
                ux2Var.W(-1462572120);
                ux2Var.p(false);
            }
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new cn1(z, (Object) ov1Var, function0, i, (byte) 1);
        }
    }
}
