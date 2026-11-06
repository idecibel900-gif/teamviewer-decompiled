package o;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.AsyncTask;

/* JADX INFO: loaded from: classes.dex */
public final class gp3 extends JobServiceEngine {
    public final ip3 a;
    public final Object b;
    public JobParameters c;

    public gp3(ip3 ip3Var) {
        super(ip3Var);
        this.b = new Object();
        this.a = ip3Var;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.c = jobParameters;
        ip3 ip3Var = this.a;
        if (ip3Var.n != null) {
            return true;
        }
        fp3 fp3Var = new fp3(ip3Var);
        ip3Var.n = fp3Var;
        fp3Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        fp3 fp3Var = this.a.n;
        if (fp3Var != null) {
            fp3Var.cancel(false);
        }
        synchronized (this.b) {
            this.c = null;
        }
        return true;
    }
}
