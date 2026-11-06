package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionRecipientStatus;
import com.teamviewer.teamviewer.market.mobile.R;
import java.time.OffsetDateTime;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class of7 {
    public static final e96 a = new e96("^https?://");

    public static final void a(int i, Function0 function0, Function0 function1, ux2 ux2Var, fs4 fs4Var, boolean z) {
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-211156700);
        int i2 = i | (ux2Var2.g(z) ? 4 : 2) | (ux2Var2.h(function0) ? 32 : 16) | (ux2Var2.h(function1) ? 256 : 128);
        if (ux2Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
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
            cs4 cs4Var = cs4.b;
            m77.g(function0, ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), null, z, null, null, e8.k, ux2Var, ((i2 >> 3) & 14) | 1572912 | ((i2 << 9) & 7168), 52);
            ux2Var2 = ux2Var;
            v67.d(function1, androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), null, false, null, e8.l, ux2Var2, ((i2 >> 6) & 14) | 196656, 28);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new na(i, function0, function1, fs4Var, z);
        }
    }

    public static final void b(final boolean z, final SupportSession supportSession, final Function0 function0, Function0 function1, fs4 fs4Var, xy6 xy6Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        xy6 xy6Var2;
        int i2;
        xy6 xy6VarR;
        fs4 fs4Var3;
        supportSession.getClass();
        function0.getClass();
        function1.getClass();
        ux2Var.Y(-1426150336);
        int i3 = i | (ux2Var.g(z) ? 4 : 2) | (ux2Var.h(supportSession) ? 32 : 16) | (ux2Var.h(function0) ? 256 : 128) | (ux2Var.h(function1) ? 2048 : 1024) | 90112;
        if (ux2Var.N(i3 & 1, (74899 & i3) != 74898)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                i2 = i3 & (-458753);
                xy6VarR = yo1.R(null, ux2Var, 6, 2);
                fs4Var3 = cs4.b;
            } else {
                ux2Var.Q();
                xy6VarR = xy6Var;
                i2 = i3 & (-458753);
                fs4Var3 = fs4Var;
            }
            ux2Var.q();
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = ck3.w(ux2Var);
                ux2Var.g0(objK);
            }
            final me1 me1Var = (me1) objK;
            final Function1 function1K = et1.K(xy6VarR, function1, ux2Var, (i2 >> 6) & 112);
            fs4 fs4Var4 = fs4Var3;
            xy6 xy6Var3 = xy6VarR;
            yo1.k(function1, fs4Var4, xy6Var3, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-923212258, new iw2() { // from class: o.lf7
                @Override // o.iw2
                public final Object d(Object obj, Object obj2, Object obj3) {
                    ux2 ux2Var2 = (ux2) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((lw0) obj).getClass();
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        w50 w50Var = xz2.B;
                        cs4 cs4Var = cs4.b;
                        fs4 fs4VarD = ka0.D(o77.t(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), im3.W(ux2Var2), me1Var), 16.0f, 0.0f, 2);
                        kw0 kw0VarA = iw0.a(iq8.c, w50Var, ux2Var2, 48);
                        int iHashCode = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL = ux2Var2.l();
                        fs4 fs4VarS = uf0.s(ux2Var2, fs4VarD);
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
                        SupportSession supportSession2 = supportSession;
                        String strD = of7.a.d(supportSession2.getJoinSessionUrlForRecipient(), "");
                        String name = supportSession2.getName();
                        if (name == null) {
                            name = to7.m(ux2Var2, 760113653, R.string.session_default_name, ux2Var2, false);
                        } else {
                            ux2Var2.W(760113157);
                            ux2Var2.p(false);
                        }
                        qs7.b(name, ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.g, ux2Var2, 48, 0, 131068);
                        lv1.k(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7), 0.0f, 0L, ux2Var2, 6, 6);
                        of7.c(supportSession2.getRecipientStatus(), supportSession2.getValidUntil(), ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), ux2Var2, 384);
                        String strM = qs1.M(String.valueOf(supportSession2.getSessioncode()));
                        fs4 fs4VarF = ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7);
                        Object objK2 = ux2Var2.K();
                        aw awVar = e01.a;
                        if (objK2 == awVar) {
                            objK2 = new jv6((byte) 7);
                            ux2Var2.g0(objK2);
                        }
                        Function0 function2 = (Function0) objK2;
                        Object objK3 = ux2Var2.K();
                        if (objK3 == awVar) {
                            objK3 = new jv6((byte) 8);
                            ux2Var2.g0(objK3);
                        }
                        Function0 function3 = (Function0) objK3;
                        Object objK4 = ux2Var2.K();
                        if (objK4 == awVar) {
                            objK4 = new jv6((byte) 9);
                            ux2Var2.g0(objK4);
                        }
                        Function0 function4 = (Function0) objK4;
                        Object objK5 = ux2Var2.K();
                        if (objK5 == awVar) {
                            objK5 = new jv6((byte) 10);
                            ux2Var2.g0(objK5);
                        }
                        wf7.b(strD, strM, fs4VarF, function2, function3, function4, (Function0) objK5, null, ux2Var2, 1797504, 128);
                        fs4 fs4VarF2 = ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                        Function0 function5 = function0;
                        boolean zF = ux2Var2.f(function5);
                        Object objK6 = ux2Var2.K();
                        if (zF || objK6 == awVar) {
                            objK6 = new yd7(function5, (byte) 3);
                            ux2Var2.g0(objK6);
                        }
                        Function0 function6 = (Function0) objK6;
                        Function1 function7 = function1K;
                        boolean zF2 = ux2Var2.f(function7);
                        Object objK7 = ux2Var2.K();
                        if (zF2 || objK7 == awVar) {
                            objK7 = new qv1(function7, (byte) 16);
                            ux2Var2.g0(objK7);
                        }
                        of7.a(3072, function6, (Function0) objK7, ux2Var2, fs4VarF2, z);
                        ux2Var2.p(true);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, (i2 >> 9) & 1022, 3072, 8184);
            fs4Var2 = fs4Var4;
            xy6Var2 = xy6Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6Var2 = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a5(z, supportSession, function0, function1, fs4Var2, xy6Var2, i);
        }
    }

    public static final void c(SupportSessionRecipientStatus supportSessionRecipientStatus, OffsetDateTime offsetDateTime, fs4 fs4Var, ux2 ux2Var, int i) {
        rf7 rf7Var;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(43464093);
        int i2 = i | (ux2Var2.d(supportSessionRecipientStatus.ordinal()) ? 4 : 2) | (ux2Var2.h(offsetDateTime) ? 32 : 16);
        if (ux2Var2.N(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = ux2Var2.h(offsetDateTime);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (zH || objK == awVar) {
                objK = new mf7(offsetDateTime, null, (byte) 0);
                ux2Var2.g0(objK);
            }
            hw2 hw2Var = (hw2) objK;
            Object objK2 = ux2Var2.K();
            if (objK2 == awVar) {
                objK2 = h57.p("");
                ux2Var2.g0(objK2);
            }
            px4 px4Var = (px4) objK2;
            boolean zH2 = ux2Var2.h(hw2Var);
            Object objK3 = ux2Var2.K();
            if (zH2 || objK3 == awVar) {
                objK3 = new e57(hw2Var, px4Var, null, (byte) 1);
                ux2Var2.g0(objK3);
            }
            ck3.i(offsetDateTime, (hw2) objK3, ux2Var2);
            int i3 = nf7.a[supportSessionRecipientStatus.ordinal()];
            if (i3 == 1) {
                ux2Var2.W(2054521938);
                String strZ = m77.z(R.string.user_waiting, ux2Var2);
                h72 h72Var = vf2.a;
                rf7Var = new rf7(((tf2) ux2Var2.j(h72Var)).b, ((tf2) ux2Var2.j(h72Var)).a, R.drawable.ic_ready, strZ);
                ux2Var2.p(false);
            } else {
                if (i3 != 2) {
                    throw fx3.m(-1180652693, ux2Var2, false);
                }
                ux2Var2.W(-1180640609);
                String strZ2 = m77.z(R.string.user_not_joined, ux2Var2);
                h72 h72Var2 = un4.a;
                rf7Var = new rf7(((rn4) ux2Var2.j(h72Var2)).a.G, ((rn4) ux2Var2.j(h72Var2)).a.q, R.drawable.ic_not_ready, strZ2);
                ux2Var2.p(false);
            }
            fs4 fs4VarC = ka0.C(au8.s(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), rf7Var.b, sf6.a(12.0f)), 16.0f, 19.0f);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
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
            o67.n(dg6VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            ud5 ud5VarT = lv1.T(rf7Var.c, ux2Var2, 0);
            cs4 cs4Var = cs4.b;
            td3.b(ud5VarT, rf7Var.a, androidx.compose.foundation.layout.b.l(ka0.F(cs4Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 20.0f), rf7Var.d, ux2Var2, 392, 0);
            fs4 fs4VarF = ka0.F(eg6.a(cs4Var, 1.0f), 0.0f, 0.0f, 20.0f, 0.0f, 11);
            h72 h72Var3 = un4.a;
            qs7.b(rf7Var.a, fs4VarF, ((rn4) ux2Var2.j(h72Var3)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var3)).b.m, ux2Var, 0, 0, 131064);
            qs7.b(m77.A(R.string.session_expires_in, new Object[]{(String) px4Var.getValue()}, ux2Var), eg6.a(cs4Var, 0.9f), ((rn4) ux2Var.j(h72Var3)).a.a, 0L, null, 0L, new qo7(6), 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var3)).b.m, ux2Var, 0, 0, 130040);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new f9(supportSessionRecipientStatus, offsetDateTime, fs4Var, i, (byte) 26);
        }
    }
}
