package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class jx0 {
    public static final a65 a = vt1.B(new g9((byte) 12), new px((byte) 17));

    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, String str2, fs4 fs4Var, Function0 function0, ux2 ux2Var, int i, int i2) {
        String str3;
        int i3;
        Function0 function1;
        int i4;
        boolean z;
        Function0 function2;
        j56 j56VarR;
        Function0 function3;
        boolean z2;
        tg3 tg3Var;
        cs4 cs4Var;
        ya0 ya0Var;
        cs4 cs4Var2;
        ux2 ux2Var2 = ux2Var;
        str.getClass();
        ux2Var2.Y(-751141655);
        if ((i & 6) == 0) {
            str3 = str;
            i3 = (ux2Var2.f(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var2.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var2.f(fs4Var) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                function1 = function0;
                i3 |= ux2Var2.h(function1) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var2.N(i4 & 1, z)) {
                if (i5 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
                int iHashCode = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL = ux2Var2.l();
                fs4 fs4VarS = uf0.s(ux2Var2, fs4Var);
                yz0.c.getClass();
                ux2Var2.a0();
                z2 = ux2Var2.S;
                tg3Var = LayoutNode.e0;
                if (z2) {
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
                cs4Var = cs4.b;
                fs4 fs4VarF = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7);
                do4 do4VarC = ua0.c(xz2.f2564o, false);
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarF);
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
                ya0Var = ya0.a;
                if (function3 == null) {
                    ux2Var2.W(1081884330);
                    ux2Var2.p(false);
                    cs4Var2 = cs4Var;
                } else {
                    ux2Var2.W(1081884331);
                    cs4Var2 = cs4Var;
                    xo1.k(function3, androidx.compose.ui.platform.a.a(ya0Var.a(cs4Var, xz2.r), str2.concat("-navigationIconButton")), false, null, null, ck3.p, ux2Var2, ((i4 >> 9) & 14) | 1572864, 60);
                    ux2Var2.p(false);
                }
                qs7.b(str3, androidx.compose.ui.platform.a.a(ya0Var.a(cs4Var2, xz2.s), str2.concat("-title")), 0L, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.g, ux2Var, i4 & 14, 0, 130044);
                ux2Var.p(true);
                lv1.k(null, 0.0f, 0L, ux2Var, 0, 7);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                function2 = function3;
            } else {
                ux2Var2.Q();
                function2 = function1;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                j56VarR.d = new ck(str, str2, fs4Var, function2, i, i2);
            }
        }
        i3 |= 3072;
        function1 = function0;
        i4 = i3;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var2.N(i4 & 1, z)) {
            if (i5 != 0) {
                function3 = null;
            } else {
                function3 = function1;
            }
            kw0 kw0VarA2 = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode3 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL3 = ux2Var2.l();
            fs4 fs4VarS3 = uf0.s(ux2Var2, fs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            z2 = ux2Var2.S;
            tg3Var = LayoutNode.e0;
            if (z2) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var5 = d82.v;
            o67.n(kw0VarA2, iz0Var5, ux2Var2);
            iz0 iz0Var6 = d82.u;
            o67.n(yj5VarL3, iz0Var6, ux2Var2);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            iz0 iz0Var7 = d82.w;
            o67.n(numValueOf2, iz0Var7, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var8 = d82.t;
            o67.n(fs4VarS3, iz0Var8, ux2Var2);
            cs4Var = cs4.b;
            fs4 fs4VarF2 = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            do4 do4VarC2 = ua0.c(xz2.f2564o, false);
            int iHashCode4 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL4 = ux2Var2.l();
            fs4 fs4VarS4 = uf0.s(ux2Var2, fs4VarF2);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(do4VarC2, iz0Var5, ux2Var2);
            o67.n(yj5VarL4, iz0Var6, ux2Var2);
            e41.r(iHashCode4, ux2Var2, iz0Var7, ux2Var2);
            o67.n(fs4VarS4, iz0Var8, ux2Var2);
            ya0Var = ya0.a;
            if (function3 == null) {
                ux2Var2.W(1081884330);
                ux2Var2.p(false);
                cs4Var2 = cs4Var;
            } else {
                ux2Var2.W(1081884331);
                cs4Var2 = cs4Var;
                xo1.k(function3, androidx.compose.ui.platform.a.a(ya0Var.a(cs4Var, xz2.r), str2.concat("-navigationIconButton")), false, null, null, ck3.p, ux2Var2, ((i4 >> 9) & 14) | 1572864, 60);
                ux2Var2.p(false);
            }
            qs7.b(str3, androidx.compose.ui.platform.a.a(ya0Var.a(cs4Var2, xz2.s), str2.concat("-title")), 0L, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.g, ux2Var, i4 & 14, 0, 130044);
            ux2Var.p(true);
            lv1.k(null, 0.0f, 0L, ux2Var, 0, 7);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            function2 = function3;
        } else {
            ux2Var2.Q();
            function2 = function1;
        }
        j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new ck(str, str2, fs4Var, function2, i, i2);
        }
    }

    public static final void b(String str, boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        str.getClass();
        function1.getClass();
        ux2Var.Y(-820910340);
        int i2 = i | (ux2Var.f(str) ? 4 : 2) | (ux2Var.g(z) ? 32 : 16) | (ux2Var.h(function1) ? 16384 : 8192) | 196608;
        byte b = 1;
        if (ux2Var.N(i2 & 1, (74899 & i2) != 74898)) {
            cs4 cs4Var = cs4.b;
            bt1.e(str, function1, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), "TVTA-devices-add-remote-device-via-id-bottom-sheet-device-name-input"), false, false, null, ck3.l, null, null, null, au8.O(-1284014603, new mb(z, str, b), ux2Var), z, null, null, null, true, 0, 0, ((rn4) ux2Var.j(un4.a)).c.b, null, ux2Var, (i2 & 14) | 1572864 | ((i2 >> 9) & 112), ((i2 << 6) & 7168) | 12583296, 6148024);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new nb(str, z, function1, fs4Var2, i, (byte) 1);
        }
    }

    public static final void c(List list, Set set, Function1 function1, Function0 function0, fs4 fs4Var, String str, ux2 ux2Var, int i) {
        String str2;
        ux2 ux2Var2 = ux2Var;
        list.getClass();
        set.getClass();
        function1.getClass();
        function0.getClass();
        ux2Var2.Y(-1019880539);
        int i2 = (ux2Var2.f(list) ? 4 : 2) | i | (ux2Var2.f(set) ? 32 : 16) | (ux2Var2.h(function1) ? 256 : 128) | (ux2Var2.h(function0) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i2 |= ux2Var2.f(fs4Var) ? 16384 : 8192;
        }
        byte b = 0;
        if (ux2Var2.N(i2 & 1, (74899 & i2) != 74898)) {
            boolean z = (i2 & 14) == 4;
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (z || objK == awVar) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (bt1.B((l33) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                objK = lv0.J0(arrayList, new ix0(set, b));
                ux2Var2.g0(objK);
            }
            List list2 = (List) objK;
            Object[] objArr = new Object[0];
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objK2 = ux2Var2.K();
            if (z2 || objK2 == awVar) {
                objK2 = new y(set, (byte) 28);
                ux2Var2.g0(objK2);
            }
            px4 px4VarN = zu1.N(objArr, a, (Function0) objK2, ux2Var2);
            bw bwVar = iq8.c;
            w50 w50Var = xz2.A;
            kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4Var);
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
            o67.n(kw0VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            String strZ = m77.z(R.string.device_tab_search_groups_placeholder, ux2Var2);
            String strConcat = str.concat("-item");
            int i4 = i2;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(new s14(1.0f, false), str.concat("-list"));
            boolean zF = ux2Var2.f(px4VarN);
            Object objK3 = ux2Var2.K();
            if (zF || objK3 == awVar) {
                objK3 = new va(px4VarN, (byte) 8);
                ux2Var2.g0(objK3);
            }
            Function1 function2 = (Function1) objK3;
            boolean zF2 = ux2Var2.f(px4VarN);
            Object objK4 = ux2Var2.K();
            byte b2 = 9;
            if (zF2 || objK4 == awVar) {
                objK4 = new va(px4VarN, b2);
                ux2Var2.g0(objK4);
            }
            Function1 function3 = (Function1) objK4;
            Object objK5 = ux2Var2.K();
            if (objK5 == awVar) {
                objK5 = new px((byte) 19);
                ux2Var2.g0(objK5);
            }
            Function1 function4 = (Function1) objK5;
            Object objK6 = ux2Var2.K();
            byte b3 = 14;
            if (objK6 == awVar) {
                objK6 = new g9(b3);
                ux2Var2.g0(objK6);
            }
            hw2 hw2Var = (hw2) objK6;
            Object objK7 = ux2Var2.K();
            if (objK7 == awVar) {
                objK7 = new px((byte) 16);
                ux2Var2.g0(objK7);
            }
            vt1.i(list2, function2, function3, function4, hw2Var, fs4VarA, (Function1) objK7, ck3.m, strZ, strConcat, ux2Var2, 14183424);
            ew ewVar = new ew(16.0f, new hk0((byte) 2));
            cs4 cs4Var = cs4.b;
            fs4 fs4VarF = ka0.F(cs4Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            kw0 kw0VarA2 = iw0.a(ewVar, w50Var, ux2Var2, 6);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarF);
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
            boolean zH = ux2Var2.h(list2) | ((i4 & 896) == 256) | ux2Var2.f(px4VarN) | (i3 == 32);
            Object objK8 = ux2Var2.K();
            if (zH || objK8 == awVar) {
                eb ebVar = new eb((Object) list2, (Object) function1, (Object) px4VarN, (Object) set, (byte) 4);
                ux2Var2.g0(ebVar);
                objK8 = ebVar;
            }
            str2 = str;
            m77.g((Function0) objK8, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), str2.concat("-done")), null, false, null, null, ck3.n, ux2Var, 1572864, 60);
            ux2Var2 = ux2Var;
            v67.d(function0, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), str2.concat("-cancel")), null, false, null, ck3.f535o, ux2Var2, ((i4 >> 9) & 14) | 196608, 28);
            ux2Var2.p(true);
            ux2Var2.p(true);
        } else {
            str2 = str;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new nx(list, set, function1, function0, fs4Var, str2, i);
        }
    }

    public static final void d(List list, l33 l33Var, Function1 function1, fs4 fs4Var, long j, ux2 ux2Var, int i) {
        long j2;
        function1.getClass();
        ux2Var.Y(483913778);
        int i2 = i | (ux2Var.f(list) ? 4 : 2) | (ux2Var.h(l33Var) ? 32 : 16) | (ux2Var.d(R.drawable.ic_group_legacy) ? 256 : 128) | (ux2Var.h(function1) ? 2048 : 1024) | (ux2Var.f(fs4Var) ? 16384 : 8192) | 14352384;
        if (ux2Var.N(i2 & 1, (4793491 & i2) != 4793490)) {
            long j3 = rv0.h;
            String strZ = m77.z(R.string.device_tab_add_device_bottom_sheet_search_group_placeholder, ux2Var);
            ux2Var.W(-1928658215);
            ux2Var.p(false);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new px((byte) 18);
                ux2Var.g0(objK);
            }
            Function1 function2 = (Function1) objK;
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = new g9((byte) 13);
                ux2Var.g0(objK2);
            }
            zu1.k(list, l33Var, function1, function2, (hw2) objK2, fs4Var, au8.O(82862290, new p20((byte) 3), ux2Var), null, strZ, ux2Var, ((i2 << 3) & 458752) | (i2 & 14) | 1600512 | (i2 & 112) | ((i2 >> 3) & 896) | 12582912, 0);
            j2 = j3;
        } else {
            ux2Var.Q();
            j2 = j;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new dx0(list, l33Var, function1, fs4Var, j2, i);
        }
    }

    public static final void e(int i, String str, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i2;
        String str2;
        Function0 function1;
        ux2 ux2Var2 = ux2Var;
        str.getClass();
        function0.getClass();
        ux2Var2.Y(2082495712);
        if ((i & 6) == 0) {
            i2 = (ux2Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        int i3 = i2;
        if (ux2Var2.N(i3 & 1, (i3 & 147) != 146)) {
            hk6 hk6VarW = im3.W(ux2Var2);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ck3.w(ux2Var2);
                ux2Var2.g0(objK);
            }
            fs4 fs4VarD = ka0.D(o77.t(fs4Var, hk6VarW, (me1) objK), 16.0f, 0.0f, 2);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarD);
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
            x50 x50Var = xz2.y;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(ka0.E(cs4Var, 16.0f, 12.0f, 24.0f, 36.0f), 1.0f);
            dg6 dg6VarA = cg6.a(iq8.a, x50Var, ux2Var2, 48);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarC);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            ud5 ud5VarT = lv1.T(R.drawable.ic_no_permission, ux2Var2, 0);
            String strZ = m77.z(R.string.add_remote_device_no_permission_content_description, ux2Var2);
            h72 h72Var = un4.a;
            td3.b(ud5VarT, strZ, androidx.compose.foundation.layout.b.l(androidx.compose.ui.platform.a.a(ka0.B(au8.s(ka0.F(cs4Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), ((rn4) ux2Var2.j(h72Var)).a.c, sf6.a), 8.0f), "TVTA-devices-add-remote-device-to-your-account-bottom-sheet-no-permission-icon"), 24.0f), ((rn4) ux2Var2.j(h72Var)).a.d, ux2Var2, 8, 0);
            qs7.b(str, androidx.compose.ui.platform.a.a(new s14(1.0f, true), "TVTA-devices-add-remote-device-to-your-account-bottom-sheet-no-permission-text"), ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.k, ux2Var, i3 & 14, 0, 131064);
            str2 = str;
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            fs4 fs4VarC2 = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            boolean z2 = (i3 & 112) == 32;
            Object objK2 = ux2Var2.K();
            if (z2 || objK2 == awVar) {
                function1 = function0;
                objK2 = new a9(function1, (byte) 9);
                ux2Var2.g0(objK2);
            } else {
                function1 = function0;
            }
            m77.g((Function0) objK2, fs4VarC2, null, false, null, null, ck3.q, ux2Var2, 1572912, 60);
            ux2Var2.p(true);
        } else {
            str2 = str;
            function1 = function0;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new i60(str2, function1, fs4Var, i);
        }
    }

    public static final String f(List list, ux2 ux2Var) {
        list.getClass();
        ux2Var.W(446966420);
        ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((l33) it.next()).b;
            if (str == null) {
                str = "";
            }
            arrayList.add(m77.A(R.string.select_groups_quoted_group_name, new Object[]{str}, ux2Var));
        }
        ux2Var.p(false);
        return m77.A(list.size() == 1 ? R.string.select_groups_no_permission_error_one : R.string.select_groups_no_permission_error_other, new Object[]{lv0.t0(arrayList, ", ", null, null, null, 62)}, ux2Var);
    }

    public static final String g(List list, ux2 ux2Var) {
        list.getClass();
        l33 l33Var = (l33) lv0.o0(list);
        String str = l33Var != null ? l33Var.b : null;
        if (str == null) {
            str = "";
        }
        int size = list.size() - 1;
        if (size <= 0) {
            ux2Var.W(1974781632);
            ux2Var.p(false);
            return str;
        }
        if (size == 1) {
            ux2Var.W(1974783174);
            String strA = m77.A(R.string.selected_groups_summary_one, new Object[]{str, Integer.valueOf(size)}, ux2Var);
            ux2Var.p(false);
            return strA;
        }
        ux2Var.W(1974786408);
        String strA2 = m77.A(R.string.selected_groups_summary_other, new Object[]{str, Integer.valueOf(size)}, ux2Var);
        ux2Var.p(false);
        return strA2;
    }
}
