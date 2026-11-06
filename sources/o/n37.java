package o;

import android.content.res.Resources;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class n37 {
    public static boolean a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static String f;

    public static final void a(o37 o37Var, fs4 fs4Var, yy0 yy0Var, ux2 ux2Var, int i) {
        Object obj;
        boolean z;
        ux2Var.Y(-977568115);
        int i2 = (i & 6) == 0 ? (ux2Var.f(o37Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 256 : 128;
        }
        boolean z2 = true;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            String strO = o(R.string.m3c_snackbar_pane_title, ux2Var);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                obj = objK;
                kh2 kh2Var = new kh2();
                kh2Var.a = new Object();
                kh2Var.b = new ArrayList();
                ux2Var.g0(kh2Var);
                obj = kh2Var;
            }
            obj = objK;
            kh2 kh2Var2 = (kh2) obj;
            Object obj2 = kh2Var2.a;
            ArrayList arrayList = kh2Var2.b;
            if (im3.n(o37Var, obj2)) {
                z = true;
                ux2Var.W(1443889109);
                ux2Var.p(false);
            } else {
                ux2Var.W(1441886385);
                kh2Var2.a = o37Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((o37) ((jh2) arrayList.get(i3)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(o37Var)) {
                    arrayList3.add(o37Var);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj3 = arrayList3.get(i4);
                    if (obj3 != null) {
                        arrayList4.add(obj3);
                    }
                }
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    o37 o37Var2 = (o37) arrayList4.get(i5);
                    arrayList.add(new jh2(o37Var2, au8.O(-1952400805, new q34(o37Var2, o37Var, kh2Var2, strO, (byte) 9), ux2Var)));
                    i5++;
                    z2 = z2;
                }
                z = z2;
                ux2Var.p(false);
            }
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
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
            j56 j56VarW = ux2Var.w();
            if (j56VarW == null) {
                hk0.l("no recompose scope found");
                return;
            }
            j56VarW.b |= 1;
            kh2Var2.c = j56VarW;
            ux2Var.W(-1888182177);
            int size4 = arrayList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                jh2 jh2Var = (jh2) arrayList.get(i6);
                Object obj4 = (o37) jh2Var.a;
                yy0 yy0Var2 = jh2Var.b;
                ux2Var.U(1325010085, obj4);
                yy0Var2.d(au8.O(-1893791890, new l64(yy0Var, obj4, (byte) 20), ux2Var), ux2Var, 6);
                ux2Var.p(false);
            }
            ux2Var.p(false);
            ux2Var.p(z);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) o37Var, (Object) fs4Var, (Object) yy0Var, i, (byte) 23);
        }
    }

    public static final void b(q37 q37Var, yy0 yy0Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-1077081618);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(q37Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        cs4 cs4Var = cs4.b;
        if (i3 == 0) {
            i2 |= ux2Var.f(cs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            Object objA = q37Var.a();
            Object obj = (u3) ux2Var.j(b11.a);
            boolean zF = ux2Var.f(objA) | ux2Var.h(obj);
            Object objK = ux2Var.K();
            if (zF || objK == e01.a) {
                objK = new vt4(objA, obj, null, (byte) 22);
                ux2Var.g0(objK);
            }
            ck3.i(objA, (hw2) objK, ux2Var);
            a(q37Var.a(), cs4Var, yy0Var, ux2Var, i2 & 1008);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pa(q37Var, yy0Var, i);
        }
    }

    public static final void c(tf2 tf2Var, zv0 zv0Var, tx6 tx6Var, h68 h68Var, yy0 yy0Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(1883145848);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(tf2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(zv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 16384 : 8192;
        }
        if (ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                h72 h72Var = un4.a;
                tx6 tx6Var2 = ((rn4) ux2Var.j(h72Var)).c;
                h68Var = ((rn4) ux2Var.j(h72Var)).b;
                tx6Var = tx6Var2;
            } else {
                ux2Var.Q();
            }
            ux2Var.q();
            j51.l(vf2.a.a(tf2Var), au8.O(-87930056, new sn4(zv0Var, tx6Var, h68Var, yy0Var), ux2Var), ux2Var, 56);
        } else {
            ux2Var.Q();
        }
        tx6 tx6Var3 = tx6Var;
        h68 h68Var2 = h68Var;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a50((Object) tf2Var, (Object) zv0Var, tx6Var3, h68Var2, yy0Var, i, (byte) 5);
        }
    }

    public static final void d(int i, String str, String str2, ux2 ux2Var, fs4 fs4Var) {
        int i2;
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        str.getClass();
        ux2Var2.Y(1767098285);
        if ((i & 6) == 0) {
            i2 = (ux2Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= ux2Var2.f(str2) ? 256 : 128;
        }
        int i4 = i3;
        if (ux2Var2.N(i4 & 1, (i4 & 147) != 146)) {
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            do4 do4VarC = ua0.c(xz2.s, false);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fillElement);
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
            o67.n(do4VarC, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.B, ux2Var2, 48);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS2 = uf0.s(ux2Var2, cs4Var);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            qs1.l(re3.a((f62) b62.i.getValue(), ux2Var2), null, null, null, null, 0.0f, null, ux2Var2, 56, 124);
            qs7.b(str, androidx.compose.ui.platform.a.a(cs4Var, str2 + "-TVWebViewErrorText"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, i4 & 14, 0, 262140);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new v35(str, fs4Var2, str2, i);
        }
    }

    public static final void e(fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2Var.Y(-1230621631);
        int i2 = i | 6;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            h72 h72Var = un4.a;
            fs4 fs4VarS = au8.s(fillElement, ((rn4) ux2Var.j(h72Var)).a.p, kh.V);
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarS);
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
            o67.n(fs4VarS2, d82.t, ux2Var);
            fs4Var2 = cs4.b;
            st5.a(ya0.a.a(androidx.compose.foundation.layout.b.l(fs4Var2, 50.0f), xz2.s), ((rn4) ux2Var.j(h72Var)).a.a, 0.0f, 0L, 0, 0.0f, ux2Var, 0, 60);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var2, i, (byte) 9);
        }
    }

    public static final void f(boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        function1.getClass();
        ux2Var.Y(-811317515);
        int i2 = i | (ux2Var.g(z) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | 384;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 3;
            cs4 cs4Var = cs4.b;
            l47.d(new sk7(y57.g(R.string.settings_hide_wallpaper), y57.g(R.string.settings_hide_wallpaper_subtitle), new yk7(R.drawable.wallpaper), null, 24), z, function1, cs4Var, "TVTA-settings-wallpaper", m77.z(R.string.settings_hide_wallpaper, ux2Var), ux2Var, (i3 & 896) | (i3 & 112) | 24576 | 3072, 32);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new lc(z, function1, fs4Var2, i, (byte) 6);
        }
    }

    public static float g(int i) {
        Set set = ol8.n;
        if (i == 2) {
            return 840.0f;
        }
        return i == 1 ? 600.0f : 0.0f;
    }

    public static final boolean h(oz3 oz3Var, k48 k48Var, Set set) {
        boolean zH;
        if (im3.n(oz3Var.o0(), k48Var)) {
            return true;
        }
        ys0 ys0VarA = oz3Var.o0().a();
        zs0 zs0Var = ys0VarA instanceof zs0 ? (zs0) ys0VarA : null;
        List listK0 = zs0Var != null ? zs0Var.k0() : null;
        Iterable iterableU0 = lv0.U0(oz3Var.m0());
        if (!(iterableU0 instanceof Collection) || !((Collection) iterableU0).isEmpty()) {
            Iterator it = iterableU0.iterator();
            do {
                p62 p62Var = (p62) it;
                if (p62Var.n.hasNext()) {
                    sg3 sg3Var = (sg3) p62Var.next();
                    int i = sg3Var.a;
                    h58 h58Var = (h58) sg3Var.b;
                    d58 d58Var = listK0 != null ? (d58) lv0.p0(i, listK0) : null;
                    if ((d58Var == null || set == null || !set.contains(d58Var)) && !h58Var.c()) {
                        oz3 oz3VarB = h58Var.b();
                        oz3VarB.getClass();
                        zH = h(oz3VarB, k48Var, set);
                    } else {
                        zH = false;
                    }
                }
            } while (!zH);
            return true;
        }
        return false;
    }

    public static final w87 i(oz3 oz3Var, ub8 ub8Var, d58 d58Var) {
        oz3Var.getClass();
        if ((d58Var != null ? d58Var.B() : null) == ub8Var) {
            ub8Var = ub8.f2197o;
        }
        return new w87(oz3Var, ub8Var);
    }

    public static final void l(oz3 oz3Var, g07 g07Var, LinkedHashSet linkedHashSet, Set set) {
        ys0 ys0VarA = oz3Var.o0().a();
        if (ys0VarA instanceof d58) {
            if (!im3.n(oz3Var.o0(), g07Var.o0())) {
                linkedHashSet.add(ys0VarA);
                return;
            }
            for (oz3 oz3Var2 : ((d58) ys0VarA).getUpperBounds()) {
                oz3Var2.getClass();
                l(oz3Var2, g07Var, linkedHashSet, set);
            }
            return;
        }
        ys0 ys0VarA2 = oz3Var.o0().a();
        zs0 zs0Var = ys0VarA2 instanceof zs0 ? (zs0) ys0VarA2 : null;
        List listK0 = zs0Var != null ? zs0Var.k0() : null;
        int i = 0;
        for (h58 h58Var : oz3Var.m0()) {
            int i2 = i + 1;
            d58 d58Var = listK0 != null ? (d58) lv0.p0(i, listK0) : null;
            if ((d58Var == null || set == null || !set.contains(d58Var)) && !h58Var.c() && !lv0.h0(linkedHashSet, h58Var.b().o0().a()) && !im3.n(h58Var.b().o0(), g07Var.o0())) {
                oz3 oz3VarB = h58Var.b();
                oz3VarB.getClass();
                l(oz3VarB, g07Var, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static final wy3 m(oz3 oz3Var) {
        oz3Var.getClass();
        wy3 wy3VarH = oz3Var.o0().h();
        wy3VarH.getClass();
        return wy3VarH;
    }

    public static final oz3 n(d58 d58Var) {
        Object obj;
        List upperBounds = d58Var.getUpperBounds();
        upperBounds.getClass();
        upperBounds.isEmpty();
        List upperBounds2 = d58Var.getUpperBounds();
        upperBounds2.getClass();
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ys0 ys0VarA = ((oz3) next).o0().a();
            ns4 ns4Var = ys0VarA instanceof ns4 ? (ns4) ys0VarA : null;
            if (ns4Var != null && ns4Var.i0() != ms0.n && ns4Var.i0() != ms0.q) {
                obj = next;
                break;
            }
        }
        oz3 oz3Var = (oz3) obj;
        if (oz3Var != null) {
            return oz3Var;
        }
        List upperBounds3 = d58Var.getUpperBounds();
        upperBounds3.getClass();
        Object objM0 = lv0.m0(upperBounds3);
        objM0.getClass();
        return (oz3) objM0;
    }

    public static final String o(int i, ux2 ux2Var) {
        ux2Var.j(lh.a);
        return ((Resources) ux2Var.j(lh.c)).getString(i);
    }

    public static final boolean p(d58 d58Var, k48 k48Var, Set set) {
        d58Var.getClass();
        List<oz3> upperBounds = d58Var.getUpperBounds();
        upperBounds.getClass();
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (oz3 oz3Var : upperBounds) {
            oz3Var.getClass();
            if (h(oz3Var, d58Var.W().o0(), set) && (k48Var == null || im3.n(oz3Var.o0(), k48Var))) {
                return true;
            }
        }
        return false;
    }

    public static u77 q(String str, String str2, String str3, String str4) {
        return new u77(str, sy4.e(str2), str3, str4);
    }

    public static long r(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public static final oz3 s(oz3 oz3Var, up upVar) {
        return (oz3Var.getAnnotations().isEmpty() && upVar.isEmpty()) ? oz3Var : oz3Var.r0().u0(i67.x(oz3Var.n0(), upVar));
    }

    public static final m98 t(oz3 oz3Var) {
        g07 g07Var;
        m98 m98VarY;
        oz3Var.getClass();
        m98 m98VarR0 = oz3Var.r0();
        if (m98VarR0 instanceof um2) {
            um2 um2Var = (um2) m98VarR0;
            g07 g07VarY = um2Var.n;
            if (!g07VarY.o0().getParameters().isEmpty() && g07VarY.o0().a() != null) {
                List parameters = g07VarY.o0().getParameters();
                parameters.getClass();
                ArrayList arrayList = new ArrayList(mv0.Z(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new w87((d58) it.next()));
                }
                g07VarY = m77.y(g07VarY, arrayList, null, 2);
            }
            g07 g07VarY2 = um2Var.f2226o;
            if (!g07VarY2.o0().getParameters().isEmpty() && g07VarY2.o0().a() != null) {
                List parameters2 = g07VarY2.o0().getParameters();
                parameters2.getClass();
                ArrayList arrayList2 = new ArrayList(mv0.Z(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new w87((d58) it2.next()));
                }
                g07VarY2 = m77.y(g07VarY2, arrayList2, null, 2);
            }
            m98VarY = bt1.v(g07VarY, g07VarY2);
        } else {
            if (!(m98VarR0 instanceof g07)) {
                gk0.s();
                return null;
            }
            g07Var = (g07) m98VarR0;
            if (!g07Var.o0().getParameters().isEmpty() && g07Var.o0().a() != null) {
                m98VarY = g07Var;
                m98VarY = g07Var;
                List parameters3 = g07Var.o0().getParameters();
                parameters3.getClass();
                ArrayList arrayList3 = new ArrayList(mv0.Z(parameters3, 10));
                Iterator it3 = parameters3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new w87((d58) it3.next()));
                }
                m98VarY = m77.y(g07Var, arrayList3, null, 2);
            }
        }
        m98VarY = g07Var;
        m98VarY = g07Var;
        m98VarY = g07Var;
        return x37.m(m98VarY, m98VarR0);
    }

    public static /* synthetic */ boolean u(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, vs8 vs8Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(vs8Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(vs8Var) != obj && atomicReferenceFieldUpdater.get(vs8Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public abstract String j(byte[] bArr, int i, int i2);

    public abstract int k(int i, int i2, String str, byte[] bArr);
}
