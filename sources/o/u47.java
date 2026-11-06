package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class u47 {
    public static final float a = 0.38f;

    public static int A(int i, byte[] bArr, int i2, int i3, tv8 tv8Var, lp2 lp2Var) throws ev8 {
        if ((i >>> 3) == 0) {
            an4.s("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iE = E(bArr, i2, lp2Var);
            tv8Var.c(i, Long.valueOf(lp2Var.b));
            return iE;
        }
        if (i4 == 1) {
            tv8Var.c(i, Long.valueOf(H(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iB = B(bArr, i2, lp2Var);
            int i5 = lp2Var.a;
            if (i5 < 0) {
                an4.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iB) {
                an4.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                tv8Var.c(i, mu8.n);
            } else {
                tv8Var.c(i, mu8.k(bArr, iB, i5));
            }
            return iB + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                tv8Var.c(i, Integer.valueOf(x(bArr, i2)));
                return i2 + 4;
            }
            an4.s("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        tv8 tv8VarB = tv8.b();
        int i7 = lp2Var.c + 1;
        lp2Var.c = i7;
        I(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iB2 = B(bArr, i2, lp2Var);
            int i9 = lp2Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iB2;
                break;
            }
            i2 = A(i9, bArr, iB2, i3, tv8VarB, lp2Var);
            i8 = i9;
        }
        lp2Var.c--;
        if (i2 > i3 || i8 != i6) {
            an4.s("Failed to parse the message.");
            return 0;
        }
        tv8Var.c(i, tv8VarB);
        return i2;
    }

    public static int B(byte[] bArr, int i, lp2 lp2Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return C(b, bArr, i2, lp2Var);
        }
        lp2Var.a = b;
        return i2;
    }

    public static int C(int i, byte[] bArr, int i2, lp2 lp2Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            lp2Var.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            lp2Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            lp2Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            lp2Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                lp2Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int D(int i, byte[] bArr, int i2, int i3, yu8 yu8Var, lp2 lp2Var) {
        wu8 wu8Var = (wu8) yu8Var;
        int iB = B(bArr, i2, lp2Var);
        wu8Var.d(lp2Var.a);
        while (iB < i3) {
            int iB2 = B(bArr, iB, lp2Var);
            if (i != lp2Var.a) {
                break;
            }
            iB = B(bArr, iB2, lp2Var);
            wu8Var.d(lp2Var.a);
        }
        return iB;
    }

    public static int E(byte[] bArr, int i, lp2 lp2Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            lp2Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        lp2Var.b = j2;
        return i3;
    }

    public static int F(Object obj, qv8 qv8Var, byte[] bArr, int i, int i2, int i3, lp2 lp2Var) throws ev8 {
        int i4 = lp2Var.c + 1;
        lp2Var.c = i4;
        I(i4);
        int iR = ((iv8) qv8Var).r(obj, bArr, i, i2, i3, lp2Var);
        lp2Var.c--;
        lp2Var.d = obj;
        return iR;
    }

    public static int G(Object obj, qv8 qv8Var, byte[] bArr, int i, int i2, lp2 lp2Var) throws ev8 {
        int iC = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iC = C(i3, bArr, iC, lp2Var);
            i3 = lp2Var.a;
        }
        int i4 = iC;
        if (i3 < 0 || i3 > i2 - i4) {
            an4.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = lp2Var.c + 1;
        lp2Var.c = i5;
        I(i5);
        int i6 = i4 + i3;
        qv8Var.h(obj, bArr, i4, i6, lp2Var);
        lp2Var.c--;
        lp2Var.d = obj;
        return i6;
    }

    public static long H(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static void I(int i) throws ev8 {
        if (i < 100) {
            return;
        }
        an4.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* JADX WARN: Code duplicated, block: B:144:0x02d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v30 */
    public static final void a(boolean z, ce7 ce7Var, Function0 function0, Function0 function1, Function1 function2, Function1 function3, Function0 function4, fs4 fs4Var, jf3 jf3Var, ux2 ux2Var, int i) {
        ce7 ce7Var2;
        boolean z2;
        Function0 function5;
        Function1 function6;
        jf3 jf3Var2;
        int i2;
        int i3;
        jf3 jf3Var3;
        hc1 hc1Var;
        Object obj;
        boolean z3;
        Function1 function7;
        ?? r0;
        Object obj2;
        ?? r6;
        boolean zA;
        jt5 jt5Var;
        ?? r7;
        String quantityString;
        jt5 jt5Var2;
        it5 it5Var;
        jt5 jt5Var3;
        it5 it5Var2;
        String str;
        jt5 jt5Var4;
        it5 it5Var3;
        String str2;
        ce7Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        ux2Var.Y(1625787133);
        int i4 = i | (ux2Var.g(z) ? 4 : 2) | (ux2Var.d(ce7Var.ordinal()) ? 32 : 16) | (ux2Var.h(function0) ? 256 : 128) | (ux2Var.h(function1) ? 2048 : 1024) | (ux2Var.h(function2) ? 16384 : 8192) | (ux2Var.h(function3) ? 131072 : 65536) | (ux2Var.f(fs4Var) ? 8388608 : 4194304) | 33554432;
        byte b = 1;
        if (ux2Var.N(i4 & 1, (38347923 & i4) != 38347922)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                dl5 dl5Var = new dl5(new uf2((byte) 25), b);
                we8 we8VarA = id4.a(ux2Var);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = 16384;
                    i3 = i4 & (-234881025);
                    jf3Var3 = (jf3) g57.t(w86.a.b(jf3.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var);
                }
            } else {
                ux2Var.Q();
                i3 = i4 & (-234881025);
                jf3Var3 = jf3Var;
                i2 = 16384;
            }
            int i5 = i3;
            ux2Var.q();
            Activity activity = (Activity) ux2Var.j(tc4.a);
            if (activity == null) {
                j56 j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new be7(z, ce7Var, function0, function1, function2, function3, function4, fs4Var, jf3Var3, i, (byte) 0);
                    return;
                }
                return;
            }
            z2 = z;
            function5 = function0;
            jf3 jf3Var4 = jf3Var3;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ux2Var.j(dd4.a);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zH = ((i5 & 14) == 4) | ux2Var.h(jf3Var4);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            hc1 hc1Var2 = null;
            if (zH || objK == awVar) {
                objK = new if3(z2, jf3Var4, (hc1) null);
                ux2Var.g0(objK);
            }
            ck3.i(boolValueOf, (hw2) objK, ux2Var);
            boolean zH2 = ux2Var.h(lifecycleOwner) | ux2Var.h(jf3Var4) | ((i5 & 112) == 32);
            Object objK2 = ux2Var.K();
            if (zH2 || objK2 == awVar) {
                objK2 = new tx(lifecycleOwner, jf3Var4, ce7Var, hc1Var2, (byte) 9);
                hc1Var = null;
                ux2Var.g0(objK2);
            } else {
                hc1Var = null;
            }
            ce7Var2 = ce7Var;
            ck3.h(lifecycleOwner, ce7Var2, (hw2) objK2, ux2Var);
            String strZ = m77.z(R.string.error_loading_subscription_data, ux2Var);
            boolean zH3 = ux2Var.h(jf3Var4) | ((i5 & 896) == 256);
            Object objK3 = ux2Var.K();
            if (zH3 || objK3 == awVar) {
                objK3 = new k9(jf3Var4, function5, hc1Var, (byte) 11);
                ux2Var.g0(objK3);
            }
            int i6 = i5 >> 12;
            int i7 = i5 >> 3;
            ck3.h(function2, function5, (hw2) objK3, ux2Var);
            boolean zH4 = ux2Var.h(jf3Var4) | ux2Var.h(activity) | ((57344 & i5) == i2);
            Object objK4 = ux2Var.K();
            if (zH4 || objK4 == awVar) {
                hc1 hc1Var3 = hc1Var;
                s11 s11Var = new s11((Object) jf3Var4, (Object) activity, (Object) function2, hc1Var3, (byte) 5);
                function6 = function2;
                ux2Var.g0(s11Var);
                objK4 = s11Var;
                obj = hc1Var3;
            } else {
                obj = hc1Var;
                function6 = function2;
            }
            ck3.i(function6, (hw2) objK4, ux2Var);
            boolean zH5 = ux2Var.h(jf3Var4) | ((458752 & i5) == 131072) | ux2Var.f(strZ);
            Object objK5 = ux2Var.K();
            if (zH5 || objK5 == awVar) {
                z3 = false;
                t5 t5Var = new t5((Object) jf3Var4, (Object) function3, (Object) strZ, (Object) function4, (hc1) null, (byte) 6);
                function7 = function3;
                ux2Var.g0(t5Var);
                objK5 = t5Var;
            } else {
                function7 = function3;
                z3 = false;
            }
            ck3.h(function7, function4, (hw2) objK5, ux2Var);
            Resources resources = (Resources) ux2Var.j(lh.c);
            boolean zF = ux2Var.f((zd7) jf3Var4.z.getValue());
            Object objK6 = ux2Var.K();
            if (zF || objK6 == awVar) {
                zd7 zd7Var = (zd7) jf3Var4.z.getValue();
                boolean zA2 = zd7Var != null ? ae7.a(zd7Var) : z3;
                int iOrdinal = ce7Var2.ordinal();
                if (iOrdinal == 0) {
                    objK6 = new ee7(zA2);
                } else {
                    if (iOrdinal != 1) {
                        gk0.s();
                        return;
                    }
                    if (zd7Var != null) {
                        List list = ae7.a;
                        ArrayList arrayList = zd7Var.a.h;
                        if (arrayList == null || (jt5Var4 = (jt5) arrayList.get(0)) == null || (it5Var3 = (it5) jt5Var4.c.a.get(0)) == null) {
                            r0 = obj;
                        } else {
                            str2 = it5Var3.a;
                        }
                        if (r0 == 0) {
                            r0 = str2;
                            r0 = "";
                        }
                    } else {
                        r0 = obj;
                    }
                    if (r0 == 0) {
                        r0 = "";
                    }
                    if (zd7Var != null) {
                        List list2 = ae7.a;
                        resources.getClass();
                        ArrayList arrayList2 = zd7Var.a.h;
                        obj2 = "";
                        if (arrayList2 == null || (jt5Var3 = (jt5) arrayList2.get(0)) == null || (it5Var2 = (it5) jt5Var3.c.a.get(0)) == null) {
                            r7 = obj;
                        } else {
                            str = it5Var2.c;
                        }
                        if (r7 == 0) {
                            r7 = str;
                            r7 = obj2;
                        }
                        int i8 = (arrayList2 == null || (jt5Var2 = (jt5) arrayList2.get(0)) == null || (it5Var = (it5) jt5Var2.c.a.get(0)) == null) ? 0 : it5Var.d;
                        if (r7.length() >= 3) {
                            char cCharAt = r7.charAt(1);
                            int iDigit = Character.digit((int) cCharAt, 10);
                            if (iDigit < 0) {
                                throw new IllegalArgumentException("Char " + cCharAt + " is not a decimal digit");
                            }
                            int iMax = Math.max(1, iDigit * i8);
                            char cCharAt2 = r7.charAt(2);
                            if (cCharAt2 == 'M') {
                                quantityString = resources.getQuantityString(R.plurals.in_app_purchase_plan_duration_month, iMax, Integer.valueOf(iMax));
                                quantityString.getClass();
                            } else if (cCharAt2 == 'W') {
                                quantityString = resources.getQuantityString(R.plurals.in_app_purchase_plan_duration_week, iMax, Integer.valueOf(iMax));
                                quantityString.getClass();
                            } else if (cCharAt2 != 'Y') {
                                r6 = obj2;
                            } else {
                                quantityString = resources.getQuantityString(R.plurals.in_app_purchase_plan_duration_year, iMax, Integer.valueOf(iMax));
                                quantityString.getClass();
                            }
                            r6 = quantityString;
                        } else {
                            r6 = obj2;
                        }
                    } else {
                        obj2 = "";
                        r6 = obj;
                    }
                    if (r6 == 0) {
                        r6 = obj2;
                    }
                    if (zd7Var != null) {
                        ArrayList arrayList3 = zd7Var.a.h;
                        zA = false;
                        if (arrayList3 != null && (jt5Var = (jt5) arrayList3.get(0)) != null) {
                            obj = obj;
                            obj = obj;
                            obj = jt5Var.a;
                        }
                        if (obj == null) {
                            obj = obj2;
                        }
                    } else {
                        zA = false;
                    }
                    ?? r2 = obj == null ? obj2 : obj;
                    if (zd7Var != null) {
                        zA = ae7.a(zd7Var);
                    }
                    objK6 = new de7(r0, r6, r2, zA);
                }
                ux2Var.g0(objK6);
            }
            ge7 ge7Var = (ge7) objK6;
            boolean zH6 = ux2Var.h(jf3Var4);
            Object objK7 = ux2Var.K();
            if (zH6 || objK7 == awVar) {
                objK7 = new hf3(jf3Var4, (byte) 2);
                ux2Var.g0(objK7);
            }
            jf3Var2 = jf3Var4;
            r47.d(ge7Var, (Function0) objK7, function1, fs4Var, ux2Var, (i7 & 896) | (i6 & 7168));
        } else {
            ce7Var2 = ce7Var;
            z2 = z;
            function5 = function0;
            function6 = function2;
            ux2Var.Q();
            jf3Var2 = jf3Var;
        }
        j56 j56VarR2 = ux2Var.r();
        if (j56VarR2 != null) {
            j56VarR2.d = new be7(z2, ce7Var2, function5, function1, function6, function3, function4, fs4Var, jf3Var2, i, (byte) 1);
        }
    }

    public static final void b(yy0 yy0Var, boolean z, fs4 fs4Var, vk7 vk7Var, ux2 ux2Var, int i) {
        int i2;
        yy0 yy0Var2 = yy0Var;
        ux2Var.Y(-709992886);
        if ((i & 6) == 0) {
            i2 = (ux2Var.d(R.raw.lottie_animation_onboarding_tv) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(yy0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? ux2Var.f(vk7Var) : ux2Var.h(vk7Var) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (ux2Var.N(i3 & 1, (74899 & i3) != 74898)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            hk6 hk6VarW = im3.W(ux2Var);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = ck3.w(ux2Var);
                ux2Var.g0(objK);
            }
            me1 me1Var = (me1) objK;
            fs4 fs4VarF = fs4Var.f(androidx.compose.foundation.layout.b.c);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarF);
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
            s14 s14Var = new s14(1.0f, true);
            dg6 dg6VarA = cg6.a(iq8.f, xz2.y, ux2Var, 54);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, s14Var);
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
            fs4 fs4VarA = eg6.a(cs4.b, 1.0f);
            FillElement fillElement = androidx.compose.foundation.layout.b.b;
            r47.h(vk7Var, ka0.A(fs4VarA.f(fillElement), z ? rk7.e : rk7.f), ux2Var, (i3 & 14) | 64 | ((i3 >> 9) & 112));
            fs4 fs4VarT = o77.t(eg6.a(fillElement, 1.0f), hk6VarW, me1Var);
            kw0 kw0VarA2 = iw0.a(iq8.e, xz2.B, ux2Var, 54);
            int iHashCode3 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL3 = ux2Var.l();
            fs4 fs4VarS3 = uf0.s(ux2Var, fs4VarT);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA2, iz0Var, ux2Var);
            o67.n(yj5VarL3, iz0Var2, ux2Var);
            e41.r(iHashCode3, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS3, iz0Var4, ux2Var);
            yy0Var2 = yy0Var;
            yy0Var2.invoke(ux2Var, Integer.valueOf((i3 >> 3) & 14));
            ux2Var.p(true);
            ux2Var.p(true);
            ux2Var.W(1628248377);
            ux2Var.p(false);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new uu((byte) 5, i, (Object) yy0Var2, (Object) fs4Var, (Object) vk7Var, z);
        }
    }

    public static final long c(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = d18.c;
        return jFloatToRawIntBits;
    }

    public static final void d(fs4 fs4Var, ux2 ux2Var, int i) {
        ux2 ux2Var2;
        ux2Var.Y(481039479);
        int i2 = i | 6;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            cs4 cs4Var = cs4.b;
            ux2Var2 = ux2Var;
            st5.a(androidx.compose.foundation.layout.b.l(cs4Var, 16.0f), ((rn4) ux2Var.j(un4.a)).a.q, 1.0f, 0L, 0, 0.0f, ux2Var2, 384, 56);
            fs4Var = cs4Var;
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var, i, (byte) 14);
        }
    }

    public static final int e(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean h(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStreamF = null;
        try {
            try {
                fileOutputStreamF = io.sentry.config.a.f(file, new FileOutputStream(file, false), false);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        fileOutputStreamF.write(bArr, 0, i);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                    if (fileOutputStreamF != null) {
                        try {
                            fileOutputStreamF.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
                fileOutputStreamF.close();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                return true;
            } catch (IOException e) {
                io.sentry.android.core.v0.c("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                if (fileOutputStreamF != null) {
                    try {
                        fileOutputStreamF.close();
                    } catch (IOException unused3) {
                    }
                }
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                return false;
            }
        } catch (Throwable th) {
            if (fileOutputStreamF != null) {
                fileOutputStreamF.close();
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static String i(yh0 yh0Var) {
        StringBuilder sb = new StringBuilder(yh0Var.size());
        for (int i = 0; i < yh0Var.size(); i++) {
            byte bA = yh0Var.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case ep1.b /* 9 */:
                        sb.append("\\t");
                        break;
                    case ep1.c /* 10 */:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case ep1.d /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final km8 j(xm8 xm8Var) {
        xm8Var.getClass();
        return new km8(xm8Var.a, xm8Var.t);
    }

    public static File l(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, fx3.e(i, str));
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static MappedByteBuffer o(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                FileInputStream fileInputStreamD = io.sentry.config.a.d(new FileInputStream(fileDescriptor), fileDescriptor);
                try {
                    FileChannel channel = fileInputStreamD.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStreamD.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStreamD.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object u(a77 a77Var, jc1 jc1Var) {
        ua8 ua8Var;
        a77 a77Var2;
        Throwable th;
        bf0 bf0Var;
        if (jc1Var instanceof ua8) {
            ua8Var = (ua8) jc1Var;
            int i = ua8Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ua8Var.p = i - Integer.MIN_VALUE;
            } else {
                ua8Var = new ua8(jc1Var);
            }
        } else {
            ua8Var = new ua8(jc1Var);
        }
        Object obj = ua8Var.f2193o;
        int i2 = ua8Var.p;
        if (i2 != 0) {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bf0Var = ua8Var.n;
            a77Var2 = ua8Var.m;
            try {
                ct1.a0(obj);
                iq8.l(a77Var2, null);
                return bf0Var;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    iq8.l(a77Var2, th);
                    throw th3;
                }
            }
        }
        ct1.a0(obj);
        try {
            bf0 bf0Var2 = new bf0();
            ua8Var.m = a77Var;
            ua8Var.n = bf0Var2;
            ua8Var.p = 1;
            a77Var.m.r0(bf0Var2);
            f88 f88Var = f88.a;
            ne1 ne1Var = ne1.m;
            if (f88Var == ne1Var) {
                return ne1Var;
            }
            a77Var2 = a77Var;
            bf0Var = bf0Var2;
            iq8.l(a77Var2, null);
            return bf0Var;
        } catch (Throwable th4) {
            a77Var2 = a77Var;
            th = th4;
            throw th;
        }
    }

    public static int w(byte[] bArr, int i, lp2 lp2Var) throws ev8 {
        int iB = B(bArr, i, lp2Var);
        int i2 = lp2Var.a;
        if (i2 < 0) {
            an4.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iB) {
            an4.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            lp2Var.d = mu8.n;
            return iB;
        }
        lp2Var.d = mu8.k(bArr, iB, i2);
        return iB + i2;
    }

    public static int x(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int y(qv8 qv8Var, int i, byte[] bArr, int i2, int i3, yu8 yu8Var, lp2 lp2Var) throws ev8 {
        vu8 vu8VarG = qv8Var.g();
        qv8 qv8Var2 = qv8Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        lp2 lp2Var2 = lp2Var;
        int iG = G(vu8VarG, qv8Var2, bArr2, i2, i4, lp2Var2);
        qv8Var2.a(vu8VarG);
        lp2Var2.d = vu8VarG;
        yu8Var.add(vu8VarG);
        while (iG < i4) {
            lp2 lp2Var3 = lp2Var2;
            int i5 = i4;
            int iB = B(bArr2, iG, lp2Var3);
            if (i != lp2Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            qv8 qv8Var3 = qv8Var2;
            vu8 vu8VarG2 = qv8Var3.g();
            iG = G(vu8VarG2, qv8Var3, bArr3, iB, i5, lp2Var3);
            qv8Var2 = qv8Var3;
            bArr2 = bArr3;
            i4 = i5;
            lp2Var2 = lp2Var3;
            qv8Var2.a(vu8VarG2);
            lp2Var2.d = vu8VarG2;
            yu8Var.add(vu8VarG2);
        }
        return iG;
    }

    public static int z(byte[] bArr, int i, yu8 yu8Var, lp2 lp2Var) throws ev8 {
        wu8 wu8Var = (wu8) yu8Var;
        int iB = B(bArr, i, lp2Var);
        int i2 = lp2Var.a;
        if (i2 < 0) {
            an4.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iB) {
            an4.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i3 = i2 + iB;
        while (iB < i3) {
            iB = B(bArr, iB, lp2Var);
            wu8Var.d(lp2Var.a);
        }
        if (iB == i3) {
            return iB;
        }
        an4.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public int f(View view, int i) {
        return view.getLeft();
    }

    public int g(View view, int i) {
        return view.getTop();
    }

    public Object k(wt3 wt3Var) {
        return null;
    }

    public int m(View view) {
        return 0;
    }

    public int n() {
        return 0;
    }

    public void p(View view, int i) {
    }

    public abstract void q(int i);

    public abstract void r(View view, int i, int i2);

    public abstract void s(View view, float f, float f2);

    public u47 t(wt3 wt3Var, Object obj) {
        return obj != null ? new oa4(wt3Var, obj, this) : this;
    }

    public abstract boolean v(View view, int i);
}
