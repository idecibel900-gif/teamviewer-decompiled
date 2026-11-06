package o;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class v67 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ArrayList arrayList, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2 ux2Var2;
        ux2 ux2Var3 = ux2Var;
        iz0 iz0Var = d82.t;
        iz0 iz0Var2 = d82.w;
        iz0 iz0Var3 = d82.u;
        iz0 iz0Var4 = d82.v;
        ux2Var3.Y(-1271004257);
        int i2 = i | (ux2Var3.f(arrayList) ? 4 : 2) | 48;
        int i3 = 0;
        int i4 = 1;
        if (ux2Var3.N(i2 & 1, (i2 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            float f = 1.0f;
            float f2 = 0.0f;
            fs4 fs4VarD = ka0.D(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 48.0f, 1);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var3, 0);
            int iHashCode = Long.hashCode(ux2Var3.T);
            yj5 yj5VarL = ux2Var3.l();
            fs4 fs4VarS = uf0.s(ux2Var3, fs4VarD);
            yz0.c.getClass();
            ux2Var3.a0();
            boolean z = ux2Var3.S;
            Function0 function0 = LayoutNode.e0;
            if (z) {
                ux2Var3.k(function0);
            } else {
                ux2Var3.j0();
            }
            o67.n(kw0VarA, iz0Var4, ux2Var3);
            o67.n(yj5VarL, iz0Var3, ux2Var3);
            o67.n(Integer.valueOf(iHashCode), iz0Var2, ux2Var3);
            o67.l(ux2Var3);
            o67.n(fs4VarS, iz0Var, ux2Var3);
            ux2Var3.W(-1926062659);
            int i5 = 0;
            ux2 ux2Var4 = ux2Var3;
            for (Object obj : arrayList) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    qf0.U();
                    throw null;
                }
                h77 h77Var = (h77) obj;
                fs4 fs4VarD2 = ka0.D(androidx.compose.foundation.layout.b.c(cs4Var, f), f2, 8.0f, i4);
                dg6 dg6VarA = cg6.a(iq8.a, xz2.x, ux2Var4, i3);
                int iHashCode2 = Long.hashCode(ux2Var4.T);
                yj5 yj5VarL2 = ux2Var4.l();
                fs4 fs4VarS2 = uf0.s(ux2Var4, fs4VarD2);
                yz0.c.getClass();
                ux2Var4.a0();
                if (ux2Var4.S) {
                    ux2Var4.k(function0);
                } else {
                    ux2Var4.j0();
                }
                o67.n(dg6VarA, iz0Var4, ux2Var4);
                o67.n(yj5VarL2, iz0Var3, ux2Var4);
                o67.n(Integer.valueOf(iHashCode2), iz0Var2, ux2Var4);
                o67.l(ux2Var4);
                o67.n(fs4VarS2, iz0Var, ux2Var4);
                zw5 zw5Var = un4.a;
                cs4 cs4Var2 = cs4Var;
                qs7.b(i6 + ".", androidx.compose.foundation.layout.b.p(cs4Var, 24.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var4.j(zw5Var)).b.j, ux2Var, 48, 0, 131068);
                qs7.c(g77.s(h77Var.b, h77Var.c, new c77(((rn4) ux2Var.j(zw5Var)).a.q, 0L, ms2.r, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530), 0L, ux2Var, 24), androidx.compose.ui.platform.a.a(cs4Var2, h77Var.a), ((rn4) ux2Var.j(zw5Var)).a.q, 0L, 0L, 0L, 0, false, 0, 0, null, null, ((rn4) ux2Var.j(zw5Var)).b.j, ux2Var, 0, 0, 262136);
                ux2 ux2Var5 = ux2Var;
                ux2Var5.p(true);
                i4 = 1;
                f = 1.0f;
                iz0Var4 = iz0Var4;
                iz0Var2 = iz0Var2;
                iz0Var3 = iz0Var3;
                function0 = function0;
                i5 = i6;
                f2 = 0.0f;
                iz0Var = iz0Var;
                cs4Var = cs4Var2;
                i3 = 0;
                ux2Var4 = ux2Var5;
            }
            ux2Var4.p(i3);
            ux2Var4.p(i4);
            fs4Var2 = cs4Var;
            ux2Var2 = ux2Var4;
        } else {
            ux2Var3.Q();
            fs4Var2 = fs4Var;
            ux2Var2 = ux2Var3;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new l64((byte) 24, i, arrayList, fs4Var2);
        }
    }

    public static final void b(int i, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i2;
        ux2 ux2Var2;
        function0.getClass();
        ux2Var.Y(-1251108763);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                objK = new yd7(function0, (byte) 7);
                ux2Var.g0(objK);
            }
            cs4 cs4Var = cs4.b;
            ux2Var2 = ux2Var;
            m77.g((Function0) objK, ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 24.0f, 7), null, false, null, null, g68.n, ux2Var2, 1572864, 60);
            fs4Var = cs4Var;
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new g53(function0, fs4Var, i, b);
        }
    }

    public static final void c(int i, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i2;
        fs4 fs4Var2;
        function0.getClass();
        ux2Var.Y(-511611887);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) ux2Var.j(lh.b);
            String str = (String) lv0.o0(ob7.a(m77.z(R.string.settings_twoFactorAuthentication_tab_description, ux2Var)));
            if (str == null) {
                str = "";
            }
            boolean zH = ux2Var.h(context) | ((i3 & 14) == 4);
            Object objK = ux2Var.K();
            if (zH || objK == e01.a) {
                objK = new b20(context, function0, (byte) 3);
                ux2Var.g0(objK);
            }
            Map mapSingletonMap = Collections.singletonMap(str, new i77((Function0) objK));
            mapSingletonMap.getClass();
            String strB = ob7.b(m77.z(R.string.settings_twoFactorAuthentication_tab_description, ux2Var));
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-settings-tfa-UrlText");
            zw5 zw5Var = un4.a;
            qs7.c(g77.s(strB, mapSingletonMap, new c77(((rn4) ux2Var.j(zw5Var)).a.a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), 0L, ux2Var, 24), fs4VarA, ((rn4) ux2Var.j(zw5Var)).a.s, 0L, 0L, 0L, 0, false, 0, 0, null, null, new ot7(0L, 0L, null, 0L, 5, 0L, 16744447), ux2Var, 0, 0, 262136);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new g53(function0, fs4Var2, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x010b  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void d(Function0 function0, fs4 fs4Var, pw6 pw6Var, boolean z, String str, iw2 iw2Var, ux2 ux2Var, int i, int i2) {
        int i3;
        String str2;
        iw2 iw2Var2;
        boolean z2;
        pw6 pw6Var2;
        boolean z3;
        fs4 fs4Var2;
        j56 j56VarR;
        qf6 qf6VarA;
        int i4;
        boolean z4;
        boolean z5;
        String str3;
        int i5;
        function0.getClass();
        iw2Var.getClass();
        ux2Var.Y(1039667960);
        if ((i & 6) == 0) {
            i3 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= ux2Var.g(z) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                str2 = str;
                i3 |= ux2Var.f(str2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                iw2Var2 = iw2Var;
                if (ux2Var.h(iw2Var2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            } else {
                iw2Var2 = iw2Var;
            }
            if ((74899 & i3) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ux2Var.N(i3 & 1, z2)) {
                ux2Var.S();
                if ((i & 1) != 0 || ux2Var.x()) {
                    if (i6 != 0) {
                        fs4Var = cs4.b;
                    }
                    qf6VarA = sf6.a(8.0f);
                    i4 = i3 & (-897);
                    z4 = i7 == 0 ? z : true;
                    if (i8 != 0) {
                        boolean z6 = z4;
                        str3 = "";
                        z5 = z6;
                        pw6Var2 = qf6VarA;
                    } else {
                        pw6Var2 = qf6VarA;
                        z5 = z4;
                    }
                    ux2Var.q();
                    au8.p(function0, androidx.compose.ui.platform.a.a(fs4Var, str3 + "-TVTextButton"), z5, pw6Var2, null, null, iw2Var2, ux2Var, (i4 & 14) | ((i4 >> 3) & 896) | ((i4 << 12) & 1879048192), 496);
                    z3 = z5;
                    str2 = str3;
                } else {
                    ux2Var.Q();
                    i4 = i3 & (-897);
                    pw6Var2 = pw6Var;
                    z5 = z;
                }
                str3 = str2;
                ux2Var.q();
                au8.p(function0, androidx.compose.ui.platform.a.a(fs4Var, str3 + "-TVTextButton"), z5, pw6Var2, null, null, iw2Var2, ux2Var, (i4 & 14) | ((i4 >> 3) & 896) | ((i4 << 12) & 1879048192), 496);
                z3 = z5;
                str2 = str3;
            } else {
                ux2Var.Q();
                pw6Var2 = pw6Var;
                z3 = z;
            }
            fs4Var2 = fs4Var;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new w4(function0, fs4Var2, pw6Var2, z3, str2, iw2Var, i, i2);
            }
        }
        i3 |= 24576;
        str2 = str;
        if ((196608 & i) == 0) {
            iw2Var2 = iw2Var;
            if (ux2Var.h(iw2Var2)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        } else {
            iw2Var2 = iw2Var;
        }
        if ((74899 & i3) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ux2Var.N(i3 & 1, z2)) {
            ux2Var.S();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    fs4Var = cs4.b;
                }
                qf6VarA = sf6.a(8.0f);
                i4 = i3 & (-897);
                if (i7 == 0) {
                }
                if (i8 != 0) {
                    boolean z7 = z4;
                    str3 = "";
                    z5 = z7;
                    pw6Var2 = qf6VarA;
                } else {
                    pw6Var2 = qf6VarA;
                    z5 = z4;
                    str3 = str2;
                }
            } else {
                if (i6 != 0) {
                    fs4Var = cs4.b;
                }
                qf6VarA = sf6.a(8.0f);
                i4 = i3 & (-897);
                if (i7 == 0) {
                }
                if (i8 != 0) {
                    boolean z8 = z4;
                    str3 = "";
                    z5 = z8;
                    pw6Var2 = qf6VarA;
                } else {
                    pw6Var2 = qf6VarA;
                    z5 = z4;
                    str3 = str2;
                }
            }
            ux2Var.q();
            au8.p(function0, androidx.compose.ui.platform.a.a(fs4Var, str3 + "-TVTextButton"), z5, pw6Var2, null, null, iw2Var2, ux2Var, (i4 & 14) | ((i4 >> 3) & 896) | ((i4 << 12) & 1879048192), 496);
            z3 = z5;
            str2 = str3;
        } else {
            ux2Var.Q();
            pw6Var2 = pw6Var;
            z3 = z;
        }
        fs4Var2 = fs4Var;
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new w4(function0, fs4Var2, pw6Var2, z3, str2, iw2Var, i, i2);
        }
    }

    public static x98 e(String str) {
        String str2 = wg5.n;
        StringBuilder sb = new StringBuilder();
        sb.append("file:");
        if (str != null) {
            sb.append(str);
        }
        return new x98(sb.toString(), str2, "file", null, str);
    }

    public static final int f(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final int g(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int h(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final we8 i(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            we8 we8Var = tag instanceof we8 ? (we8) tag : null;
            if (we8Var != null) {
                return we8Var;
            }
            Object objQ = i67.q(view);
            view = objQ instanceof View ? (View) objQ : null;
        }
        return null;
    }

    public static final String j(x98 x98Var) {
        List listK = k(x98Var);
        String str = x98Var.b;
        if (listK.isEmpty()) {
            return null;
        }
        String str2 = x98Var.e;
        str2.getClass();
        if (!bc7.N(false, str2, str)) {
            str = "";
        }
        return lv0.t0(listK, x98Var.b, str, null, null, 60);
    }

    public static final List k(x98 x98Var) {
        String str = x98Var.e;
        if (str == null) {
            return ea2.m;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iY = ub7.Y(str, '/', i2, 4);
            if (iY == -1) {
                iY = str.length();
            }
            String strSubstring = str.substring(i2, iY);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iY;
        }
        return arrayList;
    }

    public static int l(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        hk0.g(fx3.e(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final int m(String str) {
        if (!bc7.N(false, str, "#")) {
            gk0.h("Invalid color value ".concat(str));
            return 0;
        }
        int length = str.length();
        if (length == 4) {
            int iZ = h57.z(str.substring(1));
            return ((iZ & 15) * 17) | (((iZ >> 8) & 15) * 1114112) | (((iZ >> 4) & 15) * 4352) | (-16777216);
        }
        if (length == 5) {
            int iZ2 = h57.z(str.substring(1));
            return ((iZ2 & 15) * 17) | (((iZ2 >> 12) & 15) * 285212672) | (((iZ2 >> 8) & 15) * 1114112) | (((iZ2 >> 4) & 15) * 4352) | (-16777216);
        }
        if (length == 7) {
            return h57.z(str.substring(1)) | (-16777216);
        }
        if (length != 9) {
            return -16777216;
        }
        return h57.z(str.substring(1));
    }

    public static final float n(String str, in1 in1Var) {
        in1Var.getClass();
        if (str == null) {
            return 0.0f;
        }
        if (bc7.G(false, str, "dp")) {
            return Float.parseFloat(ub7.j0(str, "dp"));
        }
        if (bc7.G(false, str, "px")) {
            return in1Var.R(Float.parseFloat(ub7.j0(str, "px")));
        }
        yq4.r("value should ends with dp or px");
        return 0.0f;
    }

    public static final int o(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1073910849) {
            if (iHashCode != -436781190) {
                if (iHashCode == 94742715 && str.equals("clamp")) {
                    return 0;
                }
            } else if (str.equals("repeated")) {
                return 1;
            }
        } else if (str.equals("mirror")) {
            return 2;
        }
        yq4.r("unknown tileMode: ".concat(str));
        return 0;
    }

    public static final String p(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    g68.j(0, i2, bArr.length);
                    return new String(bArr, 0, i2, vn0.a);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String strSubstring = str.substring(i + 1, i3);
                    qf0.s(16);
                    bArr[i2] = (byte) Integer.parseInt(strSubstring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                    bArr[i2] = (byte) str.charAt(i);
                    i2++;
                    i++;
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static final xu7 q(yu7 yu7Var, zu7 zu7Var, qe5 qe5Var, boolean z, ux2 ux2Var) {
        boolean zF = ux2Var.f(zu7Var);
        Object objK = ux2Var.K();
        if (zF || objK == e01.a) {
            objK = new xu7(yu7Var, zu7Var);
            ux2Var.g0(objK);
        }
        xu7 xu7Var = (xu7) objK;
        xu7Var.f2551o.setValue(qe5Var);
        xu7Var.p.setValue(Boolean.valueOf(z));
        return xu7Var;
    }

    public static final Object r(Set set, Object obj, Object obj2, Enum r4, boolean z) {
        Object obj3;
        if (!z) {
            if (r4 != null) {
                set = lv0.T0(fv6.b0(set, r4));
            }
            return lv0.G0(set);
        }
        if (set.contains(obj)) {
            obj3 = obj;
        } else {
            obj3 = set.contains(obj2) ? obj2 : null;
        }
        if (im3.n(obj3, obj) && im3.n(r4, obj2)) {
            return null;
        }
        return r4 == null ? obj3 : r4;
    }

    public static x98 s(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = wg5.n;
        String strL = !im3.n(str2, "/") ? bc7.L(str, str2, "/") : str;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < strL.length()) {
            char cCharAt = strL.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/' && i3 == -1) {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (strL.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int iMin = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, strL.length());
        int iMin2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, iMin);
        if (i5 != -1) {
            strSubstring2 = strL.substring(0, i6);
            strSubstring = strL.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i3 != -1 ? strL.substring(i3, iMin2) : null;
        String strSubstring4 = i4 != -1 ? strL.substring(i4, iMin) : null;
        String strSubstring5 = i2 != -1 ? strL.substring(i2, strL.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strP = strSubstring2 != null ? p(strSubstring2, bArr) : null;
        String strP2 = strSubstring != null ? p(strSubstring, bArr) : null;
        String strP3 = strSubstring3 != null ? p(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            p(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            p(strSubstring5, bArr);
        }
        return new x98(strL, str2, strP, strP2, strP3);
    }

    public static void t(int i, int i2) {
        String strX;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strX = x67.x("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    hk0.g(fx3.e(i2, "negative size: "));
                    return;
                }
                strX = x67.x("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strX);
        }
    }

    public static void u(int i, int i2) {
        if (i < 0 || i > i2) {
            hk0.r(w(i, i2, "index"));
        }
    }

    public static void v(int i, int i2, int i3) {
        String strW;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strW = w(i, i3, "start index");
            } else {
                strW = (i2 < 0 || i2 > i3) ? w(i2, i3, "end index") : x67.x("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strW);
        }
    }

    public static String w(int i, int i2, String str) {
        if (i < 0) {
            return x67.x("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return x67.x("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        hk0.g(fx3.e(i2, "negative size: "));
        return null;
    }
}
