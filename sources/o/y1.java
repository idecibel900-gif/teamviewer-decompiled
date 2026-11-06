package o;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.network.NativeNetwork;
import com.teamviewer.teamviewerlib.swig.tvnetwork.EOnlineState;
import com.teamviewer.teamviewerlib.swig.tvnetwork.INetworkControl;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;

/* JADX INFO: loaded from: classes.dex */
public abstract class y1 extends Service {
    public boolean m;
    public PendingIntent n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Notification f2569o;

    public final void a() {
        if (xh2.a) {
            return;
        }
        ye4.a("NetworkService", "Start heartbeat.");
        if (this.n == null) {
            Intent intent = new Intent(this, getClass());
            intent.putExtra("com.teamviewer.teamviewer.extra.NETWORK_HEARTBEAT", true);
            if (this.f2569o != null) {
                intent.putExtra("com.teamviewer.teamviewer.extra.NETWORK_FOREGROUND", true);
                intent.putExtra("com.teamviewer.teamviewer.extra.NETWORK_NOTIFICATION", this.f2569o);
            }
            this.n = PendingIntent.getService(this, 0, intent, Build.VERSION.SDK_INT >= 31 ? 201326592 : 134217728);
        }
        if (xh2.a) {
            return;
        }
        Object systemService = getSystemService("alarm");
        systemService.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() + 54000;
        PendingIntent pendingIntent = this.n;
        pendingIntent.getClass();
        ((AlarmManager) systemService).setWindow(0, jCurrentTimeMillis, 1000L, pendingIntent);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        if (this.n != null) {
            ye4.a("NetworkService", "Stop heartbeat.");
            Object systemService = getSystemService("alarm");
            systemService.getClass();
            PendingIntent pendingIntent = this.n;
            pendingIntent.getClass();
            ((AlarmManager) systemService).cancel(pendingIntent);
            this.n = null;
        }
        boolean z = this.m;
        ye4 ye4Var = ye4.a;
        if (z) {
            this.m = false;
            ye4.a("NetworkService", "Stop network.");
            l25.d();
            ye4Var.b("Network", "Stop network");
            INetworkControl iNetworkControl = NativeNetwork.b;
            if (iNetworkControl != null) {
                iNetworkControl.Offline(EOnlineState.Offline);
            } else {
                ye4.a("NativeNetwork", "stop(): NetworkControl not initialized");
            }
        } else {
            ye4Var.g("NetworkService", "stopNetwork - already stopped");
        }
        stopForeground(1);
        ye4.a("NetworkService", "Service was terminated successfully.");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean booleanExtra = false;
        if (intent != null) {
            this.f2569o = (Notification) bt1.C(intent, "com.teamviewer.teamviewer.extra.NETWORK_NOTIFICATION", Notification.class);
            booleanExtra = intent.getBooleanExtra("com.teamviewer.teamviewer.extra.NETWORK_FOREGROUND", false);
        } else {
            this.f2569o = null;
        }
        try {
            if (booleanExtra) {
                Notification notification = this.f2569o;
                notification.getClass();
                startForeground(8, notification);
            } else {
                stopForeground(1);
            }
        } catch (Exception e) {
            e41.s("Starting Foreground service failed with exception: ", e.getMessage(), "NetworkService");
        }
        ye4.a("NetworkService", "Starting network.");
        boolean z = this.m;
        ye4 ye4Var = ye4.a;
        if (!z) {
            ye4.a("NetworkService", "Start network.");
            kh7 kh7Var = l25.a;
            ye4Var.b("Network", "Start network");
            INetworkControl iNetworkControl = NativeNetwork.b;
            if (iNetworkControl != null) {
                iNetworkControl.Online();
            } else {
                ye4.a("NativeNetwork", "start(): NetworkControl not initialized");
            }
            l25.c();
            this.m = true;
        }
        a();
        if (xh2.a) {
            ye4Var.g("NetworkService", "Heartbeat not used");
            return 2;
        }
        ye4.a("NetworkService", "Using heartbeat");
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        intent.getClass();
        super.onTaskRemoved(intent);
        ye4.a("NetworkService", "Task removed, scheduling network restart.");
        a();
        EventHub.e(EventHub.e.f(), EventType.EVENT_APP_TASK_REMOVED);
    }
}
