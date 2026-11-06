package o;

import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.hardware.Camera;
import android.view.DragEvent;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionRecipientStatus;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionType;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.IPredefinedShortcutsViewModel;
import com.teamviewer.remotecontrollib.swig.PredefinedShortcutsViewModelFactorySWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class wo1 {
    public static vi a;
    public static cg b;
    public static nl0 c;
    public static int d;
    public static j93 e;
    public static wj5 f;

    public static final int A(oz3 oz3Var) {
        oz3Var.getClass();
        hp hpVarU = oz3Var.getAnnotations().u(s87.q);
        if (hpVarU == null) {
            return 0;
        }
        u51 u51Var = (u51) xm4.P(t87.e, hpVarU.e());
        u51Var.getClass();
        return ((Number) ((el3) u51Var).a).intValue();
    }

    public static final g07 B(wy3 wy3Var, up upVar, oz3 oz3Var, List list, ArrayList arrayList, oz3 oz3Var2, boolean z) {
        ns4 ns4VarJ;
        up wpVar = yl7.p;
        byte b2 = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (oz3Var != null ? 1 : 0) + 1);
        ArrayList arrayList3 = new ArrayList(mv0.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oz3 oz3Var3 = (oz3) it.next();
            oz3Var3.getClass();
            arrayList3.add(new w87(oz3Var3));
        }
        arrayList2.addAll(arrayList3);
        w87 w87Var = oz3Var != null ? new w87(oz3Var) : null;
        if (w87Var != null) {
            arrayList2.add(w87Var);
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                qf0.U();
                throw null;
            }
            oz3 oz3Var4 = (oz3) obj;
            oz3Var4.getClass();
            arrayList2.add(new w87(oz3Var4));
            i = i2;
        }
        arrayList2.add(new w87(oz3Var2));
        int size = list.size() + arrayList.size() + (oz3Var == null ? 0 : 1);
        if (z) {
            ns4VarJ = wy3Var.v(size);
        } else {
            sy4 sy4Var = t87.a;
            ns4VarJ = wy3Var.j("Function" + size);
        }
        if (oz3Var != null) {
            ht2 ht2Var = s87.p;
            if (!upVar.o0(ht2Var)) {
                ArrayList arrayListZ0 = lv0.z0(upVar, new tf0(wy3Var, ht2Var, fa2.m));
                upVar = arrayListZ0.isEmpty() ? wpVar : new wp(arrayListZ0, b2);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            ht2 ht2Var2 = s87.q;
            if (!upVar.o0(ht2Var2)) {
                Map mapSingletonMap = Collections.singletonMap(t87.e, new el3(size2));
                mapSingletonMap.getClass();
                ArrayList arrayListZ1 = lv0.z0(upVar, new tf0(wy3Var, ht2Var2, mapSingletonMap));
                if (!arrayListZ1.isEmpty()) {
                    wpVar = new wp(arrayListZ1, b2);
                }
                upVar = wpVar;
            }
        }
        return bt1.O(i67.C(upVar), ns4VarJ, arrayList2);
    }

    public static final void C(u52 u52Var, float f2, float f3) {
        rj rjVarA = tj.a();
        float fD0 = u52Var.d0(f3);
        float f4 = f2 + 20.0f;
        float fD1 = u52Var.d0(f4);
        Path path = rjVarA.a;
        path.moveTo(fD0, fD1);
        rjVarA.e(u52Var.d0(f3), u52Var.d0(f2 + 40.0f));
        float fD2 = u52Var.d0(f3 + 20.0f);
        float fD3 = u52Var.d0(f4);
        v56 v56VarU = qs1.u(u52Var.d0(20.0f), (((long) Float.floatToRawIntBits(fD2)) << 32) | (((long) Float.floatToRawIntBits(fD3)) & 4294967295L));
        rj.i(v56VarU);
        RectF rectF = rjVarA.b;
        if (rectF == null) {
            rectF = new RectF();
            rjVarA.b = rectF;
        }
        rectF.set(v56VarU.a, v56VarU.b, v56VarU.c, v56VarU.d);
        RectF rectF2 = rjVarA.b;
        rectF2.getClass();
        path.addArc(rectF2, 180.0f, 90.0f);
        rjVarA.e(u52Var.d0(f3 + 40.0f), u52Var.d0(f2));
        u52Var.i0(rjVarA, rv0.d, new cc7(u52Var.d0(2.0f), 0.0f, 0, 0, 30));
    }

    public static final sy4 D(oz3 oz3Var) {
        String str;
        hp hpVarU = oz3Var.getAnnotations().u(s87.r);
        if (hpVarU != null) {
            Object objG0 = lv0.G0(hpVarU.e().values());
            qb7 qb7Var = objG0 instanceof qb7 ? (qb7) objG0 : null;
            if (qb7Var != null && (str = (String) qb7Var.a) != null) {
                if (!sy4.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return sy4.e(str);
                }
            }
        }
        return null;
    }

    public static qb8 E(sy4 sy4Var, ns4 ns4Var) {
        if (sy4Var == null) {
            a(19);
            throw null;
        }
        if (ns4Var == null) {
            a(20);
            throw null;
        }
        Collection collectionZ = ns4Var.z();
        if (collectionZ.size() != 1) {
            return null;
        }
        for (qb8 qb8Var : ((wr0) collectionZ.iterator().next()).J()) {
            if (qb8Var.getName().equals(sy4Var)) {
                return qb8Var;
            }
        }
        return null;
    }

    public static int F(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            io.sentry.android.core.v0.j("o.wo1", "No cameras!");
            return -1;
        }
        boolean z = i >= 0;
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        if (i < numberOfCameras) {
            return i;
        }
        return z ? -1 : 0;
    }

    public static final List G(oz3 oz3Var) {
        oz3Var.getClass();
        P(oz3Var);
        int iA = A(oz3Var);
        if (iA == 0) {
            return ea2.m;
        }
        List listSubList = oz3Var.m0().subList(0, iA);
        ArrayList arrayList = new ArrayList(mv0.Z(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((h58) it.next()).b());
        }
        return arrayList;
    }

    public static final hx2 H(ys0 ys0Var) {
        if (!(ys0Var instanceof ns4) || !wy3.I(ys0Var)) {
            return null;
        }
        int i = bp1.a;
        it2 it2VarG = zo1.g(ys0Var);
        it2VarG.getClass();
        if (!it2VarG.d() || it2VarG.a.isEmpty()) {
            return null;
        }
        jx2 jx2Var = jx2.c;
        ht2 ht2VarE = it2VarG.g().e();
        String strB = it2VarG.f().b();
        strB.getClass();
        jx2Var.getClass();
        ix2 ix2VarA = jx2Var.a(strB, ht2VarE);
        if (ix2VarA != null) {
            return ix2VarA.a;
        }
        return null;
    }

    public static final boolean I(ot7 ot7Var) {
        gm5 gm5Var;
        wm5 wm5Var = ot7Var.c;
        o92 o92Var = (wm5Var == null || (gm5Var = wm5Var.b) == null) ? null : new o92(gm5Var.b);
        boolean z = false;
        if (o92Var != null && o92Var.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final wt3 J(ju3 ju3Var) {
        if (ju3Var instanceof wt3) {
            return (wt3) ju3Var;
        }
        Object obj = null;
        if (!(ju3Var instanceof rw3)) {
            hk0.q(ju3Var, "Cannot calculate JVM erasure for type: ");
            return null;
        }
        u86 u86Var = ((rw3) ju3Var).n;
        fw3 fw3Var = rw3.p[0];
        Object objA = u86Var.a();
        objA.getClass();
        List list = (List) objA;
        for (Object obj2 : list) {
            ow3 ow3Var = (ow3) obj2;
            ow3Var.getClass();
            ys0 ys0VarA = ((qw3) ow3Var).m.o0().a();
            ns4 ns4Var = ys0VarA instanceof ns4 ? (ns4) ys0VarA : null;
            if (ns4Var != null && ns4Var.i0() != ms0.n && ns4Var.i0() != ms0.q) {
                obj = obj2;
                break;
            }
        }
        ow3 ow3Var2 = (ow3) obj;
        if (ow3Var2 == null) {
            ow3Var2 = (ow3) lv0.o0(list);
        }
        return ow3Var2 != null ? K(ow3Var2) : w86.a.b(Object.class);
    }

    public static final wt3 K(ow3 ow3Var) {
        ju3 ju3VarH = ((qw3) ow3Var).h();
        if (ju3VarH != null) {
            return J(ju3VarH);
        }
        hk0.q(ow3Var, "Cannot calculate JVM erasure for type: ");
        return null;
    }

    public static final Object L(zn4 zn4Var) {
        Object objE = zn4Var.E();
        n04 n04Var = objE instanceof n04 ? (n04) objE : null;
        if (n04Var != null) {
            return n04Var.A;
        }
        return null;
    }

    public static final long M(xk1 xk1Var) {
        DragEvent dragEvent = (DragEvent) xk1Var.n;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static final oz3 N(oz3 oz3Var) {
        oz3Var.getClass();
        P(oz3Var);
        if (oz3Var.getAnnotations().u(s87.p) == null) {
            return null;
        }
        return ((h58) oz3Var.m0().get(A(oz3Var))).b();
    }

    public static final List O(oz3 oz3Var) {
        oz3Var.getClass();
        P(oz3Var);
        List listM0 = oz3Var.m0();
        return listM0.subList(((!P(oz3Var) || oz3Var.getAnnotations().u(s87.p) == null) ? 0 : 1) + A(oz3Var), listM0.size() - 1);
    }

    public static final boolean P(oz3 oz3Var) {
        oz3Var.getClass();
        ys0 ys0VarA = oz3Var.o0().a();
        if (ys0VarA == null) {
            return false;
        }
        hx2 hx2VarH = H(ys0VarA);
        return im3.n(hx2VarH, dx2.c) || im3.n(hx2VarH, gx2.c);
    }

    public static boolean Q(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = hw0.a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            hk0.g("outXyz must have a length of 3.");
            return false;
        }
        double d2 = ((double) iRed) / 255.0d;
        double dPow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iGreen) / 255.0d;
        double dPow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = ((double) iBlue) / 255.0d;
        double dPow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d5 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d5;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d5 / 100.0d > 0.5d;
    }

    public static int R(float f2, int i, int i2) {
        return hw0.b(hw0.d(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static SupportSession S(String str, int i, SupportSessionRecipientStatus supportSessionRecipientStatus, OffsetDateTime offsetDateTime, SupportSessionType supportSessionType, int i2) {
        Boolean bool = Boolean.TRUE;
        int i3 = (i2 & 4) != 0 ? 123 : i;
        Boolean bool2 = (i2 & 8) != 0 ? null : bool;
        SupportSessionRecipientStatus supportSessionRecipientStatus2 = (i2 & 16) != 0 ? SupportSessionRecipientStatus.Ready : supportSessionRecipientStatus;
        OffsetDateTime offsetDateTime2 = (i2 & 32) != 0 ? null : offsetDateTime;
        SupportSessionType supportSessionType2 = (i2 & 64) != 0 ? SupportSessionType.RemoteControl : supportSessionType;
        OffsetDateTime offsetDateTime3 = OffsetDateTime.parse("2024-01-01T00:00:00Z");
        offsetDateTime3.getClass();
        OffsetDateTime offsetDateTime4 = OffsetDateTime.parse("2024-01-01T01:00:00Z");
        offsetDateTime4.getClass();
        return new SupportSession(12345678, offsetDateTime3, offsetDateTime4, "https://quicksupport.me/s12345678", supportSessionRecipientStatus2, i3, 123, offsetDateTime2, str, null, supportSessionType2, null, null, null, null, null, null, null, null, bool2, 522752, null);
    }

    public static final List T(ug6 ug6Var) {
        int iR = bt1.r(ug6Var, "id");
        int iR2 = bt1.r(ug6Var, "seq");
        int iR3 = bt1.r(ug6Var, "from");
        int iR4 = bt1.r(ug6Var, "to");
        sa4 sa4VarT = qf0.t();
        while (ug6Var.F0()) {
            sa4VarT.add(new vs2(ug6Var.h0(iR3), (int) ug6Var.getLong(iR), (int) ug6Var.getLong(iR2), ug6Var.h0(iR4)));
        }
        return lv0.I0(qf0.r(sa4VarT));
    }

    public static final en7 U(pg6 pg6Var, String str, boolean z) {
        ug6 ug6VarJ0 = pg6Var.J0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iR = bt1.r(ug6VarJ0, "seqno");
            int iR2 = bt1.r(ug6VarJ0, "cid");
            int iR3 = bt1.r(ug6VarJ0, "name");
            int iR4 = bt1.r(ug6VarJ0, "desc");
            if (iR != -1 && iR2 != -1 && iR3 != -1 && iR4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (ug6VarJ0.F0()) {
                    if (((int) ug6VarJ0.getLong(iR2)) >= 0) {
                        int i = (int) ug6VarJ0.getLong(iR);
                        String strH0 = ug6VarJ0.h0(iR3);
                        String str2 = ug6VarJ0.getLong(iR4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strH0);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listJ0 = lv0.J0(linkedHashMap.entrySet(), new gj2((byte) 29));
                ArrayList arrayList = new ArrayList(mv0.Z(listJ0, 10));
                Iterator it = listJ0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listP0 = lv0.P0(arrayList);
                List listJ1 = lv0.J0(linkedHashMap2.entrySet(), new dj6((byte) 0));
                ArrayList arrayList2 = new ArrayList(mv0.Z(listJ1, 10));
                Iterator it2 = listJ1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                en7 en7Var = new en7(str, z, listP0, lv0.P0(arrayList2));
                iq8.l(ug6VarJ0, null);
                return en7Var;
            }
            iq8.l(ug6VarJ0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq8.l(ug6VarJ0, th);
                throw th2;
            }
        }
    }

    public static LinkedHashSet V(sy4 sy4Var, Collection collection, Collection collection2, ns4 ns4Var, ad2 ad2Var, hc5 hc5Var, boolean z) {
        if (collection == null) {
            a(13);
            throw null;
        }
        if (ns4Var == null) {
            a(15);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        hc5Var.h(sy4Var, collection, collection2, ns4Var, new vo1(ad2Var, linkedHashSet, z));
        return linkedHashSet;
    }

    public static LinkedHashSet W(sy4 sy4Var, AbstractCollection abstractCollection, Collection collection, ns4 ns4Var, ad2 ad2Var, hc5 hc5Var) {
        if (ns4Var != null) {
            return V(sy4Var, abstractCollection, collection, ns4Var, ad2Var, hc5Var, false);
        }
        a(3);
        throw null;
    }

    public static LinkedHashSet X(sy4 sy4Var, Collection collection, AbstractCollection abstractCollection, ns4 ns4Var, hc5 hc5Var) {
        jk0 jk0Var = jk0.H;
        if (collection == null) {
            a(7);
            throw null;
        }
        if (ns4Var != null) {
            return V(sy4Var, collection, abstractCollection, ns4Var, jk0Var, hc5Var, true);
        }
        a(9);
        throw null;
    }

    public static final int Y(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static final ho6 Z(final io.sentry.android.core.n1 n1Var, final rr0 rr0Var, ho6 ho6Var) {
        ef1 ef1Var;
        int i = rr0Var.c;
        int i2 = rr0Var.b;
        boolean z = n1Var.n;
        final int i3 = z ? i2 : i;
        vs7 vs7Var = (vs7) rr0Var.e;
        int i4 = rr0Var.d;
        e83 e83Var = new e83(i3, rr0Var);
        l54 l54Var = l54.n;
        final u14 u14VarX = ds1.X(l54Var, e83Var);
        final int i5 = z ? i : i2;
        u14 u14VarX2 = ds1.X(l54Var, new Function0() { // from class: o.ko6
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                rr0 rr0Var2 = rr0Var;
                vs7 vs7Var2 = (vs7) rr0Var2.e;
                int iIntValue = ((Number) u14VarX.getValue()).intValue();
                io.sentry.android.core.n1 n1Var2 = n1Var;
                boolean z2 = n1Var2.n;
                boolean z3 = n1Var2.h() == ef1.m;
                int i6 = i3;
                long j = vs7Var2.j(i6);
                xu4 xu4Var = vs7Var2.b;
                int i7 = gt7.c;
                int iG = (int) (j >> 32);
                int i8 = xu4Var.f;
                if (xu4Var.d(iG) != iIntValue) {
                    iG = iIntValue >= i8 ? vs7Var2.g(i8 - 1) : vs7Var2.g(iIntValue);
                }
                int iC = (int) (j & 4294967295L);
                if (xu4Var.d(iC) != iIntValue) {
                    iC = iIntValue >= i8 ? xu4Var.c(i8 - 1, false) : xu4Var.c(iIntValue, false);
                }
                int i9 = i5;
                if (iG == i9) {
                    return rr0Var2.d(iC);
                }
                if (iC == i9) {
                    return rr0Var2.d(iG);
                }
                if (!(z2 ^ z3) ? i6 >= iG : i6 > iC) {
                    iG = iC;
                }
                return rr0Var2.d(iG);
            }
        });
        if (1 != ho6Var.c) {
            return (ho6) u14VarX2.getValue();
        }
        if (i3 == i4) {
            return ho6Var;
        }
        if (((Number) u14VarX.getValue()).intValue() != vs7Var.b.d(i4)) {
            return (ho6) u14VarX2.getValue();
        }
        int i6 = ho6Var.b;
        long j = vs7Var.j(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                ef1 ef1Var2 = ef1.m;
                if (i2 < i) {
                    ef1Var = ef1.n;
                } else {
                    ef1Var = i2 > i ? ef1Var2 : ef1.f707o;
                }
                if (!((ef1Var == ef1Var2) ^ z)) {
                }
            }
            return rr0Var.d(i3);
        }
        int i7 = gt7.c;
        return (i6 == ((int) (j >> 32)) || i6 == ((int) (4294967295L & j))) ? (ho6) u14VarX2.getValue() : rr0Var.d(i3);
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case ep1.b /* 9 */:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case ep1.c /* 10 */:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case ep1.d /* 12 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            default:
                objArr[0] = "name";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static final void b(String str, boolean z, f74 f74Var, Function0 function0, ux2 ux2Var, int i) {
        int i2;
        long jI;
        long jI2;
        ux2Var.Y(-1395697474);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(f74Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.h(function0) ? 2048 : 1024;
        }
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            xl1 xl1Var = f74Var.a;
            am1 am1Var = f74Var.e;
            if (z) {
                long j = xl1Var.e;
                jI = rv0.g;
                jI2 = et1.I(j, jI);
            } else {
                jI = rv0.g;
                jI2 = jI;
            }
            long jI3 = et1.I(z ? xl1Var.f : xl1Var.h, rv0.b);
            if (!z) {
                jI = et1.I(xl1Var.g, rv0.b(0.4f, jI3));
            }
            fs4 fs4VarA = ka0.A(androidx.compose.foundation.b.b(uf0.i(au8.s(iq8.j(cs4.b, am1Var.b), jI2, kh.V), z ? 0.0f : 1.0f, jI, am1Var.b), false, null, new pe6(0), function0, 11), f74Var.b.d);
            do4 do4VarC = ua0.c(xz2.f2564o, false);
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
            o67.n(do4VarC, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            j51.e(str, null, ot7.a(f74Var.d.h, jI3, 0L, null, null, 0L, 0L, null, 16777214), null, 2, false, 1, 0, ux2Var, (i2 & 14) | 1597440, 938);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new uu(str, z, f74Var, function0, i);
        }
    }

    public static final void c(final gw1 gw1Var, final xv1 xv1Var, final List list, final boolean z, final Function0 function0, final Function1 function1, final Function1 function2, final Function0 function3, final Function1 function4, final Function1 function5, final Function1 function6, fs4 fs4Var, ux2 ux2Var, final int i) {
        final fs4 fs4Var2;
        Object obj;
        int i2;
        vs1 pz1Var;
        boolean z2;
        Object obj2;
        Object obj3;
        gw1Var.getClass();
        xv1Var.getClass();
        list.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        ux2Var.Y(374674062);
        int i3 = i | (ux2Var.h(gw1Var) ? 4 : 2) | (ux2Var.h(xv1Var) ? 32 : 16) | (ux2Var.f(list) ? 256 : 128) | (ux2Var.g(z) ? 2048 : 1024) | (ux2Var.h(function0) ? 16384 : 8192) | (ux2Var.h(function1) ? 131072 : 65536) | (ux2Var.h(function2) ? 1048576 : 524288) | (ux2Var.h(function3) ? 8388608 : 4194304) | (ux2Var.h(function4) ? 67108864 : 33554432) | (ux2Var.h(function5) ? 536870912 : 268435456);
        int i4 = (ux2Var.h(function6) ? 4 : 2) | 48;
        if (ux2Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            Object objK = ux2Var.K();
            Object obj4 = e01.a;
            if (objK == obj4) {
                obj = objK;
                Object objW = ck3.w(ux2Var);
                ux2Var.g0(objW);
                obj = objW;
            }
            obj = objK;
            me1 me1Var = (me1) obj;
            Object objK2 = ux2Var.K();
            Object obj5 = objK2;
            if (objK2 == obj4) {
                Object objL = au8.l(0, 7, null);
                ux2Var.g0(objL);
                obj5 = objL;
            }
            nx4 nx4Var = (nx4) obj5;
            boolean zH = ux2Var.h(me1Var) | ux2Var.h(nx4Var);
            Object objK3 = ux2Var.K();
            Object obj6 = objK3;
            if (zH || objK3 == obj4) {
                Object uv1Var = new uv1(me1Var, nx4Var, (byte) 1);
                ux2Var.g0(uv1Var);
                obj6 = uv1Var;
            }
            Function1 function7 = (Function1) obj6;
            if (xv1Var.d) {
                ux2Var.W(-704085711);
                boolean z3 = xv1Var.a;
                i2 = 57344;
                boolean z4 = xv1Var.b;
                boolean zF = ux2Var.f(function7);
                Object objK4 = ux2Var.K();
                if (zF || objK4 == obj4) {
                    obj3 = objK4;
                    Object qv1Var = new qv1(function7, (byte) 5);
                    ux2Var.g0(qv1Var);
                    obj3 = qv1Var;
                }
                Function0 function8 = (Function0) obj3;
                boolean zF2 = ux2Var.f(function7) | ux2Var.h(xv1Var);
                Object objK5 = ux2Var.K();
                Object obj7 = objK5;
                if (zF2 || objK5 == obj4) {
                    Object rv1Var = new rv1(function7, xv1Var, (byte) 2);
                    ux2Var.g0(rv1Var);
                    obj7 = rv1Var;
                }
                pz1Var = new qz1(function8, z3, z4, (Function0) obj7);
                ux2Var.p(false);
            } else {
                i2 = 57344;
                ux2Var.W(-703382631);
                ur urVar = new ur(m77.z(R.string.device_tab_device_details_title, ux2Var));
                boolean z5 = !z;
                boolean z6 = (i3 & 57344) == 16384;
                Object objK6 = ux2Var.K();
                Object obj8 = objK6;
                if (z6 || objK6 == obj4) {
                    Object yv1Var = new yv1(function0, (byte) 0);
                    ux2Var.g0(yv1Var);
                    obj8 = yv1Var;
                }
                Function0 function9 = (Function0) obj8;
                boolean zF3 = ux2Var.f(function7);
                Object objK7 = ux2Var.K();
                Object obj9 = objK7;
                if (zF3 || objK7 == obj4) {
                    Object qv1Var2 = new qv1(function7, (byte) 6);
                    ux2Var.g0(qv1Var2);
                    obj9 = qv1Var2;
                }
                pz1Var = new pz1(urVar, z5, function9, (Function0) obj9);
                ux2Var.p(false);
            }
            fs4 fs4VarS = au8.s(androidx.compose.foundation.layout.b.c, ((rn4) ux2Var.j(un4.a)).a.p, kh.V);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
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
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS2, d82.t, ux2Var);
            xs1.c(pz1Var, null, ux2Var, 8, 2);
            ns1 ns1Var = gw1Var.b;
            if (ns1Var == null) {
                ux2Var.W(141806447);
                ux2Var.p(false);
                z2 = true;
            } else {
                ux2Var.W(141806448);
                boolean z7 = xv1Var.d;
                boolean z8 = (i3 & i2) == 16384;
                Object objK8 = ux2Var.K();
                if (z8 || objK8 == obj4) {
                    z2 = true;
                    Object yv1Var2 = new yv1(function0, true ? 1 : 0);
                    ux2Var.g0(yv1Var2);
                    obj2 = yv1Var2;
                } else {
                    z2 = true;
                    obj2 = objK8;
                }
                vt1.a(ns1Var, z7, function4, function6, function3, list, null, function5, function2, function1, (Function0) obj2, "DeviceInfoScreen-extraPane", nx4Var, null, ux2Var, ((i3 >> 18) & 896) | ((i4 << 9) & 7168) | ((i3 >> 9) & i2) | ((i3 << 9) & 458752) | ((i3 >> 6) & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), 48, 8256);
                ux2Var.p(false);
            }
            ux2Var.p(z2);
            fs4Var2 = cs4.b;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(xv1Var, list, z, function0, function1, function2, function3, function4, function5, function6, fs4Var2, i) { // from class: o.zv1
                public final /* synthetic */ xv1 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ List f2739o;
                public final /* synthetic */ boolean p;
                public final /* synthetic */ Function0 q;
                public final /* synthetic */ Function1 r;
                public final /* synthetic */ Function1 s;
                public final /* synthetic */ Function0 t;
                public final /* synthetic */ Function1 u;
                public final /* synthetic */ Function1 v;
                public final /* synthetic */ Function1 w;
                public final /* synthetic */ fs4 x;

                @Override // o.hw2
                public final Object invoke(Object obj10, Object obj11) {
                    ((Integer) obj11).getClass();
                    int iY = yo1.Y(1);
                    wo1.c(this.m, this.n, this.f2739o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, (ux2) obj10, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void d(String str, ux2 ux2Var, int i) {
        ux2 ux2Var2 = ux2Var;
        str.getClass();
        ux2Var2.Y(-189699747);
        int i2 = i | (ux2Var2.f(str) ? 4 : 2);
        if (ux2Var2.N(i2 & 1, (i2 & 3) != 2)) {
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            do4 do4VarC = ua0.c(xz2.s, false);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fillElement);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(do4VarC, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            h72 h72Var = un4.a;
            qs7.b(str, null, ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.l, ux2Var, i2 & 14, 0, 131066);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new qa(str, i);
        }
    }

    public static final void e(int i, String str, ux2 ux2Var, fs4 fs4Var) {
        ux2Var.Y(1211359361);
        int i2 = (ux2Var.f(str) ? 4 : 2) | i;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            h72 h72Var = un4.a;
            qs7.b(str, fs4Var, ((rn4) ux2Var.j(h72Var)).a.w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.l, ux2Var, i2 & 126, 0, 131064);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gx0(str, fs4Var, i, (byte) 4);
        }
    }

    public static final void f(int i, String str, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        String str2;
        function0.getClass();
        ux2Var.Y(-1123847620);
        int i2 = (ux2Var.h(function0) ? 4 : 2) | i | (ux2Var.f(fs4Var) ? 32 : 16) | 384;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            str2 = "TVTA-settings-giveFeedback";
            x37.e(new sk7(y57.g(R.string.settings_giveFeedbackOption), null, new yk7(R.drawable.person_feedback), null, 26), fs4Var, null, function0, "TVTA-settings-giveFeedback", ux2Var, ((i2 << 9) & 7168) | (i2 & 112) | 24576, 36);
        } else {
            ux2Var.Q();
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gd1(function0, fs4Var, str2, i, (byte) 2);
        }
    }

    public static IPredefinedShortcutsViewModel g() {
        long jPredefinedShortcutsViewModelFactory_GetPredefinedShortcutsViewModel = PredefinedShortcutsViewModelFactorySWIGJNI.PredefinedShortcutsViewModelFactory_GetPredefinedShortcutsViewModel();
        if (jPredefinedShortcutsViewModelFactory_GetPredefinedShortcutsViewModel == 0) {
            return null;
        }
        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel = new IPredefinedShortcutsViewModel();
        iPredefinedShortcutsViewModel.b = true;
        iPredefinedShortcutsViewModel.a = jPredefinedShortcutsViewModelFactory_GetPredefinedShortcutsViewModel;
        return iPredefinedShortcutsViewModel;
    }

    public static final gi3 h(String str, nw3 nw3Var) {
        return new gi3(str, new hi3(nw3Var));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0165  */
    /* JADX WARN: Code duplicated, block: B:106:0x018b  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:130:0x021d  */
    /* JADX WARN: Code duplicated, block: B:139:0x025c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0275  */
    /* JADX WARN: Code duplicated, block: B:145:0x0291  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    /* JADX WARN: Code duplicated, block: B:93:0x0108  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [o.ux2] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [o.fs4] */
    /* JADX WARN: Type inference failed for: r6v41, types: [o.cs4] */
    public static final void i(j74 j74Var, f74 f74Var, fs4 fs4Var, k74 k74Var, Function1 function1, ux2 ux2Var, int i, int i2) {
        int i3;
        f74 f74Var2;
        Function1 function2;
        boolean z;
        ?? r3;
        Function1 function3;
        j56 j56VarR;
        nl nlVar;
        lj6 lj6Var;
        final String str;
        final String str2;
        mx2 mx2Var;
        final String str3;
        Set set;
        e84 e84Var;
        final String str4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean zF;
        Object obj;
        final hw2 hw2Var;
        boolean z6;
        int i4;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean zF2;
        Object objK;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        x50 x50Var = xz2.y;
        j74Var.getClass();
        Set set2 = j74Var.i;
        f74Var.getClass();
        k74Var.getClass();
        ux2Var.Y(1674630063);
        if ((i & 6) == 0) {
            i3 = (ux2Var.f(j74Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.d(0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f74Var2 = f74Var;
            i3 |= ux2Var.f(f74Var2) ? 256 : 128;
        } else {
            f74Var2 = f74Var;
        }
        int i5 = i3 | 3072;
        if ((i & 24576) == 0) {
            i5 |= ux2Var.f(k74Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= ux2Var.h(null) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        if (i6 == 0) {
            if ((1572864 & i) == 0) {
                function2 = function1;
                i5 |= ux2Var.h(function2) ? 1048576 : 524288;
            }
            if ((i5 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i5 & 1, z)) {
                if (i6 != 0) {
                    function2 = null;
                }
                nlVar = (nl) ux2Var.j(b11.s);
                lj6Var = j74Var.h;
                if (lj6Var != null || (str = lj6Var.c) == null) {
                    str = null;
                }
                str2 = j74Var.e;
                if (str2 == null) {
                    str2 = null;
                }
                mx2Var = (mx2) lv0.n0(j74Var.j);
                if (mx2Var != null || (str3 = mx2Var.b) == null) {
                    str3 = null;
                }
                set = set2;
                e84Var = (e84) lv0.n0(set);
                if (e84Var != null) {
                    str4 = e84Var.b;
                } else {
                    str4 = null;
                }
                if (lv0.n0(set) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i5 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((458752 & i5) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z11 = z4 | z3;
                if ((3670016 & i5) == 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zF = z11 | z5 | ux2Var.f(nlVar);
                Object objK2 = ux2Var.K();
                aw awVar = e01.a;
                obj = objK2;
                if (zF || objK2 == awVar) {
                    f9 f9Var = new f9((Object) j74Var, (Object) function2, (Object) nlVar, (byte) 15);
                    ux2Var.g0(f9Var);
                    obj = f9Var;
                }
                hw2Var = (hw2) obj;
                ux2Var.W(-1293211398);
                dg6 dg6VarA = cg6.a(new ew(8.0f, new hk0((byte) 2)), x50Var, ux2Var, 54);
                z6 = z2;
                int iHashCode = Long.hashCode(ux2Var.T);
                yj5 yj5VarL = ux2Var.l();
                cs4 cs4Var = cs4.b;
                fs4 fs4VarS = uf0.s(ux2Var, cs4Var);
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
                if (str != null || ub7.b0(str)) {
                    i4 = i5;
                    z7 = false;
                    ux2Var.W(-882484201);
                } else {
                    ux2Var.W(-721206900);
                    String str5 = k74Var.a;
                    boolean zF3 = ux2Var.f(hw2Var) | ux2Var.f(str);
                    Object objK3 = ux2Var.K();
                    if (zF3 || objK3 == awVar) {
                        z7 = false;
                        final boolean z12 = false ? 1 : 0;
                        Function0 function0 = new Function0() { // from class: o.o74
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b2 = z12;
                                f88 f88Var = f88.a;
                                String str6 = str;
                                hw2 hw2Var2 = hw2Var;
                                switch (b2) {
                                    case 0:
                                        hw2Var2.invoke(l74.m, str6);
                                        break;
                                    case 1:
                                        hw2Var2.invoke(l74.n, str6);
                                        break;
                                    case 2:
                                        hw2Var2.invoke(l74.f1336o, str6);
                                        break;
                                    default:
                                        hw2Var2.invoke(l74.p, str6);
                                        break;
                                }
                                return f88Var;
                            }
                        };
                        ux2Var.g0(function0);
                        obj5 = function0;
                    } else {
                        z7 = false;
                        obj5 = objK3;
                    }
                    i4 = i5;
                    b(str5, false, f74Var2, (Function0) obj5, ux2Var, (i5 & 896) | 48);
                }
                ux2Var.p(z7);
                if (str2 != null || ub7.b0(str2)) {
                    z8 = false;
                    ux2Var.W(-882342345);
                } else {
                    ux2Var.W(-721202417);
                    String str6 = k74Var.c;
                    boolean zF4 = ux2Var.f(hw2Var) | ux2Var.f(str2);
                    Object objK4 = ux2Var.K();
                    if (zF4 || objK4 == awVar) {
                        obj4 = objK4;
                        final byte b2 = 1;
                        Function0 function4 = new Function0() { // from class: o.o74
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b3 = b2;
                                f88 f88Var = f88.a;
                                String str7 = str2;
                                hw2 hw2Var2 = hw2Var;
                                switch (b3) {
                                    case 0:
                                        hw2Var2.invoke(l74.m, str7);
                                        break;
                                    case 1:
                                        hw2Var2.invoke(l74.n, str7);
                                        break;
                                    case 2:
                                        hw2Var2.invoke(l74.f1336o, str7);
                                        break;
                                    default:
                                        hw2Var2.invoke(l74.p, str7);
                                        break;
                                }
                                return f88Var;
                            }
                        };
                        ux2Var.g0(function4);
                        obj4 = function4;
                    }
                    b(str6, false, f74Var, (Function0) obj4, ux2Var, (i4 & 896) | 48);
                    z8 = false;
                }
                ux2Var.p(z8);
                if (str3 != null || ub7.b0(str3)) {
                    z9 = false;
                    ux2Var.W(-882200489);
                } else {
                    ux2Var.W(-721197841);
                    String str7 = k74Var.e;
                    boolean zF5 = ux2Var.f(hw2Var) | ux2Var.f(str3);
                    Object objK5 = ux2Var.K();
                    if (zF5 || objK5 == awVar) {
                        obj3 = objK5;
                        final byte b3 = 2;
                        Function0 function5 = new Function0() { // from class: o.o74
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b4 = b3;
                                f88 f88Var = f88.a;
                                String str8 = str3;
                                hw2 hw2Var2 = hw2Var;
                                switch (b4) {
                                    case 0:
                                        hw2Var2.invoke(l74.m, str8);
                                        break;
                                    case 1:
                                        hw2Var2.invoke(l74.n, str8);
                                        break;
                                    case 2:
                                        hw2Var2.invoke(l74.f1336o, str8);
                                        break;
                                    default:
                                        hw2Var2.invoke(l74.p, str8);
                                        break;
                                }
                                return f88Var;
                            }
                        };
                        ux2Var.g0(function5);
                        obj3 = function5;
                    }
                    b(str7, false, f74Var, (Function0) obj3, ux2Var, (i4 & 896) | 48);
                    z9 = false;
                }
                ux2Var.p(z9);
                if (z6) {
                    ux2Var.W(-721193579);
                    String str8 = k74Var.g;
                    zF2 = ux2Var.f(hw2Var) | ux2Var.f(str4);
                    objK = ux2Var.K();
                    if (zF2 || objK == awVar) {
                        obj2 = objK;
                        final byte b4 = 3;
                        Function0 function6 = new Function0() { // from class: o.o74
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b5 = b4;
                                f88 f88Var = f88.a;
                                String str9 = str4;
                                hw2 hw2Var2 = hw2Var;
                                switch (b5) {
                                    case 0:
                                        hw2Var2.invoke(l74.m, str9);
                                        break;
                                    case 1:
                                        hw2Var2.invoke(l74.n, str9);
                                        break;
                                    case 2:
                                        hw2Var2.invoke(l74.f1336o, str9);
                                        break;
                                    default:
                                        hw2Var2.invoke(l74.p, str9);
                                        break;
                                }
                                return f88Var;
                            }
                        };
                        ux2Var.g0(function6);
                        obj2 = function6;
                    }
                    b(str8, true, f74Var, (Function0) obj2, ux2Var, (i4 & 896) | 48);
                    z10 = false;
                } else {
                    z10 = false;
                    ux2Var.W(-882062601);
                }
                ux2Var.p(z10);
                ux2Var.p(true);
                ux2Var.p(z10);
                r3 = cs4Var;
            } else {
                ux2Var.Q();
                r3 = fs4Var;
            }
            function3 = function2;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new n74(j74Var, f74Var, (fs4) r3, k74Var, function3, i, i2);
            }
        }
        i5 |= 1572864;
        function2 = function1;
        if ((i5 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i5 & 1, z)) {
            if (i6 != 0) {
                function2 = null;
            }
            nlVar = (nl) ux2Var.j(b11.s);
            lj6Var = j74Var.h;
            if (lj6Var != null) {
                str = null;
            } else {
                str = null;
            }
            str2 = j74Var.e;
            if (str2 == null) {
                str2 = null;
            }
            mx2Var = (mx2) lv0.n0(j74Var.j);
            if (mx2Var != null) {
                str3 = null;
            } else {
                str3 = null;
            }
            set = set2;
            e84Var = (e84) lv0.n0(set);
            if (e84Var != null) {
                str4 = e84Var.b;
            } else {
                str4 = null;
            }
            if (lv0.n0(set) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i5 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((458752 & i5) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z13 = z4 | z3;
            if ((3670016 & i5) == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            zF = z13 | z5 | ux2Var.f(nlVar);
            Object objK6 = ux2Var.K();
            aw awVar2 = e01.a;
            obj = objK6;
            if (zF) {
                f9 f9Var2 = new f9((Object) j74Var, (Object) function2, (Object) nlVar, (byte) 15);
                ux2Var.g0(f9Var2);
                obj = f9Var2;
            } else {
                f9 f9Var3 = new f9((Object) j74Var, (Object) function2, (Object) nlVar, (byte) 15);
                ux2Var.g0(f9Var3);
                obj = f9Var3;
            }
            hw2Var = (hw2) obj;
            ux2Var.W(-1293211398);
            dg6 dg6VarA2 = cg6.a(new ew(8.0f, new hk0((byte) 2)), x50Var, ux2Var, 54);
            z6 = z2;
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            cs4 cs4Var2 = cs4.b;
            fs4 fs4VarS2 = uf0.s(ux2Var, cs4Var2);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA2, d82.v, ux2Var);
            o67.n(yj5VarL2, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS2, d82.t, ux2Var);
            if (str != null) {
                i4 = i5;
                z7 = false;
                ux2Var.W(-882484201);
            } else {
                i4 = i5;
                z7 = false;
                ux2Var.W(-882484201);
            }
            ux2Var.p(z7);
            if (str2 != null) {
                z8 = false;
                ux2Var.W(-882342345);
            } else {
                z8 = false;
                ux2Var.W(-882342345);
            }
            ux2Var.p(z8);
            if (str3 != null) {
                z9 = false;
                ux2Var.W(-882200489);
            } else {
                z9 = false;
                ux2Var.W(-882200489);
            }
            ux2Var.p(z9);
            if (z6) {
                ux2Var.W(-721193579);
                String str9 = k74Var.g;
                zF2 = ux2Var.f(hw2Var) | ux2Var.f(str4);
                objK = ux2Var.K();
                if (zF2) {
                    obj2 = objK;
                    final byte b5 = 3;
                    Function0 function7 = new Function0() { // from class: o.o74
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b6 = b5;
                            f88 f88Var = f88.a;
                            String str10 = str4;
                            hw2 hw2Var2 = hw2Var;
                            switch (b6) {
                                case 0:
                                    hw2Var2.invoke(l74.m, str10);
                                    break;
                                case 1:
                                    hw2Var2.invoke(l74.n, str10);
                                    break;
                                case 2:
                                    hw2Var2.invoke(l74.f1336o, str10);
                                    break;
                                default:
                                    hw2Var2.invoke(l74.p, str10);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var.g0(function7);
                    obj2 = function7;
                } else {
                    obj2 = objK;
                    final byte b6 = 3;
                    Function0 function8 = new Function0() { // from class: o.o74
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b7 = b6;
                            f88 f88Var = f88.a;
                            String str10 = str4;
                            hw2 hw2Var2 = hw2Var;
                            switch (b7) {
                                case 0:
                                    hw2Var2.invoke(l74.m, str10);
                                    break;
                                case 1:
                                    hw2Var2.invoke(l74.n, str10);
                                    break;
                                case 2:
                                    hw2Var2.invoke(l74.f1336o, str10);
                                    break;
                                default:
                                    hw2Var2.invoke(l74.p, str10);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var.g0(function8);
                    obj2 = function8;
                }
                b(str9, true, f74Var, (Function0) obj2, ux2Var, (i4 & 896) | 48);
                z10 = false;
            } else {
                z10 = false;
                ux2Var.W(-882062601);
            }
            ux2Var.p(z10);
            ux2Var.p(true);
            ux2Var.p(z10);
            r3 = cs4Var2;
        } else {
            ux2Var.Q();
            r3 = fs4Var;
        }
        function3 = function2;
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new n74(j74Var, f74Var, (fs4) r3, k74Var, function3, i, i2);
        }
    }

    public static final void j(String str, Function1 function1, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        str.getClass();
        function1.getClass();
        function0.getClass();
        ux2Var.Y(1929282338);
        int i2 = 2;
        byte b2 = 4;
        int i3 = i | (ux2Var.f(str) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | (ux2Var.h(function0) ? 256 : 128) | 3072;
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            xy6 xy6VarR = yo1.R(null, ux2Var, 6, 2);
            List listL = qf0.L(new vv6(m77.z(R.string.tv_options_Automatic, ux2Var), ew6.OnLockDeviceAdjustedAutomatic, "TVTA-settings-lockDevice-automatic", i2), new vv6(m77.z(R.string.tv_options_always, ux2Var), ew6.OnLockDeviceAdjustedAlways, "TVTA-settings-lockDevice-always", i2), new vv6(m77.z(R.string.tv_options_never, ux2Var), ew6.OnLockDeviceAdjustedNever, "TVTA-settings-lockDevice-never", i2));
            Object[] objArr = {str};
            boolean z = (i3 & 14) == 4;
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                objK = new lz1(str, b2);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) zu1.L(objArr, (Function0) objK, ux2Var, 0);
            cs4 cs4Var = cs4.b;
            yo1.k(function0, cs4Var, xy6VarR, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(1766118016, new od4(listL, (String) px4Var.j(), px4Var.c(), function1, function0, xy6VarR, (byte) 1), ux2Var), ux2Var, (i3 >> 6) & 126, 3072, 8184);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new mz1(str, function1, function0, fs4Var2, i, (byte) 1);
        }
    }

    public static final void k(fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2Var.Y(-1293075263);
        int i2 = i | 6;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            fs4Var2 = cs4.b;
            ig7.a(androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(fs4Var2, 1.0f), 36.0f), "TVTA-devicesOfflineScreen-noInternetBanner"), null, ((rn4) ux2Var.j(un4.a)).a.u, 0L, 0.0f, 0.0f, j51.i, ux2Var, 12582912, 122);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var2, i, (byte) 5);
        }
    }

    public static final void l(int i, String str, boolean z, fs4 fs4Var, ux2 ux2Var, int i2) {
        ux2 ux2Var2;
        fs4 fs4Var2;
        long j;
        ux2Var.Y(666791779);
        int i3 = i2 | (ux2Var.d(i) ? 4 : 2) | (ux2Var.f(str) ? 32 : 16) | (ux2Var.g(z) ? 256 : 128) | 3072;
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = str.length() == i;
            String strValueOf = i >= str.length() ? "" : String.valueOf(str.charAt(i));
            if (z2) {
                ux2Var.W(170437358);
                j = ep1.r(ux2Var).a;
                ux2Var.p(false);
            } else if (z && str.length() == 0) {
                ux2Var.W(170542448);
                j = ep1.r(ux2Var).w;
                ux2Var.p(false);
            } else {
                ux2Var.W(170595303);
                j = ep1.r(ux2Var).B;
                ux2Var.p(false);
            }
            y50 y50Var = xz2.s;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = au8.s(uf0.i(iq8.j(androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.b.d(cs4Var, 56.0f), 48.0f), sf6.a(6.0f)), 1.0f, j, sf6.a(6.0f)), ep1.r(ux2Var).r, sf6.a(6.0f));
            do4 do4VarC = ua0.c(y50Var, false);
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
            fs4Var2 = cs4Var;
            qs7.b(strValueOf, null, ep1.r(ux2Var).q, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ep1.s(ux2Var).e, ux2Var, 0, 0, 130042);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new cn1(i, str, z, fs4Var2, i2);
        }
    }

    public static final void m(String str, int i, fs4 fs4Var, Function1 function1, ux2 ux2Var, int i2) {
        ux2 ux2Var2;
        boolean z;
        String strA;
        str.getClass();
        ux2Var.Y(-194292869);
        byte b2 = 2;
        int i3 = i2 | (ux2Var.f(str) ? 4 : 2) | (ux2Var.d(i) ? 32 : 16) | (ux2Var.h(function1) ? 16384 : 8192);
        if (ux2Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z2 = i < 3;
            boolean z3 = z2 && str.length() == 0;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new sq2();
                ux2Var.g0(objK);
            }
            sq2 sq2Var = (sq2) objK;
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zG = ux2Var.g(z3);
            Object objK2 = ux2Var.K();
            hc1 hc1Var = null;
            if (zG || objK2 == awVar) {
                objK2 = new h23(z3, null);
                ux2Var.g0(objK2);
            }
            ck3.i(boolValueOf, (hw2) objK2, ux2Var);
            Boolean bool = Boolean.TRUE;
            Object objK3 = ux2Var.K();
            if (objK3 == awVar) {
                objK3 = new z9(sq2Var, hc1Var, b2);
                ux2Var.g0(objK3);
            }
            ck3.i(bool, (hw2) objK3, ux2Var);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
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
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarN = uf0.n(cs4Var, sq2Var);
            int length = str.length();
            zr7 zr7Var = new zr7(4, h57.a(length, length), str);
            Object objK4 = ux2Var.K();
            if (objK4 == awVar) {
                objK4 = ua5.s(ux2Var);
            }
            mw4 mw4Var = (mw4) objK4;
            yx3 yx3Var = new yx3(8, 0, 123);
            boolean z4 = ((i3 & 57344) == 16384) | ((i3 & 14) == 4);
            Object objK5 = ux2Var.K();
            if (z4 || objK5 == awVar) {
                objK5 = new o43(str, function1, (byte) 22);
                ux2Var.g0(objK5);
            }
            boolean z5 = z3;
            q40.b(zr7Var, (Function1) objK5, fs4VarN, false, false, null, yx3Var, null, false, 0, 0, null, null, mw4Var, null, au8.O(1315828782, new w71((byte) 1, str, z2), ux2Var), ux2Var, 1572864, 199680, 24504);
            ux2Var2 = ux2Var;
            if (z5) {
                ux2Var2.W(-462461351);
                if (i == 1) {
                    z = false;
                    strA = to7.m(ux2Var2, -462397398, R.string.scan_qr_incorrect_pin_one_attempt_left, ux2Var2, false);
                } else {
                    z = false;
                    ux2Var2.W(-462288991);
                    strA = m77.A(R.string.scan_qr_incorrect_pin_x_attempts_left, new Object[]{Integer.valueOf(i)}, ux2Var2);
                    ux2Var2.p(false);
                }
                e(48, strA, ux2Var2, ka0.F(cs4Var, 0.0f, 8.0f, 0.0f, 0.0f, 13));
                ux2Var2.p(z);
            } else {
                ux2Var2.W(-462100015);
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new ci(str, i, fs4Var, function1, i2);
        }
    }

    public static final void n(int i, List list, Function0 function0, Function1 function1, Function1 function2, ux2 ux2Var, fs4 fs4Var, boolean z) {
        fs4 fs4Var2;
        byte b2;
        int i2;
        int i3;
        ux2 ux2Var2 = ux2Var;
        list.getClass();
        ux2Var2.Y(892796705);
        int i4 = i | (ux2Var2.f(list) ? 4 : 2) | (ux2Var2.g(z) ? 32 : 16) | 384 | (ux2Var2.h(function0) ? 2048 : 1024) | (ux2Var2.h(function1) ? 16384 : 8192) | (ux2Var2.h(function2) ? 131072 : 65536);
        if (ux2Var2.N(i4 & 1, (74899 & i4) != 74898)) {
            i97 i97VarA = vm.a(z ? 0.0f : 90.0f, db8.I0(300, 6, null), "", ux2Var, 3120, 20);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            h72 h72Var = un4.a;
            fs4 fs4VarI = uf0.i(fs4VarC, 1.0f, ((rn4) ux2Var.j(h72Var)).a.B, sf6.a(12.0f));
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarI);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z2 = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z2) {
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
            fs4 fs4VarJ = iq8.j(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), sf6.a(12.0f));
            int i5 = i4 & 112;
            boolean z3 = ((i4 & 7168) == 2048) | (i5 == 32);
            Object objK = ux2Var.K();
            if (z3 || objK == e01.a) {
                b2 = 1;
                objK = new dc1(b2, function0, z);
                ux2Var.g0(objK);
            } else {
                b2 = 1;
            }
            fs4 fs4VarD = ka0.D(androidx.compose.foundation.b.b(fs4VarJ, false, null, null, (Function0) objK, 15), 0.0f, 10.0f, b2);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var, 48);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarD);
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
            td3.b(lv1.T(R.drawable.ic_recent_connection, ux2Var, 0), m77.z(R.string.recent_connection_content_description, ux2Var), ka0.D(androidx.compose.foundation.layout.b.m(ka0.F(cs4Var, 16.0f, 0.0f, 16.0f, 0.0f, 10), 40.0f, 24.0f), 8.0f, 0.0f, 2), ((rn4) ux2Var.j(h72Var)).a.s, ux2Var, 8, 0);
            fs4Var2 = cs4Var;
            qs7.b(m77.z(R.string.recent_connections, ux2Var), ka0.F(new s14(1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11), ((rn4) ux2Var.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, ((rn4) ux2Var.j(h72Var)).b.j, ux2Var, 0, 24960, 110584);
            ud5 ud5VarT = lv1.T(R.drawable.ic_expand, ux2Var, 0);
            if (z) {
                i2 = -1518213276;
                i3 = R.string.expand_content_description;
            } else {
                i2 = -1518109054;
                i3 = R.string.collapse_content_description;
            }
            td3.b(ud5VarT, to7.m(ux2Var, i2, i3, ux2Var, false), io1.e0(androidx.compose.foundation.layout.b.l(ka0.E(fs4Var2, 8.0f, 8.0f, 24.0f, 8.0f), 16.0f), ((Number) i97VarA.getValue()).floatValue()), ((rn4) ux2Var.j(h72Var)).a.s, ux2Var, 8, 0);
            ux2Var.p(true);
            vn4.H(z, null, null, null, null, au8.O(-2089997713, new e56(list, function1, function2, (byte) 0), ux2Var), ux2Var, 1572870 | i5, 30);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new f56(list, z, fs4Var2, function0, function1, function2, i);
        }
    }

    public static final void o(boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        function1.getClass();
        ux2Var.Y(654903309);
        int i2 = i | (ux2Var.g(z) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | 384;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 3;
            cs4 cs4Var = cs4.b;
            l47.d(new sk7(y57.g(R.string.settings_remoteCursor), null, new yk7(R.drawable.cursor), null, 26), z, function1, cs4Var, "TVTA-settings-remoteCursor", m77.z(R.string.settings_remoteCursor, ux2Var), ux2Var, (i3 & 896) | (i3 & 112) | 24576 | 3072, 32);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new lc(z, function1, fs4Var2, i, (byte) 3);
        }
    }

    public static final void p(final String str, final float f2, fs4 fs4Var, ux2 ux2Var, final int i) {
        int i2;
        final fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-2026840566);
        if ((i & 6) == 0) {
            i2 = i | (ux2Var2.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.c(f2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (ux2Var2.N(i3 & 1, (i3 & 147) != 146)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            dg6 dg6VarA = cg6.a(iq8.e, xz2.x, ux2Var2, 6);
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
            qs7.b(str, ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 0.5f), 0.0f, f2 + 16.0f, 0.0f, 0.0f, 13), rv0.d, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.h, ux2Var, (i3 & 14) | 384, 0, 130040);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.jy5
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    wo1.p(str, f2, fs4Var2, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void q(nd5 nd5Var, String str, fs4 fs4Var, ux2 ux2Var, int i) {
        nd5 nd5Var2;
        int i2;
        str.getClass();
        ux2Var.Y(1389393569);
        if ((i & 6) == 0) {
            nd5Var2 = nd5Var;
            i2 = i | (ux2Var.f(nd5Var2) ? 4 : 2);
        } else {
            nd5Var2 = nd5Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(str) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            final in1 in1Var = (in1) ux2Var.j(b11.h);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = h57.p(new w32(0.0f));
                ux2Var.g0(objK);
            }
            final px4 px4Var = (px4) objK;
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = h57.p(new w32(0.0f));
                ux2Var.g0(objK2);
            }
            final px4 px4Var2 = (px4) objK2;
            Object objK3 = ux2Var.K();
            if (objK3 == awVar) {
                objK3 = h57.p(new w32(0.0f));
                ux2Var.g0(objK3);
            }
            final px4 px4Var3 = (px4) objK3;
            Object objK4 = ux2Var.K();
            if (objK4 == awVar) {
                objK4 = h57.p(new w32(0.0f));
                ux2Var.g0(objK4);
            }
            final px4 px4Var4 = (px4) objK4;
            final j76 j76Var = new j76();
            Object objK5 = ux2Var.K();
            if (objK5 == awVar) {
                objK5 = new dl3(0L);
                ux2Var.g0(objK5);
            }
            j76Var.m = ((dl3) objK5).a;
            fj3 fj3Var = new fj3((Object) j76Var, (byte) 27);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarR0 = db8.r0(cs4Var, fj3Var);
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            fs4Var = cs4Var;
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarR0);
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
            final int i4 = ((Configuration) ux2Var.j(lh.a)).orientation;
            final nd5 nd5Var3 = nd5Var2;
            vn4.K(6, new Function1(i4, nd5Var3, in1Var, px4Var, px4Var2, px4Var3, px4Var4, j76Var) { // from class: o.iy5
                public final /* synthetic */ int m;
                public final /* synthetic */ nd5 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ in1 f1114o;
                public final /* synthetic */ px4 p;
                public final /* synthetic */ px4 q;
                public final /* synthetic */ px4 r;
                public final /* synthetic */ px4 s;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    u52 u52Var = (u52) obj;
                    u52Var.getClass();
                    float fD = this.m == 2 ? 128.0f - (this.n.d() / 2.0f) : 128.0f;
                    in1 in1Var2 = this.f1114o;
                    float fD0 = in1Var2.d0(fD);
                    float fD1 = in1Var2.d0(22.0f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fD1)) << 32) | (((long) Float.floatToRawIntBits(fD1)) & 4294967295L);
                    v56 v56VarU = qs1.u(fD0, u52Var.t0());
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    float f2 = v56VarU.a;
                    float f3 = v56VarU.b;
                    float f4 = v56VarU.c;
                    float f5 = v56VarU.d;
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                    lf6 lf6Var = new lf6(f2, f3, f4, f5, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2);
                    this.p.setValue(new w32(in1Var2.R(f5)));
                    w32 w32Var = new w32(in1Var2.R(f3));
                    px4 px4Var5 = this.q;
                    px4Var5.setValue(w32Var);
                    w32 w32Var2 = new w32(in1Var2.R(f2));
                    px4 px4Var6 = this.r;
                    px4Var6.setValue(w32Var2);
                    this.s.setValue(new w32(in1Var2.R(f4)));
                    rj rjVarA = tj.a();
                    rj.c(rjVarA, lf6Var);
                    iu iuVarH0 = u52Var.h0();
                    long jD = iuVarH0.D();
                    iuVarH0.x().g();
                    try {
                        ((iu) ((xc0) iuVarH0.f1103o).n).x().d(rjVarA, 0);
                        u52.x(u52Var, new t57(rv0.b(0.4f, rv0.b)), 0L, 0L, 0.0f, null, null, 126);
                        iuVarH0.x().p();
                        iuVarH0.S(jD);
                        if (!w32.b(((w32) px4Var5.getValue()).m, 0.0f) && !w32.b(((w32) px4Var6.getValue()).m, 0.0f)) {
                            wo1.C(u52Var, ((w32) px4Var5.getValue()).m, ((w32) px4Var6.getValue()).m);
                            long jT0 = u52Var.t0();
                            iu iuVarH1 = u52Var.h0();
                            long jD2 = iuVarH1.D();
                            iuVarH1.x().g();
                            try {
                                ((xc0) iuVarH1.f1103o).T(90.0f, jT0);
                                wo1.C(u52Var, ((w32) px4Var5.getValue()).m, ((w32) px4Var6.getValue()).m);
                                iuVarH1.x().p();
                                iuVarH1.S(jD2);
                                long jT1 = u52Var.t0();
                                iu iuVarH2 = u52Var.h0();
                                long jD3 = iuVarH2.D();
                                iuVarH2.x().g();
                                try {
                                    ((xc0) iuVarH2.f1103o).T(180.0f, jT1);
                                    wo1.C(u52Var, ((w32) px4Var5.getValue()).m, ((w32) px4Var6.getValue()).m);
                                    iuVarH2.x().p();
                                    iuVarH2.S(jD3);
                                    long jT2 = u52Var.t0();
                                    iu iuVarH3 = u52Var.h0();
                                    long jD4 = iuVarH3.D();
                                    iuVarH3.x().g();
                                    try {
                                        ((xc0) iuVarH3.f1103o).T(270.0f, jT2);
                                        wo1.C(u52Var, ((w32) px4Var5.getValue()).m, ((w32) px4Var6.getValue()).m);
                                    } finally {
                                        ua5.x(iuVarH3, jD4);
                                    }
                                } catch (Throwable th) {
                                    ua5.x(iuVarH2, jD3);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                ua5.x(iuVarH1, jD2);
                                throw th2;
                            }
                        }
                        return f88.a;
                    } catch (Throwable th3) {
                        ua5.x(iuVarH0, jD);
                        throw th3;
                    }
                }
            }, ux2Var, androidx.compose.foundation.layout.b.c);
            p(str, ((w32) px4Var.getValue()).m, null, ux2Var, (i3 >> 3) & 14);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        fs4 fs4Var2 = fs4Var;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) nd5Var, (Object) str, (Object) fs4Var2, i, (byte) 17);
        }
    }

    public static final void r(int i, String str, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        fs4 fs4Var2;
        str.getClass();
        function0.getClass();
        ux2Var.Y(1391875251);
        int i2 = (ux2Var.f(str) ? 4 : 2) | i | (ux2Var.h(function0) ? 32 : 16) | 384;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            pd5 pd5Var = n08.a;
            long j = rv0.g;
            long j2 = rv0.d;
            qr.a(au8.O(-1372427602, new qa(str, (byte) 5), ux2Var), au8.O(521906284, new v4(function0, (byte) 27), ux2Var), null, 0.0f, null, n08.b(j, j2, j2, 0L, ux2Var, 50), ux2Var, 438);
            fs4Var2 = cs4.b;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gd1(str, function0, fs4Var2, i, (byte) 6);
        }
    }

    public static final void s(final SupportSession supportSession, final boolean z, final nr6 nr6Var, fs4 fs4Var, boolean z2, ux2 ux2Var, final int i, final int i2) {
        boolean z3;
        int i3;
        final fs4 fs4Var2;
        final boolean z4;
        long j;
        boolean z5;
        String strM;
        String strM2;
        cs4 cs4Var;
        aw awVar;
        px4 px4Var;
        ux2 ux2Var2 = ux2Var;
        supportSession.getClass();
        ux2Var2.Y(-1427958999);
        int i4 = i | (ux2Var2.h(supportSession) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= ux2Var2.g(z) ? 32 : 16;
        }
        int i5 = i4 | (ux2Var2.h(nr6Var) ? 256 : 128);
        int i6 = i5 | 3072;
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 = i5 | 27648;
            z3 = z2;
        } else {
            z3 = z2;
            i3 = i6 | (ux2Var2.g(z3) ? 16384 : 8192);
        }
        final byte b2 = 0;
        if (ux2Var2.N(i3 & 1, (i3 & 9363) != 9362)) {
            if (i7 != 0) {
                z3 = false;
            }
            Boolean assignedToMe = supportSession.getAssignedToMe();
            Boolean bool = Boolean.TRUE;
            boolean zN = im3.n(assignedToMe, bool);
            Object objK = ux2Var2.K();
            aw awVar2 = e01.a;
            if (objK == awVar2) {
                objK = h57.p(Boolean.FALSE);
                ux2Var2.g0(objK);
            }
            px4 px4Var2 = (px4) objK;
            cs4 cs4Var2 = cs4.b;
            fs4 fs4VarJ = iq8.j(androidx.compose.foundation.layout.b.c(cs4Var2, 1.0f), sf6.a(12.0f));
            if (z3) {
                ux2Var2.W(1325017411);
                j = ((rn4) ux2Var2.j(un4.a)).a.G;
                ux2Var2.p(false);
            } else {
                ux2Var2.W(1325107776);
                ux2Var2.p(false);
                j = rv0.g;
            }
            fs4 fs4VarS = au8.s(fs4VarJ, j, kh.V);
            boolean zH = ux2Var2.h(nr6Var) | ux2Var2.h(supportSession);
            Object objK2 = ux2Var2.K();
            if (zH || objK2 == awVar2) {
                objK2 = new cr6(nr6Var, supportSession, px4Var2, b2);
                ux2Var2.g0(objK2);
            }
            Function0 function0 = (Function0) objK2;
            boolean zH2 = ux2Var2.h(nr6Var) | ux2Var2.h(supportSession);
            Object objK3 = ux2Var2.K();
            if (zH2 || objK3 == awVar2) {
                objK3 = new Function0() { // from class: o.er6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b3 = b2;
                        f88 f88Var = f88.a;
                        SupportSession supportSession2 = supportSession;
                        nr6 nr6Var2 = nr6Var;
                        switch (b3) {
                            case 0:
                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                ga7.a(sr6.OnServiceQueueShowDetailsClicked);
                                nr6Var2.c.invoke(supportSession2);
                                break;
                            default:
                                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                ga7.a(sr6.OnServiceQueueConnectClicked);
                                nr6Var2.d.invoke(supportSession2);
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK3);
            }
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.E(androidx.compose.foundation.b.d(fs4VarS, function0, (Function0) objK3), 16.0f, 12.0f, 8.0f, 12.0f), "TVTA-devicesScreen-serviceQueue-item");
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarA);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z6 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z6) {
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
            boolean z7 = z3;
            nv1.i(supportSession, hi7.Size40dp, ka0.F(cs4Var2, 0.0f, 0.0f, 12.0f, 0.0f, 11), ux2Var2, (i3 & 14) | 432);
            s14 s14Var = new s14(1.0f, true);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS3 = uf0.s(ux2Var2, s14Var);
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
            String name = supportSession.getName();
            if (name == null || ub7.b0(name)) {
                name = null;
            }
            if (name == null) {
                z5 = false;
                name = to7.m(ux2Var2, -406029232, R.string.session_default_name, ux2Var2, false);
            } else {
                z5 = false;
                ux2Var2.W(-406030596);
                ux2Var2.p(false);
            }
            boolean z8 = z5;
            qs7.b(name, null, ep1.r(ux2Var2).q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ep1.s(ux2Var2).j, ux2Var, 0, 24960, 110586);
            qs7.b(qs1.M(String.valueOf(supportSession.getSessioncode())), null, ep1.r(ux2Var).s, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ep1.s(ux2Var).k, ux2Var, 0, 24960, 110586);
            if (im3.n(supportSession.getAssignedToMe(), bool)) {
                strM = to7.m(ux2Var, -1576040795, R.string.service_queue_assigned_to_myself, ux2Var, z8);
            } else {
                strM = supportSession.getAssignedAccountId() == 0 ? to7.m(ux2Var, -1576037603, R.string.service_queue_unassigned, ux2Var, z8) : to7.m(ux2Var, -1576035482, R.string.service_queue_assigned_to_contact, ux2Var, z8);
            }
            int i8 = gr6.a[supportSession.getRecipientStatus().ordinal()];
            if (i8 == 1) {
                strM2 = to7.m(ux2Var, -1576030031, R.string.user_waiting, ux2Var, z8);
            } else {
                if (i8 != 2) {
                    throw fx3.m(-1576032414, ux2Var, z8);
                }
                strM2 = to7.m(ux2Var, -1576027212, R.string.user_not_joined, ux2Var, z8);
            }
            qs7.b(m77.A(R.string.service_queue_assignment_and_status, new Object[]{strM, strM2}, ux2Var), null, ep1.r(ux2Var).s, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ep1.s(ux2Var).l, ux2Var, 0, 24960, 110586);
            ux2Var.p(true);
            if (zN || supportSession.getAssignedAccountId() != 0) {
                ux2Var.W(-760337507);
                cs4Var = cs4Var2;
                fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(ka0.B(cs4Var, 4.0f), 40.0f), "TVTA-devicesScreen-serviceQueue-connectButton");
                qf6 qf6VarA = sf6.a(8.0f);
                boolean zH3 = ux2Var.h(nr6Var) | ux2Var.h(supportSession);
                Object objK4 = ux2Var.K();
                awVar = awVar2;
                if (zH3 || objK4 == awVar) {
                    final byte b3 = 1;
                    objK4 = new Function0() { // from class: o.er6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b4 = b3;
                            f88 f88Var = f88.a;
                            SupportSession supportSession2 = supportSession;
                            nr6 nr6Var2 = nr6Var;
                            switch (b4) {
                                case 0:
                                    IStatisticsHandler iStatisticsHandler = ga7.a;
                                    ga7.a(sr6.OnServiceQueueShowDetailsClicked);
                                    nr6Var2.c.invoke(supportSession2);
                                    break;
                                default:
                                    IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                    ga7.a(sr6.OnServiceQueueConnectClicked);
                                    nr6Var2.d.invoke(supportSession2);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var.g0(objK4);
                }
                xo1.k((Function0) objK4, fs4VarA2, zN, null, qf6VarA, au8.O(-1735860986, new bn1((byte) 2, zN), ux2Var), ux2Var, 1572912, 24);
                ux2Var.p(z8);
            } else {
                ux2Var.W(-759351211);
                ux2Var.p(z8);
                cs4Var = cs4Var2;
                awVar = awVar2;
            }
            do4 do4VarC = ua0.c(xz2.f2564o, z8);
            int iHashCode3 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL3 = ux2Var.l();
            fs4 fs4VarS4 = uf0.s(ux2Var, cs4Var);
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
            boolean zH4 = ux2Var.h(nr6Var) | ux2Var.h(supportSession);
            Object objK5 = ux2Var.K();
            if (zH4 || objK5 == awVar) {
                px4Var = px4Var2;
                objK5 = new cr6(nr6Var, supportSession, px4Var, (byte) 1);
                ux2Var.g0(objK5);
            } else {
                px4Var = px4Var2;
            }
            xo1.k((Function0) objK5, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(ka0.B(cs4Var, 4.0f), 40.0f), "TVTA-devicesScreen-serviceQueue-moreButton"), false, null, null, qf0.g, ux2Var, 1572912, 60);
            boolean zBooleanValue = ((Boolean) px4Var.getValue()).booleanValue();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(-16.0f)) << 32);
            long j2 = ep1.r(ux2Var).p;
            boolean zH5 = ux2Var.h(nr6Var) | ux2Var.h(supportSession);
            Object objK6 = ux2Var.K();
            if (zH5 || objK6 == awVar) {
                objK6 = new cr6(nr6Var, supportSession, px4Var, (byte) 2);
                ux2Var.g0(objK6);
            }
            jj.a(zBooleanValue, (Function0) objK6, null, jFloatToRawIntBits, null, null, null, j2, 0.0f, au8.O(-410889992, new y81(nr6Var, supportSession, z, px4Var), ux2Var), ux2Var, 3072, 1908);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            ux2Var2.p(true);
            z4 = z7;
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
            z4 = z3;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.fr6
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wo1.s(supportSession, z, nr6Var, fs4Var2, z4, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final void t(boolean z, boolean z2, a06 a06Var, dw6 dw6Var, iv6 iv6Var, String str, Function0 function0, Function0 function1, ux2 ux2Var, int i) {
        ux2Var.Y(-606166760);
        int i2 = i | (ux2Var.g(z) ? 4 : 2) | (ux2Var.g(z2) ? 32 : 16) | (ux2Var.f(a06Var) ? 256 : 128) | (ux2Var.f(dw6Var) ? 2048 : 1024) | (ux2Var.f(iv6Var) ? 16384 : 8192) | (ux2Var.f(str) ? 131072 : 65536) | (ux2Var.h(function0) ? 1048576 : 524288) | (ux2Var.h(function1) ? 8388608 : 4194304);
        if (ux2Var.N(i2 & 1, (4793491 & i2) != 4793490)) {
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fillElement);
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
            b77.a(ux2Var, androidx.compose.foundation.layout.b.d(cs4.b, 16.0f));
            int i3 = (i2 & 8190) | (57344 & (i2 >> 6));
            int i4 = i2 << 3;
            nv1.j(z, z2, a06Var, dw6Var, function0, iv6Var, str, null, function1, ux2Var, i3 | (458752 & i4) | (3670016 & i4) | (i4 & 234881024));
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new jr6(z, z2, a06Var, dw6Var, iv6Var, str, function0, function1, i);
        }
    }

    public static final void u(eg3 eg3Var, boolean z, a06 a06Var, dw6 dw6Var, iv6 iv6Var, boolean z2, Function1 function1, ux2 ux2Var, int i) {
        ux2Var.Y(206747190);
        int i2 = i | (ux2Var.d(eg3Var == null ? -1 : eg3Var.ordinal()) ? 4 : 2) | (ux2Var.g(z) ? 32 : 16) | (ux2Var.f(a06Var) ? 256 : 128) | (ux2Var.f(dw6Var) ? 2048 : 1024) | (ux2Var.f(iv6Var) ? 16384 : 8192) | (ux2Var.g(z2) ? 131072 : 65536) | (ux2Var.h(function1) ? 1048576 : 524288);
        if (ux2Var.N(i2 & 1, (599187 & i2) != 599186)) {
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fillElement);
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
            o67.n(do4VarC, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fillElement);
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
            io1.v(eg3Var, z, a06Var, dw6Var, iv6Var, function1, z2, null, null, ux2Var, (i2 & 65534) | ((i2 >> 3) & 458752) | (3670016 & (i2 << 3)));
            ux2Var.p(true);
            if (z) {
                ux2Var.W(-2111324658);
                lv1.B(androidx.compose.foundation.layout.b.p(ya0.a.a(androidx.compose.foundation.layout.b.b, xz2.q), 2.0f), 0.0f, ((rn4) ux2Var.j(un4.a)).a.r, ux2Var, 0);
                ux2Var.p(false);
            } else {
                ux2Var.W(-2111076410);
                ux2Var.p(false);
            }
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new r23(eg3Var, z, a06Var, dw6Var, iv6Var, z2, function1, i);
        }
    }

    public static final void v(final a06 a06Var, final Function1 function1, final dw6 dw6Var, iv6 iv6Var, final boolean z, final eg3 eg3Var, fs4 fs4Var, ux2 ux2Var, final int i) {
        iv6 iv6Var2;
        ux2 ux2Var2;
        fs4 fs4Var2;
        px4 px4Var;
        Object obj;
        a06Var.getClass();
        function1.getClass();
        dw6Var.getClass();
        ux2Var.Y(2078533935);
        int i2 = i | (ux2Var.f(a06Var) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | (ux2Var.f(dw6Var) ? 256 : 128) | (ux2Var.f(iv6Var) ? 2048 : 1024) | (ux2Var.g(z) ? 16384 : 8192) | (ux2Var.d(eg3Var == null ? -1 : eg3Var.ordinal()) ? 131072 : 65536) | 1572864;
        byte b2 = 1;
        if (ux2Var.N(i2 & 1, (599187 & i2) != 599186)) {
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ck3.w(ux2Var);
                ux2Var.g0(objK);
            }
            me1 me1Var = (me1) objK;
            hc1 hc1Var = null;
            ul1 ul1VarA = wu7.a(null, ux2Var, 15);
            boolean z2 = ul1VarA.f().a >= 2;
            boolean z3 = a06Var.c && !a06Var.a();
            px4 px4VarT = h57.t(function1, ux2Var);
            qu7 qu7VarD = ul1VarA.d();
            String string = (qu7VarD == null || (obj = qu7VarD.b) == null) ? null : obj.toString();
            Object[] objArr = new Object[0];
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = new jv6(b2);
                ux2Var.g0(objK2);
            }
            px4 px4Var2 = (px4) zu1.L(objArr, (Function0) objK2, ux2Var, 48);
            boolean zH = ux2Var.h(me1Var) | ux2Var.f(ul1VarA);
            Object objK3 = ux2Var.K();
            if (zH || objK3 == awVar) {
                objK3 = new rw1(me1Var, ul1VarA, (byte) 3);
                ux2Var.g0(objK3);
            }
            Function0 function0 = (Function0) objK3;
            Object objK4 = ux2Var.K();
            if (objK4 == awVar) {
                objK4 = new l5(2, hc1Var, (byte) 20);
                ux2Var.g0(objK4);
            }
            ck3.i(f88.a, (hw2) objK4, ux2Var);
            boolean zF = ux2Var.f(string) | ux2Var.f(px4VarT) | ux2Var.f(px4Var2);
            Object objK5 = ux2Var.K();
            if (zF || objK5 == awVar) {
                px4Var = px4Var2;
                k9 k9Var = new k9(string, px4Var, px4VarT, hc1Var, (byte) 9);
                ux2Var.g0(k9Var);
                objK5 = k9Var;
            } else {
                px4Var = px4Var2;
            }
            ck3.i(string, (hw2) objK5, ux2Var);
            ye5 ye5VarF = ul1VarA.f();
            cv7 cv7VarG = ul1VarA.g();
            boolean z4 = z2;
            yy0 yy0VarO = au8.O(-273329739, new s71(eg3Var, z4, a06Var, dw6Var, iv6Var, z, me1Var, ul1VarA), ux2Var);
            boolean z5 = z3;
            dy dyVar = new dy(ul1VarA, z4, px4Var, dw6Var, z5, a06Var, iv6Var, function0, me1Var);
            iv6Var2 = iv6Var;
            yy0 yy0VarO2 = au8.O(-2146543276, dyVar, ux2Var);
            yy0 yy0VarO3 = au8.O(-1598003054, new xv6(ul1VarA, z5, iv6Var2, me1Var), ux2Var);
            fs4Var2 = cs4.b;
            ux2Var2 = ux2Var;
            et1.f(ye5VarF, cv7VarG, yy0VarO, yy0VarO2, fs4Var2, yy0VarO3, null, ux2Var2, 224640, 192);
            boolean zC = ul1.c(ul1VarA);
            boolean zH2 = ux2Var2.h(me1Var) | ux2Var2.f(ul1VarA);
            Object objK6 = ux2Var2.K();
            if (zH2 || objK6 == awVar) {
                objK6 = new rw1(me1Var, ul1VarA, (byte) 4);
                ux2Var2.g0(objK6);
            }
            kh.c(zC, (Function0) objK6, ux2Var2, 0, 0);
        } else {
            iv6Var2 = iv6Var;
            ux2Var2 = ux2Var;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            final fs4 fs4Var3 = fs4Var2;
            final iv6 iv6Var3 = iv6Var2;
            j56VarR.d = new hw2(function1, dw6Var, iv6Var3, z, eg3Var, fs4Var3, i) { // from class: o.yv6
                public final /* synthetic */ Function1 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ dw6 f2648o;
                public final /* synthetic */ iv6 p;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ eg3 r;
                public final /* synthetic */ fs4 s;

                @Override // o.hw2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = yo1.Y(1);
                    wo1.v(this.m, this.n, this.f2648o, this.p, this.q, this.r, this.s, (ux2) obj2, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final io6 w(io.sentry.android.core.n1 n1Var, ja0 ja0Var) {
        ef1 ef1VarH = n1Var.h();
        rr0 rr0Var = (rr0) n1Var.p;
        boolean z = ef1VarH == ef1.m;
        return new io6(x(rr0Var, z, true, ja0Var), x(rr0Var, z, false, ja0Var), z);
    }

    public static final ho6 x(rr0 rr0Var, boolean z, boolean z2, ja0 ja0Var) {
        long j;
        long j2 = ja0Var.j(z2 ? rr0Var.b : rr0Var.c, rr0Var);
        if (z ^ z2) {
            int i = gt7.c;
            j = j2 >> 32;
        } else {
            int i2 = gt7.c;
            j = 4294967295L & j2;
        }
        return rr0Var.d((int) j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable y(jp2 jp2Var, ho2 ho2Var, jc1 jc1Var) throws Throwable {
        vo2 vo2Var;
        k76 k76Var;
        bp3 bp3Var;
        CancellationException cancellationExceptionZ;
        if (jc1Var instanceof vo2) {
            vo2Var = (vo2) jc1Var;
            int i = vo2Var.f2334o;
            if ((i & Integer.MIN_VALUE) != 0) {
                vo2Var.f2334o = i - Integer.MIN_VALUE;
            } else {
                vo2Var = new vo2(jc1Var);
            }
        } else {
            vo2Var = new vo2(jc1Var);
        }
        Object obj = vo2Var.n;
        int i2 = vo2Var.f2334o;
        if (i2 == 0) {
            ct1.a0(obj);
            k76 k76Var2 = new k76();
            try {
                ho2 x22Var = new x22(ho2Var, k76Var2);
                vo2Var.m = k76Var2;
                vo2Var.f2334o = 1;
                Object objB = jp2Var.b(x22Var, vo2Var);
                ne1 ne1Var = ne1.m;
                if (objB == ne1Var) {
                    return ne1Var;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                k76Var = k76Var2;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k76Var = vo2Var.m;
            try {
                ct1.a0(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) k76Var.m;
        if ((th3 != null && th3.equals(th)) || ((bp3Var = (bp3) vo2Var.getContext().l0(z06.z)) != null && bp3Var.isCancelled() && (cancellationExceptionZ = bp3Var.z()) != null && cancellationExceptionZ.equals(th))) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            ct1.q(th3, th);
            throw th3;
        }
        ct1.q(th, th3);
        throw th;
    }

    public static final ho6 z(ho6 ho6Var, rr0 rr0Var, int i) {
        return new ho6(((vs7) rr0Var.e).a(i), i, ho6Var.c);
    }
}
