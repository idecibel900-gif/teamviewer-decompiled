package o;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import javax.net.ssl.SSLSocket;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class xz2 implements Configurator, pa0, vc1, jn1, w34, ui8, c57, rl5, xs0, fq4, jm1 {
    public static xz2 n;
    public final /* synthetic */ byte m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final y50 f2564o = new y50(-1.0f, -1.0f);
    public static final y50 p = new y50(0.0f, -1.0f);
    public static final y50 q = new y50(1.0f, -1.0f);
    public static final y50 r = new y50(-1.0f, 0.0f);
    public static final y50 s = new y50(0.0f, 0.0f);
    public static final y50 t = new y50(1.0f, 0.0f);
    public static final y50 u = new y50(-1.0f, 1.0f);
    public static final y50 v = new y50(0.0f, 1.0f);
    public static final y50 w = new y50(1.0f, 1.0f);
    public static final x50 x = new x50(-1.0f);
    public static final x50 y = new x50(0.0f);
    public static final x50 z = new x50(1.0f);
    public static final w50 A = new w50(-1.0f);
    public static final w50 B = new w50(0.0f);
    public static final w50 C = new w50(1.0f);
    public static final xz2 D = new xz2(2);
    public static final xz2 E = new xz2(3);
    public static final xz2 F = new xz2(4);
    public static final xz2 G = new xz2(5);
    public static final xz2 H = new xz2(6);
    public static final xz2 I = new xz2(7);
    public static final xz2 J = new xz2(8);
    public static final xz2 K = new xz2(9);
    public static final xz2 L = new xz2(10);
    public static final String[] M = new String[0];
    public static final xz2 N = new xz2(13);
    public static final xz2 O = new xz2(14);
    public static final xz2 P = new xz2(15);
    public static final be5 Q = new be5("Expanded");
    public static final be5 R = new be5("Hidden");
    public static final xz2 S = new xz2(17);
    public static final xz2 T = new xz2(19);
    public static final xz2 U = new xz2(20);
    public static final xz2 V = new xz2(21);
    public static final xz2 W = new xz2(22);
    public static final xz2 X = new xz2(23);
    public static final xz2 Y = new xz2(24);
    public static final yq4 Z = new yq4(25);

    public /* synthetic */ xz2(byte b) {
        this.m = b;
    }

    public static as4 B0(kv5 kv5Var) {
        int i = kv5Var == null ? -1 : sw5.a[kv5Var.ordinal()];
        as4 as4Var = as4.n;
        if (i == 1) {
            return as4Var;
        }
        if (i == 2) {
            return as4.p;
        }
        if (i != 3) {
            return i != 4 ? as4Var : as4.f355o;
        }
        return as4.q;
    }

    public static final boolean C0(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        uq8 uq8Var;
        int i;
        if (packageInfo != null) {
            boolean z2 = (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 129) == 0)) ? false : true;
            try {
                uq8 uq8Var2 = z2 ? mx8.c : mx8.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        kq8 kq8Var = sq8.n;
                        Object[] objArr = {byteArray};
                        o67.p(1, objArr);
                        uq8Var = new uq8(1, objArr);
                    } else {
                        kq8 kq8Var2 = sq8.n;
                        uq8Var = uq8.q;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        kq8 kq8Var3 = sq8.n;
                        uq8Var = uq8.q;
                    } else {
                        kq8 kq8Var4 = sq8.n;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i3].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i5 = i4 + 1;
                            if (i5 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i5 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i5) {
                                    int iHighestOneBit = Integer.highestOneBit(i4);
                                    i = iHighestOneBit + iHighestOneBit;
                                }
                                if (i < 0) {
                                    i = Integer.MAX_VALUE;
                                }
                            }
                            if (i > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                            }
                            objArrCopyOf[i4] = byteArray2;
                            i3++;
                            i4 = i5;
                        }
                        uq8Var = i4 == 0 ? uq8.q : new uq8(i4, objArrCopyOf);
                    }
                }
                if (uq8Var.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                sq8 sq8VarF = uq8Var.f();
                int size = sq8VarF.size();
                int i6 = 0;
                while (i6 < size) {
                    byte[] bArr = (byte[]) sq8VarF.get(i6);
                    kq8 kq8VarH = uq8Var2.listIterator(0);
                    do {
                        int i7 = i6 + 1;
                        if (!kq8VarH.hasNext()) {
                            i6 = i7;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) kq8VarH.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z2 ? D0(packageInfo, mx8.a) : D0(packageInfo, mx8.a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static wv8 D0(PackageInfo packageInfo, wv8... wv8VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                io.sentry.android.core.v0.j("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            nw8 nw8Var = new nw8(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < wv8VarArr.length; i++) {
                if (wv8VarArr[i].equals(nw8Var)) {
                    return wv8VarArr[i];
                }
            }
        }
        return null;
    }

    public static ns4 y0(ns4 ns4Var) {
        it2 it2VarG = zo1.g(ns4Var);
        String str = mo3.a;
        ht2 ht2Var = (ht2) mo3.k.get(it2VarG);
        if (ht2Var != null) {
            return bp1.e(ns4Var).i(ht2Var);
        }
        io.sentry.h2.g(ns4Var, " is not a read-only collection", "Given class ");
        return null;
    }

    public static String z0(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(vn0.a);
            bytes.getClass();
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            bArrDigest.getClass();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            ye4.d("AccountIdEncryption", e);
            return "";
        }
    }

    @Override // o.xs0
    public boolean A(i07 i07Var) {
        i07Var.getClass();
        g07 g07VarM = db8.m(i07Var);
        return (g07VarM != null ? db8.j(this, g07VarM) : null) != null;
    }

    public sz3 A0(sz3 sz3Var) {
        g07 g07VarO0;
        sz3Var.getClass();
        g07 g07VarM = db8.m(sz3Var);
        return (g07VarM == null || (g07VarO0 = db8.O0(g07VarM, true)) == null) ? sz3Var : g07VarO0;
    }

    @Override // o.xs0
    public boolean B(l48 l48Var) {
        return db8.K(l48Var);
    }

    @Override // o.xs0
    public am0 C(i07 i07Var) {
        return db8.j(this, i07Var);
    }

    @Override // o.xs0
    public int D(f48 f48Var) {
        f48Var.getClass();
        if (f48Var instanceof i07) {
            return db8.h((sz3) f48Var);
        }
        if (f48Var instanceof zv) {
            return ((zv) f48Var).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(f48Var);
        gk0.q(sb, ", ", w86.a.b(f48Var.getClass()));
        return 0;
    }

    @Override // o.xs0
    public w87 E(sz3 sz3Var) {
        return db8.n(sz3Var);
    }

    @Override // o.xs0
    public void F(i07 i07Var) {
        db8.c0(i07Var);
    }

    @Override // o.c57
    public boolean G(Object obj, Object obj2) {
        return false;
    }

    @Override // o.xs0
    public boolean H(i07 i07Var) {
        return db8.P(i07Var);
    }

    @Override // o.w34
    public void I() {
    }

    @Override // o.xs0
    public m98 J(i07 i07Var, i07 i07Var2) {
        return db8.s(this, i07Var, i07Var2);
    }

    @Override // o.xs0
    public Collection K(i07 i07Var) {
        return db8.u0(this, i07Var);
    }

    @Override // o.xs0
    public boolean L(am0 am0Var) {
        return db8.Z(am0Var);
    }

    @Override // o.xs0
    public q58 M(d58 d58Var) {
        d58Var.getClass();
        ub8 ub8VarB = d58Var.B();
        ub8VarB.getClass();
        return o77.f(ub8VarB);
    }

    @Override // o.xs0
    public int N(l48 l48Var) {
        return db8.s0(l48Var);
    }

    @Override // o.xs0
    public boolean O(i07 i07Var, i07 i07Var2) {
        return db8.I(i07Var, i07Var2);
    }

    @Override // o.ui8
    public String[] P() {
        return M;
    }

    @Override // o.jm1
    public o57 Q(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                hk0.s(cls, "No OpenSSLSocketImpl superclass of socket of type ");
                return null;
            }
        }
        return new vk(superclass);
    }

    @Override // o.xs0
    public boolean R(i07 i07Var) {
        i07Var.getClass();
        return db8.M(db8.K0(i07Var));
    }

    @Override // o.xs0
    public boolean S(sz3 sz3Var) {
        sz3Var.getClass();
        return !im3.n(db8.K0(d(sz3Var)), db8.K0(z(sz3Var)));
    }

    @Override // o.xs0
    public m98 T(ArrayList arrayList) {
        g07 g07Var;
        int size = arrayList.size();
        if (size == 0) {
            hk0.l("Expected some types");
            return null;
        }
        if (size == 1) {
            return (m98) lv0.E0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            m98 m98Var = (m98) it.next();
            z2 = z2 || ct1.K(m98Var);
            if (m98Var instanceof g07) {
                g07Var = (g07) m98Var;
            } else {
                if (!(m98Var instanceof um2)) {
                    gk0.s();
                    return null;
                }
                g07Var = ((um2) m98Var).n;
                z3 = true;
            }
            arrayList2.add(g07Var);
        }
        if (z2) {
            return hd2.c(gd2.J, arrayList.toString());
        }
        b58 b58Var = b58.a;
        if (!z3) {
            return b58Var.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(bt1.V((m98) it2.next()));
        }
        return bt1.v(b58Var.b(arrayList2), b58Var.b(arrayList3));
    }

    @Override // o.xs0
    public boolean U(i07 i07Var) {
        i07Var.getClass();
        return db8.T(db8.K0(i07Var));
    }

    @Override // o.xs0
    public boolean V(i07 i07Var) {
        i07Var.getClass();
        return db8.W(c(i07Var)) && !db8.X(i07Var);
    }

    @Override // o.jn1
    public float W(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // o.xs0
    public boolean X(l48 l48Var, l48 l48Var2) {
        return db8.g(l48Var, l48Var2);
    }

    @Override // o.xs0
    public h58 Y(xl0 xl0Var) {
        return db8.v0(xl0Var);
    }

    @Override // o.xs0
    public boolean Z(sz3 sz3Var) {
        sz3Var.getClass();
        g07 g07VarM = db8.m(sz3Var);
        return (g07VarM != null ? db8.k(g07VarM) : null) != null;
    }

    @Override // o.jm1
    public boolean a(SSLSocket sSLSocket) {
        return bc7.N(false, sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.");
    }

    @Override // o.xs0
    public boolean a0(am0 am0Var) {
        return am0Var instanceof vl0;
    }

    @Override // o.fq4
    public void b(jp4 jp4Var, boolean z2) {
    }

    @Override // o.xs0
    public k48 b0(i07 i07Var) {
        return db8.K0(i07Var);
    }

    @Override // o.xs0
    public k48 c(sz3 sz3Var) {
        sz3Var.getClass();
        g07 g07VarM = db8.m(sz3Var);
        if (g07VarM == null) {
            g07VarM = d(sz3Var);
        }
        return db8.K0(g07VarM);
    }

    @Override // o.xs0
    public q58 c0(h58 h58Var) {
        return db8.E(h58Var);
    }

    @Override // o.w34
    public void cancel() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig) {
        jz jzVar = jz.a;
        encoderConfig.registerEncoder(j50.class, jzVar);
        encoderConfig.registerEncoder(f00.class, jzVar);
        mz mzVar = mz.a;
        encoderConfig.registerEncoder(ne4.class, mzVar);
        encoderConfig.registerEncoder(n00.class, mzVar);
        kz kzVar = kz.a;
        encoderConfig.registerEncoder(nt0.class, kzVar);
        encoderConfig.registerEncoder(g00.class, kzVar);
        iz izVar = iz.a;
        encoderConfig.registerEncoder(fg.class, izVar);
        encoderConfig.registerEncoder(d00.class, izVar);
        lz lzVar = lz.a;
        encoderConfig.registerEncoder(je4.class, lzVar);
        encoderConfig.registerEncoder(m00.class, lzVar);
        nz nzVar = nz.a;
        encoderConfig.registerEncoder(o25.class, nzVar);
        encoderConfig.registerEncoder(p00.class, nzVar);
    }

    @Override // o.xs0
    public g07 d(sz3 sz3Var) {
        g07 g07VarH0;
        sz3Var.getClass();
        um2 um2VarL = db8.l(sz3Var);
        if (um2VarL != null && (g07VarH0 = db8.h0(um2VarL)) != null) {
            return g07VarH0;
        }
        g07 g07VarM = db8.m(sz3Var);
        g07VarM.getClass();
        return g07VarM;
    }

    @Override // o.xs0
    public i35 d0(am0 am0Var) {
        return db8.J0(am0Var);
    }

    @Override // o.xs0
    public boolean e(m98 m98Var) {
        m98Var.getClass();
        return db8.V(d(m98Var)) != db8.V(z(m98Var));
    }

    @Override // o.xs0
    public m98 e0(sz3 sz3Var) {
        return db8.j0(sz3Var);
    }

    @Override // o.xs0
    public boolean f(sz3 sz3Var) {
        sz3Var.getClass();
        return sz3Var instanceof h55;
    }

    @Override // o.xs0
    public g07 f0(um2 um2Var) {
        return db8.h0(um2Var);
    }

    @Override // o.xs0
    public boolean g(l48 l48Var) {
        return db8.M(l48Var);
    }

    @Override // o.xs0
    public g07 g0(i07 i07Var) {
        return db8.o(i07Var);
    }

    @Override // o.ui8
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // o.ui8
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // o.xs0
    public lm1 h(i07 i07Var) {
        return db8.k(i07Var);
    }

    @Override // o.xs0
    public h58 h0(i07 i07Var, int i) {
        i07Var.getClass();
        if (i < 0 || i >= db8.h(i07Var)) {
            return null;
        }
        return db8.y(i07Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.xs0
    public h58 i(f48 f48Var, int i) {
        f48Var.getClass();
        if (f48Var instanceof i07) {
            return db8.y((sz3) f48Var, i);
        }
        if (f48Var instanceof zv) {
            E e = ((zv) f48Var).get(i);
            e.getClass();
            return (h58) e;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(f48Var);
        gk0.q(sb, ", ", w86.a.b(f48Var.getClass()));
        return null;
    }

    @Override // o.xs0
    public g07 i0(lm1 lm1Var) {
        return lm1Var.n;
    }

    @Override // o.xs0
    public ws0 j(i07 i07Var) {
        return db8.B0(this, i07Var);
    }

    @Override // o.xs0
    public boolean j0(l48 l48Var) {
        return db8.W(l48Var);
    }

    @Override // o.xs0
    public m98 k(am0 am0Var) {
        return db8.i0(am0Var);
    }

    @Override // o.xs0
    public f48 k0(i07 i07Var) {
        return db8.i(i07Var);
    }

    @Override // o.xs0
    public void l(i07 i07Var) {
        db8.d0(i07Var);
    }

    @Override // o.xs0
    public g07 l0(sz3 sz3Var) {
        return db8.m(sz3Var);
    }

    @Override // o.xs0
    public h58 m(sz3 sz3Var, int i) {
        return db8.y(sz3Var, i);
    }

    @Override // o.fq4
    public boolean m0(jp4 jp4Var) {
        return false;
    }

    @Override // o.xs0
    public sz3 n(sz3 sz3Var) {
        return db8.N0(this, sz3Var);
    }

    @Override // o.xs0
    public boolean n0(l48 l48Var) {
        return db8.O(l48Var);
    }

    @Override // o.xs0
    public boolean o(h58 h58Var) {
        return db8.b0(h58Var);
    }

    @Override // o.xs0
    public int o0(sz3 sz3Var) {
        return db8.h(sz3Var);
    }

    @Override // o.xs0
    public boolean p(l48 l48Var) {
        return db8.U(l48Var);
    }

    @Override // o.xs0
    public m98 p0(h58 h58Var) {
        return db8.C(h58Var);
    }

    @Override // o.pa0
    public Rect q(Activity activity) throws Exception {
        oa0 oa0Var = pa0.a;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutoutD = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                objInvoke2.getClass();
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            oa0Var.getClass();
            io.sentry.android.core.v0.k(oa0.b, e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (v3.q(obj2)) {
                    displayCutoutD = v3.d(obj2);
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                oa0Var.getClass();
                io.sentry.android.core.v0.k(oa0.b, e2);
            }
            if (displayCutoutD != null) {
                if (rect.left == displayCutoutD.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutD.getSafeInsetRight()) {
                    rect.right = displayCutoutD.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutD.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutD.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutD.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    @Override // o.xs0
    public i07 q0(i07 i07Var) {
        g07 g07Var;
        i07Var.getClass();
        lm1 lm1VarK = db8.k(i07Var);
        return (lm1VarK == null || (g07Var = lm1VarK.n) == null) ? i07Var : g07Var;
    }

    @Override // o.xs0
    public boolean r(l48 l48Var) {
        return db8.N(l48Var);
    }

    @Override // o.xs0
    public boolean r0(i07 i07Var) {
        return db8.V(i07Var);
    }

    @Override // o.xs0
    public g07 s(i07 i07Var, boolean z2) {
        return db8.O0(i07Var, z2);
    }

    @Override // o.xs0
    public um2 s0(sz3 sz3Var) {
        return db8.l(sz3Var);
    }

    @Override // o.xs0
    public void t(i07 i07Var, l48 l48Var) {
    }

    @Override // o.rl5
    public boolean t0(ns4 ns4Var, dq1 dq1Var) {
        ns4Var.getClass();
        return true;
    }

    public String toString() {
        switch (this.m) {
            case 15:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }

    @Override // o.xs0
    public boolean u(l48 l48Var) {
        return db8.T(l48Var);
    }

    @Override // o.xs0
    public boolean u0(d58 d58Var, l48 l48Var) {
        return db8.H(d58Var, l48Var);
    }

    @Override // o.xs0
    public d58 v(l48 l48Var, int i) {
        return db8.B(l48Var, i);
    }

    @Override // o.xs0
    public Collection v0(l48 l48Var) {
        return db8.C0(l48Var);
    }

    @Override // o.vc1
    public Object w(Object obj) {
        switch (this.m) {
            case 4:
                ((nc6) obj).close();
                return f88.a;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return Boolean.valueOf(((nc6) obj).u());
            default:
                return Integer.valueOf(((nc6) obj).u());
        }
    }

    @Override // o.xs0
    public ul0 w0(am0 am0Var) {
        return db8.p(am0Var);
    }

    @Override // o.xs0
    public g07 x(um2 um2Var) {
        return db8.L0(um2Var);
    }

    public void x0(final fs4 fs4Var, final float f, float f2, long j, pw6 pw6Var, ux2 ux2Var, final int i, final int i2) {
        final long j2;
        final pw6 pw6Var2;
        long jC;
        pw6 pw6Var3;
        ux2Var.Y(-1895596205);
        int i3 = (ux2Var.f(fs4Var) ? 4 : 2) | i;
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= ux2Var.c(f2) ? 256 : 128;
        }
        int i5 = i3 | 25600;
        if (ux2Var.N(i5 & 1, (i5 & 9363) != 9362)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                if (i4 != 0) {
                    f2 = es5.b;
                }
                jC = bw0.c(es5.a, ux2Var);
                pw6Var3 = es5.c;
            } else {
                ux2Var.Q();
                jC = j;
                pw6Var3 = pw6Var;
            }
            ux2Var.q();
            b77.a(ux2Var, au8.s(androidx.compose.foundation.layout.b.k(androidx.compose.foundation.layout.b.g(fs4Var, f2), f), jC, pw6Var3));
            j2 = jC;
            pw6Var2 = pw6Var3;
        } else {
            ux2Var.Q();
            j2 = j;
            pw6Var2 = pw6Var;
        }
        final float f3 = f2;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.xm7
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.m.x0(fs4Var, f, f3, j2, pw6Var2, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    @Override // o.xs0
    public void y(sz3 sz3Var) {
        sz3Var.getClass();
        db8.l(sz3Var);
    }

    @Override // o.xs0
    public g07 z(sz3 sz3Var) {
        g07 g07VarL0;
        sz3Var.getClass();
        um2 um2VarL = db8.l(sz3Var);
        if (um2VarL != null && (g07VarL0 = db8.L0(um2VarL)) != null) {
            return g07VarL0;
        }
        g07 g07VarM = db8.m(sz3Var);
        g07VarM.getClass();
        return g07VarM;
    }
}
