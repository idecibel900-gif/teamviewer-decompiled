package o;

import android.app.Notification;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.SessionTimeoutService;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class xu6 extends TimerTask {
    public final /* synthetic */ byte m;
    public final /* synthetic */ SessionTimeoutService n;

    public /* synthetic */ xu6(SessionTimeoutService sessionTimeoutService, byte b) {
        this.m = b;
        this.n = sessionTimeoutService;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        byte b = this.m;
        SessionTimeoutService sessionTimeoutService = this.n;
        switch (b) {
            case 0:
                int i = SessionTimeoutService.v;
                zt6 zt6Var = (zt6) sessionTimeoutService.f81o;
                mo7 mo7Var = zt6Var.f;
                if (mo7Var != null) {
                    ye4.a("SessionTimeoutService", "Session timeout");
                    mo7Var.h(ys6.p);
                } else {
                    ye4.a("SessionTimeoutService", "Connection abort");
                    zt6Var.e(-1, i41.f1033o);
                }
                sessionTimeoutService.stopSelf();
                break;
            default:
                int i2 = SessionTimeoutService.v;
                String string = sessionTimeoutService.getString(R.string.tv_teamviewer);
                string.getClass();
                String string2 = sessionTimeoutService.getString(R.string.tv_notificationtext_1min_left);
                string2.getClass();
                String string3 = sessionTimeoutService.getString(R.string.tv_tickertext_1min_left);
                string3.getClass();
                s7 s7Var = u7.g;
                Notification notificationB = sessionTimeoutService.b(string, string2, string3, vn4.g0().e);
                if (notificationB != null) {
                    try {
                        sessionTimeoutService.startForeground(5, notificationB);
                    } catch (RuntimeException e) {
                        e41.s("Unable to show disconnect warning: ", e.getMessage(), "SessionTimeoutService");
                    }
                }
                ye4.a("SessionTimeoutService", "Schedule disconnection");
                xu6 xu6Var = new xu6(sessionTimeoutService, (byte) 0);
                sessionTimeoutService.n = xu6Var;
                sessionTimeoutService.m.schedule(xu6Var, 60000L);
                break;
        }
    }
}
