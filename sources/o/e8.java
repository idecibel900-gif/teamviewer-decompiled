package o;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.hardware.biometrics.BiometricPrompt;
import android.net.Uri;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class e8 {
    public static Method A;
    public static Method B;
    public static boolean C;
    public static final i68 b = i68.s;
    public static final yy0 c = new yy0(-579345987, false, new p20(8));
    public static final yy0 d = new yy0(-1183596860, false, new g9((byte) 22));
    public static final yy0 e = new yy0(-2076197688, false, new zy0(25));
    public static final yy0 f = new yy0(1253986715, false, new zy0(26));
    public static final yy0 g;
    public static final yy0 h;
    public static final yy0 i;
    public static final yy0 j;
    public static final yy0 k;
    public static final yy0 l;
    public static final ne1 m;
    public static final ju n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s73 f690o;
    public static final int[] p;
    public static final yj q;
    public static final yj r;
    public static final yj s;
    public static final hr2 t;
    public static final hr2 u;
    public static final hr2 v;
    public static final hr2 w;
    public static final hr2 x;
    public static final b42 y;
    public static final rk5 z;
    public final /* synthetic */ byte a;

    static {
        new yy0(1006364995, false, new zy0((byte) 27));
        new yy0(1549831112, false, new zy0((byte) 28));
        new yy0(1826384074, false, new zy0((byte) 29));
        g = new yy0(30524904, false, new az0((byte) 18));
        h = new yy0(-1423924863, false, new fz0((byte) 2));
        i = new yy0(-476757920, false, new fz0((byte) 3));
        j = new yy0(-1588441102, false, new gz0((byte) 5));
        k = new yy0(499196575, false, new gz0((byte) 20));
        l = new yy0(974332243, false, new gz0((byte) 21));
        m = ne1.m;
        n = new ju((byte) 16);
        f690o = new s73();
        byte b2 = 14;
        p = new int[]{13, 15, 14};
        q = new yj(1000);
        new yj(1007);
        r = new yj(1008);
        s = new yj(1002);
        t = new hr2("STATE_REG", b2);
        u = new hr2("STATE_COMPLETED", b2);
        v = new hr2("STATE_CANCELLED", b2);
        w = new hr2("NO_RESULT", b2);
        x = new hr2("PARAM_CLAUSE_0", b2);
        y = new b42();
        z = new rk5((byte) 11);
    }

    public /* synthetic */ e8(byte b2) {
        this.a = b2;
    }

    public static final String A(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        return b2 == 127 ? "invalid token" : "valid token";
    }

    public static BiometricPrompt.CryptoObject B(j93 j93Var) {
        IdentityCredential identityCredential;
        if (j93Var == null) {
            return null;
        }
        Cipher cipher = (Cipher) j93Var.f1141o;
        if (cipher != null) {
            return gf1.b(cipher);
        }
        Signature signature = (Signature) j93Var.n;
        if (signature != null) {
            return gf1.a(signature);
        }
        Mac mac = (Mac) j93Var.p;
        if (mac != null) {
            return gf1.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = (IdentityCredential) j93Var.q) == null) {
            return null;
        }
        return hf1.a(identityCredential);
    }

    public static final void a(wx wxVar, String str, fs4 fs4Var, Function1 function1, he heVar, sb1 sb1Var, ux2 ux2Var, int i2, int i3) {
        int i4;
        ux2Var.Y(1236588022);
        int i5 = i2 | (ux2Var.f(wxVar) ? 4 : 2) | (ux2Var.f(str) ? 32 : 16) | (ux2Var.f(fs4Var) ? 256 : 128) | (ux2Var.h(function1) ? 2048 : 1024) | (ux2Var.h(null) ? 16384 : 8192) | (ux2Var.f(heVar) ? 131072 : 65536) | (ux2Var.f(sb1Var) ? 1048576 : 524288) | (ux2Var.c(1.0f) ? 8388608 : 4194304) | (ux2Var.f(null) ? 67108864 : 33554432) | (ux2Var.d(1) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            i4 = i3 | (ux2Var.g(true) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if (ux2Var.N(i5 & 1, ((306783379 & i5) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            ke3 ke3VarD = va8.d(wxVar.a, sb1Var, ux2Var, (i5 >> 15) & 112);
            va8.g(ke3VarD);
            fs4 fs4VarF = fs4Var.f(new pb1(ke3VarD, wxVar.c, wxVar.b, function1, heVar, sb1Var, va8.a(ux2Var), str));
            ei eiVar = ei.k;
            int iHashCode = Long.hashCode(ux2Var.T);
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarF);
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
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new nx(wxVar, str, fs4Var, function1, heVar, sb1Var, i2, i3);
        }
    }

    public static final void b(int i2, int i3, String str, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        String str2;
        function0.getClass();
        ux2Var.Y(-658560555);
        int i4 = (ux2Var.h(function0) ? 4 : 2) | i3 | (ux2Var.d(i2) ? 32 : 16) | (ux2Var.f(fs4Var) ? 256 : 128) | 3072;
        if (ux2Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            x37.e(new sk7(y57.g(R.string.settings_biometric_authentication), y57.g(i2), new yk7(R.drawable.fingerprint), null, 24), fs4Var, null, function0, "TVTA-settings-biometricAuthentication", ux2Var, ((i4 << 9) & 7168) | ((i4 >> 3) & 112) | 24576, 36);
            str2 = "TVTA-settings-biometricAuthentication";
        } else {
            ux2Var.Q();
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new i60(function0, i2, fs4Var, str2, i3);
        }
    }

    public static final void c(pr7 pr7Var, yy0 yy0Var, ux2 ux2Var, int i2) {
        int i3;
        fs4 fs4VarT;
        ux2Var.Y(1533506138);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.h(pr7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 32 : 16;
        }
        byte b3 = 0;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            ux2Var.W(-885604480);
            if (pr7Var.i()) {
                hc1 hc1Var = null;
                fs4VarT = qf0.T(kh.C(new ir7(pr7Var, hc1Var, b3)), pr7Var.y, new jr7(pr7Var, null), new kr7(pr7Var, hc1Var, b3), new kd1(pr7Var, b2));
            } else {
                fs4VarT = cs4.b;
            }
            yo1.o(fs4VarT, yy0Var, ux2Var, i3 & 112);
            ux2Var.p(false);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new kx0(pr7Var, yy0Var, i2, b3);
        }
    }

    public static final void d(a06 a06Var, p31 p31Var, i31 i31Var, xg8 xg8Var, fs4 fs4Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        p31Var.getClass();
        ux2Var2.Y(-821784015);
        int i3 = i2 | (ux2Var2.f(a06Var) ? 4 : 2) | (ux2Var2.f(p31Var) ? 32 : 16) | (ux2Var2.f(i31Var) ? 256 : 128) | (ux2Var2.f(xg8Var) ? 2048 : 1024) | 24576;
        if (ux2Var2.N(i3 & 1, (i3 & 9363) != 9362)) {
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            do4 do4VarC = ua0.c(xz2.f2564o, false);
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
            if (p31Var.b) {
                ux2Var2.W(-518687991);
                SupportSession supportSession = p31Var.p;
                if (supportSession == null) {
                    ux2Var2.W(-518687992);
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(-518687991);
                    m77.j(supportSession, a06Var, xg8Var, null, ux2Var2, ((i3 << 3) & 112) | ((i3 >> 3) & 896), 8);
                    ux2Var2 = ux2Var2;
                    ux2Var2.p(false);
                }
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-518417671);
                vn4.M(a06Var, p31Var, i31Var, null, ux2Var2, i3 & 1022);
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
            fs4Var2 = cs4.b;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new o31((Object) a06Var, (Object) p31Var, (Object) i31Var, (Object) xg8Var, (Object) fs4Var2, i2, (byte) 0);
        }
    }

    public static final nn1 e(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        hs2 hs2VarA = is2.a(f2);
        if (hs2VarA == null) {
            hs2VarA = new s94(f2);
        }
        return new nn1(f3, f2, hs2VarA);
    }

    public static Collection f(List list) {
        if (!(list instanceof su3) || (list instanceof tu3)) {
            return list;
        }
        z(list, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static Map g(Object obj) {
        if ((obj instanceof su3) && !(obj instanceof vu3)) {
            z(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            im3.Y(e2, e8.class.getName());
            throw e2;
        }
    }

    public static Set h(Object obj) {
        if ((obj instanceof su3) && !(obj instanceof fv3)) {
            z(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e2) {
            im3.Y(e2, e8.class.getName());
            throw e2;
        }
    }

    public static void i(int i2, Object obj) {
        if (obj == null || p(i2, obj)) {
            return;
        }
        z(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static final byte j(char c2) {
        if (c2 < '~') {
            return on0.b[c2];
        }
        return (byte) 0;
    }

    public static final float k(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static j93 l() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderB = ff1.b("androidxBiometric", 3);
            ff1.d(builderB);
            ff1.e(builderB);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            ff1.c(keyGenerator, ff1.a(builderB));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new j93(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e2) {
            io.sentry.android.core.v0.l("CryptoObjectUtils", "Failed to create fake crypto object.", e2);
            return null;
        }
    }

    public static void m(Canvas canvas, boolean z2) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z2) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!C) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    A = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    B = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    A = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    B = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = A;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = B;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            C = true;
        }
        if (z2) {
            try {
                Method method4 = A;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z2 || (method = B) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final gu0 n(oe8 oe8Var) {
        gu0 gu0Var;
        oe8Var.getClass();
        synchronized (z) {
            gu0Var = (gu0) oe8Var.T0("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (gu0Var == null) {
                de1 de1Var = ba2.m;
                try {
                    tk1 tk1Var = g22.a;
                    de1Var = ok4.a.r;
                } catch (IllegalStateException | e55 unused) {
                }
                gu0 gu0Var2 = new gu0(de1Var.H0(g57.a()));
                oe8Var.R0("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", gu0Var2);
                gu0Var = gu0Var2;
            }
        }
        return gu0Var;
    }

    public static boolean o(zi0 zi0Var) {
        if (!jg0.d.contains(zi0Var.getName())) {
            return false;
        }
        if (lv0.h0(jg0.c, bp1.c(zi0Var)) && zi0Var.J().isEmpty()) {
            return true;
        }
        if (!wy3.z(zi0Var)) {
            return false;
        }
        Collection collectionJ = zi0Var.j();
        collectionJ.getClass();
        Collection<zi0> collection = collectionJ;
        if (collection.isEmpty()) {
            return false;
        }
        for (zi0 zi0Var2 : collection) {
            zi0Var2.getClass();
            if (o(zi0Var2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean p(int i2, Object obj) {
        int arity;
        if (obj instanceof pw2) {
            if (obj instanceof rw2) {
                arity = ((rw2) obj).getArity();
            } else if (obj instanceof Function0) {
                arity = 0;
            } else if (obj instanceof Function1) {
                arity = 1;
            } else if (obj instanceof hw2) {
                arity = 2;
            } else if (obj instanceof iw2) {
                arity = 3;
            } else if (obj instanceof jw2) {
                arity = 4;
            } else if (obj instanceof kw2) {
                arity = 5;
            } else if (obj instanceof lw2) {
                arity = 6;
            } else if (obj instanceof mw2) {
                arity = 7;
            } else if (obj instanceof nw2) {
                arity = 8;
            } else if (obj instanceof ow2) {
                arity = 9;
            } else if (obj instanceof uv2) {
                arity = 10;
            } else if (obj instanceof vv2) {
                arity = 11;
            } else if (obj instanceof wv2) {
                arity = 12;
            } else if (obj instanceof xv2) {
                arity = 13;
            } else if (obj instanceof yv2) {
                arity = 14;
            } else if (obj instanceof zv2) {
                arity = 15;
            } else if (obj instanceof aw2) {
                arity = 16;
            } else if (obj instanceof bw2) {
                arity = 17;
            } else if (obj instanceof cw2) {
                arity = 18;
            } else if (obj instanceof dw2) {
                arity = 19;
            } else if (obj instanceof ew2) {
                arity = 20;
            } else if (obj instanceof fw2) {
                arity = 21;
            } else {
                arity = obj instanceof gw2 ? 22 : -1;
            }
            if (arity == i2) {
                return true;
            }
        }
        return false;
    }

    public static final fs4 q(g44 g44Var, eb0 eb0Var, gb5 gb5Var) {
        return new b34(g44Var, eb0Var, gb5Var);
    }

    public static lm r(or3 or3Var, qh4 qh4Var) {
        return new lm(gy3.a(or3Var, qh4Var, 1.0f, jk0.r, false), (byte) 0);
    }

    public static mm s(kr3 kr3Var, qh4 qh4Var, boolean z2) {
        return new mm(gy3.a(kr3Var, qh4Var, z2 ? ta8.c() : 1.0f, d82.C, false));
    }

    public static lm t(or3 or3Var, qh4 qh4Var, int i2) {
        b03 b03Var = new b03();
        b03Var.m = i2;
        ArrayList arrayListA = gy3.a(or3Var, qh4Var, 1.0f, b03Var, false);
        for (int i3 = 0; i3 < arrayListA.size(); i3++) {
            dy3 dy3Var = (dy3) arrayListA.get(i3);
            yz2 yz2Var = (yz2) dy3Var.b;
            yz2 yz2Var2 = (yz2) dy3Var.c;
            if (yz2Var != null && yz2Var2 != null) {
                float[] fArr = yz2Var.a;
                int length = fArr.length;
                float[] fArr2 = yz2Var2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f2 = Float.NaN;
                    int i4 = 0;
                    for (int i5 = 0; i5 < length2; i5++) {
                        float f3 = fArr3[i5];
                        if (f3 != f2) {
                            fArr3[i4] = f3;
                            i4++;
                            f2 = fArr3[i5];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i4);
                    dy3Var = new dy3(yz2Var.b(fArrCopyOfRange), yz2Var2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i3, dy3Var);
        }
        return new lm(arrayListA, (byte) 1);
    }

    public static lm u(kr3 kr3Var, qh4 qh4Var) {
        return new lm(gy3.a(kr3Var, qh4Var, 1.0f, yl7.B, false), (byte) 2);
    }

    public static lm v(or3 or3Var, qh4 qh4Var) {
        return new lm(gy3.a(or3Var, qh4Var, ta8.c(), yl7.S, true), (byte) 3);
    }

    public static zf0 x(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        yk3 yk3Var = new yk3(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(mv0.Z(yk3Var, 10));
        Iterator it = yk3Var.iterator();
        while (true) {
            xk3 xk3Var = (xk3) it;
            if (!xk3Var.f2526o) {
                int[] iArrO0 = lv0.O0(arrayList);
                int[] iArrCopyOf = Arrays.copyOf(iArrO0, iArrO0.length);
                return new zf0(Arrays.copyOf(iArrCopyOf, iArrCopyOf.length));
            }
            xk3Var.nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
    }

    public static final View y(um1 um1Var) {
        if (!um1Var.f0().z) {
            ki3.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) e14.a(vn4.p0(um1Var));
    }

    public static void z(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(fx3.g(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        im3.Y(classCastException, e8.class.getName());
        throw classCastException;
    }

    public final Object w(Intent intent, int i2) {
        List arrayList;
        Uri data = null;
        z = false;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                if (i2 != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data2 = intent.getData();
                if (data2 != null) {
                    return data2;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data3 = intent.getData();
                if (data3 != null) {
                    linkedHashSet.add(data3);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    arrayList = ea2.m;
                } else {
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        for (int i3 = 0; i3 < itemCount; i3++) {
                            Uri uri = clipData.getItemAt(i3).getUri();
                            if (uri != null) {
                                linkedHashSet.add(uri);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                return (Uri) lv0.o0(arrayList);
            case 1:
                if (i2 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i4 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i4 == 0));
                        }
                        return xm4.U(lv0.V0(cx.Q0(stringArrayExtra), arrayList2));
                    }
                }
                return fa2.m;
            case 2:
                if (intent == null || i2 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra2 != null) {
                    for (int i5 : intArrayExtra2) {
                        if (i5 == 0) {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 3:
                return new z7(intent, i2);
            case 4:
                return new z7(intent, i2);
            case 5:
                if (i2 != -1) {
                    if (i2 != 0 && i2 != 2 && i2 != 3) {
                        i2 = -2;
                    }
                } else if (intent != null) {
                    data = intent.getData();
                }
                return new dz(i2, data);
            default:
                return new z7(intent, i2);
        }
    }
}
