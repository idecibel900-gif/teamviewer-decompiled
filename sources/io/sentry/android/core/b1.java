package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.f6;
import io.sentry.g7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public final Context a;
    public final SentryAndroidOptions b;
    public final q0 c;
    public final Boolean d;
    public final t0 e;
    public final u0 f;
    public final io.sentry.protocol.q g;
    public final Long h;

    /* JADX INFO: Removed unreachable split cross block B:125:0x0149 */
    /* JADX WARN: Code duplicated, block: B:61:0x010a A[PHI: r6
      0x010a: PHI (r6v11 java.lang.Process) = (r6v35 java.lang.Process), (r6v36 java.lang.Process) binds: [B:60:0x0108, B:65:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    public b1(Context context, SentryAndroidOptions sentryAndroidOptions) {
        String str;
        t0 t0Var;
        u0 u0Var;
        Bundle bundle;
        Process process;
        Process processExec;
        Process process2;
        Process process3;
        boolean z;
        boolean z2;
        this.a = context;
        this.b = sentryAndroidOptions;
        this.c = new q0(sentryAndroidOptions.getLogger());
        io.sentry.android.core.internal.util.h.c.a();
        io.sentry.protocol.q qVar = new io.sentry.protocol.q();
        qVar.m = "Android";
        qVar.n = Build.VERSION.RELEASE;
        qVar.p = Build.DISPLAY;
        io.sentry.g1 logger = sentryAndroidOptions.getLogger();
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        String str2 = property;
        if (file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    str2 = line;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException e) {
                logger.d(f6.ERROR, "Exception while attempting to read kernel information", e);
                str2 = property;
            }
        }
        if (str2 != 0) {
            qVar.q = str2;
        }
        boolean z3 = false;
        if (sentryAndroidOptions.isEnableRootCheck()) {
            io.sentry.android.core.internal.util.m mVar = new io.sentry.android.core.internal.util.m(this.a, sentryAndroidOptions.getLogger(), this.c);
            mVar.b.getClass();
            String str3 = Build.TAGS;
            if (str3 == null || !str3.contains("test-keys")) {
                String[] strArr = mVar.d;
                int length = strArr.length;
                int i = 0;
                str2 = str2;
                while (true) {
                    io.sentry.g1 g1Var = mVar.c;
                    if (i >= length) {
                        process = "su";
                        try {
                            try {
                                processExec = mVar.f.exec(new String[]{"/system/xbin/which", "su"});
                                try {
                                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream(), io.sentry.android.core.internal.util.m.g));
                                    try {
                                        z = bufferedReader2.readLine() != null;
                                        bufferedReader2.close();
                                        processExec.destroy();
                                        str2 = processExec;
                                    } catch (Throwable th3) {
                                        try {
                                            bufferedReader2.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                    }
                                } catch (IOException unused) {
                                    g1Var.g(f6.DEBUG, "SU isn't found on this Device.", new Object[0]);
                                    process3 = processExec;
                                    process2 = processExec;
                                    if (processExec != null) {
                                        process2.destroy();
                                        process3 = process2;
                                    }
                                    z = false;
                                    str2 = process3;
                                } catch (Throwable th5) {
                                    th = th5;
                                    g1Var.d(f6.DEBUG, "Error when trying to check if SU exists.", th);
                                    process3 = processExec;
                                    process2 = processExec;
                                    if (processExec != null) {
                                        process2.destroy();
                                        process3 = process2;
                                    }
                                    z = false;
                                    str2 = process3;
                                }
                            } catch (Throwable th6) {
                                if (process != 0) {
                                    process.destroy();
                                }
                                throw th6;
                            }
                        } catch (IOException unused2) {
                            processExec = null;
                        } catch (Throwable th7) {
                            th = th7;
                            processExec = null;
                        }
                        if (!z) {
                            io.sentry.util.b.v(g1Var, "The ILogger object is required.");
                            PackageManager packageManager = mVar.a.getPackageManager();
                            if (packageManager != null) {
                                str2 = mVar.e;
                                int length2 = str2.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length2) {
                                        String str4 = str2[i2];
                                        try {
                                            if (Build.VERSION.SDK_INT >= 33) {
                                                packageManager.getPackageInfo(str4, PackageManager.PackageInfoFlags.of(0L));
                                            } else {
                                                packageManager.getPackageInfo(str4, 0);
                                            }
                                        } catch (PackageManager.NameNotFoundException unused3) {
                                            i2++;
                                        }
                                    }
                                }
                            }
                            z2 = false;
                            process = str2;
                            break;
                        }
                    } else {
                        String str5 = strArr[i];
                        try {
                            if (!new File(str5).exists()) {
                                i++;
                                str2 = str2;
                            }
                        } catch (RuntimeException e2) {
                            str2 = "Error when trying to check if root file %s exists.";
                            g1Var.b(f6.ERROR, e2, "Error when trying to check if root file %s exists.", str5);
                        }
                    }
                    z2 = true;
                    process = str2;
                    break;
                }
                qVar.r = Boolean.valueOf(z2);
            } else {
                z2 = true;
                process = str2;
                qVar.r = Boolean.valueOf(z2);
            }
        }
        this.g = qVar;
        this.d = this.c.a();
        io.sentry.g1 logger2 = sentryAndroidOptions.getLogger();
        try {
            PackageInfo packageInfoG = v0.g(context, this.c);
            PackageManager packageManager2 = context.getPackageManager();
            if (packageInfoG == null || packageManager2 == null) {
                t0Var = null;
            } else {
                str = packageInfoG.packageName;
                try {
                    String installerPackageName = packageManager2.getInstallerPackageName(str);
                    t0Var = new t0(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused4) {
                    logger2.g(f6.DEBUG, "%s package isn't installed.", str);
                    t0Var = null;
                }
            }
        } catch (IllegalArgumentException unused5) {
            str = null;
        }
        this.e = t0Var;
        q0 q0Var = this.c;
        q0Var.getClass();
        ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) v0.d.a(context) : (ApplicationInfo) v0.e.a(context);
        PackageInfo packageInfoG2 = v0.g(context, q0Var);
        if (packageInfoG2 != null) {
            String[] strArr2 = packageInfoG2.splitNames;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                z3 = bundle.getBoolean("com.android.vending.splits.required");
            }
            u0Var = new u0(z3, strArr2);
        } else {
            u0Var = null;
        }
        this.f = u0Var;
        ActivityManager.MemoryInfo memoryInfoF = v0.f(context, sentryAndroidOptions.getLogger());
        if (memoryInfoF != null) {
            this.h = Long.valueOf(memoryInfoF.totalMem);
        } else {
            this.h = null;
        }
    }

    public static Float b(Intent intent, g7 g7Var) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            g7Var.getLogger().d(f6.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    public static Boolean c(Intent intent, g7 g7Var) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            g7Var.getLogger().d(f6.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0255 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0257 A[Catch: all -> 0x0296, TryCatch #5 {all -> 0x0296, blocks: (B:101:0x024f, B:104:0x0257, B:106:0x025d, B:108:0x0261, B:117:0x0279, B:112:0x0268, B:115:0x026f, B:121:0x028c, B:118:0x027c), top: B:149:0x024f }] */
    /* JADX WARN: Code duplicated, block: B:105:0x025c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0261 A[Catch: all -> 0x0296, TryCatch #5 {all -> 0x0296, blocks: (B:101:0x024f, B:104:0x0257, B:106:0x025d, B:108:0x0261, B:117:0x0279, B:112:0x0268, B:115:0x026f, B:121:0x028c, B:118:0x027c), top: B:149:0x024f }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0265  */
    /* JADX WARN: Code duplicated, block: B:111:0x0266  */
    /* JADX WARN: Code duplicated, block: B:118:0x027c A[Catch: all -> 0x0296, TryCatch #5 {all -> 0x0296, blocks: (B:101:0x024f, B:104:0x0257, B:106:0x025d, B:108:0x0261, B:117:0x0279, B:112:0x0268, B:115:0x026f, B:121:0x028c, B:118:0x027c), top: B:149:0x024f }] */
    /* JADX WARN: Code duplicated, block: B:121:0x028c A[Catch: all -> 0x0296, TRY_LEAVE, TryCatch #5 {all -> 0x0296, blocks: (B:101:0x024f, B:104:0x0257, B:106:0x025d, B:108:0x0261, B:117:0x0279, B:112:0x0268, B:115:0x026f, B:121:0x028c, B:118:0x027c), top: B:149:0x024f }] */
    /* JADX WARN: Code duplicated, block: B:124:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:145:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    /* JADX WARN: Code duplicated, block: B:44:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0140  */
    /* JADX WARN: Code duplicated, block: B:57:0x0152  */
    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0191  */
    /* JADX WARN: Code duplicated, block: B:67:0x0197  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ac A[Catch: all -> 0x01b5, TRY_LEAVE, TryCatch #4 {all -> 0x01b5, blocks: (B:68:0x01a3, B:70:0x01ac), top: B:147:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01db  */
    /* JADX WARN: Code duplicated, block: B:81:0x01de  */
    /* JADX WARN: Code duplicated, block: B:88:0x0204  */
    public final io.sentry.protocol.h a(boolean z, boolean z2) {
        io.sentry.protocol.g gVar;
        Boolean bool;
        io.sentry.g1 logger;
        DisplayMetrics displayMetrics;
        Date date;
        TimeZone timeZone;
        String strA;
        Locale locale;
        ArrayList arrayListA;
        boolean zIsCollectExternalStorageContext;
        IntentFilter intentFilter;
        Intent intentRegisterReceiver;
        int i;
        Boolean bool2;
        ActivityManager.MemoryInfo memoryInfoF;
        File dataDirectory;
        File externalFilesDir;
        StatFs statFs;
        Long lValueOf;
        File[] externalFilesDirs;
        File file;
        String absolutePath;
        int length;
        int i2;
        Long lValueOf2;
        Long lValueOf3;
        Float fValueOf;
        int intExtra;
        LocaleList locales;
        Locale locale2;
        io.sentry.protocol.g gVar2;
        Context context = this.a;
        io.sentry.protocol.h hVar = new io.sentry.protocol.h();
        hVar.n = Build.MANUFACTURER;
        hVar.f230o = Build.BRAND;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        hVar.p = v0.e(sentryAndroidOptions.getLogger());
        hVar.q = Build.MODEL;
        hVar.r = Build.ID;
        hVar.s = Build.SUPPORTED_ABIS;
        this.c.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            hVar.T = Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL;
        }
        Long lValueOf4 = null;
        try {
            int i3 = context.getResources().getConfiguration().orientation;
            try {
                try {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            gVar = null;
                        } else {
                            gVar2 = io.sentry.protocol.g.LANDSCAPE;
                        }
                        if (gVar == null) {
                            try {
                                sentryAndroidOptions.getLogger().g(f6.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                                gVar = null;
                            } catch (Throwable th) {
                                th = th;
                                sentryAndroidOptions.getLogger().d(f6.ERROR, "Error getting device orientation.", th);
                            }
                        }
                        hVar.w = gVar;
                        bool = this.d;
                        if (bool != null) {
                            hVar.x = bool;
                        }
                        logger = sentryAndroidOptions.getLogger();
                        displayMetrics = context.getResources().getDisplayMetrics();
                        if (displayMetrics != null) {
                            hVar.G = Integer.valueOf(displayMetrics.widthPixels);
                            hVar.H = Integer.valueOf(displayMetrics.heightPixels);
                            hVar.I = Float.valueOf(displayMetrics.density);
                            hVar.J = Integer.valueOf(displayMetrics.densityDpi);
                        }
                        date = new Date(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                        hVar.K = date;
                        if (Build.VERSION.SDK_INT >= 33) {
                            locales = context.getResources().getConfiguration().getLocales();
                            if (locales.isEmpty()) {
                                timeZone = TimeZone.getDefault();
                            } else {
                                locale2 = locales.get(0);
                                if (locale2.getUnicodeLocaleType("tz") != null) {
                                    timeZone = Calendar.getInstance(locale2).getTimeZone();
                                } else {
                                    timeZone = TimeZone.getDefault();
                                }
                            }
                        } else {
                            timeZone = TimeZone.getDefault();
                        }
                        hVar.L = timeZone;
                        if (hVar.M == null) {
                            try {
                                strA = h1.a(context);
                            } catch (Throwable th2) {
                                sentryAndroidOptions.getLogger().d(f6.ERROR, "Error getting installationId.", th2);
                                strA = null;
                            }
                            hVar.M = strA;
                        }
                        locale = Locale.getDefault();
                        if (hVar.N == null) {
                            hVar.N = locale.toString();
                        }
                        arrayListA = io.sentry.android.core.internal.util.h.c.a();
                        if (!arrayListA.isEmpty()) {
                            hVar.R = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
                            hVar.Q = Integer.valueOf(arrayListA.size());
                        }
                        hVar.y = this.h;
                        if (z && sentryAndroidOptions.isCollectAdditionalContext()) {
                            zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
                            intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                            if (Build.VERSION.SDK_INT >= 33) {
                                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null, 4);
                            } else {
                                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null);
                            }
                            if (intentRegisterReceiver != null) {
                                hVar.t = b(intentRegisterReceiver, sentryAndroidOptions);
                                hVar.u = c(intentRegisterReceiver, sentryAndroidOptions);
                                try {
                                    intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                                    if (intExtra != -1) {
                                        fValueOf = Float.valueOf(intExtra / 10.0f);
                                    } else {
                                        fValueOf = null;
                                    }
                                } catch (Throwable th3) {
                                    sentryAndroidOptions.getLogger().d(f6.ERROR, "Error getting battery temperature.", th3);
                                }
                                hVar.P = fValueOf;
                            }
                            i = a1.a[sentryAndroidOptions.getConnectionStatusProvider().g0().ordinal()];
                            if (i != 1) {
                                bool2 = Boolean.FALSE;
                            } else if (i != 2) {
                                bool2 = null;
                            } else {
                                bool2 = Boolean.TRUE;
                            }
                            hVar.v = bool2;
                            memoryInfoF = v0.f(context, sentryAndroidOptions.getLogger());
                            if (memoryInfoF != null && z2) {
                                hVar.z = Long.valueOf(memoryInfoF.availMem);
                                hVar.B = Boolean.valueOf(memoryInfoF.lowMemory);
                            }
                            dataDirectory = Environment.getDataDirectory();
                            if (dataDirectory != null) {
                                StatFs statFs2 = new StatFs(dataDirectory.getPath());
                                try {
                                    lValueOf2 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                                } catch (Throwable th4) {
                                    sentryAndroidOptions.getLogger().d(f6.ERROR, "Error getting total internal storage amount.", th4);
                                    lValueOf2 = null;
                                }
                                hVar.C = lValueOf2;
                                try {
                                    lValueOf3 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                                } catch (Throwable th5) {
                                    sentryAndroidOptions.getLogger().d(f6.ERROR, "Error getting unused internal storage amount.", th5);
                                    lValueOf3 = null;
                                }
                                hVar.D = lValueOf3;
                            }
                            if (zIsCollectExternalStorageContext) {
                                externalFilesDir = context.getExternalFilesDir(null);
                                try {
                                    externalFilesDirs = context.getExternalFilesDirs(null);
                                    if (externalFilesDirs != null) {
                                        if (externalFilesDir != null) {
                                            absolutePath = externalFilesDir.getAbsolutePath();
                                        } else {
                                            absolutePath = null;
                                        }
                                        length = externalFilesDirs.length;
                                        i2 = 0;
                                        while (true) {
                                            if (i2 >= length) {
                                                file = externalFilesDirs[i2];
                                                if (file != null) {
                                                    if (absolutePath != null || absolutePath.isEmpty() || !file.getAbsolutePath().contains(absolutePath)) {
                                                        break;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                i2++;
                                            }
                                        }
                                        if (file != null) {
                                            statFs = new StatFs(file.getPath());
                                        } else {
                                            statFs = null;
                                        }
                                        if (statFs != null) {
                                            try {
                                                lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                            } catch (Throwable th6) {
                                                sentryAndroidOptions.getLogger().d(f6.ERROR, "Error getting total external storage amount.", th6);
                                                lValueOf = null;
                                            }
                                            hVar.E = lValueOf;
                                            try {
                                                lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                            } catch (Throwable th7) {
                                                sentryAndroidOptions.getLogger().d(f6.ERROR, "Error getting unused external storage amount.", th7);
                                            }
                                            hVar.F = lValueOf4;
                                        }
                                    } else {
                                        sentryAndroidOptions.getLogger().g(f6.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                                    }
                                    file = null;
                                    if (file != null) {
                                        statFs = new StatFs(file.getPath());
                                    } else {
                                        statFs = null;
                                    }
                                } catch (Throwable unused) {
                                    sentryAndroidOptions.getLogger().g(f6.INFO, "Not possible to read external files directory", new Object[0]);
                                }
                                if (statFs != null) {
                                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                    hVar.E = lValueOf;
                                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                    hVar.F = lValueOf4;
                                }
                            }
                            if (hVar.O == null) {
                                hVar.O = sentryAndroidOptions.getConnectionStatusProvider().g();
                            }
                        }
                        return hVar;
                    }
                    gVar2 = io.sentry.protocol.g.PORTRAIT;
                    date = new Date(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                } catch (IllegalArgumentException e) {
                    sentryAndroidOptions.getLogger().b(f6.ERROR, e, "Error getting the device's boot time.", new Object[0]);
                    date = null;
                }
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th8) {
                logger.d(f6.ERROR, "Error getting DisplayMetrics.", th8);
                displayMetrics = null;
            }
            gVar = gVar2;
            if (gVar == null) {
                sentryAndroidOptions.getLogger().g(f6.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                gVar = null;
            }
        } catch (Throwable th9) {
            th = th9;
            gVar = null;
        }
        hVar.w = gVar;
        bool = this.d;
        if (bool != null) {
            hVar.x = bool;
        }
        logger = sentryAndroidOptions.getLogger();
        if (displayMetrics != null) {
            hVar.G = Integer.valueOf(displayMetrics.widthPixels);
            hVar.H = Integer.valueOf(displayMetrics.heightPixels);
            hVar.I = Float.valueOf(displayMetrics.density);
            hVar.J = Integer.valueOf(displayMetrics.densityDpi);
        }
        hVar.K = date;
        if (Build.VERSION.SDK_INT >= 33) {
            locales = context.getResources().getConfiguration().getLocales();
            if (locales.isEmpty()) {
                locale2 = locales.get(0);
                if (locale2.getUnicodeLocaleType("tz") != null) {
                    timeZone = Calendar.getInstance(locale2).getTimeZone();
                } else {
                    timeZone = TimeZone.getDefault();
                }
            } else {
                timeZone = TimeZone.getDefault();
            }
        } else {
            timeZone = TimeZone.getDefault();
        }
        hVar.L = timeZone;
        if (hVar.M == null) {
            strA = h1.a(context);
            hVar.M = strA;
        }
        locale = Locale.getDefault();
        if (hVar.N == null) {
            hVar.N = locale.toString();
        }
        arrayListA = io.sentry.android.core.internal.util.h.c.a();
        if (!arrayListA.isEmpty()) {
            hVar.R = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
            hVar.Q = Integer.valueOf(arrayListA.size());
        }
        hVar.y = this.h;
        if (z) {
            zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
            intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null, 4);
            } else {
                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null);
            }
            if (intentRegisterReceiver != null) {
                hVar.t = b(intentRegisterReceiver, sentryAndroidOptions);
                hVar.u = c(intentRegisterReceiver, sentryAndroidOptions);
                intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                if (intExtra != -1) {
                    fValueOf = Float.valueOf(intExtra / 10.0f);
                } else {
                    fValueOf = null;
                }
                hVar.P = fValueOf;
            }
            i = a1.a[sentryAndroidOptions.getConnectionStatusProvider().g0().ordinal()];
            if (i != 1) {
                bool2 = Boolean.FALSE;
            } else if (i != 2) {
                bool2 = null;
            } else {
                bool2 = Boolean.TRUE;
            }
            hVar.v = bool2;
            memoryInfoF = v0.f(context, sentryAndroidOptions.getLogger());
            if (memoryInfoF != null) {
                hVar.z = Long.valueOf(memoryInfoF.availMem);
                hVar.B = Boolean.valueOf(memoryInfoF.lowMemory);
            }
            dataDirectory = Environment.getDataDirectory();
            if (dataDirectory != null) {
                StatFs statFs3 = new StatFs(dataDirectory.getPath());
                lValueOf2 = Long.valueOf(statFs3.getBlockCountLong() * statFs3.getBlockSizeLong());
                hVar.C = lValueOf2;
                lValueOf3 = Long.valueOf(statFs3.getAvailableBlocksLong() * statFs3.getBlockSizeLong());
                hVar.D = lValueOf3;
            }
            if (zIsCollectExternalStorageContext) {
                externalFilesDir = context.getExternalFilesDir(null);
                externalFilesDirs = context.getExternalFilesDirs(null);
                if (externalFilesDirs != null) {
                    if (externalFilesDir != null) {
                        absolutePath = externalFilesDir.getAbsolutePath();
                    } else {
                        absolutePath = null;
                    }
                    length = externalFilesDirs.length;
                    i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            file = externalFilesDirs[i2];
                            if (file != null) {
                                if (absolutePath != null) {
                                    break;
                                }
                            }
                            i2++;
                        }
                    }
                    if (file != null) {
                        statFs = new StatFs(file.getPath());
                    } else {
                        statFs = null;
                    }
                    if (statFs != null) {
                        lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                        hVar.E = lValueOf;
                        lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                        hVar.F = lValueOf4;
                    }
                } else {
                    sentryAndroidOptions.getLogger().g(f6.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                }
                file = null;
                if (file != null) {
                    statFs = new StatFs(file.getPath());
                } else {
                    statFs = null;
                }
                if (statFs != null) {
                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                    hVar.E = lValueOf;
                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                    hVar.F = lValueOf4;
                }
            }
            if (hVar.O == null) {
                hVar.O = sentryAndroidOptions.getConnectionStatusProvider().g();
            }
        }
        return hVar;
    }
}
