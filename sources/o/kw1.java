package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class kw1 {
    public static final qf6 a = sf6.a(24.0f);

    public static final void a(sb0 sb0Var, fs4 fs4Var, ux2 ux2Var, int i) {
        ux2Var.Y(-358156639);
        int i2 = (i & 6) == 0 ? (ux2Var.f(sb0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        byte b = 0;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
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
            int i3 = i2 & 14;
            int i4 = i3 | 48;
            c(sb0Var, ov1.n, ux2Var, i4);
            g(sb0Var, 2, ux2Var, i3 | 3504);
            ux2Var.W(802198235);
            for (int i5 = 0; i5 < 4; i5++) {
                f(sb0Var, "TVTA-devicesOfflineScreen-contactItemShimmer", ux2Var, i4);
            }
            ux2Var.p(false);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new iw1(sb0Var, fs4Var, i, b);
        }
    }

    public static final void b(ov1 ov1Var, sb0 sb0Var, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        sb0Var.getClass();
        ux2Var.Y(-1118663513);
        if ((i & 6) == 0) {
            i2 = (ux2Var.d(ov1Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(sb0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            int iOrdinal = ov1Var.ordinal();
            if (iOrdinal == 0) {
                ux2Var.W(-1293805905);
                e(sb0Var, fs4Var, ux2Var, (i2 >> 3) & 126);
                ux2Var.p(false);
            } else if (iOrdinal == 1) {
                ux2Var.W(-1293803375);
                a(sb0Var, fs4Var, ux2Var, (i2 >> 3) & 126);
                ux2Var.p(false);
            } else if (iOrdinal != 3) {
                ux2Var.W(-1293798613);
                ux2Var.p(false);
            } else {
                ux2Var.W(-1293800618);
                h(sb0Var, fs4Var, ux2Var, (i2 >> 3) & 126);
                ux2Var.p(false);
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) ov1Var, (Object) sb0Var, (Object) fs4Var, i, (byte) 8);
        }
    }

    public static final void c(sb0 sb0Var, ov1 ov1Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(1484964140);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(sb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.d(ov1Var.ordinal()) ? 32 : 16;
        }
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.B(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 16.0f), "TVTA-devicesOfflineScreen-filterChipsShimmer");
            dg6 dg6VarA = cg6.a(new ew(8.0f, new hk0((byte) 2)), xz2.x, ux2Var, 6);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarA);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            ux2Var.W(-1474902138);
            Iterator it = qf0.L(ov1.m, ov1.n, ov1.p).iterator();
            while (it.hasNext()) {
                ua0.a(androidx.compose.ui.platform.a.a(au8.r(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.p(cs4Var, ((ov1) it.next()) == ov1Var ? 106.0f : 48.0f), 32.0f), sb0Var, sf6.a(8.0f), 4), "TVTA-devicesOfflineScreen-filterChipShimmer"), ux2Var, 0);
            }
            ux2Var.p(false);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pa((byte) 9, i, (Object) sb0Var, (Object) ov1Var);
        }
    }

    public static final void d(sb0 sb0Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-349924976);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(sb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.E(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 56.0f), 16.0f, 8.0f, 24.0f, 8.0f), "TVTA-devicesOfflineScreen-groupItemShimmer");
            dg6 dg6VarA = cg6.a(new ew(16.0f, new hk0((byte) 2)), xz2.y, ux2Var, 54);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarA);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            fs4 fs4VarL = androidx.compose.foundation.layout.b.l(cs4Var, 24.0f);
            qf6 qf6Var = a;
            ua0.a(au8.r(fs4VarL, sb0Var, qf6Var, 4), ux2Var, 0);
            ua0.a(au8.r(androidx.compose.foundation.layout.b.d(new s14(1.0f, true), 20.0f), sb0Var, qf6Var, 4), ux2Var, 0);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new o81(sb0Var, i, (byte) 5);
        }
    }

    public static final void e(sb0 sb0Var, fs4 fs4Var, ux2 ux2Var, int i) {
        ux2Var.Y(-545246656);
        int i2 = (i & 6) == 0 ? (ux2Var.f(sb0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        byte b = 1;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
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
            int i3 = i2 & 14;
            c(sb0Var, ov1.m, ux2Var, i3 | 48);
            g(sb0Var, 1, ux2Var, i3 | 3504);
            ux2Var.W(657942455);
            for (int i4 = 0; i4 < 4; i4++) {
                d(sb0Var, ux2Var, i3);
            }
            ux2Var.p(false);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new iw1(sb0Var, fs4Var, i, b);
        }
    }

    public static final void f(sb0 sb0Var, String str, ux2 ux2Var, int i) {
        int i2;
        sb0Var.getClass();
        str.getClass();
        ux2Var.Y(-244124886);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(sb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(str) ? 32 : 16;
        }
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.E(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 72.0f), 16.0f, 8.0f, 24.0f, 8.0f), str);
            dg6 dg6VarA = cg6.a(new ew(16.0f, new hk0((byte) 2)), xz2.y, ux2Var, 54);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarA);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            fs4 fs4VarL = androidx.compose.foundation.layout.b.l(cs4Var, 40.0f);
            qf6 qf6Var = a;
            ua0.a(au8.r(fs4VarL, sb0Var, qf6Var, 4), ux2Var, 0);
            ua0.a(au8.r(androidx.compose.foundation.layout.b.d(new s14(1.0f, true), 24.0f), sb0Var, qf6Var, 4), ux2Var, 0);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pa((byte) 8, i, (Object) sb0Var, (Object) str);
        }
    }

    public static final void g(final sb0 sb0Var, final int i, ux2 ux2Var, final int i2) {
        int i3;
        iz0 iz0Var = d82.t;
        iz0 iz0Var2 = d82.w;
        iz0 iz0Var3 = d82.u;
        iz0 iz0Var4 = d82.v;
        x50 x50Var = xz2.y;
        ux2Var.Y(1909529992);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.f(sb0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.c(16.0f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.c(8.0f) ? 2048 : 1024;
        }
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarE = ka0.E(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 16.0f, 8.0f, 24.0f, 8.0f);
            dg6 dg6VarA = cg6.a(iq8.a, x50Var, ux2Var, 48);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarE);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA, iz0Var4, ux2Var);
            o67.n(yj5VarL, iz0Var3, ux2Var);
            o67.n(Integer.valueOf(iHashCode), iz0Var2, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, iz0Var, ux2Var);
            ux2Var.W(-1609854765);
            int i4 = 0;
            while (i4 < i) {
                fs4 fs4VarD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.p(cs4Var, 82.0f), 28.0f);
                dg6 dg6VarA2 = cg6.a(new ew(8.0f, new hk0((byte) 2)), x50Var, ux2Var, 48);
                int iHashCode2 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL2 = ux2Var.l();
                fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarD);
                yz0.c.getClass();
                ux2Var.a0();
                x50 x50Var2 = x50Var;
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                o67.n(dg6VarA2, iz0Var4, ux2Var);
                o67.n(yj5VarL2, iz0Var3, ux2Var);
                o67.n(Integer.valueOf(iHashCode2), iz0Var2, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS2, iz0Var, ux2Var);
                fs4 fs4VarD2 = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.p(cs4Var, 46.0f), 14.0f);
                qf6 qf6Var = a;
                ua0.a(au8.r(fs4VarD2, sb0Var, qf6Var, 4), ux2Var, 0);
                ua0.a(au8.r(androidx.compose.foundation.layout.b.l(cs4Var, 12.0f), sb0Var, qf6Var, 4), ux2Var, 0);
                ux2Var.p(true);
                i4++;
                x50Var = x50Var2;
            }
            ux2Var.p(false);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.jw1
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i2 | 1);
                    kw1.g(sb0Var, i, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void h(sb0 sb0Var, fs4 fs4Var, ux2 ux2Var, int i) {
        ux2Var.Y(-1591364615);
        byte b = 2;
        int i2 = (i & 6) == 0 ? (ux2Var.f(sb0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
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
            int i3 = i2 & 14;
            int i4 = i3 | 48;
            c(sb0Var, ov1.p, ux2Var, i4);
            g(sb0Var, 1, ux2Var, i3 | 3504);
            ux2Var.W(-1446653780);
            for (int i5 = 0; i5 < 4; i5++) {
                f(sb0Var, "TVTA-devicesOfflineScreen-serviceQueueItemShimmer", ux2Var, i4);
            }
            ux2Var.p(false);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new iw1(sb0Var, fs4Var, i, b);
        }
    }
}
