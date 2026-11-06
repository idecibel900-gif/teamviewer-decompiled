package o;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.compose.ui.node.LayoutNode;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class pm8 {
    public static final float[] a = new float[91];
    public static final yy0 b = new yy0(210148896, false, new g9((byte) 29));
    public static final yy0 c = new yy0(-1571120048, false, new cz0());
    public static final yy0 d = new yy0(-1455401925, false, new az0(4));
    public static final yy0 e = new yy0(-81534790, false, new az0(20));
    public static final yy0 f = new yy0(-1953959290, false, new az0(21));
    public static final yy0 g = new yy0(1544329526, false, new gz0(7));
    public static final yy0 h = new yy0(-450973196, false, new gz0(8));
    public static final yy0 i = new yy0(1413004188, false, new iz0(13));
    public static final gj2 j = new gj2(14);
    public static final float k = 6.0f;
    public static final float l = 6.0f;
    public static final float m = 8.0f;
    public static final float n = 6.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f4 f1749o = new f4(Boolean.TRUE);
    public static final hk p = new hk(6);
    public static final byte[] q = {112, 114, 111, 0};
    public static final byte[] r = {112, 114, 109, 0};
    public static final np6 s = new np6("TestTagsAsResourceId", false, new jp6(11));
    public static final np6 t = new np6("AccessibilityClassName", true, new jp6(3));
    public static final np6 u = new np6("CredentialRequest", false, new jp6(12));
    public static final StackTraceElement[] v = new StackTraceElement[0];
    public static aw w;

    public static final fs4 A(fs4 fs4Var, Function1 function1) {
        return fs4Var.f(new a71(function1));
    }

    public static final fs4 B(fs4 fs4Var, Function1 function1) {
        return fs4Var.f(new b85(function1));
    }

    public static int[] C(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iQ = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iQ += (int) yo1.Q(byteArrayInputStream, 2);
            iArr[i3] = iQ;
        }
        return iArr;
    }

    public static h02[] D(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, h02[] h02VarArr) throws IOException {
        byte[] bArr3 = mo8.t;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, mo8.u)) {
                hk0.l("Unsupported meta version");
                return null;
            }
            int iQ = (int) yo1.Q(fileInputStream, 2);
            byte[] bArrO = yo1.O(fileInputStream, (int) yo1.Q(fileInputStream, 4), (int) yo1.Q(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                hk0.l("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrO);
            try {
                h02[] h02VarArrF = F(byteArrayInputStream, bArr2, iQ, h02VarArr);
                byteArrayInputStream.close();
                return h02VarArrF;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(mo8.f1494o, bArr2)) {
            hk0.l("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            hk0.l("Unsupported meta version");
            return null;
        }
        int iQ2 = (int) yo1.Q(fileInputStream, 1);
        byte[] bArrO2 = yo1.O(fileInputStream, (int) yo1.Q(fileInputStream, 4), (int) yo1.Q(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            hk0.l("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrO2);
        try {
            h02[] h02VarArrE = E(byteArrayInputStream2, iQ2, h02VarArr);
            byteArrayInputStream2.close();
            return h02VarArrE;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static h02[] E(ByteArrayInputStream byteArrayInputStream, int i2, h02[] h02VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new h02[0];
        }
        if (i2 != h02VarArr.length) {
            hk0.l("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iQ = (int) yo1.Q(byteArrayInputStream, 2);
            iArr[i3] = (int) yo1.Q(byteArrayInputStream, 2);
            strArr[i3] = new String(yo1.N(byteArrayInputStream, iQ), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            h02 h02Var = h02VarArr[i4];
            if (!h02Var.b.equals(strArr[i4])) {
                hk0.l("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            h02Var.e = i5;
            h02Var.h = C(byteArrayInputStream, i5);
        }
        return h02VarArr;
    }

    public static h02[] F(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, h02[] h02VarArr) throws IOException {
        h02 h02Var;
        if (byteArrayInputStream.available() == 0) {
            return new h02[0];
        }
        if (i2 != h02VarArr.length) {
            hk0.l("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            yo1.Q(byteArrayInputStream, 2);
            String str = new String(yo1.N(byteArrayInputStream, (int) yo1.Q(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jQ = yo1.Q(byteArrayInputStream, 4);
            int iQ = (int) yo1.Q(byteArrayInputStream, 2);
            if (h02VarArr.length <= 0) {
                h02Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i4 = 0;
            while (true) {
                if (i4 >= h02VarArr.length) {
                    h02Var = null;
                    break;
                }
                if (h02VarArr[i4].b.equals(strSubstring)) {
                    h02Var = h02VarArr[i4];
                    break;
                }
                i4++;
            }
            if (h02Var == null) {
                hk0.l("Missing profile key: ".concat(str));
                return null;
            }
            h02Var.d = jQ;
            int[] iArrC = C(byteArrayInputStream, iQ);
            if (Arrays.equals(bArr, mo8.s)) {
                h02Var.e = iQ;
                h02Var.h = iArrC;
            }
        }
        return h02VarArr;
    }

    public static h02[] G(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, mo8.p)) {
            hk0.l("Unsupported version");
            return null;
        }
        int iQ = (int) yo1.Q(fileInputStream, 1);
        byte[] bArrO = yo1.O(fileInputStream, (int) yo1.Q(fileInputStream, 4), (int) yo1.Q(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            hk0.l("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrO);
        try {
            h02[] h02VarArrH = H(byteArrayInputStream, str, iQ);
            byteArrayInputStream.close();
            return h02VarArrH;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static h02[] H(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new h02[0];
        }
        h02[] h02VarArr = new h02[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iQ = (int) yo1.Q(byteArrayInputStream, 2);
            int iQ2 = (int) yo1.Q(byteArrayInputStream, 2);
            h02VarArr[i4] = new h02(str, new String(yo1.N(byteArrayInputStream, iQ), StandardCharsets.UTF_8), yo1.Q(byteArrayInputStream, 4), iQ2, (int) yo1.Q(byteArrayInputStream, 4), (int) yo1.Q(byteArrayInputStream, 4), new int[iQ2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            h02 h02Var = h02VarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = h02Var.f;
            int i7 = h02Var.g;
            TreeMap treeMap = h02Var.i;
            int i8 = iAvailable - i6;
            int iQ3 = i3;
            while (byteArrayInputStream.available() > i8) {
                iQ3 += (int) yo1.Q(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iQ3), 1);
                int iQ4 = (int) yo1.Q(byteArrayInputStream, 2);
                while (iQ4 > 0) {
                    yo1.Q(byteArrayInputStream, 2);
                    int iQ5 = (int) yo1.Q(byteArrayInputStream, 1);
                    if (iQ5 != 6 && iQ5 != 7) {
                        while (iQ5 > 0) {
                            yo1.Q(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iQ6 = (int) yo1.Q(byteArrayInputStream, 1); iQ6 > 0; iQ6--) {
                                yo1.Q(byteArrayInputStream, 2);
                            }
                            iQ5--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iQ4--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                hk0.l("Read too much data during profile line parse");
                return null;
            }
            h02Var.h = C(byteArrayInputStream, h02Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(yo1.N(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | numValueOf.intValue()));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return h02VarArr;
    }

    public static final void I(String str, wt3 wt3Var) {
        String string;
        wt3Var.getClass();
        String str2 = "in the polymorphic scope of '" + wt3Var.f() + '\'';
        if (str == null) {
            string = to7.i('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbO = e41.o("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            e41.t(sbO, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbO.append(wt3Var.f());
            sbO.append("' has to be sealed and '@Serializable'.");
            string = sbO.toString();
        }
        throw new nq6(string);
    }

    public static c41 J(f95 f95Var) {
        int iOrdinal = f95Var.ordinal();
        fs1 fs1Var = fs1.f825o;
        as1 as1Var = as1.m;
        if (iOrdinal == 0) {
            return new c41(new es1(as1Var, fs1Var), vl7.Busy);
        }
        if (iOrdinal == 6) {
            return new c41(new es1(as1.f353o, fs1.p), vl7.Offline);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? new c41(new es1(as1Var, fs1Var), vl7.Offline) : new c41(new es1(as1Var, fs1Var), vl7.Away);
        }
        return new c41(new es1(as1Var, fs1.m), vl7.Online);
    }

    public static boolean K(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, h02[] h02VarArr) throws IOException {
        int i2;
        int i3;
        int length;
        byte[] bArr2 = mo8.s;
        byte[] bArr3 = mo8.r;
        byte[] bArr4 = mo8.f1494o;
        int i4 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = mo8.p;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrQ = q(h02VarArr, bArr5);
                yo1.Z(byteArrayOutputStream, h02VarArr.length, 1);
                yo1.Z(byteArrayOutputStream, bArrQ.length, 4);
                byte[] bArrV = yo1.v(bArrQ);
                yo1.Z(byteArrayOutputStream, bArrV.length, 4);
                byteArrayOutputStream.write(bArrV);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                yo1.Z(byteArrayOutputStream, h02VarArr.length, 1);
                for (h02 h02Var : h02VarArr) {
                    int size = h02Var.i.size() * 4;
                    String strS = s(bArr3, h02Var.a, h02Var.b);
                    Charset charset = StandardCharsets.UTF_8;
                    yo1.a0(byteArrayOutputStream, strS.getBytes(charset).length);
                    yo1.a0(byteArrayOutputStream, h02Var.h.length);
                    yo1.Z(byteArrayOutputStream, size, 4);
                    yo1.Z(byteArrayOutputStream, h02Var.c, 4);
                    byteArrayOutputStream.write(strS.getBytes(charset));
                    Iterator it = h02Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        yo1.a0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        yo1.a0(byteArrayOutputStream, 0);
                    }
                    for (int i5 : h02Var.h) {
                        yo1.a0(byteArrayOutputStream, i5);
                    }
                }
                return true;
            }
            byte[] bArr6 = mo8.q;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrQ2 = q(h02VarArr, bArr6);
                yo1.Z(byteArrayOutputStream, h02VarArr.length, 1);
                yo1.Z(byteArrayOutputStream, bArrQ2.length, 4);
                byte[] bArrV2 = yo1.v(bArrQ2);
                yo1.Z(byteArrayOutputStream, bArrV2.length, 4);
                byteArrayOutputStream.write(bArrV2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            yo1.a0(byteArrayOutputStream, h02VarArr.length);
            for (h02 h02Var2 : h02VarArr) {
                String str = h02Var2.a;
                TreeMap treeMap = h02Var2.i;
                String strS2 = s(bArr2, str, h02Var2.b);
                Charset charset2 = StandardCharsets.UTF_8;
                yo1.a0(byteArrayOutputStream, strS2.getBytes(charset2).length);
                yo1.a0(byteArrayOutputStream, treeMap.size());
                yo1.a0(byteArrayOutputStream, h02Var2.h.length);
                yo1.Z(byteArrayOutputStream, h02Var2.c, 4);
                byteArrayOutputStream.write(strS2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    yo1.a0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i6 : h02Var2.h) {
                    yo1.a0(byteArrayOutputStream, i6);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            yo1.a0(byteArrayOutputStream2, h02VarArr.length);
            int i7 = 2;
            int i8 = 2;
            for (h02 h02Var3 : h02VarArr) {
                yo1.Z(byteArrayOutputStream2, h02Var3.c, 4);
                yo1.Z(byteArrayOutputStream2, h02Var3.d, 4);
                yo1.Z(byteArrayOutputStream2, h02Var3.g, 4);
                String strS3 = s(bArr4, h02Var3.a, h02Var3.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strS3.getBytes(charset3).length;
                yo1.a0(byteArrayOutputStream2, length2);
                i8 = i8 + 14 + length2;
                byteArrayOutputStream2.write(strS3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i8 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray.length);
            }
            yn8 yn8Var = new yn8(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(yn8Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i9 = 0;
            int i10 = 0;
            while (i9 < h02VarArr.length) {
                try {
                    h02 h02Var4 = h02VarArr[i9];
                    yo1.a0(byteArrayOutputStream3, i9);
                    yo1.a0(byteArrayOutputStream3, h02Var4.e);
                    i10 = i10 + 4 + (h02Var4.e * i7);
                    int[] iArr = h02Var4.h;
                    int length3 = iArr.length;
                    int i11 = i4;
                    while (i4 < length3) {
                        int i12 = iArr[i4];
                        yo1.a0(byteArrayOutputStream3, i12 - i11);
                        i4++;
                        i7 = i7;
                        i11 = i12;
                    }
                    i9++;
                    i4 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i13 = i7;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i10 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray2.length);
            }
            yn8 yn8Var2 = new yn8(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(yn8Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i14 = 0;
            for (int i15 = 0; i15 < h02VarArr.length; i15++) {
                try {
                    h02 h02Var5 = h02VarArr[i15];
                    Iterator it3 = h02Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        P(byteArrayOutputStream5, iIntValue, h02Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            Q(byteArrayOutputStream6, h02Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            yo1.a0(byteArrayOutputStream4, i15);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i14 + 6;
                            yo1.Z(byteArrayOutputStream4, length4, 4);
                            yo1.a0(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i14 = i16 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i14 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray5.length);
            }
            yn8 yn8Var3 = new yn8(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList.add(yn8Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            yo1.Z(byteArrayOutputStream, arrayList.size(), 4);
            int i17 = 0;
            while (i17 < arrayList.size()) {
                yn8 yn8Var4 = (yn8) arrayList.get(i17);
                int i18 = yn8Var4.a;
                byte[] bArr7 = yn8Var4.b;
                if (i18 != 1) {
                    i2 = i13;
                    if (i18 == i2) {
                        i3 = 1;
                    } else if (i18 == 3) {
                        i3 = i2;
                    } else if (i18 == 4) {
                        i3 = 3;
                    } else {
                        if (i18 != 5) {
                            throw null;
                        }
                        i3 = 4;
                    }
                } else {
                    i2 = i13;
                    i3 = 0;
                }
                yo1.Z(byteArrayOutputStream, i3, 4);
                yo1.Z(byteArrayOutputStream, size2, 4);
                if (yn8Var4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrV3 = yo1.v(bArr7);
                    arrayList2.add(bArrV3);
                    yo1.Z(byteArrayOutputStream, bArrV3.length, 4);
                    yo1.Z(byteArrayOutputStream, length5, 4);
                    length = bArrV3.length;
                } else {
                    arrayList2.add(bArr7);
                    yo1.Z(byteArrayOutputStream, bArr7.length, 4);
                    yo1.Z(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i17++;
                i13 = i2;
            }
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i19));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static final fs4 L(fs4 fs4Var, qj8 qj8Var) {
        return fs4Var.f(new sj3(qj8Var));
    }

    public static k58 M(k58 k58Var) {
        byte b2 = 0;
        if (!(k58Var instanceof rg3)) {
            return new zl0(k58Var, b2);
        }
        rg3 rg3Var = (rg3) k58Var;
        d58[] d58VarArr = rg3Var.b;
        h58[] h58VarArr = rg3Var.c;
        h58VarArr.getClass();
        d58VarArr.getClass();
        int iMin = Math.min(h58VarArr.length, d58VarArr.length);
        ArrayList<vd5> arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(new vd5(h58VarArr[i2], d58VarArr[i2]));
        }
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        for (vd5 vd5Var : arrayList) {
            arrayList2.add(p((h58) vd5Var.m, (d58) vd5Var.n));
        }
        return new rg3(d58VarArr, (h58[]) arrayList2.toArray(new h58[0]), true);
    }

    public static void N(ByteArrayOutputStream byteArrayOutputStream, h02 h02Var) throws IOException {
        Q(byteArrayOutputStream, h02Var);
        int i2 = h02Var.g;
        int[] iArr = h02Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            yo1.a0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : h02Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void O(ByteArrayOutputStream byteArrayOutputStream, h02 h02Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        yo1.a0(byteArrayOutputStream, str.getBytes(charset).length);
        yo1.a0(byteArrayOutputStream, h02Var.e);
        yo1.Z(byteArrayOutputStream, h02Var.f, 4);
        yo1.Z(byteArrayOutputStream, h02Var.c, 4);
        yo1.Z(byteArrayOutputStream, h02Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void P(ByteArrayOutputStream byteArrayOutputStream, int i2, h02 h02Var) throws IOException {
        int i3 = h02Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : h02Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void Q(ByteArrayOutputStream byteArrayOutputStream, h02 h02Var) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : h02Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                yo1.a0(byteArrayOutputStream, iIntValue - i2);
                yo1.a0(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v22, types: [o.fs4] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    public static final void a(final ArrayList arrayList, Function0 function0, Function1 function1, fs4 fs4Var, l33 l33Var, me1 me1Var, p9 p9Var, ux2 ux2Var, int i2, int i3) {
        l33 l33Var2;
        int i4;
        fs4 fs4Var2;
        me1 me1Var2;
        p9 p9Var2;
        l33 l33Var3;
        aw awVar;
        ux2 ux2Var2;
        p9 p9Var3;
        int i5;
        l33 l33Var4;
        fs4 fs4Var3;
        me1 me1Var3;
        l33 l33Var5;
        int i6;
        p9 p9Var4;
        Function0 function2;
        n9 n9Var;
        Object k9Var;
        ux2 ux2Var3;
        ?? r8;
        me1 me1Var4;
        ux2 ux2Var4 = ux2Var;
        function0.getClass();
        function1.getClass();
        ux2Var4.Y(712629569);
        byte b2 = 4;
        int i7 = i2 | (ux2Var4.f(arrayList) ? 4 : 2) | (ux2Var4.h(function0) ? 32 : 16) | (ux2Var4.h(function1) ? 256 : 128);
        int i8 = i7 | 3072;
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 = i7 | 27648;
            l33Var2 = l33Var;
        } else {
            l33Var2 = l33Var;
            i4 = i8 | (ux2Var4.h(l33Var2) ? 16384 : 8192);
        }
        int i10 = i4 | 589824;
        if (ux2Var4.N(i10 & 1, (599187 & i10) != 599186)) {
            ux2Var4.S();
            int i11 = i2 & 1;
            cs4 cs4Var = cs4.b;
            aw awVar2 = e01.a;
            if (i11 == 0 || ux2Var4.x()) {
                if (i9 != 0) {
                    l33Var2 = null;
                }
                Object objK = ux2Var4.K();
                if (objK == awVar2) {
                    objK = ck3.w(ux2Var4);
                    ux2Var4.g0(objK);
                }
                me1 me1Var5 = (me1) objK;
                dl5 dl5Var = new dl5(new e5(b2), (byte) 1);
                we8 we8VarA = id4.a(ux2Var4);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                awVar = awVar2;
                oe8 oe8VarT = g57.t(w86.a.b(p9.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var);
                ux2Var2 = ux2Var;
                p9Var3 = (p9) oe8VarT;
                i5 = i10 & (-4128769);
                l33Var4 = l33Var2;
                fs4Var3 = cs4Var;
                me1Var3 = me1Var5;
            } else {
                ux2Var4.Q();
                int i12 = i10 & (-4128769);
                me1Var3 = me1Var;
                l33Var4 = l33Var2;
                awVar = awVar2;
                ux2Var2 = ux2Var4;
                fs4Var3 = fs4Var;
                i5 = i12;
                p9Var3 = p9Var;
            }
            ux2Var2.q();
            final px4 px4VarG = g57.g(p9Var3.q, ux2Var2);
            boolean zH = ux2Var2.h(p9Var3);
            Object objK2 = ux2Var2.K();
            if (zH || objK2 == awVar) {
                objK2 = new i0(1, p9Var3, p9.class, "updateEmail", "updateEmail(Ljava/lang/String;)V", 0, (byte) 1);
                ux2Var2.g0(objK2);
            }
            pu3 pu3Var = (pu3) objK2;
            boolean zH2 = ux2Var2.h(p9Var3);
            Object objK3 = ux2Var2.K();
            if (zH2 || objK3 == awVar) {
                objK3 = new i0(1, p9Var3, p9.class, "updateGroup", "updateGroup(Lcom/teamviewer/remotecontrolviewmodellib/devicetab/groups/data/GroupInfo;)V", 0, (byte) 2);
                ux2Var2.g0(objK3);
            }
            pu3 pu3Var2 = (pu3) objK3;
            boolean zH3 = ux2Var2.h(p9Var3);
            Object objK4 = ux2Var2.K();
            if (zH3 || objK4 == awVar) {
                objK4 = new i0(1, p9Var3, p9.class, "setPreSelectedGroup", "setPreSelectedGroup(Lcom/teamviewer/remotecontrolviewmodellib/devicetab/groups/data/GroupInfo;)V", 0, (byte) 3);
                ux2Var2.g0(objK4);
            }
            pu3 pu3Var3 = (pu3) objK4;
            boolean zH4 = ux2Var2.h(p9Var3);
            Object objK5 = ux2Var2.K();
            if (zH4 || objK5 == awVar) {
                objK5 = new i0(1, p9Var3, p9.class, "updateDescription", "updateDescription(Ljava/lang/String;)V", 0, (byte) 4);
                ux2Var2.g0(objK5);
            }
            pu3 pu3Var4 = (pu3) objK5;
            boolean zH5 = ux2Var2.h(p9Var3);
            Object objK6 = ux2Var2.K();
            if (zH5 || objK6 == awVar) {
                objK6 = new m9(0, p9Var3, p9.class, "clearInputFields", "clearInputFields()V", 0, (byte) 0);
                ux2Var2.g0(objK6);
            }
            pu3 pu3Var5 = (pu3) objK6;
            boolean zH6 = ux2Var2.h(p9Var3);
            Object objK7 = ux2Var2.K();
            if (zH6 || objK7 == awVar) {
                objK7 = new m9(0, p9Var3, p9.class, "sendInvitation", "sendInvitation()V", 0, (byte) 1);
                ux2Var2.g0(objK7);
            }
            pu3 pu3Var6 = (pu3) objK7;
            boolean zH7 = ux2Var2.h(p9Var3);
            Object objK8 = ux2Var2.K();
            if (zH7 || objK8 == awVar) {
                objK8 = new i0(1, p9Var3, p9.class, "showBottomSheetView", "showBottomSheetView(Lcom/teamviewer/remotecontrolviewmodellib/devicetab/bottomsheets/data/BottomSheetView;)V", 0, (byte) 5);
                ux2Var2.g0(objK8);
            }
            n9 n9Var2 = new n9((Function1) pu3Var, (Function1) ((pu3) objK8), (Function1) pu3Var2, (Function1) pu3Var3, (Function1) pu3Var4, (Function0) pu3Var5, (Function0) pu3Var6);
            boolean zH8 = ux2Var2.h(n9Var2) | ((i5 & 112) == 32);
            Object objK9 = ux2Var2.K();
            if (zH8 || objK9 == awVar) {
                objK9 = new x8(n9Var2, function0, (byte) 0);
                ux2Var2.g0(objK9);
            }
            Function0 function3 = (Function0) objK9;
            px4 px4VarT = h57.t(function1, ux2Var2);
            boolean zH9 = ux2Var2.h(p9Var3) | ux2Var2.f(px4VarT) | ux2Var2.f(function3) | ux2Var2.h(l33Var4) | ux2Var2.h(n9Var2);
            Object objK10 = ux2Var2.K();
            if (zH9 || objK10 == awVar) {
                p9 p9Var5 = p9Var3;
                l33Var5 = l33Var4;
                i6 = i5;
                objK10 = new j9(p9Var5, function3, px4VarT, l33Var5, n9Var2, null);
                p9Var4 = p9Var5;
                function2 = function3;
                n9Var = n9Var2;
                ux2Var2.g0(objK10);
            } else {
                int i13 = i5;
                n9Var = n9Var2;
                p9Var4 = p9Var3;
                i6 = i13;
                function2 = function3;
                l33Var5 = l33Var4;
            }
            f88 f88Var = f88.a;
            ck3.i(f88Var, (hw2) objK10, ux2Var2);
            Integer numValueOf = Integer.valueOf(arrayList.size());
            boolean zF = ((i6 & 14) == 4) | ux2Var2.f(px4VarG) | ux2Var2.h(n9Var);
            Object objK11 = ux2Var2.K();
            if (zF || objK11 == awVar) {
                ux2Var3 = ux2Var2;
                hc1 hc1Var = null;
                k9Var = new k9(arrayList, n9Var, px4VarG, hc1Var, (byte) 0);
                ux2Var3.g0(k9Var);
                r8 = hc1Var;
            } else {
                ux2Var3 = ux2Var2;
                k9Var = objK11;
                r8 = 0;
            }
            ck3.i(numValueOf, (hw2) k9Var, ux2Var3);
            Activity activityZ = us1.z((Context) ux2Var3.j(lh.b));
            boolean zH10 = ux2Var3.h(activityZ) | ux2Var3.h(p9Var4);
            Object objK12 = ux2Var3.K();
            if (zH10 || objK12 == awVar) {
                objK12 = new g0(activityZ, p9Var4, (byte) 2);
                ux2Var3.g0(objK12);
            }
            ck3.e(f88Var, (Function1) objK12, ux2Var3);
            w50 w50Var = xz2.B;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f), "TVTA-devices-add-contact-bottom-sheet");
            kw0 kw0VarA = iw0.a(iq8.c, w50Var, ux2Var3, 48);
            int iHashCode = Long.hashCode(ux2Var3.T);
            yj5 yj5VarL = ux2Var3.l();
            fs4 fs4VarS = uf0.s(ux2Var3, fs4VarA);
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
            ea0 ea0Var = ((o9) px4VarG.getValue()).a;
            boolean zH11 = ux2Var3.h(n9Var);
            Object objK13 = ux2Var3.K();
            if (zH11 || objK13 == awVar) {
                objK13 = new y8(n9Var, (byte) 1);
                ux2Var3.g0(objK13);
            }
            i(ea0Var, (Function0) objK13, r8, ux2Var3, 0);
            final n9 n9Var3 = n9Var;
            lv1.k(null, 0.0f, 0L, ux2Var3, 0, 7);
            o9 o9Var = (o9) px4VarG.getValue();
            int iOrdinal = ((o9Var.g || !o9Var.i) ? ba.m : ba.n).ordinal();
            if (iOrdinal == 0) {
                ux2Var3.W(180518995);
                ea0 ea0Var2 = ((o9) px4VarG.getValue()).a;
                Object objK14 = ux2Var3.K();
                if (objK14 == awVar) {
                    objK14 = new t2((byte) 2);
                    ux2Var3.g0(objK14);
                }
                final Function0 function4 = function2;
                final me1 me1Var6 = me1Var3;
                final l33 l33Var6 = l33Var5;
                me1Var4 = me1Var6;
                ux2 ux2Var5 = ux2Var3;
                im3.a(ea0Var2, null, (Function1) objK14, null, "AddContactContent", null, au8.O(1230991999, new jw2() { // from class: o.d9
                    @Override // o.jw2
                    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                        ea0 ea0Var3 = (ea0) obj2;
                        ux2 ux2Var6 = (ux2) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        ((jn) obj).getClass();
                        ea0Var3.getClass();
                        if ((iIntValue & 48) == 0) {
                            iIntValue |= ux2Var6.d(ea0Var3.ordinal()) ? 32 : 16;
                        }
                        if (ux2Var6.N(iIntValue & 1, (iIntValue & 145) != 144)) {
                            int iOrdinal2 = ea0Var3.ordinal();
                            cs4 cs4Var2 = cs4.b;
                            n9 n9Var4 = n9Var3;
                            px4 px4Var = px4VarG;
                            if (iOrdinal2 == 0) {
                                ux2Var6.W(2052029450);
                                bw bwVar = iq8.c;
                                w50 w50Var2 = xz2.A;
                                kw0 kw0VarA2 = iw0.a(bwVar, w50Var2, ux2Var6, 0);
                                int iHashCode2 = Long.hashCode(ux2Var6.T);
                                yj5 yj5VarL2 = ux2Var6.l();
                                fs4 fs4VarS2 = uf0.s(ux2Var6, cs4Var2);
                                yz0.c.getClass();
                                ux2Var6.a0();
                                boolean z = ux2Var6.S;
                                tg3 tg3Var = LayoutNode.e0;
                                if (z) {
                                    ux2Var6.k(tg3Var);
                                } else {
                                    ux2Var6.j0();
                                }
                                iz0 iz0Var = d82.v;
                                o67.n(kw0VarA2, iz0Var, ux2Var6);
                                iz0 iz0Var2 = d82.u;
                                o67.n(yj5VarL2, iz0Var2, ux2Var6);
                                Integer numValueOf2 = Integer.valueOf(iHashCode2);
                                iz0 iz0Var3 = d82.w;
                                o67.n(numValueOf2, iz0Var3, ux2Var6);
                                o67.l(ux2Var6);
                                iz0 iz0Var4 = d82.t;
                                o67.n(fs4VarS2, iz0Var4, ux2Var6);
                                fs4 fs4VarF = ka0.F(o77.t(cs4Var2, im3.W(ux2Var6), me1Var6).f(new s14(1.0f, false)), 16.0f, 16.0f, 16.0f, 0.0f, 8);
                                kw0 kw0VarA3 = iw0.a(bwVar, w50Var2, ux2Var6, 0);
                                int iHashCode3 = Long.hashCode(ux2Var6.T);
                                yj5 yj5VarL3 = ux2Var6.l();
                                fs4 fs4VarS3 = uf0.s(ux2Var6, fs4VarF);
                                ux2Var6.a0();
                                if (ux2Var6.S) {
                                    ux2Var6.k(tg3Var);
                                } else {
                                    ux2Var6.j0();
                                }
                                o67.n(kw0VarA3, iz0Var, ux2Var6);
                                o67.n(yj5VarL3, iz0Var2, ux2Var6);
                                e41.r(iHashCode3, ux2Var6, iz0Var3, ux2Var6);
                                o67.n(fs4VarS3, iz0Var4, ux2Var6);
                                fs4 fs4VarF2 = ka0.F(cs4Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                                l33 l33Var7 = l33Var6;
                                pm8.g(l33Var7, fs4VarF2, ux2Var6, 48);
                                pm8.j((l33Var7 == null || !l33Var7.c) ? null : l33Var7, (o9) px4Var.getValue(), n9Var4, null, ux2Var6, 0);
                                ux2Var6.p(true);
                                pm8.d((o9) px4Var.getValue(), n9Var4.g, function4, ka0.F(cs4Var2, 16.0f, 16.0f, 16.0f, 0.0f, 8), ux2Var6, 0);
                                ux2Var6.p(true);
                                ux2Var6.p(false);
                            } else {
                                if (iOrdinal2 != 1) {
                                    throw fx3.m(1867309114, ux2Var6, false);
                                }
                                ux2Var6.W(2053696599);
                                l33 l33Var8 = ((o9) px4Var.getValue()).c;
                                String strZ = m77.z(R.string.device_tab_add_contact_bottom_sheet_search_placeholder, ux2Var6);
                                fs4 fs4VarF3 = ka0.F(cs4Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                                boolean zH12 = ux2Var6.h(n9Var4);
                                Object objK15 = ux2Var6.K();
                                aw awVar3 = e01.a;
                                if (zH12 || objK15 == awVar3) {
                                    objK15 = new q0(n9Var4, (byte) 3);
                                    ux2Var6.g0(objK15);
                                }
                                Function1 function5 = (Function1) objK15;
                                Object objK16 = ux2Var6.K();
                                if (objK16 == awVar3) {
                                    objK16 = new t2((byte) 3);
                                    ux2Var6.g0(objK16);
                                }
                                Function1 function6 = (Function1) objK16;
                                Object objK17 = ux2Var6.K();
                                if (objK17 == awVar3) {
                                    objK17 = new g9((byte) 0);
                                    ux2Var6.g0(objK17);
                                }
                                zu1.k(arrayList, l33Var8, function5, function6, (hw2) objK17, fs4VarF3, vn4.a, null, strZ, ux2Var6, 1797120, 384);
                                ux2Var6.p(false);
                            }
                        } else {
                            ux2Var6.Q();
                        }
                        return f88.a;
                    }
                }, ux2Var3), ux2Var5, 1597824);
                ux2Var4 = ux2Var5;
                ux2Var4.p(false);
            } else {
                if (iOrdinal != 1) {
                    throw fx3.m(1806936439, ux2Var3, false);
                }
                ux2Var3.W(184248481);
                jx0.e(384, m77.z(R.string.add_remote_device_to_selected_group_no_permission, ux2Var3), function2, ux2Var3, ka0.F(cs4Var, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                ux2Var3.p(false);
                me1Var4 = me1Var3;
                ux2Var4 = ux2Var3;
            }
            ux2Var4.p(true);
            fs4Var2 = fs4Var3;
            p9Var2 = p9Var4;
            me1Var2 = me1Var4;
            l33Var3 = l33Var5;
        } else {
            ux2Var4.Q();
            fs4Var2 = fs4Var;
            me1Var2 = me1Var;
            p9Var2 = p9Var;
            l33Var3 = l33Var2;
        }
        j56 j56VarR = ux2Var4.r();
        if (j56VarR != null) {
            j56VarR.d = new e9(arrayList, function0, function1, fs4Var2, l33Var3, me1Var2, p9Var2, i2, i3);
        }
    }

    public static ko b(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new ko(vn4.j0, Float.valueOf(f2), new mo(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void c(boolean z, boolean z2, String str, Function1 function1, Function1 function2, fs4 fs4Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        byte b2;
        int i3;
        ux2 ux2Var2 = ux2Var;
        function1.getClass();
        function2.getClass();
        ux2Var2.Y(2066825163);
        int i4 = i2 | (ux2Var2.g(z) ? 4 : 2) | (ux2Var2.g(z2) ? 32 : 16) | (ux2Var2.f(str) ? 256 : 128) | (ux2Var2.h(function1) ? 2048 : 1024) | (ux2Var2.h(function2) ? 16384 : 8192) | 196608;
        if (ux2Var2.N(i4 & 1, (74899 & i4) != 74898)) {
            Context context = (Context) ux2Var2.j(lh.b);
            Object[] objArr = new Object[0];
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new zq((byte) 17);
                ux2Var2.g0(objK);
            }
            px4 px4Var = (px4) zu1.L(objArr, (Function0) objK, ux2Var2, 48);
            Object[] objArr2 = new Object[0];
            Object objK2 = ux2Var2.K();
            if (objK2 == awVar) {
                objK2 = new zq((byte) 18);
                ux2Var2.g0(objK2);
            }
            px4 px4Var2 = (px4) zu1.L(objArr2, (Function0) objK2, ux2Var2, 48);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
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
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            sk7 sk7Var = new sk7(y57.g(R.string.settings_biometric_authentication), y57.g(R.string.settings_biometric_authentication_subtitle), new yk7(R.drawable.fingerprint), null, 24);
            String strZ = m77.z(R.string.settings_biometric_authentication, ux2Var2);
            boolean zF = ((i4 & 7168) == 2048) | ux2Var2.f(px4Var2);
            Object objK3 = ux2Var2.K();
            if (zF || objK3 == awVar) {
                b2 = 0;
                objK3 = new g70(function1, px4Var2, b2);
                ux2Var2.g0(objK3);
            } else {
                b2 = 0;
            }
            l47.d(sk7Var, z, (Function1) objK3, cs4Var, "TVTA-settings-biometric", strZ, ux2Var, 27648 | ((i4 << 3) & 112), 32);
            ux2Var2 = ux2Var;
            if (z) {
                ux2Var2.W(1283990361);
                fs4 fs4VarA = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-settings-biometric-lockApp");
                sk7 sk7Var2 = new sk7(y57.g(R.string.settings_lockApp), y57.g(y(str)), new yk7(R.drawable.ic_phone_lock), null, 8);
                boolean zF2 = ux2Var2.f(px4Var);
                Object objK4 = ux2Var2.K();
                if (zF2 || objK4 == awVar) {
                    objK4 = new la(px4Var, (byte) 5);
                    ux2Var2.g0(objK4);
                }
                x37.e(sk7Var2, fs4VarA, null, (Function0) objK4, null, ux2Var, 48, 52);
                ux2Var2 = ux2Var;
                i3 = 0;
                ux2Var2.p(false);
            } else {
                i3 = 0;
                ux2Var2.W(1284480781);
                ux2Var2.p(false);
            }
            lv1.k(null, 0.0f, 0L, ux2Var2, 0, 7);
            h(null, null, ux2Var2, i3);
            ux2Var2.p(true);
            if (((Boolean) px4Var2.getValue()).booleanValue() && z2) {
                ux2Var2.W(139105905);
                boolean zF3 = ux2Var2.f(px4Var2);
                Object objK5 = ux2Var2.K();
                if (zF3 || objK5 == awVar) {
                    objK5 = new la(px4Var2, (byte) 6);
                    ux2Var2.g0(objK5);
                }
                Function0 function0 = (Function0) objK5;
                boolean zF4 = ux2Var2.f(px4Var2);
                Object objK6 = ux2Var2.K();
                if (zF4 || objK6 == awVar) {
                    objK6 = new la(px4Var2, (byte) 7);
                    ux2Var2.g0(objK6);
                }
                db8.b(function0, (Function0) objK6, null, null, ux2Var2, 0);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(139296183);
                ux2Var2.p(false);
            }
            if (((Boolean) px4Var.getValue()).booleanValue()) {
                ux2Var2.W(139342156);
                String strZ2 = m77.z(y(str), ux2Var2);
                boolean zH = ux2Var2.h(context) | ((57344 & i4) == 16384);
                Object objK7 = ux2Var2.K();
                if (zH || objK7 == awVar) {
                    objK7 = new g0(context, function2, (byte) 14);
                    ux2Var2.g0(objK7);
                }
                Function1 function3 = (Function1) objK7;
                boolean zF5 = ux2Var2.f(px4Var);
                Object objK8 = ux2Var2.K();
                if (zF5 || objK8 == awVar) {
                    objK8 = new la(px4Var, (byte) 8);
                    ux2Var2.g0(objK8);
                }
                nv1.e(0, strZ2, (Function0) objK8, function3, ux2Var2, null, null);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(139721751);
                ux2Var2.p(false);
            }
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new h70(z, z2, str, function1, function2, fs4Var2, i2);
        }
    }

    public static final void d(o9 o9Var, Function0 function0, Function0 function1, fs4 fs4Var, ux2 ux2Var, int i2) {
        byte b2;
        byte b3;
        ng0 ng0VarA;
        boolean z;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(1441239763);
        int i3 = i2 | (ux2Var2.f(o9Var) ? 4 : 2) | (ux2Var2.h(function0) ? 32 : 16) | (ux2Var2.h(function1) ? 256 : 128) | (ux2Var2.f(fs4Var) ? 2048 : 1024);
        if (ux2Var2.N(i3 & 1, (i3 & 1171) != 1170)) {
            kw0 kw0VarA = iw0.a(new ew(8.0f, new hk0((byte) 2)), xz2.A, ux2Var2, 6);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4Var);
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
            boolean z2 = !o9Var.e && o9Var.b.length() > 0 && o9Var.d.length() <= 500 && o9Var.g;
            pd5 pd5Var = og0.a;
            if (o9Var.h) {
                ux2Var2.W(1802400493);
                h72 h72Var = un4.a;
                b3 = 1;
                b2 = 0;
                ng0VarA = og0.b(((rn4) ux2Var2.j(h72Var)).a.a, ((rn4) ux2Var2.j(h72Var)).a.b, ((rn4) ux2Var2.j(h72Var)).a.a, ((rn4) ux2Var2.j(h72Var)).a.b, ux2Var2);
                ux2Var2 = ux2Var2;
                ux2Var2.p(false);
            } else {
                b2 = 0;
                b3 = 1;
                ux2Var2.W(1802679090);
                ng0VarA = og0.a(ux2Var2);
                ux2Var2.p(false);
            }
            ng0 ng0Var = ng0VarA;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), "TVTA-devices-add-contact-bottom-sheet-invite-button");
            byte b4 = (i3 & 112) == 32 ? b3 : b2;
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (b4 != 0 || objK == awVar) {
                objK = new a9(function0, b2);
                ux2Var2.g0(objK);
            }
            ux2 ux2Var3 = ux2Var2;
            m77.g((Function0) objK, fs4VarA, null, z2, null, ng0Var, au8.O(-1365191474, new b9(o9Var, b2), ux2Var2), ux2Var3, 1572912, 20);
            ux2Var2 = ux2Var3;
            fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), "TVTA-devices-add-contact-bottom-sheet-cancel-button");
            boolean z3 = (i3 & 896) == 256;
            Object objK2 = ux2Var2.K();
            if (z3 || objK2 == awVar) {
                z = true;
                objK2 = new a9(function1, (byte) 1);
                ux2Var2.g0(objK2);
            } else {
                z = true;
            }
            v67.d((Function0) objK2, fs4VarA2, null, false, null, vn4.i, ux2Var2, 196656, 28);
            ux2Var2.p(z);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new z8(o9Var, function0, function1, fs4Var, i2);
        }
    }

    public static qx0 e() {
        qx0 qx0Var = new qx0(true);
        qx0Var.J(null);
        return qx0Var;
    }

    public static final void f(boolean z, Function0 function0, Function0 function1, ux2 ux2Var, int i2) {
        int i3;
        yy0 yy0VarO;
        function0.getClass();
        function1.getClass();
        ux2Var.Y(-1269625221);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 16;
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.h(function1) ? 256 : 128;
        }
        byte b3 = 0;
        byte b4 = 1;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(cs4.b, "TVTA-devicesScreen-deleteGroup-modal");
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new h31(b2);
                ux2Var.g0(objK);
            }
            fs4 fs4VarA2 = cp6.a(fs4VarA, false, (Function1) objK);
            if (z) {
                ux2Var.W(-1921404883);
                yy0VarO = au8.O(-981724975, new v4(function1, (byte) 13), ux2Var);
                ux2Var.p(false);
            } else {
                ux2Var.W(-1921096309);
                ux2Var.p(false);
                yy0VarO = null;
            }
            uf0.b(function1, au8.O(-630286541, new r9(b4, function0, z), ux2Var), fs4VarA2, yy0VarO, ka0.f, au8.O(1699686030, new bn1(b3, z), ux2Var), null, 0L, 0L, 0L, 0L, null, ux2Var, ((i3 >> 6) & 14) | 1769520, 0, 16272);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new cn1(z, (Object) function0, (Object) function1, i2, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(l33 l33Var, fs4 fs4Var, ux2 ux2Var, int i2) {
        byte b2;
        ux2 ux2Var2;
        boolean z;
        cs4 cs4Var;
        ux2 ux2Var3;
        ux2 ux2Var4;
        boolean z2;
        ux2 ux2Var5 = ux2Var;
        ux2Var5.Y(1420955201);
        int i3 = i2 | (ux2Var5.h(l33Var) ? 4 : 2);
        if (ux2Var5.N(i3 & 1, (i3 & 19) != 18)) {
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var5, 0);
            int iHashCode = Long.hashCode(ux2Var5.T);
            yj5 yj5VarL = ux2Var5.l();
            fs4 fs4VarS = uf0.s(ux2Var5, fs4Var);
            yz0.c.getClass();
            ux2Var5.a0();
            if (ux2Var5.S) {
                ux2Var5.k(LayoutNode.e0);
            } else {
                ux2Var5.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var5);
            o67.n(yj5VarL, d82.u, ux2Var5);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var5);
            o67.l(ux2Var5);
            o67.n(fs4VarS, d82.t, ux2Var5);
            cs4 cs4Var2 = cs4.b;
            if (l33Var == null) {
                ux2Var5.W(1132731258);
                ux2Var5.p(false);
                z2 = false;
                cs4Var = cs4Var2;
                ux2Var4 = ux2Var5;
            } else {
                ux2Var5.W(1132731259);
                if (l33Var.c) {
                    z = false;
                    cs4Var = cs4Var2;
                    ux2Var5.W(1142044095);
                    ux2Var5.p(false);
                    ux2Var3 = ux2Var5;
                } else {
                    ux2Var5.W(1141586225);
                    String strZ = m77.z(R.string.add_contact_managed_group_selected_disclaimer, ux2Var5);
                    h72 h72Var = un4.a;
                    z = false;
                    cs4Var = cs4Var2;
                    qs7.b(strZ, androidx.compose.ui.platform.a.a(ka0.F(cs4Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), "TVTA-devices-add-contact-bottom-sheet-managed-group-selected-disclaimer"), ((rn4) ux2Var5.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var5.j(h72Var)).b.k, ux2Var, 48, 0, 131064);
                    ux2 ux2Var6 = ux2Var;
                    ux2Var6.p(false);
                    ux2Var3 = ux2Var6;
                }
                ux2Var3.p(z);
                z2 = z;
                ux2Var4 = ux2Var3;
            }
            String strZ2 = m77.z(R.string.device_tab_add_contact_bottom_sheet_subtitle, ux2Var4);
            h72 h72Var2 = un4.a;
            ux2 ux2Var7 = ux2Var4;
            qs7.b(strZ2, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), "TVTA-devices-add-contact-bottom-sheet-subtitle"), ((rn4) ux2Var4.j(h72Var2)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var4.j(h72Var2)).b.k, ux2Var7, 48, 0, 131064);
            ux2 ux2Var8 = ux2Var7;
            ux2Var8.p(true);
            b2 = z2;
            ux2Var2 = ux2Var8;
        } else {
            b2 = 0;
            ux2Var5.Q();
            ux2Var2 = ux2Var5;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new c9(b2, i2, l33Var, fs4Var);
        }
    }

    public static final void h(fs4 fs4Var, jb4 jb4Var, ux2 ux2Var, int i2) {
        ux2 ux2Var2;
        ux2Var.Y(1185402039);
        int i3 = i2 | 3478;
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            ux2Var.S();
            if ((i2 & 1) == 0 || ux2Var.x()) {
                int i4 = kb4.a;
                jb4Var = kb4.a(rv0.g, ux2Var);
                fs4Var = cs4.b;
            } else {
                ux2Var.Q();
            }
            fs4 fs4Var2 = fs4Var;
            jb4 jb4Var2 = jb4Var;
            ux2Var.q();
            String str = (String) lv0.o0(ob7.a(m77.z(R.string.settings_biometric_authentication_disclaimer_subtitle, ux2Var)));
            if (str == null) {
                str = "";
            }
            Map mapSingletonMap = Collections.singletonMap(str, new k77("https://www.teamviewer.com/en/global/support/knowledge-base/teamviewer-classic/security/security-features/biometric-protection/"));
            mapSingletonMap.getClass();
            ux2Var2 = ux2Var;
            pb4.a(qf0.c, fs4Var2, au8.O(-441155432, new c9((Object) ob7.b(m77.z(R.string.settings_biometric_authentication_disclaimer_subtitle, ux2Var)), (Object) mapSingletonMap, (byte) 6), ux2Var), au8.O(1751358361, new g9((byte) 9), ux2Var), null, jb4Var2, ux2Var2, 27654, 420);
            fs4Var = fs4Var2;
            jb4Var = jb4Var2;
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new c9(fs4Var, jb4Var, i2);
        }
    }

    public static final void i(ea0 ea0Var, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i2) {
        ea0 ea0Var2;
        fs4 fs4Var2;
        int i3;
        int i4;
        cs4 cs4Var;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(6634300);
        int i5 = i2 | (ux2Var2.d(ea0Var.ordinal()) ? 4 : 2) | (ux2Var2.h(function0) ? 32 : 16) | 384;
        if (ux2Var2.N(i5 & 1, (i5 & 147) != 146)) {
            int iOrdinal = ea0Var.ordinal();
            if (iOrdinal == 0) {
                i3 = 74136070;
                i4 = R.string.device_tab_add_contact_bottom_sheet_title_first;
            } else {
                if (iOrdinal != 1) {
                    throw fx3.m(2080599600, ux2Var2, false);
                }
                i3 = 74274981;
                i4 = R.string.device_tab_add_contact_bottom_sheet_title_second;
            }
            String strM = to7.m(ux2Var2, i3, i4, ux2Var2, false);
            cs4 cs4Var2 = cs4.b;
            fs4 fs4VarD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var2, 1.0f), 56.0f);
            y50 y50Var = xz2.s;
            do4 do4VarC = ua0.c(y50Var, false);
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
            o67.n(do4VarC, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            ot7 ot7Var = ((rn4) ux2Var2.j(un4.a)).b.g;
            ya0 ya0Var = ya0.a;
            qs7.b(strM, androidx.compose.ui.platform.a.a(ya0Var.a(cs4Var2, y50Var), "TVTA-devices-add-contact-bottom-sheet-title"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ot7Var, ux2Var, 0, 0, 131068);
            ux2Var2 = ux2Var;
            ea0Var2 = ea0Var;
            if (ea0Var2 == ea0.n) {
                ux2Var2.W(-65172150);
                cs4Var = cs4Var2;
                xo1.k(function0, androidx.compose.ui.platform.a.a(ya0Var.a(cs4Var, xz2.r), "TVTA-devices-add-contact-bottom-sheet-back-button"), false, null, null, vn4.b, ux2Var2, ((i5 >> 3) & 14) | 1572864, 60);
                ux2Var2.p(false);
            } else {
                cs4Var = cs4Var2;
                ux2Var2.W(-64658976);
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ea0Var2 = ea0Var;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new f9((Object) ea0Var2, (Object) function0, (Object) fs4Var2, i2, (byte) 0);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9441. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void j(o.l33 r44, o.o9 r45, o.n9 r46, o.fs4 r47, o.ux2 r48, int r49) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.pm8.j(o.l33, o.o9, o.n9, o.fs4, o.ux2, int):void");
    }

    public static yc4 k(yc4 yc4Var, ps0 ps0Var, a86 a86Var, int i2) {
        if ((i2 & 2) != 0) {
            a86Var = null;
        }
        yc4Var.getClass();
        return new yc4((io3) yc4Var.m, a86Var != null ? new x24(yc4Var, ps0Var, a86Var, 0) : (f58) yc4Var.n, ds1.X(l54.n, new e3((byte) 3, yc4Var, ps0Var, false)));
    }

    public static final void l(ns4 ns4Var, LinkedHashSet linkedHashSet, zo4 zo4Var, boolean z) {
        for (fi1 fi1Var : qs1.N(zo4Var, no1.f1583o, 2)) {
            if (fi1Var instanceof ns4) {
                ns4 ns4VarD0 = (ns4) fi1Var;
                if (ns4VarD0.A()) {
                    sy4 name = ns4VarD0.getName();
                    name.getClass();
                    ys0 ys0VarG = zo4Var.g(name, t35.p);
                    ns4VarD0 = ys0VarG instanceof ns4 ? (ns4) ys0VarG : ys0VarG instanceof eq1 ? ((eq1) ys0VarG).D0() : null;
                }
                if (ns4VarD0 != null) {
                    int i2 = zo1.a;
                    Iterator it = ns4VarD0.q().b().iterator();
                    while (it.hasNext()) {
                        if (zo1.p((oz3) it.next(), ns4Var.a())) {
                            linkedHashSet.add(ns4VarD0);
                            break;
                        }
                    }
                    if (z) {
                        zo4 zo4VarR0 = ns4VarD0.r0();
                        zo4VarR0.getClass();
                        l(ns4Var, linkedHashSet, zo4VarR0, z);
                    }
                }
            }
        }
    }

    public static final fs4 m(fs4 fs4Var, zy6 zy6Var) {
        return fs4Var.f(new d88(zy6Var));
    }

    public static ko n(ko koVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) koVar.n.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((mo) koVar.f1284o).a;
        }
        return new ko(koVar.m, Float.valueOf(f2), new mo(f3), koVar.p, koVar.q, koVar.r);
    }

    public static final yc4 o(yc4 yc4Var, up upVar) {
        yc4Var.getClass();
        upVar.getClass();
        if (upVar.isEmpty()) {
            return yc4Var;
        }
        return new yc4((io3) yc4Var.m, (f58) yc4Var.n, ds1.X(l54.n, new e3((byte) 4, yc4Var, upVar, false)));
    }

    public static final h58 p(h58 h58Var, d58 d58Var) {
        if (d58Var == null || h58Var.a() == ub8.f2197o) {
            return h58Var;
        }
        if (d58Var.B() != h58Var.a()) {
            yl0 yl0Var = new yl0(h58Var);
            g48.n.getClass();
            return new w87(new vl0(h58Var, yl0Var, false, g48.f858o));
        }
        if (!h58Var.c()) {
            return new w87(h58Var.b());
        }
        pd4 pd4Var = xd4.e;
        pd4Var.getClass();
        return new w87(new o54(pd4Var, new a3(h58Var, (byte) 5)));
    }

    public static byte[] q(h02[] h02VarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (h02 h02Var : h02VarArr) {
            length += ((((h02Var.g * 2) + 7) & (-8)) / 8) + (h02Var.e * 2) + s(bArr, h02Var.a, h02Var.b).getBytes(StandardCharsets.UTF_8).length + 16 + h02Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, mo8.q)) {
            int length2 = h02VarArr.length;
            while (i2 < length2) {
                h02 h02Var2 = h02VarArr[i2];
                O(byteArrayOutputStream, h02Var2, s(bArr, h02Var2.a, h02Var2.b));
                N(byteArrayOutputStream, h02Var2);
                i2++;
            }
        } else {
            for (h02 h02Var3 : h02VarArr) {
                O(byteArrayOutputStream, h02Var3, s(bArr, h02Var3.a, h02Var3.b));
            }
            int length3 = h02VarArr.length;
            while (i2 < length3) {
                N(byteArrayOutputStream, h02VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX WARN: Code duplicated, block: B:202:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x02c4 A[LOOP:1: B:67:0x028d->B:80:0x02c4, LOOP_END] */
    public static final nm8 r(Context context, d11 d11Var) {
        we6 we6Var;
        String name;
        vy1 vy1VarE;
        f35 f35Var;
        boolean zContainsKey;
        int i2;
        int i3;
        context.getClass();
        Executor executor = (Executor) d11Var.f578o;
        yc4 yc4Var = new yc4();
        yc4Var.p = new Handler(Looper.getMainLooper());
        yc4Var.q = new eh6(yc4Var, (byte) 1);
        iq6 iq6Var = new iq6(executor);
        yc4Var.m = iq6Var;
        fe1 fe1VarW = et1.w(iq6Var);
        yc4Var.n = fe1VarW;
        et1.w(new iq6(executor));
        yc4Var.f2598o = hm3.c(fe1VarW);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        iq6 iq6Var2 = (iq6) yc4Var.m;
        iq6Var2.getClass();
        Object obj = d11Var.p;
        if (context.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
            we6Var = new we6(applicationContext, null);
            we6Var.i = true;
        } else {
            if (ub7.b0("androidx.work.workdb")) {
                hk0.g("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                return null;
            }
            we6 we6Var2 = new we6(applicationContext, "androidx.work.workdb");
            we6Var2.h = new ar(applicationContext, (byte) 29);
            we6Var = we6Var2;
        }
        we6Var.f = iq6Var2;
        bt0 bt0Var = new bt0();
        ArrayList arrayList = we6Var.d;
        arrayList.add(bt0Var);
        we6Var.a(fr4.h);
        we6Var.a(new lb6(applicationContext, 2, 3));
        we6Var.a(fr4.i);
        we6Var.a(fr4.j);
        we6Var.a(new lb6(applicationContext, 5, 6));
        we6Var.a(fr4.k);
        we6Var.a(fr4.l);
        we6Var.a(fr4.m);
        we6Var.a(new lb6(applicationContext));
        we6Var.a(new lb6(applicationContext, 10, 11));
        we6Var.a(fr4.d);
        we6Var.a(fr4.e);
        we6Var.a(fr4.f);
        we6Var.a(fr4.g);
        we6Var.a(new lb6(applicationContext, 21, 22));
        we6Var.n = false;
        we6Var.f2405o = true;
        we6Var.p = true;
        Executor executor2 = we6Var.f;
        if (executor2 == null && we6Var.g == null) {
            xv xvVar = yv.d;
            we6Var.g = xvVar;
            we6Var.f = xvVar;
        } else if (executor2 != null && we6Var.g == null) {
            we6Var.g = executor2;
        } else if (executor2 == null) {
            we6Var.f = we6Var.g;
        }
        LinkedHashSet linkedHashSet = we6Var.l;
        boolean zIsEmpty = linkedHashSet.isEmpty();
        LinkedHashSet linkedHashSet2 = we6Var.k;
        if (!zIsEmpty) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    gk0.h(fx3.e(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        cf7 irVar = we6Var.h;
        if (irVar == null) {
            irVar = new ir((byte) 19);
        }
        cf7 cf7Var = irVar;
        boolean z = we6Var.i;
        Context context2 = we6Var.b;
        Object systemService = context2.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        ye6 ye6Var = (activityManager == null || activityManager.isLowRamDevice()) ? ye6.m : ye6.n;
        Executor executor3 = we6Var.f;
        if (executor3 == null) {
            hk0.g("Required value was null.");
            return null;
        }
        Executor executor4 = we6Var.g;
        if (executor4 == null) {
            hk0.g("Required value was null.");
            return null;
        }
        zh1 zh1Var = new zh1(context2, we6Var.c, cf7Var, we6Var.j, arrayList, z, ye6Var, executor3, executor4, null, we6Var.n, we6Var.f2405o, linkedHashSet2, null, null, null, we6Var.e, we6Var.m, we6Var.p, null, null);
        Class clsZ = et1.z(we6Var.a);
        Package r6 = clsZ.getPackage();
        if (r6 == null || (name = r6.getName()) == null) {
            name = "";
        }
        String canonicalName = clsZ.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsZ.getClassLoader());
            cls.getClass();
            ze6 ze6Var = (ze6) cls.getDeclaredConstructor(null).newInstance(null);
            ze6Var.getClass();
            ze6Var.j = true;
            try {
                vy1VarE = ze6Var.e();
                vy1VarE.getClass();
            } catch (e55 unused) {
                vy1VarE = null;
            }
            if (vy1VarE == null) {
                new ve6(zh1Var, new le5(ze6Var));
                throw null;
            }
            ze6Var.d = new ve6(zh1Var, vy1VarE);
            ze6Var.e = ze6Var.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setH = ze6Var.h();
            int size = setH.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setH.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                int i4 = -1;
                List list = zh1Var.n;
                if (zHasNext) {
                    wt3 wt3Var = (wt3) it2.next();
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i5 = size2 - 1;
                            i2 = i4;
                            if (wt3Var.o(list.get(size2))) {
                                zArr[size2] = true;
                                i3 = size2;
                                break;
                            }
                            if (i5 >= 0) {
                                size2 = i5;
                                i4 = i2;
                            }
                        }
                        if (i3 >= 0) {
                            an4.q(wt3Var.c(), ") is missing in the database configuration.", "A required auto migration spec (");
                            return null;
                        }
                        linkedHashMap.put(wt3Var, list.get(i3));
                    } else {
                        i2 = -1;
                    }
                    i3 = i2;
                    if (i3 >= 0) {
                        an4.q(wt3Var.c(), ") is missing in the database configuration.", "A required auto migration spec (");
                        return null;
                    }
                    linkedHashMap.put(wt3Var, list.get(i3));
                } else {
                    int size3 = list.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i6 = size3 - 1;
                            if (size3 >= size || !zArr[size3]) {
                                hk0.g("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                return null;
                            }
                            if (i6 < 0) {
                                break;
                            }
                            size3 = i6;
                        }
                    }
                    for (er4 er4Var : ze6Var.c(linkedHashMap)) {
                        byte b2 = er4Var.a;
                        byte b3 = er4Var.b;
                        og1 og1Var = zh1Var.d;
                        LinkedHashMap linkedHashMap2 = og1Var.a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(b2))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(b2));
                            if (map == null) {
                                map = fa2.m;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(b3));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            og1Var.b(er4Var);
                        }
                    }
                    LinkedHashMap linkedHashMapI = ze6Var.i();
                    boolean[] zArr2 = new boolean[linkedHashMapI.size()];
                    Iterator it3 = linkedHashMapI.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        List list2 = zh1Var.m;
                        if (!zHasNext2) {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i7 = size4 - 1;
                                    if (!zArr2[size4]) {
                                        io.sentry.h2.g(list2.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", "Unexpected type converter ");
                                        return null;
                                    }
                                    if (i7 < 0) {
                                        break;
                                    }
                                    size4 = i7;
                                }
                            }
                            ze6Var.b = zh1Var.h;
                            ze6Var.c = new gs(zh1Var.i);
                            Executor executor5 = ze6Var.b;
                            if (executor5 == null) {
                                im3.e0("internalQueryExecutor");
                                throw null;
                            }
                            fc1 fc1VarC = hm3.c(xk0.G(et1.w(executor5), g57.a()));
                            ze6Var.a = fc1VarC;
                            de1 de1Var = fc1VarC.m;
                            gs gsVar = ze6Var.c;
                            if (gsVar == null) {
                                im3.e0("internalTransactionExecutor");
                                throw null;
                            }
                            de1Var.H0(et1.w(gsVar));
                            ze6Var.g = zh1Var.f;
                            ve6 ve6Var = ze6Var.d;
                            if (ve6Var == null) {
                                im3.e0("connectionManager");
                                throw null;
                            }
                            df7 df7VarC = ve6Var.c();
                            if (df7VarC == null) {
                                df7VarC = null;
                                break;
                            }
                            while (!(df7VarC instanceof op5)) {
                                if (!(df7VarC instanceof wm1)) {
                                    df7VarC = null;
                                    break;
                                }
                                df7VarC = ((wm1) df7VarC).e();
                            }
                            ve6 ve6Var2 = ze6Var.d;
                            if (ve6Var2 == null) {
                                im3.e0("connectionManager");
                                throw null;
                            }
                            df7 df7VarC2 = ve6Var2.c();
                            if (df7VarC2 == null) {
                                df7VarC2 = null;
                                break;
                            }
                            while (!(df7VarC2 instanceof pz)) {
                                if (!(df7VarC2 instanceof wm1)) {
                                    df7VarC2 = null;
                                    break;
                                }
                                df7VarC2 = ((wm1) df7VarC2).e();
                            }
                            WorkDatabase workDatabase = (WorkDatabase) ze6Var;
                            Context applicationContext2 = context.getApplicationContext();
                            applicationContext2.getClass();
                            Context applicationContext3 = applicationContext2.getApplicationContext();
                            applicationContext3.getClass();
                            l50 l50Var = new l50(applicationContext3, yc4Var, (byte) 0);
                            Context applicationContext4 = applicationContext2.getApplicationContext();
                            applicationContext4.getClass();
                            l50 l50Var2 = new l50(applicationContext4, yc4Var, (byte) 1);
                            if (Build.VERSION.SDK_INT < 28) {
                                Context applicationContext5 = applicationContext2.getApplicationContext();
                                applicationContext5.getClass();
                                String str = e35.a;
                                f35Var = new f35(applicationContext5, yc4Var);
                            } else {
                                f35Var = null;
                            }
                            Context applicationContext6 = applicationContext2.getApplicationContext();
                            applicationContext6.getClass();
                            l50 l50Var3 = new l50(applicationContext6, yc4Var, (byte) 2);
                            yc4 yc4Var2 = new yc4();
                            yc4Var2.m = applicationContext2;
                            yc4Var2.n = l50Var;
                            yc4Var2.f2598o = l50Var2;
                            yc4Var2.p = f35Var;
                            yc4Var2.q = l50Var3;
                            dt5 dt5Var = new dt5(context.getApplicationContext(), d11Var, yc4Var, workDatabase);
                            int i8 = om8.n;
                            sa4 sa4VarT = qf0.t();
                            String str2 = aj6.a;
                            xh7 xh7Var = new xh7(context, workDatabase, d11Var);
                            String str3 = gd5.a;
                            PackageManager packageManager = context.getPackageManager();
                            packageManager.getClass();
                            gd5.a(packageManager, new ComponentName(context, (Class<?>) SystemJobService.class), true, fd5.n);
                            we4.f().c(aj6.a, "Created SystemJobScheduler and enabled SystemJobService");
                            sa4VarT.add(xh7Var);
                            sa4VarT.add(new x03(context, d11Var, yc4Var2, dt5Var, new lh7(dt5Var, yc4Var), yc4Var));
                            return new nm8(context.getApplicationContext(), d11Var, yc4Var, workDatabase, qf0.r(sa4VarT), dt5Var, yc4Var2);
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        wt3 wt3Var2 = (wt3) entry.getKey();
                        for (wt3 wt3Var3 : (List) entry.getValue()) {
                            int size5 = list2.size() - 1;
                            if (size5 < 0) {
                                size5 = -1;
                                break;
                            }
                            while (true) {
                                int i9 = size5 - 1;
                                if (wt3Var3.o(list2.get(size5))) {
                                    zArr2[size5] = true;
                                    break;
                                }
                                if (i9 < 0) {
                                    size5 = -1;
                                    break;
                                }
                                size5 = i9;
                            }
                            if (size5 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + wt3Var3.c() + ") for " + wt3Var2.c() + " is missing in the database configuration.").toString());
                            }
                            Object obj2 = list2.get(size5);
                            wt3Var3.getClass();
                            obj2.getClass();
                            ze6Var.i.put(wt3Var3, obj2);
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("Cannot find implementation for " + clsZ.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot access the constructor " + clsZ.getCanonicalName(), e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Failed to create an instance of " + clsZ.getCanonicalName(), e4);
        }
    }

    public static String s(byte[] bArr, String str, String str2) {
        byte[] bArr2 = mo8.r;
        byte[] bArr3 = mo8.s;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return e41.l(new StringBuilder(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static final int t(ms2 ms2Var, int i2) {
        boolean z = im3.t(ms2Var.m, ms2.n.m) >= 0;
        boolean z2 = i2 == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static Object u(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c4.c(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static ArrayList v(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? c4.d(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    public static Serializable w(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c4.f(bundle, str, cls);
        }
        Serializable serializable = bundle.getSerializable(str);
        if (cls.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }

    public static void x(Properties properties, File file) {
        if (file.exists() && file.isFile() && file.canRead()) {
            try {
                properties.load(new BufferedInputStream(io.sentry.config.a.c(file, new FileInputStream(file))));
            } catch (FileNotFoundException unused) {
                ye4.a("ServiceManager", "created");
            } catch (IOException unused2) {
                ye4.a("ServiceManager", "started");
            }
        }
    }

    public static final int y(String str) {
        Object next;
        if (str == null) {
            str = "600000";
        }
        ie4.f1053o.getClass();
        Iterator it = ie4.r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ie4) next).m.equals(str));
        ie4 ie4Var = (ie4) next;
        if (ie4Var == null) {
            ie4Var = ie4.DEFAULT;
        }
        return ie4Var.n;
    }

    public static final int z(p44 p44Var) {
        return p44Var.f1705o + p44Var.p;
    }
}
