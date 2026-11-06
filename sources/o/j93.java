package o;

import android.app.ActivityOptions;
import android.app.Notification;
import android.app.RemoteInput;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapper;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapperSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapperVector;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.helper.DeviceInfoHelper;
import com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection.ConnectionParam;
import java.io.File;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j93 implements gz3, ra7, ez3, fz3, n57, eh7 {
    public static final byte[] r = new byte[0];
    public final /* synthetic */ byte m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1141o;
    public Object p;
    public Object q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18, types: [android.graphics.drawable.Icon] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.app.Notification, java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.app.Notification$Builder] */
    public j93(o55 o55Var) {
        Bundle[] bundleArr;
        int i;
        ArrayList arrayList;
        ?? r16;
        ?? X;
        int i2;
        int i3;
        this.m = (byte) 28;
        this.q = new Bundle();
        this.p = o55Var;
        Context context = o55Var.a;
        ArrayList arrayList2 = o55Var.w;
        ArrayList arrayList3 = o55Var.c;
        ArrayList arrayList4 = o55Var.d;
        this.n = context;
        Notification.Builder builder = new Notification.Builder(context, o55Var.s);
        this.f1141o = builder;
        Notification notification = o55Var.v;
        ?? r11 = 0;
        int i4 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(o55Var.e).setContentText(o55Var.f).setContentInfo(null).setContentIntent(o55Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(o55Var.i).setProgress(0, 0, false);
        IconCompat iconCompat = o55Var.h;
        builder.setLargeIcon(iconCompat == null ? null : yo1.X(iconCompat, context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(o55Var.j);
        for (k55 k55Var : o55Var.b) {
            IconCompat iconCompatA = k55Var.b;
            if (iconCompatA == null && (i3 = k55Var.f) != 0) {
                iconCompatA = IconCompat.a(i3);
                k55Var.b = iconCompatA;
            }
            boolean z = k55Var.d;
            Bundle bundle = k55Var.a;
            if (iconCompatA != null) {
                r16 = r11;
                X = yo1.X(iconCompatA, r11);
            } else {
                ?? r13 = r11;
                r16 = r13;
                X = r13;
            }
            Notification.Action.Builder builder2 = new Notification.Action.Builder((Icon) X, k55Var.g, k55Var.h);
            ga6[] ga6VarArr = k55Var.c;
            if (ga6VarArr != null) {
                int length = ga6VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                i2 = i4;
                if (ga6VarArr.length > 0) {
                    ga6 ga6Var = ga6VarArr[i2];
                    throw r16;
                }
                for (int i5 = i2; i5 < length; i5++) {
                    builder2.addRemoteInput(remoteInputArr[i5]);
                }
            } else {
                i2 = i4;
            }
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", i2);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                dq.u(builder2);
            }
            if (i6 >= 29) {
                eq.x(builder2);
            }
            if (i6 >= 31) {
                nh.h(builder2, k55Var.i);
            }
            if (i6 >= 37) {
                wg.a(builder2);
                wg.c(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", k55Var.e);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f1141o).addAction(builder2.build());
            r11 = r16;
            i4 = 0;
        }
        ?? r17 = r11;
        Bundle bundle3 = o55Var.n;
        if (bundle3 != null) {
            ((Bundle) this.q).putAll(bundle3);
        }
        ((Notification.Builder) this.f1141o).setShowWhen(o55Var.k);
        ((Notification.Builder) this.f1141o).setLocalOnly(o55Var.m);
        ((Notification.Builder) this.f1141o).setGroup(r17);
        ((Notification.Builder) this.f1141o).setSortKey(r17);
        ((Notification.Builder) this.f1141o).setGroupSummary(false);
        ((Notification.Builder) this.f1141o).setCategory(r17);
        ((Notification.Builder) this.f1141o).setColor(o55Var.f1632o);
        ((Notification.Builder) this.f1141o).setVisibility(o55Var.p);
        ((Notification.Builder) this.f1141o).setPublicVersion(r17);
        ((Notification.Builder) this.f1141o).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    io.sentry.h2.f();
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    ax axVar = new ax(arrayList2.size() + arrayList.size());
                    axVar.addAll(arrayList);
                    axVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(axVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((Notification.Builder) this.f1141o).addPerson((String) it2.next());
            }
        }
        if (arrayList4.size() > 0) {
            Bundle bundle4 = o55Var.n;
            if (bundle4 == null) {
                bundle4 = new Bundle();
                o55Var.n = bundle4;
            }
            Bundle bundle5 = bundle4.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                String string = Integer.toString(i7);
                k55 k55Var2 = (k55) arrayList4.get(i7);
                Bundle bundle8 = new Bundle();
                IconCompat iconCompatA2 = k55Var2.b;
                if (iconCompatA2 == null && (i = k55Var2.f) != 0) {
                    iconCompatA2 = IconCompat.a(i);
                    k55Var2.b = iconCompatA2;
                }
                Bundle bundle9 = k55Var2.a;
                bundle8.putInt("icon", iconCompatA2 != null ? iconCompatA2.b() : 0);
                bundle8.putCharSequence("title", k55Var2.g);
                bundle8.putParcelable("actionIntent", k55Var2.h);
                Bundle bundle10 = new Bundle(bundle9);
                bundle10.putBoolean("android.support.allowGeneratedReplies", k55Var2.d);
                bundle8.putBundle("extras", bundle10);
                ga6[] ga6VarArr2 = k55Var2.c;
                if (ga6VarArr2 == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[ga6VarArr2.length];
                    if (ga6VarArr2.length > 0) {
                        ga6 ga6Var2 = ga6VarArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", k55Var2.e);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            Bundle bundle11 = o55Var.n;
            if (bundle11 == null) {
                bundle11 = new Bundle();
                o55Var.n = bundle11;
            }
            bundle11.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.q).putBundle("android.car.EXTENSIONS", bundle6);
        }
        ((Notification.Builder) this.f1141o).setExtras(o55Var.n);
        ((Notification.Builder) this.f1141o).setRemoteInputHistory(null);
        RemoteViews remoteViews = o55Var.q;
        if (remoteViews != null) {
            ((Notification.Builder) this.f1141o).setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = o55Var.r;
        if (remoteViews2 != null) {
            ((Notification.Builder) this.f1141o).setCustomBigContentView(remoteViews2);
        }
        ((Notification.Builder) this.f1141o).setBadgeIconType(0);
        ((Notification.Builder) this.f1141o).setSettingsText(null);
        ((Notification.Builder) this.f1141o).setShortcutId(null);
        ((Notification.Builder) this.f1141o).setTimeoutAfter(o55Var.t);
        ((Notification.Builder) this.f1141o).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(o55Var.s)) {
            ((Notification.Builder) this.f1141o).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                it3.next().getClass();
                io.sentry.h2.f();
                throw null;
            }
        }
        if (i8 >= 29) {
            eq.u((Notification.Builder) this.f1141o, o55Var.u);
            eq.w((Notification.Builder) this.f1141o);
        }
        if (i8 >= 36) {
            d4.f((Notification.Builder) this.f1141o);
        }
    }

    public static int I(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            int i11 = i3;
            i3 = i6;
            i6 = i11;
        }
        if (i3 - i6 <= length / 16) {
            throw d55.a();
        }
        int i12 = i3 - 1;
        int i13 = -1;
        int i14 = i12;
        while (i12 > i6) {
            int i15 = i12 - i6;
            int i16 = (i2 - iArr[i12]) * (i3 - i12) * i15 * i15;
            if (i16 > i13) {
                i14 = i12;
                i13 = i16;
            }
            i12--;
        }
        return i14 << 3;
    }

    public static void Z(j93 j93Var, x36 x36Var, a46 a46Var, x36 x36Var2, int i) {
        d22 d22Var;
        if ((i & 1) != 0) {
            x36Var = null;
        }
        if ((i & 2) != 0) {
            a46Var = null;
        }
        if ((i & 4) != 0) {
            x36Var2 = null;
        }
        j93Var.getClass();
        TimeZone timeZone = ro8.a;
        boolean zIsShutdown = j93Var.J().isShutdown();
        synchronized (j93Var) {
            if (a46Var != null) {
                try {
                    if (!((ArrayDeque) j93Var.q).remove(a46Var)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (x36Var2 != null) {
                x36Var2.n.decrementAndGet();
                if (!((ArrayDeque) j93Var.p).remove(x36Var2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (x36Var != null) {
                ((ArrayDeque) j93Var.f1141o).add(x36Var);
                x36 x36VarL = j93Var.L(x36Var.f2478o.n.a.d);
                if (x36VarL != null) {
                    x36Var.n = x36VarL.n;
                }
            }
            if ((a46Var != null || x36Var2 != null) && (zIsShutdown || ((ArrayDeque) j93Var.p).isEmpty())) {
                ((ArrayDeque) j93Var.q).isEmpty();
            }
            if (zIsShutdown) {
                List listP0 = lv0.P0((ArrayDeque) j93Var.f1141o);
                ((ArrayDeque) j93Var.f1141o).clear();
                d22Var = new d22(listP0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) j93Var.f1141o).iterator();
                it.getClass();
                while (it.hasNext()) {
                    x36 x36Var3 = (x36) it.next();
                    if (((ArrayDeque) j93Var.p).size() >= 64) {
                        break;
                    }
                    if (x36Var3.n.get() < 5) {
                        it.remove();
                        x36Var3.n.incrementAndGet();
                        arrayList.add(x36Var3);
                        ((ArrayDeque) j93Var.p).add(x36Var3);
                    }
                }
                d22Var = new d22((List) arrayList);
            }
        }
        int size = d22Var.m.size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            x36 x36Var4 = (x36) d22Var.m.get(i2);
            if (x36Var4 == x36Var) {
                z = false;
            } else {
                x36Var4.f2478o.p.getClass();
            }
            if (zIsShutdown) {
                x36Var4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                x36Var4.f2478o.h(interruptedIOException);
                x36Var4.m.q(interruptedIOException);
            } else {
                ExecutorService executorServiceJ = j93Var.J();
                x36Var4.getClass();
                a46 a46Var2 = x36Var4.f2478o;
                a46Var2.m.a.getClass();
                try {
                    try {
                        executorServiceJ.execute(x36Var4);
                    } catch (Throwable th2) {
                        j93 j93Var2 = a46Var2.m.a;
                        j93Var2.getClass();
                        Z(j93Var2, null, null, x36Var4, 3);
                        throw th2;
                    }
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e);
                    x36Var4.f2478o.h(interruptedIOException2);
                    x36Var4.m.q(interruptedIOException2);
                    j93 j93Var3 = a46Var2.m.a;
                    j93Var3.getClass();
                    Z(j93Var3, null, null, x36Var4, 3);
                }
            }
        }
        if (!z || x36Var == null) {
            return;
        }
        x36Var.f2478o.p.getClass();
    }

    public static void z(j93 j93Var, o05 o05Var) {
        j93Var.getClass();
        o05Var.getClass();
        if (((bx4) j93Var.p).a(o05Var)) {
            r05 r05Var = (r05) j93Var.f1141o;
            if (o05Var.c != null) {
                an4.q(o05Var, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            r05Var.e.addFirst(o05Var);
            o05Var.c = j93Var;
            r05Var.b();
        }
    }

    public void A(q05 q05Var) {
        if (((bx4) this.q).a(q05Var)) {
            ((r05) this.f1141o).a(this, q05Var, -1);
        }
    }

    public void B(g75 g75Var, int i) {
        if (i != 1 && i != 0) {
            gk0.h(fx3.e(i, "Unsupported priority value: "));
        } else if (((bx4) this.q).a(g75Var)) {
            ((r05) this.f1141o).a(this, g75Var, i);
        }
    }

    public wk0 C() {
        Intent intent = (Intent) this.n;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        Bundle bundle2 = (Bundle) this.q;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        if (((SparseArray) this.p) != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", (SparseArray) this.p);
            intent.putExtras(bundle3);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ActivityOptions activityOptionsMakeBasic = (ActivityOptions) this.f1141o;
            if (activityOptionsMakeBasic == null) {
                activityOptionsMakeBasic = ActivityOptions.makeBasic();
                this.f1141o = activityOptionsMakeBasic;
            }
            q3.m(activityOptionsMakeBasic);
        }
        if (i >= 36) {
            if (((ActivityOptions) this.f1141o) == null) {
                this.f1141o = ActivityOptions.makeBasic();
            }
            d4.e((ActivityOptions) this.f1141o, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f1141o;
        return new wk0((Object) intent, (Object) (activityOptions != null ? activityOptions.toBundle() : null), (byte) 10);
    }

    public wk0 D() throws GeneralSecurityException {
        d82 d82Var;
        nx3 nx3Var;
        nx3 nx3VarZ;
        int i;
        byte[] bArrArray;
        va7.a();
        d11 d11Var = new d11();
        wk0 wk0Var = null;
        d11Var.m = null;
        d11Var.n = null;
        d11Var.f578o = null;
        d11Var.p = null;
        d11Var.q = null;
        d11Var.q = ((wa2) this.f1141o).m;
        Context context = (Context) this.p;
        d11Var.m = new g95(context, (byte) 27);
        d11Var.n = new g95(context, (byte) 28);
        String strConcat = "android-keystore://".concat((String) this.q);
        if (!strConcat.startsWith("android-keystore://")) {
            hk0.g("key URI must start with android-keystore://");
            return null;
        }
        d11Var.f578o = strConcat;
        synchronized (d11Var) {
            try {
                if (((String) d11Var.f578o) != null) {
                    d11Var.p = d11Var.N();
                }
                d11Var.r = d11Var.M();
                d82Var = new d82((byte) 29);
                nx3Var = (nx3) d11Var.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (d82Var) {
            nx3VarZ = nx3Var.z();
        }
        Class cls = ((za7) j96.e.get(ua7.class)) == null ? null : ua7.class;
        if (cls == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(ua7.class.getName()));
        }
        ox3 ox3Var = ox3.ENABLED;
        oy3 oy3Var = (oy3) nx3VarZ.n;
        int i2 = na8.a;
        int iQ = oy3Var.q();
        int i3 = 1;
        byte b = 0;
        boolean z = true;
        int i4 = 0;
        boolean z2 = false;
        for (ny3 ny3Var : oy3Var.p()) {
            if (ny3Var.p() == ox3Var) {
                if (!ny3Var.q()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(ny3Var.n())));
                }
                wk0 wk0Var2 = wk0Var;
                if (ny3Var.o() == dc5.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(ny3Var.n())));
                }
                if (ny3Var.p() == ox3.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(ny3Var.n())));
                }
                if (ny3Var.n() == iQ) {
                    if (z2) {
                        hk0.u("keyset contains multiple primary keys");
                        return wk0Var2;
                    }
                    z2 = true;
                }
                if (ny3Var.m().n() != bx3.ASYMMETRIC_PUBLIC) {
                    z = false;
                }
                i4++;
                wk0Var = wk0Var2;
            }
        }
        wk0 wk0Var3 = wk0Var;
        if (i4 == 0) {
            hk0.u("keyset must contain at least one ENABLED key");
            return wk0Var3;
        }
        if (!z2 && !z) {
            hk0.u("keyset doesn't contain a valid primary key");
            return wk0Var3;
        }
        ep3 ep3Var = new ep3(cls, (byte) 12);
        Class cls2 = (Class) ep3Var.p;
        for (ny3 ny3Var2 : oy3Var.p()) {
            if (ny3Var2.p() == ox3Var) {
                String strO = ny3Var2.m().o();
                yh0 yh0VarP = ny3Var2.m().p();
                i96 i96VarB = j96.b(strO);
                Set setKeySet = ((Map) i96VarB.a.d).keySet();
                sx3 sx3Var = i96VarB.a;
                if (!setKeySet.contains(cls)) {
                    StringBuilder sb = new StringBuilder("Primitive type ");
                    sb.append(cls.getName());
                    sb.append(" not supported by key manager of type ");
                    sb.append(sx3Var.getClass());
                    sb.append(", supported primitives: ");
                    Set<Class> setKeySet2 = ((Map) i96VarB.a.d).keySet();
                    StringBuilder sb2 = new StringBuilder();
                    for (Class cls3 : setKeySet2) {
                        if (i3 == 0) {
                            sb2.append(", ");
                        }
                        sb2.append(cls3.getCanonicalName());
                        i3 = 0;
                    }
                    sb.append(sb2.toString());
                    throw new GeneralSecurityException(sb.toString());
                }
                try {
                    if (!((Map) sx3Var.d).keySet().contains(cls) && !Void.class.equals(cls)) {
                        throw new IllegalArgumentException("Given internalKeyMananger " + sx3Var.toString() + " does not support primitive class " + cls.getName());
                    }
                    try {
                        s1 s1VarD = sx3Var.d(yh0VarP);
                        if (Void.class.equals(cls)) {
                            throw new GeneralSecurityException("Cannot create a primitive for Void");
                        }
                        sx3Var.e(s1VarD);
                        rc rcVar = (rc) ((Map) sx3Var.d).get(cls);
                        if (rcVar == null) {
                            throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
                        }
                        Object objA = rcVar.a(s1VarD);
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ep3Var.n;
                        if (ny3Var2.p() != ox3Var) {
                            hk0.u("only ENABLED key is allowed");
                            return wk0Var3;
                        }
                        int iOrdinal = ny3Var2.o().ordinal();
                        if (iOrdinal == i3) {
                            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(ny3Var2.n()).array();
                        } else if (iOrdinal == 2) {
                            bArrArray = ByteBuffer.allocate(5).put(b).putInt(ny3Var2.n()).array();
                        } else if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                hk0.u("unknown output prefix type");
                                return wk0Var3;
                            }
                            bArrArray = ByteBuffer.allocate(5).put(b).putInt(ny3Var2.n()).array();
                        } else {
                            bArrArray = di1.p;
                        }
                        ms5 ms5Var = new ms5(objA, bArrArray, ny3Var2.p());
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ms5Var);
                        byte[] bArr = ms5Var.b;
                        ns5 ns5Var = new ns5(Arrays.copyOf(bArr, bArr.length));
                        List list = (List) concurrentHashMap.put(ns5Var, Collections.unmodifiableList(arrayList));
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(list);
                            arrayList2.add(ms5Var);
                            concurrentHashMap.put(ns5Var, Collections.unmodifiableList(arrayList2));
                        }
                        if (ny3Var2.n() == oy3Var.q()) {
                            if (ms5Var.c != ox3Var) {
                                hk0.g("the primary entry has to be ENABLED");
                                return wk0Var3;
                            }
                            byte[] bArr2 = ms5Var.b;
                            List list2 = (List) ((ConcurrentHashMap) ep3Var.n).get(new ns5(Arrays.copyOf(bArr2, bArr2.length)));
                            if (list2 == null) {
                                list2 = Collections.EMPTY_LIST;
                            }
                            if (list2.isEmpty()) {
                                hk0.g("the primary entry cannot be set to an entry which is not held by this primitive set");
                                return wk0Var3;
                            }
                            ep3Var.f733o = ms5Var;
                        }
                        i = 1;
                    } catch (qm3 e) {
                        throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) sx3Var.b).getName()), e);
                    }
                } catch (IllegalArgumentException e2) {
                    throw new GeneralSecurityException("Primitive type not supported", e2);
                }
            } else {
                i = i3;
            }
            i3 = i;
            b = 0;
        }
        if (((za7) j96.e.get(ua7.class)) == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls2.getName()));
        }
        if (!ua7.class.equals(cls2)) {
            throw new GeneralSecurityException("Wrong input primitive class, expected " + ua7.class + ", got " + cls2);
        }
        ya7 ya7Var = new ya7();
        if (((ms5) ep3Var.f733o) != null) {
            ya7Var.a = ep3Var;
            return new wk0(this.n, (Object) ya7Var, (byte) 25);
        }
        hk0.u("Missing primary primitive.");
        return wk0Var3;
    }

    public ps6 E(ConnectionParam connectionParam, mb5 mb5Var, int i) {
        mb5Var.getClass();
        ae aeVar = ae.g;
        if (aeVar == null) {
            aeVar = new ae((byte) 7);
            ae.g = aeVar;
        }
        aeVar.c = connectionParam.getPartnerLicenseFeatures();
        aeVar.d = connectionParam.getMyLicenseFeatures();
        return new ps6(new yt5(connectionParam, mb5Var, i, (d31) this.q), (au6) this.n, (Context) this.f1141o, (EventHub) this.p, (d31) this.q);
    }

    public void F(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            hk0.o("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((a07) this.f1141o).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                F(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void G(q05 q05Var, m05 m05Var) {
        r05 r05Var = (r05) this.f1141o;
        if (r05Var.g != 0) {
            return;
        }
        o05 o05VarC = r05Var.c(-1);
        r05Var.f = o05VarC;
        r05Var.g = -1;
        r05Var.h = q05Var;
        if (m05Var != null) {
            if (o05VarC != null) {
                o05VarC.d(m05Var);
            }
            r05Var.a.l(null, new t05(m05Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r7 == r2) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(o.jc1 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.q
            o.vh1 r0 = (o.vh1) r0
            boolean r1 = r7 instanceof o.bh1
            if (r1 == 0) goto L17
            r1 = r7
            o.bh1 r1 = (o.bh1) r1
            int r2 = r1.p
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.p = r2
            goto L1c
        L17:
            o.bh1 r1 = new o.bh1
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.n
            int r2 = r1.p
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            o.j93 r6 = r1.m
            o.ct1.a0(r7)
            goto L61
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r6)
            return r3
        L35:
            o.j93 r6 = r1.m
            o.ct1.a0(r7)
            goto L70
        L3b:
            o.ct1.a0(r7)
            java.lang.Object r7 = r6.p
            java.util.List r7 = (java.util.List) r7
            o.ne1 r2 = o.ne1.m
            if (r7 == 0) goto L64
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4d
            goto L64
        L4d:
            o.o07 r7 = r0.c()
            o.eh1 r5 = new o.eh1
            r5.<init>(r0, r6, r3)
            r1.m = r6
            r1.p = r4
            java.lang.Object r7 = r7.b(r5, r1)
            if (r7 != r2) goto L61
            goto L6f
        L61:
            o.qg1 r7 = (o.qg1) r7
            goto L72
        L64:
            r1.m = r6
            r1.p = r5
            r7 = 0
            java.lang.Object r7 = r0.h(r7, r1)
            if (r7 != r2) goto L70
        L6f:
            return r2
        L70:
            o.qg1 r7 = (o.qg1) r7
        L72:
            java.lang.Object r6 = r6.q
            o.vh1 r6 = (o.vh1) r6
            o.wh1 r6 = r6.h
            r6.c(r7)
            o.f88 r6 = o.f88.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.j93.H(o.jc1):java.lang.Object");
    }

    public synchronized ExecutorService J() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = (ThreadPoolExecutor) this.n;
        if (threadPoolExecutor == null) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new qo8(ro8.b + " Dispatcher", false));
            this.n = threadPoolExecutor2;
            threadPoolExecutor = threadPoolExecutor2;
        }
        return threadPoolExecutor;
    }

    public ut2 K(String str) {
        av2 av2Var = (av2) ((HashMap) this.f1141o).get(str);
        if (av2Var != null) {
            return av2Var.c;
        }
        return null;
    }

    public x36 L(String str) {
        Iterator it = ((ArrayDeque) this.p).iterator();
        it.getClass();
        while (it.hasNext()) {
            x36 x36Var = (x36) it.next();
            if (im3.n(x36Var.f2478o.n.a.d, str)) {
                return x36Var;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f1141o).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            x36 x36Var2 = (x36) it2.next();
            if (im3.n(x36Var2.f2478o.n.a.d, str)) {
                return x36Var2;
            }
        }
        return null;
    }

    public ut2 M(String str) {
        for (av2 av2Var : ((HashMap) this.f1141o).values()) {
            if (av2Var != null) {
                ut2 ut2VarM = av2Var.c;
                if (!str.equals(ut2VarM.q)) {
                    ut2VarM = ut2VarM.H.c.M(str);
                }
                if (ut2VarM != null) {
                    return ut2VarM;
                }
            }
        }
        return null;
    }

    public ArrayList N() {
        ArrayList arrayList = new ArrayList();
        for (av2 av2Var : ((HashMap) this.f1141o).values()) {
            if (av2Var != null) {
                arrayList.add(av2Var);
            }
        }
        return arrayList;
    }

    public ArrayList O() {
        ArrayList arrayList = new ArrayList();
        for (av2 av2Var : ((HashMap) this.f1141o).values()) {
            if (av2Var != null) {
                arrayList.add(av2Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public ns4 P(js0 js0Var, List list) {
        js0Var.getClass();
        return (ns4) ((sd4) this.q).invoke(new b55(js0Var, list));
    }

    public List Q() {
        ArrayList arrayList;
        if (((ArrayList) this.n).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.n)) {
            arrayList = new ArrayList((ArrayList) this.n);
        }
        return arrayList;
    }

    public float R() {
        DisplayMetrics displayMetrics = ((Context) this.n).getResources().getDisplayMetrics();
        displayMetrics.getClass();
        double dAbs = Math.abs(displayMetrics.xdpi / displayMetrics.densityDpi);
        return (0.75d > dAbs || dAbs > 1.25d) ? displayMetrics.densityDpi : (displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f;
    }

    public nw4 S(fb3 fb3Var) {
        int iOrdinal = fb3Var.ordinal();
        if (iOrdinal == 0) {
            return (nw4) this.n;
        }
        if (iOrdinal == 1) {
            return (nw4) this.f1141o;
        }
        if (iOrdinal == 2) {
            return (nw4) this.p;
        }
        if (iOrdinal == 3) {
            return (nw4) this.q;
        }
        gk0.s();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0055  */
    /* JADX WARN: Code duplicated, block: B:14:0x0062  */
    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:19:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7 A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:21:0x0099, B:27:0x00b7, B:29:0x00c0, B:31:0x00c4, B:33:0x00cd, B:32:0x00c9, B:28:0x00bc), top: B:42:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:21:0x0099, B:27:0x00b7, B:29:0x00c0, B:31:0x00c4, B:33:0x00cd, B:32:0x00c9, B:28:0x00bc), top: B:42:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c4 A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:21:0x0099, B:27:0x00b7, B:29:0x00c0, B:31:0x00c4, B:33:0x00cd, B:32:0x00c9, B:28:0x00bc), top: B:42:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9 A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:21:0x0099, B:27:0x00b7, B:29:0x00c0, B:31:0x00c4, B:33:0x00cd, B:32:0x00c9, B:28:0x00bc), top: B:42:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    public Point T() {
        String str;
        Locale locale;
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        String lowerCase5;
        Display.Mode mode;
        boolean z;
        int physicalWidth;
        int physicalHeight;
        Point point = new Point();
        if ("qti".equalsIgnoreCase(DeviceInfoHelper.a())) {
            String str2 = Build.MODEL;
            str2.getClass();
            String lowerCase6 = str2.toLowerCase(Locale.ROOT);
            lowerCase6.getClass();
            if (!ub7.Q(lowerCase6, "copilot2", false)) {
                str = Build.BRAND;
                str.getClass();
                locale = Locale.US;
                locale.getClass();
                lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                if (ub7.Q(lowerCase, "cpac", false)) {
                    String str3 = Build.DEVICE;
                    str3.getClass();
                    lowerCase5 = str3.toLowerCase(locale);
                    lowerCase5.getClass();
                    if (!ub7.Q(lowerCase5, "copilot2", false)) {
                        lowerCase2 = str.toLowerCase(locale);
                        lowerCase2.getClass();
                        if (ub7.Q(lowerCase2, "qti", false)) {
                            String str4 = Build.DEVICE;
                            str4.getClass();
                            lowerCase4 = str4.toLowerCase(locale);
                            lowerCase4.getClass();
                            if (!ub7.Q(lowerCase4, "msmnile_au", false)) {
                                if ("microsoft".equalsIgnoreCase(DeviceInfoHelper.a())) {
                                    String str5 = Build.MODEL;
                                    str5.getClass();
                                    lowerCase3 = str5.toLowerCase(Locale.ROOT);
                                    lowerCase3.getClass();
                                    if (ub7.Q(lowerCase3, "surface duo", false)) {
                                    }
                                }
                            }
                        } else if ("microsoft".equalsIgnoreCase(DeviceInfoHelper.a())) {
                            String str6 = Build.MODEL;
                            str6.getClass();
                            lowerCase3 = str6.toLowerCase(Locale.ROOT);
                            lowerCase3.getClass();
                            if (ub7.Q(lowerCase3, "surface duo", false)) {
                            }
                        }
                    }
                } else {
                    lowerCase2 = str.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (ub7.Q(lowerCase2, "qti", false)) {
                        String str7 = Build.DEVICE;
                        str7.getClass();
                        lowerCase4 = str7.toLowerCase(locale);
                        lowerCase4.getClass();
                        if (!ub7.Q(lowerCase4, "msmnile_au", false)) {
                            if ("microsoft".equalsIgnoreCase(DeviceInfoHelper.a())) {
                                String str8 = Build.MODEL;
                                str8.getClass();
                                lowerCase3 = str8.toLowerCase(Locale.ROOT);
                                lowerCase3.getClass();
                                if (ub7.Q(lowerCase3, "surface duo", false)) {
                                }
                            }
                        }
                    } else if ("microsoft".equalsIgnoreCase(DeviceInfoHelper.a())) {
                        String str9 = Build.MODEL;
                        str9.getClass();
                        lowerCase3 = str9.toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                        if (ub7.Q(lowerCase3, "surface duo", false)) {
                        }
                    }
                }
            }
            try {
                Display display = (Display) ((kh7) this.f1141o).getValue();
                display.getClass();
                mode = display.getMode();
                int rotation = display.getRotation();
                z = rotation != 1 || rotation == 3;
                if (z) {
                    physicalWidth = mode.getPhysicalHeight();
                } else {
                    physicalWidth = mode.getPhysicalWidth();
                }
                point.x = physicalWidth;
                if (z) {
                    physicalHeight = mode.getPhysicalWidth();
                } else {
                    physicalHeight = mode.getPhysicalHeight();
                }
                point.y = physicalHeight;
                return point;
            } catch (Exception unused) {
            }
        } else {
            str = Build.BRAND;
            str.getClass();
            locale = Locale.US;
            locale.getClass();
            lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            if (ub7.Q(lowerCase, "cpac", false)) {
                String str10 = Build.DEVICE;
                str10.getClass();
                lowerCase5 = str10.toLowerCase(locale);
                lowerCase5.getClass();
                if (!ub7.Q(lowerCase5, "copilot2", false)) {
                    lowerCase2 = str.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (ub7.Q(lowerCase2, "qti", false)) {
                        String str11 = Build.DEVICE;
                        str11.getClass();
                        lowerCase4 = str11.toLowerCase(locale);
                        lowerCase4.getClass();
                        if (!ub7.Q(lowerCase4, "msmnile_au", false)) {
                            if ("microsoft".equalsIgnoreCase(DeviceInfoHelper.a())) {
                                String str12 = Build.MODEL;
                                str12.getClass();
                                lowerCase3 = str12.toLowerCase(Locale.ROOT);
                                lowerCase3.getClass();
                                if (ub7.Q(lowerCase3, "surface duo", false)) {
                                }
                            }
                        }
                    } else if ("microsoft".equalsIgnoreCase(DeviceInfoHelper.a())) {
                        String str13 = Build.MODEL;
                        str13.getClass();
                        lowerCase3 = str13.toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                        if (ub7.Q(lowerCase3, "surface duo", false)) {
                        }
                    }
                }
                Display display2 = (Display) ((kh7) this.f1141o).getValue();
                display2.getClass();
                mode = display2.getMode();
                int rotation2 = display2.getRotation();
                if (rotation2 != 1) {
                }
                if (z) {
                    physicalWidth = mode.getPhysicalHeight();
                } else {
                    physicalWidth = mode.getPhysicalWidth();
                }
                point.x = physicalWidth;
                if (z) {
                    physicalHeight = mode.getPhysicalWidth();
                } else {
                    physicalHeight = mode.getPhysicalHeight();
                }
                point.y = physicalHeight;
                return point;
            }
            lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            if (ub7.Q(lowerCase2, "qti", false)) {
                String str14 = Build.DEVICE;
                str14.getClass();
                lowerCase4 = str14.toLowerCase(locale);
                lowerCase4.getClass();
                if (!ub7.Q(lowerCase4, "msmnile_au", false)) {
                    if ("microsoft".equalsIgnoreCase(DeviceInfoHelper.a())) {
                        String str15 = Build.MODEL;
                        str15.getClass();
                        lowerCase3 = str15.toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                        if (ub7.Q(lowerCase3, "surface duo", false)) {
                        }
                    }
                }
                Display display3 = (Display) ((kh7) this.f1141o).getValue();
                display3.getClass();
                mode = display3.getMode();
                int rotation3 = display3.getRotation();
                if (rotation3 != 1) {
                }
                if (z) {
                    physicalWidth = mode.getPhysicalHeight();
                } else {
                    physicalWidth = mode.getPhysicalWidth();
                }
                point.x = physicalWidth;
                if (z) {
                    physicalHeight = mode.getPhysicalWidth();
                } else {
                    physicalHeight = mode.getPhysicalHeight();
                }
                point.y = physicalHeight;
                return point;
            }
            if ("microsoft".equalsIgnoreCase(DeviceInfoHelper.a())) {
                String str16 = Build.MODEL;
                str16.getClass();
                lowerCase3 = str16.toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                if (ub7.Q(lowerCase3, "surface duo", false)) {
                    Display display4 = (Display) ((kh7) this.f1141o).getValue();
                    display4.getClass();
                    mode = display4.getMode();
                    int rotation4 = display4.getRotation();
                    if (rotation4 != 1) {
                    }
                    if (z) {
                        physicalWidth = mode.getPhysicalHeight();
                    } else {
                        physicalWidth = mode.getPhysicalWidth();
                    }
                    point.x = physicalWidth;
                    if (z) {
                        physicalHeight = mode.getPhysicalWidth();
                    } else {
                        physicalHeight = mode.getPhysicalHeight();
                    }
                    point.y = physicalHeight;
                    return point;
                }
            }
        }
        int i = Build.VERSION.SDK_INT;
        kh7 kh7Var = (kh7) this.p;
        if (i < 30) {
            ((WindowManager) kh7Var.getValue()).getDefaultDisplay().getRealSize(point);
            return point;
        }
        Rect bounds = ((WindowManager) kh7Var.getValue()).getMaximumWindowMetrics().getBounds();
        bounds.getClass();
        point.x = bounds.width();
        point.y = bounds.height();
        return point;
    }

    public int U() {
        IAlertViewModelWrapperVector iAlertViewModelWrapperVector = (IAlertViewModelWrapperVector) this.q;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iAlertViewModelWrapperVector) {
            IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) obj;
            if (IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_IsAcknowledged(iAlertViewModelWrapper.a, iAlertViewModelWrapper)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public int V() {
        IAlertViewModelWrapperVector iAlertViewModelWrapperVector = (IAlertViewModelWrapperVector) this.q;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iAlertViewModelWrapperVector) {
            IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) obj;
            if (!IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_IsAcknowledged(iAlertViewModelWrapper.a, iAlertViewModelWrapper)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public boolean W() {
        return ((Boolean) ((kh7) this.q).getValue()).booleanValue();
    }

    public void X(av2 av2Var) {
        ut2 ut2Var = av2Var.c;
        String str = ut2Var.q;
        HashMap map = (HashMap) this.f1141o;
        if (map.get(str) != null) {
            return;
        }
        map.put(ut2Var.q, av2Var);
        if (ut2Var.P) {
            boolean z = ut2Var.O;
            uu2 uu2Var = (uu2) this.q;
            if (z) {
                uu2Var.V0(ut2Var);
            } else {
                uu2Var.Z0(ut2Var);
            }
            ut2Var.P = false;
        }
        if (su2.M(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + ut2Var);
        }
    }

    public void Y(av2 av2Var) {
        HashMap map = (HashMap) this.f1141o;
        ut2 ut2Var = av2Var.c;
        if (ut2Var.O) {
            ((uu2) this.q).Z0(ut2Var);
        }
        if (map.get(ut2Var.q) == av2Var && ((av2) map.put(ut2Var.q, null)) != null && su2.M(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + ut2Var);
        }
    }

    @Override // o.ez3
    public void a() {
        switch (this.m) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f1141o;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((cj3) this.p).f531o).put((bp4) this.n, arrayList);
                }
                break;
            case 6:
                ((io.sentry.android.core.d) this.f1141o).a();
                ((ArrayList) ((j93) this.p).n).add(new sp((hp) lv0.F0((ArrayList) this.q)));
                break;
            default:
                io.sentry.android.core.d dVar = (io.sentry.android.core.d) this.q;
                sy4 sy4Var = (sy4) this.p;
                ArrayList arrayList2 = (ArrayList) this.n;
                qb8 qb8VarE = wo1.E(sy4Var, (ns4) dVar.p);
                if (qb8VarE != null) {
                    HashMap map = (HashMap) dVar.n;
                    List listS = ka0.s(arrayList2);
                    oz3 type = qb8VarE.getType();
                    type.getClass();
                    map.put(sy4Var, new s58(listS, type));
                    break;
                } else if (((d11) dVar.f100o).F((js0) dVar.q) && im3.n(sy4Var.b(), "value")) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (obj instanceof sp) {
                            arrayList3.add(obj);
                        }
                    }
                    List list = (List) dVar.r;
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        list.add((hp) ((sp) it.next()).a);
                    }
                    break;
                }
                break;
        }
    }

    public void a0() {
        nw4 nw4Var = (nw4) this.q;
        nw4 nw4Var2 = (nw4) this.p;
        nw4 nw4Var3 = (nw4) this.f1141o;
        nw4 nw4Var4 = (nw4) this.n;
        Object value = nw4Var4.getValue();
        Boolean bool = Boolean.TRUE;
        if (im3.n(value, bool)) {
            nw4Var4.setValue(Boolean.FALSE);
        }
        if (im3.n(nw4Var3.getValue(), bool)) {
            nw4Var3.setValue(Boolean.FALSE);
        }
        if (im3.n(nw4Var2.getValue(), bool)) {
            nw4Var2.setValue(Boolean.FALSE);
        }
        if (im3.n(nw4Var.getValue(), bool)) {
            nw4Var.setValue(Boolean.FALSE);
        }
    }

    @Override // o.fz3
    public void b(ns0 ns0Var) {
        ((ArrayList) this.n).add(new iu3(new gu3(ns0Var)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b0(jc1 jc1Var) throws Throwable {
        jg6 jg6Var;
        ky4 ky4Var;
        Throwable th;
        ky4 ky4Var2;
        j93 j93Var;
        if (jc1Var instanceof jg6) {
            jg6Var = (jg6) jc1Var;
            int i = jg6Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                jg6Var.q = i - Integer.MIN_VALUE;
            } else {
                jg6Var = new jg6(this, jc1Var);
            }
        } else {
            jg6Var = new jg6(this, jc1Var);
        }
        Object obj = jg6Var.f1162o;
        int i2 = jg6Var.q;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        try {
            if (i2 == 0) {
                ct1.a0(obj);
                if (((qx0) this.f1141o).L()) {
                    return f88Var;
                }
                ky4Var = (my4) this.n;
                jg6Var.m = this;
                jg6Var.n = ky4Var;
                jg6Var.q = 1;
                if (ky4Var.e(jg6Var) != ne1Var) {
                }
                return ne1Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ky4Var2 = jg6Var.n;
                j93Var = jg6Var.m;
                try {
                    ct1.a0(obj);
                    ((qx0) j93Var.f1141o).N(f88Var);
                    ky4Var2.j(null);
                    return f88Var;
                } catch (Throwable th2) {
                    th = th2;
                    ky4Var2.j(null);
                    throw th;
                }
            }
            ky4 ky4Var3 = jg6Var.n;
            j93 j93Var2 = jg6Var.m;
            ct1.a0(obj);
            ky4Var = ky4Var3;
            this = j93Var2;
            if (((qx0) this.f1141o).L()) {
                ky4Var.j(null);
                return f88Var;
            }
            jg6Var.m = this;
            jg6Var.n = ky4Var;
            jg6Var.q = 2;
            if (this.H(jg6Var) != ne1Var) {
                j93Var = this;
                ky4Var2 = ky4Var;
                ((qx0) j93Var.f1141o).N(f88Var);
                ky4Var2.j(null);
                return f88Var;
            }
            return ne1Var;
        } catch (Throwable th3) {
            ky4 ky4Var4 = ky4Var;
            th = th3;
            ky4Var2 = ky4Var4;
            ky4Var2.j(null);
            throw th;
        }
    }

    @Override // o.n57
    public q67 c() {
        return (dl1) this.p;
    }

    public void c0(int i, cz czVar) {
        if (i < 0 || i > 2 || i == 0) {
            hk0.g(fx3.e(i, "Invalid colorScheme: "));
            return;
        }
        SparseArray sparseArray = (SparseArray) this.p;
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            this.p = sparseArray;
        }
        sparseArray.put(i, czVar.a());
    }

    @Override // o.eh7
    public void d(VoidSignalCallback voidSignalCallback) {
        voidSignalCallback.getClass();
        ComputerDetailsViewModel computerDetailsViewModel = ((kc0) this.n).n;
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForAlertsListChanged(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public Bundle d0(String str, Bundle bundle) {
        HashMap map = (HashMap) this.p;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    @Override // o.gz3
    public ez3 e(js0 js0Var, o76 o76Var) {
        return ((d11) ((cj3) this.p).n).I(js0Var, o76Var, (ArrayList) this.f1141o);
    }

    public io.sentry.android.core.d e0(int i, js0 js0Var, o76 o76Var) {
        bp4 bp4Var = new bp4(((bp4) this.n).a + '@' + i);
        cj3 cj3Var = (cj3) this.q;
        HashMap map = (HashMap) cj3Var.f531o;
        List arrayList = (List) map.get(bp4Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(bp4Var, arrayList);
        }
        return ((d11) cj3Var.n).I(js0Var, o76Var, arrayList);
    }

    @Override // o.ez3
    public void f(sy4 sy4Var, ns0 ns0Var) {
        ((io.sentry.android.core.d) this.n).f(sy4Var, ns0Var);
    }

    @Override // o.ez3
    public void g(sy4 sy4Var, js0 js0Var, sy4 sy4Var2) {
        ((io.sentry.android.core.d) this.n).g(sy4Var, js0Var, sy4Var2);
    }

    @Override // o.eh7
    public String getTitle() {
        ComputerDetailsViewModel computerDetailsViewModel = ((kc0) this.n).n;
        String strComputerDetailsViewModel_GetDisplayName = ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel.a, computerDetailsViewModel);
        strComputerDetailsViewModel_GetDisplayName.getClass();
        return strComputerDetailsViewModel_GetDisplayName;
    }

    @Override // o.ez3
    public void h(sy4 sy4Var, Object obj) {
        ((io.sentry.android.core.d) this.n).h(sy4Var, obj);
    }

    @Override // o.fz3
    public void i(Object obj) {
        ArrayList arrayList = (ArrayList) this.n;
        d11 d11Var = (d11) this.f1141o;
        sy4 sy4Var = (sy4) this.p;
        Object objP = z06.p(obj, (qs4) d11Var.f578o);
        if (objP == null) {
            objP = new id2("Unsupported annotation argument: " + sy4Var);
        }
        arrayList.add(objP);
    }

    @Override // o.eh7
    public void j(VoidSignalCallback voidSignalCallback) {
        voidSignalCallback.getClass();
        ComputerDetailsViewModel computerDetailsViewModel = ((kc0) this.n).n;
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForChanges(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.fz3
    public ez3 k(js0 js0Var) {
        ArrayList arrayList = new ArrayList();
        return new j93(((d11) this.f1141o).H(js0Var, s67.h, arrayList), this, arrayList);
    }

    @Override // o.eh7
    public int l() {
        ComputerDetailsViewModel computerDetailsViewModel = ((kc0) this.n).n;
        return (ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_IsOnline(computerDetailsViewModel.a, computerDetailsViewModel) || ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_IsMobileWakeActive(computerDetailsViewModel.a, computerDetailsViewModel)) ? 4 : 0;
    }

    @Override // o.fz3
    public void m(js0 js0Var, sy4 sy4Var) {
        ((ArrayList) this.n).add(new oc2(js0Var, sy4Var));
    }

    @Override // o.ra7
    public synchronized void n(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() != ((wc) this.q).e()) {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
        if (byteBuffer.get() != ((wc) this.q).e()) {
            throw new GeneralSecurityException("Invalid ciphertext");
        }
        this.f1141o = new byte[7];
        byte[] bArr2 = new byte[((wc) this.q).a];
        byteBuffer.get(bArr2);
        byteBuffer.get((byte[]) this.f1141o);
        wc wcVar = (wc) this.q;
        this.n = new SecretKeySpec(ct1.x(wcVar.d, wcVar.e, bArr2, bArr, wcVar.a), "AES");
        this.p = (Cipher) ab2.e.a("AES/GCM/NoPadding");
    }

    @Override // o.eh7
    public boolean o() {
        return V() == 0;
    }

    @Override // o.eh7
    public void p(fd fdVar) {
        ComputerDetailsViewModel computerDetailsViewModel = ((kc0) this.n).n;
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_CheckDeviceAlerts(computerDetailsViewModel.a, computerDetailsViewModel, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) fdVar), fdVar);
    }

    @Override // o.eh7
    public void q(fd fdVar) {
    }

    @Override // o.eh7
    public int r() {
        ComputerDetailsViewModel computerDetailsViewModel = ((kc0) this.n).n;
        if (ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_IsOnline(computerDetailsViewModel.a, computerDetailsViewModel)) {
            return R.drawable.online_indicator;
        }
        return ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_IsMobileWakeActive(computerDetailsViewModel.a, computerDetailsViewModel) ? R.drawable.away_indicator : R.drawable.offline_indicator;
    }

    @Override // o.ez3
    public fz3 s(sy4 sy4Var) {
        return ((io.sentry.android.core.d) this.n).s(sy4Var);
    }

    @Override // o.eh7
    public String t() {
        Resources resources = (Resources) this.p;
        int iOrdinal = ((dd) this.f1141o).ordinal();
        if (iOrdinal == 0) {
            String string = resources.getString(R.string.tv_monitoring_overview_subtext, Integer.valueOf(V()), Integer.valueOf(U()));
            string.getClass();
            return string;
        }
        if (iOrdinal == 1) {
            String string2 = resources.getString(R.string.tv_monitoring_overview_subtext_failed, Integer.valueOf(V()));
            string2.getClass();
            return string2;
        }
        if (iOrdinal != 2) {
            gk0.s();
            return null;
        }
        String string3 = resources.getString(R.string.tv_monitoring_overview_subtext_acknowledged, Integer.valueOf(U()));
        string3.getClass();
        return string3;
    }

    public String toString() {
        switch (this.m) {
            case ep1.d /* 12 */:
                String string = ((Socket) this.n).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    @Override // o.n57
    public v07 u() {
        return (cl1) this.q;
    }

    @Override // o.ra7
    public synchronized void v(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        ((Cipher) this.p).init(2, (SecretKeySpec) this.n, wc.i((byte[]) this.f1141o, i, z));
        ((Cipher) this.p).doFinal(byteBuffer, byteBuffer2);
    }

    @Override // o.ez3
    public ez3 w(js0 js0Var, sy4 sy4Var) {
        return ((io.sentry.android.core.d) this.n).w(js0Var, sy4Var);
    }

    @Override // o.eh7
    public String x() {
        IAlertViewModelWrapperVector iAlertViewModelWrapperVector = (IAlertViewModelWrapperVector) this.q;
        if (ComputerDetailsViewModelSWIGJNI.IAlertViewModelWrapperVector_isEmpty(iAlertViewModelWrapperVector.m, iAlertViewModelWrapperVector)) {
            return "";
        }
        long jIAlertViewModelWrapperVector_doGet = ComputerDetailsViewModelSWIGJNI.IAlertViewModelWrapperVector_doGet(iAlertViewModelWrapperVector.m, iAlertViewModelWrapperVector, 0);
        IAlertViewModelWrapper iAlertViewModelWrapper = jIAlertViewModelWrapperVector_doGet == 0 ? null : new IAlertViewModelWrapper(jIAlertViewModelWrapperVector_doGet);
        String strIAlertViewModelWrapper_GetAge = IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_GetAge(iAlertViewModelWrapper.a, iAlertViewModelWrapper);
        strIAlertViewModelWrapper_GetAge.getClass();
        return strIAlertViewModelWrapper_GetAge;
    }

    public void y(ut2 ut2Var) {
        if (((ArrayList) this.n).contains(ut2Var)) {
            yq4.t(ut2Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.n)) {
            ((ArrayList) this.n).add(ut2Var);
        }
        ut2Var.w = true;
    }

    public j93(final oh3 oh3Var, LifecycleOwner lifecycleOwner) {
        this.m = (byte) 22;
        lifecycleOwner.getClass();
        nw4 nw4Var = new nw4();
        this.n = nw4Var;
        nw4 nw4Var2 = new nw4();
        this.f1141o = nw4Var2;
        nw4 nw4Var3 = new nw4();
        this.p = nw4Var3;
        nw4 nw4Var4 = new nw4();
        this.q = nw4Var4;
        if (oh3Var != null) {
            nw4Var3.setValue(Boolean.valueOf(oh3Var.a()));
            nw4Var2.setValue(Boolean.valueOf(oh3Var.b()));
            final byte b = 1;
            final byte b2 = 0;
            nw4Var.setValue(Boolean.valueOf((oh3Var.a & 1) == 1));
            nw4Var4.setValue(Boolean.valueOf((oh3Var.a & 8) == 8));
            byte b3 = 14;
            nw4Var3.observe(lifecycleOwner, new b7(new Function1() { // from class: o.mx3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b4 = b2;
                    f88 f88Var = f88.a;
                    dd3 dd3Var = oh3Var;
                    Boolean bool = (Boolean) obj;
                    switch (b4) {
                        case 0:
                            bool.getClass();
                            ((oh3) dd3Var).c(bool.booleanValue(), null);
                            break;
                        case 1:
                            bool.getClass();
                            ((oh3) dd3Var).e(bool.booleanValue(), null);
                            break;
                        case 2:
                            bool.getClass();
                            ((oh3) dd3Var).d(bool.booleanValue(), null);
                            break;
                        default:
                            bool.getClass();
                            ((oh3) dd3Var).h(bool.booleanValue(), false);
                            break;
                    }
                    return f88Var;
                }
            }, b3));
            nw4Var.observe(lifecycleOwner, new b7(new Function1() { // from class: o.mx3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b4 = b;
                    f88 f88Var = f88.a;
                    dd3 dd3Var = oh3Var;
                    Boolean bool = (Boolean) obj;
                    switch (b4) {
                        case 0:
                            bool.getClass();
                            ((oh3) dd3Var).c(bool.booleanValue(), null);
                            break;
                        case 1:
                            bool.getClass();
                            ((oh3) dd3Var).e(bool.booleanValue(), null);
                            break;
                        case 2:
                            bool.getClass();
                            ((oh3) dd3Var).d(bool.booleanValue(), null);
                            break;
                        default:
                            bool.getClass();
                            ((oh3) dd3Var).h(bool.booleanValue(), false);
                            break;
                    }
                    return f88Var;
                }
            }, b3));
            final byte b4 = 2;
            nw4Var2.observe(lifecycleOwner, new b7(new Function1() { // from class: o.mx3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b5 = b4;
                    f88 f88Var = f88.a;
                    dd3 dd3Var = oh3Var;
                    Boolean bool = (Boolean) obj;
                    switch (b5) {
                        case 0:
                            bool.getClass();
                            ((oh3) dd3Var).c(bool.booleanValue(), null);
                            break;
                        case 1:
                            bool.getClass();
                            ((oh3) dd3Var).e(bool.booleanValue(), null);
                            break;
                        case 2:
                            bool.getClass();
                            ((oh3) dd3Var).d(bool.booleanValue(), null);
                            break;
                        default:
                            bool.getClass();
                            ((oh3) dd3Var).h(bool.booleanValue(), false);
                            break;
                    }
                    return f88Var;
                }
            }, b3));
            final byte b5 = 3;
            nw4Var4.observe(lifecycleOwner, new b7(new Function1() { // from class: o.mx3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b6 = b5;
                    f88 f88Var = f88.a;
                    dd3 dd3Var = oh3Var;
                    Boolean bool = (Boolean) obj;
                    switch (b6) {
                        case 0:
                            bool.getClass();
                            ((oh3) dd3Var).c(bool.booleanValue(), null);
                            break;
                        case 1:
                            bool.getClass();
                            ((oh3) dd3Var).e(bool.booleanValue(), null);
                            break;
                        case 2:
                            bool.getClass();
                            ((oh3) dd3Var).d(bool.booleanValue(), null);
                            break;
                        default:
                            bool.getClass();
                            ((oh3) dd3Var).h(bool.booleanValue(), false);
                            break;
                    }
                    return f88Var;
                }
            }, b3));
            oh3Var.d = new ar(this, (byte) 15);
        }
    }

    public j93(kc0 kc0Var, dd ddVar, Resources resources) {
        this.m = (byte) 25;
        ddVar.getClass();
        this.n = kc0Var;
        this.f1141o = ddVar;
        this.p = resources;
        this.q = kc0Var.n.a();
    }

    public j93(au6 au6Var, RemoteControlApplication remoteControlApplication, EventHub eventHub, d31 d31Var) {
        this.m = (byte) 29;
        remoteControlApplication.getClass();
        eventHub.getClass();
        d31Var.getClass();
        this.n = au6Var;
        this.f1141o = remoteControlApplication;
        this.p = eventHub;
        this.q = d31Var;
    }

    public j93(xd4 xd4Var, ps4 ps4Var) {
        this.m = (byte) 27;
        ps4Var.getClass();
        this.n = xd4Var;
        this.f1141o = ps4Var;
        this.p = xd4Var.b(new a55(this, (byte) 0));
        this.q = xd4Var.b(new a55(this, (byte) 1));
    }

    public j93(xt6 xt6Var) {
        this.m = (byte) 2;
        this.n = new io.sentry.p7(this, (byte) 17);
        this.f1141o = new e6(this);
        byte b = 0;
        this.p = new b6(this, b);
        this.q = new c6(b);
        ((zt6) xt6Var).d(new d6(this, b));
    }

    public j93(Context context) {
        this.m = (byte) 23;
        context.getClass();
        this.n = context;
        final byte b = 0;
        this.f1141o = new kh7(new Function0(this) { // from class: o.zc4
            public final /* synthetic */ j93 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                j93 j93Var = this.n;
                switch (b2) {
                    case 0:
                        return ((DisplayManager) ((Context) j93Var.n).getSystemService(DisplayManager.class)).getDisplay(0);
                    case 1:
                        int i = Build.VERSION.SDK_INT;
                        Context context2 = (Context) j93Var.n;
                        if (i < 30) {
                            Object systemService = context2.getSystemService("window");
                            systemService.getClass();
                            return (WindowManager) systemService;
                        }
                        try {
                            Display display = (Display) ((kh7) j93Var.f1141o).getValue();
                            display.getClass();
                            return (WindowManager) context2.createDisplayContext(display).createWindowContext(2, null).getSystemService(WindowManager.class);
                        } catch (Exception unused) {
                            Object systemService2 = context2.getSystemService("window");
                            systemService2.getClass();
                            return (WindowManager) systemService2;
                        }
                    case 2:
                        Object systemService3 = ((Context) j93Var.n).getSystemService("uimode");
                        systemService3.getClass();
                        return Boolean.valueOf(((UiModeManager) systemService3).getCurrentModeType() == 4);
                    default:
                        String str = Build.MANUFACTURER;
                        str.getClass();
                        return Boolean.valueOf(ub7.Q(str, "sony", true) && j93Var.W());
                }
            }
        });
        final byte b2 = 1;
        this.p = new kh7(new Function0(this) { // from class: o.zc4
            public final /* synthetic */ j93 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                j93 j93Var = this.n;
                switch (b3) {
                    case 0:
                        return ((DisplayManager) ((Context) j93Var.n).getSystemService(DisplayManager.class)).getDisplay(0);
                    case 1:
                        int i = Build.VERSION.SDK_INT;
                        Context context2 = (Context) j93Var.n;
                        if (i < 30) {
                            Object systemService = context2.getSystemService("window");
                            systemService.getClass();
                            return (WindowManager) systemService;
                        }
                        try {
                            Display display = (Display) ((kh7) j93Var.f1141o).getValue();
                            display.getClass();
                            return (WindowManager) context2.createDisplayContext(display).createWindowContext(2, null).getSystemService(WindowManager.class);
                        } catch (Exception unused) {
                            Object systemService2 = context2.getSystemService("window");
                            systemService2.getClass();
                            return (WindowManager) systemService2;
                        }
                    case 2:
                        Object systemService3 = ((Context) j93Var.n).getSystemService("uimode");
                        systemService3.getClass();
                        return Boolean.valueOf(((UiModeManager) systemService3).getCurrentModeType() == 4);
                    default:
                        String str = Build.MANUFACTURER;
                        str.getClass();
                        return Boolean.valueOf(ub7.Q(str, "sony", true) && j93Var.W());
                }
            }
        });
        final byte b3 = 2;
        this.q = new kh7(new Function0(this) { // from class: o.zc4
            public final /* synthetic */ j93 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b4 = b3;
                j93 j93Var = this.n;
                switch (b4) {
                    case 0:
                        return ((DisplayManager) ((Context) j93Var.n).getSystemService(DisplayManager.class)).getDisplay(0);
                    case 1:
                        int i = Build.VERSION.SDK_INT;
                        Context context2 = (Context) j93Var.n;
                        if (i < 30) {
                            Object systemService = context2.getSystemService("window");
                            systemService.getClass();
                            return (WindowManager) systemService;
                        }
                        try {
                            Display display = (Display) ((kh7) j93Var.f1141o).getValue();
                            display.getClass();
                            return (WindowManager) context2.createDisplayContext(display).createWindowContext(2, null).getSystemService(WindowManager.class);
                        } catch (Exception unused) {
                            Object systemService2 = context2.getSystemService("window");
                            systemService2.getClass();
                            return (WindowManager) systemService2;
                        }
                    case 2:
                        Object systemService3 = ((Context) j93Var.n).getSystemService("uimode");
                        systemService3.getClass();
                        return Boolean.valueOf(((UiModeManager) systemService3).getCurrentModeType() == 4);
                    default:
                        String str = Build.MANUFACTURER;
                        str.getClass();
                        return Boolean.valueOf(ub7.Q(str, "sony", true) && j93Var.W());
                }
            }
        });
        final byte b4 = 3;
        new kh7(new Function0(this) { // from class: o.zc4
            public final /* synthetic */ j93 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b5 = b4;
                j93 j93Var = this.n;
                switch (b5) {
                    case 0:
                        return ((DisplayManager) ((Context) j93Var.n).getSystemService(DisplayManager.class)).getDisplay(0);
                    case 1:
                        int i = Build.VERSION.SDK_INT;
                        Context context2 = (Context) j93Var.n;
                        if (i < 30) {
                            Object systemService = context2.getSystemService("window");
                            systemService.getClass();
                            return (WindowManager) systemService;
                        }
                        try {
                            Display display = (Display) ((kh7) j93Var.f1141o).getValue();
                            display.getClass();
                            return (WindowManager) context2.createDisplayContext(display).createWindowContext(2, null).getSystemService(WindowManager.class);
                        } catch (Exception unused) {
                            Object systemService2 = context2.getSystemService("window");
                            systemService2.getClass();
                            return (WindowManager) systemService2;
                        }
                    case 2:
                        Object systemService3 = ((Context) j93Var.n).getSystemService("uimode");
                        systemService3.getClass();
                        return Boolean.valueOf(((UiModeManager) systemService3).getCurrentModeType() == 4);
                    default:
                        String str = Build.MANUFACTURER;
                        str.getClass();
                        return Boolean.valueOf(ub7.Q(str, "sony", true) && j93Var.W());
                }
            }
        });
    }

    public j93(Drawable.Callback callback) {
        this.m = (byte) 18;
        this.n = new fk3();
        this.f1141o = new HashMap();
        this.p = new HashMap();
        if (!(callback instanceof View)) {
            xe4.a("LottieDrawable must be inside of a view for images to work.");
            this.q = null;
        } else {
            this.q = ((View) callback).getContext().getAssets();
        }
    }

    public j93(byte b) {
        this.m = b;
        switch (b) {
            case ep1.c /* 10 */:
                this.n = new Intent("android.intent.action.VIEW");
                break;
            case 14:
                this.n = new vo5(10);
                this.f1141o = new a07(0);
                this.p = new ArrayList();
                this.q = new HashSet();
                break;
            case 15:
                this.f1141o = new ArrayDeque();
                this.p = new ArrayDeque();
                this.q = new ArrayDeque();
                break;
            case 20:
                this.n = new ArrayList();
                this.f1141o = new HashMap();
                this.p = new HashMap();
                break;
        }
    }

    public j93(Socket socket) {
        this.m = (byte) 12;
        this.n = socket;
        this.f1141o = new AtomicInteger();
        this.p = new dl1(this);
        this.q = new cl1(this);
    }

    public j93(hm2 hm2Var) {
        this.m = (byte) 0;
        this.m = (byte) 0;
        this.n = hm2Var;
        this.f1141o = r;
        this.p = new int[32];
    }

    public j93(ar arVar) {
        this.m = (byte) 26;
        this.n = arVar;
        this.f1141o = new r05();
        cb5.a();
        this.p = cb5.a();
        this.q = cb5.a();
    }

    public /* synthetic */ j93(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.m = b;
        this.n = obj;
        this.f1141o = obj2;
        this.p = obj3;
        this.q = obj4;
    }

    public j93(Typeface typeface, br4 br4Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.m = (byte) 24;
        this.q = typeface;
        this.n = br4Var;
        this.p = new cr4(1024);
        int iA = br4Var.a(6);
        if (iA != 0) {
            int i5 = iA + br4Var.m;
            i = ((ByteBuffer) br4Var.p).getInt(((ByteBuffer) br4Var.p).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f1141o = new char[i * 2];
        int iA2 = br4Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + br4Var.m;
            i2 = ((ByteBuffer) br4Var.p).getInt(((ByteBuffer) br4Var.p).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            z58 z58Var = new z58(this, i7);
            ar4 ar4VarB = z58Var.b();
            int iA3 = ar4VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) ar4VarB.p).getInt(iA3 + ar4VarB.m) : 0, (char[]) this.f1141o, i7 * 2);
            ar4 ar4VarB2 = z58Var.b();
            int iA4 = ar4VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + ar4VarB2.m;
                i3 = ((ByteBuffer) ar4VarB2.p).getInt(((ByteBuffer) ar4VarB2.p).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                cr4 cr4Var = (cr4) this.p;
                ar4 ar4VarB3 = z58Var.b();
                int iA5 = ar4VarB3.a(16);
                if (iA5 != 0) {
                    int i9 = iA5 + ar4VarB3.m;
                    i4 = ((ByteBuffer) ar4VarB3.p).getInt(((ByteBuffer) ar4VarB3.p).getInt(i9) + i9);
                } else {
                    i4 = 0;
                }
                cr4Var.a(z58Var, 0, i4 - 1);
            } else {
                hk0.g("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    public j93(cj3 cj3Var, bp4 bp4Var) {
        this.m = (byte) 1;
        this.q = cj3Var;
        this.m = (byte) 1;
        this.p = cj3Var;
        this.n = bp4Var;
        this.f1141o = new ArrayList();
    }

    public j93(File file, Context context, String str, wa2 wa2Var) {
        this.m = (byte) 16;
        this.n = file;
        this.f1141o = wa2Var;
        this.p = context;
        this.q = str;
    }

    public j93(d11 d11Var, sy4 sy4Var, io.sentry.android.core.d dVar) {
        this.m = (byte) 7;
        this.f1141o = d11Var;
        this.p = sy4Var;
        this.q = dVar;
        this.n = new ArrayList();
    }

    public j93(io.sentry.android.core.d dVar, j93 j93Var, ArrayList arrayList) {
        this.m = (byte) 6;
        this.f1141o = dVar;
        this.p = j93Var;
        this.q = arrayList;
        this.n = dVar;
    }

    public j93(Cipher cipher) {
        this.m = (byte) 8;
        this.n = null;
        this.f1141o = cipher;
        this.p = null;
        this.q = null;
    }

    public j93(wc wcVar) {
        this.m = (byte) 3;
        this.q = wcVar;
    }

    public j93(pp1 pp1Var) {
        this.m = (byte) 13;
        this.q = pp1Var;
        List list = pp1Var.q.F;
        list.getClass();
        int iQ = xm4.Q(mv0.Z(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iQ < 16 ? 16 : iQ);
        for (Object obj : list) {
            linkedHashMap.put(et1.C((ty4) pp1Var.x.b, ((dv5) obj).p), obj);
        }
        this.n = linkedHashMap;
        pp1 pp1Var2 = (pp1) this.q;
        this.f1141o = ((xd4) ((io.sentry.android.replay.screenshot.k) pp1Var2.x.a).a).c(new y2(this, pp1Var2, (byte) 7));
        xd4 xd4Var = (xd4) ((io.sentry.android.replay.screenshot.k) ((pp1) this.q).x.a).a;
        a3 a3Var = new a3(this, (byte) 8);
        xd4Var.getClass();
        this.p = new vd4(xd4Var, a3Var);
    }

    public j93(vh1 vh1Var, List list) {
        this.m = (byte) 11;
        this.q = vh1Var;
        this.n = new my4();
        this.f1141o = pm8.e();
        this.p = lv0.P0(list);
    }
}
