package o;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.work.impl.WorkDatabase;
import com.teamviewer.remotecontrolviewmodellib.swig.IChangeResolutionViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.Resolution;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class hm3 {
    public static final q87 A;
    public static final q87 B;
    public static final q87 C;
    public static final q87 D;
    public static final q87 E;
    public static final q87 F;
    public static final q87 G;
    public static final q87 H;
    public static final Object I;
    public static Constructor J;
    public static final yy0 c;
    public static final yy0 d;
    public static final yy0 g;
    public static final yy0 h;
    public static final yy0 i;
    public static final yy0 j;
    public static final yy0 k;
    public static final yy0 l;
    public static final yy0 m;
    public static final yy0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f987o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[][] s;
    public static final String[] t;
    public static final cf3 u;
    public static final hr2 v;
    public static final StackTraceElement[] w;
    public static final aw0 x;
    public static final lw y;
    public static final q87 z;
    public static final zk3 a = new zk3(0, 0, -1, -1);
    public static final Object[] b = new Object[0];
    public static final yy0 e = new yy0(-1924043624, false, new zy0(20));
    public static final yy0 f = new yy0(1696856887, false, new zy0(21));

    static {
        byte b2 = 1;
        c = new yy0(1031435457, false, new az0(b2));
        byte b3 = 2;
        d = new yy0(-316698113, false, new az0(b3));
        new yy0(2128208900, false, new zy0((byte) 22));
        g = new yy0(1969745146, false, new az0((byte) 15));
        h = new yy0(904665491, false, new bz0((byte) 24));
        i = new yy0(1413444305, false, new bz0((byte) 25));
        j = new yy0(1667833712, false, new bz0((byte) 26));
        k = new yy0(-1104501325, false, new gz0(b3));
        l = new yy0(1367118184, false, new gz0((byte) 17));
        byte b4 = 5;
        m = new yy0(-2072897039, false, new iz0(b4));
        byte b5 = 6;
        n = new yy0(398882994, false, new iz0(b5));
        f987o = new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38};
        p = new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52};
        q = new byte[]{39, 40, 41, 42, 31, 32};
        r = new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2};
        s = new byte[][]{new byte[]{39, 40, 41, 42, 31, 32}, new byte[]{33, 34, 35, 36, 25, 26}, new byte[]{27, 28, 29, 30, 19, 20}, new byte[]{21, 22, 23, 24, 13, 14}, new byte[]{15, 16, 17, 18, 7, 8}, new byte[]{9, 10, 11, 12, 1, 2}};
        t = new String[]{"\rABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001e\ufffbÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8"};
        u = new cf3(false);
        v = new hr2("NO_OWNER", (byte) 14);
        w = new StackTraceElement[0];
        x = aw0.A;
        y = new lw(b5);
        z = new q87(b2);
        A = new q87(b3);
        B = new q87((byte) 3);
        C = new q87((byte) 4);
        D = new q87(b4);
        E = new q87(b5);
        F = new q87((byte) 7);
        G = new q87((byte) 8);
        H = new q87((byte) 0);
        I = new Object();
    }

    public static void A(Activity activity, String[] strArr, int i2) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (TextUtils.isEmpty(strArr[i3])) {
                hk0.g(e41.l(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < strArr.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr2[i4] = strArr[i5];
                    i4++;
                }
            }
        }
        activity.requestPermissions(strArr, i2);
    }

    public static Object B(hw2 hw2Var) {
        return vn4.u0(ba2.m, hw2Var);
    }

    public static boolean C(Activity activity, String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i2 < 32 && i2 == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static final Object[] D(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = b;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] E(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final void F(String str, long j2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j2);
        }
    }

    public static final void a(final int i2, final int i3, final int i4, fs4 fs4Var, ux2 ux2Var, final int i5) {
        final fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(1846981733);
        int i6 = i5 | (ux2Var2.d(i2) ? 4 : 2) | (ux2Var2.d(i3) ? 32 : 16) | (ux2Var2.d(i4) ? 256 : 128) | 3072;
        if (ux2Var2.N(i6 & 1, (i6 & 1171) != 1170)) {
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            Context context = (Context) ux2Var2.j(lh.b);
            Resources resources = (Resources) ux2Var2.j(lh.c);
            Resources.Theme theme = context.getTheme();
            ThreadLocal threadLocal = ic6.a;
            fs4 fs4VarS = au8.s(fillElement, j51.i(resources.getColor(i2, theme)), kh.V);
            kw0 kw0VarA = iw0.a(iq8.e, xz2.B, ux2Var2, 54);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarS);
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
            o67.n(fs4VarS2, d82.t, ux2Var2);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = h57.p(Boolean.FALSE);
                ux2Var2.g0(objK);
            }
            px4 px4Var = (px4) objK;
            vn4.H(((Boolean) px4Var.getValue()).booleanValue(), null, wb2.e(null, 3).a(wb2.g(null, 0.0f, 7)), null, null, au8.O(1424254551, new iw2() { // from class: o.p11
                @Override // o.iw2
                public final Object d(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
                    ux2 ux2Var3 = (ux2) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((bo) obj).getClass();
                    if (ux2Var3.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        we3 we3VarP = b77.p(i3, ux2Var3);
                        qs1.l(x67.t(we3VarP, ux2Var3), m77.z(i4, ux2Var3), androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.p(cs4.b, 88.0f), 88.0f), xz2.s, rb1.b, 1.0f, new t70(5, rv0.d), ux2Var3, 1573256, 0);
                    } else {
                        ux2Var3.Q();
                    }
                    return f88.a;
                }
            }, ux2Var2), ux2Var2, 1575942, 26);
            cs4 cs4Var = cs4.b;
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 16.0f));
            qs7.b(m77.z(i4, ux2Var2), null, rv0.d, h67.k(24), null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 24960, 0, 262122);
            ux2Var2 = ux2Var;
            Object objK2 = ux2Var2.K();
            if (objK2 == awVar) {
                objK2 = new r11(px4Var, null, (byte) 0);
                ux2Var2.g0(objK2);
            }
            ck3.i(f88.a, (hw2) objK2, ux2Var2);
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(i2, i3, i4, fs4Var2, i5) { // from class: o.q11
                public final /* synthetic */ int m;
                public final /* synthetic */ int n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ int f1794o;
                public final /* synthetic */ fs4 p;

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(1);
                    hm3.a(this.m, this.n, this.f1794o, this.p, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void b(l71 l71Var, fs4 fs4Var, boolean z2, Function1 function1, Function0 function0, xy6 xy6Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        xy6 xy6Var2;
        xy6 xy6VarR;
        int i3;
        fs4 fs4Var3;
        l71Var.getClass();
        ux2Var.Y(-105098748);
        int i4 = i2 | (ux2Var.d(l71Var.ordinal()) ? 4 : 2) | 48 | (ux2Var.g(z2) ? 256 : 128) | (ux2Var.h(function1) ? 2048 : 1024) | (ux2Var.h(function0) ? 16384 : 8192) | 65536;
        if (ux2Var.N(i4 & 1, (74899 & i4) != 74898)) {
            ux2Var.S();
            byte b2 = 6;
            if ((i2 & 1) == 0 || ux2Var.x()) {
                xy6VarR = yo1.R(null, ux2Var, 6, 2);
                i3 = i4 & (-458753);
                fs4Var3 = cs4.b;
            } else {
                ux2Var.Q();
                xy6VarR = xy6Var;
                i3 = i4 & (-458753);
                fs4Var3 = fs4Var;
            }
            ux2Var.q();
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new h31(b2);
                ux2Var.g0(objK);
            }
            yo1.k(function0, cp6.a(fs4Var3, false, (Function1) objK), xy6VarR, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-1261967134, new d91(l71Var, function1, z2), ux2Var), ux2Var, (i3 >> 12) & 14, 3072, 8184);
            fs4Var2 = fs4Var3;
            xy6Var2 = xy6VarR;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6Var2 = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a5(l71Var, fs4Var2, z2, function1, function0, xy6Var2, i2);
        }
    }

    public static final fc1 c(de1 de1Var) {
        if (de1Var.l0(z06.z) == null) {
            de1Var = de1Var.H0(ds1.r());
        }
        return new fc1(de1Var);
    }

    public static final void d(List list, l71 l71Var, fs4 fs4Var, Function1 function1, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        iz0 iz0Var = d82.t;
        iz0 iz0Var2 = d82.w;
        iz0 iz0Var3 = d82.u;
        iz0 iz0Var4 = d82.v;
        ux2Var2.Y(-359383408);
        int i3 = i2 | (ux2Var2.f(list) ? 4 : 2) | (ux2Var2.d(l71Var.ordinal()) ? 32 : 16) | 384 | (ux2Var2.h(function1) ? 2048 : 1024);
        if (ux2Var2.N(i3 & 1, (i3 & 1171) != 1170)) {
            h72 h72Var = un4.a;
            long j2 = ((rn4) ux2Var2.j(h72Var)).a.a;
            long j3 = ((rn4) ux2Var2.j(h72Var)).a.a;
            long j4 = rv0.h;
            boolean z2 = false;
            k06 k06VarZ = xs1.z(j2, j3, j4, j4, ux2Var);
            ux2Var2 = ux2Var;
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var2, cs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z3 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z3) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, iz0Var4, ux2Var2);
            o67.n(yj5VarL, iz0Var3, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), iz0Var2, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, iz0Var, ux2Var2);
            ux2Var2.W(1873227498);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k71 k71Var = (k71) it.next();
                fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                boolean z4 = k71Var.c == l71Var ? true : z2;
                pe6 pe6Var = new pe6(3);
                boolean zF = ((i3 & 7168) == 2048 ? true : z2) | ux2Var2.f(k71Var);
                Object objK = ux2Var2.K();
                if (zF || objK == e01.a) {
                    objK = new x8(function1, k71Var, (byte) 25);
                    ux2Var2.g0(objK);
                }
                fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.C(g68.A(fs4VarC, z4, pe6Var, (Function0) objK), 24.0f, 16.0f), k71Var.e);
                dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
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
                o67.n(dg6VarA, iz0Var4, ux2Var2);
                o67.n(yj5VarL2, iz0Var3, ux2Var2);
                o67.n(Integer.valueOf(iHashCode2), iz0Var2, ux2Var2);
                o67.l(ux2Var2);
                o67.n(fs4VarS2, iz0Var, ux2Var2);
                cs4 cs4Var2 = cs4Var;
                fs4 fs4VarL = androidx.compose.foundation.layout.b.l(ka0.F(cs4Var2, 0.0f, 0.0f, 16.0f, 0.0f, 11), 24.0f);
                ud5 ud5VarT = lv1.T(k71Var.b, ux2Var2, 0);
                String strZ = m77.z(R.string.filter_contacts_content_description, ux2Var2);
                h72 h72Var2 = un4.a;
                iz0 iz0Var5 = iz0Var;
                tg3 tg3Var2 = tg3Var;
                td3.b(ud5VarT, strZ, fs4VarL, ((rn4) ux2Var2.j(h72Var2)).a.s, ux2Var2, 392, 0);
                iz0 iz0Var6 = iz0Var4;
                iz0 iz0Var7 = iz0Var2;
                qs7.b(k71Var.a, new s14(1.0f, true), ((rn4) ux2Var2.j(h72Var2)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var2)).b.j, ux2Var, 0, 0, 131064);
                bt1.j(k71Var.c == l71Var, null, false, k06VarZ, ux2Var, 48, 44);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                iz0Var4 = iz0Var6;
                iz0Var = iz0Var5;
                tg3Var = tg3Var2;
                cs4Var = cs4Var2;
                iz0Var2 = iz0Var7;
                z2 = false;
            }
            ux2Var2.p(z2);
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) list, (Object) l71Var, fs4Var2, (Object) function1, i2, (byte) 5);
        }
    }

    public static final fc1 e() {
        se7 se7VarA = g57.a();
        tk1 tk1Var = g22.a;
        return new fc1(xk0.G(se7VarA, ok4.a));
    }

    public static final void f(me1 me1Var, CancellationException cancellationException) {
        bp3 bp3Var = (bp3) me1Var.getCoroutineContext().l0(z06.z);
        if (bp3Var != null) {
            bp3Var.j(cancellationException);
        } else {
            hk0.f(me1Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final void g(nm8 nm8Var, String str) {
        nn8 nn8VarB;
        WorkDatabase workDatabase = nm8Var.c;
        workDatabase.getClass();
        an8 an8VarW = workDatabase.w();
        rn1 rn1VarR = workDatabase.r();
        ArrayList arrayListN = qf0.N(str);
        arrayListN.addAll(iq8.q(rn1VarR, str));
        ArrayList<String> arrayList = new ArrayList();
        Iterator it = arrayListN.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            lm8 lm8VarA = an8VarW.a((String) next);
            if (lm8VarA != null ? !lm8VarA.a() : false) {
                arrayList.add(next);
            }
        }
        an8 an8VarW2 = nm8Var.c.w();
        for (String str2 : arrayList) {
            an8VarW2.getClass();
            str2.getClass();
            ((Number) au8.M(an8VarW2.a, false, true, new fy(str2, (byte) 29))).intValue();
        }
        dt5 dt5Var = nm8Var.f;
        dt5Var.getClass();
        synchronized (dt5Var.k) {
            we4.f().c(dt5.l, "Processor cancelling " + str);
            dt5Var.i.add(str);
            nn8VarB = dt5Var.b(str);
        }
        dt5.d(str, nn8VarB, 1);
        Iterator it2 = nm8Var.e.iterator();
        while (it2.hasNext()) {
            ((xi6) it2.next()).d(str);
        }
        nm8Var.b.getClass();
    }

    public static int h(Context context, String str) {
        if (str == null) {
            yq4.l("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new r55(context).a.areNotificationsEnabled() ? 0 : -1;
    }

    public static final Object i(Function0 function0, hc1 hc1Var, ho2 ho2Var, iw2 iw2Var, go2[] go2VarArr) {
        pw0 pw0Var = new pw0(function0, null, ho2Var, iw2Var, go2VarArr);
        jo2 jo2Var = new jo2(hc1Var, hc1Var.getContext());
        Object objP = h67.p(jo2Var, true, jo2Var, pw0Var);
        return objP == ne1.m ? objP : f88.a;
    }

    public static final Object j(hw2 hw2Var, hc1 hc1Var) {
        mj6 mj6Var = new mj6(hc1Var, hc1Var.getContext());
        return h67.p(mj6Var, true, mj6Var, hw2Var);
    }

    public static Resolution k(List list, int i2, int i3, float f2, boolean z2) {
        list.getClass();
        int i4 = (int) (i2 / f2);
        int i5 = (int) (i3 / f2);
        if (!list.isEmpty()) {
            Resolution resolution = (Resolution) list.get(0);
            if ((i4 <= i5 || IChangeResolutionViewModelSWIGJNI.Resolution_width_get(resolution.a, resolution) <= IChangeResolutionViewModelSWIGJNI.Resolution_height_get(resolution.a, resolution)) && (i4 >= i5 || IChangeResolutionViewModelSWIGJNI.Resolution_width_get(resolution.a, resolution) >= IChangeResolutionViewModelSWIGJNI.Resolution_height_get(resolution.a, resolution))) {
                i5 = i4;
                i4 = i5;
            }
        }
        float f3 = i4;
        float f4 = i5;
        float f5 = f3 / f4;
        Iterator it = list.iterator();
        float f6 = Float.MAX_VALUE;
        Resolution resolution2 = null;
        while (it.hasNext()) {
            Resolution resolution3 = (Resolution) it.next();
            float fResolution_width_get = IChangeResolutionViewModelSWIGJNI.Resolution_width_get(resolution3.a, resolution3);
            float fResolution_height_get = IChangeResolutionViewModelSWIGJNI.Resolution_height_get(resolution3.a, resolution3);
            float f7 = (fResolution_width_get / fResolution_height_get) - f5;
            if (!z2 || f7 >= 0.0f) {
                float f8 = (fResolution_width_get / f3) - 1.0f;
                float f9 = (fResolution_height_get / f4) - 1.0f;
                float f10 = (f7 * f7) + (f8 * f8) + (f9 * f9);
                if (f10 <= f6) {
                    resolution2 = resolution3;
                    f6 = f10;
                }
            }
        }
        return resolution2;
    }

    public static View l(View view, int i2) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = AndroidComposeView.a1;
            if (declaredMethod == null) {
                declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
                AndroidComposeView.a1 = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (im3.n(declaredMethod.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View viewL = l(viewGroup.getChildAt(i3), i2);
                    if (viewL != null) {
                        return viewL;
                    }
                }
            }
        }
        return null;
    }

    public static ColorStateList m(Context context, int i2) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        fc6 fc6Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        gc6 gc6Var = new gc6(resources, theme);
        synchronized (ic6.c) {
            try {
                SparseArray sparseArray = (SparseArray) ic6.b.get(gc6Var);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (fc6Var = (fc6) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (fc6Var.b.equals(resources.getConfiguration())) {
                        if (theme != null || fc6Var.c != 0) {
                            if (theme == null || fc6Var.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = fc6Var.a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = ic6.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = fw0.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                io.sentry.android.core.v0.l("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (ic6.c) {
            try {
                WeakHashMap weakHashMap = ic6.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(gc6Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(gc6Var, sparseArray2);
                }
                sparseArray2.append(i2, new fc6(colorStateListA, gc6Var.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static int n(byte[] bArr, byte[] bArr2) {
        int length = 0;
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            int i3 = bArr2[i2] - 1;
            length += (((1 << (5 - (i3 % 6))) & bArr[i3 / 6]) == 0 ? 0 : 1) << ((bArr2.length - i2) - 1);
        }
        return length;
    }

    public static boolean o() {
        try {
            if (AndroidComposeView.U0 == null) {
                AndroidComposeView.U0 = Class.forName("android.os.SystemProperties");
            }
            Method declaredMethod = AndroidComposeView.V0;
            if (declaredMethod == null) {
                Class cls = AndroidComposeView.U0;
                declaredMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                AndroidComposeView.V0 = declaredMethod;
            }
            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return im3.n(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final Object p(zn4 zn4Var) {
        Object objE = zn4Var.E();
        n04 n04Var = objE instanceof n04 ? (n04) objE : null;
        if (n04Var != null) {
            return n04Var.A;
        }
        return null;
    }

    public static String q(byte[] bArr, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        int i4 = i2;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        while (i4 < i2 + i3) {
            char cCharAt = t[i6].charAt(bArr[i4]);
            switch (cCharAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i7 = i6;
                    i6 = cCharAt - 65520;
                    i5 = 1;
                    break;
                case 65525:
                    i5 = 2;
                    i7 = i6;
                    i6 = 0;
                    break;
                case 65526:
                    i5 = 3;
                    i7 = i6;
                    i6 = 0;
                    break;
                case 65527:
                    i5 = -1;
                    i6 = 0;
                    break;
                case 65528:
                    i5 = -1;
                    i6 = 1;
                    break;
                case 65529:
                    i5 = -1;
                    break;
                case 65530:
                default:
                    sb.append(cCharAt);
                    break;
                case 65531:
                    int i8 = (bArr[i4 + 1] << 24) + (bArr[i4 + 2] << 18) + (bArr[i4 + 3] << 12) + (bArr[i4 + 4] << 6);
                    i4 += 5;
                    sb.append(new DecimalFormat("000000000").format(i8 + bArr[i4]));
                    break;
            }
            int i9 = i5 - 1;
            if (i5 == 0) {
                i6 = i7;
            }
            i4++;
            i5 = i9;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static r86 r(sx3 sx3Var, boolean z2, boolean z3, Boolean bool, boolean z4, f71 f71Var, ps3 ps3Var) {
        rs3 rs3Var;
        r86 r86Var;
        pw5 pw5Var;
        su5 su5Var;
        sx3Var.getClass();
        s67 s67Var = (s67) sx3Var.d;
        ps3Var.getClass();
        su5 su5Var2 = su5.INTERFACE;
        if (z2) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + sx3Var + ')').toString());
            }
            if (sx3Var instanceof pw5) {
                pw5 pw5Var2 = (pw5) sx3Var;
                if (pw5Var2.h == su5Var2) {
                    return vs1.s(f71Var, pw5Var2.g.d(sy4.e("DefaultImpls")), ps3Var);
                }
            }
            if (bool.booleanValue() && (sx3Var instanceof qw5)) {
                rs3 rs3Var2 = s67Var instanceof rs3 ? (rs3) s67Var : null;
                fs3 fs3Var = rs3Var2 != null ? rs3Var2.n : null;
                if (fs3Var != null) {
                    String strD = fs3Var.d();
                    strD.getClass();
                    String strReplace = strD.replace('/', '.');
                    strReplace.getClass();
                    ht2 ht2Var = new ht2(strReplace);
                    ht2 ht2VarE = ht2Var.e();
                    sy4 sy4VarF = ht2Var.f();
                    sy4VarF.getClass();
                    ht2 ht2VarJ = ht2.j(sy4VarF);
                    ht2VarJ.d();
                    String strReplace2 = ht2VarJ.b().replace('.', '$');
                    strReplace2.getClass();
                    if (!ht2VarE.d()) {
                        strReplace2 = ht2VarE + '.' + strReplace2;
                    }
                    nx3 nx3VarB = f71Var.b(strReplace2);
                    if (nx3VarB != null) {
                        return (r86) nx3VarB.n;
                    }
                    return null;
                }
            }
        }
        if (z3 && (sx3Var instanceof pw5)) {
            pw5 pw5Var3 = (pw5) sx3Var;
            if (pw5Var3.h == su5.COMPANION_OBJECT && (pw5Var = pw5Var3.f) != null && ((su5Var = pw5Var.h) == su5.CLASS || su5Var == su5.ENUM_CLASS || (z4 && (su5Var == su5Var2 || su5Var == su5.ANNOTATION_CLASS)))) {
                s67 s67Var2 = (s67) pw5Var.d;
                hz3 hz3Var = s67Var2 instanceof hz3 ? (hz3) s67Var2 : null;
                if (hz3Var != null) {
                    return hz3Var.m;
                }
            } else if (sx3Var instanceof qw5) {
                rs3Var = (rs3) s67Var;
                r86Var = rs3Var.f1947o;
                if (r86Var == null) {
                    return vs1.s(f71Var, rs3Var.a(), ps3Var);
                }
                return r86Var;
            }
        } else if ((sx3Var instanceof qw5) && (s67Var instanceof rs3)) {
            rs3Var = (rs3) s67Var;
            r86Var = rs3Var.f1947o;
            if (r86Var == null) {
                return vs1.s(f71Var, rs3Var.a(), ps3Var);
            }
            return r86Var;
        }
        return null;
    }

    public static fs4 s(fs4 fs4Var, mw4 mw4Var) {
        return fs4Var.f(new l63(mw4Var));
    }

    public static Object t(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = J;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            J = declaredConstructor;
        }
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public static final boolean u(me1 me1Var) {
        bp3 bp3Var = (bp3) me1Var.getCoroutineContext().l0(z06.z);
        if (bp3Var != null) {
            return bp3Var.e();
        }
        return true;
    }

    public static final j1 v(Object[] objArr) {
        objArr.getClass();
        return new j1(objArr);
    }

    public static final fs4 w(fs4 fs4Var, String str) {
        return fs4Var.f(new m04(str));
    }

    public static int y(nr3 nr3Var, String str, int i2, int i3) {
        int iNextInt = nr3Var.nextInt();
        if (iNextInt >= i2 && iNextInt <= i3) {
            return iNextInt;
        }
        throw new gq3("Expected " + str + " but was " + iNextInt + " at path " + nr3Var.z());
    }

    public static Intent z(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str) {
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, str, null, 2) : context.registerReceiver(broadcastReceiver, intentFilter, str, null, 0);
    }

    public abstract Object x();
}
