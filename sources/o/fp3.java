package o;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.os.AsyncTask;

/* JADX INFO: loaded from: classes.dex */
public final class fp3 extends AsyncTask {
    public final /* synthetic */ ip3 a;

    public fp3(ip3 ip3Var) {
        this.a = ip3Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:18:0x0047, B:20:0x004f, B:23:0x0059), top: B:32:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        yt2 yt2Var;
        JobParameters jobParameters;
        while (true) {
            ip3 ip3Var = this.a;
            ip3Var.m.getClass();
            gp3 gp3Var = ip3Var.m;
            synchronized (gp3Var.b) {
                try {
                    JobParameters jobParameters2 = gp3Var.c;
                    if (jobParameters2 != null) {
                        JobWorkItem jobWorkItemDequeueWork = jobParameters2.dequeueWork();
                        if (jobWorkItemDequeueWork != null) {
                            jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(gp3Var.a.getClassLoader());
                            yt2Var = new yt2(gp3Var, jobWorkItemDequeueWork);
                        }
                        if (yt2Var != null) {
                            return null;
                        }
                        this.a.b(((JobWorkItem) yt2Var.n).getIntent());
                        synchronized (((gp3) yt2Var.f2642o).b) {
                            try {
                                jobParameters = ((gp3) yt2Var.f2642o).c;
                                if (jobParameters != null) {
                                    jobParameters.completeWork((JobWorkItem) yt2Var.n);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            yt2Var = null;
            if (yt2Var != null) {
                return null;
            }
            this.a.b(((JobWorkItem) yt2Var.n).getIntent());
            synchronized (((gp3) yt2Var.f2642o).b) {
                jobParameters = ((gp3) yt2Var.f2642o).c;
                if (jobParameters != null) {
                    jobParameters.completeWork((JobWorkItem) yt2Var.n);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
    }
}
