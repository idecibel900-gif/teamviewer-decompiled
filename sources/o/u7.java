package o;

import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;

/* JADX INFO: loaded from: classes.dex */
public final class u7 implements o93 {
    public static final s7 g = new s7();
    public static u7 h = new u7();
    public static int i;
    public final EventHub a;
    public my0 b;
    public MainActivity c;
    public xt2 d;
    public Class e;
    public final t7 f;

    public u7() {
        EventHub eventHubF = EventHub.e.f();
        this.a = eventHubF;
        t7 t7Var = new t7(this, (byte) 0);
        this.f = t7Var;
        if (eventHubF.c(EventType.EVENT_SESSION_SHUTDOWN, t7Var)) {
            return;
        }
        ye4.c("ActivityManager", "Could not register session shutdown listener!");
    }

    public static void d(ut2 ut2Var) {
        ye4.a("ActivityManager", "fragmentStarted ".concat(ut2Var.getClass().getName()));
    }

    public static void e(ut2 ut2Var) {
        ye4.a("ActivityManager", "fragmentStopped ".concat(ut2Var.getClass().getName()));
    }

    public final void a(my0 my0Var) {
        ye4.a("ActivityManager", "activityResumed " + my0Var);
        this.b = my0Var;
    }

    public final void b(my0 my0Var) {
        s7 s7Var = g;
        if (s7Var.m) {
            s7Var.m = false;
        } else {
            i++;
            ye4.a("ActivityManager", "activityStarted " + my0Var);
            if (this.b == null) {
                ye4.a.b("ActivityManager", "TV activity started");
                EventHub.e(this.a, EventType.EVENT_TEAMVIEWER_UI_STARTED);
            }
        }
        this.b = my0Var;
    }

    public final void c(my0 my0Var) {
        if (my0Var.equals(this.d)) {
            int i2 = i;
        }
        if (my0Var.isChangingConfigurations()) {
            g.m = true;
            return;
        }
        i--;
        ye4.a("ActivityManager", "activityStopped " + my0Var);
        this.e = my0Var.getClass();
        ye4.a("ActivityManager", "activityStopped: isFinishing: " + my0Var.isFinishing());
        if (i == 0) {
            ye4.a.b("ActivityManager", "TV stopped");
            this.b = null;
            EventHub.e(this.a, EventType.EVENT_TEAMVIEWER_UI_CLOSED);
        }
    }
}
