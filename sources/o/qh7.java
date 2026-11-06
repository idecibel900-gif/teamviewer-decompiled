package o;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qh7 implements v75, se2 {
    public static final String v = we4.i("SystemFgDispatcher");
    public final nm8 m;
    public final yc4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f1833o = new Object();
    public km8 p;
    public final LinkedHashMap q;
    public final HashMap r;
    public final HashMap s;
    public final nm t;
    public SystemForegroundService u;

    public qh7(Context context) {
        nm8 nm8VarA = nm8.a(context);
        this.m = nm8VarA;
        this.n = nm8VarA.d;
        this.p = null;
        this.q = new LinkedHashMap();
        this.s = new HashMap();
        this.r = new HashMap();
        this.t = new nm(nm8VarA.j);
        nm8VarA.f.a(this);
    }

    public static Intent b(Context context, km8 km8Var, ts2 ts2Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", km8Var.a);
        intent.putExtra("KEY_GENERATION", km8Var.b);
        intent.putExtra("KEY_NOTIFICATION_ID", ts2Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ts2Var.b);
        intent.putExtra("KEY_NOTIFICATION", ts2Var.c);
        return intent;
    }

    @Override // o.v75
    public final void a(xm8 xm8Var, y61 y61Var) {
        if (y61Var instanceof x61) {
            String str = xm8Var.a;
            we4.f().c(v, "Constraints unmet for WorkSpec " + str);
            km8 km8VarJ = u47.j(xm8Var);
            int i = ((x61) y61Var).a;
            nm8 nm8Var = this.m;
            ((iq6) nm8Var.d.m).execute(new m90(nm8Var.f, new b97(km8VarJ), true, i));
        }
    }

    public final void c(Intent intent) {
        if (this.u == null) {
            hk0.l("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        km8 km8Var = new km8(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        we4.f().c(v, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            hk0.g("Notification passed in the intent was null.");
            return;
        }
        ts2 ts2Var = new ts2(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.q;
        linkedHashMap.put(km8Var, ts2Var);
        ts2 ts2Var2 = (ts2) linkedHashMap.get(this.p);
        if (ts2Var2 == null) {
            this.p = km8Var;
        } else {
            this.u.p.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((ts2) ((Map.Entry) it.next()).getValue()).b;
                }
                ts2Var = new ts2(ts2Var2.a, ts2Var2.c, i);
            } else {
                ts2Var = ts2Var2;
            }
        }
        SystemForegroundService systemForegroundService = this.u;
        int i2 = ts2Var.a;
        int i3 = ts2Var.b;
        Notification notification2 = ts2Var.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            eq.C(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            eq.B(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    public final void d() {
        this.u = null;
        synchronized (this.f1833o) {
            try {
                Iterator it = this.s.values().iterator();
                while (it.hasNext()) {
                    ((bp3) it.next()).j(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        dt5 dt5Var = this.m.f;
        synchronized (dt5Var.k) {
            dt5Var.j.remove(this);
        }
    }

    @Override // o.se2
    public final void e(km8 km8Var, boolean z) {
        Map.Entry entry;
        synchronized (this.f1833o) {
            try {
                bp3 bp3Var = ((xm8) this.r.remove(km8Var)) != null ? (bp3) this.s.remove(km8Var) : null;
                if (bp3Var != null) {
                    bp3Var.j(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ts2 ts2Var = (ts2) this.q.remove(km8Var);
        if (km8Var.equals(this.p)) {
            if (this.q.size() > 0) {
                Iterator it = this.q.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.p = (km8) entry.getKey();
                if (this.u != null) {
                    ts2 ts2Var2 = (ts2) entry.getValue();
                    SystemForegroundService systemForegroundService = this.u;
                    int i = ts2Var2.a;
                    int i2 = ts2Var2.b;
                    Notification notification = ts2Var2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        eq.C(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        eq.B(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.u.p.cancel(ts2Var2.a);
                }
            } else {
                this.p = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.u;
        if (ts2Var == null || systemForegroundService2 == null) {
            return;
        }
        we4.f().c(v, "Removing Notification (id: " + ts2Var.a + ", workSpecId: " + km8Var + ", notificationType: " + ts2Var.b);
        systemForegroundService2.p.cancel(ts2Var.a);
    }

    public final void f(int i, int i2) {
        we4.f().g(v, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.q.entrySet()) {
            if (((ts2) entry.getValue()).b == i2) {
                km8 km8Var = (km8) entry.getKey();
                nm8 nm8Var = this.m;
                ((iq6) nm8Var.d.m).execute(new m90(nm8Var.f, new b97(km8Var), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.u;
        if (systemForegroundService != null) {
            systemForegroundService.n = true;
            we4.f().c(SystemForegroundService.q, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i);
        }
    }
}
