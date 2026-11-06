package o;

import android.content.Context;
import android.content.Intent;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class zt6 implements xt6, ea3 {
    public volatile ps6 d;
    public mo7 f;
    public Intent h;
    public Context i;
    public boolean j;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicInteger c = new AtomicInteger(2);
    public final qx0 e = pm8.e();
    public final kd g = new kd(this);
    public final HashSet k = new HashSet();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final nm n = new nm((byte) 4);

    public zt6() {
        ye4.a("SessionManager", "starting session manager");
    }

    public final void a() {
        EventHub.e(EventHub.e.f(), EventType.EVENT_SESSION_SHUTDOWN);
        kd kdVar = this.g;
        if (kdVar != null) {
            kdVar.sendEmptyMessage(0);
        }
        bu7.MAIN.a(new ed((byte) 6));
    }

    public final ArrayList b() {
        ArrayList arrayList;
        synchronized (this.l) {
            arrayList = new ArrayList(this.l);
        }
        return arrayList;
    }

    public final void c() {
        if (this.j) {
            this.j = false;
            Context context = this.i;
            if (context != null) {
                context.startActivity(this.h);
            }
        }
    }

    public final void d(u2 u2Var) {
        synchronized (this.l) {
            this.l.add(u2Var);
        }
    }

    public final synchronized void e(int i, i41 i41Var) {
        f(i, i41Var, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0112 A[Catch: all -> 0x001e, LOOP:0: B:28:0x010c->B:30:0x0112, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0003, B:5:0x0008, B:6:0x000b, B:9:0x0021, B:11:0x0039, B:12:0x0048, B:13:0x0051, B:14:0x005f, B:15:0x006d, B:16:0x007e, B:17:0x008f, B:19:0x0098, B:20:0x00a3, B:21:0x00ac, B:22:0x00bc, B:23:0x00cc, B:24:0x00d5, B:25:0x00e7, B:26:0x00f7, B:27:0x0106, B:28:0x010c, B:30:0x0112), top: B:36:0x0003 }] */
    public synchronized void f(int i, i41 i41Var, eb7 eb7Var) {
        Iterator it;
        try {
            switch (i41Var.ordinal()) {
                case 1:
                    ye4.c("SessionManager", "connection pending");
                    this.a.set(false);
                    a();
                    it = this.m.iterator();
                    while (it.hasNext()) {
                        ((j41) it.next()).a(i41Var, eb7Var);
                    }
                    break;
                case 2:
                    ye4.c("SessionManager", "invalid input");
                    this.a.set(false);
                    a();
                    it = this.m.iterator();
                    while (it.hasNext()) {
                        ((j41) it.next()).a(i41Var, eb7Var);
                    }
                    break;
                case 3:
                    ye4.a.g("SessionManager", "connection aborted");
                    this.a.set(false);
                    a();
                    it = this.m.iterator();
                    while (it.hasNext()) {
                        ((j41) it.next()).a(i41Var, eb7Var);
                    }
                    break;
                case 4:
                case 6:
                case ep1.c /* 10 */:
                case 20:
                    it = this.m.iterator();
                    while (it.hasNext()) {
                        ((j41) it.next()).a(i41Var, eb7Var);
                    }
                    break;
                case 5:
                    this.a.set(false);
                    a();
                    it = this.m.iterator();
                    while (it.hasNext()) {
                        ((j41) it.next()).a(i41Var, eb7Var);
                    }
                    break;
                case 7:
                case 15:
                case 17:
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                default:
                    ye4.c("SessionManager", "unknown connection event: " + i41Var);
                    it = this.m.iterator();
                    while (it.hasNext()) {
                        ((j41) it.next()).a(i41Var, eb7Var);
                    }
                    break;
                case 8:
                    ye4.c("SessionManager", "unsupported connection type");
                    this.a.set(false);
                    a();
                    it = this.m.iterator();
                    while (it.hasNext()) {
                        ((j41) it.next()).a(i41Var, eb7Var);
                    }
                    break;
                case ep1.b /* 9 */:
                    ye4.c("SessionManager", "required license is missing");
                    this.a.set(false);
                    a();
                    it = this.m.iterator();
                    while (it.hasNext()) {
                        ((j41) it.next()).a(i41Var, eb7Var);
                    }
                    break;
                case 11:
                    if (!this.a.compareAndSet(true, false)) {
                        ye4.c("SessionManager", "connection barrier as reached in wrong state!");
                    } else {
                        ye4.a("SessionManager", "! connection barrier as passed !");
                        g(true);
                        it = this.m.iterator();
                        while (it.hasNext()) {
                            ((j41) it.next()).a(i41Var, eb7Var);
                        }
                    }
                    break;
                case ep1.d /* 12 */:
                    ye4.c("SessionManager", "authentication failed");
                    this.a.set(false);
                    a();
                    it = this.m.iterator();
                    while (it.hasNext()) {
                        ((j41) it.next()).a(i41Var, eb7Var);
                    }
                    break;
                case 13:
                    ye4.c("SessionManager", "authentication denied");
                    this.a.set(false);
                    a();
                    it = this.m.iterator();
                    while (it.hasNext()) {
                        ((j41) it.next()).a(i41Var, eb7Var);
                    }
                    break;
                case 14:
                    ye4.a("SessionManager", "! connection barrier ddrs passed !");
                    this.a.set(false);
                    it = this.m.iterator();
                    while (it.hasNext()) {
                        ((j41) it.next()).a(i41Var, eb7Var);
                    }
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    ye4.a("SessionManager", "connection activity closed");
                    this.a.set(false);
                    it = this.m.iterator();
                    while (it.hasNext()) {
                        ((j41) it.next()).a(i41Var, eb7Var);
                    }
                    break;
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    ye4.a("SessionManager", "!end session!");
                    this.a.set(false);
                    HashSet hashSet = this.k;
                    if (!hashSet.contains(Integer.valueOf(i))) {
                        hashSet.add(Integer.valueOf(i));
                        a();
                        g(false);
                    } else {
                        ye4.a("SessionManager", "session already terminating - skipping event");
                    }
                    break;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void g(boolean z) {
        if (!this.b.compareAndSet(!z, z)) {
            ye4.a("SessionManager", "session is not re-set");
            return;
        }
        ye4.a("SessionManager", "set session is running: " + z);
    }
}
