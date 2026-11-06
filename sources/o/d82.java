package o;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import androidx.work.WorkerParameters;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public class d82 implements cc, pa0, vc1, ce1, rb8, vm2, lg1 {
    public static Context M;
    public static final an4 N;
    public static final yq4 O;
    public static final /* synthetic */ int Q = 0;
    public final /* synthetic */ byte m;
    public static final d82 n = new d82(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d82 f595o = new d82(2);
    public static final d82 p = new d82(3);
    public static final d82 q = new d82(4);
    public static final /* synthetic */ d82 r = new d82(5);
    public static final ez0 s = new ez0(15);
    public static final iz0 t = new iz0(19);
    public static final iz0 u = new iz0(20);
    public static final iz0 v = new iz0(21);
    public static final iz0 w = new iz0(22);
    public static final px x = new px(27);
    public static final /* synthetic */ d82 y = new d82(6);
    public static final d82 z = new d82(7);
    public static final d82 A = new d82(8);
    public static final d82 B = new d82(9);
    public static final d82 C = new d82(10);
    public static final d82 D = new d82(12);
    public static final d82 E = new d82(13);
    public static final d82 F = new d82(14);
    public static final d82 G = new d82(15);
    public static final /* synthetic */ d82 H = new d82(16);
    public static final hr2 I = new hr2("PackageViewDescriptorFactory", 11);
    public static final d82 J = new d82(17);
    public static final d82 K = new d82(20);
    public static final d82 L = new d82(21);
    public static final d82 P = new d82(25);

    static {
        byte b = 20;
        N = new an4(b);
        O = new yq4(b);
    }

    public /* synthetic */ d82(byte b) {
        this.m = b;
    }

    public static void A(Object obj, q78 q78Var) {
        py2 py2VarA;
        Map mapA = ((gr5) obj).a();
        ir5 ir5VarN = kr5.n();
        for (Map.Entry entry : mapA.entrySet()) {
            er5 er5Var = (er5) entry.getKey();
            Object value = entry.getValue();
            String str = er5Var.a;
            if (value instanceof Boolean) {
                nr5 nr5VarV = or5.v();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                nr5VarV.c();
                ((or5) nr5VarV.n).w(zBooleanValue);
                py2VarA = nr5VarV.a();
            } else if (value instanceof Float) {
                nr5 nr5VarV2 = or5.v();
                float fFloatValue = ((Number) value).floatValue();
                nr5VarV2.c();
                ((or5) nr5VarV2.n).z(fFloatValue);
                py2VarA = nr5VarV2.a();
            } else if (value instanceof Double) {
                nr5 nr5VarV3 = or5.v();
                double dDoubleValue = ((Number) value).doubleValue();
                nr5VarV3.c();
                ((or5) nr5VarV3.n).y(dDoubleValue);
                py2VarA = nr5VarV3.a();
            } else if (value instanceof Integer) {
                nr5 nr5VarV4 = or5.v();
                int iIntValue = ((Number) value).intValue();
                nr5VarV4.c();
                ((or5) nr5VarV4.n).A(iIntValue);
                py2VarA = nr5VarV4.a();
            } else if (value instanceof Long) {
                nr5 nr5VarV5 = or5.v();
                long jLongValue = ((Number) value).longValue();
                nr5VarV5.c();
                ((or5) nr5VarV5.n).B(jLongValue);
                py2VarA = nr5VarV5.a();
            } else if (value instanceof String) {
                nr5 nr5VarV6 = or5.v();
                nr5VarV6.c();
                ((or5) nr5VarV6.n).C((String) value);
                py2VarA = nr5VarV6.a();
            } else if (value instanceof Set) {
                nr5 nr5VarV7 = or5.v();
                lr5 lr5VarO = mr5.o();
                lr5VarO.c();
                ((mr5) lr5VarO.n).l((Set) value);
                nr5VarV7.c();
                ((or5) nr5VarV7.n).D((mr5) lr5VarO.a());
                py2VarA = nr5VarV7.a();
            } else {
                if (!(value instanceof byte[])) {
                    hk0.l("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return;
                }
                nr5 nr5VarV8 = or5.v();
                byte[] bArr = (byte[]) value;
                wh0 wh0VarC = wh0.c(bArr, 0, bArr.length);
                nr5VarV8.c();
                ((or5) nr5VarV8.n).x(wh0VarC);
                py2VarA = nr5VarV8.a();
            }
            ir5VarN.getClass();
            str.getClass();
            ir5VarN.c();
            ((kr5) ir5VarN.n).m().put(str, (or5) py2VarA);
        }
        kr5 kr5Var = (kr5) ir5VarN.a();
        int iA = kr5Var.a(null);
        Logger logger = bv0.f;
        if (iA > 4096) {
            iA = 4096;
        }
        bv0 bv0Var = new bv0(q78Var, iA);
        kr5Var.b(bv0Var);
        if (bv0Var.d > 0) {
            bv0Var.k();
        }
    }

    public static Notification h(RemoteControlApplication remoteControlApplication, String str, String str2, String str3, int i, Intent intent, int i2, xk7 xk7Var) {
        remoteControlApplication.getClass();
        return i(remoteControlApplication, str, str2, str3, i, false, false, intent, i2, xk7Var, false, false);
    }

    public static Notification i(Context context, String str, String str2, String str3, int i, boolean z2, boolean z3, Intent intent, int i2, xk7 xk7Var, boolean z4, boolean z5) {
        Notification notificationB = m(context, str, str2, str3, i, z2, z3, intent, i2, xk7Var, z4, z5).b();
        notificationB.getClass();
        return notificationB;
    }

    public static String[] j(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static pd3 l(zv0 zv0Var, long j) {
        pd3 pd3Var = zv0Var.c0;
        if (pd3Var != null) {
            return pd3Var;
        }
        long j2 = rv0.g;
        pd3 pd3Var2 = new pd3(j2, j, j2, rv0.b(u47.a, j));
        zv0Var.c0 = pd3Var2;
        return pd3Var2;
    }

    public static o55 m(Context context, String str, String str2, String str3, int i, boolean z2, boolean z3, Intent intent, int i2, xk7 xk7Var, boolean z4, boolean z5) {
        int i3 = Build.VERSION.SDK_INT;
        PendingIntent activity = PendingIntent.getActivity(context, i2, intent, i3 >= 31 ? 335544320 : 268435456);
        long jCurrentTimeMillis = System.currentTimeMillis();
        o55 o55Var = new o55(context, xk7Var.m);
        Notification notification = o55Var.v;
        notification.icon = i;
        o55Var.h(str3);
        notification.when = jCurrentTimeMillis;
        if (str2 != null) {
            o55Var.f = o55.c(str2);
        }
        o55Var.e = o55.c(str);
        o55Var.g = activity;
        o55Var.m = true;
        o55Var.d(2, z3);
        o55Var.j = 2;
        if (z5) {
            notification.defaults = 7;
            notification.flags |= 1;
        }
        if (z4) {
            o55Var.p = -1;
        } else if (i3 >= 35) {
            o55Var.p = 1;
        }
        if (z2) {
            n55 n55Var = new n55();
            n55Var.b = o55.c(str);
            n55Var.c = o55.c(str2);
            o55Var.g(n55Var);
        }
        return o55Var;
    }

    public static Intent n(RemoteControlApplication remoteControlApplication) {
        Intent launchIntentForPackage = remoteControlApplication.getPackageManager().getLaunchIntentForPackage(remoteControlApplication.getPackageName());
        launchIntentForPackage.getClass();
        launchIntentForPackage.addFlags(805306368);
        return launchIntentForPackage;
    }

    public static pd3 o(ux2 ux2Var) {
        long j = ((rv0) ux2Var.j(wa1.a)).a;
        pd3 pd3VarL = l(((rn4) ux2Var.j(un4.a)).a, j);
        return z68.a(pd3VarL.b, j) ? pd3VarL : pd3.b(pd3VarL, 0L, j, rv0.b(u47.a, j), 5);
    }

    public static LinkedHashSet p(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet r(String str, String... strArr) {
        return p("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet s(String str, String... strArr) {
        return p("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static void t(Context context, int i) {
        if (context == null) {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            return;
        }
        String string = context.getString(i);
        string.getClass();
        u(context, string);
    }

    public static void u(Context context, String str) {
        if (context != null) {
            fx3.r(str, 1, context, bu7.MAIN);
        } else {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
        }
    }

    public static fx4 v(FileInputStream fileInputStream) throws te1 {
        byte[] bArr;
        fileInputStream.getClass();
        try {
            kr5 kr5VarO = kr5.o(fileInputStream);
            fx4 fx4Var = new fx4(false);
            fr5[] fr5VarArr = (fr5[]) Arrays.copyOf(new fr5[0], 0);
            fx4Var.b();
            if (fr5VarArr.length > 0) {
                fr5 fr5Var = fr5VarArr[0];
                throw null;
            }
            Map mapL = kr5VarO.l();
            mapL.getClass();
            for (Map.Entry entry : mapL.entrySet()) {
                String str = (String) entry.getKey();
                or5 or5Var = (or5) entry.getValue();
                str.getClass();
                or5Var.getClass();
                int iU = or5Var.u();
                switch (iU == 0 ? -1 : hr5.a[ua5.B(iU)]) {
                    case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                        throw new te1("Value case is null.", null);
                    case 0:
                    default:
                        gk0.s();
                        return null;
                    case 1:
                        fx4Var.d(new er5(str), Boolean.valueOf(or5Var.l()));
                        break;
                    case 2:
                        fx4Var.d(new er5(str), Float.valueOf(or5Var.p()));
                        break;
                    case 3:
                        fx4Var.d(new er5(str), Double.valueOf(or5Var.o()));
                        break;
                    case 4:
                        fx4Var.d(new er5(str), Integer.valueOf(or5Var.q()));
                        break;
                    case 5:
                        fx4Var.d(new er5(str), Long.valueOf(or5Var.r()));
                        break;
                    case 6:
                        er5 er5Var = new er5(str);
                        String strS = or5Var.s();
                        strS.getClass();
                        fx4Var.d(er5Var, strS);
                        break;
                    case 7:
                        er5 er5Var2 = new er5(str);
                        rl3 rl3VarN = or5Var.t().n();
                        rl3VarN.getClass();
                        fx4Var.d(er5Var2, lv0.T0(rl3VarN));
                        break;
                    case 8:
                        er5 er5Var3 = new er5(str);
                        wh0 wh0VarM = or5Var.m();
                        int size = wh0VarM.size();
                        if (size == 0) {
                            bArr = ul3.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            wh0VarM.d(bArr2, size);
                            bArr = bArr2;
                        }
                        bArr.getClass();
                        fx4Var.d(er5Var3, bArr);
                        break;
                    case ep1.b /* 9 */:
                        throw new te1("Value not set.", null);
                }
            }
            return new fx4(new LinkedHashMap(fx4Var.a()), true);
        } catch (pm3 e) {
            throw new te1("Unable to parse preferences proto.", e);
        }
    }

    public static void x(RemoteControlApplication remoteControlApplication, Notification notification, int i) {
        remoteControlApplication.getClass();
        NotificationManager notificationManager = (NotificationManager) remoteControlApplication.getSystemService("notification");
        if (notificationManager == null) {
            ye4.c("TVNotificationManager", "showNotification: NotificationManager is NULL");
            return;
        }
        if (new j93(remoteControlApplication).W()) {
            Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(remoteControlApplication, notification);
            builderRecoverBuilder.setCategory("recommendation");
            builderRecoverBuilder.setLargeIcon(BitmapFactory.decodeResource(remoteControlApplication.getResources(), R.drawable.tv_icon_recommendation));
            builderRecoverBuilder.setColor(remoteControlApplication.getColor(R.color.tv_colorRecommendation));
        }
        notificationManager.notify(null, i, notification);
    }

    public static long y() {
        float f = ka0.w;
        return nv1.a(ka0.x + f + f, 40.0f);
    }

    public static ng6 z(bo3 bo3Var) {
        bo3Var.getClass();
        return new ng6((e86) bo3Var);
    }

    @Override // o.cc
    public Collection a(ns4 ns4Var) {
        ns4Var.getClass();
        return ea2.m;
    }

    @Override // o.cc
    public Collection b(ns4 ns4Var) {
        return ea2.m;
    }

    @Override // o.cc
    public Collection c(sy4 sy4Var, ns4 ns4Var) {
        ns4Var.getClass();
        return ea2.m;
    }

    @Override // o.lg1
    public Iterable d(Object obj) {
        fw3[] fw3VarArr = bs3.t;
        return ((zi0) obj).a().j();
    }

    @Override // o.cc
    public Collection e(ns4 ns4Var) {
        return ea2.m;
    }

    @Override // o.vm2
    public oz3 f(aw5 aw5Var, String str, g07 g07Var, g07 g07Var2) {
        aw5Var.getClass();
        str.getClass();
        g07Var.getClass();
        g07Var2.getClass();
        if (str.equals("kotlin.jvm.PlatformType")) {
            return aw5Var.l(jt3.g) ? new y06(g07Var, g07Var2) : bt1.v(g07Var, g07Var2);
        }
        return hd2.c(gd2.y, str, g07Var.toString(), g07Var2.toString());
    }

    @Override // o.rb8
    public Object g(kr3 kr3Var, float f) {
        switch (this.m) {
            case ep1.c /* 10 */:
                return Float.valueOf(qr3.d(kr3Var) * f);
            case 17:
                return qr3.b(kr3Var, f);
            default:
                boolean z2 = kr3Var.q() == 1;
                if (z2) {
                    kr3Var.D0();
                }
                float fNextDouble = (float) kr3Var.nextDouble();
                float fNextDouble2 = (float) kr3Var.nextDouble();
                while (kr3Var.hasNext()) {
                    kr3Var.v();
                }
                if (z2) {
                    kr3Var.A0();
                }
                return new ri6((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
        }
    }

    public nc4 k(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(nc4.class);
            clsAsSubclass.getClass();
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                objNewInstance.getClass();
                nc4 nc4Var = (nc4) objNewInstance;
                if (!nc4Var.d) {
                    return nc4Var;
                }
                hk0.l(fx3.h("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
                return null;
            } catch (Throwable th) {
                we4.f().e(dn8.a, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            we4.f().e(dn8.a, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }

    @Override // o.pa0
    public Rect q(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
                return rect;
            }
            int i2 = rect.right + dimensionPixelSize;
            if (i2 == point.x) {
                rect.right = i2;
            }
        }
        return rect;
    }

    @Override // o.vc1
    public Object w(Object obj) {
        switch (this.m) {
            case 4:
                return (nc6) obj;
            default:
                return Float.valueOf(((nc6) obj).u());
        }
    }
}
