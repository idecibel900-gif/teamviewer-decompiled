package o;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.KeyCharacterMap;
import android.view.ViewConfiguration;
import com.teamviewer.dataencryptionlib.swig.settings.AndroidCryptoProtectDataCallbackHolder;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.NativeResources;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.logging.PublishLogFilesZipWorker;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.statistics.StatisticsEvent;
import com.teamviewer.teamviewerlib.swig.statistics.StatisticsHandlerFactory;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.AndroidKeyChainCallbackHolder;
import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;
import com.teamviewer.teamviewerlib.swig.tvconfigadapter.AppType;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public abstract class fi7 extends Application {
    public Locale m;

    public void a(boolean z) {
        if (z) {
            SharedPreferences sharedPreferences = h57.a;
            if (sharedPreferences == null) {
                im3.e0("sharedPreferences");
                throw null;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean("LOGIN_ON_STARTUP", true);
            editorEdit.apply();
        }
        SharedPreferences sharedPreferences2 = h57.a;
        if (sharedPreferences2 == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        fx3.q(sharedPreferences2, "KEY_SHOW_QS_APP_CARD", z);
        if (z) {
            Object systemService = getSystemService("device_policy");
            systemService.getClass();
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) systemService;
            List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
            if (activeAdmins != null) {
                Iterator<ComponentName> it = activeAdmins.iterator();
                while (it.hasNext()) {
                    String packageName = it.next().getPackageName();
                    packageName.getClass();
                    if (devicePolicyManager.isProfileOwnerApp(packageName)) {
                        StatisticsHandlerFactory.GetStatisticsHandler().ReportEvent(new StatisticsEvent(EventType.Event, false, "device-configuration", "mdm-user", ""));
                        break;
                    }
                }
            }
            SharedPreferences sharedPreferences3 = h57.a;
            if (sharedPreferences3 != null) {
                fx3.q(sharedPreferences3, "IS_FIRST_START_EVER", false);
            } else {
                im3.e0("sharedPreferences");
                throw null;
            }
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        ye4.a("TVApplication", "Configuration changed");
        Locale localeB = new ld4(new md4(configuration.getLocales())).b(0);
        if (localeB == null) {
            localeB = Locale.getDefault();
            localeB.getClass();
        }
        if (localeB.equals(this.m)) {
            return;
        }
        this.m = localeB;
        NativeResources.a.a(localeB);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:131:0x0303  */
    /* JADX WARN: Code duplicated, block: B:132:0x0309  */
    /* JADX WARN: Code duplicated, block: B:147:0x034e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0358  */
    /* JADX WARN: Code duplicated, block: B:159:0x038a  */
    /* JADX WARN: Code duplicated, block: B:164:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:177:0x040f  */
    /* JADX WARN: Code duplicated, block: B:178:0x041e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0437 A[Catch: IOException -> 0x04a5, TryCatch #8 {IOException -> 0x04a5, blocks: (B:181:0x042a, B:182:0x0431, B:184:0x0437, B:187:0x045b), top: B:419:0x042a }] */
    /* JADX WARN: Code duplicated, block: B:209:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:213:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:215:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:217:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:218:0x0502  */
    /* JADX WARN: Code duplicated, block: B:220:0x050a  */
    /* JADX WARN: Code duplicated, block: B:224:0x0514  */
    /* JADX WARN: Code duplicated, block: B:227:0x0537  */
    /* JADX WARN: Code duplicated, block: B:229:0x055b  */
    /* JADX WARN: Code duplicated, block: B:232:0x0599  */
    /* JADX WARN: Code duplicated, block: B:233:0x059c  */
    /* JADX WARN: Code duplicated, block: B:236:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:238:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:240:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:241:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:244:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:245:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:247:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:248:0x05da  */
    /* JADX WARN: Code duplicated, block: B:251:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:252:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:255:0x0620  */
    /* JADX WARN: Code duplicated, block: B:258:0x0649  */
    /* JADX WARN: Code duplicated, block: B:260:0x0656  */
    /* JADX WARN: Code duplicated, block: B:262:0x065d  */
    /* JADX WARN: Code duplicated, block: B:264:0x0664  */
    /* JADX WARN: Code duplicated, block: B:266:0x066b  */
    /* JADX WARN: Code duplicated, block: B:268:0x0672  */
    /* JADX WARN: Code duplicated, block: B:270:0x067b  */
    /* JADX WARN: Code duplicated, block: B:272:0x0688  */
    /* JADX WARN: Code duplicated, block: B:274:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:276:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:278:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:280:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:282:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:284:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:286:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:288:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:290:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:292:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:293:0x070b  */
    /* JADX WARN: Code duplicated, block: B:297:0x0715  */
    /* JADX WARN: Code duplicated, block: B:300:0x073b  */
    /* JADX WARN: Code duplicated, block: B:303:0x0749  */
    /* JADX WARN: Code duplicated, block: B:307:0x0772  */
    /* JADX WARN: Code duplicated, block: B:309:0x077b  */
    /* JADX WARN: Code duplicated, block: B:311:0x077f  */
    /* JADX WARN: Code duplicated, block: B:312:0x0797  */
    /* JADX WARN: Code duplicated, block: B:316:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:318:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:320:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:322:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:324:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:327:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:330:0x0813  */
    /* JADX WARN: Code duplicated, block: B:331:0x0830  */
    /* JADX WARN: Code duplicated, block: B:335:0x0861  */
    /* JADX WARN: Code duplicated, block: B:338:0x087a A[LOOP:0: B:337:0x0878->B:338:0x087a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:341:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:348:0x0999  */
    /* JADX WARN: Code duplicated, block: B:350:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:353:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:356:0x0a32  */
    /* JADX WARN: Code duplicated, block: B:359:0x0aa3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:362:0x0aa8  */
    /* JADX WARN: Code duplicated, block: B:366:0x0ad2 A[Catch: NotFoundException -> 0x0ad8, TryCatch #7 {NotFoundException -> 0x0ad8, blocks: (B:364:0x0abc, B:366:0x0ad2, B:367:0x0ad5), top: B:417:0x0abc }] */
    /* JADX WARN: Code duplicated, block: B:367:0x0ad5 A[Catch: NotFoundException -> 0x0ad8, TRY_LEAVE, TryCatch #7 {NotFoundException -> 0x0ad8, blocks: (B:364:0x0abc, B:366:0x0ad2, B:367:0x0ad5), top: B:417:0x0abc }] */
    /* JADX WARN: Code duplicated, block: B:373:0x0c42  */
    /* JADX WARN: Code duplicated, block: B:378:0x0c67  */
    /* JADX WARN: Code duplicated, block: B:380:0x0c75  */
    /* JADX WARN: Code duplicated, block: B:382:0x0c7d  */
    /* JADX WARN: Code duplicated, block: B:384:0x0c85  */
    /* JADX WARN: Code duplicated, block: B:386:0x0c8d  */
    /* JADX WARN: Code duplicated, block: B:388:0x0c95  */
    /* JADX WARN: Code duplicated, block: B:390:0x0c9d  */
    /* JADX WARN: Code duplicated, block: B:407:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x0c4a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0c3c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x045b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x0456 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0182  */
    /* JADX WARN: Code duplicated, block: B:54:0x0197  */
    /* JADX WARN: Code duplicated, block: B:55:0x019d  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x0207  */
    /* JADX WARN: Code duplicated, block: B:71:0x0213  */
    /* JADX WARN: Code duplicated, block: B:74:0x0229  */
    /* JADX WARN: Code duplicated, block: B:75:0x022f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0241  */
    /* JADX WARN: Code duplicated, block: B:79:0x0248  */
    /* JADX WARN: Code duplicated, block: B:82:0x0252  */
    /* JADX WARN: Code duplicated, block: B:83:0x0259  */
    /* JADX WARN: Code duplicated, block: B:88:0x0273  */
    /* JADX WARN: Code duplicated, block: B:92:0x0289  */
    /* JADX WARN: Code duplicated, block: B:93:0x0291  */
    /* JADX WARN: Instruction removed from duplicated block: B:227:0x0537, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:229:0x055b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:338:0x087a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68, types: [com.teamviewer.teamviewerlib.NativeLibTvExt] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23, types: [o.zy4] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r45v0 */
    /* JADX WARN: Type inference failed for: r45v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r45v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Integer, java.lang.Number, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v62, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v68, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Application
    public void onCreate() {
        String[] strArrK;
        ye4 ye4Var;
        lu luVar;
        String str;
        Properties properties;
        String externalStorageState;
        String strN;
        String strN2;
        Boolean boolW0;
        String strN3;
        String strN4;
        String strN5;
        String strN6;
        Boolean boolW1;
        int[] iArrM;
        int[] iArrM2;
        String strN7;
        Boolean boolW2;
        String strN8;
        String strN9;
        String strN10;
        String strN11;
        Object objO;
        ?? r18;
        String strN12;
        String strN13;
        Object objO2;
        String strN14;
        Object objO3;
        String strN15;
        String strN16;
        Boolean bool;
        ?? r9;
        String str2;
        ?? r6;
        ?? r7;
        Boolean bool2;
        String str3;
        File file;
        StringBuilder sb;
        String str4;
        String str5;
        String[] strArr;
        int[] iArr;
        String message;
        ZipFile zipFile;
        Enumeration<? extends ZipEntry> enumerationEntries;
        ZipEntry zipEntry;
        String name;
        String str6;
        ?? r0;
        Context applicationContext;
        Locale locale;
        File filesDir;
        File cacheDir;
        File externalFilesDir;
        String str7;
        ApplicationInfo applicationInfo;
        int i;
        Context applicationContext2;
        String string;
        boolean z;
        boolean zIsExternalStorageManager;
        ProxyInfo defaultProxy;
        Object obj;
        ?? r45;
        ProxyInfo defaultProxy2;
        int port;
        ?? zy4Var;
        String host;
        String absolutePath;
        RemoteControlApplication remoteControlApplication;
        Settings.Companion companion;
        Settings settingsN;
        SharedPreferences sharedPreferences;
        byte b;
        SharedPreferences sharedPreferences2;
        boolean z2;
        SharedPreferences sharedPreferences3;
        String string2;
        String strValueOf;
        String strM;
        String property;
        StringBuilder sb2;
        int i2;
        String string3;
        String str8;
        StringBuilder sbP;
        String str9;
        io.sentry.android.core.n1 n1Var;
        gv6 gv6Var;
        Context applicationContext3;
        DisplayMetrics displayMetrics;
        double dAbs;
        double dSqrt;
        boolean zDeviceHasKey;
        boolean z3;
        o53 o53Var;
        NotificationManager notificationManager;
        SharedPreferences sharedPreferences4;
        SharedPreferences sharedPreferences5;
        SharedPreferences sharedPreferences6;
        Context applicationContext4;
        SharedPreferences sharedPreferences7;
        ?? r10;
        boolean z4;
        io.sentry.android.core.performance.f fVar = io.sentry.android.core.performance.f.L;
        long jUptimeMillis = SystemClock.uptimeMillis();
        io.sentry.android.core.performance.f fVarC = io.sentry.android.core.performance.f.c();
        io.sentry.android.core.performance.g gVar = fVarC.r;
        if (gVar.f123o == 0) {
            gVar.f(jUptimeMillis);
            fVarC.h(this);
        }
        super.onCreate();
        Resources resources = getResources();
        resources.getClass();
        n37.a = resources.getBoolean(R.bool.tv_isRemoteControl);
        n37.b = resources.getBoolean(R.bool.tv_isQuickSupport);
        n37.c = resources.getBoolean(R.bool.tv_isHost);
        n37.d = resources.getBoolean(R.bool.tv_isPilot);
        boolean z5 = resources.getBoolean(R.bool.tv_isPilotLite);
        n37.e = z5;
        String str10 = "CL";
        if (n37.b) {
            str10 = "QS";
        } else if (n37.c) {
            str10 = "HM";
        } else if (!n37.a) {
            if (n37.d) {
                str10 = "AR";
            } else if (z5) {
                str10 = "PL";
            }
        }
        n37.f = "15.83.298 ".concat(str10);
        qi7.g = new qi7(this);
        io.sentry.android.core.n1.q = new io.sentry.android.core.n1(this);
        Context applicationContext5 = getApplicationContext();
        applicationContext5.getClass();
        Context applicationContext6 = applicationContext5.getApplicationContext();
        SharedPreferences sharedPreferences8 = applicationContext6.getSharedPreferences(applicationContext6.getPackageName() + "_preferences", 0);
        sharedPreferences8.getClass();
        h57.a = sharedPreferences8;
        try {
            yl7.m(this, "files.zip");
        } catch (IllegalArgumentException unused) {
            ye4.a("TVApplication", "PublishLogFiles failed. Scheduling with work manager.");
            nm8 nm8VarA = nm8.a(this);
            ep3 ep3Var = new ep3(PublishLogFilesZipWorker.class, (byte) 8);
            TimeUnit.MILLISECONDS.getClass();
            ((xm8) ep3Var.f733o).g = 5000L;
            if (Long.MAX_VALUE - System.currentTimeMillis() <= ((xm8) ep3Var.f733o).g) {
                hk0.g("The given initial delay is too large and will cause an overflow!");
                return;
            }
            new dm8(nm8VarA, "PublishLogFilesZipWorker", gf2.m, qf0.K(ep3Var.g())).a();
        }
        yq4 yq4Var = new yq4((byte) 19);
        a65 a65Var = new a65((byte) 13);
        a65Var.f302o = yq4Var;
        a65Var.H0(getApplicationContext(), "c++_shared");
        jk7 jk7Var = kk7.f1275o;
        synchronized (jk7Var) {
            synchronized (jk7Var) {
                kk7 kk7Var = kk7.p;
                strArrK = null;
                z4 = false;
                if (kk7Var != null) {
                    Thread.setDefaultUncaughtExceptionHandler(kk7Var.n);
                    kk7.p = null;
                }
            }
            ye4Var = ye4.a;
            luVar = new lu(this);
            synchronized (ye4Var) {
                ye4.b = luVar;
            }
            ye4.a("App startup", "TeamViewer startup");
            Context applicationContext7 = getApplicationContext();
            applicationContext7.getClass();
            d82.M = applicationContext7;
            str = "unknown";
            properties = new Properties();
            pm8.x(properties, new File(getFilesDir(), "customsettings.cfg"));
            try {
                externalStorageState = Environment.getExternalStorageState();
                externalStorageState.getClass();
            } catch (NullPointerException unused2) {
                ye4.c("StorageHelper", "external storage check failed");
                externalStorageState = "unknown";
            }
            if ("mounted".equals(externalStorageState)) {
                pm8.x(properties, new File(getExternalFilesDir(null), "customsettings.cfg"));
                ye4.a("ServiceManager", "verified");
            } else {
                try {
                    String externalStorageState2 = Environment.getExternalStorageState();
                    externalStorageState2.getClass();
                    str = externalStorageState2;
                } catch (NullPointerException unused3) {
                    ye4.c("StorageHelper", "external storage check failed");
                }
                if ("mounted_ro".equals(str)) {
                    pm8.x(properties, new File(getExternalFilesDir(null), "customsettings.cfg"));
                    ye4.a("ServiceManager", "verified");
                } else {
                    ye4.a("ServiceManager", "startup");
                }
            }
            strN = mo8.n("serverenvironment", properties);
            strN2 = mo8.n("usetestmaster", properties);
            if (strN2 != null) {
                boolW0 = ub7.w0(strN2);
            } else {
                boolW0 = null;
            }
            strN3 = mo8.n("customrouter", properties);
            strN4 = mo8.n("keepaliveservername", properties);
            strN5 = mo8.n("clientstatisticsdebug", properties);
            strN6 = mo8.n("useverboselogging", properties);
            if (strN6 != null) {
                boolW1 = ub7.w0(strN6);
            } else {
                boolW1 = null;
            }
            iArrM = mo8.m("whitelistaccounts", properties);
            iArrM2 = mo8.m("whitelistcompanies", properties);
            strN7 = mo8.n("mdv2enable", properties);
            if (strN7 != null) {
                boolW2 = ub7.w0(strN7);
            } else {
                boolW2 = null;
            }
            strN8 = mo8.n("conditionalaccessservers", properties);
            if (strN8 != null) {
                strArrK = o67.k(o67.m(strN8));
            }
            strN9 = mo8.n("configurationurl", properties);
            strN10 = mo8.n("revisionurl", properties);
            strN11 = mo8.n("consoleurlprefix", properties);
            if (strN11 != null) {
                objO = bc7.O(strN11);
            } else {
                objO = strArrK;
            }
            r18 = objO;
            strN12 = mo8.n("webapiurlprefix", properties);
            strN13 = mo8.n("authHostUrlPrefix", properties);
            if (strN13 != null) {
                objO2 = bc7.O(strN13);
            } else {
                objO2 = strArrK;
            }
            strN14 = mo8.n("oneapigateway", properties);
            if (strN14 != null) {
                objO3 = bc7.O(strN14);
            } else {
                objO3 = strArrK;
            }
            strN15 = mo8.n("oneapigatewaycustomhost", properties);
            strN16 = mo8.n("byocconfigurationjson", properties);
            if (strN == null && strN.length() != 0) {
                ye4Var.g("ServiceManager", "Using server environment ".concat(strN));
            }
            bool = Boolean.TRUE;
            if (im3.n(boolW0, bool)) {
                ye4Var.g("ServiceManager", "Using test master key");
            }
            if (strN3 != null && strN3.length() != 0) {
                ye4Var.g("ServiceManager", "Using router ".concat(strN3));
            }
            if (strN4 != null && strN4.length() != 0) {
                ye4Var.g("ServiceManager", "Using keep alive ".concat(strN4));
            }
            if (strN5 != null && strN5.length() != 0) {
                ye4Var.g("ServiceManager", "Using statistics ".concat(strN5));
            }
            if (im3.n(boolW1, bool)) {
                ye4Var.g("ServiceManager", "Using verbose logging");
            }
            if (iArrM != null && iArrM.length != 0) {
                ye4Var.g("ServiceManager", "Whitelist accounts");
            }
            if (iArrM2 != null && iArrM2.length != 0) {
                ye4Var.g("ServiceManager", "Whitelist companies");
            }
            if (im3.n(boolW2, bool)) {
                ye4.a("ServiceManager", "ManagedDevice V2 enabled");
            }
            if (strArrK != null && strArrK.length != 0) {
                if (cx.B0("127.0.0.1", strArrK)) {
                    ye4Var.g("ServiceManager", "Accepting Direct LAN/LAN Only connections");
                } else {
                    ye4Var.g("ServiceManager", "Using Conditional Access Servers");
                }
            }
            if (strN9 != null && strN9.length() != 0) {
                ye4Var.g("ServiceManager", "Using configuration url ".concat(strN9));
            }
            if (strN10 != null && strN10.length() != 0) {
                ye4Var.g("ServiceManager", "Using revision url ".concat(strN10));
            }
            if (r18 != 0 || r18.intValue() == 0) {
                r9 = r18;
            } else {
                ?? sb3 = new StringBuilder("Using console url prefix ");
                r10 = r18;
                sb3.append(r10);
                ye4Var.g("ServiceManager", sb3.toString());
            }
            if (strN12 != null || strN12.length() == 0) {
                r9 = r10;
                r9 = r10;
                str2 = strN12;
            } else {
                r9 = r10;
                str2 = strN12;
                ye4Var.g("ServiceManager", "Using webapi url prefix ".concat(str2));
            }
            r6 = objO2;
            if (r6 == 0 && r6.intValue() != 0) {
                ye4.a("ServiceManager", "Using authHost URL type " + r6);
            }
            r7 = objO3;
            if (r7 == 0 && r7.intValue() != 0) {
                ye4.a("ServiceManager", "Using oneApi Gateway type " + r7);
            }
            if (strN15 != null && strN15.length() != 0) {
                ye4.a("ServiceManager", "Using oneApi Gateway Custom Host ".concat(strN15));
            }
            if (strN16 != 0 && strN16.length() != 0) {
                ye4.a("ServiceManager", "Using BYOC configuration from custom settings");
            }
            Context applicationContext8 = getApplicationContext();
            applicationContext8.getClass();
            bool2 = boolW2;
            ye4.a("NativeLibExt", "Loading RemoteControl");
            an4 an4Var = new an4((byte) 3);
            str3 = str2;
            a65 a65Var2 = new a65((byte) 13);
            a65Var2.f302o = an4Var;
            a65Var2.H0(applicationContext8, "RemoteControl");
            NativeLibTvExt.c = true;
            file = new File(applicationContext8.getApplicationInfo().sourceDir);
            if (file.exists()) {
                sb = new StringBuilder("<br /><br /><span style=\"color:rgb(0,0,240)\">Contained libraries: <br />");
                try {
                    str5 = strN10;
                    try {
                        zipFile = new ZipFile(file, 1);
                        enumerationEntries = zipFile.entries();
                        while (enumerationEntries.hasMoreElements()) {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            zipEntryNextElement.getClass();
                            zipEntry = zipEntryNextElement;
                            zipFile = zipFile;
                            name = zipEntry.getName();
                            name.getClass();
                            enumerationEntries = enumerationEntries;
                            if (!bc7.G(false, name, ".so")) {
                                String name2 = zipEntry.getName();
                                str6 = strN9;
                                try {
                                    iArr = iArrM2;
                                    str4 = str6;
                                    try {
                                        strArr = strArrK;
                                        try {
                                            sb.append(name2 + "\t" + zipEntry.getSize() + "\t" + zipEntry.getCrc() + "<br />");
                                            strArrK = strArr;
                                            iArrM2 = iArr;
                                            strN9 = str4;
                                        } catch (IOException e) {
                                            e = e;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            ye4.c("NativeLibExt", message);
                                            AndroidCryptoProtectDataCallbackHolder.SetAndroidCryptoProtectDataCallback(if1.a);
                                            r0 = NativeLibTvExt.a;
                                            applicationContext = getApplicationContext();
                                            applicationContext.getClass();
                                            locale = Locale.getDefault();
                                            filesDir = applicationContext.getFilesDir();
                                            if (filesDir != null) {
                                                cacheDir = applicationContext.getCacheDir();
                                                if (cacheDir == null) {
                                                    ye4.c("NativeLibExt", "init: internalCacheDir is null");
                                                } else {
                                                    externalFilesDir = applicationContext.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                                                    if (externalFilesDir != null) {
                                                        str7 = "";
                                                    } else {
                                                        str7 = "";
                                                    }
                                                    applicationInfo = applicationContext.getApplicationInfo();
                                                    applicationInfo.getClass();
                                                    i = Build.VERSION.SDK_INT;
                                                    applicationContext2 = applicationContext.getApplicationContext();
                                                    applicationContext2.getClass();
                                                    string = Build.SERIAL;
                                                    string.getClass();
                                                    if (applicationInfo.targetSdkVersion > 25) {
                                                        string = applicationContext2.getSharedPreferences(applicationContext2.getPackageName() + "_preferences", 0).getString("DEVICE_SERIAL_NUMBER", "");
                                                        string.getClass();
                                                    } else {
                                                        SharedPreferences sharedPreferences9 = applicationContext2.getSharedPreferences(applicationContext2.getPackageName() + "_preferences", 0);
                                                        sharedPreferences9.getClass();
                                                        SharedPreferences.Editor editorEdit = sharedPreferences9.edit();
                                                        editorEdit.getClass();
                                                        editorEdit.putString("DEVICE_SERIAL_NUMBER", string);
                                                        editorEdit.apply();
                                                    }
                                                    String str11 = string;
                                                    String string4 = android.provider.Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
                                                    if (hm3.h(applicationContext, "android.permission.RECORD_AUDIO") == 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (i > 29) {
                                                        zIsExternalStorageManager = Environment.isExternalStorageManager();
                                                    } else if (hm3.h(applicationContext, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                                                        zIsExternalStorageManager = true;
                                                    } else {
                                                        zIsExternalStorageManager = false;
                                                    }
                                                    boolean z6 = zIsExternalStorageManager;
                                                    boolean zHasSystemFeature = applicationContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
                                                    Object systemService = applicationContext.getSystemService("connectivity");
                                                    systemService.getClass();
                                                    defaultProxy = ((ConnectivityManager) systemService).getDefaultProxy();
                                                    if (defaultProxy != null) {
                                                        host = defaultProxy.getHost();
                                                    } else {
                                                        obj = strArrK;
                                                    }
                                                    if (obj == null) {
                                                        obj = host;
                                                        r45 = "";
                                                    } else {
                                                        obj = host;
                                                        r45 = obj;
                                                    }
                                                    Object systemService2 = applicationContext.getSystemService("connectivity");
                                                    systemService2.getClass();
                                                    defaultProxy2 = ((ConnectivityManager) systemService2).getDefaultProxy();
                                                    if (defaultProxy2 != null) {
                                                        port = defaultProxy2.getPort();
                                                    } else {
                                                        port = 0;
                                                    }
                                                    Point pointT = new j93(applicationContext).T();
                                                    zy4Var = new zy4(filesDir.getAbsolutePath(), cacheDir.getAbsolutePath(), str7, locale.getLanguage(), locale.getCountry(), string4, str11, z, z6, zHasSystemFeature, r45, port, pointT.x, pointT.y);
                                                }
                                                if (zy4Var != 0) {
                                                    r0.d(zy4Var, strN);
                                                }
                                                remoteControlApplication = (RemoteControlApplication) this;
                                                remoteControlApplication.C = new ye1(new wk0(remoteControlApplication, (byte) 26), AppType.RemoteControl, remoteControlApplication.d(), new y46((Object) remoteControlApplication, (byte) 5));
                                                companion = Settings.i;
                                                settingsN = companion.n();
                                                if (boolW0 != 0) {
                                                    Settings.k(gv6.MACHINE, ov6.P_USE_TESTMASTER_KEYS, boolW0.booleanValue());
                                                }
                                                if (strN3 != null) {
                                                    Settings.h(rt0.P_CUSTOM_ROUTER, strN3);
                                                }
                                                if (strN4 != null) {
                                                    Settings.h(rt0.P_CUSTOM_KEEPALIVESERVER, strN4);
                                                }
                                                if (strN5 != null) {
                                                    Settings.h(rt0.P_CLIENT_STATISTICS_DEBUG, strN5);
                                                }
                                                if (iArrM != null) {
                                                    Settings.i(rt0.P_SECURITY_WHITELIST_BUDDY_ACCOUNT_ID, iArrM);
                                                }
                                                if (iArr != null) {
                                                    Settings.i(rt0.P_SECURITY_WHITELIST_COMPANY_ID, iArr);
                                                }
                                                if (bool2 != null) {
                                                    Settings.k(gv6.MACHINE, rt0.P_MDV2_UI_SWITCH, bool2.booleanValue());
                                                }
                                                if (strArr != null) {
                                                    gv6 gv6Var2 = gv6.MACHINE;
                                                    Settings.l(strArr);
                                                    boolean zB0 = cx.B0("127.0.0.1", strArr);
                                                    Settings.k(gv6Var2, rt0.P_GENERAL_LAN_ONLY, zB0);
                                                    Settings.k(gv6Var2, rt0.P_GENERAL_DIRECTLAN, zB0);
                                                }
                                                if (str4 != null) {
                                                    Settings.h(rt0.P_CONFIGURATION_URL, str4);
                                                }
                                                if (str5 != null) {
                                                    Settings.h(rt0.P_REVISION_URL, str5);
                                                }
                                                if (r9 != 0) {
                                                    Settings.j(gv6.MACHINE, rt0.P_CONSOLE_URL_PREFIX, r9.intValue());
                                                }
                                                if (str3 != null) {
                                                    Settings.h(rt0.P_WEBAPI_URL_PREFIX, str3);
                                                }
                                                if (r6 != 0) {
                                                    Settings.j(gv6.CLIENT, rt0.P_AUTHHOST_URL_PREFIX, r6.intValue());
                                                }
                                                if (r7 != 0) {
                                                    Settings.j(gv6.MACHINE, rt0.P_ONEAPI_GATEWAY, r7.intValue());
                                                }
                                                if (strN15 != null) {
                                                    Settings.h(rt0.P_ONEAPI_GATEWAY_CUSTOMHOST, strN15);
                                                }
                                                if (strN16 != 0) {
                                                    kh.k(settingsN, strN16);
                                                }
                                                if (boolW1 != 0) {
                                                    sharedPreferences7 = h57.a;
                                                    if (sharedPreferences7 != null) {
                                                        im3.e0("sharedPreferences");
                                                        throw strArrK;
                                                    }
                                                    SharedPreferences.Editor editorEdit2 = sharedPreferences7.edit();
                                                    editorEdit2.getClass();
                                                    editorEdit2.putBoolean("VERBOSE_LOGGING", boolW1.booleanValue());
                                                    editorEdit2.apply();
                                                }
                                                sharedPreferences = h57.a;
                                                if (sharedPreferences != null) {
                                                    im3.e0("sharedPreferences");
                                                    throw strArrK;
                                                }
                                                ye4.a.h(sharedPreferences.getBoolean("VERBOSE_LOGGING", false));
                                                new wv6(this, companion.n(), new yl7((byte) 28));
                                                b = 4;
                                                if (r0.f()) {
                                                    applicationContext4 = remoteControlApplication.getApplicationContext();
                                                    applicationContext4.getClass();
                                                    if (r0.f()) {
                                                        Context applicationContext9 = applicationContext4.getApplicationContext();
                                                        applicationContext9.getClass();
                                                        au8.V0 = applicationContext9.getApplicationContext();
                                                        AndroidKeyChainCallbackHolder.SetAndroidKeyChainCallback(wi.a);
                                                    }
                                                    tk1 tk1Var = g22.a;
                                                    im3.R(hm3.c(gk1.f901o), null, null, new y0(remoteControlApplication, z4 ? 1 : 0, b), 3);
                                                }
                                                sharedPreferences2 = h57.a;
                                                if (sharedPreferences2 != null) {
                                                    im3.e0("sharedPreferences");
                                                    throw null;
                                                }
                                                z2 = sharedPreferences2.getBoolean("IS_FIRST_START_EVER", true);
                                                if (z2) {
                                                    sharedPreferences6 = h57.a;
                                                    if (sharedPreferences6 != null) {
                                                        im3.e0("sharedPreferences");
                                                        throw null;
                                                    }
                                                    SharedPreferences.Editor editorEdit3 = sharedPreferences6.edit();
                                                    editorEdit3.getClass();
                                                    editorEdit3.putInt("INPUT_METHOD_INT", 0);
                                                    editorEdit3.putString("PREFERRED_RESOLUTION", "DontChange");
                                                    editorEdit3.apply();
                                                }
                                                sharedPreferences3 = h57.a;
                                                if (sharedPreferences3 != null) {
                                                    im3.e0("sharedPreferences");
                                                    throw null;
                                                }
                                                if (sharedPreferences3.getInt("BUILD_VERSION", 0) < 298) {
                                                    SharedPreferences.Editor editorEdit4 = sharedPreferences3.edit();
                                                    editorEdit4.getClass();
                                                    editorEdit4.putInt("BUILD_VERSION", 298);
                                                    editorEdit4.apply();
                                                    if (!z2) {
                                                        sharedPreferences5 = h57.a;
                                                        if (sharedPreferences5 != null) {
                                                            im3.e0("sharedPreferences");
                                                            throw null;
                                                        }
                                                        if (sharedPreferences5.contains("REMOVE_WALLPAPER")) {
                                                            boolean z7 = sharedPreferences5.getBoolean("REMOVE_WALLPAPER", true);
                                                            companion.n();
                                                            Settings.k(gv6.USER, ca8.P_REMOTE_REMOVEWALLPAPER, z7);
                                                            SharedPreferences.Editor editorEdit5 = sharedPreferences5.edit();
                                                            editorEdit5.getClass();
                                                            editorEdit5.remove("REMOVE_WALLPAPER");
                                                            editorEdit5.apply();
                                                        }
                                                        if (sharedPreferences5.contains("SHOW_REMOTE_CURSOR")) {
                                                            boolean z8 = sharedPreferences5.getBoolean("SHOW_REMOTE_CURSOR", false);
                                                            companion.n();
                                                            Settings.k(gv6.USER, ca8.P_REMOTE_REMOTECURSOR, z8);
                                                            SharedPreferences.Editor editorEdit6 = sharedPreferences5.edit();
                                                            editorEdit6.getClass();
                                                            editorEdit6.remove("SHOW_REMOTE_CURSOR");
                                                            editorEdit6.apply();
                                                        }
                                                        if (sharedPreferences5.contains("ENABLE_REMOTE_AUDIO")) {
                                                            boolean z9 = sharedPreferences5.getBoolean("ENABLE_REMOTE_AUDIO", true);
                                                            companion.n();
                                                            Settings.k(gv6.USER, ca8.P_REMOTEAUDIO_RECEIVE_ENABLED, z9);
                                                            SharedPreferences.Editor editorEdit7 = sharedPreferences5.edit();
                                                            editorEdit7.getClass();
                                                            editorEdit7.remove("ENABLE_REMOTE_AUDIO");
                                                            editorEdit7.apply();
                                                        }
                                                    }
                                                }
                                                Settings settingsN2 = companion.n();
                                                string2 = Settings.e().toString();
                                                string2.getClass();
                                                strValueOf = String.valueOf(10000);
                                                strM = ua5.m("And", Build.VERSION.RELEASE);
                                                if (strM.length() > 10) {
                                                    strM = strM.substring(0, 10);
                                                }
                                                property = System.getProperty("os.arch");
                                                sb2 = new StringBuilder();
                                                String[] strArr2 = Build.SUPPORTED_ABIS;
                                                strArr2.getClass();
                                                for (String str12 : strArr2) {
                                                    sb2.append(str12 + " ");
                                                }
                                                string3 = sb2.toString();
                                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US);
                                                Object objClone = settingsN2.h.clone();
                                                objClone.getClass();
                                                String str13 = simpleDateFormat.format((Date) objClone);
                                                str8 = simpleDateFormat.format(new Date(Build.TIME));
                                                sbP = ua5.p("<br /><br /><br /><span style=\"color:rgb(0,0,240)\">  TeamViewer start: ", str13, "<br />  Version: ");
                                                str9 = n37.f;
                                                if (str9 != null) {
                                                    im3.e0("versionString");
                                                    throw null;
                                                }
                                                e41.t(sbP, str9, "(298)<br />  ID:      ", string2, "<br />  License: ");
                                                e41.t(sbP, strValueOf, "<br />  OS:      ", strM, "<br />  Arch:    ");
                                                e41.t(sbP, property, "<br />  Abis:    ", string3, "<br /><br />  Device:  <br />");
                                                try {
                                                    sbP.append("  Model:\t  ");
                                                    sbP.append(Build.MODEL);
                                                    sbP.append("<br />");
                                                    sbP.append("  Release:  ");
                                                    sbP.append(ad8.a());
                                                    sbP.append("<br />");
                                                    sbP.append("  Board:\t  ");
                                                    sbP.append(Build.BOARD);
                                                    sbP.append("<br />");
                                                    sbP.append("  Brand:\t  ");
                                                    sbP.append(Build.BRAND);
                                                    sbP.append("<br />");
                                                    sbP.append("  Device:\t  ");
                                                    sbP.append(Build.DEVICE);
                                                    sbP.append("<br />");
                                                    sbP.append("  Display:\t  ");
                                                    sbP.append(Build.DISPLAY);
                                                    sbP.append("<br />");
                                                    sbP.append("  Fingerprint: ");
                                                    sbP.append(Build.FINGERPRINT);
                                                    sbP.append("<br />");
                                                    sbP.append("  Host:\t      ");
                                                    sbP.append(Build.HOST);
                                                    sbP.append("<br />");
                                                    sbP.append("  ID:\t      ");
                                                    sbP.append(Build.ID);
                                                    sbP.append("<br />");
                                                    sbP.append("  Product:\t  ");
                                                    sbP.append(Build.PRODUCT);
                                                    sbP.append("<br />");
                                                    sbP.append("  Tags:\t      ");
                                                    sbP.append(Build.TAGS);
                                                    sbP.append("<br />");
                                                    sbP.append("  Time:\t      ");
                                                    sbP.append(str8);
                                                    sbP.append("<br />");
                                                    sbP.append("  Type:\t      ");
                                                    sbP.append(Build.TYPE);
                                                    sbP.append("<br />");
                                                } catch (Exception e2) {
                                                    ye4.d("VersionInfo:", e2);
                                                }
                                                sbP.append("  </span><br /><br /><br />");
                                                ye4.a("VersionInfo:", sbP.toString());
                                                n1Var = io.sentry.android.core.n1.q;
                                                if (n1Var != null) {
                                                    im3.e0("instance");
                                                    throw null;
                                                }
                                                n1Var.k();
                                                Settings.i.n();
                                                gv6Var = gv6.MACHINE;
                                                if (Settings.b(gv6Var, ov6.P_MID_VERSION) < 2) {
                                                    ye4.a.g("TVApplication", "Forcing MID version update");
                                                    ov6 ov6Var = ov6.P_MID_FORCE_UPDATE;
                                                    Settings.j(gv6Var, ov6Var, Settings.b(gv6Var, ov6Var) | 1);
                                                }
                                                ye4.a("App startup", "Network startup");
                                                BackendContainerAndroid.GetInstance().GetFrontendDispatcher();
                                                applicationContext3 = getApplicationContext();
                                                applicationContext3.getClass();
                                                j93 j93Var = new j93(applicationContext3);
                                                Point pointT2 = j93Var.T();
                                                ye4.a("LocalConstraints", "Display is " + pointT2.x + "x" + pointT2.y);
                                                displayMetrics = applicationContext3.getResources().getDisplayMetrics();
                                                float f = (float) displayMetrics.widthPixels;
                                                float f2 = displayMetrics.xdpi;
                                                double d = (double) (f / f2);
                                                double d2 = displayMetrics.heightPixels / displayMetrics.ydpi;
                                                dAbs = Math.abs(f2 / displayMetrics.densityDpi);
                                                if (0.75d <= dAbs) {
                                                    int i3 = displayMetrics.widthPixels;
                                                    int i4 = displayMetrics.densityDpi;
                                                    double d3 = i3 / i4;
                                                    double d4 = displayMetrics.heightPixels / i4;
                                                    dSqrt = Math.sqrt((d4 * d4) + (d3 * d3));
                                                } else {
                                                    int i5 = displayMetrics.widthPixels;
                                                    int i6 = displayMetrics.densityDpi;
                                                    double d5 = i5 / i6;
                                                    double d6 = displayMetrics.heightPixels / i6;
                                                    dSqrt = Math.sqrt((d6 * d6) + (d5 * d5));
                                                }
                                                ye4.a("LocalConstraints", "ScreenDiagonal is " + dSqrt);
                                                ye4.a("LocalConstraints", "DPI is " + j93Var.R());
                                                ye4.a("LocalConstraints", "HardwareMenuButton is " + ViewConfiguration.get(applicationContext3).hasPermanentMenuKey());
                                                ye4.a("LocalConstraints", "AndroidTV is " + j93Var.W());
                                                zDeviceHasKey = KeyCharacterMap.deviceHasKey(4);
                                                boolean zDeviceHasKey2 = KeyCharacterMap.deviceHasKey(3);
                                                if (zDeviceHasKey) {
                                                    z3 = true;
                                                } else {
                                                    z3 = true;
                                                }
                                                ye4.a("LocalConstraints", "NavigationBar is " + z3);
                                                try {
                                                    if (applicationContext3.getResources().getBoolean(Resources.getSystem().getIdentifier("config_hasRecents", "bool", "android"))) {
                                                        o53Var = o53.n;
                                                    } else {
                                                        o53Var = o53.f1630o;
                                                    }
                                                } catch (Resources.NotFoundException unused4) {
                                                    ye4.c("LocalConstraints", "Could not find resource config_hasRecents");
                                                    o53Var = o53.m;
                                                }
                                                ye4.a("LocalConstraints", "RecentApps is " + o53Var);
                                                Uri uri = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
                                                AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
                                                String string5 = remoteControlApplication.getString(R.string.tv_general_notification_channel_name);
                                                string5.getClass();
                                                r55 r55Var = new r55(getApplicationContext());
                                                NotificationChannel notificationChannel = new NotificationChannel("TV_GENERAL_NOTIFICATION_CHANNEL", string5, 2);
                                                notificationChannel.setDescription(null);
                                                notificationChannel.setGroup(null);
                                                notificationChannel.setShowBadge(false);
                                                notificationChannel.setSound(uri, audioAttributes);
                                                notificationChannel.enableLights(false);
                                                notificationChannel.setLightColor(0);
                                                notificationChannel.setVibrationPattern(null);
                                                notificationChannel.enableVibration(false);
                                                r55Var.a.createNotificationChannel(notificationChannel);
                                                ArrayList<NotificationChannel> arrayList = new ArrayList();
                                                NotificationChannel notificationChannel2 = new NotificationChannel("TV_CHAT_MESSAGES_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_chat_channel_name), 3);
                                                notificationChannel2.setShowBadge(true);
                                                notificationChannel2.enableLights(true);
                                                notificationChannel2.enableVibration(true);
                                                notificationChannel2.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                                arrayList.add(notificationChannel2);
                                                NotificationChannel notificationChannel3 = new NotificationChannel("TV_LICENSE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_license_notification_channel_name), 3);
                                                notificationChannel3.setDescription(remoteControlApplication.getString(R.string.tv_license_notification_channel_description));
                                                notificationChannel3.setShowBadge(true);
                                                notificationChannel3.enableVibration(true);
                                                arrayList.add(notificationChannel3);
                                                NotificationChannel notificationChannel4 = new NotificationChannel("TV_DEVICE_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_name), 4);
                                                notificationChannel4.setDescription(remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_description));
                                                notificationChannel4.setShowBadge(true);
                                                notificationChannel4.enableVibration(true);
                                                notificationChannel4.enableLights(true);
                                                notificationChannel4.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                                arrayList.add(notificationChannel4);
                                                NotificationChannel notificationChannel5 = new NotificationChannel("TV_MONITORING_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_name), 3);
                                                notificationChannel5.setDescription(remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_description));
                                                notificationChannel5.setShowBadge(true);
                                                notificationChannel5.enableVibration(true);
                                                notificationChannel5.enableLights(true);
                                                arrayList.add(notificationChannel5);
                                                NotificationChannel notificationChannel6 = new NotificationChannel("TV_CONDITIONAL_ACCESS_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_name), 4);
                                                notificationChannel6.setDescription(remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_description));
                                                notificationChannel6.setShowBadge(true);
                                                notificationChannel6.enableVibration(true);
                                                notificationChannel6.enableLights(true);
                                                notificationChannel6.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                                arrayList.add(notificationChannel6);
                                                NotificationChannel notificationChannel7 = new NotificationChannel("TV_TRUSTED_DEVICE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_name), 4);
                                                notificationChannel7.setDescription(remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_description));
                                                notificationChannel7.setShowBadge(true);
                                                notificationChannel7.enableVibration(true);
                                                notificationChannel7.enableLights(true);
                                                notificationChannel7.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                                arrayList.add(notificationChannel7);
                                                notificationManager = (NotificationManager) remoteControlApplication.getSystemService(NotificationManager.class);
                                                for (NotificationChannel notificationChannel8 : arrayList) {
                                                    if (notificationManager != null) {
                                                        notificationManager.createNotificationChannel(notificationChannel8);
                                                    }
                                                }
                                                c();
                                                b();
                                                ea7.a(this);
                                                bu7.CACHEDTHREADPOOL.a(new io.sentry.b5((Object) this, (byte) 25));
                                                sharedPreferences4 = h57.a;
                                                if (sharedPreferences4 != null) {
                                                    im3.e0("sharedPreferences");
                                                    throw null;
                                                }
                                                a(sharedPreferences4.getBoolean("IS_FIRST_START_EVER", true));
                                                io.sentry.android.core.performance.f.d(this);
                                            }
                                            ye4.c("NativeLibExt", "init: internalStorageDir is null.");
                                            zy4Var = strArrK;
                                            if (zy4Var != 0) {
                                                r0.d(zy4Var, strN);
                                            }
                                            remoteControlApplication = (RemoteControlApplication) this;
                                            remoteControlApplication.C = new ye1(new wk0(remoteControlApplication, (byte) 26), AppType.RemoteControl, remoteControlApplication.d(), new y46((Object) remoteControlApplication, (byte) 5));
                                            companion = Settings.i;
                                            settingsN = companion.n();
                                            if (boolW0 != 0) {
                                                Settings.k(gv6.MACHINE, ov6.P_USE_TESTMASTER_KEYS, boolW0.booleanValue());
                                            }
                                            if (strN3 != null) {
                                                Settings.h(rt0.P_CUSTOM_ROUTER, strN3);
                                            }
                                            if (strN4 != null) {
                                                Settings.h(rt0.P_CUSTOM_KEEPALIVESERVER, strN4);
                                            }
                                            if (strN5 != null) {
                                                Settings.h(rt0.P_CLIENT_STATISTICS_DEBUG, strN5);
                                            }
                                            if (iArrM != null) {
                                                Settings.i(rt0.P_SECURITY_WHITELIST_BUDDY_ACCOUNT_ID, iArrM);
                                            }
                                            if (iArr != null) {
                                                Settings.i(rt0.P_SECURITY_WHITELIST_COMPANY_ID, iArr);
                                            }
                                            if (bool2 != null) {
                                                Settings.k(gv6.MACHINE, rt0.P_MDV2_UI_SWITCH, bool2.booleanValue());
                                            }
                                            if (strArr != null) {
                                                gv6 gv6Var3 = gv6.MACHINE;
                                                Settings.l(strArr);
                                                boolean zB1 = cx.B0("127.0.0.1", strArr);
                                                Settings.k(gv6Var3, rt0.P_GENERAL_LAN_ONLY, zB1);
                                                Settings.k(gv6Var3, rt0.P_GENERAL_DIRECTLAN, zB1);
                                            }
                                            if (str4 != null) {
                                                Settings.h(rt0.P_CONFIGURATION_URL, str4);
                                            }
                                            if (str5 != null) {
                                                Settings.h(rt0.P_REVISION_URL, str5);
                                            }
                                            if (r9 != 0) {
                                                Settings.j(gv6.MACHINE, rt0.P_CONSOLE_URL_PREFIX, r9.intValue());
                                            }
                                            if (str3 != null) {
                                                Settings.h(rt0.P_WEBAPI_URL_PREFIX, str3);
                                            }
                                            if (r6 != 0) {
                                                Settings.j(gv6.CLIENT, rt0.P_AUTHHOST_URL_PREFIX, r6.intValue());
                                            }
                                            if (r7 != 0) {
                                                Settings.j(gv6.MACHINE, rt0.P_ONEAPI_GATEWAY, r7.intValue());
                                            }
                                            if (strN15 != null) {
                                                Settings.h(rt0.P_ONEAPI_GATEWAY_CUSTOMHOST, strN15);
                                            }
                                            if (strN16 != 0) {
                                                kh.k(settingsN, strN16);
                                            }
                                            if (boolW1 != 0) {
                                                sharedPreferences7 = h57.a;
                                                if (sharedPreferences7 != null) {
                                                    im3.e0("sharedPreferences");
                                                    throw strArrK;
                                                }
                                                SharedPreferences.Editor editorEdit8 = sharedPreferences7.edit();
                                                editorEdit8.getClass();
                                                editorEdit8.putBoolean("VERBOSE_LOGGING", boolW1.booleanValue());
                                                editorEdit8.apply();
                                            }
                                            sharedPreferences = h57.a;
                                            if (sharedPreferences != null) {
                                                im3.e0("sharedPreferences");
                                                throw strArrK;
                                            }
                                            ye4.a.h(sharedPreferences.getBoolean("VERBOSE_LOGGING", false));
                                            new wv6(this, companion.n(), new yl7((byte) 28));
                                            b = 4;
                                            if (r0.f()) {
                                                applicationContext4 = remoteControlApplication.getApplicationContext();
                                                applicationContext4.getClass();
                                                if (r0.f()) {
                                                    Context applicationContext10 = applicationContext4.getApplicationContext();
                                                    applicationContext10.getClass();
                                                    au8.V0 = applicationContext10.getApplicationContext();
                                                    AndroidKeyChainCallbackHolder.SetAndroidKeyChainCallback(wi.a);
                                                }
                                                tk1 tk1Var2 = g22.a;
                                                im3.R(hm3.c(gk1.f901o), null, null, new y0(remoteControlApplication, z4 ? 1 : 0, b), 3);
                                            }
                                            sharedPreferences2 = h57.a;
                                            if (sharedPreferences2 != null) {
                                                im3.e0("sharedPreferences");
                                                throw null;
                                            }
                                            z2 = sharedPreferences2.getBoolean("IS_FIRST_START_EVER", true);
                                            if (z2) {
                                                sharedPreferences6 = h57.a;
                                                if (sharedPreferences6 != null) {
                                                    im3.e0("sharedPreferences");
                                                    throw null;
                                                }
                                                SharedPreferences.Editor editorEdit9 = sharedPreferences6.edit();
                                                editorEdit9.getClass();
                                                editorEdit9.putInt("INPUT_METHOD_INT", 0);
                                                editorEdit9.putString("PREFERRED_RESOLUTION", "DontChange");
                                                editorEdit9.apply();
                                            }
                                            sharedPreferences3 = h57.a;
                                            if (sharedPreferences3 != null) {
                                                im3.e0("sharedPreferences");
                                                throw null;
                                            }
                                            if (sharedPreferences3.getInt("BUILD_VERSION", 0) < 298) {
                                                SharedPreferences.Editor editorEdit10 = sharedPreferences3.edit();
                                                editorEdit10.getClass();
                                                editorEdit10.putInt("BUILD_VERSION", 298);
                                                editorEdit10.apply();
                                                if (!z2) {
                                                    sharedPreferences5 = h57.a;
                                                    if (sharedPreferences5 != null) {
                                                        im3.e0("sharedPreferences");
                                                        throw null;
                                                    }
                                                    if (sharedPreferences5.contains("REMOVE_WALLPAPER")) {
                                                        boolean z10 = sharedPreferences5.getBoolean("REMOVE_WALLPAPER", true);
                                                        companion.n();
                                                        Settings.k(gv6.USER, ca8.P_REMOTE_REMOVEWALLPAPER, z10);
                                                        SharedPreferences.Editor editorEdit11 = sharedPreferences5.edit();
                                                        editorEdit11.getClass();
                                                        editorEdit11.remove("REMOVE_WALLPAPER");
                                                        editorEdit11.apply();
                                                    }
                                                    if (sharedPreferences5.contains("SHOW_REMOTE_CURSOR")) {
                                                        boolean z11 = sharedPreferences5.getBoolean("SHOW_REMOTE_CURSOR", false);
                                                        companion.n();
                                                        Settings.k(gv6.USER, ca8.P_REMOTE_REMOTECURSOR, z11);
                                                        SharedPreferences.Editor editorEdit12 = sharedPreferences5.edit();
                                                        editorEdit12.getClass();
                                                        editorEdit12.remove("SHOW_REMOTE_CURSOR");
                                                        editorEdit12.apply();
                                                    }
                                                    if (sharedPreferences5.contains("ENABLE_REMOTE_AUDIO")) {
                                                        boolean z12 = sharedPreferences5.getBoolean("ENABLE_REMOTE_AUDIO", true);
                                                        companion.n();
                                                        Settings.k(gv6.USER, ca8.P_REMOTEAUDIO_RECEIVE_ENABLED, z12);
                                                        SharedPreferences.Editor editorEdit13 = sharedPreferences5.edit();
                                                        editorEdit13.getClass();
                                                        editorEdit13.remove("ENABLE_REMOTE_AUDIO");
                                                        editorEdit13.apply();
                                                    }
                                                }
                                            }
                                            Settings settingsN3 = companion.n();
                                            string2 = Settings.e().toString();
                                            string2.getClass();
                                            strValueOf = String.valueOf(10000);
                                            strM = ua5.m("And", Build.VERSION.RELEASE);
                                            if (strM.length() > 10) {
                                                strM = strM.substring(0, 10);
                                            }
                                            property = System.getProperty("os.arch");
                                            sb2 = new StringBuilder();
                                            String[] strArr3 = Build.SUPPORTED_ABIS;
                                            strArr3.getClass();
                                            while (i2 < r12) {
                                                sb2.append(str12 + " ");
                                            }
                                            string3 = sb2.toString();
                                            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US);
                                            Object objClone2 = settingsN3.h.clone();
                                            objClone2.getClass();
                                            String str14 = simpleDateFormat2.format((Date) objClone2);
                                            str8 = simpleDateFormat2.format(new Date(Build.TIME));
                                            sbP = ua5.p("<br /><br /><br /><span style=\"color:rgb(0,0,240)\">  TeamViewer start: ", str14, "<br />  Version: ");
                                            str9 = n37.f;
                                            if (str9 != null) {
                                                im3.e0("versionString");
                                                throw null;
                                            }
                                            e41.t(sbP, str9, "(298)<br />  ID:      ", string2, "<br />  License: ");
                                            e41.t(sbP, strValueOf, "<br />  OS:      ", strM, "<br />  Arch:    ");
                                            e41.t(sbP, property, "<br />  Abis:    ", string3, "<br /><br />  Device:  <br />");
                                            sbP.append("  Model:\t  ");
                                            sbP.append(Build.MODEL);
                                            sbP.append("<br />");
                                            sbP.append("  Release:  ");
                                            sbP.append(ad8.a());
                                            sbP.append("<br />");
                                            sbP.append("  Board:\t  ");
                                            sbP.append(Build.BOARD);
                                            sbP.append("<br />");
                                            sbP.append("  Brand:\t  ");
                                            sbP.append(Build.BRAND);
                                            sbP.append("<br />");
                                            sbP.append("  Device:\t  ");
                                            sbP.append(Build.DEVICE);
                                            sbP.append("<br />");
                                            sbP.append("  Display:\t  ");
                                            sbP.append(Build.DISPLAY);
                                            sbP.append("<br />");
                                            sbP.append("  Fingerprint: ");
                                            sbP.append(Build.FINGERPRINT);
                                            sbP.append("<br />");
                                            sbP.append("  Host:\t      ");
                                            sbP.append(Build.HOST);
                                            sbP.append("<br />");
                                            sbP.append("  ID:\t      ");
                                            sbP.append(Build.ID);
                                            sbP.append("<br />");
                                            sbP.append("  Product:\t  ");
                                            sbP.append(Build.PRODUCT);
                                            sbP.append("<br />");
                                            sbP.append("  Tags:\t      ");
                                            sbP.append(Build.TAGS);
                                            sbP.append("<br />");
                                            sbP.append("  Time:\t      ");
                                            sbP.append(str8);
                                            sbP.append("<br />");
                                            sbP.append("  Type:\t      ");
                                            sbP.append(Build.TYPE);
                                            sbP.append("<br />");
                                            sbP.append("  </span><br /><br /><br />");
                                            ye4.a("VersionInfo:", sbP.toString());
                                            n1Var = io.sentry.android.core.n1.q;
                                            if (n1Var != null) {
                                                im3.e0("instance");
                                                throw null;
                                            }
                                            n1Var.k();
                                            Settings.i.n();
                                            gv6Var = gv6.MACHINE;
                                            if (Settings.b(gv6Var, ov6.P_MID_VERSION) < 2) {
                                                ye4.a.g("TVApplication", "Forcing MID version update");
                                                ov6 ov6Var2 = ov6.P_MID_FORCE_UPDATE;
                                                Settings.j(gv6Var, ov6Var2, Settings.b(gv6Var, ov6Var2) | 1);
                                            }
                                            ye4.a("App startup", "Network startup");
                                            BackendContainerAndroid.GetInstance().GetFrontendDispatcher();
                                            applicationContext3 = getApplicationContext();
                                            applicationContext3.getClass();
                                            j93 j93Var2 = new j93(applicationContext3);
                                            Point pointT3 = j93Var2.T();
                                            ye4.a("LocalConstraints", "Display is " + pointT3.x + "x" + pointT3.y);
                                            displayMetrics = applicationContext3.getResources().getDisplayMetrics();
                                            float f3 = (float) displayMetrics.widthPixels;
                                            float f4 = displayMetrics.xdpi;
                                            double d7 = (double) (f3 / f4);
                                            double d8 = displayMetrics.heightPixels / displayMetrics.ydpi;
                                            dAbs = Math.abs(f4 / displayMetrics.densityDpi);
                                            if (0.75d <= dAbs) {
                                                int i7 = displayMetrics.widthPixels;
                                                int i8 = displayMetrics.densityDpi;
                                                double d9 = i7 / i8;
                                                double d10 = displayMetrics.heightPixels / i8;
                                                dSqrt = Math.sqrt((d10 * d10) + (d9 * d9));
                                            } else {
                                                int i9 = displayMetrics.widthPixels;
                                                int i10 = displayMetrics.densityDpi;
                                                double d11 = i9 / i10;
                                                double d12 = displayMetrics.heightPixels / i10;
                                                dSqrt = Math.sqrt((d12 * d12) + (d11 * d11));
                                            }
                                            ye4.a("LocalConstraints", "ScreenDiagonal is " + dSqrt);
                                            ye4.a("LocalConstraints", "DPI is " + j93Var2.R());
                                            ye4.a("LocalConstraints", "HardwareMenuButton is " + ViewConfiguration.get(applicationContext3).hasPermanentMenuKey());
                                            ye4.a("LocalConstraints", "AndroidTV is " + j93Var2.W());
                                            zDeviceHasKey = KeyCharacterMap.deviceHasKey(4);
                                            boolean zDeviceHasKey3 = KeyCharacterMap.deviceHasKey(3);
                                            if (zDeviceHasKey) {
                                                z3 = true;
                                            } else {
                                                z3 = true;
                                            }
                                            ye4.a("LocalConstraints", "NavigationBar is " + z3);
                                            if (applicationContext3.getResources().getBoolean(Resources.getSystem().getIdentifier("config_hasRecents", "bool", "android"))) {
                                                o53Var = o53.n;
                                            } else {
                                                o53Var = o53.f1630o;
                                            }
                                            ye4.a("LocalConstraints", "RecentApps is " + o53Var);
                                            Uri uri2 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
                                            AudioAttributes audioAttributes2 = Notification.AUDIO_ATTRIBUTES_DEFAULT;
                                            String string6 = remoteControlApplication.getString(R.string.tv_general_notification_channel_name);
                                            string6.getClass();
                                            r55 r55Var2 = new r55(getApplicationContext());
                                            NotificationChannel notificationChannel9 = new NotificationChannel("TV_GENERAL_NOTIFICATION_CHANNEL", string6, 2);
                                            notificationChannel9.setDescription(null);
                                            notificationChannel9.setGroup(null);
                                            notificationChannel9.setShowBadge(false);
                                            notificationChannel9.setSound(uri2, audioAttributes2);
                                            notificationChannel9.enableLights(false);
                                            notificationChannel9.setLightColor(0);
                                            notificationChannel9.setVibrationPattern(null);
                                            notificationChannel9.enableVibration(false);
                                            r55Var2.a.createNotificationChannel(notificationChannel9);
                                            ArrayList<NotificationChannel> arrayList2 = new ArrayList();
                                            NotificationChannel notificationChannel10 = new NotificationChannel("TV_CHAT_MESSAGES_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_chat_channel_name), 3);
                                            notificationChannel10.setShowBadge(true);
                                            notificationChannel10.enableLights(true);
                                            notificationChannel10.enableVibration(true);
                                            notificationChannel10.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                            arrayList2.add(notificationChannel10);
                                            NotificationChannel notificationChannel11 = new NotificationChannel("TV_LICENSE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_license_notification_channel_name), 3);
                                            notificationChannel11.setDescription(remoteControlApplication.getString(R.string.tv_license_notification_channel_description));
                                            notificationChannel11.setShowBadge(true);
                                            notificationChannel11.enableVibration(true);
                                            arrayList2.add(notificationChannel11);
                                            NotificationChannel notificationChannel12 = new NotificationChannel("TV_DEVICE_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_name), 4);
                                            notificationChannel12.setDescription(remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_description));
                                            notificationChannel12.setShowBadge(true);
                                            notificationChannel12.enableVibration(true);
                                            notificationChannel12.enableLights(true);
                                            notificationChannel12.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                            arrayList2.add(notificationChannel12);
                                            NotificationChannel notificationChannel13 = new NotificationChannel("TV_MONITORING_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_name), 3);
                                            notificationChannel13.setDescription(remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_description));
                                            notificationChannel13.setShowBadge(true);
                                            notificationChannel13.enableVibration(true);
                                            notificationChannel13.enableLights(true);
                                            arrayList2.add(notificationChannel13);
                                            NotificationChannel notificationChannel14 = new NotificationChannel("TV_CONDITIONAL_ACCESS_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_name), 4);
                                            notificationChannel14.setDescription(remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_description));
                                            notificationChannel14.setShowBadge(true);
                                            notificationChannel14.enableVibration(true);
                                            notificationChannel14.enableLights(true);
                                            notificationChannel14.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                            arrayList2.add(notificationChannel14);
                                            NotificationChannel notificationChannel15 = new NotificationChannel("TV_TRUSTED_DEVICE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_name), 4);
                                            notificationChannel15.setDescription(remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_description));
                                            notificationChannel15.setShowBadge(true);
                                            notificationChannel15.enableVibration(true);
                                            notificationChannel15.enableLights(true);
                                            notificationChannel15.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                            arrayList2.add(notificationChannel15);
                                            notificationManager = (NotificationManager) remoteControlApplication.getSystemService(NotificationManager.class);
                                            while (r0.hasNext()) {
                                                if (notificationManager != null) {
                                                    notificationManager.createNotificationChannel(notificationChannel8);
                                                }
                                            }
                                            c();
                                            b();
                                            ea7.a(this);
                                            bu7.CACHEDTHREADPOOL.a(new io.sentry.b5((Object) this, (byte) 25));
                                            sharedPreferences4 = h57.a;
                                            if (sharedPreferences4 != null) {
                                                im3.e0("sharedPreferences");
                                                throw null;
                                            }
                                            a(sharedPreferences4.getBoolean("IS_FIRST_START_EVER", true));
                                            io.sentry.android.core.performance.f.d(this);
                                        }
                                    } catch (IOException e3) {
                                        e = e3;
                                        strArr = strArrK;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        ye4.c("NativeLibExt", message);
                                        AndroidCryptoProtectDataCallbackHolder.SetAndroidCryptoProtectDataCallback(if1.a);
                                        r0 = NativeLibTvExt.a;
                                        applicationContext = getApplicationContext();
                                        applicationContext.getClass();
                                        locale = Locale.getDefault();
                                        filesDir = applicationContext.getFilesDir();
                                        if (filesDir != null) {
                                            cacheDir = applicationContext.getCacheDir();
                                            if (cacheDir == null) {
                                                ye4.c("NativeLibExt", "init: internalCacheDir is null");
                                            } else {
                                                externalFilesDir = applicationContext.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                                                if (externalFilesDir != null) {
                                                    str7 = "";
                                                } else {
                                                    str7 = "";
                                                }
                                                applicationInfo = applicationContext.getApplicationInfo();
                                                applicationInfo.getClass();
                                                i = Build.VERSION.SDK_INT;
                                                applicationContext2 = applicationContext.getApplicationContext();
                                                applicationContext2.getClass();
                                                string = Build.SERIAL;
                                                string.getClass();
                                                if (applicationInfo.targetSdkVersion > 25) {
                                                    string = applicationContext2.getSharedPreferences(applicationContext2.getPackageName() + "_preferences", 0).getString("DEVICE_SERIAL_NUMBER", "");
                                                    string.getClass();
                                                } else {
                                                    SharedPreferences sharedPreferences10 = applicationContext2.getSharedPreferences(applicationContext2.getPackageName() + "_preferences", 0);
                                                    sharedPreferences10.getClass();
                                                    SharedPreferences.Editor editorEdit14 = sharedPreferences10.edit();
                                                    editorEdit14.getClass();
                                                    editorEdit14.putString("DEVICE_SERIAL_NUMBER", string);
                                                    editorEdit14.apply();
                                                }
                                                String str15 = string;
                                                String string7 = android.provider.Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
                                                if (hm3.h(applicationContext, "android.permission.RECORD_AUDIO") == 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (i > 29) {
                                                    zIsExternalStorageManager = Environment.isExternalStorageManager();
                                                } else if (hm3.h(applicationContext, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                                                    zIsExternalStorageManager = true;
                                                } else {
                                                    zIsExternalStorageManager = false;
                                                }
                                                boolean z13 = zIsExternalStorageManager;
                                                boolean zHasSystemFeature2 = applicationContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
                                                Object systemService3 = applicationContext.getSystemService("connectivity");
                                                systemService3.getClass();
                                                defaultProxy = ((ConnectivityManager) systemService3).getDefaultProxy();
                                                if (defaultProxy != null) {
                                                    host = defaultProxy.getHost();
                                                } else {
                                                    obj = strArrK;
                                                }
                                                if (obj == null) {
                                                    obj = host;
                                                    r45 = "";
                                                } else {
                                                    obj = host;
                                                    r45 = obj;
                                                }
                                                Object systemService4 = applicationContext.getSystemService("connectivity");
                                                systemService4.getClass();
                                                defaultProxy2 = ((ConnectivityManager) systemService4).getDefaultProxy();
                                                if (defaultProxy2 != null) {
                                                    port = defaultProxy2.getPort();
                                                } else {
                                                    port = 0;
                                                }
                                                Point pointT4 = new j93(applicationContext).T();
                                                zy4Var = new zy4(filesDir.getAbsolutePath(), cacheDir.getAbsolutePath(), str7, locale.getLanguage(), locale.getCountry(), string7, str15, z, z13, zHasSystemFeature2, r45, port, pointT4.x, pointT4.y);
                                            }
                                            if (zy4Var != 0) {
                                                r0.d(zy4Var, strN);
                                            }
                                            remoteControlApplication = (RemoteControlApplication) this;
                                            remoteControlApplication.C = new ye1(new wk0(remoteControlApplication, (byte) 26), AppType.RemoteControl, remoteControlApplication.d(), new y46((Object) remoteControlApplication, (byte) 5));
                                            companion = Settings.i;
                                            settingsN = companion.n();
                                            if (boolW0 != 0) {
                                                Settings.k(gv6.MACHINE, ov6.P_USE_TESTMASTER_KEYS, boolW0.booleanValue());
                                            }
                                            if (strN3 != null) {
                                                Settings.h(rt0.P_CUSTOM_ROUTER, strN3);
                                            }
                                            if (strN4 != null) {
                                                Settings.h(rt0.P_CUSTOM_KEEPALIVESERVER, strN4);
                                            }
                                            if (strN5 != null) {
                                                Settings.h(rt0.P_CLIENT_STATISTICS_DEBUG, strN5);
                                            }
                                            if (iArrM != null) {
                                                Settings.i(rt0.P_SECURITY_WHITELIST_BUDDY_ACCOUNT_ID, iArrM);
                                            }
                                            if (iArr != null) {
                                                Settings.i(rt0.P_SECURITY_WHITELIST_COMPANY_ID, iArr);
                                            }
                                            if (bool2 != null) {
                                                Settings.k(gv6.MACHINE, rt0.P_MDV2_UI_SWITCH, bool2.booleanValue());
                                            }
                                            if (strArr != null) {
                                                gv6 gv6Var4 = gv6.MACHINE;
                                                Settings.l(strArr);
                                                boolean zB2 = cx.B0("127.0.0.1", strArr);
                                                Settings.k(gv6Var4, rt0.P_GENERAL_LAN_ONLY, zB2);
                                                Settings.k(gv6Var4, rt0.P_GENERAL_DIRECTLAN, zB2);
                                            }
                                            if (str4 != null) {
                                                Settings.h(rt0.P_CONFIGURATION_URL, str4);
                                            }
                                            if (str5 != null) {
                                                Settings.h(rt0.P_REVISION_URL, str5);
                                            }
                                            if (r9 != 0) {
                                                Settings.j(gv6.MACHINE, rt0.P_CONSOLE_URL_PREFIX, r9.intValue());
                                            }
                                            if (str3 != null) {
                                                Settings.h(rt0.P_WEBAPI_URL_PREFIX, str3);
                                            }
                                            if (r6 != 0) {
                                                Settings.j(gv6.CLIENT, rt0.P_AUTHHOST_URL_PREFIX, r6.intValue());
                                            }
                                            if (r7 != 0) {
                                                Settings.j(gv6.MACHINE, rt0.P_ONEAPI_GATEWAY, r7.intValue());
                                            }
                                            if (strN15 != null) {
                                                Settings.h(rt0.P_ONEAPI_GATEWAY_CUSTOMHOST, strN15);
                                            }
                                            if (strN16 != 0) {
                                                kh.k(settingsN, strN16);
                                            }
                                            if (boolW1 != 0) {
                                                sharedPreferences7 = h57.a;
                                                if (sharedPreferences7 != null) {
                                                    im3.e0("sharedPreferences");
                                                    throw strArrK;
                                                }
                                                SharedPreferences.Editor editorEdit15 = sharedPreferences7.edit();
                                                editorEdit15.getClass();
                                                editorEdit15.putBoolean("VERBOSE_LOGGING", boolW1.booleanValue());
                                                editorEdit15.apply();
                                            }
                                            sharedPreferences = h57.a;
                                            if (sharedPreferences != null) {
                                                im3.e0("sharedPreferences");
                                                throw strArrK;
                                            }
                                            ye4.a.h(sharedPreferences.getBoolean("VERBOSE_LOGGING", false));
                                            new wv6(this, companion.n(), new yl7((byte) 28));
                                            b = 4;
                                            if (r0.f()) {
                                                applicationContext4 = remoteControlApplication.getApplicationContext();
                                                applicationContext4.getClass();
                                                if (r0.f()) {
                                                    Context applicationContext11 = applicationContext4.getApplicationContext();
                                                    applicationContext11.getClass();
                                                    au8.V0 = applicationContext11.getApplicationContext();
                                                    AndroidKeyChainCallbackHolder.SetAndroidKeyChainCallback(wi.a);
                                                }
                                                tk1 tk1Var3 = g22.a;
                                                im3.R(hm3.c(gk1.f901o), null, null, new y0(remoteControlApplication, z4 ? 1 : 0, b), 3);
                                            }
                                            sharedPreferences2 = h57.a;
                                            if (sharedPreferences2 != null) {
                                                im3.e0("sharedPreferences");
                                                throw null;
                                            }
                                            z2 = sharedPreferences2.getBoolean("IS_FIRST_START_EVER", true);
                                            if (z2) {
                                                sharedPreferences6 = h57.a;
                                                if (sharedPreferences6 != null) {
                                                    im3.e0("sharedPreferences");
                                                    throw null;
                                                }
                                                SharedPreferences.Editor editorEdit16 = sharedPreferences6.edit();
                                                editorEdit16.getClass();
                                                editorEdit16.putInt("INPUT_METHOD_INT", 0);
                                                editorEdit16.putString("PREFERRED_RESOLUTION", "DontChange");
                                                editorEdit16.apply();
                                            }
                                            sharedPreferences3 = h57.a;
                                            if (sharedPreferences3 != null) {
                                                im3.e0("sharedPreferences");
                                                throw null;
                                            }
                                            if (sharedPreferences3.getInt("BUILD_VERSION", 0) < 298) {
                                                SharedPreferences.Editor editorEdit17 = sharedPreferences3.edit();
                                                editorEdit17.getClass();
                                                editorEdit17.putInt("BUILD_VERSION", 298);
                                                editorEdit17.apply();
                                                if (!z2) {
                                                    sharedPreferences5 = h57.a;
                                                    if (sharedPreferences5 != null) {
                                                        im3.e0("sharedPreferences");
                                                        throw null;
                                                    }
                                                    if (sharedPreferences5.contains("REMOVE_WALLPAPER")) {
                                                        boolean z14 = sharedPreferences5.getBoolean("REMOVE_WALLPAPER", true);
                                                        companion.n();
                                                        Settings.k(gv6.USER, ca8.P_REMOTE_REMOVEWALLPAPER, z14);
                                                        SharedPreferences.Editor editorEdit18 = sharedPreferences5.edit();
                                                        editorEdit18.getClass();
                                                        editorEdit18.remove("REMOVE_WALLPAPER");
                                                        editorEdit18.apply();
                                                    }
                                                    if (sharedPreferences5.contains("SHOW_REMOTE_CURSOR")) {
                                                        boolean z15 = sharedPreferences5.getBoolean("SHOW_REMOTE_CURSOR", false);
                                                        companion.n();
                                                        Settings.k(gv6.USER, ca8.P_REMOTE_REMOTECURSOR, z15);
                                                        SharedPreferences.Editor editorEdit19 = sharedPreferences5.edit();
                                                        editorEdit19.getClass();
                                                        editorEdit19.remove("SHOW_REMOTE_CURSOR");
                                                        editorEdit19.apply();
                                                    }
                                                    if (sharedPreferences5.contains("ENABLE_REMOTE_AUDIO")) {
                                                        boolean z16 = sharedPreferences5.getBoolean("ENABLE_REMOTE_AUDIO", true);
                                                        companion.n();
                                                        Settings.k(gv6.USER, ca8.P_REMOTEAUDIO_RECEIVE_ENABLED, z16);
                                                        SharedPreferences.Editor editorEdit110 = sharedPreferences5.edit();
                                                        editorEdit110.getClass();
                                                        editorEdit110.remove("ENABLE_REMOTE_AUDIO");
                                                        editorEdit110.apply();
                                                    }
                                                }
                                            }
                                            Settings settingsN4 = companion.n();
                                            string2 = Settings.e().toString();
                                            string2.getClass();
                                            strValueOf = String.valueOf(10000);
                                            strM = ua5.m("And", Build.VERSION.RELEASE);
                                            if (strM.length() > 10) {
                                                strM = strM.substring(0, 10);
                                            }
                                            property = System.getProperty("os.arch");
                                            sb2 = new StringBuilder();
                                            String[] strArr4 = Build.SUPPORTED_ABIS;
                                            strArr4.getClass();
                                            while (i2 < r12) {
                                                sb2.append(str12 + " ");
                                            }
                                            string3 = sb2.toString();
                                            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US);
                                            Object objClone3 = settingsN4.h.clone();
                                            objClone3.getClass();
                                            String str16 = simpleDateFormat3.format((Date) objClone3);
                                            str8 = simpleDateFormat3.format(new Date(Build.TIME));
                                            sbP = ua5.p("<br /><br /><br /><span style=\"color:rgb(0,0,240)\">  TeamViewer start: ", str16, "<br />  Version: ");
                                            str9 = n37.f;
                                            if (str9 != null) {
                                                im3.e0("versionString");
                                                throw null;
                                            }
                                            e41.t(sbP, str9, "(298)<br />  ID:      ", string2, "<br />  License: ");
                                            e41.t(sbP, strValueOf, "<br />  OS:      ", strM, "<br />  Arch:    ");
                                            e41.t(sbP, property, "<br />  Abis:    ", string3, "<br /><br />  Device:  <br />");
                                            sbP.append("  Model:\t  ");
                                            sbP.append(Build.MODEL);
                                            sbP.append("<br />");
                                            sbP.append("  Release:  ");
                                            sbP.append(ad8.a());
                                            sbP.append("<br />");
                                            sbP.append("  Board:\t  ");
                                            sbP.append(Build.BOARD);
                                            sbP.append("<br />");
                                            sbP.append("  Brand:\t  ");
                                            sbP.append(Build.BRAND);
                                            sbP.append("<br />");
                                            sbP.append("  Device:\t  ");
                                            sbP.append(Build.DEVICE);
                                            sbP.append("<br />");
                                            sbP.append("  Display:\t  ");
                                            sbP.append(Build.DISPLAY);
                                            sbP.append("<br />");
                                            sbP.append("  Fingerprint: ");
                                            sbP.append(Build.FINGERPRINT);
                                            sbP.append("<br />");
                                            sbP.append("  Host:\t      ");
                                            sbP.append(Build.HOST);
                                            sbP.append("<br />");
                                            sbP.append("  ID:\t      ");
                                            sbP.append(Build.ID);
                                            sbP.append("<br />");
                                            sbP.append("  Product:\t  ");
                                            sbP.append(Build.PRODUCT);
                                            sbP.append("<br />");
                                            sbP.append("  Tags:\t      ");
                                            sbP.append(Build.TAGS);
                                            sbP.append("<br />");
                                            sbP.append("  Time:\t      ");
                                            sbP.append(str8);
                                            sbP.append("<br />");
                                            sbP.append("  Type:\t      ");
                                            sbP.append(Build.TYPE);
                                            sbP.append("<br />");
                                            sbP.append("  </span><br /><br /><br />");
                                            ye4.a("VersionInfo:", sbP.toString());
                                            n1Var = io.sentry.android.core.n1.q;
                                            if (n1Var != null) {
                                                im3.e0("instance");
                                                throw null;
                                            }
                                            n1Var.k();
                                            Settings.i.n();
                                            gv6Var = gv6.MACHINE;
                                            if (Settings.b(gv6Var, ov6.P_MID_VERSION) < 2) {
                                                ye4.a.g("TVApplication", "Forcing MID version update");
                                                ov6 ov6Var3 = ov6.P_MID_FORCE_UPDATE;
                                                Settings.j(gv6Var, ov6Var3, Settings.b(gv6Var, ov6Var3) | 1);
                                            }
                                            ye4.a("App startup", "Network startup");
                                            BackendContainerAndroid.GetInstance().GetFrontendDispatcher();
                                            applicationContext3 = getApplicationContext();
                                            applicationContext3.getClass();
                                            j93 j93Var3 = new j93(applicationContext3);
                                            Point pointT5 = j93Var3.T();
                                            ye4.a("LocalConstraints", "Display is " + pointT5.x + "x" + pointT5.y);
                                            displayMetrics = applicationContext3.getResources().getDisplayMetrics();
                                            float f5 = (float) displayMetrics.widthPixels;
                                            float f6 = displayMetrics.xdpi;
                                            double d13 = (double) (f5 / f6);
                                            double d14 = displayMetrics.heightPixels / displayMetrics.ydpi;
                                            dAbs = Math.abs(f6 / displayMetrics.densityDpi);
                                            if (0.75d <= dAbs) {
                                                int i11 = displayMetrics.widthPixels;
                                                int i12 = displayMetrics.densityDpi;
                                                double d15 = i11 / i12;
                                                double d16 = displayMetrics.heightPixels / i12;
                                                dSqrt = Math.sqrt((d16 * d16) + (d15 * d15));
                                            } else {
                                                int i13 = displayMetrics.widthPixels;
                                                int i14 = displayMetrics.densityDpi;
                                                double d17 = i13 / i14;
                                                double d18 = displayMetrics.heightPixels / i14;
                                                dSqrt = Math.sqrt((d18 * d18) + (d17 * d17));
                                            }
                                            ye4.a("LocalConstraints", "ScreenDiagonal is " + dSqrt);
                                            ye4.a("LocalConstraints", "DPI is " + j93Var3.R());
                                            ye4.a("LocalConstraints", "HardwareMenuButton is " + ViewConfiguration.get(applicationContext3).hasPermanentMenuKey());
                                            ye4.a("LocalConstraints", "AndroidTV is " + j93Var3.W());
                                            zDeviceHasKey = KeyCharacterMap.deviceHasKey(4);
                                            boolean zDeviceHasKey4 = KeyCharacterMap.deviceHasKey(3);
                                            if (zDeviceHasKey) {
                                                z3 = true;
                                            } else {
                                                z3 = true;
                                            }
                                            ye4.a("LocalConstraints", "NavigationBar is " + z3);
                                            if (applicationContext3.getResources().getBoolean(Resources.getSystem().getIdentifier("config_hasRecents", "bool", "android"))) {
                                                o53Var = o53.n;
                                            } else {
                                                o53Var = o53.f1630o;
                                            }
                                            ye4.a("LocalConstraints", "RecentApps is " + o53Var);
                                            Uri uri3 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
                                            AudioAttributes audioAttributes3 = Notification.AUDIO_ATTRIBUTES_DEFAULT;
                                            String string8 = remoteControlApplication.getString(R.string.tv_general_notification_channel_name);
                                            string8.getClass();
                                            r55 r55Var3 = new r55(getApplicationContext());
                                            NotificationChannel notificationChannel16 = new NotificationChannel("TV_GENERAL_NOTIFICATION_CHANNEL", string8, 2);
                                            notificationChannel16.setDescription(null);
                                            notificationChannel16.setGroup(null);
                                            notificationChannel16.setShowBadge(false);
                                            notificationChannel16.setSound(uri3, audioAttributes3);
                                            notificationChannel16.enableLights(false);
                                            notificationChannel16.setLightColor(0);
                                            notificationChannel16.setVibrationPattern(null);
                                            notificationChannel16.enableVibration(false);
                                            r55Var3.a.createNotificationChannel(notificationChannel16);
                                            ArrayList<NotificationChannel> arrayList3 = new ArrayList();
                                            NotificationChannel notificationChannel17 = new NotificationChannel("TV_CHAT_MESSAGES_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_chat_channel_name), 3);
                                            notificationChannel17.setShowBadge(true);
                                            notificationChannel17.enableLights(true);
                                            notificationChannel17.enableVibration(true);
                                            notificationChannel17.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                            arrayList3.add(notificationChannel17);
                                            NotificationChannel notificationChannel18 = new NotificationChannel("TV_LICENSE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_license_notification_channel_name), 3);
                                            notificationChannel18.setDescription(remoteControlApplication.getString(R.string.tv_license_notification_channel_description));
                                            notificationChannel18.setShowBadge(true);
                                            notificationChannel18.enableVibration(true);
                                            arrayList3.add(notificationChannel18);
                                            NotificationChannel notificationChannel19 = new NotificationChannel("TV_DEVICE_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_name), 4);
                                            notificationChannel19.setDescription(remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_description));
                                            notificationChannel19.setShowBadge(true);
                                            notificationChannel19.enableVibration(true);
                                            notificationChannel19.enableLights(true);
                                            notificationChannel19.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                            arrayList3.add(notificationChannel19);
                                            NotificationChannel notificationChannel110 = new NotificationChannel("TV_MONITORING_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_name), 3);
                                            notificationChannel110.setDescription(remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_description));
                                            notificationChannel110.setShowBadge(true);
                                            notificationChannel110.enableVibration(true);
                                            notificationChannel110.enableLights(true);
                                            arrayList3.add(notificationChannel110);
                                            NotificationChannel notificationChannel111 = new NotificationChannel("TV_CONDITIONAL_ACCESS_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_name), 4);
                                            notificationChannel111.setDescription(remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_description));
                                            notificationChannel111.setShowBadge(true);
                                            notificationChannel111.enableVibration(true);
                                            notificationChannel111.enableLights(true);
                                            notificationChannel111.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                            arrayList3.add(notificationChannel111);
                                            NotificationChannel notificationChannel112 = new NotificationChannel("TV_TRUSTED_DEVICE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_name), 4);
                                            notificationChannel112.setDescription(remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_description));
                                            notificationChannel112.setShowBadge(true);
                                            notificationChannel112.enableVibration(true);
                                            notificationChannel112.enableLights(true);
                                            notificationChannel112.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                            arrayList3.add(notificationChannel112);
                                            notificationManager = (NotificationManager) remoteControlApplication.getSystemService(NotificationManager.class);
                                            while (r0.hasNext()) {
                                                if (notificationManager != null) {
                                                    notificationManager.createNotificationChannel(notificationChannel8);
                                                }
                                            }
                                            c();
                                            b();
                                            ea7.a(this);
                                            bu7.CACHEDTHREADPOOL.a(new io.sentry.b5((Object) this, (byte) 25));
                                            sharedPreferences4 = h57.a;
                                            if (sharedPreferences4 != null) {
                                                im3.e0("sharedPreferences");
                                                throw null;
                                            }
                                            a(sharedPreferences4.getBoolean("IS_FIRST_START_EVER", true));
                                            io.sentry.android.core.performance.f.d(this);
                                        }
                                        ye4.c("NativeLibExt", "init: internalStorageDir is null.");
                                        zy4Var = strArrK;
                                        if (zy4Var != 0) {
                                            r0.d(zy4Var, strN);
                                        }
                                        remoteControlApplication = (RemoteControlApplication) this;
                                        remoteControlApplication.C = new ye1(new wk0(remoteControlApplication, (byte) 26), AppType.RemoteControl, remoteControlApplication.d(), new y46((Object) remoteControlApplication, (byte) 5));
                                        companion = Settings.i;
                                        settingsN = companion.n();
                                        if (boolW0 != 0) {
                                            Settings.k(gv6.MACHINE, ov6.P_USE_TESTMASTER_KEYS, boolW0.booleanValue());
                                        }
                                        if (strN3 != null) {
                                            Settings.h(rt0.P_CUSTOM_ROUTER, strN3);
                                        }
                                        if (strN4 != null) {
                                            Settings.h(rt0.P_CUSTOM_KEEPALIVESERVER, strN4);
                                        }
                                        if (strN5 != null) {
                                            Settings.h(rt0.P_CLIENT_STATISTICS_DEBUG, strN5);
                                        }
                                        if (iArrM != null) {
                                            Settings.i(rt0.P_SECURITY_WHITELIST_BUDDY_ACCOUNT_ID, iArrM);
                                        }
                                        if (iArr != null) {
                                            Settings.i(rt0.P_SECURITY_WHITELIST_COMPANY_ID, iArr);
                                        }
                                        if (bool2 != null) {
                                            Settings.k(gv6.MACHINE, rt0.P_MDV2_UI_SWITCH, bool2.booleanValue());
                                        }
                                        if (strArr != null) {
                                            gv6 gv6Var5 = gv6.MACHINE;
                                            Settings.l(strArr);
                                            boolean zB3 = cx.B0("127.0.0.1", strArr);
                                            Settings.k(gv6Var5, rt0.P_GENERAL_LAN_ONLY, zB3);
                                            Settings.k(gv6Var5, rt0.P_GENERAL_DIRECTLAN, zB3);
                                        }
                                        if (str4 != null) {
                                            Settings.h(rt0.P_CONFIGURATION_URL, str4);
                                        }
                                        if (str5 != null) {
                                            Settings.h(rt0.P_REVISION_URL, str5);
                                        }
                                        if (r9 != 0) {
                                            Settings.j(gv6.MACHINE, rt0.P_CONSOLE_URL_PREFIX, r9.intValue());
                                        }
                                        if (str3 != null) {
                                            Settings.h(rt0.P_WEBAPI_URL_PREFIX, str3);
                                        }
                                        if (r6 != 0) {
                                            Settings.j(gv6.CLIENT, rt0.P_AUTHHOST_URL_PREFIX, r6.intValue());
                                        }
                                        if (r7 != 0) {
                                            Settings.j(gv6.MACHINE, rt0.P_ONEAPI_GATEWAY, r7.intValue());
                                        }
                                        if (strN15 != null) {
                                            Settings.h(rt0.P_ONEAPI_GATEWAY_CUSTOMHOST, strN15);
                                        }
                                        if (strN16 != 0) {
                                            kh.k(settingsN, strN16);
                                        }
                                        if (boolW1 != 0) {
                                            sharedPreferences7 = h57.a;
                                            if (sharedPreferences7 != null) {
                                                im3.e0("sharedPreferences");
                                                throw strArrK;
                                            }
                                            SharedPreferences.Editor editorEdit111 = sharedPreferences7.edit();
                                            editorEdit111.getClass();
                                            editorEdit111.putBoolean("VERBOSE_LOGGING", boolW1.booleanValue());
                                            editorEdit111.apply();
                                        }
                                        sharedPreferences = h57.a;
                                        if (sharedPreferences != null) {
                                            im3.e0("sharedPreferences");
                                            throw strArrK;
                                        }
                                        ye4.a.h(sharedPreferences.getBoolean("VERBOSE_LOGGING", false));
                                        new wv6(this, companion.n(), new yl7((byte) 28));
                                        b = 4;
                                        if (r0.f()) {
                                            applicationContext4 = remoteControlApplication.getApplicationContext();
                                            applicationContext4.getClass();
                                            if (r0.f()) {
                                                Context applicationContext12 = applicationContext4.getApplicationContext();
                                                applicationContext12.getClass();
                                                au8.V0 = applicationContext12.getApplicationContext();
                                                AndroidKeyChainCallbackHolder.SetAndroidKeyChainCallback(wi.a);
                                            }
                                            tk1 tk1Var4 = g22.a;
                                            im3.R(hm3.c(gk1.f901o), null, null, new y0(remoteControlApplication, z4 ? 1 : 0, b), 3);
                                        }
                                        sharedPreferences2 = h57.a;
                                        if (sharedPreferences2 != null) {
                                            im3.e0("sharedPreferences");
                                            throw null;
                                        }
                                        z2 = sharedPreferences2.getBoolean("IS_FIRST_START_EVER", true);
                                        if (z2) {
                                            sharedPreferences6 = h57.a;
                                            if (sharedPreferences6 != null) {
                                                im3.e0("sharedPreferences");
                                                throw null;
                                            }
                                            SharedPreferences.Editor editorEdit112 = sharedPreferences6.edit();
                                            editorEdit112.getClass();
                                            editorEdit112.putInt("INPUT_METHOD_INT", 0);
                                            editorEdit112.putString("PREFERRED_RESOLUTION", "DontChange");
                                            editorEdit112.apply();
                                        }
                                        sharedPreferences3 = h57.a;
                                        if (sharedPreferences3 != null) {
                                            im3.e0("sharedPreferences");
                                            throw null;
                                        }
                                        if (sharedPreferences3.getInt("BUILD_VERSION", 0) < 298) {
                                            SharedPreferences.Editor editorEdit113 = sharedPreferences3.edit();
                                            editorEdit113.getClass();
                                            editorEdit113.putInt("BUILD_VERSION", 298);
                                            editorEdit113.apply();
                                            if (!z2) {
                                                sharedPreferences5 = h57.a;
                                                if (sharedPreferences5 != null) {
                                                    im3.e0("sharedPreferences");
                                                    throw null;
                                                }
                                                if (sharedPreferences5.contains("REMOVE_WALLPAPER")) {
                                                    boolean z17 = sharedPreferences5.getBoolean("REMOVE_WALLPAPER", true);
                                                    companion.n();
                                                    Settings.k(gv6.USER, ca8.P_REMOTE_REMOVEWALLPAPER, z17);
                                                    SharedPreferences.Editor editorEdit114 = sharedPreferences5.edit();
                                                    editorEdit114.getClass();
                                                    editorEdit114.remove("REMOVE_WALLPAPER");
                                                    editorEdit114.apply();
                                                }
                                                if (sharedPreferences5.contains("SHOW_REMOTE_CURSOR")) {
                                                    boolean z18 = sharedPreferences5.getBoolean("SHOW_REMOTE_CURSOR", false);
                                                    companion.n();
                                                    Settings.k(gv6.USER, ca8.P_REMOTE_REMOTECURSOR, z18);
                                                    SharedPreferences.Editor editorEdit115 = sharedPreferences5.edit();
                                                    editorEdit115.getClass();
                                                    editorEdit115.remove("SHOW_REMOTE_CURSOR");
                                                    editorEdit115.apply();
                                                }
                                                if (sharedPreferences5.contains("ENABLE_REMOTE_AUDIO")) {
                                                    boolean z19 = sharedPreferences5.getBoolean("ENABLE_REMOTE_AUDIO", true);
                                                    companion.n();
                                                    Settings.k(gv6.USER, ca8.P_REMOTEAUDIO_RECEIVE_ENABLED, z19);
                                                    SharedPreferences.Editor editorEdit116 = sharedPreferences5.edit();
                                                    editorEdit116.getClass();
                                                    editorEdit116.remove("ENABLE_REMOTE_AUDIO");
                                                    editorEdit116.apply();
                                                }
                                            }
                                        }
                                        Settings settingsN5 = companion.n();
                                        string2 = Settings.e().toString();
                                        string2.getClass();
                                        strValueOf = String.valueOf(10000);
                                        strM = ua5.m("And", Build.VERSION.RELEASE);
                                        if (strM.length() > 10) {
                                            strM = strM.substring(0, 10);
                                        }
                                        property = System.getProperty("os.arch");
                                        sb2 = new StringBuilder();
                                        String[] strArr5 = Build.SUPPORTED_ABIS;
                                        strArr5.getClass();
                                        while (i2 < r12) {
                                            sb2.append(str12 + " ");
                                        }
                                        string3 = sb2.toString();
                                        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US);
                                        Object objClone4 = settingsN5.h.clone();
                                        objClone4.getClass();
                                        String str17 = simpleDateFormat4.format((Date) objClone4);
                                        str8 = simpleDateFormat4.format(new Date(Build.TIME));
                                        sbP = ua5.p("<br /><br /><br /><span style=\"color:rgb(0,0,240)\">  TeamViewer start: ", str17, "<br />  Version: ");
                                        str9 = n37.f;
                                        if (str9 != null) {
                                            im3.e0("versionString");
                                            throw null;
                                        }
                                        e41.t(sbP, str9, "(298)<br />  ID:      ", string2, "<br />  License: ");
                                        e41.t(sbP, strValueOf, "<br />  OS:      ", strM, "<br />  Arch:    ");
                                        e41.t(sbP, property, "<br />  Abis:    ", string3, "<br /><br />  Device:  <br />");
                                        sbP.append("  Model:\t  ");
                                        sbP.append(Build.MODEL);
                                        sbP.append("<br />");
                                        sbP.append("  Release:  ");
                                        sbP.append(ad8.a());
                                        sbP.append("<br />");
                                        sbP.append("  Board:\t  ");
                                        sbP.append(Build.BOARD);
                                        sbP.append("<br />");
                                        sbP.append("  Brand:\t  ");
                                        sbP.append(Build.BRAND);
                                        sbP.append("<br />");
                                        sbP.append("  Device:\t  ");
                                        sbP.append(Build.DEVICE);
                                        sbP.append("<br />");
                                        sbP.append("  Display:\t  ");
                                        sbP.append(Build.DISPLAY);
                                        sbP.append("<br />");
                                        sbP.append("  Fingerprint: ");
                                        sbP.append(Build.FINGERPRINT);
                                        sbP.append("<br />");
                                        sbP.append("  Host:\t      ");
                                        sbP.append(Build.HOST);
                                        sbP.append("<br />");
                                        sbP.append("  ID:\t      ");
                                        sbP.append(Build.ID);
                                        sbP.append("<br />");
                                        sbP.append("  Product:\t  ");
                                        sbP.append(Build.PRODUCT);
                                        sbP.append("<br />");
                                        sbP.append("  Tags:\t      ");
                                        sbP.append(Build.TAGS);
                                        sbP.append("<br />");
                                        sbP.append("  Time:\t      ");
                                        sbP.append(str8);
                                        sbP.append("<br />");
                                        sbP.append("  Type:\t      ");
                                        sbP.append(Build.TYPE);
                                        sbP.append("<br />");
                                        sbP.append("  </span><br /><br /><br />");
                                        ye4.a("VersionInfo:", sbP.toString());
                                        n1Var = io.sentry.android.core.n1.q;
                                        if (n1Var != null) {
                                            im3.e0("instance");
                                            throw null;
                                        }
                                        n1Var.k();
                                        Settings.i.n();
                                        gv6Var = gv6.MACHINE;
                                        if (Settings.b(gv6Var, ov6.P_MID_VERSION) < 2) {
                                            ye4.a.g("TVApplication", "Forcing MID version update");
                                            ov6 ov6Var4 = ov6.P_MID_FORCE_UPDATE;
                                            Settings.j(gv6Var, ov6Var4, Settings.b(gv6Var, ov6Var4) | 1);
                                        }
                                        ye4.a("App startup", "Network startup");
                                        BackendContainerAndroid.GetInstance().GetFrontendDispatcher();
                                        applicationContext3 = getApplicationContext();
                                        applicationContext3.getClass();
                                        j93 j93Var4 = new j93(applicationContext3);
                                        Point pointT6 = j93Var4.T();
                                        ye4.a("LocalConstraints", "Display is " + pointT6.x + "x" + pointT6.y);
                                        displayMetrics = applicationContext3.getResources().getDisplayMetrics();
                                        float f7 = (float) displayMetrics.widthPixels;
                                        float f8 = displayMetrics.xdpi;
                                        double d19 = (double) (f7 / f8);
                                        double d110 = displayMetrics.heightPixels / displayMetrics.ydpi;
                                        dAbs = Math.abs(f8 / displayMetrics.densityDpi);
                                        if (0.75d <= dAbs) {
                                            int i15 = displayMetrics.widthPixels;
                                            int i16 = displayMetrics.densityDpi;
                                            double d111 = i15 / i16;
                                            double d112 = displayMetrics.heightPixels / i16;
                                            dSqrt = Math.sqrt((d112 * d112) + (d111 * d111));
                                        } else {
                                            int i17 = displayMetrics.widthPixels;
                                            int i18 = displayMetrics.densityDpi;
                                            double d113 = i17 / i18;
                                            double d114 = displayMetrics.heightPixels / i18;
                                            dSqrt = Math.sqrt((d114 * d114) + (d113 * d113));
                                        }
                                        ye4.a("LocalConstraints", "ScreenDiagonal is " + dSqrt);
                                        ye4.a("LocalConstraints", "DPI is " + j93Var4.R());
                                        ye4.a("LocalConstraints", "HardwareMenuButton is " + ViewConfiguration.get(applicationContext3).hasPermanentMenuKey());
                                        ye4.a("LocalConstraints", "AndroidTV is " + j93Var4.W());
                                        zDeviceHasKey = KeyCharacterMap.deviceHasKey(4);
                                        boolean zDeviceHasKey5 = KeyCharacterMap.deviceHasKey(3);
                                        if (zDeviceHasKey) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        ye4.a("LocalConstraints", "NavigationBar is " + z3);
                                        if (applicationContext3.getResources().getBoolean(Resources.getSystem().getIdentifier("config_hasRecents", "bool", "android"))) {
                                            o53Var = o53.n;
                                        } else {
                                            o53Var = o53.f1630o;
                                        }
                                        ye4.a("LocalConstraints", "RecentApps is " + o53Var);
                                        Uri uri4 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
                                        AudioAttributes audioAttributes4 = Notification.AUDIO_ATTRIBUTES_DEFAULT;
                                        String string9 = remoteControlApplication.getString(R.string.tv_general_notification_channel_name);
                                        string9.getClass();
                                        r55 r55Var4 = new r55(getApplicationContext());
                                        NotificationChannel notificationChannel113 = new NotificationChannel("TV_GENERAL_NOTIFICATION_CHANNEL", string9, 2);
                                        notificationChannel113.setDescription(null);
                                        notificationChannel113.setGroup(null);
                                        notificationChannel113.setShowBadge(false);
                                        notificationChannel113.setSound(uri4, audioAttributes4);
                                        notificationChannel113.enableLights(false);
                                        notificationChannel113.setLightColor(0);
                                        notificationChannel113.setVibrationPattern(null);
                                        notificationChannel113.enableVibration(false);
                                        r55Var4.a.createNotificationChannel(notificationChannel113);
                                        ArrayList<NotificationChannel> arrayList4 = new ArrayList();
                                        NotificationChannel notificationChannel114 = new NotificationChannel("TV_CHAT_MESSAGES_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_chat_channel_name), 3);
                                        notificationChannel114.setShowBadge(true);
                                        notificationChannel114.enableLights(true);
                                        notificationChannel114.enableVibration(true);
                                        notificationChannel114.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                        arrayList4.add(notificationChannel114);
                                        NotificationChannel notificationChannel115 = new NotificationChannel("TV_LICENSE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_license_notification_channel_name), 3);
                                        notificationChannel115.setDescription(remoteControlApplication.getString(R.string.tv_license_notification_channel_description));
                                        notificationChannel115.setShowBadge(true);
                                        notificationChannel115.enableVibration(true);
                                        arrayList4.add(notificationChannel115);
                                        NotificationChannel notificationChannel116 = new NotificationChannel("TV_DEVICE_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_name), 4);
                                        notificationChannel116.setDescription(remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_description));
                                        notificationChannel116.setShowBadge(true);
                                        notificationChannel116.enableVibration(true);
                                        notificationChannel116.enableLights(true);
                                        notificationChannel116.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                        arrayList4.add(notificationChannel116);
                                        NotificationChannel notificationChannel117 = new NotificationChannel("TV_MONITORING_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_name), 3);
                                        notificationChannel117.setDescription(remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_description));
                                        notificationChannel117.setShowBadge(true);
                                        notificationChannel117.enableVibration(true);
                                        notificationChannel117.enableLights(true);
                                        arrayList4.add(notificationChannel117);
                                        NotificationChannel notificationChannel118 = new NotificationChannel("TV_CONDITIONAL_ACCESS_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_name), 4);
                                        notificationChannel118.setDescription(remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_description));
                                        notificationChannel118.setShowBadge(true);
                                        notificationChannel118.enableVibration(true);
                                        notificationChannel118.enableLights(true);
                                        notificationChannel118.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                        arrayList4.add(notificationChannel118);
                                        NotificationChannel notificationChannel119 = new NotificationChannel("TV_TRUSTED_DEVICE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_name), 4);
                                        notificationChannel119.setDescription(remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_description));
                                        notificationChannel119.setShowBadge(true);
                                        notificationChannel119.enableVibration(true);
                                        notificationChannel119.enableLights(true);
                                        notificationChannel119.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                                        arrayList4.add(notificationChannel119);
                                        notificationManager = (NotificationManager) remoteControlApplication.getSystemService(NotificationManager.class);
                                        while (r0.hasNext()) {
                                            if (notificationManager != null) {
                                                notificationManager.createNotificationChannel(notificationChannel8);
                                            }
                                        }
                                        c();
                                        b();
                                        ea7.a(this);
                                        bu7.CACHEDTHREADPOOL.a(new io.sentry.b5((Object) this, (byte) 25));
                                        sharedPreferences4 = h57.a;
                                        if (sharedPreferences4 != null) {
                                            im3.e0("sharedPreferences");
                                            throw null;
                                        }
                                        a(sharedPreferences4.getBoolean("IS_FIRST_START_EVER", true));
                                        io.sentry.android.core.performance.f.d(this);
                                    }
                                } catch (IOException e4) {
                                    e = e4;
                                    strArr = strArrK;
                                    iArr = iArrM2;
                                    str4 = str6;
                                }
                            }
                        }
                        str4 = strN9;
                        strArr = strArrK;
                        iArr = iArrM2;
                        sb.append("<br />");
                        ye4.a("NativeLibExt", sb.toString());
                        zipFile.close();
                    } catch (IOException e5) {
                        e = e5;
                        str4 = strN9;
                        strArr = strArrK;
                        iArr = iArrM2;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        ye4.c("NativeLibExt", message);
                        AndroidCryptoProtectDataCallbackHolder.SetAndroidCryptoProtectDataCallback(if1.a);
                        r0 = NativeLibTvExt.a;
                        applicationContext = getApplicationContext();
                        applicationContext.getClass();
                        locale = Locale.getDefault();
                        filesDir = applicationContext.getFilesDir();
                        if (filesDir != null) {
                            cacheDir = applicationContext.getCacheDir();
                            if (cacheDir == null) {
                                ye4.c("NativeLibExt", "init: internalCacheDir is null");
                            } else {
                                externalFilesDir = applicationContext.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                                if (externalFilesDir != null) {
                                    str7 = "";
                                } else {
                                    str7 = "";
                                }
                                applicationInfo = applicationContext.getApplicationInfo();
                                applicationInfo.getClass();
                                i = Build.VERSION.SDK_INT;
                                applicationContext2 = applicationContext.getApplicationContext();
                                applicationContext2.getClass();
                                string = Build.SERIAL;
                                string.getClass();
                                if (applicationInfo.targetSdkVersion > 25) {
                                    string = applicationContext2.getSharedPreferences(applicationContext2.getPackageName() + "_preferences", 0).getString("DEVICE_SERIAL_NUMBER", "");
                                    string.getClass();
                                } else {
                                    SharedPreferences sharedPreferences11 = applicationContext2.getSharedPreferences(applicationContext2.getPackageName() + "_preferences", 0);
                                    sharedPreferences11.getClass();
                                    SharedPreferences.Editor editorEdit117 = sharedPreferences11.edit();
                                    editorEdit117.getClass();
                                    editorEdit117.putString("DEVICE_SERIAL_NUMBER", string);
                                    editorEdit117.apply();
                                }
                                String str18 = string;
                                String string10 = android.provider.Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
                                if (hm3.h(applicationContext, "android.permission.RECORD_AUDIO") == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (i > 29) {
                                    zIsExternalStorageManager = Environment.isExternalStorageManager();
                                } else if (hm3.h(applicationContext, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                                    zIsExternalStorageManager = true;
                                } else {
                                    zIsExternalStorageManager = false;
                                }
                                boolean z110 = zIsExternalStorageManager;
                                boolean zHasSystemFeature3 = applicationContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
                                Object systemService5 = applicationContext.getSystemService("connectivity");
                                systemService5.getClass();
                                defaultProxy = ((ConnectivityManager) systemService5).getDefaultProxy();
                                if (defaultProxy != null) {
                                    host = defaultProxy.getHost();
                                } else {
                                    obj = strArrK;
                                }
                                if (obj == null) {
                                    obj = host;
                                    r45 = "";
                                } else {
                                    obj = host;
                                    r45 = obj;
                                }
                                Object systemService6 = applicationContext.getSystemService("connectivity");
                                systemService6.getClass();
                                defaultProxy2 = ((ConnectivityManager) systemService6).getDefaultProxy();
                                if (defaultProxy2 != null) {
                                    port = defaultProxy2.getPort();
                                } else {
                                    port = 0;
                                }
                                Point pointT7 = new j93(applicationContext).T();
                                zy4Var = new zy4(filesDir.getAbsolutePath(), cacheDir.getAbsolutePath(), str7, locale.getLanguage(), locale.getCountry(), string10, str18, z, z110, zHasSystemFeature3, r45, port, pointT7.x, pointT7.y);
                            }
                            if (zy4Var != 0) {
                                r0.d(zy4Var, strN);
                            }
                            remoteControlApplication = (RemoteControlApplication) this;
                            remoteControlApplication.C = new ye1(new wk0(remoteControlApplication, (byte) 26), AppType.RemoteControl, remoteControlApplication.d(), new y46((Object) remoteControlApplication, (byte) 5));
                            companion = Settings.i;
                            settingsN = companion.n();
                            if (boolW0 != 0) {
                                Settings.k(gv6.MACHINE, ov6.P_USE_TESTMASTER_KEYS, boolW0.booleanValue());
                            }
                            if (strN3 != null) {
                                Settings.h(rt0.P_CUSTOM_ROUTER, strN3);
                            }
                            if (strN4 != null) {
                                Settings.h(rt0.P_CUSTOM_KEEPALIVESERVER, strN4);
                            }
                            if (strN5 != null) {
                                Settings.h(rt0.P_CLIENT_STATISTICS_DEBUG, strN5);
                            }
                            if (iArrM != null) {
                                Settings.i(rt0.P_SECURITY_WHITELIST_BUDDY_ACCOUNT_ID, iArrM);
                            }
                            if (iArr != null) {
                                Settings.i(rt0.P_SECURITY_WHITELIST_COMPANY_ID, iArr);
                            }
                            if (bool2 != null) {
                                Settings.k(gv6.MACHINE, rt0.P_MDV2_UI_SWITCH, bool2.booleanValue());
                            }
                            if (strArr != null) {
                                gv6 gv6Var6 = gv6.MACHINE;
                                Settings.l(strArr);
                                boolean zB4 = cx.B0("127.0.0.1", strArr);
                                Settings.k(gv6Var6, rt0.P_GENERAL_LAN_ONLY, zB4);
                                Settings.k(gv6Var6, rt0.P_GENERAL_DIRECTLAN, zB4);
                            }
                            if (str4 != null) {
                                Settings.h(rt0.P_CONFIGURATION_URL, str4);
                            }
                            if (str5 != null) {
                                Settings.h(rt0.P_REVISION_URL, str5);
                            }
                            if (r9 != 0) {
                                Settings.j(gv6.MACHINE, rt0.P_CONSOLE_URL_PREFIX, r9.intValue());
                            }
                            if (str3 != null) {
                                Settings.h(rt0.P_WEBAPI_URL_PREFIX, str3);
                            }
                            if (r6 != 0) {
                                Settings.j(gv6.CLIENT, rt0.P_AUTHHOST_URL_PREFIX, r6.intValue());
                            }
                            if (r7 != 0) {
                                Settings.j(gv6.MACHINE, rt0.P_ONEAPI_GATEWAY, r7.intValue());
                            }
                            if (strN15 != null) {
                                Settings.h(rt0.P_ONEAPI_GATEWAY_CUSTOMHOST, strN15);
                            }
                            if (strN16 != 0) {
                                kh.k(settingsN, strN16);
                            }
                            if (boolW1 != 0) {
                                sharedPreferences7 = h57.a;
                                if (sharedPreferences7 != null) {
                                    im3.e0("sharedPreferences");
                                    throw strArrK;
                                }
                                SharedPreferences.Editor editorEdit118 = sharedPreferences7.edit();
                                editorEdit118.getClass();
                                editorEdit118.putBoolean("VERBOSE_LOGGING", boolW1.booleanValue());
                                editorEdit118.apply();
                            }
                            sharedPreferences = h57.a;
                            if (sharedPreferences != null) {
                                im3.e0("sharedPreferences");
                                throw strArrK;
                            }
                            ye4.a.h(sharedPreferences.getBoolean("VERBOSE_LOGGING", false));
                            new wv6(this, companion.n(), new yl7((byte) 28));
                            b = 4;
                            if (r0.f()) {
                                applicationContext4 = remoteControlApplication.getApplicationContext();
                                applicationContext4.getClass();
                                if (r0.f()) {
                                    Context applicationContext13 = applicationContext4.getApplicationContext();
                                    applicationContext13.getClass();
                                    au8.V0 = applicationContext13.getApplicationContext();
                                    AndroidKeyChainCallbackHolder.SetAndroidKeyChainCallback(wi.a);
                                }
                                tk1 tk1Var5 = g22.a;
                                im3.R(hm3.c(gk1.f901o), null, null, new y0(remoteControlApplication, z4 ? 1 : 0, b), 3);
                            }
                            sharedPreferences2 = h57.a;
                            if (sharedPreferences2 != null) {
                                im3.e0("sharedPreferences");
                                throw null;
                            }
                            z2 = sharedPreferences2.getBoolean("IS_FIRST_START_EVER", true);
                            if (z2) {
                                sharedPreferences6 = h57.a;
                                if (sharedPreferences6 != null) {
                                    im3.e0("sharedPreferences");
                                    throw null;
                                }
                                SharedPreferences.Editor editorEdit119 = sharedPreferences6.edit();
                                editorEdit119.getClass();
                                editorEdit119.putInt("INPUT_METHOD_INT", 0);
                                editorEdit119.putString("PREFERRED_RESOLUTION", "DontChange");
                                editorEdit119.apply();
                            }
                            sharedPreferences3 = h57.a;
                            if (sharedPreferences3 != null) {
                                im3.e0("sharedPreferences");
                                throw null;
                            }
                            if (sharedPreferences3.getInt("BUILD_VERSION", 0) < 298) {
                                SharedPreferences.Editor editorEdit1110 = sharedPreferences3.edit();
                                editorEdit1110.getClass();
                                editorEdit1110.putInt("BUILD_VERSION", 298);
                                editorEdit1110.apply();
                                if (!z2) {
                                    sharedPreferences5 = h57.a;
                                    if (sharedPreferences5 != null) {
                                        im3.e0("sharedPreferences");
                                        throw null;
                                    }
                                    if (sharedPreferences5.contains("REMOVE_WALLPAPER")) {
                                        boolean z111 = sharedPreferences5.getBoolean("REMOVE_WALLPAPER", true);
                                        companion.n();
                                        Settings.k(gv6.USER, ca8.P_REMOTE_REMOVEWALLPAPER, z111);
                                        SharedPreferences.Editor editorEdit1111 = sharedPreferences5.edit();
                                        editorEdit1111.getClass();
                                        editorEdit1111.remove("REMOVE_WALLPAPER");
                                        editorEdit1111.apply();
                                    }
                                    if (sharedPreferences5.contains("SHOW_REMOTE_CURSOR")) {
                                        boolean z112 = sharedPreferences5.getBoolean("SHOW_REMOTE_CURSOR", false);
                                        companion.n();
                                        Settings.k(gv6.USER, ca8.P_REMOTE_REMOTECURSOR, z112);
                                        SharedPreferences.Editor editorEdit1112 = sharedPreferences5.edit();
                                        editorEdit1112.getClass();
                                        editorEdit1112.remove("SHOW_REMOTE_CURSOR");
                                        editorEdit1112.apply();
                                    }
                                    if (sharedPreferences5.contains("ENABLE_REMOTE_AUDIO")) {
                                        boolean z113 = sharedPreferences5.getBoolean("ENABLE_REMOTE_AUDIO", true);
                                        companion.n();
                                        Settings.k(gv6.USER, ca8.P_REMOTEAUDIO_RECEIVE_ENABLED, z113);
                                        SharedPreferences.Editor editorEdit1113 = sharedPreferences5.edit();
                                        editorEdit1113.getClass();
                                        editorEdit1113.remove("ENABLE_REMOTE_AUDIO");
                                        editorEdit1113.apply();
                                    }
                                }
                            }
                            Settings settingsN6 = companion.n();
                            string2 = Settings.e().toString();
                            string2.getClass();
                            strValueOf = String.valueOf(10000);
                            strM = ua5.m("And", Build.VERSION.RELEASE);
                            if (strM.length() > 10) {
                                strM = strM.substring(0, 10);
                            }
                            property = System.getProperty("os.arch");
                            sb2 = new StringBuilder();
                            String[] strArr6 = Build.SUPPORTED_ABIS;
                            strArr6.getClass();
                            while (i2 < r12) {
                                sb2.append(str12 + " ");
                            }
                            string3 = sb2.toString();
                            SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US);
                            Object objClone5 = settingsN6.h.clone();
                            objClone5.getClass();
                            String str19 = simpleDateFormat5.format((Date) objClone5);
                            str8 = simpleDateFormat5.format(new Date(Build.TIME));
                            sbP = ua5.p("<br /><br /><br /><span style=\"color:rgb(0,0,240)\">  TeamViewer start: ", str19, "<br />  Version: ");
                            str9 = n37.f;
                            if (str9 != null) {
                                im3.e0("versionString");
                                throw null;
                            }
                            e41.t(sbP, str9, "(298)<br />  ID:      ", string2, "<br />  License: ");
                            e41.t(sbP, strValueOf, "<br />  OS:      ", strM, "<br />  Arch:    ");
                            e41.t(sbP, property, "<br />  Abis:    ", string3, "<br /><br />  Device:  <br />");
                            sbP.append("  Model:\t  ");
                            sbP.append(Build.MODEL);
                            sbP.append("<br />");
                            sbP.append("  Release:  ");
                            sbP.append(ad8.a());
                            sbP.append("<br />");
                            sbP.append("  Board:\t  ");
                            sbP.append(Build.BOARD);
                            sbP.append("<br />");
                            sbP.append("  Brand:\t  ");
                            sbP.append(Build.BRAND);
                            sbP.append("<br />");
                            sbP.append("  Device:\t  ");
                            sbP.append(Build.DEVICE);
                            sbP.append("<br />");
                            sbP.append("  Display:\t  ");
                            sbP.append(Build.DISPLAY);
                            sbP.append("<br />");
                            sbP.append("  Fingerprint: ");
                            sbP.append(Build.FINGERPRINT);
                            sbP.append("<br />");
                            sbP.append("  Host:\t      ");
                            sbP.append(Build.HOST);
                            sbP.append("<br />");
                            sbP.append("  ID:\t      ");
                            sbP.append(Build.ID);
                            sbP.append("<br />");
                            sbP.append("  Product:\t  ");
                            sbP.append(Build.PRODUCT);
                            sbP.append("<br />");
                            sbP.append("  Tags:\t      ");
                            sbP.append(Build.TAGS);
                            sbP.append("<br />");
                            sbP.append("  Time:\t      ");
                            sbP.append(str8);
                            sbP.append("<br />");
                            sbP.append("  Type:\t      ");
                            sbP.append(Build.TYPE);
                            sbP.append("<br />");
                            sbP.append("  </span><br /><br /><br />");
                            ye4.a("VersionInfo:", sbP.toString());
                            n1Var = io.sentry.android.core.n1.q;
                            if (n1Var != null) {
                                im3.e0("instance");
                                throw null;
                            }
                            n1Var.k();
                            Settings.i.n();
                            gv6Var = gv6.MACHINE;
                            if (Settings.b(gv6Var, ov6.P_MID_VERSION) < 2) {
                                ye4.a.g("TVApplication", "Forcing MID version update");
                                ov6 ov6Var5 = ov6.P_MID_FORCE_UPDATE;
                                Settings.j(gv6Var, ov6Var5, Settings.b(gv6Var, ov6Var5) | 1);
                            }
                            ye4.a("App startup", "Network startup");
                            BackendContainerAndroid.GetInstance().GetFrontendDispatcher();
                            applicationContext3 = getApplicationContext();
                            applicationContext3.getClass();
                            j93 j93Var5 = new j93(applicationContext3);
                            Point pointT8 = j93Var5.T();
                            ye4.a("LocalConstraints", "Display is " + pointT8.x + "x" + pointT8.y);
                            displayMetrics = applicationContext3.getResources().getDisplayMetrics();
                            float f9 = (float) displayMetrics.widthPixels;
                            float f10 = displayMetrics.xdpi;
                            double d115 = (double) (f9 / f10);
                            double d116 = displayMetrics.heightPixels / displayMetrics.ydpi;
                            dAbs = Math.abs(f10 / displayMetrics.densityDpi);
                            if (0.75d <= dAbs) {
                                int i19 = displayMetrics.widthPixels;
                                int i110 = displayMetrics.densityDpi;
                                double d117 = i19 / i110;
                                double d118 = displayMetrics.heightPixels / i110;
                                dSqrt = Math.sqrt((d118 * d118) + (d117 * d117));
                            } else {
                                int i111 = displayMetrics.widthPixels;
                                int i112 = displayMetrics.densityDpi;
                                double d119 = i111 / i112;
                                double d1110 = displayMetrics.heightPixels / i112;
                                dSqrt = Math.sqrt((d1110 * d1110) + (d119 * d119));
                            }
                            ye4.a("LocalConstraints", "ScreenDiagonal is " + dSqrt);
                            ye4.a("LocalConstraints", "DPI is " + j93Var5.R());
                            ye4.a("LocalConstraints", "HardwareMenuButton is " + ViewConfiguration.get(applicationContext3).hasPermanentMenuKey());
                            ye4.a("LocalConstraints", "AndroidTV is " + j93Var5.W());
                            zDeviceHasKey = KeyCharacterMap.deviceHasKey(4);
                            boolean zDeviceHasKey6 = KeyCharacterMap.deviceHasKey(3);
                            if (zDeviceHasKey) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            ye4.a("LocalConstraints", "NavigationBar is " + z3);
                            if (applicationContext3.getResources().getBoolean(Resources.getSystem().getIdentifier("config_hasRecents", "bool", "android"))) {
                                o53Var = o53.n;
                            } else {
                                o53Var = o53.f1630o;
                            }
                            ye4.a("LocalConstraints", "RecentApps is " + o53Var);
                            Uri uri5 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
                            AudioAttributes audioAttributes5 = Notification.AUDIO_ATTRIBUTES_DEFAULT;
                            String string11 = remoteControlApplication.getString(R.string.tv_general_notification_channel_name);
                            string11.getClass();
                            r55 r55Var5 = new r55(getApplicationContext());
                            NotificationChannel notificationChannel1110 = new NotificationChannel("TV_GENERAL_NOTIFICATION_CHANNEL", string11, 2);
                            notificationChannel1110.setDescription(null);
                            notificationChannel1110.setGroup(null);
                            notificationChannel1110.setShowBadge(false);
                            notificationChannel1110.setSound(uri5, audioAttributes5);
                            notificationChannel1110.enableLights(false);
                            notificationChannel1110.setLightColor(0);
                            notificationChannel1110.setVibrationPattern(null);
                            notificationChannel1110.enableVibration(false);
                            r55Var5.a.createNotificationChannel(notificationChannel1110);
                            ArrayList<NotificationChannel> arrayList5 = new ArrayList();
                            NotificationChannel notificationChannel1111 = new NotificationChannel("TV_CHAT_MESSAGES_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_chat_channel_name), 3);
                            notificationChannel1111.setShowBadge(true);
                            notificationChannel1111.enableLights(true);
                            notificationChannel1111.enableVibration(true);
                            notificationChannel1111.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                            arrayList5.add(notificationChannel1111);
                            NotificationChannel notificationChannel1112 = new NotificationChannel("TV_LICENSE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_license_notification_channel_name), 3);
                            notificationChannel1112.setDescription(remoteControlApplication.getString(R.string.tv_license_notification_channel_description));
                            notificationChannel1112.setShowBadge(true);
                            notificationChannel1112.enableVibration(true);
                            arrayList5.add(notificationChannel1112);
                            NotificationChannel notificationChannel1113 = new NotificationChannel("TV_DEVICE_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_name), 4);
                            notificationChannel1113.setDescription(remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_description));
                            notificationChannel1113.setShowBadge(true);
                            notificationChannel1113.enableVibration(true);
                            notificationChannel1113.enableLights(true);
                            notificationChannel1113.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                            arrayList5.add(notificationChannel1113);
                            NotificationChannel notificationChannel1114 = new NotificationChannel("TV_MONITORING_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_name), 3);
                            notificationChannel1114.setDescription(remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_description));
                            notificationChannel1114.setShowBadge(true);
                            notificationChannel1114.enableVibration(true);
                            notificationChannel1114.enableLights(true);
                            arrayList5.add(notificationChannel1114);
                            NotificationChannel notificationChannel1115 = new NotificationChannel("TV_CONDITIONAL_ACCESS_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_name), 4);
                            notificationChannel1115.setDescription(remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_description));
                            notificationChannel1115.setShowBadge(true);
                            notificationChannel1115.enableVibration(true);
                            notificationChannel1115.enableLights(true);
                            notificationChannel1115.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                            arrayList5.add(notificationChannel1115);
                            NotificationChannel notificationChannel1116 = new NotificationChannel("TV_TRUSTED_DEVICE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_name), 4);
                            notificationChannel1116.setDescription(remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_description));
                            notificationChannel1116.setShowBadge(true);
                            notificationChannel1116.enableVibration(true);
                            notificationChannel1116.enableLights(true);
                            notificationChannel1116.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                            arrayList5.add(notificationChannel1116);
                            notificationManager = (NotificationManager) remoteControlApplication.getSystemService(NotificationManager.class);
                            while (r0.hasNext()) {
                                if (notificationManager != null) {
                                    notificationManager.createNotificationChannel(notificationChannel8);
                                }
                            }
                            c();
                            b();
                            ea7.a(this);
                            bu7.CACHEDTHREADPOOL.a(new io.sentry.b5((Object) this, (byte) 25));
                            sharedPreferences4 = h57.a;
                            if (sharedPreferences4 != null) {
                                im3.e0("sharedPreferences");
                                throw null;
                            }
                            a(sharedPreferences4.getBoolean("IS_FIRST_START_EVER", true));
                            io.sentry.android.core.performance.f.d(this);
                        }
                        ye4.c("NativeLibExt", "init: internalStorageDir is null.");
                        zy4Var = strArrK;
                        if (zy4Var != 0) {
                            r0.d(zy4Var, strN);
                        }
                        remoteControlApplication = (RemoteControlApplication) this;
                        remoteControlApplication.C = new ye1(new wk0(remoteControlApplication, (byte) 26), AppType.RemoteControl, remoteControlApplication.d(), new y46((Object) remoteControlApplication, (byte) 5));
                        companion = Settings.i;
                        settingsN = companion.n();
                        if (boolW0 != 0) {
                            Settings.k(gv6.MACHINE, ov6.P_USE_TESTMASTER_KEYS, boolW0.booleanValue());
                        }
                        if (strN3 != null) {
                            Settings.h(rt0.P_CUSTOM_ROUTER, strN3);
                        }
                        if (strN4 != null) {
                            Settings.h(rt0.P_CUSTOM_KEEPALIVESERVER, strN4);
                        }
                        if (strN5 != null) {
                            Settings.h(rt0.P_CLIENT_STATISTICS_DEBUG, strN5);
                        }
                        if (iArrM != null) {
                            Settings.i(rt0.P_SECURITY_WHITELIST_BUDDY_ACCOUNT_ID, iArrM);
                        }
                        if (iArr != null) {
                            Settings.i(rt0.P_SECURITY_WHITELIST_COMPANY_ID, iArr);
                        }
                        if (bool2 != null) {
                            Settings.k(gv6.MACHINE, rt0.P_MDV2_UI_SWITCH, bool2.booleanValue());
                        }
                        if (strArr != null) {
                            gv6 gv6Var7 = gv6.MACHINE;
                            Settings.l(strArr);
                            boolean zB5 = cx.B0("127.0.0.1", strArr);
                            Settings.k(gv6Var7, rt0.P_GENERAL_LAN_ONLY, zB5);
                            Settings.k(gv6Var7, rt0.P_GENERAL_DIRECTLAN, zB5);
                        }
                        if (str4 != null) {
                            Settings.h(rt0.P_CONFIGURATION_URL, str4);
                        }
                        if (str5 != null) {
                            Settings.h(rt0.P_REVISION_URL, str5);
                        }
                        if (r9 != 0) {
                            Settings.j(gv6.MACHINE, rt0.P_CONSOLE_URL_PREFIX, r9.intValue());
                        }
                        if (str3 != null) {
                            Settings.h(rt0.P_WEBAPI_URL_PREFIX, str3);
                        }
                        if (r6 != 0) {
                            Settings.j(gv6.CLIENT, rt0.P_AUTHHOST_URL_PREFIX, r6.intValue());
                        }
                        if (r7 != 0) {
                            Settings.j(gv6.MACHINE, rt0.P_ONEAPI_GATEWAY, r7.intValue());
                        }
                        if (strN15 != null) {
                            Settings.h(rt0.P_ONEAPI_GATEWAY_CUSTOMHOST, strN15);
                        }
                        if (strN16 != 0) {
                            kh.k(settingsN, strN16);
                        }
                        if (boolW1 != 0) {
                            sharedPreferences7 = h57.a;
                            if (sharedPreferences7 != null) {
                                im3.e0("sharedPreferences");
                                throw strArrK;
                            }
                            SharedPreferences.Editor editorEdit1114 = sharedPreferences7.edit();
                            editorEdit1114.getClass();
                            editorEdit1114.putBoolean("VERBOSE_LOGGING", boolW1.booleanValue());
                            editorEdit1114.apply();
                        }
                        sharedPreferences = h57.a;
                        if (sharedPreferences != null) {
                            im3.e0("sharedPreferences");
                            throw strArrK;
                        }
                        ye4.a.h(sharedPreferences.getBoolean("VERBOSE_LOGGING", false));
                        new wv6(this, companion.n(), new yl7((byte) 28));
                        b = 4;
                        if (r0.f()) {
                            applicationContext4 = remoteControlApplication.getApplicationContext();
                            applicationContext4.getClass();
                            if (r0.f()) {
                                Context applicationContext14 = applicationContext4.getApplicationContext();
                                applicationContext14.getClass();
                                au8.V0 = applicationContext14.getApplicationContext();
                                AndroidKeyChainCallbackHolder.SetAndroidKeyChainCallback(wi.a);
                            }
                            tk1 tk1Var6 = g22.a;
                            im3.R(hm3.c(gk1.f901o), null, null, new y0(remoteControlApplication, z4 ? 1 : 0, b), 3);
                        }
                        sharedPreferences2 = h57.a;
                        if (sharedPreferences2 != null) {
                            im3.e0("sharedPreferences");
                            throw null;
                        }
                        z2 = sharedPreferences2.getBoolean("IS_FIRST_START_EVER", true);
                        if (z2) {
                            sharedPreferences6 = h57.a;
                            if (sharedPreferences6 != null) {
                                im3.e0("sharedPreferences");
                                throw null;
                            }
                            SharedPreferences.Editor editorEdit1115 = sharedPreferences6.edit();
                            editorEdit1115.getClass();
                            editorEdit1115.putInt("INPUT_METHOD_INT", 0);
                            editorEdit1115.putString("PREFERRED_RESOLUTION", "DontChange");
                            editorEdit1115.apply();
                        }
                        sharedPreferences3 = h57.a;
                        if (sharedPreferences3 != null) {
                            im3.e0("sharedPreferences");
                            throw null;
                        }
                        if (sharedPreferences3.getInt("BUILD_VERSION", 0) < 298) {
                            SharedPreferences.Editor editorEdit1116 = sharedPreferences3.edit();
                            editorEdit1116.getClass();
                            editorEdit1116.putInt("BUILD_VERSION", 298);
                            editorEdit1116.apply();
                            if (!z2) {
                                sharedPreferences5 = h57.a;
                                if (sharedPreferences5 != null) {
                                    im3.e0("sharedPreferences");
                                    throw null;
                                }
                                if (sharedPreferences5.contains("REMOVE_WALLPAPER")) {
                                    boolean z114 = sharedPreferences5.getBoolean("REMOVE_WALLPAPER", true);
                                    companion.n();
                                    Settings.k(gv6.USER, ca8.P_REMOTE_REMOVEWALLPAPER, z114);
                                    SharedPreferences.Editor editorEdit1117 = sharedPreferences5.edit();
                                    editorEdit1117.getClass();
                                    editorEdit1117.remove("REMOVE_WALLPAPER");
                                    editorEdit1117.apply();
                                }
                                if (sharedPreferences5.contains("SHOW_REMOTE_CURSOR")) {
                                    boolean z115 = sharedPreferences5.getBoolean("SHOW_REMOTE_CURSOR", false);
                                    companion.n();
                                    Settings.k(gv6.USER, ca8.P_REMOTE_REMOTECURSOR, z115);
                                    SharedPreferences.Editor editorEdit1118 = sharedPreferences5.edit();
                                    editorEdit1118.getClass();
                                    editorEdit1118.remove("SHOW_REMOTE_CURSOR");
                                    editorEdit1118.apply();
                                }
                                if (sharedPreferences5.contains("ENABLE_REMOTE_AUDIO")) {
                                    boolean z116 = sharedPreferences5.getBoolean("ENABLE_REMOTE_AUDIO", true);
                                    companion.n();
                                    Settings.k(gv6.USER, ca8.P_REMOTEAUDIO_RECEIVE_ENABLED, z116);
                                    SharedPreferences.Editor editorEdit1119 = sharedPreferences5.edit();
                                    editorEdit1119.getClass();
                                    editorEdit1119.remove("ENABLE_REMOTE_AUDIO");
                                    editorEdit1119.apply();
                                }
                            }
                        }
                        Settings settingsN7 = companion.n();
                        string2 = Settings.e().toString();
                        string2.getClass();
                        strValueOf = String.valueOf(10000);
                        strM = ua5.m("And", Build.VERSION.RELEASE);
                        if (strM.length() > 10) {
                            strM = strM.substring(0, 10);
                        }
                        property = System.getProperty("os.arch");
                        sb2 = new StringBuilder();
                        String[] strArr7 = Build.SUPPORTED_ABIS;
                        strArr7.getClass();
                        while (i2 < r12) {
                            sb2.append(str12 + " ");
                        }
                        string3 = sb2.toString();
                        SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US);
                        Object objClone6 = settingsN7.h.clone();
                        objClone6.getClass();
                        String str110 = simpleDateFormat6.format((Date) objClone6);
                        str8 = simpleDateFormat6.format(new Date(Build.TIME));
                        sbP = ua5.p("<br /><br /><br /><span style=\"color:rgb(0,0,240)\">  TeamViewer start: ", str110, "<br />  Version: ");
                        str9 = n37.f;
                        if (str9 != null) {
                            im3.e0("versionString");
                            throw null;
                        }
                        e41.t(sbP, str9, "(298)<br />  ID:      ", string2, "<br />  License: ");
                        e41.t(sbP, strValueOf, "<br />  OS:      ", strM, "<br />  Arch:    ");
                        e41.t(sbP, property, "<br />  Abis:    ", string3, "<br /><br />  Device:  <br />");
                        sbP.append("  Model:\t  ");
                        sbP.append(Build.MODEL);
                        sbP.append("<br />");
                        sbP.append("  Release:  ");
                        sbP.append(ad8.a());
                        sbP.append("<br />");
                        sbP.append("  Board:\t  ");
                        sbP.append(Build.BOARD);
                        sbP.append("<br />");
                        sbP.append("  Brand:\t  ");
                        sbP.append(Build.BRAND);
                        sbP.append("<br />");
                        sbP.append("  Device:\t  ");
                        sbP.append(Build.DEVICE);
                        sbP.append("<br />");
                        sbP.append("  Display:\t  ");
                        sbP.append(Build.DISPLAY);
                        sbP.append("<br />");
                        sbP.append("  Fingerprint: ");
                        sbP.append(Build.FINGERPRINT);
                        sbP.append("<br />");
                        sbP.append("  Host:\t      ");
                        sbP.append(Build.HOST);
                        sbP.append("<br />");
                        sbP.append("  ID:\t      ");
                        sbP.append(Build.ID);
                        sbP.append("<br />");
                        sbP.append("  Product:\t  ");
                        sbP.append(Build.PRODUCT);
                        sbP.append("<br />");
                        sbP.append("  Tags:\t      ");
                        sbP.append(Build.TAGS);
                        sbP.append("<br />");
                        sbP.append("  Time:\t      ");
                        sbP.append(str8);
                        sbP.append("<br />");
                        sbP.append("  Type:\t      ");
                        sbP.append(Build.TYPE);
                        sbP.append("<br />");
                        sbP.append("  </span><br /><br /><br />");
                        ye4.a("VersionInfo:", sbP.toString());
                        n1Var = io.sentry.android.core.n1.q;
                        if (n1Var != null) {
                            im3.e0("instance");
                            throw null;
                        }
                        n1Var.k();
                        Settings.i.n();
                        gv6Var = gv6.MACHINE;
                        if (Settings.b(gv6Var, ov6.P_MID_VERSION) < 2) {
                            ye4.a.g("TVApplication", "Forcing MID version update");
                            ov6 ov6Var6 = ov6.P_MID_FORCE_UPDATE;
                            Settings.j(gv6Var, ov6Var6, Settings.b(gv6Var, ov6Var6) | 1);
                        }
                        ye4.a("App startup", "Network startup");
                        BackendContainerAndroid.GetInstance().GetFrontendDispatcher();
                        applicationContext3 = getApplicationContext();
                        applicationContext3.getClass();
                        j93 j93Var6 = new j93(applicationContext3);
                        Point pointT9 = j93Var6.T();
                        ye4.a("LocalConstraints", "Display is " + pointT9.x + "x" + pointT9.y);
                        displayMetrics = applicationContext3.getResources().getDisplayMetrics();
                        float f11 = (float) displayMetrics.widthPixels;
                        float f12 = displayMetrics.xdpi;
                        double d1111 = (double) (f11 / f12);
                        double d1112 = displayMetrics.heightPixels / displayMetrics.ydpi;
                        dAbs = Math.abs(f12 / displayMetrics.densityDpi);
                        if (0.75d <= dAbs) {
                            int i113 = displayMetrics.widthPixels;
                            int i114 = displayMetrics.densityDpi;
                            double d1113 = i113 / i114;
                            double d1114 = displayMetrics.heightPixels / i114;
                            dSqrt = Math.sqrt((d1114 * d1114) + (d1113 * d1113));
                        } else {
                            int i115 = displayMetrics.widthPixels;
                            int i116 = displayMetrics.densityDpi;
                            double d1115 = i115 / i116;
                            double d1116 = displayMetrics.heightPixels / i116;
                            dSqrt = Math.sqrt((d1116 * d1116) + (d1115 * d1115));
                        }
                        ye4.a("LocalConstraints", "ScreenDiagonal is " + dSqrt);
                        ye4.a("LocalConstraints", "DPI is " + j93Var6.R());
                        ye4.a("LocalConstraints", "HardwareMenuButton is " + ViewConfiguration.get(applicationContext3).hasPermanentMenuKey());
                        ye4.a("LocalConstraints", "AndroidTV is " + j93Var6.W());
                        zDeviceHasKey = KeyCharacterMap.deviceHasKey(4);
                        boolean zDeviceHasKey7 = KeyCharacterMap.deviceHasKey(3);
                        if (zDeviceHasKey) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        ye4.a("LocalConstraints", "NavigationBar is " + z3);
                        if (applicationContext3.getResources().getBoolean(Resources.getSystem().getIdentifier("config_hasRecents", "bool", "android"))) {
                            o53Var = o53.n;
                        } else {
                            o53Var = o53.f1630o;
                        }
                        ye4.a("LocalConstraints", "RecentApps is " + o53Var);
                        Uri uri6 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
                        AudioAttributes audioAttributes6 = Notification.AUDIO_ATTRIBUTES_DEFAULT;
                        String string12 = remoteControlApplication.getString(R.string.tv_general_notification_channel_name);
                        string12.getClass();
                        r55 r55Var6 = new r55(getApplicationContext());
                        NotificationChannel notificationChannel1117 = new NotificationChannel("TV_GENERAL_NOTIFICATION_CHANNEL", string12, 2);
                        notificationChannel1117.setDescription(null);
                        notificationChannel1117.setGroup(null);
                        notificationChannel1117.setShowBadge(false);
                        notificationChannel1117.setSound(uri6, audioAttributes6);
                        notificationChannel1117.enableLights(false);
                        notificationChannel1117.setLightColor(0);
                        notificationChannel1117.setVibrationPattern(null);
                        notificationChannel1117.enableVibration(false);
                        r55Var6.a.createNotificationChannel(notificationChannel1117);
                        ArrayList<NotificationChannel> arrayList6 = new ArrayList();
                        NotificationChannel notificationChannel1118 = new NotificationChannel("TV_CHAT_MESSAGES_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_chat_channel_name), 3);
                        notificationChannel1118.setShowBadge(true);
                        notificationChannel1118.enableLights(true);
                        notificationChannel1118.enableVibration(true);
                        notificationChannel1118.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                        arrayList6.add(notificationChannel1118);
                        NotificationChannel notificationChannel1119 = new NotificationChannel("TV_LICENSE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_license_notification_channel_name), 3);
                        notificationChannel1119.setDescription(remoteControlApplication.getString(R.string.tv_license_notification_channel_description));
                        notificationChannel1119.setShowBadge(true);
                        notificationChannel1119.enableVibration(true);
                        arrayList6.add(notificationChannel1119);
                        NotificationChannel notificationChannel11110 = new NotificationChannel("TV_DEVICE_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_name), 4);
                        notificationChannel11110.setDescription(remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_description));
                        notificationChannel11110.setShowBadge(true);
                        notificationChannel11110.enableVibration(true);
                        notificationChannel11110.enableLights(true);
                        notificationChannel11110.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                        arrayList6.add(notificationChannel11110);
                        NotificationChannel notificationChannel11111 = new NotificationChannel("TV_MONITORING_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_name), 3);
                        notificationChannel11111.setDescription(remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_description));
                        notificationChannel11111.setShowBadge(true);
                        notificationChannel11111.enableVibration(true);
                        notificationChannel11111.enableLights(true);
                        arrayList6.add(notificationChannel11111);
                        NotificationChannel notificationChannel11112 = new NotificationChannel("TV_CONDITIONAL_ACCESS_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_name), 4);
                        notificationChannel11112.setDescription(remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_description));
                        notificationChannel11112.setShowBadge(true);
                        notificationChannel11112.enableVibration(true);
                        notificationChannel11112.enableLights(true);
                        notificationChannel11112.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                        arrayList6.add(notificationChannel11112);
                        NotificationChannel notificationChannel11113 = new NotificationChannel("TV_TRUSTED_DEVICE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_name), 4);
                        notificationChannel11113.setDescription(remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_description));
                        notificationChannel11113.setShowBadge(true);
                        notificationChannel11113.enableVibration(true);
                        notificationChannel11113.enableLights(true);
                        notificationChannel11113.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                        arrayList6.add(notificationChannel11113);
                        notificationManager = (NotificationManager) remoteControlApplication.getSystemService(NotificationManager.class);
                        while (r0.hasNext()) {
                            if (notificationManager != null) {
                                notificationManager.createNotificationChannel(notificationChannel8);
                            }
                        }
                        c();
                        b();
                        ea7.a(this);
                        bu7.CACHEDTHREADPOOL.a(new io.sentry.b5((Object) this, (byte) 25));
                        sharedPreferences4 = h57.a;
                        if (sharedPreferences4 != null) {
                            im3.e0("sharedPreferences");
                            throw null;
                        }
                        a(sharedPreferences4.getBoolean("IS_FIRST_START_EVER", true));
                        io.sentry.android.core.performance.f.d(this);
                    }
                } catch (IOException e6) {
                    e = e6;
                    str4 = strN9;
                    str5 = strN10;
                }
            } else {
                ye4.c("NativeLibExt", "APK not available");
                str4 = strN9;
                str5 = strN10;
                strArr = strArrK;
                iArr = iArrM2;
            }
            AndroidCryptoProtectDataCallbackHolder.SetAndroidCryptoProtectDataCallback(if1.a);
            r0 = NativeLibTvExt.a;
            applicationContext = getApplicationContext();
            applicationContext.getClass();
            locale = Locale.getDefault();
            filesDir = applicationContext.getFilesDir();
            if (filesDir != null) {
                cacheDir = applicationContext.getCacheDir();
                if (cacheDir == null) {
                    ye4.c("NativeLibExt", "init: internalCacheDir is null");
                } else {
                    externalFilesDir = applicationContext.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                    if (externalFilesDir != null || (absolutePath = externalFilesDir.getAbsolutePath()) == null) {
                        str7 = "";
                    } else {
                        str7 = absolutePath;
                    }
                    applicationInfo = applicationContext.getApplicationInfo();
                    applicationInfo.getClass();
                    i = Build.VERSION.SDK_INT;
                    applicationContext2 = applicationContext.getApplicationContext();
                    applicationContext2.getClass();
                    string = Build.SERIAL;
                    string.getClass();
                    if (applicationInfo.targetSdkVersion > 25) {
                        string = applicationContext2.getSharedPreferences(applicationContext2.getPackageName() + "_preferences", 0).getString("DEVICE_SERIAL_NUMBER", "");
                        string.getClass();
                    } else {
                        SharedPreferences sharedPreferences12 = applicationContext2.getSharedPreferences(applicationContext2.getPackageName() + "_preferences", 0);
                        sharedPreferences12.getClass();
                        SharedPreferences.Editor editorEdit1120 = sharedPreferences12.edit();
                        editorEdit1120.getClass();
                        editorEdit1120.putString("DEVICE_SERIAL_NUMBER", string);
                        editorEdit1120.apply();
                    }
                    String str111 = string;
                    String string13 = android.provider.Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
                    if (hm3.h(applicationContext, "android.permission.RECORD_AUDIO") == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i > 29) {
                        zIsExternalStorageManager = Environment.isExternalStorageManager();
                    } else if (hm3.h(applicationContext, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                        zIsExternalStorageManager = true;
                    } else {
                        zIsExternalStorageManager = false;
                    }
                    boolean z117 = zIsExternalStorageManager;
                    boolean zHasSystemFeature4 = applicationContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
                    Object systemService7 = applicationContext.getSystemService("connectivity");
                    systemService7.getClass();
                    defaultProxy = ((ConnectivityManager) systemService7).getDefaultProxy();
                    if (defaultProxy != null) {
                        host = defaultProxy.getHost();
                    } else {
                        obj = strArrK;
                    }
                    if (obj == null) {
                        obj = host;
                        r45 = "";
                    } else {
                        obj = host;
                        r45 = obj;
                    }
                    Object systemService8 = applicationContext.getSystemService("connectivity");
                    systemService8.getClass();
                    defaultProxy2 = ((ConnectivityManager) systemService8).getDefaultProxy();
                    if (defaultProxy2 != null) {
                        port = defaultProxy2.getPort();
                    } else {
                        port = 0;
                    }
                    Point pointT10 = new j93(applicationContext).T();
                    zy4Var = new zy4(filesDir.getAbsolutePath(), cacheDir.getAbsolutePath(), str7, locale.getLanguage(), locale.getCountry(), string13, str111, z, z117, zHasSystemFeature4, r45, port, pointT10.x, pointT10.y);
                }
                if (zy4Var != 0) {
                    r0.d(zy4Var, strN);
                }
                remoteControlApplication = (RemoteControlApplication) this;
                remoteControlApplication.C = new ye1(new wk0(remoteControlApplication, (byte) 26), AppType.RemoteControl, remoteControlApplication.d(), new y46((Object) remoteControlApplication, (byte) 5));
                companion = Settings.i;
                settingsN = companion.n();
                if (boolW0 != 0) {
                    Settings.k(gv6.MACHINE, ov6.P_USE_TESTMASTER_KEYS, boolW0.booleanValue());
                }
                if (strN3 != null) {
                    Settings.h(rt0.P_CUSTOM_ROUTER, strN3);
                }
                if (strN4 != null) {
                    Settings.h(rt0.P_CUSTOM_KEEPALIVESERVER, strN4);
                }
                if (strN5 != null) {
                    Settings.h(rt0.P_CLIENT_STATISTICS_DEBUG, strN5);
                }
                if (iArrM != null) {
                    Settings.i(rt0.P_SECURITY_WHITELIST_BUDDY_ACCOUNT_ID, iArrM);
                }
                if (iArr != null) {
                    Settings.i(rt0.P_SECURITY_WHITELIST_COMPANY_ID, iArr);
                }
                if (bool2 != null) {
                    Settings.k(gv6.MACHINE, rt0.P_MDV2_UI_SWITCH, bool2.booleanValue());
                }
                if (strArr != null) {
                    gv6 gv6Var8 = gv6.MACHINE;
                    Settings.l(strArr);
                    boolean zB6 = cx.B0("127.0.0.1", strArr);
                    Settings.k(gv6Var8, rt0.P_GENERAL_LAN_ONLY, zB6);
                    Settings.k(gv6Var8, rt0.P_GENERAL_DIRECTLAN, zB6);
                }
                if (str4 != null) {
                    Settings.h(rt0.P_CONFIGURATION_URL, str4);
                }
                if (str5 != null) {
                    Settings.h(rt0.P_REVISION_URL, str5);
                }
                if (r9 != 0) {
                    Settings.j(gv6.MACHINE, rt0.P_CONSOLE_URL_PREFIX, r9.intValue());
                }
                if (str3 != null) {
                    Settings.h(rt0.P_WEBAPI_URL_PREFIX, str3);
                }
                if (r6 != 0) {
                    Settings.j(gv6.CLIENT, rt0.P_AUTHHOST_URL_PREFIX, r6.intValue());
                }
                if (r7 != 0) {
                    Settings.j(gv6.MACHINE, rt0.P_ONEAPI_GATEWAY, r7.intValue());
                }
                if (strN15 != null) {
                    Settings.h(rt0.P_ONEAPI_GATEWAY_CUSTOMHOST, strN15);
                }
                if (strN16 != 0) {
                    kh.k(settingsN, strN16);
                }
                if (boolW1 != 0) {
                    sharedPreferences7 = h57.a;
                    if (sharedPreferences7 != null) {
                        im3.e0("sharedPreferences");
                        throw strArrK;
                    }
                    SharedPreferences.Editor editorEdit11110 = sharedPreferences7.edit();
                    editorEdit11110.getClass();
                    editorEdit11110.putBoolean("VERBOSE_LOGGING", boolW1.booleanValue());
                    editorEdit11110.apply();
                }
                sharedPreferences = h57.a;
                if (sharedPreferences != null) {
                    im3.e0("sharedPreferences");
                    throw strArrK;
                }
                ye4.a.h(sharedPreferences.getBoolean("VERBOSE_LOGGING", false));
                new wv6(this, companion.n(), new yl7((byte) 28));
                b = 4;
                if (r0.f()) {
                    applicationContext4 = remoteControlApplication.getApplicationContext();
                    applicationContext4.getClass();
                    if (r0.f()) {
                        Context applicationContext15 = applicationContext4.getApplicationContext();
                        applicationContext15.getClass();
                        au8.V0 = applicationContext15.getApplicationContext();
                        AndroidKeyChainCallbackHolder.SetAndroidKeyChainCallback(wi.a);
                    }
                    tk1 tk1Var7 = g22.a;
                    im3.R(hm3.c(gk1.f901o), null, null, new y0(remoteControlApplication, z4 ? 1 : 0, b), 3);
                }
                sharedPreferences2 = h57.a;
                if (sharedPreferences2 != null) {
                    im3.e0("sharedPreferences");
                    throw null;
                }
                z2 = sharedPreferences2.getBoolean("IS_FIRST_START_EVER", true);
                if (z2) {
                    sharedPreferences6 = h57.a;
                    if (sharedPreferences6 != null) {
                        im3.e0("sharedPreferences");
                        throw null;
                    }
                    SharedPreferences.Editor editorEdit11111 = sharedPreferences6.edit();
                    editorEdit11111.getClass();
                    editorEdit11111.putInt("INPUT_METHOD_INT", 0);
                    editorEdit11111.putString("PREFERRED_RESOLUTION", "DontChange");
                    editorEdit11111.apply();
                }
                sharedPreferences3 = h57.a;
                if (sharedPreferences3 != null) {
                    im3.e0("sharedPreferences");
                    throw null;
                }
                if (sharedPreferences3.getInt("BUILD_VERSION", 0) < 298) {
                    SharedPreferences.Editor editorEdit11112 = sharedPreferences3.edit();
                    editorEdit11112.getClass();
                    editorEdit11112.putInt("BUILD_VERSION", 298);
                    editorEdit11112.apply();
                    if (!z2) {
                        sharedPreferences5 = h57.a;
                        if (sharedPreferences5 != null) {
                            im3.e0("sharedPreferences");
                            throw null;
                        }
                        if (sharedPreferences5.contains("REMOVE_WALLPAPER")) {
                            boolean z118 = sharedPreferences5.getBoolean("REMOVE_WALLPAPER", true);
                            companion.n();
                            Settings.k(gv6.USER, ca8.P_REMOTE_REMOVEWALLPAPER, z118);
                            SharedPreferences.Editor editorEdit11113 = sharedPreferences5.edit();
                            editorEdit11113.getClass();
                            editorEdit11113.remove("REMOVE_WALLPAPER");
                            editorEdit11113.apply();
                        }
                        if (sharedPreferences5.contains("SHOW_REMOTE_CURSOR")) {
                            boolean z119 = sharedPreferences5.getBoolean("SHOW_REMOTE_CURSOR", false);
                            companion.n();
                            Settings.k(gv6.USER, ca8.P_REMOTE_REMOTECURSOR, z119);
                            SharedPreferences.Editor editorEdit11114 = sharedPreferences5.edit();
                            editorEdit11114.getClass();
                            editorEdit11114.remove("SHOW_REMOTE_CURSOR");
                            editorEdit11114.apply();
                        }
                        if (sharedPreferences5.contains("ENABLE_REMOTE_AUDIO")) {
                            boolean z1110 = sharedPreferences5.getBoolean("ENABLE_REMOTE_AUDIO", true);
                            companion.n();
                            Settings.k(gv6.USER, ca8.P_REMOTEAUDIO_RECEIVE_ENABLED, z1110);
                            SharedPreferences.Editor editorEdit11115 = sharedPreferences5.edit();
                            editorEdit11115.getClass();
                            editorEdit11115.remove("ENABLE_REMOTE_AUDIO");
                            editorEdit11115.apply();
                        }
                    }
                }
                Settings settingsN8 = companion.n();
                string2 = Settings.e().toString();
                string2.getClass();
                strValueOf = String.valueOf(10000);
                strM = ua5.m("And", Build.VERSION.RELEASE);
                if (strM.length() > 10) {
                    strM = strM.substring(0, 10);
                }
                property = System.getProperty("os.arch");
                sb2 = new StringBuilder();
                String[] strArr8 = Build.SUPPORTED_ABIS;
                strArr8.getClass();
                while (i2 < r12) {
                    sb2.append(str12 + " ");
                }
                string3 = sb2.toString();
                SimpleDateFormat simpleDateFormat7 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US);
                Object objClone7 = settingsN8.h.clone();
                objClone7.getClass();
                String str112 = simpleDateFormat7.format((Date) objClone7);
                str8 = simpleDateFormat7.format(new Date(Build.TIME));
                sbP = ua5.p("<br /><br /><br /><span style=\"color:rgb(0,0,240)\">  TeamViewer start: ", str112, "<br />  Version: ");
                str9 = n37.f;
                if (str9 != null) {
                    im3.e0("versionString");
                    throw null;
                }
                e41.t(sbP, str9, "(298)<br />  ID:      ", string2, "<br />  License: ");
                e41.t(sbP, strValueOf, "<br />  OS:      ", strM, "<br />  Arch:    ");
                e41.t(sbP, property, "<br />  Abis:    ", string3, "<br /><br />  Device:  <br />");
                sbP.append("  Model:\t  ");
                sbP.append(Build.MODEL);
                sbP.append("<br />");
                sbP.append("  Release:  ");
                sbP.append(ad8.a());
                sbP.append("<br />");
                sbP.append("  Board:\t  ");
                sbP.append(Build.BOARD);
                sbP.append("<br />");
                sbP.append("  Brand:\t  ");
                sbP.append(Build.BRAND);
                sbP.append("<br />");
                sbP.append("  Device:\t  ");
                sbP.append(Build.DEVICE);
                sbP.append("<br />");
                sbP.append("  Display:\t  ");
                sbP.append(Build.DISPLAY);
                sbP.append("<br />");
                sbP.append("  Fingerprint: ");
                sbP.append(Build.FINGERPRINT);
                sbP.append("<br />");
                sbP.append("  Host:\t      ");
                sbP.append(Build.HOST);
                sbP.append("<br />");
                sbP.append("  ID:\t      ");
                sbP.append(Build.ID);
                sbP.append("<br />");
                sbP.append("  Product:\t  ");
                sbP.append(Build.PRODUCT);
                sbP.append("<br />");
                sbP.append("  Tags:\t      ");
                sbP.append(Build.TAGS);
                sbP.append("<br />");
                sbP.append("  Time:\t      ");
                sbP.append(str8);
                sbP.append("<br />");
                sbP.append("  Type:\t      ");
                sbP.append(Build.TYPE);
                sbP.append("<br />");
                sbP.append("  </span><br /><br /><br />");
                ye4.a("VersionInfo:", sbP.toString());
                n1Var = io.sentry.android.core.n1.q;
                if (n1Var != null) {
                    im3.e0("instance");
                    throw null;
                }
                n1Var.k();
                Settings.i.n();
                gv6Var = gv6.MACHINE;
                if (Settings.b(gv6Var, ov6.P_MID_VERSION) < 2) {
                    ye4.a.g("TVApplication", "Forcing MID version update");
                    ov6 ov6Var7 = ov6.P_MID_FORCE_UPDATE;
                    Settings.j(gv6Var, ov6Var7, Settings.b(gv6Var, ov6Var7) | 1);
                }
                ye4.a("App startup", "Network startup");
                BackendContainerAndroid.GetInstance().GetFrontendDispatcher();
                applicationContext3 = getApplicationContext();
                applicationContext3.getClass();
                j93 j93Var7 = new j93(applicationContext3);
                Point pointT11 = j93Var7.T();
                ye4.a("LocalConstraints", "Display is " + pointT11.x + "x" + pointT11.y);
                displayMetrics = applicationContext3.getResources().getDisplayMetrics();
                float f13 = (float) displayMetrics.widthPixels;
                float f14 = displayMetrics.xdpi;
                double d1117 = (double) (f13 / f14);
                double d1118 = displayMetrics.heightPixels / displayMetrics.ydpi;
                dAbs = Math.abs(f14 / displayMetrics.densityDpi);
                if (0.75d <= dAbs || dAbs > 1.25d) {
                    int i117 = displayMetrics.widthPixels;
                    int i118 = displayMetrics.densityDpi;
                    double d1119 = i117 / i118;
                    double d11110 = displayMetrics.heightPixels / i118;
                    dSqrt = Math.sqrt((d11110 * d11110) + (d1119 * d1119));
                } else {
                    dSqrt = Math.sqrt((d1118 * d1118) + (d1117 * d1117));
                }
                ye4.a("LocalConstraints", "ScreenDiagonal is " + dSqrt);
                ye4.a("LocalConstraints", "DPI is " + j93Var7.R());
                ye4.a("LocalConstraints", "HardwareMenuButton is " + ViewConfiguration.get(applicationContext3).hasPermanentMenuKey());
                ye4.a("LocalConstraints", "AndroidTV is " + j93Var7.W());
                zDeviceHasKey = KeyCharacterMap.deviceHasKey(4);
                boolean zDeviceHasKey8 = KeyCharacterMap.deviceHasKey(3);
                if (zDeviceHasKey || !zDeviceHasKey8) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ye4.a("LocalConstraints", "NavigationBar is " + z3);
                if (applicationContext3.getResources().getBoolean(Resources.getSystem().getIdentifier("config_hasRecents", "bool", "android"))) {
                    o53Var = o53.n;
                } else {
                    o53Var = o53.f1630o;
                }
                ye4.a("LocalConstraints", "RecentApps is " + o53Var);
                Uri uri7 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
                AudioAttributes audioAttributes7 = Notification.AUDIO_ATTRIBUTES_DEFAULT;
                String string14 = remoteControlApplication.getString(R.string.tv_general_notification_channel_name);
                string14.getClass();
                r55 r55Var7 = new r55(getApplicationContext());
                NotificationChannel notificationChannel11114 = new NotificationChannel("TV_GENERAL_NOTIFICATION_CHANNEL", string14, 2);
                notificationChannel11114.setDescription(null);
                notificationChannel11114.setGroup(null);
                notificationChannel11114.setShowBadge(false);
                notificationChannel11114.setSound(uri7, audioAttributes7);
                notificationChannel11114.enableLights(false);
                notificationChannel11114.setLightColor(0);
                notificationChannel11114.setVibrationPattern(null);
                notificationChannel11114.enableVibration(false);
                r55Var7.a.createNotificationChannel(notificationChannel11114);
                ArrayList<NotificationChannel> arrayList7 = new ArrayList();
                NotificationChannel notificationChannel11115 = new NotificationChannel("TV_CHAT_MESSAGES_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_chat_channel_name), 3);
                notificationChannel11115.setShowBadge(true);
                notificationChannel11115.enableLights(true);
                notificationChannel11115.enableVibration(true);
                notificationChannel11115.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                arrayList7.add(notificationChannel11115);
                NotificationChannel notificationChannel11116 = new NotificationChannel("TV_LICENSE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_license_notification_channel_name), 3);
                notificationChannel11116.setDescription(remoteControlApplication.getString(R.string.tv_license_notification_channel_description));
                notificationChannel11116.setShowBadge(true);
                notificationChannel11116.enableVibration(true);
                arrayList7.add(notificationChannel11116);
                NotificationChannel notificationChannel11117 = new NotificationChannel("TV_DEVICE_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_name), 4);
                notificationChannel11117.setDescription(remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_description));
                notificationChannel11117.setShowBadge(true);
                notificationChannel11117.enableVibration(true);
                notificationChannel11117.enableLights(true);
                notificationChannel11117.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                arrayList7.add(notificationChannel11117);
                NotificationChannel notificationChannel11118 = new NotificationChannel("TV_MONITORING_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_name), 3);
                notificationChannel11118.setDescription(remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_description));
                notificationChannel11118.setShowBadge(true);
                notificationChannel11118.enableVibration(true);
                notificationChannel11118.enableLights(true);
                arrayList7.add(notificationChannel11118);
                NotificationChannel notificationChannel11119 = new NotificationChannel("TV_CONDITIONAL_ACCESS_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_name), 4);
                notificationChannel11119.setDescription(remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_description));
                notificationChannel11119.setShowBadge(true);
                notificationChannel11119.enableVibration(true);
                notificationChannel11119.enableLights(true);
                notificationChannel11119.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                arrayList7.add(notificationChannel11119);
                NotificationChannel notificationChannel111110 = new NotificationChannel("TV_TRUSTED_DEVICE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_name), 4);
                notificationChannel111110.setDescription(remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_description));
                notificationChannel111110.setShowBadge(true);
                notificationChannel111110.enableVibration(true);
                notificationChannel111110.enableLights(true);
                notificationChannel111110.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                arrayList7.add(notificationChannel111110);
                notificationManager = (NotificationManager) remoteControlApplication.getSystemService(NotificationManager.class);
                while (r0.hasNext()) {
                    if (notificationManager != null) {
                        notificationManager.createNotificationChannel(notificationChannel8);
                    }
                }
                c();
                b();
                ea7.a(this);
                bu7.CACHEDTHREADPOOL.a(new io.sentry.b5((Object) this, (byte) 25));
                sharedPreferences4 = h57.a;
                if (sharedPreferences4 != null) {
                    im3.e0("sharedPreferences");
                    throw null;
                }
                a(sharedPreferences4.getBoolean("IS_FIRST_START_EVER", true));
                io.sentry.android.core.performance.f.d(this);
            }
            ye4.c("NativeLibExt", "init: internalStorageDir is null.");
            zy4Var = strArrK;
            if (zy4Var != 0) {
                r0.d(zy4Var, strN);
            }
            remoteControlApplication = (RemoteControlApplication) this;
            remoteControlApplication.C = new ye1(new wk0(remoteControlApplication, (byte) 26), AppType.RemoteControl, remoteControlApplication.d(), new y46((Object) remoteControlApplication, (byte) 5));
            companion = Settings.i;
            settingsN = companion.n();
            if (boolW0 != 0) {
                Settings.k(gv6.MACHINE, ov6.P_USE_TESTMASTER_KEYS, boolW0.booleanValue());
            }
            if (strN3 != null) {
                Settings.h(rt0.P_CUSTOM_ROUTER, strN3);
            }
            if (strN4 != null) {
                Settings.h(rt0.P_CUSTOM_KEEPALIVESERVER, strN4);
            }
            if (strN5 != null) {
                Settings.h(rt0.P_CLIENT_STATISTICS_DEBUG, strN5);
            }
            if (iArrM != null) {
                Settings.i(rt0.P_SECURITY_WHITELIST_BUDDY_ACCOUNT_ID, iArrM);
            }
            if (iArr != null) {
                Settings.i(rt0.P_SECURITY_WHITELIST_COMPANY_ID, iArr);
            }
            if (bool2 != null) {
                Settings.k(gv6.MACHINE, rt0.P_MDV2_UI_SWITCH, bool2.booleanValue());
            }
            if (strArr != null) {
                gv6 gv6Var9 = gv6.MACHINE;
                Settings.l(strArr);
                boolean zB7 = cx.B0("127.0.0.1", strArr);
                Settings.k(gv6Var9, rt0.P_GENERAL_LAN_ONLY, zB7);
                Settings.k(gv6Var9, rt0.P_GENERAL_DIRECTLAN, zB7);
            }
            if (str4 != null) {
                Settings.h(rt0.P_CONFIGURATION_URL, str4);
            }
            if (str5 != null) {
                Settings.h(rt0.P_REVISION_URL, str5);
            }
            if (r9 != 0) {
                Settings.j(gv6.MACHINE, rt0.P_CONSOLE_URL_PREFIX, r9.intValue());
            }
            if (str3 != null) {
                Settings.h(rt0.P_WEBAPI_URL_PREFIX, str3);
            }
            if (r6 != 0) {
                Settings.j(gv6.CLIENT, rt0.P_AUTHHOST_URL_PREFIX, r6.intValue());
            }
            if (r7 != 0) {
                Settings.j(gv6.MACHINE, rt0.P_ONEAPI_GATEWAY, r7.intValue());
            }
            if (strN15 != null) {
                Settings.h(rt0.P_ONEAPI_GATEWAY_CUSTOMHOST, strN15);
            }
            if (strN16 != 0) {
                kh.k(settingsN, strN16);
            }
            if (boolW1 != 0) {
                sharedPreferences7 = h57.a;
                if (sharedPreferences7 != null) {
                    im3.e0("sharedPreferences");
                    throw strArrK;
                }
                SharedPreferences.Editor editorEdit11116 = sharedPreferences7.edit();
                editorEdit11116.getClass();
                editorEdit11116.putBoolean("VERBOSE_LOGGING", boolW1.booleanValue());
                editorEdit11116.apply();
            }
            sharedPreferences = h57.a;
            if (sharedPreferences != null) {
                im3.e0("sharedPreferences");
                throw strArrK;
            }
            ye4.a.h(sharedPreferences.getBoolean("VERBOSE_LOGGING", false));
            new wv6(this, companion.n(), new yl7((byte) 28));
            b = 4;
            if (r0.f()) {
                applicationContext4 = remoteControlApplication.getApplicationContext();
                applicationContext4.getClass();
                if (r0.f()) {
                    Context applicationContext16 = applicationContext4.getApplicationContext();
                    applicationContext16.getClass();
                    au8.V0 = applicationContext16.getApplicationContext();
                    AndroidKeyChainCallbackHolder.SetAndroidKeyChainCallback(wi.a);
                }
                tk1 tk1Var8 = g22.a;
                im3.R(hm3.c(gk1.f901o), null, null, new y0(remoteControlApplication, z4 ? 1 : 0, b), 3);
            }
            sharedPreferences2 = h57.a;
            if (sharedPreferences2 != null) {
                im3.e0("sharedPreferences");
                throw null;
            }
            z2 = sharedPreferences2.getBoolean("IS_FIRST_START_EVER", true);
            if (z2) {
                sharedPreferences6 = h57.a;
                if (sharedPreferences6 != null) {
                    im3.e0("sharedPreferences");
                    throw null;
                }
                SharedPreferences.Editor editorEdit11117 = sharedPreferences6.edit();
                editorEdit11117.getClass();
                editorEdit11117.putInt("INPUT_METHOD_INT", 0);
                editorEdit11117.putString("PREFERRED_RESOLUTION", "DontChange");
                editorEdit11117.apply();
            }
            sharedPreferences3 = h57.a;
            if (sharedPreferences3 != null) {
                im3.e0("sharedPreferences");
                throw null;
            }
            if (sharedPreferences3.getInt("BUILD_VERSION", 0) < 298) {
                SharedPreferences.Editor editorEdit11118 = sharedPreferences3.edit();
                editorEdit11118.getClass();
                editorEdit11118.putInt("BUILD_VERSION", 298);
                editorEdit11118.apply();
                if (!z2) {
                    sharedPreferences5 = h57.a;
                    if (sharedPreferences5 != null) {
                        im3.e0("sharedPreferences");
                        throw null;
                    }
                    if (sharedPreferences5.contains("REMOVE_WALLPAPER")) {
                        boolean z1111 = sharedPreferences5.getBoolean("REMOVE_WALLPAPER", true);
                        companion.n();
                        Settings.k(gv6.USER, ca8.P_REMOTE_REMOVEWALLPAPER, z1111);
                        SharedPreferences.Editor editorEdit11119 = sharedPreferences5.edit();
                        editorEdit11119.getClass();
                        editorEdit11119.remove("REMOVE_WALLPAPER");
                        editorEdit11119.apply();
                    }
                    if (sharedPreferences5.contains("SHOW_REMOTE_CURSOR")) {
                        boolean z1112 = sharedPreferences5.getBoolean("SHOW_REMOTE_CURSOR", false);
                        companion.n();
                        Settings.k(gv6.USER, ca8.P_REMOTE_REMOTECURSOR, z1112);
                        SharedPreferences.Editor editorEdit111110 = sharedPreferences5.edit();
                        editorEdit111110.getClass();
                        editorEdit111110.remove("SHOW_REMOTE_CURSOR");
                        editorEdit111110.apply();
                    }
                    if (sharedPreferences5.contains("ENABLE_REMOTE_AUDIO")) {
                        boolean z1113 = sharedPreferences5.getBoolean("ENABLE_REMOTE_AUDIO", true);
                        companion.n();
                        Settings.k(gv6.USER, ca8.P_REMOTEAUDIO_RECEIVE_ENABLED, z1113);
                        SharedPreferences.Editor editorEdit111111 = sharedPreferences5.edit();
                        editorEdit111111.getClass();
                        editorEdit111111.remove("ENABLE_REMOTE_AUDIO");
                        editorEdit111111.apply();
                    }
                }
            }
            Settings settingsN9 = companion.n();
            string2 = Settings.e().toString();
            string2.getClass();
            strValueOf = String.valueOf(10000);
            strM = ua5.m("And", Build.VERSION.RELEASE);
            if (strM.length() > 10) {
                strM = strM.substring(0, 10);
            }
            property = System.getProperty("os.arch");
            sb2 = new StringBuilder();
            String[] strArr9 = Build.SUPPORTED_ABIS;
            strArr9.getClass();
            while (i2 < r12) {
                sb2.append(str12 + " ");
            }
            string3 = sb2.toString();
            SimpleDateFormat simpleDateFormat8 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US);
            Object objClone8 = settingsN9.h.clone();
            objClone8.getClass();
            String str113 = simpleDateFormat8.format((Date) objClone8);
            str8 = simpleDateFormat8.format(new Date(Build.TIME));
            sbP = ua5.p("<br /><br /><br /><span style=\"color:rgb(0,0,240)\">  TeamViewer start: ", str113, "<br />  Version: ");
            str9 = n37.f;
            if (str9 != null) {
                im3.e0("versionString");
                throw null;
            }
            e41.t(sbP, str9, "(298)<br />  ID:      ", string2, "<br />  License: ");
            e41.t(sbP, strValueOf, "<br />  OS:      ", strM, "<br />  Arch:    ");
            e41.t(sbP, property, "<br />  Abis:    ", string3, "<br /><br />  Device:  <br />");
            sbP.append("  Model:\t  ");
            sbP.append(Build.MODEL);
            sbP.append("<br />");
            sbP.append("  Release:  ");
            sbP.append(ad8.a());
            sbP.append("<br />");
            sbP.append("  Board:\t  ");
            sbP.append(Build.BOARD);
            sbP.append("<br />");
            sbP.append("  Brand:\t  ");
            sbP.append(Build.BRAND);
            sbP.append("<br />");
            sbP.append("  Device:\t  ");
            sbP.append(Build.DEVICE);
            sbP.append("<br />");
            sbP.append("  Display:\t  ");
            sbP.append(Build.DISPLAY);
            sbP.append("<br />");
            sbP.append("  Fingerprint: ");
            sbP.append(Build.FINGERPRINT);
            sbP.append("<br />");
            sbP.append("  Host:\t      ");
            sbP.append(Build.HOST);
            sbP.append("<br />");
            sbP.append("  ID:\t      ");
            sbP.append(Build.ID);
            sbP.append("<br />");
            sbP.append("  Product:\t  ");
            sbP.append(Build.PRODUCT);
            sbP.append("<br />");
            sbP.append("  Tags:\t      ");
            sbP.append(Build.TAGS);
            sbP.append("<br />");
            sbP.append("  Time:\t      ");
            sbP.append(str8);
            sbP.append("<br />");
            sbP.append("  Type:\t      ");
            sbP.append(Build.TYPE);
            sbP.append("<br />");
            sbP.append("  </span><br /><br /><br />");
            ye4.a("VersionInfo:", sbP.toString());
            n1Var = io.sentry.android.core.n1.q;
            if (n1Var != null) {
                im3.e0("instance");
                throw null;
            }
            n1Var.k();
            Settings.i.n();
            gv6Var = gv6.MACHINE;
            if (Settings.b(gv6Var, ov6.P_MID_VERSION) < 2) {
                ye4.a.g("TVApplication", "Forcing MID version update");
                ov6 ov6Var8 = ov6.P_MID_FORCE_UPDATE;
                Settings.j(gv6Var, ov6Var8, Settings.b(gv6Var, ov6Var8) | 1);
            }
            ye4.a("App startup", "Network startup");
            BackendContainerAndroid.GetInstance().GetFrontendDispatcher();
            applicationContext3 = getApplicationContext();
            applicationContext3.getClass();
            j93 j93Var8 = new j93(applicationContext3);
            Point pointT12 = j93Var8.T();
            ye4.a("LocalConstraints", "Display is " + pointT12.x + "x" + pointT12.y);
            displayMetrics = applicationContext3.getResources().getDisplayMetrics();
            float f15 = (float) displayMetrics.widthPixels;
            float f16 = displayMetrics.xdpi;
            double d11111 = (double) (f15 / f16);
            double d11112 = displayMetrics.heightPixels / displayMetrics.ydpi;
            dAbs = Math.abs(f16 / displayMetrics.densityDpi);
            if (0.75d <= dAbs) {
                int i119 = displayMetrics.widthPixels;
                int i1110 = displayMetrics.densityDpi;
                double d11113 = i119 / i1110;
                double d11114 = displayMetrics.heightPixels / i1110;
                dSqrt = Math.sqrt((d11114 * d11114) + (d11113 * d11113));
            } else {
                int i1111 = displayMetrics.widthPixels;
                int i1112 = displayMetrics.densityDpi;
                double d11115 = i1111 / i1112;
                double d11116 = displayMetrics.heightPixels / i1112;
                dSqrt = Math.sqrt((d11116 * d11116) + (d11115 * d11115));
            }
            ye4.a("LocalConstraints", "ScreenDiagonal is " + dSqrt);
            ye4.a("LocalConstraints", "DPI is " + j93Var8.R());
            ye4.a("LocalConstraints", "HardwareMenuButton is " + ViewConfiguration.get(applicationContext3).hasPermanentMenuKey());
            ye4.a("LocalConstraints", "AndroidTV is " + j93Var8.W());
            zDeviceHasKey = KeyCharacterMap.deviceHasKey(4);
            boolean zDeviceHasKey9 = KeyCharacterMap.deviceHasKey(3);
            if (zDeviceHasKey) {
                z3 = true;
            } else {
                z3 = true;
            }
            ye4.a("LocalConstraints", "NavigationBar is " + z3);
            if (applicationContext3.getResources().getBoolean(Resources.getSystem().getIdentifier("config_hasRecents", "bool", "android"))) {
                o53Var = o53.n;
            } else {
                o53Var = o53.f1630o;
            }
            ye4.a("LocalConstraints", "RecentApps is " + o53Var);
            Uri uri8 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
            AudioAttributes audioAttributes8 = Notification.AUDIO_ATTRIBUTES_DEFAULT;
            String string15 = remoteControlApplication.getString(R.string.tv_general_notification_channel_name);
            string15.getClass();
            r55 r55Var8 = new r55(getApplicationContext());
            NotificationChannel notificationChannel111111 = new NotificationChannel("TV_GENERAL_NOTIFICATION_CHANNEL", string15, 2);
            notificationChannel111111.setDescription(null);
            notificationChannel111111.setGroup(null);
            notificationChannel111111.setShowBadge(false);
            notificationChannel111111.setSound(uri8, audioAttributes8);
            notificationChannel111111.enableLights(false);
            notificationChannel111111.setLightColor(0);
            notificationChannel111111.setVibrationPattern(null);
            notificationChannel111111.enableVibration(false);
            r55Var8.a.createNotificationChannel(notificationChannel111111);
            ArrayList<NotificationChannel> arrayList8 = new ArrayList();
            NotificationChannel notificationChannel111112 = new NotificationChannel("TV_CHAT_MESSAGES_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_chat_channel_name), 3);
            notificationChannel111112.setShowBadge(true);
            notificationChannel111112.enableLights(true);
            notificationChannel111112.enableVibration(true);
            notificationChannel111112.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
            arrayList8.add(notificationChannel111112);
            NotificationChannel notificationChannel111113 = new NotificationChannel("TV_LICENSE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_license_notification_channel_name), 3);
            notificationChannel111113.setDescription(remoteControlApplication.getString(R.string.tv_license_notification_channel_description));
            notificationChannel111113.setShowBadge(true);
            notificationChannel111113.enableVibration(true);
            arrayList8.add(notificationChannel111113);
            NotificationChannel notificationChannel111114 = new NotificationChannel("TV_DEVICE_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_name), 4);
            notificationChannel111114.setDescription(remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_description));
            notificationChannel111114.setShowBadge(true);
            notificationChannel111114.enableVibration(true);
            notificationChannel111114.enableLights(true);
            notificationChannel111114.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
            arrayList8.add(notificationChannel111114);
            NotificationChannel notificationChannel111115 = new NotificationChannel("TV_MONITORING_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_name), 3);
            notificationChannel111115.setDescription(remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_description));
            notificationChannel111115.setShowBadge(true);
            notificationChannel111115.enableVibration(true);
            notificationChannel111115.enableLights(true);
            arrayList8.add(notificationChannel111115);
            NotificationChannel notificationChannel111116 = new NotificationChannel("TV_CONDITIONAL_ACCESS_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_name), 4);
            notificationChannel111116.setDescription(remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_description));
            notificationChannel111116.setShowBadge(true);
            notificationChannel111116.enableVibration(true);
            notificationChannel111116.enableLights(true);
            notificationChannel111116.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
            arrayList8.add(notificationChannel111116);
            NotificationChannel notificationChannel111117 = new NotificationChannel("TV_TRUSTED_DEVICE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_name), 4);
            notificationChannel111117.setDescription(remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_description));
            notificationChannel111117.setShowBadge(true);
            notificationChannel111117.enableVibration(true);
            notificationChannel111117.enableLights(true);
            notificationChannel111117.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
            arrayList8.add(notificationChannel111117);
            notificationManager = (NotificationManager) remoteControlApplication.getSystemService(NotificationManager.class);
            while (r0.hasNext()) {
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannel8);
                }
            }
            c();
            b();
            ea7.a(this);
            bu7.CACHEDTHREADPOOL.a(new io.sentry.b5((Object) this, (byte) 25));
            sharedPreferences4 = h57.a;
            if (sharedPreferences4 != null) {
                im3.e0("sharedPreferences");
                throw null;
            }
            a(sharedPreferences4.getBoolean("IS_FIRST_START_EVER", true));
            io.sentry.android.core.performance.f.d(this);
        }
        kk7.p = new kk7(this);
        ye4Var = ye4.a;
        luVar = new lu(this);
        synchronized (ye4Var) {
            ye4.b = luVar;
            ye4.a("App startup", "TeamViewer startup");
            Context applicationContext17 = getApplicationContext();
            applicationContext17.getClass();
            d82.M = applicationContext17;
            str = "unknown";
            properties = new Properties();
            pm8.x(properties, new File(getFilesDir(), "customsettings.cfg"));
            externalStorageState = Environment.getExternalStorageState();
            externalStorageState.getClass();
            if ("mounted".equals(externalStorageState)) {
                String externalStorageState3 = Environment.getExternalStorageState();
                externalStorageState3.getClass();
                str = externalStorageState3;
                if ("mounted_ro".equals(str)) {
                    pm8.x(properties, new File(getExternalFilesDir(null), "customsettings.cfg"));
                    ye4.a("ServiceManager", "verified");
                } else {
                    ye4.a("ServiceManager", "startup");
                }
            } else {
                pm8.x(properties, new File(getExternalFilesDir(null), "customsettings.cfg"));
                ye4.a("ServiceManager", "verified");
            }
            strN = mo8.n("serverenvironment", properties);
            strN2 = mo8.n("usetestmaster", properties);
            if (strN2 != null) {
                boolW0 = ub7.w0(strN2);
            } else {
                boolW0 = null;
            }
            strN3 = mo8.n("customrouter", properties);
            strN4 = mo8.n("keepaliveservername", properties);
            strN5 = mo8.n("clientstatisticsdebug", properties);
            strN6 = mo8.n("useverboselogging", properties);
            if (strN6 != null) {
                boolW1 = ub7.w0(strN6);
            } else {
                boolW1 = null;
            }
            iArrM = mo8.m("whitelistaccounts", properties);
            iArrM2 = mo8.m("whitelistcompanies", properties);
            strN7 = mo8.n("mdv2enable", properties);
            if (strN7 != null) {
                boolW2 = ub7.w0(strN7);
            } else {
                boolW2 = null;
            }
            strN8 = mo8.n("conditionalaccessservers", properties);
            if (strN8 != null) {
                strArrK = o67.k(o67.m(strN8));
            }
            strN9 = mo8.n("configurationurl", properties);
            strN10 = mo8.n("revisionurl", properties);
            strN11 = mo8.n("consoleurlprefix", properties);
            if (strN11 != null) {
                objO = bc7.O(strN11);
            } else {
                objO = strArrK;
            }
            r18 = objO;
            strN12 = mo8.n("webapiurlprefix", properties);
            strN13 = mo8.n("authHostUrlPrefix", properties);
            if (strN13 != null) {
                objO2 = bc7.O(strN13);
            } else {
                objO2 = strArrK;
            }
            strN14 = mo8.n("oneapigateway", properties);
            if (strN14 != null) {
                objO3 = bc7.O(strN14);
            } else {
                objO3 = strArrK;
            }
            strN15 = mo8.n("oneapigatewaycustomhost", properties);
            strN16 = mo8.n("byocconfigurationjson", properties);
            if (strN == null) {
            }
            bool = Boolean.TRUE;
            if (im3.n(boolW0, bool)) {
                ye4Var.g("ServiceManager", "Using test master key");
            }
            if (strN3 != null) {
                ye4Var.g("ServiceManager", "Using router ".concat(strN3));
            }
            if (strN4 != null) {
                ye4Var.g("ServiceManager", "Using keep alive ".concat(strN4));
            }
            if (strN5 != null) {
                ye4Var.g("ServiceManager", "Using statistics ".concat(strN5));
            }
            if (im3.n(boolW1, bool)) {
                ye4Var.g("ServiceManager", "Using verbose logging");
            }
            if (iArrM != null) {
                ye4Var.g("ServiceManager", "Whitelist accounts");
            }
            if (iArrM2 != null) {
                ye4Var.g("ServiceManager", "Whitelist companies");
            }
            if (im3.n(boolW2, bool)) {
                ye4.a("ServiceManager", "ManagedDevice V2 enabled");
            }
            if (strArrK != null) {
                if (cx.B0("127.0.0.1", strArrK)) {
                    ye4Var.g("ServiceManager", "Accepting Direct LAN/LAN Only connections");
                } else {
                    ye4Var.g("ServiceManager", "Using Conditional Access Servers");
                }
            }
            if (strN9 != null) {
                ye4Var.g("ServiceManager", "Using configuration url ".concat(strN9));
            }
            if (strN10 != null) {
                ye4Var.g("ServiceManager", "Using revision url ".concat(strN10));
            }
            if (r18 != 0) {
                r9 = r18;
            } else {
                r9 = r18;
            }
            if (strN12 != null) {
                r9 = r10;
                r9 = r10;
                str2 = strN12;
            } else {
                r9 = r10;
                r9 = r10;
                str2 = strN12;
            }
            r6 = objO2;
            if (r6 == 0) {
            }
            r7 = objO3;
            if (r7 == 0) {
            }
            if (strN15 != null) {
                ye4.a("ServiceManager", "Using oneApi Gateway Custom Host ".concat(strN15));
            }
            if (strN16 != 0) {
                ye4.a("ServiceManager", "Using BYOC configuration from custom settings");
            }
            Context applicationContext18 = getApplicationContext();
            applicationContext18.getClass();
            bool2 = boolW2;
            ye4.a("NativeLibExt", "Loading RemoteControl");
            an4 an4Var2 = new an4((byte) 3);
            str3 = str2;
            a65 a65Var3 = new a65((byte) 13);
            a65Var3.f302o = an4Var2;
            a65Var3.H0(applicationContext18, "RemoteControl");
            NativeLibTvExt.c = true;
            file = new File(applicationContext18.getApplicationInfo().sourceDir);
            if (file.exists()) {
                ye4.c("NativeLibExt", "APK not available");
                str4 = strN9;
                str5 = strN10;
                strArr = strArrK;
                iArr = iArrM2;
            } else {
                sb = new StringBuilder("<br /><br /><span style=\"color:rgb(0,0,240)\">Contained libraries: <br />");
                str5 = strN10;
                zipFile = new ZipFile(file, 1);
                enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement2 = enumerationEntries.nextElement();
                    zipEntryNextElement2.getClass();
                    zipEntry = zipEntryNextElement2;
                    zipFile = zipFile;
                    name = zipEntry.getName();
                    name.getClass();
                    enumerationEntries = enumerationEntries;
                    if (!bc7.G(false, name, ".so")) {
                        String name3 = zipEntry.getName();
                        str6 = strN9;
                        iArr = iArrM2;
                        str4 = str6;
                        strArr = strArrK;
                        sb.append(name3 + "\t" + zipEntry.getSize() + "\t" + zipEntry.getCrc() + "<br />");
                        strArrK = strArr;
                        iArrM2 = iArr;
                        strN9 = str4;
                    }
                }
                str4 = strN9;
                strArr = strArrK;
                iArr = iArrM2;
                sb.append("<br />");
                ye4.a("NativeLibExt", sb.toString());
                zipFile.close();
            }
            AndroidCryptoProtectDataCallbackHolder.SetAndroidCryptoProtectDataCallback(if1.a);
            r0 = NativeLibTvExt.a;
            applicationContext = getApplicationContext();
            applicationContext.getClass();
            locale = Locale.getDefault();
            filesDir = applicationContext.getFilesDir();
            if (filesDir != null) {
                cacheDir = applicationContext.getCacheDir();
                if (cacheDir == null) {
                    ye4.c("NativeLibExt", "init: internalCacheDir is null");
                } else {
                    externalFilesDir = applicationContext.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                    if (externalFilesDir != null) {
                        str7 = "";
                    } else {
                        str7 = "";
                    }
                    applicationInfo = applicationContext.getApplicationInfo();
                    applicationInfo.getClass();
                    i = Build.VERSION.SDK_INT;
                    applicationContext2 = applicationContext.getApplicationContext();
                    applicationContext2.getClass();
                    string = Build.SERIAL;
                    string.getClass();
                    if (applicationInfo.targetSdkVersion > 25) {
                        string = applicationContext2.getSharedPreferences(applicationContext2.getPackageName() + "_preferences", 0).getString("DEVICE_SERIAL_NUMBER", "");
                        string.getClass();
                    } else {
                        SharedPreferences sharedPreferences13 = applicationContext2.getSharedPreferences(applicationContext2.getPackageName() + "_preferences", 0);
                        sharedPreferences13.getClass();
                        SharedPreferences.Editor editorEdit1121 = sharedPreferences13.edit();
                        editorEdit1121.getClass();
                        editorEdit1121.putString("DEVICE_SERIAL_NUMBER", string);
                        editorEdit1121.apply();
                    }
                    String str114 = string;
                    String string16 = android.provider.Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
                    if (hm3.h(applicationContext, "android.permission.RECORD_AUDIO") == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i > 29) {
                        zIsExternalStorageManager = Environment.isExternalStorageManager();
                    } else if (hm3.h(applicationContext, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                        zIsExternalStorageManager = true;
                    } else {
                        zIsExternalStorageManager = false;
                    }
                    boolean z1114 = zIsExternalStorageManager;
                    boolean zHasSystemFeature5 = applicationContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
                    Object systemService9 = applicationContext.getSystemService("connectivity");
                    systemService9.getClass();
                    defaultProxy = ((ConnectivityManager) systemService9).getDefaultProxy();
                    if (defaultProxy != null) {
                        host = defaultProxy.getHost();
                    } else {
                        obj = strArrK;
                    }
                    if (obj == null) {
                        obj = host;
                        r45 = "";
                    } else {
                        obj = host;
                        r45 = obj;
                    }
                    Object systemService10 = applicationContext.getSystemService("connectivity");
                    systemService10.getClass();
                    defaultProxy2 = ((ConnectivityManager) systemService10).getDefaultProxy();
                    if (defaultProxy2 != null) {
                        port = defaultProxy2.getPort();
                    } else {
                        port = 0;
                    }
                    Point pointT13 = new j93(applicationContext).T();
                    zy4Var = new zy4(filesDir.getAbsolutePath(), cacheDir.getAbsolutePath(), str7, locale.getLanguage(), locale.getCountry(), string16, str114, z, z1114, zHasSystemFeature5, r45, port, pointT13.x, pointT13.y);
                }
                if (zy4Var != 0) {
                    r0.d(zy4Var, strN);
                }
                remoteControlApplication = (RemoteControlApplication) this;
                remoteControlApplication.C = new ye1(new wk0(remoteControlApplication, (byte) 26), AppType.RemoteControl, remoteControlApplication.d(), new y46((Object) remoteControlApplication, (byte) 5));
                companion = Settings.i;
                settingsN = companion.n();
                if (boolW0 != 0) {
                    Settings.k(gv6.MACHINE, ov6.P_USE_TESTMASTER_KEYS, boolW0.booleanValue());
                }
                if (strN3 != null) {
                    Settings.h(rt0.P_CUSTOM_ROUTER, strN3);
                }
                if (strN4 != null) {
                    Settings.h(rt0.P_CUSTOM_KEEPALIVESERVER, strN4);
                }
                if (strN5 != null) {
                    Settings.h(rt0.P_CLIENT_STATISTICS_DEBUG, strN5);
                }
                if (iArrM != null) {
                    Settings.i(rt0.P_SECURITY_WHITELIST_BUDDY_ACCOUNT_ID, iArrM);
                }
                if (iArr != null) {
                    Settings.i(rt0.P_SECURITY_WHITELIST_COMPANY_ID, iArr);
                }
                if (bool2 != null) {
                    Settings.k(gv6.MACHINE, rt0.P_MDV2_UI_SWITCH, bool2.booleanValue());
                }
                if (strArr != null) {
                    gv6 gv6Var10 = gv6.MACHINE;
                    Settings.l(strArr);
                    boolean zB8 = cx.B0("127.0.0.1", strArr);
                    Settings.k(gv6Var10, rt0.P_GENERAL_LAN_ONLY, zB8);
                    Settings.k(gv6Var10, rt0.P_GENERAL_DIRECTLAN, zB8);
                }
                if (str4 != null) {
                    Settings.h(rt0.P_CONFIGURATION_URL, str4);
                }
                if (str5 != null) {
                    Settings.h(rt0.P_REVISION_URL, str5);
                }
                if (r9 != 0) {
                    Settings.j(gv6.MACHINE, rt0.P_CONSOLE_URL_PREFIX, r9.intValue());
                }
                if (str3 != null) {
                    Settings.h(rt0.P_WEBAPI_URL_PREFIX, str3);
                }
                if (r6 != 0) {
                    Settings.j(gv6.CLIENT, rt0.P_AUTHHOST_URL_PREFIX, r6.intValue());
                }
                if (r7 != 0) {
                    Settings.j(gv6.MACHINE, rt0.P_ONEAPI_GATEWAY, r7.intValue());
                }
                if (strN15 != null) {
                    Settings.h(rt0.P_ONEAPI_GATEWAY_CUSTOMHOST, strN15);
                }
                if (strN16 != 0) {
                    kh.k(settingsN, strN16);
                }
                if (boolW1 != 0) {
                    sharedPreferences7 = h57.a;
                    if (sharedPreferences7 != null) {
                        im3.e0("sharedPreferences");
                        throw strArrK;
                    }
                    SharedPreferences.Editor editorEdit111112 = sharedPreferences7.edit();
                    editorEdit111112.getClass();
                    editorEdit111112.putBoolean("VERBOSE_LOGGING", boolW1.booleanValue());
                    editorEdit111112.apply();
                }
                sharedPreferences = h57.a;
                if (sharedPreferences != null) {
                    im3.e0("sharedPreferences");
                    throw strArrK;
                }
                ye4.a.h(sharedPreferences.getBoolean("VERBOSE_LOGGING", false));
                new wv6(this, companion.n(), new yl7((byte) 28));
                b = 4;
                if (r0.f()) {
                    applicationContext4 = remoteControlApplication.getApplicationContext();
                    applicationContext4.getClass();
                    if (r0.f()) {
                        Context applicationContext19 = applicationContext4.getApplicationContext();
                        applicationContext19.getClass();
                        au8.V0 = applicationContext19.getApplicationContext();
                        AndroidKeyChainCallbackHolder.SetAndroidKeyChainCallback(wi.a);
                    }
                    tk1 tk1Var9 = g22.a;
                    im3.R(hm3.c(gk1.f901o), null, null, new y0(remoteControlApplication, z4 ? 1 : 0, b), 3);
                }
                sharedPreferences2 = h57.a;
                if (sharedPreferences2 != null) {
                    im3.e0("sharedPreferences");
                    throw null;
                }
                z2 = sharedPreferences2.getBoolean("IS_FIRST_START_EVER", true);
                if (z2) {
                    sharedPreferences6 = h57.a;
                    if (sharedPreferences6 != null) {
                        im3.e0("sharedPreferences");
                        throw null;
                    }
                    SharedPreferences.Editor editorEdit111113 = sharedPreferences6.edit();
                    editorEdit111113.getClass();
                    editorEdit111113.putInt("INPUT_METHOD_INT", 0);
                    editorEdit111113.putString("PREFERRED_RESOLUTION", "DontChange");
                    editorEdit111113.apply();
                }
                sharedPreferences3 = h57.a;
                if (sharedPreferences3 != null) {
                    im3.e0("sharedPreferences");
                    throw null;
                }
                if (sharedPreferences3.getInt("BUILD_VERSION", 0) < 298) {
                    SharedPreferences.Editor editorEdit111114 = sharedPreferences3.edit();
                    editorEdit111114.getClass();
                    editorEdit111114.putInt("BUILD_VERSION", 298);
                    editorEdit111114.apply();
                    if (!z2) {
                        sharedPreferences5 = h57.a;
                        if (sharedPreferences5 != null) {
                            im3.e0("sharedPreferences");
                            throw null;
                        }
                        if (sharedPreferences5.contains("REMOVE_WALLPAPER")) {
                            boolean z1115 = sharedPreferences5.getBoolean("REMOVE_WALLPAPER", true);
                            companion.n();
                            Settings.k(gv6.USER, ca8.P_REMOTE_REMOVEWALLPAPER, z1115);
                            SharedPreferences.Editor editorEdit111115 = sharedPreferences5.edit();
                            editorEdit111115.getClass();
                            editorEdit111115.remove("REMOVE_WALLPAPER");
                            editorEdit111115.apply();
                        }
                        if (sharedPreferences5.contains("SHOW_REMOTE_CURSOR")) {
                            boolean z1116 = sharedPreferences5.getBoolean("SHOW_REMOTE_CURSOR", false);
                            companion.n();
                            Settings.k(gv6.USER, ca8.P_REMOTE_REMOTECURSOR, z1116);
                            SharedPreferences.Editor editorEdit111116 = sharedPreferences5.edit();
                            editorEdit111116.getClass();
                            editorEdit111116.remove("SHOW_REMOTE_CURSOR");
                            editorEdit111116.apply();
                        }
                        if (sharedPreferences5.contains("ENABLE_REMOTE_AUDIO")) {
                            boolean z1117 = sharedPreferences5.getBoolean("ENABLE_REMOTE_AUDIO", true);
                            companion.n();
                            Settings.k(gv6.USER, ca8.P_REMOTEAUDIO_RECEIVE_ENABLED, z1117);
                            SharedPreferences.Editor editorEdit111117 = sharedPreferences5.edit();
                            editorEdit111117.getClass();
                            editorEdit111117.remove("ENABLE_REMOTE_AUDIO");
                            editorEdit111117.apply();
                        }
                    }
                }
                Settings settingsN10 = companion.n();
                string2 = Settings.e().toString();
                string2.getClass();
                strValueOf = String.valueOf(10000);
                strM = ua5.m("And", Build.VERSION.RELEASE);
                if (strM.length() > 10) {
                    strM = strM.substring(0, 10);
                }
                property = System.getProperty("os.arch");
                sb2 = new StringBuilder();
                String[] strArr10 = Build.SUPPORTED_ABIS;
                strArr10.getClass();
                while (i2 < r12) {
                    sb2.append(str12 + " ");
                }
                string3 = sb2.toString();
                SimpleDateFormat simpleDateFormat9 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US);
                Object objClone9 = settingsN10.h.clone();
                objClone9.getClass();
                String str115 = simpleDateFormat9.format((Date) objClone9);
                str8 = simpleDateFormat9.format(new Date(Build.TIME));
                sbP = ua5.p("<br /><br /><br /><span style=\"color:rgb(0,0,240)\">  TeamViewer start: ", str115, "<br />  Version: ");
                str9 = n37.f;
                if (str9 != null) {
                    im3.e0("versionString");
                    throw null;
                }
                e41.t(sbP, str9, "(298)<br />  ID:      ", string2, "<br />  License: ");
                e41.t(sbP, strValueOf, "<br />  OS:      ", strM, "<br />  Arch:    ");
                e41.t(sbP, property, "<br />  Abis:    ", string3, "<br /><br />  Device:  <br />");
                sbP.append("  Model:\t  ");
                sbP.append(Build.MODEL);
                sbP.append("<br />");
                sbP.append("  Release:  ");
                sbP.append(ad8.a());
                sbP.append("<br />");
                sbP.append("  Board:\t  ");
                sbP.append(Build.BOARD);
                sbP.append("<br />");
                sbP.append("  Brand:\t  ");
                sbP.append(Build.BRAND);
                sbP.append("<br />");
                sbP.append("  Device:\t  ");
                sbP.append(Build.DEVICE);
                sbP.append("<br />");
                sbP.append("  Display:\t  ");
                sbP.append(Build.DISPLAY);
                sbP.append("<br />");
                sbP.append("  Fingerprint: ");
                sbP.append(Build.FINGERPRINT);
                sbP.append("<br />");
                sbP.append("  Host:\t      ");
                sbP.append(Build.HOST);
                sbP.append("<br />");
                sbP.append("  ID:\t      ");
                sbP.append(Build.ID);
                sbP.append("<br />");
                sbP.append("  Product:\t  ");
                sbP.append(Build.PRODUCT);
                sbP.append("<br />");
                sbP.append("  Tags:\t      ");
                sbP.append(Build.TAGS);
                sbP.append("<br />");
                sbP.append("  Time:\t      ");
                sbP.append(str8);
                sbP.append("<br />");
                sbP.append("  Type:\t      ");
                sbP.append(Build.TYPE);
                sbP.append("<br />");
                sbP.append("  </span><br /><br /><br />");
                ye4.a("VersionInfo:", sbP.toString());
                n1Var = io.sentry.android.core.n1.q;
                if (n1Var != null) {
                    im3.e0("instance");
                    throw null;
                }
                n1Var.k();
                Settings.i.n();
                gv6Var = gv6.MACHINE;
                if (Settings.b(gv6Var, ov6.P_MID_VERSION) < 2) {
                    ye4.a.g("TVApplication", "Forcing MID version update");
                    ov6 ov6Var9 = ov6.P_MID_FORCE_UPDATE;
                    Settings.j(gv6Var, ov6Var9, Settings.b(gv6Var, ov6Var9) | 1);
                }
                ye4.a("App startup", "Network startup");
                BackendContainerAndroid.GetInstance().GetFrontendDispatcher();
                applicationContext3 = getApplicationContext();
                applicationContext3.getClass();
                j93 j93Var9 = new j93(applicationContext3);
                Point pointT14 = j93Var9.T();
                ye4.a("LocalConstraints", "Display is " + pointT14.x + "x" + pointT14.y);
                displayMetrics = applicationContext3.getResources().getDisplayMetrics();
                float f17 = (float) displayMetrics.widthPixels;
                float f18 = displayMetrics.xdpi;
                double d11117 = (double) (f17 / f18);
                double d11118 = displayMetrics.heightPixels / displayMetrics.ydpi;
                dAbs = Math.abs(f18 / displayMetrics.densityDpi);
                if (0.75d <= dAbs) {
                    int i1113 = displayMetrics.widthPixels;
                    int i1114 = displayMetrics.densityDpi;
                    double d11119 = i1113 / i1114;
                    double d111110 = displayMetrics.heightPixels / i1114;
                    dSqrt = Math.sqrt((d111110 * d111110) + (d11119 * d11119));
                } else {
                    int i1115 = displayMetrics.widthPixels;
                    int i1116 = displayMetrics.densityDpi;
                    double d111111 = i1115 / i1116;
                    double d111112 = displayMetrics.heightPixels / i1116;
                    dSqrt = Math.sqrt((d111112 * d111112) + (d111111 * d111111));
                }
                ye4.a("LocalConstraints", "ScreenDiagonal is " + dSqrt);
                ye4.a("LocalConstraints", "DPI is " + j93Var9.R());
                ye4.a("LocalConstraints", "HardwareMenuButton is " + ViewConfiguration.get(applicationContext3).hasPermanentMenuKey());
                ye4.a("LocalConstraints", "AndroidTV is " + j93Var9.W());
                zDeviceHasKey = KeyCharacterMap.deviceHasKey(4);
                boolean zDeviceHasKey10 = KeyCharacterMap.deviceHasKey(3);
                if (zDeviceHasKey) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                ye4.a("LocalConstraints", "NavigationBar is " + z3);
                if (applicationContext3.getResources().getBoolean(Resources.getSystem().getIdentifier("config_hasRecents", "bool", "android"))) {
                    o53Var = o53.n;
                } else {
                    o53Var = o53.f1630o;
                }
                ye4.a("LocalConstraints", "RecentApps is " + o53Var);
                Uri uri9 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
                AudioAttributes audioAttributes9 = Notification.AUDIO_ATTRIBUTES_DEFAULT;
                String string17 = remoteControlApplication.getString(R.string.tv_general_notification_channel_name);
                string17.getClass();
                r55 r55Var9 = new r55(getApplicationContext());
                NotificationChannel notificationChannel111118 = new NotificationChannel("TV_GENERAL_NOTIFICATION_CHANNEL", string17, 2);
                notificationChannel111118.setDescription(null);
                notificationChannel111118.setGroup(null);
                notificationChannel111118.setShowBadge(false);
                notificationChannel111118.setSound(uri9, audioAttributes9);
                notificationChannel111118.enableLights(false);
                notificationChannel111118.setLightColor(0);
                notificationChannel111118.setVibrationPattern(null);
                notificationChannel111118.enableVibration(false);
                r55Var9.a.createNotificationChannel(notificationChannel111118);
                ArrayList<NotificationChannel> arrayList9 = new ArrayList();
                NotificationChannel notificationChannel111119 = new NotificationChannel("TV_CHAT_MESSAGES_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_chat_channel_name), 3);
                notificationChannel111119.setShowBadge(true);
                notificationChannel111119.enableLights(true);
                notificationChannel111119.enableVibration(true);
                notificationChannel111119.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                arrayList9.add(notificationChannel111119);
                NotificationChannel notificationChannel1111110 = new NotificationChannel("TV_LICENSE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_license_notification_channel_name), 3);
                notificationChannel1111110.setDescription(remoteControlApplication.getString(R.string.tv_license_notification_channel_description));
                notificationChannel1111110.setShowBadge(true);
                notificationChannel1111110.enableVibration(true);
                arrayList9.add(notificationChannel1111110);
                NotificationChannel notificationChannel1111111 = new NotificationChannel("TV_DEVICE_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_name), 4);
                notificationChannel1111111.setDescription(remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_description));
                notificationChannel1111111.setShowBadge(true);
                notificationChannel1111111.enableVibration(true);
                notificationChannel1111111.enableLights(true);
                notificationChannel1111111.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                arrayList9.add(notificationChannel1111111);
                NotificationChannel notificationChannel1111112 = new NotificationChannel("TV_MONITORING_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_name), 3);
                notificationChannel1111112.setDescription(remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_description));
                notificationChannel1111112.setShowBadge(true);
                notificationChannel1111112.enableVibration(true);
                notificationChannel1111112.enableLights(true);
                arrayList9.add(notificationChannel1111112);
                NotificationChannel notificationChannel1111113 = new NotificationChannel("TV_CONDITIONAL_ACCESS_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_name), 4);
                notificationChannel1111113.setDescription(remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_description));
                notificationChannel1111113.setShowBadge(true);
                notificationChannel1111113.enableVibration(true);
                notificationChannel1111113.enableLights(true);
                notificationChannel1111113.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                arrayList9.add(notificationChannel1111113);
                NotificationChannel notificationChannel1111114 = new NotificationChannel("TV_TRUSTED_DEVICE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_name), 4);
                notificationChannel1111114.setDescription(remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_description));
                notificationChannel1111114.setShowBadge(true);
                notificationChannel1111114.enableVibration(true);
                notificationChannel1111114.enableLights(true);
                notificationChannel1111114.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
                arrayList9.add(notificationChannel1111114);
                notificationManager = (NotificationManager) remoteControlApplication.getSystemService(NotificationManager.class);
                while (r0.hasNext()) {
                    if (notificationManager != null) {
                        notificationManager.createNotificationChannel(notificationChannel8);
                    }
                }
                c();
                b();
                ea7.a(this);
                bu7.CACHEDTHREADPOOL.a(new io.sentry.b5((Object) this, (byte) 25));
                sharedPreferences4 = h57.a;
                if (sharedPreferences4 != null) {
                    im3.e0("sharedPreferences");
                    throw null;
                }
                a(sharedPreferences4.getBoolean("IS_FIRST_START_EVER", true));
                io.sentry.android.core.performance.f.d(this);
            }
            ye4.c("NativeLibExt", "init: internalStorageDir is null.");
            zy4Var = strArrK;
            if (zy4Var != 0) {
                r0.d(zy4Var, strN);
            }
            remoteControlApplication = (RemoteControlApplication) this;
            remoteControlApplication.C = new ye1(new wk0(remoteControlApplication, (byte) 26), AppType.RemoteControl, remoteControlApplication.d(), new y46((Object) remoteControlApplication, (byte) 5));
            companion = Settings.i;
            settingsN = companion.n();
            if (boolW0 != 0) {
                Settings.k(gv6.MACHINE, ov6.P_USE_TESTMASTER_KEYS, boolW0.booleanValue());
            }
            if (strN3 != null) {
                Settings.h(rt0.P_CUSTOM_ROUTER, strN3);
            }
            if (strN4 != null) {
                Settings.h(rt0.P_CUSTOM_KEEPALIVESERVER, strN4);
            }
            if (strN5 != null) {
                Settings.h(rt0.P_CLIENT_STATISTICS_DEBUG, strN5);
            }
            if (iArrM != null) {
                Settings.i(rt0.P_SECURITY_WHITELIST_BUDDY_ACCOUNT_ID, iArrM);
            }
            if (iArr != null) {
                Settings.i(rt0.P_SECURITY_WHITELIST_COMPANY_ID, iArr);
            }
            if (bool2 != null) {
                Settings.k(gv6.MACHINE, rt0.P_MDV2_UI_SWITCH, bool2.booleanValue());
            }
            if (strArr != null) {
                gv6 gv6Var11 = gv6.MACHINE;
                Settings.l(strArr);
                boolean zB9 = cx.B0("127.0.0.1", strArr);
                Settings.k(gv6Var11, rt0.P_GENERAL_LAN_ONLY, zB9);
                Settings.k(gv6Var11, rt0.P_GENERAL_DIRECTLAN, zB9);
            }
            if (str4 != null) {
                Settings.h(rt0.P_CONFIGURATION_URL, str4);
            }
            if (str5 != null) {
                Settings.h(rt0.P_REVISION_URL, str5);
            }
            if (r9 != 0) {
                Settings.j(gv6.MACHINE, rt0.P_CONSOLE_URL_PREFIX, r9.intValue());
            }
            if (str3 != null) {
                Settings.h(rt0.P_WEBAPI_URL_PREFIX, str3);
            }
            if (r6 != 0) {
                Settings.j(gv6.CLIENT, rt0.P_AUTHHOST_URL_PREFIX, r6.intValue());
            }
            if (r7 != 0) {
                Settings.j(gv6.MACHINE, rt0.P_ONEAPI_GATEWAY, r7.intValue());
            }
            if (strN15 != null) {
                Settings.h(rt0.P_ONEAPI_GATEWAY_CUSTOMHOST, strN15);
            }
            if (strN16 != 0) {
                kh.k(settingsN, strN16);
            }
            if (boolW1 != 0) {
                sharedPreferences7 = h57.a;
                if (sharedPreferences7 != null) {
                    im3.e0("sharedPreferences");
                    throw strArrK;
                }
                SharedPreferences.Editor editorEdit111118 = sharedPreferences7.edit();
                editorEdit111118.getClass();
                editorEdit111118.putBoolean("VERBOSE_LOGGING", boolW1.booleanValue());
                editorEdit111118.apply();
            }
            sharedPreferences = h57.a;
            if (sharedPreferences != null) {
                im3.e0("sharedPreferences");
                throw strArrK;
            }
            ye4.a.h(sharedPreferences.getBoolean("VERBOSE_LOGGING", false));
            new wv6(this, companion.n(), new yl7((byte) 28));
            b = 4;
            if (r0.f()) {
                applicationContext4 = remoteControlApplication.getApplicationContext();
                applicationContext4.getClass();
                if (r0.f()) {
                    Context applicationContext110 = applicationContext4.getApplicationContext();
                    applicationContext110.getClass();
                    au8.V0 = applicationContext110.getApplicationContext();
                    AndroidKeyChainCallbackHolder.SetAndroidKeyChainCallback(wi.a);
                }
                tk1 tk1Var10 = g22.a;
                im3.R(hm3.c(gk1.f901o), null, null, new y0(remoteControlApplication, z4 ? 1 : 0, b), 3);
            }
            sharedPreferences2 = h57.a;
            if (sharedPreferences2 != null) {
                im3.e0("sharedPreferences");
                throw null;
            }
            z2 = sharedPreferences2.getBoolean("IS_FIRST_START_EVER", true);
            if (z2) {
                sharedPreferences6 = h57.a;
                if (sharedPreferences6 != null) {
                    im3.e0("sharedPreferences");
                    throw null;
                }
                SharedPreferences.Editor editorEdit111119 = sharedPreferences6.edit();
                editorEdit111119.getClass();
                editorEdit111119.putInt("INPUT_METHOD_INT", 0);
                editorEdit111119.putString("PREFERRED_RESOLUTION", "DontChange");
                editorEdit111119.apply();
            }
            sharedPreferences3 = h57.a;
            if (sharedPreferences3 != null) {
                im3.e0("sharedPreferences");
                throw null;
            }
            if (sharedPreferences3.getInt("BUILD_VERSION", 0) < 298) {
                SharedPreferences.Editor editorEdit1111110 = sharedPreferences3.edit();
                editorEdit1111110.getClass();
                editorEdit1111110.putInt("BUILD_VERSION", 298);
                editorEdit1111110.apply();
                if (!z2) {
                    sharedPreferences5 = h57.a;
                    if (sharedPreferences5 != null) {
                        im3.e0("sharedPreferences");
                        throw null;
                    }
                    if (sharedPreferences5.contains("REMOVE_WALLPAPER")) {
                        boolean z1118 = sharedPreferences5.getBoolean("REMOVE_WALLPAPER", true);
                        companion.n();
                        Settings.k(gv6.USER, ca8.P_REMOTE_REMOVEWALLPAPER, z1118);
                        SharedPreferences.Editor editorEdit1111111 = sharedPreferences5.edit();
                        editorEdit1111111.getClass();
                        editorEdit1111111.remove("REMOVE_WALLPAPER");
                        editorEdit1111111.apply();
                    }
                    if (sharedPreferences5.contains("SHOW_REMOTE_CURSOR")) {
                        boolean z1119 = sharedPreferences5.getBoolean("SHOW_REMOTE_CURSOR", false);
                        companion.n();
                        Settings.k(gv6.USER, ca8.P_REMOTE_REMOTECURSOR, z1119);
                        SharedPreferences.Editor editorEdit1111112 = sharedPreferences5.edit();
                        editorEdit1111112.getClass();
                        editorEdit1111112.remove("SHOW_REMOTE_CURSOR");
                        editorEdit1111112.apply();
                    }
                    if (sharedPreferences5.contains("ENABLE_REMOTE_AUDIO")) {
                        boolean z11110 = sharedPreferences5.getBoolean("ENABLE_REMOTE_AUDIO", true);
                        companion.n();
                        Settings.k(gv6.USER, ca8.P_REMOTEAUDIO_RECEIVE_ENABLED, z11110);
                        SharedPreferences.Editor editorEdit1111113 = sharedPreferences5.edit();
                        editorEdit1111113.getClass();
                        editorEdit1111113.remove("ENABLE_REMOTE_AUDIO");
                        editorEdit1111113.apply();
                    }
                }
            }
            Settings settingsN11 = companion.n();
            string2 = Settings.e().toString();
            string2.getClass();
            strValueOf = String.valueOf(10000);
            strM = ua5.m("And", Build.VERSION.RELEASE);
            if (strM.length() > 10) {
                strM = strM.substring(0, 10);
            }
            property = System.getProperty("os.arch");
            sb2 = new StringBuilder();
            String[] strArr11 = Build.SUPPORTED_ABIS;
            strArr11.getClass();
            while (i2 < r12) {
                sb2.append(str12 + " ");
            }
            string3 = sb2.toString();
            SimpleDateFormat simpleDateFormat10 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US);
            Object objClone10 = settingsN11.h.clone();
            objClone10.getClass();
            String str116 = simpleDateFormat10.format((Date) objClone10);
            str8 = simpleDateFormat10.format(new Date(Build.TIME));
            sbP = ua5.p("<br /><br /><br /><span style=\"color:rgb(0,0,240)\">  TeamViewer start: ", str116, "<br />  Version: ");
            str9 = n37.f;
            if (str9 != null) {
                im3.e0("versionString");
                throw null;
            }
            e41.t(sbP, str9, "(298)<br />  ID:      ", string2, "<br />  License: ");
            e41.t(sbP, strValueOf, "<br />  OS:      ", strM, "<br />  Arch:    ");
            e41.t(sbP, property, "<br />  Abis:    ", string3, "<br /><br />  Device:  <br />");
            sbP.append("  Model:\t  ");
            sbP.append(Build.MODEL);
            sbP.append("<br />");
            sbP.append("  Release:  ");
            sbP.append(ad8.a());
            sbP.append("<br />");
            sbP.append("  Board:\t  ");
            sbP.append(Build.BOARD);
            sbP.append("<br />");
            sbP.append("  Brand:\t  ");
            sbP.append(Build.BRAND);
            sbP.append("<br />");
            sbP.append("  Device:\t  ");
            sbP.append(Build.DEVICE);
            sbP.append("<br />");
            sbP.append("  Display:\t  ");
            sbP.append(Build.DISPLAY);
            sbP.append("<br />");
            sbP.append("  Fingerprint: ");
            sbP.append(Build.FINGERPRINT);
            sbP.append("<br />");
            sbP.append("  Host:\t      ");
            sbP.append(Build.HOST);
            sbP.append("<br />");
            sbP.append("  ID:\t      ");
            sbP.append(Build.ID);
            sbP.append("<br />");
            sbP.append("  Product:\t  ");
            sbP.append(Build.PRODUCT);
            sbP.append("<br />");
            sbP.append("  Tags:\t      ");
            sbP.append(Build.TAGS);
            sbP.append("<br />");
            sbP.append("  Time:\t      ");
            sbP.append(str8);
            sbP.append("<br />");
            sbP.append("  Type:\t      ");
            sbP.append(Build.TYPE);
            sbP.append("<br />");
            sbP.append("  </span><br /><br /><br />");
            ye4.a("VersionInfo:", sbP.toString());
            n1Var = io.sentry.android.core.n1.q;
            if (n1Var != null) {
                im3.e0("instance");
                throw null;
            }
            n1Var.k();
            Settings.i.n();
            gv6Var = gv6.MACHINE;
            if (Settings.b(gv6Var, ov6.P_MID_VERSION) < 2) {
                ye4.a.g("TVApplication", "Forcing MID version update");
                ov6 ov6Var10 = ov6.P_MID_FORCE_UPDATE;
                Settings.j(gv6Var, ov6Var10, Settings.b(gv6Var, ov6Var10) | 1);
            }
            ye4.a("App startup", "Network startup");
            BackendContainerAndroid.GetInstance().GetFrontendDispatcher();
            applicationContext3 = getApplicationContext();
            applicationContext3.getClass();
            j93 j93Var10 = new j93(applicationContext3);
            Point pointT15 = j93Var10.T();
            ye4.a("LocalConstraints", "Display is " + pointT15.x + "x" + pointT15.y);
            displayMetrics = applicationContext3.getResources().getDisplayMetrics();
            float f19 = (float) displayMetrics.widthPixels;
            float f110 = displayMetrics.xdpi;
            double d111113 = (double) (f19 / f110);
            double d111114 = displayMetrics.heightPixels / displayMetrics.ydpi;
            dAbs = Math.abs(f110 / displayMetrics.densityDpi);
            if (0.75d <= dAbs) {
                int i1117 = displayMetrics.widthPixels;
                int i1118 = displayMetrics.densityDpi;
                double d111115 = i1117 / i1118;
                double d111116 = displayMetrics.heightPixels / i1118;
                dSqrt = Math.sqrt((d111116 * d111116) + (d111115 * d111115));
            } else {
                int i1119 = displayMetrics.widthPixels;
                int i11110 = displayMetrics.densityDpi;
                double d111117 = i1119 / i11110;
                double d111118 = displayMetrics.heightPixels / i11110;
                dSqrt = Math.sqrt((d111118 * d111118) + (d111117 * d111117));
            }
            ye4.a("LocalConstraints", "ScreenDiagonal is " + dSqrt);
            ye4.a("LocalConstraints", "DPI is " + j93Var10.R());
            ye4.a("LocalConstraints", "HardwareMenuButton is " + ViewConfiguration.get(applicationContext3).hasPermanentMenuKey());
            ye4.a("LocalConstraints", "AndroidTV is " + j93Var10.W());
            zDeviceHasKey = KeyCharacterMap.deviceHasKey(4);
            boolean zDeviceHasKey11 = KeyCharacterMap.deviceHasKey(3);
            if (zDeviceHasKey) {
                z3 = true;
            } else {
                z3 = true;
            }
            ye4.a("LocalConstraints", "NavigationBar is " + z3);
            if (applicationContext3.getResources().getBoolean(Resources.getSystem().getIdentifier("config_hasRecents", "bool", "android"))) {
                o53Var = o53.n;
            } else {
                o53Var = o53.f1630o;
            }
            ye4.a("LocalConstraints", "RecentApps is " + o53Var);
            Uri uri10 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
            AudioAttributes audioAttributes10 = Notification.AUDIO_ATTRIBUTES_DEFAULT;
            String string18 = remoteControlApplication.getString(R.string.tv_general_notification_channel_name);
            string18.getClass();
            r55 r55Var10 = new r55(getApplicationContext());
            NotificationChannel notificationChannel1111115 = new NotificationChannel("TV_GENERAL_NOTIFICATION_CHANNEL", string18, 2);
            notificationChannel1111115.setDescription(null);
            notificationChannel1111115.setGroup(null);
            notificationChannel1111115.setShowBadge(false);
            notificationChannel1111115.setSound(uri10, audioAttributes10);
            notificationChannel1111115.enableLights(false);
            notificationChannel1111115.setLightColor(0);
            notificationChannel1111115.setVibrationPattern(null);
            notificationChannel1111115.enableVibration(false);
            r55Var10.a.createNotificationChannel(notificationChannel1111115);
            ArrayList<NotificationChannel> arrayList10 = new ArrayList();
            NotificationChannel notificationChannel1111116 = new NotificationChannel("TV_CHAT_MESSAGES_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_chat_channel_name), 3);
            notificationChannel1111116.setShowBadge(true);
            notificationChannel1111116.enableLights(true);
            notificationChannel1111116.enableVibration(true);
            notificationChannel1111116.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
            arrayList10.add(notificationChannel1111116);
            NotificationChannel notificationChannel1111117 = new NotificationChannel("TV_LICENSE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_license_notification_channel_name), 3);
            notificationChannel1111117.setDescription(remoteControlApplication.getString(R.string.tv_license_notification_channel_description));
            notificationChannel1111117.setShowBadge(true);
            notificationChannel1111117.enableVibration(true);
            arrayList10.add(notificationChannel1111117);
            NotificationChannel notificationChannel1111118 = new NotificationChannel("TV_DEVICE_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_name), 4);
            notificationChannel1111118.setDescription(remoteControlApplication.getString(R.string.tv_device_authentication_notification_channel_description));
            notificationChannel1111118.setShowBadge(true);
            notificationChannel1111118.enableVibration(true);
            notificationChannel1111118.enableLights(true);
            notificationChannel1111118.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
            arrayList10.add(notificationChannel1111118);
            NotificationChannel notificationChannel1111119 = new NotificationChannel("TV_MONITORING_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_name), 3);
            notificationChannel1111119.setDescription(remoteControlApplication.getString(R.string.tv_monitoring_notification_channel_description));
            notificationChannel1111119.setShowBadge(true);
            notificationChannel1111119.enableVibration(true);
            notificationChannel1111119.enableLights(true);
            arrayList10.add(notificationChannel1111119);
            NotificationChannel notificationChannel11111110 = new NotificationChannel("TV_CONDITIONAL_ACCESS_AUTHENTICATION_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_name), 4);
            notificationChannel11111110.setDescription(remoteControlApplication.getString(R.string.tv_conditional_access_authentication_notification_channel_description));
            notificationChannel11111110.setShowBadge(true);
            notificationChannel11111110.enableVibration(true);
            notificationChannel11111110.enableLights(true);
            notificationChannel11111110.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
            arrayList10.add(notificationChannel11111110);
            NotificationChannel notificationChannel11111111 = new NotificationChannel("TV_TRUSTED_DEVICE_NOTIFICATION_CHANNEL", remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_name), 4);
            notificationChannel11111111.setDescription(remoteControlApplication.getString(R.string.tv_trusted_device_notification_channel_description));
            notificationChannel11111111.setShowBadge(true);
            notificationChannel11111111.enableVibration(true);
            notificationChannel11111111.enableLights(true);
            notificationChannel11111111.setSound(RingtoneManager.getDefaultUri(2), RemoteControlApplication.e());
            arrayList10.add(notificationChannel11111111);
            notificationManager = (NotificationManager) remoteControlApplication.getSystemService(NotificationManager.class);
            while (r0.hasNext()) {
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannel8);
                }
            }
            c();
            b();
            ea7.a(this);
            bu7.CACHEDTHREADPOOL.a(new io.sentry.b5((Object) this, (byte) 25));
            sharedPreferences4 = h57.a;
            if (sharedPreferences4 != null) {
                im3.e0("sharedPreferences");
                throw null;
            }
            a(sharedPreferences4.getBoolean("IS_FIRST_START_EVER", true));
            io.sentry.android.core.performance.f.d(this);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        du6 du6VarT;
        super.onLowMemory();
        ye4.a.g("TVApplication", "Android reported low memory");
        mo7 mo7Var = ((zt6) RemoteControlApplication.f()).f;
        ConnectionMode connectionMode = (mo7Var == null || (du6VarT = mo7Var.t()) == null) ? null : du6VarT.a;
        if ((connectionMode == null ? -1 : aa6.a[connectionMode.ordinal()]) == 1) {
            Context context = d82.M;
            if (context == null) {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                return;
            }
            String string = context.getString(R.string.tv_warningMessage_LowOnMemoryInRemoteControlSession);
            string.getClass();
            fx3.r(string, 1, context, bu7.MAIN);
            return;
        }
        Context context2 = d82.M;
        if (context2 == null) {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            return;
        }
        String string2 = context2.getString(R.string.tv_warningMessage_LowOnMemory);
        string2.getClass();
        fx3.r(string2, 1, context2, bu7.MAIN);
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        ye4.a("TVApplication", "TeamViewer shutdown");
        synchronized (kk7.f1275o) {
            kk7 kk7Var = kk7.p;
            if (kk7Var != null) {
                Thread.setDefaultUncaughtExceptionHandler(kk7Var.n);
                kk7.p = null;
            }
        }
        EventHub.e.e();
    }
}
