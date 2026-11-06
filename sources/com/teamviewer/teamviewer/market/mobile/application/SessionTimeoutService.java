package com.teamviewer.teamviewer.market.mobile.application;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Timer;
import java.util.TimerTask;
import o.au6;
import o.bt1;
import o.d82;
import o.e41;
import o.i41;
import o.im3;
import o.mo7;
import o.my0;
import o.ns;
import o.o55;
import o.s7;
import o.u7;
import o.vn4;
import o.wu6;
import o.xk7;
import o.xt6;
import o.xu6;
import o.ye4;
import o.ys6;
import o.zt6;

/* JADX INFO: loaded from: classes.dex */
public final class SessionTimeoutService extends Service {
    public static final long u;
    public static final /* synthetic */ int v = 0;
    public final Timer m = new Timer("Session Timeout");
    public TimerTask n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final xt6 f81o;
    public boolean p;
    public boolean q;
    public final Handler r;
    public final wu6 s;
    public final ns t;

    static {
        u = Build.VERSION.SDK_INT >= 34 ? 180000L : 600000L;
    }

    public SessionTimeoutService() {
        au6 au6Var = bt1.b;
        if (au6Var == null) {
            im3.e0("instance");
            throw null;
        }
        this.f81o = au6Var;
        this.r = new Handler(Looper.getMainLooper());
        this.s = new wu6(this, (byte) 0);
        this.t = new ns(this, (byte) 5);
    }

    public final Notification a(boolean z) {
        Class<?> cls;
        String string = getString(R.string.tv_teamviewer);
        string.getClass();
        String string2 = getString(R.string.tv_notificationtext_still_connected);
        string2.getClass();
        String string3 = getString(R.string.tv_tickertext_still_connected);
        string3.getClass();
        if (z) {
            s7 s7Var = u7.g;
            cls = vn4.g0().e;
        } else {
            s7 s7Var2 = u7.g;
            my0 my0Var = vn4.g0().b;
            cls = my0Var != null ? my0Var.getClass() : null;
        }
        return b(string, string2, string3, cls);
    }

    public final Notification b(String str, String str2, String str3, Class cls) {
        if (cls == null) {
            return null;
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) cls);
        intent.addFlags(805306368);
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        int i = Build.VERSION.SDK_INT >= 31 ? 335544320 : 268435456;
        Intent intent2 = new Intent("NOTIFICATION_DELETED_ACTION");
        intent2.setPackage(applicationContext.getPackageName());
        PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, 5, intent2, i);
        broadcast.getClass();
        o55 o55VarM = d82.m(applicationContext, str, str2, str3, R.drawable.tv_notification_icon, false, false, intent, 5, xk7.GENERAL_NOTIFICATION, false, false);
        o55VarM.v.deleteIntent = broadcast;
        Notification notificationB = o55VarM.b();
        notificationB.getClass();
        return notificationB;
    }

    public final void c(boolean z) {
        Notification notificationA = a(z);
        if (notificationA != null) {
            try {
                startForeground(5, notificationA);
            } catch (RuntimeException e) {
                e41.s("Unable to show connection notification: ", e.getMessage(), "SessionTimeoutService");
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ye4.a.b("SessionTimeoutService", "Stopping");
        TimerTask timerTask = this.n;
        if (timerTask != null) {
            ye4.a("SessionTimeoutService", "Cancel disconnect timer");
            timerTask.cancel();
        }
        this.n = null;
        if (Build.VERSION.SDK_INT >= 33 && this.q) {
            unregisterReceiver(this.t);
            this.r.removeCallbacks(this.s);
        }
        stopForeground(1);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("START_TIMEOUT_COUNTDOWN_KEY", false) : false;
        this.p = booleanExtra;
        byte b = 1;
        if (booleanExtra) {
            ye4.a("SessionTimeoutService", "Schedule disconnection warning");
            xu6 xu6Var = new xu6(this, b);
            this.n = xu6Var;
            this.m.schedule(xu6Var, u - 60000);
        } else {
            TimerTask timerTask = this.n;
            if (timerTask != null) {
                ye4.a("SessionTimeoutService", "Cancel disconnect timer");
                timerTask.cancel();
            }
            this.n = null;
        }
        c(this.p);
        if (Build.VERSION.SDK_INT < 33) {
            return 2;
        }
        registerReceiver(this.t, new IntentFilter("NOTIFICATION_DELETED_ACTION"), 4);
        this.q = true;
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        ye4.a.b("SessionTimeoutService", "Task removed");
        stopSelf();
        zt6 zt6Var = (zt6) this.f81o;
        mo7 mo7Var = zt6Var.f;
        if (mo7Var != null) {
            ye4.a("SessionTimeoutService", "End session by user");
            mo7Var.h(ys6.n);
        } else {
            ye4.a("SessionTimeoutService", "Connection abort");
            zt6Var.e(-1, i41.f1033o);
        }
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        super.onTimeout(i);
        stopForeground(1);
        if (this.p) {
            return;
        }
        c(false);
    }
}
