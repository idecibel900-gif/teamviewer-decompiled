package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.Xml;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.contacts.models.AccountContactDeviceInfo;
import com.teamviewer.apidefinitions.legacydevices.models.Device;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceType;
import com.teamviewer.apidefinitions.recentconnections.models.ContactOnlineStatus;
import com.teamviewer.apidefinitions.recentconnections.models.RecentConnectionsItem;
import com.teamviewer.apidefinitions.recentconnections.models.RecentConnectionsItemType;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class db8 {
    public static final float[] A;
    public static final yi5 B;
    public static final v56 C;
    public static final yu7 D;
    public static final bm2 E;
    public static final yy0 b;
    public static final yy0 c;
    public static final yy0 f;
    public static final yy0 g;
    public static final yy0 h;
    public static final yy0 k;
    public static final yy0 m;
    public static final yy0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yy0 f605o;
    public static final yy0 p;
    public static final yy0 q;
    public static final yy0 r;
    public static final yy0 s;
    public static final yy0 t;
    public static final ax6 u;
    public static final float v;
    public static final wi8 w;
    public static final wi8 x;
    public static final wi8 y;
    public static final wi8 z;
    public static final Object a = new Object();
    public static final yy0 d = new yy0(1078103250, false, new g9((byte) 25));
    public static final yy0 e = new yy0(-159923713, false, new g9((byte) 26));
    public static final yy0 i = new yy0(-279621334, false, new az0(3));
    public static final yy0 j = new yy0(1479194691, false, new bz0(1));
    public static final yy0 l = new yy0(1179744774, false, new az0(19));

    static {
        byte b2 = 23;
        b = new yy0(2080284153, false, new g9(b2));
        byte b3 = 24;
        c = new yy0(1676622697, false, new g9(b3));
        byte b4 = 27;
        f = new yy0(-666078746, false, new g9(b4));
        byte b5 = 28;
        g = new yy0(1247466353, false, new g9(b5));
        byte b6 = 11;
        h = new yy0(697113564, false, new p20(b6));
        byte b7 = 2;
        k = new yy0(-177811550, false, new bz0(b7));
        new yy0(1789270639, false, new fz0((byte) 7));
        m = new yy0(1205358841, false, new fz0(b4));
        n = new yy0(-1283588138, false, new fz0(b5));
        f605o = new yy0(560446882, false, new fz0((byte) 29));
        p = new yy0(979183935, false, new hz0((byte) 0));
        q = new yy0(1321310773, false, new gz0(b2));
        r = new yy0(1830089587, false, new gz0(b3));
        s = new yy0(-6834674, false, new iz0(b6));
        t = new yy0(247554733, false, new iz0((byte) 12));
        u = ax6.r;
        v = 56.0f;
        w = new wi8(0.31006f, 0.31616f);
        x = new wi8(0.34567f, 0.3585f);
        y = new wi8(0.32168f, 0.33767f);
        z = new wi8(0.31271f, 0.32902f);
        A = new float[]{0.964212f, 1.0f, 0.825188f};
        B = new yi5(b7);
        C = new v56(0.0f, 0.0f, 10.0f, 10.0f);
        D = yu7.m;
        E = new bm2();
    }

    public static final nw3 A(nw3 nw3Var) {
        nw3Var.getClass();
        return nw3Var.d().c() ? nw3Var : new f65(nw3Var);
    }

    public static e87 A0(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new e87(f2, f3, obj);
    }

    public static d58 B(l48 l48Var, int i2) {
        l48Var.getClass();
        if (l48Var instanceof k48) {
            Object obj = ((k48) l48Var).getParameters().get(i2);
            obj.getClass();
            return (d58) obj;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l48Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, l48Var.getClass(), sb));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ws0 B0(xs0 xs0Var, i07 i07Var) {
        if (i07Var instanceof g07) {
            oz3 oz3Var = (oz3) i07Var;
            return new ws0(xs0Var, new m58(m48.b.e(oz3Var.o0(), oz3Var.m0())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(i07Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, i07Var.getClass(), sb));
        return null;
    }

    public static m98 C(h58 h58Var) {
        h58Var.getClass();
        if (h58Var instanceof h58) {
            return h58Var.b().r0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(h58Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, h58Var.getClass(), sb));
        return null;
    }

    public static Collection C0(l48 l48Var) {
        l48Var.getClass();
        if (l48Var instanceof k48) {
            Collection collectionB = ((k48) l48Var).b();
            collectionB.getClass();
            return collectionB;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l48Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, l48Var.getClass(), sb));
        return null;
    }

    public static d58 D(l48 l48Var) {
        l48Var.getClass();
        if (l48Var instanceof k48) {
            ys0 ys0VarA = ((k48) l48Var).a();
            if (ys0VarA instanceof d58) {
                return (d58) ys0VarA;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l48Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, l48Var.getClass(), sb));
        return null;
    }

    public static final jz1 D0(DeviceType deviceType) {
        int i2 = a41.d[deviceType.ordinal()];
        if (i2 == 1) {
            return jz1.m;
        }
        if (i2 == 2) {
            return jz1.n;
        }
        if (i2 == 3) {
            return jz1.f1214o;
        }
        if (i2 == 4) {
            return jz1.p;
        }
        gk0.s();
        return null;
    }

    public static q58 E(h58 h58Var) {
        h58Var.getClass();
        if (h58Var instanceof h58) {
            ub8 ub8VarA = h58Var.a();
            ub8VarA.getClass();
            return o77.f(ub8VarA);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(h58Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, h58Var.getClass(), sb));
        return null;
    }

    public static final z31 E0(AccountContactDeviceInfo accountContactDeviceInfo) {
        accountContactDeviceInfo.getClass();
        String name = accountContactDeviceInfo.getName();
        if (name == null) {
            name = String.valueOf(accountContactDeviceInfo.getTeamviewerId());
        }
        return new z31(name, ea2.m, null, String.valueOf(accountContactDeviceInfo.getTeamviewerId()), null, null, null, null, f95.f778o, b41.p, null, null, null, 7268);
    }

    public static boolean F(oz3 oz3Var, ht2 ht2Var) {
        return oz3Var.getAnnotations().o0(ht2Var);
    }

    public static final z31 F0(Device device) {
        f95 f95Var;
        jz1 jz1Var;
        device.getClass();
        GroupListElementViewModel groupListElementViewModelK = ds1.k(new PListGroupID(device.getGroupId()));
        jz1 jz1Var2 = null;
        String strGroupListElementViewModel_GetName = groupListElementViewModelK != null ? GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetName(groupListElementViewModelK.c, groupListElementViewModelK) : null;
        String displayName = device.getDisplayName();
        if (strGroupListElementViewModel_GetName == null) {
            strGroupListElementViewModel_GetName = "";
        }
        List listK = qf0.K(strGroupListElementViewModel_GetName);
        List listK2 = qf0.K(String.valueOf(device.getGroupId()));
        String strValueOf = String.valueOf(device.getTeamViewerId());
        int i2 = a41.c[device.getOnlineStatus().ordinal()];
        if (i2 == 1) {
            f95Var = f95.f778o;
        } else {
            if (i2 != 2) {
                gk0.s();
                return null;
            }
            f95Var = f95.n;
        }
        f95 f95Var2 = f95Var;
        com.teamviewer.apidefinitions.legacydevices.models.DeviceType deviceType = device.getDeviceType();
        if (deviceType != null) {
            int i3 = a41.e[deviceType.ordinal()];
            if (i3 == 1) {
                jz1Var = jz1.m;
            } else if (i3 == 2) {
                jz1Var = jz1.n;
            } else if (i3 == 3) {
                jz1Var = jz1.f1214o;
            } else {
                if (i3 != 4) {
                    gk0.s();
                    return null;
                }
                jz1Var = jz1.p;
            }
            jz1Var2 = jz1Var;
        }
        return new z31(displayName, listK, listK2, strValueOf, null, null, null, null, f95Var2, b41.n, jz1Var2, Integer.valueOf(device.getDeviceId()), hs1.m, 96);
    }

    public static boolean G(i48 i48Var, i07 i07Var, o67 o67Var) {
        h48 h48Var = h48.c;
        i07Var.getClass();
        xs0 xs0Var = i48Var.c;
        if ((xs0Var.R(i07Var) && !xs0Var.r0(i07Var)) || xs0Var.Z(i07Var)) {
            return true;
        }
        i48Var.c();
        ArrayDeque arrayDeque = i48Var.f;
        arrayDeque.getClass();
        v17 v17Var = i48Var.g;
        v17Var.getClass();
        arrayDeque.push(i07Var);
        while (!arrayDeque.isEmpty()) {
            if (v17Var.a() > 1000) {
                StringBuilder sb = new StringBuilder("Too many supertypes for type: ");
                sb.append(i07Var);
                gk0.q(sb, ". Supertypes = ", lv0.t0(v17Var, null, null, null, null, 63));
                return false;
            }
            i07 i07Var2 = (i07) arrayDeque.pop();
            i07Var2.getClass();
            if (v17Var.add(i07Var2)) {
                o67 o67Var2 = xs0Var.r0(i07Var2) ? h48Var : o67Var;
                if (o67Var2.equals(h48Var)) {
                    o67Var2 = null;
                }
                if (o67Var2 == null) {
                    continue;
                } else {
                    Iterator it = xs0Var.v0(xs0Var.b0(i07Var2)).iterator();
                    while (it.hasNext()) {
                        i07 i07VarO = o67Var2.o(i48Var, (sz3) it.next());
                        if ((xs0Var.R(i07VarO) && !xs0Var.r0(i07VarO)) || xs0Var.Z(i07VarO)) {
                            i48Var.a();
                            return true;
                        }
                        arrayDeque.add(i07VarO);
                    }
                }
            }
        }
        i48Var.a();
        return false;
    }

    public static final z31 G0(x46 x46Var) {
        x46Var.getClass();
        return new z31(x46Var.b, ea2.m, null, x46Var.a, null, null, null, null, x46Var.c, b41.p, x46Var.d, null, x46Var.e, 2164);
    }

    public static boolean H(d58 d58Var, l48 l48Var) {
        if (l48Var == null ? true : l48Var instanceof k48) {
            return n37.p(d58Var, (k48) l48Var, null);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(d58Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, d58Var.getClass(), sb));
        return false;
    }

    public static final x46 H0(RecentConnectionsItem recentConnectionsItem) {
        f95 f95Var;
        Long buddyId;
        recentConnectionsItem.getClass();
        String strValueOf = String.valueOf(recentConnectionsItem.getConnectId());
        String displayName = recentConnectionsItem.getDisplayName();
        ContactOnlineStatus onlineState = recentConnectionsItem.getOnlineState();
        int i2 = onlineState == null ? -1 : a41.f[onlineState.ordinal()];
        if (i2 == -1) {
            f95Var = f95.s;
        } else if (i2 == 1) {
            f95Var = f95.f778o;
        } else if (i2 == 2) {
            f95Var = f95.n;
        } else if (i2 == 3) {
            f95Var = f95.p;
        } else if (i2 == 4) {
            f95Var = f95.m;
        } else {
            if (i2 != 5) {
                gk0.s();
                return null;
            }
            f95Var = f95.q;
        }
        RecentConnectionsItemType itemType = recentConnectionsItem.getItemType();
        RecentConnectionsItemType recentConnectionsItemType = RecentConnectionsItemType.Device;
        hs1 hs1Var = hs1.f1004o;
        if (itemType == recentConnectionsItemType) {
            if (recentConnectionsItem.getBuddyId() != null && ((buddyId = recentConnectionsItem.getBuddyId()) == null || buddyId.longValue() != 0)) {
                hs1Var = hs1.m;
            } else if (!recentConnectionsItem.getCanBeAddedToPartnerList()) {
                hs1Var = hs1.n;
            }
        }
        return new x46(strValueOf, displayName, f95Var, null, hs1Var);
    }

    public static boolean I(i07 i07Var, i07 i07Var2) {
        i07Var.getClass();
        i07Var2.getClass();
        if (!(i07Var instanceof g07)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(i07Var);
            sb.append(", ");
            gk0.h(ua5.o(w86.a, i07Var.getClass(), sb));
            return false;
        }
        if (i07Var2 instanceof g07) {
            return ((g07) i07Var).m0() == ((g07) i07Var2).m0();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(i07Var2);
        sb2.append(", ");
        gk0.h(ua5.o(w86.a, i07Var2.getClass(), sb2));
        return false;
    }

    public static z38 I0(int i2, int i3, p72 p72Var) {
        if ((i3 & 1) != 0) {
            i2 = 300;
        }
        int i4 = (i3 & 2) != 0 ? 0 : 90;
        if ((i3 & 4) != 0) {
            p72Var = q72.a;
        }
        return new z38(i2, i4, p72Var);
    }

    public static qh3 J(d72 d72Var, int i2) {
        return new qh3(d72Var, ra6.m);
    }

    public static i35 J0(am0 am0Var) {
        if (am0Var instanceof h35) {
            return ((h35) am0Var).f947o;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(am0Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, am0Var.getClass(), sb));
        return null;
    }

    public static boolean K(l48 l48Var) {
        l48Var.getClass();
        if (l48Var instanceof k48) {
            return wy3.H((k48) l48Var, s87.a);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l48Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, l48Var.getClass(), sb));
        return false;
    }

    public static k48 K0(i07 i07Var) {
        i07Var.getClass();
        if (i07Var instanceof g07) {
            return ((g07) i07Var).o0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(i07Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, i07Var.getClass(), sb));
        return null;
    }

    public static boolean L(i48 i48Var, i07 i07Var, l48 l48Var) {
        xs0 xs0Var = i48Var.c;
        if (xs0Var.V(i07Var)) {
            return true;
        }
        if (xs0Var.r0(i07Var)) {
            return false;
        }
        if (i48Var.b) {
            xs0Var.F(i07Var);
        }
        return xs0Var.X(xs0Var.b0(i07Var), l48Var);
    }

    public static g07 L0(um2 um2Var) {
        if (um2Var instanceof um2) {
            return um2Var.f2226o;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(um2Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, um2Var.getClass(), sb));
        return null;
    }

    public static boolean M(l48 l48Var) {
        l48Var.getClass();
        if (l48Var instanceof k48) {
            return ((k48) l48Var).a() instanceof ns4;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l48Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, l48Var.getClass(), sb));
        return false;
    }

    public static final void M0(hr2 hr2Var, Context context, int i2) {
        context.getClass();
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i2);
            inputStreamOpenRawResource.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, vn0.a), 8192);
            try {
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[8192];
                for (int i3 = bufferedReader.read(cArr); i3 >= 0; i3 = bufferedReader.read(cArr)) {
                    stringWriter.write(cArr, 0, i3);
                }
                String string = stringWriter.toString();
                string.getClass();
                bufferedReader.close();
                hr2Var.n = string;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kh.n(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Throwable unused) {
            io.sentry.android.core.v0.c("AboutLibraries", "Unable to retrieve library information given the `raw` resource identifier. \nPlease make sure either the gradle plugin is properly set up, or the file is manually provided. ");
            System.out.println((Object) "Could not retrieve libraries");
        }
    }

    public static boolean N(l48 l48Var) {
        if (l48Var instanceof k48) {
            ys0 ys0VarA = ((k48) l48Var).a();
            ns4 ns4Var = ys0VarA instanceof ns4 ? (ns4) ys0VarA : null;
            return (ns4Var == null || ns4Var.r() != as4.n || ns4Var.i0() == ms0.f1501o || ns4Var.i0() == ms0.p || ns4Var.i0() == ms0.q) ? false : true;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l48Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, l48Var.getClass(), sb));
        return false;
    }

    public static sz3 N0(xs0 xs0Var, sz3 sz3Var) {
        if (sz3Var instanceof i07) {
            return xs0Var.s((i07) sz3Var, true);
        }
        if (sz3Var instanceof um2) {
            um2 um2Var = (um2) sz3Var;
            return xs0Var.J(xs0Var.s(xs0Var.f0(um2Var), true), xs0Var.s(xs0Var.x(um2Var), true));
        }
        hk0.l("sealed");
        return null;
    }

    public static boolean O(l48 l48Var) {
        l48Var.getClass();
        if (l48Var instanceof k48) {
            return ((k48) l48Var).c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l48Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, l48Var.getClass(), sb));
        return false;
    }

    public static g07 O0(i07 i07Var, boolean z2) {
        i07Var.getClass();
        if (i07Var instanceof g07) {
            return ((g07) i07Var).s0(z2);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(i07Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, i07Var.getClass(), sb));
        return null;
    }

    public static boolean P(sz3 sz3Var) {
        sz3Var.getClass();
        if (sz3Var instanceof oz3) {
            return ct1.K((oz3) sz3Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sz3Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, sz3Var.getClass(), sb));
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018c A[Catch: all -> 0x0189, TRY_ENTER, TryCatch #27 {all -> 0x0189, blocks: (B:88:0x0168, B:90:0x0174, B:101:0x018c, B:102:0x0191), top: B:274:0x0168, outer: #33 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x019b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x019d A[Catch: IllegalStateException -> 0x0183, IOException -> 0x0185, FileNotFoundException -> 0x0187, TRY_LEAVE, TryCatch #33 {FileNotFoundException -> 0x0187, IOException -> 0x0185, IllegalStateException -> 0x0183, blocks: (B:86:0x0160, B:91:0x017e, B:109:0x019d, B:107:0x019a, B:106:0x0197, B:88:0x0168, B:90:0x0174, B:101:0x018c, B:102:0x0191, B:103:0x0192), top: B:293:0x0160, inners: #27, #36 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01dd A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #8 {all -> 0x01eb, blocks: (B:124:0x01d1, B:126:0x01dd, B:135:0x01ee), top: B:257:0x01d1, outer: #36 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01ee A[Catch: all -> 0x01eb, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x01eb, blocks: (B:124:0x01d1, B:126:0x01dd, B:135:0x01ee), top: B:257:0x01d1, outer: #36 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x020b  */
    /* JADX WARN: Code duplicated, block: B:150:0x0215  */
    /* JADX WARN: Code duplicated, block: B:151:0x0219  */
    /* JADX WARN: Code duplicated, block: B:160:0x023f A[Catch: all -> 0x027d, TryCatch #23 {all -> 0x027d, blocks: (B:158:0x0239, B:160:0x023f, B:161:0x0243, B:163:0x0249), top: B:272:0x0239 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0249 A[Catch: all -> 0x027d, TRY_LEAVE, TryCatch #23 {all -> 0x027d, blocks: (B:158:0x0239, B:160:0x023f, B:161:0x0243, B:163:0x0249), top: B:272:0x0239 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:233:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:240:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:272:0x0239 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x021d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x024e A[EDGE_INSN: B:294:0x024e->B:165:0x024e BREAK  A[LOOP:0: B:161:0x0243->B:295:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:55:0x0115 A[Catch: all -> 0x012a, IllegalStateException -> 0x012d, IOException -> 0x012f, TRY_LEAVE, TryCatch #38 {IOException -> 0x012f, IllegalStateException -> 0x012d, blocks: (B:53:0x010b, B:55:0x0115, B:66:0x0131, B:67:0x0136), top: B:289:0x010b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0131 A[Catch: all -> 0x012a, IllegalStateException -> 0x012d, IOException -> 0x012f, TRY_ENTER, TryCatch #38 {IOException -> 0x012f, IllegalStateException -> 0x012d, blocks: (B:53:0x010b, B:55:0x0115, B:66:0x0131, B:67:0x0136), top: B:289:0x010b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0174 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #27 {all -> 0x0189, blocks: (B:88:0x0168, B:90:0x0174, B:101:0x018c, B:102:0x0191), top: B:274:0x0168, outer: #33 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.io.Serializable, o.h02[]] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Serializable] */
    public static void P0(Context context, Executor executor, lt5 lt5Var, boolean z2) {
        boolean z3;
        ?? B2;
        ?? r9;
        h02[] h02VarArrG;
        h02[] h02VarArr;
        lt5 lt5Var2;
        h02[] h02VarArr2;
        byte[] bArr;
        ?? r7;
        byte[] bArr2;
        ?? r8;
        boolean z4;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStreamG;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i2;
        ?? r10;
        boolean z5;
        ?? byteArrayOutputStream;
        ?? r11;
        kv1 kv1Var;
        ?? r12;
        FileInputStream fileInputStreamB;
        ?? r13;
        ?? r14;
        boolean z6;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(io.sentry.config.a.c(file, new FileInputStream(file)));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z6 = j2 == packageInfo.lastUpdateTime;
                            if (z6) {
                                lt5Var.q(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                if (z6) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    ot5.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr4 = pm8.q;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            kv1 kv1Var2 = new kv1(assets, executor, lt5Var, name, file2);
            byte[] bArr5 = (byte[]) kv1Var2.d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            kv1Var2.a = true;
                            B2 = kv1Var2.b(assets, "dexopt/baseline.prof");
                            if (B2 != 0) {
                                if (Arrays.equals(bArr4, yo1.N(B2, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                h02VarArrG = pm8.G(B2, yo1.N(B2, 4), (String) kv1Var2.g);
                                B2.close();
                                r9 = h02VarArrG;
                                kv1Var2.h = r9;
                            }
                            h02VarArr = (h02[]) kv1Var2.h;
                            if (h02VarArr != null) {
                                B2 = "dexopt/baseline.profm";
                                fileInputStreamB = kv1Var2.b(assets, "dexopt/baseline.profm");
                                r12 = B2;
                                if (fileInputStreamB == null) {
                                    if (fileInputStreamB != null) {
                                        fileInputStreamB.close();
                                        r12 = B2;
                                    }
                                    kv1Var = null;
                                    B2 = r12;
                                } else {
                                    if (Arrays.equals(pm8.r, yo1.N(fileInputStreamB, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrN = yo1.N(fileInputStreamB, 4);
                                    kv1Var2.h = pm8.D(fileInputStreamB, bArrN, bArr5, h02VarArr);
                                    fileInputStreamB.close();
                                    kv1Var = kv1Var2;
                                    B2 = bArrN;
                                }
                                if (kv1Var != null) {
                                    kv1Var2 = kv1Var;
                                }
                            }
                            lt5Var2 = (lt5) kv1Var2.c;
                            h02VarArr2 = (h02[]) kv1Var2.h;
                            bArr = (byte[]) kv1Var2.d;
                            r7 = B2;
                            r7 = B2;
                            if (h02VarArr2 != null) {
                                byteArrayOutputStream = kv1Var2.a;
                                if (byteArrayOutputStream != 0) {
                                    hk0.l("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr4);
                                byteArrayOutputStream.write(bArr);
                                if (pm8.K(byteArrayOutputStream, bArr, h02VarArr2)) {
                                    kv1Var2.e = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r11 = byteArrayOutputStream;
                                    kv1Var2.h = null;
                                    r7 = r11;
                                } else {
                                    lt5Var2.q(5, null);
                                    kv1Var2.h = null;
                                    byteArrayOutputStream.close();
                                    r7 = byteArrayOutputStream;
                                }
                            }
                            bArr2 = (byte[]) kv1Var2.e;
                            if (bArr2 != null) {
                                if (kv1Var2.a) {
                                    hk0.l("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                File file3 = (File) kv1Var2.f;
                                fileOutputStreamG = io.sentry.config.a.g(new FileOutputStream(file3), file3);
                                channel = fileOutputStreamG.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i2 = byteArrayInputStream.read(bArr3);
                                            if (i2 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStreamG.write(bArr3, 0, i2);
                                        }
                                        r10 = 1;
                                        kv1Var2.c(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStreamG.close();
                                        byteArrayInputStream.close();
                                        kv1Var2.e = null;
                                        kv1Var2.h = null;
                                        z4 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z4 = false;
                            r10 = 1;
                            if (z4) {
                                q0(packageInfo, filesDir);
                            }
                            z5 = z4;
                            r13 = r10;
                        } else {
                            kv1Var2.c(4, null);
                        }
                    } catch (IOException unused2) {
                        z3 = true;
                        kv1Var2.c(4, null);
                    }
                } else if (file2.canWrite()) {
                    kv1Var2.a = true;
                    try {
                        B2 = kv1Var2.b(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        lt5Var.q(6, e2);
                        B2 = 0;
                    } catch (IOException e3) {
                        lt5Var.q(7, e3);
                        B2 = 0;
                    }
                    try {
                        if (B2 != 0) {
                            try {
                                if (Arrays.equals(bArr4, yo1.N(B2, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                h02VarArrG = pm8.G(B2, yo1.N(B2, 4), (String) kv1Var2.g);
                                try {
                                    B2.close();
                                    r9 = h02VarArrG;
                                } catch (IOException e4) {
                                    lt5Var.q(7, e4);
                                    r9 = h02VarArrG;
                                }
                                kv1Var2.h = r9;
                            } catch (IOException e5) {
                                lt5Var.q(7, e5);
                                try {
                                    B2.close();
                                } catch (IOException e6) {
                                    lt5Var.q(7, e6);
                                }
                                r9 = 0;
                            } catch (IllegalStateException e7) {
                                lt5Var.q(8, e7);
                                B2.close();
                                r9 = 0;
                            }
                        }
                        h02VarArr = (h02[]) kv1Var2.h;
                        if (h02VarArr != null && (B2 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                B2 = "dexopt/baseline.profm";
                                fileInputStreamB = kv1Var2.b(assets, "dexopt/baseline.profm");
                                r12 = B2;
                                if (fileInputStreamB == null) {
                                    try {
                                        if (Arrays.equals(pm8.r, yo1.N(fileInputStreamB, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrN2 = yo1.N(fileInputStreamB, 4);
                                        kv1Var2.h = pm8.D(fileInputStreamB, bArrN2, bArr5, h02VarArr);
                                        fileInputStreamB.close();
                                        kv1Var = kv1Var2;
                                        B2 = bArrN2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamB.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamB != null) {
                                        fileInputStreamB.close();
                                        r12 = B2;
                                    }
                                    kv1Var = null;
                                    B2 = r12;
                                }
                            } catch (FileNotFoundException e8) {
                                lt5Var.q(9, e8);
                                r12 = B2;
                                kv1Var = null;
                                B2 = r12;
                            } catch (IOException e9) {
                                lt5Var.q(7, e9);
                                r12 = B2;
                                kv1Var = null;
                                B2 = r12;
                            } catch (IllegalStateException e10) {
                                kv1Var2.h = null;
                                lt5Var.q(8, e10);
                                r12 = B2;
                                kv1Var = null;
                                B2 = r12;
                            }
                            if (kv1Var != null) {
                                kv1Var2 = kv1Var;
                            }
                        }
                        lt5Var2 = (lt5) kv1Var2.c;
                        h02VarArr2 = (h02[]) kv1Var2.h;
                        bArr = (byte[]) kv1Var2.d;
                        r7 = B2;
                        r7 = B2;
                        if (h02VarArr2 != null && bArr != null) {
                            byteArrayOutputStream = kv1Var2.a;
                            if (byteArrayOutputStream != 0) {
                                hk0.l("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr);
                                    if (pm8.K(byteArrayOutputStream, bArr, h02VarArr2)) {
                                        lt5Var2.q(5, null);
                                        kv1Var2.h = null;
                                        byteArrayOutputStream.close();
                                        r7 = byteArrayOutputStream;
                                    } else {
                                        kv1Var2.e = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r11 = byteArrayOutputStream;
                                        kv1Var2.h = null;
                                        r7 = r11;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e11) {
                                lt5Var2.q(7, e11);
                                r11 = byteArrayOutputStream;
                            } catch (IllegalStateException e12) {
                                lt5Var2.q(8, e12);
                                r11 = byteArrayOutputStream;
                            }
                        }
                        bArr2 = (byte[]) kv1Var2.e;
                        if (bArr2 != null) {
                            z4 = false;
                            r10 = 1;
                        } else {
                            try {
                                if (kv1Var2.a) {
                                    hk0.l("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                File file4 = (File) kv1Var2.f;
                                                fileOutputStreamG = io.sentry.config.a.g(new FileOutputStream(file4), file4);
                                                try {
                                                    try {
                                                        channel = fileOutputStreamG.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr3 = new byte[512];
                                                                                while (true) {
                                                                                    i2 = byteArrayInputStream.read(bArr3);
                                                                                    if (i2 > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStreamG.write(bArr3, 0, i2);
                                                                                    }
                                                                                }
                                                                                r10 = 1;
                                                                                kv1Var2.c(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStreamG.close();
                                                                                byteArrayInputStream.close();
                                                                                kv1Var2.e = null;
                                                                                kv1Var2.h = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStreamG.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStreamG.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        r7 = 1;
                                        kv1Var2.c(6, e);
                                        r8 = r7;
                                        kv1Var2.e = null;
                                        kv1Var2.h = null;
                                        z4 = false;
                                        r10 = r8;
                                    } catch (IOException e14) {
                                        e = e14;
                                        r7 = 1;
                                        kv1Var2.c(7, e);
                                        r8 = r7;
                                        kv1Var2.e = null;
                                        kv1Var2.h = null;
                                        z4 = false;
                                        r10 = r8;
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    kv1Var2.c(6, e);
                                    r8 = r7;
                                    kv1Var2.e = null;
                                    kv1Var2.h = null;
                                    z4 = false;
                                    r10 = r8;
                                } catch (IOException e16) {
                                    e = e16;
                                    kv1Var2.c(7, e);
                                    r8 = r7;
                                    kv1Var2.e = null;
                                    kv1Var2.h = null;
                                    z4 = false;
                                    r10 = r8;
                                }
                            } catch (Throwable th23) {
                                kv1Var2.e = null;
                                kv1Var2.h = null;
                                throw th23;
                            }
                        }
                        if (z4) {
                            q0(packageInfo, filesDir);
                        }
                        z5 = z4;
                        r13 = r10;
                    } catch (Throwable th24) {
                        try {
                            B2.close();
                            throw th24;
                        } catch (IOException e17) {
                            lt5Var.q(7, e17);
                            throw th24;
                        }
                    }
                } else {
                    kv1Var2.c(4, null);
                }
                if (z5 || !z2) {
                    r14 = 0;
                } else {
                    r14 = r13;
                }
                ot5.c(context, r14);
            }
            kv1Var2.c(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z3 = true;
            z5 = false;
            r13 = z3;
            if (z5) {
                r14 = 0;
            } else {
                r14 = 0;
            }
            ot5.c(context, r14);
        } catch (PackageManager.NameNotFoundException e18) {
            lt5Var.q(7, e18);
            ot5.c(context, false);
        }
    }

    public static final boolean Q(fp6 fp6Var) {
        e45 e45VarD = fp6Var.d();
        jx4 jx4Var = fp6Var.d.m;
        return (e45VarD != null ? e45VarD.j1() : false) || jx4Var.c(kp6.q) || jx4Var.c(kp6.p);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[LOOP:0: B:11:0x001d->B:24:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x005c A[SYNTHETIC] */
    public static final boolean R(fp6 fp6Var) {
        if (!Q(fp6Var)) {
            ap6 ap6Var = fp6Var.d;
            if (ap6Var.f346o) {
                return true;
            }
            jx4 jx4Var = ap6Var.m;
            Object[] objArr = jx4Var.b;
            Object[] objArr2 = jx4Var.c;
            long[] jArr = jx4Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((np6) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 == 8) {
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    } else if (i2 != length) {
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public static boolean S(l48 l48Var) {
        l48Var.getClass();
        if (l48Var instanceof k48) {
            ys0 ys0VarA = ((k48) l48Var).a();
            ns4 ns4Var = ys0VarA instanceof ns4 ? (ns4) ys0VarA : null;
            return (ns4Var != null ? ns4Var.v0() : null) instanceof oi3;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l48Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, l48Var.getClass(), sb));
        return false;
    }

    public static boolean T(l48 l48Var) {
        l48Var.getClass();
        if (l48Var instanceof k48) {
            return l48Var instanceof gl3;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l48Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, l48Var.getClass(), sb));
        return false;
    }

    public static boolean U(l48 l48Var) {
        l48Var.getClass();
        if (l48Var instanceof k48) {
            return l48Var instanceof zl3;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l48Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, l48Var.getClass(), sb));
        return false;
    }

    public static boolean V(i07 i07Var) {
        i07Var.getClass();
        if (i07Var instanceof g07) {
            return ((g07) i07Var).p0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(i07Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, i07Var.getClass(), sb));
        return false;
    }

    public static boolean W(l48 l48Var) {
        l48Var.getClass();
        if (l48Var instanceof k48) {
            return wy3.H((k48) l48Var, s87.b);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l48Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, l48Var.getClass(), sb));
        return false;
    }

    public static boolean X(sz3 sz3Var) {
        sz3Var.getClass();
        if (sz3Var instanceof oz3) {
            return p58.e((oz3) sz3Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sz3Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, sz3Var.getClass(), sb));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean Y(i07 i07Var) {
        if (i07Var instanceof oz3) {
            return wy3.F((oz3) i07Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(i07Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, i07Var.getClass(), sb));
        return false;
    }

    public static boolean Z(am0 am0Var) {
        if (am0Var instanceof h35) {
            return ((h35) am0Var).s;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(am0Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, am0Var.getClass(), sb));
        return false;
    }

    public static final void a(boolean z2, boolean z3, Function0 function0, fs4 fs4Var, iy iyVar, xy6 xy6Var, ux2 ux2Var, int i2) {
        int i3;
        fs4 fs4Var2;
        iy iyVar2;
        xy6 xy6Var2;
        xy6 xy6VarR;
        int i4;
        iy iyVar3;
        fs4 fs4Var3;
        function0.getClass();
        ux2Var.Y(-1107172191);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.g(z3) ? 32 : 16;
        }
        byte b2 = 1;
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.g(true) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.h(function0) ? 2048 : 1024;
        }
        int i5 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i5 = 90112 | i3;
        }
        if ((1572864 & i2) == 0) {
            i5 |= 524288;
        }
        int i6 = i5;
        if (ux2Var.N(i6 & 1, (599187 & i6) != 599186)) {
            ux2Var.S();
            if ((i2 & 1) == 0 || ux2Var.x()) {
                dl5 dl5Var = new dl5(new zq((byte) 12), b2);
                we8 we8VarA = id4.a(ux2Var);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                iy iyVar4 = (iy) g57.t(w86.a.b(iy.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var);
                xy6VarR = yo1.R(null, ux2Var, 6, 2);
                i4 = i6 & (-4128769);
                iyVar3 = iyVar4;
                fs4Var3 = cs4.b;
            } else {
                ux2Var.Q();
                int i7 = i6 & (-4128769);
                iyVar3 = iyVar;
                xy6VarR = xy6Var;
                i4 = i7;
                fs4Var3 = fs4Var;
            }
            ux2Var.q();
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = h57.p(Boolean.FALSE);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) objK;
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = ck3.w(ux2Var);
                ux2Var.g0(objK2);
            }
            me1 me1Var = (me1) objK2;
            Object objK3 = ux2Var.K();
            if (objK3 == awVar) {
                objK3 = h57.p("");
                ux2Var.g0(objK3);
            }
            px4 px4Var2 = (px4) objK3;
            Context context = (Context) ux2Var.j(lh.b);
            Object objK4 = ux2Var.K();
            if (objK4 == awVar) {
                objK4 = new px(b2);
                ux2Var.g0(objK4);
            }
            xy6 xy6Var3 = xy6VarR;
            yo1.k(function0, cp6.a(fs4Var3, false, (Function1) objK4), xy6Var3, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(1005704319, new dy(z3, z2, iyVar3, xy6Var3, me1Var, function0, px4Var, px4Var2, context), ux2Var), ux2Var, (i4 >> 9) & 14, 3072, 8184);
            xy6Var2 = xy6Var3;
            iyVar2 = iyVar3;
            fs4Var2 = fs4Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            iyVar2 = iyVar;
            xy6Var2 = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ey(z2, z3, function0, fs4Var2, iyVar2, xy6Var2, i2);
        }
    }

    public static boolean a0(sz3 sz3Var) {
        sz3Var.getClass();
        if (sz3Var instanceof oz3) {
            return sz3Var instanceof y06;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sz3Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, sz3Var.getClass(), sb));
        return false;
    }

    public static final void b(Function0 function0, Function0 function1, fs4 fs4Var, xy6 xy6Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        xy6 xy6Var2;
        xy6 xy6VarR;
        int i3;
        fs4 fs4Var3;
        function0.getClass();
        function1.getClass();
        ux2Var.Y(-1073643704);
        int i4 = i2 | (ux2Var.h(function0) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | 1408;
        if (ux2Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            ux2Var.S();
            if ((i2 & 1) == 0 || ux2Var.x()) {
                xy6VarR = yo1.R(null, ux2Var, 6, 2);
                i3 = i4 & (-7169);
                fs4Var3 = cs4.b;
            } else {
                ux2Var.Q();
                xy6VarR = xy6Var;
                i3 = i4 & (-7169);
                fs4Var3 = fs4Var;
            }
            ux2Var.q();
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ck3.w(ux2Var);
                ux2Var.g0(objK);
            }
            me1 me1Var = (me1) objK;
            Context context = (Context) ux2Var.j(lh.b);
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = new px((byte) 7);
                ux2Var.g0(objK2);
            }
            xy6 xy6Var3 = xy6VarR;
            yo1.k(function0, cp6.a(fs4Var3, false, (Function1) objK2), xy6Var3, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-1241248602, new e70(function1, context, xy6Var3, me1Var, function0), ux2Var), ux2Var, i3 & 14, 3072, 8184);
            xy6Var2 = xy6Var3;
            fs4Var2 = fs4Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6Var2 = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) function0, (Object) function1, fs4Var2, (Object) xy6Var2, i2, (byte) 3);
        }
    }

    public static boolean b0(h58 h58Var) {
        h58Var.getClass();
        if (h58Var instanceof h58) {
            return h58Var.c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(h58Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, h58Var.getClass(), sb));
        return false;
    }

    public static final void c(fs4 fs4Var, ux2 ux2Var, int i2) {
        byte b2;
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1477474178);
        int i3 = i2 | 48;
        if (ux2Var2.N(i3 & 1, (i3 & 17) != 16)) {
            String strZ = m77.z(R.string.settings_biometric_bottomSheet_title, ux2Var2);
            h72 h72Var = un4.a;
            ot7 ot7Var = ((rn4) ux2Var2.j(h72Var)).b.g;
            cs4 cs4Var = cs4.b;
            qs7.b(strZ, androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), "TVTA-settings-biometric-bottomSheet-title"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ot7Var, ux2Var, 0, 0, 131068);
            lv1.k(ka0.F(cs4Var, 0.0f, 16.0f, 0.0f, 24.0f, 5), 0.0f, 0L, ux2Var, 6, 6);
            dg6 dg6VarA = cg6.a(iq8.e, xz2.x, ux2Var, 6);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, cs4Var);
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
            qs7.b(m77.z(R.string.settings_biometric_bottomSheet_description, ux2Var), null, ((rn4) ux2Var.j(h72Var)).a.s, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.k, ux2Var, 0, 0, 130042);
            ux2Var2 = ux2Var;
            b2 = 1;
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(fs4Var2, 24.0f));
        } else {
            b2 = 1;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var2, i2, b2);
        }
    }

    public static void c0(i07 i07Var) {
        i07Var.getClass();
        if (i07Var instanceof g07) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(i07Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, i07Var.getClass(), sb));
    }

    public static final void d(final boolean z2, final boolean z3, final boolean z4, ux2 ux2Var, final int i2) {
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(601505625);
        int i3 = i2 | (ux2Var2.g(z2) ? 32 : 16) | (ux2Var2.g(z3) ? 256 : 128) | (ux2Var2.g(z4) ? 2048 : 1024);
        if (!ux2Var2.N(i3 & 1, (i3 & 1169) != 1168)) {
            ux2Var2.Q();
        } else if ((!z3 || z4) && !z2 && z3) {
            ux2Var2.W(851507465);
            ux2Var2.p(false);
        } else {
            ux2Var2.W(850732899);
            String strZ = m77.z(R.string.attractionGuid_modal_title, ux2Var2);
            h72 h72Var = un4.a;
            ot7 ot7Var = ((rn4) ux2Var2.j(h72Var)).b.g;
            cs4 cs4Var = cs4.b;
            qs7.b(strZ, androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), "TVTA-settings-version-attractionGuidModalTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ot7Var, ux2Var, 48, 0, 131068);
            lv1.k(ka0.F(cs4Var, 0.0f, 16.0f, 0.0f, 16.0f, 5), 0.0f, 0L, ux2Var, 6, 6);
            dg6 dg6VarA = cg6.a(iq8.e, xz2.x, ux2Var, 6);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, cs4Var);
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
            qs7.b(m77.z(R.string.attractionGuid_modal_description, ux2Var), null, ((rn4) ux2Var.j(h72Var)).a.s, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.k, ux2Var, 0, 0, 130042);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var, 28.0f));
            ux2Var2.p(false);
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(i2, z2, z3, z4) { // from class: o.ay
                public final /* synthetic */ boolean m;
                public final /* synthetic */ boolean n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ boolean f372o;

                {
                    this.m = z2;
                    this.n = z3;
                    this.f372o = z4;
                }

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(7);
                    db8.d(this.m, this.n, this.f372o, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    public static void d0(i07 i07Var) {
        i07Var.getClass();
        if (i07Var instanceof g07) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(i07Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, i07Var.getClass(), sb));
    }

    public static final void e(Function0 function0, Function0 function1, ux2 ux2Var, int i2) {
        int i3;
        function0.getClass();
        function1.getClass();
        ux2Var.Y(-1596181919);
        if ((i2 & 6) == 0) {
            i3 = i2 | (ux2Var.h(function0) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.h(function1) ? 32 : 16;
        }
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            uf0.b(function1, au8.O(1100653849, new v4(function0, (byte) 11), ux2Var), null, au8.O(489384791, new v4(function1, (byte) 12), ux2Var), ga0.m, ga0.n, null, 0L, 0L, 0L, 0L, null, ux2Var, ((i3 >> 3) & 14) | 1772592, 0, 16276);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pa((byte) 7, i2, (Object) function0, (Object) function1);
        }
    }

    public static void e0(String str, boolean z2) {
        if (!z2) {
            throw new fb8(str);
        }
    }

    public static final rv f(oz3 oz3Var) {
        e48 e48Var;
        e48 e48Var2;
        oz3Var.getClass();
        if (oz3Var.r0() instanceof um2) {
            rv rvVarF = f(bt1.I(oz3Var));
            rv rvVarF2 = f(bt1.V(oz3Var));
            return new rv(x37.m(bt1.v(bt1.I((oz3) rvVarF.a), bt1.V((oz3) rvVarF2.a)), oz3Var), x37.m(bt1.v(bt1.I((oz3) rvVarF.b), bt1.V((oz3) rvVarF2.b)), oz3Var));
        }
        k48 k48VarO0 = oz3Var.o0();
        boolean z2 = true;
        if (oz3Var.o0() instanceof xl0) {
            k48VarO0.getClass();
            h58 h58VarD = ((xl0) k48VarO0).d();
            oz3 oz3VarB = h58VarD.b();
            oz3VarB.getClass();
            oz3 oz3VarI = p58.i(oz3VarB, oz3Var.p0());
            int iOrdinal = h58VarD.a().ordinal();
            if (iOrdinal == 1) {
                return new rv(oz3VarI, n37.m(oz3Var).o());
            }
            if (iOrdinal == 2) {
                return new rv(p58.i(n37.m(oz3Var).n(), oz3Var.p0()), oz3VarI);
            }
            hk0.s(h58VarD, "Only nontrivial projections should have been captured, not: ");
            return null;
        }
        if (oz3Var.m0().isEmpty() || oz3Var.m0().size() != k48VarO0.getParameters().size()) {
            return new rv(oz3Var, oz3Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listM0 = oz3Var.m0();
        List parameters = k48VarO0.getParameters();
        parameters.getClass();
        for (vd5 vd5Var : lv0.V0(listM0, parameters)) {
            h58 h58Var = (h58) vd5Var.m;
            d58 d58Var = (d58) vd5Var.n;
            d58Var.getClass();
            ub8 ub8VarB = d58Var.B();
            if (ub8VarB == null) {
                m58.a(35);
                throw null;
            }
            if (h58Var == null) {
                m58.a(36);
                throw null;
            }
            m58 m58Var = m58.b;
            int iOrdinal2 = (h58Var.c() ? ub8.q : m58.b(ub8VarB, h58Var.a())).ordinal();
            if (iOrdinal2 == 0) {
                oz3 oz3VarB2 = h58Var.b();
                oz3VarB2.getClass();
                oz3 oz3VarB3 = h58Var.b();
                oz3VarB3.getClass();
                e48Var2 = new e48(d58Var, oz3VarB2, oz3VarB3);
            } else if (iOrdinal2 == 1) {
                oz3 oz3VarB4 = h58Var.b();
                oz3VarB4.getClass();
                g07 g07VarO = bp1.e(d58Var).o();
                g07VarO.getClass();
                e48Var2 = new e48(d58Var, oz3VarB4, g07VarO);
            } else {
                if (iOrdinal2 != 2) {
                    gk0.s();
                    return null;
                }
                g07 g07VarN = bp1.e(d58Var).n();
                oz3 oz3VarB5 = h58Var.b();
                oz3VarB5.getClass();
                e48Var2 = new e48(d58Var, g07VarN, oz3VarB5);
            }
            if (h58Var.c()) {
                arrayList.add(e48Var2);
                arrayList2.add(e48Var2);
            } else {
                rv rvVarF3 = f(e48Var2.b);
                oz3 oz3Var2 = (oz3) rvVarF3.a;
                oz3 oz3Var3 = (oz3) rvVarF3.b;
                rv rvVarF4 = f(e48Var2.c);
                oz3 oz3Var4 = (oz3) rvVarF4.a;
                oz3 oz3Var5 = (oz3) rvVarF4.b;
                d58 d58Var2 = e48Var2.a;
                e48 e48Var3 = new e48(d58Var2, oz3Var3, oz3Var4);
                e48 e48Var4 = new e48(d58Var2, oz3Var2, oz3Var5);
                arrayList.add(e48Var3);
                arrayList2.add(e48Var4);
            }
        }
        if (arrayList.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            e48Var = (e48) it.next();
            e48Var.getClass();
        } while (qz3.a.b(e48Var.b, e48Var.c));
        return new rv(z2 ? n37.m(oz3Var).n() : y0(oz3Var, arrayList), y0(oz3Var, arrayList2));
    }

    public static void f0(boolean z2) {
        if (!z2) {
            throw new fb8("Must be true");
        }
    }

    public static boolean g(l48 l48Var, l48 l48Var2) {
        l48Var.getClass();
        l48Var2.getClass();
        if (!(l48Var instanceof k48)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(l48Var);
            sb.append(", ");
            gk0.h(ua5.o(w86.a, l48Var.getClass(), sb));
            return false;
        }
        if (l48Var2 instanceof k48) {
            return l48Var.equals(l48Var2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(l48Var2);
        sb2.append(", ");
        gk0.h(ua5.o(w86.a, l48Var2.getClass(), sb2));
        return false;
    }

    public static final fs4 g0(fs4 fs4Var, m34 m34Var) {
        return fs4Var.f(new m22(m34Var));
    }

    public static int h(sz3 sz3Var) {
        sz3Var.getClass();
        if (sz3Var instanceof oz3) {
            return ((oz3) sz3Var).m0().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sz3Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, sz3Var.getClass(), sb));
        return 0;
    }

    public static g07 h0(um2 um2Var) {
        if (um2Var instanceof um2) {
            return um2Var.n;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(um2Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, um2Var.getClass(), sb));
        return null;
    }

    public static f48 i(i07 i07Var) {
        i07Var.getClass();
        if (i07Var instanceof g07) {
            return (f48) i07Var;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(i07Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, i07Var.getClass(), sb));
        return null;
    }

    public static m98 i0(am0 am0Var) {
        if (am0Var instanceof h35) {
            return ((h35) am0Var).p;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(am0Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, am0Var.getClass(), sb));
        return null;
    }

    public static am0 j(xs0 xs0Var, i07 i07Var) {
        i07Var.getClass();
        if (i07Var instanceof g07) {
            if (i07Var instanceof k07) {
                return xs0Var.C(((k07) i07Var).n);
            }
            if (i07Var instanceof h35) {
                return (h35) i07Var;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(i07Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, i07Var.getClass(), sb));
        return null;
    }

    public static m98 j0(sz3 sz3Var) {
        if (sz3Var instanceof m98) {
            return x37.q((m98) sz3Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sz3Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, sz3Var.getClass(), sb));
        return null;
    }

    public static lm1 k(i07 i07Var) {
        i07Var.getClass();
        if (i07Var instanceof g07) {
            if (i07Var instanceof lm1) {
                return (lm1) i07Var;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(i07Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, i07Var.getClass(), sb));
        return null;
    }

    public static int k0(int[] iArr, int i2) {
        for (int i3 : iArr) {
            i2 = Math.max(i2, i3);
        }
        return i2;
    }

    public static um2 l(sz3 sz3Var) {
        sz3Var.getClass();
        if (sz3Var instanceof oz3) {
            m98 m98VarR0 = ((oz3) sz3Var).r0();
            if (m98VarR0 instanceof um2) {
                return (um2) m98VarR0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sz3Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, sz3Var.getClass(), sb));
        return null;
    }

    public static void l0(String str) {
        if (str == null || str.length() == 0) {
            throw new fb8("String must not be empty");
        }
    }

    public static g07 m(sz3 sz3Var) {
        sz3Var.getClass();
        if (sz3Var instanceof oz3) {
            m98 m98VarR0 = ((oz3) sz3Var).r0();
            if (m98VarR0 instanceof g07) {
                return (g07) m98VarR0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sz3Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, sz3Var.getClass(), sb));
        return null;
    }

    public static void m0(String str, String str2) {
        if (str.length() == 0) {
            throw new fb8(str2);
        }
    }

    public static w87 n(sz3 sz3Var) {
        sz3Var.getClass();
        if (sz3Var instanceof oz3) {
            return new w87((oz3) sz3Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sz3Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, sz3Var.getClass(), sb));
        return null;
    }

    public static void n0(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new fb8(fx3.g("The '", str2, "' parameter must not be empty."));
        }
    }

    public static g07 o(i07 i07Var) {
        List listM0;
        ArrayList arrayList;
        tz3 tz3Var;
        kp1 kp1Var = null;
        if (!(i07Var instanceof g07)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(i07Var);
            sb.append(", ");
            gk0.h(ua5.o(w86.a, i07Var.getClass(), sb));
            return null;
        }
        g07 g07Var = (g07) i07Var;
        if (g07Var.m0().size() == g07Var.o0().getParameters().size() && ((listM0 = g07Var.m0()) == null || !listM0.isEmpty())) {
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                ub8 ub8VarA = ((h58) it.next()).a();
                ub8 ub8Var = ub8.f2197o;
                if (ub8VarA != ub8Var) {
                    List parameters = g07Var.o0().getParameters();
                    parameters.getClass();
                    ArrayList<vd5> arrayListV0 = lv0.V0(listM0, parameters);
                    arrayList = new ArrayList(mv0.Z(arrayListV0, 10));
                    for (vd5 vd5Var : arrayListV0) {
                        h58 w87Var = (h58) vd5Var.m;
                        d58 d58Var = (d58) vd5Var.n;
                        if (w87Var.a() != ub8Var) {
                            m98 m98VarR0 = (w87Var.c() || w87Var.a() != ub8.p) ? null : w87Var.b().r0();
                            d58Var.getClass();
                            w87Var = new w87(new h35(ul0.m, new i35(w87Var, kp1Var, d58Var, 6), m98VarR0, (g48) null, false, 56));
                        }
                        arrayList.add(w87Var);
                    }
                    m58 m58Var = new m58(m48.b.e(g07Var.o0(), arrayList));
                    int size = listM0.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        h58 h58Var = (h58) listM0.get(i2);
                        h58 h58Var2 = (h58) arrayList.get(i2);
                        if (h58Var.a() != ub8Var) {
                            List upperBounds = ((d58) g07Var.o0().getParameters().get(i2)).getUpperBounds();
                            upperBounds.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (true) {
                                boolean zHasNext = it2.hasNext();
                                tz3Var = tz3.a;
                                if (!zHasNext) {
                                    break;
                                }
                                arrayList2.add(tz3Var.a(m58Var.f((oz3) it2.next(), ub8Var).r0()));
                            }
                            if (!h58Var.c() && h58Var.a() == ub8.q) {
                                arrayList2.add(tz3Var.a(h58Var.b().r0()));
                            }
                            oz3 oz3VarB = h58Var2.b();
                            oz3VarB.getClass();
                            i35 i35Var = ((h35) oz3VarB).f947o;
                            i35Var.getClass();
                            i35Var.b = new kp1(arrayList2, (byte) 2);
                        }
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return bt1.P(arrayList, g07Var.n0(), g07Var.o0(), g07Var.p0());
        }
        return null;
    }

    public static void o0(Object obj) {
        if (obj == null) {
            throw new fb8("Object must not be null");
        }
    }

    public static ul0 p(am0 am0Var) {
        if (am0Var instanceof h35) {
            return ((h35) am0Var).n;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(am0Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, am0Var.getClass(), sb));
        return null;
    }

    public static void p0(Object obj, String str) {
        if (obj == null) {
            throw new fb8(fx3.g("The parameter '", str, "' must not be null."));
        }
    }

    public static int q(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void q0(PackageInfo packageInfo, File file) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(io.sentry.config.a.g(new FileOutputStream(file2), file2));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static final boolean r(v56 v56Var, float f2, float f3) {
        float f4 = v56Var.a;
        if (f2 > v56Var.c || f4 > f2) {
            return false;
        }
        return f3 <= v56Var.d && v56Var.b <= f3;
    }

    public static final fs4 r0(fs4 fs4Var, Function1 function1) {
        return fs4Var.f(new y75(function1));
    }

    public static m98 s(xs0 xs0Var, i07 i07Var, i07 i07Var2) {
        i07Var.getClass();
        i07Var2.getClass();
        if (!(i07Var instanceof g07)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(xs0Var);
            sb.append(", ");
            gk0.h(ua5.o(w86.a, xs0Var.getClass(), sb));
            return null;
        }
        if (i07Var2 instanceof g07) {
            return bt1.v((g07) i07Var, (g07) i07Var2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(xs0Var);
        sb2.append(", ");
        gk0.h(ua5.o(w86.a, xs0Var.getClass(), sb2));
        return null;
    }

    public static int s0(l48 l48Var) {
        l48Var.getClass();
        if (l48Var instanceof k48) {
            return ((k48) l48Var).getParameters().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(l48Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, l48Var.getClass(), sb));
        return 0;
    }

    public static fs4 t(fs4 fs4Var, Function1 function1) {
        return fs4Var.f(new rm1(function1));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void t0(Context context, String str) {
        synchronized (a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    io.sentry.android.core.v0.l("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (FileNotFoundException unused3) {
                io.sentry.android.core.v0.j("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    public static final kw4 u(ip6 ip6Var, Function1 function1) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            fp6 fp6VarA = ip6Var.a();
            LayoutNode layoutNode = fp6VarA.c;
            if (layoutNode.X() && layoutNode.W()) {
                v56 v56VarG = fp6VarA.g();
                kw4 kw4Var = new kw4(48);
                g95 g95Var = new g95((byte) 20);
                g95Var.X(vs1.T(v56VarG));
                x(function1, kw4Var, new g95((byte) 20), g95Var, fp6VarA, fp6VarA);
                return kw4Var;
            }
            kw4 kw4Var2 = uk3.a;
            kw4Var2.getClass();
            return kw4Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static Collection u0(xs0 xs0Var, i07 i07Var) {
        i07Var.getClass();
        k48 k48VarB0 = xs0Var.b0(i07Var);
        if (k48VarB0 instanceof gl3) {
            return ((gl3) k48VarB0).a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(i07Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, i07Var.getClass(), sb));
        return null;
    }

    public static final void v(Function1 function1, kw4 kw4Var, g95 g95Var, g95 g95Var2, fp6 fp6Var, fp6 fp6Var2) {
        g95 g95Var3 = g95Var;
        Region region = (Region) g95Var3.m;
        g95 g95Var4 = g95Var2;
        Region region2 = (Region) g95Var4.m;
        LayoutNode layoutNode = fp6Var2.c;
        LayoutNode layoutNode2 = fp6Var2.c;
        if (!layoutNode.X() || !layoutNode2.W() || region2.isEmpty()) {
            if (fp6Var2.n()) {
                w(kw4Var, fp6Var, fp6Var2);
                return;
            }
            return;
        }
        v56 v56VarM = fp6Var2.m();
        if (v56VarM.f()) {
            um1 um1VarF = fp6Var2.f();
            if (um1VarF == null) {
                ti3 ti3Var = (ti3) layoutNode2.S.d;
                v56VarM = vt1.s(ti3Var).b(ti3Var, false);
            } else {
                es4 es4Var = ((es4) um1VarF).m;
                Object objG = fp6Var2.d.m.g(zo6.b);
                if (objG == null) {
                    objG = null;
                }
                v56VarM = us1.x(es4Var, objG != null, false);
            }
        }
        zk3 zk3VarT = vs1.T(v56VarM);
        g95Var3.X(zk3VarT);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i2 = fp6Var2.f;
            if (i2 == fp6Var.f) {
                i2 = -1;
            }
            Rect bounds = region.getBounds();
            kw4Var.i(i2, new hp6(fp6Var2, new zk3(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            List listI = fp6Var2.i((4 & 1) != 0 ? !fp6Var2.b : false, (4 & 2) == 0);
            int size = listI.size() - 1;
            while (-1 < size) {
                if (!((Boolean) function1.invoke(listI.get(size))).booleanValue()) {
                    v(function1, kw4Var, g95Var3, g95Var4, fp6Var, (fp6) listI.get(size));
                }
                size--;
                g95Var3 = g95Var;
                g95Var4 = g95Var2;
            }
            if (R(fp6Var2)) {
                region2.op(zk3VarT.a, zk3VarT.b, zk3VarT.c, zk3VarT.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static h58 v0(xl0 xl0Var) {
        xl0Var.getClass();
        if (xl0Var instanceof i35) {
            return ((i35) xl0Var).a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(xl0Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, xl0Var.getClass(), sb));
        return null;
    }

    public static final void w(kw4 kw4Var, fp6 fp6Var, fp6 fp6Var2) {
        LayoutNode layoutNode;
        fp6 fp6VarL = fp6Var2.l();
        v56 v56VarG = (fp6VarL == null || (layoutNode = fp6VarL.c) == null || !layoutNode.X()) ? C : fp6VarL.g();
        int i2 = fp6Var2.f;
        if (i2 == fp6Var.f) {
            i2 = -1;
        }
        kw4Var.i(i2, new hp6(fp6Var2, vs1.T(v56VarG)));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
      0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String w0(Context context) {
        String attributeValue;
        synchronized (a) {
            attributeValue = "";
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        try {
                            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                            int depth = xmlPullParserNewPullParser.getDepth();
                            while (true) {
                                int next = xmlPullParserNewPullParser.next();
                                if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                    if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException | XmlPullParserException unused3) {
                        io.sentry.android.core.v0.j("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x015b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0165  */
    /* JADX WARN: Code duplicated, block: B:82:0x0175  */
    /* JADX WARN: Code duplicated, block: B:83:0x017a  */
    public static final void x(Function1 function1, kw4 kw4Var, g95 g95Var, g95 g95Var2, fp6 fp6Var, fp6 fp6Var2) {
        int size;
        boolean z2;
        v56 v56VarX;
        Function1 function2 = function1;
        kw4 kw4Var2 = kw4Var;
        int i2 = fp6Var.f;
        Region region = (Region) g95Var.m;
        g95 g95Var3 = g95Var2;
        Region region2 = (Region) g95Var3.m;
        LayoutNode layoutNode = fp6Var2.c;
        ap6 ap6Var = fp6Var2.d;
        LayoutNode layoutNode2 = fp6Var2.c;
        int i3 = fp6Var2.f;
        boolean z3 = (layoutNode.X() && layoutNode2.W()) ? false : true;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z3 || fp6Var2.n()) {
                zk3 zk3VarT = vs1.T(fp6Var2.m());
                g95Var.X(zk3VarT);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (fp6Var2.n()) {
                        w(kw4Var2, fp6Var, fp6Var2);
                        return;
                    } else {
                        if (i3 == -1) {
                            Rect bounds = region.getBounds();
                            kw4Var2.i(i3, new hp6(fp6Var2, new zk3(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                kw4Var2.i(i3, new hp6(fp6Var2, new zk3(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listI = fp6Var2.i((4 & 1) != 0 ? !fp6Var2.b : false, (4 & 2) == 0);
                if (ap6Var.f346o) {
                    fp6 fp6VarL = fp6Var2.l();
                    while (true) {
                        if (fp6VarL == null) {
                            fp6VarL = null;
                            break;
                        }
                        jx4 jx4Var = fp6VarL.d.m;
                        if (jx4Var.c(kp6.w) || jx4Var.c(kp6.v)) {
                            break;
                        } else {
                            fp6VarL = fp6VarL.l();
                        }
                    }
                    if (fp6VarL == null) {
                        z2 = false;
                    } else {
                        e45 e45VarD = fp6Var2.d();
                        if (e45VarD == null) {
                            e45VarD = null;
                        } else {
                            if (!e45VarD.a1().z) {
                                e45VarD = null;
                            }
                            if (e45VarD == null) {
                                e45VarD = null;
                            }
                        }
                        e45 e45VarD2 = fp6VarL.d();
                        if (e45VarD2 == null) {
                            e45VarD2 = null;
                        } else {
                            if (!e45VarD2.a1().z) {
                                e45VarD2 = null;
                            }
                            if (e45VarD2 == null) {
                                e45VarD2 = null;
                            }
                        }
                        if (e45VarD == null || e45VarD2 == null) {
                            z2 = false;
                        } else {
                            v56 v56VarB = e45VarD2.b(e45VarD, false);
                            z2 = !v56VarB.equals(v56VarB.e(qs1.v(0L, xs1.a0(e45VarD2.f1179o))));
                        }
                    }
                    if (z2) {
                        g95 g95Var4 = new g95((byte) 20);
                        um1 um1VarF = fp6Var2.f();
                        if (um1VarF == null) {
                            ti3 ti3Var = (ti3) layoutNode2.S.d;
                            v56VarX = vt1.s(ti3Var).b(ti3Var, false);
                        } else {
                            es4 es4Var = ((es4) um1VarF).m;
                            Object objG = ap6Var.m.g(zo6.b);
                            v56VarX = us1.x(es4Var, (objG == null ? null : objG) != null, false);
                        }
                        g95Var4.X(vs1.T(v56VarX));
                        int size2 = listI.size() - 1;
                        while (-1 < size2) {
                            if (!((Boolean) function2.invoke(listI.get(size2))).booleanValue()) {
                                v(function2, kw4Var2, new g95((byte) 20), g95Var4, fp6Var, (fp6) listI.get(size2));
                            }
                            size2--;
                            kw4Var2 = kw4Var;
                        }
                    } else {
                        size = listI.size() - 1;
                        while (-1 < size) {
                            if (((Boolean) function2.invoke(listI.get(size))).booleanValue()) {
                                x(function2, kw4Var, g95Var, g95Var3, fp6Var, (fp6) listI.get(size));
                            }
                            size--;
                            function2 = function1;
                            g95Var3 = g95Var2;
                        }
                    }
                } else {
                    size = listI.size() - 1;
                    while (-1 < size) {
                        if (((Boolean) function2.invoke(listI.get(size))).booleanValue()) {
                            x(function2, kw4Var, g95Var, g95Var3, fp6Var, (fp6) listI.get(size));
                        }
                        size--;
                        function2 = function1;
                        g95Var3 = g95Var2;
                    }
                }
                if (R(fp6Var2)) {
                    region2.op(zk3VarT.a, zk3VarT.b, zk3VarT.c, zk3VarT.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final qk4 x0(e8 e8Var, Function1 function1, ux2 ux2Var) {
        Object l8Var;
        Object obj;
        h57.t(e8Var, ux2Var);
        Object objT = h57.t(function1, ux2Var);
        Object[] objArr = new Object[0];
        Object objK = ux2Var.K();
        Object obj2 = e01.a;
        if (objK == obj2) {
            objK = new e5((byte) 3);
            ux2Var.g0(objK);
        }
        Object obj3 = (String) zu1.L(objArr, (Function0) objK, ux2Var, 48);
        n8 n8Var = (n8) ux2Var.j(uc4.a);
        if (n8Var == null) {
            ux2Var.W(1213380307);
            Object baseContext = (Context) ux2Var.j(lh.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof n8) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            n8Var = (n8) baseContext;
        } else {
            ux2Var.W(1213379439);
        }
        ux2Var.p(false);
        if (n8Var == null) {
            hk0.l("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        Object objG = n8Var.g();
        Object objK2 = ux2Var.K();
        if (objK2 == obj2) {
            objK2 = new g8();
            ux2Var.g0(objK2);
        }
        g8 g8Var = (g8) objK2;
        Object objK3 = ux2Var.K();
        if (objK3 == obj2) {
            objK3 = new qk4(g8Var);
            ux2Var.g0(objK3);
        }
        qk4 qk4Var = (qk4) objK3;
        boolean zH = ux2Var.h(g8Var) | ux2Var.h(objG) | ux2Var.f(obj3) | ux2Var.h(e8Var) | ux2Var.f(objT);
        Object objK4 = ux2Var.K();
        if (zH || objK4 == obj2) {
            obj = e8Var;
            l8Var = new l8(g8Var, objG, obj3, obj, objT, (byte) 0);
            ux2Var.g0(l8Var);
        } else {
            l8Var = objK4;
            obj = e8Var;
        }
        Function1 function2 = (Function1) l8Var;
        boolean zF = ux2Var.f(objG) | ux2Var.f(obj3) | ux2Var.f(obj);
        Object objK5 = ux2Var.K();
        if (zF || objK5 == obj2) {
            objK5 = new p22(function2);
            ux2Var.g0(objK5);
        }
        return qk4Var;
    }

    public static h58 y(sz3 sz3Var, int i2) {
        sz3Var.getClass();
        if (sz3Var instanceof oz3) {
            return (h58) ((oz3) sz3Var).m0().get(i2);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sz3Var);
        sb.append(", ");
        gk0.h(ua5.o(w86.a, sz3Var.getClass(), sb));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    public static final oz3 y0(oz3 oz3Var, ArrayList arrayList) {
        w87 w87Var;
        oz3Var.m0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e48 e48Var = (e48) it.next();
            e48Var.getClass();
            oz3 oz3Var2 = e48Var.c;
            oz3 oz3Var3 = e48Var.b;
            d58 d58Var = e48Var.a;
            qz3.a.b(oz3Var3, oz3Var2);
            if (im3.n(oz3Var3, oz3Var2)) {
                w87Var = new w87(oz3Var3);
            } else {
                ub8 ub8VarB = d58Var.B();
                ub8 ub8Var = ub8.p;
                if (ub8VarB == ub8Var) {
                    w87Var = new w87(oz3Var3);
                } else {
                    boolean zE = wy3.E(oz3Var3);
                    ub8 ub8Var2 = ub8.q;
                    ub8 ub8Var3 = ub8.f2197o;
                    if (zE && d58Var.B() != ub8Var) {
                        if (ub8Var2 == d58Var.B()) {
                            ub8Var2 = ub8Var3;
                        }
                        w87Var = new w87(oz3Var2, ub8Var2);
                    } else {
                        if (oz3Var2 == null) {
                            wy3.a(141);
                            throw null;
                        }
                        if (wy3.x(oz3Var2) && oz3Var2.p0()) {
                            if (ub8Var == d58Var.B()) {
                                ub8Var = ub8Var3;
                            }
                            w87Var = new w87(oz3Var3, ub8Var);
                        } else {
                            if (ub8Var2 == d58Var.B()) {
                                ub8Var2 = ub8Var3;
                            }
                            w87Var = new w87(oz3Var2, ub8Var2);
                        }
                    }
                }
            }
            arrayList2.add(w87Var);
        }
        return m77.x(oz3Var, arrayList2, null, 6);
    }

    public static final wt3 z(fq6 fq6Var) {
        fq6Var.getClass();
        if (fq6Var instanceof yb1) {
            return ((yb1) fq6Var).b;
        }
        if (fq6Var instanceof gq6) {
            return z(((gq6) fq6Var).a);
        }
        return null;
    }

    public static m47 z0() {
        return new m47(0);
    }
}
