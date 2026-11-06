package o;

import android.app.Service;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ip3 extends Service {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f1088o = new Object();
    public static final HashMap p = new HashMap();
    public gp3 m;
    public fp3 n;

    public static void a(RemoteControlApplication remoteControlApplication, Class cls, int i, Intent intent) {
        ComponentName componentName = new ComponentName(remoteControlApplication, (Class<?>) cls);
        synchronized (f1088o) {
            HashMap map = p;
            hp3 hp3Var = (hp3) map.get(componentName);
            if (hp3Var == null) {
                hp3Var = new hp3(remoteControlApplication, componentName, i);
                map.put(componentName, hp3Var);
            }
            hp3Var.a(i);
            hp3Var.d.enqueue(hp3Var.c, new JobWorkItem(intent));
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        gp3 gp3Var = this.m;
        if (gp3Var != null) {
            return gp3Var.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.m = new gp3(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
