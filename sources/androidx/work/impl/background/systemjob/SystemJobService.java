package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
import o.b97;
import o.dq;
import o.dt5;
import o.fx3;
import o.hk0;
import o.km8;
import o.lh7;
import o.nh;
import o.nm8;
import o.og1;
import o.se2;
import o.we4;
import o.yy5;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements se2 {
    public static final String q = we4.i("SystemJobService");
    public nm8 m;
    public final HashMap n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final og1 f28o = new og1((byte) 6);
    public lh7 p;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        hk0.l(fx3.g("Cannot invoke ", str, " on a background thread"));
    }

    public static km8 b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new km8(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // o.se2
    public final void e(km8 km8Var, boolean z) {
        a("onExecuted");
        JobParameters jobParameters = (JobParameters) this.n.remove(km8Var);
        this.f28o.f(km8Var);
        if (jobParameters != null) {
            we4.f().c(q, km8Var.a + " executed on JobScheduler");
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            nm8 nm8VarA = nm8.a(getApplicationContext());
            this.m = nm8VarA;
            dt5 dt5Var = nm8VarA.f;
            this.p = new lh7(dt5Var, nm8VarA.d);
            dt5Var.a(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            we4.f().j(q, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        nm8 nm8Var = this.m;
        if (nm8Var != null) {
            dt5 dt5Var = nm8Var.f;
            synchronized (dt5Var.k) {
                dt5Var.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        nm8 nm8Var = this.m;
        String str = q;
        if (nm8Var == null) {
            we4.f().c(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        km8 km8VarB = b(jobParameters);
        if (km8VarB == null) {
            we4.f().d(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.n;
        if (map.containsKey(km8VarB)) {
            we4.f().c(str, "Job is already being executed by SystemJobService: " + km8VarB);
            return false;
        }
        we4.f().c(str, "onStartJob for " + km8VarB);
        map.put(km8VarB, jobParameters);
        yy5 yy5Var = new yy5();
        if (jobParameters.getTriggeredContentUris() != null) {
            yy5Var.b = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            yy5Var.a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            dq.i(jobParameters);
        }
        this.p.B(this.f28o.h(km8VarB), yy5Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.m == null) {
            we4.f().c(q, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        km8 km8VarB = b(jobParameters);
        if (km8VarB == null) {
            we4.f().d(q, "WorkSpec id not found!");
            return false;
        }
        we4.f().c(q, "onStopJob for " + km8VarB);
        this.n.remove(km8VarB);
        b97 b97VarF = this.f28o.f(km8VarB);
        if (b97VarF != null) {
            int iE = Build.VERSION.SDK_INT >= 31 ? nh.e(jobParameters) : -512;
            lh7 lh7Var = this.p;
            lh7Var.getClass();
            lh7Var.C(b97VarF, iE);
        }
        dt5 dt5Var = this.m.f;
        String str = km8VarB.a;
        synchronized (dt5Var.k) {
            zContains = dt5Var.i.contains(str);
        }
        return !zContains;
    }
}
