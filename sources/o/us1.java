package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Layout;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import coil3.compose.ImagePainter;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.teamviewer.teamviewer.market.mobile.R;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class us1 {
    public static we3 a;

    public static final int A(int i, Object obj, i44 i44Var) {
        int iG;
        return (obj == null || i44Var.c() == 0 || (i < i44Var.c() && obj.equals(i44Var.d(i))) || (iG = i44Var.d.g(obj)) == -1) ? i : iG;
    }

    public static final n84 B(LifecycleOwner lifecycleOwner) {
        x84 x84VarZ = lifecycleOwner.getR();
        x84VarZ.getClass();
        df6 df6Var = x84VarZ.a;
        while (true) {
            n84 n84Var = (n84) ((AtomicReference) df6Var.n).get();
            if (n84Var != null) {
                return n84Var;
            }
            se7 se7VarA = g57.a();
            tk1 tk1Var = g22.a;
            n84 n84Var2 = new n84(x84VarZ, xk0.G(se7VarA, ok4.a.r));
            AtomicReference atomicReference = (AtomicReference) df6Var.n;
            do {
                hc1 hc1Var = null;
                if (atomicReference.compareAndSet(null, n84Var2)) {
                    tk1 tk1Var2 = g22.a;
                    im3.R(n84Var2, ok4.a.r, null, new i9(n84Var2, hc1Var, (byte) 17), 2);
                    return n84Var2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final boolean C(Enum r0, Enum... enumArr) {
        r0.getClass();
        return cx.B0(r0, enumArr);
    }

    public static boolean D(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i != 130) {
                hk0.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(wg5 wg5Var) {
        return !bc7.G(true, wg5Var.b(), ".class");
    }

    public static String F(String str) {
        return str != null ? str.toLowerCase(Locale.ROOT) : "";
    }

    public static int G(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                hk0.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int H(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        hk0.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static String I(String str) {
        return F(str).trim();
    }

    public static k53 J(Map map) {
        map.getClass();
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String string = ub7.x0(str).toString();
            String string2 = ub7.x0(str2).toString();
            i67.t(string);
            i67.u(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        return new k53(strArr);
    }

    public static k53 K(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            hk0.g("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr3[i2] == null) {
                hk0.g("Headers cannot be null");
                return null;
            }
            strArr3[i2] = ub7.x0(strArr2[i2]).toString();
        }
        int iE = bt1.E(0, strArr3.length - 1, 2);
        if (iE >= 0) {
            while (true) {
                String str = strArr3[i];
                String str2 = strArr3[i + 1];
                i67.t(str);
                i67.u(str2, str);
                if (i == iE) {
                    break;
                }
                i += 2;
            }
        }
        return new k53(strArr3);
    }

    public static final long L(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static fs4 M(fs4 fs4Var, yj yjVar) {
        return fs4Var.f(new en5(yjVar));
    }

    public static final ns1 N(ls1 ls1Var, js1 js1Var, ms1 ms1Var) {
        return new ns1(123L, "Preview device", ls1Var, null, null, ms1Var, null, null, null, null, true, null, null, js1Var, null, 3143512);
    }

    public static final long O(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final void P(int i, String str) {
        throw new SQLException(fx3.e(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static final long Q(long j) {
        return t61.a(r61.k(j), r61.i(j), r61.j(j), r61.h(j));
    }

    public static final int R(long j) {
        if (-2147483648L > j || j > 2147483647L) {
            return 0;
        }
        return (int) j;
    }

    public static final void a(long j, Function0 function0, ux2 ux2Var, int i) {
        ux2Var.Y(1818799797);
        byte b = 4;
        int i2 = (ux2Var.e(j) ? 4 : 2) | i | (ux2Var.c(14.0f) ? 32 : 16) | (ux2Var.h(function0) ? 256 : 128);
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            fs4 fs4VarL = androidx.compose.foundation.layout.b.l(cs4.b, 14.0f);
            boolean z = (i2 & 896) == 256;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (z || objK == awVar) {
                objK = new or(function0, b);
                ux2Var.g0(objK);
            }
            fs4 fs4VarT = di1.t(fs4VarL, (Function1) objK);
            boolean z2 = (i2 & 14) == 4;
            Object objK2 = ux2Var.K();
            if (z2 || objK2 == awVar) {
                objK2 = new wh(j, (byte) 5);
                ux2Var.g0(objK2);
            }
            vn4.K(0, (Function1) objK2, ux2Var, fs4VarT);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new th(j, function0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x0131  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:110:0x013b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0145  */
    /* JADX WARN: Code duplicated, block: B:115:0x0148 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x014e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0168  */
    /* JADX WARN: Code duplicated, block: B:127:0x017e  */
    /* JADX WARN: Code duplicated, block: B:128:0x018e  */
    /* JADX WARN: Code duplicated, block: B:130:0x019e  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:134:0x01da  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:138:0x0207  */
    /* JADX WARN: Code duplicated, block: B:140:0x0242  */
    /* JADX WARN: Code duplicated, block: B:141:0x0244  */
    /* JADX WARN: Code duplicated, block: B:144:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x024d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0272  */
    /* JADX WARN: Code duplicated, block: B:149:0x027d  */
    /* JADX WARN: Code duplicated, block: B:151:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:158:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:160:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:162:0x0320  */
    /* JADX WARN: Code duplicated, block: B:163:0x0322  */
    /* JADX WARN: Code duplicated, block: B:166:0x0329 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x032b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0346  */
    /* JADX WARN: Code duplicated, block: B:172:0x035b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0369  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x010b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0116  */
    /* JADX WARN: Code duplicated, block: B:94:0x011d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x0126  */
    public static final void b(final wt1 wt1Var, final ns1 ns1Var, fs4 fs4Var, Function0 function0, Function0 function1, Function0 function2, ux2 ux2Var, final int i, final int i2) {
        int i3;
        fs4 fs4Var2;
        int i4;
        Function0 function3;
        int i5;
        int i6;
        Function0 function4;
        int i7;
        int i8;
        int i9;
        byte b;
        boolean z;
        final Function0 function5;
        final fs4 fs4Var3;
        final Function0 function6;
        final Function0 function7;
        j56 j56VarR;
        hw2 hw2Var;
        cs4 cs4Var;
        final fs4 fs4Var4;
        aw awVar;
        Function0 function8;
        boolean z2;
        final Function0 function9;
        js1 js1Var;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        final Function0 function10;
        Function0 function11;
        String strM;
        int i10;
        boolean z9;
        Function0 function12;
        boolean z10;
        boolean z11;
        Object objK;
        boolean z12;
        Object objK2;
        boolean z13;
        Object objK3;
        Object objK4;
        Object objK5;
        Object objK6;
        boolean z14 = wt1Var.g;
        ns1Var.getClass();
        ux2Var.Y(1754882232);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i3 = (ux2Var.h(wt1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.h(ns1Var) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                fs4Var2 = fs4Var;
                i3 |= ux2Var.f(fs4Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function3 = function0;
                    if (ux2Var.h(function3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        function4 = function1;
                        if (ux2Var.h(function4)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (ux2Var.h(function2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    b = 1;
                    if ((i3 & 74899) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (ux2Var.N(i3 & 1, z)) {
                        cs4Var = cs4.b;
                        if (i11 != 0) {
                            fs4Var4 = cs4Var;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        awVar = e01.a;
                        if (i4 != 0) {
                            objK6 = ux2Var.K();
                            if (objK6 == awVar) {
                                objK6 = new vr1(b);
                                ux2Var.g0(objK6);
                            }
                            function8 = (Function0) objK6;
                        } else {
                            function8 = function3;
                        }
                        if (i6 != 0) {
                            objK5 = ux2Var.K();
                            if (objK5 == awVar) {
                                objK5 = new vr1(b2);
                                ux2Var.g0(objK5);
                            }
                            function4 = (Function0) objK5;
                        }
                        if (i8 != 0) {
                            objK4 = ux2Var.K();
                            if (objK4 == awVar) {
                                objK4 = new vr1((byte) 3);
                                ux2Var.g0(objK4);
                            }
                            function9 = (Function0) objK4;
                            z2 = true;
                        } else {
                            z2 = true;
                            function9 = function2;
                        }
                        Set set = wt1Var.c;
                        js1Var = ns1Var.u;
                        if (js1Var != js1.n || js1Var == js1.f1197o) {
                            z3 = z2;
                        } else {
                            z3 = false;
                        }
                        if (ns1Var.c == ls1.n) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (wt1Var.d || z14 || z3) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (!z3 || z4) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (z3 && set.contains(ss1.f2046o)) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (!z5 || z14 || z6 || z7) {
                            z8 = z6;
                            function10 = function8;
                            if (z5) {
                                ux2Var.W(1355797012);
                                vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                                ux2Var.p(false);
                                j56VarR = ux2Var.r();
                                if (j56VarR == null) {
                                    return;
                                }
                                final byte b3 = 1;
                                final Function0 function13 = function4;
                                hw2Var = new hw2() { // from class: o.ts1
                                    @Override // o.hw2
                                    public final Object invoke(Object obj, Object obj2) {
                                        byte b4 = b3;
                                        f88 f88Var = f88.a;
                                        int i12 = i;
                                        switch (b4) {
                                            case 0:
                                                ((Integer) obj2).getClass();
                                                int iY = yo1.Y(i12 | 1);
                                                us1.b(wt1Var, ns1Var, fs4Var4, function10, function13, function9, (ux2) obj, iY, i2);
                                                break;
                                            case 1:
                                                ((Integer) obj2).getClass();
                                                int iY2 = yo1.Y(i12 | 1);
                                                us1.b(wt1Var, ns1Var, fs4Var4, function10, function13, function9, (ux2) obj, iY2, i2);
                                                break;
                                            default:
                                                ((Integer) obj2).getClass();
                                                int iY3 = yo1.Y(i12 | 1);
                                                us1.b(wt1Var, ns1Var, fs4Var4, function10, function13, function9, (ux2) obj, iY3, i2);
                                                break;
                                        }
                                        return f88Var;
                                    }
                                };
                            } else {
                                fs4 fs4Var5 = fs4Var4;
                                function11 = function4;
                                ux2Var.W(1355879658);
                                ux2Var.p(false);
                                if (z14) {
                                    strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                                } else {
                                    strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                                }
                                kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                                i10 = i3;
                                int iHashCode = Long.hashCode(ux2Var.T);
                                yj5 yj5VarL = ux2Var.l();
                                fs4 fs4VarS = uf0.s(ux2Var, fs4Var5);
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
                                lv1.A(0, strM, ux2Var, null);
                                if (z14) {
                                    ux2Var.W(2045265100);
                                    fs4 fs4VarJ = iq8.j(cs4Var, sf6.a(8.0f));
                                    sk7 sk7Var = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                                    if ((57344 & i10) == 16384) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    objK3 = ux2Var.K();
                                    if (z13 || objK3 == awVar) {
                                        objK3 = new a9(function11, (byte) 23);
                                        ux2Var.g0(objK3);
                                    }
                                    x37.e(sk7Var, fs4VarJ, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                                    ux2Var.p(false);
                                    z10 = true;
                                    function12 = function9;
                                } else {
                                    ux2Var.W(2047427443);
                                    if (z8) {
                                        ux2Var.W(2047435472);
                                        fs4 fs4VarJ2 = iq8.j(cs4Var, sf6.a(8.0f));
                                        sk7 sk7Var2 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                                        if ((i10 & 7168) == 2048) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        objK2 = ux2Var.K();
                                        if (z12 || objK2 == awVar) {
                                            objK2 = new a9(function10, (byte) 24);
                                            ux2Var.g0(objK2);
                                        }
                                        z9 = false;
                                        function12 = function9;
                                        x37.e(sk7Var2, fs4VarJ2, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                                        ux2Var.p(false);
                                    } else {
                                        z9 = false;
                                        function12 = function9;
                                        ux2Var.W(2049144564);
                                        ux2Var.p(false);
                                    }
                                    if (z7) {
                                        ux2Var.W(2049246833);
                                        fs4 fs4VarJ3 = iq8.j(cs4Var, sf6.a(8.0f));
                                        sk7 sk7Var3 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                                        if ((i10 & 458752) == 131072) {
                                            z11 = true;
                                        } else {
                                            z11 = z9;
                                        }
                                        objK = ux2Var.K();
                                        if (z11 || objK == awVar) {
                                            objK = new a9(function12, (byte) 25);
                                            ux2Var.g0(objK);
                                        }
                                        x37.e(sk7Var3, fs4VarJ3, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                                        ux2Var.p(z9);
                                    } else {
                                        ux2Var.W(2050801204);
                                        ux2Var.p(z9);
                                    }
                                    ux2Var.p(z9);
                                    z10 = true;
                                }
                                ux2Var.p(z10);
                                function5 = function12;
                                fs4Var3 = fs4Var5;
                                function6 = function10;
                                function7 = function11;
                            }
                        } else {
                            j56VarR = ux2Var.r();
                            if (j56VarR == null) {
                                return;
                            }
                            final Function0 function14 = function8;
                            final byte b4 = 0;
                            final Function0 function15 = function4;
                            hw2Var = new hw2() { // from class: o.ts1
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    byte b5 = b4;
                                    f88 f88Var = f88.a;
                                    int i12 = i;
                                    switch (b5) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iY = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function14, function15, function9, (ux2) obj, iY, i2);
                                            break;
                                        case 1:
                                            ((Integer) obj2).getClass();
                                            int iY2 = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function14, function15, function9, (ux2) obj, iY2, i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iY3 = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function14, function15, function9, (ux2) obj, iY3, i2);
                                            break;
                                    }
                                    return f88Var;
                                }
                            };
                        }
                        j56VarR.d = hw2Var;
                    }
                    ux2Var.Q();
                    function5 = function2;
                    fs4Var3 = fs4Var2;
                    function6 = function3;
                    function7 = function4;
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        final byte b5 = 2;
                        hw2Var = new hw2() { // from class: o.ts1
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                byte b6 = b5;
                                f88 f88Var = f88.a;
                                int i12 = i;
                                switch (b6) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iY = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY, i2);
                                        break;
                                    case 1:
                                        ((Integer) obj2).getClass();
                                        int iY2 = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY2, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iY3 = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY3, i2);
                                        break;
                                }
                                return f88Var;
                            }
                        };
                        j56VarR.d = hw2Var;
                    }
                }
                i3 |= 24576;
                function4 = function1;
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (ux2Var.h(function2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                b = 1;
                if ((i3 & 74899) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (ux2Var.N(i3 & 1, z)) {
                    cs4Var = cs4.b;
                    if (i11 != 0) {
                        fs4Var4 = cs4Var;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    awVar = e01.a;
                    if (i4 != 0) {
                        objK6 = ux2Var.K();
                        if (objK6 == awVar) {
                            objK6 = new vr1(b);
                            ux2Var.g0(objK6);
                        }
                        function8 = (Function0) objK6;
                    } else {
                        function8 = function3;
                    }
                    if (i6 != 0) {
                        objK5 = ux2Var.K();
                        if (objK5 == awVar) {
                            objK5 = new vr1(b2);
                            ux2Var.g0(objK5);
                        }
                        function4 = (Function0) objK5;
                    }
                    if (i8 != 0) {
                        objK4 = ux2Var.K();
                        if (objK4 == awVar) {
                            objK4 = new vr1((byte) 3);
                            ux2Var.g0(objK4);
                        }
                        function9 = (Function0) objK4;
                        z2 = true;
                    } else {
                        z2 = true;
                        function9 = function2;
                    }
                    Set set2 = wt1Var.c;
                    js1Var = ns1Var.u;
                    if (js1Var != js1.n) {
                        z3 = z2;
                    } else {
                        z3 = z2;
                    }
                    if (ns1Var.c == ls1.n) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (wt1Var.d) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (z3) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (z3) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    if (z5) {
                        z8 = z6;
                        function10 = function8;
                        if (z5) {
                            ux2Var.W(1355797012);
                            vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                            ux2Var.p(false);
                            j56VarR = ux2Var.r();
                            if (j56VarR == null) {
                                return;
                            }
                            final byte b6 = 1;
                            final Function0 function16 = function4;
                            hw2Var = new hw2() { // from class: o.ts1
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    byte b7 = b6;
                                    f88 f88Var = f88.a;
                                    int i12 = i;
                                    switch (b7) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iY = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function16, function9, (ux2) obj, iY, i2);
                                            break;
                                        case 1:
                                            ((Integer) obj2).getClass();
                                            int iY2 = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function16, function9, (ux2) obj, iY2, i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iY3 = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function16, function9, (ux2) obj, iY3, i2);
                                            break;
                                    }
                                    return f88Var;
                                }
                            };
                        } else {
                            fs4 fs4Var6 = fs4Var4;
                            function11 = function4;
                            ux2Var.W(1355879658);
                            ux2Var.p(false);
                            if (z14) {
                                strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                            } else {
                                strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                            }
                            kw0 kw0VarA2 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                            i10 = i3;
                            int iHashCode2 = Long.hashCode(ux2Var.T);
                            yj5 yj5VarL2 = ux2Var.l();
                            fs4 fs4VarS2 = uf0.s(ux2Var, fs4Var6);
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(kw0VarA2, d82.v, ux2Var);
                            o67.n(yj5VarL2, d82.u, ux2Var);
                            o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS2, d82.t, ux2Var);
                            lv1.A(0, strM, ux2Var, null);
                            if (z14) {
                                ux2Var.W(2045265100);
                                fs4 fs4VarJ4 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var4 = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                                if ((57344 & i10) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objK3 = ux2Var.K();
                                if (z13) {
                                    objK3 = new a9(function11, (byte) 23);
                                    ux2Var.g0(objK3);
                                } else {
                                    objK3 = new a9(function11, (byte) 23);
                                    ux2Var.g0(objK3);
                                }
                                x37.e(sk7Var4, fs4VarJ4, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                                ux2Var.p(false);
                                z10 = true;
                                function12 = function9;
                            } else {
                                ux2Var.W(2047427443);
                                if (z8) {
                                    ux2Var.W(2047435472);
                                    fs4 fs4VarJ5 = iq8.j(cs4Var, sf6.a(8.0f));
                                    sk7 sk7Var5 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                                    if ((i10 & 7168) == 2048) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    objK2 = ux2Var.K();
                                    if (z12) {
                                        objK2 = new a9(function10, (byte) 24);
                                        ux2Var.g0(objK2);
                                    } else {
                                        objK2 = new a9(function10, (byte) 24);
                                        ux2Var.g0(objK2);
                                    }
                                    z9 = false;
                                    function12 = function9;
                                    x37.e(sk7Var5, fs4VarJ5, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                                    ux2Var.p(false);
                                } else {
                                    z9 = false;
                                    function12 = function9;
                                    ux2Var.W(2049144564);
                                    ux2Var.p(false);
                                }
                                if (z7) {
                                    ux2Var.W(2049246833);
                                    fs4 fs4VarJ6 = iq8.j(cs4Var, sf6.a(8.0f));
                                    sk7 sk7Var6 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                                    if ((i10 & 458752) == 131072) {
                                        z11 = true;
                                    } else {
                                        z11 = z9;
                                    }
                                    objK = ux2Var.K();
                                    if (z11) {
                                        objK = new a9(function12, (byte) 25);
                                        ux2Var.g0(objK);
                                    } else {
                                        objK = new a9(function12, (byte) 25);
                                        ux2Var.g0(objK);
                                    }
                                    x37.e(sk7Var6, fs4VarJ6, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                                    ux2Var.p(z9);
                                } else {
                                    ux2Var.W(2050801204);
                                    ux2Var.p(z9);
                                }
                                ux2Var.p(z9);
                                z10 = true;
                            }
                            ux2Var.p(z10);
                            function5 = function12;
                            fs4Var3 = fs4Var6;
                            function6 = function10;
                            function7 = function11;
                        }
                    } else {
                        z8 = z6;
                        function10 = function8;
                        if (z5) {
                            ux2Var.W(1355797012);
                            vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                            ux2Var.p(false);
                            j56VarR = ux2Var.r();
                            if (j56VarR == null) {
                                return;
                            }
                            final byte b7 = 1;
                            final Function0 function17 = function4;
                            hw2Var = new hw2() { // from class: o.ts1
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    byte b8 = b7;
                                    f88 f88Var = f88.a;
                                    int i12 = i;
                                    switch (b8) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iY = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function17, function9, (ux2) obj, iY, i2);
                                            break;
                                        case 1:
                                            ((Integer) obj2).getClass();
                                            int iY2 = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function17, function9, (ux2) obj, iY2, i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iY3 = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function17, function9, (ux2) obj, iY3, i2);
                                            break;
                                    }
                                    return f88Var;
                                }
                            };
                        } else {
                            fs4 fs4Var7 = fs4Var4;
                            function11 = function4;
                            ux2Var.W(1355879658);
                            ux2Var.p(false);
                            if (z14) {
                                strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                            } else {
                                strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                            }
                            kw0 kw0VarA3 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                            i10 = i3;
                            int iHashCode3 = Long.hashCode(ux2Var.T);
                            yj5 yj5VarL3 = ux2Var.l();
                            fs4 fs4VarS3 = uf0.s(ux2Var, fs4Var7);
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(kw0VarA3, d82.v, ux2Var);
                            o67.n(yj5VarL3, d82.u, ux2Var);
                            o67.n(Integer.valueOf(iHashCode3), d82.w, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS3, d82.t, ux2Var);
                            lv1.A(0, strM, ux2Var, null);
                            if (z14) {
                                ux2Var.W(2045265100);
                                fs4 fs4VarJ7 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var7 = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                                if ((57344 & i10) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objK3 = ux2Var.K();
                                if (z13) {
                                    objK3 = new a9(function11, (byte) 23);
                                    ux2Var.g0(objK3);
                                } else {
                                    objK3 = new a9(function11, (byte) 23);
                                    ux2Var.g0(objK3);
                                }
                                x37.e(sk7Var7, fs4VarJ7, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                                ux2Var.p(false);
                                z10 = true;
                                function12 = function9;
                            } else {
                                ux2Var.W(2047427443);
                                if (z8) {
                                    ux2Var.W(2047435472);
                                    fs4 fs4VarJ8 = iq8.j(cs4Var, sf6.a(8.0f));
                                    sk7 sk7Var8 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                                    if ((i10 & 7168) == 2048) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    objK2 = ux2Var.K();
                                    if (z12) {
                                        objK2 = new a9(function10, (byte) 24);
                                        ux2Var.g0(objK2);
                                    } else {
                                        objK2 = new a9(function10, (byte) 24);
                                        ux2Var.g0(objK2);
                                    }
                                    z9 = false;
                                    function12 = function9;
                                    x37.e(sk7Var8, fs4VarJ8, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                                    ux2Var.p(false);
                                } else {
                                    z9 = false;
                                    function12 = function9;
                                    ux2Var.W(2049144564);
                                    ux2Var.p(false);
                                }
                                if (z7) {
                                    ux2Var.W(2049246833);
                                    fs4 fs4VarJ9 = iq8.j(cs4Var, sf6.a(8.0f));
                                    sk7 sk7Var9 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                                    if ((i10 & 458752) == 131072) {
                                        z11 = true;
                                    } else {
                                        z11 = z9;
                                    }
                                    objK = ux2Var.K();
                                    if (z11) {
                                        objK = new a9(function12, (byte) 25);
                                        ux2Var.g0(objK);
                                    } else {
                                        objK = new a9(function12, (byte) 25);
                                        ux2Var.g0(objK);
                                    }
                                    x37.e(sk7Var9, fs4VarJ9, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                                    ux2Var.p(z9);
                                } else {
                                    ux2Var.W(2050801204);
                                    ux2Var.p(z9);
                                }
                                ux2Var.p(z9);
                                z10 = true;
                            }
                            ux2Var.p(z10);
                            function5 = function12;
                            fs4Var3 = fs4Var7;
                            function6 = function10;
                            function7 = function11;
                        }
                    }
                    j56VarR.d = hw2Var;
                }
                ux2Var.Q();
                function5 = function2;
                fs4Var3 = fs4Var2;
                function6 = function3;
                function7 = function4;
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    final byte b8 = 2;
                    hw2Var = new hw2() { // from class: o.ts1
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b9 = b8;
                            f88 f88Var = f88.a;
                            int i12 = i;
                            switch (b9) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY, i2);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int iY2 = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY2, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY3 = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY3, i2);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    j56VarR.d = hw2Var;
                }
            }
            i3 |= 3072;
            function3 = function0;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function4 = function1;
                    if (ux2Var.h(function4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (ux2Var.h(function2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                b = 1;
                if ((i3 & 74899) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (ux2Var.N(i3 & 1, z)) {
                    cs4Var = cs4.b;
                    if (i11 != 0) {
                        fs4Var4 = cs4Var;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    awVar = e01.a;
                    if (i4 != 0) {
                        objK6 = ux2Var.K();
                        if (objK6 == awVar) {
                            objK6 = new vr1(b);
                            ux2Var.g0(objK6);
                        }
                        function8 = (Function0) objK6;
                    } else {
                        function8 = function3;
                    }
                    if (i6 != 0) {
                        objK5 = ux2Var.K();
                        if (objK5 == awVar) {
                            objK5 = new vr1(b2);
                            ux2Var.g0(objK5);
                        }
                        function4 = (Function0) objK5;
                    }
                    if (i8 != 0) {
                        objK4 = ux2Var.K();
                        if (objK4 == awVar) {
                            objK4 = new vr1((byte) 3);
                            ux2Var.g0(objK4);
                        }
                        function9 = (Function0) objK4;
                        z2 = true;
                    } else {
                        z2 = true;
                        function9 = function2;
                    }
                    Set set3 = wt1Var.c;
                    js1Var = ns1Var.u;
                    if (js1Var != js1.n) {
                        z3 = z2;
                    } else {
                        z3 = z2;
                    }
                    if (ns1Var.c == ls1.n) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (wt1Var.d) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (z3) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (z3) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    if (z5) {
                        z8 = z6;
                        function10 = function8;
                        if (z5) {
                            ux2Var.W(1355797012);
                            vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                            ux2Var.p(false);
                            j56VarR = ux2Var.r();
                            if (j56VarR == null) {
                                return;
                            }
                            final byte b9 = 1;
                            final Function0 function18 = function4;
                            hw2Var = new hw2() { // from class: o.ts1
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    byte b10 = b9;
                                    f88 f88Var = f88.a;
                                    int i12 = i;
                                    switch (b10) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iY = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function18, function9, (ux2) obj, iY, i2);
                                            break;
                                        case 1:
                                            ((Integer) obj2).getClass();
                                            int iY2 = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function18, function9, (ux2) obj, iY2, i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iY3 = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function18, function9, (ux2) obj, iY3, i2);
                                            break;
                                    }
                                    return f88Var;
                                }
                            };
                        } else {
                            fs4 fs4Var8 = fs4Var4;
                            function11 = function4;
                            ux2Var.W(1355879658);
                            ux2Var.p(false);
                            if (z14) {
                                strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                            } else {
                                strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                            }
                            kw0 kw0VarA4 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                            i10 = i3;
                            int iHashCode4 = Long.hashCode(ux2Var.T);
                            yj5 yj5VarL4 = ux2Var.l();
                            fs4 fs4VarS4 = uf0.s(ux2Var, fs4Var8);
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(kw0VarA4, d82.v, ux2Var);
                            o67.n(yj5VarL4, d82.u, ux2Var);
                            o67.n(Integer.valueOf(iHashCode4), d82.w, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS4, d82.t, ux2Var);
                            lv1.A(0, strM, ux2Var, null);
                            if (z14) {
                                ux2Var.W(2045265100);
                                fs4 fs4VarJ10 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var10 = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                                if ((57344 & i10) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objK3 = ux2Var.K();
                                if (z13) {
                                    objK3 = new a9(function11, (byte) 23);
                                    ux2Var.g0(objK3);
                                } else {
                                    objK3 = new a9(function11, (byte) 23);
                                    ux2Var.g0(objK3);
                                }
                                x37.e(sk7Var10, fs4VarJ10, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                                ux2Var.p(false);
                                z10 = true;
                                function12 = function9;
                            } else {
                                ux2Var.W(2047427443);
                                if (z8) {
                                    ux2Var.W(2047435472);
                                    fs4 fs4VarJ11 = iq8.j(cs4Var, sf6.a(8.0f));
                                    sk7 sk7Var11 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                                    if ((i10 & 7168) == 2048) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    objK2 = ux2Var.K();
                                    if (z12) {
                                        objK2 = new a9(function10, (byte) 24);
                                        ux2Var.g0(objK2);
                                    } else {
                                        objK2 = new a9(function10, (byte) 24);
                                        ux2Var.g0(objK2);
                                    }
                                    z9 = false;
                                    function12 = function9;
                                    x37.e(sk7Var11, fs4VarJ11, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                                    ux2Var.p(false);
                                } else {
                                    z9 = false;
                                    function12 = function9;
                                    ux2Var.W(2049144564);
                                    ux2Var.p(false);
                                }
                                if (z7) {
                                    ux2Var.W(2049246833);
                                    fs4 fs4VarJ12 = iq8.j(cs4Var, sf6.a(8.0f));
                                    sk7 sk7Var12 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                                    if ((i10 & 458752) == 131072) {
                                        z11 = true;
                                    } else {
                                        z11 = z9;
                                    }
                                    objK = ux2Var.K();
                                    if (z11) {
                                        objK = new a9(function12, (byte) 25);
                                        ux2Var.g0(objK);
                                    } else {
                                        objK = new a9(function12, (byte) 25);
                                        ux2Var.g0(objK);
                                    }
                                    x37.e(sk7Var12, fs4VarJ12, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                                    ux2Var.p(z9);
                                } else {
                                    ux2Var.W(2050801204);
                                    ux2Var.p(z9);
                                }
                                ux2Var.p(z9);
                                z10 = true;
                            }
                            ux2Var.p(z10);
                            function5 = function12;
                            fs4Var3 = fs4Var8;
                            function6 = function10;
                            function7 = function11;
                        }
                    } else {
                        z8 = z6;
                        function10 = function8;
                        if (z5) {
                            ux2Var.W(1355797012);
                            vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                            ux2Var.p(false);
                            j56VarR = ux2Var.r();
                            if (j56VarR == null) {
                                return;
                            }
                            final byte b10 = 1;
                            final Function0 function19 = function4;
                            hw2Var = new hw2() { // from class: o.ts1
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    byte b11 = b10;
                                    f88 f88Var = f88.a;
                                    int i12 = i;
                                    switch (b11) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iY = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function19, function9, (ux2) obj, iY, i2);
                                            break;
                                        case 1:
                                            ((Integer) obj2).getClass();
                                            int iY2 = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function19, function9, (ux2) obj, iY2, i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iY3 = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function19, function9, (ux2) obj, iY3, i2);
                                            break;
                                    }
                                    return f88Var;
                                }
                            };
                        } else {
                            fs4 fs4Var9 = fs4Var4;
                            function11 = function4;
                            ux2Var.W(1355879658);
                            ux2Var.p(false);
                            if (z14) {
                                strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                            } else {
                                strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                            }
                            kw0 kw0VarA5 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                            i10 = i3;
                            int iHashCode5 = Long.hashCode(ux2Var.T);
                            yj5 yj5VarL5 = ux2Var.l();
                            fs4 fs4VarS5 = uf0.s(ux2Var, fs4Var9);
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(kw0VarA5, d82.v, ux2Var);
                            o67.n(yj5VarL5, d82.u, ux2Var);
                            o67.n(Integer.valueOf(iHashCode5), d82.w, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS5, d82.t, ux2Var);
                            lv1.A(0, strM, ux2Var, null);
                            if (z14) {
                                ux2Var.W(2045265100);
                                fs4 fs4VarJ13 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var13 = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                                if ((57344 & i10) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objK3 = ux2Var.K();
                                if (z13) {
                                    objK3 = new a9(function11, (byte) 23);
                                    ux2Var.g0(objK3);
                                } else {
                                    objK3 = new a9(function11, (byte) 23);
                                    ux2Var.g0(objK3);
                                }
                                x37.e(sk7Var13, fs4VarJ13, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                                ux2Var.p(false);
                                z10 = true;
                                function12 = function9;
                            } else {
                                ux2Var.W(2047427443);
                                if (z8) {
                                    ux2Var.W(2047435472);
                                    fs4 fs4VarJ14 = iq8.j(cs4Var, sf6.a(8.0f));
                                    sk7 sk7Var14 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                                    if ((i10 & 7168) == 2048) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    objK2 = ux2Var.K();
                                    if (z12) {
                                        objK2 = new a9(function10, (byte) 24);
                                        ux2Var.g0(objK2);
                                    } else {
                                        objK2 = new a9(function10, (byte) 24);
                                        ux2Var.g0(objK2);
                                    }
                                    z9 = false;
                                    function12 = function9;
                                    x37.e(sk7Var14, fs4VarJ14, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                                    ux2Var.p(false);
                                } else {
                                    z9 = false;
                                    function12 = function9;
                                    ux2Var.W(2049144564);
                                    ux2Var.p(false);
                                }
                                if (z7) {
                                    ux2Var.W(2049246833);
                                    fs4 fs4VarJ15 = iq8.j(cs4Var, sf6.a(8.0f));
                                    sk7 sk7Var15 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                                    if ((i10 & 458752) == 131072) {
                                        z11 = true;
                                    } else {
                                        z11 = z9;
                                    }
                                    objK = ux2Var.K();
                                    if (z11) {
                                        objK = new a9(function12, (byte) 25);
                                        ux2Var.g0(objK);
                                    } else {
                                        objK = new a9(function12, (byte) 25);
                                        ux2Var.g0(objK);
                                    }
                                    x37.e(sk7Var15, fs4VarJ15, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                                    ux2Var.p(z9);
                                } else {
                                    ux2Var.W(2050801204);
                                    ux2Var.p(z9);
                                }
                                ux2Var.p(z9);
                                z10 = true;
                            }
                            ux2Var.p(z10);
                            function5 = function12;
                            fs4Var3 = fs4Var9;
                            function6 = function10;
                            function7 = function11;
                        }
                    }
                    j56VarR.d = hw2Var;
                }
                ux2Var.Q();
                function5 = function2;
                fs4Var3 = fs4Var2;
                function6 = function3;
                function7 = function4;
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    final byte b11 = 2;
                    hw2Var = new hw2() { // from class: o.ts1
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b12 = b11;
                            f88 f88Var = f88.a;
                            int i12 = i;
                            switch (b12) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY, i2);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int iY2 = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY2, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY3 = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY3, i2);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    j56VarR.d = hw2Var;
                }
            }
            i3 |= 24576;
            function4 = function1;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (ux2Var.h(function2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            b = 1;
            if ((i3 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i3 & 1, z)) {
                cs4Var = cs4.b;
                if (i11 != 0) {
                    fs4Var4 = cs4Var;
                } else {
                    fs4Var4 = fs4Var2;
                }
                awVar = e01.a;
                if (i4 != 0) {
                    objK6 = ux2Var.K();
                    if (objK6 == awVar) {
                        objK6 = new vr1(b);
                        ux2Var.g0(objK6);
                    }
                    function8 = (Function0) objK6;
                } else {
                    function8 = function3;
                }
                if (i6 != 0) {
                    objK5 = ux2Var.K();
                    if (objK5 == awVar) {
                        objK5 = new vr1(b2);
                        ux2Var.g0(objK5);
                    }
                    function4 = (Function0) objK5;
                }
                if (i8 != 0) {
                    objK4 = ux2Var.K();
                    if (objK4 == awVar) {
                        objK4 = new vr1((byte) 3);
                        ux2Var.g0(objK4);
                    }
                    function9 = (Function0) objK4;
                    z2 = true;
                } else {
                    z2 = true;
                    function9 = function2;
                }
                Set set4 = wt1Var.c;
                js1Var = ns1Var.u;
                if (js1Var != js1.n) {
                    z3 = z2;
                } else {
                    z3 = z2;
                }
                if (ns1Var.c == ls1.n) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (wt1Var.d) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                if (z3) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (z3) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (z5) {
                    z8 = z6;
                    function10 = function8;
                    if (z5) {
                        ux2Var.W(1355797012);
                        vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                        ux2Var.p(false);
                        j56VarR = ux2Var.r();
                        if (j56VarR == null) {
                            return;
                        }
                        final byte b12 = 1;
                        final Function0 function110 = function4;
                        hw2Var = new hw2() { // from class: o.ts1
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                byte b13 = b12;
                                f88 f88Var = f88.a;
                                int i12 = i;
                                switch (b13) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iY = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function110, function9, (ux2) obj, iY, i2);
                                        break;
                                    case 1:
                                        ((Integer) obj2).getClass();
                                        int iY2 = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function110, function9, (ux2) obj, iY2, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iY3 = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function110, function9, (ux2) obj, iY3, i2);
                                        break;
                                }
                                return f88Var;
                            }
                        };
                    } else {
                        fs4 fs4Var10 = fs4Var4;
                        function11 = function4;
                        ux2Var.W(1355879658);
                        ux2Var.p(false);
                        if (z14) {
                            strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                        } else {
                            strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                        }
                        kw0 kw0VarA6 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                        i10 = i3;
                        int iHashCode6 = Long.hashCode(ux2Var.T);
                        yj5 yj5VarL6 = ux2Var.l();
                        fs4 fs4VarS6 = uf0.s(ux2Var, fs4Var10);
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(kw0VarA6, d82.v, ux2Var);
                        o67.n(yj5VarL6, d82.u, ux2Var);
                        o67.n(Integer.valueOf(iHashCode6), d82.w, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS6, d82.t, ux2Var);
                        lv1.A(0, strM, ux2Var, null);
                        if (z14) {
                            ux2Var.W(2045265100);
                            fs4 fs4VarJ16 = iq8.j(cs4Var, sf6.a(8.0f));
                            sk7 sk7Var16 = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                            if ((57344 & i10) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objK3 = ux2Var.K();
                            if (z13) {
                                objK3 = new a9(function11, (byte) 23);
                                ux2Var.g0(objK3);
                            } else {
                                objK3 = new a9(function11, (byte) 23);
                                ux2Var.g0(objK3);
                            }
                            x37.e(sk7Var16, fs4VarJ16, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                            ux2Var.p(false);
                            z10 = true;
                            function12 = function9;
                        } else {
                            ux2Var.W(2047427443);
                            if (z8) {
                                ux2Var.W(2047435472);
                                fs4 fs4VarJ17 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var17 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                                if ((i10 & 7168) == 2048) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                objK2 = ux2Var.K();
                                if (z12) {
                                    objK2 = new a9(function10, (byte) 24);
                                    ux2Var.g0(objK2);
                                } else {
                                    objK2 = new a9(function10, (byte) 24);
                                    ux2Var.g0(objK2);
                                }
                                z9 = false;
                                function12 = function9;
                                x37.e(sk7Var17, fs4VarJ17, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                                ux2Var.p(false);
                            } else {
                                z9 = false;
                                function12 = function9;
                                ux2Var.W(2049144564);
                                ux2Var.p(false);
                            }
                            if (z7) {
                                ux2Var.W(2049246833);
                                fs4 fs4VarJ18 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var18 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                                if ((i10 & 458752) == 131072) {
                                    z11 = true;
                                } else {
                                    z11 = z9;
                                }
                                objK = ux2Var.K();
                                if (z11) {
                                    objK = new a9(function12, (byte) 25);
                                    ux2Var.g0(objK);
                                } else {
                                    objK = new a9(function12, (byte) 25);
                                    ux2Var.g0(objK);
                                }
                                x37.e(sk7Var18, fs4VarJ18, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                                ux2Var.p(z9);
                            } else {
                                ux2Var.W(2050801204);
                                ux2Var.p(z9);
                            }
                            ux2Var.p(z9);
                            z10 = true;
                        }
                        ux2Var.p(z10);
                        function5 = function12;
                        fs4Var3 = fs4Var10;
                        function6 = function10;
                        function7 = function11;
                    }
                } else {
                    z8 = z6;
                    function10 = function8;
                    if (z5) {
                        ux2Var.W(1355797012);
                        vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                        ux2Var.p(false);
                        j56VarR = ux2Var.r();
                        if (j56VarR == null) {
                            return;
                        }
                        final byte b13 = 1;
                        final Function0 function111 = function4;
                        hw2Var = new hw2() { // from class: o.ts1
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                byte b14 = b13;
                                f88 f88Var = f88.a;
                                int i12 = i;
                                switch (b14) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iY = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function111, function9, (ux2) obj, iY, i2);
                                        break;
                                    case 1:
                                        ((Integer) obj2).getClass();
                                        int iY2 = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function111, function9, (ux2) obj, iY2, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iY3 = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function111, function9, (ux2) obj, iY3, i2);
                                        break;
                                }
                                return f88Var;
                            }
                        };
                    } else {
                        fs4 fs4Var11 = fs4Var4;
                        function11 = function4;
                        ux2Var.W(1355879658);
                        ux2Var.p(false);
                        if (z14) {
                            strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                        } else {
                            strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                        }
                        kw0 kw0VarA7 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                        i10 = i3;
                        int iHashCode7 = Long.hashCode(ux2Var.T);
                        yj5 yj5VarL7 = ux2Var.l();
                        fs4 fs4VarS7 = uf0.s(ux2Var, fs4Var11);
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(kw0VarA7, d82.v, ux2Var);
                        o67.n(yj5VarL7, d82.u, ux2Var);
                        o67.n(Integer.valueOf(iHashCode7), d82.w, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS7, d82.t, ux2Var);
                        lv1.A(0, strM, ux2Var, null);
                        if (z14) {
                            ux2Var.W(2045265100);
                            fs4 fs4VarJ19 = iq8.j(cs4Var, sf6.a(8.0f));
                            sk7 sk7Var19 = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                            if ((57344 & i10) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objK3 = ux2Var.K();
                            if (z13) {
                                objK3 = new a9(function11, (byte) 23);
                                ux2Var.g0(objK3);
                            } else {
                                objK3 = new a9(function11, (byte) 23);
                                ux2Var.g0(objK3);
                            }
                            x37.e(sk7Var19, fs4VarJ19, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                            ux2Var.p(false);
                            z10 = true;
                            function12 = function9;
                        } else {
                            ux2Var.W(2047427443);
                            if (z8) {
                                ux2Var.W(2047435472);
                                fs4 fs4VarJ110 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var110 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                                if ((i10 & 7168) == 2048) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                objK2 = ux2Var.K();
                                if (z12) {
                                    objK2 = new a9(function10, (byte) 24);
                                    ux2Var.g0(objK2);
                                } else {
                                    objK2 = new a9(function10, (byte) 24);
                                    ux2Var.g0(objK2);
                                }
                                z9 = false;
                                function12 = function9;
                                x37.e(sk7Var110, fs4VarJ110, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                                ux2Var.p(false);
                            } else {
                                z9 = false;
                                function12 = function9;
                                ux2Var.W(2049144564);
                                ux2Var.p(false);
                            }
                            if (z7) {
                                ux2Var.W(2049246833);
                                fs4 fs4VarJ111 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var111 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                                if ((i10 & 458752) == 131072) {
                                    z11 = true;
                                } else {
                                    z11 = z9;
                                }
                                objK = ux2Var.K();
                                if (z11) {
                                    objK = new a9(function12, (byte) 25);
                                    ux2Var.g0(objK);
                                } else {
                                    objK = new a9(function12, (byte) 25);
                                    ux2Var.g0(objK);
                                }
                                x37.e(sk7Var111, fs4VarJ111, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                                ux2Var.p(z9);
                            } else {
                                ux2Var.W(2050801204);
                                ux2Var.p(z9);
                            }
                            ux2Var.p(z9);
                            z10 = true;
                        }
                        ux2Var.p(z10);
                        function5 = function12;
                        fs4Var3 = fs4Var11;
                        function6 = function10;
                        function7 = function11;
                    }
                }
                j56VarR.d = hw2Var;
            }
            ux2Var.Q();
            function5 = function2;
            fs4Var3 = fs4Var2;
            function6 = function3;
            function7 = function4;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                final byte b14 = 2;
                hw2Var = new hw2() { // from class: o.ts1
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b15 = b14;
                        f88 f88Var = f88.a;
                        int i12 = i;
                        switch (b15) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iY = yo1.Y(i12 | 1);
                                us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY, i2);
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                int iY2 = yo1.Y(i12 | 1);
                                us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY2, i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iY3 = yo1.Y(i12 | 1);
                                us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY3, i2);
                                break;
                        }
                        return f88Var;
                    }
                };
                j56VarR.d = hw2Var;
            }
        }
        i3 |= 384;
        fs4Var2 = fs4Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                function3 = function0;
                if (ux2Var.h(function3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function4 = function1;
                    if (ux2Var.h(function4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (ux2Var.h(function2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                b = 1;
                if ((i3 & 74899) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (ux2Var.N(i3 & 1, z)) {
                    cs4Var = cs4.b;
                    if (i11 != 0) {
                        fs4Var4 = cs4Var;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    awVar = e01.a;
                    if (i4 != 0) {
                        objK6 = ux2Var.K();
                        if (objK6 == awVar) {
                            objK6 = new vr1(b);
                            ux2Var.g0(objK6);
                        }
                        function8 = (Function0) objK6;
                    } else {
                        function8 = function3;
                    }
                    if (i6 != 0) {
                        objK5 = ux2Var.K();
                        if (objK5 == awVar) {
                            objK5 = new vr1(b2);
                            ux2Var.g0(objK5);
                        }
                        function4 = (Function0) objK5;
                    }
                    if (i8 != 0) {
                        objK4 = ux2Var.K();
                        if (objK4 == awVar) {
                            objK4 = new vr1((byte) 3);
                            ux2Var.g0(objK4);
                        }
                        function9 = (Function0) objK4;
                        z2 = true;
                    } else {
                        z2 = true;
                        function9 = function2;
                    }
                    Set set5 = wt1Var.c;
                    js1Var = ns1Var.u;
                    if (js1Var != js1.n) {
                        z3 = z2;
                    } else {
                        z3 = z2;
                    }
                    if (ns1Var.c == ls1.n) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (wt1Var.d) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (z3) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (z3) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    if (z5) {
                        z8 = z6;
                        function10 = function8;
                        if (z5) {
                            ux2Var.W(1355797012);
                            vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                            ux2Var.p(false);
                            j56VarR = ux2Var.r();
                            if (j56VarR == null) {
                                return;
                            }
                            final byte b15 = 1;
                            final Function0 function112 = function4;
                            hw2Var = new hw2() { // from class: o.ts1
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    byte b16 = b15;
                                    f88 f88Var = f88.a;
                                    int i12 = i;
                                    switch (b16) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iY = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function112, function9, (ux2) obj, iY, i2);
                                            break;
                                        case 1:
                                            ((Integer) obj2).getClass();
                                            int iY2 = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function112, function9, (ux2) obj, iY2, i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iY3 = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function112, function9, (ux2) obj, iY3, i2);
                                            break;
                                    }
                                    return f88Var;
                                }
                            };
                        } else {
                            fs4 fs4Var12 = fs4Var4;
                            function11 = function4;
                            ux2Var.W(1355879658);
                            ux2Var.p(false);
                            if (z14) {
                                strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                            } else {
                                strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                            }
                            kw0 kw0VarA8 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                            i10 = i3;
                            int iHashCode8 = Long.hashCode(ux2Var.T);
                            yj5 yj5VarL8 = ux2Var.l();
                            fs4 fs4VarS8 = uf0.s(ux2Var, fs4Var12);
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(kw0VarA8, d82.v, ux2Var);
                            o67.n(yj5VarL8, d82.u, ux2Var);
                            o67.n(Integer.valueOf(iHashCode8), d82.w, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS8, d82.t, ux2Var);
                            lv1.A(0, strM, ux2Var, null);
                            if (z14) {
                                ux2Var.W(2045265100);
                                fs4 fs4VarJ112 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var112 = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                                if ((57344 & i10) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objK3 = ux2Var.K();
                                if (z13) {
                                    objK3 = new a9(function11, (byte) 23);
                                    ux2Var.g0(objK3);
                                } else {
                                    objK3 = new a9(function11, (byte) 23);
                                    ux2Var.g0(objK3);
                                }
                                x37.e(sk7Var112, fs4VarJ112, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                                ux2Var.p(false);
                                z10 = true;
                                function12 = function9;
                            } else {
                                ux2Var.W(2047427443);
                                if (z8) {
                                    ux2Var.W(2047435472);
                                    fs4 fs4VarJ113 = iq8.j(cs4Var, sf6.a(8.0f));
                                    sk7 sk7Var113 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                                    if ((i10 & 7168) == 2048) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    objK2 = ux2Var.K();
                                    if (z12) {
                                        objK2 = new a9(function10, (byte) 24);
                                        ux2Var.g0(objK2);
                                    } else {
                                        objK2 = new a9(function10, (byte) 24);
                                        ux2Var.g0(objK2);
                                    }
                                    z9 = false;
                                    function12 = function9;
                                    x37.e(sk7Var113, fs4VarJ113, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                                    ux2Var.p(false);
                                } else {
                                    z9 = false;
                                    function12 = function9;
                                    ux2Var.W(2049144564);
                                    ux2Var.p(false);
                                }
                                if (z7) {
                                    ux2Var.W(2049246833);
                                    fs4 fs4VarJ114 = iq8.j(cs4Var, sf6.a(8.0f));
                                    sk7 sk7Var114 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                                    if ((i10 & 458752) == 131072) {
                                        z11 = true;
                                    } else {
                                        z11 = z9;
                                    }
                                    objK = ux2Var.K();
                                    if (z11) {
                                        objK = new a9(function12, (byte) 25);
                                        ux2Var.g0(objK);
                                    } else {
                                        objK = new a9(function12, (byte) 25);
                                        ux2Var.g0(objK);
                                    }
                                    x37.e(sk7Var114, fs4VarJ114, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                                    ux2Var.p(z9);
                                } else {
                                    ux2Var.W(2050801204);
                                    ux2Var.p(z9);
                                }
                                ux2Var.p(z9);
                                z10 = true;
                            }
                            ux2Var.p(z10);
                            function5 = function12;
                            fs4Var3 = fs4Var12;
                            function6 = function10;
                            function7 = function11;
                        }
                    } else {
                        z8 = z6;
                        function10 = function8;
                        if (z5) {
                            ux2Var.W(1355797012);
                            vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                            ux2Var.p(false);
                            j56VarR = ux2Var.r();
                            if (j56VarR == null) {
                                return;
                            }
                            final byte b16 = 1;
                            final Function0 function113 = function4;
                            hw2Var = new hw2() { // from class: o.ts1
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    byte b17 = b16;
                                    f88 f88Var = f88.a;
                                    int i12 = i;
                                    switch (b17) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iY = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function113, function9, (ux2) obj, iY, i2);
                                            break;
                                        case 1:
                                            ((Integer) obj2).getClass();
                                            int iY2 = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function113, function9, (ux2) obj, iY2, i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iY3 = yo1.Y(i12 | 1);
                                            us1.b(wt1Var, ns1Var, fs4Var4, function10, function113, function9, (ux2) obj, iY3, i2);
                                            break;
                                    }
                                    return f88Var;
                                }
                            };
                        } else {
                            fs4 fs4Var13 = fs4Var4;
                            function11 = function4;
                            ux2Var.W(1355879658);
                            ux2Var.p(false);
                            if (z14) {
                                strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                            } else {
                                strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                            }
                            kw0 kw0VarA9 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                            i10 = i3;
                            int iHashCode9 = Long.hashCode(ux2Var.T);
                            yj5 yj5VarL9 = ux2Var.l();
                            fs4 fs4VarS9 = uf0.s(ux2Var, fs4Var13);
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(kw0VarA9, d82.v, ux2Var);
                            o67.n(yj5VarL9, d82.u, ux2Var);
                            o67.n(Integer.valueOf(iHashCode9), d82.w, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS9, d82.t, ux2Var);
                            lv1.A(0, strM, ux2Var, null);
                            if (z14) {
                                ux2Var.W(2045265100);
                                fs4 fs4VarJ115 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var115 = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                                if ((57344 & i10) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objK3 = ux2Var.K();
                                if (z13) {
                                    objK3 = new a9(function11, (byte) 23);
                                    ux2Var.g0(objK3);
                                } else {
                                    objK3 = new a9(function11, (byte) 23);
                                    ux2Var.g0(objK3);
                                }
                                x37.e(sk7Var115, fs4VarJ115, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                                ux2Var.p(false);
                                z10 = true;
                                function12 = function9;
                            } else {
                                ux2Var.W(2047427443);
                                if (z8) {
                                    ux2Var.W(2047435472);
                                    fs4 fs4VarJ116 = iq8.j(cs4Var, sf6.a(8.0f));
                                    sk7 sk7Var116 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                                    if ((i10 & 7168) == 2048) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    objK2 = ux2Var.K();
                                    if (z12) {
                                        objK2 = new a9(function10, (byte) 24);
                                        ux2Var.g0(objK2);
                                    } else {
                                        objK2 = new a9(function10, (byte) 24);
                                        ux2Var.g0(objK2);
                                    }
                                    z9 = false;
                                    function12 = function9;
                                    x37.e(sk7Var116, fs4VarJ116, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                                    ux2Var.p(false);
                                } else {
                                    z9 = false;
                                    function12 = function9;
                                    ux2Var.W(2049144564);
                                    ux2Var.p(false);
                                }
                                if (z7) {
                                    ux2Var.W(2049246833);
                                    fs4 fs4VarJ117 = iq8.j(cs4Var, sf6.a(8.0f));
                                    sk7 sk7Var117 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                                    if ((i10 & 458752) == 131072) {
                                        z11 = true;
                                    } else {
                                        z11 = z9;
                                    }
                                    objK = ux2Var.K();
                                    if (z11) {
                                        objK = new a9(function12, (byte) 25);
                                        ux2Var.g0(objK);
                                    } else {
                                        objK = new a9(function12, (byte) 25);
                                        ux2Var.g0(objK);
                                    }
                                    x37.e(sk7Var117, fs4VarJ117, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                                    ux2Var.p(z9);
                                } else {
                                    ux2Var.W(2050801204);
                                    ux2Var.p(z9);
                                }
                                ux2Var.p(z9);
                                z10 = true;
                            }
                            ux2Var.p(z10);
                            function5 = function12;
                            fs4Var3 = fs4Var13;
                            function6 = function10;
                            function7 = function11;
                        }
                    }
                    j56VarR.d = hw2Var;
                }
                ux2Var.Q();
                function5 = function2;
                fs4Var3 = fs4Var2;
                function6 = function3;
                function7 = function4;
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    final byte b17 = 2;
                    hw2Var = new hw2() { // from class: o.ts1
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b18 = b17;
                            f88 f88Var = f88.a;
                            int i12 = i;
                            switch (b18) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY, i2);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int iY2 = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY2, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY3 = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY3, i2);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    j56VarR.d = hw2Var;
                }
            }
            i3 |= 24576;
            function4 = function1;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (ux2Var.h(function2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            b = 1;
            if ((i3 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i3 & 1, z)) {
                cs4Var = cs4.b;
                if (i11 != 0) {
                    fs4Var4 = cs4Var;
                } else {
                    fs4Var4 = fs4Var2;
                }
                awVar = e01.a;
                if (i4 != 0) {
                    objK6 = ux2Var.K();
                    if (objK6 == awVar) {
                        objK6 = new vr1(b);
                        ux2Var.g0(objK6);
                    }
                    function8 = (Function0) objK6;
                } else {
                    function8 = function3;
                }
                if (i6 != 0) {
                    objK5 = ux2Var.K();
                    if (objK5 == awVar) {
                        objK5 = new vr1(b2);
                        ux2Var.g0(objK5);
                    }
                    function4 = (Function0) objK5;
                }
                if (i8 != 0) {
                    objK4 = ux2Var.K();
                    if (objK4 == awVar) {
                        objK4 = new vr1((byte) 3);
                        ux2Var.g0(objK4);
                    }
                    function9 = (Function0) objK4;
                    z2 = true;
                } else {
                    z2 = true;
                    function9 = function2;
                }
                Set set6 = wt1Var.c;
                js1Var = ns1Var.u;
                if (js1Var != js1.n) {
                    z3 = z2;
                } else {
                    z3 = z2;
                }
                if (ns1Var.c == ls1.n) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (wt1Var.d) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                if (z3) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (z3) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (z5) {
                    z8 = z6;
                    function10 = function8;
                    if (z5) {
                        ux2Var.W(1355797012);
                        vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                        ux2Var.p(false);
                        j56VarR = ux2Var.r();
                        if (j56VarR == null) {
                            return;
                        }
                        final byte b18 = 1;
                        final Function0 function114 = function4;
                        hw2Var = new hw2() { // from class: o.ts1
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                byte b19 = b18;
                                f88 f88Var = f88.a;
                                int i12 = i;
                                switch (b19) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iY = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function114, function9, (ux2) obj, iY, i2);
                                        break;
                                    case 1:
                                        ((Integer) obj2).getClass();
                                        int iY2 = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function114, function9, (ux2) obj, iY2, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iY3 = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function114, function9, (ux2) obj, iY3, i2);
                                        break;
                                }
                                return f88Var;
                            }
                        };
                    } else {
                        fs4 fs4Var14 = fs4Var4;
                        function11 = function4;
                        ux2Var.W(1355879658);
                        ux2Var.p(false);
                        if (z14) {
                            strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                        } else {
                            strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                        }
                        kw0 kw0VarA10 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                        i10 = i3;
                        int iHashCode10 = Long.hashCode(ux2Var.T);
                        yj5 yj5VarL10 = ux2Var.l();
                        fs4 fs4VarS10 = uf0.s(ux2Var, fs4Var14);
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(kw0VarA10, d82.v, ux2Var);
                        o67.n(yj5VarL10, d82.u, ux2Var);
                        o67.n(Integer.valueOf(iHashCode10), d82.w, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS10, d82.t, ux2Var);
                        lv1.A(0, strM, ux2Var, null);
                        if (z14) {
                            ux2Var.W(2045265100);
                            fs4 fs4VarJ118 = iq8.j(cs4Var, sf6.a(8.0f));
                            sk7 sk7Var118 = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                            if ((57344 & i10) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objK3 = ux2Var.K();
                            if (z13) {
                                objK3 = new a9(function11, (byte) 23);
                                ux2Var.g0(objK3);
                            } else {
                                objK3 = new a9(function11, (byte) 23);
                                ux2Var.g0(objK3);
                            }
                            x37.e(sk7Var118, fs4VarJ118, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                            ux2Var.p(false);
                            z10 = true;
                            function12 = function9;
                        } else {
                            ux2Var.W(2047427443);
                            if (z8) {
                                ux2Var.W(2047435472);
                                fs4 fs4VarJ119 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var119 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                                if ((i10 & 7168) == 2048) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                objK2 = ux2Var.K();
                                if (z12) {
                                    objK2 = new a9(function10, (byte) 24);
                                    ux2Var.g0(objK2);
                                } else {
                                    objK2 = new a9(function10, (byte) 24);
                                    ux2Var.g0(objK2);
                                }
                                z9 = false;
                                function12 = function9;
                                x37.e(sk7Var119, fs4VarJ119, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                                ux2Var.p(false);
                            } else {
                                z9 = false;
                                function12 = function9;
                                ux2Var.W(2049144564);
                                ux2Var.p(false);
                            }
                            if (z7) {
                                ux2Var.W(2049246833);
                                fs4 fs4VarJ1110 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var1110 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                                if ((i10 & 458752) == 131072) {
                                    z11 = true;
                                } else {
                                    z11 = z9;
                                }
                                objK = ux2Var.K();
                                if (z11) {
                                    objK = new a9(function12, (byte) 25);
                                    ux2Var.g0(objK);
                                } else {
                                    objK = new a9(function12, (byte) 25);
                                    ux2Var.g0(objK);
                                }
                                x37.e(sk7Var1110, fs4VarJ1110, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                                ux2Var.p(z9);
                            } else {
                                ux2Var.W(2050801204);
                                ux2Var.p(z9);
                            }
                            ux2Var.p(z9);
                            z10 = true;
                        }
                        ux2Var.p(z10);
                        function5 = function12;
                        fs4Var3 = fs4Var14;
                        function6 = function10;
                        function7 = function11;
                    }
                } else {
                    z8 = z6;
                    function10 = function8;
                    if (z5) {
                        ux2Var.W(1355797012);
                        vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                        ux2Var.p(false);
                        j56VarR = ux2Var.r();
                        if (j56VarR == null) {
                            return;
                        }
                        final byte b19 = 1;
                        final Function0 function115 = function4;
                        hw2Var = new hw2() { // from class: o.ts1
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                byte b110 = b19;
                                f88 f88Var = f88.a;
                                int i12 = i;
                                switch (b110) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iY = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function115, function9, (ux2) obj, iY, i2);
                                        break;
                                    case 1:
                                        ((Integer) obj2).getClass();
                                        int iY2 = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function115, function9, (ux2) obj, iY2, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iY3 = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function115, function9, (ux2) obj, iY3, i2);
                                        break;
                                }
                                return f88Var;
                            }
                        };
                    } else {
                        fs4 fs4Var15 = fs4Var4;
                        function11 = function4;
                        ux2Var.W(1355879658);
                        ux2Var.p(false);
                        if (z14) {
                            strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                        } else {
                            strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                        }
                        kw0 kw0VarA11 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                        i10 = i3;
                        int iHashCode11 = Long.hashCode(ux2Var.T);
                        yj5 yj5VarL11 = ux2Var.l();
                        fs4 fs4VarS11 = uf0.s(ux2Var, fs4Var15);
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(kw0VarA11, d82.v, ux2Var);
                        o67.n(yj5VarL11, d82.u, ux2Var);
                        o67.n(Integer.valueOf(iHashCode11), d82.w, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS11, d82.t, ux2Var);
                        lv1.A(0, strM, ux2Var, null);
                        if (z14) {
                            ux2Var.W(2045265100);
                            fs4 fs4VarJ1111 = iq8.j(cs4Var, sf6.a(8.0f));
                            sk7 sk7Var1111 = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                            if ((57344 & i10) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objK3 = ux2Var.K();
                            if (z13) {
                                objK3 = new a9(function11, (byte) 23);
                                ux2Var.g0(objK3);
                            } else {
                                objK3 = new a9(function11, (byte) 23);
                                ux2Var.g0(objK3);
                            }
                            x37.e(sk7Var1111, fs4VarJ1111, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                            ux2Var.p(false);
                            z10 = true;
                            function12 = function9;
                        } else {
                            ux2Var.W(2047427443);
                            if (z8) {
                                ux2Var.W(2047435472);
                                fs4 fs4VarJ1112 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var1112 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                                if ((i10 & 7168) == 2048) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                objK2 = ux2Var.K();
                                if (z12) {
                                    objK2 = new a9(function10, (byte) 24);
                                    ux2Var.g0(objK2);
                                } else {
                                    objK2 = new a9(function10, (byte) 24);
                                    ux2Var.g0(objK2);
                                }
                                z9 = false;
                                function12 = function9;
                                x37.e(sk7Var1112, fs4VarJ1112, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                                ux2Var.p(false);
                            } else {
                                z9 = false;
                                function12 = function9;
                                ux2Var.W(2049144564);
                                ux2Var.p(false);
                            }
                            if (z7) {
                                ux2Var.W(2049246833);
                                fs4 fs4VarJ1113 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var1113 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                                if ((i10 & 458752) == 131072) {
                                    z11 = true;
                                } else {
                                    z11 = z9;
                                }
                                objK = ux2Var.K();
                                if (z11) {
                                    objK = new a9(function12, (byte) 25);
                                    ux2Var.g0(objK);
                                } else {
                                    objK = new a9(function12, (byte) 25);
                                    ux2Var.g0(objK);
                                }
                                x37.e(sk7Var1113, fs4VarJ1113, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                                ux2Var.p(z9);
                            } else {
                                ux2Var.W(2050801204);
                                ux2Var.p(z9);
                            }
                            ux2Var.p(z9);
                            z10 = true;
                        }
                        ux2Var.p(z10);
                        function5 = function12;
                        fs4Var3 = fs4Var15;
                        function6 = function10;
                        function7 = function11;
                    }
                }
                j56VarR.d = hw2Var;
            }
            ux2Var.Q();
            function5 = function2;
            fs4Var3 = fs4Var2;
            function6 = function3;
            function7 = function4;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                final byte b110 = 2;
                hw2Var = new hw2() { // from class: o.ts1
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b111 = b110;
                        f88 f88Var = f88.a;
                        int i12 = i;
                        switch (b111) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iY = yo1.Y(i12 | 1);
                                us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY, i2);
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                int iY2 = yo1.Y(i12 | 1);
                                us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY2, i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iY3 = yo1.Y(i12 | 1);
                                us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY3, i2);
                                break;
                        }
                        return f88Var;
                    }
                };
                j56VarR.d = hw2Var;
            }
        }
        i3 |= 3072;
        function3 = function0;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                function4 = function1;
                if (ux2Var.h(function4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (ux2Var.h(function2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            b = 1;
            if ((i3 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i3 & 1, z)) {
                cs4Var = cs4.b;
                if (i11 != 0) {
                    fs4Var4 = cs4Var;
                } else {
                    fs4Var4 = fs4Var2;
                }
                awVar = e01.a;
                if (i4 != 0) {
                    objK6 = ux2Var.K();
                    if (objK6 == awVar) {
                        objK6 = new vr1(b);
                        ux2Var.g0(objK6);
                    }
                    function8 = (Function0) objK6;
                } else {
                    function8 = function3;
                }
                if (i6 != 0) {
                    objK5 = ux2Var.K();
                    if (objK5 == awVar) {
                        objK5 = new vr1(b2);
                        ux2Var.g0(objK5);
                    }
                    function4 = (Function0) objK5;
                }
                if (i8 != 0) {
                    objK4 = ux2Var.K();
                    if (objK4 == awVar) {
                        objK4 = new vr1((byte) 3);
                        ux2Var.g0(objK4);
                    }
                    function9 = (Function0) objK4;
                    z2 = true;
                } else {
                    z2 = true;
                    function9 = function2;
                }
                Set set7 = wt1Var.c;
                js1Var = ns1Var.u;
                if (js1Var != js1.n) {
                    z3 = z2;
                } else {
                    z3 = z2;
                }
                if (ns1Var.c == ls1.n) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (wt1Var.d) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                if (z3) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (z3) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (z5) {
                    z8 = z6;
                    function10 = function8;
                    if (z5) {
                        ux2Var.W(1355797012);
                        vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                        ux2Var.p(false);
                        j56VarR = ux2Var.r();
                        if (j56VarR == null) {
                            return;
                        }
                        final byte b111 = 1;
                        final Function0 function116 = function4;
                        hw2Var = new hw2() { // from class: o.ts1
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                byte b112 = b111;
                                f88 f88Var = f88.a;
                                int i12 = i;
                                switch (b112) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iY = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function116, function9, (ux2) obj, iY, i2);
                                        break;
                                    case 1:
                                        ((Integer) obj2).getClass();
                                        int iY2 = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function116, function9, (ux2) obj, iY2, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iY3 = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function116, function9, (ux2) obj, iY3, i2);
                                        break;
                                }
                                return f88Var;
                            }
                        };
                    } else {
                        fs4 fs4Var16 = fs4Var4;
                        function11 = function4;
                        ux2Var.W(1355879658);
                        ux2Var.p(false);
                        if (z14) {
                            strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                        } else {
                            strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                        }
                        kw0 kw0VarA12 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                        i10 = i3;
                        int iHashCode12 = Long.hashCode(ux2Var.T);
                        yj5 yj5VarL12 = ux2Var.l();
                        fs4 fs4VarS12 = uf0.s(ux2Var, fs4Var16);
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(kw0VarA12, d82.v, ux2Var);
                        o67.n(yj5VarL12, d82.u, ux2Var);
                        o67.n(Integer.valueOf(iHashCode12), d82.w, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS12, d82.t, ux2Var);
                        lv1.A(0, strM, ux2Var, null);
                        if (z14) {
                            ux2Var.W(2045265100);
                            fs4 fs4VarJ1114 = iq8.j(cs4Var, sf6.a(8.0f));
                            sk7 sk7Var1114 = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                            if ((57344 & i10) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objK3 = ux2Var.K();
                            if (z13) {
                                objK3 = new a9(function11, (byte) 23);
                                ux2Var.g0(objK3);
                            } else {
                                objK3 = new a9(function11, (byte) 23);
                                ux2Var.g0(objK3);
                            }
                            x37.e(sk7Var1114, fs4VarJ1114, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                            ux2Var.p(false);
                            z10 = true;
                            function12 = function9;
                        } else {
                            ux2Var.W(2047427443);
                            if (z8) {
                                ux2Var.W(2047435472);
                                fs4 fs4VarJ1115 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var1115 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                                if ((i10 & 7168) == 2048) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                objK2 = ux2Var.K();
                                if (z12) {
                                    objK2 = new a9(function10, (byte) 24);
                                    ux2Var.g0(objK2);
                                } else {
                                    objK2 = new a9(function10, (byte) 24);
                                    ux2Var.g0(objK2);
                                }
                                z9 = false;
                                function12 = function9;
                                x37.e(sk7Var1115, fs4VarJ1115, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                                ux2Var.p(false);
                            } else {
                                z9 = false;
                                function12 = function9;
                                ux2Var.W(2049144564);
                                ux2Var.p(false);
                            }
                            if (z7) {
                                ux2Var.W(2049246833);
                                fs4 fs4VarJ1116 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var1116 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                                if ((i10 & 458752) == 131072) {
                                    z11 = true;
                                } else {
                                    z11 = z9;
                                }
                                objK = ux2Var.K();
                                if (z11) {
                                    objK = new a9(function12, (byte) 25);
                                    ux2Var.g0(objK);
                                } else {
                                    objK = new a9(function12, (byte) 25);
                                    ux2Var.g0(objK);
                                }
                                x37.e(sk7Var1116, fs4VarJ1116, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                                ux2Var.p(z9);
                            } else {
                                ux2Var.W(2050801204);
                                ux2Var.p(z9);
                            }
                            ux2Var.p(z9);
                            z10 = true;
                        }
                        ux2Var.p(z10);
                        function5 = function12;
                        fs4Var3 = fs4Var16;
                        function6 = function10;
                        function7 = function11;
                    }
                } else {
                    z8 = z6;
                    function10 = function8;
                    if (z5) {
                        ux2Var.W(1355797012);
                        vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                        ux2Var.p(false);
                        j56VarR = ux2Var.r();
                        if (j56VarR == null) {
                            return;
                        }
                        final byte b112 = 1;
                        final Function0 function117 = function4;
                        hw2Var = new hw2() { // from class: o.ts1
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                byte b113 = b112;
                                f88 f88Var = f88.a;
                                int i12 = i;
                                switch (b113) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iY = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function117, function9, (ux2) obj, iY, i2);
                                        break;
                                    case 1:
                                        ((Integer) obj2).getClass();
                                        int iY2 = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function117, function9, (ux2) obj, iY2, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iY3 = yo1.Y(i12 | 1);
                                        us1.b(wt1Var, ns1Var, fs4Var4, function10, function117, function9, (ux2) obj, iY3, i2);
                                        break;
                                }
                                return f88Var;
                            }
                        };
                    } else {
                        fs4 fs4Var17 = fs4Var4;
                        function11 = function4;
                        ux2Var.W(1355879658);
                        ux2Var.p(false);
                        if (z14) {
                            strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                        } else {
                            strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                        }
                        kw0 kw0VarA13 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                        i10 = i3;
                        int iHashCode13 = Long.hashCode(ux2Var.T);
                        yj5 yj5VarL13 = ux2Var.l();
                        fs4 fs4VarS13 = uf0.s(ux2Var, fs4Var17);
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(kw0VarA13, d82.v, ux2Var);
                        o67.n(yj5VarL13, d82.u, ux2Var);
                        o67.n(Integer.valueOf(iHashCode13), d82.w, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS13, d82.t, ux2Var);
                        lv1.A(0, strM, ux2Var, null);
                        if (z14) {
                            ux2Var.W(2045265100);
                            fs4 fs4VarJ1117 = iq8.j(cs4Var, sf6.a(8.0f));
                            sk7 sk7Var1117 = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                            if ((57344 & i10) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objK3 = ux2Var.K();
                            if (z13) {
                                objK3 = new a9(function11, (byte) 23);
                                ux2Var.g0(objK3);
                            } else {
                                objK3 = new a9(function11, (byte) 23);
                                ux2Var.g0(objK3);
                            }
                            x37.e(sk7Var1117, fs4VarJ1117, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                            ux2Var.p(false);
                            z10 = true;
                            function12 = function9;
                        } else {
                            ux2Var.W(2047427443);
                            if (z8) {
                                ux2Var.W(2047435472);
                                fs4 fs4VarJ1118 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var1118 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                                if ((i10 & 7168) == 2048) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                objK2 = ux2Var.K();
                                if (z12) {
                                    objK2 = new a9(function10, (byte) 24);
                                    ux2Var.g0(objK2);
                                } else {
                                    objK2 = new a9(function10, (byte) 24);
                                    ux2Var.g0(objK2);
                                }
                                z9 = false;
                                function12 = function9;
                                x37.e(sk7Var1118, fs4VarJ1118, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                                ux2Var.p(false);
                            } else {
                                z9 = false;
                                function12 = function9;
                                ux2Var.W(2049144564);
                                ux2Var.p(false);
                            }
                            if (z7) {
                                ux2Var.W(2049246833);
                                fs4 fs4VarJ1119 = iq8.j(cs4Var, sf6.a(8.0f));
                                sk7 sk7Var1119 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                                if ((i10 & 458752) == 131072) {
                                    z11 = true;
                                } else {
                                    z11 = z9;
                                }
                                objK = ux2Var.K();
                                if (z11) {
                                    objK = new a9(function12, (byte) 25);
                                    ux2Var.g0(objK);
                                } else {
                                    objK = new a9(function12, (byte) 25);
                                    ux2Var.g0(objK);
                                }
                                x37.e(sk7Var1119, fs4VarJ1119, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                                ux2Var.p(z9);
                            } else {
                                ux2Var.W(2050801204);
                                ux2Var.p(z9);
                            }
                            ux2Var.p(z9);
                            z10 = true;
                        }
                        ux2Var.p(z10);
                        function5 = function12;
                        fs4Var3 = fs4Var17;
                        function6 = function10;
                        function7 = function11;
                    }
                }
                j56VarR.d = hw2Var;
            }
            ux2Var.Q();
            function5 = function2;
            fs4Var3 = fs4Var2;
            function6 = function3;
            function7 = function4;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                final byte b113 = 2;
                hw2Var = new hw2() { // from class: o.ts1
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b114 = b113;
                        f88 f88Var = f88.a;
                        int i12 = i;
                        switch (b114) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iY = yo1.Y(i12 | 1);
                                us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY, i2);
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                int iY2 = yo1.Y(i12 | 1);
                                us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY2, i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iY3 = yo1.Y(i12 | 1);
                                us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY3, i2);
                                break;
                        }
                        return f88Var;
                    }
                };
                j56VarR.d = hw2Var;
            }
        }
        i3 |= 24576;
        function4 = function1;
        i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (ux2Var.h(function2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        b = 1;
        if ((i3 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i3 & 1, z)) {
            cs4Var = cs4.b;
            if (i11 != 0) {
                fs4Var4 = cs4Var;
            } else {
                fs4Var4 = fs4Var2;
            }
            awVar = e01.a;
            if (i4 != 0) {
                objK6 = ux2Var.K();
                if (objK6 == awVar) {
                    objK6 = new vr1(b);
                    ux2Var.g0(objK6);
                }
                function8 = (Function0) objK6;
            } else {
                function8 = function3;
            }
            if (i6 != 0) {
                objK5 = ux2Var.K();
                if (objK5 == awVar) {
                    objK5 = new vr1(b2);
                    ux2Var.g0(objK5);
                }
                function4 = (Function0) objK5;
            }
            if (i8 != 0) {
                objK4 = ux2Var.K();
                if (objK4 == awVar) {
                    objK4 = new vr1((byte) 3);
                    ux2Var.g0(objK4);
                }
                function9 = (Function0) objK4;
                z2 = true;
            } else {
                z2 = true;
                function9 = function2;
            }
            Set set8 = wt1Var.c;
            js1Var = ns1Var.u;
            if (js1Var != js1.n) {
                z3 = z2;
            } else {
                z3 = z2;
            }
            if (ns1Var.c == ls1.n) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (wt1Var.d) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (z3) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (z3) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z5) {
                z8 = z6;
                function10 = function8;
                if (z5) {
                    ux2Var.W(1355797012);
                    vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                    ux2Var.p(false);
                    j56VarR = ux2Var.r();
                    if (j56VarR == null) {
                        return;
                    }
                    final byte b114 = 1;
                    final Function0 function118 = function4;
                    hw2Var = new hw2() { // from class: o.ts1
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b115 = b114;
                            f88 f88Var = f88.a;
                            int i12 = i;
                            switch (b115) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var4, function10, function118, function9, (ux2) obj, iY, i2);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int iY2 = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var4, function10, function118, function9, (ux2) obj, iY2, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY3 = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var4, function10, function118, function9, (ux2) obj, iY3, i2);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                } else {
                    fs4 fs4Var18 = fs4Var4;
                    function11 = function4;
                    ux2Var.W(1355879658);
                    ux2Var.p(false);
                    if (z14) {
                        strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                    } else {
                        strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                    }
                    kw0 kw0VarA14 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                    i10 = i3;
                    int iHashCode14 = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL14 = ux2Var.l();
                    fs4 fs4VarS14 = uf0.s(ux2Var, fs4Var18);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(kw0VarA14, d82.v, ux2Var);
                    o67.n(yj5VarL14, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode14), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS14, d82.t, ux2Var);
                    lv1.A(0, strM, ux2Var, null);
                    if (z14) {
                        ux2Var.W(2045265100);
                        fs4 fs4VarJ11110 = iq8.j(cs4Var, sf6.a(8.0f));
                        sk7 sk7Var11110 = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                        if ((57344 & i10) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objK3 = ux2Var.K();
                        if (z13) {
                            objK3 = new a9(function11, (byte) 23);
                            ux2Var.g0(objK3);
                        } else {
                            objK3 = new a9(function11, (byte) 23);
                            ux2Var.g0(objK3);
                        }
                        x37.e(sk7Var11110, fs4VarJ11110, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                        ux2Var.p(false);
                        z10 = true;
                        function12 = function9;
                    } else {
                        ux2Var.W(2047427443);
                        if (z8) {
                            ux2Var.W(2047435472);
                            fs4 fs4VarJ11111 = iq8.j(cs4Var, sf6.a(8.0f));
                            sk7 sk7Var11111 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                            if ((i10 & 7168) == 2048) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objK2 = ux2Var.K();
                            if (z12) {
                                objK2 = new a9(function10, (byte) 24);
                                ux2Var.g0(objK2);
                            } else {
                                objK2 = new a9(function10, (byte) 24);
                                ux2Var.g0(objK2);
                            }
                            z9 = false;
                            function12 = function9;
                            x37.e(sk7Var11111, fs4VarJ11111, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                            ux2Var.p(false);
                        } else {
                            z9 = false;
                            function12 = function9;
                            ux2Var.W(2049144564);
                            ux2Var.p(false);
                        }
                        if (z7) {
                            ux2Var.W(2049246833);
                            fs4 fs4VarJ11112 = iq8.j(cs4Var, sf6.a(8.0f));
                            sk7 sk7Var11112 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                            if ((i10 & 458752) == 131072) {
                                z11 = true;
                            } else {
                                z11 = z9;
                            }
                            objK = ux2Var.K();
                            if (z11) {
                                objK = new a9(function12, (byte) 25);
                                ux2Var.g0(objK);
                            } else {
                                objK = new a9(function12, (byte) 25);
                                ux2Var.g0(objK);
                            }
                            x37.e(sk7Var11112, fs4VarJ11112, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                            ux2Var.p(z9);
                        } else {
                            ux2Var.W(2050801204);
                            ux2Var.p(z9);
                        }
                        ux2Var.p(z9);
                        z10 = true;
                    }
                    ux2Var.p(z10);
                    function5 = function12;
                    fs4Var3 = fs4Var18;
                    function6 = function10;
                    function7 = function11;
                }
            } else {
                z8 = z6;
                function10 = function8;
                if (z5) {
                    ux2Var.W(1355797012);
                    vs1.b(fs4Var4, ux2Var, (i3 >> 6) & 14);
                    ux2Var.p(false);
                    j56VarR = ux2Var.r();
                    if (j56VarR == null) {
                        return;
                    }
                    final byte b115 = 1;
                    final Function0 function119 = function4;
                    hw2Var = new hw2() { // from class: o.ts1
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b116 = b115;
                            f88 f88Var = f88.a;
                            int i12 = i;
                            switch (b116) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var4, function10, function119, function9, (ux2) obj, iY, i2);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int iY2 = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var4, function10, function119, function9, (ux2) obj, iY2, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY3 = yo1.Y(i12 | 1);
                                    us1.b(wt1Var, ns1Var, fs4Var4, function10, function119, function9, (ux2) obj, iY3, i2);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                } else {
                    fs4 fs4Var19 = fs4Var4;
                    function11 = function4;
                    ux2Var.W(1355879658);
                    ux2Var.p(false);
                    if (z14) {
                        strM = to7.m(ux2Var, 1355941007, R.string.device_tab_device_details_connection_methods_title, ux2Var, false);
                    } else {
                        strM = to7.m(ux2Var, 1356036611, R.string.other_connection_methods_title, ux2Var, false);
                    }
                    kw0 kw0VarA15 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                    i10 = i3;
                    int iHashCode15 = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL15 = ux2Var.l();
                    fs4 fs4VarS15 = uf0.s(ux2Var, fs4Var19);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(kw0VarA15, d82.v, ux2Var);
                    o67.n(yj5VarL15, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode15), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS15, d82.t, ux2Var);
                    lv1.A(0, strM, ux2Var, null);
                    if (z14) {
                        ux2Var.W(2045265100);
                        fs4 fs4VarJ11113 = iq8.j(cs4Var, sf6.a(8.0f));
                        sk7 sk7Var11113 = new sk7(y57.g(R.string.device_tab_device_details_idle_device_title), y57.g(R.string.device_tab_device_details_idle_device_subtitle), null, au8.O(605109412, new t0(wt1Var, (byte) 19), ux2Var), 4);
                        if ((57344 & i10) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objK3 = ux2Var.K();
                        if (z13) {
                            objK3 = new a9(function11, (byte) 23);
                            ux2Var.g0(objK3);
                        } else {
                            objK3 = new a9(function11, (byte) 23);
                            ux2Var.g0(objK3);
                        }
                        x37.e(sk7Var11113, fs4VarJ11113, null, (Function0) objK3, "TVTA-devicesScreen-deviceInfoScreen-idleDevice", ux2Var, 24576, 36);
                        ux2Var.p(false);
                        z10 = true;
                        function12 = function9;
                    } else {
                        ux2Var.W(2047427443);
                        if (z8) {
                            ux2Var.W(2047435472);
                            fs4 fs4VarJ11114 = iq8.j(cs4Var, sf6.a(8.0f));
                            sk7 sk7Var11114 = new sk7(y57.g(R.string.device_tab_device_details_prompt_action_title), y57.g(R.string.device_tab_device_details_prompt_action_subtitle), null, qf0.d, 4);
                            if ((i10 & 7168) == 2048) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objK2 = ux2Var.K();
                            if (z12) {
                                objK2 = new a9(function10, (byte) 24);
                                ux2Var.g0(objK2);
                            } else {
                                objK2 = new a9(function10, (byte) 24);
                                ux2Var.g0(objK2);
                            }
                            z9 = false;
                            function12 = function9;
                            x37.e(sk7Var11114, fs4VarJ11114, null, (Function0) objK2, "TVTA-devicesScreen-deviceInfoScreen-promptForConfirmationAction", ux2Var, 24576, 36);
                            ux2Var.p(false);
                        } else {
                            z9 = false;
                            function12 = function9;
                            ux2Var.W(2049144564);
                            ux2Var.p(false);
                        }
                        if (z7) {
                            ux2Var.W(2049246833);
                            fs4 fs4VarJ11115 = iq8.j(cs4Var, sf6.a(8.0f));
                            sk7 sk7Var11115 = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, qf0.e, 4);
                            if ((i10 & 458752) == 131072) {
                                z11 = true;
                            } else {
                                z11 = z9;
                            }
                            objK = ux2Var.K();
                            if (z11) {
                                objK = new a9(function12, (byte) 25);
                                ux2Var.g0(objK);
                            } else {
                                objK = new a9(function12, (byte) 25);
                                ux2Var.g0(objK);
                            }
                            x37.e(sk7Var11115, fs4VarJ11115, null, (Function0) objK, "TVTA-devicesScreen-deviceInfoScreen-transferFileAction", ux2Var, 24576, 36);
                            ux2Var.p(z9);
                        } else {
                            ux2Var.W(2050801204);
                            ux2Var.p(z9);
                        }
                        ux2Var.p(z9);
                        z10 = true;
                    }
                    ux2Var.p(z10);
                    function5 = function12;
                    fs4Var3 = fs4Var19;
                    function6 = function10;
                    function7 = function11;
                }
            }
            j56VarR.d = hw2Var;
        }
        ux2Var.Q();
        function5 = function2;
        fs4Var3 = fs4Var2;
        function6 = function3;
        function7 = function4;
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            final byte b116 = 2;
            hw2Var = new hw2() { // from class: o.ts1
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    byte b117 = b116;
                    f88 f88Var = f88.a;
                    int i12 = i;
                    switch (b117) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iY = yo1.Y(i12 | 1);
                            us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY, i2);
                            break;
                        case 1:
                            ((Integer) obj2).getClass();
                            int iY2 = yo1.Y(i12 | 1);
                            us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY2, i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iY3 = yo1.Y(i12 | 1);
                            us1.b(wt1Var, ns1Var, fs4Var3, function6, function7, function5, (ux2) obj, iY3, i2);
                            break;
                    }
                    return f88Var;
                }
            };
            j56VarR.d = hw2Var;
        }
    }

    public static final void c(String str, Function1 function1, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        str.getClass();
        ux2Var2.Y(-836769660);
        int i2 = i | (ux2Var2.f(str) ? 4 : 2) | (ux2Var2.h(function1) ? 32 : 16) | (ux2Var2.h(function0) ? 256 : 128) | 3072;
        byte b = 0;
        byte b2 = 1;
        if (ux2Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new sq2();
                ux2Var2.g0(objK);
            }
            sq2 sq2Var = (sq2) objK;
            Object[] objArr = new Object[0];
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objK2 = ux2Var2.K();
            if (z || objK2 == awVar) {
                objK2 = new lz1(str, b);
                ux2Var2.g0(objK2);
            }
            px4 px4VarN = zu1.N(objArr, zr7.d, (Function0) objK2, ux2Var2);
            boolean zF = (i3 == 4) | ux2Var2.f(px4VarN);
            Object objK3 = ux2Var2.K();
            hc1 hc1Var = null;
            if (zF || objK3 == awVar) {
                objK3 = new kq1(str, px4VarN, hc1Var, b2);
                ux2Var2.g0(objK3);
            }
            ck3.i(str, (hw2) objK3, ux2Var2);
            Object objK4 = ux2Var2.K();
            if (objK4 == awVar) {
                objK4 = new z9(sq2Var, hc1Var, b2);
                ux2Var2.g0(objK4);
            }
            ck3.i(f88.a, (hw2) objK4, ux2Var2);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarC);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z2 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
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
            fs4 fs4VarC2 = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarC2);
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
            ud5 ud5VarT = lv1.T(R.drawable.ic_arrow_back, ux2Var2, 0);
            String strZ = m77.z(R.string.navigation_back_content_description, ux2Var2);
            h72 h72Var = un4.a;
            td3.b(ud5VarT, strZ, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(ka0.B(androidx.compose.foundation.b.b(iq8.j(ka0.F(cs4Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), sf6.a), false, null, null, function0, 15), 8.0f), 24.0f), "TVTA-devicesScreen-searchBack"), ((rn4) ux2Var2.j(h72Var)).a.s, ux2Var2, 8, 0);
            zr7 zr7Var = (zr7) px4VarN.getValue();
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(uf0.n(cs4Var, sq2Var).f(new s14(1.0f, true)), "TVTA-devicesScreen-searchField");
            long j = rv0.g;
            cq7 cq7VarD = jk0.d(j, j, j, j, j, ux2Var);
            yx3 yx3Var = new yx3(0, 3, 119);
            xx3 xx3Var = new xx3(null, 63);
            boolean zF2 = ux2Var.f(px4VarN) | ((i2 & 112) == 32);
            Object objK5 = ux2Var.K();
            if (zF2 || objK5 == awVar) {
                objK5 = new g70(function1, px4VarN, (byte) 4);
                ux2Var.g0(objK5);
            }
            o77.c(zr7Var, (Function1) objK5, fs4VarA, false, null, j51.h, au8.O(-1655735529, new c9((Object) str, (Object) function1, (byte) 20), ux2Var), null, yx3Var, xx3Var, true, 0, 0, null, cq7VarD, ux2Var, 817889280);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            lv1.k(null, 0.0f, ((rn4) ux2Var2.j(h72Var)).a.B, ux2Var2, 0, 3);
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new mz1(str, function1, function0, fs4Var2, i, (byte) 0);
        }
    }

    public static final void d(int i, String str, ux2 ux2Var, fs4 fs4Var) {
        ux2 ux2Var2;
        k72 k72VarH;
        px4 px4Var;
        ux2Var.Y(645909190);
        int i2 = i | 54;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            we8 we8VarA = id4.a(ux2Var);
            if (we8VarA != null) {
                c36 c36Var = zu1.c;
                if (c36Var == null) {
                    hk0.g("Required value was null.");
                    return;
                }
                k72VarH = c36Var.h(we8VarA);
            } else {
                k72VarH = null;
            }
            nw4 nw4Var = k72VarH != null ? k72VarH.f1234o : null;
            if (nw4Var == null) {
                ux2Var.W(827534955);
                ux2Var.p(false);
                px4Var = null;
            } else {
                ux2Var.W(-2051515306);
                Object value = nw4Var.getValue();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) ux2Var.j(dd4.a);
                Object objK = ux2Var.K();
                aw awVar = e01.a;
                if (objK == awVar) {
                    if (nw4Var.isInitialized()) {
                        value = nw4Var.getValue();
                    }
                    objK = h57.p(value);
                    ux2Var.g0(objK);
                }
                px4Var = (px4) objK;
                boolean zH = ux2Var.h(nw4Var) | ux2Var.h(lifecycleOwner);
                Object objK2 = ux2Var.K();
                if (zH || objK2 == awVar) {
                    objK2 = new m5((Object) nw4Var, (Object) lifecycleOwner, (Object) px4Var, (byte) 26);
                    ux2Var.g0(objK2);
                }
                ck3.d(nw4Var, lifecycleOwner, (Function1) objK2, ux2Var);
                ux2Var.p(false);
            }
            String str2 = px4Var != null ? (String) px4Var.getValue() : null;
            sk7 sk7Var = new sk7(y57.g(R.string.tv_teamViewerIDHint), str2 != null ? new n78(str2) : null, new yk7(R.drawable.id_password), null, 8);
            cs4 cs4Var = cs4.b;
            ux2Var2 = ux2Var;
            x37.e(sk7Var, cs4Var, null, null, "TVTA-settings-tvId", ux2Var2, 24624, 44);
            fs4Var = cs4Var;
            str = "TVTA-settings-tvId";
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new gx0(i, str, fs4Var);
        }
    }

    public static final void e(i13 i13Var, Function1 function1, Function0 function0, Function0 function2, Function0 function3, ux2 ux2Var, int i) {
        i13Var.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        function3.getClass();
        ux2Var.Y(835965119);
        int i2 = (ux2Var.f(i13Var) ? 4 : 2) | i | (ux2Var.h(function1) ? 32 : 16) | (ux2Var.h(function0) ? 256 : 128) | (ux2Var.h(function2) ? 2048 : 1024) | (ux2Var.h(function3) ? 16384 : 8192);
        if (!ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            ux2Var.Q();
        } else if (i13Var instanceof h13) {
            ux2Var.W(2016759651);
            ep1.i(((h13) i13Var).b, function1, function0, function3, ux2Var, (i2 & 1008) | ((i2 >> 3) & 7168));
            ux2Var.p(false);
        } else if (i13Var instanceof e13) {
            ux2Var.W(2017052632);
            pm8.f(((e13) i13Var).b, function2, function3, ux2Var, (i2 >> 6) & 1008);
            ux2Var.p(false);
        } else {
            if (!(i13Var instanceof f13) && !i13Var.equals(g13.a)) {
                throw fx3.m(203602373, ux2Var, false);
            }
            ux2Var.W(2017319201);
            ux2Var.p(false);
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new o31((Object) i13Var, (Object) function1, (Object) function0, (Object) function2, (Object) function3, i, (byte) 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.text.Spanned] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.text.Spanned, java.lang.CharSequence] */
    public static final void f(j74 j74Var, qk1 qk1Var, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        ux2 ux2Var2;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        Object obj;
        String url;
        nr2 nr2Var;
        wy2 wy2Var;
        c77 c77Var;
        int i5;
        ux2Var.Y(-2085809231);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(j74Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(qk1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        boolean z3 = false;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean z4 = (i2 & 14) == 4;
            Object objK = ux2Var.K();
            if (z4 || objK == e01.a) {
                String strT0 = lv0.t0(j74Var.i, "<br /><br /><br /><br />", null, null, new h31((byte) 29), 30);
                if (strT0.length() <= 0) {
                    strT0 = null;
                }
                if (strT0 != null) {
                    int i6 = xo.q;
                    ?? FromHtml = Html.fromHtml("<ContentHandlerReplacementTag />".concat(strT0), 63, null, e8.f690o);
                    vo voVar = new vo(FromHtml.length());
                    boolean z5 = FromHtml instanceof xo;
                    ?? r15 = voVar.m;
                    if (z5) {
                        voVar.c((xo) FromHtml);
                    } else {
                        r15.append(FromHtml);
                    }
                    Object[] spans = FromHtml.getSpans(0, r15.length(), Object.class);
                    int length = spans.length;
                    int i7 = 0;
                    ?? r6 = FromHtml;
                    while (i7 < length) {
                        Object obj2 = spans[i7];
                        long jA = h57.a(r6.getSpanStart(obj2), r6.getSpanEnd(obj2));
                        int i8 = gt7.c;
                        ?? r13 = r6;
                        int i9 = (int) (jA >> 32);
                        int i10 = (int) (jA & 4294967295L);
                        if (obj2 instanceof AbsoluteSizeSpan) {
                            i4 = i2;
                            obj = null;
                            z2 = false;
                        } else {
                            boolean z6 = obj2 instanceof AlignmentSpan;
                            ArrayList arrayList = voVar.f2333o;
                            if (z6) {
                                Layout.Alignment alignment = ((AlignmentSpan) obj2).getAlignment();
                                int i11 = alignment == null ? -1 : t73.a[alignment.ordinal()];
                                if (i11 == 1) {
                                    i5 = 5;
                                } else if (i11 != 2) {
                                    i5 = i11 != 3 ? 0 : 6;
                                } else {
                                    i5 = 3;
                                }
                                arrayList.add(new uo(i9, i10, 8, new gf5(i5, null, 510), null));
                            } else if (obj2 instanceof mp) {
                                mp mpVar = (mp) obj2;
                                arrayList.add(new uo(new db7(mpVar.b), i9, i10, mpVar.a));
                            } else if (obj2 instanceof BackgroundColorSpan) {
                                voVar.a(new c77(0L, 0L, null, null, null, null, null, 0L, null, null, null, j51.i(((BackgroundColorSpan) obj2).getBackgroundColor()), null, null, 63487), i9, i10);
                            } else {
                                if (obj2 instanceof lg0) {
                                    long j = kg0.d;
                                    lg0 lg0Var = (lg0) obj2;
                                    int i12 = lg0Var.b;
                                    h67.e(j);
                                    i4 = i2;
                                    long jN = h67.n(qt7.c(j) * i12, j & 1095216660480L);
                                    kg0 kg0Var = lg0Var.a;
                                    String str = null;
                                    int i13 = 8;
                                    arrayList.add(new uo(i9, i10, i13, new gf5(0, new es7(jN, jN), 503), str));
                                    arrayList.add(new uo(i9, i10, i13, kg0Var, str));
                                } else {
                                    i4 = i2;
                                    if (obj2 instanceof ForegroundColorSpan) {
                                        voVar.a(new c77(j51.i(((ForegroundColorSpan) obj2).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), i9, i10);
                                    } else if (obj2 instanceof RelativeSizeSpan) {
                                        voVar.a(new c77(0L, h67.n(((RelativeSizeSpan) obj2).getSizeChange(), 8589934592L), null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65533), i9, i10);
                                    } else if (obj2 instanceof StrikethroughSpan) {
                                        voVar.a(new c77(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, vp7.d, null, 61439), i9, i10);
                                    } else {
                                        if (obj2 instanceof StyleSpan) {
                                            int style = ((StyleSpan) obj2).getStyle();
                                            if (style == 1) {
                                                c77Var = new c77(0L, 0L, ms2.r, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531);
                                            } else if (style != 2) {
                                                c77Var = style != 3 ? null : new c77(0L, 0L, ms2.r, new ks2(1), null, null, null, 0L, null, null, null, 0L, null, null, 65523);
                                            } else {
                                                c77Var = new c77(0L, 0L, null, new ks2(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527);
                                            }
                                            if (c77Var != null) {
                                                voVar.a(c77Var, i9, i10);
                                            }
                                        } else if (obj2 instanceof SubscriptSpan) {
                                            voVar.a(new c77(0L, 0L, null, null, null, null, null, 0L, new h40(-0.5f), null, null, 0L, null, null, 65279), i9, i10);
                                        } else if (obj2 instanceof SuperscriptSpan) {
                                            voVar.a(new c77(0L, 0L, null, null, null, null, null, 0L, new h40(0.5f), null, null, 0L, null, null, 65279), i9, i10);
                                        } else {
                                            if (obj2 instanceof TypefaceSpan) {
                                                TypefaceSpan typefaceSpan = (TypefaceSpan) obj2;
                                                String family = typefaceSpan.getFamily();
                                                if (im3.n(family, "cursive")) {
                                                    wy2Var = nr2.e;
                                                } else if (im3.n(family, "monospace")) {
                                                    wy2Var = nr2.d;
                                                } else if (im3.n(family, "sans-serif")) {
                                                    wy2Var = nr2.b;
                                                } else {
                                                    if (im3.n(family, "serif")) {
                                                        wy2Var = nr2.c;
                                                    } else {
                                                        String family2 = typefaceSpan.getFamily();
                                                        if (family2 == null || family2.length() == 0) {
                                                            z2 = false;
                                                        } else {
                                                            z2 = false;
                                                            Typeface typefaceCreate = Typeface.create(family2, 0);
                                                            Typeface typeface = Typeface.DEFAULT;
                                                            if (im3.n(typefaceCreate, typeface) || im3.n(typefaceCreate, Typeface.create(typeface, 0))) {
                                                                typefaceCreate = null;
                                                            }
                                                            rc4 rc4Var = typefaceCreate != null ? new rc4(new df6((Object) typefaceCreate, (byte) 15)) : null;
                                                            nr2Var = rc4Var;
                                                        }
                                                        nr2Var = rc4Var;
                                                    }
                                                    voVar.a(new c77(0L, 0L, null, null, null, nr2Var, null, 0L, null, null, null, 0L, null, null, 65503), i9, i10);
                                                }
                                                nr2Var = wy2Var;
                                                z2 = false;
                                                voVar.a(new c77(0L, 0L, null, null, null, nr2Var, null, 0L, null, null, null, 0L, null, null, 65503), i9, i10);
                                            } else {
                                                z2 = false;
                                                if (obj2 instanceof UnderlineSpan) {
                                                    voVar.a(new c77(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, vp7.c, null, 61439), i9, i10);
                                                } else if ((obj2 instanceof URLSpan) && (url = ((URLSpan) obj2).getURL()) != null) {
                                                    obj = null;
                                                    arrayList.add(new uo(i9, i10, 8, new fa4(url, null, null), null));
                                                }
                                            }
                                            obj = null;
                                        }
                                        obj = null;
                                        z2 = false;
                                    }
                                }
                                obj = null;
                                z2 = false;
                            }
                            i4 = i2;
                            obj = null;
                            z2 = false;
                        }
                        i7++;
                        z3 = z2;
                        r6 = r13;
                        i2 = i4;
                    }
                    i3 = i2;
                    z = z3;
                    objK = voVar.g();
                } else {
                    i3 = i2;
                    z = false;
                    objK = null;
                }
                ux2Var.g0(objK);
            } else {
                i3 = i2;
                z = false;
            }
            xo xoVar = (xo) objK;
            if (xoVar != null) {
                ux2Var.W(1244339687);
                qs7.c(xoVar, fs4Var, qk1Var.c, 0L, 0L, 0L, 0, false, 0, 0, null, null, null, ux2Var, (i3 >> 3) & 112, 0, 524280);
                ux2Var2 = ux2Var;
                ux2Var2.p(z);
            } else {
                ux2Var2 = ux2Var;
                ux2Var2.W(1244472305);
                ux2Var2.p(z);
            }
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) j74Var, (Object) qk1Var, (Object) fs4Var, i, (byte) 21);
        }
    }

    public static final void g(List list, Function0 function0, fs4 fs4Var, xy6 xy6Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        xy6 xy6VarR;
        int i2;
        function0.getClass();
        ux2Var.Y(1161238380);
        int i3 = i | (ux2Var.f(list) ? 4 : 2) | (ux2Var.h(function0) ? 32 : 16) | 1408;
        byte b = 0;
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                xy6VarR = yo1.R(null, ux2Var, 6, 2);
                i2 = i3 & (-7169);
                fs4Var2 = cs4.b;
            } else {
                ux2Var.Q();
                xy6VarR = xy6Var;
                i2 = i3 & (-7169);
                fs4Var2 = fs4Var;
            }
            ux2Var.q();
            yo1.k(function0, fs4Var2, xy6VarR, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(177824842, new kt4(list, function0, b), ux2Var), ux2Var, (i2 >> 3) & 1022, 3072, 8184);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6VarR = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) list, (Object) function0, fs4Var2, (Object) xy6VarR, i, (byte) 11);
        }
    }

    public static final void h(List list, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2Var.Y(-701341111);
        int i2 = (ux2Var.f(list) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            fs4Var2 = cs4.b;
            fs4 fs4VarC = ka0.C(androidx.compose.foundation.layout.b.c(fs4Var2, 1.0f), 16.0f, 16.0f);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                objK = new o43(list, function0, (byte) 13);
                ux2Var.g0(objK);
            }
            yo1.i(0, 510, (Function1) objK, null, null, null, null, ux2Var, null, fs4VarC, null, false);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new cc1(list, function0, fs4Var2, i);
        }
    }

    public static final void i(boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        function1.getClass();
        ux2Var.Y(771441717);
        int i2 = i | (ux2Var.g(z) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | 384;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 3;
            cs4 cs4Var = cs4.b;
            l47.d(new sk7(y57.g(R.string.settings_save_passwords), y57.g(R.string.settings_save_passwords_subtitle), new yk7(R.drawable.password), null, 24), z, function1, cs4Var, "TVTA-settings-password", m77.z(R.string.settings_save_passwords, ux2Var), ux2Var, (i3 & 896) | (i3 & 112) | 24576 | 3072, 32);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new lc(z, function1, fs4Var2, i, (byte) 2);
        }
    }

    public static final void j(q37 q37Var, fs4 fs4Var, ux2 ux2Var, int i) {
        q37Var.getClass();
        ux2Var.Y(1745956082);
        int i2 = i | 48;
        byte b = 1;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            n37.b(q37Var, g68.m, ux2Var, 438);
            fs4Var = cs4.b;
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new f06(q37Var, fs4Var, i, b);
        }
    }

    public static final void k(j74 j74Var, boolean z, Function0 function0, c74 c74Var, p74 p74Var, f74 f74Var, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        fs4 fs4Var2;
        String str;
        String str2;
        byte b;
        nd5 nd5Var;
        String str3;
        boolean z2;
        String str4;
        ux2 ux2Var2 = ux2Var;
        c74Var.getClass();
        f74Var.getClass();
        bm1 bm1Var = f74Var.d;
        yl1 yl1Var = f74Var.c;
        ux2Var2.Y(964769586);
        if ((i & 6) == 0) {
            i2 = (ux2Var2.f(j74Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var2.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var2.d(c74Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var2.f(p74Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var2.f(f74Var) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (ux2Var2.N(i3 & 1, (599187 & i3) != 599186)) {
            xl1 xl1Var = f74Var.a;
            Set set = j74Var.i;
            boolean zF = ux2Var2.f(set);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (zF || objK == awVar) {
                objK = (e84) lv0.n0(set);
                ux2Var2.g0(objK);
            }
            e84 e84Var = (e84) objK;
            h84 h84Var = xl1Var.m;
            boolean zF2 = ux2Var2.f(set) | ux2Var2.f(h84Var);
            Object objK2 = ux2Var2.K();
            if (zF2 || objK2 == awVar) {
                if (e84Var != null && (str2 = e84Var.d) != null && (rv0VarA = h84Var.a(str2)) != null) {
                    objK2 = rv0VarA;
                } else if (e84Var == null || (str = e84Var.a) == null) {
                    objK2 = null;
                } else {
                    rv0 rv0VarA = h84Var.a(str);
                    objK2 = rv0VarA;
                }
                ux2Var2.g0(objK2);
            }
            rv0 rv0Var = (rv0) objK2;
            i97 i97VarA = r07.a(z ? et1.I(xl1Var.b, rv0.g) : et1.I(xl1Var.a, rv0.g), db8.I0(200, 6, null), ux2Var2, 432, 8);
            i97 i97VarA2 = vm.a(z ? 180.0f : 0.0f, db8.I0(200, 6, null), null, ux2Var, 48, 28);
            long jI = et1.I(xl1Var.c, rv0.b);
            long jI2 = et1.I(xl1Var.d, rv0.b(0.6f, jI));
            j04 j04Var = (j04) ux2Var.j(b11.n);
            zl1 zl1Var = f74Var.b;
            zl1Var.getClass();
            int iOrdinal = c74Var.ordinal();
            if (iOrdinal != 0) {
                b = 1;
                if (iOrdinal != 1) {
                    gk0.s();
                    return;
                }
                nd5Var = zl1Var.b;
            } else {
                b = 1;
                nd5Var = zl1Var.a;
            }
            yl1Var.getClass();
            boolean zF3 = ux2Var.f(nd5Var) | ux2Var.d(j04Var.ordinal()) | ux2Var.c(8.0f);
            Object objK3 = ux2Var.K();
            if (zF3 || objK3 == awVar) {
                objK3 = new w32(ka0.p(nd5Var, j04Var) + 8.0f + 10.0f);
                ux2Var.g0(objK3);
            }
            float f = ((w32) objK3).m;
            boolean zF4 = ux2Var.f(nd5Var) | ux2Var.d(j04Var.ordinal());
            Object objK4 = ux2Var.K();
            if (zF4 || objK4 == awVar) {
                objK4 = new w32(ka0.o(nd5Var, j04Var));
                ux2Var.g0(objK4);
            }
            float f2 = ((w32) objK4).m;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            boolean zF5 = ux2Var.f(i97VarA);
            Object objK5 = ux2Var.K();
            if (zF5 || objK5 == awVar) {
                objK5 = new yk1(i97VarA, b);
                ux2Var.g0(objK5);
            }
            nd5 nd5Var2 = nd5Var;
            fs4 fs4VarB = androidx.compose.foundation.b.b(j51.B(fs4VarC, (Function1) objK5), false, null, null, function0, 15);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarB);
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
            fs4 fs4VarA = ka0.A(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), nd5Var2);
            x50 x50Var = xz2.y;
            ju juVar = iq8.a;
            dg6 dg6VarA = cg6.a(juVar, x50Var, ux2Var, 48);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarA);
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
            ua0.a(au8.s(iq8.j(androidx.compose.foundation.layout.b.l(cs4Var, 8.0f), sf6.a), rv0Var != null ? rv0Var.a : rv0.b(0.4f, jI2), kh.V), ux2Var, 0);
            b77.a(ux2Var, androidx.compose.foundation.layout.b.p(cs4Var, 10.0f));
            String str5 = j74Var.c;
            fs4 fs4VarA2 = eg6.a(cs4Var, 1.0f);
            ot7 ot7Var = bm1Var.a;
            ot7 ot7Var2 = bm1Var.b;
            ux2Var2 = ux2Var;
            long j = jI2;
            j51.e(str5, fs4VarA2, ot7.a(ot7Var, jI, 0L, null, null, 0L, 0L, null, 16777214), null, 2, false, 1, 0, ux2Var2, 1597440, 936);
            String str6 = j74Var.b;
            if (str6 == null || ub7.b0(str6)) {
                ux2Var2.W(-1507083062);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-1507394426);
                b77.a(ux2Var2, androidx.compose.foundation.layout.b.p(cs4Var, 8.0f));
                j51.e(str6, null, ot7.a(bm1Var.c, j, 0L, null, nr2.d, 0L, 0L, null, 16777182), null, 0, false, 1, 0, ux2Var2, 1572864, 954);
                ux2Var2.p(false);
            }
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.p(cs4Var, 8.0f));
            boolean zF6 = ux2Var2.f(i97VarA2);
            Object objK6 = ux2Var2.K();
            if (zF6 || objK6 == awVar) {
                objK6 = new b5(i97VarA2, (byte) 5);
                ux2Var2.g0(objK6);
            }
            a(j, (Function0) objK6, ux2Var2, 0);
            ux2Var2.p(true);
            String strK = lv1.K(j74Var);
            if (ub7.b0(strK)) {
                strK = null;
            }
            if (e84Var == null || (str3 = e84Var.a) == null) {
                str3 = null;
            }
            if (strK == null && str3 == null) {
                ux2Var2.W(1594785478);
                ux2Var2.p(false);
                z2 = true;
            } else {
                ux2Var2.W(1593576540);
                fs4 fs4VarF = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), f, 0.0f, f2, 8.0f, 2);
                dg6 dg6VarA2 = cg6.a(juVar, x50Var, ux2Var2, 48);
                int iHashCode3 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL3 = ux2Var2.l();
                fs4 fs4VarS3 = uf0.s(ux2Var2, fs4VarF);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(dg6VarA2, iz0Var, ux2Var2);
                o67.n(yj5VarL3, iz0Var2, ux2Var2);
                e41.r(iHashCode3, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS3, iz0Var4, ux2Var2);
                if (strK != null) {
                    ux2Var2.W(2032641021);
                    if (1.0f <= 0.0d) {
                        ii3.a("invalid weight; must be greater than zero");
                    }
                    str4 = strK;
                    z2 = true;
                    j51.e(str4, new s14(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false), ot7.a(ot7Var2, j, 0L, null, null, 0L, 0L, null, 16777214), null, 2, false, 1, 0, ux2Var2, 1597440, 936);
                    ux2Var2.p(false);
                } else {
                    z2 = true;
                    str4 = strK;
                    ux2Var2.W(2032974085);
                    ux2Var2.p(false);
                }
                if (str4 == null || str3 == null) {
                    ux2Var2.W(2033251845);
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(2033044269);
                    j51.e(" · ", null, ot7.a(ot7Var2, rv0.b(0.5f, j), 0L, null, null, 0L, 0L, null, 16777214), null, 0, false, 0, 0, ux2Var2, 6, 1018);
                    ux2Var2.p(false);
                }
                if (str3 != null) {
                    ux2Var2.W(2033301445);
                    ot7 ot7Var3 = bm1Var.d;
                    if (rv0Var != null) {
                        j = rv0Var.a;
                    }
                    j51.e(str3, null, ot7.a(ot7Var3, j, 0L, null, null, 0L, 0L, null, 16777214), null, 0, false, 1, 0, ux2Var2, 1572864, 954);
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(2033547461);
                    ux2Var2.p(false);
                }
                ux2Var2.p(z2);
                ux2Var2.p(false);
            }
            ux2Var2.p(z2);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new n76(j74Var, z, function0, c74Var, p74Var, f74Var, fs4Var2, i, (byte) 0);
        }
    }

    public static final void l(Integer num, OffsetDateTime offsetDateTime, Clock clock, Function0 function0, ux2 ux2Var, int i) {
        Clock clock2;
        Clock clockSystemUTC;
        int i2;
        Object bjVar;
        function0.getClass();
        ux2Var.Y(-1115347573);
        int i3 = (ux2Var.f(num) ? 4 : 2) | i | (ux2Var.h(offsetDateTime) ? 32 : 16) | 128 | (ux2Var.h(function0) ? 2048 : 1024);
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                clockSystemUTC = Clock.systemUTC();
                clockSystemUTC.getClass();
                i2 = i3 & (-897);
            } else {
                ux2Var.Q();
                i2 = i3 & (-897);
                clockSystemUTC = clock;
            }
            ux2Var.q();
            px4 px4VarT = h57.t(function0, ux2Var);
            boolean zH = ux2Var.h(offsetDateTime) | ((i2 & 14) == 4) | ux2Var.h(clockSystemUTC) | ux2Var.f(px4VarT);
            Object objK = ux2Var.K();
            if (zH || objK == e01.a) {
                clock2 = clockSystemUTC;
                bjVar = new bj(num, offsetDateTime, clock2, px4VarT, null, (byte) 19);
                ux2Var.g0(bjVar);
            } else {
                bjVar = objK;
                clock2 = clockSystemUTC;
            }
            ck3.g(num, offsetDateTime, clock2, (hw2) bjVar, ux2Var);
        } else {
            ux2Var.Q();
            clock2 = clock;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) num, (Object) offsetDateTime, (Object) clock2, (Object) function0, i, (byte) 16);
        }
    }

    public static final void m(cp7 cp7Var, Context context, final boolean z, final String str, final long j) {
        if (gt7.c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) g68.v.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        zw4 zw4Var = cp7Var.a;
        zw4 zw4Var2 = cp7Var.a;
        qp7 qp7Var = qp7.b;
        zw4Var.a(qp7Var);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            zw4Var2.a(new mp7(new ys5(i), resolveInfo.loadLabel(packageManager).toString(), 0, new Function1() { // from class: o.zs5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    g68.w.n(context2, resolveInfo, Boolean.valueOf(z), str, new gt7(j));
                    ((rp7) obj).close();
                    return f88.a;
                }
            }));
            i++;
            context2 = context;
        }
        zw4Var2.a(qp7Var);
    }

    public static final ab7 n(aj1 aj1Var) {
        aj1Var.getClass();
        ab7 ab7Var = aj1Var instanceof ab7 ? (ab7) aj1Var : null;
        if (ab7Var != null) {
            return ab7Var;
        }
        hk0.l(ua5.o(w86.a, aj1Var.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
        return null;
    }

    public static final void o(bb7 bb7Var) {
        bb7Var.getClass();
        if ((bb7Var instanceof bb7 ? bb7Var : null) != null) {
            return;
        }
        hk0.l(ua5.o(w86.a, bb7Var.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ud5 p(xd3 xd3Var, Context context, int i) {
        if (xd3Var instanceof r70) {
            Bitmap bitmap = ((r70) xd3Var).a;
            BitmapPainter bitmapPainter = new BitmapPainter(new vi(bitmap), (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
            bitmapPainter.t = i;
            return bitmapPainter;
        }
        if (!(xd3Var instanceof c62)) {
            return new ImagePainter(xd3Var);
        }
        Drawable drawableMutate = bt1.o(xd3Var, context.getResources()).mutate();
        drawableMutate.setFilterBitmap(true ^ (i == 0));
        return new DrawablePainter(drawableMutate);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    public static boolean q(int i, Rect rect, Rect rect2, Rect rect3) {
        int iG;
        int i2;
        int i3;
        boolean zR = r(i, rect, rect2);
        if (!r(i, rect, rect3) && zR) {
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            hk0.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        if (rect.bottom <= rect3.top) {
                            if (i != 17 && i != 66) {
                                iG = G(i, rect, rect2);
                                if (i != 17) {
                                    i2 = rect.left;
                                    i3 = rect3.left;
                                } else if (i != 33) {
                                    i2 = rect.top;
                                    i3 = rect3.top;
                                } else if (i != 66) {
                                    i2 = rect3.right;
                                    i3 = rect.right;
                                } else {
                                    if (i == 130) {
                                        hk0.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                        return false;
                                    }
                                    i2 = rect3.bottom;
                                    i3 = rect.bottom;
                                }
                                if (iG < Math.max(1, i2 - i3)) {
                                }
                            }
                        }
                    } else if (rect.right <= rect3.left) {
                        if (i != 17) {
                            iG = G(i, rect, rect2);
                            if (i != 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i != 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i != 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i == 130) {
                                    hk0.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    return false;
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iG < Math.max(1, i2 - i3)) {
                            }
                        }
                    }
                } else if (rect.top >= rect3.bottom) {
                    if (i != 17) {
                        iG = G(i, rect, rect2);
                        if (i != 17) {
                            i2 = rect.left;
                            i3 = rect3.left;
                        } else if (i != 33) {
                            i2 = rect.top;
                            i3 = rect3.top;
                        } else if (i != 66) {
                            i2 = rect3.right;
                            i3 = rect.right;
                        } else {
                            if (i == 130) {
                                hk0.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                            i2 = rect3.bottom;
                            i3 = rect.bottom;
                        }
                        if (iG < Math.max(1, i2 - i3)) {
                        }
                    }
                }
            } else if (rect.left >= rect3.right) {
                if (i != 17) {
                    iG = G(i, rect, rect2);
                    if (i != 17) {
                        i2 = rect.left;
                        i3 = rect3.left;
                    } else if (i != 33) {
                        i2 = rect.top;
                        i3 = rect3.top;
                    } else if (i != 66) {
                        i2 = rect3.right;
                        i3 = rect.right;
                    } else {
                        if (i == 130) {
                            hk0.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    }
                    if (iG < Math.max(1, i2 - i3)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    public static boolean r(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        hk0.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                } else if (rect2.bottom < rect.top) {
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
        } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static int s(y66 y66Var, vy1 vy1Var, View view, View view2, androidx.recyclerview.widget.a aVar, boolean z) {
        if (aVar.G() == 0 || y66Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(androidx.recyclerview.widget.a.O(view) - androidx.recyclerview.widget.a.O(view2)) + 1;
        }
        return Math.min(vy1Var.n(), vy1Var.d(view2) - vy1Var.g(view));
    }

    public static int t(y66 y66Var, vy1 vy1Var, View view, View view2, androidx.recyclerview.widget.a aVar, boolean z, boolean z2) {
        if (aVar.G() == 0 || y66Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (y66Var.b() - Math.max(androidx.recyclerview.widget.a.O(view), androidx.recyclerview.widget.a.O(view2))) - 1) : Math.max(0, Math.min(androidx.recyclerview.widget.a.O(view), androidx.recyclerview.widget.a.O(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(vy1Var.d(view2) - vy1Var.g(view)) / (Math.abs(androidx.recyclerview.widget.a.O(view) - androidx.recyclerview.widget.a.O(view2)) + 1))) + (vy1Var.m() - vy1Var.g(view)));
        }
        return iMax;
    }

    public static int u(y66 y66Var, vy1 vy1Var, View view, View view2, androidx.recyclerview.widget.a aVar, boolean z) {
        if (aVar.G() == 0 || y66Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return y66Var.b();
        }
        return (int) (((vy1Var.d(view2) - vy1Var.g(view)) / (Math.abs(androidx.recyclerview.widget.a.O(view) - androidx.recyclerview.widget.a.O(view2)) + 1)) * y66Var.b());
    }

    public static long v(long j, q14 q14Var) {
        q14 q14Var2 = q14.m;
        return t61.a(q14Var == q14Var2 ? r61.k(j) : r61.j(j), q14Var == q14Var2 ? r61.i(j) : r61.h(j), q14Var == q14Var2 ? r61.j(j) : r61.k(j), q14Var == q14Var2 ? r61.h(j) : r61.i(j));
    }

    public static long w(int i, long j) {
        return t61.a(0, r61.i(j), (i & 4) != 0 ? r61.j(j) : 0, r61.h(j));
    }

    public static final v56 x(es4 es4Var, boolean z, boolean z2) {
        if (!es4Var.m.z) {
            return v56.e;
        }
        if (z) {
            return vn4.n0(es4Var, 8).x1();
        }
        e45 e45VarN0 = vn4.n0(es4Var, 8);
        return vt1.s(e45VarN0).b(e45VarN0, z2);
    }

    public static final void y(pg6 pg6Var, String str) {
        pg6Var.getClass();
        ug6 ug6VarJ0 = pg6Var.J0(str);
        try {
            ug6VarJ0.F0();
            iq8.l(ug6VarJ0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq8.l(ug6VarJ0, th);
                throw th2;
            }
        }
    }

    public static final Activity z(Context context) {
        context.getClass();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return z(baseContext);
    }
}
