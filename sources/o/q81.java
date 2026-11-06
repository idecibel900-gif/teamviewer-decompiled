package o;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes.dex */
public abstract class q81 {
    public static final qf6 a = sf6.a(24.0f);
    public static final qf6 b = sf6.a(8.0f);

    public static final void a(sb0 sb0Var, ux2 ux2Var, int i) {
        int i2;
        byte b2;
        sb0 sb0Var2 = sb0Var;
        ux2 ux2Var2 = ux2Var;
        iz0 iz0Var = d82.t;
        iz0 iz0Var2 = d82.w;
        iz0 iz0Var3 = d82.u;
        iz0 iz0Var4 = d82.v;
        ux2Var2.Y(359648231);
        if ((i & 6) == 0) {
            i2 = (ux2Var2.f(sb0Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = true;
        if (ux2Var2.N(i2 & 1, (i2 & 3) != 2)) {
            cs4 cs4Var = cs4.b;
            float f = 1.0f;
            fs4 fs4VarD = ka0.D(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 8.0f, 0.0f, 2);
            dg6 dg6VarA = cg6.a(new ew(8.0f, new hk0((byte) 2)), xz2.x, ux2Var2, 6);
            int i3 = i2;
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarD);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z2 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z2) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA, iz0Var4, ux2Var2);
            o67.n(yj5VarL, iz0Var3, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), iz0Var2, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, iz0Var, ux2Var2);
            ux2Var2.W(-1064583786);
            int i4 = 0;
            while (i4 < 3) {
                fs4 fs4VarA = androidx.compose.ui.platform.a.a(new s14(f, z), "TVTA-devicesOfflineScreen-contactInfoActionShimmer");
                kw0 kw0VarA = iw0.a(new ew(6.0f, new hk0((byte) 2)), xz2.B, ux2Var2, 54);
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarA);
                yz0.c.getClass();
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(kw0VarA, iz0Var4, ux2Var2);
                o67.n(yj5VarL2, iz0Var3, ux2Var2);
                o67.n(Integer.valueOf(iHashCode2), iz0Var2, ux2Var2);
                o67.l(ux2Var2);
                o67.n(fs4VarS2, iz0Var, ux2Var2);
                int i5 = (i3 & 14) | 48;
                f(sb0Var2, androidx.compose.foundation.layout.b.l(cs4Var, 40.0f), sf6.a, ux2Var2, i5, 0);
                sb0Var2 = sb0Var;
                ux2Var2 = ux2Var;
                f(sb0Var2, androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 16.0f), null, ux2Var2, i5, 4);
                ux2Var2.p(true);
                i4++;
                z = true;
                f = 1.0f;
            }
            b2 = 0;
            ux2Var2.p(false);
            ux2Var2.p(z);
        } else {
            b2 = 0;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new o81(sb0Var2, i, b2);
        }
    }

    public static final void b(sb0 sb0Var, fs4 fs4Var, ux2 ux2Var, int i) {
        ux2Var.Y(-1481227849);
        int i2 = (ux2Var.f(sb0Var) ? 4 : 2) | i | (ux2Var.f(fs4Var) ? 256 : 128);
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.C(im3.Z(fs4Var.f(androidx.compose.foundation.layout.b.c), im3.W(ux2Var), true), 16.0f, 8.0f), "TVTA-devicesOfflineScreen-contactInfoShimmer");
            kw0 kw0VarA = iw0.a(new ew(24.0f, new hk0((byte) 2)), xz2.B, ux2Var, 54);
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
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            int i3 = i2 & 14;
            int i4 = i2 & 126;
            d(sb0Var, ux2Var, i4);
            a(sb0Var, ux2Var, i3);
            c(sb0Var, ux2Var, i4);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new c51(sb0Var, fs4Var, i, (byte) 2);
        }
    }

    public static final void c(sb0 sb0Var, ux2 ux2Var, int i) {
        int i2;
        byte b2;
        sb0 sb0Var2 = sb0Var;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1171058964);
        if ((i & 6) == 0) {
            i2 = i | (ux2Var2.f(sb0Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.g(true) ? 32 : 16;
        }
        if (ux2Var2.N(i2 & 1, (i2 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            ew ewVar = new ew(24.0f, new hk0((byte) 2));
            w50 w50Var = xz2.A;
            kw0 kw0VarA = iw0.a(ewVar, w50Var, ux2Var2, 6);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarC);
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
            fs4 fs4VarC2 = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            bw bwVar = iq8.c;
            kw0 kw0VarA2 = iw0.a(bwVar, w50Var, ux2Var2, 0);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarC2);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA2, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            int i3 = i2 & 14;
            e(sb0Var2, ux2Var2, i3);
            fs4 fs4VarE = ka0.E(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 72.0f), 16.0f, 8.0f, 24.0f, 8.0f);
            dg6 dg6VarA = cg6.a(new ew(16.0f, new hk0((byte) 2)), xz2.y, ux2Var2, 54);
            int iHashCode3 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL3 = ux2Var2.l();
            fs4 fs4VarS3 = uf0.s(ux2Var2, fs4VarE);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA, iz0Var, ux2Var2);
            o67.n(yj5VarL3, iz0Var2, ux2Var2);
            e41.r(iHashCode3, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS3, iz0Var4, ux2Var2);
            f(sb0Var, androidx.compose.foundation.layout.b.l(cs4Var, 40.0f), b, ux2Var2, i3 | 432, 0);
            ux2Var2 = ux2Var;
            sb0Var2 = sb0Var;
            f(sb0Var2, androidx.compose.foundation.layout.b.d(new s14(1.0f, true), 24.0f), null, ux2Var2, i3, 4);
            ux2Var2.p(true);
            ux2Var2.p(true);
            fs4 fs4VarC3 = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            kw0 kw0VarA3 = iw0.a(bwVar, w50Var, ux2Var2, 0);
            int iHashCode4 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL4 = ux2Var2.l();
            fs4 fs4VarS4 = uf0.s(ux2Var2, fs4VarC3);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA3, iz0Var, ux2Var2);
            o67.n(yj5VarL4, iz0Var2, ux2Var2);
            e41.r(iHashCode4, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS4, iz0Var4, ux2Var2);
            e(sb0Var2, ux2Var2, i3);
            fs4 fs4VarB = ka0.B(au8.s(ka0.C(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 16.0f, 8.0f), ((rn4) ux2Var2.j(un4.a)).a.H, sf6.a(16.0f)), 16.0f);
            kw0 kw0VarA4 = iw0.a(new ew(16.0f, new hk0((byte) 2)), w50Var, ux2Var2, 6);
            int iHashCode5 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL5 = ux2Var2.l();
            fs4 fs4VarS5 = uf0.s(ux2Var2, fs4VarB);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA4, iz0Var, ux2Var2);
            o67.n(yj5VarL5, iz0Var2, ux2Var2);
            e41.r(iHashCode5, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS5, iz0Var4, ux2Var2);
            ux2Var2.W(-1219938705);
            g(sb0Var2, ux2Var2, i3);
            ux2Var2.p(false);
            b2 = 1;
            ux2Var2.p(true);
            ux2Var2.p(true);
            ux2Var2.p(true);
        } else {
            b2 = 1;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new o81(sb0Var2, i, b2);
        }
    }

    public static final void d(sb0 sb0Var, ux2 ux2Var, int i) {
        sb0 sb0Var2 = sb0Var;
        ux2Var.Y(-323049289);
        int i2 = (i & 6) == 0 ? (ux2Var.f(sb0Var2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= ux2Var.g(true) ? 32 : 16;
        }
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            w50 w50Var = xz2.B;
            kw0 kw0VarA = iw0.a(new ew(16.0f, new hk0((byte) 2)), w50Var, ux2Var, 54);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var, cs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(kw0VarA, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var);
            int i3 = i2 & 14;
            int i4 = i3 | 48;
            f(sb0Var2, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(cs4Var, 72.0f), "TVTA-devicesOfflineScreen-contactInfoAvatarShimmer"), sf6.a, ux2Var, i4, 0);
            kw0 kw0VarA2 = iw0.a(new ew(8.0f, new hk0((byte) 2)), w50Var, ux2Var, 54);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, cs4Var);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA2, iz0Var, ux2Var);
            o67.n(yj5VarL2, iz0Var2, ux2Var);
            e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS2, iz0Var4, ux2Var);
            f(sb0Var, androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.p(cs4Var, 196.0f), 24.0f), null, ux2Var, i4, 4);
            dg6 dg6VarA = cg6.a(new ew(8.0f, new hk0((byte) 2)), xz2.x, ux2Var, 6);
            int iHashCode3 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL3 = ux2Var.l();
            fs4 fs4VarS3 = uf0.s(ux2Var, cs4Var);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA, iz0Var, ux2Var);
            o67.n(yj5VarL3, iz0Var2, ux2Var);
            e41.r(iHashCode3, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS3, iz0Var4, ux2Var);
            ux2Var.W(-808534362);
            for (int i5 = 0; i5 < 1; i5++) {
                f(sb0Var, androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.p(cs4Var, 115.0f), 24.0f), b, ux2Var, i3 | 432, 0);
            }
            sb0Var2 = sb0Var;
            ux2Var.p(false);
            ux2Var.p(true);
            ux2Var.p(true);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new o81(sb0Var2, i, (byte) 2);
        }
    }

    public static final void e(sb0 sb0Var, ux2 ux2Var, int i) {
        int i2;
        sb0 sb0Var2;
        ux2 ux2Var2;
        ux2Var.Y(316474361);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(sb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            sb0Var2 = sb0Var;
            ux2Var2 = ux2Var;
            f(sb0Var2, androidx.compose.foundation.layout.b.d(ka0.D(androidx.compose.foundation.layout.b.c(cs4.b, 1.0f), 16.0f, 0.0f, 2), 16.0f), null, ux2Var2, (i2 & 14) | 48, 4);
        } else {
            sb0Var2 = sb0Var;
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new o81(sb0Var2, i, (byte) 4);
        }
    }

    public static final void f(sb0 sb0Var, fs4 fs4Var, qf6 qf6Var, ux2 ux2Var, int i, int i2) {
        int i3;
        ux2Var.Y(1353387255);
        if ((i & 6) == 0) {
            i3 = (ux2Var.f(sb0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= ux2Var.f(qf6Var) ? 256 : 128;
        }
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                qf6Var = a;
            }
            ua0.a(au8.r(fs4Var, sb0Var, qf6Var, 4), ux2Var, 0);
        } else {
            ux2Var.Q();
        }
        qf6 qf6Var2 = qf6Var;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new p81(sb0Var, fs4Var, qf6Var2, i, i2, (byte) 0);
        }
    }

    public static final void g(sb0 sb0Var, ux2 ux2Var, int i) {
        int i2;
        sb0 sb0Var2 = sb0Var;
        ux2Var.Y(-830609371);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(sb0Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            kw0 kw0VarA = iw0.a(new ew(16.0f, new hk0((byte) 2)), xz2.A, ux2Var, 6);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var, cs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(kw0VarA, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var);
            int i3 = i2 & 14;
            int i4 = i3 | 48;
            f(sb0Var2, androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, 0.5f), 16.0f), null, ux2Var, i4, 4);
            float f = 1.0f;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            dg6 dg6VarA = cg6.a(new ew(8.0f, new hk0((byte) 2)), xz2.x, ux2Var, 6);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarC);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA, iz0Var, ux2Var);
            o67.n(yj5VarL2, iz0Var2, ux2Var);
            e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS2, iz0Var4, ux2Var);
            ux2Var.W(-1366621125);
            int i5 = 0;
            while (i5 < 2) {
                f(sb0Var, androidx.compose.foundation.layout.b.d(new s14(f, true), 16.0f), null, ux2Var, i3, 4);
                i5++;
                f = f;
            }
            ux2Var.p(false);
            ux2Var.p(true);
            fs4 fs4VarD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, f), 16.0f);
            sb0Var2 = sb0Var;
            f(sb0Var2, fs4VarD, null, ux2Var, i4, 4);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new o81(sb0Var2, i, (byte) 3);
        }
    }
}
