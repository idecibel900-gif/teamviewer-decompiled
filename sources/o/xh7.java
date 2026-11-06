package o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class xh7 implements xi6 {
    public static final String q = we4.i("SystemJobScheduler");
    public final Context m;
    public final JobScheduler n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final wh7 f2519o;
    public final WorkDatabase p;

    public xh7(Context context, WorkDatabase workDatabase, d11 d11Var) {
        JobScheduler jobSchedulerA = kp3.a(context);
        wh7 wh7Var = new wh7(context, (yi5) d11Var.p);
        this.m = context;
        this.n = jobSchedulerA;
        this.f2519o = wh7Var;
        this.p = workDatabase;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            we4.f().e(q, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        String str = kp3.a;
        jobScheduler.getClass();
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
        } catch (Throwable th) {
            we4.f().e(kp3.a, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static km8 f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new km8(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // o.xi6
    public final void b(xm8... xm8VarArr) {
        int iIntValue;
        WorkDatabase workDatabase = this.p;
        ud3 ud3Var = new ud3(workDatabase);
        byte b = 0;
        for (xm8 xm8Var : xm8VarArr) {
            workDatabase.b();
            try {
                an8 an8VarW = workDatabase.w();
                String str = xm8Var.a;
                xm8 xm8VarB = an8VarW.b(str);
                String str2 = q;
                if (xm8VarB == null) {
                    we4.f().j(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                } else if (xm8VarB.b != lm8.m) {
                    we4.f().j(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                } else {
                    km8 km8VarJ = u47.j(xm8Var);
                    int i = km8VarJ.b;
                    String str3 = km8VarJ.a;
                    th7 th7VarT = workDatabase.t();
                    th7VarT.getClass();
                    str3.getClass();
                    rh7 rh7Var = (rh7) au8.M(th7VarT.a, true, false, new sh7(str3, i, b));
                    if (rh7Var != null) {
                        iIntValue = rh7Var.c;
                    } else {
                        Object objN = ud3Var.a.n(new io.sentry.r0(ud3Var, (byte) 5));
                        objN.getClass();
                        iIntValue = ((Number) objN).intValue();
                    }
                    if (rh7Var == null) {
                        rh7 rh7Var2 = new rh7(str3, i, iIntValue);
                        th7 th7VarT2 = workDatabase.t();
                        th7VarT2.getClass();
                        au8.M(th7VarT2.a, false, true, new py5((Object) th7VarT2, (Object) rh7Var2, (byte) 17));
                    }
                    g(xm8Var, iIntValue);
                    workDatabase.p();
                }
                workDatabase.l();
            } catch (Throwable th) {
                workDatabase.l();
                throw th;
            }
        }
    }

    @Override // o.xi6
    public final boolean c() {
        return true;
    }

    @Override // o.xi6
    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.m;
        JobScheduler jobScheduler = this.n;
        ArrayList<JobInfo> arrayListE = e(context, jobScheduler);
        if (arrayListE == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListE) {
                km8 km8VarF = f(jobInfo);
                if (km8VarF != null && str.equals(km8VarF.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            we4.f().c(q, "Cancelling work ID " + str + ", Job ID " + iIntValue);
            a(jobScheduler, iIntValue);
        }
        th7 th7VarT = this.p.t();
        th7VarT.getClass();
        str.getClass();
        au8.M(th7VarT.a, false, true, new fy(str, (byte) 20));
    }

    public final void g(xm8 xm8Var, int i) {
        int i2;
        List<JobInfo> allPendingJobs;
        String str;
        q61 q61Var = xm8Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = xm8Var.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", xm8Var.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", xm8Var.b());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.f2519o.a);
        boolean z = q61Var.c;
        Set<p61> set = q61Var.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = q61Var.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest networkRequestA = q61Var.a();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || networkRequestA == null) {
            g35 g35Var = q61Var.a;
            if (i3 < 30 || g35Var != g35.r) {
                int iOrdinal = g35Var.ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    i2 = 2;
                    if (iOrdinal != 2) {
                        i2 = 3;
                        if (iOrdinal != 3) {
                            i2 = 4;
                            if (iOrdinal != 4) {
                                we4.f().c(wh7.b, "API version too low. Cannot convert network type value " + g35Var);
                                i2 = 1;
                            }
                        }
                    }
                } else {
                    i2 = 1;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        }
        if (!z2) {
            extras.setBackoffCriteria(xm8Var.m, xm8Var.l == g20.n ? 0 : 1);
        }
        long jMax = Math.max(xm8Var.a() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!xm8Var.q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (p61 p61Var : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(p61Var.a, p61Var.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(q61Var.g);
            extras.setTriggerContentMaxDelay(q61Var.h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(q61Var.e);
        extras.setRequiresStorageNotLow(q61Var.f);
        boolean z3 = xm8Var.k > 0;
        boolean z4 = jMax > 0;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 && xm8Var.q && !z3 && !z4) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (str = xm8Var.x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        we4 we4VarF = we4.f();
        StringBuilder sbP = ua5.p("Scheduling work ID ", str2, " (");
        sbP.append(xm8Var.c);
        sbP.append("), Job ID ");
        sbP.append(i);
        String string = sbP.toString();
        String str3 = q;
        we4VarF.c(str3, string);
        try {
            if (this.n.schedule(jobInfoBuild) == 0) {
                we4.f().j(str3, "Unable to schedule work ID " + str2);
                if (xm8Var.q && xm8Var.r == jb5.m) {
                    xm8Var.q = false;
                    we4.f().c(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    g(xm8Var, i);
                }
            }
        } catch (IllegalStateException e) {
            String str4 = kp3.a;
            int i5 = Build.VERSION.SDK_INT;
            int i6 = i5 >= 31 ? 150 : 100;
            int size = ((List) au8.M(this.p.w().a, true, false, new yb8((byte) 12))).size();
            Context context = this.m;
            String strT0 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i5 >= 34) {
                JobScheduler jobSchedulerA = kp3.a(context);
                try {
                    allPendingJobs = jobSchedulerA.getAllPendingJobs();
                    allPendingJobs.getClass();
                } catch (Throwable th) {
                    we4.f().e(kp3.a, "getAllPendingJobs() is not reliable on this device.", th);
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayListE = e(context, jobSchedulerA);
                    int size2 = arrayListE != null ? allPendingJobs.size() - arrayListE.size() : 0;
                    String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList arrayListE2 = e(context, (JobScheduler) systemService);
                    int size3 = arrayListE2 != null ? arrayListE2.size() : 0;
                    strT0 = lv0.t0(cx.Q0(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListE3 = e(context, kp3.a(context));
                if (arrayListE3 != null) {
                    strT0 = arrayListE3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb = new StringBuilder("JobScheduler ");
            sb.append(i6);
            sb.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb.append(strT0);
            sb.append(".\nThere are ");
            String strL = to7.l(sb, size, " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.");
            we4.f().d(str3, strL);
            throw new IllegalStateException(strL, e);
        } catch (Throwable th2) {
            we4.f().e(str3, "Unable to schedule " + xm8Var, th2);
        }
    }
}
