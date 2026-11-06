package o;

import android.app.ActivityManager;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class fp4 extends TimerTask {
    public final /* synthetic */ io.sentry.android.core.n1 m;

    public fp4(io.sentry.android.core.n1 n1Var) {
        this.m = n1Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        io.sentry.android.core.n1 n1Var = this.m;
        ((ActivityManager) n1Var.p).getMemoryInfo(memoryInfo);
        if (memoryInfo.lowMemory) {
            ye4.a("Memory Info ", "Low memory event triggered");
            n1Var.k();
            EventHub.e(EventHub.e.f(), EventType.EVENT_LOW_ON_MEMORY);
        }
    }
}
