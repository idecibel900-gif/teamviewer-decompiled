package o;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.node.LayoutNode;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class xk0 {
    public static final yy0 f;
    public static final yy0 k;
    public static final yy0 l;
    public static final hr2 m;
    public static final ln1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final nx3 f2524o;
    public static final int[] p;
    public static final int[] q;
    public static final aw0 r;
    public static final ax6 s;
    public static final aw0 t;
    public static final i68 u;
    public static final byte[] v;
    public static final Object w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final tc8 e = tc8.n;
    public static final yy0 g = new yy0(956808366, false, new az0(12));
    public static final yy0 h = new yy0(-905046521, false, new bz0(18));
    public static final yy0 i = new yy0(-1210681050, false, new bz0(19));
    public static final yy0 j = new yy0(1937380830, false, new az0(28));

    static {
        byte b2 = 14;
        f = new yy0(-168228912, false, new zy0(b2));
        new yy0(-1889154954, false, new fz0((byte) 20));
        k = new yy0(-370820252, false, new hz0((byte) 24));
        l = new yy0(2026212512, false, new hz0((byte) 25));
        m = new hr2("CLOSED", b2);
        n = new ln1(1.0f, 1.0f);
        f2524o = new nx3((Object) new ir((byte) 21), (byte) 1);
        p = new int[]{R.attr.theme, com.teamviewer.teamviewer.market.mobile.R.attr.theme};
        q = new int[]{com.teamviewer.teamviewer.market.mobile.R.attr.materialThemeOverlay};
        r = aw0.p;
        s = ax6.f371o;
        t = aw0.n;
        u = i68.f1042o;
        v = new byte[]{6, 2, 0, 0, 0, -92, 0, 0, 82, 83, 65, 49, 0, 4, 0, 0, 1, 0, 1, 0, 103, 36, 79, 67, 110, 103, 98, -14, 94, -88, -41, 4, -27, 34, -65, -91, 93, -95, 106, -12, -119, 58, 64, -62, -119, 5, 59, -24, -63, 105, 125, 116, -40, 54, -4, 29, 47, 110, 38, -67, -78, 102, -108, 55, 40, 111, -61, 71, -112, 56, 44, -40, 15, 33, -5, 90, 76, 124, 100, 24, -107, 87, -9, -64, -55, -102, 69, 122, 99, 101, -2, 67, 35, 116, 64, -17, 94, 87, -32, -73, -82, 43, 53, -56, -118, -19, -60, 5, 22, 48, 17, 119, 113, 75, 5, -27, 5, 45, 108, -19, -86, -45, 36, 62, 67, 3, -89, 46, -99, -112, 103, 119, -76, -74, 28, -33, 99, 86, 41, -110, 63, 2, 35, 114, 34, -83, 124, -62};
        w = new Object();
        x = new int[]{com.teamviewer.teamviewer.market.mobile.R.attr.colorPrimary};
        y = new int[]{com.teamviewer.teamviewer.market.mobile.R.attr.colorPrimaryVariant};
    }

    public static final int[] A(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = j51.U(((rv0) list.get(i2)).a);
        }
        return iArr;
    }

    public static final float[] B(List list, List list2) {
        if (list != null) {
            return lv0.N0(list);
        }
        return null;
    }

    public static de1 C(be1 be1Var, ce1 ce1Var) {
        ce1Var.getClass();
        return im3.n(be1Var.getKey(), ce1Var) ? ba2.m : be1Var;
    }

    public static final boolean D(j57 j57Var, Function1 function1) {
        int i2;
        c2 c2Var;
        Object objInvoke;
        n47 n47VarH;
        boolean zI;
        do {
            synchronized (w) {
                o97 o97Var = j57Var.m;
                o97Var.getClass();
                o97 o97Var2 = (o97) v47.f(o97Var);
                i2 = o97Var2.d;
                c2Var = o97Var2.c;
            }
            c2Var.getClass();
            kk5 kk5VarF = c2Var.f();
            objInvoke = function1.invoke(kk5VarF);
            c2 c2VarC = kk5VarF.c();
            if (im3.n(c2VarC, c2Var)) {
                break;
            }
            o97 o97Var3 = j57Var.m;
            o97Var3.getClass();
            synchronized (v47.c) {
                n47VarH = v47.h();
                zI = i((o97) v47.w(o97Var3, j57Var, n47VarH), i2, c2VarC, true);
            }
            v47.l(n47VarH, j57Var);
        } while (!zI);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static TypedArray E(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        l(context, attributeSet, i2, i3);
        n(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static ep3 F(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        l(context, attributeSet, i2, i3);
        n(context, attributeSet, iArr, i2, i3, iArr2);
        return new ep3(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public static de1 G(be1 be1Var, de1 de1Var) {
        de1Var.getClass();
        return de1Var == ba2.m ? be1Var : (de1) de1Var.b0(be1Var, new iz0((byte) 24));
    }

    public static final long H(float f2, long j2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static Stream I(td2 td2Var, o82 o82Var) {
        td2Var.e();
        return ds1.i0(o82Var, o82.class).filter(new jd2(td2Var, o82Var, (byte) 0));
    }

    public static final c35 J(lc6 lc6Var) {
        of0 of0VarE0;
        int i2 = lc6Var.p;
        long j2 = lc6Var.x;
        long j3 = lc6Var.y;
        k53 k53Var = lc6Var.r;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = k53Var.iterator();
        while (true) {
            j1 j1Var = (j1) it;
            if (!j1Var.hasNext()) {
                break;
            }
            vd5 vd5Var = (vd5) j1Var.next();
            String str = (String) vd5Var.m;
            String str2 = (String) vd5Var.n;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        w25 w25Var = new w25(xm4.V(linkedHashMap));
        nc6 nc6Var = lc6Var.s;
        return new c35(i2, j2, j3, w25Var, (nc6Var == null || (of0VarE0 = nc6Var.E0()) == null) ? null : new a77(of0VarE0), lc6Var);
    }

    public static final long[] K(List list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = ck3.x0(((rv0) list.get(i2)).a);
        }
        return jArr;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0 A[LOOP:1: B:29:0x00ba->B:31:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final ab6 L(z25 z25Var, jc1 jc1Var) {
        vi0 vi0Var;
        yc4 yc4Var;
        String str;
        yc4 yc4Var2;
        z25 z25Var2;
        bb6 bb6Var;
        ArrayList arrayList;
        String str2;
        if (jc1Var instanceof vi0) {
            vi0Var = (vi0) jc1Var;
            int i2 = vi0Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vi0Var.n = i2 - Integer.MIN_VALUE;
            } else {
                vi0Var = new vi0(jc1Var);
            }
        } else {
            vi0Var = new vi0(jc1Var);
        }
        Object obj = vi0Var.m;
        int i3 = vi0Var.n;
        yc4 yc4Var3 = null;
        if (i3 != 0) {
            if (i3 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
            ai0 ai0Var = (ai0) obj;
            if (ai0Var != null) {
                int i4 = db6.a;
                bb6Var = new bb6(null, ai0Var);
                z25Var2 = null;
                yc4Var2 = null;
                str = null;
            } else {
                z25Var = null;
                yc4Var = null;
                yc4Var2 = null;
                str = null;
            }
            yc4Var3.P(str, bb6Var);
            w25 w25Var = z25Var2.c;
            arrayList = new ArrayList(20);
            for (Map.Entry entry : w25Var.a.entrySet()) {
                str2 = (String) entry.getKey();
                for (String str3 : (List) entry.getValue()) {
                    str2.getClass();
                    str3.getClass();
                    i67.t(str2);
                    arrayList.add(str2);
                    arrayList.add(ub7.x0(str3).toString());
                }
            }
            k53 k53Var = new k53((String[]) arrayList.toArray(new String[0]));
            yc4Var2.getClass();
            yc4Var2.f2598o = i67.k(k53Var);
            return new ab6(yc4Var2);
        }
        ct1.a0(obj);
        yc4Var = new yc4((byte) 17);
        String strConcat = z25Var.a;
        if (bc7.N(true, strConcat, "ws:")) {
            strConcat = "http:".concat(strConcat.substring(3));
        } else if (bc7.N(true, strConcat, "wss:")) {
            strConcat = "https:".concat(strConcat.substring(4));
        }
        g93 g93Var = new g93();
        g93Var.c(null, strConcat);
        yc4Var.m = g93Var.a();
        str = z25Var.b;
        yc4Var2 = yc4Var;
        yc4 yc4Var4 = yc4Var;
        z25Var2 = z25Var;
        bb6Var = null;
        yc4Var3 = yc4Var4;
        yc4Var3.P(str, bb6Var);
        w25 w25Var2 = z25Var2.c;
        arrayList = new ArrayList(20);
        while (r5.hasNext()) {
            str2 = (String) entry.getKey();
            while (r1.hasNext()) {
                str2.getClass();
                str3.getClass();
                i67.t(str2);
                arrayList.add(str2);
                arrayList.add(ub7.x0(str3).toString());
            }
        }
        k53 k53Var2 = new k53((String[]) arrayList.toArray(new String[0]));
        yc4Var2.getClass();
        yc4Var2.f2598o = i67.k(k53Var2);
        return new ab6(yc4Var2);
    }

    public static final void M(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            hk0.g("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            hk0.g("colors and colorStops arguments must have equal length.");
        }
    }

    public static final void N(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            hk0.r(fx3.d(i2, i3, "index (", ") is out of bound of [0, ", ")"));
        }
    }

    public static Context O(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof gc1) && ((gc1) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        gc1 gc1Var = new gc1(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            gc1Var.getTheme().applyStyle(resourceId2, true);
        }
        return gc1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    public static final void a(iv6 iv6Var, Function0 function0, fs4 fs4Var, j6 j6Var, ux2 ux2Var, int i2) {
        int i3;
        fs4 fs4Var2;
        j6 j6Var2;
        ux2 ux2Var2;
        j6 j6Var3;
        int i4;
        fs4 fs4Var3;
        j6 j6Var4;
        Object t5Var;
        ?? r9;
        boolean z;
        ux2 ux2Var3;
        j6 j6Var5;
        Object obj;
        ux2 ux2Var4;
        ?? r5;
        ?? r2;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        ux2 ux2Var5;
        boolean z2;
        Object obj6;
        ux2 ux2Var6 = ux2Var;
        function0.getClass();
        ux2Var6.Y(2142515552);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var6.f(iv6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var6.h(function0) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 = i3 | 1408;
        }
        byte b2 = 1;
        byte b3 = 0;
        if (ux2Var6.N(i5 & 1, (i5 & 1171) != 1170)) {
            ux2Var6.S();
            int i6 = i2 & 1;
            cs4 cs4Var = cs4.b;
            if (i6 == 0 || ux2Var6.x()) {
                dl5 dl5Var = new dl5(new e5(b2), (byte) 1);
                we8 we8VarA = id4.a(ux2Var6);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    j6Var3 = (j6) g57.t(w86.a.b(j6.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var6);
                    i4 = i5 & (-7169);
                    fs4Var3 = cs4Var;
                }
            } else {
                ux2Var6.Q();
                fs4Var3 = fs4Var;
                i4 = i5 & (-7169);
                j6Var3 = j6Var;
            }
            ux2Var6.q();
            Context context = (Context) ux2Var6.j(lh.b);
            px4 px4VarG = g57.g(j6Var3.B, ux2Var6);
            px4 px4VarT = h57.t(function0, ux2Var6);
            int i7 = i4 & 14;
            boolean zH = ux2Var6.h(j6Var3) | (i7 == 4) | ux2Var6.h(context);
            Object objK = ux2Var6.K();
            Object obj7 = e01.a;
            Object obj8 = objK;
            if (zH || objK == obj7) {
                Object m5Var = new m5(j6Var3, context, iv6Var, b3);
                ux2Var6.g0(m5Var);
                obj8 = m5Var;
            }
            Function1 function1 = (Function1) obj8;
            boolean zH2 = (i7 == 4) | ux2Var6.h(context) | ux2Var6.h(j6Var3);
            Object objK2 = ux2Var6.K();
            Object obj9 = objK2;
            if (zH2 || objK2 == obj7) {
                Object n5Var = new n5(j6Var3, iv6Var, context, b3);
                ux2Var6.g0(n5Var);
                obj9 = n5Var;
            }
            Function0 function2 = (Function0) obj9;
            boolean zH3 = (i7 == 4) | ux2Var6.h(j6Var3) | ux2Var6.h(context) | ux2Var6.f(px4VarT);
            Object objK3 = ux2Var6.K();
            if (zH3 || objK3 == obj7) {
                j6Var4 = j6Var3;
                r9 = 0;
                z = true;
                t5Var = new t5((Object) j6Var4, (Object) context, (Object) iv6Var, (Object) px4VarT, (hc1) null, (byte) 0);
                ux2Var6.g0(t5Var);
            } else {
                j6Var4 = j6Var3;
                r9 = 0;
                t5Var = objK3;
                z = true;
            }
            ck3.i(f88.a, (hw2) t5Var, ux2Var6);
            fs4 fs4VarZ = im3.Z(fs4Var3.f(androidx.compose.foundation.layout.b.c), im3.W(ux2Var6), z);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var6, r9);
            int iHashCode = Long.hashCode(ux2Var6.T);
            yj5 yj5VarL = ux2Var6.l();
            fs4 fs4VarS = uf0.s(ux2Var6, fs4VarZ);
            yz0.c.getClass();
            ux2Var6.a0();
            if (ux2Var6.S) {
                ux2Var6.k(LayoutNode.e0);
            } else {
                ux2Var6.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var6);
            o67.n(yj5VarL, d82.u, ux2Var6);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var6);
            o67.l(ux2Var6);
            o67.n(fs4VarS, d82.t, ux2Var6);
            fs4 fs4Var4 = fs4Var3;
            String strM = ((a6) px4VarG.getValue()).a;
            if (strM == null) {
                strM = to7.m(ux2Var6, 1012347974, com.teamviewer.teamviewer.market.mobile.R.string.tv_account_display_name_empty_state, ux2Var6, r9);
            } else {
                ux2Var6.W(1012347323);
                ux2Var6.p(r9);
            }
            boolean z3 = r9;
            boolean z4 = z;
            byte b4 = 2;
            ka0.a(new r4(strM, ((a6) px4VarG.getValue()).d), true, null, null, null, "TVTA-settings-account-name", ux2Var, 196656, 28);
            yk7 yk7Var = new yk7(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_mail);
            m78 m78VarG = y57.g(com.teamviewer.teamviewer.market.mobile.R.string.tv_email);
            String str = ((a6) px4VarG.getValue()).b;
            int i8 = 24576;
            x37.e(new sk7(m78VarG, str != null ? new n78(str) : null, yk7Var, null, 8), null, null, null, "TVTA-settings-account-email", ux2Var, 24576, 46);
            yk7 yk7Var2 = new yk7(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_checkmark_starburst);
            m78 m78VarG2 = y57.g(com.teamviewer.teamviewer.market.mobile.R.string.tv_activated_license);
            String str2 = ((a6) px4VarG.getValue()).c;
            ux2 ux2Var7 = ux2Var;
            x37.e(new sk7(m78VarG2, str2 != null ? new n78(str2) : null, yk7Var2, null, 8), null, null, null, "TVTA-settings-account-license", ux2Var7, 24576, 46);
            if (((a6) px4VarG.getValue()).e) {
                ux2Var7.W(1318991136);
                l47.d(new sk7(y57.g(com.teamviewer.teamviewer.market.mobile.R.string.tv_account_trusted_device_preference_title), y57.g(com.teamviewer.teamviewer.market.mobile.R.string.tv_account_trusted_device_preference_summary), new yk7(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_phone_notifications), null, 8), ((a6) px4VarG.getValue()).f, function1, null, "TVTA-settings-account-trusted", null, ux2Var, 24576, 104);
                ux2 ux2Var8 = ux2Var;
                i8 = 24576;
                ux2Var8.p(z3);
                ux2Var3 = ux2Var8;
            } else {
                ux2Var7.W(1319577656);
                ux2Var7.p(z3);
                ux2Var3 = ux2Var7;
            }
            if (((a6) px4VarG.getValue()).g) {
                ux2Var3.W(1319666378);
                j6Var5 = j6Var4;
                ux2 ux2Var9 = ux2Var3;
                b4 = 2;
                r5 = z4 ? 1 : 0;
                obj = obj7;
                lv1.k(null, 0.0f, 0L, ux2Var9, 0, 7);
                if (((a6) px4VarG.getValue()).h) {
                    ux2Var9.W(1319724999);
                    b77.a(ux2Var9, androidx.compose.foundation.layout.b.d(cs4Var, 16.0f));
                    sk7 sk7Var = new sk7(y57.g(com.teamviewer.teamviewer.market.mobile.R.string.tv_signOut), null, new yk7(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_sign_out), null, 10);
                    boolean zH4 = ux2Var9.h(j6Var5);
                    Object objK4 = ux2Var9.K();
                    if (zH4 || objK4 == obj) {
                        obj6 = objK4;
                        Object o5Var = new o5(j6Var5, z3 ? (byte) 1 : (byte) 0);
                        ux2Var9.g0(o5Var);
                        obj6 = o5Var;
                    }
                    Function0 function3 = (Function0) obj6;
                    ux2 ux2Var10 = ux2Var9;
                    boolean z5 = z3 ? 1 : 0;
                    x37.e(sk7Var, null, null, function3, "TVTA-settings-account-sign-out", ux2Var10, i8, 38);
                    ux2Var10.p(z5);
                    z2 = z5;
                    ux2Var5 = ux2Var10;
                } else {
                    boolean z6 = z3 ? 1 : 0;
                    ux2 ux2Var11 = ux2Var9;
                    ux2Var11.W(1320202616);
                    ux2Var11.p(z6);
                    z2 = z6;
                    ux2Var5 = ux2Var11;
                }
                if (((a6) px4VarG.getValue()).i) {
                    ux2Var5.W(1320271746);
                    b77.a(ux2Var5, androidx.compose.foundation.layout.b.d(cs4Var, 16.0f));
                    x37.e(new sk7(y57.g(com.teamviewer.teamviewer.market.mobile.R.string.delete_account_label), null, new yk7(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_delete), null, 10), null, null, function2, "TVTA-settings-account-delete", ux2Var5, i8, 38);
                    ux2Var5.p(z2);
                } else {
                    ux2Var5.W(1320754168);
                    ux2Var5.p(z2);
                }
                b77.a(ux2Var5, androidx.compose.foundation.layout.b.d(r9, 16.0f));
                ux2Var5.p(z2);
                r2 = z2;
                ux2Var4 = ux2Var5;
            } else {
                j6Var5 = j6Var4;
                boolean z7 = z3 ? 1 : 0;
                obj = obj7;
                ux2Var3.W(1320817656);
                ux2Var3.p(z7);
                r2 = z7;
                r5 = z4;
                ux2Var4 = ux2Var3;
            }
            ux2Var4.p(r5);
            if (((a6) px4VarG.getValue()).j != b12.m) {
                ux2Var4.W(178715543);
                int iOrdinal = ((a6) px4VarG.getValue()).j.ordinal();
                if (iOrdinal == r5) {
                    ux2Var4.W(178770103);
                    boolean zH5 = ux2Var4.h(j6Var5);
                    Object objK5 = ux2Var4.K();
                    if (zH5 || objK5 == obj) {
                        obj2 = objK5;
                        Object o5Var2 = new o5(j6Var5, r5);
                        ux2Var4.g0(o5Var2);
                        obj2 = o5Var2;
                    }
                    vs1.g(r2, (Function0) obj2, ux2Var4, null);
                    ux2Var4.p(r2);
                } else if (iOrdinal != b4) {
                    byte b5 = 3;
                    if (iOrdinal == 3) {
                        ux2Var4.W(179149233);
                        boolean zH6 = ux2Var4.h(j6Var5);
                        Object objK6 = ux2Var4.K();
                        if (zH6 || objK6 == obj) {
                            obj4 = objK6;
                            Object o5Var3 = new o5(j6Var5, b5);
                            ux2Var4.g0(o5Var3);
                            obj4 = o5Var3;
                        }
                        g68.b(r2, (Function0) obj4, ux2Var4, null);
                        ux2Var4.p(r2);
                    } else if (iOrdinal != 4) {
                        ux2Var4.W(179575328);
                        ux2Var4.p(r2);
                    } else {
                        ux2Var4.W(179345866);
                        boolean zH7 = ux2Var4.h(j6Var5);
                        Object objK7 = ux2Var4.K();
                        if (zH7 || objK7 == obj) {
                            obj5 = objK7;
                            Object o5Var4 = new o5(j6Var5, (byte) 4);
                            ux2Var4.g0(o5Var4);
                            obj5 = o5Var4;
                        }
                        Function0 function4 = (Function0) obj5;
                        boolean zH8 = ux2Var4.h(j6Var5);
                        Object objK8 = ux2Var4.K();
                        Object obj10 = objK8;
                        if (zH8 || objK8 == obj) {
                            Object o5Var5 = new o5(j6Var5, (byte) 5);
                            ux2Var4.g0(o5Var5);
                            obj10 = o5Var5;
                        }
                        im3.d(r2, function4, (Function0) obj10, ux2Var4, null);
                        ux2Var4.p(r2);
                    }
                } else {
                    ux2Var4.W(178956630);
                    boolean zH9 = ux2Var4.h(j6Var5);
                    Object objK9 = ux2Var4.K();
                    if (zH9 || objK9 == obj) {
                        obj3 = objK9;
                        Object o5Var6 = new o5(j6Var5, b4);
                        ux2Var4.g0(o5Var6);
                        obj3 = o5Var6;
                    }
                    ka0.c(r2, (Function0) obj3, ux2Var4, null);
                    ux2Var4.p(r2);
                }
                ux2Var4.p(r2);
            } else {
                ux2Var4.W(179593122);
                ux2Var4.p(r2);
            }
            j6Var2 = j6Var5;
            fs4Var2 = fs4Var4;
            ux2Var2 = ux2Var4;
        } else {
            ux2Var6.Q();
            fs4Var2 = fs4Var;
            j6Var2 = j6Var;
            ux2Var2 = ux2Var6;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new p5((Object) iv6Var, (Object) function0, (Object) fs4Var2, (Object) j6Var2, i2, (byte) 0);
        }
    }

    public static final void b(iv6 iv6Var, Context context, j51 j51Var) {
        ul7 ul7Var;
        Function1 function1 = iv6Var.j;
        Function0 function0 = iv6Var.k;
        context.getClass();
        function0.getClass();
        boolean zEquals = j51Var.equals(x5.C);
        g37 g37Var = g37.m;
        if (zEquals) {
            String string = context.getString(com.teamviewer.teamviewer.market.mobile.R.string.settings_connection_lost);
            string.getClass();
            ul7Var = new ul7(sl7.p, string, g37Var, context.getString(com.teamviewer.teamviewer.market.mobile.R.string.settings_offline_content_description), null, function0, 168);
        } else {
            boolean zEquals2 = j51Var.equals(z5.C);
            sl7 sl7Var = sl7.m;
            if (zEquals2) {
                String string2 = context.getString(com.teamviewer.teamviewer.market.mobile.R.string.settings_successful_sign_out_snackbar_message);
                string2.getClass();
                ul7Var = new ul7(sl7Var, string2, g37Var, null, null, function0, 184);
            } else {
                boolean zEquals3 = j51Var.equals(y5.C);
                sl7 sl7Var2 = sl7.f2030o;
                if (zEquals3) {
                    String string3 = context.getString(com.teamviewer.teamviewer.market.mobile.R.string.settings_error_sign_out_snackbar_message);
                    string3.getClass();
                    ul7Var = new ul7(sl7Var2, string3, g37Var, null, null, function0, 184);
                } else if (j51Var.equals(w5.C)) {
                    String string4 = context.getString(com.teamviewer.teamviewer.market.mobile.R.string.settings_successful_account_deleted_snackbar_message);
                    string4.getClass();
                    ul7Var = new ul7(sl7Var, string4, g37Var, null, null, function0, 184);
                } else if (!j51Var.equals(v5.C)) {
                    gk0.s();
                    return;
                } else {
                    String string5 = context.getString(com.teamviewer.teamviewer.market.mobile.R.string.settings_error_account_deleted_snackbar_message);
                    string5.getClass();
                    ul7Var = new ul7(sl7Var2, string5, g37Var, null, null, function0, 184);
                }
            }
        }
        function1.invoke(ul7Var);
    }

    public static final void c(h71 h71Var, r81 r81Var, Function0 function0, boolean z, ux2 ux2Var, int i2) {
        ux2Var.Y(-437371838);
        int i3 = i2 | (ux2Var.h(h71Var) ? 4 : 2) | (ux2Var.h(r81Var) ? 32 : 16) | (ux2Var.h(function0) ? 256 : 128) | (ux2Var.g(z) ? 2048 : 1024);
        byte b2 = 1;
        byte b3 = 0;
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, cs4.b);
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
            int i4 = i3 & 896;
            boolean zH = (i4 == 256) | ux2Var.h(r81Var) | ux2Var.h(h71Var);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (zH || objK == awVar) {
                objK = new u81(function0, r81Var, h71Var, (byte) 10);
                ux2Var.g0(objK);
            }
            d(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_connect, com.teamviewer.teamviewer.market.mobile.R.string.option_connect, "TVTA-devicesScreen-contactList-connectAction", (Function0) objK, ux2Var, 384);
            boolean zH2 = (i4 == 256) | ux2Var.h(r81Var) | ux2Var.h(h71Var);
            Object objK2 = ux2Var.K();
            if (zH2 || objK2 == awVar) {
                objK2 = new u81(function0, r81Var, h71Var, b3);
                ux2Var.g0(objK2);
            }
            d(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_filetransfer, com.teamviewer.teamviewer.market.mobile.R.string.option_file_transfer, "TVTA-devicesScreen-contactList-transferFileAction", (Function0) objK2, ux2Var, 384);
            if (z) {
                ux2Var.W(2082718486);
                ux2Var.p(false);
            } else {
                ux2Var.W(2082255284);
                boolean zH3 = (i4 == 256) | ux2Var.h(r81Var) | ux2Var.h(h71Var);
                Object objK3 = ux2Var.K();
                if (zH3 || objK3 == awVar) {
                    objK3 = new u81(function0, r81Var, h71Var, b2);
                    ux2Var.g0(objK3);
                }
                d(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_show, com.teamviewer.teamviewer.market.mobile.R.string.contact_action_show_details, "TVTA-devicesScreen-contactList-showDetailsAction", (Function0) objK3, ux2Var, 384);
                ux2Var.p(false);
            }
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new v81(h71Var, r81Var, function0, z, i2, (byte) 0);
        }
    }

    public static final void d(int i2, int i3, String str, Function0 function0, ux2 ux2Var, int i4) {
        ux2Var.Y(1853367028);
        int i5 = (ux2Var.d(i2) ? 4 : 2) | i4 | (ux2Var.d(i3) ? 32 : 16) | (ux2Var.h(function0) ? 2048 : 1024);
        byte b2 = 0;
        byte b3 = 1;
        if (ux2Var.N(i5 & 1, (i5 & 1171) != 1170)) {
            jj.b(au8.O(1995766052, new w81(i3, b2), ux2Var), function0, androidx.compose.ui.platform.a.a(cs4.b, str), au8.O(-13557311, new w81(i2, b3), ux2Var), false, null, ka0.i(2, 12.0f), ux2Var, ((i5 >> 6) & 112) | 12585990, 368);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new x81(i2, i3, str, function0, i4, (byte) 0);
        }
    }

    public static final void e(int i2, Function1 function1, h71 h71Var, r81 r81Var, ux2 ux2Var, fs4 fs4Var, boolean z, boolean z2) {
        int i3;
        fs4 fs4Var2;
        boolean z3;
        ux2 ux2Var2 = ux2Var;
        h71Var.getClass();
        function1.getClass();
        ux2Var2.Y(-392036041);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var2.h(h71Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var2.h(r81Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var2.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var2.h(function1) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i4 |= ux2Var2.g(z2) ? 131072 : 65536;
        }
        byte b2 = 0;
        if (ux2Var2.N(i4 & 1, (74899 & i4) != 74898)) {
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var2, cs4Var);
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
            fs4 fs4VarL = androidx.compose.foundation.layout.b.l(cs4Var, 32.0f);
            int i5 = i4 & 7168;
            boolean zH = (i5 == 2048) | ux2Var2.h(r81Var) | ux2Var2.h(h71Var);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (zH || objK == awVar) {
                objK = new t81(function1, r81Var, h71Var, b2);
                ux2Var2.g0(objK);
            }
            int i6 = i4;
            xo1.k((Function0) objK, fs4VarL, false, null, null, g68.i, ux2Var2, 1572912, 60);
            Object objK2 = ux2Var2.K();
            if (objK2 == awVar) {
                objK2 = new h31((byte) 4);
                ux2Var2.g0(objK2);
            }
            fs4 fs4VarA = cp6.a(cs4Var, false, (Function1) objK2);
            long j2 = ((rn4) ux2Var2.j(un4.a)).a.p;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(-16.0f)) << 32);
            boolean zH2 = ux2Var2.h(r81Var) | (i5 == 2048) | ux2Var2.h(h71Var);
            Object objK3 = ux2Var2.K();
            if (zH2 || objK3 == awVar) {
                z3 = true;
                objK3 = new t81(function1, r81Var, h71Var, 1 == true ? 1 : 0);
                ux2Var2.g0(objK3);
            } else {
                z3 = true;
            }
            jj.a(z, (Function0) objK3, fs4VarA, jFloatToRawIntBits, null, null, null, j2, 0.0f, au8.O(994712226, new y81(function1, r81Var, h71Var, z2), ux2Var2), ux2Var, ((i6 >> 6) & 14) | 3072, 1904);
            ux2Var2 = ux2Var;
            ux2Var2.p(z3);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new ey(i2, function1, h71Var, r81Var, fs4Var2, z, z2);
        }
    }

    public static final void f(h71 h71Var, r81 r81Var, Function0 function0, boolean z, ux2 ux2Var, int i2) {
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(1739198824);
        int i3 = i2 | (ux2Var2.h(h71Var) ? 4 : 2) | (ux2Var2.h(r81Var) ? 32 : 16) | (ux2Var2.h(function0) ? 256 : 128) | (ux2Var2.g(z) ? 2048 : 1024);
        if (ux2Var2.N(i3 & 1, (i3 & 1171) != 1170)) {
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, cs4.b);
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
            aw awVar = e01.a;
            if (z) {
                ux2Var2.W(-1117731376);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-1118225330);
                boolean zH = ((i3 & 896) == 256) | ux2Var2.h(r81Var) | ux2Var2.h(h71Var);
                Object objK = ux2Var2.K();
                if (zH || objK == awVar) {
                    objK = new u81(function0, r81Var, h71Var, (byte) 8);
                    ux2Var2.g0(objK);
                }
                d(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_info, com.teamviewer.teamviewer.market.mobile.R.string.contact_action_show_details, "TVTA-devicesScreen-contactList-showDetailsAction", (Function0) objK, ux2Var2, 384);
                ux2Var2 = ux2Var;
                lv1.k(null, 0.0f, 0L, ux2Var2, 0, 7);
                ux2Var2.p(false);
            }
            boolean zH2 = ux2Var2.h(r81Var) | ((i3 & 896) == 256) | ux2Var2.h(h71Var);
            Object objK2 = ux2Var2.K();
            if (zH2 || objK2 == awVar) {
                objK2 = new u81(function0, r81Var, h71Var, (byte) 9);
                ux2Var2.g0(objK2);
            }
            d(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_close, com.teamviewer.teamviewer.market.mobile.R.string.contact_action_remove_pending_contact, "TVTA-devicesScreen-contactList-removeContactAction", (Function0) objK2, ux2Var2, 384);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new v81(h71Var, r81Var, function0, z, i2, (byte) 2);
        }
    }

    public static final void g(h71 h71Var, r81 r81Var, Function0 function0, boolean z, ux2 ux2Var, int i2) {
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1919508029);
        byte b2 = 2;
        byte b3 = 4;
        int i3 = i2 | (ux2Var2.h(h71Var) ? 4 : 2) | (ux2Var2.h(r81Var) ? 32 : 16) | (ux2Var2.h(function0) ? 256 : 128) | (ux2Var2.g(z) ? 2048 : 1024);
        if (ux2Var2.N(i3 & 1, (i3 & 1171) != 1170)) {
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, cs4.b);
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
            int i4 = i3 & 896;
            boolean zH = (i4 == 256) | ux2Var2.h(r81Var) | ux2Var2.h(h71Var);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (zH || objK == awVar) {
                objK = new u81(function0, r81Var, h71Var, b2);
                ux2Var2.g0(objK);
            }
            d(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_connect, com.teamviewer.teamviewer.market.mobile.R.string.option_connect, "TVTA-devicesScreen-contactList-connectAction", (Function0) objK, ux2Var2, 384);
            boolean zH2 = (i4 == 256) | ux2Var2.h(r81Var) | ux2Var2.h(h71Var);
            Object objK2 = ux2Var2.K();
            if (zH2 || objK2 == awVar) {
                objK2 = new u81(function0, r81Var, h71Var, (byte) 3);
                ux2Var2.g0(objK2);
            }
            d(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_filetransfer, com.teamviewer.teamviewer.market.mobile.R.string.option_file_transfer, "TVTA-devicesScreen-contactList-transferFileAction", (Function0) objK2, ux2Var2, 384);
            if (z) {
                ux2Var2.W(1108175049);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(1107711847);
                boolean zH3 = (i4 == 256) | ux2Var2.h(r81Var) | ux2Var2.h(h71Var);
                Object objK3 = ux2Var2.K();
                if (zH3 || objK3 == awVar) {
                    objK3 = new u81(function0, r81Var, h71Var, b3);
                    ux2Var2.g0(objK3);
                }
                d(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_show, com.teamviewer.teamviewer.market.mobile.R.string.contact_action_show_details, "TVTA-devicesScreen-contactList-showDetailsAction", (Function0) objK3, ux2Var2, 384);
                ux2Var2.p(false);
            }
            boolean zH4 = (i4 == 256) | ux2Var2.h(r81Var) | ux2Var2.h(h71Var);
            Object objK4 = ux2Var2.K();
            if (zH4 || objK4 == awVar) {
                objK4 = new u81(function0, r81Var, h71Var, (byte) 5);
                ux2Var2.g0(objK4);
            }
            d(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_send_message, com.teamviewer.teamviewer.market.mobile.R.string.option_send_message, "TVTA-devicesScreen-contactList-sendMessageAction", (Function0) objK4, ux2Var2, 384);
            boolean zH5 = (i4 == 256) | ux2Var2.h(r81Var) | ux2Var2.h(h71Var);
            Object objK5 = ux2Var2.K();
            if (zH5 || objK5 == awVar) {
                objK5 = new u81(function0, r81Var, h71Var, (byte) 6);
                ux2Var2.g0(objK5);
            }
            d(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_edit, com.teamviewer.teamviewer.market.mobile.R.string.contact_action_edit_contact, "TVTA-devicesScreen-contactList-editContactAction", (Function0) objK5, ux2Var2, 384);
            ux2Var2 = ux2Var;
            lv1.k(null, 0.0f, 0L, ux2Var2, 0, 7);
            boolean zH6 = ux2Var2.h(r81Var) | (i4 == 256) | ux2Var2.h(h71Var);
            Object objK6 = ux2Var2.K();
            if (zH6 || objK6 == awVar) {
                objK6 = new u81(function0, r81Var, h71Var, (byte) 7);
                ux2Var2.g0(objK6);
            }
            d(com.teamviewer.teamviewer.market.mobile.R.drawable.ic_close, com.teamviewer.teamviewer.market.mobile.R.string.contact_action_remove_contact, "TVTA-devicesScreen-contactList-removeContactAction", (Function0) objK6, ux2Var2, 384);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new v81(h71Var, r81Var, function0, z, i2, (byte) 1);
        }
    }

    public static final void h(fs4 fs4Var, zw5 zw5Var, yy0 yy0Var, ux2 ux2Var, int i2) {
        int i3;
        yy0 yy0Var2 = au8.b;
        ux2Var.Y(-714464401);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.f(fs4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.f(zw5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.h(yy0Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                Object bg5Var = new bg5(null, xz2.P);
                ux2Var.g0(bg5Var);
                objK = bg5Var;
            }
            n40 n40VarJ = j(yy0Var2, ux2Var, (i3 >> 6) & 14);
            j51.l(zw5Var.a(n40VarJ), au8.O(274270255, new z8(fs4Var, (px4) objK, yy0Var, n40VarJ), ux2Var), ux2Var, 56);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) fs4Var, (Object) zw5Var, (Object) yy0Var, i2, (byte) 3);
        }
    }

    public static final boolean i(o97 o97Var, int i2, c2 c2Var, boolean z) {
        boolean z2;
        synchronized (w) {
            try {
                int i3 = o97Var.d;
                if (i3 == i2) {
                    o97Var.c = c2Var;
                    z2 = true;
                    if (z) {
                        o97Var.e++;
                    }
                    o97Var.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final n40 j(yy0 yy0Var, ux2 ux2Var, int i2) {
        boolean z = (((i2 & 14) ^ 6) > 4 && ux2Var.f(yy0Var)) || (i2 & 6) == 4;
        Object objK = ux2Var.K();
        Object obj = e01.a;
        if (z || objK == obj) {
            objK = new n40(yy0Var);
            ux2Var.g0(objK);
        }
        n40 n40Var = (n40) objK;
        boolean zF = ux2Var.f(n40Var);
        Object objK2 = ux2Var.K();
        if (zF || objK2 == obj) {
            objK2 = new q0(n40Var, (byte) 14);
            ux2Var.g0(objK2);
        }
        ck3.e(n40Var, (Function1) objK2, ux2Var);
        return n40Var;
    }

    public static final float k(ei1 ei1Var, float f2, float f3) {
        in2 in2Var = ei1Var.a;
        mo moVar = new mo(0.0f);
        int iB = moVar.b();
        int i2 = 0;
        while (i2 < iB) {
            moVar.e(i2, in2Var.s(i2 == 0 ? f2 : 0.0f, i2 == 0 ? f3 : 0.0f));
            i2++;
        }
        return moVar.a;
    }

    public static void l(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hz5.H, i2, i3);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(com.teamviewer.teamviewer.market.mobile.R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                o(context, y, "Theme.MaterialComponents");
            }
        }
        o(context, x, "Theme.AppCompat");
    }

    public static final void m(long j2, gb5 gb5Var) {
        if (gb5Var == gb5.m) {
            if (r61.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            ni3.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (r61.i(j2) != Integer.MAX_VALUE) {
                return;
            }
            ni3.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static void n(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hz5.H, i2, i3);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            int length = iArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i4], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i4++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        hk0.g("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static void o(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
                typedArrayObtainStyledAttributes.recycle();
                hk0.g(fx3.g("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static r82 p(td2 td2Var, i32 i32Var) {
        Stream streamI;
        if (td2Var.f()) {
            td2Var.e();
            streamI = ds1.i0(i32Var, o82.class).filter(new jd2(td2Var, i32Var, (byte) 1));
        } else {
            streamI = I(td2Var, i32Var);
        }
        r82 r82Var = (r82) streamI.collect(Collectors.toCollection(new sn0((byte) 2)));
        td2Var.e();
        return r82Var;
    }

    public static final Object q(v01 v01Var, zw5 zw5Var) {
        if (!v01Var.f0().z) {
            ki3.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        yj5 yj5Var = (yj5) vn4.p0(v01Var).O;
        yj5Var.getClass();
        return di1.z(yj5Var, zw5Var);
    }

    public static final int r(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final Object s(tn6 tn6Var, long j2, hw2 hw2Var) {
        Unsafe unsafe;
        long j3;
        while (true) {
            tn6 tn6Var2 = tn6Var;
            while (true) {
                if (tn6Var2.p >= j2 && !tn6Var2.d()) {
                    return tn6Var2;
                }
                Object objectVolatile = defpackage.a.a.getObjectVolatile(tn6Var2, l11.m);
                hr2 hr2Var = m;
                if (objectVolatile == hr2Var) {
                    return hr2Var;
                }
                tn6Var = (tn6) ((l11) objectVolatile);
                if (tn6Var != null) {
                    break;
                }
                tn6 tn6Var3 = (tn6) hw2Var.invoke(Long.valueOf(tn6Var2.p + 1), tn6Var2);
                do {
                    unsafe = defpackage.a.a;
                    j3 = l11.m;
                    if (unsafe.compareAndSwapObject(tn6Var2, j3, (Object) null, tn6Var3)) {
                        if (tn6Var2.d()) {
                            tn6Var2.e();
                        }
                        tn6Var2 = tn6Var3;
                        break;
                    }
                } while (unsafe.getObjectVolatile(tn6Var2, j3) == null);
            }
        }
    }

    public static final fs4 t(fs4 fs4Var) {
        return fs4Var.f(yp2.b);
    }

    public static final fs4 u(fs4 fs4Var, boolean z, mw4 mw4Var) {
        return fs4Var.f(z ? new er2(mw4Var) : cs4.b);
    }

    public static be1 v(be1 be1Var, ce1 ce1Var) {
        ce1Var.getClass();
        if (im3.n(be1Var.getKey(), ce1Var)) {
            return be1Var;
        }
        return null;
    }

    public static File w(Context context) {
        context.getClass();
        File filesDir = context.getFilesDir();
        filesDir.getClass();
        return new File(filesDir, "TVLog.html");
    }

    public static final o97 x(j57 j57Var) {
        o97 o97Var = j57Var.m;
        o97Var.getClass();
        return (o97) v47.s(o97Var, j57Var);
    }

    public static final int y(j57 j57Var) {
        o97 o97Var = j57Var.m;
        o97Var.getClass();
        return ((o97) v47.f(o97Var)).e;
    }

    public static final boolean z(ap6 ap6Var) {
        np6 np6Var = kp6.s;
        jx4 jx4Var = ap6Var.m;
        Object objG = jx4Var.g(np6Var);
        if (objG == null) {
            objG = null;
        }
        if (im3.n(objG, yl7.t)) {
            return false;
        }
        return jx4Var.b(zo6.g) || jx4Var.b(zo6.h);
    }
}
