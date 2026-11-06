package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.Layout;
import android.util.Base64;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.io.IOException;
import java.io.Serializable;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class it1 {
    public static int b;
    public static ep3 c;
    public final /* synthetic */ byte a;

    public /* synthetic */ it1(byte b2) {
        this.a = b2;
    }

    public static final float A(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = xs7.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : qg3.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float B(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = xs7.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? qg3.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final Object C(ky2 ky2Var, my2 my2Var) {
        ky2Var.getClass();
        if (ky2Var.l(my2Var)) {
            return ky2Var.k(my2Var);
        }
        return null;
    }

    public static final Object D(ky2 ky2Var, my2 my2Var, int i) {
        ky2Var.getClass();
        ky2Var.o(my2Var);
        cj2 cj2Var = ky2Var.m;
        ly2 ly2Var = my2Var.d;
        cj2Var.getClass();
        m17 m17Var = cj2Var.a;
        if (!ly2Var.f1418o) {
            hk0.g("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object obj = m17Var.get(ly2Var);
        if (i < (obj == null ? 0 : ((List) obj).size())) {
            ky2Var.o(my2Var);
            if (ly2Var.f1418o) {
                Object obj2 = m17Var.get(ly2Var);
                if (obj2 != null) {
                    return my2Var.a(((List) obj2).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            hk0.g("getRepeatedField() can only be called on repeated fields.");
        }
        return null;
    }

    public static final int E(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static String F(SharedPreferences sharedPreferences, String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        str.getClass();
        sharedPreferences.getClass();
        KeyPair keyPairY = y();
        byte[] bArrDecode = Base64.decode(sharedPreferences.getString(str, ""), 0);
        bArrDecode.getClass();
        PrivateKey privateKey = keyPairY != null ? keyPairY.getPrivate() : null;
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.getClass();
            cipher.init(2, privateKey);
            byte[] bArrDoFinal = cipher.doFinal(bArrDecode);
            bArrDoFinal.getClass();
            return bc7.F(bArrDoFinal);
        } catch (Exception e) {
            ye4.c("MFAUtils", "Decryption failed: ".concat(ct1.Y(e)));
            return null;
        }
    }

    public static final PackageInfo G(PackageManager packageManager, String str, int i) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(i));
            packageInfo.getClass();
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, i);
        packageInfo2.getClass();
        return packageInfo2;
    }

    public static final int H(Integer num) {
        if (num != null && num.intValue() == 0) {
            return R.string.tv_options_Automatic;
        }
        if (num != null && num.intValue() == 1) {
            return R.string.tv_options_OptimizeQuality;
        }
        return (num != null && num.intValue() == 2) ? R.string.tv_options_OptimizeSpeed : R.string.tv_options_Automatic;
    }

    public static final boolean I(LayoutNode layoutNode) {
        int iOrdinal = layoutNode.v().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            gk0.s();
                            return false;
                        }
                        LayoutNode layoutNodeF = layoutNode.F();
                        if (layoutNodeF != null) {
                            return I(layoutNodeF);
                        }
                        hk0.g("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean J(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final void K(gl0 gl0Var, hc1 hc1Var, boolean z) {
        Object objR = gl0Var.r();
        Throwable thD = gl0Var.d(objR);
        Object sc6Var = thD != null ? new sc6(thD) : gl0Var.e(objR);
        if (!z) {
            hc1Var.resumeWith(sc6Var);
            return;
        }
        hc1Var.getClass();
        a22 a22Var = (a22) hc1Var;
        jc1 jc1Var = a22Var.q;
        Object obj = a22Var.s;
        de1 context = jc1Var.getContext();
        Object objY = j51.Y(context, obj);
        t78 t78VarZ = objY != j51.y ? j51.Z(jc1Var, context, objY) : null;
        try {
            jc1Var.resumeWith(sc6Var);
        } finally {
            if (t78VarZ == null || t78VarZ.g0()) {
                j51.Q(context, objY);
            }
        }
    }

    public static boolean L(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final long M(long j, long j2) {
        int iD;
        int iF = gt7.f(j);
        int iE = gt7.e(j);
        if ((gt7.f(j2) < gt7.e(j)) && (gt7.f(j) < gt7.e(j2))) {
            if ((gt7.f(j2) <= gt7.f(j)) && (gt7.e(j) <= gt7.e(j2))) {
                iF = gt7.f(j2);
                iE = iF;
            } else {
                if ((gt7.f(j) <= gt7.f(j2)) && (gt7.e(j2) <= gt7.e(j))) {
                    iD = gt7.d(j2);
                } else {
                    int iF2 = gt7.f(j2);
                    if (iF >= gt7.e(j2) || iF2 > iF) {
                        iE = gt7.f(j2);
                    } else {
                        iF = gt7.f(j2);
                        iD = gt7.d(j2);
                    }
                }
                iE -= iD;
            }
        } else if (iE > gt7.f(j2)) {
            iF -= gt7.d(j2);
            iD = gt7.d(j2);
            iE -= iD;
        }
        return h57.a(iF, iE);
    }

    public static final boolean N(String str, Function0 function0) {
        try {
            boolean zBooleanValue = ((Boolean) function0.a()).booleanValue();
            if (!zBooleanValue) {
                io.sentry.android.core.v0.c("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            io.sentry.android.core.v0.c("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            io.sentry.android.core.v0.c("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            io.sentry.android.core.v0.c("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00df  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01de  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void a(final wt1 wt1Var, final ns1 ns1Var, final fs4 fs4Var, Function0 function0, boolean z, ux2 ux2Var, final int i, final int i2) {
        int i3;
        Function0 function1;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        final Function0 function2;
        final boolean z4;
        j56 j56VarR;
        Function0 function3;
        boolean z5;
        boolean z6;
        boolean z7;
        ks1 ks1Var;
        Function0 function4;
        Object objK;
        ux2 ux2Var2 = ux2Var;
        ns1Var.getClass();
        ux2Var2.Y(1883283412);
        if ((i & 6) == 0) {
            i3 = (ux2Var2.h(wt1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var2.h(ns1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var2.f(fs4Var) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                function1 = function0;
                i3 |= ux2Var2.h(function1) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    if (ux2Var2.g(z2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ux2Var2.N(i3 & 1, z3)) {
                    if (i6 != 0) {
                        objK = ux2Var2.K();
                        if (objK == e01.a) {
                            objK = new vr1((byte) 11);
                            ux2Var2.g0(objK);
                        }
                        function3 = (Function0) objK;
                    } else {
                        function3 = function1;
                    }
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    fs4 fs4VarD = ka0.D(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), 16.0f, 0.0f, 2);
                    kw0 kw0VarA = iw0.a(iq8.c, xz2.B, ux2Var2, 48);
                    int iHashCode = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL = ux2Var2.l();
                    fs4 fs4VarS = uf0.s(ux2Var2, fs4VarD);
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
                    ux2Var2.U(-46613388, ns1Var);
                    ls1 ls1Var = ns1Var.c;
                    if (ns1Var.u == js1.n) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    hi7 hi7Var = hi7.Size72dp;
                    cs4 cs4Var = cs4.b;
                    ds1.f(ls1Var, z6, hi7Var, androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), "TVTA-devicesScreen-deviceInfoScreen-avatar"), ux2Var2, 3456, 0);
                    fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), "TVTA-devicesScreen-deviceInfoScreen-name");
                    String str = ns1Var.b;
                    h72 h72Var = un4.a;
                    qs7.b(str, fs4VarA, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, new qo7(3), 0L, 2, false, 2, 0, null, ((rn4) ux2Var2.j(h72Var)).b.f, ux2Var, 48, 24960, 109560);
                    ux2Var2 = ux2Var;
                    if (z5) {
                        ux2Var2.W(-1444189837);
                        ks1Var = ns1Var.t;
                        boolean z8 = wt1Var.e;
                        String str2 = ns1Var.m;
                        if (ht1.a[ks1Var.ordinal()] == 1) {
                            function4 = function3;
                        } else {
                            function4 = null;
                        }
                        b(ks1Var, null, z8, str2, function4, ux2Var, 0);
                        ux2Var2 = ux2Var;
                        z7 = false;
                        ux2Var2.p(false);
                    } else {
                        z7 = false;
                        ux2Var2.W(-1443693000);
                        ux2Var2.p(false);
                    }
                    ux2Var2.p(z7);
                    ux2Var2.p(true);
                    function2 = function3;
                    z4 = z5;
                } else {
                    ux2Var2.Q();
                    function2 = function1;
                    z4 = z2;
                }
                j56VarR = ux2Var2.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.ft1
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            it1.a(wt1Var, ns1Var, fs4Var, function2, z4, (ux2) obj, yo1.Y(i | 1), i2);
                            return f88.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            z2 = z;
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var2.N(i3 & 1, z3)) {
                if (i6 != 0) {
                    objK = ux2Var2.K();
                    if (objK == e01.a) {
                        objK = new vr1((byte) 11);
                        ux2Var2.g0(objK);
                    }
                    function3 = (Function0) objK;
                } else {
                    function3 = function1;
                }
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                fs4 fs4VarD2 = ka0.D(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), 16.0f, 0.0f, 2);
                kw0 kw0VarA2 = iw0.a(iq8.c, xz2.B, ux2Var2, 48);
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarD2);
                yz0.c.getClass();
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(LayoutNode.e0);
                } else {
                    ux2Var2.j0();
                }
                o67.n(kw0VarA2, d82.v, ux2Var2);
                o67.n(yj5VarL2, d82.u, ux2Var2);
                o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var2);
                o67.l(ux2Var2);
                o67.n(fs4VarS2, d82.t, ux2Var2);
                ux2Var2.U(-46613388, ns1Var);
                ls1 ls1Var2 = ns1Var.c;
                if (ns1Var.u == js1.n) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                hi7 hi7Var2 = hi7.Size72dp;
                cs4 cs4Var2 = cs4.b;
                ds1.f(ls1Var2, z6, hi7Var2, androidx.compose.ui.platform.a.a(ka0.F(cs4Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), "TVTA-devicesScreen-deviceInfoScreen-avatar"), ux2Var2, 3456, 0);
                fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(ka0.F(cs4Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7), "TVTA-devicesScreen-deviceInfoScreen-name");
                String str3 = ns1Var.b;
                h72 h72Var2 = un4.a;
                qs7.b(str3, fs4VarA2, ((rn4) ux2Var2.j(h72Var2)).a.q, 0L, null, 0L, new qo7(3), 0L, 2, false, 2, 0, null, ((rn4) ux2Var2.j(h72Var2)).b.f, ux2Var, 48, 24960, 109560);
                ux2Var2 = ux2Var;
                if (z5) {
                    ux2Var2.W(-1444189837);
                    ks1Var = ns1Var.t;
                    boolean z9 = wt1Var.e;
                    String str4 = ns1Var.m;
                    if (ht1.a[ks1Var.ordinal()] == 1) {
                        function4 = function3;
                    } else {
                        function4 = null;
                    }
                    b(ks1Var, null, z9, str4, function4, ux2Var, 0);
                    ux2Var2 = ux2Var;
                    z7 = false;
                    ux2Var2.p(false);
                } else {
                    z7 = false;
                    ux2Var2.W(-1443693000);
                    ux2Var2.p(false);
                }
                ux2Var2.p(z7);
                ux2Var2.p(true);
                function2 = function3;
                z4 = z5;
            } else {
                ux2Var2.Q();
                function2 = function1;
                z4 = z2;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.ft1
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        it1.a(wt1Var, ns1Var, fs4Var, function2, z4, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i3 |= 3072;
        function1 = function0;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                if (ux2Var2.g(z2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var2.N(i3 & 1, z3)) {
                if (i6 != 0) {
                    objK = ux2Var2.K();
                    if (objK == e01.a) {
                        objK = new vr1((byte) 11);
                        ux2Var2.g0(objK);
                    }
                    function3 = (Function0) objK;
                } else {
                    function3 = function1;
                }
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                fs4 fs4VarD3 = ka0.D(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), 16.0f, 0.0f, 2);
                kw0 kw0VarA3 = iw0.a(iq8.c, xz2.B, ux2Var2, 48);
                int iHashCode3 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL3 = ux2Var2.l();
                fs4 fs4VarS3 = uf0.s(ux2Var2, fs4VarD3);
                yz0.c.getClass();
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(LayoutNode.e0);
                } else {
                    ux2Var2.j0();
                }
                o67.n(kw0VarA3, d82.v, ux2Var2);
                o67.n(yj5VarL3, d82.u, ux2Var2);
                o67.n(Integer.valueOf(iHashCode3), d82.w, ux2Var2);
                o67.l(ux2Var2);
                o67.n(fs4VarS3, d82.t, ux2Var2);
                ux2Var2.U(-46613388, ns1Var);
                ls1 ls1Var3 = ns1Var.c;
                if (ns1Var.u == js1.n) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                hi7 hi7Var3 = hi7.Size72dp;
                cs4 cs4Var3 = cs4.b;
                ds1.f(ls1Var3, z6, hi7Var3, androidx.compose.ui.platform.a.a(ka0.F(cs4Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7), "TVTA-devicesScreen-deviceInfoScreen-avatar"), ux2Var2, 3456, 0);
                fs4 fs4VarA3 = androidx.compose.ui.platform.a.a(ka0.F(cs4Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7), "TVTA-devicesScreen-deviceInfoScreen-name");
                String str5 = ns1Var.b;
                h72 h72Var3 = un4.a;
                qs7.b(str5, fs4VarA3, ((rn4) ux2Var2.j(h72Var3)).a.q, 0L, null, 0L, new qo7(3), 0L, 2, false, 2, 0, null, ((rn4) ux2Var2.j(h72Var3)).b.f, ux2Var, 48, 24960, 109560);
                ux2Var2 = ux2Var;
                if (z5) {
                    ux2Var2.W(-1444189837);
                    ks1Var = ns1Var.t;
                    boolean z10 = wt1Var.e;
                    String str6 = ns1Var.m;
                    if (ht1.a[ks1Var.ordinal()] == 1) {
                        function4 = function3;
                    } else {
                        function4 = null;
                    }
                    b(ks1Var, null, z10, str6, function4, ux2Var, 0);
                    ux2Var2 = ux2Var;
                    z7 = false;
                    ux2Var2.p(false);
                } else {
                    z7 = false;
                    ux2Var2.W(-1443693000);
                    ux2Var2.p(false);
                }
                ux2Var2.p(z7);
                ux2Var2.p(true);
                function2 = function3;
                z4 = z5;
            } else {
                ux2Var2.Q();
                function2 = function1;
                z4 = z2;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.ft1
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        it1.a(wt1Var, ns1Var, fs4Var, function2, z4, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i3 |= 24576;
        z2 = z;
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ux2Var2.N(i3 & 1, z3)) {
            if (i6 != 0) {
                objK = ux2Var2.K();
                if (objK == e01.a) {
                    objK = new vr1((byte) 11);
                    ux2Var2.g0(objK);
                }
                function3 = (Function0) objK;
            } else {
                function3 = function1;
            }
            if (i4 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            fs4 fs4VarD4 = ka0.D(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), 16.0f, 0.0f, 2);
            kw0 kw0VarA4 = iw0.a(iq8.c, xz2.B, ux2Var2, 48);
            int iHashCode4 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL4 = ux2Var2.l();
            fs4 fs4VarS4 = uf0.s(ux2Var2, fs4VarD4);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA4, d82.v, ux2Var2);
            o67.n(yj5VarL4, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode4), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS4, d82.t, ux2Var2);
            ux2Var2.U(-46613388, ns1Var);
            ls1 ls1Var4 = ns1Var.c;
            if (ns1Var.u == js1.n) {
                z6 = true;
            } else {
                z6 = false;
            }
            hi7 hi7Var4 = hi7.Size72dp;
            cs4 cs4Var4 = cs4.b;
            ds1.f(ls1Var4, z6, hi7Var4, androidx.compose.ui.platform.a.a(ka0.F(cs4Var4, 0.0f, 0.0f, 0.0f, 16.0f, 7), "TVTA-devicesScreen-deviceInfoScreen-avatar"), ux2Var2, 3456, 0);
            fs4 fs4VarA4 = androidx.compose.ui.platform.a.a(ka0.F(cs4Var4, 0.0f, 0.0f, 0.0f, 8.0f, 7), "TVTA-devicesScreen-deviceInfoScreen-name");
            String str7 = ns1Var.b;
            h72 h72Var4 = un4.a;
            qs7.b(str7, fs4VarA4, ((rn4) ux2Var2.j(h72Var4)).a.q, 0L, null, 0L, new qo7(3), 0L, 2, false, 2, 0, null, ((rn4) ux2Var2.j(h72Var4)).b.f, ux2Var, 48, 24960, 109560);
            ux2Var2 = ux2Var;
            if (z5) {
                ux2Var2.W(-1444189837);
                ks1Var = ns1Var.t;
                boolean z11 = wt1Var.e;
                String str8 = ns1Var.m;
                if (ht1.a[ks1Var.ordinal()] == 1) {
                    function4 = function3;
                } else {
                    function4 = null;
                }
                b(ks1Var, null, z11, str8, function4, ux2Var, 0);
                ux2Var2 = ux2Var;
                z7 = false;
                ux2Var2.p(false);
            } else {
                z7 = false;
                ux2Var2.W(-1443693000);
                ux2Var2.p(false);
            }
            ux2Var2.p(z7);
            ux2Var2.p(true);
            function2 = function3;
            z4 = z5;
        } else {
            ux2Var2.Q();
            function2 = function1;
            z4 = z2;
        }
        j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.ft1
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    it1.a(wt1Var, ns1Var, fs4Var, function2, z4, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final void b(final ks1 ks1Var, fs4 fs4Var, final boolean z, final String str, final Function0 function0, ux2 ux2Var, final int i) {
        ux2 ux2Var2;
        fs4 fs4Var2;
        j56 j56VarR;
        hw2 xaVar;
        String strM;
        fs4 fs4Var3;
        ux2 ux2Var3;
        ks1Var.getClass();
        ux2Var.Y(381032229);
        byte b2 = 2;
        int i2 = i | (ux2Var.d(ks1Var.ordinal()) ? 4 : 2) | 48 | (ux2Var.g(z) ? 256 : 128) | (ux2Var.f(str) ? 2048 : 1024) | (ux2Var.h(function0) ? 16384 : 8192) | 196608;
        if (ux2Var.N(i2 & 1, (74899 & i2) != 74898)) {
            ks1 ks1Var2 = ks1.n;
            fs4 fs4VarB = cs4.b;
            if (ks1Var == ks1Var2 && z && (str == null || ub7.b0(str))) {
                ux2Var.W(-266975595);
                vt1.d(fs4VarB, ux2Var, 6);
                ux2Var.p(false);
                j56VarR = ux2Var.r();
                if (j56VarR == null) {
                    return;
                }
                final byte b3 = 0;
                xaVar = new hw2(ks1Var, z, str, function0, i, b3) { // from class: o.gt1
                    public final /* synthetic */ byte m;
                    public final /* synthetic */ ks1 n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    public final /* synthetic */ boolean f920o;
                    public final /* synthetic */ String p;
                    public final /* synthetic */ Function0 q;

                    {
                        this.m = b3;
                    }

                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = this.m;
                        f88 f88Var = f88.a;
                        switch (b4) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iY = yo1.Y(1);
                                it1.b(this.n, cs4.b, this.f920o, this.p, this.q, (ux2) obj, iY);
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                int iY2 = yo1.Y(1);
                                it1.b(this.n, cs4.b, this.f920o, this.p, this.q, (ux2) obj, iY2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iY3 = yo1.Y(1);
                                it1.b(this.n, cs4.b, this.f920o, this.p, this.q, (ux2) obj, iY3);
                                break;
                        }
                        return f88Var;
                    }
                };
            } else {
                ux2Var.W(-266906403);
                ux2Var.p(false);
                int iOrdinal = ks1Var.ordinal();
                if (iOrdinal == 0) {
                    strM = to7.m(ux2Var, -266793501, R.string.device_tab_device_details_bookmarked_chip, ux2Var, false);
                } else if (iOrdinal == 1) {
                    ux2Var.W(-266650529);
                    if (str != null) {
                        String str2 = !ub7.b0(str) ? str : null;
                        if (str2 != null) {
                            strM = m77.A(R.string.device_tab_device_details_managed_by_chip, new Object[]{str2}, ux2Var);
                            ux2Var.p(false);
                        }
                    }
                    ux2Var.p(false);
                    j56VarR = ux2Var.r();
                    if (j56VarR == null) {
                        return;
                    }
                    final byte b4 = 1;
                    xaVar = new hw2(ks1Var, z, str, function0, i, b4) { // from class: o.gt1
                        public final /* synthetic */ byte m;
                        public final /* synthetic */ ks1 n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ boolean f920o;
                        public final /* synthetic */ String p;
                        public final /* synthetic */ Function0 q;

                        {
                            this.m = b4;
                        }

                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b5 = this.m;
                            f88 f88Var = f88.a;
                            switch (b5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = yo1.Y(1);
                                    it1.b(this.n, cs4.b, this.f920o, this.p, this.q, (ux2) obj, iY);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int iY2 = yo1.Y(1);
                                    it1.b(this.n, cs4.b, this.f920o, this.p, this.q, (ux2) obj, iY2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY3 = yo1.Y(1);
                                    it1.b(this.n, cs4.b, this.f920o, this.p, this.q, (ux2) obj, iY3);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                } else {
                    if (iOrdinal != 2) {
                        throw fx3.m(1099770260, ux2Var, false);
                    }
                    ux2Var.W(-266419393);
                    ux2Var.p(false);
                    j56VarR = ux2Var.r();
                    if (j56VarR == null) {
                        return;
                    }
                    final byte b5 = 2;
                    xaVar = new hw2(ks1Var, z, str, function0, i, b5) { // from class: o.gt1
                        public final /* synthetic */ byte m;
                        public final /* synthetic */ ks1 n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ boolean f920o;
                        public final /* synthetic */ String p;
                        public final /* synthetic */ Function0 q;

                        {
                            this.m = b5;
                        }

                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b6 = this.m;
                            f88 f88Var = f88.a;
                            switch (b6) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = yo1.Y(1);
                                    it1.b(this.n, cs4.b, this.f920o, this.p, this.q, (ux2) obj, iY);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int iY2 = yo1.Y(1);
                                    it1.b(this.n, cs4.b, this.f920o, this.p, this.q, (ux2) obj, iY2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY3 = yo1.Y(1);
                                    it1.b(this.n, cs4.b, this.f920o, this.p, this.q, (ux2) obj, iY3);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                }
                String str3 = strM;
                fs4 fs4VarJ = iq8.j(fs4VarB, sf6.a(8.0f));
                h72 h72Var = un4.a;
                fs4 fs4VarS = au8.s(fs4VarJ, ((rn4) ux2Var.j(h72Var)).a.G, kh.V);
                if (function0 != null) {
                    fs4VarB = androidx.compose.foundation.b.b(fs4VarB, false, null, null, function0, 15);
                    fs4Var3 = fs4VarB;
                } else {
                    fs4Var3 = fs4VarB;
                }
                fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.C(fs4VarS.f(fs4VarB), 12.0f, 4.0f), "TVTA-devicesScreen-deviceInfoScreen-chip-deviceType");
                dg6 dg6VarA = cg6.a(new ew(8.0f, new hk0(b2)), xz2.y, ux2Var, 54);
                int iHashCode = Long.hashCode(ux2Var.T);
                yj5 yj5VarL = ux2Var.l();
                fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarA);
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
                o67.n(fs4VarS2, d82.t, ux2Var);
                if (ks1Var == ks1.m) {
                    ux2Var.W(920848708);
                    ux2Var3 = ux2Var;
                    td3.b(lv1.T(R.drawable.ic_info, ux2Var, 0), null, androidx.compose.foundation.layout.b.l(fs4Var3, 12.0f), ((rn4) ux2Var.j(h72Var)).a.q, ux2Var3, 440, 0);
                    ux2Var3.p(false);
                } else {
                    ux2Var3 = ux2Var;
                    ux2Var3.W(921101761);
                    ux2Var3.p(false);
                }
                qs7.b(str3, null, ((rn4) ux2Var3.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var3.j(h72Var)).b.f952o, ux2Var, 0, 24960, 110586);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                fs4Var2 = fs4Var3;
            }
            j56VarR.d = xaVar;
        }
        ux2Var2 = ux2Var;
        ux2Var2.Q();
        fs4Var2 = fs4Var;
        j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            xaVar = new xa(ks1Var, fs4Var2, z, str, function0, i);
            j56VarR.d = xaVar;
        }
    }

    public static final void c(boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        Function1 function2;
        fs4 fs4Var2;
        ux2Var.Y(350083815);
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function2 = function1;
            i2 |= ux2Var.h(function2) ? 32 : 16;
        } else {
            function2 = function1;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f("TVTA-settings-savePasswords") ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            fs4Var2 = fs4Var;
            i2 |= ux2Var.f(fs4Var2) ? 2048 : 1024;
        } else {
            fs4Var2 = fs4Var;
        }
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            l47.d(new sk7(y57.g(R.string.settings_save_passwords), y57.g(R.string.settings_save_passwords_subtitle), new yk7(R.drawable.password), null, 24), z, function2, fs4Var2, "TVTA-settings-savePasswords", m77.z(R.string.settings_save_passwords, ux2Var), ux2Var, ((i2 << 3) & 1008) | (i2 & 7168) | ((i2 << 6) & 57344), 32);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new kc(z, function1, fs4Var, i, (byte) 3);
        }
    }

    public static final void d(boolean z, Function0 function0, Function0 function1, Function0 function2, fs4 fs4Var, ux2 ux2Var, int i) {
        boolean z2;
        int i2;
        ux2 ux2Var2 = ux2Var;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        ux2Var2.Y(1489304207);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (ux2Var2.g(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var2.h(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var2.h(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var2.f(fs4Var) ? 16384 : 8192;
        }
        if (ux2Var2.N(i2 & 1, (i2 & 9363) != 9362)) {
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            fs4 fs4VarB = ka0.B(fs4Var.f(fillElement), 24.0f);
            bw bwVar = iq8.c;
            w50 w50Var = xz2.A;
            kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarB);
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
            qs1.k((i2 >> 9) & 14, function2, ux2Var2, null);
            kw0 kw0VarA2 = iw0.a(iq8.g, w50Var, ux2Var2, 6);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fillElement);
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
            Object[] objArr = new Object[0];
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new ti4((byte) 20);
                ux2Var2.g0(objK);
            }
            px4 px4Var = (px4) zu1.L(objArr, (Function0) objK, ux2Var2, 48);
            String str = (String) px4Var.getValue();
            h72 h72Var = un4.a;
            qs7.b(str, null, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.e, ux2Var, 0, 0, 131066);
            ux2Var2 = ux2Var;
            boolean zF = ux2Var2.f(px4Var);
            Object objK2 = ux2Var2.K();
            if (zF || objK2 == awVar) {
                objK2 = new va(px4Var, (byte) 17);
                ux2Var2.g0(objK2);
            }
            et1.g(0, (Function1) objK2, ux2Var2, ka0.D(androidx.compose.foundation.layout.b.f(new s14(1.0f, false), 0.0f, 240.0f, 1), 24.0f, 0.0f, 2).f(new z53(xz2.B)));
            l47.g((i2 & 14) | 3072 | (i2 & 112) | (i2 & 896), function0, function1, ux2Var2, ka0.B(androidx.compose.foundation.layout.b.c(cs4.b, 1.0f), 24.0f), z2);
            ux2Var2.p(true);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new q75(z, function0, function1, function2, fs4Var, i, (byte) 0);
        }
    }

    public static final void e(sj5 sj5Var, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        String str;
        ux2Var.Y(1561678165);
        int i2 = (ux2Var.f(sj5Var) ? 4 : 2) | i | 432;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) ux2Var.j(lh.b);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = h57.p(Boolean.FALSE);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) objK;
            boolean z = sj5Var instanceof qj5;
            if (!z && !(sj5Var instanceof rj5) && !(sj5Var instanceof nj5) && !(sj5Var instanceof pj5) && !(sj5Var instanceof mj5) && !(sj5Var instanceof oj5)) {
                gk0.s();
                return;
            }
            px4Var.setValue(Boolean.TRUE);
            boolean zBooleanValue = ((Boolean) px4Var.getValue()).booleanValue();
            cs4 cs4Var = cs4.b;
            if (zBooleanValue) {
                ux2Var.W(869067559);
                if (z) {
                    str = "Overlay";
                } else if (sj5Var instanceof rj5) {
                    str = "Storage";
                } else if (sj5Var instanceof nj5) {
                    str = "Location";
                } else if (sj5Var instanceof pj5) {
                    str = "Notifications";
                } else if (sj5Var instanceof mj5) {
                    str = "Camera";
                } else {
                    if (!(sj5Var instanceof oj5)) {
                        gk0.s();
                        return;
                    }
                    str = "Microphone";
                }
                String strConcat = "TVTA-settings-permissions-".concat(str);
                sk7 sk7Var = new sk7(y57.g(sj5Var.a), y57.g(sj5Var.b), new yk7(sj5Var.c), null, 24);
                boolean zH = ux2Var.h(context) | ((i2 & 14) == 4);
                Object objK2 = ux2Var.K();
                if (zH || objK2 == awVar) {
                    objK2 = new ql1(sj5Var, context, (byte) 23);
                    ux2Var.g0(objK2);
                }
                Function0 function0 = (Function0) objK2;
                fs4Var2 = cs4Var;
                x37.e(sk7Var, fs4Var2, null, function0, strConcat, ux2Var, 48, 36);
                ux2Var.p(false);
            } else {
                fs4Var2 = cs4Var;
                ux2Var.W(869479053);
                ux2Var.p(false);
            }
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new l64((byte) 8, i, sj5Var, fs4Var2);
        }
    }

    public static final void f(boolean z, boolean z2, Function1 function1, int i, Function0 function0, fs4 fs4Var, String str, ux2 ux2Var, int i2) {
        String str2;
        function1.getClass();
        function0.getClass();
        ux2Var.Y(1879407578);
        int i3 = i2 | (ux2Var.g(z) ? 4 : 2) | (ux2Var.g(z2) ? 32 : 16) | (ux2Var.h(function1) ? 256 : 128) | (ux2Var.d(i) ? 2048 : 1024) | (ux2Var.h(function0) ? 16384 : 8192) | (ux2Var.f(fs4Var) ? 131072 : 65536) | 1572864;
        if (ux2Var.N(i3 & 1, (599187 & i3) != 599186)) {
            if (z) {
                ux2Var.W(237772294);
                k(i, ((i3 >> 6) & 7168) | ((i3 >> 9) & 126) | 384, function0, ux2Var, fs4Var);
                ux2Var.p(false);
            } else {
                ux2Var.W(237939477);
                c(z2, function1, fs4Var, ux2Var, ((i3 >> 6) & 7168) | ((i3 >> 3) & 126) | 384);
                ux2Var.p(false);
            }
            str2 = "TVTA-settings-savePasswords";
        } else {
            ux2Var.Q();
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ic(z, z2, function1, i, function0, fs4Var, str2, i2, (byte) 3);
        }
    }

    public static final void g(int i, String str, ux2 ux2Var, fs4 fs4Var) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        str.getClass();
        ux2Var2.Y(-2111941689);
        int i2 = i | (ux2Var2.f(str) ? 4 : 2) | 48;
        if (ux2Var2.N(i2 & 1, (i2 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = ka0.C(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 64.0f, 24.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.B, ux2Var2, 48);
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
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            String strA = m77.A(R.string.device_tab_add_contact_no_results_title, new Object[]{str}, ux2Var2);
            h72 h72Var = un4.a;
            qs7.b(strA, ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 4.0f, 7), 0L, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.h, ux2Var, 48, 0, 130044);
            qs7.b(m77.z(R.string.device_tab_add_contact_no_results_subtitle, ux2Var), androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0L, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.k, ux2Var, 48, 0, 130044);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new gx0(str, fs4Var2, i, (byte) 6);
        }
    }

    public static final void h(String str, Function1 function1, String str2, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        fs4 fs4Var2;
        yy0 yy0VarO;
        str.getClass();
        function1.getClass();
        str2.getClass();
        ux2Var.Y(148464670);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(str2) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), "TVTA-devices-add-contact-bottom-sheet-search-input");
            qf6 qf6Var = sf6.a;
            ri5 ri5Var = new ri5(50.0f);
            qf6 qf6Var2 = new qf6(ri5Var, ri5Var, ri5Var, ri5Var);
            h72 h72Var = un4.a;
            long j = ((rn4) ux2Var.j(h72Var)).a.G;
            long j2 = ((rn4) ux2Var.j(h72Var)).a.G;
            long j3 = rv0.g;
            cq7 cq7VarL = yl7.l(0L, j, j2, j3, j3, 0L, 0L, 0L, 0L, ux2Var, 2147477455, 4095);
            if (str.length() > 0) {
                ux2Var.W(-904555443);
                yy0VarO = au8.O(-1684501821, new gg4(function1, (byte) 12), ux2Var);
                ux2Var.p(false);
            } else {
                ux2Var.W(-904249752);
                ux2Var.p(false);
                yy0VarO = null;
            }
            bt1.e(str, function1, fs4VarA, false, false, null, null, au8.O(1243354693, new qa(str2, (byte) 7), ux2Var), ga0.q, yy0VarO, null, false, null, null, null, true, 0, 0, qf6Var2, cq7VarL, ux2Var, (i3 & 14) | 113246208 | (i3 & 112), 12582912, 1965176);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new p5((Object) str, (Object) function1, (Object) str2, fs4Var2, i, (byte) 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:136:0x020d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0210  */
    /* JADX WARN: Code duplicated, block: B:141:0x021a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0232  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:166:0x0313  */
    /* JADX WARN: Code duplicated, block: B:170:0x0339  */
    /* JADX WARN: Code duplicated, block: B:174:0x0361  */
    /* JADX WARN: Code duplicated, block: B:178:0x0389  */
    /* JADX WARN: Code duplicated, block: B:184:0x03db  */
    /* JADX WARN: Code duplicated, block: B:187:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:188:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:191:0x0401  */
    /* JADX WARN: Code duplicated, block: B:195:0x0416  */
    /* JADX WARN: Code duplicated, block: B:198:0x042f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0438  */
    /* JADX WARN: Code duplicated, block: B:202:0x0441  */
    /* JADX WARN: Code duplicated, block: B:203:0x0443  */
    /* JADX WARN: Code duplicated, block: B:207:0x045b  */
    /* JADX WARN: Code duplicated, block: B:213:0x049d  */
    /* JADX WARN: Code duplicated, block: B:217:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:221:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:224:0x0502  */
    /* JADX WARN: Code duplicated, block: B:230:0x0511  */
    /* JADX WARN: Code duplicated, block: B:234:0x0526 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x052d  */
    /* JADX WARN: Code duplicated, block: B:240:0x055f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x0561  */
    /* JADX WARN: Code duplicated, block: B:244:0x0587 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x058e  */
    /* JADX WARN: Code duplicated, block: B:250:0x05c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:253:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:256:0x05f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:257:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:260:0x0609  */
    /* JADX WARN: Code duplicated, block: B:261:0x0613  */
    /* JADX WARN: Code duplicated, block: B:264:0x062d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:265:0x062f  */
    /* JADX WARN: Code duplicated, block: B:268:0x064e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x0650  */
    /* JADX WARN: Code duplicated, block: B:272:0x0660  */
    /* JADX WARN: Code duplicated, block: B:273:0x066f  */
    /* JADX WARN: Code duplicated, block: B:275:0x0677  */
    /* JADX WARN: Code duplicated, block: B:276:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:279:0x06de  */
    /* JADX WARN: Code duplicated, block: B:281:0x06ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:282:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:285:0x0708 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:286:0x070a  */
    /* JADX WARN: Code duplicated, block: B:289:0x0722 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:292:0x0727  */
    /* JADX WARN: Code duplicated, block: B:295:0x074d  */
    /* JADX WARN: Code duplicated, block: B:298:0x0761  */
    /* JADX WARN: Code duplicated, block: B:300:0x077f  */
    /* JADX WARN: Code duplicated, block: B:303:0x0794  */
    /* JADX WARN: Code duplicated, block: B:305:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:306:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:309:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:312:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:315:0x07c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:316:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:319:0x07e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:320:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:323:0x07fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:324:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:327:0x0812 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:328:0x0814  */
    /* JADX WARN: Code duplicated, block: B:330:0x0842  */
    /* JADX WARN: Code duplicated, block: B:333:0x0856  */
    /* JADX WARN: Code duplicated, block: B:335:0x0874 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:336:0x0876  */
    /* JADX WARN: Code duplicated, block: B:339:0x089e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:340:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:342:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:345:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:347:0x08f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:350:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:352:0x090e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r16v33 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v2, types: [o.hc1] */
    /* JADX WARN: Type inference failed for: r20v3, types: [o.hc1] */
    /* JADX WARN: Type inference failed for: r6v19, types: [o.hc1] */
    /* JADX WARN: Type inference failed for: r6v20, types: [o.hc1] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v39 */
    public static final void i(final SupportSession supportSession, fs4 fs4Var, final boolean z, final List list, final Function1 function1, final Function1 function2, final Function1 function3, final Function0 function0, vx6 vx6Var, final Function1 function4, final Function0 function5, final Function1 function6, su6 su6Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        int i4;
        vx6 vx6Var2;
        final fs4 fs4Var2;
        final su6 su6Var2;
        final su6 su6Var3;
        fs4 fs4Var3;
        fs4 fs4Var4;
        boolean z2;
        boolean zH;
        Object objK;
        aw awVar;
        int i5;
        boolean z3;
        Object objK2;
        boolean zG;
        Object objK3;
        en3 en3VarH;
        yr6 yr6Var;
        boolean zH2;
        Object objK4;
        boolean zH3;
        Object objK5;
        boolean zH4;
        Object objK6;
        boolean zH5;
        Object objK7;
        boolean zH6;
        Object objK8;
        boolean zH7;
        Object objK9;
        lt6 lt6Var;
        boolean zH8;
        Object objK10;
        OffsetDateTime offsetDateTime;
        ?? ValueOf;
        OffsetDateTime validUntil;
        boolean zH9;
        Object objK11;
        byte b2;
        Object objValueOf;
        Boolean boolValueOf;
        boolean z4;
        boolean zH10;
        String str;
        Object ju6Var;
        Boolean bool;
        byte b3;
        boolean z5;
        boolean zF;
        Object objK12;
        boolean zF2;
        Object objK13;
        boolean z6;
        boolean zF3;
        Object objK14;
        boolean zH11;
        Object ko2Var;
        ?? r6;
        boolean zF4;
        Object objK15;
        boolean zH12;
        Object objK16;
        px4 px4Var;
        ?? r20;
        boolean zH13;
        Object objK17;
        final px4 px4Var2;
        boolean zH14;
        Object objK18;
        Object objK19;
        byte b4;
        boolean zF5;
        Object objK20;
        yr6 yr6Var2;
        boolean zF6;
        Object objK21;
        px4 px4Var3;
        final byte b5;
        SupportSession supportSession2;
        fs4 fs4Var5;
        boolean z7;
        boolean zH15;
        Object objK22;
        boolean zH16;
        Object objK23;
        boolean zH17;
        Object objK24;
        SupportSession supportSession3;
        boolean z8;
        boolean z9;
        boolean zH18;
        Object objK25;
        boolean zH19;
        Object objK26;
        boolean zH20;
        Object objK27;
        boolean zH21;
        Object objK28;
        boolean zF7;
        Object objK29;
        boolean zF8;
        Object objK30;
        boolean zH22;
        Object objK31;
        Object objK32;
        Object objK33;
        ux2 ux2Var2 = ux2Var;
        supportSession.getClass();
        ux2Var2.Y(-1911138421);
        if ((i & 6) == 0) {
            i3 = (ux2Var2.h(supportSession) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        if ((i & 384) == 0) {
            i6 |= ux2Var2.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= (i & 4096) == 0 ? ux2Var2.f(list) : ux2Var2.h(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= ux2Var2.h(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= ux2Var2.h(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i6 |= ux2Var2.h(function3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i6 |= ux2Var2.h(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i6 |= (i & 134217728) == 0 ? ux2Var2.f(vx6Var) : ux2Var2.h(vx6Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i6 |= ux2Var2.h(function4) ? 536870912 : 268435456;
        }
        int i7 = i6;
        if ((i2 & 6) == 0) {
            i4 = i2 | (ux2Var2.h(function5) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var2.h(function6) ? 32 : 16;
        }
        int i8 = i4;
        if ((i2 & 384) == 0) {
            i8 |= 128;
        }
        if (ux2Var2.N(i7 & 1, ((306783379 & i7) == 306783378 && (i8 & 147) == 146) ? false : true)) {
            ux2Var2.S();
            if ((i & 1) == 0 || ux2Var2.x()) {
                dl5 dl5Var = new dl5(new oq6((byte) 29), (byte) 1);
                we8 we8VarA = id4.a(ux2Var2);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    su6Var3 = (su6) g57.t(w86.a.b(su6.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var2);
                    fs4Var3 = cs4.b;
                }
            } else {
                ux2Var2.Q();
                fs4Var3 = fs4Var;
                su6Var3 = su6Var;
            }
            ux2Var2.q();
            String strZ = m77.z(R.string.session_default_name, ux2Var2);
            px4 px4VarT = h57.t(function4, ux2Var2);
            px4 px4VarT2 = h57.t(function5, ux2Var2);
            px4 px4VarT3 = h57.t(function6, ux2Var2);
            final px4 px4VarT4 = h57.t(function0, ux2Var2);
            px4 px4VarT5 = h57.t(function1, ux2Var2);
            px4 px4VarT6 = h57.t(function2, ux2Var2);
            px4 px4VarT7 = h57.t(function3, ux2Var2);
            px4 px4VarG = g57.g(su6Var3.u, ux2Var2);
            SupportSession supportSession4 = ((it6) px4VarG.getValue()).a;
            boolean z10 = z && su6Var3.b1();
            if (z) {
                it6 it6Var = (it6) su6Var3.u.m.getValue();
                fs4Var4 = fs4Var3;
                if (it6Var.a != null && (!it6Var.h || !it6Var.i || !it6Var.j || su6.Y0(it6Var))) {
                    z2 = true;
                }
                zH = ux2Var2.h(su6Var3) | ux2Var2.f(px4VarT4);
                objK = ux2Var2.K();
                awVar = e01.a;
                if (zH || objK == awVar) {
                    final byte b6 = 1;
                    objK = new Function0() { // from class: o.gu6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            Object value;
                            byte b7 = b6;
                            f88 f88Var = f88.a;
                            px4 px4Var4 = px4VarT4;
                            su6 su6Var4 = su6Var3;
                            switch (b7) {
                                case 0:
                                    l97 l97Var = su6Var4.t;
                                    do {
                                        value = l97Var.getValue();
                                    } while (!l97Var.j(value, it6.a((it6) value, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, 16383)));
                                    ((Function0) px4Var4.getValue()).a();
                                    break;
                                default:
                                    su6Var4.e1();
                                    ((Function0) px4Var4.getValue()).a();
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var2.g0(objK);
                }
                Function0 function7 = (Function0) objK;
                i5 = i7 & 896;
                if (i5 == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objK2 = ux2Var2.K();
                if (z3 || objK2 == awVar) {
                    objK2 = new q71(z);
                    ux2Var2.g0(objK2);
                }
                Function0 function8 = (Function0) objK2;
                zG = ux2Var2.g(z2);
                objK3 = ux2Var2.K();
                if (zG || objK3 == awVar) {
                    objK3 = new q71(z2);
                    ux2Var2.g0(objK3);
                }
                en3VarH = nv1.H(function8, (Function0) objK3, function7, ux2Var2);
                et1.c((i7 >> 6) & 14, ux2Var2, z);
                if (((it6) px4VarG.getValue()).k || supportSession4 == null) {
                    ux2Var2.W(-636049149);
                    ux2Var2.p(false);
                    yr6Var = null;
                } else {
                    ux2Var2.W(-636203715);
                    boolean zH23 = ux2Var2.h(su6Var3);
                    Object objK34 = ux2Var2.K();
                    if (zH23 || objK34 == awVar) {
                        objK34 = new mr6(0, su6Var3, su6.class, "dismissWaitingRoom", "dismissWaitingRoom()V", 0, (byte) 13);
                        ux2Var2.g0(objK34);
                    }
                    Function0 function9 = (Function0) ((pu3) objK34);
                    function9.getClass();
                    yr6 yr6Var3 = new yr6(supportSession4, new xg8(function9, new j68((byte) 3), new j68((byte) 4)));
                    ux2Var2.p(false);
                    yr6Var = yr6Var3;
                }
                zH2 = ux2Var2.h(su6Var3);
                objK4 = ux2Var2.K();
                if (zH2 || objK4 == awVar) {
                    objK4 = new mr6(0, su6Var3, su6.class, "showWaitingRoom", "showWaitingRoom()V", 0, (byte) 7);
                    ux2Var2.g0(objK4);
                }
                pu3 pu3Var = (pu3) objK4;
                zH3 = ux2Var2.h(su6Var3);
                objK5 = ux2Var2.K();
                if (zH3 || objK5 == awVar) {
                    objK5 = new mr6(0, su6Var3, su6.class, "showShareSessionBottomSheet", "showShareSessionBottomSheet()V", 0, (byte) 8);
                    ux2Var2.g0(objK5);
                }
                pu3 pu3Var2 = (pu3) objK5;
                zH4 = ux2Var2.h(su6Var3);
                objK6 = ux2Var2.K();
                if (zH4 || objK6 == awVar) {
                    objK6 = new mr6(0, su6Var3, su6.class, "showMoreOptionsBottomSheet", "showMoreOptionsBottomSheet()V", 0, (byte) 9);
                    ux2Var2.g0(objK6);
                }
                pu3 pu3Var3 = (pu3) objK6;
                zH5 = ux2Var2.h(su6Var3);
                objK7 = ux2Var2.K();
                if (zH5 || objK7 == awVar) {
                    objK7 = new mr6(0, su6Var3, su6.class, "assignCurrentSessionToMe", "assignCurrentSessionToMe()V", 0, (byte) 10);
                    ux2Var2.g0(objK7);
                }
                pu3 pu3Var4 = (pu3) objK7;
                zH6 = ux2Var2.h(su6Var3);
                objK8 = ux2Var2.K();
                if (zH6 || objK8 == awVar) {
                    objK8 = new mr6(0, su6Var3, su6.class, "unassignCurrentSession", "unassignCurrentSession()V", 0, (byte) 11);
                    ux2Var2.g0(objK8);
                }
                pu3 pu3Var5 = (pu3) objK8;
                zH7 = ux2Var2.h(su6Var3);
                objK9 = ux2Var2.K();
                if (zH7 || objK9 == awVar) {
                    objK9 = new mr6(0, su6Var3, su6.class, "showRemoveSessionDialog", "showRemoveSessionDialog()V", 0, (byte) 12);
                    ux2Var2.g0(objK9);
                }
                lt6Var = new lt6((Function0) pu3Var, (Function0) pu3Var3, (Function0) pu3Var2, (Function0) pu3Var4, (Function0) pu3Var5, (Function0) ((pu3) objK9));
                zH8 = ux2Var2.h(su6Var3) | ux2Var2.h(supportSession) | ux2Var2.f(strZ);
                objK10 = ux2Var2.K();
                if (!zH8 || objK10 == awVar) {
                    offsetDateTime = null;
                    objK10 = new ju6(su6Var3, supportSession, strZ, null);
                    ux2Var2.g0(objK10);
                } else {
                    offsetDateTime = null;
                }
                ck3.h(supportSession, strZ, (hw2) objK10, ux2Var2);
                if (supportSession4 != null) {
                    ValueOf = Integer.valueOf(supportSession4.getSessioncode());
                } else {
                    ValueOf = offsetDateTime;
                }
                if (supportSession4 != null) {
                    validUntil = supportSession4.getValidUntil();
                } else {
                    validUntil = offsetDateTime;
                }
                zH9 = ux2Var2.h(supportSession4) | ux2Var2.h(su6Var3);
                objK11 = ux2Var2.K();
                b2 = 13;
                if (zH9 || objK11 == awVar) {
                    objK11 = new a26(supportSession4, su6Var3, b2);
                    ux2Var2.g0(objK11);
                }
                us1.l(ValueOf, validUntil, null, (Function0) objK11, ux2Var2, 0);
                if (supportSession4 != null) {
                    objValueOf = Integer.valueOf(supportSession4.getSessioncode());
                } else {
                    objValueOf = offsetDateTime;
                }
                boolValueOf = Boolean.valueOf(z);
                if (i5 == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zH10 = z4 | ux2Var2.h(supportSession4) | ux2Var2.h(su6Var3) | ux2Var2.f(strZ);
                Object objK35 = ux2Var2.K();
                if (!zH10 || objK35 == awVar) {
                    str = strZ;
                    bool = boolValueOf;
                    b3 = 4;
                    ju6Var = new ju6(z, supportSession4, su6Var3, str, null);
                    ux2Var2.g0(ju6Var);
                } else {
                    bool = boolValueOf;
                    b3 = 4;
                    str = strZ;
                    ju6Var = objK35;
                }
                ck3.g(objValueOf, bool, str, (hw2) ju6Var, ux2Var2);
                Boolean boolValueOf2 = Boolean.valueOf(z10);
                z5 = z10;
                zF = ux2Var2.f(px4VarT5) | ux2Var2.g(z5);
                objK12 = ux2Var2.K();
                if (zF || objK12 == awVar) {
                    objK12 = new e81(px4VarT5, z5, offsetDateTime, b3);
                    ux2Var2.g0(objK12);
                }
                ck3.i(boolValueOf2, (hw2) objK12, ux2Var2);
                Boolean boolValueOf3 = Boolean.valueOf(((it6) r45.getValue()).b);
                zF2 = ux2Var2.f(px4VarT6) | ux2Var2.f(r45);
                objK13 = ux2Var2.K();
                if (zF2 || objK13 == awVar) {
                    objK13 = new ku6(px4VarT6, r45, offsetDateTime, (byte) 0);
                    ux2Var2.g0(objK13);
                }
                ck3.i(boolValueOf3, (hw2) objK13, ux2Var2);
                Boolean boolValueOf4 = Boolean.valueOf(z2);
                z6 = z2;
                zF3 = ux2Var2.f(px4VarT7) | ux2Var2.g(z6);
                objK14 = ux2Var2.K();
                if (zF3 || objK14 == awVar) {
                    objK14 = new e81(px4VarT7, z6, offsetDateTime, (byte) 5);
                    ux2Var2.g0(objK14);
                }
                ck3.i(boolValueOf4, (hw2) objK14, ux2Var2);
                if ((i7 & 234881024) != 67108864) {
                    vx6Var2 = vx6Var;
                    boolean z11 = (i7 & 134217728) == 0 && ux2Var2.h(vx6Var2);
                    zH11 = z11 | ux2Var2.h(su6Var3) | ux2Var2.h(en3VarH);
                    Object objK36 = ux2Var2.K();
                    if (!zH11 || objK36 == awVar) {
                        su6 su6Var4 = su6Var3;
                        ?? r7 = offsetDateTime;
                        ko2Var = new ko2((Object) vx6Var2, (Object) su6Var4, (Object) en3VarH, (hc1) r7, (byte) 24);
                        su6Var3 = su6Var4;
                        ux2Var2.g0(ko2Var);
                        r6 = r7;
                    } else {
                        ko2Var = objK36;
                        r6 = offsetDateTime;
                    }
                    ck3.i(vx6Var2, (hw2) ko2Var, ux2Var2);
                    Boolean boolValueOf5 = Boolean.valueOf(((it6) r45.getValue()).f1101o);
                    zF4 = ux2Var2.f(r45) | ux2Var2.f(px4VarT3);
                    objK15 = ux2Var2.K();
                    if (zF4 || objK15 == awVar) {
                        objK15 = new ku6(px4VarT3, r45, r6, (byte) 1);
                        ux2Var2.g0(objK15);
                    }
                    ck3.i(boolValueOf5, (hw2) objK15, ux2Var2);
                    zH12 = ux2Var2.h(su6Var3) | ux2Var2.f(px4VarT) | ux2Var2.f(px4VarT4);
                    objK16 = ux2Var2.K();
                    if (!zH12 || objK16 == awVar) {
                        ?? r21 = r6;
                        objK16 = new mu6(su6Var3, px4VarT, px4VarT4, r21, (byte) 0);
                        px4Var = px4VarT;
                        ux2Var2.g0(objK16);
                        r20 = r21;
                    } else {
                        px4Var = px4VarT;
                        r20 = r6;
                    }
                    f88 f88Var = f88.a;
                    ck3.i(f88Var, (hw2) objK16, ux2Var2);
                    zH13 = ux2Var2.h(su6Var3) | ux2Var2.f(px4VarT3) | ux2Var2.f(px4VarT2);
                    objK17 = ux2Var2.K();
                    if (!zH13 || objK17 == awVar) {
                        objK17 = new mu6(su6Var3, px4VarT3, px4VarT2, r20, (byte) 1);
                        px4Var2 = px4VarT2;
                        ux2Var2.g0(objK17);
                    } else {
                        px4Var2 = px4VarT2;
                    }
                    ck3.i(f88Var, (hw2) objK17, ux2Var2);
                    zH14 = ux2Var2.h(su6Var3) | ux2Var2.f(px4Var);
                    objK18 = ux2Var2.K();
                    if (zH14 || objK18 == awVar) {
                        objK18 = new k9(su6Var3, px4Var, r20, (byte) 8);
                        ux2Var2.g0(objK18);
                    }
                    ck3.i(f88Var, (hw2) objK18, ux2Var2);
                    objK19 = ux2Var2.K();
                    if (objK19 == awVar) {
                        b4 = 2;
                        objK19 = new i91(b4, r20, b3);
                        ux2Var2.g0(objK19);
                    } else {
                        b4 = 2;
                    }
                    ck3.i(f88Var, (hw2) objK19, ux2Var2);
                    zF5 = ux2Var2.f(px4VarT5) | ux2Var2.f(px4VarT7) | ux2Var2.f(px4VarT3);
                    objK20 = ux2Var2.K();
                    if (zF5 || objK20 == awVar) {
                        objK20 = new m71(px4VarT5, px4VarT7, px4VarT3, (byte) 3);
                        ux2Var2.g0(objK20);
                    }
                    ck3.e(f88Var, (Function1) objK20, ux2Var2);
                    yr6Var2 = yr6Var;
                    zF6 = ux2Var2.f(px4VarT3) | ux2Var2.h(yr6Var2);
                    objK21 = ux2Var2.K();
                    if (zF6 || objK21 == awVar) {
                        objK21 = new lr6(px4VarT3, yr6Var2, r20, (byte) 1);
                        ux2Var2.g0(objK21);
                    }
                    ck3.i(yr6Var2, (hw2) objK21, ux2Var2);
                    if (supportSession4 == 0) {
                        ux2Var2.W(-632459226);
                        ux2Var2.p(false);
                        ux2Var2 = ux2Var2;
                        fs4Var5 = fs4Var4;
                    } else {
                        ux2Var2.W(-632459225);
                        if (z) {
                            ux2Var2.W(-1534940309);
                            b5 = b4;
                            supportSession2 = supportSession4;
                            px4Var3 = px4VarG;
                            fs4Var5 = fs4Var4;
                            vt1.h(((it6) r45.getValue()).b, fs4Var5, au8.O(-1442517437, new q34(supportSession4, list, su6Var3, px4VarG, (byte) 8), ux2Var2), ux2Var2, (i7 & 112) | 384);
                            ux2Var2.p(false);
                            ux2Var2 = ux2Var2;
                        } else {
                            px4Var3 = r45;
                            b5 = b4;
                            supportSession2 = supportSession4;
                            fs4Var5 = fs4Var4;
                            ux2Var2.W(-1534156443);
                            ux2Var2 = ux2Var2;
                            xs1.l(supportSession2, lt6Var, fs4Var5, ((it6) px4Var3.getValue()).c, ux2Var2, (i7 << 3) & 896);
                            ux2Var2.p(false);
                        }
                        if (((it6) px4Var3.getValue()).l) {
                            ux2Var2.W(-1533849233);
                            zF7 = ux2Var2.f(px4Var);
                            objK29 = ux2Var2.K();
                            if (zF7 || objK29 == awVar) {
                                objK29 = new j44(px4Var, (byte) 13);
                                ux2Var2.g0(objK29);
                            }
                            Function0 function10 = (Function0) objK29;
                            zF8 = ux2Var2.f(px4Var);
                            objK30 = ux2Var2.K();
                            if (zF8 || objK30 == awVar) {
                                objK30 = new j44(px4Var, (byte) 14);
                                ux2Var2.g0(objK30);
                            }
                            Function0 function11 = (Function0) objK30;
                            zH22 = ux2Var2.h(su6Var3);
                            objK31 = ux2Var2.K();
                            if (!zH22 || objK31 == awVar) {
                                su6 su6Var5 = su6Var3;
                                objK31 = new mr6(0, su6Var5, su6.class, "dismissShareSessionBottomSheet", "dismissShareSessionBottomSheet()V", 0, (byte) 6);
                                su6Var3 = su6Var5;
                                ux2Var2.g0(objK31);
                            } else {
                                su6Var3 = su6Var3;
                            }
                            Function0 function12 = (Function0) ((pu3) objK31);
                            objK32 = ux2Var2.K();
                            if (objK32 == awVar) {
                                objK32 = new oq6((byte) 27);
                                ux2Var2.g0(objK32);
                            }
                            Function0 function13 = (Function0) objK32;
                            objK33 = ux2Var2.K();
                            if (objK33 == awVar) {
                                objK33 = new oq6((byte) 28);
                                ux2Var2.g0(objK33);
                            }
                            lq1.g(supportSession2, null, null, function10, function11, function12, function13, (Function0) objK33, ux2Var2, 14155776);
                            ux2Var2.p(false);
                        } else {
                            su6Var3 = su6Var3;
                            ux2Var2.W(-1532880545);
                            ux2Var2.p(false);
                        }
                        if (((it6) px4Var3.getValue()).m) {
                            ux2Var2.W(-1532793683);
                            supportSession3 = supportSession2;
                            if (supportSession2.getAssignedAccountId() != 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (supportSession3.getAssignedAccountId() != 0 || im3.n(supportSession3.getAssignedToMe(), Boolean.TRUE)) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            zH18 = ux2Var2.h(su6Var3);
                            objK25 = ux2Var2.K();
                            if (zH18 || objK25 == awVar) {
                                final byte b7 = 0;
                                objK25 = new Function0() { // from class: o.iu6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        byte b8 = b7;
                                        hc1 hc1Var = null;
                                        f88 f88Var2 = f88.a;
                                        su6 su6Var6 = su6Var3;
                                        switch (b8) {
                                            case 0:
                                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                                ga7.a(kt6.u);
                                                SupportSession supportSessionV0 = su6Var6.V0();
                                                if (supportSessionV0 != null) {
                                                    im3.R(e8.n(su6Var6), su6Var6.q, null, new ou6(supportSessionV0, su6Var6, hc1Var, (byte) 0), 2);
                                                }
                                                break;
                                            case 1:
                                                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                                ga7.a(kt6.v);
                                                SupportSession supportSessionV1 = su6Var6.V0();
                                                if (supportSessionV1 != null) {
                                                    im3.R(e8.n(su6Var6), su6Var6.q, null, new ou6(supportSessionV1, su6Var6, hc1Var, (byte) 1), 2);
                                                }
                                                break;
                                            default:
                                                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                                ga7.a(kt6.w);
                                                su6Var6.c1();
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                };
                                ux2Var2.g0(objK25);
                            }
                            Function0 function14 = (Function0) objK25;
                            zH19 = ux2Var2.h(su6Var3);
                            objK26 = ux2Var2.K();
                            if (zH19 || objK26 == awVar) {
                                final byte b8 = 1;
                                objK26 = new Function0() { // from class: o.iu6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        byte b9 = b8;
                                        hc1 hc1Var = null;
                                        f88 f88Var2 = f88.a;
                                        su6 su6Var6 = su6Var3;
                                        switch (b9) {
                                            case 0:
                                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                                ga7.a(kt6.u);
                                                SupportSession supportSessionV0 = su6Var6.V0();
                                                if (supportSessionV0 != null) {
                                                    im3.R(e8.n(su6Var6), su6Var6.q, null, new ou6(supportSessionV0, su6Var6, hc1Var, (byte) 0), 2);
                                                }
                                                break;
                                            case 1:
                                                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                                ga7.a(kt6.v);
                                                SupportSession supportSessionV1 = su6Var6.V0();
                                                if (supportSessionV1 != null) {
                                                    im3.R(e8.n(su6Var6), su6Var6.q, null, new ou6(supportSessionV1, su6Var6, hc1Var, (byte) 1), 2);
                                                }
                                                break;
                                            default:
                                                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                                ga7.a(kt6.w);
                                                su6Var6.c1();
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                };
                                ux2Var2.g0(objK26);
                            }
                            Function0 function15 = (Function0) objK26;
                            zH20 = ux2Var2.h(su6Var3);
                            objK27 = ux2Var2.K();
                            if (zH20 || objK27 == awVar) {
                                objK27 = new Function0() { // from class: o.iu6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        byte b9 = b5;
                                        hc1 hc1Var = null;
                                        f88 f88Var2 = f88.a;
                                        su6 su6Var6 = su6Var3;
                                        switch (b9) {
                                            case 0:
                                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                                ga7.a(kt6.u);
                                                SupportSession supportSessionV0 = su6Var6.V0();
                                                if (supportSessionV0 != null) {
                                                    im3.R(e8.n(su6Var6), su6Var6.q, null, new ou6(supportSessionV0, su6Var6, hc1Var, (byte) 0), 2);
                                                }
                                                break;
                                            case 1:
                                                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                                ga7.a(kt6.v);
                                                SupportSession supportSessionV1 = su6Var6.V0();
                                                if (supportSessionV1 != null) {
                                                    im3.R(e8.n(su6Var6), su6Var6.q, null, new ou6(supportSessionV1, su6Var6, hc1Var, (byte) 1), 2);
                                                }
                                                break;
                                            default:
                                                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                                ga7.a(kt6.w);
                                                su6Var6.c1();
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                };
                                ux2Var2.g0(objK27);
                            }
                            Function0 function16 = (Function0) objK27;
                            zH21 = ux2Var2.h(su6Var3);
                            objK28 = ux2Var2.K();
                            if (zH21 || objK28 == awVar) {
                                objK28 = new mr6(0, su6Var3, su6.class, "dismissMoreOptionsBottomSheet", "dismissMoreOptionsBottomSheet()V", 0, (byte) 3);
                                ux2Var2.g0(objK28);
                            }
                            yo1.r(z8, z9, function14, function15, function16, (Function0) ((pu3) objK28), null, null, ux2Var2, 0);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(-1531823073);
                            ux2Var2.p(false);
                        }
                        if (((it6) px4Var3.getValue()).n) {
                            ux2Var2.W(-1531756330);
                            String strZ2 = m77.z(R.string.service_queue_more_actions_remove_session, ux2Var2);
                            String strZ3 = m77.z(R.string.service_queue_remove_session_dialog_message, ux2Var2);
                            zH16 = ux2Var2.h(su6Var3);
                            objK23 = ux2Var2.K();
                            if (zH16 || objK23 == awVar) {
                                objK23 = new mr6(0, su6Var3, su6.class, "confirmRemoveSession", "confirmRemoveSession()V", 0, (byte) 4);
                                ux2Var2.g0(objK23);
                            }
                            Function0 function17 = (Function0) ((pu3) objK23);
                            zH17 = ux2Var2.h(su6Var3);
                            objK24 = ux2Var2.K();
                            if (zH17 || objK24 == awVar) {
                                objK24 = new mr6(0, su6Var3, su6.class, "dismissRemoveSessionDialog", "dismissRemoveSessionDialog()V", 0, (byte) 5);
                                ux2Var2.g0(objK24);
                            }
                            yo1.q(strZ2, strZ3, "TVTA-devicesScreen-removeSessionDialog", function17, (Function0) ((pu3) objK24), null, ux2Var2, 384);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(-1531317153);
                            ux2Var2.p(false);
                        }
                        if (((it6) px4Var3.getValue()).f1101o) {
                            ux2Var2.W(-1531252673);
                            zH15 = ux2Var2.h(su6Var3) | ux2Var2.f(px4Var2);
                            objK22 = ux2Var2.K();
                            if (!zH15 || objK22 == awVar) {
                                z7 = false;
                                final boolean z12 = false ? 1 : 0;
                                objK22 = new Function0() { // from class: o.gu6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        Object value;
                                        byte b9 = z12;
                                        f88 f88Var2 = f88.a;
                                        px4 px4Var4 = px4Var2;
                                        su6 su6Var6 = su6Var3;
                                        switch (b9) {
                                            case 0:
                                                l97 l97Var = su6Var6.t;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, it6.a((it6) value, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, 16383)));
                                                ((Function0) px4Var4.getValue()).a();
                                                break;
                                            default:
                                                su6Var6.e1();
                                                ((Function0) px4Var4.getValue()).a();
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                };
                                ux2Var2.g0(objK22);
                            } else {
                                z7 = false;
                            }
                            ct1.o(z7 ? 1 : 0, (Function0) objK22, ux2Var2, r20);
                            ux2Var2.p(z7);
                        } else {
                            z7 = false;
                            ux2Var2.W(-1531037409);
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(z7);
                    }
                    fs4Var2 = fs4Var5;
                    su6Var2 = su6Var3;
                } else {
                    vx6Var2 = vx6Var;
                }
                zH11 = z11 | ux2Var2.h(su6Var3) | ux2Var2.h(en3VarH);
                Object objK37 = ux2Var2.K();
                if (zH11) {
                    su6 su6Var6 = su6Var3;
                    ?? r8 = offsetDateTime;
                    ko2Var = new ko2((Object) vx6Var2, (Object) su6Var6, (Object) en3VarH, (hc1) r8, (byte) 24);
                    su6Var3 = su6Var6;
                    ux2Var2.g0(ko2Var);
                    r6 = r8;
                } else {
                    su6 su6Var7 = su6Var3;
                    ?? r9 = offsetDateTime;
                    ko2Var = new ko2((Object) vx6Var2, (Object) su6Var7, (Object) en3VarH, (hc1) r9, (byte) 24);
                    su6Var3 = su6Var7;
                    ux2Var2.g0(ko2Var);
                    r6 = r9;
                }
                ck3.i(vx6Var2, (hw2) ko2Var, ux2Var2);
                Boolean boolValueOf6 = Boolean.valueOf(((it6) r45.getValue()).f1101o);
                zF4 = ux2Var2.f(r45) | ux2Var2.f(px4VarT3);
                objK15 = ux2Var2.K();
                if (zF4) {
                    objK15 = new ku6(px4VarT3, r45, r6, (byte) 1);
                    ux2Var2.g0(objK15);
                } else {
                    objK15 = new ku6(px4VarT3, r45, r6, (byte) 1);
                    ux2Var2.g0(objK15);
                }
                ck3.i(boolValueOf6, (hw2) objK15, ux2Var2);
                zH12 = ux2Var2.h(su6Var3) | ux2Var2.f(px4VarT) | ux2Var2.f(px4VarT4);
                objK16 = ux2Var2.K();
                if (zH12) {
                    ?? r22 = r6;
                    objK16 = new mu6(su6Var3, px4VarT, px4VarT4, r22, (byte) 0);
                    px4Var = px4VarT;
                    ux2Var2.g0(objK16);
                    r20 = r22;
                } else {
                    ?? r23 = r6;
                    objK16 = new mu6(su6Var3, px4VarT, px4VarT4, r23, (byte) 0);
                    px4Var = px4VarT;
                    ux2Var2.g0(objK16);
                    r20 = r23;
                }
                f88 f88Var2 = f88.a;
                ck3.i(f88Var2, (hw2) objK16, ux2Var2);
                zH13 = ux2Var2.h(su6Var3) | ux2Var2.f(px4VarT3) | ux2Var2.f(px4VarT2);
                objK17 = ux2Var2.K();
                if (zH13) {
                    objK17 = new mu6(su6Var3, px4VarT3, px4VarT2, r20, (byte) 1);
                    px4Var2 = px4VarT2;
                    ux2Var2.g0(objK17);
                } else {
                    objK17 = new mu6(su6Var3, px4VarT3, px4VarT2, r20, (byte) 1);
                    px4Var2 = px4VarT2;
                    ux2Var2.g0(objK17);
                }
                ck3.i(f88Var2, (hw2) objK17, ux2Var2);
                zH14 = ux2Var2.h(su6Var3) | ux2Var2.f(px4Var);
                objK18 = ux2Var2.K();
                if (zH14) {
                    objK18 = new k9(su6Var3, px4Var, r20, (byte) 8);
                    ux2Var2.g0(objK18);
                } else {
                    objK18 = new k9(su6Var3, px4Var, r20, (byte) 8);
                    ux2Var2.g0(objK18);
                }
                ck3.i(f88Var2, (hw2) objK18, ux2Var2);
                objK19 = ux2Var2.K();
                if (objK19 == awVar) {
                    b4 = 2;
                    objK19 = new i91(b4, r20, b3);
                    ux2Var2.g0(objK19);
                } else {
                    b4 = 2;
                }
                ck3.i(f88Var2, (hw2) objK19, ux2Var2);
                zF5 = ux2Var2.f(px4VarT5) | ux2Var2.f(px4VarT7) | ux2Var2.f(px4VarT3);
                objK20 = ux2Var2.K();
                if (zF5) {
                    objK20 = new m71(px4VarT5, px4VarT7, px4VarT3, (byte) 3);
                    ux2Var2.g0(objK20);
                } else {
                    objK20 = new m71(px4VarT5, px4VarT7, px4VarT3, (byte) 3);
                    ux2Var2.g0(objK20);
                }
                ck3.e(f88Var2, (Function1) objK20, ux2Var2);
                yr6Var2 = yr6Var;
                zF6 = ux2Var2.f(px4VarT3) | ux2Var2.h(yr6Var2);
                objK21 = ux2Var2.K();
                if (zF6) {
                    objK21 = new lr6(px4VarT3, yr6Var2, r20, (byte) 1);
                    ux2Var2.g0(objK21);
                } else {
                    objK21 = new lr6(px4VarT3, yr6Var2, r20, (byte) 1);
                    ux2Var2.g0(objK21);
                }
                ck3.i(yr6Var2, (hw2) objK21, ux2Var2);
                if (supportSession4 == 0) {
                    ux2Var2.W(-632459226);
                    ux2Var2.p(false);
                    ux2Var2 = ux2Var2;
                    fs4Var5 = fs4Var4;
                } else {
                    ux2Var2.W(-632459225);
                    if (z) {
                        ux2Var2.W(-1534940309);
                        b5 = b4;
                        supportSession2 = supportSession4;
                        px4Var3 = px4VarG;
                        fs4Var5 = fs4Var4;
                        vt1.h(((it6) r45.getValue()).b, fs4Var5, au8.O(-1442517437, new q34(supportSession4, list, su6Var3, px4VarG, (byte) 8), ux2Var2), ux2Var2, (i7 & 112) | 384);
                        ux2Var2.p(false);
                        ux2Var2 = ux2Var2;
                    } else {
                        px4Var3 = r45;
                        b5 = b4;
                        supportSession2 = supportSession4;
                        fs4Var5 = fs4Var4;
                        ux2Var2.W(-1534156443);
                        ux2Var2 = ux2Var2;
                        xs1.l(supportSession2, lt6Var, fs4Var5, ((it6) px4Var3.getValue()).c, ux2Var2, (i7 << 3) & 896);
                        ux2Var2.p(false);
                    }
                    if (((it6) px4Var3.getValue()).l) {
                        ux2Var2.W(-1533849233);
                        zF7 = ux2Var2.f(px4Var);
                        objK29 = ux2Var2.K();
                        if (zF7) {
                            objK29 = new j44(px4Var, (byte) 13);
                            ux2Var2.g0(objK29);
                        } else {
                            objK29 = new j44(px4Var, (byte) 13);
                            ux2Var2.g0(objK29);
                        }
                        Function0 function18 = (Function0) objK29;
                        zF8 = ux2Var2.f(px4Var);
                        objK30 = ux2Var2.K();
                        if (zF8) {
                            objK30 = new j44(px4Var, (byte) 14);
                            ux2Var2.g0(objK30);
                        } else {
                            objK30 = new j44(px4Var, (byte) 14);
                            ux2Var2.g0(objK30);
                        }
                        Function0 function19 = (Function0) objK30;
                        zH22 = ux2Var2.h(su6Var3);
                        objK31 = ux2Var2.K();
                        if (zH22) {
                            su6 su6Var8 = su6Var3;
                            objK31 = new mr6(0, su6Var8, su6.class, "dismissShareSessionBottomSheet", "dismissShareSessionBottomSheet()V", 0, (byte) 6);
                            su6Var3 = su6Var8;
                            ux2Var2.g0(objK31);
                        } else {
                            su6 su6Var9 = su6Var3;
                            objK31 = new mr6(0, su6Var9, su6.class, "dismissShareSessionBottomSheet", "dismissShareSessionBottomSheet()V", 0, (byte) 6);
                            su6Var3 = su6Var9;
                            ux2Var2.g0(objK31);
                        }
                        Function0 function110 = (Function0) ((pu3) objK31);
                        objK32 = ux2Var2.K();
                        if (objK32 == awVar) {
                            objK32 = new oq6((byte) 27);
                            ux2Var2.g0(objK32);
                        }
                        Function0 function111 = (Function0) objK32;
                        objK33 = ux2Var2.K();
                        if (objK33 == awVar) {
                            objK33 = new oq6((byte) 28);
                            ux2Var2.g0(objK33);
                        }
                        lq1.g(supportSession2, null, null, function18, function19, function110, function111, (Function0) objK33, ux2Var2, 14155776);
                        ux2Var2.p(false);
                    } else {
                        su6Var3 = su6Var3;
                        ux2Var2.W(-1532880545);
                        ux2Var2.p(false);
                    }
                    if (((it6) px4Var3.getValue()).m) {
                        ux2Var2.W(-1532793683);
                        supportSession3 = supportSession2;
                        if (supportSession2.getAssignedAccountId() != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (supportSession3.getAssignedAccountId() != 0) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        zH18 = ux2Var2.h(su6Var3);
                        objK25 = ux2Var2.K();
                        if (zH18) {
                            final byte b9 = 0;
                            objK25 = new Function0() { // from class: o.iu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b10 = b9;
                                    hc1 hc1Var = null;
                                    f88 f88Var3 = f88.a;
                                    su6 su6Var10 = su6Var3;
                                    switch (b10) {
                                        case 0:
                                            IStatisticsHandler iStatisticsHandler = ga7.a;
                                            ga7.a(kt6.u);
                                            SupportSession supportSessionV0 = su6Var10.V0();
                                            if (supportSessionV0 != null) {
                                                im3.R(e8.n(su6Var10), su6Var10.q, null, new ou6(supportSessionV0, su6Var10, hc1Var, (byte) 0), 2);
                                            }
                                            break;
                                        case 1:
                                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                            ga7.a(kt6.v);
                                            SupportSession supportSessionV1 = su6Var10.V0();
                                            if (supportSessionV1 != null) {
                                                im3.R(e8.n(su6Var10), su6Var10.q, null, new ou6(supportSessionV1, su6Var10, hc1Var, (byte) 1), 2);
                                            }
                                            break;
                                        default:
                                            IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                            ga7.a(kt6.w);
                                            su6Var10.c1();
                                            break;
                                    }
                                    return f88Var3;
                                }
                            };
                            ux2Var2.g0(objK25);
                        } else {
                            final byte b10 = 0;
                            objK25 = new Function0() { // from class: o.iu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b11 = b10;
                                    hc1 hc1Var = null;
                                    f88 f88Var3 = f88.a;
                                    su6 su6Var10 = su6Var3;
                                    switch (b11) {
                                        case 0:
                                            IStatisticsHandler iStatisticsHandler = ga7.a;
                                            ga7.a(kt6.u);
                                            SupportSession supportSessionV0 = su6Var10.V0();
                                            if (supportSessionV0 != null) {
                                                im3.R(e8.n(su6Var10), su6Var10.q, null, new ou6(supportSessionV0, su6Var10, hc1Var, (byte) 0), 2);
                                            }
                                            break;
                                        case 1:
                                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                            ga7.a(kt6.v);
                                            SupportSession supportSessionV1 = su6Var10.V0();
                                            if (supportSessionV1 != null) {
                                                im3.R(e8.n(su6Var10), su6Var10.q, null, new ou6(supportSessionV1, su6Var10, hc1Var, (byte) 1), 2);
                                            }
                                            break;
                                        default:
                                            IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                            ga7.a(kt6.w);
                                            su6Var10.c1();
                                            break;
                                    }
                                    return f88Var3;
                                }
                            };
                            ux2Var2.g0(objK25);
                        }
                        Function0 function112 = (Function0) objK25;
                        zH19 = ux2Var2.h(su6Var3);
                        objK26 = ux2Var2.K();
                        if (zH19) {
                            final byte b11 = 1;
                            objK26 = new Function0() { // from class: o.iu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b12 = b11;
                                    hc1 hc1Var = null;
                                    f88 f88Var3 = f88.a;
                                    su6 su6Var10 = su6Var3;
                                    switch (b12) {
                                        case 0:
                                            IStatisticsHandler iStatisticsHandler = ga7.a;
                                            ga7.a(kt6.u);
                                            SupportSession supportSessionV0 = su6Var10.V0();
                                            if (supportSessionV0 != null) {
                                                im3.R(e8.n(su6Var10), su6Var10.q, null, new ou6(supportSessionV0, su6Var10, hc1Var, (byte) 0), 2);
                                            }
                                            break;
                                        case 1:
                                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                            ga7.a(kt6.v);
                                            SupportSession supportSessionV1 = su6Var10.V0();
                                            if (supportSessionV1 != null) {
                                                im3.R(e8.n(su6Var10), su6Var10.q, null, new ou6(supportSessionV1, su6Var10, hc1Var, (byte) 1), 2);
                                            }
                                            break;
                                        default:
                                            IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                            ga7.a(kt6.w);
                                            su6Var10.c1();
                                            break;
                                    }
                                    return f88Var3;
                                }
                            };
                            ux2Var2.g0(objK26);
                        } else {
                            final byte b12 = 1;
                            objK26 = new Function0() { // from class: o.iu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b13 = b12;
                                    hc1 hc1Var = null;
                                    f88 f88Var3 = f88.a;
                                    su6 su6Var10 = su6Var3;
                                    switch (b13) {
                                        case 0:
                                            IStatisticsHandler iStatisticsHandler = ga7.a;
                                            ga7.a(kt6.u);
                                            SupportSession supportSessionV0 = su6Var10.V0();
                                            if (supportSessionV0 != null) {
                                                im3.R(e8.n(su6Var10), su6Var10.q, null, new ou6(supportSessionV0, su6Var10, hc1Var, (byte) 0), 2);
                                            }
                                            break;
                                        case 1:
                                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                            ga7.a(kt6.v);
                                            SupportSession supportSessionV1 = su6Var10.V0();
                                            if (supportSessionV1 != null) {
                                                im3.R(e8.n(su6Var10), su6Var10.q, null, new ou6(supportSessionV1, su6Var10, hc1Var, (byte) 1), 2);
                                            }
                                            break;
                                        default:
                                            IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                            ga7.a(kt6.w);
                                            su6Var10.c1();
                                            break;
                                    }
                                    return f88Var3;
                                }
                            };
                            ux2Var2.g0(objK26);
                        }
                        Function0 function113 = (Function0) objK26;
                        zH20 = ux2Var2.h(su6Var3);
                        objK27 = ux2Var2.K();
                        if (zH20) {
                            objK27 = new Function0() { // from class: o.iu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b13 = b5;
                                    hc1 hc1Var = null;
                                    f88 f88Var3 = f88.a;
                                    su6 su6Var10 = su6Var3;
                                    switch (b13) {
                                        case 0:
                                            IStatisticsHandler iStatisticsHandler = ga7.a;
                                            ga7.a(kt6.u);
                                            SupportSession supportSessionV0 = su6Var10.V0();
                                            if (supportSessionV0 != null) {
                                                im3.R(e8.n(su6Var10), su6Var10.q, null, new ou6(supportSessionV0, su6Var10, hc1Var, (byte) 0), 2);
                                            }
                                            break;
                                        case 1:
                                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                            ga7.a(kt6.v);
                                            SupportSession supportSessionV1 = su6Var10.V0();
                                            if (supportSessionV1 != null) {
                                                im3.R(e8.n(su6Var10), su6Var10.q, null, new ou6(supportSessionV1, su6Var10, hc1Var, (byte) 1), 2);
                                            }
                                            break;
                                        default:
                                            IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                            ga7.a(kt6.w);
                                            su6Var10.c1();
                                            break;
                                    }
                                    return f88Var3;
                                }
                            };
                            ux2Var2.g0(objK27);
                        } else {
                            objK27 = new Function0() { // from class: o.iu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b13 = b5;
                                    hc1 hc1Var = null;
                                    f88 f88Var3 = f88.a;
                                    su6 su6Var10 = su6Var3;
                                    switch (b13) {
                                        case 0:
                                            IStatisticsHandler iStatisticsHandler = ga7.a;
                                            ga7.a(kt6.u);
                                            SupportSession supportSessionV0 = su6Var10.V0();
                                            if (supportSessionV0 != null) {
                                                im3.R(e8.n(su6Var10), su6Var10.q, null, new ou6(supportSessionV0, su6Var10, hc1Var, (byte) 0), 2);
                                            }
                                            break;
                                        case 1:
                                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                            ga7.a(kt6.v);
                                            SupportSession supportSessionV1 = su6Var10.V0();
                                            if (supportSessionV1 != null) {
                                                im3.R(e8.n(su6Var10), su6Var10.q, null, new ou6(supportSessionV1, su6Var10, hc1Var, (byte) 1), 2);
                                            }
                                            break;
                                        default:
                                            IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                            ga7.a(kt6.w);
                                            su6Var10.c1();
                                            break;
                                    }
                                    return f88Var3;
                                }
                            };
                            ux2Var2.g0(objK27);
                        }
                        Function0 function114 = (Function0) objK27;
                        zH21 = ux2Var2.h(su6Var3);
                        objK28 = ux2Var2.K();
                        if (zH21) {
                            objK28 = new mr6(0, su6Var3, su6.class, "dismissMoreOptionsBottomSheet", "dismissMoreOptionsBottomSheet()V", 0, (byte) 3);
                            ux2Var2.g0(objK28);
                        } else {
                            objK28 = new mr6(0, su6Var3, su6.class, "dismissMoreOptionsBottomSheet", "dismissMoreOptionsBottomSheet()V", 0, (byte) 3);
                            ux2Var2.g0(objK28);
                        }
                        yo1.r(z8, z9, function112, function113, function114, (Function0) ((pu3) objK28), null, null, ux2Var2, 0);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1531823073);
                        ux2Var2.p(false);
                    }
                    if (((it6) px4Var3.getValue()).n) {
                        ux2Var2.W(-1531756330);
                        String strZ4 = m77.z(R.string.service_queue_more_actions_remove_session, ux2Var2);
                        String strZ5 = m77.z(R.string.service_queue_remove_session_dialog_message, ux2Var2);
                        zH16 = ux2Var2.h(su6Var3);
                        objK23 = ux2Var2.K();
                        if (zH16) {
                            objK23 = new mr6(0, su6Var3, su6.class, "confirmRemoveSession", "confirmRemoveSession()V", 0, (byte) 4);
                            ux2Var2.g0(objK23);
                        } else {
                            objK23 = new mr6(0, su6Var3, su6.class, "confirmRemoveSession", "confirmRemoveSession()V", 0, (byte) 4);
                            ux2Var2.g0(objK23);
                        }
                        Function0 function115 = (Function0) ((pu3) objK23);
                        zH17 = ux2Var2.h(su6Var3);
                        objK24 = ux2Var2.K();
                        if (zH17) {
                            objK24 = new mr6(0, su6Var3, su6.class, "dismissRemoveSessionDialog", "dismissRemoveSessionDialog()V", 0, (byte) 5);
                            ux2Var2.g0(objK24);
                        } else {
                            objK24 = new mr6(0, su6Var3, su6.class, "dismissRemoveSessionDialog", "dismissRemoveSessionDialog()V", 0, (byte) 5);
                            ux2Var2.g0(objK24);
                        }
                        yo1.q(strZ4, strZ5, "TVTA-devicesScreen-removeSessionDialog", function115, (Function0) ((pu3) objK24), null, ux2Var2, 384);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1531317153);
                        ux2Var2.p(false);
                    }
                    if (((it6) px4Var3.getValue()).f1101o) {
                        ux2Var2.W(-1531252673);
                        zH15 = ux2Var2.h(su6Var3) | ux2Var2.f(px4Var2);
                        objK22 = ux2Var2.K();
                        if (zH15) {
                            z7 = false;
                            final byte z13 = false ? 1 : 0;
                            objK22 = new Function0() { // from class: o.gu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    Object value;
                                    byte b13 = z13;
                                    f88 f88Var3 = f88.a;
                                    px4 px4Var4 = px4Var2;
                                    su6 su6Var10 = su6Var3;
                                    switch (b13) {
                                        case 0:
                                            l97 l97Var = su6Var10.t;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, it6.a((it6) value, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, 16383)));
                                            ((Function0) px4Var4.getValue()).a();
                                            break;
                                        default:
                                            su6Var10.e1();
                                            ((Function0) px4Var4.getValue()).a();
                                            break;
                                    }
                                    return f88Var3;
                                }
                            };
                            ux2Var2.g0(objK22);
                        } else {
                            z7 = false;
                            final byte z14 = false ? 1 : 0;
                            objK22 = new Function0() { // from class: o.gu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    Object value;
                                    byte b13 = z14;
                                    f88 f88Var3 = f88.a;
                                    px4 px4Var4 = px4Var2;
                                    su6 su6Var10 = su6Var3;
                                    switch (b13) {
                                        case 0:
                                            l97 l97Var = su6Var10.t;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, it6.a((it6) value, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, 16383)));
                                            ((Function0) px4Var4.getValue()).a();
                                            break;
                                        default:
                                            su6Var10.e1();
                                            ((Function0) px4Var4.getValue()).a();
                                            break;
                                    }
                                    return f88Var3;
                                }
                            };
                            ux2Var2.g0(objK22);
                        }
                        ct1.o(z7 ? 1 : 0, (Function0) objK22, ux2Var2, r20);
                        ux2Var2.p(z7);
                    } else {
                        z7 = false;
                        ux2Var2.W(-1531037409);
                        ux2Var2.p(false);
                    }
                    ux2Var2.p(z7);
                }
                fs4Var2 = fs4Var5;
                su6Var2 = su6Var3;
            } else {
                fs4Var4 = fs4Var3;
            }
            z2 = false;
            zH = ux2Var2.h(su6Var3) | ux2Var2.f(px4VarT4);
            objK = ux2Var2.K();
            awVar = e01.a;
            if (zH) {
                final byte b13 = 1;
                objK = new Function0() { // from class: o.gu6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        Object value;
                        byte b14 = b13;
                        f88 f88Var3 = f88.a;
                        px4 px4Var4 = px4VarT4;
                        su6 su6Var10 = su6Var3;
                        switch (b14) {
                            case 0:
                                l97 l97Var = su6Var10.t;
                                do {
                                    value = l97Var.getValue();
                                } while (!l97Var.j(value, it6.a((it6) value, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, 16383)));
                                ((Function0) px4Var4.getValue()).a();
                                break;
                            default:
                                su6Var10.e1();
                                ((Function0) px4Var4.getValue()).a();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var2.g0(objK);
            } else {
                final byte b14 = 1;
                objK = new Function0() { // from class: o.gu6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        Object value;
                        byte b15 = b14;
                        f88 f88Var3 = f88.a;
                        px4 px4Var4 = px4VarT4;
                        su6 su6Var10 = su6Var3;
                        switch (b15) {
                            case 0:
                                l97 l97Var = su6Var10.t;
                                do {
                                    value = l97Var.getValue();
                                } while (!l97Var.j(value, it6.a((it6) value, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, 16383)));
                                ((Function0) px4Var4.getValue()).a();
                                break;
                            default:
                                su6Var10.e1();
                                ((Function0) px4Var4.getValue()).a();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var2.g0(objK);
            }
            Function0 function20 = (Function0) objK;
            i5 = i7 & 896;
            if (i5 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            objK2 = ux2Var2.K();
            if (z3) {
                objK2 = new q71(z);
                ux2Var2.g0(objK2);
            } else {
                objK2 = new q71(z);
                ux2Var2.g0(objK2);
            }
            Function0 function21 = (Function0) objK2;
            zG = ux2Var2.g(z2);
            objK3 = ux2Var2.K();
            if (zG) {
                objK3 = new q71(z2);
                ux2Var2.g0(objK3);
            } else {
                objK3 = new q71(z2);
                ux2Var2.g0(objK3);
            }
            en3VarH = nv1.H(function21, (Function0) objK3, function20, ux2Var2);
            et1.c((i7 >> 6) & 14, ux2Var2, z);
            if (((it6) px4VarG.getValue()).k) {
                ux2Var2.W(-636049149);
                ux2Var2.p(false);
                yr6Var = null;
            } else {
                ux2Var2.W(-636049149);
                ux2Var2.p(false);
                yr6Var = null;
            }
            zH2 = ux2Var2.h(su6Var3);
            objK4 = ux2Var2.K();
            if (zH2) {
                objK4 = new mr6(0, su6Var3, su6.class, "showWaitingRoom", "showWaitingRoom()V", 0, (byte) 7);
                ux2Var2.g0(objK4);
            } else {
                objK4 = new mr6(0, su6Var3, su6.class, "showWaitingRoom", "showWaitingRoom()V", 0, (byte) 7);
                ux2Var2.g0(objK4);
            }
            pu3 pu3Var6 = (pu3) objK4;
            zH3 = ux2Var2.h(su6Var3);
            objK5 = ux2Var2.K();
            if (zH3) {
                objK5 = new mr6(0, su6Var3, su6.class, "showShareSessionBottomSheet", "showShareSessionBottomSheet()V", 0, (byte) 8);
                ux2Var2.g0(objK5);
            } else {
                objK5 = new mr6(0, su6Var3, su6.class, "showShareSessionBottomSheet", "showShareSessionBottomSheet()V", 0, (byte) 8);
                ux2Var2.g0(objK5);
            }
            pu3 pu3Var7 = (pu3) objK5;
            zH4 = ux2Var2.h(su6Var3);
            objK6 = ux2Var2.K();
            if (zH4) {
                objK6 = new mr6(0, su6Var3, su6.class, "showMoreOptionsBottomSheet", "showMoreOptionsBottomSheet()V", 0, (byte) 9);
                ux2Var2.g0(objK6);
            } else {
                objK6 = new mr6(0, su6Var3, su6.class, "showMoreOptionsBottomSheet", "showMoreOptionsBottomSheet()V", 0, (byte) 9);
                ux2Var2.g0(objK6);
            }
            pu3 pu3Var8 = (pu3) objK6;
            zH5 = ux2Var2.h(su6Var3);
            objK7 = ux2Var2.K();
            if (zH5) {
                objK7 = new mr6(0, su6Var3, su6.class, "assignCurrentSessionToMe", "assignCurrentSessionToMe()V", 0, (byte) 10);
                ux2Var2.g0(objK7);
            } else {
                objK7 = new mr6(0, su6Var3, su6.class, "assignCurrentSessionToMe", "assignCurrentSessionToMe()V", 0, (byte) 10);
                ux2Var2.g0(objK7);
            }
            pu3 pu3Var9 = (pu3) objK7;
            zH6 = ux2Var2.h(su6Var3);
            objK8 = ux2Var2.K();
            if (zH6) {
                objK8 = new mr6(0, su6Var3, su6.class, "unassignCurrentSession", "unassignCurrentSession()V", 0, (byte) 11);
                ux2Var2.g0(objK8);
            } else {
                objK8 = new mr6(0, su6Var3, su6.class, "unassignCurrentSession", "unassignCurrentSession()V", 0, (byte) 11);
                ux2Var2.g0(objK8);
            }
            pu3 pu3Var10 = (pu3) objK8;
            zH7 = ux2Var2.h(su6Var3);
            objK9 = ux2Var2.K();
            if (zH7) {
                objK9 = new mr6(0, su6Var3, su6.class, "showRemoveSessionDialog", "showRemoveSessionDialog()V", 0, (byte) 12);
                ux2Var2.g0(objK9);
            } else {
                objK9 = new mr6(0, su6Var3, su6.class, "showRemoveSessionDialog", "showRemoveSessionDialog()V", 0, (byte) 12);
                ux2Var2.g0(objK9);
            }
            lt6Var = new lt6((Function0) pu3Var6, (Function0) pu3Var8, (Function0) pu3Var7, (Function0) pu3Var9, (Function0) pu3Var10, (Function0) ((pu3) objK9));
            zH8 = ux2Var2.h(su6Var3) | ux2Var2.h(supportSession) | ux2Var2.f(strZ);
            objK10 = ux2Var2.K();
            if (zH8) {
                offsetDateTime = null;
                objK10 = new ju6(su6Var3, supportSession, strZ, null);
                ux2Var2.g0(objK10);
            } else {
                offsetDateTime = null;
                objK10 = new ju6(su6Var3, supportSession, strZ, null);
                ux2Var2.g0(objK10);
            }
            ck3.h(supportSession, strZ, (hw2) objK10, ux2Var2);
            if (supportSession4 != null) {
                ValueOf = Integer.valueOf(supportSession4.getSessioncode());
            } else {
                ValueOf = offsetDateTime;
            }
            if (supportSession4 != null) {
                validUntil = supportSession4.getValidUntil();
            } else {
                validUntil = offsetDateTime;
            }
            zH9 = ux2Var2.h(supportSession4) | ux2Var2.h(su6Var3);
            objK11 = ux2Var2.K();
            b2 = 13;
            if (zH9) {
                objK11 = new a26(supportSession4, su6Var3, b2);
                ux2Var2.g0(objK11);
            } else {
                objK11 = new a26(supportSession4, su6Var3, b2);
                ux2Var2.g0(objK11);
            }
            us1.l(ValueOf, validUntil, null, (Function0) objK11, ux2Var2, 0);
            if (supportSession4 != null) {
                objValueOf = Integer.valueOf(supportSession4.getSessioncode());
            } else {
                objValueOf = offsetDateTime;
            }
            boolValueOf = Boolean.valueOf(z);
            if (i5 == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            zH10 = z4 | ux2Var2.h(supportSession4) | ux2Var2.h(su6Var3) | ux2Var2.f(strZ);
            Object objK38 = ux2Var2.K();
            if (zH10) {
                str = strZ;
                bool = boolValueOf;
                b3 = 4;
                ju6Var = new ju6(z, supportSession4, su6Var3, str, null);
                ux2Var2.g0(ju6Var);
            } else {
                str = strZ;
                bool = boolValueOf;
                b3 = 4;
                ju6Var = new ju6(z, supportSession4, su6Var3, str, null);
                ux2Var2.g0(ju6Var);
            }
            ck3.g(objValueOf, bool, str, (hw2) ju6Var, ux2Var2);
            Boolean boolValueOf7 = Boolean.valueOf(z10);
            z5 = z10;
            zF = ux2Var2.f(px4VarT5) | ux2Var2.g(z5);
            objK12 = ux2Var2.K();
            if (zF) {
                objK12 = new e81(px4VarT5, z5, offsetDateTime, b3);
                ux2Var2.g0(objK12);
            } else {
                objK12 = new e81(px4VarT5, z5, offsetDateTime, b3);
                ux2Var2.g0(objK12);
            }
            ck3.i(boolValueOf7, (hw2) objK12, ux2Var2);
            Boolean boolValueOf8 = Boolean.valueOf(((it6) r45.getValue()).b);
            zF2 = ux2Var2.f(px4VarT6) | ux2Var2.f(r45);
            objK13 = ux2Var2.K();
            if (zF2) {
                objK13 = new ku6(px4VarT6, r45, offsetDateTime, (byte) 0);
                ux2Var2.g0(objK13);
            } else {
                objK13 = new ku6(px4VarT6, r45, offsetDateTime, (byte) 0);
                ux2Var2.g0(objK13);
            }
            ck3.i(boolValueOf8, (hw2) objK13, ux2Var2);
            Boolean boolValueOf9 = Boolean.valueOf(z2);
            z6 = z2;
            zF3 = ux2Var2.f(px4VarT7) | ux2Var2.g(z6);
            objK14 = ux2Var2.K();
            if (zF3) {
                objK14 = new e81(px4VarT7, z6, offsetDateTime, (byte) 5);
                ux2Var2.g0(objK14);
            } else {
                objK14 = new e81(px4VarT7, z6, offsetDateTime, (byte) 5);
                ux2Var2.g0(objK14);
            }
            ck3.i(boolValueOf9, (hw2) objK14, ux2Var2);
            if ((i7 & 234881024) != 67108864) {
                vx6Var2 = vx6Var;
                if ((i7 & 134217728) == 0) {
                }
                zH11 = z11 | ux2Var2.h(su6Var3) | ux2Var2.h(en3VarH);
                Object objK39 = ux2Var2.K();
                if (zH11) {
                    su6 su6Var10 = su6Var3;
                    ?? r10 = offsetDateTime;
                    ko2Var = new ko2((Object) vx6Var2, (Object) su6Var10, (Object) en3VarH, (hc1) r10, (byte) 24);
                    su6Var3 = su6Var10;
                    ux2Var2.g0(ko2Var);
                    r6 = r10;
                } else {
                    su6 su6Var11 = su6Var3;
                    ?? r11 = offsetDateTime;
                    ko2Var = new ko2((Object) vx6Var2, (Object) su6Var11, (Object) en3VarH, (hc1) r11, (byte) 24);
                    su6Var3 = su6Var11;
                    ux2Var2.g0(ko2Var);
                    r6 = r11;
                }
                ck3.i(vx6Var2, (hw2) ko2Var, ux2Var2);
                Boolean boolValueOf10 = Boolean.valueOf(((it6) r45.getValue()).f1101o);
                zF4 = ux2Var2.f(r45) | ux2Var2.f(px4VarT3);
                objK15 = ux2Var2.K();
                if (zF4) {
                    objK15 = new ku6(px4VarT3, r45, r6, (byte) 1);
                    ux2Var2.g0(objK15);
                } else {
                    objK15 = new ku6(px4VarT3, r45, r6, (byte) 1);
                    ux2Var2.g0(objK15);
                }
                ck3.i(boolValueOf10, (hw2) objK15, ux2Var2);
                zH12 = ux2Var2.h(su6Var3) | ux2Var2.f(px4VarT) | ux2Var2.f(px4VarT4);
                objK16 = ux2Var2.K();
                if (zH12) {
                    ?? r24 = r6;
                    objK16 = new mu6(su6Var3, px4VarT, px4VarT4, r24, (byte) 0);
                    px4Var = px4VarT;
                    ux2Var2.g0(objK16);
                    r20 = r24;
                } else {
                    ?? r25 = r6;
                    objK16 = new mu6(su6Var3, px4VarT, px4VarT4, r25, (byte) 0);
                    px4Var = px4VarT;
                    ux2Var2.g0(objK16);
                    r20 = r25;
                }
                f88 f88Var3 = f88.a;
                ck3.i(f88Var3, (hw2) objK16, ux2Var2);
                zH13 = ux2Var2.h(su6Var3) | ux2Var2.f(px4VarT3) | ux2Var2.f(px4VarT2);
                objK17 = ux2Var2.K();
                if (zH13) {
                    objK17 = new mu6(su6Var3, px4VarT3, px4VarT2, r20, (byte) 1);
                    px4Var2 = px4VarT2;
                    ux2Var2.g0(objK17);
                } else {
                    objK17 = new mu6(su6Var3, px4VarT3, px4VarT2, r20, (byte) 1);
                    px4Var2 = px4VarT2;
                    ux2Var2.g0(objK17);
                }
                ck3.i(f88Var3, (hw2) objK17, ux2Var2);
                zH14 = ux2Var2.h(su6Var3) | ux2Var2.f(px4Var);
                objK18 = ux2Var2.K();
                if (zH14) {
                    objK18 = new k9(su6Var3, px4Var, r20, (byte) 8);
                    ux2Var2.g0(objK18);
                } else {
                    objK18 = new k9(su6Var3, px4Var, r20, (byte) 8);
                    ux2Var2.g0(objK18);
                }
                ck3.i(f88Var3, (hw2) objK18, ux2Var2);
                objK19 = ux2Var2.K();
                if (objK19 == awVar) {
                    b4 = 2;
                    objK19 = new i91(b4, r20, b3);
                    ux2Var2.g0(objK19);
                } else {
                    b4 = 2;
                }
                ck3.i(f88Var3, (hw2) objK19, ux2Var2);
                zF5 = ux2Var2.f(px4VarT5) | ux2Var2.f(px4VarT7) | ux2Var2.f(px4VarT3);
                objK20 = ux2Var2.K();
                if (zF5) {
                    objK20 = new m71(px4VarT5, px4VarT7, px4VarT3, (byte) 3);
                    ux2Var2.g0(objK20);
                } else {
                    objK20 = new m71(px4VarT5, px4VarT7, px4VarT3, (byte) 3);
                    ux2Var2.g0(objK20);
                }
                ck3.e(f88Var3, (Function1) objK20, ux2Var2);
                yr6Var2 = yr6Var;
                zF6 = ux2Var2.f(px4VarT3) | ux2Var2.h(yr6Var2);
                objK21 = ux2Var2.K();
                if (zF6) {
                    objK21 = new lr6(px4VarT3, yr6Var2, r20, (byte) 1);
                    ux2Var2.g0(objK21);
                } else {
                    objK21 = new lr6(px4VarT3, yr6Var2, r20, (byte) 1);
                    ux2Var2.g0(objK21);
                }
                ck3.i(yr6Var2, (hw2) objK21, ux2Var2);
                if (supportSession4 == 0) {
                    ux2Var2.W(-632459226);
                    ux2Var2.p(false);
                    ux2Var2 = ux2Var2;
                    fs4Var5 = fs4Var4;
                } else {
                    ux2Var2.W(-632459225);
                    if (z) {
                        ux2Var2.W(-1534940309);
                        b5 = b4;
                        supportSession2 = supportSession4;
                        px4Var3 = px4VarG;
                        fs4Var5 = fs4Var4;
                        vt1.h(((it6) r45.getValue()).b, fs4Var5, au8.O(-1442517437, new q34(supportSession4, list, su6Var3, px4VarG, (byte) 8), ux2Var2), ux2Var2, (i7 & 112) | 384);
                        ux2Var2.p(false);
                        ux2Var2 = ux2Var2;
                    } else {
                        px4Var3 = r45;
                        b5 = b4;
                        supportSession2 = supportSession4;
                        fs4Var5 = fs4Var4;
                        ux2Var2.W(-1534156443);
                        ux2Var2 = ux2Var2;
                        xs1.l(supportSession2, lt6Var, fs4Var5, ((it6) px4Var3.getValue()).c, ux2Var2, (i7 << 3) & 896);
                        ux2Var2.p(false);
                    }
                    if (((it6) px4Var3.getValue()).l) {
                        ux2Var2.W(-1533849233);
                        zF7 = ux2Var2.f(px4Var);
                        objK29 = ux2Var2.K();
                        if (zF7) {
                            objK29 = new j44(px4Var, (byte) 13);
                            ux2Var2.g0(objK29);
                        } else {
                            objK29 = new j44(px4Var, (byte) 13);
                            ux2Var2.g0(objK29);
                        }
                        Function0 function116 = (Function0) objK29;
                        zF8 = ux2Var2.f(px4Var);
                        objK30 = ux2Var2.K();
                        if (zF8) {
                            objK30 = new j44(px4Var, (byte) 14);
                            ux2Var2.g0(objK30);
                        } else {
                            objK30 = new j44(px4Var, (byte) 14);
                            ux2Var2.g0(objK30);
                        }
                        Function0 function117 = (Function0) objK30;
                        zH22 = ux2Var2.h(su6Var3);
                        objK31 = ux2Var2.K();
                        if (zH22) {
                            su6 su6Var12 = su6Var3;
                            objK31 = new mr6(0, su6Var12, su6.class, "dismissShareSessionBottomSheet", "dismissShareSessionBottomSheet()V", 0, (byte) 6);
                            su6Var3 = su6Var12;
                            ux2Var2.g0(objK31);
                        } else {
                            su6 su6Var13 = su6Var3;
                            objK31 = new mr6(0, su6Var13, su6.class, "dismissShareSessionBottomSheet", "dismissShareSessionBottomSheet()V", 0, (byte) 6);
                            su6Var3 = su6Var13;
                            ux2Var2.g0(objK31);
                        }
                        Function0 function118 = (Function0) ((pu3) objK31);
                        objK32 = ux2Var2.K();
                        if (objK32 == awVar) {
                            objK32 = new oq6((byte) 27);
                            ux2Var2.g0(objK32);
                        }
                        Function0 function119 = (Function0) objK32;
                        objK33 = ux2Var2.K();
                        if (objK33 == awVar) {
                            objK33 = new oq6((byte) 28);
                            ux2Var2.g0(objK33);
                        }
                        lq1.g(supportSession2, null, null, function116, function117, function118, function119, (Function0) objK33, ux2Var2, 14155776);
                        ux2Var2.p(false);
                    } else {
                        su6Var3 = su6Var3;
                        ux2Var2.W(-1532880545);
                        ux2Var2.p(false);
                    }
                    if (((it6) px4Var3.getValue()).m) {
                        ux2Var2.W(-1532793683);
                        supportSession3 = supportSession2;
                        if (supportSession2.getAssignedAccountId() != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (supportSession3.getAssignedAccountId() != 0) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        zH18 = ux2Var2.h(su6Var3);
                        objK25 = ux2Var2.K();
                        if (zH18) {
                            final byte b15 = 0;
                            objK25 = new Function0() { // from class: o.iu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b16 = b15;
                                    hc1 hc1Var = null;
                                    f88 f88Var4 = f88.a;
                                    su6 su6Var14 = su6Var3;
                                    switch (b16) {
                                        case 0:
                                            IStatisticsHandler iStatisticsHandler = ga7.a;
                                            ga7.a(kt6.u);
                                            SupportSession supportSessionV0 = su6Var14.V0();
                                            if (supportSessionV0 != null) {
                                                im3.R(e8.n(su6Var14), su6Var14.q, null, new ou6(supportSessionV0, su6Var14, hc1Var, (byte) 0), 2);
                                            }
                                            break;
                                        case 1:
                                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                            ga7.a(kt6.v);
                                            SupportSession supportSessionV1 = su6Var14.V0();
                                            if (supportSessionV1 != null) {
                                                im3.R(e8.n(su6Var14), su6Var14.q, null, new ou6(supportSessionV1, su6Var14, hc1Var, (byte) 1), 2);
                                            }
                                            break;
                                        default:
                                            IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                            ga7.a(kt6.w);
                                            su6Var14.c1();
                                            break;
                                    }
                                    return f88Var4;
                                }
                            };
                            ux2Var2.g0(objK25);
                        } else {
                            final byte b16 = 0;
                            objK25 = new Function0() { // from class: o.iu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b17 = b16;
                                    hc1 hc1Var = null;
                                    f88 f88Var4 = f88.a;
                                    su6 su6Var14 = su6Var3;
                                    switch (b17) {
                                        case 0:
                                            IStatisticsHandler iStatisticsHandler = ga7.a;
                                            ga7.a(kt6.u);
                                            SupportSession supportSessionV0 = su6Var14.V0();
                                            if (supportSessionV0 != null) {
                                                im3.R(e8.n(su6Var14), su6Var14.q, null, new ou6(supportSessionV0, su6Var14, hc1Var, (byte) 0), 2);
                                            }
                                            break;
                                        case 1:
                                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                            ga7.a(kt6.v);
                                            SupportSession supportSessionV1 = su6Var14.V0();
                                            if (supportSessionV1 != null) {
                                                im3.R(e8.n(su6Var14), su6Var14.q, null, new ou6(supportSessionV1, su6Var14, hc1Var, (byte) 1), 2);
                                            }
                                            break;
                                        default:
                                            IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                            ga7.a(kt6.w);
                                            su6Var14.c1();
                                            break;
                                    }
                                    return f88Var4;
                                }
                            };
                            ux2Var2.g0(objK25);
                        }
                        Function0 function1110 = (Function0) objK25;
                        zH19 = ux2Var2.h(su6Var3);
                        objK26 = ux2Var2.K();
                        if (zH19) {
                            final byte b17 = 1;
                            objK26 = new Function0() { // from class: o.iu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b18 = b17;
                                    hc1 hc1Var = null;
                                    f88 f88Var4 = f88.a;
                                    su6 su6Var14 = su6Var3;
                                    switch (b18) {
                                        case 0:
                                            IStatisticsHandler iStatisticsHandler = ga7.a;
                                            ga7.a(kt6.u);
                                            SupportSession supportSessionV0 = su6Var14.V0();
                                            if (supportSessionV0 != null) {
                                                im3.R(e8.n(su6Var14), su6Var14.q, null, new ou6(supportSessionV0, su6Var14, hc1Var, (byte) 0), 2);
                                            }
                                            break;
                                        case 1:
                                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                            ga7.a(kt6.v);
                                            SupportSession supportSessionV1 = su6Var14.V0();
                                            if (supportSessionV1 != null) {
                                                im3.R(e8.n(su6Var14), su6Var14.q, null, new ou6(supportSessionV1, su6Var14, hc1Var, (byte) 1), 2);
                                            }
                                            break;
                                        default:
                                            IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                            ga7.a(kt6.w);
                                            su6Var14.c1();
                                            break;
                                    }
                                    return f88Var4;
                                }
                            };
                            ux2Var2.g0(objK26);
                        } else {
                            final byte b18 = 1;
                            objK26 = new Function0() { // from class: o.iu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b19 = b18;
                                    hc1 hc1Var = null;
                                    f88 f88Var4 = f88.a;
                                    su6 su6Var14 = su6Var3;
                                    switch (b19) {
                                        case 0:
                                            IStatisticsHandler iStatisticsHandler = ga7.a;
                                            ga7.a(kt6.u);
                                            SupportSession supportSessionV0 = su6Var14.V0();
                                            if (supportSessionV0 != null) {
                                                im3.R(e8.n(su6Var14), su6Var14.q, null, new ou6(supportSessionV0, su6Var14, hc1Var, (byte) 0), 2);
                                            }
                                            break;
                                        case 1:
                                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                            ga7.a(kt6.v);
                                            SupportSession supportSessionV1 = su6Var14.V0();
                                            if (supportSessionV1 != null) {
                                                im3.R(e8.n(su6Var14), su6Var14.q, null, new ou6(supportSessionV1, su6Var14, hc1Var, (byte) 1), 2);
                                            }
                                            break;
                                        default:
                                            IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                            ga7.a(kt6.w);
                                            su6Var14.c1();
                                            break;
                                    }
                                    return f88Var4;
                                }
                            };
                            ux2Var2.g0(objK26);
                        }
                        Function0 function1111 = (Function0) objK26;
                        zH20 = ux2Var2.h(su6Var3);
                        objK27 = ux2Var2.K();
                        if (zH20) {
                            objK27 = new Function0() { // from class: o.iu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b19 = b5;
                                    hc1 hc1Var = null;
                                    f88 f88Var4 = f88.a;
                                    su6 su6Var14 = su6Var3;
                                    switch (b19) {
                                        case 0:
                                            IStatisticsHandler iStatisticsHandler = ga7.a;
                                            ga7.a(kt6.u);
                                            SupportSession supportSessionV0 = su6Var14.V0();
                                            if (supportSessionV0 != null) {
                                                im3.R(e8.n(su6Var14), su6Var14.q, null, new ou6(supportSessionV0, su6Var14, hc1Var, (byte) 0), 2);
                                            }
                                            break;
                                        case 1:
                                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                            ga7.a(kt6.v);
                                            SupportSession supportSessionV1 = su6Var14.V0();
                                            if (supportSessionV1 != null) {
                                                im3.R(e8.n(su6Var14), su6Var14.q, null, new ou6(supportSessionV1, su6Var14, hc1Var, (byte) 1), 2);
                                            }
                                            break;
                                        default:
                                            IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                            ga7.a(kt6.w);
                                            su6Var14.c1();
                                            break;
                                    }
                                    return f88Var4;
                                }
                            };
                            ux2Var2.g0(objK27);
                        } else {
                            objK27 = new Function0() { // from class: o.iu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b19 = b5;
                                    hc1 hc1Var = null;
                                    f88 f88Var4 = f88.a;
                                    su6 su6Var14 = su6Var3;
                                    switch (b19) {
                                        case 0:
                                            IStatisticsHandler iStatisticsHandler = ga7.a;
                                            ga7.a(kt6.u);
                                            SupportSession supportSessionV0 = su6Var14.V0();
                                            if (supportSessionV0 != null) {
                                                im3.R(e8.n(su6Var14), su6Var14.q, null, new ou6(supportSessionV0, su6Var14, hc1Var, (byte) 0), 2);
                                            }
                                            break;
                                        case 1:
                                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                            ga7.a(kt6.v);
                                            SupportSession supportSessionV1 = su6Var14.V0();
                                            if (supportSessionV1 != null) {
                                                im3.R(e8.n(su6Var14), su6Var14.q, null, new ou6(supportSessionV1, su6Var14, hc1Var, (byte) 1), 2);
                                            }
                                            break;
                                        default:
                                            IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                            ga7.a(kt6.w);
                                            su6Var14.c1();
                                            break;
                                    }
                                    return f88Var4;
                                }
                            };
                            ux2Var2.g0(objK27);
                        }
                        Function0 function1112 = (Function0) objK27;
                        zH21 = ux2Var2.h(su6Var3);
                        objK28 = ux2Var2.K();
                        if (zH21) {
                            objK28 = new mr6(0, su6Var3, su6.class, "dismissMoreOptionsBottomSheet", "dismissMoreOptionsBottomSheet()V", 0, (byte) 3);
                            ux2Var2.g0(objK28);
                        } else {
                            objK28 = new mr6(0, su6Var3, su6.class, "dismissMoreOptionsBottomSheet", "dismissMoreOptionsBottomSheet()V", 0, (byte) 3);
                            ux2Var2.g0(objK28);
                        }
                        yo1.r(z8, z9, function1110, function1111, function1112, (Function0) ((pu3) objK28), null, null, ux2Var2, 0);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1531823073);
                        ux2Var2.p(false);
                    }
                    if (((it6) px4Var3.getValue()).n) {
                        ux2Var2.W(-1531756330);
                        String strZ6 = m77.z(R.string.service_queue_more_actions_remove_session, ux2Var2);
                        String strZ7 = m77.z(R.string.service_queue_remove_session_dialog_message, ux2Var2);
                        zH16 = ux2Var2.h(su6Var3);
                        objK23 = ux2Var2.K();
                        if (zH16) {
                            objK23 = new mr6(0, su6Var3, su6.class, "confirmRemoveSession", "confirmRemoveSession()V", 0, (byte) 4);
                            ux2Var2.g0(objK23);
                        } else {
                            objK23 = new mr6(0, su6Var3, su6.class, "confirmRemoveSession", "confirmRemoveSession()V", 0, (byte) 4);
                            ux2Var2.g0(objK23);
                        }
                        Function0 function1113 = (Function0) ((pu3) objK23);
                        zH17 = ux2Var2.h(su6Var3);
                        objK24 = ux2Var2.K();
                        if (zH17) {
                            objK24 = new mr6(0, su6Var3, su6.class, "dismissRemoveSessionDialog", "dismissRemoveSessionDialog()V", 0, (byte) 5);
                            ux2Var2.g0(objK24);
                        } else {
                            objK24 = new mr6(0, su6Var3, su6.class, "dismissRemoveSessionDialog", "dismissRemoveSessionDialog()V", 0, (byte) 5);
                            ux2Var2.g0(objK24);
                        }
                        yo1.q(strZ6, strZ7, "TVTA-devicesScreen-removeSessionDialog", function1113, (Function0) ((pu3) objK24), null, ux2Var2, 384);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1531317153);
                        ux2Var2.p(false);
                    }
                    if (((it6) px4Var3.getValue()).f1101o) {
                        ux2Var2.W(-1531252673);
                        zH15 = ux2Var2.h(su6Var3) | ux2Var2.f(px4Var2);
                        objK22 = ux2Var2.K();
                        if (zH15) {
                            z7 = false;
                            final byte z15 = false ? 1 : 0;
                            objK22 = new Function0() { // from class: o.gu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    Object value;
                                    byte b19 = z15;
                                    f88 f88Var4 = f88.a;
                                    px4 px4Var4 = px4Var2;
                                    su6 su6Var14 = su6Var3;
                                    switch (b19) {
                                        case 0:
                                            l97 l97Var = su6Var14.t;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, it6.a((it6) value, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, 16383)));
                                            ((Function0) px4Var4.getValue()).a();
                                            break;
                                        default:
                                            su6Var14.e1();
                                            ((Function0) px4Var4.getValue()).a();
                                            break;
                                    }
                                    return f88Var4;
                                }
                            };
                            ux2Var2.g0(objK22);
                        } else {
                            z7 = false;
                            final byte z16 = false ? 1 : 0;
                            objK22 = new Function0() { // from class: o.gu6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    Object value;
                                    byte b19 = z16;
                                    f88 f88Var4 = f88.a;
                                    px4 px4Var4 = px4Var2;
                                    su6 su6Var14 = su6Var3;
                                    switch (b19) {
                                        case 0:
                                            l97 l97Var = su6Var14.t;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, it6.a((it6) value, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, 16383)));
                                            ((Function0) px4Var4.getValue()).a();
                                            break;
                                        default:
                                            su6Var14.e1();
                                            ((Function0) px4Var4.getValue()).a();
                                            break;
                                    }
                                    return f88Var4;
                                }
                            };
                            ux2Var2.g0(objK22);
                        }
                        ct1.o(z7 ? 1 : 0, (Function0) objK22, ux2Var2, r20);
                        ux2Var2.p(z7);
                    } else {
                        z7 = false;
                        ux2Var2.W(-1531037409);
                        ux2Var2.p(false);
                    }
                    ux2Var2.p(z7);
                }
                fs4Var2 = fs4Var5;
                su6Var2 = su6Var3;
            } else {
                vx6Var2 = vx6Var;
            }
            zH11 = z11 | ux2Var2.h(su6Var3) | ux2Var2.h(en3VarH);
            Object objK310 = ux2Var2.K();
            if (zH11) {
                su6 su6Var14 = su6Var3;
                ?? r12 = offsetDateTime;
                ko2Var = new ko2((Object) vx6Var2, (Object) su6Var14, (Object) en3VarH, (hc1) r12, (byte) 24);
                su6Var3 = su6Var14;
                ux2Var2.g0(ko2Var);
                r6 = r12;
            } else {
                su6 su6Var15 = su6Var3;
                ?? r13 = offsetDateTime;
                ko2Var = new ko2((Object) vx6Var2, (Object) su6Var15, (Object) en3VarH, (hc1) r13, (byte) 24);
                su6Var3 = su6Var15;
                ux2Var2.g0(ko2Var);
                r6 = r13;
            }
            ck3.i(vx6Var2, (hw2) ko2Var, ux2Var2);
            Boolean boolValueOf11 = Boolean.valueOf(((it6) r45.getValue()).f1101o);
            zF4 = ux2Var2.f(r45) | ux2Var2.f(px4VarT3);
            objK15 = ux2Var2.K();
            if (zF4) {
                objK15 = new ku6(px4VarT3, r45, r6, (byte) 1);
                ux2Var2.g0(objK15);
            } else {
                objK15 = new ku6(px4VarT3, r45, r6, (byte) 1);
                ux2Var2.g0(objK15);
            }
            ck3.i(boolValueOf11, (hw2) objK15, ux2Var2);
            zH12 = ux2Var2.h(su6Var3) | ux2Var2.f(px4VarT) | ux2Var2.f(px4VarT4);
            objK16 = ux2Var2.K();
            if (zH12) {
                ?? r26 = r6;
                objK16 = new mu6(su6Var3, px4VarT, px4VarT4, r26, (byte) 0);
                px4Var = px4VarT;
                ux2Var2.g0(objK16);
                r20 = r26;
            } else {
                ?? r27 = r6;
                objK16 = new mu6(su6Var3, px4VarT, px4VarT4, r27, (byte) 0);
                px4Var = px4VarT;
                ux2Var2.g0(objK16);
                r20 = r27;
            }
            f88 f88Var4 = f88.a;
            ck3.i(f88Var4, (hw2) objK16, ux2Var2);
            zH13 = ux2Var2.h(su6Var3) | ux2Var2.f(px4VarT3) | ux2Var2.f(px4VarT2);
            objK17 = ux2Var2.K();
            if (zH13) {
                objK17 = new mu6(su6Var3, px4VarT3, px4VarT2, r20, (byte) 1);
                px4Var2 = px4VarT2;
                ux2Var2.g0(objK17);
            } else {
                objK17 = new mu6(su6Var3, px4VarT3, px4VarT2, r20, (byte) 1);
                px4Var2 = px4VarT2;
                ux2Var2.g0(objK17);
            }
            ck3.i(f88Var4, (hw2) objK17, ux2Var2);
            zH14 = ux2Var2.h(su6Var3) | ux2Var2.f(px4Var);
            objK18 = ux2Var2.K();
            if (zH14) {
                objK18 = new k9(su6Var3, px4Var, r20, (byte) 8);
                ux2Var2.g0(objK18);
            } else {
                objK18 = new k9(su6Var3, px4Var, r20, (byte) 8);
                ux2Var2.g0(objK18);
            }
            ck3.i(f88Var4, (hw2) objK18, ux2Var2);
            objK19 = ux2Var2.K();
            if (objK19 == awVar) {
                b4 = 2;
                objK19 = new i91(b4, r20, b3);
                ux2Var2.g0(objK19);
            } else {
                b4 = 2;
            }
            ck3.i(f88Var4, (hw2) objK19, ux2Var2);
            zF5 = ux2Var2.f(px4VarT5) | ux2Var2.f(px4VarT7) | ux2Var2.f(px4VarT3);
            objK20 = ux2Var2.K();
            if (zF5) {
                objK20 = new m71(px4VarT5, px4VarT7, px4VarT3, (byte) 3);
                ux2Var2.g0(objK20);
            } else {
                objK20 = new m71(px4VarT5, px4VarT7, px4VarT3, (byte) 3);
                ux2Var2.g0(objK20);
            }
            ck3.e(f88Var4, (Function1) objK20, ux2Var2);
            yr6Var2 = yr6Var;
            zF6 = ux2Var2.f(px4VarT3) | ux2Var2.h(yr6Var2);
            objK21 = ux2Var2.K();
            if (zF6) {
                objK21 = new lr6(px4VarT3, yr6Var2, r20, (byte) 1);
                ux2Var2.g0(objK21);
            } else {
                objK21 = new lr6(px4VarT3, yr6Var2, r20, (byte) 1);
                ux2Var2.g0(objK21);
            }
            ck3.i(yr6Var2, (hw2) objK21, ux2Var2);
            if (supportSession4 == 0) {
                ux2Var2.W(-632459226);
                ux2Var2.p(false);
                ux2Var2 = ux2Var2;
                fs4Var5 = fs4Var4;
            } else {
                ux2Var2.W(-632459225);
                if (z) {
                    ux2Var2.W(-1534940309);
                    b5 = b4;
                    supportSession2 = supportSession4;
                    px4Var3 = px4VarG;
                    fs4Var5 = fs4Var4;
                    vt1.h(((it6) r45.getValue()).b, fs4Var5, au8.O(-1442517437, new q34(supportSession4, list, su6Var3, px4VarG, (byte) 8), ux2Var2), ux2Var2, (i7 & 112) | 384);
                    ux2Var2.p(false);
                    ux2Var2 = ux2Var2;
                } else {
                    px4Var3 = r45;
                    b5 = b4;
                    supportSession2 = supportSession4;
                    fs4Var5 = fs4Var4;
                    ux2Var2.W(-1534156443);
                    ux2Var2 = ux2Var2;
                    xs1.l(supportSession2, lt6Var, fs4Var5, ((it6) px4Var3.getValue()).c, ux2Var2, (i7 << 3) & 896);
                    ux2Var2.p(false);
                }
                if (((it6) px4Var3.getValue()).l) {
                    ux2Var2.W(-1533849233);
                    zF7 = ux2Var2.f(px4Var);
                    objK29 = ux2Var2.K();
                    if (zF7) {
                        objK29 = new j44(px4Var, (byte) 13);
                        ux2Var2.g0(objK29);
                    } else {
                        objK29 = new j44(px4Var, (byte) 13);
                        ux2Var2.g0(objK29);
                    }
                    Function0 function1114 = (Function0) objK29;
                    zF8 = ux2Var2.f(px4Var);
                    objK30 = ux2Var2.K();
                    if (zF8) {
                        objK30 = new j44(px4Var, (byte) 14);
                        ux2Var2.g0(objK30);
                    } else {
                        objK30 = new j44(px4Var, (byte) 14);
                        ux2Var2.g0(objK30);
                    }
                    Function0 function1115 = (Function0) objK30;
                    zH22 = ux2Var2.h(su6Var3);
                    objK31 = ux2Var2.K();
                    if (zH22) {
                        su6 su6Var16 = su6Var3;
                        objK31 = new mr6(0, su6Var16, su6.class, "dismissShareSessionBottomSheet", "dismissShareSessionBottomSheet()V", 0, (byte) 6);
                        su6Var3 = su6Var16;
                        ux2Var2.g0(objK31);
                    } else {
                        su6 su6Var17 = su6Var3;
                        objK31 = new mr6(0, su6Var17, su6.class, "dismissShareSessionBottomSheet", "dismissShareSessionBottomSheet()V", 0, (byte) 6);
                        su6Var3 = su6Var17;
                        ux2Var2.g0(objK31);
                    }
                    Function0 function1116 = (Function0) ((pu3) objK31);
                    objK32 = ux2Var2.K();
                    if (objK32 == awVar) {
                        objK32 = new oq6((byte) 27);
                        ux2Var2.g0(objK32);
                    }
                    Function0 function1117 = (Function0) objK32;
                    objK33 = ux2Var2.K();
                    if (objK33 == awVar) {
                        objK33 = new oq6((byte) 28);
                        ux2Var2.g0(objK33);
                    }
                    lq1.g(supportSession2, null, null, function1114, function1115, function1116, function1117, (Function0) objK33, ux2Var2, 14155776);
                    ux2Var2.p(false);
                } else {
                    su6Var3 = su6Var3;
                    ux2Var2.W(-1532880545);
                    ux2Var2.p(false);
                }
                if (((it6) px4Var3.getValue()).m) {
                    ux2Var2.W(-1532793683);
                    supportSession3 = supportSession2;
                    if (supportSession2.getAssignedAccountId() != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (supportSession3.getAssignedAccountId() != 0) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    zH18 = ux2Var2.h(su6Var3);
                    objK25 = ux2Var2.K();
                    if (zH18) {
                        final byte b19 = 0;
                        objK25 = new Function0() { // from class: o.iu6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b110 = b19;
                                hc1 hc1Var = null;
                                f88 f88Var5 = f88.a;
                                su6 su6Var18 = su6Var3;
                                switch (b110) {
                                    case 0:
                                        IStatisticsHandler iStatisticsHandler = ga7.a;
                                        ga7.a(kt6.u);
                                        SupportSession supportSessionV0 = su6Var18.V0();
                                        if (supportSessionV0 != null) {
                                            im3.R(e8.n(su6Var18), su6Var18.q, null, new ou6(supportSessionV0, su6Var18, hc1Var, (byte) 0), 2);
                                        }
                                        break;
                                    case 1:
                                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                        ga7.a(kt6.v);
                                        SupportSession supportSessionV1 = su6Var18.V0();
                                        if (supportSessionV1 != null) {
                                            im3.R(e8.n(su6Var18), su6Var18.q, null, new ou6(supportSessionV1, su6Var18, hc1Var, (byte) 1), 2);
                                        }
                                        break;
                                    default:
                                        IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                        ga7.a(kt6.w);
                                        su6Var18.c1();
                                        break;
                                }
                                return f88Var5;
                            }
                        };
                        ux2Var2.g0(objK25);
                    } else {
                        final byte b110 = 0;
                        objK25 = new Function0() { // from class: o.iu6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b111 = b110;
                                hc1 hc1Var = null;
                                f88 f88Var5 = f88.a;
                                su6 su6Var18 = su6Var3;
                                switch (b111) {
                                    case 0:
                                        IStatisticsHandler iStatisticsHandler = ga7.a;
                                        ga7.a(kt6.u);
                                        SupportSession supportSessionV0 = su6Var18.V0();
                                        if (supportSessionV0 != null) {
                                            im3.R(e8.n(su6Var18), su6Var18.q, null, new ou6(supportSessionV0, su6Var18, hc1Var, (byte) 0), 2);
                                        }
                                        break;
                                    case 1:
                                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                        ga7.a(kt6.v);
                                        SupportSession supportSessionV1 = su6Var18.V0();
                                        if (supportSessionV1 != null) {
                                            im3.R(e8.n(su6Var18), su6Var18.q, null, new ou6(supportSessionV1, su6Var18, hc1Var, (byte) 1), 2);
                                        }
                                        break;
                                    default:
                                        IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                        ga7.a(kt6.w);
                                        su6Var18.c1();
                                        break;
                                }
                                return f88Var5;
                            }
                        };
                        ux2Var2.g0(objK25);
                    }
                    Function0 function1118 = (Function0) objK25;
                    zH19 = ux2Var2.h(su6Var3);
                    objK26 = ux2Var2.K();
                    if (zH19) {
                        final byte b111 = 1;
                        objK26 = new Function0() { // from class: o.iu6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b112 = b111;
                                hc1 hc1Var = null;
                                f88 f88Var5 = f88.a;
                                su6 su6Var18 = su6Var3;
                                switch (b112) {
                                    case 0:
                                        IStatisticsHandler iStatisticsHandler = ga7.a;
                                        ga7.a(kt6.u);
                                        SupportSession supportSessionV0 = su6Var18.V0();
                                        if (supportSessionV0 != null) {
                                            im3.R(e8.n(su6Var18), su6Var18.q, null, new ou6(supportSessionV0, su6Var18, hc1Var, (byte) 0), 2);
                                        }
                                        break;
                                    case 1:
                                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                        ga7.a(kt6.v);
                                        SupportSession supportSessionV1 = su6Var18.V0();
                                        if (supportSessionV1 != null) {
                                            im3.R(e8.n(su6Var18), su6Var18.q, null, new ou6(supportSessionV1, su6Var18, hc1Var, (byte) 1), 2);
                                        }
                                        break;
                                    default:
                                        IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                        ga7.a(kt6.w);
                                        su6Var18.c1();
                                        break;
                                }
                                return f88Var5;
                            }
                        };
                        ux2Var2.g0(objK26);
                    } else {
                        final byte b112 = 1;
                        objK26 = new Function0() { // from class: o.iu6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b113 = b112;
                                hc1 hc1Var = null;
                                f88 f88Var5 = f88.a;
                                su6 su6Var18 = su6Var3;
                                switch (b113) {
                                    case 0:
                                        IStatisticsHandler iStatisticsHandler = ga7.a;
                                        ga7.a(kt6.u);
                                        SupportSession supportSessionV0 = su6Var18.V0();
                                        if (supportSessionV0 != null) {
                                            im3.R(e8.n(su6Var18), su6Var18.q, null, new ou6(supportSessionV0, su6Var18, hc1Var, (byte) 0), 2);
                                        }
                                        break;
                                    case 1:
                                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                        ga7.a(kt6.v);
                                        SupportSession supportSessionV1 = su6Var18.V0();
                                        if (supportSessionV1 != null) {
                                            im3.R(e8.n(su6Var18), su6Var18.q, null, new ou6(supportSessionV1, su6Var18, hc1Var, (byte) 1), 2);
                                        }
                                        break;
                                    default:
                                        IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                        ga7.a(kt6.w);
                                        su6Var18.c1();
                                        break;
                                }
                                return f88Var5;
                            }
                        };
                        ux2Var2.g0(objK26);
                    }
                    Function0 function1119 = (Function0) objK26;
                    zH20 = ux2Var2.h(su6Var3);
                    objK27 = ux2Var2.K();
                    if (zH20) {
                        objK27 = new Function0() { // from class: o.iu6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b113 = b5;
                                hc1 hc1Var = null;
                                f88 f88Var5 = f88.a;
                                su6 su6Var18 = su6Var3;
                                switch (b113) {
                                    case 0:
                                        IStatisticsHandler iStatisticsHandler = ga7.a;
                                        ga7.a(kt6.u);
                                        SupportSession supportSessionV0 = su6Var18.V0();
                                        if (supportSessionV0 != null) {
                                            im3.R(e8.n(su6Var18), su6Var18.q, null, new ou6(supportSessionV0, su6Var18, hc1Var, (byte) 0), 2);
                                        }
                                        break;
                                    case 1:
                                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                        ga7.a(kt6.v);
                                        SupportSession supportSessionV1 = su6Var18.V0();
                                        if (supportSessionV1 != null) {
                                            im3.R(e8.n(su6Var18), su6Var18.q, null, new ou6(supportSessionV1, su6Var18, hc1Var, (byte) 1), 2);
                                        }
                                        break;
                                    default:
                                        IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                        ga7.a(kt6.w);
                                        su6Var18.c1();
                                        break;
                                }
                                return f88Var5;
                            }
                        };
                        ux2Var2.g0(objK27);
                    } else {
                        objK27 = new Function0() { // from class: o.iu6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b113 = b5;
                                hc1 hc1Var = null;
                                f88 f88Var5 = f88.a;
                                su6 su6Var18 = su6Var3;
                                switch (b113) {
                                    case 0:
                                        IStatisticsHandler iStatisticsHandler = ga7.a;
                                        ga7.a(kt6.u);
                                        SupportSession supportSessionV0 = su6Var18.V0();
                                        if (supportSessionV0 != null) {
                                            im3.R(e8.n(su6Var18), su6Var18.q, null, new ou6(supportSessionV0, su6Var18, hc1Var, (byte) 0), 2);
                                        }
                                        break;
                                    case 1:
                                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                        ga7.a(kt6.v);
                                        SupportSession supportSessionV1 = su6Var18.V0();
                                        if (supportSessionV1 != null) {
                                            im3.R(e8.n(su6Var18), su6Var18.q, null, new ou6(supportSessionV1, su6Var18, hc1Var, (byte) 1), 2);
                                        }
                                        break;
                                    default:
                                        IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                        ga7.a(kt6.w);
                                        su6Var18.c1();
                                        break;
                                }
                                return f88Var5;
                            }
                        };
                        ux2Var2.g0(objK27);
                    }
                    Function0 function11110 = (Function0) objK27;
                    zH21 = ux2Var2.h(su6Var3);
                    objK28 = ux2Var2.K();
                    if (zH21) {
                        objK28 = new mr6(0, su6Var3, su6.class, "dismissMoreOptionsBottomSheet", "dismissMoreOptionsBottomSheet()V", 0, (byte) 3);
                        ux2Var2.g0(objK28);
                    } else {
                        objK28 = new mr6(0, su6Var3, su6.class, "dismissMoreOptionsBottomSheet", "dismissMoreOptionsBottomSheet()V", 0, (byte) 3);
                        ux2Var2.g0(objK28);
                    }
                    yo1.r(z8, z9, function1118, function1119, function11110, (Function0) ((pu3) objK28), null, null, ux2Var2, 0);
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(-1531823073);
                    ux2Var2.p(false);
                }
                if (((it6) px4Var3.getValue()).n) {
                    ux2Var2.W(-1531756330);
                    String strZ8 = m77.z(R.string.service_queue_more_actions_remove_session, ux2Var2);
                    String strZ9 = m77.z(R.string.service_queue_remove_session_dialog_message, ux2Var2);
                    zH16 = ux2Var2.h(su6Var3);
                    objK23 = ux2Var2.K();
                    if (zH16) {
                        objK23 = new mr6(0, su6Var3, su6.class, "confirmRemoveSession", "confirmRemoveSession()V", 0, (byte) 4);
                        ux2Var2.g0(objK23);
                    } else {
                        objK23 = new mr6(0, su6Var3, su6.class, "confirmRemoveSession", "confirmRemoveSession()V", 0, (byte) 4);
                        ux2Var2.g0(objK23);
                    }
                    Function0 function11111 = (Function0) ((pu3) objK23);
                    zH17 = ux2Var2.h(su6Var3);
                    objK24 = ux2Var2.K();
                    if (zH17) {
                        objK24 = new mr6(0, su6Var3, su6.class, "dismissRemoveSessionDialog", "dismissRemoveSessionDialog()V", 0, (byte) 5);
                        ux2Var2.g0(objK24);
                    } else {
                        objK24 = new mr6(0, su6Var3, su6.class, "dismissRemoveSessionDialog", "dismissRemoveSessionDialog()V", 0, (byte) 5);
                        ux2Var2.g0(objK24);
                    }
                    yo1.q(strZ8, strZ9, "TVTA-devicesScreen-removeSessionDialog", function11111, (Function0) ((pu3) objK24), null, ux2Var2, 384);
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(-1531317153);
                    ux2Var2.p(false);
                }
                if (((it6) px4Var3.getValue()).f1101o) {
                    ux2Var2.W(-1531252673);
                    zH15 = ux2Var2.h(su6Var3) | ux2Var2.f(px4Var2);
                    objK22 = ux2Var2.K();
                    if (zH15) {
                        z7 = false;
                        final byte z17 = false ? 1 : 0;
                        objK22 = new Function0() { // from class: o.gu6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                Object value;
                                byte b113 = z17;
                                f88 f88Var5 = f88.a;
                                px4 px4Var4 = px4Var2;
                                su6 su6Var18 = su6Var3;
                                switch (b113) {
                                    case 0:
                                        l97 l97Var = su6Var18.t;
                                        do {
                                            value = l97Var.getValue();
                                        } while (!l97Var.j(value, it6.a((it6) value, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, 16383)));
                                        ((Function0) px4Var4.getValue()).a();
                                        break;
                                    default:
                                        su6Var18.e1();
                                        ((Function0) px4Var4.getValue()).a();
                                        break;
                                }
                                return f88Var5;
                            }
                        };
                        ux2Var2.g0(objK22);
                    } else {
                        z7 = false;
                        final byte z18 = false ? 1 : 0;
                        objK22 = new Function0() { // from class: o.gu6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                Object value;
                                byte b113 = z18;
                                f88 f88Var5 = f88.a;
                                px4 px4Var4 = px4Var2;
                                su6 su6Var18 = su6Var3;
                                switch (b113) {
                                    case 0:
                                        l97 l97Var = su6Var18.t;
                                        do {
                                            value = l97Var.getValue();
                                        } while (!l97Var.j(value, it6.a((it6) value, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, 16383)));
                                        ((Function0) px4Var4.getValue()).a();
                                        break;
                                    default:
                                        su6Var18.e1();
                                        ((Function0) px4Var4.getValue()).a();
                                        break;
                                }
                                return f88Var5;
                            }
                        };
                        ux2Var2.g0(objK22);
                    }
                    ct1.o(z7 ? 1 : 0, (Function0) objK22, ux2Var2, r20);
                    ux2Var2.p(z7);
                } else {
                    z7 = false;
                    ux2Var2.W(-1531037409);
                    ux2Var2.p(false);
                }
                ux2Var2.p(z7);
            }
            fs4Var2 = fs4Var5;
            su6Var2 = su6Var3;
        } else {
            vx6Var2 = vx6Var;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
            su6Var2 = su6Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            final vx6 vx6Var3 = vx6Var2;
            j56VarR.d = new hw2() { // from class: o.hu6
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    it1.i(supportSession, fs4Var2, z, list, function1, function2, function3, function0, vx6Var3, function4, function5, function6, su6Var2, (ux2) obj, iY, iY2);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void j(lr0 lr0Var, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        String str;
        lr0Var.getClass();
        function1.getClass();
        ux2Var.Y(1572871227);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? (ux2Var.h(lr0Var) ? 4 : 2) | i : i;
        char c2 = ' ';
        if ((i & 48) == 0) {
            i3 |= ux2Var.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        boolean z = false;
        byte b2 = 1;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            fs4 fs4VarF = ka0.F(im3.Z(fs4Var, im3.W(ux2Var), false), 16.0f, 0.0f, 0.0f, 0.0f, 14);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.x, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarF);
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
            ux2Var.W(1286606636);
            for (ov1 ov1Var : lr0Var.a) {
                ?? r4 = lr0Var.b == ov1Var ? b2 : z;
                ?? r10 = ((i3 & 112) == c2 ? b2 : z) | (ux2Var.d(ov1Var.ordinal()) ? 1 : 0);
                Object objK = ux2Var.K();
                if (r10 != 0 || objK == e01.a) {
                    objK = new yw1(function1, ov1Var, b2);
                    ux2Var.g0(objK);
                }
                Function0 function0 = (Function0) objK;
                yy0 yy0VarO = au8.O(1460421216, new u4((byte) 3, (Object) ov1Var, (boolean) r4), ux2Var);
                fs4 fs4VarF2 = ka0.F(androidx.compose.foundation.layout.b.q(cs4.b, 0.0f, i2), 0.0f, 0.0f, 8.0f, 0.0f, 11);
                int iOrdinal = ov1Var.ordinal();
                if (iOrdinal == 0) {
                    str = "TVTA-devicesScreen-groups-chip";
                } else if (iOrdinal == b2) {
                    str = "TVTA-devicesScreen-contacts-chip";
                } else if (iOrdinal == i2) {
                    str = "TVTA-devicesScreen-monitoring-chip";
                } else {
                    if (iOrdinal != 3) {
                        gk0.s();
                        return;
                    }
                    str = "TVTA-devicesScreen-serviceQueue-chip";
                }
                kr0.c(r4, function0, yy0VarO, androidx.compose.ui.platform.a.a(fs4VarF2, str), false, sf6.a(8.0f), null, null, null, ux2Var, 384);
                z = z;
                c2 = ' ';
                i3 = i3;
                b2 = 1;
                i2 = 2;
            }
            ux2Var.p(z);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) lr0Var, (Object) function1, (Object) fs4Var, i, (byte) 22);
        }
    }

    public static final void k(int i, int i2, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i3;
        Function0 function1;
        ux2Var.Y(1154824874);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            function1 = function0;
            i3 |= ux2Var.h(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.f("TVTA-settings-savePasswords") ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = (i3 >> 6) & 112;
            int i5 = i3 << 6;
            x37.e(new sk7(y57.g(R.string.settings_save_passwords), y57.g(i), new yk7(R.drawable.password), null, 24), fs4Var, null, function1, "TVTA-settings-savePasswords", ux2Var, (i5 & 57344) | i4 | (i5 & 7168), 36);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new jc(i, function0, fs4Var, i2, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:22:0x0066->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x004e A[EDGE_INSN: B:31:0x004e->B:18:0x004e BREAK  A[LOOP:0: B:22:0x0066->B:26:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object m(o.ug7 r7, o.cn5 r8, o.i30 r9) {
        /*
            boolean r0 = r9 instanceof o.qs2
            if (r0 == 0) goto L13
            r0 = r9
            o.qs2 r0 = (o.qs2) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L18
        L13:
            o.qs2 r0 = new o.qs2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f1858o
            int r1 = r0.p
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            o.cn5 r7 = r0.n
            o.ug7 r8 = r0.m
            o.ct1.a0(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r7)
            r7 = 0
            return r7
        L34:
            o.ct1.a0(r9)
            o.vg7 r9 = r7.q
            o.bn5 r9 = r9.E
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            o.in5 r5 = (o.in5) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L76
        L4e:
            r0.m = r7
            r0.n = r8
            r0.p = r3
            java.lang.Object r9 = r7.a(r8, r0)
            o.ne1 r1 = o.ne1.m
            if (r9 != r1) goto L5d
            return r1
        L5d:
            o.bn5 r9 = (o.bn5) r9
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            o.in5 r5 = (o.in5) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L73
            goto L4e
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            int r4 = r4 + 1
            goto L42
        L79:
            o.f88 r7 = o.f88.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.it1.m(o.ug7, o.cn5, o.i30):java.lang.Object");
    }

    public static final Object n(nn5 nn5Var, hw2 hw2Var, hc1 hc1Var) {
        Object objU0 = ((vg7) nn5Var).U0(new rs2(hc1Var.getContext(), hw2Var, null, (byte) 0), hc1Var);
        return objU0 == ne1.m ? objU0 : f88.a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[LOOP:0: B:21:0x0050->B:25:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:712)
        	at jadx.core.utils.BlockUtils.isPathExists(BlockUtils.java:845)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.isCandidateForOutBlock(IfRegionMaker.java:303)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.findOutBlock(IfRegionMaker.java:267)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.restructureIf(IfRegionMaker.java:191)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        */
    public static final java.lang.Object o(o.ug7 r6, o.i30 r7) {
        /*
            boolean r0 = r7 instanceof o.ud6
            if (r0 == 0) goto L13
            r0 = r7
            o.ud6 r0 = (o.ud6) r0
            int r1 = r0.f2203o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2203o = r1
            goto L18
        L13:
            o.ud6 r0 = new o.ud6
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.n
            int r1 = r0.f2203o
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            o.ug7 r6 = r0.m
            o.ct1.a0(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r6)
            r6 = 0
            return r6
        L2e:
            o.ct1.a0(r7)
        L31:
            r0.m = r6
            r0.f2203o = r2
            o.cn5 r7 = o.cn5.n
            java.lang.Object r7 = r6.a(r7, r0)
            o.ne1 r1 = o.ne1.m
            if (r7 != r1) goto L40
            return r1
        L40:
            o.bn5 r7 = (o.bn5) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            o.in5 r5 = (o.in5) r5
            boolean r5 = o.qs1.C(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.it1.o(o.ug7, o.i30):java.lang.Object");
    }

    public static final int p(int i, xx4 xx4Var) {
        int i2 = xx4Var.f2559o - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = xx4Var.m;
            int i5 = ((am3) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((am3) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final fj0 q(hw2 hw2Var) {
        return new fj0(hw2Var, ba2.m, -2, df0.m);
    }

    public static final void r(int i, int i2) {
        if (i < 0 || i >= i2) {
            hk0.r(ua5.l("index: ", i, i2, ", size: "));
        }
    }

    public static final void s(int i, int i2) {
        if (i < 0 || i > i2) {
            hk0.r(ua5.l("index: ", i, i2, ", size: "));
        }
    }

    public static final void t(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            an4.f(i3, fx3.j(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            hk0.g(ua5.l("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    public static final boolean u(v56 v56Var, float f, float f2) {
        float f3 = v56Var.a;
        if (f > v56Var.c || f3 > f) {
            return false;
        }
        return f2 <= v56Var.d && v56Var.b <= f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] v(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static final void w(fo5 fo5Var, k01 k01Var, String str) {
        wj5 wj5VarH = k01Var.h();
        wt3 wt3Var = fo5Var.a;
        wj5VarH.getClass();
        wt3Var.getClass();
        e8.p(1, null);
        pm8.I(str, wt3Var);
        throw null;
    }

    public static final void x(fo5 fo5Var, bb7 bb7Var, Object obj) {
        obj.getClass();
        wj5 wj5Var = bb7Var.e;
        wt3 wt3Var = fo5Var.a;
        wj5Var.getClass();
        wt3Var.getClass();
        if (wt3Var.o(obj)) {
            e8.p(1, null);
        }
        wt3 wt3VarB = w86.a.b(obj.getClass());
        String strF = wt3VarB.f();
        if (strF == null) {
            strF = String.valueOf(wt3VarB);
        }
        pm8.I(strF, wt3Var);
        throw null;
    }

    public static KeyPair y() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (keyStore.getEntry("RSA_KEY_MFA", null) != null) {
            Certificate certificate = keyStore.getCertificate("RSA_KEY_MFA");
            return new KeyPair(certificate != null ? certificate.getPublicKey() : null, (PrivateKey) keyStore.getKey("RSA_KEY_MFA", null));
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        keyPairGenerator.getClass();
        KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder("RSA_KEY_MFA", 3).setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding");
        encryptionPaddings.getClass();
        keyPairGenerator.initialize(encryptionPaddings.build());
        return keyPairGenerator.generateKeyPair();
    }

    public static final ArrayList z(bm3 bm3Var) {
        bm3Var.getClass();
        LayoutNode layoutNodeD0 = ((rg4) bm3Var).D0();
        boolean zI = I(layoutNodeD0);
        xw4 xw4Var = (xw4) layoutNodeD0.q();
        xx4 xx4Var = (xx4) xw4Var.n;
        ArrayList arrayList = new ArrayList(xx4Var.f2559o);
        int i = xx4Var.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) xw4Var.get(i2);
            arrayList.add(zI ? layoutNode.o() : layoutNode.p());
        }
        return arrayList;
    }

    public int hashCode() {
        switch (this.a) {
            case 27:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract String l();

    public String toString() {
        switch (this.a) {
            case 27:
                String strF = w86.a.b(getClass()).f();
                strF.getClass();
                return strF;
            default:
                return super.toString();
        }
    }
}
