package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class t23 {
    public static final /* synthetic */ int a = 0;

    static {
        new u23(new ji2((byte) 10), new uf2((byte) 7), new uf2((byte) 9), new ji2((byte) 11), new uf2((byte) 10), new uf2((byte) 11), new uf2((byte) 12), new ji2((byte) 12), new qo2((byte) 2), new qo2((byte) 3));
    }

    public static final void a(ns1 ns1Var, boolean z, boolean z2, Function1 function1, Function0 function0, fs4 fs4Var, String str, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        long j;
        cs4 cs4Var;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-442441360);
        int i2 = i | (ux2Var2.h(ns1Var) ? 4 : 2) | (ux2Var2.g(z) ? 32 : 16) | (ux2Var2.g(z2) ? 256 : 128) | (ux2Var2.h(function1) ? 2048 : 1024) | (ux2Var2.h(function0) ? 16384 : 8192) | 196608 | (ux2Var2.f(str) ? 1048576 : 524288);
        if (ux2Var2.N(i2 & 1, (599187 & i2) != 599186)) {
            if (z && z2) {
                ux2Var2.W(484366508);
                j = ((rn4) ux2Var2.j(un4.a)).a.G;
                ux2Var2.p(false);
            } else {
                ux2Var2.W(484441001);
                ux2Var2.p(false);
                j = rv0.g;
            }
            cs4 cs4Var2 = cs4.b;
            fs4 fs4VarS = au8.s(iq8.j(androidx.compose.foundation.layout.b.c(cs4Var2, 1.0f), sf6.a(8.0f)), j, kh.V);
            boolean zH = ((i2 & 7168) == 2048) | ux2Var2.h(ns1Var);
            Object objK = ux2Var2.K();
            if (zH || objK == e01.a) {
                objK = new ql1(function1, ns1Var, (byte) 8);
                ux2Var2.g0(objK);
            }
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.C(androidx.compose.foundation.b.b(fs4VarS, false, null, null, (Function0) objK, 15), 16.0f, 8.0f), "TVTA-devicesScreen-deviceItem");
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarA);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z3 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z3) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(dg6VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            ds1.f(ns1Var.c, ns1Var.u == js1.n, hi7.Size40dp, null, ux2Var2, 384, 8);
            fs4 fs4VarE = ka0.E(new s14(1.0f, true), 16.0f, 6.0f, 16.0f, 6.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS3 = uf0.s(ux2Var2, fs4VarE);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS3, iz0Var4, ux2Var2);
            String str2 = ns1Var.b;
            Map mapSingletonMap = Collections.singletonMap(str, j77.a);
            mapSingletonMap.getClass();
            h72 h72Var = un4.a;
            qs7.c(g77.s(str2, mapSingletonMap, new c77(((rn4) ux2Var2.j(h72Var)).a.a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), 0L, ux2Var, 8), null, ((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 2, false, 1, 0, null, null, ((rn4) ux2Var.j(h72Var)).b.j, ux2Var, 0, 24960, 241658);
            qs7.b(qs1.M(String.valueOf(ns1Var.a)), null, ((rn4) ux2Var.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var.j(h72Var)).b.k, ux2Var, 0, 24960, 110586);
            ux2Var.p(true);
            if (ns1Var.g) {
                ux2Var.W(211776724);
                fs4 fs4VarL = androidx.compose.foundation.layout.b.l(cs4Var2, 48.0f);
                do4 do4VarC = ua0.c(xz2.s, false);
                int iHashCode3 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL3 = ux2Var.l();
                fs4 fs4VarS4 = uf0.s(ux2Var, fs4VarL);
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4VarC, iz0Var, ux2Var);
                o67.n(yj5VarL3, iz0Var2, ux2Var);
                e41.r(iHashCode3, ux2Var, iz0Var3, ux2Var);
                o67.n(fs4VarS4, iz0Var4, ux2Var);
                cs4Var = cs4Var2;
                st5.a(androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(cs4Var2, 20.0f), "TVTA-devicesScreen-wakingIndicator"), 0L, 2.0f, 0L, 0, 0.0f, ux2Var, 390, 58);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                ux2Var2.p(false);
            } else {
                cs4Var = cs4Var2;
                ux2Var.W(212192310);
                xo1.k(function0, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-connectButton"), false, null, null, vn4.m, ux2Var, ((i2 >> 12) & 14) | 1572912, 60);
                ux2Var2 = ux2Var;
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new r23(ns1Var, z, z2, function1, function0, fs4Var2, str, i);
        }
    }

    public static final void b(final boolean z, final String str, final boolean z2, final Function1 function1, final Function0 function0, final Function0 function2, fs4 fs4Var, final l33 l33Var, final List list, final gl4 gl4Var, final ns1 ns1Var, final Function1 function3, final Function0 function4, final Function1 function5, f33 f33Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        int i4;
        final fs4 fs4Var2;
        final f33 f33Var2;
        ux2 ux2Var2;
        f33 f33Var3;
        int i5;
        fs4 fs4Var3;
        f33 f33Var4;
        Object u23Var;
        int i6;
        int i7;
        yy0 yy0Var;
        boolean z3;
        f33 f33Var5;
        ux2 ux2Var3 = ux2Var;
        str.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        ux2Var3.Y(-614146924);
        if ((i & 6) == 0) {
            i3 = (ux2Var3.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var3.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var3.g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var3.h(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var3.h(function0) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ux2Var3.h(function2) ? 131072 : 65536;
        }
        int i8 = i3 | 1572864;
        if ((i & 12582912) == 0) {
            i8 |= ux2Var3.h(l33Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i8 |= (i & 134217728) == 0 ? ux2Var3.f(list) : ux2Var3.h(list) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i8 |= ux2Var3.h(gl4Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ux2Var3.h(ns1Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var3.h(function3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ux2Var3.h(function4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ux2Var3.h(function5) ? 2048 : 1024;
        }
        int i9 = i4;
        if ((i2 & 24576) == 0) {
            i9 |= 8192;
        }
        if (ux2Var3.N(i8 & 1, ((306783379 & i8) == 306783378 && (i9 & 9363) == 9362) ? false : true)) {
            ux2Var3.S();
            if ((i & 1) == 0 || ux2Var3.x()) {
                int i10 = f33.I;
                dl5 dl5Var = new dl5(new uf2((byte) 13), (byte) 1);
                we8 we8VarA = id4.a(ux2Var3);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                ux2Var2 = ux2Var3;
                f33Var3 = (f33) g57.t(w86.a.b(f33.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var3);
                i5 = i9 & (-57345);
                fs4Var3 = cs4.b;
            } else {
                ux2Var3.Q();
                i5 = i9 & (-57345);
                ux2Var2 = ux2Var3;
                fs4Var3 = fs4Var;
                f33Var3 = f33Var;
            }
            ux2Var2.q();
            px4 px4VarV = et1.v(f33Var3.D, ux2Var2);
            k33 k33Var = l33Var != null ? l33Var.a : null;
            px4 px4VarV2 = et1.v(f33Var3.E, ux2Var2);
            px4 px4VarT = h57.t(function3, ux2Var2);
            px4 px4VarT2 = h57.t(function4, ux2Var2);
            Object objK = ux2Var2.K();
            k33 k33Var2 = k33Var;
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = h57.p(Boolean.FALSE);
                ux2Var2.g0(objK);
            }
            px4 px4Var = (px4) objK;
            boolean zF = ux2Var2.f(f33Var3) | ux2Var2.f(gl4Var);
            f33 f33Var6 = f33Var3;
            Object objK2 = ux2Var2.K();
            int i11 = i8;
            if (zF || objK2 == awVar) {
                f33Var4 = f33Var6;
                u23Var = new u23(new ew1(1, f33Var6, f33.class, "onSearchTermChange", "onSearchTermChange(Ljava/lang/String;)V", 0, (byte) 19), new ax1(0, f33Var6, f33.class, "openSearch", "openSearch()V", 0, (byte) 9), new ax1(0, f33Var6, f33.class, "closeSearch", "closeSearch()V", 0, (byte) 10), new ew1(1, f33Var6, f33.class, "connectToDevice", "connectToDevice(J)V", 0, (byte) 20), new ax1(0, f33Var6, f33.class, "tryLoadMoreDevices", "tryLoadMoreDevices()V", 0, (byte) 11), new ax1(0, f33Var6, f33.class, "retryLegacyDevices", "retryLegacyDevices()V", 0, (byte) 12), new ax1(0, f33Var6, f33.class, "toggleSorting", "toggleSorting()V", 0, (byte) 13), new ew1(1, f33Var6, f33.class, "changeSortOrder", "changeSortOrder(Lcom/teamviewer/remotecontrolviewmodellib/devicetab/groups/data/GroupDeviceSortValue;)V", 0, (byte) 21), new ea1(2, f33Var6, f33.class, "saveScrollPosition", "saveScrollPosition(II)V", 0, (byte) 3), new c9(f33Var4, gl4Var, (byte) 24));
                ux2Var2.g0(u23Var);
            } else {
                u23Var = objK2;
                f33Var4 = f33Var6;
            }
            final u23 u23Var2 = (u23) u23Var;
            boolean zH = ux2Var2.h(f33Var4) | ux2Var2.f(px4VarT) | ux2Var2.f(px4VarT2);
            Object objK3 = ux2Var2.K();
            if (zH || objK3 == awVar) {
                objK3 = new ko2(f33Var4, px4VarT, px4VarT2, (hc1) null, (byte) 3);
                ux2Var2.g0(objK3);
            }
            f88 f88Var = f88.a;
            ck3.i(f88Var, (hw2) objK3, ux2Var2);
            Object objK4 = ux2Var2.K();
            if (objK4 == awVar) {
                objK4 = new l5(2, 0, (byte) 10);
                ux2Var2.g0(objK4);
            }
            ck3.i(f88Var, (hw2) objK4, ux2Var2);
            boolean z4 = ((v23) px4VarV.getValue()).d;
            boolean zH2 = ux2Var2.h(u23Var2);
            Object objK5 = ux2Var2.K();
            if (zH2 || objK5 == awVar) {
                i6 = 0;
                objK5 = new k23(u23Var2, (byte) 0);
                ux2Var2.g0(objK5);
            } else {
                i6 = 0;
            }
            kh.c(z4, (Function0) objK5, ux2Var2, i6, i6);
            if (((v23) px4VarV.getValue()).l) {
                ux2Var2.W(512127029);
                boolean zH3 = ux2Var2.h(f33Var4) | ((i11 & 458752) == 131072);
                Object objK6 = ux2Var2.K();
                if (zH3 || objK6 == awVar) {
                    objK6 = new ql1(f33Var4, function2, (byte) 7);
                    ux2Var2.g0(objK6);
                }
                i7 = 0;
                vt1.c((Function0) objK6, ux2Var2, 0);
                ux2Var2.p(false);
            } else {
                i7 = 0;
                ux2Var2.W(512304814);
                ux2Var2.p(false);
            }
            fs4 fs4VarF = fs4Var3.f(androidx.compose.foundation.layout.b.c);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, i7);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarF);
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
            if (((v23) px4VarV.getValue()).d) {
                ux2Var2.W(478365014);
                us1.c(((v23) px4VarV.getValue()).e, u23Var2.a, u23Var2.c, null, ux2Var2, 0);
                ux2Var2.p(false);
                z3 = false;
            } else {
                ux2Var2.W(478667698);
                ur urVar = new ur(str);
                boolean z5 = !z || z2;
                boolean z6 = !((v23) px4VarV.getValue()).c;
                int i12 = i5 & 7168;
                boolean zH4 = (i12 == 2048) | ux2Var2.h(u23Var2);
                Object objK7 = ux2Var2.K();
                if (zH4 || objK7 == awVar) {
                    final byte b = 0;
                    objK7 = new Function0() { // from class: o.l23
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b2 = b;
                            f88 f88Var2 = f88.a;
                            u23 u23Var3 = u23Var2;
                            Function1 function6 = function5;
                            switch (b2) {
                                case 0:
                                    function6.invoke(new k23(u23Var3, (byte) 2));
                                    break;
                                default:
                                    function6.invoke(new k23(u23Var3, (byte) 1));
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var2.g0(objK7);
                }
                Function0 function6 = (Function0) objK7;
                if (l33Var == null || (l33Var.a instanceof h33)) {
                    ux2Var2.W(480614436);
                    ux2Var2.p(false);
                    yy0Var = null;
                } else {
                    ux2Var2.W(479427725);
                    yy0 yy0VarO = au8.O(-284311399, new z8(f33Var4, l33Var, function5, px4Var), ux2Var2);
                    ux2Var2.p(false);
                    yy0Var = yy0VarO;
                }
                boolean z7 = ((v23) px4VarV.getValue()).a.size() > 1 || ((v23) px4VarV.getValue()).k;
                boolean z8 = ((v23) px4VarV.getValue()).k;
                boolean zH5 = (i12 == 2048) | ux2Var2.h(u23Var2);
                Object objK8 = ux2Var2.K();
                if (zH5 || objK8 == awVar) {
                    final byte b2 = 1;
                    objK8 = new Function0() { // from class: o.l23
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b3 = b2;
                            f88 f88Var2 = f88.a;
                            u23 u23Var3 = u23Var2;
                            Function1 function7 = function5;
                            switch (b3) {
                                case 0:
                                    function7.invoke(new k23(u23Var3, (byte) 2));
                                    break;
                                default:
                                    function7.invoke(new k23(u23Var3, (byte) 1));
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var2.g0(objK8);
                }
                rz1 rz1Var = new rz1(urVar, z5, function0, z6, function6, yy0Var, z7, z8, (Function0) objK8);
                z3 = false;
                xs1.c(rz1Var, null, ux2Var2, 0, 2);
                ux2Var2.p(false);
            }
            f33 f33Var7 = f33Var4;
            fs4 fs4Var4 = fs4Var3;
            ux2 ux2Var4 = ux2Var2;
            boolean z9 = z3;
            c(gl4Var, (v23) px4VarV.getValue(), u23Var2, z, function1, new s14(1.0f, true), k33Var2, list, ns1Var, ux2Var4, ((i11 >> 27) & 14) | ((i11 << 9) & 7168) | ((i11 << 3) & 57344) | (29360128 & (i11 >> 3)) | ((i5 << 24) & 234881024), 0);
            ux2Var3 = ux2Var4;
            ux2Var3.p(true);
            i13 i13Var = (i13) px4VarV2.getValue();
            boolean zH6 = ux2Var3.h(f33Var7);
            Object objK9 = ux2Var3.K();
            if (zH6 || objK9 == awVar) {
                objK9 = new ew1(1, f33Var7, f33.class, "setRenameGroupText", "setRenameGroupText(Ljava/lang/String;)V", 0, (byte) 18);
                ux2Var3.g0(objK9);
            }
            Function1 function7 = (Function1) ((pu3) objK9);
            boolean zH7 = ux2Var3.h(f33Var7);
            Object objK10 = ux2Var3.K();
            if (zH7 || objK10 == awVar) {
                objK10 = new ax1(0, f33Var7, f33.class, "confirmRenameGroup", "confirmRenameGroup()V", 0, (byte) 6);
                ux2Var3.g0(objK10);
            }
            Function0 function8 = (Function0) ((pu3) objK10);
            boolean zH8 = ux2Var3.h(f33Var7);
            Object objK11 = ux2Var3.K();
            if (zH8 || objK11 == awVar) {
                objK11 = new ax1(0, f33Var7, f33.class, "confirmDeleteGroup", "confirmDeleteGroup()V", 0, (byte) 7);
                ux2Var3.g0(objK11);
            }
            Function0 function9 = (Function0) ((pu3) objK11);
            boolean zH9 = ux2Var3.h(f33Var7);
            Object objK12 = ux2Var3.K();
            if (zH9 || objK12 == awVar) {
                f33Var5 = f33Var7;
                objK12 = new ax1(0, f33Var5, f33.class, "dismissDialog", "dismissDialog()V", 0, (byte) 8);
                ux2Var3.g0(objK12);
            } else {
                f33Var5 = f33Var7;
            }
            us1.e(i13Var, function7, function8, function9, (Function0) ((pu3) objK12), ux2Var3, 0);
            if (((v23) px4VarV.getValue()).j) {
                ux2Var3.W(515945547);
                xs1.e(null, null, u23Var2.h, u23Var2.g, ((v23) px4VarV.getValue()).g, ux2Var3, 0);
                ux2Var3.p(z9);
            } else {
                ux2Var3.W(516138894);
                ux2Var3.p(z9);
            }
            fs4Var2 = fs4Var4;
            f33Var2 = f33Var5;
        } else {
            ux2Var3.Q();
            fs4Var2 = fs4Var;
            f33Var2 = f33Var;
        }
        j56 j56VarR = ux2Var3.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.m23
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    t23.b(z, str, z2, function1, function0, function2, fs4Var2, l33Var, list, gl4Var, ns1Var, function3, function4, function5, f33Var2, (ux2) obj, iY, iY2);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:204:0x0389 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:207:0x0397  */
    /* JADX WARN: Code duplicated, block: B:210:0x03f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:216:0x0444 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x0446  */
    /* JADX WARN: Code duplicated, block: B:220:0x0461  */
    /* JADX WARN: Code duplicated, block: B:222:0x0468  */
    /* JADX WARN: Code duplicated, block: B:224:0x046b  */
    /* JADX WARN: Code duplicated, block: B:226:0x046e  */
    /* JADX WARN: Code duplicated, block: B:228:0x0471  */
    /* JADX WARN: Code duplicated, block: B:230:0x0474  */
    /* JADX WARN: Code duplicated, block: B:232:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:233:0x04af  */
    /* JADX WARN: Code duplicated, block: B:237:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:240:0x04d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:243:0x04db  */
    /* JADX WARN: Code duplicated, block: B:245:0x050b  */
    /* JADX WARN: Code duplicated, block: B:247:0x0515  */
    /* JADX WARN: Code duplicated, block: B:248:0x0543  */
    /* JADX WARN: Code duplicated, block: B:250:0x0572  */
    /* JADX WARN: Code duplicated, block: B:252:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:254:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:256:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:258:0x062a  */
    /* JADX WARN: Code duplicated, block: B:259:0x062e  */
    /* JADX WARN: Code duplicated, block: B:261:0x069d  */
    /* JADX WARN: Code duplicated, block: B:263:0x06c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:264:0x06c3  */
    /* JADX WARN: Instruction removed from duplicated block: B:220:0x0461, please report this as an issue */
    public static final void c(gl4 gl4Var, v23 v23Var, u23 u23Var, boolean z, Function1 function1, fs4 fs4Var, k33 k33Var, List list, ns1 ns1Var, ux2 ux2Var, int i, int i2) {
        int i3;
        ns1 ns1Var2;
        u23 u23Var2;
        fs4 fs4Var2;
        k33 k33Var2;
        List list2;
        ns1 ns1Var3;
        int i4;
        Object obj;
        Object obj2;
        Object obj3;
        ns1 ns1Var4;
        byte b;
        byte b2;
        w44 w44Var;
        hc1 hc1Var;
        Object obj4;
        n13 n13Var;
        List list3;
        byte b3;
        boolean z2;
        Object ajVar;
        w44 w44Var2;
        Object obj5;
        k33 k33Var3;
        m13 m13Var;
        boolean zF;
        m13 m13Var2;
        Object umVar;
        v23 v23Var2;
        w44 w44Var3;
        boolean zH;
        Object objK;
        int iOrdinal;
        String strZ;
        boolean zF2;
        Object objK2;
        Object obj6;
        Function0 function0;
        fs4 fs4Var3;
        boolean z3;
        boolean zH2;
        Object objK3;
        fs4 fs4Var4;
        w44 w44Var4;
        final v23 v23Var3 = v23Var;
        u23 u23Var3 = u23Var;
        List list4 = list;
        iz0 iz0Var = d82.t;
        iz0 iz0Var2 = d82.w;
        iz0 iz0Var3 = d82.u;
        iz0 iz0Var4 = d82.v;
        ux2Var.Y(-896625795);
        if ((i & 6) == 0) {
            i3 = (ux2Var.h(gl4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.h(v23Var3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.h(u23Var3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var.h(function1) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        int i7 = 1572864;
        if (i6 != 0) {
            i3 |= i7;
        } else if ((i & 1572864) == 0) {
            i7 = (i & 2097152) == 0 ? ux2Var.f(k33Var) : ux2Var.h(k33Var) ? 1048576 : 524288;
            i3 |= i7;
        }
        int i8 = i2 & 128;
        int i9 = 12582912;
        if (i8 != 0) {
            i3 |= i9;
        } else if ((i & 12582912) == 0) {
            i9 = (i & 16777216) == 0 ? ux2Var.f(list4) : ux2Var.h(list4) ? 8388608 : 4194304;
            i3 |= i9;
        }
        int i10 = i2 & 256;
        if (i10 != 0) {
            i3 |= 100663296;
            ns1Var2 = ns1Var;
        } else {
            ns1Var2 = ns1Var;
            if ((i & 100663296) == 0) {
                i3 |= ux2Var.h(ns1Var2) ? 67108864 : 33554432;
            }
        }
        if (ux2Var.N(i3 & 1, (i3 & 38347923) != 38347922)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4Var5 = i5 != 0 ? cs4Var : fs4Var;
            hc1 hc1Var2 = null;
            k33 k33Var4 = i6 != 0 ? null : k33Var;
            if (i8 != 0) {
                list4 = null;
            }
            if (i10 != 0) {
                ns1Var2 = null;
            }
            Object[] objArr = new Object[0];
            fs4 fs4Var6 = fs4Var5;
            int i11 = i3 & 3670016;
            boolean z4 = i11 == 1048576 || ((i3 & 2097152) != 0 && ux2Var.h(k33Var4));
            Object objK4 = ux2Var.K();
            Object obj7 = e01.a;
            Object obj8 = objK4;
            if (z4 || objK4 == obj7) {
                Object zz0Var = new zz0(k33Var4, (byte) 19);
                ux2Var.g0(zz0Var);
                obj8 = zz0Var;
            }
            Object obj9 = (px4) zu1.L(objArr, (Function0) obj8, ux2Var, 0);
            Object[] objArr2 = new Object[0];
            boolean zH3 = ux2Var.h(v23Var3);
            Object objK5 = ux2Var.K();
            if (zH3 || objK5 == obj7) {
                i4 = 0;
                final boolean z5 = false ? 1 : 0;
                Object obj10 = new Function0() { // from class: o.n23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b4 = z5;
                        v23 v23Var4 = v23Var3;
                        switch (b4) {
                            case 0:
                                return h57.p(v23Var4.g);
                            default:
                                return h57.p(Boolean.valueOf(v23Var4.h));
                        }
                    }
                };
                ux2Var.g0(obj10);
                obj = obj10;
            } else {
                i4 = 0;
                obj = objK5;
            }
            px4 px4Var = (px4) zu1.L(objArr2, (Function0) obj, ux2Var, i4);
            Object[] objArr3 = new Object[i4];
            boolean zH4 = ux2Var.h(v23Var3);
            Object objK6 = ux2Var.K();
            if (zH4 || objK6 == obj7) {
                final byte b4 = 1;
                Object obj11 = new Function0() { // from class: o.n23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b5 = b4;
                        v23 v23Var4 = v23Var3;
                        switch (b5) {
                            case 0:
                                return h57.p(v23Var4.g);
                            default:
                                return h57.p(Boolean.valueOf(v23Var4.h));
                        }
                    }
                };
                ux2Var.g0(obj11);
                obj2 = obj11;
            } else {
                obj2 = objK6;
            }
            px4 px4Var2 = (px4) zu1.L(objArr3, (Function0) obj2, ux2Var, 0);
            Object[] objArr4 = new Object[0];
            Object objK7 = ux2Var.K();
            if (objK7 == obj7) {
                Object uf2Var = new uf2((byte) 8);
                ux2Var.g0(uf2Var);
                obj3 = uf2Var;
            } else {
                obj3 = objK7;
            }
            px4 px4Var3 = (px4) zu1.L(objArr4, (Function0) obj3, ux2Var, 48);
            Object objK8 = ux2Var.K();
            Object obj12 = objK8;
            if (objK8 == obj7) {
                Object objW = ck3.w(ux2Var);
                ux2Var.g0(objW);
                obj12 = objW;
            }
            me1 me1Var = (me1) obj12;
            Object obj13 = (iq2) ux2Var.j(b11.i);
            int i12 = v23Var3.m;
            boolean z6 = v23Var3.b;
            boolean z7 = v23Var3.k;
            boolean z8 = v23Var3.f;
            List list5 = v23Var3.a;
            w44 w44VarA = z44.a(i12, v23Var3.n, ux2Var, 0);
            ns1 ns1Var5 = (ns1) lv0.o0(list5);
            ns1 ns1Var6 = ns1Var2;
            int i13 = i3;
            d(w44VarA, k33Var4, ns1Var5 != null ? Long.valueOf(ns1Var5.a) : null, v23Var3.f, v23Var3.e, ux2Var, (i3 >> 15) & 112);
            Boolean boolValueOf = Boolean.valueOf(w44VarA.j.a());
            Boolean boolValueOf2 = Boolean.valueOf(v23Var3.d);
            boolean zF3 = ux2Var.f(w44VarA) | ux2Var.h(v23Var3) | ux2Var.h(obj13);
            Object objK9 = ux2Var.K();
            if (zF3 || objK9 == obj7) {
                ns1Var4 = ns1Var6;
                b = 0;
                b2 = 1;
                Object k9Var = new k9(w44VarA, v23Var3, obj13, hc1Var2, (byte) 3);
                w44Var = w44VarA;
                v23Var3 = v23Var3;
                hc1Var = null;
                ux2Var.g0(k9Var);
                obj4 = k9Var;
            } else {
                ns1Var4 = ns1Var6;
                w44Var = w44VarA;
                hc1Var = null;
                b = 0;
                b2 = 1;
                obj4 = objK9;
            }
            ck3.h(boolValueOf, boolValueOf2, (hw2) obj4, ux2Var);
            byte b5 = (((k33Var4 instanceof j33) || (k33Var4 instanceof h33)) && !gl4Var.d(k33Var4)) ? b2 : b;
            boolean z9 = k33Var4 instanceof i33;
            if (z9 && !z8 && z7) {
                n13Var = n13.m;
            } else if (z9 && !z8 && v23Var3.i) {
                n13Var = n13.n;
            } else if ((z6 || b5 != 0) && list5.isEmpty()) {
                n13Var = n13.f1531o;
            } else if (list5.isEmpty()) {
                n13Var = z8 ? n13.q : n13.p;
            } else {
                n13Var = n13.r;
            }
            n13 n13Var2 = n13Var;
            boolean zH5 = ux2Var.h(u23Var3) | ux2Var.f(w44Var);
            Object objK10 = ux2Var.K();
            Object obj14 = objK10;
            if (zH5 || objK10 == obj7) {
                Object g0Var = new g0(u23Var3, w44Var, (byte) 28);
                ux2Var.g0(g0Var);
                obj14 = g0Var;
            }
            ck3.e(f88.a, (Function1) obj14, ux2Var);
            Object objK11 = ux2Var.K();
            Object obj15 = objK11;
            if (objK11 == obj7) {
                Object objB = d57.b(new o23(w44Var, b));
                ux2Var.g0(objB);
                obj15 = objB;
            }
            i97 i97Var = (i97) obj15;
            int i14 = (ux2Var.h(u23Var3) ? 1 : 0) | ((i11 == 1048576 || ((i13 & 2097152) != 0 && ux2Var.h(k33Var4))) ? b2 : b);
            if ((i13 & 29360128) != 8388608) {
                if ((i13 & 16777216) != 0) {
                    list3 = list4;
                    if (ux2Var.h(list3)) {
                    }
                    z2 = ((((i14 == true ? 1 : 0) | b3) == true ? 1 : 0) | (ux2Var.f(obj9) ? 1 : 0) ? 1 : 0) | (ux2Var.f(w44Var) ? 1 : 0);
                    Object objK12 = ux2Var.K();
                    if (z2 == 0 || objK12 == obj7) {
                        w44Var2 = w44Var;
                        k33 k33Var5 = k33Var4;
                        obj5 = obj7;
                        ajVar = new aj(u23Var, k33Var5, list3, w44Var2, obj9, null, (byte) 7);
                        u23Var3 = u23Var;
                        k33Var3 = k33Var5;
                        ux2Var.g0(ajVar);
                    } else {
                        ajVar = objK12;
                        k33Var3 = k33Var4;
                        w44Var2 = w44Var;
                        obj5 = obj7;
                    }
                    ck3.g(k33Var3, list3, gl4Var, (hw2) ajVar, ux2Var);
                    m13Var = v23Var3.g;
                    Boolean boolValueOf3 = Boolean.valueOf(z7);
                    Boolean boolValueOf4 = Boolean.valueOf(v23Var3.h);
                    zF = ux2Var.f(px4Var) | ux2Var.h(v23Var3) | ux2Var.f(px4Var2) | ux2Var.f(px4Var3) | ux2Var.f(w44Var2) | ux2Var.h(u23Var3);
                    Object objK13 = ux2Var.K();
                    if (!zF || objK13 == obj5) {
                        m13Var2 = m13Var;
                        w44 w44Var5 = w44Var2;
                        v23Var2 = v23Var3;
                        umVar = new um(v23Var2, w44Var5, u23Var, px4Var, px4Var2, px4Var3, null);
                        w44Var3 = w44Var5;
                        u23Var3 = u23Var;
                        ux2Var.g0(umVar);
                    } else {
                        umVar = objK13;
                        m13Var2 = m13Var;
                        w44Var3 = w44Var2;
                        v23Var2 = v23Var3;
                    }
                    ck3.g(m13Var2, boolValueOf3, boolValueOf4, (hw2) umVar, ux2Var);
                    Boolean bool = (Boolean) i97Var.getValue();
                    bool.getClass();
                    Boolean boolValueOf5 = Boolean.valueOf(z6);
                    zH = ux2Var.h(v23Var2) | ux2Var.h(u23Var3);
                    objK = ux2Var.K();
                    if (zH || objK == obj5) {
                        Object k9Var2 = new k9(v23Var2, u23Var3, i97Var, hc1Var, (byte) 4);
                        ux2Var.g0(k9Var2);
                        objK = k9Var2;
                    }
                    ck3.h(bool, boolValueOf5, (hw2) objK, ux2Var);
                    iOrdinal = n13Var2.ordinal();
                    if (iOrdinal != 0) {
                        function0 = LayoutNode.e0;
                        if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                fs4Var3 = fs4Var6;
                                ux2Var.W(-972155613);
                                fs4 fs4VarB = ka0.B(androidx.compose.ui.platform.a.a(fs4Var3.f(androidx.compose.foundation.layout.b.c), "TVTA-devicesScreen-loading"), 24.0f);
                                do4 do4VarC = ua0.c(xz2.s, false);
                                int iHashCode = Long.hashCode(ux2Var.T);
                                yj5 yj5VarL = ux2Var.l();
                                fs4 fs4VarS = uf0.s(ux2Var, fs4VarB);
                                yz0.c.getClass();
                                ux2Var.a0();
                                if (ux2Var.S) {
                                    ux2Var.k(function0);
                                } else {
                                    ux2Var.j0();
                                }
                                o67.n(do4VarC, iz0Var4, ux2Var);
                                o67.n(yj5VarL, iz0Var3, ux2Var);
                                e41.r(iHashCode, ux2Var, iz0Var2, ux2Var);
                                o67.n(fs4VarS, iz0Var, ux2Var);
                                st5.a(null, 0L, 0.0f, 0L, 0, 0.0f, ux2Var, 0, 63);
                                ux2Var.p(true);
                                ux2Var.p(false);
                            } else if (iOrdinal == 3) {
                                ux2Var.W(-971792448);
                                io1.f(R.drawable.empty_group_background, m77.z(R.string.device_tab_group_empty_title, ux2Var), m77.z(R.string.device_tab_group_empty_subtitle, ux2Var), fs4Var6, ux2Var, (i13 >> 6) & 7168);
                                fs4Var3 = fs4Var6;
                                ux2Var.p(false);
                            } else if (iOrdinal == 4) {
                                ux2Var.W(-971422928);
                                xo1.p((i13 >> 9) & 896, m77.A(R.string.search_no_results_title, new Object[]{v23Var2.e}, ux2Var), m77.z(R.string.search_no_results_subtitle, ux2Var), ux2Var, fs4Var6);
                                ux2Var.p(false);
                                u23Var2 = u23Var;
                            } else {
                                if (iOrdinal != 5) {
                                    throw fx3.m(1631170920, ux2Var, false);
                                }
                                ux2Var.W(-971048944);
                                fs4 fs4VarA = androidx.compose.ui.platform.a.a(fs4Var6.f(androidx.compose.foundation.layout.b.c), "TVTA-devicesScreen-deviceList");
                                pd5 pd5VarJ = ka0.j(0.0f, 0.0f, 0.0f, 121.0f, 7);
                                ew ewVar = new ew(8.0f, new hk0((byte) 2));
                                ns1Var4 = ns1Var4;
                                boolean zH6 = ux2Var.h(v23Var2) | ux2Var.h(ns1Var4);
                                if ((i13 & 7168) == 2048) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                zH2 = zH6 | z3 | ux2Var.h(me1Var) | ux2Var.f(w44Var3) | ((i13 & 57344) == 16384) | ux2Var.h(u23Var3);
                                objK3 = ux2Var.K();
                                if (!zH2 || objK3 == obj5) {
                                    fs4Var4 = fs4Var6;
                                    w44 w44Var6 = w44Var3;
                                    Object y90Var = new y90(v23Var2, ns1Var4, z, me1Var, w44Var6, function1, u23Var3, (byte) 2);
                                    w44Var4 = w44Var6;
                                    ux2Var.g0(y90Var);
                                    objK3 = y90Var;
                                } else {
                                    fs4Var4 = fs4Var6;
                                    w44Var4 = w44Var3;
                                }
                                yo1.i(24960, 488, (Function1) objK3, null, null, ewVar, null, ux2Var, w44Var4, fs4VarA, pd5VarJ, false);
                                ux2Var.p(false);
                                u23Var2 = u23Var;
                                fs4Var6 = fs4Var4;
                            }
                            u23Var2 = u23Var;
                            fs4Var6 = fs4Var3;
                        } else {
                            ux2Var.W(-972833552);
                            fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(ka0.B(fs4Var6.f(androidx.compose.foundation.layout.b.c), 24.0f), "TVTA-devicesScreen-loadError");
                            kw0 kw0VarA = iw0.a(iq8.e, xz2.B, ux2Var, 54);
                            int iHashCode2 = Long.hashCode(ux2Var.T);
                            yj5 yj5VarL2 = ux2Var.l();
                            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarA2);
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(function0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(kw0VarA, r16, ux2Var);
                            o67.n(yj5VarL2, r8, ux2Var);
                            e41.r(iHashCode2, ux2Var, r23, ux2Var);
                            o67.n(fs4VarS2, iz0Var, ux2Var);
                            u23Var2 = u23Var;
                            qs7.b(m77.z(R.string.add_remote_device_to_your_account_error_case_text, ux2Var), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 0, 0, 262142);
                            au8.p(u23Var2.f, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-retry"), false, null, null, null, vn4.k, ux2Var, 805306416, 508);
                            ux2Var.p(true);
                            ux2Var.p(false);
                            fs4Var6 = fs4Var6;
                        }
                    } else {
                        u23Var2 = u23Var3;
                        ux2Var.W(-973352864);
                        strZ = m77.z(R.string.device_tab_loading_content_description, ux2Var);
                        sb0 sb0VarS = vs1.S(ux2Var);
                        fs4 fs4VarA3 = androidx.compose.ui.platform.a.a(fs4Var6, "TVTA-devicesScreen-loading");
                        zF2 = ux2Var.f(strZ);
                        objK2 = ux2Var.K();
                        if (zF2 || objK2 == obj5) {
                            obj6 = objK2;
                            Object fyVar = new fy(strZ, (byte) 10);
                            ux2Var.g0(fyVar);
                            obj6 = fyVar;
                        }
                        zu1.c(sb0VarS, cp6.a(fs4VarA3, false, (Function1) obj6), "TVTA-devicesScreen-deviceItemShimmer", ux2Var, 384, 0);
                        ux2Var.p(false);
                    }
                    fs4Var2 = fs4Var6;
                    k33Var2 = k33Var3;
                    list2 = list3;
                    ns1Var3 = ns1Var4;
                } else {
                    list3 = list4;
                }
                b3 = b;
                z2 = ((((i14 == true ? 1 : 0) | b3) == true ? 1 : 0) | (ux2Var.f(obj9) ? 1 : 0) ? 1 : 0) | (ux2Var.f(w44Var) ? 1 : 0);
                Object objK14 = ux2Var.K();
                if (z2 == 0) {
                    w44Var2 = w44Var;
                    k33 k33Var6 = k33Var4;
                    obj5 = obj7;
                    ajVar = new aj(u23Var, k33Var6, list3, w44Var2, obj9, null, (byte) 7);
                    u23Var3 = u23Var;
                    k33Var3 = k33Var6;
                    ux2Var.g0(ajVar);
                } else {
                    w44Var2 = w44Var;
                    k33 k33Var7 = k33Var4;
                    obj5 = obj7;
                    ajVar = new aj(u23Var, k33Var7, list3, w44Var2, obj9, null, (byte) 7);
                    u23Var3 = u23Var;
                    k33Var3 = k33Var7;
                    ux2Var.g0(ajVar);
                }
                ck3.g(k33Var3, list3, gl4Var, (hw2) ajVar, ux2Var);
                m13Var = v23Var3.g;
                Boolean boolValueOf6 = Boolean.valueOf(z7);
                Boolean boolValueOf7 = Boolean.valueOf(v23Var3.h);
                zF = ux2Var.f(px4Var) | ux2Var.h(v23Var3) | ux2Var.f(px4Var2) | ux2Var.f(px4Var3) | ux2Var.f(w44Var2) | ux2Var.h(u23Var3);
                Object objK15 = ux2Var.K();
                if (zF) {
                    m13Var2 = m13Var;
                    w44 w44Var7 = w44Var2;
                    v23Var2 = v23Var3;
                    umVar = new um(v23Var2, w44Var7, u23Var, px4Var, px4Var2, px4Var3, null);
                    w44Var3 = w44Var7;
                    u23Var3 = u23Var;
                    ux2Var.g0(umVar);
                } else {
                    m13Var2 = m13Var;
                    w44 w44Var8 = w44Var2;
                    v23Var2 = v23Var3;
                    umVar = new um(v23Var2, w44Var8, u23Var, px4Var, px4Var2, px4Var3, null);
                    w44Var3 = w44Var8;
                    u23Var3 = u23Var;
                    ux2Var.g0(umVar);
                }
                ck3.g(m13Var2, boolValueOf6, boolValueOf7, (hw2) umVar, ux2Var);
                Boolean bool2 = (Boolean) i97Var.getValue();
                bool2.getClass();
                Boolean boolValueOf8 = Boolean.valueOf(z6);
                zH = ux2Var.h(v23Var2) | ux2Var.h(u23Var3);
                objK = ux2Var.K();
                if (zH) {
                    Object k9Var3 = new k9(v23Var2, u23Var3, i97Var, hc1Var, (byte) 4);
                    ux2Var.g0(k9Var3);
                    objK = k9Var3;
                } else {
                    Object k9Var4 = new k9(v23Var2, u23Var3, i97Var, hc1Var, (byte) 4);
                    ux2Var.g0(k9Var4);
                    objK = k9Var4;
                }
                ck3.h(bool2, boolValueOf8, (hw2) objK, ux2Var);
                iOrdinal = n13Var2.ordinal();
                if (iOrdinal != 0) {
                    function0 = LayoutNode.e0;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            fs4Var3 = fs4Var6;
                            ux2Var.W(-972155613);
                            fs4 fs4VarB2 = ka0.B(androidx.compose.ui.platform.a.a(fs4Var3.f(androidx.compose.foundation.layout.b.c), "TVTA-devicesScreen-loading"), 24.0f);
                            do4 do4VarC2 = ua0.c(xz2.s, false);
                            int iHashCode3 = Long.hashCode(ux2Var.T);
                            yj5 yj5VarL3 = ux2Var.l();
                            fs4 fs4VarS3 = uf0.s(ux2Var, fs4VarB2);
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(function0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(do4VarC2, iz0Var4, ux2Var);
                            o67.n(yj5VarL3, iz0Var3, ux2Var);
                            e41.r(iHashCode3, ux2Var, iz0Var2, ux2Var);
                            o67.n(fs4VarS3, iz0Var, ux2Var);
                            st5.a(null, 0L, 0.0f, 0L, 0, 0.0f, ux2Var, 0, 63);
                            ux2Var.p(true);
                            ux2Var.p(false);
                        } else if (iOrdinal == 3) {
                            ux2Var.W(-971792448);
                            io1.f(R.drawable.empty_group_background, m77.z(R.string.device_tab_group_empty_title, ux2Var), m77.z(R.string.device_tab_group_empty_subtitle, ux2Var), fs4Var6, ux2Var, (i13 >> 6) & 7168);
                            fs4Var3 = fs4Var6;
                            ux2Var.p(false);
                        } else if (iOrdinal == 4) {
                            ux2Var.W(-971422928);
                            xo1.p((i13 >> 9) & 896, m77.A(R.string.search_no_results_title, new Object[]{v23Var2.e}, ux2Var), m77.z(R.string.search_no_results_subtitle, ux2Var), ux2Var, fs4Var6);
                            ux2Var.p(false);
                            u23Var2 = u23Var;
                        } else {
                            if (iOrdinal != 5) {
                                throw fx3.m(1631170920, ux2Var, false);
                            }
                            ux2Var.W(-971048944);
                            fs4 fs4VarA4 = androidx.compose.ui.platform.a.a(fs4Var6.f(androidx.compose.foundation.layout.b.c), "TVTA-devicesScreen-deviceList");
                            pd5 pd5VarJ2 = ka0.j(0.0f, 0.0f, 0.0f, 121.0f, 7);
                            ew ewVar2 = new ew(8.0f, new hk0((byte) 2));
                            ns1Var4 = ns1Var4;
                            boolean zH7 = ux2Var.h(v23Var2) | ux2Var.h(ns1Var4);
                            if ((i13 & 7168) == 2048) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            zH2 = zH7 | z3 | ux2Var.h(me1Var) | ux2Var.f(w44Var3) | ((i13 & 57344) == 16384) | ux2Var.h(u23Var3);
                            objK3 = ux2Var.K();
                            if (zH2) {
                                fs4Var4 = fs4Var6;
                                w44 w44Var9 = w44Var3;
                                Object y90Var2 = new y90(v23Var2, ns1Var4, z, me1Var, w44Var9, function1, u23Var3, (byte) 2);
                                w44Var4 = w44Var9;
                                ux2Var.g0(y90Var2);
                                objK3 = y90Var2;
                            } else {
                                fs4Var4 = fs4Var6;
                                w44 w44Var10 = w44Var3;
                                Object y90Var3 = new y90(v23Var2, ns1Var4, z, me1Var, w44Var10, function1, u23Var3, (byte) 2);
                                w44Var4 = w44Var10;
                                ux2Var.g0(y90Var3);
                                objK3 = y90Var3;
                            }
                            yo1.i(24960, 488, (Function1) objK3, null, null, ewVar2, null, ux2Var, w44Var4, fs4VarA4, pd5VarJ2, false);
                            ux2Var.p(false);
                            u23Var2 = u23Var;
                            fs4Var6 = fs4Var4;
                        }
                        u23Var2 = u23Var;
                        fs4Var6 = fs4Var3;
                    } else {
                        ux2Var.W(-972833552);
                        fs4 fs4VarA5 = androidx.compose.ui.platform.a.a(ka0.B(fs4Var6.f(androidx.compose.foundation.layout.b.c), 24.0f), "TVTA-devicesScreen-loadError");
                        kw0 kw0VarA2 = iw0.a(iq8.e, xz2.B, ux2Var, 54);
                        int iHashCode4 = Long.hashCode(ux2Var.T);
                        yj5 yj5VarL4 = ux2Var.l();
                        fs4 fs4VarS4 = uf0.s(ux2Var, fs4VarA5);
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(function0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(kw0VarA2, r16, ux2Var);
                        o67.n(yj5VarL4, r8, ux2Var);
                        e41.r(iHashCode4, ux2Var, r23, ux2Var);
                        o67.n(fs4VarS4, iz0Var, ux2Var);
                        u23Var2 = u23Var;
                        qs7.b(m77.z(R.string.add_remote_device_to_your_account_error_case_text, ux2Var), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 0, 0, 262142);
                        au8.p(u23Var2.f, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-retry"), false, null, null, null, vn4.k, ux2Var, 805306416, 508);
                        ux2Var.p(true);
                        ux2Var.p(false);
                        fs4Var6 = fs4Var6;
                    }
                } else {
                    u23Var2 = u23Var3;
                    ux2Var.W(-973352864);
                    strZ = m77.z(R.string.device_tab_loading_content_description, ux2Var);
                    sb0 sb0VarS2 = vs1.S(ux2Var);
                    fs4 fs4VarA6 = androidx.compose.ui.platform.a.a(fs4Var6, "TVTA-devicesScreen-loading");
                    zF2 = ux2Var.f(strZ);
                    objK2 = ux2Var.K();
                    if (zF2) {
                        obj6 = objK2;
                        Object fyVar2 = new fy(strZ, (byte) 10);
                        ux2Var.g0(fyVar2);
                        obj6 = fyVar2;
                    } else {
                        obj6 = objK2;
                        Object fyVar3 = new fy(strZ, (byte) 10);
                        ux2Var.g0(fyVar3);
                        obj6 = fyVar3;
                    }
                    zu1.c(sb0VarS2, cp6.a(fs4VarA6, false, (Function1) obj6), "TVTA-devicesScreen-deviceItemShimmer", ux2Var, 384, 0);
                    ux2Var.p(false);
                }
                fs4Var2 = fs4Var6;
                k33Var2 = k33Var3;
                list2 = list3;
                ns1Var3 = ns1Var4;
            } else {
                list3 = list4;
            }
            b3 = b2;
            z2 = ((((i14 == true ? 1 : 0) | b3) == true ? 1 : 0) | (ux2Var.f(obj9) ? 1 : 0) ? 1 : 0) | (ux2Var.f(w44Var) ? 1 : 0);
            Object objK16 = ux2Var.K();
            if (z2 == 0) {
                w44Var2 = w44Var;
                k33 k33Var8 = k33Var4;
                obj5 = obj7;
                ajVar = new aj(u23Var, k33Var8, list3, w44Var2, obj9, null, (byte) 7);
                u23Var3 = u23Var;
                k33Var3 = k33Var8;
                ux2Var.g0(ajVar);
            } else {
                w44Var2 = w44Var;
                k33 k33Var9 = k33Var4;
                obj5 = obj7;
                ajVar = new aj(u23Var, k33Var9, list3, w44Var2, obj9, null, (byte) 7);
                u23Var3 = u23Var;
                k33Var3 = k33Var9;
                ux2Var.g0(ajVar);
            }
            ck3.g(k33Var3, list3, gl4Var, (hw2) ajVar, ux2Var);
            m13Var = v23Var3.g;
            Boolean boolValueOf9 = Boolean.valueOf(z7);
            Boolean boolValueOf10 = Boolean.valueOf(v23Var3.h);
            zF = ux2Var.f(px4Var) | ux2Var.h(v23Var3) | ux2Var.f(px4Var2) | ux2Var.f(px4Var3) | ux2Var.f(w44Var2) | ux2Var.h(u23Var3);
            Object objK17 = ux2Var.K();
            if (zF) {
                m13Var2 = m13Var;
                w44 w44Var11 = w44Var2;
                v23Var2 = v23Var3;
                umVar = new um(v23Var2, w44Var11, u23Var, px4Var, px4Var2, px4Var3, null);
                w44Var3 = w44Var11;
                u23Var3 = u23Var;
                ux2Var.g0(umVar);
            } else {
                m13Var2 = m13Var;
                w44 w44Var12 = w44Var2;
                v23Var2 = v23Var3;
                umVar = new um(v23Var2, w44Var12, u23Var, px4Var, px4Var2, px4Var3, null);
                w44Var3 = w44Var12;
                u23Var3 = u23Var;
                ux2Var.g0(umVar);
            }
            ck3.g(m13Var2, boolValueOf9, boolValueOf10, (hw2) umVar, ux2Var);
            Boolean bool3 = (Boolean) i97Var.getValue();
            bool3.getClass();
            Boolean boolValueOf11 = Boolean.valueOf(z6);
            zH = ux2Var.h(v23Var2) | ux2Var.h(u23Var3);
            objK = ux2Var.K();
            if (zH) {
                Object k9Var5 = new k9(v23Var2, u23Var3, i97Var, hc1Var, (byte) 4);
                ux2Var.g0(k9Var5);
                objK = k9Var5;
            } else {
                Object k9Var6 = new k9(v23Var2, u23Var3, i97Var, hc1Var, (byte) 4);
                ux2Var.g0(k9Var6);
                objK = k9Var6;
            }
            ck3.h(bool3, boolValueOf11, (hw2) objK, ux2Var);
            iOrdinal = n13Var2.ordinal();
            if (iOrdinal != 0) {
                function0 = LayoutNode.e0;
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        fs4Var3 = fs4Var6;
                        ux2Var.W(-972155613);
                        fs4 fs4VarB3 = ka0.B(androidx.compose.ui.platform.a.a(fs4Var3.f(androidx.compose.foundation.layout.b.c), "TVTA-devicesScreen-loading"), 24.0f);
                        do4 do4VarC3 = ua0.c(xz2.s, false);
                        int iHashCode5 = Long.hashCode(ux2Var.T);
                        yj5 yj5VarL5 = ux2Var.l();
                        fs4 fs4VarS5 = uf0.s(ux2Var, fs4VarB3);
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(function0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(do4VarC3, iz0Var4, ux2Var);
                        o67.n(yj5VarL5, iz0Var3, ux2Var);
                        e41.r(iHashCode5, ux2Var, iz0Var2, ux2Var);
                        o67.n(fs4VarS5, iz0Var, ux2Var);
                        st5.a(null, 0L, 0.0f, 0L, 0, 0.0f, ux2Var, 0, 63);
                        ux2Var.p(true);
                        ux2Var.p(false);
                    } else if (iOrdinal == 3) {
                        ux2Var.W(-971792448);
                        io1.f(R.drawable.empty_group_background, m77.z(R.string.device_tab_group_empty_title, ux2Var), m77.z(R.string.device_tab_group_empty_subtitle, ux2Var), fs4Var6, ux2Var, (i13 >> 6) & 7168);
                        fs4Var3 = fs4Var6;
                        ux2Var.p(false);
                    } else if (iOrdinal == 4) {
                        ux2Var.W(-971422928);
                        xo1.p((i13 >> 9) & 896, m77.A(R.string.search_no_results_title, new Object[]{v23Var2.e}, ux2Var), m77.z(R.string.search_no_results_subtitle, ux2Var), ux2Var, fs4Var6);
                        ux2Var.p(false);
                        u23Var2 = u23Var;
                    } else {
                        if (iOrdinal != 5) {
                            throw fx3.m(1631170920, ux2Var, false);
                        }
                        ux2Var.W(-971048944);
                        fs4 fs4VarA7 = androidx.compose.ui.platform.a.a(fs4Var6.f(androidx.compose.foundation.layout.b.c), "TVTA-devicesScreen-deviceList");
                        pd5 pd5VarJ3 = ka0.j(0.0f, 0.0f, 0.0f, 121.0f, 7);
                        ew ewVar3 = new ew(8.0f, new hk0((byte) 2));
                        ns1Var4 = ns1Var4;
                        boolean zH8 = ux2Var.h(v23Var2) | ux2Var.h(ns1Var4);
                        if ((i13 & 7168) == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zH2 = zH8 | z3 | ux2Var.h(me1Var) | ux2Var.f(w44Var3) | ((i13 & 57344) == 16384) | ux2Var.h(u23Var3);
                        objK3 = ux2Var.K();
                        if (zH2) {
                            fs4Var4 = fs4Var6;
                            w44 w44Var13 = w44Var3;
                            Object y90Var4 = new y90(v23Var2, ns1Var4, z, me1Var, w44Var13, function1, u23Var3, (byte) 2);
                            w44Var4 = w44Var13;
                            ux2Var.g0(y90Var4);
                            objK3 = y90Var4;
                        } else {
                            fs4Var4 = fs4Var6;
                            w44 w44Var14 = w44Var3;
                            Object y90Var5 = new y90(v23Var2, ns1Var4, z, me1Var, w44Var14, function1, u23Var3, (byte) 2);
                            w44Var4 = w44Var14;
                            ux2Var.g0(y90Var5);
                            objK3 = y90Var5;
                        }
                        yo1.i(24960, 488, (Function1) objK3, null, null, ewVar3, null, ux2Var, w44Var4, fs4VarA7, pd5VarJ3, false);
                        ux2Var.p(false);
                        u23Var2 = u23Var;
                        fs4Var6 = fs4Var4;
                    }
                    u23Var2 = u23Var;
                    fs4Var6 = fs4Var3;
                } else {
                    ux2Var.W(-972833552);
                    fs4 fs4VarA8 = androidx.compose.ui.platform.a.a(ka0.B(fs4Var6.f(androidx.compose.foundation.layout.b.c), 24.0f), "TVTA-devicesScreen-loadError");
                    kw0 kw0VarA3 = iw0.a(iq8.e, xz2.B, ux2Var, 54);
                    int iHashCode6 = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL6 = ux2Var.l();
                    fs4 fs4VarS6 = uf0.s(ux2Var, fs4VarA8);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(function0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(kw0VarA3, r16, ux2Var);
                    o67.n(yj5VarL6, r8, ux2Var);
                    e41.r(iHashCode6, ux2Var, r23, ux2Var);
                    o67.n(fs4VarS6, iz0Var, ux2Var);
                    u23Var2 = u23Var;
                    qs7.b(m77.z(R.string.add_remote_device_to_your_account_error_case_text, ux2Var), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 0, 0, 262142);
                    au8.p(u23Var2.f, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-retry"), false, null, null, null, vn4.k, ux2Var, 805306416, 508);
                    ux2Var.p(true);
                    ux2Var.p(false);
                    fs4Var6 = fs4Var6;
                }
            } else {
                u23Var2 = u23Var3;
                ux2Var.W(-973352864);
                strZ = m77.z(R.string.device_tab_loading_content_description, ux2Var);
                sb0 sb0VarS3 = vs1.S(ux2Var);
                fs4 fs4VarA9 = androidx.compose.ui.platform.a.a(fs4Var6, "TVTA-devicesScreen-loading");
                zF2 = ux2Var.f(strZ);
                objK2 = ux2Var.K();
                if (zF2) {
                    obj6 = objK2;
                    Object fyVar4 = new fy(strZ, (byte) 10);
                    ux2Var.g0(fyVar4);
                    obj6 = fyVar4;
                } else {
                    obj6 = objK2;
                    Object fyVar5 = new fy(strZ, (byte) 10);
                    ux2Var.g0(fyVar5);
                    obj6 = fyVar5;
                }
                zu1.c(sb0VarS3, cp6.a(fs4VarA9, false, (Function1) obj6), "TVTA-devicesScreen-deviceItemShimmer", ux2Var, 384, 0);
                ux2Var.p(false);
            }
            fs4Var2 = fs4Var6;
            k33Var2 = k33Var3;
            list2 = list3;
            ns1Var3 = ns1Var4;
        } else {
            u23Var2 = u23Var3;
            ux2Var.Q();
            fs4Var2 = fs4Var;
            k33Var2 = k33Var;
            list2 = list4;
            ns1Var3 = ns1Var2;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ug0(gl4Var, v23Var, u23Var2, z, function1, fs4Var2, k33Var2, list2, ns1Var3, i, i2);
        }
    }

    public static final void d(w44 w44Var, k33 k33Var, Long l, boolean z, String str, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-1186098631);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(w44Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? ux2Var.f(k33Var) : ux2Var.h(k33Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(l) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.f(str) ? 16384 : 8192;
        }
        if (ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (k33Var instanceof j33) || (k33Var instanceof h33);
            boolean z3 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && ux2Var.f(k33Var))) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (z3 || objK == obj) {
                objK = h57.p(l);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) objK;
            int i3 = i2 & 14;
            boolean z4 = i3 == 4;
            Object objK2 = ux2Var.K();
            if (z4 || objK2 == obj) {
                objK2 = d57.b(new o23(w44Var, (byte) 1));
                ux2Var.g0(objK2);
            }
            boolean z5 = z2 && !im3.n(l, (Long) px4Var.getValue()) && l != null && ((Boolean) ((i97) objK2).getValue()).booleanValue();
            boolean zG = (i3 == 4) | ux2Var.g(z5) | ux2Var.f(px4Var) | ((i2 & 896) == 256);
            Object objK3 = ux2Var.K();
            if (zG || objK3 == obj) {
                Object nw1Var = new nw1(z5, w44Var, l, px4Var, (byte) 1);
                ux2Var.g0(nw1Var);
                objK3 = nw1Var;
            }
            ck3.k((Function0) objK3, ux2Var);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new q23(w44Var, k33Var, l, z, str, i);
        }
    }
}
