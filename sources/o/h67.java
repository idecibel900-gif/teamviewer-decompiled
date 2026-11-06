package o;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class h67 {
    public static final void a(j67 j67Var, f67 f67Var, fs4 fs4Var, ux2 ux2Var, int i) {
        f67 f67Var2;
        fs4 fs4Var2;
        Object l8Var;
        Context context;
        px4 px4Var;
        tt5 tt5Var;
        j67 j67Var2 = j67Var;
        ux2 ux2Var2 = ux2Var;
        j67Var2.getClass();
        ux2Var2.Y(1139178397);
        int i2 = i | (ux2Var2.f(j67Var2) ? 4 : 2) | (ux2Var2.h(f67Var) ? 32 : 16) | 384;
        if (ux2Var2.N(i2 & 1, (i2 & 147) != 146)) {
            Context context2 = (Context) ux2Var2.j(lh.b);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ux2Var2.j(dd4.a);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = h57.p(ea2.m);
                ux2Var2.g0(objK);
            }
            px4 px4Var2 = (px4) objK;
            boolean zH = ((i2 & 14) == 4) | ux2Var2.h(context2) | ux2Var2.h(f67Var) | ux2Var2.h(lifecycleOwner);
            Object objK2 = ux2Var2.K();
            if (zH || objK2 == awVar) {
                context = context2;
                l8Var = new l8(lifecycleOwner, j67Var, context, f67Var, px4Var2, (byte) 8);
                px4Var = px4Var2;
                lifecycleOwner = lifecycleOwner;
                j67Var2 = j67Var;
                ux2Var2.g0(l8Var);
            } else {
                l8Var = objK2;
                context = context2;
                px4Var = px4Var2;
            }
            ck3.d(lifecycleOwner, j67Var2, (Function1) l8Var, ux2Var2);
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            hk6 hk6VarW = im3.W(ux2Var2);
            Object objK3 = ux2Var2.K();
            if (objK3 == awVar) {
                objK3 = ck3.w(ux2Var2);
                ux2Var2.g0(objK3);
            }
            fs4 fs4VarF = ka0.F(o77.t(fillElement, hk6VarW, (me1) objK3), 24.0f, 12.0f, 24.0f, 0.0f, 8);
            bw bwVar = iq8.c;
            w50 w50Var = xz2.A;
            kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarF);
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
            String strZ = m77.z(R.string.solutions_page_description, ux2Var2);
            h72 h72Var = un4.a;
            Context context3 = context;
            aw awVar2 = awVar;
            qs7.b(strZ, null, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.j, ux2Var, 0, 0, 131066);
            ux2Var2 = ux2Var;
            cs4 cs4Var = cs4.b;
            float f = 24.0f;
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var, 24.0f));
            kw0 kw0VarA2 = iw0.a(bwVar, w50Var, ux2Var2, 0);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, cs4Var);
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
            ux2Var2.W(-1728470057);
            for (x57 x57Var : (List) px4Var.getValue()) {
                cs4 cs4Var2 = cs4Var;
                float f2 = f;
                fs4 fs4VarF2 = ka0.F(cs4Var2, 0.0f, 0.0f, 0.0f, f2, 7);
                yy0 yy0Var = x57Var.a;
                String str = x57Var.b;
                vt5 vt5Var = new vt5(str);
                ut5 ut5Var = new ut5(x57Var.c);
                if (x57Var.d == z57.m) {
                    ux2Var2.W(-1994933756);
                    tt5Var = new tt5(Integer.valueOf(R.drawable.ic_download_app), m77.z(R.string.download, ux2Var2) + " " + str, null);
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(-1994572916);
                    tt5Var = new tt5(Integer.valueOf(R.drawable.ic_open_app), m77.z(R.string.open, ux2Var2) + " " + str, null);
                    ux2Var2.p(false);
                }
                Context context4 = context3;
                boolean zH2 = ux2Var2.h(context4) | ux2Var2.h(x57Var) | ux2Var2.h(f67Var);
                Object objK4 = ux2Var2.K();
                aw awVar3 = awVar2;
                if (zH2 || objK4 == awVar3) {
                    objK4 = new b67(context4, x57Var, f67Var, (byte) 1);
                    ux2Var2.g0(objK4);
                }
                ct1.j(yy0Var, vt5Var, ut5Var, tt5Var, fs4VarF2, (Function0) objK4, null, ux2Var2, 24576, 64);
                context3 = context4;
                awVar2 = awVar3;
                cs4Var = cs4Var2;
                f = f2;
            }
            f67Var2 = f67Var;
            ux2Var2.p(false);
            ux2Var2.p(true);
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            f67Var2 = f67Var;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new f9((Object) j67Var, (Object) f67Var2, (Object) fs4Var2, i, (byte) 25);
        }
    }

    public static final void b(int i, List list, Function0 function0, Function1 function1, Function1 function2, ux2 ux2Var, fs4 fs4Var, boolean z) {
        int i2;
        int i3;
        ux2 ux2Var2 = ux2Var;
        list.getClass();
        ux2Var2.Y(-833795021);
        int i4 = i | (ux2Var2.f(list) ? 4 : 2) | (ux2Var2.g(z) ? 32 : 16) | (ux2Var2.h(function1) ? 2048 : 1024) | (ux2Var2.h(function2) ? 16384 : 8192) | (ux2Var2.h(function0) ? 131072 : 65536);
        if (ux2Var2.N(i4 & 1, (74899 & i4) != 74898)) {
            i97 i97VarA = vm.a(z ? 0.0f : 90.0f, db8.I0(300, 6, null), "", ux2Var, 3120, 20);
            boolean z2 = (i4 & 14) == 4;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (z2 || objK == awVar) {
                byte b = 5;
                objK = lv0.J0(list, new ix0(new dj6(b), b));
                ux2Var.g0(objK);
            }
            List list2 = (List) objK;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
            h72 h72Var = un4.a;
            fs4 fs4VarI = uf0.i(fs4VarC, 1.0f, ((rn4) ux2Var.j(h72Var)).a.B, sf6.a(12.0f));
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarI);
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
            o67.n(kw0VarA, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarJ = iq8.j(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), sf6.a(12.0f));
            int i5 = i4 & 112;
            boolean z4 = (i5 == 32) | ((i4 & 458752) == 131072);
            Object objK2 = ux2Var.K();
            if (z4 || objK2 == awVar) {
                objK2 = new dc1((byte) 6, function0, z);
                ux2Var.g0(objK2);
            }
            fs4 fs4VarD = ka0.D(androidx.compose.foundation.b.b(fs4VarJ, false, null, null, (Function0) objK2, 15), 0.0f, 10.0f, 1);
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
            td3.b(lv1.T(R.drawable.ic_arrow_right, ux2Var, 0), m77.z(R.string.sessions, ux2Var), ka0.D(androidx.compose.foundation.layout.b.m(ka0.F(cs4Var, 16.0f, 0.0f, 16.0f, 0.0f, 10), 40.0f, 24.0f), 8.0f, 0.0f, 2), ((rn4) ux2Var.j(h72Var)).a.s, ux2Var, 8, 0);
            qs7.b(m77.z(R.string.your_sessions, ux2Var), ka0.F(new s14(1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11), ((rn4) ux2Var.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, ((rn4) ux2Var.j(h72Var)).b.j, ux2Var, 0, 24960, 110584);
            ud5 ud5VarT = lv1.T(R.drawable.ic_expand, ux2Var, 0);
            if (z) {
                i2 = -344149358;
                i3 = R.string.expand_content_description;
            } else {
                i2 = -344045136;
                i3 = R.string.collapse_content_description;
            }
            td3.b(ud5VarT, to7.m(ux2Var, i2, i3, ux2Var, false), io1.e0(androidx.compose.foundation.layout.b.l(ka0.E(cs4Var, 8.0f, 8.0f, 24.0f, 8.0f), 16.0f), ((Number) i97VarA.getValue()).floatValue()), ((rn4) ux2Var.j(h72Var)).a.s, ux2Var, 8, 0);
            ux2Var.p(true);
            vn4.H(z, null, null, null, null, au8.O(-568227327, new e56(list2, function1, function2, (byte) 1), ux2Var), ux2Var, 1572870 | i5, 30);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new f56(list, z, fs4Var, function1, function2, function0, i);
        }
    }

    public static final void c(final int i, Function1 function1, fs4 fs4Var, int i2, String str, ux2 ux2Var, int i3) {
        fs4 fs4Var2;
        int i4;
        function1.getClass();
        ux2Var.Y(-884852666);
        int i5 = 32;
        int i6 = i3 | (ux2Var.d(i) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | 3072;
        if (ux2Var.N(i6 & 1, (i6 & 9363) != 9362)) {
            dg6 dg6VarA = cg6.a(iq8.a, xz2.x, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4Var2 = fs4Var;
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var2);
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
            ux2Var.W(906286526);
            final int i7 = 1;
            while (true) {
                boolean zD = ((i6 & 112) == i5) | ux2Var.d(i7);
                Object objK = ux2Var.K();
                if (zD || objK == e01.a) {
                    objK = new ka(function1, i7, (byte) 1);
                    ux2Var.g0(objK);
                }
                int i8 = i7;
                xo1.k((Function0) objK, androidx.compose.ui.platform.a.a(cs4.b, str.concat("-TVRatingBar")), false, null, null, au8.O(-1848666526, new hw2() { // from class: o.gl7
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ux2 ux2Var2 = (ux2) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                            int i9 = i7;
                            qs1.l(re3.a(i9 <= i ? (f62) b62.n.getValue() : (f62) b62.m.getValue(), ux2Var2), String.valueOf(i9), null, null, null, 0.0f, null, ux2Var2, 8, 124);
                        } else {
                            ux2Var2.Q();
                        }
                        return f88.a;
                    }
                }, ux2Var), ux2Var, 1572864, 60);
                if (i8 == 5) {
                    break;
                }
                i7 = i8 + 1;
                i5 = 32;
            }
            ux2Var.p(false);
            ux2Var.p(true);
            i4 = 5;
        } else {
            fs4Var2 = fs4Var;
            ux2Var.Q();
            i4 = i2;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new am(i, function1, fs4Var2, i4, str, i3);
        }
    }

    public static final void d(int i, String str, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        String str2;
        function0.getClass();
        ux2Var.Y(1315908178);
        int i2 = (ux2Var.h(function0) ? 4 : 2) | i | (ux2Var.f(fs4Var) ? 32 : 16) | 384;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            str2 = "TVTA-settings-twoFactorAuthentication";
            x37.e(new sk7(y57.g(R.string.settings_twoFactorAuthentication), y57.g(R.string.settings_twoFactorAuthentication_subtitle), new yk7(R.drawable.authentication), null, 24), fs4Var, null, function0, "TVTA-settings-twoFactorAuthentication", ux2Var, ((i2 << 9) & 7168) | (i2 & 112) | 24576, 36);
        } else {
            ux2Var.Q();
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gd1(function0, fs4Var, str2, i, (byte) 8);
        }
    }

    public static final void e(long j) {
        rt7[] rt7VarArr = qt7.b;
        if ((j & 1095216660480L) == 0) {
            mi3.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static InvocationHandler g() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                gk0.r(e);
                return null;
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static final long h(double d) {
        return n((float) d, 8589934592L);
    }

    public static final if8 i(View view) {
        if8 if8Var;
        Object tag = view.getTag(R.id.coil3_request_manager);
        if8 if8Var2 = tag instanceof if8 ? (if8) tag : null;
        if (if8Var2 != null) {
            return if8Var2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil3_request_manager);
                if8Var = tag2 instanceof if8 ? (if8) tag2 : null;
                if (if8Var == null) {
                    if8Var = new if8(view);
                    view.addOnAttachStateChangeListener(if8Var);
                    view.setTag(R.id.coil3_request_manager, if8Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return if8Var;
    }

    public static final long j(double d) {
        return n((float) d, 4294967296L);
    }

    public static final long k(int i) {
        return n(i, 4294967296L);
    }

    public static final boolean l(xo xoVar) {
        int length = xoVar.n.length();
        List list = xoVar.m;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                wo woVar = (wo) list.get(i);
                if ((woVar.a instanceof ga4) && yo.b(0, length, woVar.b, woVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int m(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final long n(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        rt7[] rt7VarArr = qt7.b;
        return jFloatToRawIntBits;
    }

    public static ae o(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zN = bc7.N(false, str, "HTTP/1.");
        yw5 yw5Var = yw5.HTTP_1_0;
        yw5 yw5Var2 = yw5.HTTP_1_1;
        if (zN) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                yw5Var = yw5Var2;
            }
        } else if (bc7.N(false, str, "ICY ")) {
            i = 4;
        } else {
            if (!bc7.N(false, str, "SOURCETABLE ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            yw5Var = yw5Var2;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numO = bc7.O(str.substring(i, i2));
        if (numO == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numO.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new ae(yw5Var, iIntValue, strSubstring);
    }

    public static final Object p(mj6 mj6Var, boolean z, Object obj, hw2 hw2Var) {
        Object xx0Var;
        Object objO;
        try {
            if (hw2Var instanceof i30) {
                e8.i(2, hw2Var);
                xx0Var = hw2Var.invoke(obj, mj6Var);
            } else {
                xx0Var = vt1.O(hw2Var, obj, mj6Var);
            }
        } catch (z12 e) {
            Throwable th = e.m;
            mj6Var.N(new xx0(th, false));
            throw th;
        } catch (Throwable th2) {
            xx0Var = new xx0(th2, false);
        }
        ne1 ne1Var = ne1.m;
        if (xx0Var == ne1Var || (objO = mj6Var.O(xx0Var)) == ka0.n) {
            return ne1Var;
        }
        mj6Var.f0();
        if (!(objO instanceof xx0)) {
            return ka0.I(objO);
        }
        if (!z) {
            Throwable th3 = ((xx0) objO).a;
            if ((th3 instanceof pv7) && ((pv7) th3).m == mj6Var) {
                if (xx0Var instanceof xx0) {
                    throw ((xx0) xx0Var).a;
                }
                return xx0Var;
            }
        }
        throw ((xx0) objO).a;
    }

    public static boolean q(byte b) {
        return b > -65;
    }

    public abstract void f(IOException iOException);
}
