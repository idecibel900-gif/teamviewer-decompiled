package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import java.util.UUID;
import o.aw;
import o.ep3;
import o.iq6;
import o.it8;
import o.l84;
import o.nm8;
import o.qh7;
import o.we4;
import o.x8;
import o.x84;
import o.yo1;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends Service implements LifecycleOwner {
    public static final String q = we4.i("SystemFgService");
    public final ep3 m = new ep3(this);
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public qh7 f29o;
    public NotificationManager p;

    public final void a() {
        this.p = (NotificationManager) getApplicationContext().getSystemService("notification");
        qh7 qh7Var = new qh7(getApplicationContext());
        this.f29o = qh7Var;
        if (qh7Var.u != null) {
            we4.f().d(qh7.v, "A callback already exists.");
        } else {
            qh7Var.u = this;
        }
    }

    public final void e() {
        ep3 ep3Var = this.m;
        ep3Var.getClass();
        ep3Var.z(l84.ON_CREATE);
        super.onCreate();
    }

    public final void f() {
        ep3 ep3Var = this.m;
        ep3Var.getClass();
        ep3Var.z(l84.ON_STOP);
        ep3Var.z(l84.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        ep3 ep3Var = this.m;
        ep3Var.getClass();
        ep3Var.z(l84.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        e();
        a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        f();
        this.f29o.d();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        ep3 ep3Var = this.m;
        ep3Var.getClass();
        ep3Var.z(l84.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.n;
        boolean z2 = false;
        String str = q;
        if (z) {
            we4.f().g(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f29o.d();
            a();
            this.n = false;
        }
        if (intent == null) {
            return 3;
        }
        qh7 qh7Var = this.f29o;
        qh7Var.getClass();
        String str2 = qh7.v;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            we4.f().g(str2, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            ((iq6) qh7Var.n.m).execute(new it8((byte) 19, qh7Var, stringExtra, z2));
            qh7Var.c(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            qh7Var.c(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            we4.f().g(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = qh7Var.u;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.n = true;
            we4.f().c(str, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        we4.f().g(str2, "Stopping foreground work for " + intent);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        nm8 nm8Var = qh7Var.m;
        UUID uuidFromString = UUID.fromString(stringExtra2);
        nm8Var.getClass();
        uuidFromString.getClass();
        aw awVar = (aw) nm8Var.b.r;
        iq6 iq6Var = (iq6) nm8Var.d.m;
        iq6Var.getClass();
        yo1.I(awVar, "CancelWorkById", iq6Var, new x8(nm8Var, uuidFromString, (byte) 16));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f29o.f(i, 2048);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* JADX INFO: renamed from: z */
    public final x84 getR() {
        return (x84) this.m.n;
    }

    public final void onTimeout(int i, int i2) {
        this.f29o.f(i, i2);
    }
}
