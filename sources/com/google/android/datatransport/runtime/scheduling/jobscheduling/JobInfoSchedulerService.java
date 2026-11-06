package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import java.util.concurrent.Executor;
import o.be3;
import o.fp1;
import o.iu;
import o.j28;
import o.s98;
import o.u00;
import o.us5;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int m = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        j28.b(getApplicationContext());
        iu iuVarA = u00.a();
        iuVarA.O(string);
        iuVarA.n = us5.b(i);
        if (string2 != null) {
            iuVarA.p = Base64.decode(string2, 0);
        }
        fp1 fp1Var = j28.a().d;
        ((Executor) fp1Var.e).execute(new s98(fp1Var, iuVarA.f(), i2, new be3(this, jobParameters, (byte) 1)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
