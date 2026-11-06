package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.remotecontrolviewlib.activity.WebLoginActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.AndroidKeyChainByteArray;
import com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.AndroidKeyChainByteArrayVector;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class iq8 {
    public static final aw0 A;
    public static final aw0 B;
    public static final float C;
    public static final aw0 D;
    public static final float E;
    public static final float F;
    public static final aw0 G;
    public static final ji2 H;
    public static final aw0 I;
    public static final float J;
    public static final aw0 K;
    public static final aw0 L;
    public static final aw0 M;
    public static final String[] N;
    public static final vs6 O;
    public static final ol5 P;
    public static int Q;
    public static final ju a;
    public static final ir b;
    public static final bw c = new bw((byte) 1);
    public static final bw d = new bw((byte) 0);
    public static final cw e = new cw(0);
    public static final cw f;
    public static final cw g;
    public static final cw h;
    public static final yy0 i;
    public static final yy0 j;
    public static final yy0 k;
    public static final yy0 l;
    public static final yy0 m;
    public static final yy0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yy0 f1091o;
    public static final yy0 p;
    public static final yy0 q;
    public static final yy0 r;
    public static final yy0 s;
    public static final yy0 t;
    public static final yy0 u;
    public static final int[] v;
    public static final int[] w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;

    static {
        byte b2 = 1;
        a = new ju(b2);
        b = new ir(b2);
        byte b3 = 3;
        f = new cw(b3);
        byte b4 = 2;
        g = new cw(b4);
        h = new cw(b2);
        new yy0(657782987, false, new zy0(b2));
        new yy0(-1270442071, false, new p20((byte) 12));
        new yy0(2094288676, false, new zy0(b4));
        new yy0(-1342205566, false, new p20((byte) 13));
        new yy0(575301698, false, new zy0(b3));
        i = new yy0(-643931612, false, new p20((byte) 14));
        byte b5 = 4;
        new yy0(-684072357, false, new zy0(b5));
        byte b6 = 15;
        new yy0(2136598717, false, new p20(b6));
        j = new yy0(-463994782, false, new az0((byte) 6));
        k = new yy0(-1869186460, false, new az0((byte) 7));
        l = new yy0(-735524565, false, new bz0(b3));
        m = new yy0(-1438120404, false, new bz0(b5));
        n = new yy0(965467837, false, new az0((byte) 22));
        f1091o = new yy0(-419197388, false, new az0((byte) 23));
        p = new yy0(666457186, false, new az0((byte) 24));
        q = new yy0(-39202156, false, new hz0(b4));
        r = new yy0(1582488484, false, new hz0(b3));
        s = new yy0(414328099, false, new hz0(b5));
        t = new yy0(-1514016380, false, new hz0((byte) 5));
        u = new yy0(17047608, false, new iz0(b6));
        v = new int[]{0, 4, 1, 5};
        w = new int[]{6, 2, 7, 3};
        x = new int[]{8, 1, 1, 1, 1, 1, 1, 3};
        y = new int[]{7, 1, 1, 3, 1, 1, 1, 2, 1};
        z = new int[]{0, 180, 270, 90};
        aw0 aw0Var = aw0.y;
        A = aw0Var;
        B = aw0.t;
        C = 0.1f;
        aw0 aw0Var2 = aw0.u;
        D = aw0Var2;
        E = 0.38f;
        F = 1.0f;
        G = aw0.q;
        H = new ji2((byte) 26);
        I = aw0Var2;
        J = 0.38f;
        K = aw0Var2;
        L = aw0.x;
        M = aw0Var;
        N = new String[]{"input", "keygen", "object", "select", "textarea"};
        O = new vs6((byte) 19);
        P = new ol5((byte) 18);
    }

    public static void A(int i2, int[] iArr, int[] iArr2, boolean z2) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float fMax = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z2 && iArr.length == 1) ? fMax : 0.0f;
        if (z2) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + fMax;
            i3++;
            i7++;
        }
    }

    public static void B(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z2) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }

    public static void C(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static final byte[] D(AndroidKeyChainByteArray androidKeyChainByteArray) {
        byte[] data;
        return (androidKeyChainByteArray == null || (data = androidKeyChainByteArray.getData()) == null) ? new byte[0] : data;
    }

    public static final byte[][] E(AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector) {
        if (androidKeyChainByteArrayVector == null) {
            return new byte[0][];
        }
        ArrayList arrayList = new ArrayList(androidKeyChainByteArrayVector.size());
        int size = androidKeyChainByteArrayVector.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(androidKeyChainByteArrayVector.get(i2).getData());
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    public static String F(int i2) {
        if (i2 == 0) {
            return "Clear";
        }
        if (i2 == 1) {
            return "Src";
        }
        if (i2 == 2) {
            return "Dst";
        }
        if (i2 == 3) {
            return "SrcOver";
        }
        if (i2 == 4) {
            return "DstOver";
        }
        if (i2 == 5) {
            return "SrcIn";
        }
        if (i2 == 6) {
            return "DstIn";
        }
        if (i2 == 7) {
            return "SrcOut";
        }
        if (i2 == 8) {
            return "DstOut";
        }
        if (i2 == 9) {
            return "SrcAtop";
        }
        if (i2 == 10) {
            return "DstAtop";
        }
        if (i2 == 11) {
            return "Xor";
        }
        if (i2 == 12) {
            return "Plus";
        }
        if (i2 == 13) {
            return "Modulate";
        }
        if (i2 == 14) {
            return "Screen";
        }
        if (i2 == 15) {
            return "Overlay";
        }
        if (i2 == 16) {
            return "Darken";
        }
        if (i2 == 17) {
            return "Lighten";
        }
        if (i2 == 18) {
            return "ColorDodge";
        }
        if (i2 == 19) {
            return "ColorBurn";
        }
        if (i2 == 20) {
            return "HardLight";
        }
        if (i2 == 21) {
            return "Softlight";
        }
        if (i2 == 22) {
            return "Difference";
        }
        if (i2 == 23) {
            return "Exclusion";
        }
        if (i2 == 24) {
            return "Multiply";
        }
        if (i2 == 25) {
            return "Hue";
        }
        if (i2 == 26) {
            return "Saturation";
        }
        if (i2 == 27) {
            return "Color";
        }
        return i2 == 28 ? "Luminosity" : "Unknown";
    }

    public static void G(Object obj) throws Throwable {
        if (obj instanceof tn8) {
            throw ((tn8) obj).a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static final void a(final l33 l33Var, final ArrayList arrayList, final List list, final Function0 function0, Function1 function1, fs4 fs4Var, int i2, vb vbVar, ux2 ux2Var, int i3) {
        fs4 fs4Var2;
        vb vbVar2;
        char c2;
        int i4;
        ux2 ux2Var2;
        vb vbVar3;
        int i5;
        fs4 fs4Var3;
        vb vbVar4;
        boolean z2;
        ux2 ux2Var3 = ux2Var;
        list.getClass();
        function0.getClass();
        function1.getClass();
        ux2Var3.Y(483953266);
        int i6 = i3 | (ux2Var3.h(l33Var) ? 4 : 2) | (ux2Var3.f(arrayList) ? 32 : 16) | (ux2Var3.f(list) ? 256 : 128) | (ux2Var3.h(function0) ? 2048 : 1024) | (ux2Var3.h(function1) ? 16384 : 8192) | 196608 | (ux2Var3.d(i2) ? 1048576 : 524288) | 4194304;
        if (ux2Var3.N(i6 & 1, (4793491 & i6) != 4793490)) {
            ux2Var3.S();
            int i7 = i3 & 1;
            cs4 cs4Var = cs4.b;
            if (i7 == 0 || ux2Var3.x()) {
                List list2 = vb.D;
                dl5 dl5Var = new dl5(new e5((byte) 6), (byte) 1);
                we8 we8VarA = id4.a(ux2Var3);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c2 = true;
                i4 = 0;
                oe8 oe8VarT = g57.t(w86.a.b(vb.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var3);
                ux2Var2 = ux2Var3;
                vbVar3 = (vb) oe8VarT;
                i5 = i6 & (-29360129);
                fs4Var3 = cs4Var;
            } else {
                ux2Var3.Q();
                i5 = i6 & (-29360129);
                ux2Var2 = ux2Var3;
                i4 = 0;
                fs4Var3 = fs4Var;
                c2 = true;
                vbVar3 = vbVar;
            }
            ux2Var2.q();
            Object[] objArr = new Object[i4];
            int i8 = (i5 & 3670016) == 1048576 ? c2 : i4;
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (i8 != 0 || objK == awVar) {
                objK = new ra(i2, i4);
                ux2Var2.g0(objK);
            }
            yf5 yf5Var = (yf5) zu1.L(objArr, (Function0) objK, ux2Var2, i4);
            Object[] objArr2 = new Object[i4];
            Object objK2 = ux2Var2.K();
            byte b2 = 5;
            if (objK2 == awVar) {
                objK2 = new e5(b2);
                ux2Var2.g0(objK2);
            }
            final px4 px4Var = (px4) zu1.L(objArr2, (Function0) objK2, ux2Var2, 48);
            final px4 px4VarG = g57.g(vbVar3.t, ux2Var2);
            final px4 px4VarG2 = g57.g(vbVar3.v, ux2Var2);
            Context context = (Context) ux2Var2.j(lh.b);
            Activity activityZ = us1.z(context);
            px4 px4VarT = h57.t(function0, ux2Var2);
            px4 px4VarT2 = h57.t(function1, ux2Var2);
            e8 e8Var = new e8((byte) 3);
            boolean zF = ux2Var2.f(px4VarT2) | ux2Var2.f(px4VarT);
            Object objK3 = ux2Var2.K();
            if (zF || objK3 == awVar) {
                objK3 = new ua(px4VarT2, px4VarT, (byte) 0);
                ux2Var2.g0(objK3);
            }
            qk4 qk4VarX0 = db8.x0(e8Var, (Function1) objK3, ux2Var2);
            boolean zH = ux2Var2.h(vbVar3);
            Object objK4 = ux2Var2.K();
            if (zH || objK4 == awVar) {
                i0 i0Var = new i0(1, vbVar3, vb.class, "updateViaIdDeviceName", "updateViaIdDeviceName(Ljava/lang/String;)V", 0, (byte) 6);
                ux2Var2.g0(i0Var);
                objK4 = i0Var;
            }
            Function1 function2 = (Function1) ((pu3) objK4);
            boolean zH2 = ux2Var2.h(vbVar3);
            Object objK5 = ux2Var2.K();
            if (zH2 || objK5 == awVar) {
                objK5 = new i0(1, vbVar3, vb.class, "updateViaIdTeamViewerID", "updateViaIdTeamViewerID(Ljava/lang/String;)V", 0, (byte) 7);
                ux2Var2.g0(objK5);
            }
            Function1 function3 = (Function1) ((pu3) objK5);
            boolean zH3 = ux2Var2.h(vbVar3);
            Object objK6 = ux2Var2.K();
            if (zH3 || objK6 == awVar) {
                objK6 = new i0(1, vbVar3, vb.class, "updateViaIdGroup", "updateViaIdGroup(Lcom/teamviewer/remotecontrolviewmodellib/devicetab/groups/data/GroupInfo;)V", 0, (byte) 8);
                ux2Var2.g0(objK6);
            }
            Function1 function4 = (Function1) ((pu3) objK6);
            boolean zH4 = ux2Var2.h(vbVar3);
            Object objK7 = ux2Var2.K();
            if (zH4 || objK7 == awVar) {
                objK7 = new i0(1, vbVar3, vb.class, "setViaIdPreSelectedGroup", "setViaIdPreSelectedGroup(Lcom/teamviewer/remotecontrolviewmodellib/devicetab/groups/data/GroupInfo;)V", 0, (byte) 9);
                ux2Var2.g0(objK7);
            }
            Function1 function5 = (Function1) ((pu3) objK7);
            boolean zH5 = ux2Var2.h(vbVar3);
            Object objK8 = ux2Var2.K();
            if (zH5 || objK8 == awVar) {
                objK8 = new i0(1, vbVar3, vb.class, "updateViaIdPassword", "updateViaIdPassword(Ljava/lang/String;)V", 0, (byte) 10);
                ux2Var2.g0(objK8);
            }
            Function1 function6 = (Function1) ((pu3) objK8);
            boolean zH6 = ux2Var2.h(vbVar3);
            Object objK9 = ux2Var2.K();
            if (zH6 || objK9 == awVar) {
                objK9 = new i0(1, vbVar3, vb.class, "updateViaIdDescription", "updateViaIdDescription(Ljava/lang/String;)V", 0, (byte) 11);
                ux2Var2.g0(objK9);
            }
            Function1 function7 = (Function1) ((pu3) objK9);
            boolean zH7 = ux2Var2.h(vbVar3);
            Object objK10 = ux2Var2.K();
            if (zH7 || objK10 == awVar) {
                objK10 = new m9(0, vbVar3, vb.class, "addViaIdDevice", "addViaIdDevice()V", 0, (byte) 2);
                ux2Var2.g0(objK10);
            }
            Function0 function8 = (Function0) ((pu3) objK10);
            boolean zF2 = ux2Var2.f(px4Var);
            Object objK11 = ux2Var2.K();
            if (zF2 || objK11 == awVar) {
                objK11 = new va(px4Var, (byte) 0);
                ux2Var2.g0(objK11);
            }
            final ja jaVar = new ja(function2, function3, function4, function5, function6, function7, function8, (Function1) objK11);
            boolean zH8 = ux2Var2.h(vbVar3);
            Object objK12 = ux2Var2.K();
            if (zH8 || objK12 == awVar) {
                objK12 = new i0(1, vbVar3, vb.class, "updateToYourAccountDeviceName", "updateToYourAccountDeviceName(Ljava/lang/String;)V", 0, (byte) 12);
                ux2Var2.g0(objK12);
            }
            pu3 pu3Var = (pu3) objK12;
            boolean zH9 = ux2Var2.h(vbVar3);
            Object objK13 = ux2Var2.K();
            if (zH9 || objK13 == awVar) {
                i0 i0Var2 = new i0(1, vbVar3, vb.class, "updateToYourAccountGroups", "updateToYourAccountGroups(Ljava/util/List;)V", 0, (byte) 13);
                ux2Var2.g0(i0Var2);
                objK13 = i0Var2;
            }
            pu3 pu3Var2 = (pu3) objK13;
            boolean zH10 = ux2Var2.h(vbVar3);
            Object objK14 = ux2Var2.K();
            if (zH10 || objK14 == awVar) {
                i0 i0Var3 = new i0(1, vbVar3, vb.class, "setToYourAccountPreSelectedGroup", "setToYourAccountPreSelectedGroup(Lcom/teamviewer/remotecontrolviewmodellib/devicetab/groups/data/GroupInfo;)V", 0, (byte) 14);
                ux2Var2.g0(i0Var3);
                objK14 = i0Var3;
            }
            pu3 pu3Var3 = (pu3) objK14;
            boolean zH11 = ux2Var2.h(vbVar3);
            Object objK15 = ux2Var2.K();
            if (zH11 || objK15 == awVar) {
                m9 m9Var = new m9(0, vbVar3, vb.class, "getCustomModuleLink", "getCustomModuleLink()V", 0, (byte) 3);
                ux2Var2.g0(m9Var);
                objK15 = m9Var;
            }
            pu3 pu3Var4 = (pu3) objK15;
            boolean zH12 = ux2Var2.h(vbVar3);
            Object objK16 = ux2Var2.K();
            if (zH12 || objK16 == awVar) {
                i0 i0Var4 = new i0(1, vbVar3, vb.class, "copyAssignmentLink", "copyAssignmentLink(Ljava/lang/String;)V", 0, (byte) 15);
                ux2Var2.g0(i0Var4);
                objK16 = i0Var4;
            }
            pu3 pu3Var5 = (pu3) objK16;
            boolean zH13 = ux2Var2.h(vbVar3);
            Object objK17 = ux2Var2.K();
            if (zH13 || objK17 == awVar) {
                m9 m9Var2 = new m9(0, vbVar3, vb.class, "shareAssignmentLinkError", "shareAssignmentLinkError()V", 0, (byte) 4);
                ux2Var2.g0(m9Var2);
                objK17 = m9Var2;
            }
            pu3 pu3Var6 = (pu3) objK17;
            Function1 function9 = (Function1) pu3Var;
            Function1 function10 = (Function1) pu3Var2;
            Function1 function11 = (Function1) pu3Var3;
            Function0 function12 = (Function0) pu3Var4;
            boolean zH14 = ux2Var2.h(context) | ux2Var2.f(px4VarG2) | ux2Var2.h(qk4VarX0);
            Object objK18 = ux2Var2.K();
            if (zH14 || objK18 == awVar) {
                objK18 = new n5(context, qk4VarX0, px4VarG2, (byte) 1);
                ux2Var2.g0(objK18);
            }
            Function0 function13 = (Function0) objK18;
            Function0 function14 = (Function0) pu3Var6;
            Function1 function15 = (Function1) pu3Var5;
            boolean zF3 = ux2Var2.f(px4Var);
            Object objK19 = ux2Var2.K();
            if (zF3 || objK19 == awVar) {
                objK19 = new va(px4Var, (byte) 1);
                ux2Var2.g0(objK19);
            }
            final hb hbVar = new hb(function12, function13, function14, function9, function10, function11, function15, (Function1) objK19);
            r36 r36Var = vbVar3.x;
            boolean zH15 = ux2Var2.h(vbVar3) | ux2Var2.f(px4VarT2) | ux2Var2.f(px4VarT);
            Object objK20 = ux2Var2.K();
            if (zH15 || objK20 == awVar) {
                vb vbVar5 = vbVar3;
                objK20 = new j0((Object) vbVar5, (Object) px4VarT2, (Object) px4VarT, (hc1) null, (byte) 2);
                vbVar4 = vbVar5;
                ux2Var2.g0(objK20);
            } else {
                vbVar4 = vbVar3;
            }
            ck3.i(r36Var, (hw2) objK20, ux2Var2);
            boolean zH16 = ux2Var2.h(activityZ) | ux2Var2.h(vbVar4);
            Object objK21 = ux2Var2.K();
            if (zH16 || objK21 == awVar) {
                objK21 = new g0(activityZ, vbVar4, (byte) 3);
                ux2Var2.g0(objK21);
            }
            ck3.e(f88.a, (Function1) objK21, ux2Var2);
            fs4 fs4VarF = ka0.F(fs4Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            fs4 fs4Var4 = fs4Var3;
            kw0 kw0VarA = iw0.a(c, xz2.B, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarF);
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
            ea0 ea0Var = (ea0) px4Var.getValue();
            boolean z3 = yf5Var.z() == 1;
            boolean zF4 = ux2Var2.f(px4Var);
            Object objK22 = ux2Var2.K();
            if (zF4 || objK22 == awVar) {
                objK22 = new la(px4Var, (byte) 0);
                ux2Var2.g0(objK22);
            }
            ux2 ux2Var4 = ux2Var2;
            b(ea0Var, z3, (Function0) objK22, ka0.D(cs4Var, 16.0f, 0.0f, 2), ux2Var4, 3072);
            if (((ea0) px4Var.getValue()) == ea0.m) {
                ux2Var4.W(-1969898418);
                int iZ = yf5Var.z();
                boolean zF5 = ux2Var4.f(yf5Var);
                Object objK23 = ux2Var4.K();
                if (zF5 || objK23 == awVar) {
                    z2 = false;
                    objK23 = new ma(yf5Var, 0 == true ? 1 : 0);
                    ux2Var4.g0(objK23);
                } else {
                    z2 = false;
                }
                c(iZ, (Function1) objK23, ka0.D(cs4Var, 16.0f, 0.0f, 2), ux2Var4, 384);
                ux2Var4.p(z2);
            } else {
                ux2Var4.W(-1969579366);
                ux2Var4.p(false);
            }
            Integer numValueOf = Integer.valueOf(yf5Var.z());
            Object objK24 = ux2Var4.K();
            if (objK24 == awVar) {
                objK24 = new t2((byte) 5);
                ux2Var4.g0(objK24);
            }
            ux2Var3 = ux2Var4;
            im3.a(numValueOf, null, (Function1) objK24, null, "AddRemoteDeviceTabContent", null, au8.O(-1634799182, new jw2() { // from class: o.sa
                @Override // o.jw2
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj2).intValue();
                    ux2 ux2Var5 = (ux2) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    ((jn) obj).getClass();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= ux2Var5.d(iIntValue) ? 32 : 16;
                    }
                    if (ux2Var5.N(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        l33 l33Var2 = l33Var;
                        Function0 function16 = function0;
                        px4 px4Var2 = px4Var;
                        if (iIntValue == 0) {
                            ux2Var5.W(-1668149396);
                            kh.a((ea0) px4Var2.getValue(), l33Var2, arrayList, (ob) px4VarG.getValue(), jaVar, function16, null, ux2Var5, 0);
                            ux2Var5.p(false);
                        } else if (iIntValue != 1) {
                            ux2Var5.W(-1667181328);
                            ux2Var5.p(false);
                        } else {
                            ux2Var5.W(-1667653613);
                            au8.a((ea0) px4Var2.getValue(), l33Var2, list, (ib) px4VarG2.getValue(), hbVar, function16, null, ux2Var5, 0);
                            ux2Var5.p(false);
                        }
                    } else {
                        ux2Var5.Q();
                    }
                    return f88.a;
                }
            }, ux2Var4), ux2Var3, 1597824);
            ux2Var3.p(true);
            vbVar2 = vbVar4;
            fs4Var2 = fs4Var4;
        } else {
            ux2Var3.Q();
            fs4Var2 = fs4Var;
            vbVar2 = vbVar;
        }
        j56 j56VarR = ux2Var3.r();
        if (j56VarR != null) {
            j56VarR.d = new ta(l33Var, arrayList, list, function0, function1, fs4Var2, i2, vbVar2, i3);
        }
    }

    public static final void b(ea0 ea0Var, boolean z2, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i2) {
        ux2Var.Y(-1352966215);
        int i3 = i2 | (ux2Var.d(ea0Var.ordinal()) ? 4 : 2) | (ux2Var.g(z2) ? 32 : 16) | (ux2Var.h(function0) ? 256 : 128);
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            int iOrdinal = ea0Var.ordinal();
            if (iOrdinal == 0) {
                ux2Var.W(2051808347);
                jx0.a(m77.z(R.string.add_remote_device, ux2Var), "TVTA-groupBottomSheet-addRemoteDevice-title", fs4Var, null, ux2Var, 432, 8);
                ux2Var.p(false);
            } else {
                if (iOrdinal != 1) {
                    throw fx3.m(1174564440, ux2Var, false);
                }
                ux2Var.W(2052105699);
                jx0.a(m77.z(z2 ? R.string.select_groups : R.string.select_a_group, ux2Var), "TVTA-groupBottomSheet-addRemoteDevice-selectGroup", fs4Var, function0, ux2Var, 432 | ((i3 << 3) & 7168), 0);
                ux2Var.p(false);
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new na(ea0Var, z2, function0, fs4Var, i2);
        }
    }

    public static final void c(int i2, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i3) {
        ux2Var.Y(1600091397);
        int i4 = (ux2Var.d(i2) ? 4 : 2) | i3 | (ux2Var.h(function1) ? 32 : 16);
        byte b2 = 0;
        if (ux2Var.N(i4 & 1, (i4 & 147) != 146)) {
            x37.b(i2, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), "TVTA-groupBottomSheet-addRemoteDevice-tabs"), 0L, 0L, au8.O(-340822639, new oa(i2, b2), ux2Var), null, au8.O(-1674366021, new pa(qf0.L(m77.z(R.string.teamviewer_id, ux2Var), m77.z(R.string.to_your_account, ux2Var)), i2, function1), ux2Var), ux2Var, (i4 & 14) | 1597440, 44);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pa(i2, function1, fs4Var, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024c  */
    /* JADX WARN: Code duplicated, block: B:105:0x027a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0280  */
    /* JADX WARN: Code duplicated, block: B:108:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x028a  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:111:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:114:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:118:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:121:0x0301  */
    /* JADX WARN: Code duplicated, block: B:123:0x031a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0327  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x0135  */
    /* JADX WARN: Code duplicated, block: B:81:0x0139  */
    /* JADX WARN: Code duplicated, block: B:84:0x0198  */
    /* JADX WARN: Code duplicated, block: B:85:0x019c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:97:0x023e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0246  */
    public static final void d(final z31 z31Var, final fs4 fs4Var, String str, boolean z2, boolean z3, final Function0 function0, ux2 ux2Var, final int i2, final int i3) {
        int i4;
        String str2;
        int i5;
        boolean z4;
        int i6;
        int i7;
        boolean z5;
        int i8;
        Function0 function1;
        int i9;
        boolean z6;
        final String str3;
        final boolean z7;
        final boolean z8;
        j56 j56VarR;
        String str4;
        boolean z9;
        boolean z10;
        long j2;
        boolean z11;
        tg3 tg3Var;
        boolean z12;
        Object objK;
        boolean z13;
        boolean z14;
        List list;
        int size;
        String strA;
        int i10;
        ux2 ux2Var2 = ux2Var;
        z31Var.getClass();
        String str5 = z31Var.g;
        ux2Var2.Y(1907603486);
        if ((i2 & 6) == 0) {
            i4 = (ux2Var2.f(z31Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var2.f(fs4Var) ? 32 : 16;
        }
        int i11 = i3 & 4;
        if (i11 == 0) {
            if ((i2 & 384) == 0) {
                str2 = str;
                i4 |= ux2Var2.f(str2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    z4 = z2;
                    if (ux2Var2.g(z4)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((i2 & 24576) == 0) {
                        z5 = z3;
                        if (ux2Var2.g(z5)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((196608 & i2) == 0) {
                        function1 = function0;
                        if (ux2Var2.h(function1)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    } else {
                        function1 = function0;
                    }
                    i9 = i4;
                    if ((i9 & 74899) != 74898) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (ux2Var2.N(i9 & 1, z6)) {
                        if (i11 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        if (i5 != 0) {
                            z9 = true;
                        } else {
                            z9 = z4;
                        }
                        if (i7 != 0) {
                            z10 = false;
                        } else {
                            z10 = z5;
                        }
                        fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
                        if (z10) {
                            ux2Var2.W(-1591458386);
                            j2 = ((rn4) ux2Var2.j(un4.a)).a.G;
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(-1591368021);
                            ux2Var2.p(false);
                            j2 = rv0.g;
                        }
                        fs4 fs4VarD = ka0.D(androidx.compose.foundation.b.b(au8.s(fs4VarC, j2, kh.V), false, null, null, function1, 15), 0.0f, 8.0f, 1);
                        dg6 dg6VarA = cg6.a(a, xz2.y, ux2Var2, 48);
                        int iHashCode = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL = ux2Var2.l();
                        fs4 fs4VarS = uf0.s(ux2Var2, fs4VarD);
                        yz0.c.getClass();
                        ux2Var2.a0();
                        z11 = ux2Var2.S;
                        tg3Var = LayoutNode.e0;
                        if (z11) {
                            ux2Var2.k(tg3Var);
                        } else {
                            ux2Var2.j0();
                        }
                        iz0 iz0Var = d82.v;
                        o67.n(dg6VarA, iz0Var, ux2Var2);
                        iz0 iz0Var2 = d82.u;
                        o67.n(yj5VarL, iz0Var2, ux2Var2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        iz0 iz0Var3 = d82.w;
                        o67.n(numValueOf, iz0Var3, ux2Var2);
                        o67.l(ux2Var2);
                        iz0 iz0Var4 = d82.t;
                        o67.n(fs4VarS, iz0Var4, ux2Var2);
                        String str6 = str4;
                        e(z31Var.a, z31Var.i, z31Var.j, z31Var.k, null, z31Var.h, ux2Var2, 0);
                        kw0 kw0VarA = iw0.a(c, xz2.A, ux2Var2, 0);
                        int iHashCode2 = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL2 = ux2Var2.l();
                        cs4 cs4Var = cs4.b;
                        fs4 fs4VarS2 = uf0.s(ux2Var2, cs4Var);
                        ux2Var2.a0();
                        if (ux2Var2.S) {
                            ux2Var2.k(tg3Var);
                        } else {
                            ux2Var2.j0();
                        }
                        o67.n(kw0VarA, iz0Var, ux2Var2);
                        o67.n(yj5VarL2, iz0Var2, ux2Var2);
                        e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
                        o67.n(fs4VarS2, iz0Var4, ux2Var2);
                        fs4 fs4VarF = ka0.F(cs4Var, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                        if ((i9 & 14) == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objK = ux2Var2.K();
                        if (z12 || objK == e01.a) {
                            objK = new q0(z31Var, (byte) 29);
                            ux2Var2.g0(objK);
                        }
                        fs4 fs4VarA = cp6.a(fs4VarF, false, (Function1) objK);
                        int i12 = (i9 >> 3) & 112;
                        xo xoVarH = h(z31Var.a, str6, ux2Var2, i12);
                        h72 h72Var = un4.a;
                        qs7.c(xoVarH, fs4VarA, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, 0L, 0L, 2, false, 1, 0, null, null, ((rn4) ux2Var2.j(h72Var)).b.j, ux2Var, 0, 24960, 241656);
                        ux2Var2 = ux2Var;
                        if (z9) {
                            ux2Var2.W(-532425932);
                            if (str5 != null || ub7.b0(str5)) {
                                z14 = false;
                                ux2Var2.W(-532382377);
                                list = z31Var.b;
                                ux2Var2.W(-946196544);
                                if (list.isEmpty()) {
                                    ux2Var2.p(false);
                                    strA = null;
                                    z13 = true;
                                } else {
                                    z13 = true;
                                    size = list.size() - 1;
                                    if (size == 0) {
                                        ux2Var2.W(1238194183);
                                        ux2Var2.p(false);
                                        strA = (String) lv0.m0(list);
                                    } else if (size != 1) {
                                        ux2Var2.W(1238200794);
                                        strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                        ux2Var2.p(false);
                                    } else {
                                        ux2Var2.W(1238195162);
                                        strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                        ux2Var2.p(false);
                                    }
                                    ux2Var2.p(false);
                                }
                                if (strA != null || strA.length() == 0) {
                                    ux2Var2.W(-532147490);
                                    ux2Var2.p(false);
                                } else {
                                    ux2Var2.W(-532235902);
                                    g(new xo(strA), ux2Var2, 0);
                                    ux2Var2.p(false);
                                }
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(-532118846);
                                z14 = false;
                                g(h(str5, str6, ux2Var2, i12), ux2Var2, 0);
                                ux2Var2.p(false);
                                z13 = true;
                            }
                            ux2Var2.p(z14);
                        } else {
                            z13 = true;
                            ux2Var2.W(-531955042);
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(z13);
                        ux2Var2.p(z13);
                        str3 = str6;
                        z7 = z9;
                        z8 = z10;
                    } else {
                        ux2Var2.Q();
                        str3 = str2;
                        z7 = z4;
                        z8 = z5;
                    }
                    j56VarR = ux2Var2.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.p41
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                iq8.d(z31Var, fs4Var, str3, z7, z8, function0, (ux2) obj, yo1.Y(i2 | 1), i3);
                                return f88.a;
                            }
                        };
                    }
                }
                i4 |= 24576;
                z5 = z3;
                if ((196608 & i2) == 0) {
                    function1 = function0;
                    if (ux2Var2.h(function1)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                } else {
                    function1 = function0;
                }
                i9 = i4;
                if ((i9 & 74899) != 74898) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (ux2Var2.N(i9 & 1, z6)) {
                    if (i11 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i5 != 0) {
                        z9 = true;
                    } else {
                        z9 = z4;
                    }
                    if (i7 != 0) {
                        z10 = false;
                    } else {
                        z10 = z5;
                    }
                    fs4 fs4VarC2 = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
                    if (z10) {
                        ux2Var2.W(-1591458386);
                        j2 = ((rn4) ux2Var2.j(un4.a)).a.G;
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1591368021);
                        ux2Var2.p(false);
                        j2 = rv0.g;
                    }
                    fs4 fs4VarD2 = ka0.D(androidx.compose.foundation.b.b(au8.s(fs4VarC2, j2, kh.V), false, null, null, function1, 15), 0.0f, 8.0f, 1);
                    dg6 dg6VarA2 = cg6.a(a, xz2.y, ux2Var2, 48);
                    int iHashCode3 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL3 = ux2Var2.l();
                    fs4 fs4VarS3 = uf0.s(ux2Var2, fs4VarD2);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    z11 = ux2Var2.S;
                    tg3Var = LayoutNode.e0;
                    if (z11) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    iz0 iz0Var5 = d82.v;
                    o67.n(dg6VarA2, iz0Var5, ux2Var2);
                    iz0 iz0Var6 = d82.u;
                    o67.n(yj5VarL3, iz0Var6, ux2Var2);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    iz0 iz0Var7 = d82.w;
                    o67.n(numValueOf2, iz0Var7, ux2Var2);
                    o67.l(ux2Var2);
                    iz0 iz0Var8 = d82.t;
                    o67.n(fs4VarS3, iz0Var8, ux2Var2);
                    String str7 = str4;
                    e(z31Var.a, z31Var.i, z31Var.j, z31Var.k, null, z31Var.h, ux2Var2, 0);
                    kw0 kw0VarA2 = iw0.a(c, xz2.A, ux2Var2, 0);
                    int iHashCode4 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL4 = ux2Var2.l();
                    cs4 cs4Var2 = cs4.b;
                    fs4 fs4VarS4 = uf0.s(ux2Var2, cs4Var2);
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(kw0VarA2, iz0Var5, ux2Var2);
                    o67.n(yj5VarL4, iz0Var6, ux2Var2);
                    e41.r(iHashCode4, ux2Var2, iz0Var7, ux2Var2);
                    o67.n(fs4VarS4, iz0Var8, ux2Var2);
                    fs4 fs4VarF2 = ka0.F(cs4Var2, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    if ((i9 & 14) == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objK = ux2Var2.K();
                    if (z12) {
                        objK = new q0(z31Var, (byte) 29);
                        ux2Var2.g0(objK);
                    } else {
                        objK = new q0(z31Var, (byte) 29);
                        ux2Var2.g0(objK);
                    }
                    fs4 fs4VarA2 = cp6.a(fs4VarF2, false, (Function1) objK);
                    int i13 = (i9 >> 3) & 112;
                    xo xoVarH2 = h(z31Var.a, str7, ux2Var2, i13);
                    h72 h72Var2 = un4.a;
                    qs7.c(xoVarH2, fs4VarA2, ((rn4) ux2Var2.j(h72Var2)).a.q, 0L, 0L, 0L, 2, false, 1, 0, null, null, ((rn4) ux2Var2.j(h72Var2)).b.j, ux2Var, 0, 24960, 241656);
                    ux2Var2 = ux2Var;
                    if (z9) {
                        ux2Var2.W(-532425932);
                        if (str5 != null) {
                            z14 = false;
                            ux2Var2.W(-532382377);
                            list = z31Var.b;
                            ux2Var2.W(-946196544);
                            if (list.isEmpty()) {
                                ux2Var2.p(false);
                                strA = null;
                                z13 = true;
                            } else {
                                z13 = true;
                                size = list.size() - 1;
                                if (size == 0) {
                                    ux2Var2.W(1238194183);
                                    ux2Var2.p(false);
                                    strA = (String) lv0.m0(list);
                                } else if (size != 1) {
                                    ux2Var2.W(1238200794);
                                    strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                    ux2Var2.p(false);
                                } else {
                                    ux2Var2.W(1238195162);
                                    strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                    ux2Var2.p(false);
                                }
                                ux2Var2.p(false);
                            }
                            if (strA != null) {
                                ux2Var2.W(-532147490);
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(-532147490);
                                ux2Var2.p(false);
                            }
                            ux2Var2.p(false);
                        } else {
                            z14 = false;
                            ux2Var2.W(-532382377);
                            list = z31Var.b;
                            ux2Var2.W(-946196544);
                            if (list.isEmpty()) {
                                ux2Var2.p(false);
                                strA = null;
                                z13 = true;
                            } else {
                                z13 = true;
                                size = list.size() - 1;
                                if (size == 0) {
                                    ux2Var2.W(1238194183);
                                    ux2Var2.p(false);
                                    strA = (String) lv0.m0(list);
                                } else if (size != 1) {
                                    ux2Var2.W(1238200794);
                                    strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                    ux2Var2.p(false);
                                } else {
                                    ux2Var2.W(1238195162);
                                    strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                    ux2Var2.p(false);
                                }
                                ux2Var2.p(false);
                            }
                            if (strA != null) {
                                ux2Var2.W(-532147490);
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(-532147490);
                                ux2Var2.p(false);
                            }
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(z14);
                    } else {
                        z13 = true;
                        ux2Var2.W(-531955042);
                        ux2Var2.p(false);
                    }
                    ux2Var2.p(z13);
                    ux2Var2.p(z13);
                    str3 = str7;
                    z7 = z9;
                    z8 = z10;
                } else {
                    ux2Var2.Q();
                    str3 = str2;
                    z7 = z4;
                    z8 = z5;
                }
                j56VarR = ux2Var2.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.p41
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            iq8.d(z31Var, fs4Var, str3, z7, z8, function0, (ux2) obj, yo1.Y(i2 | 1), i3);
                            return f88.a;
                        }
                    };
                }
            }
            i4 |= 3072;
            z4 = z2;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    z5 = z3;
                    if (ux2Var2.g(z5)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((196608 & i2) == 0) {
                    function1 = function0;
                    if (ux2Var2.h(function1)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                } else {
                    function1 = function0;
                }
                i9 = i4;
                if ((i9 & 74899) != 74898) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (ux2Var2.N(i9 & 1, z6)) {
                    if (i11 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i5 != 0) {
                        z9 = true;
                    } else {
                        z9 = z4;
                    }
                    if (i7 != 0) {
                        z10 = false;
                    } else {
                        z10 = z5;
                    }
                    fs4 fs4VarC3 = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
                    if (z10) {
                        ux2Var2.W(-1591458386);
                        j2 = ((rn4) ux2Var2.j(un4.a)).a.G;
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1591368021);
                        ux2Var2.p(false);
                        j2 = rv0.g;
                    }
                    fs4 fs4VarD3 = ka0.D(androidx.compose.foundation.b.b(au8.s(fs4VarC3, j2, kh.V), false, null, null, function1, 15), 0.0f, 8.0f, 1);
                    dg6 dg6VarA3 = cg6.a(a, xz2.y, ux2Var2, 48);
                    int iHashCode5 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL5 = ux2Var2.l();
                    fs4 fs4VarS5 = uf0.s(ux2Var2, fs4VarD3);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    z11 = ux2Var2.S;
                    tg3Var = LayoutNode.e0;
                    if (z11) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    iz0 iz0Var9 = d82.v;
                    o67.n(dg6VarA3, iz0Var9, ux2Var2);
                    iz0 iz0Var10 = d82.u;
                    o67.n(yj5VarL5, iz0Var10, ux2Var2);
                    Integer numValueOf3 = Integer.valueOf(iHashCode5);
                    iz0 iz0Var11 = d82.w;
                    o67.n(numValueOf3, iz0Var11, ux2Var2);
                    o67.l(ux2Var2);
                    iz0 iz0Var12 = d82.t;
                    o67.n(fs4VarS5, iz0Var12, ux2Var2);
                    String str8 = str4;
                    e(z31Var.a, z31Var.i, z31Var.j, z31Var.k, null, z31Var.h, ux2Var2, 0);
                    kw0 kw0VarA3 = iw0.a(c, xz2.A, ux2Var2, 0);
                    int iHashCode6 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL6 = ux2Var2.l();
                    cs4 cs4Var3 = cs4.b;
                    fs4 fs4VarS6 = uf0.s(ux2Var2, cs4Var3);
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(kw0VarA3, iz0Var9, ux2Var2);
                    o67.n(yj5VarL6, iz0Var10, ux2Var2);
                    e41.r(iHashCode6, ux2Var2, iz0Var11, ux2Var2);
                    o67.n(fs4VarS6, iz0Var12, ux2Var2);
                    fs4 fs4VarF3 = ka0.F(cs4Var3, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    if ((i9 & 14) == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objK = ux2Var2.K();
                    if (z12) {
                        objK = new q0(z31Var, (byte) 29);
                        ux2Var2.g0(objK);
                    } else {
                        objK = new q0(z31Var, (byte) 29);
                        ux2Var2.g0(objK);
                    }
                    fs4 fs4VarA3 = cp6.a(fs4VarF3, false, (Function1) objK);
                    int i14 = (i9 >> 3) & 112;
                    xo xoVarH3 = h(z31Var.a, str8, ux2Var2, i14);
                    h72 h72Var3 = un4.a;
                    qs7.c(xoVarH3, fs4VarA3, ((rn4) ux2Var2.j(h72Var3)).a.q, 0L, 0L, 0L, 2, false, 1, 0, null, null, ((rn4) ux2Var2.j(h72Var3)).b.j, ux2Var, 0, 24960, 241656);
                    ux2Var2 = ux2Var;
                    if (z9) {
                        ux2Var2.W(-532425932);
                        if (str5 != null) {
                            z14 = false;
                            ux2Var2.W(-532382377);
                            list = z31Var.b;
                            ux2Var2.W(-946196544);
                            if (list.isEmpty()) {
                                ux2Var2.p(false);
                                strA = null;
                                z13 = true;
                            } else {
                                z13 = true;
                                size = list.size() - 1;
                                if (size == 0) {
                                    ux2Var2.W(1238194183);
                                    ux2Var2.p(false);
                                    strA = (String) lv0.m0(list);
                                } else if (size != 1) {
                                    ux2Var2.W(1238200794);
                                    strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                    ux2Var2.p(false);
                                } else {
                                    ux2Var2.W(1238195162);
                                    strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                    ux2Var2.p(false);
                                }
                                ux2Var2.p(false);
                            }
                            if (strA != null) {
                                ux2Var2.W(-532147490);
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(-532147490);
                                ux2Var2.p(false);
                            }
                            ux2Var2.p(false);
                        } else {
                            z14 = false;
                            ux2Var2.W(-532382377);
                            list = z31Var.b;
                            ux2Var2.W(-946196544);
                            if (list.isEmpty()) {
                                ux2Var2.p(false);
                                strA = null;
                                z13 = true;
                            } else {
                                z13 = true;
                                size = list.size() - 1;
                                if (size == 0) {
                                    ux2Var2.W(1238194183);
                                    ux2Var2.p(false);
                                    strA = (String) lv0.m0(list);
                                } else if (size != 1) {
                                    ux2Var2.W(1238200794);
                                    strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                    ux2Var2.p(false);
                                } else {
                                    ux2Var2.W(1238195162);
                                    strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                    ux2Var2.p(false);
                                }
                                ux2Var2.p(false);
                            }
                            if (strA != null) {
                                ux2Var2.W(-532147490);
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(-532147490);
                                ux2Var2.p(false);
                            }
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(z14);
                    } else {
                        z13 = true;
                        ux2Var2.W(-531955042);
                        ux2Var2.p(false);
                    }
                    ux2Var2.p(z13);
                    ux2Var2.p(z13);
                    str3 = str8;
                    z7 = z9;
                    z8 = z10;
                } else {
                    ux2Var2.Q();
                    str3 = str2;
                    z7 = z4;
                    z8 = z5;
                }
                j56VarR = ux2Var2.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.p41
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            iq8.d(z31Var, fs4Var, str3, z7, z8, function0, (ux2) obj, yo1.Y(i2 | 1), i3);
                            return f88.a;
                        }
                    };
                }
            }
            i4 |= 24576;
            z5 = z3;
            if ((196608 & i2) == 0) {
                function1 = function0;
                if (ux2Var2.h(function1)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i4 |= i10;
            } else {
                function1 = function0;
            }
            i9 = i4;
            if ((i9 & 74899) != 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (ux2Var2.N(i9 & 1, z6)) {
                if (i11 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (i5 != 0) {
                    z9 = true;
                } else {
                    z9 = z4;
                }
                if (i7 != 0) {
                    z10 = false;
                } else {
                    z10 = z5;
                }
                fs4 fs4VarC4 = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
                if (z10) {
                    ux2Var2.W(-1591458386);
                    j2 = ((rn4) ux2Var2.j(un4.a)).a.G;
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(-1591368021);
                    ux2Var2.p(false);
                    j2 = rv0.g;
                }
                fs4 fs4VarD4 = ka0.D(androidx.compose.foundation.b.b(au8.s(fs4VarC4, j2, kh.V), false, null, null, function1, 15), 0.0f, 8.0f, 1);
                dg6 dg6VarA4 = cg6.a(a, xz2.y, ux2Var2, 48);
                int iHashCode7 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL7 = ux2Var2.l();
                fs4 fs4VarS7 = uf0.s(ux2Var2, fs4VarD4);
                yz0.c.getClass();
                ux2Var2.a0();
                z11 = ux2Var2.S;
                tg3Var = LayoutNode.e0;
                if (z11) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                iz0 iz0Var13 = d82.v;
                o67.n(dg6VarA4, iz0Var13, ux2Var2);
                iz0 iz0Var14 = d82.u;
                o67.n(yj5VarL7, iz0Var14, ux2Var2);
                Integer numValueOf4 = Integer.valueOf(iHashCode7);
                iz0 iz0Var15 = d82.w;
                o67.n(numValueOf4, iz0Var15, ux2Var2);
                o67.l(ux2Var2);
                iz0 iz0Var16 = d82.t;
                o67.n(fs4VarS7, iz0Var16, ux2Var2);
                String str9 = str4;
                e(z31Var.a, z31Var.i, z31Var.j, z31Var.k, null, z31Var.h, ux2Var2, 0);
                kw0 kw0VarA4 = iw0.a(c, xz2.A, ux2Var2, 0);
                int iHashCode8 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL8 = ux2Var2.l();
                cs4 cs4Var4 = cs4.b;
                fs4 fs4VarS8 = uf0.s(ux2Var2, cs4Var4);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(kw0VarA4, iz0Var13, ux2Var2);
                o67.n(yj5VarL8, iz0Var14, ux2Var2);
                e41.r(iHashCode8, ux2Var2, iz0Var15, ux2Var2);
                o67.n(fs4VarS8, iz0Var16, ux2Var2);
                fs4 fs4VarF4 = ka0.F(cs4Var4, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                if ((i9 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objK = ux2Var2.K();
                if (z12) {
                    objK = new q0(z31Var, (byte) 29);
                    ux2Var2.g0(objK);
                } else {
                    objK = new q0(z31Var, (byte) 29);
                    ux2Var2.g0(objK);
                }
                fs4 fs4VarA4 = cp6.a(fs4VarF4, false, (Function1) objK);
                int i15 = (i9 >> 3) & 112;
                xo xoVarH4 = h(z31Var.a, str9, ux2Var2, i15);
                h72 h72Var4 = un4.a;
                qs7.c(xoVarH4, fs4VarA4, ((rn4) ux2Var2.j(h72Var4)).a.q, 0L, 0L, 0L, 2, false, 1, 0, null, null, ((rn4) ux2Var2.j(h72Var4)).b.j, ux2Var, 0, 24960, 241656);
                ux2Var2 = ux2Var;
                if (z9) {
                    ux2Var2.W(-532425932);
                    if (str5 != null) {
                        z14 = false;
                        ux2Var2.W(-532382377);
                        list = z31Var.b;
                        ux2Var2.W(-946196544);
                        if (list.isEmpty()) {
                            ux2Var2.p(false);
                            strA = null;
                            z13 = true;
                        } else {
                            z13 = true;
                            size = list.size() - 1;
                            if (size == 0) {
                                ux2Var2.W(1238194183);
                                ux2Var2.p(false);
                                strA = (String) lv0.m0(list);
                            } else if (size != 1) {
                                ux2Var2.W(1238200794);
                                strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(1238195162);
                                strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                ux2Var2.p(false);
                            }
                            ux2Var2.p(false);
                        }
                        if (strA != null) {
                            ux2Var2.W(-532147490);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(-532147490);
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(false);
                    } else {
                        z14 = false;
                        ux2Var2.W(-532382377);
                        list = z31Var.b;
                        ux2Var2.W(-946196544);
                        if (list.isEmpty()) {
                            ux2Var2.p(false);
                            strA = null;
                            z13 = true;
                        } else {
                            z13 = true;
                            size = list.size() - 1;
                            if (size == 0) {
                                ux2Var2.W(1238194183);
                                ux2Var2.p(false);
                                strA = (String) lv0.m0(list);
                            } else if (size != 1) {
                                ux2Var2.W(1238200794);
                                strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(1238195162);
                                strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                ux2Var2.p(false);
                            }
                            ux2Var2.p(false);
                        }
                        if (strA != null) {
                            ux2Var2.W(-532147490);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(-532147490);
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(false);
                    }
                    ux2Var2.p(z14);
                } else {
                    z13 = true;
                    ux2Var2.W(-531955042);
                    ux2Var2.p(false);
                }
                ux2Var2.p(z13);
                ux2Var2.p(z13);
                str3 = str9;
                z7 = z9;
                z8 = z10;
            } else {
                ux2Var2.Q();
                str3 = str2;
                z7 = z4;
                z8 = z5;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.p41
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        iq8.d(z31Var, fs4Var, str3, z7, z8, function0, (ux2) obj, yo1.Y(i2 | 1), i3);
                        return f88.a;
                    }
                };
            }
        }
        i4 |= 384;
        str2 = str;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                z4 = z2;
                if (ux2Var2.g(z4)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    z5 = z3;
                    if (ux2Var2.g(z5)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((196608 & i2) == 0) {
                    function1 = function0;
                    if (ux2Var2.h(function1)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                } else {
                    function1 = function0;
                }
                i9 = i4;
                if ((i9 & 74899) != 74898) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (ux2Var2.N(i9 & 1, z6)) {
                    if (i11 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i5 != 0) {
                        z9 = true;
                    } else {
                        z9 = z4;
                    }
                    if (i7 != 0) {
                        z10 = false;
                    } else {
                        z10 = z5;
                    }
                    fs4 fs4VarC5 = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
                    if (z10) {
                        ux2Var2.W(-1591458386);
                        j2 = ((rn4) ux2Var2.j(un4.a)).a.G;
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1591368021);
                        ux2Var2.p(false);
                        j2 = rv0.g;
                    }
                    fs4 fs4VarD5 = ka0.D(androidx.compose.foundation.b.b(au8.s(fs4VarC5, j2, kh.V), false, null, null, function1, 15), 0.0f, 8.0f, 1);
                    dg6 dg6VarA5 = cg6.a(a, xz2.y, ux2Var2, 48);
                    int iHashCode9 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL9 = ux2Var2.l();
                    fs4 fs4VarS9 = uf0.s(ux2Var2, fs4VarD5);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    z11 = ux2Var2.S;
                    tg3Var = LayoutNode.e0;
                    if (z11) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    iz0 iz0Var17 = d82.v;
                    o67.n(dg6VarA5, iz0Var17, ux2Var2);
                    iz0 iz0Var18 = d82.u;
                    o67.n(yj5VarL9, iz0Var18, ux2Var2);
                    Integer numValueOf5 = Integer.valueOf(iHashCode9);
                    iz0 iz0Var19 = d82.w;
                    o67.n(numValueOf5, iz0Var19, ux2Var2);
                    o67.l(ux2Var2);
                    iz0 iz0Var110 = d82.t;
                    o67.n(fs4VarS9, iz0Var110, ux2Var2);
                    String str10 = str4;
                    e(z31Var.a, z31Var.i, z31Var.j, z31Var.k, null, z31Var.h, ux2Var2, 0);
                    kw0 kw0VarA5 = iw0.a(c, xz2.A, ux2Var2, 0);
                    int iHashCode10 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL10 = ux2Var2.l();
                    cs4 cs4Var5 = cs4.b;
                    fs4 fs4VarS10 = uf0.s(ux2Var2, cs4Var5);
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(kw0VarA5, iz0Var17, ux2Var2);
                    o67.n(yj5VarL10, iz0Var18, ux2Var2);
                    e41.r(iHashCode10, ux2Var2, iz0Var19, ux2Var2);
                    o67.n(fs4VarS10, iz0Var110, ux2Var2);
                    fs4 fs4VarF5 = ka0.F(cs4Var5, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    if ((i9 & 14) == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objK = ux2Var2.K();
                    if (z12) {
                        objK = new q0(z31Var, (byte) 29);
                        ux2Var2.g0(objK);
                    } else {
                        objK = new q0(z31Var, (byte) 29);
                        ux2Var2.g0(objK);
                    }
                    fs4 fs4VarA5 = cp6.a(fs4VarF5, false, (Function1) objK);
                    int i16 = (i9 >> 3) & 112;
                    xo xoVarH5 = h(z31Var.a, str10, ux2Var2, i16);
                    h72 h72Var5 = un4.a;
                    qs7.c(xoVarH5, fs4VarA5, ((rn4) ux2Var2.j(h72Var5)).a.q, 0L, 0L, 0L, 2, false, 1, 0, null, null, ((rn4) ux2Var2.j(h72Var5)).b.j, ux2Var, 0, 24960, 241656);
                    ux2Var2 = ux2Var;
                    if (z9) {
                        ux2Var2.W(-532425932);
                        if (str5 != null) {
                            z14 = false;
                            ux2Var2.W(-532382377);
                            list = z31Var.b;
                            ux2Var2.W(-946196544);
                            if (list.isEmpty()) {
                                ux2Var2.p(false);
                                strA = null;
                                z13 = true;
                            } else {
                                z13 = true;
                                size = list.size() - 1;
                                if (size == 0) {
                                    ux2Var2.W(1238194183);
                                    ux2Var2.p(false);
                                    strA = (String) lv0.m0(list);
                                } else if (size != 1) {
                                    ux2Var2.W(1238200794);
                                    strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                    ux2Var2.p(false);
                                } else {
                                    ux2Var2.W(1238195162);
                                    strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                    ux2Var2.p(false);
                                }
                                ux2Var2.p(false);
                            }
                            if (strA != null) {
                                ux2Var2.W(-532147490);
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(-532147490);
                                ux2Var2.p(false);
                            }
                            ux2Var2.p(false);
                        } else {
                            z14 = false;
                            ux2Var2.W(-532382377);
                            list = z31Var.b;
                            ux2Var2.W(-946196544);
                            if (list.isEmpty()) {
                                ux2Var2.p(false);
                                strA = null;
                                z13 = true;
                            } else {
                                z13 = true;
                                size = list.size() - 1;
                                if (size == 0) {
                                    ux2Var2.W(1238194183);
                                    ux2Var2.p(false);
                                    strA = (String) lv0.m0(list);
                                } else if (size != 1) {
                                    ux2Var2.W(1238200794);
                                    strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                    ux2Var2.p(false);
                                } else {
                                    ux2Var2.W(1238195162);
                                    strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                    ux2Var2.p(false);
                                }
                                ux2Var2.p(false);
                            }
                            if (strA != null) {
                                ux2Var2.W(-532147490);
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(-532147490);
                                ux2Var2.p(false);
                            }
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(z14);
                    } else {
                        z13 = true;
                        ux2Var2.W(-531955042);
                        ux2Var2.p(false);
                    }
                    ux2Var2.p(z13);
                    ux2Var2.p(z13);
                    str3 = str10;
                    z7 = z9;
                    z8 = z10;
                } else {
                    ux2Var2.Q();
                    str3 = str2;
                    z7 = z4;
                    z8 = z5;
                }
                j56VarR = ux2Var2.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.p41
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            iq8.d(z31Var, fs4Var, str3, z7, z8, function0, (ux2) obj, yo1.Y(i2 | 1), i3);
                            return f88.a;
                        }
                    };
                }
            }
            i4 |= 24576;
            z5 = z3;
            if ((196608 & i2) == 0) {
                function1 = function0;
                if (ux2Var2.h(function1)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i4 |= i10;
            } else {
                function1 = function0;
            }
            i9 = i4;
            if ((i9 & 74899) != 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (ux2Var2.N(i9 & 1, z6)) {
                if (i11 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (i5 != 0) {
                    z9 = true;
                } else {
                    z9 = z4;
                }
                if (i7 != 0) {
                    z10 = false;
                } else {
                    z10 = z5;
                }
                fs4 fs4VarC6 = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
                if (z10) {
                    ux2Var2.W(-1591458386);
                    j2 = ((rn4) ux2Var2.j(un4.a)).a.G;
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(-1591368021);
                    ux2Var2.p(false);
                    j2 = rv0.g;
                }
                fs4 fs4VarD6 = ka0.D(androidx.compose.foundation.b.b(au8.s(fs4VarC6, j2, kh.V), false, null, null, function1, 15), 0.0f, 8.0f, 1);
                dg6 dg6VarA6 = cg6.a(a, xz2.y, ux2Var2, 48);
                int iHashCode11 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL11 = ux2Var2.l();
                fs4 fs4VarS11 = uf0.s(ux2Var2, fs4VarD6);
                yz0.c.getClass();
                ux2Var2.a0();
                z11 = ux2Var2.S;
                tg3Var = LayoutNode.e0;
                if (z11) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                iz0 iz0Var111 = d82.v;
                o67.n(dg6VarA6, iz0Var111, ux2Var2);
                iz0 iz0Var112 = d82.u;
                o67.n(yj5VarL11, iz0Var112, ux2Var2);
                Integer numValueOf6 = Integer.valueOf(iHashCode11);
                iz0 iz0Var113 = d82.w;
                o67.n(numValueOf6, iz0Var113, ux2Var2);
                o67.l(ux2Var2);
                iz0 iz0Var114 = d82.t;
                o67.n(fs4VarS11, iz0Var114, ux2Var2);
                String str11 = str4;
                e(z31Var.a, z31Var.i, z31Var.j, z31Var.k, null, z31Var.h, ux2Var2, 0);
                kw0 kw0VarA6 = iw0.a(c, xz2.A, ux2Var2, 0);
                int iHashCode12 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL12 = ux2Var2.l();
                cs4 cs4Var6 = cs4.b;
                fs4 fs4VarS12 = uf0.s(ux2Var2, cs4Var6);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(kw0VarA6, iz0Var111, ux2Var2);
                o67.n(yj5VarL12, iz0Var112, ux2Var2);
                e41.r(iHashCode12, ux2Var2, iz0Var113, ux2Var2);
                o67.n(fs4VarS12, iz0Var114, ux2Var2);
                fs4 fs4VarF6 = ka0.F(cs4Var6, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                if ((i9 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objK = ux2Var2.K();
                if (z12) {
                    objK = new q0(z31Var, (byte) 29);
                    ux2Var2.g0(objK);
                } else {
                    objK = new q0(z31Var, (byte) 29);
                    ux2Var2.g0(objK);
                }
                fs4 fs4VarA6 = cp6.a(fs4VarF6, false, (Function1) objK);
                int i17 = (i9 >> 3) & 112;
                xo xoVarH6 = h(z31Var.a, str11, ux2Var2, i17);
                h72 h72Var6 = un4.a;
                qs7.c(xoVarH6, fs4VarA6, ((rn4) ux2Var2.j(h72Var6)).a.q, 0L, 0L, 0L, 2, false, 1, 0, null, null, ((rn4) ux2Var2.j(h72Var6)).b.j, ux2Var, 0, 24960, 241656);
                ux2Var2 = ux2Var;
                if (z9) {
                    ux2Var2.W(-532425932);
                    if (str5 != null) {
                        z14 = false;
                        ux2Var2.W(-532382377);
                        list = z31Var.b;
                        ux2Var2.W(-946196544);
                        if (list.isEmpty()) {
                            ux2Var2.p(false);
                            strA = null;
                            z13 = true;
                        } else {
                            z13 = true;
                            size = list.size() - 1;
                            if (size == 0) {
                                ux2Var2.W(1238194183);
                                ux2Var2.p(false);
                                strA = (String) lv0.m0(list);
                            } else if (size != 1) {
                                ux2Var2.W(1238200794);
                                strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(1238195162);
                                strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                ux2Var2.p(false);
                            }
                            ux2Var2.p(false);
                        }
                        if (strA != null) {
                            ux2Var2.W(-532147490);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(-532147490);
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(false);
                    } else {
                        z14 = false;
                        ux2Var2.W(-532382377);
                        list = z31Var.b;
                        ux2Var2.W(-946196544);
                        if (list.isEmpty()) {
                            ux2Var2.p(false);
                            strA = null;
                            z13 = true;
                        } else {
                            z13 = true;
                            size = list.size() - 1;
                            if (size == 0) {
                                ux2Var2.W(1238194183);
                                ux2Var2.p(false);
                                strA = (String) lv0.m0(list);
                            } else if (size != 1) {
                                ux2Var2.W(1238200794);
                                strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(1238195162);
                                strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                ux2Var2.p(false);
                            }
                            ux2Var2.p(false);
                        }
                        if (strA != null) {
                            ux2Var2.W(-532147490);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(-532147490);
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(false);
                    }
                    ux2Var2.p(z14);
                } else {
                    z13 = true;
                    ux2Var2.W(-531955042);
                    ux2Var2.p(false);
                }
                ux2Var2.p(z13);
                ux2Var2.p(z13);
                str3 = str11;
                z7 = z9;
                z8 = z10;
            } else {
                ux2Var2.Q();
                str3 = str2;
                z7 = z4;
                z8 = z5;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.p41
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        iq8.d(z31Var, fs4Var, str3, z7, z8, function0, (ux2) obj, yo1.Y(i2 | 1), i3);
                        return f88.a;
                    }
                };
            }
        }
        i4 |= 3072;
        z4 = z2;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((i2 & 24576) == 0) {
                z5 = z3;
                if (ux2Var2.g(z5)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((196608 & i2) == 0) {
                function1 = function0;
                if (ux2Var2.h(function1)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i4 |= i10;
            } else {
                function1 = function0;
            }
            i9 = i4;
            if ((i9 & 74899) != 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (ux2Var2.N(i9 & 1, z6)) {
                if (i11 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (i5 != 0) {
                    z9 = true;
                } else {
                    z9 = z4;
                }
                if (i7 != 0) {
                    z10 = false;
                } else {
                    z10 = z5;
                }
                fs4 fs4VarC7 = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
                if (z10) {
                    ux2Var2.W(-1591458386);
                    j2 = ((rn4) ux2Var2.j(un4.a)).a.G;
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(-1591368021);
                    ux2Var2.p(false);
                    j2 = rv0.g;
                }
                fs4 fs4VarD7 = ka0.D(androidx.compose.foundation.b.b(au8.s(fs4VarC7, j2, kh.V), false, null, null, function1, 15), 0.0f, 8.0f, 1);
                dg6 dg6VarA7 = cg6.a(a, xz2.y, ux2Var2, 48);
                int iHashCode13 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL13 = ux2Var2.l();
                fs4 fs4VarS13 = uf0.s(ux2Var2, fs4VarD7);
                yz0.c.getClass();
                ux2Var2.a0();
                z11 = ux2Var2.S;
                tg3Var = LayoutNode.e0;
                if (z11) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                iz0 iz0Var115 = d82.v;
                o67.n(dg6VarA7, iz0Var115, ux2Var2);
                iz0 iz0Var116 = d82.u;
                o67.n(yj5VarL13, iz0Var116, ux2Var2);
                Integer numValueOf7 = Integer.valueOf(iHashCode13);
                iz0 iz0Var117 = d82.w;
                o67.n(numValueOf7, iz0Var117, ux2Var2);
                o67.l(ux2Var2);
                iz0 iz0Var118 = d82.t;
                o67.n(fs4VarS13, iz0Var118, ux2Var2);
                String str12 = str4;
                e(z31Var.a, z31Var.i, z31Var.j, z31Var.k, null, z31Var.h, ux2Var2, 0);
                kw0 kw0VarA7 = iw0.a(c, xz2.A, ux2Var2, 0);
                int iHashCode14 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL14 = ux2Var2.l();
                cs4 cs4Var7 = cs4.b;
                fs4 fs4VarS14 = uf0.s(ux2Var2, cs4Var7);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(kw0VarA7, iz0Var115, ux2Var2);
                o67.n(yj5VarL14, iz0Var116, ux2Var2);
                e41.r(iHashCode14, ux2Var2, iz0Var117, ux2Var2);
                o67.n(fs4VarS14, iz0Var118, ux2Var2);
                fs4 fs4VarF7 = ka0.F(cs4Var7, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                if ((i9 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objK = ux2Var2.K();
                if (z12) {
                    objK = new q0(z31Var, (byte) 29);
                    ux2Var2.g0(objK);
                } else {
                    objK = new q0(z31Var, (byte) 29);
                    ux2Var2.g0(objK);
                }
                fs4 fs4VarA7 = cp6.a(fs4VarF7, false, (Function1) objK);
                int i18 = (i9 >> 3) & 112;
                xo xoVarH7 = h(z31Var.a, str12, ux2Var2, i18);
                h72 h72Var7 = un4.a;
                qs7.c(xoVarH7, fs4VarA7, ((rn4) ux2Var2.j(h72Var7)).a.q, 0L, 0L, 0L, 2, false, 1, 0, null, null, ((rn4) ux2Var2.j(h72Var7)).b.j, ux2Var, 0, 24960, 241656);
                ux2Var2 = ux2Var;
                if (z9) {
                    ux2Var2.W(-532425932);
                    if (str5 != null) {
                        z14 = false;
                        ux2Var2.W(-532382377);
                        list = z31Var.b;
                        ux2Var2.W(-946196544);
                        if (list.isEmpty()) {
                            ux2Var2.p(false);
                            strA = null;
                            z13 = true;
                        } else {
                            z13 = true;
                            size = list.size() - 1;
                            if (size == 0) {
                                ux2Var2.W(1238194183);
                                ux2Var2.p(false);
                                strA = (String) lv0.m0(list);
                            } else if (size != 1) {
                                ux2Var2.W(1238200794);
                                strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(1238195162);
                                strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                ux2Var2.p(false);
                            }
                            ux2Var2.p(false);
                        }
                        if (strA != null) {
                            ux2Var2.W(-532147490);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(-532147490);
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(false);
                    } else {
                        z14 = false;
                        ux2Var2.W(-532382377);
                        list = z31Var.b;
                        ux2Var2.W(-946196544);
                        if (list.isEmpty()) {
                            ux2Var2.p(false);
                            strA = null;
                            z13 = true;
                        } else {
                            z13 = true;
                            size = list.size() - 1;
                            if (size == 0) {
                                ux2Var2.W(1238194183);
                                ux2Var2.p(false);
                                strA = (String) lv0.m0(list);
                            } else if (size != 1) {
                                ux2Var2.W(1238200794);
                                strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                ux2Var2.p(false);
                            } else {
                                ux2Var2.W(1238195162);
                                strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                                ux2Var2.p(false);
                            }
                            ux2Var2.p(false);
                        }
                        if (strA != null) {
                            ux2Var2.W(-532147490);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(-532147490);
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(false);
                    }
                    ux2Var2.p(z14);
                } else {
                    z13 = true;
                    ux2Var2.W(-531955042);
                    ux2Var2.p(false);
                }
                ux2Var2.p(z13);
                ux2Var2.p(z13);
                str3 = str12;
                z7 = z9;
                z8 = z10;
            } else {
                ux2Var2.Q();
                str3 = str2;
                z7 = z4;
                z8 = z5;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.p41
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        iq8.d(z31Var, fs4Var, str3, z7, z8, function0, (ux2) obj, yo1.Y(i2 | 1), i3);
                        return f88.a;
                    }
                };
            }
        }
        i4 |= 24576;
        z5 = z3;
        if ((196608 & i2) == 0) {
            function1 = function0;
            if (ux2Var2.h(function1)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        } else {
            function1 = function0;
        }
        i9 = i4;
        if ((i9 & 74899) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (ux2Var2.N(i9 & 1, z6)) {
            if (i11 != 0) {
                str4 = "";
            } else {
                str4 = str2;
            }
            if (i5 != 0) {
                z9 = true;
            } else {
                z9 = z4;
            }
            if (i7 != 0) {
                z10 = false;
            } else {
                z10 = z5;
            }
            fs4 fs4VarC8 = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
            if (z10) {
                ux2Var2.W(-1591458386);
                j2 = ((rn4) ux2Var2.j(un4.a)).a.G;
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-1591368021);
                ux2Var2.p(false);
                j2 = rv0.g;
            }
            fs4 fs4VarD8 = ka0.D(androidx.compose.foundation.b.b(au8.s(fs4VarC8, j2, kh.V), false, null, null, function1, 15), 0.0f, 8.0f, 1);
            dg6 dg6VarA8 = cg6.a(a, xz2.y, ux2Var2, 48);
            int iHashCode15 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL15 = ux2Var2.l();
            fs4 fs4VarS15 = uf0.s(ux2Var2, fs4VarD8);
            yz0.c.getClass();
            ux2Var2.a0();
            z11 = ux2Var2.S;
            tg3Var = LayoutNode.e0;
            if (z11) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var119 = d82.v;
            o67.n(dg6VarA8, iz0Var119, ux2Var2);
            iz0 iz0Var1110 = d82.u;
            o67.n(yj5VarL15, iz0Var1110, ux2Var2);
            Integer numValueOf8 = Integer.valueOf(iHashCode15);
            iz0 iz0Var1111 = d82.w;
            o67.n(numValueOf8, iz0Var1111, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var1112 = d82.t;
            o67.n(fs4VarS15, iz0Var1112, ux2Var2);
            String str13 = str4;
            e(z31Var.a, z31Var.i, z31Var.j, z31Var.k, null, z31Var.h, ux2Var2, 0);
            kw0 kw0VarA8 = iw0.a(c, xz2.A, ux2Var2, 0);
            int iHashCode16 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL16 = ux2Var2.l();
            cs4 cs4Var8 = cs4.b;
            fs4 fs4VarS16 = uf0.s(ux2Var2, cs4Var8);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA8, iz0Var119, ux2Var2);
            o67.n(yj5VarL16, iz0Var1110, ux2Var2);
            e41.r(iHashCode16, ux2Var2, iz0Var1111, ux2Var2);
            o67.n(fs4VarS16, iz0Var1112, ux2Var2);
            fs4 fs4VarF8 = ka0.F(cs4Var8, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            if ((i9 & 14) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            objK = ux2Var2.K();
            if (z12) {
                objK = new q0(z31Var, (byte) 29);
                ux2Var2.g0(objK);
            } else {
                objK = new q0(z31Var, (byte) 29);
                ux2Var2.g0(objK);
            }
            fs4 fs4VarA8 = cp6.a(fs4VarF8, false, (Function1) objK);
            int i19 = (i9 >> 3) & 112;
            xo xoVarH8 = h(z31Var.a, str13, ux2Var2, i19);
            h72 h72Var8 = un4.a;
            qs7.c(xoVarH8, fs4VarA8, ((rn4) ux2Var2.j(h72Var8)).a.q, 0L, 0L, 0L, 2, false, 1, 0, null, null, ((rn4) ux2Var2.j(h72Var8)).b.j, ux2Var, 0, 24960, 241656);
            ux2Var2 = ux2Var;
            if (z9) {
                ux2Var2.W(-532425932);
                if (str5 != null) {
                    z14 = false;
                    ux2Var2.W(-532382377);
                    list = z31Var.b;
                    ux2Var2.W(-946196544);
                    if (list.isEmpty()) {
                        ux2Var2.p(false);
                        strA = null;
                        z13 = true;
                    } else {
                        z13 = true;
                        size = list.size() - 1;
                        if (size == 0) {
                            ux2Var2.W(1238194183);
                            ux2Var2.p(false);
                            strA = (String) lv0.m0(list);
                        } else if (size != 1) {
                            ux2Var2.W(1238200794);
                            strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(1238195162);
                            strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(false);
                    }
                    if (strA != null) {
                        ux2Var2.W(-532147490);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-532147490);
                        ux2Var2.p(false);
                    }
                    ux2Var2.p(false);
                } else {
                    z14 = false;
                    ux2Var2.W(-532382377);
                    list = z31Var.b;
                    ux2Var2.W(-946196544);
                    if (list.isEmpty()) {
                        ux2Var2.p(false);
                        strA = null;
                        z13 = true;
                    } else {
                        z13 = true;
                        size = list.size() - 1;
                        if (size == 0) {
                            ux2Var2.W(1238194183);
                            ux2Var2.p(false);
                            strA = (String) lv0.m0(list);
                        } else if (size != 1) {
                            ux2Var2.W(1238200794);
                            strA = m77.A(R.string.search_result_groups_label_plural, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(1238195162);
                            strA = m77.A(R.string.search_result_groups_label_single, new Object[]{lv0.m0(list), Integer.valueOf(size)}, ux2Var2);
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(false);
                    }
                    if (strA != null) {
                        ux2Var2.W(-532147490);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-532147490);
                        ux2Var2.p(false);
                    }
                    ux2Var2.p(false);
                }
                ux2Var2.p(z14);
            } else {
                z13 = true;
                ux2Var2.W(-531955042);
                ux2Var2.p(false);
            }
            ux2Var2.p(z13);
            ux2Var2.p(z13);
            str3 = str13;
            z7 = z9;
            z8 = z10;
        } else {
            ux2Var2.Q();
            str3 = str2;
            z7 = z4;
            z8 = z5;
        }
        j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.p41
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    iq8.d(z31Var, fs4Var, str3, z7, z8, function0, (ux2) obj, yo1.Y(i2 | 1), i3);
                    return f88.a;
                }
            };
        }
    }

    public static final void e(String str, f95 f95Var, b41 b41Var, jz1 jz1Var, fs4 fs4Var, String str2, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        cs4 cs4Var;
        es1 es1Var;
        ux2 ux2Var2 = ux2Var;
        iz0 iz0Var = d82.t;
        iz0 iz0Var2 = d82.w;
        iz0 iz0Var3 = d82.u;
        iz0 iz0Var4 = d82.v;
        ux2Var2.Y(801123799);
        int i3 = i2 | (ux2Var2.f(str) ? 4 : 2) | (ux2Var2.d(f95Var.ordinal()) ? 32 : 16) | (ux2Var2.d(b41Var.ordinal()) ? 256 : 128) | (ux2Var2.d(jz1Var == null ? -1 : jz1Var.ordinal()) ? 2048 : 1024) | 24576 | (ux2Var2.f(str2) ? 131072 : 65536);
        if (ux2Var2.N(i3 & 1, (74899 & i3) != 74898)) {
            c41 c41VarJ = pm8.J(f95Var);
            ka0.x(ux2Var2);
            int iOrdinal = b41Var.ordinal();
            tg3 tg3Var = LayoutNode.e0;
            cs4 cs4Var2 = cs4.b;
            if (iOrdinal == 0) {
                cs4Var = cs4Var2;
                ux2Var2.W(-853728064);
                fs4 fs4VarL = androidx.compose.foundation.layout.b.l(ka0.F(cs4Var, 16.0f, 0.0f, 16.0f, 0.0f, 10), 40.0f);
                do4 do4VarC = ua0.c(xz2.w, false);
                int iHashCode = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL = ux2Var2.l();
                fs4 fs4VarS = uf0.s(ux2Var2, fs4VarL);
                yz0.c.getClass();
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC, iz0Var4, ux2Var2);
                o67.n(yj5VarL, iz0Var3, ux2Var2);
                o67.n(Integer.valueOf(iHashCode), iz0Var2, ux2Var2);
                o67.l(ux2Var2);
                o67.n(fs4VarS, iz0Var, ux2Var2);
                boolean z2 = (i3 & 14) == 4;
                Object objK = ux2Var2.K();
                if (z2 || objK == e01.a) {
                    objK = x67.o(str);
                    ux2Var2.g0(objK);
                }
                ba8 ba8Var = (ba8) objK;
                hi7 hi7Var = hi7.Size40dp;
                vl7 vl7Var = c41VarJ.b;
                ba8Var.getClass();
                b77.d(hi7Var, null, true, vl7Var, 0L, 0L, str, str2, ba8Var.m, new rv0(ba8Var.n), ux2Var2, ((i3 << 21) & 29360128) | 390 | ((i3 << 9) & 234881024), 106);
                ux2Var2.p(true);
                ux2Var2.p(false);
            } else if (iOrdinal == 4 || iOrdinal == 5) {
                ux2Var2.W(-852793817);
                int i4 = r41.a[b41Var.ordinal()] == 1 ? R.drawable.ic_group_managed : R.drawable.ic_group_legacy;
                y50 y50Var = xz2.s;
                fs4 fs4VarL2 = androidx.compose.foundation.layout.b.l(au8.s(ka0.D(cs4Var2, 16.0f, 0.0f, 2), j13.a, sf6.a), 40.0f);
                do4 do4VarC2 = ua0.c(y50Var, false);
                ux2Var2 = ux2Var;
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarL2);
                yz0.c.getClass();
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC2, iz0Var4, ux2Var2);
                o67.n(yj5VarL2, iz0Var3, ux2Var2);
                o67.n(Integer.valueOf(iHashCode2), iz0Var2, ux2Var2);
                o67.l(ux2Var2);
                o67.n(fs4VarS2, iz0Var, ux2Var2);
                cs4Var = cs4Var2;
                td3.b(lv1.T(i4, ux2Var2, 0), m77.z(R.string.search_result_title_groups, ux2Var2), androidx.compose.foundation.layout.b.c(cs4Var2, 1.0f), rv0.h, ux2Var2, 3464, 0);
                ux2Var2.p(true);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-851872497);
                int i5 = jz1Var == null ? -1 : d41.a[jz1Var.ordinal()];
                if (i5 != 1) {
                    es1Var = i5 != 2 ? pm8.J(f95Var).a : new es1(as1.n, ds1.n0(f95Var));
                } else {
                    es1Var = new es1(as1.m, ds1.n0(f95Var));
                }
                ds1.e(es1Var, hi7.Size40dp, ka0.D(cs4Var2, 16.0f, 0.0f, 2), ux2Var2, 48);
                ux2Var2.p(false);
                cs4Var = cs4Var2;
            }
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new q41(str, f95Var, b41Var, jz1Var, fs4Var2, str2, i2);
        }
    }

    public static final void f(pr7 pr7Var, yy0 yy0Var, ux2 ux2Var, int i2) {
        int i3;
        ux2Var.Y(2080741862);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.h(pr7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 32 : 16;
        }
        byte b2 = 1;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            e8.c(pr7Var, yy0Var, ux2Var, i3 & 126);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new kx0(pr7Var, yy0Var, i2, b2);
        }
    }

    public static final void g(xo xoVar, ux2 ux2Var, int i2) {
        ux2Var.Y(-1653314277);
        int i3 = i2 | (ux2Var.f(xoVar) ? 4 : 2);
        if (ux2Var.N(i3 & 1, (i3 & 3) != 2)) {
            fs4 fs4VarF = ka0.F(cs4.b, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            h72 h72Var = un4.a;
            qs7.c(xoVar, fs4VarF, ((rn4) ux2Var.j(h72Var)).a.s, 0L, 0L, 0L, 2, false, 1, 0, null, null, ((rn4) ux2Var.j(h72Var)).b.k, ux2Var, (i3 & 14) | 48, 24960, 241656);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new t0((byte) 11, i2, xoVar);
        }
    }

    public static final xo h(String str, String str2, ux2 ux2Var, int i2) {
        Map mapSingletonMap = Collections.singletonMap(str2, j77.a);
        mapSingletonMap.getClass();
        return g77.s(str, mapSingletonMap, new c77(((rn4) ux2Var.j(un4.a)).a.a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), 0L, ux2Var, 8);
    }

    public static final fs4 j(fs4 fs4Var, pw6 pw6Var) {
        return di1.u(fs4Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pw6Var, true, 1042431);
    }

    public static final fs4 k(fs4 fs4Var) {
        return di1.u(fs4Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 1044479);
    }

    public static final void l(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    to7.q(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    ct1.q(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    yq4.f();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z2 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z2) {
                        executorService.shutdownNow();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method m(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        ?? r11;
        boolean z2;
        int length = methodArr.length;
        boolean z3 = false;
        int i2 = 0;
        while (i2 < length) {
            method = methodArr[i2];
            if (str.equals(method.getName()) || bc7.N(z3, method.getName(), str.concat("-"))) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z4 = z3;
                    ?? r12 = z4;
                    while (r11 < length2) {
                        Class<?> cls = parameterTypes[r11];
                        int i3 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        cls.getClass();
                        x86 x86Var = w86.a;
                        wt3 wt3VarB = x86Var.b(cls);
                        cls2.getClass();
                        if (wt3VarB.equals(x86Var.b(cls2)) || cls.isAssignableFrom(cls2)) {
                            r11 = z4;
                            r11 = z4;
                            z2 = true;
                        } else {
                            r11 = z4;
                            z2 = false;
                        }
                        arrayList.add(Boolean.valueOf(z2));
                        r12 = i3;
                        r11++;
                    }
                    r11 = z4;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (((Boolean) it.next()).booleanValue());
                    }
                    if (method != null) {
                        return method;
                    }
                    throw new NoSuchMethodException(str.concat(" not found"));
                }
                continue;
            }
            i2++;
            z3 = false;
        }
        method = null;
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public static Method n(Class cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i2++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(((double) length2) / 10.0d);
                Class cls3 = Integer.TYPE;
                yk3 yk3VarB0 = ct1.b0(0, iCeil);
                ArrayList arrayList2 = new ArrayList(mv0.Z(yk3VarB0, 10));
                Iterator it = yk3VarB0.iterator();
                while (((xk3) it).f2526o) {
                    ((xk3) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                nm nmVar = new nm(3);
                ArrayList arrayList3 = nmVar.a;
                nmVar.i(clsArr);
                nmVar.g(ux2.class);
                nmVar.i(clsArr2);
                return m(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!im3.n(method.getName(), str)) {
                    if (!bc7.N(false, method.getName(), str + "-")) {
                    }
                }
                return method;
            }
            return null;
        }
    }

    public static int[] o(k70 k70Var, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i5 = 0;
        while (k70Var.b(i2, i3) && i2 > 0) {
            int i6 = i5 + 1;
            if (i5 >= 3) {
                break;
            }
            i2--;
            i5 = i6;
        }
        int length = iArr.length;
        int i7 = i2;
        int i8 = 0;
        boolean z2 = false;
        while (i2 < i4) {
            if (k70Var.b(i2, i3) != z2) {
                iArr2[i8] = iArr2[i8] + 1;
            } else {
                if (i8 != length - 1) {
                    i8++;
                } else {
                    if (x(iArr2, iArr) < 0.42f) {
                        return new int[]{i7, i2};
                    }
                    i7 += iArr2[0] + iArr2[1];
                    int i9 = i8 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i9);
                    iArr2[i9] = 0;
                    iArr2[i8] = 0;
                    i8--;
                }
                iArr2[i8] = 1;
                z2 = !z2;
            }
            i2++;
        }
        if (i8 != length - 1 || x(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i2 - 1};
    }

    public static wc6[] p(k70 k70Var, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        int i7;
        boolean z2;
        int[] iArrO;
        wc6[] wc6VarArr = new wc6[4];
        int[] iArr2 = iArr;
        int[] iArr3 = new int[iArr2.length];
        int i8 = i4;
        while (true) {
            if (i8 >= i2) {
                i7 = i8;
                z2 = false;
                break;
            }
            int[] iArrO2 = o(k70Var, i5, i8, i3, iArr2, iArr3);
            if (iArrO2 != null) {
                int[] iArr4 = iArrO2;
                while (true) {
                    i7 = i8;
                    if (i7 <= 0 || (iArrO = o(k70Var, i5, (i8 = i7 - 1), i3, iArr, iArr3)) == null) {
                        break;
                    }
                    iArr4 = iArrO;
                }
                float f2 = i7;
                wc6VarArr[0] = new wc6(iArr4[0], f2);
                wc6VarArr[1] = new wc6(iArr4[1], f2);
                z2 = true;
                break;
            }
            i8 += 5;
            iArr2 = iArr;
        }
        int i9 = i7 + 1;
        if (z2) {
            int[] iArr5 = {(int) wc6VarArr[0].a, (int) wc6VarArr[1].a};
            int i10 = i9;
            int i11 = 0;
            while (i10 < i2) {
                int[] iArrO3 = o(k70Var, iArr5[0], i10, i3, iArr, iArr3);
                if (iArrO3 != null && Math.abs(iArr5[0] - iArrO3[0]) < 5 && Math.abs(iArr5[1] - iArrO3[1]) < 5) {
                    iArr5 = iArrO3;
                    i11 = 0;
                } else {
                    if (i11 > 25) {
                        break;
                    }
                    i11++;
                }
                i10++;
            }
            i9 = i10 - (i11 + 1);
            float f3 = i9;
            wc6VarArr[2] = new wc6(iArr5[0], f3);
            wc6VarArr[3] = new wc6(iArr5[1], f3);
        }
        if (i9 - i7 < i6) {
            Arrays.fill(wc6VarArr, (Object) null);
        }
        return wc6VarArr;
    }

    public static final List q(rn1 rn1Var, String str) {
        rn1Var.getClass();
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayListQ0 = lv0.Q0(rn1Var.a(str));
        while (!arrayListQ0.isEmpty()) {
            String str2 = (String) qv0.e0(arrayListQ0);
            linkedHashSet.add(str2);
            arrayListQ0.addAll(rn1Var.a(str2));
        }
        return lv0.P0(linkedHashSet);
    }

    public static String r(WebLoginActivity webLoginActivity) {
        PackageManager packageManager = webLoginActivity.getPackageManager();
        ArrayList<String> arrayList = new ArrayList();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        io.sentry.android.core.v0.j("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public static void s(String str, String str2, ux2 ux2Var, Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            Method methodN = n(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodN != null) {
                methodN.setAccessible(true);
                if (Modifier.isStatic(methodN.getModifiers())) {
                    t(methodN, null, ux2Var, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    t(methodN, cls.getConstructor(null).newInstance(null), ux2Var, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + "." + str2 + " not found");
        } catch (Exception e2) {
            io.sentry.android.core.v0.l("PreviewLogger", fx3.h("Failed to invoke Composable Method '", str, ".", str2, "'"), null);
            throw e2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00eb  */
    public static void t(Method method, Object obj, ux2 ux2Var, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Object objValueOf;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i2 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i3 = length - 1;
                if (im3.n(parameterTypes[length], ux2.class)) {
                    i2 = length;
                    break;
                } else if (i3 < 0) {
                    break;
                } else {
                    length = i3;
                }
            }
        }
        int i4 = i2 + 1;
        int iCeil = (i2 != 0 ? (int) Math.ceil(((double) ((obj != null ? 1 : 0) + i2)) / 10.0d) : 1) + i4;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iCeil ? (int) Math.ceil(((double) i2) / 31.0d) : 0) + iCeil != length2) {
            hk0.l("params don't add up to total params");
            return;
        }
        Object[] objArr2 = new Object[length2];
        for (int i5 = 0; i5 < length2; i5++) {
            if (i5 < 0 || i5 >= i2) {
                if (i5 == i2) {
                    objValueOf = ux2Var;
                } else if (i4 <= i5 && i5 < iCeil) {
                    objValueOf = 0;
                } else {
                    if (iCeil > i5 || i5 >= length2) {
                        hk0.l("Unexpected index");
                        return;
                    }
                    objValueOf = 2097151;
                }
            } else if (i5 < 0 || i5 >= objArr.length) {
                switch (method.getParameterTypes()[i5].getName()) {
                    case "double":
                        objValueOf = Double.valueOf(0.0d);
                        break;
                    case "int":
                        objValueOf = 0;
                        break;
                    case "byte":
                        objValueOf = (byte) 0;
                        break;
                    case "char":
                        objValueOf = (char) 0;
                        break;
                    case "long":
                        objValueOf = 0L;
                        break;
                    case "boolean":
                        objValueOf = Boolean.FALSE;
                        break;
                    case "float":
                        objValueOf = Float.valueOf(0.0f);
                        break;
                    case "short":
                        objValueOf = (short) 0;
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                objValueOf = objArr[i5];
            }
            objArr2[i5] = objValueOf;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    public static boolean u(WebLoginActivity webLoginActivity, String str) {
        IntentFilter intentFilter;
        for (ResolveInfo resolveInfo : webLoginActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64)) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && str.equals(serviceInfo.packageName) && (intentFilter = resolveInfo.filter) != null && intentFilter.hasCategory("androidx.browser.auth.category.AuthTab")) {
                return true;
            }
        }
        return false;
    }

    public static final fs4 v(fs4 fs4Var, sv3 sv3Var, b44 b44Var, gb5 gb5Var, boolean z2) {
        return fs4Var.f(new c44(sv3Var, b44Var, gb5Var, z2));
    }

    public static final k3 w(df6 df6Var, vi8 vi8Var) {
        df6Var.getClass();
        k3 k3Var = new k3();
        iu iuVar = (iu) df6Var.n;
        i3 i3VarV = iuVar.v(vi8Var);
        i3VarV.getClass();
        k3Var.setValue(i3VarV);
        j3 j3Var = new j3(k3Var);
        EnumMap enumMap = (EnumMap) iuVar.n;
        List arrayList = (List) enumMap.get(vi8Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            enumMap.put(vi8Var, arrayList);
        }
        arrayList.add(j3Var);
        return k3Var;
    }

    public static float x(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            i2 += iArr[i4];
            i3 += iArr2[i4];
        }
        if (i2 < i3) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i2;
        float f3 = f2 / i3;
        float f4 = 0.8f * f3;
        float f5 = 0.0f;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr[i5];
            float f6 = iArr2[i5] * f3;
            float f7 = i6;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    public static void y(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z2) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void z(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = iArr.length == 0 ? 0.0f : (i2 - i4) / iArr.length;
        float f2 = length / 2.0f;
        if (!z2) {
            int length2 = iArr.length;
            int i6 = 0;
            while (i3 < length2) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7 + length;
                i3++;
                i6++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i8 = iArr[length3];
            iArr2[length3] = Math.round(f2);
            f2 += i8 + length;
        }
    }

    public abstract List i(String str, List list);
}
