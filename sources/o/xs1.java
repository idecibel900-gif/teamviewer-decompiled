package o;

import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.MotionEvent;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceModuleType;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDeviceViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDeviceViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class xs1 {
    public static FirebaseConfigurationAdapter a;

    public static byte[] A(String str) {
        if (str.length() % 2 != 0) {
            hk0.g("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                hk0.g("input is not hexadecimal");
                return null;
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static float B(float f, float f2, float f3, float f4) {
        double d = f - f3;
        double d2 = f2 - f4;
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    public static float C(int i, int i2, int i3, int i4) {
        double d = i - i3;
        double d2 = i2 - i4;
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    public static void D(u52 u52Var, vs1 vs1Var, sb0 sb0Var, float f, int i) {
        float f2 = (i & 4) != 0 ? 1.0f : f;
        boolean z = vs1Var instanceof ob5;
        zk2 zk2Var = zk2.a;
        if (z) {
            v56 v56Var = ((ob5) vs1Var).e;
            float f3 = v56Var.a;
            u52Var.B0(sb0Var, (((long) Float.floatToRawIntBits(v56Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), W(v56Var), f2, zk2Var, null, 3);
            return;
        }
        if (!(vs1Var instanceof pb5)) {
            if (vs1Var instanceof nb5) {
                u52Var.G(((nb5) vs1Var).e, sb0Var, f2, zk2Var, null, 3);
                return;
            } else {
                gk0.s();
                return;
            }
        }
        pb5 pb5Var = (pb5) vs1Var;
        rj rjVar = pb5Var.f;
        if (rjVar != null) {
            u52Var.G(rjVar, sb0Var, f2, zk2Var, null, 3);
            return;
        }
        lf6 lf6Var = pb5Var.e;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (lf6Var.h >> 32));
        float f4 = lf6Var.a;
        u52Var.y(sb0Var, (((long) Float.floatToRawIntBits(lf6Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32), (((long) Float.floatToRawIntBits(lf6Var.b())) << 32) | (((long) Float.floatToRawIntBits(lf6Var.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), f2, zk2Var, null, 3);
    }

    public static void E(u52 u52Var, vs1 vs1Var, long j) {
        if (vs1Var instanceof ob5) {
            v56 v56Var = ((ob5) vs1Var).e;
            float f = v56Var.a;
            float f2 = v56Var.b;
            u52Var.E0(j, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), W(v56Var), 1.0f, 3);
            return;
        }
        boolean z = vs1Var instanceof pb5;
        zk2 zk2Var = zk2.a;
        if (!z) {
            if (vs1Var instanceof nb5) {
                u52Var.i0(((nb5) vs1Var).e, j, zk2Var);
                return;
            } else {
                gk0.s();
                return;
            }
        }
        pb5 pb5Var = (pb5) vs1Var;
        rj rjVar = pb5Var.f;
        if (rjVar != null) {
            u52Var.i0(rjVar, j, zk2Var);
            return;
        }
        lf6 lf6Var = pb5Var.e;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (lf6Var.h >> 32));
        float f3 = lf6Var.a;
        float f4 = lf6Var.b;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
        float fB = lf6Var.b();
        float fA = lf6Var.a();
        u52Var.G0(j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), zk2Var);
    }

    public static String F(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static boolean G(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final br2 H(br2 br2Var) {
        br2 br2VarG = ((lq2) vn4.q0(br2Var).getFocusOwner()).g();
        if (br2VarG == null || !br2VarG.z) {
            return null;
        }
        return br2VarG;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030 A[RETURN] */
    public static final q76 I(Annotation[] annotationArr, ht2 ht2Var) {
        annotationArr.getClass();
        ht2Var.getClass();
        for (Annotation annotation : annotationArr) {
            if (im3.n(p76.a(et1.z(et1.x(annotation))).a(), ht2Var)) {
                if (annotation != null) {
                    return new q76(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new q76(annotation);
        }
        return null;
    }

    public static final v56 J(br2 br2Var) {
        e45 e45Var;
        if (br2Var.z && (e45Var = br2Var.t) != null) {
            i04 i04VarS = vt1.s(e45Var);
            if (!i04VarS.m()) {
                i04VarS = null;
            }
            if (i04VarS != null) {
                return br2Var.X0(i04VarS);
            }
        }
        return v56.e;
    }

    public static final e87 K(cu4 cu4Var, du4 du4Var) {
        int iOrdinal = du4Var.ordinal();
        if (iOrdinal == 0) {
            cu4Var.getClass();
            e87 e87Var = cu4.b;
            e87Var.getClass();
            return e87Var;
        }
        if (iOrdinal == 1) {
            cu4Var.getClass();
            e87 e87Var2 = cu4.c;
            e87Var2.getClass();
            return e87Var2;
        }
        if (iOrdinal == 2) {
            cu4Var.getClass();
            e87 e87Var3 = cu4.d;
            e87Var3.getClass();
            return e87Var3;
        }
        if (iOrdinal == 3) {
            cu4Var.getClass();
            e87 e87Var4 = cu4.e;
            e87Var4.getClass();
            return e87Var4;
        }
        if (iOrdinal == 4) {
            cu4Var.getClass();
            e87 e87Var5 = cu4.f;
            e87Var5.getClass();
            return e87Var5;
        }
        if (iOrdinal != 5) {
            gk0.s();
            return null;
        }
        cu4Var.getClass();
        e87 e87Var6 = cu4.g;
        e87Var6.getClass();
        return e87Var6;
    }

    public static final br2 L(br2 br2Var) {
        boolean z = br2Var.m.z;
        if (z) {
            if (!z) {
                ki3.c("visitChildren called on an unattached node");
            }
            xx4 xx4Var = new xx4(new es4[16]);
            es4 es4Var = br2Var.m;
            es4 es4Var2 = es4Var.r;
            if (es4Var2 == null) {
                vn4.V(xx4Var, es4Var);
            } else {
                xx4Var.b(es4Var2);
            }
            while (true) {
                int i = xx4Var.f2559o;
                if (i == 0) {
                    break;
                }
                es4 es4VarL0 = (es4) xx4Var.k(i - 1);
                if ((es4VarL0.p & 1024) == 0) {
                    vn4.V(xx4Var, es4VarL0);
                } else {
                    while (es4VarL0 != null) {
                        if ((es4VarL0.f737o & 1024) != 0) {
                            xx4 xx4Var2 = null;
                            while (es4VarL0 != null) {
                                if (es4VarL0 instanceof br2) {
                                    br2 br2Var2 = (br2) es4VarL0;
                                    if (br2Var2.m.z) {
                                        int iOrdinal = br2Var2.Z0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return br2Var2;
                                        }
                                        if (iOrdinal != 3) {
                                            gk0.s();
                                            return null;
                                        }
                                    }
                                } else if ((es4VarL0.f737o & 1024) != 0 && (es4VarL0 instanceof vm1)) {
                                    int i2 = 0;
                                    for (es4 es4Var3 = ((vm1) es4VarL0).B; es4Var3 != null; es4Var3 = es4Var3.r) {
                                        if ((es4Var3.f737o & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                es4VarL0 = es4Var3;
                                            } else {
                                                if (xx4Var2 == null) {
                                                    xx4Var2 = new xx4(new es4[16]);
                                                }
                                                if (es4VarL0 != null) {
                                                    xx4Var2.b(es4VarL0);
                                                    es4VarL0 = null;
                                                }
                                                xx4Var2.b(es4Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                es4VarL0 = vn4.l0(xx4Var2);
                            }
                            break;
                        }
                        es4VarL0 = es4VarL0.r;
                    }
                }
            }
        }
        return null;
    }

    public static final ArrayList M(Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new q76(annotation));
        }
        return arrayList;
    }

    public static final int N(ug6 ug6Var, String str) {
        ug6Var.getClass();
        int iR = bt1.r(ug6Var, str);
        if (iR >= 0) {
            return iR;
        }
        int columnCount = ug6Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(ug6Var.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + lv0.t0(arrayList, null, null, null, null, 63) + ']');
    }

    public static final String O(zl6 zl6Var) {
        int iOrdinal = zl6Var.ordinal();
        if (iOrdinal == 0) {
            return "TVTA-searchScreen-results-all";
        }
        if (iOrdinal == 1) {
            return "TVTA-searchScreen-results-devices";
        }
        if (iOrdinal == 2) {
            return "TVTA-searchScreen-results-contacts";
        }
        if (iOrdinal == 3) {
            return "TVTA-searchScreen-results-groups";
        }
        gk0.s();
        return null;
    }

    public static final tg4 P(tg4 tg4Var) {
        LayoutNode layoutNodeF = tg4Var.G.G;
        while (true) {
            LayoutNode layoutNodeF2 = layoutNodeF.F();
            if ((layoutNodeF2 != null ? layoutNodeF2.u : null) == null) {
                tg4 tg4VarY0 = layoutNodeF.getOuterCoordinator$ui().Y0();
                tg4VarY0.getClass();
                return tg4VarY0;
            }
            LayoutNode layoutNodeF3 = layoutNodeF.F();
            LayoutNode layoutNode = layoutNodeF3 != null ? layoutNodeF3.u : null;
            layoutNode.getClass();
            if (layoutNode.t) {
                layoutNodeF = layoutNodeF.F();
                layoutNodeF.getClass();
            } else {
                LayoutNode layoutNodeF4 = layoutNodeF.F();
                layoutNodeF4.getClass();
                layoutNodeF = layoutNodeF4.u;
                layoutNodeF.getClass();
            }
        }
    }

    public static final boolean Q(fp6 fp6Var) {
        ap6 ap6VarK = fp6Var.k();
        return ap6VarK.m.c(kp6.B);
    }

    public static final boolean R(br2 br2Var) {
        LayoutNode layoutNode;
        e45 e45Var;
        LayoutNode layoutNode2;
        e45 e45Var2 = br2Var.t;
        return (e45Var2 == null || (layoutNode = e45Var2.G) == null || !layoutNode.X() || (e45Var = br2Var.t) == null || (layoutNode2 = e45Var.G) == null || !layoutNode2.W()) ? false : true;
    }

    public static final boolean S(vs1 vs1Var) {
        if (vs1Var instanceof qz1) {
            return ((qz1) vs1Var).h;
        }
        if (vs1Var instanceof sz1) {
            return ((sz1) vs1Var).h;
        }
        if (vs1Var instanceof nz1) {
            return ((nz1) vs1Var).h;
        }
        return false;
    }

    public static int V(float f) {
        return (int) (f + (f < 0.0f ? -0.5f : 0.5f));
    }

    public static final long W(v56 v56Var) {
        float f = v56Var.c - v56Var.a;
        return (((long) Float.floatToRawIntBits(v56Var.d - v56Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static int X(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void Y(Throwable th, hc1 hc1Var) {
        az3 az3Var;
        if (hc1Var instanceof az3) {
            az3Var = (az3) hc1Var;
            int i = az3Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                az3Var.n = i - Integer.MIN_VALUE;
            } else {
                az3Var = new az3(hc1Var);
            }
        } else {
            az3Var = new az3(hc1Var);
        }
        Object obj = az3Var.m;
        int i2 = az3Var.n;
        if (i2 != 0) {
            if (i2 == 1) {
                throw ua5.q(obj);
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
        } else {
            ct1.a0(obj);
            az3Var.n = 1;
            g22.a.K0(az3Var.getContext(), new it8((Object) az3Var, (Object) th, (byte) 13));
        }
    }

    public static final void Z(bn5 bn5Var, long j, Function1 function1, boolean z) {
        MotionEvent motionEventA = bn5Var.a();
        if (motionEventA == null) {
            hk0.g("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        function1.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventA.setAction(action);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final void a(ns1 ns1Var, fs4 fs4Var, Function0 function0, Function0 function1, ux2 ux2Var, int i) {
        int i2;
        fs4 fs4Var2;
        ?? r1;
        yy0 yy0VarO;
        boolean z;
        ns1 ns1Var2 = ns1Var;
        Function0 function2 = function0;
        x50 x50Var = xz2.x;
        ju juVar = iq8.a;
        ns1Var2.getClass();
        long j = ns1Var2.a;
        ux2Var.Y(160975009);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(ns1Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= ux2Var.h(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var.h(function1) ? 2048 : 1024;
        }
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            String str = im3.n(ns1Var2.i, Boolean.TRUE) ? "•••••••••" : null;
            bw bwVar = iq8.c;
            w50 w50Var = xz2.A;
            kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var, cs4Var);
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
            lv1.A(0, m77.z(R.string.device_tab_device_details_information_title, ux2Var), ux2Var, null);
            fs4 fs4VarD = ka0.D(au8.s(iq8.j(ka0.C(cs4Var, 16.0f, 8.0f), sf6.a(8.0f)), ((rn4) ux2Var.j(un4.a)).a.H, kh.V), 0.0f, 8.0f, 1);
            kw0 kw0VarA2 = iw0.a(bwVar, w50Var, ux2Var, 0);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarD);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA2, iz0Var, ux2Var);
            o67.n(yj5VarL2, iz0Var2, ux2Var);
            e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS2, iz0Var4, ux2Var);
            if (ns1Var2.l) {
                ux2Var.W(627664507);
                fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                dg6 dg6VarA = cg6.a(juVar, x50Var, ux2Var, 0);
                int iHashCode3 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL3 = ux2Var.l();
                fs4 fs4VarS3 = uf0.s(ux2Var, fs4VarC);
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                o67.n(dg6VarA, iz0Var, ux2Var);
                o67.n(yj5VarL3, iz0Var2, ux2Var);
                e41.r(iHashCode3, ux2Var, iz0Var3, ux2Var);
                o67.n(fs4VarS3, iz0Var4, ux2Var);
                b(m77.z(R.string.device_tab_device_details_information_id, ux2Var), String.valueOf(j), androidx.compose.ui.platform.a.a(eg6.a(cs4Var, 1.0f), "TVTA-devicesScreen-deviceInfoScreen-deviceInfo-id"), null, ux2Var, 0, 8);
                if (ns1Var2.u != js1.n) {
                    ux2Var.W(656619859);
                    String strZ = m77.z(R.string.device_tab_device_details_information_policy, ux2Var);
                    String str2 = ns1Var2.p;
                    fs4 fs4VarA = androidx.compose.ui.platform.a.a(eg6.a(cs4Var, 1.0f), "TVTA-devicesScreen-deviceInfoScreen-deviceInfo-policy");
                    String str3 = ns1Var2.p;
                    if (str3 == null) {
                        str3 = null;
                    } else {
                        if (ub7.b0(str3)) {
                            str3 = null;
                        }
                        if (str3 == null || ns1Var2.f1598o != null || ns1Var2.r == null) {
                            str3 = null;
                        }
                    }
                    if (str3 == null) {
                        ux2Var.W(657254521);
                        ux2Var.p(false);
                        z = false;
                        yy0VarO = null;
                    } else {
                        ux2Var.W(657254522);
                        yy0VarO = au8.O(-1409677397, new v4(function1, (byte) 14), ux2Var);
                        z = false;
                        ux2Var.p(false);
                    }
                    boolean z3 = z;
                    b(strZ, str2, fs4VarA, yy0VarO, ux2Var, 0, 0);
                    ux2Var.p(z3);
                    r1 = z3;
                } else {
                    r1 = 0;
                    ux2Var.W(657914326);
                    ux2Var.p(false);
                }
                ux2Var.p(true);
                fs4 fs4VarC2 = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                dg6 dg6VarA2 = cg6.a(juVar, x50Var, ux2Var, r1);
                int iHashCode4 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL4 = ux2Var.l();
                fs4 fs4VarS4 = uf0.s(ux2Var, fs4VarC2);
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                o67.n(dg6VarA2, iz0Var, ux2Var);
                o67.n(yj5VarL4, iz0Var2, ux2Var);
                e41.r(iHashCode4, ux2Var, iz0Var3, ux2Var);
                o67.n(fs4VarS4, iz0Var4, ux2Var);
                String strZ2 = m77.z(R.string.device_tab_device_details_information_module, ux2Var);
                ns1Var2 = ns1Var;
                DeviceModuleType deviceModuleType = ns1Var2.j;
                b(strZ2, deviceModuleType != null ? deviceModuleType.name() : null, androidx.compose.ui.platform.a.a(eg6.a(cs4Var, 1.0f), "TVTA-devicesScreen-deviceInfoScreen-deviceInfo-module"), null, ux2Var, 0, 8);
                b(m77.z(R.string.device_tab_device_details_information_version, ux2Var), ns1Var2.k, androidx.compose.ui.platform.a.a(eg6.a(cs4Var, 1.0f), "TVTA-devicesScreen-deviceInfoScreen-deviceInfo-version"), null, ux2Var, 0, 8);
                ux2Var.p(true);
                ux2Var.p(false);
                function2 = function0;
            } else {
                ux2Var.W(630415044);
                fs4 fs4VarC3 = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                dg6 dg6VarA3 = cg6.a(juVar, x50Var, ux2Var, 0);
                int iHashCode5 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL5 = ux2Var.l();
                fs4 fs4VarS5 = uf0.s(ux2Var, fs4VarC3);
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                o67.n(dg6VarA3, iz0Var, ux2Var);
                o67.n(yj5VarL5, iz0Var2, ux2Var);
                e41.r(iHashCode5, ux2Var, iz0Var3, ux2Var);
                o67.n(fs4VarS5, iz0Var4, ux2Var);
                b(m77.z(R.string.device_tab_device_details_information_id, ux2Var), String.valueOf(j), androidx.compose.ui.platform.a.a(eg6.a(cs4Var, 1.0f), "TVTA-devicesScreen-deviceInfoScreen-deviceInfo-id"), null, ux2Var, 0, 8);
                function2 = function0;
                b(m77.z(R.string.device_tab_device_details_information_password, ux2Var), str, androidx.compose.ui.platform.a.a(eg6.a(cs4Var, 1.0f), "TVTA-devicesScreen-deviceInfoScreen-deviceInfo-password"), au8.O(-1012945371, new v4(function2, (byte) 15), ux2Var), ux2Var, 3072, 0);
                ux2Var.p(true);
                ux2Var.p(false);
            }
            b(m77.z(R.string.description_title, ux2Var), ns1Var2.h, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-deviceInfoScreen-deviceInfo-description"), null, ux2Var, 384, 8);
            ux2Var.p(true);
            ux2Var.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new p5((Object) ns1Var2, fs4Var2, (Object) function2, (Object) function1, i, (byte) 8);
        }
    }

    public static final long a0(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void b(final String str, final String str2, final fs4 fs4Var, hw2 hw2Var, ux2 ux2Var, final int i, final int i2) {
        hw2 hw2Var2;
        boolean z;
        ux2 ux2Var2;
        hw2 hw2Var3;
        j56 j56VarR;
        String strM;
        boolean z2;
        tg3 tg3Var;
        fs4 s14Var;
        int i3;
        boolean z3;
        ux2Var.Y(-319389584);
        byte b = 2;
        int i4 = (ux2Var.f(str) ? 4 : 2) | i | (ux2Var.f(str2) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                hw2Var2 = hw2Var;
                i4 |= ux2Var.h(hw2Var2) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i4 & 1, z)) {
                strM = null;
                if (i5 != 0) {
                    hw2Var2 = null;
                }
                if (str2 != null && !ub7.b0(str2)) {
                    strM = str2;
                }
                if (strM == null) {
                    strM = to7.m(ux2Var, -1990704492, R.string.field_empty, ux2Var, false);
                } else {
                    ux2Var.W(-1990705856);
                    ux2Var.p(false);
                }
                String str3 = strM;
                fs4 fs4VarC = ka0.C(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), 16.0f, 8.0f);
                dg6 dg6VarA = cg6.a(new ew(8.0f, new hk0(b)), xz2.y, ux2Var, 54);
                int iHashCode = Long.hashCode(ux2Var.T);
                yj5 yj5VarL = ux2Var.l();
                fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
                yz0.c.getClass();
                ux2Var.a0();
                z2 = ux2Var.S;
                tg3Var = LayoutNode.e0;
                if (z2) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                iz0 iz0Var = d82.v;
                o67.n(dg6VarA, iz0Var, ux2Var);
                iz0 iz0Var2 = d82.u;
                o67.n(yj5VarL, iz0Var2, ux2Var);
                Integer numValueOf = Integer.valueOf(iHashCode);
                iz0 iz0Var3 = d82.w;
                o67.n(numValueOf, iz0Var3, ux2Var);
                o67.l(ux2Var);
                iz0 iz0Var4 = d82.t;
                o67.n(fs4VarS, iz0Var4, ux2Var);
                if (hw2Var2 == null) {
                    s14Var = androidx.compose.foundation.layout.b.c(cs4.b, 1.0f);
                } else {
                    s14Var = new s14(1.0f, false);
                }
                kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                int iHashCode2 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL2 = ux2Var.l();
                fs4 fs4VarS2 = uf0.s(ux2Var, s14Var);
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                o67.n(kw0VarA, iz0Var, ux2Var);
                o67.n(yj5VarL2, iz0Var2, ux2Var);
                e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
                o67.n(fs4VarS2, iz0Var4, ux2Var);
                h72 h72Var = un4.a;
                i3 = i4;
                hw2Var3 = hw2Var2;
                qs7.b(str, null, ((rn4) ux2Var.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.n, ux2Var, i4 & 14, 0, 131066);
                qs7.b(str3, null, ((rn4) ux2Var.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.j, ux2Var, 0, 0, 131066);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                if (hw2Var3 == null) {
                    ux2Var2.W(692986597);
                    z3 = false;
                } else {
                    z3 = false;
                    ux2Var2.W(1823469724);
                    hw2Var3.invoke(ux2Var2, Integer.valueOf((i3 >> 9) & 14));
                }
                ux2Var2.p(z3);
                ux2Var2.p(true);
            } else {
                ux2Var2 = ux2Var;
                ux2Var2.Q();
                hw2Var3 = hw2Var2;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                final hw2 hw2Var4 = hw2Var3;
                j56VarR.d = new hw2() { // from class: o.ws1
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xs1.b(str, str2, fs4Var, hw2Var4, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i4 |= 3072;
        hw2Var2 = hw2Var;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i4 & 1, z)) {
            strM = null;
            if (i5 != 0) {
                hw2Var2 = null;
            }
            if (str2 != null) {
                strM = str2;
            }
            if (strM == null) {
                strM = to7.m(ux2Var, -1990704492, R.string.field_empty, ux2Var, false);
            } else {
                ux2Var.W(-1990705856);
                ux2Var.p(false);
            }
            String str4 = strM;
            fs4 fs4VarC2 = ka0.C(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), 16.0f, 8.0f);
            dg6 dg6VarA2 = cg6.a(new ew(8.0f, new hk0(b)), xz2.y, ux2Var, 54);
            int iHashCode3 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL3 = ux2Var.l();
            fs4 fs4VarS3 = uf0.s(ux2Var, fs4VarC2);
            yz0.c.getClass();
            ux2Var.a0();
            z2 = ux2Var.S;
            tg3Var = LayoutNode.e0;
            if (z2) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var5 = d82.v;
            o67.n(dg6VarA2, iz0Var5, ux2Var);
            iz0 iz0Var6 = d82.u;
            o67.n(yj5VarL3, iz0Var6, ux2Var);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            iz0 iz0Var7 = d82.w;
            o67.n(numValueOf2, iz0Var7, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var8 = d82.t;
            o67.n(fs4VarS3, iz0Var8, ux2Var);
            if (hw2Var2 == null) {
                s14Var = androidx.compose.foundation.layout.b.c(cs4.b, 1.0f);
            } else {
                s14Var = new s14(1.0f, false);
            }
            kw0 kw0VarA2 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode4 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL4 = ux2Var.l();
            fs4 fs4VarS4 = uf0.s(ux2Var, s14Var);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA2, iz0Var5, ux2Var);
            o67.n(yj5VarL4, iz0Var6, ux2Var);
            e41.r(iHashCode4, ux2Var, iz0Var7, ux2Var);
            o67.n(fs4VarS4, iz0Var8, ux2Var);
            h72 h72Var2 = un4.a;
            i3 = i4;
            hw2Var3 = hw2Var2;
            qs7.b(str, null, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var2)).b.n, ux2Var, i4 & 14, 0, 131066);
            qs7.b(str4, null, ((rn4) ux2Var.j(h72Var2)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var2)).b.j, ux2Var, 0, 0, 131066);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            if (hw2Var3 == null) {
                ux2Var2.W(692986597);
                z3 = false;
            } else {
                z3 = false;
                ux2Var2.W(1823469724);
                hw2Var3.invoke(ux2Var2, Integer.valueOf((i3 >> 9) & 14));
            }
            ux2Var2.p(z3);
            ux2Var2.p(true);
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
            hw2Var3 = hw2Var2;
        }
        j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            final hw2 hw2Var5 = hw2Var3;
            j56VarR.d = new hw2() { // from class: o.ws1
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xs1.b(str, str2, fs4Var, hw2Var5, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static void b0(ManagedDeviceViewModel managedDeviceViewModel, mb5 mb5Var) {
        if (ManagedDeviceViewModelSWIGJNI.ManagedDeviceViewModel_IsEasyAccessEnabled(managedDeviceViewModel.a, managedDeviceViewModel)) {
            String strManagedDeviceViewModel_GetManagementId = ManagedDeviceViewModelSWIGJNI.ManagedDeviceViewModel_GetManagementId(managedDeviceViewModel.a, managedDeviceViewModel);
            strManagedDeviceViewModel_GetManagementId.getClass();
            if (strManagedDeviceViewModel_GetManagementId.length() <= 0) {
                ye4.c("EasyAccessHelper", "Easy access enabled, but ManagementId is empty");
                return;
            }
            ye4.a("EasyAccessHelper", "Enabling easy access for connection");
            mb5Var.c = Boolean.TRUE;
            mb5Var.b(strManagedDeviceViewModel_GetManagementId);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0150  */
    public static final void c(final vs1 vs1Var, fs4 fs4Var, ux2 ux2Var, int i, int i2) {
        fs4 fs4Var2;
        int i3;
        String strZ;
        ud5 ud5VarT;
        fs4 fs4Var3;
        fs4 fs4Var4;
        boolean z;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(1234033902);
        int i4 = ((i & 8) == 0 ? ux2Var2.f(vs1Var) : ux2Var2.h(vs1Var) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            fs4Var2 = fs4Var;
        } else {
            fs4Var2 = fs4Var;
            i3 = i4 | (ux2Var2.f(fs4Var2) ? 32 : 16);
        }
        if (ux2Var2.N(i3 & 1, (i3 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4Var5 = i5 != 0 ? cs4Var : fs4Var2;
            ka0 ka0VarA = vs1Var.A();
            if (ka0VarA != null) {
                if (ka0VarA instanceof tr) {
                    ux2Var2.W(495612421);
                    strZ = m77.z(((tr) ka0VarA).z, ux2Var2);
                    ux2Var2.p(false);
                } else if (ka0VarA instanceof ur) {
                    ux2Var2.W(495614226);
                    ux2Var2.p(false);
                    strZ = ((ur) ka0VarA).z;
                }
                boolean zS = S(vs1Var);
                boolean zF = vs1Var.F();
                int i6 = i3 & 14;
                boolean zG = ux2Var2.g(zS) | (i6 == 4 || ((i3 & 8) != 0 && ux2Var2.h(vs1Var)));
                Object objK = ux2Var2.K();
                aw awVar = e01.a;
                if (zG || objK == awVar) {
                    objK = new wz1(zS, vs1Var);
                    ux2Var2.g0(objK);
                }
                kh.c(zF, (Function0) objK, ux2Var2, 0, 0);
                boolean z2 = vs1Var instanceof rz1;
                if (z2) {
                    ux2Var2.W(-1815587213);
                    f(strZ, (rz1) vs1Var, fs4Var5, ux2Var2, (i3 << 3) & 1008);
                    ux2Var2.p(false);
                    fs4Var4 = fs4Var5;
                } else {
                    ux2Var2.W(-1815375855);
                    if (vs1Var.F()) {
                        ux2Var2.W(495630391);
                        ud5VarT = lv1.T(R.drawable.ic_arrow_back, ux2Var2, 0);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1815281585);
                        ux2Var2.p(false);
                        ud5VarT = null;
                    }
                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                    int iHashCode = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL = ux2Var2.l();
                    int i7 = i3;
                    fs4 fs4VarS = uf0.s(ux2Var2, fs4Var5);
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
                    fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    boolean zS2 = S(vs1Var);
                    List listK = ea2.m;
                    if (zS2 || z2) {
                        fs4Var3 = fs4VarC;
                        fs4Var4 = fs4Var5;
                    } else {
                        if (vs1Var instanceof pz1) {
                            Function0 function0 = ((pz1) vs1Var).h;
                            if (function0 != null) {
                                fs4Var3 = fs4VarC;
                                listK = qf0.K(new l08(new yk7(R.drawable.ic_edit), true, y57.g(R.string.tv_device_edit_title), function0));
                            } else {
                                fs4Var3 = fs4VarC;
                            }
                        } else {
                            fs4Var3 = fs4VarC;
                            if (vs1Var instanceof qz1) {
                                qz1 qz1Var = (qz1) vs1Var;
                                listK = qf0.K(new l08(new yk7(R.drawable.ic_checkmark), qz1Var.g, y57.g(R.string.tv_save_check_mark), qz1Var.f));
                            } else if (vs1Var instanceof oz1) {
                                fs4Var4 = fs4Var5;
                                final byte b = 3;
                                listK = qf0.K(new l08(new yk7(R.drawable.ic_edit), ((oz1) vs1Var).h, y57.g(R.string.tv_contact_edit_title), new Function0() { // from class: o.vz1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        byte b2 = b;
                                        f88 f88Var = f88.a;
                                        vs1 vs1Var2 = vs1Var;
                                        switch (b2) {
                                            case 0:
                                                ((nz1) vs1Var2).f.a();
                                                break;
                                            case 1:
                                                ((tz1) vs1Var2).h.a();
                                                break;
                                            case 2:
                                                ((sz1) vs1Var2).i.a();
                                                break;
                                            default:
                                                ((oz1) vs1Var2).i.a();
                                                break;
                                        }
                                        return f88Var;
                                    }
                                }));
                            } else {
                                fs4Var4 = fs4Var5;
                                if (vs1Var instanceof nz1) {
                                    final byte b2 = 0;
                                    listK = qf0.K(new l08(new yk7(R.drawable.ic_checkmark), ((nz1) vs1Var).g, y57.g(R.string.tv_save_check_mark), new Function0() { // from class: o.vz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object a() {
                                            byte b3 = b2;
                                            f88 f88Var = f88.a;
                                            vs1 vs1Var2 = vs1Var;
                                            switch (b3) {
                                                case 0:
                                                    ((nz1) vs1Var2).f.a();
                                                    break;
                                                case 1:
                                                    ((tz1) vs1Var2).h.a();
                                                    break;
                                                case 2:
                                                    ((sz1) vs1Var2).i.a();
                                                    break;
                                                default:
                                                    ((oz1) vs1Var2).i.a();
                                                    break;
                                            }
                                            return f88Var;
                                        }
                                    }));
                                } else if (vs1Var instanceof tz1) {
                                    final byte b3 = 1;
                                    listK = qf0.K(new l08(new yk7(R.drawable.ic_edit), true, y57.g(R.string.service_queue_more_actions_edit_session), new Function0() { // from class: o.vz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object a() {
                                            byte b4 = b3;
                                            f88 f88Var = f88.a;
                                            vs1 vs1Var2 = vs1Var;
                                            switch (b4) {
                                                case 0:
                                                    ((nz1) vs1Var2).f.a();
                                                    break;
                                                case 1:
                                                    ((tz1) vs1Var2).h.a();
                                                    break;
                                                case 2:
                                                    ((sz1) vs1Var2).i.a();
                                                    break;
                                                default:
                                                    ((oz1) vs1Var2).i.a();
                                                    break;
                                            }
                                            return f88Var;
                                        }
                                    }));
                                } else if (!(vs1Var instanceof sz1)) {
                                    gk0.s();
                                    return;
                                } else {
                                    final byte b4 = 2;
                                    listK = qf0.K(new l08(new yk7(R.drawable.ic_checkmark), ((sz1) vs1Var).g, y57.g(R.string.tv_save_check_mark), new Function0() { // from class: o.vz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object a() {
                                            byte b5 = b4;
                                            f88 f88Var = f88.a;
                                            vs1 vs1Var2 = vs1Var;
                                            switch (b5) {
                                                case 0:
                                                    ((nz1) vs1Var2).f.a();
                                                    break;
                                                case 1:
                                                    ((tz1) vs1Var2).h.a();
                                                    break;
                                                case 2:
                                                    ((sz1) vs1Var2).i.a();
                                                    break;
                                                default:
                                                    ((oz1) vs1Var2).i.a();
                                                    break;
                                            }
                                            return f88Var;
                                        }
                                    }));
                                }
                            }
                        }
                        fs4Var4 = fs4Var5;
                    }
                    bm2 bm2Var = db8.E;
                    boolean zG2 = (i6 == 4 || ((i7 & 8) != 0 && ux2Var2.h(vs1Var))) | ux2Var2.g(zS);
                    Object objK2 = ux2Var2.K();
                    if (zG2 || objK2 == awVar) {
                        objK2 = new wz1(vs1Var, zS);
                        ux2Var2.g0(objK2);
                    }
                    x67.c(strZ, (Function0) objK2, fs4Var3, ud5VarT, listK, null, bm2Var, ux2Var2, 4480, 336);
                    if (zS) {
                        ux2Var2.W(2019830591);
                        st5.a(androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(ka0.F(ya0.a.a(cs4Var, xz2.t), 0.0f, 0.0f, 16.0f, 0.0f, 11), 24.0f), "TVTA-devicesScreen-editSaveLoadingIndicator"), ((tf2) ux2Var2.j(vf2.a)).l, 2.0f, 0L, 0, 0.0f, ux2Var, 384, 56);
                        ux2Var2 = ux2Var;
                        z = false;
                        ux2Var2.p(false);
                    } else {
                        z = false;
                        ux2Var2.W(2020288027);
                        ux2Var2.p(false);
                    }
                    ux2Var2.p(true);
                    ux2Var2.p(z);
                }
                fs4Var2 = fs4Var4;
            }
            throw fx3.m(495610450, ux2Var2, false);
        }
        ux2Var2.Q();
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new j31(vs1Var, fs4Var2, i, i2);
        }
    }

    public static final e87 c0(du4 du4Var, ux2 ux2Var) {
        return K(((rn4) ux2Var.j(un4.a)).d, du4Var);
    }

    public static final void d(boolean z, fs4 fs4Var, ux2 ux2Var, int i) {
        boolean z2;
        ux2 ux2Var2;
        ux2Var.Y(1759548851);
        byte b = 4;
        int i2 = (ux2Var.g(z) ? 4 : 2) | i | 48;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            z2 = z;
            ux2Var2 = ux2Var;
            fm7.a(m77.z(R.string.tv_options_EULA_link, ux2Var), m77.z(R.string.web_view_error, ux2Var), cs4Var, new dm7(62), z2, null, "TVTA-settings-eula", ux2Var2, 1576320 | ((i2 << 12) & 57344), 32);
            fs4Var = cs4Var;
        } else {
            z2 = z;
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new vh(z2, fs4Var, i, b);
        }
    }

    public static final void e(fs4 fs4Var, xy6 xy6Var, Function1 function1, Function0 function0, m13 m13Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        xy6 xy6Var2;
        xy6 xy6VarR;
        int i2;
        ux2Var.Y(673998059);
        int i3 = i | 22 | (ux2Var.h(function1) ? 256 : 128) | (ux2Var.h(function0) ? 2048 : 1024) | (ux2Var.d(m13Var == null ? -1 : m13Var.ordinal()) ? 16384 : 8192);
        if (ux2Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                xy6VarR = yo1.R(null, ux2Var, 6, 2);
                i2 = i3 & (-113);
                fs4Var2 = cs4.b;
            } else {
                ux2Var.Q();
                xy6VarR = xy6Var;
                i2 = i3 & (-113);
                fs4Var2 = fs4Var;
            }
            ux2Var.q();
            Object objK = ux2Var.K();
            byte b = 14;
            if (objK == e01.a) {
                objK = new ji2(b);
                ux2Var.g0(objK);
            }
            yo1.k(function0, cp6.a(fs4Var2, false, (Function1) objK), xy6VarR, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-482870327, new sd(m13Var, function1, (byte) 4), ux2Var), ux2Var, (i2 >> 9) & 14, 3072, 8184);
            xy6Var2 = xy6VarR;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6Var2 = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new o31(fs4Var2, xy6Var2, function1, function0, (Enum) m13Var, i, (byte) 4);
        }
    }

    public static final void f(String str, rz1 rz1Var, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        ud5 ud5VarT;
        ux2Var.Y(1688961641);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? ux2Var.f(rz1Var) : ux2Var.h(rz1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            if (rz1Var.f) {
                ux2Var.W(-405494286);
                ud5VarT = lv1.T(R.drawable.ic_arrow_back, ux2Var, 0);
                ux2Var.p(false);
            } else {
                ux2Var.W(314624500);
                ux2Var.p(false);
                ud5VarT = null;
            }
            ud5 ud5Var = ud5VarT;
            bm2 bm2Var = db8.E;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(fs4Var, "TVTA-TVTopAppBar");
            pd5 pd5Var = n08.a;
            h72 h72Var = vf2.a;
            qr.d(au8.O(-1336695771, new qa(str, (byte) 2), ux2Var), fs4VarA, au8.O(1233663203, new c9((Object) ud5Var, (Object) rz1Var, (byte) 21), ux2Var), au8.O(-370155366, new b9((Object) rz1Var, (byte) 6), ux2Var), 0.0f, bm2Var, n08.b(((tf2) ux2Var.j(h72Var)).k, ((tf2) ux2Var.j(h72Var)).l, ((tf2) ux2Var.j(h72Var)).l, ((tf2) ux2Var.j(h72Var)).l, ux2Var, 34), ux2Var, 3462);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) str, (Object) rz1Var, (Object) fs4Var, i, (byte) 9);
        }
    }

    public static kj2 g(wg5 wg5Var, sj2 sj2Var, String str, d46 d46Var, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            d46Var = null;
        }
        return new kj2(wg5Var, sj2Var, str, d46Var);
    }

    public static final void h(String str, String str2, Function0 function0, ux2 ux2Var, int i) {
        ux2Var.Y(-57099938);
        int i2 = i | (ux2Var.f(str) ? 4 : 2) | (ux2Var.h(function0) ? 256 : 128);
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.b.b(iq8.j(androidx.compose.foundation.layout.b.l(cs4Var, 24.0f), sf6.a), false, null, null, function0, 15), str2);
            do4 do4VarC = ua0.c(xz2.s, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarA);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(do4VarC, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            td3.b(lv1.T(R.drawable.ic_info, ux2Var, 0), str, androidx.compose.foundation.layout.b.l(cs4Var, 16.0f), ((rn4) ux2Var.j(un4.a)).a.s, ux2Var, 392 | ((i2 << 3) & 112), 0);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new f9((byte) 9, i, str, str2, function0, false);
        }
    }

    public static vq3 i(Function1 function1) {
        qp3 qp3Var = rp3.d;
        qp3Var.getClass();
        aq3 aq3Var = new aq3();
        dq3 dq3Var = qp3Var.a;
        boolean z = dq3Var.b;
        aq3Var.a = dq3Var.a;
        String str = dq3Var.c;
        String str2 = dq3Var.d;
        fs0 fs0Var = dq3Var.f;
        boolean z2 = dq3Var.e;
        wj5 wj5Var = qp3Var.b;
        boolean z3 = dq3Var.g;
        function1.invoke(aq3Var);
        if (!str.equals("    ")) {
            hk0.g("Indent should not be specified when default printing mode is used");
            return null;
        }
        dq3 dq3Var2 = new dq3(aq3Var.a, z, str, str2, z2, fs0Var, z3);
        wj5Var.getClass();
        return new vq3(dq3Var2, wj5Var);
    }

    public static final void j(Object obj, int i, u34 u34Var, yy0 yy0Var, ux2 ux2Var, int i2) {
        int i3;
        ux2Var.Y(872548579);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.h(u34Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zF = ux2Var.f(obj) | ux2Var.f(u34Var);
            Object objK = ux2Var.K();
            Object obj2 = e01.a;
            if (zF || objK == obj2) {
                objK = new t34(obj, u34Var);
                ux2Var.g0(objK);
            }
            t34 t34Var = (t34) objK;
            t34Var.c = i;
            bg5 bg5Var = t34Var.g;
            zw5 zw5Var = hl5.a;
            t34 t34Var2 = (t34) ux2Var.j(zw5Var);
            n47 n47VarC = el5.c();
            Function1 function1E = n47VarC != null ? n47VarC.e() : null;
            n47 n47VarF = el5.f(n47VarC);
            try {
                if (t34Var2 != ((t34) bg5Var.getValue())) {
                    bg5Var.setValue(t34Var2);
                    if (t34Var.d > 0) {
                        t34 t34Var3 = t34Var.e;
                        if (t34Var3 != null) {
                            t34Var3.b();
                        }
                        if (t34Var2 != null) {
                            t34Var2.a();
                        } else {
                            t34Var2 = null;
                        }
                        t34Var.e = t34Var2;
                    }
                }
                el5.h(n47VarC, n47VarF, function1E);
                boolean zF2 = ux2Var.f(t34Var);
                Object objK2 = ux2Var.K();
                if (zF2 || objK2 == obj2) {
                    objK2 = new fj3((Object) t34Var, (byte) 2);
                    ux2Var.g0(objK2);
                }
                ck3.e(t34Var, (Function1) objK2, ux2Var);
                j51.l(zw5Var.a(t34Var), yy0Var, ux2Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                el5.h(n47VarC, n47VarF, function1E);
                throw th;
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new na2(obj, i, u34Var, yy0Var, i2);
        }
    }

    public static final void k(int i, String str, ux2 ux2Var, fs4 fs4Var) {
        fs4 fs4Var2;
        ux2Var.Y(1442619733);
        int i2 = (ux2Var.f(str) ? 4 : 2) | i | 48;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = ka0.C(cs4Var, 16.0f, 8.0f);
            h72 h72Var = un4.a;
            qs7.b(str, fs4VarC, ((rn4) ux2Var.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var.j(h72Var)).b.i, ux2Var, i2 & 14, 24960, 110584);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gx0(str, fs4Var2, i, (byte) 8);
        }
    }

    public static final void l(SupportSession supportSession, lt6 lt6Var, fs4 fs4Var, String str, ux2 ux2Var, int i) {
        int i2;
        supportSession.getClass();
        ux2Var.Y(-1553212759);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(supportSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(lt6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(str) ? 2048 : 1024;
        }
        int i3 = i2;
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            hk6 hk6VarW = im3.W(ux2Var);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = ck3.w(ux2Var);
                ux2Var.g0(objK);
            }
            fs4 fs4VarB = ka0.B(o77.t(fs4Var, hk6VarW, (me1) objK), 16.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarB);
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
            cs4 cs4Var = cs4.b;
            int i4 = (i3 & 14) | 48;
            n(supportSession, androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7), "TVTA-devicesScreen-sessionInfoScreen-header"), ux2Var, i4);
            q(supportSession, androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7), "TVTA-devicesScreen-sessionInfoScreen-options"), lt6Var.a, lt6Var.c, lt6Var.b, ux2Var, i4);
            m(((i3 >> 3) & 896) | i4, supportSession, str, ux2Var, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-sessionInfoScreen-details"));
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new p5((Object) supportSession, (Object) lt6Var, (Object) fs4Var, (Object) str, i, (byte) 13);
        }
    }

    public static final void m(int i, SupportSession supportSession, String str, ux2 ux2Var, fs4 fs4Var) {
        int i2;
        boolean z;
        int i3;
        int i4;
        String string;
        ux2Var.Y(151694743);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(supportSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(str) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            bw bwVar = iq8.c;
            w50 w50Var = xz2.A;
            kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
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
            k(0, m77.z(R.string.session_info_details_title, ux2Var), ux2Var, null);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarD = ka0.D(au8.s(iq8.j(ka0.C(cs4Var, 16.0f, 8.0f), sf6.a(8.0f)), ((rn4) ux2Var.j(un4.a)).a.H, kh.V), 0.0f, 8.0f, 1);
            kw0 kw0VarA2 = iw0.a(bwVar, w50Var, ux2Var, 0);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarD);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA2, iz0Var, ux2Var);
            o67.n(yj5VarL2, iz0Var2, ux2Var);
            e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS2, iz0Var4, ux2Var);
            String strZ = m77.z(R.string.session_info_assign_to, ux2Var);
            String strA = (str == null || (string = ub7.x0(str).toString()) == null || string.length() <= 0) ? null : string;
            if (supportSession.getAssignedAccountId() == 0) {
                i3 = 1210524547;
                i4 = R.string.field_empty;
                z = false;
            } else {
                if (strA == null || !im3.n(supportSession.getAssignedToMe(), Boolean.TRUE)) {
                    z = false;
                    if (strA != null) {
                        ux2Var.W(1210816877);
                        ux2Var.p(false);
                    } else if (im3.n(supportSession.getAssignedToMe(), Boolean.TRUE)) {
                        i3 = 1210901166;
                        i4 = R.string.service_queue_assigned_to_myself;
                    } else {
                        i3 = 1210999405;
                        i4 = R.string.service_queue_assigned_to_contact;
                    }
                } else {
                    ux2Var.W(1210657196);
                    strA = m77.A(R.string.service_queue_assigned_to_current_user, new Object[]{strA}, ux2Var);
                    ux2Var.p(false);
                }
                o(384, strZ, strA, ux2Var, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-sessionInfoScreen-details-assignment"));
                o(384, m77.z(R.string.session_info_session_code, ux2Var), qs1.M(String.valueOf(supportSession.getSessioncode())), ux2Var, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-sessionInfoScreen-details-sessioncode"));
                o(384, m77.z(R.string.session_info_end_user_email, ux2Var), supportSession.getEmail(), ux2Var, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-sessionInfoScreen-details-email"));
                o(384, m77.z(R.string.description_title, ux2Var), supportSession.getDescription(), ux2Var, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-sessionInfoScreen-details-description"));
                ux2Var.p(true);
                ux2Var.p(true);
            }
            strA = to7.m(ux2Var, i3, i4, ux2Var, z);
            o(384, strZ, strA, ux2Var, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-sessionInfoScreen-details-assignment"));
            o(384, m77.z(R.string.session_info_session_code, ux2Var), qs1.M(String.valueOf(supportSession.getSessioncode())), ux2Var, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-sessionInfoScreen-details-sessioncode"));
            o(384, m77.z(R.string.session_info_end_user_email, ux2Var), supportSession.getEmail(), ux2Var, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-sessionInfoScreen-details-email"));
            o(384, m77.z(R.string.description_title, ux2Var), supportSession.getDescription(), ux2Var, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-sessionInfoScreen-details-description"));
            ux2Var.p(true);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new us6(supportSession, fs4Var, str, i);
        }
    }

    public static final void n(SupportSession supportSession, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        g38 g38Var;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1425825951);
        if ((i & 6) == 0) {
            i2 = i | (ux2Var2.h(supportSession) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.f(fs4Var) ? 32 : 16;
        }
        if (ux2Var2.N(i2 & 1, (i2 & 19) != 18)) {
            int i3 = gt6.a[supportSession.getRecipientStatus().ordinal()];
            if (i3 == 1) {
                ux2Var2.W(-124163787);
                String strZ = m77.z(R.string.user_waiting, ux2Var2);
                h72 h72Var = vf2.a;
                g38Var = new g38(strZ, new rv0(((tf2) ux2Var2.j(h72Var)).b), new rv0(((tf2) ux2Var2.j(h72Var)).c));
                ux2Var2.p(false);
            } else {
                if (i3 != 2) {
                    throw fx3.m(-124166029, ux2Var2, false);
                }
                ux2Var2.W(-124156363);
                String strZ2 = m77.z(R.string.user_not_joined, ux2Var2);
                h72 h72Var2 = un4.a;
                g38Var = new g38(strZ2, new rv0(((rn4) ux2Var2.j(h72Var2)).a.G), new rv0(((rn4) ux2Var2.j(h72Var2)).a.q));
                ux2Var2.p(false);
            }
            String str = (String) g38Var.m;
            long j = ((rv0) g38Var.n).a;
            long j2 = ((rv0) g38Var.f855o).a;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
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
            hi7 hi7Var = hi7.Size72dp;
            cs4 cs4Var = cs4.b;
            nv1.i(supportSession, hi7Var, ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), ux2Var2, (i2 & 14) | 432);
            String name = supportSession.getName();
            if (name == null || ub7.b0(name)) {
                name = null;
            }
            if (name == null) {
                name = to7.m(ux2Var2, -1526709148, R.string.session_default_name, ux2Var2, false);
            } else {
                ux2Var2.W(-1526710512);
                ux2Var2.p(false);
            }
            h72 h72Var3 = un4.a;
            qs7.b(name, androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), "TVTA-devicesScreen-sessionInfoScreen-name"), ((rn4) ux2Var2.j(h72Var3)).a.q, 0L, null, 0L, new qo7(3), 0L, 2, false, 2, 0, null, ((rn4) ux2Var2.j(h72Var3)).b.f, ux2Var, 48, 24960, 109560);
            qs7.b(str, androidx.compose.ui.platform.a.a(ka0.C(au8.s(iq8.j(cs4Var, sf6.a(8.0f)), j, kh.V), 12.0f, 4.0f), "TVTA-devicesScreen-sessionInfoScreen-chip-userStatus"), j2, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var.j(h72Var3)).b.f952o, ux2Var, 0, 24960, 110584);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new pa((byte) 12, i, (Object) supportSession, (Object) fs4Var);
        }
    }

    public static final void o(int i, String str, String str2, ux2 ux2Var, fs4 fs4Var) {
        String strM;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-2084758572);
        int i2 = i | (ux2Var2.f(str) ? 4 : 2) | (ux2Var2.f(str2) ? 32 : 16);
        if (ux2Var2.N(i2 & 1, (i2 & 147) != 146)) {
            fs4 fs4VarC = ka0.C(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), 16.0f, 8.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
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
            h72 h72Var = un4.a;
            qs7.b(str, null, ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.n, ux2Var2, i2 & 14, 0, 131066);
            if (str2 == null) {
                strM = to7.m(ux2Var2, -923888306, R.string.field_empty, ux2Var2, false);
            } else {
                ux2Var2.W(-923888554);
                ux2Var2.p(false);
                strM = str2;
            }
            qs7.b(strM, null, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.j, ux2Var2, 0, 0, 131066);
            ux2Var2 = ux2Var2;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new z71(str, str2, fs4Var, i, (byte) 1);
        }
    }

    public static final void p(int i, String str, fs4 fs4Var, boolean z, Function0 function0, ux2 ux2Var, int i2, int i3) {
        boolean z2;
        int i4;
        boolean z3;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1034482449);
        int i5 = i2 | (ux2Var2.d(i) ? 4 : 2) | (ux2Var2.f(str) ? 32 : 16) | (ux2Var2.f(fs4Var) ? 256 : 128);
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i4 = i5 | (ux2Var2.g(z2) ? 2048 : 1024);
        }
        int i7 = i4 | (ux2Var2.h(function0) ? 16384 : 8192);
        if (ux2Var2.N(i7 & 1, (i7 & 9363) != 9362)) {
            if (i6 != 0) {
                z2 = true;
            }
            kw0 kw0VarA = iw0.a(iq8.c, xz2.B, ux2Var2, 48);
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
            int i8 = i7 >> 3;
            xo1.k(function0, androidx.compose.foundation.layout.b.l(ka0.F(cs4.b, 0.0f, 0.0f, 0.0f, 3.0f, 7), 40.0f), z2, d82.o(ux2Var2).a(ep1.r(ux2Var2).L, ep1.r(ux2Var2).q, rv0.b(0.38f, ep1.r(ux2Var2).L), rv0.b(0.38f, ep1.r(ux2Var2).q)), sf6.a, au8.O(-2142882429, new hq1(i, str, z2), ux2Var2), ux2Var2, (i8 & 896) | ((i7 >> 12) & 14) | 1572912, 16);
            boolean z4 = z2;
            qs7.b(str, null, rv0.b(z4 ? 1.0f : 0.38f, ep1.r(ux2Var).q), 0L, null, 0L, new qo7(3), 0L, 2, false, 1, 0, null, ep1.s(ux2Var).f952o, ux2Var, i8 & 14, 24960, 109562);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            z3 = z4;
        } else {
            ux2Var2.Q();
            z3 = z2;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new za0(i, str, fs4Var, z3, function0, i2, i3);
        }
    }

    public static final void q(SupportSession supportSession, fs4 fs4Var, Function0 function0, Function0 function1, Function0 function2, ux2 ux2Var, int i) {
        SupportSession supportSession2;
        int i2;
        ux2Var.Y(-1675004168);
        byte b = 2;
        if ((i & 6) == 0) {
            supportSession2 = supportSession;
            i2 = (ux2Var.h(supportSession2) ? 4 : 2) | i;
        } else {
            supportSession2 = supportSession;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.h(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.h(function2) ? 16384 : 8192;
        }
        if (ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
            dg6 dg6VarA = cg6.a(new ew(8.0f, new hk0(b)), xz2.y, ux2Var, 54);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
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
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(eg6.a(cs4Var, 1.0f), "TVTA-devicesScreen-sessionInfoScreen-startSessionAction");
            String strZ = m77.z(R.string.session_start, ux2Var);
            boolean zN = im3.n(supportSession2.getAssignedToMe(), Boolean.TRUE);
            boolean z = (i2 & 896) == 256;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (z || objK == awVar) {
                objK = new yv1(function0, (byte) 26);
                ux2Var.g0(objK);
            }
            int i3 = i2;
            p(R.drawable.ic_start_session_arrow, strZ, fs4VarA, zN, (Function0) objK, ux2Var, 0, 0);
            fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(eg6.a(cs4Var, 1.0f), "TVTA-devicesScreen-sessionInfoScreen-shareSessionAction");
            String strZ2 = m77.z(R.string.service_queue_share_session_title, ux2Var);
            boolean z2 = (i3 & 7168) == 2048;
            Object objK2 = ux2Var.K();
            if (z2 || objK2 == awVar) {
                objK2 = new yv1(function1, (byte) 27);
                ux2Var.g0(objK2);
            }
            p(R.drawable.ic_share, strZ2, fs4VarA2, false, (Function0) objK2, ux2Var, 0, 8);
            fs4 fs4VarA3 = androidx.compose.ui.platform.a.a(eg6.a(cs4Var, 1.0f), "TVTA-devicesScreen-sessionInfoScreen-moreAction");
            String strZ3 = m77.z(R.string.device_tab_session_details_option_more_actions, ux2Var);
            boolean z3 = (i3 & 57344) == 16384;
            Object objK3 = ux2Var.K();
            if (z3 || objK3 == awVar) {
                objK3 = new yv1(function2, (byte) 28);
                ux2Var.g0(objK3);
            }
            p(R.drawable.ic_more, strZ3, fs4VarA3, false, (Function0) objK3, ux2Var, 0, 8);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a50(supportSession, fs4Var, function0, function1, function2, i);
        }
    }

    public static final void r(int i, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        fs4 fs4Var2;
        function0.getClass();
        ux2Var.Y(-997045595);
        byte b = 2;
        int i2 = (ux2Var.h(function0) ? 4 : 2) | i | 48;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            yy0 yy0VarO = au8.O(924884717, new cu6(function0, b), ux2Var);
            yy0 yy0Var = hm3.m;
            yy0 yy0Var2 = hm3.n;
            int i3 = (i2 & 14) | 1769904;
            fs4Var2 = cs4.b;
            uf0.b(function0, yy0VarO, fs4Var2, null, yy0Var, yy0Var2, null, 0L, 0L, 0L, 0L, null, ux2Var, i3, 0, 16280);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new x71(function0, fs4Var2, i, (byte) 4);
        }
    }

    public static final void s(List list, m13 m13Var, fs4 fs4Var, Function1 function1, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        iz0 iz0Var = d82.t;
        iz0 iz0Var2 = d82.w;
        iz0 iz0Var3 = d82.u;
        iz0 iz0Var4 = d82.v;
        ux2Var2.Y(-620054384);
        int i2 = i | (ux2Var2.f(list) ? 4 : 2) | (ux2Var2.d(m13Var == null ? -1 : m13Var.ordinal()) ? 32 : 16) | 384 | (ux2Var2.h(function1) ? 2048 : 1024);
        if (ux2Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
            h72 h72Var = un4.a;
            long j = ((rn4) ux2Var2.j(h72Var)).a.a;
            long j2 = ((rn4) ux2Var2.j(h72Var)).a.a;
            long j3 = rv0.h;
            int i3 = i2;
            boolean z = false;
            k06 k06VarZ = z(j, j2, j3, j3, ux2Var2);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var2, cs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z2 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z2) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, iz0Var4, ux2Var2);
            o67.n(yj5VarL, iz0Var3, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), iz0Var2, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, iz0Var, ux2Var2);
            ux2Var2.W(462062361);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l13 l13Var = (l13) it.next();
                fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                boolean z3 = l13Var.b == m13Var ? true : z;
                pe6 pe6Var = new pe6(3);
                int i4 = i3;
                boolean zF = ((i4 & 7168) == 2048) | ux2Var2.f(l13Var);
                Object objK = ux2Var2.K();
                if (zF || objK == e01.a) {
                    objK = new ql1(function1, l13Var, (byte) 9);
                    ux2Var2.g0(objK);
                }
                fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.C(g68.A(fs4VarC, z3, pe6Var, (Function0) objK), 24.0f, 16.0f), l13Var.d);
                dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarA);
                yz0.c.getClass();
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(dg6VarA, iz0Var4, ux2Var2);
                o67.n(yj5VarL2, iz0Var3, ux2Var2);
                o67.n(Integer.valueOf(iHashCode2), iz0Var2, ux2Var2);
                o67.l(ux2Var2);
                o67.n(fs4VarS2, iz0Var, ux2Var2);
                s14 s14Var = new s14(1.0f, true);
                String str = l13Var.a;
                h72 h72Var2 = un4.a;
                iz0 iz0Var5 = iz0Var;
                iz0 iz0Var6 = iz0Var2;
                tg3 tg3Var2 = tg3Var;
                iz0 iz0Var7 = iz0Var4;
                cs4 cs4Var2 = cs4Var;
                qs7.b(str, s14Var, ((rn4) ux2Var2.j(h72Var2)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var2)).b.j, ux2Var, 0, 0, 131064);
                bt1.j(l13Var.b == m13Var, null, false, k06VarZ, ux2Var, 48, 44);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                iz0Var4 = iz0Var7;
                iz0Var = iz0Var5;
                iz0Var2 = iz0Var6;
                cs4Var = cs4Var2;
                tg3Var = tg3Var2;
                i3 = i4;
                z = false;
            }
            ux2Var2.p(z);
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) list, (Object) m13Var, fs4Var2, (Object) function1, i, (byte) 9);
        }
    }

    public static final Object t(qi0 qi0Var, hc1 hc1Var) {
        gl0 gl0Var = new gl0(1, vt1.A(hc1Var));
        gl0Var.t();
        gl0Var.v(new zy3(qi0Var, (byte) 0));
        qi0Var.b0(new ek0(gl0Var, (byte) 1));
        return gl0Var.q();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object u(gt5 gt5Var, Function0 function0, jc1 jc1Var) {
        et5 et5Var;
        if (jc1Var instanceof et5) {
            et5Var = (et5) jc1Var;
            int i = et5Var.f741o;
            if ((i & Integer.MIN_VALUE) != 0) {
                et5Var.f741o = i - Integer.MIN_VALUE;
            } else {
                et5Var = new et5(jc1Var);
            }
        } else {
            et5Var = new et5(jc1Var);
        }
        Object obj = et5Var.n;
        int i2 = et5Var.f741o;
        try {
            if (i2 == 0) {
                ct1.a0(obj);
                if (et5Var.getContext().l0(z06.z) != gt5Var) {
                    hk0.l("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                et5Var.m = function0;
                et5Var.f741o = 1;
                gl0 gl0Var = new gl0(1, vt1.A(et5Var));
                gl0Var.t();
                gt5Var.g0(new t(gl0Var, (byte) 27));
                Object objQ = gl0Var.q();
                ne1 ne1Var = ne1.m;
                if (objQ == ne1Var) {
                    return ne1Var;
                }
            } else {
                if (i2 != 1) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function0 = et5Var.m;
                ct1.a0(obj);
            }
            function0.a();
            return f88.a;
        } catch (Throwable th) {
            function0.a();
            throw th;
        }
    }

    public static final Object v(qi0 qi0Var, hc1 hc1Var) {
        gl0 gl0Var = new gl0(1, vt1.A(hc1Var));
        gl0Var.t();
        gl0Var.v(new zy3(qi0Var, (byte) 1));
        qi0Var.b0(new ek0(gl0Var, (byte) 2));
        return gl0Var.q();
    }

    public static final void x(int i) {
        if (i >= 1) {
            return;
        }
        gk0.h(fx3.e(i, "Expected positive parallelism level, but got "));
    }

    public static int y(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, eq.f(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static k06 z(long j, long j2, long j3, long j4, ux2 ux2Var) {
        zv0 zv0Var = ((rn4) ux2Var.j(un4.a)).a;
        k06 k06Var = zv0Var.f0;
        if (k06Var == null) {
            k06 k06Var2 = new k06(bw0.b(zv0Var, au8.P0), bw0.b(zv0Var, au8.Q0), rv0.b(0.38f, bw0.b(zv0Var, au8.M0)), rv0.b(0.38f, bw0.b(zv0Var, au8.N0)));
            zv0Var.f0 = k06Var2;
            k06Var = k06Var2;
        }
        return new k06(j != 16 ? j : k06Var.a, j2 != 16 ? j2 : k06Var.b, j3 != 16 ? j3 : k06Var.c, j4 != 16 ? j4 : k06Var.d);
    }

    public void T(int i) {
    }

    public abstract void U(Typeface typeface);

    public void w(final int i) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.hc6
            @Override // java.lang.Runnable
            public final void run() {
                this.m.T(i);
            }
        });
    }
}
