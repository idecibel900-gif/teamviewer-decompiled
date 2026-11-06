package o;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Proxy;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class au8 {
    public static final float A;
    public static final aw0 A0;
    public static final aw0 B;
    public static final aw0 B0;
    public static final float C;
    public static final aw0 C0;
    public static final aw0 D;
    public static final aw0 D0;
    public static final float E;
    public static final aw0 E0;
    public static final aw0 F;
    public static final aw0 F0;
    public static final float G;
    public static final aw0 G0;
    public static final aw0 H;
    public static final aw0 H0;
    public static final float I;
    public static final aw0 I0;
    public static final aw0 J;
    public static final aw0 J0;
    public static final aw0 K;
    public static final aw0 K0;
    public static final aw0 L;
    public static final aw0 L0;
    public static final aw0 M;
    public static final aw0 M0;
    public static final aw0 N;
    public static final aw0 N0;
    public static final aw0 O;
    public static final float O0;
    public static final aw0 P;
    public static final aw0 P0;
    public static final aw0 Q;
    public static final aw0 Q0;
    public static final aw0 R;
    public static final hr2 R0;
    public static final aw0 S;
    public static final aw0 S0;
    public static final aw0 T;
    public static final float T0;
    public static final aw0 U;
    public static final char[] U0;
    public static final aw0 V;
    public static volatile Context V0;
    public static final aw0 W;
    public static final aw0 X;
    public static final aw0 Y;
    public static final aw0 Z;
    public static final yy0 a;
    public static final aw0 a0;
    public static final aw0 b0;
    public static final aw0 c0;
    public static final aw0 d0;
    public static final int[] e0;
    public static final yy0 f;
    public static final int[] f0;
    public static final yy0 g;
    public static final int[] g0;
    public static final yy0 h;
    public static final int[] h0;
    public static final yy0 i;
    public static final aw0 i0;
    public static final yy0 j;
    public static final ax6 j0;
    public static final aw0 k;
    public static final aw0 k0;
    public static final i68 l;
    public static final aw0 l0;
    public static final aw0 m;
    public static final aw0 m0;
    public static final ax6 n;
    public static final aw0 n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final aw0 f364o;
    public static final aw0 o0;
    public static final i68 p;
    public static final aw0 p0;
    public static final aw0 q;
    public static final aw0 q0;
    public static final i68 r;
    public static final aw0 r0;
    public static final aw0 s;
    public static final aw0 s0;
    public static final aw0 t;
    public static final aw0 t0;
    public static final aw0 u;
    public static final aw0 u0;
    public static final aw0 v;
    public static final aw0 v0;
    public static final ax6 w;
    public static final aw0 w0;
    public static final aw0 x;
    public static final aw0 x0;
    public static final float y;
    public static final aw0 y0;
    public static final aw0 z;
    public static final aw0 z0;
    public static final yy0 b = new yy0(636288403, false, new dz0(0));
    public static final yy0 c = new yy0(-1357803046, false, new dz0(1));
    public static final yy0 d = new yy0(-489887388, false, new fz0(9));
    public static final yy0 e = new yy0(1629163587, false, new fz0(10));

    static {
        byte b2 = 16;
        a = new yy0(810150602, false, new p20(b2));
        byte b3 = 11;
        f = new yy0(-546752734, false, new fz0(b3));
        byte b4 = 12;
        g = new yy0(1572298241, false, new fz0(b4));
        h = new yy0(-561597274, false, new gz0(b3));
        i = new yy0(-1812092954, false, new gz0(b4));
        j = new yy0(679232162, false, new iz0(b2));
        aw0 aw0Var = aw0.y;
        k = aw0Var;
        l = i68.q;
        m = aw0.F;
        n = ax6.m;
        aw0 aw0Var2 = aw0.t;
        f364o = aw0Var2;
        p = i68.p;
        aw0 aw0Var3 = aw0.u;
        q = aw0Var3;
        r = i68.n;
        s = aw0.B;
        t = aw0Var3;
        u = aw0Var;
        v = aw0.G;
        w = ax6.p;
        x = aw0Var2;
        y = 0.38f;
        z = aw0Var2;
        A = 0.38f;
        B = aw0Var2;
        C = 0.38f;
        D = aw0Var2;
        E = 0.38f;
        F = aw0Var2;
        G = 0.38f;
        H = aw0Var2;
        I = 0.38f;
        aw0 aw0Var4 = aw0.m;
        J = aw0Var4;
        K = aw0Var4;
        L = aw0Var2;
        M = aw0Var4;
        N = aw0Var3;
        O = aw0Var4;
        P = aw0Var4;
        Q = aw0Var;
        R = aw0Var2;
        S = aw0Var;
        T = aw0Var3;
        U = aw0Var3;
        V = aw0Var3;
        W = aw0Var2;
        X = aw0Var3;
        Y = aw0Var3;
        Z = aw0Var3;
        a0 = aw0Var3;
        b0 = aw0Var3;
        c0 = aw0Var3;
        d0 = aw0Var3;
        e0 = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        f0 = new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
        g0 = new int[]{3, 6};
        h0 = new int[]{1, 2, 4, 5, 7, 8};
        i0 = aw0Var;
        j0 = ax6.f371o;
        k0 = aw0Var2;
        l0 = aw0Var2;
        m0 = aw0Var2;
        n0 = aw0Var2;
        o0 = aw0Var2;
        p0 = aw0Var2;
        q0 = aw0Var4;
        r0 = aw0Var2;
        s0 = aw0Var4;
        t0 = aw0Var3;
        u0 = aw0Var4;
        v0 = aw0Var4;
        w0 = aw0Var4;
        x0 = aw0Var2;
        y0 = aw0Var;
        z0 = aw0Var3;
        A0 = aw0Var;
        B0 = aw0Var3;
        C0 = aw0Var3;
        D0 = aw0Var2;
        E0 = aw0Var3;
        F0 = aw0Var3;
        G0 = aw0Var3;
        H0 = aw0Var3;
        I0 = aw0Var3;
        J0 = aw0.w;
        K0 = aw0Var3;
        L0 = aw0Var3;
        M0 = aw0Var2;
        N0 = aw0Var2;
        O0 = 20.0f;
        P0 = aw0Var;
        Q0 = aw0Var3;
        R0 = new hr2("NO_VALUE", (byte) 14);
        S0 = aw0Var3;
        T0 = 0.38f;
        U0 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static final go2 A(vx6 vx6Var, de1 de1Var, int i2, df0 df0Var) {
        return ((i2 == 0 || i2 == -3) && df0Var == df0.m) ? vx6Var : new bn0(vx6Var, de1Var, i2, df0Var);
    }

    public static final String B(X509Certificate x509Certificate) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(x509Certificate.getEncoded());
        bArrDigest.getClass();
        return cx.Y0(bArrDigest, "", new t2((byte) 18), 30);
    }

    public static final String[] C(String str) {
        List listN0 = ub7.n0(str, new String[]{","}, 6);
        Set setH1 = cx.h1(new String[]{"CN", "C", "O", "OU"});
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = listN0.iterator();
        while (it.hasNext()) {
            String string = ub7.x0((String) it.next()).toString();
            int iY = ub7.Y(string, '=', 0, 6);
            if (iY > 0) {
                String upperCase = ub7.v0(iY, string).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                String strSubstring = string.substring(iY + 1);
                if (setH1.contains(upperCase)) {
                    Object arrayList = linkedHashMap.get(upperCase);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(upperCase, arrayList);
                    }
                    ((List) arrayList).add(strSubstring);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : qf0.L("CN", "C", "O", "OU")) {
            List list = (List) linkedHashMap.get(str2);
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(str2 + "=" + ((String) it2.next()));
                }
            }
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }

    public static final de1 D(ze6 ze6Var, jc1 jc1Var) {
        if (!ze6Var.j()) {
            fc1 fc1Var = ze6Var.a;
            if (fc1Var != null) {
                return fc1Var.m;
            }
            im3.e0("coroutineScope");
            throw null;
        }
        if (jc1Var.getContext().l0(w08.m) != null) {
            io.sentry.h2.f();
            return null;
        }
        fc1 fc1Var2 = ze6Var.a;
        if (fc1Var2 != null) {
            return fc1Var2.m;
        }
        im3.e0("coroutineScope");
        throw null;
    }

    public static final boolean E(int i2, int i3, String str) {
        str.getClass();
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && po8.k(str.charAt(i2 + 1)) != -1 && po8.k(str.charAt(i4)) != -1;
    }

    public static final fs4 F(fs4 fs4Var, cj cjVar, j64 j64Var, pr7 pr7Var) {
        return fs4Var.f(new s54(cjVar, j64Var, pr7Var));
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0362  */
    /* JADX WARN: Code duplicated, block: B:153:0x0373  */
    /* JADX WARN: Code duplicated, block: B:175:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[LOOP:1: B:86:0x0233->B:177:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0159  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x0220  */
    /* JADX WARN: Code duplicated, block: B:88:0x0239  */
    public static final Object G(oz3 oz3Var, c58 c58Var, iw2 iw2Var) {
        ps5 ps5VarT;
        ps5 ps5VarR;
        boolean z2;
        it2 it2VarG;
        js0 js0VarG;
        Object nt3Var;
        List list;
        Iterator it;
        ot3 ot3Var;
        boolean z3;
        ns4 ns4Var;
        nt3 nt3Var2;
        oz3 oz3Var2;
        c58 c58Var2;
        Object objG;
        int iOrdinal;
        um2 um2VarL;
        xz2 xz2Var = xz2.Y;
        oz3Var.getClass();
        boolean z4 = c58Var.c;
        iw2Var.getClass();
        ys0 ys0VarA = oz3Var.o0().a();
        hx2 hx2VarH = ys0VarA != null ? wo1.H(ys0VarA) : null;
        gx2 gx2Var = gx2.c;
        if (im3.n(hx2VarH, gx2Var)) {
            gw4 gw4Var = ng7.a;
            ys0 ys0VarA2 = oz3Var.o0().a();
            im3.n(ys0VarA2 != null ? wo1.H(ys0VarA2) : null, gx2Var);
            wy3 wy3VarM = n37.m(oz3Var);
            up annotations = oz3Var.getAnnotations();
            oz3 oz3VarN = wo1.N(oz3Var);
            List listG = wo1.G(oz3Var);
            List listO = wo1.O(oz3Var);
            ArrayList arrayList = new ArrayList(mv0.Z(listO, 10));
            Iterator it2 = listO.iterator();
            while (it2.hasNext()) {
                arrayList.add(((h58) it2.next()).b());
            }
            g48.n.getClass();
            g48 g48Var = g48.f858o;
            k48 k48VarQ = ng7.a.q();
            wo1.P(oz3Var);
            oz3 oz3VarB = ((h58) lv0.v0(oz3Var.m0())).b();
            oz3VarB.getClass();
            ArrayList arrayListB0 = lv0.B0(arrayList, bt1.P(qf0.K(new w87(oz3VarB)), g48Var, k48VarQ, false));
            g07 g07VarO = n37.m(oz3Var).o();
            g07VarO.getClass();
            return G(wo1.B(wy3VarM, annotations, oz3VarN, listG, arrayListB0, g07VarO, false).s0(oz3Var.p0()), c58Var, iw2Var);
        }
        g07 g07VarM = db8.m(oz3Var);
        if (g07VarM == null && ((um2VarL = db8.l(oz3Var)) == null || (g07VarM = db8.h0(um2VarL)) == null)) {
            g07VarM = db8.m(oz3Var);
            g07VarM.getClass();
        }
        k48 k48VarK0 = db8.K0(g07VarM);
        if (db8.M(k48VarK0)) {
            k48VarK0.getClass();
            if (k48VarK0 instanceof k48) {
                ys0 ys0VarA3 = k48VarK0.a();
                ys0VarA3.getClass();
                ps5VarT = wy3.t((ns4) ys0VarA3);
            } else {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(k48VarK0);
                sb.append(", ");
                gk0.h(ua5.o(w86.a, k48VarK0.getClass(), sb));
                ps5VarT = null;
            }
            if (ps5VarT != null) {
                switch (ps5VarT.ordinal()) {
                    case 0:
                        ot3Var = pt3.a;
                        break;
                    case 1:
                        ot3Var = pt3.b;
                        break;
                    case 2:
                        ot3Var = pt3.c;
                        break;
                    case 3:
                        ot3Var = pt3.d;
                        break;
                    case 4:
                        ot3Var = pt3.e;
                        break;
                    case 5:
                        ot3Var = pt3.f;
                        break;
                    case 6:
                        ot3Var = pt3.g;
                        break;
                    case 7:
                        ot3Var = pt3.h;
                        break;
                    default:
                        gk0.s();
                        return null;
                }
                if (db8.X(oz3Var)) {
                    z3 = true;
                } else {
                    ht2 ht2Var = tr3.p;
                    ht2Var.getClass();
                    if (db8.F(oz3Var, ht2Var)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                nt3Var = g77.f(ot3Var, z3);
            } else {
                k48VarK0.getClass();
                if (k48VarK0 instanceof k48) {
                    ys0 ys0VarA4 = k48VarK0.a();
                    ys0VarA4.getClass();
                    ps5VarR = wy3.r((ns4) ys0VarA4);
                } else {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(k48VarK0);
                    sb2.append(", ");
                    gk0.h(ua5.o(w86.a, k48VarK0.getClass(), sb2));
                    ps5VarR = null;
                }
                if (ps5VarR != null) {
                    ts3 ts3Var = (ts3) ts3.z.get(ps5VarR);
                    if (ts3Var == null) {
                        ts3.a(6);
                        throw null;
                    }
                    nt3Var = z06.t("[".concat(ts3Var.f2139o));
                } else {
                    k48VarK0.getClass();
                    if (k48VarK0 instanceof k48) {
                        ys0 ys0VarA5 = k48VarK0.a();
                        if (ys0VarA5 != null && wy3.I(ys0VarA5)) {
                            z2 = true;
                        }
                        if (z2) {
                            k48VarK0.getClass();
                            if (k48VarK0 instanceof k48) {
                                ys0 ys0VarA6 = k48VarK0.a();
                                ys0VarA6.getClass();
                                int i2 = bp1.a;
                                it2VarG = zo1.g((ns4) ys0VarA6);
                                it2VarG.getClass();
                            } else {
                                StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                                sb3.append(k48VarK0);
                                sb3.append(", ");
                                gk0.h(ua5.o(w86.a, k48VarK0.getClass(), sb3));
                                it2VarG = null;
                            }
                            String str = mo3.a;
                            js0VarG = mo3.g(it2VarG);
                            if (js0VarG == null) {
                                nt3Var = null;
                            } else {
                                if (!c58Var.g && ((list = mo3.n) == null || !list.isEmpty())) {
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((lo3) it.next()).a.equals(js0VarG)) {
                                                nt3Var = null;
                                            }
                                        }
                                    }
                                }
                                nt3Var = new nt3(fs3.e(js0VarG));
                            }
                        } else {
                            nt3Var = null;
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb4.append(k48VarK0);
                        sb4.append(", ");
                        gk0.h(ua5.o(w86.a, k48VarK0.getClass(), sb4));
                    }
                    z2 = false;
                    if (z2) {
                        k48VarK0.getClass();
                        if (k48VarK0 instanceof k48) {
                            ys0 ys0VarA7 = k48VarK0.a();
                            ys0VarA7.getClass();
                            int i3 = bp1.a;
                            it2VarG = zo1.g((ns4) ys0VarA7);
                            it2VarG.getClass();
                        } else {
                            StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb5.append(k48VarK0);
                            sb5.append(", ");
                            gk0.h(ua5.o(w86.a, k48VarK0.getClass(), sb5));
                            it2VarG = null;
                        }
                        String str2 = mo3.a;
                        js0VarG = mo3.g(it2VarG);
                        if (js0VarG == null) {
                            nt3Var = null;
                        } else {
                            if (!c58Var.g) {
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((lo3) it.next()).a.equals(js0VarG)) {
                                            nt3Var = null;
                                        }
                                    }
                                }
                            }
                            nt3Var = new nt3(fs3.e(js0VarG));
                        }
                    } else {
                        nt3Var = null;
                    }
                }
            }
        } else {
            nt3Var = null;
        }
        if (nt3Var != null) {
            Object objF = g77.f(nt3Var, c58Var.a);
            iw2Var.d(oz3Var, objF, c58Var);
            return objF;
        }
        k48 k48VarO0 = oz3Var.o0();
        if (k48VarO0 instanceof zl3) {
            zl3 zl3Var = (zl3) k48VarO0;
            oz3 oz3Var3 = zl3Var.a;
            if (oz3Var3 != null) {
                return G(n37.t(oz3Var3), c58Var, iw2Var);
            }
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: ".concat(lv0.t0(zl3Var.b, null, null, null, null, 63)));
        }
        ys0 ys0VarA8 = k48VarO0.a();
        if (ys0VarA8 == null) {
            an4.u(oz3Var, "no descriptor for type constructor of ");
            return null;
        }
        if (hd2.f(ys0VarA8)) {
            return new nt3("error/NonExistentClass");
        }
        boolean z5 = ys0VarA8 instanceof ns4;
        if (z5 && wy3.y(oz3Var)) {
            if (oz3Var.m0().size() != 1) {
                yq4.r("arrays must have one type argument");
                return null;
            }
            h58 h58Var = (h58) oz3Var.m0().get(0);
            oz3 oz3VarB2 = h58Var.b();
            oz3VarB2.getClass();
            if (h58Var.a() == ub8.p) {
                objG = new nt3("java/lang/Object");
            } else {
                ub8 ub8VarA = h58Var.a();
                ub8VarA.getClass();
                if (z4 || ((iOrdinal = ub8VarA.ordinal()) == 0 ? (c58Var2 = c58Var.i) == null : !(iOrdinal == 1 ? (c58Var2 = c58Var.h) != null : (c58Var2 = c58Var.f) != null))) {
                    c58Var2 = c58Var;
                }
                objG = G(oz3VarB2, c58Var2, iw2Var);
            }
            return z06.t("[".concat(z06.v((pt3) objG)));
        }
        if (!z5) {
            if (ys0VarA8 instanceof d58) {
                oz3 oz3VarN2 = n37.n((d58) ys0VarA8);
                if (oz3Var.p0()) {
                    oz3VarN2 = p58.h(oz3VarN2, true);
                }
                return G(oz3VarN2, c58Var, dk0.f630o);
            }
            if ((ys0VarA8 instanceof eq1) && c58Var.j) {
                return G(((eq1) ys0VarA8).E0(), c58Var, iw2Var);
            }
            an4.u(oz3Var, "Unknown type ");
            return null;
        }
        if (pi3.b(ys0VarA8) && !c58Var.b && (oz3Var2 = (oz3) vt1.o(oz3Var, new HashSet())) != null) {
            return G(oz3Var2, new c58(c58Var.a, true, c58Var.c, c58Var.d, c58Var.e, c58Var.f, c58Var.g, c58Var.h, c58Var.i, 512), iw2Var);
        }
        if (z4) {
            sy4 sy4Var = wy3.e;
            if (wy3.b((ns4) ys0VarA8, s87.Q)) {
                nt3Var2 = new nt3("java/lang/Class");
            } else {
                ns4Var = (ns4) ys0VarA8;
                ns4Var.a().getClass();
                if (ns4Var.i0() == ms0.p) {
                    fi1 fi1VarI = ns4Var.i();
                    fi1VarI.getClass();
                    ns4Var = (ns4) fi1VarI;
                }
                ns4 ns4VarN0 = ns4Var.a();
                ns4VarN0.getClass();
                nt3Var2 = new nt3(w(ns4VarN0, xz2Var));
            }
        } else {
            ns4Var = (ns4) ys0VarA8;
            ns4Var.a().getClass();
            if (ns4Var.i0() == ms0.p) {
                fi1 fi1VarI2 = ns4Var.i();
                fi1VarI2.getClass();
                ns4Var = (ns4) fi1VarI2;
            }
            ns4 ns4VarN1 = ns4Var.a();
            ns4VarN1.getClass();
            nt3Var2 = new nt3(w(ns4VarN1, xz2Var));
        }
        iw2Var.d(oz3Var, nt3Var2, c58Var);
        return nt3Var2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    public static long H(int i2, String str) {
        int iY = y(0, i2, str, false);
        Matcher matcher = wc1.n.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iZ = -1;
        int i6 = -1;
        int i7 = -1;
        while (iY < i2) {
            int iY2 = y(iY + 1, i2, str, true);
            matcher.region(iY, iY2);
            if (i4 == -1 && matcher.usePattern(wc1.n).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i4 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i6 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i7 = Integer.parseInt(strGroup3);
            } else if (i5 == -1 && matcher.usePattern(wc1.m).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i5 = Integer.parseInt(strGroup4);
            } else if (iZ == -1) {
                Pattern pattern = wc1.l;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iZ = ub7.Z(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i3 != -1 && matcher.usePattern(wc1.k).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i3 = Integer.parseInt(strGroup6);
                }
            } else if (i3 != -1) {
            }
            iY = y(iY2 + 1, i2, str, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            hk0.g("Failed requirement.");
            return 0L;
        }
        if (iZ == -1) {
            hk0.g("Failed requirement.");
            return 0L;
        }
        if (1 > i5 || i5 >= 32) {
            hk0.g("Failed requirement.");
            return 0L;
        }
        if (i4 < 0 || i4 >= 24) {
            hk0.g("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            hk0.g("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            hk0.g("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(ro8.a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, iZ - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final fk3 I(String str, String str2, int i2, Function1 function1) {
        char cCharAt = str.charAt(i2);
        if (((Boolean) function1.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return J(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i2);
    }

    public static final fk3 J(String str, String str2) {
        return new fk3(str2 + " when parsing an Instant from \"" + V(64, str) + '\"', str);
    }

    public static final int K(int i2, String str) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    public static String L(String str, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z2 = (i4 & 4) == 0;
        str.getClass();
        int iCharCount = i2;
        while (iCharCount < i3) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                bf0 bf0Var = new bf0();
                bf0Var.Y0(i2, iCharCount, str);
                while (iCharCount < i3) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i5 = iCharCount + 2) < i3) {
                        int iK = po8.k(str.charAt(iCharCount + 1));
                        int iK2 = po8.k(str.charAt(i5));
                        if (iK == -1 || iK2 == -1) {
                            bf0Var.a1(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            bf0Var.U0((iK << 4) + iK2);
                            iCharCount = Character.charCount(iCodePointAt) + i5;
                        }
                    } else if (iCodePointAt == 43 && z2) {
                        bf0Var.U0(32);
                        iCharCount++;
                    } else {
                        bf0Var.a1(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return bf0Var.N0();
            }
            iCharCount++;
        }
        return str.substring(i2, i3);
    }

    public static final Object M(ze6 ze6Var, boolean z2, boolean z3, Function1 function1) {
        ze6Var.getClass();
        ze6Var.a();
        if (!ze6Var.j() || ze6Var.k() || ze6Var.h.get() == null) {
            return ds1.g0(new fg1(function1, null, ze6Var, z2, z3));
        }
        hk0.l("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object N(ze6 ze6Var, boolean z2, yb8 yb8Var, jc1 jc1Var) {
        hg1 hg1Var;
        if (jc1Var instanceof hg1) {
            hg1Var = (hg1) jc1Var;
            int i2 = hg1Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hg1Var.q = i2 - Integer.MIN_VALUE;
            } else {
                hg1Var = new hg1(jc1Var);
            }
        } else {
            hg1Var = new hg1(jc1Var);
        }
        Object objD = hg1Var.p;
        int i3 = hg1Var.q;
        Object obj = ne1.m;
        if (i3 == 0) {
            ct1.a0(objD);
            if (ze6Var.j() && ze6Var.m() && ze6Var.k()) {
                ig1 ig1Var = new ig1(yb8Var, null, ze6Var, z2);
                hg1Var.q = 1;
                Object objQ = ze6Var.q(z2, ig1Var, hg1Var);
                if (objQ != obj) {
                    return objQ;
                }
            } else {
                hg1Var.m = ze6Var;
                hg1Var.n = yb8Var;
                hg1Var.f970o = z2;
                hg1Var.q = 2;
                objD = D(ze6Var, hg1Var);
                if (objD != obj) {
                }
            }
        }
        if (i3 == 1) {
            ct1.a0(objD);
            return objD;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                ct1.a0(objD);
                return objD;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = hg1Var.f970o;
        yb8Var = hg1Var.n;
        ze6Var = hg1Var.m;
        ct1.a0(objD);
        gg1 gg1Var = new gg1(yb8Var, (hc1) null, ze6Var, z2);
        hg1Var.m = null;
        hg1Var.n = null;
        hg1Var.q = 3;
        Object objJ0 = im3.j0((de1) objD, gg1Var, hg1Var);
        return objJ0 == obj ? obj : objJ0;
    }

    public static final yy0 O(int i2, pw2 pw2Var, ux2 ux2Var) {
        Object objK = ux2Var.K();
        if (objK == e01.a) {
            objK = new yy0(i2, true, pw2Var);
            ux2Var.g0(objK);
        }
        yy0 yy0Var = (yy0) objK;
        if (!yy0Var.f2654o.equals(pw2Var)) {
            yy0Var.f2654o = pw2Var;
            if (yy0Var.n) {
                j56 j56Var = yy0Var.p;
                if (j56Var != null) {
                    s01 s01Var = j56Var.a;
                    if (s01Var != null) {
                        s01Var.s(j56Var, null);
                    }
                    yy0Var.p = null;
                }
                ArrayList arrayList = yy0Var.q;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        j56 j56Var2 = (j56) arrayList.get(i3);
                        s01 s01Var2 = j56Var2.a;
                        if (s01Var2 != null) {
                            s01Var2.s(j56Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return yy0Var;
    }

    public static final sb0 P(ux2 ux2Var) {
        zw5 zw5Var = un4.a;
        long j2 = ((rn4) ux2Var.j(zw5Var)).a.B;
        long j3 = ((rn4) ux2Var.j(zw5Var)).a.r;
        boolean zE = ux2Var.e(j2) | ux2Var.e(j3);
        Object objK = ux2Var.K();
        Object obj = e01.a;
        if (zE || objK == obj) {
            objK = qf0.L(new rv0(j2), new rv0(j3), new rv0(j2));
            ux2Var.g0(objK);
        }
        List list = (List) objK;
        rh3 rh3VarK = nv1.k(nv1.G("shimmer", ux2Var, 0), 0.0f, 1000.0f, db8.J(db8.I0(1200, 2, q72.c), 4), "shimmerOffset", ux2Var, 29112, 0);
        float fFloatValue = ((Number) rh3VarK.f1923o.getValue()).floatValue();
        bg5 bg5Var = rh3VarK.f1923o;
        boolean zC = ux2Var.c(fFloatValue) | ux2Var.f(list);
        Object objK2 = ux2Var.K();
        if (zC || objK2 == obj) {
            float fFloatValue2 = ((Number) bg5Var.getValue()).floatValue();
            float fFloatValue3 = ((Number) bg5Var.getValue()).floatValue();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue3)) & 4294967295L);
            float fFloatValue4 = ((Number) bg5Var.getValue()).floatValue() + 200.0f;
            float fFloatValue5 = ((Number) bg5Var.getValue()).floatValue() + 200.0f;
            Object t94Var = new t94(list, null, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fFloatValue4)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue5)) & 4294967295L), 0);
            ux2Var.g0(t94Var);
            objK2 = t94Var;
        }
        return (sb0) objK2;
    }

    public static final void Q(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static final String R(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            } else {
                S(sb2, sb);
                sb.append(cCharAt);
            }
        }
        S(sb2, sb);
        return ub7.x0(sb.toString()).toString();
    }

    public static final void S(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() == 0) {
            return;
        }
        if (sb.length() > 2) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < sb.length()) {
                int i4 = i3 + 1;
                sb2.append(sb.charAt(i2));
                if (i3 < sb.length() - 1) {
                    sb2.append(' ');
                }
                i2++;
                i3 = i4;
            }
        } else {
            sb2.append((CharSequence) sb);
        }
        sb.setLength(0);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    public static final zt0 T(xo xoVar) {
        List list = xoVar.f2540o;
        ea2 ea2Var = ea2.m;
        List list2 = list == null ? ea2Var : list;
        CharSequence charSequence = xoVar.n;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            xk1 xk1Var = new xk1((byte) 14, false);
            xk1Var.n = Parcel.obtain();
            if (list == null) {
                list = ea2Var;
            }
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                wo woVar = (wo) list.get(i2);
                c77 c77Var = (c77) woVar.a;
                int i3 = woVar.b;
                int i4 = woVar.c;
                ((Parcel) xk1Var.n).recycle();
                xk1Var.n = Parcel.obtain();
                bs7 bs7Var = c77Var.a;
                long j2 = c77Var.l;
                long j3 = c77Var.h;
                long j4 = c77Var.b;
                List list3 = list;
                int i5 = size;
                long jB = bs7Var.b();
                SpannableString spannableString2 = spannableString;
                int i6 = i2;
                long j5 = rv0.h;
                if (!z68.a(jB, j5)) {
                    xk1Var.N((byte) 1);
                    ((Parcel) xk1Var.n).writeLong(c77Var.a.b());
                }
                long j6 = qt7.c;
                byte b2 = 2;
                if (!qt7.a(j4, j6)) {
                    xk1Var.N((byte) 2);
                    xk1Var.P(j4);
                }
                ms2 ms2Var = c77Var.c;
                if (ms2Var != null) {
                    xk1Var.N((byte) 3);
                    ((Parcel) xk1Var.n).writeInt(ms2Var.m);
                }
                ks2 ks2Var = c77Var.d;
                if (ks2Var != null) {
                    int i7 = ks2Var.a;
                    xk1Var.N((byte) 4);
                    xk1Var.N((i7 != 0 && i7 == 1) ? (byte) 1 : (byte) 0);
                }
                ls2 ls2Var = c77Var.e;
                if (ls2Var != null) {
                    int i8 = ls2Var.a;
                    xk1Var.N((byte) 5);
                    if (i8 == 0) {
                        b2 = 0;
                    } else if (i8 == 65535) {
                        b2 = 1;
                    } else if (i8 != 1) {
                        if (i8 == 2) {
                            b2 = 3;
                        } else {
                            b2 = 0;
                        }
                    }
                    xk1Var.N(b2);
                }
                String str = c77Var.g;
                if (str != null) {
                    xk1Var.N((byte) 6);
                    ((Parcel) xk1Var.n).writeString(str);
                }
                if (!qt7.a(j3, j6)) {
                    xk1Var.N((byte) 7);
                    xk1Var.P(j3);
                }
                h40 h40Var = c77Var.i;
                if (h40Var != null) {
                    float f2 = h40Var.a;
                    xk1Var.N((byte) 8);
                    xk1Var.O(f2);
                }
                cs7 cs7Var = c77Var.j;
                if (cs7Var != null) {
                    xk1Var.N((byte) 9);
                    xk1Var.O(cs7Var.a);
                    xk1Var.O(cs7Var.b);
                }
                if (!z68.a(j2, j5)) {
                    xk1Var.N((byte) 10);
                    ((Parcel) xk1Var.n).writeLong(j2);
                }
                vp7 vp7Var = c77Var.m;
                if (vp7Var != null) {
                    xk1Var.N((byte) 11);
                    ((Parcel) xk1Var.n).writeInt(vp7Var.a);
                }
                lw6 lw6Var = c77Var.n;
                if (lw6Var != null) {
                    xk1Var.N((byte) 12);
                    ((Parcel) xk1Var.n).writeLong(lw6Var.a);
                    long j7 = lw6Var.b;
                    xk1Var.O(Float.intBitsToFloat((int) (j7 >> 32)));
                    xk1Var.O(Float.intBitsToFloat((int) (j7 & 4294967295L)));
                    xk1Var.O(lw6Var.c);
                }
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) xk1Var.n).marshall(), 0)), i3, i4, 33);
                i2 = i6 + 1;
                spannableString = spannableString2;
                list = list3;
                size = i5;
            }
            charSequence = spannableString;
        }
        return new zt0(ClipData.newPlainText("plain text", charSequence));
    }

    public static final CharSequence U(CharSequence charSequence) {
        if (charSequence.length() <= 5000) {
            return charSequence;
        }
        return (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? ub7.u0(4999, charSequence) : ub7.u0(5000, charSequence);
    }

    public static final String V(int i2, String str) {
        if (str.length() <= i2) {
            return str.toString();
        }
        return str.subSequence(0, i2).toString() + "...";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable] */
    public static final X509Certificate W(CertificateFactory certificateFactory, byte[] bArr, String str) throws Exception {
        ?? E1;
        if (bArr.length == 0) {
            hk0.g(str.concat(": empty DER"));
            return null;
        }
        try {
            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
            certificateGenerateCertificate.getClass();
            return (X509Certificate) certificateGenerateCertificate;
        } catch (Exception e2) {
            if (16 < bArr.length) {
                E1 = new ArrayList(16);
                int i2 = 0;
                for (byte b2 : bArr) {
                    E1.add(Byte.valueOf(b2));
                    i2++;
                    if (i2 == 16) {
                        break;
                    }
                }
            } else {
                E1 = cx.e1(bArr);
            }
            String strT0 = lv0.t0(E1, " ", null, null, new t2((byte) 19), 30);
            int length = bArr.length;
            String simpleName = e2.getClass().getSimpleName();
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(str);
            sb.append(": failed to parse X509 (len=");
            sb.append(length);
            sb.append(", prefix=");
            sb.append(strT0);
            ye4.c("AndroidKeyChainHandler", e41.m(sb, "): ", simpleName, ": ", message));
            throw e2;
        }
    }

    public static final void a(ea0 ea0Var, l33 l33Var, List list, ib ibVar, hb hbVar, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        gb gbVar;
        ea0Var.getClass();
        list.getClass();
        ibVar.getClass();
        List list2 = ibVar.f;
        function0.getClass();
        ux2Var.Y(439842258);
        int i3 = i2 | (ux2Var.d(ea0Var.ordinal()) ? 4 : 2) | (ux2Var.h(l33Var) ? 32 : 16) | (ux2Var.f(list) ? 256 : 128) | (ux2Var.f(ibVar) ? 2048 : 1024) | (ux2Var.h(hbVar) ? 16384 : 8192) | (ux2Var.h(function0) ? 131072 : 65536) | 1572864;
        if (ux2Var.N(i3 & 1, (599187 & i3) != 599186)) {
            boolean zH = ((i3 & 7168) == 2048) | ux2Var.h(l33Var) | ux2Var.h(hbVar);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (zH || objK == awVar) {
                k9 k9Var = new k9(ibVar, l33Var, hbVar, null, (byte) 1);
                ux2Var.g0(k9Var);
                objK = k9Var;
            }
            ck3.i(f88.a, (hw2) objK, ux2Var);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4Var2 = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var2);
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
            if (ibVar.b) {
                gbVar = gb.n;
            } else if (ibVar.a) {
                gbVar = (list2.isEmpty() || !ibVar.h) ? gb.m : gb.p;
            } else {
                gbVar = gb.f877o;
            }
            int iOrdinal = gbVar.ordinal();
            byte b2 = 6;
            if (iOrdinal == 0) {
                ux2Var.W(227380131);
                Object objK2 = ux2Var.K();
                if (objK2 == awVar) {
                    objK2 = new t2(b2);
                    ux2Var.g0(objK2);
                }
                im3.a(ea0Var, null, (Function1) objK2, null, "AddRemoteDeviceToYourAccountContent", null, O(1001272404, new ya(ibVar, hbVar, l33Var, list, function0), ux2Var), ux2Var, (i3 & 14) | 1597824);
                ux2Var.p(false);
            } else if (iOrdinal == 1) {
                ux2Var.W(229409019);
                k(ka0.F(fs4Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), ux2Var, 6);
                ux2Var.p(false);
            } else if (iOrdinal == 2) {
                ux2Var.W(229619261);
                jx0.e(((i3 >> 12) & 112) | 384, m77.z(R.string.add_managed_device_no_permission, ux2Var), function0, ux2Var, ka0.F(fs4Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                ux2Var.p(false);
            } else {
                if (iOrdinal != 3) {
                    throw fx3.m(145880195, ux2Var, false);
                }
                ux2Var.W(229979450);
                jx0.e(((i3 >> 12) & 112) | 384, jx0.f(list2, ux2Var), function0, ux2Var, ka0.F(fs4Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                ux2Var.p(false);
            }
            ux2Var.p(true);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new za(ea0Var, l33Var, list, ibVar, hbVar, function0, fs4Var2, i2, (byte) 0);
        }
    }

    public static final void b(final ib ibVar, hb hbVar, final l33 l33Var, final boolean z2, final Function0 function0, fs4 fs4Var, ux2 ux2Var, final int i2) {
        Function0 function1;
        hb hbVar2;
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(1637332336);
        int i3 = (ux2Var2.f(ibVar) ? 4 : 2) | i2 | (ux2Var2.h(hbVar) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= ux2Var2.h(l33Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var2.g(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            function1 = function0;
            i3 |= ux2Var2.h(function1) ? 16384 : 8192;
        } else {
            function1 = function0;
        }
        int i4 = i3 | 196608;
        if (ux2Var2.N(i4 & 1, (74899 & i4) != 74898)) {
            bw bwVar = iq8.c;
            w50 w50Var = xz2.A;
            kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4Var2 = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var2, fs4Var2);
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
            hk6 hk6VarW = im3.W(ux2Var2);
            Object objK = ux2Var2.K();
            if (objK == e01.a) {
                objK = ck3.w(ux2Var2);
                ux2Var2.g0(objK);
            }
            fs4 fs4VarF = ka0.F(o77.t(fs4Var2, hk6VarW, (me1) objK).f(new s14(1.0f, false)), 16.0f, 16.0f, 16.0f, 0.0f, 8);
            kw0 kw0VarA2 = iw0.a(bwVar, w50Var, ux2Var2, 0);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarF);
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
            int i5 = i4 >> 6;
            g(l33Var, ka0.F(fs4Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), ux2Var2, (i5 & 14) | 48);
            j(ibVar, hbVar, l33Var, z2, function1, null, ux2Var2, i4 & 65534);
            ux2Var2 = ux2Var2;
            hbVar2 = hbVar;
            ux2Var2.p(true);
            e(ibVar, hbVar2.e, function0, ka0.F(fs4Var2, 16.0f, 16.0f, 16.0f, 0.0f, 8), ux2Var2, (i4 & 14) | (i5 & 896));
            ux2Var2.p(true);
        } else {
            hbVar2 = hbVar;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            final hb hbVar3 = hbVar2;
            final fs4 fs4Var3 = fs4Var2;
            j56VarR.d = new hw2() { // from class: o.cb
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    au8.b(ibVar, hbVar3, l33Var, z2, function0, fs4Var3, (ux2) obj, yo1.Y(i2 | 1));
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v15 */
    public static final void c(Function0 function0, g80 g80Var, iw2 iw2Var, ux2 ux2Var, int i2) {
        g80 g80Var2;
        iw2 iw2Var2;
        g80 g80Var3;
        boolean z2;
        Object m9Var;
        k76 k76Var;
        ?? r10;
        Object obj;
        Object obj2;
        Object obj3;
        dj5 cs5Var;
        function0.getClass();
        ux2Var.Y(-1898608847);
        int i3 = (ux2Var.h(function0) ? 4 : 2) | i2 | 144;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            ux2Var.S();
            if ((i2 & 1) == 0 || ux2Var.x()) {
                df6 df6Var = kh.f0;
                if (df6Var == null) {
                    im3.e0("factory");
                    throw null;
                }
                og1 og1Var = new og1((byte) 1);
                q0 q0Var = new q0(df6Var, (byte) 16);
                x86 x86Var = w86.a;
                og1Var.a(x86Var.b(g80.class), q0Var);
                fi3 fi3VarC = og1Var.c();
                we8 we8VarA = id4.a(ux2Var);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    g80 g80Var4 = (g80) g57.t(x86Var.b(g80.class), we8VarA, null, fi3VarC, h57.k(we8VarA), ux2Var);
                    iw2Var2 = hm3.k;
                    g80Var3 = g80Var4;
                }
            } else {
                ux2Var.Q();
                g80Var3 = g80Var;
                iw2Var2 = iw2Var;
            }
            ux2Var.q();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ux2Var.j(dd4.a);
            h72 h72Var = lh.b;
            Context context = (Context) ux2Var.j(h72Var);
            Object[] objArr = new Object[0];
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            Object obj4 = objK;
            if (objK == awVar) {
                zq zqVar = new zq((byte) 19);
                ux2Var.g0(zqVar);
                obj4 = zqVar;
            }
            px4 px4Var = (px4) zu1.L(objArr, (Function0) obj4, ux2Var, 48);
            k76 k76Var2 = new k76();
            if (Build.VERSION.SDK_INT >= 31) {
                ux2Var.W(-1031196391);
                ux2Var.W(923020361);
                ux2Var.W(1537041123);
                Object objK2 = ux2Var.K();
                if (objK2 == awVar) {
                    obj2 = objK2;
                    le5 le5Var = new le5((byte) 3);
                    ux2Var.g0(le5Var);
                    obj2 = le5Var;
                }
                obj2 = objK2;
                Function1 function1 = (Function1) obj2;
                ux2Var.p(false);
                ux2Var.W(-1732095526);
                boolean zBooleanValue = ((Boolean) ux2Var.j(xj3.a)).booleanValue();
                fj5 fj5Var = fj5.a;
                if (zBooleanValue) {
                    lifecycleOwner = lifecycleOwner;
                    z2 = false;
                    cs5Var = new cs5("android.permission.BLUETOOTH_CONNECT", fj5Var);
                } else {
                    ux2Var.W(1424240517);
                    Context context2 = (Context) ux2Var.j(h72Var);
                    ux2Var.W(1134374053);
                    Object objK3 = ux2Var.K();
                    if (objK3 == awVar) {
                        ex4 ex4Var = new ex4("android.permission.BLUETOOTH_CONNECT", context2, lv1.I(context2));
                        ux2Var.g0(ex4Var);
                        obj3 = ex4Var;
                    } else {
                        obj3 = objK3;
                    }
                    ex4 ex4Var2 = (ex4) obj3;
                    ux2Var.p(false);
                    lv1.s(ex4Var2, null, ux2Var, 0);
                    e8 e8Var = new e8((byte) 2);
                    ux2Var.W(1134386901);
                    boolean zF = ux2Var.f(ex4Var2) | ux2Var.f(function1);
                    Object objK4 = ux2Var.K();
                    Object obj5 = objK4;
                    if (zF || objK4 == awVar) {
                        o43 o43Var = new o43(ex4Var2, function1, (byte) 17);
                        ux2Var.g0(o43Var);
                        obj5 = o43Var;
                    }
                    ux2Var.p(false);
                    qk4 qk4VarX0 = db8.x0(e8Var, (Function1) obj5, ux2Var);
                    ux2Var.W(1134391322);
                    boolean zF2 = ux2Var.f(ex4Var2) | ux2Var.h(qk4VarX0);
                    Object objK5 = ux2Var.K();
                    Object obj6 = objK5;
                    if (zF2 || objK5 == awVar) {
                        uw4 uw4Var = new uw4(ex4Var2, qk4VarX0, (byte) 2);
                        ux2Var.g0(uw4Var);
                        obj6 = uw4Var;
                    }
                    z2 = false;
                    ux2Var.p(false);
                    ck3.d(ex4Var2, qk4VarX0, (Function1) obj6, ux2Var);
                    ux2Var.p(false);
                    cs5Var = ex4Var2;
                }
                ux2Var.p(z2);
                ux2Var.p(z2);
                k76Var2.m = cs5Var;
                gj5 status = cs5Var.getStatus();
                status.getClass();
                px4Var.setValue(Boolean.valueOf(status.equals(fj5Var)));
                ux2Var.p(z2);
            } else {
                lifecycleOwner = lifecycleOwner;
                z2 = false;
                ux2Var.W(-1031019567);
                ux2Var.p(false);
            }
            String str = (String) g80Var3.f870o.getValue();
            if (str == null) {
                ux2Var.W(-1030947989);
                ux2Var.p(z2);
                k76Var = k76Var2;
                awVar = awVar;
            } else {
                ux2Var.W(-1030947988);
                Integer numValueOf = Integer.valueOf(R.string.tv_switch_to_bluetooth_headset_title);
                String strA = m77.A(R.string.tv_switch_to_bluetooth_headset, new Object[]{str}, ux2Var);
                boolean zH = ux2Var.h(g80Var3);
                Object objK6 = ux2Var.K();
                if (zH || objK6 == awVar) {
                    k76Var = k76Var2;
                    m9Var = new m9(0, g80Var3, g80.class, "onSwitchToHeadsetDialogDismissed", "onSwitchToHeadsetDialogDismissed()V", 0, (byte) 7);
                    ux2Var.g0(m9Var);
                } else {
                    m9Var = objK6;
                    k76Var = k76Var2;
                }
                Function0 function2 = (Function0) ((pu3) m9Var);
                boolean zH2 = ux2Var.h(g80Var3);
                Object objK7 = ux2Var.K();
                if (zH2 || objK7 == awVar) {
                    m9 m9Var2 = new m9(0, g80Var3, g80.class, "onSwitchToHeadsetDialogConfirmed", "onSwitchToHeadsetDialogConfirmed()V", 0, (byte) 8);
                    ux2Var.g0(m9Var2);
                    objK7 = m9Var2;
                }
                iw2Var2.d(new aj5(numValueOf, strA, R.string.tv_switch_to_bluetooth_headset_dont_change, R.string.permission_dialog_allow, function2, (Function0) ((pu3) objK7)), ux2Var, 8);
                ux2Var.p(false);
            }
            if (((Boolean) g80Var3.q.getValue()).booleanValue()) {
                ux2Var.W(-1030298600);
                Integer numValueOf2 = Integer.valueOf(R.string.tv_bluetooth_connect_permission_enable_in_settings_title);
                String strZ = m77.z(R.string.tv_bluetooth_connect_permission_enable_in_settings, ux2Var);
                boolean zH3 = ux2Var.h(g80Var3);
                Object objK8 = ux2Var.K();
                if (zH3 || objK8 == awVar) {
                    m9 m9Var3 = new m9(0, g80Var3, g80.class, "onEnableBluetoothInSettingsDismissed", "onEnableBluetoothInSettingsDismissed()V", 0, (byte) 9);
                    ux2Var.g0(m9Var3);
                    objK8 = m9Var3;
                }
                Function0 function3 = (Function0) ((pu3) objK8);
                boolean zH4 = ux2Var.h(context) | ux2Var.h(g80Var3);
                Object objK9 = ux2Var.K();
                Object obj7 = objK9;
                if (zH4 || objK9 == awVar) {
                    x8 x8Var = new x8(context, g80Var3, (byte) 12);
                    ux2Var.g0(x8Var);
                    obj7 = x8Var;
                }
                iw2Var2.d(new aj5(numValueOf2, strZ, R.string.tv_switch_to_bluetooth_headset_dont_change, R.string.permission_dialog_settings, function3, (Function0) obj7), ux2Var, 8);
                ux2Var.p(false);
            } else {
                ux2Var.W(-1029505775);
                ux2Var.p(false);
            }
            if (!((Boolean) g80Var3.p.getValue()).booleanValue() || k76Var.m == null) {
                ux2Var.W(-1028542543);
                ux2Var.p(false);
            } else {
                ux2Var.W(-1029391106);
                Object objJ = ux2Var.j(tc4.a);
                objJ.getClass();
                Activity activity = (Activity) objJ;
                String strA2 = ((dj5) k76Var.m).a();
                boolean zH5 = ux2Var.h(g80Var3);
                Object objK10 = ux2Var.K();
                if (zH5 || objK10 == awVar) {
                    m9 m9Var4 = new m9(0, g80Var3, g80.class, "onBluetoothPermissionAccepted", "onBluetoothPermissionAccepted()V", 0, (byte) 10);
                    ux2Var.g0(m9Var4);
                    objK10 = m9Var4;
                }
                Function0 function4 = (Function0) ((pu3) objK10);
                boolean zH6 = ux2Var.h(g80Var3);
                Object objK11 = ux2Var.K();
                Object obj8 = objK11;
                if (zH6 || objK11 == awVar) {
                    m9 m9Var5 = new m9(0, g80Var3, g80.class, "onBluetoothPermissionDeclined", "onBluetoothPermissionDeclined()V", 0, (byte) 11);
                    ux2Var.g0(m9Var5);
                    obj8 = m9Var5;
                }
                List listK = qf0.K(new zi5(strA2, function4, (Function0) ((pu3) obj8)));
                boolean zH7 = ux2Var.h(activity);
                Object objK12 = ux2Var.K();
                if (zH7 || objK12 == awVar) {
                    r10 = 0;
                    c80 c80Var = new c80(activity, false ? 1 : 0);
                    ux2Var.g0(c80Var);
                    obj = c80Var;
                } else {
                    r10 = 0;
                    obj = objK12;
                }
                bt1.g(listK, (Function1) obj, iw2Var2, ux2Var, r10);
                ux2Var.p(r10);
            }
            px4 px4VarT = h57.t(function0, ux2Var);
            xm0 xm0VarF = vt1.F(g80Var3.r);
            boolean zH8 = ux2Var.h(g80Var3) | ux2Var.f(px4VarT);
            Object objK13 = ux2Var.K();
            Object obj9 = objK13;
            if (zH8 || objK13 == awVar) {
                h0 h0Var = new h0((Object) g80Var3, (Object) px4VarT, (hc1) null, (byte) 13);
                ux2Var.g0(h0Var);
                obj9 = h0Var;
            }
            ck3.i(xm0VarF, (hw2) obj9, ux2Var);
            LifecycleOwner lifecycleOwner2 = lifecycleOwner;
            g80 g80Var5 = g80Var3;
            g80Var2 = g80Var5;
            ck3.i(lifecycleOwner2, new aj(lifecycleOwner2, px4Var, g80Var5, k76Var, context, null, (byte) 1), ux2Var);
        } else {
            ux2Var.Q();
            g80Var2 = g80Var;
            iw2Var2 = iw2Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new f9(function0, g80Var2, iw2Var2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x012c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0130  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0140  */
    /* JADX WARN: Code duplicated, block: B:110:0x0142  */
    /* JADX WARN: Code duplicated, block: B:112:0x0146  */
    /* JADX WARN: Code duplicated, block: B:113:0x0149  */
    /* JADX WARN: Code duplicated, block: B:117:0x015f  */
    /* JADX WARN: Code duplicated, block: B:120:0x016a  */
    /* JADX WARN: Code duplicated, block: B:122:0x016f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0174  */
    /* JADX WARN: Code duplicated, block: B:126:0x0179  */
    /* JADX WARN: Code duplicated, block: B:129:0x0180  */
    /* JADX WARN: Code duplicated, block: B:130:0x0191  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:154:0x0218  */
    /* JADX WARN: Code duplicated, block: B:156:0x021e  */
    /* JADX WARN: Code duplicated, block: B:162:0x022f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0235  */
    /* JADX WARN: Code duplicated, block: B:170:0x0249 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x0253  */
    /* JADX WARN: Code duplicated, block: B:176:0x0274  */
    /* JADX WARN: Code duplicated, block: B:177:0x027f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0287  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:185:0x02da  */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    public static final void d(Function0 function0, fs4 fs4Var, boolean z2, pw6 pw6Var, ng0 ng0Var, sg0 sg0Var, d90 d90Var, nd5 nd5Var, iw2 iw2Var, ux2 ux2Var, int i2, int i3) {
        int i4;
        sg0 sg0Var2;
        int i5;
        nd5 nd5Var2;
        int i6;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        d90 d90Var2;
        nd5 nd5Var3;
        j56 j56VarR;
        int i9;
        d90 d90Var3;
        nd5 nd5Var4;
        int i10;
        d90 d90Var4;
        nd5 nd5Var5;
        Object objK;
        Object obj;
        mw4 mw4Var;
        long j2;
        long j3;
        int i11;
        Object objK2;
        j57 j57Var;
        boolean zF;
        Object objK3;
        jl3 jl3Var;
        float f2;
        Object objK4;
        km kmVar;
        boolean zH;
        Object objK5;
        km kmVar2;
        boolean z5;
        sg0 sg0Var3;
        ko koVar;
        float f3;
        Object objK6;
        int i12;
        ux2Var.Y(-1310015664);
        if ((i2 & 6) == 0) {
            i4 = (ux2Var.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ux2Var.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ux2Var.f(pw6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ux2Var.f(ng0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                sg0Var2 = sg0Var;
                int i13 = ux2Var.f(sg0Var2) ? 131072 : 65536;
                i4 |= i13;
            } else {
                sg0Var2 = sg0Var;
            }
            i4 |= i13;
        } else {
            sg0Var2 = sg0Var;
        }
        int i14 = i3 & 64;
        if (i14 == 0) {
            if ((1572864 & i2) == 0) {
                i4 |= ux2Var.f(d90Var) ? 1048576 : 524288;
            }
            i5 = i3 & 128;
            if (i5 != 0) {
                if ((12582912 & i2) == 0) {
                    nd5Var2 = nd5Var;
                    if (ux2Var.f(nd5Var2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i4 |= i6;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (ux2Var.f(null)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i4 |= i7;
                }
                if ((805306368 & i2) != 0) {
                    if (ux2Var.h(iw2Var)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                i8 = i4;
                z3 = true;
                if ((i4 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i8 & 1, z4)) {
                    ux2Var.S();
                    if ((i2 & 1) != 0 || ux2Var.x()) {
                        if ((i3 & 32) != 0) {
                            pd5 pd5Var = og0.a;
                            sg0Var2 = new sg0(iq8.F);
                            i9 = i8 & (-458753);
                        } else {
                            i9 = i8;
                        }
                        if (i14 != 0) {
                            d90Var3 = null;
                        } else {
                            d90Var3 = d90Var;
                        }
                        if (i5 != 0) {
                            nd5Var4 = og0.a;
                        } else {
                            nd5Var4 = nd5Var2;
                        }
                        i10 = i9;
                        d90Var4 = d90Var3;
                        nd5Var5 = nd5Var4;
                    } else {
                        ux2Var.Q();
                        if ((i3 & 32) != 0) {
                            d90Var4 = d90Var;
                            i10 = i8 & (-458753);
                            nd5Var5 = nd5Var2;
                        } else {
                            d90Var4 = d90Var;
                            nd5Var5 = nd5Var2;
                            i10 = i8;
                        }
                    }
                    ux2Var.q();
                    ux2Var.W(1691726283);
                    objK = ux2Var.K();
                    obj = e01.a;
                    if (objK == obj) {
                        objK = ua5.s(ux2Var);
                    }
                    mw4Var = (mw4) objK;
                    ux2Var.p(false);
                    if (z2) {
                        j2 = ng0Var.a;
                    } else {
                        j2 = ng0Var.c;
                    }
                    long j4 = j2;
                    if (z2) {
                        j3 = ng0Var.b;
                    } else {
                        j3 = ng0Var.d;
                    }
                    long j5 = j3;
                    if (sg0Var2 == null) {
                        ux2Var.W(1691909926);
                        ux2Var.p(false);
                        mw4Var = mw4Var;
                        sg0Var3 = sg0Var2;
                        koVar = null;
                        z5 = false;
                    } else {
                        ux2Var.W(-499611589);
                        i11 = ((i10 >> 6) & 14) | ((i10 >> 9) & 896);
                        objK2 = ux2Var.K();
                        if (objK2 == obj) {
                            objK2 = new j57();
                            ux2Var.g0(objK2);
                        }
                        j57Var = (j57) objK2;
                        zF = ux2Var.f(mw4Var);
                        objK3 = ux2Var.K();
                        if (zF || objK3 == obj) {
                            objK3 = new qg0(mw4Var, j57Var, null, (byte) 0);
                            ux2Var.g0(objK3);
                        }
                        ck3.i(mw4Var, (hw2) objK3, ux2Var);
                        jl3Var = (jl3) lv0.w0(j57Var);
                        if (z2 || (jl3Var instanceof yr5) || !(jl3Var instanceof j63)) {
                            f2 = 0.0f;
                        } else {
                            f2 = sg0Var2.a;
                        }
                        objK4 = ux2Var.K();
                        if (objK4 == obj) {
                            objK4 = new km(new w32(f2), vn4.l0, null, 12);
                            ux2Var.g0(objK4);
                        }
                        kmVar = (km) objK4;
                        w32 w32Var = new w32(f2);
                        boolean zH2 = ux2Var.h(kmVar) | ux2Var.c(f2) | ((((i11 & 14) ^ 6) <= 4 && ux2Var.g(z2)) || (i11 & 6) == 4);
                        if ((((i11 & 896) ^ 384) > 256 || !ux2Var.f(sg0Var2)) && (i11 & 384) != 256) {
                        }
                        zH = zH2 | z3 | ux2Var.h(jl3Var);
                        objK5 = ux2Var.K();
                        if (!zH || objK5 == obj) {
                            float f4 = f2;
                            kmVar2 = kmVar;
                            sg0 sg0Var4 = sg0Var2;
                            z5 = false;
                            Object rg0Var = new rg0(kmVar2, f4, z2, sg0Var4, jl3Var, (hc1) null);
                            sg0Var3 = sg0Var4;
                            ux2Var.g0(rg0Var);
                            objK5 = rg0Var;
                        } else {
                            sg0Var3 = sg0Var2;
                            kmVar2 = kmVar;
                            z5 = false;
                        }
                        ck3.i(w32Var, (hw2) objK5, ux2Var);
                        koVar = kmVar2.c;
                        ux2Var.p(z5);
                    }
                    if (koVar != null) {
                        f3 = ((w32) koVar.n.getValue()).m;
                    } else {
                        f3 = 0.0f;
                    }
                    objK6 = ux2Var.K();
                    if (objK6 == obj) {
                        objK6 = new px((byte) 12);
                        ux2Var.g0(objK6);
                    }
                    ig7.b(function0, cp6.a(fs4Var, z5, (Function1) objK6), z2, pw6Var, j4, j5, 0.0f, f3, d90Var4, mw4Var, O(-535639973, new uh(j5, (Object) nd5Var5, (Object) iw2Var, (byte) 1), ux2Var), ux2Var, (i10 & 8078) | (234881024 & (i10 << 6)), 64);
                    d90Var2 = d90Var4;
                    nd5Var3 = nd5Var5;
                    sg0Var2 = sg0Var3;
                } else {
                    ux2Var.Q();
                    d90Var2 = d90Var;
                    nd5Var3 = nd5Var2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new ug0(function0, fs4Var, z2, pw6Var, ng0Var, sg0Var2, d90Var2, nd5Var3, iw2Var, i2, i3);
                }
            }
            i4 |= 12582912;
            nd5Var2 = nd5Var;
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (ux2Var.f(null)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i4 |= i7;
            }
            if ((805306368 & i2) != 0) {
                if (ux2Var.h(iw2Var)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            i8 = i4;
            z3 = true;
            if ((i4 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ux2Var.N(i8 & 1, z4)) {
                ux2Var.S();
                if ((i2 & 1) != 0) {
                    if ((i3 & 32) != 0) {
                        pd5 pd5Var2 = og0.a;
                        sg0Var2 = new sg0(iq8.F);
                        i9 = i8 & (-458753);
                    } else {
                        i9 = i8;
                    }
                    if (i14 != 0) {
                        d90Var3 = null;
                    } else {
                        d90Var3 = d90Var;
                    }
                    if (i5 != 0) {
                        nd5Var4 = og0.a;
                    } else {
                        nd5Var4 = nd5Var2;
                    }
                    i10 = i9;
                    d90Var4 = d90Var3;
                    nd5Var5 = nd5Var4;
                } else {
                    if ((i3 & 32) != 0) {
                        pd5 pd5Var3 = og0.a;
                        sg0Var2 = new sg0(iq8.F);
                        i9 = i8 & (-458753);
                    } else {
                        i9 = i8;
                    }
                    if (i14 != 0) {
                        d90Var3 = null;
                    } else {
                        d90Var3 = d90Var;
                    }
                    if (i5 != 0) {
                        nd5Var4 = og0.a;
                    } else {
                        nd5Var4 = nd5Var2;
                    }
                    i10 = i9;
                    d90Var4 = d90Var3;
                    nd5Var5 = nd5Var4;
                }
                ux2Var.q();
                ux2Var.W(1691726283);
                objK = ux2Var.K();
                obj = e01.a;
                if (objK == obj) {
                    objK = ua5.s(ux2Var);
                }
                mw4Var = (mw4) objK;
                ux2Var.p(false);
                if (z2) {
                    j2 = ng0Var.a;
                } else {
                    j2 = ng0Var.c;
                }
                long j6 = j2;
                if (z2) {
                    j3 = ng0Var.b;
                } else {
                    j3 = ng0Var.d;
                }
                long j7 = j3;
                if (sg0Var2 == null) {
                    ux2Var.W(1691909926);
                    ux2Var.p(false);
                    mw4Var = mw4Var;
                    sg0Var3 = sg0Var2;
                    koVar = null;
                    z5 = false;
                } else {
                    ux2Var.W(-499611589);
                    i11 = ((i10 >> 6) & 14) | ((i10 >> 9) & 896);
                    objK2 = ux2Var.K();
                    if (objK2 == obj) {
                        objK2 = new j57();
                        ux2Var.g0(objK2);
                    }
                    j57Var = (j57) objK2;
                    zF = ux2Var.f(mw4Var);
                    objK3 = ux2Var.K();
                    if (zF) {
                        objK3 = new qg0(mw4Var, j57Var, null, (byte) 0);
                        ux2Var.g0(objK3);
                    } else {
                        objK3 = new qg0(mw4Var, j57Var, null, (byte) 0);
                        ux2Var.g0(objK3);
                    }
                    ck3.i(mw4Var, (hw2) objK3, ux2Var);
                    jl3Var = (jl3) lv0.w0(j57Var);
                    if (z2) {
                        f2 = 0.0f;
                    } else {
                        f2 = sg0Var2.a;
                    }
                    objK4 = ux2Var.K();
                    if (objK4 == obj) {
                        objK4 = new km(new w32(f2), vn4.l0, null, 12);
                        ux2Var.g0(objK4);
                    }
                    kmVar = (km) objK4;
                    w32 w32Var2 = new w32(f2);
                    boolean zH3 = ux2Var.h(kmVar) | ux2Var.c(f2) | ((((i11 & 14) ^ 6) <= 4 && ux2Var.g(z2)) || (i11 & 6) == 4);
                    z3 = ((i11 & 896) ^ 384) > 256 ? false : false;
                    zH = zH3 | z3 | ux2Var.h(jl3Var);
                    objK5 = ux2Var.K();
                    if (zH) {
                        float f5 = f2;
                        kmVar2 = kmVar;
                        sg0 sg0Var5 = sg0Var2;
                        z5 = false;
                        Object rg0Var2 = new rg0(kmVar2, f5, z2, sg0Var5, jl3Var, (hc1) null);
                        sg0Var3 = sg0Var5;
                        ux2Var.g0(rg0Var2);
                        objK5 = rg0Var2;
                    } else {
                        float f6 = f2;
                        kmVar2 = kmVar;
                        sg0 sg0Var6 = sg0Var2;
                        z5 = false;
                        Object rg0Var3 = new rg0(kmVar2, f6, z2, sg0Var6, jl3Var, (hc1) null);
                        sg0Var3 = sg0Var6;
                        ux2Var.g0(rg0Var3);
                        objK5 = rg0Var3;
                    }
                    ck3.i(w32Var2, (hw2) objK5, ux2Var);
                    koVar = kmVar2.c;
                    ux2Var.p(z5);
                }
                if (koVar != null) {
                    f3 = ((w32) koVar.n.getValue()).m;
                } else {
                    f3 = 0.0f;
                }
                objK6 = ux2Var.K();
                if (objK6 == obj) {
                    objK6 = new px((byte) 12);
                    ux2Var.g0(objK6);
                }
                ig7.b(function0, cp6.a(fs4Var, z5, (Function1) objK6), z2, pw6Var, j6, j7, 0.0f, f3, d90Var4, mw4Var, O(-535639973, new uh(j7, (Object) nd5Var5, (Object) iw2Var, (byte) 1), ux2Var), ux2Var, (i10 & 8078) | (234881024 & (i10 << 6)), 64);
                d90Var2 = d90Var4;
                nd5Var3 = nd5Var5;
                sg0Var2 = sg0Var3;
            } else {
                ux2Var.Q();
                d90Var2 = d90Var;
                nd5Var3 = nd5Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new ug0(function0, fs4Var, z2, pw6Var, ng0Var, sg0Var2, d90Var2, nd5Var3, iw2Var, i2, i3);
            }
        }
        i4 |= 1572864;
        i5 = i3 & 128;
        if (i5 != 0) {
            if ((12582912 & i2) == 0) {
                nd5Var2 = nd5Var;
                if (ux2Var.f(nd5Var2)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (ux2Var.f(null)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i4 |= i7;
            }
            if ((805306368 & i2) != 0) {
                if (ux2Var.h(iw2Var)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            i8 = i4;
            z3 = true;
            if ((i4 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ux2Var.N(i8 & 1, z4)) {
                ux2Var.S();
                if ((i2 & 1) != 0) {
                    if ((i3 & 32) != 0) {
                        pd5 pd5Var4 = og0.a;
                        sg0Var2 = new sg0(iq8.F);
                        i9 = i8 & (-458753);
                    } else {
                        i9 = i8;
                    }
                    if (i14 != 0) {
                        d90Var3 = null;
                    } else {
                        d90Var3 = d90Var;
                    }
                    if (i5 != 0) {
                        nd5Var4 = og0.a;
                    } else {
                        nd5Var4 = nd5Var2;
                    }
                    i10 = i9;
                    d90Var4 = d90Var3;
                    nd5Var5 = nd5Var4;
                } else {
                    if ((i3 & 32) != 0) {
                        pd5 pd5Var5 = og0.a;
                        sg0Var2 = new sg0(iq8.F);
                        i9 = i8 & (-458753);
                    } else {
                        i9 = i8;
                    }
                    if (i14 != 0) {
                        d90Var3 = null;
                    } else {
                        d90Var3 = d90Var;
                    }
                    if (i5 != 0) {
                        nd5Var4 = og0.a;
                    } else {
                        nd5Var4 = nd5Var2;
                    }
                    i10 = i9;
                    d90Var4 = d90Var3;
                    nd5Var5 = nd5Var4;
                }
                ux2Var.q();
                ux2Var.W(1691726283);
                objK = ux2Var.K();
                obj = e01.a;
                if (objK == obj) {
                    objK = ua5.s(ux2Var);
                }
                mw4Var = (mw4) objK;
                ux2Var.p(false);
                if (z2) {
                    j2 = ng0Var.a;
                } else {
                    j2 = ng0Var.c;
                }
                long j8 = j2;
                if (z2) {
                    j3 = ng0Var.b;
                } else {
                    j3 = ng0Var.d;
                }
                long j9 = j3;
                if (sg0Var2 == null) {
                    ux2Var.W(1691909926);
                    ux2Var.p(false);
                    mw4Var = mw4Var;
                    sg0Var3 = sg0Var2;
                    koVar = null;
                    z5 = false;
                } else {
                    ux2Var.W(-499611589);
                    i11 = ((i10 >> 6) & 14) | ((i10 >> 9) & 896);
                    objK2 = ux2Var.K();
                    if (objK2 == obj) {
                        objK2 = new j57();
                        ux2Var.g0(objK2);
                    }
                    j57Var = (j57) objK2;
                    zF = ux2Var.f(mw4Var);
                    objK3 = ux2Var.K();
                    if (zF) {
                        objK3 = new qg0(mw4Var, j57Var, null, (byte) 0);
                        ux2Var.g0(objK3);
                    } else {
                        objK3 = new qg0(mw4Var, j57Var, null, (byte) 0);
                        ux2Var.g0(objK3);
                    }
                    ck3.i(mw4Var, (hw2) objK3, ux2Var);
                    jl3Var = (jl3) lv0.w0(j57Var);
                    if (z2) {
                        f2 = 0.0f;
                    } else {
                        f2 = sg0Var2.a;
                    }
                    objK4 = ux2Var.K();
                    if (objK4 == obj) {
                        objK4 = new km(new w32(f2), vn4.l0, null, 12);
                        ux2Var.g0(objK4);
                    }
                    kmVar = (km) objK4;
                    w32 w32Var3 = new w32(f2);
                    boolean zH4 = ux2Var.h(kmVar) | ux2Var.c(f2) | ((((i11 & 14) ^ 6) <= 4 && ux2Var.g(z2)) || (i11 & 6) == 4);
                    if (((i11 & 896) ^ 384) > 256) {
                    }
                    zH = zH4 | z3 | ux2Var.h(jl3Var);
                    objK5 = ux2Var.K();
                    if (zH) {
                        float f7 = f2;
                        kmVar2 = kmVar;
                        sg0 sg0Var7 = sg0Var2;
                        z5 = false;
                        Object rg0Var4 = new rg0(kmVar2, f7, z2, sg0Var7, jl3Var, (hc1) null);
                        sg0Var3 = sg0Var7;
                        ux2Var.g0(rg0Var4);
                        objK5 = rg0Var4;
                    } else {
                        float f8 = f2;
                        kmVar2 = kmVar;
                        sg0 sg0Var8 = sg0Var2;
                        z5 = false;
                        Object rg0Var5 = new rg0(kmVar2, f8, z2, sg0Var8, jl3Var, (hc1) null);
                        sg0Var3 = sg0Var8;
                        ux2Var.g0(rg0Var5);
                        objK5 = rg0Var5;
                    }
                    ck3.i(w32Var3, (hw2) objK5, ux2Var);
                    koVar = kmVar2.c;
                    ux2Var.p(z5);
                }
                if (koVar != null) {
                    f3 = ((w32) koVar.n.getValue()).m;
                } else {
                    f3 = 0.0f;
                }
                objK6 = ux2Var.K();
                if (objK6 == obj) {
                    objK6 = new px((byte) 12);
                    ux2Var.g0(objK6);
                }
                ig7.b(function0, cp6.a(fs4Var, z5, (Function1) objK6), z2, pw6Var, j8, j9, 0.0f, f3, d90Var4, mw4Var, O(-535639973, new uh(j9, (Object) nd5Var5, (Object) iw2Var, (byte) 1), ux2Var), ux2Var, (i10 & 8078) | (234881024 & (i10 << 6)), 64);
                d90Var2 = d90Var4;
                nd5Var3 = nd5Var5;
                sg0Var2 = sg0Var3;
            } else {
                ux2Var.Q();
                d90Var2 = d90Var;
                nd5Var3 = nd5Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new ug0(function0, fs4Var, z2, pw6Var, ng0Var, sg0Var2, d90Var2, nd5Var3, iw2Var, i2, i3);
            }
        }
        i4 |= 12582912;
        nd5Var2 = nd5Var;
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (ux2Var.f(null)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i4 |= i7;
        }
        if ((805306368 & i2) != 0) {
            if (ux2Var.h(iw2Var)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i4 |= i12;
        }
        i8 = i4;
        z3 = true;
        if ((i4 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ux2Var.N(i8 & 1, z4)) {
            ux2Var.S();
            if ((i2 & 1) != 0) {
                if ((i3 & 32) != 0) {
                    pd5 pd5Var6 = og0.a;
                    sg0Var2 = new sg0(iq8.F);
                    i9 = i8 & (-458753);
                } else {
                    i9 = i8;
                }
                if (i14 != 0) {
                    d90Var3 = null;
                } else {
                    d90Var3 = d90Var;
                }
                if (i5 != 0) {
                    nd5Var4 = og0.a;
                } else {
                    nd5Var4 = nd5Var2;
                }
                i10 = i9;
                d90Var4 = d90Var3;
                nd5Var5 = nd5Var4;
            } else {
                if ((i3 & 32) != 0) {
                    pd5 pd5Var7 = og0.a;
                    sg0Var2 = new sg0(iq8.F);
                    i9 = i8 & (-458753);
                } else {
                    i9 = i8;
                }
                if (i14 != 0) {
                    d90Var3 = null;
                } else {
                    d90Var3 = d90Var;
                }
                if (i5 != 0) {
                    nd5Var4 = og0.a;
                } else {
                    nd5Var4 = nd5Var2;
                }
                i10 = i9;
                d90Var4 = d90Var3;
                nd5Var5 = nd5Var4;
            }
            ux2Var.q();
            ux2Var.W(1691726283);
            objK = ux2Var.K();
            obj = e01.a;
            if (objK == obj) {
                objK = ua5.s(ux2Var);
            }
            mw4Var = (mw4) objK;
            ux2Var.p(false);
            if (z2) {
                j2 = ng0Var.a;
            } else {
                j2 = ng0Var.c;
            }
            long j10 = j2;
            if (z2) {
                j3 = ng0Var.b;
            } else {
                j3 = ng0Var.d;
            }
            long j11 = j3;
            if (sg0Var2 == null) {
                ux2Var.W(1691909926);
                ux2Var.p(false);
                mw4Var = mw4Var;
                sg0Var3 = sg0Var2;
                koVar = null;
                z5 = false;
            } else {
                ux2Var.W(-499611589);
                i11 = ((i10 >> 6) & 14) | ((i10 >> 9) & 896);
                objK2 = ux2Var.K();
                if (objK2 == obj) {
                    objK2 = new j57();
                    ux2Var.g0(objK2);
                }
                j57Var = (j57) objK2;
                zF = ux2Var.f(mw4Var);
                objK3 = ux2Var.K();
                if (zF) {
                    objK3 = new qg0(mw4Var, j57Var, null, (byte) 0);
                    ux2Var.g0(objK3);
                } else {
                    objK3 = new qg0(mw4Var, j57Var, null, (byte) 0);
                    ux2Var.g0(objK3);
                }
                ck3.i(mw4Var, (hw2) objK3, ux2Var);
                jl3Var = (jl3) lv0.w0(j57Var);
                if (z2) {
                    f2 = 0.0f;
                } else {
                    f2 = sg0Var2.a;
                }
                objK4 = ux2Var.K();
                if (objK4 == obj) {
                    objK4 = new km(new w32(f2), vn4.l0, null, 12);
                    ux2Var.g0(objK4);
                }
                kmVar = (km) objK4;
                w32 w32Var4 = new w32(f2);
                boolean zH5 = ux2Var.h(kmVar) | ux2Var.c(f2) | ((((i11 & 14) ^ 6) <= 4 && ux2Var.g(z2)) || (i11 & 6) == 4);
                if (((i11 & 896) ^ 384) > 256) {
                }
                zH = zH5 | z3 | ux2Var.h(jl3Var);
                objK5 = ux2Var.K();
                if (zH) {
                    float f9 = f2;
                    kmVar2 = kmVar;
                    sg0 sg0Var9 = sg0Var2;
                    z5 = false;
                    Object rg0Var6 = new rg0(kmVar2, f9, z2, sg0Var9, jl3Var, (hc1) null);
                    sg0Var3 = sg0Var9;
                    ux2Var.g0(rg0Var6);
                    objK5 = rg0Var6;
                } else {
                    float f10 = f2;
                    kmVar2 = kmVar;
                    sg0 sg0Var10 = sg0Var2;
                    z5 = false;
                    Object rg0Var7 = new rg0(kmVar2, f10, z2, sg0Var10, jl3Var, (hc1) null);
                    sg0Var3 = sg0Var10;
                    ux2Var.g0(rg0Var7);
                    objK5 = rg0Var7;
                }
                ck3.i(w32Var4, (hw2) objK5, ux2Var);
                koVar = kmVar2.c;
                ux2Var.p(z5);
            }
            if (koVar != null) {
                f3 = ((w32) koVar.n.getValue()).m;
            } else {
                f3 = 0.0f;
            }
            objK6 = ux2Var.K();
            if (objK6 == obj) {
                objK6 = new px((byte) 12);
                ux2Var.g0(objK6);
            }
            ig7.b(function0, cp6.a(fs4Var, z5, (Function1) objK6), z2, pw6Var, j10, j11, 0.0f, f3, d90Var4, mw4Var, O(-535639973, new uh(j11, (Object) nd5Var5, (Object) iw2Var, (byte) 1), ux2Var), ux2Var, (i10 & 8078) | (234881024 & (i10 << 6)), 64);
            d90Var2 = d90Var4;
            nd5Var3 = nd5Var5;
            sg0Var2 = sg0Var3;
        } else {
            ux2Var.Q();
            d90Var2 = d90Var;
            nd5Var3 = nd5Var2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ug0(function0, fs4Var, z2, pw6Var, ng0Var, sg0Var2, d90Var2, nd5Var3, iw2Var, i2, i3);
        }
    }

    public static final void e(ib ibVar, Function0 function0, Function0 function1, fs4 fs4Var, ux2 ux2Var, int i2) {
        ib ibVar2;
        int i3;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(824293913);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            ibVar2 = ibVar;
            i3 = (ux2Var2.f(ibVar2) ? 4 : 2) | i2;
        } else {
            ibVar2 = ibVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var2.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var2.h(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var2.f(fs4Var) ? 2048 : 1024;
        }
        if (ux2Var2.N(i3 & 1, (i3 & 1171) != 1170)) {
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
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
            boolean zB = ibVar2.b();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), "TVTA-devices-add-remote-device-via-id-bottom-sheet-scan-qr-code-button");
            boolean z2 = (i3 & 112) == 32;
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (z2 || objK == awVar) {
                objK = new a9(function0, b2);
                ux2Var2.g0(objK);
            }
            int i4 = i3;
            g57.b((Function0) objK, fs4VarA, null, zB, null, null, g68.g, ux2Var, 1572912, 52);
            ux2Var2 = ux2Var;
            fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), "TVTA-devices-add-remote-device-via-id-bottom-sheet-cancel-button");
            boolean z3 = (i4 & 896) == 256;
            Object objK2 = ux2Var2.K();
            if (z3 || objK2 == awVar) {
                objK2 = new a9(function1, (byte) 3);
                ux2Var2.g0(objK2);
            }
            v67.d((Function0) objK2, fs4VarA2, null, false, null, g68.h, ux2Var2, 196656, 28);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new p5((Object) ibVar, (Object) function0, (Object) function1, fs4Var, i2, (byte) 1);
        }
    }

    public static final void f(final boolean z2, final fs4 fs4Var, ux2 ux2Var, final int i2, final int i3) {
        ux2Var.Y(870990307);
        int i4 = (i2 & 6) == 0 ? (ux2Var.g(z2) ? 4 : 2) | i2 : i2;
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if (ux2Var.N(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                fs4Var = cs4.b;
            }
            sb0 sb0VarP = P(ux2Var);
            fs4 fs4VarD = ka0.D(fs4Var, 24.0f, 0.0f, 2);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarD);
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
            i(sb0VarP, null, ux2Var, 0);
            if (z2) {
                ux2Var.W(1350783639);
                for (int i6 = 0; i6 < 2; i6++) {
                    h(sb0VarP, null, ux2Var, 0);
                }
                ux2Var.p(false);
            } else {
                ux2Var.W(1350904725);
                ux2Var.p(false);
            }
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.b51
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i2 | 1);
                    au8.f(z2, fs4Var, (ux2) obj, iY, i3);
                    return f88.a;
                }
            };
        }
    }

    public static final void g(l33 l33Var, fs4 fs4Var, ux2 ux2Var, int i2) {
        int i3;
        boolean z2;
        cs4 cs4Var;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(407183642);
        if ((i2 & 6) == 0) {
            i3 = i2 | (ux2Var2.h(l33Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var2.f(fs4Var) ? 32 : 16;
        }
        if (ux2Var2.N(i3 & 1, (i3 & 19) != 18)) {
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
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
            cs4 cs4Var2 = cs4.b;
            if (l33Var == null) {
                ux2Var2.W(-1728698286);
                ux2Var2.p(false);
                cs4Var = cs4Var2;
            } else {
                ux2Var2.W(-1728698285);
                if (l33Var.c) {
                    ux2Var2.W(1703493192);
                    String strZ = m77.z(R.string.add_remote_devive_to_your_account_legacy_group_selected_disclaimer, ux2Var2);
                    h72 h72Var = un4.a;
                    cs4Var = cs4Var2;
                    z2 = false;
                    qs7.b(strZ, androidx.compose.ui.platform.a.a(ka0.F(cs4Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), "TVTA-devices-add-remote-device-to_your_account-bottom-sheet-legacy-group-selected-disclaimer"), ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.k, ux2Var, 48, 0, 131064);
                    ux2Var2 = ux2Var;
                    ux2Var2.p(false);
                } else {
                    z2 = false;
                    cs4Var = cs4Var2;
                    ux2Var2.W(1704089446);
                    ux2Var2.p(false);
                }
                ux2Var2.p(z2);
            }
            String strZ2 = m77.z(R.string.add_remote_devive_to_your_account_disclaimer, ux2Var2);
            String str = (String) lv0.o0(ob7.a(strZ2));
            if (str == null) {
                str = "";
            }
            Map mapSingletonMap = Collections.singletonMap(str, new k77(m77.z(R.string.add_remote_devive_to_your_account_disclaimer_learn_more_url, ux2Var2)));
            mapSingletonMap.getClass();
            String strB = ob7.b(strZ2);
            h72 h72Var2 = un4.a;
            qs7.c(g77.s(strB, mapSingletonMap, new c77(((rn4) ux2Var2.j(h72Var2)).a.a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), ((rn4) ux2Var2.j(h72Var2)).a.s, ux2Var2, 16), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devices-add-remote-device-to_your_account-bottom-sheet-disclaimer"), 0L, 0L, 0L, 0L, 0, false, 0, 0, null, null, ((rn4) ux2Var2.j(h72Var2)).b.k, ux2Var, 48, 0, 262140);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new pa((byte) 2, i2, (Object) l33Var, (Object) fs4Var);
        }
    }

    public static final void h(sb0 sb0Var, fs4 fs4Var, ux2 ux2Var, int i2) {
        ux2Var.Y(1786476747);
        int i3 = (ux2Var.f(sb0Var) ? 4 : 2) | i2 | 48;
        byte b2 = 1;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarD = ka0.D(cs4Var, 0.0f, 18.0f, 1);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.x, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarD);
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
            fs4 fs4VarL = androidx.compose.foundation.layout.b.l(ka0.F(cs4Var, 0.0f, 0.0f, 24.0f, 0.0f, 11), 24.0f);
            qf6 qf6Var = sf6.a;
            ua0.a(r(iq8.j(fs4VarL, qf6Var), sb0Var, null, 6), ux2Var, 0);
            ua0.a(r(iq8.j(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 20.0f), qf6Var), sb0Var, null, 6), ux2Var, 0);
            ux2Var.p(true);
            fs4Var = cs4Var;
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new c51(sb0Var, fs4Var, i2, b2);
        }
    }

    public static final void i(sb0 sb0Var, fs4 fs4Var, ux2 ux2Var, int i2) {
        ux2Var.Y(-1602933198);
        int i3 = (ux2Var.f(sb0Var) ? 4 : 2) | i2 | 48;
        byte b2 = 0;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            ua0.a(r(iq8.j(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(ka0.D(cs4Var, 0.0f, 18.0f, 1), 1.0f), 20.0f), sf6.a), sb0Var, null, 6), ux2Var, 0);
            fs4Var = cs4Var;
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new c51(sb0Var, fs4Var, i2, b2);
        }
    }

    public static final void j(ib ibVar, hb hbVar, l33 l33Var, final boolean z2, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i2) {
        int i3;
        fs4 fs4Var2;
        boolean z3;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-58497269);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (ux2Var2.f(ibVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var2.h(hbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var2.h(l33Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var2.g(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ux2Var2.h(function0) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if (ux2Var2.N(i4 & 1, (74899 & i4) != 74898)) {
            kw0 kw0VarA = iw0.a(new ew(16.0f, new hk0(b2)), xz2.A, ux2Var2, 6);
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
            byte b3 = 1;
            jx0.b(ibVar.c, ibVar.g, hbVar.a, null, ux2Var2, 3456);
            l33 l33Var2 = (l33Var == null || l33Var.c) ? null : l33Var;
            final boolean z4 = l33Var2 == null && !z2;
            String strG = l33Var2 != null ? l33Var2.b : null;
            if (strG == null) {
                ux2Var2.W(2098182714);
                strG = jx0.g(ibVar.e, ux2Var2);
            } else {
                ux2Var2.W(2098182001);
            }
            ux2Var2.p(false);
            String strZ = m77.z(R.string.select_groups, ux2Var2);
            boolean z5 = !ibVar.f.isEmpty();
            boolean zH = ux2Var2.h(hbVar);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (zH || objK == awVar) {
                objK = new ab(hbVar, b3);
                ux2Var2.g0(objK);
            }
            ds1.w(strG, strZ, z4, z5, (Function0) objK, null, false, "TVTA-devices-add-remote-device-to-your-account-bottom-sheet-select-a-group-input", O(-1885632083, new hw2() { // from class: o.db
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    int i5;
                    int i6;
                    ux2 ux2Var3 = (ux2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (ux2Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        if (z2) {
                            i5 = -988063785;
                            i6 = R.string.select_a_group_no_groups;
                        } else {
                            i5 = -987964089;
                            i6 = R.string.select_groups_to_your_account_disclaimer;
                        }
                        String strM = to7.m(ux2Var3, i5, i6, ux2Var3, false);
                        List listA = ob7.a(strM);
                        long jB = rv0.b(z4 ? 1.0f : 0.38f, ((rn4) ux2Var3.j(un4.a)).a.s);
                        String strB = ob7.b(strM);
                        int iQ = xm4.Q(mv0.Z(listA, 10));
                        if (iQ < 16) {
                            iQ = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
                        for (Object obj3 : listA) {
                            linkedHashMap.put(obj3, j77.a);
                        }
                        qs7.c(g77.s(strB, linkedHashMap, new c77(jB, 0L, ms2.r, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530), jB, ux2Var3, 16), androidx.compose.ui.platform.a.a(cs4.b, "TVTA-devices-add-remote-device-to-your-account-bottom-sheet-select-a-group-disclaimer"), 0L, 0L, 0L, 0L, 0, false, 0, 0, null, null, null, ux2Var3, 48, 0, 524284);
                    } else {
                        ux2Var3.Q();
                    }
                    return f88.a;
                }
            }, ux2Var2), O(-663029458, new t0(ibVar, (byte) 4), ux2Var2), ux2Var2, 918552576, 96);
            Context context = (Context) ux2Var2.j(lh.b);
            String str = ibVar.d;
            Resources resources = (Resources) ux2Var2.j(lh.c);
            boolean zF = ux2Var2.f(str);
            Object objK2 = ux2Var2.K();
            if (zF || objK2 == awVar) {
                Locale locale = Locale.getDefault();
                locale.getClass();
                objK2 = o67.i(resources, locale, R.string.share_assignment_link_text, str);
                ux2Var2.g0(objK2);
            }
            String str2 = (String) objK2;
            boolean zB = ibVar.b();
            int i5 = i4 & 57344;
            boolean zH2 = ux2Var2.h(hbVar) | (i5 == 16384);
            Object objK3 = ux2Var2.K();
            if (zH2 || objK3 == awVar) {
                objK3 = new g0(hbVar, function0, (byte) 5);
                ux2Var2.g0(objK3);
            }
            Function1 function1 = (Function1) objK3;
            boolean zH3 = (i5 == 16384) | ux2Var2.h(context) | ux2Var2.f(str2) | ux2Var2.h(hbVar);
            Object objK4 = ux2Var2.K();
            if (zH3 || objK4 == awVar) {
                z3 = true;
                eb ebVar = new eb((Object) context, (Object) str2, (Object) function0, (Object) hbVar, (byte) 0);
                ux2Var2.g0(ebVar);
                objK4 = ebVar;
            } else {
                z3 = true;
            }
            o(zB, str, function1, (Function0) objK4, null, ux2Var, 0);
            ux2Var2 = ux2Var;
            ux2Var2.p(z3);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new fb(ibVar, hbVar, l33Var, z2, function0, fs4Var2, i2, (byte) 0);
        }
    }

    public static final void k(fs4 fs4Var, ux2 ux2Var, int i2) {
        ux2Var.Y(1933982088);
        byte b2 = 0;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            fs4 fs4VarD = ka0.D(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), 0.0f, 40.0f, 1);
            do4 do4VarC = ua0.c(xz2.s, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarD);
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
            st5.a(null, 0L, 0.0f, 0L, 0, 0.0f, ux2Var, 0, 63);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var, i2, b2);
        }
    }

    public static yx6 l(int i2, int i3, df0 df0Var) {
        int i4 = (i3 & 1) != 0 ? 0 : 1;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        int i5 = i3 & 4;
        df0 df0Var2 = df0.m;
        if (i5 != 0) {
            df0Var = df0Var2;
        }
        if (i2 < 0) {
            gk0.h(fx3.e(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i4 <= 0 && i2 <= 0 && df0Var != df0Var2) {
            yq4.q(df0Var, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i6 = i2 + i4;
        if (i6 < 0) {
            i6 = Integer.MAX_VALUE;
        }
        return new yx6(i4, i6, df0Var);
    }

    public static final void m(Function0 function0, fs4 fs4Var, boolean z2, pw6 pw6Var, ng0 ng0Var, d90 d90Var, nd5 nd5Var, yy0 yy0Var, ux2 ux2Var, int i2) {
        int i3;
        nd5 nd5Var2;
        ux2Var.Y(399974542);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.f(pw6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ux2Var.f(ng0Var) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            i4 |= ux2Var.f(d90Var) ? 1048576 : 524288;
        }
        int i5 = i4 | 113246208;
        if ((805306368 & i2) == 0) {
            i5 |= ux2Var.h(yy0Var) ? 536870912 : 268435456;
        }
        if (ux2Var.N(i5 & 1, (306783379 & i5) != 306783378)) {
            ux2Var.S();
            if ((i2 & 1) == 0 || ux2Var.x()) {
                nd5Var2 = og0.a;
            } else {
                ux2Var.Q();
                nd5Var2 = nd5Var;
            }
            ux2Var.q();
            d(function0, fs4Var, z2, pw6Var, ng0Var, null, d90Var, nd5Var2, yy0Var, ux2Var, i5 & 2147483646, 0);
        } else {
            ux2Var.Q();
            nd5Var2 = nd5Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new vg0(function0, fs4Var, z2, pw6Var, ng0Var, d90Var, nd5Var2, yy0Var, i2);
        }
    }

    public static final void n(fs4 fs4Var, ux2 ux2Var, int i2) {
        ux2Var.Y(-328170309);
        int i3 = i2 | 6;
        byte b2 = 2;
        if (ux2Var.N(i3 & 1, (i3 & 3) != 2)) {
            sb0 sb0VarP = P(ux2Var);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarD = ka0.D(cs4Var, 24.0f, 0.0f, 2);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarD);
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
            i(sb0VarP, null, ux2Var, 0);
            ux2Var.W(-911325857);
            for (int i4 = 0; i4 < 2; i4++) {
                h(sb0VarP, null, ux2Var, 0);
            }
            ux2Var.p(false);
            ux2Var.p(true);
            fs4Var = cs4Var;
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var, i2, b2);
        }
    }

    public static final void o(boolean z2, String str, Function1 function1, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        byte b2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(114673329);
        int i3 = i2 | (ux2Var2.g(z2) ? 4 : 2) | (ux2Var2.f(str) ? 32 : 16) | (ux2Var2.h(function1) ? 256 : 128) | (ux2Var2.h(function0) ? 2048 : 1024) | 24576;
        if (ux2Var2.N(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (z3 || objK == awVar) {
                objK = ub7.i0(str, "https://");
                ux2Var2.g0(objK);
            }
            String str2 = (String) objK;
            x50 x50Var = xz2.y;
            h72 h72Var = un4.a;
            long j2 = ((rn4) ux2Var2.j(h72Var)).a.H;
            qf6 qf6VarA = sf6.a(16.0f);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(ka0.C(s(cs4Var, j2, qf6VarA), 8.0f, 12.0f), 1.0f);
            dg6 dg6VarA = cg6.a(iq8.a, x50Var, ux2Var2, 48);
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
            o67.n(dg6VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            ot7 ot7Var = ((rn4) ux2Var2.j(h72Var)).b.j;
            long jB = rv0.b(z2 ? 1.0f : 0.38f, ((rn4) ux2Var2.j(h72Var)).a.q);
            fs4 fs4VarJ = iq8.j(ka0.F(new s14(1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11), sf6.a(8.0f));
            boolean z4 = (i4 == 32) | ((i3 & 896) == 256);
            Object objK2 = ux2Var2.K();
            if (z4 || objK2 == awVar) {
                b2 = 1;
                objK2 = new u9(function1, str, b2);
                ux2Var2.g0(objK2);
            } else {
                b2 = 1;
            }
            byte b3 = 4;
            qs7.b(str2, androidx.compose.ui.platform.a.a(ka0.B(androidx.compose.foundation.b.b(fs4VarJ, z2, null, null, (Function0) objK2, 14), 8.0f), "TVTA-devices-add-remote-device-to-your-account-bottom-sheet-link"), jB, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ot7Var, ux2Var, 0, 0, 131064);
            lv1.B(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.p(cs4Var, 1.0f), 32.0f), 0.0f, ((rn4) ux2Var.j(h72Var)).a.B, ux2Var, 6);
            ud5 ud5VarT = lv1.T(R.drawable.ic_share, ux2Var, 0);
            String strZ = m77.z(R.string.share_remote_device_link_content_description, ux2Var);
            long jB2 = rv0.b(z2 ? 1.0f : 0.38f, ((rn4) ux2Var.j(h72Var)).a.s);
            fs4 fs4VarJ2 = iq8.j(ka0.F(cs4Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), sf6.a);
            boolean z5 = (i3 & 7168) == 2048;
            Object objK3 = ux2Var.K();
            if (z5 || objK3 == awVar) {
                objK3 = new a9(function0, b3);
                ux2Var.g0(objK3);
            }
            ux2Var2 = ux2Var;
            td3.b(ud5VarT, strZ, androidx.compose.foundation.layout.b.l(androidx.compose.ui.platform.a.a(ka0.B(androidx.compose.foundation.b.b(fs4VarJ2, z2, null, null, (Function0) objK3, 14), 8.0f), "TVTA-devices-add-remote-device-to-your-account-bottom-sheet-share-link"), 24.0f), jB2, ux2Var2, 8, 0);
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new xa(z2, str, function1, function0, fs4Var2, i2);
        }
    }

    public static final void p(Function0 function0, fs4 fs4Var, boolean z2, pw6 pw6Var, ng0 ng0Var, nd5 nd5Var, iw2 iw2Var, ux2 ux2Var, int i2, int i3) {
        int i4;
        pw6 pw6Var2;
        ng0 ng0Var2;
        fs4 fs4Var2;
        boolean z3;
        nd5 nd5Var2;
        pw6 pw6VarB;
        ng0 ng0VarD;
        ng0 ng0Var3;
        nd5 nd5Var3;
        boolean z4;
        pw6 pw6Var3;
        fs4 fs4Var3;
        ux2Var.Y(-1061374109);
        if ((i2 & 6) == 0) {
            i4 = (ux2Var.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= ux2Var.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                pw6Var2 = pw6Var;
                int i7 = ux2Var.f(pw6Var2) ? 2048 : 1024;
                i4 |= i7;
            } else {
                pw6Var2 = pw6Var;
            }
            i4 |= i7;
        } else {
            pw6Var2 = pw6Var;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                ng0Var2 = ng0Var;
                int i8 = ux2Var.f(ng0Var2) ? 16384 : 8192;
                i4 |= i8;
            } else {
                ng0Var2 = ng0Var;
            }
            i4 |= i8;
        } else {
            ng0Var2 = ng0Var;
        }
        int i9 = i4 | 115015680;
        if ((805306368 & i2) == 0) {
            i9 |= ux2Var.h(iw2Var) ? 536870912 : 268435456;
        }
        if (ux2Var.N(i9 & 1, (306783379 & i9) != 306783378)) {
            ux2Var.S();
            if ((i2 & 1) == 0 || ux2Var.x()) {
                if (i5 != 0) {
                    fs4Var = cs4.b;
                }
                boolean z5 = i6 == 0 ? z2 : true;
                if ((i3 & 8) != 0) {
                    pd5 pd5Var = og0.a;
                    pw6VarB = ux6.b(j51.b, ux2Var);
                    i9 &= -7169;
                } else {
                    pw6VarB = pw6Var2;
                }
                if ((i3 & 16) != 0) {
                    pd5 pd5Var2 = og0.a;
                    ng0VarD = og0.d(((rn4) ux2Var.j(un4.a)).a);
                    i9 &= -57345;
                } else {
                    ng0VarD = ng0Var2;
                }
                ng0Var3 = ng0VarD;
                nd5Var3 = og0.b;
                z4 = z5;
                pw6Var3 = pw6VarB;
                fs4Var3 = fs4Var;
            } else {
                ux2Var.Q();
                if ((i3 & 8) != 0) {
                    i9 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    i9 &= -57345;
                }
                fs4Var3 = fs4Var;
                z4 = z2;
                nd5Var3 = nd5Var;
                pw6Var3 = pw6Var2;
                ng0Var3 = ng0Var2;
            }
            ux2Var.q();
            d(function0, fs4Var3, z4, pw6Var3, ng0Var3, null, null, nd5Var3, iw2Var, ux2Var, i9 & 2147483646, 0);
            ng0Var2 = ng0Var3;
            nd5Var2 = nd5Var3;
            pw6Var2 = pw6Var3;
            z3 = z4;
            fs4Var2 = fs4Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            z3 = z2;
            nd5Var2 = nd5Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ij(function0, fs4Var2, z3, pw6Var2, ng0Var2, nd5Var2, iw2Var, i2, i3);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static void q(o.o61 r40, o.ba4 r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.au8.q(o.o61, o.ba4, java.util.ArrayList, int):void");
    }

    public static fs4 r(fs4 fs4Var, sb0 sb0Var, pw6 pw6Var, int i2) {
        if ((i2 & 2) != 0) {
            pw6Var = kh.V;
        }
        return fs4Var.f(new e20(0L, sb0Var, pw6Var, 1));
    }

    public static final fs4 s(fs4 fs4Var, long j2, pw6 pw6Var) {
        return fs4Var.f(new e20(j2, null, pw6Var, 2));
    }

    public static final int t(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static String u(int i2, int i3, int i4, String str, String str2) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        int i6 = i3;
        boolean z2 = (i4 & 8) == 0;
        boolean z3 = (i4 & 16) == 0;
        boolean z4 = (i4 & 32) == 0;
        boolean z5 = (i4 & 64) == 0;
        str.getClass();
        return v(str, i5, i6, str2, z2, z3, z4, z5, 128);
    }

    public static String v(String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i4) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z6 = (i4 & 8) != 0 ? false : z2;
        boolean z7 = (i4 & 16) != 0 ? false : z3;
        boolean z8 = (i4 & 64) == 0 ? z5 : false;
        str.getClass();
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i6 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || ub7.R(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z6 || (z7 && !E(iCharCount, length, str)))) || (iCodePointAt == 43 && z4)))) {
                bf0 bf0Var = new bf0();
                bf0Var.Y0(i5, iCharCount, str);
                bf0 bf0Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z6 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            bf0Var.Z0("+");
                        } else if (iCodePointAt2 == 43 && z4) {
                            bf0Var.Z0(z6 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i6 && !z8) || ub7.R(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z6 || (z7 && !E(iCharCount, length, str)))))) {
                            if (bf0Var2 == null) {
                                bf0Var2 = new bf0();
                            }
                            bf0Var2.a1(iCodePointAt2);
                            while (!bf0Var2.z()) {
                                byte bC0 = bf0Var2.c0();
                                bf0Var.U0(37);
                                char[] cArr = U0;
                                bf0Var.U0(cArr[((bC0 & 255) >> 4) & 15]);
                                bf0Var.U0(cArr[bC0 & 15]);
                            }
                        } else {
                            bf0Var.a1(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i6 = 128;
                }
                return bf0Var.N0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i5, length);
    }

    public static final String w(ns4 ns4Var, xz2 xz2Var) {
        xz2Var.getClass();
        fi1 fi1VarI = ns4Var.i();
        fi1VarI.getClass();
        sy4 name = ns4Var.getName();
        sy4 sy4Var = a87.a;
        if (name == null || name.n) {
            name = a87.c;
        }
        String strC = name.c();
        if (!(fi1VarI instanceof ad5)) {
            ns4 ns4Var2 = fi1VarI instanceof ns4 ? (ns4) fi1VarI : null;
            if (ns4Var2 == null) {
                yq4.s("Unexpected container: ", fi1VarI, " for ", ns4Var);
                return null;
            }
            return w(ns4Var2, xz2Var) + '$' + strC;
        }
        ht2 ht2Var = ((bd5) ((ad5) fi1VarI)).q;
        if (ht2Var.d()) {
            return strC;
        }
        String strReplace = ht2Var.b().replace('.', '/');
        strReplace.getClass();
        return strReplace + '/' + strC;
    }

    public static final Object x(Class cls, Map map, List list) {
        cls.getClass();
        list.getClass();
        kh7 kh7Var = new kh7(new a3(map, (byte) 3));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new fp(cls, map, new kh7(new e3((byte) 2, cls, map, false)), kh7Var, list));
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }

    public static int y(int i2, int i3, String str, boolean z2) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final void z(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }
}
