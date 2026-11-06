package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.os.UserManager;
import android.system.Os;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Loading;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b77 {
    public static Field a = null;
    public static boolean b = false;
    public static boolean c = true;

    public static final void a(ux2 ux2Var, fs4 fs4Var) {
        ei eiVar = ei.j;
        int iHashCode = Long.hashCode(ux2Var.T);
        fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
        yj5 yj5VarL = ux2Var.l();
        yz0.c.getClass();
        ux2Var.a0();
        if (ux2Var.S) {
            ux2Var.k(LayoutNode.e0);
        } else {
            ux2Var.j0();
        }
        o67.n(eiVar, d82.v, ux2Var);
        o67.n(yj5VarL, d82.u, ux2Var);
        o67.l(ux2Var);
        o67.n(fs4VarS, d82.t, ux2Var);
        o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
        ux2Var.p(true);
    }

    public static final void b(int i, Function0 function0, Function0 function1, ux2 ux2Var, fs4 fs4Var) {
        int i2;
        fs4 fs4Var2;
        function0.getClass();
        function1.getClass();
        ux2Var.Y(-2011110182);
        if ((i & 6) == 0) {
            i2 = i | (ux2Var.h(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(function1) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            a12 a12Var = new a12(4);
            cs4 cs4Var = cs4.b;
            uf0.b(function0, au8.O(-1024392302, new cu6(function1, (byte) 5), ux2Var), cs4Var, au8.O(-515613488, new cu6(function0, (byte) 6), ux2Var), db8.s, db8.t, null, 0L, 0L, 0L, 0L, a12Var, ux2Var, (i3 & 14) | 1772976, 3072, 8080);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new qk0(function0, function1, fs4Var2, i, (byte) 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(Function0 function0, Function0 function1, fs4 fs4Var, yr1 yr1Var, ux2 ux2Var, int i) {
        int i2;
        fs4 fs4Var2;
        yr1 yr1Var2;
        ux2 ux2Var2;
        cs4 cs4Var;
        int i3;
        yr1 yr1Var3;
        fs4 fs4Var3;
        ux2 ux2Var3;
        Object obj;
        int i4;
        ux2 ux2Var4 = ux2Var;
        function0.getClass();
        function1.getClass();
        ux2Var4.Y(91495575);
        if ((i & 6) == 0) {
            i2 = (ux2Var4.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var4.h(function1) ? 32 : 16;
        }
        int i5 = i2 | 384;
        if ((i & 3072) == 0) {
            i5 = i2 | 1408;
        }
        int i6 = i5;
        byte b2 = 0;
        if (ux2Var4.N(i6 & 1, (i6 & 1171) != 1170)) {
            ux2Var4.S();
            int i7 = i & 1;
            cs4 cs4Var2 = cs4.b;
            if (i7 == 0 || ux2Var4.x()) {
                dl5 dl5Var = new dl5(new vr1(b2), (byte) 1);
                we8 we8VarA = id4.a(ux2Var4);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                cs4Var = cs4Var2;
                ux2 ux2Var5 = ux2Var4;
                i3 = i6 & (-7169);
                yr1Var3 = (yr1) g57.t(w86.a.b(yr1.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var5);
                fs4Var3 = cs4Var;
                ux2Var3 = ux2Var5;
            } else {
                ux2Var4.Q();
                i3 = i6 & (-7169);
                ux2Var3 = ux2Var4;
                fs4Var3 = fs4Var;
                cs4Var = cs4Var2;
                yr1Var3 = yr1Var;
            }
            ux2Var3.q();
            Context context = (Context) ux2Var3.j(lh.b);
            List listL = qf0.L(m77.z(R.string.settings_twoFactorAuthentication_tab_remote, ux2Var3), m77.z(R.string.settings_twoFactorAuthentication_tab_classic, ux2Var3));
            Object[] objArr = new Object[0];
            Object objK = ux2Var3.K();
            Object obj2 = e01.a;
            Object obj3 = objK;
            if (objK == obj2) {
                Object jv6Var = new jv6((byte) 12);
                ux2Var3.g0(jv6Var);
                obj3 = jv6Var;
            }
            yf5 yf5Var = (yf5) zu1.L(objArr, (Function0) obj3, ux2Var3, 48);
            Object[] objArr2 = new Object[0];
            Object objK2 = ux2Var3.K();
            Object obj4 = objK2;
            if (objK2 == obj2) {
                Object jv6Var2 = new jv6((byte) 13);
                ux2Var3.g0(jv6Var2);
                obj4 = jv6Var2;
            }
            px4 px4Var = (px4) zu1.L(objArr2, (Function0) obj4, ux2Var3, 48);
            Object[] objArr3 = new Object[0];
            Object objK3 = ux2Var3.K();
            Object obj5 = objK3;
            if (objK3 == obj2) {
                Object jv6Var3 = new jv6((byte) 14);
                ux2Var3.g0(jv6Var3);
                obj5 = jv6Var3;
            }
            px4 px4Var2 = (px4) zu1.L(objArr3, (Function0) obj5, ux2Var3, 48);
            Object[] objArr4 = new Object[0];
            Object objK4 = ux2Var3.K();
            Object obj6 = objK4;
            if (objK4 == obj2) {
                Object jv6Var4 = new jv6((byte) 15);
                ux2Var3.g0(jv6Var4);
                obj6 = jv6Var4;
            }
            px4 px4Var3 = (px4) zu1.L(objArr4, (Function0) obj6, ux2Var3, 48);
            boolean zH = ux2Var3.h(yr1Var3);
            Object objK5 = ux2Var3.K();
            Object obj7 = objK5;
            if (zH || objK5 == obj2) {
                Object y26Var = new y26(yr1Var3, (byte) 24);
                ux2Var3.g0(y26Var);
                obj7 = y26Var;
            }
            Function0 function2 = (Function0) obj7;
            int i8 = i3;
            boolean zH2 = ((i3 & 14) == 4) | ux2Var3.h(yr1Var3);
            Object objK6 = ux2Var3.K();
            Object obj8 = objK6;
            if (zH2 || objK6 == obj2) {
                Object a26Var = new a26((Object) function0, (Object) yr1Var3, (byte) 18);
                ux2Var3.g0(a26Var);
                obj8 = a26Var;
            }
            Function0 function3 = (Function0) obj8;
            e8 e8Var = new e8((byte) 2);
            boolean zF = ux2Var3.f(px4Var) | ux2Var3.f(px4Var2);
            Object objK7 = ux2Var3.K();
            if (zF || objK7 == obj2) {
                Object uaVar = new ua(px4Var, px4Var2, (byte) 2);
                ux2Var3.g0(uaVar);
                obj = uaVar;
            } else {
                obj = objK7;
            }
            qk4 qk4VarX0 = db8.x0(e8Var, (Function1) obj, ux2Var3);
            boolean zH3 = ux2Var3.h(context) | ux2Var3.f(px4Var3) | ux2Var3.f(px4Var) | ux2Var3.f(px4Var2) | ux2Var3.h(qk4VarX0);
            Object objK8 = ux2Var3.K();
            if (zH3 || objK8 == obj2) {
                objK8 = new t5(context, qk4VarX0, px4Var3, px4Var, px4Var2, (hc1) null);
                ux2Var3.g0(objK8);
            }
            f88 f88Var = f88.a;
            ck3.i(f88Var, (hw2) objK8, ux2Var3);
            boolean zH4 = ux2Var3.h(yr1Var3);
            Object objK9 = ux2Var3.K();
            hc1 hc1Var = null;
            Object obj9 = objK9;
            if (zH4 || objK9 == obj2) {
                Object wr1Var = new wr1(yr1Var3, hc1Var, (byte) 1);
                ux2Var3.g0(wr1Var);
                obj9 = wr1Var;
            }
            ck3.i(f88Var, (hw2) obj9, ux2Var3);
            if (((Boolean) px4Var2.getValue()).booleanValue()) {
                ux2Var3.W(-1557536623);
                boolean zF2 = ux2Var3.f(px4Var2) | ((i8 & 112) == 32);
                Object objK10 = ux2Var3.K();
                Object obj10 = objK10;
                if (zF2 || objK10 == obj2) {
                    Object ot1Var = new ot1(function1, px4Var2, (byte) 4);
                    ux2Var3.g0(ot1Var);
                    obj10 = ot1Var;
                }
                Function0 function4 = (Function0) obj10;
                boolean zF3 = ux2Var3.f(px4Var2) | ux2Var3.h(context);
                Object objK11 = ux2Var3.K();
                Object obj11 = objK11;
                if (zF3 || objK11 == obj2) {
                    Object a26Var2 = new a26((Object) context, (Object) px4Var2, (byte) 19);
                    ux2Var3.g0(a26Var2);
                    obj11 = a26Var2;
                }
                i4 = 0;
                b(0, function4, (Function0) obj11, ux2Var3, null);
                ux2Var3.p(false);
            } else {
                i4 = 0;
                ux2Var3.W(-1557050357);
                ux2Var3.p(false);
            }
            fs4 fs4VarF = fs4Var3.f(androidx.compose.foundation.layout.b.c);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var3, i4);
            int iHashCode = Long.hashCode(ux2Var3.T);
            yj5 yj5VarL = ux2Var3.l();
            fs4 fs4VarS = uf0.s(ux2Var3, fs4VarF);
            yz0.c.getClass();
            ux2Var3.a0();
            if (ux2Var3.S) {
                ux2Var3.k(LayoutNode.e0);
            } else {
                ux2Var3.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var3);
            o67.n(yj5VarL, d82.u, ux2Var3);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var3);
            o67.l(ux2Var3);
            o67.n(fs4VarS, d82.t, ux2Var3);
            fs4 fs4Var4 = fs4Var3;
            boolean z = i4;
            yr1 yr1Var4 = yr1Var3;
            ux2 ux2Var6 = ux2Var;
            x37.b(yf5Var.z(), androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0L, 0L, null, null, au8.O(1487032171, new l64(listL, yf5Var, (byte) 25), ux2Var3), ux2Var6, 1572912, 60);
            int iZ = yf5Var.z();
            if (iZ == 0) {
                ux2Var6.W(-1101225831);
                x67.a(z ? 1 : 0, function3, function2, ux2Var6, null);
                ux2Var6.p(z);
            } else if (iZ != 1) {
                ux2Var6.W(221938241);
                ux2Var6.p(z);
            } else {
                ux2Var6.W(-1101222438);
                o67.b(z ? 1 : 0, function3, function2, ux2Var6, null);
                ux2Var6.p(z);
            }
            ux2Var6.p(true);
            yr1Var2 = yr1Var4;
            fs4Var2 = fs4Var4;
            ux2Var2 = ux2Var6;
        } else {
            ux2Var4.Q();
            fs4Var2 = fs4Var;
            yr1Var2 = yr1Var;
            ux2Var2 = ux2Var4;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new p5(function0, function1, fs4Var2, yr1Var2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Code duplicated, block: B:105:0x0148  */
    /* JADX WARN: Code duplicated, block: B:106:0x015f  */
    /* JADX WARN: Code duplicated, block: B:109:0x019a  */
    /* JADX WARN: Code duplicated, block: B:110:0x019e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0218  */
    /* JADX WARN: Code duplicated, block: B:115:0x0242  */
    /* JADX WARN: Code duplicated, block: B:116:0x0246  */
    /* JADX WARN: Code duplicated, block: B:118:0x0277  */
    /* JADX WARN: Code duplicated, block: B:120:0x0291  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x011b  */
    /* JADX WARN: Code duplicated, block: B:93:0x011d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0125  */
    public static final void d(final hi7 hi7Var, fs4 fs4Var, boolean z, vl7 vl7Var, long j, long j2, final String str, final String str2, final long j3, final rv0 rv0Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        fs4 fs4Var2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int iOrdinal;
        int i8;
        int i9;
        String str3;
        int i10;
        char c2;
        boolean z3;
        final vl7 vl7Var2;
        final fs4 fs4Var3;
        final boolean z4;
        final long j4;
        final long j5;
        j56 j56VarR;
        cs4 cs4Var;
        fs4 fs4Var4;
        boolean z5;
        vl7 vl7Var3;
        boolean z6;
        int i11;
        boolean z7;
        boolean z8;
        Object objK;
        long j6;
        boolean z9;
        tg3 tg3Var;
        iz0 iz0Var;
        iz0 iz0Var2;
        iz0 iz0Var3;
        iz0 iz0Var4;
        vl7 vl7Var4;
        boolean z10;
        int i12;
        int i13;
        int i14;
        hi7Var.getClass();
        ux2Var.Y(-2102016695);
        if ((i & 6) == 0) {
            i3 = (ux2Var.d(hi7Var.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                fs4Var2 = fs4Var;
                i3 |= ux2Var.f(fs4Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (ux2Var.g(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 3072;
                i7 = i2 & 16;
                if (i7 != 0) {
                    i6 = i3 | 27648;
                } else if ((i & 24576) == 0) {
                    if (vl7Var == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = vl7Var.ordinal();
                    }
                    if (ux2Var.d(iOrdinal)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i6 |= i8;
                }
                i9 = 1769472 | i6;
                if ((12582912 & i) == 0) {
                    str3 = str;
                    if (ux2Var.f(str3)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i9 |= i14;
                } else {
                    str3 = str;
                }
                if ((100663296 & i) == 0) {
                    if (ux2Var.f(str2)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i9 |= i13;
                }
                if ((805306368 & i) == 0) {
                    if (ux2Var.e(j3)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i9 |= i12;
                }
                i10 = i9;
                if (ux2Var.f(rv0Var)) {
                    c2 = 4;
                } else {
                    c2 = 2;
                }
                if ((i10 & 306783379) == 306783378 || (c2 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ux2Var.N(i10 & 1, z3)) {
                    cs4Var = cs4.b;
                    if (i15 != 0) {
                        fs4Var4 = cs4Var;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i7 != 0) {
                        vl7Var3 = vl7.Online;
                    } else {
                        vl7Var3 = vl7Var;
                    }
                    final long j7 = j51.j(4292072923L);
                    final long j8 = j51.j(4294441210L);
                    Object[] objArr = {str2};
                    if ((i10 & 234881024) == 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    i11 = i10 & 14;
                    if (i11 == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objK = ux2Var.K();
                    if (z8 || objK == e01.a) {
                        objK = new a26((Object) str2, (Object) hi7Var, (byte) 22);
                        ux2Var.g0(objK);
                    }
                    px4 px4Var = (px4) zu1.L(objArr, (Function0) objK, ux2Var, 0);
                    y50 y50Var = xz2.s;
                    if (rv0Var == null) {
                        ux2Var.W(-1403385200);
                        j6 = ((rn4) ux2Var.j(un4.a)).a.a;
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(-1403387060);
                        ux2Var.p(false);
                        j6 = rv0Var.a;
                    }
                    fs4 fs4VarL = androidx.compose.foundation.layout.b.l(au8.s(fs4Var4, j6, sf6.a), hi7Var.m);
                    do4 do4VarC = ua0.c(y50Var, false);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarL);
                    yz0.c.getClass();
                    ux2Var.a0();
                    z9 = ux2Var.S;
                    tg3Var = LayoutNode.e0;
                    if (z9) {
                        ux2Var.k(tg3Var);
                    } else {
                        ux2Var.j0();
                    }
                    iz0Var = d82.v;
                    o67.n(do4VarC, iz0Var, ux2Var);
                    iz0Var2 = d82.u;
                    o67.n(yj5VarL, iz0Var2, ux2Var);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    iz0Var3 = d82.w;
                    o67.n(numValueOf, iz0Var3, ux2Var);
                    o67.l(ux2Var);
                    iz0Var4 = d82.t;
                    o67.n(fs4VarS, iz0Var4, ux2Var);
                    fs4 fs4Var5 = fs4Var4;
                    final String str4 = str3;
                    l47.b(new wx((String) px4Var.getValue(), (ox) ux2Var.j(vc4.a), s07.a((Context) ux2Var.j(lh.b))), cs4Var, AsyncImagePainter.G, y50Var, rb1.b, au8.O(2081189442, new iw2() { // from class: o.zl7
                        /* JADX WARN: Code duplicated, block: B:31:0x0094  */
                        @Override // o.iw2
                        public final Object d(Object obj, Object obj2, Object obj3) {
                            r46 r46Var = (r46) obj;
                            ux2 ux2Var2 = (ux2) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            r46Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= ux2Var2.f(r46Var) ? 4 : 2;
                            }
                            if (ux2Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                                sx sxVar = (sx) g57.g(r46Var.b.F, ux2Var2).getValue();
                                hi7 hi7Var2 = hi7Var;
                                if (sxVar == null) {
                                    ux2Var2.W(-1432325973);
                                    l47.c(r46Var, androidx.compose.foundation.layout.b.l(iq8.j(cs4.b, sf6.a), hi7Var2.m), null, null, rb1.a, 0.0f, false, ux2Var2, (iIntValue & 14) | 199680);
                                    ux2Var2.p(false);
                                } else if (sxVar instanceof AsyncImagePainter$State$Loading) {
                                    ux2Var2.W(-1433097842);
                                    g77.b(hi7Var2.m, j7, j8, null, ux2Var2, 0);
                                    ux2Var2.p(false);
                                } else if (sxVar instanceof AsyncImagePainter$State$Error) {
                                    ux2Var2.W(-1432798351);
                                    String str5 = str4;
                                    if (str5 == null || str5.length() == 0) {
                                        ux2Var2.W(-1432734119);
                                        g77.a(hi7Var2, null, ux2Var2, 0);
                                        ux2Var2.p(false);
                                    } else {
                                        ux2Var2.W(-1432651876);
                                        m77.h(str5, hi7Var2, j3, null, ux2Var2, 0);
                                        ux2Var2 = ux2Var2;
                                        ux2Var2.p(false);
                                    }
                                    ux2Var2.p(false);
                                } else {
                                    ux2Var2.W(-1432325973);
                                    l47.c(r46Var, androidx.compose.foundation.layout.b.l(iq8.j(cs4.b, sf6.a), hi7Var2.m), null, null, rb1.a, 0.0f, false, ux2Var2, (iIntValue & 14) | 199680);
                                    ux2Var2.p(false);
                                }
                            } else {
                                ux2Var2.Q();
                            }
                            return f88.a;
                        }
                    }, ux2Var), ux2Var, 48, 48);
                    if (z5) {
                        ux2Var.W(74371694);
                        fs4 fs4VarA = ya0.a.a(cs4Var, xz2.w);
                        do4 do4VarC2 = ua0.c(xz2.f2564o, false);
                        int iHashCode2 = Long.hashCode(ux2Var.T);
                        yj5 yj5VarL2 = ux2Var.l();
                        fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarA);
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(tg3Var);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(do4VarC2, iz0Var, ux2Var);
                        o67.n(yj5VarL2, iz0Var2, ux2Var);
                        e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
                        o67.n(fs4VarS2, iz0Var4, ux2Var);
                        vl7 vl7Var5 = vl7Var3;
                        o67.c(hi7Var, vl7Var5, null, ux2Var, i11 | ((i10 >> 9) & 112), 4);
                        vl7Var4 = vl7Var5;
                        z10 = true;
                        ux2Var.p(true);
                        ux2Var.p(false);
                    } else {
                        vl7Var4 = vl7Var3;
                        z10 = true;
                        ux2Var.W(74511039);
                        ux2Var.p(false);
                    }
                    ux2Var.p(z10);
                    vl7Var2 = vl7Var4;
                    z4 = z5;
                    fs4Var3 = fs4Var5;
                    j4 = j7;
                    j5 = j8;
                } else {
                    ux2Var.Q();
                    vl7Var2 = vl7Var;
                    fs4Var3 = fs4Var2;
                    z4 = z2;
                    j4 = j;
                    j5 = j2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.am7
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iY = yo1.Y(i | 1);
                            b77.d(hi7Var, fs4Var3, z4, vl7Var2, j4, j5, str, str2, j3, rv0Var, (ux2) obj, iY, i2);
                            return f88.a;
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            i6 = i3 | 3072;
            i7 = i2 & 16;
            if (i7 != 0) {
                i6 = i3 | 27648;
            } else if ((i & 24576) == 0) {
                if (vl7Var == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = vl7Var.ordinal();
                }
                if (ux2Var.d(iOrdinal)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i6 |= i8;
            }
            i9 = 1769472 | i6;
            if ((12582912 & i) == 0) {
                str3 = str;
                if (ux2Var.f(str3)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i9 |= i14;
            } else {
                str3 = str;
            }
            if ((100663296 & i) == 0) {
                if (ux2Var.f(str2)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i9 |= i13;
            }
            if ((805306368 & i) == 0) {
                if (ux2Var.e(j3)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i9 |= i12;
            }
            i10 = i9;
            if (ux2Var.f(rv0Var)) {
                c2 = 4;
            } else {
                c2 = 2;
            }
            if ((i10 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (ux2Var.N(i10 & 1, z3)) {
                cs4Var = cs4.b;
                if (i15 != 0) {
                    fs4Var4 = cs4Var;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i7 != 0) {
                    vl7Var3 = vl7.Online;
                } else {
                    vl7Var3 = vl7Var;
                }
                final long j9 = j51.j(4292072923L);
                final long j10 = j51.j(4294441210L);
                Object[] objArr2 = {str2};
                if ((i10 & 234881024) == 67108864) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                i11 = i10 & 14;
                if (i11 == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objK = ux2Var.K();
                if (z8) {
                    objK = new a26((Object) str2, (Object) hi7Var, (byte) 22);
                    ux2Var.g0(objK);
                } else {
                    objK = new a26((Object) str2, (Object) hi7Var, (byte) 22);
                    ux2Var.g0(objK);
                }
                px4 px4Var2 = (px4) zu1.L(objArr2, (Function0) objK, ux2Var, 0);
                y50 y50Var2 = xz2.s;
                if (rv0Var == null) {
                    ux2Var.W(-1403385200);
                    j6 = ((rn4) ux2Var.j(un4.a)).a.a;
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-1403387060);
                    ux2Var.p(false);
                    j6 = rv0Var.a;
                }
                fs4 fs4VarL2 = androidx.compose.foundation.layout.b.l(au8.s(fs4Var4, j6, sf6.a), hi7Var.m);
                do4 do4VarC3 = ua0.c(y50Var2, false);
                int iHashCode3 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL3 = ux2Var.l();
                fs4 fs4VarS3 = uf0.s(ux2Var, fs4VarL2);
                yz0.c.getClass();
                ux2Var.a0();
                z9 = ux2Var.S;
                tg3Var = LayoutNode.e0;
                if (z9) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                iz0Var = d82.v;
                o67.n(do4VarC3, iz0Var, ux2Var);
                iz0Var2 = d82.u;
                o67.n(yj5VarL3, iz0Var2, ux2Var);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                iz0Var3 = d82.w;
                o67.n(numValueOf2, iz0Var3, ux2Var);
                o67.l(ux2Var);
                iz0Var4 = d82.t;
                o67.n(fs4VarS3, iz0Var4, ux2Var);
                fs4 fs4Var6 = fs4Var4;
                final String str5 = str3;
                l47.b(new wx((String) px4Var2.getValue(), (ox) ux2Var.j(vc4.a), s07.a((Context) ux2Var.j(lh.b))), cs4Var, AsyncImagePainter.G, y50Var2, rb1.b, au8.O(2081189442, new iw2() { // from class: o.zl7
                    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
                    @Override // o.iw2
                    public final Object d(Object obj, Object obj2, Object obj3) {
                        r46 r46Var = (r46) obj;
                        ux2 ux2Var2 = (ux2) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        r46Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ux2Var2.f(r46Var) ? 4 : 2;
                        }
                        if (ux2Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                            sx sxVar = (sx) g57.g(r46Var.b.F, ux2Var2).getValue();
                            hi7 hi7Var2 = hi7Var;
                            if (sxVar == null) {
                                ux2Var2.W(-1432325973);
                                l47.c(r46Var, androidx.compose.foundation.layout.b.l(iq8.j(cs4.b, sf6.a), hi7Var2.m), null, null, rb1.a, 0.0f, false, ux2Var2, (iIntValue & 14) | 199680);
                                ux2Var2.p(false);
                            } else if (sxVar instanceof AsyncImagePainter$State$Loading) {
                                ux2Var2.W(-1433097842);
                                g77.b(hi7Var2.m, j9, j10, null, ux2Var2, 0);
                                ux2Var2.p(false);
                            } else if (sxVar instanceof AsyncImagePainter$State$Error) {
                                ux2Var2.W(-1432798351);
                                String str6 = str5;
                                if (str6 == null || str6.length() == 0) {
                                    ux2Var2.W(-1432734119);
                                    g77.a(hi7Var2, null, ux2Var2, 0);
                                    ux2Var2.p(false);
                                } else {
                                    ux2Var2.W(-1432651876);
                                    m77.h(str6, hi7Var2, j3, null, ux2Var2, 0);
                                    ux2Var2 = ux2Var2;
                                    ux2Var2.p(false);
                                }
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(-1432325973);
                                l47.c(r46Var, androidx.compose.foundation.layout.b.l(iq8.j(cs4.b, sf6.a), hi7Var2.m), null, null, rb1.a, 0.0f, false, ux2Var2, (iIntValue & 14) | 199680);
                                ux2Var2.p(false);
                            }
                        } else {
                            ux2Var2.Q();
                        }
                        return f88.a;
                    }
                }, ux2Var), ux2Var, 48, 48);
                if (z5) {
                    ux2Var.W(74371694);
                    fs4 fs4VarA2 = ya0.a.a(cs4Var, xz2.w);
                    do4 do4VarC4 = ua0.c(xz2.f2564o, false);
                    int iHashCode4 = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL4 = ux2Var.l();
                    fs4 fs4VarS4 = uf0.s(ux2Var, fs4VarA2);
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(tg3Var);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC4, iz0Var, ux2Var);
                    o67.n(yj5VarL4, iz0Var2, ux2Var);
                    e41.r(iHashCode4, ux2Var, iz0Var3, ux2Var);
                    o67.n(fs4VarS4, iz0Var4, ux2Var);
                    vl7 vl7Var6 = vl7Var3;
                    o67.c(hi7Var, vl7Var6, null, ux2Var, i11 | ((i10 >> 9) & 112), 4);
                    vl7Var4 = vl7Var6;
                    z10 = true;
                    ux2Var.p(true);
                    ux2Var.p(false);
                } else {
                    vl7Var4 = vl7Var3;
                    z10 = true;
                    ux2Var.W(74511039);
                    ux2Var.p(false);
                }
                ux2Var.p(z10);
                vl7Var2 = vl7Var4;
                z4 = z5;
                fs4Var3 = fs4Var6;
                j4 = j9;
                j5 = j10;
            } else {
                ux2Var.Q();
                vl7Var2 = vl7Var;
                fs4Var3 = fs4Var2;
                z4 = z2;
                j4 = j;
                j5 = j2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.am7
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iY = yo1.Y(i | 1);
                        b77.d(hi7Var, fs4Var3, z4, vl7Var2, j4, j5, str, str2, j3, rv0Var, (ux2) obj, iY, i2);
                        return f88.a;
                    }
                };
            }
        }
        i3 |= 48;
        fs4Var2 = fs4Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (ux2Var.g(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i3 | 3072;
            i7 = i2 & 16;
            if (i7 != 0) {
                i6 = i3 | 27648;
            } else if ((i & 24576) == 0) {
                if (vl7Var == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = vl7Var.ordinal();
                }
                if (ux2Var.d(iOrdinal)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i6 |= i8;
            }
            i9 = 1769472 | i6;
            if ((12582912 & i) == 0) {
                str3 = str;
                if (ux2Var.f(str3)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i9 |= i14;
            } else {
                str3 = str;
            }
            if ((100663296 & i) == 0) {
                if (ux2Var.f(str2)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i9 |= i13;
            }
            if ((805306368 & i) == 0) {
                if (ux2Var.e(j3)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i9 |= i12;
            }
            i10 = i9;
            if (ux2Var.f(rv0Var)) {
                c2 = 4;
            } else {
                c2 = 2;
            }
            if ((i10 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (ux2Var.N(i10 & 1, z3)) {
                cs4Var = cs4.b;
                if (i15 != 0) {
                    fs4Var4 = cs4Var;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i7 != 0) {
                    vl7Var3 = vl7.Online;
                } else {
                    vl7Var3 = vl7Var;
                }
                final long j11 = j51.j(4292072923L);
                final long j12 = j51.j(4294441210L);
                Object[] objArr3 = {str2};
                if ((i10 & 234881024) == 67108864) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                i11 = i10 & 14;
                if (i11 == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objK = ux2Var.K();
                if (z8) {
                    objK = new a26((Object) str2, (Object) hi7Var, (byte) 22);
                    ux2Var.g0(objK);
                } else {
                    objK = new a26((Object) str2, (Object) hi7Var, (byte) 22);
                    ux2Var.g0(objK);
                }
                px4 px4Var3 = (px4) zu1.L(objArr3, (Function0) objK, ux2Var, 0);
                y50 y50Var3 = xz2.s;
                if (rv0Var == null) {
                    ux2Var.W(-1403385200);
                    j6 = ((rn4) ux2Var.j(un4.a)).a.a;
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-1403387060);
                    ux2Var.p(false);
                    j6 = rv0Var.a;
                }
                fs4 fs4VarL3 = androidx.compose.foundation.layout.b.l(au8.s(fs4Var4, j6, sf6.a), hi7Var.m);
                do4 do4VarC5 = ua0.c(y50Var3, false);
                int iHashCode5 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL5 = ux2Var.l();
                fs4 fs4VarS5 = uf0.s(ux2Var, fs4VarL3);
                yz0.c.getClass();
                ux2Var.a0();
                z9 = ux2Var.S;
                tg3Var = LayoutNode.e0;
                if (z9) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                iz0Var = d82.v;
                o67.n(do4VarC5, iz0Var, ux2Var);
                iz0Var2 = d82.u;
                o67.n(yj5VarL5, iz0Var2, ux2Var);
                Integer numValueOf3 = Integer.valueOf(iHashCode5);
                iz0Var3 = d82.w;
                o67.n(numValueOf3, iz0Var3, ux2Var);
                o67.l(ux2Var);
                iz0Var4 = d82.t;
                o67.n(fs4VarS5, iz0Var4, ux2Var);
                fs4 fs4Var7 = fs4Var4;
                final String str6 = str3;
                l47.b(new wx((String) px4Var3.getValue(), (ox) ux2Var.j(vc4.a), s07.a((Context) ux2Var.j(lh.b))), cs4Var, AsyncImagePainter.G, y50Var3, rb1.b, au8.O(2081189442, new iw2() { // from class: o.zl7
                    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
                    @Override // o.iw2
                    public final Object d(Object obj, Object obj2, Object obj3) {
                        r46 r46Var = (r46) obj;
                        ux2 ux2Var2 = (ux2) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        r46Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ux2Var2.f(r46Var) ? 4 : 2;
                        }
                        if (ux2Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                            sx sxVar = (sx) g57.g(r46Var.b.F, ux2Var2).getValue();
                            hi7 hi7Var2 = hi7Var;
                            if (sxVar == null) {
                                ux2Var2.W(-1432325973);
                                l47.c(r46Var, androidx.compose.foundation.layout.b.l(iq8.j(cs4.b, sf6.a), hi7Var2.m), null, null, rb1.a, 0.0f, false, ux2Var2, (iIntValue & 14) | 199680);
                                ux2Var2.p(false);
                            } else if (sxVar instanceof AsyncImagePainter$State$Loading) {
                                ux2Var2.W(-1433097842);
                                g77.b(hi7Var2.m, j11, j12, null, ux2Var2, 0);
                                ux2Var2.p(false);
                            } else if (sxVar instanceof AsyncImagePainter$State$Error) {
                                ux2Var2.W(-1432798351);
                                String str7 = str6;
                                if (str7 == null || str7.length() == 0) {
                                    ux2Var2.W(-1432734119);
                                    g77.a(hi7Var2, null, ux2Var2, 0);
                                    ux2Var2.p(false);
                                } else {
                                    ux2Var2.W(-1432651876);
                                    m77.h(str7, hi7Var2, j3, null, ux2Var2, 0);
                                    ux2Var2 = ux2Var2;
                                    ux2Var2.p(false);
                                }
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(-1432325973);
                                l47.c(r46Var, androidx.compose.foundation.layout.b.l(iq8.j(cs4.b, sf6.a), hi7Var2.m), null, null, rb1.a, 0.0f, false, ux2Var2, (iIntValue & 14) | 199680);
                                ux2Var2.p(false);
                            }
                        } else {
                            ux2Var2.Q();
                        }
                        return f88.a;
                    }
                }, ux2Var), ux2Var, 48, 48);
                if (z5) {
                    ux2Var.W(74371694);
                    fs4 fs4VarA3 = ya0.a.a(cs4Var, xz2.w);
                    do4 do4VarC6 = ua0.c(xz2.f2564o, false);
                    int iHashCode6 = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL6 = ux2Var.l();
                    fs4 fs4VarS6 = uf0.s(ux2Var, fs4VarA3);
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(tg3Var);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC6, iz0Var, ux2Var);
                    o67.n(yj5VarL6, iz0Var2, ux2Var);
                    e41.r(iHashCode6, ux2Var, iz0Var3, ux2Var);
                    o67.n(fs4VarS6, iz0Var4, ux2Var);
                    vl7 vl7Var7 = vl7Var3;
                    o67.c(hi7Var, vl7Var7, null, ux2Var, i11 | ((i10 >> 9) & 112), 4);
                    vl7Var4 = vl7Var7;
                    z10 = true;
                    ux2Var.p(true);
                    ux2Var.p(false);
                } else {
                    vl7Var4 = vl7Var3;
                    z10 = true;
                    ux2Var.W(74511039);
                    ux2Var.p(false);
                }
                ux2Var.p(z10);
                vl7Var2 = vl7Var4;
                z4 = z5;
                fs4Var3 = fs4Var7;
                j4 = j11;
                j5 = j12;
            } else {
                ux2Var.Q();
                vl7Var2 = vl7Var;
                fs4Var3 = fs4Var2;
                z4 = z2;
                j4 = j;
                j5 = j2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.am7
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iY = yo1.Y(i | 1);
                        b77.d(hi7Var, fs4Var3, z4, vl7Var2, j4, j5, str, str2, j3, rv0Var, (ux2) obj, iY, i2);
                        return f88.a;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        i6 = i3 | 3072;
        i7 = i2 & 16;
        if (i7 != 0) {
            i6 = i3 | 27648;
        } else if ((i & 24576) == 0) {
            if (vl7Var == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = vl7Var.ordinal();
            }
            if (ux2Var.d(iOrdinal)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i6 |= i8;
        }
        i9 = 1769472 | i6;
        if ((12582912 & i) == 0) {
            str3 = str;
            if (ux2Var.f(str3)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i9 |= i14;
        } else {
            str3 = str;
        }
        if ((100663296 & i) == 0) {
            if (ux2Var.f(str2)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i9 |= i13;
        }
        if ((805306368 & i) == 0) {
            if (ux2Var.e(j3)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i9 |= i12;
        }
        i10 = i9;
        if (ux2Var.f(rv0Var)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if ((i10 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (ux2Var.N(i10 & 1, z3)) {
            cs4Var = cs4.b;
            if (i15 != 0) {
                fs4Var4 = cs4Var;
            } else {
                fs4Var4 = fs4Var2;
            }
            if (i4 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if (i7 != 0) {
                vl7Var3 = vl7.Online;
            } else {
                vl7Var3 = vl7Var;
            }
            final long j13 = j51.j(4292072923L);
            final long j14 = j51.j(4294441210L);
            Object[] objArr4 = {str2};
            if ((i10 & 234881024) == 67108864) {
                z6 = true;
            } else {
                z6 = false;
            }
            i11 = i10 & 14;
            if (i11 == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z6 | z7;
            objK = ux2Var.K();
            if (z8) {
                objK = new a26((Object) str2, (Object) hi7Var, (byte) 22);
                ux2Var.g0(objK);
            } else {
                objK = new a26((Object) str2, (Object) hi7Var, (byte) 22);
                ux2Var.g0(objK);
            }
            px4 px4Var4 = (px4) zu1.L(objArr4, (Function0) objK, ux2Var, 0);
            y50 y50Var4 = xz2.s;
            if (rv0Var == null) {
                ux2Var.W(-1403385200);
                j6 = ((rn4) ux2Var.j(un4.a)).a.a;
                ux2Var.p(false);
            } else {
                ux2Var.W(-1403387060);
                ux2Var.p(false);
                j6 = rv0Var.a;
            }
            fs4 fs4VarL4 = androidx.compose.foundation.layout.b.l(au8.s(fs4Var4, j6, sf6.a), hi7Var.m);
            do4 do4VarC7 = ua0.c(y50Var4, false);
            int iHashCode7 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL7 = ux2Var.l();
            fs4 fs4VarS7 = uf0.s(ux2Var, fs4VarL4);
            yz0.c.getClass();
            ux2Var.a0();
            z9 = ux2Var.S;
            tg3Var = LayoutNode.e0;
            if (z9) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0Var = d82.v;
            o67.n(do4VarC7, iz0Var, ux2Var);
            iz0Var2 = d82.u;
            o67.n(yj5VarL7, iz0Var2, ux2Var);
            Integer numValueOf4 = Integer.valueOf(iHashCode7);
            iz0Var3 = d82.w;
            o67.n(numValueOf4, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0Var4 = d82.t;
            o67.n(fs4VarS7, iz0Var4, ux2Var);
            fs4 fs4Var8 = fs4Var4;
            final String str7 = str3;
            l47.b(new wx((String) px4Var4.getValue(), (ox) ux2Var.j(vc4.a), s07.a((Context) ux2Var.j(lh.b))), cs4Var, AsyncImagePainter.G, y50Var4, rb1.b, au8.O(2081189442, new iw2() { // from class: o.zl7
                /* JADX WARN: Code duplicated, block: B:31:0x0094  */
                @Override // o.iw2
                public final Object d(Object obj, Object obj2, Object obj3) {
                    r46 r46Var = (r46) obj;
                    ux2 ux2Var2 = (ux2) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r46Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ux2Var2.f(r46Var) ? 4 : 2;
                    }
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                        sx sxVar = (sx) g57.g(r46Var.b.F, ux2Var2).getValue();
                        hi7 hi7Var2 = hi7Var;
                        if (sxVar == null) {
                            ux2Var2.W(-1432325973);
                            l47.c(r46Var, androidx.compose.foundation.layout.b.l(iq8.j(cs4.b, sf6.a), hi7Var2.m), null, null, rb1.a, 0.0f, false, ux2Var2, (iIntValue & 14) | 199680);
                            ux2Var2.p(false);
                        } else if (sxVar instanceof AsyncImagePainter$State$Loading) {
                            ux2Var2.W(-1433097842);
                            g77.b(hi7Var2.m, j13, j14, null, ux2Var2, 0);
                            ux2Var2.p(false);
                        } else if (sxVar instanceof AsyncImagePainter$State$Error) {
                            ux2Var2.W(-1432798351);
                            String str8 = str7;
                            if (str8 == null || str8.length() == 0) {
                                ux2Var2.W(-1432734119);
                                g77.a(hi7Var2, null, ux2Var2, 0);
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(-1432651876);
                                m77.h(str8, hi7Var2, j3, null, ux2Var2, 0);
                                ux2Var2 = ux2Var2;
                                ux2Var2.p(false);
                            }
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(-1432325973);
                            l47.c(r46Var, androidx.compose.foundation.layout.b.l(iq8.j(cs4.b, sf6.a), hi7Var2.m), null, null, rb1.a, 0.0f, false, ux2Var2, (iIntValue & 14) | 199680);
                            ux2Var2.p(false);
                        }
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, 48, 48);
            if (z5) {
                ux2Var.W(74371694);
                fs4 fs4VarA4 = ya0.a.a(cs4Var, xz2.w);
                do4 do4VarC8 = ua0.c(xz2.f2564o, false);
                int iHashCode8 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL8 = ux2Var.l();
                fs4 fs4VarS8 = uf0.s(ux2Var, fs4VarA4);
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4VarC8, iz0Var, ux2Var);
                o67.n(yj5VarL8, iz0Var2, ux2Var);
                e41.r(iHashCode8, ux2Var, iz0Var3, ux2Var);
                o67.n(fs4VarS8, iz0Var4, ux2Var);
                vl7 vl7Var8 = vl7Var3;
                o67.c(hi7Var, vl7Var8, null, ux2Var, i11 | ((i10 >> 9) & 112), 4);
                vl7Var4 = vl7Var8;
                z10 = true;
                ux2Var.p(true);
                ux2Var.p(false);
            } else {
                vl7Var4 = vl7Var3;
                z10 = true;
                ux2Var.W(74511039);
                ux2Var.p(false);
            }
            ux2Var.p(z10);
            vl7Var2 = vl7Var4;
            z4 = z5;
            fs4Var3 = fs4Var8;
            j4 = j13;
            j5 = j14;
        } else {
            ux2Var.Q();
            vl7Var2 = vl7Var;
            fs4Var3 = fs4Var2;
            z4 = z2;
            j4 = j;
            j5 = j2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.am7
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    b77.d(hi7Var, fs4Var3, z4, vl7Var2, j4, j5, str, str2, j3, rv0Var, (ux2) obj, iY, i2);
                    return f88.a;
                }
            };
        }
    }

    public static final ep3 e(g07 g07Var, zs0 zs0Var, int i) {
        if (zs0Var == null || hd2.f(zs0Var)) {
            return null;
        }
        int size = zs0Var.k0().size() + i;
        if (zs0Var.g()) {
            List listSubList = g07Var.m0().subList(i, size);
            fi1 fi1VarI = zs0Var.i();
            return new ep3(zs0Var, listSubList, e(g07Var, fi1VarI instanceof zs0 ? (zs0) fi1VarI : null, size));
        }
        if (size != g07Var.m0().size()) {
            zo1.o(zs0Var);
        }
        return new ep3(zs0Var, g07Var.m0().subList(i, g07Var.m0().size()), (ep3) null);
    }

    public static final List f(zs0 zs0Var) {
        List parameters;
        Object next;
        k48 k48VarQ;
        List listK0 = zs0Var.k0();
        listK0.getClass();
        if (!zs0Var.g() && !(zs0Var.i() instanceof xi0)) {
            return listK0;
        }
        int i = bp1.a;
        ek ekVar = ek.F;
        List listL0 = bq6.l0(new km2(new fl2(new fx(bq6.f0(bq6.h0(zs0Var, ekVar), 1), (byte) 7), true, o48.r), o48.s, eq6.n));
        Iterator it = bq6.f0(bq6.h0(zs0Var, ekVar), 1).iterator();
        do {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof ns4));
        ns4 ns4Var = (ns4) next;
        if (ns4Var != null && (k48VarQ = ns4Var.q()) != null) {
            parameters = k48VarQ.getParameters();
        }
        if (parameters == null) {
            parameters = ea2.m;
        }
        if (listL0.isEmpty() && parameters.isEmpty()) {
            List listK1 = zs0Var.k0();
            listK1.getClass();
            return listK1;
        }
        ArrayList<d58> arrayListA0 = lv0.A0(listL0, parameters);
        ArrayList arrayList = new ArrayList(mv0.Z(arrayListA0, 10));
        for (d58 d58Var : arrayListA0) {
            d58Var.getClass();
            arrayList.add(new bm0(d58Var, zs0Var, listK0.size()));
        }
        return lv0.A0(listK0, arrayList);
    }

    public static wk8 g(ux2 ux2Var) {
        View view = (View) ux2Var.j(lh.f);
        wk8 wk8VarH = h(view);
        boolean zH = ux2Var.h(wk8VarH) | ux2Var.h(view);
        Object objK = ux2Var.K();
        if (zH || objK == e01.a) {
            objK = new w18(wk8VarH, view, (byte) 4);
            ux2Var.g0(objK);
        }
        ck3.e(wk8VarH, (Function1) objK, ux2Var);
        return wk8VarH;
    }

    public static wk8 h(View view) {
        wk8 wk8Var;
        WeakHashMap weakHashMap = wk8.w;
        synchronized (weakHashMap) {
            try {
                Object wk8Var2 = weakHashMap.get(view);
                if (wk8Var2 == null) {
                    wk8Var2 = new wk8(view);
                    weakHashMap.put(view, wk8Var2);
                }
                wk8Var = (wk8) wk8Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wk8Var;
    }

    public static boolean j(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:147:0x031a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0114  */
    public static final xe3 k(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException, IOException {
        long jI;
        int i2;
        int i3;
        TypedArray typedArrayObtainStyledAttributes;
        List list;
        int i4;
        TypedArray typedArrayObtainStyledAttributes2;
        List list2;
        int i5;
        int i6;
        int i7;
        ColorStateList colorStateListA;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        io.sentry.android.core.l2 l2Var = new io.sentry.android.core.l2();
        l2Var.c = xmlResourceParser;
        l2Var.a = 0;
        int i8 = 1;
        l2Var.e = new i52((byte) 1);
        XmlPullParser xmlPullParser = (XmlPullParser) l2Var.c;
        int[] iArr = xk0.a;
        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
        l2Var.g(typedArrayObtainAttributes.getChangingConfigurations());
        boolean z = !l47.o(xmlResourceParser, "autoMirrored") ? false : typedArrayObtainAttributes.getBoolean(5, false);
        l2Var.g(typedArrayObtainAttributes.getChangingConfigurations());
        float fC = l2Var.c(typedArrayObtainAttributes, "viewportWidth", 7, 0.0f);
        float fC2 = l2Var.c(typedArrayObtainAttributes, "viewportHeight", 8, 0.0f);
        if (fC <= 0.0f) {
            throw new XmlPullParserException(ua5.z(typedArrayObtainAttributes.getPositionDescription(), "<VectorGraphic> tag requires viewportWidth > 0"));
        }
        if (fC2 <= 0.0f) {
            throw new XmlPullParserException(ua5.z(typedArrayObtainAttributes.getPositionDescription(), "<VectorGraphic> tag requires viewportHeight > 0"));
        }
        float dimension = typedArrayObtainAttributes.getDimension(3, 0.0f);
        l2Var.g(typedArrayObtainAttributes.getChangingConfigurations());
        int i9 = 2;
        float dimension2 = typedArrayObtainAttributes.getDimension(2, 0.0f);
        l2Var.g(typedArrayObtainAttributes.getChangingConfigurations());
        if (typedArrayObtainAttributes.hasValue(1)) {
            TypedValue typedValue = new TypedValue();
            typedArrayObtainAttributes.getValue(1, typedValue);
            if (typedValue.type == 2) {
                jI = rv0.h;
            } else {
                if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                    TypedValue typedValue2 = new TypedValue();
                    typedArrayObtainAttributes.getValue(1, typedValue2);
                    int i10 = typedValue2.type;
                    if (i10 == 2) {
                        an4.u(typedValue2, "Failed to resolve attribute at index 1: ");
                        return null;
                    }
                    if (i10 < 28 || i10 > 31) {
                        Resources resources2 = typedArrayObtainAttributes.getResources();
                        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                        ThreadLocal threadLocal = fw0.a;
                        try {
                            colorStateListA = fw0.a(resources2, resources2.getXml(resourceId), theme);
                        } catch (Exception e) {
                            io.sentry.android.core.v0.d("CSLCompat", "Failed to inflate ColorStateList.", e);
                            colorStateListA = null;
                        }
                    } else {
                        colorStateListA = ColorStateList.valueOf(typedValue2.data);
                    }
                } else {
                    colorStateListA = null;
                }
                l2Var.g(typedArrayObtainAttributes.getChangingConfigurations());
                jI = colorStateListA != null ? j51.i(colorStateListA.getDefaultColor()) : rv0.h;
            }
        } else {
            jI = rv0.h;
        }
        int i11 = typedArrayObtainAttributes.getInt(6, -1);
        l2Var.g(typedArrayObtainAttributes.getChangingConfigurations());
        if (i11 == -1) {
            i2 = 5;
        } else if (i11 == 3) {
            i2 = 3;
        } else if (i11 == 5) {
            i2 = 5;
        } else if (i11 != 9) {
            switch (i11) {
                case 14:
                    i2 = 13;
                    break;
                case 15:
                    i2 = 14;
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    i2 = 12;
                    break;
                default:
                    i2 = 5;
                    break;
            }
        } else {
            i2 = 9;
        }
        float f = dimension / resources.getDisplayMetrics().density;
        float f2 = dimension2 / resources.getDisplayMetrics().density;
        typedArrayObtainAttributes.recycle();
        int i12 = 3;
        ve3 ve3Var = new ve3(null, f, f2, fC, fC2, jI, i2, z, 1);
        int i13 = 0;
        while (xmlResourceParser.getEventType() != i8 && (xmlResourceParser.getDepth() >= i8 || xmlResourceParser.getEventType() != i12)) {
            i52 i52Var = (i52) l2Var.e;
            int eventType = xmlPullParser.getEventType();
            if (eventType != i9) {
                if (eventType == i12 && "group".equals(xmlPullParser.getName())) {
                    int i14 = i13 + 1;
                    for (int i15 = 0; i15 < i14; i15++) {
                        ve3Var.f();
                    }
                    int[] iArr2 = (int[]) l2Var.d;
                    if (iArr2 == null || (i7 = l2Var.b) == 0) {
                        i13 = 0;
                    } else {
                        int i16 = i7 - 1;
                        l2Var.b = i16;
                        i13 = iArr2[i16];
                    }
                }
                xmlResourceParser.next();
                ve3Var = ve3Var;
                i12 = 3;
                i8 = 1;
                i9 = 2;
            } else {
                String name = xmlPullParser.getName();
                if (name != null) {
                    int iHashCode = name.hashCode();
                    ea2 ea2Var = ea2.m;
                    if (iHashCode == -1649314686) {
                        ve3Var = ve3Var;
                        if (name.equals("clip-path")) {
                            int[] iArr3 = xk0.d;
                            if (theme == null) {
                                typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr3);
                                i3 = 0;
                            } else {
                                i3 = 0;
                                typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0);
                            }
                            l2Var.g(typedArrayObtainStyledAttributes.getChangingConfigurations());
                            String string = typedArrayObtainStyledAttributes.getString(i3);
                            l2Var.g(typedArrayObtainStyledAttributes.getChangingConfigurations());
                            if (string == null) {
                                string = "";
                            }
                            String string2 = typedArrayObtainStyledAttributes.getString(i8);
                            l2Var.g(typedArrayObtainStyledAttributes.getChangingConfigurations());
                            if (string2 == null) {
                                int i17 = bc8.a;
                                list = ea2Var;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                i52Var.b(string2, arrayList);
                                list = arrayList;
                            }
                            typedArrayObtainStyledAttributes.recycle();
                            ve3.b(ve3Var, string, list);
                            i13++;
                        }
                    } else if (iHashCode != 3433509) {
                        if (iHashCode == 98629247 && name.equals("group")) {
                            int[] iArr4 = xk0.b;
                            TypedArray typedArrayObtainAttributes2 = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr4) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0);
                            l2Var.g(typedArrayObtainAttributes2.getChangingConfigurations());
                            float fC3 = l2Var.c(typedArrayObtainAttributes2, "rotation", 5, 0.0f);
                            float f3 = typedArrayObtainAttributes2.getFloat(i8, 0.0f);
                            l2Var.g(typedArrayObtainAttributes2.getChangingConfigurations());
                            float f4 = typedArrayObtainAttributes2.getFloat(i9, 0.0f);
                            l2Var.g(typedArrayObtainAttributes2.getChangingConfigurations());
                            float fC4 = l2Var.c(typedArrayObtainAttributes2, "scaleX", 3, 1.0f);
                            float fC5 = l2Var.c(typedArrayObtainAttributes2, "scaleY", 4, 1.0f);
                            float fC6 = l2Var.c(typedArrayObtainAttributes2, "translateX", 6, 0.0f);
                            float fC7 = l2Var.c(typedArrayObtainAttributes2, "translateY", 7, 0.0f);
                            String string3 = typedArrayObtainAttributes2.getString(0);
                            l2Var.g(typedArrayObtainAttributes2.getChangingConfigurations());
                            String str = string3 == null ? "" : string3;
                            typedArrayObtainAttributes2.recycle();
                            int i18 = bc8.a;
                            ve3Var.a(str, fC3, f3, f4, fC4, fC5, fC6, fC7, ea2Var);
                            int[] iArrCopyOf = (int[]) l2Var.d;
                            if (iArrCopyOf == null) {
                                iArrCopyOf = new int[4];
                                l2Var.d = iArrCopyOf;
                            } else if (l2Var.b >= iArrCopyOf.length) {
                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * i9);
                                l2Var.d = iArrCopyOf;
                            }
                            int i19 = l2Var.b;
                            l2Var.b = i19 + 1;
                            iArrCopyOf[i19] = i13;
                            i13 = 0;
                        }
                    } else if (name.equals("path")) {
                        int[] iArr5 = xk0.c;
                        if (theme == null) {
                            typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr5);
                            i4 = 0;
                        } else {
                            i4 = 0;
                            typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr5, 0, 0);
                        }
                        l2Var.g(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                            hk0.g("No path data available");
                            return null;
                        }
                        String string4 = typedArrayObtainStyledAttributes2.getString(i4);
                        l2Var.g(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                        String str2 = string4 == null ? "" : string4;
                        String string5 = typedArrayObtainStyledAttributes2.getString(i9);
                        l2Var.g(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                        if (string5 == null) {
                            int i20 = bc8.a;
                            list2 = ea2Var;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            i52Var.b(string5, arrayList2);
                            list2 = arrayList2;
                        }
                        nd ndVarB = l2Var.b(typedArrayObtainStyledAttributes2, theme, "fillColor", i8);
                        float fC8 = l2Var.c(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                        int i21 = !l47.o(xmlPullParser, "strokeLineCap") ? -1 : typedArrayObtainStyledAttributes2.getInt(8, -1);
                        l2Var.g(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                        if (i21 == 0) {
                            i5 = 0;
                        } else if (i21 == i8) {
                            i5 = i8;
                        } else if (i21 != i9) {
                            i5 = 0;
                        } else {
                            i5 = i9;
                        }
                        int i22 = !l47.o(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayObtainStyledAttributes2.getInt(9, -1);
                        l2Var.g(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                        if (i22 == 0) {
                            i6 = 0;
                        } else if (i22 == i8) {
                            i6 = i8;
                        } else if (i22 != i9) {
                            i6 = 0;
                        } else {
                            i6 = i9;
                        }
                        float fC9 = l2Var.c(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                        nd ndVarB2 = l2Var.b(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                        float fC10 = l2Var.c(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                        float fC11 = l2Var.c(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                        float fC12 = l2Var.c(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                        float fC13 = l2Var.c(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                        float fC14 = l2Var.c(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                        int i23 = !l47.o(xmlPullParser, "fillType") ? 0 : typedArrayObtainStyledAttributes2.getInt(13, 0);
                        l2Var.g(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                        typedArrayObtainStyledAttributes2.recycle();
                        Shader shader = (Shader) ndVarB.f1562o;
                        int i24 = ndVarB.n;
                        sb0 tb0Var = (shader == null && i24 == 0) ? null : shader != null ? new tb0(shader) : new t57(j51.i(i24));
                        Shader shader2 = (Shader) ndVarB2.f1562o;
                        int i25 = ndVarB2.n;
                        ve3Var.c(fC8, fC10, fC11, fC9, fC14, fC12, fC13, i23 == 0 ? 0 : i8, i5, i6, str2, list2, tb0Var, (shader2 == null && i25 == 0) ? null : shader2 != null ? new tb0(shader2) : new t57(j51.i(i25)));
                        ve3Var = ve3Var;
                    }
                    xmlResourceParser.next();
                    ve3Var = ve3Var;
                    i12 = 3;
                    i8 = 1;
                    i9 = 2;
                }
            }
            xmlResourceParser.next();
            ve3Var = ve3Var;
            i12 = 3;
            i8 = 1;
            i9 = 2;
        }
        return new xe3(ve3Var.e(), i | l2Var.a);
    }

    public static void l(zr7 zr7Var, kv1 kv1Var, vs7 vs7Var, i04 i04Var, ns7 ns7Var, boolean z, v65 v65Var) {
        v56 v56VarB;
        if (z) {
            int iQ = v65Var.q(gt7.e(zr7Var.b));
            String str = fq7.a;
            if (iQ < vs7Var.a.a.n.length()) {
                v56VarB = vs7Var.b(iQ);
            } else {
                v56VarB = iQ != 0 ? vs7Var.b(iQ - 1) : new v56(0.0f, 0.0f, 1.0f, (int) (fq7.a((ot7) kv1Var.c, (in1) kv1Var.d, (mr2) kv1Var.e) & 4294967295L));
            }
            float f = v56VarB.b;
            float f2 = v56VarB.a;
            long jP = i04Var.P((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            v56 v56VarV = qs1.v((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jP & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jP >> 32)))) << 32), (((long) Float.floatToRawIntBits(v56VarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(v56VarB.d - f)) & 4294967295L));
            if (im3.n((ns7) ns7Var.a.b.get(), ns7Var)) {
                ns7Var.b.d(v56VarV);
            }
        }
    }

    public static final void m(xi5 xi5Var, Throwable th) throws Throwable {
        at5 at5Var = xi5Var.b;
        Thread threadCurrentThread = Thread.currentThread();
        long id = threadCurrentThread.getId();
        ju7 ju7VarJ = at5Var.q;
        ju7 ju7Var = at5Var.r;
        if (ju7VarJ == null || ju7VarJ.p != id) {
            if (ju7Var == null || ju7Var.p != id) {
                ju7VarJ = at5Var.j(threadCurrentThread.getName(), id, Os.gettid());
                at5Var.r = at5Var.q;
                at5Var.q = ju7VarJ;
            } else {
                ju7VarJ = ju7Var;
            }
        }
        qa2 qa2Var = ju7VarJ.m;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            stackTraceElement.getClassName();
            stackTraceElement.getMethodName();
            stackTraceElement.getFileName();
            stackTraceElement.getLineNumber();
        }
        throw th;
    }

    public static mb8 o(int i, String str) {
        return new mb8(new wj3(0, 0, 0, 0), str);
    }

    public static final we3 p(int i, ux2 ux2Var) throws XmlPullParserException, IOException {
        Context context = (Context) ux2Var.j(lh.b);
        Resources resources = (Resources) ux2Var.j(lh.c);
        Resources.Theme theme = context.getTheme();
        Object configuration = resources.getConfiguration();
        boolean zF = ux2Var.f(configuration) | ux2Var.d(i) | ux2Var.f(resources) | ux2Var.f(theme);
        Object objK = ux2Var.K();
        if (zF || objK == e01.a) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            objK = k(theme, resources, xml, typedValue.changingConfigurations).a;
            ux2Var.g0(objK);
        }
        return (we3) objK;
    }

    public float i(View view) {
        if (c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        return view.getAlpha();
    }

    public void n(View view, float f) {
        if (c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        view.setAlpha(f);
    }

    public abstract long q();
}
