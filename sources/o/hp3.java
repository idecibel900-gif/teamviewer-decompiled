package o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;

/* JADX INFO: loaded from: classes.dex */
public final class hp3 {
    public boolean a;
    public short b;
    public final JobInfo c;
    public final JobScheduler d;

    public hp3(RemoteControlApplication remoteControlApplication, ComponentName componentName, int i) {
        a(i);
        this.c = new JobInfo.Builder(i, componentName).setOverrideDeadline(0L).build();
        this.d = (JobScheduler) remoteControlApplication.getApplicationContext().getSystemService("jobscheduler");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        if (!this.a) {
            this.a = true;
            this.b = i;
        } else {
            if (this.b == i) {
                return;
            }
            StringBuilder sbK = fx3.k(i, "Given job ID ", " is different than previous ");
            sbK.append((int) this.b);
            throw new IllegalArgumentException(sbK.toString());
        }
    }
}
