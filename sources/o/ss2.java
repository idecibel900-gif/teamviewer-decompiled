package o;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ss2 implements Runnable {
    public static final String q = we4.i("ForceStopRunnable");
    public static final long r = 315360000000L;
    public final Context m;
    public final nm8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ud3 f2047o;
    public int p = 0;

    public ss2(Context context, nm8 nm8Var) {
        this.m = context.getApplicationContext();
        this.n = nm8Var;
        this.f2047o = nm8Var.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + r;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01ed  */
    public final void a() throws Throwable {
        boolean z;
        ud3 ud3Var = this.f2047o;
        nm8 nm8Var = this.n;
        d11 d11Var = nm8Var.b;
        ud3 ud3Var2 = nm8Var.g;
        WorkDatabase workDatabase = nm8Var.c;
        String str = xh7.q;
        Context context = this.m;
        JobScheduler jobSchedulerA = kp3.a(context);
        ArrayList<JobInfo> arrayListE = xh7.e(context, jobSchedulerA);
        byte b = 17;
        List list = (List) au8.M(workDatabase.t().a, true, false, new vs6(b));
        HashSet hashSet = new HashSet(arrayListE != null ? arrayListE.size() : 0);
        if (arrayListE != null && !arrayListE.isEmpty()) {
            for (JobInfo jobInfo : arrayListE) {
                km8 km8VarF = xh7.f(jobInfo);
                if (km8VarF != null) {
                    hashSet.add(km8VarF.a);
                } else {
                    xh7.a(jobSchedulerA, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    we4.f().c(xh7.q, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.b();
            try {
                an8 an8VarW = workDatabase.w();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    an8VarW.c((String) it2.next(), -1L);
                }
                workDatabase.p();
                workDatabase.l();
            } catch (Throwable th) {
                workDatabase.l();
                throw th;
            }
        }
        an8 an8VarW2 = workDatabase.w();
        sm8 sm8VarV = workDatabase.v();
        workDatabase.b();
        try {
            List<xm8> list2 = (List) au8.M(an8VarW2.a, true, false, new yb8(b));
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (xm8 xm8Var : list2) {
                    lm8 lm8Var = lm8.m;
                    String str2 = xm8Var.a;
                    an8VarW2.f(lm8Var, str2);
                    an8VarW2.g(-512, str2);
                    an8VarW2.c(str2, -1L);
                }
            }
            au8.M(sm8VarV.a, false, true, new yb8((byte) 9));
            workDatabase.p();
            workDatabase.l();
            boolean z3 = z2 || z;
            Long lA = ud3Var2.a.s().a("reschedule_needed");
            byte b2 = 26;
            String str3 = q;
            if (lA != null && lA.longValue() == 1) {
                we4.f().c(str3, "Rescheduling Workers.");
                nm8Var.c();
                ud3Var2.getClass();
                jq5 jq5Var = new jq5("reschedule_needed", 0L);
                kq5 kq5VarS = ud3Var2.a.s();
                au8.M(kq5VarS.a, false, true, new o43(kq5VarS, jq5Var, b2));
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                int i2 = i >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
                if (i < 30) {
                    if (broadcast == null) {
                        c(context);
                        we4.f().c(str3, "Application was force-stopped, rescheduling.");
                        nm8Var.c();
                        Object obj = d11Var.p;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ud3Var.getClass();
                        jq5 jq5Var2 = new jq5("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis));
                        kq5 kq5VarS2 = ud3Var.a.s();
                        au8.M(kq5VarS2.a, false, true, new o43(kq5VarS2, jq5Var2, b2));
                        return;
                    }
                    if (z3) {
                        we4.f().c(str3, "Found unfinished work, scheduling it.");
                        aj6.b(d11Var, workDatabase, nm8Var.e);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lA2 = ud3Var.a.s().a("last_force_stop_ms");
                    long jLongValue = lA2 != null ? lA2.longValue() : 0L;
                    for (int i3 = 0; i3 < historicalProcessExitReasons.size(); i3++) {
                        ApplicationExitInfo applicationExitInfoD = z3.d(historicalProcessExitReasons.get(i3));
                        if (applicationExitInfoD.getReason() == 10 && applicationExitInfoD.getTimestamp() >= jLongValue) {
                            we4.f().c(str3, "Application was force-stopped, rescheduling.");
                            nm8Var.c();
                            Object obj2 = d11Var.p;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            ud3Var.getClass();
                            jq5 jq5Var3 = new jq5("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2));
                            kq5 kq5VarS3 = ud3Var.a.s();
                            au8.M(kq5VarS3.a, false, true, new o43(kq5VarS3, jq5Var3, b2));
                            return;
                        }
                    }
                }
                if (z3) {
                    we4.f().c(str3, "Found unfinished work, scheduling it.");
                    aj6.b(d11Var, workDatabase, nm8Var.e);
                }
            } catch (IllegalArgumentException e) {
                e = e;
                we4.f().k(str3, "Ignoring exception", e);
            } catch (SecurityException e2) {
                e = e2;
                we4.f().k(str3, "Ignoring exception", e);
            }
        } catch (Throwable th2) {
            workDatabase.l();
            throw th2;
        }
    }

    public final boolean b() {
        d11 d11Var = this.n.b;
        d11Var.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = q;
        if (zIsEmpty) {
            we4.f().c(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = bt5.a(this.m, d11Var);
        we4.f().c(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.m;
        nm8 nm8Var = this.n;
        d11 d11Var = nm8Var.b;
        try {
            if (!b()) {
                nm8Var.b();
                return;
            }
            boolean zJ = b77.j(context);
            String str = q;
            if (!zJ) {
                we4.f().d(str, "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                IllegalStateException illegalStateException = new IllegalStateException("WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                d11Var.getClass();
                throw illegalStateException;
            }
            while (true) {
                try {
                    l47.q(context);
                    we4.f().c(str, "Performing cleanup operations.");
                    try {
                        a();
                        nm8Var.b();
                        return;
                    } catch (SQLiteException e) {
                        this.p++;
                        if (this.p >= 3) {
                            if (!(e instanceof SQLiteAccessPermException) && !(e instanceof SQLiteCantOpenDatabaseException) && !(e instanceof SQLiteConstraintException) && !(e instanceof SQLiteDatabaseCorruptException) && !(e instanceof SQLiteDatabaseLockedException) && !(e instanceof SQLiteDiskIOException) && !(e instanceof SQLiteFullException) && !(e instanceof SQLiteTableLockedException)) {
                                throw e;
                            }
                            we4.f().e(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException2 = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            d11Var.getClass();
                            throw illegalStateException2;
                        }
                        long j = ((long) this.p) * 300;
                        String str2 = "Retrying after " + j;
                        if (we4.f().m <= 3) {
                            Log.d(str, str2, e);
                        }
                        try {
                            Thread.sleep(((long) this.p) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    we4.f().d(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException3 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    d11Var.getClass();
                    throw illegalStateException3;
                }
            }
        } catch (Throwable th) {
            nm8Var.b();
            throw th;
        }
    }
}
