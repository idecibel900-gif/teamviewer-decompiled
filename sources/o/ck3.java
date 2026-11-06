package o;

import android.content.Context;
import android.graphics.Shader;
import android.os.Build;
import android.view.KeyEvent;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.DyngateViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.DyngateViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDeviceViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import com.teamviewer.swigcallbacklib.VoidResultCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ck3 {
    public static final ir A;
    public static final r22 B;
    public static final char[] C;
    public static final hr2 D;
    public static final rs4 E;
    public static rs4 F;
    public static final StackTraceElement[] G;
    public static final a65 H;
    public static final a65 I;
    public static final a65 J;
    public static final a65 K;
    public static final a65 L;
    public static final Object M;
    public static final yr7 N;
    public static Context a;
    public static Boolean b;
    public static final hr2 k;
    public static final yy0 m;
    public static final yy0 r;
    public static final yy0 s;
    public static final yy0 t;
    public static final yy0 u;
    public static final yy0 v;
    public static final yy0 w;
    public static final yy0 x;
    public static final yy0 y;
    public static final yy0 z;
    public static final mo c = new mo(Float.POSITIVE_INFINITY);
    public static final no d = new no(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final oo e = new oo(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final po f = new po(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final mo g = new mo(Float.NEGATIVE_INFINITY);
    public static final no h = new no(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final oo i = new oo(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final po j = new po(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final yy0 l = new yy0(-1412250206, false, new zy0(18));
    public static final yy0 n = new yy0(-1817044928, false, new p20(28));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yy0 f535o = new yy0(-257122548, false, new p20(29));
    public static final yy0 p = new yy0(-1234449796, false, new zy0(19));
    public static final yy0 q = new yy0(-1953428453, false, new az0(0));

    /* JADX WARN: Multi-variable type inference failed */
    static {
        byte b2 = 14;
        k = new hr2("RESUME_TOKEN", b2);
        byte b3 = 27;
        m = new yy0(920735249, false, new p20(b3));
        byte b4 = 13;
        r = new yy0(-1836538775, false, new az0(b4));
        s = new yy0(-1816997653, false, new az0(b2));
        byte b5 = 22;
        t = new yy0(1134677168, false, new bz0(b5));
        byte b6 = 23;
        u = new yy0(1144447729, false, new bz0(b6));
        byte b7 = 1;
        v = new yy0(701259623, false, new gz0(b7));
        byte b8 = 25;
        new yy0(712192758, false, new fz0(b8));
        w = new yy0(2083506904, false, new iz0(b7));
        x = new yy0(1555297118, false, new iz0((byte) 2));
        y = new yy0(-1712207856, false, new iz0((byte) 3));
        z = new yy0(2073863211, false, new iz0((byte) 4));
        A = new ir((byte) 10);
        B = new r22();
        C = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        D = new hr2("KotlinTypeRefiner", (byte) 11);
        E = new rs4(null, null, null);
        G = new StackTraceElement[0];
        byte b9 = 20;
        H = new a65(b9, (Object) new fi6((byte) 21), (Object) new ei6(b6), (boolean) (0 == true ? 1 : 0));
        byte b10 = 24;
        I = new a65(b9, (Object) new fi6(b5), (Object) new ei6(b10), (boolean) (0 == true ? 1 : 0));
        J = new a65(b9, (Object) new fi6(b6), (Object) new ei6(b8), (boolean) (0 == true ? 1 : 0));
        K = new a65(b9, (Object) new fi6(b10), (Object) new ei6((byte) 26), (boolean) (0 == true ? 1 : 0));
        L = new a65(b9, (Object) new fi6(b8), (Object) new ei6(b3), (boolean) (0 == true ? 1 : 0));
        M = new Object();
        N = new yr7(b4);
    }

    public static int A(byte[] bArr, int i2, jw jwVar) throws qm3 {
        int iK = K(bArr, i2, jwVar);
        int i3 = jwVar.a;
        if (i3 < 0) {
            throw qm3.c();
        }
        if (i3 > bArr.length - iK) {
            throw qm3.e();
        }
        if (i3 == 0) {
            jwVar.c = yh0.n;
            return iK;
        }
        jwVar.c = yh0.c(bArr, iK, i3);
        return iK + i3;
    }

    public static int B(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static long C(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public static int D(bj6 bj6Var, byte[] bArr, int i2, int i3, int i4, jw jwVar) {
        uq4 uq4Var = (uq4) bj6Var;
        Object objC = uq4Var.c();
        int iA = uq4Var.A(objC, bArr, i2, i3, i4, jwVar);
        uq4Var.a(objC);
        jwVar.c = objC;
        return iA;
    }

    public static int E(bj6 bj6Var, byte[] bArr, int i2, int i3, jw jwVar) throws qm3 {
        int iJ = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iJ = J(i4, bArr, iJ, jwVar);
            i4 = jwVar.a;
        }
        int i5 = iJ;
        if (i4 < 0 || i4 > i3 - i5) {
            throw qm3.e();
        }
        Object objC = bj6Var.c();
        int i6 = i5 + i4;
        bj6Var.d(objC, bArr, i5, i6, jwVar);
        bj6Var.a(objC);
        jwVar.c = objC;
        return i6;
    }

    public static int F(bj6 bj6Var, int i2, byte[] bArr, int i3, int i4, ql3 ql3Var, jw jwVar) throws qm3 {
        int iE = E(bj6Var, bArr, i3, i4, jwVar);
        ql3Var.add(jwVar.c);
        while (iE < i4) {
            int iK = K(bArr, iE, jwVar);
            if (i2 != jwVar.a) {
                break;
            }
            iE = E(bj6Var, bArr, iK, i4, jwVar);
            ql3Var.add(jwVar.c);
        }
        return iE;
    }

    public static int G(byte[] bArr, int i2, jw jwVar) throws qm3 {
        int iK = K(bArr, i2, jwVar);
        int i3 = jwVar.a;
        if (i3 < 0) {
            throw qm3.c();
        }
        if (i3 == 0) {
            jwVar.c = "";
            return iK;
        }
        jwVar.c = new String(bArr, iK, i3, sl3.a);
        return iK + i3;
    }

    public static int H(byte[] bArr, int i2, jw jwVar) throws qm3 {
        int iK = K(bArr, i2, jwVar);
        int i3 = jwVar.a;
        if (i3 < 0) {
            throw qm3.c();
        }
        if (i3 == 0) {
            jwVar.c = "";
            return iK;
        }
        jwVar.c = ha8.a.j(bArr, iK, i3);
        return iK + i3;
    }

    public static int I(int i2, byte[] bArr, int i3, int i4, k88 k88Var, jw jwVar) throws qm3 {
        if ((i2 >>> 3) == 0) {
            throw new qm3("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iM = M(bArr, i3, jwVar);
            k88Var.c(i2, Long.valueOf(jwVar.b));
            return iM;
        }
        if (i5 == 1) {
            k88Var.c(i2, Long.valueOf(C(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iK = K(bArr, i3, jwVar);
            int i6 = jwVar.a;
            if (i6 < 0) {
                throw qm3.c();
            }
            if (i6 > bArr.length - iK) {
                throw qm3.e();
            }
            if (i6 == 0) {
                k88Var.c(i2, yh0.n);
            } else {
                k88Var.c(i2, yh0.c(bArr, iK, i6));
            }
            return iK + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new qm3("Protocol message contained an invalid tag (zero).");
            }
            k88Var.c(i2, Integer.valueOf(B(bArr, i3)));
            return i3 + 4;
        }
        k88 k88VarB = k88.b();
        int i7 = (i2 & (-8)) | 4;
        int i8 = 0;
        while (i3 < i4) {
            int iK2 = K(bArr, i3, jwVar);
            int i9 = jwVar.a;
            if (i9 == i7) {
                i8 = i9;
                i3 = iK2;
                break;
            }
            i3 = I(i9, bArr, iK2, i4, k88VarB, jwVar);
            i8 = i9;
        }
        if (i3 > i4 || i8 != i7) {
            throw qm3.d();
        }
        k88Var.c(i2, k88VarB);
        return i3;
    }

    public static int J(int i2, byte[] bArr, int i3, jw jwVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            jwVar.a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & 127) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            jwVar.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & 127) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            jwVar.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & 127) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            jwVar.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & 127) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                jwVar.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int K(byte[] bArr, int i2, jw jwVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return J(b2, bArr, i3, jwVar);
        }
        jwVar.a = b2;
        return i3;
    }

    public static int L(int i2, byte[] bArr, int i3, int i4, ql3 ql3Var, jw jwVar) {
        nk3 nk3Var = (nk3) ql3Var;
        int iK = K(bArr, i3, jwVar);
        nk3Var.b(jwVar.a);
        while (iK < i4) {
            int iK2 = K(bArr, iK, jwVar);
            if (i2 != jwVar.a) {
                break;
            }
            iK = K(bArr, iK2, jwVar);
            nk3Var.b(jwVar.a);
        }
        return iK;
    }

    public static int M(byte[] bArr, int i2, jw jwVar) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            jwVar.b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & 127)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b3 & 127)) << i5;
            b2 = b3;
            i4 = i6;
        }
        jwVar.b = j3;
        return i4;
    }

    public static boolean N(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = N(file2) && z2;
        }
        return z2;
    }

    public static void P(mb5 mb5Var) {
        if (mb5Var == null) {
            ye4.c("ComputerConnector", "creating session failed");
            return;
        }
        if (!mb5Var.c()) {
            ye4.c("Connector", "Invalid login data!");
            return;
        }
        bu7.MAIN.a(new jq(R.string.tv_connectingPleaseWait, new Object[0]));
        au6 au6Var = bt1.b;
        if (au6Var != null) {
            au6Var.h(mb5Var);
        } else {
            im3.e0("instance");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    public static void Q(String str, String str2) {
        DyngateViewModel dyngateViewModelJ;
        rt6 rt6VarA;
        ManagedDeviceViewModel managedDeviceViewModel;
        DyngateViewModel dyngateViewModelJ2;
        DyngateID dyngateIDZ = ep1.z(str);
        String str3 = "";
        rt6 rt6Var = null;
        rt6Var = null;
        rt6Var = null;
        rt6Var = null;
        if (ep1.v(str)) {
            int i2 = rt6.g;
            String strA = ep1.A(str);
            if (strA == null) {
                ye4.c("SessionLoginDataFiletransfer", "exception caught on creation: invalid ID - ".concat(str));
                Context context = d82.M;
                if (context != null) {
                    String string = context.getString(R.string.tv_IDS_STATUS_MSG_NOROUTE_IdNotFound);
                    string.getClass();
                    fx3.r(string, 1, context, bu7.MAIN);
                } else {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                }
            } else {
                if (str2 == null) {
                    str2 = "";
                }
                rt6Var = new rt6(strA, str2);
                rt6Var.f = "";
                rt6Var.d = true;
            }
        } else if (dyngateIDZ.IsValid()) {
            PListDyngateID pListDyngateID = new PListDyngateID(dyngateIDZ);
            if (str2 != null) {
                if (str2.length() == 0) {
                    str2 = (BackendContainerAndroid.GetInstance().GetAccount().IsLoggedIn() && (dyngateViewModelJ2 = ds1.j(pListDyngateID)) != null) ? DyngateViewModelSWIGJNI.DyngateViewModel_GetPassword(dyngateViewModelJ2.a, dyngateViewModelJ2) : null;
                    if (str2 == null) {
                    }
                }
                int i3 = rt6.g;
                rt6VarA = qt6.a(str, str2);
                if (rt6VarA != null) {
                    long jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_2 = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_2(pListDyngateID.a, pListDyngateID);
                    managedDeviceViewModel = jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_2 != 0 ? new ManagedDeviceViewModel(jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_2) : null;
                    if (managedDeviceViewModel != null) {
                        xs1.b0(managedDeviceViewModel, rt6VarA);
                    } else {
                        ye4.a.b("EasyAccessHelper", "Computer is not a managed device");
                    }
                    rt6Var = rt6VarA;
                }
            } else {
                String strDyngateViewModel_GetPassword = (BackendContainerAndroid.GetInstance().GetAccount().IsLoggedIn() && (dyngateViewModelJ = ds1.j(pListDyngateID)) != null) ? DyngateViewModelSWIGJNI.DyngateViewModel_GetPassword(dyngateViewModelJ.a, dyngateViewModelJ) : null;
                if (strDyngateViewModel_GetPassword != null) {
                    str3 = strDyngateViewModel_GetPassword;
                }
            }
            str2 = str3;
            int i4 = rt6.g;
            rt6VarA = qt6.a(str, str2);
            if (rt6VarA != null) {
                long jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_3 = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_2(pListDyngateID.a, pListDyngateID);
                if (jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_3 != 0) {
                }
                if (managedDeviceViewModel != null) {
                    xs1.b0(managedDeviceViewModel, rt6VarA);
                } else {
                    ye4.a.b("EasyAccessHelper", "Computer is not a managed device");
                }
                rt6Var = rt6VarA;
            }
        }
        if (rt6Var == null) {
            ye4.c("ComputerConnector", "creating session failed");
        } else {
            P(rt6Var);
        }
    }

    public static final void T(Throwable th, de1 de1Var) {
        if (th instanceof z12) {
            th = ((z12) th).m;
        }
        try {
            ge1 ge1Var = (ge1) de1Var.l0(z06.r);
            if (ge1Var != null) {
                ge1Var.q(th, de1Var);
            } else {
                di1.v(th, de1Var);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                ct1.q(runtimeException, th);
                th = runtimeException;
            }
            di1.v(th, de1Var);
        }
    }

    public static final float[] V(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final ArrayList W(List list, List list2, float f2) {
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i2 = 0; i2 < iMax; i2++) {
            arrayList.add(new rv0(j51.K(((rv0) list.get(Math.min(i2, list.size() - 1))).a, ((rv0) list2.get(Math.min(i2, list2.size() - 1))).a, f2)));
        }
        return arrayList;
    }

    public static final ArrayList X(List list, List list2, float f2) {
        if (list2 == null || list == null) {
            return null;
        }
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i2 = 0; i2 < iMax; i2++) {
            arrayList.add(Float.valueOf(vs1.G(((Number) list.get(Math.min(i2, list.size() - 1))).floatValue(), ((Number) list2.get(Math.min(i2, list2.size() - 1))).floatValue(), f2)));
        }
        return arrayList;
    }

    public static final long Y(long j2, long j3, float f2) {
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 && (((9187343241974906880L ^ (j3 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            return ct1.N(j2, j3, f2);
        }
        return f2 < 0.5f ? j2 : j3;
    }

    public static final float[] Z(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static km a(float f2) {
        return new km(Float.valueOf(f2), vn4.j0, Float.valueOf(0.01f), 8);
    }

    public static final float[] a0(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static final void b(int i2, Function0 function0, Function0 function1, ux2 ux2Var, fs4 fs4Var) {
        int i3;
        fs4 fs4Var2;
        function0.getClass();
        function1.getClass();
        ux2Var.Y(162563378);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = i2 | (ux2Var.h(function0) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.h(function1) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (ux2Var.N(i4 & 1, (i4 & 147) != 146)) {
            a12 a12Var = new a12(4);
            cs4 cs4Var = cs4.b;
            uf0.b(function0, au8.O(224561130, new v4(function1, b2), ux2Var), cs4Var, au8.O(-1278537176, new v4(function0, (byte) 3), ux2Var), j51.f, j51.g, null, 0L, 0L, 0L, 0L, a12Var, ux2Var, (i4 & 14) | 1772976, 3072, 8080);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new qk0(function0, function1, fs4Var2, i2, (byte) 0);
        }
    }

    public static final void c(ArrayList arrayList, Function0 function0, Function1 function1, fs4 fs4Var, xy6 xy6Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        xy6 xy6Var2;
        xy6 xy6VarR;
        int i3;
        fs4 fs4Var3;
        function0.getClass();
        function1.getClass();
        ux2Var.Y(1523938915);
        int i4 = i2 | (ux2Var.f(arrayList) ? 4 : 2) | (ux2Var.h(function0) ? 32 : 16) | (ux2Var.h(function1) ? 256 : 128) | 11264;
        byte b2 = 0;
        if (ux2Var.N(i4 & 1, (i4 & 9363) != 9362)) {
            ux2Var.S();
            if ((i2 & 1) == 0 || ux2Var.x()) {
                xy6VarR = yo1.R(null, ux2Var, 6, 2);
                i3 = i4 & (-57345);
                fs4Var3 = cs4.b;
            } else {
                ux2Var.Q();
                xy6VarR = xy6Var;
                i3 = i4 & (-57345);
                fs4Var3 = fs4Var;
            }
            ux2Var.q();
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new h31((byte) 5);
                ux2Var.g0(objK);
            }
            int i5 = (i3 >> 3) & 14;
            fs4 fs4Var4 = fs4Var3;
            xy6 xy6Var3 = xy6VarR;
            yo1.k(function0, cp6.a(fs4Var3, false, (Function1) objK), xy6Var3, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-630578111, new c91(arrayList, function0, function1, b2), ux2Var), ux2Var, i5, 3072, 8184);
            xy6Var2 = xy6Var3;
            fs4Var2 = fs4Var4;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6Var2 = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new o31((Serializable) arrayList, (Object) function0, (pw2) function1, fs4Var2, xy6Var2, i2, (byte) 1);
        }
    }

    public static final void d(Object obj, Object obj2, Function1 function1, ux2 ux2Var) {
        boolean zF = ux2Var.f(obj) | ux2Var.f(obj2);
        Object objK = ux2Var.K();
        if (zF || objK == e01.a) {
            objK = new p22(function1);
            ux2Var.g0(objK);
        }
    }

    public static final void e(Object obj, Function1 function1, ux2 ux2Var) {
        boolean zF = ux2Var.f(obj);
        Object objK = ux2Var.K();
        if (zF || objK == e01.a) {
            objK = new p22(function1);
            ux2Var.g0(objK);
        }
    }

    public static final void f(Object[] objArr, Function1 function1, ux2 ux2Var) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zD = ux2Var.d(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zD |= ux2Var.f(obj);
        }
        Object objK = ux2Var.K();
        if (zD || objK == e01.a) {
            ux2Var.g0(new p22(function1));
        }
    }

    public static final void g(Object obj, Object obj2, Object obj3, hw2 hw2Var, ux2 ux2Var) {
        de1 de1Var = ux2Var.R;
        boolean zF = ux2Var.f(obj) | ux2Var.f(obj2) | ux2Var.f(obj3);
        Object objK = ux2Var.K();
        if (zF || objK == e01.a) {
            objK = new b04(de1Var, hw2Var);
            ux2Var.g0(objK);
        }
    }

    public static final u18 g0(g2 g2Var, String str, ux2 ux2Var, int i2) {
        int i3 = (i2 & 14) ^ 6;
        boolean z2 = true;
        byte b2 = 0;
        boolean z3 = (i3 > 4 && ux2Var.f(g2Var)) || (i2 & 6) == 4;
        Object objK = ux2Var.K();
        Object obj = e01.a;
        hc1 hc1Var = null;
        if (z3 || objK == obj) {
            n47 n47VarC = el5.c();
            Function1 function1E = n47VarC != null ? n47VarC.e() : null;
            n47 n47VarF = el5.f(n47VarC);
            try {
                Object u18Var = new u18(g2Var, null, str);
                el5.h(n47VarC, n47VarF, function1E);
                ux2Var.g0(u18Var);
                objK = u18Var;
            } catch (Throwable th) {
                el5.h(n47VarC, n47VarF, function1E);
                throw th;
            }
        }
        u18 u18Var2 = (u18) objK;
        if (g2Var instanceof rn6) {
            ux2Var.W(-1357398105);
            Object objK2 = ux2Var.K();
            if (objK2 == obj) {
                objK2 = w(ux2Var);
                ux2Var.g0(objK2);
            }
            Object obj2 = (me1) objK2;
            boolean zH = ux2Var.h(obj2) | ((i3 > 4 && ux2Var.f(g2Var)) || (i2 & 6) == 4);
            Object objK3 = ux2Var.K();
            if (zH || objK3 == obj) {
                objK3 = new py5((Object) g2Var, obj2, (byte) 26);
                ux2Var.g0(objK3);
            }
            e(obj2, (Function1) objK3, ux2Var);
            rn6 rn6Var = (rn6) g2Var;
            Object value = rn6Var.f1933o.getValue();
            Object value2 = rn6Var.n.getValue();
            if ((i3 <= 4 || !ux2Var.f(g2Var)) && (i2 & 6) != 4) {
                z2 = false;
            }
            Object objK4 = ux2Var.K();
            if (z2 || objK4 == obj) {
                objK4 = new ko2(g2Var, hc1Var, (byte) 29);
                ux2Var.g0(objK4);
            }
            h(value, value2, (hw2) objK4, ux2Var);
            ux2Var.p(false);
        } else {
            ux2Var.W(-1356407283);
            u18Var2.a(g2Var.r0(), ux2Var, 0);
            ux2Var.p(false);
        }
        boolean zF = ux2Var.f(u18Var2);
        Object objK5 = ux2Var.K();
        if (zF || objK5 == obj) {
            objK5 = new v18(u18Var2, b2);
            ux2Var.g0(objK5);
        }
        e(u18Var2, (Function1) objK5, ux2Var);
        return u18Var2;
    }

    public static final void h(Object obj, Object obj2, hw2 hw2Var, ux2 ux2Var) {
        de1 de1Var = ux2Var.R;
        boolean zF = ux2Var.f(obj) | ux2Var.f(obj2);
        Object objK = ux2Var.K();
        if (zF || objK == e01.a) {
            objK = new b04(de1Var, hw2Var);
            ux2Var.g0(objK);
        }
    }

    public static void h0(String str, String str2) {
        DyngateViewModel dyngateViewModelJ;
        wt6 wt6VarA;
        DyngateViewModel dyngateViewModelJ2;
        DyngateID dyngateIDZ = ep1.z(str);
        if (!dyngateIDZ.IsValid()) {
            ye4.c("ComputerConnector", "creating session failed");
            return;
        }
        PListDyngateID pListDyngateID = new PListDyngateID(dyngateIDZ);
        String str3 = "";
        if (ep1.v(str)) {
            int i2 = wt6.k;
            String strA = ep1.A(str);
            if (strA == null) {
                ye4.c("SessionLoginDataRemoteControl", "exception caught on creation: invalid ID - ".concat(str));
                Context context = d82.M;
                if (context != null) {
                    String string = context.getString(R.string.tv_IDS_STATUS_MSG_NOROUTE_IdNotFound);
                    string.getClass();
                    fx3.r(string, 1, context, bu7.MAIN);
                } else {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                }
                wt6VarA = null;
            } else {
                wt6VarA = new wt6(strA, str2 == null ? "" : str2, false, false, false, null, null);
                wt6VarA.d = true;
            }
        } else {
            if (str2 != null) {
                if (str2.length() == 0) {
                    str2 = (BackendContainerAndroid.GetInstance().GetAccount().IsLoggedIn() && (dyngateViewModelJ2 = ds1.j(pListDyngateID)) != null) ? DyngateViewModelSWIGJNI.DyngateViewModel_GetPassword(dyngateViewModelJ2.a, dyngateViewModelJ2) : null;
                    if (str2 == null) {
                    }
                }
                int i3 = wt6.k;
                wt6VarA = vt6.a(48, str, str2, null);
            } else {
                String strDyngateViewModel_GetPassword = (BackendContainerAndroid.GetInstance().GetAccount().IsLoggedIn() && (dyngateViewModelJ = ds1.j(pListDyngateID)) != null) ? DyngateViewModelSWIGJNI.DyngateViewModel_GetPassword(dyngateViewModelJ.a, dyngateViewModelJ) : null;
                if (strDyngateViewModel_GetPassword != null) {
                    str3 = strDyngateViewModel_GetPassword;
                }
            }
            str2 = str3;
            int i4 = wt6.k;
            wt6VarA = vt6.a(48, str, str2, null);
        }
        if (wt6VarA != null) {
            long jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_2 = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_2(pListDyngateID.a, pListDyngateID);
            ManagedDeviceViewModel managedDeviceViewModel = jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_2 != 0 ? new ManagedDeviceViewModel(jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_2) : null;
            if (managedDeviceViewModel != null) {
                xs1.b0(managedDeviceViewModel, wt6VarA);
            } else {
                ye4.a.b("EasyAccessHelper", "Computer is not a managed device");
            }
        }
        P(wt6VarA);
    }

    public static final void i(Object obj, hw2 hw2Var, ux2 ux2Var) {
        de1 de1Var = ux2Var.R;
        boolean zF = ux2Var.f(obj);
        Object objK = ux2Var.K();
        if (zF || objK == e01.a) {
            objK = new b04(de1Var, hw2Var);
            ux2Var.g0(objK);
        }
    }

    public static void i0(PListComputerID pListComputerID, xt6 xt6Var, Context context, Function1 function1) {
        if (!PListComputerIDSWIGJNI.PListComputerID_Valid(pListComputerID.a, pListComputerID)) {
            ye4.c("ComputerConnector", "The computer id is not valid.");
            return;
        }
        ComputerEditViewModel computerEditViewModelI = ds1.i(pListComputerID);
        if (computerEditViewModelI == null) {
            ye4.c("ComputerConnector", "The computer id does not exists");
            return;
        }
        wt6 wt6Var = (wt6) function1.invoke(computerEditViewModelI);
        if (wt6Var == null) {
            return;
        }
        long jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_0 = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_0(pListComputerID.a, pListComputerID);
        ManagedDeviceViewModel managedDeviceViewModel = jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_0 == 0 ? null : new ManagedDeviceViewModel(jPartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_0);
        if (managedDeviceViewModel != null) {
            xs1.b0(managedDeviceViewModel, wt6Var);
        } else {
            ye4.a.b("EasyAccessHelper", "Computer is not a managed device");
        }
        if (!ComputerEditViewModelSWIGJNI.ComputerEditViewModel_IsMobileWakeActivated(computerEditViewModelI.a, computerEditViewModelI)) {
            P(wt6Var);
            return;
        }
        ye4.a("ComputerConnector", "Starting Host app");
        String strComputerEditViewModel_GetDisplayName = ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetDisplayName(computerEditViewModelI.a, computerEditViewModelI);
        strComputerEditViewModel_GetDisplayName.getClass();
        String string = context.getString(R.string.tv_startingHostApp, strComputerEditViewModel_GetDisplayName);
        string.getClass();
        Context context2 = d82.M;
        if (context2 != null) {
            d82.u(context2, string);
        } else {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
        }
        g11 g11Var = new g11(xt6Var, context, strComputerEditViewModel_GetDisplayName, wt6Var);
        ComputerEditViewModelSWIGJNI.ComputerEditViewModel_TriggerMobileWake(computerEditViewModelI.a, computerEditViewModelI, VoidResultCallback.getCPtr((VoidResultCallback) g11Var), g11Var);
    }

    public static final void j(Object[] objArr, hw2 hw2Var, ux2 ux2Var) {
        de1 de1Var = ux2Var.R;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zD = ux2Var.d(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zD |= ux2Var.f(obj);
        }
        Object objK = ux2Var.K();
        if (zD || objK == e01.a) {
            ux2Var.g0(new b04(de1Var, hw2Var));
        }
    }

    public static void j0(DyngateID dyngateID, ja3 ja3Var) {
        ja3Var.getClass();
        PListDyngateID pListDyngateID = new PListDyngateID(dyngateID);
        String strPListDyngateID_GetAsString = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateID.a, pListDyngateID);
        strPListDyngateID_GetAsString.getClass();
        String strB = ((l41) ja3Var).b(strPListDyngateID_GetAsString);
        int i2 = wt6.k;
        P(vt6.a(60, strPListDyngateID_GetAsString, strB, null));
    }

    public static final void k(Function0 function0, ux2 ux2Var) {
        va5 va5Var = ux2Var.M.b.V;
        va5Var.v0(ia5.d);
        lq1.E(va5Var, 0, function0);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:86:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00e2 A[SYNTHETIC] */
    public static k70 k0(k70 k70Var, int i2, int i3, nk5 nk5Var) throws d55 {
        int i4 = i3;
        if (i2 <= 0 || i4 <= 0) {
            throw d55.a();
        }
        k70 k70Var2 = new k70(i2, i4);
        int i5 = i2 * 2;
        float[] fArr = new float[i5];
        int i6 = 0;
        while (i6 < i4) {
            float f2 = i6 + 0.5f;
            for (int i7 = 0; i7 < i5; i7 += 2) {
                fArr[i7] = (i7 / 2) + 0.5f;
                fArr[i7 + 1] = f2;
            }
            float f3 = nk5Var.a;
            float f4 = nk5Var.b;
            float f5 = nk5Var.c;
            float f6 = nk5Var.d;
            float f7 = nk5Var.e;
            float f8 = nk5Var.f;
            float f9 = nk5Var.g;
            float f10 = nk5Var.h;
            float f11 = nk5Var.i;
            int i8 = i5 - 1;
            for (int i9 = 0; i9 < i8; i9 += 2) {
                float f12 = fArr[i9];
                int i10 = i9 + 1;
                float f13 = fArr[i10];
                float f14 = (f8 * f13) + (f5 * f12) + f11;
                fArr[i9] = (((f6 * f13) + (f3 * f12)) + f9) / f14;
                fArr[i10] = (((f13 * f7) + (f12 * f4)) + f10) / f14;
            }
            int i11 = k70Var.m;
            int i12 = k70Var.n;
            boolean z2 = true;
            for (int i13 = 0; i13 < i8 && z2; i13 += 2) {
                int i14 = (int) fArr[i13];
                int i15 = i13 + 1;
                int i16 = (int) fArr[i15];
                if (i14 < -1 || i14 > i11 || i16 < -1 || i16 > i12) {
                    throw d55.a();
                }
                if (i14 == -1) {
                    fArr[i13] = 0.0f;
                } else {
                    if (i14 == i11) {
                        fArr[i13] = i11 - 1;
                    } else {
                        z2 = false;
                    }
                    if (i16 == -1) {
                        fArr[i15] = 0.0f;
                    } else {
                        if (i16 == i12) {
                            fArr[i15] = i12 - 1;
                        }
                    }
                    z2 = true;
                }
                z2 = true;
                if (i16 == -1) {
                    fArr[i15] = 0.0f;
                } else {
                    if (i16 == i12) {
                        fArr[i15] = i12 - 1;
                    }
                }
                z2 = true;
            }
            boolean z3 = true;
            for (int i17 = i5 - 2; i17 >= 0 && z3; i17 -= 2) {
                int i18 = (int) fArr[i17];
                int i19 = i17 + 1;
                int i20 = (int) fArr[i19];
                if (i18 < -1 || i18 > i11 || i20 < -1 || i20 > i12) {
                    throw d55.a();
                }
                if (i18 == -1) {
                    fArr[i17] = 0.0f;
                } else {
                    if (i18 == i11) {
                        fArr[i17] = i11 - 1;
                    } else {
                        z3 = false;
                    }
                    if (i20 == -1) {
                        fArr[i19] = 0.0f;
                    } else {
                        if (i20 == i12) {
                            fArr[i19] = i12 - 1;
                        }
                    }
                    z3 = true;
                }
                z3 = true;
                if (i20 == -1) {
                    fArr[i19] = 0.0f;
                } else {
                    if (i20 == i12) {
                        fArr[i19] = i12 - 1;
                    }
                }
                z3 = true;
            }
            for (int i21 = 0; i21 < i5; i21 += 2) {
                try {
                    if (k70Var.b((int) fArr[i21], (int) fArr[i21 + 1])) {
                        k70Var2.i(i21 / 2, i6);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw d55.a();
                }
            }
            i6++;
            i4 = i3;
        }
        return k70Var2;
    }

    public static final void l(u18 u18Var, q18 q18Var, Object obj, Object obj2, rl2 rl2Var, ux2 ux2Var, int i2) {
        int i3;
        ux2Var.Y(867041821);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.f(u18Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.f(q18Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? ux2Var.f(obj) : ux2Var.h(obj) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? ux2Var.f(obj2) : ux2Var.h(obj2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? ux2Var.f(rl2Var) : ux2Var.h(rl2Var) ? 16384 : 8192;
        }
        if (!ux2Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            ux2Var.Q();
        } else if (u18Var.g()) {
            q18Var.g(obj, obj2, rl2Var);
        } else {
            q18Var.h(obj2, rl2Var, null, null);
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a50((Object) u18Var, (Object) q18Var, obj, obj2, (Object) rl2Var, i2, (byte) 6);
        }
    }

    public static cw0 m(cw0 cw0Var) {
        wi8 wi8Var = db8.x;
        df6 df6Var = df6.q;
        if (di1.q(cw0Var.b, 12884901888L)) {
            td6 td6Var = (td6) cw0Var;
            wi8 wi8Var2 = td6Var.d;
            if (!v(wi8Var2, wi8Var)) {
                return new td6(td6Var.a, td6Var.h, wi8Var, Z(r((float[]) df6Var.n, wi8Var2.a(), wi8Var.a()), td6Var.i), td6Var.k, td6Var.n, td6Var.e, td6Var.f, td6Var.g, -1);
            }
        }
        return cw0Var;
    }

    public static final boolean n(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static String o(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = (bArr[i2] & 240) >>> 4;
            char[] cArr = C;
            sb.append(cArr[i3]);
            sb.append(cArr[bArr[i2] & 15]);
        }
        return sb.toString();
    }

    public static final void p(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static fs4 q(fs4 fs4Var) {
        return fs4Var.f(new uq0(new px((byte) 13)));
    }

    public static final float[] r(float[] fArr, float[] fArr2, float[] fArr3) {
        a0(fArr, fArr2);
        a0(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrV = V(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return Z(fArrV, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final Object u(n77 n77Var, int i2) {
        Object obj;
        n77Var.getClass();
        int iS = j51.s(n77Var.f1550o, i2, n77Var.m);
        if (iS < 0 || (obj = n77Var.n[iS]) == M) {
            return null;
        }
        return obj;
    }

    public static final Shader.TileMode u0(int i2) {
        if (i2 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i2 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i2 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i2 == 3 && Build.VERSION.SDK_INT >= 31) {
            return Shader.TileMode.DECAL;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final boolean v(wi8 wi8Var, wi8 wi8Var2) {
        if (wi8Var == wi8Var2) {
            return true;
        }
        return Math.abs(wi8Var.a - wi8Var2.a) < 0.001f && Math.abs(wi8Var.b - wi8Var2.b) < 0.001f;
    }

    public static final long v0(long j2) {
        long j3 = 63 & j2;
        int i2 = (int) j3;
        if (i2 <= 15) {
            return j2;
        }
        if (i2 == ew0.u.c) {
            return j51.U(j2);
        }
        if ((i2 == ew0.v.c || i2 == ew0.w.c) && Build.VERSION.SDK_INT < 34) {
            return j51.U(j2);
        }
        return (i2 != ew0.x.c || Build.VERSION.SDK_INT >= 36) ? (j2 & (-64)) | (j3 - 1) : j51.U(j2);
    }

    public static final me1 w(ux2 ux2Var) {
        return new x96(ux2Var.R);
    }

    public static final String w0(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = kh.a;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        g68.j(i3, 8, 8);
        return new String(cArr2, i3, 8 - i3);
    }

    public static final p51 x(cw0 cw0Var, cw0 cw0Var2) {
        if (cw0Var == cw0Var2) {
            return new n51(cw0Var, cw0Var, 1);
        }
        return (di1.q(cw0Var.b, 12884901888L) && di1.q(cw0Var2.b, 12884901888L)) ? new o51((td6) cw0Var, (td6) cw0Var2) : new p51(cw0Var, cw0Var2, 0);
    }

    public static final long x0(long j2) {
        int i2 = (int) (63 & j2);
        return (i2 == ew0.x.c || i2 == ew0.s.c || i2 == ew0.t.c) ? v0(rv0.a(j2, ew0.e)) : v0(j2);
    }

    public static final n18 y(u18 u18Var, yn1 yn1Var, String str, ux2 ux2Var, int i2, int i3) {
        m18 m18Var;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = ux2Var.f(u18Var);
        Object objK = ux2Var.K();
        Object obj = e01.a;
        if (zF || objK == obj) {
            objK = new n18(u18Var, yn1Var, str);
            ux2Var.g0(objK);
        }
        n18 n18Var = (n18) objK;
        boolean zF2 = ux2Var.f(u18Var) | ux2Var.h(n18Var);
        Object objK2 = ux2Var.K();
        if (zF2 || objK2 == obj) {
            objK2 = new w18(u18Var, n18Var, (byte) 0);
            ux2Var.g0(objK2);
        }
        e(n18Var, (Function1) objK2, ux2Var);
        if (u18Var.g() && (m18Var = (m18) n18Var.b.getValue()) != null) {
            u18 u18Var2 = n18Var.c;
            m18Var.m.g(m18Var.f1428o.invoke(u18Var2.f().b()), m18Var.f1428o.invoke(u18Var2.f().d()), (rl2) m18Var.n.invoke(u18Var2.f()));
        }
        return n18Var;
    }

    public static final u18 y0(Object obj, String str, ux2 ux2Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        Object objK = ux2Var.K();
        aw awVar = e01.a;
        if (objK == awVar) {
            objK = new u18(new wx4(obj), null, str);
            ux2Var.g0(objK);
        }
        u18 u18Var = (u18) objK;
        u18Var.a(obj, ux2Var, (i2 & 8) | 48 | (i2 & 14));
        Object objK2 = ux2Var.K();
        if (objK2 == awVar) {
            objK2 = new v18(u18Var, (byte) 1);
            ux2Var.g0(objK2);
        }
        e(u18Var, (Function1) objK2, ux2Var);
        return u18Var;
    }

    public static final q18 z(u18 u18Var, Object obj, Object obj2, rl2 rl2Var, yn1 yn1Var, ux2 ux2Var, int i2) {
        Object obj3;
        Object obj4;
        int i3 = i2 & 14;
        int i4 = i3 ^ 6;
        boolean z2 = true;
        boolean z3 = (i4 > 4 && ux2Var.f(u18Var)) || (i2 & 6) == 4;
        Object objK = ux2Var.K();
        Object obj5 = e01.a;
        if (z3 || objK == obj5) {
            n47 n47VarC = el5.c();
            Function1 function1E = n47VarC != null ? n47VarC.e() : null;
            n47 n47VarF = el5.f(n47VarC);
            try {
                obj3 = obj2;
                qo qoVar = (qo) yn1Var.b().invoke(obj3);
                qoVar.d();
                obj4 = obj;
                Object q18Var = new q18(u18Var, obj4, qoVar, yn1Var);
                el5.h(n47VarC, n47VarF, function1E);
                ux2Var.g0(q18Var);
                objK = q18Var;
            } catch (Throwable th) {
                el5.h(n47VarC, n47VarF, function1E);
                throw th;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        q18 q18Var2 = (q18) objK;
        int i5 = (i2 >> 3) & 8;
        int i6 = i2 << 3;
        l(u18Var, q18Var2, obj4, obj3, rl2Var, ux2Var, i3 | (i5 << 6) | (i6 & 896) | (i5 << 9) | (i6 & 7168) | (57344 & i6));
        if ((i4 <= 4 || !ux2Var.f(u18Var)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean zF = ux2Var.f(q18Var2) | z2;
        Object objK2 = ux2Var.K();
        if (zF || objK2 == obj5) {
            objK2 = new py5((Object) u18Var, (Object) q18Var2, (byte) 27);
            ux2Var.g0(objK2);
        }
        e(q18Var2, (Function1) objK2, ux2Var);
        return q18Var2;
    }

    public abstract void O(boolean z2);

    public abstract int R();

    public abstract Context S();

    public boolean U() {
        return false;
    }

    public void b0() {
    }

    public void c0() {
    }

    public abstract boolean d0(int i2, KeyEvent keyEvent);

    public boolean e0(KeyEvent keyEvent) {
        return false;
    }

    public boolean f0() {
        return false;
    }

    public abstract void l0();

    public void m0(boolean z2) {
    }

    public abstract void n0(boolean z2);

    public abstract void o0();

    public abstract void p0();

    public void q0(boolean z2) {
    }

    public abstract void r0(String str);

    public boolean s() {
        return false;
    }

    public abstract void s0(CharSequence charSequence);

    public abstract boolean t();

    public p7 t0(cj3 cj3Var) {
        return null;
    }
}
